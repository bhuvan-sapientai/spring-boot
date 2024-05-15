package org.springframework.boot.diagnostics.analyzer;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanNotOfRequiredTypeException;
import org.springframework.boot.diagnostics.FailureAnalysis;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BeanNotOfRequiredTypeFailureAnalyzerSapientGeneratedTest {

    //Sapient generated method id: ${analyze2WhenProxyNotIsProxyClassCauseGetActualType}, hash: B898436E920457AF1D5C14F3C99507CF
    @Test()
    void analyze2WhenProxyNotIsProxyClassCauseGetActualType() {
        /* Branches:
         * (!Proxy.isProxyClass(cause.getActualType())) : true
         */
        //Arrange Statement(s)
        BeanNotOfRequiredTypeFailureAnalyzer target = new BeanNotOfRequiredTypeFailureAnalyzer();
        Throwable throwable = new Throwable();
        BeanNotOfRequiredTypeException beanNotOfRequiredTypeException = new BeanNotOfRequiredTypeException("beanName1", Object.class, Object.class);
        //Act Statement(s)
        FailureAnalysis result = target.analyze(throwable, beanNotOfRequiredTypeException);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${analyze2WhenExGetRequiredTypeGetInterfacesIsNotEmpty}, hash: CB54E363521E78F2F7CD154DDA37B7A5
    @Disabled()
    @Test()
    void analyze2WhenExGetRequiredTypeGetInterfacesIsNotEmpty() {
        /* Branches:
         * (!Proxy.isProxyClass(cause.getActualType())) : false
         * (for-each(ex.getActualType().getInterfaces())) : true  #  inside getDescription method
         * (for-each(ex.getRequiredType().getInterfaces())) : true  #  inside getDescription method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BeanNotOfRequiredTypeFailureAnalyzer target = new BeanNotOfRequiredTypeFailureAnalyzer();
        Throwable throwable = new Throwable();
        BeanNotOfRequiredTypeException beanNotOfRequiredTypeException = new BeanNotOfRequiredTypeException("beanName1", Object.class, Object.class);
        //Act Statement(s)
        FailureAnalysis result = target.analyze(throwable, beanNotOfRequiredTypeException);
        //Assert statement(s)
        //TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
