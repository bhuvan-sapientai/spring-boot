package org.springframework.boot.web.embedded.netty;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.web.server.WebServerException;

import org.junit.jupiter.api.Disabled;

import org.springframework.http.server.reactive.ReactorHttpHandlerAdapter;

import org.mockito.stubbing.Answer;

import org.springframework.boot.web.server.Shutdown;

import reactor.netty.DisposableServer;

import org.springframework.http.client.ReactorResourceFactory;

import reactor.netty.ChannelBindException;

import org.springframework.boot.web.server.PortInUseException;
import org.springframework.util.Assert;

import java.time.Duration;

import reactor.netty.resources.LoopResources;

import org.springframework.boot.web.server.GracefulShutdownCallback;

import org.mockito.MockedStatic;
import io.netty.channel.group.DefaultChannelGroup;

import java.util.function.Consumer;

import reactor.netty.http.server.HttpServer;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.doThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class NettyWebServerSapientGeneratedTest {

	private final DisposableServer disposableServerMock = mock(DisposableServer.class);

	private final HttpServer httpServerMock = mock(HttpServer.class);

	private final HttpServer httpServerMock2 = mock(HttpServer.class);

	private final HttpServer httpServerMock3 = mock(HttpServer.class);

	private final HttpServer httpServerMock4 = mock(HttpServer.class);

	private final LoopResources loopResourcesMock = mock(LoopResources.class);

	private final ReactorHttpHandlerAdapter reactorHttpHandlerAdapterMock = mock(ReactorHttpHandlerAdapter.class);

	private final ReactorResourceFactory reactorResourceFactoryMock = mock(ReactorResourceFactory.class);

	//Sapient generated method id: ${635c1330-85fc-3e1e-85fa-a762b94badf5}
	@Test()
	void startWhenCaughtExceptionThrowsWebServerException() throws WebServerException {
		/* Branches:
		 * (this.disposableServer == null) : true
		 * (catch-exception (Exception)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<PortInUseException> portInUseException = mockStatic(PortInUseException.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(httpServerMock2).when(httpServerMock).channelGroup((DefaultChannelGroup) any());
			_assert.when(() -> Assert.notNull(httpServerMock, "HttpServer must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RuntimeException runtimeException = new RuntimeException();
			portInUseException.when(() -> PortInUseException.ifCausedBy(eq(runtimeException), eq(ChannelBindException.class), (Consumer) any())).thenAnswer((Answer<Void>) invocation -> null);
			Duration duration = Duration.ofDays(0L);
			NettyWebServer target = spy(new NettyWebServer(httpServerMock, reactorHttpHandlerAdapterMock, duration, Shutdown.GRACEFUL, reactorResourceFactoryMock));
			doThrow(runtimeException).when(target).startHttpServer();
			//Act Statement(s)
			final WebServerException result = assertThrows(WebServerException.class, () -> {
				target.start();
			});
			WebServerException webServerException = new WebServerException("Unable to start Netty", runtimeException);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(webServerException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(runtimeException.getClass())));
				verify(httpServerMock).channelGroup((DefaultChannelGroup) any());
				_assert.verify(() -> Assert.notNull(httpServerMock, "HttpServer must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null"), atLeast(1));
				portInUseException.verify(() -> PortInUseException.ifCausedBy(eq(runtimeException), eq(ChannelBindException.class), (Consumer) any()));
				verify(target).startHttpServer();
			});
		}
	}

	//Sapient generated method id: ${0ddf8d8d-d5b0-38a7-b7c5-cac2269b84ec}
	@Disabled(value = "Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void startWhenMessageNotIsEmpty() throws Exception {
		/* Branches:
		 * (this.disposableServer == null) : true
		 * (this.disposableServer != null) : true
		 * (!message.isEmpty()) : true  #  inside tryAppend method
		 * (!message.isEmpty()) : true  #  inside getStartedOnMessage method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(httpServerMock2).when(httpServerMock).channelGroup((DefaultChannelGroup) any());
			_assert.when(() -> Assert.notNull(httpServerMock, "HttpServer must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Duration duration = Duration.ofDays(0L);
			NettyWebServer target = spy(new NettyWebServer(httpServerMock, reactorHttpHandlerAdapterMock, duration, Shutdown.GRACEFUL, reactorResourceFactoryMock));
			doReturn(disposableServerMock).when(target).startHttpServer();
			//Act Statement(s)
			target.start();
			//Assert statement(s)
			assertAll("result", () -> {
				verify(httpServerMock).channelGroup((DefaultChannelGroup) any());
				_assert.verify(() -> Assert.notNull(httpServerMock, "HttpServer must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null"), atLeast(1));
				verify(target).startHttpServer();
			});
		}
	}

	//Sapient generated method id: ${2f756cfd-6e81-3c62-ac9c-d23db7d41cbb}
	@Disabled(value = "Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void startWhenMessageIsEmptyAndMessageIsEmpty() throws Exception {
		/* Branches:
		 * (this.disposableServer == null) : true
		 * (this.disposableServer != null) : true
		 * (!message.isEmpty()) : false  #  inside tryAppend method
		 * (!message.isEmpty()) : false  #  inside getStartedOnMessage method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(httpServerMock2).when(httpServerMock).channelGroup((DefaultChannelGroup) any());
			_assert.when(() -> Assert.notNull(httpServerMock, "HttpServer must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Duration duration = Duration.ofDays(0L);
			NettyWebServer target = spy(new NettyWebServer(httpServerMock, reactorHttpHandlerAdapterMock, duration, Shutdown.GRACEFUL, reactorResourceFactoryMock));
			doReturn(disposableServerMock).when(target).startHttpServer();
			//Act Statement(s)
			target.start();
			//Assert statement(s)
			assertAll("result", () -> {
				verify(httpServerMock).channelGroup((DefaultChannelGroup) any());
				_assert.verify(() -> Assert.notNull(httpServerMock, "HttpServer must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null"), atLeast(1));
				verify(target).startHttpServer();
			});
		}
	}

	//Sapient generated method id: ${28d4366e-3e72-3291-b332-fb7ff30b004a}
	@Disabled(value = "Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void startWhenCaughtUnsupportedOperationExceptionAndMessageNotIsEmpty() throws Exception {
		/* Branches:
		 * (this.disposableServer == null) : true
		 * (this.disposableServer != null) : true
		 * (!message.isEmpty()) : true  #  inside tryAppend method
		 * (catch-exception (UnsupportedOperationException)) : true  #  inside tryAppend method
		 * (!message.isEmpty()) : true  #  inside getStartedOnMessage method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(httpServerMock2).when(httpServerMock).channelGroup((DefaultChannelGroup) any());
			_assert.when(() -> Assert.notNull(httpServerMock, "HttpServer must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Duration duration = Duration.ofDays(0L);
			NettyWebServer target = spy(new NettyWebServer(httpServerMock, reactorHttpHandlerAdapterMock, duration, Shutdown.GRACEFUL, reactorResourceFactoryMock));
			doReturn(disposableServerMock).when(target).startHttpServer();
			//Act Statement(s)
			target.start();
			//Assert statement(s)
			assertAll("result", () -> {
				verify(httpServerMock).channelGroup((DefaultChannelGroup) any());
				_assert.verify(() -> Assert.notNull(httpServerMock, "HttpServer must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null"), atLeast(1));
				verify(target).startHttpServer();
			});
		}
	}

	//Sapient generated method id: ${3a3c62e0-777e-3085-a8a7-03b37587ddd9}
	@Test()
	void getStartedLogMessageWhenMessageNotIsEmptyThrowsNullPointerException() {
		/* Branches:
		 * (!message.isEmpty()) : true  #  inside tryAppend method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(httpServerMock2).when(httpServerMock).channelGroup((DefaultChannelGroup) any());
			_assert.when(() -> Assert.notNull(httpServerMock, "HttpServer must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Duration duration = Duration.ofDays(0L);
			NettyWebServer target = new NettyWebServer(httpServerMock, reactorHttpHandlerAdapterMock, duration, Shutdown.GRACEFUL, reactorResourceFactoryMock);
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				target.getStartedLogMessage();
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(httpServerMock).channelGroup((DefaultChannelGroup) any());
				_assert.verify(() -> Assert.notNull(httpServerMock, "HttpServer must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${23766eb2-3625-3220-8235-f483c4104bf8}
	@Test()
	void getStartedLogMessageWhenMessageIsEmptyThrowsNullPointerException() {
		/* Branches:
		 * (!message.isEmpty()) : false  #  inside tryAppend method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(httpServerMock2).when(httpServerMock).channelGroup((DefaultChannelGroup) any());
			_assert.when(() -> Assert.notNull(httpServerMock, "HttpServer must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Duration duration = Duration.ofDays(0L);
			NettyWebServer target = new NettyWebServer(httpServerMock, reactorHttpHandlerAdapterMock, duration, Shutdown.GRACEFUL, reactorResourceFactoryMock);
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				target.getStartedLogMessage();
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(httpServerMock).channelGroup((DefaultChannelGroup) any());
				_assert.verify(() -> Assert.notNull(httpServerMock, "HttpServer must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${2c3c3d34-d7d2-3fb3-8f99-cab289e9e521}
	@Test()
	void startHttpServerWhenThisLifecycleTimeoutIsNotNull() {
		/* Branches:
		 * (this.routeProviders.isEmpty()) : true
		 * (this.resourceFactory != null) : true
		 * (this.lifecycleTimeout != null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(httpServerMock2).when(httpServerMock).channelGroup((DefaultChannelGroup) any());
			doReturn(httpServerMock3).when(httpServerMock2).handle(reactorHttpHandlerAdapterMock);
			doReturn(httpServerMock4).when(httpServerMock3).runOn(loopResourcesMock);
			doReturn(disposableServerMock).when(httpServerMock4).bindNow((Duration) any());
			_assert.when(() -> Assert.notNull(httpServerMock, "HttpServer must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(loopResourcesMock, "No LoopResources: is ReactorResourceFactory not initialized yet?")).thenAnswer((Answer<Void>) invocation -> null);
			Duration duration = Duration.ofDays(0L);
			ReactorResourceFactory reactorResourceFactory = new ReactorResourceFactory();
			reactorResourceFactory.setLoopResources(loopResourcesMock);
			NettyWebServer target = new NettyWebServer(httpServerMock, reactorHttpHandlerAdapterMock, duration, Shutdown.GRACEFUL, reactorResourceFactory);
			//Act Statement(s)
			DisposableServer result = target.startHttpServer();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(disposableServerMock));
				verify(httpServerMock).channelGroup((DefaultChannelGroup) any());
				verify(httpServerMock2).handle(reactorHttpHandlerAdapterMock);
				verify(httpServerMock3).runOn(loopResourcesMock);
				verify(httpServerMock4).bindNow((Duration) any());
				_assert.verify(() -> Assert.notNull(httpServerMock, "HttpServer must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(loopResourcesMock, "No LoopResources: is ReactorResourceFactory not initialized yet?"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${48545015-e515-384c-8df8-4b319b313123}
	@Test()
	void startHttpServerWhenThisLifecycleTimeoutIsNull() {
		/* Branches:
		 * (this.routeProviders.isEmpty()) : true
		 * (this.resourceFactory != null) : true
		 * (this.lifecycleTimeout != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(httpServerMock2).when(httpServerMock).channelGroup((DefaultChannelGroup) any());
			doReturn(httpServerMock3).when(httpServerMock2).handle(reactorHttpHandlerAdapterMock);
			doReturn(httpServerMock4).when(httpServerMock3).runOn(loopResourcesMock);
			doReturn(disposableServerMock).when(httpServerMock4).bindNow();
			_assert.when(() -> Assert.notNull(httpServerMock, "HttpServer must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(loopResourcesMock, "No LoopResources: is ReactorResourceFactory not initialized yet?")).thenAnswer((Answer<Void>) invocation -> null);
			ReactorResourceFactory reactorResourceFactory = new ReactorResourceFactory();
			reactorResourceFactory.setLoopResources(loopResourcesMock);
			NettyWebServer target = new NettyWebServer(httpServerMock, reactorHttpHandlerAdapterMock, (Duration) null, Shutdown.GRACEFUL, reactorResourceFactory);
			//Act Statement(s)
			DisposableServer result = target.startHttpServer();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(disposableServerMock));
				verify(httpServerMock).channelGroup((DefaultChannelGroup) any());
				verify(httpServerMock2).handle(reactorHttpHandlerAdapterMock);
				verify(httpServerMock3).runOn(loopResourcesMock);
				verify(httpServerMock4).bindNow();
				_assert.verify(() -> Assert.notNull(httpServerMock, "HttpServer must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(loopResourcesMock, "No LoopResources: is ReactorResourceFactory not initialized yet?"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${13fd2f5c-530b-37a2-a9c9-4f453a233bea}
	@Test()
	void shutDownGracefullyWhenThisGracefulShutdownIsNotNull() {
		/* Branches:
		 * (this.gracefulShutdown == null) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: gracefulShutdown
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		GracefulShutdownCallback gracefulShutdownCallbackMock = mock(GracefulShutdownCallback.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(httpServerMock2).when(httpServerMock).channelGroup((DefaultChannelGroup) any());
			_assert.when(() -> Assert.notNull(httpServerMock, "HttpServer must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Duration duration = Duration.ofDays(0L);
			NettyWebServer target = new NettyWebServer(httpServerMock, reactorHttpHandlerAdapterMock, duration, Shutdown.GRACEFUL, reactorResourceFactoryMock);
			//Act Statement(s)
			target.shutDownGracefully(gracefulShutdownCallbackMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(httpServerMock).channelGroup((DefaultChannelGroup) any());
				_assert.verify(() -> Assert.notNull(httpServerMock, "HttpServer must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${8f51485c-bf48-332b-88f8-337daade18ad}
	@Test()
	void stopWhenThisDisposableServerIsNull() throws WebServerException {
		/* Branches:
		 * (this.disposableServer != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(httpServerMock2).when(httpServerMock).channelGroup((DefaultChannelGroup) any());
			_assert.when(() -> Assert.notNull(httpServerMock, "HttpServer must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Duration duration = Duration.ofDays(0L);
			NettyWebServer target = new NettyWebServer(httpServerMock, reactorHttpHandlerAdapterMock, duration, Shutdown.GRACEFUL, reactorResourceFactoryMock);
			//Act Statement(s)
			target.stop();
			//Assert statement(s)
			assertAll("result", () -> {
				verify(httpServerMock).channelGroup((DefaultChannelGroup) any());
				_assert.verify(() -> Assert.notNull(httpServerMock, "HttpServer must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${221b00d4-ba7f-346f-857f-f7fcb074dfd6}
	@Test()
	void getPortWhenThisDisposableServerIsNull() {
		/* Branches:
		 * (this.disposableServer != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(httpServerMock2).when(httpServerMock).channelGroup((DefaultChannelGroup) any());
			_assert.when(() -> Assert.notNull(httpServerMock, "HttpServer must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Duration duration = Duration.ofDays(0L);
			NettyWebServer target = new NettyWebServer(httpServerMock, reactorHttpHandlerAdapterMock, duration, Shutdown.GRACEFUL, reactorResourceFactoryMock);
			//Act Statement(s)
			int result = target.getPort();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(-1));
				verify(httpServerMock).channelGroup((DefaultChannelGroup) any());
				_assert.verify(() -> Assert.notNull(httpServerMock, "HttpServer must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null"), atLeast(1));
			});
		}
	}
}
