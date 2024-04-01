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
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringIterableConfigurationPropertySourceSapientGeneratedTest {

	private final BiPredicate biPredicateMock = mock(BiPredicate.class);

	private final BiPredicate biPredicateMock2 = mock(BiPredicate.class);

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final EnumerablePropertySource<?> enumerablePropertySourceMock = mock(EnumerablePropertySource.class);

	private final EnumerablePropertySource<?> enumerablePropertySourceMock2 = mock(EnumerablePropertySource.class);

	private final MapPropertySource mapSourceMock = mock(MapPropertySource.class);

	private final Origin originMock = mock(Origin.class);

	private final Origin originMock2 = mock(Origin.class);

	private final Origin originMock3 = mock(Origin.class);

	private final PropertyMapper propertyMapperMock = mock(PropertyMapper.class);

	private final PropertyMapper propertyMapperMock2 = mock(PropertyMapper.class);

	private final PropertySource<?> propertySourceMock = mock(PropertySource.class);

	//Sapient generated method id: ${ee2e73e4-ef45-316b-bf2a-4acf0f0898a5}, hash: DE0DFEF44D4408457BC550ADBF85C45E
	@Test()
	void getCachingTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Map map = new HashMap<>();
			MapPropertySource mapPropertySource = new MapPropertySource("systemEnvironment", map);
			_assert.when(() -> Assert.notNull(mapPropertySource, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(true, "Mappers must contain at least one item")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
			SpringIterableConfigurationPropertySource target = new SpringIterableConfigurationPropertySource(mapPropertySource, propertyMapperArray);
			//Act Statement(s)
			ConfigurationPropertyCaching result = target.getCaching();
			//Assert statement(s)
			//TODO: Please implement equals method in SoftReferenceConfigurationPropertyCache for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(mapPropertySource, "PropertySource must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(true, "Mappers must contain at least one item"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${b9f4539f-22c1-3b32-b0e6-3ab60afe5a86}, hash: 57A88C497A3254312F0C55ECB16FFF86
	@Test()
	void getConfigurationPropertyWhenNameIsNull() {
		/* Branches:
		 * (name == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Map map = new HashMap<>();
			MapPropertySource mapPropertySource = new MapPropertySource("systemEnvironment", map);
			_assert.when(() -> Assert.notNull(mapPropertySource, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(true, "Mappers must contain at least one item")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
			SpringIterableConfigurationPropertySource target = new SpringIterableConfigurationPropertySource(mapPropertySource, propertyMapperArray);
			ConfigurationPropertyName configurationPropertyName = null;
			//Act Statement(s)
			ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.notNull(mapPropertySource, "PropertySource must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(true, "Mappers must contain at least one item"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${87d2c1c5-91e5-3fb5-83d2-294d6c587a4a}, hash: AE5BAA21D23629119C989E9761C60C76
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
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Map map = new HashMap<>();
			MapPropertySource mapPropertySource = new MapPropertySource("systemEnvironment", map);
			_assert.when(() -> Assert.notNull(mapPropertySource, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(true, "Mappers must contain at least one item")).thenAnswer((Answer<Void>) invocation -> null);
			propertySourceOrigin.when(() -> PropertySourceOrigin.get(mapPropertySource, "<List<String>>")).thenReturn(originMock);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
			SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapPropertySource, propertyMapperArray));
			doReturn(propertySourceMock).when(target).getPropertySource();
			Object object = new Object();
			doReturn(object).when(propertySourceMock).getProperty("<List<String>>");
			Object object2 = new Object();
			ConfigurationProperty configurationProperty2 = new ConfigurationProperty(configurationPropertyNameMock, object2, originMock2);
			configurationProperty.when(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object), eq(originMock))).thenReturn(configurationProperty2);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("getConfigurationProperty_configurationPropertyName1-name1");
			//Act Statement(s)
			ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationProperty2));
				_assert.verify(() -> Assert.notNull(mapPropertySource, "PropertySource must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(true, "Mappers must contain at least one item"), atLeast(1));
				propertySourceOrigin.verify(() -> PropertySourceOrigin.get(mapPropertySource, "<List<String>>"), atLeast(1));
				verify(target).getPropertySource();
				verify(propertySourceMock).getProperty("<List<String>>");
				configurationProperty.verify(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object), eq(originMock)));
			});
		}
	}

	//Sapient generated method id: ${9fc1eebb-964a-3d08-9dbf-f24b53dfd687}, hash: 2AD25353248FC07ECAE12C8523ADBDC0
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Map map = new HashMap<>();
			doReturn(map).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			doReturn(null).when(mapSourceMock).getProperty("return_of_mapItem1");
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			List<String> stringList = new ArrayList<>();
			stringList.add("return_of_mapItem1");
			doReturn(stringList).when(propertyMapperMock).map(configurationPropertyNameMock);
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(true, "Mappers must contain at least one item")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray);
			//Act Statement(s)
			ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(mapSourceMock, times(2)).getSource();
				verify(mapSourceMock).getName();
				verify(mapSourceMock).getProperty("return_of_mapItem1");
				verify(propertyMapperMock).getAncestorOfCheck();
				verify(propertyMapperMock).map(configurationPropertyNameMock);
				verify(propertyMapperMock2).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(true, "Mappers must contain at least one item"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${57054a1e-10ca-3fbe-8b8c-9d6a45d7edfc}, hash: 3C8133124207DDE8BFE8988E8AEAE38A
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
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Map map = new HashMap<>();
			MapPropertySource mapPropertySource = new MapPropertySource("systemEnvironment", map);
			_assert.when(() -> Assert.notNull(mapPropertySource, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(true, "Mappers must contain at least one item")).thenAnswer((Answer<Void>) invocation -> null);
			propertySourceOrigin.when(() -> PropertySourceOrigin.get(mapPropertySource, "<List<String>>")).thenReturn(originMock);
			propertySourceOrigin.when(() -> PropertySourceOrigin.get(enumerablePropertySourceMock, "arg0")).thenReturn(originMock2);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
			SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapPropertySource, propertyMapperArray));
			Object object = new Object();
			doReturn(object).when(propertySourceMock).getProperty("<List<String>>");
			configurationProperty.when(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object), eq(originMock))).thenReturn(null);
			Object object2 = new Object();
			doReturn(object2).when(enumerablePropertySourceMock2).getProperty("arg0");
			doReturn(propertySourceMock, enumerablePropertySourceMock2, enumerablePropertySourceMock).when(target).getPropertySource();
			Object object3 = new Object();
			ConfigurationProperty configurationProperty2 = new ConfigurationProperty(configurationPropertyNameMock, object3, originMock3);
			configurationProperty.when(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object2), eq(originMock2))).thenReturn(configurationProperty2);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("getConfigurationProperty_configurationPropertyName1-name1");
			//Act Statement(s)
			ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationProperty2));
				_assert.verify(() -> Assert.notNull(mapPropertySource, "PropertySource must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(true, "Mappers must contain at least one item"), atLeast(1));
				propertySourceOrigin.verify(() -> PropertySourceOrigin.get(mapPropertySource, "<List<String>>"), atLeast(1));
				propertySourceOrigin.verify(() -> PropertySourceOrigin.get(enumerablePropertySourceMock, "arg0"), atLeast(1));
				verify(target, times(3)).getPropertySource();
				verify(propertySourceMock).getProperty("<List<String>>");
				configurationProperty.verify(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object), eq(originMock)));
				verify(enumerablePropertySourceMock2).getProperty("arg0");
				configurationProperty.verify(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object2), eq(originMock2)));
			});
		}
	}

	//Sapient generated method id: ${e893205b-f056-31da-9a8b-883b9fa7b02b}, hash: 863EE2E16A144061D9F2346E6CC4C516
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
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Map map = new HashMap<>();
			MapPropertySource mapPropertySource = new MapPropertySource("systemEnvironment", map);
			_assert.when(() -> Assert.notNull(mapPropertySource, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(true, "Mappers must contain at least one item")).thenAnswer((Answer<Void>) invocation -> null);
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
				_assert.verify(() -> Assert.notNull(mapPropertySource, "PropertySource must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(true, "Mappers must contain at least one item"), atLeast(1));
				propertySourceOrigin.verify(() -> PropertySourceOrigin.get(mapPropertySource, "<List<String>>"), atLeast(1));
				verify(target, times(2)).getPropertySource();
				verify(propertySourceMock).getProperty("<List<String>>");
				configurationProperty.verify(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object), eq(originMock)));
				verify(enumerablePropertySourceMock).getProperty("arg0");
			});
		}
	}

	//Sapient generated method id: ${e105d3be-5472-393b-b059-b658a063d376}, hash: 73D4EAE90721426AF8F30DA2433A02A7
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
		ConfigurationProperty configurationPropertyMock = mock(ConfigurationProperty.class);
		try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
			 MockedStatic<PropertySourceOrigin> propertySourceOrigin = mockStatic(PropertySourceOrigin.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Map map = new HashMap<>();
			MapPropertySource mapPropertySource = new MapPropertySource("systemEnvironment", map);
			_assert.when(() -> Assert.notNull(mapPropertySource, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(true, "Mappers must contain at least one item")).thenAnswer((Answer<Void>) invocation -> null);
			propertySourceOrigin.when(() -> PropertySourceOrigin.get(mapPropertySource, "<List<String>>")).thenReturn(originMock);
			propertySourceOrigin.when(() -> PropertySourceOrigin.get(enumerablePropertySourceMock, "arg0")).thenReturn(originMock2);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
			SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapPropertySource, propertyMapperArray));
			Object object = new Object();
			doReturn(object).when(propertySourceMock).getProperty("<List<String>>");
			configurationProperty.when(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object), eq(originMock))).thenReturn(configurationPropertyMock);
			Object object2 = new Object();
			doReturn(object2).when(enumerablePropertySourceMock2).getProperty("arg0");
			doReturn(propertySourceMock, enumerablePropertySourceMock2, enumerablePropertySourceMock).when(target).getPropertySource();
			Object object3 = new Object();
			ConfigurationProperty configurationProperty2 = new ConfigurationProperty(configurationPropertyNameMock, object3, originMock3);
			configurationProperty.when(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object2), eq(originMock2))).thenReturn(configurationProperty2);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("getConfigurationProperty_configurationPropertyName1-name1");
			//Act Statement(s)
			ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationProperty2));
				_assert.verify(() -> Assert.notNull(mapPropertySource, "PropertySource must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(true, "Mappers must contain at least one item"), atLeast(1));
				propertySourceOrigin.verify(() -> PropertySourceOrigin.get(mapPropertySource, "<List<String>>"), atLeast(1));
				propertySourceOrigin.verify(() -> PropertySourceOrigin.get(enumerablePropertySourceMock, "arg0"), atLeast(1));
				verify(target, times(3)).getPropertySource();
				verify(propertySourceMock).getProperty("<List<String>>");
				configurationProperty.verify(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object), eq(originMock)));
				verify(enumerablePropertySourceMock2).getProperty("arg0");
				configurationProperty.verify(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object2), eq(originMock2)));
			});
		}
	}

	//Sapient generated method id: ${9050c48e-938a-32db-b9a6-0eb22f72c7dc}, hash: EBC77276AECAB4CDDFEEE4AF5E43008B
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
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Map map = new HashMap<>();
			MapPropertySource mapPropertySource = new MapPropertySource("systemEnvironment", map);
			_assert.when(() -> Assert.notNull(mapPropertySource, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(true, "Mappers must contain at least one item")).thenAnswer((Answer<Void>) invocation -> null);
			propertySourceOrigin.when(() -> PropertySourceOrigin.get(mapPropertySource, "<List<String>>")).thenReturn(originMock);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
			SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapPropertySource, propertyMapperArray));
			Object object = new Object();
			doReturn(object).when(propertySourceMock).getProperty("<List<String>>");
			Object object2 = new Object();
			ConfigurationProperty configurationProperty2 = new ConfigurationProperty(configurationPropertyNameMock, object2, originMock2);
			configurationProperty.when(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object), eq(originMock))).thenReturn(configurationProperty2);
			doReturn(propertySourceMock, enumerablePropertySourceMock).when(target).getPropertySource();
			doReturn(null).when(enumerablePropertySourceMock).getProperty("arg0");
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("getConfigurationProperty_configurationPropertyName1-name1");
			//Act Statement(s)
			ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.notNull(mapPropertySource, "PropertySource must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(true, "Mappers must contain at least one item"), atLeast(1));
				propertySourceOrigin.verify(() -> PropertySourceOrigin.get(mapPropertySource, "<List<String>>"), atLeast(1));
				verify(target, times(2)).getPropertySource();
				verify(propertySourceMock).getProperty("<List<String>>");
				configurationProperty.verify(() -> ConfigurationProperty.of(eq(target), (ConfigurationPropertyName) any(), eq(object), eq(originMock)));
				verify(enumerablePropertySourceMock).getProperty("arg0");
			});
		}
	}

	//Sapient generated method id: ${d3831c55-97fb-36f6-9e97-7248c23be7cc}, hash: 3CB287AB6285E4ADE17C0910BC4D3D6D
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Map map = new HashMap<>();
			doReturn(map).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(true, "Mappers must contain at least one item")).thenAnswer((Answer<Void>) invocation -> null);
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
				verify(mapSourceMock).getName();
				verify(propertyMapperMock).getAncestorOfCheck();
				verify(propertyMapperMock2).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(true, "Mappers must contain at least one item"), atLeast(1));
				verify(target, times(2)).getPropertySource();
				verify(enumerablePropertySourceMock).getName();
				verify(enumerablePropertySourceMock2).getPropertyNames();
			});
		}
	}

	//Sapient generated method id: ${f2c28042-b6a8-3d46-a8a9-732e5704ff04}, hash: BB7FDBADC4FC96239A0DD99244AEC115
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Map map = new HashMap<>();
			doReturn(map).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(true, "Mappers must contain at least one item")).thenAnswer((Answer<Void>) invocation -> null);
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
				verify(mapSourceMock).getName();
				verify(propertyMapperMock).getAncestorOfCheck();
				verify(propertyMapperMock2).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(true, "Mappers must contain at least one item"), atLeast(1));
				verify(target, times(2)).getPropertySource();
				verify(enumerablePropertySourceMock).getName();
				verify(enumerablePropertySourceMock).getSource();
				verify(enumerablePropertySourceMock2).getPropertyNames();
			});
		}
	}

	//Sapient generated method id: ${15837300-d633-3fc1-8480-7507eacca3a1}, hash: 19789D86050E077C0E7DDA25B57C9252
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Map map = new HashMap<>();
			doReturn(map).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(true, "Mappers must contain at least one item")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
			doReturn("systemEnvironment").when(enumerablePropertySourceMock).getName();
			Map<String, String> stringStringMap = new HashMap<>();
			doReturn(stringStringMap).when(enumerablePropertySourceMock).getSource();
			doReturn(enumerablePropertySourceMock, enumerablePropertySourceMock2).when(target).getPropertySource();
			String[] stringArray = new String[] {};
			doReturn(stringArray).when(enumerablePropertySourceMock2).getPropertyNames();
			//Act Statement(s)
			Stream<ConfigurationPropertyName> result = target.stream();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(mapSourceMock, times(2)).getSource();
				verify(mapSourceMock).getName();
				verify(propertyMapperMock).getAncestorOfCheck();
				verify(propertyMapperMock2).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(true, "Mappers must contain at least one item"), atLeast(1));
				verify(target, times(2)).getPropertySource();
				verify(enumerablePropertySourceMock).getName();
				verify(enumerablePropertySourceMock).getSource();
				verify(enumerablePropertySourceMock2).getPropertyNames();
			});
		}
	}

	//Sapient generated method id: ${cf8a5d39-ae43-3644-96ff-2e7c71af28b9}, hash: 92BBFD952CB9C333ACD74A4B875849A4
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Map map = new HashMap<>();
			doReturn(map).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(true, "Mappers must contain at least one item")).thenAnswer((Answer<Void>) invocation -> null);
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
				verify(mapSourceMock).getName();
				verify(propertyMapperMock).getAncestorOfCheck();
				verify(propertyMapperMock2).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(true, "Mappers must contain at least one item"), atLeast(1));
				verify(target, times(2)).getPropertySource();
				verify(enumerablePropertySourceMock).getName();
				verify(enumerablePropertySourceMock2).getPropertyNames();
			});
		}
	}

	//Sapient generated method id: ${989baa53-a8dd-3271-a5f1-93759b7cded4}, hash: 8D834008060AA8440E7130BF96514E67
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Map map = new HashMap<>();
			doReturn(map).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(true, "Mappers must contain at least one item")).thenAnswer((Answer<Void>) invocation -> null);
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
				verify(mapSourceMock).getName();
				verify(propertyMapperMock).getAncestorOfCheck();
				verify(propertyMapperMock2).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(true, "Mappers must contain at least one item"), atLeast(1));
				verify(target, times(2)).getPropertySource();
				verify(enumerablePropertySourceMock).getName();
				verify(enumerablePropertySourceMock).getSource();
				verify(enumerablePropertySourceMock2).getPropertyNames();
			});
		}
	}

	//Sapient generated method id: ${29532aaf-aa83-3bbc-bab1-a7aa401044f9}, hash: D043DA3E5C8076CDAA474EF38BCA5FDC
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Map map = new HashMap<>();
			doReturn(map).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(true, "Mappers must contain at least one item")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
			doReturn("systemEnvironment").when(enumerablePropertySourceMock).getName();
			Map<String, String> stringStringMap = new HashMap<>();
			doReturn(stringStringMap).when(enumerablePropertySourceMock).getSource();
			doReturn(enumerablePropertySourceMock, enumerablePropertySourceMock2).when(target).getPropertySource();
			String[] stringArray = new String[] {};
			doReturn(stringArray).when(enumerablePropertySourceMock2).getPropertyNames();
			//Act Statement(s)
			Iterator<ConfigurationPropertyName> result = target.iterator();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(mapSourceMock, times(2)).getSource();
				verify(mapSourceMock).getName();
				verify(propertyMapperMock).getAncestorOfCheck();
				verify(propertyMapperMock2).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(true, "Mappers must contain at least one item"), atLeast(1));
				verify(target, times(2)).getPropertySource();
				verify(enumerablePropertySourceMock).getName();
				verify(enumerablePropertySourceMock).getSource();
				verify(enumerablePropertySourceMock2).getPropertyNames();
			});
		}
	}

	//Sapient generated method id: ${182a0c69-945f-3716-a1d7-c802b7e83095}, hash: 6F8520E3ABD957635CF16B50780B91E2
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Map map = new HashMap<>();
			doReturn(map).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(true, "Mappers must contain at least one item")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray);
			//Act Statement(s)
			ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.PRESENT));
				verify(mapSourceMock, times(3)).getSource();
				verify(mapSourceMock).getName();
				verify(propertyMapperMock).getAncestorOfCheck();
				verify(propertyMapperMock2).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(true, "Mappers must contain at least one item"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${04a7e493-84fd-3b5a-b0f4-78402cbdf3a6}, hash: 0C58ADAFB9CBDB1B5323E80D4289E371
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Map map = new HashMap<>();
			doReturn(map).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(true, "Mappers must contain at least one item")).thenAnswer((Answer<Void>) invocation -> null);
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
				verify(mapSourceMock).getName();
				verify(propertyMapperMock).getAncestorOfCheck();
				verify(propertyMapperMock2).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(true, "Mappers must contain at least one item"), atLeast(1));
				verify(target, times(2)).getPropertySource();
				verify(enumerablePropertySourceMock).getName();
				verify(enumerablePropertySourceMock2).getPropertyNames();
			});
		}
	}

	//Sapient generated method id: ${79f37c4e-7f19-31d8-9bf6-e72a79eac3ec}, hash: E2E27026BC79B153867BDC92671BF94E
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Map map = new HashMap<>();
			doReturn(map).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(true, "Mappers must contain at least one item")).thenAnswer((Answer<Void>) invocation -> null);
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
				verify(mapSourceMock).getName();
				verify(propertyMapperMock).getAncestorOfCheck();
				verify(propertyMapperMock2).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(true, "Mappers must contain at least one item"), atLeast(1));
				verify(target, times(2)).getPropertySource();
				verify(enumerablePropertySourceMock).getName();
				verify(enumerablePropertySourceMock).getSource();
				verify(enumerablePropertySourceMock2).getPropertyNames();
			});
		}
	}

	//Sapient generated method id: ${9fb0ca08-ed2e-31c2-a1d9-0392e69db412}, hash: 4BDF0AD070FBB649CE744B3770910C0A
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Map map = new HashMap<>();
			doReturn(map).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(true, "Mappers must contain at least one item")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
			doReturn("systemEnvironment").when(enumerablePropertySourceMock).getName();
			Map<String, String> stringStringMap = new HashMap<>();
			doReturn(stringStringMap).when(enumerablePropertySourceMock).getSource();
			doReturn(enumerablePropertySourceMock, enumerablePropertySourceMock2).when(target).getPropertySource();
			String[] stringArray = new String[] {};
			doReturn(stringArray).when(enumerablePropertySourceMock2).getPropertyNames();
			//Act Statement(s)
			ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.PRESENT));
				verify(mapSourceMock, times(3)).getSource();
				verify(mapSourceMock).getName();
				verify(propertyMapperMock).getAncestorOfCheck();
				verify(propertyMapperMock2).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(true, "Mappers must contain at least one item"), atLeast(1));
				verify(target, times(2)).getPropertySource();
				verify(enumerablePropertySourceMock).getName();
				verify(enumerablePropertySourceMock).getSource();
				verify(enumerablePropertySourceMock2).getPropertyNames();
			});
		}
	}

	//Sapient generated method id: ${4739748f-ab7f-3670-b7b9-3d8a3e4f2a31}, hash: 4E4EBC14418B37B62CCA9C0EB3BFD411
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Map map = new HashMap<>();
			doReturn(map).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(true, "Mappers must contain at least one item")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
			doReturn("systemEnvironment").when(enumerablePropertySourceMock).getName();
			Map<String, String> stringStringMap = new HashMap<>();
			doReturn(stringStringMap).when(enumerablePropertySourceMock).getSource();
			doReturn(enumerablePropertySourceMock, enumerablePropertySourceMock2).when(target).getPropertySource();
			String[] stringArray = new String[] {};
			doReturn(stringArray).when(enumerablePropertySourceMock2).getPropertyNames();
			//Act Statement(s)
			ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.ABSENT));
				verify(mapSourceMock, times(3)).getSource();
				verify(mapSourceMock).getName();
				verify(propertyMapperMock).getAncestorOfCheck();
				verify(propertyMapperMock2).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(true, "Mappers must contain at least one item"), atLeast(1));
				verify(target, times(2)).getPropertySource();
				verify(enumerablePropertySourceMock).getName();
				verify(enumerablePropertySourceMock).getSource();
				verify(enumerablePropertySourceMock2).getPropertyNames();
			});
		}
	}

	//Sapient generated method id: ${cbdd9389-5eb8-3391-bbcd-f3454860f4c7}, hash: 7DBF5F3FC7684B20BEFCDF9A15301D5D
	@Test()
	void getPropertySource1Test() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		PropertyMapper propertyMapperMock = mock(PropertyMapper.class, "value");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Map map = new HashMap<>();
			MapPropertySource mapPropertySource = new MapPropertySource("systemEnvironment", map);
			_assert.when(() -> Assert.notNull(mapPropertySource, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(true, "Mappers must contain at least one item")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
			SpringIterableConfigurationPropertySource target = new SpringIterableConfigurationPropertySource(mapPropertySource, propertyMapperArray);
			//Act Statement(s)
			EnumerablePropertySource<?> result = target.getPropertySource();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(mapPropertySource, "PropertySource must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(true, "Mappers must contain at least one item"), atLeast(1));
			});
		}
	}
}
