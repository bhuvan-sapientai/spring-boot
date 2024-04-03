package org.springframework.boot.context.logging;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.boot.context.properties.bind.BindResult;

import org.mockito.MockitoAnnotations;

import org.springframework.util.StringUtils;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.logging.LogLevel;
import org.springframework.boot.ConfigurableBootstrapContext;

import java.util.Map;
import java.util.HashMap;

import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.boot.context.event.ApplicationFailedEvent;

import java.io.FileNotFoundException;

import org.springframework.boot.logging.LoggingSystem;
import org.springframework.core.ResolvableType;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplicationShutdownHandlers;
import org.springframework.boot.context.properties.bind.Bindable;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.logging.LogFile;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
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
class LoggingApplicationListenerSapientGeneratedTest {

	private final LoggingSystem loggingSystemMock = mock(LoggingSystem.class, "loggingSystem");

	private final LogFile logFileMock = mock(LogFile.class, "logFile");

	private AutoCloseable autoCloseableMocks;

	@InjectMocks()
	private LoggingApplicationListener target;

	@AfterEach()
	public void afterTest() throws Exception {
		if (autoCloseableMocks != null)
			autoCloseableMocks.close();
	}

	//Sapient generated method id: ${cd22d811-8ef9-377b-9a2d-5d154bbbaca1}, hash: 0B4E4508F36ACAF67D69E7764233A62D
	@Test()
	void supportsEventTypeWhenSupportedTypeIsAssignableFromType() {
		/* Branches:
		 * (type != null) : true  #  inside isAssignableFrom method
		 * (for-each(supportedTypes)) : true  #  inside isAssignableFrom method
		 * (supportedType.isAssignableFrom(type)) : true  #  inside isAssignableFrom method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new LoggingApplicationListener();
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		ResolvableType resolvableType = ResolvableType.forClass(Object.class);

		//Act Statement(s)
		boolean result = target.supportsEventType(resolvableType);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${fdc090e8-4f7c-3656-8fb2-8d898b42f85d}, hash: CB0C067788703652FCE7C4D3D42D2EF2
	@Test()
	void supportsEventTypeWhenSupportedTypeNotIsAssignableFromType() {
		/* Branches:
		 * (type != null) : true  #  inside isAssignableFrom method
		 * (for-each(supportedTypes)) : true  #  inside isAssignableFrom method
		 * (supportedType.isAssignableFrom(type)) : false  #  inside isAssignableFrom method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new LoggingApplicationListener();
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		ResolvableType resolvableType = ResolvableType.forClass(Object.class);

		//Act Statement(s)
		boolean result = target.supportsEventType(resolvableType);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${3cda323b-4b79-38e4-acde-73aae126c217}, hash: FDC87D87BB0E9CCEF49B088F0D8C73E3
	@Test()
	void supportsSourceTypeWhenSupportedTypeIsAssignableFromType() {
		/* Branches:
		 * (type != null) : true  #  inside isAssignableFrom method
		 * (for-each(supportedTypes)) : true  #  inside isAssignableFrom method
		 * (supportedType.isAssignableFrom(type)) : true  #  inside isAssignableFrom method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new LoggingApplicationListener();
		autoCloseableMocks = MockitoAnnotations.openMocks(this);

		//Act Statement(s)
		boolean result = target.supportsSourceType(Class.class);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${fcf2e665-d547-39c0-b041-182e6bd19db1}, hash: 986A4624E5AB07886364D83FB2ED6E73
	@Test()
	void supportsSourceTypeWhenSupportedTypeNotIsAssignableFromType() {
		/* Branches:
		 * (type != null) : true  #  inside isAssignableFrom method
		 * (for-each(supportedTypes)) : true  #  inside isAssignableFrom method
		 * (supportedType.isAssignableFrom(type)) : false  #  inside isAssignableFrom method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new LoggingApplicationListener();
		autoCloseableMocks = MockitoAnnotations.openMocks(this);

		//Act Statement(s)
		boolean result = target.supportsSourceType(Object.class);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${202c3ac3-60ab-3f94-abec-02a9db1ab1da}, hash: 5ED75CDD33E5FF779778C22D45D0AAB9
	@Test()
	void onApplicationEventWhenEventInstanceOfApplicationStartingEvent() throws Throwable {
		/* Branches:
		 * (event instanceof ApplicationStartingEvent startingEvent) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurableBootstrapContext configurableBootstrapContextMock = mock(ConfigurableBootstrapContext.class);
		SpringApplication springApplicationMock = mock(SpringApplication.class);
		try (MockedStatic<LoggingSystem> loggingSystem = mockStatic(LoggingSystem.class)) {
			loggingSystem.when(() -> LoggingSystem.get((ClassLoader) any())).thenReturn(loggingSystemMock);
			target = new LoggingApplicationListener();
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			doNothing().when(loggingSystemMock).beforeInitialize();
			String[] stringArray = new String[] {};
			ApplicationStartingEvent applicationStartingEvent = new ApplicationStartingEvent(configurableBootstrapContextMock, springApplicationMock, stringArray);
			//Act Statement(s)
			target.onApplicationEvent(applicationStartingEvent);
			//Assert statement(s)
			assertAll("result", () -> {
				loggingSystem.verify(() -> LoggingSystem.get((ClassLoader) any()));
				verify(loggingSystemMock).beforeInitialize();
			});
		}
	}

	//Sapient generated method id: ${456afd42-df2d-3323-bbcd-0682321e780e}, hash: CC92C0B0583FAD28ACE75E389B92EFA9
	@Test()
	void onApplicationEventWhenThisLoggingSystemIsNull() throws Throwable {
		/* Branches:
		 * (event instanceof ApplicationStartingEvent startingEvent) : false
		 * (event instanceof ApplicationEnvironmentPreparedEvent environmentPreparedEvent) : true
		 * (this.loggingSystem == null) : true  #  inside onApplicationEnvironmentPreparedEvent method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		LoggingSystem loggingSystemMock2 = mock(LoggingSystem.class, "LoggingSystem");
		ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class, "ConfigurableEnvironment");
		ConfigurableBootstrapContext configurableBootstrapContextMock = mock(ConfigurableBootstrapContext.class);
		SpringApplication springApplicationMock = mock(SpringApplication.class);
		try (MockedStatic<LoggingSystem> loggingSystem = mockStatic(LoggingSystem.class)) {
			loggingSystem.when(() -> LoggingSystem.get((ClassLoader) any())).thenReturn(loggingSystemMock2);
			target = spy(new LoggingApplicationListener());
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			doNothing().when(target).initialize(eq(configurableEnvironmentMock), (ClassLoader) any());
			String[] stringArray = new String[] {};
			ApplicationEnvironmentPreparedEvent applicationEnvironmentPreparedEvent = new ApplicationEnvironmentPreparedEvent(configurableBootstrapContextMock, springApplicationMock, stringArray, configurableEnvironmentMock);
			//Act Statement(s)
			target.onApplicationEvent(applicationEnvironmentPreparedEvent);
			//Assert statement(s)
			assertAll("result", () -> {
				loggingSystem.verify(() -> LoggingSystem.get((ClassLoader) any()));
				verify(target).initialize(eq(configurableEnvironmentMock), (ClassLoader) any());
			});
		}
	}

	//Sapient generated method id: ${727d1b11-625e-3e25-a64c-fa793f19efdb}, hash: 355DC840371398A3CA4B2DEBD6498821
	@Test()
	void onApplicationEventWhenEventInstanceOfApplicationFailedEvent() throws Throwable {
		/* Branches:
		 * (event instanceof ApplicationStartingEvent startingEvent) : false
		 * (event instanceof ApplicationEnvironmentPreparedEvent environmentPreparedEvent) : false
		 * (event instanceof ApplicationPreparedEvent preparedEvent) : false
		 * (event instanceof ContextClosedEvent) : false
		 * (event instanceof ApplicationFailedEvent) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = spy(new LoggingApplicationListener());
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		doNothing().when(target).cleanupLoggingSystem();
		SpringApplication springApplicationMock = mock(SpringApplication.class);
		String[] stringArray = new String[] {};
		ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		Throwable throwable = new Throwable();
		ApplicationFailedEvent applicationFailedEvent = new ApplicationFailedEvent(springApplicationMock, stringArray, configurableApplicationContextMock, throwable);

		//Act Statement(s)
		target.onApplicationEvent(applicationFailedEvent);

		//Assert statement(s)
		assertAll("result", () -> verify(target).cleanupLoggingSystem());
	}

	//Sapient generated method id: ${1fe6a34d-1953-3eba-8e93-5ca7b284df37}, hash: FE86ACE2BF2B44016B2F91E6D5AFC22E
	@Test()
	void onApplicationEventWhenApplicationContextContainsBeanLOGGING_LIFECYCLE_BEAN_NAME() throws Throwable {
		/* Branches:
		 * (event instanceof ApplicationStartingEvent startingEvent) : false
		 * (event instanceof ApplicationEnvironmentPreparedEvent environmentPreparedEvent) : false
		 * (event instanceof ApplicationPreparedEvent preparedEvent) : false
		 * (event instanceof ContextClosedEvent) : true
		 * (applicationContext.getParent() != null) : false  #  inside onContextClosedEvent method
		 * (applicationContext.containsBean(LOGGING_LIFECYCLE_BEAN_NAME)) : true  #  inside onContextClosedEvent method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new LoggingApplicationListener();
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		ApplicationContext applicationContextMock = mock(ApplicationContext.class);
		ContextClosedEvent contextClosedEvent = new ContextClosedEvent(applicationContextMock);

		//Act Statement(s)
		target.onApplicationEvent(contextClosedEvent);
	}

	//Sapient generated method id: ${7fe7cd1d-b7fb-3e4f-8584-cbb2c06b6899}, hash: B799FDF0A6266CDB6F4F2F0430DF87B5
	@Test()
	void onApplicationEventWhenApplicationContextNotContainsBeanLOGGING_LIFECYCLE_BEAN_NAME() throws Throwable {
		/* Branches:
		 * (event instanceof ApplicationStartingEvent startingEvent) : false
		 * (event instanceof ApplicationEnvironmentPreparedEvent environmentPreparedEvent) : false
		 * (event instanceof ApplicationPreparedEvent preparedEvent) : false
		 * (event instanceof ContextClosedEvent) : true
		 * (applicationContext.getParent() != null) : false  #  inside onContextClosedEvent method
		 * (applicationContext.containsBean(LOGGING_LIFECYCLE_BEAN_NAME)) : false  #  inside onContextClosedEvent method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = spy(new LoggingApplicationListener());
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		doNothing().when(target).cleanupLoggingSystem();
		ApplicationContext applicationContextMock = mock(ApplicationContext.class);
		ContextClosedEvent contextClosedEvent = new ContextClosedEvent(applicationContextMock);

		//Act Statement(s)
		target.onApplicationEvent(contextClosedEvent);

		//Assert statement(s)
		assertAll("result", () -> verify(target).cleanupLoggingSystem());
	}

	//Sapient generated method id: ${9efb9ef3-47c8-3c6d-a3f9-26c88a9a30fd}, hash: 031BF0027D32A6BE7D339BB1C1C11A55
	@Test()
	void onApplicationEventWhenApplicationContextGetParentIsNull() throws Throwable {
		/* Branches:
		 * (event instanceof ApplicationStartingEvent startingEvent) : false
		 * (event instanceof ApplicationEnvironmentPreparedEvent environmentPreparedEvent) : false
		 * (event instanceof ApplicationPreparedEvent preparedEvent) : true
		 * (!beanFactory.containsBean(LOGGING_SYSTEM_BEAN_NAME)) : true  #  inside onApplicationPreparedEvent method
		 * (this.logFile != null) : false  #  inside onApplicationPreparedEvent method
		 * (this.loggerGroups != null) : false  #  inside onApplicationPreparedEvent method
		 * (!beanFactory.containsBean(LOGGING_LIFECYCLE_BEAN_NAME)) : true  #  inside onApplicationPreparedEvent method
		 * (applicationContext.getParent() == null) : true  #  inside onApplicationPreparedEvent method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new LoggingApplicationListener();
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		SpringApplication springApplicationMock = mock(SpringApplication.class);
		String[] stringArray = new String[] {};
		ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		ApplicationPreparedEvent applicationPreparedEvent = new ApplicationPreparedEvent(springApplicationMock, stringArray, configurableApplicationContextMock);

		//Act Statement(s)
		target.onApplicationEvent(applicationPreparedEvent);
	}

	//Sapient generated method id: ${72793170-e16d-392a-88d0-53b0efc41381}, hash: 852395D8991D27D01E013126A1688F96
	@Test()
	void cleanupLoggingSystemWhenThisLoggingSystemIsNull() {
		/* Branches:
		 * (this.loggingSystem != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new LoggingApplicationListener();
		autoCloseableMocks = MockitoAnnotations.openMocks(this);

		//Act Statement(s)
		target.cleanupLoggingSystem();
	}

	//Sapient generated method id: ${dfe143bb-2b9b-31f5-873f-992cb7f9dbae}, hash: E3FB2E2D008C7448D3C5983EE70B9609
	@Test()
	void initializeWhenIgnoreLogConfigLogConfigAndExceptionToReportIsNullAndExceptionToReportIsNull4ThrowsNullPointerException() {
		/* Branches:
		 * (this.loggingSystem != null) : false  #  inside getLoggingSystemProperties method
		 * (this.logFile != null) : true
		 * (this.parseArgs) : true  #  inside initializeEarlyLoggingLevel method
		 * (this.springBootLogging == null) : true  #  inside initializeEarlyLoggingLevel method
		 * (value != null) : true  #  inside isSet method
		 * (!value.equals("false")) : false  #  inside isSet method
		 * (isSet(environment, "debug")) : false  #  inside initializeEarlyLoggingLevel method
		 * (isSet(environment, "trace")) : false  #  inside initializeEarlyLoggingLevel method
		 * (StringUtils.hasLength(logConfig)) : false  #  inside initializeSystem method
		 * (!StringUtils.hasLength(logConfig)) : true  #  inside ignoreLogConfig method
		 * (ignoreLogConfig(logConfig)) : true  #  inside initializeSystem method
		 * (exceptionToReport != null) : false  #  inside initializeSystem method
		 * (exceptionToReport != null) : false  #  inside initializeSystem method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type LoggingSystemProperties
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class, "test");
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<LogFile> logFile = mockStatic(LogFile.class)) {
			doReturn("false").when(environmentMock).getProperty("debug");
			doReturn(null).when(environmentMock).getProperty("trace");
			doReturn("A").when(environmentMock).getProperty("logging.config");
			logFile.when(() -> LogFile.get(environmentMock)).thenReturn(logFileMock);
			stringUtils.when(() -> StringUtils.hasLength("A")).thenReturn(false);
			target = new LoggingApplicationListener();
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			doNothing().when(logFileMock).applyToSystemProperties();
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				target.initialize(environmentMock, classLoader);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(environmentMock).getProperty("debug");
				verify(environmentMock).getProperty("trace");
				verify(environmentMock).getProperty("logging.config");
				logFile.verify(() -> LogFile.get(environmentMock), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength("A"), atLeast(2));
				verify(logFileMock).applyToSystemProperties();
			});
		}
	}

	//Sapient generated method id: ${a69ebfd3-0b52-3b9c-8b41-e8a0691879fe}, hash: 7A95294BFE1E01ECFC7AE50DB3A61CE6
	@Test()
	void initializeWhenIgnoreLogConfigNotLogConfigAndExceptionToReportIsNullAndExceptionToReportIsNullThrowsNullPointerException() {
		/* Branches:
		 * (this.loggingSystem != null) : false  #  inside getLoggingSystemProperties method
		 * (this.logFile != null) : true
		 * (this.parseArgs) : true  #  inside initializeEarlyLoggingLevel method
		 * (this.springBootLogging == null) : true  #  inside initializeEarlyLoggingLevel method
		 * (value != null) : true  #  inside isSet method
		 * (!value.equals("false")) : true  #  inside isSet method
		 * (isSet(environment, "debug")) : true  #  inside initializeEarlyLoggingLevel method
		 * (isSet(environment, "trace")) : true  #  inside initializeEarlyLoggingLevel method
		 * (StringUtils.hasLength(logConfig)) : true  #  inside initializeSystem method
		 * (!StringUtils.hasLength(logConfig)) : false  #  inside ignoreLogConfig method
		 * (logConfig.startsWith("-D")) : false  #  inside ignoreLogConfig method
		 * (ignoreLogConfig(logConfig)) : false  #  inside initializeSystem method
		 * (exceptionToReport != null) : false  #  inside initializeSystem method
		 * (exceptionToReport != null) : false  #  inside initializeSystem method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type LoggingSystemProperties
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class);
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<LogFile> logFile = mockStatic(LogFile.class)) {
			doReturn("C").when(environmentMock).getProperty("debug");
			doReturn("E").when(environmentMock).getProperty("trace");
			doReturn("return_of_getProperty1").when(environmentMock).getProperty("logging.config");
			logFile.when(() -> LogFile.get(environmentMock)).thenReturn(logFileMock);
			stringUtils.when(() -> StringUtils.hasLength("return_of_getProperty1")).thenReturn(true);
			stringUtils.when(() -> StringUtils.hasLength("A")).thenReturn(true);
			target = new LoggingApplicationListener();
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			doNothing().when(logFileMock).applyToSystemProperties();
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				target.initialize(environmentMock, classLoader);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(environmentMock).getProperty("debug");
				verify(environmentMock).getProperty("trace");
				verify(environmentMock).getProperty("logging.config");
				logFile.verify(() -> LogFile.get(environmentMock), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength("return_of_getProperty1"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength("A"), atLeast(1));
				verify(logFileMock).applyToSystemProperties();
			});
		}
	}

	//Sapient generated method id: ${c1c445d0-2498-3598-8ca9-6de7664fa292}, hash: 6887D9B510E42DC07377B62D55CC4A0C
	@Test()
	void initializeWhenExceptionToReportNotInstanceOfFileNotFoundExceptionAndExceptionToReportIsNullThrowsIllegalStateException() {
		/* Branches:
		 * (this.loggingSystem != null) : false  #  inside getLoggingSystemProperties method
		 * (this.logFile != null) : true
		 * (this.parseArgs) : true  #  inside initializeEarlyLoggingLevel method
		 * (this.springBootLogging == null) : true  #  inside initializeEarlyLoggingLevel method
		 * (value != null) : true  #  inside isSet method
		 * (!value.equals("false")) : true  #  inside isSet method
		 * (isSet(environment, "debug")) : true  #  inside initializeEarlyLoggingLevel method
		 * (isSet(environment, "trace")) : true  #  inside initializeEarlyLoggingLevel method
		 * (StringUtils.hasLength(logConfig)) : true  #  inside initializeSystem method
		 * (!StringUtils.hasLength(logConfig)) : false  #  inside ignoreLogConfig method
		 * (logConfig.startsWith("-D")) : true  #  inside ignoreLogConfig method
		 * (ignoreLogConfig(logConfig)) : true  #  inside initializeSystem method
		 * (exceptionToReport != null) : true  #  inside initializeSystem method
		 * (!(exceptionToReport instanceof FileNotFoundException)) : true  #  inside initializeSystem method
		 * (exceptionToReport != null) : false  #  inside initializeSystem method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type LoggingSystemProperties
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class);
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<LogFile> logFile = mockStatic(LogFile.class)) {
			doReturn("A").when(environmentMock).getProperty("debug");
			doReturn("B").when(environmentMock).getProperty("trace");
			doReturn("return_of_getProperty1").when(environmentMock).getProperty("logging.config");
			logFile.when(() -> LogFile.get(environmentMock)).thenReturn(logFileMock);
			stringUtils.when(() -> StringUtils.hasLength("return_of_getProperty1")).thenReturn(true);
			stringUtils.when(() -> StringUtils.hasLength("-D")).thenReturn(true);
			target = new LoggingApplicationListener();
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			doNothing().when(logFileMock).applyToSystemProperties();
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.initialize(environmentMock, classLoader);
			});
			Throwable throwable = new Throwable();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getCause(), is(instanceOf(throwable.getClass())));
				verify(environmentMock).getProperty("debug");
				verify(environmentMock).getProperty("trace");
				verify(environmentMock).getProperty("logging.config");
				logFile.verify(() -> LogFile.get(environmentMock), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength("return_of_getProperty1"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength("-D"), atLeast(1));
				verify(logFileMock).applyToSystemProperties();
			});
		}
	}

	//Sapient generated method id: ${f789ff19-6dee-3a40-aa4a-1daad4fcc38c}, hash: 6BFA91152FC33FACE80CA165ABEFA990
	@Test()
	void initializeWhenExceptionToReportInstanceOfFileNotFoundExceptionAndExceptionToReportIsNotNullThrowsIllegalStateException() {
		/* Branches:
		 * (this.loggingSystem != null) : false  #  inside getLoggingSystemProperties method
		 * (this.logFile != null) : true
		 * (this.parseArgs) : true  #  inside initializeEarlyLoggingLevel method
		 * (this.springBootLogging == null) : true  #  inside initializeEarlyLoggingLevel method
		 * (value != null) : true  #  inside isSet method
		 * (!value.equals("false")) : true  #  inside isSet method
		 * (isSet(environment, "debug")) : true  #  inside initializeEarlyLoggingLevel method
		 * (isSet(environment, "trace")) : true  #  inside initializeEarlyLoggingLevel method
		 * (StringUtils.hasLength(logConfig)) : true  #  inside initializeSystem method
		 * (!StringUtils.hasLength(logConfig)) : false  #  inside ignoreLogConfig method
		 * (logConfig.startsWith("-D")) : true  #  inside ignoreLogConfig method
		 * (ignoreLogConfig(logConfig)) : true  #  inside initializeSystem method
		 * (exceptionToReport != null) : true  #  inside initializeSystem method
		 * (!(exceptionToReport instanceof FileNotFoundException)) : false  #  inside initializeSystem method
		 * (exceptionToReport != null) : true  #  inside initializeSystem method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type LoggingSystemProperties
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class);
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<LogFile> logFile = mockStatic(LogFile.class)) {
			doReturn("A").when(environmentMock).getProperty("debug");
			doReturn("B").when(environmentMock).getProperty("trace");
			doReturn("return_of_getProperty1").when(environmentMock).getProperty("logging.config");
			logFile.when(() -> LogFile.get(environmentMock)).thenReturn(logFileMock);
			stringUtils.when(() -> StringUtils.hasLength("return_of_getProperty1")).thenReturn(true);
			stringUtils.when(() -> StringUtils.hasLength("-D")).thenReturn(true);
			target = new LoggingApplicationListener();
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			doNothing().when(logFileMock).applyToSystemProperties();
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.initialize(environmentMock, classLoader);
			});
			FileNotFoundException fileNotFoundException = new FileNotFoundException();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getCause(), is(instanceOf(fileNotFoundException.getClass())));
				verify(environmentMock).getProperty("debug");
				verify(environmentMock).getProperty("trace");
				verify(environmentMock).getProperty("logging.config");
				logFile.verify(() -> LogFile.get(environmentMock), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength("return_of_getProperty1"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength("-D"), atLeast(1));
				verify(logFileMock).applyToSystemProperties();
			});
		}
	}

	//Sapient generated method id: ${e88ca032-240f-3e2f-8c39-af4acc9c32a7}, hash: C55D098148DDE98C9CB6A4A317E393EE
	@Test()
	void initializeSpringBootLoggingWhenThisLoggerGroupsIsNull() {
		/* Branches:
		 * (this.loggerGroups != null) : false  #  inside configureLogLevel method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new LoggingApplicationListener();
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		LoggingSystem loggingSystemMock2 = mock(LoggingSystem.class, "springBootLoggingSystem");

		//Act Statement(s)
		target.initializeSpringBootLogging(loggingSystemMock2, LogLevel.DEBUG);
	}

	//Sapient generated method id: ${2b082947-1b2b-3b02-9f92-bd7b931e194f}, hash: 5B415947E5CEA5E647BE2D7E6520DFEC
	@Test()
	void setLogLevelsWhenThisLoggerGroupsIsNull() {
		/* Branches:
		 * (this.loggerGroups != null) : false  #  inside configureLogLevel method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Binder binderMock = mock(Binder.class);
		ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
		BindResult bindResultMock = mock(BindResult.class);
		ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);
		Bindable<Map<String, LogLevel>> bindableMock = mock(Bindable.class);
		LoggingSystem loggingSystemMock2 = mock(LoggingSystem.class);
		try (MockedStatic<Binder> binder = mockStatic(Binder.class)) {
			binder.when(() -> Binder.get(configurableEnvironmentMock)).thenReturn(binderMock);
			doReturn(bindResultMock).when(binderMock).bind(configurationPropertyNameMock, bindableMock);
			Map map = new HashMap<>();
			doReturn(map).when(bindResultMock).orElseGet((Supplier) any());
			target = new LoggingApplicationListener();
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			target.setLogLevels(loggingSystemMock2, configurableEnvironmentMock);
			//Assert statement(s)
			assertAll("result", () -> {
				binder.verify(() -> Binder.get(configurableEnvironmentMock), atLeast(1));
				verify(binderMock).bind(configurationPropertyNameMock, bindableMock);
				verify(bindResultMock).orElseGet((Supplier) any());
			});
		}
	}

	//Sapient generated method id: ${d5677af8-91e7-39d2-b67e-2d5761466fb2}, hash: E79EC08FAA123E77A24F7F05A6F0F07C
	@Test()
	void registerShutdownHookTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringApplicationShutdownHandlers springApplicationShutdownHandlersMock = mock(SpringApplicationShutdownHandlers.class);
		Runnable runnableMock = mock(Runnable.class);
		try (MockedStatic<SpringApplication> springApplication = mockStatic(SpringApplication.class)) {
			springApplication.when(() -> SpringApplication.getShutdownHandlers()).thenReturn(springApplicationShutdownHandlersMock);
			doNothing().when(springApplicationShutdownHandlersMock).add(runnableMock);
			target = new LoggingApplicationListener();
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			target.registerShutdownHook(runnableMock);
			//Assert statement(s)
			assertAll("result", () -> {
				springApplication.verify(() -> SpringApplication.getShutdownHandlers(), atLeast(1));
				verify(springApplicationShutdownHandlersMock).add(runnableMock);
			});
		}
	}
}
