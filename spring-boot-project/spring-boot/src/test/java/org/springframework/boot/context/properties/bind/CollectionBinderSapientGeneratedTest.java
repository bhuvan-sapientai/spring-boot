package org.springframework.boot.context.properties.bind;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.core.ResolvableType;
import org.springframework.core.CollectionFactory;

import java.util.Collection;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import java.util.ArrayList;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.doThrow;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CollectionBinderSapientGeneratedTest {

	private final AggregateElementBinder aggregateElementBinderMock = mock(AggregateElementBinder.class);

	private final Binder.Context binderContextMock = mock(Binder.Context.class);

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final Supplier existingMock = mock(Supplier.class, "null");

	private final ResolvableType resolvableTypeMock = mock(ResolvableType.class);

	private final ResolvableType resolvableTypeMock2 = mock(ResolvableType.class);

	private final ResolvableType resolvableTypeMock3 = mock(ResolvableType.class);

	private final ResolvableType resolvableTypeMock4 = mock(ResolvableType.class);

	private final ResolvableType resolvableTypeMock5 = mock(ResolvableType.class);

	private final RuntimeException runtimeExceptionMock = mock(RuntimeException.class);

	//Sapient generated method id: ${e692a290-b7ee-3345-a59f-d8e03e640b19}, hash: A2C79D52B66AEDE0D2252641EF1B8796
	@Disabled()
	@Test()
	void bindAggregateWhenResultWasSupplied() {
		/* Branches:
		 * (result.wasSupplied()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: result
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
			ResolvableType[] resolvableTypeArray = new ResolvableType[] {};
			doReturn(resolvableTypeArray).when(resolvableTypeMock2).getGenerics();
			doReturn(resolvableTypeMock2, resolvableTypeMock3).when(resolvableTypeMock).asCollection();
			int[] intArray = new int[] {};
			doReturn(resolvableTypeMock4).when(resolvableTypeMock3).getGeneric(intArray);
			resolvableType.when(() -> ResolvableType.forClassWithGenerics(List.class, resolvableTypeArray)).thenReturn(resolvableTypeMock5);
			CollectionBinder target = spy(new CollectionBinder(binderContextMock));
			doNothing().when(target).bindIndexed(eq(configurationPropertyNameMock), (Bindable) any(), eq(aggregateElementBinderMock), eq(resolvableTypeMock5), eq(resolvableTypeMock4), (IndexedElementsBinder.IndexedCollectionSupplier) any());
			Bindable bindable = Bindable.of(resolvableTypeMock);
			//Act Statement(s)
			Object result = target.bindAggregate(configurationPropertyNameMock, bindable, aggregateElementBinderMock);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(resolvableTypeMock, times(2)).asCollection();
				verify(resolvableTypeMock2).getGenerics();
				verify(resolvableTypeMock3).getGeneric(intArray);
				resolvableType.verify(() -> ResolvableType.forClassWithGenerics(List.class, resolvableTypeArray), atLeast(1));
				verify(target).bindIndexed(eq(configurationPropertyNameMock), (Bindable) any(), eq(aggregateElementBinderMock), eq(resolvableTypeMock5), eq(resolvableTypeMock4), (IndexedElementsBinder.IndexedCollectionSupplier) any());
			});
		}
	}

	//Sapient generated method id: ${b803041a-05e6-3623-8060-a875ca1f5a9e}, hash: 9AEB2B3D898542DCE3B522C83ABC3367
	@Test()
	void bindAggregateWhenResultNotWasSupplied() {
		/* Branches:
		 * (result.wasSupplied()) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: result
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
			ResolvableType[] resolvableTypeArray = new ResolvableType[] {};
			doReturn(resolvableTypeArray).when(resolvableTypeMock2).getGenerics();
			doReturn(resolvableTypeMock2, resolvableTypeMock3).when(resolvableTypeMock).asCollection();
			int[] intArray = new int[] {};
			doReturn(resolvableTypeMock4).when(resolvableTypeMock3).getGeneric(intArray);
			resolvableType.when(() -> ResolvableType.forClassWithGenerics(List.class, resolvableTypeArray)).thenReturn(resolvableTypeMock5);
			CollectionBinder target = spy(new CollectionBinder(binderContextMock));
			doNothing().when(target).bindIndexed(eq(configurationPropertyNameMock), (Bindable) any(), eq(aggregateElementBinderMock), eq(resolvableTypeMock5), eq(resolvableTypeMock4), (IndexedElementsBinder.IndexedCollectionSupplier) any());
			Bindable bindable = Bindable.of(resolvableTypeMock);
			//Act Statement(s)
			Object result = target.bindAggregate(configurationPropertyNameMock, bindable, aggregateElementBinderMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(resolvableTypeMock, times(2)).asCollection();
				verify(resolvableTypeMock2).getGenerics();
				verify(resolvableTypeMock3).getGeneric(intArray);
				resolvableType.verify(() -> ResolvableType.forClassWithGenerics(List.class, resolvableTypeArray), atLeast(1));
				verify(target).bindIndexed(eq(configurationPropertyNameMock), (Bindable) any(), eq(aggregateElementBinderMock), eq(resolvableTypeMock5), eq(resolvableTypeMock4), (IndexedElementsBinder.IndexedCollectionSupplier) any());
			});
		}
	}

	//Sapient generated method id: ${d4b6d061-7340-30e3-87fa-bad8792e0847}, hash: 3C610C9A3049C864651A1370A22FF1D8
	@Test()
	void merge1WhenExistingCollectionIsNull() throws Exception {
		/* Branches:
		 * (existingCollection == null) : true
		 */
		//Arrange Statement(s)
		doReturn(null).when(existingMock).get();
		Binder.Context binderContextMock = mock(Binder.Context.class, "null");
		CollectionBinder target = new CollectionBinder(binderContextMock);
		Collection<Object> collection = new ArrayList<>();
		//Act Statement(s)
		Collection<Object> result = target.merge(existingMock, collection);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(collection));
			verify(existingMock).get();
		});
	}

	//Sapient generated method id: ${0bd8aafc-4575-32af-8606-de9fcc419d80}, hash: BC2574C0844364C3D2F03E064BAE74D5
	@Disabled()
	@Test()
	void merge1WhenExistingCollectionIsNotNull() throws Exception {
		/* Branches:
		 * (existingCollection == null) : false
		 */
		//Arrange Statement(s)
		Supplier existingMock = mock(Supplier.class);
		Binder.Context binderContextMock = mock(Binder.Context.class, "null");
		try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
			Collection collection = new ArrayList<>();
			doReturn(collection).when(existingMock).get();
			Collection<Object> collection2 = new ArrayList<>();
			collectionFactory.when(() -> CollectionFactory.createCollection(ArrayList.class, 0)).thenReturn(collection2);
			CollectionBinder target = new CollectionBinder(binderContextMock);
			Object object = new Object();
			Object object2 = new Object();
			Collection<Object> collection3 = new ArrayList<>();
			collection3.add(object);
			collection3.add(object2);
			//Act Statement(s)
			Collection<Object> result = target.merge(existingMock, collection3);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(collection2));
				verify(existingMock).get();
				collectionFactory.verify(() -> CollectionFactory.createCollection(ArrayList.class, 0), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${27ad051d-497e-338e-959d-4de0373f3c6e}, hash: B7A0C1021F6C4E95AD65537984817ACB
	@Disabled()
	@Test()
	void merge1WhenCaughtUnsupportedOperationException() throws Exception {
		/* Branches:
		 * (existingCollection == null) : false
		 * (catch-exception (UnsupportedOperationException)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Supplier existingMock = mock(Supplier.class);
		Binder.Context binderContextMock = mock(Binder.Context.class, "null");
		try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
			Collection collection = new ArrayList<>();
			doReturn(collection).when(existingMock).get();
			Collection<Object> collection2 = new ArrayList<>();
			collectionFactory.when(() -> CollectionFactory.createCollection(ArrayList.class, 0)).thenReturn(collection2);
			Collection<Object> collection3 = new ArrayList<>();
			collectionFactory.when(() -> CollectionFactory.createCollection(ArrayList.class, 2)).thenReturn(collection3);
			CollectionBinder target = new CollectionBinder(binderContextMock);
			Object object = new Object();
			Object object2 = new Object();
			Collection<Object> collection4 = new ArrayList<>();
			collection4.add(object);
			collection4.add(object2);
			//Act Statement(s)
			Collection<Object> result = target.merge(existingMock, collection4);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(collection3));
				verify(existingMock).get();
				collectionFactory.verify(() -> CollectionFactory.createCollection(ArrayList.class, 0), atLeast(1));
				collectionFactory.verify(() -> CollectionFactory.createCollection(ArrayList.class, 2), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${e452e94b-b1fe-3a3a-8001-5d8d839829f7}, hash: 6387461AFBFEFA375479D707AE302C28
	@Disabled()
	@Test()
	void merge1WhenCaughtException() throws Exception {
		/* Branches:
		 * (existingCollection == null) : false
		 * (catch-exception (Exception)) : true  #  inside copyIfPossible method
		 */
		//Arrange Statement(s)
		Supplier existingMock = mock(Supplier.class);
		Binder.Context binderContextMock = mock(Binder.Context.class, "null");
		try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
			Collection collection = new ArrayList<>();
			doReturn(collection).when(existingMock).get();
			collectionFactory.when(() -> CollectionFactory.createCollection(ArrayList.class, 0)).thenThrow(runtimeExceptionMock);
			CollectionBinder target = new CollectionBinder(binderContextMock);
			Object object = new Object();
			Object object2 = new Object();
			Collection<Object> collection2 = new ArrayList<>();
			collection2.add(object);
			collection2.add(object2);
			//Act Statement(s)
			Collection<Object> result = target.merge(existingMock, collection2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				verify(existingMock).get();
				collectionFactory.verify(() -> CollectionFactory.createCollection(ArrayList.class, 0), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f65bf95d-6b3d-37b7-9cf4-c05435faf474}, hash: 696D69AE5DDD44C75992CBAD64E59028
	@Test()
	void merge1WhenCaughtExceptionAndExistingCollectionIsNull() throws Exception {
		/* Branches:
		 * (catch-exception (Exception)) : true  #  inside getExistingIfPossible method
		 * (existingCollection == null) : true
		 */
		//Arrange Statement(s)
		doThrow(runtimeExceptionMock).when(existingMock).get();
		Binder.Context binderContextMock = mock(Binder.Context.class, "null");
		CollectionBinder target = new CollectionBinder(binderContextMock);
		Collection<Object> collection = new ArrayList<>();
		//Act Statement(s)
		Collection<Object> result = target.merge(existingMock, collection);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(collection));
			verify(existingMock).get();
		});
	}
}
