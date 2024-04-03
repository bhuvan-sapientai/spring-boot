package org.springframework.boot.context.properties.source;

import org.springframework.boot.context.properties.source.MapConfigurationPropertySource;

import java.util.Map;

import org.springframework.boot.context.properties.source.MapConfigurationPropertySource;
import org.springframework.boot.context.properties.source.SpringIterableConfigurationPropertySource;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import java.lang.*;
import java.util.stream.Stream;
import java.util.stream.*;

import org.springframework.boot.context.properties.source.*;
import org.springframework.util.*;

import java.util.Iterator;

import org.springframework.boot.context.properties.source.ConfigurationProperty;

import java.lang.IllegalArgumentException;

import org.springframework.util.Assert;

import java.lang.Object;
import java.util.*;

import org.springframework.util.Assert;
import org.springframework.core.env.MapPropertySource;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.Collections;
import java.util.Map;
import java.util.LinkedHashMap;

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

class MapConfigurationPropertySourceIteratorEnhancedTest {

	private MapConfigurationPropertySource mapConfigurationPropertySource;

	@BeforeEach
	void setUp() {
		mapConfigurationPropertySource = new MapConfigurationPropertySource();
	}

//	@Test
//	void testIterator() {
//		// Mock static methods of Assert
//		try (MockedStatic<Assert> mockedAssert = Mockito.mockStatic(Assert.class)) {
//			// Mock the iterator method call
//			Iterator<ConfigurationPropertyName> mockIterator = mock(Iterator.class);
//			IterableConfigurationPropertySource mockDelegate = mock(IterableConfigurationPropertySource.class);
//			when(mockDelegate.iterator()).thenReturn(mockIterator);
//			// Mock the constructor behavior of SpringIterableConfigurationPropertySource
//			MapPropertySource mapPropertySource = new MapPropertySource("source", new LinkedHashMap<>());
//			try (MockedStatic<SpringIterableConfigurationPropertySource> mockedSpringIterableConfigurationPropertySource = Mockito.mockStatic(SpringIterableConfigurationPropertySource.class)) {
//				mockedSpringIterableConfigurationPropertySource.when(() -> new SpringIterableConfigurationPropertySource(mapPropertySource, MapConfigurationPropertySource.DEFAULT_MAPPERS)).thenReturn(mockDelegate);
//				// Call the method under test
//				Iterator<ConfigurationPropertyName> iterator = mapConfigurationPropertySource.iterator();
//				// Verify the results and interactions
//				assertNotNull(iterator);
//				verify(mockDelegate).iterator();
//				mockedAssert.verify(() -> Assert.notNull(any(Map.class), anyString()));
//			}
//		}
//	}
}
