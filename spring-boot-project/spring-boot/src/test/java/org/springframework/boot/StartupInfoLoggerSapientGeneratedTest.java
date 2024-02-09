package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.mockito.stubbing.Answer;

import org.springframework.core.log.LogMessage;
import org.springframework.util.StringUtils;
import org.springframework.util.Assert;

import java.time.Duration;

import org.apache.commons.logging.Log;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class StartupInfoLoggerSapientGeneratedTest {

	private final SpringApplication.Startup startupMock = mock(SpringApplication.Startup.class);

	//Sapient generated method id: ${54b18329-c8c2-30f6-9f3a-4a234e5a50d9}
	@Test()
	void logStartingTest() {
		//Arrange Statement(s)
		LogMessage logMessageMock = mock(LogMessage.class);
		try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Log) null, "Log must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			logMessage.when(() -> LogMessage.of((Supplier) any())).thenReturn(logMessageMock);
			StartupInfoLogger target = new StartupInfoLogger(Object.class);
			Log log = null;
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				target.logStarting(log);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull((Log) null, "Log must not be null"), atLeast(1));
				logMessage.verify(() -> LogMessage.of((Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${8504f7d1-6a37-39c6-ab07-523a20473aea}
	@Disabled(value = "Potential harmful system call (Callable.call) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void logStartedWhenUptimeMsIsNotNull() throws Exception {
		/* Branches:
		 * (applicationLog.isInfoEnabled()) : true
		 * (result != null) : true  #  inside append method
		 * (!StringUtils.hasLength(value)) : true  #  inside append method
		 * (StringUtils.hasLength(value)) : false  #  inside append method
		 * (uptimeMs != null) : true  #  inside getStartedMessage method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			doReturn("return_of_action1").when(startupMock).action();
			Duration duration = Duration.ofDays(0L);
			doReturn(duration).when(startupMock).timeTakenToStarted();
			doReturn(1L).when(startupMock).processUptime();
			stringUtils.when(() -> StringUtils.hasLength("callIfPossible_object1")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasLength("")).thenReturn(false);
			StartupInfoLogger target = new StartupInfoLogger(Object.class);
			//TODO: Needs initialization with real value
			Log log = null;
			//Act Statement(s)
			target.logStarted(log, startupMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(startupMock).action();
				verify(startupMock).timeTakenToStarted();
				verify(startupMock).processUptime();
				stringUtils.verify(() -> StringUtils.hasLength("callIfPossible_object1"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength(""), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${9dd8ed23-fc40-3d93-a829-591273f62890}
	@Disabled(value = "Potential harmful system call (Callable.call) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void logStartedWhenStringUtilsNotHasLengthValueAndStringUtilsNotHasLengthValueAndUptimeMsIsNull() throws Exception {
		/* Branches:
		 * (applicationLog.isInfoEnabled()) : true
		 * (result != null) : false  #  inside append method
		 * (!StringUtils.hasLength(value)) : true  #  inside append method
		 * (StringUtils.hasLength(value)) : false  #  inside append method
		 * (uptimeMs != null) : false  #  inside getStartedMessage method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn("return_of_action1").when(startupMock).action();
		Duration duration = Duration.ofDays(0L);
		doReturn(duration).when(startupMock).timeTakenToStarted();
		doReturn(null).when(startupMock).processUptime();
		StartupInfoLogger target = new StartupInfoLogger(Object.class);
		//TODO: Needs initialization with real value
		Log log = null;

		//Act Statement(s)
		target.logStarted(log, startupMock);

		//Assert statement(s)
		assertAll("result", () -> {
			verify(startupMock).action();
			verify(startupMock).timeTakenToStarted();
			verify(startupMock).processUptime();
		});
	}

	//Sapient generated method id: ${50c1a04c-aa6d-3e04-b0cf-3f81c44fcf3e}
	@Disabled(value = "Potential harmful system call (Callable.call) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void logStartedWhenMessageNotIsEmptyAndUptimeMsIsNull() throws Exception {
		/* Branches:
		 * (applicationLog.isInfoEnabled()) : true
		 * (result != null) : true  #  inside append method
		 * (!StringUtils.hasLength(value)) : false  #  inside append method
		 * (StringUtils.hasLength(value)) : true  #  inside append method
		 * (!message.isEmpty()) : true  #  inside append method
		 * (uptimeMs != null) : false  #  inside getStartedMessage method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn("return_of_action1").when(startupMock).action();
		Duration duration = Duration.ofDays(0L);
		doReturn(duration).when(startupMock).timeTakenToStarted();
		doReturn(null).when(startupMock).processUptime();
		StartupInfoLogger target = new StartupInfoLogger(Object.class);
		//TODO: Needs initialization with real value
		Log log = null;

		//Act Statement(s)
		target.logStarted(log, startupMock);

		//Assert statement(s)
		assertAll("result", () -> {
			verify(startupMock).action();
			verify(startupMock).timeTakenToStarted();
			verify(startupMock).processUptime();
		});
	}

	//Sapient generated method id: ${25eec3f8-2d27-3edd-b55c-e87b8ad8328b}
	@Disabled(value = "Potential harmful system call (Callable.call) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void logStartedWhenMessageIsEmptyAndUptimeMsIsNull() throws Exception {
		/* Branches:
		 * (applicationLog.isInfoEnabled()) : true
		 * (result != null) : true  #  inside append method
		 * (!StringUtils.hasLength(value)) : false  #  inside append method
		 * (StringUtils.hasLength(value)) : true  #  inside append method
		 * (!message.isEmpty()) : false  #  inside append method
		 * (uptimeMs != null) : false  #  inside getStartedMessage method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn("return_of_action1").when(startupMock).action();
		Duration duration = Duration.ofDays(0L);
		doReturn(duration).when(startupMock).timeTakenToStarted();
		doReturn(null).when(startupMock).processUptime();
		StartupInfoLogger target = new StartupInfoLogger(Object.class);
		//TODO: Needs initialization with real value
		Log log = null;

		//Act Statement(s)
		target.logStarted(log, startupMock);

		//Assert statement(s)
		assertAll("result", () -> {
			verify(startupMock).action();
			verify(startupMock).timeTakenToStarted();
			verify(startupMock).processUptime();
		});
	}

	//Sapient generated method id: ${61edd902-ad58-32aa-ab5d-983574a500dd}
	@Disabled(value = "Potential harmful system call (Callable.call) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void logStartedWhenStringUtilsNotHasLengthValueAndUptimeMsIsNotNull() throws Exception {
		/* Branches:
		 * (applicationLog.isInfoEnabled()) : true
		 * (catch-exception (Exception)) : true  #  inside callIfPossible method
		 * (result != null) : false  #  inside append method
		 * (!StringUtils.hasLength(value)) : true  #  inside append method
		 * (StringUtils.hasLength(value)) : false  #  inside append method
		 * (uptimeMs != null) : true  #  inside getStartedMessage method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn("return_of_action1").when(startupMock).action();
		Duration duration = Duration.ofDays(0L);
		doReturn(duration).when(startupMock).timeTakenToStarted();
		doReturn(0L).when(startupMock).processUptime();
		StartupInfoLogger target = new StartupInfoLogger(Object.class);
		//TODO: Needs initialization with real value
		Log log = null;

		//Act Statement(s)
		target.logStarted(log, startupMock);

		//Assert statement(s)
		assertAll("result", () -> {
			verify(startupMock).action();
			verify(startupMock).timeTakenToStarted();
			verify(startupMock).processUptime();
		});
	}
}
