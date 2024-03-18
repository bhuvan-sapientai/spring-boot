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

import org.springframework.core.env.PropertyResolver;
import org.springframework.core.env.ConfigurableEnvironment;

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

	private final PropertyResolver propertyResolverMock = mock(PropertyResolver.class);

	private final URL uRLMock = mock(URL.class);

	private final URL uRLMock2 = mock(URL.class);

	//Sapient generated method id: ${553717c4-79f0-3c04-952f-70a61d4a7b63}, hash: 9CF2CD7661EF7C3B84AEF7E847441E35
	@Test()
	void getStandardConfigLocationsWhenPropertyDefinedLocationIsNotNull() {
		/* Branches:
		 * (isClassAvailable("com.fasterxml.jackson.dataformat.yaml.YAMLParser")) : true
		 * (isClassAvailable("com.fasterxml.jackson.databind.ObjectMapper")) : true
		 * (isClassAvailable("com.fasterxml.jackson.dataformat.yaml.YAMLParser")) : true
		 * (isClassAvailable("com.fasterxml.jackson.databind.ObjectMapper")) : true
		 * (propertyDefinedLocation != null) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type PropertiesUtil
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			String[] stringArray = new String[] {};
			stringUtils.when(() -> StringUtils.toStringArray(anyList())).thenReturn(stringArray);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			Log4J2LoggingSystem target = spy(new Log4J2LoggingSystem(classLoader));
			doReturn(true).when(target).isClassAvailable("com.fasterxml.jackson.dataformat.yaml.YAMLParser");
			doReturn(true).when(target).isClassAvailable("com.fasterxml.jackson.databind.ObjectMapper");
			//Act Statement(s)
			String[] result = target.getStandardConfigLocations();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(stringArray));
				stringUtils.verify(() -> StringUtils.toStringArray(anyList()));
				verify(target, times(2)).isClassAvailable("com.fasterxml.jackson.dataformat.yaml.YAMLParser");
				verify(target, times(2)).isClassAvailable("com.fasterxml.jackson.databind.ObjectMapper");
			});
		}
	}

	//Sapient generated method id: ${c75f67a2-3241-3278-9311-1eaffea70b22}, hash: 791CD5A28ABE67CD2B1B631E2BC1E9D7
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

	//Sapient generated method id: ${99a0a152-01cd-3846-80eb-c82d8af6941f}, hash: A61C42CA05AC3021E4059A79727BDFF7
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

	//Sapient generated method id: ${bf8a02e7-0c7d-32bf-80c1-2e392ca1db0d}, hash: D52FC26E732399F2AF5C44BF712C889B
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

	//Sapient generated method id: ${c2c4e2e4-43e0-379c-bca9-ba37968ff5d3}, hash: 871EBE394C08ABA7D56690B78F9C310F
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
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type Configuration
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

	//Sapient generated method id: ${6074f47b-b019-30b8-9a05-39ab6783b874}, hash: 7D7F073A45538015F944873FA1E452CE
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

	//Sapient generated method id: ${a215eade-fb63-31d7-bb20-82e8be51fb4c}, hash: BDAFC8B72CB9E102B354DAC40730EEB8
	@Disabled()
	@Test()
	void initializeWhenStringUtilsHasLengthConfigLocation() {
		/* Branches:
		 * (isAlreadyInitialized(loggerContext)) : false
		 * (environment != null) : true
		 * (StringUtils.hasLength(configLocation)) : true  #  inside initialize method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type Configuration, object of type PropertiesUtil, object of type LoggerContext
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

	//Sapient generated method id: ${cf57c3f8-0a5e-320a-a388-2e7f767085c8}, hash: 02D899AD18B78ED822914BC78E4483A2
	@Disabled()
	@Test()
	void loadDefaultsWhenInitializationContextIsNotNull() throws Exception {
		/* Branches:
		 * (logFile != null) : true
		 * (initializationContext != null) : true  #  inside load method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: object of type LoggingSystemProperties - Method: apply
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

	//Sapient generated method id: ${dc8ecdf2-e3d2-377f-b82b-5dc3b28f77f2}, hash: 06BF32DDB0B20C4B1857781017B01593
	@Disabled()
	@Test()
	void loadDefaultsWhenLogFileIsNullAndInitializationContextIsNotNull() throws Exception {
		/* Branches:
		 * (logFile != null) : false
		 * (initializationContext != null) : true  #  inside load method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: object of type LoggingSystemProperties - Method: apply
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

	//Sapient generated method id: ${205abf51-a568-3d90-b992-941ce8177fd3}, hash: 1F22FB8C47F9F4D4BB8FD9F7664A9BE7
	@Disabled()
	@Test()
	void loadConfigurationWhenInitializationContextIsNotNull() throws Exception {
		/* Branches:
		 * (initializationContext != null) : true  #  inside load method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: object of type LoggingSystemProperties - Method: apply
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

	//Sapient generated method id: ${e2a8011e-fd07-3513-ae56-cb08cec0d2d0}, hash: 2C82E6B91DD77E72AA43542A9D08E7E6
	@Disabled()
	@Test()
	void loadConfiguration1WhenConfigurationsSizeGreaterThan1() throws Exception {
		/* Branches:
		 * (FILE_PROTOCOL.equals(url.getProtocol())) : true  #  inside getConfigurationSource method
		 * (for-each(overrides)) : true
		 * (configurations.size() > 1) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: context
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

	//Sapient generated method id: ${bae1fa0f-ea08-337b-a095-7aa7a840e672}, hash: 5B65DB21B4E09295A20FFCEBE57C8739
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
		 *  Following variables could not be isolated/mocked: context
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

	//Sapient generated method id: ${7221c614-d03c-3ec0-997e-77a33187d648}, hash: 388590EBFDE0129F3F559008C46794F3
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
		 *  Following variables could not be isolated/mocked: context
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

	//Sapient generated method id: ${f27a894e-67db-3e9f-aac4-c5d5e07cbf9a}, hash: 0332C7D62B474586A8B58A6244D9DA90
	@Disabled()
	@Test()
	void loadConfiguration1WhenOverridesIsEmptyAndConfigurationsSizeNotGreaterThan1() throws Exception {
		/* Branches:
		 * (FILE_PROTOCOL.equals(url.getProtocol())) : false  #  inside getConfigurationSource method
		 * (url.getProtocol().equals("https")) : true  #  inside getConfigurationSource method
		 * (for-each(overrides)) : false
		 * (configurations.size() > 1) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: context
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

	//Sapient generated method id: ${d8aa49fb-f8d7-35a5-8379-a9af06a492bc}, hash: 7E0054774E28C7DDDEC912D3A6634284
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
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: context
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class)) {
			File file = new File("pathname1");
			resourceUtils.when(() -> ResourceUtils.getFile(uRLMock)).thenReturn(file);
			resourceUtils.when(() -> ResourceUtils.getURL("<value>")).thenReturn(uRLMock).thenReturn(uRLMock2);
			doReturn("A", "B").when(uRLMock2).getProtocol();
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
			LogFile logFile = LogFile.get(propertyResolverMock);
			List<String> stringList = new ArrayList<>();
			stringList.add("<value>");
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.loadConfiguration("<value>", logFile, stringList);
			});
			Exception exception = new Exception();
			IllegalStateException illegalStateException = new IllegalStateException("Could not initialize Log4J2 logging from <value>", exception);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(exception.getClass())));
				resourceUtils.verify(() -> ResourceUtils.getURL("<value>"), atLeast(2));
				resourceUtils.verify(() -> ResourceUtils.getFile(uRLMock), atLeast(1));
				verify(uRLMock2, times(2)).getProtocol();
			});
		}
	}

	//Sapient generated method id: ${540dc9f4-a650-3155-94d8-58e5c5618ec8}, hash: CF2C27975F368FBF62E7A3280F37191D
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
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: context
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class)) {
			doReturn("A", "B").when(uRLMock).getProtocol();
			resourceUtils.when(() -> ResourceUtils.getURL("<value>")).thenReturn(uRLMock).thenReturn(uRLMock2);
			File file = new File("pathname1");
			resourceUtils.when(() -> ResourceUtils.getFile(uRLMock2)).thenReturn(file);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
			LogFile logFile = LogFile.get(propertyResolverMock);
			List<String> stringList = new ArrayList<>();
			stringList.add("<value>");
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.loadConfiguration("<value>", logFile, stringList);
			});
			Exception exception = new Exception();
			IllegalStateException illegalStateException = new IllegalStateException("Could not initialize Log4J2 logging from <value>", exception);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(exception.getClass())));
				resourceUtils.verify(() -> ResourceUtils.getURL("<value>"), atLeast(2));
				verify(uRLMock, times(2)).getProtocol();
				resourceUtils.verify(() -> ResourceUtils.getFile(uRLMock2), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a685ca94-334b-303f-891a-f67e886f9ebb}, hash: C17235750D83737F70FFD67F39C5367E
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

	//Sapient generated method id: ${6766b2ea-8957-3e06-83cf-da5f484e3d99}, hash: 60550208A24AAC47D729AF6AC26DAC95
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

	//Sapient generated method id: ${73051d0c-d289-35df-91e8-d45e6e9b0ee1}, hash: 0C4C0C98BF0EDA52C89DD291F18CCD16
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

	//Sapient generated method id: ${61e61526-e4ed-3c74-bfd7-3062419e3331}, hash: 8F97C2D75C72F3962A3824556638EA95
	@Disabled()
	@Test()
	void reinitializeWhenCaughtIOExceptionThrowsRuntimeException() throws IOException {
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
		Environment environmentMock = mock(Environment.class, "Environment");
		ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class);
			 MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
			 MockedStatic<Binder> binder = mockStatic(Binder.class)) {
			binder.when(() -> Binder.get(environmentMock)).thenReturn(binderMock);
			doReturn(bindResultMock).when(binderMock).bind(eq("logging.log4j2.config.override"), (Bindable) any());
			List list = new ArrayList<>();
			List list2 = new ArrayList<>();
			doReturn(list).when(bindResultMock).orElse(list2);
			Bindable bindable2 = Bindable.listOf(String.class);
			bindable.when(() -> Bindable.listOf(String.class)).thenReturn(bindable2);
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(false);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			Log4J2LoggingSystem target = new Log4J2LoggingSystem(classLoader);
			LoggingInitializationContext loggingInitializationContext = new LoggingInitializationContext(configurableEnvironmentMock);
			//Act Statement(s)
			target.reinitialize(loggingInitializationContext);
			//Assert statement(s)
			assertAll("result", () -> {
				binder.verify(() -> Binder.get(environmentMock), atLeast(1));
				verify(binderMock).bind(eq("logging.log4j2.config.override"), (Bindable) any());
				verify(bindResultMock).orElse(list2);
				bindable.verify(() -> Bindable.listOf(String.class), atLeast(1));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()));
			});
		}
	}

	//Sapient generated method id: ${82f1eac0-2fc3-39e9-ac77-65b21be0daa5}, hash: 837932A462D7375798A936D98C73222D
	@Disabled()
	@Test()
	void getSupportedLogLevelsTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: LEVELS
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

	//Sapient generated method id: ${4f71b61b-ff36-31d1-9931-6c03e10a642a}, hash: 73BAF45CB64E140E198B609B3BB2CC89
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: configuration - Method: getLoggers
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

	//Sapient generated method id: ${2f9c7e8f-1b65-3bd6-8974-1f213ca9d8f5}, hash: B8D1B007AB57F404CF3DC537E659A4B6
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: configuration - Method: getLoggers
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

	//Sapient generated method id: ${2fbc11d0-1059-3424-9dc7-76227f1299b1}, hash: 54CF6BA896D6D45E5FA1AF0DA4043EAE
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: configuration - Method: getLoggers
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

	//Sapient generated method id: ${8a1dbccf-d2b4-351d-8466-d02e1f490a6f}, hash: 083F388C7018F8F71A1D30EA659243B3
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: configuration - Method: getLoggers
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

	//Sapient generated method id: ${9c94009e-fe8c-3833-9f2d-9490db49a114}, hash: 0AEDFCD628EDDD50356629C314D64CAF
	@Disabled()
	@Test()
	void getLoggerConfigurationsWhenNameIsNotNullAndStringUtilsNotHasLengthName() {
		/* Branches:
		 * (for-each(getLoggerContext().getLoggers())) : true  #  inside getAllLoggers method
		 * (name != null) : true  #  inside addLogger method
		 * (!StringUtils.hasLength(name)) : true  #  inside getSubName method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: object of type LoggerContext - Method: getLoggers
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

	//Sapient generated method id: ${75144fbe-7d4d-3d92-839c-6436163dba92}, hash: D618D1AB12D78577CFFA0C4973DD1140
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: object of type LoggerContext - Method: getLoggers
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

	//Sapient generated method id: ${f636a692-ea74-31f8-8049-b007999c238f}, hash: B752CD18E15578323BCF5CD6C4F55F31
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: object of type LoggerContext - Method: getLoggers
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

	//Sapient generated method id: ${85f45050-775f-31bd-9e14-ced307a7a2ea}, hash: F4CE4AF0C2604CD22A9C795A724B2DFB
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: object of type LoggerContext - Method: getLoggers
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

	//Sapient generated method id: ${59989881-4c0e-33d2-a920-9f1f6e543cee}, hash: 36589D1EDA0DD56962346FCC1BA97F37
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: object of type LoggerContext - Method: getLoggers
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

	//Sapient generated method id: ${9d7e2a04-2bd5-3212-82fc-2d58ccc9f082}, hash: EB045243FAF8F78EB97A7C56B94DBBA9
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: object of type LoggerContext - Method: getLoggers
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

	//Sapient generated method id: ${fff33724-7d56-30ca-9607-4a7e526424f2}, hash: 11BE6B730A3A404C9D573A2413817293
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: object of type LoggerContext - Method: getLoggers
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

	//Sapient generated method id: ${8b84268a-d0ad-3efe-a940-094ccd57c5f3}, hash: A79C9466A8C714B2C77EF285042FC91C
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: object of type LoggerContext - Method: getLoggers
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

	//Sapient generated method id: ${1e34fca2-ba0d-3590-9e51-0e147f83fe12}, hash: 289490C89A50CD4C208273BC36C512B0
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: object of type LoggerContext - Method: getLoggers
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

	//Sapient generated method id: ${2dad2123-9a79-3761-bd9f-85b4c4ac19ed}, hash: FAA262D4A38D95CFDE9BD0DEFED9D7F6
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: object of type LoggerContext - Method: getLoggers
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

	//Sapient generated method id: ${1fa3a2e1-a02e-3401-a913-93f2f865166f}, hash: AC751B6B650D38B816D1700D5695555D
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

	//Sapient generated method id: ${7f3312c7-a32c-37d3-9803-057f2be4304c}, hash: 9FCD9C310395A8AA7B0F29595BE2DE63
	@Test()
	void cleanUpWhenIsLog4jBridgeHandlerAvailableNot() throws Throwable {
		/* Branches:
		 * (ClassUtils.isPresent(LOG4J_BRIDGE_HANDLER, getClassLoader())) : false  #  inside isLog4jBridgeHandlerAvailable method
		 * (isLog4jBridgeHandlerAvailable()) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type Configuration
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

	//Sapient generated method id: ${000ea904-1c47-3ef8-8042-ab9c5bfaa521}, hash: 3691CBE2E34CEC61104B4E6038761845
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
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type Configuration
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

	//Sapient generated method id: ${697a5de7-82b8-3b17-a55d-39c9cb933deb}, hash: 01339C6424C19669A9167E5D056FAD73
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
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type Configuration
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

	//Sapient generated method id: ${51ee05df-7512-3ac7-956d-21ddf98d974d}, hash: 4C7A10D2C94669766BB2079893B2996F
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

	//Sapient generated method id: ${b53cb612-2ad2-39eb-97fb-f56347122c61}, hash: 0E5848A9E30105F643E64B29F28FCA1E
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

	//Sapient generated method id: ${7521631d-9b03-3734-9c93-cd6228b93a5b}, hash: 4528C07E4414A4FC0AB653D4DB6BB888
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
