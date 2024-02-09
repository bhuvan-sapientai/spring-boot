package org.springframework.boot.web.embedded.jetty;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.function.Supplier;

import org.springframework.boot.web.server.GracefulShutdownCallback;

import org.mockito.MockedStatic;
import org.eclipse.jetty.server.Connector;

import java.util.concurrent.CompletableFuture;

import org.eclipse.jetty.server.Server;

import org.springframework.util.ReflectionUtils;

import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class GracefulShutdownSapientGeneratedTest {

	private final Server serverMock = mock(Server.class, "server");

	private final Connector connectorMock = mock(Connector.class);

	private final GracefulShutdownCallback gracefulShutdownCallbackMock = mock(GracefulShutdownCallback.class);

	//Sapient generated method id: ${1baaa16c-e8c8-359d-9fb3-c406df1fefd8}
	@Disabled(value = "Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void shutDownGracefullyWhenNotGetResult() throws NoSuchMethodError, Exception {
		/* Branches:
		 * (for-each(this.server.getConnectors())) : true
		 * (!jetty10) : false
		 * (getResult) : false  #  inside shutdown method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		GracefulShutdown target = new GracefulShutdown(serverMock, (Supplier) null);
		Connector[] connectorArray = new Connector[] { connectorMock };
		doReturn(connectorArray).when(serverMock).getConnectors();
		CompletableFuture<Void> completableFuture = new CompletableFuture<>();
		doReturn(completableFuture).when(connectorMock).shutdown();

		//Act Statement(s)
		target.shutDownGracefully(gracefulShutdownCallbackMock);

		//Assert statement(s)
		assertAll("result", () -> {
			verify(serverMock).getConnectors();
			verify(connectorMock).shutdown();
		});
	}

	//Sapient generated method id: ${bccdaded-aca7-3d89-98a9-4da86f9d3f73}
	@Disabled(value = "Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void shutDownGracefullyWhenCaughtNoSuchMethodErrorAndNotGetResult() throws NoSuchMethodError, Exception {
		/* Branches:
		 * (for-each(this.server.getConnectors())) : true
		 * (!jetty10) : false
		 * (catch-exception (NoSuchMethodError)) : true  #  inside shutdown method
		 * (getResult) : false  #  inside shutdown method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class)) {
			//TODO: Needs to return real value
			reflectionUtils.when(() -> ReflectionUtils.findMethod(Connector.class, "shutdown")).thenReturn(null);
			//TODO: Needs to return real value
			reflectionUtils.when(() -> ReflectionUtils.invokeMethod((Method) null, connectorMock)).thenReturn(null);
			CompletableFuture<Void> completableFuture = new CompletableFuture<>();
			doReturn(completableFuture).when(connectorMock).shutdown();
			GracefulShutdown target = new GracefulShutdown(serverMock, (Supplier) null);
			Connector[] connectorArray = new Connector[] { connectorMock };
			doReturn(connectorArray).when(serverMock).getConnectors();
			//Act Statement(s)
			target.shutDownGracefully(gracefulShutdownCallbackMock);
			//Assert statement(s)
			assertAll("result", () -> {
				reflectionUtils.verify(() -> ReflectionUtils.findMethod(Connector.class, "shutdown"), atLeast(1));
				reflectionUtils.verify(() -> ReflectionUtils.invokeMethod((Method) null, connectorMock), atLeast(1));
				verify(connectorMock).shutdown();
				verify(serverMock).getConnectors();
			});
		}
	}

	//Sapient generated method id: ${65c40f67-3be8-3740-9bfb-a02f40aeb692}
	@Disabled(value = "Potential harmful system call (Future.get, Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void shutDownGracefullyWhenGetResult() throws NoSuchMethodError, Exception {
		/* Branches:
		 * (catch-exception (Exception)) : true  #  inside isJetty10 method
		 * (for-each(this.server.getConnectors())) : true
		 * (!jetty10) : true
		 * (getResult) : true  #  inside shutdown method
		 */
		//Arrange Statement(s)
		GracefulShutdown target = new GracefulShutdown(serverMock, (Supplier) null);
		Connector[] connectorArray = new Connector[] { connectorMock };
		doReturn(connectorArray).when(serverMock).getConnectors();
		CompletableFuture<Void> completableFuture = new CompletableFuture<>();
		doReturn(completableFuture).when(connectorMock).shutdown();

		//Act Statement(s)
		target.shutDownGracefully(gracefulShutdownCallbackMock);

		//Assert statement(s)
		assertAll("result", () -> {
			verify(serverMock).getConnectors();
			verify(connectorMock).shutdown();
		});
	}

	//Sapient generated method id: ${687d067b-27c5-3d9c-8782-7e251c075bb4}
	@Test()
	void abortTest() {
		//Arrange Statement(s)
		GracefulShutdown target = new GracefulShutdown(serverMock, (Supplier) null);

		//Act Statement(s)
		target.abort();
	}
}
