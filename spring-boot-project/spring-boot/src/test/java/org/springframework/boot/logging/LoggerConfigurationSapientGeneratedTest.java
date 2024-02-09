package org.springframework.boot.logging;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

import org.springframework.util.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LoggerConfigurationSapientGeneratedTest {

	private final LoggerConfiguration.LevelConfiguration loggerConfigurationLevelConfigurationMock = mock(LoggerConfiguration.LevelConfiguration.class);

	private final LoggerConfiguration.LevelConfiguration loggerConfigurationLevelConfigurationMock2 = mock(LoggerConfiguration.LevelConfiguration.class);

	private final LoggerConfiguration.LevelConfiguration loggerConfigurationLevelConfigurationMock3 = mock(LoggerConfiguration.LevelConfiguration.class);

	//Sapient generated method id: ${b7525f66-a023-3035-888b-e6f201454bf7}
	@Test()
	void getConfiguredLevelWhenConfigurationIsNotNull() {
		/* Branches:
		 * (configuration != null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("A", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(loggerConfigurationLevelConfigurationMock, "InheritedLevelConfiguration must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			LoggerConfiguration target = spy(new LoggerConfiguration("A", loggerConfigurationLevelConfigurationMock2, loggerConfigurationLevelConfigurationMock));
			doReturn(loggerConfigurationLevelConfigurationMock3).when(target).getLevelConfiguration(LoggerConfiguration.ConfigurationScope.DIRECT);
			doReturn(LogLevel.TRACE).when(loggerConfigurationLevelConfigurationMock3).getLevel();
			//Act Statement(s)
			LogLevel result = target.getConfiguredLevel();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(LogLevel.TRACE));
				_assert.verify(() -> Assert.notNull("A", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(loggerConfigurationLevelConfigurationMock, "InheritedLevelConfiguration must not be null"), atLeast(1));
				verify(target).getLevelConfiguration(LoggerConfiguration.ConfigurationScope.DIRECT);
				verify(loggerConfigurationLevelConfigurationMock3).getLevel();
			});
		}
	}

	//Sapient generated method id: ${b992a01f-8de7-3a01-8866-f925a855aa52}
	@Test()
	void getConfiguredLevelWhenConfigurationIsNull() {
		/* Branches:
		 * (configuration != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("A", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(loggerConfigurationLevelConfigurationMock, "InheritedLevelConfiguration must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			LoggerConfiguration target = spy(new LoggerConfiguration("A", loggerConfigurationLevelConfigurationMock2, loggerConfigurationLevelConfigurationMock));
			doReturn(null).when(target).getLevelConfiguration(LoggerConfiguration.ConfigurationScope.DIRECT);
			//Act Statement(s)
			LogLevel result = target.getConfiguredLevel();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.notNull("A", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(loggerConfigurationLevelConfigurationMock, "InheritedLevelConfiguration must not be null"), atLeast(1));
				verify(target).getLevelConfiguration(LoggerConfiguration.ConfigurationScope.DIRECT);
			});
		}
	}

	//Sapient generated method id: ${75620494-7913-3bd3-adeb-51eab9a3c1a9}
	@Test()
	void getEffectiveLevelTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("A", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(loggerConfigurationLevelConfigurationMock, "InheritedLevelConfiguration must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			LoggerConfiguration target = spy(new LoggerConfiguration("A", loggerConfigurationLevelConfigurationMock2, loggerConfigurationLevelConfigurationMock));
			doReturn(loggerConfigurationLevelConfigurationMock3).when(target).getLevelConfiguration();
			doReturn(LogLevel.TRACE).when(loggerConfigurationLevelConfigurationMock3).getLevel();
			//Act Statement(s)
			LogLevel result = target.getEffectiveLevel();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(LogLevel.TRACE));
				_assert.verify(() -> Assert.notNull("A", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(loggerConfigurationLevelConfigurationMock, "InheritedLevelConfiguration must not be null"), atLeast(1));
				verify(target).getLevelConfiguration();
				verify(loggerConfigurationLevelConfigurationMock3).getLevel();
			});
		}
	}

	//Sapient generated method id: ${31b3d60a-013f-3288-a51d-e9005fc32b19}
	@Test()
	void getLevelConfigurationTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("A", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(loggerConfigurationLevelConfigurationMock, "InheritedLevelConfiguration must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			LoggerConfiguration target = spy(new LoggerConfiguration("A", loggerConfigurationLevelConfigurationMock2, loggerConfigurationLevelConfigurationMock));
			doReturn(loggerConfigurationLevelConfigurationMock3).when(target).getLevelConfiguration(LoggerConfiguration.ConfigurationScope.INHERITED);
			//Act Statement(s)
			LoggerConfiguration.LevelConfiguration result = target.getLevelConfiguration();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(loggerConfigurationLevelConfigurationMock3));
				_assert.verify(() -> Assert.notNull("A", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(loggerConfigurationLevelConfigurationMock, "InheritedLevelConfiguration must not be null"), atLeast(1));
				verify(target).getLevelConfiguration(LoggerConfiguration.ConfigurationScope.INHERITED);
			});
		}
	}

	//Sapient generated method id: ${d00c55b9-4596-3ad0-8fbe-76ea00f518e6}
	@Test()
	void getLevelConfiguration1WhenScopeNotEqualsConfigurationScopeDIRECT() {
		/* Branches:
		 * (scope != ConfigurationScope.DIRECT) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("A", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(loggerConfigurationLevelConfigurationMock, "InheritedLevelConfiguration must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			LoggerConfiguration target = new LoggerConfiguration("A", loggerConfigurationLevelConfigurationMock2, loggerConfigurationLevelConfigurationMock);
			//Act Statement(s)
			LoggerConfiguration.LevelConfiguration result = target.getLevelConfiguration(LoggerConfiguration.ConfigurationScope.INHERITED);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(loggerConfigurationLevelConfigurationMock));
				_assert.verify(() -> Assert.notNull("A", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(loggerConfigurationLevelConfigurationMock, "InheritedLevelConfiguration must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c642fa07-e3e8-366a-bc36-8ebfe0842720}
	@Test()
	void getLevelConfiguration1WhenScopeEqualsConfigurationScopeDIRECT() {
		/* Branches:
		 * (scope != ConfigurationScope.DIRECT) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("A", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(loggerConfigurationLevelConfigurationMock, "InheritedLevelConfiguration must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			LoggerConfiguration target = new LoggerConfiguration("A", loggerConfigurationLevelConfigurationMock2, loggerConfigurationLevelConfigurationMock);
			//Act Statement(s)
			LoggerConfiguration.LevelConfiguration result = target.getLevelConfiguration(LoggerConfiguration.ConfigurationScope.DIRECT);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(loggerConfigurationLevelConfigurationMock2));
				_assert.verify(() -> Assert.notNull("A", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(loggerConfigurationLevelConfigurationMock, "InheritedLevelConfiguration must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
	@Test()
	void toStringTest() {
		//Arrange Statement(s)
		LoggerConfiguration.LevelConfiguration loggerConfigurationLevelConfigurationMock = mock(LoggerConfiguration.LevelConfiguration.class, "<init>_loggerConfiguration.LevelConfiguration2");
		LoggerConfiguration.LevelConfiguration loggerConfigurationLevelConfigurationMock2 = mock(LoggerConfiguration.LevelConfiguration.class, "<init>_loggerConfiguration.LevelConfiguration1");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("A", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(loggerConfigurationLevelConfigurationMock, "InheritedLevelConfiguration must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			LoggerConfiguration target = new LoggerConfiguration("A", loggerConfigurationLevelConfigurationMock2, loggerConfigurationLevelConfigurationMock);
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("LoggerConfiguration [name=A, levelConfiguration=<init>_loggerConfiguration.LevelConfiguration1, inheritedLevelConfiguration=<init>_loggerConfiguration.LevelConfiguration2]"));
				_assert.verify(() -> Assert.notNull("A", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(loggerConfigurationLevelConfigurationMock, "InheritedLevelConfiguration must not be null"), atLeast(1));
			});
		}
	}
}
