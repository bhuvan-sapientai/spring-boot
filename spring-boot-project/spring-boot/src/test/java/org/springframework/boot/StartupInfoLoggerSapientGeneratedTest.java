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

    private final SpringApplication.Startup startupMock = mock(SpringApplication.Startup.class);

    //Sapient generated method id: ${logStartingTest}, hash: 8EBCFFAF632432E6C01F0178ABA50263
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

    //Sapient generated method id: ${logStartedWhenUptimeMsIsNotNull}, hash: 8AC0C5F5081065F36E8AF9B4D2AD26DD
    @Disabled()
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
            stringUtils.when(() -> StringUtils.hasLength("object")).thenReturn(false);
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
                stringUtils.verify(() -> StringUtils.hasLength("object"), atLeast(1));
                stringUtils.verify(() -> StringUtils.hasLength(""), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${logStartedWhenStringUtilsNotHasLengthValueAndStringUtilsNotHasLengthValueAndUptimeMsIsNull}, hash: 9C1C7594033D9E15ADDC52AFB943A425
    @Disabled()
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
        doReturn("return_of_action1").when(startupMock).action();
        Duration duration = Duration.ofDays(0L);
        doReturn(duration).when(startupMock).timeTakenToStarted();
        doReturn(null).when(startupMock).processUptime();
        StartupInfoLogger target = new StartupInfoLogger(Object.class);
        NoOpLog noOpLog = new NoOpLog();
        
        //Act Statement(s)
        target.logStarted(noOpLog, startupMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(startupMock).action();
            verify(startupMock).timeTakenToStarted();
            verify(startupMock).processUptime();
        });
    }

    //Sapient generated method id: ${logStartedWhenMessageNotIsEmptyAndUptimeMsIsNull}, hash: 63DD633B294C96E8989A31BBE045C574
    @Disabled()
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
        doReturn("A").when(startupMock).action();
        Duration duration = Duration.ofDays(0L);
        doReturn(duration).when(startupMock).timeTakenToStarted();
        doReturn(null).when(startupMock).processUptime();
        StartupInfoLogger target = new StartupInfoLogger(Object.class);
        NoOpLog noOpLog = new NoOpLog();
        
        //Act Statement(s)
        target.logStarted(noOpLog, startupMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(startupMock).action();
            verify(startupMock).timeTakenToStarted();
            verify(startupMock).processUptime();
        });
    }

    //Sapient generated method id: ${logStartedWhenMessageIsEmptyAndUptimeMsIsNull}, hash: 268494C81485EE1DCFCC6497E0577005
    @Disabled()
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
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Callable.call) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn("").when(startupMock).action();
        Duration duration = Duration.ofDays(0L);
        doReturn(duration).when(startupMock).timeTakenToStarted();
        doReturn(null).when(startupMock).processUptime();
        StartupInfoLogger target = new StartupInfoLogger(Object.class);
        NoOpLog noOpLog = new NoOpLog();
        
        //Act Statement(s)
        target.logStarted(noOpLog, startupMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(startupMock).action();
            verify(startupMock).timeTakenToStarted();
            verify(startupMock).processUptime();
        });
    }

    //Sapient generated method id: ${logStartedWhenStringUtilsNotHasLengthValueAndUptimeMsIsNotNull}, hash: CBFCB711D4EEFBE43C67AA754F1A5232
    @Disabled()
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
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Callable.call) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn("return_of_action1").when(startupMock).action();
        Duration duration = Duration.ofDays(0L);
        doReturn(duration).when(startupMock).timeTakenToStarted();
        doReturn(0L).when(startupMock).processUptime();
        StartupInfoLogger target = new StartupInfoLogger(Object.class);
        NoOpLog noOpLog = new NoOpLog();
        
        //Act Statement(s)
        target.logStarted(noOpLog, startupMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(startupMock).action();
            verify(startupMock).timeTakenToStarted();
            verify(startupMock).processUptime();
        });
    }
}
