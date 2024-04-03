//package org.springframework.boot.context.properties.bind;
//
//import org.springframework.boot.context.properties.bind.CollectionBinder;
//
//import org.springframework.boot.context.properties.bind.Bindable;
//
//import java.util.Collection;
//import java.lang.Class;
//import java.util.function.*;
//
//import org.springframework.core.ResolvableType;
//import org.springframework.boot.context.properties.bind.CollectionBinder;
//import org.springframework.boot.context.properties.bind.*;
//
//import java.util.function.Supplier;
//
//import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
//import org.springframework.boot.context.properties.bind.AggregateElementBinder;
//
//import java.lang.*;
//
//import org.springframework.boot.context.properties.source.*;
//import org.springframework.core.CollectionFactory;
//
//import java.lang.Object;
//
//import org.springframework.core.*;
//
//import java.util.*;
//
//import org.springframework.core.CollectionFactory;
//import org.springframework.boot.context.properties.bind.Binder.Context;
//import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
//
//import java.util.Collection;
//import java.util.function.Supplier;
//import java.util.List;
//
//import org.springframework.core.ResolvableType;
//
//import static org.hamcrest.Matchers.*;
//import static org.hamcrest.core.IsInstanceOf.*;
//import static org.hamcrest.MatcherAssert.*;
//import static org.mockito.Mockito.*;
//import static org.mockito.ArgumentMatchers.*;
//import static org.mockito.Mockito.any;
//import static org.mockito.Mockito.eq;
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
//class CollectionBinderMergeEnhancedTest {
//
//	private CollectionBinder collectionBinder;
//
//	private MockedStatic<CollectionFactory> mockedCollectionFactory;
//
//	@BeforeEach
//	void setUp() {
//		collectionBinder = new CollectionBinder(new Binder.Context());
//		mockedCollectionFactory = Mockito.mockStatic(CollectionFactory.class);
//	}
//
//	@AfterEach
//	void tearDown() {
//		mockedCollectionFactory.close();
//	}
//
//	@Test
//	void testMergeWithNullExisting() {
//		Collection<Object> additional = new ArrayList<>();
//		additional.add("test");
//		Collection<Object> result = collectionBinder.merge(() -> null, additional);
//		assertSame(additional, result);
//	}
//
//	@Test
//	void testMergeWithUnsupportedOperationException() {
//		Collection<Object> existingCollection = Mockito.mock(Collection.class);
//		Collection<Object> additional = new ArrayList<>();
//		additional.add("test");
//		Mockito.when(existingCollection.addAll(any())).thenThrow(UnsupportedOperationException.class);
//		mockedCollectionFactory.when(() -> CollectionFactory.createCollection(any(), anyInt())).thenReturn(new ArrayList<>());
//		Collection<Object> result = collectionBinder.merge(() -> existingCollection, additional);
//		assertNotNull(result);
//		assertNotSame(existingCollection, result);
//		assertTrue(result.containsAll(additional));
//	}
//
//	@Test
//	void testMergeWithExistingCollection() {
//		Collection<Object> existingCollection = new ArrayList<>();
//		Collection<Object> additional = new ArrayList<>();
//		additional.add("test");
//		Collection<Object> result = collectionBinder.merge(() -> existingCollection, additional);
//		assertSame(existingCollection, result);
//		assertTrue(result.containsAll(additional));
//	}
//
//	@Test
//	void testMergeWithCopyIfPossible() {
//		Collection<Object> existingCollection = new ArrayList<>();
//		Collection<Object> additional = new ArrayList<>();
//		additional.add("test");
//		mockedCollectionFactory.when(() -> CollectionFactory.createCollection(any(), anyInt())).thenReturn(new ArrayList<>());
//		Collection<Object> result = collectionBinder.merge(() -> existingCollection, additional);
//		assertNotNull(result);
//		assertNotSame(existingCollection, result);
//		assertTrue(result.containsAll(additional));
//	}
//}
