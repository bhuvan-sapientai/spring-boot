package fulltestgeneration;

import lombok.extern.slf4j.Slf4j;
import okhttp3.Response;
import java.io.IOException;

@Slf4j
public class LLMClientManager {


    public String getGeneratedTestFile(String promptStatement, String outputFormat) {
        OkHttpClient httpClient = new OkHttpClient();
        Response response = httpClient.sendJsonRequest(promptStatement.trim(), outputFormat.trim(), OpenAPIInstance.OPENAPI_AZURE);
        OpenAiResponseParser openAiResponseParser = new OpenAiResponseParser(response);
        try {
            return openAiResponseParser.parseResponse();
        } catch (IOException e) {
            //log.error("An error occurred while parsing OpenAI response: {}", e.getMessage());
            return "";
        }
    }
}
