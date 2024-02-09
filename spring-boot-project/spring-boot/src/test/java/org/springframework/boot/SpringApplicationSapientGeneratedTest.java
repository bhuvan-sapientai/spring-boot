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

import org.springframework.core.env.CompositePropertySource;
import org.springframework.core.env.ConfigurableEnvironment;

import org.mockito.stubbing.Answer;
import org.apache.commons.logging.LogFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.core.metrics.ApplicationStartup;
import org.springframework.aot.AotDetector;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.io.support.SpringFactoriesLoader;

import java.util.List;

import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.core.env.PropertySource;
import org.springframework.util.function.ThrowingSupplier;
import org.springframework.context.support.GenericApplicationContext;

import java.util.Map;

import org.springframework.boot.convert.ApplicationConversionService;

import org.apache.commons.logging.Log;

import org.springframework.context.ApplicationListener;
import org.springframework.util.function.ThrowingConsumer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.web.servlet.context.ApplicationServletEnvironment;
import org.springframework.core.env.SimpleCommandLinePropertySource;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;

import java.util.Properties;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.util.ClassUtils;
import org.springframework.boot.context.properties.source.ConfigurationPropertySources;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;

import java.util.Set;

import org.springframework.core.GenericTypeResolver;

import java.util.Collection;

import org.mockito.MockedStatic;

import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.util.ObjectUtils;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.containsInAnyOrder;
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

	private final ResourceLoader resourceLoaderMock = mock(ResourceLoader.class, "ResourceLoader resourceLoader");

	private AutoCloseable autoCloseableMocks;

	@InjectMocks()
	private SpringApplication target;

	@AfterEach()
	public void afterTest() throws Exception {
		if (autoCloseableMocks != null)
			autoCloseableMocks.close();
	}

	//Sapient generated method id: ${42d3b446-df63-3b17-ac0b-323f22c2587e}
	@Test()
	void runWhenBeanFactoryNotInstanceOfDefaultListableBeanFactoryAndDependencyComparatorNotInstanceOfOrderComparatorAndContextN() throws Throwable, Exception {
		/* Branches:
		 * (this.registerShutdownHook) : true
		 * (hook != null) : false  #  inside getRunListeners method
		 * (hookListener != null) : false  #  inside getRunListeners method
		 * (this.environment != null) : false  #  inside getOrCreateEnvironment method
		 * (environment == null) : true  #  inside getOrCreateEnvironment method
		 * (this.applicationContextFactory != ApplicationContextFactory.DEFAULT) : true  #  inside getOrCreateEnvironment method
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
		 * (printedBanner != null) : false  #  inside prepareContext method
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
		 *  Following variables could not be isolated/mocked: listeners, shutdownHook, org.springframework.boot.StartupInfoLogger
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
		//ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
		//SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock2 = mock(SpringFactoriesLoader.ArgumentResolver.class);
		//ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		//ApplicationContext applicationContextMock = mock(ApplicationContext.class);
		//ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		//ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
    MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
    MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
    MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
    MockedStatic<SpringFactoriesLoader.ArgumentResolver> springFactoriesLoaderArgumentResolver = mockStatic(SpringFactoriesLoader.ArgumentResolver.class);
    MockedStatic<SpringApplication.Startup> springApplicationStartup = mockStatic(SpringApplication.Startup.class);
    MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
    Class<?>[] classArray = new Class[] {};
    _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.SERVLET);
    List<Object> objectList = new ArrayList<>();
    objectList.add(bootstrapRegistryInitializerMock);
    doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
    doNothing().when(bootstrapRegistryInitializerMock).initialize((DefaultBootstrapContext) any());
    List<Object> objectList2 = new ArrayList<>();
    doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
    List<Object> objectList3 = new ArrayList<>();
    doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
    springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
    Duration duration = Duration.ofDays(0L);
    doReturn(duration).when(springApplicationStartupMock).started();
    Duration duration2 = Duration.ofDays(0L);
    doReturn(duration2).when(springApplicationStartupMock).timeTakenToStarted();
    springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3).thenReturn(springFactoriesLoaderMock4);
    List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
    doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock4).load(Object.class, springFactoriesLoaderArgumentResolverMock);
    configurationPropertySources.when(() -> ConfigurationPropertySources.attach(configurableEnvironmentMock)).thenAnswer((Answer<Void>) invocation -> null);
    doReturn(true).when(configurableEnvironmentMock).containsProperty("spring.main.environment-prefix");
    defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd(configurableEnvironmentMock)).thenAnswer((Answer<Void>) invocation -> null);
    _assert.when(() -> Assert.state(false, "Environment prefix cannot be set via properties.")).thenAnswer((Answer<Void>) invocation -> null);
    configurationPropertySources.when(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
    _assert.when(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty"))).thenAnswer((Answer<Void>) invocation -> null);
    target = spy(new SpringApplication((ResourceLoader) null, classArray));
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target)).thenReturn(springFactoriesLoaderArgumentResolverMock2);
    String[] stringArray = new String[] {};
    doReturn(springFactoriesLoaderArgumentResolverMock).when(springFactoriesLoaderArgumentResolverMock2).and(String[].class, stringArray);
    ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
    doReturn(null, configurableEnvironmentMock).when(applicationContextFactoryMock).createEnvironment(WebApplicationType.SERVLET);
    String[] stringArray2 = new String[] {};
    doNothing().when(target).configureEnvironment(configurableEnvironmentMock, stringArray2);
    doNothing().when(target).bindToSpringApplication(configurableEnvironmentMock);
    ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
    doReturn(classLoader, classLoader2).when(target).getClassLoader();
    doReturn(ApplicationServletEnvironment.class).when(applicationContextFactoryMock).getEnvironmentType(WebApplicationType.SERVLET);
    doReturn(configurableApplicationContextMock).when(target).createApplicationContext();
    ApplicationStartup applicationStartup = ApplicationStartup.DEFAULT;
    doNothing().when(configurableApplicationContextMock).setApplicationStartup(applicationStartup);
    doNothing().when(configurableApplicationContextMock).setEnvironment((ConfigurableEnvironment) any());
    doReturn(applicationContextMock).when(configurableApplicationContextMock).getParent();
    doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
    doNothing().when(configurableApplicationContextMock).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
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
    doNothing().when(target).refresh(configurableApplicationContextMock);
    doNothing().when(target).afterRefresh(eq(configurableApplicationContextMock), (DefaultApplicationArguments) any());
    //TODO: Needs to return real value
    doReturn(null).when(target).getApplicationLog();
    //Act Statement(s)
    ConfigurableApplicationContext result = target.run(stringArray);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, equalTo(configurableApplicationContextMock));
        _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
        webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
        springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(4));
        verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
        verify(bootstrapRegistryInitializerMock, atLeast(1)).initialize((DefaultBootstrapContext) any());
        verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
        verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
        springApplicationStartup.verify(() -> SpringApplication.Startup.create(), atLeast(1));
        verify(springApplicationStartupMock, atLeast(1)).started();
        verify(springApplicationStartupMock, atLeast(1)).timeTakenToStarted();
        verify(springFactoriesLoaderMock4, atLeast(1)).load(Object.class, springFactoriesLoaderArgumentResolverMock);
        configurationPropertySources.verify(() -> ConfigurationPropertySources.attach(configurableEnvironmentMock), atLeast(1));
        verify(configurableEnvironmentMock, atLeast(1)).containsProperty("spring.main.environment-prefix");
        defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd(configurableEnvironmentMock), atLeast(1));
        _assert.verify(() -> Assert.state(false, "Environment prefix cannot be set via properties."), atLeast(1));
        configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) any()), atLeast(1));
        _assert.verify(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty")), atLeast(1));
        springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target), atLeast(1));
        verify(springFactoriesLoaderArgumentResolverMock2, atLeast(1)).and(String[].class, stringArray);
        verify(target, times(2)).getClassLoader();
        verify(applicationContextFactoryMock, times(2)).createEnvironment(WebApplicationType.SERVLET);
        verify(target, atLeast(1)).configureEnvironment(configurableEnvironmentMock, stringArray2);
        verify(target, atLeast(1)).bindToSpringApplication(configurableEnvironmentMock);
        verify(applicationContextFactoryMock, atLeast(1)).getEnvironmentType(WebApplicationType.SERVLET);
        verify(target, atLeast(1)).createApplicationContext();
        verify(configurableApplicationContextMock, atLeast(1)).setApplicationStartup(applicationStartup);
        verify(configurableApplicationContextMock, atLeast(1)).setEnvironment((ConfigurableEnvironment) any());
        verify(configurableApplicationContextMock, atLeast(1)).getParent();
        verify(configurableApplicationContextMock, times(2)).getBeanFactory();
        verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
        verify(configurableApplicationContextMock, atLeast(1)).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
        verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);
        verify(configurableApplicationContextMock, atLeast(1)).isRunning();
        verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);
        verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);
        verify(target, atLeast(1)).logStartupInfo(false);
        verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);
        verify(target, atLeast(1)).getAllSources();
        verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);
        verify(target, atLeast(1)).refresh(configurableApplicationContextMock);
        verify(target, atLeast(1)).afterRefresh(eq(configurableApplicationContextMock), (DefaultApplicationArguments) any());
        verify(target, atLeast(1)).getApplicationLog();
    });
}*/
	}

	//Sapient generated method id: ${e47c1909-c129-35b0-9436-4989528a1205}
	@Test()
	void runWhenDependencyComparatorNotInstanceOfOrderComparatorAndContextNotIsRunning2() throws Throwable, Exception {
		/* Branches:
		 * (this.registerShutdownHook) : true
		 * (hook != null) : false  #  inside getRunListeners method
		 * (hookListener != null) : false  #  inside getRunListeners method
		 * (this.environment != null) : false  #  inside getOrCreateEnvironment method
		 * (environment == null) : true  #  inside getOrCreateEnvironment method
		 * (this.applicationContextFactory != ApplicationContextFactory.DEFAULT) : true  #  inside getOrCreateEnvironment method
		 * (environment != null) : false  #  inside getOrCreateEnvironment method
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
		 * (printedBanner != null) : false  #  inside prepareContext method
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
		 *  Following variables could not be isolated/mocked: listeners, shutdownHook, org.springframework.boot.StartupInfoLogger
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
		//ApplicationContext applicationContextMock = mock(ApplicationContext.class);
		//ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		//ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
    MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class, CALLS_REAL_METHODS);
    MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
    MockedStatic<SpringFactoriesLoader.ArgumentResolver> springFactoriesLoaderArgumentResolver = mockStatic(SpringFactoriesLoader.ArgumentResolver.class);
    MockedStatic<SpringApplication.Startup> springApplicationStartup = mockStatic(SpringApplication.Startup.class);
    MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
    Class<?>[] classArray = new Class[] {};
    _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.SERVLET);
    List<Object> objectList = new ArrayList<>();
    objectList.add(bootstrapRegistryInitializerMock);
    doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
    doNothing().when(bootstrapRegistryInitializerMock).initialize((DefaultBootstrapContext) any());
    List<Object> objectList2 = new ArrayList<>();
    doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
    List<Object> objectList3 = new ArrayList<>();
    doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
    springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
    Duration duration = Duration.ofDays(0L);
    doReturn(duration).when(springApplicationStartupMock).started();
    Duration duration2 = Duration.ofDays(0L);
    doReturn(duration2).when(springApplicationStartupMock).timeTakenToStarted();
    springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3).thenReturn(springFactoriesLoaderMock4);
    List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
    doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock4).load(Object.class, springFactoriesLoaderArgumentResolverMock);
    configurationPropertySources.when(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
    _assert.when(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty"))).thenAnswer((Answer<Void>) invocation -> null);
    target = spy(new SpringApplication((ResourceLoader) null, classArray));
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target)).thenReturn(springFactoriesLoaderArgumentResolverMock2);
    String[] stringArray = new String[] {};
    doReturn(springFactoriesLoaderArgumentResolverMock).when(springFactoriesLoaderArgumentResolverMock2).and(String[].class, stringArray);
    ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
    doReturn(null).when(applicationContextFactoryMock).createEnvironment(WebApplicationType.SERVLET);
    String[] stringArray2 = new String[] {};
    doNothing().when(target).configureEnvironment((ApplicationEnvironment) any(), eq(stringArray2));
    doNothing().when(target).bindToSpringApplication((ApplicationEnvironment) any());
    ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
    doReturn(classLoader, classLoader2).when(target).getClassLoader();
    doReturn(ApplicationServletEnvironment.class).when(applicationContextFactoryMock).getEnvironmentType(WebApplicationType.SERVLET);
    doReturn(configurableApplicationContextMock).when(target).createApplicationContext();
    ApplicationStartup applicationStartup = ApplicationStartup.DEFAULT;
    doNothing().when(configurableApplicationContextMock).setApplicationStartup(applicationStartup);
    doNothing().when(configurableApplicationContextMock).setEnvironment((ConfigurableEnvironment) any());
    doReturn(applicationContextMock).when(configurableApplicationContextMock).getParent();
    doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
    doNothing().when(configurableApplicationContextMock).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
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
    doNothing().when(target).refresh(configurableApplicationContextMock);
    doNothing().when(target).afterRefresh(eq(configurableApplicationContextMock), (DefaultApplicationArguments) any());
    //TODO: Needs to return real value
    doReturn(null).when(target).getApplicationLog();
    //Act Statement(s)
    ConfigurableApplicationContext result = target.run(stringArray);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, equalTo(configurableApplicationContextMock));
        _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
        webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
        springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(4));
        verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
        verify(bootstrapRegistryInitializerMock, atLeast(1)).initialize((DefaultBootstrapContext) any());
        verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
        verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
        springApplicationStartup.verify(() -> SpringApplication.Startup.create(), atLeast(1));
        verify(springApplicationStartupMock, atLeast(1)).started();
        verify(springApplicationStartupMock, atLeast(1)).timeTakenToStarted();
        verify(springFactoriesLoaderMock4, atLeast(1)).load(Object.class, springFactoriesLoaderArgumentResolverMock);
        configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) any()), atLeast(1));
        _assert.verify(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty")), atLeast(1));
        springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target), atLeast(1));
        verify(springFactoriesLoaderArgumentResolverMock2, atLeast(1)).and(String[].class, stringArray);
        verify(target, times(2)).getClassLoader();
        verify(applicationContextFactoryMock, times(2)).createEnvironment(WebApplicationType.SERVLET);
        verify(target, atLeast(1)).configureEnvironment((ApplicationEnvironment) any(), eq(stringArray2));
        verify(target, atLeast(1)).bindToSpringApplication((ApplicationEnvironment) any());
        verify(applicationContextFactoryMock, atLeast(1)).getEnvironmentType(WebApplicationType.SERVLET);
        verify(target, atLeast(1)).createApplicationContext();
        verify(configurableApplicationContextMock, atLeast(1)).setApplicationStartup(applicationStartup);
        verify(configurableApplicationContextMock, atLeast(1)).setEnvironment((ConfigurableEnvironment) any());
        verify(configurableApplicationContextMock, atLeast(1)).getParent();
        verify(configurableApplicationContextMock, times(2)).getBeanFactory();
        verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
        verify(configurableApplicationContextMock, atLeast(1)).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
        verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);
        verify(configurableApplicationContextMock, atLeast(1)).isRunning();
        verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);
        verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);
        verify(target, atLeast(1)).logStartupInfo(false);
        verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);
        verify(target, atLeast(1)).getAllSources();
        verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);
        verify(target, atLeast(1)).refresh(configurableApplicationContextMock);
        verify(target, atLeast(1)).afterRefresh(eq(configurableApplicationContextMock), (DefaultApplicationArguments) any());
        verify(target, atLeast(1)).getApplicationLog();
    });
}*/
	}

	//Sapient generated method id: ${3e7af4bd-9984-3984-a7be-79318e0c493a}
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
		 *  Following variables could not be isolated/mocked: listeners, shutdownHook, org.springframework.boot.StartupInfoLogger
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//SpringApplication.Startup springApplicationStartupMock = mock(SpringApplication.Startup.class);
		//SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		//ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		//ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		//ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
		//Runner runnerMock = mock(Runner.class, "Object");
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
    MockedStatic<AotDetector> aotDetector = mockStatic(AotDetector.class);
    MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
    MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
    MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
    MockedStatic<SpringFactoriesLoader.ArgumentResolver> springFactoriesLoaderArgumentResolver = mockStatic(SpringFactoriesLoader.ArgumentResolver.class);
    MockedStatic<SpringApplication.Startup> springApplicationStartup = mockStatic(SpringApplication.Startup.class);
    MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
    ClassLoader classLoader4 = null;
    Class<?>[] classArray = new Class[] { Object.class };
    _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
    SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
    springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2);
    springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
    //TODO: Needs to return real value
    doReturn(null).when(springApplicationStartupMock).started();
    Duration duration = Duration.ofDays(0L);
    doReturn(duration).when(springApplicationStartupMock).timeTakenToStarted();
    springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock);
    List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
    doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock).load(eq(Object.class), (SpringFactoriesLoader.ArgumentResolver) any());
    configurationPropertySources.when(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) null)).thenAnswer((Answer<Void>) invocation -> null);
    defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) null)).thenAnswer((Answer<Void>) invocation -> null);
    configurationPropertySources.when(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
    aotDetector.when(() -> AotDetector.useGeneratedArtifacts()).thenReturn(false);
    _assert.when(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty"))).thenAnswer((Answer<Void>) invocation -> null);
    target = spy(new SpringApplication(resourceLoaderMock, classArray));
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    target.setApplicationContextFactory(applicationContextFactoryMock);
    ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
    doReturn(null, classLoader4, classLoader).when(resourceLoaderMock).getClassLoader();
    SpringFactoriesLoader.ArgumentResolver argumentResolver = SpringFactoriesLoader.ArgumentResolver.none();
    springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target)).thenReturn(argumentResolver);
    ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
    String[] stringArray = new String[] { "String[] args" };
    doNothing().when(target).configureEnvironment((ConfigurableEnvironment) null, stringArray);
    doNothing().when(target).bindToSpringApplication((ConfigurableEnvironment) null);
    ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
    doReturn(classLoader2, classLoader3).when(target).getClassLoader();
    doReturn(configurableApplicationContextMock).when(target).createApplicationContext();
    ApplicationStartup applicationStartup = ApplicationStartup.DEFAULT;
    doNothing().when(configurableApplicationContextMock).setApplicationStartup(applicationStartup);
    doNothing().when(configurableApplicationContextMock).setEnvironment((ConfigurableEnvironment) any());
    doReturn(null).when(configurableApplicationContextMock).getParent();
    doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
    doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springBootBanner"), (Banner) any());
    doNothing().when(configurableApplicationContextMock).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
    doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2).when(configurableApplicationContextMock).getBeanFactory();
    String[] stringArray2 = new String[] { "String[]" };
    doReturn(stringArray2).when(configurableListableBeanFactoryMock2).getBeanNamesForType(Runner.class);
    doReturn(runnerMock).when(configurableListableBeanFactoryMock2).getBean("String[]", Runner.class);
    doNothing().when(target).postProcessApplicationContext(configurableApplicationContextMock);
    doNothing().when(target).applyInitializers(configurableApplicationContextMock);
    doNothing().when(target).logStartupInfo(true);
    doNothing().when(target).logStartupProfileInfo(configurableApplicationContextMock);
    Set<Object> objectSet = new HashSet<>();
    doReturn(objectSet).when(target).getAllSources();
    Object[] objectArray = new Object[] {};
    doNothing().when(target).load(configurableApplicationContextMock, objectArray);
    doNothing().when(target).refresh(configurableApplicationContextMock);
    doNothing().when(target).afterRefresh(eq(configurableApplicationContextMock), (DefaultApplicationArguments) any());
    //TODO: Needs to return real value
    doReturn(null).when(target).getApplicationLog();
    String[] stringArray3 = new String[] { "String[] args" };
    //Act Statement(s)
    final SpringApplication.AbandonedRunException result = assertThrows(SpringApplication.AbandonedRunException.class, () -> {
        target.run(stringArray3);
    });
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(notNullValue()));
        _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
        webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
        springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(1));
        springApplicationStartup.verify(() -> SpringApplication.Startup.create(), atLeast(1));
        verify(springApplicationStartupMock, atLeast(1)).started();
        verify(springApplicationStartupMock, atLeast(1)).timeTakenToStarted();
        springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(1));
        verify(springFactoriesLoaderMock, atLeast(1)).load(eq(Object.class), (SpringFactoriesLoader.ArgumentResolver) any());
        configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) null), atLeast(1));
        defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) null), atLeast(1));
        configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) any()), atLeast(1));
        aotDetector.verify(() -> AotDetector.useGeneratedArtifacts(), atLeast(2));
        _assert.verify(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty")), atLeast(1));
        verify(resourceLoaderMock, times(3)).getClassLoader();
        springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target), atLeast(1));
        verify(target, times(2)).getClassLoader();
        verify(target, atLeast(1)).configureEnvironment((ConfigurableEnvironment) null, stringArray);
        verify(target, atLeast(1)).bindToSpringApplication((ConfigurableEnvironment) null);
        verify(target, atLeast(1)).createApplicationContext();
        verify(configurableApplicationContextMock, atLeast(1)).setApplicationStartup(applicationStartup);
        verify(configurableApplicationContextMock, atLeast(1)).setEnvironment((ConfigurableEnvironment) any());
        verify(configurableApplicationContextMock, atLeast(1)).getParent();
        verify(configurableApplicationContextMock, times(2)).getBeanFactory();
        verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
        verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springBootBanner"), (Banner) any());
        verify(configurableApplicationContextMock, atLeast(1)).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
        verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);
        verify(configurableListableBeanFactoryMock2, atLeast(1)).getBean("String[]", Runner.class);
        verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);
        verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);
        verify(target, atLeast(1)).logStartupInfo(true);
        verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);
        verify(target, atLeast(1)).getAllSources();
        verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);
        verify(target, atLeast(1)).refresh(configurableApplicationContextMock);
        verify(target, atLeast(1)).afterRefresh(eq(configurableApplicationContextMock), (DefaultApplicationArguments) any());
        verify(target, atLeast(1)).getApplicationLog();
    });
}*/
	}

	//Sapient generated method id: ${98d77b25-aac9-30d2-961a-261540ea2ab7}
	@Test()
	void runWhenContextIsRunning() throws Throwable, Exception {
		//TODO: Please change the modifier of ready from private to default to isolate the test case scenario
		//TODO: Needs to return real value
		//Act Statement(s)
		//Assert statement(s)
		/* Branches:
		 * (this.registerShutdownHook) : true
		 * (hook != null) : false  #  inside getRunListeners method
		 * (hookListener != null) : false  #  inside getRunListeners method
		 * (this.environment != null) : false  #  inside getOrCreateEnvironment method
		 * (environment == null) : true  #  inside getOrCreateEnvironment method
		 * (this.applicationContextFactory != ApplicationContextFactory.DEFAULT) : true  #  inside getOrCreateEnvironment method
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
		 *  Following variables could not be isolated/mocked: listeners, shutdownHook, org.springframework.boot.StartupInfoLogger
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
		//ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
		//SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock2 = mock(SpringFactoriesLoader.ArgumentResolver.class);
		//ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		//ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		//ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
		//Runner runnerMock = mock(Runner.class);
		//Class<?>[] classArray = new Class[] {};
		//_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
		//webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.REACTIVE);
		//List<Object> objectList = new ArrayList<>();
		//objectList.add(bootstrapRegistryInitializerMock);
		//doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
		//doNothing().when(bootstrapRegistryInitializerMock).initialize((DefaultBootstrapContext) any());
		//List<Object> objectList2 = new ArrayList<>();
		//doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
		//List<Object> objectList3 = new ArrayList<>();
		//doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
		//springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
		//Duration duration = Duration.ofDays(0L);
		//doReturn(duration).when(springApplicationStartupMock).started();
		//Duration duration2 = Duration.ofDays(0L);
		//doReturn(duration2).when(springApplicationStartupMock).timeTakenToStarted();
		//Duration duration3 = Duration.ofDays(0L);
		//doReturn(duration3).when(springApplicationStartupMock).ready();
		//springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3).thenReturn(springFactoriesLoaderMock4);
		//List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
		//doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock4).load(Object.class, springFactoriesLoaderArgumentResolverMock);
		//configurationPropertySources.when(() -> ConfigurationPropertySources.attach(configurableEnvironmentMock)).thenAnswer((Answer<Void>) invocation -> null);
		//doReturn(false).when(configurableEnvironmentMock).containsProperty("spring.main.environment-prefix");
		//defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd(configurableEnvironmentMock)).thenAnswer((Answer<Void>) invocation -> null);
		//configurationPropertySources.when(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
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
		//doReturn(null, configurableEnvironmentMock).when(applicationContextFactoryMock).createEnvironment(WebApplicationType.REACTIVE);
		//String[] stringArray2 = new String[] {};
		//doNothing().when(target).configureEnvironment(configurableEnvironmentMock, stringArray2);
		//doNothing().when(target).bindToSpringApplication(configurableEnvironmentMock);
		//ClassLoader classLoader5 = ClassLoader.getPlatformClassLoader();
		//doReturn(classLoader4, classLoader5).when(target).getClassLoader();
		//doReturn(null).when(applicationContextFactoryMock).getEnvironmentType(WebApplicationType.REACTIVE);
		//doReturn(configurableApplicationContextMock).when(target).createApplicationContext();
		//ApplicationStartup applicationStartup = ApplicationStartup.DEFAULT;
		//doNothing().when(configurableApplicationContextMock).setApplicationStartup(applicationStartup);
		//doNothing().when(configurableApplicationContextMock).setEnvironment((ConfigurableEnvironment) any());
		//doReturn(null).when(configurableApplicationContextMock).getParent();
		//doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
		//doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springBootBanner"), (Banner) any());
		//doNothing().when(configurableApplicationContextMock).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
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
		//doNothing().when(target).refresh(configurableApplicationContextMock);
		//doNothing().when(target).afterRefresh(eq(configurableApplicationContextMock), (DefaultApplicationArguments) any());
		//doReturn(null).when(target).getApplicationLog();
		//ConfigurableApplicationContext result = target.run(stringArray);
		//assertAll("result", () -> {    assertThat(result, equalTo(configurableApplicationContextMock));    _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));    webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));    springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(4));    verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);    verify(bootstrapRegistryInitializerMock, atLeast(1)).initialize((DefaultBootstrapContext) any());    verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);    verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);    springApplicationStartup.verify(() -> SpringApplication.Startup.create(), atLeast(1));    verify(springApplicationStartupMock, atLeast(1)).started();    verify(springApplicationStartupMock, atLeast(1)).timeTakenToStarted();    verify(springFactoriesLoaderMock4, atLeast(1)).load(Object.class, springFactoriesLoaderArgumentResolverMock);    configurationPropertySources.verify(() -> ConfigurationPropertySources.attach(configurableEnvironmentMock), atLeast(1));    verify(configurableEnvironmentMock, atLeast(1)).containsProperty("spring.main.environment-prefix");    defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd(configurableEnvironmentMock), atLeast(1));    configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) any()), atLeast(1));    _assert.verify(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty")), atLeast(1));    verify(resourceLoaderMock, times(3)).getClassLoader();    springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target), atLeast(1));    verify(springFactoriesLoaderArgumentResolverMock2, atLeast(1)).and(String[].class, stringArray);    verify(target, times(2)).getClassLoader();    verify(applicationContextFactoryMock, times(2)).createEnvironment(WebApplicationType.REACTIVE);    verify(target, atLeast(1)).configureEnvironment(configurableEnvironmentMock, stringArray2);    verify(target, atLeast(1)).bindToSpringApplication(configurableEnvironmentMock);    verify(applicationContextFactoryMock, times(2)).getEnvironmentType(WebApplicationType.REACTIVE);    verify(target, atLeast(1)).createApplicationContext();    verify(configurableApplicationContextMock, atLeast(1)).setApplicationStartup(applicationStartup);    verify(configurableApplicationContextMock, atLeast(1)).setEnvironment((ConfigurableEnvironment) any());    verify(configurableApplicationContextMock, atLeast(1)).getParent();    verify(configurableApplicationContextMock, times(2)).getBeanFactory();    verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());    verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springBootBanner"), (Banner) any());    verify(configurableApplicationContextMock, atLeast(1)).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());    verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);    verify(configurableListableBeanFactoryMock2, atLeast(1)).getBean("return_of_getBeanNamesForTypeItem1", Runner.class);    verify(configurableApplicationContextMock, atLeast(1)).isRunning();    verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);    verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);    verify(target, atLeast(1)).logStartupInfo(true);    verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);    verify(target, atLeast(1)).getAllSources();    verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);    verify(target, atLeast(1)).refresh(configurableApplicationContextMock);    verify(target, atLeast(1)).afterRefresh(eq(configurableApplicationContextMock), (DefaultApplicationArguments) any());    verify(target, atLeast(1)).getApplicationLog();});
	}

	//Sapient generated method id: ${84f7d002-e180-33f9-9ad7-da295fbf2101}
	@Test()
	void runWhenCaughtThrowableAndExceptionInstanceOfAbandonedRunExceptionThrowsSpringApplicationAbandonedRunException() throws IllegalStateException, BeansException {
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
		 *  Following variables could not be isolated/mocked: listeners, shutdownHook, org.springframework.boot.StartupInfoLogger
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringApplication.Startup springApplicationStartupMock = mock(SpringApplication.Startup.class);
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
		Runner runnerMock = mock(Runner.class, "Object");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
			 MockedStatic<AotDetector> aotDetector = mockStatic(AotDetector.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
			 MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
			 MockedStatic<SpringFactoriesLoader.ArgumentResolver> springFactoriesLoaderArgumentResolver = mockStatic(SpringFactoriesLoader.ArgumentResolver.class);
			 MockedStatic<SpringApplication.Startup> springApplicationStartup = mockStatic(SpringApplication.Startup.class);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
			ClassLoader classLoader4 = null;
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2);
			springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
			//TODO: Needs to return real value
			doReturn(null).when(springApplicationStartupMock).started();
			Duration duration = Duration.ofDays(0L);
			doReturn(duration).when(springApplicationStartupMock).timeTakenToStarted();
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock);
			List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
			doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock).load(eq(Object.class), (SpringFactoriesLoader.ArgumentResolver) any());
			configurationPropertySources.when(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) null)).thenAnswer((Answer<Void>) invocation -> null);
			defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) null)).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertySources.when(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
			aotDetector.when(() -> AotDetector.useGeneratedArtifacts()).thenReturn(false);
			_assert.when(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty"))).thenAnswer((Answer<Void>) invocation -> null);
			target = spy(new SpringApplication(resourceLoaderMock, classArray));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setApplicationContextFactory(applicationContextFactoryMock);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader4, classLoader).when(resourceLoaderMock).getClassLoader();
			SpringFactoriesLoader.ArgumentResolver argumentResolver = SpringFactoriesLoader.ArgumentResolver.none();
			springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target)).thenReturn(argumentResolver);
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			String[] stringArray = new String[] { "String[] args" };
			doNothing().when(target).configureEnvironment((ConfigurableEnvironment) null, stringArray);
			doNothing().when(target).bindToSpringApplication((ConfigurableEnvironment) null);
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader2, classLoader3).when(target).getClassLoader();
			doReturn(configurableApplicationContextMock).when(target).createApplicationContext();
			ApplicationStartup applicationStartup = ApplicationStartup.DEFAULT;
			doNothing().when(configurableApplicationContextMock).setApplicationStartup(applicationStartup);
			doNothing().when(configurableApplicationContextMock).setEnvironment((ConfigurableEnvironment) any());
			doReturn(null).when(configurableApplicationContextMock).getParent();
			doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
			doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springBootBanner"), (Banner) any());
			doNothing().when(configurableApplicationContextMock).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
			doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2).when(configurableApplicationContextMock).getBeanFactory();
			String[] stringArray2 = new String[] { "String[]" };
			doReturn(stringArray2).when(configurableListableBeanFactoryMock2).getBeanNamesForType(Runner.class);
			doReturn(runnerMock).when(configurableListableBeanFactoryMock2).getBean("String[]", Runner.class);
			doReturn(false).when(configurableApplicationContextMock).isRunning();
			doNothing().when(target).postProcessApplicationContext(configurableApplicationContextMock);
			doNothing().when(target).applyInitializers(configurableApplicationContextMock);
			doNothing().when(target).logStartupInfo(true);
			doNothing().when(target).logStartupProfileInfo(configurableApplicationContextMock);
			Set<Object> objectSet = new HashSet<>();
			doReturn(objectSet).when(target).getAllSources();
			Object[] objectArray = new Object[] {};
			doNothing().when(target).load(configurableApplicationContextMock, objectArray);
			doNothing().when(target).refresh(configurableApplicationContextMock);
			doNothing().when(target).afterRefresh(eq(configurableApplicationContextMock), (DefaultApplicationArguments) any());
			//TODO: Needs to return real value
			doReturn(null).when(target).getApplicationLog();
			String[] stringArray3 = new String[] { "String[] args" };
			//Act Statement(s)
			final SpringApplication.AbandonedRunException result = assertThrows(SpringApplication.AbandonedRunException.class, () -> {
				target.run(stringArray3);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(1));
				springApplicationStartup.verify(() -> SpringApplication.Startup.create(), atLeast(1));
				verify(springApplicationStartupMock, atLeast(1)).started();
				verify(springApplicationStartupMock, atLeast(1)).timeTakenToStarted();
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(1));
				verify(springFactoriesLoaderMock, atLeast(1)).load(eq(Object.class), (SpringFactoriesLoader.ArgumentResolver) any());
				configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) null), atLeast(1));
				defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) null), atLeast(1));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) any()), atLeast(1));
				aotDetector.verify(() -> AotDetector.useGeneratedArtifacts(), atLeast(2));
				_assert.verify(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty")), atLeast(1));
				verify(resourceLoaderMock, times(3)).getClassLoader();
				springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target), atLeast(1));
				verify(target, times(2)).getClassLoader();
				verify(target, atLeast(1)).configureEnvironment((ConfigurableEnvironment) null, stringArray);
				verify(target, atLeast(1)).bindToSpringApplication((ConfigurableEnvironment) null);
				verify(target, atLeast(1)).createApplicationContext();
				verify(configurableApplicationContextMock, atLeast(1)).setApplicationStartup(applicationStartup);
				verify(configurableApplicationContextMock, atLeast(1)).setEnvironment((ConfigurableEnvironment) any());
				verify(configurableApplicationContextMock, atLeast(1)).getParent();
				verify(configurableApplicationContextMock, times(2)).getBeanFactory();
				verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
				verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springBootBanner"), (Banner) any());
				verify(configurableApplicationContextMock, atLeast(1)).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
				verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);
				verify(configurableListableBeanFactoryMock2, atLeast(1)).getBean("String[]", Runner.class);
				verify(configurableApplicationContextMock, atLeast(1)).isRunning();
				verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);
				verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);
				verify(target, atLeast(1)).logStartupInfo(true);
				verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);
				verify(target, atLeast(1)).getAllSources();
				verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);
				verify(target, atLeast(1)).refresh(configurableApplicationContextMock);
				verify(target, atLeast(1)).afterRefresh(eq(configurableApplicationContextMock), (DefaultApplicationArguments) any());
				verify(target, atLeast(1)).getApplicationLog();
			});
		}
	}

	//Sapient generated method id: ${d3164a5d-0756-36d7-bfaa-12e2f652e42d}
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
		 *  Following variables could not be isolated/mocked: listeners, shutdownHook, org.springframework.boot.StartupInfoLogger
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//SpringApplication.Startup springApplicationStartupMock = mock(SpringApplication.Startup.class);
		//SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		//ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		//ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		//ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
		//Runner runnerMock = mock(Runner.class, "Object");
		//SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
		//SpringBootExceptionReporter springBootExceptionReporterMock = mock(SpringBootExceptionReporter.class, "List");
        /*try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
    MockedStatic<SpringFactoriesLoader.ArgumentResolver> springFactoriesLoaderArgumentResolver = mockStatic(SpringFactoriesLoader.ArgumentResolver.class, CALLS_REAL_METHODS);
    MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
    MockedStatic<AotDetector> aotDetector = mockStatic(AotDetector.class);
    MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
    MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
    MockedStatic<SpringApplication.Startup> springApplicationStartup = mockStatic(SpringApplication.Startup.class);
    MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
    ClassLoader classLoader5 = null;
    Class<?>[] classArray = new Class[] { Object.class };
    _assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
    SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
    SpringFactoriesLoader springFactoriesLoader3 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
    springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2).thenReturn(springFactoriesLoader3);
    springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
    //TODO: Needs to return real value
    doReturn(null).when(springApplicationStartupMock).started();
    Duration duration = Duration.ofDays(0L);
    doReturn(duration).when(springApplicationStartupMock).timeTakenToStarted();
    List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
    doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock).load(eq(Object.class), (SpringFactoriesLoader.ArgumentResolver) any());
    configurationPropertySources.when(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) null)).thenAnswer((Answer<Void>) invocation -> null);
    defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) null)).thenAnswer((Answer<Void>) invocation -> null);
    configurationPropertySources.when(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
    aotDetector.when(() -> AotDetector.useGeneratedArtifacts()).thenReturn(false);
    _assert.when(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty"))).thenAnswer((Answer<Void>) invocation -> null);
    SpringFactoriesLoader.ArgumentResolver argumentResolver = SpringFactoriesLoader.ArgumentResolver.none();
    springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(ConfigurableApplicationContext.class, configurableApplicationContextMock)).thenReturn(argumentResolver);
    ApplicationStartup applicationStartup = ApplicationStartup.DEFAULT;
    doNothing().when(configurableApplicationContextMock).setApplicationStartup(applicationStartup);
    doNothing().when(configurableApplicationContextMock).setEnvironment((ConfigurableEnvironment) any());
    doReturn(null).when(configurableApplicationContextMock).getParent();
    doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
    doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springBootBanner"), (Banner) any());
    doNothing().when(configurableApplicationContextMock).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
    doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2).when(configurableApplicationContextMock).getBeanFactory();
    String[] stringArray = new String[] { "String[]" };
    doReturn(stringArray).when(configurableListableBeanFactoryMock2).getBeanNamesForType(Runner.class);
    doReturn(runnerMock).when(configurableListableBeanFactoryMock2).getBean("String[]", Runner.class);
    doReturn(false).when(configurableApplicationContextMock).isActive();
    doNothing().when(configurableApplicationContextMock).close();
    springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2);
    Collection<SpringBootExceptionReporter> collection = new ArrayList<>();
    collection.add(springBootExceptionReporterMock);
    doReturn(collection).when(springFactoriesLoaderMock2).load(eq(Object.class), (SpringFactoriesLoader.ArgumentResolver) any());
    doReturn(false).when(springBootExceptionReporterMock).reportException((Throwable) null);
    target = spy(new SpringApplication(resourceLoaderMock, classArray));
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    target.setApplicationContextFactory(applicationContextFactoryMock);
    ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
    doReturn(null, classLoader5, classLoader).when(resourceLoaderMock).getClassLoader();
    ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
    String[] stringArray2 = new String[] { "String[] args" };
    doNothing().when(target).configureEnvironment((ConfigurableEnvironment) null, stringArray2);
    doNothing().when(target).bindToSpringApplication((ConfigurableEnvironment) null);
    ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
    doReturn(configurableApplicationContextMock).when(target).createApplicationContext();
    doNothing().when(target).postProcessApplicationContext(configurableApplicationContextMock);
    doNothing().when(target).applyInitializers(configurableApplicationContextMock);
    doNothing().when(target).logStartupInfo(true);
    doNothing().when(target).logStartupProfileInfo(configurableApplicationContextMock);
    Set<Object> objectSet = new HashSet<>();
    doReturn(objectSet).when(target).getAllSources();
    Object[] objectArray = new Object[] {};
    doNothing().when(target).load(configurableApplicationContextMock, objectArray);
    doNothing().when(target).refresh(configurableApplicationContextMock);
    doNothing().when(target).afterRefresh(eq(configurableApplicationContextMock), (DefaultApplicationArguments) any());
    //TODO: Needs to return real value
    doReturn(null).when(target).getApplicationLog();
    ClassLoader classLoader4 = ClassLoader.getPlatformClassLoader();
    doReturn(classLoader2, classLoader3, classLoader4).when(target).getClassLoader();
    doNothing().when(target).registerLoggedException((Throwable) null);
    String[] stringArray3 = new String[] { "String[] args" };
    //Act Statement(s)
    final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
        target.run(stringArray3);
    });
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(notNullValue()));
        _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
        webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
        springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(2));
        springApplicationStartup.verify(() -> SpringApplication.Startup.create(), atLeast(1));
        verify(springApplicationStartupMock, atLeast(1)).started();
        verify(springApplicationStartupMock, atLeast(1)).timeTakenToStarted();
        springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(2));
        verify(springFactoriesLoaderMock, atLeast(1)).load(eq(Object.class), (SpringFactoriesLoader.ArgumentResolver) any());
        configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) null), atLeast(1));
        defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) null), atLeast(1));
        configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) any()), atLeast(1));
        aotDetector.verify(() -> AotDetector.useGeneratedArtifacts(), atLeast(2));
        _assert.verify(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty")), atLeast(1));
        springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(ConfigurableApplicationContext.class, configurableApplicationContextMock), atLeast(1));
        verify(configurableApplicationContextMock, atLeast(1)).setApplicationStartup(applicationStartup);
        verify(configurableApplicationContextMock, atLeast(1)).setEnvironment((ConfigurableEnvironment) any());
        verify(configurableApplicationContextMock, atLeast(1)).getParent();
        verify(configurableApplicationContextMock, times(2)).getBeanFactory();
        verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
        verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springBootBanner"), (Banner) any());
        verify(configurableApplicationContextMock, atLeast(1)).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
        verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);
        verify(configurableListableBeanFactoryMock2, atLeast(1)).getBean("String[]", Runner.class);
        verify(configurableApplicationContextMock, atLeast(1)).isActive();
        verify(configurableApplicationContextMock, atLeast(1)).close();
        verify(springFactoriesLoaderMock2, atLeast(1)).load(eq(Object.class), (SpringFactoriesLoader.ArgumentResolver) any());
        verify(springBootExceptionReporterMock, atLeast(1)).reportException((Throwable) null);
        verify(resourceLoaderMock, times(3)).getClassLoader();
        verify(target, times(3)).getClassLoader();
        verify(target, atLeast(1)).configureEnvironment((ConfigurableEnvironment) null, stringArray2);
        verify(target, atLeast(1)).bindToSpringApplication((ConfigurableEnvironment) null);
        verify(target, atLeast(1)).createApplicationContext();
        verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);
        verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);
        verify(target, atLeast(1)).logStartupInfo(true);
        verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);
        verify(target, atLeast(1)).getAllSources();
        verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);
        verify(target, atLeast(1)).refresh(configurableApplicationContextMock);
        verify(target, atLeast(1)).afterRefresh(eq(configurableApplicationContextMock), (DefaultApplicationArguments) any());
        verify(target, atLeast(1)).getApplicationLog();
        verify(target, atLeast(1)).registerLoggedException((Throwable) null);
    });
}*/
	}

	//Sapient generated method id: ${47998f2c-e1fa-3346-b77b-7a9bf045784a}
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
		 * (listeners != null) : false  #  inside handleRunFailure method
		 * (for-each(exceptionReporters)) : false  #  inside reportFailure method
		 * (logger.isErrorEnabled()) : false  #  inside reportFailure method
		 * (context != null) : true  #  inside handleRunFailure method
		 * (exception instanceof RuntimeException runtimeException) : true  #  inside handleRunFailure method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: listeners, shutdownHook, org.springframework.boot.StartupInfoLogger
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringApplication.Startup springApplicationStartupMock = mock(SpringApplication.Startup.class);
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
		Runner runnerMock = mock(Runner.class, "Object");
		SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
		SpringBootExceptionReporter springBootExceptionReporterMock = mock(SpringBootExceptionReporter.class, "void");
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
			 MockedStatic<SpringFactoriesLoader.ArgumentResolver> springFactoriesLoaderArgumentResolver = mockStatic(SpringFactoriesLoader.ArgumentResolver.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
			 MockedStatic<AotDetector> aotDetector = mockStatic(AotDetector.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
			 MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
			 MockedStatic<SpringApplication.Startup> springApplicationStartup = mockStatic(SpringApplication.Startup.class);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
			ClassLoader classLoader5 = null;
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			SpringFactoriesLoader springFactoriesLoader3 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2).thenReturn(springFactoriesLoader3);
			springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
			//TODO: Needs to return real value
			doReturn(null).when(springApplicationStartupMock).started();
			Duration duration = Duration.ofDays(0L);
			doReturn(duration).when(springApplicationStartupMock).timeTakenToStarted();
			List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
			doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock).load(eq(Object.class), (SpringFactoriesLoader.ArgumentResolver) any());
			configurationPropertySources.when(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) null)).thenAnswer((Answer<Void>) invocation -> null);
			defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) null)).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertySources.when(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
			aotDetector.when(() -> AotDetector.useGeneratedArtifacts()).thenReturn(false);
			_assert.when(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty"))).thenAnswer((Answer<Void>) invocation -> null);
			SpringFactoriesLoader.ArgumentResolver argumentResolver = SpringFactoriesLoader.ArgumentResolver.none();
			springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(ConfigurableApplicationContext.class, configurableApplicationContextMock)).thenReturn(argumentResolver);
			ApplicationStartup applicationStartup = ApplicationStartup.DEFAULT;
			doNothing().when(configurableApplicationContextMock).setApplicationStartup(applicationStartup);
			doNothing().when(configurableApplicationContextMock).setEnvironment((ConfigurableEnvironment) any());
			doReturn(null).when(configurableApplicationContextMock).getParent();
			doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
			doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springBootBanner"), (Banner) any());
			doNothing().when(configurableApplicationContextMock).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
			doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2).when(configurableApplicationContextMock).getBeanFactory();
			String[] stringArray = new String[] { "void" };
			doReturn(stringArray).when(configurableListableBeanFactoryMock2).getBeanNamesForType(Runner.class);
			doReturn(runnerMock).when(configurableListableBeanFactoryMock2).getBean("void", Runner.class);
			doReturn(false).when(configurableApplicationContextMock).isActive();
			doNothing().when(configurableApplicationContextMock).close();
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2);
			Collection<SpringBootExceptionReporter> collection = new ArrayList<>();
			collection.add(springBootExceptionReporterMock);
			doReturn(collection).when(springFactoriesLoaderMock2).load(eq(Object.class), (SpringFactoriesLoader.ArgumentResolver) any());
			RuntimeException runtimeException = new RuntimeException();
			doReturn(false).when(springBootExceptionReporterMock).reportException(runtimeException);
			target = spy(new SpringApplication(resourceLoaderMock, classArray));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setApplicationContextFactory(applicationContextFactoryMock);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader5, classLoader).when(resourceLoaderMock).getClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			String[] stringArray2 = new String[] { "String[] args" };
			doNothing().when(target).configureEnvironment((ConfigurableEnvironment) null, stringArray2);
			doNothing().when(target).bindToSpringApplication((ConfigurableEnvironment) null);
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
			doReturn(configurableApplicationContextMock).when(target).createApplicationContext();
			doNothing().when(target).postProcessApplicationContext(configurableApplicationContextMock);
			doNothing().when(target).applyInitializers(configurableApplicationContextMock);
			doNothing().when(target).logStartupInfo(true);
			doNothing().when(target).logStartupProfileInfo(configurableApplicationContextMock);
			Set<Object> objectSet = new HashSet<>();
			doReturn(objectSet).when(target).getAllSources();
			Object[] objectArray = new Object[] {};
			doNothing().when(target).load(configurableApplicationContextMock, objectArray);
			doNothing().when(target).refresh(configurableApplicationContextMock);
			doNothing().when(target).afterRefresh(eq(configurableApplicationContextMock), (DefaultApplicationArguments) any());
			//TODO: Needs to return real value
			doReturn(null).when(target).getApplicationLog();
			ClassLoader classLoader4 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader2, classLoader3, classLoader4).when(target).getClassLoader();
			String[] stringArray3 = new String[] { "String[] args" };
			//Act Statement(s)
			final RuntimeException result = assertThrows(RuntimeException.class, () -> {
				target.run(stringArray3);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(runtimeException));
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(2));
				springApplicationStartup.verify(() -> SpringApplication.Startup.create(), atLeast(1));
				verify(springApplicationStartupMock, atLeast(1)).started();
				verify(springApplicationStartupMock, atLeast(1)).timeTakenToStarted();
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(2));
				verify(springFactoriesLoaderMock, atLeast(1)).load(eq(Object.class), (SpringFactoriesLoader.ArgumentResolver) any());
				configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) null), atLeast(1));
				defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) null), atLeast(1));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) any()), atLeast(1));
				aotDetector.verify(() -> AotDetector.useGeneratedArtifacts(), atLeast(2));
				_assert.verify(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty")), atLeast(1));
				springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(ConfigurableApplicationContext.class, configurableApplicationContextMock), atLeast(1));
				verify(configurableApplicationContextMock, atLeast(1)).setApplicationStartup(applicationStartup);
				verify(configurableApplicationContextMock, atLeast(1)).setEnvironment((ConfigurableEnvironment) any());
				verify(configurableApplicationContextMock, atLeast(1)).getParent();
				verify(configurableApplicationContextMock, times(2)).getBeanFactory();
				verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
				verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springBootBanner"), (Banner) any());
				verify(configurableApplicationContextMock, atLeast(1)).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
				verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);
				verify(configurableListableBeanFactoryMock2, atLeast(1)).getBean("void", Runner.class);
				verify(configurableApplicationContextMock, atLeast(1)).isActive();
				verify(configurableApplicationContextMock, atLeast(1)).close();
				verify(springFactoriesLoaderMock2, atLeast(1)).load(eq(Object.class), (SpringFactoriesLoader.ArgumentResolver) any());
				verify(springBootExceptionReporterMock, atLeast(1)).reportException(runtimeException);
				verify(resourceLoaderMock, times(3)).getClassLoader();
				verify(target, times(3)).getClassLoader();
				verify(target, atLeast(1)).configureEnvironment((ConfigurableEnvironment) null, stringArray2);
				verify(target, atLeast(1)).bindToSpringApplication((ConfigurableEnvironment) null);
				verify(target, atLeast(1)).createApplicationContext();
				verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);
				verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);
				verify(target, atLeast(1)).logStartupInfo(true);
				verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);
				verify(target, atLeast(1)).getAllSources();
				verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);
				verify(target, atLeast(1)).refresh(configurableApplicationContextMock);
				verify(target, atLeast(1)).afterRefresh(eq(configurableApplicationContextMock), (DefaultApplicationArguments) any());
				verify(target, atLeast(1)).getApplicationLog();
			});
		}
	}

	//Sapient generated method id: ${018a18ba-3224-3ac9-a6c0-8b5f893cf169}
	@Test()
	void runWhenReporterReportExceptionFailureAndContextIsNotNullAndExceptionNotInstanceOfRuntimeExceThrowsIllegalStateException() throws IllegalStateException, BeansException {
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
		 *  Following variables could not be isolated/mocked: listeners, shutdownHook, org.springframework.boot.StartupInfoLogger
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
		SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
		SpringApplication.Startup springApplicationStartupMock = mock(SpringApplication.Startup.class);
		SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
		ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
		Runner runnerMock = mock(Runner.class, "Object");
		SpringFactoriesLoader springFactoriesLoaderMock4 = mock(SpringFactoriesLoader.class);
		SpringBootExceptionReporter springBootExceptionReporterMock = mock(SpringBootExceptionReporter.class, "List");
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
			 MockedStatic<SpringFactoriesLoader.ArgumentResolver> springFactoriesLoaderArgumentResolver = mockStatic(SpringFactoriesLoader.ArgumentResolver.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
			 MockedStatic<AotDetector> aotDetector = mockStatic(AotDetector.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
			 MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
			 MockedStatic<SpringApplication.Startup> springApplicationStartup = mockStatic(SpringApplication.Startup.class);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
			Class<?>[] classArray = new Class[] {};
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.SERVLET);
			List<Object> objectList = new ArrayList<>();
			objectList.add(bootstrapRegistryInitializerMock);
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			doNothing().when(bootstrapRegistryInitializerMock).initialize((DefaultBootstrapContext) any());
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation(classLoader);
			springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
			//TODO: Needs to return real value
			doReturn(null).when(springApplicationStartupMock).started();
			Duration duration = Duration.ofDays(0L);
			doReturn(duration).when(springApplicationStartupMock).timeTakenToStarted();
			List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
			doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock3).load(eq(Object.class), (SpringFactoriesLoader.ArgumentResolver) any());
			configurationPropertySources.when(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
			defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
			aotDetector.when(() -> AotDetector.useGeneratedArtifacts()).thenReturn(false);
			_assert.when(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty"))).thenAnswer((Answer<Void>) invocation -> null);
			SpringFactoriesLoader.ArgumentResolver argumentResolver = SpringFactoriesLoader.ArgumentResolver.none();
			springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(ConfigurableApplicationContext.class, configurableApplicationContextMock)).thenReturn(argumentResolver);
			ApplicationStartup applicationStartup = ApplicationStartup.DEFAULT;
			doNothing().when(configurableApplicationContextMock).setApplicationStartup(applicationStartup);
			doNothing().when(configurableApplicationContextMock).setEnvironment((ConfigurableEnvironment) any());
			doReturn(null).when(configurableApplicationContextMock).getParent();
			doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
			doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springBootBanner"), (Banner) any());
			doNothing().when(configurableApplicationContextMock).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
			doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2).when(configurableApplicationContextMock).getBeanFactory();
			String[] stringArray = new String[] { "String[]" };
			doReturn(stringArray).when(configurableListableBeanFactoryMock2).getBeanNamesForType(Runner.class);
			doReturn(runnerMock).when(configurableListableBeanFactoryMock2).getBean("String[]", Runner.class);
			doReturn(false).when(configurableApplicationContextMock).isRunning();
			doReturn(false).when(configurableApplicationContextMock).isActive();
			doNothing().when(configurableApplicationContextMock).close();
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoader2).thenReturn(springFactoriesLoaderMock3).thenReturn(springFactoriesLoaderMock4);
			Collection<SpringBootExceptionReporter> collection = new ArrayList<>();
			collection.add(springBootExceptionReporterMock);
			doReturn(collection).when(springFactoriesLoaderMock4).load(eq(Object.class), (SpringFactoriesLoader.ArgumentResolver) any());
			doReturn(false).when(springBootExceptionReporterMock).reportException((Throwable) null);
			target = spy(new SpringApplication(resourceLoaderMock, classArray));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setApplicationContextFactory(applicationContextFactoryMock);
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader2, classLoader3, classLoader).when(resourceLoaderMock).getClassLoader();
			ClassLoader classLoader4 = ClassLoader.getPlatformClassLoader();
			String[] stringArray2 = new String[] {};
			doNothing().when(target).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray2));
			doNothing().when(target).bindToSpringApplication((ConfigurableEnvironment) any());
			ClassLoader classLoader5 = ClassLoader.getPlatformClassLoader();
			doReturn(configurableApplicationContextMock).when(target).createApplicationContext();
			doNothing().when(target).postProcessApplicationContext(configurableApplicationContextMock);
			doNothing().when(target).applyInitializers(configurableApplicationContextMock);
			doNothing().when(target).logStartupInfo(true);
			doNothing().when(target).logStartupProfileInfo(configurableApplicationContextMock);
			Set<Object> objectSet = new HashSet<>();
			doReturn(objectSet).when(target).getAllSources();
			Object[] objectArray = new Object[] {};
			doNothing().when(target).load(configurableApplicationContextMock, objectArray);
			doNothing().when(target).refresh(configurableApplicationContextMock);
			doNothing().when(target).afterRefresh(eq(configurableApplicationContextMock), (DefaultApplicationArguments) any());
			//TODO: Needs to return real value
			doReturn(null).when(target).getApplicationLog();
			ClassLoader classLoader6 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader4, classLoader5, classLoader6).when(target).getClassLoader();
			doNothing().when(target).registerLoggedException((Throwable) null);
			String[] stringArray3 = new String[] {};
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.run(stringArray3);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(5));
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(bootstrapRegistryInitializerMock, atLeast(1)).initialize((DefaultBootstrapContext) any());
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				springApplicationStartup.verify(() -> SpringApplication.Startup.create(), atLeast(1));
				verify(springApplicationStartupMock, atLeast(1)).started();
				verify(springApplicationStartupMock, atLeast(1)).timeTakenToStarted();
				verify(springFactoriesLoaderMock3, atLeast(1)).load(eq(Object.class), (SpringFactoriesLoader.ArgumentResolver) any());
				configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) any()), atLeast(2));
				defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any()), atLeast(1));
				aotDetector.verify(() -> AotDetector.useGeneratedArtifacts(), atLeast(2));
				_assert.verify(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty")), atLeast(1));
				springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(ConfigurableApplicationContext.class, configurableApplicationContextMock), atLeast(1));
				verify(configurableApplicationContextMock, atLeast(1)).setApplicationStartup(applicationStartup);
				verify(configurableApplicationContextMock, atLeast(1)).setEnvironment((ConfigurableEnvironment) any());
				verify(configurableApplicationContextMock, atLeast(1)).getParent();
				verify(configurableApplicationContextMock, times(2)).getBeanFactory();
				verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
				verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springBootBanner"), (Banner) any());
				verify(configurableApplicationContextMock, atLeast(1)).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
				verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);
				verify(configurableListableBeanFactoryMock2, atLeast(1)).getBean("String[]", Runner.class);
				verify(configurableApplicationContextMock, atLeast(1)).isRunning();
				verify(configurableApplicationContextMock, atLeast(1)).isActive();
				verify(configurableApplicationContextMock, atLeast(1)).close();
				verify(springFactoriesLoaderMock4, atLeast(1)).load(eq(Object.class), (SpringFactoriesLoader.ArgumentResolver) any());
				verify(springBootExceptionReporterMock, atLeast(1)).reportException((Throwable) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
				verify(target, times(3)).getClassLoader();
				verify(target, atLeast(1)).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray2));
				verify(target, atLeast(1)).bindToSpringApplication((ConfigurableEnvironment) any());
				verify(target, atLeast(1)).createApplicationContext();
				verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);
				verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);
				verify(target, atLeast(1)).logStartupInfo(true);
				verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);
				verify(target, atLeast(1)).getAllSources();
				verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);
				verify(target, atLeast(1)).refresh(configurableApplicationContextMock);
				verify(target, atLeast(1)).afterRefresh(eq(configurableApplicationContextMock), (DefaultApplicationArguments) any());
				verify(target, atLeast(1)).getApplicationLog();
				verify(target, atLeast(1)).registerLoggedException((Throwable) null);
			});
		}
	}

	//Sapient generated method id: ${1c16bcf4-118d-3712-a3e9-e2b279e1fef1}
	@Test()
	void runWhenContextIsNotNullAndExceptionInstanceOfRuntimeExceptionThrowsRuntimeException() throws IllegalStateException, BeansException {
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
		 *  Following variables could not be isolated/mocked: listeners, shutdownHook, org.springframework.boot.StartupInfoLogger
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringApplication.Startup springApplicationStartupMock = mock(SpringApplication.Startup.class);
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
		Runner runnerMock = mock(Runner.class, "Object");
		SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
		SpringBootExceptionReporter springBootExceptionReporterMock = mock(SpringBootExceptionReporter.class, "List");
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
			 MockedStatic<SpringFactoriesLoader.ArgumentResolver> springFactoriesLoaderArgumentResolver = mockStatic(SpringFactoriesLoader.ArgumentResolver.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
			 MockedStatic<AotDetector> aotDetector = mockStatic(AotDetector.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
			 MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
			 MockedStatic<SpringApplication.Startup> springApplicationStartup = mockStatic(SpringApplication.Startup.class);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
			ClassLoader classLoader5 = null;
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			SpringFactoriesLoader springFactoriesLoader3 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2).thenReturn(springFactoriesLoader3);
			springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
			//TODO: Needs to return real value
			doReturn(null).when(springApplicationStartupMock).started();
			Duration duration = Duration.ofDays(0L);
			doReturn(duration).when(springApplicationStartupMock).timeTakenToStarted();
			List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
			doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock).load(eq(Object.class), (SpringFactoriesLoader.ArgumentResolver) any());
			configurationPropertySources.when(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) null)).thenAnswer((Answer<Void>) invocation -> null);
			defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) null)).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertySources.when(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
			aotDetector.when(() -> AotDetector.useGeneratedArtifacts()).thenReturn(false);
			_assert.when(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty"))).thenAnswer((Answer<Void>) invocation -> null);
			SpringFactoriesLoader.ArgumentResolver argumentResolver = SpringFactoriesLoader.ArgumentResolver.none();
			springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(ConfigurableApplicationContext.class, configurableApplicationContextMock)).thenReturn(argumentResolver);
			ApplicationStartup applicationStartup = ApplicationStartup.DEFAULT;
			doNothing().when(configurableApplicationContextMock).setApplicationStartup(applicationStartup);
			doNothing().when(configurableApplicationContextMock).setEnvironment((ConfigurableEnvironment) any());
			doReturn(null).when(configurableApplicationContextMock).getParent();
			doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
			doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springBootBanner"), (Banner) any());
			doNothing().when(configurableApplicationContextMock).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
			doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2).when(configurableApplicationContextMock).getBeanFactory();
			String[] stringArray = new String[] { "String[]" };
			doReturn(stringArray).when(configurableListableBeanFactoryMock2).getBeanNamesForType(Runner.class);
			doReturn(runnerMock).when(configurableListableBeanFactoryMock2).getBean("String[]", Runner.class);
			doReturn(false).when(configurableApplicationContextMock).isRunning();
			doReturn(false).when(configurableApplicationContextMock).isActive();
			doNothing().when(configurableApplicationContextMock).close();
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2);
			Collection<SpringBootExceptionReporter> collection = new ArrayList<>();
			collection.add(springBootExceptionReporterMock);
			doReturn(collection).when(springFactoriesLoaderMock2).load(eq(Object.class), (SpringFactoriesLoader.ArgumentResolver) any());
			RuntimeException runtimeException = new RuntimeException();
			doReturn(false).when(springBootExceptionReporterMock).reportException(runtimeException);
			target = spy(new SpringApplication(resourceLoaderMock, classArray));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setApplicationContextFactory(applicationContextFactoryMock);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader5, classLoader).when(resourceLoaderMock).getClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			String[] stringArray2 = new String[] { "String[] args" };
			doNothing().when(target).configureEnvironment((ConfigurableEnvironment) null, stringArray2);
			doNothing().when(target).bindToSpringApplication((ConfigurableEnvironment) null);
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
			doReturn(configurableApplicationContextMock).when(target).createApplicationContext();
			doNothing().when(target).postProcessApplicationContext(configurableApplicationContextMock);
			doNothing().when(target).applyInitializers(configurableApplicationContextMock);
			doNothing().when(target).logStartupInfo(true);
			doNothing().when(target).logStartupProfileInfo(configurableApplicationContextMock);
			Set<Object> objectSet = new HashSet<>();
			doReturn(objectSet).when(target).getAllSources();
			Object[] objectArray = new Object[] {};
			doNothing().when(target).load(configurableApplicationContextMock, objectArray);
			doNothing().when(target).refresh(configurableApplicationContextMock);
			doNothing().when(target).afterRefresh(eq(configurableApplicationContextMock), (DefaultApplicationArguments) any());
			//TODO: Needs to return real value
			doReturn(null).when(target).getApplicationLog();
			ClassLoader classLoader4 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader2, classLoader3, classLoader4).when(target).getClassLoader();
			String[] stringArray3 = new String[] { "String[] args" };
			//Act Statement(s)
			final RuntimeException result = assertThrows(RuntimeException.class, () -> {
				target.run(stringArray3);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(runtimeException));
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(2));
				springApplicationStartup.verify(() -> SpringApplication.Startup.create(), atLeast(1));
				verify(springApplicationStartupMock, atLeast(1)).started();
				verify(springApplicationStartupMock, atLeast(1)).timeTakenToStarted();
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(2));
				verify(springFactoriesLoaderMock, atLeast(1)).load(eq(Object.class), (SpringFactoriesLoader.ArgumentResolver) any());
				configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) null), atLeast(1));
				defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) null), atLeast(1));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) any()), atLeast(1));
				aotDetector.verify(() -> AotDetector.useGeneratedArtifacts(), atLeast(2));
				_assert.verify(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty")), atLeast(1));
				springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(ConfigurableApplicationContext.class, configurableApplicationContextMock), atLeast(1));
				verify(configurableApplicationContextMock, atLeast(1)).setApplicationStartup(applicationStartup);
				verify(configurableApplicationContextMock, atLeast(1)).setEnvironment((ConfigurableEnvironment) any());
				verify(configurableApplicationContextMock, atLeast(1)).getParent();
				verify(configurableApplicationContextMock, times(2)).getBeanFactory();
				verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
				verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springBootBanner"), (Banner) any());
				verify(configurableApplicationContextMock, atLeast(1)).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
				verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);
				verify(configurableListableBeanFactoryMock2, atLeast(1)).getBean("String[]", Runner.class);
				verify(configurableApplicationContextMock, atLeast(1)).isRunning();
				verify(configurableApplicationContextMock, atLeast(1)).isActive();
				verify(configurableApplicationContextMock, atLeast(1)).close();
				verify(springFactoriesLoaderMock2, atLeast(1)).load(eq(Object.class), (SpringFactoriesLoader.ArgumentResolver) any());
				verify(springBootExceptionReporterMock, atLeast(1)).reportException(runtimeException);
				verify(resourceLoaderMock, times(3)).getClassLoader();
				verify(target, times(3)).getClassLoader();
				verify(target, atLeast(1)).configureEnvironment((ConfigurableEnvironment) null, stringArray2);
				verify(target, atLeast(1)).bindToSpringApplication((ConfigurableEnvironment) null);
				verify(target, atLeast(1)).createApplicationContext();
				verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);
				verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);
				verify(target, atLeast(1)).logStartupInfo(true);
				verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);
				verify(target, atLeast(1)).getAllSources();
				verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);
				verify(target, atLeast(1)).refresh(configurableApplicationContextMock);
				verify(target, atLeast(1)).afterRefresh(eq(configurableApplicationContextMock), (DefaultApplicationArguments) any());
				verify(target, atLeast(1)).getApplicationLog();
			});
		}
	}

	//Sapient generated method id: ${3f2cf019-c6ea-3c61-88de-b8bf0eae667a}
	@Test()
	void runWhenExceptionReportersIsEmptyAndLoggerNotIsErrorEnabledAndContextIsNotNullAndExceptionNotThrowsIllegalStateException() throws IllegalStateException, BeansException {
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
		 * (listeners != null) : false  #  inside handleRunFailure method
		 * (for-each(exceptionReporters)) : false  #  inside reportFailure method
		 * (logger.isErrorEnabled()) : false  #  inside reportFailure method
		 * (context != null) : true  #  inside handleRunFailure method
		 * (exception instanceof RuntimeException runtimeException) : false  #  inside handleRunFailure method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: listeners, shutdownHook, org.springframework.boot.StartupInfoLogger
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringApplication.Startup springApplicationStartupMock = mock(SpringApplication.Startup.class);
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
		Runner runnerMock = mock(Runner.class, "Object");
		SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
		SpringBootExceptionReporter springBootExceptionReporterMock = mock(SpringBootExceptionReporter.class, "void");
		SpringBootExceptionHandler springBootExceptionHandlerMock = mock(SpringBootExceptionHandler.class);
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
			 MockedStatic<SpringFactoriesLoader.ArgumentResolver> springFactoriesLoaderArgumentResolver = mockStatic(SpringFactoriesLoader.ArgumentResolver.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
			 MockedStatic<AotDetector> aotDetector = mockStatic(AotDetector.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
			 MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
			 MockedStatic<SpringApplication.Startup> springApplicationStartup = mockStatic(SpringApplication.Startup.class);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
			ClassLoader classLoader5 = null;
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.REACTIVE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			SpringFactoriesLoader springFactoriesLoader3 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2).thenReturn(springFactoriesLoader3);
			springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
			//TODO: Needs to return real value
			doReturn(null).when(springApplicationStartupMock).started();
			Duration duration = Duration.ofDays(0L);
			doReturn(duration).when(springApplicationStartupMock).timeTakenToStarted();
			List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
			doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock).load(eq(Object.class), (SpringFactoriesLoader.ArgumentResolver) any());
			configurationPropertySources.when(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
			defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
			aotDetector.when(() -> AotDetector.useGeneratedArtifacts()).thenReturn(false);
			_assert.when(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty"))).thenAnswer((Answer<Void>) invocation -> null);
			SpringFactoriesLoader.ArgumentResolver argumentResolver = SpringFactoriesLoader.ArgumentResolver.none();
			springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(ConfigurableApplicationContext.class, configurableApplicationContextMock)).thenReturn(argumentResolver);
			ApplicationStartup applicationStartup = ApplicationStartup.DEFAULT;
			doNothing().when(configurableApplicationContextMock).setApplicationStartup(applicationStartup);
			doNothing().when(configurableApplicationContextMock).setEnvironment((ConfigurableEnvironment) any());
			doReturn(null).when(configurableApplicationContextMock).getParent();
			doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
			doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springBootBanner"), (Banner) any());
			doNothing().when(configurableApplicationContextMock).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
			doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2).when(configurableApplicationContextMock).getBeanFactory();
			String[] stringArray = new String[] { "String[]" };
			doReturn(stringArray).when(configurableListableBeanFactoryMock2).getBeanNamesForType(Runner.class);
			doReturn(runnerMock).when(configurableListableBeanFactoryMock2).getBean("String[]", Runner.class);
			doReturn(false).when(configurableApplicationContextMock).isActive();
			doNothing().when(configurableApplicationContextMock).publishEvent((ExitCodeEvent) any());
			doNothing().when(configurableApplicationContextMock).close();
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2);
			Collection<SpringBootExceptionReporter> collection = new ArrayList<>();
			collection.add(springBootExceptionReporterMock);
			doReturn(collection).when(springFactoriesLoaderMock2).load(eq(Object.class), (SpringFactoriesLoader.ArgumentResolver) any());
			Throwable throwable = new Throwable("message1", (Throwable) null);
			doReturn(true).when(springBootExceptionReporterMock).reportException(throwable);
			target = spy(new SpringApplication(resourceLoaderMock, classArray));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setApplicationContextFactory(applicationContextFactoryMock);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader5, classLoader).when(resourceLoaderMock).getClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			String[] stringArray2 = new String[] { "String[] args" };
			doNothing().when(target).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray2));
			doNothing().when(target).bindToSpringApplication((ConfigurableEnvironment) any());
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
			doReturn(configurableApplicationContextMock).when(target).createApplicationContext();
			doNothing().when(target).postProcessApplicationContext(configurableApplicationContextMock);
			doNothing().when(target).applyInitializers(configurableApplicationContextMock);
			doNothing().when(target).logStartupInfo(true);
			doNothing().when(target).logStartupProfileInfo(configurableApplicationContextMock);
			Set<Object> objectSet = new HashSet<>();
			doReturn(objectSet).when(target).getAllSources();
			Object[] objectArray = new Object[] {};
			doNothing().when(target).load(configurableApplicationContextMock, objectArray);
			doNothing().when(target).refresh(configurableApplicationContextMock);
			doNothing().when(target).afterRefresh(eq(configurableApplicationContextMock), (DefaultApplicationArguments) any());
			//TODO: Needs to return real value
			doReturn(null).when(target).getApplicationLog();
			doReturn(springBootExceptionHandlerMock).when(target).getSpringBootExceptionHandler();
			doNothing().when(springBootExceptionHandlerMock).registerExitCode(1);
			ClassLoader classLoader4 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader2, classLoader3, classLoader4).when(target).getClassLoader();
			doNothing().when(target).registerLoggedException(throwable);
			String[] stringArray3 = new String[] { "String[] args" };
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.run(stringArray3);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getCause(), is(instanceOf(throwable.getClass())));
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(2));
				springApplicationStartup.verify(() -> SpringApplication.Startup.create(), atLeast(1));
				verify(springApplicationStartupMock, atLeast(1)).started();
				verify(springApplicationStartupMock, atLeast(1)).timeTakenToStarted();
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(2));
				verify(springFactoriesLoaderMock, atLeast(1)).load(eq(Object.class), (SpringFactoriesLoader.ArgumentResolver) any());
				configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) any()), atLeast(2));
				defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any()), atLeast(1));
				aotDetector.verify(() -> AotDetector.useGeneratedArtifacts(), atLeast(2));
				_assert.verify(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty")), atLeast(1));
				springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(ConfigurableApplicationContext.class, configurableApplicationContextMock), atLeast(1));
				verify(configurableApplicationContextMock, atLeast(1)).setApplicationStartup(applicationStartup);
				verify(configurableApplicationContextMock, atLeast(1)).setEnvironment((ConfigurableEnvironment) any());
				verify(configurableApplicationContextMock, atLeast(1)).getParent();
				verify(configurableApplicationContextMock, times(2)).getBeanFactory();
				verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
				verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springBootBanner"), (Banner) any());
				verify(configurableApplicationContextMock, atLeast(1)).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
				verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);
				verify(configurableListableBeanFactoryMock2, atLeast(1)).getBean("String[]", Runner.class);
				verify(configurableApplicationContextMock, atLeast(1)).isActive();
				verify(configurableApplicationContextMock, atLeast(1)).publishEvent((ExitCodeEvent) any());
				verify(configurableApplicationContextMock, atLeast(1)).close();
				verify(springFactoriesLoaderMock2, atLeast(1)).load(eq(Object.class), (SpringFactoriesLoader.ArgumentResolver) any());
				verify(springBootExceptionReporterMock, atLeast(1)).reportException(throwable);
				verify(resourceLoaderMock, times(3)).getClassLoader();
				verify(target, times(3)).getClassLoader();
				verify(target, atLeast(1)).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray2));
				verify(target, atLeast(1)).bindToSpringApplication((ConfigurableEnvironment) any());
				verify(target, atLeast(1)).createApplicationContext();
				verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);
				verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);
				verify(target, atLeast(1)).logStartupInfo(true);
				verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);
				verify(target, atLeast(1)).getAllSources();
				verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);
				verify(target, atLeast(1)).refresh(configurableApplicationContextMock);
				verify(target, atLeast(1)).afterRefresh(eq(configurableApplicationContextMock), (DefaultApplicationArguments) any());
				verify(target, atLeast(1)).getApplicationLog();
				verify(target, atLeast(1)).getSpringBootExceptionHandler();
				verify(springBootExceptionHandlerMock, atLeast(1)).registerExitCode(1);
				verify(target, atLeast(1)).registerLoggedException(throwable);
			});
		}
	}

	//Sapient generated method id: ${e0f442ca-4495-38d9-8886-c07c87b2a590}
	@Test()
	void runWhenLoggerNotIsErrorEnabledAndContextIsNotNullAndExceptionNotInstanceOfRuntimeException2ThrowsIllegalStateException() throws IllegalStateException, BeansException {
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
		 *  Following variables could not be isolated/mocked: listeners, shutdownHook, org.springframework.boot.StartupInfoLogger
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringApplication.Startup springApplicationStartupMock = mock(SpringApplication.Startup.class);
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
		Runner runnerMock = mock(Runner.class, "Object");
		SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
		SpringBootExceptionReporter springBootExceptionReporterMock = mock(SpringBootExceptionReporter.class, "List");
		SpringBootExceptionHandler springBootExceptionHandlerMock = mock(SpringBootExceptionHandler.class);
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
			 MockedStatic<SpringFactoriesLoader.ArgumentResolver> springFactoriesLoaderArgumentResolver = mockStatic(SpringFactoriesLoader.ArgumentResolver.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
			 MockedStatic<AotDetector> aotDetector = mockStatic(AotDetector.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
			 MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
			 MockedStatic<SpringApplication.Startup> springApplicationStartup = mockStatic(SpringApplication.Startup.class);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
			ClassLoader classLoader5 = null;
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.REACTIVE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			SpringFactoriesLoader springFactoriesLoader3 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2).thenReturn(springFactoriesLoader3);
			springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
			//TODO: Needs to return real value
			doReturn(null).when(springApplicationStartupMock).started();
			Duration duration = Duration.ofDays(0L);
			doReturn(duration).when(springApplicationStartupMock).timeTakenToStarted();
			List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
			doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock).load(eq(Object.class), (SpringFactoriesLoader.ArgumentResolver) any());
			configurationPropertySources.when(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
			defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
			aotDetector.when(() -> AotDetector.useGeneratedArtifacts()).thenReturn(false);
			_assert.when(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty"))).thenAnswer((Answer<Void>) invocation -> null);
			SpringFactoriesLoader.ArgumentResolver argumentResolver = SpringFactoriesLoader.ArgumentResolver.none();
			springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(ConfigurableApplicationContext.class, configurableApplicationContextMock)).thenReturn(argumentResolver);
			ApplicationStartup applicationStartup = ApplicationStartup.DEFAULT;
			doNothing().when(configurableApplicationContextMock).setApplicationStartup(applicationStartup);
			doNothing().when(configurableApplicationContextMock).setEnvironment((ConfigurableEnvironment) any());
			doReturn(null).when(configurableApplicationContextMock).getParent();
			doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
			doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springBootBanner"), (Banner) any());
			doNothing().when(configurableApplicationContextMock).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
			doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2).when(configurableApplicationContextMock).getBeanFactory();
			String[] stringArray = new String[] { "String[]" };
			doReturn(stringArray).when(configurableListableBeanFactoryMock2).getBeanNamesForType(Runner.class);
			doReturn(runnerMock).when(configurableListableBeanFactoryMock2).getBean("String[]", Runner.class);
			doReturn(false).when(configurableApplicationContextMock).isRunning();
			doReturn(false).when(configurableApplicationContextMock).isActive();
			doNothing().when(configurableApplicationContextMock).publishEvent((ExitCodeEvent) any());
			doNothing().when(configurableApplicationContextMock).close();
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2);
			Collection<SpringBootExceptionReporter> collection = new ArrayList<>();
			collection.add(springBootExceptionReporterMock);
			doReturn(collection).when(springFactoriesLoaderMock2).load(eq(Object.class), (SpringFactoriesLoader.ArgumentResolver) any());
			Throwable throwable = new Throwable("message1", (Throwable) null);
			doReturn(true).when(springBootExceptionReporterMock).reportException(throwable);
			target = spy(new SpringApplication(resourceLoaderMock, classArray));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setApplicationContextFactory(applicationContextFactoryMock);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader5, classLoader).when(resourceLoaderMock).getClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			String[] stringArray2 = new String[] { "String[] args" };
			doNothing().when(target).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray2));
			doNothing().when(target).bindToSpringApplication((ConfigurableEnvironment) any());
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
			doReturn(configurableApplicationContextMock).when(target).createApplicationContext();
			doNothing().when(target).postProcessApplicationContext(configurableApplicationContextMock);
			doNothing().when(target).applyInitializers(configurableApplicationContextMock);
			doNothing().when(target).logStartupInfo(true);
			doNothing().when(target).logStartupProfileInfo(configurableApplicationContextMock);
			Set<Object> objectSet = new HashSet<>();
			doReturn(objectSet).when(target).getAllSources();
			Object[] objectArray = new Object[] {};
			doNothing().when(target).load(configurableApplicationContextMock, objectArray);
			doNothing().when(target).refresh(configurableApplicationContextMock);
			doNothing().when(target).afterRefresh(eq(configurableApplicationContextMock), (DefaultApplicationArguments) any());
			//TODO: Needs to return real value
			doReturn(null).when(target).getApplicationLog();
			doReturn(springBootExceptionHandlerMock).when(target).getSpringBootExceptionHandler();
			doNothing().when(springBootExceptionHandlerMock).registerExitCode(1);
			ClassLoader classLoader4 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader2, classLoader3, classLoader4).when(target).getClassLoader();
			doNothing().when(target).registerLoggedException(throwable);
			String[] stringArray3 = new String[] { "String[] args" };
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.run(stringArray3);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getCause(), is(instanceOf(throwable.getClass())));
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(2));
				springApplicationStartup.verify(() -> SpringApplication.Startup.create(), atLeast(1));
				verify(springApplicationStartupMock, atLeast(1)).started();
				verify(springApplicationStartupMock, atLeast(1)).timeTakenToStarted();
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(2));
				verify(springFactoriesLoaderMock, atLeast(1)).load(eq(Object.class), (SpringFactoriesLoader.ArgumentResolver) any());
				configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) any()), atLeast(2));
				defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any()), atLeast(1));
				aotDetector.verify(() -> AotDetector.useGeneratedArtifacts(), atLeast(2));
				_assert.verify(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty")), atLeast(1));
				springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(ConfigurableApplicationContext.class, configurableApplicationContextMock), atLeast(1));
				verify(configurableApplicationContextMock, atLeast(1)).setApplicationStartup(applicationStartup);
				verify(configurableApplicationContextMock, atLeast(1)).setEnvironment((ConfigurableEnvironment) any());
				verify(configurableApplicationContextMock, atLeast(1)).getParent();
				verify(configurableApplicationContextMock, times(2)).getBeanFactory();
				verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
				verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springBootBanner"), (Banner) any());
				verify(configurableApplicationContextMock, atLeast(1)).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
				verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);
				verify(configurableListableBeanFactoryMock2, atLeast(1)).getBean("String[]", Runner.class);
				verify(configurableApplicationContextMock, atLeast(1)).isRunning();
				verify(configurableApplicationContextMock, atLeast(1)).isActive();
				verify(configurableApplicationContextMock, atLeast(1)).publishEvent((ExitCodeEvent) any());
				verify(configurableApplicationContextMock, atLeast(1)).close();
				verify(springFactoriesLoaderMock2, atLeast(1)).load(eq(Object.class), (SpringFactoriesLoader.ArgumentResolver) any());
				verify(springBootExceptionReporterMock, atLeast(1)).reportException(throwable);
				verify(resourceLoaderMock, times(3)).getClassLoader();
				verify(target, times(3)).getClassLoader();
				verify(target, atLeast(1)).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray2));
				verify(target, atLeast(1)).bindToSpringApplication((ConfigurableEnvironment) any());
				verify(target, atLeast(1)).createApplicationContext();
				verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);
				verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);
				verify(target, atLeast(1)).logStartupInfo(true);
				verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);
				verify(target, atLeast(1)).getAllSources();
				verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);
				verify(target, atLeast(1)).refresh(configurableApplicationContextMock);
				verify(target, atLeast(1)).afterRefresh(eq(configurableApplicationContextMock), (DefaultApplicationArguments) any());
				verify(target, atLeast(1)).getApplicationLog();
				verify(target, atLeast(1)).getSpringBootExceptionHandler();
				verify(springBootExceptionHandlerMock, atLeast(1)).registerExitCode(1);
				verify(target, atLeast(1)).registerLoggedException(throwable);
			});
		}
	}

	//Sapient generated method id: ${efc3cab0-063e-3c5f-8652-a491c759f58f}
	@Test()
	void configureEnvironmentWhenThisAddConversionService() {
		/* Branches:
		 * (this.addConversionService) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doNothing().when(environmentMock).setConversionService((ApplicationConversionService) any());
			Class<?>[] classArray = new Class[] {};
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			List<Object> objectList = new ArrayList<>();
			objectList.add(bootstrapRegistryInitializerMock);
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = spy(new SpringApplication(resourceLoaderMock, classArray));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
			String[] stringArray = new String[] {};
			doNothing().when(target).configurePropertySources(environmentMock, stringArray);
			doNothing().when(target).configureProfiles(environmentMock, stringArray);
			//Act Statement(s)
			target.configureEnvironment(environmentMock, stringArray);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(environmentMock, atLeast(1)).setConversionService((ApplicationConversionService) any());
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
				verify(target, atLeast(1)).configurePropertySources(environmentMock, stringArray);
				verify(target, atLeast(1)).configureProfiles(environmentMock, stringArray);
			});
		}
	}

	//Sapient generated method id: ${88a727de-fe97-3c21-b604-9fc8b26ac544}
	@Test()
	void configurePropertySourcesWhenSourcesContainsName() {
		/* Branches:
		 * (!CollectionUtils.isEmpty(this.defaultProperties)) : false
		 * (this.addCommandLineProperties) : true
		 * (args.length > 0) : true
		 * (sources.contains(name)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: composite
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doNothing().when(mutablePropertySourcesMock).replace(eq("commandLineArgs"), (CompositePropertySource) any());
			Class<?>[] classArray = new Class[] {};
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			List<Object> objectList = new ArrayList<>();
			objectList.add(bootstrapRegistryInitializerMock);
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
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
				verify(mutablePropertySourcesMock, atLeast(1)).replace(eq("commandLineArgs"), (CompositePropertySource) any());
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${4919c374-d7fd-3f9f-82b7-ad194f8b70fd}
	@Test()
	void configurePropertySourcesWhenSourcesNotContainsName() {
		/* Branches:
		 * (!CollectionUtils.isEmpty(this.defaultProperties)) : false
		 * (this.addCommandLineProperties) : true
		 * (args.length > 0) : true
		 * (sources.contains(name)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doNothing().when(mutablePropertySourcesMock).addFirst((SimpleCommandLinePropertySource) any());
			Class<?>[] classArray = new Class[] {};
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			List<Object> objectList = new ArrayList<>();
			objectList.add(bootstrapRegistryInitializerMock);
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
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
				verify(mutablePropertySourcesMock, atLeast(1)).addFirst((SimpleCommandLinePropertySource) any());
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${184ddb7b-6070-394a-bf3a-8807bda19b7f}
	@Test()
	void bindToSpringApplicationTest() throws Exception {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				binder.verify(() -> Binder.get(configurableEnvironmentMock), atLeast(1));
				verify(binderMock, atLeast(1)).bind("spring.main", bindableMock);
				verify(resourceLoaderMock, times(3)).getClassLoader();
				bindable.verify(() -> Bindable.ofInstance(target), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${890d1e16-f411-30d8-8955-b00f093a4f32}
	@Test()
	void bindToSpringApplicationWhenCaughtExceptionThrowsIllegalStateException() {
		/* Branches:
		 * (catch-exception (Exception)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				binder.verify(() -> Binder.get(configurableEnvironmentMock), atLeast(1));
				verify(binderMock, atLeast(1)).bind("spring.main", bindableMock);
				verify(resourceLoaderMock, times(3)).getClassLoader();
				bindable.verify(() -> Bindable.ofInstance(target), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${b23810c3-dac9-3d30-ac48-d7155f542c94}
	@Test()
	void createApplicationContextTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setApplicationContextFactory(applicationContextFactoryMock);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
			//Act Statement(s)
			ConfigurableApplicationContext result = target.createApplicationContext();
			ConfigurableApplicationContext configurableApplicationContext = applicationContextFactoryMock.create(WebApplicationType.REACTIVE);
			//Assert statement(s)
			//TODO: Please implement equals method in ConfigurableApplicationContext for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(configurableApplicationContext));
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${212b5c97-e6ec-340e-86c7-b3128cd97492}
	@Test()
	void postProcessApplicationContextWhenContextInstanceOfDefaultResourceLoaderAndThisAddConversionService() throws IllegalStateException {
		/* Branches:
		 * (this.beanNameGenerator != null) : false
		 * (this.resourceLoader != null) : true
		 * (context instanceof GenericApplicationContext genericApplicationContext) : true
		 * (context instanceof DefaultResourceLoader defaultResourceLoader) : true
		 * (this.addConversionService) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(4)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${fe1d6de4-9f0b-30ee-bd41-02e2cb0fc896}
	@Test()
	void applyInitializersWhenGetInitializersIsNotEmpty() {
		/* Branches:
		 * (for-each(getInitializers())) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
		SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
		ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		ApplicationContextInitializer<?> applicationContextInitializerMock = mock(ApplicationContextInitializer.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<GenericTypeResolver> genericTypeResolver = mockStatic(GenericTypeResolver.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
			Class<?>[] classArray = new Class[] {};
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			List<Object> objectList = new ArrayList<>();
			objectList.add(bootstrapRegistryInitializerMock);
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				genericTypeResolver.verify(() -> GenericTypeResolver.resolveTypeArgument(ApplicationContextInitializer.class, ApplicationContextInitializer.class), atLeast(1));
				_assert.verify(() -> Assert.isInstanceOf(Object.class, configurableApplicationContextMock, "Unable to call initializer."), atLeast(1));
				verify(resourceLoaderMock, times(3)).getClassLoader();
				verify(target, atLeast(1)).getInitializers();
				verify(applicationContextInitializerMock, atLeast(1)).initialize(configurableApplicationContextMock);
			});
		}
	}

	//Sapient generated method id: ${4d3f5881-2df7-36f6-ba0e-d378cc1c9961}
	@Test()
	void logStartupInfoWhenIsRoot() {
		/* Branches:
		 * (isRoot) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: org.springframework.boot.StartupInfoLogger
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = spy(new SpringApplication(resourceLoaderMock, classArray));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
			//TODO: Needs to return real value
			doReturn(null).when(target).getApplicationLog();
			//Act Statement(s)
			target.logStartupInfo(true);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
				verify(target, atLeast(1)).getApplicationLog();
			});
		}
	}

	//Sapient generated method id: ${daa4637c-936e-33d8-b273-174c851b7d1f}
	@Test()
	void logStartupProfileInfoWhenDefaultProfilesSizeLessThanOrEqualsTo1() {
		/* Branches:
		 * (log.isInfoEnabled()) : true
		 * (ObjectUtils.isEmpty(activeProfiles)) : true
		 * (defaultProfiles.size() <= 1) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = spy(new SpringApplication(resourceLoaderMock, classArray));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
			//TODO: Needs to return real value
			doReturn(null).when(target).getApplicationLog();
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
				verify(target, atLeast(1)).getApplicationLog();
			});
		}
	}

	//Sapient generated method id: ${12ba3654-5a20-3d01-9ac3-101c24d7b881}
	@Test()
	void getApplicationLogWhenThisMainApplicationClassIsNull() {
		/* Branches:
		 * (this.mainApplicationClass == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
			//Act Statement(s)
			Log result = target.getApplicationLog();
			Log log = LogFactory.getLog(SpringApplication.class);
			//Assert statement(s)
			//TODO: Please implement equals method in Log for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(log));
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${bada0cae-59b1-3cf6-9e9d-f0ac2dfb489f}
	@Test()
	void loadWhenContextNotInstanceOfAbstractApplicationContextThrowsIllegalStateException() {
		/* Branches:
		 * (logger.isDebugEnabled()) : true
		 * (context instanceof BeanDefinitionRegistry registry) : false  #  inside getBeanDefinitionRegistry method
		 * (context instanceof AbstractApplicationContext abstractApplicationContext) : false  #  inside getBeanDefinitionRegistry method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				stringUtils.verify(() -> StringUtils.arrayToCommaDelimitedString(objectArray), atLeast(1));
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${9c00b33b-c8a9-3d56-a6c8-a065898a22cf}
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
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				stringUtils.verify(() -> StringUtils.arrayToCommaDelimitedString(objectArray), atLeast(1));
				verify(resourceLoaderMock, times(3)).getClassLoader();
				verify(target, atLeast(1)).createBeanDefinitionLoader(beanDefinitionRegistryMock, objectArray);
				verify(beanDefinitionLoaderMock, atLeast(1)).setResourceLoader(resourceLoaderMock);
				verify(beanDefinitionLoaderMock, atLeast(1)).load();
			});
		}
	}

	//Sapient generated method id: ${42bd8e04-a447-3f2d-8974-3d8cc8bc6382}
	@Test()
	void getClassLoaderWhenThisResourceLoaderIsNotNull() {
		/* Branches:
		 * (this.resourceLoader != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(4)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${3225fa7f-29dc-3094-b54a-9418ca3a1291}
	@Test()
	void getClassLoaderWhenThisResourceLoaderIsNull() {
		/* Branches:
		 * (this.resourceLoader != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = new SpringApplication((ResourceLoader) null, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			ClassLoader result = target.getClassLoader();
			ClassLoader classLoader = ClassUtils.getDefaultClassLoader();
			//Assert statement(s)
			//TODO: Please implement equals method in ClassLoader for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(classLoader));
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			});
		}
	}

	//Sapient generated method id: ${63370684-1d57-3cda-a9f9-2089947d8a17}
	@Test()
	void createBeanDefinitionLoaderTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
			Object[] objectArray = new Object[] {};
			//Act Statement(s)
			BeanDefinitionLoader result = target.createBeanDefinitionLoader(beanDefinitionRegistryMock, objectArray);
			BeanDefinitionLoader beanDefinitionLoader = new BeanDefinitionLoader(beanDefinitionRegistryMock, objectArray);
			//Assert statement(s)
			//TODO: Please implement equals method in BeanDefinitionLoader for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(beanDefinitionLoader));
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${3ebd3d04-76b3-320f-b304-f0b6a8fe009f}
	@Test()
	void refreshTest() throws BeansException, IllegalStateException {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${4a576cbb-85af-3f7f-a0a4-d2bcf1755ecd}
	@Test()
	void registerLoggedExceptionWhenHandlerIsNotNull() {
		/* Branches:
		 * (handler != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
				verify(target, atLeast(1)).getSpringBootExceptionHandler();
				verify(springBootExceptionHandlerMock, atLeast(1)).registerLoggedException(throwable);
			});
		}
	}

	//Sapient generated method id: ${2183ec8d-e159-326b-b1a0-fcaea33dd430}
	@Test()
	void getSpringBootExceptionHandlerWhenIsMainThreadNotThreadCurrentThread() {
		/* Branches:
		 * ("main".equals(currentThread.getName())) : false  #  inside isMainThread method
		 * ("restartedMain".equals(currentThread.getName())) : false  #  inside isMainThread method
		 * (isMainThread(Thread.currentThread())) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${cfe5d614-23fb-3836-bd5d-b3a4127ae5c2}
	@Test()
	void setWebApplicationTypeTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				_assert.verify(() -> Assert.notNull(WebApplicationType.REACTIVE, "WebApplicationType must not be null"), atLeast(1));
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${7a567995-faa8-3e43-85fb-47f2d1dbef8c}
	@Test()
	void addBootstrapRegistryInitializerTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				_assert.verify(() -> Assert.notNull(bootstrapRegistryInitializerMock2, "BootstrapRegistryInitializer must not be null"), atLeast(1));
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${7bf9f5d4-184c-3a39-934e-7f7001221353}
	@Test()
	void setDefaultProperties1WhenCollectionsListDefaultPropertiesPropertyNamesIsNotEmpty() {
		/* Branches:
		 * (for-each(Collections.list(defaultProperties.propertyNames()))) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${ca0a65e6-fc8d-3f7b-89c4-6575e2140f17}
	@Test()
	void setAdditionalProfilesTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${62e170bc-1441-3662-bd95-fcc548180549}
	@Test()
	void setEnvironmentTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${8bb24f6d-f691-3a0b-9b67-f93813cee29d}
	@Test()
	void addPrimarySourcesTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${b266c308-ccb6-3103-9704-4dad9dcc13c6}
	@Test()
	void setSourcesTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				_assert.verify(() -> Assert.notNull(anySet(), eq("Sources must not be null")), atLeast(1));
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${7ca4ab72-66ec-3ee8-92d8-d83ade4d10e2}
	@Test()
	void getAllSourcesWhenCollectionUtilsIsEmptyThisSources() {
		/* Branches:
		 * (!CollectionUtils.isEmpty(this.primarySources)) : true
		 * (!CollectionUtils.isEmpty(this.sources)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			collectionUtils.when(() -> CollectionUtils.isEmpty(any())).thenReturn(false);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
			//Act Statement(s)
			Set<Object> result = target.getAllSources();
			Object object = new Object();
			Set<Object> objectResultSet = new HashSet<>();
			objectResultSet.add(object);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(objectResultSet.size()));
				assertThat(result, containsInAnyOrder(objectResultSet.toArray()));
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				collectionUtils.verify(() -> CollectionUtils.isEmpty(any()), atLeast(1));
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${2a4d4666-3ec6-3350-bbd2-d61740db6402}
	@Test()
	void setResourceLoaderTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			_assert.when(() -> Assert.notNull(resourceLoaderMock2, "ResourceLoader must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
			//Act Statement(s)
			target.setResourceLoader(resourceLoaderMock2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(target.getResourceLoader(), is(notNullValue()));
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				_assert.verify(() -> Assert.notNull(resourceLoaderMock2, "ResourceLoader must not be null"), atLeast(1));
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${3914a37c-38bf-3ffa-81f3-16abba975add}
	@Test()
	void setApplicationContextFactoryWhenApplicationContextFactoryIsNotNull() {
		/* Branches:
		 * (applicationContextFactory != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
		SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
		ApplicationContextFactory applicationContextFactoryMock2 = mock(ApplicationContextFactory.class);
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Class<?>[] classArray = new Class[] {};
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			List<Object> objectList = new ArrayList<>();
			objectList.add(bootstrapRegistryInitializerMock);
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
			//Act Statement(s)
			target.setApplicationContextFactory(applicationContextFactoryMock2);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${cbecbfed-0103-33c5-ae0e-fbba9246ad93}
	@Test()
	void setApplicationContextFactoryWhenApplicationContextFactoryIsNull() {
		/* Branches:
		 * (applicationContextFactory != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${595291b2-32f5-3310-98d3-672101248388}
	@Test()
	void setInitializersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
			//Act Statement(s)
			target.setInitializers(objectList2);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${989e71c1-43b5-3b60-bd3d-0b55b3617114}
	@Test()
	void addInitializersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${757246c3-9d4b-3c3b-9de8-9c3b71e7f6c4}
	@Test()
	void getInitializersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${4738b7b6-3b1c-3a7b-9897-15d45c98ffbc}
	@Test()
	void setListenersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
			//Act Statement(s)
			target.setListeners(objectList3);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${8c3502b2-ba78-3b5d-ae77-8a49ede199a4}
	@Test()
	void addListenersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${b1c37231-1147-3ac0-8762-d7c1e4be3220}
	@Test()
	void getListenersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${42991c09-c463-3ec4-93af-0a8b46b20a6a}
	@Test()
	void setApplicationStartupWhenApplicationStartupIsNotNull() {
		/* Branches:
		 * (applicationStartup != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${5af4d4a4-5a21-3907-ba98-a9d64a2bc8cb}
	@Test()
	void setApplicationStartupWhenApplicationStartupIsNull() {
		/* Branches:
		 * (applicationStartup != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
			ApplicationStartup applicationStartup = null;
			//Act Statement(s)
			target.setApplicationStartup(applicationStartup);
			ApplicationStartup applicationStartup2 = ApplicationStartup.DEFAULT;
			//Assert statement(s)
			//TODO: Please implement equals method in ApplicationStartup for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(target.getApplicationStartup(), equalTo(applicationStartup2));
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${ec55dd97-cc79-3389-adde-70ed6128cc29}
	@Test()
	void getShutdownHandlersTest() {
		/**
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: shutdownHook
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Act Statement(s)
		SpringApplicationShutdownHandlers result = SpringApplication.getShutdownHandlers();
		SpringApplicationShutdownHook springApplicationShutdownHook = new SpringApplicationShutdownHook();
		SpringApplicationShutdownHandlers springApplicationShutdownHandlers = springApplicationShutdownHook.getHandlers();
		//Assert statement(s)
		//TODO: Please implement equals method in SpringApplicationShutdownHandlers for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(springApplicationShutdownHandlers)));
	}

	//Sapient generated method id: ${f9b77011-dd18-3e0e-a3d8-448809a193dc}
	@Test()
	void run1Test() {
		//Arrange Statement(s)
		ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		try (MockedStatic<SpringApplication> springApplication = mockStatic(SpringApplication.class, CALLS_REAL_METHODS)) {
			Class<?>[] classArray = new Class[] { Object.class };
			String[] stringArray = new String[] {};
			springApplication.when(() -> SpringApplication.run(classArray, stringArray)).thenReturn(configurableApplicationContextMock);
			//Act Statement(s)
			ConfigurableApplicationContext result = SpringApplication.run(Object.class, stringArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurableApplicationContextMock));
				springApplication.verify(() -> SpringApplication.run(classArray, stringArray), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${df8a3a78-9698-3221-ad1a-aa38be07d856}
	@Test()
	void run2Test() {
		/**
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(objectList).when(springFactoriesLoaderMock).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<Object> objectList2 = new ArrayList<>();
			doReturn(objectList2).when(springFactoriesLoaderMock2).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<Object> objectList3 = new ArrayList<>();
			doReturn(objectList3).when(springFactoriesLoaderMock3).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader, classLoader2, classLoader3).when(target).getClassLoader();
			String[] stringArray = new String[] {};
			//Act Statement(s)
			ConfigurableApplicationContext result = SpringApplication.run(classArray, stringArray);
			SpringApplication springApplication = new SpringApplication(classArray);
			ConfigurableApplicationContext configurableApplicationContext = springApplication.run(stringArray);
			//Assert statement(s)
			//TODO: Please implement equals method in ConfigurableApplicationContext for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(configurableApplicationContext));
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
				verify(springFactoriesLoaderMock, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(Object.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(target, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${634cff62-73ea-384c-b4f7-c860f350b812}
	@Test()
	void exitWhenContextNotInstanceOfConfigurableApplicationContext() throws Exception {
		/* Branches:
		 * (exitCode != 0) : true
		 * (context instanceof ConfigurableApplicationContext closable) : false  #  inside close method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: generators
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

	//Sapient generated method id: ${6ab69a31-1ec3-3279-afbc-34caa8ce00f8}
	@Test()
	void exitWhenExitCodeNotEquals0() throws Exception {
		/* Branches:
		 * (exitCode != 0) : true
		 * (context instanceof ConfigurableApplicationContext closable) : false  #  inside close method
		 * (catch-exception (Exception)) : true
		 * (exitCode != 0) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: generators
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

	//Sapient generated method id: ${ba3ceffd-bb89-3ab5-83dd-b11d2c8b734c}
	@Test()
	void exitWhenExitCodeEquals0() throws Exception {
		/* Branches:
		 * (exitCode != 0) : false
		 * (context instanceof ConfigurableApplicationContext closable) : false  #  inside close method
		 * (catch-exception (Exception)) : true
		 * (exitCode != 0) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: generators
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

	//Sapient generated method id: ${75b57cb1-444a-3fb9-bd56-a8c3b1a5a77c}
	@Test()
	void fromTest() {
		//Arrange Statement(s)
		ThrowingConsumer<String[]> throwingConsumerMock = mock(ThrowingConsumer.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(throwingConsumerMock, "Main must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			SpringApplication.Augmented result = SpringApplication.from(throwingConsumerMock);
			Set<Class<?>> anySet = new HashSet<>();
			SpringApplication.Augmented springApplicationAugmented = new SpringApplication.Augmented(throwingConsumerMock, anySet);
			//Assert statement(s)
			//TODO: Please implement equals method in Augmented for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(springApplicationAugmented));
				_assert.verify(() -> Assert.notNull(throwingConsumerMock, "Main must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${79487e9a-c9d6-3b9c-84f3-34134abce215}
	@Test()
	void withHookTest() {
		//Arrange Statement(s)
		SpringApplicationHook springApplicationHookMock = mock(SpringApplicationHook.class);
		try (MockedStatic<SpringApplication> springApplication = mockStatic(SpringApplication.class, CALLS_REAL_METHODS)) {
			Object object = new Object();
			springApplication.when(() -> SpringApplication.withHook(eq(springApplicationHookMock), (ThrowingSupplier) any())).thenReturn(object);
			//TODO: Needs initialization with real value
			Runnable runnable = null;
			//Act Statement(s)
			SpringApplication.withHook(springApplicationHookMock, runnable);
			//Assert statement(s)
			assertAll("result", () -> springApplication.verify(() -> SpringApplication.withHook(eq(springApplicationHookMock), (ThrowingSupplier) any()), atLeast(1)));
		}
	}

	//Sapient generated method id: ${b35c15b1-6120-315a-a446-f9b18e544c21}
	@Test()
	void withHook1Test() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
