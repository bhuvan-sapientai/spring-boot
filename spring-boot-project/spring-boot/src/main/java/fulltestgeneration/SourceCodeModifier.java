package fulltestgeneration;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SourceCodeModifier {

    public String modifySourceCode(String sourceFilePath, Method publicMethodName) throws IOException {
        Path path = Paths.get(sourceFilePath);
        JavaParser javaParser = new JavaParser();
        CompilationUnit cu = javaParser.parse(path).getResult().orElseThrow(() -> new IOException("Error parsing the file"));

        Set<String> usedMethodNames = collectUsedMethodNames(cu, publicMethodName);
        removeUnusedMethods(cu, usedMethodNames, publicMethodName);

        consolidateImports(cu);
        return cu.toString();
    }

    private Set<String> collectUsedMethodNames(CompilationUnit cu, Method publicMethodName) {
        Set<String> usedMethodNames = new HashSet<>();
        new VoidVisitorAdapter<Void>() {
            @Override
            public void visit(MethodDeclaration n, Void arg) {
                if (n.getNameAsString().equals(publicMethodName.getName())) {
                    n.getBody().ifPresent(body -> usedMethodNames.addAll(
                        body.findAll(MethodCallExpr.class).stream()
                            .map(MethodCallExpr::getNameAsString)
                            .collect(Collectors.toSet())
                    ));
                }
                super.visit(n, arg);
            }
        }.visit(cu, null);
        return usedMethodNames;
    }

    private void removeUnusedMethods(CompilationUnit cu, Set<String> usedMethodNames, Method publicMethodName) {
        List<ClassOrInterfaceDeclaration> classDecls = cu.findAll(ClassOrInterfaceDeclaration.class);
        for (ClassOrInterfaceDeclaration classDecl : classDecls) {
            List<MethodDeclaration> methodsToCheck = classDecl.getMethods();

            methodsToCheck.forEach(method -> {
                boolean isPublicMethodToRemove = method.isPublic() && isPublicMethodToRemove(method, publicMethodName);
                boolean isUnusedNonPublicMethod = !method.isPublic() && !usedMethodNames.contains(method.getNameAsString());

                if (isPublicMethodToRemove || isUnusedNonPublicMethod) {
                    classDecl.remove(method);
                }
            });
        }
    }

    private void consolidateImports(CompilationUnit cu) {
        // Map to hold package names and their associated imports
        Map<String, List<ImportDeclaration>> importsMap = new HashMap<>();
        for (ImportDeclaration imp : cu.getImports()) {
            String packageName = imp.getName().asString().substring(0, imp.getName().asString().lastIndexOf('.'));
            importsMap.computeIfAbsent(packageName, k -> new ArrayList<>()).add(imp);
        }

        // Remove all current imports
        cu.getImports().clear();

        // Add back consolidated imports
        importsMap.forEach((packageName, imports) -> {
            if (imports.size() > 1) { // More than one import from the same package, consolidate
                cu.addImport(packageName + ".*");
            } else { // Single import, add it back as it was
                imports.forEach(cu::addImport);
            }
        });
    }

    private static boolean isPublicMethodToRemove(MethodDeclaration methodDecl, Method publicMethod) {

        if (!methodDecl.getNameAsString().equals(publicMethod.getName())) {
            return true;
        }

        // Get parameter types for the MethodDeclaration
        List<String> methodDeclParamTypes = methodDecl.getParameters().stream()
            .map(param -> param.getType().asString())
            .toList();


        Class<?>[] publicMethodParamTypes = publicMethod.getParameterTypes();


        if (methodDeclParamTypes.size() != publicMethodParamTypes.length) {
            return true;
        }


        for (int i = 0; i < methodDeclParamTypes.size(); i++) {
            Class<?> publicMethodParamType = publicMethodParamTypes[i];
            String methodDeclParamType = methodDeclParamTypes.get(i); // This includes generics information as a string

            if (publicMethodParamType.isArray()) {
                Class<?> componentType = publicMethodParamType.getComponentType();
                String componentTypeName = componentType.getSimpleName();
                String adjustedMethodDeclParamType = methodDeclParamType.replaceAll("\\[\\]", "");

                if (!adjustedMethodDeclParamType.equals(componentTypeName)) {
                    return true;
                }
            } else {
                String publicMethodParamTypeName = publicMethodParamType.getSimpleName();

                if (methodDeclParamType.contains("<") && methodDeclParamType.contains(">")) {
                    String rawType = methodDeclParamType.substring(0, methodDeclParamType.indexOf('<'));
                    if (!publicMethodParamTypeName.equals(rawType)) {
                        return true;
                    }
                } else {
                    if (!methodDeclParamType.equals(publicMethodParamTypeName)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

}

