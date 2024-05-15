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

    //Sapient generated method id: ${doGetActiveProfilesPropertyTest}, hash: CF9714B03B49F4B047836F9F22A30637
    @Test()
    void doGetActiveProfilesPropertyTest() {
        //Arrange Statement(s)
        ApplicationEnvironment target = new ApplicationEnvironment();
        
        //Act Statement(s)
        String result = target.doGetActiveProfilesProperty();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${doGetDefaultProfilesPropertyTest}, hash: 6BF136AF8310BD1973E6A77A6B9D84D8
    @Test()
    void doGetDefaultProfilesPropertyTest() {
        //Arrange Statement(s)
        ApplicationEnvironment target = new ApplicationEnvironment();
        
        //Act Statement(s)
        String result = target.doGetDefaultProfilesProperty();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${createPropertyResolverTest}, hash: 20CDD245433FE6AEB01ED378E6BE89C4
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
