package org.springframework.boot.web.embedded.undertow;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.boot.web.server.WebServerException;
import java.util.List;
import io.undertow.Undertow;
import org.springframework.util.StringUtils;
import io.undertow.server.HttpHandler;
import org.springframework.boot.web.server.GracefulShutdownCallback;
import org.xnio.channels.BoundChannel;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.function.Consumer;
import org.mockito.stubbing.Answer;
import java.lang.reflect.Field;
import java.net.SocketAddress;
import org.springframework.boot.web.server.PortInUseException;
import io.undertow.server.handlers.GracefulShutdownHandler;
import org.mockito.MockedStatic;
import org.springframework.boot.web.server.GracefulShutdownResult;
import org.springframework.util.ReflectionUtils;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
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
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UndertowWebServerSapientGeneratedTest {

    private final Undertow.Builder builderMock = mock(Undertow.Builder.class, "builder");

    private final Undertow undertowMock = mock(Undertow.class, "undertow");

    private final BoundChannel boundChannelMock = mock(BoundChannel.class);

    private final Field fieldMock = mock(Field.class);

    private final HttpHandler httpHandlerMock = mock(HttpHandler.class);

    private final SocketAddress socketAddressMock = mock(SocketAddress.class);

    private final Undertow.Builder undertowBuilderMock = mock(Undertow.Builder.class);

    //Sapient generated method id: ${startWhenThisNotAutoStart}, hash: 680617E7115BD4D854B8B32D322A9A6E
    @Test()
    void startWhenThisNotAutoStart() throws Exception {
        /* Branches:
         * (this.started) : false
         * (!this.autoStart) : true
         */
        //Arrange Statement(s)
        Iterable<HttpHandlerFactory> iterable = new ArrayList<>();
        UndertowWebServer target = new UndertowWebServer(builderMock, iterable, false);
        //Act Statement(s)
        target.start();
    }

    //Sapient generated method id: ${startWhenThisUndertowIsNull}, hash: 24AACB5F8B626A9BAC85CA4D884F601D
    @Test()
    void startWhenThisUndertowIsNull() throws Exception {
        /* Branches:
         * (this.started) : false
         * (!this.autoStart) : false
         * (this.undertow == null) : true
         */
        //Arrange Statement(s)
        Iterable<HttpHandlerFactory> iterable = new ArrayList<>();
        UndertowWebServer target = spy(new UndertowWebServer(builderMock, iterable, true));
        doReturn(httpHandlerMock).when(target).createHttpHandler();
        doReturn(undertowBuilderMock).when(builderMock).setHandler(httpHandlerMock);
        doReturn(undertowMock).when(builderMock).build();
        doNothing().when(undertowMock).start();
        doReturn("return_of_getStartLogMessage1").when(target).getStartLogMessage();
        //Act Statement(s)
        target.start();
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).createHttpHandler();
            verify(builderMock).setHandler(httpHandlerMock);
            verify(builderMock).build();
            verify(undertowMock).start();
            verify(target).getStartLogMessage();
        });
    }

    //Sapient generated method id: ${startWhenThisUndertowIsNullAndCaughtExceptionThrowsWebServerException}, hash: B71DE25A7F6F457308C5C2501419F57D
    @Test()
    void startWhenThisUndertowIsNullAndCaughtExceptionThrowsWebServerException() throws WebServerException {
        /* Branches:
         * (this.started) : false
         * (!this.autoStart) : false
         * (this.undertow == null) : true
         * (catch-exception (Exception)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<PortInUseException> portInUseException = mockStatic(PortInUseException.class)) {
            RuntimeException runtimeException = new RuntimeException();
            portInUseException.when(() -> PortInUseException.ifPortBindingException(eq(runtimeException), (Consumer) any())).thenAnswer((Answer<Void>) invocation -> null);
            Iterable<HttpHandlerFactory> iterable = new ArrayList<>();
            UndertowWebServer target = spy(new UndertowWebServer(builderMock, iterable, true));
            doReturn(httpHandlerMock).when(target).createHttpHandler();
            doReturn(undertowBuilderMock).when(builderMock).setHandler(httpHandlerMock);
            doReturn(undertowMock).when(builderMock).build();
            doNothing().when(undertowMock).start();
            doThrow(runtimeException).when(target).getStartLogMessage();
            //Act Statement(s)
            final WebServerException result = assertThrows(WebServerException.class, () -> {
                target.start();
            });
            WebServerException webServerException = new WebServerException("Unable to start embedded Undertow", runtimeException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(webServerException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(runtimeException.getClass())));
                portInUseException.verify(() -> PortInUseException.ifPortBindingException(eq(runtimeException), (Consumer) any()));
                verify(target).createHttpHandler();
                verify(builderMock).setHandler(httpHandlerMock);
                verify(builderMock).build();
                verify(undertowMock).start();
                verify(target).getStartLogMessage();
            });
        }
    }

    //Sapient generated method id: ${createHttpHandlerWhenHandlerInstanceOfGracefulShutdownHandler}, hash: 98F6395D7437E73F2307390881E80F78
    @Test()
    void createHttpHandlerWhenHandlerInstanceOfGracefulShutdownHandler() {
        /* Branches:
         * (for-each(this.httpHandlerFactories)) : true
         * (handler instanceof Closeable closeable) : false
         * (handler instanceof GracefulShutdownHandler shutdownHandler) : true
         */
        //Arrange Statement(s)
        HttpHandlerFactory factoryMock = mock(HttpHandlerFactory.class);
        GracefulShutdownHandler gracefulShutdownHandlerMock = mock(GracefulShutdownHandler.class);
        doReturn(gracefulShutdownHandlerMock).when(factoryMock).getHandler((HttpHandler) null);
        Iterable<HttpHandlerFactory> iterable = new ArrayList<>(List.of(factoryMock));
        UndertowWebServer target = new UndertowWebServer(builderMock, iterable, false);
        //Act Statement(s)
        HttpHandler result = target.createHttpHandler();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(gracefulShutdownHandlerMock));
            verify(factoryMock).getHandler((HttpHandler) null);
        });
    }

    //Sapient generated method id: ${stopWhenThisNotStarted}, hash: 12C96E28707C175E06AF372D9D8D510C
    @Test()
    void stopWhenThisNotStarted() throws Exception {
        /* Branches:
         * (!this.started) : true
         */
        //Arrange Statement(s)
        Iterable<HttpHandlerFactory> iterable = new ArrayList<>();
        UndertowWebServer target = new UndertowWebServer(builderMock, iterable, false);
        //Act Statement(s)
        target.stop();
    }

    //Sapient generated method id: ${getPortWhenPortsNotIsEmpty}, hash: 40D265433246C53DD7834A27C3EF6B09
    @Disabled()
    @Test()
    void getPortWhenPortsNotIsEmpty() throws Exception {
        /* Branches:
         * (!this.autoStart) : true  #  inside getActualPorts method
         * (ports.isEmpty()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type UndertowWebServer.Port - Method: getNumber
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Iterable<HttpHandlerFactory> iterable = new ArrayList<>();
        UndertowWebServer target = new UndertowWebServer(builderMock, iterable, false);
        //Act Statement(s)
        int result = target.getPort();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${getPortWhenPortsIsEmpty}, hash: C9D4C3DC1BFB240A7AA3E191E009EE20
    @Test()
    void getPortWhenPortsIsEmpty() throws Exception {
        /* Branches:
         * (!this.autoStart) : false  #  inside getActualPorts method
         * (for-each(extractChannels())) : false  #  inside getActualPorts method
         * (ports.isEmpty()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
            List list = new ArrayList<>();
            reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
            Iterable<HttpHandlerFactory> iterable = new ArrayList<>();
            UndertowWebServer target = new UndertowWebServer(builderMock, iterable, true);
            //Act Statement(s)
            int result = target.getPort();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getPortWhenPortsNotIsEmptyThrowsNullPointerException}, hash: 03B7B03689082A4824F0D6E4DBD2D847
    @Test()
    void getPortWhenPortsNotIsEmptyThrowsNullPointerException() {
        /* Branches:
         * (!this.autoStart) : false  #  inside getActualPorts method
         * (for-each(extractChannels())) : true  #  inside getActualPorts method
         * (socketAddress instanceof InetSocketAddress inetSocketAddress) : false  #  inside getPortFromChannel method
         * (ports.isEmpty()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
            List list = new ArrayList<>();
            list.add(boundChannelMock);
            reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
            doReturn(socketAddressMock).when(boundChannelMock).getLocalAddress();
            Iterable<HttpHandlerFactory> iterable = new ArrayList<>();
            UndertowWebServer target = new UndertowWebServer(builderMock, iterable, true);
            //Act Statement(s)
            final NullPointerException result = assertThrows(NullPointerException.class, () -> {
                target.getPort();
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
                verify(boundChannelMock, atLeast(1)).getLocalAddress();
            });
        }
    }

    //Sapient generated method id: ${getPortWhenCaughtExceptionAndPortsIsEmpty}, hash: 0D1361AA017AB928E2A42F8B16310EB3
    @Test()
    void getPortWhenCaughtExceptionAndPortsIsEmpty() throws Exception {
        /* Branches:
         * (!this.autoStart) : false  #  inside getActualPorts method
         * (catch-exception (Exception)) : true  #  inside getActualPorts method
         * (ports.isEmpty()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
            RuntimeException runtimeException = new RuntimeException();
            reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenThrow(runtimeException);
            Iterable<HttpHandlerFactory> iterable = new ArrayList<>();
            UndertowWebServer target = new UndertowWebServer(builderMock, iterable, true);
            //Act Statement(s)
            int result = target.getPort();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getPortWhenSslFieldIsNotNullAndPortsNotIsEmpty}, hash: 89CB42B4382EB0364D02854517BA5670
    @Test()
    void getPortWhenSslFieldIsNotNullAndPortsNotIsEmpty() throws Exception {
        /* Branches:
         * (!this.autoStart) : false  #  inside getActualPorts method
         * (for-each(extractChannels())) : true  #  inside getActualPorts method
         * (socketAddress instanceof InetSocketAddress inetSocketAddress) : true  #  inside getPortFromChannel method
         * (sslField != null) : true  #  inside getPortFromChannel method
         * (ports.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
            List list = new ArrayList<>();
            list.add(boundChannelMock);
            reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            doReturn(inetSocketAddress).when(boundChannelMock).getLocalAddress();
            reflectionUtils.when(() -> ReflectionUtils.findField(BoundChannel.class, "ssl")).thenReturn(fieldMock);
            Iterable<HttpHandlerFactory> iterable = new ArrayList<>();
            UndertowWebServer target = new UndertowWebServer(builderMock, iterable, true);
            //Act Statement(s)
            int result = target.getPort();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
                verify(boundChannelMock, atLeast(1)).getLocalAddress();
                reflectionUtils.verify(() -> ReflectionUtils.findField(BoundChannel.class, "ssl"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getPortWhenSslFieldIsNullAndPortsNotIsEmpty}, hash: A1CD260200B25EA3C5870C18E43740AC
    @Test()
    void getPortWhenSslFieldIsNullAndPortsNotIsEmpty() throws Exception {
        /* Branches:
         * (!this.autoStart) : false  #  inside getActualPorts method
         * (for-each(extractChannels())) : true  #  inside getActualPorts method
         * (socketAddress instanceof InetSocketAddress inetSocketAddress) : true  #  inside getPortFromChannel method
         * (sslField != null) : false  #  inside getPortFromChannel method
         * (ports.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
            List list = new ArrayList<>();
            list.add(boundChannelMock);
            reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            doReturn(inetSocketAddress).when(boundChannelMock).getLocalAddress();
            reflectionUtils.when(() -> ReflectionUtils.findField(BoundChannel.class, "ssl")).thenReturn(null);
            Iterable<HttpHandlerFactory> iterable = new ArrayList<>();
            UndertowWebServer target = new UndertowWebServer(builderMock, iterable, true);
            //Act Statement(s)
            int result = target.getPort();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
                verify(boundChannelMock, atLeast(1)).getLocalAddress();
                reflectionUtils.verify(() -> ReflectionUtils.findField(BoundChannel.class, "ssl"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getPortWhenCaughtExceptionAndPortsNotIsEmptyThrowsNullPointerException}, hash: 1CC760C243EABD050E46FE68A927B7B4
    @Test()
    void getPortWhenCaughtExceptionAndPortsNotIsEmptyThrowsNullPointerException() throws Exception {
        /* Branches:
         * (!this.autoStart) : false  #  inside getActualPorts method
         * (for-each(extractChannels())) : true  #  inside getActualPorts method
         * (catch-exception (Exception)) : true  #  inside getActualPorts method
         * (ports.isEmpty()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
            List list = new ArrayList<>();
            list.add(boundChannelMock);
            reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
            RuntimeException runtimeException = new RuntimeException();
            doThrow(runtimeException).when(boundChannelMock).getLocalAddress();
            Iterable<HttpHandlerFactory> iterable = new ArrayList<>();
            UndertowWebServer target = new UndertowWebServer(builderMock, iterable, true);
            //Act Statement(s)
            int result = target.getPort();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
                verify(boundChannelMock, atLeast(1)).getLocalAddress();
            });
        }
    }

    //Sapient generated method id: ${getPortWhenCaughtExceptionAndPortsNotIsEmpty}, hash: 87E7E368C44AD48CF36E7C841B63475E
    @Test()
    void getPortWhenCaughtExceptionAndPortsNotIsEmpty() throws Exception {
        /* Branches:
         * (!this.autoStart) : false  #  inside getActualPorts method
         * (for-each(extractChannels())) : true  #  inside getActualPorts method
         * (socketAddress instanceof InetSocketAddress inetSocketAddress) : true  #  inside getPortFromChannel method
         * (sslField != null) : true  #  inside getPortFromChannel method
         * (catch-exception (Exception)) : true  #  inside getActualPorts method
         * (ports.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
            List list = new ArrayList<>();
            list.add(boundChannelMock);
            reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            doReturn(inetSocketAddress).when(boundChannelMock).getLocalAddress();
            reflectionUtils.when(() -> ReflectionUtils.findField(BoundChannel.class, "ssl")).thenReturn(fieldMock);
            Iterable<HttpHandlerFactory> iterable = new ArrayList<>();
            UndertowWebServer target = new UndertowWebServer(builderMock, iterable, true);
            //Act Statement(s)
            int result = target.getPort();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
                verify(boundChannelMock, atLeast(1)).getLocalAddress();
                reflectionUtils.verify(() -> ReflectionUtils.findField(BoundChannel.class, "ssl"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${shutDownGracefullyWhenThisGracefulShutdownIsNull}, hash: 22B68BB6473AFCC62555EF47A376BEE4
    @Test()
    void shutDownGracefullyWhenThisGracefulShutdownIsNull() {
        /* Branches:
         * (this.gracefulShutdown == null) : true
         */
        //Arrange Statement(s)
        GracefulShutdownCallback callbackMock = mock(GracefulShutdownCallback.class);
        doNothing().when(callbackMock).shutdownComplete(GracefulShutdownResult.IMMEDIATE);
        Iterable<HttpHandlerFactory> iterable = new ArrayList<>();
        UndertowWebServer target = new UndertowWebServer(builderMock, iterable, false);
        //Act Statement(s)
        target.shutDownGracefully(callbackMock);
        //Assert statement(s)
        assertAll("result", () -> verify(callbackMock).shutdownComplete(GracefulShutdownResult.IMMEDIATE));
    }

    //Sapient generated method id: ${getStartLogMessageWhenPortsNotIsEmpty}, hash: B14C27DC599C685C4F6E8853BF586792
    @Disabled()
    @Test()
    void getStartLogMessageWhenPortsNotIsEmpty() throws Exception {
        /* Branches:
         * (!this.autoStart) : true  #  inside getActualPorts method
         * (ports.size() != 1) : false  #  inside getPortsDescription method
         * (!ports.isEmpty()) : true  #  inside getPortsDescription method
         */
        //Arrange Statement(s)
        Iterable<HttpHandlerFactory> iterable = new ArrayList<>();
        UndertowWebServer target = new UndertowWebServer(builderMock, iterable, false);
        //Act Statement(s)
        String result = target.getStartLogMessage();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("Undertow started on port null")));
    }

    //Sapient generated method id: ${getStartLogMessageWhenPortsIsEmpty}, hash: 7DB990492756E59F498CBC4FB8A539BF
    @Test()
    void getStartLogMessageWhenPortsIsEmpty() throws Exception {
        /* Branches:
         * (!this.autoStart) : false  #  inside getActualPorts method
         * (for-each(extractChannels())) : false  #  inside getActualPorts method
         * (ports.size() != 1) : true  #  inside getPortsDescription method
         * (!ports.isEmpty()) : false  #  inside getPortsDescription method
         */
        //Arrange Statement(s)
        try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
            List list = new ArrayList<>();
            reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
            Iterable<HttpHandlerFactory> iterable = new ArrayList<>();
            UndertowWebServer target = new UndertowWebServer(builderMock, iterable, true);
            //Act Statement(s)
            String result = target.getStartLogMessage();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("Undertow started on ports unknown"));
                reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getStartLogMessageWhenPortsSizeEquals1AndPortsNotIsEmpty}, hash: E713C13CDF286E66FC66E9A3F14A46FB
    @Disabled()
    @Test()
    void getStartLogMessageWhenPortsSizeEquals1AndPortsNotIsEmpty() throws Exception {
        /* Branches:
         * (!this.autoStart) : false  #  inside getActualPorts method
         * (for-each(extractChannels())) : true  #  inside getActualPorts method
         * (socketAddress instanceof InetSocketAddress inetSocketAddress) : false  #  inside getPortFromChannel method
         * (ports.size() != 1) : false  #  inside getPortsDescription method
         * (!ports.isEmpty()) : true  #  inside getPortsDescription method
         */
        //Arrange Statement(s)
        try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
            List list = new ArrayList<>();
            list.add(boundChannelMock);
            reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
            doReturn(socketAddressMock).when(boundChannelMock).getLocalAddress();
            Iterable<HttpHandlerFactory> iterable = new ArrayList<>();
            UndertowWebServer target = new UndertowWebServer(builderMock, iterable, true);
            //Act Statement(s)
            String result = target.getStartLogMessage();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("Undertow started on port "));
                reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
                verify(boundChannelMock, atLeast(1)).getLocalAddress();
            });
        }
    }

    //Sapient generated method id: ${getStartLogMessageWhenPortsSizeNotEquals1AndPortsIsEmpty}, hash: F61D6E115A43183822D740486CB026B1
    @Test()
    void getStartLogMessageWhenPortsSizeNotEquals1AndPortsIsEmpty() throws Exception {
        /* Branches:
         * (!this.autoStart) : false  #  inside getActualPorts method
         * (catch-exception (Exception)) : true  #  inside getActualPorts method
         * (ports.size() != 1) : true  #  inside getPortsDescription method
         * (!ports.isEmpty()) : false  #  inside getPortsDescription method
         */
        //Arrange Statement(s)
        try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
            RuntimeException runtimeException = new RuntimeException();
            reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenThrow(runtimeException);
            Iterable<HttpHandlerFactory> iterable = new ArrayList<>();
            UndertowWebServer target = new UndertowWebServer(builderMock, iterable, true);
            //Act Statement(s)
            String result = target.getStartLogMessage();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("Undertow started on ports unknown"));
                reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getStartLogMessageWhenSslFieldIsNotNullAndPortsSizeEquals1AndPortsNotIsEmpty}, hash: A4E9CAD10A320FD934B653EC5747FD18
    @Disabled()
    @Test()
    void getStartLogMessageWhenSslFieldIsNotNullAndPortsSizeEquals1AndPortsNotIsEmpty() throws Exception {
        /* Branches:
         * (!this.autoStart) : false  #  inside getActualPorts method
         * (for-each(extractChannels())) : true  #  inside getActualPorts method
         * (socketAddress instanceof InetSocketAddress inetSocketAddress) : true  #  inside getPortFromChannel method
         * (sslField != null) : true  #  inside getPortFromChannel method
         * (ports.size() != 1) : false  #  inside getPortsDescription method
         * (!ports.isEmpty()) : true  #  inside getPortsDescription method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
            List list = new ArrayList<>();
            list.add(boundChannelMock);
            reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            doReturn(inetSocketAddress).when(boundChannelMock).getLocalAddress();
            reflectionUtils.when(() -> ReflectionUtils.findField(BoundChannel.class, "ssl")).thenReturn(fieldMock);
            Iterable<HttpHandlerFactory> iterable = new ArrayList<>();
            UndertowWebServer target = new UndertowWebServer(builderMock, iterable, true);
            //Act Statement(s)
            String result = target.getStartLogMessage();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("Undertow started on port null"));
                reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
                verify(boundChannelMock, atLeast(1)).getLocalAddress();
                reflectionUtils.verify(() -> ReflectionUtils.findField(BoundChannel.class, "ssl"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getStartLogMessageWhenSslFieldIsNullAndPortsSizeEquals1AndPortsNotIsEmpty}, hash: AB4F2C9EDCB27B0393904E553C1FADAA
    @Disabled()
    @Test()
    void getStartLogMessageWhenSslFieldIsNullAndPortsSizeEquals1AndPortsNotIsEmpty() throws Exception {
        /* Branches:
         * (!this.autoStart) : false  #  inside getActualPorts method
         * (for-each(extractChannels())) : true  #  inside getActualPorts method
         * (socketAddress instanceof InetSocketAddress inetSocketAddress) : true  #  inside getPortFromChannel method
         * (sslField != null) : false  #  inside getPortFromChannel method
         * (ports.size() != 1) : false  #  inside getPortsDescription method
         * (!ports.isEmpty()) : true  #  inside getPortsDescription method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
            List list = new ArrayList<>();
            list.add(boundChannelMock);
            reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            doReturn(inetSocketAddress).when(boundChannelMock).getLocalAddress();
            reflectionUtils.when(() -> ReflectionUtils.findField(BoundChannel.class, "ssl")).thenReturn(null);
            Iterable<HttpHandlerFactory> iterable = new ArrayList<>();
            UndertowWebServer target = new UndertowWebServer(builderMock, iterable, true);
            //Act Statement(s)
            String result = target.getStartLogMessage();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("Undertow started on port null"));
                reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
                verify(boundChannelMock, atLeast(1)).getLocalAddress();
                reflectionUtils.verify(() -> ReflectionUtils.findField(BoundChannel.class, "ssl"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getStartLogMessageWhenCaughtExceptionAndPortsSizeEquals1AndPortsNotIsEmpty}, hash: B05987E12512A1C8ADDD9943A4231277
    @Test()
    void getStartLogMessageWhenCaughtExceptionAndPortsSizeEquals1AndPortsNotIsEmpty() throws Exception {
        /* Branches:
         * (!this.autoStart) : false  #  inside getActualPorts method
         * (for-each(extractChannels())) : true  #  inside getActualPorts method
         * (catch-exception (Exception)) : true  #  inside getActualPorts method
         * (ports.size() != 1) : true  #  inside getPortsDescription method
         * (!ports.isEmpty()) : false  #  inside getPortsDescription method
         */
        //Arrange Statement(s)
        try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
            List list = new ArrayList<>();
            list.add(boundChannelMock);
            reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
            RuntimeException runtimeException = new RuntimeException();
            doThrow(runtimeException).when(boundChannelMock).getLocalAddress();
            Iterable<HttpHandlerFactory> iterable = new ArrayList<>();
            UndertowWebServer target = new UndertowWebServer(builderMock, iterable, true);
            //Act Statement(s)
            String result = target.getStartLogMessage();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("Undertow started on ports unknown"));
                reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
                verify(boundChannelMock, atLeast(1)).getLocalAddress();
            });
        }
    }

    //Sapient generated method id: ${getStartLogMessageWhenSslFieldIsNotNullAndCaughtExceptionAndPortsSizeEquals1AndPortsNotIsEmpty}, hash: 1EACD58991227E3D4332E27E72B141C5
    @Disabled()
    @Test()
    void getStartLogMessageWhenSslFieldIsNotNullAndCaughtExceptionAndPortsSizeEquals1AndPortsNotIsEmpty() throws Exception {
        /* Branches:
         * (!this.autoStart) : false  #  inside getActualPorts method
         * (for-each(extractChannels())) : true  #  inside getActualPorts method
         * (socketAddress instanceof InetSocketAddress inetSocketAddress) : true  #  inside getPortFromChannel method
         * (sslField != null) : true  #  inside getPortFromChannel method
         * (catch-exception (Exception)) : true  #  inside getActualPorts method
         * (ports.size() != 1) : false  #  inside getPortsDescription method
         * (!ports.isEmpty()) : true  #  inside getPortsDescription method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
            List list = new ArrayList<>();
            list.add(boundChannelMock);
            reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            doReturn(inetSocketAddress).when(boundChannelMock).getLocalAddress();
            reflectionUtils.when(() -> ReflectionUtils.findField(BoundChannel.class, "ssl")).thenReturn(fieldMock);
            Iterable<HttpHandlerFactory> iterable = new ArrayList<>();
            UndertowWebServer target = new UndertowWebServer(builderMock, iterable, true);
            //Act Statement(s)
            String result = target.getStartLogMessage();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("Undertow started on port null"));
                reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
                verify(boundChannelMock, atLeast(1)).getLocalAddress();
                reflectionUtils.verify(() -> ReflectionUtils.findField(BoundChannel.class, "ssl"), atLeast(1));
            });
        }
    }
}
