package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.mockito.stubbing.Answer;
import org.springframework.boot.origin.Origin;
import org.springframework.util.Assert;
import org.mockito.MockedStatic;
import java.util.ArrayList;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.doThrow;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertySourcesPropertySourceSapientGeneratedTest {

    private final ConfigurationProperty configurationPropertyMock = mock(ConfigurationProperty.class);

    private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

    private final ConfigurationPropertySource configurationPropertySourceMock = mock(ConfigurationPropertySource.class);

    private final Origin originMock = mock(Origin.class);

    //Sapient generated method id: ${containsPropertyWhenFindConfigurationPropertyNameIsNotNull}, hash: 74063B0B7F0F904438F3D0994782CEF3
    @Test()
    void containsPropertyWhenFindConfigurationPropertyNameIsNotNull() throws Exception {
        /* Branches:
         * (findConfigurationProperty(name) != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull((Iterable) any(), eq("Property source must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1", true)).thenReturn(configurationPropertyNameMock);
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>();
            ConfigurationPropertySourcesPropertySource target = spy(new ConfigurationPropertySourcesPropertySource("A", iterable));
            doReturn(configurationPropertyMock).when(target).findConfigurationProperty(configurationPropertyNameMock);
            //Act Statement(s)
            boolean result = target.containsProperty("name1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                _assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
                _assert.verify(() -> Assert.notNull((Iterable) any(), eq("Property source must not be null")));
                configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1", true), atLeast(1));
                verify(target).findConfigurationProperty(configurationPropertyNameMock);
            });
        }
    }

    //Sapient generated method id: ${containsPropertyWhenFindConfigurationPropertyNameIsNull}, hash: 6700E69534262E9D22E84EE4451CBB2E
    @Test()
    void containsPropertyWhenFindConfigurationPropertyNameIsNull() throws Exception {
        /* Branches:
         * (findConfigurationProperty(name) != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull((Iterable) any(), eq("Property source must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1", true)).thenReturn(configurationPropertyNameMock);
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>();
            ConfigurationPropertySourcesPropertySource target = spy(new ConfigurationPropertySourcesPropertySource("A", iterable));
            doReturn(null).when(target).findConfigurationProperty(configurationPropertyNameMock);
            //Act Statement(s)
            boolean result = target.containsProperty("name1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                _assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
                _assert.verify(() -> Assert.notNull((Iterable) any(), eq("Property source must not be null")));
                configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1", true), atLeast(1));
                verify(target).findConfigurationProperty(configurationPropertyNameMock);
            });
        }
    }

    //Sapient generated method id: ${containsPropertyWhenCaughtExceptionAndFindConfigurationPropertyNameIsNull}, hash: 664F2A9253155B20400C154351BD77CB
    @Test()
    void containsPropertyWhenCaughtExceptionAndFindConfigurationPropertyNameIsNull() throws Exception {
        /* Branches:
         * (catch-exception (Exception)) : true  #  inside findConfigurationProperty method
         * (findConfigurationProperty(name) != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull((Iterable) any(), eq("Property source must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1", true)).thenReturn(configurationPropertyNameMock);
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>();
            ConfigurationPropertySourcesPropertySource target = spy(new ConfigurationPropertySourcesPropertySource("A", iterable));
            RuntimeException runtimeException = new RuntimeException();
            doThrow(runtimeException).when(target).findConfigurationProperty(configurationPropertyNameMock);
            //Act Statement(s)
            boolean result = target.containsProperty("name1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                _assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
                _assert.verify(() -> Assert.notNull((Iterable) any(), eq("Property source must not be null")));
                configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1", true), atLeast(1));
                verify(target).findConfigurationProperty(configurationPropertyNameMock);
            });
        }
    }

    //Sapient generated method id: ${getPropertyWhenConfigurationPropertyIsNotNull}, hash: 87F9A5BEA6ACEE01F8275864C4E6F484
    @Test()
    void getPropertyWhenConfigurationPropertyIsNotNull() throws Exception {
        /* Branches:
         * (configurationProperty != null) : true
         */
        //Arrange Statement(s)
        ConfigurationPropertyName configurationPropertyName2Mock = mock(ConfigurationPropertyName.class);
        try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull((Iterable) any(), eq("Property source must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1", true)).thenReturn(configurationPropertyNameMock);
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>();
            ConfigurationPropertySourcesPropertySource target = spy(new ConfigurationPropertySourcesPropertySource("A", iterable));
            Object object = new Object();
            ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyName2Mock, object, originMock);
            doReturn(configurationProperty).when(target).findConfigurationProperty(configurationPropertyNameMock);
            //Act Statement(s)
            Object result = target.getProperty("name1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                _assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
                _assert.verify(() -> Assert.notNull((Iterable) any(), eq("Property source must not be null")));
                configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1", true), atLeast(1));
                verify(target).findConfigurationProperty(configurationPropertyNameMock);
            });
        }
    }

    //Sapient generated method id: ${getPropertyWhenConfigurationPropertyIsNull}, hash: 6BDB363709D4F231E125EBDA7B3AB37B
    @Test()
    void getPropertyWhenConfigurationPropertyIsNull() throws Exception {
        /* Branches:
         * (configurationProperty != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull((Iterable) any(), eq("Property source must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1", true)).thenReturn(configurationPropertyNameMock);
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>();
            ConfigurationPropertySourcesPropertySource target = spy(new ConfigurationPropertySourcesPropertySource("A", iterable));
            doReturn(null).when(target).findConfigurationProperty(configurationPropertyNameMock);
            //Act Statement(s)
            Object result = target.getProperty("name1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                _assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
                _assert.verify(() -> Assert.notNull((Iterable) any(), eq("Property source must not be null")));
                configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1", true), atLeast(1));
                verify(target).findConfigurationProperty(configurationPropertyNameMock);
            });
        }
    }

    //Sapient generated method id: ${getPropertyWhenCaughtExceptionAndConfigurationPropertyIsNull}, hash: 966BC7A4B4DB7E2248D05B9A853033DB
    @Test()
    void getPropertyWhenCaughtExceptionAndConfigurationPropertyIsNull() throws Exception {
        /* Branches:
         * (catch-exception (Exception)) : true  #  inside findConfigurationProperty method
         * (configurationProperty != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull((Iterable) any(), eq("Property source must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1", true)).thenReturn(configurationPropertyNameMock);
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>();
            ConfigurationPropertySourcesPropertySource target = spy(new ConfigurationPropertySourcesPropertySource("A", iterable));
            RuntimeException runtimeException = new RuntimeException();
            doThrow(runtimeException).when(target).findConfigurationProperty(configurationPropertyNameMock);
            //Act Statement(s)
            Object result = target.getProperty("name1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                _assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
                _assert.verify(() -> Assert.notNull((Iterable) any(), eq("Property source must not be null")));
                configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1", true), atLeast(1));
                verify(target).findConfigurationProperty(configurationPropertyNameMock);
            });
        }
    }

    //Sapient generated method id: ${getOriginTest}, hash: 9B5A6859F0B890FBD27359B717C09B46
    @Test()
    void getOriginTest() throws Exception {
        //Arrange Statement(s)
        try (MockedStatic<Origin> origin = mockStatic(Origin.class);
            MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull((Iterable) any(), eq("Property source must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1", true)).thenReturn(configurationPropertyNameMock);
            origin.when(() -> Origin.from(configurationPropertyMock)).thenReturn(originMock);
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>();
            ConfigurationPropertySourcesPropertySource target = spy(new ConfigurationPropertySourcesPropertySource("A", iterable));
            doReturn(configurationPropertyMock).when(target).findConfigurationProperty(configurationPropertyNameMock);
            //Act Statement(s)
            Origin result = target.getOrigin("name1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(originMock));
                _assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
                _assert.verify(() -> Assert.notNull((Iterable) any(), eq("Property source must not be null")));
                configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1", true), atLeast(1));
                origin.verify(() -> Origin.from(configurationPropertyMock), atLeast(1));
                verify(target).findConfigurationProperty(configurationPropertyNameMock);
            });
        }
    }

    //Sapient generated method id: ${getOriginWhenCaughtException}, hash: 2803AA5F5E409600DC8EC7C88AA6A014
    @Test()
    void getOriginWhenCaughtException() throws Exception {
        /* Branches:
         * (catch-exception (Exception)) : true  #  inside findConfigurationProperty method
         */
        //Arrange Statement(s)
        try (MockedStatic<Origin> origin = mockStatic(Origin.class);
            MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull((Iterable) any(), eq("Property source must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1", true)).thenReturn(configurationPropertyNameMock);
            origin.when(() -> Origin.from((ConfigurationProperty) null)).thenReturn(originMock);
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>();
            ConfigurationPropertySourcesPropertySource target = spy(new ConfigurationPropertySourcesPropertySource("A", iterable));
            RuntimeException runtimeException = new RuntimeException();
            doThrow(runtimeException).when(target).findConfigurationProperty(configurationPropertyNameMock);
            //Act Statement(s)
            Origin result = target.getOrigin("name1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(originMock));
                _assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
                _assert.verify(() -> Assert.notNull((Iterable) any(), eq("Property source must not be null")));
                configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1", true), atLeast(1));
                origin.verify(() -> Origin.from((ConfigurationProperty) null), atLeast(1));
                verify(target).findConfigurationProperty(configurationPropertyNameMock);
            });
        }
    }

    //Sapient generated method id: ${findConfigurationProperty1WhenNameIsNull}, hash: 1DCB84D8487A1085E91CDC2D05EB7C25
    @Test()
    void findConfigurationProperty1WhenNameIsNull() {
        /* Branches:
         * (name == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull((Iterable) any(), eq("Property source must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>();
            ConfigurationPropertySourcesPropertySource target = new ConfigurationPropertySourcesPropertySource("A", iterable);
            ConfigurationPropertyName configurationPropertyName = null;
            //Act Statement(s)
            ConfigurationProperty result = target.findConfigurationProperty(configurationPropertyName);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                _assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
                _assert.verify(() -> Assert.notNull((Iterable) any(), eq("Property source must not be null")));
            });
        }
    }

    //Sapient generated method id: ${findConfigurationProperty1WhenConfigurationPropertyIsNotNull}, hash: 5C36B5254F7C4959749B1FD8813F6B79
    @Test()
    void findConfigurationProperty1WhenConfigurationPropertyIsNotNull() {
        /* Branches:
         * (name == null) : false
         * (for-each(getSource())) : true
         * (configurationProperty != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(configurationPropertyMock).when(configurationPropertySourceMock).getConfigurationProperty(configurationPropertyNameMock);
            _assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull((Iterable) any(), eq("Property source must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
            ConfigurationPropertySourcesPropertySource target = new ConfigurationPropertySourcesPropertySource("A", iterable);
            //Act Statement(s)
            ConfigurationProperty result = target.findConfigurationProperty(configurationPropertyNameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(configurationPropertyMock));
                verify(configurationPropertySourceMock).getConfigurationProperty(configurationPropertyNameMock);
                _assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
                _assert.verify(() -> Assert.notNull((Iterable) any(), eq("Property source must not be null")));
            });
        }
    }

    //Sapient generated method id: ${findConfigurationProperty1WhenConfigurationPropertyIsNull}, hash: 73608687371C2C4FD9F4BA0A7B31B6A5
    @Test()
    void findConfigurationProperty1WhenConfigurationPropertyIsNull() {
        /* Branches:
         * (name == null) : false
         * (for-each(getSource())) : true
         * (configurationProperty != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(null).when(configurationPropertySourceMock).getConfigurationProperty(configurationPropertyNameMock);
            _assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull((Iterable) any(), eq("Property source must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
            ConfigurationPropertySourcesPropertySource target = new ConfigurationPropertySourcesPropertySource("A", iterable);
            //Act Statement(s)
            ConfigurationProperty result = target.findConfigurationProperty(configurationPropertyNameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                verify(configurationPropertySourceMock).getConfigurationProperty(configurationPropertyNameMock);
                _assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
                _assert.verify(() -> Assert.notNull((Iterable) any(), eq("Property source must not be null")));
            });
        }
    }
}
