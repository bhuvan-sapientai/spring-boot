package org.springframework.boot.web.reactive.error;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.http.server.RequestPath;

import java.util.Map;
import java.util.HashMap;
import java.util.Optional;

import org.springframework.boot.web.error.ErrorAttributeOptions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DefaultErrorAttributesSapientGeneratedTest {

	private final ServerRequest requestMock = mock(ServerRequest.class);

	//Sapient generated method id: ${c937b4fa-59c5-39f8-9ae7-c18afeffd82f}, hash: 4AA67ED2CBA9DCD0311C3E0401C8FF4A
	@Test()
	void getErrorAttributesThrowsIllegalStateException() {
		//Arrange Statement(s)
		RequestPath requestPathMock = mock(RequestPath.class);
		doReturn(requestPathMock).when(requestMock).requestPath();
		doReturn("return_of_value1").when(requestPathMock).value();
		doReturn(Optional.empty()).when(requestMock).attribute("org.springframework.boot.web.reactive.error.DefaultErrorAttributes.ERROR");
		ErrorAttributeOptions optionsMock = mock(ErrorAttributeOptions.class);
		doReturn(false).when(optionsMock).isIncluded(ErrorAttributeOptions.Include.STACK_TRACE);
		DefaultErrorAttributes target = new DefaultErrorAttributes();
		IllegalStateException illegalStateException = new IllegalStateException("Missing exception attribute in ServerWebExchange");
		//Act Statement(s)
		final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
			target.getErrorAttributes(requestMock, optionsMock);
		});

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
			verify(requestMock).requestPath();
			verify(requestPathMock).value();
			verify(requestMock).attribute("org.springframework.boot.web.reactive.error.DefaultErrorAttributes.ERROR");
			verify(optionsMock).isIncluded(ErrorAttributeOptions.Include.STACK_TRACE);
		});
	}

	//Sapient generated method id: ${9763da33-9887-39b3-ae07-92c993aaa2ef}, hash: F70DD2CBBA97127DC758A3013DCB0886
	@Test()
	void getErrorThrowsIllegalStateException() {
		//Arrange Statement(s)
		doReturn(Optional.empty()).when(requestMock).attribute("org.springframework.boot.web.reactive.error.DefaultErrorAttributes.ERROR");
		DefaultErrorAttributes target = new DefaultErrorAttributes();
		IllegalStateException illegalStateException = new IllegalStateException("Missing exception attribute in ServerWebExchange");
		//Act Statement(s)
		final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
			target.getError(requestMock);
		});

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
			verify(requestMock).attribute("org.springframework.boot.web.reactive.error.DefaultErrorAttributes.ERROR");
		});
	}

	//Sapient generated method id: ${293499de-fec3-3b86-846f-38eae52b98e2}, hash: EE27E6D157652D913EDB9DB19BA8B4C8
	@Test()
	void storeErrorInformationTest() {
		//Arrange Statement(s)
		ServerWebExchange exchangeMock = mock(ServerWebExchange.class);
		Map<String, Object> stringObjectMap = new HashMap<>();
		doReturn(stringObjectMap).when(exchangeMock).getAttributes();
		DefaultErrorAttributes target = new DefaultErrorAttributes();
		Throwable throwable = new Throwable();

		//Act Statement(s)
		target.storeErrorInformation(throwable, exchangeMock);

		//Assert statement(s)
		assertAll("result", () -> verify(exchangeMock).getAttributes());
	}
}
