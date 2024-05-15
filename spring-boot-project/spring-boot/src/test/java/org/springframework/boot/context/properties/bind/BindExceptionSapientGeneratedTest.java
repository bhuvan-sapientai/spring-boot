package org.springframework.boot.context.properties.bind;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.boot.origin.Origin;
import org.mockito.MockedStatic;
import org.springframework.core.ResolvableType;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.boot.context.properties.source.ConfigurationProperty;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BindExceptionSapientGeneratedTest {

    //Sapient generated method id: ${getOriginTest}, hash: F0D911EC0AA0F65A631222BEBD59240D
    @Test()
    void getOriginTest() {
        //Arrange Statement(s)
        Origin originMock = mock(Origin.class);
        ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class, "name");
        ResolvableType resolvableTypeMock = mock(ResolvableType.class, "type");
        ConfigurationProperty configurationPropertyMock = mock(ConfigurationProperty.class);
        try (MockedStatic<Origin> origin = mockStatic(Origin.class)) {
            origin.when(() -> Origin.from(configurationPropertyNameMock)).thenReturn(originMock);
            Bindable bindable = Bindable.of(resolvableTypeMock);
            Throwable throwable = new Throwable();
            BindException target = new BindException(configurationPropertyNameMock, bindable, configurationPropertyMock, throwable);
            //Act Statement(s)
            Origin result = target.getOrigin();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(originMock));
                origin.verify(() -> Origin.from(configurationPropertyNameMock), atLeast(1));
            });
        }
    }
}
