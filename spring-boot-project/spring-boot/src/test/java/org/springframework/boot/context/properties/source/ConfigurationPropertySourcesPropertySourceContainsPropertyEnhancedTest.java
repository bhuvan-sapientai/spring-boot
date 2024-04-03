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
class ConfigurationPropertySourcesPropertySourceContainsPropertyEnhancedTest {

	@Mock
	private Iterable<ConfigurationPropertySource> mockIterable;

	@Mock
	private ConfigurationPropertySource mockConfigurationPropertySource;

	@Mock
	private ConfigurationProperty mockConfigurationProperty;

	private ConfigurationPropertySourcesPropertySource propertySource;

	@BeforeEach
	void setUp() {
		propertySource = new ConfigurationPropertySourcesPropertySource("testName", mockIterable);
	}

//	@Test
//	void testContainsPropertyWhenPropertyExists() {
//		String propertyName = "existing.property";
//		ConfigurationPropertyName configPropertyName = ConfigurationPropertyName.of(propertyName, true);
//		try (MockedStatic<ConfigurationPropertyName> mockedStatic = mockStatic(ConfigurationPropertyName.class)) {
//			mockedStatic.when(() -> ConfigurationPropertyName.of(propertyName, true)).thenReturn(configPropertyName);
////			when(findConfigurationProperty(configPropertyName)).thenReturn(mockConfigurationProperty);
//			when(mockIterable.iterator()).thenReturn(java.util.Collections.singleton(mockConfigurationPropertySource).iterator());
//			assertTrue(propertySource.containsProperty(propertyName));
//		}
//	}
//
//	@Test
//	void testContainsPropertyWhenPropertyDoesNotExist() {
//		String propertyName = "non.existing.property";
//		ConfigurationPropertyName configPropertyName = ConfigurationPropertyName.of(propertyName, true);
//		try (MockedStatic<ConfigurationPropertyName> mockedStatic = mockStatic(ConfigurationPropertyName.class)) {
//			mockedStatic.when(() -> ConfigurationPropertyName.of(propertyName, true)).thenReturn(configPropertyName);
//			when(mockConfigurationPropertySource.findConfigurationProperty(configPropertyName)).thenReturn(null);
//			when(mockIterable.iterator()).thenReturn(java.util.Collections.singleton(mockConfigurationPropertySource).iterator());
//			assertFalse(propertySource.containsProperty(propertyName));
//		}
//	}

	@Test
	void testContainsPropertyWhenExceptionIsThrown() {
		String propertyName = "invalid.property";
		try (MockedStatic<ConfigurationPropertyName> mockedStatic = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<Assert> mockedAssertStatic = mockStatic(Assert.class)) {
			mockedStatic.when(() -> ConfigurationPropertyName.of(propertyName, true)).thenThrow(new IllegalArgumentException());
			mockedAssertStatic.when(() -> Assert.hasText(anyString(), anyString())).thenCallRealMethod();
			assertFalse(propertySource.containsProperty(propertyName));
		}
	}
}
