package fulltestgeneration;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Method;
import java.util.List;

@Slf4j
public class PromptGenerator {
    private final String classCode;
    private  final String pathToSaveFile;

    private final String generatedTestFilePackage;
    private final String className;

    private final String importPath;

    private final List<Method> publicMethods;

    private final String methodName;

    public PromptGenerator(String classCode, String pathToSaveFile, String generatedTestFilePackage, String className,
        String importPath, List<Method> publicMethods, String methodName) {
        this.classCode = classCode;
        this.pathToSaveFile = pathToSaveFile;
        this.generatedTestFilePackage = generatedTestFilePackage;
        this.className = className;
        this.importPath = importPath;
        this.publicMethods = publicMethods;
        this.methodName = methodName;
    }

    public String generateInputStatement() {

        StringBuilder promptBuilder = new StringBuilder();

        promptBuilder.append("Please generate a comprehensive suite of JUnit 5 test cases for the Java class: ")
            .append(this.className)
            .append(". Follow these guidelines:")
            .append("\n- Include all necessary imports to ensure tests are self-contained.")
            .append("\n- Employ Mockito for mocking external dependencies. This should encompass mocking behaviors for classes used within public methods, including instructions of private methods called from these public methods under test.")
            .append("\n- Instantiate the class under test exclusively through public constructors, factory methods, or builder patterns. For all user-defined classes within the test scope, prioritize the use of mocking to simulate their behaviors.")
            .append("\n- For static methods, use mocking as needed. Prefer mocking is done directly through the static import, not object instances, to simulate real scenarios accurately.")
            .append("\n- Aim for exhaustive code coverage, including statement, branch, condition coverage, and private methods. Design tests to cover all non-overlapping branch conditions, ensuring each logical path is tested.")
            .append("\n- Use JUnit 5's annotations for setup (@BeforeEach) and teardown (@AfterEach) if needed, and leverage parameterized tests (@ParameterizedTest) where applicable.")
            .append("\n- Ensure tests include comprehensive assertions. Employ assertThrows for testing exception handling.")
            .append("\n\nAssume the class contains the following code: ")
            .append(this.classCode)
            .append("\n Note- When testing public methods interacting with private ones, avoid directly mocking private methods. Emulate their behaviors and instructions for comprehensive coverage");



        return getString(promptBuilder);
    }

    public String generatedOutputFormat() {
        StringBuilder outPutBuilder = new StringBuilder();
        String testFileName = this.className + StringUtils.capitalize(this.methodName) + "Test";
        outPutBuilder.append("Generate the test file with the following specifications:")
            .append("- File Name: '").append(testFileName)
            .append("- Include comprehensive imports at the beginning of the file. This includes the import statement for the class under test: '").append(this.className).append("', as well as JUnit 5 libraries and Mockito.")
            .append("- Structure the file according to Java conventions. This means:")
            .append("- Include setup and teardown methods annotated with @BeforeEach and @AfterEach, respectively, if needed.")
            .append("- Write test methods that are self-contained, ensuring they do not rely on execution order or shared state.")
            .append("- Avoid using the @UtilityClass, @ExtendWith(MockitoExtension.class) or any other annotation on test class, as it's unnecessary for test classes.")
            .append("- Exclude any placeholder text, TODOs, or unnecessary comments that do not contribute to understanding the test logic.")
            .append("Ensure that the resulting test file is clean, adheres to Java coding standards, and is ready for immediate compilation and execution without the need for further modifications or TODO.");


        return getString(outPutBuilder);
    }

    @NotNull
    private String getString(StringBuilder outPutBuilder) {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonOutput;
        try {
            jsonOutput = objectMapper.writeValueAsString(outPutBuilder.toString());
        } catch (JsonProcessingException e) {
            //log.error("Error occurred while serializing promptMessage to JSON.", e);
            throw new IllegalArgumentException("Error serializing promptMessage");
        }

        return removeExtraQuotes(jsonOutput);
    }

    public void generateUnitTest(String methodName) {
       String promptStatement = generateInputStatement();
       String outputFormat = generatedOutputFormat();
       LLMClientManager llmClientManager = new LLMClientManager();
       String  fileCode = llmClientManager.getGeneratedTestFile(promptStatement, outputFormat).trim();
       if (!fileCode.isEmpty()) {
           String testFileName = this.className + StringUtils.capitalize(methodName) + "Test";
           CodeFile codeFile = new CodeFile(this.pathToSaveFile, testFileName, this.generatedTestFilePackage, fileCode,
				   this.importPath);
           codeFile.saveToFile();
       }

    }

	public static String removeExtraQuotes(String input) {
		if (input.startsWith("\"") && input.endsWith("\"")) {
			return input.substring(1, input.length() - 1);
		}
		return input;
	}
}
