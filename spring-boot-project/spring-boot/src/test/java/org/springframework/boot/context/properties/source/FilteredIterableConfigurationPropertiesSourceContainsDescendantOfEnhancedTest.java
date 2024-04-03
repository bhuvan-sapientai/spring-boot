package org.springframework.boot.context.properties.source;

import org.springframework.boot.context.properties.source.FilteredIterableConfigurationPropertiesSource;

import org.springframework.boot.context.properties.source.IterableConfigurationPropertySource;

import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.*;

import org.springframework.boot.context.properties.source.*;
import org.springframework.util.*;

import java.util.function.*;

import org.springframework.boot.context.properties.source.ConfigurationPropertyState;
import org.springframework.boot.context.properties.source.FilteredIterableConfigurationPropertiesSource;
import org.springframework.util.Assert;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import java.util.stream.Stream;
import java.util.function.Predicate;

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

class FilteredIterableConfigurationPropertiesSourceContainsDescendantOfEnhancedTest {

	private FilteredIterableConfigurationPropertiesSource sourceUnderTest;

	private IterableConfigurationPropertySource mockSource;

	private Predicate<ConfigurationPropertyName> mockFilter;

	@BeforeEach
	void setUp() {
		mockSource = mock(IterableConfigurationPropertySource.class);
		mockFilter = mock(Predicate.class);
		sourceUnderTest = new FilteredIterableConfigurationPropertiesSource(mockSource, mockFilter);
	}

	@Test
	void testContainsDescendantOfWhenPresent() {
		ConfigurationPropertyName name = mock(ConfigurationPropertyName.class);
		try (MockedStatic<ConfigurationPropertyState> mockedStatic = Mockito.mockStatic(ConfigurationPropertyState.class)) {
			mockedStatic.when(() -> ConfigurationPropertyState.search(sourceUnderTest, name::isAncestorOf)).thenReturn(ConfigurationPropertyState.PRESENT);
			ConfigurationPropertyState result = sourceUnderTest.containsDescendantOf(name);
			assertEquals(ConfigurationPropertyState.PRESENT, result);
		}
	}

	@Test
	void testContainsDescendantOfWhenAbsent() {
		ConfigurationPropertyName name = mock(ConfigurationPropertyName.class);
		try (MockedStatic<ConfigurationPropertyState> mockedStatic = Mockito.mockStatic(ConfigurationPropertyState.class)) {
			mockedStatic.when(() -> ConfigurationPropertyState.search(sourceUnderTest, name::isAncestorOf)).thenReturn(ConfigurationPropertyState.ABSENT);
			ConfigurationPropertyState result = sourceUnderTest.containsDescendantOf(name);
			assertEquals(ConfigurationPropertyState.ABSENT, result);
		}
	}

	@Test
	void testContainsDescendantOfWhenUnknown() {
		ConfigurationPropertyName name = mock(ConfigurationPropertyName.class);
		try (MockedStatic<ConfigurationPropertyState> mockedStatic = Mockito.mockStatic(ConfigurationPropertyState.class)) {
			mockedStatic.when(() -> ConfigurationPropertyState.search(sourceUnderTest, name::isAncestorOf)).thenReturn(ConfigurationPropertyState.UNKNOWN);
			ConfigurationPropertyState result = sourceUnderTest.containsDescendantOf(name);
			assertEquals(ConfigurationPropertyState.UNKNOWN, result);
		}
	}
}
