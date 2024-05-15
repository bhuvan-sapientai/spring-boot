package org.springframework.boot.logging.logback;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import ch.qos.logback.core.status.StatusUtil;
import java.util.List;
import org.springframework.boot.logging.LoggerConfiguration;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.classic.spi.LoggerContextListener;
import org.slf4j.bridge.SLF4JBridgeHandler;
import ch.qos.logback.classic.LoggerContext;
import org.springframework.util.StringUtils;
import org.springframework.util.Assert;
import ch.qos.logback.core.util.StatusPrinter;
import ch.qos.logback.classic.spi.TurboFilterList;
import org.springframework.boot.logging.LogLevel;
import java.util.ArrayList;
import org.springframework.util.SystemPropertyUtils;
import org.springframework.core.env.ConfigurableEnvironment;
import org.mockito.stubbing.Answer;
import org.springframework.core.env.Environment;
import org.springframework.util.ClassUtils;
import org.springframework.boot.logging.LoggingSystemProperties;
import ch.qos.logback.classic.Level;
import org.springframework.boot.logging.LoggingInitializationContext;
import java.util.Set;
import java.util.function.Supplier;
import org.mockito.MockedStatic;
import ch.qos.logback.core.status.Status;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.aot.AotDetector;
import ch.qos.logback.classic.Logger;
import org.springframework.boot.logging.LogFile;
import org.springframework.beans.factory.aot.BeanFactoryInitializationAotContribution;
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
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.atLeast;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LogbackLoggingSystemSapientGeneratedTest {

    private final ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);

    private final Environment environmentMock = mock(Environment.class);

    private final LoggingInitializationContext initializationContextMock = mock(LoggingInitializationContext.class);

    private final Level levelMock = mock(Level.class);

    private final Level levelMock2 = mock(Level.class);

    private final LogFile logFileMock = mock(LogFile.class);

    private final LoggerContext loggerContextMock = mock(LoggerContext.class);

    private final LoggerContext loggerContextMock2 = mock(LoggerContext.class);

    private final Logger loggerMock = mock(Logger.class);

    private final LoggingInitializationContext loggingInitializationContextMock = mock(LoggingInitializationContext.class);

    private final StatusManager statusManagerMock = mock(StatusManager.class);

    //Sapient generated method id: ${getSystemPropertiesTest}, hash: A75E902F7B846D2CDD673685B51899A2
    @Test()
    void getSystemPropertiesTest() {
        //Arrange Statement(s)
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
        ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
        //Act Statement(s)
        LoggingSystemProperties result = target.getSystemProperties(configurableEnvironmentMock);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getStandardConfigLocationsTest}, hash: 78E80F317CD0E50E6D2337F610FDE866
    @Test()
    void getStandardConfigLocationsTest() {
        //Arrange Statement(s)
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
        //Act Statement(s)
        String[] result = target.getStandardConfigLocations();
        String[] stringResultArray = new String[] { "logback-test.groovy", "logback-test.xml", "logback.groovy", "logback.xml" };
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(stringResultArray)));
    }

    //Sapient generated method id: ${beforeInitializeWhenIsAlreadyInitializedLoggerContext}, hash: C666E6AE34270862328FB182D150DD47
    @Disabled()
    @Test()
    void beforeInitializeWhenIsAlreadyInitializedLoggerContext() throws Throwable, InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (loggerContext.getObject(LoggingSystem.class.getName()) != null) : true  #  inside isAlreadyInitialized method
         * (isAlreadyInitialized(loggerContext)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            doReturn(object).when(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            target.beforeInitialize();
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).getObject("org.springframework.boot.logging.LoggingSystem");
            });
        }
    }

    //Sapient generated method id: ${beforeInitializeWhenIsBridgeJulIntoSlf4jNot}, hash: D4646A9CE136035BBF1E2E1BAD6D453E
    @Disabled()
    @Test()
    void beforeInitializeWhenIsBridgeJulIntoSlf4jNot() throws Throwable, InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (loggerContext.getObject(LoggingSystem.class.getName()) != null) : false  #  inside isAlreadyInitialized method
         * (isAlreadyInitialized(loggerContext)) : false
         * (ClassUtils.isPresent(BRIDGE_HANDLER, getClassLoader())) : false  #  inside isBridgeHandlerAvailable method
         * (isBridgeHandlerAvailable()) : false  #  inside isBridgeJulIntoSlf4j method
         * (isBridgeJulIntoSlf4j()) : false  #  inside configureJdkLoggingBridgeHandler method
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doReturn(null).when(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
            TurboFilterList turboFilterList = new TurboFilterList();
            doReturn(turboFilterList).when(loggerContextMock).getTurboFilterList();
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            target.beforeInitialize();
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).getObject("org.springframework.boot.logging.LoggingSystem");
                verify(loggerContextMock, atLeast(1)).getTurboFilterList();
            });
        }
    }

    //Sapient generated method id: ${beforeInitializeWhenCaughtThrowable}, hash: 619A725EEF58FAD9D5D5D92F61B2761E
    @Disabled()
    @Test()
    void beforeInitializeWhenCaughtThrowable() throws Throwable, InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : false  #  inside getLoggerFactory method
         * (loggerContext.getObject(LoggingSystem.class.getName()) != null) : false  #  inside isAlreadyInitialized method
         * (isAlreadyInitialized(loggerContext)) : false
         * (ClassUtils.isPresent(BRIDGE_HANDLER, getClassLoader())) : false  #  inside isBridgeHandlerAvailable method
         * (isBridgeHandlerAvailable()) : false  #  inside isBridgeJulIntoSlf4j method
         * (isBridgeJulIntoSlf4j()) : false  #  inside configureJdkLoggingBridgeHandler method
         * (catch-exception (Throwable)) : true  #  inside configureJdkLoggingBridgeHandler method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doReturn(null).when(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
            TurboFilterList turboFilterList = new TurboFilterList();
            doReturn(turboFilterList).when(loggerContextMock).getTurboFilterList();
            classUtils.when(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any())).thenReturn(false);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            target.beforeInitialize();
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).getObject("org.springframework.boot.logging.LoggingSystem");
                verify(loggerContextMock, atLeast(1)).getTurboFilterList();
                classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
            });
        }
    }

    //Sapient generated method id: ${beforeInitializeWhen0IndexOfHandlersNotInstanceOfConsoleHandlerAndIsJulUsingASingleConsoleHandlerAtMostNotAndIsBridgeJu}, hash: 44CD7829A6AA8AAFD09538F848B0AABF
    @Disabled()
    @Test()
    void beforeInitializeWhen0IndexOfHandlersNotInstanceOfConsoleHandlerAndIsJulUsingASingleConsoleHandlerAtMostNotAndIsBridgeJu() throws Throwable, InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (loggerContext.getObject(LoggingSystem.class.getName()) != null) : false  #  inside isAlreadyInitialized method
         * (isAlreadyInitialized(loggerContext)) : false
         * (ClassUtils.isPresent(BRIDGE_HANDLER, getClassLoader())) : true  #  inside isBridgeHandlerAvailable method
         * (isBridgeHandlerAvailable()) : true  #  inside isBridgeJulIntoSlf4j method
         * (handlers.length == 0) : false  #  inside isJulUsingASingleConsoleHandlerAtMost method
         * (handlers.length == 1) : true  #  inside isJulUsingASingleConsoleHandlerAtMost method
         * (handlers[0] instanceof ConsoleHandler) : false  #  inside isJulUsingASingleConsoleHandlerAtMost method
         * (isJulUsingASingleConsoleHandlerAtMost()) : false  #  inside isBridgeJulIntoSlf4j method
         * (isBridgeJulIntoSlf4j()) : false  #  inside configureJdkLoggingBridgeHandler method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doReturn(null).when(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
            TurboFilterList turboFilterList = new TurboFilterList();
            doReturn(turboFilterList).when(loggerContextMock).getTurboFilterList();
            classUtils.when(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any())).thenReturn(true);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            target.beforeInitialize();
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).getObject("org.springframework.boot.logging.LoggingSystem");
                verify(loggerContextMock, atLeast(1)).getTurboFilterList();
                classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
            });
        }
    }

    //Sapient generated method id: ${beforeInitializeWhen0IndexOfHandlersInstanceOfConsoleHandler}, hash: 9EFD15DDBA6AA278075815D1012BCF6E
    @Disabled()
    @Test()
    void beforeInitializeWhen0IndexOfHandlersInstanceOfConsoleHandler() throws Throwable, InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (loggerContext.getObject(LoggingSystem.class.getName()) != null) : false  #  inside isAlreadyInitialized method
         * (isAlreadyInitialized(loggerContext)) : false
         * (ClassUtils.isPresent(BRIDGE_HANDLER, getClassLoader())) : true  #  inside isBridgeHandlerAvailable method
         * (isBridgeHandlerAvailable()) : true  #  inside isBridgeJulIntoSlf4j method
         * (handlers.length == 0) : false  #  inside isJulUsingASingleConsoleHandlerAtMost method
         * (handlers.length == 1) : true  #  inside isJulUsingASingleConsoleHandlerAtMost method
         * (handlers[0] instanceof ConsoleHandler) : true  #  inside isJulUsingASingleConsoleHandlerAtMost method
         * (isJulUsingASingleConsoleHandlerAtMost()) : true  #  inside isBridgeJulIntoSlf4j method
         * (isBridgeJulIntoSlf4j()) : true  #  inside configureJdkLoggingBridgeHandler method
         * (handlers.length == 1) : true  #  inside removeDefaultRootHandler method
         * (handlers[0] instanceof ConsoleHandler) : true  #  inside removeDefaultRootHandler method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doReturn(null).when(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
            TurboFilterList turboFilterList = new TurboFilterList();
            doReturn(turboFilterList).when(loggerContextMock).getTurboFilterList();
            classUtils.when(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any())).thenReturn(true);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            target.beforeInitialize();
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).getObject("org.springframework.boot.logging.LoggingSystem");
                verify(loggerContextMock, atLeast(1)).getTurboFilterList();
                classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
            });
        }
    }

    //Sapient generated method id: ${initializeWhenCaughtInterruptedExceptionThrowsIllegalStateException}, hash: DB64C11D6ED9559941FEF77878A75C7A
    @Disabled()
    @Test()
    void initializeWhenCaughtInterruptedExceptionThrowsIllegalStateException() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Thread> thread = mockStatic(Thread.class)) {
            thread.when(() -> Thread.sleep(50L)).thenAnswer((Answer<Void>) invocation -> null);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.initialize(loggingInitializationContextMock, "configLocation1", logFileMock);
            });
            InterruptedException interruptedException = new InterruptedException();
            IllegalStateException illegalStateException = new IllegalStateException("Interrupted while waiting for non-substitute logger factory", interruptedException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(interruptedException.getClass())));
                thread.verify(() -> Thread.sleep(50L), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${initializeWhenIsAlreadyInitializedLoggerContext}, hash: 34BB59EADB6FE2F08E0197D06676C634
    @Disabled()
    @Test()
    void initializeWhenIsAlreadyInitializedLoggerContext() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (loggerContext.getObject(LoggingSystem.class.getName()) != null) : true  #  inside isAlreadyInitialized method
         * (isAlreadyInitialized(loggerContext)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            doReturn(object).when(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            target.initialize(loggingInitializationContextMock, "configLocation1", logFileMock);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).getObject("org.springframework.boot.logging.LoggingSystem");
            });
        }
    }

    //Sapient generated method id: ${initializeWhenLoggerContextGetObjectLoggingSystemGetNameIsNotNullAndIsAlreadyInitializedLoggerContext}, hash: 02671D51F104162E89F41187DA918566
    @Disabled()
    @Test()
    void initializeWhenLoggerContextGetObjectLoggingSystemGetNameIsNotNullAndIsAlreadyInitializedLoggerContext() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : false  #  inside getLoggerFactory method
         * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
         * (loggerContext.getObject(LoggingSystem.class.getName()) != null) : true  #  inside isAlreadyInitialized method
         * (isAlreadyInitialized(loggerContext)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            doReturn(object).when(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            target.initialize(loggingInitializationContextMock, "configLocation1", logFileMock);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).getObject("org.springframework.boot.logging.LoggingSystem");
            });
        }
    }

    //Sapient generated method id: ${initializeWhenStringUtilsHasTextSystemGetPropertyCONFIGURATION_FILE_PROPERTYAndCaughtInterruThrowsIllegalStateException}, hash: B0A73F3F777641F06A1F3B149B1516E6
    @Disabled()
    @Test()
    void initializeWhenStringUtilsHasTextSystemGetPropertyCONFIGURATION_FILE_PROPERTYAndCaughtInterruThrowsIllegalStateException() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : false  #  inside getLoggerFactory method
         * (loggerContext.getObject(LoggingSystem.class.getName()) != null) : false  #  inside isAlreadyInitialized method
         * (isAlreadyInitialized(loggerContext)) : false
         * (!AotDetector.useGeneratedArtifacts()) : true  #  inside initializeFromAotGeneratedArtifactsIfPossible method
         * (!initializeFromAotGeneratedArtifactsIfPossible(initializationContext, logFile)) : true
         * (StringUtils.hasLength(configLocation)) : true  #  inside initialize method
         * (StringUtils.hasText(System.getProperty(CONFIGURATION_FILE_PROPERTY))) : true
         * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Thread> thread = mockStatic(Thread.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(environmentMock).when(initializationContextMock).getEnvironment();
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doReturn(null).when(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
            doNothing().when(loggerContextMock).putObject("org.springframework.core.env.Environment", environmentMock);
            TurboFilterList turboFilterList = new TurboFilterList();
            turboFilterList.add(null);
            doReturn(turboFilterList).when(loggerContextMock).getTurboFilterList();
            doNothing().when(loggerContextMock).putObject(eq("org.springframework.boot.logging.LoggingSystem"), (Object) any());
            thread.when(() -> Thread.sleep(50L)).thenAnswer((Answer<Void>) invocation -> null);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.initialize(initializationContextMock, "A", logFileMock);
            });
            InterruptedException interruptedException = new InterruptedException();
            IllegalStateException illegalStateException = new IllegalStateException("Interrupted while waiting for non-substitute logger factory", interruptedException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(interruptedException.getClass())));
                verify(initializationContextMock).getEnvironment();
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).getObject("org.springframework.boot.logging.LoggingSystem");
                verify(loggerContextMock, atLeast(1)).putObject("org.springframework.core.env.Environment", environmentMock);
                verify(loggerContextMock, atLeast(1)).getTurboFilterList();
                verify(loggerContextMock).putObject(eq("org.springframework.boot.logging.LoggingSystem"), (Object) any());
                thread.verify(() -> Thread.sleep(50L), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${initializeWhenLoggerROOT_LOGGER_NAMENotEqualsName}, hash: C41D2F3DCC2B27C85887B80334C78366
    @Disabled()
    @Test()
    void initializeWhenLoggerROOT_LOGGER_NAMENotEqualsName() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (loggerContext.getObject(LoggingSystem.class.getName()) != null) : false  #  inside isAlreadyInitialized method
         * (isAlreadyInitialized(loggerContext)) : false
         * (!AotDetector.useGeneratedArtifacts()) : true  #  inside initializeFromAotGeneratedArtifactsIfPossible method
         * (!initializeFromAotGeneratedArtifactsIfPossible(initializationContext, logFile)) : true
         * (StringUtils.hasLength(configLocation)) : true  #  inside initialize method
         * (StringUtils.hasText(System.getProperty(CONFIGURATION_FILE_PROPERTY))) : true
         * (!StringUtils.hasLength(name)) : false  #  inside getLoggerName method
         * (Logger.ROOT_LOGGER_NAME.equals(name)) : false  #  inside getLoggerName method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(environmentMock).when(initializationContextMock).getEnvironment();
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doReturn(null).when(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
            doNothing().when(loggerContextMock).putObject("org.springframework.core.env.Environment", environmentMock);
            TurboFilterList turboFilterList = new TurboFilterList();
            turboFilterList.add(null);
            doReturn(turboFilterList).when(loggerContextMock).getTurboFilterList();
            doNothing().when(loggerContextMock).putObject(eq("org.springframework.boot.logging.LoggingSystem"), (Object) any());
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doReturn(loggerMock).when(loggerContextMock2).getLogger("org.springframework.boot.logging.logback.LogbackLoggingSystem");
            doNothing().when(loggerMock).warn("Ignoring 'logback.configurationFile' system property. Please use 'logging.config' instead.");
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            target.initialize(initializationContextMock, "A", logFileMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(initializationContextMock).getEnvironment();
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).getObject("org.springframework.boot.logging.LoggingSystem");
                verify(loggerContextMock, atLeast(1)).putObject("org.springframework.core.env.Environment", environmentMock);
                verify(loggerContextMock, atLeast(1)).getTurboFilterList();
                verify(loggerContextMock).putObject(eq("org.springframework.boot.logging.LoggingSystem"), (Object) any());
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any()));
                verify(loggerContextMock2, atLeast(1)).getLogger("org.springframework.boot.logging.logback.LogbackLoggingSystem");
                verify(loggerMock).warn("Ignoring 'logback.configurationFile' system property. Please use 'logging.config' instead.");
            });
        }
    }

    //Sapient generated method id: ${initializeWhenCaughtInterruptedExceptionAndStringUtilsHasLengthNameAndLoggerROOT_LOGGER_NAMENotEqualsName}, hash: C530EEAAE137B49FF770D381D8C5947A
    @Disabled()
    @Test()
    void initializeWhenCaughtInterruptedExceptionAndStringUtilsHasLengthNameAndLoggerROOT_LOGGER_NAMENotEqualsName() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : false  #  inside getLoggerFactory method
         * (loggerContext.getObject(LoggingSystem.class.getName()) != null) : false  #  inside isAlreadyInitialized method
         * (isAlreadyInitialized(loggerContext)) : false
         * (!AotDetector.useGeneratedArtifacts()) : true  #  inside initializeFromAotGeneratedArtifactsIfPossible method
         * (!initializeFromAotGeneratedArtifactsIfPossible(initializationContext, logFile)) : true
         * (StringUtils.hasLength(configLocation)) : true  #  inside initialize method
         * (StringUtils.hasText(System.getProperty(CONFIGURATION_FILE_PROPERTY))) : true
         * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
         * (!StringUtils.hasLength(name)) : false  #  inside getLoggerName method
         * (Logger.ROOT_LOGGER_NAME.equals(name)) : false  #  inside getLoggerName method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(environmentMock).when(initializationContextMock).getEnvironment();
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doReturn(null).when(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
            doNothing().when(loggerContextMock).putObject("org.springframework.core.env.Environment", environmentMock);
            TurboFilterList turboFilterList = new TurboFilterList();
            turboFilterList.add(null);
            doReturn(turboFilterList).when(loggerContextMock).getTurboFilterList();
            doNothing().when(loggerContextMock).putObject(eq("org.springframework.boot.logging.LoggingSystem"), (Object) any());
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doReturn(loggerMock).when(loggerContextMock2).getLogger("org.springframework.boot.logging.logback.LogbackLoggingSystem");
            doNothing().when(loggerMock).warn("Ignoring 'logback.configurationFile' system property. Please use 'logging.config' instead.");
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            target.initialize(initializationContextMock, "A", logFileMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(initializationContextMock).getEnvironment();
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).getObject("org.springframework.boot.logging.LoggingSystem");
                verify(loggerContextMock, atLeast(1)).putObject("org.springframework.core.env.Environment", environmentMock);
                verify(loggerContextMock, atLeast(1)).getTurboFilterList();
                verify(loggerContextMock).putObject(eq("org.springframework.boot.logging.LoggingSystem"), (Object) any());
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any()));
                verify(loggerContextMock2, atLeast(1)).getLogger("org.springframework.boot.logging.logback.LogbackLoggingSystem");
                verify(loggerMock).warn("Ignoring 'logback.configurationFile' system property. Please use 'logging.config' instead.");
            });
        }
    }

    //Sapient generated method id: ${initializeWhenLogFileIsNullAndStringUtilsNotHasTextSystemGetPropertyCONFIGURATION_FILE_PROPERTY}, hash: D330B2176CDFB1853DD5E5E629CDE3FB
    @Disabled()
    @Test()
    void initializeWhenLogFileIsNullAndStringUtilsNotHasTextSystemGetPropertyCONFIGURATION_FILE_PROPERTY() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (loggerContext.getObject(LoggingSystem.class.getName()) != null) : false  #  inside isAlreadyInitialized method
         * (isAlreadyInitialized(loggerContext)) : false
         * (!AotDetector.useGeneratedArtifacts()) : true  #  inside initializeFromAotGeneratedArtifactsIfPossible method
         * (!initializeFromAotGeneratedArtifactsIfPossible(initializationContext, logFile)) : true
         * (StringUtils.hasLength(configLocation)) : false  #  inside initialize method
         * (for-each(locations)) : true  #  inside findConfig method
         * (resource.exists()) : true  #  inside findConfig method
         * (config != null) : true  #  inside initializeWithConventions method
         * (logFile == null) : true  #  inside initializeWithConventions method
         * (StringUtils.hasText(System.getProperty(CONFIGURATION_FILE_PROPERTY))) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(environmentMock).when(initializationContextMock).getEnvironment();
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doReturn(null).when(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
            doNothing().when(loggerContextMock).putObject("org.springframework.core.env.Environment", environmentMock);
            TurboFilterList turboFilterList = new TurboFilterList();
            turboFilterList.add(null);
            doReturn(turboFilterList).when(loggerContextMock).getTurboFilterList();
            doNothing().when(loggerContextMock).putObject(eq("org.springframework.boot.logging.LoggingSystem"), (Object) any());
            stringUtils.when(() -> StringUtils.hasLength("C")).thenReturn(false);
            stringUtils.when(() -> StringUtils.hasText("B")).thenReturn(false);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            LogFile logFile = null;
            //Act Statement(s)
            target.initialize(initializationContextMock, "C", logFile);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(initializationContextMock).getEnvironment();
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).getObject("org.springframework.boot.logging.LoggingSystem");
                verify(loggerContextMock, atLeast(1)).putObject("org.springframework.core.env.Environment", environmentMock);
                verify(loggerContextMock, atLeast(1)).getTurboFilterList();
                verify(loggerContextMock).putObject(eq("org.springframework.boot.logging.LoggingSystem"), (Object) any());
                stringUtils.verify(() -> StringUtils.hasLength("C"), atLeast(1));
                stringUtils.verify(() -> StringUtils.hasText("B"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${initializeWhenILessThanLocationsLengthAndConfigIsNotNullAndStringUtilsNotHasTextSystemGetPropertyCONFIGURATION_FILE_PRO}, hash: 58F446A41C06EB0CB85E746AF678CF3A
    @Disabled()
    @Test()
    void initializeWhenILessThanLocationsLengthAndConfigIsNotNullAndStringUtilsNotHasTextSystemGetPropertyCONFIGURATION_FILE_PRO() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (loggerContext.getObject(LoggingSystem.class.getName()) != null) : false  #  inside isAlreadyInitialized method
         * (isAlreadyInitialized(loggerContext)) : false
         * (!AotDetector.useGeneratedArtifacts()) : true  #  inside initializeFromAotGeneratedArtifactsIfPossible method
         * (!initializeFromAotGeneratedArtifactsIfPossible(initializationContext, logFile)) : true
         * (StringUtils.hasLength(configLocation)) : false  #  inside initialize method
         * (for-each(locations)) : true  #  inside findConfig method
         * (resource.exists()) : false  #  inside findConfig method
         * (config != null) : false  #  inside initializeWithConventions method
         * (config == null) : true  #  inside initializeWithConventions method
         * (i < locations.length) : true  #  inside getSpringConfigLocations method
         * (config != null) : true  #  inside initializeWithConventions method
         * (StringUtils.hasText(System.getProperty(CONFIGURATION_FILE_PROPERTY))) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(environmentMock).when(initializationContextMock).getEnvironment();
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doReturn(null).when(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
            doNothing().when(loggerContextMock).putObject("org.springframework.core.env.Environment", environmentMock);
            TurboFilterList turboFilterList = new TurboFilterList();
            turboFilterList.add(null);
            doReturn(turboFilterList).when(loggerContextMock).getTurboFilterList();
            doNothing().when(loggerContextMock).putObject(eq("org.springframework.boot.logging.LoggingSystem"), (Object) any());
            stringUtils.when(() -> StringUtils.getFilenameExtension("DA")).thenReturn("");
            stringUtils.when(() -> StringUtils.hasText("BE")).thenReturn(false);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            target.initialize(initializationContextMock, "", logFileMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(initializationContextMock, atLeast(1)).getEnvironment();
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()), atLeast(1));
                verify(loggerContextMock, atLeast(1)).getObject("org.springframework.boot.logging.LoggingSystem");
                verify(loggerContextMock, atLeast(1)).putObject("org.springframework.core.env.Environment", environmentMock);
                verify(loggerContextMock, atLeast(1)).getTurboFilterList();
                verify(loggerContextMock, atLeast(1)).putObject(eq("org.springframework.boot.logging.LoggingSystem"), (Object) any());
                stringUtils.verify(() -> StringUtils.getFilenameExtension("DA"), atLeast(1));
                stringUtils.verify(() -> StringUtils.hasText("BE"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${initializeWhenILessThanLocationsLengthAndConfigIsNullAndStringUtilsNotHasTextSystemGetPropertyCONFIGURATION_FILE_PROPER}, hash: 7BBFE1FCFB8C6CD01A1BCA1C5AA8A4D0
    @Disabled()
    @Test()
    void initializeWhenILessThanLocationsLengthAndConfigIsNullAndStringUtilsNotHasTextSystemGetPropertyCONFIGURATION_FILE_PROPER() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (loggerContext.getObject(LoggingSystem.class.getName()) != null) : false  #  inside isAlreadyInitialized method
         * (isAlreadyInitialized(loggerContext)) : false
         * (!AotDetector.useGeneratedArtifacts()) : true  #  inside initializeFromAotGeneratedArtifactsIfPossible method
         * (!initializeFromAotGeneratedArtifactsIfPossible(initializationContext, logFile)) : true
         * (StringUtils.hasLength(configLocation)) : false  #  inside initialize method
         * (for-each(locations)) : true  #  inside findConfig method
         * (resource.exists()) : false  #  inside findConfig method
         * (config != null) : false  #  inside initializeWithConventions method
         * (config == null) : true  #  inside initializeWithConventions method
         * (i < locations.length) : true  #  inside getSpringConfigLocations method
         * (config != null) : false  #  inside initializeWithConventions method
         * (StringUtils.hasText(System.getProperty(CONFIGURATION_FILE_PROPERTY))) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(environmentMock).when(initializationContextMock).getEnvironment();
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doReturn(null).when(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
            doNothing().when(loggerContextMock).putObject("org.springframework.core.env.Environment", environmentMock);
            TurboFilterList turboFilterList = new TurboFilterList();
            turboFilterList.add(null);
            doReturn(turboFilterList).when(loggerContextMock).getTurboFilterList();
            doNothing().when(loggerContextMock).putObject(eq("org.springframework.boot.logging.LoggingSystem"), (Object) any());
            stringUtils.when(() -> StringUtils.getFilenameExtension("DA")).thenReturn("");
            stringUtils.when(() -> StringUtils.hasText("BE")).thenReturn(false);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            target.initialize(initializationContextMock, "", logFileMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(initializationContextMock, atLeast(1)).getEnvironment();
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()), atLeast(1));
                verify(loggerContextMock, atLeast(1)).getObject("org.springframework.boot.logging.LoggingSystem");
                verify(loggerContextMock, atLeast(1)).putObject("org.springframework.core.env.Environment", environmentMock);
                verify(loggerContextMock, atLeast(1)).getTurboFilterList();
                verify(loggerContextMock, atLeast(1)).putObject(eq("org.springframework.boot.logging.LoggingSystem"), (Object) any());
                stringUtils.verify(() -> StringUtils.getFilenameExtension("DA"), atLeast(1));
                stringUtils.verify(() -> StringUtils.hasText("BE"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${loadDefaultsWhenCaughtInterruptedExceptionThrowsIllegalStateException}, hash: 0F45B2FABE3755EB3AE1D568AF348B43
    @Disabled()
    @Test()
    void loadDefaultsWhenCaughtInterruptedExceptionThrowsIllegalStateException() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Thread> thread = mockStatic(Thread.class)) {
            thread.when(() -> Thread.sleep(50L)).thenAnswer((Answer<Void>) invocation -> null);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.loadDefaults(loggingInitializationContextMock, logFileMock);
            });
            InterruptedException interruptedException = new InterruptedException();
            IllegalStateException illegalStateException = new IllegalStateException("Interrupted while waiting for non-substitute logger factory", interruptedException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(interruptedException.getClass())));
                thread.verify(() -> Thread.sleep(50L), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${loadDefaultsWhenIsBridgeHandlerInstalledNot}, hash: 341438DF20798DA290DBAA04A89CF1AB
    @Disabled()
    @Test()
    void loadDefaultsWhenIsBridgeHandlerInstalledNot() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (ClassUtils.isPresent(BRIDGE_HANDLER, getClassLoader())) : false  #  inside isBridgeHandlerAvailable method
         * (!isBridgeHandlerAvailable()) : true  #  inside isBridgeHandlerInstalled method
         * (isBridgeHandlerInstalled()) : false  #  inside stopAndReset method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(loggerContextMock).stop();
            doNothing().when(loggerContextMock).reset();
            classUtils.when(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any())).thenReturn(false);
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            TurboFilterList turboFilterList = new TurboFilterList();
            doReturn(turboFilterList).when(loggerContextMock2).getTurboFilterList();
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            target.loadDefaults(loggingInitializationContextMock, logFileMock);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).stop();
                verify(loggerContextMock, atLeast(1)).reset();
                classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any()));
                verify(loggerContextMock2, atLeast(1)).getTurboFilterList();
            });
        }
    }

    //Sapient generated method id: ${loadDefaultsWhenIsBridgeHandlerInstalledNotAndCaughtInterruptedExceptionThrowsIllegalStateException}, hash: 32EBE45D6C1D8E3541BB19100D008EFB
    @Disabled()
    @Test()
    void loadDefaultsWhenIsBridgeHandlerInstalledNotAndCaughtInterruptedExceptionThrowsIllegalStateException() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : false  #  inside getLoggerFactory method
         * (ClassUtils.isPresent(BRIDGE_HANDLER, getClassLoader())) : false  #  inside isBridgeHandlerAvailable method
         * (!isBridgeHandlerAvailable()) : true  #  inside isBridgeHandlerInstalled method
         * (isBridgeHandlerInstalled()) : false  #  inside stopAndReset method
         * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Thread> thread = mockStatic(Thread.class);
            MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(loggerContextMock).stop();
            doNothing().when(loggerContextMock).reset();
            classUtils.when(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any())).thenReturn(false);
            thread.when(() -> Thread.sleep(50L)).thenAnswer((Answer<Void>) invocation -> null);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.loadDefaults(loggingInitializationContextMock, logFileMock);
            });
            InterruptedException interruptedException = new InterruptedException();
            IllegalStateException illegalStateException = new IllegalStateException("Interrupted while waiting for non-substitute logger factory", interruptedException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(interruptedException.getClass())));
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).stop();
                verify(loggerContextMock, atLeast(1)).reset();
                classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
                thread.verify(() -> Thread.sleep(50L), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${loadDefaultsWhenIsBridgeHandlerInstalled}, hash: FED9A8BB01CBC8C9169802DA100418F9
    @Disabled()
    @Test()
    void loadDefaultsWhenIsBridgeHandlerInstalled() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (ClassUtils.isPresent(BRIDGE_HANDLER, getClassLoader())) : true  #  inside isBridgeHandlerAvailable method
         * (!isBridgeHandlerAvailable()) : false  #  inside isBridgeHandlerInstalled method
         * (handlers.length == 1) : true  #  inside isBridgeHandlerInstalled method
         * (handlers[0] instanceof SLF4JBridgeHandler) : true  #  inside isBridgeHandlerInstalled method
         * (isBridgeHandlerInstalled()) : true  #  inside stopAndReset method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(loggerContextMock).stop();
            doNothing().when(loggerContextMock).reset();
            doNothing().when(loggerContextMock).addListener((LoggerContextListener) any());
            classUtils.when(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any())).thenReturn(true);
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            TurboFilterList turboFilterList = new TurboFilterList();
            doReturn(turboFilterList).when(loggerContextMock2).getTurboFilterList();
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            target.loadDefaults(loggingInitializationContextMock, logFileMock);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).stop();
                verify(loggerContextMock, atLeast(1)).reset();
                verify(loggerContextMock).addListener((LoggerContextListener) any());
                classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any()));
                verify(loggerContextMock2, atLeast(1)).getTurboFilterList();
            });
        }
    }

    //Sapient generated method id: ${loadDefaultsWhen0IndexOfHandlersNotInstanceOfSLF4JBridgeHandlerAndIsBridgeHandlerInstalledNot}, hash: 4314E2348CCA7B3B85C7CA142BDF774E
    @Disabled()
    @Test()
    void loadDefaultsWhen0IndexOfHandlersNotInstanceOfSLF4JBridgeHandlerAndIsBridgeHandlerInstalledNot() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (ClassUtils.isPresent(BRIDGE_HANDLER, getClassLoader())) : true  #  inside isBridgeHandlerAvailable method
         * (!isBridgeHandlerAvailable()) : false  #  inside isBridgeHandlerInstalled method
         * (handlers.length == 1) : true  #  inside isBridgeHandlerInstalled method
         * (handlers[0] instanceof SLF4JBridgeHandler) : false  #  inside isBridgeHandlerInstalled method
         * (isBridgeHandlerInstalled()) : false  #  inside stopAndReset method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(loggerContextMock).stop();
            doNothing().when(loggerContextMock).reset();
            classUtils.when(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any())).thenReturn(true);
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            TurboFilterList turboFilterList = new TurboFilterList();
            doReturn(turboFilterList).when(loggerContextMock2).getTurboFilterList();
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            target.loadDefaults(loggingInitializationContextMock, logFileMock);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).stop();
                verify(loggerContextMock, atLeast(1)).reset();
                classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any()));
                verify(loggerContextMock2, atLeast(1)).getTurboFilterList();
            });
        }
    }

    //Sapient generated method id: ${loadConfigurationWhenCaughtInterruptedExceptionThrowsIllegalStateException}, hash: B341A9BD94A3CB8B36DAE46AED5A343D
    @Disabled()
    @Test()
    void loadConfigurationWhenCaughtInterruptedExceptionThrowsIllegalStateException() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Thread> thread = mockStatic(Thread.class)) {
            thread.when(() -> Thread.sleep(50L)).thenAnswer((Answer<Void>) invocation -> null);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.loadConfiguration(loggingInitializationContextMock, "location1", logFileMock);
            });
            InterruptedException interruptedException = new InterruptedException();
            IllegalStateException illegalStateException = new IllegalStateException("Interrupted while waiting for non-substitute logger factory", interruptedException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(interruptedException.getClass())));
                thread.verify(() -> Thread.sleep(50L), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${loadConfigurationWhenIsBridgeHandlerInstalledNotAndCaughtInterruptedExceptionThrowsIllegalStateException}, hash: 9CA9D3AF71106896A8321AEE3EE58460
    @Disabled()
    @Test()
    void loadConfigurationWhenIsBridgeHandlerInstalledNotAndCaughtInterruptedExceptionThrowsIllegalStateException() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : false  #  inside getLoggerFactory method
         * (ClassUtils.isPresent(BRIDGE_HANDLER, getClassLoader())) : false  #  inside isBridgeHandlerAvailable method
         * (!isBridgeHandlerAvailable()) : true  #  inside isBridgeHandlerInstalled method
         * (isBridgeHandlerInstalled()) : false  #  inside stopAndReset method
         * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Thread> thread = mockStatic(Thread.class);
            MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(loggerContextMock).stop();
            doNothing().when(loggerContextMock).reset();
            classUtils.when(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any())).thenReturn(false);
            thread.when(() -> Thread.sleep(50L)).thenAnswer((Answer<Void>) invocation -> null);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.loadConfiguration(loggingInitializationContextMock, "location1", logFileMock);
            });
            InterruptedException interruptedException = new InterruptedException();
            IllegalStateException illegalStateException = new IllegalStateException("Interrupted while waiting for non-substitute logger factory", interruptedException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(interruptedException.getClass())));
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).stop();
                verify(loggerContextMock, atLeast(1)).reset();
                classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
                thread.verify(() -> Thread.sleep(50L), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${loadConfigurationWhenStatusUtilContextHasStatusListenerLoggerContext}, hash: 1D9FA588361F49C788CE3E868EC03CA7
    @Disabled()
    @Test()
    void loadConfigurationWhenStatusUtilContextHasStatusListenerLoggerContext() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (ClassUtils.isPresent(BRIDGE_HANDLER, getClassLoader())) : false  #  inside isBridgeHandlerAvailable method
         * (!isBridgeHandlerAvailable()) : true  #  inside isBridgeHandlerInstalled method
         * (isBridgeHandlerInstalled()) : false  #  inside stopAndReset method
         * (for-each(loggerContext.getStatusManager().getCopyOfStatusList())) : false  #  inside reportConfigurationErrorsIfNecessary method
         * (errors.isEmpty()) : true  #  inside reportConfigurationErrorsIfNecessary method
         * (!StatusUtil.contextHasStatusListener(loggerContext)) : false  #  inside reportConfigurationErrorsIfNecessary method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StatusUtil> statusUtil = mockStatic(StatusUtil.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(loggerContextMock).stop();
            doNothing().when(loggerContextMock).reset();
            doReturn(statusManagerMock).when(loggerContextMock).getStatusManager();
            List<Status> statusList = new ArrayList<>();
            doReturn(statusList).when(statusManagerMock).getCopyOfStatusList();
            classUtils.when(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any())).thenReturn(false);
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            TurboFilterList turboFilterList = new TurboFilterList();
            doReturn(turboFilterList).when(loggerContextMock2).getTurboFilterList();
            statusUtil.when(() -> StatusUtil.contextHasStatusListener(loggerContextMock)).thenReturn(true);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            target.loadConfiguration(loggingInitializationContextMock, "location1", logFileMock);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).stop();
                verify(loggerContextMock, atLeast(1)).reset();
                verify(loggerContextMock, atLeast(1)).getStatusManager();
                verify(statusManagerMock).getCopyOfStatusList();
                classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any()));
                verify(loggerContextMock2, atLeast(1)).getTurboFilterList();
                statusUtil.verify(() -> StatusUtil.contextHasStatusListener(loggerContextMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${loadConfigurationWhenErrorsIsEmptyAndStatusUtilContextHasStatusListenerLoggerContext4}, hash: 0FDF34ED8E047867280A68AED12B663F
    @Disabled()
    @Test()
    void loadConfigurationWhenErrorsIsEmptyAndStatusUtilContextHasStatusListenerLoggerContext4() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (ClassUtils.isPresent(BRIDGE_HANDLER, getClassLoader())) : true  #  inside isBridgeHandlerAvailable method
         * (!isBridgeHandlerAvailable()) : false  #  inside isBridgeHandlerInstalled method
         * (handlers.length == 1) : true  #  inside isBridgeHandlerInstalled method
         * (handlers[0] instanceof SLF4JBridgeHandler) : false  #  inside isBridgeHandlerInstalled method
         * (isBridgeHandlerInstalled()) : false  #  inside stopAndReset method
         * (for-each(loggerContext.getStatusManager().getCopyOfStatusList())) : false  #  inside reportConfigurationErrorsIfNecessary method
         * (errors.isEmpty()) : true  #  inside reportConfigurationErrorsIfNecessary method
         * (!StatusUtil.contextHasStatusListener(loggerContext)) : false  #  inside reportConfigurationErrorsIfNecessary method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StatusUtil> statusUtil = mockStatic(StatusUtil.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(loggerContextMock).stop();
            doNothing().when(loggerContextMock).reset();
            doReturn(statusManagerMock).when(loggerContextMock).getStatusManager();
            List<Status> statusList = new ArrayList<>();
            doReturn(statusList).when(statusManagerMock).getCopyOfStatusList();
            classUtils.when(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any())).thenReturn(true);
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            TurboFilterList turboFilterList = new TurboFilterList();
            doReturn(turboFilterList).when(loggerContextMock2).getTurboFilterList();
            statusUtil.when(() -> StatusUtil.contextHasStatusListener(loggerContextMock)).thenReturn(true);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            target.loadConfiguration(loggingInitializationContextMock, "location1", logFileMock);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).stop();
                verify(loggerContextMock, atLeast(1)).reset();
                verify(loggerContextMock, atLeast(1)).getStatusManager();
                verify(statusManagerMock).getCopyOfStatusList();
                classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any()));
                verify(loggerContextMock2, atLeast(1)).getTurboFilterList();
                statusUtil.verify(() -> StatusUtil.contextHasStatusListener(loggerContextMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${loadConfigurationWhenErrorsNotIsEmptyThrowsIllegalStateException}, hash: CC808A6F19F7FB2DE7CC168A062186E4
    @Disabled()
    @Test()
    void loadConfigurationWhenErrorsNotIsEmptyThrowsIllegalStateException() {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (ClassUtils.isPresent(BRIDGE_HANDLER, getClassLoader())) : true  #  inside isBridgeHandlerAvailable method
         * (!isBridgeHandlerAvailable()) : false  #  inside isBridgeHandlerInstalled method
         * (handlers.length == 1) : true  #  inside isBridgeHandlerInstalled method
         * (handlers[0] instanceof SLF4JBridgeHandler) : true  #  inside isBridgeHandlerInstalled method
         * (isBridgeHandlerInstalled()) : true  #  inside stopAndReset method
         * (for-each(loggerContext.getStatusManager().getCopyOfStatusList())) : true  #  inside reportConfigurationErrorsIfNecessary method
         * (status.getLevel() == Status.ERROR) : true  #  inside reportConfigurationErrorsIfNecessary method
         * (!errors.isEmpty()) : false  #  inside reportConfigurationErrorsIfNecessary method
         * (status.getThrowable() != null) : true  #  inside reportConfigurationErrorsIfNecessary method
         * (errors.isEmpty()) : false  #  inside reportConfigurationErrorsIfNecessary method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Status statusMock = mock(Status.class, "object");
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(loggerContextMock).stop();
            doNothing().when(loggerContextMock).reset();
            doNothing().when(loggerContextMock).addListener((LoggerContextListener) any());
            doReturn(statusManagerMock).when(loggerContextMock).getStatusManager();
            List<Status> statusList = new ArrayList<>();
            statusList.add(statusMock);
            doReturn(statusList).when(statusManagerMock).getCopyOfStatusList();
            doReturn(2).when(statusMock).getLevel();
            Throwable throwable = new Throwable();
            Throwable throwable2 = new Throwable();
            doReturn(throwable, throwable2).when(statusMock).getThrowable();
            classUtils.when(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any())).thenReturn(true);
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            TurboFilterList turboFilterList = new TurboFilterList();
            doReturn(turboFilterList).when(loggerContextMock2).getTurboFilterList();
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.loadConfiguration(loggingInitializationContextMock, "location1", logFileMock);
            });
            IllegalStateException illegalStateException = new IllegalStateException("Logback configuration error detected: \nobject");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).stop();
                verify(loggerContextMock, atLeast(1)).reset();
                verify(loggerContextMock).addListener((LoggerContextListener) any());
                verify(loggerContextMock, atLeast(1)).getStatusManager();
                verify(statusManagerMock).getCopyOfStatusList();
                verify(statusMock).getLevel();
                verify(statusMock, times(2)).getThrowable();
                classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any()));
                verify(loggerContextMock2, atLeast(1)).getTurboFilterList();
            });
        }
    }

    //Sapient generated method id: ${loadConfigurationWhenStatusGetThrowableIsNotNullAndErrorsIsEmptyAndStatusUtilNotContextHasStatusListenerLoggerContext}, hash: 03ECF123A63715EC4813A457C0298A30
    @Disabled()
    @Test()
    void loadConfigurationWhenStatusGetThrowableIsNotNullAndErrorsIsEmptyAndStatusUtilNotContextHasStatusListenerLoggerContext() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : false  #  inside getLoggerFactory method
         * (ClassUtils.isPresent(BRIDGE_HANDLER, getClassLoader())) : false  #  inside isBridgeHandlerAvailable method
         * (!isBridgeHandlerAvailable()) : true  #  inside isBridgeHandlerInstalled method
         * (isBridgeHandlerInstalled()) : false  #  inside stopAndReset method
         * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
         * (for-each(loggerContext.getStatusManager().getCopyOfStatusList())) : true  #  inside reportConfigurationErrorsIfNecessary method
         * (status.getLevel() == Status.ERROR) : true  #  inside reportConfigurationErrorsIfNecessary method
         * (!errors.isEmpty()) : false  #  inside reportConfigurationErrorsIfNecessary method
         * (status.getThrowable() != null) : true  #  inside reportConfigurationErrorsIfNecessary method
         * (errors.isEmpty()) : true  #  inside reportConfigurationErrorsIfNecessary method
         * (!StatusUtil.contextHasStatusListener(loggerContext)) : true  #  inside reportConfigurationErrorsIfNecessary method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StatusPrinter> statusPrinter = mockStatic(StatusPrinter.class);
            MockedStatic<StatusUtil> statusUtil = mockStatic(StatusUtil.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(loggerContextMock).stop();
            doNothing().when(loggerContextMock).reset();
            doReturn(statusManagerMock).when(loggerContextMock).getStatusManager();
            List<Status> statusList = new ArrayList<>();
            doReturn(statusList).when(statusManagerMock).getCopyOfStatusList();
            classUtils.when(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any())).thenReturn(false);
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            TurboFilterList turboFilterList = new TurboFilterList();
            doReturn(turboFilterList).when(loggerContextMock2).getTurboFilterList();
            statusUtil.when(() -> StatusUtil.contextHasStatusListener(loggerContextMock)).thenReturn(false);
            statusPrinter.when(() -> StatusPrinter.printInCaseOfErrorsOrWarnings(loggerContextMock)).thenAnswer((Answer<Void>) invocation -> null);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            target.loadConfiguration(loggingInitializationContextMock, "location1", logFileMock);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).stop();
                verify(loggerContextMock, atLeast(1)).reset();
                verify(loggerContextMock, atLeast(1)).getStatusManager();
                verify(statusManagerMock).getCopyOfStatusList();
                classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any()));
                verify(loggerContextMock2, atLeast(1)).getTurboFilterList();
                statusUtil.verify(() -> StatusUtil.contextHasStatusListener(loggerContextMock), atLeast(1));
                statusPrinter.verify(() -> StatusPrinter.printInCaseOfErrorsOrWarnings(loggerContextMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${loadConfigurationWhenStatusGetThrowableIsNotNullAndErrorsIsEmptyAndStatusUtilNotContextHasStatusListenerLoggerContext2}, hash: DE305BDE97810664EF63EE26E51DF06B
    @Disabled()
    @Test()
    void loadConfigurationWhenStatusGetThrowableIsNotNullAndErrorsIsEmptyAndStatusUtilNotContextHasStatusListenerLoggerContext2() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (ClassUtils.isPresent(BRIDGE_HANDLER, getClassLoader())) : true  #  inside isBridgeHandlerAvailable method
         * (!isBridgeHandlerAvailable()) : false  #  inside isBridgeHandlerInstalled method
         * (handlers.length == 1) : true  #  inside isBridgeHandlerInstalled method
         * (handlers[0] instanceof SLF4JBridgeHandler) : true  #  inside isBridgeHandlerInstalled method
         * (isBridgeHandlerInstalled()) : true  #  inside stopAndReset method
         * (for-each(loggerContext.getStatusManager().getCopyOfStatusList())) : true  #  inside reportConfigurationErrorsIfNecessary method
         * (status.getLevel() == Status.ERROR) : true  #  inside reportConfigurationErrorsIfNecessary method
         * (!errors.isEmpty()) : false  #  inside reportConfigurationErrorsIfNecessary method
         * (status.getThrowable() != null) : true  #  inside reportConfigurationErrorsIfNecessary method
         * (errors.isEmpty()) : true  #  inside reportConfigurationErrorsIfNecessary method
         * (!StatusUtil.contextHasStatusListener(loggerContext)) : true  #  inside reportConfigurationErrorsIfNecessary method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StatusPrinter> statusPrinter = mockStatic(StatusPrinter.class);
            MockedStatic<StatusUtil> statusUtil = mockStatic(StatusUtil.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(loggerContextMock).stop();
            doNothing().when(loggerContextMock).reset();
            doNothing().when(loggerContextMock).addListener((LoggerContextListener) any());
            doReturn(statusManagerMock).when(loggerContextMock).getStatusManager();
            List<Status> statusList = new ArrayList<>();
            doReturn(statusList).when(statusManagerMock).getCopyOfStatusList();
            classUtils.when(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any())).thenReturn(true);
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            TurboFilterList turboFilterList = new TurboFilterList();
            doReturn(turboFilterList).when(loggerContextMock2).getTurboFilterList();
            statusUtil.when(() -> StatusUtil.contextHasStatusListener(loggerContextMock)).thenReturn(false);
            statusPrinter.when(() -> StatusPrinter.printInCaseOfErrorsOrWarnings(loggerContextMock)).thenAnswer((Answer<Void>) invocation -> null);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            target.loadConfiguration(loggingInitializationContextMock, "location1", logFileMock);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).stop();
                verify(loggerContextMock, atLeast(1)).reset();
                verify(loggerContextMock).addListener((LoggerContextListener) any());
                verify(loggerContextMock, atLeast(1)).getStatusManager();
                verify(statusManagerMock).getCopyOfStatusList();
                classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any()));
                verify(loggerContextMock2, atLeast(1)).getTurboFilterList();
                statusUtil.verify(() -> StatusUtil.contextHasStatusListener(loggerContextMock), atLeast(1));
                statusPrinter.verify(() -> StatusPrinter.printInCaseOfErrorsOrWarnings(loggerContextMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${cleanUpWhenCaughtInterruptedExceptionThrowsIllegalStateException}, hash: F2DAF563CE75FD0E3D1AA90B1779FDCB
    @Disabled()
    @Test()
    void cleanUpWhenCaughtInterruptedExceptionThrowsIllegalStateException() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Thread> thread = mockStatic(Thread.class)) {
            thread.when(() -> Thread.sleep(50L)).thenAnswer((Answer<Void>) invocation -> null);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.cleanUp();
            });
            InterruptedException interruptedException = new InterruptedException();
            IllegalStateException illegalStateException = new IllegalStateException("Interrupted while waiting for non-substitute logger factory", interruptedException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(interruptedException.getClass())));
                thread.verify(() -> Thread.sleep(50L), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${cleanUpWhenIsBridgeHandlerAvailableNot}, hash: 0E4F92551C556DB94440F940A32FD9B7
    @Disabled()
    @Test()
    void cleanUpWhenIsBridgeHandlerAvailableNot() throws Throwable, InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (ClassUtils.isPresent(BRIDGE_HANDLER, getClassLoader())) : false  #  inside isBridgeHandlerAvailable method
         * (isBridgeHandlerAvailable()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(loggerContextMock).removeObject("org.springframework.boot.logging.LoggingSystem");
            doReturn(statusManagerMock).when(loggerContextMock).getStatusManager();
            doNothing().when(statusManagerMock).clear();
            TurboFilterList turboFilterList = new TurboFilterList();
            turboFilterList.add(null);
            doReturn(turboFilterList).when(loggerContextMock).getTurboFilterList();
            classUtils.when(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any())).thenReturn(false);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            target.cleanUp();
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).removeObject("org.springframework.boot.logging.LoggingSystem");
                verify(loggerContextMock, atLeast(1)).getStatusManager();
                verify(statusManagerMock).clear();
                verify(loggerContextMock, atLeast(1)).getTurboFilterList();
                classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
            });
        }
    }

    //Sapient generated method id: ${cleanUpWhen0IndexOfHandlersInstanceOfConsoleHandler}, hash: F86481DA7C0C0C68CCF242DF830B23FA
    @Disabled()
    @Test()
    void cleanUpWhen0IndexOfHandlersInstanceOfConsoleHandler() throws Throwable, InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (ClassUtils.isPresent(BRIDGE_HANDLER, getClassLoader())) : true  #  inside isBridgeHandlerAvailable method
         * (isBridgeHandlerAvailable()) : true
         * (handlers.length == 1) : true  #  inside removeDefaultRootHandler method
         * (handlers[0] instanceof ConsoleHandler) : true  #  inside removeDefaultRootHandler method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(loggerContextMock).removeObject("org.springframework.boot.logging.LoggingSystem");
            doReturn(statusManagerMock).when(loggerContextMock).getStatusManager();
            doNothing().when(statusManagerMock).clear();
            TurboFilterList turboFilterList = new TurboFilterList();
            turboFilterList.add(null);
            doReturn(turboFilterList).when(loggerContextMock).getTurboFilterList();
            classUtils.when(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any())).thenReturn(true);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            target.cleanUp();
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).removeObject("org.springframework.boot.logging.LoggingSystem");
                verify(loggerContextMock, atLeast(1)).getStatusManager();
                verify(statusManagerMock).clear();
                verify(loggerContextMock, atLeast(1)).getTurboFilterList();
                classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
            });
        }
    }

    //Sapient generated method id: ${cleanUpWhenCaughtThrowable}, hash: B614712F155F5F44F356C2B917D3F51C
    @Disabled()
    @Test()
    void cleanUpWhenCaughtThrowable() throws Throwable, InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : false  #  inside getLoggerFactory method
         * (ClassUtils.isPresent(BRIDGE_HANDLER, getClassLoader())) : true  #  inside isBridgeHandlerAvailable method
         * (isBridgeHandlerAvailable()) : true
         * (handlers.length == 1) : true  #  inside removeDefaultRootHandler method
         * (handlers[0] instanceof ConsoleHandler) : true  #  inside removeDefaultRootHandler method
         * (catch-exception (Throwable)) : true  #  inside removeJdkLoggingBridgeHandler method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SLF4JBridgeHandler> sLF4JBridgeHandler = mockStatic(SLF4JBridgeHandler.class);
            MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(loggerContextMock).removeObject("org.springframework.boot.logging.LoggingSystem");
            doReturn(statusManagerMock).when(loggerContextMock).getStatusManager();
            doNothing().when(statusManagerMock).clear();
            TurboFilterList turboFilterList = new TurboFilterList();
            turboFilterList.add(null);
            doReturn(turboFilterList).when(loggerContextMock).getTurboFilterList();
            classUtils.when(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any())).thenReturn(true);
            sLF4JBridgeHandler.when(() -> SLF4JBridgeHandler.uninstall()).thenAnswer((Answer<Void>) invocation -> null);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            target.cleanUp();
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).removeObject("org.springframework.boot.logging.LoggingSystem");
                verify(loggerContextMock, atLeast(1)).getStatusManager();
                verify(statusManagerMock).clear();
                verify(loggerContextMock, atLeast(1)).getTurboFilterList();
                classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
                sLF4JBridgeHandler.verify(() -> SLF4JBridgeHandler.uninstall(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${cleanUpWhen0IndexOfHandlersInstanceOfConsoleHandlerAndCaughtThrowable}, hash: 42C012E2FA5AFB9B53BB7C1FFA3A78FD
    @Disabled()
    @Test()
    void cleanUpWhen0IndexOfHandlersInstanceOfConsoleHandlerAndCaughtThrowable() throws Throwable, InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : false  #  inside getLoggerFactory method
         * (ClassUtils.isPresent(BRIDGE_HANDLER, getClassLoader())) : true  #  inside isBridgeHandlerAvailable method
         * (isBridgeHandlerAvailable()) : true
         * (handlers.length == 1) : true  #  inside removeDefaultRootHandler method
         * (handlers[0] instanceof ConsoleHandler) : true  #  inside removeDefaultRootHandler method
         * (catch-exception (Throwable)) : true  #  inside removeDefaultRootHandler method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(loggerContextMock).removeObject("org.springframework.boot.logging.LoggingSystem");
            doReturn(statusManagerMock).when(loggerContextMock).getStatusManager();
            doNothing().when(statusManagerMock).clear();
            TurboFilterList turboFilterList = new TurboFilterList();
            turboFilterList.add(null);
            doReturn(turboFilterList).when(loggerContextMock).getTurboFilterList();
            classUtils.when(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any())).thenReturn(true);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            target.cleanUp();
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).removeObject("org.springframework.boot.logging.LoggingSystem");
                verify(loggerContextMock, atLeast(1)).getStatusManager();
                verify(statusManagerMock).clear();
                verify(loggerContextMock, atLeast(1)).getTurboFilterList();
                classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
            });
        }
    }

    //Sapient generated method id: ${reinitializeWhenCaughtInterruptedExceptionThrowsIllegalStateException}, hash: 80716751296CB701D574B723642885B9
    @Disabled()
    @Test()
    void reinitializeWhenCaughtInterruptedExceptionThrowsIllegalStateException() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Thread> thread = mockStatic(Thread.class)) {
            thread.when(() -> Thread.sleep(50L)).thenAnswer((Answer<Void>) invocation -> null);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.reinitialize(loggingInitializationContextMock);
            });
            InterruptedException interruptedException = new InterruptedException();
            IllegalStateException illegalStateException = new IllegalStateException("Interrupted while waiting for non-substitute logger factory", interruptedException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(interruptedException.getClass())));
                thread.verify(() -> Thread.sleep(50L), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${reinitializeWhenFactoryNotInstanceOfSubstituteLoggerFactoryAndCaughtInterruptedExceptionThrowsIllegalStateException}, hash: BDE077DAC071397CE1197363EC797895
    @Disabled()
    @Test()
    void reinitializeWhenFactoryNotInstanceOfSubstituteLoggerFactoryAndCaughtInterruptedExceptionThrowsIllegalStateException() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : false  #  inside getLoggerFactory method
         * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Thread> thread = mockStatic(Thread.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(loggerContextMock).reset();
            thread.when(() -> Thread.sleep(50L)).thenAnswer((Answer<Void>) invocation -> null);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.reinitialize(loggingInitializationContextMock);
            });
            InterruptedException interruptedException = new InterruptedException();
            IllegalStateException illegalStateException = new IllegalStateException("Interrupted while waiting for non-substitute logger factory", interruptedException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(interruptedException.getClass())));
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).reset();
                thread.verify(() -> Thread.sleep(50L), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${reinitializeWhenResourceExists}, hash: 3B863177F1ABB45CC23CAA5796246302
    @Disabled()
    @Test()
    void reinitializeWhenResourceExists() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (for-each(locations)) : true  #  inside findConfig method
         * (resource.exists()) : true  #  inside findConfig method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(loggerContextMock).reset();
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doReturn(statusManagerMock).when(loggerContextMock2).getStatusManager();
            doNothing().when(statusManagerMock).clear();
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = spy(new LogbackLoggingSystem(classLoader));
            doNothing().when(target).loadConfiguration(loggingInitializationContextMock, "classpath:A", (LogFile) null);
            //Act Statement(s)
            target.reinitialize(loggingInitializationContextMock);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).reset();
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any()));
                verify(loggerContextMock2, atLeast(1)).getStatusManager();
                verify(statusManagerMock).clear();
                verify(target).loadConfiguration(loggingInitializationContextMock, "classpath:A", (LogFile) null);
            });
        }
    }

    //Sapient generated method id: ${reinitializeWhenResourceNotExists}, hash: A6658B57D500CD839450828C37833F23
    @Disabled()
    @Test()
    void reinitializeWhenResourceNotExists() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (for-each(locations)) : true  #  inside findConfig method
         * (resource.exists()) : false  #  inside findConfig method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doNothing().when(loggerContextMock).reset();
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doReturn(statusManagerMock).when(loggerContextMock2).getStatusManager();
            doNothing().when(statusManagerMock).clear();
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = spy(new LogbackLoggingSystem(classLoader));
            doNothing().when(target).loadConfiguration(loggingInitializationContextMock, (String) null, (LogFile) null);
            //Act Statement(s)
            target.reinitialize(loggingInitializationContextMock);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).reset();
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any()));
                verify(loggerContextMock2, atLeast(1)).getStatusManager();
                verify(statusManagerMock).clear();
                verify(target).loadConfiguration(loggingInitializationContextMock, (String) null, (LogFile) null);
            });
        }
    }

    //Sapient generated method id: ${getLoggerConfigurationsWhenCaughtInterruptedExceptionThrowsIllegalStateException}, hash: 7F88C25F6F884424BEEED6DDBEE280C0
    @Disabled()
    @Test()
    void getLoggerConfigurationsWhenCaughtInterruptedExceptionThrowsIllegalStateException() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Thread> thread = mockStatic(Thread.class)) {
            thread.when(() -> Thread.sleep(50L)).thenAnswer((Answer<Void>) invocation -> null);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.getLoggerConfigurations();
            });
            InterruptedException interruptedException = new InterruptedException();
            IllegalStateException illegalStateException = new IllegalStateException("Interrupted while waiting for non-substitute logger factory", interruptedException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(interruptedException.getClass())));
                thread.verify(() -> Thread.sleep(50L), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getLoggerConfigurationsWhenLoggerIsNull}, hash: 32A616C6D48332EF2D75A8D7797417B5
    @Disabled()
    @Test()
    void getLoggerConfigurationsWhenLoggerIsNull() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (for-each(getLoggerContext().getLoggerList())) : true
         * (logger == null) : true  #  inside getLoggerConfiguration method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List<Logger> loggerList = new ArrayList<>();
            loggerList.add((Logger) null);
            doReturn(loggerList).when(loggerContextMock).getLoggerList();
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            List<LoggerConfiguration> result = target.getLoggerConfigurations();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(1));
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).getLoggerList();
            });
        }
    }

    //Sapient generated method id: ${getLoggerConfigurationsWhenGetLoggerContextGetLoggerListIsNotEmptyAndLoggerIsNull}, hash: 41CF11E2F58CAAD22934B85B4286FFE0
    @Disabled()
    @Test()
    void getLoggerConfigurationsWhenGetLoggerContextGetLoggerListIsNotEmptyAndLoggerIsNull() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : false  #  inside getLoggerFactory method
         * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
         * (for-each(getLoggerContext().getLoggerList())) : true
         * (logger == null) : true  #  inside getLoggerConfiguration method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List<Logger> loggerList = new ArrayList<>();
            loggerList.add((Logger) null);
            doReturn(loggerList).when(loggerContextMock).getLoggerList();
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            List<LoggerConfiguration> result = target.getLoggerConfigurations();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(1));
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).getLoggerList();
            });
        }
    }

    //Sapient generated method id: ${getLoggerConfigurationsWhenLoggerROOT_LOGGER_NAMEEqualsName}, hash: D1C956707E1C778C1A93BE75E3FF1749
    @Disabled()
    @Test()
    void getLoggerConfigurationsWhenLoggerROOT_LOGGER_NAMEEqualsName() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (for-each(getLoggerContext().getLoggerList())) : true
         * (logger == null) : false  #  inside getLoggerConfiguration method
         * (!StringUtils.hasLength(name)) : false  #  inside getLoggerName method
         * (Logger.ROOT_LOGGER_NAME.equals(name)) : true  #  inside getLoggerName method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: LEVELS - Method: convertNativeToSystem
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List<Logger> loggerList = new ArrayList<>();
            loggerList.add(loggerMock);
            doReturn(loggerList).when(loggerContextMock).getLoggerList();
            doReturn(levelMock).when(loggerMock).getLevel();
            doReturn(levelMock2).when(loggerMock).getEffectiveLevel();
            doReturn("ROOT").when(loggerMock).getName();
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            List<LoggerConfiguration> result = target.getLoggerConfigurations();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(1));
                assertThat(result.get(0), is(instanceOf(LoggerConfiguration.class)));
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).getLoggerList();
                verify(loggerMock).getLevel();
                verify(loggerMock).getEffectiveLevel();
                verify(loggerMock).getName();
            });
        }
    }

    //Sapient generated method id: ${getLoggerConfigurationsWhenLoggerROOT_LOGGER_NAMENotEqualsName}, hash: E4C06FF0B225D520FA0EB66B542DE5A8
    @Disabled()
    @Test()
    void getLoggerConfigurationsWhenLoggerROOT_LOGGER_NAMENotEqualsName() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (for-each(getLoggerContext().getLoggerList())) : true
         * (logger == null) : false  #  inside getLoggerConfiguration method
         * (!StringUtils.hasLength(name)) : false  #  inside getLoggerName method
         * (Logger.ROOT_LOGGER_NAME.equals(name)) : false  #  inside getLoggerName method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: LEVELS - Method: convertNativeToSystem
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            List<Logger> loggerList = new ArrayList<>();
            loggerList.add(loggerMock);
            doReturn(loggerList).when(loggerContextMock).getLoggerList();
            doReturn(levelMock).when(loggerMock).getLevel();
            doReturn(levelMock2).when(loggerMock).getEffectiveLevel();
            doReturn("A").when(loggerMock).getName();
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            List<LoggerConfiguration> result = target.getLoggerConfigurations();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(1));
                assertThat(result.get(0), is(instanceOf(LoggerConfiguration.class)));
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).getLoggerList();
                verify(loggerMock).getLevel();
                verify(loggerMock).getEffectiveLevel();
                verify(loggerMock).getName();
            });
        }
    }

    //Sapient generated method id: ${getLoggerConfigurationWhenLoggerIsNull}, hash: BAE01C73975420F598AE1D03C6E8D23E
    @Disabled()
    @Test()
    void getLoggerConfigurationWhenLoggerIsNull() throws InterruptedException {
        /* Branches:
         * (!StringUtils.hasLength(name)) : false  #  inside getLoggerName method
         * (Logger.ROOT_LOGGER_NAME.equals(name)) : true  #  inside getLoggerName method
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (logger == null) : true  #  inside getLoggerConfiguration method
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doReturn(null).when(loggerContextMock).exists("ROOT");
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            LoggerConfiguration result = target.getLoggerConfiguration("ROOT");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).exists("ROOT");
            });
        }
    }

    //Sapient generated method id: ${getLoggerConfigurationWhenFactoryInstanceOfSubstituteLoggerFactoryAndLoggerIsNotNull}, hash: E19AB611D2C63B4FC71BCBF74E9ED011
    @Disabled()
    @Test()
    void getLoggerConfigurationWhenFactoryInstanceOfSubstituteLoggerFactoryAndLoggerIsNotNull() throws InterruptedException {
        /* Branches:
         * (!StringUtils.hasLength(name)) : false  #  inside getLoggerName method
         * (Logger.ROOT_LOGGER_NAME.equals(name)) : true  #  inside getLoggerName method
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (logger == null) : false  #  inside getLoggerConfiguration method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: LEVELS - Method: convertNativeToSystem
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doReturn(loggerMock).when(loggerContextMock).exists("ROOT");
            doReturn(levelMock).when(loggerMock).getLevel();
            doReturn(levelMock2).when(loggerMock).getEffectiveLevel();
            doReturn("ROOT").when(loggerMock).getName();
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            LoggerConfiguration result = target.getLoggerConfiguration("ROOT");
            LoggerConfiguration loggerConfiguration = new LoggerConfiguration("ROOT", LogLevel.TRACE, LogLevel.TRACE);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(loggerConfiguration));
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).exists("ROOT");
                verify(loggerMock).getLevel();
                verify(loggerMock).getEffectiveLevel();
                verify(loggerMock).getName();
            });
        }
    }

    //Sapient generated method id: ${getLoggerConfigurationWhenStringUtilsHasLengthNameAndLoggerROOT_LOGGER_NAMEEqualsNameAndFactoryInstanceOfSubstituteLogg}, hash: 554103D1E09921789BBF48052ABCF527
    @Disabled()
    @Test()
    void getLoggerConfigurationWhenStringUtilsHasLengthNameAndLoggerROOT_LOGGER_NAMEEqualsNameAndFactoryInstanceOfSubstituteLogg() throws InterruptedException {
        /* Branches:
         * (!StringUtils.hasLength(name)) : false  #  inside getLoggerName method
         * (Logger.ROOT_LOGGER_NAME.equals(name)) : true  #  inside getLoggerName method
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (logger == null) : false  #  inside getLoggerConfiguration method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: LEVELS - Method: convertNativeToSystem
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doReturn(loggerMock).when(loggerContextMock).exists("ROOT");
            doReturn(levelMock).when(loggerMock).getLevel();
            doReturn(levelMock2).when(loggerMock).getEffectiveLevel();
            doReturn("A").when(loggerMock).getName();
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            LoggerConfiguration result = target.getLoggerConfiguration("ROOT");
            LoggerConfiguration loggerConfiguration = new LoggerConfiguration("A", LogLevel.TRACE, LogLevel.TRACE);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(loggerConfiguration));
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).exists("ROOT");
                verify(loggerMock).getLevel();
                verify(loggerMock).getEffectiveLevel();
                verify(loggerMock).getName();
            });
        }
    }

    //Sapient generated method id: ${getLoggerConfigurationWhenCaughtInterruptedExceptionThrowsIllegalStateException}, hash: 20FE88DC3D5B761CBD7AFB3D81BEC56C
    @Disabled()
    @Test()
    void getLoggerConfigurationWhenCaughtInterruptedExceptionThrowsIllegalStateException() throws InterruptedException {
        /* Branches:
         * (!StringUtils.hasLength(name)) : false  #  inside getLoggerName method
         * (Logger.ROOT_LOGGER_NAME.equals(name)) : true  #  inside getLoggerName method
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Thread> thread = mockStatic(Thread.class)) {
            thread.when(() -> Thread.sleep(50L)).thenAnswer((Answer<Void>) invocation -> null);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.getLoggerConfiguration("ROOT");
            });
            InterruptedException interruptedException = new InterruptedException();
            IllegalStateException illegalStateException = new IllegalStateException("Interrupted while waiting for non-substitute logger factory", interruptedException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(interruptedException.getClass())));
                thread.verify(() -> Thread.sleep(50L), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getLoggerConfigurationWhenLoggerROOT_LOGGER_NAMENotEqualsNameAndFactoryNotInstanceOfSubstituteLoggerFactoryAndLoggerIsN}, hash: 737732815B0A76DCA3F86AE4CA919D20
    @Disabled()
    @Test()
    void getLoggerConfigurationWhenLoggerROOT_LOGGER_NAMENotEqualsNameAndFactoryNotInstanceOfSubstituteLoggerFactoryAndLoggerIsN() throws InterruptedException {
        /* Branches:
         * (!StringUtils.hasLength(name)) : false  #  inside getLoggerName method
         * (Logger.ROOT_LOGGER_NAME.equals(name)) : false  #  inside getLoggerName method
         * (factory instanceof SubstituteLoggerFactory) : false  #  inside getLoggerFactory method
         * (logger == null) : false  #  inside getLoggerConfiguration method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: LEVELS - Method: convertNativeToSystem
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            stringUtils.when(() -> StringUtils.hasLength("A")).thenReturn(true);
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doReturn(loggerMock).when(loggerContextMock).exists("A");
            doReturn(levelMock).when(loggerMock).getLevel();
            doReturn(levelMock2).when(loggerMock).getEffectiveLevel();
            doReturn("B").when(loggerMock).getName();
            stringUtils.when(() -> StringUtils.hasLength("B")).thenReturn(false);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            LoggerConfiguration result = target.getLoggerConfiguration("A");
            LoggerConfiguration loggerConfiguration = new LoggerConfiguration("ROOT", LogLevel.TRACE, LogLevel.TRACE);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(loggerConfiguration));
                stringUtils.verify(() -> StringUtils.hasLength("A"), atLeast(1));
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).exists("A");
                verify(loggerMock).getLevel();
                verify(loggerMock).getEffectiveLevel();
                verify(loggerMock).getName();
                stringUtils.verify(() -> StringUtils.hasLength("B"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getLoggerConfigurationWhenCaughtInterruptedExceptionAndLoggerIsNull}, hash: C3B363C4E0147F8641C0E3DF61372FF6
    @Disabled()
    @Test()
    void getLoggerConfigurationWhenCaughtInterruptedExceptionAndLoggerIsNull() throws InterruptedException {
        /* Branches:
         * (!StringUtils.hasLength(name)) : false  #  inside getLoggerName method
         * (Logger.ROOT_LOGGER_NAME.equals(name)) : true  #  inside getLoggerName method
         * (factory instanceof SubstituteLoggerFactory) : false  #  inside getLoggerFactory method
         * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
         * (logger == null) : true  #  inside getLoggerConfiguration method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doReturn(null).when(loggerContextMock).exists("ROOT");
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            LoggerConfiguration result = target.getLoggerConfiguration("ROOT");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).exists("ROOT");
            });
        }
    }

    //Sapient generated method id: ${getSupportedLogLevelsTest}, hash: B2415538A28FC38ACDA999D068DA411A
    @Disabled()
    @Test()
    void getSupportedLogLevelsTest() {
        //Arrange Statement(s)
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
        //Act Statement(s)
        Set<LogLevel> result = target.getSupportedLogLevels();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${setLogLevelWhenCaughtInterruptedExceptionThrowsIllegalStateException}, hash: 309FD2ADAFC17706D609078F365B4D34
    @Disabled()
    @Test()
    void setLogLevelWhenCaughtInterruptedExceptionThrowsIllegalStateException() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Thread> thread = mockStatic(Thread.class)) {
            thread.when(() -> Thread.sleep(50L)).thenAnswer((Answer<Void>) invocation -> null);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.setLogLevel("loggerName1", LogLevel.TRACE);
            });
            InterruptedException interruptedException = new InterruptedException();
            IllegalStateException illegalStateException = new IllegalStateException("Interrupted while waiting for non-substitute logger factory", interruptedException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(interruptedException.getClass())));
                thread.verify(() -> Thread.sleep(50L), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${setLogLevelWhenLoggerIsNotNull}, hash: EA4B86B345FBDA27DDAB0DC8A436ACD6
    @Disabled()
    @Test()
    void setLogLevelWhenLoggerIsNotNull() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (!StringUtils.hasLength(name)) : false  #  inside getLoggerName method
         * (Logger.ROOT_LOGGER_NAME.equals(name)) : true  #  inside getLoggerName method
         * (logger != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doReturn(loggerMock).when(loggerContextMock).getLogger("ROOT");
            doNothing().when(loggerMock).setLevel((Level) null);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            target.setLogLevel("ROOT", LogLevel.FATAL);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).getLogger("ROOT");
                verify(loggerMock).setLevel((Level) null);
            });
        }
    }

    //Sapient generated method id: ${setLogLevelWhenLoggerROOT_LOGGER_NAMENotEqualsNameAndLoggerIsNull}, hash: 18B7C069F3C668DF139AC4AA65F781A5
    @Disabled()
    @Test()
    void setLogLevelWhenLoggerROOT_LOGGER_NAMENotEqualsNameAndLoggerIsNull() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (!StringUtils.hasLength(name)) : false  #  inside getLoggerName method
         * (Logger.ROOT_LOGGER_NAME.equals(name)) : false  #  inside getLoggerName method
         * (logger != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doReturn(null).when(loggerContextMock).getLogger("A");
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            target.setLogLevel("A", LogLevel.TRACE);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).getLogger("A");
            });
        }
    }

    //Sapient generated method id: ${setLogLevelWhenLoggerROOT_LOGGER_NAMEEqualsNameAndLoggerIsNotNull}, hash: B55C5D02CF4F1517B04DD16E2947F686
    @Disabled()
    @Test()
    void setLogLevelWhenLoggerROOT_LOGGER_NAMEEqualsNameAndLoggerIsNotNull() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : false  #  inside getLoggerFactory method
         * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
         * (!StringUtils.hasLength(name)) : false  #  inside getLoggerName method
         * (Logger.ROOT_LOGGER_NAME.equals(name)) : true  #  inside getLoggerName method
         * (logger != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doReturn(loggerMock).when(loggerContextMock).getLogger("ROOT");
            doNothing().when(loggerMock).setLevel((Level) null);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            target.setLogLevel("ROOT", LogLevel.FATAL);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).getLogger("ROOT");
                verify(loggerMock).setLevel((Level) null);
            });
        }
    }

    //Sapient generated method id: ${getShutdownHandlerTest}, hash: DB03B879D0A4303112E797ADC9556EC4
    @Test()
    void getShutdownHandlerTest() {
        //Arrange Statement(s)
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
        //Act Statement(s)
        Runnable result = target.getShutdownHandler();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getDefaultLogCorrelationPatternTest}, hash: 3F02044351084BBDA83573F2E5E64309
    @Test()
    void getDefaultLogCorrelationPatternTest() {
        //Arrange Statement(s)
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
        //Act Statement(s)
        String result = target.getDefaultLogCorrelationPattern();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("%correlationId")));
    }

    //Sapient generated method id: ${processAheadOfTimeWhenFactoryInstanceOfSubstituteLoggerFactory}, hash: 6685E26E7006380D286EFE5B51D05115
    @Disabled()
    @Test()
    void processAheadOfTimeWhenFactoryInstanceOfSubstituteLoggerFactory() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         */
        //Arrange Statement(s)
        BeanFactoryInitializationAotContribution beanFactoryInitializationAotContributionMock = mock(BeanFactoryInitializationAotContribution.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            doReturn(beanFactoryInitializationAotContributionMock).when(loggerContextMock).getObject("org.springframework.beans.factory.aot.BeanFactoryInitializationAotContribution");
            doNothing().when(loggerContextMock).removeObject("org.springframework.beans.factory.aot.BeanFactoryInitializationAotContribution");
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            BeanFactoryInitializationAotContribution result = target.processAheadOfTime(configurableListableBeanFactoryMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(beanFactoryInitializationAotContributionMock));
                _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
                verify(loggerContextMock, atLeast(1)).getObject("org.springframework.beans.factory.aot.BeanFactoryInitializationAotContribution");
                verify(loggerContextMock, atLeast(1)).removeObject("org.springframework.beans.factory.aot.BeanFactoryInitializationAotContribution");
            });
        }
    }

    //Sapient generated method id: ${processAheadOfTimeWhenCaughtInterruptedExceptionThrowsIllegalStateException}, hash: 3395DC34BA9B94415DADAE56AF0D79C0
    @Disabled()
    @Test()
    void processAheadOfTimeWhenCaughtInterruptedExceptionThrowsIllegalStateException() throws InterruptedException {
        /* Branches:
         * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
         * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Thread> thread = mockStatic(Thread.class)) {
            thread.when(() -> Thread.sleep(50L)).thenAnswer((Answer<Void>) invocation -> null);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.processAheadOfTime(configurableListableBeanFactoryMock);
            });
            InterruptedException interruptedException = new InterruptedException();
            IllegalStateException illegalStateException = new IllegalStateException("Interrupted while waiting for non-substitute logger factory", interruptedException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(interruptedException.getClass())));
                thread.verify(() -> Thread.sleep(50L), atLeast(1));
            });
        }
    }
}
