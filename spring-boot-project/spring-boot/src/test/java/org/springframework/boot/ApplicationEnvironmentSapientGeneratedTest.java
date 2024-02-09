package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.env.ConfigurablePropertyResolver;
import org.springframework.boot.context.properties.source.ConfigurationPropertySources;

import org.mockito.MockedStatic;

import org.springframework.core.env.MutablePropertySources;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ApplicationEnvironmentSapientGeneratedTest {

	//Sapient generated method id: ${de774194-de49-370c-8c3d-0b1e904baef9}
	@Test()
	void doGetActiveProfilesPropertyTest() {
		//Arrange Statement(s)
		ApplicationEnvironment target = new ApplicationEnvironment();

		//Act Statement(s)
		String result = target.doGetActiveProfilesProperty();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${8851a08f-f7e0-376c-a9da-76a0fc519c42}
	@Test()
	void doGetDefaultProfilesPropertyTest() {
		//Arrange Statement(s)
		ApplicationEnvironment target = new ApplicationEnvironment();

		//Act Statement(s)
		String result = target.doGetDefaultProfilesProperty();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${cd721531-c35e-340b-93ef-a0cc3cccaba6}
	@Test()
	void createPropertyResolverTest() {
		//Arrange Statement(s)
		ConfigurablePropertyResolver configurablePropertyResolverMock = mock(ConfigurablePropertyResolver.class);
		MutablePropertySources mutablePropertySourcesMock = mock(MutablePropertySources.class);
		try (MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.createPropertyResolver(mutablePropertySourcesMock)).thenReturn(configurablePropertyResolverMock);
			ApplicationEnvironment target = new ApplicationEnvironment();
			//Act Statement(s)
			ConfigurablePropertyResolver result = target.createPropertyResolver(mutablePropertySourcesMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurablePropertyResolverMock));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.createPropertyResolver(mutablePropertySourcesMock), atLeast(1));
			});
		}
	}
}
