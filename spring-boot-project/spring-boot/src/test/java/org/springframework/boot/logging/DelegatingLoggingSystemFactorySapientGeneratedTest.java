package org.springframework.boot.logging;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.function.Function;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DelegatingLoggingSystemFactorySapientGeneratedTest {

    private final Function functionMock = mock(Function.class);

    //Sapient generated method id: ${getLoggingSystemWhenLoggingSystemIsNotNull}, hash: 6BFDFCA0744574AB6C8AE4D69BD90971
    @Disabled()
    @Test()
    void getLoggingSystemWhenLoggingSystemIsNotNull() {
        /* Branches:
         * (this.delegates != null) : true
         * (delegates != null) : true
         * (for-each(delegates)) : true
         * (loggingSystem != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DelegatingLoggingSystemFactory target = new DelegatingLoggingSystemFactory(functionMock);
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        //Act Statement(s)
        LoggingSystem result = target.getLoggingSystem(classLoader);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getLoggingSystemWhenLoggingSystemIsNull}, hash: D105C748F7D34D7DCBE6791BA7061941
    @Test()
    void getLoggingSystemWhenLoggingSystemIsNull() {
        /* Branches:
         * (this.delegates != null) : true
         * (delegates != null) : true
         * (for-each(delegates)) : true
         * (loggingSystem != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DelegatingLoggingSystemFactory target = new DelegatingLoggingSystemFactory(functionMock);
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        //Act Statement(s)
        LoggingSystem result = target.getLoggingSystem(classLoader);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }
}
