package org.springframework.boot.web.embedded.netty;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import org.springframework.boot.web.server.GracefulShutdownCallback;

import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class GracefulShutdownSapientGeneratedTest {

	//Sapient generated method id: ${ddb22ba1-a412-397f-ba3b-0e31d26419b6}
	@Disabled()
	@Test()
	void shutDownGracefullyWhenServerIsNull() {
		/* Branches:
		 * (server == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		GracefulShutdown target = new GracefulShutdown((Supplier) null);
		GracefulShutdownCallback gracefulShutdownCallbackMock = mock(GracefulShutdownCallback.class, "valid_callback_value");
		//Act Statement(s)
		target.shutDownGracefully(gracefulShutdownCallbackMock);
	}

	//Sapient generated method id: ${88974c80-ec84-33e7-9ffa-c06c140bd739}
	@Test()
	void abortWhenShutdownThreadIsNull() throws InterruptedException {
		/* Branches:
		 * (shutdownThread != null) : false
		 */
		//Arrange Statement(s)
		GracefulShutdown target = new GracefulShutdown((Supplier) null);
		//Act Statement(s)
		target.abort();
	}
}
