package org.springframework.boot.context.properties.bind;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.boot.context.properties.source.ConfigurationProperty;
import org.springframework.core.CollectionFactory;

import java.util.Map;
import java.util.HashMap;

import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import java.util.ArrayList;

import org.springframework.boot.context.properties.source.ConfigurationPropertyState;
import org.springframework.boot.origin.Origin;
import org.springframework.core.ResolvableType;
import org.springframework.boot.context.properties.source.ConfigurationPropertySource;

import java.util.function.Predicate;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.doThrow;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MapBinderSapientGeneratedTest {

	private final AggregateElementBinder aggregateElementBinderMock = mock(AggregateElementBinder.class);

	private final Binder.Context binderContextMock = mock(Binder.Context.class, "null");

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final ConfigurationPropertySource configurationPropertySourceMock = mock(ConfigurationPropertySource.class);

	private final Supplier existingMock = mock(Supplier.class, "null");

	private final ResolvableType resolvableTypeMock = mock(ResolvableType.class);

	private final RuntimeException runtimeExceptionMock = mock(RuntimeException.class);

	private final Supplier supplierMock = mock(Supplier.class);

	private final Bindable<?> targetMock = mock(Bindable.class);

	//Sapient generated method id: ${0ccd0b70-9ed9-3d5e-b132-40d474602358}, hash: B3921CC656628CAE89B46A18B1FE1BFB
	@Test()
	void isAllowRecursiveBindingTest() {
		//Arrange Statement(s)
		Binder.Context binderContextMock = mock(Binder.Context.class);
		MapBinder target = new MapBinder(binderContextMock);

		//Act Statement(s)
		boolean result = target.isAllowRecursiveBinding(configurationPropertySourceMock);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${0429d3b4-4624-32a1-a21f-c785100948e3}, hash: F2A95D3AF204B82BD37358539CF41973
	@Test()
	void bindAggregateWhenSourceContainsDescendantOfNameNotEqualsConfigurationPropertyStatePRESENTAndGetContextGetSourcesIsEmpty() {
		/* Branches:
		 * (target.getValue() != null) : true
		 * (Properties.class.isAssignableFrom(type)) : true  #  inside resolveTarget method
		 * (for-each(getContext().getSources())) : true  #  inside hasDescendants method
		 * (source.containsDescendantOf(name) == ConfigurationPropertyState.PRESENT) : false  #  inside hasDescendants method
		 * (for-each(getContext().getSources())) : false
		 * (map.isEmpty()) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Binder.Context binderContextMock = mock(Binder.Context.class);
		try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
			doReturn(supplierMock).when(targetMock).getValue();
			doReturn(resolvableTypeMock).when(targetMock).getType();
			doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			doReturn(ConfigurationPropertyState.ABSENT).when(configurationPropertySourceMock).containsDescendantOf(configurationPropertyNameMock);
			Iterable<ConfigurationPropertySource> iterable2 = new ArrayList<>();
			doReturn(iterable, iterable2).when(binderContextMock).getSources();
			Object object = new Object();
			Object object2 = new Object();
			Map<Object, Object> objectObjectMap = new HashMap<>();
			objectObjectMap.put(object, object2);
			collectionFactory.when(() -> CollectionFactory.createMap(Map.class, 0)).thenReturn(objectObjectMap);
			MapBinder target = new MapBinder(binderContextMock);
			//Act Statement(s)
			Object result = target.bindAggregate(configurationPropertyNameMock, targetMock, aggregateElementBinderMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(objectObjectMap));
				verify(targetMock).getValue();
				verify(targetMock).getType();
				verify(resolvableTypeMock).resolve(Object.class);
				verify(binderContextMock, times(2)).getSources();
				verify(configurationPropertySourceMock).containsDescendantOf(configurationPropertyNameMock);
				collectionFactory.verify(() -> CollectionFactory.createMap(Map.class, 0), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${cfe7afa0-41c8-3000-b925-7b367a552635}, hash: 4FAF3EA205A72ADF4DD87A7B3418B255
	@Test()
	void bindAggregateWhenNotHasDescendants() {
		/* Branches:
		 * (target.getValue() != null) : false
		 * (Properties.class.isAssignableFrom(type)) : false  #  inside resolveTarget method
		 * (for-each(getContext().getSources())) : false  #  inside hasDescendants method
		 * (for-each(getContext().getSources())) : true
		 * (!ConfigurationPropertyName.EMPTY.equals(name)) : true
		 * (property != null) : true
		 * (!hasDescendants) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: EMPTY
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Binder.Context binderContextMock = mock(Binder.Context.class);
		Origin originMock = mock(Origin.class);
		ConfigurationPropertyName configurationPropertyNameMock2 = mock(ConfigurationPropertyName.class);
		BindConverter bindConverterMock = mock(BindConverter.class);
		try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
			doReturn(null).when(targetMock).getValue();
			doReturn(resolvableTypeMock).when(targetMock).getType();
			doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>();
			Iterable<ConfigurationPropertySource> iterable2 = new ArrayList<>(List.of(configurationPropertySourceMock));
			doReturn(iterable, iterable2).when(binderContextMock).getSources();
			Object object = new Object();
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, object, originMock);
			doReturn(configurationProperty).when(configurationPropertySourceMock).getConfigurationProperty(configurationPropertyNameMock2);
			doNothing().when(binderContextMock).setConfigurationProperty(configurationProperty);
			doReturn(bindConverterMock).when(binderContextMock).getConverter();
			Object object2 = new Object();
			doReturn(object2).when(bindConverterMock).convert(object, targetMock);
			Map<Object, Object> objectObjectMap = new HashMap<>();
			collectionFactory.when(() -> CollectionFactory.createMap(Object.class, 0)).thenReturn(objectObjectMap);
			MapBinder target = new MapBinder(binderContextMock);
			//Act Statement(s)
			Object result = target.bindAggregate(configurationPropertyNameMock2, targetMock, aggregateElementBinderMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(object2));
				verify(targetMock).getValue();
				verify(targetMock, times(2)).getType();
				verify(resolvableTypeMock, times(2)).resolve(Object.class);
				verify(binderContextMock, times(2)).getSources();
				verify(configurationPropertySourceMock).getConfigurationProperty(configurationPropertyNameMock2);
				verify(binderContextMock).setConfigurationProperty(configurationProperty);
				verify(binderContextMock).getConverter();
				verify(bindConverterMock).convert(object, targetMock);
				collectionFactory.verify(() -> CollectionFactory.createMap(Object.class, 0), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${00271470-6796-3b1a-b8b6-61156b9f56df}, hash: E2A6AB106A72EA2231214EE4C1F80165
	@Test()
	void bindAggregateWhenHasDescendantsAndMapIsEmpty() {
		/* Branches:
		 * (target.getValue() != null) : true
		 * (Properties.class.isAssignableFrom(type)) : true  #  inside resolveTarget method
		 * (for-each(getContext().getSources())) : true  #  inside hasDescendants method
		 * (source.containsDescendantOf(name) == ConfigurationPropertyState.PRESENT) : true  #  inside hasDescendants method
		 * (for-each(getContext().getSources())) : true
		 * (!ConfigurationPropertyName.EMPTY.equals(name)) : true
		 * (property != null) : true
		 * (!hasDescendants) : false
		 * (map.isEmpty()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: EMPTY, object of type MapBinder.EntryBinder
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertyName nameMock = mock(ConfigurationPropertyName.class);
		Binder.Context binderContextMock = mock(Binder.Context.class);
		ConfigurationPropertySource configurationPropertySourceMock2 = mock(ConfigurationPropertySource.class);
		ConfigurationProperty configurationPropertyMock = mock(ConfigurationProperty.class);
		ConfigurationPropertySource configurationPropertySourceMock3 = mock(ConfigurationPropertySource.class);
		try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
			doReturn(false).when(nameMock).isAncestorOf(configurationPropertyNameMock);
			doReturn(supplierMock).when(targetMock).getValue();
			doReturn(resolvableTypeMock).when(targetMock).getType();
			doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			doReturn(ConfigurationPropertyState.PRESENT).when(configurationPropertySourceMock).containsDescendantOf(nameMock);
			Iterable<ConfigurationPropertySource> iterable2 = new ArrayList<>(List.of(configurationPropertySourceMock2));
			doReturn(iterable, iterable2).when(binderContextMock).getSources();
			doReturn(configurationPropertyMock).when(configurationPropertySourceMock2).getConfigurationProperty(nameMock);
			doReturn(configurationPropertySourceMock3).when(configurationPropertySourceMock2).filter((Predicate) any());
			Map<Object, Object> objectObjectMap = new HashMap<>();
			collectionFactory.when(() -> CollectionFactory.createMap(Map.class, 0)).thenReturn(objectObjectMap);
			MapBinder target = new MapBinder(binderContextMock);
			//Act Statement(s)
			Object result = target.bindAggregate(nameMock, targetMock, aggregateElementBinderMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(nameMock).isAncestorOf(configurationPropertyNameMock);
				verify(targetMock).getValue();
				verify(targetMock).getType();
				verify(resolvableTypeMock).resolve(Object.class);
				verify(binderContextMock, times(2)).getSources();
				verify(configurationPropertySourceMock).containsDescendantOf(nameMock);
				verify(configurationPropertySourceMock2).getConfigurationProperty(nameMock);
				verify(configurationPropertySourceMock2).filter((Predicate) any());
				collectionFactory.verify(() -> CollectionFactory.createMap(Map.class, 0), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${91ba369a-239b-3e45-b8e1-cb063d5608a8}, hash: 90F9CC0FAE2FEB28CC5A0539181F9E18
	@Test()
	void merge1WhenExistingMapIsNull() throws Exception {
		/* Branches:
		 * (existingMap == null) : true
		 */
		//Arrange Statement(s)
		doReturn(null).when(existingMock).get();
		MapBinder target = new MapBinder(binderContextMock);
		Map<Object, Object> objectObjectMap = new HashMap<>();

		//Act Statement(s)
		Map<Object, Object> result = target.merge(existingMock, objectObjectMap);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(objectObjectMap));
			verify(existingMock).get();
		});
	}

	//Sapient generated method id: ${baceb4bb-acee-3db0-81c8-75be54bb55cc}, hash: 69C0FA6599C6184E55085113F1831564
	@Test()
	void merge1WhenExistingMapIsNotNull() throws Exception {
		/* Branches:
		 * (existingMap == null) : false
		 */
		//Arrange Statement(s)
		Supplier existingMock = mock(Supplier.class);
		Binder.Context binderContextMock = mock(Binder.Context.class);
		try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
			Map map = new HashMap<>();
			doReturn(map).when(existingMock).get();
			Map<Object, Object> objectObjectMap = new HashMap<>();
			collectionFactory.when(() -> CollectionFactory.createMap(HashMap.class, 0)).thenReturn(objectObjectMap);
			MapBinder target = new MapBinder(binderContextMock);
			Object object = new Object();
			Object object2 = new Object();
			Map<Object, Object> objectObjectMap2 = new HashMap<>();
			objectObjectMap2.put(object, object2);
			//Act Statement(s)
			Map<Object, Object> result = target.merge(existingMock, objectObjectMap2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(objectObjectMap));
				verify(existingMock).get();
				collectionFactory.verify(() -> CollectionFactory.createMap(HashMap.class, 0), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${27ad051d-497e-338e-959d-4de0373f3c6e}, hash: F9C4E4036898DE442EDD427FD314DD19
	@Test()
	void merge1WhenCaughtUnsupportedOperationException() throws Exception {
		/* Branches:
		 * (existingMap == null) : false
		 * (catch-exception (UnsupportedOperationException)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Supplier existingMock = mock(Supplier.class);
		Binder.Context binderContextMock = mock(Binder.Context.class);
		try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
			Map map = new HashMap<>();
			doReturn(map).when(existingMock).get();
			Map<Object, Object> objectObjectMap = new HashMap<>();
			Map<Object, Object> objectObjectMap2 = new HashMap<>();
			collectionFactory.when(() -> CollectionFactory.createMap(HashMap.class, 0)).thenReturn(objectObjectMap).thenReturn(objectObjectMap2);
			MapBinder target = new MapBinder(binderContextMock);
			Map<Object, Object> objectObjectMap3 = new HashMap<>();
			//Act Statement(s)
			Map<Object, Object> result = target.merge(existingMock, objectObjectMap3);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(objectObjectMap2));
				verify(existingMock).get();
				collectionFactory.verify(() -> CollectionFactory.createMap(HashMap.class, 0), atLeast(2));
			});
		}
	}

	//Sapient generated method id: ${e452e94b-b1fe-3a3a-8001-5d8d839829f7}, hash: 5877783349EB896A10B90D9F67CB3411
	@Test()
	void merge1WhenCaughtException() throws Exception {
		/* Branches:
		 * (existingMap == null) : false
		 * (catch-exception (Exception)) : true  #  inside copyIfPossible method
		 */
		//Arrange Statement(s)
		Supplier existingMock = mock(Supplier.class);
		Binder.Context binderContextMock = mock(Binder.Context.class);
		try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
			Map map = new HashMap<>();
			doReturn(map).when(existingMock).get();
			collectionFactory.when(() -> CollectionFactory.createMap(HashMap.class, 0)).thenThrow(runtimeExceptionMock);
			MapBinder target = new MapBinder(binderContextMock);
			Object object = new Object();
			Object object2 = new Object();
			Map<Object, Object> objectObjectMap = new HashMap<>();
			objectObjectMap.put(object, object2);
			//Act Statement(s)
			Map<Object, Object> result = target.merge(existingMock, objectObjectMap);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				verify(existingMock).get();
				collectionFactory.verify(() -> CollectionFactory.createMap(HashMap.class, 0), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${d9cc4214-14b6-3b98-b4df-71cfb9766bf1}, hash: 0B2233BDB898C095094249901C51CFC3
	@Test()
	void merge1WhenCaughtExceptionAndExistingMapIsNull() throws Exception {
		/* Branches:
		 * (catch-exception (Exception)) : true  #  inside getExistingIfPossible method
		 * (existingMap == null) : true
		 */
		//Arrange Statement(s)
		doThrow(runtimeExceptionMock).when(existingMock).get();
		MapBinder target = new MapBinder(binderContextMock);
		Map<Object, Object> objectObjectMap = new HashMap<>();

		//Act Statement(s)
		Map<Object, Object> result = target.merge(existingMock, objectObjectMap);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(objectObjectMap));
			verify(existingMock).get();
		});
	}
}
