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

    //Sapient generated method id: ${getConfiguredLevelWhenConfigurationIsNotNull}, hash: 6F3A3336BF89195375F55EB175C2CCD8
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

    //Sapient generated method id: ${getConfiguredLevelWhenConfigurationIsNull}, hash: B8E5244FA6CA9C5D7D6AC77915E22F86
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

    //Sapient generated method id: ${getEffectiveLevelTest}, hash: F747D8BA3040B10CB31F3DE31212D917
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

    //Sapient generated method id: ${getLevelConfigurationTest}, hash: F3F22F930D8E020F6ED71E31BCB8FC12
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

    //Sapient generated method id: ${getLevelConfiguration1WhenScopeNotEqualsConfigurationScopeDIRECT}, hash: D9457640BE8855F4A73AE1370CD49042
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

    //Sapient generated method id: ${getLevelConfiguration1WhenScopeEqualsConfigurationScopeDIRECT}, hash: 528CF15229B28236EA21BFCB48D95043
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

    //Sapient generated method id: ${toStringTest}, hash: C8C66269B101F0453CE7AEFDE9807BF9
    @Test()
    void toStringTest() {
        //Arrange Statement(s)
        LoggerConfiguration.LevelConfiguration loggerConfigurationLevelConfigurationMock = mock(LoggerConfiguration.LevelConfiguration.class, "inheritedLevelConfiguration");
        LoggerConfiguration.LevelConfiguration loggerConfigurationLevelConfigurationMock2 = mock(LoggerConfiguration.LevelConfiguration.class, "levelConfiguration");
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("A", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(loggerConfigurationLevelConfigurationMock, "InheritedLevelConfiguration must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            LoggerConfiguration target = new LoggerConfiguration("A", loggerConfigurationLevelConfigurationMock2, loggerConfigurationLevelConfigurationMock);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("LoggerConfiguration [name=A, levelConfiguration=levelConfiguration, inheritedLevelConfiguration=inheritedLevelConfiguration]"));
                _assert.verify(() -> Assert.notNull("A", "Name must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(loggerConfigurationLevelConfigurationMock, "InheritedLevelConfiguration must not be null"), atLeast(1));
            });
        }
    }
}
