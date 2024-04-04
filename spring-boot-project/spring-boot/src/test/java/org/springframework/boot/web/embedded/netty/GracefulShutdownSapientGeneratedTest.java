package org.springframework.boot.web.embedded.netty;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import reactor.netty.DisposableServer;

import org.springframework.boot.web.server.GracefulShutdownCallback;

import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class GracefulShutdownSapientGeneratedTest {

	private final Supplier<DisposableServer> disposableServerMock = mock(Supplier.class, "disposableServer");

	//Sapient generated method id: ${ddb22ba1-a412-397f-ba3b-0e31d26419b6}, hash: 6860BFDC65C6AA756DE824A71C53C4B7
	@Test()
	void shutDownGracefullyWhenServerIsNull() {
		/* Branches:
		 * (server == null) : true
		 */
		//Arrange Statement(s)
		GracefulShutdown target = new GracefulShutdown(disposableServerMock);
		doReturn(null).when(disposableServerMock).get();
		GracefulShutdownCallback gracefulShutdownCallbackMock = mock(GracefulShutdownCallback.class);

		//Act Statement(s)
		target.shutDownGracefully(gracefulShutdownCallbackMock);

		//Assert statement(s)
		assertAll("result", () -> verify(disposableServerMock).get());
	}

	//Sapient generated method id: ${88974c80-ec84-33e7-9ffa-c06c140bd739}, hash: C920279B89B2C703A64A9468D06C8EAC
	@Test()
	void abortWhenShutdownThreadIsNull() throws InterruptedException {
		/* Branches:
		 * (shutdownThread != null) : false
		 */
		//Arrange Statement(s)
		GracefulShutdown target = new GracefulShutdown(disposableServerMock);

		//Act Statement(s)
		target.abort();
	}
}
