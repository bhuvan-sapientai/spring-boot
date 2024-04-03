package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.origin.Origin;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.boot.context.properties.source.ConfigurationPropertySource;
import org.springframework.boot.context.properties.source.ConfigurationProperty;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class InvalidConfigDataPropertyExceptionSapientGeneratedTest {

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class, "getMessage_configurationPropertyName1");

	private final ConfigurationPropertyName configurationPropertyNameMock2 = mock(ConfigurationPropertyName.class);

	private final ConfigurationPropertySource configurationPropertySourceMock = mock(ConfigurationPropertySource.class);

	private final ConfigDataEnvironmentContributor contributorMock = mock(ConfigDataEnvironmentContributor.class);

	//Sapient generated method id: ${0306cbed-2ff6-3cf3-8dad-04e455d28c22}, hash: 39421C4310D0E2495DA56C48B2D66CA4
	@Test()
	void throwIfPropertyFoundWhenPropertySourceIsNull() {
		/* Branches:
		 * (propertySource != null) : false
		 */
		//Arrange Statement(s)
		doReturn(null).when(contributorMock).getConfigurationPropertySource();

		//Act Statement(s)
		InvalidConfigDataPropertyException.throwIfPropertyFound(contributorMock);

		//Assert statement(s)
		assertAll("result", () -> verify(contributorMock).getConfigurationPropertySource());
	}

	//Sapient generated method id: ${f42cb751-bc9d-3eb1-9e02-9ff06dac214b}, hash: 64ADD9E6E4DEFE85F327C423A414739C
	@Test()
	void throwIfPropertyFoundWhenPropertyGetOriginIsNotNullThrowsInvalidConfigDataPropertyException() {
		/* Branches:
		 * (propertySource != null) : true
		 * (property != null) : true  #  inside lambda$throwIfPropertyFound$0 method
		 * (location != null) : true  #  inside getMessage method
		 * (profileSpecific) : false  #  inside getMessage method
		 * (replacement != null) : true  #  inside getMessage method
		 * (property.getOrigin() != null) : true  #  inside getMessage method
		 */
		//Arrange Statement(s)
		doReturn(configurationPropertySourceMock).when(contributorMock).getConfigurationPropertySource();
		Object object = new Object();
		Origin originMock = mock(Origin.class, "getMessage_origin1");
		ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, object, originMock);
		doReturn(configurationProperty).when(configurationPropertySourceMock).getConfigurationProperty(configurationPropertyNameMock2);
		ConfigurationPropertyName configurationPropertyNameMock3 = mock(ConfigurationPropertyName.class, "getMessage_configurationPropertyName2");
		Object object2 = new Object();
		Origin originMock2 = mock(Origin.class, "getMessage_origin3");
		ConfigurationProperty configurationProperty2 = new ConfigurationProperty(configurationPropertyNameMock3, object2, originMock2);
		ConfigurationPropertyName configurationPropertyNameMock4 = mock(ConfigurationPropertyName.class);
		doReturn(configurationProperty2).when(configurationPropertySourceMock).getConfigurationProperty(configurationPropertyNameMock4);
		ConfigDataResource configDataResourceMock = mock(ConfigDataResource.class, "lambda$throwIfPropertyFound$0_configDataResource1");
		ConfigDataResource configDataResourceMock2 = mock(ConfigDataResource.class, "lambda$throwIfPropertyFound$0_configDataResource2");
		doReturn(configDataResourceMock, configDataResourceMock2).when(contributorMock).getResource();
		//Act Statement(s)
		final InvalidConfigDataPropertyException result = assertThrows(InvalidConfigDataPropertyException.class, () -> {
			InvalidConfigDataPropertyException.throwIfPropertyFound(contributorMock);
		});

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(contributorMock).getConfigurationPropertySource();
			verify(configurationPropertySourceMock).getConfigurationProperty(configurationPropertyNameMock2);
			verify(configurationPropertySourceMock).getConfigurationProperty(configurationPropertyNameMock4);
			verify(contributorMock, times(2)).getResource();
		});
	}

	//Sapient generated method id: ${74b5666c-f2ca-3d42-a923-e1fa81d6a724}, hash: A49DA175F0A000A393CCC21939A1E064
	@Test()
	void throwIfPropertyFoundWhenReplacementIsNullAndPropertyGetOriginIsNull2ThrowsInvalidConfigDataPropertyException() {
		/* Branches:
		 * (propertySource != null) : true
		 * (property != null) : true  #  inside lambda$throwIfPropertyFound$0 method
		 * (location != null) : false  #  inside getMessage method
		 * (profileSpecific) : false  #  inside getMessage method
		 * (replacement != null) : false  #  inside getMessage method
		 * (property.getOrigin() != null) : false  #  inside getMessage method
		 */
		//Arrange Statement(s)
		doReturn(configurationPropertySourceMock).when(contributorMock).getConfigurationPropertySource();
		Object object = new Object();
		ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, object, (Origin) null);
		doReturn(configurationProperty).when(configurationPropertySourceMock).getConfigurationProperty(configurationPropertyNameMock2);
		ConfigurationPropertyName configurationPropertyNameMock3 = mock(ConfigurationPropertyName.class);
		doReturn(null).when(configurationPropertySourceMock).getConfigurationProperty(configurationPropertyNameMock3);
		doReturn(null).when(contributorMock).getResource();
		//Act Statement(s)
		final InvalidConfigDataPropertyException result = assertThrows(InvalidConfigDataPropertyException.class, () -> {
			InvalidConfigDataPropertyException.throwIfPropertyFound(contributorMock);
		});

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(contributorMock).getConfigurationPropertySource();
			verify(configurationPropertySourceMock).getConfigurationProperty(configurationPropertyNameMock2);
			verify(configurationPropertySourceMock).getConfigurationProperty(configurationPropertyNameMock3);
			verify(contributorMock).getResource();
		});
	}
}
