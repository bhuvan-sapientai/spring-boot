package org.springframework.boot.web.reactive.context;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.http.server.reactive.HttpHandler;

import org.mockito.MockitoAnnotations;

import org.springframework.util.StringUtils;
import org.springframework.boot.web.reactive.server.ReactiveWebServerFactory;
import org.springframework.util.Assert;
import org.springframework.boot.web.context.MissingWebServerFactoryBeanException;

import org.mockito.stubbing.Answer;

import org.springframework.boot.availability.ReadinessState;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.web.context.WebServerGracefulShutdownLifecycle;
import org.springframework.core.metrics.StartupStep;
import org.springframework.context.ApplicationContextException;
import org.springframework.core.metrics.ApplicationStartup;

import org.mockito.MockedStatic;

import org.springframework.boot.web.server.WebServer;
import org.springframework.util.ObjectUtils;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
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

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ReactiveWebServerApplicationContextSapientGeneratedTest {

	private final WebServerManager serverManagerMock = mock(WebServerManager.class, "serverManager");

	private AutoCloseable autoCloseableMocks;

	@InjectMocks()
	private ReactiveWebServerApplicationContext target;

	@AfterEach()
	public void afterTest() throws Exception {
		if (autoCloseableMocks != null)
			autoCloseableMocks.close();
	}

	//Sapient generated method id: ${3ebd3d04-76b3-320f-b304-f0b6a8fe009f}
	@Disabled()
	@Test()
	void refreshTest() throws BeansException, IllegalStateException {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new ReactiveWebServerApplicationContext(defaultListableBeanFactoryMock);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			target.refresh();
			//Assert statement(s)
			assertAll("result", () -> _assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1)));
		}
	}

	//Sapient generated method id: ${7f1dfe7e-19f6-3244-9e16-3b8767fc2f6d}
	@Test()
	void refreshWhenServerManagerIsNullThrowsRuntimeException() throws BeansException, IllegalStateException {
		/* Branches:
		 * (catch-exception (RuntimeException)) : true
		 * (serverManager != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new ReactiveWebServerApplicationContext(defaultListableBeanFactoryMock);
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

	//Sapient generated method id: ${697448fd-acc7-3d71-9faa-785defd4b785}
	@Disabled()
	@Test()
	void onRefreshWhenServerManagerIsNull() throws Throwable {
		/* Branches:
		 * (serverManager == null) : true  #  inside createWebServer method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ApplicationStartup applicationStartupMock = mock(ApplicationStartup.class);
		StartupStep startupStepMock = mock(StartupStep.class);
		StartupStep startupStepMock2 = mock(StartupStep.class);
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		ReactiveWebServerFactory reactiveWebServerFactoryMock = mock(ReactiveWebServerFactory.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		BeanDefinition beanDefinitionMock = mock(BeanDefinition.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
		WebServer webServerMock = mock(WebServer.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock3 = mock(ConfigurableListableBeanFactory.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(startupStepMock).when(applicationStartupMock).start("spring.boot.webserver.create");
			doReturn(startupStepMock2).when(startupStepMock).tag("factory", "");
			doNothing().when(startupStepMock).end();
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = spy(new ReactiveWebServerApplicationContext(defaultListableBeanFactoryMock));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setApplicationStartup(applicationStartupMock);
			doReturn("return_of_getWebServerFactoryBeanName1").when(target).getWebServerFactoryBeanName();
			doReturn(reactiveWebServerFactoryMock).when(target).getWebServerFactory("return_of_getWebServerFactoryBeanName1");
			doReturn(beanDefinitionMock).when(configurableListableBeanFactoryMock).getBeanDefinition("return_of_getWebServerFactoryBeanName1");
			doReturn(false).when(beanDefinitionMock).isLazyInit();
			doNothing().when(configurableListableBeanFactoryMock2).registerSingleton(eq("webServerGracefulShutdown"), (WebServerGracefulShutdownLifecycle) any());
			doReturn(webServerMock).when(serverManagerMock).getWebServer();
			doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2, configurableListableBeanFactoryMock3).when(target).getBeanFactory();
			doNothing().when(configurableListableBeanFactoryMock3).registerSingleton(eq("webServerStartStop"), (WebServerStartStopLifecycle) any());
			//Act Statement(s)
			target.onRefresh();
			//Assert statement(s)
			assertAll("result", () -> {
				verify(applicationStartupMock).start("spring.boot.webserver.create");
				verify(startupStepMock).tag("factory", "");
				verify(startupStepMock).end();
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
				verify(target).getWebServerFactoryBeanName();
				verify(target).getWebServerFactory("return_of_getWebServerFactoryBeanName1");
				verify(target, times(3)).getBeanFactory();
				verify(configurableListableBeanFactoryMock).getBeanDefinition("return_of_getWebServerFactoryBeanName1");
				verify(beanDefinitionMock).isLazyInit();
				verify(configurableListableBeanFactoryMock2).registerSingleton(eq("webServerGracefulShutdown"), (WebServerGracefulShutdownLifecycle) any());
				verify(serverManagerMock).getWebServer();
				verify(configurableListableBeanFactoryMock3).registerSingleton(eq("webServerStartStop"), (WebServerStartStopLifecycle) any());
			});
		}
	}

	//Sapient generated method id: ${b6eb1e1b-60d9-35a1-be2b-93f6934cbb2a}
	@Disabled()
	@Test()
	void onRefreshWhenCaughtThrowableThrowsApplicationContextException() throws IllegalStateException, NoSuchBeanDefinitionException {
		/* Branches:
		 * (serverManager == null) : true  #  inside createWebServer method
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
		ReactiveWebServerFactory reactiveWebServerFactoryMock = mock(ReactiveWebServerFactory.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		BeanDefinition beanDefinitionMock = mock(BeanDefinition.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
		WebServer webServerMock = mock(WebServer.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock3 = mock(ConfigurableListableBeanFactory.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(startupStepMock).when(applicationStartupMock).start("spring.boot.webserver.create");
			doReturn(startupStepMock2).when(startupStepMock).tag("factory", "");
			doNothing().when(startupStepMock).end();
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = spy(new ReactiveWebServerApplicationContext(defaultListableBeanFactoryMock));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setApplicationStartup(applicationStartupMock);
			doReturn("return_of_getWebServerFactoryBeanName1").when(target).getWebServerFactoryBeanName();
			doReturn(reactiveWebServerFactoryMock).when(target).getWebServerFactory("return_of_getWebServerFactoryBeanName1");
			doReturn(beanDefinitionMock).when(configurableListableBeanFactoryMock).getBeanDefinition("return_of_getWebServerFactoryBeanName1");
			doReturn(false).when(beanDefinitionMock).isLazyInit();
			doNothing().when(configurableListableBeanFactoryMock2).registerSingleton(eq("webServerGracefulShutdown"), (WebServerGracefulShutdownLifecycle) any());
			doReturn(webServerMock).when(serverManagerMock).getWebServer();
			doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2, configurableListableBeanFactoryMock3).when(target).getBeanFactory();
			doNothing().when(configurableListableBeanFactoryMock3).registerSingleton(eq("webServerStartStop"), (WebServerStartStopLifecycle) any());
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
				verify(target).getWebServerFactoryBeanName();
				verify(target).getWebServerFactory("return_of_getWebServerFactoryBeanName1");
				verify(target, times(3)).getBeanFactory();
				verify(configurableListableBeanFactoryMock).getBeanDefinition("return_of_getWebServerFactoryBeanName1");
				verify(beanDefinitionMock).isLazyInit();
				verify(configurableListableBeanFactoryMock2).registerSingleton(eq("webServerGracefulShutdown"), (WebServerGracefulShutdownLifecycle) any());
				verify(serverManagerMock).getWebServer();
				verify(configurableListableBeanFactoryMock3).registerSingleton(eq("webServerStartStop"), (WebServerStartStopLifecycle) any());
			});
		}
	}

	//Sapient generated method id: ${bc6a0117-8be2-37f2-85d3-f2c0d7979749}
	@Disabled()
	@Test()
	void getWebServerFactoryBeanNameWhenBeanNamesLengthEquals0ThrowsMissingWebServerFactoryBeanException() throws IllegalStateException {
		/* Branches:
		 * (beanNames.length == 0) : true
		 */
		//Arrange Statement(s)
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = spy(new ReactiveWebServerApplicationContext(defaultListableBeanFactoryMock));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			doReturn(configurableListableBeanFactoryMock).when(target).getBeanFactory();
			String[] stringArray = new String[] {};
			doReturn(stringArray).when(configurableListableBeanFactoryMock).getBeanNamesForType(ReactiveWebServerFactory.class);
			//Act Statement(s)
			final MissingWebServerFactoryBeanException result = assertThrows(MissingWebServerFactoryBeanException.class, () -> {
				target.getWebServerFactoryBeanName();
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
				verify(target).getBeanFactory();
				verify(configurableListableBeanFactoryMock).getBeanNamesForType(ReactiveWebServerFactory.class);
			});
		}
	}

	//Sapient generated method id: ${5671b39c-452c-31bd-83d1-fd6395aa4c60}
	@Disabled()
	@Test()
	void getWebServerFactoryBeanNameWhenBeanNamesLengthGreaterThan1ThrowsApplicationContextException() throws IllegalStateException {
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
			target = spy(new ReactiveWebServerApplicationContext(defaultListableBeanFactoryMock));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			doReturn(configurableListableBeanFactoryMock).when(target).getBeanFactory();
			doReturn(stringArray).when(configurableListableBeanFactoryMock).getBeanNamesForType(ReactiveWebServerFactory.class);
			//Act Statement(s)
			final ApplicationContextException result = assertThrows(ApplicationContextException.class, () -> {
				target.getWebServerFactoryBeanName();
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
				stringUtils.verify(() -> StringUtils.arrayToCommaDelimitedString(stringArray), atLeast(1));
				verify(target).getBeanFactory();
				verify(configurableListableBeanFactoryMock).getBeanNamesForType(ReactiveWebServerFactory.class);
			});
		}
	}

	//Sapient generated method id: ${0ac9eec7-c852-3a7a-b79d-59553219861f}
	@Disabled()
	@Test()
	void getWebServerFactoryBeanNameWhenBeanNamesLengthNotGreaterThan1() throws IllegalStateException {
		/* Branches:
		 * (beanNames.length == 0) : false
		 * (beanNames.length > 1) : false
		 */
		//Arrange Statement(s)
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = spy(new ReactiveWebServerApplicationContext(defaultListableBeanFactoryMock));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			doReturn(configurableListableBeanFactoryMock).when(target).getBeanFactory();
			String[] stringArray = new String[] { "return_of_getBeanNamesForTypeItem1" };
			doReturn(stringArray).when(configurableListableBeanFactoryMock).getBeanNamesForType(ReactiveWebServerFactory.class);
			//Act Statement(s)
			String result = target.getWebServerFactoryBeanName();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_getBeanNamesForTypeItem1"));
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
				verify(target).getBeanFactory();
				verify(configurableListableBeanFactoryMock).getBeanNamesForType(ReactiveWebServerFactory.class);
			});
		}
	}

	//Sapient generated method id: ${20be9c68-426b-34b4-b825-2d92772dc2db}
	@Disabled()
	@Test()
	void getWebServerFactoryTest() throws IllegalStateException, BeansException {
		//Arrange Statement(s)
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		ReactiveWebServerFactory reactiveWebServerFactoryMock = mock(ReactiveWebServerFactory.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = spy(new ReactiveWebServerApplicationContext(defaultListableBeanFactoryMock));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			doReturn(configurableListableBeanFactoryMock).when(target).getBeanFactory();
			doReturn(reactiveWebServerFactoryMock).when(configurableListableBeanFactoryMock).getBean("factoryBeanName1", ReactiveWebServerFactory.class);
			//Act Statement(s)
			ReactiveWebServerFactory result = target.getWebServerFactory("factoryBeanName1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(reactiveWebServerFactoryMock));
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
				verify(target).getBeanFactory();
				verify(configurableListableBeanFactoryMock).getBean("factoryBeanName1", ReactiveWebServerFactory.class);
			});
		}
	}

	//Sapient generated method id: ${c2ab5970-374f-3886-a3be-e62d359d70c7}
	@Disabled()
	@Test()
	void getHttpHandlerWhenBeanNamesLengthEquals0ThrowsApplicationContextException() throws IllegalStateException {
		/* Branches:
		 * (beanNames.length == 0) : true
		 */
		//Arrange Statement(s)
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = spy(new ReactiveWebServerApplicationContext(defaultListableBeanFactoryMock));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			doReturn(configurableListableBeanFactoryMock).when(target).getBeanFactory();
			String[] stringArray = new String[] {};
			doReturn(stringArray).when(configurableListableBeanFactoryMock).getBeanNamesForType(HttpHandler.class);
			//Act Statement(s)
			final ApplicationContextException result = assertThrows(ApplicationContextException.class, () -> {
				target.getHttpHandler();
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
				verify(target).getBeanFactory();
				verify(configurableListableBeanFactoryMock).getBeanNamesForType(HttpHandler.class);
			});
		}
	}

	//Sapient generated method id: ${f407aaf3-7aef-35e1-922d-6e95ed5bfae5}
	@Disabled()
	@Test()
	void getHttpHandlerWhenBeanNamesLengthGreaterThan1ThrowsApplicationContextException() throws IllegalStateException {
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
			target = spy(new ReactiveWebServerApplicationContext(defaultListableBeanFactoryMock));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			doReturn(configurableListableBeanFactoryMock).when(target).getBeanFactory();
			doReturn(stringArray).when(configurableListableBeanFactoryMock).getBeanNamesForType(HttpHandler.class);
			//Act Statement(s)
			final ApplicationContextException result = assertThrows(ApplicationContextException.class, () -> {
				target.getHttpHandler();
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
				stringUtils.verify(() -> StringUtils.arrayToCommaDelimitedString(stringArray), atLeast(1));
				verify(target).getBeanFactory();
				verify(configurableListableBeanFactoryMock).getBeanNamesForType(HttpHandler.class);
			});
		}
	}

	//Sapient generated method id: ${5b386ce2-047b-39bd-95ec-35c889b0b4ad}
	@Disabled()
	@Test()
	void getHttpHandlerWhenBeanNamesLengthNotGreaterThan1() throws IllegalStateException, BeansException {
		/* Branches:
		 * (beanNames.length == 0) : false
		 * (beanNames.length > 1) : false
		 */
		//Arrange Statement(s)
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
		HttpHandler httpHandlerMock = mock(HttpHandler.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = spy(new ReactiveWebServerApplicationContext(defaultListableBeanFactoryMock));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			String[] stringArray = new String[] { "return_of_getBeanNamesForTypeItem1" };
			doReturn(stringArray).when(configurableListableBeanFactoryMock).getBeanNamesForType(HttpHandler.class);
			doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2).when(target).getBeanFactory();
			doReturn(httpHandlerMock).when(configurableListableBeanFactoryMock2).getBean("return_of_getBeanNamesForTypeItem1", HttpHandler.class);
			//Act Statement(s)
			HttpHandler result = target.getHttpHandler();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(httpHandlerMock));
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
				verify(target, times(2)).getBeanFactory();
				verify(configurableListableBeanFactoryMock).getBeanNamesForType(HttpHandler.class);
				verify(configurableListableBeanFactoryMock2).getBean("return_of_getBeanNamesForTypeItem1", HttpHandler.class);
			});
		}
	}

	//Sapient generated method id: ${4c8d68d0-2a01-365f-b3c8-c909a2998862}
	@Test()
	void doCloseWhenIsActive() {
		/* Branches:
		 * (isActive()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		try (MockedStatic<AvailabilityChangeEvent> availabilityChangeEvent = mockStatic(AvailabilityChangeEvent.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = spy(new ReactiveWebServerApplicationContext(defaultListableBeanFactoryMock));
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

	//Sapient generated method id: ${e3bd3801-391e-33bc-bc7b-d4a8e5d8f581}
	@Test()
	void getWebServerWhenServerManagerIsNull() {
		/* Branches:
		 * (serverManager != null) : false
		 */
		//Arrange Statement(s)
		DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new ReactiveWebServerApplicationContext(defaultListableBeanFactoryMock);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			WebServer result = target.getWebServer();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
			});
		}
	}
}
