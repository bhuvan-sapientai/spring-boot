package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.mockito.stubbing.Answer;
import org.springframework.boot.origin.Origin;
import org.springframework.core.env.PropertySource;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.util.Assert;
import java.util.Map;
import java.util.HashMap;
import org.springframework.boot.origin.PropertySourceOrigin;
import org.mockito.MockedStatic;
import java.util.ArrayList;
import java.util.Random;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.doThrow;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringConfigurationPropertySourceSapientGeneratedTest {

    private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

    private final PropertyMapper mapperMock = mock(PropertyMapper.class);

    private final ConfigurationPropertyName nameMock = mock(ConfigurationPropertyName.class);

    private final Origin originMock = mock(Origin.class);

    private final PropertyMapper propertyMapperMock = mock(PropertyMapper.class);

    private final PropertySource<?> propertySourceMock = mock(PropertySource.class);

    private final PropertySource<?> sourceMock = mock(PropertySource.class);

    //Sapient generated method id: ${getConfigurationPropertyWhenNameIsNull}, hash: C24C482D2E40073AB1B6B89CCECC7730
    @Test()
    void getConfigurationPropertyWhenNameIsNull() throws Exception {
        /* Branches:
         * (name == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            _assert.when(() -> Assert.notNull(propertySourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
            SpringConfigurationPropertySource target = new SpringConfigurationPropertySource(propertySourceMock, propertyMapperArray);
            ConfigurationPropertyName configurationPropertyName = null;
            //Act Statement(s)
            ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyName);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                _assert.verify(() -> Assert.notNull(propertySourceMock, "PropertySource must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getConfigurationPropertyWhenValueIsNotNull}, hash: 74F3A0CD4F6D4CC3917BE22026B182B7
    @Test()
    void getConfigurationPropertyWhenValueIsNotNull() throws Exception {
        /* Branches:
         * (name == null) : false
         * (for-each(this.mappers)) : true
         * (for-each(mapper.map(name))) : true
         * (value != null) : true
         */
        //Arrange Statement(s)
        ConfigurationProperty configurationPropertyMock = mock(ConfigurationProperty.class);
        try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
            MockedStatic<PropertySourceOrigin> propertySourceOrigin = mockStatic(PropertySourceOrigin.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            doReturn(object).when(propertySourceMock).getProperty("return_of_mapItem1");
            List<String> stringList = new ArrayList<>();
            stringList.add("return_of_mapItem1");
            doReturn(stringList).when(mapperMock).map(configurationPropertyNameMock);
            _assert.when(() -> Assert.notNull(propertySourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            propertySourceOrigin.when(() -> PropertySourceOrigin.get(propertySourceMock, "return_of_mapItem1")).thenReturn(originMock);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { mapperMock };
            SpringConfigurationPropertySource target = new SpringConfigurationPropertySource(propertySourceMock, propertyMapperArray);
            configurationProperty.when(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock)).thenReturn(configurationPropertyMock);
            //Act Statement(s)
            ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(configurationPropertyMock));
                verify(propertySourceMock, atLeast(1)).getProperty("return_of_mapItem1");
                verify(mapperMock, atLeast(1)).map(configurationPropertyNameMock);
                _assert.verify(() -> Assert.notNull(propertySourceMock, "PropertySource must not be null"), atLeast(1));
                propertySourceOrigin.verify(() -> PropertySourceOrigin.get(propertySourceMock, "return_of_mapItem1"), atLeast(1));
                configurationProperty.verify(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getConfigurationPropertyWhenValueIsNull}, hash: DC74B61D0012E7F07CFE4F3F2C12D214
    @Test()
    void getConfigurationPropertyWhenValueIsNull() throws Exception {
        /* Branches:
         * (name == null) : false
         * (for-each(this.mappers)) : true
         * (for-each(mapper.map(name))) : true
         * (value != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            doReturn(null).when(propertySourceMock).getProperty("return_of_mapItem1");
            List<String> stringList = new ArrayList<>();
            stringList.add("return_of_mapItem1");
            doReturn(stringList).when(mapperMock).map(configurationPropertyNameMock);
            _assert.when(() -> Assert.notNull(propertySourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { mapperMock };
            SpringConfigurationPropertySource target = new SpringConfigurationPropertySource(propertySourceMock, propertyMapperArray);
            //Act Statement(s)
            ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                verify(propertySourceMock, atLeast(1)).getProperty("return_of_mapItem1");
                verify(mapperMock, atLeast(1)).map(configurationPropertyNameMock);
                _assert.verify(() -> Assert.notNull(propertySourceMock, "PropertySource must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getConfigurationPropertyWhenValueIsNotNullAndCaughtException}, hash: ED2CBA039566866571CEE73590ECE123
    @Test()
    void getConfigurationPropertyWhenValueIsNotNullAndCaughtException() throws Exception {
        /* Branches:
         * (name == null) : false
         * (for-each(this.mappers)) : true
         * (for-each(mapper.map(name))) : true
         * (value != null) : true
         * (catch-exception (Exception)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
            MockedStatic<PropertySourceOrigin> propertySourceOrigin = mockStatic(PropertySourceOrigin.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            doReturn(object).when(propertySourceMock).getProperty("return_of_mapItem1");
            List<String> stringList = new ArrayList<>();
            stringList.add("return_of_mapItem1");
            doReturn(stringList).when(mapperMock).map(configurationPropertyNameMock);
            _assert.when(() -> Assert.notNull(propertySourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            propertySourceOrigin.when(() -> PropertySourceOrigin.get(propertySourceMock, "return_of_mapItem1")).thenReturn(originMock);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { mapperMock };
            SpringConfigurationPropertySource target = new SpringConfigurationPropertySource(propertySourceMock, propertyMapperArray);
            RuntimeException runtimeException = new RuntimeException();
            configurationProperty.when(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock)).thenThrow(runtimeException);
            //Act Statement(s)
            ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                verify(propertySourceMock, atLeast(1)).getProperty("return_of_mapItem1");
                verify(mapperMock, atLeast(1)).map(configurationPropertyNameMock);
                _assert.verify(() -> Assert.notNull(propertySourceMock, "PropertySource must not be null"), atLeast(1));
                propertySourceOrigin.verify(() -> PropertySourceOrigin.get(propertySourceMock, "return_of_mapItem1"), atLeast(1));
                configurationProperty.verify(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${containsDescendantOfWhenNameGetElement0FormDASHEDEqualsPrefix}, hash: 5A0150C113EB52689AA7CDB4C3AB3115
    @Test()
    void containsDescendantOfWhenNameGetElement0FormDASHEDEqualsPrefix() {
        /* Branches:
         * (underlyingSource instanceof Random) : true
         * (name.getNumberOfElements() > 1) : true  #  inside containsDescendantOfForRandom method
         * (name.getElement(0, Form.DASHED).equals(prefix)) : true  #  inside containsDescendantOfForRandom method
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            doReturn(2).when(nameMock).getNumberOfElements();
            doReturn("random").when(nameMock).getElement(0, ConfigurationPropertyName.Form.DASHED);
            Random random = new Random();
            doReturn(random).when(sourceMock).getSource();
            _assert.when(() -> Assert.notNull(sourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
            SpringConfigurationPropertySource target = new SpringConfigurationPropertySource(sourceMock, propertyMapperArray);
            //Act Statement(s)
            ConfigurationPropertyState result = target.containsDescendantOf(nameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(ConfigurationPropertyState.PRESENT));
                verify(nameMock, atLeast(1)).getNumberOfElements();
                verify(nameMock, atLeast(1)).getElement(0, ConfigurationPropertyName.Form.DASHED);
                verify(sourceMock, atLeast(1)).getSource();
                _assert.verify(() -> Assert.notNull(sourceMock, "PropertySource must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${containsDescendantOfWhenNameGetElement0FormDASHEDNotEqualsPrefix}, hash: D84D3C864A37E920E3B8D08A7D17E40B
    @Test()
    void containsDescendantOfWhenNameGetElement0FormDASHEDNotEqualsPrefix() {
        /* Branches:
         * (underlyingSource instanceof Random) : true
         * (name.getNumberOfElements() > 1) : true  #  inside containsDescendantOfForRandom method
         * (name.getElement(0, Form.DASHED).equals(prefix)) : false  #  inside containsDescendantOfForRandom method
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            doReturn(2).when(nameMock).getNumberOfElements();
            doReturn("A").when(nameMock).getElement(0, ConfigurationPropertyName.Form.DASHED);
            Random random = new Random();
            doReturn(random).when(sourceMock).getSource();
            _assert.when(() -> Assert.notNull(sourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
            SpringConfigurationPropertySource target = new SpringConfigurationPropertySource(sourceMock, propertyMapperArray);
            //Act Statement(s)
            ConfigurationPropertyState result = target.containsDescendantOf(nameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(ConfigurationPropertyState.ABSENT));
                verify(nameMock, atLeast(1)).getNumberOfElements();
                verify(nameMock, atLeast(1)).getElement(0, ConfigurationPropertyName.Form.DASHED);
                verify(sourceMock, atLeast(1)).getSource();
                _assert.verify(() -> Assert.notNull(sourceMock, "PropertySource must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${containsDescendantOfWhenUnderlyingPropertySourceGetSourceNotInstanceOfRandom}, hash: 6881BD0E601B297A022F89B391833326
    @Test()
    void containsDescendantOfWhenUnderlyingPropertySourceGetSourceNotInstanceOfRandom() {
        /* Branches:
         * (underlyingSource instanceof Random) : false
         * (underlyingSource instanceof PropertySource<?> underlyingPropertySource) : true
         * (underlyingPropertySource.getSource() instanceof Random) : false
         */
        //Arrange Statement(s)
        PropertySource propertySourceMock = mock(PropertySource.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            doReturn(propertySourceMock).when(sourceMock).getSource();
            Object object = new Object();
            doReturn(object).when(propertySourceMock).getSource();
            _assert.when(() -> Assert.notNull(sourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
            SpringConfigurationPropertySource target = new SpringConfigurationPropertySource(sourceMock, propertyMapperArray);
            //Act Statement(s)
            ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyNameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(ConfigurationPropertyState.UNKNOWN));
                verify(sourceMock, atLeast(1)).getSource();
                verify(propertySourceMock, atLeast(1)).getSource();
                _assert.verify(() -> Assert.notNull(sourceMock, "PropertySource must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${containsDescendantOfWhenNameGetNumberOfElementsGreaterThan1AndNameGetElement0FormDASHEDEqualsPrefix}, hash: 7029C4AE2A2B6594A319CB228D9E418C
    @Test()
    void containsDescendantOfWhenNameGetNumberOfElementsGreaterThan1AndNameGetElement0FormDASHEDEqualsPrefix() {
        /* Branches:
         * (underlyingSource instanceof Random) : false
         * (underlyingSource instanceof PropertySource<?> underlyingPropertySource) : true
         * (underlyingPropertySource.getSource() instanceof Random) : true
         * (name.getNumberOfElements() > 1) : true  #  inside containsDescendantOfForRandom method
         * (name.getElement(0, Form.DASHED).equals(prefix)) : true  #  inside containsDescendantOfForRandom method
         */
        //Arrange Statement(s)
        PropertySource propertySourceMock = mock(PropertySource.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            doReturn(2).when(nameMock).getNumberOfElements();
            doReturn("A").when(nameMock).getElement(0, ConfigurationPropertyName.Form.DASHED);
            doReturn(propertySourceMock).when(sourceMock).getSource();
            Random random = new Random();
            doReturn(random).when(propertySourceMock).getSource();
            doReturn("A").when(sourceMock).getName();
            _assert.when(() -> Assert.notNull(sourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
            SpringConfigurationPropertySource target = new SpringConfigurationPropertySource(sourceMock, propertyMapperArray);
            //Act Statement(s)
            ConfigurationPropertyState result = target.containsDescendantOf(nameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(ConfigurationPropertyState.PRESENT));
                verify(nameMock, atLeast(1)).getNumberOfElements();
                verify(nameMock, atLeast(1)).getElement(0, ConfigurationPropertyName.Form.DASHED);
                verify(sourceMock, atLeast(1)).getSource();
                verify(propertySourceMock, atLeast(1)).getSource();
                verify(sourceMock, atLeast(1)).getName();
                _assert.verify(() -> Assert.notNull(sourceMock, "PropertySource must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${containsDescendantOfWhenNameGetNumberOfElementsGreaterThan1AndNameGetElement0FormDASHEDNotEqualsPrefix}, hash: 507B47E562C622AD2239325B82E31375
    @Test()
    void containsDescendantOfWhenNameGetNumberOfElementsGreaterThan1AndNameGetElement0FormDASHEDNotEqualsPrefix() {
        /* Branches:
         * (underlyingSource instanceof Random) : false
         * (underlyingSource instanceof PropertySource<?> underlyingPropertySource) : true
         * (underlyingPropertySource.getSource() instanceof Random) : true
         * (name.getNumberOfElements() > 1) : true  #  inside containsDescendantOfForRandom method
         * (name.getElement(0, Form.DASHED).equals(prefix)) : false  #  inside containsDescendantOfForRandom method
         */
        //Arrange Statement(s)
        PropertySource propertySourceMock = mock(PropertySource.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            doReturn(2).when(nameMock).getNumberOfElements();
            doReturn("A").when(nameMock).getElement(0, ConfigurationPropertyName.Form.DASHED);
            doReturn(propertySourceMock).when(sourceMock).getSource();
            Random random = new Random();
            doReturn(random).when(propertySourceMock).getSource();
            doReturn("B").when(sourceMock).getName();
            _assert.when(() -> Assert.notNull(sourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
            SpringConfigurationPropertySource target = new SpringConfigurationPropertySource(sourceMock, propertyMapperArray);
            //Act Statement(s)
            ConfigurationPropertyState result = target.containsDescendantOf(nameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(ConfigurationPropertyState.ABSENT));
                verify(nameMock, atLeast(1)).getNumberOfElements();
                verify(nameMock, atLeast(1)).getElement(0, ConfigurationPropertyName.Form.DASHED);
                verify(sourceMock, atLeast(1)).getSource();
                verify(propertySourceMock, atLeast(1)).getSource();
                verify(sourceMock, atLeast(1)).getName();
                _assert.verify(() -> Assert.notNull(sourceMock, "PropertySource must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getUnderlyingSourceTest}, hash: FCD1E9E10A8DF0146804F45D366D636D
    @Test()
    void getUnderlyingSourceTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            _assert.when(() -> Assert.notNull(propertySourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
            SpringConfigurationPropertySource target = new SpringConfigurationPropertySource(propertySourceMock, propertyMapperArray);
            //Act Statement(s)
            Object result = target.getUnderlyingSource();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(propertySourceMock));
                _assert.verify(() -> Assert.notNull(propertySourceMock, "PropertySource must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${toStringTest}, hash: 41EFE3F0E01029E3FA392C4A698E8867
    @Test()
    void toStringTest() {
        //Arrange Statement(s)
        PropertySource<?> propertySourceMock = mock(PropertySource.class, "propertySource");
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            _assert.when(() -> Assert.notNull(propertySourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
            SpringConfigurationPropertySource target = new SpringConfigurationPropertySource(propertySourceMock, propertyMapperArray);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("propertySource"));
                _assert.verify(() -> Assert.notNull(propertySourceMock, "PropertySource must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${fromWhenDefaultBranch}, hash: 9EC322AB071EA468476BA72CAE4DD7E5
    @Test()
    void fromWhenDefaultBranch() {
        /* Branches:
         * (source instanceof SystemEnvironmentPropertySource) : false  #  inside getPropertyMappers method
         * (source.getSource() != null) : false  #  inside getRootSource method
         * (rootSource.getSource() instanceof Map) : false  #  inside isFullEnumerable method
         * (isFullEnumerable(source)) : false
         * (branch expression (line 71)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            doReturn(null).when(sourceMock).getSource();
            _assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(sourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            SpringConfigurationPropertySource result = SpringConfigurationPropertySource.from(sourceMock);
            //Assert statement(s)
            //TODO: Please implement equals method in SpringConfigurationPropertySource for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(sourceMock, atLeast(2)).getSource();
                _assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(sourceMock, "PropertySource must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${fromWhenSourceGetSourceIsNullAndRootSourceGetSourceNotInstanceOfMapAndIsFullEnumerableSource}, hash: 196ED4A46E34C483D59FF96B647A812A
    @Disabled()
    @Test()
    void fromWhenSourceGetSourceIsNullAndRootSourceGetSourceNotInstanceOfMapAndIsFullEnumerableSource() {
        /* Branches:
         * (source instanceof SystemEnvironmentPropertySource) : true  #  inside getPropertyMappers method
         * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(name)) : false  #  inside hasSystemEnvironmentName method
         * (name.endsWith("-" + StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME)) : false  #  inside hasSystemEnvironmentName method
         * (hasSystemEnvironmentName(source)) : false  #  inside getPropertyMappers method
         * (source.getSource() != null) : false  #  inside getRootSource method
         * (rootSource.getSource() instanceof Map) : false  #  inside isFullEnumerable method
         * (isFullEnumerable(source)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.springframework.boot.context.properties.source.SpringIterableConfigurationPropertySource
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SystemEnvironmentPropertySource sourceMock = mock(SystemEnvironmentPropertySource.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn("ABCDFGHIJKLMNOPQRS").when(sourceMock).getName();
            doReturn(null).when(sourceMock).getSource();
            _assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            SpringConfigurationPropertySource result = SpringConfigurationPropertySource.from(sourceMock);
            //Assert statement(s)
            //TODO: Please implement equals method in SpringIterableConfigurationPropertySource for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(sourceMock, atLeast(1)).getName();
                verify(sourceMock, atLeast(2)).getSource();
                _assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${fromWhenCaughtUnsupportedOperationExceptionAndIsFullEnumerableSource}, hash: 30C924D7D9290E037FC993DE6206F284
    @Disabled()
    @Test()
    void fromWhenCaughtUnsupportedOperationExceptionAndIsFullEnumerableSource() {
        /* Branches:
         * (source instanceof SystemEnvironmentPropertySource) : true  #  inside getPropertyMappers method
         * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(name)) : true  #  inside hasSystemEnvironmentName method
         * (hasSystemEnvironmentName(source)) : true  #  inside getPropertyMappers method
         * (source.getSource() != null) : true  #  inside getRootSource method
         * (source.getSource() instanceof PropertySource) : true  #  inside getRootSource method
         * (rootSource.getSource() instanceof Map) : false  #  inside isFullEnumerable method
         * (catch-exception (UnsupportedOperationException)) : true  #  inside isFullEnumerable method
         * (isFullEnumerable(source)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.springframework.boot.context.properties.source.SpringIterableConfigurationPropertySource
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SystemEnvironmentPropertySource sourceMock = mock(SystemEnvironmentPropertySource.class);
        PropertySource propertySourceMock = mock(PropertySource.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn("systemEnvironment").when(sourceMock).getName();
            doReturn(propertySourceMock).when(sourceMock).getSource();
            doReturn(null).when(propertySourceMock).getSource();
            _assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            SpringConfigurationPropertySource result = SpringConfigurationPropertySource.from(sourceMock);
            //Assert statement(s)
            //TODO: Please implement equals method in SpringIterableConfigurationPropertySource for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(sourceMock, atLeast(1)).getName();
                verify(sourceMock, atLeast(3)).getSource();
                verify(propertySourceMock, times(2)).getSource();
                _assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${fromWhenSourceGetSourceInstanceOfPropertySourceAndRootSourceGetSourceNotInstanceOfMapAndIsFullEnumerableSource}, hash: 9660207119CADC2E81D4FD54C3102951
    @Disabled()
    @Test()
    void fromWhenSourceGetSourceInstanceOfPropertySourceAndRootSourceGetSourceNotInstanceOfMapAndIsFullEnumerableSource() {
        /* Branches:
         * (source instanceof SystemEnvironmentPropertySource) : true  #  inside getPropertyMappers method
         * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(name)) : false  #  inside hasSystemEnvironmentName method
         * (name.endsWith("-" + StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME)) : true  #  inside hasSystemEnvironmentName method
         * (hasSystemEnvironmentName(source)) : true  #  inside getPropertyMappers method
         * (source.getSource() != null) : true  #  inside getRootSource method
         * (source.getSource() instanceof PropertySource) : true  #  inside getRootSource method
         * (rootSource.getSource() instanceof Map) : false  #  inside isFullEnumerable method
         * (isFullEnumerable(source)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.springframework.boot.context.properties.source.SpringIterableConfigurationPropertySource
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SystemEnvironmentPropertySource sourceMock = mock(SystemEnvironmentPropertySource.class);
        PropertySource propertySourceMock = mock(PropertySource.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn("-systemEnvironment").when(sourceMock).getName();
            doReturn(propertySourceMock).when(sourceMock).getSource();
            doReturn(null).when(propertySourceMock).getSource();
            _assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            SpringConfigurationPropertySource result = SpringConfigurationPropertySource.from(sourceMock);
            //Assert statement(s)
            //TODO: Please implement equals method in SpringIterableConfigurationPropertySource for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(sourceMock, atLeast(1)).getName();
                verify(sourceMock, atLeast(3)).getSource();
                verify(propertySourceMock, times(2)).getSource();
                _assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${fromWhenRootSourceGetSourceInstanceOfMapAndIsFullEnumerableSource}, hash: FFAD0BF5DA3614F97F0F412BBD634E83
    @Test()
    void fromWhenRootSourceGetSourceInstanceOfMapAndIsFullEnumerableSource() {
        /* Branches:
         * (source instanceof SystemEnvironmentPropertySource) : true  #  inside getPropertyMappers method
         * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(name)) : false  #  inside hasSystemEnvironmentName method
         * (name.endsWith("-" + StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME)) : true  #  inside hasSystemEnvironmentName method
         * (hasSystemEnvironmentName(source)) : true  #  inside getPropertyMappers method
         * (source.getSource() != null) : true  #  inside getRootSource method
         * (source.getSource() instanceof PropertySource) : false  #  inside getRootSource method
         * (rootSource.getSource() instanceof Map) : true  #  inside isFullEnumerable method
         * (isFullEnumerable(source)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.springframework.boot.context.properties.source.SpringIterableConfigurationPropertySource
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SystemEnvironmentPropertySource sourceMock = mock(SystemEnvironmentPropertySource.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn("-systemEnvironment").when(sourceMock).getName();
            Map map = new HashMap<>();
            doReturn(map).when(sourceMock).getSource();
            _assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            SpringConfigurationPropertySource result = SpringConfigurationPropertySource.from(sourceMock);
            //Assert statement(s)
            //TODO: Please implement equals method in SpringIterableConfigurationPropertySource for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(sourceMock, atLeast(1)).getName();
                verify(sourceMock, atLeast(4)).getSource();
                _assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${fromWhenIsFullEnumerableNotSourceAndDefaultBranch}, hash: 25DD50C9D475EB43FB04AE39F2BB039B
    @Test()
    void fromWhenIsFullEnumerableNotSourceAndDefaultBranch() {
        /* Branches:
         * (source instanceof SystemEnvironmentPropertySource) : true  #  inside getPropertyMappers method
         * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(name)) : true  #  inside hasSystemEnvironmentName method
         * (hasSystemEnvironmentName(source)) : true  #  inside getPropertyMappers method
         * (source.getSource() != null) : true  #  inside getRootSource method
         * (source.getSource() instanceof PropertySource) : false  #  inside getRootSource method
         * (rootSource.getSource() instanceof Map) : true  #  inside isFullEnumerable method
         * (catch-exception (UnsupportedOperationException)) : true  #  inside isFullEnumerable method
         * (isFullEnumerable(source)) : false
         * (branch expression (line 71)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SystemEnvironmentPropertySource sourceMock = mock(SystemEnvironmentPropertySource.class);
        UnsupportedOperationException unsupportedOperationExceptionMock = mock(UnsupportedOperationException.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            doReturn("systemEnvironment").when(sourceMock).getName();
            Map map = new HashMap<>();
            doThrow(unsupportedOperationExceptionMock).when(sourceMock).getSource();
            _assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(sourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            SpringConfigurationPropertySource result = SpringConfigurationPropertySource.from(sourceMock);
            //Assert statement(s)
            //TODO: Please implement equals method in SpringConfigurationPropertySource for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(sourceMock, atLeast(1)).getName();
                verify(sourceMock, atLeast(4)).getSource();
                _assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(sourceMock, "PropertySource must not be null"), atLeast(1));
            });
        }
    }
}
