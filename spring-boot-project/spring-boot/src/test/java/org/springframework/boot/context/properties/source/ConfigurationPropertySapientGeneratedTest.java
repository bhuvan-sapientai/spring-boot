package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.springframework.boot.origin.Origin;
import org.mockito.MockedStatic;
import org.springframework.boot.origin.OriginTrackedValue;
import org.springframework.util.Assert;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertySapientGeneratedTest {

    private final ConfigurationPropertyName nameMock = mock(ConfigurationPropertyName.class, "name");

    private final ConfigurationPropertySource configurationPropertySourceMock = mock(ConfigurationPropertySource.class);

    private final Origin originMock = mock(Origin.class);

    //Sapient generated method id: ${toStringTest}, hash: 364154EEAABE8D86C73E0469D096C141
    @Disabled()
    @Test()
    void toStringTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type ToStringCreator - Method: append
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            _assert.when(() -> Assert.notNull(object, "Value must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationProperty target = new ConfigurationProperty(nameMock, object, originMock);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                _assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(object, "Value must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${compareToTest}, hash: 36E47E2E6209E0DAC0371FE3E996294B
    @Test()
    void compareToTest() {
        //Arrange Statement(s)
        ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);
        Origin originMock2 = mock(Origin.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            _assert.when(() -> Assert.notNull(object, "Value must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationProperty target = new ConfigurationProperty(nameMock, object, originMock);
            doReturn(0).when(nameMock).compareTo(configurationPropertyNameMock);
            Object object2 = new Object();
            ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, object2, originMock2);
            //Act Statement(s)
            int result = target.compareTo(configurationProperty);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                _assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(object, "Value must not be null"), atLeast(1));
                verify(nameMock).compareTo(configurationPropertyNameMock);
            });
        }
    }

    //Sapient generated method id: ${ofWhenValueIsNull}, hash: CF28FAE8C53934C03803A478027C4511
    @Test()
    void ofWhenValueIsNull() {
        /* Branches:
         * (value == null) : true
         */
        //Arrange Statement(s)
        OriginTrackedValue originTrackedValue = null;
        //Act Statement(s)
        ConfigurationProperty result = ConfigurationProperty.of(nameMock, originTrackedValue);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${ofWhenValueIsNotNull}, hash: 29DD908A78E7AB13C9784B479F6A49B2
    @Test()
    void ofWhenValueIsNotNull() {
        /* Branches:
         * (value == null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            _assert.when(() -> Assert.notNull(object, "Value must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            OriginTrackedValue originTrackedValue = OriginTrackedValue.of(object, originMock);
            //Act Statement(s)
            ConfigurationProperty result = ConfigurationProperty.of(nameMock, originTrackedValue);
            ConfigurationProperty configurationProperty = new ConfigurationProperty(nameMock, object, originMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(configurationProperty));
                _assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(object, "Value must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${of1WhenValueIsNull}, hash: 7627BB50D457DDFE938120840663FDCA
    @Test()
    void of1WhenValueIsNull() {
        /* Branches:
         * (value == null) : true
         */
        //Arrange Statement(s)
        Object object = null;
        //Act Statement(s)
        ConfigurationProperty result = ConfigurationProperty.of(configurationPropertySourceMock, nameMock, object, originMock);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${of1WhenValueIsNotNull}, hash: A2CEEE8158EF6AB841F9993F34D38F19
    @Test()
    void of1WhenValueIsNotNull() {
        /* Branches:
         * (value == null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            _assert.when(() -> Assert.notNull(object, "Value must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ConfigurationProperty result = ConfigurationProperty.of(configurationPropertySourceMock, nameMock, object, originMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(object, "Value must not be null"), atLeast(1));
            });
        }
    }
}
