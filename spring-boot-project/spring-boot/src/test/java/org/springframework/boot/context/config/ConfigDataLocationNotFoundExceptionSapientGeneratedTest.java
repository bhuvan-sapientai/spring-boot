package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.springframework.boot.origin.Origin;
import org.mockito.MockedStatic;
import org.springframework.util.Assert;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigDataLocationNotFoundExceptionSapientGeneratedTest {

    //Sapient generated method id: ${getOriginTest}, hash: EAB133EB8FB068685DFFD8D66AE1BF56
    @Test()
    void getOriginTest() {
        //Arrange Statement(s)
        ConfigDataLocation configDataLocationMock = mock(ConfigDataLocation.class);
        Origin originMock = mock(Origin.class);
        try (MockedStatic<Origin> origin = mockStatic(Origin.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(configDataLocationMock, "Location must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            origin.when(() -> Origin.from(configDataLocationMock)).thenReturn(originMock);
            Throwable throwable = new Throwable();
            ConfigDataLocationNotFoundException target = new ConfigDataLocationNotFoundException(configDataLocationMock, "message1", throwable);
            //Act Statement(s)
            Origin result = target.getOrigin();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(originMock));
                _assert.verify(() -> Assert.notNull(configDataLocationMock, "Location must not be null"), atLeast(1));
                origin.verify(() -> Origin.from(configDataLocationMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getReferenceDescriptionTest}, hash: 836540EB379F8EFA7165AACD1F2B8CA4
    @Disabled()
    @Test()
    void getReferenceDescriptionTest() {
        //Arrange Statement(s)
        ConfigDataLocation configDataLocationMock = mock(ConfigDataLocation.class, "location");
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(configDataLocationMock, "Location must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Throwable throwable = new Throwable();
            ConfigDataLocationNotFoundException target = new ConfigDataLocationNotFoundException(configDataLocationMock, "message1", throwable);
            //Act Statement(s)
            String result = target.getReferenceDescription();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                _assert.verify(() -> Assert.notNull(configDataLocationMock, "Location must not be null"), atLeast(1));
            });
        }
    }
}
