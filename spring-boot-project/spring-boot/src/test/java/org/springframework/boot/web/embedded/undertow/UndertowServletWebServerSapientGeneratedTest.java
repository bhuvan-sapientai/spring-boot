package org.springframework.boot.web.embedded.undertow;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import io.undertow.server.handlers.PathHandler;
import java.util.List;
import io.undertow.Undertow;
import java.lang.reflect.Field;
import java.net.SocketAddress;
import org.springframework.util.StringUtils;
import io.undertow.server.HttpHandler;
import io.undertow.servlet.api.DeploymentManager;
import org.springframework.util.Assert;
import org.xnio.channels.BoundChannel;
import io.undertow.server.handlers.GracefulShutdownHandler;
import org.mockito.MockedStatic;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import org.springframework.util.ReflectionUtils;
import io.undertow.Handlers;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UndertowServletWebServerSapientGeneratedTest {

    private final BoundChannel boundChannelMock = mock(BoundChannel.class);

    private final DeploymentManagerHttpHandlerFactory deploymentManagerFactoryMock = mock(DeploymentManagerHttpHandlerFactory.class);

    private final DeploymentManager deploymentManagerMock = mock(DeploymentManager.class);

    private final Field fieldMock = mock(Field.class);

    private final Undertow.Builder undertowBuilderMock = mock(Undertow.Builder.class);

    //Sapient generated method id: ${createHttpHandlerWhenStringUtilsHasLengthThisContextPath}, hash: C81DF8CFE79A63454E24AF39FACBD45D
    @Disabled()
    @Test()
    void createHttpHandlerWhenStringUtilsHasLengthThisContextPath() {
        /* Branches:
         * (for-each(this.httpHandlerFactories)) : true  #  inside createHttpHandler method
         * (handler instanceof Closeable closeable) : false  #  inside createHttpHandler method
         * (handler instanceof GracefulShutdownHandler shutdownHandler) : true  #  inside createHttpHandler method
         * (StringUtils.hasLength(this.contextPath)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        PathHandler pathHandlerMock = mock(PathHandler.class);
        PathHandler pathHandlerMock2 = mock(PathHandler.class);
        GracefulShutdownHandler gracefulShutdownHandlerMock = mock(GracefulShutdownHandler.class);
        try (MockedStatic<Handlers> handlers = mockStatic(Handlers.class);
            MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
            stringUtils.when(() -> StringUtils.hasLength("contextPath1")).thenReturn(false);
            handlers.when(() -> Handlers.path()).thenReturn(pathHandlerMock);
            doReturn(pathHandlerMock2).when(pathHandlerMock).addPrefixPath("contextPath1", gracefulShutdownHandlerMock);
            Iterable<HttpHandlerFactory> iterable = new ArrayList<>();
            UndertowServletWebServer target = new UndertowServletWebServer(undertowBuilderMock, iterable, "contextPath1", false);
            //Act Statement(s)
            HttpHandler result = target.createHttpHandler();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(pathHandlerMock2));
                stringUtils.verify(() -> StringUtils.hasLength("contextPath1"), atLeast(1));
                handlers.verify(() -> Handlers.path(), atLeast(1));
                verify(pathHandlerMock).addPrefixPath("contextPath1", gracefulShutdownHandlerMock);
            });
        }
    }

    //Sapient generated method id: ${getStartLogMessageWhenPortsNotIsEmpty}, hash: FF0C213D71BFC82C6B96D600C7B9D301
    @Disabled()
    @Test()
    void getStartLogMessageWhenPortsNotIsEmpty() {
        /* Branches:
         * (StringUtils.hasText(this.contextPath)) : true
         * (!this.autoStart) : true  #  inside getActualPorts method
         * (ports.size() != 1) : false  #  inside getPortsDescription method
         * (!ports.isEmpty()) : true  #  inside getPortsDescription method
         */
        //Arrange Statement(s)
        doReturn(deploymentManagerMock).when(deploymentManagerFactoryMock).getDeploymentManager();
        Iterable<HttpHandlerFactory> iterable = new ArrayList<>(List.of(deploymentManagerFactoryMock));
        UndertowServletWebServer target = new UndertowServletWebServer(undertowBuilderMock, iterable, "A", false);
        //Act Statement(s)
        String result = target.getStartLogMessage();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("Undertow started on port null with context path 'A'"));
            verify(deploymentManagerFactoryMock).getDeploymentManager();
        });
    }

    //Sapient generated method id: ${getStartLogMessageWhenPortsSizeNotEquals1AndPortsIsEmpty}, hash: DA1365665BFB399C95881F188C4C4EC1
    @Test()
    void getStartLogMessageWhenPortsSizeNotEquals1AndPortsIsEmpty() {
        /* Branches:
         * (StringUtils.hasText(this.contextPath)) : false
         * (!this.autoStart) : false  #  inside getActualPorts method
         * (for-each(extractChannels())) : false  #  inside getActualPorts method
         * (ports.size() != 1) : true  #  inside getPortsDescription method
         * (!ports.isEmpty()) : false  #  inside getPortsDescription method
         */
        //Arrange Statement(s)
        try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS);
            MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
            doReturn(deploymentManagerMock).when(deploymentManagerFactoryMock).getDeploymentManager();
            stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
            List list = new ArrayList<>();
            reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
            Iterable<HttpHandlerFactory> iterable = new ArrayList<>(List.of(deploymentManagerFactoryMock));
            UndertowServletWebServer target = new UndertowServletWebServer(undertowBuilderMock, iterable, "A", true);
            //Act Statement(s)
            String result = target.getStartLogMessage();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("Undertow started on ports unknown with context path '/'"));
                verify(deploymentManagerFactoryMock, atLeast(1)).getDeploymentManager();
                stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
                reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getStartLogMessageWhenPortsSizeEquals1AndPortsNotIsEmpty}, hash: 54F6601B51D0ECA92724034EE7CD40FF
    @Disabled()
    @Test()
    void getStartLogMessageWhenPortsSizeEquals1AndPortsNotIsEmpty() {
        /* Branches:
         * (StringUtils.hasText(this.contextPath)) : true
         * (!this.autoStart) : false  #  inside getActualPorts method
         * (for-each(extractChannels())) : true  #  inside getActualPorts method
         * (socketAddress instanceof InetSocketAddress inetSocketAddress) : false  #  inside getPortFromChannel method
         * (ports.size() != 1) : false  #  inside getPortsDescription method
         * (!ports.isEmpty()) : true  #  inside getPortsDescription method
         */
        //Arrange Statement(s)
        SocketAddress socketAddressMock = mock(SocketAddress.class);
        try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
            doReturn(deploymentManagerMock).when(deploymentManagerFactoryMock).getDeploymentManager();
            List list = new ArrayList<>();
            list.add(boundChannelMock);
            reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
            doReturn(socketAddressMock).when(boundChannelMock).getLocalAddress();
            Iterable<HttpHandlerFactory> iterable = new ArrayList<>(List.of(deploymentManagerFactoryMock));
            UndertowServletWebServer target = new UndertowServletWebServer(undertowBuilderMock, iterable, "A", true);
            //Act Statement(s)
            String result = target.getStartLogMessage();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("Undertow started on port  with context path 'A'"));
                verify(deploymentManagerFactoryMock, atLeast(1)).getDeploymentManager();
                reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
                verify(boundChannelMock, atLeast(1)).getLocalAddress();
            });
        }
    }

    //Sapient generated method id: ${getStartLogMessageWhenDefaultBranchAndPortsSizeNotEquals1AndPortsIsEmpty}, hash: 83AC60346A008DAB8436627B19857218
    @Test()
    void getStartLogMessageWhenDefaultBranchAndPortsSizeNotEquals1AndPortsIsEmpty() {
        /* Branches:
         * (StringUtils.hasText(this.contextPath)) : true
         * (!this.autoStart) : false  #  inside getActualPorts method
         * (branch expression (line 213)) : true  #  inside getActualPorts method
         * (ports.size() != 1) : true  #  inside getPortsDescription method
         * (!ports.isEmpty()) : false  #  inside getPortsDescription method
         */
        //Arrange Statement(s)
        try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
            doReturn(deploymentManagerMock).when(deploymentManagerFactoryMock).getDeploymentManager();
            RuntimeException runtimeException = new RuntimeException();
            reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenThrow(runtimeException);
            Iterable<HttpHandlerFactory> iterable = new ArrayList<>(List.of(deploymentManagerFactoryMock));
            UndertowServletWebServer target = new UndertowServletWebServer(undertowBuilderMock, iterable, "A", true);
            //Act Statement(s)
            String result = target.getStartLogMessage();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("Undertow started on ports unknown with context path 'A'"));
                verify(deploymentManagerFactoryMock, atLeast(1)).getDeploymentManager();
                reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getStartLogMessageWhenSslFieldIsNotNullAndPortsSizeEquals1AndPortsNotIsEmpty}, hash: A61EF3742A803CED8A16E6D58FF8B494
    @Disabled()
    @Test()
    void getStartLogMessageWhenSslFieldIsNotNullAndPortsSizeEquals1AndPortsNotIsEmpty() {
        /* Branches:
         * (StringUtils.hasText(this.contextPath)) : true
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
            doReturn(deploymentManagerMock).when(deploymentManagerFactoryMock).getDeploymentManager();
            List list = new ArrayList<>();
            list.add(boundChannelMock);
            reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            doReturn(inetSocketAddress).when(boundChannelMock).getLocalAddress();
            reflectionUtils.when(() -> ReflectionUtils.findField(BoundChannel.class, "ssl")).thenReturn(fieldMock);
            Iterable<HttpHandlerFactory> iterable = new ArrayList<>(List.of(deploymentManagerFactoryMock));
            UndertowServletWebServer target = new UndertowServletWebServer(undertowBuilderMock, iterable, "A", true);
            //Act Statement(s)
            String result = target.getStartLogMessage();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("Undertow started on port null with context path 'A'"));
                verify(deploymentManagerFactoryMock, atLeast(1)).getDeploymentManager();
                reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
                verify(boundChannelMock, atLeast(1)).getLocalAddress();
                reflectionUtils.verify(() -> ReflectionUtils.findField(BoundChannel.class, "ssl"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getStartLogMessageWhenSslFieldIsNullAndPortsSizeEquals1AndPortsNotIsEmpty}, hash: FE1A2D4E14B181CC4350877F9BB03A79
    @Disabled()
    @Test()
    void getStartLogMessageWhenSslFieldIsNullAndPortsSizeEquals1AndPortsNotIsEmpty() {
        /* Branches:
         * (StringUtils.hasText(this.contextPath)) : true
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
            doReturn(deploymentManagerMock).when(deploymentManagerFactoryMock).getDeploymentManager();
            List list = new ArrayList<>();
            list.add(boundChannelMock);
            reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            doReturn(inetSocketAddress).when(boundChannelMock).getLocalAddress();
            reflectionUtils.when(() -> ReflectionUtils.findField(BoundChannel.class, "ssl")).thenReturn(null);
            Iterable<HttpHandlerFactory> iterable = new ArrayList<>(List.of(deploymentManagerFactoryMock));
            UndertowServletWebServer target = new UndertowServletWebServer(undertowBuilderMock, iterable, "A", true);
            //Act Statement(s)
            String result = target.getStartLogMessage();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("Undertow started on port null with context path 'A'"));
                verify(deploymentManagerFactoryMock, atLeast(1)).getDeploymentManager();
                reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
                verify(boundChannelMock, atLeast(1)).getLocalAddress();
                reflectionUtils.verify(() -> ReflectionUtils.findField(BoundChannel.class, "ssl"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getStartLogMessageWhenDefaultBranchAndPortsSizeEquals1AndPortsNotIsEmpty}, hash: 196D63BA81BA32C34E7C36D25CEE7A5E
    @Test()
    void getStartLogMessageWhenDefaultBranchAndPortsSizeEquals1AndPortsNotIsEmpty() {
        /* Branches:
         * (StringUtils.hasText(this.contextPath)) : true
         * (!this.autoStart) : false  #  inside getActualPorts method
         * (for-each(extractChannels())) : true  #  inside getActualPorts method
         * (branch expression (line 213)) : true  #  inside getActualPorts method
         * (ports.size() != 1) : true  #  inside getPortsDescription method
         * (!ports.isEmpty()) : false  #  inside getPortsDescription method
         */
        //Arrange Statement(s)
        try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
            doReturn(deploymentManagerMock).when(deploymentManagerFactoryMock).getDeploymentManager();
            List list = new ArrayList<>();
            list.add(boundChannelMock);
            reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
            RuntimeException runtimeException = new RuntimeException();
            doThrow(runtimeException).when(boundChannelMock).getLocalAddress();
            Iterable<HttpHandlerFactory> iterable = new ArrayList<>(List.of(deploymentManagerFactoryMock));
            UndertowServletWebServer target = new UndertowServletWebServer(undertowBuilderMock, iterable, "A", true);
            //Act Statement(s)
            String result = target.getStartLogMessage();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("Undertow started on ports unknown with context path 'A'"));
                verify(deploymentManagerFactoryMock, atLeast(1)).getDeploymentManager();
                reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
                verify(boundChannelMock, atLeast(1)).getLocalAddress();
            });
        }
    }

    //Sapient generated method id: ${getStartLogMessageWhenSslFieldIsNotNullAndDefaultBranchAndPortsSizeEquals1AndPortsNotIsEmpty}, hash: 9C312AA60D0C9EE64262FA3EAEF291C1
    @Disabled()
    @Test()
    void getStartLogMessageWhenSslFieldIsNotNullAndDefaultBranchAndPortsSizeEquals1AndPortsNotIsEmpty() {
        /* Branches:
         * (StringUtils.hasText(this.contextPath)) : true
         * (!this.autoStart) : false  #  inside getActualPorts method
         * (for-each(extractChannels())) : true  #  inside getActualPorts method
         * (socketAddress instanceof InetSocketAddress inetSocketAddress) : true  #  inside getPortFromChannel method
         * (sslField != null) : true  #  inside getPortFromChannel method
         * (branch expression (line 213)) : true  #  inside getActualPorts method
         * (ports.size() != 1) : false  #  inside getPortsDescription method
         * (!ports.isEmpty()) : true  #  inside getPortsDescription method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
            doReturn(deploymentManagerMock).when(deploymentManagerFactoryMock).getDeploymentManager();
            List list = new ArrayList<>();
            list.add(boundChannelMock);
            reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            doReturn(inetSocketAddress).when(boundChannelMock).getLocalAddress();
            reflectionUtils.when(() -> ReflectionUtils.findField(BoundChannel.class, "ssl")).thenReturn(fieldMock);
            Iterable<HttpHandlerFactory> iterable = new ArrayList<>(List.of(deploymentManagerFactoryMock));
            UndertowServletWebServer target = new UndertowServletWebServer(undertowBuilderMock, iterable, "A", true);
            //Act Statement(s)
            String result = target.getStartLogMessage();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("Undertow started on port null with context path 'A'"));
                verify(deploymentManagerFactoryMock, atLeast(1)).getDeploymentManager();
                reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
                verify(boundChannelMock, atLeast(1)).getLocalAddress();
                reflectionUtils.verify(() -> ReflectionUtils.findField(BoundChannel.class, "ssl"), atLeast(1));
            });
        }
    }
}
