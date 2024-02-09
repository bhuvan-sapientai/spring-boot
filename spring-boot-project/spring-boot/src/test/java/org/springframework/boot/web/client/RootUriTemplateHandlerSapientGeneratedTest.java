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
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class RootUriTemplateHandlerSapientGeneratedTest {

	private final UriTemplateHandler handlerMock = mock(UriTemplateHandler.class, "handler");

	//Sapient generated method id: ${50e236f7-2e07-306c-9525-a1f5252b776f}
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

	//Sapient generated method id: ${0173640c-6690-340b-825c-df4984498a9b}
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

	//Sapient generated method id: ${0d51ddb7-c0f1-360c-b087-b0a08b1213ae}
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

	//Sapient generated method id: ${10507d7a-13dd-3eb8-9eea-2c894a7f7e33}
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

	//Sapient generated method id: ${993f20eb-4a10-398e-a4d3-caa3adfa22f0}
	@Test()
	void withHandlerWrapperTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.notNull(handlerMock, "Handler must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RootUriTemplateHandler target = new RootUriTemplateHandler("A", handlerMock);
			Function function = null;
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				target.withHandlerWrapper(function);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(handlerMock, "Handler must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${37fda9a0-27b1-39d9-844c-155c12172b76}
	@Disabled()
	@Test()
	void addToTest() {
		//Arrange Statement(s)
		RestTemplate restTemplateMock = mock(RestTemplate.class);
		UriTemplateHandler uriTemplateHandlerMock = mock(UriTemplateHandler.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(uriTemplateHandlerMock).when(restTemplateMock).getUriTemplateHandler();
			doNothing().when(restTemplateMock).setUriTemplateHandler((RootUriTemplateHandler) any());
			_assert.when(() -> Assert.notNull(restTemplateMock, "RestTemplate must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull("A", "RootUri must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(uriTemplateHandlerMock, "Handler must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			RootUriTemplateHandler result = RootUriTemplateHandler.addTo(restTemplateMock, "A");
			RootUriTemplateHandler rootUriTemplateHandler = new RootUriTemplateHandler("A", uriTemplateHandlerMock);
			//Assert statement(s)
			//TODO: Please implement equals method in RootUriTemplateHandler for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(rootUriTemplateHandler));
				verify(restTemplateMock).getUriTemplateHandler();
				verify(restTemplateMock).setUriTemplateHandler((RootUriTemplateHandler) any());
				_assert.verify(() -> Assert.notNull(restTemplateMock, "RestTemplate must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull("A", "RootUri must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(uriTemplateHandlerMock, "Handler must not be null"), atLeast(1));
			});
		}
	}
}
