package org.springframework.boot.env;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;
import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SystemEnvironmentPropertySourceEnvironmentPostProcessorSapientGeneratedTest {

	//Sapient generated method id: ${c38a95fc-a6cb-397a-a3de-fea67cb0dbba}, hash: 65C0609F1B06922040D17249BFE2701A
	@Test()
	void postProcessEnvironmentWhenPropertySourceIsNotNull() {
		/* Branches:
		 * (propertySource != null) : true
		 */
		//Arrange Statement(s)
		ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class);
		MutablePropertySources mutablePropertySourcesMock = mock(MutablePropertySources.class);
		PropertySource propertySourceMock = mock(PropertySource.class);
		doReturn(propertySourceMock).when(mutablePropertySourcesMock).get("systemEnvironment");
		Map map = new HashMap<>();
		doReturn(map).when(propertySourceMock).getSource();
		MutablePropertySources mutablePropertySourcesMock2 = mock(MutablePropertySources.class);
		doReturn(mutablePropertySourcesMock, mutablePropertySourcesMock2).when(environmentMock).getPropertySources();
		doNothing().when(mutablePropertySourcesMock2).replace(eq("systemEnvironment"), (PropertySource) any());
		SystemEnvironmentPropertySourceEnvironmentPostProcessor target = new SystemEnvironmentPropertySourceEnvironmentPostProcessor();
		Class[] classArray = new Class[] {};
		SpringApplication springApplication = new SpringApplication(classArray);
		springApplication.setEnvironmentPrefix("environmentPrefix1");

		//Act Statement(s)
		target.postProcessEnvironment(environmentMock, springApplication);

		//Assert statement(s)
		assertAll("result", () -> {
			verify(environmentMock, times(2)).getPropertySources();
			verify(mutablePropertySourcesMock).get("systemEnvironment");
			verify(propertySourceMock).getSource();
			verify(mutablePropertySourcesMock2).replace(eq("systemEnvironment"), (PropertySource) any());
		});
	}
}
