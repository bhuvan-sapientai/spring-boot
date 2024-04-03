package org.springframework.boot.context.properties.source;

import org.springframework.boot.context.properties.source.ConfigurationPropertySourcesPropertyResolver;

import org.springframework.boot.context.properties.source.ConfigurationPropertySources;
import org.springframework.core.env.*;
import org.springframework.boot.context.properties.source.ConfigurationPropertySourcesPropertySource;

import java.lang.Class;

import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.core.convert.ConversionService;
import org.springframework.util.ClassUtils;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.boot.context.properties.source.ConfigurationPropertySourcesPropertyResolver;

import java.lang.*;

import org.springframework.boot.context.properties.source.*;
import org.springframework.util.*;
import org.springframework.boot.context.properties.source.ConfigurationProperty;

import java.lang.Iterable;

import org.springframework.core.env.MutablePropertySources;
import org.springframework.boot.context.properties.source.SpringConfigurationPropertySources;
import org.springframework.core.convert.*;

import java.lang.Object;

import org.springframework.core.convert.support.*;
import org.springframework.core.env.PropertySourcesPropertyResolver;
import org.springframework.core.env.PropertySources;
import org.springframework.core.env.AbstractPropertyResolver;
import org.springframework.core.env.MutablePropertySources;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsInstanceOf.*;
import static org.hamcrest.MatcherAssert.*;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.eq;

import org.hamcrest.Matchers;
import org.hamcrest.core.IsInstanceOf;
import org.hamcrest.MatcherAssert;
import org.mockito.Mockito;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;
import org.mockito.MockitoAnnotations;
import org.mockito.Mock;

import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.net.*;
import java.beans.*;

import javax.net.*;
import javax.annotation.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

class ConfigurationPropertySourcesPropertyResolverGetPropertyEnhancedTest {

	private ConfigurationPropertySourcesPropertyResolver propertyResolver;

	private MutablePropertySources propertySources;

	@BeforeEach
	void setUp() {
		propertySources = Mockito.mock(MutablePropertySources.class);
		propertyResolver = new ConfigurationPropertySourcesPropertyResolver(propertySources);
	}

	@Test
	void getProperty_whenPropertyExists_shouldReturnConvertedValue() {
		String key = "test.property";
		Class<String> targetValueType = String.class;
		String expectedValue = "expectedValue";
		try (MockedStatic<ClassUtils> classUtilsMockedStatic = Mockito.mockStatic(ClassUtils.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySourcesMockedStatic = Mockito.mockStatic(ConfigurationPropertySources.class);
			 MockedStatic<DefaultConversionService> defaultConversionServiceMockedStatic = Mockito.mockStatic(DefaultConversionService.class)) {
			classUtilsMockedStatic.when(() -> ClassUtils.isAssignableValue(eq(targetValueType), any())).thenReturn(true);
			configurationPropertySourcesMockedStatic.when(() -> ConfigurationPropertySources.getAttached(eq(propertySources))).thenReturn(null);
			ConversionService conversionService = Mockito.mock(ConversionService.class);
			defaultConversionServiceMockedStatic.when(DefaultConversionService::getSharedInstance).thenReturn(conversionService);
			Mockito.when(conversionService.convert(any(), eq(targetValueType))).thenReturn(expectedValue);
			String actualValue = propertyResolver.getProperty(key, targetValueType);
			assertEquals(expectedValue, actualValue);
		}
	}

	@Test
	void getProperty_whenPropertyDoesNotExist_shouldReturnNull() {
		String key = "non.existent.property";
		Class<String> targetValueType = String.class;
		try (MockedStatic<ConfigurationPropertySources> configurationPropertySourcesMockedStatic = Mockito.mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySourcesMockedStatic.when(() -> ConfigurationPropertySources.getAttached(eq(propertySources))).thenReturn(null);
			String actualValue = propertyResolver.getProperty(key, targetValueType);
			assertNull(actualValue);
		}
	}

	@Test
	void getProperty_whenPropertyExistsButTypeMismatch_shouldThrowException() {
		String key = "test.property";
		Class<Integer> targetValueType = Integer.class;
		String propertyValue = "notAnInteger";
		try (MockedStatic<ClassUtils> classUtilsMockedStatic = Mockito.mockStatic(ClassUtils.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySourcesMockedStatic = Mockito.mockStatic(ConfigurationPropertySources.class);
			 MockedStatic<DefaultConversionService> defaultConversionServiceMockedStatic = Mockito.mockStatic(DefaultConversionService.class)) {
			classUtilsMockedStatic.when(() -> ClassUtils.isAssignableValue(eq(targetValueType), any())).thenReturn(false);
			configurationPropertySourcesMockedStatic.when(() -> ConfigurationPropertySources.getAttached(eq(propertySources))).thenReturn(null);
			ConversionService conversionService = Mockito.mock(ConversionService.class);
			defaultConversionServiceMockedStatic.when(DefaultConversionService::getSharedInstance).thenReturn(conversionService);
			Mockito.when(conversionService.convert(propertyValue, targetValueType)).thenThrow(IllegalArgumentException.class);
			assertThrows(IllegalArgumentException.class, () -> propertyResolver.getProperty(key, targetValueType));
		}
	}
}
