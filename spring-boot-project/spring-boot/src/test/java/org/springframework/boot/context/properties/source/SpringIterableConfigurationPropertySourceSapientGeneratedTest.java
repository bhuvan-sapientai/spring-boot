package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.core.env.PropertySource;
import org.springframework.util.Assert;

import java.util.Map;
import java.util.HashMap;
import java.util.function.BiPredicate;
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
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
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

	private final EnumerablePropertySource enumerablePropertySourceMock = mock(EnumerablePropertySource.class);

	private final EnumerablePropertySource enumerablePropertySourceMock2 = mock(EnumerablePropertySource.class);

	private final MapPropertySource mapSourceMock = mock(MapPropertySource.class);

	private final Origin originMock = mock(Origin.class);

	private final PropertyMapper propertyMapperMock = mock(PropertyMapper.class);

	private final PropertyMapper propertyMapperMock2 = mock(PropertyMapper.class);

	private final PropertySource propertySourceMock = mock(PropertySource.class);

	//Sapient generated method id: ${ee2e73e4-ef45-316b-bf2a-4acf0f0898a5}, hash: 879DA3C82FEE2095ECE778D0E9A6B3F1
	@Test()
	void getCachingTest() {
		//Assert statement(s)
		//Arrange Statement(s)
		//Map<String, String> stringStringMap = new HashMap<>();
		//MapPropertySource mapPropertySource = new MapPropertySource("systemEnvironment", stringStringMap);
		//PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
		//SpringIterableConfigurationPropertySource target = new SpringIterableConfigurationPropertySource(mapPropertySource, propertyMapperArray);
		//Act Statement(s)
		//ConfigurationPropertyCaching result = target.getCaching();
		//TODO: Please implement equals method in SoftReferenceConfigurationPropertyCache for verification of the entire object or you need to adjust respective assertion statements
		//assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${b9f4539f-22c1-3b32-b0e6-3ab60afe5a86}, hash: 5617E3EF1B99967C90D301DFB237921D
	@Test()
	void getConfigurationPropertyWhenNameIsNull() {
		/* Branches:
		 * (name == null) : true
		 */
		//Arrange Statement(s)
		//Map<String, String> stringStringMap = new HashMap<>();
		//MapPropertySource mapPropertySource = new MapPropertySource("systemEnvironment", stringStringMap);
		//PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
		//SpringIterableConfigurationPropertySource target = new SpringIterableConfigurationPropertySource(mapPropertySource, propertyMapperArray);
		//ConfigurationPropertyName configurationPropertyName = null;
		//Act Statement(s)
		//ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyName);
		//Assert statement(s)
		//assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${87d2c1c5-91e5-3fb5-83d2-294d6c587a4a}, hash: 94BC1E1A63B7C30E616E9DABD92D7444
	@Test()
	void getConfigurationPropertyWhenConfigurationPropertyIsNotNull() {
		/* Branches:
		 * (name == null) : false
		 * (name == null) : false  #  inside getConfigurationProperty method
		 * (for-each(this.mappers)) : true  #  inside getConfigurationProperty method
		 * (for-each(mapper.map(name))) : true  #  inside getConfigurationProperty method
		 * (value != null) : true  #  inside getConfigurationProperty method
		 * (configurationProperty != null) : true
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
    MockedStatic<PropertySourceOrigin> propertySourceOrigin = mockStatic(PropertySourceOrigin.class)) {
    Map<String, String> stringStringMap = new HashMap<>();
    MapPropertySource mapPropertySource = new MapPropertySource("systemEnvironment", stringStringMap);
    propertySourceOrigin.when(() -> PropertySourceOrigin.get(mapPropertySource, "<List<String>>")).thenReturn(originMock);
    PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
    SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapPropertySource, propertyMapperArray));
    doReturn(propertySourceMock).when(target).getPropertySource();
    Object object = new Object();
    doReturn(object).when(propertySourceMock).getProperty("<List<String>>");
    configurationProperty.when(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object), eq(originMock))).thenReturn(configurationPropertyMock);
    ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("getConfigurationProperty_configurationPropertyName1-name1");
    //Act Statement(s)
    ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyName);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, equalTo(configurationPropertyMock));
        propertySourceOrigin.verify(() -> PropertySourceOrigin.get(mapPropertySource, "<List<String>>"), atLeast(1));
        verify(target).getPropertySource();
        verify(propertySourceMock).getProperty("<List<String>>");
        configurationProperty.verify(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object), eq(originMock)));
    });
}*/
	}

	//Sapient generated method id: ${9fc1eebb-964a-3d08-9dbf-f24b53dfd687}, hash: 30127ABE3AA0FF420EF2FF1AACA56C91
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
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type SpringIterableConfigurationPropertySource.Mappings
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

	//Sapient generated method id: ${57054a1e-10ca-3fbe-8b8c-9d6a45d7edfc}, hash: 3F170D37A26EF37D600FF9BD7F8D1AEB
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
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type SpringIterableConfigurationPropertySource.Mappings
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
    MockedStatic<PropertySourceOrigin> propertySourceOrigin = mockStatic(PropertySourceOrigin.class, CALLS_REAL_METHODS)) {
    propertySourceOrigin.when(() -> PropertySourceOrigin.get(enumerablePropertySourceMock, "arg0")).thenReturn(originMock);
    Map<String, String> stringStringMap = new HashMap<>();
    MapPropertySource mapPropertySource = new MapPropertySource("systemEnvironment", stringStringMap);
    PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
    SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapPropertySource, propertyMapperArray));
    Object object = new Object();
    doReturn(object).when(propertySourceMock).getProperty("<List<String>>");
    configurationProperty.when(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object), (Origin) any())).thenReturn(null);
    Object object2 = new Object();
    doReturn(object2).when(enumerablePropertySourceMock2).getProperty("arg0");
    doReturn(propertySourceMock, enumerablePropertySourceMock2, enumerablePropertySourceMock).when(target).getPropertySource();
    configurationProperty.when(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object2), eq(originMock))).thenReturn(configurationPropertyMock);
    ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("getConfigurationProperty_configurationPropertyName1-name1");
    //Act Statement(s)
    ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyName);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, equalTo(configurationPropertyMock));
        propertySourceOrigin.verify(() -> PropertySourceOrigin.get(enumerablePropertySourceMock, "arg0"), atLeast(1));
        verify(target, times(3)).getPropertySource();
        verify(propertySourceMock, atLeast(1)).getProperty("<List<String>>");
        configurationProperty.verify(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object), (Origin) any()), atLeast(1));
        verify(enumerablePropertySourceMock2, atLeast(1)).getProperty("arg0");
        configurationProperty.verify(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object2), eq(originMock)), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${e893205b-f056-31da-9a8b-883b9fa7b02b}, hash: 159F547C51D71394425E447E5AB5E902
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
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type SpringIterableConfigurationPropertySource.Mappings
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
    MockedStatic<PropertySourceOrigin> propertySourceOrigin = mockStatic(PropertySourceOrigin.class)) {
    Map<String, String> stringStringMap = new HashMap<>();
    MapPropertySource mapPropertySource = new MapPropertySource("systemEnvironment", stringStringMap);
    propertySourceOrigin.when(() -> PropertySourceOrigin.get(mapPropertySource, "<List<String>>")).thenReturn(originMock);
    PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
    SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapPropertySource, propertyMapperArray));
    Object object = new Object();
    doReturn(object).when(propertySourceMock).getProperty("<List<String>>");
    configurationProperty.when(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object), eq(originMock))).thenReturn(null);
    doReturn(propertySourceMock, enumerablePropertySourceMock).when(target).getPropertySource();
    doReturn(null).when(enumerablePropertySourceMock).getProperty("arg0");
    ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("getConfigurationProperty_configurationPropertyName1-name1");
    //Act Statement(s)
    ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyName);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(nullValue()));
        propertySourceOrigin.verify(() -> PropertySourceOrigin.get(mapPropertySource, "<List<String>>"), atLeast(1));
        verify(target, times(2)).getPropertySource();
        verify(propertySourceMock).getProperty("<List<String>>");
        configurationProperty.verify(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object), eq(originMock)));
        verify(enumerablePropertySourceMock).getProperty("arg0");
    });
}*/
	}

	//Sapient generated method id: ${e105d3be-5472-393b-b059-b658a063d376}, hash: F4CB4BCD41234976C1167FD09E4F0DE2
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
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type SpringIterableConfigurationPropertySource.Mappings
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//ConfigurationProperty configurationPropertyMock2 = mock(ConfigurationProperty.class);
        /*try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
    MockedStatic<PropertySourceOrigin> propertySourceOrigin = mockStatic(PropertySourceOrigin.class, CALLS_REAL_METHODS)) {
    propertySourceOrigin.when(() -> PropertySourceOrigin.get(enumerablePropertySourceMock, "arg0")).thenReturn(originMock);
    Map<String, String> stringStringMap = new HashMap<>();
    MapPropertySource mapPropertySource = new MapPropertySource("systemEnvironment", stringStringMap);
    PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
    SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapPropertySource, propertyMapperArray));
    Object object = new Object();
    doReturn(object).when(propertySourceMock).getProperty("<List<String>>");
    configurationProperty.when(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object), (Origin) any())).thenReturn(configurationPropertyMock);
    Object object2 = new Object();
    doReturn(object2).when(enumerablePropertySourceMock2).getProperty("arg0");
    doReturn(propertySourceMock, enumerablePropertySourceMock2, enumerablePropertySourceMock).when(target).getPropertySource();
    configurationProperty.when(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object2), eq(originMock))).thenReturn(configurationPropertyMock2);
    ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("getConfigurationProperty_configurationPropertyName1-name1");
    //Act Statement(s)
    ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyName);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, equalTo(configurationPropertyMock2));
        propertySourceOrigin.verify(() -> PropertySourceOrigin.get(enumerablePropertySourceMock, "arg0"), atLeast(1));
        verify(target, times(3)).getPropertySource();
        verify(propertySourceMock, atLeast(1)).getProperty("<List<String>>");
        configurationProperty.verify(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object), (Origin) any()), atLeast(1));
        verify(enumerablePropertySourceMock2, atLeast(1)).getProperty("arg0");
        configurationProperty.verify(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object2), eq(originMock)), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${9050c48e-938a-32db-b9a6-0eb22f72c7dc}, hash: 6EEE0B7415DBF4BF99A3BFADB2B7B038
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
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type SpringIterableConfigurationPropertySource.Mappings
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
    MockedStatic<PropertySourceOrigin> propertySourceOrigin = mockStatic(PropertySourceOrigin.class)) {
    Map<String, String> stringStringMap = new HashMap<>();
    MapPropertySource mapPropertySource = new MapPropertySource("systemEnvironment", stringStringMap);
    propertySourceOrigin.when(() -> PropertySourceOrigin.get(mapPropertySource, "<List<String>>")).thenReturn(originMock);
    PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
    SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapPropertySource, propertyMapperArray));
    Object object = new Object();
    doReturn(object).when(propertySourceMock).getProperty("<List<String>>");
    configurationProperty.when(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object), eq(originMock))).thenReturn(configurationPropertyMock);
    doReturn(propertySourceMock, enumerablePropertySourceMock).when(target).getPropertySource();
    doReturn(null).when(enumerablePropertySourceMock).getProperty("arg0");
    ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("getConfigurationProperty_configurationPropertyName1-name1");
    //Act Statement(s)
    ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyName);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(nullValue()));
        propertySourceOrigin.verify(() -> PropertySourceOrigin.get(mapPropertySource, "<List<String>>"), atLeast(1));
        verify(target, times(2)).getPropertySource();
        verify(propertySourceMock).getProperty("<List<String>>");
        configurationProperty.verify(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object), eq(originMock)));
        verify(enumerablePropertySourceMock).getProperty("arg0");
    });
}*/
	}

	//Sapient generated method id: ${d3831c55-97fb-36f6-9e97-7248c23be7cc}, hash: 437318112BF9C1FEED1D2F1E580AF587
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

	//Sapient generated method id: ${f2c28042-b6a8-3d46-a8a9-732e5704ff04}, hash: 88F8C69B09B067A25F2049A24C60F46D
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

	//Sapient generated method id: ${15837300-d633-3fc1-8480-7507eacca3a1}, hash: CB20EC76BCA7032048CEA6DABDBA9ADF
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
			Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("PATH", "/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:/snap/bin"), entry("XAUTHORITY", "/home/bhuvan/.Xauthority"), entry("INVOCATION_ID", "653a6ec8ef4b4875ae6d4f05dda9476c"), entry("XMODIFIERS", "@im=ibus"), entry("XDG_DATA_DIRS", "/usr/share/gnome:/usr/local/share:/usr/share:/var/lib/snapd/desktop"), entry("SNAP_COMMON", "/var/snap/intellij-idea-community/common"), entry("SNAP_INSTANCE_KEY", ""), entry("SNAP_USER_COMMON", "/home/bhuvan/snap/intellij-idea-community/common"), entry("DBUS_SESSION_BUS_ADDRESS", "unix:path=/run/user/1003/bus"), entry("SNAP_REVISION", "485"), entry("XDG_CURRENT_DESKTOP", "GNOME"), entry("JOURNAL_STREAM", "8:32512"), entry("LD_LIBRARY_PATH", "/usr/lib/mesa-diverted/x86_64-linux-gnu:/usr/lib/x86_64-linux-gnu/mesa:/usr/lib/x86_64-linux-gnu/dri:/usr/lib/x86_64-linux-gnu/gallium-pipe"), entry("CHROME_REMOTE_DESKTOP_SESSION", "1"), entry("SESSION_MANAGER", "local/ubuntu-automation-desktop-2:@/tmp/.ICE-unix/1431,unix/ubuntu-automation-desktop-2:/tmp/.ICE-unix/1431"), entry("LOGNAME", "bhuvan"), entry("PWD", "/home/bhuvan"), entry("MANAGERPID", "908"), entry("IM_CONFIG_PHASE", "1"), entry("SNAP_UID", "1003"), entry("GJS_DEBUG_TOPICS", "JS ERROR;JS LOG"), entry("SHELL", "/bin/bash"), entry("PULSE_STATE_PATH", "/run/user/1003/crd_audio#eiUrr_sa8I"), entry("GIO_LAUNCHED_DESKTOP_FILE", "/var/lib/snapd/desktop/applications/intellij-idea-community_intellij-idea-community.desktop"), entry("BAMF_DESKTOP_FILE_HINT", "/var/lib/snapd/desktop/applications/intellij-idea-community_intellij-idea-community.desktop"), entry("GNOME_DESKTOP_SESSION_ID", "this-is-deprecated"), entry("GTK_MODULES", "gail:atk-bridge"), entry("SNAP_ARCH", "amd64"), entry("SNAP_LIBRARY_PATH", "/var/lib/snapd/lib/gl:/var/lib/snapd/lib/gl32:/var/lib/snapd/void"), entry("SHLVL", "0"), entry("SNAP_EUID", "1003"), entry("SNAP_NAME", "intellij-idea-community"), entry("QT_IM_MODULE", "ibus"), entry("PULSE_RUNTIME_PATH", "/run/user/1003/crd_audio#eiUrr_sa8I"), entry("TERM", "vt220"), entry("LANG", "C.UTF-8"), entry("SNAP_INSTANCE_NAME", "intellij-idea-community"), entry("XDG_SESSION_TYPE", "x11"), entry("PULSE_CONFIG_PATH", "/run/user/1003/crd_audio#eiUrr_sa8I"), entry("SNAP_USER_DATA", "/home/bhuvan/snap/intellij-idea-community/485"), entry("DISPLAY", ":20"), entry("PULSE_SINK", "chrome_remote_desktop_session"), entry("SNAP_REEXEC", ""), entry("SNAP_VERSION", "2023.1.6"), entry("XDG_SESSION_CLASS", "user"), entry("SNAP_DATA", "/var/snap/intellij-idea-community/485"), entry("GDK_BACKEND", "x11"), entry("GPG_AGENT_INFO", "/run/user/1003/gnupg/S.gpg-agent:0:1"), entry("SNAP", "/snap/intellij-idea-community/485"), entry("USER", "bhuvan"), entry("SNAP_REAL_HOME", "/home/bhuvan"), entry("DESKTOP_STARTUP_ID", "IDEA-restart_TIME-942006056"), entry("XDG_MENU_PREFIX", "gnome-"), entry("GIO_LAUNCHED_DESKTOP_FILE_PID", "4039317"), entry("QT_ACCESSIBILITY", "1"), entry("GJS_DEBUG_OUTPUT", "stderr"), entry("SSH_AUTH_SOCK", "/run/user/1003/keyring/ssh"), entry("SNAP_CONTEXT", "MpTSF0iAyzNQlkF5VGONVjLyoi2NZfsmvXNOB0uOpen9M8g06azK"), entry("XDG_RUNTIME_DIR", "/run/user/1003"), entry("SNAP_COOKIE", "MpTSF0iAyzNQlkF5VGONVjLyoi2NZfsmvXNOB0uOpen9M8g06azK"), entry("HOME", "/home/bhuvan")));
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

	//Sapient generated method id: ${cf8a5d39-ae43-3644-96ff-2e7c71af28b9}, hash: 972E148119D81ADCF6109E08AB8F6999
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

	//Sapient generated method id: ${989baa53-a8dd-3271-a5f1-93759b7cded4}, hash: 870810997E07EDFE9B800D328BF7155B
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

	//Sapient generated method id: ${29532aaf-aa83-3bbc-bab1-a7aa401044f9}, hash: F68B493031225FF898090B3E5B7A5A05
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
			Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("PATH", "/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:/snap/bin"), entry("XAUTHORITY", "/home/bhuvan/.Xauthority"), entry("INVOCATION_ID", "653a6ec8ef4b4875ae6d4f05dda9476c"), entry("XMODIFIERS", "@im=ibus"), entry("XDG_DATA_DIRS", "/usr/share/gnome:/usr/local/share:/usr/share:/var/lib/snapd/desktop"), entry("SNAP_COMMON", "/var/snap/intellij-idea-community/common"), entry("SNAP_INSTANCE_KEY", ""), entry("SNAP_USER_COMMON", "/home/bhuvan/snap/intellij-idea-community/common"), entry("DBUS_SESSION_BUS_ADDRESS", "unix:path=/run/user/1003/bus"), entry("SNAP_REVISION", "485"), entry("XDG_CURRENT_DESKTOP", "GNOME"), entry("JOURNAL_STREAM", "8:32512"), entry("LD_LIBRARY_PATH", "/usr/lib/mesa-diverted/x86_64-linux-gnu:/usr/lib/x86_64-linux-gnu/mesa:/usr/lib/x86_64-linux-gnu/dri:/usr/lib/x86_64-linux-gnu/gallium-pipe"), entry("CHROME_REMOTE_DESKTOP_SESSION", "1"), entry("SESSION_MANAGER", "local/ubuntu-automation-desktop-2:@/tmp/.ICE-unix/1431,unix/ubuntu-automation-desktop-2:/tmp/.ICE-unix/1431"), entry("LOGNAME", "bhuvan"), entry("PWD", "/home/bhuvan"), entry("MANAGERPID", "908"), entry("IM_CONFIG_PHASE", "1"), entry("SNAP_UID", "1003"), entry("GJS_DEBUG_TOPICS", "JS ERROR;JS LOG"), entry("SHELL", "/bin/bash"), entry("PULSE_STATE_PATH", "/run/user/1003/crd_audio#eiUrr_sa8I"), entry("GIO_LAUNCHED_DESKTOP_FILE", "/var/lib/snapd/desktop/applications/intellij-idea-community_intellij-idea-community.desktop"), entry("BAMF_DESKTOP_FILE_HINT", "/var/lib/snapd/desktop/applications/intellij-idea-community_intellij-idea-community.desktop"), entry("GNOME_DESKTOP_SESSION_ID", "this-is-deprecated"), entry("GTK_MODULES", "gail:atk-bridge"), entry("SNAP_ARCH", "amd64"), entry("SNAP_LIBRARY_PATH", "/var/lib/snapd/lib/gl:/var/lib/snapd/lib/gl32:/var/lib/snapd/void"), entry("SHLVL", "0"), entry("SNAP_EUID", "1003"), entry("SNAP_NAME", "intellij-idea-community"), entry("QT_IM_MODULE", "ibus"), entry("PULSE_RUNTIME_PATH", "/run/user/1003/crd_audio#eiUrr_sa8I"), entry("TERM", "vt220"), entry("LANG", "C.UTF-8"), entry("SNAP_INSTANCE_NAME", "intellij-idea-community"), entry("XDG_SESSION_TYPE", "x11"), entry("PULSE_CONFIG_PATH", "/run/user/1003/crd_audio#eiUrr_sa8I"), entry("SNAP_USER_DATA", "/home/bhuvan/snap/intellij-idea-community/485"), entry("DISPLAY", ":20"), entry("PULSE_SINK", "chrome_remote_desktop_session"), entry("SNAP_REEXEC", ""), entry("SNAP_VERSION", "2023.1.6"), entry("XDG_SESSION_CLASS", "user"), entry("SNAP_DATA", "/var/snap/intellij-idea-community/485"), entry("GDK_BACKEND", "x11"), entry("GPG_AGENT_INFO", "/run/user/1003/gnupg/S.gpg-agent:0:1"), entry("SNAP", "/snap/intellij-idea-community/485"), entry("USER", "bhuvan"), entry("SNAP_REAL_HOME", "/home/bhuvan"), entry("DESKTOP_STARTUP_ID", "IDEA-restart_TIME-942006056"), entry("XDG_MENU_PREFIX", "gnome-"), entry("GIO_LAUNCHED_DESKTOP_FILE_PID", "4039317"), entry("QT_ACCESSIBILITY", "1"), entry("GJS_DEBUG_OUTPUT", "stderr"), entry("SSH_AUTH_SOCK", "/run/user/1003/keyring/ssh"), entry("SNAP_CONTEXT", "MpTSF0iAyzNQlkF5VGONVjLyoi2NZfsmvXNOB0uOpen9M8g06azK"), entry("XDG_RUNTIME_DIR", "/run/user/1003"), entry("SNAP_COOKIE", "MpTSF0iAyzNQlkF5VGONVjLyoi2NZfsmvXNOB0uOpen9M8g06azK"), entry("HOME", "/home/bhuvan")));
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

	//Sapient generated method id: ${182a0c69-945f-3716-a1d7-c802b7e83095}, hash: FB619EE0053F0351588FA1122F93C0F3
	@Disabled()
	@Test()
	void containsDescendantOfWhenThisAncestorOfCheckEqualsPropertyMapperDEFAULT_ANCESTOR_OF_CHECK() {
		/* Branches:
		 * (underlyingSource instanceof Random) : false  #  inside containsDescendantOf method
		 * (underlyingSource instanceof PropertySource<?> underlyingPropertySource) : false  #  inside containsDescendantOf method
		 * (result != ConfigurationPropertyState.UNKNOWN) : false
		 * (this.ancestorOfCheck == PropertyMapper.DEFAULT_ANCESTOR_OF_CHECK) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type SpringIterableConfigurationPropertySource.Mappings
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

	//Sapient generated method id: ${04a7e493-84fd-3b5a-b0f4-78402cbdf3a6}, hash: 3010C9B9428927BCC3DF1930219D04C2
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

	//Sapient generated method id: ${79f37c4e-7f19-31d8-9bf6-e72a79eac3ec}, hash: E565E7D56E768F8158F8AF1AD151C7A1
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

	//Sapient generated method id: ${9fb0ca08-ed2e-31c2-a1d9-0392e69db412}, hash: 9009669102B723C4500C671519CDCBFA
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
			Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("PATH", "/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:/snap/bin"), entry("XAUTHORITY", "/home/bhuvan/.Xauthority"), entry("INVOCATION_ID", "653a6ec8ef4b4875ae6d4f05dda9476c"), entry("XMODIFIERS", "@im=ibus"), entry("XDG_DATA_DIRS", "/usr/share/gnome:/usr/local/share:/usr/share:/var/lib/snapd/desktop"), entry("SNAP_COMMON", "/var/snap/intellij-idea-community/common"), entry("SNAP_INSTANCE_KEY", ""), entry("SNAP_USER_COMMON", "/home/bhuvan/snap/intellij-idea-community/common"), entry("DBUS_SESSION_BUS_ADDRESS", "unix:path=/run/user/1003/bus"), entry("SNAP_REVISION", "485"), entry("XDG_CURRENT_DESKTOP", "GNOME"), entry("JOURNAL_STREAM", "8:32512"), entry("LD_LIBRARY_PATH", "/usr/lib/mesa-diverted/x86_64-linux-gnu:/usr/lib/x86_64-linux-gnu/mesa:/usr/lib/x86_64-linux-gnu/dri:/usr/lib/x86_64-linux-gnu/gallium-pipe"), entry("CHROME_REMOTE_DESKTOP_SESSION", "1"), entry("SESSION_MANAGER", "local/ubuntu-automation-desktop-2:@/tmp/.ICE-unix/1431,unix/ubuntu-automation-desktop-2:/tmp/.ICE-unix/1431"), entry("LOGNAME", "bhuvan"), entry("PWD", "/home/bhuvan"), entry("MANAGERPID", "908"), entry("IM_CONFIG_PHASE", "1"), entry("SNAP_UID", "1003"), entry("GJS_DEBUG_TOPICS", "JS ERROR;JS LOG"), entry("SHELL", "/bin/bash"), entry("PULSE_STATE_PATH", "/run/user/1003/crd_audio#eiUrr_sa8I"), entry("GIO_LAUNCHED_DESKTOP_FILE", "/var/lib/snapd/desktop/applications/intellij-idea-community_intellij-idea-community.desktop"), entry("BAMF_DESKTOP_FILE_HINT", "/var/lib/snapd/desktop/applications/intellij-idea-community_intellij-idea-community.desktop"), entry("GNOME_DESKTOP_SESSION_ID", "this-is-deprecated"), entry("GTK_MODULES", "gail:atk-bridge"), entry("SNAP_ARCH", "amd64"), entry("SNAP_LIBRARY_PATH", "/var/lib/snapd/lib/gl:/var/lib/snapd/lib/gl32:/var/lib/snapd/void"), entry("SHLVL", "0"), entry("SNAP_EUID", "1003"), entry("SNAP_NAME", "intellij-idea-community"), entry("QT_IM_MODULE", "ibus"), entry("PULSE_RUNTIME_PATH", "/run/user/1003/crd_audio#eiUrr_sa8I"), entry("TERM", "vt220"), entry("LANG", "C.UTF-8"), entry("SNAP_INSTANCE_NAME", "intellij-idea-community"), entry("XDG_SESSION_TYPE", "x11"), entry("PULSE_CONFIG_PATH", "/run/user/1003/crd_audio#eiUrr_sa8I"), entry("SNAP_USER_DATA", "/home/bhuvan/snap/intellij-idea-community/485"), entry("DISPLAY", ":20"), entry("PULSE_SINK", "chrome_remote_desktop_session"), entry("SNAP_REEXEC", ""), entry("SNAP_VERSION", "2023.1.6"), entry("XDG_SESSION_CLASS", "user"), entry("SNAP_DATA", "/var/snap/intellij-idea-community/485"), entry("GDK_BACKEND", "x11"), entry("GPG_AGENT_INFO", "/run/user/1003/gnupg/S.gpg-agent:0:1"), entry("SNAP", "/snap/intellij-idea-community/485"), entry("USER", "bhuvan"), entry("SNAP_REAL_HOME", "/home/bhuvan"), entry("DESKTOP_STARTUP_ID", "IDEA-restart_TIME-942006056"), entry("XDG_MENU_PREFIX", "gnome-"), entry("GIO_LAUNCHED_DESKTOP_FILE_PID", "4039317"), entry("QT_ACCESSIBILITY", "1"), entry("GJS_DEBUG_OUTPUT", "stderr"), entry("SSH_AUTH_SOCK", "/run/user/1003/keyring/ssh"), entry("SNAP_CONTEXT", "MpTSF0iAyzNQlkF5VGONVjLyoi2NZfsmvXNOB0uOpen9M8g06azK"), entry("XDG_RUNTIME_DIR", "/run/user/1003"), entry("SNAP_COOKIE", "MpTSF0iAyzNQlkF5VGONVjLyoi2NZfsmvXNOB0uOpen9M8g06azK"), entry("HOME", "/home/bhuvan")));
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

	//Sapient generated method id: ${4739748f-ab7f-3670-b7b9-3d8a3e4f2a31}, hash: 96584A7D949AAA87C1EBE156B94313CB
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
			Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("PATH", "/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:/snap/bin"), entry("XAUTHORITY", "/home/bhuvan/.Xauthority"), entry("INVOCATION_ID", "653a6ec8ef4b4875ae6d4f05dda9476c"), entry("XMODIFIERS", "@im=ibus"), entry("XDG_DATA_DIRS", "/usr/share/gnome:/usr/local/share:/usr/share:/var/lib/snapd/desktop"), entry("SNAP_COMMON", "/var/snap/intellij-idea-community/common"), entry("SNAP_INSTANCE_KEY", ""), entry("SNAP_USER_COMMON", "/home/bhuvan/snap/intellij-idea-community/common"), entry("DBUS_SESSION_BUS_ADDRESS", "unix:path=/run/user/1003/bus"), entry("SNAP_REVISION", "485"), entry("XDG_CURRENT_DESKTOP", "GNOME"), entry("JOURNAL_STREAM", "8:32512"), entry("LD_LIBRARY_PATH", "/usr/lib/mesa-diverted/x86_64-linux-gnu:/usr/lib/x86_64-linux-gnu/mesa:/usr/lib/x86_64-linux-gnu/dri:/usr/lib/x86_64-linux-gnu/gallium-pipe"), entry("CHROME_REMOTE_DESKTOP_SESSION", "1"), entry("SESSION_MANAGER", "local/ubuntu-automation-desktop-2:@/tmp/.ICE-unix/1431,unix/ubuntu-automation-desktop-2:/tmp/.ICE-unix/1431"), entry("LOGNAME", "bhuvan"), entry("PWD", "/home/bhuvan"), entry("MANAGERPID", "908"), entry("IM_CONFIG_PHASE", "1"), entry("SNAP_UID", "1003"), entry("GJS_DEBUG_TOPICS", "JS ERROR;JS LOG"), entry("SHELL", "/bin/bash"), entry("PULSE_STATE_PATH", "/run/user/1003/crd_audio#eiUrr_sa8I"), entry("GIO_LAUNCHED_DESKTOP_FILE", "/var/lib/snapd/desktop/applications/intellij-idea-community_intellij-idea-community.desktop"), entry("BAMF_DESKTOP_FILE_HINT", "/var/lib/snapd/desktop/applications/intellij-idea-community_intellij-idea-community.desktop"), entry("GNOME_DESKTOP_SESSION_ID", "this-is-deprecated"), entry("GTK_MODULES", "gail:atk-bridge"), entry("SNAP_ARCH", "amd64"), entry("SNAP_LIBRARY_PATH", "/var/lib/snapd/lib/gl:/var/lib/snapd/lib/gl32:/var/lib/snapd/void"), entry("SHLVL", "0"), entry("SNAP_EUID", "1003"), entry("SNAP_NAME", "intellij-idea-community"), entry("QT_IM_MODULE", "ibus"), entry("PULSE_RUNTIME_PATH", "/run/user/1003/crd_audio#eiUrr_sa8I"), entry("TERM", "vt220"), entry("LANG", "C.UTF-8"), entry("SNAP_INSTANCE_NAME", "intellij-idea-community"), entry("XDG_SESSION_TYPE", "x11"), entry("PULSE_CONFIG_PATH", "/run/user/1003/crd_audio#eiUrr_sa8I"), entry("SNAP_USER_DATA", "/home/bhuvan/snap/intellij-idea-community/485"), entry("DISPLAY", ":20"), entry("PULSE_SINK", "chrome_remote_desktop_session"), entry("SNAP_REEXEC", ""), entry("SNAP_VERSION", "2023.1.6"), entry("XDG_SESSION_CLASS", "user"), entry("SNAP_DATA", "/var/snap/intellij-idea-community/485"), entry("GDK_BACKEND", "x11"), entry("GPG_AGENT_INFO", "/run/user/1003/gnupg/S.gpg-agent:0:1"), entry("SNAP", "/snap/intellij-idea-community/485"), entry("USER", "bhuvan"), entry("SNAP_REAL_HOME", "/home/bhuvan"), entry("DESKTOP_STARTUP_ID", "IDEA-restart_TIME-942006056"), entry("XDG_MENU_PREFIX", "gnome-"), entry("GIO_LAUNCHED_DESKTOP_FILE_PID", "4039317"), entry("QT_ACCESSIBILITY", "1"), entry("GJS_DEBUG_OUTPUT", "stderr"), entry("SSH_AUTH_SOCK", "/run/user/1003/keyring/ssh"), entry("SNAP_CONTEXT", "MpTSF0iAyzNQlkF5VGONVjLyoi2NZfsmvXNOB0uOpen9M8g06azK"), entry("XDG_RUNTIME_DIR", "/run/user/1003"), entry("SNAP_COOKIE", "MpTSF0iAyzNQlkF5VGONVjLyoi2NZfsmvXNOB0uOpen9M8g06azK"), entry("HOME", "/home/bhuvan")));
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

	//Sapient generated method id: ${cbdd9389-5eb8-3391-bbcd-f3454860f4c7}, hash: EA46E433E52A247BFA72F0AA14B51335
	@Test()
	void getPropertySource1Test() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//Map<String, String> stringStringMap = new HashMap<>();
		//MapPropertySource mapPropertySource = new MapPropertySource("systemEnvironment", stringStringMap);
		//PropertyMapper propertyMapperMock = mock(PropertyMapper.class, "value");
		//PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
		//SpringIterableConfigurationPropertySource target = new SpringIterableConfigurationPropertySource(mapPropertySource, propertyMapperArray);
		//Act Statement(s)
		//EnumerablePropertySource<?> result = target.getPropertySource();
		//Assert statement(s)
		//assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
