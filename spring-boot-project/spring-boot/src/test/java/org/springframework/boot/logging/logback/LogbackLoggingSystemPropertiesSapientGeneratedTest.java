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
import static org.mockito.Mockito.spy;
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

	private final DataSize dataSizeMock = mock(DataSize.class);

	private final DataSize dataSizeMock2 = mock(DataSize.class);

	private final DataSize dataSizeMock3 = mock(DataSize.class);

	private final DataSize dataSizeMock4 = mock(DataSize.class);

	private final Environment environmentMock = mock(Environment.class);

	private final LogFile logFileMock = mock(LogFile.class);

	private final PropertyResolver resolverMock = mock(PropertyResolver.class);

	//Sapient generated method id: ${52c5a6a5-b6e9-3e13-86f6-b884cf97a50a}
	@Test()
	void getDefaultCharsetTest() {
		//Arrange Statement(s)
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    _assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    LogbackLoggingSystemProperties target = new LogbackLoggingSystemProperties(environmentMock, (Function) null, (BiConsumer) null);
    //Act Statement(s)
    Charset result = target.getDefaultCharset();
    Charset charset = Charset.defaultCharset();
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, equalTo(charset));
        _assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${3814e68e-9c7c-3efd-a05f-5494e290e26d}
	@Test()
	void apply2WhenNotJBOSS_LOGGING_PRESENTAndValueIsNullAndValueIsNull() {
		/* Branches:
		 * (resolver.getProperty("logging.include-application-name", Boolean.class, Boolean.TRUE)) : true  #  inside setApplicationNameSystemProperty method
		 * (StringUtils.hasText(applicationName)) : true  #  inside setApplicationNameSystemProperty method
		 * (property.getApplicationPropertyName() != null) : true  #  inside setSystemProperty method
		 * (value != null) : true  #  inside setSystemProperty method
		 * (value != null) : false  #  inside setSystemProperty method
		 * (logFile != null) : false  #  inside apply method
		 * (JBOSS_LOGGING_PRESENT) : false  #  inside applyJBossLoggingProperties method
		 * (value != null) : false  #  inside applyRollingPolicy method
		 * (value != null) : false  #  inside applyRollingPolicy method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    doReturn(true).when(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
    doReturn("A").when(resolverMock).getProperty("spring.application.name");
    doReturn("return_of_getProperty1").when(resolverMock).getProperty("arg0");
    doReturn(null).when(resolverMock).getProperty("arg0", Object.class);
    _assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    LogbackLoggingSystemProperties target = new LogbackLoggingSystemProperties(environmentMock, (Function) null, (BiConsumer) null);
    LogFile logFile = null;
    //Act Statement(s)
    target.apply(logFile, resolverMock);
    //Assert statement(s)
    assertAll("result", () -> {
        verify(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
        verify(resolverMock).getProperty("spring.application.name");
        verify(resolverMock).getProperty("arg0");
        verify(resolverMock, times(10)).getProperty("arg0", Object.class);
        _assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${3398f6d6-1e27-30c6-bd0a-a77f52a1559b}
	@Test()
	void apply2WhenValueInstanceOfDataSize() {
		/* Branches:
		 * (resolver.getProperty("logging.include-application-name", Boolean.class, Boolean.TRUE)) : true  #  inside setApplicationNameSystemProperty method
		 * (StringUtils.hasText(applicationName)) : true  #  inside setApplicationNameSystemProperty method
		 * (property.getApplicationPropertyName() != null) : true  #  inside setSystemProperty method
		 * (value != null) : true  #  inside setSystemProperty method
		 * (value != null) : false  #  inside setSystemProperty method
		 * (logFile != null) : true  #  inside apply method
		 * (JBOSS_LOGGING_PRESENT) : false  #  inside applyJBossLoggingProperties method
		 * (value != null) : true  #  inside applyRollingPolicy method
		 * (value != null) : true  #  inside applyRollingPolicy method
		 * (value instanceof DataSize dataSize) : true  #  inside applyRollingPolicy method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//DataSize dataSizeMock5 = mock(DataSize.class);
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    DataSize dataSize = null;
    doNothing().when(logFileMock).applyToSystemProperties();
    doReturn(true).when(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
    doReturn("A").when(resolverMock).getProperty("spring.application.name");
    doReturn("return_of_getProperty1").when(resolverMock).getProperty("arg0");
    doReturn(8L).when(dataSizeMock).toBytes();
    doReturn(2L).when(dataSizeMock2).toBytes();
    doReturn(8L).when(dataSizeMock3).toBytes();
    doReturn(8L).when(dataSizeMock4).toBytes();
    doReturn(dataSizeMock, dataSizeMock2, dataSizeMock3, dataSizeMock4, dataSize, dataSizeMock5).when(resolverMock).getProperty("arg0", Object.class);
    doReturn(8L).when(dataSizeMock5).toBytes();
    _assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    LogbackLoggingSystemProperties target = spy(new LogbackLoggingSystemProperties(environmentMock, (Function) null, (BiConsumer) null));
    doNothing().when(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_FILE_NAME_PATTERN", "8");
    doNothing().when(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_CLEAN_HISTORY_ON_START", "2");
    doNothing().when(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_MAX_FILE_SIZE", "8");
    doNothing().when(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_TOTAL_SIZE_CAP", "8");
    doNothing().when(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_MAX_HISTORY", "8");
    //Act Statement(s)
    target.apply(logFileMock, resolverMock);
    //Assert statement(s)
    assertAll("result", () -> {
        verify(logFileMock).applyToSystemProperties();
        verify(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
        verify(resolverMock).getProperty("spring.application.name");
        verify(resolverMock, times(10)).getProperty("arg0");
        verify(resolverMock, times(6)).getProperty("arg0", Object.class);
        verify(dataSizeMock).toBytes();
        verify(dataSizeMock2).toBytes();
        verify(dataSizeMock3).toBytes();
        verify(dataSizeMock4).toBytes();
        verify(dataSizeMock5).toBytes();
        _assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
        verify(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_FILE_NAME_PATTERN", "8");
        verify(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_CLEAN_HISTORY_ON_START", "2");
        verify(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_MAX_FILE_SIZE", "8");
        verify(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_TOTAL_SIZE_CAP", "8");
        verify(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_MAX_HISTORY", "8");
    });
}*/
	}

	//Sapient generated method id: ${6722c608-9e3e-35d2-9c48-62da2bad2628}
	@Test()
	void apply2WhenLogFileIsNotNullAndNotJBOSS_LOGGING_PRESENTAndValueIsNotNullAndValueIsNotNullAndValueInstanceOfDataSize4() {
		/* Branches:
		 * (resolver.getProperty("logging.include-application-name", Boolean.class, Boolean.TRUE)) : true  #  inside setApplicationNameSystemProperty method
		 * (StringUtils.hasText(applicationName)) : true  #  inside setApplicationNameSystemProperty method
		 * (property.getApplicationPropertyName() != null) : true  #  inside setSystemProperty method
		 * (value != null) : true  #  inside setSystemProperty method
		 * (value != null) : false  #  inside setSystemProperty method
		 * (logFile != null) : true  #  inside apply method
		 * (JBOSS_LOGGING_PRESENT) : false  #  inside applyJBossLoggingProperties method
		 * (value != null) : true  #  inside applyRollingPolicy method
		 * (value != null) : true  #  inside applyRollingPolicy method
		 * (value instanceof DataSize dataSize) : true  #  inside applyRollingPolicy method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    doNothing().when(logFileMock).applyToSystemProperties();
    doReturn(true).when(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
    doReturn("A").when(resolverMock).getProperty("spring.application.name");
    doReturn("return_of_getProperty1").when(resolverMock).getProperty("arg0");
    doReturn(8L).when(dataSizeMock).toBytes();
    doReturn(8L).when(dataSizeMock2).toBytes();
    doReturn(8L).when(dataSizeMock3).toBytes();
    doReturn(2L).when(dataSizeMock4).toBytes();
    Object object = new Object();
    doReturn(dataSizeMock, dataSizeMock2, dataSizeMock3, dataSizeMock4, object).when(resolverMock).getProperty("arg0", Object.class);
    _assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    LogbackLoggingSystemProperties target = spy(new LogbackLoggingSystemProperties(environmentMock, (Function) null, (BiConsumer) null));
    doNothing().when(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_FILE_NAME_PATTERN", "8");
    doNothing().when(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_CLEAN_HISTORY_ON_START", "8");
    doNothing().when(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_MAX_FILE_SIZE", "8");
    doNothing().when(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_TOTAL_SIZE_CAP", "2");
    doNothing().when(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_MAX_HISTORY", "value1");
    //Act Statement(s)
    target.apply(logFileMock, resolverMock);
    //Assert statement(s)
    assertAll("result", () -> {
        verify(logFileMock).applyToSystemProperties();
        verify(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
        verify(resolverMock).getProperty("spring.application.name");
        verify(resolverMock, times(10)).getProperty("arg0");
        verify(resolverMock, times(5)).getProperty("arg0", Object.class);
        verify(dataSizeMock).toBytes();
        verify(dataSizeMock2).toBytes();
        verify(dataSizeMock3).toBytes();
        verify(dataSizeMock4).toBytes();
        _assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
        verify(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_FILE_NAME_PATTERN", "8");
        verify(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_CLEAN_HISTORY_ON_START", "8");
        verify(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_MAX_FILE_SIZE", "8");
        verify(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_TOTAL_SIZE_CAP", "2");
        verify(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_MAX_HISTORY", "value1");
    });
}*/
	}

	//Sapient generated method id: ${b6ee2ba2-2454-3fef-a6f1-c23c549723b8}
	@Test()
	void apply2WhenLogFileIsNotNullAndNotJBOSS_LOGGING_PRESENTAndValueIsNotNullAndValueIsNotNullAndValueInstanceOfDataSize7() {
		/* Branches:
		 * (resolver.getProperty("logging.include-application-name", Boolean.class, Boolean.TRUE)) : true  #  inside setApplicationNameSystemProperty method
		 * (StringUtils.hasText(applicationName)) : true  #  inside setApplicationNameSystemProperty method
		 * (property.getApplicationPropertyName() != null) : true  #  inside setSystemProperty method
		 * (value != null) : true  #  inside setSystemProperty method
		 * (value != null) : false  #  inside setSystemProperty method
		 * (logFile != null) : true  #  inside apply method
		 * (JBOSS_LOGGING_PRESENT) : false  #  inside applyJBossLoggingProperties method
		 * (value != null) : true  #  inside applyRollingPolicy method
		 * (value != null) : true  #  inside applyRollingPolicy method
		 * (value instanceof DataSize dataSize) : true  #  inside applyRollingPolicy method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    Object object2 = null;
    doNothing().when(logFileMock).applyToSystemProperties();
    doReturn(true).when(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
    doReturn("A").when(resolverMock).getProperty("spring.application.name");
    doReturn("return_of_getProperty1").when(resolverMock).getProperty("arg0");
    doReturn(8L).when(dataSizeMock).toBytes();
    doReturn(8L).when(dataSizeMock2).toBytes();
    doReturn(2L).when(dataSizeMock3).toBytes();
    Object object = new Object();
    doReturn(dataSizeMock, dataSizeMock2, dataSizeMock3, object, object2, object2).when(resolverMock).getProperty("arg0", Object.class);
    _assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    LogbackLoggingSystemProperties target = spy(new LogbackLoggingSystemProperties(environmentMock, (Function) null, (BiConsumer) null));
    doNothing().when(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_FILE_NAME_PATTERN", "8");
    doNothing().when(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_CLEAN_HISTORY_ON_START", "8");
    doNothing().when(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_MAX_FILE_SIZE", "2");
    doNothing().when(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_TOTAL_SIZE_CAP", "value1");
    //Act Statement(s)
    target.apply(logFileMock, resolverMock);
    //Assert statement(s)
    assertAll("result", () -> {
        verify(logFileMock).applyToSystemProperties();
        verify(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
        verify(resolverMock).getProperty("spring.application.name");
        verify(resolverMock, times(10)).getProperty("arg0");
        verify(resolverMock, times(6)).getProperty("arg0", Object.class);
        verify(dataSizeMock).toBytes();
        verify(dataSizeMock2).toBytes();
        verify(dataSizeMock3).toBytes();
        _assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
        verify(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_FILE_NAME_PATTERN", "8");
        verify(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_CLEAN_HISTORY_ON_START", "8");
        verify(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_MAX_FILE_SIZE", "2");
        verify(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_TOTAL_SIZE_CAP", "value1");
    });
}*/
	}

	//Sapient generated method id: ${e53b04ed-72af-3a42-94d7-3dc5b04cb64d}
	@Test()
	void apply2WhenLogFileIsNotNullAndNotJBOSS_LOGGING_PRESENTAndValueIsNotNullAndValueIsNotNullAndValueInstanceOfDataSize9() {
		/* Branches:
		 * (resolver.getProperty("logging.include-application-name", Boolean.class, Boolean.TRUE)) : true  #  inside setApplicationNameSystemProperty method
		 * (StringUtils.hasText(applicationName)) : true  #  inside setApplicationNameSystemProperty method
		 * (property.getApplicationPropertyName() != null) : true  #  inside setSystemProperty method
		 * (value != null) : true  #  inside setSystemProperty method
		 * (value != null) : false  #  inside setSystemProperty method
		 * (logFile != null) : true  #  inside apply method
		 * (JBOSS_LOGGING_PRESENT) : false  #  inside applyJBossLoggingProperties method
		 * (value != null) : true  #  inside applyRollingPolicy method
		 * (value != null) : true  #  inside applyRollingPolicy method
		 * (value instanceof DataSize dataSize) : true  #  inside applyRollingPolicy method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    Object object2 = null;
    doNothing().when(logFileMock).applyToSystemProperties();
    doReturn(true).when(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
    doReturn("A").when(resolverMock).getProperty("spring.application.name");
    doReturn("return_of_getProperty1").when(resolverMock).getProperty("arg0");
    doReturn(8L).when(dataSizeMock).toBytes();
    doReturn(2L).when(dataSizeMock2).toBytes();
    Object object = new Object();
    doReturn(dataSizeMock, dataSizeMock2, object, object2, object2, object2, object2).when(resolverMock).getProperty("arg0", Object.class);
    _assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    LogbackLoggingSystemProperties target = spy(new LogbackLoggingSystemProperties(environmentMock, (Function) null, (BiConsumer) null));
    doNothing().when(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_FILE_NAME_PATTERN", "8");
    doNothing().when(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_CLEAN_HISTORY_ON_START", "2");
    doNothing().when(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_MAX_FILE_SIZE", "value1");
    //Act Statement(s)
    target.apply(logFileMock, resolverMock);
    //Assert statement(s)
    assertAll("result", () -> {
        verify(logFileMock).applyToSystemProperties();
        verify(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
        verify(resolverMock).getProperty("spring.application.name");
        verify(resolverMock, times(10)).getProperty("arg0");
        verify(resolverMock, times(7)).getProperty("arg0", Object.class);
        verify(dataSizeMock).toBytes();
        verify(dataSizeMock2).toBytes();
        _assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
        verify(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_FILE_NAME_PATTERN", "8");
        verify(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_CLEAN_HISTORY_ON_START", "2");
        verify(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_MAX_FILE_SIZE", "value1");
    });
}*/
	}

	//Sapient generated method id: ${50b40a43-b874-3a3e-a024-83999d567f90}
	@Test()
	void apply2WhenLogFileIsNotNullAndNotJBOSS_LOGGING_PRESENTAndValueIsNotNullAndValueIsNotNullAndValueInstanceOfDataSize11() {
		/* Branches:
		 * (resolver.getProperty("logging.include-application-name", Boolean.class, Boolean.TRUE)) : true  #  inside setApplicationNameSystemProperty method
		 * (StringUtils.hasText(applicationName)) : true  #  inside setApplicationNameSystemProperty method
		 * (property.getApplicationPropertyName() != null) : true  #  inside setSystemProperty method
		 * (value != null) : true  #  inside setSystemProperty method
		 * (value != null) : false  #  inside setSystemProperty method
		 * (logFile != null) : true  #  inside apply method
		 * (JBOSS_LOGGING_PRESENT) : false  #  inside applyJBossLoggingProperties method
		 * (value != null) : true  #  inside applyRollingPolicy method
		 * (value != null) : true  #  inside applyRollingPolicy method
		 * (value instanceof DataSize dataSize) : true  #  inside applyRollingPolicy method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    Object object2 = null;
    doNothing().when(logFileMock).applyToSystemProperties();
    doReturn(true).when(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
    doReturn("A").when(resolverMock).getProperty("spring.application.name");
    doReturn("return_of_getProperty1").when(resolverMock).getProperty("arg0");
    doReturn(2L).when(dataSizeMock).toBytes();
    Object object = new Object();
    doReturn(dataSizeMock, object, object2, object2, object2, object2, object2, object2).when(resolverMock).getProperty("arg0", Object.class);
    _assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    LogbackLoggingSystemProperties target = spy(new LogbackLoggingSystemProperties(environmentMock, (Function) null, (BiConsumer) null));
    doNothing().when(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_FILE_NAME_PATTERN", "2");
    doNothing().when(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_CLEAN_HISTORY_ON_START", "value1");
    //Act Statement(s)
    target.apply(logFileMock, resolverMock);
    //Assert statement(s)
    assertAll("result", () -> {
        verify(logFileMock).applyToSystemProperties();
        verify(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
        verify(resolverMock).getProperty("spring.application.name");
        verify(resolverMock, times(10)).getProperty("arg0");
        verify(resolverMock, times(8)).getProperty("arg0", Object.class);
        verify(dataSizeMock).toBytes();
        _assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
        verify(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_FILE_NAME_PATTERN", "2");
        verify(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_CLEAN_HISTORY_ON_START", "value1");
    });
}*/
	}

	//Sapient generated method id: ${9824404d-1fa0-3f90-9273-ae8a6a8506d4}
	@Test()
	void apply2WhenValueNotInstanceOfDataSize() {
		/* Branches:
		 * (resolver.getProperty("logging.include-application-name", Boolean.class, Boolean.TRUE)) : true  #  inside setApplicationNameSystemProperty method
		 * (StringUtils.hasText(applicationName)) : true  #  inside setApplicationNameSystemProperty method
		 * (property.getApplicationPropertyName() != null) : true  #  inside setSystemProperty method
		 * (value != null) : true  #  inside setSystemProperty method
		 * (value != null) : false  #  inside setSystemProperty method
		 * (logFile != null) : true  #  inside apply method
		 * (JBOSS_LOGGING_PRESENT) : false  #  inside applyJBossLoggingProperties method
		 * (value != null) : true  #  inside applyRollingPolicy method
		 * (value != null) : true  #  inside applyRollingPolicy method
		 * (value instanceof DataSize dataSize) : false  #  inside applyRollingPolicy method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    Object object2 = null;
    doNothing().when(logFileMock).applyToSystemProperties();
    doReturn(true).when(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
    doReturn("A").when(resolverMock).getProperty("spring.application.name");
    doReturn("return_of_getProperty1").when(resolverMock).getProperty("arg0");
    Object object = new Object();
    doReturn(object, object2, object2, object2, object2, object2, object2, object2, object2).when(resolverMock).getProperty("arg0", Object.class);
    _assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    LogbackLoggingSystemProperties target = spy(new LogbackLoggingSystemProperties(environmentMock, (Function) null, (BiConsumer) null));
    doNothing().when(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_FILE_NAME_PATTERN", "value1");
    //Act Statement(s)
    target.apply(logFileMock, resolverMock);
    //Assert statement(s)
    assertAll("result", () -> {
        verify(logFileMock).applyToSystemProperties();
        verify(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
        verify(resolverMock).getProperty("spring.application.name");
        verify(resolverMock, times(10)).getProperty("arg0");
        verify(resolverMock, times(9)).getProperty("arg0", Object.class);
        _assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
        verify(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_FILE_NAME_PATTERN", "value1");
    });
}*/
	}

	//Sapient generated method id: ${e20f4415-6bb0-356f-933d-31cf081fd91b}
	@Test()
	void apply2WhenTypeNotEqualsDataSizeThrowsConversionException() {
		/* Branches:
		 * (resolver.getProperty("logging.include-application-name", Boolean.class, Boolean.TRUE)) : false  #  inside setApplicationNameSystemProperty method
		 * (property.getApplicationPropertyName() != null) : false  #  inside setSystemProperty method
		 * (value != null) : false  #  inside setSystemProperty method
		 * (value != null) : false  #  inside setSystemProperty method
		 * (logFile != null) : true  #  inside apply method
		 * (JBOSS_LOGGING_PRESENT) : false  #  inside applyJBossLoggingProperties method
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
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    Object object2 = null;
    doNothing().when(logFileMock).applyToSystemProperties();
    doReturn(false).when(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
    doReturn(2L).when(dataSizeMock).toBytes();
    doReturn(2L).when(dataSizeMock2).toBytes();
    Object object = new Object();
    doReturn(null, object2, object2, object2, dataSizeMock, dataSizeMock2, object).when(resolverMock).getProperty("arg0", Object.class);
    _assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    LogbackLoggingSystemProperties target = spy(new LogbackLoggingSystemProperties(environmentMock, (Function) null, (BiConsumer) null));
    doNothing().when(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_MAX_FILE_SIZE", "2");
    doNothing().when(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_TOTAL_SIZE_CAP", "2");
    //Act Statement(s)
    final ConversionException result = assertThrows(ConversionException.class, () -> {
        target.apply(logFileMock, resolverMock);
    });
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(notNullValue()));
        verify(logFileMock).applyToSystemProperties();
        verify(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
        verify(resolverMock, times(7)).getProperty("arg0", Object.class);
        verify(dataSizeMock).toBytes();
        verify(dataSizeMock2).toBytes();
        _assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
        verify(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_MAX_FILE_SIZE", "2");
        verify(target).setSystemProperty("LOGBACK_ROLLINGPOLICY_TOTAL_SIZE_CAP", "2");
    });
}*/
	}
}
