package org.springframework.boot.diagnostics.analyzer;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionOverrideException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BeanDefinitionOverrideFailureAnalyzerSapientGeneratedTest {

	//Sapient generated method id: ${d4c15bc6-3d36-3f68-8bbc-7cc0728869be}, hash: F452F5757D9E2F6B538EF2B4185A9F4D
	@Test()
	void analyze2WhenExGetExistingDefinitionGetResourceDescriptionIsNotNull() {
		/* Branches:
		 * (ex.getBeanDefinition().getResourceDescription() != null) : true  #  inside getDescription method
		 * (ex.getExistingDefinition().getResourceDescription() != null) : true  #  inside getDescription method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: printer - Method: printf
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		BeanDefinition beanDefinitionMock = mock(BeanDefinition.class);
		doReturn("return_of_getResourceDescription1").when(beanDefinitionMock).getResourceDescription();
		BeanDefinition beanDefinitionMock2 = mock(BeanDefinition.class);
		doReturn("return_of_getResourceDescription1").when(beanDefinitionMock2).getResourceDescription();
		BeanDefinitionOverrideFailureAnalyzer target = new BeanDefinitionOverrideFailureAnalyzer();
		Throwable throwable = new Throwable();
		BeanDefinitionOverrideException beanDefinitionOverrideException = new BeanDefinitionOverrideException("beanName1", beanDefinitionMock, beanDefinitionMock2);
		//Act Statement(s)
		FailureAnalysis result = target.analyze(throwable, beanDefinitionOverrideException);
		//Assert statement(s)
		//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(beanDefinitionMock, atLeast(2)).getResourceDescription();
			verify(beanDefinitionMock2, atLeast(2)).getResourceDescription();
		});
	}
}
