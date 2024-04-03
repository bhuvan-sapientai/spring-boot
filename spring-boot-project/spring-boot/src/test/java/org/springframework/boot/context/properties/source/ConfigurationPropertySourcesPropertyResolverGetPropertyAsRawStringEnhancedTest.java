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
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
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

@ExtendWith(MockitoExtension.class)
class ConfigurationPropertySourcesPropertyResolverGetPropertyAsRawStringEnhancedTest {

	@Mock
	private MutablePropertySources propertySources;

	@Mock
	private PropertySourcesPropertyResolver defaultResolver;

	private ConfigurationPropertySourcesPropertyResolver propertyResolver;

	@BeforeEach
	void setUp() {
		propertyResolver = new ConfigurationPropertySourcesPropertyResolver(propertySources);
	}

	@Test
	void getPropertyAsRawStringWhenValueExists() {
		String key = "testKey";
		String expectedValue = "testValue";
		when(defaultResolver.getProperty(eq(key))).thenReturn(expectedValue);
		String actualValue = propertyResolver.getPropertyAsRawString(key);
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void getPropertyAsRawStringWhenValueDoesNotExist() {
		String key = "testKey";
		when(defaultResolver.getProperty(eq(key))).thenReturn(null);
		String actualValue = propertyResolver.getPropertyAsRawString(key);
		assertNull(actualValue);
	}

//	@Test
//	void getPropertyAsRawStringWithNestedPlaceholders() {
//		try (MockedStatic<DefaultConversionService> conversionServiceMockedStatic = mockStatic(DefaultConversionService.class);
//			 MockedStatic<ClassUtils> classUtilsMockedStatic = mockStatic(ClassUtils.class)) {
//			String key = "testKey";
//			String valueWithPlaceholder = "${nestedKey}";
//			String resolvedValue = "resolvedValue";
//			when(defaultResolver.getProperty(eq(key))).thenReturn(valueWithPlaceholder);
//			when(defaultResolver.resolveNestedPlaceholders(valueWithPlaceholder)).thenReturn(resolvedValue);
//			DefaultConversionService conversionService = mock(DefaultConversionService.class);
//			conversionServiceMockedStatic.when(DefaultConversionService::getSharedInstance).thenReturn(conversionService);
//			when(conversionService.convert(resolvedValue, String.class)).thenReturn(resolvedValue);
//			classUtilsMockedStatic.when(() -> ClassUtils.isAssignableValue(String.class, resolvedValue)).thenReturn(true);
//			String actualValue = propertyResolver.getPropertyAsRawString(key);
//			assertEquals(resolvedValue, actualValue);
//		}
//	}
}
