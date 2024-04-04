package org.springframework.boot.web.servlet.error;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;

import org.springframework.util.StringUtils;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;

import java.util.Date;
import java.util.Map;

import org.mockito.MockedStatic;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.web.context.request.WebRequest;

import jakarta.servlet.http.HttpServletResponse;

import org.springframework.util.ObjectUtils;
import org.springframework.web.servlet.ModelAndView;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DefaultErrorAttributesSapientGeneratedTest {

	private final WebRequest requestAttributesMock = mock(WebRequest.class);

	//Sapient generated method id: ${0d228853-5164-3475-ab95-36399a36b1ee}, hash: B8EE41C942711B17A04A031113EC0162
	@Test()
	void resolveExceptionTest() {
		//Arrange Statement(s)
		HttpServletRequest requestMock = mock(HttpServletRequest.class);
		Exception exception = new Exception();
		doNothing().when(requestMock).setAttribute("org.springframework.boot.web.servlet.error.DefaultErrorAttributes.ERROR", exception);
		DefaultErrorAttributes target = new DefaultErrorAttributes();
		HttpServletResponse httpServletResponseMock = mock(HttpServletResponse.class);
		Object object = new Object();

		//Act Statement(s)
		ModelAndView result = target.resolveException(requestMock, httpServletResponseMock, object, exception);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(nullValue()));
			verify(requestMock).setAttribute("org.springframework.boot.web.servlet.error.DefaultErrorAttributes.ERROR", exception);
		});
	}

	//Sapient generated method id: ${9a77f792-11e9-3f63-aa0c-a7f580d26598}, hash: F800B91B456E9916B11177483A10E084
	@Test()
	void getErrorAttributesWhenErrorAttributesGetMessageIsNotNullAndOptionsNotIsIncludedIncludeBINDING_ERRORSAndOptionsNotIsIncl() throws Exception {
		/* Branches:
		 * (status == null) : true  #  inside addStatus method
		 * (error != null) : true  #  inside addErrorDetails method
		 * (error instanceof ServletException) : true  #  inside addErrorDetails method
		 * (error.getCause() != null) : true  #  inside addErrorDetails method
		 * (includeStackTrace) : true  #  inside addErrorDetails method
		 * (error instanceof BindingResult bindingResult) : false  #  inside extractBindingResult method
		 * (result == null) : true  #  inside addErrorMessage method
		 * (path != null) : true  #  inside addPath method
		 * (!options.isIncluded(Include.EXCEPTION)) : true
		 * (!options.isIncluded(Include.STACK_TRACE)) : true
		 * (!options.isIncluded(Include.MESSAGE)) : true
		 * (errorAttributes.get("message") != null) : true
		 * (!options.isIncluded(Include.BINDING_ERRORS)) : true
		 * (!options.isIncluded(Include.PATH)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(null).when(requestAttributesMock).getAttribute("jakarta.servlet.error.status_code", 0);
		doReturn("return_of_getAttribute1").when(requestAttributesMock).getAttribute("jakarta.servlet.error.request_uri", 0);
		ErrorAttributeOptions optionsMock = mock(ErrorAttributeOptions.class);
		doReturn(false).when(optionsMock).isIncluded(ErrorAttributeOptions.Include.EXCEPTION);
		doReturn(true, false).when(optionsMock).isIncluded(ErrorAttributeOptions.Include.STACK_TRACE);
		doReturn(false).when(optionsMock).isIncluded(ErrorAttributeOptions.Include.MESSAGE);
		doReturn(false).when(optionsMock).isIncluded(ErrorAttributeOptions.Include.BINDING_ERRORS);
		doReturn(false).when(optionsMock).isIncluded(ErrorAttributeOptions.Include.PATH);
		DefaultErrorAttributes target = spy(new DefaultErrorAttributes());
		ServletException servletExceptionMock = mock(ServletException.class);
		doReturn(servletExceptionMock).when(target).getError(requestAttributesMock);
		Throwable throwable = new Throwable();
		doReturn("return_of_getMessage1").when(target).getMessage(requestAttributesMock, throwable);

		//Act Statement(s)
		Map<String, Object> result = target.getErrorAttributes(requestAttributesMock, optionsMock);
		Date date = new Date();
		Map<String, Object> stringObjectResultMap = new LinkedHashMap<>();
		stringObjectResultMap.put("timestamp", date);
		stringObjectResultMap.put("status", 999);
		stringObjectResultMap.put("error", "None");

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(stringObjectResultMap));
			verify(requestAttributesMock).getAttribute("jakarta.servlet.error.status_code", 0);
			verify(requestAttributesMock).getAttribute("jakarta.servlet.error.request_uri", 0);
			verify(optionsMock, times(2)).isIncluded(ErrorAttributeOptions.Include.STACK_TRACE);
			verify(optionsMock).isIncluded(ErrorAttributeOptions.Include.EXCEPTION);
			verify(optionsMock).isIncluded(ErrorAttributeOptions.Include.MESSAGE);
			verify(optionsMock).isIncluded(ErrorAttributeOptions.Include.BINDING_ERRORS);
			verify(optionsMock).isIncluded(ErrorAttributeOptions.Include.PATH);
			verify(target).getError(requestAttributesMock);
			verify(target).getMessage(requestAttributesMock, throwable);
		});
	}

	//Sapient generated method id: ${d497c838-46d6-3f5d-8ae4-ef978063090a}, hash: 64E23B0838024748AAD19D4A053FFC4D
	@Test()
	void getMessageWhenObjectUtilsNotIsEmptyMessage() {
		/* Branches:
		 * (!ObjectUtils.isEmpty(message)) : true
		 */
		//Arrange Statement(s)
		Object objectMock = mock(Object.class, "getAttribute_object1");
		try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class)) {
			doReturn(objectMock).when(requestAttributesMock).getAttribute("jakarta.servlet.error.message", 0);
			objectUtils.when(() -> ObjectUtils.isEmpty(objectMock)).thenReturn(false);
			DefaultErrorAttributes target = new DefaultErrorAttributes();
			Throwable throwable = new Throwable();
			//Act Statement(s)
			String result = target.getMessage(requestAttributesMock, throwable);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("getAttribute_object1"));
				verify(requestAttributesMock).getAttribute("jakarta.servlet.error.message", 0);
				objectUtils.verify(() -> ObjectUtils.isEmpty(objectMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${5ea5ff2f-1a21-33b8-a6cd-bb10c050ce54}, hash: 2B2D83AE5BE4F7CE852FB57774A0E79D
	@Test()
	void getMessageWhenStringUtilsHasLengthErrorGetMessage() {
		/* Branches:
		 * (!ObjectUtils.isEmpty(message)) : false
		 * (error != null) : true
		 * (StringUtils.hasLength(error.getMessage())) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class)) {
			Object object = new Object();
			doReturn(object).when(requestAttributesMock).getAttribute("jakarta.servlet.error.message", 0);
			objectUtils.when(() -> ObjectUtils.isEmpty(object)).thenReturn(true);
			DefaultErrorAttributes target = new DefaultErrorAttributes();
			Throwable throwable = new Throwable("A");
			//Act Statement(s)
			String result = target.getMessage(requestAttributesMock, throwable);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("A"));
				verify(requestAttributesMock).getAttribute("jakarta.servlet.error.message", 0);
				objectUtils.verify(() -> ObjectUtils.isEmpty(object), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${40516363-99f3-3d7a-a9f1-f05d017bcb51}, hash: 0F3A3FCAC9A2DD194C6666F9B326B164
	@Test()
	void getMessageWhenStringUtilsNotHasLengthErrorGetMessage() {
		/* Branches:
		 * (!ObjectUtils.isEmpty(message)) : false
		 * (error != null) : true
		 * (StringUtils.hasLength(error.getMessage())) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class)) {
			Object object = new Object();
			doReturn(object).when(requestAttributesMock).getAttribute("jakarta.servlet.error.message", 0);
			objectUtils.when(() -> ObjectUtils.isEmpty(object)).thenReturn(true);
			stringUtils.when(() -> StringUtils.hasLength("A")).thenReturn(false);
			DefaultErrorAttributes target = new DefaultErrorAttributes();
			Throwable throwable = new Throwable("A");
			//Act Statement(s)
			String result = target.getMessage(requestAttributesMock, throwable);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("No message available"));
				verify(requestAttributesMock).getAttribute("jakarta.servlet.error.message", 0);
				objectUtils.verify(() -> ObjectUtils.isEmpty(object), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength("A"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${7c31fce2-1825-3aec-b8d4-7974b22222a5}, hash: AEE3C8BD401D10EAA971A393A4DA6828
	@Test()
	void getErrorWhenExceptionIsNull() {
		/* Branches:
		 * (exception == null) : true
		 */
		//Arrange Statement(s)
		doReturn(null).when(requestAttributesMock).getAttribute("org.springframework.boot.web.servlet.error.DefaultErrorAttributes.ERROR", 0);
		Throwable throwable = new Throwable();
		doReturn(throwable).when(requestAttributesMock).getAttribute("jakarta.servlet.error.exception", 0);
		DefaultErrorAttributes target = new DefaultErrorAttributes();

		//Act Statement(s)
		Throwable result = target.getError(requestAttributesMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(throwable));
			verify(requestAttributesMock).getAttribute("org.springframework.boot.web.servlet.error.DefaultErrorAttributes.ERROR", 0);
			verify(requestAttributesMock).getAttribute("jakarta.servlet.error.exception", 0);
		});
	}
}
