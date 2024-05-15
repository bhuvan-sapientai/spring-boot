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
class ExtendedWhitespaceThrowablePatternConverterSapientGeneratedTest {

    //Sapient generated method id: ${newInstance1Test}, hash: EF875341B535B2AC45CCED1DB30FB647
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
        ExtendedWhitespaceThrowablePatternConverter result = ExtendedWhitespaceThrowablePatternConverter.newInstance(defaultConfiguration, stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${newInstance1Test2}, hash: 5F0081AD6AA81EB24E4F46E6F620EFF5
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
        ExtendedWhitespaceThrowablePatternConverter result = ExtendedWhitespaceThrowablePatternConverter.newInstance(defaultConfiguration, stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
