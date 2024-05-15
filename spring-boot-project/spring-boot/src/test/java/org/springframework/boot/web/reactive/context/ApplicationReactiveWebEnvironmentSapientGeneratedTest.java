package org.springframework.boot.web.reactive.context;

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
class ApplicationReactiveWebEnvironmentSapientGeneratedTest {

    //Sapient generated method id: ${doGetActiveProfilesPropertyTest}, hash: 3D23EC431A00CB0EC885103845B214E8
    @Test()
    void doGetActiveProfilesPropertyTest() {
        //Arrange Statement(s)
        ApplicationReactiveWebEnvironment target = new ApplicationReactiveWebEnvironment();
        
        //Act Statement(s)
        String result = target.doGetActiveProfilesProperty();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${doGetDefaultProfilesPropertyTest}, hash: 3981CFF8140B62A05A7B58AF41FC7566
    @Test()
    void doGetDefaultProfilesPropertyTest() {
        //Arrange Statement(s)
        ApplicationReactiveWebEnvironment target = new ApplicationReactiveWebEnvironment();
        
        //Act Statement(s)
        String result = target.doGetDefaultProfilesProperty();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${createPropertyResolverTest}, hash: 526D9BE68063BB841F17A40BF21A25CC
    @Test()
    void createPropertyResolverTest() {
        //Arrange Statement(s)
        ConfigurablePropertyResolver configurablePropertyResolverMock = mock(ConfigurablePropertyResolver.class);
        MutablePropertySources mutablePropertySourcesMock = mock(MutablePropertySources.class);
        try (MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
            configurationPropertySources.when(() -> ConfigurationPropertySources.createPropertyResolver(mutablePropertySourcesMock)).thenReturn(configurablePropertyResolverMock);
            ApplicationReactiveWebEnvironment target = new ApplicationReactiveWebEnvironment();
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
