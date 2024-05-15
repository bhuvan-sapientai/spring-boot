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
import org.junit.jupiter.api.Disabled;

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

    //Sapient generated method id: ${getDefaultCharsetTest}, hash: 79C9942275FD9E604321492A9630F27E
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

    //Sapient generated method id: ${apply2WhenJBOSS_LOGGING_PRESENTAndValueIsNullAndValueIsNull}, hash: E20327D7351F25CF744E3B29A3D87D8B
    @Disabled()
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

    //Sapient generated method id: ${apply2WhenValueInstanceOfDataSize}, hash: 19B01B0A6C082CFF5A21971AA6F15FE7
    @Disabled()
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

    //Sapient generated method id: ${apply2WhenLogFileIsNotNullAndJBOSS_LOGGING_PRESENTAndValueIsNotNullAndValueIsNotNullAndValueInstanceOfDataSize4}, hash: 592709DF0997D75E60347A87E6FEEC69
    @Disabled()
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
        Object objectMock = mock(Object.class, "object6");
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doNothing().when(logFileMock).applyToSystemProperties();
            doReturn(true).when(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
            doReturn("A").when(resolverMock).getProperty("spring.application.name");
            doReturn("return_of_getProperty1").when(resolverMock).getProperty("key1");
            doReturn(2L).when(dataSizeMock).toBytes();
            doReturn(2L).when(dataSizeMock2).toBytes();
            doReturn(2L).when(dataSizeMock3).toBytes();
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

    //Sapient generated method id: ${apply2WhenLogFileIsNotNullAndJBOSS_LOGGING_PRESENTAndValueIsNotNullAndValueIsNotNullAndValueInstanceOfDataSize7}, hash: 60088E1E5EF3CB36FDCBB2F566E7D1B3
    @Disabled()
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
        Object objectMock = mock(Object.class, "object5");
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Object object = null;
            doNothing().when(logFileMock).applyToSystemProperties();
            doReturn(true).when(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
            doReturn("A").when(resolverMock).getProperty("spring.application.name");
            doReturn("return_of_getProperty1").when(resolverMock).getProperty("key1");
            doReturn(2L).when(dataSizeMock).toBytes();
            doReturn(2L).when(dataSizeMock2).toBytes();
            doReturn(2L).when(dataSizeMock3).toBytes();
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

    //Sapient generated method id: ${apply2WhenLogFileIsNotNullAndJBOSS_LOGGING_PRESENTAndValueIsNotNullAndValueIsNotNullAndValueInstanceOfDataSize9}, hash: E709A409883F35301553F4625A5C959F
    @Disabled()
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
        Object objectMock = mock(Object.class, "object4");
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Object object = null;
            Object object2 = null;
            doNothing().when(logFileMock).applyToSystemProperties();
            doReturn(true).when(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
            doReturn("A").when(resolverMock).getProperty("spring.application.name");
            doReturn("return_of_getProperty1").when(resolverMock).getProperty("key1");
            doReturn(8L).when(dataSizeMock).toBytes();
            doReturn(2L).when(dataSizeMock2).toBytes();
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

    //Sapient generated method id: ${apply2WhenLogFileIsNotNullAndJBOSS_LOGGING_PRESENTAndValueIsNotNullAndValueIsNotNullAndValueInstanceOfDataSize11}, hash: 91D0EBBFA7CCE4CA3C51870299175841
    @Disabled()
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
        Object objectMock = mock(Object.class, "object3");
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Object object = null;
            doNothing().when(logFileMock).applyToSystemProperties();
            doReturn(true).when(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
            doReturn("A").when(resolverMock).getProperty("spring.application.name");
            doReturn("return_of_getProperty1").when(resolverMock).getProperty("key1");
            doReturn(2L).when(dataSizeMock).toBytes();
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

    //Sapient generated method id: ${apply2WhenValueNotInstanceOfDataSize}, hash: B44488214463550960BC1F038BFE421B
    @Disabled()
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
        Object objectMock = mock(Object.class, "object2");
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

    //Sapient generated method id: ${apply2WhenTypeNotEqualsDataSizeThrowsConversionException}, hash: AF07774F90FAE630F1B204381721906A
    @Disabled()
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
