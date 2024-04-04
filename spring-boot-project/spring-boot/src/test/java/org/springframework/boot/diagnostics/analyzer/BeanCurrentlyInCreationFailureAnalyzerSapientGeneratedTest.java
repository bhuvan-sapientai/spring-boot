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

	//Sapient generated method id: ${70b66d63-ea88-3ba4-976b-6788efdfcbb9}, hash: 07C2C5F7822E18683E94A3ED6F325EAB
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
		AbstractAutowireCapableBeanFactory abstractAutowireCapableBeanFactoryMock = mock(AbstractAutowireCapableBeanFactory.class, "valid_value");
		BeanCurrentlyInCreationFailureAnalyzer target = new BeanCurrentlyInCreationFailureAnalyzer(abstractAutowireCapableBeanFactoryMock);
		Throwable throwable = new Throwable();
		BeanCurrentlyInCreationException beanCurrentlyInCreationException = new BeanCurrentlyInCreationException("beanName1");

		//Act Statement(s)
		FailureAnalysis result = target.analyze(throwable, beanCurrentlyInCreationException);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}
}
