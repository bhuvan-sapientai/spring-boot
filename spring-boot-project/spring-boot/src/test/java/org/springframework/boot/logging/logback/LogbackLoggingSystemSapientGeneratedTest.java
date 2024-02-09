package org.springframework.boot.logging.logback;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import ch.qos.logback.core.status.StatusUtil;

import java.util.List;

import org.springframework.boot.logging.LoggerConfiguration;

import ch.qos.logback.core.status.StatusManager;
import org.slf4j.bridge.SLF4JBridgeHandler;
import ch.qos.logback.classic.LoggerContext;

import org.springframework.util.StringUtils;
import org.springframework.util.Assert;

import ch.qos.logback.core.util.StatusPrinter;

import java.util.HashSet;

import ch.qos.logback.classic.spi.TurboFilterList;

import org.springframework.boot.logging.LogLevel;

import java.util.ArrayList;

import org.springframework.util.SystemPropertyUtils;

import ch.qos.logback.classic.turbo.TurboFilter;

import org.springframework.core.env.ConfigurableEnvironment;

import org.mockito.stubbing.Answer;

import org.springframework.core.env.Environment;
import org.springframework.util.ClassUtils;
import org.springframework.boot.logging.LoggingSystemProperties;
import org.springframework.boot.logging.AbstractLoggingSystem;

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

import ch.qos.logback.classic.jul.LevelChangePropagator;

import org.springframework.beans.factory.aot.BeanFactoryInitializationAotContribution;

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
import static org.hamcrest.Matchers.containsInRelativeOrder;
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

	private final AbstractLoggingSystem.LogLevels<Level> LEVELSMock = mock(AbstractLoggingSystem.LogLevels.class, "LEVELS");

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

	private final Status statusMock = mock(Status.class);

	private final TurboFilter turboFilterMock = mock(TurboFilter.class);

	//Sapient generated method id: ${eceb816f-d978-3aaf-96bb-c7573ae181fc}
	@Test()
	void getSystemPropertiesTest() {
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
		//ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
		//Act Statement(s)
		//LoggingSystemProperties result = target.getSystemProperties(configurableEnvironmentMock);
		//Assert statement(s)
		//assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${5a1250c3-53ff-343b-84f3-94443200df8f}
	@Test()
	void getStandardConfigLocationsTest() {
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
		//Act Statement(s)
		//String[] result = target.getStandardConfigLocations();
		//String[] stringResultArray = new String[] { "logback-test.groovy", "logback-test.xml", "logback.groovy", "logback.xml" };
		//Assert statement(s)
		//assertAll("result", () -> assertThat(result, equalTo(stringResultArray)));
	}

	//Sapient generated method id: ${bf8a02e7-0c7d-32bf-80c1-2e392ca1db0d}
	@Test()
	void beforeInitializeWhenIsAlreadyInitializedLoggerContext() throws Throwable, InterruptedException {
		/* Branches:
		 * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
		 * (loggerContext.getObject(LoggingSystem.class.getName()) != null) : true  #  inside isAlreadyInitialized method
		 * (isAlreadyInitialized(loggerContext)) : true
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
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
        verify(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
    });
}*/
	}

	//Sapient generated method id: ${9936598b-e039-3d8b-a1cc-0cc406e4d927}
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
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
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
        verify(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
        verify(loggerContextMock).getTurboFilterList();
    });
}*/
	}

	//Sapient generated method id: ${3286aed6-e3c6-3e59-ae51-743cf5afe5f9}
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
        /*try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
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
        verify(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
        verify(loggerContextMock).getTurboFilterList();
        classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
    });
}*/
	}

	//Sapient generated method id: ${e82cc834-c6cc-30c4-95ed-95a0cab74f8a}
	@Test()
	void beforeInitializeWhenIsJulUsingASingleConsoleHandlerAtMostNotAndIsBridgeJulIntoSlf4jNot() throws Throwable, InterruptedException {
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
        /*try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
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
        verify(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
        verify(loggerContextMock).getTurboFilterList();
        classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
    });
}*/
	}

	//Sapient generated method id: ${262553b0-0b51-38f1-a341-dcc7325f6067}
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
        /*try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
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
        verify(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
        verify(loggerContextMock).getTurboFilterList();
        classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
    });
}*/
	}

	//Sapient generated method id: ${5e8fc60a-910c-3515-b610-906f25337b74}
	@Disabled(value = "Potential harmful system call (Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void initializeWhenCaughtInterruptedExceptionThrowsIllegalStateException() throws InterruptedException {
		/* Branches:
		 * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
		 * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Thread> thread = mockStatic(Thread.class)) {
    InterruptedException interruptedException = new InterruptedException();
    thread.when(() -> Thread.sleep(50L)).thenThrow(interruptedException);
    ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
    LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
    //Act Statement(s)
    final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
        target.initialize(loggingInitializationContextMock, "configLocation1", logFileMock);
    });
    IllegalStateException illegalStateException = new IllegalStateException("Interrupted while waiting for non-substitute logger factory", interruptedException);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(notNullValue()));
        assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        assertThat(result.getCause(), is(instanceOf(interruptedException.getClass())));
        thread.verify(() -> Thread.sleep(50L), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${6074f47b-b019-30b8-9a05-39ab6783b874}
	@Test()
	void initializeWhenIsAlreadyInitializedLoggerContext() throws InterruptedException {
		/* Branches:
		 * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
		 * (loggerContext.getObject(LoggingSystem.class.getName()) != null) : true  #  inside isAlreadyInitialized method
		 * (isAlreadyInitialized(loggerContext)) : true
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
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
        verify(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
    });
}*/
	}

	//Sapient generated method id: ${c1e9447e-a5aa-3c81-ac1d-50bcf61420d4}
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
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
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
        verify(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
    });
}*/
	}

	//Sapient generated method id: ${e75d8ce2-3f76-337d-b909-dd7ece5e6b68}
	@Disabled(value = "Potential harmful system call (Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
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
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Thread> thread = mockStatic(Thread.class);
    MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    doReturn(environmentMock).when(initializationContextMock).getEnvironment();
    _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    doReturn(null).when(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
    doNothing().when(loggerContextMock).putObject("org.springframework.core.env.Environment", environmentMock);
    TurboFilterList turboFilterList = new TurboFilterList();
    turboFilterList.add(turboFilterMock);
    doReturn(turboFilterList).when(loggerContextMock).getTurboFilterList();
    doNothing().when(loggerContextMock).putObject(eq("org.springframework.boot.logging.LoggingSystem"), (Object) any());
    thread.when(() -> Thread.sleep(50L)).thenAnswer((Answer<Void>) invocation -> null);
    ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
    LogbackLoggingSystem target = spy(new LogbackLoggingSystem(classLoader));
    doNothing().when(target).loadConfiguration(initializationContextMock, "A", logFileMock);
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
        verify(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
        verify(loggerContextMock).putObject("org.springframework.core.env.Environment", environmentMock);
        verify(loggerContextMock).getTurboFilterList();
        verify(loggerContextMock).putObject(eq("org.springframework.boot.logging.LoggingSystem"), (Object) any());
        thread.verify(() -> Thread.sleep(50L), atLeast(1));
        verify(target).loadConfiguration(initializationContextMock, "A", logFileMock);
    });
}*/
	}

	//Sapient generated method id: ${e03c28c7-226e-3d37-974f-c589555e59e0}
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
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    doReturn(environmentMock).when(initializationContextMock).getEnvironment();
    _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    doReturn(null).when(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
    doNothing().when(loggerContextMock).putObject("org.springframework.core.env.Environment", environmentMock);
    TurboFilterList turboFilterList = new TurboFilterList();
    turboFilterList.add(turboFilterMock);
    doReturn(turboFilterList).when(loggerContextMock).getTurboFilterList();
    doNothing().when(loggerContextMock).putObject(eq("org.springframework.boot.logging.LoggingSystem"), (Object) any());
    _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    doReturn(loggerMock).when(loggerContextMock2).getLogger("org.springframework.boot.logging.logback.LogbackLoggingSystem");
    doNothing().when(loggerMock).warn("Ignoring 'logback.configurationFile' system property. Please use 'logging.config' instead.");
    ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
    LogbackLoggingSystem target = spy(new LogbackLoggingSystem(classLoader));
    doNothing().when(target).loadConfiguration(initializationContextMock, "A", logFileMock);
    //Act Statement(s)
    target.initialize(initializationContextMock, "A", logFileMock);
    //Assert statement(s)
    assertAll("result", () -> {
        verify(initializationContextMock).getEnvironment();
        _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
        verify(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
        verify(loggerContextMock).putObject("org.springframework.core.env.Environment", environmentMock);
        verify(loggerContextMock).getTurboFilterList();
        verify(loggerContextMock).putObject(eq("org.springframework.boot.logging.LoggingSystem"), (Object) any());
        _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any()));
        verify(loggerContextMock2).getLogger("org.springframework.boot.logging.logback.LogbackLoggingSystem");
        verify(loggerMock).warn("Ignoring 'logback.configurationFile' system property. Please use 'logging.config' instead.");
        verify(target).loadConfiguration(initializationContextMock, "A", logFileMock);
    });
}*/
	}

	//Sapient generated method id: ${5c5617be-5e6f-31a6-9fe2-c0b5b7a3cdd6}
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
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    doReturn(environmentMock).when(initializationContextMock).getEnvironment();
    _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    doReturn(null).when(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
    doNothing().when(loggerContextMock).putObject("org.springframework.core.env.Environment", environmentMock);
    TurboFilterList turboFilterList = new TurboFilterList();
    turboFilterList.add(turboFilterMock);
    doReturn(turboFilterList).when(loggerContextMock).getTurboFilterList();
    doNothing().when(loggerContextMock).putObject(eq("org.springframework.boot.logging.LoggingSystem"), (Object) any());
    _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    doReturn(loggerMock).when(loggerContextMock2).getLogger("org.springframework.boot.logging.logback.LogbackLoggingSystem");
    doNothing().when(loggerMock).warn("Ignoring 'logback.configurationFile' system property. Please use 'logging.config' instead.");
    ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
    LogbackLoggingSystem target = spy(new LogbackLoggingSystem(classLoader));
    doNothing().when(target).loadConfiguration(initializationContextMock, "A", logFileMock);
    //Act Statement(s)
    target.initialize(initializationContextMock, "A", logFileMock);
    //Assert statement(s)
    assertAll("result", () -> {
        verify(initializationContextMock).getEnvironment();
        _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
        verify(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
        verify(loggerContextMock).putObject("org.springframework.core.env.Environment", environmentMock);
        verify(loggerContextMock).getTurboFilterList();
        verify(loggerContextMock).putObject(eq("org.springframework.boot.logging.LoggingSystem"), (Object) any());
        _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any()));
        verify(loggerContextMock2).getLogger("org.springframework.boot.logging.logback.LogbackLoggingSystem");
        verify(loggerMock).warn("Ignoring 'logback.configurationFile' system property. Please use 'logging.config' instead.");
        verify(target).loadConfiguration(initializationContextMock, "A", logFileMock);
    });
}*/
	}

	//Sapient generated method id: ${cd0d0ecc-0b73-387c-9274-d35fee5ada40}
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
			turboFilterList.add(turboFilterMock);
			doReturn(turboFilterList).when(loggerContextMock).getTurboFilterList();
			doNothing().when(loggerContextMock).putObject(eq("org.springframework.boot.logging.LoggingSystem"), (Object) any());
			stringUtils.when(() -> StringUtils.hasLength("A")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasText("B")).thenReturn(false);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
			LogFile logFile = null;
			//Act Statement(s)
			target.initialize(initializationContextMock, "A", logFile);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(initializationContextMock).getEnvironment();
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
				verify(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
				verify(loggerContextMock).putObject("org.springframework.core.env.Environment", environmentMock);
				verify(loggerContextMock).getTurboFilterList();
				verify(loggerContextMock).putObject(eq("org.springframework.boot.logging.LoggingSystem"), (Object) any());
				stringUtils.verify(() -> StringUtils.hasLength("A"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasText("B"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${d42ef16c-9441-3c94-9e8d-2aad6822998a}
	@Test()
	void initializeWhenILessThanLocationsLengthThrowsNullPointerException() {
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
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
    MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    doReturn(null).when(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
    stringUtils.when(() -> StringUtils.hasLength("A")).thenReturn(false);
    stringUtils.when(() -> StringUtils.getFilenameExtension((Object) null)).thenReturn("return_of_getFilenameExtension1");
    ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
    LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
    //Act Statement(s)
    final NullPointerException result = assertThrows(NullPointerException.class, () -> {
        target.initialize(loggingInitializationContextMock, "A", logFileMock);
    });
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(notNullValue()));
        _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
        verify(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
        stringUtils.verify(() -> StringUtils.hasLength("A"), atLeast(1));
        stringUtils.verify(() -> StringUtils.getFilenameExtension((Object) null), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${073793e5-342c-3166-b640-8cdae1a7876f}
	@Test()
	void initializeWhenINotLessThanLocationsLengthAndConfigIsNotNullAndStringUtilsNotHasTextSystemGetPropertyCONFIGURATION_FILE_() throws InterruptedException {
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
		 * (i < locations.length) : false  #  inside getSpringConfigLocations method
		 * (config != null) : true  #  inside initializeWithConventions method
		 * (StringUtils.hasText(System.getProperty(CONFIGURATION_FILE_PROPERTY))) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
    MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    doReturn(environmentMock).when(initializationContextMock).getEnvironment();
    _assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    doReturn(null).when(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
    doNothing().when(loggerContextMock).putObject("org.springframework.core.env.Environment", environmentMock);
    TurboFilterList turboFilterList = new TurboFilterList();
    turboFilterList.add(turboFilterMock);
    doReturn(turboFilterList).when(loggerContextMock).getTurboFilterList();
    doNothing().when(loggerContextMock).putObject(eq("org.springframework.boot.logging.LoggingSystem"), (Object) any());
    stringUtils.when(() -> StringUtils.hasLength("A")).thenReturn(false);
    stringUtils.when(() -> StringUtils.hasText("C")).thenReturn(false);
    ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
    LogbackLoggingSystem target = spy(new LogbackLoggingSystem(classLoader));
    doNothing().when(target).loadConfiguration(initializationContextMock, "classpath:B", logFileMock);
    //Act Statement(s)
    target.initialize(initializationContextMock, "A", logFileMock);
    //Assert statement(s)
    assertAll("result", () -> {
        verify(initializationContextMock).getEnvironment();
        _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
        verify(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
        verify(loggerContextMock).putObject("org.springframework.core.env.Environment", environmentMock);
        verify(loggerContextMock).getTurboFilterList();
        verify(loggerContextMock).putObject(eq("org.springframework.boot.logging.LoggingSystem"), (Object) any());
        stringUtils.verify(() -> StringUtils.hasLength("A"), atLeast(1));
        stringUtils.verify(() -> StringUtils.hasText("C"), atLeast(1));
        verify(target).loadConfiguration(initializationContextMock, "classpath:B", logFileMock);
    });
}*/
	}

	//Sapient generated method id: ${766d73ff-5c3b-35c0-8104-220aa1f66942}
	@Test()
	void initializeWhenConfigIsNullAndStringUtilsNotHasTextSystemGetPropertyCONFIGURATION_FILE_PROPERTY2() throws InterruptedException {
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
		 * (i < locations.length) : false  #  inside getSpringConfigLocations method
		 * (config != null) : false  #  inside initializeWithConventions method
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
			turboFilterList.add(turboFilterMock);
			doReturn(turboFilterList).when(loggerContextMock).getTurboFilterList();
			doNothing().when(loggerContextMock).putObject(eq("org.springframework.boot.logging.LoggingSystem"), (Object) any());
			stringUtils.when(() -> StringUtils.hasLength("A")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasText("B")).thenReturn(false);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			LogbackLoggingSystem target = spy(new LogbackLoggingSystem(classLoader));
			doNothing().when(target).loadDefaults(initializationContextMock, logFileMock);
			//Act Statement(s)
			target.initialize(initializationContextMock, "A", logFileMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(initializationContextMock).getEnvironment();
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
				verify(loggerContextMock).getObject("org.springframework.boot.logging.LoggingSystem");
				verify(loggerContextMock).putObject("org.springframework.core.env.Environment", environmentMock);
				verify(loggerContextMock).getTurboFilterList();
				verify(loggerContextMock).putObject(eq("org.springframework.boot.logging.LoggingSystem"), (Object) any());
				stringUtils.verify(() -> StringUtils.hasLength("A"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasText("B"), atLeast(1));
				verify(target).loadDefaults(initializationContextMock, logFileMock);
			});
		}
	}

	//Sapient generated method id: ${d5509ef4-490f-3698-a557-70616950efe7}
	@Disabled(value = "Potential harmful system call (Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void loadDefaultsWhenCaughtInterruptedExceptionThrowsIllegalStateException() throws InterruptedException {
		/* Branches:
		 * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
		 * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Thread> thread = mockStatic(Thread.class)) {
			InterruptedException interruptedException = new InterruptedException();
			thread.when(() -> Thread.sleep(50L)).thenThrow(interruptedException);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.loadDefaults(loggingInitializationContextMock, logFileMock);
			});
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

	//Sapient generated method id: ${12167949-2d58-39f2-b1ef-c87ed739de97}
	@Disabled(value = "Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void loadDefaultsWhenIsBridgeHandlerInstalledNot() throws InterruptedException {
		/* Branches:
		 * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
		 * (ClassUtils.isPresent(BRIDGE_HANDLER, getClassLoader())) : false  #  inside isBridgeHandlerAvailable method
		 * (!isBridgeHandlerAvailable()) : true  #  inside isBridgeHandlerInstalled method
		 * (isBridgeHandlerInstalled()) : false  #  inside stopAndReset method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			doNothing().when(loggerContextMock).stop();
			doNothing().when(loggerContextMock).reset();
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
				verify(loggerContextMock).stop();
				verify(loggerContextMock).reset();
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any()));
				verify(loggerContextMock2).getTurboFilterList();
			});
		}
	}

	//Sapient generated method id: ${397e7fa8-8443-3b79-9a8e-c31484e0dd1c}
	@Disabled(value = "Potential harmful system call (Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void loadDefaultsWhenIsBridgeHandlerInstalledNotAndCaughtInterruptedExceptionThrowsIllegalStateException() throws InterruptedException {
		/* Branches:
		 * (factory instanceof SubstituteLoggerFactory) : false  #  inside getLoggerFactory method
		 * (ClassUtils.isPresent(BRIDGE_HANDLER, getClassLoader())) : false  #  inside isBridgeHandlerAvailable method
		 * (!isBridgeHandlerAvailable()) : true  #  inside isBridgeHandlerInstalled method
		 * (isBridgeHandlerInstalled()) : false  #  inside stopAndReset method
		 * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Thread> thread = mockStatic(Thread.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			doNothing().when(loggerContextMock).stop();
			doNothing().when(loggerContextMock).reset();
			classUtils.when(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any())).thenReturn(false);
			InterruptedException interruptedException = new InterruptedException();
			thread.when(() -> Thread.sleep(50L)).thenThrow(interruptedException);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.loadDefaults(loggingInitializationContextMock, logFileMock);
			});
			IllegalStateException illegalStateException = new IllegalStateException("Interrupted while waiting for non-substitute logger factory", interruptedException);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(interruptedException.getClass())));
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
				verify(loggerContextMock).stop();
				verify(loggerContextMock).reset();
				classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
				thread.verify(() -> Thread.sleep(50L), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${58cd3cec-8b01-3cd0-b487-a5568bd8fb20}
	@Disabled(value = "Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
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
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			_assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			doNothing().when(loggerContextMock).stop();
			doNothing().when(loggerContextMock).reset();
			doNothing().when(loggerContextMock).addListener((LevelChangePropagator) any());
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
				verify(loggerContextMock).stop();
				verify(loggerContextMock).reset();
				verify(loggerContextMock).addListener((LevelChangePropagator) any());
				classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any()));
				verify(loggerContextMock2).getTurboFilterList();
			});
		}
	}

	//Sapient generated method id: ${da33490c-8a19-3b3b-9b7c-a38eac78fe40}
	@Disabled(value = "Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
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
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
				verify(loggerContextMock).stop();
				verify(loggerContextMock).reset();
				classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any()));
				verify(loggerContextMock2).getTurboFilterList();
			});
		}
	}

	//Sapient generated method id: ${7be44a43-4f44-3b8c-8fa2-3a48d598384a}
	@Disabled(value = "Potential harmful system call (Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void loadConfigurationWhenCaughtInterruptedExceptionThrowsIllegalStateException() throws InterruptedException {
		/* Branches:
		 * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
		 * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Thread> thread = mockStatic(Thread.class)) {
			InterruptedException interruptedException = new InterruptedException();
			thread.when(() -> Thread.sleep(50L)).thenThrow(interruptedException);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.loadConfiguration(loggingInitializationContextMock, "location1", logFileMock);
			});
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

	//Sapient generated method id: ${8e1719e6-3158-3596-b3c1-bfd5eefc345e}
	@Disabled(value = "Potential harmful system call (Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void loadConfigurationWhenIsBridgeHandlerInstalledNotAndCaughtInterruptedExceptionThrowsIllegalStateException() throws InterruptedException {
		/* Branches:
		 * (factory instanceof SubstituteLoggerFactory) : false  #  inside getLoggerFactory method
		 * (ClassUtils.isPresent(BRIDGE_HANDLER, getClassLoader())) : false  #  inside isBridgeHandlerAvailable method
		 * (!isBridgeHandlerAvailable()) : true  #  inside isBridgeHandlerInstalled method
		 * (isBridgeHandlerInstalled()) : false  #  inside stopAndReset method
		 * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Thread> thread = mockStatic(Thread.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			doNothing().when(loggerContextMock).stop();
			doNothing().when(loggerContextMock).reset();
			classUtils.when(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any())).thenReturn(false);
			InterruptedException interruptedException = new InterruptedException();
			thread.when(() -> Thread.sleep(50L)).thenThrow(interruptedException);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.loadConfiguration(loggingInitializationContextMock, "location1", logFileMock);
			});
			IllegalStateException illegalStateException = new IllegalStateException("Interrupted while waiting for non-substitute logger factory", interruptedException);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(interruptedException.getClass())));
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
				verify(loggerContextMock).stop();
				verify(loggerContextMock).reset();
				classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
				thread.verify(() -> Thread.sleep(50L), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${d344b528-b636-31fd-b338-8cc9d7f03b86}
	@Disabled(value = "Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void loadConfigurationWhenErrorsNotIsEmptyThrowsIllegalStateException() {
		/* Branches:
		 * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
		 * (ClassUtils.isPresent(BRIDGE_HANDLER, getClassLoader())) : false  #  inside isBridgeHandlerAvailable method
		 * (!isBridgeHandlerAvailable()) : true  #  inside isBridgeHandlerInstalled method
		 * (isBridgeHandlerInstalled()) : false  #  inside stopAndReset method
		 * (for-each(loggerContext.getStatusManager().getCopyOfStatusList())) : false  #  inside reportConfigurationErrorsIfNecessary method
		 * (errors.isEmpty()) : false  #  inside reportConfigurationErrorsIfNecessary method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
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
    ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
    LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
    //Act Statement(s)
    final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
        target.loadConfiguration(loggingInitializationContextMock, "location1", logFileMock);
    });
    IllegalStateException illegalStateException = new IllegalStateException("Logback configuration error detected: \nnull");
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(notNullValue()));
        assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
        verify(loggerContextMock).stop();
        verify(loggerContextMock).reset();
        verify(loggerContextMock).getStatusManager();
        verify(statusManagerMock).getCopyOfStatusList();
        classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
        _assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any()));
        verify(loggerContextMock2).getTurboFilterList();
    });
}*/
	}

	//Sapient generated method id: ${251bc3bc-ecba-32c0-9d02-1434bc7f2b89}
	@Disabled(value = "Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void loadConfigurationWhenLoggerContextGetStatusManagerGetCopyOfStatusListIsEmptyAndErrorsNotIsEm4ThrowsIllegalStateException() {
		/* Branches:
		 * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
		 * (ClassUtils.isPresent(BRIDGE_HANDLER, getClassLoader())) : true  #  inside isBridgeHandlerAvailable method
		 * (!isBridgeHandlerAvailable()) : false  #  inside isBridgeHandlerInstalled method
		 * (handlers.length == 1) : true  #  inside isBridgeHandlerInstalled method
		 * (handlers[0] instanceof SLF4JBridgeHandler) : false  #  inside isBridgeHandlerInstalled method
		 * (isBridgeHandlerInstalled()) : false  #  inside stopAndReset method
		 * (for-each(loggerContext.getStatusManager().getCopyOfStatusList())) : false  #  inside reportConfigurationErrorsIfNecessary method
		 * (errors.isEmpty()) : false  #  inside reportConfigurationErrorsIfNecessary method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
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
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.loadConfiguration(loggingInitializationContextMock, "location1", logFileMock);
			});
			IllegalStateException illegalStateException = new IllegalStateException("Logback configuration error detected: \nnull");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
				verify(loggerContextMock).stop();
				verify(loggerContextMock).reset();
				verify(loggerContextMock).getStatusManager();
				verify(statusManagerMock).getCopyOfStatusList();
				classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any()));
				verify(loggerContextMock2).getTurboFilterList();
			});
		}
	}

	//Sapient generated method id: ${3a2b0d48-520b-3a35-80af-0c33b1bf7509}
	@Disabled(value = "Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void loadConfigurationWhenStatusGetThrowableIsNotNullAndErrorsNotIsEmptyThrowsIllegalStateException() {
		/* Branches:
		 * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
		 * (ClassUtils.isPresent(BRIDGE_HANDLER, getClassLoader())) : true  #  inside isBridgeHandlerAvailable method
		 * (!isBridgeHandlerAvailable()) : false  #  inside isBridgeHandlerInstalled method
		 * (handlers.length == 1) : true  #  inside isBridgeHandlerInstalled method
		 * (handlers[0] instanceof SLF4JBridgeHandler) : true  #  inside isBridgeHandlerInstalled method
		 * (isBridgeHandlerInstalled()) : true  #  inside stopAndReset method
		 * (for-each(loggerContext.getStatusManager().getCopyOfStatusList())) : true  #  inside reportConfigurationErrorsIfNecessary method
		 * (status.getLevel() == Status.ERROR) : true  #  inside reportConfigurationErrorsIfNecessary method
		 * (!errors.isEmpty()) : true  #  inside reportConfigurationErrorsIfNecessary method
		 * (status.getThrowable() != null) : true  #  inside reportConfigurationErrorsIfNecessary method
		 * (errors.isEmpty()) : false  #  inside reportConfigurationErrorsIfNecessary method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			_assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			doNothing().when(loggerContextMock).stop();
			doNothing().when(loggerContextMock).reset();
			doNothing().when(loggerContextMock).addListener((LevelChangePropagator) any());
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
			IllegalStateException illegalStateException = new IllegalStateException("Logback configuration error detected: \nnull");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
				verify(loggerContextMock).stop();
				verify(loggerContextMock).reset();
				verify(loggerContextMock).addListener((LevelChangePropagator) any());
				verify(loggerContextMock).getStatusManager();
				verify(statusManagerMock).getCopyOfStatusList();
				verify(statusMock).getLevel();
				verify(statusMock, times(2)).getThrowable();
				classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any()));
				verify(loggerContextMock2).getTurboFilterList();
			});
		}
	}

	//Sapient generated method id: ${f4dc924e-2e14-387a-ae43-fd340e01c684}
	@Disabled(value = "Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void loadConfigurationWhenErrorsIsEmptyAndStatusGetThrowableIsNotNullAndErrorsNotIsEmptyThrowsIllegalStateException() {
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
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			_assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			doNothing().when(loggerContextMock).stop();
			doNothing().when(loggerContextMock).reset();
			doNothing().when(loggerContextMock).addListener((LevelChangePropagator) any());
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
			IllegalStateException illegalStateException = new IllegalStateException("Logback configuration error detected: \nnull");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
				verify(loggerContextMock).stop();
				verify(loggerContextMock).reset();
				verify(loggerContextMock).addListener((LevelChangePropagator) any());
				verify(loggerContextMock).getStatusManager();
				verify(statusManagerMock).getCopyOfStatusList();
				verify(statusMock).getLevel();
				verify(statusMock, times(2)).getThrowable();
				classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any()));
				verify(loggerContextMock2).getTurboFilterList();
			});
		}
	}

	//Sapient generated method id: ${bea76920-8405-31ba-bdbb-2a0e8651c210}
	@Disabled(value = "Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
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
		 * (!errors.isEmpty()) : true  #  inside reportConfigurationErrorsIfNecessary method
		 * (status.getThrowable() != null) : true  #  inside reportConfigurationErrorsIfNecessary method
		 * (errors.isEmpty()) : true  #  inside reportConfigurationErrorsIfNecessary method
		 * (!StatusUtil.contextHasStatusListener(loggerContext)) : true  #  inside reportConfigurationErrorsIfNecessary method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			statusList.add(statusMock);
			doReturn(statusList).when(statusManagerMock).getCopyOfStatusList();
			doReturn(2).when(statusMock).getLevel();
			Throwable throwable = new Throwable();
			Throwable throwable2 = new Throwable();
			doReturn(throwable, throwable2).when(statusMock).getThrowable();
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
				verify(loggerContextMock).stop();
				verify(loggerContextMock).reset();
				verify(loggerContextMock).getStatusManager();
				verify(statusManagerMock).getCopyOfStatusList();
				verify(statusMock).getLevel();
				verify(statusMock, times(2)).getThrowable();
				classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any()));
				verify(loggerContextMock2).getTurboFilterList();
				statusUtil.verify(() -> StatusUtil.contextHasStatusListener(loggerContextMock), atLeast(1));
				statusPrinter.verify(() -> StatusPrinter.printInCaseOfErrorsOrWarnings(loggerContextMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${ca7b2454-c297-3479-8209-40ef626e5798}
	@Disabled(value = "Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
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
		 * (!errors.isEmpty()) : true  #  inside reportConfigurationErrorsIfNecessary method
		 * (status.getThrowable() != null) : true  #  inside reportConfigurationErrorsIfNecessary method
		 * (errors.isEmpty()) : true  #  inside reportConfigurationErrorsIfNecessary method
		 * (!StatusUtil.contextHasStatusListener(loggerContext)) : true  #  inside reportConfigurationErrorsIfNecessary method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doNothing().when(loggerContextMock).addListener((LevelChangePropagator) any());
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
			statusUtil.when(() -> StatusUtil.contextHasStatusListener(loggerContextMock)).thenReturn(false);
			statusPrinter.when(() -> StatusPrinter.printInCaseOfErrorsOrWarnings(loggerContextMock)).thenAnswer((Answer<Void>) invocation -> null);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
			//Act Statement(s)
			target.loadConfiguration(loggingInitializationContextMock, "location1", logFileMock);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
				verify(loggerContextMock).stop();
				verify(loggerContextMock).reset();
				verify(loggerContextMock).addListener((LevelChangePropagator) any());
				verify(loggerContextMock).getStatusManager();
				verify(statusManagerMock).getCopyOfStatusList();
				verify(statusMock).getLevel();
				verify(statusMock, times(2)).getThrowable();
				classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any()));
				verify(loggerContextMock2).getTurboFilterList();
				statusUtil.verify(() -> StatusUtil.contextHasStatusListener(loggerContextMock), atLeast(1));
				statusPrinter.verify(() -> StatusPrinter.printInCaseOfErrorsOrWarnings(loggerContextMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${6e89072e-1d79-3367-a5a6-d02262c04f5d}
	@Disabled(value = "Potential harmful system call (Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void cleanUpWhenCaughtInterruptedExceptionThrowsIllegalStateException() throws InterruptedException {
		/* Branches:
		 * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
		 * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Thread> thread = mockStatic(Thread.class)) {
			InterruptedException interruptedException = new InterruptedException();
			thread.when(() -> Thread.sleep(50L)).thenThrow(interruptedException);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.cleanUp();
			});
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

	//Sapient generated method id: ${8195bcb3-00c1-3f8b-a65d-867c8e47886c}
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
			turboFilterList.add(turboFilterMock);
			doReturn(turboFilterList).when(loggerContextMock).getTurboFilterList();
			classUtils.when(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any())).thenReturn(false);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
			//Act Statement(s)
			target.cleanUp();
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
				verify(loggerContextMock).removeObject("org.springframework.boot.logging.LoggingSystem");
				verify(loggerContextMock).getStatusManager();
				verify(statusManagerMock).clear();
				verify(loggerContextMock).getTurboFilterList();
				classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
			});
		}
	}

	//Sapient generated method id: ${053aa2ee-0437-33e1-8691-f2e18fb61740}
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
			turboFilterList.add(turboFilterMock);
			doReturn(turboFilterList).when(loggerContextMock).getTurboFilterList();
			classUtils.when(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any())).thenReturn(true);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
			//Act Statement(s)
			target.cleanUp();
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
				verify(loggerContextMock).removeObject("org.springframework.boot.logging.LoggingSystem");
				verify(loggerContextMock).getStatusManager();
				verify(statusManagerMock).clear();
				verify(loggerContextMock).getTurboFilterList();
				classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
			});
		}
	}

	//Sapient generated method id: ${a8a52824-d33f-356d-ae04-a70a1fb42d88}
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
			turboFilterList.add(turboFilterMock);
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
				verify(loggerContextMock).removeObject("org.springframework.boot.logging.LoggingSystem");
				verify(loggerContextMock).getStatusManager();
				verify(statusManagerMock).clear();
				verify(loggerContextMock).getTurboFilterList();
				classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
				sLF4JBridgeHandler.verify(() -> SLF4JBridgeHandler.uninstall(), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${7726e338-88d9-35b1-b8cd-07ea2f3cf83c}
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
			turboFilterList.add(turboFilterMock);
			doReturn(turboFilterList).when(loggerContextMock).getTurboFilterList();
			classUtils.when(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any())).thenReturn(true);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
			//Act Statement(s)
			target.cleanUp();
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
				verify(loggerContextMock).removeObject("org.springframework.boot.logging.LoggingSystem");
				verify(loggerContextMock).getStatusManager();
				verify(statusManagerMock).clear();
				verify(loggerContextMock).getTurboFilterList();
				classUtils.verify(() -> ClassUtils.isPresent(eq("org.slf4j.bridge.SLF4JBridgeHandler"), (ClassLoader) any()));
			});
		}
	}

	//Sapient generated method id: ${55090278-b85c-3926-8cad-3f1a3ba1ee75}
	@Disabled(value = "Potential harmful system call (Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void reinitializeWhenCaughtInterruptedExceptionThrowsIllegalStateException() throws InterruptedException {
		/* Branches:
		 * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
		 * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Thread> thread = mockStatic(Thread.class)) {
			InterruptedException interruptedException = new InterruptedException();
			thread.when(() -> Thread.sleep(50L)).thenThrow(interruptedException);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.reinitialize(loggingInitializationContextMock);
			});
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

	//Sapient generated method id: ${0a1dc496-71db-363c-8b41-7e9e446d23b9}
	@Disabled(value = "Potential harmful system call (Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void reinitializeWhenFactoryNotInstanceOfSubstituteLoggerFactoryAndCaughtInterruptedExceptionThrowsIllegalStateException() throws InterruptedException {
		/* Branches:
		 * (factory instanceof SubstituteLoggerFactory) : false  #  inside getLoggerFactory method
		 * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Thread> thread = mockStatic(Thread.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			doNothing().when(loggerContextMock).reset();
			InterruptedException interruptedException = new InterruptedException();
			thread.when(() -> Thread.sleep(50L)).thenThrow(interruptedException);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.reinitialize(loggingInitializationContextMock);
			});
			IllegalStateException illegalStateException = new IllegalStateException("Interrupted while waiting for non-substitute logger factory", interruptedException);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(interruptedException.getClass())));
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
				verify(loggerContextMock).reset();
				thread.verify(() -> Thread.sleep(50L), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${5bef1962-4a6c-37de-a326-c01b67d29174}
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
			doNothing().when(target).loadConfiguration(loggingInitializationContextMock, "classpath:null", (LogFile) null);
			//Act Statement(s)
			target.reinitialize(loggingInitializationContextMock);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
				verify(loggerContextMock).reset();
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any()));
				verify(loggerContextMock2).getStatusManager();
				verify(statusManagerMock).clear();
				verify(target).loadConfiguration(loggingInitializationContextMock, "classpath:null", (LogFile) null);
			});
		}
	}

	//Sapient generated method id: ${a89499c1-99ad-35a5-be40-c0fc6f73241c}
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
				verify(loggerContextMock).reset();
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock2), (Supplier) any()));
				verify(loggerContextMock2).getStatusManager();
				verify(statusManagerMock).clear();
				verify(target).loadConfiguration(loggingInitializationContextMock, (String) null, (LogFile) null);
			});
		}
	}

	//Sapient generated method id: ${bda6ba1b-543e-353b-a01b-f489564c3c81}
	@Disabled(value = "Potential harmful system call (Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void getLoggerConfigurationsWhenCaughtInterruptedExceptionThrowsIllegalStateException() throws InterruptedException {
		/* Branches:
		 * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
		 * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Thread> thread = mockStatic(Thread.class)) {
			InterruptedException interruptedException = new InterruptedException();
			thread.when(() -> Thread.sleep(50L)).thenThrow(interruptedException);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.getLoggerConfigurations();
			});
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

	//Sapient generated method id: ${06af47b6-1465-3e85-87a0-db3ef6abe182}
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
			List<LoggerConfiguration> loggerConfigurationResultList = new ArrayList<>();
			loggerConfigurationResultList.add((LoggerConfiguration) null);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(loggerConfigurationResultList.size()));
				assertThat(result, containsInRelativeOrder(loggerConfigurationResultList.toArray()));
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
				verify(loggerContextMock).getLoggerList();
			});
		}
	}

	//Sapient generated method id: ${7cc4b090-22c2-3172-b5c8-5422dd9f1b0a}
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
		Logger loggerMock = mock(Logger.class, "<value>");
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			List<Logger> loggerList = new ArrayList<>();
			loggerList.add(loggerMock);
			doReturn(loggerList).when(loggerContextMock).getLoggerList();
			doReturn(levelMock).when(loggerMock).getLevel();
			doReturn(levelMock2).when(loggerMock).getEffectiveLevel();
			doReturn("A").when(loggerMock).getName();
			stringUtils.when(() -> StringUtils.hasLength("A")).thenReturn(false);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
			doReturn(LogLevel.TRACE).when(LEVELSMock).convertNativeToSystem(levelMock);
			doReturn(LogLevel.TRACE).when(LEVELSMock).convertNativeToSystem(levelMock2);
			//Act Statement(s)
			List<LoggerConfiguration> result = target.getLoggerConfigurations();
			LoggerConfiguration loggerConfiguration = new LoggerConfiguration("ROOT", LogLevel.TRACE, LogLevel.TRACE);
			List<LoggerConfiguration> loggerConfigurationResultList = new ArrayList<>();
			loggerConfigurationResultList.add(loggerConfiguration);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(loggerConfigurationResultList.size()));
				assertThat(result, containsInRelativeOrder(loggerConfigurationResultList.toArray()));
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
				verify(loggerContextMock).getLoggerList();
				verify(loggerMock).getLevel();
				verify(loggerMock).getEffectiveLevel();
				verify(loggerMock).getName();
				stringUtils.verify(() -> StringUtils.hasLength("A"), atLeast(1));
				verify(LEVELSMock).convertNativeToSystem(levelMock);
				verify(LEVELSMock).convertNativeToSystem(levelMock2);
			});
		}
	}

	//Sapient generated method id: ${b16f55ec-9f61-32d0-98df-0c9b1b377f12}
	@Test()
	void getLoggerConfigurationsWhenLoggerROOT_LOGGER_NAMEEqualsName() throws InterruptedException {
		/* Branches:
		 * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
		 * (for-each(getLoggerContext().getLoggerList())) : true
		 * (logger == null) : false  #  inside getLoggerConfiguration method
		 * (!StringUtils.hasLength(name)) : false  #  inside getLoggerName method
		 * (Logger.ROOT_LOGGER_NAME.equals(name)) : true  #  inside getLoggerName method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(LogLevel.TRACE).when(LEVELSMock).convertNativeToSystem(levelMock);
			doReturn(LogLevel.TRACE).when(LEVELSMock).convertNativeToSystem(levelMock2);
			//Act Statement(s)
			List<LoggerConfiguration> result = target.getLoggerConfigurations();
			LoggerConfiguration loggerConfiguration = new LoggerConfiguration("ROOT", LogLevel.TRACE, LogLevel.TRACE);
			List<LoggerConfiguration> loggerConfigurationResultList = new ArrayList<>();
			loggerConfigurationResultList.add(loggerConfiguration);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(loggerConfigurationResultList.size()));
				assertThat(result, containsInRelativeOrder(loggerConfigurationResultList.toArray()));
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
				verify(loggerContextMock).getLoggerList();
				verify(loggerMock).getLevel();
				verify(loggerMock).getEffectiveLevel();
				verify(loggerMock).getName();
				verify(LEVELSMock).convertNativeToSystem(levelMock);
				verify(LEVELSMock).convertNativeToSystem(levelMock2);
			});
		}
	}

	//Sapient generated method id: ${a3559119-f06b-3214-ab2c-9a21a49b8f39}
	@Test()
	void getLoggerConfigurationsWhenLoggerROOT_LOGGER_NAMENotEqualsName() throws InterruptedException {
		/* Branches:
		 * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
		 * (for-each(getLoggerContext().getLoggerList())) : true
		 * (logger == null) : false  #  inside getLoggerConfiguration method
		 * (!StringUtils.hasLength(name)) : false  #  inside getLoggerName method
		 * (Logger.ROOT_LOGGER_NAME.equals(name)) : false  #  inside getLoggerName method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(LogLevel.TRACE).when(LEVELSMock).convertNativeToSystem(levelMock);
			doReturn(LogLevel.TRACE).when(LEVELSMock).convertNativeToSystem(levelMock2);
			//Act Statement(s)
			List<LoggerConfiguration> result = target.getLoggerConfigurations();
			LoggerConfiguration loggerConfiguration = new LoggerConfiguration("A", LogLevel.TRACE, LogLevel.TRACE);
			List<LoggerConfiguration> loggerConfigurationResultList = new ArrayList<>();
			loggerConfigurationResultList.add(loggerConfiguration);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(loggerConfigurationResultList.size()));
				assertThat(result, containsInRelativeOrder(loggerConfigurationResultList.toArray()));
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
				verify(loggerContextMock).getLoggerList();
				verify(loggerMock).getLevel();
				verify(loggerMock).getEffectiveLevel();
				verify(loggerMock).getName();
				verify(LEVELSMock).convertNativeToSystem(levelMock);
				verify(LEVELSMock).convertNativeToSystem(levelMock2);
			});
		}
	}

	//Sapient generated method id: ${1d2112b3-8acc-3521-84da-e493ffddac34}
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
				verify(loggerContextMock).exists("ROOT");
			});
		}
	}

	//Sapient generated method id: ${76c172dd-72b9-38d4-b178-9aff273bfd12}
	@Test()
	void getLoggerConfigurationWhenFactoryInstanceOfSubstituteLoggerFactoryAndLoggerIsNotNull() throws InterruptedException {
		/* Branches:
		 * (!StringUtils.hasLength(name)) : false  #  inside getLoggerName method
		 * (Logger.ROOT_LOGGER_NAME.equals(name)) : true  #  inside getLoggerName method
		 * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
		 * (logger == null) : false  #  inside getLoggerConfiguration method
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
			doReturn(LogLevel.TRACE).when(LEVELSMock).convertNativeToSystem(levelMock);
			doReturn(LogLevel.TRACE).when(LEVELSMock).convertNativeToSystem(levelMock2);
			//Act Statement(s)
			LoggerConfiguration result = target.getLoggerConfiguration("ROOT");
			LoggerConfiguration loggerConfiguration = new LoggerConfiguration("ROOT", LogLevel.TRACE, LogLevel.TRACE);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(loggerConfiguration));
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
				verify(loggerContextMock).exists("ROOT");
				verify(loggerMock).getLevel();
				verify(loggerMock).getEffectiveLevel();
				verify(loggerMock).getName();
				verify(LEVELSMock).convertNativeToSystem(levelMock);
				verify(LEVELSMock).convertNativeToSystem(levelMock2);
			});
		}
	}

	//Sapient generated method id: ${7a025c29-2cbd-3156-912b-bd3c1bda8a88}
	@Test()
	void getLoggerConfigurationWhenStringUtilsHasLengthNameAndLoggerROOT_LOGGER_NAMEEqualsNameAndFactoryInstanceOfSubstituteLogg() throws InterruptedException {
		/* Branches:
		 * (!StringUtils.hasLength(name)) : false  #  inside getLoggerName method
		 * (Logger.ROOT_LOGGER_NAME.equals(name)) : true  #  inside getLoggerName method
		 * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
		 * (logger == null) : false  #  inside getLoggerConfiguration method
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
			doReturn(LogLevel.TRACE).when(LEVELSMock).convertNativeToSystem(levelMock);
			doReturn(LogLevel.TRACE).when(LEVELSMock).convertNativeToSystem(levelMock2);
			//Act Statement(s)
			LoggerConfiguration result = target.getLoggerConfiguration("ROOT");
			LoggerConfiguration loggerConfiguration = new LoggerConfiguration("A", LogLevel.TRACE, LogLevel.TRACE);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(loggerConfiguration));
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
				verify(loggerContextMock).exists("ROOT");
				verify(loggerMock).getLevel();
				verify(loggerMock).getEffectiveLevel();
				verify(loggerMock).getName();
				verify(LEVELSMock).convertNativeToSystem(levelMock);
				verify(LEVELSMock).convertNativeToSystem(levelMock2);
			});
		}
	}

	//Sapient generated method id: ${285d06ab-ed5d-3477-bf79-0db7110c71e7}
	@Disabled(value = "Potential harmful system call (Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void getLoggerConfigurationWhenCaughtInterruptedExceptionThrowsIllegalStateException() throws InterruptedException {
		/* Branches:
		 * (!StringUtils.hasLength(name)) : false  #  inside getLoggerName method
		 * (Logger.ROOT_LOGGER_NAME.equals(name)) : true  #  inside getLoggerName method
		 * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
		 * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Thread> thread = mockStatic(Thread.class)) {
			InterruptedException interruptedException = new InterruptedException();
			thread.when(() -> Thread.sleep(50L)).thenThrow(interruptedException);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.getLoggerConfiguration("ROOT");
			});
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

	//Sapient generated method id: ${5b72cfe2-29b7-3dd3-ab10-076783e072d6}
	@Test()
	void getLoggerConfigurationWhenLoggerROOT_LOGGER_NAMENotEqualsNameAndFactoryNotInstanceOfSubstituteLoggerFactoryAndLoggerIsN() throws InterruptedException {
		/* Branches:
		 * (!StringUtils.hasLength(name)) : false  #  inside getLoggerName method
		 * (Logger.ROOT_LOGGER_NAME.equals(name)) : false  #  inside getLoggerName method
		 * (factory instanceof SubstituteLoggerFactory) : false  #  inside getLoggerFactory method
		 * (logger == null) : false  #  inside getLoggerConfiguration method
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
			doReturn(LogLevel.TRACE).when(LEVELSMock).convertNativeToSystem(levelMock);
			doReturn(LogLevel.TRACE).when(LEVELSMock).convertNativeToSystem(levelMock2);
			//Act Statement(s)
			LoggerConfiguration result = target.getLoggerConfiguration("A");
			LoggerConfiguration loggerConfiguration = new LoggerConfiguration("ROOT", LogLevel.TRACE, LogLevel.TRACE);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(loggerConfiguration));
				stringUtils.verify(() -> StringUtils.hasLength("A"), atLeast(1));
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
				verify(loggerContextMock).exists("A");
				verify(loggerMock).getLevel();
				verify(loggerMock).getEffectiveLevel();
				verify(loggerMock).getName();
				stringUtils.verify(() -> StringUtils.hasLength("B"), atLeast(1));
				verify(LEVELSMock).convertNativeToSystem(levelMock);
				verify(LEVELSMock).convertNativeToSystem(levelMock2);
			});
		}
	}

	//Sapient generated method id: ${7a1c00ea-d1a7-32a5-8c03-7d0e9699d6e5}
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
				verify(loggerContextMock).exists("ROOT");
			});
		}
	}

	//Sapient generated method id: ${82f1eac0-2fc3-39e9-ac77-65b21be0daa5}
	@Test()
	void getSupportedLogLevelsTest() {
		//Arrange Statement(s)
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
		Set<LogLevel> logLevelSet = new HashSet<>();
		doReturn(logLevelSet).when(LEVELSMock).getSupported();
		//Act Statement(s)
		Set<LogLevel> result = target.getSupportedLogLevels();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(logLevelSet));
			verify(LEVELSMock).getSupported();
		});
	}

	//Sapient generated method id: ${916d3d43-93c5-3ae9-b858-0dc57c963319}
	@Disabled(value = "Potential harmful system call (Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void setLogLevelWhenCaughtInterruptedExceptionThrowsIllegalStateException() throws InterruptedException {
		/* Branches:
		 * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
		 * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Thread> thread = mockStatic(Thread.class)) {
			InterruptedException interruptedException = new InterruptedException();
			thread.when(() -> Thread.sleep(50L)).thenThrow(interruptedException);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.setLogLevel("loggerName1", LogLevel.TRACE);
			});
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

	//Sapient generated method id: ${afa371c0-8f78-3bee-bcd5-b73f6570c925}
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
			doNothing().when(loggerMock).setLevel(levelMock);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
			doReturn(levelMock).when(LEVELSMock).convertSystemToNative(LogLevel.TRACE);
			//Act Statement(s)
			target.setLogLevel("ROOT", LogLevel.TRACE);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
				verify(loggerContextMock).getLogger("ROOT");
				verify(loggerMock).setLevel(levelMock);
				verify(LEVELSMock).convertSystemToNative(LogLevel.TRACE);
			});
		}
	}

	//Sapient generated method id: ${48204221-51ad-3ec0-97e0-6ff12bd0beed}
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
				verify(loggerContextMock).getLogger("A");
			});
		}
	}

	//Sapient generated method id: ${51046b7c-49b6-34a9-8eb7-75eda4164ec7}
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
			doNothing().when(loggerMock).setLevel(levelMock);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
			doReturn(levelMock).when(LEVELSMock).convertSystemToNative(LogLevel.TRACE);
			//Act Statement(s)
			target.setLogLevel("ROOT", LogLevel.TRACE);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.isInstanceOf(eq(LoggerContext.class), eq(loggerContextMock), (Supplier) any()));
				verify(loggerContextMock).getLogger("ROOT");
				verify(loggerMock).setLevel(levelMock);
				verify(LEVELSMock).convertSystemToNative(LogLevel.TRACE);
			});
		}
	}

	//Sapient generated method id: ${1fa3a2e1-a02e-3401-a913-93f2f865166f}
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

	//Sapient generated method id: ${51ee05df-7512-3ac7-956d-21ddf98d974d}
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

	//Sapient generated method id: ${99a2d2e5-2f6a-33e5-9807-21db6cd6e26c}
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
				verify(loggerContextMock).getObject("org.springframework.beans.factory.aot.BeanFactoryInitializationAotContribution");
				verify(loggerContextMock).removeObject("org.springframework.beans.factory.aot.BeanFactoryInitializationAotContribution");
			});
		}
	}

	//Sapient generated method id: ${a6c445f1-4303-33fe-b6a3-eb364e5fb224}
	@Disabled(value = "Potential harmful system call (Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void processAheadOfTimeWhenCaughtInterruptedExceptionThrowsIllegalStateException() throws InterruptedException {
		/* Branches:
		 * (factory instanceof SubstituteLoggerFactory) : true  #  inside getLoggerFactory method
		 * (catch-exception (InterruptedException)) : true  #  inside getLoggerFactory method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Thread> thread = mockStatic(Thread.class)) {
			InterruptedException interruptedException = new InterruptedException();
			thread.when(() -> Thread.sleep(50L)).thenThrow(interruptedException);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			LogbackLoggingSystem target = new LogbackLoggingSystem(classLoader);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.processAheadOfTime(configurableListableBeanFactoryMock);
			});
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
