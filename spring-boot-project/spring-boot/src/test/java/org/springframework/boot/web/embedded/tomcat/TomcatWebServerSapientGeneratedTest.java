package org.springframework.boot.web.embedded.tomcat;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.web.server.WebServerException;
import org.apache.catalina.LifecycleException;
import javax.naming.NamingException;
import org.apache.catalina.Host;
import org.apache.catalina.LifecycleListener;
import org.springframework.util.StringUtils;
import org.springframework.util.Assert;
import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.web.server.GracefulShutdownCallback;
import org.apache.catalina.LifecycleState;
import org.apache.catalina.Server;
import org.mockito.stubbing.Answer;
import org.springframework.boot.web.server.Shutdown;
import org.apache.catalina.Engine;
import org.apache.catalina.Context;
import java.util.function.IntSupplier;
import org.springframework.boot.web.server.PortInUseException;
import org.apache.catalina.Container;
import org.apache.naming.ContextBindings;
import org.mockito.MockedStatic;
import org.apache.catalina.Service;
import org.apache.catalina.connector.Connector;
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
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class TomcatWebServerSapientGeneratedTest {

    private final Tomcat tomcatMock = mock(Tomcat.class, "tomcat");

    private final Connector connectorMock = mock(Connector.class);

    private final Connector connectorMock2 = mock(Connector.class);

    private final Connector connectorMock3 = mock(Connector.class);

    private final Connector connectorMock4 = mock(Connector.class);

    private final Connector connectorMock5 = mock(Connector.class);

    private final Context contextMock = mock(Context.class);

    private final Engine engineMock = mock(Engine.class);

    private final Host hostMock = mock(Host.class);

    private final Host hostMock2 = mock(Host.class);

    private final Host hostMock3 = mock(Host.class);

    private final Host hostMock4 = mock(Host.class);

    private final Server serverMock = mock(Server.class);

    private final Server serverMock2 = mock(Server.class);

    private final Server serverMock3 = mock(Server.class);

    private final Service serviceMock = mock(Service.class);

    private final Service serviceMock2 = mock(Service.class);

    private final Service serviceMock3 = mock(Service.class);

    private final Service serviceMock4 = mock(Service.class);

    private final Service serviceMock5 = mock(Service.class);

    private final TomcatEmbeddedContext tomcatEmbeddedContextMock = mock(TomcatEmbeddedContext.class);

    private final TomcatEmbeddedContext tomcatEmbeddedContextMock2 = mock(TomcatEmbeddedContext.class);

    private final TomcatStarter tomcatStarterMock = mock(TomcatStarter.class);

    //Sapient generated method id: ${startWhenThreadCurrentThreadGetContextClassLoaderNotInstanceOfTomcatEmbeddedWebappClThrowsConnectorStartFailedException}, hash: 579340D5CE5FD025C562314A2143C9B8
    @Disabled()
    @Test()
    void startWhenThreadCurrentThreadGetContextClassLoaderNotInstanceOfTomcatEmbeddedWebappClThrowsConnectorStartFailedException() throws WebServerException, LifecycleException, NamingException {
        /* Branches:
         * (this.started) : false
         * (for-each(services)) : true  #  inside addPreviouslyRemovedConnectors method
         * (connectors != null) : false  #  inside addPreviouslyRemovedConnectors method
         * (connector != null) : true
         * (this.autoStart) : true
         * (for-each(this.tomcat.getHost().findChildren())) : true  #  inside performDeferredLoadOnStartup method
         * (child instanceof TomcatEmbeddedContext embeddedContext) : true  #  inside performDeferredLoadOnStartup method
         * (LifecycleState.FAILED.equals(connector.getState())) : true  #  inside checkConnectorHasStarted method
         * (Thread.currentThread().getContextClassLoader() instanceof TomcatEmbeddedWebappClassLoader) : false  #  inside stopTomcat method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<ContextBindings> contextBindings = mockStatic(ContextBindings.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            contextBindings.when(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(contextMock).addLifecycleListener((LifecycleListener) any());
            doReturn(object).when(contextMock).getNamingToken();
            TomcatWebServer target = new TomcatWebServer(tomcatMock, true, Shutdown.GRACEFUL);
            doReturn(serviceMock).when(tomcatMock).getService();
            Connector[] connectorArray = new Connector[] { connectorMock, connectorMock2 };
            doReturn(connectorArray).when(serviceMock).findConnectors();
            doReturn(2).when(connectorMock).getPort();
            doReturn("A").when(connectorMock).getScheme();
            doReturn(engineMock).when(tomcatMock).getEngine();
            doReturn("B").when(engineMock).getName();
            doNothing().when(engineMock).setName("B-2");
            Container[] containerArray = new Container[] { contextMock };
            doReturn(containerArray).when(hostMock).findChildren();
            Service[] serviceArray = new Service[] { serviceMock2 };
            doReturn(serviceArray).when(serverMock).findServices();
            Connector[] connectorArray2 = new Connector[] {};
            doReturn(connectorArray2).when(serviceMock2).findConnectors();
            Service[] serviceArray2 = new Service[] { serviceMock3 };
            doReturn(serviceArray2).when(serverMock2).findServices();
            Connector[] connectorArray3 = new Connector[] {};
            doReturn(connectorArray3).when(serviceMock3).findConnectors();
            doNothing().when(tomcatMock).start();
            Container[] containerArray2 = new Container[] { tomcatEmbeddedContextMock };
            doReturn(containerArray2).when(hostMock2).findChildren();
            doReturn(tomcatStarterMock).when(tomcatEmbeddedContextMock).getStarter();
            doReturn(null).when(tomcatStarterMock).getStartUpException();
            doReturn(LifecycleState.STARTED).when(tomcatEmbeddedContextMock).getState();
            doReturn(serverMock, serverMock2, serverMock3).when(tomcatMock).getServer();
            Service[] serviceArray3 = new Service[] { serviceMock4 };
            doReturn(serviceArray3).when(serverMock3).findServices();
            doReturn(hostMock, hostMock2, hostMock3).when(tomcatMock).getHost();
            Container[] containerArray3 = new Container[] { tomcatEmbeddedContextMock2 };
            doReturn(containerArray3).when(hostMock3).findChildren();
            doNothing().when(tomcatEmbeddedContextMock2).deferredLoadOnStartup();
            doReturn(connectorMock3, connectorMock4).when(tomcatMock).getConnector();
            doReturn(LifecycleState.FAILED).when(connectorMock4).getState();
            doReturn(0).when(connectorMock4).getPort();
            doNothing().when(tomcatMock).stop();
            //Act Statement(s)
            final ConnectorStartFailedException result = assertThrows(ConnectorStartFailedException.class, () -> {
                target.start();
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null"), atLeast(1));
                contextBindings.verify(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any()));
                verify(contextMock).addLifecycleListener((LifecycleListener) any());
                verify(contextMock).getNamingToken();
                verify(tomcatMock).getService();
                verify(serviceMock).findConnectors();
                verify(connectorMock).getPort();
                verify(connectorMock).getScheme();
                verify(tomcatMock).getEngine();
                verify(engineMock).getName();
                verify(engineMock).setName("B-2");
                verify(tomcatMock, times(3)).getHost();
                verify(hostMock).findChildren();
                verify(tomcatMock, times(3)).getServer();
                verify(serverMock).findServices();
                verify(serviceMock2).findConnectors();
                verify(serverMock2).findServices();
                verify(serviceMock3).findConnectors();
                verify(tomcatMock).start();
                verify(hostMock2).findChildren();
                verify(tomcatEmbeddedContextMock).getStarter();
                verify(tomcatStarterMock).getStartUpException();
                verify(tomcatEmbeddedContextMock).getState();
                verify(serverMock3).findServices();
                verify(tomcatMock, times(2)).getConnector();
                verify(hostMock3).findChildren();
                verify(tomcatEmbeddedContextMock2).deferredLoadOnStartup();
                verify(connectorMock4).getState();
                verify(connectorMock4).getPort();
                verify(tomcatMock).stop();
            });
        }
    }

    //Sapient generated method id: ${startWhenThisTomcatGetServiceFindConnectorsIsNotEmptyAndCaughtExceptionThrowsWebServerException}, hash: A617B47B2B29A620CB3C104D619B00E9
    @Disabled()
    @Test()
    void startWhenThisTomcatGetServiceFindConnectorsIsNotEmptyAndCaughtExceptionThrowsWebServerException() throws WebServerException, LifecycleException, NamingException {
        /* Branches:
         * (this.started) : false
         * (for-each(services)) : true  #  inside addPreviouslyRemovedConnectors method
         * (connectors != null) : false  #  inside addPreviouslyRemovedConnectors method
         * (connector != null) : true
         * (this.autoStart) : true
         * (for-each(this.tomcat.getHost().findChildren())) : true  #  inside performDeferredLoadOnStartup method
         * (child instanceof TomcatEmbeddedContext embeddedContext) : true  #  inside performDeferredLoadOnStartup method
         * (LifecycleState.FAILED.equals(connector.getState())) : false  #  inside checkConnectorHasStarted method
         * (for-each(this.tomcat.getService().findConnectors())) : true  #  inside checkThatConnectorsHaveStarted method
         * (catch-exception (Exception)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<PortInUseException> portInUseException = mockStatic(PortInUseException.class);
            MockedStatic<ContextBindings> contextBindings = mockStatic(ContextBindings.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            contextBindings.when(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(contextMock).addLifecycleListener((LifecycleListener) any());
            doReturn(object).when(contextMock).getNamingToken();
            Exception exception = new Exception();
            portInUseException.when(() -> PortInUseException.throwIfPortBindingException(eq(exception), (IntSupplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            TomcatWebServer target = spy(new TomcatWebServer(tomcatMock, true, Shutdown.GRACEFUL));
            Connector[] connectorArray = new Connector[] { connectorMock, connectorMock2 };
            doReturn(connectorArray).when(serviceMock).findConnectors();
            doReturn(2).when(connectorMock).getPort();
            doReturn("B").when(connectorMock).getScheme();
            doReturn(engineMock).when(tomcatMock).getEngine();
            doReturn("C").when(engineMock).getName();
            doNothing().when(engineMock).setName("C-2");
            Container[] containerArray = new Container[] { contextMock };
            doReturn(containerArray).when(hostMock).findChildren();
            Service[] serviceArray = new Service[] { serviceMock2 };
            doReturn(serviceArray).when(serverMock).findServices();
            Connector[] connectorArray2 = new Connector[] {};
            doReturn(connectorArray2).when(serviceMock2).findConnectors();
            Service[] serviceArray2 = new Service[] { serviceMock3 };
            doReturn(serviceArray2).when(serverMock2).findServices();
            Connector[] connectorArray3 = new Connector[] {};
            doReturn(connectorArray3).when(serviceMock3).findConnectors();
            doNothing().when(tomcatMock).start();
            Container[] containerArray2 = new Container[] { tomcatEmbeddedContextMock };
            doReturn(containerArray2).when(hostMock2).findChildren();
            doReturn(tomcatStarterMock).when(tomcatEmbeddedContextMock).getStarter();
            doReturn(null).when(tomcatStarterMock).getStartUpException();
            doReturn(LifecycleState.STARTED).when(tomcatEmbeddedContextMock).getState();
            doReturn(serverMock, serverMock2, serverMock3).when(tomcatMock).getServer();
            Service[] serviceArray3 = new Service[] { serviceMock4 };
            doReturn(serviceArray3).when(serverMock3).findServices();
            doReturn(hostMock, hostMock2, hostMock3).when(tomcatMock).getHost();
            Container[] containerArray3 = new Container[] { tomcatEmbeddedContextMock2 };
            doReturn(containerArray3).when(hostMock3).findChildren();
            doNothing().when(tomcatEmbeddedContextMock2).deferredLoadOnStartup();
            doReturn(connectorMock3, connectorMock4).when(tomcatMock).getConnector();
            doReturn(LifecycleState.DESTROYED).when(connectorMock4).getState();
            doReturn(serviceMock, serviceMock5).when(tomcatMock).getService();
            Connector[] connectorArray4 = new Connector[] { connectorMock5 };
            doReturn(connectorArray4).when(serviceMock5).findConnectors();
            doReturn(LifecycleState.STOPPED).when(connectorMock5).getState();
            doReturn("return_of_getStartedLogMessage1").when(target).getStartedLogMessage();
            //Act Statement(s)
            final WebServerException result = assertThrows(WebServerException.class, () -> {
                target.start();
            });
            WebServerException webServerException = new WebServerException("Unable to start embedded Tomcat server", exception);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(webServerException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(exception.getClass())));
                _assert.verify(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null"), atLeast(1));
                contextBindings.verify(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any()));
                verify(contextMock).addLifecycleListener((LifecycleListener) any());
                verify(contextMock).getNamingToken();
                portInUseException.verify(() -> PortInUseException.throwIfPortBindingException(eq(exception), (IntSupplier) any()));
                verify(tomcatMock, times(2)).getService();
                verify(serviceMock).findConnectors();
                verify(connectorMock).getPort();
                verify(connectorMock).getScheme();
                verify(tomcatMock).getEngine();
                verify(engineMock).getName();
                verify(engineMock).setName("C-2");
                verify(tomcatMock, times(3)).getHost();
                verify(hostMock).findChildren();
                verify(tomcatMock, times(3)).getServer();
                verify(serverMock).findServices();
                verify(serviceMock2).findConnectors();
                verify(serverMock2).findServices();
                verify(serviceMock3).findConnectors();
                verify(tomcatMock).start();
                verify(hostMock2).findChildren();
                verify(tomcatEmbeddedContextMock).getStarter();
                verify(tomcatStarterMock).getStartUpException();
                verify(tomcatEmbeddedContextMock).getState();
                verify(serverMock3).findServices();
                verify(tomcatMock, times(2)).getConnector();
                verify(hostMock3).findChildren();
                verify(tomcatEmbeddedContextMock2).deferredLoadOnStartup();
                verify(connectorMock4).getState();
                verify(serviceMock5).findConnectors();
                verify(connectorMock5).getState();
                verify(target).getStartedLogMessage();
            });
        }
    }

    //Sapient generated method id: ${startWhenThreadCurrentThreadGetContextClassLoaderNotInstanceOfTomcatEmbeddedWebappCl2ThrowsConnectorStartFailedException}, hash: 0E3E16DAC886B2B2FD6D3C1FD6E01751
    @Disabled()
    @Test()
    void startWhenThreadCurrentThreadGetContextClassLoaderNotInstanceOfTomcatEmbeddedWebappCl2ThrowsConnectorStartFailedException() throws WebServerException, LifecycleException, NamingException {
        /* Branches:
         * (this.started) : false
         * (for-each(services)) : true  #  inside addPreviouslyRemovedConnectors method
         * (connectors != null) : false  #  inside addPreviouslyRemovedConnectors method
         * (connector != null) : true
         * (this.autoStart) : true
         * (for-each(this.tomcat.getHost().findChildren())) : true  #  inside performDeferredLoadOnStartup method
         * (child instanceof TomcatEmbeddedContext embeddedContext) : true  #  inside performDeferredLoadOnStartup method
         * (LifecycleState.FAILED.equals(connector.getState())) : false  #  inside checkConnectorHasStarted method
         * (for-each(this.tomcat.getService().findConnectors())) : true  #  inside checkThatConnectorsHaveStarted method
         * (Thread.currentThread().getContextClassLoader() instanceof TomcatEmbeddedWebappClassLoader) : false  #  inside stopTomcat method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<ContextBindings> contextBindings = mockStatic(ContextBindings.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            contextBindings.when(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(contextMock).addLifecycleListener((LifecycleListener) any());
            doReturn(object).when(contextMock).getNamingToken();
            TomcatWebServer target = new TomcatWebServer(tomcatMock, true, Shutdown.GRACEFUL);
            Connector[] connectorArray = new Connector[] { connectorMock, connectorMock2 };
            doReturn(connectorArray).when(serviceMock).findConnectors();
            doReturn(2).when(connectorMock).getPort();
            doReturn("B").when(connectorMock).getScheme();
            doReturn(engineMock).when(tomcatMock).getEngine();
            doReturn("C").when(engineMock).getName();
            doNothing().when(engineMock).setName("C-2");
            Container[] containerArray = new Container[] { contextMock };
            doReturn(containerArray).when(hostMock).findChildren();
            Service[] serviceArray = new Service[] { serviceMock2 };
            doReturn(serviceArray).when(serverMock).findServices();
            Connector[] connectorArray2 = new Connector[] {};
            doReturn(connectorArray2).when(serviceMock2).findConnectors();
            Service[] serviceArray2 = new Service[] { serviceMock3 };
            doReturn(serviceArray2).when(serverMock2).findServices();
            Connector[] connectorArray3 = new Connector[] {};
            doReturn(connectorArray3).when(serviceMock3).findConnectors();
            doNothing().when(tomcatMock).start();
            Container[] containerArray2 = new Container[] { tomcatEmbeddedContextMock };
            doReturn(containerArray2).when(hostMock2).findChildren();
            doReturn(tomcatStarterMock).when(tomcatEmbeddedContextMock).getStarter();
            doReturn(null).when(tomcatStarterMock).getStartUpException();
            doReturn(LifecycleState.STARTED).when(tomcatEmbeddedContextMock).getState();
            doReturn(serverMock, serverMock2, serverMock3).when(tomcatMock).getServer();
            Service[] serviceArray3 = new Service[] { serviceMock4 };
            doReturn(serviceArray3).when(serverMock3).findServices();
            doReturn(hostMock, hostMock2, hostMock3).when(tomcatMock).getHost();
            Container[] containerArray3 = new Container[] { tomcatEmbeddedContextMock2 };
            doReturn(containerArray3).when(hostMock3).findChildren();
            doNothing().when(tomcatEmbeddedContextMock2).deferredLoadOnStartup();
            doReturn(connectorMock3, connectorMock4).when(tomcatMock).getConnector();
            doReturn(LifecycleState.STOPPING).when(connectorMock4).getState();
            doReturn(serviceMock, serviceMock5).when(tomcatMock).getService();
            Connector[] connectorArray4 = new Connector[] { connectorMock5 };
            doReturn(connectorArray4).when(serviceMock5).findConnectors();
            doReturn(LifecycleState.FAILED).when(connectorMock5).getState();
            doReturn(0).when(connectorMock5).getPort();
            doNothing().when(tomcatMock).stop();
            //Act Statement(s)
            final ConnectorStartFailedException result = assertThrows(ConnectorStartFailedException.class, () -> {
                target.start();
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null"), atLeast(1));
                contextBindings.verify(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any()));
                verify(contextMock).addLifecycleListener((LifecycleListener) any());
                verify(contextMock).getNamingToken();
                verify(tomcatMock, times(2)).getService();
                verify(serviceMock).findConnectors();
                verify(connectorMock).getPort();
                verify(connectorMock).getScheme();
                verify(tomcatMock).getEngine();
                verify(engineMock).getName();
                verify(engineMock).setName("C-2");
                verify(tomcatMock, times(3)).getHost();
                verify(hostMock).findChildren();
                verify(tomcatMock, times(3)).getServer();
                verify(serverMock).findServices();
                verify(serviceMock2).findConnectors();
                verify(serverMock2).findServices();
                verify(serviceMock3).findConnectors();
                verify(tomcatMock).start();
                verify(hostMock2).findChildren();
                verify(tomcatEmbeddedContextMock).getStarter();
                verify(tomcatStarterMock).getStartUpException();
                verify(tomcatEmbeddedContextMock).getState();
                verify(serverMock3).findServices();
                verify(tomcatMock, times(2)).getConnector();
                verify(hostMock3).findChildren();
                verify(tomcatEmbeddedContextMock2).deferredLoadOnStartup();
                verify(connectorMock4).getState();
                verify(serviceMock5).findConnectors();
                verify(connectorMock5).getState();
                verify(connectorMock5).getPort();
                verify(tomcatMock).stop();
            });
        }
    }

    //Sapient generated method id: ${startWhenChildInstanceOfContext}, hash: 82C75C05BE3D7756B72A30555297E736
    @Disabled()
    @Test()
    void startWhenChildInstanceOfContext() throws Exception {
        /* Branches:
         * (this.started) : false
         * (for-each(services)) : true  #  inside addPreviouslyRemovedConnectors method
         * (connectors != null) : false  #  inside addPreviouslyRemovedConnectors method
         * (connector != null) : true
         * (this.autoStart) : true
         * (for-each(this.tomcat.getHost().findChildren())) : true  #  inside performDeferredLoadOnStartup method
         * (child instanceof TomcatEmbeddedContext embeddedContext) : true  #  inside performDeferredLoadOnStartup method
         * (LifecycleState.FAILED.equals(connector.getState())) : false  #  inside checkConnectorHasStarted method
         * (for-each(this.tomcat.getService().findConnectors())) : true  #  inside checkThatConnectorsHaveStarted method
         * (for-each(this.tomcat.getHost().findChildren())) : true  #  inside findContext method
         * (child instanceof Context context) : true  #  inside findContext method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Context contextMock2 = mock(Context.class);
        try (MockedStatic<ContextBindings> contextBindings = mockStatic(ContextBindings.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            contextBindings.when(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(contextMock).addLifecycleListener((LifecycleListener) any());
            doReturn(object).when(contextMock).getNamingToken();
            Object object2 = new Object();
            contextBindings.when(() -> ContextBindings.unbindClassLoader(eq(contextMock2), eq(object2), (ClassLoader) any())).thenAnswer((Answer<Void>) invocation -> null);
            doReturn(object2).when(contextMock2).getNamingToken();
            TomcatWebServer target = spy(new TomcatWebServer(tomcatMock, true, Shutdown.GRACEFUL));
            Connector[] connectorArray = new Connector[] { connectorMock, connectorMock2 };
            doReturn(connectorArray).when(serviceMock).findConnectors();
            doReturn(2).when(connectorMock).getPort();
            doReturn("B").when(connectorMock).getScheme();
            doReturn(engineMock).when(tomcatMock).getEngine();
            doReturn("C").when(engineMock).getName();
            doNothing().when(engineMock).setName("C-2");
            Container[] containerArray = new Container[] { contextMock };
            doReturn(containerArray).when(hostMock).findChildren();
            Service[] serviceArray = new Service[] { serviceMock2 };
            doReturn(serviceArray).when(serverMock).findServices();
            Connector[] connectorArray2 = new Connector[] {};
            doReturn(connectorArray2).when(serviceMock2).findConnectors();
            Service[] serviceArray2 = new Service[] { serviceMock3 };
            doReturn(serviceArray2).when(serverMock2).findServices();
            Connector[] connectorArray3 = new Connector[] {};
            doReturn(connectorArray3).when(serviceMock3).findConnectors();
            doNothing().when(tomcatMock).start();
            Container[] containerArray2 = new Container[] { tomcatEmbeddedContextMock };
            doReturn(containerArray2).when(hostMock2).findChildren();
            doReturn(tomcatStarterMock).when(tomcatEmbeddedContextMock).getStarter();
            doReturn(null).when(tomcatStarterMock).getStartUpException();
            doReturn(LifecycleState.STARTED).when(tomcatEmbeddedContextMock).getState();
            doReturn(serverMock, serverMock2, serverMock3).when(tomcatMock).getServer();
            Service[] serviceArray3 = new Service[] { serviceMock4 };
            doReturn(serviceArray3).when(serverMock3).findServices();
            Container[] containerArray3 = new Container[] { tomcatEmbeddedContextMock2 };
            doReturn(containerArray3).when(hostMock3).findChildren();
            doNothing().when(tomcatEmbeddedContextMock2).deferredLoadOnStartup();
            doReturn(connectorMock3, connectorMock4).when(tomcatMock).getConnector();
            doReturn(LifecycleState.DESTROYED).when(connectorMock4).getState();
            doReturn(serviceMock, serviceMock5).when(tomcatMock).getService();
            Connector[] connectorArray4 = new Connector[] { connectorMock5 };
            doReturn(connectorArray4).when(serviceMock5).findConnectors();
            doReturn(LifecycleState.STOPPED).when(connectorMock5).getState();
            doReturn("return_of_getStartedLogMessage1").when(target).getStartedLogMessage();
            doReturn(hostMock, hostMock2, hostMock3, hostMock4).when(tomcatMock).getHost();
            Container[] containerArray4 = new Container[] { contextMock2 };
            doReturn(containerArray4).when(hostMock4).findChildren();
            //Act Statement(s)
            target.start();
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null"), atLeast(1));
                contextBindings.verify(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any()));
                verify(contextMock).addLifecycleListener((LifecycleListener) any());
                verify(contextMock).getNamingToken();
                contextBindings.verify(() -> ContextBindings.unbindClassLoader(eq(contextMock2), eq(object2), (ClassLoader) any()));
                verify(contextMock2).getNamingToken();
                verify(tomcatMock, times(2)).getService();
                verify(serviceMock).findConnectors();
                verify(connectorMock).getPort();
                verify(connectorMock).getScheme();
                verify(tomcatMock).getEngine();
                verify(engineMock).getName();
                verify(engineMock).setName("C-2");
                verify(tomcatMock, times(4)).getHost();
                verify(hostMock).findChildren();
                verify(tomcatMock, times(3)).getServer();
                verify(serverMock).findServices();
                verify(serviceMock2).findConnectors();
                verify(serverMock2).findServices();
                verify(serviceMock3).findConnectors();
                verify(tomcatMock).start();
                verify(hostMock2).findChildren();
                verify(tomcatEmbeddedContextMock).getStarter();
                verify(tomcatStarterMock).getStartUpException();
                verify(tomcatEmbeddedContextMock).getState();
                verify(serverMock3).findServices();
                verify(tomcatMock, times(2)).getConnector();
                verify(hostMock3).findChildren();
                verify(tomcatEmbeddedContextMock2).deferredLoadOnStartup();
                verify(connectorMock4).getState();
                verify(serviceMock5).findConnectors();
                verify(connectorMock5).getState();
                verify(target).getStartedLogMessage();
                verify(hostMock4).findChildren();
            });
        }
    }

    //Sapient generated method id: ${startWhenChildNotInstanceOfContextThrowsIllegalStateException}, hash: F8E40A4DF7A8A324ECE6DF7090927269
    @Disabled()
    @Test()
    void startWhenChildNotInstanceOfContextThrowsIllegalStateException() throws WebServerException, LifecycleException, NamingException {
        /* Branches:
         * (this.started) : false
         * (for-each(services)) : true  #  inside addPreviouslyRemovedConnectors method
         * (connectors != null) : false  #  inside addPreviouslyRemovedConnectors method
         * (connector != null) : true
         * (this.autoStart) : true
         * (for-each(this.tomcat.getHost().findChildren())) : true  #  inside performDeferredLoadOnStartup method
         * (child instanceof TomcatEmbeddedContext embeddedContext) : true  #  inside performDeferredLoadOnStartup method
         * (LifecycleState.FAILED.equals(connector.getState())) : false  #  inside checkConnectorHasStarted method
         * (for-each(this.tomcat.getService().findConnectors())) : true  #  inside checkThatConnectorsHaveStarted method
         * (for-each(this.tomcat.getHost().findChildren())) : true  #  inside findContext method
         * (child instanceof Context context) : false  #  inside findContext method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Container containerMock = mock(Container.class);
        try (MockedStatic<ContextBindings> contextBindings = mockStatic(ContextBindings.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            contextBindings.when(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(contextMock).addLifecycleListener((LifecycleListener) any());
            doReturn(object).when(contextMock).getNamingToken();
            TomcatWebServer target = spy(new TomcatWebServer(tomcatMock, true, Shutdown.GRACEFUL));
            Connector[] connectorArray = new Connector[] { connectorMock, connectorMock2 };
            doReturn(connectorArray).when(serviceMock).findConnectors();
            doReturn(2).when(connectorMock).getPort();
            doReturn("B").when(connectorMock).getScheme();
            doReturn(engineMock).when(tomcatMock).getEngine();
            doReturn("C").when(engineMock).getName();
            doNothing().when(engineMock).setName("C-2");
            Container[] containerArray = new Container[] { contextMock };
            doReturn(containerArray).when(hostMock).findChildren();
            Service[] serviceArray = new Service[] { serviceMock2 };
            doReturn(serviceArray).when(serverMock).findServices();
            Connector[] connectorArray2 = new Connector[] {};
            doReturn(connectorArray2).when(serviceMock2).findConnectors();
            Service[] serviceArray2 = new Service[] { serviceMock3 };
            doReturn(serviceArray2).when(serverMock2).findServices();
            Connector[] connectorArray3 = new Connector[] {};
            doReturn(connectorArray3).when(serviceMock3).findConnectors();
            doNothing().when(tomcatMock).start();
            Container[] containerArray2 = new Container[] { tomcatEmbeddedContextMock };
            doReturn(containerArray2).when(hostMock2).findChildren();
            doReturn(tomcatStarterMock).when(tomcatEmbeddedContextMock).getStarter();
            doReturn(null).when(tomcatStarterMock).getStartUpException();
            doReturn(LifecycleState.STARTED).when(tomcatEmbeddedContextMock).getState();
            doReturn(serverMock, serverMock2, serverMock3).when(tomcatMock).getServer();
            Service[] serviceArray3 = new Service[] { serviceMock4 };
            doReturn(serviceArray3).when(serverMock3).findServices();
            Container[] containerArray3 = new Container[] { tomcatEmbeddedContextMock2 };
            doReturn(containerArray3).when(hostMock3).findChildren();
            doNothing().when(tomcatEmbeddedContextMock2).deferredLoadOnStartup();
            doReturn(connectorMock3, connectorMock4).when(tomcatMock).getConnector();
            doReturn(LifecycleState.DESTROYED).when(connectorMock4).getState();
            doReturn(serviceMock, serviceMock5).when(tomcatMock).getService();
            Connector[] connectorArray4 = new Connector[] { connectorMock5 };
            doReturn(connectorArray4).when(serviceMock5).findConnectors();
            doReturn(LifecycleState.STOPPED).when(connectorMock5).getState();
            doReturn("return_of_getStartedLogMessage1").when(target).getStartedLogMessage();
            doReturn(hostMock, hostMock2, hostMock3, hostMock4).when(tomcatMock).getHost();
            Container[] containerArray4 = new Container[] { containerMock };
            doReturn(containerArray4).when(hostMock4).findChildren();
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.start();
            });
            IllegalStateException illegalStateException = new IllegalStateException("The host does not contain a Context");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                _assert.verify(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null"), atLeast(1));
                contextBindings.verify(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any()));
                verify(contextMock).addLifecycleListener((LifecycleListener) any());
                verify(contextMock).getNamingToken();
                verify(tomcatMock, times(2)).getService();
                verify(serviceMock).findConnectors();
                verify(connectorMock).getPort();
                verify(connectorMock).getScheme();
                verify(tomcatMock).getEngine();
                verify(engineMock).getName();
                verify(engineMock).setName("C-2");
                verify(tomcatMock, times(4)).getHost();
                verify(hostMock).findChildren();
                verify(tomcatMock, times(3)).getServer();
                verify(serverMock).findServices();
                verify(serviceMock2).findConnectors();
                verify(serverMock2).findServices();
                verify(serviceMock3).findConnectors();
                verify(tomcatMock).start();
                verify(hostMock2).findChildren();
                verify(tomcatEmbeddedContextMock).getStarter();
                verify(tomcatStarterMock).getStartUpException();
                verify(tomcatEmbeddedContextMock).getState();
                verify(serverMock3).findServices();
                verify(tomcatMock, times(2)).getConnector();
                verify(hostMock3).findChildren();
                verify(tomcatEmbeddedContextMock2).deferredLoadOnStartup();
                verify(connectorMock4).getState();
                verify(serviceMock5).findConnectors();
                verify(connectorMock5).getState();
                verify(target).getStartedLogMessage();
                verify(hostMock4).findChildren();
            });
        }
    }

    //Sapient generated method id: ${getStartedLogMessageWhenLocalPortAndContextPathIsNull}, hash: 7791E8FD668DD1453AE6C494BE353498
    @Disabled()
    @Test()
    void getStartedLogMessageWhenLocalPortAndContextPathIsNull() throws LifecycleException, NamingException {
        /* Branches:
         * (StringUtils.hasText(contextPath)) : false  #  inside getContextPath method
         * (connectors.length != 1) : true  #  inside getPortsDescription method
         * (i < connectors.length) : true  #  inside getPortsDescription method
         * (i != 0) : false  #  inside getPortsDescription method
         * (localPort) : true  #  inside getPortsDescription method
         * (contextPath != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<ContextBindings> contextBindings = mockStatic(ContextBindings.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            contextBindings.when(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(contextMock).addLifecycleListener((LifecycleListener) any());
            doReturn(object).when(contextMock).getNamingToken();
            TomcatWebServer target = new TomcatWebServer(tomcatMock, false, Shutdown.GRACEFUL);
            Connector[] connectorArray = new Connector[] { connectorMock, connectorMock2 };
            doReturn(connectorArray).when(serviceMock).findConnectors();
            doReturn(2).when(connectorMock).getPort();
            doReturn("C").when(connectorMock).getScheme();
            doReturn(engineMock).when(tomcatMock).getEngine();
            doReturn("D").when(engineMock).getName();
            doNothing().when(engineMock).setName("D-2");
            Container[] containerArray = new Container[] { contextMock };
            doReturn(containerArray).when(hostMock).findChildren();
            Service[] serviceArray = new Service[] { serviceMock2 };
            doReturn(serviceArray).when(serverMock).findServices();
            Connector[] connectorArray2 = new Connector[] {};
            doReturn(connectorArray2).when(serviceMock2).findConnectors();
            doReturn(serverMock, serverMock2).when(tomcatMock).getServer();
            Service[] serviceArray2 = new Service[] { serviceMock3 };
            doReturn(serviceArray2).when(serverMock2).findServices();
            Connector[] connectorArray3 = new Connector[] {};
            doReturn(connectorArray3).when(serviceMock3).findConnectors();
            doNothing().when(tomcatMock).start();
            Container[] containerArray2 = new Container[] { tomcatEmbeddedContextMock };
            doReturn(containerArray2).when(hostMock2).findChildren();
            doReturn(tomcatStarterMock).when(tomcatEmbeddedContextMock).getStarter();
            doReturn(null).when(tomcatStarterMock).getStartUpException();
            doReturn(LifecycleState.STARTED).when(tomcatEmbeddedContextMock).getState();
            doReturn(hostMock, hostMock2, hostMock3).when(tomcatMock).getHost();
            Container[] containerArray3 = new Container[] {};
            doReturn(containerArray3).when(hostMock3).findChildren();
            doReturn(serviceMock, serviceMock4).when(tomcatMock).getService();
            Connector[] connectorArray4 = new Connector[] { connectorMock3, connectorMock4 };
            doReturn(connectorArray4).when(serviceMock4).findConnectors();
            doReturn(2).when(connectorMock3).getLocalPort();
            doReturn("A").when(connectorMock3).getScheme();
            doReturn(2).when(connectorMock4).getLocalPort();
            doReturn("B").when(connectorMock4).getScheme();
            //Act Statement(s)
            String result = target.getStartedLogMessage();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("Tomcat started on ports 2 (A), 2 (B)"));
                _assert.verify(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null"), atLeast(1));
                contextBindings.verify(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any()));
                verify(contextMock).addLifecycleListener((LifecycleListener) any());
                verify(contextMock).getNamingToken();
                verify(tomcatMock, times(2)).getService();
                verify(serviceMock).findConnectors();
                verify(connectorMock).getPort();
                verify(connectorMock).getScheme();
                verify(tomcatMock).getEngine();
                verify(engineMock).getName();
                verify(engineMock).setName("D-2");
                verify(tomcatMock, times(3)).getHost();
                verify(hostMock).findChildren();
                verify(tomcatMock, times(2)).getServer();
                verify(serverMock).findServices();
                verify(serviceMock2).findConnectors();
                verify(serverMock2).findServices();
                verify(serviceMock3).findConnectors();
                verify(tomcatMock).start();
                verify(hostMock2).findChildren();
                verify(tomcatEmbeddedContextMock).getStarter();
                verify(tomcatStarterMock).getStartUpException();
                verify(tomcatEmbeddedContextMock).getState();
                verify(hostMock3).findChildren();
                verify(serviceMock4).findConnectors();
                verify(connectorMock3).getLocalPort();
                verify(connectorMock3).getScheme();
                verify(connectorMock4).getLocalPort();
                verify(connectorMock4).getScheme();
            });
        }
    }

    //Sapient generated method id: ${stopWhenNotWasStarted}, hash: 57CD46991394FC3E7CCDBCAD3EDAB26F
    @Disabled()
    @Test()
    void stopWhenNotWasStarted() throws Exception {
        /* Branches:
         * (this.gracefulShutdown != null) : true
         * (for-each(this.tomcat.getServer().findServices())) : true  #  inside doWithConnectors method
         * (wasStarted) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<ContextBindings> contextBindings = mockStatic(ContextBindings.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            contextBindings.when(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(contextMock).addLifecycleListener((LifecycleListener) any());
            doReturn(object).when(contextMock).getNamingToken();
            TomcatWebServer target = new TomcatWebServer(tomcatMock, false, Shutdown.GRACEFUL);
            doReturn(serviceMock).when(tomcatMock).getService();
            Connector[] connectorArray = new Connector[] { connectorMock, connectorMock2 };
            doReturn(connectorArray).when(serviceMock).findConnectors();
            doReturn(2).when(connectorMock).getPort();
            doReturn("A").when(connectorMock).getScheme();
            doReturn(engineMock).when(tomcatMock).getEngine();
            doReturn("B").when(engineMock).getName();
            doNothing().when(engineMock).setName("B-2");
            Container[] containerArray = new Container[] { contextMock };
            doReturn(containerArray).when(hostMock).findChildren();
            Service[] serviceArray = new Service[] { serviceMock2 };
            doReturn(serviceArray).when(serverMock).findServices();
            Connector[] connectorArray2 = new Connector[] {};
            doReturn(connectorArray2).when(serviceMock2).findConnectors();
            Service[] serviceArray2 = new Service[] { serviceMock3 };
            doReturn(serviceArray2).when(serverMock2).findServices();
            Connector[] connectorArray3 = new Connector[] {};
            doReturn(connectorArray3).when(serviceMock3).findConnectors();
            doNothing().when(tomcatMock).start();
            doReturn(hostMock, hostMock2).when(tomcatMock).getHost();
            Container[] containerArray2 = new Container[] { tomcatEmbeddedContextMock };
            doReturn(containerArray2).when(hostMock2).findChildren();
            doReturn(tomcatStarterMock).when(tomcatEmbeddedContextMock).getStarter();
            doReturn(null).when(tomcatStarterMock).getStartUpException();
            doReturn(LifecycleState.STARTED).when(tomcatEmbeddedContextMock).getState();
            doReturn(serverMock, serverMock2, serverMock3).when(tomcatMock).getServer();
            Service[] serviceArray3 = new Service[] { serviceMock4 };
            doReturn(serviceArray3).when(serverMock3).findServices();
            Connector[] connectorArray4 = new Connector[] {};
            doReturn(connectorArray4).when(serviceMock4).findConnectors();
            //Act Statement(s)
            target.stop();
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null"), atLeast(1));
                contextBindings.verify(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any()));
                verify(contextMock).addLifecycleListener((LifecycleListener) any());
                verify(contextMock).getNamingToken();
                verify(tomcatMock).getService();
                verify(serviceMock).findConnectors();
                verify(connectorMock).getPort();
                verify(connectorMock).getScheme();
                verify(tomcatMock).getEngine();
                verify(engineMock).getName();
                verify(engineMock).setName("B-2");
                verify(tomcatMock, times(2)).getHost();
                verify(hostMock).findChildren();
                verify(tomcatMock, times(3)).getServer();
                verify(serverMock).findServices();
                verify(serviceMock2).findConnectors();
                verify(serverMock2).findServices();
                verify(serviceMock3).findConnectors();
                verify(tomcatMock).start();
                verify(hostMock2).findChildren();
                verify(tomcatEmbeddedContextMock).getStarter();
                verify(tomcatStarterMock).getStartUpException();
                verify(tomcatEmbeddedContextMock).getState();
                verify(serverMock3).findServices();
                verify(serviceMock4).findConnectors();
            });
        }
    }

    //Sapient generated method id: ${stopWhenCaughtExceptionThrowsWebServerException}, hash: 819F00402F6A6C4B271142AB2AF2CC72
    @Disabled()
    @Test()
    void stopWhenCaughtExceptionThrowsWebServerException() throws WebServerException, LifecycleException, NamingException {
        /* Branches:
         * (this.gracefulShutdown != null) : true
         * (for-each(this.tomcat.getServer().findServices())) : false  #  inside doWithConnectors method
         * (catch-exception (Exception)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<ContextBindings> contextBindings = mockStatic(ContextBindings.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            contextBindings.when(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(contextMock).addLifecycleListener((LifecycleListener) any());
            doReturn(object).when(contextMock).getNamingToken();
            TomcatWebServer target = new TomcatWebServer(tomcatMock, false, Shutdown.GRACEFUL);
            doReturn(serviceMock).when(tomcatMock).getService();
            Connector[] connectorArray = new Connector[] { connectorMock, connectorMock2 };
            doReturn(connectorArray).when(serviceMock).findConnectors();
            doReturn(2).when(connectorMock).getPort();
            doReturn("A").when(connectorMock).getScheme();
            doReturn(engineMock).when(tomcatMock).getEngine();
            doReturn("B").when(engineMock).getName();
            doNothing().when(engineMock).setName("B-2");
            Container[] containerArray = new Container[] { contextMock };
            doReturn(containerArray).when(hostMock).findChildren();
            Service[] serviceArray = new Service[] { serviceMock2 };
            doReturn(serviceArray).when(serverMock).findServices();
            Connector[] connectorArray2 = new Connector[] {};
            doReturn(connectorArray2).when(serviceMock2).findConnectors();
            Service[] serviceArray2 = new Service[] { serviceMock3 };
            doReturn(serviceArray2).when(serverMock2).findServices();
            Connector[] connectorArray3 = new Connector[] {};
            doReturn(connectorArray3).when(serviceMock3).findConnectors();
            doNothing().when(tomcatMock).start();
            doReturn(hostMock, hostMock2).when(tomcatMock).getHost();
            Container[] containerArray2 = new Container[] { tomcatEmbeddedContextMock };
            doReturn(containerArray2).when(hostMock2).findChildren();
            doReturn(tomcatStarterMock).when(tomcatEmbeddedContextMock).getStarter();
            doReturn(null).when(tomcatStarterMock).getStartUpException();
            doReturn(LifecycleState.STARTED).when(tomcatEmbeddedContextMock).getState();
            doReturn(serverMock, serverMock2, serverMock3).when(tomcatMock).getServer();
            Service[] serviceArray3 = new Service[] {};
            doReturn(serviceArray3).when(serverMock3).findServices();
            //Act Statement(s)
            final WebServerException result = assertThrows(WebServerException.class, () -> {
                target.stop();
            });
            Exception exception = new Exception();
            WebServerException webServerException = new WebServerException("Unable to stop embedded Tomcat", exception);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(webServerException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(exception.getClass())));
                _assert.verify(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null"), atLeast(1));
                contextBindings.verify(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any()));
                verify(contextMock).addLifecycleListener((LifecycleListener) any());
                verify(contextMock).getNamingToken();
                verify(tomcatMock).getService();
                verify(serviceMock).findConnectors();
                verify(connectorMock).getPort();
                verify(connectorMock).getScheme();
                verify(tomcatMock).getEngine();
                verify(engineMock).getName();
                verify(engineMock).setName("B-2");
                verify(tomcatMock, times(2)).getHost();
                verify(hostMock).findChildren();
                verify(tomcatMock, times(3)).getServer();
                verify(serverMock).findServices();
                verify(serviceMock2).findConnectors();
                verify(serverMock2).findServices();
                verify(serviceMock3).findConnectors();
                verify(tomcatMock).start();
                verify(hostMock2).findChildren();
                verify(tomcatEmbeddedContextMock).getStarter();
                verify(tomcatStarterMock).getStartUpException();
                verify(tomcatEmbeddedContextMock).getState();
                verify(serverMock3).findServices();
            });
        }
    }

    //Sapient generated method id: ${destroyWhenThreadCurrentThreadGetContextClassLoaderNotInstanceOfTomcatEmbeddedWebappClassLoader}, hash: 507EA9BF9504EF3CA0244694EDC1D310
    @Disabled()
    @Test()
    void destroyWhenThreadCurrentThreadGetContextClassLoaderNotInstanceOfTomcatEmbeddedWebappClassLoader() throws Exception {
        /* Branches:
         * (Thread.currentThread().getContextClassLoader() instanceof TomcatEmbeddedWebappClassLoader) : false  #  inside stopTomcat method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<ContextBindings> contextBindings = mockStatic(ContextBindings.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            contextBindings.when(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(contextMock).addLifecycleListener((LifecycleListener) any());
            doReturn(object).when(contextMock).getNamingToken();
            TomcatWebServer target = new TomcatWebServer(tomcatMock, false, Shutdown.GRACEFUL);
            doReturn(serviceMock).when(tomcatMock).getService();
            Connector[] connectorArray = new Connector[] { connectorMock, connectorMock2 };
            doReturn(connectorArray).when(serviceMock).findConnectors();
            doReturn(2).when(connectorMock).getPort();
            doReturn("A").when(connectorMock).getScheme();
            doReturn(engineMock).when(tomcatMock).getEngine();
            doReturn("B").when(engineMock).getName();
            doNothing().when(engineMock).setName("B-2");
            Container[] containerArray = new Container[] { contextMock };
            doReturn(containerArray).when(hostMock).findChildren();
            Service[] serviceArray = new Service[] { serviceMock2 };
            doReturn(serviceArray).when(serverMock).findServices();
            Connector[] connectorArray2 = new Connector[] {};
            doReturn(connectorArray2).when(serviceMock2).findConnectors();
            doReturn(serverMock, serverMock2).when(tomcatMock).getServer();
            Service[] serviceArray2 = new Service[] { serviceMock3 };
            doReturn(serviceArray2).when(serverMock2).findServices();
            Connector[] connectorArray3 = new Connector[] {};
            doReturn(connectorArray3).when(serviceMock3).findConnectors();
            doNothing().when(tomcatMock).start();
            doReturn(hostMock, hostMock2).when(tomcatMock).getHost();
            Container[] containerArray2 = new Container[] { tomcatEmbeddedContextMock };
            doReturn(containerArray2).when(hostMock2).findChildren();
            doReturn(tomcatStarterMock).when(tomcatEmbeddedContextMock).getStarter();
            doReturn(null).when(tomcatStarterMock).getStartUpException();
            doReturn(LifecycleState.STARTED).when(tomcatEmbeddedContextMock).getState();
            doNothing().when(tomcatMock).stop();
            doNothing().when(tomcatMock).destroy();
            //Act Statement(s)
            target.destroy();
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null"), atLeast(1));
                contextBindings.verify(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any()));
                verify(contextMock).addLifecycleListener((LifecycleListener) any());
                verify(contextMock).getNamingToken();
                verify(tomcatMock).getService();
                verify(serviceMock).findConnectors();
                verify(connectorMock).getPort();
                verify(connectorMock).getScheme();
                verify(tomcatMock).getEngine();
                verify(engineMock).getName();
                verify(engineMock).setName("B-2");
                verify(tomcatMock, times(2)).getHost();
                verify(hostMock).findChildren();
                verify(tomcatMock, times(2)).getServer();
                verify(serverMock).findServices();
                verify(serviceMock2).findConnectors();
                verify(serverMock2).findServices();
                verify(serviceMock3).findConnectors();
                verify(tomcatMock).start();
                verify(hostMock2).findChildren();
                verify(tomcatEmbeddedContextMock).getStarter();
                verify(tomcatStarterMock).getStartUpException();
                verify(tomcatEmbeddedContextMock).getState();
                verify(tomcatMock).stop();
                verify(tomcatMock).destroy();
            });
        }
    }

    //Sapient generated method id: ${destroyWhenCaughtLifecycleException}, hash: D6CAB43D5F883D3AD1A82F6A087FA03D
    @Disabled()
    @Test()
    void destroyWhenCaughtLifecycleException() throws Exception {
        /* Branches:
         * (Thread.currentThread().getContextClassLoader() instanceof TomcatEmbeddedWebappClassLoader) : false  #  inside stopTomcat method
         * (catch-exception (LifecycleException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<ContextBindings> contextBindings = mockStatic(ContextBindings.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            contextBindings.when(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(contextMock).addLifecycleListener((LifecycleListener) any());
            doReturn(object).when(contextMock).getNamingToken();
            TomcatWebServer target = new TomcatWebServer(tomcatMock, false, Shutdown.GRACEFUL);
            doReturn(serviceMock).when(tomcatMock).getService();
            Connector[] connectorArray = new Connector[] { connectorMock, connectorMock2 };
            doReturn(connectorArray).when(serviceMock).findConnectors();
            doReturn(2).when(connectorMock).getPort();
            doReturn("A").when(connectorMock).getScheme();
            doReturn(engineMock).when(tomcatMock).getEngine();
            doReturn("B").when(engineMock).getName();
            doNothing().when(engineMock).setName("B-2");
            Container[] containerArray = new Container[] { contextMock };
            doReturn(containerArray).when(hostMock).findChildren();
            Service[] serviceArray = new Service[] { serviceMock2 };
            doReturn(serviceArray).when(serverMock).findServices();
            Connector[] connectorArray2 = new Connector[] {};
            doReturn(connectorArray2).when(serviceMock2).findConnectors();
            doReturn(serverMock, serverMock2).when(tomcatMock).getServer();
            Service[] serviceArray2 = new Service[] { serviceMock3 };
            doReturn(serviceArray2).when(serverMock2).findServices();
            Connector[] connectorArray3 = new Connector[] {};
            doReturn(connectorArray3).when(serviceMock3).findConnectors();
            doNothing().when(tomcatMock).start();
            doReturn(hostMock, hostMock2).when(tomcatMock).getHost();
            Container[] containerArray2 = new Container[] { tomcatEmbeddedContextMock };
            doReturn(containerArray2).when(hostMock2).findChildren();
            doReturn(tomcatStarterMock).when(tomcatEmbeddedContextMock).getStarter();
            doReturn(null).when(tomcatStarterMock).getStartUpException();
            doReturn(LifecycleState.STARTED).when(tomcatEmbeddedContextMock).getState();
            doNothing().when(tomcatMock).stop();
            doNothing().when(tomcatMock).destroy();
            //Act Statement(s)
            target.destroy();
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null"), atLeast(1));
                contextBindings.verify(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any()));
                verify(contextMock).addLifecycleListener((LifecycleListener) any());
                verify(contextMock).getNamingToken();
                verify(tomcatMock).getService();
                verify(serviceMock).findConnectors();
                verify(connectorMock).getPort();
                verify(connectorMock).getScheme();
                verify(tomcatMock).getEngine();
                verify(engineMock).getName();
                verify(engineMock).setName("B-2");
                verify(tomcatMock, times(2)).getHost();
                verify(hostMock).findChildren();
                verify(tomcatMock, times(2)).getServer();
                verify(serverMock).findServices();
                verify(serviceMock2).findConnectors();
                verify(serverMock2).findServices();
                verify(serviceMock3).findConnectors();
                verify(tomcatMock).start();
                verify(hostMock2).findChildren();
                verify(tomcatEmbeddedContextMock).getStarter();
                verify(tomcatStarterMock).getStartUpException();
                verify(tomcatEmbeddedContextMock).getState();
                verify(tomcatMock).stop();
                verify(tomcatMock).destroy();
            });
        }
    }

    //Sapient generated method id: ${destroyWhenCaughtExceptionThrowsWebServerException}, hash: D68280A97D07D3A5560C41D43B86AFB8
    @Disabled()
    @Test()
    void destroyWhenCaughtExceptionThrowsWebServerException() throws WebServerException, LifecycleException, NamingException {
        /* Branches:
         * (Thread.currentThread().getContextClassLoader() instanceof TomcatEmbeddedWebappClassLoader) : false  #  inside stopTomcat method
         * (catch-exception (Exception)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<ContextBindings> contextBindings = mockStatic(ContextBindings.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            contextBindings.when(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(contextMock).addLifecycleListener((LifecycleListener) any());
            doReturn(object).when(contextMock).getNamingToken();
            TomcatWebServer target = new TomcatWebServer(tomcatMock, false, Shutdown.GRACEFUL);
            doReturn(serviceMock).when(tomcatMock).getService();
            Connector[] connectorArray = new Connector[] { connectorMock, connectorMock2 };
            doReturn(connectorArray).when(serviceMock).findConnectors();
            doReturn(2).when(connectorMock).getPort();
            doReturn("A").when(connectorMock).getScheme();
            doReturn(engineMock).when(tomcatMock).getEngine();
            doReturn("B").when(engineMock).getName();
            doNothing().when(engineMock).setName("B-2");
            Container[] containerArray = new Container[] { contextMock };
            doReturn(containerArray).when(hostMock).findChildren();
            Service[] serviceArray = new Service[] { serviceMock2 };
            doReturn(serviceArray).when(serverMock).findServices();
            Connector[] connectorArray2 = new Connector[] {};
            doReturn(connectorArray2).when(serviceMock2).findConnectors();
            doReturn(serverMock, serverMock2).when(tomcatMock).getServer();
            Service[] serviceArray2 = new Service[] { serviceMock3 };
            doReturn(serviceArray2).when(serverMock2).findServices();
            Connector[] connectorArray3 = new Connector[] {};
            doReturn(connectorArray3).when(serviceMock3).findConnectors();
            doNothing().when(tomcatMock).start();
            doReturn(hostMock, hostMock2).when(tomcatMock).getHost();
            Container[] containerArray2 = new Container[] { tomcatEmbeddedContextMock };
            doReturn(containerArray2).when(hostMock2).findChildren();
            doReturn(tomcatStarterMock).when(tomcatEmbeddedContextMock).getStarter();
            doReturn(null).when(tomcatStarterMock).getStartUpException();
            doReturn(LifecycleState.STARTED).when(tomcatEmbeddedContextMock).getState();
            doNothing().when(tomcatMock).stop();
            doNothing().when(tomcatMock).destroy();
            //Act Statement(s)
            final WebServerException result = assertThrows(WebServerException.class, () -> {
                target.destroy();
            });
            Exception exception = new Exception();
            WebServerException webServerException = new WebServerException("Unable to destroy embedded Tomcat", exception);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(webServerException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(exception.getClass())));
                _assert.verify(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null"), atLeast(1));
                contextBindings.verify(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any()));
                verify(contextMock).addLifecycleListener((LifecycleListener) any());
                verify(contextMock).getNamingToken();
                verify(tomcatMock).getService();
                verify(serviceMock).findConnectors();
                verify(connectorMock).getPort();
                verify(connectorMock).getScheme();
                verify(tomcatMock).getEngine();
                verify(engineMock).getName();
                verify(engineMock).setName("B-2");
                verify(tomcatMock, times(2)).getHost();
                verify(hostMock).findChildren();
                verify(tomcatMock, times(2)).getServer();
                verify(serverMock).findServices();
                verify(serviceMock2).findConnectors();
                verify(serverMock2).findServices();
                verify(serviceMock3).findConnectors();
                verify(tomcatMock).start();
                verify(hostMock2).findChildren();
                verify(tomcatEmbeddedContextMock).getStarter();
                verify(tomcatStarterMock).getStartUpException();
                verify(tomcatEmbeddedContextMock).getState();
                verify(tomcatMock).stop();
                verify(tomcatMock).destroy();
            });
        }
    }

    //Sapient generated method id: ${getPortWhenConnectorIsNotNull}, hash: 3201C517DDC438095554D84DFB411B43
    @Disabled()
    @Test()
    void getPortWhenConnectorIsNotNull() throws LifecycleException, NamingException {
        /* Branches:
         * (connector != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<ContextBindings> contextBindings = mockStatic(ContextBindings.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            contextBindings.when(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(contextMock).addLifecycleListener((LifecycleListener) any());
            doReturn(object).when(contextMock).getNamingToken();
            TomcatWebServer target = new TomcatWebServer(tomcatMock, false, Shutdown.GRACEFUL);
            doReturn(serviceMock).when(tomcatMock).getService();
            Connector[] connectorArray = new Connector[] { connectorMock, connectorMock2 };
            doReturn(connectorArray).when(serviceMock).findConnectors();
            doReturn(2).when(connectorMock).getPort();
            doReturn("A").when(connectorMock).getScheme();
            doReturn(engineMock).when(tomcatMock).getEngine();
            doReturn("B").when(engineMock).getName();
            doNothing().when(engineMock).setName("B-2");
            Container[] containerArray = new Container[] { contextMock };
            doReturn(containerArray).when(hostMock).findChildren();
            Service[] serviceArray = new Service[] { serviceMock2 };
            doReturn(serviceArray).when(serverMock).findServices();
            Connector[] connectorArray2 = new Connector[] {};
            doReturn(connectorArray2).when(serviceMock2).findConnectors();
            doReturn(serverMock, serverMock2).when(tomcatMock).getServer();
            Service[] serviceArray2 = new Service[] { serviceMock3 };
            doReturn(serviceArray2).when(serverMock2).findServices();
            Connector[] connectorArray3 = new Connector[] {};
            doReturn(connectorArray3).when(serviceMock3).findConnectors();
            doNothing().when(tomcatMock).start();
            doReturn(hostMock, hostMock2).when(tomcatMock).getHost();
            Container[] containerArray2 = new Container[] { tomcatEmbeddedContextMock };
            doReturn(containerArray2).when(hostMock2).findChildren();
            doReturn(tomcatStarterMock).when(tomcatEmbeddedContextMock).getStarter();
            doReturn(null).when(tomcatStarterMock).getStartUpException();
            doReturn(LifecycleState.STARTED).when(tomcatEmbeddedContextMock).getState();
            doReturn(connectorMock3).when(tomcatMock).getConnector();
            doReturn(0).when(connectorMock3).getLocalPort();
            //Act Statement(s)
            int result = target.getPort();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                _assert.verify(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null"), atLeast(1));
                contextBindings.verify(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any()));
                verify(contextMock).addLifecycleListener((LifecycleListener) any());
                verify(contextMock).getNamingToken();
                verify(tomcatMock).getService();
                verify(serviceMock).findConnectors();
                verify(connectorMock).getPort();
                verify(connectorMock).getScheme();
                verify(tomcatMock).getEngine();
                verify(engineMock).getName();
                verify(engineMock).setName("B-2");
                verify(tomcatMock, times(2)).getHost();
                verify(hostMock).findChildren();
                verify(tomcatMock, times(2)).getServer();
                verify(serverMock).findServices();
                verify(serviceMock2).findConnectors();
                verify(serverMock2).findServices();
                verify(serviceMock3).findConnectors();
                verify(tomcatMock).start();
                verify(hostMock2).findChildren();
                verify(tomcatEmbeddedContextMock).getStarter();
                verify(tomcatStarterMock).getStartUpException();
                verify(tomcatEmbeddedContextMock).getState();
                verify(tomcatMock).getConnector();
                verify(connectorMock3).getLocalPort();
            });
        }
    }

    //Sapient generated method id: ${getPortWhenConnectorIsNull}, hash: B679E50B9B279FBD97E5E052ED940CDF
    @Disabled()
    @Test()
    void getPortWhenConnectorIsNull() throws LifecycleException, NamingException {
        /* Branches:
         * (connector != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<ContextBindings> contextBindings = mockStatic(ContextBindings.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            contextBindings.when(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(contextMock).addLifecycleListener((LifecycleListener) any());
            doReturn(object).when(contextMock).getNamingToken();
            TomcatWebServer target = new TomcatWebServer(tomcatMock, false, Shutdown.GRACEFUL);
            doReturn(serviceMock).when(tomcatMock).getService();
            Connector[] connectorArray = new Connector[] { connectorMock, connectorMock2 };
            doReturn(connectorArray).when(serviceMock).findConnectors();
            doReturn(2).when(connectorMock).getPort();
            doReturn("A").when(connectorMock).getScheme();
            doReturn(engineMock).when(tomcatMock).getEngine();
            doReturn("B").when(engineMock).getName();
            doNothing().when(engineMock).setName("B-2");
            Container[] containerArray = new Container[] { contextMock };
            doReturn(containerArray).when(hostMock).findChildren();
            Service[] serviceArray = new Service[] { serviceMock2 };
            doReturn(serviceArray).when(serverMock).findServices();
            Connector[] connectorArray2 = new Connector[] {};
            doReturn(connectorArray2).when(serviceMock2).findConnectors();
            doReturn(serverMock, serverMock2).when(tomcatMock).getServer();
            Service[] serviceArray2 = new Service[] { serviceMock3 };
            doReturn(serviceArray2).when(serverMock2).findServices();
            Connector[] connectorArray3 = new Connector[] {};
            doReturn(connectorArray3).when(serviceMock3).findConnectors();
            doNothing().when(tomcatMock).start();
            doReturn(hostMock, hostMock2).when(tomcatMock).getHost();
            Container[] containerArray2 = new Container[] { tomcatEmbeddedContextMock };
            doReturn(containerArray2).when(hostMock2).findChildren();
            doReturn(tomcatStarterMock).when(tomcatEmbeddedContextMock).getStarter();
            doReturn(null).when(tomcatStarterMock).getStartUpException();
            doReturn(LifecycleState.STARTED).when(tomcatEmbeddedContextMock).getState();
            doReturn(null).when(tomcatMock).getConnector();
            //Act Statement(s)
            int result = target.getPort();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                _assert.verify(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null"), atLeast(1));
                contextBindings.verify(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any()));
                verify(contextMock).addLifecycleListener((LifecycleListener) any());
                verify(contextMock).getNamingToken();
                verify(tomcatMock).getService();
                verify(serviceMock).findConnectors();
                verify(connectorMock).getPort();
                verify(connectorMock).getScheme();
                verify(tomcatMock).getEngine();
                verify(engineMock).getName();
                verify(engineMock).setName("B-2");
                verify(tomcatMock, times(2)).getHost();
                verify(hostMock).findChildren();
                verify(tomcatMock, times(2)).getServer();
                verify(serverMock).findServices();
                verify(serviceMock2).findConnectors();
                verify(serverMock2).findServices();
                verify(serviceMock3).findConnectors();
                verify(tomcatMock).start();
                verify(hostMock2).findChildren();
                verify(tomcatEmbeddedContextMock).getStarter();
                verify(tomcatStarterMock).getStartUpException();
                verify(tomcatEmbeddedContextMock).getState();
                verify(tomcatMock).getConnector();
            });
        }
    }

    //Sapient generated method id: ${shutDownGracefullyWhenThisGracefulShutdownIsNotNull}, hash: 37426F18C91DEB09036D67F790A5439E
    @Disabled()
    @Test()
    void shutDownGracefullyWhenThisGracefulShutdownIsNotNull() throws LifecycleException, NamingException {
        /* Branches:
         * (this.gracefulShutdown == null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        GracefulShutdownCallback gracefulShutdownCallbackMock = mock(GracefulShutdownCallback.class);
        try (MockedStatic<ContextBindings> contextBindings = mockStatic(ContextBindings.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            contextBindings.when(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(contextMock).addLifecycleListener((LifecycleListener) any());
            doReturn(object).when(contextMock).getNamingToken();
            TomcatWebServer target = new TomcatWebServer(tomcatMock, false, Shutdown.GRACEFUL);
            doReturn(serviceMock).when(tomcatMock).getService();
            Connector[] connectorArray = new Connector[] { connectorMock, connectorMock2 };
            doReturn(connectorArray).when(serviceMock).findConnectors();
            doReturn(2).when(connectorMock).getPort();
            doReturn("A").when(connectorMock).getScheme();
            doReturn(engineMock).when(tomcatMock).getEngine();
            doReturn("B").when(engineMock).getName();
            doNothing().when(engineMock).setName("B-2");
            Container[] containerArray = new Container[] { contextMock };
            doReturn(containerArray).when(hostMock).findChildren();
            Service[] serviceArray = new Service[] { serviceMock2 };
            doReturn(serviceArray).when(serverMock).findServices();
            Connector[] connectorArray2 = new Connector[] {};
            doReturn(connectorArray2).when(serviceMock2).findConnectors();
            doReturn(serverMock, serverMock2).when(tomcatMock).getServer();
            Service[] serviceArray2 = new Service[] { serviceMock3 };
            doReturn(serviceArray2).when(serverMock2).findServices();
            Connector[] connectorArray3 = new Connector[] {};
            doReturn(connectorArray3).when(serviceMock3).findConnectors();
            doNothing().when(tomcatMock).start();
            doReturn(hostMock, hostMock2).when(tomcatMock).getHost();
            Container[] containerArray2 = new Container[] { tomcatEmbeddedContextMock };
            doReturn(containerArray2).when(hostMock2).findChildren();
            doReturn(tomcatStarterMock).when(tomcatEmbeddedContextMock).getStarter();
            doReturn(null).when(tomcatStarterMock).getStartUpException();
            doReturn(LifecycleState.STARTED).when(tomcatEmbeddedContextMock).getState();
            //Act Statement(s)
            target.shutDownGracefully(gracefulShutdownCallbackMock);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null"), atLeast(1));
                contextBindings.verify(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any()));
                verify(contextMock).addLifecycleListener((LifecycleListener) any());
                verify(contextMock).getNamingToken();
                verify(tomcatMock).getService();
                verify(serviceMock).findConnectors();
                verify(connectorMock).getPort();
                verify(connectorMock).getScheme();
                verify(tomcatMock).getEngine();
                verify(engineMock).getName();
                verify(engineMock).setName("B-2");
                verify(tomcatMock, times(2)).getHost();
                verify(hostMock).findChildren();
                verify(tomcatMock, times(2)).getServer();
                verify(serverMock).findServices();
                verify(serviceMock2).findConnectors();
                verify(serverMock2).findServices();
                verify(serviceMock3).findConnectors();
                verify(tomcatMock).start();
                verify(hostMock2).findChildren();
                verify(tomcatEmbeddedContextMock).getStarter();
                verify(tomcatStarterMock).getStartUpException();
                verify(tomcatEmbeddedContextMock).getState();
            });
        }
    }
}
