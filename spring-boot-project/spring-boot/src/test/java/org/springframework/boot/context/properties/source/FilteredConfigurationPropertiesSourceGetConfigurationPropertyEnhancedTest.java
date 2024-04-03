package org.springframework.boot.context.properties.source;

import org.springframework.boot.context.properties.source.FilteredConfigurationPropertiesSource;

import org.springframework.boot.context.properties.source.FilteredConfigurationPropertiesSource;

import java.util.function.Predicate;
import java.lang.*;

import org.springframework.boot.context.properties.source.*;
import org.springframework.util.*;

import java.util.function.*;

import org.springframework.boot.context.properties.source.ConfigurationProperty;
import org.springframework.boot.context.properties.source.ConfigurationPropertySource;
import org.springframework.boot.context.properties.source.ConfigurationPropertyState;
import org.springframework.util.Assert;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import java.lang.Object;

import org.springframework.util.Assert;

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
class FilteredConfigurationPropertiesSourceGetConfigurationPropertyEnhancedTest {

	@Mock
	private ConfigurationPropertySource mockSource;

	@Mock
	private Predicate<ConfigurationPropertyName> mockFilter;

	@Mock
	private ConfigurationPropertyName mockName;

	@Mock
	private ConfigurationProperty mockProperty;

	private FilteredConfigurationPropertiesSource filteredSource;

	@BeforeEach
	void setUp() {
		filteredSource = new FilteredConfigurationPropertiesSource(mockSource, mockFilter);
	}

	@Test
	void getConfigurationPropertyWhenNameIsFiltered() {
		when(mockFilter.test(mockName)).thenReturn(true);
		when(mockSource.getConfigurationProperty(mockName)).thenReturn(mockProperty);
		ConfigurationProperty result = filteredSource.getConfigurationProperty(mockName);
		assertNotNull(result);
		assertSame(mockProperty, result);
	}

	@Test
	void getConfigurationPropertyWhenNameIsNotFiltered() {
		when(mockFilter.test(mockName)).thenReturn(false);
		ConfigurationProperty result = filteredSource.getConfigurationProperty(mockName);
		assertNull(result);
	}

	@Test
	void constructorShouldThrowExceptionWhenSourceIsNull() {
		try (MockedStatic<Assert> mockedAssert = mockStatic(Assert.class)) {
			assertThrows(IllegalArgumentException.class, () -> new FilteredConfigurationPropertiesSource(null, mockFilter));
			mockedAssert.verify(() -> Assert.notNull(null, "Source must not be null"));
		}
	}

	@Test
	void constructorShouldThrowExceptionWhenFilterIsNull() {
		try (MockedStatic<Assert> mockedAssert = mockStatic(Assert.class)) {
			assertThrows(IllegalArgumentException.class, () -> new FilteredConfigurationPropertiesSource(mockSource, null));
			mockedAssert.verify(() -> Assert.notNull(null, "Filter must not be null"));
		}
	}
}
