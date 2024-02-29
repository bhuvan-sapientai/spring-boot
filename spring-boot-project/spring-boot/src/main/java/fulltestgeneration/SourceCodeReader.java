package fulltestgeneration;

import lombok.extern.slf4j.Slf4j;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Slf4j
public class SourceCodeReader {

    private final TestConfiguration testConfiguration;

    public SourceCodeReader(TestConfiguration testConfiguration) {
        this.testConfiguration = testConfiguration;
    }

    public String getSourceCode(Class<?> clazz, int level, Set<String> enumClassAdded, Method publicMethodName) {
        String sourceCode;
        if (publicMethodName != null) {
            SourceCodeModifier sourceCodeModifier = new SourceCodeModifier();
            try {
                sourceCode = sourceCodeModifier.modifySourceCode(testConfiguration.filePath(), publicMethodName);
            } catch (IOException e) {
                //log.error("Failed to read specific method code");
                return "";
            }
        } else {
            sourceCode = readSourceCodeFromFile(clazz);
        }
        if (clazz.isEnum()) {
            return sourceCode;
        }
        if (sourceCode != null) {
            sourceCode += processSuperClass(clazz, level, enumClassAdded);
            sourceCode += processEnumClasses(clazz, enumClassAdded);
            return sourceCode;
        }
        return null;
    }

    private String readSourceCodeFromFile(Class<?> clazz) {
        String relativeFilePath = clazz.getName().replace('.', '/') + ".java";
        String filePath = testConfiguration.prefixPath() + relativeFilePath;
        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            return stringBuilder.toString();
        } catch (IOException e) {
            //log.error("Failed to get Source code for :" + filePath);
        }
        return null;
    }

    private String processSuperClass(Class<?> clazz, int level, Set<String> enumClassAdded) {
        if (++level > 1) {
            return "";
        }
        Class<?> superClass = clazz.getSuperclass();
        if (superClass != null && !superClass.equals(Object.class)) {
            return "\n// Super Class code:\n" + getSourceCodeWithoutImports(superClass, level, enumClassAdded);
        }
        return "";
    }

    private String processEnumClasses(Class<?> clazz, Set<String> enumClassAdded) {
        enumClassAdded.add(clazz.getName());
        StringBuilder result = new StringBuilder();
        processExecutableParams(clazz.getMethods(), result, enumClassAdded);
        processExecutableParams(clazz.getConstructors(), result, enumClassAdded);
        return result.isEmpty() ? "" : "\n// ENUM code:\n" + result;
    }

    private void processExecutableParams(Executable[] executables, StringBuilder result, Set<String> enumClassAdded) {
        for (Executable executable : executables) {
            Class<?>[] paramTypes = executable.getParameterTypes();
            for (Class<?> paramType : paramTypes) {
                if (paramType.isEnum() && !enumClassAdded.contains(paramType.getName())) {
                    enumClassAdded.add(paramType.getName());
                    result.append(getSourceCodeWithoutImports(paramType, 0, enumClassAdded)).append("\n");
                }
            }
        }
    }



    private String getSourceCodeWithoutImports(Class<?> clazz, int level, Set<String> enumClassAdded) {
        String sourceCode = getSourceCode(clazz, level, enumClassAdded, null);
        if (sourceCode != null) {
            Pattern importPattern = Pattern.compile("^\\s*import\\s+.*;\\s*$", Pattern.MULTILINE);
            Matcher matcher = importPattern.matcher(sourceCode);
            sourceCode = matcher.replaceAll("");
            return sourceCode;
        }
        return "";
    }
}
