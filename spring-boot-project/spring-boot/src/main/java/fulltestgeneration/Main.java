package fulltestgeneration;

public class Main {
    public static void main(String[] args) {
        String prefixPath = "/Users/bhuvan/spring-boot/spring-boot-project/spring-boot/core/src/main/java/";
        String packageToTest = "org.springframework.boot.context";
        String pathToSaveFile = "/Users/bhuvan/spring-boot/spring-boot-project/spring-boot/src/test/java/org/springframework/boot/llmgeneratedtest";
        String generatedTestFilePackage = "org.springframework.boot.llmgeneratedtest";
        String filePath = "/Users/bhuvan/spring-boot/spring-boot-project/spring-boot/core/src/main/java/org/springframework/boot/ConfigurationWarningsApplicationContextInitializer.java";
        TestConfiguration testConfiguration = new TestConfiguration(prefixPath, generatedTestFilePackage, pathToSaveFile, filePath);
        TestGenerator testGenerator = new TestGenerator(testConfiguration);
        //testGenerator.generateTestsForPackage(packageToTest);
        testGenerator.generateTestsForFile("org.springframework.boot.ConfigurationWarningsApplicationContextInitializer");
    }
}