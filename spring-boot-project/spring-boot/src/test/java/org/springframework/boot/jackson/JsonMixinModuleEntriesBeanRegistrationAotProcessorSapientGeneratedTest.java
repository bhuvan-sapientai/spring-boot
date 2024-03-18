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
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JsonMixinModuleEntriesBeanRegistrationAotProcessorSapientGeneratedTest {

	private final ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);

	//Sapient generated method id: ${bebb1a69-ea64-3a97-9525-239e1e6a6003}, hash: 5345E00C8FE88F3CC8EC372AC2DB8A0A
	@Disabled()
	@Test()
	void processAheadOfTimeWhenRegisteredBeanGetBeanClassEqualsJsonMixinModuleEntries() {
		/* Branches:
		 * (registeredBean.getBeanClass().equals(JsonMixinModuleEntries.class)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: registeredBean
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		BeanRegistrationAotContribution beanRegistrationAotContributionMock = mock(BeanRegistrationAotContribution.class);
		try (MockedStatic<BeanRegistrationAotContribution> beanRegistrationAotContribution = mockStatic(BeanRegistrationAotContribution.class)) {
			beanRegistrationAotContribution.when(() -> BeanRegistrationAotContribution.withCustomCodeFragments((UnaryOperator) any())).thenReturn(beanRegistrationAotContributionMock);
			JsonMixinModuleEntriesBeanRegistrationAotProcessor target = new JsonMixinModuleEntriesBeanRegistrationAotProcessor();
			RegisteredBean registeredBean = RegisteredBean.of(configurableListableBeanFactoryMock, "beanName1");
			//Act Statement(s)
			BeanRegistrationAotContribution result = target.processAheadOfTime(registeredBean);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(beanRegistrationAotContributionMock));
				beanRegistrationAotContribution.verify(() -> BeanRegistrationAotContribution.withCustomCodeFragments((UnaryOperator) any()));
			});
		}
	}

	//Sapient generated method id: ${11044de6-47dd-3dfc-b027-2a7bcb1bcf95}, hash: 992D3201140BC8F4EE11CF119D760C5D
	@Disabled()
	@Test()
	void processAheadOfTimeWhenRegisteredBeanGetBeanClassNotEqualsJsonMixinModuleEntries() {
		/* Branches:
		 * (registeredBean.getBeanClass().equals(JsonMixinModuleEntries.class)) : false
		 */
		//Arrange Statement(s)
		JsonMixinModuleEntriesBeanRegistrationAotProcessor target = new JsonMixinModuleEntriesBeanRegistrationAotProcessor();
		RegisteredBean registeredBean = RegisteredBean.of(configurableListableBeanFactoryMock, "beanName1");
		//Act Statement(s)
		BeanRegistrationAotContribution result = target.processAheadOfTime(registeredBean);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}
}
