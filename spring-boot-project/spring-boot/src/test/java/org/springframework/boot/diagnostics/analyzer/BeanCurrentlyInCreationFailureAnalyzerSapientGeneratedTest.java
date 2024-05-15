package org.springframework.boot.diagnostics.analyzer;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BeanCurrentlyInCreationFailureAnalyzerSapientGeneratedTest {

    //Sapient generated method id: ${analyze2WhenCycleStartEqualsMinus1AndDependencyCycleIsNull}, hash: 6FB16B6469FC0999AD3E12708F6E999F
    @Test()
    void analyze2WhenCycleStartEqualsMinus1AndDependencyCycleIsNull() {
        /* Branches:
         * (candidate != null) : true  #  inside findCycle method
         * (beanInCycle != null) : true  #  inside findCycle method
         * (index == -1) : true  #  inside findCycle method
         * (cycleStart != -1) : false  #  inside findCycle method
         * (cycleStart == -1) : true  #  inside findCycle method
         * (dependencyCycle == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        AbstractAutowireCapableBeanFactory abstractAutowireCapableBeanFactoryMock = mock(AbstractAutowireCapableBeanFactory.class);
        BeanCurrentlyInCreationFailureAnalyzer target = new BeanCurrentlyInCreationFailureAnalyzer(abstractAutowireCapableBeanFactoryMock);
        Throwable throwable = new Throwable();
        BeanCurrentlyInCreationException beanCurrentlyInCreationExceptionMock = mock(BeanCurrentlyInCreationException.class);
        //Act Statement(s)
        FailureAnalysis result = target.analyze(throwable, beanCurrentlyInCreationExceptionMock);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }
}
