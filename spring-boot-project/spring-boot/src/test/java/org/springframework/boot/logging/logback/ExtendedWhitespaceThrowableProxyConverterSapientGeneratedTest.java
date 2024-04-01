package org.springframework.boot.logging.logback;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import ch.qos.logback.classic.spi.IThrowableProxy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ExtendedWhitespaceThrowableProxyConverterSapientGeneratedTest {

	//Sapient generated method id: ${aecae6ab-c760-31b9-8104-96683d63cca4}, hash: 04FB33D3F3993934A992A15B9826CB79
	@Disabled()
	@Test()
	void throwableProxyToStringTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ExtendedWhitespaceThrowableProxyConverter target = new ExtendedWhitespaceThrowableProxyConverter();
		IThrowableProxy iThrowableProxyMock = mock(IThrowableProxy.class);
		//Act Statement(s)
		String result = target.throwableProxyToString(iThrowableProxyMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("\nA\n")));
	}
}
