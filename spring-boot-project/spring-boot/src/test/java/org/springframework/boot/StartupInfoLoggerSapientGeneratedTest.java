package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.mockito.stubbing.Answer;
import org.apache.commons.logging.impl.NoOpLog;

import org.springframework.core.log.LogMessage;
import org.springframework.util.StringUtils;
import org.springframework.util.Assert;

import java.time.Duration;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class StartupInfoLoggerSapientGeneratedTest {

	private final SpringApplication.Startup startupMock = mock(SpringApplication.Startup.class, "start");

	//Sapient generated method id: ${54b18329-c8c2-30f6-9f3a-4a234e5a50d9}, hash: 8EBCFFAF632432E6C01F0178ABA50263
	@Test()
	void logStartingTest() {
		//Arrange Statement(s)
		LogMessage logMessageMock = mock(LogMessage.class);
		LogMessage logMessageMock2 = mock(LogMessage.class);
		try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			NoOpLog noOpLog = new NoOpLog();
			_assert.when(() -> Assert.notNull(noOpLog, "Log must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			logMessage.when(() -> LogMessage.of((Supplier) any())).thenReturn(logMessageMock).thenReturn(logMessageMock2);
			StartupInfoLogger target = new StartupInfoLogger(Object.class);
			//Act Statement(s)
			target.logStarting(noOpLog);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(noOpLog, "Log must not be null"), atLeast(1));
				logMessage.verify(() -> LogMessage.of((Supplier) any()), atLeast(2));
			});
		}
	}

	//Sapient generated method id: ${8504f7d1-6a37-39c6-ab07-523a20473aea}, hash: 6413A18F94367CC06F72664EA7A815D8
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
		 * TODO: Help needed! This method is not unit testable!
		 *  Potential harmful system call (Callable.call) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
		 *  Suggestions:
		 *  This method should be avoided from unit testing. This can be covered during integration testing.
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
			NoOpLog noOpLog = new NoOpLog();
			//Act Statement(s)
			target.logStarted(noOpLog, startupMock);
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

	//Sapient generated method id: ${9dd8ed23-fc40-3d93-a829-591273f62890}, hash: 6AA35986E1F4AA604F9CEB648337B89B
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
		 * TODO: Help needed! This method is not unit testable!
		 *  Potential harmful system call (Callable.call) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
		 *  Suggestions:
		 *  This method should be avoided from unit testing. This can be covered during integration testing.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringApplication.Startup startupMock = mock(SpringApplication.Startup.class);
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			doReturn("<value>").when(startupMock).action();
			Duration duration = Duration.ofDays(0L);
			doReturn(duration).when(startupMock).timeTakenToStarted();
			doReturn(null).when(startupMock).processUptime();
			stringUtils.when(() -> StringUtils.hasLength((String) null)).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasLength("")).thenReturn(false);
			StartupInfoLogger target = new StartupInfoLogger(Object.class);
			NoOpLog noOpLog = new NoOpLog();
			//Act Statement(s)
			target.logStarted(noOpLog, startupMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(startupMock).action();
				verify(startupMock).timeTakenToStarted();
				verify(startupMock).processUptime();
				stringUtils.verify(() -> StringUtils.hasLength((String) null), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength(""), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${50c1a04c-aa6d-3e04-b0cf-3f81c44fcf3e}, hash: 03D8A9D5F02E568B75F440820B93A220
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
		 * TODO: Help needed! This method is not unit testable!
		 *  Potential harmful system call (Callable.call) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
		 *  Suggestions:
		 *  This method should be avoided from unit testing. This can be covered during integration testing.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			doReturn("start").when(startupMock).action();
			Duration duration = Duration.ofDays(0L);
			doReturn(duration).when(startupMock).timeTakenToStarted();
			doReturn(null).when(startupMock).processUptime();
			stringUtils.when(() -> StringUtils.hasLength("callIfPossible_object1")).thenReturn(true);
			StartupInfoLogger target = new StartupInfoLogger(Object.class);
			NoOpLog noOpLog = new NoOpLog();
			//Act Statement(s)
			target.logStarted(noOpLog, startupMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(startupMock).action();
				verify(startupMock).timeTakenToStarted();
				verify(startupMock).processUptime();
				stringUtils.verify(() -> StringUtils.hasLength("callIfPossible_object1"), atLeast(2));
			});
		}
	}

	//Sapient generated method id: ${61edd902-ad58-32aa-ab5d-983574a500dd}, hash: 1032BBFC5B8941C94C3A2A38153800C0
	@Test()
	void logStartedWhenStringUtilsNotHasLengthValueAndUptimeMsIsNotNull() throws Exception {
		/* Branches:
		 * (applicationLog.isInfoEnabled()) : true
		 * (catch-exception (Exception)) : true  #  inside callIfPossible method
		 * (result != null) : false  #  inside append method
		 * (!StringUtils.hasLength(value)) : true  #  inside append method
		 * (StringUtils.hasLength(value)) : false  #  inside append method
		 * (uptimeMs != null) : true  #  inside getStartedMessage method
		 */
		//Arrange Statement(s)
		SpringApplication.Startup startupMock = mock(SpringApplication.Startup.class, "value");
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			doReturn("String").when(startupMock).action();
			Duration duration = Duration.ofDays(0L);
			doReturn(duration).when(startupMock).timeTakenToStarted();
			doReturn(0L).when(startupMock).processUptime();
			stringUtils.when(() -> StringUtils.hasLength((String) null)).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasLength("")).thenReturn(false);
			StartupInfoLogger target = new StartupInfoLogger(Object.class);
			NoOpLog noOpLog = new NoOpLog();
			//Act Statement(s)
			target.logStarted(noOpLog, startupMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(startupMock).action();
				verify(startupMock).timeTakenToStarted();
				verify(startupMock).processUptime();
				stringUtils.verify(() -> StringUtils.hasLength((String) null), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength(""), atLeast(1));
			});
		}
	}
}
