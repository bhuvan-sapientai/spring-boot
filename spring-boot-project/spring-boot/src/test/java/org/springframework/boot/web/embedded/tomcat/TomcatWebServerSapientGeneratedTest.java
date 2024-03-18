package org.springframework.boot.web.embedded.tomcat;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import org.springframework.boot.web.server.WebServerException;

import org.apache.catalina.LifecycleException;

import javax.naming.NamingException;

import org.apache.catalina.Host;
import org.apache.catalina.LifecycleListener;

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

import org.springframework.boot.web.server.GracefulShutdownResult;

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

	private final Container containerMock = mock(Container.class);

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

	private final Tomcat tomcatMock = mock(Tomcat.class);

	private final Tomcat tomcatMock2 = mock(Tomcat.class);

	private final TomcatStarter tomcatStarterMock = mock(TomcatStarter.class);

	//Sapient generated method id: ${6ce71ce8-ed1d-3565-bbbe-1c9fc63aaa44}, hash: 328D8925878D090339465AA9D351430A
	@Disabled(value = "Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
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

	//Sapient generated method id: ${2a926680-5a33-384b-93e6-05e8609c11bb}, hash: F2EE17E577D116A4E83B264E40880130
	@Test()
	void startWhenThisTomcatGetServiceFindConnectorsIsNotEmptyAndCaughtExceptionThrowsWebServerException() throws WebServerException, LifecycleException {
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
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<PortInUseException> portInUseException = mockStatic(PortInUseException.class)) {
			Exception exception = new Exception();
			portInUseException.when(() -> PortInUseException.throwIfPortBindingException(eq(exception), (IntSupplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			Tomcat tomcat = new Tomcat();
			TomcatWebServer target = spy(new TomcatWebServer(tomcat, false, Shutdown.GRACEFUL));
			doReturn(serverMock).when(tomcatMock).getServer();
			Service[] serviceArray = new Service[] { serviceMock };
			doReturn(serviceArray).when(serverMock).findServices();
			doReturn(connectorMock).when(tomcatMock2).getConnector();
			doReturn(connectorMock2).when(tomcatMock).getConnector();
			doReturn(LifecycleState.DESTROYED).when(connectorMock2).getState();
			doReturn(serviceMock2).when(tomcatMock2).getService();
			Connector connector = new Connector();
			Connector[] connectorArray = new Connector[] { connector };
			doReturn(connectorArray).when(serviceMock2).findConnectors();
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
				portInUseException.verify(() -> PortInUseException.throwIfPortBindingException(eq(exception), (IntSupplier) any()));
				verify(tomcatMock).getServer();
				verify(serverMock).findServices();
				verify(tomcatMock2).getConnector();
				verify(tomcatMock).getConnector();
				verify(connectorMock2).getState();
				verify(tomcatMock2).getService();
				verify(serviceMock2).findConnectors();
				verify(target).getStartedLogMessage();
			});
		}
	}

	//Sapient generated method id: ${dd22e4a6-0543-3aab-bf9f-1b7fa471bea5}, hash: CB2F7EE1BFFBB4BC02A2F017EA4990B2
	@Disabled(value = "Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
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
		Connector connectorMock5 = mock(Connector.class);
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
			doReturn("H").when(engineMock).getName();
			doNothing().when(engineMock).setName("H-2");
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
			doReturn(LifecycleState.INITIALIZING).when(connectorMock4).getState();
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
				verify(engineMock).setName("H-2");
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

	//Sapient generated method id: ${4e85c2b1-1a4a-392d-93e8-a08449966bb6}, hash: ABC227AC73B6A0458DCBA105D07B675C
	@Disabled(value = "Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
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
			doReturn(2).when(connectorMock2).getPort();
			doReturn("C").when(connectorMock2).getScheme();
			doReturn(engineMock).when(tomcatMock).getEngine();
			doReturn("H").when(engineMock).getName();
			doNothing().when(engineMock).setName("H-4");
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
			doReturn(LifecycleState.INITIALIZING).when(connectorMock4).getState();
			doReturn(serviceMock, serviceMock5).when(tomcatMock).getService();
			Connector connector = new Connector();
			Connector[] connectorArray4 = new Connector[] { connector };
			doReturn(connectorArray4).when(serviceMock5).findConnectors();
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
				verify(connectorMock2).getPort();
				verify(connectorMock2).getScheme();
				verify(tomcatMock).getEngine();
				verify(engineMock).getName();
				verify(engineMock).setName("H-4");
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
				verify(target).getStartedLogMessage();
				verify(hostMock4).findChildren();
			});
		}
	}

	//Sapient generated method id: ${77dab7d8-9bbd-31ad-a6f1-d92d56b9a09c}, hash: 0A22DB82377108750AB57C2A6AE96D2A
	@Disabled(value = "Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
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
			doReturn(2).when(connectorMock2).getPort();
			doReturn("C").when(connectorMock2).getScheme();
			doReturn(engineMock).when(tomcatMock).getEngine();
			doReturn("H").when(engineMock).getName();
			doNothing().when(engineMock).setName("H-4");
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
			doReturn(LifecycleState.INITIALIZING).when(connectorMock4).getState();
			doReturn(serviceMock, serviceMock5).when(tomcatMock).getService();
			Connector connector = new Connector();
			Connector[] connectorArray4 = new Connector[] { connector };
			doReturn(connectorArray4).when(serviceMock5).findConnectors();
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
				verify(connectorMock2).getPort();
				verify(connectorMock2).getScheme();
				verify(tomcatMock).getEngine();
				verify(engineMock).getName();
				verify(engineMock).setName("H-4");
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
				verify(target).getStartedLogMessage();
				verify(hostMock4).findChildren();
			});
		}
	}

	//Sapient generated method id: ${f07eb671-88a1-30da-b6e2-4266f9fef9a1}, hash: 98D8DC5BEEA56ACC66B6224FFDC26259
	@Test()
	void getStartedLogMessageWhenLocalPortAndContextPathIsNull() throws LifecycleException {
		/* Branches:
		 * (StringUtils.hasText(contextPath)) : false  #  inside getContextPath method
		 * (connectors.length != 1) : true  #  inside getPortsDescription method
		 * (i < connectors.length) : true  #  inside getPortsDescription method
		 * (i != 0) : false  #  inside getPortsDescription method
		 * (localPort) : true  #  inside getPortsDescription method
		 * (contextPath != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Tomcat tomcat = new Tomcat();
		TomcatWebServer target = new TomcatWebServer(tomcat, false, Shutdown.GRACEFUL);
		doReturn(hostMock).when(tomcatMock).getHost();
		Container[] containerArray = new Container[] { containerMock };
		doReturn(containerArray).when(hostMock).findChildren();
		doReturn(serviceMock).when(tomcatMock2).getService();
		Connector[] connectorArray = new Connector[] { connectorMock, connectorMock2 };
		doReturn(connectorArray).when(serviceMock).findConnectors();
		doReturn(2).when(connectorMock).getLocalPort();
		doReturn("A").when(connectorMock).getScheme();
		doReturn(2).when(connectorMock2).getLocalPort();
		doReturn("B").when(connectorMock2).getScheme();

		//Act Statement(s)
		String result = target.getStartedLogMessage();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("Tomcat started on ports 2 (A), 2 (B)"));
			verify(tomcatMock).getHost();
			verify(hostMock).findChildren();
			verify(tomcatMock2).getService();
			verify(serviceMock).findConnectors();
			verify(connectorMock).getLocalPort();
			verify(connectorMock).getScheme();
			verify(connectorMock2).getLocalPort();
			verify(connectorMock2).getScheme();
		});
	}

	//Sapient generated method id: ${3ec8067a-c803-3247-8b95-21ac0cdf9296}, hash: BC194B57E4F004966DAEBF757B58A439
	@Disabled(value = "Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void stopWhenNotWasStarted() throws Exception {
		/* Branches:
		 * (this.gracefulShutdown != null) : true
		 * (for-each(this.tomcat.getServer().findServices())) : true  #  inside doWithConnectors method
		 * (wasStarted) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: gracefulShutdown
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doNothing().when(engineMock).setName("B-4");
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
				verify(engineMock).setName("B-4");
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

	//Sapient generated method id: ${7c6465c7-f95f-3515-8e00-5a07af39b1cf}, hash: 0F2951FBFB2A816149292652E3F986C3
	@Test()
	void stopWhenCaughtExceptionThrowsWebServerException() throws WebServerException, LifecycleException {
		/* Branches:
		 * (this.gracefulShutdown != null) : true
		 * (for-each(this.tomcat.getServer().findServices())) : false  #  inside doWithConnectors method
		 * (catch-exception (Exception)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Tomcat tomcat = new Tomcat();
		TomcatWebServer target = new TomcatWebServer(tomcat, true, Shutdown.GRACEFUL);
		doReturn(serverMock).when(tomcatMock).getServer();
		Service[] serviceArray = new Service[] {};
		doReturn(serviceArray).when(serverMock).findServices();
		Exception exception = new Exception();
		WebServerException webServerException = new WebServerException("Unable to stop embedded Tomcat", exception);
		//Act Statement(s)
		final WebServerException result = assertThrows(WebServerException.class, () -> {
			target.stop();
		});

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getMessage(), equalTo(webServerException.getMessage()));
			assertThat(result.getCause(), is(instanceOf(exception.getClass())));
			verify(tomcatMock).getServer();
			verify(serverMock).findServices();
		});
	}

	//Sapient generated method id: ${534dce3f-7c80-3c70-91d9-adde758ba215}, hash: 585394586FB738459043FA36B3329E90
	@Test()
	void destroyWhenThreadCurrentThreadGetContextClassLoaderNotInstanceOfTomcatEmbeddedWebappClassLoader() throws Exception {
		/* Branches:
		 * (Thread.currentThread().getContextClassLoader() instanceof TomcatEmbeddedWebappClassLoader) : false  #  inside stopTomcat method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Tomcat tomcat = new Tomcat();
		TomcatWebServer target = new TomcatWebServer(tomcat, true, Shutdown.GRACEFUL);
		doNothing().when(tomcatMock).stop();
		doNothing().when(tomcatMock2).destroy();

		//Act Statement(s)
		target.destroy();

		//Assert statement(s)
		assertAll("result", () -> {
			verify(tomcatMock).stop();
			verify(tomcatMock2).destroy();
		});
	}

	//Sapient generated method id: ${1c7909e8-e5f8-32af-ae70-86d5e3a5f3b0}, hash: 95F8D8C8D2F78BF9A5E0A4B6E4DACA6F
	@Test()
	void destroyWhenCaughtLifecycleException() throws Exception {
		/* Branches:
		 * (Thread.currentThread().getContextClassLoader() instanceof TomcatEmbeddedWebappClassLoader) : false  #  inside stopTomcat method
		 * (catch-exception (LifecycleException)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Tomcat tomcat = new Tomcat();
		TomcatWebServer target = new TomcatWebServer(tomcat, true, Shutdown.GRACEFUL);
		doNothing().when(tomcatMock).stop();
		doNothing().when(tomcatMock2).destroy();

		//Act Statement(s)
		target.destroy();

		//Assert statement(s)
		assertAll("result", () -> {
			verify(tomcatMock).stop();
			verify(tomcatMock2).destroy();
		});
	}

	//Sapient generated method id: ${f6d1c4f8-d979-3198-acbc-9f01370a4805}, hash: 283DBC454ABB7ED23E4BBE3B2601B6DA
	@Test()
	void destroyWhenCaughtExceptionThrowsWebServerException() throws WebServerException, LifecycleException {
		/* Branches:
		 * (Thread.currentThread().getContextClassLoader() instanceof TomcatEmbeddedWebappClassLoader) : false  #  inside stopTomcat method
		 * (catch-exception (Exception)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Tomcat tomcat = new Tomcat();
		TomcatWebServer target = new TomcatWebServer(tomcat, true, Shutdown.GRACEFUL);
		doNothing().when(tomcatMock).stop();
		doNothing().when(tomcatMock2).destroy();
		Exception exception = new Exception();
		WebServerException webServerException = new WebServerException("Unable to destroy embedded Tomcat", exception);
		//Act Statement(s)
		final WebServerException result = assertThrows(WebServerException.class, () -> {
			target.destroy();
		});

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getMessage(), equalTo(webServerException.getMessage()));
			assertThat(result.getCause(), is(instanceOf(exception.getClass())));
			verify(tomcatMock).stop();
			verify(tomcatMock2).destroy();
		});
	}

	//Sapient generated method id: ${8fd7472d-38f6-3a76-8eab-cacec2274e36}, hash: 6D2D37D9A4DD9A9EBFE90EFCEF7F1A49
	@Test()
	void getPortWhenConnectorIsNotNull() throws LifecycleException {
		/* Branches:
		 * (connector != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Tomcat tomcat = new Tomcat();
		TomcatWebServer target = new TomcatWebServer(tomcat, true, Shutdown.GRACEFUL);
		doReturn(connectorMock).when(tomcatMock).getConnector();
		doReturn(0).when(connectorMock).getLocalPort();

		//Act Statement(s)
		int result = target.getPort();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(0));
			verify(tomcatMock).getConnector();
			verify(connectorMock).getLocalPort();
		});
	}

	//Sapient generated method id: ${d0333bfe-140b-3a95-96a4-614f95f451ca}, hash: F61E7C52A9727C436320504AB0C09A5D
	@Test()
	void getPortWhenConnectorIsNull() throws LifecycleException {
		/* Branches:
		 * (connector != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Tomcat tomcat = new Tomcat();
		TomcatWebServer target = new TomcatWebServer(tomcat, true, Shutdown.GRACEFUL);
		doReturn(null).when(tomcatMock).getConnector();

		//Act Statement(s)
		int result = target.getPort();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(-1));
			verify(tomcatMock).getConnector();
		});
	}

	//Sapient generated method id: ${57d12bb9-c0cb-3775-bb8f-a1541c0d5bab}, hash: 5D2745812DF323C9AFB153234EF01C59
	@Test()
	void shutDownGracefullyWhenThisGracefulShutdownIsNull() throws LifecycleException {
		/* Branches:
		 * (this.gracefulShutdown == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		GracefulShutdownCallback callbackMock = mock(GracefulShutdownCallback.class, "callback_value");
		doNothing().when(callbackMock).shutdownComplete(GracefulShutdownResult.IMMEDIATE);
		Tomcat tomcat = new Tomcat();
		TomcatWebServer target = new TomcatWebServer(tomcat, true, Shutdown.GRACEFUL);

		//Act Statement(s)
		target.shutDownGracefully(callbackMock);

		//Assert statement(s)
		assertAll("result", () -> verify(callbackMock).shutdownComplete(GracefulShutdownResult.IMMEDIATE));
	}

	//Sapient generated method id: ${13fd2f5c-530b-37a2-a9c9-4f453a233bea}, hash: FF4AD8ADAAF6474274680EBE55ECCFFE
	@Disabled(value = "Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void shutDownGracefullyWhenThisGracefulShutdownIsNotNull() throws LifecycleException, NamingException {
		/* Branches:
		 * (this.gracefulShutdown == null) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: gracefulShutdown
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
