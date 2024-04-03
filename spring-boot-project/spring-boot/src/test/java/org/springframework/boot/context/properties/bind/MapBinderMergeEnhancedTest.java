package org.springframework.boot.context.properties.bind;

import org.springframework.boot.context.properties.bind.MapBinder;

import org.springframework.boot.context.properties.bind.Bindable;

import java.lang.Class;
import java.util.function.*;
import java.util.Map;

import org.springframework.core.ResolvableType;
import org.springframework.boot.context.properties.source.ConfigurationPropertySource;
import org.springframework.boot.context.properties.bind.BindConverter;
import org.springframework.boot.context.properties.bind.*;

import java.util.function.Supplier;

import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.boot.context.properties.bind.AggregateElementBinder;

import java.lang.*;
import java.util.function.Predicate;

import org.springframework.boot.context.properties.source.*;
import org.springframework.boot.context.properties.bind.MapBinder;
import org.springframework.boot.context.properties.source.ConfigurationProperty;

import java.lang.Iterable;

import org.springframework.boot.context.properties.source.ConfigurationPropertyState;
import org.springframework.core.CollectionFactory;

import java.lang.Object;

import org.springframework.core.*;

import java.util.*;

import org.springframework.core.CollectionFactory;
import org.springframework.boot.context.properties.source.ConfigurationProperty;
import org.springframework.boot.context.properties.bind.Binder.Context;
import org.springframework.boot.context.properties.source.IterableConfigurationPropertySource;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName.Form;
import org.springframework.boot.context.properties.source.ConfigurationPropertyState;
import org.springframework.boot.context.properties.source.ConfigurationPropertySource;

import java.util.Collection;
import java.util.function.Supplier;

import org.springframework.core.ResolvableType;

import java.util.Properties;
import java.util.Map;

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
class MapBinderMergeEnhancedTest {

	@Mock
	private Context context;

	private MapBinder mapBinder;

	@BeforeEach
	void setUp() {
		mapBinder = new MapBinder(context);
	}

	@Test
	void merge_WhenExistingIsNull_ShouldReturnAdditional() {
		Supplier<Map<Object, Object>> existing = () -> null;
		Map<Object, Object> additional = new HashMap<>();
		additional.put("key", "value");
		Map<Object, Object> result = mapBinder.merge(existing, additional);
		assertSame(additional, result);
	}

	@Test
	void merge_WhenExistingSupportsPutAll_ShouldMergeAndReturnExisting() {
		Map<Object, Object> existingMap = new HashMap<>();
		existingMap.put("existingKey", "existingValue");
		Supplier<Map<Object, Object>> existing = () -> existingMap;
		Map<Object, Object> additional = new HashMap<>();
		additional.put("additionalKey", "additionalValue");
		Map<Object, Object> result = mapBinder.merge(existing, additional);
		assertSame(existingMap, result);
		assertEquals(2, result.size());
		assertTrue(result.containsKey("existingKey"));
		assertTrue(result.containsKey("additionalKey"));
	}

	@Test
	void merge_WhenExistingDoesNotSupportPutAll_ShouldCreateNewMapAndReturn() {
		Map<Object, Object> existingMap = mock(Map.class);
		doThrow(UnsupportedOperationException.class).when(existingMap).putAll(anyMap());
		Supplier<Map<Object, Object>> existing = () -> existingMap;
		Map<Object, Object> additional = new HashMap<>();
		additional.put("additionalKey", "additionalValue");
		try (MockedStatic<CollectionFactory> mockedStatic = mockStatic(CollectionFactory.class)) {
			mockedStatic.when(() -> CollectionFactory.createMap(any(Class.class), anyInt())).thenReturn(new HashMap<>());
			Map<Object, Object> result = mapBinder.merge(existing, additional);
			assertNotNull(result);
			assertNotSame(existingMap, result);
			assertEquals(1, result.size());
			assertTrue(result.containsKey("additionalKey"));
		}
	}
}
