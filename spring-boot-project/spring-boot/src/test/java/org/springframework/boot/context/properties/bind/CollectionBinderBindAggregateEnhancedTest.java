package org.springframework.boot.context.properties.bind;

import org.springframework.boot.context.properties.bind.CollectionBinder;

import org.springframework.boot.context.properties.bind.Bindable;

import java.util.Collection;
import java.lang.Class;
import java.util.function.*;

import org.springframework.core.ResolvableType;
import org.springframework.boot.context.properties.bind.CollectionBinder;
import org.springframework.boot.context.properties.bind.*;

import java.util.function.Supplier;

import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.boot.context.properties.bind.AggregateElementBinder;

import java.lang.*;

import org.springframework.boot.context.properties.source.*;
import org.springframework.core.CollectionFactory;

import java.lang.Object;

import org.springframework.core.*;

import java.util.*;

import org.springframework.core.CollectionFactory;
import org.springframework.boot.context.properties.bind.Binder.Context;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import java.util.Collection;
import java.util.function.Supplier;
import java.util.List;

import org.springframework.core.ResolvableType;

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

class CollectionBinderBindAggregateEnhancedTest {

	private CollectionBinder collectionBinder;

	private Context context;

	private Bindable<?> target;

	private AggregateElementBinder elementBinder;

	private ConfigurationPropertyName name;

	private ResolvableType elementType;

	private ResolvableType aggregateType;

	private IndexedElementsBinder.IndexedCollectionSupplier resultSupplier;

	@BeforeEach
	void setUp() {
		context = mock(Context.class);
		collectionBinder = new CollectionBinder(context);
		target = mock(Bindable.class);
		elementBinder = mock(AggregateElementBinder.class);
		name = mock(ConfigurationPropertyName.class);
		elementType = mock(ResolvableType.class);
		aggregateType = mock(ResolvableType.class);
		resultSupplier = mock(IndexedElementsBinder.IndexedCollectionSupplier.class);
	}

	@Test
	@Disabled
	void bindAggregateShouldReturnCollection() {
		try (MockedStatic<ResolvableType> resolvableTypeMockedStatic = Mockito.mockStatic(ResolvableType.class)) {
			resolvableTypeMockedStatic.when(() -> ResolvableType.forClassWithGenerics(List.class, any(ResolvableType[].class))).thenReturn(aggregateType);
			when(target.getType()).thenReturn(aggregateType);
			when(aggregateType.asCollection()).thenReturn(aggregateType);
			when(aggregateType.getGenerics()).thenReturn(new ResolvableType[] { elementType });
			when(aggregateType.getGeneric()).thenReturn(elementType);
			when(resultSupplier.wasSupplied()).thenReturn(true);
			when(resultSupplier.get()).thenReturn(List.of());
			Object result = collectionBinder.bindAggregate(name, target, elementBinder);
			assertNotNull(result);
			assertTrue(result instanceof List);

		}
	}

	@Test
	@Disabled
	void bindAggregateShouldReturnNullWhenNotSupplied() {
		try (MockedStatic<ResolvableType> resolvableTypeMockedStatic = Mockito.mockStatic(ResolvableType.class)) {
			resolvableTypeMockedStatic.when(() -> ResolvableType.forClassWithGenerics(List.class, any(ResolvableType[].class))).thenReturn(aggregateType);
			when(target.getType()).thenReturn(aggregateType);
			when(aggregateType.asCollection()).thenReturn(aggregateType);
			when(aggregateType.getGenerics()).thenReturn(new ResolvableType[] { elementType });
			when(aggregateType.getGeneric()).thenReturn(elementType);
			when(resultSupplier.wasSupplied()).thenReturn(false);
			Object result = collectionBinder.bindAggregate(name, target, elementBinder);
			assertNull(result);

		}
	}
}
