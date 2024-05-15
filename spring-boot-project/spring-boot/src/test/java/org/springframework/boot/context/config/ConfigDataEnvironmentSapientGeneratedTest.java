package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.core.io.ResourceLoader;
import org.springframework.boot.DefaultPropertiesPropertySource;
import org.springframework.core.log.LogMessage;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.boot.BootstrapRegistry;
import org.springframework.util.StringUtils;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.logging.DeferredLogFactory;
import java.util.ArrayList;
import org.springframework.core.env.ConfigurableEnvironment;
import org.mockito.stubbing.Answer;
import org.apache.commons.logging.impl.NoOpLog;
import org.springframework.boot.context.properties.bind.BindException;
import java.util.Iterator;
import org.springframework.boot.context.properties.bind.Bindable;
import java.util.Collection;
import java.util.function.Supplier;
import org.mockito.MockedStatic;
import org.springframework.core.io.support.SpringFactoriesLoader;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.atLeast;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigDataEnvironmentSapientGeneratedTest {

    private final ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class, "environment");

    private final ConfigurableBootstrapContext bootstrapContextMock = mock(ConfigurableBootstrapContext.class, "bootstrapContext");

    private final ConfigDataEnvironmentUpdateListener environmentUpdateListenerMock = mock(ConfigDataEnvironmentUpdateListener.class, "environmentUpdateListener");

    private final BindResult bindResultMock = mock(BindResult.class);

    private final BindResult bindResultMock2 = mock(BindResult.class);

    private final BindResult bindResultMock3 = mock(BindResult.class);

    private final BindResult bindResultMock4 = mock(BindResult.class);

    private final Binder binderMock = mock(Binder.class);

    private final BootstrapRegistry.InstanceSupplier bootstrapRegistryInstanceSupplierMock = mock(BootstrapRegistry.InstanceSupplier.class);

    private final BootstrapRegistry.InstanceSupplier bootstrapRegistryInstanceSupplierMock2 = mock(BootstrapRegistry.InstanceSupplier.class);

    private final BootstrapRegistry.InstanceSupplier bootstrapRegistryInstanceSupplierMock3 = mock(BootstrapRegistry.InstanceSupplier.class);

    private final BootstrapRegistry.InstanceSupplier bootstrapRegistryInstanceSupplierMock4 = mock(BootstrapRegistry.InstanceSupplier.class);

    private final BootstrapRegistry.InstanceSupplier bootstrapRegistryInstanceSupplierMock5 = mock(BootstrapRegistry.InstanceSupplier.class);

    private final BootstrapRegistry.InstanceSupplier bootstrapRegistryInstanceSupplierMock6 = mock(BootstrapRegistry.InstanceSupplier.class);

    private final BootstrapRegistry.InstanceSupplier bootstrapRegistryInstanceSupplierMock7 = mock(BootstrapRegistry.InstanceSupplier.class);

    private final BootstrapRegistry.InstanceSupplier bootstrapRegistryInstanceSupplierMock8 = mock(BootstrapRegistry.InstanceSupplier.class);

    private final ConfigDataEnvironmentContributor configDataEnvironmentContributorMock = mock(ConfigDataEnvironmentContributor.class);

    private final ConfigDataEnvironmentContributor configDataEnvironmentContributorMock2 = mock(ConfigDataEnvironmentContributor.class);

    private final ConfigDataEnvironmentContributor configDataEnvironmentContributorMock3 = mock(ConfigDataEnvironmentContributor.class);

    private final ConfigDataEnvironmentContributor configDataEnvironmentContributorMock4 = mock(ConfigDataEnvironmentContributor.class);

    private final ConfigDataEnvironmentContributor configDataEnvironmentContributorMock5 = mock(ConfigDataEnvironmentContributor.class);

    private final ConfigDataLocation configDataLocationMock = mock(ConfigDataLocation.class);

    private final ConfigDataLocation configDataLocationMock2 = mock(ConfigDataLocation.class);

    private final ConfigDataLocation configDataLocationMock3 = mock(ConfigDataLocation.class);

    private final DeferredLogFactory logFactoryMock = mock(DeferredLogFactory.class);

    private final LogMessage logMessageMock = mock(LogMessage.class);

    private final LogMessage logMessageMock2 = mock(LogMessage.class);

    private final LogMessage logMessageMock3 = mock(LogMessage.class);

    private final LogMessage logMessageMock4 = mock(LogMessage.class);

    private final LogMessage logMessageMock5 = mock(LogMessage.class);

    private final LogMessage logMessageMock6 = mock(LogMessage.class);

    private final MutablePropertySources mutablePropertySourcesMock = mock(MutablePropertySources.class);

    private final MutablePropertySources mutablePropertySourcesMock2 = mock(MutablePropertySources.class);

    private final PropertySource<?> propertySourceMock = mock(PropertySource.class);

    private final ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);

    private final SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);

    private final SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);

    //Sapient generated method id: ${createConfigDataLocationResolversTest}, hash: E33D7C0C43E76A9FEEF012CE27B5FD80
    @Disabled()
    @Test()
    void createConfigDataLocationResolversTest() {
        //Arrange Statement(s)
        SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
        ConfigurableBootstrapContext configurableBootstrapContextMock = mock(ConfigurableBootstrapContext.class);
        try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<ConfigDataEnvironmentContributor> configDataEnvironmentContributor = mockStatic(ConfigDataEnvironmentContributor.class);
            MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
            MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
            MockedStatic<Binder> binder = mockStatic(Binder.class)) {
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataEnvironment.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.on-not-found", ConfigDataNotFoundAction.class);
            doReturn(ConfigDataNotFoundAction.FAIL).when(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
            doReturn(bindResultMock2).when(binderMock).bind(eq("spring.config.import"), (Bindable) any());
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
            ConfigDataLocation[] configDataLocationArray2 = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(bindResultMock2).orElse(configDataLocationArray2);
            doReturn(bindResultMock3).when(binderMock).bind(eq("spring.config.additional-location"), (Bindable) any());
            ConfigDataLocation[] configDataLocationArray3 = new ConfigDataLocation[] { configDataLocationMock2 };
            doReturn(configDataLocationArray3).when(bindResultMock3).orElse(configDataLocationArray2);
            doReturn(bindResultMock4).when(binderMock).bind(eq("spring.config.location"), (Bindable) any());
            ConfigDataLocation[] configDataLocationArray4 = new ConfigDataLocation[] { configDataLocationMock3 };
            ConfigDataLocation configDataLocation = ConfigDataLocation.of("optional:classpath:/;optional:classpath:/config/");
            ConfigDataLocation configDataLocation2 = ConfigDataLocation.of("optional:file:./;optional:file:./config/;optional:file:./config/*/");
            ConfigDataLocation[] configDataLocationArray5 = new ConfigDataLocation[] { configDataLocation, configDataLocation2 };
            doReturn(configDataLocationArray4).when(bindResultMock4).orElse(configDataLocationArray5);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
            binder.when(() -> Binder.get(environmentMock)).thenReturn(binderMock);
            defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock)).thenReturn(true);
            logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock)).thenReturn(logMessageMock);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock)).thenReturn(configDataEnvironmentContributorMock);
            logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock2)).thenReturn(logMessageMock2);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2)).thenReturn(configDataEnvironmentContributorMock2);
            logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock3)).thenReturn(logMessageMock3);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3)).thenReturn(configDataEnvironmentContributorMock3);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofExisting(propertySourceMock)).thenReturn(configDataEnvironmentContributorMock4);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
            Collection<String> collection = new ArrayList<>();
            ConfigDataEnvironment target = new ConfigDataEnvironment(logFactoryMock, configurableBootstrapContextMock, environmentMock, resourceLoaderMock, collection, environmentUpdateListenerMock);
            doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
            doReturn(1).when(mutablePropertySourcesMock).size();
            List<PropertySource<?>> anyList = new ArrayList<>();
            anyList.add(propertySourceMock);
            Iterator<PropertySource<?>> iterator = anyList.iterator();
            doReturn(iterator).when(mutablePropertySourcesMock).iterator();
            //Act Statement(s)
            ConfigDataLocationResolvers result = target.createConfigDataLocationResolvers(logFactoryMock, configurableBootstrapContextMock, binderMock, resourceLoaderMock);
            //Assert statement(s)
            //TODO: Please implement equals method in ConfigDataLocationResolvers for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(logFactoryMock, atLeast(1)).getLog(ConfigDataEnvironment.class);
                verify(binderMock, atLeast(1)).bind("spring.config.on-not-found", ConfigDataNotFoundAction.class);
                verify(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
                verify(binderMock).bind(eq("spring.config.import"), (Bindable) any());
                verify(bindResultMock2).orElse(configDataLocationArray2);
                verify(binderMock).bind(eq("spring.config.additional-location"), (Bindable) any());
                verify(bindResultMock3).orElse(configDataLocationArray2);
                verify(binderMock).bind(eq("spring.config.location"), (Bindable) any());
                verify(bindResultMock4).orElse(configDataLocationArray5);
                verify(resourceLoaderMock, atLeast(3)).getClassLoader();
                binder.verify(() -> Binder.get(environmentMock), atLeast(1));
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
                defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock2), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock3), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofExisting(propertySourceMock), atLeast(1));
                verify(environmentMock).getPropertySources();
                verify(mutablePropertySourcesMock).size();
                verify(mutablePropertySourcesMock).iterator();
            });
        }
    }

    //Sapient generated method id: ${createContributors1Test}, hash: FB7B33DBD8D7E5D1898D48299CE806A3
    @Disabled()
    @Test()
    void createContributors1Test() {
        //Arrange Statement(s)
        try (MockedStatic<ConfigDataEnvironmentContributor> configDataEnvironmentContributor = mockStatic(ConfigDataEnvironmentContributor.class);
            MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
            MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<Binder> binder = mockStatic(Binder.class)) {
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataEnvironment.class);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2).when(resourceLoaderMock).getClassLoader();
            binder.when(() -> Binder.get(environmentMock)).thenReturn(binderMock);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.on-not-found", ConfigDataNotFoundAction.class);
            doReturn(ConfigDataNotFoundAction.FAIL).when(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
            doReturn(bindResultMock2).when(binderMock).bind(eq("spring.config.import"), (Bindable) any());
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
            ConfigDataLocation[] configDataLocationArray2 = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(bindResultMock2).orElse(configDataLocationArray2);
            doReturn(bindResultMock3).when(binderMock).bind(eq("spring.config.additional-location"), (Bindable) any());
            ConfigDataLocation[] configDataLocationArray3 = new ConfigDataLocation[] { configDataLocationMock2 };
            doReturn(configDataLocationArray3).when(bindResultMock3).orElse(configDataLocationArray2);
            doReturn(bindResultMock4).when(binderMock).bind(eq("spring.config.location"), (Bindable) any());
            ConfigDataLocation[] configDataLocationArray4 = new ConfigDataLocation[] { configDataLocationMock3 };
            ConfigDataLocation configDataLocation = ConfigDataLocation.of("optional:classpath:/;optional:classpath:/config/");
            ConfigDataLocation configDataLocation2 = ConfigDataLocation.of("optional:file:./;optional:file:./config/;optional:file:./config/*/");
            ConfigDataLocation[] configDataLocationArray5 = new ConfigDataLocation[] { configDataLocation, configDataLocation2 };
            doReturn(configDataLocationArray4).when(bindResultMock4).orElse(configDataLocationArray5);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2);
            defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock)).thenReturn(true);
            logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock)).thenReturn(logMessageMock);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock)).thenReturn(configDataEnvironmentContributorMock);
            logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock2)).thenReturn(logMessageMock2);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2)).thenReturn(configDataEnvironmentContributorMock2);
            logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock3)).thenReturn(logMessageMock3);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3)).thenReturn(configDataEnvironmentContributorMock3);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofExisting(propertySourceMock)).thenReturn(configDataEnvironmentContributorMock4);
            Collection<String> collection = new ArrayList<>();
            ConfigDataEnvironment target = new ConfigDataEnvironment(logFactoryMock, bootstrapContextMock, environmentMock, resourceLoaderMock, collection, environmentUpdateListenerMock);
            doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
            doReturn(1).when(mutablePropertySourcesMock).size();
            List<PropertySource<?>> anyList = new ArrayList<>();
            anyList.add(propertySourceMock);
            Iterator<PropertySource<?>> iterator = anyList.iterator();
            doReturn(iterator).when(mutablePropertySourcesMock).iterator();
            List<ConfigDataEnvironmentContributor> configDataEnvironmentContributorList = new ArrayList<>(11);
            configDataEnvironmentContributorList.add(configDataEnvironmentContributorMock);
            configDataEnvironmentContributorList.add(configDataEnvironmentContributorMock2);
            configDataEnvironmentContributorList.add(configDataEnvironmentContributorMock3);
            configDataEnvironmentContributorList.add(configDataEnvironmentContributorMock4);
            //Act Statement(s)
            ConfigDataEnvironmentContributors result = target.createContributors(configDataEnvironmentContributorList);
            //Assert statement(s)
            //TODO: Please implement equals method in ConfigDataEnvironmentContributors for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(logFactoryMock, atLeast(1)).getLog(ConfigDataEnvironment.class);
                verify(resourceLoaderMock, times(2)).getClassLoader();
                binder.verify(() -> Binder.get(environmentMock), atLeast(1));
                verify(binderMock).bind("spring.config.on-not-found", ConfigDataNotFoundAction.class);
                verify(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
                verify(binderMock).bind(eq("spring.config.import"), (Bindable) any());
                verify(bindResultMock2).orElse(configDataLocationArray2);
                verify(binderMock).bind(eq("spring.config.additional-location"), (Bindable) any());
                verify(bindResultMock3).orElse(configDataLocationArray2);
                verify(binderMock).bind(eq("spring.config.location"), (Bindable) any());
                verify(bindResultMock4).orElse(configDataLocationArray5);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(2));
                defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock2), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock3), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofExisting(propertySourceMock), atLeast(1));
                verify(environmentMock).getPropertySources();
                verify(mutablePropertySourcesMock).size();
                verify(mutablePropertySourcesMock).iterator();
            });
        }
    }

    //Sapient generated method id: ${processAndApplyWhenExGetCauseInstanceOfInactiveConfigDataAccessExceptionThrowsInactiveConfigDataAccessException}, hash: 46F5F67E00EF07EFCAEEF4D09179660D
    @Disabled()
    @Test()
    void processAndApplyWhenExGetCauseInstanceOfInactiveConfigDataAccessExceptionThrowsInactiveConfigDataAccessException() {
        /* Branches:
         * (catch-exception (BindException)) : true  #  inside createActivationContext method
         * (ex.getCause() instanceof InactiveConfigDataAccessException inactiveException) : true  #  inside createActivationContext method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: contributors - Method: withProcessedImports
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BootstrapRegistry.InstanceSupplier> bootstrapRegistryInstanceSupplier = mockStatic(BootstrapRegistry.InstanceSupplier.class);
            MockedStatic<ConfigDataEnvironmentContributor> configDataEnvironmentContributor = mockStatic(ConfigDataEnvironmentContributor.class);
            MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
            MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<Binder> binder = mockStatic(Binder.class)) {
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataEnvironment.class);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2).when(resourceLoaderMock).getClassLoader();
            binder.when(() -> Binder.get(environmentMock)).thenReturn(binderMock);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.on-not-found", ConfigDataNotFoundAction.class);
            doReturn(ConfigDataNotFoundAction.FAIL).when(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
            doReturn(bindResultMock2).when(binderMock).bind(eq("spring.config.import"), (Bindable) any());
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
            ConfigDataLocation[] configDataLocationArray2 = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(bindResultMock2).orElse(configDataLocationArray2);
            doReturn(bindResultMock3).when(binderMock).bind(eq("spring.config.additional-location"), (Bindable) any());
            ConfigDataLocation[] configDataLocationArray3 = new ConfigDataLocation[] { configDataLocationMock2 };
            doReturn(configDataLocationArray3).when(bindResultMock3).orElse(configDataLocationArray2);
            doReturn(bindResultMock4).when(binderMock).bind(eq("spring.config.location"), (Bindable) any());
            ConfigDataLocation[] configDataLocationArray4 = new ConfigDataLocation[] { configDataLocationMock3 };
            ConfigDataLocation configDataLocation = ConfigDataLocation.of("optional:classpath:/;optional:classpath:/config/");
            ConfigDataLocation configDataLocation2 = ConfigDataLocation.of("optional:file:./;optional:file:./config/;optional:file:./config/*/");
            ConfigDataLocation[] configDataLocationArray5 = new ConfigDataLocation[] { configDataLocation, configDataLocation2 };
            doReturn(configDataLocationArray4).when(bindResultMock4).orElse(configDataLocationArray5);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2);
            defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock)).thenReturn(true);
            logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock)).thenReturn(logMessageMock);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock)).thenReturn(configDataEnvironmentContributorMock);
            logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock2)).thenReturn(logMessageMock2);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2)).thenReturn(configDataEnvironmentContributorMock2);
            logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock3)).thenReturn(logMessageMock3);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3)).thenReturn(configDataEnvironmentContributorMock3);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofExisting(propertySourceMock)).thenReturn(configDataEnvironmentContributorMock4);
            doReturn(bootstrapRegistryInstanceSupplierMock2).when(bootstrapRegistryInstanceSupplierMock).withScope(BootstrapRegistry.Scope.PROTOTYPE);
            bootstrapRegistryInstanceSupplier.when(() -> BootstrapRegistry.InstanceSupplier.from((Supplier) any())).thenReturn(bootstrapRegistryInstanceSupplierMock).thenReturn(bootstrapRegistryInstanceSupplierMock3);
            doReturn(bootstrapRegistryInstanceSupplierMock4).when(bootstrapRegistryInstanceSupplierMock3).withScope(BootstrapRegistry.Scope.PROTOTYPE);
            Collection<String> collection = new ArrayList<>();
            ConfigDataEnvironment target = new ConfigDataEnvironment(logFactoryMock, bootstrapContextMock, environmentMock, resourceLoaderMock, collection, environmentUpdateListenerMock);
            doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
            doReturn(1).when(mutablePropertySourcesMock).size();
            List<PropertySource<?>> anyList = new ArrayList<>();
            anyList.add(propertySourceMock);
            Iterator<PropertySource<?>> iterator = anyList.iterator();
            doReturn(iterator).when(mutablePropertySourcesMock).iterator();
            doNothing().when(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock2);
            doNothing().when(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock4);
            //Act Statement(s)
            final InactiveConfigDataAccessException result = assertThrows(InactiveConfigDataAccessException.class, () -> {
                target.processAndApply();
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(logFactoryMock).getLog(ConfigDataEnvironment.class);
                verify(resourceLoaderMock, times(2)).getClassLoader();
                binder.verify(() -> Binder.get(environmentMock), atLeast(1));
                verify(binderMock).bind("spring.config.on-not-found", ConfigDataNotFoundAction.class);
                verify(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
                verify(binderMock).bind(eq("spring.config.import"), (Bindable) any());
                verify(bindResultMock2).orElse(configDataLocationArray2);
                verify(binderMock).bind(eq("spring.config.additional-location"), (Bindable) any());
                verify(bindResultMock3).orElse(configDataLocationArray2);
                verify(binderMock).bind(eq("spring.config.location"), (Bindable) any());
                verify(bindResultMock4).orElse(configDataLocationArray5);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(2));
                defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock2), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock3), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofExisting(propertySourceMock), atLeast(1));
                bootstrapRegistryInstanceSupplier.verify(() -> BootstrapRegistry.InstanceSupplier.from((Supplier) any()), atLeast(2));
                verify(bootstrapRegistryInstanceSupplierMock, atLeast(1)).withScope(BootstrapRegistry.Scope.PROTOTYPE);
                verify(bootstrapRegistryInstanceSupplierMock3, atLeast(1)).withScope(BootstrapRegistry.Scope.PROTOTYPE);
                verify(environmentMock).getPropertySources();
                verify(mutablePropertySourcesMock).size();
                verify(mutablePropertySourcesMock).iterator();
                verify(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock2);
                verify(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock4);
            });
        }
    }

    //Sapient generated method id: ${processAndApplyWhenExGetCauseNotInstanceOfInactiveConfigDataAccessExceptionThrowsBindException}, hash: 00F9FBFAC8CA0C5DA6F63C7C97DBC7CC
    @Disabled()
    @Test()
    void processAndApplyWhenExGetCauseNotInstanceOfInactiveConfigDataAccessExceptionThrowsBindException() {
        /* Branches:
         * (catch-exception (BindException)) : true  #  inside createActivationContext method
         * (ex.getCause() instanceof InactiveConfigDataAccessException inactiveException) : false  #  inside createActivationContext method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: contributors - Method: withProcessedImports
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BootstrapRegistry.InstanceSupplier> bootstrapRegistryInstanceSupplier = mockStatic(BootstrapRegistry.InstanceSupplier.class);
            MockedStatic<ConfigDataEnvironmentContributor> configDataEnvironmentContributor = mockStatic(ConfigDataEnvironmentContributor.class);
            MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
            MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<Binder> binder = mockStatic(Binder.class)) {
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataEnvironment.class);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2).when(resourceLoaderMock).getClassLoader();
            binder.when(() -> Binder.get(environmentMock)).thenReturn(binderMock);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.on-not-found", ConfigDataNotFoundAction.class);
            doReturn(ConfigDataNotFoundAction.FAIL).when(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
            doReturn(bindResultMock2).when(binderMock).bind(eq("spring.config.import"), (Bindable) any());
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
            ConfigDataLocation[] configDataLocationArray2 = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(bindResultMock2).orElse(configDataLocationArray2);
            doReturn(bindResultMock3).when(binderMock).bind(eq("spring.config.additional-location"), (Bindable) any());
            ConfigDataLocation[] configDataLocationArray3 = new ConfigDataLocation[] { configDataLocationMock2 };
            doReturn(configDataLocationArray3).when(bindResultMock3).orElse(configDataLocationArray2);
            doReturn(bindResultMock4).when(binderMock).bind(eq("spring.config.location"), (Bindable) any());
            ConfigDataLocation[] configDataLocationArray4 = new ConfigDataLocation[] { configDataLocationMock3 };
            ConfigDataLocation configDataLocation = ConfigDataLocation.of("optional:classpath:/;optional:classpath:/config/");
            ConfigDataLocation configDataLocation2 = ConfigDataLocation.of("optional:file:./;optional:file:./config/;optional:file:./config/*/");
            ConfigDataLocation[] configDataLocationArray5 = new ConfigDataLocation[] { configDataLocation, configDataLocation2 };
            doReturn(configDataLocationArray4).when(bindResultMock4).orElse(configDataLocationArray5);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2);
            defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock)).thenReturn(true);
            logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock)).thenReturn(logMessageMock);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock)).thenReturn(configDataEnvironmentContributorMock);
            logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock2)).thenReturn(logMessageMock2);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2)).thenReturn(configDataEnvironmentContributorMock2);
            logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock3)).thenReturn(logMessageMock3);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3)).thenReturn(configDataEnvironmentContributorMock3);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofExisting(propertySourceMock)).thenReturn(configDataEnvironmentContributorMock4);
            doReturn(bootstrapRegistryInstanceSupplierMock2).when(bootstrapRegistryInstanceSupplierMock).withScope(BootstrapRegistry.Scope.PROTOTYPE);
            bootstrapRegistryInstanceSupplier.when(() -> BootstrapRegistry.InstanceSupplier.from((Supplier) any())).thenReturn(bootstrapRegistryInstanceSupplierMock).thenReturn(bootstrapRegistryInstanceSupplierMock3);
            doReturn(bootstrapRegistryInstanceSupplierMock4).when(bootstrapRegistryInstanceSupplierMock3).withScope(BootstrapRegistry.Scope.PROTOTYPE);
            Collection<String> collection = new ArrayList<>();
            ConfigDataEnvironment target = new ConfigDataEnvironment(logFactoryMock, bootstrapContextMock, environmentMock, resourceLoaderMock, collection, environmentUpdateListenerMock);
            doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
            doReturn(1).when(mutablePropertySourcesMock).size();
            List<PropertySource<?>> anyList = new ArrayList<>();
            anyList.add(propertySourceMock);
            Iterator<PropertySource<?>> iterator = anyList.iterator();
            doReturn(iterator).when(mutablePropertySourcesMock).iterator();
            doNothing().when(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock2);
            doNothing().when(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock4);
            //Act Statement(s)
            final BindException result = assertThrows(BindException.class, () -> {
                target.processAndApply();
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(logFactoryMock).getLog(ConfigDataEnvironment.class);
                verify(resourceLoaderMock, times(2)).getClassLoader();
                binder.verify(() -> Binder.get(environmentMock), atLeast(1));
                verify(binderMock).bind("spring.config.on-not-found", ConfigDataNotFoundAction.class);
                verify(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
                verify(binderMock).bind(eq("spring.config.import"), (Bindable) any());
                verify(bindResultMock2).orElse(configDataLocationArray2);
                verify(binderMock).bind(eq("spring.config.additional-location"), (Bindable) any());
                verify(bindResultMock3).orElse(configDataLocationArray2);
                verify(binderMock).bind(eq("spring.config.location"), (Bindable) any());
                verify(bindResultMock4).orElse(configDataLocationArray5);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(2));
                defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock2), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock3), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofExisting(propertySourceMock), atLeast(1));
                bootstrapRegistryInstanceSupplier.verify(() -> BootstrapRegistry.InstanceSupplier.from((Supplier) any()), atLeast(2));
                verify(bootstrapRegistryInstanceSupplierMock, atLeast(1)).withScope(BootstrapRegistry.Scope.PROTOTYPE);
                verify(bootstrapRegistryInstanceSupplierMock3, atLeast(1)).withScope(BootstrapRegistry.Scope.PROTOTYPE);
                verify(environmentMock).getPropertySources();
                verify(mutablePropertySourcesMock).size();
                verify(mutablePropertySourcesMock).iterator();
                verify(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock2);
                verify(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock4);
            });
        }
    }

    //Sapient generated method id: ${processAndApplyWhenCaughtBindExceptionAndExGetCauseInstanceOfInactiveConfigDataAThrowsInactiveConfigDataAccessException}, hash: 9643BCB3CB05F925629F3AC85273062F
    @Disabled()
    @Test()
    void processAndApplyWhenCaughtBindExceptionAndExGetCauseInstanceOfInactiveConfigDataAThrowsInactiveConfigDataAccessException() {
        /* Branches:
         * (for-each(contributors)) : true  #  inside getIncludedProfiles method
         * (source != null) : true  #  inside getIncludedProfiles method
         * (!contributor.hasConfigDataOption(ConfigData.Option.IGNORE_PROFILES)) : true  #  inside getIncludedProfiles method
         * (catch-exception (BindException)) : true  #  inside withProfiles method
         * (ex.getCause() instanceof InactiveConfigDataAccessException inactiveException) : true  #  inside withProfiles method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: contributors - Method: withProcessedImports
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BootstrapRegistry.InstanceSupplier> bootstrapRegistryInstanceSupplier = mockStatic(BootstrapRegistry.InstanceSupplier.class);
            MockedStatic<ConfigDataEnvironmentContributor> configDataEnvironmentContributor = mockStatic(ConfigDataEnvironmentContributor.class);
            MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
            MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<Binder> binder = mockStatic(Binder.class)) {
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataEnvironment.class);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2).when(resourceLoaderMock).getClassLoader();
            binder.when(() -> Binder.get(environmentMock)).thenReturn(binderMock);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.on-not-found", ConfigDataNotFoundAction.class);
            doReturn(ConfigDataNotFoundAction.FAIL).when(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
            doReturn(bindResultMock2).when(binderMock).bind(eq("spring.config.import"), (Bindable) any());
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
            ConfigDataLocation[] configDataLocationArray2 = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(bindResultMock2).orElse(configDataLocationArray2);
            doReturn(bindResultMock3).when(binderMock).bind(eq("spring.config.additional-location"), (Bindable) any());
            ConfigDataLocation[] configDataLocationArray3 = new ConfigDataLocation[] { configDataLocationMock2 };
            doReturn(configDataLocationArray3).when(bindResultMock3).orElse(configDataLocationArray2);
            doReturn(bindResultMock4).when(binderMock).bind(eq("spring.config.location"), (Bindable) any());
            ConfigDataLocation[] configDataLocationArray4 = new ConfigDataLocation[] { configDataLocationMock3 };
            ConfigDataLocation configDataLocation = ConfigDataLocation.of("optional:classpath:/;optional:classpath:/config/");
            ConfigDataLocation configDataLocation2 = ConfigDataLocation.of("optional:file:./;optional:file:./config/;optional:file:./config/*/");
            ConfigDataLocation[] configDataLocationArray5 = new ConfigDataLocation[] { configDataLocation, configDataLocation2 };
            doReturn(configDataLocationArray4).when(bindResultMock4).orElse(configDataLocationArray5);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2);
            defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock)).thenReturn(true);
            logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock)).thenReturn(logMessageMock);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock)).thenReturn(configDataEnvironmentContributorMock);
            logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock2)).thenReturn(logMessageMock2);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2)).thenReturn(configDataEnvironmentContributorMock2);
            logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock3)).thenReturn(logMessageMock3);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3)).thenReturn(configDataEnvironmentContributorMock3);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofExisting(propertySourceMock)).thenReturn(configDataEnvironmentContributorMock4);
            doReturn(bootstrapRegistryInstanceSupplierMock2).when(bootstrapRegistryInstanceSupplierMock).withScope(BootstrapRegistry.Scope.PROTOTYPE);
            doReturn(bootstrapRegistryInstanceSupplierMock4).when(bootstrapRegistryInstanceSupplierMock3).withScope(BootstrapRegistry.Scope.PROTOTYPE);
            bootstrapRegistryInstanceSupplier.when(() -> BootstrapRegistry.InstanceSupplier.from((Supplier) any())).thenReturn(bootstrapRegistryInstanceSupplierMock).thenReturn(bootstrapRegistryInstanceSupplierMock3).thenReturn(bootstrapRegistryInstanceSupplierMock5);
            doReturn(bootstrapRegistryInstanceSupplierMock6).when(bootstrapRegistryInstanceSupplierMock5).withScope(BootstrapRegistry.Scope.PROTOTYPE);
            Collection<String> collection = new ArrayList<>();
            ConfigDataEnvironment target = new ConfigDataEnvironment(logFactoryMock, bootstrapContextMock, environmentMock, resourceLoaderMock, collection, environmentUpdateListenerMock);
            doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
            doReturn(1).when(mutablePropertySourcesMock).size();
            List<PropertySource<?>> anyList = new ArrayList<>();
            anyList.add(propertySourceMock);
            Iterator<PropertySource<?>> iterator = anyList.iterator();
            doReturn(iterator).when(mutablePropertySourcesMock).iterator();
            doNothing().when(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock2);
            doNothing().when(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock4);
            doNothing().when(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock6);
            //Act Statement(s)
            final InactiveConfigDataAccessException result = assertThrows(InactiveConfigDataAccessException.class, () -> {
                target.processAndApply();
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(logFactoryMock).getLog(ConfigDataEnvironment.class);
                verify(resourceLoaderMock, times(2)).getClassLoader();
                binder.verify(() -> Binder.get(environmentMock), atLeast(1));
                verify(binderMock).bind("spring.config.on-not-found", ConfigDataNotFoundAction.class);
                verify(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
                verify(binderMock).bind(eq("spring.config.import"), (Bindable) any());
                verify(bindResultMock2).orElse(configDataLocationArray2);
                verify(binderMock).bind(eq("spring.config.additional-location"), (Bindable) any());
                verify(bindResultMock3).orElse(configDataLocationArray2);
                verify(binderMock).bind(eq("spring.config.location"), (Bindable) any());
                verify(bindResultMock4).orElse(configDataLocationArray5);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(2));
                defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock2), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock3), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofExisting(propertySourceMock), atLeast(1));
                bootstrapRegistryInstanceSupplier.verify(() -> BootstrapRegistry.InstanceSupplier.from((Supplier) any()), atLeast(3));
                verify(bootstrapRegistryInstanceSupplierMock, atLeast(1)).withScope(BootstrapRegistry.Scope.PROTOTYPE);
                verify(bootstrapRegistryInstanceSupplierMock3, atLeast(1)).withScope(BootstrapRegistry.Scope.PROTOTYPE);
                verify(bootstrapRegistryInstanceSupplierMock5, atLeast(1)).withScope(BootstrapRegistry.Scope.PROTOTYPE);
                verify(environmentMock).getPropertySources();
                verify(mutablePropertySourcesMock).size();
                verify(mutablePropertySourcesMock).iterator();
                verify(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock2);
                verify(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock4);
                verify(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock6);
            });
        }
    }

    //Sapient generated method id: ${processAndApplyWhenCaughtBindExceptionAndExGetCauseNotInstanceOfInactiveConfigDataAccessExceptionThrowsBindException}, hash: E45F1CA0C090AC9176B62D5919B3EAFB
    @Disabled()
    @Test()
    void processAndApplyWhenCaughtBindExceptionAndExGetCauseNotInstanceOfInactiveConfigDataAccessExceptionThrowsBindException() {
        /* Branches:
         * (for-each(contributors)) : true  #  inside getIncludedProfiles method
         * (source != null) : true  #  inside getIncludedProfiles method
         * (!contributor.hasConfigDataOption(ConfigData.Option.IGNORE_PROFILES)) : true  #  inside getIncludedProfiles method
         * (catch-exception (BindException)) : true  #  inside withProfiles method
         * (ex.getCause() instanceof InactiveConfigDataAccessException inactiveException) : false  #  inside withProfiles method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: contributors - Method: withProcessedImports
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BootstrapRegistry.InstanceSupplier> bootstrapRegistryInstanceSupplier = mockStatic(BootstrapRegistry.InstanceSupplier.class);
            MockedStatic<ConfigDataEnvironmentContributor> configDataEnvironmentContributor = mockStatic(ConfigDataEnvironmentContributor.class);
            MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
            MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<Binder> binder = mockStatic(Binder.class)) {
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataEnvironment.class);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2).when(resourceLoaderMock).getClassLoader();
            binder.when(() -> Binder.get(environmentMock)).thenReturn(binderMock);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.on-not-found", ConfigDataNotFoundAction.class);
            doReturn(ConfigDataNotFoundAction.FAIL).when(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
            doReturn(bindResultMock2).when(binderMock).bind(eq("spring.config.import"), (Bindable) any());
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
            ConfigDataLocation[] configDataLocationArray2 = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(bindResultMock2).orElse(configDataLocationArray2);
            doReturn(bindResultMock3).when(binderMock).bind(eq("spring.config.additional-location"), (Bindable) any());
            ConfigDataLocation[] configDataLocationArray3 = new ConfigDataLocation[] { configDataLocationMock2 };
            doReturn(configDataLocationArray3).when(bindResultMock3).orElse(configDataLocationArray2);
            doReturn(bindResultMock4).when(binderMock).bind(eq("spring.config.location"), (Bindable) any());
            ConfigDataLocation[] configDataLocationArray4 = new ConfigDataLocation[] { configDataLocationMock3 };
            ConfigDataLocation configDataLocation = ConfigDataLocation.of("optional:classpath:/;optional:classpath:/config/");
            ConfigDataLocation configDataLocation2 = ConfigDataLocation.of("optional:file:./;optional:file:./config/;optional:file:./config/*/");
            ConfigDataLocation[] configDataLocationArray5 = new ConfigDataLocation[] { configDataLocation, configDataLocation2 };
            doReturn(configDataLocationArray4).when(bindResultMock4).orElse(configDataLocationArray5);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2);
            defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock)).thenReturn(true);
            logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock)).thenReturn(logMessageMock);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock)).thenReturn(configDataEnvironmentContributorMock);
            logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock2)).thenReturn(logMessageMock2);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2)).thenReturn(configDataEnvironmentContributorMock2);
            logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock3)).thenReturn(logMessageMock3);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3)).thenReturn(configDataEnvironmentContributorMock3);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofExisting(propertySourceMock)).thenReturn(configDataEnvironmentContributorMock4);
            doReturn(bootstrapRegistryInstanceSupplierMock2).when(bootstrapRegistryInstanceSupplierMock).withScope(BootstrapRegistry.Scope.PROTOTYPE);
            doReturn(bootstrapRegistryInstanceSupplierMock4).when(bootstrapRegistryInstanceSupplierMock3).withScope(BootstrapRegistry.Scope.PROTOTYPE);
            bootstrapRegistryInstanceSupplier.when(() -> BootstrapRegistry.InstanceSupplier.from((Supplier) any())).thenReturn(bootstrapRegistryInstanceSupplierMock).thenReturn(bootstrapRegistryInstanceSupplierMock3).thenReturn(bootstrapRegistryInstanceSupplierMock5);
            doReturn(bootstrapRegistryInstanceSupplierMock6).when(bootstrapRegistryInstanceSupplierMock5).withScope(BootstrapRegistry.Scope.PROTOTYPE);
            Collection<String> collection = new ArrayList<>();
            ConfigDataEnvironment target = new ConfigDataEnvironment(logFactoryMock, bootstrapContextMock, environmentMock, resourceLoaderMock, collection, environmentUpdateListenerMock);
            doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
            doReturn(1).when(mutablePropertySourcesMock).size();
            List<PropertySource<?>> anyList = new ArrayList<>();
            anyList.add(propertySourceMock);
            Iterator<PropertySource<?>> iterator = anyList.iterator();
            doReturn(iterator).when(mutablePropertySourcesMock).iterator();
            doNothing().when(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock2);
            doNothing().when(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock4);
            doNothing().when(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock6);
            //Act Statement(s)
            final BindException result = assertThrows(BindException.class, () -> {
                target.processAndApply();
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(logFactoryMock).getLog(ConfigDataEnvironment.class);
                verify(resourceLoaderMock, times(2)).getClassLoader();
                binder.verify(() -> Binder.get(environmentMock), atLeast(1));
                verify(binderMock).bind("spring.config.on-not-found", ConfigDataNotFoundAction.class);
                verify(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
                verify(binderMock).bind(eq("spring.config.import"), (Bindable) any());
                verify(bindResultMock2).orElse(configDataLocationArray2);
                verify(binderMock).bind(eq("spring.config.additional-location"), (Bindable) any());
                verify(bindResultMock3).orElse(configDataLocationArray2);
                verify(binderMock).bind(eq("spring.config.location"), (Bindable) any());
                verify(bindResultMock4).orElse(configDataLocationArray5);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(2));
                defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock2), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock3), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofExisting(propertySourceMock), atLeast(1));
                bootstrapRegistryInstanceSupplier.verify(() -> BootstrapRegistry.InstanceSupplier.from((Supplier) any()), atLeast(3));
                verify(bootstrapRegistryInstanceSupplierMock, atLeast(1)).withScope(BootstrapRegistry.Scope.PROTOTYPE);
                verify(bootstrapRegistryInstanceSupplierMock3, atLeast(1)).withScope(BootstrapRegistry.Scope.PROTOTYPE);
                verify(bootstrapRegistryInstanceSupplierMock5, atLeast(1)).withScope(BootstrapRegistry.Scope.PROTOTYPE);
                verify(environmentMock).getPropertySources();
                verify(mutablePropertySourcesMock).size();
                verify(mutablePropertySourcesMock).iterator();
                verify(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock2);
                verify(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock4);
                verify(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock6);
            });
        }
    }

    //Sapient generated method id: ${processAndApplyWhenContributorNotIsActiveActivationContext}, hash: CF13DD2C8C0B4DC1E1369D766B11BC0D
    @Disabled()
    @Test()
    void processAndApplyWhenContributorNotIsActiveActivationContext() {
        /* Branches:
         * (for-each(contributors)) : true  #  inside getIncludedProfiles method
         * (source != null) : true  #  inside getIncludedProfiles method
         * (!contributor.hasConfigDataOption(ConfigData.Option.IGNORE_PROFILES)) : true  #  inside getIncludedProfiles method
         * (for-each(contributors)) : true  #  inside checkForInvalidProperties method
         * (for-each(contributors)) : true  #  inside checkMandatoryLocations method
         * (contributor.isActive(activationContext)) : true  #  inside checkMandatoryLocations method
         * (for-each(imports)) : true  #  inside getMandatoryImports method
         * (!location.isOptional()) : true  #  inside getMandatoryImports method
         * (for-each(contributors)) : true  #  inside checkMandatoryLocations method
         * (contributor.getLocation() != null) : true  #  inside checkMandatoryLocations method
         * (!mandatoryLocations.isEmpty()) : true  #  inside checkMandatoryLocations method
         * (for-each(mandatoryLocations)) : true  #  inside checkMandatoryLocations method
         * (for-each(contributors)) : true  #  inside applyContributor method
         * (contributor.getKind() == ConfigDataEnvironmentContributor.Kind.BOUND_IMPORT) : true  #  inside applyContributor method
         * (propertySource != null) : true  #  inside applyContributor method
         * (!contributor.isActive(activationContext)) : true  #  inside applyContributor method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: contributors - Method: withProcessedImports
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
            MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
            MockedStatic<InvalidConfigDataPropertyException> invalidConfigDataPropertyException = mockStatic(InvalidConfigDataPropertyException.class);
            MockedStatic<BootstrapRegistry.InstanceSupplier> bootstrapRegistryInstanceSupplier = mockStatic(BootstrapRegistry.InstanceSupplier.class);
            MockedStatic<ConfigDataEnvironmentContributor> configDataEnvironmentContributor = mockStatic(ConfigDataEnvironmentContributor.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<Binder> binder = mockStatic(Binder.class)) {
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataEnvironment.class);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2).when(resourceLoaderMock).getClassLoader();
            binder.when(() -> Binder.get(environmentMock)).thenReturn(binderMock);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.on-not-found", ConfigDataNotFoundAction.class);
            doReturn(ConfigDataNotFoundAction.FAIL).when(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
            doReturn(bindResultMock2).when(binderMock).bind(eq("spring.config.import"), (Bindable) any());
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            ConfigDataLocation[] configDataLocationArray2 = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(bindResultMock2).orElse(configDataLocationArray2);
            doReturn(bindResultMock3).when(binderMock).bind(eq("spring.config.additional-location"), (Bindable) any());
            ConfigDataLocation[] configDataLocationArray3 = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray3).when(bindResultMock3).orElse(configDataLocationArray2);
            doReturn(bindResultMock4).when(binderMock).bind(eq("spring.config.location"), (Bindable) any());
            ConfigDataLocation[] configDataLocationArray4 = new ConfigDataLocation[] {};
            ConfigDataLocation configDataLocation = ConfigDataLocation.of("optional:classpath:/;optional:classpath:/config/");
            ConfigDataLocation configDataLocation2 = ConfigDataLocation.of("optional:file:./;optional:file:./config/;optional:file:./config/*/");
            ConfigDataLocation[] configDataLocationArray5 = new ConfigDataLocation[] { configDataLocation, configDataLocation2 };
            doReturn(configDataLocationArray4).when(bindResultMock4).orElse(configDataLocationArray5);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2);
            defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock)).thenReturn(false);
            logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock)).thenReturn(logMessageMock);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock)).thenReturn(configDataEnvironmentContributorMock);
            logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock2)).thenReturn(logMessageMock2);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2)).thenReturn(configDataEnvironmentContributorMock2);
            logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock3)).thenReturn(logMessageMock3);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3)).thenReturn(configDataEnvironmentContributorMock3);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofExisting(propertySourceMock)).thenReturn(configDataEnvironmentContributorMock4);
            doReturn(bootstrapRegistryInstanceSupplierMock2).when(bootstrapRegistryInstanceSupplierMock).withScope(BootstrapRegistry.Scope.PROTOTYPE);
            doReturn(bootstrapRegistryInstanceSupplierMock4).when(bootstrapRegistryInstanceSupplierMock3).withScope(BootstrapRegistry.Scope.PROTOTYPE);
            doReturn(bootstrapRegistryInstanceSupplierMock6).when(bootstrapRegistryInstanceSupplierMock5).withScope(BootstrapRegistry.Scope.PROTOTYPE);
            bootstrapRegistryInstanceSupplier.when(() -> BootstrapRegistry.InstanceSupplier.from((Supplier) any())).thenReturn(bootstrapRegistryInstanceSupplierMock).thenReturn(bootstrapRegistryInstanceSupplierMock3).thenReturn(bootstrapRegistryInstanceSupplierMock5).thenReturn(bootstrapRegistryInstanceSupplierMock7);
            doReturn(bootstrapRegistryInstanceSupplierMock8).when(bootstrapRegistryInstanceSupplierMock7).withScope(BootstrapRegistry.Scope.PROTOTYPE);
            invalidConfigDataPropertyException.when(() -> InvalidConfigDataPropertyException.throwIfPropertyFound(configDataEnvironmentContributorMock5)).thenAnswer((Answer<Void>) invocation -> null);
            logMessage.when(() -> LogMessage.format("Skipping inactive property source '%s'", "name1")).thenReturn(logMessageMock4);
            defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd(mutablePropertySourcesMock)).thenAnswer((Answer<Void>) invocation -> null);
            logMessage.when(() -> LogMessage.format(eq("Setting default profiles: %s"), anyList())).thenReturn(logMessageMock5);
            String[] stringArray = new String[] {};
            logMessage.when(() -> LogMessage.format(eq("Setting active profiles: %s"), anyList())).thenReturn(logMessageMock6);
            String[] stringArray2 = new String[] {};
            stringUtils.when(() -> StringUtils.toStringArray(anyList())).thenReturn(stringArray).thenReturn(stringArray2);
            Collection<String> collection = new ArrayList<>();
            ConfigDataEnvironment target = new ConfigDataEnvironment(logFactoryMock, bootstrapContextMock, environmentMock, resourceLoaderMock, collection, environmentUpdateListenerMock);
            doReturn(0).when(mutablePropertySourcesMock2).size();
            List<PropertySource<?>> anyList = new ArrayList<>();
            Iterator<PropertySource<?>> iterator = anyList.iterator();
            doReturn(iterator).when(mutablePropertySourcesMock2).iterator();
            doNothing().when(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock2);
            doNothing().when(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock4);
            doNothing().when(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock6);
            doNothing().when(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock8);
            doReturn(mutablePropertySourcesMock2, mutablePropertySourcesMock).when(environmentMock).getPropertySources();
            doNothing().when(environmentMock).setDefaultProfiles(stringArray);
            doNothing().when(environmentMock).setActiveProfiles(stringArray2);
            doNothing().when(environmentUpdateListenerMock).onSetProfiles((Profiles) any());
            //Act Statement(s)
            target.processAndApply();
            //Assert statement(s)
            assertAll("result", () -> {
                verify(logFactoryMock).getLog(ConfigDataEnvironment.class);
                verify(resourceLoaderMock, times(2)).getClassLoader();
                binder.verify(() -> Binder.get(environmentMock), atLeast(1));
                verify(binderMock).bind("spring.config.on-not-found", ConfigDataNotFoundAction.class);
                verify(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
                verify(binderMock).bind(eq("spring.config.import"), (Bindable) any());
                verify(bindResultMock2).orElse(configDataLocationArray2);
                verify(binderMock).bind(eq("spring.config.additional-location"), (Bindable) any());
                verify(bindResultMock3).orElse(configDataLocationArray2);
                verify(binderMock).bind(eq("spring.config.location"), (Bindable) any());
                verify(bindResultMock4).orElse(configDataLocationArray5);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(2));
                defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock2), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock3), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofExisting(propertySourceMock), atLeast(1));
                bootstrapRegistryInstanceSupplier.verify(() -> BootstrapRegistry.InstanceSupplier.from((Supplier) any()), atLeast(4));
                verify(bootstrapRegistryInstanceSupplierMock, atLeast(1)).withScope(BootstrapRegistry.Scope.PROTOTYPE);
                verify(bootstrapRegistryInstanceSupplierMock3, atLeast(1)).withScope(BootstrapRegistry.Scope.PROTOTYPE);
                verify(bootstrapRegistryInstanceSupplierMock5, atLeast(1)).withScope(BootstrapRegistry.Scope.PROTOTYPE);
                verify(bootstrapRegistryInstanceSupplierMock7, atLeast(1)).withScope(BootstrapRegistry.Scope.PROTOTYPE);
                invalidConfigDataPropertyException.verify(() -> InvalidConfigDataPropertyException.throwIfPropertyFound(configDataEnvironmentContributorMock5), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Skipping inactive property source '%s'", "name1"), atLeast(1));
                defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd(mutablePropertySourcesMock), atLeast(1));
                logMessage.verify(() -> LogMessage.format(eq("Setting default profiles: %s"), anyList()));
                stringUtils.verify(() -> StringUtils.toStringArray(anyList()), atLeast(2));
                logMessage.verify(() -> LogMessage.format(eq("Setting active profiles: %s"), anyList()));
                verify(environmentMock, times(2)).getPropertySources();
                verify(mutablePropertySourcesMock2).size();
                verify(mutablePropertySourcesMock2).iterator();
                verify(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock2);
                verify(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock4);
                verify(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock6);
                verify(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock8);
                verify(environmentMock).setDefaultProfiles(stringArray);
                verify(environmentMock).setActiveProfiles(stringArray2);
                verify(environmentUpdateListenerMock).onSetProfiles((Profiles) any());
            });
        }
    }

    //Sapient generated method id: ${processAndApplyWhenContributorIsActiveActivationContext}, hash: 913BF404C48414B658FE876C3EFC7932
    @Disabled()
    @Test()
    void processAndApplyWhenContributorIsActiveActivationContext() {
        /* Branches:
         * (for-each(contributors)) : true  #  inside getIncludedProfiles method
         * (source != null) : true  #  inside getIncludedProfiles method
         * (!contributor.hasConfigDataOption(ConfigData.Option.IGNORE_PROFILES)) : true  #  inside getIncludedProfiles method
         * (for-each(contributors)) : true  #  inside checkForInvalidProperties method
         * (for-each(contributors)) : true  #  inside checkMandatoryLocations method
         * (contributor.isActive(activationContext)) : true  #  inside checkMandatoryLocations method
         * (for-each(imports)) : true  #  inside getMandatoryImports method
         * (!location.isOptional()) : true  #  inside getMandatoryImports method
         * (for-each(contributors)) : true  #  inside checkMandatoryLocations method
         * (contributor.getLocation() != null) : true  #  inside checkMandatoryLocations method
         * (!mandatoryLocations.isEmpty()) : true  #  inside checkMandatoryLocations method
         * (for-each(mandatoryLocations)) : true  #  inside checkMandatoryLocations method
         * (for-each(contributors)) : true  #  inside applyContributor method
         * (contributor.getKind() == ConfigDataEnvironmentContributor.Kind.BOUND_IMPORT) : true  #  inside applyContributor method
         * (propertySource != null) : true  #  inside applyContributor method
         * (!contributor.isActive(activationContext)) : false  #  inside applyContributor method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: contributors - Method: withProcessedImports
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ConfigDataLocation configDataLocationMock4 = mock(ConfigDataLocation.class);
        ConfigDataResource configDataResourceMock = mock(ConfigDataResource.class);
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
            MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
            MockedStatic<InvalidConfigDataPropertyException> invalidConfigDataPropertyException = mockStatic(InvalidConfigDataPropertyException.class);
            MockedStatic<BootstrapRegistry.InstanceSupplier> bootstrapRegistryInstanceSupplier = mockStatic(BootstrapRegistry.InstanceSupplier.class);
            MockedStatic<ConfigDataEnvironmentContributor> configDataEnvironmentContributor = mockStatic(ConfigDataEnvironmentContributor.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
            MockedStatic<Binder> binder = mockStatic(Binder.class)) {
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataEnvironment.class);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader, classLoader2).when(resourceLoaderMock).getClassLoader();
            binder.when(() -> Binder.get(environmentMock)).thenReturn(binderMock);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.on-not-found", ConfigDataNotFoundAction.class);
            doReturn(ConfigDataNotFoundAction.FAIL).when(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
            doReturn(bindResultMock2).when(binderMock).bind(eq("spring.config.import"), (Bindable) any());
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            ConfigDataLocation[] configDataLocationArray2 = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(bindResultMock2).orElse(configDataLocationArray2);
            doReturn(bindResultMock3).when(binderMock).bind(eq("spring.config.additional-location"), (Bindable) any());
            ConfigDataLocation[] configDataLocationArray3 = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray3).when(bindResultMock3).orElse(configDataLocationArray2);
            doReturn(bindResultMock4).when(binderMock).bind(eq("spring.config.location"), (Bindable) any());
            ConfigDataLocation[] configDataLocationArray4 = new ConfigDataLocation[] {};
            ConfigDataLocation configDataLocation = ConfigDataLocation.of("optional:classpath:/;optional:classpath:/config/");
            ConfigDataLocation configDataLocation2 = ConfigDataLocation.of("optional:file:./;optional:file:./config/;optional:file:./config/*/");
            ConfigDataLocation[] configDataLocationArray5 = new ConfigDataLocation[] { configDataLocation, configDataLocation2 };
            doReturn(configDataLocationArray4).when(bindResultMock4).orElse(configDataLocationArray5);
            springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2);
            defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock)).thenReturn(false);
            logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock)).thenReturn(logMessageMock);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock)).thenReturn(configDataEnvironmentContributorMock);
            logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock2)).thenReturn(logMessageMock2);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2)).thenReturn(configDataEnvironmentContributorMock2);
            logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock3)).thenReturn(logMessageMock3);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3)).thenReturn(configDataEnvironmentContributorMock3);
            configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofExisting(propertySourceMock)).thenReturn(configDataEnvironmentContributorMock4);
            doReturn(bootstrapRegistryInstanceSupplierMock2).when(bootstrapRegistryInstanceSupplierMock).withScope(BootstrapRegistry.Scope.PROTOTYPE);
            doReturn(bootstrapRegistryInstanceSupplierMock4).when(bootstrapRegistryInstanceSupplierMock3).withScope(BootstrapRegistry.Scope.PROTOTYPE);
            doReturn(bootstrapRegistryInstanceSupplierMock6).when(bootstrapRegistryInstanceSupplierMock5).withScope(BootstrapRegistry.Scope.PROTOTYPE);
            bootstrapRegistryInstanceSupplier.when(() -> BootstrapRegistry.InstanceSupplier.from((Supplier) any())).thenReturn(bootstrapRegistryInstanceSupplierMock).thenReturn(bootstrapRegistryInstanceSupplierMock3).thenReturn(bootstrapRegistryInstanceSupplierMock5).thenReturn(bootstrapRegistryInstanceSupplierMock7);
            doReturn(bootstrapRegistryInstanceSupplierMock8).when(bootstrapRegistryInstanceSupplierMock7).withScope(BootstrapRegistry.Scope.PROTOTYPE);
            invalidConfigDataPropertyException.when(() -> InvalidConfigDataPropertyException.throwIfPropertyFound(configDataEnvironmentContributorMock5)).thenAnswer((Answer<Void>) invocation -> null);
            logMessage.when(() -> LogMessage.format("Adding imported property source '%s'", "name1")).thenReturn(logMessageMock4);
            defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd(mutablePropertySourcesMock)).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(mutablePropertySourcesMock).addLast((PropertySource) any());
            logMessage.when(() -> LogMessage.format(eq("Setting default profiles: %s"), anyList())).thenReturn(logMessageMock5);
            String[] stringArray = new String[] {};
            logMessage.when(() -> LogMessage.format(eq("Setting active profiles: %s"), anyList())).thenReturn(logMessageMock6);
            String[] stringArray2 = new String[] {};
            stringUtils.when(() -> StringUtils.toStringArray(anyList())).thenReturn(stringArray).thenReturn(stringArray2);
            Collection<String> collection = new ArrayList<>();
            ConfigDataEnvironment target = new ConfigDataEnvironment(logFactoryMock, bootstrapContextMock, environmentMock, resourceLoaderMock, collection, environmentUpdateListenerMock);
            doReturn(0).when(mutablePropertySourcesMock2).size();
            List<PropertySource<?>> anyList = new ArrayList<>();
            Iterator<PropertySource<?>> iterator = anyList.iterator();
            doReturn(iterator).when(mutablePropertySourcesMock2).iterator();
            doNothing().when(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock2);
            doNothing().when(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock4);
            doNothing().when(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock6);
            doNothing().when(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock8);
            doReturn(mutablePropertySourcesMock2, mutablePropertySourcesMock).when(environmentMock).getPropertySources();
            doNothing().when(environmentUpdateListenerMock).onPropertySourceAdded((PropertySource) any(), eq(configDataLocationMock4), eq(configDataResourceMock));
            doNothing().when(environmentMock).setDefaultProfiles(stringArray);
            doNothing().when(environmentMock).setActiveProfiles(stringArray2);
            doNothing().when(environmentUpdateListenerMock).onSetProfiles((Profiles) any());
            //Act Statement(s)
            target.processAndApply();
            //Assert statement(s)
            assertAll("result", () -> {
                verify(logFactoryMock).getLog(ConfigDataEnvironment.class);
                verify(resourceLoaderMock, times(2)).getClassLoader();
                binder.verify(() -> Binder.get(environmentMock), atLeast(1));
                verify(binderMock).bind("spring.config.on-not-found", ConfigDataNotFoundAction.class);
                verify(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
                verify(binderMock).bind(eq("spring.config.import"), (Bindable) any());
                verify(bindResultMock2).orElse(configDataLocationArray2);
                verify(binderMock).bind(eq("spring.config.additional-location"), (Bindable) any());
                verify(bindResultMock3).orElse(configDataLocationArray2);
                verify(binderMock).bind(eq("spring.config.location"), (Bindable) any());
                verify(bindResultMock4).orElse(configDataLocationArray5);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(2));
                defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock2), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock3), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3), atLeast(1));
                configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofExisting(propertySourceMock), atLeast(1));
                bootstrapRegistryInstanceSupplier.verify(() -> BootstrapRegistry.InstanceSupplier.from((Supplier) any()), atLeast(4));
                verify(bootstrapRegistryInstanceSupplierMock, atLeast(1)).withScope(BootstrapRegistry.Scope.PROTOTYPE);
                verify(bootstrapRegistryInstanceSupplierMock3, atLeast(1)).withScope(BootstrapRegistry.Scope.PROTOTYPE);
                verify(bootstrapRegistryInstanceSupplierMock5, atLeast(1)).withScope(BootstrapRegistry.Scope.PROTOTYPE);
                verify(bootstrapRegistryInstanceSupplierMock7, atLeast(1)).withScope(BootstrapRegistry.Scope.PROTOTYPE);
                invalidConfigDataPropertyException.verify(() -> InvalidConfigDataPropertyException.throwIfPropertyFound(configDataEnvironmentContributorMock5), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Adding imported property source '%s'", "name1"), atLeast(1));
                defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd(mutablePropertySourcesMock), atLeast(1));
                verify(mutablePropertySourcesMock).addLast((PropertySource) any());
                logMessage.verify(() -> LogMessage.format(eq("Setting default profiles: %s"), anyList()));
                stringUtils.verify(() -> StringUtils.toStringArray(anyList()), atLeast(2));
                logMessage.verify(() -> LogMessage.format(eq("Setting active profiles: %s"), anyList()));
                verify(environmentMock, times(2)).getPropertySources();
                verify(mutablePropertySourcesMock2).size();
                verify(mutablePropertySourcesMock2).iterator();
                verify(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock2);
                verify(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock4);
                verify(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock6);
                verify(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock8);
                verify(environmentUpdateListenerMock).onPropertySourceAdded((PropertySource) any(), eq(configDataLocationMock4), eq(configDataResourceMock));
                verify(environmentMock).setDefaultProfiles(stringArray);
                verify(environmentMock).setActiveProfiles(stringArray2);
                verify(environmentUpdateListenerMock).onSetProfiles((Profiles) any());
            });
        }
    }
}
