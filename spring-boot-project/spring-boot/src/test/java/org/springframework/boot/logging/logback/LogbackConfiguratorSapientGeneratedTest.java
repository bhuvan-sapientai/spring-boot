package org.springframework.boot.logging.logback;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.Appender;
import org.springframework.util.Assert;
import java.util.Map;
import java.util.HashMap;
import org.mockito.MockedStatic;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.classic.Logger;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LogbackConfiguratorSapientGeneratedTest {

    private final LoggerContext contextMock = mock(LoggerContext.class, "context");

    private final Appender<ILoggingEvent> appenderMock = mock(Appender.class);

    private final Level levelMock = mock(Level.class);

    private final Logger loggerMock = mock(Logger.class);

    //Sapient generated method id: ${getConfigurationLockTest}, hash: F00713414512E2A7866F7FE5156A16C1
    @Test()
    void getConfigurationLockTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(contextMock, "Context must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            LogbackConfigurator target = new LogbackConfigurator(contextMock);
            Object object = new Object();
            doReturn(object).when(contextMock).getConfigurationLock();
            //Act Statement(s)
            Object result = target.getConfigurationLock();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                _assert.verify(() -> Assert.notNull(contextMock, "Context must not be null"), atLeast(1));
                verify(contextMock).getConfigurationLock();
            });
        }
    }

    //Sapient generated method id: ${conversionRuleWhenRegistryIsNull}, hash: C71C019326710EFE212CABFC2C3A04DE
    @Test()
    void conversionRuleWhenRegistryIsNull() {
        /* Branches:
         * (registry == null) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(contextMock, "Context must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.hasLength("A", "Conversion word must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(Converter.class, "Converter class must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            LogbackConfigurator target = new LogbackConfigurator(contextMock);
            doReturn(null).when(contextMock).getObject("PATTERN_RULE_REGISTRY");
            Map<String, String> stringStringMap = new HashMap<>();
            stringStringMap.put("A", "ch.qos.logback.core.pattern.Converter");
            doNothing().when(contextMock).putObject(eq("PATTERN_RULE_REGISTRY"), eq(stringStringMap));
            //Act Statement(s)
            target.conversionRule("A", Converter.class);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(contextMock, "Context must not be null"), atLeast(1));
                _assert.verify(() -> Assert.hasLength("A", "Conversion word must not be empty"), atLeast(1));
                _assert.verify(() -> Assert.notNull(Converter.class, "Converter class must not be null"), atLeast(1));
                verify(contextMock).getObject("PATTERN_RULE_REGISTRY");
                verify(contextMock).putObject(eq("PATTERN_RULE_REGISTRY"), eq(stringStringMap));
            });
        }
    }

    //Sapient generated method id: ${appenderTest}, hash: D0E7690C3E85A2CC479B8F6CB70904AB
    @Test()
    void appenderTest() {
        //Arrange Statement(s)
        Appender<?> appenderMock = mock(Appender.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doNothing().when(appenderMock).setName("name1");
            _assert.when(() -> Assert.notNull(contextMock, "Context must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            LogbackConfigurator target = spy(new LogbackConfigurator(contextMock));
            doNothing().when(target).start(appenderMock);
            //Act Statement(s)
            target.appender("name1", appenderMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(appenderMock).setName("name1");
                _assert.verify(() -> Assert.notNull(contextMock, "Context must not be null"), atLeast(1));
                verify(target).start(appenderMock);
            });
        }
    }

    //Sapient generated method id: ${loggerTest}, hash: E2BB86BDD66607DF4806EE88A72D76DA
    @Test()
    void loggerTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(contextMock, "Context must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            LogbackConfigurator target = spy(new LogbackConfigurator(contextMock));
            doNothing().when(target).logger("name1", levelMock, true);
            //Act Statement(s)
            target.logger("name1", levelMock);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(contextMock, "Context must not be null"), atLeast(1));
                verify(target).logger("name1", levelMock, true);
            });
        }
    }

    //Sapient generated method id: ${logger1Test}, hash: 66C377183B7A47DFD2A5F66840C1DB77
    @Test()
    void logger1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(contextMock, "Context must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            LogbackConfigurator target = spy(new LogbackConfigurator(contextMock));
            doNothing().when(target).logger("name1", levelMock, false, (Appender) null);
            //Act Statement(s)
            target.logger("name1", levelMock, false);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(contextMock, "Context must not be null"), atLeast(1));
                verify(target).logger("name1", levelMock, false, (Appender) null);
            });
        }
    }

    //Sapient generated method id: ${logger2WhenAppenderIsNotNull}, hash: 9D0ED4940417D76FEF08E93FD0024ABF
    @Test()
    void logger2WhenAppenderIsNotNull() {
        /* Branches:
         * (level != null) : true
         * (appender != null) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(contextMock, "Context must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            LogbackConfigurator target = new LogbackConfigurator(contextMock);
            doReturn(loggerMock).when(contextMock).getLogger("name1");
            doNothing().when(loggerMock).setLevel(levelMock);
            doNothing().when(loggerMock).setAdditive(false);
            doNothing().when(loggerMock).addAppender(appenderMock);
            //Act Statement(s)
            target.logger("name1", levelMock, false, appenderMock);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(contextMock, "Context must not be null"), atLeast(1));
                verify(contextMock).getLogger("name1");
                verify(loggerMock).setLevel(levelMock);
                verify(loggerMock).setAdditive(false);
                verify(loggerMock).addAppender(appenderMock);
            });
        }
    }

    //Sapient generated method id: ${rootWhenAppendersIsNotEmpty}, hash: 360D6716A5B992EDC2C3CD7B79ED9D1F
    @Test()
    void rootWhenAppendersIsNotEmpty() {
        /* Branches:
         * (level != null) : true
         * (for-each(appenders)) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(contextMock, "Context must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            LogbackConfigurator target = new LogbackConfigurator(contextMock);
            doReturn(loggerMock).when(contextMock).getLogger("ROOT");
            doNothing().when(loggerMock).setLevel(levelMock);
            doNothing().when(loggerMock).addAppender(appenderMock);
            Appender<ILoggingEvent>[] appenderArray = new Appender[] { appenderMock };
            //Act Statement(s)
            target.root(levelMock, appenderArray);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(contextMock, "Context must not be null"), atLeast(1));
                verify(contextMock).getLogger("ROOT");
                verify(loggerMock).setLevel(levelMock);
                verify(loggerMock).addAppender(appenderMock);
            });
        }
    }

    //Sapient generated method id: ${startWhenLifeCycleNotInstanceOfContextAware}, hash: BF164BCD65E3F7B87226431B1D3B999F
    @Test()
    void startWhenLifeCycleNotInstanceOfContextAware() {
        /* Branches:
         * (lifeCycle instanceof ContextAware contextAware) : false
         */
         //Arrange Statement(s)
        LifeCycle lifeCycleMock = mock(LifeCycle.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doNothing().when(lifeCycleMock).start();
            _assert.when(() -> Assert.notNull(contextMock, "Context must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            LogbackConfigurator target = new LogbackConfigurator(contextMock);
            //Act Statement(s)
            target.start(lifeCycleMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(lifeCycleMock).start();
                _assert.verify(() -> Assert.notNull(contextMock, "Context must not be null"), atLeast(1));
            });
        }
    }
}
