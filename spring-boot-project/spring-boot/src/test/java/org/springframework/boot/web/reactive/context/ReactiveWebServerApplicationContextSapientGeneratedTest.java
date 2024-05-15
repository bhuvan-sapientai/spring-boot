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

    //Sapient generated method id: ${refreshTest}, hash: 9535F4335BF882E3CD403EC824E89608
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
            target = new ReactiveWebServerApplicationContext(defaultListableBeanFactoryMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.refresh();
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${refreshWhenServerManagerIsNullThrowsRuntimeException}, hash: 485785CD802306246ED6CC9373D8ED68
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

    //Sapient generated method id: ${onRefreshWhenServerManagerIsNull}, hash: 95E6746E412506A438714CCD2353099D
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

    //Sapient generated method id: ${onRefreshWhenCaughtThrowableThrowsApplicationContextException}, hash: 90454D34A9C12CF3CE56DA67B89B1B88
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

    //Sapient generated method id: ${getWebServerFactoryBeanNameWhenBeanNamesLengthEquals0ThrowsMissingWebServerFactoryBeanException}, hash: 509BB14B0ACAD6A49E81AD2485C958F3
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

    //Sapient generated method id: ${getWebServerFactoryBeanNameWhenBeanNamesLengthGreaterThan1ThrowsApplicationContextException}, hash: E14B19F68A0120B7C096A86A6851B0FA
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

    //Sapient generated method id: ${getWebServerFactoryBeanNameWhenBeanNamesLengthNotGreaterThan1}, hash: BC48445DE73DE0EDBDB4F3C048B4C896
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

    //Sapient generated method id: ${getWebServerFactoryTest}, hash: C597E2AC7B09EA97092669E758F36092
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

    //Sapient generated method id: ${getHttpHandlerWhenBeanNamesLengthEquals0ThrowsApplicationContextException}, hash: BBB3086E11014BDA42085CD5236719A4
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

    //Sapient generated method id: ${getHttpHandlerWhenBeanNamesLengthGreaterThan1ThrowsApplicationContextException}, hash: 57769E61920A17F190FF3A079445474C
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

    //Sapient generated method id: ${getHttpHandlerWhenBeanNamesLengthNotGreaterThan1}, hash: 1D6EE04E11611E0B72D38DB352E2DB91
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

    //Sapient generated method id: ${doCloseWhenIsActive}, hash: 2E882B5F9DF42B34A8217FC3D879EEC1
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

    //Sapient generated method id: ${getWebServerWhenServerManagerIsNull}, hash: E66E65E8507EC4C5EF9745936D58F3E1
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
