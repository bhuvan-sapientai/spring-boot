package org.springframework.boot.context.properties.source;

import org.springframework.boot.context.properties.source.ConfigurationPropertySourcesPropertySource;

import java.lang.*;

import org.springframework.boot.context.properties.source.*;
import org.springframework.boot.origin.Origin;
import org.springframework.boot.context.properties.source.ConfigurationPropertySourcesPropertySource;
import org.springframework.util.*;
import org.springframework.boot.context.properties.source.ConfigurationProperty;

import java.lang.Iterable;

import org.springframework.boot.context.properties.source.ConfigurationPropertySource;
import org.springframework.util.Assert;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import java.lang.Object;

import org.springframework.boot.origin.*;
import org.springframework.boot.origin.Origin;
import org.springframework.core.env.Environment;
import org.springframework.boot.origin.OriginLookup;
import org.springframework.core.env.PropertyResolver;
import org.springframework.core.env.PropertySource;

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
class ConfigurationPropertySourcesPropertySourceGetPropertyEnhancedTest {

	private static final String PROPERTY_NAME = "testProperty";

	private static final String PROPERTY_VALUE = "testValue";

	@Mock
	private Iterable<ConfigurationPropertySource> mockSource;

	@Mock
	private ConfigurationProperty mockConfigurationProperty;

	@Mock
	private ConfigurationPropertyName mockConfigurationPropertyName;

	private ConfigurationPropertySourcesPropertySource propertySource;

	@BeforeEach
	void setUp() {
		propertySource = new ConfigurationPropertySourcesPropertySource("test", mockSource);
	}

	@Test
	void getProperty_WhenPropertyExists_ShouldReturnPropertyValue() {
		try (MockedStatic<ConfigurationPropertyName> mockedConfigurationPropertyName = mockStatic(ConfigurationPropertyName.class)) {
			mockedConfigurationPropertyName.when(() -> ConfigurationPropertyName.of(PROPERTY_NAME, true)).thenReturn(mockConfigurationPropertyName);
			when(mockConfigurationProperty.getValue()).thenReturn(PROPERTY_VALUE);
			when(propertySource.findConfigurationProperty(mockConfigurationPropertyName)).thenReturn(mockConfigurationProperty);
			Object result = propertySource.getProperty(PROPERTY_NAME);
			assertEquals(PROPERTY_VALUE, result);
		}
	}

	@Test
	void getProperty_WhenPropertyDoesNotExist_ShouldReturnNull() {
		try (MockedStatic<ConfigurationPropertyName> mockedConfigurationPropertyName = mockStatic(ConfigurationPropertyName.class)) {
			mockedConfigurationPropertyName.when(() -> ConfigurationPropertyName.of(PROPERTY_NAME, true)).thenReturn(mockConfigurationPropertyName);
			when(propertySource.findConfigurationProperty(mockConfigurationPropertyName)).thenReturn(null);
			Object result = propertySource.getProperty(PROPERTY_NAME);
			assertNull(result);
		}
	}

	@Test
	void getProperty_WhenExceptionThrown_ShouldReturnNull() {
		try (MockedStatic<ConfigurationPropertyName> mockedConfigurationPropertyName = mockStatic(ConfigurationPropertyName.class)) {
			mockedConfigurationPropertyName.when(() -> ConfigurationPropertyName.of(PROPERTY_NAME, true)).thenThrow(new IllegalArgumentException());
			Object result = propertySource.getProperty(PROPERTY_NAME);
			assertNull(result);
		}
	}
}
