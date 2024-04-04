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
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

import org.springframework.boot.origin.PropertySourceOrigin;

import java.util.function.Supplier;

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

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringIterableConfigurationPropertySourceSapientGeneratedTest {

	private final SoftReferenceConfigurationPropertyCache<SpringIterableConfigurationPropertySource.Mappings> cacheMock = mock(SoftReferenceConfigurationPropertyCache.class, "cache");

	private final BiPredicate biPredicateMock = mock(BiPredicate.class);

	private final BiPredicate biPredicateMock2 = mock(BiPredicate.class);

	private final ConfigurationProperty configurationPropertyMock = mock(ConfigurationProperty.class);

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final EnumerablePropertySource<?> enumerablePropertySourceMock = mock(EnumerablePropertySource.class);

	private final EnumerablePropertySource<?> enumerablePropertySourceMock2 = mock(EnumerablePropertySource.class);

	private final EnumerablePropertySource<?> enumerablePropertySourceMock3 = mock(EnumerablePropertySource.class);

	private final MapPropertySource mapSourceMock = mock(MapPropertySource.class);

	private final Origin originMock = mock(Origin.class);

	private final PropertyMapper propertyMapperMock = mock(PropertyMapper.class);

	private final PropertyMapper propertyMapperMock2 = mock(PropertyMapper.class);

	private final PropertySource<?> propertySourceMock = mock(PropertySource.class);

	//Sapient generated method id: ${ee2e73e4-ef45-316b-bf2a-4acf0f0898a5}, hash: 81BED7ACE7591A6BB3564152196AA870
	@Test()
	void getCachingTest() {
		//Arrange Statement(s)
		Map map = new HashMap<>();
		MapPropertySource mapPropertySource = new MapPropertySource("name1", map);
		PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
		SpringIterableConfigurationPropertySource target = new SpringIterableConfigurationPropertySource(mapPropertySource, propertyMapperArray);

		//Act Statement(s)
		ConfigurationPropertyCaching result = target.getCaching();

		//Assert statement(s)
		//TODO: Please implement equals method in SoftReferenceConfigurationPropertyCache for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${b9f4539f-22c1-3b32-b0e6-3ab60afe5a86}, hash: 0F073EEAC3CECD4042087AE31914545E
	@Test()
	void getConfigurationPropertyWhenNameIsNull() {
		/* Branches:
		 * (name == null) : true
		 */
		//Arrange Statement(s)
		Map map = new HashMap<>();
		MapPropertySource mapPropertySource = new MapPropertySource("name1", map);
		PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
		SpringIterableConfigurationPropertySource target = new SpringIterableConfigurationPropertySource(mapPropertySource, propertyMapperArray);
		ConfigurationPropertyName configurationPropertyName = null;

		//Act Statement(s)
		ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyName);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${87d2c1c5-91e5-3fb5-83d2-294d6c587a4a}, hash: 3D85E6D5E1A01B650476E87072A946D8
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
		try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
			 MockedStatic<PropertySourceOrigin> propertySourceOrigin = mockStatic(PropertySourceOrigin.class)) {
			Map map = new HashMap<>();
			MapPropertySource mapPropertySource = new MapPropertySource("name1", map);
			propertySourceOrigin.when(() -> PropertySourceOrigin.get(mapPropertySource, "")).thenReturn(originMock);
			PropertyMapper[] propertyMapperArray2 = new PropertyMapper[] {};
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperArray2 };
			SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapPropertySource, propertyMapperArray));
			doReturn(propertySourceMock).when(target).getPropertySource();
			Object object = new Object();
			doReturn(object).when(propertySourceMock).getProperty("");
			configurationProperty.when(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object), eq(originMock))).thenReturn(configurationPropertyMock);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("getConfigurationProperty_configurationPropertyName1-name1");
			//Act Statement(s)
			ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyMock));
				propertySourceOrigin.verify(() -> PropertySourceOrigin.get(mapPropertySource, ""), atLeast(1));
				verify(target).getPropertySource();
				verify(propertySourceMock).getProperty("");
				configurationProperty.verify(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object), eq(originMock)));
			});
		}
	}

	//Sapient generated method id: ${9fc1eebb-964a-3d08-9dbf-f24b53dfd687}, hash: 30127ABE3AA0FF420EF2FF1AACA56C91
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

	//Sapient generated method id: ${57054a1e-10ca-3fbe-8b8c-9d6a45d7edfc}, hash: 9E6BBFF7CBE669A336BD59F2362DEA3A
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
		Origin originMock2 = mock(Origin.class);
		try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
			 MockedStatic<PropertySourceOrigin> propertySourceOrigin = mockStatic(PropertySourceOrigin.class)) {
			Map map = new HashMap<>();
			MapPropertySource mapPropertySource = new MapPropertySource("name1", map);
			propertySourceOrigin.when(() -> PropertySourceOrigin.get(mapPropertySource, "")).thenReturn(originMock);
			propertySourceOrigin.when(() -> PropertySourceOrigin.get(enumerablePropertySourceMock, "name1")).thenReturn(originMock2);
			PropertyMapper[] propertyMapperArray2 = new PropertyMapper[] {};
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperArray2 };
			SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapPropertySource, propertyMapperArray));
			Object object = new Object();
			doReturn(object).when(propertySourceMock).getProperty("");
			configurationProperty.when(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object), eq(originMock))).thenReturn(null);
			Object object2 = new Object();
			doReturn(object2).when(enumerablePropertySourceMock2).getProperty("name1");
			doReturn(propertySourceMock, enumerablePropertySourceMock2, enumerablePropertySourceMock).when(target).getPropertySource();
			configurationProperty.when(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object2), eq(originMock2))).thenReturn(configurationPropertyMock);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("getConfigurationProperty_configurationPropertyName1-name1");
			//Act Statement(s)
			ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyMock));
				propertySourceOrigin.verify(() -> PropertySourceOrigin.get(mapPropertySource, ""), atLeast(1));
				propertySourceOrigin.verify(() -> PropertySourceOrigin.get(enumerablePropertySourceMock, "name1"), atLeast(1));
				verify(target, times(3)).getPropertySource();
				verify(propertySourceMock).getProperty("");
				configurationProperty.verify(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object), eq(originMock)));
				verify(enumerablePropertySourceMock2).getProperty("name1");
				configurationProperty.verify(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object2), eq(originMock2)));
			});
		}
	}

	//Sapient generated method id: ${e893205b-f056-31da-9a8b-883b9fa7b02b}, hash: 0CB28F2AD765D12F1FD390D8F1CFE892
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
		try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
			 MockedStatic<PropertySourceOrigin> propertySourceOrigin = mockStatic(PropertySourceOrigin.class)) {
			Map map = new HashMap<>();
			MapPropertySource mapPropertySource = new MapPropertySource("name1", map);
			propertySourceOrigin.when(() -> PropertySourceOrigin.get(mapPropertySource, "")).thenReturn(originMock);
			PropertyMapper[] propertyMapperArray2 = new PropertyMapper[] {};
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperArray2 };
			SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapPropertySource, propertyMapperArray));
			Object object = new Object();
			doReturn(object).when(propertySourceMock).getProperty("");
			configurationProperty.when(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object), eq(originMock))).thenReturn(null);
			doReturn(propertySourceMock, enumerablePropertySourceMock).when(target).getPropertySource();
			doReturn(null).when(enumerablePropertySourceMock).getProperty("name1");
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("getConfigurationProperty_configurationPropertyName1-name1");
			//Act Statement(s)
			ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				propertySourceOrigin.verify(() -> PropertySourceOrigin.get(mapPropertySource, ""), atLeast(1));
				verify(target, times(2)).getPropertySource();
				verify(propertySourceMock).getProperty("");
				configurationProperty.verify(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object), eq(originMock)));
				verify(enumerablePropertySourceMock).getProperty("name1");
			});
		}
	}

	//Sapient generated method id: ${e105d3be-5472-393b-b059-b658a063d376}, hash: 7F86347487DC6FE913F1AF2C9009EB4C
	@Test()
	void getConfigurationPropertyWhenGetMappingsGetMappedNameIsNotEmptyAndValueIsNotNull() {
		//Act Statement(s)
		//Assert statement(s)
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
		//TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
		//SpringIterableConfigurationPropertySource.Mappings springIterableConfigurationPropertySourceMappingsMock = mock(SpringIterableConfigurationPropertySource.Mappings.class);
		//EnumerablePropertySource<?> enumerablePropertySourceMock4 = mock(EnumerablePropertySource.class);
		//_assert.when(() -> Assert.isTrue(false, "Mappers must contain at least one item")).thenAnswer((Answer<Void>) invocation -> null);
		//propertySourceOrigin.when(() -> PropertySourceOrigin.get(enumerablePropertySourceMock, "name1")).thenReturn(originMock);
		//Map map = new HashMap<>();
		//MapPropertySource mapPropertySource = new MapPropertySource("name1", map);
		//PropertyMapper[] propertyMapperArray = new PropertyMapper[] {};
		//SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapPropertySource, propertyMapperArray));
		//doReturn("String").when(enumerablePropertySourceMock2).getName();
		//String[] stringArray = new String[] {};
		//doReturn(stringArray).when(enumerablePropertySourceMock3).getPropertyNames();
		//doReturn(springIterableConfigurationPropertySourceMappingsMock).when(cacheMock).get((Supplier) any(), (UnaryOperator) any());
		//Object object = new Object();
		//doReturn(object).when(enumerablePropertySourceMock4).getProperty("name1");
		//doReturn(enumerablePropertySourceMock2, enumerablePropertySourceMock3, enumerablePropertySourceMock4, enumerablePropertySourceMock).when(target).getPropertySource();
		//configurationProperty.when(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object), eq(originMock))).thenReturn(configurationPropertyMock);
		//ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("getConfigurationProperty_configurationPropertyName1-name1");
		//ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyName);
		//assertAll("result", () -> {    assertThat(result, equalTo(configurationPropertyMock));    _assert.verify(() -> Assert.isTrue(false, "Mappers must contain at least one item"), atLeast(1));    propertySourceOrigin.verify(() -> PropertySourceOrigin.get(enumerablePropertySourceMock, "name1"), atLeast(1));    verify(target, times(4)).getPropertySource();    verify(enumerablePropertySourceMock2, atLeast(1)).getName();    verify(enumerablePropertySourceMock3, atLeast(1)).getPropertyNames();    verify(cacheMock, atLeast(1)).get((Supplier) any(), (UnaryOperator) any());    verify(enumerablePropertySourceMock4, atLeast(1)).getProperty("name1");    configurationProperty.verify(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object), eq(originMock)), atLeast(1));});
	}

	//Sapient generated method id: ${9050c48e-938a-32db-b9a6-0eb22f72c7dc}, hash: 97E6DC900EF2318778795843E64B2BF2
	@Test()
	void getConfigurationPropertyWhenGetMappingsGetMappedNameIsNotEmptyAndValueIsNull() {
		//Act Statement(s)
		//Assert statement(s)
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
		//TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
		//SpringIterableConfigurationPropertySource.Mappings springIterableConfigurationPropertySourceMappingsMock = mock(SpringIterableConfigurationPropertySource.Mappings.class);
		//_assert.when(() -> Assert.isTrue(false, "Mappers must contain at least one item")).thenAnswer((Answer<Void>) invocation -> null);
		//Map map = new HashMap<>();
		//MapPropertySource mapPropertySource = new MapPropertySource("name1", map);
		//PropertyMapper[] propertyMapperArray = new PropertyMapper[] {};
		//SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapPropertySource, propertyMapperArray));
		//doReturn("String").when(enumerablePropertySourceMock).getName();
		//String[] stringArray = new String[] {};
		//doReturn(stringArray).when(enumerablePropertySourceMock2).getPropertyNames();
		//doReturn(springIterableConfigurationPropertySourceMappingsMock).when(cacheMock).get((Supplier) any(), (UnaryOperator) any());
		//doReturn(enumerablePropertySourceMock, enumerablePropertySourceMock2, enumerablePropertySourceMock3).when(target).getPropertySource();
		//doReturn(null).when(enumerablePropertySourceMock3).getProperty("name1");
		//ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("getConfigurationProperty_configurationPropertyName1-name1");
		//ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyName);
		//assertAll("result", () -> {    assertThat(result, is(nullValue()));    _assert.verify(() -> Assert.isTrue(false, "Mappers must contain at least one item"), atLeast(1));    verify(target, times(3)).getPropertySource();    verify(enumerablePropertySourceMock, atLeast(1)).getName();    verify(enumerablePropertySourceMock2, atLeast(1)).getPropertyNames();    verify(cacheMock, atLeast(1)).get((Supplier) any(), (UnaryOperator) any());    verify(enumerablePropertySourceMock3, atLeast(1)).getProperty("name1");});
	}

	//Sapient generated method id: ${d3831c55-97fb-36f6-9e97-7248c23be7cc}, hash: 437318112BF9C1FEED1D2F1E580AF587
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

	//Sapient generated method id: ${15837300-d633-3fc1-8480-7507eacca3a1}, hash: 220272D8A9D88F3717CDCF18E6FBB99E
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
			Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("PATH", "/usr/bin:/bin:/usr/sbin:/sbin"), entry("__CFBundleIdentifier", "com.jetbrains.intellij.ce"), entry("SSH_AUTH_SOCK", "/private/tmp/com.apple.launchd.1rMtkNYIBp/Listeners"), entry("XPC_FLAGS", "0x0"), entry("SHELL", "/bin/zsh"), entry("__CF_USER_TEXT_ENCODING", "0x1F5:0x0:0x0"), entry("LOGNAME", "vikas"), entry("XPC_SERVICE_NAME", "application.com.jetbrains.intellij.ce.91092297.91092994"), entry("USER", "vikas"), entry("HOME", "/Users/vikas"), entry("TMPDIR", "/var/folders/jh/3z7pdtt9017fmmx9nffxch240000gn/T/"), entry("COMMAND_MODE", "unix2003")));
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

	//Sapient generated method id: ${29532aaf-aa83-3bbc-bab1-a7aa401044f9}, hash: 34B5FDC3969F520921A34A5EDA96B718
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
			Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("PATH", "/usr/bin:/bin:/usr/sbin:/sbin"), entry("__CFBundleIdentifier", "com.jetbrains.intellij.ce"), entry("SSH_AUTH_SOCK", "/private/tmp/com.apple.launchd.1rMtkNYIBp/Listeners"), entry("XPC_FLAGS", "0x0"), entry("SHELL", "/bin/zsh"), entry("__CF_USER_TEXT_ENCODING", "0x1F5:0x0:0x0"), entry("LOGNAME", "vikas"), entry("XPC_SERVICE_NAME", "application.com.jetbrains.intellij.ce.91092297.91092994"), entry("USER", "vikas"), entry("HOME", "/Users/vikas"), entry("TMPDIR", "/var/folders/jh/3z7pdtt9017fmmx9nffxch240000gn/T/"), entry("COMMAND_MODE", "unix2003")));
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

	//Sapient generated method id: ${9fb0ca08-ed2e-31c2-a1d9-0392e69db412}, hash: 8366D9E38E45F76A9B9717D944C7E73C
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
			Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("PATH", "/usr/bin:/bin:/usr/sbin:/sbin"), entry("__CFBundleIdentifier", "com.jetbrains.intellij.ce"), entry("SSH_AUTH_SOCK", "/private/tmp/com.apple.launchd.1rMtkNYIBp/Listeners"), entry("XPC_FLAGS", "0x0"), entry("SHELL", "/bin/zsh"), entry("__CF_USER_TEXT_ENCODING", "0x1F5:0x0:0x0"), entry("LOGNAME", "vikas"), entry("XPC_SERVICE_NAME", "application.com.jetbrains.intellij.ce.91092297.91092994"), entry("USER", "vikas"), entry("HOME", "/Users/vikas"), entry("TMPDIR", "/var/folders/jh/3z7pdtt9017fmmx9nffxch240000gn/T/"), entry("COMMAND_MODE", "unix2003")));
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

	//Sapient generated method id: ${4739748f-ab7f-3670-b7b9-3d8a3e4f2a31}, hash: 40662D89D912BCB3ED7322110E04343F
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
			Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("PATH", "/usr/bin:/bin:/usr/sbin:/sbin"), entry("__CFBundleIdentifier", "com.jetbrains.intellij.ce"), entry("SSH_AUTH_SOCK", "/private/tmp/com.apple.launchd.1rMtkNYIBp/Listeners"), entry("XPC_FLAGS", "0x0"), entry("SHELL", "/bin/zsh"), entry("__CF_USER_TEXT_ENCODING", "0x1F5:0x0:0x0"), entry("LOGNAME", "vikas"), entry("XPC_SERVICE_NAME", "application.com.jetbrains.intellij.ce.91092297.91092994"), entry("USER", "vikas"), entry("HOME", "/Users/vikas"), entry("TMPDIR", "/var/folders/jh/3z7pdtt9017fmmx9nffxch240000gn/T/"), entry("COMMAND_MODE", "unix2003")));
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

	//Sapient generated method id: ${cbdd9389-5eb8-3391-bbcd-f3454860f4c7}, hash: 5C55D56BB0F66ED8E95AE44A180708E3
	@Test()
	void getPropertySource1Test() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Map map = new HashMap<>();
		MapPropertySource mapPropertySource = new MapPropertySource("name1", map);
		PropertyMapper propertyMapperMock = mock(PropertyMapper.class, "value");
		PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
		SpringIterableConfigurationPropertySource target = new SpringIterableConfigurationPropertySource(mapPropertySource, propertyMapperArray);

		//Act Statement(s)
		EnumerablePropertySource<?> result = target.getPropertySource();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
