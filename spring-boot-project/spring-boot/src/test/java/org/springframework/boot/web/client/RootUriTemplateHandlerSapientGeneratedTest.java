package org.springframework.boot.web.client;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;
import org.mockito.stubbing.Answer;
import java.net.URI;
import org.springframework.util.StringUtils;
import org.springframework.web.util.UriTemplateHandler;
import org.springframework.util.Assert;
import java.util.function.Function;
import java.util.Map;
import java.util.HashMap;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class RootUriTemplateHandlerSapientGeneratedTest {

    private final UriTemplateHandler handlerMock = mock(UriTemplateHandler.class, "handler");

    private final UriTemplateHandler uriTemplateHandlerMock = mock(UriTemplateHandler.class);

    //Sapient generated method id: ${expandWhenStringUtilsStartsWithIgnoreCaseUriTemplate_}, hash: C95E47A7E94B5571161EF2028CC000CA
    @Test()
    void expandWhenStringUtilsStartsWithIgnoreCaseUriTemplate_() {
        /* Branches:
         * (StringUtils.startsWithIgnoreCase(uriTemplate, "/")) : true  #  inside apply method
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("A", "RootUri must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(handlerMock, "Handler must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            stringUtils.when(() -> StringUtils.startsWithIgnoreCase("B", "/")).thenReturn(true);
            RootUriTemplateHandler target = new RootUriTemplateHandler("A", handlerMock);
            URI uRI = URI.create("str1");
            Map<String, Object> anyMap = new HashMap<>();
            doReturn(uRI).when(handlerMock).expand(eq("AB"), eq(anyMap));
            //Act Statement(s)
            URI result = target.expand("B", anyMap);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(uRI));
                _assert.verify(() -> Assert.notNull("A", "RootUri must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(handlerMock, "Handler must not be null"), atLeast(1));
                stringUtils.verify(() -> StringUtils.startsWithIgnoreCase("B", "/"), atLeast(1));
                verify(handlerMock).expand(eq("AB"), eq(anyMap));
            });
        }
    }

    //Sapient generated method id: ${expandWhenStringUtilsNotStartsWithIgnoreCaseUriTemplate_}, hash: 844AF63286220F5BA826822947343BEA
    @Test()
    void expandWhenStringUtilsNotStartsWithIgnoreCaseUriTemplate_() {
        /* Branches:
         * (StringUtils.startsWithIgnoreCase(uriTemplate, "/")) : false  #  inside apply method
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("A", "RootUri must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(handlerMock, "Handler must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            RootUriTemplateHandler target = new RootUriTemplateHandler("A", handlerMock);
            URI uRI = URI.create("str1");
            Map<String, Object> anyMap = new HashMap<>();
            doReturn(uRI).when(handlerMock).expand(eq("B"), eq(anyMap));
            //Act Statement(s)
            URI result = target.expand("B", anyMap);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(uRI));
                _assert.verify(() -> Assert.notNull("A", "RootUri must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(handlerMock, "Handler must not be null"), atLeast(1));
                verify(handlerMock).expand(eq("B"), eq(anyMap));
            });
        }
    }

    //Sapient generated method id: ${expand1WhenStringUtilsStartsWithIgnoreCaseUriTemplate_}, hash: 9D4897F5F4C70EC806F4513E65908710
    @Test()
    void expand1WhenStringUtilsStartsWithIgnoreCaseUriTemplate_() {
        /* Branches:
         * (StringUtils.startsWithIgnoreCase(uriTemplate, "/")) : true  #  inside apply method
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("A", "RootUri must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(handlerMock, "Handler must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            stringUtils.when(() -> StringUtils.startsWithIgnoreCase("B", "/")).thenReturn(true);
            RootUriTemplateHandler target = new RootUriTemplateHandler("A", handlerMock);
            URI uRI = URI.create("str1");
            Object[] objectArray = new Object[] {};
            doReturn(uRI).when(handlerMock).expand("AB", objectArray);
            //Act Statement(s)
            URI result = target.expand("B", objectArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(uRI));
                _assert.verify(() -> Assert.notNull("A", "RootUri must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(handlerMock, "Handler must not be null"), atLeast(1));
                stringUtils.verify(() -> StringUtils.startsWithIgnoreCase("B", "/"), atLeast(1));
                verify(handlerMock).expand("AB", objectArray);
            });
        }
    }

    //Sapient generated method id: ${expand1WhenStringUtilsNotStartsWithIgnoreCaseUriTemplate_}, hash: 6C876E0EADB78F8F794A2E5E25CA331C
    @Test()
    void expand1WhenStringUtilsNotStartsWithIgnoreCaseUriTemplate_() {
        /* Branches:
         * (StringUtils.startsWithIgnoreCase(uriTemplate, "/")) : false  #  inside apply method
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("A", "RootUri must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(handlerMock, "Handler must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            RootUriTemplateHandler target = new RootUriTemplateHandler("A", handlerMock);
            URI uRI = URI.create("str1");
            Object[] objectArray = new Object[] {};
            doReturn(uRI).when(handlerMock).expand("B", objectArray);
            //Act Statement(s)
            URI result = target.expand("B", objectArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(uRI));
                _assert.verify(() -> Assert.notNull("A", "RootUri must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(handlerMock, "Handler must not be null"), atLeast(1));
                verify(handlerMock).expand("B", objectArray);
            });
        }
    }

    //Sapient generated method id: ${withHandlerWrapperTest}, hash: 70B6E0B0104F3C3039C2DA724F587D42
    @Disabled()
    @Test()
    void withHandlerWrapperTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Function functionMock = mock(Function.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("A", "RootUri must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(handlerMock, "Handler must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(uriTemplateHandlerMock, "Handler must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            RootUriTemplateHandler target = new RootUriTemplateHandler("A", handlerMock);
            //Act Statement(s)
            RootUriTemplateHandler result = target.withHandlerWrapper(functionMock);
            //Assert statement(s)
            //TODO: Please implement equals method in RootUriTemplateHandler for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull("A", "RootUri must not be null"), atLeast(2));
                _assert.verify(() -> Assert.notNull(handlerMock, "Handler must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(uriTemplateHandlerMock, "Handler must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${addToTest}, hash: 5479281E055940535989B70120358B92
    @Test()
    void addToTest() {
        //Arrange Statement(s)
        RestTemplate restTemplateMock = mock(RestTemplate.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(uriTemplateHandlerMock).when(restTemplateMock).getUriTemplateHandler();
            doNothing().when(restTemplateMock).setUriTemplateHandler((UriTemplateHandler) any());
            _assert.when(() -> Assert.notNull(restTemplateMock, "RestTemplate must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull("A", "RootUri must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(uriTemplateHandlerMock, "Handler must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            RootUriTemplateHandler result = RootUriTemplateHandler.addTo(restTemplateMock, "A");
            //Assert statement(s)
            //TODO: Please implement equals method in RootUriTemplateHandler for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(restTemplateMock).getUriTemplateHandler();
                verify(restTemplateMock).setUriTemplateHandler((UriTemplateHandler) any());
                _assert.verify(() -> Assert.notNull(restTemplateMock, "RestTemplate must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull("A", "RootUri must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(uriTemplateHandlerMock, "Handler must not be null"), atLeast(1));
            });
        }
    }
}
