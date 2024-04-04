package org.springframework.boot.diagnostics.analyzer;

import org.springframework.boot.diagnostics.analyzer.InvalidConfigurationPropertyValueFailureAnalyzer;

import org.springframework.boot.diagnostics.analyzer.InvalidConfigurationPropertyValueFailureAnalyzer;
import org.springframework.core.env.*;
import org.springframework.boot.diagnostics.analyzer.*;
import org.springframework.boot.context.properties.source.InvalidConfigurationPropertyValueException;
import org.springframework.util.StringUtils;
import org.springframework.boot.diagnostics.*;
import org.springframework.core.env.ConfigurableEnvironment;

import java.lang.*;
import java.util.stream.Stream;
import java.util.stream.*;

import org.springframework.boot.context.properties.source.*;
import org.springframework.util.*;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.core.env.MutablePropertySources;

import java.lang.Throwable;

import org.springframework.boot.origin.Origin;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.util.StringUtils;
import org.springframework.boot.context.properties.source.InvalidConfigurationPropertyValueException;
import org.springframework.core.env.Environment;
import org.springframework.boot.diagnostics.FailureAnalysis;

import java.util.stream.Stream;
import java.util.List;

import org.springframework.boot.origin.OriginLookup;
import org.springframework.boot.diagnostics.FailureAnalyzer;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.core.env.PropertySource;
import org.springframework.boot.context.properties.source.ConfigurationPropertySources;

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
class InvalidConfigurationPropertyValueFailureAnalyzerAnalyzeEnhancedTest {

	@Mock
	private ConfigurableEnvironment environment;

	@Mock
	private InvalidConfigurationPropertyValueException exception;

	@Mock
	private PropertySource<?> propertySource;

	@Mock
	private Origin origin;

	private InvalidConfigurationPropertyValueFailureAnalyzer analyzer;

	@BeforeEach
	void setUp() {
		analyzer = new InvalidConfigurationPropertyValueFailureAnalyzer(environment);
	}

	@Test
	void testAnalyzeWithEmptyDescriptors() {
		when(exception.getName()).thenReturn("test.property");
		when(environment.getPropertySources()).thenReturn(new MutablePropertySources());
		FailureAnalysis result = analyzer.analyze(new Throwable(), exception);
		assertNull(result);
	}

	@Test
	@Disabled
	void testAnalyzeWithNonEmptyDescriptors() {
		when(exception.getName()).thenReturn("test.property");
		when(exception.getReason()).thenReturn("Invalid format");
		when(propertySource.getName()).thenReturn("application.properties");
		when(propertySource.containsProperty("test.property")).thenReturn(true);
		when(propertySource.getProperty("test.property")).thenReturn("invalidValue");
		when(OriginLookup.getOrigin(propertySource, "test.property")).thenReturn(origin);
		MutablePropertySources propertySources = new MutablePropertySources();
		propertySources.addFirst(propertySource);
		when(environment.getPropertySources()).thenReturn(propertySources);
		try (MockedStatic<StringUtils> mockedStringUtils = mockStatic(StringUtils.class)) {
			mockedStringUtils.when(() -> StringUtils.hasText(anyString())).thenReturn(true);
			FailureAnalysis result = analyzer.analyze(new Throwable(), exception);
			assertNotNull(result);
			assertTrue(result.getDescription().contains("Invalid value 'invalidValue' for configuration property 'test.property'"));
			assertTrue(result.getDescription().contains("Validation failed for the following reason:"));
			assertTrue(result.getAction().contains("Review the value of the property with the provided reason"));
		}
	}

	@Test
	@Disabled
	void testAnalyzeWithNoReasonProvided() {
		when(exception.getName()).thenReturn("test.property");
		when(exception.getReason()).thenReturn(null);
		when(propertySource.getName()).thenReturn("application.properties");
		when(propertySource.containsProperty("test.property")).thenReturn(true);
		when(propertySource.getProperty("test.property")).thenReturn("invalidValue");
		when(OriginLookup.getOrigin(propertySource, "test.property")).thenReturn(origin);
		MutablePropertySources propertySources = new MutablePropertySources();
		propertySources.addFirst(propertySource);
		when(environment.getPropertySources()).thenReturn(propertySources);
		try (MockedStatic<StringUtils> mockedStringUtils = mockStatic(StringUtils.class)) {
			mockedStringUtils.when(() -> StringUtils.hasText(anyString())).thenReturn(false);
			FailureAnalysis result = analyzer.analyze(new Throwable(), exception);
			assertNotNull(result);
			assertTrue(result.getDescription().contains("No reason was provided."));
			assertTrue(result.getAction().contains("Review the value of the property."));
		}
	}
}
