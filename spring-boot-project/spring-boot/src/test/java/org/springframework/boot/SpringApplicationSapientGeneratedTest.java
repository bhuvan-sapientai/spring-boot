package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.core.io.ResourceLoader;
import org.mockito.MockitoAnnotations;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.util.Assert;
import java.util.HashSet;
import java.time.Duration;
import java.util.HashMap;
import java.util.ArrayList;
import org.springframework.core.env.ConfigurableEnvironment;
import org.mockito.stubbing.Answer;
import org.springframework.core.env.Environment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.core.metrics.ApplicationStartup;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.aot.AotDetector;
import org.springframework.core.io.support.SpringFactoriesLoader;
import java.util.List;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.core.env.PropertySource;
import org.springframework.util.function.ThrowingSupplier;
import org.springframework.context.support.GenericApplicationContext;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.springframework.context.ApplicationListener;
import org.springframework.util.function.ThrowingConsumer;
import java.util.LinkedHashSet;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import java.util.Properties;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.util.ClassUtils;
import org.springframework.boot.context.properties.source.ConfigurationPropertySources;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.apache.commons.logging.impl.NoOpLog;
import java.util.Set;
import org.springframework.core.GenericTypeResolver;
import java.util.Collection;
import org.mockito.MockedStatic;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.util.ObjectUtils;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
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
import static org.mockito.ArgumentMatchers.anySet;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringApplicationSapientGeneratedTest {

    private final ApplicationContextFactory applicationContextFactoryMock = mock(ApplicationContextFactory.class, "applicationContextFactory");

    private final ResourceLoader resourceLoaderMock = mock(ResourceLoader.class, "resourceLoader");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private SpringApplication target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${runWhenDependencyComparatorNotInstanceOfOrderComparatorAndContextNotIsRunning}, hash: B03314641F58E1B8435E13C32163F850
    @Test()
    void runWhenDependencyComparatorNotInstanceOfOrderComparatorAndContextNotIsRunning() throws Throwable, Exception {
        /* Branches:
         * (this.registerShutdownHook) : true
         * (hook != null) : false  #  inside getRunListeners method
         * (hookListener != null) : false  #  inside getRunListeners method
         * (this.environment != null) : false  #  inside getOrCreateEnvironment method
         * (environment == null) : false  #  inside getOrCreateEnvironment method
         * (environment != null) : true  #  inside getOrCreateEnvironment method
         * (!environment.containsProperty("spring.main.environment-prefix")) : false  #  inside prepareEnvironment method
         * (!this.isCustomEnvironment) : true  #  inside prepareEnvironment method
         * (environmentType == null) : false  #  inside deduceEnvironmentClass method
         * (environmentType == null) : false  #  inside deduceEnvironmentClass method
         * (this.bannerMode == Banner.Mode.OFF) : false  #  inside printBanner method
         * (this.resourceLoader != null) : false  #  inside printBanner method
         * (this.bannerMode == Mode.LOG) : false  #  inside printBanner method
         * (AotDetector.useGeneratedArtifacts()) : false  #  inside addAotGeneratedInitializerIfNecessary method
         * (this.logStartupInfo) : true  #  inside prepareContext method
         * (context.getParent() == null) : false  #  inside prepareContext method
         * (printedBanner != null) : true  #  inside prepareContext method
         * (beanFactory instanceof AbstractAutowireCapableBeanFactory autowireCapableBeanFactory) : false  #  inside prepareContext method
         * (this.lazyInitialization) : false  #  inside prepareContext method
         * (this.keepAlive) : false  #  inside prepareContext method
         * (!AotDetector.useGeneratedArtifacts()) : true  #  inside prepareContext method
         * (this.registerShutdownHook) : true  #  inside refreshContext method
         * (this.logStartupInfo) : true
         * (for-each(beanNames)) : false  #  inside callRunners method
         * (beanFactory instanceof DefaultListableBeanFactory defaultListableBeanFactory) : false  #  inside getOrderComparator method
         * (dependencyComparator instanceof OrderComparator orderComparator) : false  #  inside getOrderComparator method
         * (context.isRunning()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        SpringApplication.Startup springApplicationStartupMock = mock(SpringApplication.Startup.class);
        SpringFactoriesLoader springFactoriesLoaderMock4 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock = mock(SpringFactoriesLoader.ArgumentResolver.class);
        SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock2 = mock(SpringFactoriesLoader.ArgumentResolver.class);
        ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
        ApplicationContext applicationContextMock = mock(ApplicationContext.class);
        ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
        ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
            MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<SpringFactoriesLoader.ArgumentResolver> springFactoriesLoaderArgumentResolver = mockStatic(SpringFactoriesLoader.ArgumentResolver.class);
            MockedStatic<SpringApplication.Startup> springApplicationStartup = mockStatic(SpringApplication.Startup.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
            Duration duration = Duration.ofDays(0L);
            doReturn(duration).when(springApplicationStartupMock).started();
            Duration duration2 = Duration.ofDays(0L);
            doReturn(duration2).when(springApplicationStartupMock).timeTakenToStarted();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3).thenReturn(springFactoriesLoaderMock4);
            List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
            doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock4).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
            configurationPropertySources.when(() -> ConfigurationPropertySources.attach((Environment) any())).thenAnswer((Answer<Void>) invocation -> null);
            defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.state(false, "Environment prefix cannot be set via properties.")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty"))).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new SpringApplication((ResourceLoader) null, classArray));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target)).thenReturn(springFactoriesLoaderArgumentResolverMock2);
            String[] stringArray = new String[] {};
            doReturn(springFactoriesLoaderArgumentResolverMock).when(springFactoriesLoaderArgumentResolverMock2).and(String[].class, stringArray);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ConfigurableEnvironment configurableEnvironment = applicationContextFactoryMock.createEnvironment(WebApplicationType.NONE);
            doReturn(configurableEnvironment).when(applicationContextFactoryMock).createEnvironment(WebApplicationType.NONE);
            String[] stringArray2 = new String[] {};
            doNothing().when(target).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray2));
            doNothing().when(target).bindToSpringApplication((ConfigurableEnvironment) any());
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2).when(target).getClassLoader();
            doReturn(ConfigurableEnvironment.class).when(applicationContextFactoryMock).getEnvironmentType(WebApplicationType.NONE);
            doReturn(configurableApplicationContextMock).when(applicationContextFactoryMock).create(WebApplicationType.NONE);
            ApplicationStartup applicationStartup = ApplicationStartup.DEFAULT;
            doNothing().when(configurableApplicationContextMock).setApplicationStartup(applicationStartup);
            doNothing().when(configurableApplicationContextMock).setEnvironment((ConfigurableEnvironment) any());
            doReturn(applicationContextMock).when(configurableApplicationContextMock).getParent();
            doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
            doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springBootBanner"), (Banner) any());
            doNothing().when(configurableApplicationContextMock).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
            doNothing().when(configurableApplicationContextMock).refresh();
            doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2).when(configurableApplicationContextMock).getBeanFactory();
            String[] stringArray3 = new String[] {};
            doReturn(stringArray3).when(configurableListableBeanFactoryMock2).getBeanNamesForType(Runner.class);
            doReturn(false).when(configurableApplicationContextMock).isRunning();
            doNothing().when(target).postProcessApplicationContext(configurableApplicationContextMock);
            doNothing().when(target).applyInitializers(configurableApplicationContextMock);
            doNothing().when(target).logStartupInfo(false);
            doNothing().when(target).logStartupProfileInfo(configurableApplicationContextMock);
            Set<Object> objectSet = new HashSet<>();
            doReturn(objectSet).when(target).getAllSources();
            Object[] objectArray = new Object[] {};
            doNothing().when(target).load(configurableApplicationContextMock, objectArray);
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(target).getApplicationLog();
            //Act Statement(s)
            ConfigurableApplicationContext result = target.run(stringArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(configurableApplicationContextMock));
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(4));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                springApplicationStartup.verify(() -> SpringApplication.Startup.create(), atLeast(1));
                verify(springApplicationStartupMock, atLeast(1)).started();
                verify(springApplicationStartupMock, atLeast(1)).timeTakenToStarted();
                verify(springFactoriesLoaderMock4, atLeast(1)).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
                configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((Environment) any()), atLeast(2));
                defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any()), atLeast(1));
                _assert.verify(() -> Assert.state(false, "Environment prefix cannot be set via properties."), atLeast(1));
                _assert.verify(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty")), atLeast(1));
                springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target), atLeast(1));
                verify(springFactoriesLoaderArgumentResolverMock2, atLeast(1)).and(String[].class, stringArray);
                verify(target, times(2)).getClassLoader();
                verify(applicationContextFactoryMock, atLeast(1)).createEnvironment(WebApplicationType.NONE);
                verify(target, atLeast(1)).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray2));
                verify(target, atLeast(1)).bindToSpringApplication((ConfigurableEnvironment) any());
                verify(applicationContextFactoryMock, atLeast(1)).getEnvironmentType(WebApplicationType.NONE);
                verify(applicationContextFactoryMock, atLeast(1)).create(WebApplicationType.NONE);
                verify(configurableApplicationContextMock, atLeast(1)).setApplicationStartup(applicationStartup);
                verify(configurableApplicationContextMock, atLeast(1)).setEnvironment((ConfigurableEnvironment) any());
                verify(configurableApplicationContextMock, atLeast(1)).getParent();
                verify(configurableApplicationContextMock, atLeast(2)).getBeanFactory();
                verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
                verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springBootBanner"), (Banner) any());
                verify(configurableApplicationContextMock, atLeast(1)).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
                verify(configurableApplicationContextMock, atLeast(1)).refresh();
                verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);
                verify(configurableApplicationContextMock, atLeast(1)).isRunning();
                verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);
                verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);
                verify(target, atLeast(1)).logStartupInfo(false);
                verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);
                verify(target, atLeast(1)).getAllSources();
                verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);
                verify(target, atLeast(1)).getApplicationLog();
            });
        }
    }

    //Sapient generated method id: ${runWhenContextIsRunning}, hash: 2A24EF68758E742B6F42DB856367BE35
    @Test()
    void runWhenContextIsRunning() throws Throwable, Exception {
        //TODO: Please change the modifier of ready from private to default to isolate the test case scenario
        //Act Statement(s)
        //Assert statement(s)
        /* Branches:
         * (this.registerShutdownHook) : true
         * (hook != null) : false  #  inside getRunListeners method
         * (hookListener != null) : false  #  inside getRunListeners method
         * (this.environment != null) : false  #  inside getOrCreateEnvironment method
         * (environment == null) : false  #  inside getOrCreateEnvironment method
         * (environment != null) : true  #  inside getOrCreateEnvironment method
         * (!environment.containsProperty("spring.main.environment-prefix")) : true  #  inside prepareEnvironment method
         * (!this.isCustomEnvironment) : true  #  inside prepareEnvironment method
         * (environmentType == null) : true  #  inside deduceEnvironmentClass method
         * (this.applicationContextFactory != ApplicationContextFactory.DEFAULT) : true  #  inside deduceEnvironmentClass method
         * (environmentType == null) : true  #  inside deduceEnvironmentClass method
         * (this.bannerMode == Banner.Mode.OFF) : false  #  inside printBanner method
         * (this.resourceLoader != null) : true  #  inside printBanner method
         * (this.bannerMode == Mode.LOG) : false  #  inside printBanner method
         * (AotDetector.useGeneratedArtifacts()) : false  #  inside addAotGeneratedInitializerIfNecessary method
         * (this.logStartupInfo) : true  #  inside prepareContext method
         * (context.getParent() == null) : true  #  inside prepareContext method
         * (printedBanner != null) : true  #  inside prepareContext method
         * (beanFactory instanceof AbstractAutowireCapableBeanFactory autowireCapableBeanFactory) : false  #  inside prepareContext method
         * (this.lazyInitialization) : false  #  inside prepareContext method
         * (this.keepAlive) : false  #  inside prepareContext method
         * (!AotDetector.useGeneratedArtifacts()) : true  #  inside prepareContext method
         * (this.registerShutdownHook) : true  #  inside refreshContext method
         * (this.logStartupInfo) : true
         * (for-each(beanNames)) : true  #  inside callRunners method
         * (beanFactory instanceof DefaultListableBeanFactory defaultListableBeanFactory) : false  #  inside getOrderComparator method
         * (dependencyComparator instanceof OrderComparator orderComparator) : false  #  inside getOrderComparator method
         * (context.isRunning()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        //SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        //BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        //SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        //SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        //SpringApplication.Startup springApplicationStartupMock = mock(SpringApplication.Startup.class);
        //SpringFactoriesLoader springFactoriesLoaderMock4 = mock(SpringFactoriesLoader.class);
        //SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock = mock(SpringFactoriesLoader.ArgumentResolver.class);
        //SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock2 = mock(SpringFactoriesLoader.ArgumentResolver.class);
        //ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
        //ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
        //ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
        //Runner runnerMock = mock(Runner.class);
        //doReturn(null).when(applicationContextFactoryMock).getEnvironmentType(WebApplicationType.REACTIVE);
        //Class<?>[] classArray = new Class[] {};
        //_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
        //webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.REACTIVE);
        //List<Object> objectList = new ArrayList<>();
        //objectList.add(bootstrapRegistryInitializerMock);
        //doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
        //doNothing().when(bootstrapRegistryInitializerMock).initialize((BootstrapRegistry) any());
        //List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
        //doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
        //List<ApplicationListener<?>> anyList2 = new ArrayList<>();
        //doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
        //springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
        //Duration duration = Duration.ofDays(0L);
        //doReturn(duration).when(springApplicationStartupMock).started();
        //Duration duration2 = Duration.ofDays(0L);
        //doReturn(duration2).when(springApplicationStartupMock).timeTakenToStarted();
        //Duration duration3 = Duration.ofDays(0L);
        //doReturn(duration3).when(springApplicationStartupMock).ready();
        //springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3).thenReturn(springFactoriesLoaderMock4);
        //List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
        //doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock4).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
        //configurationPropertySources.when(() -> ConfigurationPropertySources.attach((Environment) any())).thenAnswer((Answer<Void>) invocation -> null);
        //defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
        //_assert.when(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty"))).thenAnswer((Answer<Void>) invocation -> null);
        //target = spy(new SpringApplication(resourceLoaderMock, classArray));
        //autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        //ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
        //ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
        //doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
        //springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target)).thenReturn(springFactoriesLoaderArgumentResolverMock2);
        //String[] stringArray = new String[] {};
        //doReturn(springFactoriesLoaderArgumentResolverMock).when(springFactoriesLoaderArgumentResolverMock2).and(String[].class, stringArray);
        //ClassLoader classLoader4 = ClassLoader.getPlatformClassLoader();
        //ConfigurableEnvironment configurableEnvironment = applicationContextFactoryMock.createEnvironment(WebApplicationType.REACTIVE);
        //doReturn(configurableEnvironment).when(applicationContextFactoryMock).createEnvironment(WebApplicationType.REACTIVE);
        //String[] stringArray2 = new String[] {};
        //doNothing().when(target).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray2));
        //doNothing().when(target).bindToSpringApplication((ConfigurableEnvironment) any());
        //ClassLoader classLoader5 = ClassLoader.getPlatformClassLoader();
        //doReturn(classLoader4, classLoader5).when(target).getClassLoader();
        //doReturn(configurableApplicationContextMock).when(applicationContextFactoryMock).create(WebApplicationType.REACTIVE);
        //ApplicationStartup applicationStartup = ApplicationStartup.DEFAULT;
        //doNothing().when(configurableApplicationContextMock).setApplicationStartup(applicationStartup);
        //doNothing().when(configurableApplicationContextMock).setEnvironment((ConfigurableEnvironment) any());
        //doReturn(null).when(configurableApplicationContextMock).getParent();
        //doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
        //doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springBootBanner"), (Banner) any());
        //doNothing().when(configurableApplicationContextMock).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
        //doNothing().when(configurableApplicationContextMock).refresh();
        //doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2).when(configurableApplicationContextMock).getBeanFactory();
        //String[] stringArray3 = new String[] { "return_of_getBeanNamesForTypeItem1" };
        //doReturn(stringArray3).when(configurableListableBeanFactoryMock2).getBeanNamesForType(Runner.class);
        //doReturn(runnerMock).when(configurableListableBeanFactoryMock2).getBean("return_of_getBeanNamesForTypeItem1", Runner.class);
        //doReturn(true).when(configurableApplicationContextMock).isRunning();
        //doNothing().when(target).postProcessApplicationContext(configurableApplicationContextMock);
        //doNothing().when(target).applyInitializers(configurableApplicationContextMock);
        //doNothing().when(target).logStartupInfo(true);
        //doNothing().when(target).logStartupProfileInfo(configurableApplicationContextMock);
        //Set<Object> objectSet = new HashSet<>();
        //doReturn(objectSet).when(target).getAllSources();
        //Object[] objectArray = new Object[] {};
        //doNothing().when(target).load(configurableApplicationContextMock, objectArray);
        //NoOpLog noOpLog = new NoOpLog();
        //doReturn(noOpLog).when(target).getApplicationLog();
        //ConfigurableApplicationContext result = target.run(stringArray);
        //assertAll("result", () -> {    assertThat(result, equalTo(configurableApplicationContextMock));    verify(applicationContextFactoryMock, times(2)).getEnvironmentType(WebApplicationType.REACTIVE);    _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));    webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));    springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(4));    verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);    verify(bootstrapRegistryInitializerMock, atLeast(1)).initialize((BootstrapRegistry) any());    verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);    verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);    springApplicationStartup.verify(() -> SpringApplication.Startup.create(), atLeast(1));    verify(springApplicationStartupMock, atLeast(1)).started();    verify(springApplicationStartupMock, atLeast(1)).timeTakenToStarted();    verify(springFactoriesLoaderMock4, atLeast(1)).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);    configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((Environment) any()), atLeast(2));    defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any()), atLeast(1));    _assert.verify(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty")), atLeast(1));    verify(resourceLoaderMock, times(3)).getClassLoader();    springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target), atLeast(1));    verify(springFactoriesLoaderArgumentResolverMock2, atLeast(1)).and(String[].class, stringArray);    verify(target, times(2)).getClassLoader();    verify(applicationContextFactoryMock, atLeast(1)).createEnvironment(WebApplicationType.REACTIVE);    verify(target, atLeast(1)).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray2));    verify(target, atLeast(1)).bindToSpringApplication((ConfigurableEnvironment) any());    verify(applicationContextFactoryMock, atLeast(1)).create(WebApplicationType.REACTIVE);    verify(configurableApplicationContextMock, atLeast(1)).setApplicationStartup(applicationStartup);    verify(configurableApplicationContextMock, atLeast(1)).setEnvironment((ConfigurableEnvironment) any());    verify(configurableApplicationContextMock, atLeast(1)).getParent();    verify(configurableApplicationContextMock, atLeast(2)).getBeanFactory();    verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());    verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springBootBanner"), (Banner) any());    verify(configurableApplicationContextMock, atLeast(1)).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());    verify(configurableApplicationContextMock, atLeast(1)).refresh();    verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);    verify(configurableListableBeanFactoryMock2, atLeast(1)).getBean("return_of_getBeanNamesForTypeItem1", Runner.class);    verify(configurableApplicationContextMock, atLeast(1)).isRunning();    verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);    verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);    verify(target, atLeast(1)).logStartupInfo(true);    verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);    verify(target, atLeast(1)).getAllSources();    verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);    verify(target, atLeast(1)).getApplicationLog();});
    }

    //Sapient generated method id: ${runWhenExceptionInstanceOfAbandonedRunExceptionThrowsSpringApplicationAbandonedRunException}, hash: ED22BECF7CAF6809BCB2E454D72A427F
    @Test()
    void runWhenExceptionInstanceOfAbandonedRunExceptionThrowsSpringApplicationAbandonedRunException() throws IllegalStateException, BeansException {
        /* Branches:
         * (this.registerShutdownHook) : true
         * (hook != null) : false  #  inside getRunListeners method
         * (hookListener != null) : false  #  inside getRunListeners method
         * (this.environment != null) : false  #  inside getOrCreateEnvironment method
         * (environment == null) : false  #  inside getOrCreateEnvironment method
         * (environment != null) : true  #  inside getOrCreateEnvironment method
         * (!environment.containsProperty("spring.main.environment-prefix")) : true  #  inside prepareEnvironment method
         * (!this.isCustomEnvironment) : true  #  inside prepareEnvironment method
         * (environmentType == null) : false  #  inside deduceEnvironmentClass method
         * (environmentType == null) : false  #  inside deduceEnvironmentClass method
         * (this.bannerMode == Banner.Mode.OFF) : false  #  inside printBanner method
         * (this.resourceLoader != null) : true  #  inside printBanner method
         * (this.bannerMode == Mode.LOG) : false  #  inside printBanner method
         * (AotDetector.useGeneratedArtifacts()) : false  #  inside addAotGeneratedInitializerIfNecessary method
         * (this.logStartupInfo) : true  #  inside prepareContext method
         * (context.getParent() == null) : true  #  inside prepareContext method
         * (printedBanner != null) : true  #  inside prepareContext method
         * (beanFactory instanceof AbstractAutowireCapableBeanFactory autowireCapableBeanFactory) : false  #  inside prepareContext method
         * (this.lazyInitialization) : false  #  inside prepareContext method
         * (this.keepAlive) : false  #  inside prepareContext method
         * (!AotDetector.useGeneratedArtifacts()) : true  #  inside prepareContext method
         * (this.registerShutdownHook) : true  #  inside refreshContext method
         * (this.logStartupInfo) : true
         * (for-each(beanNames)) : true  #  inside callRunners method
         * (beanFactory instanceof DefaultListableBeanFactory defaultListableBeanFactory) : false  #  inside getOrderComparator method
         * (dependencyComparator instanceof OrderComparator orderComparator) : false  #  inside getOrderComparator method
         * (catch-exception (Throwable)) : true
         * (exception instanceof AbandonedRunException abandonedRunException) : true  #  inside handleRunFailure method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        SpringApplication.Startup springApplicationStartupMock = mock(SpringApplication.Startup.class);
        SpringFactoriesLoader springFactoriesLoaderMock4 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock = mock(SpringFactoriesLoader.ArgumentResolver.class);
        SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock2 = mock(SpringFactoriesLoader.ArgumentResolver.class);
        ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
        ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
        ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
        Runner runnerMock = mock(Runner.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
            MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
            MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<SpringFactoriesLoader.ArgumentResolver> springFactoriesLoaderArgumentResolver = mockStatic(SpringFactoriesLoader.ArgumentResolver.class);
            MockedStatic<SpringApplication.Startup> springApplicationStartup = mockStatic(SpringApplication.Startup.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.REACTIVE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            doNothing().when(bootstrapRegistryInitializerMock).initialize((BootstrapRegistry) any());
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
            Duration duration = Duration.ofDays(0L);
            doReturn(duration).when(springApplicationStartupMock).started();
            Duration duration2 = Duration.ofDays(0L);
            doReturn(duration2).when(springApplicationStartupMock).timeTakenToStarted();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3).thenReturn(springFactoriesLoaderMock4);
            List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
            doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock4).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
            configurationPropertySources.when(() -> ConfigurationPropertySources.attach((Environment) any())).thenAnswer((Answer<Void>) invocation -> null);
            defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty"))).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new SpringApplication(resourceLoaderMock, classArray));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target)).thenReturn(springFactoriesLoaderArgumentResolverMock2);
            String[] stringArray = new String[] {};
            doReturn(springFactoriesLoaderArgumentResolverMock).when(springFactoriesLoaderArgumentResolverMock2).and(String[].class, stringArray);
            ClassLoader classLoader4 = ClassLoader.getPlatformClassLoader();
            ConfigurableEnvironment configurableEnvironment = applicationContextFactoryMock.createEnvironment(WebApplicationType.REACTIVE);
            doReturn(configurableEnvironment).when(applicationContextFactoryMock).createEnvironment(WebApplicationType.REACTIVE);
            String[] stringArray2 = new String[] {};
            doNothing().when(target).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray2));
            doNothing().when(target).bindToSpringApplication((ConfigurableEnvironment) any());
            ClassLoader classLoader5 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader4, classLoader5).when(target).getClassLoader();
            doReturn(ConfigurableEnvironment.class).when(applicationContextFactoryMock).getEnvironmentType(WebApplicationType.REACTIVE);
            doReturn(configurableApplicationContextMock).when(applicationContextFactoryMock).create(WebApplicationType.REACTIVE);
            ApplicationStartup applicationStartup = ApplicationStartup.DEFAULT;
            doNothing().when(configurableApplicationContextMock).setApplicationStartup(applicationStartup);
            doNothing().when(configurableApplicationContextMock).setEnvironment((ConfigurableEnvironment) any());
            doReturn(null).when(configurableApplicationContextMock).getParent();
            doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
            doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springBootBanner"), (Banner) any());
            doNothing().when(configurableApplicationContextMock).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
            doNothing().when(configurableApplicationContextMock).refresh();
            doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2).when(configurableApplicationContextMock).getBeanFactory();
            String[] stringArray3 = new String[] { "return_of_getBeanNamesForTypeItem1" };
            doReturn(stringArray3).when(configurableListableBeanFactoryMock2).getBeanNamesForType(Runner.class);
            doReturn(runnerMock).when(configurableListableBeanFactoryMock2).getBean("return_of_getBeanNamesForTypeItem1", Runner.class);
            doNothing().when(target).postProcessApplicationContext(configurableApplicationContextMock);
            doNothing().when(target).applyInitializers(configurableApplicationContextMock);
            doNothing().when(target).logStartupInfo(true);
            doNothing().when(target).logStartupProfileInfo(configurableApplicationContextMock);
            Set<Object> objectSet = new HashSet<>();
            doReturn(objectSet).when(target).getAllSources();
            Object[] objectArray = new Object[] {};
            doNothing().when(target).load(configurableApplicationContextMock, objectArray);
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(target).getApplicationLog();
            //Act Statement(s)
            final SpringApplication.AbandonedRunException result = assertThrows(SpringApplication.AbandonedRunException.class, () -> {
                target.run(stringArray);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(4));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(bootstrapRegistryInitializerMock, atLeast(1)).initialize((BootstrapRegistry) any());
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                springApplicationStartup.verify(() -> SpringApplication.Startup.create(), atLeast(1));
                verify(springApplicationStartupMock, atLeast(1)).started();
                verify(springApplicationStartupMock, atLeast(1)).timeTakenToStarted();
                verify(springFactoriesLoaderMock4, atLeast(1)).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
                configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((Environment) any()), atLeast(2));
                defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any()), atLeast(1));
                _assert.verify(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty")), atLeast(1));
                verify(resourceLoaderMock, times(3)).getClassLoader();
                springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target), atLeast(1));
                verify(springFactoriesLoaderArgumentResolverMock2, atLeast(1)).and(String[].class, stringArray);
                verify(target, times(2)).getClassLoader();
                verify(applicationContextFactoryMock, atLeast(1)).createEnvironment(WebApplicationType.REACTIVE);
                verify(target, atLeast(1)).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray2));
                verify(target, atLeast(1)).bindToSpringApplication((ConfigurableEnvironment) any());
                verify(applicationContextFactoryMock, atLeast(1)).getEnvironmentType(WebApplicationType.REACTIVE);
                verify(applicationContextFactoryMock, atLeast(1)).create(WebApplicationType.REACTIVE);
                verify(configurableApplicationContextMock, atLeast(1)).setApplicationStartup(applicationStartup);
                verify(configurableApplicationContextMock, atLeast(1)).setEnvironment((ConfigurableEnvironment) any());
                verify(configurableApplicationContextMock, atLeast(1)).getParent();
                verify(configurableApplicationContextMock, times(2)).getBeanFactory();
                verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
                verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springBootBanner"), (Banner) any());
                verify(configurableApplicationContextMock, atLeast(1)).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
                verify(configurableApplicationContextMock, atLeast(1)).refresh();
                verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);
                verify(configurableListableBeanFactoryMock2, atLeast(1)).getBean("return_of_getBeanNamesForTypeItem1", Runner.class);
                verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);
                verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);
                verify(target, atLeast(1)).logStartupInfo(true);
                verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);
                verify(target, atLeast(1)).getAllSources();
                verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);
                verify(target, atLeast(1)).getApplicationLog();
            });
        }
    }

    //Sapient generated method id: ${runWhenCaughtThrowableAndExceptionInstanceOfAbandonedRunExceptionThrowsSpringApplicationAbandonedRunException}, hash: F7B217400031803E3F62514F5EDD2D6D
    @Test()
    void runWhenCaughtThrowableAndExceptionInstanceOfAbandonedRunExceptionThrowsSpringApplicationAbandonedRunException() throws IllegalStateException, BeansException {
        //TODO: Please change the modifier of ready from private to default to isolate the test case scenario
        //Act Statement(s)
        //Assert statement(s)
        /* Branches:
         * (this.registerShutdownHook) : true
         * (hook != null) : false  #  inside getRunListeners method
         * (hookListener != null) : false  #  inside getRunListeners method
         * (this.environment != null) : false  #  inside getOrCreateEnvironment method
         * (environment == null) : false  #  inside getOrCreateEnvironment method
         * (environment != null) : true  #  inside getOrCreateEnvironment method
         * (!environment.containsProperty("spring.main.environment-prefix")) : true  #  inside prepareEnvironment method
         * (!this.isCustomEnvironment) : true  #  inside prepareEnvironment method
         * (environmentType == null) : false  #  inside deduceEnvironmentClass method
         * (environmentType == null) : false  #  inside deduceEnvironmentClass method
         * (this.bannerMode == Banner.Mode.OFF) : false  #  inside printBanner method
         * (this.resourceLoader != null) : true  #  inside printBanner method
         * (this.bannerMode == Mode.LOG) : false  #  inside printBanner method
         * (AotDetector.useGeneratedArtifacts()) : false  #  inside addAotGeneratedInitializerIfNecessary method
         * (this.logStartupInfo) : true  #  inside prepareContext method
         * (context.getParent() == null) : true  #  inside prepareContext method
         * (printedBanner != null) : true  #  inside prepareContext method
         * (beanFactory instanceof AbstractAutowireCapableBeanFactory autowireCapableBeanFactory) : false  #  inside prepareContext method
         * (this.lazyInitialization) : false  #  inside prepareContext method
         * (this.keepAlive) : false  #  inside prepareContext method
         * (!AotDetector.useGeneratedArtifacts()) : true  #  inside prepareContext method
         * (this.registerShutdownHook) : true  #  inside refreshContext method
         * (this.logStartupInfo) : true
         * (for-each(beanNames)) : true  #  inside callRunners method
         * (beanFactory instanceof DefaultListableBeanFactory defaultListableBeanFactory) : false  #  inside getOrderComparator method
         * (dependencyComparator instanceof OrderComparator orderComparator) : false  #  inside getOrderComparator method
         * (context.isRunning()) : true
         * (catch-exception (Throwable)) : true
         * (exception instanceof AbandonedRunException abandonedRunException) : true  #  inside handleRunFailure method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        //SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        //BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        //SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        //SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        //SpringApplication.Startup springApplicationStartupMock = mock(SpringApplication.Startup.class);
        //SpringFactoriesLoader springFactoriesLoaderMock4 = mock(SpringFactoriesLoader.class);
        //SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock = mock(SpringFactoriesLoader.ArgumentResolver.class);
        //SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock2 = mock(SpringFactoriesLoader.ArgumentResolver.class);
        //ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
        //ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
        //ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
        //Runner runnerMock = mock(Runner.class);
        //Class<?>[] classArray = new Class[] {};
        //_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
        //webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.SERVLET);
        //List<Object> objectList = new ArrayList<>();
        //objectList.add(bootstrapRegistryInitializerMock);
        //doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
        //doNothing().when(bootstrapRegistryInitializerMock).initialize((BootstrapRegistry) any());
        //List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
        //doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
        //List<ApplicationListener<?>> anyList2 = new ArrayList<>();
        //doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
        //springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
        //Duration duration = Duration.ofDays(0L);
        //doReturn(duration).when(springApplicationStartupMock).started();
        //Duration duration2 = Duration.ofDays(0L);
        //doReturn(duration2).when(springApplicationStartupMock).timeTakenToStarted();
        //Duration duration3 = Duration.ofDays(0L);
        //doReturn(duration3).when(springApplicationStartupMock).ready();
        //springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3).thenReturn(springFactoriesLoaderMock4);
        //List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
        //doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock4).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
        //configurationPropertySources.when(() -> ConfigurationPropertySources.attach((Environment) any())).thenAnswer((Answer<Void>) invocation -> null);
        //defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
        //_assert.when(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty"))).thenAnswer((Answer<Void>) invocation -> null);
        //target = spy(new SpringApplication(resourceLoaderMock, classArray));
        //autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        //ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
        //ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
        //doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
        //springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target)).thenReturn(springFactoriesLoaderArgumentResolverMock2);
        //String[] stringArray = new String[] {};
        //doReturn(springFactoriesLoaderArgumentResolverMock).when(springFactoriesLoaderArgumentResolverMock2).and(String[].class, stringArray);
        //ClassLoader classLoader4 = ClassLoader.getPlatformClassLoader();
        //ConfigurableEnvironment configurableEnvironment = applicationContextFactoryMock.createEnvironment(WebApplicationType.SERVLET);
        //doReturn(configurableEnvironment).when(applicationContextFactoryMock).createEnvironment(WebApplicationType.SERVLET);
        //String[] stringArray2 = new String[] {};
        //doNothing().when(target).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray2));
        //doNothing().when(target).bindToSpringApplication((ConfigurableEnvironment) any());
        //ClassLoader classLoader5 = ClassLoader.getPlatformClassLoader();
        //doReturn(classLoader4, classLoader5).when(target).getClassLoader();
        //doReturn(ConfigurableEnvironment.class).when(applicationContextFactoryMock).getEnvironmentType(WebApplicationType.SERVLET);
        //doReturn(configurableApplicationContextMock).when(applicationContextFactoryMock).create(WebApplicationType.SERVLET);
        //ApplicationStartup applicationStartup = ApplicationStartup.DEFAULT;
        //doNothing().when(configurableApplicationContextMock).setApplicationStartup(applicationStartup);
        //doNothing().when(configurableApplicationContextMock).setEnvironment((ConfigurableEnvironment) any());
        //doReturn(null).when(configurableApplicationContextMock).getParent();
        //doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
        //doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springBootBanner"), (Banner) any());
        //doNothing().when(configurableApplicationContextMock).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
        //doNothing().when(configurableApplicationContextMock).refresh();
        //doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2).when(configurableApplicationContextMock).getBeanFactory();
        //String[] stringArray3 = new String[] { "return_of_getBeanNamesForTypeItem1" };
        //doReturn(stringArray3).when(configurableListableBeanFactoryMock2).getBeanNamesForType(Runner.class);
        //doReturn(runnerMock).when(configurableListableBeanFactoryMock2).getBean("return_of_getBeanNamesForTypeItem1", Runner.class);
        //doReturn(true).when(configurableApplicationContextMock).isRunning();
        //doNothing().when(target).postProcessApplicationContext(configurableApplicationContextMock);
        //doNothing().when(target).applyInitializers(configurableApplicationContextMock);
        //doNothing().when(target).logStartupInfo(true);
        //doNothing().when(target).logStartupProfileInfo(configurableApplicationContextMock);
        //Set<Object> objectSet = new HashSet<>();
        //doReturn(objectSet).when(target).getAllSources();
        //Object[] objectArray = new Object[] {};
        //doNothing().when(target).load(configurableApplicationContextMock, objectArray);
        //NoOpLog noOpLog = new NoOpLog();
        //doReturn(noOpLog).when(target).getApplicationLog();
        //final SpringApplication.AbandonedRunException result = assertThrows(SpringApplication.AbandonedRunException.class, () -> {    target.run(stringArray);});
        //assertAll("result", () -> {    assertThat(result, is(notNullValue()));    _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));    webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));    springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(4));    verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);    verify(bootstrapRegistryInitializerMock, atLeast(1)).initialize((BootstrapRegistry) any());    verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);    verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);    springApplicationStartup.verify(() -> SpringApplication.Startup.create(), atLeast(1));    verify(springApplicationStartupMock, atLeast(1)).started();    verify(springApplicationStartupMock, atLeast(1)).timeTakenToStarted();    verify(springFactoriesLoaderMock4, atLeast(1)).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);    configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((Environment) any()), atLeast(2));    defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any()), atLeast(1));    _assert.verify(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty")), atLeast(1));    verify(resourceLoaderMock, times(3)).getClassLoader();    springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target), atLeast(1));    verify(springFactoriesLoaderArgumentResolverMock2, atLeast(1)).and(String[].class, stringArray);    verify(target, times(2)).getClassLoader();    verify(applicationContextFactoryMock, atLeast(1)).createEnvironment(WebApplicationType.SERVLET);    verify(target, atLeast(1)).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray2));    verify(target, atLeast(1)).bindToSpringApplication((ConfigurableEnvironment) any());    verify(applicationContextFactoryMock, atLeast(1)).getEnvironmentType(WebApplicationType.SERVLET);    verify(applicationContextFactoryMock, atLeast(1)).create(WebApplicationType.SERVLET);    verify(configurableApplicationContextMock, atLeast(1)).setApplicationStartup(applicationStartup);    verify(configurableApplicationContextMock, atLeast(1)).setEnvironment((ConfigurableEnvironment) any());    verify(configurableApplicationContextMock, atLeast(1)).getParent();    verify(configurableApplicationContextMock, times(2)).getBeanFactory();    verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());    verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springBootBanner"), (Banner) any());    verify(configurableApplicationContextMock, atLeast(1)).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());    verify(configurableApplicationContextMock, atLeast(1)).refresh();    verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);    verify(configurableListableBeanFactoryMock2, atLeast(1)).getBean("return_of_getBeanNamesForTypeItem1", Runner.class);    verify(configurableApplicationContextMock, atLeast(1)).isRunning();    verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);    verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);    verify(target, atLeast(1)).logStartupInfo(true);    verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);    verify(target, atLeast(1)).getAllSources();    verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);    verify(target, atLeast(1)).getApplicationLog();});
    }

    //Sapient generated method id: ${runWhenExceptionNotInstanceOfRuntimeExceptionThrowsIllegalStateException}, hash: 6CD7AD3935C2CE1F3AE84691193AC2D3
    @Test()
    void runWhenExceptionNotInstanceOfRuntimeExceptionThrowsIllegalStateException() throws IllegalStateException, BeansException {
        /* Branches:
         * (this.registerShutdownHook) : true
         * (hook != null) : false  #  inside getRunListeners method
         * (hookListener != null) : false  #  inside getRunListeners method
         * (this.environment != null) : false  #  inside getOrCreateEnvironment method
         * (environment == null) : false  #  inside getOrCreateEnvironment method
         * (environment != null) : true  #  inside getOrCreateEnvironment method
         * (!environment.containsProperty("spring.main.environment-prefix")) : true  #  inside prepareEnvironment method
         * (!this.isCustomEnvironment) : true  #  inside prepareEnvironment method
         * (environmentType == null) : false  #  inside deduceEnvironmentClass method
         * (environmentType == null) : false  #  inside deduceEnvironmentClass method
         * (this.bannerMode == Banner.Mode.OFF) : false  #  inside printBanner method
         * (this.resourceLoader != null) : true  #  inside printBanner method
         * (this.bannerMode == Mode.LOG) : false  #  inside printBanner method
         * (AotDetector.useGeneratedArtifacts()) : false  #  inside addAotGeneratedInitializerIfNecessary method
         * (this.logStartupInfo) : true  #  inside prepareContext method
         * (context.getParent() == null) : true  #  inside prepareContext method
         * (printedBanner != null) : true  #  inside prepareContext method
         * (beanFactory instanceof AbstractAutowireCapableBeanFactory autowireCapableBeanFactory) : false  #  inside prepareContext method
         * (this.lazyInitialization) : false  #  inside prepareContext method
         * (this.keepAlive) : false  #  inside prepareContext method
         * (!AotDetector.useGeneratedArtifacts()) : true  #  inside prepareContext method
         * (this.registerShutdownHook) : true  #  inside refreshContext method
         * (this.logStartupInfo) : true
         * (for-each(beanNames)) : true  #  inside callRunners method
         * (beanFactory instanceof DefaultListableBeanFactory defaultListableBeanFactory) : false  #  inside getOrderComparator method
         * (dependencyComparator instanceof OrderComparator orderComparator) : false  #  inside getOrderComparator method
         * (catch-exception (Throwable)) : true
         * (exception instanceof AbandonedRunException abandonedRunException) : false  #  inside handleRunFailure method
         * (context == null) : false  #  inside getExitCodeFromMappedException method
         * (!context.isActive()) : true  #  inside getExitCodeFromMappedException method
         * (exitCode == 0) : true  #  inside getExitCodeFromException method
         * (exception == null) : true  #  inside getExitCodeFromExitCodeGeneratorException method
         * (exitCode != 0) : false  #  inside handleExitCode method
         * (listeners != null) : true  #  inside handleRunFailure method
         * (for-each(exceptionReporters)) : true  #  inside reportFailure method
         * (reporter.reportException(failure)) : true  #  inside reportFailure method
         * (context != null) : true  #  inside handleRunFailure method
         * (exception instanceof RuntimeException runtimeException) : false  #  inside handleRunFailure method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        SpringApplication.Startup springApplicationStartupMock = mock(SpringApplication.Startup.class);
        SpringFactoriesLoader springFactoriesLoaderMock4 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock = mock(SpringFactoriesLoader.ArgumentResolver.class);
        SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock2 = mock(SpringFactoriesLoader.ArgumentResolver.class);
        ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
        ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
        ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
        Runner runnerMock = mock(Runner.class);
        SpringFactoriesLoader springFactoriesLoaderMock5 = mock(SpringFactoriesLoader.class);
        SpringBootExceptionReporter springBootExceptionReporterMock = mock(SpringBootExceptionReporter.class);
        SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock3 = mock(SpringFactoriesLoader.ArgumentResolver.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<SpringFactoriesLoader.ArgumentResolver> springFactoriesLoaderArgumentResolver = mockStatic(SpringFactoriesLoader.ArgumentResolver.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
            MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
            MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
            MockedStatic<SpringApplication.Startup> springApplicationStartup = mockStatic(SpringApplication.Startup.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            doNothing().when(bootstrapRegistryInitializerMock).initialize((BootstrapRegistry) any());
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
            Duration duration = Duration.ofDays(0L);
            doReturn(duration).when(springApplicationStartupMock).started();
            Duration duration2 = Duration.ofDays(0L);
            doReturn(duration2).when(springApplicationStartupMock).timeTakenToStarted();
            List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
            doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock4).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
            configurationPropertySources.when(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) null)).thenAnswer((Answer<Void>) invocation -> null);
            defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) null)).thenAnswer((Answer<Void>) invocation -> null);
            configurationPropertySources.when(() -> ConfigurationPropertySources.attach((Environment) any())).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty"))).thenAnswer((Answer<Void>) invocation -> null);
            springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(ConfigurableApplicationContext.class, configurableApplicationContextMock)).thenReturn(springFactoriesLoaderArgumentResolverMock2);
            ApplicationStartup applicationStartup = ApplicationStartup.DEFAULT;
            doNothing().when(configurableApplicationContextMock).setApplicationStartup(applicationStartup);
            doNothing().when(configurableApplicationContextMock).setEnvironment((ConfigurableEnvironment) any());
            doReturn(null).when(configurableApplicationContextMock).getParent();
            doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
            doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springBootBanner"), (Banner) any());
            doNothing().when(configurableApplicationContextMock).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
            doNothing().when(configurableApplicationContextMock).refresh();
            doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2).when(configurableApplicationContextMock).getBeanFactory();
            String[] stringArray = new String[] { "return_of_getBeanNamesForTypeItem1" };
            doReturn(stringArray).when(configurableListableBeanFactoryMock2).getBeanNamesForType(Runner.class);
            doReturn(runnerMock).when(configurableListableBeanFactoryMock2).getBean("return_of_getBeanNamesForTypeItem1", Runner.class);
            doReturn(false).when(configurableApplicationContextMock).isActive();
            doNothing().when(configurableApplicationContextMock).close();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3).thenReturn(springFactoriesLoaderMock4).thenReturn(springFactoriesLoaderMock5);
            List<SpringBootExceptionReporter> springBootExceptionReporterList = new ArrayList<>();
            springBootExceptionReporterList.add(springBootExceptionReporterMock);
            doReturn(springBootExceptionReporterList).when(springFactoriesLoaderMock5).load(SpringBootExceptionReporter.class, springFactoriesLoaderArgumentResolverMock2);
            doReturn(true).when(springBootExceptionReporterMock).reportException((Throwable) null);
            target = spy(new SpringApplication(resourceLoaderMock, classArray));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target)).thenReturn(springFactoriesLoaderArgumentResolverMock3);
            String[] stringArray2 = new String[] {};
            doReturn(springFactoriesLoaderArgumentResolverMock).when(springFactoriesLoaderArgumentResolverMock3).and(String[].class, stringArray2);
            ClassLoader classLoader4 = ClassLoader.getPlatformClassLoader();
            doReturn(null).when(applicationContextFactoryMock).createEnvironment(WebApplicationType.NONE);
            String[] stringArray3 = new String[] {};
            doNothing().when(target).configureEnvironment((ConfigurableEnvironment) null, stringArray3);
            doNothing().when(target).bindToSpringApplication((ConfigurableEnvironment) null);
            ClassLoader classLoader5 = ClassLoader.getPlatformClassLoader();
            doReturn(null).when(applicationContextFactoryMock).getEnvironmentType(WebApplicationType.NONE);
            doReturn(configurableApplicationContextMock).when(applicationContextFactoryMock).create(WebApplicationType.NONE);
            doNothing().when(target).postProcessApplicationContext(configurableApplicationContextMock);
            doNothing().when(target).applyInitializers(configurableApplicationContextMock);
            doNothing().when(target).logStartupInfo(true);
            doNothing().when(target).logStartupProfileInfo(configurableApplicationContextMock);
            Set<Object> objectSet = new HashSet<>();
            doReturn(objectSet).when(target).getAllSources();
            Object[] objectArray = new Object[] {};
            doNothing().when(target).load(configurableApplicationContextMock, objectArray);
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(target).getApplicationLog();
            ClassLoader classLoader6 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader4, classLoader5, classLoader6).when(target).getClassLoader();
            doNothing().when(target).registerLoggedException((Throwable) null);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.run(stringArray2);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(5));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(bootstrapRegistryInitializerMock, atLeast(1)).initialize((BootstrapRegistry) any());
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                springApplicationStartup.verify(() -> SpringApplication.Startup.create(), atLeast(1));
                verify(springApplicationStartupMock, atLeast(1)).started();
                verify(springApplicationStartupMock, atLeast(1)).timeTakenToStarted();
                verify(springFactoriesLoaderMock4, atLeast(1)).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
                configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) null), atLeast(1));
                defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) null), atLeast(1));
                configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((Environment) any()), atLeast(1));
                _assert.verify(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty")), atLeast(1));
                springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(ConfigurableApplicationContext.class, configurableApplicationContextMock), atLeast(1));
                verify(configurableApplicationContextMock, atLeast(1)).setApplicationStartup(applicationStartup);
                verify(configurableApplicationContextMock, atLeast(1)).setEnvironment((ConfigurableEnvironment) any());
                verify(configurableApplicationContextMock, atLeast(1)).getParent();
                verify(configurableApplicationContextMock, times(2)).getBeanFactory();
                verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
                verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springBootBanner"), (Banner) any());
                verify(configurableApplicationContextMock, atLeast(1)).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
                verify(configurableApplicationContextMock, atLeast(1)).refresh();
                verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);
                verify(configurableListableBeanFactoryMock2, atLeast(1)).getBean("return_of_getBeanNamesForTypeItem1", Runner.class);
                verify(configurableApplicationContextMock, atLeast(1)).isActive();
                verify(configurableApplicationContextMock, atLeast(1)).close();
                verify(springFactoriesLoaderMock5, atLeast(1)).load(SpringBootExceptionReporter.class, springFactoriesLoaderArgumentResolverMock2);
                verify(springBootExceptionReporterMock, atLeast(1)).reportException((Throwable) null);
                verify(resourceLoaderMock, times(3)).getClassLoader();
                springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target), atLeast(1));
                verify(springFactoriesLoaderArgumentResolverMock3, atLeast(1)).and(String[].class, stringArray2);
                verify(target, times(3)).getClassLoader();
                verify(applicationContextFactoryMock, atLeast(1)).createEnvironment(WebApplicationType.NONE);
                verify(target, atLeast(1)).configureEnvironment((ConfigurableEnvironment) null, stringArray3);
                verify(target, atLeast(1)).bindToSpringApplication((ConfigurableEnvironment) null);
                verify(applicationContextFactoryMock, atLeast(1)).getEnvironmentType(WebApplicationType.NONE);
                verify(applicationContextFactoryMock, atLeast(1)).create(WebApplicationType.NONE);
                verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);
                verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);
                verify(target, atLeast(1)).logStartupInfo(true);
                verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);
                verify(target, atLeast(1)).getAllSources();
                verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);
                verify(target, atLeast(1)).getApplicationLog();
                verify(target, atLeast(1)).registerLoggedException((Throwable) null);
            });
        }
    }

    //Sapient generated method id: ${runWhenExceptionInstanceOfRuntimeExceptionThrowsRuntimeException}, hash: EBB8829E68FA83DF42AABE06439E89F8
    @Test()
    void runWhenExceptionInstanceOfRuntimeExceptionThrowsRuntimeException() throws IllegalStateException, BeansException {
        /* Branches:
         * (this.registerShutdownHook) : true
         * (hook != null) : false  #  inside getRunListeners method
         * (hookListener != null) : false  #  inside getRunListeners method
         * (this.environment != null) : false  #  inside getOrCreateEnvironment method
         * (environment == null) : false  #  inside getOrCreateEnvironment method
         * (environment != null) : true  #  inside getOrCreateEnvironment method
         * (!environment.containsProperty("spring.main.environment-prefix")) : true  #  inside prepareEnvironment method
         * (!this.isCustomEnvironment) : true  #  inside prepareEnvironment method
         * (environmentType == null) : false  #  inside deduceEnvironmentClass method
         * (environmentType == null) : false  #  inside deduceEnvironmentClass method
         * (this.bannerMode == Banner.Mode.OFF) : false  #  inside printBanner method
         * (this.resourceLoader != null) : true  #  inside printBanner method
         * (this.bannerMode == Mode.LOG) : false  #  inside printBanner method
         * (AotDetector.useGeneratedArtifacts()) : false  #  inside addAotGeneratedInitializerIfNecessary method
         * (this.logStartupInfo) : true  #  inside prepareContext method
         * (context.getParent() == null) : true  #  inside prepareContext method
         * (printedBanner != null) : true  #  inside prepareContext method
         * (beanFactory instanceof AbstractAutowireCapableBeanFactory autowireCapableBeanFactory) : false  #  inside prepareContext method
         * (this.lazyInitialization) : false  #  inside prepareContext method
         * (this.keepAlive) : false  #  inside prepareContext method
         * (!AotDetector.useGeneratedArtifacts()) : true  #  inside prepareContext method
         * (this.registerShutdownHook) : true  #  inside refreshContext method
         * (this.logStartupInfo) : true
         * (for-each(beanNames)) : true  #  inside callRunners method
         * (beanFactory instanceof DefaultListableBeanFactory defaultListableBeanFactory) : false  #  inside getOrderComparator method
         * (dependencyComparator instanceof OrderComparator orderComparator) : false  #  inside getOrderComparator method
         * (catch-exception (Throwable)) : true
         * (exception instanceof AbandonedRunException abandonedRunException) : false  #  inside handleRunFailure method
         * (context == null) : false  #  inside getExitCodeFromMappedException method
         * (!context.isActive()) : false  #  inside getExitCodeFromMappedException method
         * (exitCode == 0) : false  #  inside getExitCodeFromException method
         * (exitCode != 0) : true  #  inside handleExitCode method
         * (context != null) : true  #  inside handleExitCode method
         * (handler != null) : true  #  inside handleExitCode method
         * (listeners != null) : true  #  inside handleRunFailure method
         * (for-each(exceptionReporters)) : false  #  inside reportFailure method
         * (logger.isErrorEnabled()) : false  #  inside reportFailure method
         * (context != null) : true  #  inside handleRunFailure method
         * (exception instanceof RuntimeException runtimeException) : true  #  inside handleRunFailure method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        SpringApplication.Startup springApplicationStartupMock = mock(SpringApplication.Startup.class);
        SpringFactoriesLoader springFactoriesLoaderMock4 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock = mock(SpringFactoriesLoader.ArgumentResolver.class);
        SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock2 = mock(SpringFactoriesLoader.ArgumentResolver.class);
        ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
        ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
        ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
        Runner runnerMock = mock(Runner.class);
        SpringFactoriesLoader springFactoriesLoaderMock5 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock3 = mock(SpringFactoriesLoader.ArgumentResolver.class);
        SpringBootExceptionHandler springBootExceptionHandlerMock = mock(SpringBootExceptionHandler.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<SpringFactoriesLoader.ArgumentResolver> springFactoriesLoaderArgumentResolver = mockStatic(SpringFactoriesLoader.ArgumentResolver.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
            MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
            MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
            MockedStatic<SpringApplication.Startup> springApplicationStartup = mockStatic(SpringApplication.Startup.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.SERVLET);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            doNothing().when(bootstrapRegistryInitializerMock).initialize((BootstrapRegistry) any());
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
            Duration duration = Duration.ofDays(0L);
            doReturn(duration).when(springApplicationStartupMock).started();
            Duration duration2 = Duration.ofDays(0L);
            doReturn(duration2).when(springApplicationStartupMock).timeTakenToStarted();
            List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
            doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock4).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
            configurationPropertySources.when(() -> ConfigurationPropertySources.attach((Environment) any())).thenAnswer((Answer<Void>) invocation -> null);
            defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty"))).thenAnswer((Answer<Void>) invocation -> null);
            springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(ConfigurableApplicationContext.class, configurableApplicationContextMock)).thenReturn(springFactoriesLoaderArgumentResolverMock2);
            ApplicationStartup applicationStartup = ApplicationStartup.DEFAULT;
            doNothing().when(configurableApplicationContextMock).setApplicationStartup(applicationStartup);
            doNothing().when(configurableApplicationContextMock).setEnvironment((ConfigurableEnvironment) any());
            doReturn(null).when(configurableApplicationContextMock).getParent();
            doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
            doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springBootBanner"), (Banner) any());
            doNothing().when(configurableApplicationContextMock).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
            doNothing().when(configurableApplicationContextMock).refresh();
            doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2).when(configurableApplicationContextMock).getBeanFactory();
            String[] stringArray = new String[] { "return_of_getBeanNamesForTypeItem1" };
            doReturn(stringArray).when(configurableListableBeanFactoryMock2).getBeanNamesForType(Runner.class);
            doReturn(runnerMock).when(configurableListableBeanFactoryMock2).getBean("return_of_getBeanNamesForTypeItem1", Runner.class);
            doReturn(true).when(configurableApplicationContextMock).isActive();
            Map<String, Object> stringObjectMap = new HashMap<>();
            doReturn(stringObjectMap).when(configurableApplicationContextMock).getBeansOfType(ExitCodeExceptionMapper.class);
            doNothing().when(configurableApplicationContextMock).publishEvent((ExitCodeEvent) any());
            doNothing().when(configurableApplicationContextMock).close();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3).thenReturn(springFactoriesLoaderMock4).thenReturn(springFactoriesLoaderMock5);
            List<SpringBootExceptionReporter> springBootExceptionReporterList = new ArrayList<>();
            doReturn(springBootExceptionReporterList).when(springFactoriesLoaderMock5).load(SpringBootExceptionReporter.class, springFactoriesLoaderArgumentResolverMock2);
            target = spy(new SpringApplication(resourceLoaderMock, classArray));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target)).thenReturn(springFactoriesLoaderArgumentResolverMock3);
            String[] stringArray2 = new String[] {};
            doReturn(springFactoriesLoaderArgumentResolverMock).when(springFactoriesLoaderArgumentResolverMock3).and(String[].class, stringArray2);
            ClassLoader classLoader4 = ClassLoader.getPlatformClassLoader();
            ConfigurableEnvironment configurableEnvironment = applicationContextFactoryMock.createEnvironment(WebApplicationType.SERVLET);
            doReturn(configurableEnvironment).when(applicationContextFactoryMock).createEnvironment(WebApplicationType.SERVLET);
            String[] stringArray3 = new String[] {};
            doNothing().when(target).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray3));
            doNothing().when(target).bindToSpringApplication((ConfigurableEnvironment) any());
            ClassLoader classLoader5 = ClassLoader.getPlatformClassLoader();
            doReturn(ConfigurableEnvironment.class).when(applicationContextFactoryMock).getEnvironmentType(WebApplicationType.SERVLET);
            doReturn(configurableApplicationContextMock).when(applicationContextFactoryMock).create(WebApplicationType.SERVLET);
            doNothing().when(target).postProcessApplicationContext(configurableApplicationContextMock);
            doNothing().when(target).applyInitializers(configurableApplicationContextMock);
            doNothing().when(target).logStartupInfo(true);
            doNothing().when(target).logStartupProfileInfo(configurableApplicationContextMock);
            Set<Object> objectSet = new HashSet<>();
            doReturn(objectSet).when(target).getAllSources();
            Object[] objectArray = new Object[] {};
            doNothing().when(target).load(configurableApplicationContextMock, objectArray);
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(target).getApplicationLog();
            doReturn(springBootExceptionHandlerMock).when(target).getSpringBootExceptionHandler();
            doNothing().when(springBootExceptionHandlerMock).registerExitCode(1);
            ClassLoader classLoader6 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader4, classLoader5, classLoader6).when(target).getClassLoader();
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                target.run(stringArray2);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(5));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(bootstrapRegistryInitializerMock, atLeast(1)).initialize((BootstrapRegistry) any());
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                springApplicationStartup.verify(() -> SpringApplication.Startup.create(), atLeast(1));
                verify(springApplicationStartupMock, atLeast(1)).started();
                verify(springApplicationStartupMock, atLeast(1)).timeTakenToStarted();
                verify(springFactoriesLoaderMock4, atLeast(1)).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
                configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((Environment) any()), atLeast(2));
                defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any()), atLeast(1));
                _assert.verify(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty")), atLeast(1));
                springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(ConfigurableApplicationContext.class, configurableApplicationContextMock), atLeast(1));
                verify(configurableApplicationContextMock, atLeast(1)).setApplicationStartup(applicationStartup);
                verify(configurableApplicationContextMock, atLeast(1)).setEnvironment((ConfigurableEnvironment) any());
                verify(configurableApplicationContextMock, atLeast(1)).getParent();
                verify(configurableApplicationContextMock, times(2)).getBeanFactory();
                verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
                verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springBootBanner"), (Banner) any());
                verify(configurableApplicationContextMock, atLeast(1)).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
                verify(configurableApplicationContextMock, atLeast(1)).refresh();
                verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);
                verify(configurableListableBeanFactoryMock2, atLeast(1)).getBean("return_of_getBeanNamesForTypeItem1", Runner.class);
                verify(configurableApplicationContextMock, atLeast(1)).isActive();
                verify(configurableApplicationContextMock, atLeast(1)).getBeansOfType(ExitCodeExceptionMapper.class);
                verify(configurableApplicationContextMock, atLeast(1)).publishEvent((ExitCodeEvent) any());
                verify(configurableApplicationContextMock, atLeast(1)).close();
                verify(springFactoriesLoaderMock5, atLeast(1)).load(SpringBootExceptionReporter.class, springFactoriesLoaderArgumentResolverMock2);
                verify(resourceLoaderMock, times(3)).getClassLoader();
                springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target), atLeast(1));
                verify(springFactoriesLoaderArgumentResolverMock3, atLeast(1)).and(String[].class, stringArray2);
                verify(target, times(3)).getClassLoader();
                verify(applicationContextFactoryMock, atLeast(1)).createEnvironment(WebApplicationType.SERVLET);
                verify(target, atLeast(1)).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray3));
                verify(target, atLeast(1)).bindToSpringApplication((ConfigurableEnvironment) any());
                verify(applicationContextFactoryMock, atLeast(1)).getEnvironmentType(WebApplicationType.SERVLET);
                verify(applicationContextFactoryMock, atLeast(1)).create(WebApplicationType.SERVLET);
                verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);
                verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);
                verify(target, atLeast(1)).logStartupInfo(true);
                verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);
                verify(target, atLeast(1)).getAllSources();
                verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);
                verify(target, atLeast(1)).getApplicationLog();
                verify(target, atLeast(1)).getSpringBootExceptionHandler();
                verify(springBootExceptionHandlerMock, atLeast(1)).registerExitCode(1);
            });
        }
    }

    //Sapient generated method id: ${runWhenReporterReportExceptionFailureAndContextIsNotNullAndExceptionNotInstanceOfRuntimeExceThrowsIllegalStateException}, hash: C0F51A929279C4CC7A81792052854451
    @Test()
    void runWhenReporterReportExceptionFailureAndContextIsNotNullAndExceptionNotInstanceOfRuntimeExceThrowsIllegalStateException() throws IllegalStateException, BeansException {
        //TODO: Please change the modifier of ready from private to default to isolate the test case scenario
        //Act Statement(s)
        //Assert statement(s)
        /* Branches:
         * (this.registerShutdownHook) : true
         * (hook != null) : false  #  inside getRunListeners method
         * (hookListener != null) : false  #  inside getRunListeners method
         * (this.environment != null) : false  #  inside getOrCreateEnvironment method
         * (environment == null) : false  #  inside getOrCreateEnvironment method
         * (environment != null) : true  #  inside getOrCreateEnvironment method
         * (!environment.containsProperty("spring.main.environment-prefix")) : true  #  inside prepareEnvironment method
         * (!this.isCustomEnvironment) : true  #  inside prepareEnvironment method
         * (environmentType == null) : false  #  inside deduceEnvironmentClass method
         * (environmentType == null) : false  #  inside deduceEnvironmentClass method
         * (this.bannerMode == Banner.Mode.OFF) : false  #  inside printBanner method
         * (this.resourceLoader != null) : true  #  inside printBanner method
         * (this.bannerMode == Mode.LOG) : false  #  inside printBanner method
         * (AotDetector.useGeneratedArtifacts()) : false  #  inside addAotGeneratedInitializerIfNecessary method
         * (this.logStartupInfo) : true  #  inside prepareContext method
         * (context.getParent() == null) : true  #  inside prepareContext method
         * (printedBanner != null) : true  #  inside prepareContext method
         * (beanFactory instanceof AbstractAutowireCapableBeanFactory autowireCapableBeanFactory) : false  #  inside prepareContext method
         * (this.lazyInitialization) : false  #  inside prepareContext method
         * (this.keepAlive) : false  #  inside prepareContext method
         * (!AotDetector.useGeneratedArtifacts()) : true  #  inside prepareContext method
         * (this.registerShutdownHook) : true  #  inside refreshContext method
         * (this.logStartupInfo) : true
         * (for-each(beanNames)) : true  #  inside callRunners method
         * (beanFactory instanceof DefaultListableBeanFactory defaultListableBeanFactory) : false  #  inside getOrderComparator method
         * (dependencyComparator instanceof OrderComparator orderComparator) : false  #  inside getOrderComparator method
         * (context.isRunning()) : true
         * (catch-exception (Throwable)) : true
         * (exception instanceof AbandonedRunException abandonedRunException) : false  #  inside handleRunFailure method
         * (context == null) : false  #  inside getExitCodeFromMappedException method
         * (!context.isActive()) : true  #  inside getExitCodeFromMappedException method
         * (exitCode == 0) : true  #  inside getExitCodeFromException method
         * (exception == null) : true  #  inside getExitCodeFromExitCodeGeneratorException method
         * (exitCode != 0) : false  #  inside handleExitCode method
         * (listeners != null) : false  #  inside handleRunFailure method
         * (for-each(exceptionReporters)) : true  #  inside reportFailure method
         * (reporter.reportException(failure)) : true  #  inside reportFailure method
         * (context != null) : true  #  inside handleRunFailure method
         * (exception instanceof RuntimeException runtimeException) : false  #  inside handleRunFailure method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        //SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        //BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        //SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        //SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        //SpringApplication.Startup springApplicationStartupMock = mock(SpringApplication.Startup.class);
        //SpringFactoriesLoader springFactoriesLoaderMock4 = mock(SpringFactoriesLoader.class);
        //SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock = mock(SpringFactoriesLoader.ArgumentResolver.class);
        //SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock2 = mock(SpringFactoriesLoader.ArgumentResolver.class);
        //ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
        //ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
        //ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
        //Runner runnerMock = mock(Runner.class);
        //SpringFactoriesLoader springFactoriesLoaderMock5 = mock(SpringFactoriesLoader.class);
        //SpringBootExceptionReporter springBootExceptionReporterMock = mock(SpringBootExceptionReporter.class);
        //SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock3 = mock(SpringFactoriesLoader.ArgumentResolver.class);
        //Class<?>[] classArray = new Class[] {};
        //_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
        //webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
        //List<Object> objectList = new ArrayList<>();
        //objectList.add(bootstrapRegistryInitializerMock);
        //doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
        //doNothing().when(bootstrapRegistryInitializerMock).initialize((BootstrapRegistry) any());
        //List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
        //doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
        //List<ApplicationListener<?>> anyList2 = new ArrayList<>();
        //doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
        //springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
        //Duration duration = Duration.ofDays(0L);
        //doReturn(duration).when(springApplicationStartupMock).started();
        //Duration duration2 = Duration.ofDays(0L);
        //doReturn(duration2).when(springApplicationStartupMock).timeTakenToStarted();
        //Duration duration3 = Duration.ofDays(0L);
        //doReturn(duration3).when(springApplicationStartupMock).ready();
        //List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
        //doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock4).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
        //configurationPropertySources.when(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) null)).thenAnswer((Answer<Void>) invocation -> null);
        //defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) null)).thenAnswer((Answer<Void>) invocation -> null);
        //configurationPropertySources.when(() -> ConfigurationPropertySources.attach((Environment) any())).thenAnswer((Answer<Void>) invocation -> null);
        //_assert.when(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty"))).thenAnswer((Answer<Void>) invocation -> null);
        //springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(ConfigurableApplicationContext.class, configurableApplicationContextMock)).thenReturn(springFactoriesLoaderArgumentResolverMock2);
        //ApplicationStartup applicationStartup = ApplicationStartup.DEFAULT;
        //doNothing().when(configurableApplicationContextMock).setApplicationStartup(applicationStartup);
        //doNothing().when(configurableApplicationContextMock).setEnvironment((ConfigurableEnvironment) any());
        //doReturn(null).when(configurableApplicationContextMock).getParent();
        //doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
        //doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springBootBanner"), (Banner) any());
        //doNothing().when(configurableApplicationContextMock).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
        //doNothing().when(configurableApplicationContextMock).refresh();
        //doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2).when(configurableApplicationContextMock).getBeanFactory();
        //String[] stringArray = new String[] { "return_of_getBeanNamesForTypeItem1" };
        //doReturn(stringArray).when(configurableListableBeanFactoryMock2).getBeanNamesForType(Runner.class);
        //doReturn(runnerMock).when(configurableListableBeanFactoryMock2).getBean("return_of_getBeanNamesForTypeItem1", Runner.class);
        //doReturn(true).when(configurableApplicationContextMock).isRunning();
        //doReturn(false).when(configurableApplicationContextMock).isActive();
        //doNothing().when(configurableApplicationContextMock).close();
        //springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3).thenReturn(springFactoriesLoaderMock4).thenReturn(springFactoriesLoaderMock5);
        //List<SpringBootExceptionReporter> springBootExceptionReporterList = new ArrayList<>();
        //springBootExceptionReporterList.add(springBootExceptionReporterMock);
        //doReturn(springBootExceptionReporterList).when(springFactoriesLoaderMock5).load(SpringBootExceptionReporter.class, springFactoriesLoaderArgumentResolverMock2);
        //doReturn(true).when(springBootExceptionReporterMock).reportException((Throwable) null);
        //target = spy(new SpringApplication(resourceLoaderMock, classArray));
        //autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        //ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
        //ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
        //doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
        //springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target)).thenReturn(springFactoriesLoaderArgumentResolverMock3);
        //String[] stringArray2 = new String[] {};
        //doReturn(springFactoriesLoaderArgumentResolverMock).when(springFactoriesLoaderArgumentResolverMock3).and(String[].class, stringArray2);
        //ClassLoader classLoader4 = ClassLoader.getPlatformClassLoader();
        //doReturn(null).when(applicationContextFactoryMock).createEnvironment(WebApplicationType.NONE);
        //String[] stringArray3 = new String[] {};
        //doNothing().when(target).configureEnvironment((ConfigurableEnvironment) null, stringArray3);
        //doNothing().when(target).bindToSpringApplication((ConfigurableEnvironment) null);
        //ClassLoader classLoader5 = ClassLoader.getPlatformClassLoader();
        //doReturn(null).when(applicationContextFactoryMock).getEnvironmentType(WebApplicationType.NONE);
        //doReturn(configurableApplicationContextMock).when(applicationContextFactoryMock).create(WebApplicationType.NONE);
        //doNothing().when(target).postProcessApplicationContext(configurableApplicationContextMock);
        //doNothing().when(target).applyInitializers(configurableApplicationContextMock);
        //doNothing().when(target).logStartupInfo(true);
        //doNothing().when(target).logStartupProfileInfo(configurableApplicationContextMock);
        //Set<Object> objectSet = new HashSet<>();
        //doReturn(objectSet).when(target).getAllSources();
        //Object[] objectArray = new Object[] {};
        //doNothing().when(target).load(configurableApplicationContextMock, objectArray);
        //NoOpLog noOpLog = new NoOpLog();
        //doReturn(noOpLog).when(target).getApplicationLog();
        //ClassLoader classLoader6 = ClassLoader.getPlatformClassLoader();
        //doReturn(classLoader4, classLoader5, classLoader6).when(target).getClassLoader();
        //doNothing().when(target).registerLoggedException((Throwable) null);
        //final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {    target.run(stringArray2);});
        //assertAll("result", () -> {    assertThat(result, is(notNullValue()));    _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));    webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));    springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(5));    verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);    verify(bootstrapRegistryInitializerMock, atLeast(1)).initialize((BootstrapRegistry) any());    verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);    verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);    springApplicationStartup.verify(() -> SpringApplication.Startup.create(), atLeast(1));    verify(springApplicationStartupMock, atLeast(1)).started();    verify(springApplicationStartupMock, atLeast(1)).timeTakenToStarted();    verify(springFactoriesLoaderMock4, atLeast(1)).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);    configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) null), atLeast(1));    defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) null), atLeast(1));    configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((Environment) any()), atLeast(1));    _assert.verify(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty")), atLeast(1));    springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(ConfigurableApplicationContext.class, configurableApplicationContextMock), atLeast(1));    verify(configurableApplicationContextMock, atLeast(1)).setApplicationStartup(applicationStartup);    verify(configurableApplicationContextMock, atLeast(1)).setEnvironment((ConfigurableEnvironment) any());    verify(configurableApplicationContextMock, atLeast(1)).getParent();    verify(configurableApplicationContextMock, times(2)).getBeanFactory();    verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());    verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springBootBanner"), (Banner) any());    verify(configurableApplicationContextMock, atLeast(1)).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());    verify(configurableApplicationContextMock, atLeast(1)).refresh();    verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);    verify(configurableListableBeanFactoryMock2, atLeast(1)).getBean("return_of_getBeanNamesForTypeItem1", Runner.class);    verify(configurableApplicationContextMock, atLeast(1)).isRunning();    verify(configurableApplicationContextMock, atLeast(1)).isActive();    verify(configurableApplicationContextMock, atLeast(1)).close();    verify(springFactoriesLoaderMock5, atLeast(1)).load(SpringBootExceptionReporter.class, springFactoriesLoaderArgumentResolverMock2);    verify(springBootExceptionReporterMock, atLeast(1)).reportException((Throwable) null);    verify(resourceLoaderMock, times(3)).getClassLoader();    springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target), atLeast(1));    verify(springFactoriesLoaderArgumentResolverMock3, atLeast(1)).and(String[].class, stringArray2);    verify(target, times(3)).getClassLoader();    verify(applicationContextFactoryMock, atLeast(1)).createEnvironment(WebApplicationType.NONE);    verify(target, atLeast(1)).configureEnvironment((ConfigurableEnvironment) null, stringArray3);    verify(target, atLeast(1)).bindToSpringApplication((ConfigurableEnvironment) null);    verify(applicationContextFactoryMock, atLeast(1)).getEnvironmentType(WebApplicationType.NONE);    verify(applicationContextFactoryMock, atLeast(1)).create(WebApplicationType.NONE);    verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);    verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);    verify(target, atLeast(1)).logStartupInfo(true);    verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);    verify(target, atLeast(1)).getAllSources();    verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);    verify(target, atLeast(1)).getApplicationLog();    verify(target, atLeast(1)).registerLoggedException((Throwable) null);});
    }

    //Sapient generated method id: ${runWhenLoggerNotIsErrorEnabledAndContextIsNotNullAndExceptionNotInstanceOfRuntimeExceptionThrowsIllegalStateException}, hash: BB92C9E73946FF845D50664F63461DAA
    @Test()
    void runWhenLoggerNotIsErrorEnabledAndContextIsNotNullAndExceptionNotInstanceOfRuntimeExceptionThrowsIllegalStateException() throws IllegalStateException, BeansException {
        /* Branches:
         * (this.registerShutdownHook) : true
         * (hook != null) : false  #  inside getRunListeners method
         * (hookListener != null) : false  #  inside getRunListeners method
         * (this.environment != null) : false  #  inside getOrCreateEnvironment method
         * (environment == null) : false  #  inside getOrCreateEnvironment method
         * (environment != null) : true  #  inside getOrCreateEnvironment method
         * (!environment.containsProperty("spring.main.environment-prefix")) : true  #  inside prepareEnvironment method
         * (!this.isCustomEnvironment) : true  #  inside prepareEnvironment method
         * (environmentType == null) : false  #  inside deduceEnvironmentClass method
         * (environmentType == null) : false  #  inside deduceEnvironmentClass method
         * (this.bannerMode == Banner.Mode.OFF) : false  #  inside printBanner method
         * (this.resourceLoader != null) : false  #  inside printBanner method
         * (this.bannerMode == Mode.LOG) : false  #  inside printBanner method
         * (AotDetector.useGeneratedArtifacts()) : false  #  inside addAotGeneratedInitializerIfNecessary method
         * (this.logStartupInfo) : true  #  inside prepareContext method
         * (context.getParent() == null) : false  #  inside prepareContext method
         * (printedBanner != null) : true  #  inside prepareContext method
         * (beanFactory instanceof AbstractAutowireCapableBeanFactory autowireCapableBeanFactory) : false  #  inside prepareContext method
         * (this.lazyInitialization) : false  #  inside prepareContext method
         * (this.keepAlive) : false  #  inside prepareContext method
         * (!AotDetector.useGeneratedArtifacts()) : true  #  inside prepareContext method
         * (this.registerShutdownHook) : true  #  inside refreshContext method
         * (this.logStartupInfo) : true
         * (for-each(beanNames)) : false  #  inside callRunners method
         * (beanFactory instanceof DefaultListableBeanFactory defaultListableBeanFactory) : false  #  inside getOrderComparator method
         * (dependencyComparator instanceof OrderComparator orderComparator) : false  #  inside getOrderComparator method
         * (catch-exception (Throwable)) : true
         * (exception instanceof AbandonedRunException abandonedRunException) : false  #  inside handleRunFailure method
         * (context == null) : false  #  inside getExitCodeFromMappedException method
         * (!context.isActive()) : false  #  inside getExitCodeFromMappedException method
         * (exitCode == 0) : false  #  inside getExitCodeFromException method
         * (exitCode != 0) : true  #  inside handleExitCode method
         * (context != null) : true  #  inside handleExitCode method
         * (handler != null) : false  #  inside handleExitCode method
         * (listeners != null) : true  #  inside handleRunFailure method
         * (for-each(exceptionReporters)) : false  #  inside reportFailure method
         * (logger.isErrorEnabled()) : false  #  inside reportFailure method
         * (context != null) : true  #  inside handleRunFailure method
         * (exception instanceof RuntimeException runtimeException) : false  #  inside handleRunFailure method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        SpringApplication.Startup springApplicationStartupMock = mock(SpringApplication.Startup.class);
        SpringFactoriesLoader springFactoriesLoaderMock4 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock = mock(SpringFactoriesLoader.ArgumentResolver.class);
        SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock2 = mock(SpringFactoriesLoader.ArgumentResolver.class);
        ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
        ApplicationContext applicationContextMock = mock(ApplicationContext.class);
        ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
        ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
        SpringFactoriesLoader springFactoriesLoaderMock5 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock3 = mock(SpringFactoriesLoader.ArgumentResolver.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<SpringFactoriesLoader.ArgumentResolver> springFactoriesLoaderArgumentResolver = mockStatic(SpringFactoriesLoader.ArgumentResolver.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
            MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
            MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
            MockedStatic<SpringApplication.Startup> springApplicationStartup = mockStatic(SpringApplication.Startup.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.REACTIVE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            doNothing().when(bootstrapRegistryInitializerMock).initialize((BootstrapRegistry) any());
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
            Duration duration = Duration.ofDays(0L);
            doReturn(duration).when(springApplicationStartupMock).started();
            Duration duration2 = Duration.ofDays(0L);
            doReturn(duration2).when(springApplicationStartupMock).timeTakenToStarted();
            List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
            doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock4).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
            configurationPropertySources.when(() -> ConfigurationPropertySources.attach((Environment) any())).thenAnswer((Answer<Void>) invocation -> null);
            defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty"))).thenAnswer((Answer<Void>) invocation -> null);
            springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(ConfigurableApplicationContext.class, configurableApplicationContextMock)).thenReturn(springFactoriesLoaderArgumentResolverMock2);
            ApplicationStartup applicationStartup = ApplicationStartup.DEFAULT;
            doNothing().when(configurableApplicationContextMock).setApplicationStartup(applicationStartup);
            doNothing().when(configurableApplicationContextMock).setEnvironment((ConfigurableEnvironment) any());
            doReturn(applicationContextMock).when(configurableApplicationContextMock).getParent();
            doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
            doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springBootBanner"), (Banner) any());
            doNothing().when(configurableApplicationContextMock).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
            doNothing().when(configurableApplicationContextMock).refresh();
            doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2).when(configurableApplicationContextMock).getBeanFactory();
            String[] stringArray = new String[] {};
            doReturn(stringArray).when(configurableListableBeanFactoryMock2).getBeanNamesForType(Runner.class);
            doReturn(true).when(configurableApplicationContextMock).isActive();
            Map<String, Object> stringObjectMap = new HashMap<>();
            doReturn(stringObjectMap).when(configurableApplicationContextMock).getBeansOfType(ExitCodeExceptionMapper.class);
            doNothing().when(configurableApplicationContextMock).publishEvent((ExitCodeEvent) any());
            doNothing().when(configurableApplicationContextMock).close();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3).thenReturn(springFactoriesLoaderMock4).thenReturn(springFactoriesLoaderMock5);
            List<SpringBootExceptionReporter> springBootExceptionReporterList = new ArrayList<>();
            doReturn(springBootExceptionReporterList).when(springFactoriesLoaderMock5).load(SpringBootExceptionReporter.class, springFactoriesLoaderArgumentResolverMock2);
            target = spy(new SpringApplication((ResourceLoader) null, classArray));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target)).thenReturn(springFactoriesLoaderArgumentResolverMock3);
            String[] stringArray2 = new String[] {};
            doReturn(springFactoriesLoaderArgumentResolverMock).when(springFactoriesLoaderArgumentResolverMock3).and(String[].class, stringArray2);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ConfigurableEnvironment configurableEnvironment = applicationContextFactoryMock.createEnvironment(WebApplicationType.REACTIVE);
            doReturn(configurableEnvironment).when(applicationContextFactoryMock).createEnvironment(WebApplicationType.REACTIVE);
            String[] stringArray3 = new String[] {};
            doNothing().when(target).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray3));
            doNothing().when(target).bindToSpringApplication((ConfigurableEnvironment) any());
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            doReturn(ConfigurableEnvironment.class).when(applicationContextFactoryMock).getEnvironmentType(WebApplicationType.REACTIVE);
            doReturn(configurableApplicationContextMock).when(applicationContextFactoryMock).create(WebApplicationType.REACTIVE);
            doNothing().when(target).postProcessApplicationContext(configurableApplicationContextMock);
            doNothing().when(target).applyInitializers(configurableApplicationContextMock);
            doNothing().when(target).logStartupInfo(false);
            doNothing().when(target).logStartupProfileInfo(configurableApplicationContextMock);
            Set<Object> objectSet = new HashSet<>();
            doReturn(objectSet).when(target).getAllSources();
            Object[] objectArray = new Object[] {};
            doNothing().when(target).load(configurableApplicationContextMock, objectArray);
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(target).getApplicationLog();
            doReturn(null).when(target).getSpringBootExceptionHandler();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(target).getClassLoader();
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.run(stringArray2);
            });
            Throwable throwable = new Throwable();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getCause(), is(instanceOf(throwable.getClass())));
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(5));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(bootstrapRegistryInitializerMock, atLeast(1)).initialize((BootstrapRegistry) any());
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                springApplicationStartup.verify(() -> SpringApplication.Startup.create(), atLeast(1));
                verify(springApplicationStartupMock, atLeast(1)).started();
                verify(springApplicationStartupMock, atLeast(1)).timeTakenToStarted();
                verify(springFactoriesLoaderMock4, atLeast(1)).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
                configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((Environment) any()), atLeast(2));
                defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any()), atLeast(1));
                _assert.verify(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty")), atLeast(1));
                springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(ConfigurableApplicationContext.class, configurableApplicationContextMock), atLeast(1));
                verify(configurableApplicationContextMock, atLeast(1)).setApplicationStartup(applicationStartup);
                verify(configurableApplicationContextMock, atLeast(1)).setEnvironment((ConfigurableEnvironment) any());
                verify(configurableApplicationContextMock, atLeast(1)).getParent();
                verify(configurableApplicationContextMock, times(2)).getBeanFactory();
                verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
                verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springBootBanner"), (Banner) any());
                verify(configurableApplicationContextMock, atLeast(1)).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
                verify(configurableApplicationContextMock, atLeast(1)).refresh();
                verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);
                verify(configurableApplicationContextMock, atLeast(1)).isActive();
                verify(configurableApplicationContextMock, atLeast(1)).getBeansOfType(ExitCodeExceptionMapper.class);
                verify(configurableApplicationContextMock, atLeast(1)).publishEvent((ExitCodeEvent) any());
                verify(configurableApplicationContextMock, atLeast(1)).close();
                verify(springFactoriesLoaderMock5, atLeast(1)).load(SpringBootExceptionReporter.class, springFactoriesLoaderArgumentResolverMock2);
                springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target), atLeast(1));
                verify(springFactoriesLoaderArgumentResolverMock3, atLeast(1)).and(String[].class, stringArray2);
                verify(target, times(3)).getClassLoader();
                verify(applicationContextFactoryMock, atLeast(1)).createEnvironment(WebApplicationType.REACTIVE);
                verify(target, atLeast(1)).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray3));
                verify(target, atLeast(1)).bindToSpringApplication((ConfigurableEnvironment) any());
                verify(applicationContextFactoryMock, atLeast(1)).getEnvironmentType(WebApplicationType.REACTIVE);
                verify(applicationContextFactoryMock, atLeast(1)).create(WebApplicationType.REACTIVE);
                verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);
                verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);
                verify(target, atLeast(1)).logStartupInfo(false);
                verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);
                verify(target, atLeast(1)).getAllSources();
                verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);
                verify(target, atLeast(1)).getApplicationLog();
                verify(target, atLeast(1)).getSpringBootExceptionHandler();
            });
        }
    }

    //Sapient generated method id: ${runWhenContextIsNotNullAndExceptionInstanceOfRuntimeExceptionThrowsRuntimeException}, hash: BA712F12E547A7BC77772073815A9002
    @Test()
    void runWhenContextIsNotNullAndExceptionInstanceOfRuntimeExceptionThrowsRuntimeException() throws IllegalStateException, BeansException {
        //TODO: Please change the modifier of ready from private to default to isolate the test case scenario
        //Act Statement(s)
        //Assert statement(s)
        /* Branches:
         * (this.registerShutdownHook) : true
         * (hook != null) : false  #  inside getRunListeners method
         * (hookListener != null) : false  #  inside getRunListeners method
         * (this.environment != null) : false  #  inside getOrCreateEnvironment method
         * (environment == null) : false  #  inside getOrCreateEnvironment method
         * (environment != null) : true  #  inside getOrCreateEnvironment method
         * (!environment.containsProperty("spring.main.environment-prefix")) : true  #  inside prepareEnvironment method
         * (!this.isCustomEnvironment) : true  #  inside prepareEnvironment method
         * (environmentType == null) : false  #  inside deduceEnvironmentClass method
         * (environmentType == null) : false  #  inside deduceEnvironmentClass method
         * (this.bannerMode == Banner.Mode.OFF) : false  #  inside printBanner method
         * (this.resourceLoader != null) : true  #  inside printBanner method
         * (this.bannerMode == Mode.LOG) : false  #  inside printBanner method
         * (AotDetector.useGeneratedArtifacts()) : false  #  inside addAotGeneratedInitializerIfNecessary method
         * (this.logStartupInfo) : true  #  inside prepareContext method
         * (context.getParent() == null) : true  #  inside prepareContext method
         * (printedBanner != null) : true  #  inside prepareContext method
         * (beanFactory instanceof AbstractAutowireCapableBeanFactory autowireCapableBeanFactory) : false  #  inside prepareContext method
         * (this.lazyInitialization) : false  #  inside prepareContext method
         * (this.keepAlive) : false  #  inside prepareContext method
         * (!AotDetector.useGeneratedArtifacts()) : true  #  inside prepareContext method
         * (this.registerShutdownHook) : true  #  inside refreshContext method
         * (this.logStartupInfo) : true
         * (for-each(beanNames)) : true  #  inside callRunners method
         * (beanFactory instanceof DefaultListableBeanFactory defaultListableBeanFactory) : false  #  inside getOrderComparator method
         * (dependencyComparator instanceof OrderComparator orderComparator) : false  #  inside getOrderComparator method
         * (context.isRunning()) : true
         * (catch-exception (Throwable)) : true
         * (exception instanceof AbandonedRunException abandonedRunException) : false  #  inside handleRunFailure method
         * (context == null) : false  #  inside getExitCodeFromMappedException method
         * (!context.isActive()) : false  #  inside getExitCodeFromMappedException method
         * (exitCode == 0) : false  #  inside getExitCodeFromException method
         * (exitCode != 0) : true  #  inside handleExitCode method
         * (context != null) : true  #  inside handleExitCode method
         * (handler != null) : true  #  inside handleExitCode method
         * (listeners != null) : false  #  inside handleRunFailure method
         * (for-each(exceptionReporters)) : false  #  inside reportFailure method
         * (logger.isErrorEnabled()) : false  #  inside reportFailure method
         * (context != null) : true  #  inside handleRunFailure method
         * (exception instanceof RuntimeException runtimeException) : true  #  inside handleRunFailure method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        //SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        //BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        //SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        //SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        //SpringApplication.Startup springApplicationStartupMock = mock(SpringApplication.Startup.class);
        //SpringFactoriesLoader springFactoriesLoaderMock4 = mock(SpringFactoriesLoader.class);
        //SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock = mock(SpringFactoriesLoader.ArgumentResolver.class);
        //SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock2 = mock(SpringFactoriesLoader.ArgumentResolver.class);
        //ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
        //ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
        //ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
        //Runner runnerMock = mock(Runner.class);
        //SpringFactoriesLoader springFactoriesLoaderMock5 = mock(SpringFactoriesLoader.class);
        //SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock3 = mock(SpringFactoriesLoader.ArgumentResolver.class);
        //SpringBootExceptionHandler springBootExceptionHandlerMock = mock(SpringBootExceptionHandler.class);
        //Class<?>[] classArray = new Class[] {};
        //_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
        //webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.SERVLET);
        //List<Object> objectList = new ArrayList<>();
        //objectList.add(bootstrapRegistryInitializerMock);
        //doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
        //doNothing().when(bootstrapRegistryInitializerMock).initialize((BootstrapRegistry) any());
        //List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
        //doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
        //List<ApplicationListener<?>> anyList2 = new ArrayList<>();
        //doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
        //springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
        //Duration duration = Duration.ofDays(0L);
        //doReturn(duration).when(springApplicationStartupMock).started();
        //Duration duration2 = Duration.ofDays(0L);
        //doReturn(duration2).when(springApplicationStartupMock).timeTakenToStarted();
        //Duration duration3 = Duration.ofDays(0L);
        //doReturn(duration3).when(springApplicationStartupMock).ready();
        //List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
        //doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock4).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
        //configurationPropertySources.when(() -> ConfigurationPropertySources.attach((Environment) any())).thenAnswer((Answer<Void>) invocation -> null);
        //defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
        //_assert.when(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty"))).thenAnswer((Answer<Void>) invocation -> null);
        //springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(ConfigurableApplicationContext.class, configurableApplicationContextMock)).thenReturn(springFactoriesLoaderArgumentResolverMock2);
        //ApplicationStartup applicationStartup = ApplicationStartup.DEFAULT;
        //doNothing().when(configurableApplicationContextMock).setApplicationStartup(applicationStartup);
        //doNothing().when(configurableApplicationContextMock).setEnvironment((ConfigurableEnvironment) any());
        //doReturn(null).when(configurableApplicationContextMock).getParent();
        //doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
        //doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springBootBanner"), (Banner) any());
        //doNothing().when(configurableApplicationContextMock).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
        //doNothing().when(configurableApplicationContextMock).refresh();
        //doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2).when(configurableApplicationContextMock).getBeanFactory();
        //String[] stringArray = new String[] { "return_of_getBeanNamesForTypeItem1" };
        //doReturn(stringArray).when(configurableListableBeanFactoryMock2).getBeanNamesForType(Runner.class);
        //doReturn(runnerMock).when(configurableListableBeanFactoryMock2).getBean("return_of_getBeanNamesForTypeItem1", Runner.class);
        //doReturn(true).when(configurableApplicationContextMock).isRunning();
        //doReturn(true).when(configurableApplicationContextMock).isActive();
        //Map<String, Object> stringObjectMap = new HashMap<>();
        //doReturn(stringObjectMap).when(configurableApplicationContextMock).getBeansOfType(ExitCodeExceptionMapper.class);
        //doNothing().when(configurableApplicationContextMock).publishEvent((ExitCodeEvent) any());
        //doNothing().when(configurableApplicationContextMock).close();
        //springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3).thenReturn(springFactoriesLoaderMock4).thenReturn(springFactoriesLoaderMock5);
        //List<SpringBootExceptionReporter> springBootExceptionReporterList = new ArrayList<>();
        //doReturn(springBootExceptionReporterList).when(springFactoriesLoaderMock5).load(SpringBootExceptionReporter.class, springFactoriesLoaderArgumentResolverMock2);
        //target = spy(new SpringApplication(resourceLoaderMock, classArray));
        //autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        //ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
        //ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
        //doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
        //springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target)).thenReturn(springFactoriesLoaderArgumentResolverMock3);
        //String[] stringArray2 = new String[] {};
        //doReturn(springFactoriesLoaderArgumentResolverMock).when(springFactoriesLoaderArgumentResolverMock3).and(String[].class, stringArray2);
        //ClassLoader classLoader4 = ClassLoader.getPlatformClassLoader();
        //ConfigurableEnvironment configurableEnvironment = applicationContextFactoryMock.createEnvironment(WebApplicationType.SERVLET);
        //doReturn(configurableEnvironment).when(applicationContextFactoryMock).createEnvironment(WebApplicationType.SERVLET);
        //String[] stringArray3 = new String[] {};
        //doNothing().when(target).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray3));
        //doNothing().when(target).bindToSpringApplication((ConfigurableEnvironment) any());
        //ClassLoader classLoader5 = ClassLoader.getPlatformClassLoader();
        //doReturn(ConfigurableEnvironment.class).when(applicationContextFactoryMock).getEnvironmentType(WebApplicationType.SERVLET);
        //doReturn(configurableApplicationContextMock).when(applicationContextFactoryMock).create(WebApplicationType.SERVLET);
        //doNothing().when(target).postProcessApplicationContext(configurableApplicationContextMock);
        //doNothing().when(target).applyInitializers(configurableApplicationContextMock);
        //doNothing().when(target).logStartupInfo(true);
        //doNothing().when(target).logStartupProfileInfo(configurableApplicationContextMock);
        //Set<Object> objectSet = new HashSet<>();
        //doReturn(objectSet).when(target).getAllSources();
        //Object[] objectArray = new Object[] {};
        //doNothing().when(target).load(configurableApplicationContextMock, objectArray);
        //NoOpLog noOpLog = new NoOpLog();
        //doReturn(noOpLog).when(target).getApplicationLog();
        //doReturn(springBootExceptionHandlerMock).when(target).getSpringBootExceptionHandler();
        //doNothing().when(springBootExceptionHandlerMock).registerExitCode(1);
        //ClassLoader classLoader6 = ClassLoader.getPlatformClassLoader();
        //doReturn(classLoader4, classLoader5, classLoader6).when(target).getClassLoader();
        //final RuntimeException result = assertThrows(RuntimeException.class, () -> {    target.run(stringArray2);});
        //assertAll("result", () -> {    assertThat(result, is(notNullValue()));    _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));    webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));    springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(5));    verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);    verify(bootstrapRegistryInitializerMock, atLeast(1)).initialize((BootstrapRegistry) any());    verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);    verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);    springApplicationStartup.verify(() -> SpringApplication.Startup.create(), atLeast(1));    verify(springApplicationStartupMock, atLeast(1)).started();    verify(springApplicationStartupMock, atLeast(1)).timeTakenToStarted();    verify(springFactoriesLoaderMock4, atLeast(1)).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);    configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((Environment) any()), atLeast(2));    defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any()), atLeast(1));    _assert.verify(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty")), atLeast(1));    springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(ConfigurableApplicationContext.class, configurableApplicationContextMock), atLeast(1));    verify(configurableApplicationContextMock, atLeast(1)).setApplicationStartup(applicationStartup);    verify(configurableApplicationContextMock, atLeast(1)).setEnvironment((ConfigurableEnvironment) any());    verify(configurableApplicationContextMock, atLeast(1)).getParent();    verify(configurableApplicationContextMock, times(2)).getBeanFactory();    verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());    verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springBootBanner"), (Banner) any());    verify(configurableApplicationContextMock, atLeast(1)).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());    verify(configurableApplicationContextMock, atLeast(1)).refresh();    verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);    verify(configurableListableBeanFactoryMock2, atLeast(1)).getBean("return_of_getBeanNamesForTypeItem1", Runner.class);    verify(configurableApplicationContextMock, atLeast(1)).isRunning();    verify(configurableApplicationContextMock, atLeast(1)).isActive();    verify(configurableApplicationContextMock, atLeast(1)).getBeansOfType(ExitCodeExceptionMapper.class);    verify(configurableApplicationContextMock, atLeast(1)).publishEvent((ExitCodeEvent) any());    verify(configurableApplicationContextMock, atLeast(1)).close();    verify(springFactoriesLoaderMock5, atLeast(1)).load(SpringBootExceptionReporter.class, springFactoriesLoaderArgumentResolverMock2);    verify(resourceLoaderMock, times(3)).getClassLoader();    springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target), atLeast(1));    verify(springFactoriesLoaderArgumentResolverMock3, atLeast(1)).and(String[].class, stringArray2);    verify(target, times(3)).getClassLoader();    verify(applicationContextFactoryMock, atLeast(1)).createEnvironment(WebApplicationType.SERVLET);    verify(target, atLeast(1)).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray3));    verify(target, atLeast(1)).bindToSpringApplication((ConfigurableEnvironment) any());    verify(applicationContextFactoryMock, atLeast(1)).getEnvironmentType(WebApplicationType.SERVLET);    verify(applicationContextFactoryMock, atLeast(1)).create(WebApplicationType.SERVLET);    verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);    verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);    verify(target, atLeast(1)).logStartupInfo(true);    verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);    verify(target, atLeast(1)).getAllSources();    verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);    verify(target, atLeast(1)).getApplicationLog();    verify(target, atLeast(1)).getSpringBootExceptionHandler();    verify(springBootExceptionHandlerMock, atLeast(1)).registerExitCode(1);});
    }

    //Sapient generated method id: ${runWhenLoggerNotIsErrorEnabledAndContextIsNotNullAndExceptionNotInstanceOfRuntimeException4ThrowsIllegalStateException}, hash: 5E6CE6951E6B3D7172CBFDE8BB4FF3BB
    @Test()
    void runWhenLoggerNotIsErrorEnabledAndContextIsNotNullAndExceptionNotInstanceOfRuntimeException4ThrowsIllegalStateException() throws IllegalStateException, BeansException {
        /* Branches:
         * (this.registerShutdownHook) : true
         * (hook != null) : false  #  inside getRunListeners method
         * (hookListener != null) : false  #  inside getRunListeners method
         * (this.environment != null) : false  #  inside getOrCreateEnvironment method
         * (environment == null) : false  #  inside getOrCreateEnvironment method
         * (environment != null) : true  #  inside getOrCreateEnvironment method
         * (!environment.containsProperty("spring.main.environment-prefix")) : true  #  inside prepareEnvironment method
         * (!this.isCustomEnvironment) : true  #  inside prepareEnvironment method
         * (environmentType == null) : false  #  inside deduceEnvironmentClass method
         * (environmentType == null) : false  #  inside deduceEnvironmentClass method
         * (this.bannerMode == Banner.Mode.OFF) : false  #  inside printBanner method
         * (this.resourceLoader != null) : true  #  inside printBanner method
         * (this.bannerMode == Mode.LOG) : false  #  inside printBanner method
         * (AotDetector.useGeneratedArtifacts()) : false  #  inside addAotGeneratedInitializerIfNecessary method
         * (this.logStartupInfo) : true  #  inside prepareContext method
         * (context.getParent() == null) : true  #  inside prepareContext method
         * (printedBanner != null) : true  #  inside prepareContext method
         * (beanFactory instanceof AbstractAutowireCapableBeanFactory autowireCapableBeanFactory) : false  #  inside prepareContext method
         * (this.lazyInitialization) : false  #  inside prepareContext method
         * (this.keepAlive) : false  #  inside prepareContext method
         * (!AotDetector.useGeneratedArtifacts()) : true  #  inside prepareContext method
         * (this.registerShutdownHook) : true  #  inside refreshContext method
         * (this.logStartupInfo) : true
         * (for-each(beanNames)) : true  #  inside callRunners method
         * (beanFactory instanceof DefaultListableBeanFactory defaultListableBeanFactory) : false  #  inside getOrderComparator method
         * (dependencyComparator instanceof OrderComparator orderComparator) : false  #  inside getOrderComparator method
         * (catch-exception (Throwable)) : true
         * (exception instanceof AbandonedRunException abandonedRunException) : false  #  inside handleRunFailure method
         * (context == null) : false  #  inside getExitCodeFromMappedException method
         * (!context.isActive()) : true  #  inside getExitCodeFromMappedException method
         * (exitCode == 0) : true  #  inside getExitCodeFromException method
         * (exception == null) : false  #  inside getExitCodeFromExitCodeGeneratorException method
         * (exception instanceof ExitCodeGenerator generator) : false  #  inside getExitCodeFromExitCodeGeneratorException method
         * (exitCode != 0) : true  #  inside handleExitCode method
         * (context != null) : true  #  inside handleExitCode method
         * (handler != null) : true  #  inside handleExitCode method
         * (listeners != null) : true  #  inside handleRunFailure method
         * (for-each(exceptionReporters)) : false  #  inside reportFailure method
         * (logger.isErrorEnabled()) : false  #  inside reportFailure method
         * (context != null) : true  #  inside handleRunFailure method
         * (exception instanceof RuntimeException runtimeException) : false  #  inside handleRunFailure method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        SpringApplication.Startup springApplicationStartupMock = mock(SpringApplication.Startup.class);
        SpringFactoriesLoader springFactoriesLoaderMock4 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock = mock(SpringFactoriesLoader.ArgumentResolver.class);
        SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock2 = mock(SpringFactoriesLoader.ArgumentResolver.class);
        ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
        ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
        ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
        Runner runnerMock = mock(Runner.class);
        SpringFactoriesLoader springFactoriesLoaderMock5 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock3 = mock(SpringFactoriesLoader.ArgumentResolver.class);
        SpringBootExceptionHandler springBootExceptionHandlerMock = mock(SpringBootExceptionHandler.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<SpringFactoriesLoader.ArgumentResolver> springFactoriesLoaderArgumentResolver = mockStatic(SpringFactoriesLoader.ArgumentResolver.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
            MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
            MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
            MockedStatic<SpringApplication.Startup> springApplicationStartup = mockStatic(SpringApplication.Startup.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.REACTIVE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            doNothing().when(bootstrapRegistryInitializerMock).initialize((BootstrapRegistry) any());
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
            Duration duration = Duration.ofDays(0L);
            doReturn(duration).when(springApplicationStartupMock).started();
            Duration duration2 = Duration.ofDays(0L);
            doReturn(duration2).when(springApplicationStartupMock).timeTakenToStarted();
            List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
            doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock4).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
            configurationPropertySources.when(() -> ConfigurationPropertySources.attach((Environment) any())).thenAnswer((Answer<Void>) invocation -> null);
            defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty"))).thenAnswer((Answer<Void>) invocation -> null);
            springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(ConfigurableApplicationContext.class, configurableApplicationContextMock)).thenReturn(springFactoriesLoaderArgumentResolverMock2);
            ApplicationStartup applicationStartup = ApplicationStartup.DEFAULT;
            doNothing().when(configurableApplicationContextMock).setApplicationStartup(applicationStartup);
            doNothing().when(configurableApplicationContextMock).setEnvironment((ConfigurableEnvironment) any());
            doReturn(null).when(configurableApplicationContextMock).getParent();
            doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
            doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springBootBanner"), (Banner) any());
            doNothing().when(configurableApplicationContextMock).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
            doNothing().when(configurableApplicationContextMock).refresh();
            doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2).when(configurableApplicationContextMock).getBeanFactory();
            String[] stringArray = new String[] { "return_of_getBeanNamesForTypeItem1" };
            doReturn(stringArray).when(configurableListableBeanFactoryMock2).getBeanNamesForType(Runner.class);
            doReturn(runnerMock).when(configurableListableBeanFactoryMock2).getBean("return_of_getBeanNamesForTypeItem1", Runner.class);
            doReturn(false).when(configurableApplicationContextMock).isActive();
            doNothing().when(configurableApplicationContextMock).publishEvent((ExitCodeEvent) any());
            doNothing().when(configurableApplicationContextMock).close();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3).thenReturn(springFactoriesLoaderMock4).thenReturn(springFactoriesLoaderMock5);
            List<SpringBootExceptionReporter> springBootExceptionReporterList = new ArrayList<>();
            doReturn(springBootExceptionReporterList).when(springFactoriesLoaderMock5).load(SpringBootExceptionReporter.class, springFactoriesLoaderArgumentResolverMock2);
            target = spy(new SpringApplication(resourceLoaderMock, classArray));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target)).thenReturn(springFactoriesLoaderArgumentResolverMock3);
            String[] stringArray2 = new String[] {};
            doReturn(springFactoriesLoaderArgumentResolverMock).when(springFactoriesLoaderArgumentResolverMock3).and(String[].class, stringArray2);
            ClassLoader classLoader4 = ClassLoader.getPlatformClassLoader();
            ConfigurableEnvironment configurableEnvironment = applicationContextFactoryMock.createEnvironment(WebApplicationType.REACTIVE);
            doReturn(configurableEnvironment).when(applicationContextFactoryMock).createEnvironment(WebApplicationType.REACTIVE);
            String[] stringArray3 = new String[] {};
            doNothing().when(target).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray3));
            doNothing().when(target).bindToSpringApplication((ConfigurableEnvironment) any());
            ClassLoader classLoader5 = ClassLoader.getPlatformClassLoader();
            doReturn(ConfigurableEnvironment.class).when(applicationContextFactoryMock).getEnvironmentType(WebApplicationType.REACTIVE);
            doReturn(configurableApplicationContextMock).when(applicationContextFactoryMock).create(WebApplicationType.REACTIVE);
            doNothing().when(target).postProcessApplicationContext(configurableApplicationContextMock);
            doNothing().when(target).applyInitializers(configurableApplicationContextMock);
            doNothing().when(target).logStartupInfo(true);
            doNothing().when(target).logStartupProfileInfo(configurableApplicationContextMock);
            Set<Object> objectSet = new HashSet<>();
            doReturn(objectSet).when(target).getAllSources();
            Object[] objectArray = new Object[] {};
            doNothing().when(target).load(configurableApplicationContextMock, objectArray);
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(target).getApplicationLog();
            doReturn(springBootExceptionHandlerMock).when(target).getSpringBootExceptionHandler();
            doNothing().when(springBootExceptionHandlerMock).registerExitCode(-1);
            ClassLoader classLoader6 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader4, classLoader5, classLoader6).when(target).getClassLoader();
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.run(stringArray2);
            });
            Throwable throwable = new Throwable("message1", (Throwable) null);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getCause(), is(instanceOf(throwable.getClass())));
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(5));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(bootstrapRegistryInitializerMock, atLeast(1)).initialize((BootstrapRegistry) any());
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                springApplicationStartup.verify(() -> SpringApplication.Startup.create(), atLeast(1));
                verify(springApplicationStartupMock, atLeast(1)).started();
                verify(springApplicationStartupMock, atLeast(1)).timeTakenToStarted();
                verify(springFactoriesLoaderMock4, atLeast(1)).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
                configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((Environment) any()), atLeast(2));
                defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any()), atLeast(1));
                _assert.verify(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty")), atLeast(1));
                springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(ConfigurableApplicationContext.class, configurableApplicationContextMock), atLeast(1));
                verify(configurableApplicationContextMock, atLeast(1)).setApplicationStartup(applicationStartup);
                verify(configurableApplicationContextMock, atLeast(1)).setEnvironment((ConfigurableEnvironment) any());
                verify(configurableApplicationContextMock, atLeast(1)).getParent();
                verify(configurableApplicationContextMock, times(2)).getBeanFactory();
                verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
                verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springBootBanner"), (Banner) any());
                verify(configurableApplicationContextMock, atLeast(1)).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
                verify(configurableApplicationContextMock, atLeast(1)).refresh();
                verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);
                verify(configurableListableBeanFactoryMock2, atLeast(1)).getBean("return_of_getBeanNamesForTypeItem1", Runner.class);
                verify(configurableApplicationContextMock, atLeast(1)).isActive();
                verify(configurableApplicationContextMock, atLeast(1)).publishEvent((ExitCodeEvent) any());
                verify(configurableApplicationContextMock, atLeast(1)).close();
                verify(springFactoriesLoaderMock5, atLeast(1)).load(SpringBootExceptionReporter.class, springFactoriesLoaderArgumentResolverMock2);
                verify(resourceLoaderMock, times(3)).getClassLoader();
                springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target), atLeast(1));
                verify(springFactoriesLoaderArgumentResolverMock3, atLeast(1)).and(String[].class, stringArray2);
                verify(target, times(3)).getClassLoader();
                verify(applicationContextFactoryMock, atLeast(1)).createEnvironment(WebApplicationType.REACTIVE);
                verify(target, atLeast(1)).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray3));
                verify(target, atLeast(1)).bindToSpringApplication((ConfigurableEnvironment) any());
                verify(applicationContextFactoryMock, atLeast(1)).getEnvironmentType(WebApplicationType.REACTIVE);
                verify(applicationContextFactoryMock, atLeast(1)).create(WebApplicationType.REACTIVE);
                verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);
                verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);
                verify(target, atLeast(1)).logStartupInfo(true);
                verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);
                verify(target, atLeast(1)).getAllSources();
                verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);
                verify(target, atLeast(1)).getApplicationLog();
                verify(target, atLeast(1)).getSpringBootExceptionHandler();
                verify(springBootExceptionHandlerMock, atLeast(1)).registerExitCode(-1);
            });
        }
    }

    //Sapient generated method id: ${runWhenLoggerNotIsErrorEnabledAndContextIsNotNullAndExceptionNotInstanceOfRuntimeException5ThrowsIllegalStateException}, hash: 846B960EDA595B2A9298F63556DE07EE
    @Test()
    void runWhenLoggerNotIsErrorEnabledAndContextIsNotNullAndExceptionNotInstanceOfRuntimeException5ThrowsIllegalStateException() throws IllegalStateException, BeansException {
        //TODO: Please change the modifier of ready from private to default to isolate the test case scenario
        //Act Statement(s)
        //Assert statement(s)
        /* Branches:
         * (this.registerShutdownHook) : true
         * (hook != null) : false  #  inside getRunListeners method
         * (hookListener != null) : false  #  inside getRunListeners method
         * (this.environment != null) : false  #  inside getOrCreateEnvironment method
         * (environment == null) : false  #  inside getOrCreateEnvironment method
         * (environment != null) : true  #  inside getOrCreateEnvironment method
         * (!environment.containsProperty("spring.main.environment-prefix")) : true  #  inside prepareEnvironment method
         * (!this.isCustomEnvironment) : true  #  inside prepareEnvironment method
         * (environmentType == null) : false  #  inside deduceEnvironmentClass method
         * (environmentType == null) : false  #  inside deduceEnvironmentClass method
         * (this.bannerMode == Banner.Mode.OFF) : false  #  inside printBanner method
         * (this.resourceLoader != null) : true  #  inside printBanner method
         * (this.bannerMode == Mode.LOG) : false  #  inside printBanner method
         * (AotDetector.useGeneratedArtifacts()) : false  #  inside addAotGeneratedInitializerIfNecessary method
         * (this.logStartupInfo) : true  #  inside prepareContext method
         * (context.getParent() == null) : true  #  inside prepareContext method
         * (printedBanner != null) : true  #  inside prepareContext method
         * (beanFactory instanceof AbstractAutowireCapableBeanFactory autowireCapableBeanFactory) : false  #  inside prepareContext method
         * (this.lazyInitialization) : false  #  inside prepareContext method
         * (this.keepAlive) : false  #  inside prepareContext method
         * (!AotDetector.useGeneratedArtifacts()) : true  #  inside prepareContext method
         * (this.registerShutdownHook) : true  #  inside refreshContext method
         * (this.logStartupInfo) : true
         * (for-each(beanNames)) : true  #  inside callRunners method
         * (beanFactory instanceof DefaultListableBeanFactory defaultListableBeanFactory) : false  #  inside getOrderComparator method
         * (dependencyComparator instanceof OrderComparator orderComparator) : false  #  inside getOrderComparator method
         * (context.isRunning()) : true
         * (catch-exception (Throwable)) : true
         * (exception instanceof AbandonedRunException abandonedRunException) : false  #  inside handleRunFailure method
         * (context == null) : false  #  inside getExitCodeFromMappedException method
         * (!context.isActive()) : true  #  inside getExitCodeFromMappedException method
         * (exitCode == 0) : true  #  inside getExitCodeFromException method
         * (exception == null) : false  #  inside getExitCodeFromExitCodeGeneratorException method
         * (exception instanceof ExitCodeGenerator generator) : false  #  inside getExitCodeFromExitCodeGeneratorException method
         * (exitCode != 0) : true  #  inside handleExitCode method
         * (context != null) : true  #  inside handleExitCode method
         * (handler != null) : true  #  inside handleExitCode method
         * (listeners != null) : false  #  inside handleRunFailure method
         * (for-each(exceptionReporters)) : false  #  inside reportFailure method
         * (logger.isErrorEnabled()) : false  #  inside reportFailure method
         * (context != null) : true  #  inside handleRunFailure method
         * (exception instanceof RuntimeException runtimeException) : false  #  inside handleRunFailure method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        //SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        //BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        //SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        //SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        //SpringApplication.Startup springApplicationStartupMock = mock(SpringApplication.Startup.class);
        //SpringFactoriesLoader springFactoriesLoaderMock4 = mock(SpringFactoriesLoader.class);
        //SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock = mock(SpringFactoriesLoader.ArgumentResolver.class);
        //SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock2 = mock(SpringFactoriesLoader.ArgumentResolver.class);
        //ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
        //ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
        //ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
        //Runner runnerMock = mock(Runner.class);
        //SpringFactoriesLoader springFactoriesLoaderMock5 = mock(SpringFactoriesLoader.class);
        //SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock3 = mock(SpringFactoriesLoader.ArgumentResolver.class);
        //SpringBootExceptionHandler springBootExceptionHandlerMock = mock(SpringBootExceptionHandler.class);
        //Class<?>[] classArray = new Class[] {};
        //_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
        //webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.REACTIVE);
        //List<Object> objectList = new ArrayList<>();
        //objectList.add(bootstrapRegistryInitializerMock);
        //doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
        //doNothing().when(bootstrapRegistryInitializerMock).initialize((BootstrapRegistry) any());
        //List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
        //doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
        //List<ApplicationListener<?>> anyList2 = new ArrayList<>();
        //doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
        //springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
        //Duration duration = Duration.ofDays(0L);
        //doReturn(duration).when(springApplicationStartupMock).started();
        //Duration duration2 = Duration.ofDays(0L);
        //doReturn(duration2).when(springApplicationStartupMock).timeTakenToStarted();
        //Duration duration3 = Duration.ofDays(0L);
        //doReturn(duration3).when(springApplicationStartupMock).ready();
        //List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
        //doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock4).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
        //configurationPropertySources.when(() -> ConfigurationPropertySources.attach((Environment) any())).thenAnswer((Answer<Void>) invocation -> null);
        //defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
        //_assert.when(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty"))).thenAnswer((Answer<Void>) invocation -> null);
        //springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(ConfigurableApplicationContext.class, configurableApplicationContextMock)).thenReturn(springFactoriesLoaderArgumentResolverMock2);
        //ApplicationStartup applicationStartup = ApplicationStartup.DEFAULT;
        //doNothing().when(configurableApplicationContextMock).setApplicationStartup(applicationStartup);
        //doNothing().when(configurableApplicationContextMock).setEnvironment((ConfigurableEnvironment) any());
        //doReturn(null).when(configurableApplicationContextMock).getParent();
        //doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
        //doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springBootBanner"), (Banner) any());
        //doNothing().when(configurableApplicationContextMock).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
        //doNothing().when(configurableApplicationContextMock).refresh();
        //doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2).when(configurableApplicationContextMock).getBeanFactory();
        //String[] stringArray = new String[] { "return_of_getBeanNamesForTypeItem1" };
        //doReturn(stringArray).when(configurableListableBeanFactoryMock2).getBeanNamesForType(Runner.class);
        //doReturn(runnerMock).when(configurableListableBeanFactoryMock2).getBean("return_of_getBeanNamesForTypeItem1", Runner.class);
        //doReturn(true).when(configurableApplicationContextMock).isRunning();
        //doReturn(false).when(configurableApplicationContextMock).isActive();
        //doNothing().when(configurableApplicationContextMock).publishEvent((ExitCodeEvent) any());
        //doNothing().when(configurableApplicationContextMock).close();
        //springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3).thenReturn(springFactoriesLoaderMock4).thenReturn(springFactoriesLoaderMock5);
        //List<SpringBootExceptionReporter> springBootExceptionReporterList = new ArrayList<>();
        //doReturn(springBootExceptionReporterList).when(springFactoriesLoaderMock5).load(SpringBootExceptionReporter.class, springFactoriesLoaderArgumentResolverMock2);
        //target = spy(new SpringApplication(resourceLoaderMock, classArray));
        //autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        //ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
        //ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
        //doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
        //springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target)).thenReturn(springFactoriesLoaderArgumentResolverMock3);
        //String[] stringArray2 = new String[] {};
        //doReturn(springFactoriesLoaderArgumentResolverMock).when(springFactoriesLoaderArgumentResolverMock3).and(String[].class, stringArray2);
        //ClassLoader classLoader4 = ClassLoader.getPlatformClassLoader();
        //ConfigurableEnvironment configurableEnvironment = applicationContextFactoryMock.createEnvironment(WebApplicationType.REACTIVE);
        //doReturn(configurableEnvironment).when(applicationContextFactoryMock).createEnvironment(WebApplicationType.REACTIVE);
        //String[] stringArray3 = new String[] {};
        //doNothing().when(target).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray3));
        //doNothing().when(target).bindToSpringApplication((ConfigurableEnvironment) any());
        //ClassLoader classLoader5 = ClassLoader.getPlatformClassLoader();
        //doReturn(ConfigurableEnvironment.class).when(applicationContextFactoryMock).getEnvironmentType(WebApplicationType.REACTIVE);
        //doReturn(configurableApplicationContextMock).when(applicationContextFactoryMock).create(WebApplicationType.REACTIVE);
        //doNothing().when(target).postProcessApplicationContext(configurableApplicationContextMock);
        //doNothing().when(target).applyInitializers(configurableApplicationContextMock);
        //doNothing().when(target).logStartupInfo(true);
        //doNothing().when(target).logStartupProfileInfo(configurableApplicationContextMock);
        //Set<Object> objectSet = new HashSet<>();
        //doReturn(objectSet).when(target).getAllSources();
        //Object[] objectArray = new Object[] {};
        //doNothing().when(target).load(configurableApplicationContextMock, objectArray);
        //NoOpLog noOpLog = new NoOpLog();
        //doReturn(noOpLog).when(target).getApplicationLog();
        //doReturn(springBootExceptionHandlerMock).when(target).getSpringBootExceptionHandler();
        //doNothing().when(springBootExceptionHandlerMock).registerExitCode(-1);
        //ClassLoader classLoader6 = ClassLoader.getPlatformClassLoader();
        //doReturn(classLoader4, classLoader5, classLoader6).when(target).getClassLoader();
        //final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {    target.run(stringArray2);});
        //Throwable throwable = new Throwable("message1", (Throwable) null);
        //assertAll("result", () -> {    assertThat(result, is(notNullValue()));    assertThat(result.getCause(), is(instanceOf(throwable.getClass())));    _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));    webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));    springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(5));    verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);    verify(bootstrapRegistryInitializerMock, atLeast(1)).initialize((BootstrapRegistry) any());    verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);    verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);    springApplicationStartup.verify(() -> SpringApplication.Startup.create(), atLeast(1));    verify(springApplicationStartupMock, atLeast(1)).started();    verify(springApplicationStartupMock, atLeast(1)).timeTakenToStarted();    verify(springFactoriesLoaderMock4, atLeast(1)).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);    configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((Environment) any()), atLeast(2));    defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any()), atLeast(1));    _assert.verify(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty")), atLeast(1));    springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(ConfigurableApplicationContext.class, configurableApplicationContextMock), atLeast(1));    verify(configurableApplicationContextMock, atLeast(1)).setApplicationStartup(applicationStartup);    verify(configurableApplicationContextMock, atLeast(1)).setEnvironment((ConfigurableEnvironment) any());    verify(configurableApplicationContextMock, atLeast(1)).getParent();    verify(configurableApplicationContextMock, times(2)).getBeanFactory();    verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());    verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springBootBanner"), (Banner) any());    verify(configurableApplicationContextMock, atLeast(1)).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());    verify(configurableApplicationContextMock, atLeast(1)).refresh();    verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);    verify(configurableListableBeanFactoryMock2, atLeast(1)).getBean("return_of_getBeanNamesForTypeItem1", Runner.class);    verify(configurableApplicationContextMock, atLeast(1)).isRunning();    verify(configurableApplicationContextMock, atLeast(1)).isActive();    verify(configurableApplicationContextMock, atLeast(1)).publishEvent((ExitCodeEvent) any());    verify(configurableApplicationContextMock, atLeast(1)).close();    verify(springFactoriesLoaderMock5, atLeast(1)).load(SpringBootExceptionReporter.class, springFactoriesLoaderArgumentResolverMock2);    verify(resourceLoaderMock, times(3)).getClassLoader();    springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target), atLeast(1));    verify(springFactoriesLoaderArgumentResolverMock3, atLeast(1)).and(String[].class, stringArray2);    verify(target, times(3)).getClassLoader();    verify(applicationContextFactoryMock, atLeast(1)).createEnvironment(WebApplicationType.REACTIVE);    verify(target, atLeast(1)).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray3));    verify(target, atLeast(1)).bindToSpringApplication((ConfigurableEnvironment) any());    verify(applicationContextFactoryMock, atLeast(1)).getEnvironmentType(WebApplicationType.REACTIVE);    verify(applicationContextFactoryMock, atLeast(1)).create(WebApplicationType.REACTIVE);    verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);    verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);    verify(target, atLeast(1)).logStartupInfo(true);    verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);    verify(target, atLeast(1)).getAllSources();    verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);    verify(target, atLeast(1)).getApplicationLog();    verify(target, atLeast(1)).getSpringBootExceptionHandler();    verify(springBootExceptionHandlerMock, atLeast(1)).registerExitCode(-1);});
    }

    //Sapient generated method id: ${configureEnvironmentWhenThisAddConversionService}, hash: F3C80B39A745D147119CCA342D850F97
    @Test()
    void configureEnvironmentWhenThisAddConversionService() {
        /* Branches:
         * (this.addConversionService) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class);
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doNothing().when(environmentMock).setConversionService((ConfigurableConversionService) any());
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            target = spy(new SpringApplication(resourceLoaderMock, classArray));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            String[] stringArray = new String[] {};
            doNothing().when(target).configurePropertySources(environmentMock, stringArray);
            //Act Statement(s)
            target.configureEnvironment(environmentMock, stringArray);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(environmentMock, atLeast(1)).setConversionService((ConfigurableConversionService) any());
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(resourceLoaderMock, times(3)).getClassLoader();
                verify(target, atLeast(1)).configurePropertySources(environmentMock, stringArray);
            });
        }
    }

    //Sapient generated method id: ${configurePropertySourcesWhenSourcesContainsName}, hash: BB7DB293F5656E788B3D4F8939A33B17
    @Test()
    void configurePropertySourcesWhenSourcesContainsName() {
        /* Branches:
         * (!CollectionUtils.isEmpty(this.defaultProperties)) : false
         * (this.addCommandLineProperties) : true
         * (args.length > 0) : true
         * (sources.contains(name)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class);
        MutablePropertySources mutablePropertySourcesMock = mock(MutablePropertySources.class);
        PropertySource<?> propertySourceMock = mock(PropertySource.class);
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
            doReturn(true).when(mutablePropertySourcesMock).contains("commandLineArgs");
            doReturn(propertySourceMock).when(mutablePropertySourcesMock).get("commandLineArgs");
            doNothing().when(mutablePropertySourcesMock).replace(eq("commandLineArgs"), (PropertySource) any());
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            String[] stringArray = new String[] { "argsItem1" };
            //Act Statement(s)
            target.configurePropertySources(environmentMock, stringArray);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(environmentMock, atLeast(1)).getPropertySources();
                verify(mutablePropertySourcesMock, atLeast(1)).contains("commandLineArgs");
                verify(mutablePropertySourcesMock, atLeast(1)).get("commandLineArgs");
                verify(mutablePropertySourcesMock, atLeast(1)).replace(eq("commandLineArgs"), (PropertySource) any());
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(resourceLoaderMock, times(3)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${configurePropertySourcesWhenSourcesNotContainsName}, hash: 388C1A5E07F7A5E87832FD438460D189
    @Test()
    void configurePropertySourcesWhenSourcesNotContainsName() {
        /* Branches:
         * (!CollectionUtils.isEmpty(this.defaultProperties)) : false
         * (this.addCommandLineProperties) : true
         * (args.length > 0) : true
         * (sources.contains(name)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class);
        MutablePropertySources mutablePropertySourcesMock = mock(MutablePropertySources.class);
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
            doReturn(false).when(mutablePropertySourcesMock).contains("commandLineArgs");
            doNothing().when(mutablePropertySourcesMock).addFirst((PropertySource) any());
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            String[] stringArray = new String[] { "argsItem1" };
            //Act Statement(s)
            target.configurePropertySources(environmentMock, stringArray);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(environmentMock, atLeast(1)).getPropertySources();
                verify(mutablePropertySourcesMock, atLeast(1)).contains("commandLineArgs");
                verify(mutablePropertySourcesMock, atLeast(1)).addFirst((PropertySource) any());
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(resourceLoaderMock, times(3)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${bindToSpringApplicationTest}, hash: 7B2E2CBC79E8F9B3371D574D13BBF7BE
    @Test()
    void bindToSpringApplicationTest() throws Exception {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        Binder binderMock = mock(Binder.class);
        ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
        BindResult bindResultMock = mock(BindResult.class);
        Bindable<SpringApplication> bindableMock = mock(Bindable.class);
        try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
            MockedStatic<Binder> binder = mockStatic(Binder.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            binder.when(() -> Binder.get(configurableEnvironmentMock)).thenReturn(binderMock);
            doReturn(bindResultMock).when(binderMock).bind("spring.main", bindableMock);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            bindable.when(() -> Bindable.ofInstance(target)).thenReturn(bindableMock);
            //Act Statement(s)
            target.bindToSpringApplication(configurableEnvironmentMock);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                binder.verify(() -> Binder.get(configurableEnvironmentMock), atLeast(1));
                verify(binderMock, atLeast(1)).bind("spring.main", bindableMock);
                verify(resourceLoaderMock, times(3)).getClassLoader();
                bindable.verify(() -> Bindable.ofInstance(target), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${bindToSpringApplicationWhenCaughtExceptionThrowsIllegalStateException}, hash: 5069C6D0B171FC5CD479C06C10C63538
    @Test()
    void bindToSpringApplicationWhenCaughtExceptionThrowsIllegalStateException() {
        /* Branches:
         * (catch-exception (Exception)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        Binder binderMock = mock(Binder.class);
        ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
        BindResult bindResultMock = mock(BindResult.class);
        Bindable<SpringApplication> bindableMock = mock(Bindable.class);
        try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
            MockedStatic<Binder> binder = mockStatic(Binder.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            binder.when(() -> Binder.get(configurableEnvironmentMock)).thenReturn(binderMock);
            doReturn(bindResultMock).when(binderMock).bind("spring.main", bindableMock);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            bindable.when(() -> Bindable.ofInstance(target)).thenReturn(bindableMock);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.bindToSpringApplication(configurableEnvironmentMock);
            });
            Exception exception = new Exception();
            IllegalStateException illegalStateException = new IllegalStateException("Cannot bind to SpringApplication", exception);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(exception.getClass())));
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                binder.verify(() -> Binder.get(configurableEnvironmentMock), atLeast(1));
                verify(binderMock, atLeast(1)).bind("spring.main", bindableMock);
                verify(resourceLoaderMock, times(3)).getClassLoader();
                bindable.verify(() -> Bindable.ofInstance(target), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${createApplicationContextTest}, hash: 40E0614770D10D22B4823AC4309AD3F0
    @Test()
    void createApplicationContextTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.REACTIVE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            target.setApplicationContextFactory(applicationContextFactoryMock);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            //Act Statement(s)
            ConfigurableApplicationContext result = target.createApplicationContext();
            //Assert statement(s)
            //TODO: Please implement equals method in ConfigurableApplicationContext for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(resourceLoaderMock, times(3)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${postProcessApplicationContextWhenContextInstanceOfDefaultResourceLoaderAndThisAddConversionService}, hash: 209826B8C7840C6077745DB7178A27A3
    @Test()
    void postProcessApplicationContextWhenContextInstanceOfDefaultResourceLoaderAndThisAddConversionService() throws IllegalStateException {
        /* Branches:
         * (this.beanNameGenerator != null) : false
         * (this.resourceLoader != null) : true
         * (context instanceof GenericApplicationContext genericApplicationContext) : true
         * (context instanceof DefaultResourceLoader defaultResourceLoader) : true
         * (this.addConversionService) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        GenericApplicationContext genericApplicationContextMock = mock(GenericApplicationContext.class);
        ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
        ConfigurableConversionService configurableConversionServiceMock = mock(ConfigurableConversionService.class);
        ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doNothing().when(genericApplicationContextMock).setResourceLoader(resourceLoaderMock);
            doNothing().when(genericApplicationContextMock).setClassLoader((ClassLoader) any());
            doReturn(configurableListableBeanFactoryMock).when(genericApplicationContextMock).getBeanFactory();
            doNothing().when(configurableListableBeanFactoryMock).setConversionService(configurableConversionServiceMock);
            doReturn(configurableEnvironmentMock).when(genericApplicationContextMock).getEnvironment();
            doReturn(configurableConversionServiceMock).when(configurableEnvironmentMock).getConversionService();
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader4 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3, classLoader4).when(resourceLoaderMock).getClassLoader();
            //Act Statement(s)
            target.postProcessApplicationContext(genericApplicationContextMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(genericApplicationContextMock, atLeast(1)).setResourceLoader(resourceLoaderMock);
                verify(genericApplicationContextMock, atLeast(1)).setClassLoader((ClassLoader) any());
                verify(genericApplicationContextMock, atLeast(1)).getBeanFactory();
                verify(configurableListableBeanFactoryMock, atLeast(1)).setConversionService(configurableConversionServiceMock);
                verify(genericApplicationContextMock, atLeast(1)).getEnvironment();
                verify(configurableEnvironmentMock, atLeast(1)).getConversionService();
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(resourceLoaderMock, times(4)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${applyInitializersWhenGetInitializersIsNotEmpty}, hash: 1C4E51F2E25F4266B4840ADBD17B9345
    @Test()
    void applyInitializersWhenGetInitializersIsNotEmpty() {
        /* Branches:
         * (for-each(getInitializers())) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
        ApplicationContextInitializer applicationContextInitializerMock = mock(ApplicationContextInitializer.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<GenericTypeResolver> genericTypeResolver = mockStatic(GenericTypeResolver.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            genericTypeResolver.when(() -> GenericTypeResolver.resolveTypeArgument(ApplicationContextInitializer.class, ApplicationContextInitializer.class)).thenReturn(Object.class);
            _assert.when(() -> Assert.isInstanceOf(Object.class, configurableApplicationContextMock, "Unable to call initializer.")).thenAnswer((Answer<Void>) invocation -> null);
            target = spy(new SpringApplication(resourceLoaderMock, classArray));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            Set<ApplicationContextInitializer<?>> anySet = new HashSet<>();
            anySet.add(applicationContextInitializerMock);
            doReturn(anySet).when(target).getInitializers();
            doNothing().when(applicationContextInitializerMock).initialize(configurableApplicationContextMock);
            //Act Statement(s)
            target.applyInitializers(configurableApplicationContextMock);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                genericTypeResolver.verify(() -> GenericTypeResolver.resolveTypeArgument(ApplicationContextInitializer.class, ApplicationContextInitializer.class), atLeast(1));
                _assert.verify(() -> Assert.isInstanceOf(Object.class, configurableApplicationContextMock, "Unable to call initializer."), atLeast(1));
                verify(resourceLoaderMock, times(3)).getClassLoader();
                verify(target, atLeast(1)).getInitializers();
                verify(applicationContextInitializerMock, atLeast(1)).initialize(configurableApplicationContextMock);
            });
        }
    }

    //Sapient generated method id: ${logStartupInfoWhenIsRoot}, hash: B4A372A0AEFD4C619875CDA946A5AC03
    @Test()
    void logStartupInfoWhenIsRoot() {
        /* Branches:
         * (isRoot) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            target = spy(new SpringApplication(resourceLoaderMock, classArray));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(target).getApplicationLog();
            //Act Statement(s)
            target.logStartupInfo(true);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(resourceLoaderMock, times(3)).getClassLoader();
                verify(target, atLeast(1)).getApplicationLog();
            });
        }
    }

    //Sapient generated method id: ${logStartupProfileInfoWhenDefaultProfilesSizeLessThanOrEqualsTo1}, hash: DD671845A96550CFECDEA2252DC75DFB
    @Test()
    void logStartupProfileInfoWhenDefaultProfilesSizeLessThanOrEqualsTo1() {
        /* Branches:
         * (log.isInfoEnabled()) : true
         * (ObjectUtils.isEmpty(activeProfiles)) : true
         * (defaultProfiles.size() <= 1) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        ConfigurableApplicationContext contextMock = mock(ConfigurableApplicationContext.class);
        ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
        ConfigurableEnvironment configurableEnvironmentMock2 = mock(ConfigurableEnvironment.class);
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            String[] stringArray = new String[] {};
            doReturn(stringArray).when(configurableEnvironmentMock).getActiveProfiles();
            doReturn(configurableEnvironmentMock, configurableEnvironmentMock2).when(contextMock).getEnvironment();
            String[] stringArray2 = new String[] {};
            doReturn(stringArray2).when(configurableEnvironmentMock2).getDefaultProfiles();
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            target = spy(new SpringApplication(resourceLoaderMock, classArray));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(target).getApplicationLog();
            //Act Statement(s)
            target.logStartupProfileInfo(contextMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(contextMock, times(2)).getEnvironment();
                verify(configurableEnvironmentMock, atLeast(1)).getActiveProfiles();
                verify(configurableEnvironmentMock2, atLeast(1)).getDefaultProfiles();
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(resourceLoaderMock, times(3)).getClassLoader();
                verify(target, atLeast(1)).getApplicationLog();
            });
        }
    }

    //Sapient generated method id: ${getApplicationLogWhenThisMainApplicationClassIsNull}, hash: 445D596405167993F1BE47FD3D4ACA9A
    @Test()
    void getApplicationLogWhenThisMainApplicationClassIsNull() {
        /* Branches:
         * (this.mainApplicationClass == null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            //Act Statement(s)
            Log result = target.getApplicationLog();
            //Assert statement(s)
            //TODO: Please implement equals method in Log for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(resourceLoaderMock, times(3)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${loadWhenContextNotInstanceOfAbstractApplicationContextThrowsIllegalStateException}, hash: EC39FEB165BA39F89C11C6918B756365
    @Test()
    void loadWhenContextNotInstanceOfAbstractApplicationContextThrowsIllegalStateException() {
        /* Branches:
         * (logger.isDebugEnabled()) : true
         * (context instanceof BeanDefinitionRegistry registry) : false  #  inside getBeanDefinitionRegistry method
         * (context instanceof AbstractApplicationContext abstractApplicationContext) : false  #  inside getBeanDefinitionRegistry method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        ApplicationContext applicationContextMock = mock(ApplicationContext.class);
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            Object[] objectArray = new Object[] {};
            stringUtils.when(() -> StringUtils.arrayToCommaDelimitedString(objectArray)).thenReturn("A");
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.load(applicationContextMock, objectArray);
            });
            IllegalStateException illegalStateException = new IllegalStateException("Could not locate BeanDefinitionRegistry");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                stringUtils.verify(() -> StringUtils.arrayToCommaDelimitedString(objectArray), atLeast(1));
                verify(resourceLoaderMock, times(3)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${loadWhenThisEnvironmentIsNull}, hash: A0E04517C08D60F81663FFF309BDBB80
    @Test()
    void loadWhenThisEnvironmentIsNull() throws IllegalStateException {
        /* Branches:
         * (logger.isDebugEnabled()) : true
         * (context instanceof BeanDefinitionRegistry registry) : false  #  inside getBeanDefinitionRegistry method
         * (context instanceof AbstractApplicationContext abstractApplicationContext) : true  #  inside getBeanDefinitionRegistry method
         * (this.beanNameGenerator != null) : false
         * (this.resourceLoader != null) : true
         * (this.environment != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        AbstractApplicationContext abstractApplicationContextMock = mock(AbstractApplicationContext.class);
        ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        BeanDefinitionLoader beanDefinitionLoaderMock = mock(BeanDefinitionLoader.class);
        BeanDefinitionRegistry beanDefinitionRegistryMock = mock(BeanDefinitionRegistry.class);
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(configurableListableBeanFactoryMock).when(abstractApplicationContextMock).getBeanFactory();
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            Object[] objectArray = new Object[] {};
            stringUtils.when(() -> StringUtils.arrayToCommaDelimitedString(objectArray)).thenReturn("A");
            target = spy(new SpringApplication(resourceLoaderMock, classArray));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            doReturn(beanDefinitionLoaderMock).when(target).createBeanDefinitionLoader(beanDefinitionRegistryMock, objectArray);
            doNothing().when(beanDefinitionLoaderMock).setResourceLoader(resourceLoaderMock);
            doNothing().when(beanDefinitionLoaderMock).load();
            //Act Statement(s)
            target.load(abstractApplicationContextMock, objectArray);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(abstractApplicationContextMock, atLeast(1)).getBeanFactory();
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                stringUtils.verify(() -> StringUtils.arrayToCommaDelimitedString(objectArray), atLeast(1));
                verify(resourceLoaderMock, times(3)).getClassLoader();
                verify(target, atLeast(1)).createBeanDefinitionLoader(beanDefinitionRegistryMock, objectArray);
                verify(beanDefinitionLoaderMock, atLeast(1)).setResourceLoader(resourceLoaderMock);
                verify(beanDefinitionLoaderMock, atLeast(1)).load();
            });
        }
    }

    //Sapient generated method id: ${getClassLoaderWhenThisResourceLoaderIsNotNull}, hash: 27CC06E8A312155DD3E5C59304759D44
    @Test()
    void getClassLoaderWhenThisResourceLoaderIsNotNull() {
        /* Branches:
         * (this.resourceLoader != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader4 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3, classLoader4).when(resourceLoaderMock).getClassLoader();
            //Act Statement(s)
            ClassLoader result = target.getClassLoader();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(classLoader4));
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(resourceLoaderMock, times(4)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${getClassLoaderWhenThisResourceLoaderIsNull}, hash: DCEB2495A10943A3E41AF1917889BF79
    @Test()
    void getClassLoaderWhenThisResourceLoaderIsNull() {
        /* Branches:
         * (this.resourceLoader != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            target = new SpringApplication((ResourceLoader) null, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            ClassLoader result = target.getClassLoader();
            //Assert statement(s)
            //TODO: Please implement equals method in ClassLoader for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            });
        }
    }

    //Sapient generated method id: ${createBeanDefinitionLoaderTest}, hash: 1504269275EC176E0A04BAC4268F1F90
    @Test()
    void createBeanDefinitionLoaderTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        BeanDefinitionRegistry beanDefinitionRegistryMock = mock(BeanDefinitionRegistry.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            Object[] objectArray = new Object[] {};
            //Act Statement(s)
            BeanDefinitionLoader result = target.createBeanDefinitionLoader(beanDefinitionRegistryMock, objectArray);
            //Assert statement(s)
            //TODO: Please implement equals method in BeanDefinitionLoader for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(resourceLoaderMock, times(3)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${refreshTest}, hash: 9C5862CE50EB6A7C9D38FB9B10BD60CE
    @Test()
    void refreshTest() throws BeansException, IllegalStateException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        ConfigurableApplicationContext applicationContextMock = mock(ConfigurableApplicationContext.class);
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doNothing().when(applicationContextMock).refresh();
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            //Act Statement(s)
            target.refresh(applicationContextMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(applicationContextMock, atLeast(1)).refresh();
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(resourceLoaderMock, times(3)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${registerLoggedExceptionWhenHandlerIsNotNull}, hash: ACF811CA50D313BC4ADF5B36A1D0990D
    @Test()
    void registerLoggedExceptionWhenHandlerIsNotNull() {
        /* Branches:
         * (handler != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        SpringBootExceptionHandler springBootExceptionHandlerMock = mock(SpringBootExceptionHandler.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            target = spy(new SpringApplication(resourceLoaderMock, classArray));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            doReturn(springBootExceptionHandlerMock).when(target).getSpringBootExceptionHandler();
            Throwable throwable = new Throwable();
            doNothing().when(springBootExceptionHandlerMock).registerLoggedException(throwable);
            //Act Statement(s)
            target.registerLoggedException(throwable);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(resourceLoaderMock, times(3)).getClassLoader();
                verify(target, atLeast(1)).getSpringBootExceptionHandler();
                verify(springBootExceptionHandlerMock, atLeast(1)).registerLoggedException(throwable);
            });
        }
    }

    //Sapient generated method id: ${getSpringBootExceptionHandlerWhenIsMainThreadNotThreadCurrentThread}, hash: 2DA7347850FADE86D85849F31E674AFD
    @Test()
    void getSpringBootExceptionHandlerWhenIsMainThreadNotThreadCurrentThread() {
        /* Branches:
         * ("main".equals(currentThread.getName())) : false  #  inside isMainThread method
         * ("restartedMain".equals(currentThread.getName())) : false  #  inside isMainThread method
         * (isMainThread(Thread.currentThread())) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            //Act Statement(s)
            SpringBootExceptionHandler result = target.getSpringBootExceptionHandler();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(resourceLoaderMock, times(3)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${setWebApplicationTypeTest}, hash: 07FAA96C8E763C9B36CA275EFBCAA560
    @Test()
    void setWebApplicationTypeTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            _assert.when(() -> Assert.notNull(WebApplicationType.REACTIVE, "WebApplicationType must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            //Act Statement(s)
            target.setWebApplicationType(WebApplicationType.REACTIVE);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(target.getWebApplicationType(), equalTo(WebApplicationType.REACTIVE));
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                _assert.verify(() -> Assert.notNull(WebApplicationType.REACTIVE, "WebApplicationType must not be null"), atLeast(1));
                verify(resourceLoaderMock, times(3)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${addBootstrapRegistryInitializerTest}, hash: 71BF53D1ED442B627053F6959C041FF3
    @Test()
    void addBootstrapRegistryInitializerTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock2 = mock(BootstrapRegistryInitializer.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            _assert.when(() -> Assert.notNull(bootstrapRegistryInitializerMock2, "BootstrapRegistryInitializer must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            //Act Statement(s)
            target.addBootstrapRegistryInitializer(bootstrapRegistryInitializerMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                _assert.verify(() -> Assert.notNull(bootstrapRegistryInitializerMock2, "BootstrapRegistryInitializer must not be null"), atLeast(1));
                verify(resourceLoaderMock, times(3)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${setDefaultProperties1WhenCollectionsListDefaultPropertiesPropertyNamesIsNotEmpty}, hash: ED427083521CB456DA81A83AC62BF958
    @Test()
    void setDefaultProperties1WhenCollectionsListDefaultPropertiesPropertyNamesIsNotEmpty() {
        /* Branches:
         * (for-each(Collections.list(defaultProperties.propertyNames()))) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            Object object = new Object();
            Properties properties = new Properties();
            properties.put("defaultPropertiesItem1Key1", object);
            //Act Statement(s)
            target.setDefaultProperties(properties);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(resourceLoaderMock, times(3)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${setAdditionalProfilesTest}, hash: 6A52510AD9F6AEB0BC5C389DB4F2FA3B
    @Test()
    void setAdditionalProfilesTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            String[] stringArray = new String[] {};
            //Act Statement(s)
            target.setAdditionalProfiles(stringArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(target.getAdditionalProfiles().size(), equalTo(0));
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(resourceLoaderMock, times(3)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${setEnvironmentTest}, hash: 548382D7EF88EA507EACB45F84C52001
    @Test()
    void setEnvironmentTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            //Act Statement(s)
            target.setEnvironment(configurableEnvironmentMock);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(resourceLoaderMock, times(3)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${addPrimarySourcesTest}, hash: 18A3212DB0116DD2ED5BF55D7155B83F
    @Test()
    void addPrimarySourcesTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            Collection<Class<?>> collection = new ArrayList<>();
            //Act Statement(s)
            target.addPrimarySources(collection);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(resourceLoaderMock, times(3)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${setSourcesTest}, hash: F8F95A5C204BA41530636235A66C1981
    @Test()
    void setSourcesTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            _assert.when(() -> Assert.notNull(anySet(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            Set<String> stringSet = new HashSet<>();
            //Act Statement(s)
            target.setSources(stringSet);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(target.getSources().size(), equalTo(0));
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                _assert.verify(() -> Assert.notNull(anySet(), eq("Sources must not be null")), atLeast(1));
                verify(resourceLoaderMock, times(3)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${getAllSourcesWhenCollectionUtilsIsEmptyThisSources}, hash: C5F093FA7A9F7C7163755F4B622BF2BE
    @Test()
    void getAllSourcesWhenCollectionUtilsIsEmptyThisSources() {
        /* Branches:
         * (!CollectionUtils.isEmpty(this.primarySources)) : true
         * (!CollectionUtils.isEmpty(this.sources)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class, CALLS_REAL_METHODS);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            collectionUtils.when(() -> CollectionUtils.isEmpty((LinkedHashSet) any())).thenReturn(false);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            //Act Statement(s)
            Set<Object> result = target.getAllSources();
            //Assert statement(s)
            //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(1));
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                collectionUtils.verify(() -> CollectionUtils.isEmpty((LinkedHashSet) any()), atLeast(1));
                verify(resourceLoaderMock, times(3)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${setResourceLoaderTest}, hash: 38201976B77E885135D0600D12A105BE
    @Test()
    void setResourceLoaderTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        ResourceLoader resourceLoaderMock2 = mock(ResourceLoader.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            _assert.when(() -> Assert.notNull(resourceLoaderMock, "ResourceLoader must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            target = new SpringApplication(resourceLoaderMock2, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock2).getClassLoader();
            //Act Statement(s)
            target.setResourceLoader(resourceLoaderMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(target.getResourceLoader(), is(notNullValue()));
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                _assert.verify(() -> Assert.notNull(resourceLoaderMock, "ResourceLoader must not be null"), atLeast(1));
                verify(resourceLoaderMock2, times(3)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${setApplicationContextFactoryWhenApplicationContextFactoryIsNotNull}, hash: 6F56302A07B8A108584440B7A8C7889C
    @Test()
    void setApplicationContextFactoryWhenApplicationContextFactoryIsNotNull() {
        /* Branches:
         * (applicationContextFactory != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            //Act Statement(s)
            target.setApplicationContextFactory(applicationContextFactoryMock);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(resourceLoaderMock, times(3)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${setApplicationContextFactoryWhenApplicationContextFactoryIsNull}, hash: 26A933B641E5FA62B93D4661EC1E6695
    @Test()
    void setApplicationContextFactoryWhenApplicationContextFactoryIsNull() {
        /* Branches:
         * (applicationContextFactory != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            ApplicationContextFactory applicationContextFactory = null;
            //Act Statement(s)
            target.setApplicationContextFactory(applicationContextFactory);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(resourceLoaderMock, times(3)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${setInitializersTest}, hash: D9A5857551128F7C65117B4D9C2BFF9D
    @Test()
    void setInitializersTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            //Act Statement(s)
            target.setInitializers(anyList);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(resourceLoaderMock, times(3)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${addInitializersTest}, hash: 92E0B1B2C55FF500222AAB62202EE997
    @Test()
    void addInitializersTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            ApplicationContextInitializer<?>[] applicationContextInitializerArray = new ApplicationContextInitializer[] {};
            //Act Statement(s)
            target.addInitializers(applicationContextInitializerArray);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(resourceLoaderMock, times(3)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${getInitializersTest}, hash: FAC1C6F936FECC076091D9293095C73C
    @Test()
    void getInitializersTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            //Act Statement(s)
            Set<ApplicationContextInitializer<?>> result = target.getInitializers();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(resourceLoaderMock, times(3)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${setListenersTest}, hash: CF5388B71A1998FDBBF3863994074651
    @Test()
    void setListenersTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            //Act Statement(s)
            target.setListeners(anyList2);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(resourceLoaderMock, times(3)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${addListenersTest}, hash: 97C1DF69D4AB7C1854D8A2ABA490E9F0
    @Test()
    void addListenersTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            ApplicationListener<?>[] applicationListenerArray = new ApplicationListener[] {};
            //Act Statement(s)
            target.addListeners(applicationListenerArray);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(resourceLoaderMock, times(3)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${getListenersTest}, hash: 211A514CF7AC8D8BE1EA0FEC21C0A488
    @Test()
    void getListenersTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            //Act Statement(s)
            Set<ApplicationListener<?>> result = target.getListeners();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(resourceLoaderMock, times(3)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${setApplicationStartupWhenApplicationStartupIsNotNull}, hash: D3BD92E3B1F02AD651574C78572FF139
    @Test()
    void setApplicationStartupWhenApplicationStartupIsNotNull() {
        /* Branches:
         * (applicationStartup != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        ApplicationStartup applicationStartupMock = mock(ApplicationStartup.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            //Act Statement(s)
            target.setApplicationStartup(applicationStartupMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(target.getApplicationStartup(), is(notNullValue()));
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(resourceLoaderMock, times(3)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${setApplicationStartupWhenApplicationStartupIsNull}, hash: 9DF02EDB0F50D152F3FFBD6CA60691C8
    @Test()
    void setApplicationStartupWhenApplicationStartupIsNull() {
        /* Branches:
         * (applicationStartup != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type StackWalker - Method: walk
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
        BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
        SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
            List<Object> objectList = new ArrayList<>();
            objectList.add(bootstrapRegistryInitializerMock);
            doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            List<ApplicationListener<?>> anyList2 = new ArrayList<>();
            doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
            target = new SpringApplication(resourceLoaderMock, classArray);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            ApplicationStartup applicationStartup = null;
            //Act Statement(s)
            target.setApplicationStartup(applicationStartup);
            //Assert statement(s)
            //TODO: Please implement equals method in ApplicationStartup for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(target.getApplicationStartup(), is(notNullValue()));
                _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
                webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
                verify(resourceLoaderMock, times(3)).getClassLoader();
            });
        }
    }

    //Sapient generated method id: ${getShutdownHandlersTest}, hash: C7886B22EA5837D2B5B9E7E5EA57E5C2
    @Test()
    void getShutdownHandlersTest() {
        
        //Act Statement(s)
        SpringApplicationShutdownHandlers result = SpringApplication.getShutdownHandlers();
        
        //Assert statement(s)
        //TODO: Please implement equals method in SpringApplicationShutdownHandlers for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${run1Test}, hash: 23809C2105A53E0F86EA75AC2DB034A0
    @Test()
    void run1Test() {
        //Arrange Statement(s)
        //Arrange Statement(s)
        //ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
        /*try (MockedStatic<SpringApplication> springApplication = mockStatic(SpringApplication.class, CALLS_REAL_METHODS)) {
    try (MockedStatic<SpringApplication> springApplication = mockStatic(SpringApplication.class, CALLS_REAL_METHODS)) {
        Class<?>[] classArray = new Class[] { Object.class };
        String[] stringArray = new String[] {};
        springApplication.when(() -> SpringApplication.run(classArray, stringArray)).thenReturn(configurableApplicationContextMock);
        //Act Statement(s)
        ConfigurableApplicationContext result = SpringApplication.run(Object.class, stringArray);
        //Act Statement(s)
        ConfigurableApplicationContext result = SpringApplication.run(Object.class, stringArray);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(configurableApplicationContextMock));
            springApplication.verify(() -> SpringApplication.run(classArray, stringArray), atLeast(1));
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(configurableApplicationContextMock));
            springApplication.verify(() -> SpringApplication.run(classArray, stringArray), atLeast(1));
        });
    }
}*/
        //Arrange Statement(s)
        //ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
        /*try (MockedStatic<SpringApplication> springApplication = mockStatic(SpringApplication.class, CALLS_REAL_METHODS)) {
    try (MockedStatic<SpringApplication> springApplication = mockStatic(SpringApplication.class, CALLS_REAL_METHODS)) {
        Class<?>[] classArray = new Class[] { Object.class };
        String[] stringArray = new String[] {};
        springApplication.when(() -> SpringApplication.run(classArray, stringArray)).thenReturn(configurableApplicationContextMock);
        //Act Statement(s)
        ConfigurableApplicationContext result = SpringApplication.run(Object.class, stringArray);
        //Act Statement(s)
        ConfigurableApplicationContext result = SpringApplication.run(Object.class, stringArray);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(configurableApplicationContextMock));
            springApplication.verify(() -> SpringApplication.run(classArray, stringArray), atLeast(1));
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(configurableApplicationContextMock));
            springApplication.verify(() -> SpringApplication.run(classArray, stringArray), atLeast(1));
        });
    }
}*/
    }

    @Test()
    void run1Test() {
    }

    @Test()
    void run1Test() {
    }

    @Test()
    void run1Test() {
    }

    //Sapient generated method id: ${exitWhenContextNotInstanceOfConfigurableApplicationContext}, hash: E6EAEFA4876236F8B088FC5E9103022D
    @Test()
    void exitWhenContextNotInstanceOfConfigurableApplicationContext() throws Exception {
        /* Branches:
         * (exitCode != 0) : true
         * (context instanceof ConfigurableApplicationContext closable) : false  #  inside close method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: generators - Method: addAll
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        ApplicationContext contextMock = mock(ApplicationContext.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Map<String, Object> stringObjectMap = new HashMap<>();
            doReturn(stringObjectMap).when(contextMock).getBeansOfType(ExitCodeGenerator.class);
            doNothing().when(contextMock).publishEvent((ExitCodeEvent) any());
            _assert.when(() -> Assert.notNull(contextMock, "Context must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ExitCodeGenerator[] exitCodeGeneratorArray = new ExitCodeGenerator[] {};
            //Act Statement(s)
            int result = SpringApplication.exit(contextMock, exitCodeGeneratorArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                verify(contextMock).getBeansOfType(ExitCodeGenerator.class);
                verify(contextMock).publishEvent((ExitCodeEvent) any());
                _assert.verify(() -> Assert.notNull(contextMock, "Context must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${exitWhenExitCodeNotEquals0}, hash: D3278C8C51F8408B5A4C964FE474B425
    @Test()
    void exitWhenExitCodeNotEquals0() throws Exception {
        /* Branches:
         * (exitCode != 0) : true
         * (context instanceof ConfigurableApplicationContext closable) : false  #  inside close method
         * (catch-exception (Exception)) : true
         * (exitCode != 0) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: generators - Method: addAll
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        ApplicationContext contextMock = mock(ApplicationContext.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Map<String, Object> stringObjectMap = new HashMap<>();
            doReturn(stringObjectMap).when(contextMock).getBeansOfType(ExitCodeGenerator.class);
            doNothing().when(contextMock).publishEvent((ExitCodeEvent) any());
            _assert.when(() -> Assert.notNull(contextMock, "Context must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ExitCodeGenerator[] exitCodeGeneratorArray = new ExitCodeGenerator[] {};
            //Act Statement(s)
            int result = SpringApplication.exit(contextMock, exitCodeGeneratorArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(1));
                verify(contextMock).getBeansOfType(ExitCodeGenerator.class);
                verify(contextMock).publishEvent((ExitCodeEvent) any());
                _assert.verify(() -> Assert.notNull(contextMock, "Context must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${exitWhenExitCodeEquals0}, hash: 9D4C6EBDC06A46EF7B4AD82A2A87132C
    @Test()
    void exitWhenExitCodeEquals0() throws Exception {
        /* Branches:
         * (exitCode != 0) : false
         * (context instanceof ConfigurableApplicationContext closable) : false  #  inside close method
         * (catch-exception (Exception)) : true
         * (exitCode != 0) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: generators - Method: addAll
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        ApplicationContext contextMock = mock(ApplicationContext.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Map<String, Object> stringObjectMap = new HashMap<>();
            doReturn(stringObjectMap).when(contextMock).getBeansOfType(ExitCodeGenerator.class);
            _assert.when(() -> Assert.notNull(contextMock, "Context must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ExitCodeGenerator[] exitCodeGeneratorArray = new ExitCodeGenerator[] {};
            //Act Statement(s)
            int result = SpringApplication.exit(contextMock, exitCodeGeneratorArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(1));
                verify(contextMock).getBeansOfType(ExitCodeGenerator.class);
                _assert.verify(() -> Assert.notNull(contextMock, "Context must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${fromTest}, hash: BE443B37D12901822D6E2BFCD1DE0535
    @Test()
    void fromTest() {
        //Arrange Statement(s)
        ThrowingConsumer<String[]> throwingConsumerMock = mock(ThrowingConsumer.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(throwingConsumerMock, "Main must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            SpringApplication.Augmented result = SpringApplication.from(throwingConsumerMock);
            //Assert statement(s)
            //TODO: Please implement equals method in Augmented for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(throwingConsumerMock, "Main must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${withHookTest}, hash: F79572989FC0BD877203DB8E089C8907
    @Test()
    void withHookTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: applicationHook - Method: set
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        SpringApplicationHook springApplicationHookMock = mock(SpringApplicationHook.class);
        Runnable runnableMock = mock(Runnable.class);
        
        //Act Statement(s)
        SpringApplication.withHook(springApplicationHookMock, runnableMock);
    }

    //Sapient generated method id: ${withHook1Test}, hash: 1A4605EA6FF601DED7836835F0475C48
    @Test()
    void withHook1Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: applicationHook - Method: set
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        ThrowingSupplier<Object> actionMock = mock(ThrowingSupplier.class);
        Object object = new Object();
        doReturn(object).when(actionMock).get();
        SpringApplicationHook springApplicationHookMock = mock(SpringApplicationHook.class);
        
        //Act Statement(s)
        Object result = SpringApplication.withHook(springApplicationHookMock, actionMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(object));
            verify(actionMock).get();
        });
    }
}