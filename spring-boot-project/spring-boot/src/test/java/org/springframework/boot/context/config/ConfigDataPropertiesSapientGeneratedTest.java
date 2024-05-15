package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import java.util.ArrayList;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Disabled;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigDataPropertiesSapientGeneratedTest {

    private final ConfigDataProperties.Activate activateMock = mock(ConfigDataProperties.Activate.class, "activate");

    private final ConfigDataActivationContext configDataActivationContextMock = mock(ConfigDataActivationContext.class);

    //Sapient generated method id: ${isActiveWhenThisActivateIsActiveActivationContext}, hash: 52D6F8385125C8A3EF8DEF5AA356F394
    @Test()
    void isActiveWhenThisActivateIsActiveActivationContext() {
        /* Branches:
         * (this.activate == null) : false
         * (this.activate.isActive(activationContext)) : true
         */
         //Arrange Statement(s)
        List<ConfigDataLocation> configDataLocationList = new ArrayList<>();
        ConfigDataProperties target = new ConfigDataProperties(configDataLocationList, activateMock);
        doReturn(true).when(activateMock).isActive(configDataActivationContextMock);
        
        //Act Statement(s)
        boolean result = target.isActive(configDataActivationContextMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(activateMock).isActive(configDataActivationContextMock);
        });
    }

    //Sapient generated method id: ${isActiveWhenThisActivateNotIsActiveActivationContext}, hash: 828BD9BF88B881749577E23D5589FE0D
    @Test()
    void isActiveWhenThisActivateNotIsActiveActivationContext() {
        /* Branches:
         * (this.activate == null) : false
         * (this.activate.isActive(activationContext)) : false
         */
         //Arrange Statement(s)
        List<ConfigDataLocation> configDataLocationList = new ArrayList<>();
        ConfigDataProperties target = new ConfigDataProperties(configDataLocationList, activateMock);
        doReturn(false).when(activateMock).isActive(configDataActivationContextMock);
        
        //Act Statement(s)
        boolean result = target.isActive(configDataActivationContextMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(activateMock).isActive(configDataActivationContextMock);
        });
    }

    //Sapient generated method id: ${withoutImportsWhenDefaultBranch}, hash: 55EBE83AE760D203F0C02541CC3302CB
    @Test()
    void withoutImportsWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 53)) : false  #  inside <init> method
         */
         //Arrange Statement(s)
        List<ConfigDataLocation> configDataLocationList = new ArrayList<>();
        ConfigDataProperties target = new ConfigDataProperties(configDataLocationList, activateMock);
        
        //Act Statement(s)
        ConfigDataProperties result = target.withoutImports();
        
        //Assert statement(s)
        //TODO: Please implement equals method in ConfigDataProperties for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getTest}, hash: 336B3B93E1BA20843A8CB8C173799426
    @Test()
    void getTest() {
        //Arrange Statement(s)
        Binder binderMock = mock(Binder.class);
        BindResult bindResultMock = mock(BindResult.class);
        doReturn(bindResultMock).when(binderMock).bind((ConfigurationPropertyName) any(), (Bindable) any(), (ConfigDataLocationBindHandler) any());
        ConfigDataProperties configDataPropertiesMock = mock(ConfigDataProperties.class);
        doReturn(configDataPropertiesMock).when(bindResultMock).orElse(null);
        
        //Act Statement(s)
        ConfigDataProperties result = ConfigDataProperties.get(binderMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(configDataPropertiesMock));
            verify(binderMock).bind((ConfigurationPropertyName) any(), (Bindable) any(), (ConfigDataLocationBindHandler) any());
            verify(bindResultMock, atLeast(1)).orElse(null);
        });
    }
}
