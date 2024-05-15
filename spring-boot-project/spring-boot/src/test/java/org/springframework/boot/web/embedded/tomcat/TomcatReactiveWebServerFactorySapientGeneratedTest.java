package org.springframework.boot.web.embedded.tomcat;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import org.springframework.boot.ssl.NoSuchSslBundleException;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.boot.web.server.Ssl;
import org.apache.coyote.UpgradeProtocol;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.web.server.Compression;
import org.springframework.util.StringUtils;
import org.springframework.util.Assert;
import org.apache.catalina.startup.Tomcat;
import java.util.ArrayList;
import java.nio.file.attribute.FileAttribute;
import org.springframework.boot.ssl.SslBundle;
import org.apache.coyote.ProtocolHandler;
import org.mockito.stubbing.Answer;
import org.springframework.boot.web.server.Shutdown;
import org.apache.coyote.AbstractProtocol;
import org.apache.catalina.Context;
import org.apache.catalina.core.AprLifecycleListener;
import org.springframework.boot.web.server.WebServerException;
import java.nio.file.Path;
import java.net.InetAddress;
import org.springframework.boot.web.server.WebServerSslBundle;
import org.apache.catalina.connector.Connector;
import org.springframework.boot.ssl.SslBundles;
import org.springframework.http.server.reactive.TomcatHttpHandlerAdapter;
import org.apache.catalina.Host;
import org.apache.catalina.Valve;
import org.apache.catalina.Wrapper;
import org.apache.catalina.LifecycleListener;
import org.springframework.boot.web.server.Http2;
import org.apache.tomcat.util.modeler.Registry;
import java.util.function.Consumer;
import org.springframework.boot.util.LambdaSafe;
import org.springframework.util.ClassUtils;
import java.nio.file.Files;
import org.apache.catalina.Container;
import java.util.Collection;
import org.mockito.MockedStatic;
import org.springframework.boot.web.server.WebServer;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.atLeast;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class TomcatReactiveWebServerFactorySapientGeneratedTest {

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private TomcatReactiveWebServerFactory target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${getWebServerWhenGetUriEncodingIsNotNullThrowsWebServerException}, hash: 2D434969BF891F70D2A610CF3C11A122
    @Disabled()
    @Test()
    void getWebServerWhenGetUriEncodingIsNotNullThrowsWebServerException() throws IOException {
        /* Branches:
         * (this.disableMBeanRegistry) : true
         * (this.baseDirectory != null) : false
         * (getUriEncoding() != null) : true  #  inside createTempDir method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Path pathMock = mock(Path.class);
        HttpHandler httpHandlerMock = mock(HttpHandler.class);
        try (MockedStatic<Files> files = mockStatic(Files.class)) {
            FileAttribute[] fileAttributeArray = new FileAttribute[] {};
            files.when(() -> Files.createTempDirectory("tomcat.2.", fileAttributeArray)).thenReturn(pathMock);
            target = new TomcatReactiveWebServerFactory(2);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            final WebServerException result = assertThrows(WebServerException.class, () -> {
                target.getWebServer(httpHandlerMock);
            });
            IOException iOException = new IOException();
            WebServerException webServerException = new WebServerException("Unable to create tempDir. java.io.tmpdir is set to A", iOException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(webServerException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
                files.verify(() -> Files.createTempDirectory("tomcat.2.", fileAttributeArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getWebServerWhenThisAdditionalTomcatConnectorsIsEmpty}, hash: E686B50FD9890A4098847136E0F14B1F
    @Test()
    void getWebServerWhenThisAdditionalTomcatConnectorsIsEmpty() throws IOException {
        /* Branches:
         * (this.disableMBeanRegistry) : true
         * (this.baseDirectory != null) : false
         * (for-each(this.serverLifecycleListeners)) : false
         * (connector.getProtocolHandler().getExecutor() instanceof Executor executor) : false  #  inside registerConnectorExecutor method
         * (for-each(this.engineValves)) : false  #  inside configureEngine method
         * (for-each(this.additionalTomcatConnectors)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        target = spy(new TomcatReactiveWebServerFactory(2));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(target).customizeConnector((Connector) any());
        doNothing().when(target).prepareContext((Host) any(), (TomcatHttpHandlerAdapter) any());
        TomcatWebServer tomcatWebServerMock = mock(TomcatWebServer.class);
        doReturn(tomcatWebServerMock).when(target).getTomcatWebServer((Tomcat) any());
        HttpHandler httpHandlerMock = mock(HttpHandler.class);
        //Act Statement(s)
        WebServer result = target.getWebServer(httpHandlerMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(tomcatWebServerMock));
            verify(target).customizeConnector((Connector) any());
            verify(target).prepareContext((Host) any(), (TomcatHttpHandlerAdapter) any());
            verify(target).getTomcatWebServer((Tomcat) any());
        });
    }

    //Sapient generated method id: ${prepareContextTest}, hash: 3464EA01D26E15608029F8D84803FD63
    @Disabled()
    @Test()
    void prepareContextTest() throws IOException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Host hostMock = mock(Host.class);
        Wrapper wrapperMock = mock(Wrapper.class);
        TomcatHttpHandlerAdapter tomcatHttpHandlerAdapterMock = mock(TomcatHttpHandlerAdapter.class);
        try (MockedStatic<Tomcat> tomcat = mockStatic(Tomcat.class)) {
            doNothing().when(hostMock).addChild((Container) any());
            tomcat.when(() -> Tomcat.addServlet((TomcatEmbeddedContext) any(), eq("httpHandlerServlet"), eq(tomcatHttpHandlerAdapterMock))).thenReturn(wrapperMock);
            doNothing().when(wrapperMock).setAsyncSupported(true);
            target = spy(new TomcatReactiveWebServerFactory(2));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doNothing().when(target).configureContext((TomcatEmbeddedContext) any());
            //Act Statement(s)
            target.prepareContext(hostMock, tomcatHttpHandlerAdapterMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(hostMock).addChild((Container) any());
                tomcat.verify(() -> Tomcat.addServlet((TomcatEmbeddedContext) any(), eq("httpHandlerServlet"), eq(tomcatHttpHandlerAdapterMock)));
                verify(wrapperMock, atLeast(1)).setAsyncSupported(true);
                verify(target).configureContext((TomcatEmbeddedContext) any());
            });
        }
    }

    //Sapient generated method id: ${prepareContextWhenGetUriEncodingIsNotNullThrowsWebServerException}, hash: ADB7E30D390C02E3645FEFCE970F523F
    @Disabled()
    @Test()
    void prepareContextWhenGetUriEncodingIsNotNullThrowsWebServerException() throws IOException {
        /* Branches:
         * (getUriEncoding() != null) : true  #  inside createTempDir method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Path pathMock = mock(Path.class);
        Host hostMock = mock(Host.class);
        TomcatHttpHandlerAdapter tomcatHttpHandlerAdapterMock = mock(TomcatHttpHandlerAdapter.class);
        try (MockedStatic<Files> files = mockStatic(Files.class)) {
            FileAttribute[] fileAttributeArray = new FileAttribute[] {};
            files.when(() -> Files.createTempDirectory("tomcat-docbase.2.", fileAttributeArray)).thenReturn(pathMock);
            target = new TomcatReactiveWebServerFactory(2);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            final WebServerException result = assertThrows(WebServerException.class, () -> {
                target.prepareContext(hostMock, tomcatHttpHandlerAdapterMock);
            });
            IOException iOException = new IOException();
            WebServerException webServerException = new WebServerException("Unable to create tempDir. java.io.tmpdir is set to A", iOException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(webServerException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
                files.verify(() -> Files.createTempDirectory("tomcat-docbase.2.", fileAttributeArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${configureContextTest}, hash: FF51C45C9627884F9363A31273444C32
    @Test()
    void configureContextTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type DisableReferenceClearingContextCustomizer - Method: customize
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        target = new TomcatReactiveWebServerFactory(0);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Context contextMock = mock(Context.class);
        //Act Statement(s)
        target.configureContext(contextMock);
    }

    //Sapient generated method id: ${customizeConnectorWhenStringUtilsHasTextSslBundleNameAndThisTomcatConnectorCustomizersIsEmpty}, hash: EBE11B47FC89E84E39D2F5801EAEEEEC
    @Disabled()
    @Test()
    void customizeConnectorWhenStringUtilsHasTextSslBundleNameAndThisTomcatConnectorCustomizersIsEmpty() throws NoSuchSslBundleException {
        /* Branches:
         * (StringUtils.hasText(getServerHeader())) : true
         * (connector.getProtocolHandler() instanceof AbstractProtocol) : true
         * (getAddress() != null) : true  #  inside customizeProtocol method
         * (getUriEncoding() != null) : true
         * (getHttp2() != null) : true
         * (getHttp2().isEnabled()) : true
         * (Ssl.isEnabled(getSsl())) : true
         * (StringUtils.hasText(sslBundleName)) : true  #  inside customizeSsl method
         * (for-each(this.tomcatConnectorCustomizers)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: customizer - Method: customize
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Connector connectorMock = mock(Connector.class);
        AbstractProtocol abstractProtocolMock = mock(AbstractProtocol.class);
        AbstractProtocol abstractProtocolMock2 = mock(AbstractProtocol.class);
        ProtocolHandler protocolHandlerMock = mock(ProtocolHandler.class);
        SslBundles sslBundlesMock = mock(SslBundles.class);
        LambdaSafe.Callbacks lambdaSafeCallbacksMock = mock(LambdaSafe.Callbacks.class);
        SslBundle sslBundleMock = mock(SslBundle.class);
        Compression compressionMock = mock(Compression.class);
        try (MockedStatic<WebServerSslBundle> webServerSslBundle = mockStatic(WebServerSslBundle.class);
            MockedStatic<Ssl> ssl = mockStatic(Ssl.class);
            MockedStatic<LambdaSafe> lambdaSafe = mockStatic(LambdaSafe.class)) {
            doNothing().when(connectorMock).setPort(1);
            doReturn(false).when(connectorMock).setProperty("server", "A");
            doNothing().when(abstractProtocolMock2).setAddress((InetAddress) any());
            doReturn(abstractProtocolMock, abstractProtocolMock2, protocolHandlerMock).when(connectorMock).getProtocolHandler();
            doNothing().when(connectorMock).setURIEncoding("UTF-8");
            doNothing().when(connectorMock).addUpgradeProtocol((UpgradeProtocol) any());
            doNothing().when(sslBundlesMock).addBundleUpdateHandler(eq("B"), (Consumer) any());
            Object[] objectArray = new Object[] {};
            lambdaSafe.when(() -> LambdaSafe.callbacks(eq(TomcatProtocolHandlerCustomizer.class), anySet(), eq(protocolHandlerMock), eq(objectArray))).thenReturn(lambdaSafeCallbacksMock);
            doNothing().when(lambdaSafeCallbacksMock).invoke((Consumer) any());
            Ssl ssl2 = new Ssl();
            ssl2.setBundle("B");
            ssl2.setClientAuth(Ssl.ClientAuth.NONE);
            ssl.when(() -> Ssl.isEnabled(ssl2)).thenReturn(true);
            webServerSslBundle.when(() -> WebServerSslBundle.get((Ssl) null, (SslBundles) null)).thenReturn(sslBundleMock);
            target = new TomcatReactiveWebServerFactory(1);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            target.setAddress(inetAddress);
            Http2 http2 = new Http2();
            http2.setEnabled(true);
            target.setHttp2(http2);
            target.setCompression(compressionMock);
            target.setSsl(ssl2);
            target.setServerHeader("A");
            target.setSslBundles(sslBundlesMock);
            //Act Statement(s)
            target.customizeConnector(connectorMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(connectorMock).setPort(1);
                verify(connectorMock).setProperty("server", "A");
                verify(connectorMock, times(3)).getProtocolHandler();
                verify(abstractProtocolMock2).setAddress((InetAddress) any());
                verify(connectorMock).setURIEncoding("UTF-8");
                verify(connectorMock).addUpgradeProtocol((UpgradeProtocol) any());
                verify(sslBundlesMock).addBundleUpdateHandler(eq("B"), (Consumer) any());
                lambdaSafe.verify(() -> LambdaSafe.callbacks(eq(TomcatProtocolHandlerCustomizer.class), anySet(), eq(protocolHandlerMock), eq(objectArray)));
                verify(lambdaSafeCallbacksMock).invoke((Consumer) any());
                ssl.verify(() -> Ssl.isEnabled(ssl2), atLeast(1));
                webServerSslBundle.verify(() -> WebServerSslBundle.get((Ssl) null, (SslBundles) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${setTomcatContextCustomizersTest}, hash: B2D10386CABB5C9BD779E7A64E00A773
    @Test()
    void setTomcatContextCustomizersTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(anyCollection(), eq("TomcatContextCustomizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            target = new TomcatReactiveWebServerFactory(0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Collection<TomcatContextCustomizer> collection = new ArrayList<>();
            //Act Statement(s)
            target.setTomcatContextCustomizers(collection);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(target.getTomcatContextCustomizers().size(), equalTo(0));
                _assert.verify(() -> Assert.notNull(anyCollection(), eq("TomcatContextCustomizers must not be null")));
            });
        }
    }

    //Sapient generated method id: ${getTomcatContextCustomizersTest}, hash: C2B7CF6573E7C58D99417DECEF418F5F
    @Test()
    void getTomcatContextCustomizersTest() {
        //Arrange Statement(s)
        target = new TomcatReactiveWebServerFactory(0);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        Collection<TomcatContextCustomizer> result = target.getTomcatContextCustomizers();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${addContextCustomizersTest}, hash: 21C9764102E6338CD80020467E03DD05
    @Test()
    void addContextCustomizersTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            TomcatContextCustomizer[] tomcatContextCustomizerArray = new TomcatContextCustomizer[] {};
            _assert.when(() -> Assert.notNull(tomcatContextCustomizerArray, "TomcatContextCustomizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            target = new TomcatReactiveWebServerFactory(0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.addContextCustomizers(tomcatContextCustomizerArray);
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.notNull(tomcatContextCustomizerArray, "TomcatContextCustomizers must not be null"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${setTomcatConnectorCustomizersTest}, hash: BBFA08E5710D122D36DC61C94B24858B
    @Test()
    void setTomcatConnectorCustomizersTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(anyCollection(), eq("TomcatConnectorCustomizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            target = new TomcatReactiveWebServerFactory(0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Collection<TomcatConnectorCustomizer> collection = new ArrayList<>();
            //Act Statement(s)
            target.setTomcatConnectorCustomizers(collection);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(target.getTomcatConnectorCustomizers().size(), equalTo(0));
                _assert.verify(() -> Assert.notNull(anyCollection(), eq("TomcatConnectorCustomizers must not be null")));
            });
        }
    }

    //Sapient generated method id: ${addConnectorCustomizersTest}, hash: DAB018934C7430B6965DDDF8DE2BB5DA
    @Test()
    void addConnectorCustomizersTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            TomcatConnectorCustomizer[] tomcatConnectorCustomizerArray = new TomcatConnectorCustomizer[] {};
            _assert.when(() -> Assert.notNull(tomcatConnectorCustomizerArray, "TomcatConnectorCustomizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            target = new TomcatReactiveWebServerFactory(0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.addConnectorCustomizers(tomcatConnectorCustomizerArray);
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.notNull(tomcatConnectorCustomizerArray, "TomcatConnectorCustomizers must not be null"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${getTomcatConnectorCustomizersTest}, hash: DCA354122D48ED737E045CF8A2B2F944
    @Test()
    void getTomcatConnectorCustomizersTest() {
        //Arrange Statement(s)
        target = new TomcatReactiveWebServerFactory(0);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        Collection<TomcatConnectorCustomizer> result = target.getTomcatConnectorCustomizers();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${setTomcatProtocolHandlerCustomizersTest}, hash: 6A7A450515790F6D6551E96EEA834041
    @Test()
    void setTomcatProtocolHandlerCustomizersTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(anyCollection(), eq("TomcatProtocolHandlerCustomizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            target = new TomcatReactiveWebServerFactory(0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Collection<TomcatProtocolHandlerCustomizer<?>> collection = new ArrayList<>();
            //Act Statement(s)
            target.setTomcatProtocolHandlerCustomizers(collection);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(target.getTomcatProtocolHandlerCustomizers().size(), equalTo(0));
                _assert.verify(() -> Assert.notNull(anyCollection(), eq("TomcatProtocolHandlerCustomizers must not be null")));
            });
        }
    }

    //Sapient generated method id: ${addProtocolHandlerCustomizersTest}, hash: 63EEF1E2745161D3F185A0769B0F1556
    @Test()
    void addProtocolHandlerCustomizersTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            TomcatProtocolHandlerCustomizer<?>[] tomcatProtocolHandlerCustomizerArray = new TomcatProtocolHandlerCustomizer[] {};
            _assert.when(() -> Assert.notNull(tomcatProtocolHandlerCustomizerArray, "TomcatProtocolHandlerCustomizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            target = new TomcatReactiveWebServerFactory(0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.addProtocolHandlerCustomizers(tomcatProtocolHandlerCustomizerArray);
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.notNull(tomcatProtocolHandlerCustomizerArray, "TomcatProtocolHandlerCustomizers must not be null"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${getTomcatProtocolHandlerCustomizersTest}, hash: 6A2A900E5EBF0EC5DAFB7118FA598402
    @Test()
    void getTomcatProtocolHandlerCustomizersTest() {
        //Arrange Statement(s)
        target = new TomcatReactiveWebServerFactory(0);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        Collection<TomcatProtocolHandlerCustomizer<?>> result = target.getTomcatProtocolHandlerCustomizers();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${addAdditionalTomcatConnectorsTest}, hash: 42B984A473B9CE8A912D6A25A97BA19C
    @Test()
    void addAdditionalTomcatConnectorsTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Connector[] connectorArray = new Connector[] {};
            _assert.when(() -> Assert.notNull(connectorArray, "Connectors must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            target = new TomcatReactiveWebServerFactory(0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.addAdditionalTomcatConnectors(connectorArray);
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.notNull(connectorArray, "Connectors must not be null"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${addEngineValvesTest}, hash: 15DBE3F7D71F093BD3BB2EC32CA4DBEE
    @Test()
    void addEngineValvesTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Valve[] valveArray = new Valve[] {};
            _assert.when(() -> Assert.notNull(valveArray, "Valves must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            target = new TomcatReactiveWebServerFactory(0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.addEngineValves(valveArray);
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.notNull(valveArray, "Valves must not be null"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${setContextLifecycleListenersTest}, hash: D0D06D631C544280165983F9295EB066
    @Test()
    void setContextLifecycleListenersTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(anyCollection(), eq("ContextLifecycleListeners must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            target = new TomcatReactiveWebServerFactory(0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Collection<LifecycleListener> collection = new ArrayList<>();
            //Act Statement(s)
            target.setContextLifecycleListeners(collection);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(target.getContextLifecycleListeners().size(), equalTo(0));
                _assert.verify(() -> Assert.notNull(anyCollection(), eq("ContextLifecycleListeners must not be null")));
            });
        }
    }

    //Sapient generated method id: ${getContextLifecycleListenersTest}, hash: 4C05DD268C167588DCB693DB6C909178
    @Test()
    void getContextLifecycleListenersTest() {
        //Arrange Statement(s)
        target = new TomcatReactiveWebServerFactory(0);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        Collection<LifecycleListener> result = target.getContextLifecycleListeners();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${addContextLifecycleListenersTest}, hash: FCB6FE8E59FEEE7879AA8320F9FB7980
    @Test()
    void addContextLifecycleListenersTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            LifecycleListener[] lifecycleListenerArray = new LifecycleListener[] {};
            _assert.when(() -> Assert.notNull(lifecycleListenerArray, "ContextLifecycleListeners must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            target = new TomcatReactiveWebServerFactory(0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.addContextLifecycleListeners(lifecycleListenerArray);
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.notNull(lifecycleListenerArray, "ContextLifecycleListeners must not be null"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${getTomcatWebServerWhenGetPortGreaterThanOrEqualsTo0}, hash: DE35EB88877DE70D8EB31B64A898C726
    @Disabled()
    @Test()
    void getTomcatWebServerWhenGetPortGreaterThanOrEqualsTo0() {
        /* Branches:
         * (getPort() >= 0) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.springframework.boot.web.embedded.tomcat.TomcatWebServer
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        target = new TomcatReactiveWebServerFactory(1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        target.setShutdown(Shutdown.GRACEFUL);
        Tomcat tomcatMock = mock(Tomcat.class);
        //Act Statement(s)
        TomcatWebServer result = target.getTomcatWebServer(tomcatMock);
        //Assert statement(s)
        //TODO: Please implement equals method in TomcatWebServer for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getTomcatWebServerWhenGetPortLessThan0}, hash: CFD32B850B91F9E89564B265B1931222
    @Disabled()
    @Test()
    void getTomcatWebServerWhenGetPortLessThan0() {
        /* Branches:
         * (getPort() >= 0) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.springframework.boot.web.embedded.tomcat.TomcatWebServer
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        target = new TomcatReactiveWebServerFactory(-1);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        target.setShutdown(Shutdown.GRACEFUL);
        Tomcat tomcatMock = mock(Tomcat.class);
        //Act Statement(s)
        TomcatWebServer result = target.getTomcatWebServer(tomcatMock);
        //Assert statement(s)
        //TODO: Please implement equals method in TomcatWebServer for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${setProtocolTest}, hash: 56054FE285AEBA4D8FC079DB63602B90
    @Test()
    void setProtocolTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasLength("A", "Protocol must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
            target = new TomcatReactiveWebServerFactory(0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.setProtocol("A");
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.hasLength("A", "Protocol must not be empty"), atLeast(1)));
        }
    }
}
