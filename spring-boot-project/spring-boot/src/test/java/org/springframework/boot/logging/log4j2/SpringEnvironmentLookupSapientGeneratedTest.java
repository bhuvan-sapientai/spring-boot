package org.springframework.boot.logging.log4j2;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.springframework.core.env.Environment;
import org.mockito.MockitoAnnotations;
import org.springframework.util.Assert;
import org.mockito.MockedStatic;
import org.apache.logging.log4j.core.LoggerContext;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringEnvironmentLookupSapientGeneratedTest {

    private final Environment environmentMock = mock(Environment.class, "environment");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private SpringEnvironmentLookup target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${lookup1WhenThisEnvironmentIsNull}, hash: 97BAD4E0D030A5C8090BD018D18A0429
    @Disabled()
    @Test()
    void lookup1WhenThisEnvironmentIsNull() {
        /* Branches:
         * (this.environment != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.state(false, "Unable to obtain Spring Environment from LoggerContext")).thenAnswer((Answer<Void>) invocation -> null);
            target = new SpringEnvironmentLookup();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn("return_of_getProperty1").when(environmentMock).getProperty("key1");
            //Act Statement(s)
            String result = target.lookup("key1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                _assert.verify(() -> Assert.state(false, "Unable to obtain Spring Environment from LoggerContext"), atLeast(1));
                verify(environmentMock).getProperty("key1");
            });
        }
    }

    //Sapient generated method id: ${setLoggerContextTest}, hash: 150B5EBE52F5B7AC6E6DAFD6C8820686
    @Test()
    void setLoggerContextTest() {
        //Arrange Statement(s)
        Environment environmentMock2 = mock(Environment.class);
        try (MockedStatic<Log4J2LoggingSystem> log4J2LoggingSystem = mockStatic(Log4J2LoggingSystem.class)) {
            LoggerContext loggerContext = new LoggerContext("name1");
            log4J2LoggingSystem.when(() -> Log4J2LoggingSystem.getEnvironment(loggerContext)).thenReturn(environmentMock2);
            target = new SpringEnvironmentLookup();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.setLoggerContext(loggerContext);
            //Assert statement(s)
            assertAll("result", () -> log4J2LoggingSystem.verify(() -> Log4J2LoggingSystem.getEnvironment(loggerContext), atLeast(1)));
        }
    }
}
