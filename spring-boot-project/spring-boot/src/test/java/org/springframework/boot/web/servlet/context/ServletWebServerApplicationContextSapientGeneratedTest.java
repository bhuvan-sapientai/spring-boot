package org.springframework.boot.web.servlet.context;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.springframework.beans.BeansException;

import jakarta.servlet.ServletException;

import org.springframework.web.context.support.ServletContextResource;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.boot.web.servlet.ServletContextInitializer;

import org.mockito.MockitoAnnotations;

import org.springframework.util.StringUtils;

import jakarta.servlet.ServletContext;

import org.springframework.util.Assert;
import org.springframework.boot.web.context.MissingWebServerFactoryBeanException;
import org.springframework.web.context.ServletContextAware;

import org.mockito.stubbing.Answer;

import org.springframework.boot.availability.ReadinessState;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.ui.context.ThemeSource;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.web.context.WebServerGracefulShutdownLifecycle;
import org.springframework.core.metrics.StartupStep;
import org.springframework.ui.context.support.UiApplicationContextUtils;

import java.util.Collection;

import org.springframework.core.io.Resource;
import org.springframework.context.ApplicationContextException;
import org.springframework.core.metrics.ApplicationStartup;

import org.mockito.MockedStatic;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.web.server.WebServer;
import org.springframework.util.ObjectUtils;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

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

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ServletWebServerApplicationContextSapientGeneratedTest {

	private AutoCloseable autoCloseableMocks;

	@InjectMocks()
	private ServletWebServerApplicationContext target;

	@AfterEach()
	public void afterTest() throws Exception {
		if (autoCloseableMocks != null)
			autoCloseableMocks.close();
	}

	//Sapient generated method id: ${32a6cd18-592b-3bd6-bdff-74972c9306e2}, hash: E1CD4BF440ACC3347CBD13761F0AB89E
	@Disabled()
	@Test()
	void postProcessBeanFactoryTest() throws IllegalStateException {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: existingScopes - Method: restore
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurableListableBeanFactory beanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
		try (MockedStatic<WebApplicationContextUtils> webApplicationContextUtils = mockStatic(WebApplicationContextUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doNothing().when(beanFactoryMock).addBeanPostProcessor((BeanPostProcessor) any());
			doNothing().when(beanFactoryMock).ignoreDependencyInterface(ServletContextAware.class);
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationContextUtils.when(() -> WebApplicationContextUtils.registerWebApplicationScopes(configurableListableBeanFactoryMock)).thenAnswer((Answer<Void>) invocation -> null);
			target = spy(new ServletWebServerApplicationContext(defaultListableBeanFactoryMock));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			doReturn(configurableListableBeanFactoryMock2, configurableListableBeanFactoryMock).when(target).getBeanFactory();
			//Act Statement(s)
			target.postProcessBeanFactory(beanFactoryMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(beanFactoryMock).addBeanPostProcessor((BeanPostProcessor) any());
				verify(beanFactoryMock).ignoreDependencyInterface(ServletContextAware.class);
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
				webApplicationContextUtils.verify(() -> WebApplicationContextUtils.registerWebApplicationScopes(configurableListableBeanFactoryMock), atLeast(1));
				verify(target, times(2)).getBeanFactory();
			});
		}
	}

	//Sapient generated method id: ${3ebd3d04-76b3-320f-b304-f0b6a8fe009f}, hash: 6E08DF2E34E524DC564F256AAD6BDC19
	@Disabled()
	@Test()
	void refreshTest() throws BeansException, IllegalStateException {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new ServletWebServerApplicationContext(defaultListableBeanFactoryMock);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			target.refresh();
			//Assert statement(s)
			assertAll("result", () -> _assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1)));
		}
	}

	//Sapient generated method id: ${fba8a5f6-1d24-3d4e-8cd2-4d0e1a0784f9}, hash: B9204CD0FE030C0C91DBCC39F38D314D
	@Test()
	void refreshWhenWebServerIsNullThrowsRuntimeException() throws BeansException, IllegalStateException {
		/* Branches:
		 * (catch-exception (RuntimeException)) : true
		 * (webServer != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new ServletWebServerApplicationContext(defaultListableBeanFactoryMock);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			final RuntimeException result = assertThrows(RuntimeException.class, () -> {
				target.refresh();
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${bcd052b1-90f1-3044-9e85-4eac9e496a62}, hash: 573CFB6055F63529C2F5531D23CE0AA4
	@Disabled()
	@Test()
	void onRefreshWhenServletContextIsNull() throws Throwable, ServletException {
		/* Branches:
		 * (webServer == null) : true  #  inside createWebServer method
		 * (servletContext == null) : true  #  inside createWebServer method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ApplicationStartup applicationStartupMock = mock(ApplicationStartup.class);
		StartupStep startupStepMock = mock(StartupStep.class);
		StartupStep startupStepMock2 = mock(StartupStep.class);
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		ThemeSource themeSourceMock = mock(ThemeSource.class);
		ServletWebServerFactory servletWebServerFactoryMock = mock(ServletWebServerFactory.class);
		WebServer webServerMock = mock(WebServer.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
		try (MockedStatic<UiApplicationContextUtils> uiApplicationContextUtils = mockStatic(UiApplicationContextUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(startupStepMock).when(applicationStartupMock).start("spring.boot.webserver.create");
			doReturn(startupStepMock2).when(startupStepMock).tag("factory", "");
			doNothing().when(startupStepMock).end();
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = spy(new ServletWebServerApplicationContext(defaultListableBeanFactoryMock));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setApplicationStartup(applicationStartupMock);
			target.setServletContext((ServletContext) null);
			uiApplicationContextUtils.when(() -> UiApplicationContextUtils.initThemeSource(target)).thenReturn(themeSourceMock);
			doReturn(servletWebServerFactoryMock).when(target).getWebServerFactory();
			ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] { null };
			doReturn(webServerMock).when(servletWebServerFactoryMock).getWebServer(servletContextInitializerArray);
			doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("webServerGracefulShutdown"), (WebServerGracefulShutdownLifecycle) any());
			doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2).when(target).getBeanFactory();
			doNothing().when(configurableListableBeanFactoryMock2).registerSingleton(eq("webServerStartStop"), (WebServerStartStopLifecycle) any());
			//Act Statement(s)
			target.onRefresh();
			//Assert statement(s)
			assertAll("result", () -> {
				verify(applicationStartupMock).start("spring.boot.webserver.create");
				verify(startupStepMock).tag("factory", "");
				verify(startupStepMock).end();
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
				uiApplicationContextUtils.verify(() -> UiApplicationContextUtils.initThemeSource(target), atLeast(1));
				verify(target).getWebServerFactory();
				verify(servletWebServerFactoryMock).getWebServer(servletContextInitializerArray);
				verify(target, times(2)).getBeanFactory();
				verify(configurableListableBeanFactoryMock).registerSingleton(eq("webServerGracefulShutdown"), (WebServerGracefulShutdownLifecycle) any());
				verify(configurableListableBeanFactoryMock2).registerSingleton(eq("webServerStartStop"), (WebServerStartStopLifecycle) any());
			});
		}
	}

	//Sapient generated method id: ${b6eb1e1b-60d9-35a1-be2b-93f6934cbb2a}, hash: E1D55049DAA73AA1E46716F570E9B5BD
	@Disabled()
	@Test()
	void onRefreshWhenCaughtThrowableThrowsApplicationContextException() throws IllegalStateException {
		/* Branches:
		 * (webServer == null) : true  #  inside createWebServer method
		 * (servletContext == null) : true  #  inside createWebServer method
		 * (catch-exception (Throwable)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ApplicationStartup applicationStartupMock = mock(ApplicationStartup.class);
		StartupStep startupStepMock = mock(StartupStep.class);
		StartupStep startupStepMock2 = mock(StartupStep.class);
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		ThemeSource themeSourceMock = mock(ThemeSource.class);
		ServletWebServerFactory servletWebServerFactoryMock = mock(ServletWebServerFactory.class);
		WebServer webServerMock = mock(WebServer.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
		try (MockedStatic<UiApplicationContextUtils> uiApplicationContextUtils = mockStatic(UiApplicationContextUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(startupStepMock).when(applicationStartupMock).start("spring.boot.webserver.create");
			doReturn(startupStepMock2).when(startupStepMock).tag("factory", "");
			doNothing().when(startupStepMock).end();
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = spy(new ServletWebServerApplicationContext(defaultListableBeanFactoryMock));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setApplicationStartup(applicationStartupMock);
			target.setServletContext((ServletContext) null);
			uiApplicationContextUtils.when(() -> UiApplicationContextUtils.initThemeSource(target)).thenReturn(themeSourceMock);
			doReturn(servletWebServerFactoryMock).when(target).getWebServerFactory();
			ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] { null };
			doReturn(webServerMock).when(servletWebServerFactoryMock).getWebServer(servletContextInitializerArray);
			doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("webServerGracefulShutdown"), (WebServerGracefulShutdownLifecycle) any());
			doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2).when(target).getBeanFactory();
			doNothing().when(configurableListableBeanFactoryMock2).registerSingleton(eq("webServerStartStop"), (WebServerStartStopLifecycle) any());
			//Act Statement(s)
			final ApplicationContextException result = assertThrows(ApplicationContextException.class, () -> {
				target.onRefresh();
			});
			Throwable throwable = new Throwable();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getCause(), is(instanceOf(throwable.getClass())));
				verify(applicationStartupMock).start("spring.boot.webserver.create");
				verify(startupStepMock).tag("factory", "");
				verify(startupStepMock).end();
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
				uiApplicationContextUtils.verify(() -> UiApplicationContextUtils.initThemeSource(target), atLeast(1));
				verify(target).getWebServerFactory();
				verify(servletWebServerFactoryMock).getWebServer(servletContextInitializerArray);
				verify(target, times(2)).getBeanFactory();
				verify(configurableListableBeanFactoryMock).registerSingleton(eq("webServerGracefulShutdown"), (WebServerGracefulShutdownLifecycle) any());
				verify(configurableListableBeanFactoryMock2).registerSingleton(eq("webServerStartStop"), (WebServerStartStopLifecycle) any());
			});
		}
	}

	//Sapient generated method id: ${ba8e6084-928e-3fbf-828a-fba6c8127f24}, hash: 85F6A0D50A02C7CBC09E1DDD1B76D5B1
	@Disabled()
	@Test()
	void onRefreshWhenCaughtServletException() throws Throwable, ServletException {
		/* Branches:
		 * (webServer == null) : true  #  inside createWebServer method
		 * (servletContext == null) : true  #  inside createWebServer method
		 * (catch-exception (ServletException)) : true  #  inside createWebServer method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ApplicationStartup applicationStartupMock = mock(ApplicationStartup.class);
		StartupStep startupStepMock = mock(StartupStep.class);
		StartupStep startupStepMock2 = mock(StartupStep.class);
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		ThemeSource themeSourceMock = mock(ThemeSource.class);
		ServletWebServerFactory servletWebServerFactoryMock = mock(ServletWebServerFactory.class);
		WebServer webServerMock = mock(WebServer.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
		try (MockedStatic<UiApplicationContextUtils> uiApplicationContextUtils = mockStatic(UiApplicationContextUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(startupStepMock).when(applicationStartupMock).start("spring.boot.webserver.create");
			doReturn(startupStepMock2).when(startupStepMock).tag("factory", "");
			doNothing().when(startupStepMock).end();
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = spy(new ServletWebServerApplicationContext(defaultListableBeanFactoryMock));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setApplicationStartup(applicationStartupMock);
			target.setServletContext((ServletContext) null);
			uiApplicationContextUtils.when(() -> UiApplicationContextUtils.initThemeSource(target)).thenReturn(themeSourceMock);
			doReturn(servletWebServerFactoryMock).when(target).getWebServerFactory();
			ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] { null };
			doReturn(webServerMock).when(servletWebServerFactoryMock).getWebServer(servletContextInitializerArray);
			doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("webServerGracefulShutdown"), (WebServerGracefulShutdownLifecycle) any());
			doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2).when(target).getBeanFactory();
			doNothing().when(configurableListableBeanFactoryMock2).registerSingleton(eq("webServerStartStop"), (WebServerStartStopLifecycle) any());
			//Act Statement(s)
			target.onRefresh();
			//Assert statement(s)
			assertAll("result", () -> {
				verify(applicationStartupMock).start("spring.boot.webserver.create");
				verify(startupStepMock).tag("factory", "");
				verify(startupStepMock).end();
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
				uiApplicationContextUtils.verify(() -> UiApplicationContextUtils.initThemeSource(target), atLeast(1));
				verify(target).getWebServerFactory();
				verify(servletWebServerFactoryMock).getWebServer(servletContextInitializerArray);
				verify(target, times(2)).getBeanFactory();
				verify(configurableListableBeanFactoryMock).registerSingleton(eq("webServerGracefulShutdown"), (WebServerGracefulShutdownLifecycle) any());
				verify(configurableListableBeanFactoryMock2).registerSingleton(eq("webServerStartStop"), (WebServerStartStopLifecycle) any());
			});
		}
	}

	//Sapient generated method id: ${51bb2206-0746-3874-b3bd-73ff38b651c3}, hash: 3CB1A30C1BE8258FD758AD8FD8ADAA0D
	@Disabled()
	@Test()
	void onRefreshWhenServletContextIsNotNull() throws Throwable, ServletException {
		/* Branches:
		 * (webServer == null) : true  #  inside createWebServer method
		 * (servletContext == null) : false  #  inside createWebServer method
		 * (servletContext != null) : true  #  inside createWebServer method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: object of type ServletContextInitializer - Method: onStartup
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		ServletContext servletContextMock = mock(ServletContext.class);
		ThemeSource themeSourceMock = mock(ThemeSource.class);
		try (MockedStatic<UiApplicationContextUtils> uiApplicationContextUtils = mockStatic(UiApplicationContextUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new ServletWebServerApplicationContext(defaultListableBeanFactoryMock);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setServletContext(servletContextMock);
			uiApplicationContextUtils.when(() -> UiApplicationContextUtils.initThemeSource(target)).thenReturn(themeSourceMock);
			//Act Statement(s)
			target.onRefresh();
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
				uiApplicationContextUtils.verify(() -> UiApplicationContextUtils.initThemeSource(target), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${d3150a9b-d64a-3ee8-bf31-91a6c0367b1e}, hash: C551BC91B428DD12A596FC6DCC3A6E07
	@Test()
	void onRefreshWhenCaughtServletExceptionThrowsApplicationContextException() throws ServletException {
		/* Branches:
		 * (webServer == null) : true  #  inside createWebServer method
		 * (servletContext == null) : false  #  inside createWebServer method
		 * (servletContext != null) : true  #  inside createWebServer method
		 * (catch-exception (ServletException)) : true  #  inside createWebServer method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: object of type ServletContextInitializer - Method: onStartup
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		ServletContext servletContextMock = mock(ServletContext.class);
		ThemeSource themeSourceMock = mock(ThemeSource.class);
		try (MockedStatic<UiApplicationContextUtils> uiApplicationContextUtils = mockStatic(UiApplicationContextUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new ServletWebServerApplicationContext(defaultListableBeanFactoryMock);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setServletContext(servletContextMock);
			uiApplicationContextUtils.when(() -> UiApplicationContextUtils.initThemeSource(target)).thenReturn(themeSourceMock);
			//Act Statement(s)
			final ApplicationContextException result = assertThrows(ApplicationContextException.class, () -> {
				target.onRefresh();
			});
			Throwable throwable = new Throwable();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getCause(), is(instanceOf(throwable.getClass())));
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
				uiApplicationContextUtils.verify(() -> UiApplicationContextUtils.initThemeSource(target), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${14d86d3a-ebaf-3870-8982-7b9de93cfaab}, hash: C71FE422D9E5C9BFC5BA133E8BAA8155
	@Test()
	void doCloseWhenWebServerIsNull() {
		/* Branches:
		 * (isActive()) : true
		 * (webServer != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		try (MockedStatic<AvailabilityChangeEvent> availabilityChangeEvent = mockStatic(AvailabilityChangeEvent.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = spy(new ServletWebServerApplicationContext(defaultListableBeanFactoryMock));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			doReturn(true).when(target).isActive();
			availabilityChangeEvent.when(() -> AvailabilityChangeEvent.publish(target, ReadinessState.REFUSING_TRAFFIC)).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			target.doClose();
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
				verify(target).isActive();
				availabilityChangeEvent.verify(() -> AvailabilityChangeEvent.publish(target, ReadinessState.REFUSING_TRAFFIC), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${968c0f7c-21fb-3a55-a01d-e2edd4591eb2}, hash: 916339012F50212601E4D1CADAEAD9E4
	@Disabled()
	@Test()
	void getWebServerFactoryWhenBeanNamesLengthEquals0ThrowsMissingWebServerFactoryBeanException() throws IllegalStateException {
		/* Branches:
		 * (beanNames.length == 0) : true
		 */
		//Arrange Statement(s)
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = spy(new ServletWebServerApplicationContext(defaultListableBeanFactoryMock));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			doReturn(configurableListableBeanFactoryMock).when(target).getBeanFactory();
			String[] stringArray = new String[] {};
			doReturn(stringArray).when(configurableListableBeanFactoryMock).getBeanNamesForType(ServletWebServerFactory.class);
			//Act Statement(s)
			final MissingWebServerFactoryBeanException result = assertThrows(MissingWebServerFactoryBeanException.class, () -> {
				target.getWebServerFactory();
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
				verify(target).getBeanFactory();
				verify(configurableListableBeanFactoryMock).getBeanNamesForType(ServletWebServerFactory.class);
			});
		}
	}

	//Sapient generated method id: ${cd745bd5-5029-3cf5-ae28-02c22ba08239}, hash: CC8CCE007135853AF81524C040E5CDCE
	@Disabled()
	@Test()
	void getWebServerFactoryWhenBeanNamesLengthGreaterThan1ThrowsApplicationContextException() throws IllegalStateException {
		/* Branches:
		 * (beanNames.length == 0) : false
		 * (beanNames.length > 1) : true
		 */
		//Arrange Statement(s)
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] { "return_of_getBeanNamesForTypeItem1", "return_of_getBeanNamesForTypeItem1" };
			stringUtils.when(() -> StringUtils.arrayToCommaDelimitedString(stringArray)).thenReturn("B");
			target = spy(new ServletWebServerApplicationContext(defaultListableBeanFactoryMock));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			doReturn(configurableListableBeanFactoryMock).when(target).getBeanFactory();
			doReturn(stringArray).when(configurableListableBeanFactoryMock).getBeanNamesForType(ServletWebServerFactory.class);
			//Act Statement(s)
			final ApplicationContextException result = assertThrows(ApplicationContextException.class, () -> {
				target.getWebServerFactory();
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
				stringUtils.verify(() -> StringUtils.arrayToCommaDelimitedString(stringArray), atLeast(1));
				verify(target).getBeanFactory();
				verify(configurableListableBeanFactoryMock).getBeanNamesForType(ServletWebServerFactory.class);
			});
		}
	}

	//Sapient generated method id: ${c6fad10d-f301-3937-9443-56f80d690bdc}, hash: 218ECB729A72E15804864BEE9A72F047
	@Disabled()
	@Test()
	void getWebServerFactoryWhenBeanNamesLengthNotGreaterThan1() throws IllegalStateException, BeansException {
		/* Branches:
		 * (beanNames.length == 0) : false
		 * (beanNames.length > 1) : false
		 */
		//Arrange Statement(s)
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
		ServletWebServerFactory servletWebServerFactoryMock = mock(ServletWebServerFactory.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = spy(new ServletWebServerApplicationContext(defaultListableBeanFactoryMock));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			String[] stringArray = new String[] { "return_of_getBeanNamesForTypeItem1" };
			doReturn(stringArray).when(configurableListableBeanFactoryMock).getBeanNamesForType(ServletWebServerFactory.class);
			doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2).when(target).getBeanFactory();
			doReturn(servletWebServerFactoryMock).when(configurableListableBeanFactoryMock2).getBean("return_of_getBeanNamesForTypeItem1", ServletWebServerFactory.class);
			//Act Statement(s)
			ServletWebServerFactory result = target.getWebServerFactory();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(servletWebServerFactoryMock));
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
				verify(target, times(2)).getBeanFactory();
				verify(configurableListableBeanFactoryMock).getBeanNamesForType(ServletWebServerFactory.class);
				verify(configurableListableBeanFactoryMock2).getBean("return_of_getBeanNamesForTypeItem1", ServletWebServerFactory.class);
			});
		}
	}

	//Sapient generated method id: ${9f46cc80-684f-3bba-ab60-9581152db3b6}, hash: E15056B7BDFCB40155632C17A0016967
	@Disabled()
	@Test()
	void getServletContextInitializerBeansTest() throws IllegalStateException {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.web.servlet.ServletContextInitializerBeans
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = spy(new ServletWebServerApplicationContext(defaultListableBeanFactoryMock));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			doReturn(configurableListableBeanFactoryMock).when(target).getBeanFactory();
			//Act Statement(s)
			Collection<ServletContextInitializer> result = target.getServletContextInitializerBeans();
			//Assert statement(s)
			//TODO: Please implement equals method in ServletContextInitializerBeans for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
				verify(target).getBeanFactory();
			});
		}
	}

	//Sapient generated method id: ${f16e2854-79d1-371c-bcdc-b3c5828ff5cd}, hash: 8282AD76490CDD5C9A9C937EE6944388
	@Disabled()
	@Test()
	void prepareWebApplicationContextWhenRootContextEqualsThisThrowsIllegalStateException() {
		/* Branches:
		 * (rootContext != null) : true
		 * (rootContext == this) : true
		 */
		//Arrange Statement(s)
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		ServletContext servletContextMock = mock(ServletContext.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new ServletWebServerApplicationContext(defaultListableBeanFactoryMock);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			doReturn(null).when(servletContextMock).getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.prepareWebApplicationContext(servletContextMock);
			});
			IllegalStateException illegalStateException = new IllegalStateException("Cannot initialize context because there is already a root application context present - check whether you have multiple ServletContextInitializers!");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
				verify(servletContextMock).getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
			});
		}
	}

	//Sapient generated method id: ${b3509ecd-8c04-3f37-baf6-2fd702706fa7}, hash: 53BDC4B54B2F03DA00890A46428AE977
	@Test()
	void prepareWebApplicationContextWhenRootContextNotEqualsThis() throws Error {
		/* Branches:
		 * (rootContext != null) : true
		 * (rootContext == this) : false
		 */
		//Arrange Statement(s)
		ServletContext servletContextMock = mock(ServletContext.class);
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Object object = new Object();
			doReturn(object).when(servletContextMock).getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new ServletWebServerApplicationContext(defaultListableBeanFactoryMock);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			target.prepareWebApplicationContext(servletContextMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(servletContextMock).getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${8134d42e-bd60-3819-9b08-49e866d758e3}, hash: F201FFEF6109000CF8912B86CC8CF1FE
	@Test()
	void prepareWebApplicationContextWhenLoggerIsInfoEnabled() throws Error {
		/* Branches:
		 * (rootContext != null) : false
		 * (logger.isDebugEnabled()) : true
		 * (logger.isInfoEnabled()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Method java.lang.System::currentTimeMillis has a unrepeatable behavior
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ServletContext servletContextMock = mock(ServletContext.class);
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(null).when(servletContextMock).getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
			doNothing().when(servletContextMock).log("Initializing Spring embedded WebApplicationContext");
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new ServletWebServerApplicationContext(defaultListableBeanFactoryMock);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setServletContext(servletContextMock);
			doNothing().when(servletContextMock).setAttribute("org.springframework.web.context.WebApplicationContext.ROOT", target);
			//Act Statement(s)
			target.prepareWebApplicationContext(servletContextMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(servletContextMock).getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
				verify(servletContextMock).log("Initializing Spring embedded WebApplicationContext");
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
				verify(servletContextMock).setAttribute("org.springframework.web.context.WebApplicationContext.ROOT", target);
			});
		}
	}

	//Sapient generated method id: ${31e8a18a-f143-3bd3-b78c-b33be081fc86}, hash: 2DE65995EE3643C8167ABAF667835917
	@Disabled()
	@Test()
	void prepareWebApplicationContextWhenCaughtRuntimeExceptionOrErrorThrowsThrowable() {
		/* Branches:
		 * (rootContext != null) : false
		 * (logger.isDebugEnabled()) : true
		 * (logger.isInfoEnabled()) : true
		 * (catch-exception (RuntimeException | Error)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Method java.lang.System::currentTimeMillis has a unrepeatable behavior
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ServletContext servletContextMock = mock(ServletContext.class);
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(null).when(servletContextMock).getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
			doNothing().when(servletContextMock).log("Initializing Spring embedded WebApplicationContext");
			Throwable throwable = new Throwable();
			doNothing().when(servletContextMock).setAttribute("org.springframework.web.context.WebApplicationContext.ROOT", throwable);
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new ServletWebServerApplicationContext(defaultListableBeanFactoryMock);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setServletContext(servletContextMock);
			doNothing().when(servletContextMock).setAttribute("org.springframework.web.context.WebApplicationContext.ROOT", target);
			//Act Statement(s)
			final Throwable result = assertThrows(Throwable.class, () -> {
				target.prepareWebApplicationContext(servletContextMock);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(throwable));
				verify(servletContextMock).getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");
				verify(servletContextMock).log("Initializing Spring embedded WebApplicationContext");
				verify(servletContextMock).setAttribute("org.springframework.web.context.WebApplicationContext.ROOT", throwable);
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
				verify(servletContextMock).setAttribute("org.springframework.web.context.WebApplicationContext.ROOT", target);
			});
		}
	}

	//Sapient generated method id: ${d4c69c12-695a-35b4-92fc-d710fd6dff90}, hash: 821CBAB12726C0A7F35C6B9C45E8C5CD
	@Test()
	void getResourceByPathWhenGetServletContextIsNull() {
		/* Branches:
		 * (getServletContext() == null) : true
		 */
		//Arrange Statement(s)
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new ServletWebServerApplicationContext(defaultListableBeanFactoryMock);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			target.setClassLoader(classLoader);
			target.setServletContext((ServletContext) null);
			//Act Statement(s)
			Resource result = target.getResourceByPath("path1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${50c60db8-1d04-3646-8392-57d4eb8b1d6e}, hash: 5FCE659C40DD568B92056EB151A9C92E
	@Test()
	void getResourceByPathWhenGetServletContextIsNotNull() {
		/* Branches:
		 * (getServletContext() == null) : false
		 */
		//Arrange Statement(s)
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		ServletContext servletContextMock = mock(ServletContext.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new ServletWebServerApplicationContext(defaultListableBeanFactoryMock);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setServletContext(servletContextMock);
			//Act Statement(s)
			Resource result = target.getResourceByPath("path1");
			ServletContextResource servletContextResource = new ServletContextResource(servletContextMock, "path1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(servletContextResource));
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
			});
		}
	}
}
