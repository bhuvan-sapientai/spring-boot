package org.springframework.boot.diagnostics.analyzer;

import org.springframework.boot.diagnostics.analyzer.MutuallyExclusiveConfigurationPropertiesFailureAnalyzer;

import org.springframework.core.env.*;
import org.springframework.boot.diagnostics.analyzer.MutuallyExclusiveConfigurationPropertiesFailureAnalyzer;
import org.springframework.boot.diagnostics.analyzer.*;
import org.springframework.boot.context.properties.source.MutuallyExclusiveConfigurationPropertiesException;
import org.springframework.boot.diagnostics.*;
import org.springframework.core.env.ConfigurableEnvironment;

import java.lang.*;
import java.util.stream.Stream;
import java.util.stream.*;

import org.springframework.boot.context.properties.source.*;

import java.util.Set;

import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.core.env.MutablePropertySources;

import java.lang.Throwable;
import java.util.*;

import org.springframework.boot.origin.Origin;

import java.util.Set;
import java.util.ArrayList;

import org.springframework.boot.context.properties.source.MutuallyExclusiveConfigurationPropertiesException;
import org.springframework.boot.diagnostics.FailureAnalyzer;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.core.env.PropertySource;

import java.util.Comparator;
import java.util.function.Function;

import org.springframework.core.env.ConfigurableEnvironment;

import java.util.TreeSet;

import org.springframework.core.env.Environment;

import java.util.Collection;

import org.springframework.boot.diagnostics.FailureAnalysis;

import java.util.stream.Stream;
import java.util.List;

import org.springframework.boot.origin.OriginLookup;
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
class MutuallyExclusiveConfigurationPropertiesFailureAnalyzerAnalyzeEnhancedTest {

	@Mock
	private ConfigurableEnvironment environment;

	@Mock
	private MutuallyExclusiveConfigurationPropertiesException exception;

	@Mock
	private MutablePropertySources propertySources;

	@Mock
	private PropertySource<?> propertySource;

	private MutuallyExclusiveConfigurationPropertiesFailureAnalyzer analyzer;

	@BeforeEach
	void setUp() {
		analyzer = new MutuallyExclusiveConfigurationPropertiesFailureAnalyzer(environment);
	}

	@Test
	@Disabled
	void analyze_whenNoConfiguredNames_returnsNull() {
		when(exception.getConfiguredNames()).thenReturn(Set.of());
		FailureAnalysis result = analyzer.analyze(new Throwable(), exception);
		assertNull(result);
	}

	@Test
	void analyze_whenConfiguredNamesPresentButNoDescriptors_returnsNull() {
		when(exception.getConfiguredNames()).thenReturn(Set.of("property1"));
		when(environment.getPropertySources()).thenReturn(propertySources);
		when(propertySources.stream()).thenReturn(Stream.of(propertySource));
		when(propertySource.containsProperty("property1")).thenReturn(false);
		FailureAnalysis result = analyzer.analyze(new Throwable(), exception);
		assertNull(result);
	}

	@Test
	@Disabled
	void analyze_whenConfiguredNamesAndDescriptorsPresent_returnsFailureAnalysis() {
		when(exception.getConfiguredNames()).thenReturn(Set.of("property1"));
		when(exception.getMutuallyExclusiveNames()).thenReturn(Set.of("property1", "property2"));
		when(environment.getPropertySources()).thenReturn(propertySources);
		when(propertySources.stream()).thenReturn(Stream.of(propertySource));
		when(propertySource.containsProperty("property1")).thenReturn(true);
		when(propertySource.getName()).thenReturn("testSource");
		Origin origin = mock(Origin.class);
		when(OriginLookup.getOrigin(propertySource, "property1")).thenReturn(origin);
		FailureAnalysis result = analyzer.analyze(new Throwable(), exception);
		assertNotNull(result);
		assertTrue(result.getDescription().contains("The following configuration properties are mutually exclusive:"));
		assertTrue(result.getDescription().contains("However, more than one of those properties has been configured at the same time:"));
		assertEquals("Update your configuration so that only one of the mutually exclusive properties is configured.", result.getAction());
		assertSame(exception, result.getCause());
	}
}
