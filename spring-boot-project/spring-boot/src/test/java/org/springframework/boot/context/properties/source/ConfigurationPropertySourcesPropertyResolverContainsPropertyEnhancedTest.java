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
class ConfigurationPropertySourcesPropertyResolverContainsPropertyEnhancedTest {

	@Mock
	private MutablePropertySources propertySources;

	@Mock
	private ConfigurationPropertySourcesPropertySource attachedPropertySource;

	@Mock
	private ConfigurationPropertySource configurationPropertySource;

	@Mock
	private ConfigurationProperty configurationProperty;

	@Mock
	private SpringConfigurationPropertySources springConfigurationPropertySources;

	private ConfigurationPropertySourcesPropertyResolver propertyResolver;

	@BeforeEach
	void setUp() {
		propertyResolver = new ConfigurationPropertySourcesPropertyResolver(propertySources);
	}

	@Test
	void testContainsPropertyWhenAttachedAndPropertyExists() {
		try (MockedStatic<ConfigurationPropertySources> configurationPropertySourcesMockedStatic = mockStatic(ConfigurationPropertySources.class);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyNameMockedStatic = mockStatic(ConfigurationPropertyName.class)) {
			configurationPropertySourcesMockedStatic.when(() -> ConfigurationPropertySources.getAttached(propertySources)).thenReturn(attachedPropertySource);
			when(attachedPropertySource.getSource()).thenReturn(springConfigurationPropertySources);
			when(springConfigurationPropertySources.isUsingSources(propertySources)).thenReturn(true);
			configurationPropertyNameMockedStatic.when(() -> ConfigurationPropertyName.of("exists", true)).thenReturn(mock(ConfigurationPropertyName.class));
			when(attachedPropertySource.findConfigurationProperty(any(ConfigurationPropertyName.class))).thenReturn(configurationProperty);
			boolean result = propertyResolver.containsProperty("exists");
			assertTrue(result);
		}
	}

	@Test
	void testContainsPropertyWhenAttachedButPropertyDoesNotExist() {
		try (MockedStatic<ConfigurationPropertySources> configurationPropertySourcesMockedStatic = mockStatic(ConfigurationPropertySources.class);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyNameMockedStatic = mockStatic(ConfigurationPropertyName.class)) {
			configurationPropertySourcesMockedStatic.when(() -> ConfigurationPropertySources.getAttached(propertySources)).thenReturn(attachedPropertySource);
			when(attachedPropertySource.getSource()).thenReturn(springConfigurationPropertySources);
			when(springConfigurationPropertySources.isUsingSources(propertySources)).thenReturn(true);
			configurationPropertyNameMockedStatic.when(() -> ConfigurationPropertyName.of("doesNotExist", true)).thenReturn(mock(ConfigurationPropertyName.class));
			when(attachedPropertySource.findConfigurationProperty(any(ConfigurationPropertyName.class))).thenReturn(null);
			boolean result = propertyResolver.containsProperty("doesNotExist");
			assertFalse(result);
		}
	}

	@Test
	void testContainsPropertyWhenNotAttached() {
		try (MockedStatic<ConfigurationPropertySources> configurationPropertySourcesMockedStatic = mockStatic(ConfigurationPropertySources.class);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyNameMockedStatic = mockStatic(ConfigurationPropertyName.class)) {
			configurationPropertySourcesMockedStatic.when(() -> ConfigurationPropertySources.getAttached(propertySources)).thenReturn(null);
			PropertySourcesPropertyResolver defaultResolver = spy(new ConfigurationPropertySourcesPropertyResolver.DefaultResolver(propertySources));
			doReturn(true).when(defaultResolver).containsProperty("notAttached");
			boolean result = propertyResolver.containsProperty("notAttached");
			assertTrue(result);
		}
	}

	@Test
	void testContainsPropertyWhenExceptionOccurs() {
		try (MockedStatic<ConfigurationPropertySources> configurationPropertySourcesMockedStatic = mockStatic(ConfigurationPropertySources.class);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyNameMockedStatic = mockStatic(ConfigurationPropertyName.class)) {
			configurationPropertySourcesMockedStatic.when(() -> ConfigurationPropertySources.getAttached(propertySources)).thenReturn(attachedPropertySource);
			when(attachedPropertySource.getSource()).thenReturn(springConfigurationPropertySources);
			when(springConfigurationPropertySources.isUsingSources(propertySources)).thenReturn(true);
			configurationPropertyNameMockedStatic.when(() -> ConfigurationPropertyName.of("exception", true)).thenReturn(mock(ConfigurationPropertyName.class));
			when(attachedPropertySource.findConfigurationProperty(any(ConfigurationPropertyName.class))).thenThrow(new RuntimeException());
			boolean result = propertyResolver.containsProperty("exception");
			assertFalse(result);
		}
	}
}
