package org.springframework.boot.logging;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

import org.springframework.util.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LoggerConfigurationComparatorSapientGeneratedTest {

	//Sapient generated method id: ${24f34521-83f9-3694-a3ba-8c0444818994}
	@Test()
	void compareWhenThisRootLoggerNameEqualsO1GetName() {
		/* Branches:
		 * (this.rootLoggerName.equals(o1.getName())) : true
		 */
		//Arrange Statement(s)
		LoggerConfiguration loggerConfigurationMock = mock(LoggerConfiguration.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("A", "RootLoggerName must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			LoggerConfigurationComparator target = new LoggerConfigurationComparator("A");
			LoggerConfiguration loggerConfiguration = new LoggerConfiguration("A", LogLevel.TRACE, LogLevel.TRACE);
			//Act Statement(s)
			int result = target.compare(loggerConfiguration, loggerConfigurationMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(-1));
				_assert.verify(() -> Assert.notNull("A", "RootLoggerName must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${b740a844-765a-34df-ad4f-922c2c726210}
	@Test()
	void compareWhenThisRootLoggerNameEqualsO2GetName() {
		/* Branches:
		 * (this.rootLoggerName.equals(o1.getName())) : false
		 * (this.rootLoggerName.equals(o2.getName())) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("A", "RootLoggerName must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			LoggerConfigurationComparator target = new LoggerConfigurationComparator("A");
			LoggerConfiguration loggerConfiguration = new LoggerConfiguration("B", LogLevel.TRACE, LogLevel.TRACE);
			LoggerConfiguration loggerConfiguration2 = new LoggerConfiguration("A", LogLevel.TRACE, LogLevel.TRACE);
			//Act Statement(s)
			int result = target.compare(loggerConfiguration, loggerConfiguration2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(1));
				_assert.verify(() -> Assert.notNull("A", "RootLoggerName must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${591a154f-9d5d-3ecd-b034-0989bcb96de0}
	@Test()
	void compareWhenThisRootLoggerNameNotEqualsO2GetName() {
		/* Branches:
		 * (this.rootLoggerName.equals(o1.getName())) : false
		 * (this.rootLoggerName.equals(o2.getName())) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("A", "RootLoggerName must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			LoggerConfigurationComparator target = new LoggerConfigurationComparator("A");
			LoggerConfiguration loggerConfiguration = new LoggerConfiguration("B", LogLevel.TRACE, LogLevel.TRACE);
			LoggerConfiguration loggerConfiguration2 = new LoggerConfiguration("C", LogLevel.TRACE, LogLevel.TRACE);
			//Act Statement(s)
			int result = target.compare(loggerConfiguration, loggerConfiguration2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(-1));
				_assert.verify(() -> Assert.notNull("A", "RootLoggerName must not be null"), atLeast(1));
			});
		}
	}
}
