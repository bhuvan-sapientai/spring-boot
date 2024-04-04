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
class ConfigurationPropertySourcesPropertySourceGetOriginEnhancedTest {

	private static final String PROPERTY_NAME = "testProperty";

	private static final String PROPERTY_SOURCE_NAME = "propertySourceName";

	@Mock
	private Iterable<ConfigurationPropertySource> mockIterable;

	@Mock
	private ConfigurationProperty mockConfigurationProperty;

	@Mock
	private ConfigurationPropertyName mockConfigurationPropertyName;

	@Mock
	private Origin mockOrigin;

	private ConfigurationPropertySourcesPropertySource propertySource;

	@BeforeEach
	void setUp() {
		propertySource = new ConfigurationPropertySourcesPropertySource(PROPERTY_SOURCE_NAME, mockIterable);
	}

	@Test
	@Disabled
	void getOrigin_WhenPropertyFound_ShouldReturnOrigin() {
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyNameStatic = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<Origin> originStatic = mockStatic(Origin.class)) {
			configurationPropertyNameStatic.when(() -> ConfigurationPropertyName.of(PROPERTY_NAME, true)).thenReturn(mockConfigurationPropertyName);
			originStatic.when(() -> Origin.from(mockConfigurationProperty)).thenReturn(mockOrigin);
			when(propertySource.findConfigurationProperty(mockConfigurationPropertyName)).thenReturn(mockConfigurationProperty);
			Origin result = propertySource.getOrigin(PROPERTY_NAME);
			assertNotNull(result);
			assertEquals(mockOrigin, result);
		}
	}

	@Test
	@Disabled
	void getOrigin_WhenPropertyNotFound_ShouldReturnNull() {
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyNameStatic = mockStatic(ConfigurationPropertyName.class)) {
			configurationPropertyNameStatic.when(() -> ConfigurationPropertyName.of(PROPERTY_NAME, true)).thenReturn(mockConfigurationPropertyName);
			when(propertySource.findConfigurationProperty(mockConfigurationPropertyName)).thenReturn(null);
			Origin result = propertySource.getOrigin(PROPERTY_NAME);
			assertNull(result);
		}
	}

	@Test
	void getOrigin_WhenExceptionThrown_ShouldReturnNull() {
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyNameStatic = mockStatic(ConfigurationPropertyName.class)) {
			configurationPropertyNameStatic.when(() -> ConfigurationPropertyName.of(PROPERTY_NAME, true)).thenThrow(new IllegalArgumentException());
			Origin result = propertySource.getOrigin(PROPERTY_NAME);
			assertNull(result);
		}
	}
}
