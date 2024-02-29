package fulltestgeneration;

import lombok.extern.slf4j.Slf4j;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Slf4j
public class OpenAiResponseParser {
    Response response;

    public OpenAiResponseParser(Response response) {
        this.response = response;
    }

    String parseResponse() throws JSONException, IOException {
        String jsonResponse;

        try {
            if (this.response.body() == null) {
                //log.error("Response body is null");
            }
            jsonResponse = this.response.body().string();
            JSONObject responseJson = new JSONObject(jsonResponse);
            JSONArray choices = responseJson.getJSONArray("choices");
            JSONObject firstChoice = choices.getJSONObject(0);
            String messageContent = firstChoice.getJSONObject("message").getString("content");
            return extractCode(messageContent);
        }  finally {
            if (this.response.body() != null) {
				this.response.body().close();
            }
        }
    }

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
