package fulltestgeneration;

import lombok.experimental.UtilityClass;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@UtilityClass
public class CodeExtractor {
    public String extractCode(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder extractedCode = new StringBuilder(input.length());

        Pattern pattern = Pattern.compile("```(.*?)```", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String codeBlock = matcher.group(1);
            if (codeBlock.trim().startsWith("java")) {
                codeBlock = codeBlock.replaceFirst("^java", "").trim();
            }
            codeBlock = removePackageStatement(codeBlock);
            extractedCode.append(codeBlock).append("\n"); // Append each code block followed by a newline
        }

        return extractedCode.toString();
    }

    private String removePackageStatement(String codeBlock) {
        codeBlock = codeBlock.replaceAll("^\\s*package\\s+.*?;", "");
        return codeBlock.trim();
    }
}
