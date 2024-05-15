package org.springframework.boot.logging.logback;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import ch.qos.logback.core.spi.ScanException;
import ch.qos.logback.core.ConsoleAppender;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.Appender;
import ch.qos.logback.core.rolling.RollingFileAppender;
import ch.qos.logback.core.spi.LifeCycle;
import java.nio.charset.Charset;
import ch.qos.logback.core.util.FileSize;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.util.OptionHelper;
import org.mockito.MockedStatic;
import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy;
import org.springframework.boot.logging.LogFile;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DefaultLogbackConfigurationSapientGeneratedTest {

    private final LogbackConfigurator configMock = mock(LogbackConfigurator.class);

    private final FileSize fileSize2Mock = mock(FileSize.class);

    private final FileSize fileSize2Mock2 = mock(FileSize.class);

    private final LogFile logFileMock = mock(LogFile.class, "logFile");

    private final LoggerContext loggerContextMock = mock(LoggerContext.class);

    private final LoggerContext loggerContextMock10 = mock(LoggerContext.class);

    private final LoggerContext loggerContextMock11 = mock(LoggerContext.class);

    private final LoggerContext loggerContextMock12 = mock(LoggerContext.class);

    private final LoggerContext loggerContextMock13 = mock(LoggerContext.class);

    private final LoggerContext loggerContextMock14 = mock(LoggerContext.class);

    private final LoggerContext loggerContextMock15 = mock(LoggerContext.class);

    private final LoggerContext loggerContextMock16 = mock(LoggerContext.class);

    private final LoggerContext loggerContextMock17 = mock(LoggerContext.class);

    private final LoggerContext loggerContextMock18 = mock(LoggerContext.class);

    private final LoggerContext loggerContextMock19 = mock(LoggerContext.class);

    private final LoggerContext loggerContextMock2 = mock(LoggerContext.class);

    private final LoggerContext loggerContextMock20 = mock(LoggerContext.class);

    private final LoggerContext loggerContextMock21 = mock(LoggerContext.class);

    private final LoggerContext loggerContextMock22 = mock(LoggerContext.class);

    private final LoggerContext loggerContextMock23 = mock(LoggerContext.class);

    private final LoggerContext loggerContextMock24 = mock(LoggerContext.class);

    private final LoggerContext loggerContextMock3 = mock(LoggerContext.class);

    private final LoggerContext loggerContextMock4 = mock(LoggerContext.class);

    private final LoggerContext loggerContextMock5 = mock(LoggerContext.class);

    private final LoggerContext loggerContextMock6 = mock(LoggerContext.class);

    private final LoggerContext loggerContextMock7 = mock(LoggerContext.class);

    private final LoggerContext loggerContextMock8 = mock(LoggerContext.class);

    private final LoggerContext loggerContextMock9 = mock(LoggerContext.class);

    //Sapient generated method id: ${applyWhenThisLogFileIsNull}, hash: AD56DE38478B60708B30C854A8DFD78A
    @Disabled()
    @Test()
    void applyWhenThisLogFileIsNull() throws ScanException {
        /* Branches:
         * (this.logFile != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: appender - Method: addFilter
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<OptionHelper> optionHelper = mockStatic(OptionHelper.class)) {
            Object object = new Object();
            doReturn(object).when(configMock).getConfigurationLock();
            doNothing().when(configMock).conversionRule("clr", ColorConverter.class);
            doNothing().when(configMock).conversionRule("correlationId", CorrelationIdConverter.class);
            doNothing().when(configMock).conversionRule("wex", WhitespaceThrowableProxyConverter.class);
            doNothing().when(configMock).conversionRule("wEx", ExtendedWhitespaceThrowableProxyConverter.class);
            doNothing().when(loggerContextMock).putProperty("CONSOLE_LOG_PATTERN", "return_of_substVars1");
            doNothing().when(loggerContextMock3).putProperty("CONSOLE_LOG_CHARSET", "return_of_substVars1");
            doNothing().when(loggerContextMock5).putProperty("CONSOLE_LOG_THRESHOLD", "return_of_substVars1");
            doNothing().when(loggerContextMock7).putProperty("FILE_LOG_PATTERN", "return_of_substVars1");
            doNothing().when(loggerContextMock9).putProperty("FILE_LOG_CHARSET", "return_of_substVars1");
            doNothing().when(loggerContextMock11).putProperty("FILE_LOG_THRESHOLD", "return_of_substVars1");
            Level level = Level.ERROR;
            doNothing().when(configMock).logger("org.apache.catalina.startup.DigesterFactory", level);
            doNothing().when(configMock).logger("org.apache.catalina.util.LifecycleBase", level);
            Level level2 = Level.WARN;
            doNothing().when(configMock).logger("org.apache.coyote.http11.Http11NioProtocol", level2);
            doNothing().when(configMock).logger("org.apache.sshd.common.util.SecurityUtils", level2);
            doNothing().when(configMock).logger("org.apache.tomcat.util.net.NioSelectorPool", level2);
            doNothing().when(configMock).logger("org.eclipse.jetty.util.component.AbstractLifeCycle", level);
            doNothing().when(configMock).logger("org.hibernate.validator.internal.util.Version", level2);
            doNothing().when(configMock).logger("org.springframework.boot.actuate.endpoint.jmx", level2);
            doReturn(loggerContextMock, loggerContextMock2, loggerContextMock3, loggerContextMock4, loggerContextMock5, loggerContextMock6, loggerContextMock7, loggerContextMock8, loggerContextMock9, loggerContextMock10, loggerContextMock11, loggerContextMock12, loggerContextMock13, loggerContextMock14, loggerContextMock15).when(configMock).getContext();
            doNothing().when(configMock).start((LifeCycle) any());
            doNothing().when(configMock).appender(eq("CONSOLE"), (Appender) any());
            Level level3 = Level.INFO;
            Charset charset = Charset.defaultCharset();
            PatternLayoutEncoder patternLayoutEncoder = new PatternLayoutEncoder();
            patternLayoutEncoder.setCharset(charset);
            patternLayoutEncoder.setPattern("pattern1");
            ConsoleAppender<ILoggingEvent> consoleAppender = new ConsoleAppender<>();
            consoleAppender.setEncoder(patternLayoutEncoder);
            Appender<ILoggingEvent>[] appenderArray = new Appender[] { consoleAppender };
            doNothing().when(configMock).root(level3, appenderArray);
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_PATTERN:-%clr(%d{${LOG_DATEFORMAT_PATTERN:-yyyy-MM-dd'T'HH:mm:ss.SSSXXX}}){faint} %clr(${LOG_LEVEL_PATTERN:-%5p}) %clr(${PID:- }){magenta} %clr(---){faint} %clr(${LOGGED_APPLICATION_NAME:-}[%15.15t]){faint} %clr(${LOG_CORRELATION_PATTERN:-}){faint}%clr(%-40.40logger{39}){cyan} %clr(:){faint} %m%n${LOG_EXCEPTION_CONVERSION_WORD:-%wEx}}", loggerContextMock2)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_CHARSET:-UTF-8}", loggerContextMock4)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_THRESHOLD:-TRACE}", loggerContextMock6)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${FILE_LOG_PATTERN:-%d{${LOG_DATEFORMAT_PATTERN:-yyyy-MM-dd'T'HH:mm:ss.SSSXXX}} ${LOG_LEVEL_PATTERN:-%5p} ${PID:- } --- ${LOGGED_APPLICATION_NAME:-}[%t] ${LOG_CORRELATION_PATTERN:-}%-40.40logger{39} : %m%n${LOG_EXCEPTION_CONVERSION_WORD:-%wEx}}", loggerContextMock8)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${FILE_LOG_CHARSET:-UTF-8}", loggerContextMock10)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${FILE_LOG_THRESHOLD:-TRACE}", loggerContextMock12)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_THRESHOLD}", loggerContextMock13)).thenReturn("A");
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_PATTERN}", loggerContextMock14)).thenReturn("pattern1");
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_CHARSET}", loggerContextMock15)).thenReturn("B");
            DefaultLogbackConfiguration target = new DefaultLogbackConfiguration((LogFile) null);
            //Act Statement(s)
            target.apply(configMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(configMock).getConfigurationLock();
                verify(configMock).conversionRule("clr", ColorConverter.class);
                verify(configMock).conversionRule("correlationId", CorrelationIdConverter.class);
                verify(configMock).conversionRule("wex", WhitespaceThrowableProxyConverter.class);
                verify(configMock).conversionRule("wEx", ExtendedWhitespaceThrowableProxyConverter.class);
                verify(configMock, times(15)).getContext();
                verify(loggerContextMock).putProperty("CONSOLE_LOG_PATTERN", "return_of_substVars1");
                verify(loggerContextMock3).putProperty("CONSOLE_LOG_CHARSET", "return_of_substVars1");
                verify(loggerContextMock5).putProperty("CONSOLE_LOG_THRESHOLD", "return_of_substVars1");
                verify(loggerContextMock7).putProperty("FILE_LOG_PATTERN", "return_of_substVars1");
                verify(loggerContextMock9).putProperty("FILE_LOG_CHARSET", "return_of_substVars1");
                verify(loggerContextMock11).putProperty("FILE_LOG_THRESHOLD", "return_of_substVars1");
                verify(configMock).logger("org.apache.catalina.startup.DigesterFactory", level);
                verify(configMock).logger("org.apache.catalina.util.LifecycleBase", level);
                verify(configMock).logger("org.apache.coyote.http11.Http11NioProtocol", level2);
                verify(configMock).logger("org.apache.sshd.common.util.SecurityUtils", level2);
                verify(configMock).logger("org.apache.tomcat.util.net.NioSelectorPool", level2);
                verify(configMock).logger("org.eclipse.jetty.util.component.AbstractLifeCycle", level);
                verify(configMock).logger("org.hibernate.validator.internal.util.Version", level2);
                verify(configMock).logger("org.springframework.boot.actuate.endpoint.jmx", level2);
                verify(configMock).start((LifeCycle) any());
                verify(configMock).appender(eq("CONSOLE"), (Appender) any());
                verify(configMock).root(level3, appenderArray);
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_PATTERN:-%clr(%d{${LOG_DATEFORMAT_PATTERN:-yyyy-MM-dd'T'HH:mm:ss.SSSXXX}}){faint} %clr(${LOG_LEVEL_PATTERN:-%5p}) %clr(${PID:- }){magenta} %clr(---){faint} %clr(${LOGGED_APPLICATION_NAME:-}[%15.15t]){faint} %clr(${LOG_CORRELATION_PATTERN:-}){faint}%clr(%-40.40logger{39}){cyan} %clr(:){faint} %m%n${LOG_EXCEPTION_CONVERSION_WORD:-%wEx}}", loggerContextMock2), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_CHARSET:-UTF-8}", loggerContextMock4), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_THRESHOLD:-TRACE}", loggerContextMock6), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${FILE_LOG_PATTERN:-%d{${LOG_DATEFORMAT_PATTERN:-yyyy-MM-dd'T'HH:mm:ss.SSSXXX}} ${LOG_LEVEL_PATTERN:-%5p} ${PID:- } --- ${LOGGED_APPLICATION_NAME:-}[%t] ${LOG_CORRELATION_PATTERN:-}%-40.40logger{39} : %m%n${LOG_EXCEPTION_CONVERSION_WORD:-%wEx}}", loggerContextMock8), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${FILE_LOG_CHARSET:-UTF-8}", loggerContextMock10), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${FILE_LOG_THRESHOLD:-TRACE}", loggerContextMock12), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_THRESHOLD}", loggerContextMock13), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_PATTERN}", loggerContextMock14), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_CHARSET}", loggerContextMock15), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenCaughtScanExceptionThrowsRuntimeException}, hash: EA48D44E8F076A1C6D14DDC6C3AB5FA4
    @Test()
    void applyWhenCaughtScanExceptionThrowsRuntimeException() throws ScanException {
        /* Branches:
         * (catch-exception (ScanException)) : true  #  inside resolve method
         */
        //Arrange Statement(s)
        ScanException scanExceptionMock = mock(ScanException.class);
        LogFile logFileMock = mock(LogFile.class);
        try (MockedStatic<OptionHelper> optionHelper = mockStatic(OptionHelper.class)) {
            Object object = new Object();
            doReturn(object).when(configMock).getConfigurationLock();
            doNothing().when(configMock).conversionRule("clr", ColorConverter.class);
            doNothing().when(configMock).conversionRule("correlationId", CorrelationIdConverter.class);
            doNothing().when(configMock).conversionRule("wex", WhitespaceThrowableProxyConverter.class);
            doNothing().when(configMock).conversionRule("wEx", ExtendedWhitespaceThrowableProxyConverter.class);
            doReturn(loggerContextMock, loggerContextMock2).when(configMock).getContext();
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_PATTERN:-%clr(%d{${LOG_DATEFORMAT_PATTERN:-yyyy-MM-dd'T'HH:mm:ss.SSSXXX}}){faint} %clr(${LOG_LEVEL_PATTERN:-%5p}) %clr(${PID:- }){magenta} %clr(---){faint} %clr(${LOGGED_APPLICATION_NAME:-}[%15.15t]){faint} %clr(${LOG_CORRELATION_PATTERN:-}){faint}%clr(%-40.40logger{39}){cyan} %clr(:){faint} %m%n${LOG_EXCEPTION_CONVERSION_WORD:-%wEx}}", loggerContextMock2)).thenThrow(scanExceptionMock);
            DefaultLogbackConfiguration target = new DefaultLogbackConfiguration(logFileMock);
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                target.apply(configMock);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(configMock).getConfigurationLock();
                verify(configMock).conversionRule("clr", ColorConverter.class);
                verify(configMock).conversionRule("correlationId", CorrelationIdConverter.class);
                verify(configMock).conversionRule("wex", WhitespaceThrowableProxyConverter.class);
                verify(configMock).conversionRule("wEx", ExtendedWhitespaceThrowableProxyConverter.class);
                verify(configMock, times(2)).getContext();
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_PATTERN:-%clr(%d{${LOG_DATEFORMAT_PATTERN:-yyyy-MM-dd'T'HH:mm:ss.SSSXXX}}){faint} %clr(${LOG_LEVEL_PATTERN:-%5p}) %clr(${PID:- }){magenta} %clr(---){faint} %clr(${LOGGED_APPLICATION_NAME:-}[%15.15t]){faint} %clr(${LOG_CORRELATION_PATTERN:-}){faint}%clr(%-40.40logger{39}){cyan} %clr(:){faint} %m%n${LOG_EXCEPTION_CONVERSION_WORD:-%wEx}}", loggerContextMock2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenCaughtScanException2ThrowsRuntimeException}, hash: E2292300F8411495428C2061CC6C7191
    @Test()
    void applyWhenCaughtScanException2ThrowsRuntimeException() throws ScanException {
        /* Branches:
         * (catch-exception (ScanException)) : true  #  inside resolve method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: appender - Method: addFilter
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        LogFile logFileMock = mock(LogFile.class);
        try (MockedStatic<OptionHelper> optionHelper = mockStatic(OptionHelper.class)) {
            Object object = new Object();
            doReturn(object).when(configMock).getConfigurationLock();
            doNothing().when(configMock).conversionRule("clr", ColorConverter.class);
            doNothing().when(configMock).conversionRule("correlationId", CorrelationIdConverter.class);
            doNothing().when(configMock).conversionRule("wex", WhitespaceThrowableProxyConverter.class);
            doNothing().when(configMock).conversionRule("wEx", ExtendedWhitespaceThrowableProxyConverter.class);
            doNothing().when(loggerContextMock).putProperty("CONSOLE_LOG_PATTERN", "return_of_substVars1");
            doNothing().when(loggerContextMock3).putProperty("CONSOLE_LOG_CHARSET", "return_of_substVars1");
            doNothing().when(loggerContextMock5).putProperty("CONSOLE_LOG_THRESHOLD", "return_of_substVars1");
            doNothing().when(loggerContextMock7).putProperty("FILE_LOG_PATTERN", "return_of_substVars1");
            doNothing().when(loggerContextMock9).putProperty("FILE_LOG_CHARSET", "return_of_substVars1");
            doNothing().when(loggerContextMock11).putProperty("FILE_LOG_THRESHOLD", "return_of_substVars1");
            Level level = Level.ERROR;
            doNothing().when(configMock).logger("org.apache.catalina.startup.DigesterFactory", level);
            doNothing().when(configMock).logger("org.apache.catalina.util.LifecycleBase", level);
            Level level2 = Level.WARN;
            doNothing().when(configMock).logger("org.apache.coyote.http11.Http11NioProtocol", level2);
            doNothing().when(configMock).logger("org.apache.sshd.common.util.SecurityUtils", level2);
            doNothing().when(configMock).logger("org.apache.tomcat.util.net.NioSelectorPool", level2);
            doNothing().when(configMock).logger("org.eclipse.jetty.util.component.AbstractLifeCycle", level);
            doNothing().when(configMock).logger("org.hibernate.validator.internal.util.Version", level2);
            doNothing().when(configMock).logger("org.springframework.boot.actuate.endpoint.jmx", level2);
            doReturn(loggerContextMock, loggerContextMock2, loggerContextMock3, loggerContextMock4, loggerContextMock5, loggerContextMock6, loggerContextMock7, loggerContextMock8, loggerContextMock9, loggerContextMock10, loggerContextMock11, loggerContextMock12, loggerContextMock13, loggerContextMock14, loggerContextMock15).when(configMock).getContext();
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_PATTERN:-%clr(%d{${LOG_DATEFORMAT_PATTERN:-yyyy-MM-dd'T'HH:mm:ss.SSSXXX}}){faint} %clr(${LOG_LEVEL_PATTERN:-%5p}) %clr(${PID:- }){magenta} %clr(---){faint} %clr(${LOGGED_APPLICATION_NAME:-}[%15.15t]){faint} %clr(${LOG_CORRELATION_PATTERN:-}){faint}%clr(%-40.40logger{39}){cyan} %clr(:){faint} %m%n${LOG_EXCEPTION_CONVERSION_WORD:-%wEx}}", loggerContextMock2)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_CHARSET:-UTF-8}", loggerContextMock4)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_THRESHOLD:-TRACE}", loggerContextMock6)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${FILE_LOG_PATTERN:-%d{${LOG_DATEFORMAT_PATTERN:-yyyy-MM-dd'T'HH:mm:ss.SSSXXX}} ${LOG_LEVEL_PATTERN:-%5p} ${PID:- } --- ${LOGGED_APPLICATION_NAME:-}[%t] ${LOG_CORRELATION_PATTERN:-}%-40.40logger{39} : %m%n${LOG_EXCEPTION_CONVERSION_WORD:-%wEx}}", loggerContextMock8)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${FILE_LOG_CHARSET:-UTF-8}", loggerContextMock10)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${FILE_LOG_THRESHOLD:-TRACE}", loggerContextMock12)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_THRESHOLD}", loggerContextMock13)).thenReturn("A");
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_PATTERN}", loggerContextMock14)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_CHARSET}", loggerContextMock15)).thenReturn("return_of_substVars1");
            DefaultLogbackConfiguration target = new DefaultLogbackConfiguration(logFileMock);
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                target.apply(configMock);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(configMock).getConfigurationLock();
                verify(configMock).conversionRule("clr", ColorConverter.class);
                verify(configMock).conversionRule("correlationId", CorrelationIdConverter.class);
                verify(configMock).conversionRule("wex", WhitespaceThrowableProxyConverter.class);
                verify(configMock).conversionRule("wEx", ExtendedWhitespaceThrowableProxyConverter.class);
                verify(configMock, times(15)).getContext();
                verify(loggerContextMock).putProperty("CONSOLE_LOG_PATTERN", "return_of_substVars1");
                verify(loggerContextMock3).putProperty("CONSOLE_LOG_CHARSET", "return_of_substVars1");
                verify(loggerContextMock5).putProperty("CONSOLE_LOG_THRESHOLD", "return_of_substVars1");
                verify(loggerContextMock7).putProperty("FILE_LOG_PATTERN", "return_of_substVars1");
                verify(loggerContextMock9).putProperty("FILE_LOG_CHARSET", "return_of_substVars1");
                verify(loggerContextMock11).putProperty("FILE_LOG_THRESHOLD", "return_of_substVars1");
                verify(configMock).logger("org.apache.catalina.startup.DigesterFactory", level);
                verify(configMock).logger("org.apache.catalina.util.LifecycleBase", level);
                verify(configMock).logger("org.apache.coyote.http11.Http11NioProtocol", level2);
                verify(configMock).logger("org.apache.sshd.common.util.SecurityUtils", level2);
                verify(configMock).logger("org.apache.tomcat.util.net.NioSelectorPool", level2);
                verify(configMock).logger("org.eclipse.jetty.util.component.AbstractLifeCycle", level);
                verify(configMock).logger("org.hibernate.validator.internal.util.Version", level2);
                verify(configMock).logger("org.springframework.boot.actuate.endpoint.jmx", level2);
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_PATTERN:-%clr(%d{${LOG_DATEFORMAT_PATTERN:-yyyy-MM-dd'T'HH:mm:ss.SSSXXX}}){faint} %clr(${LOG_LEVEL_PATTERN:-%5p}) %clr(${PID:- }){magenta} %clr(---){faint} %clr(${LOGGED_APPLICATION_NAME:-}[%15.15t]){faint} %clr(${LOG_CORRELATION_PATTERN:-}){faint}%clr(%-40.40logger{39}){cyan} %clr(:){faint} %m%n${LOG_EXCEPTION_CONVERSION_WORD:-%wEx}}", loggerContextMock2), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_CHARSET:-UTF-8}", loggerContextMock4), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_THRESHOLD:-TRACE}", loggerContextMock6), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${FILE_LOG_PATTERN:-%d{${LOG_DATEFORMAT_PATTERN:-yyyy-MM-dd'T'HH:mm:ss.SSSXXX}} ${LOG_LEVEL_PATTERN:-%5p} ${PID:- } --- ${LOGGED_APPLICATION_NAME:-}[%t] ${LOG_CORRELATION_PATTERN:-}%-40.40logger{39} : %m%n${LOG_EXCEPTION_CONVERSION_WORD:-%wEx}}", loggerContextMock8), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${FILE_LOG_CHARSET:-UTF-8}", loggerContextMock10), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${FILE_LOG_THRESHOLD:-TRACE}", loggerContextMock12), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_THRESHOLD}", loggerContextMock13), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_PATTERN}", loggerContextMock14), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_CHARSET}", loggerContextMock15), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenBooleanParseBooleanResolveConfigVal}, hash: DF43273EC7FB57799D6D8C3A3FE0F17C
    @Disabled()
    @Test()
    void applyWhenBooleanParseBooleanResolveConfigVal() throws ScanException {
        /* Branches:
         * (this.logFile != null) : true
         * (Boolean.parseBoolean(resolve(config, val))) : true  #  inside resolveBoolean method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: appender - Method: addFilter
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<OptionHelper> optionHelper = mockStatic(OptionHelper.class);
            MockedStatic<FileSize> fileSize = mockStatic(FileSize.class)) {
            Object object = new Object();
            doReturn(object).when(configMock).getConfigurationLock();
            doNothing().when(configMock).conversionRule("clr", ColorConverter.class);
            doNothing().when(configMock).conversionRule("correlationId", CorrelationIdConverter.class);
            doNothing().when(configMock).conversionRule("wex", WhitespaceThrowableProxyConverter.class);
            doNothing().when(configMock).conversionRule("wEx", ExtendedWhitespaceThrowableProxyConverter.class);
            doNothing().when(loggerContextMock).putProperty("CONSOLE_LOG_PATTERN", "return_of_substVars1");
            doNothing().when(loggerContextMock3).putProperty("CONSOLE_LOG_CHARSET", "return_of_substVars1");
            doNothing().when(loggerContextMock5).putProperty("CONSOLE_LOG_THRESHOLD", "return_of_substVars1");
            doNothing().when(loggerContextMock7).putProperty("FILE_LOG_PATTERN", "return_of_substVars1");
            doNothing().when(loggerContextMock9).putProperty("FILE_LOG_CHARSET", "return_of_substVars1");
            doNothing().when(loggerContextMock11).putProperty("FILE_LOG_THRESHOLD", "return_of_substVars1");
            Level level = Level.ERROR;
            doNothing().when(configMock).logger("org.apache.catalina.startup.DigesterFactory", level);
            doNothing().when(configMock).logger("org.apache.catalina.util.LifecycleBase", level);
            Level level2 = Level.WARN;
            doNothing().when(configMock).logger("org.apache.coyote.http11.Http11NioProtocol", level2);
            doNothing().when(configMock).logger("org.apache.sshd.common.util.SecurityUtils", level2);
            doNothing().when(configMock).logger("org.apache.tomcat.util.net.NioSelectorPool", level2);
            doNothing().when(configMock).logger("org.eclipse.jetty.util.component.AbstractLifeCycle", level);
            doNothing().when(configMock).logger("org.hibernate.validator.internal.util.Version", level2);
            doNothing().when(configMock).logger("org.springframework.boot.actuate.endpoint.jmx", level2);
            doNothing().when(configMock).start((LifeCycle) any());
            doNothing().when(configMock).appender(eq("CONSOLE"), (Appender) any());
            doReturn(loggerContextMock, loggerContextMock2, loggerContextMock3, loggerContextMock4, loggerContextMock5, loggerContextMock6, loggerContextMock7, loggerContextMock8, loggerContextMock9, loggerContextMock10, loggerContextMock11, loggerContextMock12, loggerContextMock13, loggerContextMock14, loggerContextMock15, loggerContextMock16, loggerContextMock17, loggerContextMock18, loggerContextMock19, loggerContextMock20, loggerContextMock21, loggerContextMock22, loggerContextMock23, loggerContextMock24).when(configMock).getContext();
            doNothing().when(configMock).appender(eq("FILE"), (Appender) any());
            Level level3 = Level.INFO;
            Charset charset = Charset.defaultCharset();
            PatternLayoutEncoder patternLayoutEncoder = new PatternLayoutEncoder();
            patternLayoutEncoder.setCharset(charset);
            patternLayoutEncoder.setPattern("pattern1");
            ConsoleAppender<ILoggingEvent> consoleAppender = new ConsoleAppender<>();
            consoleAppender.setEncoder(patternLayoutEncoder);
            SizeAndTimeBasedRollingPolicy<ILoggingEvent> sizeAndTimeBasedRollingPolicy = new SizeAndTimeBasedRollingPolicy<>();
            sizeAndTimeBasedRollingPolicy.setContext(loggerContextMock19);
            sizeAndTimeBasedRollingPolicy.setMaxHistory(0);
            sizeAndTimeBasedRollingPolicy.setTotalSizeCap(fileSize2Mock);
            sizeAndTimeBasedRollingPolicy.setMaxFileSize(fileSize2Mock2);
            sizeAndTimeBasedRollingPolicy.setCleanHistoryOnStart(true);
            Charset charset2 = Charset.defaultCharset();
            PatternLayoutEncoder patternLayoutEncoder2 = new PatternLayoutEncoder();
            patternLayoutEncoder2.setCharset(charset2);
            patternLayoutEncoder2.setPattern("pattern1");
            RollingFileAppender<ILoggingEvent> rollingFileAppender = new RollingFileAppender<>();
            rollingFileAppender.setRollingPolicy(sizeAndTimeBasedRollingPolicy);
            rollingFileAppender.setEncoder(patternLayoutEncoder2);
            Appender<ILoggingEvent>[] appenderArray = new Appender[] { consoleAppender, rollingFileAppender };
            doNothing().when(configMock).root(level3, appenderArray);
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_PATTERN:-%clr(%d{${LOG_DATEFORMAT_PATTERN:-yyyy-MM-dd'T'HH:mm:ss.SSSXXX}}){faint} %clr(${LOG_LEVEL_PATTERN:-%5p}) %clr(${PID:- }){magenta} %clr(---){faint} %clr(${LOGGED_APPLICATION_NAME:-}[%15.15t]){faint} %clr(${LOG_CORRELATION_PATTERN:-}){faint}%clr(%-40.40logger{39}){cyan} %clr(:){faint} %m%n${LOG_EXCEPTION_CONVERSION_WORD:-%wEx}}", loggerContextMock2)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_CHARSET:-UTF-8}", loggerContextMock4)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_THRESHOLD:-TRACE}", loggerContextMock6)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${FILE_LOG_PATTERN:-%d{${LOG_DATEFORMAT_PATTERN:-yyyy-MM-dd'T'HH:mm:ss.SSSXXX}} ${LOG_LEVEL_PATTERN:-%5p} ${PID:- } --- ${LOGGED_APPLICATION_NAME:-}[%t] ${LOG_CORRELATION_PATTERN:-}%-40.40logger{39} : %m%n${LOG_EXCEPTION_CONVERSION_WORD:-%wEx}}", loggerContextMock8)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${FILE_LOG_CHARSET:-UTF-8}", loggerContextMock10)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${FILE_LOG_THRESHOLD:-TRACE}", loggerContextMock12)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_THRESHOLD}", loggerContextMock13)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_PATTERN}", loggerContextMock14)).thenReturn("pattern1");
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_CHARSET}", loggerContextMock15)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${FILE_LOG_THRESHOLD}", loggerContextMock16)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${FILE_LOG_PATTERN}", loggerContextMock17)).thenReturn("pattern1");
            optionHelper.when(() -> OptionHelper.substVars("${FILE_LOG_CHARSET}", loggerContextMock18)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${LOGBACK_ROLLINGPOLICY_FILE_NAME_PATTERN:-${LOG_FILE}.%d{yyyy-MM-dd}.%i.gz}", loggerContextMock20)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${LOGBACK_ROLLINGPOLICY_CLEAN_HISTORY_ON_START:-false}", loggerContextMock21)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${LOGBACK_ROLLINGPOLICY_MAX_FILE_SIZE:-10MB}", loggerContextMock22)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${LOGBACK_ROLLINGPOLICY_TOTAL_SIZE_CAP:-0}", loggerContextMock23)).thenReturn("return_of_substVars1");
            fileSize.when(() -> FileSize.valueOf("return_of_substVars1")).thenReturn(fileSize2Mock2).thenReturn(fileSize2Mock);
            optionHelper.when(() -> OptionHelper.substVars("${LOGBACK_ROLLINGPOLICY_MAX_HISTORY:-7}", loggerContextMock24)).thenReturn("return_of_substVars1");
            DefaultLogbackConfiguration target = new DefaultLogbackConfiguration(logFileMock);
            //Act Statement(s)
            target.apply(configMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(configMock).getConfigurationLock();
                verify(configMock).conversionRule("clr", ColorConverter.class);
                verify(configMock).conversionRule("correlationId", CorrelationIdConverter.class);
                verify(configMock).conversionRule("wex", WhitespaceThrowableProxyConverter.class);
                verify(configMock).conversionRule("wEx", ExtendedWhitespaceThrowableProxyConverter.class);
                verify(configMock, times(24)).getContext();
                verify(loggerContextMock).putProperty("CONSOLE_LOG_PATTERN", "return_of_substVars1");
                verify(loggerContextMock3).putProperty("CONSOLE_LOG_CHARSET", "return_of_substVars1");
                verify(loggerContextMock5).putProperty("CONSOLE_LOG_THRESHOLD", "return_of_substVars1");
                verify(loggerContextMock7).putProperty("FILE_LOG_PATTERN", "return_of_substVars1");
                verify(loggerContextMock9).putProperty("FILE_LOG_CHARSET", "return_of_substVars1");
                verify(loggerContextMock11).putProperty("FILE_LOG_THRESHOLD", "return_of_substVars1");
                verify(configMock).logger("org.apache.catalina.startup.DigesterFactory", level);
                verify(configMock).logger("org.apache.catalina.util.LifecycleBase", level);
                verify(configMock).logger("org.apache.coyote.http11.Http11NioProtocol", level2);
                verify(configMock).logger("org.apache.sshd.common.util.SecurityUtils", level2);
                verify(configMock).logger("org.apache.tomcat.util.net.NioSelectorPool", level2);
                verify(configMock).logger("org.eclipse.jetty.util.component.AbstractLifeCycle", level);
                verify(configMock).logger("org.hibernate.validator.internal.util.Version", level2);
                verify(configMock).logger("org.springframework.boot.actuate.endpoint.jmx", level2);
                verify(configMock, atLeast(3)).start((LifeCycle) any());
                verify(configMock).appender(eq("CONSOLE"), (Appender) any());
                verify(configMock).appender(eq("FILE"), (Appender) any());
                verify(configMock).root(level3, appenderArray);
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_PATTERN:-%clr(%d{${LOG_DATEFORMAT_PATTERN:-yyyy-MM-dd'T'HH:mm:ss.SSSXXX}}){faint} %clr(${LOG_LEVEL_PATTERN:-%5p}) %clr(${PID:- }){magenta} %clr(---){faint} %clr(${LOGGED_APPLICATION_NAME:-}[%15.15t]){faint} %clr(${LOG_CORRELATION_PATTERN:-}){faint}%clr(%-40.40logger{39}){cyan} %clr(:){faint} %m%n${LOG_EXCEPTION_CONVERSION_WORD:-%wEx}}", loggerContextMock2), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_CHARSET:-UTF-8}", loggerContextMock4), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_THRESHOLD:-TRACE}", loggerContextMock6), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${FILE_LOG_PATTERN:-%d{${LOG_DATEFORMAT_PATTERN:-yyyy-MM-dd'T'HH:mm:ss.SSSXXX}} ${LOG_LEVEL_PATTERN:-%5p} ${PID:- } --- ${LOGGED_APPLICATION_NAME:-}[%t] ${LOG_CORRELATION_PATTERN:-}%-40.40logger{39} : %m%n${LOG_EXCEPTION_CONVERSION_WORD:-%wEx}}", loggerContextMock8), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${FILE_LOG_CHARSET:-UTF-8}", loggerContextMock10), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${FILE_LOG_THRESHOLD:-TRACE}", loggerContextMock12), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_THRESHOLD}", loggerContextMock13), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_PATTERN}", loggerContextMock14), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_CHARSET}", loggerContextMock15), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${FILE_LOG_THRESHOLD}", loggerContextMock16), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${FILE_LOG_PATTERN}", loggerContextMock17), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${FILE_LOG_CHARSET}", loggerContextMock18), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${LOGBACK_ROLLINGPOLICY_FILE_NAME_PATTERN:-${LOG_FILE}.%d{yyyy-MM-dd}.%i.gz}", loggerContextMock20), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${LOGBACK_ROLLINGPOLICY_CLEAN_HISTORY_ON_START:-false}", loggerContextMock21), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${LOGBACK_ROLLINGPOLICY_MAX_FILE_SIZE:-10MB}", loggerContextMock22), atLeast(1));
                fileSize.verify(() -> FileSize.valueOf("return_of_substVars1"), atLeast(2));
                optionHelper.verify(() -> OptionHelper.substVars("${LOGBACK_ROLLINGPOLICY_TOTAL_SIZE_CAP:-0}", loggerContextMock23), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${LOGBACK_ROLLINGPOLICY_MAX_HISTORY:-7}", loggerContextMock24), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenBooleanNotParseBooleanResolveConfigVal}, hash: B61E28E183155BAE265EE2F5B00F6C64
    @Disabled()
    @Test()
    void applyWhenBooleanNotParseBooleanResolveConfigVal() throws ScanException {
        /* Branches:
         * (this.logFile != null) : true
         * (Boolean.parseBoolean(resolve(config, val))) : false  #  inside resolveBoolean method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: appender - Method: addFilter
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<OptionHelper> optionHelper = mockStatic(OptionHelper.class);
            MockedStatic<FileSize> fileSize = mockStatic(FileSize.class)) {
            Object object = new Object();
            doReturn(object).when(configMock).getConfigurationLock();
            doNothing().when(configMock).conversionRule("clr", ColorConverter.class);
            doNothing().when(configMock).conversionRule("correlationId", CorrelationIdConverter.class);
            doNothing().when(configMock).conversionRule("wex", WhitespaceThrowableProxyConverter.class);
            doNothing().when(configMock).conversionRule("wEx", ExtendedWhitespaceThrowableProxyConverter.class);
            doNothing().when(loggerContextMock).putProperty("CONSOLE_LOG_PATTERN", "return_of_substVars1");
            doNothing().when(loggerContextMock3).putProperty("CONSOLE_LOG_CHARSET", "return_of_substVars1");
            doNothing().when(loggerContextMock5).putProperty("CONSOLE_LOG_THRESHOLD", "return_of_substVars1");
            doNothing().when(loggerContextMock7).putProperty("FILE_LOG_PATTERN", "return_of_substVars1");
            doNothing().when(loggerContextMock9).putProperty("FILE_LOG_CHARSET", "return_of_substVars1");
            doNothing().when(loggerContextMock11).putProperty("FILE_LOG_THRESHOLD", "return_of_substVars1");
            Level level = Level.ERROR;
            doNothing().when(configMock).logger("org.apache.catalina.startup.DigesterFactory", level);
            doNothing().when(configMock).logger("org.apache.catalina.util.LifecycleBase", level);
            Level level2 = Level.WARN;
            doNothing().when(configMock).logger("org.apache.coyote.http11.Http11NioProtocol", level2);
            doNothing().when(configMock).logger("org.apache.sshd.common.util.SecurityUtils", level2);
            doNothing().when(configMock).logger("org.apache.tomcat.util.net.NioSelectorPool", level2);
            doNothing().when(configMock).logger("org.eclipse.jetty.util.component.AbstractLifeCycle", level);
            doNothing().when(configMock).logger("org.hibernate.validator.internal.util.Version", level2);
            doNothing().when(configMock).logger("org.springframework.boot.actuate.endpoint.jmx", level2);
            doNothing().when(configMock).start((LifeCycle) any());
            doNothing().when(configMock).appender(eq("CONSOLE"), (Appender) any());
            doReturn(loggerContextMock, loggerContextMock2, loggerContextMock3, loggerContextMock4, loggerContextMock5, loggerContextMock6, loggerContextMock7, loggerContextMock8, loggerContextMock9, loggerContextMock10, loggerContextMock11, loggerContextMock12, loggerContextMock13, loggerContextMock14, loggerContextMock15, loggerContextMock16, loggerContextMock17, loggerContextMock18, loggerContextMock19, loggerContextMock20, loggerContextMock21, loggerContextMock22, loggerContextMock23, loggerContextMock24).when(configMock).getContext();
            doNothing().when(configMock).appender(eq("FILE"), (Appender) any());
            Level level3 = Level.INFO;
            Charset charset = Charset.defaultCharset();
            PatternLayoutEncoder patternLayoutEncoder = new PatternLayoutEncoder();
            patternLayoutEncoder.setCharset(charset);
            patternLayoutEncoder.setPattern("pattern1");
            ConsoleAppender<ILoggingEvent> consoleAppender = new ConsoleAppender<>();
            consoleAppender.setEncoder(patternLayoutEncoder);
            SizeAndTimeBasedRollingPolicy<ILoggingEvent> sizeAndTimeBasedRollingPolicy = new SizeAndTimeBasedRollingPolicy<>();
            sizeAndTimeBasedRollingPolicy.setContext(loggerContextMock19);
            sizeAndTimeBasedRollingPolicy.setMaxHistory(0);
            sizeAndTimeBasedRollingPolicy.setTotalSizeCap(fileSize2Mock);
            sizeAndTimeBasedRollingPolicy.setMaxFileSize(fileSize2Mock2);
            sizeAndTimeBasedRollingPolicy.setCleanHistoryOnStart(false);
            Charset charset2 = Charset.defaultCharset();
            PatternLayoutEncoder patternLayoutEncoder2 = new PatternLayoutEncoder();
            patternLayoutEncoder2.setCharset(charset2);
            patternLayoutEncoder2.setPattern("pattern1");
            RollingFileAppender<ILoggingEvent> rollingFileAppender = new RollingFileAppender<>();
            rollingFileAppender.setRollingPolicy(sizeAndTimeBasedRollingPolicy);
            rollingFileAppender.setEncoder(patternLayoutEncoder2);
            Appender<ILoggingEvent>[] appenderArray = new Appender[] { consoleAppender, rollingFileAppender };
            doNothing().when(configMock).root(level3, appenderArray);
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_PATTERN:-%clr(%d{${LOG_DATEFORMAT_PATTERN:-yyyy-MM-dd'T'HH:mm:ss.SSSXXX}}){faint} %clr(${LOG_LEVEL_PATTERN:-%5p}) %clr(${PID:- }){magenta} %clr(---){faint} %clr(${LOGGED_APPLICATION_NAME:-}[%15.15t]){faint} %clr(${LOG_CORRELATION_PATTERN:-}){faint}%clr(%-40.40logger{39}){cyan} %clr(:){faint} %m%n${LOG_EXCEPTION_CONVERSION_WORD:-%wEx}}", loggerContextMock2)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_CHARSET:-UTF-8}", loggerContextMock4)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_THRESHOLD:-TRACE}", loggerContextMock6)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${FILE_LOG_PATTERN:-%d{${LOG_DATEFORMAT_PATTERN:-yyyy-MM-dd'T'HH:mm:ss.SSSXXX}} ${LOG_LEVEL_PATTERN:-%5p} ${PID:- } --- ${LOGGED_APPLICATION_NAME:-}[%t] ${LOG_CORRELATION_PATTERN:-}%-40.40logger{39} : %m%n${LOG_EXCEPTION_CONVERSION_WORD:-%wEx}}", loggerContextMock8)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${FILE_LOG_CHARSET:-UTF-8}", loggerContextMock10)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${FILE_LOG_THRESHOLD:-TRACE}", loggerContextMock12)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_THRESHOLD}", loggerContextMock13)).thenReturn("A");
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_PATTERN}", loggerContextMock14)).thenReturn("pattern1");
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_CHARSET}", loggerContextMock15)).thenReturn("B");
            optionHelper.when(() -> OptionHelper.substVars("${FILE_LOG_THRESHOLD}", loggerContextMock16)).thenReturn("C");
            optionHelper.when(() -> OptionHelper.substVars("${FILE_LOG_PATTERN}", loggerContextMock17)).thenReturn("pattern1");
            optionHelper.when(() -> OptionHelper.substVars("${FILE_LOG_CHARSET}", loggerContextMock18)).thenReturn("D");
            optionHelper.when(() -> OptionHelper.substVars("${LOGBACK_ROLLINGPOLICY_FILE_NAME_PATTERN:-${LOG_FILE}.%d{yyyy-MM-dd}.%i.gz}", loggerContextMock20)).thenReturn("E");
            optionHelper.when(() -> OptionHelper.substVars("${LOGBACK_ROLLINGPOLICY_CLEAN_HISTORY_ON_START:-false}", loggerContextMock21)).thenReturn("G");
            optionHelper.when(() -> OptionHelper.substVars("${LOGBACK_ROLLINGPOLICY_MAX_FILE_SIZE:-10MB}", loggerContextMock22)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${LOGBACK_ROLLINGPOLICY_TOTAL_SIZE_CAP:-0}", loggerContextMock23)).thenReturn("return_of_substVars1");
            fileSize.when(() -> FileSize.valueOf("return_of_substVars1")).thenReturn(fileSize2Mock2).thenReturn(fileSize2Mock);
            optionHelper.when(() -> OptionHelper.substVars("${LOGBACK_ROLLINGPOLICY_MAX_HISTORY:-7}", loggerContextMock24)).thenReturn("0");
            DefaultLogbackConfiguration target = new DefaultLogbackConfiguration(logFileMock);
            //Act Statement(s)
            target.apply(configMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(configMock).getConfigurationLock();
                verify(configMock).conversionRule("clr", ColorConverter.class);
                verify(configMock).conversionRule("correlationId", CorrelationIdConverter.class);
                verify(configMock).conversionRule("wex", WhitespaceThrowableProxyConverter.class);
                verify(configMock).conversionRule("wEx", ExtendedWhitespaceThrowableProxyConverter.class);
                verify(configMock, times(24)).getContext();
                verify(loggerContextMock).putProperty("CONSOLE_LOG_PATTERN", "return_of_substVars1");
                verify(loggerContextMock3).putProperty("CONSOLE_LOG_CHARSET", "return_of_substVars1");
                verify(loggerContextMock5).putProperty("CONSOLE_LOG_THRESHOLD", "return_of_substVars1");
                verify(loggerContextMock7).putProperty("FILE_LOG_PATTERN", "return_of_substVars1");
                verify(loggerContextMock9).putProperty("FILE_LOG_CHARSET", "return_of_substVars1");
                verify(loggerContextMock11).putProperty("FILE_LOG_THRESHOLD", "return_of_substVars1");
                verify(configMock).logger("org.apache.catalina.startup.DigesterFactory", level);
                verify(configMock).logger("org.apache.catalina.util.LifecycleBase", level);
                verify(configMock).logger("org.apache.coyote.http11.Http11NioProtocol", level2);
                verify(configMock).logger("org.apache.sshd.common.util.SecurityUtils", level2);
                verify(configMock).logger("org.apache.tomcat.util.net.NioSelectorPool", level2);
                verify(configMock).logger("org.eclipse.jetty.util.component.AbstractLifeCycle", level);
                verify(configMock).logger("org.hibernate.validator.internal.util.Version", level2);
                verify(configMock).logger("org.springframework.boot.actuate.endpoint.jmx", level2);
                verify(configMock, atLeast(3)).start((LifeCycle) any());
                verify(configMock).appender(eq("CONSOLE"), (Appender) any());
                verify(configMock).appender(eq("FILE"), (Appender) any());
                verify(configMock).root(level3, appenderArray);
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_PATTERN:-%clr(%d{${LOG_DATEFORMAT_PATTERN:-yyyy-MM-dd'T'HH:mm:ss.SSSXXX}}){faint} %clr(${LOG_LEVEL_PATTERN:-%5p}) %clr(${PID:- }){magenta} %clr(---){faint} %clr(${LOGGED_APPLICATION_NAME:-}[%15.15t]){faint} %clr(${LOG_CORRELATION_PATTERN:-}){faint}%clr(%-40.40logger{39}){cyan} %clr(:){faint} %m%n${LOG_EXCEPTION_CONVERSION_WORD:-%wEx}}", loggerContextMock2), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_CHARSET:-UTF-8}", loggerContextMock4), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_THRESHOLD:-TRACE}", loggerContextMock6), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${FILE_LOG_PATTERN:-%d{${LOG_DATEFORMAT_PATTERN:-yyyy-MM-dd'T'HH:mm:ss.SSSXXX}} ${LOG_LEVEL_PATTERN:-%5p} ${PID:- } --- ${LOGGED_APPLICATION_NAME:-}[%t] ${LOG_CORRELATION_PATTERN:-}%-40.40logger{39} : %m%n${LOG_EXCEPTION_CONVERSION_WORD:-%wEx}}", loggerContextMock8), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${FILE_LOG_CHARSET:-UTF-8}", loggerContextMock10), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${FILE_LOG_THRESHOLD:-TRACE}", loggerContextMock12), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_THRESHOLD}", loggerContextMock13), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_PATTERN}", loggerContextMock14), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_CHARSET}", loggerContextMock15), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${FILE_LOG_THRESHOLD}", loggerContextMock16), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${FILE_LOG_PATTERN}", loggerContextMock17), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${FILE_LOG_CHARSET}", loggerContextMock18), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${LOGBACK_ROLLINGPOLICY_FILE_NAME_PATTERN:-${LOG_FILE}.%d{yyyy-MM-dd}.%i.gz}", loggerContextMock20), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${LOGBACK_ROLLINGPOLICY_CLEAN_HISTORY_ON_START:-false}", loggerContextMock21), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${LOGBACK_ROLLINGPOLICY_MAX_FILE_SIZE:-10MB}", loggerContextMock22), atLeast(1));
                fileSize.verify(() -> FileSize.valueOf("return_of_substVars1"), atLeast(2));
                optionHelper.verify(() -> OptionHelper.substVars("${LOGBACK_ROLLINGPOLICY_TOTAL_SIZE_CAP:-0}", loggerContextMock23), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${LOGBACK_ROLLINGPOLICY_MAX_HISTORY:-7}", loggerContextMock24), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenThisLogFileIsNotNullAndCaughtScanExceptionThrowsRuntimeException}, hash: 6B16D0400B0C7300D52020852081153B
    @Disabled()
    @Test()
    void applyWhenThisLogFileIsNotNullAndCaughtScanExceptionThrowsRuntimeException() throws ScanException {
        /* Branches:
         * (this.logFile != null) : true
         * (catch-exception (ScanException)) : true  #  inside resolve method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: appender - Method: addFilter
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<OptionHelper> optionHelper = mockStatic(OptionHelper.class)) {
            Object object = new Object();
            doReturn(object).when(configMock).getConfigurationLock();
            doNothing().when(configMock).conversionRule("clr", ColorConverter.class);
            doNothing().when(configMock).conversionRule("correlationId", CorrelationIdConverter.class);
            doNothing().when(configMock).conversionRule("wex", WhitespaceThrowableProxyConverter.class);
            doNothing().when(configMock).conversionRule("wEx", ExtendedWhitespaceThrowableProxyConverter.class);
            doNothing().when(loggerContextMock).putProperty("CONSOLE_LOG_PATTERN", "return_of_substVars1");
            doNothing().when(loggerContextMock3).putProperty("CONSOLE_LOG_CHARSET", "return_of_substVars1");
            doNothing().when(loggerContextMock5).putProperty("CONSOLE_LOG_THRESHOLD", "return_of_substVars1");
            doNothing().when(loggerContextMock7).putProperty("FILE_LOG_PATTERN", "return_of_substVars1");
            doNothing().when(loggerContextMock9).putProperty("FILE_LOG_CHARSET", "return_of_substVars1");
            doNothing().when(loggerContextMock11).putProperty("FILE_LOG_THRESHOLD", "return_of_substVars1");
            Level level = Level.ERROR;
            doNothing().when(configMock).logger("org.apache.catalina.startup.DigesterFactory", level);
            doNothing().when(configMock).logger("org.apache.catalina.util.LifecycleBase", level);
            Level level2 = Level.WARN;
            doNothing().when(configMock).logger("org.apache.coyote.http11.Http11NioProtocol", level2);
            doNothing().when(configMock).logger("org.apache.sshd.common.util.SecurityUtils", level2);
            doNothing().when(configMock).logger("org.apache.tomcat.util.net.NioSelectorPool", level2);
            doNothing().when(configMock).logger("org.eclipse.jetty.util.component.AbstractLifeCycle", level);
            doNothing().when(configMock).logger("org.hibernate.validator.internal.util.Version", level2);
            doNothing().when(configMock).logger("org.springframework.boot.actuate.endpoint.jmx", level2);
            doNothing().when(configMock).start((LifeCycle) any());
            doNothing().when(configMock).appender(eq("CONSOLE"), (Appender) any());
            doReturn(loggerContextMock, loggerContextMock2, loggerContextMock3, loggerContextMock4, loggerContextMock5, loggerContextMock6, loggerContextMock7, loggerContextMock8, loggerContextMock9, loggerContextMock10, loggerContextMock11, loggerContextMock12, loggerContextMock13, loggerContextMock14, loggerContextMock15, loggerContextMock16, loggerContextMock17, loggerContextMock18).when(configMock).getContext();
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_PATTERN:-%clr(%d{${LOG_DATEFORMAT_PATTERN:-yyyy-MM-dd'T'HH:mm:ss.SSSXXX}}){faint} %clr(${LOG_LEVEL_PATTERN:-%5p}) %clr(${PID:- }){magenta} %clr(---){faint} %clr(${LOGGED_APPLICATION_NAME:-}[%15.15t]){faint} %clr(${LOG_CORRELATION_PATTERN:-}){faint}%clr(%-40.40logger{39}){cyan} %clr(:){faint} %m%n${LOG_EXCEPTION_CONVERSION_WORD:-%wEx}}", loggerContextMock2)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_CHARSET:-UTF-8}", loggerContextMock4)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_THRESHOLD:-TRACE}", loggerContextMock6)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${FILE_LOG_PATTERN:-%d{${LOG_DATEFORMAT_PATTERN:-yyyy-MM-dd'T'HH:mm:ss.SSSXXX}} ${LOG_LEVEL_PATTERN:-%5p} ${PID:- } --- ${LOGGED_APPLICATION_NAME:-}[%t] ${LOG_CORRELATION_PATTERN:-}%-40.40logger{39} : %m%n${LOG_EXCEPTION_CONVERSION_WORD:-%wEx}}", loggerContextMock8)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${FILE_LOG_CHARSET:-UTF-8}", loggerContextMock10)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${FILE_LOG_THRESHOLD:-TRACE}", loggerContextMock12)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_THRESHOLD}", loggerContextMock13)).thenReturn("A");
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_PATTERN}", loggerContextMock14)).thenReturn("pattern1");
            optionHelper.when(() -> OptionHelper.substVars("${CONSOLE_LOG_CHARSET}", loggerContextMock15)).thenReturn("C");
            optionHelper.when(() -> OptionHelper.substVars("${FILE_LOG_THRESHOLD}", loggerContextMock16)).thenReturn("B");
            optionHelper.when(() -> OptionHelper.substVars("${FILE_LOG_PATTERN}", loggerContextMock17)).thenReturn("return_of_substVars1");
            optionHelper.when(() -> OptionHelper.substVars("${FILE_LOG_CHARSET}", loggerContextMock18)).thenReturn("return_of_substVars1");
            DefaultLogbackConfiguration target = new DefaultLogbackConfiguration(logFileMock);
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                target.apply(configMock);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(configMock).getConfigurationLock();
                verify(configMock).conversionRule("clr", ColorConverter.class);
                verify(configMock).conversionRule("correlationId", CorrelationIdConverter.class);
                verify(configMock).conversionRule("wex", WhitespaceThrowableProxyConverter.class);
                verify(configMock).conversionRule("wEx", ExtendedWhitespaceThrowableProxyConverter.class);
                verify(configMock, times(18)).getContext();
                verify(loggerContextMock).putProperty("CONSOLE_LOG_PATTERN", "return_of_substVars1");
                verify(loggerContextMock3).putProperty("CONSOLE_LOG_CHARSET", "return_of_substVars1");
                verify(loggerContextMock5).putProperty("CONSOLE_LOG_THRESHOLD", "return_of_substVars1");
                verify(loggerContextMock7).putProperty("FILE_LOG_PATTERN", "return_of_substVars1");
                verify(loggerContextMock9).putProperty("FILE_LOG_CHARSET", "return_of_substVars1");
                verify(loggerContextMock11).putProperty("FILE_LOG_THRESHOLD", "return_of_substVars1");
                verify(configMock).logger("org.apache.catalina.startup.DigesterFactory", level);
                verify(configMock).logger("org.apache.catalina.util.LifecycleBase", level);
                verify(configMock).logger("org.apache.coyote.http11.Http11NioProtocol", level2);
                verify(configMock).logger("org.apache.sshd.common.util.SecurityUtils", level2);
                verify(configMock).logger("org.apache.tomcat.util.net.NioSelectorPool", level2);
                verify(configMock).logger("org.eclipse.jetty.util.component.AbstractLifeCycle", level);
                verify(configMock).logger("org.hibernate.validator.internal.util.Version", level2);
                verify(configMock).logger("org.springframework.boot.actuate.endpoint.jmx", level2);
                verify(configMock).start((LifeCycle) any());
                verify(configMock).appender(eq("CONSOLE"), (Appender) any());
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_PATTERN:-%clr(%d{${LOG_DATEFORMAT_PATTERN:-yyyy-MM-dd'T'HH:mm:ss.SSSXXX}}){faint} %clr(${LOG_LEVEL_PATTERN:-%5p}) %clr(${PID:- }){magenta} %clr(---){faint} %clr(${LOGGED_APPLICATION_NAME:-}[%15.15t]){faint} %clr(${LOG_CORRELATION_PATTERN:-}){faint}%clr(%-40.40logger{39}){cyan} %clr(:){faint} %m%n${LOG_EXCEPTION_CONVERSION_WORD:-%wEx}}", loggerContextMock2), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_CHARSET:-UTF-8}", loggerContextMock4), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_THRESHOLD:-TRACE}", loggerContextMock6), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${FILE_LOG_PATTERN:-%d{${LOG_DATEFORMAT_PATTERN:-yyyy-MM-dd'T'HH:mm:ss.SSSXXX}} ${LOG_LEVEL_PATTERN:-%5p} ${PID:- } --- ${LOGGED_APPLICATION_NAME:-}[%t] ${LOG_CORRELATION_PATTERN:-}%-40.40logger{39} : %m%n${LOG_EXCEPTION_CONVERSION_WORD:-%wEx}}", loggerContextMock8), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${FILE_LOG_CHARSET:-UTF-8}", loggerContextMock10), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${FILE_LOG_THRESHOLD:-TRACE}", loggerContextMock12), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_THRESHOLD}", loggerContextMock13), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_PATTERN}", loggerContextMock14), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${CONSOLE_LOG_CHARSET}", loggerContextMock15), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${FILE_LOG_THRESHOLD}", loggerContextMock16), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${FILE_LOG_PATTERN}", loggerContextMock17), atLeast(1));
                optionHelper.verify(() -> OptionHelper.substVars("${FILE_LOG_CHARSET}", loggerContextMock18), atLeast(1));
            });
        }
    }
}
