package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.mockito.stubbing.Answer;
import org.springframework.boot.origin.Origin;
import java.util.Iterator;
import java.util.stream.Stream;
import org.springframework.util.Assert;
import java.util.Map;
import java.util.HashMap;
import org.springframework.boot.origin.PropertySourceOrigin;
import org.mockito.MockedStatic;
import java.util.function.BiPredicate;
import java.util.ArrayList;
import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.core.env.MapPropertySource;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static java.util.Map.entry;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringIterableConfigurationPropertySourceSapientGeneratedTest {

    private final BiPredicate biPredicateMock = mock(BiPredicate.class);

    private final BiPredicate biPredicateMock2 = mock(BiPredicate.class);

    private final ConfigurationProperty configurationPropertyMock = mock(ConfigurationProperty.class);

    private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

    private final EnumerablePropertySource<?> enumerablePropertySourceMock = mock(EnumerablePropertySource.class);

    private final EnumerablePropertySource<?> enumerablePropertySourceMock2 = mock(EnumerablePropertySource.class);

    private final MapPropertySource mapSourceMock = mock(MapPropertySource.class);

    private final Origin originMock = mock(Origin.class);

    private final Origin originMock2 = mock(Origin.class);

    private final PropertyMapper propertyMapperMock = mock(PropertyMapper.class);

    private final PropertyMapper propertyMapperMock2 = mock(PropertyMapper.class);

    //Sapient generated method id: ${getCachingTest}, hash: 882E7DA0A386405B21150B550BCEA48F
    @Test()
    void getCachingTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            Map<String, String> stringStringMap = new HashMap<>();
            doReturn(stringStringMap).when(mapSourceMock).getSource();
            doReturn("systemEnvironment").when(mapSourceMock).getName();
            doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
            doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
            _assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
            SpringIterableConfigurationPropertySource target = new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray);
            //Act Statement(s)
            ConfigurationPropertyCaching result = target.getCaching();
            //Assert statement(s)
            //TODO: Please implement equals method in SoftReferenceConfigurationPropertyCache for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(mapSourceMock, times(2)).getSource();
                verify(mapSourceMock, atLeast(1)).getName();
                verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
                verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
                _assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getConfigurationPropertyWhenNameIsNull}, hash: 2A3BF3325DD925BA0B7E1ABE7CA5A0C9
    @Test()
    void getConfigurationPropertyWhenNameIsNull() {
        /* Branches:
         * (name == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            Map<String, String> stringStringMap = new HashMap<>();
            doReturn(stringStringMap).when(mapSourceMock).getSource();
            doReturn("systemEnvironment").when(mapSourceMock).getName();
            doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
            doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
            _assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
            SpringIterableConfigurationPropertySource target = new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray);
            ConfigurationPropertyName configurationPropertyName = null;
            //Act Statement(s)
            ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyName);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                verify(mapSourceMock, times(2)).getSource();
                verify(mapSourceMock, atLeast(1)).getName();
                verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
                verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
                _assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getConfigurationPropertyWhenConfigurationPropertyIsNotNull}, hash: F3B44E552897B37BE6F150D5EB26C221
    @Test()
    void getConfigurationPropertyWhenConfigurationPropertyIsNotNull() {
        /* Branches:
         * (name == null) : false
         * (name == null) : false  #  inside getConfigurationProperty method
         * (for-each(this.mappers)) : true  #  inside getConfigurationProperty method
         * (for-each(mapper.map(name))) : true  #  inside getConfigurationProperty method
         * (value != null) : true  #  inside getConfigurationProperty method
         * (configurationProperty != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
            MockedStatic<PropertySourceOrigin> propertySourceOrigin = mockStatic(PropertySourceOrigin.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            Map<String, String> stringStringMap = new HashMap<>();
            doReturn(stringStringMap).when(mapSourceMock).getSource();
            doReturn("systemEnvironment").when(mapSourceMock).getName();
            Object object = new Object();
            doReturn(object).when(mapSourceMock).getProperty("return_of_mapItem1");
            doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
            List<String> stringList = new ArrayList<>();
            stringList.add("return_of_mapItem1");
            doReturn(stringList).when(propertyMapperMock).map(configurationPropertyNameMock);
            doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
            _assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            propertySourceOrigin.when(() -> PropertySourceOrigin.get(mapSourceMock, "return_of_mapItem1")).thenReturn(originMock);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
            SpringIterableConfigurationPropertySource target = new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray);
            configurationProperty.when(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock)).thenReturn(configurationPropertyMock);
            //Act Statement(s)
            ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(configurationPropertyMock));
                verify(mapSourceMock, times(2)).getSource();
                verify(mapSourceMock, atLeast(1)).getName();
                verify(mapSourceMock, atLeast(1)).getProperty("return_of_mapItem1");
                verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
                verify(propertyMapperMock, atLeast(1)).map(configurationPropertyNameMock);
                verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
                _assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
                propertySourceOrigin.verify(() -> PropertySourceOrigin.get(mapSourceMock, "return_of_mapItem1"), atLeast(1));
                configurationProperty.verify(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getConfigurationPropertyWhenValueIsNullAndConfigurationPropertyIsNullAndGetMappingsGetMappedNameIsEmpty}, hash: 30127ABE3AA0FF420EF2FF1AACA56C91
    @Disabled()
    @Test()
    void getConfigurationPropertyWhenValueIsNullAndConfigurationPropertyIsNullAndGetMappingsGetMappedNameIsEmpty() {
        /* Branches:
         * (name == null) : false
         * (name == null) : false  #  inside getConfigurationProperty method
         * (for-each(this.mappers)) : true  #  inside getConfigurationProperty method
         * (for-each(mapper.map(name))) : true  #  inside getConfigurationProperty method
         * (value != null) : false  #  inside getConfigurationProperty method
         * (configurationProperty != null) : false
         * (for-each(getMappings().getMapped(name))) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            Map<String, String> stringStringMap = new HashMap<>();
            doReturn(stringStringMap).when(mapSourceMock).getSource();
            doReturn("systemEnvironment").when(mapSourceMock).getName();
            doReturn(null).when(mapSourceMock).getProperty("return_of_mapItem1");
            doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
            List<String> stringList = new ArrayList<>();
            stringList.add("return_of_mapItem1");
            doReturn(stringList).when(propertyMapperMock).map(configurationPropertyNameMock);
            doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
            _assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
            SpringIterableConfigurationPropertySource target = new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray);
            //Act Statement(s)
            ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                verify(mapSourceMock, times(2)).getSource();
                verify(mapSourceMock, atLeast(1)).getName();
                verify(mapSourceMock, atLeast(1)).getProperty("return_of_mapItem1");
                verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
                verify(propertyMapperMock, atLeast(1)).map(configurationPropertyNameMock);
                verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
                _assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getConfigurationPropertyWhenValueIsNotNull}, hash: E51F301E093605906CEF529000C0FBF0
    @Disabled()
    @Test()
    void getConfigurationPropertyWhenValueIsNotNull() {
        /* Branches:
         * (name == null) : false
         * (name == null) : false  #  inside getConfigurationProperty method
         * (for-each(this.mappers)) : true  #  inside getConfigurationProperty method
         * (for-each(mapper.map(name))) : true  #  inside getConfigurationProperty method
         * (value != null) : true  #  inside getConfigurationProperty method
         * (configurationProperty != null) : false
         * (for-each(getMappings().getMapped(name))) : true
         * (value != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
            MockedStatic<PropertySourceOrigin> propertySourceOrigin = mockStatic(PropertySourceOrigin.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            Map<String, String> stringStringMap = new HashMap<>();
            doReturn(stringStringMap).when(mapSourceMock).getSource();
            doReturn("systemEnvironment").when(mapSourceMock).getName();
            Object object = new Object();
            doReturn(object).when(mapSourceMock).getProperty("return_of_mapItem1");
            doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
            List<String> stringList = new ArrayList<>();
            stringList.add("return_of_mapItem1");
            doReturn(stringList).when(propertyMapperMock).map(configurationPropertyNameMock);
            doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
            _assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            propertySourceOrigin.when(() -> PropertySourceOrigin.get(mapSourceMock, "return_of_mapItem1")).thenReturn(originMock);
            propertySourceOrigin.when(() -> PropertySourceOrigin.get(enumerablePropertySourceMock, "name1")).thenReturn(originMock2);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
            SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
            configurationProperty.when(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock)).thenReturn(null);
            Object object2 = new Object();
            doReturn(object2).when(enumerablePropertySourceMock2).getProperty("name1");
            doReturn(enumerablePropertySourceMock2, enumerablePropertySourceMock).when(target).getPropertySource();
            configurationProperty.when(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object2, originMock2)).thenReturn(configurationPropertyMock);
            //Act Statement(s)
            ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(configurationPropertyMock));
                verify(mapSourceMock, times(2)).getSource();
                verify(mapSourceMock, atLeast(1)).getName();
                verify(mapSourceMock, atLeast(1)).getProperty("return_of_mapItem1");
                verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
                verify(propertyMapperMock, atLeast(1)).map(configurationPropertyNameMock);
                verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
                _assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
                propertySourceOrigin.verify(() -> PropertySourceOrigin.get(mapSourceMock, "return_of_mapItem1"), atLeast(1));
                propertySourceOrigin.verify(() -> PropertySourceOrigin.get(enumerablePropertySourceMock, "name1"), atLeast(1));
                configurationProperty.verify(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock), atLeast(1));
                verify(target, times(2)).getPropertySource();
                verify(enumerablePropertySourceMock2, atLeast(1)).getProperty("name1");
                configurationProperty.verify(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object2, originMock2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getConfigurationPropertyWhenValueIsNull}, hash: 3FB4293F4DDA3DC7B36714A0D05A411F
    @Disabled()
    @Test()
    void getConfigurationPropertyWhenValueIsNull() {
        /* Branches:
         * (name == null) : false
         * (name == null) : false  #  inside getConfigurationProperty method
         * (for-each(this.mappers)) : true  #  inside getConfigurationProperty method
         * (for-each(mapper.map(name))) : true  #  inside getConfigurationProperty method
         * (value != null) : true  #  inside getConfigurationProperty method
         * (configurationProperty != null) : false
         * (for-each(getMappings().getMapped(name))) : true
         * (value != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
            MockedStatic<PropertySourceOrigin> propertySourceOrigin = mockStatic(PropertySourceOrigin.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            Map<String, String> stringStringMap = new HashMap<>();
            doReturn(stringStringMap).when(mapSourceMock).getSource();
            doReturn("systemEnvironment").when(mapSourceMock).getName();
            Object object = new Object();
            doReturn(object).when(mapSourceMock).getProperty("return_of_mapItem1");
            doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
            List<String> stringList = new ArrayList<>();
            stringList.add("return_of_mapItem1");
            doReturn(stringList).when(propertyMapperMock).map(configurationPropertyNameMock);
            doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
            _assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            propertySourceOrigin.when(() -> PropertySourceOrigin.get(mapSourceMock, "return_of_mapItem1")).thenReturn(originMock);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
            SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
            configurationProperty.when(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock)).thenReturn(null);
            doReturn(enumerablePropertySourceMock).when(target).getPropertySource();
            doReturn(null).when(enumerablePropertySourceMock).getProperty("name1");
            //Act Statement(s)
            ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                verify(mapSourceMock, times(2)).getSource();
                verify(mapSourceMock, atLeast(1)).getName();
                verify(mapSourceMock, atLeast(1)).getProperty("return_of_mapItem1");
                verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
                verify(propertyMapperMock, atLeast(1)).map(configurationPropertyNameMock);
                verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
                _assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
                propertySourceOrigin.verify(() -> PropertySourceOrigin.get(mapSourceMock, "return_of_mapItem1"), atLeast(1));
                configurationProperty.verify(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock), atLeast(1));
                verify(target, atLeast(1)).getPropertySource();
                verify(enumerablePropertySourceMock, atLeast(1)).getProperty("name1");
            });
        }
    }

    //Sapient generated method id: ${getConfigurationPropertyWhenGetMappingsGetMappedNameIsNotEmptyAndValueIsNotNull}, hash: 93F59F3FC7E854CC663363A4A44F9D09
    @Disabled()
    @Test()
    void getConfigurationPropertyWhenGetMappingsGetMappedNameIsNotEmptyAndValueIsNotNull() {
        /* Branches:
         * (name == null) : false
         * (name == null) : false  #  inside getConfigurationProperty method
         * (for-each(this.mappers)) : true  #  inside getConfigurationProperty method
         * (for-each(mapper.map(name))) : true  #  inside getConfigurationProperty method
         * (value != null) : true  #  inside getConfigurationProperty method
         * (branch expression (line 91)) : true  #  inside getConfigurationProperty method
         * (configurationProperty != null) : false
         * (for-each(getMappings().getMapped(name))) : true
         * (value != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ConfigurationProperty configurationPropertyMock2 = mock(ConfigurationProperty.class);
        try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
            MockedStatic<PropertySourceOrigin> propertySourceOrigin = mockStatic(PropertySourceOrigin.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            Map<String, String> stringStringMap = new HashMap<>();
            doReturn(stringStringMap).when(mapSourceMock).getSource();
            doReturn("systemEnvironment").when(mapSourceMock).getName();
            Object object = new Object();
            doReturn(object).when(mapSourceMock).getProperty("return_of_mapItem1");
            doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
            List<String> stringList = new ArrayList<>();
            stringList.add("return_of_mapItem1");
            doReturn(stringList).when(propertyMapperMock).map(configurationPropertyNameMock);
            doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
            _assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            propertySourceOrigin.when(() -> PropertySourceOrigin.get(mapSourceMock, "return_of_mapItem1")).thenReturn(originMock);
            propertySourceOrigin.when(() -> PropertySourceOrigin.get(enumerablePropertySourceMock, "name1")).thenReturn(originMock2);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
            SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
            configurationProperty.when(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock)).thenReturn(configurationPropertyMock);
            Object object2 = new Object();
            doReturn(object2).when(enumerablePropertySourceMock2).getProperty("name1");
            doReturn(enumerablePropertySourceMock2, enumerablePropertySourceMock).when(target).getPropertySource();
            configurationProperty.when(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object2, originMock2)).thenReturn(configurationPropertyMock2);
            //Act Statement(s)
            ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(configurationPropertyMock2));
                verify(mapSourceMock, times(2)).getSource();
                verify(mapSourceMock, atLeast(1)).getName();
                verify(mapSourceMock, atLeast(1)).getProperty("return_of_mapItem1");
                verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
                verify(propertyMapperMock, atLeast(1)).map(configurationPropertyNameMock);
                verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
                _assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
                propertySourceOrigin.verify(() -> PropertySourceOrigin.get(mapSourceMock, "return_of_mapItem1"), atLeast(1));
                propertySourceOrigin.verify(() -> PropertySourceOrigin.get(enumerablePropertySourceMock, "name1"), atLeast(1));
                configurationProperty.verify(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock), atLeast(1));
                verify(target, times(2)).getPropertySource();
                verify(enumerablePropertySourceMock2, atLeast(1)).getProperty("name1");
                configurationProperty.verify(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object2, originMock2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getConfigurationPropertyWhenGetMappingsGetMappedNameIsNotEmptyAndValueIsNull}, hash: 2B9F9E1F5F2264D959B9FBD12FAC760D
    @Disabled()
    @Test()
    void getConfigurationPropertyWhenGetMappingsGetMappedNameIsNotEmptyAndValueIsNull() {
        /* Branches:
         * (name == null) : false
         * (name == null) : false  #  inside getConfigurationProperty method
         * (for-each(this.mappers)) : true  #  inside getConfigurationProperty method
         * (for-each(mapper.map(name))) : true  #  inside getConfigurationProperty method
         * (value != null) : true  #  inside getConfigurationProperty method
         * (branch expression (line 91)) : true  #  inside getConfigurationProperty method
         * (configurationProperty != null) : false
         * (for-each(getMappings().getMapped(name))) : true
         * (value != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
            MockedStatic<PropertySourceOrigin> propertySourceOrigin = mockStatic(PropertySourceOrigin.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            Map<String, String> stringStringMap = new HashMap<>();
            doReturn(stringStringMap).when(mapSourceMock).getSource();
            doReturn("systemEnvironment").when(mapSourceMock).getName();
            Object object = new Object();
            doReturn(object).when(mapSourceMock).getProperty("return_of_mapItem1");
            doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
            List<String> stringList = new ArrayList<>();
            stringList.add("return_of_mapItem1");
            doReturn(stringList).when(propertyMapperMock).map(configurationPropertyNameMock);
            doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
            _assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            propertySourceOrigin.when(() -> PropertySourceOrigin.get(mapSourceMock, "return_of_mapItem1")).thenReturn(originMock);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
            SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
            configurationProperty.when(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock)).thenReturn(configurationPropertyMock);
            doReturn(enumerablePropertySourceMock).when(target).getPropertySource();
            doReturn(null).when(enumerablePropertySourceMock).getProperty("name1");
            //Act Statement(s)
            ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                verify(mapSourceMock, times(2)).getSource();
                verify(mapSourceMock, atLeast(1)).getName();
                verify(mapSourceMock, atLeast(1)).getProperty("return_of_mapItem1");
                verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
                verify(propertyMapperMock, atLeast(1)).map(configurationPropertyNameMock);
                verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
                _assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
                propertySourceOrigin.verify(() -> PropertySourceOrigin.get(mapSourceMock, "return_of_mapItem1"), atLeast(1));
                configurationProperty.verify(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock), atLeast(1));
                verify(target, atLeast(1)).getPropertySource();
                verify(enumerablePropertySourceMock, atLeast(1)).getProperty("name1");
            });
        }
    }

    //Sapient generated method id: ${streamWhenIsImmutablePropertySourceNot}, hash: 437318112BF9C1FEED1D2F1E580AF587
    @Disabled()
    @Test()
    void streamWhenIsImmutablePropertySourceNot() {
        /* Branches:
         * (source instanceof OriginLookup) : false  #  inside isImmutablePropertySource method
         * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(source.getName())) : false  #  inside isImmutablePropertySource method
         * (!isImmutablePropertySource()) : true  #  inside getConfigurationPropertyNames method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            Map<String, String> stringStringMap = new HashMap<>();
            doReturn(stringStringMap).when(mapSourceMock).getSource();
            doReturn("systemEnvironment").when(mapSourceMock).getName();
            doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
            doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
            _assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
            SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
            doReturn("A").when(enumerablePropertySourceMock).getName();
            doReturn(enumerablePropertySourceMock, enumerablePropertySourceMock2).when(target).getPropertySource();
            String[] stringArray = new String[] {};
            doReturn(stringArray).when(enumerablePropertySourceMock2).getPropertyNames();
            //Act Statement(s)
            Stream<ConfigurationPropertyName> result = target.stream();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(mapSourceMock, times(2)).getSource();
                verify(mapSourceMock, atLeast(1)).getName();
                verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
                verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
                _assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
                verify(target, times(2)).getPropertySource();
                verify(enumerablePropertySourceMock, atLeast(1)).getName();
                verify(enumerablePropertySourceMock2, atLeast(1)).getPropertyNames();
            });
        }
    }

    //Sapient generated method id: ${streamWhenSourceGetSourceNotEqualsSystemGetenvAndIsImmutablePropertySourceNot}, hash: 88F8C69B09B067A25F2049A24C60F46D
    @Disabled()
    @Test()
    void streamWhenSourceGetSourceNotEqualsSystemGetenvAndIsImmutablePropertySourceNot() {
        /* Branches:
         * (source instanceof OriginLookup) : false  #  inside isImmutablePropertySource method
         * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(source.getName())) : true  #  inside isImmutablePropertySource method
         * (source.getSource() == System.getenv()) : false  #  inside isImmutablePropertySource method
         * (!isImmutablePropertySource()) : true  #  inside getConfigurationPropertyNames method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            Map<String, String> stringStringMap = new HashMap<>();
            doReturn(stringStringMap).when(mapSourceMock).getSource();
            doReturn("systemEnvironment").when(mapSourceMock).getName();
            doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
            doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
            _assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
            SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
            doReturn("systemEnvironment").when(enumerablePropertySourceMock).getName();
            Object object = new Object();
            doReturn(object).when(enumerablePropertySourceMock).getSource();
            doReturn(enumerablePropertySourceMock, enumerablePropertySourceMock2).when(target).getPropertySource();
            String[] stringArray = new String[] {};
            doReturn(stringArray).when(enumerablePropertySourceMock2).getPropertyNames();
            //Act Statement(s)
            Stream<ConfigurationPropertyName> result = target.stream();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(mapSourceMock, times(2)).getSource();
                verify(mapSourceMock, atLeast(1)).getName();
                verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
                verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
                _assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
                verify(target, times(2)).getPropertySource();
                verify(enumerablePropertySourceMock, atLeast(1)).getName();
                verify(enumerablePropertySourceMock, atLeast(1)).getSource();
                verify(enumerablePropertySourceMock2, atLeast(1)).getPropertyNames();
            });
        }
    }

    //Sapient generated method id: ${streamWhenConfigurationPropertyNamesIsNull}, hash: 659AEE29BD378B96A5F457619FECF1F6
    @Disabled()
    @Test()
    void streamWhenConfigurationPropertyNamesIsNull() {
        /* Branches:
         * (source instanceof OriginLookup) : false  #  inside isImmutablePropertySource method
         * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(source.getName())) : true  #  inside isImmutablePropertySource method
         * (source.getSource() == System.getenv()) : true  #  inside isImmutablePropertySource method
         * (!isImmutablePropertySource()) : false  #  inside getConfigurationPropertyNames method
         * (configurationPropertyNames == null) : true  #  inside getConfigurationPropertyNames method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            Map<String, String> stringStringMap = new HashMap<>();
            doReturn(stringStringMap).when(mapSourceMock).getSource();
            doReturn("systemEnvironment").when(mapSourceMock).getName();
            doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
            doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
            _assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
            SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
            doReturn("systemEnvironment").when(enumerablePropertySourceMock).getName();
            Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("PATH", "/usr/bin:/bin:/usr/sbin:/sbin"), entry("__CFBundleIdentifier", "com.jetbrains.intellij.ce"), entry("SSH_AUTH_SOCK", "/private/tmp/com.apple.launchd.3aGiD7YEVS/Listeners"), entry("XPC_FLAGS", "0x0"), entry("SHELL", "/bin/zsh"), entry("__CF_USER_TEXT_ENCODING", "0x1F5:0x0:0x0"), entry("LOGNAME", "bhuvan"), entry("XPC_SERVICE_NAME", "application.com.jetbrains.intellij.ce.7960374.7961073"), entry("USER", "bhuvan"), entry("HOME", "/Users/bhuvan"), entry("TMPDIR", "/var/folders/23/6wlpx0js4c9b9z51m_1txb780000gn/T/"), entry("COMMAND_MODE", "unix2003")));
            doReturn(stringStringMap2).when(enumerablePropertySourceMock).getSource();
            doReturn(enumerablePropertySourceMock, enumerablePropertySourceMock2).when(target).getPropertySource();
            String[] stringArray = new String[] {};
            doReturn(stringArray).when(enumerablePropertySourceMock2).getPropertyNames();
            //Act Statement(s)
            Stream<ConfigurationPropertyName> result = target.stream();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(mapSourceMock, times(2)).getSource();
                verify(mapSourceMock, atLeast(1)).getName();
                verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
                verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
                _assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
                verify(target, times(2)).getPropertySource();
                verify(enumerablePropertySourceMock, atLeast(1)).getName();
                verify(enumerablePropertySourceMock, atLeast(1)).getSource();
                verify(enumerablePropertySourceMock2, atLeast(1)).getPropertyNames();
            });
        }
    }

    //Sapient generated method id: ${iteratorWhenIsImmutablePropertySourceNot}, hash: 972E148119D81ADCF6109E08AB8F6999
    @Disabled()
    @Test()
    void iteratorWhenIsImmutablePropertySourceNot() {
        /* Branches:
         * (source instanceof OriginLookup) : false  #  inside isImmutablePropertySource method
         * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(source.getName())) : false  #  inside isImmutablePropertySource method
         * (!isImmutablePropertySource()) : true  #  inside getConfigurationPropertyNames method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            Map<String, String> stringStringMap = new HashMap<>();
            doReturn(stringStringMap).when(mapSourceMock).getSource();
            doReturn("systemEnvironment").when(mapSourceMock).getName();
            doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
            doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
            _assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
            SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
            doReturn("A").when(enumerablePropertySourceMock).getName();
            doReturn(enumerablePropertySourceMock, enumerablePropertySourceMock2).when(target).getPropertySource();
            String[] stringArray = new String[] {};
            doReturn(stringArray).when(enumerablePropertySourceMock2).getPropertyNames();
            //Act Statement(s)
            Iterator<ConfigurationPropertyName> result = target.iterator();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(mapSourceMock, times(2)).getSource();
                verify(mapSourceMock, atLeast(1)).getName();
                verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
                verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
                _assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
                verify(target, times(2)).getPropertySource();
                verify(enumerablePropertySourceMock, atLeast(1)).getName();
                verify(enumerablePropertySourceMock2, atLeast(1)).getPropertyNames();
            });
        }
    }

    //Sapient generated method id: ${iteratorWhenSourceGetSourceNotEqualsSystemGetenvAndIsImmutablePropertySourceNot}, hash: 870810997E07EDFE9B800D328BF7155B
    @Disabled()
    @Test()
    void iteratorWhenSourceGetSourceNotEqualsSystemGetenvAndIsImmutablePropertySourceNot() {
        /* Branches:
         * (source instanceof OriginLookup) : false  #  inside isImmutablePropertySource method
         * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(source.getName())) : true  #  inside isImmutablePropertySource method
         * (source.getSource() == System.getenv()) : false  #  inside isImmutablePropertySource method
         * (!isImmutablePropertySource()) : true  #  inside getConfigurationPropertyNames method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            Map<String, String> stringStringMap = new HashMap<>();
            doReturn(stringStringMap).when(mapSourceMock).getSource();
            doReturn("systemEnvironment").when(mapSourceMock).getName();
            doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
            doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
            _assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
            SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
            doReturn("systemEnvironment").when(enumerablePropertySourceMock).getName();
            Object object = new Object();
            doReturn(object).when(enumerablePropertySourceMock).getSource();
            doReturn(enumerablePropertySourceMock, enumerablePropertySourceMock2).when(target).getPropertySource();
            String[] stringArray = new String[] {};
            doReturn(stringArray).when(enumerablePropertySourceMock2).getPropertyNames();
            //Act Statement(s)
            Iterator<ConfigurationPropertyName> result = target.iterator();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(mapSourceMock, times(2)).getSource();
                verify(mapSourceMock, atLeast(1)).getName();
                verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
                verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
                _assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
                verify(target, times(2)).getPropertySource();
                verify(enumerablePropertySourceMock, atLeast(1)).getName();
                verify(enumerablePropertySourceMock, atLeast(1)).getSource();
                verify(enumerablePropertySourceMock2, atLeast(1)).getPropertyNames();
            });
        }
    }

    //Sapient generated method id: ${iteratorWhenConfigurationPropertyNamesIsNull}, hash: 77408136A6BC7EF6F9C8698B17FF355A
    @Disabled()
    @Test()
    void iteratorWhenConfigurationPropertyNamesIsNull() {
        /* Branches:
         * (source instanceof OriginLookup) : false  #  inside isImmutablePropertySource method
         * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(source.getName())) : true  #  inside isImmutablePropertySource method
         * (source.getSource() == System.getenv()) : true  #  inside isImmutablePropertySource method
         * (!isImmutablePropertySource()) : false  #  inside getConfigurationPropertyNames method
         * (configurationPropertyNames == null) : true  #  inside getConfigurationPropertyNames method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            Map<String, String> stringStringMap = new HashMap<>();
            doReturn(stringStringMap).when(mapSourceMock).getSource();
            doReturn("systemEnvironment").when(mapSourceMock).getName();
            doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
            doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
            _assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
            SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
            doReturn("systemEnvironment").when(enumerablePropertySourceMock).getName();
            Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("PATH", "/usr/bin:/bin:/usr/sbin:/sbin"), entry("__CFBundleIdentifier", "com.jetbrains.intellij.ce"), entry("SSH_AUTH_SOCK", "/private/tmp/com.apple.launchd.3aGiD7YEVS/Listeners"), entry("XPC_FLAGS", "0x0"), entry("SHELL", "/bin/zsh"), entry("__CF_USER_TEXT_ENCODING", "0x1F5:0x0:0x0"), entry("LOGNAME", "bhuvan"), entry("XPC_SERVICE_NAME", "application.com.jetbrains.intellij.ce.7960374.7961073"), entry("USER", "bhuvan"), entry("HOME", "/Users/bhuvan"), entry("TMPDIR", "/var/folders/23/6wlpx0js4c9b9z51m_1txb780000gn/T/"), entry("COMMAND_MODE", "unix2003")));
            doReturn(stringStringMap2).when(enumerablePropertySourceMock).getSource();
            doReturn(enumerablePropertySourceMock, enumerablePropertySourceMock2).when(target).getPropertySource();
            String[] stringArray = new String[] {};
            doReturn(stringArray).when(enumerablePropertySourceMock2).getPropertyNames();
            //Act Statement(s)
            Iterator<ConfigurationPropertyName> result = target.iterator();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(mapSourceMock, times(2)).getSource();
                verify(mapSourceMock, atLeast(1)).getName();
                verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
                verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
                _assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
                verify(target, times(2)).getPropertySource();
                verify(enumerablePropertySourceMock, atLeast(1)).getName();
                verify(enumerablePropertySourceMock, atLeast(1)).getSource();
                verify(enumerablePropertySourceMock2, atLeast(1)).getPropertyNames();
            });
        }
    }

    //Sapient generated method id: ${containsDescendantOfWhenThisAncestorOfCheckEqualsPropertyMapperDEFAULT_ANCESTOR_OF_CHECK}, hash: FB619EE0053F0351588FA1122F93C0F3
    @Disabled()
    @Test()
    void containsDescendantOfWhenThisAncestorOfCheckEqualsPropertyMapperDEFAULT_ANCESTOR_OF_CHECK() {
        /* Branches:
         * (underlyingSource instanceof Random) : false  #  inside containsDescendantOf method
         * (underlyingSource instanceof PropertySource<?> underlyingPropertySource) : false  #  inside containsDescendantOf method
         * (result != ConfigurationPropertyState.UNKNOWN) : false
         * (this.ancestorOfCheck == PropertyMapper.DEFAULT_ANCESTOR_OF_CHECK) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            Map<String, String> stringStringMap = new HashMap<>();
            doReturn(stringStringMap).when(mapSourceMock).getSource();
            doReturn("systemEnvironment").when(mapSourceMock).getName();
            doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
            doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
            _assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
            SpringIterableConfigurationPropertySource target = new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray);
            //Act Statement(s)
            ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyNameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(ConfigurationPropertyState.PRESENT));
                verify(mapSourceMock, times(3)).getSource();
                verify(mapSourceMock, atLeast(1)).getName();
                verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
                verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
                _assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${containsDescendantOfWhenCandidatesIsEmpty}, hash: 3010C9B9428927BCC3DF1930219D04C2
    @Disabled()
    @Test()
    void containsDescendantOfWhenCandidatesIsEmpty() {
        /* Branches:
         * (underlyingSource instanceof Random) : false  #  inside containsDescendantOf method
         * (underlyingSource instanceof PropertySource<?> underlyingPropertySource) : false  #  inside containsDescendantOf method
         * (result != ConfigurationPropertyState.UNKNOWN) : false
         * (this.ancestorOfCheck == PropertyMapper.DEFAULT_ANCESTOR_OF_CHECK) : false
         * (source instanceof OriginLookup) : false  #  inside isImmutablePropertySource method
         * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(source.getName())) : false  #  inside isImmutablePropertySource method
         * (!isImmutablePropertySource()) : true  #  inside getConfigurationPropertyNames method
         * (for-each(candidates)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            Map<String, String> stringStringMap = new HashMap<>();
            doReturn(stringStringMap).when(mapSourceMock).getSource();
            doReturn("systemEnvironment").when(mapSourceMock).getName();
            doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
            doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
            _assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
            SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
            doReturn("A").when(enumerablePropertySourceMock).getName();
            doReturn(enumerablePropertySourceMock, enumerablePropertySourceMock2).when(target).getPropertySource();
            String[] stringArray = new String[] {};
            doReturn(stringArray).when(enumerablePropertySourceMock2).getPropertyNames();
            //Act Statement(s)
            ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyNameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(ConfigurationPropertyState.ABSENT));
                verify(mapSourceMock, times(3)).getSource();
                verify(mapSourceMock, atLeast(1)).getName();
                verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
                verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
                _assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
                verify(target, times(2)).getPropertySource();
                verify(enumerablePropertySourceMock, atLeast(1)).getName();
                verify(enumerablePropertySourceMock2, atLeast(1)).getPropertyNames();
            });
        }
    }

    //Sapient generated method id: ${containsDescendantOfWhenIsImmutablePropertySourceNotAndCandidatesIsEmpty}, hash: E565E7D56E768F8158F8AF1AD151C7A1
    @Disabled()
    @Test()
    void containsDescendantOfWhenIsImmutablePropertySourceNotAndCandidatesIsEmpty() {
        /* Branches:
         * (underlyingSource instanceof Random) : false  #  inside containsDescendantOf method
         * (underlyingSource instanceof PropertySource<?> underlyingPropertySource) : false  #  inside containsDescendantOf method
         * (result != ConfigurationPropertyState.UNKNOWN) : false
         * (this.ancestorOfCheck == PropertyMapper.DEFAULT_ANCESTOR_OF_CHECK) : false
         * (source instanceof OriginLookup) : false  #  inside isImmutablePropertySource method
         * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(source.getName())) : true  #  inside isImmutablePropertySource method
         * (source.getSource() == System.getenv()) : false  #  inside isImmutablePropertySource method
         * (!isImmutablePropertySource()) : true  #  inside getConfigurationPropertyNames method
         * (for-each(candidates)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            Map<String, String> stringStringMap = new HashMap<>();
            doReturn(stringStringMap).when(mapSourceMock).getSource();
            doReturn("systemEnvironment").when(mapSourceMock).getName();
            doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
            doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
            _assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
            SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
            doReturn("systemEnvironment").when(enumerablePropertySourceMock).getName();
            Object object = new Object();
            doReturn(object).when(enumerablePropertySourceMock).getSource();
            doReturn(enumerablePropertySourceMock, enumerablePropertySourceMock2).when(target).getPropertySource();
            String[] stringArray = new String[] {};
            doReturn(stringArray).when(enumerablePropertySourceMock2).getPropertyNames();
            //Act Statement(s)
            ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyNameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(ConfigurationPropertyState.ABSENT));
                verify(mapSourceMock, times(3)).getSource();
                verify(mapSourceMock, atLeast(1)).getName();
                verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
                verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
                _assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
                verify(target, times(2)).getPropertySource();
                verify(enumerablePropertySourceMock, atLeast(1)).getName();
                verify(enumerablePropertySourceMock, atLeast(1)).getSource();
                verify(enumerablePropertySourceMock2, atLeast(1)).getPropertyNames();
            });
        }
    }

    //Sapient generated method id: ${containsDescendantOfWhenThisAncestorOfCheckTestNameCandidate}, hash: 7042432D5F660814760F3D0E5461FBC5
    @Disabled()
    @Test()
    void containsDescendantOfWhenThisAncestorOfCheckTestNameCandidate() {
        /* Branches:
         * (underlyingSource instanceof Random) : false  #  inside containsDescendantOf method
         * (underlyingSource instanceof PropertySource<?> underlyingPropertySource) : false  #  inside containsDescendantOf method
         * (result != ConfigurationPropertyState.UNKNOWN) : false
         * (this.ancestorOfCheck == PropertyMapper.DEFAULT_ANCESTOR_OF_CHECK) : false
         * (source instanceof OriginLookup) : false  #  inside isImmutablePropertySource method
         * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(source.getName())) : true  #  inside isImmutablePropertySource method
         * (source.getSource() == System.getenv()) : true  #  inside isImmutablePropertySource method
         * (!isImmutablePropertySource()) : false  #  inside getConfigurationPropertyNames method
         * (configurationPropertyNames == null) : true  #  inside getConfigurationPropertyNames method
         * (for-each(candidates)) : true
         * (candidate != null) : true
         * (this.ancestorOfCheck.test(name, candidate)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            Map<String, String> stringStringMap = new HashMap<>();
            doReturn(stringStringMap).when(mapSourceMock).getSource();
            doReturn("systemEnvironment").when(mapSourceMock).getName();
            doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
            doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
            _assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
            SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
            doReturn("systemEnvironment").when(enumerablePropertySourceMock).getName();
            Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("PATH", "/usr/bin:/bin:/usr/sbin:/sbin"), entry("__CFBundleIdentifier", "com.jetbrains.intellij.ce"), entry("SSH_AUTH_SOCK", "/private/tmp/com.apple.launchd.3aGiD7YEVS/Listeners"), entry("XPC_FLAGS", "0x0"), entry("SHELL", "/bin/zsh"), entry("__CF_USER_TEXT_ENCODING", "0x1F5:0x0:0x0"), entry("LOGNAME", "bhuvan"), entry("XPC_SERVICE_NAME", "application.com.jetbrains.intellij.ce.7960374.7961073"), entry("USER", "bhuvan"), entry("HOME", "/Users/bhuvan"), entry("TMPDIR", "/var/folders/23/6wlpx0js4c9b9z51m_1txb780000gn/T/"), entry("COMMAND_MODE", "unix2003")));
            doReturn(stringStringMap2).when(enumerablePropertySourceMock).getSource();
            doReturn(enumerablePropertySourceMock, enumerablePropertySourceMock2).when(target).getPropertySource();
            String[] stringArray = new String[] {};
            doReturn(stringArray).when(enumerablePropertySourceMock2).getPropertyNames();
            //Act Statement(s)
            ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyNameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(ConfigurationPropertyState.PRESENT));
                verify(mapSourceMock, times(3)).getSource();
                verify(mapSourceMock, atLeast(1)).getName();
                verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
                verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
                _assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
                verify(target, times(2)).getPropertySource();
                verify(enumerablePropertySourceMock, atLeast(1)).getName();
                verify(enumerablePropertySourceMock, atLeast(1)).getSource();
                verify(enumerablePropertySourceMock2, atLeast(1)).getPropertyNames();
            });
        }
    }

    //Sapient generated method id: ${containsDescendantOfWhenThisAncestorOfCheckNotTestNameCandidate}, hash: FB5E0AA49E1A173ADE1872D72823985E
    @Disabled()
    @Test()
    void containsDescendantOfWhenThisAncestorOfCheckNotTestNameCandidate() {
        /* Branches:
         * (underlyingSource instanceof Random) : false  #  inside containsDescendantOf method
         * (underlyingSource instanceof PropertySource<?> underlyingPropertySource) : false  #  inside containsDescendantOf method
         * (result != ConfigurationPropertyState.UNKNOWN) : false
         * (this.ancestorOfCheck == PropertyMapper.DEFAULT_ANCESTOR_OF_CHECK) : false
         * (source instanceof OriginLookup) : false  #  inside isImmutablePropertySource method
         * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(source.getName())) : true  #  inside isImmutablePropertySource method
         * (source.getSource() == System.getenv()) : true  #  inside isImmutablePropertySource method
         * (!isImmutablePropertySource()) : false  #  inside getConfigurationPropertyNames method
         * (configurationPropertyNames == null) : true  #  inside getConfigurationPropertyNames method
         * (for-each(candidates)) : true
         * (candidate != null) : true
         * (this.ancestorOfCheck.test(name, candidate)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            Map<String, String> stringStringMap = new HashMap<>();
            doReturn(stringStringMap).when(mapSourceMock).getSource();
            doReturn("systemEnvironment").when(mapSourceMock).getName();
            doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
            doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
            _assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
            SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
            doReturn("systemEnvironment").when(enumerablePropertySourceMock).getName();
            Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("PATH", "/usr/bin:/bin:/usr/sbin:/sbin"), entry("__CFBundleIdentifier", "com.jetbrains.intellij.ce"), entry("SSH_AUTH_SOCK", "/private/tmp/com.apple.launchd.3aGiD7YEVS/Listeners"), entry("XPC_FLAGS", "0x0"), entry("SHELL", "/bin/zsh"), entry("__CF_USER_TEXT_ENCODING", "0x1F5:0x0:0x0"), entry("LOGNAME", "bhuvan"), entry("XPC_SERVICE_NAME", "application.com.jetbrains.intellij.ce.7960374.7961073"), entry("USER", "bhuvan"), entry("HOME", "/Users/bhuvan"), entry("TMPDIR", "/var/folders/23/6wlpx0js4c9b9z51m_1txb780000gn/T/"), entry("COMMAND_MODE", "unix2003")));
            doReturn(stringStringMap2).when(enumerablePropertySourceMock).getSource();
            doReturn(enumerablePropertySourceMock, enumerablePropertySourceMock2).when(target).getPropertySource();
            String[] stringArray = new String[] {};
            doReturn(stringArray).when(enumerablePropertySourceMock2).getPropertyNames();
            //Act Statement(s)
            ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyNameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(ConfigurationPropertyState.ABSENT));
                verify(mapSourceMock, times(3)).getSource();
                verify(mapSourceMock, atLeast(1)).getName();
                verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
                verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
                _assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
                verify(target, times(2)).getPropertySource();
                verify(enumerablePropertySourceMock, atLeast(1)).getName();
                verify(enumerablePropertySourceMock, atLeast(1)).getSource();
                verify(enumerablePropertySourceMock2, atLeast(1)).getPropertyNames();
            });
        }
    }

    //Sapient generated method id: ${getPropertySource1Test}, hash: 3B53EB451E993BF5F2EDC45B50E78F4E
    @Test()
    void getPropertySource1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            Map<String, String> stringStringMap = new HashMap<>();
            doReturn(stringStringMap).when(mapSourceMock).getSource();
            doReturn("systemEnvironment").when(mapSourceMock).getName();
            doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
            doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
            _assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
            SpringIterableConfigurationPropertySource target = new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray);
            //Act Statement(s)
            EnumerablePropertySource<?> result = target.getPropertySource();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(mapSourceMock));
                verify(mapSourceMock, atLeast(2)).getSource();
                verify(mapSourceMock, atLeast(1)).getName();
                verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
                verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
                _assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
            });
        }
    }
}
