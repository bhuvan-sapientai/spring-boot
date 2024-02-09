package org.springframework.boot.web.servlet;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.beans.BeansException;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.aot.BeanFactoryInitializationAotContribution;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ServletComponentRegisteringPostProcessorSapientGeneratedTest {

	//Sapient generated method id: ${365acb0f-1cba-35b3-a98c-17e4a229bc7a}
	@Test()
	void postProcessBeanFactoryWhenIsRunningInEmbeddedWebServerNot() throws BeansException {
		/* Branches:
		 * (this.applicationContext instanceof WebApplicationContext webApplicationContext) : false  #  inside isRunningInEmbeddedWebServer method
		 * (isRunningInEmbeddedWebServer()) : false
		 */
		//Arrange Statement(s)
		Set<String> stringSet = new HashSet<>();
		ServletComponentRegisteringPostProcessor target = new ServletComponentRegisteringPostProcessor(stringSet);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);

		//Act Statement(s)
		target.postProcessBeanFactory(configurableListableBeanFactoryMock);
	}

	//Sapient generated method id: ${31ee2554-5fbf-3375-9af8-fe1eaab8e171}
	@Test()
	void getPackagesToScanTest() {
		//Arrange Statement(s)
		Set<String> stringSet = new HashSet<>();
		ServletComponentRegisteringPostProcessor target = new ServletComponentRegisteringPostProcessor(stringSet);

		//Act Statement(s)
		Set<String> result = target.getPackagesToScan();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result.size(), equalTo(0)));
	}

	//Sapient generated method id: ${3ecf73a6-caf1-358c-b007-99aaed56dea8}
	@Test()
	void processAheadOfTimeTest() {
		//Arrange Statement(s)
		Set<String> stringSet = new HashSet<>();
		stringSet.add("packagesToScan");
		ServletComponentRegisteringPostProcessor target = new ServletComponentRegisteringPostProcessor(stringSet);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class, "beanFactory");

		//Act Statement(s)
		BeanFactoryInitializationAotContribution result = target.processAheadOfTime(configurableListableBeanFactoryMock);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
