package org.springframework.boot.web.client;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.springframework.boot.util.LambdaSafe;
import java.util.Set;
import java.util.HashSet;
import org.springframework.http.HttpHeaders;
import java.util.Map;
import org.springframework.http.client.ClientHttpRequest;
import java.util.HashMap;
import org.mockito.MockedStatic;
import java.util.ArrayList;
import java.util.function.Consumer;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class RestTemplateBuilderClientHttpRequestInitializerSapientGeneratedTest {

    private final BasicAuthentication basicAuthenticationMock = mock(BasicAuthentication.class, "basicAuthentication");

    //Sapient generated method id: ${initializeWhenThisBasicAuthenticationIsNotNull}, hash: 39ACB99C433ED862C1C381D76B0095BC
    @Test()
    void initializeWhenThisBasicAuthenticationIsNotNull() {
        /* Branches:
         * (this.basicAuthentication != null) : true
         */
         //Arrange Statement(s)
        ClientHttpRequest requestMock = mock(ClientHttpRequest.class);
        LambdaSafe.Callbacks lambdaSafeCallbacksMock = mock(LambdaSafe.Callbacks.class);
        try (MockedStatic<LambdaSafe> lambdaSafe = mockStatic(LambdaSafe.class)) {
            HttpHeaders httpHeaders = new HttpHeaders();
            doReturn(httpHeaders).when(requestMock).getHeaders();
            Object[] objectArray = new Object[] {};
            lambdaSafe.when(() -> LambdaSafe.callbacks(eq(RestTemplateRequestCustomizer.class), anySet(), eq(requestMock), eq(objectArray))).thenReturn(lambdaSafeCallbacksMock);
            doNothing().when(lambdaSafeCallbacksMock).invoke((Consumer) any());
            List<String> stringList = new ArrayList<>();
            Map<String, List<String>> stringListStringMap = new HashMap<>();
            stringListStringMap.put("defaultHeadersItem1Key1", stringList);
            Set<RestTemplateRequestCustomizer<?>> anySet = new HashSet<>();
            RestTemplateBuilderClientHttpRequestInitializer target = new RestTemplateBuilderClientHttpRequestInitializer(basicAuthenticationMock, stringListStringMap, anySet);
            doNothing().when(basicAuthenticationMock).applyTo(eq(httpHeaders));
            //Act Statement(s)
            target.initialize(requestMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(requestMock).getHeaders();
                lambdaSafe.verify(() -> LambdaSafe.callbacks(eq(RestTemplateRequestCustomizer.class), anySet(), eq(requestMock), eq(objectArray)));
                verify(lambdaSafeCallbacksMock).invoke((Consumer) any());
                verify(basicAuthenticationMock).applyTo(eq(httpHeaders));
            });
        }
    }
}
