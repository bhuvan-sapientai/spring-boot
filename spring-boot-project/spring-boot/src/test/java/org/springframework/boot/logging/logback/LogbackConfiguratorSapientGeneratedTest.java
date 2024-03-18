package org.springframework.boot.logging.logback;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.pattern.Converter;
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

	//Sapient generated method id: ${31c564db-0ad3-3c6d-b37c-50f945e58f85}, hash: F00713414512E2A7866F7FE5156A16C1
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

	//Sapient generated method id: ${dbfdc72e-ac3e-3b2d-922a-c3615e7ca2e7}, hash: 4B9AE84C29B6674BEA05E0D3D9920460
	@Test()
	void conversionRuleWhenRegistryIsNull() {
		/* Branches:
		 * (registry == null) : true
		 */
		//Arrange Statement(s)
	    /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    _assert.when(() -> Assert.notNull(contextMock, "Context must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    _assert.when(() -> Assert.hasLength("A", "Conversion word must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
    _assert.when(() -> Assert.notNull(Object.class, "Converter class must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    LogbackConfigurator target = new LogbackConfigurator(contextMock);
    doReturn(null).when(contextMock).getObject("PATTERN_RULE_REGISTRY");
    Map<String, String> stringStringMap = new HashMap<>();
    stringStringMap.put("A", "java.lang.Object");
    doNothing().when(contextMock).putObject(eq("PATTERN_RULE_REGISTRY"), eq(stringStringMap));
    //Act Statement(s)
    target.conversionRule("A", Object.class);
    //Assert statement(s)
    assertAll("result", () -> {
        _assert.verify(() -> Assert.notNull(contextMock, "Context must not be null"), atLeast(1));
        _assert.verify(() -> Assert.hasLength("A", "Conversion word must not be empty"), atLeast(1));
        _assert.verify(() -> Assert.notNull(Object.class, "Converter class must not be null"), atLeast(1));
        verify(contextMock).getObject("PATTERN_RULE_REGISTRY");
        verify(contextMock).putObject(eq("PATTERN_RULE_REGISTRY"), eq(stringStringMap));
    });
}*/
	}

	//Sapient generated method id: ${32b8870a-a87b-3b45-9ae9-f44732d8a2c7}, hash: 0C149711241A78F424882C2EDBECB8E9
	@Test()
	void appenderTest() {
		//Arrange Statement(s)
		Appender appenderMock = mock(Appender.class);
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

	//Sapient generated method id: ${0cf8ebb2-2c2c-309e-a87a-378be02e6efd}, hash: E2BB86BDD66607DF4806EE88A72D76DA
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

	//Sapient generated method id: ${6b1210eb-7306-3c43-9351-7bb5e1a868e9}, hash: 66C377183B7A47DFD2A5F66840C1DB77
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

	//Sapient generated method id: ${e147d52b-7eb6-3842-9144-2f38b18f9e21}, hash: 9D0ED4940417D76FEF08E93FD0024ABF
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

	//Sapient generated method id: ${93e29cb6-0e7e-3db5-973c-c0807d2db0ba}, hash: 360D6716A5B992EDC2C3CD7B79ED9D1F
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

	//Sapient generated method id: ${3fe34f2f-108d-309d-9530-d663e42f27d9}, hash: BF164BCD65E3F7B87226431B1D3B999F
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