package org.springframework.boot.web.servlet;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import org.springframework.util.ClassUtils;

import java.util.Set;

import jakarta.servlet.ServletContext;

import org.springframework.util.Assert;

import org.mockito.MockedStatic;

import java.util.EventListener;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ServletListenerRegistrationBeanSapientGeneratedTest {

	private final ServletContext servletContextMock = mock(ServletContext.class);

	//Sapient generated method id: ${33d93db6-b323-3f6d-961d-10c273404938}
	@Disabled()
	@Test()
	void setListenerTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ServletListenerRegistrationBean> servletListenerRegistrationBean = mockStatic(ServletListenerRegistrationBean.class, CALLS_REAL_METHODS);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			_assert.when(() -> Assert.notNull((EventListener) null, "Listener must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			classUtils.when(() -> ClassUtils.isAssignableValue(Object.class, (EventListener) null)).thenReturn(true);
			_assert.when(() -> Assert.isTrue(true, "Listener is not of a supported type")).thenAnswer((Answer<Void>) invocation -> null);
			servletListenerRegistrationBean.when(() -> ServletListenerRegistrationBean.isSupportedType((EventListener) null)).thenReturn(false);
			_assert.when(() -> Assert.isTrue(false, "Listener is not of a supported type")).thenAnswer((Answer<Void>) invocation -> null);
			ServletListenerRegistrationBean<EventListener> target = new ServletListenerRegistrationBean<>((EventListener) null);
			//TODO: Needs initialization with real value
			EventListener eventListener = null;
			//Act Statement(s)
			target.setListener(eventListener);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(target.getListener(), is(nullValue()));
				_assert.verify(() -> Assert.notNull((EventListener) null, "Listener must not be null"), atLeast(2));
				classUtils.verify(() -> ClassUtils.isAssignableValue(Object.class, (EventListener) null), atLeast(1));
				_assert.verify(() -> Assert.isTrue(true, "Listener is not of a supported type"), atLeast(1));
				servletListenerRegistrationBean.verify(() -> ServletListenerRegistrationBean.isSupportedType((EventListener) null), atLeast(1));
				_assert.verify(() -> Assert.isTrue(false, "Listener is not of a supported type"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c72539b8-9295-34c2-830f-8d27a3760c57}
	@Disabled()
	@Test()
	void getDescriptionTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			_assert.when(() -> Assert.notNull((EventListener) null, "Listener must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			classUtils.when(() -> ClassUtils.isAssignableValue(Object.class, (EventListener) null)).thenReturn(true);
			ServletListenerRegistrationBean<EventListener> target = new ServletListenerRegistrationBean<>((EventListener) null);
			//Act Statement(s)
			String result = target.getDescription();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("listener null"));
				_assert.verify(() -> Assert.notNull((EventListener) null, "Listener must not be null"), atLeast(2));
				classUtils.verify(() -> ClassUtils.isAssignableValue(Object.class, (EventListener) null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${853913a6-18ed-366c-8d01-10d393fd970e}
	@Disabled()
	@Test()
	void registerTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			doNothing().when(servletContextMock).addListener((EventListener) null);
			_assert.when(() -> Assert.notNull((EventListener) null, "Listener must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			classUtils.when(() -> ClassUtils.isAssignableValue(Object.class, (EventListener) null)).thenReturn(true);
			ServletListenerRegistrationBean<EventListener> target = new ServletListenerRegistrationBean<>((EventListener) null);
			//Act Statement(s)
			target.register("description1", servletContextMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(servletContextMock, atLeast(1)).addListener((EventListener) null);
				_assert.verify(() -> Assert.notNull((EventListener) null, "Listener must not be null"), atLeast(1));
				classUtils.verify(() -> ClassUtils.isAssignableValue(Object.class, (EventListener) null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${519405a4-5335-3ae2-b922-644631f3d678}
	@Disabled()
	@Test()
	void registerWhenCaughtRuntimeExceptionThrowsIllegalStateException() {
		/* Branches:
		 * (catch-exception (RuntimeException)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			doNothing().when(servletContextMock).addListener((EventListener) null);
			_assert.when(() -> Assert.notNull((EventListener) null, "Listener must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			classUtils.when(() -> ClassUtils.isAssignableValue(Object.class, (EventListener) null)).thenReturn(true);
			ServletListenerRegistrationBean<EventListener> target = new ServletListenerRegistrationBean<>((EventListener) null);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.register("description1", servletContextMock);
			});
			RuntimeException runtimeException = new RuntimeException();
			IllegalStateException illegalStateException = new IllegalStateException("Failed to add listener '<init>_eventListener1' to servlet context", runtimeException);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(runtimeException.getClass())));
				verify(servletContextMock, atLeast(1)).addListener((EventListener) null);
				_assert.verify(() -> Assert.notNull((EventListener) null, "Listener must not be null"), atLeast(1));
				classUtils.verify(() -> ClassUtils.isAssignableValue(Object.class, (EventListener) null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${b508e334-1b9b-3bb0-ae5d-71c2ad5c2239}
	@Disabled()
	@Test()
	void isSupportedTypeWhenClassUtilsIsAssignableValueTypeListener() {
		/* Branches:
		 * (for-each(SUPPORTED_TYPES)) : true
		 * (ClassUtils.isAssignableValue(type, listener)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			classUtils.when(() -> ClassUtils.isAssignableValue(Object.class, (EventListener) null)).thenReturn(true);
			//TODO: Needs initialization with real value
			EventListener eventListener = null;
			//Act Statement(s)
			boolean result = ServletListenerRegistrationBean.isSupportedType(eventListener);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				classUtils.verify(() -> ClassUtils.isAssignableValue(Object.class, (EventListener) null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3c42c9e8-d1af-37ce-bcd1-d76421b8527c}
	@Disabled()
	@Test()
	void isSupportedTypeWhenClassUtilsNotIsAssignableValueTypeListener() {
		/* Branches:
		 * (for-each(SUPPORTED_TYPES)) : true
		 * (ClassUtils.isAssignableValue(type, listener)) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			classUtils.when(() -> ClassUtils.isAssignableValue(Object.class, (EventListener) null)).thenReturn(false);
			EventListener eventListener = null;
			//Act Statement(s)
			boolean result = ServletListenerRegistrationBean.isSupportedType(eventListener);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				classUtils.verify(() -> ClassUtils.isAssignableValue(Object.class, (EventListener) null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3e294366-1d74-3819-9989-e14991f4b9b9}
	@Disabled()
	@Test()
	void getSupportedTypesTest() {
		//Act Statement(s)
		Set<Class<?>> result = ServletListenerRegistrationBean.getSupportedTypes();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result.size(), equalTo(0)));
	}
}
