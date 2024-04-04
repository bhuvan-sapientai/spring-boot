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

class MapBinderBindAggregateEnhancedTest {

	private MapBinder mapBinder;

	private Binder.Context context;

	private ConfigurationPropertyName name;

	private Bindable<?> target;

	private AggregateElementBinder elementBinder;

	private ConfigurationPropertySource source;

	@BeforeEach
	void setUp() {
		context = mock(Binder.Context.class);
		mapBinder = new MapBinder(context);
		name = ConfigurationPropertyName.of("test");
		target = mock(Bindable.class);
		elementBinder = mock(AggregateElementBinder.class);
		source = mock(ConfigurationPropertySource.class);
	}

	@Test
	@Disabled
	void bindAggregateWithEmptyMap() {
		when(context.getSources()).thenReturn(Collections.singletonList(source));
		when(target.getType()).thenReturn(ResolvableType.forClass(Object.class));
		when(target.getValue()).thenReturn(null);
		Object result = mapBinder.bindAggregate(name, target, elementBinder);
		assertNull(result);
	}

	@Test
	void bindAggregateWithNonEmptyMap() {
		when(context.getSources()).thenReturn(Collections.singletonList(source));
		when(target.getType()).thenReturn(ResolvableType.forClass(Object.class));
		when(target.getValue()).thenReturn(null);
		try (MockedStatic<CollectionFactory> collectionFactoryMockedStatic = Mockito.mockStatic(CollectionFactory.class)) {
			collectionFactoryMockedStatic.when(() -> CollectionFactory.createMap(any(Class.class), anyInt())).thenReturn(Collections.singletonMap("key", "value"));
			Object result = mapBinder.bindAggregate(name, target, elementBinder);
			assertNotNull(result);
			assertTrue(result instanceof Map);
			assertEquals("value", ((Map<?, ?>) result).get("key"));
		}
	}

	@Test
	@Disabled
	void bindAggregateWithDescendants() {
		when(context.getSources()).thenReturn(Collections.singletonList(source));
		when(source.containsDescendantOf(name)).thenReturn(ConfigurationPropertyState.PRESENT);
		when(target.getType()).thenReturn(ResolvableType.forClass(Object.class));
		when(target.getValue()).thenReturn(null);
		Object result = mapBinder.bindAggregate(name, target, elementBinder);
		assertNull(result);
	}

	@Test
	@Disabled
	void bindAggregateWithProperty() {
		ConfigurationProperty property = mock(ConfigurationProperty.class);
		when(context.getSources()).thenReturn(Collections.singletonList(source));
		when(source.getConfigurationProperty(name)).thenReturn(property);
		when(property.getValue()).thenReturn("propertyValue");
		when(context.getConverter()).thenReturn(mock(BindConverter.class));
		when(target.getType()).thenReturn(ResolvableType.forClass(Object.class));
		when(target.getValue()).thenReturn(null);
		Object result = mapBinder.bindAggregate(name, target, elementBinder);
		assertNotNull(result);
		assertEquals("propertyValue", result);
	}
}
