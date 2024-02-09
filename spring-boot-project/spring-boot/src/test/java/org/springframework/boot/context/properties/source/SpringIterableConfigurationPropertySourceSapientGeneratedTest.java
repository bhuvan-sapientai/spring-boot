package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.util.Assert;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

import org.springframework.core.env.EnumerablePropertySource;

import org.mockito.stubbing.Answer;

import org.springframework.boot.origin.Origin;

import java.util.Iterator;
import java.util.stream.Stream;

import org.springframework.boot.origin.PropertySourceOrigin;

import org.mockito.MockedStatic;

import org.springframework.core.env.MapPropertySource;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
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

	private final ConfigurationProperty configurationPropertyMock = mock(ConfigurationProperty.class);

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final ConfigurationPropertyName configurationPropertyNameMock2 = mock(ConfigurationPropertyName.class);

	private final EnumerablePropertySource<?> enumerablePropertySourceMock = mock(EnumerablePropertySource.class);

	private final EnumerablePropertySource<?> enumerablePropertySourceMock2 = mock(EnumerablePropertySource.class);

	private final MapPropertySource mapSourceMock = mock(MapPropertySource.class);

	private final Origin originMock = mock(Origin.class);

	private final Origin originMock2 = mock(Origin.class);

	private final Origin originMock3 = mock(Origin.class);

	private final PropertyMapper propertyMapperMock = mock(PropertyMapper.class);

	private final PropertyMapper propertyMapperMock2 = mock(PropertyMapper.class);

	//Sapient generated method id: ${ee2e73e4-ef45-316b-bf2a-4acf0f0898a5}
	@Test()
	void getCachingTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
    Map map = new HashMap<>();
    doReturn(map).when(mapSourceMock).getSource();
    doReturn("String").when(mapSourceMock).getName();
    //TODO: Needs to return real value
    doReturn(null).when(propertyMapperMock).getAncestorOfCheck();
    //TODO: Needs to return real value
    doReturn(null).when(propertyMapperMock2).getAncestorOfCheck();
    _assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
    SpringIterableConfigurationPropertySource target = new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray);
    //Act Statement(s)
    ConfigurationPropertyCaching result = target.getCaching();
    SoftReferenceConfigurationPropertyCache<SpringIterableConfigurationPropertySource.Mappings> softReferenceConfigurationPropertyCache = new SoftReferenceConfigurationPropertyCache<>(false);
    //Assert statement(s)
    //TODO: Please implement equals method in SoftReferenceConfigurationPropertyCache for verification to succeed or you need to adjust respective assertion statements
    assertAll("result", () -> {
        assertThat(result, equalTo(softReferenceConfigurationPropertyCache));
        verify(mapSourceMock, atLeast(1)).getSource();
        verify(mapSourceMock, atLeast(1)).getName();
        verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
        verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
        _assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${b9f4539f-22c1-3b32-b0e6-3ab60afe5a86}
	@Test()
	void getConfigurationPropertyWhenNameIsNull() {
		/* Branches:
		 * (name == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
    Map map = new HashMap<>();
    doReturn(map).when(mapSourceMock).getSource();
    doReturn("").when(mapSourceMock).getName();
    //TODO: Needs to return real value
    doReturn(null).when(propertyMapperMock).getAncestorOfCheck();
    //TODO: Needs to return real value
    doReturn(null).when(propertyMapperMock2).getAncestorOfCheck();
    _assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
    SpringIterableConfigurationPropertySource target = new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray);
    ConfigurationPropertyName configurationPropertyName = null;
    //Act Statement(s)
    ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyName);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(nullValue()));
        verify(mapSourceMock, atLeast(1)).getSource();
        verify(mapSourceMock, atLeast(1)).getName();
        verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
        verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
        _assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${87d2c1c5-91e5-3fb5-83d2-294d6c587a4a}
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
		//Origin originMock = mock(Origin.class, "ConfigurationProperty");
        /*try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
    MockedStatic<PropertySourceOrigin> propertySourceOrigin = mockStatic(PropertySourceOrigin.class);
    MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
    Map map = new HashMap<>();
    doReturn(map).when(mapSourceMock).getSource();
    doReturn("String").when(mapSourceMock).getName();
    Object object = new Object();
    doReturn(object).when(mapSourceMock).getProperty("List<String>");
    //TODO: Needs to return real value
    doReturn(null).when(propertyMapperMock).getAncestorOfCheck();
    List<String> stringList = new ArrayList<>();
    stringList.add("List<String>");
    doReturn(stringList).when(propertyMapperMock).map(configurationPropertyNameMock);
    //TODO: Needs to return real value
    doReturn(null).when(propertyMapperMock2).getAncestorOfCheck();
    _assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    propertySourceOrigin.when(() -> PropertySourceOrigin.get(mapSourceMock, "List<String>")).thenReturn(originMock);
    PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
    SpringIterableConfigurationPropertySource target = new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray);
    Object object2 = new Object();
    ConfigurationProperty configurationProperty2 = new ConfigurationProperty(configurationPropertyNameMock2, object2, originMock2);
    configurationProperty.when(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock)).thenReturn(configurationProperty2);
    //Act Statement(s)
    ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, equalTo(configurationProperty2));
        verify(mapSourceMock, atLeast(1)).getSource();
        verify(mapSourceMock, atLeast(1)).getName();
        verify(mapSourceMock, atLeast(1)).getProperty("List<String>");
        verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
        verify(propertyMapperMock, atLeast(1)).map(configurationPropertyNameMock);
        verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
        _assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
        propertySourceOrigin.verify(() -> PropertySourceOrigin.get(mapSourceMock, "List<String>"), atLeast(1));
        configurationProperty.verify(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${9fc1eebb-964a-3d08-9dbf-f24b53dfd687}
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
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
    Map<String, String> stringStringMap = new HashMap<>();
    doReturn(stringStringMap).when(mapSourceMock).getSource();
    doReturn("systemEnvironment").when(mapSourceMock).getName();
    doReturn(null).when(mapSourceMock).getProperty("return_of_mapItem1");
    //TODO: Needs to return real value
    doReturn(null).when(propertyMapperMock).getAncestorOfCheck();
    List<String> stringList = new ArrayList<>();
    stringList.add("return_of_mapItem1");
    doReturn(stringList).when(propertyMapperMock).map(configurationPropertyNameMock);
    //TODO: Needs to return real value
    doReturn(null).when(propertyMapperMock2).getAncestorOfCheck();
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
}*/
	}

	//Sapient generated method id: ${57054a1e-10ca-3fbe-8b8c-9d6a45d7edfc}
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
		//Origin originMock2 = mock(Origin.class, "Object");
        /*try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
    MockedStatic<PropertySourceOrigin> propertySourceOrigin = mockStatic(PropertySourceOrigin.class);
    MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
    Map map = new HashMap<>();
    doReturn(map).when(mapSourceMock).getSource();
    doReturn("void").when(mapSourceMock).getName();
    Object object = new Object();
    doReturn(object).when(mapSourceMock).getProperty("List<String>");
    //TODO: Needs to return real value
    doReturn(null).when(propertyMapperMock).getAncestorOfCheck();
    List<String> stringList = new ArrayList<>();
    stringList.add("List<String>");
    doReturn(stringList).when(propertyMapperMock).map(configurationPropertyNameMock);
    //TODO: Needs to return real value
    doReturn(null).when(propertyMapperMock2).getAncestorOfCheck();
    _assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    propertySourceOrigin.when(() -> PropertySourceOrigin.get(mapSourceMock, "List<String>")).thenReturn(originMock);
    propertySourceOrigin.when(() -> PropertySourceOrigin.get(enumerablePropertySourceMock, "arg0")).thenReturn(originMock2);
    PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
    SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
    configurationProperty.when(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock)).thenReturn(null);
    Object object2 = new Object();
    doReturn(object2).when(enumerablePropertySourceMock2).getProperty("arg0");
    doReturn(enumerablePropertySourceMock2, enumerablePropertySourceMock).when(target).getPropertySource();
    Object object3 = new Object();
    ConfigurationProperty configurationProperty2 = new ConfigurationProperty(configurationPropertyNameMock2, object3, originMock3);
    configurationProperty.when(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object2, originMock2)).thenReturn(configurationProperty2);
    //Act Statement(s)
    ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, equalTo(configurationProperty2));
        verify(mapSourceMock, atLeast(1)).getSource();
        verify(mapSourceMock, atLeast(1)).getName();
        verify(mapSourceMock, atLeast(1)).getProperty("List<String>");
        verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
        verify(propertyMapperMock, atLeast(1)).map(configurationPropertyNameMock);
        verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
        _assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
        propertySourceOrigin.verify(() -> PropertySourceOrigin.get(mapSourceMock, "List<String>"), atLeast(1));
        propertySourceOrigin.verify(() -> PropertySourceOrigin.get(enumerablePropertySourceMock, "arg0"), atLeast(1));
        configurationProperty.verify(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock), atLeast(1));
        verify(target, times(2)).getPropertySource();
        verify(enumerablePropertySourceMock2, atLeast(1)).getProperty("arg0");
        configurationProperty.verify(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object2, originMock2), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${e893205b-f056-31da-9a8b-883b9fa7b02b}
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
		//Origin originMock = mock(Origin.class, "Origin");
        /*try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
    MockedStatic<PropertySourceOrigin> propertySourceOrigin = mockStatic(PropertySourceOrigin.class);
    MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
    Map map = new HashMap<>();
    doReturn(map).when(mapSourceMock).getSource();
    doReturn("String").when(mapSourceMock).getName();
    Object object = new Object();
    doReturn(object).when(mapSourceMock).getProperty("List<String>");
    //TODO: Needs to return real value
    doReturn(null).when(propertyMapperMock).getAncestorOfCheck();
    List<String> stringList = new ArrayList<>();
    stringList.add("List<String>");
    doReturn(stringList).when(propertyMapperMock).map(configurationPropertyNameMock);
    //TODO: Needs to return real value
    doReturn(null).when(propertyMapperMock2).getAncestorOfCheck();
    _assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    propertySourceOrigin.when(() -> PropertySourceOrigin.get(mapSourceMock, "List<String>")).thenReturn(originMock);
    PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
    SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
    configurationProperty.when(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock)).thenReturn(null);
    doReturn(enumerablePropertySourceMock).when(target).getPropertySource();
    doReturn(null).when(enumerablePropertySourceMock).getProperty("arg0");
    //Act Statement(s)
    ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(nullValue()));
        verify(mapSourceMock, atLeast(1)).getSource();
        verify(mapSourceMock, atLeast(1)).getName();
        verify(mapSourceMock, atLeast(1)).getProperty("List<String>");
        verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
        verify(propertyMapperMock, atLeast(1)).map(configurationPropertyNameMock);
        verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
        _assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
        propertySourceOrigin.verify(() -> PropertySourceOrigin.get(mapSourceMock, "List<String>"), atLeast(1));
        configurationProperty.verify(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock), atLeast(1));
        verify(target, atLeast(1)).getPropertySource();
        verify(enumerablePropertySourceMock, atLeast(1)).getProperty("arg0");
    });
}*/
	}

	//Sapient generated method id: ${e105d3be-5472-393b-b059-b658a063d376}
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
		//Origin originMock2 = mock(Origin.class, "ConfigurationPropertyName");
		//ConfigurationProperty configurationPropertyMock2 = mock(ConfigurationProperty.class);
		//ConfigurationProperty configurationPropertyMock3 = mock(ConfigurationProperty.class);
        /*try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
    MockedStatic<PropertySourceOrigin> propertySourceOrigin = mockStatic(PropertySourceOrigin.class);
    MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
    Map map = new HashMap<>();
    doReturn(map).when(mapSourceMock).getSource();
    doReturn("ConfigurationPropertyName").when(mapSourceMock).getName();
    Object object = new Object();
    doReturn(object).when(mapSourceMock).getProperty("PropertyMapper[]");
    Object object2 = new Object();
    doReturn(object2).when(mapSourceMock).getProperty("return_of_mapItem1");
    //TODO: Needs to return real value
    doReturn(null).when(propertyMapperMock).getAncestorOfCheck();
    List<String> stringList = new ArrayList<>();
    stringList.add("PropertyMapper[]");
    doReturn(stringList).when(propertyMapperMock).map(configurationPropertyNameMock);
    //TODO: Needs to return real value
    doReturn(null).when(propertyMapperMock2).getAncestorOfCheck();
    List<String> stringList2 = new ArrayList<>();
    stringList2.add("return_of_mapItem1");
    doReturn(stringList2).when(propertyMapperMock2).map(configurationPropertyNameMock);
    _assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    propertySourceOrigin.when(() -> PropertySourceOrigin.get(mapSourceMock, "PropertyMapper[]")).thenReturn(originMock);
    propertySourceOrigin.when(() -> PropertySourceOrigin.get(mapSourceMock, "return_of_mapItem1")).thenReturn(originMock2);
    propertySourceOrigin.when(() -> PropertySourceOrigin.get(enumerablePropertySourceMock, "arg0")).thenReturn(originMock3);
    PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
    SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
    configurationProperty.when(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock)).thenReturn(configurationPropertyMock);
    configurationProperty.when(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object2, originMock2)).thenReturn(configurationPropertyMock2);
    Object object3 = new Object();
    doReturn(object3).when(enumerablePropertySourceMock2).getProperty("arg0");
    doReturn(enumerablePropertySourceMock2, enumerablePropertySourceMock).when(target).getPropertySource();
    configurationProperty.when(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object3, originMock3)).thenReturn(configurationPropertyMock3);
    //Act Statement(s)
    ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, equalTo(configurationPropertyMock3));
        verify(mapSourceMock, atLeast(1)).getSource();
        verify(mapSourceMock, atLeast(1)).getName();
        verify(mapSourceMock, atLeast(1)).getProperty("PropertyMapper[]");
        verify(mapSourceMock, atLeast(1)).getProperty("return_of_mapItem1");
        verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
        verify(propertyMapperMock, atLeast(1)).map(configurationPropertyNameMock);
        verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
        verify(propertyMapperMock2, atLeast(1)).map(configurationPropertyNameMock);
        _assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
        propertySourceOrigin.verify(() -> PropertySourceOrigin.get(mapSourceMock, "PropertyMapper[]"), atLeast(1));
        propertySourceOrigin.verify(() -> PropertySourceOrigin.get(mapSourceMock, "return_of_mapItem1"), atLeast(1));
        propertySourceOrigin.verify(() -> PropertySourceOrigin.get(enumerablePropertySourceMock, "arg0"), atLeast(1));
        configurationProperty.verify(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock), atLeast(1));
        configurationProperty.verify(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object2, originMock2), atLeast(1));
        verify(target, times(2)).getPropertySource();
        verify(enumerablePropertySourceMock2, atLeast(1)).getProperty("arg0");
        configurationProperty.verify(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object3, originMock3), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${9050c48e-938a-32db-b9a6-0eb22f72c7dc}
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
		//Origin originMock = mock(Origin.class, "Object");
        /*try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
    MockedStatic<PropertySourceOrigin> propertySourceOrigin = mockStatic(PropertySourceOrigin.class);
    MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
    Map map = new HashMap<>();
    doReturn(map).when(mapSourceMock).getSource();
    doReturn("void").when(mapSourceMock).getName();
    Object object = new Object();
    doReturn(object).when(mapSourceMock).getProperty("List<String>");
    Object object2 = new Object();
    doReturn(object2).when(mapSourceMock).getProperty("return_of_mapItem1");
    //TODO: Needs to return real value
    doReturn(null).when(propertyMapperMock).getAncestorOfCheck();
    List<String> stringList = new ArrayList<>();
    stringList.add("List<String>");
    doReturn(stringList).when(propertyMapperMock).map(configurationPropertyNameMock);
    //TODO: Needs to return real value
    doReturn(null).when(propertyMapperMock2).getAncestorOfCheck();
    List<String> stringList2 = new ArrayList<>();
    stringList2.add("return_of_mapItem1");
    doReturn(stringList2).when(propertyMapperMock2).map(configurationPropertyNameMock);
    _assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    propertySourceOrigin.when(() -> PropertySourceOrigin.get(mapSourceMock, "List<String>")).thenReturn(originMock);
    propertySourceOrigin.when(() -> PropertySourceOrigin.get(mapSourceMock, "return_of_mapItem1")).thenReturn(originMock2);
    PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
    SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
    Object object3 = new Object();
    ConfigurationProperty configurationProperty2 = new ConfigurationProperty(configurationPropertyNameMock2, object3, originMock3);
    configurationProperty.when(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock)).thenReturn(configurationProperty2);
    configurationProperty.when(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object2, originMock2)).thenReturn(configurationPropertyMock);
    doReturn(enumerablePropertySourceMock).when(target).getPropertySource();
    doReturn(null).when(enumerablePropertySourceMock).getProperty("arg0");
    //Act Statement(s)
    ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(nullValue()));
        verify(mapSourceMock, atLeast(1)).getSource();
        verify(mapSourceMock, atLeast(1)).getName();
        verify(mapSourceMock, atLeast(1)).getProperty("List<String>");
        verify(mapSourceMock, atLeast(1)).getProperty("return_of_mapItem1");
        verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
        verify(propertyMapperMock, atLeast(1)).map(configurationPropertyNameMock);
        verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
        verify(propertyMapperMock2, atLeast(1)).map(configurationPropertyNameMock);
        _assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
        propertySourceOrigin.verify(() -> PropertySourceOrigin.get(mapSourceMock, "List<String>"), atLeast(1));
        propertySourceOrigin.verify(() -> PropertySourceOrigin.get(mapSourceMock, "return_of_mapItem1"), atLeast(1));
        configurationProperty.verify(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock), atLeast(1));
        configurationProperty.verify(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object2, originMock2), atLeast(1));
        verify(target, atLeast(1)).getPropertySource();
        verify(enumerablePropertySourceMock, atLeast(1)).getProperty("arg0");
    });
}*/
	}

	//Sapient generated method id: ${d3831c55-97fb-36f6-9e97-7248c23be7cc}
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
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
    Map<String, String> stringStringMap = new HashMap<>();
    doReturn(stringStringMap).when(mapSourceMock).getSource();
    doReturn("systemEnvironment").when(mapSourceMock).getName();
    //TODO: Needs to return real value
    doReturn(null).when(propertyMapperMock).getAncestorOfCheck();
    //TODO: Needs to return real value
    doReturn(null).when(propertyMapperMock2).getAncestorOfCheck();
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
        assertThat(result, is(nullValue()));
        verify(mapSourceMock, times(2)).getSource();
        verify(mapSourceMock, atLeast(1)).getName();
        verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
        verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
        _assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
        verify(target, times(2)).getPropertySource();
        verify(enumerablePropertySourceMock, atLeast(1)).getName();
        verify(enumerablePropertySourceMock2, atLeast(1)).getPropertyNames();
    });
}*/
	}

	//Sapient generated method id: ${f2c28042-b6a8-3d46-a8a9-732e5704ff04}
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
			//TODO: Needs to return real value
			doReturn(null).when(propertyMapperMock).getAncestorOfCheck();
			//TODO: Needs to return real value
			doReturn(null).when(propertyMapperMock2).getAncestorOfCheck();
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
				assertThat(result, is(nullValue()));
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

	//Sapient generated method id: ${15837300-d633-3fc1-8480-7507eacca3a1}
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
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
    Map<String, String> stringStringMap = new HashMap<>();
    doReturn(stringStringMap).when(mapSourceMock).getSource();
    doReturn("systemEnvironment").when(mapSourceMock).getName();
    //TODO: Needs to return real value
    doReturn(null).when(propertyMapperMock).getAncestorOfCheck();
    //TODO: Needs to return real value
    doReturn(null).when(propertyMapperMock2).getAncestorOfCheck();
    _assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
    SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
    doReturn("systemEnvironment").when(enumerablePropertySourceMock).getName();
    Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("PATH", "/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:/snap/bin"), entry("XAUTHORITY", "/home/bhuvan/.Xauthority"), entry("INVOCATION_ID", "d1f9adf08e2d4b229e6927e6252607c3"), entry("XMODIFIERS", "@im=ibus"), entry("XDG_DATA_DIRS", "/usr/share/gnome:/usr/local/share:/usr/share:/var/lib/snapd/desktop"), entry("SNAP_COMMON", "/var/snap/intellij-idea-community/common"), entry("SNAP_INSTANCE_KEY", ""), entry("SNAP_USER_COMMON", "/home/bhuvan/snap/intellij-idea-community/common"), entry("DBUS_SESSION_BUS_ADDRESS", "unix:path=/run/user/1003/bus"), entry("SNAP_REVISION", "450"), entry("XDG_CURRENT_DESKTOP", "GNOME"), entry("JOURNAL_STREAM", "8:34217"), entry("LD_LIBRARY_PATH", "/usr/lib/mesa-diverted/x86_64-linux-gnu:/usr/lib/x86_64-linux-gnu/mesa:/usr/lib/x86_64-linux-gnu/dri:/usr/lib/x86_64-linux-gnu/gallium-pipe"), entry("CHROME_REMOTE_DESKTOP_SESSION", "1"), entry("SESSION_MANAGER", "local/ubuntu-automation-desktop-2:@/tmp/.ICE-unix/1431,unix/ubuntu-automation-desktop-2:/tmp/.ICE-unix/1431"), entry("LOGNAME", "bhuvan"), entry("PWD", "/home/bhuvan"), entry("MANAGERPID", "914"), entry("IM_CONFIG_PHASE", "1"), entry("SNAP_UID", "1003"), entry("GJS_DEBUG_TOPICS", "JS ERROR;JS LOG"), entry("SHELL", "/bin/bash"), entry("PULSE_STATE_PATH", "/run/user/1003/crd_audio#eiUrr_sa8I"), entry("GIO_LAUNCHED_DESKTOP_FILE", "/var/lib/snapd/desktop/applications/intellij-idea-community_intellij-idea-community.desktop"), entry("BAMF_DESKTOP_FILE_HINT", "/var/lib/snapd/desktop/applications/intellij-idea-community_intellij-idea-community.desktop"), entry("GNOME_DESKTOP_SESSION_ID", "this-is-deprecated"), entry("GTK_MODULES", "gail:atk-bridge"), entry("SNAP_ARCH", "amd64"), entry("SNAP_LIBRARY_PATH", "/var/lib/snapd/lib/gl:/var/lib/snapd/lib/gl32:/var/lib/snapd/void"), entry("SHLVL", "0"), entry("SNAP_EUID", "1003"), entry("SNAP_NAME", "intellij-idea-community"), entry("QT_IM_MODULE", "ibus"), entry("PULSE_RUNTIME_PATH", "/run/user/1003/crd_audio#eiUrr_sa8I"), entry("TERM", "vt220"), entry("LANG", "C.UTF-8"), entry("SNAP_INSTANCE_NAME", "intellij-idea-community"), entry("XDG_SESSION_TYPE", "x11"), entry("PULSE_CONFIG_PATH", "/run/user/1003/crd_audio#eiUrr_sa8I"), entry("SNAP_USER_DATA", "/home/bhuvan/snap/intellij-idea-community/450"), entry("DISPLAY", ":20"), entry("PULSE_SINK", "chrome_remote_desktop_session"), entry("SNAP_REEXEC", ""), entry("SNAP_VERSION", "2023.1.5"), entry("XDG_SESSION_CLASS", "user"), entry("SNAP_DATA", "/var/snap/intellij-idea-community/450"), entry("GDK_BACKEND", "x11"), entry("GPG_AGENT_INFO", "/run/user/1003/gnupg/S.gpg-agent:0:1"), entry("SNAP", "/snap/intellij-idea-community/450"), entry("USER", "bhuvan"), entry("SNAP_REAL_HOME", "/home/bhuvan"), entry("DESKTOP_STARTUP_ID", "IDEA-restart_TIME197581888"), entry("XDG_MENU_PREFIX", "gnome-"), entry("GIO_LAUNCHED_DESKTOP_FILE_PID", "40909"), entry("QT_ACCESSIBILITY", "1"), entry("GJS_DEBUG_OUTPUT", "stderr"), entry("SSH_AUTH_SOCK", "/run/user/1003/keyring/ssh"), entry("SNAP_CONTEXT", "MpTSF0iAyzNQlkF5VGONVjLyoi2NZfsmvXNOB0uOpen9M8g06azK"), entry("XDG_RUNTIME_DIR", "/run/user/1003"), entry("SNAP_COOKIE", "MpTSF0iAyzNQlkF5VGONVjLyoi2NZfsmvXNOB0uOpen9M8g06azK"), entry("HOME", "/home/bhuvan")));
    doReturn(stringStringMap2).when(enumerablePropertySourceMock).getSource();
    doReturn(enumerablePropertySourceMock, enumerablePropertySourceMock2).when(target).getPropertySource();
    String[] stringArray = new String[] {};
    doReturn(stringArray).when(enumerablePropertySourceMock2).getPropertyNames();
    //Act Statement(s)
    Stream<ConfigurationPropertyName> result = target.stream();
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(nullValue()));
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
}*/
	}

	//Sapient generated method id: ${cf8a5d39-ae43-3644-96ff-2e7c71af28b9}
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
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
    Map<String, String> stringStringMap = new HashMap<>();
    doReturn(stringStringMap).when(mapSourceMock).getSource();
    doReturn("systemEnvironment").when(mapSourceMock).getName();
    //TODO: Needs to return real value
    doReturn(null).when(propertyMapperMock).getAncestorOfCheck();
    //TODO: Needs to return real value
    doReturn(null).when(propertyMapperMock2).getAncestorOfCheck();
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
}*/
	}

	//Sapient generated method id: ${989baa53-a8dd-3271-a5f1-93759b7cded4}
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
			//TODO: Needs to return real value
			doReturn(null).when(propertyMapperMock).getAncestorOfCheck();
			//TODO: Needs to return real value
			doReturn(null).when(propertyMapperMock2).getAncestorOfCheck();
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

	//Sapient generated method id: ${29532aaf-aa83-3bbc-bab1-a7aa401044f9}
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
			//TODO: Needs to return real value
			doReturn(null).when(propertyMapperMock).getAncestorOfCheck();
			//TODO: Needs to return real value
			doReturn(null).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
			doReturn("systemEnvironment").when(enumerablePropertySourceMock).getName();
			Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("PATH", "/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:/snap/bin"), entry("XAUTHORITY", "/home/bhuvan/.Xauthority"), entry("INVOCATION_ID", "d1f9adf08e2d4b229e6927e6252607c3"), entry("XMODIFIERS", "@im=ibus"), entry("XDG_DATA_DIRS", "/usr/share/gnome:/usr/local/share:/usr/share:/var/lib/snapd/desktop"), entry("SNAP_COMMON", "/var/snap/intellij-idea-community/common"), entry("SNAP_INSTANCE_KEY", ""), entry("SNAP_USER_COMMON", "/home/bhuvan/snap/intellij-idea-community/common"), entry("DBUS_SESSION_BUS_ADDRESS", "unix:path=/run/user/1003/bus"), entry("SNAP_REVISION", "450"), entry("XDG_CURRENT_DESKTOP", "GNOME"), entry("JOURNAL_STREAM", "8:34217"), entry("LD_LIBRARY_PATH", "/usr/lib/mesa-diverted/x86_64-linux-gnu:/usr/lib/x86_64-linux-gnu/mesa:/usr/lib/x86_64-linux-gnu/dri:/usr/lib/x86_64-linux-gnu/gallium-pipe"), entry("CHROME_REMOTE_DESKTOP_SESSION", "1"), entry("SESSION_MANAGER", "local/ubuntu-automation-desktop-2:@/tmp/.ICE-unix/1431,unix/ubuntu-automation-desktop-2:/tmp/.ICE-unix/1431"), entry("LOGNAME", "bhuvan"), entry("PWD", "/home/bhuvan"), entry("MANAGERPID", "914"), entry("IM_CONFIG_PHASE", "1"), entry("SNAP_UID", "1003"), entry("GJS_DEBUG_TOPICS", "JS ERROR;JS LOG"), entry("SHELL", "/bin/bash"), entry("PULSE_STATE_PATH", "/run/user/1003/crd_audio#eiUrr_sa8I"), entry("GIO_LAUNCHED_DESKTOP_FILE", "/var/lib/snapd/desktop/applications/intellij-idea-community_intellij-idea-community.desktop"), entry("BAMF_DESKTOP_FILE_HINT", "/var/lib/snapd/desktop/applications/intellij-idea-community_intellij-idea-community.desktop"), entry("GNOME_DESKTOP_SESSION_ID", "this-is-deprecated"), entry("GTK_MODULES", "gail:atk-bridge"), entry("SNAP_ARCH", "amd64"), entry("SNAP_LIBRARY_PATH", "/var/lib/snapd/lib/gl:/var/lib/snapd/lib/gl32:/var/lib/snapd/void"), entry("SHLVL", "0"), entry("SNAP_EUID", "1003"), entry("SNAP_NAME", "intellij-idea-community"), entry("QT_IM_MODULE", "ibus"), entry("PULSE_RUNTIME_PATH", "/run/user/1003/crd_audio#eiUrr_sa8I"), entry("TERM", "vt220"), entry("LANG", "C.UTF-8"), entry("SNAP_INSTANCE_NAME", "intellij-idea-community"), entry("XDG_SESSION_TYPE", "x11"), entry("PULSE_CONFIG_PATH", "/run/user/1003/crd_audio#eiUrr_sa8I"), entry("SNAP_USER_DATA", "/home/bhuvan/snap/intellij-idea-community/450"), entry("DISPLAY", ":20"), entry("PULSE_SINK", "chrome_remote_desktop_session"), entry("SNAP_REEXEC", ""), entry("SNAP_VERSION", "2023.1.5"), entry("XDG_SESSION_CLASS", "user"), entry("SNAP_DATA", "/var/snap/intellij-idea-community/450"), entry("GDK_BACKEND", "x11"), entry("GPG_AGENT_INFO", "/run/user/1003/gnupg/S.gpg-agent:0:1"), entry("SNAP", "/snap/intellij-idea-community/450"), entry("USER", "bhuvan"), entry("SNAP_REAL_HOME", "/home/bhuvan"), entry("DESKTOP_STARTUP_ID", "IDEA-restart_TIME197581888"), entry("XDG_MENU_PREFIX", "gnome-"), entry("GIO_LAUNCHED_DESKTOP_FILE_PID", "40909"), entry("QT_ACCESSIBILITY", "1"), entry("GJS_DEBUG_OUTPUT", "stderr"), entry("SSH_AUTH_SOCK", "/run/user/1003/keyring/ssh"), entry("SNAP_CONTEXT", "MpTSF0iAyzNQlkF5VGONVjLyoi2NZfsmvXNOB0uOpen9M8g06azK"), entry("XDG_RUNTIME_DIR", "/run/user/1003"), entry("SNAP_COOKIE", "MpTSF0iAyzNQlkF5VGONVjLyoi2NZfsmvXNOB0uOpen9M8g06azK"), entry("HOME", "/home/bhuvan")));
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

	//Sapient generated method id: ${182a0c69-945f-3716-a1d7-c802b7e83095}
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
			//TODO: Needs to return real value
			doReturn(null).when(propertyMapperMock).getAncestorOfCheck();
			//TODO: Needs to return real value
			doReturn(null).when(propertyMapperMock2).getAncestorOfCheck();
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

	//Sapient generated method id: ${04a7e493-84fd-3b5a-b0f4-78402cbdf3a6}
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
			//TODO: Needs to return real value
			doReturn(null).when(propertyMapperMock).getAncestorOfCheck();
			//TODO: Needs to return real value
			doReturn(null).when(propertyMapperMock2).getAncestorOfCheck();
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

	//Sapient generated method id: ${79f37c4e-7f19-31d8-9bf6-e72a79eac3ec}
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
			//TODO: Needs to return real value
			doReturn(null).when(propertyMapperMock).getAncestorOfCheck();
			//TODO: Needs to return real value
			doReturn(null).when(propertyMapperMock2).getAncestorOfCheck();
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

	//Sapient generated method id: ${9fb0ca08-ed2e-31c2-a1d9-0392e69db412}
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
			//TODO: Needs to return real value
			doReturn(null).when(propertyMapperMock).getAncestorOfCheck();
			//TODO: Needs to return real value
			doReturn(null).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
			doReturn("systemEnvironment").when(enumerablePropertySourceMock).getName();
			Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("PATH", "/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:/snap/bin"), entry("XAUTHORITY", "/home/bhuvan/.Xauthority"), entry("INVOCATION_ID", "d1f9adf08e2d4b229e6927e6252607c3"), entry("XMODIFIERS", "@im=ibus"), entry("XDG_DATA_DIRS", "/usr/share/gnome:/usr/local/share:/usr/share:/var/lib/snapd/desktop"), entry("SNAP_COMMON", "/var/snap/intellij-idea-community/common"), entry("SNAP_INSTANCE_KEY", ""), entry("SNAP_USER_COMMON", "/home/bhuvan/snap/intellij-idea-community/common"), entry("DBUS_SESSION_BUS_ADDRESS", "unix:path=/run/user/1003/bus"), entry("SNAP_REVISION", "450"), entry("XDG_CURRENT_DESKTOP", "GNOME"), entry("JOURNAL_STREAM", "8:34217"), entry("LD_LIBRARY_PATH", "/usr/lib/mesa-diverted/x86_64-linux-gnu:/usr/lib/x86_64-linux-gnu/mesa:/usr/lib/x86_64-linux-gnu/dri:/usr/lib/x86_64-linux-gnu/gallium-pipe"), entry("CHROME_REMOTE_DESKTOP_SESSION", "1"), entry("SESSION_MANAGER", "local/ubuntu-automation-desktop-2:@/tmp/.ICE-unix/1431,unix/ubuntu-automation-desktop-2:/tmp/.ICE-unix/1431"), entry("LOGNAME", "bhuvan"), entry("PWD", "/home/bhuvan"), entry("MANAGERPID", "914"), entry("IM_CONFIG_PHASE", "1"), entry("SNAP_UID", "1003"), entry("GJS_DEBUG_TOPICS", "JS ERROR;JS LOG"), entry("SHELL", "/bin/bash"), entry("PULSE_STATE_PATH", "/run/user/1003/crd_audio#eiUrr_sa8I"), entry("GIO_LAUNCHED_DESKTOP_FILE", "/var/lib/snapd/desktop/applications/intellij-idea-community_intellij-idea-community.desktop"), entry("BAMF_DESKTOP_FILE_HINT", "/var/lib/snapd/desktop/applications/intellij-idea-community_intellij-idea-community.desktop"), entry("GNOME_DESKTOP_SESSION_ID", "this-is-deprecated"), entry("GTK_MODULES", "gail:atk-bridge"), entry("SNAP_ARCH", "amd64"), entry("SNAP_LIBRARY_PATH", "/var/lib/snapd/lib/gl:/var/lib/snapd/lib/gl32:/var/lib/snapd/void"), entry("SHLVL", "0"), entry("SNAP_EUID", "1003"), entry("SNAP_NAME", "intellij-idea-community"), entry("QT_IM_MODULE", "ibus"), entry("PULSE_RUNTIME_PATH", "/run/user/1003/crd_audio#eiUrr_sa8I"), entry("TERM", "vt220"), entry("LANG", "C.UTF-8"), entry("SNAP_INSTANCE_NAME", "intellij-idea-community"), entry("XDG_SESSION_TYPE", "x11"), entry("PULSE_CONFIG_PATH", "/run/user/1003/crd_audio#eiUrr_sa8I"), entry("SNAP_USER_DATA", "/home/bhuvan/snap/intellij-idea-community/450"), entry("DISPLAY", ":20"), entry("PULSE_SINK", "chrome_remote_desktop_session"), entry("SNAP_REEXEC", ""), entry("SNAP_VERSION", "2023.1.5"), entry("XDG_SESSION_CLASS", "user"), entry("SNAP_DATA", "/var/snap/intellij-idea-community/450"), entry("GDK_BACKEND", "x11"), entry("GPG_AGENT_INFO", "/run/user/1003/gnupg/S.gpg-agent:0:1"), entry("SNAP", "/snap/intellij-idea-community/450"), entry("USER", "bhuvan"), entry("SNAP_REAL_HOME", "/home/bhuvan"), entry("DESKTOP_STARTUP_ID", "IDEA-restart_TIME197581888"), entry("XDG_MENU_PREFIX", "gnome-"), entry("GIO_LAUNCHED_DESKTOP_FILE_PID", "40909"), entry("QT_ACCESSIBILITY", "1"), entry("GJS_DEBUG_OUTPUT", "stderr"), entry("SSH_AUTH_SOCK", "/run/user/1003/keyring/ssh"), entry("SNAP_CONTEXT", "MpTSF0iAyzNQlkF5VGONVjLyoi2NZfsmvXNOB0uOpen9M8g06azK"), entry("XDG_RUNTIME_DIR", "/run/user/1003"), entry("SNAP_COOKIE", "MpTSF0iAyzNQlkF5VGONVjLyoi2NZfsmvXNOB0uOpen9M8g06azK"), entry("HOME", "/home/bhuvan")));
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

	//Sapient generated method id: ${4739748f-ab7f-3670-b7b9-3d8a3e4f2a31}
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
			//TODO: Needs to return real value
			doReturn(null).when(propertyMapperMock).getAncestorOfCheck();
			//TODO: Needs to return real value
			doReturn(null).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
			doReturn("systemEnvironment").when(enumerablePropertySourceMock).getName();
			Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("PATH", "/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:/snap/bin"), entry("XAUTHORITY", "/home/bhuvan/.Xauthority"), entry("INVOCATION_ID", "d1f9adf08e2d4b229e6927e6252607c3"), entry("XMODIFIERS", "@im=ibus"), entry("XDG_DATA_DIRS", "/usr/share/gnome:/usr/local/share:/usr/share:/var/lib/snapd/desktop"), entry("SNAP_COMMON", "/var/snap/intellij-idea-community/common"), entry("SNAP_INSTANCE_KEY", ""), entry("SNAP_USER_COMMON", "/home/bhuvan/snap/intellij-idea-community/common"), entry("DBUS_SESSION_BUS_ADDRESS", "unix:path=/run/user/1003/bus"), entry("SNAP_REVISION", "450"), entry("XDG_CURRENT_DESKTOP", "GNOME"), entry("JOURNAL_STREAM", "8:34217"), entry("LD_LIBRARY_PATH", "/usr/lib/mesa-diverted/x86_64-linux-gnu:/usr/lib/x86_64-linux-gnu/mesa:/usr/lib/x86_64-linux-gnu/dri:/usr/lib/x86_64-linux-gnu/gallium-pipe"), entry("CHROME_REMOTE_DESKTOP_SESSION", "1"), entry("SESSION_MANAGER", "local/ubuntu-automation-desktop-2:@/tmp/.ICE-unix/1431,unix/ubuntu-automation-desktop-2:/tmp/.ICE-unix/1431"), entry("LOGNAME", "bhuvan"), entry("PWD", "/home/bhuvan"), entry("MANAGERPID", "914"), entry("IM_CONFIG_PHASE", "1"), entry("SNAP_UID", "1003"), entry("GJS_DEBUG_TOPICS", "JS ERROR;JS LOG"), entry("SHELL", "/bin/bash"), entry("PULSE_STATE_PATH", "/run/user/1003/crd_audio#eiUrr_sa8I"), entry("GIO_LAUNCHED_DESKTOP_FILE", "/var/lib/snapd/desktop/applications/intellij-idea-community_intellij-idea-community.desktop"), entry("BAMF_DESKTOP_FILE_HINT", "/var/lib/snapd/desktop/applications/intellij-idea-community_intellij-idea-community.desktop"), entry("GNOME_DESKTOP_SESSION_ID", "this-is-deprecated"), entry("GTK_MODULES", "gail:atk-bridge"), entry("SNAP_ARCH", "amd64"), entry("SNAP_LIBRARY_PATH", "/var/lib/snapd/lib/gl:/var/lib/snapd/lib/gl32:/var/lib/snapd/void"), entry("SHLVL", "0"), entry("SNAP_EUID", "1003"), entry("SNAP_NAME", "intellij-idea-community"), entry("QT_IM_MODULE", "ibus"), entry("PULSE_RUNTIME_PATH", "/run/user/1003/crd_audio#eiUrr_sa8I"), entry("TERM", "vt220"), entry("LANG", "C.UTF-8"), entry("SNAP_INSTANCE_NAME", "intellij-idea-community"), entry("XDG_SESSION_TYPE", "x11"), entry("PULSE_CONFIG_PATH", "/run/user/1003/crd_audio#eiUrr_sa8I"), entry("SNAP_USER_DATA", "/home/bhuvan/snap/intellij-idea-community/450"), entry("DISPLAY", ":20"), entry("PULSE_SINK", "chrome_remote_desktop_session"), entry("SNAP_REEXEC", ""), entry("SNAP_VERSION", "2023.1.5"), entry("XDG_SESSION_CLASS", "user"), entry("SNAP_DATA", "/var/snap/intellij-idea-community/450"), entry("GDK_BACKEND", "x11"), entry("GPG_AGENT_INFO", "/run/user/1003/gnupg/S.gpg-agent:0:1"), entry("SNAP", "/snap/intellij-idea-community/450"), entry("USER", "bhuvan"), entry("SNAP_REAL_HOME", "/home/bhuvan"), entry("DESKTOP_STARTUP_ID", "IDEA-restart_TIME197581888"), entry("XDG_MENU_PREFIX", "gnome-"), entry("GIO_LAUNCHED_DESKTOP_FILE_PID", "40909"), entry("QT_ACCESSIBILITY", "1"), entry("GJS_DEBUG_OUTPUT", "stderr"), entry("SSH_AUTH_SOCK", "/run/user/1003/keyring/ssh"), entry("SNAP_CONTEXT", "MpTSF0iAyzNQlkF5VGONVjLyoi2NZfsmvXNOB0uOpen9M8g06azK"), entry("XDG_RUNTIME_DIR", "/run/user/1003"), entry("SNAP_COOKIE", "MpTSF0iAyzNQlkF5VGONVjLyoi2NZfsmvXNOB0uOpen9M8g06azK"), entry("HOME", "/home/bhuvan")));
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

	//Sapient generated method id: ${cbdd9389-5eb8-3391-bbcd-f3454860f4c7}
	@Test()
	void getPropertySource1Test() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//Map<String, String> stringStringMap = new HashMap<>();
		//MapPropertySource mapPropertySource = new MapPropertySource("systemEnvironment", stringStringMap);
		//PropertyMapper propertyMapperMock = mock(PropertyMapper.class, "String");
		//PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
		//SpringIterableConfigurationPropertySource target = new SpringIterableConfigurationPropertySource(mapPropertySource, propertyMapperArray);
		//Act Statement(s)
		//EnumerablePropertySource<?> result = target.getPropertySource();
		//Assert statement(s)
		//assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
