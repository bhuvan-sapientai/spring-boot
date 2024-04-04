package org.springframework.boot.logging.logback;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import org.springframework.core.env.Environment;
import org.springframework.util.unit.DataSize;
import org.springframework.core.convert.ConversionException;
import org.springframework.util.StringUtils;

import java.util.function.BiConsumer;

import org.springframework.util.Assert;

import java.util.function.Function;

import org.mockito.MockedStatic;

import java.nio.charset.Charset;

import org.springframework.boot.logging.LogFile;
import org.springframework.core.env.PropertyResolver;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LogbackLoggingSystemPropertiesSapientGeneratedTest {

	private final BiConsumer biConsumerMock = mock(BiConsumer.class);

	private final DataSize dataSizeMock = mock(DataSize.class);

	private final DataSize dataSizeMock2 = mock(DataSize.class);

	private final DataSize dataSizeMock3 = mock(DataSize.class);

	private final DataSize dataSizeMock4 = mock(DataSize.class);

	private final Environment environmentMock = mock(Environment.class);

	private final Function functionMock = mock(Function.class);

	private final LogFile logFileMock = mock(LogFile.class);

	private final PropertyResolver resolverMock = mock(PropertyResolver.class);

	//Sapient generated method id: ${52c5a6a5-b6e9-3e13-86f6-b884cf97a50a}, hash: 79C9942275FD9E604321492A9630F27E
	@Test()
	void getDefaultCharsetTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			LogbackLoggingSystemProperties target = new LogbackLoggingSystemProperties(environmentMock, functionMock, biConsumerMock);
			//Act Statement(s)
			Charset result = target.getDefaultCharset();
			Charset charset = Charset.defaultCharset();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(charset));
				_assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${02da95e5-6a7b-3058-8b08-207e6e47cb17}, hash: E20327D7351F25CF744E3B29A3D87D8B
	@Test()
	void apply2WhenJBOSS_LOGGING_PRESENTAndValueIsNullAndValueIsNull() {
		/* Branches:
		 * (resolver.getProperty("logging.include-application-name", Boolean.class, Boolean.TRUE)) : true  #  inside setApplicationNameSystemProperty method
		 * (StringUtils.hasText(applicationName)) : true  #  inside setApplicationNameSystemProperty method
		 * (property.getApplicationPropertyName() != null) : true  #  inside setSystemProperty method
		 * (value != null) : true  #  inside setSystemProperty method
		 * (value != null) : false  #  inside setSystemProperty method
		 * (logFile != null) : false  #  inside apply method
		 * (JBOSS_LOGGING_PRESENT) : true  #  inside applyJBossLoggingProperties method
		 * (value != null) : false  #  inside applyRollingPolicy method
		 * (value != null) : false  #  inside applyRollingPolicy method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(true).when(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
			doReturn("A").when(resolverMock).getProperty("spring.application.name");
			doReturn("return_of_getProperty1").when(resolverMock).getProperty("key1");
			doReturn(null).when(resolverMock).getProperty("key1", String.class);
			doReturn(null).when(resolverMock).getProperty("key1", DataSize.class);
			_assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			LogbackLoggingSystemProperties target = new LogbackLoggingSystemProperties(environmentMock, functionMock, biConsumerMock);
			LogFile logFile = null;
			//Act Statement(s)
			target.apply(logFile, resolverMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
				verify(resolverMock).getProperty("spring.application.name");
				verify(resolverMock).getProperty("key1");
				verify(resolverMock, times(6)).getProperty("key1", String.class);
				verify(resolverMock, times(4)).getProperty("key1", DataSize.class);
				_assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3398f6d6-1e27-30c6-bd0a-a77f52a1559b}, hash: 19B01B0A6C082CFF5A21971AA6F15FE7
	@Test()
	void apply2WhenValueInstanceOfDataSize() {
		/* Branches:
		 * (resolver.getProperty("logging.include-application-name", Boolean.class, Boolean.TRUE)) : true  #  inside setApplicationNameSystemProperty method
		 * (StringUtils.hasText(applicationName)) : true  #  inside setApplicationNameSystemProperty method
		 * (property.getApplicationPropertyName() != null) : true  #  inside setSystemProperty method
		 * (value != null) : true  #  inside setSystemProperty method
		 * (value != null) : false  #  inside setSystemProperty method
		 * (logFile != null) : true  #  inside apply method
		 * (JBOSS_LOGGING_PRESENT) : true  #  inside applyJBossLoggingProperties method
		 * (value != null) : true  #  inside applyRollingPolicy method
		 * (value != null) : true  #  inside applyRollingPolicy method
		 * (value instanceof DataSize dataSize) : true  #  inside applyRollingPolicy method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DataSize dataSizeMock5 = mock(DataSize.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			DataSize dataSize = null;
			doNothing().when(logFileMock).applyToSystemProperties();
			doReturn(true).when(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
			doReturn("A").when(resolverMock).getProperty("spring.application.name");
			doReturn("return_of_getProperty1").when(resolverMock).getProperty("key1");
			doReturn(8L).when(dataSizeMock).toBytes();
			doReturn(2L).when(dataSizeMock2).toBytes();
			doReturn(8L).when(dataSizeMock3).toBytes();
			doReturn(dataSizeMock3, dataSizeMock4).when(resolverMock).getProperty("key1", DataSize.class);
			doReturn(8L).when(dataSizeMock4).toBytes();
			doReturn(dataSizeMock, dataSizeMock2, dataSize, dataSizeMock5).when(resolverMock).getProperty("key1", String.class);
			doReturn(8L).when(dataSizeMock5).toBytes();
			_assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			LogbackLoggingSystemProperties target = new LogbackLoggingSystemProperties(environmentMock, functionMock, biConsumerMock);
			//Act Statement(s)
			target.apply(logFileMock, resolverMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(logFileMock).applyToSystemProperties();
				verify(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
				verify(resolverMock).getProperty("spring.application.name");
				verify(resolverMock, times(10)).getProperty("key1");
				verify(resolverMock, times(4)).getProperty("key1", String.class);
				verify(dataSizeMock).toBytes();
				verify(dataSizeMock2).toBytes();
				verify(resolverMock, times(2)).getProperty("key1", DataSize.class);
				verify(dataSizeMock3).toBytes();
				verify(dataSizeMock4).toBytes();
				verify(dataSizeMock5).toBytes();
				_assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${5891bf4b-5390-3126-ac17-af9316ad1f15}, hash: 07BB9AB69DCD8A2D288F8DD4061B8E91
	@Test()
	void apply2WhenLogFileIsNotNullAndJBOSS_LOGGING_PRESENTAndValueIsNotNullAndValueIsNotNullAndValueInstanceOfDataSize4() {
		/* Branches:
		 * (resolver.getProperty("logging.include-application-name", Boolean.class, Boolean.TRUE)) : true  #  inside setApplicationNameSystemProperty method
		 * (StringUtils.hasText(applicationName)) : true  #  inside setApplicationNameSystemProperty method
		 * (property.getApplicationPropertyName() != null) : true  #  inside setSystemProperty method
		 * (value != null) : true  #  inside setSystemProperty method
		 * (value != null) : false  #  inside setSystemProperty method
		 * (logFile != null) : true  #  inside apply method
		 * (JBOSS_LOGGING_PRESENT) : true  #  inside applyJBossLoggingProperties method
		 * (value != null) : true  #  inside applyRollingPolicy method
		 * (value != null) : true  #  inside applyRollingPolicy method
		 * (value instanceof DataSize dataSize) : true  #  inside applyRollingPolicy method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Object objectMock = mock(Object.class, "getProperty_object5");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doNothing().when(logFileMock).applyToSystemProperties();
			doReturn(true).when(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
			doReturn("A").when(resolverMock).getProperty("spring.application.name");
			doReturn("return_of_getProperty1").when(resolverMock).getProperty("key1");
			doReturn(2L).when(dataSizeMock).toBytes();
			doReturn(8L).when(dataSizeMock2).toBytes();
			doReturn(8L).when(dataSizeMock3).toBytes();
			doReturn(dataSizeMock3, dataSizeMock4).when(resolverMock).getProperty("key1", DataSize.class);
			doReturn(8L).when(dataSizeMock4).toBytes();
			doReturn(dataSizeMock, dataSizeMock2, objectMock).when(resolverMock).getProperty("key1", String.class);
			_assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			LogbackLoggingSystemProperties target = new LogbackLoggingSystemProperties(environmentMock, functionMock, biConsumerMock);
			//Act Statement(s)
			target.apply(logFileMock, resolverMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(logFileMock).applyToSystemProperties();
				verify(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
				verify(resolverMock).getProperty("spring.application.name");
				verify(resolverMock, times(10)).getProperty("key1");
				verify(resolverMock, times(3)).getProperty("key1", String.class);
				verify(dataSizeMock).toBytes();
				verify(dataSizeMock2).toBytes();
				verify(resolverMock, times(2)).getProperty("key1", DataSize.class);
				verify(dataSizeMock3).toBytes();
				verify(dataSizeMock4).toBytes();
				_assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${6a67ae97-5e8b-3c69-9cd1-e80da8eadabc}, hash: 530D1276805995C59D09C1225414E8C9
	@Test()
	void apply2WhenLogFileIsNotNullAndJBOSS_LOGGING_PRESENTAndValueIsNotNullAndValueIsNotNullAndValueInstanceOfDataSize7() {
		/* Branches:
		 * (resolver.getProperty("logging.include-application-name", Boolean.class, Boolean.TRUE)) : true  #  inside setApplicationNameSystemProperty method
		 * (StringUtils.hasText(applicationName)) : true  #  inside setApplicationNameSystemProperty method
		 * (property.getApplicationPropertyName() != null) : true  #  inside setSystemProperty method
		 * (value != null) : true  #  inside setSystemProperty method
		 * (value != null) : false  #  inside setSystemProperty method
		 * (logFile != null) : true  #  inside apply method
		 * (JBOSS_LOGGING_PRESENT) : true  #  inside applyJBossLoggingProperties method
		 * (value != null) : true  #  inside applyRollingPolicy method
		 * (value != null) : true  #  inside applyRollingPolicy method
		 * (value instanceof DataSize dataSize) : true  #  inside applyRollingPolicy method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Object objectMock = mock(Object.class, "getProperty_object4");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Object object = null;
			doNothing().when(logFileMock).applyToSystemProperties();
			doReturn(true).when(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
			doReturn("A").when(resolverMock).getProperty("spring.application.name");
			doReturn("return_of_getProperty1").when(resolverMock).getProperty("key1");
			doReturn(8L).when(dataSizeMock).toBytes();
			doReturn(8L).when(dataSizeMock2).toBytes();
			doReturn(8L).when(dataSizeMock3).toBytes();
			doReturn(dataSizeMock3, objectMock).when(resolverMock).getProperty("key1", DataSize.class);
			doReturn(dataSizeMock, dataSizeMock2, object, object).when(resolverMock).getProperty("key1", String.class);
			_assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			LogbackLoggingSystemProperties target = new LogbackLoggingSystemProperties(environmentMock, functionMock, biConsumerMock);
			//Act Statement(s)
			target.apply(logFileMock, resolverMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(logFileMock).applyToSystemProperties();
				verify(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
				verify(resolverMock).getProperty("spring.application.name");
				verify(resolverMock, times(10)).getProperty("key1");
				verify(resolverMock, times(4)).getProperty("key1", String.class);
				verify(dataSizeMock).toBytes();
				verify(dataSizeMock2).toBytes();
				verify(resolverMock, times(2)).getProperty("key1", DataSize.class);
				verify(dataSizeMock3).toBytes();
				_assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${9b2c6dfa-251c-3002-b14f-90eef9aea498}, hash: AD4E75904DF66814A4B2E006E776B67C
	@Test()
	void apply2WhenLogFileIsNotNullAndJBOSS_LOGGING_PRESENTAndValueIsNotNullAndValueIsNotNullAndValueInstanceOfDataSize9() {
		/* Branches:
		 * (resolver.getProperty("logging.include-application-name", Boolean.class, Boolean.TRUE)) : true  #  inside setApplicationNameSystemProperty method
		 * (StringUtils.hasText(applicationName)) : true  #  inside setApplicationNameSystemProperty method
		 * (property.getApplicationPropertyName() != null) : true  #  inside setSystemProperty method
		 * (value != null) : true  #  inside setSystemProperty method
		 * (value != null) : false  #  inside setSystemProperty method
		 * (logFile != null) : true  #  inside apply method
		 * (JBOSS_LOGGING_PRESENT) : true  #  inside applyJBossLoggingProperties method
		 * (value != null) : true  #  inside applyRollingPolicy method
		 * (value != null) : true  #  inside applyRollingPolicy method
		 * (value instanceof DataSize dataSize) : true  #  inside applyRollingPolicy method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Object objectMock = mock(Object.class, "getProperty_object3");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Object object = null;
			Object object2 = null;
			doNothing().when(logFileMock).applyToSystemProperties();
			doReturn(true).when(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
			doReturn("A").when(resolverMock).getProperty("spring.application.name");
			doReturn("return_of_getProperty1").when(resolverMock).getProperty("key1");
			doReturn(8L).when(dataSizeMock).toBytes();
			doReturn(8L).when(dataSizeMock2).toBytes();
			doReturn(objectMock, object, object).when(resolverMock).getProperty("key1", DataSize.class);
			doReturn(dataSizeMock, dataSizeMock2, object2, object2).when(resolverMock).getProperty("key1", String.class);
			_assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			LogbackLoggingSystemProperties target = new LogbackLoggingSystemProperties(environmentMock, functionMock, biConsumerMock);
			//Act Statement(s)
			target.apply(logFileMock, resolverMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(logFileMock).applyToSystemProperties();
				verify(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
				verify(resolverMock).getProperty("spring.application.name");
				verify(resolverMock, times(10)).getProperty("key1");
				verify(resolverMock, times(4)).getProperty("key1", String.class);
				verify(dataSizeMock).toBytes();
				verify(dataSizeMock2).toBytes();
				verify(resolverMock, times(3)).getProperty("key1", DataSize.class);
				_assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${fb44a263-300b-36e2-8b26-e719fe1f3a86}, hash: 80FABAC42E90B86F801E770E82D647E5
	@Test()
	void apply2WhenLogFileIsNotNullAndJBOSS_LOGGING_PRESENTAndValueIsNotNullAndValueIsNotNullAndValueInstanceOfDataSize11() {
		/* Branches:
		 * (resolver.getProperty("logging.include-application-name", Boolean.class, Boolean.TRUE)) : true  #  inside setApplicationNameSystemProperty method
		 * (StringUtils.hasText(applicationName)) : true  #  inside setApplicationNameSystemProperty method
		 * (property.getApplicationPropertyName() != null) : true  #  inside setSystemProperty method
		 * (value != null) : true  #  inside setSystemProperty method
		 * (value != null) : false  #  inside setSystemProperty method
		 * (logFile != null) : true  #  inside apply method
		 * (JBOSS_LOGGING_PRESENT) : true  #  inside applyJBossLoggingProperties method
		 * (value != null) : true  #  inside applyRollingPolicy method
		 * (value != null) : true  #  inside applyRollingPolicy method
		 * (value instanceof DataSize dataSize) : true  #  inside applyRollingPolicy method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Object objectMock = mock(Object.class, "getProperty_object2");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Object object = null;
			doNothing().when(logFileMock).applyToSystemProperties();
			doReturn(true).when(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
			doReturn("A").when(resolverMock).getProperty("spring.application.name");
			doReturn("return_of_getProperty1").when(resolverMock).getProperty("key1");
			doReturn(8L).when(dataSizeMock).toBytes();
			doReturn(null).when(resolverMock).getProperty("key1", DataSize.class);
			doReturn(dataSizeMock, objectMock, object, object).when(resolverMock).getProperty("key1", String.class);
			_assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			LogbackLoggingSystemProperties target = new LogbackLoggingSystemProperties(environmentMock, functionMock, biConsumerMock);
			//Act Statement(s)
			target.apply(logFileMock, resolverMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(logFileMock).applyToSystemProperties();
				verify(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
				verify(resolverMock).getProperty("spring.application.name");
				verify(resolverMock, times(10)).getProperty("key1");
				verify(resolverMock, times(4)).getProperty("key1", String.class);
				verify(dataSizeMock).toBytes();
				verify(resolverMock, times(4)).getProperty("key1", DataSize.class);
				_assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${9824404d-1fa0-3f90-9273-ae8a6a8506d4}, hash: A555A046E2B0E505BD6C4DF14CE2C448
	@Test()
	void apply2WhenValueNotInstanceOfDataSize() {
		/* Branches:
		 * (resolver.getProperty("logging.include-application-name", Boolean.class, Boolean.TRUE)) : true  #  inside setApplicationNameSystemProperty method
		 * (StringUtils.hasText(applicationName)) : true  #  inside setApplicationNameSystemProperty method
		 * (property.getApplicationPropertyName() != null) : true  #  inside setSystemProperty method
		 * (value != null) : true  #  inside setSystemProperty method
		 * (value != null) : false  #  inside setSystemProperty method
		 * (logFile != null) : true  #  inside apply method
		 * (JBOSS_LOGGING_PRESENT) : true  #  inside applyJBossLoggingProperties method
		 * (value != null) : true  #  inside applyRollingPolicy method
		 * (value != null) : true  #  inside applyRollingPolicy method
		 * (value instanceof DataSize dataSize) : false  #  inside applyRollingPolicy method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Object objectMock = mock(Object.class, "getProperty_object1");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Object object = null;
			doNothing().when(logFileMock).applyToSystemProperties();
			doReturn(true).when(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
			doReturn("A").when(resolverMock).getProperty("spring.application.name");
			doReturn("return_of_getProperty1").when(resolverMock).getProperty("key1");
			doReturn(objectMock, object, object, object, object).when(resolverMock).getProperty("key1", String.class);
			doReturn(null).when(resolverMock).getProperty("key1", DataSize.class);
			_assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			LogbackLoggingSystemProperties target = new LogbackLoggingSystemProperties(environmentMock, functionMock, biConsumerMock);
			//Act Statement(s)
			target.apply(logFileMock, resolverMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(logFileMock).applyToSystemProperties();
				verify(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
				verify(resolverMock).getProperty("spring.application.name");
				verify(resolverMock, times(10)).getProperty("key1");
				verify(resolverMock, times(5)).getProperty("key1", String.class);
				verify(resolverMock, times(4)).getProperty("key1", DataSize.class);
				_assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${e20f4415-6bb0-356f-933d-31cf081fd91b}, hash: AF07774F90FAE630F1B204381721906A
	@Test()
	void apply2WhenTypeNotEqualsDataSizeThrowsConversionException() {
		/* Branches:
		 * (resolver.getProperty("logging.include-application-name", Boolean.class, Boolean.TRUE)) : false  #  inside setApplicationNameSystemProperty method
		 * (property.getApplicationPropertyName() != null) : false  #  inside setSystemProperty method
		 * (value != null) : false  #  inside setSystemProperty method
		 * (value != null) : false  #  inside setSystemProperty method
		 * (logFile != null) : true  #  inside apply method
		 * (JBOSS_LOGGING_PRESENT) : true  #  inside applyJBossLoggingProperties method
		 * (value != null) : false  #  inside applyRollingPolicy method
		 * (value != null) : false  #  inside applyRollingPolicy method
		 * (value instanceof DataSize dataSize) : true  #  inside applyRollingPolicy method
		 * (catch-exception (ConversionFailedException | ConverterNotFoundException)) : true  #  inside getProperty method
		 * (type != DataSize.class) : true  #  inside getProperty method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Object object2 = null;
			doNothing().when(logFileMock).applyToSystemProperties();
			doReturn(false).when(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
			doReturn(2L).when(dataSizeMock).toBytes();
			doReturn(dataSizeMock, dataSizeMock2).when(resolverMock).getProperty("key1", DataSize.class);
			doReturn(2L).when(dataSizeMock2).toBytes();
			Object object = new Object();
			doReturn(null, object2, object2, object2, object).when(resolverMock).getProperty("key1", String.class);
			_assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			LogbackLoggingSystemProperties target = new LogbackLoggingSystemProperties(environmentMock, functionMock, biConsumerMock);
			//Act Statement(s)
			final ConversionException result = assertThrows(ConversionException.class, () -> {
				target.apply(logFileMock, resolverMock);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(logFileMock).applyToSystemProperties();
				verify(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
				verify(resolverMock, times(5)).getProperty("key1", String.class);
				verify(resolverMock, times(2)).getProperty("key1", DataSize.class);
				verify(dataSizeMock).toBytes();
				verify(dataSizeMock2).toBytes();
				_assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
			});
		}
	}
}
