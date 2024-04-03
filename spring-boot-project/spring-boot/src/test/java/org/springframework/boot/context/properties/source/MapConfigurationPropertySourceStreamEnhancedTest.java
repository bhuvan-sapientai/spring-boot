//package org.springframework.boot.context.properties.source;
//
//import org.springframework.boot.context.properties.source.MapConfigurationPropertySource;
//
//import java.util.Map;
//
//import org.springframework.boot.context.properties.source.MapConfigurationPropertySource;
//import org.springframework.boot.context.properties.source.SpringIterableConfigurationPropertySource;
//import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
//
//import java.lang.*;
//import java.util.stream.Stream;
//import java.util.stream.*;
//
//import org.springframework.boot.context.properties.source.*;
//import org.springframework.util.*;
//
//import java.util.Iterator;
//
//import org.springframework.boot.context.properties.source.ConfigurationProperty;
//
//import java.lang.IllegalArgumentException;
//
//import org.springframework.util.Assert;
//
//import java.lang.Object;
//import java.util.*;
//
//import org.springframework.util.Assert;
//import org.springframework.core.env.MapPropertySource;
//
//import java.util.Iterator;
//import java.util.stream.Stream;
//import java.util.Collections;
//import java.util.Map;
//import java.util.LinkedHashMap;
//
//import static org.hamcrest.Matchers.*;
//import static org.hamcrest.core.IsInstanceOf.*;
//import static org.hamcrest.MatcherAssert.*;
//import static org.mockito.Mockito.*;
//import static org.mockito.ArgumentMatchers.*;
//import static org.mockito.Mockito.any;
//import static org.mockito.Mockito.eq;
//
//
//import org.hamcrest.Matchers;
//import org.hamcrest.core.IsInstanceOf;
//import org.hamcrest.MatcherAssert;
//import org.mockito.Mockito;
//import org.mockito.ArgumentMatchers;
//import org.mockito.InjectMocks;
//import org.mockito.stubbing.Answer;
//import org.mockito.MockedStatic;
//import org.mockito.MockitoAnnotations;
//import org.mockito.Mock;
//
//import java.util.*;
//import java.util.stream.*;
//import java.io.*;
//import java.net.*;
//import java.beans.*;
//
//import javax.net.*;
//import javax.annotation.*;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Timeout;
//
//class MapConfigurationPropertySourceStreamEnhancedTest {
//
//	private MapConfigurationPropertySource mapConfigurationPropertySource;
//
//	private SpringIterableConfigurationPropertySource mockDelegate;
//
//	@BeforeEach
//	void setUp() {
//		mockDelegate = Mockito.mock(SpringIterableConfigurationPropertySource.class);
//		MapPropertySource mapPropertySource = new MapPropertySource("source", Collections.emptyMap());
//		Mockito.whenNew(SpringIterableConfigurationPropertySource.class).withArguments(mapPropertySource, MapConfigurationPropertySource.DEFAULT_MAPPERS).thenReturn(mockDelegate);
//		mapConfigurationPropertySource = new MapConfigurationPropertySource();
//	}
//
//	@Test
//	void testStream() {
//		try (MockedStatic<Assert> mockedAssert = Mockito.mockStatic(Assert.class)) {
//			Stream<ConfigurationPropertyName> mockStream = Mockito.mock(Stream.class);
//			when(mockDelegate.stream()).thenReturn(mockStream);
//			Stream<ConfigurationPropertyName> resultStream = mapConfigurationPropertySource.stream();
//			assertNotNull(resultStream, "The result stream should not be null");
//			Mockito.verify(mockDelegate).stream();
//		}
//	}
//}
