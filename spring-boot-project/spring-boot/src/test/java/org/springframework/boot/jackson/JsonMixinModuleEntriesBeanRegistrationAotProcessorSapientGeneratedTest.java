package org.springframework.boot.jackson;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.support.RegisteredBean;

import org.mockito.MockedStatic;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.util.function.UnaryOperator;

import org.springframework.beans.factory.aot.BeanRegistrationAotContribution;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JsonMixinModuleEntriesBeanRegistrationAotProcessorSapientGeneratedTest {

	//Sapient generated method id: ${bebb1a69-ea64-3a97-9525-239e1e6a6003}, hash: D51D92C2DDBC99875079F5FA8DFF9B99
	@Disabled()
	@Test()
	void processAheadOfTimeWhenRegisteredBeanGetBeanClassEqualsJsonMixinModuleEntries() {
		/* Branches:
		 * (registeredBean.getBeanClass().equals(JsonMixinModuleEntries.class)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		RegisteredBean registeredBeanMock = mock(RegisteredBean.class);
		BeanRegistrationAotContribution beanRegistrationAotContributionMock = mock(BeanRegistrationAotContribution.class);
		try (MockedStatic<BeanRegistrationAotContribution> beanRegistrationAotContribution = mockStatic(BeanRegistrationAotContribution.class)) {
			doReturn(Object.class).when(registeredBeanMock).getBeanClass();
			beanRegistrationAotContribution.when(() -> BeanRegistrationAotContribution.withCustomCodeFragments((UnaryOperator) any())).thenReturn(beanRegistrationAotContributionMock);
			JsonMixinModuleEntriesBeanRegistrationAotProcessor target = new JsonMixinModuleEntriesBeanRegistrationAotProcessor();
			//Act Statement(s)
			BeanRegistrationAotContribution result = target.processAheadOfTime(registeredBeanMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(beanRegistrationAotContributionMock));
				verify(registeredBeanMock).getBeanClass();
				beanRegistrationAotContribution.verify(() -> BeanRegistrationAotContribution.withCustomCodeFragments((UnaryOperator) any()));
			});
		}
	}

	//Sapient generated method id: ${11044de6-47dd-3dfc-b027-2a7bcb1bcf95}, hash: 29F84BADD9FE4F09996661CB7A9987B5
	@Disabled()
	@Test()
	void processAheadOfTimeWhenRegisteredBeanGetBeanClassNotEqualsJsonMixinModuleEntries() {
		/* Branches:
		 * (registeredBean.getBeanClass().equals(JsonMixinModuleEntries.class)) : false
		 */
		//Arrange Statement(s)
		JsonMixinModuleEntriesBeanRegistrationAotProcessor target = new JsonMixinModuleEntriesBeanRegistrationAotProcessor();
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		RegisteredBean registeredBean = RegisteredBean.of(configurableListableBeanFactoryMock, "beanName1");
		//Act Statement(s)
		BeanRegistrationAotContribution result = target.processAheadOfTime(registeredBean);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}
}
