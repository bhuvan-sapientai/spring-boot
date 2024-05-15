package org.springframework.boot.logging.log4j2;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.boot.logging.LoggerConfiguration;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.util.Assert;
import org.springframework.boot.logging.LogLevel;
import java.util.ArrayList;
import org.mockito.stubbing.Answer;
import org.springframework.core.env.Environment;
import org.springframework.util.ClassUtils;
import org.springframework.boot.logging.LoggingInitializationContext;
import java.util.Set;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.util.ResourceUtils;
import java.net.URL;
import org.mockito.MockedStatic;
import java.io.File;
import org.apache.logging.log4j.core.LoggerContext;
import org.springframework.boot.logging.LogFile;
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
import static org.mockito.ArgumentMatchers.anyList;
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
class Log4J2LoggingSystemSapientGeneratedTest {

    private final BindResult<List<String>> bindResultMock = mock(BindResult.class);

    private final Binder binderMock = mock(Binder.class);

    private final Environment environmentMock = mock(Environment.class);

    private final Environment environmentMock2 = mock(Environment.class);

    private final LoggingInitializationContext initializationContextMock = mock(LoggingInitializationContext.class);

    private final LogFile logFileMock = mock(LogFile.class);

    //Sapient generated method id: ${getStandardConfigLocationsWhenPropertyDefinedLocationIsNull}, hash: 146434E61BE4F36FA0022754DA431C79
    @Disabled()
    @Test()
    void getStandardConfigLocationsWhenPropertyDefinedLocationIsNull() {
        /* Branches:
         * (isClassAvailable("com.fasterxml.jackson.dataformat.yaml.YAMLParser")) : true
         * (isClassAvailable("com.fasterxml.jackson.databind.ObjectMapper")) : true
         * (isClassAvailable("com.fasterxml.jackson.dataformat.yaml.YAMLParser")) : true
         * (isClassAvailable("com.fasterxml.jackson.databind.ObjectMapper")) : true
         * (propertyDefinedLocation != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        Log4J2LoggingSystem target = spy(new Log4J2LoggingSystem(classLoader));
        doReturn(true).when(target).isClassAvailable("com.fasterxml.jackson.dataformat.yaml.YAMLParser");
        doReturn(true).when(target).isClassAvailable("com.fasterxml.jackson.databind.ObjectMapper");
        //Act Statement(s)
        String[] result = target.getStandardConfigLocations();
        String[] stringResultArray = new String[] { "log4j2-test.properties", "log4j2-test.xml", "log4j2.properties", "log4j2.xml" };
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(stringResultArray));
            verify(target, times(2)).isClassAvailable("com.fasterxml.jackson.dataformat.yaml.YAMLParser");
            verify(target, times(2)).isClassAvailable("com.fasterxml.jackson.databind.ObjectMapper");
        });
    }

    //Sapient generated method id: ${isClassAvailableWhenClassUtilsIsPresentClassNameGetClassLoader}, hash: 791CD5A28ABE67CD2B1B631E2BC1E9D7
    @Test()
    void isClassAvailableWhenClassUtilsIsPresentClassNameGetClassLoader() {
        /* Branches:
         * (ClassUtils.isPresent(className, getClassLoader())) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            classUtils.when(() -> ClassUtils.isPresent(eq("java.lang.String"), (ClassLoader) any())).thenReturn(true);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
            //Act Statement(s)
            boolean result = target.isClassAvailable("java.lang.String");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                classUtils.verify(() -> ClassUtils.isPresent(eq("java.lang.String"), (ClassLoader) any()));
            });
        }
    }

    //Sapient generated method id: ${isClassAvailableWhenClassUtilsNotIsPresentClassNameGetClassLoader}, hash: A61C42CA05AC3021E4059A79727BDFF7
    @Test()
    void isClassAvailableWhenClassUtilsNotIsPresentClassNameGetClassLoader() {
        /* Branches:
         * (ClassUtils.isPresent(className, getClassLoader())) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            classUtils.when(() -> ClassUtils.isPresent(eq("java.lang.String"), (ClassLoader) any())).thenReturn(false);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
            //Act Statement(s)
            boolean result = target.isClassAvailable("java.lang.String");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                classUtils.verify(() -> ClassUtils.isPresent(eq("java.lang.String"), (ClassLoader) any()));
            });
        }
    }

    //Sapient generated method id: ${beforeInitializeWhenIsAlreadyInitializedLoggerContext}, hash: D52FC26E732399F2AF5C44BF712C889B
    @Test()
    void beforeInitializeWhenIsAlreadyInitializedLoggerContext() throws Throwable {
        /* Branches:
         * (isAlreadyInitialized(loggerContext)) : true
         */
        //Arrange Statement(s)
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
        //Act Statement(s)
        target.beforeInitialize();
    }

    //Sapient generated method id: ${beforeInitializeWhenConfigureJdkLoggingBridgeHandler}, hash: 871EBE394C08ABA7D56690B78F9C310F
    @Test()
    void beforeInitializeWhenConfigureJdkLoggingBridgeHandler() throws Throwable {
        /* Branches:
         * (isAlreadyInitialized(loggerContext)) : false
         * (handlers.length == 0) : false  #  inside isJulUsingASingleConsoleHandlerAtMost method
         * (handlers.length == 1) : true  #  inside isJulUsingASingleConsoleHandlerAtMost method
         * (handlers[0] instanceof ConsoleHandler) : true  #  inside isJulUsingASingleConsoleHandlerAtMost method
         * (isJulUsingASingleConsoleHandlerAtMost()) : true  #  inside configureJdkLoggingBridgeHandler method
         * (!isLog4jLogManagerInstalled()) : true  #  inside configureJdkLoggingBridgeHandler method
         * (ClassUtils.isPresent(LOG4J_BRIDGE_HANDLER, getClassLoader())) : true  #  inside isLog4jBridgeHandlerAvailable method
         * (isLog4jBridgeHandlerAvailable()) : true  #  inside configureJdkLoggingBridgeHandler method
         * (handlers.length == 1) : true  #  inside removeDefaultRootHandler method
         * (handlers[0] instanceof ConsoleHandler) : true  #  inside removeDefaultRootHandler method
         * (!configureJdkLoggingBridgeHandler()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            classUtils.when(() -> ClassUtils.isPresent(eq("org.apache.logging.log4j.jul.Log4jBridgeHandler"), (ClassLoader) any())).thenReturn(true);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
            //Act Statement(s)
            target.beforeInitialize();
            //Assert statement(s)
            assertAll("result", () -> classUtils.verify(() -> ClassUtils.isPresent(eq("org.apache.logging.log4j.jul.Log4jBridgeHandler"), (ClassLoader) any())));
        }
    }

    //Sapient generated method id: ${initializeWhenIsAlreadyInitializedLoggerContext}, hash: 7D7F073A45538015F944873FA1E452CE
    @Disabled()
    @Test()
    void initializeWhenIsAlreadyInitializedLoggerContext() {
        /* Branches:
         * (isAlreadyInitialized(loggerContext)) : true
         */
        //Arrange Statement(s)
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
        LoggingInitializationContext loggingInitializationContextMock = mock(LoggingInitializationContext.class);
        //Act Statement(s)
        target.initialize(loggingInitializationContextMock, "configLocation1", logFileMock);
    }

    //Sapient generated method id: ${initializeWhenStringUtilsHasLengthConfigLocation}, hash: BDAFC8B72CB9E102B354DAC40730EEB8
    @Disabled()
    @Test()
    void initializeWhenStringUtilsHasLengthConfigLocation() {
        /* Branches:
         * (isAlreadyInitialized(loggerContext)) : false
         * (environment != null) : true
         * (StringUtils.hasLength(configLocation)) : true  #  inside initialize method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type LoggerContext - Method: putObjectIfAbsent
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(environmentMock).when(initializationContextMock).getEnvironment();
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
        //Act Statement(s)
        target.initialize(initializationContextMock, "A", logFileMock);
        //Assert statement(s)
        assertAll("result", () -> verify(initializationContextMock).getEnvironment());
    }

    //Sapient generated method id: ${loadDefaultsWhenInitializationContextIsNotNull}, hash: 02D899AD18B78ED822914BC78E4483A2
    @Disabled()
    @Test()
    void loadDefaultsWhenInitializationContextIsNotNull() throws Exception {
        /* Branches:
         * (logFile != null) : true
         * (initializationContext != null) : true  #  inside load method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type LoggingSystemProperties - Method: apply
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Binder> binder = mockStatic(Binder.class)) {
            doReturn(environmentMock, environmentMock2).when(initializationContextMock).getEnvironment();
            binder.when(() -> Binder.get(environmentMock)).thenReturn(binderMock);
            doReturn(bindResultMock).when(binderMock).bind(eq("logging.log4j2.config.override"), (Bindable) any());
            List list = new ArrayList<>();
            List list2 = new ArrayList<>();
            doReturn(list).when(bindResultMock).orElse(list2);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            Log4J2LoggingSystem target = spy(new Log4J2LoggingSystem(classLoader));
            doNothing().when(target).loadConfiguration("classpath:org/springframework/boot/logging/log4j2/log4j2-file.xml", logFileMock, list);
            //Act Statement(s)
            target.loadDefaults(initializationContextMock, logFileMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(initializationContextMock, times(2)).getEnvironment();
                binder.verify(() -> Binder.get(environmentMock), atLeast(1));
                verify(binderMock).bind(eq("logging.log4j2.config.override"), (Bindable) any());
                verify(bindResultMock).orElse(list2);
                verify(target).loadConfiguration("classpath:org/springframework/boot/logging/log4j2/log4j2-file.xml", logFileMock, list);
            });
        }
    }

    //Sapient generated method id: ${loadDefaultsWhenLogFileIsNullAndInitializationContextIsNotNull}, hash: 06BF32DDB0B20C4B1857781017B01593
    @Disabled()
    @Test()
    void loadDefaultsWhenLogFileIsNullAndInitializationContextIsNotNull() throws Exception {
        /* Branches:
         * (logFile != null) : false
         * (initializationContext != null) : true  #  inside load method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type LoggingSystemProperties - Method: apply
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Binder> binder = mockStatic(Binder.class)) {
            doReturn(environmentMock, environmentMock2).when(initializationContextMock).getEnvironment();
            binder.when(() -> Binder.get(environmentMock)).thenReturn(binderMock);
            doReturn(bindResultMock).when(binderMock).bind(eq("logging.log4j2.config.override"), (Bindable) any());
            List list = new ArrayList<>();
            List list2 = new ArrayList<>();
            doReturn(list).when(bindResultMock).orElse(list2);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            Log4J2LoggingSystem target = spy(new Log4J2LoggingSystem(classLoader));
            doNothing().when(target).loadConfiguration("classpath:org/springframework/boot/logging/log4j2/log4j2.xml", (LogFile) null, list);
            LogFile logFile = null;
            //Act Statement(s)
            target.loadDefaults(initializationContextMock, logFile);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(initializationContextMock, times(2)).getEnvironment();
                binder.verify(() -> Binder.get(environmentMock), atLeast(1));
                verify(binderMock).bind(eq("logging.log4j2.config.override"), (Bindable) any());
                verify(bindResultMock).orElse(list2);
                verify(target).loadConfiguration("classpath:org/springframework/boot/logging/log4j2/log4j2.xml", (LogFile) null, list);
            });
        }
    }

    //Sapient generated method id: ${loadConfigurationWhenInitializationContextIsNotNull}, hash: 1F22FB8C47F9F4D4BB8FD9F7664A9BE7
    @Disabled()
    @Test()
    void loadConfigurationWhenInitializationContextIsNotNull() throws Exception {
        /* Branches:
         * (initializationContext != null) : true  #  inside load method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type LoggingSystemProperties - Method: apply
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Binder> binder = mockStatic(Binder.class)) {
            doReturn(environmentMock, environmentMock2).when(initializationContextMock).getEnvironment();
            binder.when(() -> Binder.get(environmentMock)).thenReturn(binderMock);
            doReturn(bindResultMock).when(binderMock).bind(eq("logging.log4j2.config.override"), (Bindable) any());
            List list = new ArrayList<>();
            List list2 = new ArrayList<>();
            doReturn(list).when(bindResultMock).orElse(list2);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            Log4J2LoggingSystem target = spy(new Log4J2LoggingSystem(classLoader));
            doNothing().when(target).loadConfiguration("location1", logFileMock, list);
            //Act Statement(s)
            target.loadConfiguration(initializationContextMock, "location1", logFileMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(initializationContextMock, times(2)).getEnvironment();
                binder.verify(() -> Binder.get(environmentMock), atLeast(1));
                verify(binderMock).bind(eq("logging.log4j2.config.override"), (Bindable) any());
                verify(bindResultMock).orElse(list2);
                verify(target).loadConfiguration("location1", logFileMock, list);
            });
        }
    }

    //Sapient generated method id: ${loadConfiguration1WhenConfigurationsSizeGreaterThan1}, hash: 2C82E6B91DD77E72AA43542A9D08E7E6
    @Disabled()
    @Test()
    void loadConfiguration1WhenConfigurationsSizeGreaterThan1() throws Exception {
        /* Branches:
         * (FILE_PROTOCOL.equals(url.getProtocol())) : true  #  inside getConfigurationSource method
         * (for-each(overrides)) : true
         * (configurations.size() > 1) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.apache.logging.log4j.core.config.ConfigurationSource
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("A", "Location must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            File file = new File("pathname1");
            File file2 = new File("pathname1");
            resourceUtils.when(() -> ResourceUtils.getFile((URL) any())).thenReturn(file).thenReturn(file2);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
            List<String> stringList = new ArrayList<>();
            stringList.add("B");
            //Act Statement(s)
            target.loadConfiguration("A", logFileMock, stringList);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull("A", "Location must not be null"), atLeast(1));
                resourceUtils.verify(() -> ResourceUtils.getFile((URL) any()), atLeast(2));
            });
        }
    }

    //Sapient generated method id: ${loadConfiguration1WhenUrlGetProtocolEqualsHttpsAndConfigurationsSizeGreaterThan1}, hash: 5B65DB21B4E09295A20FFCEBE57C8739
    @Disabled()
    @Test()
    void loadConfiguration1WhenUrlGetProtocolEqualsHttpsAndConfigurationsSizeGreaterThan1() throws Exception {
        /* Branches:
         * (FILE_PROTOCOL.equals(url.getProtocol())) : true  #  inside getConfigurationSource method
         * (for-each(overrides)) : true
         * (url.getProtocol().equals("https")) : true  #  inside getConfigurationSource method
         * (configurations.size() > 1) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.apache.logging.log4j.core.config.ConfigurationSource
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("location1", "Location must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            File file = new File("pathname1");
            resourceUtils.when(() -> ResourceUtils.getFile((URL) any())).thenReturn(file);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
            List<String> stringList = new ArrayList<>();
            //Act Statement(s)
            target.loadConfiguration("location1", logFileMock, stringList);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull("location1", "Location must not be null"), atLeast(1));
                resourceUtils.verify(() -> ResourceUtils.getFile((URL) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${loadConfiguration1WhenUrlGetProtocolNotEqualsHttpsAndConfigurationsSizeGreaterThan1}, hash: 388590EBFDE0129F3F559008C46794F3
    @Disabled()
    @Test()
    void loadConfiguration1WhenUrlGetProtocolNotEqualsHttpsAndConfigurationsSizeGreaterThan1() throws Exception {
        /* Branches:
         * (FILE_PROTOCOL.equals(url.getProtocol())) : true  #  inside getConfigurationSource method
         * (for-each(overrides)) : true
         * (url.getProtocol().equals("https")) : false  #  inside getConfigurationSource method
         * (configurations.size() > 1) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.apache.logging.log4j.core.config.ConfigurationSource
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("location1", "Location must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            File file = new File("pathname1");
            resourceUtils.when(() -> ResourceUtils.getFile((URL) any())).thenReturn(file);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
            List<String> stringList = new ArrayList<>();
            //Act Statement(s)
            target.loadConfiguration("location1", logFileMock, stringList);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull("location1", "Location must not be null"), atLeast(1));
                resourceUtils.verify(() -> ResourceUtils.getFile((URL) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${loadConfiguration1WhenOverridesIsEmptyAndConfigurationsSizeNotGreaterThan1}, hash: 0332C7D62B474586A8B58A6244D9DA90
    @Disabled()
    @Test()
    void loadConfiguration1WhenOverridesIsEmptyAndConfigurationsSizeNotGreaterThan1() throws Exception {
        /* Branches:
         * (FILE_PROTOCOL.equals(url.getProtocol())) : false  #  inside getConfigurationSource method
         * (url.getProtocol().equals("https")) : true  #  inside getConfigurationSource method
         * (for-each(overrides)) : false
         * (configurations.size() > 1) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("location1", "Location must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
            List<String> stringList = new ArrayList<>();
            //Act Statement(s)
            target.loadConfiguration("location1", logFileMock, stringList);
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.notNull("location1", "Location must not be null"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${loadConfiguration1WhenCaughtExceptionThrowsIllegalStateException}, hash: 4CA5E44115C292304F22289E6522EFD2
    @Disabled()
    @Test()
    void loadConfiguration1WhenCaughtExceptionThrowsIllegalStateException() throws FileNotFoundException {
        /* Branches:
         * (FILE_PROTOCOL.equals(url.getProtocol())) : false  #  inside getConfigurationSource method
         * (url.getProtocol().equals("https")) : false  #  inside getConfigurationSource method
         * (for-each(overrides)) : true
         * (configurations.size() > 1) : true
         * (catch-exception (Exception)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        URL uRLMock = mock(URL.class);
        try (MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("location1", "Location must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            URL uRL = ResourceUtils.getURL("A");
            resourceUtils.when(() -> ResourceUtils.getURL("location1")).thenReturn(uRL);
            resourceUtils.when(() -> ResourceUtils.getURL("resourceLocation1")).thenReturn(uRLMock);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
            List<String> stringList = new ArrayList<>();
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.loadConfiguration("location1", logFileMock, stringList);
            });
            Exception exception = new Exception();
            IllegalStateException illegalStateException = new IllegalStateException("message1", exception);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(exception.getClass())));
                _assert.verify(() -> Assert.notNull("location1", "Location must not be null"), atLeast(1));
                resourceUtils.verify(() -> ResourceUtils.getURL("location1"), atLeast(1));
                resourceUtils.verify(() -> ResourceUtils.getURL("resourceLocation1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${loadConfiguration1WhenConfigurationsSizeNotGreaterThan1AndCaughtExceptionThrowsIllegalStateException}, hash: B620C5A8325CC2335E02CFC4E02972A1
    @Disabled()
    @Test()
    void loadConfiguration1WhenConfigurationsSizeNotGreaterThan1AndCaughtExceptionThrowsIllegalStateException() throws FileNotFoundException {
        /* Branches:
         * (FILE_PROTOCOL.equals(url.getProtocol())) : false  #  inside getConfigurationSource method
         * (url.getProtocol().equals("https")) : false  #  inside getConfigurationSource method
         * (for-each(overrides)) : false
         * (configurations.size() > 1) : false
         * (catch-exception (Exception)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("location1", "Location must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
            List<String> stringList = new ArrayList<>();
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.loadConfiguration("location1", logFileMock, stringList);
            });
            Exception exception = new Exception();
            IllegalStateException illegalStateException = new IllegalStateException("message1", exception);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(exception.getClass())));
                _assert.verify(() -> Assert.notNull("location1", "Location must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${reinitializeWhenCollectionUtilsIsEmptyOverrides}, hash: C17235750D83737F70FFD67F39C5367E
    @Test()
    void reinitializeWhenCollectionUtilsIsEmptyOverrides() throws IOException {
        /* Branches:
         * (!CollectionUtils.isEmpty(overrides)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class);
            MockedStatic<Binder> binder = mockStatic(Binder.class)) {
            doReturn(environmentMock).when(initializationContextMock).getEnvironment();
            binder.when(() -> Binder.get(environmentMock)).thenReturn(binderMock);
            doReturn(bindResultMock).when(binderMock).bind(eq("logging.log4j2.config.override"), (Bindable) any());
            List list = new ArrayList<>();
            List list2 = new ArrayList<>();
            doReturn(list).when(bindResultMock).orElse(list2);
            collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(true);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
            //Act Statement(s)
            target.reinitialize(initializationContextMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(initializationContextMock).getEnvironment();
                binder.verify(() -> Binder.get(environmentMock), atLeast(1));
                verify(binderMock).bind(eq("logging.log4j2.config.override"), (Bindable) any());
                verify(bindResultMock).orElse(list2);
                collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()));
            });
        }
    }

    //Sapient generated method id: ${reinitializeWhenFILE_PROTOCOLEqualsUrlGetProtocol}, hash: 60550208A24AAC47D729AF6AC26DAC95
    @Disabled()
    @Test()
    void reinitializeWhenFILE_PROTOCOLEqualsUrlGetProtocol() throws IOException {
        /* Branches:
         * (!CollectionUtils.isEmpty(overrides)) : true
         * (for-each(overrides)) : true  #  inside reinitializeWithOverrides method
         * (FILE_PROTOCOL.equals(url.getProtocol())) : true  #  inside getConfigurationSource method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.apache.logging.log4j.core.config.ConfigurationSource
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class, CALLS_REAL_METHODS);
            MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class);
            MockedStatic<Binder> binder = mockStatic(Binder.class)) {
            doReturn(environmentMock).when(initializationContextMock).getEnvironment();
            binder.when(() -> Binder.get(environmentMock)).thenReturn(binderMock);
            doReturn(bindResultMock).when(binderMock).bind(eq("logging.log4j2.config.override"), (Bindable) any());
            List list = new ArrayList<>();
            list.add("A");
            List list2 = new ArrayList<>();
            doReturn(list).when(bindResultMock).orElse(list2);
            collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(false);
            File file = new File("pathname1");
            resourceUtils.when(() -> ResourceUtils.getFile((URL) any())).thenReturn(file);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
            //Act Statement(s)
            target.reinitialize(initializationContextMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(initializationContextMock, atLeast(1)).getEnvironment();
                binder.verify(() -> Binder.get(environmentMock), atLeast(1));
                verify(binderMock, atLeast(1)).bind(eq("logging.log4j2.config.override"), (Bindable) any());
                verify(bindResultMock, atLeast(1)).orElse(list2);
                collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()), atLeast(1));
                resourceUtils.verify(() -> ResourceUtils.getFile((URL) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${reinitializeWhenUrlGetProtocolEqualsHttps}, hash: 0C4C0C98BF0EDA52C89DD291F18CCD16
    @Test()
    void reinitializeWhenUrlGetProtocolEqualsHttps() throws IOException {
        /* Branches:
         * (!CollectionUtils.isEmpty(overrides)) : true
         * (for-each(overrides)) : true  #  inside reinitializeWithOverrides method
         * (FILE_PROTOCOL.equals(url.getProtocol())) : false  #  inside getConfigurationSource method
         * (url.getProtocol().equals("https")) : true  #  inside getConfigurationSource method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class);
            MockedStatic<Binder> binder = mockStatic(Binder.class)) {
            doReturn(environmentMock).when(initializationContextMock).getEnvironment();
            binder.when(() -> Binder.get(environmentMock)).thenReturn(binderMock);
            doReturn(bindResultMock).when(binderMock).bind(eq("logging.log4j2.config.override"), (Bindable) any());
            List list = new ArrayList<>();
            List list2 = new ArrayList<>();
            doReturn(list).when(bindResultMock).orElse(list2);
            collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(false);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
            //Act Statement(s)
            target.reinitialize(initializationContextMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(initializationContextMock).getEnvironment();
                binder.verify(() -> Binder.get(environmentMock), atLeast(1));
                verify(binderMock).bind(eq("logging.log4j2.config.override"), (Bindable) any());
                verify(bindResultMock).orElse(list2);
                collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()));
            });
        }
    }

    //Sapient generated method id: ${reinitializeWhenCaughtIOExceptionThrowsRuntimeException}, hash: 85F3B32D4838EB2C153098B69272242B
    @Disabled()
    @Test()
    void reinitializeWhenCaughtIOExceptionThrowsRuntimeException() throws FileNotFoundException {
        /* Branches:
         * (!CollectionUtils.isEmpty(overrides)) : true
         * (for-each(overrides)) : true  #  inside reinitializeWithOverrides method
         * (FILE_PROTOCOL.equals(url.getProtocol())) : false  #  inside getConfigurationSource method
         * (url.getProtocol().equals("https")) : false  #  inside getConfigurationSource method
         * (catch-exception (IOException)) : true  #  inside reinitializeWithOverrides method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class);
            MockedStatic<Binder> binder = mockStatic(Binder.class)) {
            doReturn(environmentMock).when(initializationContextMock).getEnvironment();
            binder.when(() -> Binder.get(environmentMock)).thenReturn(binderMock);
            doReturn(bindResultMock).when(binderMock).bind(eq("logging.log4j2.config.override"), (Bindable) any());
            List list = new ArrayList<>();
            List list2 = new ArrayList<>();
            doReturn(list).when(bindResultMock).orElse(list2);
            collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(false);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                target.reinitialize(initializationContextMock);
            });
            IOException iOException = new IOException();
            RuntimeException runtimeException = new RuntimeException("message1", iOException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(runtimeException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
                verify(initializationContextMock).getEnvironment();
                binder.verify(() -> Binder.get(environmentMock), atLeast(1));
                verify(binderMock).bind(eq("logging.log4j2.config.override"), (Bindable) any());
                verify(bindResultMock).orElse(list2);
                collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()));
            });
        }
    }

    //Sapient generated method id: ${getSupportedLogLevelsTest}, hash: 837932A462D7375798A936D98C73222D
    @Disabled()
    @Test()
    void getSupportedLogLevelsTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: LEVELS - Method: getSupported
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
        //Act Statement(s)
        Set<LogLevel> result = target.getSupportedLogLevels();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${setLogLevelWhenLoggerInstanceOfLevelSetLoggerConfig}, hash: 73BAF45CB64E140E198B609B3BB2CC89
    @Test()
    void setLogLevelWhenLoggerInstanceOfLevelSetLoggerConfig() {
        /* Branches:
         * (!StringUtils.hasLength(name)) : false  #  inside getLogger method
         * (ROOT_LOGGER_NAME.equals(name)) : true  #  inside getLogger method
         * (isRootLogger) : true  #  inside getLogger method
         * (configuration instanceof AbstractConfiguration abstractConfiguration) : false  #  inside findLogger method
         * (level == null) : true  #  inside setLogLevel method
         * (logger instanceof LevelSetLoggerConfig) : true  #  inside clearLogLevel method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: configuration - Method: getLoggers
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
        //Act Statement(s)
        target.setLogLevel("ROOT", LogLevel.OFF);
    }

    //Sapient generated method id: ${setLogLevelWhenLoggerNotInstanceOfLevelSetLoggerConfig}, hash: B8D1B007AB57F404CF3DC537E659A4B6
    @Test()
    void setLogLevelWhenLoggerNotInstanceOfLevelSetLoggerConfig() {
        /* Branches:
         * (!StringUtils.hasLength(name)) : false  #  inside getLogger method
         * (ROOT_LOGGER_NAME.equals(name)) : true  #  inside getLogger method
         * (isRootLogger) : true  #  inside getLogger method
         * (configuration instanceof AbstractConfiguration abstractConfiguration) : false  #  inside findLogger method
         * (level == null) : true  #  inside setLogLevel method
         * (logger instanceof LevelSetLoggerConfig) : false  #  inside clearLogLevel method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: configuration - Method: getLoggers
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
        //Act Statement(s)
        target.setLogLevel("ROOT", LogLevel.OFF);
    }

    //Sapient generated method id: ${setLogLevelWhenLoggerIsNull}, hash: 54CF6BA896D6D45E5FA1AF0DA4043EAE
    @Test()
    void setLogLevelWhenLoggerIsNull() {
        /* Branches:
         * (!StringUtils.hasLength(name)) : false  #  inside getLogger method
         * (ROOT_LOGGER_NAME.equals(name)) : true  #  inside getLogger method
         * (isRootLogger) : true  #  inside getLogger method
         * (configuration instanceof AbstractConfiguration abstractConfiguration) : false  #  inside findLogger method
         * (level == null) : false  #  inside setLogLevel method
         * (logger == null) : true  #  inside setLogLevel method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: configuration - Method: getLoggers
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
        //Act Statement(s)
        target.setLogLevel("ROOT", LogLevel.OFF);
    }

    //Sapient generated method id: ${setLogLevelWhenConfigurationNotInstanceOfAbstractConfigurationAndLevelIsNotNullAndLoggerIsNotNull}, hash: 083F388C7018F8F71A1D30EA659243B3
    @Test()
    void setLogLevelWhenConfigurationNotInstanceOfAbstractConfigurationAndLevelIsNotNullAndLoggerIsNotNull() {
        /* Branches:
         * (!StringUtils.hasLength(name)) : false  #  inside getLogger method
         * (ROOT_LOGGER_NAME.equals(name)) : false  #  inside getLogger method
         * (isRootLogger) : false  #  inside getLogger method
         * (configuration instanceof AbstractConfiguration abstractConfiguration) : false  #  inside findLogger method
         * (level == null) : false  #  inside setLogLevel method
         * (logger == null) : false  #  inside setLogLevel method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: configuration - Method: getLoggers
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
        //Act Statement(s)
        target.setLogLevel("H", LogLevel.FATAL);
    }

    //Sapient generated method id: ${getLoggerConfigurationsWhenNameIsNotNullAndStringUtilsNotHasLengthName}, hash: 0AEDFCD628EDDD50356629C314D64CAF
    @Disabled()
    @Test()
    void getLoggerConfigurationsWhenNameIsNotNullAndStringUtilsNotHasLengthName() {
        /* Branches:
         * (for-each(getLoggerContext().getLoggers())) : true  #  inside getAllLoggers method
         * (name != null) : true  #  inside addLogger method
         * (!StringUtils.hasLength(name)) : true  #  inside getSubName method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type LoggerContext - Method: getLoggers
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
            stringUtils.when(() -> StringUtils.hasLength("A")).thenReturn(false);
            stringUtils.when(() -> StringUtils.hasLength("B")).thenReturn(false);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
            //Act Statement(s)
            List<LoggerConfiguration> result = target.getLoggerConfigurations();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                stringUtils.verify(() -> StringUtils.hasLength("A"), atLeast(1));
                stringUtils.verify(() -> StringUtils.hasLength("B"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getLoggerConfigurationsWhenNestedNotEqualsMinus1}, hash: D618D1AB12D78577CFFA0C4973DD1140
    @Disabled()
    @Test()
    void getLoggerConfigurationsWhenNestedNotEqualsMinus1() {
        /* Branches:
         * (for-each(getLoggerContext().getLoggers())) : true  #  inside getAllLoggers method
         * (name != null) : true  #  inside addLogger method
         * (!StringUtils.hasLength(name)) : true  #  inside getSubName method
         * (nested != -1) : true  #  inside getSubName method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type LoggerContext - Method: getLoggers
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
            stringUtils.when(() -> StringUtils.hasLength("str1")).thenReturn(false);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
            //Act Statement(s)
            List<LoggerConfiguration> result = target.getLoggerConfigurations();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                stringUtils.verify(() -> StringUtils.hasLength("str1"), atLeast(2));
            });
        }
    }

    //Sapient generated method id: ${getLoggerConfigurationsWhenNestedEqualsMinus1}, hash: B752CD18E15578323BCF5CD6C4F55F31
    @Disabled()
    @Test()
    void getLoggerConfigurationsWhenNestedEqualsMinus1() {
        /* Branches:
         * (for-each(getLoggerContext().getLoggers())) : true  #  inside getAllLoggers method
         * (name != null) : true  #  inside addLogger method
         * (!StringUtils.hasLength(name)) : true  #  inside getSubName method
         * (nested != -1) : false  #  inside getSubName method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type LoggerContext - Method: getLoggers
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
            stringUtils.when(() -> StringUtils.hasLength("A")).thenReturn(false);
            stringUtils.when(() -> StringUtils.hasLength("B")).thenReturn(true);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
            //Act Statement(s)
            List<LoggerConfiguration> result = target.getLoggerConfigurations();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                stringUtils.verify(() -> StringUtils.hasLength("A"), atLeast(1));
                stringUtils.verify(() -> StringUtils.hasLength("B"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getLoggerConfigurationsWhenStringUtilsHasLengthNameAndNestedNotEqualsMinus1}, hash: F4CE4AF0C2604CD22A9C795A724B2DFB
    @Disabled()
    @Test()
    void getLoggerConfigurationsWhenStringUtilsHasLengthNameAndNestedNotEqualsMinus1() {
        /* Branches:
         * (for-each(getLoggerContext().getLoggers())) : true  #  inside getAllLoggers method
         * (name != null) : true  #  inside addLogger method
         * (!StringUtils.hasLength(name)) : false  #  inside getSubName method
         * (nested != -1) : true  #  inside getSubName method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type LoggerContext - Method: getLoggers
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
        //Act Statement(s)
        List<LoggerConfiguration> result = target.getLoggerConfigurations();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getLoggerConfigurationsWhenStringUtilsHasLengthNameAndNestedEqualsMinus1}, hash: 36589D1EDA0DD56962346FCC1BA97F37
    @Disabled()
    @Test()
    void getLoggerConfigurationsWhenStringUtilsHasLengthNameAndNestedEqualsMinus1() {
        /* Branches:
         * (for-each(getLoggerContext().getLoggers())) : true  #  inside getAllLoggers method
         * (name != null) : true  #  inside addLogger method
         * (!StringUtils.hasLength(name)) : false  #  inside getSubName method
         * (nested != -1) : false  #  inside getSubName method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type LoggerContext - Method: getLoggers
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
        //Act Statement(s)
        List<LoggerConfiguration> result = target.getLoggerConfigurations();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getLoggerConfigurationWhenNameIsNotNullAndStringUtilsNotHasLengthNameAndLoggerConfigIsNull}, hash: EB045243FAF8F78EB97A7C56B94DBBA9
    @Disabled()
    @Test()
    void getLoggerConfigurationWhenNameIsNotNullAndStringUtilsNotHasLengthNameAndLoggerConfigIsNull() {
        /* Branches:
         * (for-each(getLoggerContext().getLoggers())) : true  #  inside getAllLoggers method
         * (name != null) : true  #  inside addLogger method
         * (!StringUtils.hasLength(name)) : true  #  inside getSubName method
         * (loggerConfig != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type LoggerContext - Method: getLoggers
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
            stringUtils.when(() -> StringUtils.hasLength("A")).thenReturn(false);
            stringUtils.when(() -> StringUtils.hasLength("B")).thenReturn(false);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
            //Act Statement(s)
            LoggerConfiguration result = target.getLoggerConfiguration("loggerName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                stringUtils.verify(() -> StringUtils.hasLength("A"), atLeast(1));
                stringUtils.verify(() -> StringUtils.hasLength("B"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getLoggerConfigurationWhenNestedNotEqualsMinus1AndLoggerConfigIsNull}, hash: 11BE6B730A3A404C9D573A2413817293
    @Disabled()
    @Test()
    void getLoggerConfigurationWhenNestedNotEqualsMinus1AndLoggerConfigIsNull() {
        /* Branches:
         * (for-each(getLoggerContext().getLoggers())) : true  #  inside getAllLoggers method
         * (name != null) : true  #  inside addLogger method
         * (!StringUtils.hasLength(name)) : true  #  inside getSubName method
         * (nested != -1) : true  #  inside getSubName method
         * (loggerConfig != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type LoggerContext - Method: getLoggers
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
            stringUtils.when(() -> StringUtils.hasLength("str1")).thenReturn(false);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
            //Act Statement(s)
            LoggerConfiguration result = target.getLoggerConfiguration("loggerName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                stringUtils.verify(() -> StringUtils.hasLength("str1"), atLeast(2));
            });
        }
    }

    //Sapient generated method id: ${getLoggerConfigurationWhenNestedEqualsMinus1AndLoggerConfigIsNull}, hash: A79C9466A8C714B2C77EF285042FC91C
    @Disabled()
    @Test()
    void getLoggerConfigurationWhenNestedEqualsMinus1AndLoggerConfigIsNull() {
        /* Branches:
         * (for-each(getLoggerContext().getLoggers())) : true  #  inside getAllLoggers method
         * (name != null) : true  #  inside addLogger method
         * (!StringUtils.hasLength(name)) : true  #  inside getSubName method
         * (nested != -1) : false  #  inside getSubName method
         * (loggerConfig != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type LoggerContext - Method: getLoggers
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
            stringUtils.when(() -> StringUtils.hasLength("A")).thenReturn(false);
            stringUtils.when(() -> StringUtils.hasLength("B")).thenReturn(true);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
            //Act Statement(s)
            LoggerConfiguration result = target.getLoggerConfiguration("loggerName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                stringUtils.verify(() -> StringUtils.hasLength("A"), atLeast(1));
                stringUtils.verify(() -> StringUtils.hasLength("B"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getLoggerConfigurationWhenStringUtilsHasLengthNameAndNestedNotEqualsMinus1AndLoggerConfigIsNull}, hash: 289490C89A50CD4C208273BC36C512B0
    @Test()
    void getLoggerConfigurationWhenStringUtilsHasLengthNameAndNestedNotEqualsMinus1AndLoggerConfigIsNull() {
        /* Branches:
         * (for-each(getLoggerContext().getLoggers())) : true  #  inside getAllLoggers method
         * (name != null) : true  #  inside addLogger method
         * (!StringUtils.hasLength(name)) : false  #  inside getSubName method
         * (nested != -1) : true  #  inside getSubName method
         * (loggerConfig != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type LoggerContext - Method: getLoggers
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
        //Act Statement(s)
        LoggerConfiguration result = target.getLoggerConfiguration("loggerName1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getLoggerConfigurationWhenStringUtilsHasLengthNameAndNestedEqualsMinus1AndLoggerConfigIsNull}, hash: FAA262D4A38D95CFDE9BD0DEFED9D7F6
    @Test()
    void getLoggerConfigurationWhenStringUtilsHasLengthNameAndNestedEqualsMinus1AndLoggerConfigIsNull() {
        /* Branches:
         * (for-each(getLoggerContext().getLoggers())) : true  #  inside getAllLoggers method
         * (name != null) : true  #  inside addLogger method
         * (!StringUtils.hasLength(name)) : false  #  inside getSubName method
         * (nested != -1) : false  #  inside getSubName method
         * (loggerConfig != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type LoggerContext - Method: getLoggers
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
        //Act Statement(s)
        LoggerConfiguration result = target.getLoggerConfiguration("loggerName1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getShutdownHandlerTest}, hash: AC751B6B650D38B816D1700D5695555D
    @Test()
    void getShutdownHandlerTest() {
        //Arrange Statement(s)
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
        //Act Statement(s)
        Runnable result = target.getShutdownHandler();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${cleanUpWhenIsLog4jBridgeHandlerAvailableNot}, hash: 9FCD9C310395A8AA7B0F29595BE2DE63
    @Test()
    void cleanUpWhenIsLog4jBridgeHandlerAvailableNot() throws Throwable {
        /* Branches:
         * (ClassUtils.isPresent(LOG4J_BRIDGE_HANDLER, getClassLoader())) : false  #  inside isLog4jBridgeHandlerAvailable method
         * (isLog4jBridgeHandlerAvailable()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            classUtils.when(() -> ClassUtils.isPresent(eq("org.apache.logging.log4j.jul.Log4jBridgeHandler"), (ClassLoader) any())).thenReturn(false);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
            //Act Statement(s)
            target.cleanUp();
            //Assert statement(s)
            assertAll("result", () -> classUtils.verify(() -> ClassUtils.isPresent(eq("org.apache.logging.log4j.jul.Log4jBridgeHandler"), (ClassLoader) any())));
        }
    }

    //Sapient generated method id: ${cleanUpWhenHandlerInstanceOfLog4jBridgeHandler}, hash: 3691CBE2E34CEC61104B4E6038761845
    @Test()
    void cleanUpWhenHandlerInstanceOfLog4jBridgeHandler() throws Throwable {
        /* Branches:
         * (ClassUtils.isPresent(LOG4J_BRIDGE_HANDLER, getClassLoader())) : true  #  inside isLog4jBridgeHandlerAvailable method
         * (isLog4jBridgeHandlerAvailable()) : true
         * (handlers.length == 1) : true  #  inside removeDefaultRootHandler method
         * (handlers[0] instanceof ConsoleHandler) : true  #  inside removeDefaultRootHandler method
         * (for-each(rootLogger.getHandlers())) : true  #  inside removeLog4jBridgeHandler method
         * (handler instanceof Log4jBridgeHandler) : true  #  inside removeLog4jBridgeHandler method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            classUtils.when(() -> ClassUtils.isPresent(eq("org.apache.logging.log4j.jul.Log4jBridgeHandler"), (ClassLoader) any())).thenReturn(true);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
            //Act Statement(s)
            target.cleanUp();
            //Assert statement(s)
            assertAll("result", () -> classUtils.verify(() -> ClassUtils.isPresent(eq("org.apache.logging.log4j.jul.Log4jBridgeHandler"), (ClassLoader) any())));
        }
    }

    //Sapient generated method id: ${cleanUpWhenRootLoggerGetHandlersIsNotEmptyAndHandlerInstanceOfLog4jBridgeHandler}, hash: 01339C6424C19669A9167E5D056FAD73
    @Test()
    void cleanUpWhenRootLoggerGetHandlersIsNotEmptyAndHandlerInstanceOfLog4jBridgeHandler() throws Throwable {
        /* Branches:
         * (ClassUtils.isPresent(LOG4J_BRIDGE_HANDLER, getClassLoader())) : true  #  inside isLog4jBridgeHandlerAvailable method
         * (isLog4jBridgeHandlerAvailable()) : true
         * (handlers.length == 1) : true  #  inside removeDefaultRootHandler method
         * (handlers[0] instanceof ConsoleHandler) : true  #  inside removeDefaultRootHandler method
         * (catch-exception (Throwable)) : true  #  inside removeDefaultRootHandler method
         * (for-each(rootLogger.getHandlers())) : true  #  inside removeLog4jBridgeHandler method
         * (handler instanceof Log4jBridgeHandler) : true  #  inside removeLog4jBridgeHandler method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            classUtils.when(() -> ClassUtils.isPresent(eq("org.apache.logging.log4j.jul.Log4jBridgeHandler"), (ClassLoader) any())).thenReturn(true);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
            //Act Statement(s)
            target.cleanUp();
            //Assert statement(s)
            assertAll("result", () -> classUtils.verify(() -> ClassUtils.isPresent(eq("org.apache.logging.log4j.jul.Log4jBridgeHandler"), (ClassLoader) any())));
        }
    }

    //Sapient generated method id: ${getDefaultLogCorrelationPatternTest}, hash: 4C7A10D2C94669766BB2079893B2996F
    @Test()
    void getDefaultLogCorrelationPatternTest() {
        //Arrange Statement(s)
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
        //Act Statement(s)
        String result = target.getDefaultLogCorrelationPattern();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("%correlationId")));
    }

    //Sapient generated method id: ${getEnvironmentWhenLoggerContextIsNotNull}, hash: 0E5848A9E30105F643E64B29F28FCA1E
    @Test()
    void getEnvironmentWhenLoggerContextIsNotNull() {
        /* Branches:
         * (loggerContext != null) : true
         */
        //Arrange Statement(s)
        LoggerContext loggerContext = new LoggerContext("name1");
        //Act Statement(s)
        Environment result = Log4J2LoggingSystem.getEnvironment(loggerContext);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getEnvironmentWhenLoggerContextIsNull}, hash: 4528C07E4414A4FC0AB653D4DB6BB888
    @Test()
    void getEnvironmentWhenLoggerContextIsNull() {
        /* Branches:
         * (loggerContext != null) : false
         */
        //Arrange Statement(s)
        LoggerContext loggerContext = null;
        //Act Statement(s)
        Environment result = Log4J2LoggingSystem.getEnvironment(loggerContext);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }
}
