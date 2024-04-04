package org.springframework.boot.web.embedded.tomcat;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import org.springframework.boot.web.server.WebServerException;

import org.apache.catalina.LifecycleException;

import javax.naming.NamingException;

import org.apache.catalina.Host;

import org.springframework.util.StringUtils;

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

import org.apache.catalina.connector.Connector;
import org.apache.catalina.Service;

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
import static org.mockito.Mockito.atLeast;
import static org.junit.jupiter.api.Assertions.assertAll;
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

	private final Context contextMock2 = mock(Context.class);

	private final Engine engineMock = mock(Engine.class);

	private final Host hostMock = mock(Host.class);

	private final Host hostMock2 = mock(Host.class);

	private final Host hostMock3 = mock(Host.class);

	private final Host hostMock4 = mock(Host.class);

	private final Server serverMock = mock(Server.class, "Server");

	private final Server serverMock2 = mock(Server.class);

	private final Server serverMock3 = mock(Server.class);

	private final Service service2Mock = mock(Service.class);

	private final Service serviceMock = mock(Service.class);

	private final Service serviceMock2 = mock(Service.class);

	private final Service serviceMock3 = mock(Service.class);

	private final Service serviceMock4 = mock(Service.class);

	private final Service serviceMock5 = mock(Service.class, "Service");

	private final TomcatEmbeddedContext tomcatEmbeddedContextMock = mock(TomcatEmbeddedContext.class);

	private final TomcatEmbeddedContext tomcatEmbeddedContextMock2 = mock(TomcatEmbeddedContext.class);

	private final TomcatStarter tomcatStarterMock = mock(TomcatStarter.class);

	//Sapient generated method id: ${6ce71ce8-ed1d-3565-bbbe-1c9fc63aaa44}, hash: 22C1B6217D329CC4D61AEF8E34D777CF
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
		Server serverMock = mock(Server.class);
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

	//Sapient generated method id: ${2a926680-5a33-384b-93e6-05e8609c11bb}, hash: 3194C03BB095CA6651776A85F641572F
	@Disabled(value = "Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
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
		Host hostMock2 = mock(Host.class, "Host");
		Connector connectorMock2 = mock(Connector.class, "Connector");
		Service serviceMock = mock(Service.class, "Service");
		try (MockedStatic<PortInUseException> portInUseException = mockStatic(PortInUseException.class);
			 MockedStatic<ContextBindings> contextBindings = mockStatic(ContextBindings.class)) {
			Object object = new Object();
			contextBindings.when(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any())).thenAnswer((Answer<Void>) invocation -> null);
			doNothing().when(contextMock).addLifecycleListener((LifecycleListener) any());
			doReturn(object).when(contextMock).getNamingToken();
			Exception exception = new Exception();
			portInUseException.when(() -> PortInUseException.throwIfPortBindingException(eq(exception), (IntSupplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			TomcatWebServer target = spy(new TomcatWebServer(tomcatMock, true, Shutdown.GRACEFUL));
			Service service = tomcatMock.getService();
			Engine engine = tomcatMock.getEngine();
			doReturn(engine).when(tomcatMock).getEngine();
			Host host = tomcatMock.getHost();
			Server server = tomcatMock.getServer();
			Server server2 = tomcatMock.getServer();
			doNothing().when(tomcatMock).start();
			Container[] containerArray = new Container[] { tomcatEmbeddedContextMock };
			doReturn(containerArray).when(hostMock).findChildren();
			doReturn(tomcatStarterMock).when(tomcatEmbeddedContextMock).getStarter();
			doReturn(null).when(tomcatStarterMock).getStartUpException();
			doReturn(LifecycleState.STARTED).when(tomcatEmbeddedContextMock).getState();
			doReturn(server, server2, serverMock).when(tomcatMock).getServer();
			Service[] serviceArray = new Service[] { service2Mock };
			doReturn(serviceArray).when(serverMock).findServices();
			doReturn(host, hostMock, hostMock2).when(tomcatMock).getHost();
			Container[] containerArray2 = new Container[] { tomcatEmbeddedContextMock2 };
			doReturn(containerArray2).when(hostMock2).findChildren();
			doReturn(connectorMock, connectorMock2).when(tomcatMock).getConnector();
			doReturn(null).when(connectorMock2).getState();
			doReturn(service, serviceMock).when(tomcatMock).getService();
			Connector connector = new Connector();
			Connector[] connectorArray = new Connector[] { connector };
			doReturn(connectorArray).when(serviceMock).findConnectors();
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
				contextBindings.verify(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any()));
				verify(contextMock).addLifecycleListener((LifecycleListener) any());
				verify(contextMock).getNamingToken();
				portInUseException.verify(() -> PortInUseException.throwIfPortBindingException(eq(exception), (IntSupplier) any()));
				verify(tomcatMock, times(2)).getService();
				verify(tomcatMock).getEngine();
				verify(tomcatMock, times(3)).getHost();
				verify(tomcatMock, times(3)).getServer();
				verify(tomcatMock).start();
				verify(hostMock).findChildren();
				verify(tomcatEmbeddedContextMock).getStarter();
				verify(tomcatStarterMock).getStartUpException();
				verify(tomcatEmbeddedContextMock).getState();
				verify(serverMock).findServices();
				verify(tomcatMock, times(2)).getConnector();
				verify(hostMock2).findChildren();
				verify(connectorMock2).getState();
				verify(serviceMock).findConnectors();
				verify(target).getStartedLogMessage();
			});
		}
	}

	//Sapient generated method id: ${dd22e4a6-0543-3aab-bf9f-1b7fa471bea5}, hash: EC80709A696EBE8CA0B5E4E2D5B07F36
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
		Server serverMock = mock(Server.class);
		Service serviceMock5 = mock(Service.class);
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

	//Sapient generated method id: ${4e85c2b1-1a4a-392d-93e8-a08449966bb6}, hash: 9A68C3883E0072F3AC97BA6400D9ED02
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
		Host hostMock = mock(Host.class, "Host");
		Context contextMock3 = mock(Context.class);
		Server serverMock = mock(Server.class);
		Server serverMock3 = mock(Server.class, "Server");
		Connector connectorMock4 = mock(Connector.class, "Connector");
		try (MockedStatic<ContextBindings> contextBindings = mockStatic(ContextBindings.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			contextBindings.when(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any())).thenAnswer((Answer<Void>) invocation -> null);
			Object object2 = new Object();
			contextBindings.when(() -> ContextBindings.unbindClassLoader(eq(contextMock2), eq(object2), (ClassLoader) any())).thenAnswer((Answer<Void>) invocation -> null);
			doReturn(object2).when(contextMock2).getNamingToken();
			TomcatWebServer target = spy(new TomcatWebServer(tomcatMock, true, Shutdown.GRACEFUL));
			Connector[] connectorArray = new Connector[] { connectorMock, connectorMock2 };
			doReturn(connectorArray).when(serviceMock).findConnectors();
			doReturn(2).when(connectorMock).getPort();
			doReturn("A").when(connectorMock).getScheme();
			doReturn(engineMock).when(tomcatMock).getEngine();
			doReturn("B").when(engineMock).getName();
			doNothing().when(engineMock).setName("B-3");
			Container[] containerArray = new Container[] { contextMock3 };
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
			doReturn(null).when(connectorMock4).getState();
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
				contextBindings.verify(() -> ContextBindings.unbindClassLoader(eq(contextMock2), eq(object2), (ClassLoader) any()));
				verify(contextMock2).getNamingToken();
				verify(tomcatMock, times(2)).getService();
				verify(serviceMock).findConnectors();
				verify(connectorMock).getPort();
				verify(connectorMock).getScheme();
				verify(tomcatMock).getEngine();
				verify(engineMock).getName();
				verify(engineMock).setName("B-3");
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

	//Sapient generated method id: ${77dab7d8-9bbd-31ad-a6f1-d92d56b9a09c}, hash: 29ACCC39D411826948972BA55DD4AD6A
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
		Host hostMock = mock(Host.class, "Host");
		Server serverMock = mock(Server.class);
		Server serverMock3 = mock(Server.class, "Server");
		Connector connectorMock4 = mock(Connector.class, "Connector");
		try (MockedStatic<ContextBindings> contextBindings = mockStatic(ContextBindings.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(tomcatMock, "Tomcat Server must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			contextBindings.when(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any())).thenAnswer((Answer<Void>) invocation -> null);
			TomcatWebServer target = spy(new TomcatWebServer(tomcatMock, true, Shutdown.GRACEFUL));
			Connector[] connectorArray = new Connector[] { connectorMock, connectorMock2 };
			doReturn(connectorArray).when(serviceMock).findConnectors();
			doReturn(2).when(connectorMock).getPort();
			doReturn("A").when(connectorMock).getScheme();
			doReturn(engineMock).when(tomcatMock).getEngine();
			doReturn("B").when(engineMock).getName();
			doNothing().when(engineMock).setName("B-3");
			Container[] containerArray = new Container[] { contextMock2 };
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
			doReturn(null).when(connectorMock4).getState();
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
				verify(tomcatMock, times(2)).getService();
				verify(serviceMock).findConnectors();
				verify(connectorMock).getPort();
				verify(connectorMock).getScheme();
				verify(tomcatMock).getEngine();
				verify(engineMock).getName();
				verify(engineMock).setName("B-3");
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

	//Sapient generated method id: ${f07eb671-88a1-30da-b6e2-4266f9fef9a1}, hash: 21F192A04C9C6644448B0FC79CD483A9
	@Disabled(value = "Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
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
		Service serviceMock = mock(Service.class, "Service");
		Host hostMock2 = mock(Host.class, "Host");
		Connector connector2Mock = mock(Connector.class);
		Connector connector2Mock2 = mock(Connector.class);
		try (MockedStatic<ContextBindings> contextBindings = mockStatic(ContextBindings.class)) {
			Object object = new Object();
			contextBindings.when(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any())).thenAnswer((Answer<Void>) invocation -> null);
			doNothing().when(contextMock).addLifecycleListener((LifecycleListener) any());
			doReturn(object).when(contextMock).getNamingToken();
			TomcatWebServer target = new TomcatWebServer(tomcatMock, true, Shutdown.GRACEFUL);
			Connector connector = new Connector();
			Connector[] connectorArray = new Connector[] { connector };
			doReturn(connectorArray).when(serviceMock).findConnectors();
			Engine engine = tomcatMock.getEngine();
			doReturn(engine).when(tomcatMock).getEngine();
			Host host = tomcatMock.getHost();
			Service[] serviceArray = new Service[] { serviceMock2 };
			doReturn(serviceArray).when(serverMock).findServices();
			Server server = tomcatMock.getServer();
			doReturn(serverMock, server).when(tomcatMock).getServer();
			doNothing().when(tomcatMock).start();
			Container[] containerArray = new Container[] { tomcatEmbeddedContextMock };
			doReturn(containerArray).when(hostMock).findChildren();
			doReturn(tomcatStarterMock).when(tomcatEmbeddedContextMock).getStarter();
			doReturn(null).when(tomcatStarterMock).getStartUpException();
			doReturn(LifecycleState.STARTED).when(tomcatEmbeddedContextMock).getState();
			doReturn(host, hostMock, hostMock2).when(tomcatMock).getHost();
			Container[] containerArray2 = new Container[] { containerMock };
			doReturn(containerArray2).when(hostMock2).findChildren();
			doReturn(serviceMock, serviceMock3).when(tomcatMock).getService();
			Connector[] connectorArray2 = new Connector[] { connector2Mock, connector2Mock2 };
			doReturn(connectorArray2).when(serviceMock3).findConnectors();
			doReturn(2).when(connector2Mock).getLocalPort();
			doReturn("A").when(connector2Mock).getScheme();
			doReturn(2).when(connector2Mock2).getLocalPort();
			doReturn("B").when(connector2Mock2).getScheme();
			//Act Statement(s)
			String result = target.getStartedLogMessage();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("Tomcat started on ports 2 (A), 2 (B)"));
				contextBindings.verify(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any()));
				verify(contextMock).addLifecycleListener((LifecycleListener) any());
				verify(contextMock).getNamingToken();
				verify(tomcatMock, times(2)).getService();
				verify(serviceMock).findConnectors();
				verify(tomcatMock).getEngine();
				verify(tomcatMock, times(3)).getHost();
				verify(tomcatMock, times(2)).getServer();
				verify(serverMock).findServices();
				verify(tomcatMock).start();
				verify(hostMock).findChildren();
				verify(tomcatEmbeddedContextMock).getStarter();
				verify(tomcatStarterMock).getStartUpException();
				verify(tomcatEmbeddedContextMock).getState();
				verify(hostMock2).findChildren();
				verify(serviceMock3).findConnectors();
				verify(connector2Mock).getLocalPort();
				verify(connector2Mock).getScheme();
				verify(connector2Mock2).getLocalPort();
				verify(connector2Mock2).getScheme();
			});
		}
	}

	//Sapient generated method id: ${3ec8067a-c803-3247-8b95-21ac0cdf9296}, hash: B2C2957B8553C94A3E6193944F3778B2
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
		Service service2Mock2 = mock(Service.class);
		try (MockedStatic<ContextBindings> contextBindings = mockStatic(ContextBindings.class)) {
			Object object = new Object();
			contextBindings.when(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any())).thenAnswer((Answer<Void>) invocation -> null);
			doNothing().when(contextMock).addLifecycleListener((LifecycleListener) any());
			doReturn(object).when(contextMock).getNamingToken();
			TomcatWebServer target = new TomcatWebServer(tomcatMock, true, Shutdown.GRACEFUL);
			Service service = tomcatMock.getService();
			doReturn(service).when(tomcatMock).getService();
			Engine engine = tomcatMock.getEngine();
			doReturn(engine).when(tomcatMock).getEngine();
			Host host = tomcatMock.getHost();
			Server server = tomcatMock.getServer();
			Service[] serviceArray = new Service[] { service2Mock };
			doReturn(serviceArray).when(serverMock).findServices();
			doNothing().when(tomcatMock).start();
			doReturn(host, hostMock).when(tomcatMock).getHost();
			Container[] containerArray = new Container[] { tomcatEmbeddedContextMock };
			doReturn(containerArray).when(hostMock).findChildren();
			doReturn(tomcatStarterMock).when(tomcatEmbeddedContextMock).getStarter();
			doReturn(null).when(tomcatStarterMock).getStartUpException();
			doReturn(LifecycleState.STARTED).when(tomcatEmbeddedContextMock).getState();
			doReturn(server, serverMock, serverMock2).when(tomcatMock).getServer();
			Service[] serviceArray2 = new Service[] { service2Mock2 };
			doReturn(serviceArray2).when(serverMock2).findServices();
			Connector[] connectorArray = new Connector[] {};
			doReturn(connectorArray).when(service2Mock2).findConnectors();
			//Act Statement(s)
			target.stop();
			//Assert statement(s)
			assertAll("result", () -> {
				contextBindings.verify(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any()));
				verify(contextMock).addLifecycleListener((LifecycleListener) any());
				verify(contextMock).getNamingToken();
				verify(tomcatMock).getService();
				verify(tomcatMock).getEngine();
				verify(tomcatMock, times(2)).getHost();
				verify(tomcatMock, times(3)).getServer();
				verify(serverMock).findServices();
				verify(tomcatMock).start();
				verify(hostMock).findChildren();
				verify(tomcatEmbeddedContextMock).getStarter();
				verify(tomcatStarterMock).getStartUpException();
				verify(tomcatEmbeddedContextMock).getState();
				verify(serverMock2).findServices();
				verify(service2Mock2).findConnectors();
			});
		}
	}

	//Sapient generated method id: ${7c6465c7-f95f-3515-8e00-5a07af39b1cf}, hash: 9A3E6368CAA86825BBF93E35E5FCD11F
	@Disabled(value = "Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void stopWhenCaughtExceptionThrowsWebServerException() throws WebServerException, LifecycleException, NamingException {
		/* Branches:
		 * (this.gracefulShutdown != null) : true
		 * (for-each(this.tomcat.getServer().findServices())) : false  #  inside doWithConnectors method
		 * (catch-exception (Exception)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: gracefulShutdown
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ContextBindings> contextBindings = mockStatic(ContextBindings.class)) {
			Object object = new Object();
			contextBindings.when(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any())).thenAnswer((Answer<Void>) invocation -> null);
			doNothing().when(contextMock).addLifecycleListener((LifecycleListener) any());
			doReturn(object).when(contextMock).getNamingToken();
			TomcatWebServer target = new TomcatWebServer(tomcatMock, true, Shutdown.GRACEFUL);
			Service service = tomcatMock.getService();
			doReturn(service).when(tomcatMock).getService();
			Engine engine = tomcatMock.getEngine();
			doReturn(engine).when(tomcatMock).getEngine();
			Host host = tomcatMock.getHost();
			Server server = tomcatMock.getServer();
			Service[] serviceArray = new Service[] { service2Mock };
			doReturn(serviceArray).when(serverMock).findServices();
			doNothing().when(tomcatMock).start();
			doReturn(host, hostMock).when(tomcatMock).getHost();
			Container[] containerArray = new Container[] { tomcatEmbeddedContextMock };
			doReturn(containerArray).when(hostMock).findChildren();
			doReturn(tomcatStarterMock).when(tomcatEmbeddedContextMock).getStarter();
			doReturn(null).when(tomcatStarterMock).getStartUpException();
			doReturn(LifecycleState.STARTED).when(tomcatEmbeddedContextMock).getState();
			doReturn(server, serverMock, serverMock2).when(tomcatMock).getServer();
			Service[] serviceArray2 = new Service[] {};
			doReturn(serviceArray2).when(serverMock2).findServices();
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
				contextBindings.verify(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any()));
				verify(contextMock).addLifecycleListener((LifecycleListener) any());
				verify(contextMock).getNamingToken();
				verify(tomcatMock).getService();
				verify(tomcatMock).getEngine();
				verify(tomcatMock, times(2)).getHost();
				verify(tomcatMock, times(3)).getServer();
				verify(serverMock).findServices();
				verify(tomcatMock).start();
				verify(hostMock).findChildren();
				verify(tomcatEmbeddedContextMock).getStarter();
				verify(tomcatStarterMock).getStartUpException();
				verify(tomcatEmbeddedContextMock).getState();
				verify(serverMock2).findServices();
			});
		}
	}

	//Sapient generated method id: ${534dce3f-7c80-3c70-91d9-adde758ba215}, hash: 56E0241C3283832681EEC431B919B78D
	@Disabled(value = "Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
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
		try (MockedStatic<ContextBindings> contextBindings = mockStatic(ContextBindings.class)) {
			Object object = new Object();
			contextBindings.when(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any())).thenAnswer((Answer<Void>) invocation -> null);
			doNothing().when(contextMock).addLifecycleListener((LifecycleListener) any());
			doReturn(object).when(contextMock).getNamingToken();
			TomcatWebServer target = new TomcatWebServer(tomcatMock, true, Shutdown.GRACEFUL);
			Service service = tomcatMock.getService();
			doReturn(service).when(tomcatMock).getService();
			Engine engine = tomcatMock.getEngine();
			doReturn(engine).when(tomcatMock).getEngine();
			Host host = tomcatMock.getHost();
			Service[] serviceArray = new Service[] { service2Mock };
			doReturn(serviceArray).when(serverMock).findServices();
			Server server = tomcatMock.getServer();
			doReturn(serverMock, server).when(tomcatMock).getServer();
			doNothing().when(tomcatMock).start();
			doReturn(host, hostMock).when(tomcatMock).getHost();
			Container[] containerArray = new Container[] { tomcatEmbeddedContextMock };
			doReturn(containerArray).when(hostMock).findChildren();
			doReturn(tomcatStarterMock).when(tomcatEmbeddedContextMock).getStarter();
			doReturn(null).when(tomcatStarterMock).getStartUpException();
			doReturn(LifecycleState.STARTED).when(tomcatEmbeddedContextMock).getState();
			doNothing().when(tomcatMock).stop();
			doNothing().when(tomcatMock).destroy();
			//Act Statement(s)
			target.destroy();
			//Assert statement(s)
			assertAll("result", () -> {
				contextBindings.verify(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any()));
				verify(contextMock).addLifecycleListener((LifecycleListener) any());
				verify(contextMock).getNamingToken();
				verify(tomcatMock).getService();
				verify(tomcatMock).getEngine();
				verify(tomcatMock, times(2)).getHost();
				verify(tomcatMock, times(2)).getServer();
				verify(serverMock).findServices();
				verify(tomcatMock).start();
				verify(hostMock).findChildren();
				verify(tomcatEmbeddedContextMock).getStarter();
				verify(tomcatStarterMock).getStartUpException();
				verify(tomcatEmbeddedContextMock).getState();
				verify(tomcatMock).stop();
				verify(tomcatMock).destroy();
			});
		}
	}

	//Sapient generated method id: ${1c7909e8-e5f8-32af-ae70-86d5e3a5f3b0}, hash: ABB258E0355C8C51CF1BED671DE34C65
	@Disabled(value = "Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
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
		try (MockedStatic<ContextBindings> contextBindings = mockStatic(ContextBindings.class)) {
			Object object = new Object();
			contextBindings.when(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any())).thenAnswer((Answer<Void>) invocation -> null);
			doNothing().when(contextMock).addLifecycleListener((LifecycleListener) any());
			doReturn(object).when(contextMock).getNamingToken();
			TomcatWebServer target = new TomcatWebServer(tomcatMock, true, Shutdown.GRACEFUL);
			Service service = tomcatMock.getService();
			doReturn(service).when(tomcatMock).getService();
			Engine engine = tomcatMock.getEngine();
			doReturn(engine).when(tomcatMock).getEngine();
			Host host = tomcatMock.getHost();
			Service[] serviceArray = new Service[] { service2Mock };
			doReturn(serviceArray).when(serverMock).findServices();
			Server server = tomcatMock.getServer();
			doReturn(serverMock, server).when(tomcatMock).getServer();
			doNothing().when(tomcatMock).start();
			doReturn(host, hostMock).when(tomcatMock).getHost();
			Container[] containerArray = new Container[] { tomcatEmbeddedContextMock };
			doReturn(containerArray).when(hostMock).findChildren();
			doReturn(tomcatStarterMock).when(tomcatEmbeddedContextMock).getStarter();
			doReturn(null).when(tomcatStarterMock).getStartUpException();
			doReturn(LifecycleState.STARTED).when(tomcatEmbeddedContextMock).getState();
			doNothing().when(tomcatMock).stop();
			doNothing().when(tomcatMock).destroy();
			//Act Statement(s)
			target.destroy();
			//Assert statement(s)
			assertAll("result", () -> {
				contextBindings.verify(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any()));
				verify(contextMock).addLifecycleListener((LifecycleListener) any());
				verify(contextMock).getNamingToken();
				verify(tomcatMock).getService();
				verify(tomcatMock).getEngine();
				verify(tomcatMock, times(2)).getHost();
				verify(tomcatMock, times(2)).getServer();
				verify(serverMock).findServices();
				verify(tomcatMock).start();
				verify(hostMock).findChildren();
				verify(tomcatEmbeddedContextMock).getStarter();
				verify(tomcatStarterMock).getStartUpException();
				verify(tomcatEmbeddedContextMock).getState();
				verify(tomcatMock).stop();
				verify(tomcatMock).destroy();
			});
		}
	}

	//Sapient generated method id: ${f6d1c4f8-d979-3198-acbc-9f01370a4805}, hash: 958EB16E36020005B930766A65CF5C3B
	@Disabled(value = "Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
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
		try (MockedStatic<ContextBindings> contextBindings = mockStatic(ContextBindings.class)) {
			Object object = new Object();
			contextBindings.when(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any())).thenAnswer((Answer<Void>) invocation -> null);
			doNothing().when(contextMock).addLifecycleListener((LifecycleListener) any());
			doReturn(object).when(contextMock).getNamingToken();
			TomcatWebServer target = new TomcatWebServer(tomcatMock, true, Shutdown.GRACEFUL);
			Service service = tomcatMock.getService();
			doReturn(service).when(tomcatMock).getService();
			Engine engine = tomcatMock.getEngine();
			doReturn(engine).when(tomcatMock).getEngine();
			Host host = tomcatMock.getHost();
			Service[] serviceArray = new Service[] { service2Mock };
			doReturn(serviceArray).when(serverMock).findServices();
			Server server = tomcatMock.getServer();
			doReturn(serverMock, server).when(tomcatMock).getServer();
			doNothing().when(tomcatMock).start();
			doReturn(host, hostMock).when(tomcatMock).getHost();
			Container[] containerArray = new Container[] { tomcatEmbeddedContextMock };
			doReturn(containerArray).when(hostMock).findChildren();
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
				contextBindings.verify(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any()));
				verify(contextMock).addLifecycleListener((LifecycleListener) any());
				verify(contextMock).getNamingToken();
				verify(tomcatMock).getService();
				verify(tomcatMock).getEngine();
				verify(tomcatMock, times(2)).getHost();
				verify(tomcatMock, times(2)).getServer();
				verify(serverMock).findServices();
				verify(tomcatMock).start();
				verify(hostMock).findChildren();
				verify(tomcatEmbeddedContextMock).getStarter();
				verify(tomcatStarterMock).getStartUpException();
				verify(tomcatEmbeddedContextMock).getState();
				verify(tomcatMock).stop();
				verify(tomcatMock).destroy();
			});
		}
	}

	//Sapient generated method id: ${8fd7472d-38f6-3a76-8eab-cacec2274e36}, hash: 115059BE858EE18EFC021490B9C44828
	@Disabled(value = "Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
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
		Connector connectorMock = mock(Connector.class, "Connector");
		try (MockedStatic<ContextBindings> contextBindings = mockStatic(ContextBindings.class)) {
			Object object = new Object();
			contextBindings.when(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any())).thenAnswer((Answer<Void>) invocation -> null);
			doNothing().when(contextMock).addLifecycleListener((LifecycleListener) any());
			doReturn(object).when(contextMock).getNamingToken();
			TomcatWebServer target = new TomcatWebServer(tomcatMock, true, Shutdown.GRACEFUL);
			Service service = tomcatMock.getService();
			doReturn(service).when(tomcatMock).getService();
			Engine engine = tomcatMock.getEngine();
			doReturn(engine).when(tomcatMock).getEngine();
			Host host = tomcatMock.getHost();
			Service[] serviceArray = new Service[] { service2Mock };
			doReturn(serviceArray).when(serverMock).findServices();
			Server server = tomcatMock.getServer();
			doReturn(serverMock, server).when(tomcatMock).getServer();
			doNothing().when(tomcatMock).start();
			doReturn(host, hostMock).when(tomcatMock).getHost();
			Container[] containerArray = new Container[] { tomcatEmbeddedContextMock };
			doReturn(containerArray).when(hostMock).findChildren();
			doReturn(tomcatStarterMock).when(tomcatEmbeddedContextMock).getStarter();
			doReturn(null).when(tomcatStarterMock).getStartUpException();
			doReturn(LifecycleState.STARTED).when(tomcatEmbeddedContextMock).getState();
			doReturn(connectorMock).when(tomcatMock).getConnector();
			doReturn(0).when(connectorMock).getLocalPort();
			//Act Statement(s)
			int result = target.getPort();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(0));
				contextBindings.verify(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any()));
				verify(contextMock).addLifecycleListener((LifecycleListener) any());
				verify(contextMock).getNamingToken();
				verify(tomcatMock).getService();
				verify(tomcatMock).getEngine();
				verify(tomcatMock, times(2)).getHost();
				verify(tomcatMock, times(2)).getServer();
				verify(serverMock).findServices();
				verify(tomcatMock).start();
				verify(hostMock).findChildren();
				verify(tomcatEmbeddedContextMock).getStarter();
				verify(tomcatStarterMock).getStartUpException();
				verify(tomcatEmbeddedContextMock).getState();
				verify(tomcatMock).getConnector();
				verify(connectorMock).getLocalPort();
			});
		}
	}

	//Sapient generated method id: ${d0333bfe-140b-3a95-96a4-614f95f451ca}, hash: AA536E62F9A8E93F9B50264A999D2B75
	@Disabled(value = "Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
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
		try (MockedStatic<ContextBindings> contextBindings = mockStatic(ContextBindings.class)) {
			Object object = new Object();
			contextBindings.when(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any())).thenAnswer((Answer<Void>) invocation -> null);
			doNothing().when(contextMock).addLifecycleListener((LifecycleListener) any());
			doReturn(object).when(contextMock).getNamingToken();
			TomcatWebServer target = new TomcatWebServer(tomcatMock, true, Shutdown.GRACEFUL);
			Service service = tomcatMock.getService();
			doReturn(service).when(tomcatMock).getService();
			Engine engine = tomcatMock.getEngine();
			doReturn(engine).when(tomcatMock).getEngine();
			Host host = tomcatMock.getHost();
			Service[] serviceArray = new Service[] { service2Mock };
			doReturn(serviceArray).when(serverMock).findServices();
			Server server = tomcatMock.getServer();
			doReturn(serverMock, server).when(tomcatMock).getServer();
			doNothing().when(tomcatMock).start();
			doReturn(host, hostMock).when(tomcatMock).getHost();
			Container[] containerArray = new Container[] { tomcatEmbeddedContextMock };
			doReturn(containerArray).when(hostMock).findChildren();
			doReturn(tomcatStarterMock).when(tomcatEmbeddedContextMock).getStarter();
			doReturn(null).when(tomcatStarterMock).getStartUpException();
			doReturn(LifecycleState.STARTED).when(tomcatEmbeddedContextMock).getState();
			doReturn(null).when(tomcatMock).getConnector();
			//Act Statement(s)
			int result = target.getPort();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(-1));
				contextBindings.verify(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any()));
				verify(contextMock).addLifecycleListener((LifecycleListener) any());
				verify(contextMock).getNamingToken();
				verify(tomcatMock).getService();
				verify(tomcatMock).getEngine();
				verify(tomcatMock, times(2)).getHost();
				verify(tomcatMock, times(2)).getServer();
				verify(serverMock).findServices();
				verify(tomcatMock).start();
				verify(hostMock).findChildren();
				verify(tomcatEmbeddedContextMock).getStarter();
				verify(tomcatStarterMock).getStartUpException();
				verify(tomcatEmbeddedContextMock).getState();
				verify(tomcatMock).getConnector();
			});
		}
	}

	//Sapient generated method id: ${57d12bb9-c0cb-3775-bb8f-a1541c0d5bab}, hash: D31F5150C5FD3C0C0B5F1D4820E553C4
	@Disabled(value = "Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void shutDownGracefullyWhenThisGracefulShutdownIsNull() throws LifecycleException, NamingException {
		/* Branches:
		 * (this.gracefulShutdown == null) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
		 *  Suggestions:
		 *  This method should be avoided from unit testing. This can be covered during integration testing.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		GracefulShutdownCallback callbackMock = mock(GracefulShutdownCallback.class);
		Server serverMock = mock(Server.class);
		try (MockedStatic<ContextBindings> contextBindings = mockStatic(ContextBindings.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doNothing().when(callbackMock).shutdownComplete(GracefulShutdownResult.IMMEDIATE);
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
			target.shutDownGracefully(callbackMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(callbackMock).shutdownComplete(GracefulShutdownResult.IMMEDIATE);
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

	//Sapient generated method id: ${13fd2f5c-530b-37a2-a9c9-4f453a233bea}, hash: 6E04E385A4FC05C603FD32038137EFF0
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
		GracefulShutdownCallback gracefulShutdownCallbackMock = mock(GracefulShutdownCallback.class, "callback_value");
		try (MockedStatic<ContextBindings> contextBindings = mockStatic(ContextBindings.class)) {
			Object object = new Object();
			contextBindings.when(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any())).thenAnswer((Answer<Void>) invocation -> null);
			doNothing().when(contextMock).addLifecycleListener((LifecycleListener) any());
			doReturn(object).when(contextMock).getNamingToken();
			TomcatWebServer target = new TomcatWebServer(tomcatMock, true, Shutdown.GRACEFUL);
			Service service = tomcatMock.getService();
			doReturn(service).when(tomcatMock).getService();
			Engine engine = tomcatMock.getEngine();
			doReturn(engine).when(tomcatMock).getEngine();
			Host host = tomcatMock.getHost();
			Service[] serviceArray = new Service[] { service2Mock };
			doReturn(serviceArray).when(serverMock).findServices();
			Server server = tomcatMock.getServer();
			doReturn(serverMock, server).when(tomcatMock).getServer();
			doNothing().when(tomcatMock).start();
			doReturn(host, hostMock).when(tomcatMock).getHost();
			Container[] containerArray = new Container[] { tomcatEmbeddedContextMock };
			doReturn(containerArray).when(hostMock).findChildren();
			doReturn(tomcatStarterMock).when(tomcatEmbeddedContextMock).getStarter();
			doReturn(null).when(tomcatStarterMock).getStartUpException();
			doReturn(LifecycleState.STARTED).when(tomcatEmbeddedContextMock).getState();
			//Act Statement(s)
			target.shutDownGracefully(gracefulShutdownCallbackMock);
			//Assert statement(s)
			assertAll("result", () -> {
				contextBindings.verify(() -> ContextBindings.bindClassLoader(eq(contextMock), eq(object), (ClassLoader) any()));
				verify(contextMock).addLifecycleListener((LifecycleListener) any());
				verify(contextMock).getNamingToken();
				verify(tomcatMock).getService();
				verify(tomcatMock).getEngine();
				verify(tomcatMock, times(2)).getHost();
				verify(tomcatMock, times(2)).getServer();
				verify(serverMock).findServices();
				verify(tomcatMock).start();
				verify(hostMock).findChildren();
				verify(tomcatEmbeddedContextMock).getStarter();
				verify(tomcatStarterMock).getStartUpException();
				verify(tomcatEmbeddedContextMock).getState();
			});
		}
	}
}
