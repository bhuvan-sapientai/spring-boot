package org.springframework.boot.context.properties.source;

import org.springframework.boot.context.properties.source.UnboundElementsSourceFilter;

import java.lang.*;

import org.springframework.boot.context.properties.source.*;
import org.springframework.core.env.*;
import org.springframework.boot.context.properties.source.UnboundElementsSourceFilter;
import org.springframework.core.env.PropertySource;
import org.springframework.boot.context.properties.source.ConfigurationPropertySource;

import java.lang.Object;
import java.util.function.Function;
import java.util.Set;
import java.util.Collections;
import java.util.Arrays;

import org.springframework.core.env.StandardEnvironment;
import org.springframework.core.env.PropertySource;

import java.util.HashSet;

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

class UnboundElementsSourceFilterApplyEnhancedTest {

	private UnboundElementsSourceFilter filter;

	@BeforeEach
	void setUp() {
		filter = new UnboundElementsSourceFilter();
	}

	@Test
	void testApplyWithBenignPropertySourceName() {
		ConfigurationPropertySource configurationPropertySource = Mockito.mock(ConfigurationPropertySource.class);
		PropertySource<?> propertySource = Mockito.mock(PropertySource.class);
		Mockito.when(configurationPropertySource.getUnderlyingSource()).thenReturn(propertySource);
		Mockito.when(propertySource.getName()).thenReturn(StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME);
		Boolean result = filter.apply(configurationPropertySource);
		assertFalse(result);
	}

	@Test
	void testApplyWithNonBenignPropertySourceName() {
		ConfigurationPropertySource configurationPropertySource = Mockito.mock(ConfigurationPropertySource.class);
		PropertySource<?> propertySource = Mockito.mock(PropertySource.class);
		Mockito.when(configurationPropertySource.getUnderlyingSource()).thenReturn(propertySource);
		Mockito.when(propertySource.getName()).thenReturn("customPropertySourceName");
		Boolean result = filter.apply(configurationPropertySource);
		assertTrue(result);
	}

	@Test
	void testApplyWithNonPropertySourceUnderlyingSource() {
		ConfigurationPropertySource configurationPropertySource = Mockito.mock(ConfigurationPropertySource.class);
		Mockito.when(configurationPropertySource.getUnderlyingSource()).thenReturn(new Object());
		Boolean result = filter.apply(configurationPropertySource);
		assertTrue(result);
	}
}
