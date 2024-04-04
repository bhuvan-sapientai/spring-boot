package org.springframework.boot.web.servlet;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import java.util.Set;

import jakarta.servlet.ServletContext;

import org.springframework.util.Assert;

import org.mockito.MockedStatic;

import java.util.EventListener;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
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

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ServletListenerRegistrationBeanSapientGeneratedTest {

	private final EventListener eventListenerMock = mock(EventListener.class);

	private final ServletContext servletContextMock = mock(ServletContext.class);

	//Sapient generated method id: ${33d93db6-b323-3f6d-961d-10c273404938}, hash: AE877B4453204ECD9E82C0FA0BD00E5C
	@Test()
	void setListenerTest() {
		//Arrange Statement(s)
		EventListener eventListenerMock2 = mock(EventListener.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ServletListenerRegistrationBean> servletListenerRegistrationBean = mockStatic(ServletListenerRegistrationBean.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.notNull(eventListenerMock, "Listener must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(false, "Listener is not of a supported type")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(eventListenerMock2, "Listener must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			servletListenerRegistrationBean.when(() -> ServletListenerRegistrationBean.isSupportedType(eventListenerMock2)).thenReturn(false);
			ServletListenerRegistrationBean<EventListener> target = new ServletListenerRegistrationBean<>(eventListenerMock);
			//Act Statement(s)
			target.setListener(eventListenerMock2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(target.getListener(), is(notNullValue()));
				_assert.verify(() -> Assert.notNull(eventListenerMock, "Listener must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(false, "Listener is not of a supported type"), atLeast(2));
				_assert.verify(() -> Assert.notNull(eventListenerMock2, "Listener must not be null"), atLeast(1));
				servletListenerRegistrationBean.verify(() -> ServletListenerRegistrationBean.isSupportedType(eventListenerMock2), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c72539b8-9295-34c2-830f-8d27a3760c57}, hash: ACC83543CFCF2582F7B8928ECC0B2CF3
	@Test()
	void getDescriptionTest() {
		//Arrange Statement(s)
		EventListener eventListenerMock = mock(EventListener.class, "<init>_eventListener1");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(eventListenerMock, "Listener must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(false, "Listener is not of a supported type")).thenAnswer((Answer<Void>) invocation -> null);
			ServletListenerRegistrationBean<EventListener> target = new ServletListenerRegistrationBean<>(eventListenerMock);
			//Act Statement(s)
			String result = target.getDescription();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("listener <init>_eventListener1"));
				_assert.verify(() -> Assert.notNull(eventListenerMock, "Listener must not be null"), atLeast(2));
				_assert.verify(() -> Assert.isTrue(false, "Listener is not of a supported type"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${853913a6-18ed-366c-8d01-10d393fd970e}, hash: EEE0954E85E40545E5936FCD9F20E98C
	@Test()
	void registerTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doNothing().when(servletContextMock).addListener(eventListenerMock);
			_assert.when(() -> Assert.notNull(eventListenerMock, "Listener must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(false, "Listener is not of a supported type")).thenAnswer((Answer<Void>) invocation -> null);
			ServletListenerRegistrationBean<EventListener> target = new ServletListenerRegistrationBean<>(eventListenerMock);
			//Act Statement(s)
			target.register("description1", servletContextMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(servletContextMock).addListener(eventListenerMock);
				_assert.verify(() -> Assert.notNull(eventListenerMock, "Listener must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(false, "Listener is not of a supported type"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${519405a4-5335-3ae2-b922-644631f3d678}, hash: 7126C18131925BCEC035F243FEBBE7AF
	@Test()
	void registerWhenCaughtRuntimeExceptionThrowsIllegalStateException() {
		/* Branches:
		 * (catch-exception (RuntimeException)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		EventListener eventListenerMock = mock(EventListener.class, "<init>_eventListener1");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doNothing().when(servletContextMock).addListener(eventListenerMock);
			_assert.when(() -> Assert.notNull(eventListenerMock, "Listener must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(false, "Listener is not of a supported type")).thenAnswer((Answer<Void>) invocation -> null);
			ServletListenerRegistrationBean<EventListener> target = new ServletListenerRegistrationBean<>(eventListenerMock);
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
				verify(servletContextMock).addListener(eventListenerMock);
				_assert.verify(() -> Assert.notNull(eventListenerMock, "Listener must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(false, "Listener is not of a supported type"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f530f6f3-7f7b-3c10-9ae7-280573bf738f}, hash: 9E4036386274798CDE8C687201CBA243
	@Test()
	void isSupportedTypeWhenSUPPORTED_TYPESIsEmpty() {
		/* Branches:
		 * (for-each(SUPPORTED_TYPES)) : false
		 */

		//Act Statement(s)
		boolean result = ServletListenerRegistrationBean.isSupportedType(eventListenerMock);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${3e294366-1d74-3819-9989-e14991f4b9b9}, hash: 8D548FCEADB97B35D2A663BD2EBD87BF
	@Test()
	void getSupportedTypesTest() {

		//Act Statement(s)
		Set<Class<?>> result = ServletListenerRegistrationBean.getSupportedTypes();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result.size(), equalTo(0)));
	}
}
