package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.boot.origin.Origin;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.boot.context.properties.source.ConfigurationPropertySource;
import org.springframework.boot.context.properties.source.ConfigurationProperty;
import org.springframework.core.env.PropertySource;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class InactiveConfigDataAccessExceptionSapientGeneratedTest {

    private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

    private final ConfigDataEnvironmentContributor contributorMock = mock(ConfigDataEnvironmentContributor.class);

    //Sapient generated method id: ${throwIfPropertyFoundWhenSourceIsNullAndPropertyIsNull}, hash: 45968527DF1502A8998514AED8ED6F52
    @Test()
    void throwIfPropertyFoundWhenSourceIsNullAndPropertyIsNull() {
        /* Branches:
         * (source != null) : false
         * (property != null) : false
         */
         //Arrange Statement(s)
        doReturn(null).when(contributorMock).getConfigurationPropertySource();
        
        //Act Statement(s)
        InactiveConfigDataAccessException.throwIfPropertyFound(contributorMock, configurationPropertyNameMock);
        
        //Assert statement(s)
        assertAll("result", () -> verify(contributorMock).getConfigurationPropertySource());
    }

    //Sapient generated method id: ${throwIfPropertyFoundWhenOriginIsNotNullThrowsInactiveConfigDataAccessException}, hash: 7123EC4D7AA58FB4F5885168AC19839D
    @Test()
    void throwIfPropertyFoundWhenOriginIsNotNullThrowsInactiveConfigDataAccessException() {
        /* Branches:
         * (source != null) : true
         * (property != null) : true
         * (location != null) : true  #  inside getMessage method
         * (origin != null) : true  #  inside getMessage method
         */
         //Arrange Statement(s)
        ConfigurationPropertySource configurationPropertySourceMock = mock(ConfigurationPropertySource.class);
        doReturn(configurationPropertySourceMock).when(contributorMock).getConfigurationPropertySource();
        Object object = new Object();
        Origin originMock = mock(Origin.class, "origin");
        ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, object, originMock);
        ConfigurationPropertyName configurationPropertyNameMock2 = mock(ConfigurationPropertyName.class, "name");
        doReturn(configurationProperty).when(configurationPropertySourceMock).getConfigurationProperty(configurationPropertyNameMock2);
        PropertySource propertySource = PropertySource.named("A");
        doReturn(propertySource).when(contributorMock).getPropertySource();
        ConfigDataResource configDataResourceMock = mock(ConfigDataResource.class, "configDataResource");
        doReturn(configDataResourceMock).when(contributorMock).getResource();
        //Act Statement(s)
        final InactiveConfigDataAccessException result = assertThrows(InactiveConfigDataAccessException.class, () -> {
            InactiveConfigDataAccessException.throwIfPropertyFound(contributorMock, configurationPropertyNameMock2);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(contributorMock).getConfigurationPropertySource();
            verify(configurationPropertySourceMock).getConfigurationProperty(configurationPropertyNameMock2);
            verify(contributorMock).getPropertySource();
            verify(contributorMock).getResource();
        });
    }
}
