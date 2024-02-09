package org.springframework.boot.web.context;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import org.springframework.boot.web.server.GracefulShutdownCallback;
import org.springframework.boot.web.server.WebServer;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class WebServerGracefulShutdownLifecycleSapientGeneratedTest {

	private final WebServer webServerMock = mock(WebServer.class, "webServer");

	//Sapient generated method id: ${a9331398-240e-36aa-9522-b3dc4bcf14ad}
	@Test()
	void startTest() {
		//Arrange Statement(s)
		WebServerGracefulShutdownLifecycle target = new WebServerGracefulShutdownLifecycle(webServerMock);

		//Act Statement(s)
		target.start();

		//Assert statement(s)
		assertAll("result", () -> assertThat(target.isRunning(), equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${cd0cf2a1-573b-3bcd-a40e-9d0cf53a53e7}
	@Test()
	void stopThrowsUnsupportedOperationException() {
		//Arrange Statement(s)
		WebServerGracefulShutdownLifecycle target = new WebServerGracefulShutdownLifecycle(webServerMock);
		UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Stop must not be invoked directly");
		//Act Statement(s)
		final UnsupportedOperationException result = assertThrows(UnsupportedOperationException.class, () -> {
			target.stop();
		});

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getMessage(), equalTo(unsupportedOperationException.getMessage()));
		});
	}

	//Sapient generated method id: ${6da37d8c-a0d2-38b0-abae-97e2f14c0fdd}
	@Disabled(value = "Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void stop1Test() {
		//Arrange Statement(s)
		WebServerGracefulShutdownLifecycle target = new WebServerGracefulShutdownLifecycle(webServerMock);
		doNothing().when(webServerMock).shutDownGracefully((GracefulShutdownCallback) any());
		//TODO: Needs initialization with real value
		Runnable runnable = null;

		//Act Statement(s)
		target.stop(runnable);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(target.isRunning(), equalTo(Boolean.FALSE));
			verify(webServerMock).shutDownGracefully((GracefulShutdownCallback) any());
		});
	}
}
