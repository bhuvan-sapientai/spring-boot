package fulltestgeneration;

import lombok.extern.slf4j.Slf4j;


import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;


@Slf4j
public class TestGenerator {

    TestConfiguration testConfiguration;
    public static int times = 0;


    public TestGenerator(TestConfiguration testConfiguration) {
        this.testConfiguration = testConfiguration;
    }

    public static boolean isAbstract(Class<?> clazz) {
        return (clazz.getModifiers() & Modifier.ABSTRACT) != 0;
    }

    public static List<Method> getPublicMethodNames(Class<?> clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        List<Method> publicMethodNames = new ArrayList<>();

        for (Method method : methods) {
            boolean isFactoryMethod = Modifier.isStatic(method.getModifiers()) && method.getReturnType().equals(clazz);

            if (Modifier.isPublic(method.getModifiers()) && !isFactoryMethod) {
                publicMethodNames.add(method);
            }
        }
        return publicMethodNames;
    }

    public void generateTestsForPackage(String packageToTest) {
        ClassFinder classFinder = new ClassFinder();
        List<Class<?>> classesList = classFinder.findClassesInPackage(packageToTest);

        for (Class<?> clazz : classesList) {
            if (!clazz.isInterface() && !isAbstract(clazz)) {
                generateUnitTestForClass(clazz);
            }
        }
    }

    public void generateTestsForFile(String fileName) {
        ClassFinder classFinder = new ClassFinder();
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        List<Class<?>> classesList = Collections.singletonList(classFinder.loadClass(classLoader, fileName));

        for (Class<?> clazz : classesList) {
            if (!clazz.isInterface() && !isAbstract(clazz)) {
                generateUnitTestForClass(clazz);
            }
        }
    }


    private void generateUnitTestForClass(Class<?> clazz) {
        String className = clazz.getSimpleName();
        SourceCodeReader sourceCodeReader = new SourceCodeReader(testConfiguration);
        List<Method> publicMethods = getPublicMethodNames(clazz);
        for (Method publicMethod : publicMethods) {
            String sourceCode = sourceCodeReader.getSourceCode(clazz, 0, new HashSet<>(), publicMethod);

            if (sourceCode != null && publicMethod != null) {

                PromptGenerator promptGenerator = new PromptGenerator(
                    sourceCode,
                    testConfiguration.pathToSaveFile(),
                    testConfiguration.generatedTestFilePackage(),
                    className,
                    clazz.getName(),
                    publicMethods,
                    publicMethod.getName());
                promptGenerator.generateUnitTest(publicMethod.getName());
            }
        }
    }

}

