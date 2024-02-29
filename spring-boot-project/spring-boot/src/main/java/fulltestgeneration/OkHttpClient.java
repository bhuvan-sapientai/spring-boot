package fulltestgeneration;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import lombok.extern.slf4j.Slf4j;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;

@Slf4j
public class OkHttpClient {

    private final okhttp3.OkHttpClient client = new okhttp3.OkHttpClient.Builder()
        .connectTimeout(1600, TimeUnit.SECONDS)
        .readTimeout(1600, TimeUnit.SECONDS)
        .writeTimeout(1600, TimeUnit.SECONDS)
        .build();

    public Response sendJsonRequest(String promptStatement, String outputFormat, OpenAPIInstance openAPIInstance) {
        String apiKey = "05d0c4c3144a4bb4a0e47a1d129e05a1";
        if(StringUtils.isBlank(apiKey)) {
            //log.warn("API Key not found for LLM instance {}", openAPIInstance.name());
            return  null;
        }

        Properties properties = new Properties();
        try (InputStream input = OkHttpClient.class.getResourceAsStream("/core-config.properties")) {
            properties.load(input);
            String url = openAPIInstance.name() + "_URL_GPT4";

            String jsonFilePath = properties.getProperty("gpt4jsonFilePath");
            String apiURL = properties.getProperty(url);
            String jsonContent;

            try(var reader = new BufferedReader(new InputStreamReader(
                Objects.requireNonNull(this.getClass().getResourceAsStream(jsonFilePath))))) {
                jsonContent = reader.lines().reduce("", (line1, line2) -> line1 + line2);
            }

            jsonContent = jsonContent.replace("PROMPT_STATEMENT", promptStatement);
            jsonContent = jsonContent.replace("OUTPUT_FORMAT", outputFormat);

            JSONObject requestBody = new JSONObject(jsonContent);
            String jsonBody = requestBody.toString();
			MediaType mediaType = MediaType.get("application/json; charset=utf-8");

			RequestBody jsonRequestBody = RequestBody.Companion.create(jsonBody, mediaType);
			Request request = RequestBuilder.buildRequest(openAPIInstance, jsonRequestBody, apiURL, apiKey);
			long startTime = System.currentTimeMillis();
			Response response = this.client.newCall(request).execute();

            if (response.isSuccessful()) {
                long endTime = System.currentTimeMillis();
                //log.info("LLM Response time: " + ((endTime-startTime)/1000) + " seconds");
                return response;
            } else {
                //log.error("Request failed with HTTP error code: " + response.code());
            }
        } catch (IOException e) {
            //log.error("An error occurred while processing the request", e);
        }

        return null;
    }
}
