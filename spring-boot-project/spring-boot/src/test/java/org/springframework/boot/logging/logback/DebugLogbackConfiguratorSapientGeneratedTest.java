package org.springframework.boot.logging.logback;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.Appender;

import org.springframework.util.Assert;

import java.util.Map;
import java.util.HashMap;

import org.mockito.MockedStatic;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.classic.Logger;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DebugLogbackConfiguratorSapientGeneratedTest {

	private final LoggerContext contextMock = mock(LoggerContext.class, "context");

	private final StatusManager statusManagerMock = mock(StatusManager.class);

	//Sapient generated method id: ${dbfdc72e-ac3e-3b2d-922a-c3615e7ca2e7}, hash: 2B6DA8B6CA219ED54AD74EB86C56FB61
	@Test()
	void conversionRuleWhenRegistryIsNull() {
		/* Branches:
		 * (registry == null) : true  #  inside conversionRule method
		 */
		//Arrange Statement(s)
	    /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    doReturn(statusManagerMock).when(contextMock).getStatusManager();
    doNothing().when(statusManagerMock).add((InfoStatus) any());
    _assert.when(() -> Assert.notNull(contextMock, "Context must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    _assert.when(() -> Assert.hasLength("B", "Conversion word must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
    _assert.when(() -> Assert.notNull(Object.class, "Converter class must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    DebugLogbackConfigurator target = new DebugLogbackConfigurator(contextMock);
    doReturn(null).when(contextMock).getObject("PATTERN_RULE_REGISTRY");
    Map<String, String> stringStringMap = new HashMap<>();
    stringStringMap.put("B", "java.lang.Object");
    doNothing().when(contextMock).putObject(eq("PATTERN_RULE_REGISTRY"), eq(stringStringMap));
    //Act Statement(s)
    target.conversionRule("B", Object.class);
    //Assert statement(s)
    assertAll("result", () -> {
        verify(contextMock).getStatusManager();
        verify(statusManagerMock).add((InfoStatus) any());
        _assert.verify(() -> Assert.notNull(contextMock, "Context must not be null"), atLeast(1));
        _assert.verify(() -> Assert.hasLength("B", "Conversion word must not be empty"), atLeast(1));
        _assert.verify(() -> Assert.notNull(Object.class, "Converter class must not be null"), atLeast(1));
        verify(contextMock).getObject("PATTERN_RULE_REGISTRY");
        verify(contextMock).putObject(eq("PATTERN_RULE_REGISTRY"), eq(stringStringMap));
    });
}*/
	}

	//Sapient generated method id: ${32b8870a-a87b-3b45-9ae9-f44732d8a2c7}, hash: C3F138A135DEF3CFA2B06C8051F79DDA
	@Test()
	void appenderTest() {
		//Arrange Statement(s)
		Appender appenderMock = mock(Appender.class, "appender_appender1");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doNothing().when(appenderMock).setName("A");
			doReturn(statusManagerMock).when(contextMock).getStatusManager();
			doNothing().when(statusManagerMock).add((InfoStatus) any());
			_assert.when(() -> Assert.notNull(contextMock, "Context must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DebugLogbackConfigurator target = spy(new DebugLogbackConfigurator(contextMock));
			doNothing().when(target).start(appenderMock);
			//Act Statement(s)
			target.appender("A", appenderMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(appenderMock).setName("A");
				verify(contextMock).getStatusManager();
				verify(statusManagerMock).add((InfoStatus) any());
				_assert.verify(() -> Assert.notNull(contextMock, "Context must not be null"), atLeast(1));
				verify(target).start(appenderMock);
			});
		}
	}

	//Sapient generated method id: ${e147d52b-7eb6-3842-9144-2f38b18f9e21}, hash: 718938D93C3A2456BEBCA013D32677ED
	@Test()
	void logger2WhenAppenderIsNotNull() {
		/* Branches:
		 * (appender != null) : true
		 * (level != null) : true  #  inside logger method
		 * (appender != null) : true  #  inside logger method
		 */
		//Arrange Statement(s)
		StatusManager statusManagerMock2 = mock(StatusManager.class);
		Logger loggerMock = mock(Logger.class);
		Level levelMock = mock(Level.class, "logger_level1");
		Appender<ILoggingEvent> appenderMock = mock(Appender.class, "logger_appender1");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doNothing().when(statusManagerMock).add((InfoStatus) any());
			doReturn(statusManagerMock, statusManagerMock2).when(contextMock).getStatusManager();
			doNothing().when(statusManagerMock2).add((InfoStatus) any());
			_assert.when(() -> Assert.notNull(contextMock, "Context must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DebugLogbackConfigurator target = new DebugLogbackConfigurator(contextMock);
			doReturn(loggerMock).when(contextMock).getLogger("A");
			doNothing().when(loggerMock).setLevel(levelMock);
			doNothing().when(loggerMock).setAdditive(false);
			doNothing().when(loggerMock).addAppender(appenderMock);
			//Act Statement(s)
			target.logger("A", levelMock, false, appenderMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(contextMock, times(2)).getStatusManager();
				verify(statusManagerMock).add((InfoStatus) any());
				verify(statusManagerMock2).add((InfoStatus) any());
				_assert.verify(() -> Assert.notNull(contextMock, "Context must not be null"), atLeast(1));
				verify(contextMock).getLogger("A");
				verify(loggerMock).setLevel(levelMock);
				verify(loggerMock).setAdditive(false);
				verify(loggerMock).addAppender(appenderMock);
			});
		}
	}

	//Sapient generated method id: ${3fe34f2f-108d-309d-9530-d663e42f27d9}, hash: 456D91C38B9AAC0EE6281942CA7A767D
	@Test()
	void startWhenLifeCycleNotInstanceOfContextAware() {
		/* Branches:
		 * (lifeCycle instanceof ContextAware contextAware) : false  #  inside start method
		 */
		//Arrange Statement(s)
		LifeCycle lifeCycleMock = mock(LifeCycle.class, "start_lifeCycle1");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doNothing().when(lifeCycleMock).start();
			doReturn(statusManagerMock).when(contextMock).getStatusManager();
			doNothing().when(statusManagerMock).add((InfoStatus) any());
			_assert.when(() -> Assert.notNull(contextMock, "Context must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DebugLogbackConfigurator target = new DebugLogbackConfigurator(contextMock);
			//Act Statement(s)
			target.start(lifeCycleMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(lifeCycleMock).start();
				verify(contextMock).getStatusManager();
				verify(statusManagerMock).add((InfoStatus) any());
				_assert.verify(() -> Assert.notNull(contextMock, "Context must not be null"), atLeast(1));
			});
		}
	}
}