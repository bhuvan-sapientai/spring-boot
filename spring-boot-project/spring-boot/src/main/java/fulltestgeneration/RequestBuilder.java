package fulltestgeneration;

import lombok.experimental.UtilityClass;
import okhttp3.Request;
import okhttp3.RequestBody;

@UtilityClass
public class RequestBuilder {
    public static Request buildRequest(OpenAPIInstance openAPIInstance, RequestBody jsonRequestBody, String apiURL,
        String apiKey) {
        Request request = null;

        if (openAPIInstance == OpenAPIInstance.OPENAI_CHATGPT) {
            request = new Request.Builder().url(apiURL).post(jsonRequestBody)
                .addHeader("Authorization", "Bearer " + apiKey).build();
        } else if (openAPIInstance == OpenAPIInstance.OPENAPI_AZURE) {
            request = new Request.Builder().url(apiURL).post(jsonRequestBody)
                .addHeader("API-KEY", apiKey).build();
        }

        return request;
    }
}
