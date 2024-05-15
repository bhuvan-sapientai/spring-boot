package org.springframework.boot.logging.log4j2;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.core.config.DefaultConfiguration;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class WhitespaceThrowablePatternConverterSapientGeneratedTest {

    //Sapient generated method id: ${newInstance1Test}, hash: FA95820A1A68F5AECF6413397D8B7D35
    @Test()
    void newInstance1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DefaultConfiguration defaultConfiguration = new DefaultConfiguration();
        String[] stringArray = new String[] {};
        //Act Statement(s)
        WhitespaceThrowablePatternConverter result = WhitespaceThrowablePatternConverter.newInstance(defaultConfiguration, stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${newInstance1Test2}, hash: 7A0BB68102B6DB343FFE1039B9114B89
    @Disabled()
    @Test()
    void newInstance1Test2() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DefaultConfiguration defaultConfiguration = new DefaultConfiguration();
        String[] stringArray = new String[] { "A" };
        //Act Statement(s)
        WhitespaceThrowablePatternConverter result = WhitespaceThrowablePatternConverter.newInstance(defaultConfiguration, stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
