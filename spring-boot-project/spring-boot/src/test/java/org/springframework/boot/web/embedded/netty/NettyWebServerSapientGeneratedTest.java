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
import io.netty.util.concurrent.EventExecutor;
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

    private final EventExecutor eventExecutorMock = mock(EventExecutor.class);

    private final HttpServer httpServerMock = mock(HttpServer.class);

    private final HttpServer httpServerMock2 = mock(HttpServer.class);

    private final HttpServer httpServerMock3 = mock(HttpServer.class);

    private final HttpServer httpServerMock4 = mock(HttpServer.class);

    private final LoopResources loopResourcesMock = mock(LoopResources.class);

    private final ReactorHttpHandlerAdapter reactorHttpHandlerAdapterMock = mock(ReactorHttpHandlerAdapter.class);

    private final ReactorResourceFactory reactorResourceFactoryMock = mock(ReactorResourceFactory.class);

    //Sapient generated method id: ${startWhenCaughtExceptionThrowsWebServerException}, hash: C35F80C25C090224DA9B08EB5A8F2284
    @Disabled()
    @Test()
    void startWhenCaughtExceptionThrowsWebServerException() throws WebServerException {
        /* Branches:
         * (this.disposableServer == null) : true
         * (catch-exception (Exception)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<PortInUseException> portInUseException = mockStatic(PortInUseException.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            DefaultChannelGroup defaultChannelGroup = new DefaultChannelGroup(eventExecutorMock);
            doReturn(httpServerMock2).when(httpServerMock).channelGroup(defaultChannelGroup);
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
                verify(httpServerMock).channelGroup(defaultChannelGroup);
                _assert.verify(() -> Assert.notNull(httpServerMock, "HttpServer must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null"), atLeast(1));
                portInUseException.verify(() -> PortInUseException.ifCausedBy(eq(runtimeException), eq(ChannelBindException.class), (Consumer) any()));
                verify(target).startHttpServer();
            });
        }
    }

    //Sapient generated method id: ${startWhenMessageNotIsEmpty}, hash: 67E4EA7F4978F219748231E0ED3BBDB4
    @Disabled()
    @Test()
    void startWhenMessageNotIsEmpty() throws Exception {
        /* Branches:
         * (this.disposableServer == null) : true
         * (this.disposableServer != null) : true
         * (!message.isEmpty()) : false  #  inside tryAppend method
         * (!message.isEmpty()) : true  #  inside getStartedOnMessage method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            DefaultChannelGroup defaultChannelGroup = new DefaultChannelGroup(eventExecutorMock);
            doReturn(httpServerMock2).when(httpServerMock).channelGroup(defaultChannelGroup);
            _assert.when(() -> Assert.notNull(httpServerMock, "HttpServer must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Duration duration = Duration.ofDays(0L);
            NettyWebServer target = spy(new NettyWebServer(httpServerMock, reactorHttpHandlerAdapterMock, duration, Shutdown.GRACEFUL, reactorResourceFactoryMock));
            doReturn(disposableServerMock).when(target).startHttpServer();
            //Act Statement(s)
            target.start();
            //Assert statement(s)
            assertAll("result", () -> {
                verify(httpServerMock).channelGroup(defaultChannelGroup);
                _assert.verify(() -> Assert.notNull(httpServerMock, "HttpServer must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null"), atLeast(1));
                verify(target).startHttpServer();
            });
        }
    }

    //Sapient generated method id: ${startWhenMessageIsEmpty}, hash: 21445A61E47E2E4E0F0BF0043B4826B0
    @Disabled()
    @Test()
    void startWhenMessageIsEmpty() throws Exception {
        /* Branches:
         * (this.disposableServer == null) : true
         * (this.disposableServer != null) : true
         * (!message.isEmpty()) : false  #  inside tryAppend method
         * (!message.isEmpty()) : false  #  inside getStartedOnMessage method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            DefaultChannelGroup defaultChannelGroup = new DefaultChannelGroup(eventExecutorMock);
            doReturn(httpServerMock2).when(httpServerMock).channelGroup(defaultChannelGroup);
            _assert.when(() -> Assert.notNull(httpServerMock, "HttpServer must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Duration duration = Duration.ofDays(0L);
            NettyWebServer target = spy(new NettyWebServer(httpServerMock, reactorHttpHandlerAdapterMock, duration, Shutdown.GRACEFUL, reactorResourceFactoryMock));
            doReturn(disposableServerMock).when(target).startHttpServer();
            //Act Statement(s)
            target.start();
            //Assert statement(s)
            assertAll("result", () -> {
                verify(httpServerMock).channelGroup(defaultChannelGroup);
                _assert.verify(() -> Assert.notNull(httpServerMock, "HttpServer must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null"), atLeast(1));
                verify(target).startHttpServer();
            });
        }
    }

    //Sapient generated method id: ${startWhenCaughtUnsupportedOperationExceptionAndMessageNotIsEmpty}, hash: 589295A8C321C969DDF9F6CFB4C9CBDC
    @Disabled()
    @Test()
    void startWhenCaughtUnsupportedOperationExceptionAndMessageNotIsEmpty() throws Exception {
        /* Branches:
         * (this.disposableServer == null) : true
         * (this.disposableServer != null) : true
         * (!message.isEmpty()) : false  #  inside tryAppend method
         * (catch-exception (UnsupportedOperationException)) : true  #  inside tryAppend method
         * (!message.isEmpty()) : true  #  inside getStartedOnMessage method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            DefaultChannelGroup defaultChannelGroup = new DefaultChannelGroup(eventExecutorMock);
            doReturn(httpServerMock2).when(httpServerMock).channelGroup(defaultChannelGroup);
            _assert.when(() -> Assert.notNull(httpServerMock, "HttpServer must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Duration duration = Duration.ofDays(0L);
            NettyWebServer target = spy(new NettyWebServer(httpServerMock, reactorHttpHandlerAdapterMock, duration, Shutdown.GRACEFUL, reactorResourceFactoryMock));
            doReturn(disposableServerMock).when(target).startHttpServer();
            //Act Statement(s)
            target.start();
            //Assert statement(s)
            assertAll("result", () -> {
                verify(httpServerMock).channelGroup(defaultChannelGroup);
                _assert.verify(() -> Assert.notNull(httpServerMock, "HttpServer must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null"), atLeast(1));
                verify(target).startHttpServer();
            });
        }
    }

    //Sapient generated method id: ${startWhenMessageIsEmptyAndCaughtUnsupportedOperationExceptionAndMessageNotIsEmpty}, hash: 55E780E0FCF4BBB610E0F361A5E49CBB
    @Disabled()
    @Test()
    void startWhenMessageIsEmptyAndCaughtUnsupportedOperationExceptionAndMessageNotIsEmpty() throws Exception {
        /* Branches:
         * (this.disposableServer == null) : true
         * (this.disposableServer != null) : true
         * (!message.isEmpty()) : false  #  inside tryAppend method
         * (catch-exception (UnsupportedOperationException)) : true  #  inside tryAppend method
         * (!message.isEmpty()) : true  #  inside getStartedOnMessage method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            DefaultChannelGroup defaultChannelGroup = new DefaultChannelGroup(eventExecutorMock);
            doReturn(httpServerMock2).when(httpServerMock).channelGroup(defaultChannelGroup);
            _assert.when(() -> Assert.notNull(httpServerMock, "HttpServer must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Duration duration = Duration.ofDays(0L);
            NettyWebServer target = spy(new NettyWebServer(httpServerMock, reactorHttpHandlerAdapterMock, duration, Shutdown.GRACEFUL, reactorResourceFactoryMock));
            doReturn(disposableServerMock).when(target).startHttpServer();
            //Act Statement(s)
            target.start();
            //Assert statement(s)
            assertAll("result", () -> {
                verify(httpServerMock).channelGroup(defaultChannelGroup);
                _assert.verify(() -> Assert.notNull(httpServerMock, "HttpServer must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null"), atLeast(1));
                verify(target).startHttpServer();
            });
        }
    }

    //Sapient generated method id: ${getStartedLogMessageWhenMessageIsEmptyThrowsNullPointerException}, hash: E477673207E5B76B91CABEFF7C12EF0F
    @Disabled()
    @Test()
    void getStartedLogMessageWhenMessageIsEmptyThrowsNullPointerException() {
        /* Branches:
         * (!message.isEmpty()) : false  #  inside tryAppend method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: supplier - Method: get
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            DefaultChannelGroup defaultChannelGroup = new DefaultChannelGroup(eventExecutorMock);
            doReturn(httpServerMock2).when(httpServerMock).channelGroup(defaultChannelGroup);
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
                verify(httpServerMock).channelGroup(defaultChannelGroup);
                _assert.verify(() -> Assert.notNull(httpServerMock, "HttpServer must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${startHttpServerWhenThisLifecycleTimeoutIsNotNull}, hash: A2332FFD7AF868394DE117ECA5507A62
    @Disabled()
    @Test()
    void startHttpServerWhenThisLifecycleTimeoutIsNotNull() {
        /* Branches:
         * (this.routeProviders.isEmpty()) : true
         * (this.resourceFactory != null) : true
         * (this.lifecycleTimeout != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            DefaultChannelGroup defaultChannelGroup = new DefaultChannelGroup(eventExecutorMock);
            doReturn(httpServerMock2).when(httpServerMock).channelGroup(defaultChannelGroup);
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
                verify(httpServerMock).channelGroup(defaultChannelGroup);
                verify(httpServerMock2).handle(reactorHttpHandlerAdapterMock);
                verify(httpServerMock3).runOn(loopResourcesMock);
                verify(httpServerMock4).bindNow((Duration) any());
                _assert.verify(() -> Assert.notNull(httpServerMock, "HttpServer must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(loopResourcesMock, "No LoopResources: is ReactorResourceFactory not initialized yet?"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${startHttpServerWhenThisLifecycleTimeoutIsNull}, hash: D4EEB2E93655EA40F90CC375433E988F
    @Disabled()
    @Test()
    void startHttpServerWhenThisLifecycleTimeoutIsNull() {
        /* Branches:
         * (this.routeProviders.isEmpty()) : true
         * (this.resourceFactory != null) : true
         * (this.lifecycleTimeout != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            DefaultChannelGroup defaultChannelGroup = new DefaultChannelGroup(eventExecutorMock);
            doReturn(httpServerMock2).when(httpServerMock).channelGroup(defaultChannelGroup);
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
                verify(httpServerMock).channelGroup(defaultChannelGroup);
                verify(httpServerMock2).handle(reactorHttpHandlerAdapterMock);
                verify(httpServerMock3).runOn(loopResourcesMock);
                verify(httpServerMock4).bindNow();
                _assert.verify(() -> Assert.notNull(httpServerMock, "HttpServer must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(loopResourcesMock, "No LoopResources: is ReactorResourceFactory not initialized yet?"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${shutDownGracefullyWhenThisGracefulShutdownIsNotNull}, hash: 6CE5BA9EF19CE00F7A08182336CC6E6A
    @Disabled()
    @Test()
    void shutDownGracefullyWhenThisGracefulShutdownIsNotNull() {
        /* Branches:
         * (this.gracefulShutdown == null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: gracefulShutdown - Method: shutDownGracefully
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        GracefulShutdownCallback gracefulShutdownCallbackMock = mock(GracefulShutdownCallback.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            DefaultChannelGroup defaultChannelGroup = new DefaultChannelGroup(eventExecutorMock);
            doReturn(httpServerMock2).when(httpServerMock).channelGroup(defaultChannelGroup);
            _assert.when(() -> Assert.notNull(httpServerMock, "HttpServer must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Duration duration = Duration.ofDays(0L);
            NettyWebServer target = new NettyWebServer(httpServerMock, reactorHttpHandlerAdapterMock, duration, Shutdown.GRACEFUL, reactorResourceFactoryMock);
            //Act Statement(s)
            target.shutDownGracefully(gracefulShutdownCallbackMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(httpServerMock).channelGroup(defaultChannelGroup);
                _assert.verify(() -> Assert.notNull(httpServerMock, "HttpServer must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${stopWhenThisDisposableServerIsNull}, hash: 859AD931D36CA59A09226437272C4E39
    @Disabled()
    @Test()
    void stopWhenThisDisposableServerIsNull() throws WebServerException {
        /* Branches:
         * (this.disposableServer != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            DefaultChannelGroup defaultChannelGroup = new DefaultChannelGroup(eventExecutorMock);
            doReturn(httpServerMock2).when(httpServerMock).channelGroup(defaultChannelGroup);
            _assert.when(() -> Assert.notNull(httpServerMock, "HttpServer must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Duration duration = Duration.ofDays(0L);
            NettyWebServer target = new NettyWebServer(httpServerMock, reactorHttpHandlerAdapterMock, duration, Shutdown.GRACEFUL, reactorResourceFactoryMock);
            //Act Statement(s)
            target.stop();
            //Assert statement(s)
            assertAll("result", () -> {
                verify(httpServerMock).channelGroup(defaultChannelGroup);
                _assert.verify(() -> Assert.notNull(httpServerMock, "HttpServer must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getPortWhenThisDisposableServerIsNull}, hash: E7C36F8F4568FE41635A0B1789CFF570
    @Disabled()
    @Test()
    void getPortWhenThisDisposableServerIsNull() {
        /* Branches:
         * (this.disposableServer != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            DefaultChannelGroup defaultChannelGroup = new DefaultChannelGroup(eventExecutorMock);
            doReturn(httpServerMock2).when(httpServerMock).channelGroup(defaultChannelGroup);
            _assert.when(() -> Assert.notNull(httpServerMock, "HttpServer must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Duration duration = Duration.ofDays(0L);
            NettyWebServer target = new NettyWebServer(httpServerMock, reactorHttpHandlerAdapterMock, duration, Shutdown.GRACEFUL, reactorResourceFactoryMock);
            //Act Statement(s)
            int result = target.getPort();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                verify(httpServerMock).channelGroup(defaultChannelGroup);
                _assert.verify(() -> Assert.notNull(httpServerMock, "HttpServer must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(reactorHttpHandlerAdapterMock, "HandlerAdapter must not be null"), atLeast(1));
            });
        }
    }
}
