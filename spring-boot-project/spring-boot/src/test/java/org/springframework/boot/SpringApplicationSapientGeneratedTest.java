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
import org.springframework.aot.AotDetector;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.io.support.SpringFactoriesLoader;

import java.util.List;

import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.core.env.PropertySource;
import org.springframework.util.function.ThrowingSupplier;
import org.springframework.context.support.GenericApplicationContext;

import java.util.Map;

import org.springframework.context.ApplicationEvent;

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

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringApplicationSapientGeneratedTest {

	private final ApplicationContextFactory applicationContextFactoryMock = mock(ApplicationContextFactory.class, "applicationContextFactory");

	private final ResourceLoader resourceLoaderMock = mock(ResourceLoader.class, "ResourceLoader");

	private AutoCloseable autoCloseableMocks;

	@InjectMocks()
	private SpringApplication target;

	@AfterEach()
	public void afterTest() throws Exception {
		if (autoCloseableMocks != null)
			autoCloseableMocks.close();
	}

	//Sapient generated method id: ${42d3b446-df63-3b17-ac0b-323f22c2587e}, hash: 80B5C359E2BFEBC55344B982AFA3D380
	@Disabled()
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
		 *  Following variables could not be isolated/mocked: listeners, object of type StartupInfoLogger, shutdownHook
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
			 MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
			 MockedStatic<SpringFactoriesLoader.ArgumentResolver> springFactoriesLoaderArgumentResolver = mockStatic(SpringFactoriesLoader.ArgumentResolver.class);
			 MockedStatic<SpringApplication.Startup> springApplicationStartup = mockStatic(SpringApplication.Startup.class);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
			doReturn(true).when(configurableEnvironmentMock).containsProperty("spring.main.environment-prefix");
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
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3).thenReturn(springFactoriesLoaderMock4);
			List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
			doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock4).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
			configurationPropertySources.when(() -> ConfigurationPropertySources.attach(configurableEnvironmentMock)).thenAnswer((Answer<Void>) invocation -> null);
			defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd(configurableEnvironmentMock)).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(false, "Environment prefix cannot be set via properties.")).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertySources.when(() -> ConfigurationPropertySources.attach((Environment) any())).thenAnswer((Answer<Void>) invocation -> null);
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
			doReturn(org.springframework.core.env.ConfigurableEnvironment.class).when(applicationContextFactoryMock).getEnvironmentType(WebApplicationType.SERVLET);
			doReturn(configurableApplicationContextMock).when(applicationContextFactoryMock).create(WebApplicationType.SERVLET);
			ApplicationStartup applicationStartup = ApplicationStartup.DEFAULT;
			doNothing().when(configurableApplicationContextMock).setApplicationStartup(applicationStartup);
			doNothing().when(configurableApplicationContextMock).setEnvironment((ConfigurableEnvironment) any());
			doReturn(applicationContextMock).when(configurableApplicationContextMock).getParent();
			doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
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
				verify(applicationContextFactoryMock, times(2)).createEnvironment(WebApplicationType.SERVLET);
				verify(configurableEnvironmentMock, atLeast(1)).containsProperty("spring.main.environment-prefix");
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
				configurationPropertySources.verify(() -> ConfigurationPropertySources.attach(configurableEnvironmentMock), atLeast(1));
				defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd(configurableEnvironmentMock), atLeast(1));
				_assert.verify(() -> Assert.state(false, "Environment prefix cannot be set via properties."), atLeast(1));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((Environment) any()), atLeast(1));
				_assert.verify(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty")), atLeast(1));
				springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target), atLeast(1));
				verify(springFactoriesLoaderArgumentResolverMock2, atLeast(1)).and(String[].class, stringArray);
				verify(target, times(2)).getClassLoader();
				verify(target, atLeast(1)).configureEnvironment(configurableEnvironmentMock, stringArray2);
				verify(target, atLeast(1)).bindToSpringApplication(configurableEnvironmentMock);
				verify(applicationContextFactoryMock, atLeast(1)).getEnvironmentType(WebApplicationType.SERVLET);
				verify(applicationContextFactoryMock, atLeast(1)).create(WebApplicationType.SERVLET);
				verify(configurableApplicationContextMock, atLeast(1)).setApplicationStartup(applicationStartup);
				verify(configurableApplicationContextMock, atLeast(1)).setEnvironment((ConfigurableEnvironment) any());
				verify(configurableApplicationContextMock, atLeast(1)).getParent();
				verify(configurableApplicationContextMock, atLeast(2)).getBeanFactory();
				verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
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

	//Sapient generated method id: ${e47c1909-c129-35b0-9436-4989528a1205}, hash: 23810E6E6D66FAFFDD09903BF0B41C06
	@Disabled()
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
		 *  Following variables could not be isolated/mocked: listeners, object of type StartupInfoLogger, shutdownHook
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class, CALLS_REAL_METHODS);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
			 MockedStatic<SpringFactoriesLoader.ArgumentResolver> springFactoriesLoaderArgumentResolver = mockStatic(SpringFactoriesLoader.ArgumentResolver.class);
			 MockedStatic<SpringApplication.Startup> springApplicationStartup = mockStatic(SpringApplication.Startup.class);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
			doReturn(null).when(applicationContextFactoryMock).createEnvironment(WebApplicationType.SERVLET);
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
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3).thenReturn(springFactoriesLoaderMock4);
			List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
			doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock4).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
			configurationPropertySources.when(() -> ConfigurationPropertySources.attach((Environment) any())).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty"))).thenAnswer((Answer<Void>) invocation -> null);
			target = spy(new SpringApplication((ResourceLoader) null, classArray));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target)).thenReturn(springFactoriesLoaderArgumentResolverMock2);
			String[] stringArray = new String[] {};
			doReturn(springFactoriesLoaderArgumentResolverMock).when(springFactoriesLoaderArgumentResolverMock2).and(String[].class, stringArray);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			String[] stringArray2 = new String[] {};
			doNothing().when(target).configureEnvironment((ApplicationEnvironment) any(), eq(stringArray2));
			doNothing().when(target).bindToSpringApplication((ApplicationEnvironment) any());
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader, classLoader2).when(target).getClassLoader();
			doReturn(org.springframework.core.env.ConfigurableEnvironment.class).when(applicationContextFactoryMock).getEnvironmentType(WebApplicationType.SERVLET);
			doReturn(configurableApplicationContextMock).when(applicationContextFactoryMock).create(WebApplicationType.SERVLET);
			ApplicationStartup applicationStartup = ApplicationStartup.DEFAULT;
			doNothing().when(configurableApplicationContextMock).setApplicationStartup(applicationStartup);
			doNothing().when(configurableApplicationContextMock).setEnvironment((ConfigurableEnvironment) any());
			doReturn(applicationContextMock).when(configurableApplicationContextMock).getParent();
			doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
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
				verify(applicationContextFactoryMock, times(2)).createEnvironment(WebApplicationType.SERVLET);
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
				configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((Environment) any()), atLeast(1));
				_assert.verify(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty")), atLeast(1));
				springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target), atLeast(1));
				verify(springFactoriesLoaderArgumentResolverMock2, atLeast(1)).and(String[].class, stringArray);
				verify(target, times(2)).getClassLoader();
				verify(target, atLeast(1)).configureEnvironment((ApplicationEnvironment) any(), eq(stringArray2));
				verify(target, atLeast(1)).bindToSpringApplication((ApplicationEnvironment) any());
				verify(applicationContextFactoryMock, atLeast(1)).getEnvironmentType(WebApplicationType.SERVLET);
				verify(applicationContextFactoryMock, atLeast(1)).create(WebApplicationType.SERVLET);
				verify(configurableApplicationContextMock, atLeast(1)).setApplicationStartup(applicationStartup);
				verify(configurableApplicationContextMock, atLeast(1)).setEnvironment((ConfigurableEnvironment) any());
				verify(configurableApplicationContextMock, atLeast(1)).getParent();
				verify(configurableApplicationContextMock, atLeast(2)).getBeanFactory();
				verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
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

	//Sapient generated method id: ${3e7af4bd-9984-3984-a7be-79318e0c493a}, hash: 804972ABC0EC868B84220BCABE51E499
	@Disabled()
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
		 *  Following variables could not be isolated/mocked: listeners, object of type StartupInfoLogger, shutdownHook
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
		SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
		SpringApplication.Startup springApplicationStartupMock = mock(SpringApplication.Startup.class);
		Duration durationMock = mock(Duration.class);
		SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock = mock(SpringFactoriesLoader.ArgumentResolver.class);
		SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock2 = mock(SpringFactoriesLoader.ArgumentResolver.class);
		ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
		Runner runnerMock = mock(Runner.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
			 MockedStatic<AotDetector> aotDetector = mockStatic(AotDetector.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
			 MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
			 MockedStatic<SpringFactoriesLoader.ArgumentResolver> springFactoriesLoaderArgumentResolver = mockStatic(SpringFactoriesLoader.ArgumentResolver.class);
			 MockedStatic<SpringApplication.Startup> springApplicationStartup = mockStatic(SpringApplication.Startup.class);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			List<Object> objectList = new ArrayList<>();
			objectList.add(bootstrapRegistryInitializerMock);
			doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
			doNothing().when(bootstrapRegistryInitializerMock).initialize((BootstrapRegistry) any());
			List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
			doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation(classLoader);
			springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
			doReturn(durationMock).when(springApplicationStartupMock).started();
			Duration duration = Duration.ofDays(0L);
			doReturn(duration).when(springApplicationStartupMock).timeTakenToStarted();
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoader2).thenReturn(springFactoriesLoaderMock3);
			List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
			doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock3).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
			configurationPropertySources.when(() -> ConfigurationPropertySources.attach((Environment) any())).thenAnswer((Answer<Void>) invocation -> null);
			defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
			aotDetector.when(() -> AotDetector.useGeneratedArtifacts()).thenReturn(false);
			_assert.when(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty"))).thenAnswer((Answer<Void>) invocation -> null);
			target = spy(new SpringApplication(resourceLoaderMock, classArray));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setApplicationContextFactory(applicationContextFactoryMock);
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader2, classLoader3, classLoader).when(resourceLoaderMock).getClassLoader();
			springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target)).thenReturn(springFactoriesLoaderArgumentResolverMock2);
			String[] stringArray = new String[] { "<value>" };
			doReturn(springFactoriesLoaderArgumentResolverMock).when(springFactoriesLoaderArgumentResolverMock2).and(String[].class, stringArray);
			ClassLoader classLoader4 = ClassLoader.getPlatformClassLoader();
			String[] stringArray2 = new String[] { "<value>" };
			doNothing().when(target).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray2));
			doNothing().when(target).bindToSpringApplication((ConfigurableEnvironment) any());
			ClassLoader classLoader5 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader4, classLoader5).when(target).getClassLoader();
			doNothing().when(target).postProcessApplicationContext(configurableApplicationContextMock);
			ApplicationStartup applicationStartup = ApplicationStartup.DEFAULT;
			doNothing().when(configurableApplicationContextMock).setApplicationStartup(applicationStartup);
			doNothing().when(configurableApplicationContextMock).setEnvironment((ConfigurableEnvironment) any());
			doReturn(null).when(configurableApplicationContextMock).getParent();
			doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
			doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springBootBanner"), (Banner) any());
			doNothing().when(configurableApplicationContextMock).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
			doNothing().when(configurableApplicationContextMock).refresh();
			doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2).when(configurableApplicationContextMock).getBeanFactory();
			String[] stringArray3 = new String[] { "<value>" };
			doReturn(stringArray3).when(configurableListableBeanFactoryMock2).getBeanNamesForType(Runner.class);
			doReturn(runnerMock).when(configurableListableBeanFactoryMock2).getBean("<value>", Runner.class);
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
				springApplicationStartup.verify(() -> SpringApplication.Startup.create(), atLeast(1));
				verify(springApplicationStartupMock, atLeast(1)).started();
				verify(springApplicationStartupMock, atLeast(1)).timeTakenToStarted();
				verify(springFactoriesLoaderMock3, atLeast(1)).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
				configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((Environment) any()), atLeast(2));
				defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any()), atLeast(1));
				aotDetector.verify(() -> AotDetector.useGeneratedArtifacts(), atLeast(2));
				_assert.verify(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty")), atLeast(1));
				verify(resourceLoaderMock, times(3)).getClassLoader();
				springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target), atLeast(1));
				verify(springFactoriesLoaderArgumentResolverMock2, atLeast(1)).and(String[].class, stringArray);
				verify(target, times(2)).getClassLoader();
				verify(target, atLeast(1)).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray2));
				verify(target, atLeast(1)).bindToSpringApplication((ConfigurableEnvironment) any());
				verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);
				verify(configurableApplicationContextMock, atLeast(1)).setApplicationStartup(applicationStartup);
				verify(configurableApplicationContextMock, atLeast(1)).setEnvironment((ConfigurableEnvironment) any());
				verify(configurableApplicationContextMock, atLeast(1)).getParent();
				verify(configurableApplicationContextMock, times(2)).getBeanFactory();
				verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
				verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springBootBanner"), (Banner) any());
				verify(configurableApplicationContextMock, atLeast(1)).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
				verify(configurableApplicationContextMock, atLeast(1)).refresh();
				verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);
				verify(configurableListableBeanFactoryMock2, atLeast(1)).getBean("<value>", Runner.class);
				verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);
				verify(target, atLeast(1)).logStartupInfo(true);
				verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);
				verify(target, atLeast(1)).getAllSources();
				verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);
				verify(target, atLeast(1)).getApplicationLog();
			});
		}
	}

	//Sapient generated method id: ${98d77b25-aac9-30d2-961a-261540ea2ab7}, hash: 2A24EF68758E742B6F42DB856367BE35
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
		 *  Following variables could not be isolated/mocked: listeners, object of type StartupInfoLogger, shutdownHook
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//SpringApplication.Startup springApplicationStartupMock = mock(SpringApplication.Startup.class);
		//Duration durationMock = mock(Duration.class);
		//SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		//ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
		//ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		//ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		//ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
		//Runner runnerMock = mock(Runner.class);
		//ClassLoader classLoader4 = null;
		//Class<?>[] classArray = new Class[] { Object.class, SpringApplication.class };
		//_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
		//webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
		//SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
		//springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2);
		//springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
		//doReturn(durationMock).when(springApplicationStartupMock).started();
		//Duration duration = Duration.ofDays(0L);
		//doReturn(duration).when(springApplicationStartupMock).timeTakenToStarted();
		//Duration duration2 = Duration.ofDays(0L);
		//doReturn(duration2).when(springApplicationStartupMock).ready();
		//springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock);
		//List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
		//doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock).load(eq(SpringApplicationRunListener.class), (SpringFactoriesLoader.ArgumentResolver) any());
		//configurationPropertySources.when(() -> ConfigurationPropertySources.attach(configurableEnvironmentMock)).thenAnswer((Answer<Void>) invocation -> null);
		//doReturn(false).when(configurableEnvironmentMock).containsProperty("spring.main.environment-prefix");
		//defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd(configurableEnvironmentMock)).thenAnswer((Answer<Void>) invocation -> null);
		//configurationPropertySources.when(() -> ConfigurationPropertySources.attach((Environment) any())).thenAnswer((Answer<Void>) invocation -> null);
		//aotDetector.when(() -> AotDetector.useGeneratedArtifacts()).thenReturn(false);
		//_assert.when(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty"))).thenAnswer((Answer<Void>) invocation -> null);
		//target = spy(new SpringApplication(resourceLoaderMock, classArray));
		//autoCloseableMocks = MockitoAnnotations.openMocks(this);
		//target.setApplicationContextFactory(applicationContextFactoryMock);
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//doReturn(null, classLoader4, classLoader).when(resourceLoaderMock).getClassLoader();
		//ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
		//String[] stringArray = new String[] { "--spring.profiles.active=test" };
		//doNothing().when(target).configureEnvironment(configurableEnvironmentMock, stringArray);
		//doNothing().when(target).bindToSpringApplication(configurableEnvironmentMock);
		//ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
		//doReturn(classLoader2, classLoader3).when(target).getClassLoader();
		//doNothing().when(target).postProcessApplicationContext(configurableApplicationContextMock);
		//ApplicationStartup applicationStartup = ApplicationStartup.DEFAULT;
		//doNothing().when(configurableApplicationContextMock).setApplicationStartup(applicationStartup);
		//doNothing().when(configurableApplicationContextMock).setEnvironment((ConfigurableEnvironment) any());
		//doReturn(null).when(configurableApplicationContextMock).getParent();
		//doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
		//doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springBootBanner"), (Banner) any());
		//doNothing().when(configurableApplicationContextMock).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
		//doNothing().when(configurableApplicationContextMock).refresh();
		//doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2).when(configurableApplicationContextMock).getBeanFactory();
		//String[] stringArray2 = new String[] { "\"Runner\"" };
		//doReturn(stringArray2).when(configurableListableBeanFactoryMock2).getBeanNamesForType(Runner.class);
		//doReturn(runnerMock).when(configurableListableBeanFactoryMock2).getBean("\"Runner\"", Runner.class);
		//doReturn(true).when(configurableApplicationContextMock).isRunning();
		//doNothing().when(target).applyInitializers(configurableApplicationContextMock);
		//doNothing().when(target).logStartupInfo(true);
		//doNothing().when(target).logStartupProfileInfo(configurableApplicationContextMock);
		//Set<Object> objectSet = new HashSet<>();
		//doReturn(objectSet).when(target).getAllSources();
		//Object[] objectArray = new Object[] {};
		//doNothing().when(target).load(configurableApplicationContextMock, objectArray);
		//NoOpLog noOpLog = new NoOpLog();
		//doReturn(noOpLog).when(target).getApplicationLog();
		//String[] stringArray3 = new String[] { "--spring.profiles.active=test" };
		//ConfigurableApplicationContext result = target.run(stringArray3);
		//assertAll("result", () -> {    assertThat(result, equalTo(configurableApplicationContextMock));    _assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));    webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));    springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(1));    springApplicationStartup.verify(() -> SpringApplication.Startup.create(), atLeast(1));    verify(springApplicationStartupMock, atLeast(1)).started();    verify(springApplicationStartupMock, atLeast(1)).timeTakenToStarted();    springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(1));    verify(springFactoriesLoaderMock, atLeast(1)).load(eq(SpringApplicationRunListener.class), (SpringFactoriesLoader.ArgumentResolver) any());    configurationPropertySources.verify(() -> ConfigurationPropertySources.attach(configurableEnvironmentMock), atLeast(1));    verify(configurableEnvironmentMock, atLeast(1)).containsProperty("spring.main.environment-prefix");    defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd(configurableEnvironmentMock), atLeast(1));    configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((Environment) any()), atLeast(1));    aotDetector.verify(() -> AotDetector.useGeneratedArtifacts(), atLeast(2));    _assert.verify(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty")), atLeast(1));    verify(resourceLoaderMock, times(3)).getClassLoader();    verify(target, times(2)).getClassLoader();    verify(target, atLeast(1)).configureEnvironment(configurableEnvironmentMock, stringArray);    verify(target, atLeast(1)).bindToSpringApplication(configurableEnvironmentMock);    verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);    verify(configurableApplicationContextMock, atLeast(1)).setApplicationStartup(applicationStartup);    verify(configurableApplicationContextMock, atLeast(1)).setEnvironment((ConfigurableEnvironment) any());    verify(configurableApplicationContextMock, atLeast(1)).getParent();    verify(configurableApplicationContextMock, atLeast(2)).getBeanFactory();    verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());    verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springBootBanner"), (Banner) any());    verify(configurableApplicationContextMock, atLeast(1)).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());    verify(configurableApplicationContextMock, atLeast(1)).refresh();    verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);    verify(configurableListableBeanFactoryMock2, atLeast(1)).getBean("\"Runner\"", Runner.class);    verify(configurableApplicationContextMock, atLeast(1)).isRunning();    verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);    verify(target, atLeast(1)).logStartupInfo(true);    verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);    verify(target, atLeast(1)).getAllSources();    verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);    verify(target, atLeast(1)).getApplicationLog();});
	}

	//Sapient generated method id: ${84f7d002-e180-33f9-9ad7-da295fbf2101}, hash: 3D8D929EAA9117643AA0840DE4570D11
	@Disabled()
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
		 *  Following variables could not be isolated/mocked: listeners, object of type StartupInfoLogger, shutdownHook
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
		SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
		SpringApplication.Startup springApplicationStartupMock = mock(SpringApplication.Startup.class);
		Duration durationMock = mock(Duration.class);
		SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock = mock(SpringFactoriesLoader.ArgumentResolver.class);
		SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock2 = mock(SpringFactoriesLoader.ArgumentResolver.class);
		ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
		Runner runnerMock = mock(Runner.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
			 MockedStatic<AotDetector> aotDetector = mockStatic(AotDetector.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
			 MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
			 MockedStatic<SpringFactoriesLoader.ArgumentResolver> springFactoriesLoaderArgumentResolver = mockStatic(SpringFactoriesLoader.ArgumentResolver.class);
			 MockedStatic<SpringApplication.Startup> springApplicationStartup = mockStatic(SpringApplication.Startup.class);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			List<Object> objectList = new ArrayList<>();
			objectList.add(bootstrapRegistryInitializerMock);
			doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
			doNothing().when(bootstrapRegistryInitializerMock).initialize((BootstrapRegistry) any());
			List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
			doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation(classLoader);
			springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
			doReturn(durationMock).when(springApplicationStartupMock).started();
			Duration duration = Duration.ofDays(0L);
			doReturn(duration).when(springApplicationStartupMock).timeTakenToStarted();
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoader2).thenReturn(springFactoriesLoaderMock3);
			List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
			doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock3).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
			configurationPropertySources.when(() -> ConfigurationPropertySources.attach((Environment) any())).thenAnswer((Answer<Void>) invocation -> null);
			defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
			aotDetector.when(() -> AotDetector.useGeneratedArtifacts()).thenReturn(false);
			_assert.when(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty"))).thenAnswer((Answer<Void>) invocation -> null);
			target = spy(new SpringApplication(resourceLoaderMock, classArray));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setApplicationContextFactory(applicationContextFactoryMock);
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader2, classLoader3, classLoader).when(resourceLoaderMock).getClassLoader();
			springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target)).thenReturn(springFactoriesLoaderArgumentResolverMock2);
			String[] stringArray = new String[] { "<value>" };
			doReturn(springFactoriesLoaderArgumentResolverMock).when(springFactoriesLoaderArgumentResolverMock2).and(String[].class, stringArray);
			ClassLoader classLoader4 = ClassLoader.getPlatformClassLoader();
			String[] stringArray2 = new String[] { "<value>" };
			doNothing().when(target).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray2));
			doNothing().when(target).bindToSpringApplication((ConfigurableEnvironment) any());
			ClassLoader classLoader5 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader4, classLoader5).when(target).getClassLoader();
			doNothing().when(target).postProcessApplicationContext(configurableApplicationContextMock);
			ApplicationStartup applicationStartup = ApplicationStartup.DEFAULT;
			doNothing().when(configurableApplicationContextMock).setApplicationStartup(applicationStartup);
			doNothing().when(configurableApplicationContextMock).setEnvironment((ConfigurableEnvironment) any());
			doReturn(null).when(configurableApplicationContextMock).getParent();
			doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
			doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("springBootBanner"), (Banner) any());
			doNothing().when(configurableApplicationContextMock).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
			doNothing().when(configurableApplicationContextMock).refresh();
			doReturn(configurableListableBeanFactoryMock, configurableListableBeanFactoryMock2).when(configurableApplicationContextMock).getBeanFactory();
			String[] stringArray3 = new String[] { "<value>" };
			doReturn(stringArray3).when(configurableListableBeanFactoryMock2).getBeanNamesForType(Runner.class);
			doReturn(runnerMock).when(configurableListableBeanFactoryMock2).getBean("<value>", Runner.class);
			doReturn(false).when(configurableApplicationContextMock).isRunning();
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
				springApplicationStartup.verify(() -> SpringApplication.Startup.create(), atLeast(1));
				verify(springApplicationStartupMock, atLeast(1)).started();
				verify(springApplicationStartupMock, atLeast(1)).timeTakenToStarted();
				verify(springFactoriesLoaderMock3, atLeast(1)).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
				configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((Environment) any()), atLeast(2));
				defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any()), atLeast(1));
				aotDetector.verify(() -> AotDetector.useGeneratedArtifacts(), atLeast(2));
				_assert.verify(() -> Assert.notEmpty(anySet(), eq("Sources must not be empty")), atLeast(1));
				verify(resourceLoaderMock, times(3)).getClassLoader();
				springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(SpringApplication.class, target), atLeast(1));
				verify(springFactoriesLoaderArgumentResolverMock2, atLeast(1)).and(String[].class, stringArray);
				verify(target, times(2)).getClassLoader();
				verify(target, atLeast(1)).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray2));
				verify(target, atLeast(1)).bindToSpringApplication((ConfigurableEnvironment) any());
				verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);
				verify(configurableApplicationContextMock, atLeast(1)).setApplicationStartup(applicationStartup);
				verify(configurableApplicationContextMock, atLeast(1)).setEnvironment((ConfigurableEnvironment) any());
				verify(configurableApplicationContextMock, atLeast(1)).getParent();
				verify(configurableApplicationContextMock, times(2)).getBeanFactory();
				verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springApplicationArguments"), (DefaultApplicationArguments) any());
				verify(configurableListableBeanFactoryMock, atLeast(1)).registerSingleton(eq("springBootBanner"), (Banner) any());
				verify(configurableApplicationContextMock, atLeast(1)).addBeanFactoryPostProcessor((BeanFactoryPostProcessor) any());
				verify(configurableApplicationContextMock, atLeast(1)).refresh();
				verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);
				verify(configurableListableBeanFactoryMock2, atLeast(1)).getBean("<value>", Runner.class);
				verify(configurableApplicationContextMock, atLeast(1)).isRunning();
				verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);
				verify(target, atLeast(1)).logStartupInfo(true);
				verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);
				verify(target, atLeast(1)).getAllSources();
				verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);
				verify(target, atLeast(1)).getApplicationLog();
			});
		}
	}

	//Sapient generated method id: ${d3164a5d-0756-36d7-bfaa-12e2f652e42d}, hash: CAE0BF52A21B57741BF7B2D3A6700EB9
	@Disabled()
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
		 *  Following variables could not be isolated/mocked: listeners, object of type StartupInfoLogger, shutdownHook
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
		SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
		SpringApplication.Startup springApplicationStartupMock = mock(SpringApplication.Startup.class);
		Duration durationMock = mock(Duration.class, "void");
		SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock = mock(SpringFactoriesLoader.ArgumentResolver.class);
		SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock2 = mock(SpringFactoriesLoader.ArgumentResolver.class);
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
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			List<Object> objectList = new ArrayList<>();
			objectList.add(bootstrapRegistryInitializerMock);
			doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
			doNothing().when(bootstrapRegistryInitializerMock).initialize((BootstrapRegistry) any());
			List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
			doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation(classLoader);
			springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
			doReturn(durationMock).when(springApplicationStartupMock).started();
			Duration duration = Duration.ofDays(0L);
			doReturn(duration).when(springApplicationStartupMock).timeTakenToStarted();
			List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
			doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock3).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
			configurationPropertySources.when(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) null)).thenAnswer((Answer<Void>) invocation -> null);
			defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) null)).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertySources.when(() -> ConfigurationPropertySources.attach((Environment) any())).thenAnswer((Answer<Void>) invocation -> null);
			aotDetector.when(() -> AotDetector.useGeneratedArtifacts()).thenReturn(false);
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
			String[] stringArray = new String[] { "String[]" };
			doReturn(stringArray).when(configurableListableBeanFactoryMock2).getBeanNamesForType(Runner.class);
			doReturn(runnerMock).when(configurableListableBeanFactoryMock2).getBean("String[]", Runner.class);
			doReturn(false).when(configurableApplicationContextMock).isActive();
			doNothing().when(configurableApplicationContextMock).close();
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoader2).thenReturn(springFactoriesLoaderMock3).thenReturn(springFactoriesLoaderMock4);
			Collection<SpringBootExceptionReporter> collection = new ArrayList<>();
			collection.add(springBootExceptionReporterMock);
			doReturn(collection).when(springFactoriesLoaderMock4).load(SpringBootExceptionReporter.class, springFactoriesLoaderArgumentResolverMock2);
			doReturn(false).when(springBootExceptionReporterMock).reportException((Throwable) null);
			target = spy(new SpringApplication(resourceLoaderMock, classArray));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setApplicationContextFactory(applicationContextFactoryMock);
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader2, classLoader3, classLoader).when(resourceLoaderMock).getClassLoader();
			ClassLoader classLoader4 = ClassLoader.getPlatformClassLoader();
			String[] stringArray2 = new String[] { "some string array" };
			doNothing().when(target).configureEnvironment((ConfigurableEnvironment) null, stringArray2);
			doNothing().when(target).bindToSpringApplication((ConfigurableEnvironment) null);
			ClassLoader classLoader5 = ClassLoader.getPlatformClassLoader();
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
			String[] stringArray3 = new String[] { "some string array" };
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(bootstrapRegistryInitializerMock, atLeast(1)).initialize((BootstrapRegistry) any());
				verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
				springApplicationStartup.verify(() -> SpringApplication.Startup.create(), atLeast(1));
				verify(springApplicationStartupMock, atLeast(1)).started();
				verify(springApplicationStartupMock, atLeast(1)).timeTakenToStarted();
				verify(springFactoriesLoaderMock3, atLeast(1)).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
				configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((ConfigurableEnvironment) null), atLeast(1));
				defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) null), atLeast(1));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((Environment) any()), atLeast(1));
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
				verify(configurableApplicationContextMock, atLeast(1)).refresh();
				verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);
				verify(configurableListableBeanFactoryMock2, atLeast(1)).getBean("String[]", Runner.class);
				verify(configurableApplicationContextMock, atLeast(1)).isActive();
				verify(configurableApplicationContextMock, atLeast(1)).close();
				verify(springFactoriesLoaderMock4, atLeast(1)).load(SpringBootExceptionReporter.class, springFactoriesLoaderArgumentResolverMock2);
				verify(springBootExceptionReporterMock, atLeast(1)).reportException((Throwable) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
				verify(target, times(3)).getClassLoader();
				verify(target, atLeast(1)).configureEnvironment((ConfigurableEnvironment) null, stringArray2);
				verify(target, atLeast(1)).bindToSpringApplication((ConfigurableEnvironment) null);
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

	//Sapient generated method id: ${47998f2c-e1fa-3346-b77b-7a9bf045784a}, hash: 6856B378FE09AA4D025784E1CECB22B7
	@Disabled()
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
		 *  Following variables could not be isolated/mocked: listeners, object of type StartupInfoLogger, shutdownHook
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringApplication.Startup springApplicationStartupMock = mock(SpringApplication.Startup.class);
		Duration durationMock = mock(Duration.class, "Duration");
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock = mock(SpringFactoriesLoader.ArgumentResolver.class);
		SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock2 = mock(SpringFactoriesLoader.ArgumentResolver.class);
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
			doReturn(durationMock).when(springApplicationStartupMock).started();
			Duration duration = Duration.ofDays(0L);
			doReturn(duration).when(springApplicationStartupMock).timeTakenToStarted();
			List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
			doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
			configurationPropertySources.when(() -> ConfigurationPropertySources.attach((Environment) any())).thenAnswer((Answer<Void>) invocation -> null);
			defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
			aotDetector.when(() -> AotDetector.useGeneratedArtifacts()).thenReturn(false);
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
			String[] stringArray = new String[] { "String[]" };
			doReturn(stringArray).when(configurableListableBeanFactoryMock2).getBeanNamesForType(Runner.class);
			doReturn(runnerMock).when(configurableListableBeanFactoryMock2).getBean("String[]", Runner.class);
			doReturn(false).when(configurableApplicationContextMock).isActive();
			doNothing().when(configurableApplicationContextMock).close();
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2);
			Collection<SpringBootExceptionReporter> collection = new ArrayList<>();
			collection.add(springBootExceptionReporterMock);
			doReturn(collection).when(springFactoriesLoaderMock2).load(SpringBootExceptionReporter.class, springFactoriesLoaderArgumentResolverMock2);
			Throwable throwable = new Throwable("message1", (Throwable) null);
			doReturn(true).when(springBootExceptionReporterMock).reportException(throwable);
			target = spy(new SpringApplication(resourceLoaderMock, classArray));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setApplicationContextFactory(applicationContextFactoryMock);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader5, classLoader).when(resourceLoaderMock).getClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			String[] stringArray2 = new String[] { "String[]" };
			doNothing().when(target).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray2));
			doNothing().when(target).bindToSpringApplication((ConfigurableEnvironment) any());
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
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
			ClassLoader classLoader4 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader2, classLoader3, classLoader4).when(target).getClassLoader();
			doNothing().when(target).registerLoggedException(throwable);
			String[] stringArray3 = new String[] { "String[]" };
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
				configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((Environment) any()), atLeast(2));
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
				verify(configurableApplicationContextMock, atLeast(1)).refresh();
				verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);
				verify(configurableListableBeanFactoryMock2, atLeast(1)).getBean("String[]", Runner.class);
				verify(configurableApplicationContextMock, atLeast(1)).isActive();
				verify(configurableApplicationContextMock, atLeast(1)).close();
				verify(springFactoriesLoaderMock2, atLeast(1)).load(SpringBootExceptionReporter.class, springFactoriesLoaderArgumentResolverMock2);
				verify(springBootExceptionReporterMock, atLeast(1)).reportException(throwable);
				verify(resourceLoaderMock, times(3)).getClassLoader();
				verify(target, times(3)).getClassLoader();
				verify(target, atLeast(1)).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray2));
				verify(target, atLeast(1)).bindToSpringApplication((ConfigurableEnvironment) any());
				verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);
				verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);
				verify(target, atLeast(1)).logStartupInfo(true);
				verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);
				verify(target, atLeast(1)).getAllSources();
				verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);
				verify(target, atLeast(1)).getApplicationLog();
				verify(target, atLeast(1)).registerLoggedException(throwable);
			});
		}
	}

	//Sapient generated method id: ${018a18ba-3224-3ac9-a6c0-8b5f893cf169}, hash: D801C079B3A521931BAE58A5644132E4
	@Disabled()
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
		 *  Following variables could not be isolated/mocked: listeners, object of type StartupInfoLogger, shutdownHook
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringApplication.Startup springApplicationStartupMock = mock(SpringApplication.Startup.class);
		Duration durationMock = mock(Duration.class, "Duration");
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock = mock(SpringFactoriesLoader.ArgumentResolver.class);
		SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock2 = mock(SpringFactoriesLoader.ArgumentResolver.class);
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
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.REACTIVE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			SpringFactoriesLoader springFactoriesLoader3 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2).thenReturn(springFactoriesLoader3);
			springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
			doReturn(durationMock).when(springApplicationStartupMock).started();
			Duration duration = Duration.ofDays(0L);
			doReturn(duration).when(springApplicationStartupMock).timeTakenToStarted();
			List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
			doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
			configurationPropertySources.when(() -> ConfigurationPropertySources.attach((Environment) any())).thenAnswer((Answer<Void>) invocation -> null);
			defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
			aotDetector.when(() -> AotDetector.useGeneratedArtifacts()).thenReturn(false);
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
			String[] stringArray = new String[] { "String[]" };
			doReturn(stringArray).when(configurableListableBeanFactoryMock2).getBeanNamesForType(Runner.class);
			doReturn(runnerMock).when(configurableListableBeanFactoryMock2).getBean("String[]", Runner.class);
			doReturn(false).when(configurableApplicationContextMock).isRunning();
			doReturn(false).when(configurableApplicationContextMock).isActive();
			doNothing().when(configurableApplicationContextMock).close();
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2);
			Collection<SpringBootExceptionReporter> collection = new ArrayList<>();
			collection.add(springBootExceptionReporterMock);
			doReturn(collection).when(springFactoriesLoaderMock2).load(SpringBootExceptionReporter.class, springFactoriesLoaderArgumentResolverMock2);
			doReturn(false).when(springBootExceptionReporterMock).reportException((Throwable) null);
			target = spy(new SpringApplication(resourceLoaderMock, classArray));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setApplicationContextFactory(applicationContextFactoryMock);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader5, classLoader).when(resourceLoaderMock).getClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			String[] stringArray2 = new String[] { "String[]" };
			doNothing().when(target).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray2));
			doNothing().when(target).bindToSpringApplication((ConfigurableEnvironment) any());
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
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
			ClassLoader classLoader4 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader2, classLoader3, classLoader4).when(target).getClassLoader();
			doNothing().when(target).registerLoggedException((Throwable) null);
			String[] stringArray3 = new String[] { "String[]" };
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
				configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((Environment) any()), atLeast(2));
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
				verify(configurableApplicationContextMock, atLeast(1)).refresh();
				verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);
				verify(configurableListableBeanFactoryMock2, atLeast(1)).getBean("String[]", Runner.class);
				verify(configurableApplicationContextMock, atLeast(1)).isRunning();
				verify(configurableApplicationContextMock, atLeast(1)).isActive();
				verify(configurableApplicationContextMock, atLeast(1)).close();
				verify(springFactoriesLoaderMock2, atLeast(1)).load(SpringBootExceptionReporter.class, springFactoriesLoaderArgumentResolverMock2);
				verify(springBootExceptionReporterMock, atLeast(1)).reportException((Throwable) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
				verify(target, times(3)).getClassLoader();
				verify(target, atLeast(1)).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray2));
				verify(target, atLeast(1)).bindToSpringApplication((ConfigurableEnvironment) any());
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

	//Sapient generated method id: ${1c16bcf4-118d-3712-a3e9-e2b279e1fef1}, hash: FA9886D1568267628C3D53ED8E1FE681
	@Disabled()
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
		 *  Following variables could not be isolated/mocked: listeners, object of type StartupInfoLogger, shutdownHook
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringApplication.Startup springApplicationStartupMock = mock(SpringApplication.Startup.class);
		Duration durationMock = mock(Duration.class, "Duration");
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock = mock(SpringFactoriesLoader.ArgumentResolver.class);
		SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock2 = mock(SpringFactoriesLoader.ArgumentResolver.class);
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
			doReturn(durationMock).when(springApplicationStartupMock).started();
			Duration duration = Duration.ofDays(0L);
			doReturn(duration).when(springApplicationStartupMock).timeTakenToStarted();
			List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
			doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
			configurationPropertySources.when(() -> ConfigurationPropertySources.attach((Environment) any())).thenAnswer((Answer<Void>) invocation -> null);
			defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
			aotDetector.when(() -> AotDetector.useGeneratedArtifacts()).thenReturn(false);
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
			String[] stringArray = new String[] { "String[]" };
			doReturn(stringArray).when(configurableListableBeanFactoryMock2).getBeanNamesForType(Runner.class);
			doReturn(runnerMock).when(configurableListableBeanFactoryMock2).getBean("String[]", Runner.class);
			doReturn(false).when(configurableApplicationContextMock).isRunning();
			doReturn(false).when(configurableApplicationContextMock).isActive();
			doNothing().when(configurableApplicationContextMock).close();
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2);
			Collection<SpringBootExceptionReporter> collection = new ArrayList<>();
			collection.add(springBootExceptionReporterMock);
			doReturn(collection).when(springFactoriesLoaderMock2).load(SpringBootExceptionReporter.class, springFactoriesLoaderArgumentResolverMock2);
			Throwable throwable = new Throwable("message1", (Throwable) null);
			doReturn(true).when(springBootExceptionReporterMock).reportException(throwable);
			target = spy(new SpringApplication(resourceLoaderMock, classArray));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setApplicationContextFactory(applicationContextFactoryMock);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader5, classLoader).when(resourceLoaderMock).getClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			String[] stringArray2 = new String[] { "String[]" };
			doNothing().when(target).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray2));
			doNothing().when(target).bindToSpringApplication((ConfigurableEnvironment) any());
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
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
			ClassLoader classLoader4 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader2, classLoader3, classLoader4).when(target).getClassLoader();
			doNothing().when(target).registerLoggedException(throwable);
			String[] stringArray3 = new String[] { "String[]" };
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
				configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((Environment) any()), atLeast(2));
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
				verify(configurableApplicationContextMock, atLeast(1)).refresh();
				verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);
				verify(configurableListableBeanFactoryMock2, atLeast(1)).getBean("String[]", Runner.class);
				verify(configurableApplicationContextMock, atLeast(1)).isRunning();
				verify(configurableApplicationContextMock, atLeast(1)).isActive();
				verify(configurableApplicationContextMock, atLeast(1)).close();
				verify(springFactoriesLoaderMock2, atLeast(1)).load(SpringBootExceptionReporter.class, springFactoriesLoaderArgumentResolverMock2);
				verify(springBootExceptionReporterMock, atLeast(1)).reportException(throwable);
				verify(resourceLoaderMock, times(3)).getClassLoader();
				verify(target, times(3)).getClassLoader();
				verify(target, atLeast(1)).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray2));
				verify(target, atLeast(1)).bindToSpringApplication((ConfigurableEnvironment) any());
				verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);
				verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);
				verify(target, atLeast(1)).logStartupInfo(true);
				verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);
				verify(target, atLeast(1)).getAllSources();
				verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);
				verify(target, atLeast(1)).getApplicationLog();
				verify(target, atLeast(1)).registerLoggedException(throwable);
			});
		}
	}

	//Sapient generated method id: ${e0f442ca-4495-38d9-8886-c07c87b2a590}, hash: 1F63ADE10FC28E961C90724BD17A4F7F
	@Disabled()
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
		 *  Following variables could not be isolated/mocked: listeners, object of type StartupInfoLogger, shutdownHook
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringApplication.Startup springApplicationStartupMock = mock(SpringApplication.Startup.class);
		Duration durationMock = mock(Duration.class, "Duration");
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock = mock(SpringFactoriesLoader.ArgumentResolver.class);
		SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock2 = mock(SpringFactoriesLoader.ArgumentResolver.class);
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
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			SpringFactoriesLoader springFactoriesLoader3 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2).thenReturn(springFactoriesLoader3);
			springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
			doReturn(durationMock).when(springApplicationStartupMock).started();
			Duration duration = Duration.ofDays(0L);
			doReturn(duration).when(springApplicationStartupMock).timeTakenToStarted();
			List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
			doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
			configurationPropertySources.when(() -> ConfigurationPropertySources.attach((Environment) any())).thenAnswer((Answer<Void>) invocation -> null);
			defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
			aotDetector.when(() -> AotDetector.useGeneratedArtifacts()).thenReturn(false);
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
			String[] stringArray = new String[] { "String[]" };
			doReturn(stringArray).when(configurableListableBeanFactoryMock2).getBeanNamesForType(Runner.class);
			doReturn(runnerMock).when(configurableListableBeanFactoryMock2).getBean("String[]", Runner.class);
			doReturn(false).when(configurableApplicationContextMock).isActive();
			doNothing().when(configurableApplicationContextMock).publishEvent((ApplicationEvent) any());
			doNothing().when(configurableApplicationContextMock).close();
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2);
			Collection<SpringBootExceptionReporter> collection = new ArrayList<>();
			collection.add(springBootExceptionReporterMock);
			doReturn(collection).when(springFactoriesLoaderMock2).load(SpringBootExceptionReporter.class, springFactoriesLoaderArgumentResolverMock2);
			Throwable throwable = new Throwable("message1", (Throwable) null);
			doReturn(true).when(springBootExceptionReporterMock).reportException(throwable);
			target = spy(new SpringApplication(resourceLoaderMock, classArray));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setApplicationContextFactory(applicationContextFactoryMock);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader5, classLoader).when(resourceLoaderMock).getClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			String[] stringArray2 = new String[] { "String[]" };
			doNothing().when(target).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray2));
			doNothing().when(target).bindToSpringApplication((ConfigurableEnvironment) any());
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
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
			ClassLoader classLoader4 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader2, classLoader3, classLoader4).when(target).getClassLoader();
			doNothing().when(target).registerLoggedException(throwable);
			String[] stringArray3 = new String[] { "String[]" };
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
				configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((Environment) any()), atLeast(2));
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
				verify(configurableApplicationContextMock, atLeast(1)).refresh();
				verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);
				verify(configurableListableBeanFactoryMock2, atLeast(1)).getBean("String[]", Runner.class);
				verify(configurableApplicationContextMock, atLeast(1)).isActive();
				verify(configurableApplicationContextMock, atLeast(1)).publishEvent((ApplicationEvent) any());
				verify(configurableApplicationContextMock, atLeast(1)).close();
				verify(springFactoriesLoaderMock2, atLeast(1)).load(SpringBootExceptionReporter.class, springFactoriesLoaderArgumentResolverMock2);
				verify(springBootExceptionReporterMock, atLeast(1)).reportException(throwable);
				verify(resourceLoaderMock, times(3)).getClassLoader();
				verify(target, times(3)).getClassLoader();
				verify(target, atLeast(1)).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray2));
				verify(target, atLeast(1)).bindToSpringApplication((ConfigurableEnvironment) any());
				verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);
				verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);
				verify(target, atLeast(1)).logStartupInfo(true);
				verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);
				verify(target, atLeast(1)).getAllSources();
				verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);
				verify(target, atLeast(1)).getApplicationLog();
				verify(target, atLeast(1)).getSpringBootExceptionHandler();
				verify(springBootExceptionHandlerMock, atLeast(1)).registerExitCode(-1);
				verify(target, atLeast(1)).registerLoggedException(throwable);
			});
		}
	}

	//Sapient generated method id: ${0919dc49-1474-3ca3-9a46-c293d6fa39d7}, hash: 72FB30AD08CA0E08649A74CED4851988
	@Disabled()
	@Test()
	void runWhenLoggerNotIsErrorEnabledAndContextIsNotNullAndExceptionNotInstanceOfRuntimeException3ThrowsIllegalStateException() throws IllegalStateException, BeansException {
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
		 *  Following variables could not be isolated/mocked: listeners, object of type StartupInfoLogger, shutdownHook
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringApplication.Startup springApplicationStartupMock = mock(SpringApplication.Startup.class);
		Duration durationMock = mock(Duration.class, "Duration");
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock = mock(SpringFactoriesLoader.ArgumentResolver.class);
		SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock2 = mock(SpringFactoriesLoader.ArgumentResolver.class);
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
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			SpringFactoriesLoader springFactoriesLoader3 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2).thenReturn(springFactoriesLoader3);
			springApplicationStartup.when(() -> SpringApplication.Startup.create()).thenReturn(springApplicationStartupMock);
			doReturn(durationMock).when(springApplicationStartupMock).started();
			Duration duration = Duration.ofDays(0L);
			doReturn(duration).when(springApplicationStartupMock).timeTakenToStarted();
			List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
			doReturn(springApplicationRunListenerList).when(springFactoriesLoaderMock).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
			configurationPropertySources.when(() -> ConfigurationPropertySources.attach((Environment) any())).thenAnswer((Answer<Void>) invocation -> null);
			defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd((ConfigurableEnvironment) any())).thenAnswer((Answer<Void>) invocation -> null);
			aotDetector.when(() -> AotDetector.useGeneratedArtifacts()).thenReturn(false);
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
			String[] stringArray = new String[] { "String[]" };
			doReturn(stringArray).when(configurableListableBeanFactoryMock2).getBeanNamesForType(Runner.class);
			doReturn(runnerMock).when(configurableListableBeanFactoryMock2).getBean("String[]", Runner.class);
			doReturn(false).when(configurableApplicationContextMock).isRunning();
			doReturn(false).when(configurableApplicationContextMock).isActive();
			doNothing().when(configurableApplicationContextMock).publishEvent((ApplicationEvent) any());
			doNothing().when(configurableApplicationContextMock).close();
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2);
			Collection<SpringBootExceptionReporter> collection = new ArrayList<>();
			collection.add(springBootExceptionReporterMock);
			doReturn(collection).when(springFactoriesLoaderMock2).load(SpringBootExceptionReporter.class, springFactoriesLoaderArgumentResolverMock2);
			Throwable throwable = new Throwable("message1", (Throwable) null);
			doReturn(true).when(springBootExceptionReporterMock).reportException(throwable);
			target = spy(new SpringApplication(resourceLoaderMock, classArray));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setApplicationContextFactory(applicationContextFactoryMock);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader5, classLoader).when(resourceLoaderMock).getClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			String[] stringArray2 = new String[] { "String[]" };
			doNothing().when(target).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray2));
			doNothing().when(target).bindToSpringApplication((ConfigurableEnvironment) any());
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
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
			ClassLoader classLoader4 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader2, classLoader3, classLoader4).when(target).getClassLoader();
			doNothing().when(target).registerLoggedException(throwable);
			String[] stringArray3 = new String[] { "String[]" };
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(SpringApplicationRunListener.class, springFactoriesLoaderArgumentResolverMock);
				configurationPropertySources.verify(() -> ConfigurationPropertySources.attach((Environment) any()), atLeast(2));
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
				verify(configurableApplicationContextMock, atLeast(1)).refresh();
				verify(configurableListableBeanFactoryMock2, atLeast(1)).getBeanNamesForType(Runner.class);
				verify(configurableListableBeanFactoryMock2, atLeast(1)).getBean("String[]", Runner.class);
				verify(configurableApplicationContextMock, atLeast(1)).isRunning();
				verify(configurableApplicationContextMock, atLeast(1)).isActive();
				verify(configurableApplicationContextMock, atLeast(1)).publishEvent((ApplicationEvent) any());
				verify(configurableApplicationContextMock, atLeast(1)).close();
				verify(springFactoriesLoaderMock2, atLeast(1)).load(SpringBootExceptionReporter.class, springFactoriesLoaderArgumentResolverMock2);
				verify(springBootExceptionReporterMock, atLeast(1)).reportException(throwable);
				verify(resourceLoaderMock, times(3)).getClassLoader();
				verify(target, times(3)).getClassLoader();
				verify(target, atLeast(1)).configureEnvironment((ConfigurableEnvironment) any(), eq(stringArray2));
				verify(target, atLeast(1)).bindToSpringApplication((ConfigurableEnvironment) any());
				verify(target, atLeast(1)).postProcessApplicationContext(configurableApplicationContextMock);
				verify(target, atLeast(1)).applyInitializers(configurableApplicationContextMock);
				verify(target, atLeast(1)).logStartupInfo(true);
				verify(target, atLeast(1)).logStartupProfileInfo(configurableApplicationContextMock);
				verify(target, atLeast(1)).getAllSources();
				verify(target, atLeast(1)).load(configurableApplicationContextMock, objectArray);
				verify(target, atLeast(1)).getApplicationLog();
				verify(target, atLeast(1)).getSpringBootExceptionHandler();
				verify(springBootExceptionHandlerMock, atLeast(1)).registerExitCode(-1);
				verify(target, atLeast(1)).registerLoggedException(throwable);
			});
		}
	}

	//Sapient generated method id: ${efc3cab0-063e-3c5f-8652-a491c759f58f}, hash: 0E66F575708D0F0E9A7E98A57B3A57FD
	@Test()
	void configureEnvironmentWhenThisAddConversionService() {
		/* Branches:
		 * (this.addConversionService) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: object of type StackWalker - Method: walk
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class);
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doNothing().when(environmentMock).setConversionService((ConfigurableConversionService) any());
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			List<Object> objectList = new ArrayList<>();
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
			String[] stringArray = new String[] { "--spring.profiles.active=test" };
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

	//Sapient generated method id: ${88a727de-fe97-3c21-b604-9fc8b26ac544}, hash: DB89FE72B12366245A49F93C85918D20
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
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class);
		MutablePropertySources mutablePropertySourcesMock = mock(MutablePropertySources.class);
		PropertySource propertySourceMock = mock(PropertySource.class);
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

	//Sapient generated method id: ${4919c374-d7fd-3f9f-82b7-ad194f8b70fd}, hash: 388C1A5E07F7A5E87832FD438460D189
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

	//Sapient generated method id: ${184ddb7b-6070-394a-bf3a-8807bda19b7f}, hash: CF8E565B0709B49AC77513F0BE9C0D68
	@Test()
	void bindToSpringApplicationTest() throws Exception {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class);
		Binder binderMock = mock(Binder.class);
		ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
		BindResult bindResultMock = mock(BindResult.class);
		Bindable<SpringApplication> bindableMock = mock(Bindable.class);
		try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
			 MockedStatic<Binder> binder = mockStatic(Binder.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			List<Object> objectList = new ArrayList<>();
			doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
			doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<ApplicationListener<?>> anyList2 = new ArrayList<>();
			anyList2.add(applicationListenerMock);
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

	//Sapient generated method id: ${890d1e16-f411-30d8-8955-b00f093a4f32}, hash: 7EB255E11DBE51BFAC26C1E35DE37A22
	@Disabled()
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
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class, "List");
		Binder binderMock = mock(Binder.class);
		ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class, "ConfigurableEnvironment");
		BindResult bindResultMock = mock(BindResult.class, "BindResult");
		Bindable<SpringApplication> bindableMock = mock(Bindable.class);
		try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
			 MockedStatic<Binder> binder = mockStatic(Binder.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ClassLoader classLoader2 = null;
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock);
			List<ApplicationListener<?>> anyList = new ArrayList<>();
			anyList.add(applicationListenerMock);
			doReturn(anyList).when(springFactoriesLoaderMock).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
			binder.when(() -> Binder.get(configurableEnvironmentMock)).thenReturn(binderMock);
			doReturn(bindResultMock).when(binderMock).bind("spring.main", bindableMock);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader2, classLoader).when(resourceLoaderMock).getClassLoader();
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
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(1));
				verify(springFactoriesLoaderMock, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
				binder.verify(() -> Binder.get(configurableEnvironmentMock), atLeast(1));
				verify(binderMock, atLeast(1)).bind("spring.main", bindableMock);
				verify(resourceLoaderMock, times(3)).getClassLoader();
				bindable.verify(() -> Bindable.ofInstance(target), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${b23810c3-dac9-3d30-ac48-d7155f542c94}, hash: 6EB5712C95C21E3BF7EBF6482401EF8A
	@Disabled()
	@Test()
	void createApplicationContextTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class, "List");
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ClassLoader classLoader2 = null;
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.REACTIVE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock);
			List<ApplicationListener<?>> anyList = new ArrayList<>();
			anyList.add(applicationListenerMock);
			doReturn(anyList).when(springFactoriesLoaderMock).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setApplicationContextFactory(applicationContextFactoryMock);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader2, classLoader).when(resourceLoaderMock).getClassLoader();
			//Act Statement(s)
			ConfigurableApplicationContext result = target.createApplicationContext();
			//Assert statement(s)
			//TODO: Please implement equals method in ConfigurableApplicationContext for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(1));
				verify(springFactoriesLoaderMock, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${212b5c97-e6ec-340e-86c7-b3128cd97492}, hash: 37F2504340263515917AF2F236EDC052
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
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class, "List");
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			List<Object> objectList = new ArrayList<>();
			doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
			doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<ApplicationListener<?>> anyList2 = new ArrayList<>();
			anyList2.add(applicationListenerMock);
			doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader4 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader, classLoader2, classLoader3, classLoader4).when(resourceLoaderMock).getClassLoader();
			GenericApplicationContext genericApplicationContext = new GenericApplicationContext();
			genericApplicationContext.setClassLoader(classLoader4);
			genericApplicationContext.setResourceLoader(resourceLoaderMock);
			//Act Statement(s)
			target.postProcessApplicationContext(genericApplicationContext);
			//Assert statement(s)
			assertAll("result", () -> {
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

	//Sapient generated method id: ${fe1d6de4-9f0b-30ee-bd41-02e2cb0fc896}, hash: 48BFF0E425A12B1F9BCF7AC6F0BA0736
	@Disabled()
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
		SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class, "List");
		ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		ApplicationContextInitializer applicationContextInitializerMock = mock(ApplicationContextInitializer.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<GenericTypeResolver> genericTypeResolver = mockStatic(GenericTypeResolver.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			List<Object> objectList = new ArrayList<>();
			doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
			doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<ApplicationListener<?>> anyList2 = new ArrayList<>();
			anyList2.add(applicationListenerMock);
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

	//Sapient generated method id: ${4d3f5881-2df7-36f6-ba0e-d378cc1c9961}, hash: D31A55101182036731495113F3B082D9
	@Test()
	void logStartupInfoWhenIsRoot() {
		/* Branches:
		 * (isRoot) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type StartupInfoLogger
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class);
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ClassLoader classLoader2 = null;
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock);
			List<ApplicationListener<?>> anyList = new ArrayList<>();
			anyList.add(applicationListenerMock);
			doReturn(anyList).when(springFactoriesLoaderMock).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = spy(new SpringApplication(resourceLoaderMock, classArray));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader2, classLoader).when(resourceLoaderMock).getClassLoader();
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(target).getApplicationLog();
			//Act Statement(s)
			target.logStartupInfo(true);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(1));
				verify(springFactoriesLoaderMock, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
				verify(target, atLeast(1)).getApplicationLog();
			});
		}
	}

	//Sapient generated method id: ${daa4637c-936e-33d8-b273-174c851b7d1f}, hash: DD671845A96550CFECDEA2252DC75DFB
	@Disabled()
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

	//Sapient generated method id: ${12ba3654-5a20-3d01-9ac3-101c24d7b881}, hash: E4FB497E066FBC4F0787C166310ADBBD
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
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class, "List");
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ClassLoader classLoader2 = null;
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock);
			List<ApplicationListener<?>> anyList = new ArrayList<>();
			anyList.add(applicationListenerMock);
			doReturn(anyList).when(springFactoriesLoaderMock).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader2, classLoader).when(resourceLoaderMock).getClassLoader();
			//Act Statement(s)
			Log result = target.getApplicationLog();
			//Assert statement(s)
			//TODO: Please implement equals method in Log for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(1));
				verify(springFactoriesLoaderMock, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${bada0cae-59b1-3cf6-9e9d-f0ac2dfb489f}, hash: EC39FEB165BA39F89C11C6918B756365
	@Disabled()
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

	//Sapient generated method id: ${9c00b33b-c8a9-3d56-a6c8-a065898a22cf}, hash: 9F1F2F6654B479B17C8B030067347332
	@Disabled()
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
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class, "ConfigurableListableBeanFactory");
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class, "void");
		BeanDefinitionLoader beanDefinitionLoaderMock = mock(BeanDefinitionLoader.class);
		BeanDefinitionRegistry beanDefinitionRegistryMock = mock(BeanDefinitionRegistry.class, "ConfigurableListableBeanFactory");
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(configurableListableBeanFactoryMock).when(abstractApplicationContextMock).getBeanFactory();
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			List<Object> objectList = new ArrayList<>();
			doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
			doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<ApplicationListener<?>> anyList2 = new ArrayList<>();
			anyList2.add(applicationListenerMock);
			doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
			Object object = new Object();
			Object[] objectArray = new Object[] { object };
			stringUtils.when(() -> StringUtils.arrayToCommaDelimitedString(objectArray)).thenReturn("String");
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

	//Sapient generated method id: ${42bd8e04-a447-3f2d-8974-3d8cc8bc6382}, hash: 124AD0421037929C8B766E52D4131F4C
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
		SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class);
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			List<Object> objectList = new ArrayList<>();
			doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
			doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<ApplicationListener<?>> anyList2 = new ArrayList<>();
			anyList2.add(applicationListenerMock);
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

	//Sapient generated method id: ${3225fa7f-29dc-3094-b54a-9418ca3a1291}, hash: CAE1921F7FB68FFF61D0A8C9A3E7DCB4
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
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class);
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			ClassLoader classLoader = ClassUtils.getDefaultClassLoader();
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation(classLoader);
			ClassLoader classLoader2 = ClassUtils.getDefaultClassLoader();
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoader2).thenReturn(springFactoriesLoaderMock);
			List<ApplicationListener<?>> anyList = new ArrayList<>();
			anyList.add(applicationListenerMock);
			doReturn(anyList).when(springFactoriesLoaderMock).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
			ClassLoader classLoader4 = ClassUtils.getDefaultClassLoader();
			classUtils.when(() -> ClassUtils.getDefaultClassLoader()).thenReturn(classLoader).thenReturn(classLoader2).thenReturn(classLoader3).thenReturn(classLoader4);
			target = new SpringApplication((ResourceLoader) null, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			ClassLoader result = target.getClassLoader();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(classLoader4));
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				classUtils.verify(() -> ClassUtils.getDefaultClassLoader(), atLeast(4));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(2));
				verify(springFactoriesLoaderMock, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
			});
		}
	}

	//Sapient generated method id: ${63370684-1d57-3cda-a9f9-2089947d8a17}, hash: 65594248BFEFB23B99B5FBCBEFAFE709
	@Test()
	void createBeanDefinitionLoaderTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class, "List");
		BeanDefinitionRegistry beanDefinitionRegistryMock = mock(BeanDefinitionRegistry.class, "BeanDefinitionRegistry");
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ClassLoader classLoader2 = null;
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock);
			List<ApplicationListener<?>> anyList = new ArrayList<>();
			anyList.add(applicationListenerMock);
			doReturn(anyList).when(springFactoriesLoaderMock).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader2, classLoader).when(resourceLoaderMock).getClassLoader();
			Object object = new Object();
			Object[] objectArray = new Object[] { object };
			//Act Statement(s)
			BeanDefinitionLoader result = target.createBeanDefinitionLoader(beanDefinitionRegistryMock, objectArray);
			//Assert statement(s)
			//TODO: Please implement equals method in BeanDefinitionLoader for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(1));
				verify(springFactoriesLoaderMock, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${3ebd3d04-76b3-320f-b304-f0b6a8fe009f}, hash: 433A2B48CD0AFF01AEDFB9D1C665300B
	@Test()
	void refreshTest() throws BeansException, IllegalStateException {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurableApplicationContext applicationContextMock = mock(ConfigurableApplicationContext.class);
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class, "List");
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doNothing().when(applicationContextMock).refresh();
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			List<Object> objectList = new ArrayList<>();
			doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
			doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<ApplicationListener<?>> anyList2 = new ArrayList<>();
			anyList2.add(applicationListenerMock);
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

	//Sapient generated method id: ${4a576cbb-85af-3f7f-a0a4-d2bcf1755ecd}, hash: 44DAD6CC4386079E0D27B009DF337C29
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
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class, "List");
		SpringBootExceptionHandler springBootExceptionHandlerMock = mock(SpringBootExceptionHandler.class);
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ClassLoader classLoader2 = null;
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock);
			List<ApplicationListener<?>> anyList = new ArrayList<>();
			anyList.add(applicationListenerMock);
			doReturn(anyList).when(springFactoriesLoaderMock).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = spy(new SpringApplication(resourceLoaderMock, classArray));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader2, classLoader).when(resourceLoaderMock).getClassLoader();
			doReturn(springBootExceptionHandlerMock).when(target).getSpringBootExceptionHandler();
			Throwable throwable = new Throwable();
			doNothing().when(springBootExceptionHandlerMock).registerLoggedException(throwable);
			//Act Statement(s)
			target.registerLoggedException(throwable);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(1));
				verify(springFactoriesLoaderMock, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
				verify(target, atLeast(1)).getSpringBootExceptionHandler();
				verify(springBootExceptionHandlerMock, atLeast(1)).registerLoggedException(throwable);
			});
		}
	}

	//Sapient generated method id: ${2183ec8d-e159-326b-b1a0-fcaea33dd430}, hash: 74420E8C573403FD2A23023E95CEDADC
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
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class, "List");
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ClassLoader classLoader2 = null;
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock);
			List<ApplicationListener<?>> anyList = new ArrayList<>();
			anyList.add(applicationListenerMock);
			doReturn(anyList).when(springFactoriesLoaderMock).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader2, classLoader).when(resourceLoaderMock).getClassLoader();
			//Act Statement(s)
			SpringBootExceptionHandler result = target.getSpringBootExceptionHandler();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(1));
				verify(springFactoriesLoaderMock, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${cfe5d614-23fb-3836-bd5d-b3a4127ae5c2}, hash: 523745CE4F4B6EEE877A9D99BC9A9607
	@Test()
	void setWebApplicationTypeTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
			ClassLoader classLoader2 = null;
			Class<?>[] classArray = new Class[] { SpringApplication.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock);
			List<ApplicationListener<?>> anyList = new ArrayList<>();
			anyList.add(applicationListenerMock);
			doReturn(anyList).when(springFactoriesLoaderMock).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader2, classLoader).when(resourceLoaderMock).getClassLoader();
			//Act Statement(s)
			target.setWebApplicationType(WebApplicationType.SERVLET);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(target.getWebApplicationType(), equalTo(WebApplicationType.SERVLET));
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(1));
				verify(springFactoriesLoaderMock, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${7a567995-faa8-3e43-85fb-47f2d1dbef8c}, hash: 0BB13A500581A045EAB6447DE4B63E4D
	@Test()
	void addBootstrapRegistryInitializerTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class);
		BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			List<Object> objectList = new ArrayList<>();
			doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
			doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<ApplicationListener<?>> anyList2 = new ArrayList<>();
			anyList2.add(applicationListenerMock);
			doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
			_assert.when(() -> Assert.notNull(bootstrapRegistryInitializerMock, "BootstrapRegistryInitializer must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
			//Act Statement(s)
			target.addBootstrapRegistryInitializer(bootstrapRegistryInitializerMock);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
				verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
				_assert.verify(() -> Assert.notNull(bootstrapRegistryInitializerMock, "BootstrapRegistryInitializer must not be null"), atLeast(1));
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${7bf9f5d4-184c-3a39-934e-7f7001221353}, hash: 5D8B952A51F9BD000599875834E6613C
	@Test()
	void setDefaultProperties1WhenCollectionsListDefaultPropertiesPropertyNamesIsNotEmpty() {
		/* Branches:
		 * (for-each(Collections.list(defaultProperties.propertyNames()))) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: object of type StackWalker - Method: walk
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ClassLoader classLoader2 = null;
			Class<?>[] classArray = new Class[] {};
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock);
			List<ApplicationListener<?>> anyList = new ArrayList<>();
			doReturn(anyList).when(springFactoriesLoaderMock).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader2, classLoader).when(resourceLoaderMock).getClassLoader();
			Properties properties = new Properties();
			//Act Statement(s)
			target.setDefaultProperties(properties);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(1));
				verify(springFactoriesLoaderMock, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${ca0a65e6-fc8d-3f7b-89c4-6575e2140f17}, hash: 3A490810E4C51B94733DC92AA8C14531
	@Disabled()
	@Test()
	void setAdditionalProfilesTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class, "List");
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ClassLoader classLoader2 = null;
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock);
			List<ApplicationListener<?>> anyList = new ArrayList<>();
			anyList.add(applicationListenerMock);
			doReturn(anyList).when(springFactoriesLoaderMock).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader2, classLoader).when(resourceLoaderMock).getClassLoader();
			String[] stringArray = new String[] { "String[]" };
			//Act Statement(s)
			target.setAdditionalProfiles(stringArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(target.getAdditionalProfiles().size(), equalTo(0));
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(1));
				verify(springFactoriesLoaderMock, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${62e170bc-1441-3662-bd95-fcc548180549}, hash: DD1235614737156ED05BE52544714EFF
	@Test()
	void setEnvironmentTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class, "List");
		ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class, "ConfigurableEnvironment");
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ClassLoader classLoader2 = null;
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock);
			List<ApplicationListener<?>> anyList = new ArrayList<>();
			anyList.add(applicationListenerMock);
			doReturn(anyList).when(springFactoriesLoaderMock).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader2, classLoader).when(resourceLoaderMock).getClassLoader();
			//Act Statement(s)
			target.setEnvironment(configurableEnvironmentMock);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(1));
				verify(springFactoriesLoaderMock, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${8bb24f6d-f691-3a0b-9b67-f93813cee29d}, hash: 0F156B182C63ED653A7CAB65FA19146C
	@Test()
	void addPrimarySourcesTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class);
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ClassLoader classLoader2 = null;
			Class<?>[] classArray = new Class[] {};
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock);
			List<ApplicationListener<?>> anyList = new ArrayList<>();
			anyList.add(applicationListenerMock);
			doReturn(anyList).when(springFactoriesLoaderMock).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader2, classLoader).when(resourceLoaderMock).getClassLoader();
			Collection<Class<?>> collection = new ArrayList<>();
			//Act Statement(s)
			target.addPrimarySources(collection);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(1));
				verify(springFactoriesLoaderMock, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${b266c308-ccb6-3103-9704-4dad9dcc13c6}, hash: F62AE2D99F8F30C5543E0A54DF0B7834
	@Disabled()
	@Test()
	void setSourcesTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class, "List");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
			ClassLoader classLoader2 = null;
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock);
			List<ApplicationListener<?>> anyList = new ArrayList<>();
			anyList.add(applicationListenerMock);
			doReturn(anyList).when(springFactoriesLoaderMock).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader2, classLoader).when(resourceLoaderMock).getClassLoader();
			Set<String> stringSet = new HashSet<>();
			stringSet.add("value");
			//Act Statement(s)
			target.setSources(stringSet);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(target.getSources().size(), equalTo(0));
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(1));
				verify(springFactoriesLoaderMock, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${7ca4ab72-66ec-3ee8-92d8-d83ade4d10e2}, hash: C5F093FA7A9F7C7163755F4B622BF2BE
	@Disabled()
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

	//Sapient generated method id: ${2a4d4666-3ec6-3350-bbd2-d61740db6402}, hash: 85276E3B70999DEE64AB4D8AC186D320
	@Test()
	void setResourceLoaderTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class, "List");
		ResourceLoader resourceLoaderMock2 = mock(ResourceLoader.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS)) {
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			List<Object> objectList = new ArrayList<>();
			doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
			doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<ApplicationListener<?>> anyList2 = new ArrayList<>();
			anyList2.add(applicationListenerMock);
			doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
				_assert.verify(() -> Assert.notNull(resourceLoaderMock2, "ResourceLoader must not be null"), atLeast(1));
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${3914a37c-38bf-3ffa-81f3-16abba975add}, hash: D22F79DD0F5289393F272500C943A792
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
		SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class, "List");
		ApplicationContextFactory applicationContextFactoryMock2 = mock(ApplicationContextFactory.class);
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			List<Object> objectList = new ArrayList<>();
			doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
			doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<ApplicationListener<?>> anyList2 = new ArrayList<>();
			anyList2.add(applicationListenerMock);
			doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
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
				verify(springFactoriesLoaderMock, atLeast(1)).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock2, atLeast(1)).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(springFactoriesLoaderMock3, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${cbecbfed-0103-33c5-ae0e-fbba9246ad93}, hash: 1148F258318A20C64B84F711735A64AF
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
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class);
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ClassLoader classLoader2 = null;
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock);
			List<ApplicationListener<?>> anyList = new ArrayList<>();
			anyList.add(applicationListenerMock);
			doReturn(anyList).when(springFactoriesLoaderMock).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader2, classLoader).when(resourceLoaderMock).getClassLoader();
			ApplicationContextFactory applicationContextFactory = null;
			//Act Statement(s)
			target.setApplicationContextFactory(applicationContextFactory);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(1));
				verify(springFactoriesLoaderMock, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${595291b2-32f5-3310-98d3-672101248388}, hash: 0C08426615F8210707A2887B9566980F
	@Test()
	void setInitializersTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class, "SpringFactoriesLoader");
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ClassLoader classLoader2 = null;
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock);
			List<ApplicationListener<?>> anyList = new ArrayList<>();
			anyList.add(applicationListenerMock);
			doReturn(anyList).when(springFactoriesLoaderMock).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader2, classLoader).when(resourceLoaderMock).getClassLoader();
			List<ApplicationContextInitializer<?>> anyList2 = new ArrayList<>();
			//Act Statement(s)
			target.setInitializers(anyList2);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(1));
				verify(springFactoriesLoaderMock, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${989e71c1-43b5-3b60-bd3d-0b55b3617114}, hash: C6FBAFB2204AD14F7D25C3189FA8975B
	@Test()
	void addInitializersTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class);
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ClassLoader classLoader2 = null;
			Class<?>[] classArray = new Class[] {};
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock);
			List<ApplicationListener<?>> anyList = new ArrayList<>();
			anyList.add(applicationListenerMock);
			doReturn(anyList).when(springFactoriesLoaderMock).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader2, classLoader).when(resourceLoaderMock).getClassLoader();
			ApplicationContextInitializer<?>[] applicationContextInitializerArray = new ApplicationContextInitializer[] {};
			//Act Statement(s)
			target.addInitializers(applicationContextInitializerArray);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(1));
				verify(springFactoriesLoaderMock, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${757246c3-9d4b-3c3b-9de8-9c3b71e7f6c4}, hash: 3DA3F68464EAC7267CFE390C6750953D
	@Test()
	void getInitializersTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class, "List");
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ClassLoader classLoader2 = null;
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock);
			List<ApplicationListener<?>> anyList = new ArrayList<>();
			anyList.add(applicationListenerMock);
			doReturn(anyList).when(springFactoriesLoaderMock).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader2, classLoader).when(resourceLoaderMock).getClassLoader();
			//Act Statement(s)
			Set<ApplicationContextInitializer<?>> result = target.getInitializers();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(1));
				verify(springFactoriesLoaderMock, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${4738b7b6-3b1c-3a7b-9897-15d45c98ffbc}, hash: 0F80A1C01634A6306AD56B034ADD994B
	@Test()
	void setListenersTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ClassLoader classLoader2 = null;
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock);
			List<ApplicationListener<?>> anyList = new ArrayList<>();
			doReturn(anyList).when(springFactoriesLoaderMock).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader2, classLoader).when(resourceLoaderMock).getClassLoader();
			//Act Statement(s)
			target.setListeners(anyList);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(1));
				verify(springFactoriesLoaderMock, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${8c3502b2-ba78-3b5d-ae77-8a49ede199a4}, hash: C621274F0FCB80E6778A4FD881C1A009
	@Test()
	void addListenersTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class);
		ApplicationListener applicationListenerMock2 = mock(ApplicationListener.class, "List");
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ClassLoader classLoader2 = null;
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock);
			List<ApplicationListener<?>> anyList = new ArrayList<>();
			anyList.add(applicationListenerMock);
			doReturn(anyList).when(springFactoriesLoaderMock).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader2, classLoader).when(resourceLoaderMock).getClassLoader();
			ApplicationListener<?>[] applicationListenerArray = new ApplicationListener[] { applicationListenerMock2 };
			//Act Statement(s)
			target.addListeners(applicationListenerArray);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(1));
				verify(springFactoriesLoaderMock, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${b1c37231-1147-3ac0-8762-d7c1e4be3220}, hash: 3EFA36C3B2693DB61035C5DB9DCA1AE1
	@Disabled()
	@Test()
	void getListenersTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class, "List");
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ClassLoader classLoader2 = null;
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock);
			List<ApplicationListener<?>> anyList = new ArrayList<>();
			anyList.add(applicationListenerMock);
			doReturn(anyList).when(springFactoriesLoaderMock).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader2, classLoader).when(resourceLoaderMock).getClassLoader();
			//Act Statement(s)
			Set<ApplicationListener<?>> result = target.getListeners();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(1));
				verify(springFactoriesLoaderMock, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${42991c09-c463-3ec4-93af-0a8b46b20a6a}, hash: D6C86C2B12672CD006156BBF017F6E83
	@Test()
	void setApplicationStartupWhenApplicationStartupIsNotNull() {
		/* Branches:
		 * (applicationStartup != null) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: object of type StackWalker - Method: walk
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		ApplicationStartup applicationStartupMock = mock(ApplicationStartup.class);
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ClassLoader classLoader2 = null;
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock);
			List<ApplicationListener<?>> anyList = new ArrayList<>();
			doReturn(anyList).when(springFactoriesLoaderMock).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader2, classLoader).when(resourceLoaderMock).getClassLoader();
			//Act Statement(s)
			target.setApplicationStartup(applicationStartupMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(target.getApplicationStartup(), is(notNullValue()));
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(1));
				verify(springFactoriesLoaderMock, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${5af4d4a4-5a21-3907-ba98-a9d64a2bc8cb}, hash: 5BAA3D7E001EAFDA8DED7E18C39ACE64
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
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class);
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class, CALLS_REAL_METHODS);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ClassLoader classLoader2 = null;
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			SpringFactoriesLoader springFactoriesLoader2 = SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null)).thenReturn(springFactoriesLoader2);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock);
			List<ApplicationListener<?>> anyList = new ArrayList<>();
			anyList.add(applicationListenerMock);
			doReturn(anyList).when(springFactoriesLoaderMock).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
			target = new SpringApplication(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(null, classLoader2, classLoader).when(resourceLoaderMock).getClassLoader();
			ApplicationStartup applicationStartup = null;
			//Act Statement(s)
			target.setApplicationStartup(applicationStartup);
			//Assert statement(s)
			//TODO: Please implement equals method in ApplicationStartup for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(target.getApplicationStartup(), is(notNullValue()));
				_assert.verify(() -> Assert.notNull(classArray, "PrimarySources must not be null"), atLeast(1));
				webApplicationType.verify(() -> WebApplicationType.deduceFromClasspath(), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) null), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(1));
				verify(springFactoriesLoaderMock, atLeast(1)).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
				verify(resourceLoaderMock, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${ec55dd97-cc79-3389-adde-70ed6128cc29}, hash: C7886B22EA5837D2B5B9E7E5EA57E5C2
	@Test()
	void getShutdownHandlersTest() {
		//Act Statement(s)
		SpringApplicationShutdownHandlers result = SpringApplication.getShutdownHandlers();
		//Assert statement(s)
		//TODO: Please implement equals method in SpringApplicationShutdownHandlers for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${f9b77011-dd18-3e0e-a3d8-448809a193dc}, hash: 42E133FBDE71223236B0C6EB252F2CDE
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

	//Sapient generated method id: ${df8a3a78-9698-3221-ad1a-aa38be07d856}, hash: 9D9BA4A0892535351098ACA994E02358
	@Disabled()
	@Test()
	void run2Test() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);
		SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class, "List");
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
			 MockedStatic<WebApplicationType> webApplicationType = mockStatic(WebApplicationType.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Class<?>[] classArray = new Class[] { Object.class };
			_assert.when(() -> Assert.notNull(classArray, "PrimarySources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			webApplicationType.when(() -> WebApplicationType.deduceFromClasspath()).thenReturn(WebApplicationType.NONE);
			List<Object> objectList = new ArrayList<>();
			doReturn(objectList).when(springFactoriesLoaderMock).load(BootstrapRegistryInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
			List<ApplicationContextInitializer<?>> anyList = new ArrayList<>();
			doReturn(anyList).when(springFactoriesLoaderMock2).load(ApplicationContextInitializer.class, (SpringFactoriesLoader.ArgumentResolver) null);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			List<ApplicationListener<?>> anyList2 = new ArrayList<>();
			anyList2.add(applicationListenerMock);
			doReturn(anyList2).when(springFactoriesLoaderMock3).load(ApplicationListener.class, (SpringFactoriesLoader.ArgumentResolver) null);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader, classLoader2, classLoader3).when(target).getClassLoader();
			String[] stringArray = new String[] { "<value>" };
			//Act Statement(s)
			ConfigurableApplicationContext result = SpringApplication.run(classArray, stringArray);
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
				verify(target, times(3)).getClassLoader();
			});
		}
	}

	//Sapient generated method id: ${634cff62-73ea-384c-b4f7-c860f350b812}, hash: BF5D317D6C00DD5A780A42943877BFA5
	@Disabled()
	@Test()
	void exitWhenContextNotInstanceOfConfigurableApplicationContext() throws Exception {
		/* Branches:
		 * (exitCode != 0) : true
		 * (context instanceof ConfigurableApplicationContext closable) : false  #  inside close method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: generators
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
			doNothing().when(contextMock).publishEvent((ApplicationEvent) any());
			_assert.when(() -> Assert.notNull(contextMock, "Context must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ExitCodeGenerator[] exitCodeGeneratorArray = new ExitCodeGenerator[] {};
			//Act Statement(s)
			int result = SpringApplication.exit(contextMock, exitCodeGeneratorArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(-1));
				verify(contextMock).getBeansOfType(ExitCodeGenerator.class);
				verify(contextMock).publishEvent((ApplicationEvent) any());
				_assert.verify(() -> Assert.notNull(contextMock, "Context must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${6ab69a31-1ec3-3279-afbc-34caa8ce00f8}, hash: FFF05B2682C578BED1C87F07FF1CC6AC
	@Disabled()
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
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ApplicationContext contextMock = mock(ApplicationContext.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Map<String, Object> stringObjectMap = new HashMap<>();
			doReturn(stringObjectMap).when(contextMock).getBeansOfType(ExitCodeGenerator.class);
			doNothing().when(contextMock).publishEvent((ApplicationEvent) any());
			_assert.when(() -> Assert.notNull(contextMock, "Context must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ExitCodeGenerator[] exitCodeGeneratorArray = new ExitCodeGenerator[] {};
			//Act Statement(s)
			int result = SpringApplication.exit(contextMock, exitCodeGeneratorArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(1));
				verify(contextMock).getBeansOfType(ExitCodeGenerator.class);
				verify(contextMock).publishEvent((ApplicationEvent) any());
				_assert.verify(() -> Assert.notNull(contextMock, "Context must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${ba3ceffd-bb89-3ab5-83dd-b11d2c8b734c}, hash: 9D4C6EBDC06A46EF7B4AD82A2A87132C
	@Disabled()
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

	//Sapient generated method id: ${75b57cb1-444a-3fb9-bd56-a8c3b1a5a77c}, hash: BE443B37D12901822D6E2BFCD1DE0535
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

	//Sapient generated method id: ${79487e9a-c9d6-3b9c-84f3-34134abce215}, hash: F79572989FC0BD877203DB8E089C8907
	@Test()
	void withHookTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: applicationHook - Method: set
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

	//Sapient generated method id: ${b35c15b1-6120-315a-a446-f9b18e544c21}, hash: 1A4605EA6FF601DED7836835F0475C48
	@Test()
	void withHook1Test() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: applicationHook
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
