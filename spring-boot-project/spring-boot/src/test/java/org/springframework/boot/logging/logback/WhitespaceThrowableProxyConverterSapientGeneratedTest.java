package org.springframework.boot.logging.logback;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;
import ch.qos.logback.classic.spi.IThrowableProxy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class WhitespaceThrowableProxyConverterSapientGeneratedTest {

	private final IThrowableProxy iThrowableProxyMock = mock(IThrowableProxy.class);

	private final IThrowableProxy tpMock = mock(IThrowableProxy.class);

	//Sapient generated method id: ${aecae6ab-c760-31b9-8104-96683d63cca4}
	@Disabled()
	@Test()
	void throwableProxyToStringTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ThrowableProxyUtil> throwableProxyUtil = mockStatic(ThrowableProxyUtil.class)) {
			doReturn(false).when(tpMock).isCyclic();
			doReturn("bufItem1").when(tpMock).getClassName();
			doReturn("bufItem1").when(tpMock).getMessage();
			StackTraceElementProxy[] stackTraceElementProxyArray = new StackTraceElementProxy[] {};
			doReturn(stackTraceElementProxyArray).when(tpMock).getStackTraceElementProxyArray();
			doReturn(0).when(tpMock).getCommonFrames();
			IThrowableProxy[] iThrowableProxyArray = new IThrowableProxy[] {};
			doReturn(iThrowableProxyArray).when(tpMock).getSuppressed();
			doReturn(iThrowableProxyMock).when(tpMock).getCause();
			StringBuilder stringBuilder = new StringBuilder();
			throwableProxyUtil.when(() -> ThrowableProxyUtil.indent(stringBuilder, 0)).thenAnswer((Answer<Void>) invocation -> null);
			throwableProxyUtil.when(() -> ThrowableProxyUtil.indent(stringBuilder, 1)).thenAnswer((Answer<Void>) invocation -> null);
			WhitespaceThrowableProxyConverter target = new WhitespaceThrowableProxyConverter();
			//Act Statement(s)
			String result = target.throwableProxyToString(tpMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("result1"));
				verify(tpMock).isCyclic();
				verify(tpMock).getClassName();
				verify(tpMock).getMessage();
				verify(tpMock).getStackTraceElementProxyArray();
				verify(tpMock, times(2)).getCommonFrames();
				verify(tpMock).getSuppressed();
				verify(tpMock).getCause();
				throwableProxyUtil.verify(() -> ThrowableProxyUtil.indent(stringBuilder, 0), atLeast(1));
				throwableProxyUtil.verify(() -> ThrowableProxyUtil.indent(stringBuilder, 1), atLeast(2));
			});
		}
	}

	//Sapient generated method id: ${6cda4a3d-30ac-36d6-bd3e-9b157fcaf24e}
	@Disabled()
	@Test()
	void throwableProxyToStringTest7() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(false).when(tpMock).isCyclic();
		doReturn("A").when(tpMock).getClassName();
		doReturn("B").when(tpMock).getMessage();
		StackTraceElementProxy[] stackTraceElementProxyArray = new StackTraceElementProxy[] {};
		doReturn(stackTraceElementProxyArray).when(tpMock).getStackTraceElementProxyArray();
		doReturn(0).when(tpMock).getCommonFrames();
		doReturn(null).when(tpMock).getSuppressed();
		doReturn(iThrowableProxyMock).when(tpMock).getCause();
		WhitespaceThrowableProxyConverter target = new WhitespaceThrowableProxyConverter();
		//Act Statement(s)
		String result = target.throwableProxyToString(tpMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("\nA: B\n\n"));
			verify(tpMock).isCyclic();
			verify(tpMock).getClassName();
			verify(tpMock).getMessage();
			verify(tpMock).getStackTraceElementProxyArray();
			verify(tpMock).getCommonFrames();
			verify(tpMock).getSuppressed();
			verify(tpMock).getCause();
		});
	}

	//Sapient generated method id: ${8d7f4411-fc8b-3270-8c81-5642f5c0cb8f}
	@Test()
	void throwableProxyToStringTest10() {
		//Arrange Statement(s)
		WhitespaceThrowableProxyConverter target = new WhitespaceThrowableProxyConverter();
		IThrowableProxy iThrowableProxy = null;
		//Act Statement(s)
		String result = target.throwableProxyToString(iThrowableProxy);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("\n\n")));
	}
}
