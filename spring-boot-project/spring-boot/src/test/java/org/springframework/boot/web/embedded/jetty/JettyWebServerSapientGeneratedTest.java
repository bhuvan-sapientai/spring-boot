package org.springframework.boot.web.embedded.jetty;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.List;
import org.mockito.stubbing.Answer;
import org.eclipse.jetty.server.NetworkConnector;
import org.eclipse.jetty.server.Handler;
import org.springframework.boot.web.server.WebServerException;
import org.springframework.util.StringUtils;
import org.springframework.util.Assert;
import org.springframework.boot.web.server.GracefulShutdownCallback;
import org.mockito.MockedStatic;
import java.io.IOException;
import org.eclipse.jetty.server.Connector;
import java.util.ArrayList;
import org.springframework.boot.web.server.GracefulShutdownResult;
import org.eclipse.jetty.server.Server;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.anyList;
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
class JettyWebServerSapientGeneratedTest {

    private final Server serverMock = mock(Server.class, "server");

    private final Connector connectorMock = mock(Connector.class);

    private final Handler handlerMock = mock(Handler.class);

    private final JettyEmbeddedWebAppContext jettyEmbeddedWebAppContextMock = mock(JettyEmbeddedWebAppContext.class);

    private final NetworkConnector networkConnectorMock = mock(NetworkConnector.class);

    //Sapient generated method id: ${startWhenThisNotAutoStart}, hash: FB972A765CF213DD011B47DFC1C174AF
    @Disabled()
    @Test()
    void startWhenThisNotAutoStart() throws Exception {
        /* Branches:
         * (this.started) : false
         * (!this.autoStart) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(null).when(serverMock).getHandler();
            _assert.when(() -> Assert.notNull(serverMock, "Jetty Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            JettyWebServer target = new JettyWebServer(serverMock, false);
            Connector[] connectorArray = new Connector[] {};
            doReturn(connectorArray).when(serverMock).getConnectors();
            doNothing().when(serverMock).setConnectors(null);
            doNothing().when(serverMock).start();
            doNothing().when(serverMock).setStopAtShutdown(false);
            doNothing().when(serverMock).setConnectors(connectorArray);
            //Act Statement(s)
            target.start();
            //Assert statement(s)
            assertAll("result", () -> {
                verify(serverMock).getHandler();
                _assert.verify(() -> Assert.notNull(serverMock, "Jetty Server must not be null"), atLeast(1));
                verify(serverMock).getConnectors();
                verify(serverMock).setConnectors(null);
                verify(serverMock).start();
                verify(serverMock).setStopAtShutdown(false);
                verify(serverMock).setConnectors(connectorArray);
            });
        }
    }

    //Sapient generated method id: ${startWhenHandlerInstanceOfJettyEmbeddedWebAppContextAndConnectorsIsNotEmpty}, hash: 03ADD9C5E5888160BA4AB8E32CD73620
    @Disabled()
    @Test()
    void startWhenHandlerInstanceOfJettyEmbeddedWebAppContextAndConnectorsIsNotEmpty() throws Exception {
        /* Branches:
         * (this.started) : false
         * (!this.autoStart) : false
         * (for-each(this.server.getHandlers())) : true
         * (handler instanceof JettyEmbeddedWebAppContext jettyEmbeddedWebAppContext) : true  #  inside handleDeferredInitialize method
         * (for-each(connectors)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(null).when(serverMock).getHandler();
            _assert.when(() -> Assert.notNull(serverMock, "Jetty Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            JettyWebServer target = spy(new JettyWebServer(serverMock, true));
            Connector[] connectorArray = new Connector[] {};
            doNothing().when(serverMock).setConnectors(null);
            doNothing().when(serverMock).start();
            doNothing().when(serverMock).setStopAtShutdown(false);
            doNothing().when(serverMock).setConnectors(connectorArray);
            List<Handler> handlerList = new ArrayList<>();
            handlerList.add(jettyEmbeddedWebAppContextMock);
            doReturn(handlerList).when(serverMock).getHandlers();
            doNothing().when(jettyEmbeddedWebAppContextMock).deferredInitialize();
            Connector[] connectorArray2 = new Connector[] { connectorMock };
            doReturn(connectorArray, connectorArray2).when(serverMock).getConnectors();
            doNothing().when(connectorMock).start();
            doReturn("return_of_getStartedLogMessage1").when(target).getStartedLogMessage();
            //Act Statement(s)
            target.start();
            //Assert statement(s)
            assertAll("result", () -> {
                verify(serverMock).getHandler();
                _assert.verify(() -> Assert.notNull(serverMock, "Jetty Server must not be null"), atLeast(1));
                verify(serverMock, times(2)).getConnectors();
                verify(serverMock).setConnectors(null);
                verify(serverMock, times(2)).start();
                verify(serverMock).setStopAtShutdown(false);
                verify(serverMock).setConnectors(connectorArray);
                verify(serverMock).getHandlers();
                verify(jettyEmbeddedWebAppContextMock).deferredInitialize();
                verify(connectorMock).start();
                verify(target).getStartedLogMessage();
            });
        }
    }

    //Sapient generated method id: ${startWhenConnectorsIsNotEmptyAndCaughtWebServerExceptionThrowsWebServerException}, hash: 7AE36F2B5110036D13274D735A322A60
    @Disabled()
    @Test()
    void startWhenConnectorsIsNotEmptyAndCaughtWebServerExceptionThrowsWebServerException() throws Exception {
        /* Branches:
         * (this.started) : false
         * (!this.autoStart) : false
         * (for-each(this.server.getHandlers())) : true
         * (handler instanceof JettyEmbeddedWebAppContext jettyEmbeddedWebAppContext) : true  #  inside handleDeferredInitialize method
         * (for-each(connectors)) : true
         * (catch-exception (WebServerException)) : true
         */
        //Arrange Statement(s)
        WebServerException webServerExceptionMock = mock(WebServerException.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(null).when(serverMock).getHandler();
            _assert.when(() -> Assert.notNull(serverMock, "Jetty Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            JettyWebServer target = spy(new JettyWebServer(serverMock, true));
            Connector[] connectorArray = new Connector[] {};
            doNothing().when(serverMock).setConnectors(null);
            doNothing().when(serverMock).start();
            doNothing().when(serverMock).setStopAtShutdown(false);
            doNothing().when(serverMock).setConnectors(connectorArray);
            List<Handler> handlerList = new ArrayList<>();
            handlerList.add(jettyEmbeddedWebAppContextMock);
            doReturn(handlerList).when(serverMock).getHandlers();
            doNothing().when(jettyEmbeddedWebAppContextMock).deferredInitialize();
            Connector[] connectorArray2 = new Connector[] { connectorMock };
            doReturn(connectorArray, connectorArray2).when(serverMock).getConnectors();
            doNothing().when(connectorMock).start();
            doThrow(webServerExceptionMock).when(target).getStartedLogMessage();
            doNothing().when(serverMock).stop();
            //Act Statement(s)
            final WebServerException result = assertThrows(WebServerException.class, () -> {
                target.start();
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(webServerExceptionMock));
                verify(serverMock).getHandler();
                _assert.verify(() -> Assert.notNull(serverMock, "Jetty Server must not be null"), atLeast(1));
                verify(serverMock, times(2)).getConnectors();
                verify(serverMock).setConnectors(null);
                verify(serverMock, times(2)).start();
                verify(serverMock).setStopAtShutdown(false);
                verify(serverMock).setConnectors(connectorArray);
                verify(serverMock).getHandlers();
                verify(jettyEmbeddedWebAppContextMock).deferredInitialize();
                verify(connectorMock).start();
                verify(target).getStartedLogMessage();
                verify(serverMock).stop();
            });
        }
    }

    //Sapient generated method id: ${startWhenConnectorsIsEmptyAndCaughtIOException}, hash: B359C3792570A605D26EE91958AC2863
    @Disabled()
    @Test()
    void startWhenConnectorsIsEmptyAndCaughtIOException() throws Exception {
        /* Branches:
         * (this.started) : false
         * (!this.autoStart) : false
         * (for-each(this.server.getHandlers())) : true
         * (handler instanceof JettyEmbeddedWebAppContext jettyEmbeddedWebAppContext) : true  #  inside handleDeferredInitialize method
         * (for-each(connectors)) : false
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(null).when(serverMock).getHandler();
            _assert.when(() -> Assert.notNull(serverMock, "Jetty Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            JettyWebServer target = spy(new JettyWebServer(serverMock, true));
            Connector[] connectorArray = new Connector[] {};
            doNothing().when(serverMock).setConnectors(null);
            doNothing().when(serverMock).start();
            doNothing().when(serverMock).setStopAtShutdown(false);
            doNothing().when(serverMock).setConnectors(connectorArray);
            List<Handler> handlerList = new ArrayList<>();
            handlerList.add(jettyEmbeddedWebAppContextMock);
            doReturn(handlerList).when(serverMock).getHandlers();
            doNothing().when(jettyEmbeddedWebAppContextMock).deferredInitialize();
            Connector[] connectorArray2 = new Connector[] {};
            doReturn(connectorArray, connectorArray2).when(serverMock).getConnectors();
            doReturn("return_of_getStartedLogMessage1").when(target).getStartedLogMessage();
            //Act Statement(s)
            target.start();
            //Assert statement(s)
            assertAll("result", () -> {
                verify(serverMock).getHandler();
                _assert.verify(() -> Assert.notNull(serverMock, "Jetty Server must not be null"), atLeast(1));
                verify(serverMock, times(2)).getConnectors();
                verify(serverMock).setConnectors(null);
                verify(serverMock, times(2)).start();
                verify(serverMock).setStopAtShutdown(false);
                verify(serverMock).setConnectors(connectorArray);
                verify(serverMock).getHandlers();
                verify(jettyEmbeddedWebAppContextMock).deferredInitialize();
                verify(target).getStartedLogMessage();
            });
        }
    }

    //Sapient generated method id: ${startWhenHandlerInstanceOfHandlerWrapperAndConnectorsIsEmpty}, hash: CBE04492D3D17F3EEB06744E3EF2DF8A
    @Disabled()
    @Test()
    void startWhenHandlerInstanceOfHandlerWrapperAndConnectorsIsEmpty() throws Exception {
        /* Branches:
         * (this.started) : false
         * (!this.autoStart) : false
         * (for-each(this.server.getHandlers())) : true
         * (handler instanceof JettyEmbeddedWebAppContext jettyEmbeddedWebAppContext) : false  #  inside handleDeferredInitialize method
         * (handler instanceof Handler.Wrapper handlerWrapper) : true  #  inside handleDeferredInitialize method
         * (for-each(connectors)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Handler.Wrapper wrapperMock = mock(Handler.Wrapper.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(null).when(serverMock).getHandler();
            _assert.when(() -> Assert.notNull(serverMock, "Jetty Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            JettyWebServer target = spy(new JettyWebServer(serverMock, true));
            Connector[] connectorArray = new Connector[] {};
            doNothing().when(serverMock).setConnectors(null);
            doNothing().when(serverMock).start();
            doNothing().when(serverMock).setStopAtShutdown(false);
            doNothing().when(serverMock).setConnectors(connectorArray);
            List<Handler> handlerList = new ArrayList<>();
            handlerList.add(wrapperMock);
            doReturn(handlerList).when(serverMock).getHandlers();
            doReturn(handlerMock).when(wrapperMock).getHandler();
            Connector[] connectorArray2 = new Connector[] {};
            doReturn(connectorArray, connectorArray2).when(serverMock).getConnectors();
            doReturn("return_of_getStartedLogMessage1").when(target).getStartedLogMessage();
            //Act Statement(s)
            target.start();
            //Assert statement(s)
            assertAll("result", () -> {
                verify(serverMock).getHandler();
                _assert.verify(() -> Assert.notNull(serverMock, "Jetty Server must not be null"), atLeast(1));
                verify(serverMock, times(2)).getConnectors();
                verify(serverMock).setConnectors(null);
                verify(serverMock, times(2)).start();
                verify(serverMock).setStopAtShutdown(false);
                verify(serverMock).setConnectors(connectorArray);
                verify(serverMock).getHandlers();
                verify(wrapperMock).getHandler();
                verify(target).getStartedLogMessage();
            });
        }
    }

    //Sapient generated method id: ${startWhenCaughtIOExceptionAndConnectorNotInstanceOfNetworkConnectorThrowsWebServerException}, hash: E2A3C2305494BD988560969ADC589901
    @Disabled()
    @Test()
    void startWhenCaughtIOExceptionAndConnectorNotInstanceOfNetworkConnectorThrowsWebServerException() throws Exception {
        /* Branches:
         * (this.started) : false
         * (!this.autoStart) : false
         * (for-each(this.server.getHandlers())) : true
         * (handler instanceof JettyEmbeddedWebAppContext jettyEmbeddedWebAppContext) : true  #  inside handleDeferredInitialize method
         * (for-each(connectors)) : true
         * (catch-exception (IOException)) : true
         * (connector instanceof NetworkConnector networkConnector) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        IOException iOExceptionMock = mock(IOException.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(null).when(serverMock).getHandler();
            _assert.when(() -> Assert.notNull(serverMock, "Jetty Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            JettyWebServer target = new JettyWebServer(serverMock, true);
            Connector[] connectorArray = new Connector[] {};
            doNothing().when(serverMock).setConnectors(null);
            doNothing().when(serverMock).start();
            doNothing().when(serverMock).setStopAtShutdown(false);
            doNothing().when(serverMock).setConnectors(connectorArray);
            List<Handler> handlerList = new ArrayList<>();
            handlerList.add(jettyEmbeddedWebAppContextMock);
            doReturn(handlerList).when(serverMock).getHandlers();
            doNothing().when(jettyEmbeddedWebAppContextMock).deferredInitialize();
            Connector[] connectorArray2 = new Connector[] { connectorMock };
            doReturn(connectorArray, connectorArray2).when(serverMock).getConnectors();
            doNothing().when(connectorMock).start();
            doNothing().when(serverMock).stop();
            //Act Statement(s)
            final WebServerException result = assertThrows(WebServerException.class, () -> {
                target.start();
            });
            WebServerException webServerException = new WebServerException("Unable to start embedded Jetty server", iOExceptionMock);
            IOException iOException = new IOException();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(webServerException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
                verify(serverMock).getHandler();
                _assert.verify(() -> Assert.notNull(serverMock, "Jetty Server must not be null"), atLeast(1));
                verify(serverMock, times(2)).getConnectors();
                verify(serverMock).setConnectors(null);
                verify(serverMock, times(2)).start();
                verify(serverMock).setStopAtShutdown(false);
                verify(serverMock).setConnectors(connectorArray);
                verify(serverMock).getHandlers();
                verify(jettyEmbeddedWebAppContextMock).deferredInitialize();
                verify(connectorMock).start();
                verify(serverMock).stop();
            });
        }
    }

    //Sapient generated method id: ${startWhenHandlersIsNotEmptyAndConnectorsIsEmpty}, hash: FB334AB18D431809D8A019A588FC9431
    @Disabled()
    @Test()
    void startWhenHandlersIsNotEmptyAndConnectorsIsEmpty() throws Exception {
        /* Branches:
         * (this.started) : false
         * (!this.autoStart) : false
         * (for-each(this.server.getHandlers())) : true
         * (handler instanceof JettyEmbeddedWebAppContext jettyEmbeddedWebAppContext) : false  #  inside handleDeferredInitialize method
         * (handler instanceof Handler.Wrapper handlerWrapper) : false  #  inside handleDeferredInitialize method
         * (handler instanceof Handler.Collection handlerCollection) : true  #  inside handleDeferredInitialize method
         * (for-each(handlers)) : true  #  inside handleDeferredInitialize method
         * (for-each(connectors)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Handler.Collection collectionMock = mock(Handler.Collection.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(null).when(serverMock).getHandler();
            _assert.when(() -> Assert.notNull(serverMock, "Jetty Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            JettyWebServer target = spy(new JettyWebServer(serverMock, true));
            Connector[] connectorArray = new Connector[] {};
            doNothing().when(serverMock).setConnectors(null);
            doNothing().when(serverMock).start();
            doNothing().when(serverMock).setStopAtShutdown(false);
            doNothing().when(serverMock).setConnectors(connectorArray);
            List<Handler> handlerList = new ArrayList<>();
            handlerList.add(collectionMock);
            doReturn(handlerList).when(serverMock).getHandlers();
            List<Handler> handlerList2 = new ArrayList<>();
            handlerList2.add(handlerMock);
            doReturn(handlerList2).when(collectionMock).getHandlers();
            Connector[] connectorArray2 = new Connector[] {};
            doReturn(connectorArray, connectorArray2).when(serverMock).getConnectors();
            doReturn("return_of_getStartedLogMessage1").when(target).getStartedLogMessage();
            //Act Statement(s)
            target.start();
            //Assert statement(s)
            assertAll("result", () -> {
                verify(serverMock).getHandler();
                _assert.verify(() -> Assert.notNull(serverMock, "Jetty Server must not be null"), atLeast(1));
                verify(serverMock, times(2)).getConnectors();
                verify(serverMock).setConnectors(null);
                verify(serverMock, times(2)).start();
                verify(serverMock).setStopAtShutdown(false);
                verify(serverMock).setConnectors(connectorArray);
                verify(serverMock).getHandlers();
                verify(collectionMock).getHandlers();
                verify(target).getStartedLogMessage();
            });
        }
    }

    //Sapient generated method id: ${getStartedLogMessageWhenConnectorInstanceOfNetworkConnectorAndContextPathIsNull}, hash: 18A98E57BDE23A2491503EAE2AC1B748
    @Disabled()
    @Test()
    void getStartedLogMessageWhenConnectorInstanceOfNetworkConnectorAndContextPathIsNull() throws Exception {
        /* Branches:
         * (JettyReactiveWebServerFactory.class.equals(this.server.getAttribute(WebServerFactory.class.getName()))) : true  #  inside getContextPath method
         * (connectors.length != 1) : true  #  inside getActualPortsDescription method
         * (i < connectors.length) : true  #  inside getActualPortsDescription method
         * (i != 0) : false  #  inside getActualPortsDescription method
         * (connector instanceof NetworkConnector networkConnector) : true  #  inside getLocalPort method
         * (contextPath != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(null).when(serverMock).getHandler();
            _assert.when(() -> Assert.notNull(serverMock, "Jetty Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            stringUtils.when(() -> StringUtils.collectionToDelimitedString(anyList(), eq(", "))).thenReturn("A").thenReturn("B");
            JettyWebServer target = new JettyWebServer(serverMock, false);
            Connector[] connectorArray = new Connector[] {};
            doNothing().when(serverMock).setConnectors(null);
            doNothing().when(serverMock).start();
            doNothing().when(serverMock).setStopAtShutdown(false);
            Object object = new Object();
            doReturn(object).when(serverMock).getAttribute("org.springframework.boot.web.server.WebServerFactory");
            Connector[] connectorArray2 = new Connector[] { networkConnectorMock, connectorMock };
            doReturn(connectorArray, connectorArray2).when(serverMock).getConnectors();
            doReturn(2).when(networkConnectorMock).getLocalPort();
            List<String> stringList = new ArrayList<>();
            doReturn(stringList).when(networkConnectorMock).getProtocols();
            List<String> stringList2 = new ArrayList<>();
            doReturn(stringList2).when(connectorMock).getProtocols();
            //Act Statement(s)
            String result = target.getStartedLogMessage();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("Jetty started on ports 2 (A), 0 (B)"));
                verify(serverMock).getHandler();
                _assert.verify(() -> Assert.notNull(serverMock, "Jetty Server must not be null"), atLeast(1));
                stringUtils.verify(() -> StringUtils.collectionToDelimitedString(anyList(), eq(", ")), atLeast(2));
                verify(serverMock, times(2)).getConnectors();
                verify(serverMock).setConnectors(null);
                verify(serverMock).start();
                verify(serverMock).setStopAtShutdown(false);
                verify(serverMock).getAttribute("org.springframework.boot.web.server.WebServerFactory");
                verify(networkConnectorMock).getLocalPort();
                verify(networkConnectorMock).getProtocols();
                verify(connectorMock).getProtocols();
            });
        }
    }

    //Sapient generated method id: ${getStartedLogMessageWhenINotLessThanConnectorsLengthAndContextPathIsNotNull}, hash: 9E0574CCF06B30B8B25D19D8487E4064
    @Disabled()
    @Test()
    void getStartedLogMessageWhenINotLessThanConnectorsLengthAndContextPathIsNotNull() throws Exception {
        /* Branches:
         * (JettyReactiveWebServerFactory.class.equals(this.server.getAttribute(WebServerFactory.class.getName()))) : false  #  inside getContextPath method
         * (handler instanceof Handler.Wrapper handlerWrapper) : true  #  inside findContextHandler method
         * (handler instanceof ContextHandler contextHandler) : true  #  inside findContextHandler method
         * (connectors.length != 1) : false  #  inside getActualPortsDescription method
         * (i < connectors.length) : false  #  inside getActualPortsDescription method
         * (contextPath != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(null).when(serverMock).getHandler();
            _assert.when(() -> Assert.notNull(serverMock, "Jetty Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            JettyWebServer target = new JettyWebServer(serverMock, false);
            Connector[] connectorArray = new Connector[] {};
            doNothing().when(serverMock).setConnectors(null);
            doNothing().when(serverMock).start();
            doNothing().when(serverMock).setStopAtShutdown(false);
            Object object = new Object();
            doReturn(object).when(serverMock).getAttribute("org.springframework.boot.web.server.WebServerFactory");
            List<Handler> handlerList = new ArrayList<>();
            doReturn(handlerList).when(serverMock).getHandlers();
            Connector[] connectorArray2 = new Connector[] {};
            doReturn(connectorArray, connectorArray2).when(serverMock).getConnectors();
            //Act Statement(s)
            String result = target.getStartedLogMessage();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                verify(serverMock).getHandler();
                _assert.verify(() -> Assert.notNull(serverMock, "Jetty Server must not be null"), atLeast(1));
                verify(serverMock, times(2)).getConnectors();
                verify(serverMock).setConnectors(null);
                verify(serverMock).start();
                verify(serverMock).setStopAtShutdown(false);
                verify(serverMock).getAttribute("org.springframework.boot.web.server.WebServerFactory");
                verify(serverMock).getHandlers();
            });
        }
    }

    //Sapient generated method id: ${getStartedLogMessageWhenConnectorsLengthEquals1AndINotLessThanConnectorsLengthAndContextPathIsNotNull}, hash: F11AF4937563CEF6556C14B0CF396C48
    @Disabled()
    @Test()
    void getStartedLogMessageWhenConnectorsLengthEquals1AndINotLessThanConnectorsLengthAndContextPathIsNotNull() throws Exception {
        /* Branches:
         * (JettyReactiveWebServerFactory.class.equals(this.server.getAttribute(WebServerFactory.class.getName()))) : false  #  inside getContextPath method
         * (handler instanceof Handler.Wrapper handlerWrapper) : true  #  inside findContextHandler method
         * (handler instanceof ContextHandler contextHandler) : false  #  inside findContextHandler method
         * (connectors.length != 1) : false  #  inside getActualPortsDescription method
         * (i < connectors.length) : false  #  inside getActualPortsDescription method
         * (contextPath != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(null).when(serverMock).getHandler();
            _assert.when(() -> Assert.notNull(serverMock, "Jetty Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            JettyWebServer target = new JettyWebServer(serverMock, false);
            Connector[] connectorArray = new Connector[] {};
            doNothing().when(serverMock).setConnectors(null);
            doNothing().when(serverMock).start();
            doNothing().when(serverMock).setStopAtShutdown(false);
            Object object = new Object();
            doReturn(object).when(serverMock).getAttribute("org.springframework.boot.web.server.WebServerFactory");
            List<Handler> handlerList = new ArrayList<>();
            doReturn(handlerList).when(serverMock).getHandlers();
            Connector[] connectorArray2 = new Connector[] {};
            doReturn(connectorArray, connectorArray2).when(serverMock).getConnectors();
            //Act Statement(s)
            String result = target.getStartedLogMessage();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("Jetty started on port  with context path ''"));
                verify(serverMock).getHandler();
                _assert.verify(() -> Assert.notNull(serverMock, "Jetty Server must not be null"), atLeast(1));
                verify(serverMock, times(2)).getConnectors();
                verify(serverMock).setConnectors(null);
                verify(serverMock).start();
                verify(serverMock).setStopAtShutdown(false);
                verify(serverMock).getAttribute("org.springframework.boot.web.server.WebServerFactory");
                verify(serverMock).getHandlers();
            });
        }
    }

    //Sapient generated method id: ${stopWhenThisServerGetConnectorsIsNotEmpty}, hash: 0F7BE3C7992DC7D4E2AB4FF3DEF49C93
    @Disabled()
    @Test()
    void stopWhenThisServerGetConnectorsIsNotEmpty() throws Exception {
        /* Branches:
         * (this.gracefulShutdown != null) : false
         * (for-each(this.server.getConnectors())) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(null).when(serverMock).getHandler();
            _assert.when(() -> Assert.notNull(serverMock, "Jetty Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            JettyWebServer target = new JettyWebServer(serverMock, false);
            Connector[] connectorArray = new Connector[] {};
            doNothing().when(serverMock).setConnectors(null);
            doNothing().when(serverMock).start();
            doNothing().when(serverMock).setStopAtShutdown(false);
            Connector[] connectorArray2 = new Connector[] { connectorMock };
            doReturn(connectorArray, connectorArray2).when(serverMock).getConnectors();
            doNothing().when(connectorMock).stop();
            //Act Statement(s)
            target.stop();
            //Assert statement(s)
            assertAll("result", () -> {
                verify(serverMock).getHandler();
                _assert.verify(() -> Assert.notNull(serverMock, "Jetty Server must not be null"), atLeast(1));
                verify(serverMock, times(2)).getConnectors();
                verify(serverMock).setConnectors(null);
                verify(serverMock).start();
                verify(serverMock).setStopAtShutdown(false);
                verify(connectorMock).stop();
            });
        }
    }

    //Sapient generated method id: ${stopWhenCaughtInterruptedException}, hash: 9EC6C3A352CF5D1724D6840C56CF7049
    @Disabled()
    @Test()
    void stopWhenCaughtInterruptedException() throws Exception {
        /* Branches:
         * (this.gracefulShutdown != null) : false
         * (for-each(this.server.getConnectors())) : true
         * (catch-exception (InterruptedException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(null).when(serverMock).getHandler();
            _assert.when(() -> Assert.notNull(serverMock, "Jetty Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            JettyWebServer target = new JettyWebServer(serverMock, false);
            Connector[] connectorArray = new Connector[] {};
            doNothing().when(serverMock).setConnectors(null);
            doNothing().when(serverMock).start();
            doNothing().when(serverMock).setStopAtShutdown(false);
            Connector[] connectorArray2 = new Connector[] { connectorMock };
            doReturn(connectorArray, connectorArray2).when(serverMock).getConnectors();
            doNothing().when(connectorMock).stop();
            //Act Statement(s)
            target.stop();
            //Assert statement(s)
            assertAll("result", () -> {
                verify(serverMock).getHandler();
                _assert.verify(() -> Assert.notNull(serverMock, "Jetty Server must not be null"), atLeast(1));
                verify(serverMock, times(2)).getConnectors();
                verify(serverMock).setConnectors(null);
                verify(serverMock).start();
                verify(serverMock).setStopAtShutdown(false);
                verify(connectorMock).stop();
            });
        }
    }

    //Sapient generated method id: ${stopWhenCaughtExceptionThrowsWebServerException}, hash: CE7DD5A51306BB6BB6C00E27758CE05E
    @Disabled()
    @Test()
    void stopWhenCaughtExceptionThrowsWebServerException() throws Exception {
        /* Branches:
         * (this.gracefulShutdown != null) : false
         * (for-each(this.server.getConnectors())) : true
         * (catch-exception (Exception)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(null).when(serverMock).getHandler();
            _assert.when(() -> Assert.notNull(serverMock, "Jetty Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            JettyWebServer target = new JettyWebServer(serverMock, false);
            Connector[] connectorArray = new Connector[] {};
            doNothing().when(serverMock).setConnectors(null);
            doNothing().when(serverMock).start();
            doNothing().when(serverMock).setStopAtShutdown(false);
            Connector[] connectorArray2 = new Connector[] { connectorMock };
            doReturn(connectorArray, connectorArray2).when(serverMock).getConnectors();
            Exception exception = new Exception();
            doThrow(exception).when(connectorMock).stop();
            //Act Statement(s)
            final WebServerException result = assertThrows(WebServerException.class, () -> {
                target.stop();
            });
            WebServerException webServerException = new WebServerException("Unable to stop embedded Jetty server", exception);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(webServerException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(exception.getClass())));
                verify(serverMock).getHandler();
                _assert.verify(() -> Assert.notNull(serverMock, "Jetty Server must not be null"), atLeast(1));
                verify(serverMock, times(2)).getConnectors();
                verify(serverMock).setConnectors(null);
                verify(serverMock).start();
                verify(serverMock).setStopAtShutdown(false);
                verify(connectorMock).stop();
            });
        }
    }

    //Sapient generated method id: ${destroyTest}, hash: 2CFC7C49C2E2F8EF05E9C01340A32552
    @Test()
    void destroyTest() throws Exception {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(null).when(serverMock).getHandler();
            _assert.when(() -> Assert.notNull(serverMock, "Jetty Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            JettyWebServer target = new JettyWebServer(serverMock, false);
            Connector[] connectorArray = new Connector[] {};
            doReturn(connectorArray).when(serverMock).getConnectors();
            doNothing().when(serverMock).setConnectors(null);
            doNothing().when(serverMock).start();
            doNothing().when(serverMock).setStopAtShutdown(false);
            doNothing().when(serverMock).stop();
            //Act Statement(s)
            target.destroy();
            //Assert statement(s)
            assertAll("result", () -> {
                verify(serverMock).getHandler();
                _assert.verify(() -> Assert.notNull(serverMock, "Jetty Server must not be null"), atLeast(1));
                verify(serverMock).getConnectors();
                verify(serverMock).setConnectors(null);
                verify(serverMock).start();
                verify(serverMock).setStopAtShutdown(false);
                verify(serverMock).stop();
            });
        }
    }

    //Sapient generated method id: ${destroyWhenCaughtExceptionThrowsWebServerException}, hash: F4B15AC1AEAC4B1107DB76CE9EEDE650
    @Test()
    void destroyWhenCaughtExceptionThrowsWebServerException() throws Exception {
        /* Branches:
         * (catch-exception (Exception)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(null).when(serverMock).getHandler();
            _assert.when(() -> Assert.notNull(serverMock, "Jetty Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            JettyWebServer target = new JettyWebServer(serverMock, false);
            Connector[] connectorArray = new Connector[] {};
            doReturn(connectorArray).when(serverMock).getConnectors();
            doNothing().when(serverMock).setConnectors(null);
            doNothing().when(serverMock).start();
            doNothing().when(serverMock).setStopAtShutdown(false);
            Exception exception = new Exception();
            doThrow(exception).when(serverMock).stop();
            //Act Statement(s)
            final WebServerException result = assertThrows(WebServerException.class, () -> {
                target.destroy();
            });
            WebServerException webServerException = new WebServerException("Unable to destroy embedded Jetty server", exception);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(webServerException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(exception.getClass())));
                verify(serverMock).getHandler();
                _assert.verify(() -> Assert.notNull(serverMock, "Jetty Server must not be null"), atLeast(1));
                verify(serverMock).getConnectors();
                verify(serverMock).setConnectors(null);
                verify(serverMock).start();
                verify(serverMock).setStopAtShutdown(false);
                verify(serverMock).stop();
            });
        }
    }

    //Sapient generated method id: ${getPortWhenLocalPortGreaterThan0}, hash: 9B064568D4411A5296826250D39F0737
    @Disabled()
    @Test()
    void getPortWhenLocalPortGreaterThan0() throws Exception {
        /* Branches:
         * (for-each(connectors)) : true
         * (connector instanceof NetworkConnector networkConnector) : true  #  inside getLocalPort method
         * (localPort > 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(null).when(serverMock).getHandler();
            _assert.when(() -> Assert.notNull(serverMock, "Jetty Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            JettyWebServer target = new JettyWebServer(serverMock, false);
            Connector[] connectorArray = new Connector[] {};
            doNothing().when(serverMock).setConnectors(null);
            doNothing().when(serverMock).start();
            doNothing().when(serverMock).setStopAtShutdown(false);
            Connector[] connectorArray2 = new Connector[] { networkConnectorMock };
            doReturn(connectorArray, connectorArray2).when(serverMock).getConnectors();
            doReturn(1).when(networkConnectorMock).getLocalPort();
            //Act Statement(s)
            int result = target.getPort();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(1));
                verify(serverMock).getHandler();
                _assert.verify(() -> Assert.notNull(serverMock, "Jetty Server must not be null"), atLeast(1));
                verify(serverMock, times(2)).getConnectors();
                verify(serverMock).setConnectors(null);
                verify(serverMock).start();
                verify(serverMock).setStopAtShutdown(false);
                verify(networkConnectorMock).getLocalPort();
            });
        }
    }

    //Sapient generated method id: ${getPortWhenLocalPortNotGreaterThan0}, hash: C19FF13E8FB3F127052DF150AC4277A9
    @Disabled()
    @Test()
    void getPortWhenLocalPortNotGreaterThan0() throws Exception {
        /* Branches:
         * (for-each(connectors)) : true
         * (connector instanceof NetworkConnector networkConnector) : true  #  inside getLocalPort method
         * (localPort > 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(null).when(serverMock).getHandler();
            _assert.when(() -> Assert.notNull(serverMock, "Jetty Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            JettyWebServer target = new JettyWebServer(serverMock, false);
            Connector[] connectorArray = new Connector[] {};
            doNothing().when(serverMock).setConnectors(null);
            doNothing().when(serverMock).start();
            doNothing().when(serverMock).setStopAtShutdown(false);
            Connector[] connectorArray2 = new Connector[] { networkConnectorMock };
            doReturn(connectorArray, connectorArray2).when(serverMock).getConnectors();
            doReturn(0).when(networkConnectorMock).getLocalPort();
            //Act Statement(s)
            int result = target.getPort();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                verify(serverMock).getHandler();
                _assert.verify(() -> Assert.notNull(serverMock, "Jetty Server must not be null"), atLeast(1));
                verify(serverMock, times(2)).getConnectors();
                verify(serverMock).setConnectors(null);
                verify(serverMock).start();
                verify(serverMock).setStopAtShutdown(false);
                verify(networkConnectorMock).getLocalPort();
            });
        }
    }

    //Sapient generated method id: ${getPortWhenConnectorNotInstanceOfNetworkConnectorAndLocalPortNotGreaterThan0}, hash: 3830E07FDFD372AB43ACE994DE9FFBDC
    @Disabled()
    @Test()
    void getPortWhenConnectorNotInstanceOfNetworkConnectorAndLocalPortNotGreaterThan0() throws Exception {
        /* Branches:
         * (for-each(connectors)) : true
         * (connector instanceof NetworkConnector networkConnector) : false  #  inside getLocalPort method
         * (localPort > 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(null).when(serverMock).getHandler();
            _assert.when(() -> Assert.notNull(serverMock, "Jetty Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            JettyWebServer target = new JettyWebServer(serverMock, false);
            Connector[] connectorArray = new Connector[] {};
            doNothing().when(serverMock).setConnectors(null);
            doNothing().when(serverMock).start();
            doNothing().when(serverMock).setStopAtShutdown(false);
            Connector[] connectorArray2 = new Connector[] { connectorMock };
            doReturn(connectorArray, connectorArray2).when(serverMock).getConnectors();
            //Act Statement(s)
            int result = target.getPort();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                verify(serverMock).getHandler();
                _assert.verify(() -> Assert.notNull(serverMock, "Jetty Server must not be null"), atLeast(1));
                verify(serverMock, times(2)).getConnectors();
                verify(serverMock).setConnectors(null);
                verify(serverMock).start();
                verify(serverMock).setStopAtShutdown(false);
            });
        }
    }

    //Sapient generated method id: ${shutDownGracefullyWhenThisGracefulShutdownIsNull}, hash: EA0DB94BF03F05A3A8A59D8E29CDAF40
    @Test()
    void shutDownGracefullyWhenThisGracefulShutdownIsNull() throws Exception {
        /* Branches:
         * (this.gracefulShutdown == null) : true
         */
        //Arrange Statement(s)
        GracefulShutdownCallback callbackMock = mock(GracefulShutdownCallback.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doNothing().when(callbackMock).shutdownComplete(GracefulShutdownResult.IMMEDIATE);
            doReturn(null).when(serverMock).getHandler();
            _assert.when(() -> Assert.notNull(serverMock, "Jetty Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            JettyWebServer target = new JettyWebServer(serverMock, false);
            Connector[] connectorArray = new Connector[] {};
            doReturn(connectorArray).when(serverMock).getConnectors();
            doNothing().when(serverMock).setConnectors(null);
            doNothing().when(serverMock).start();
            doNothing().when(serverMock).setStopAtShutdown(false);
            //Act Statement(s)
            target.shutDownGracefully(callbackMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(callbackMock).shutdownComplete(GracefulShutdownResult.IMMEDIATE);
                verify(serverMock).getHandler();
                _assert.verify(() -> Assert.notNull(serverMock, "Jetty Server must not be null"), atLeast(1));
                verify(serverMock).getConnectors();
                verify(serverMock).setConnectors(null);
                verify(serverMock).start();
                verify(serverMock).setStopAtShutdown(false);
            });
        }
    }
}
