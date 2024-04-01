package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.mockito.stubbing.Answer;

import java.util.Iterator;
import java.util.stream.Stream;

import org.springframework.util.Assert;

import java.util.Map;
import java.util.HashMap;

import org.mockito.MockedStatic;

import java.util.Spliterators;
import java.util.ArrayList;
import java.util.stream.StreamSupport;

import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MapConfigurationPropertySourceSapientGeneratedTest {

	private final Object objectMock = mock(Object.class, "putAll_object1");

	//Sapient generated method id: ${2bbc6922-a600-334f-8353-150bbd738316}, hash: 6B2258DD7828AA8DFD55424D9AAE1367
	@Test()
	void putAllTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(anyMap(), eq("Map must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			Map<Object, Object> anyMap = new HashMap<>();
			anyMap.put(objectMock, object);
			MapConfigurationPropertySource target = new MapConfigurationPropertySource(anyMap);
			//Act Statement(s)
			target.putAll(anyMap);
			//Assert statement(s)
			assertAll("result", () -> _assert.verify(() -> Assert.notNull(anyMap(), eq("Map must not be null")), atLeast(2)));
		}
	}

	//Sapient generated method id: ${85fc7d61-2adf-3de9-99bd-7c4668d4db27}, hash: 2439211AEEE238B0809E282A017A53F3
	@Test()
	void putAllWhenCaughtUnsupportedOperationExceptionThrowsIllegalArgumentException() {
		/* Branches:
		 * (catch-exception (UnsupportedOperationException)) : true  #  inside assertNotReadOnlySystemAttributesMap method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(anyMap(), eq("Map must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			Map<Object, Object> anyMap = new HashMap<>();
			anyMap.put(objectMock, object);
			MapConfigurationPropertySource target = new MapConfigurationPropertySource(anyMap);
			//Act Statement(s)
			final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
				target.putAll(anyMap);
			});
			UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
			IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Security restricted maps are not supported", unsupportedOperationException);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(unsupportedOperationException.getClass())));
				_assert.verify(() -> Assert.notNull(anyMap(), eq("Map must not be null")), atLeast(2));
			});
		}
	}

	//Sapient generated method id: ${2e70a0c5-71d2-39c6-92e2-fbf6bce22c05}, hash: A21753DB391A15B35F186C4E81324598
	@Test()
	void putWhenNameIsNotNull() {
		/* Branches:
		 * (name != null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(anyMap(), eq("Map must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			Map<Object, Object> anyMap = new HashMap<>();
			anyMap.put(objectMock, object);
			MapConfigurationPropertySource target = new MapConfigurationPropertySource(anyMap);
			//Act Statement(s)
			target.put(objectMock, object);
			//Assert statement(s)
			assertAll("result", () -> _assert.verify(() -> Assert.notNull(anyMap(), eq("Map must not be null"))));
		}
	}

	//Sapient generated method id: ${1837e23c-991b-384b-806a-1a7ed0082d81}, hash: E05B1F2B0580CD5E8BBA09E24F2AB811
	@Test()
	void putWhenNameIsNull() {
		/* Branches:
		 * (name != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(anyMap(), eq("Map must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			Map<Object, Object> anyMap = new HashMap<>();
			anyMap.put((Object) null, object);
			MapConfigurationPropertySource target = new MapConfigurationPropertySource(anyMap);
			Object object2 = null;
			//Act Statement(s)
			target.put(object2, object);
			//Assert statement(s)
			assertAll("result", () -> _assert.verify(() -> Assert.notNull(anyMap(), eq("Map must not be null"))));
		}
	}

	//Sapient generated method id: ${72fc3519-47ef-3838-a2f1-90ba712b0e09}, hash: ECED74E6B7B39AAD5D431CDF47F08C09
	@Test()
	void getUnderlyingSourceTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(anyMap(), eq("Map must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			Map<Object, Object> anyMap = new HashMap<>();
			anyMap.put(objectMock, object);
			MapConfigurationPropertySource target = new MapConfigurationPropertySource(anyMap);
			//Act Statement(s)
			Object result = target.getUnderlyingSource();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(anyMap(), eq("Map must not be null")));
			});
		}
	}

	//Sapient generated method id: ${2af186d6-0583-3fde-9f9e-d7a521abbeee}, hash: AA352186CC84A5029FC8497CF5ADF3CC
	@Test()
	void getConfigurationPropertyTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(anyMap(), eq("Map must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			Map<Object, Object> anyMap = new HashMap<>();
			anyMap.put(objectMock, object);
			MapConfigurationPropertySource target = new MapConfigurationPropertySource(anyMap);
			//Act Statement(s)
			ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(anyMap(), eq("Map must not be null")));
			});
		}
	}

	//Sapient generated method id: ${78c09fb6-edcf-3ce7-9932-6ef4ffc152b3}, hash: 1979A5F89C4A4E465B39A0A1053CE5BC
	@Test()
	void iteratorTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(anyMap(), eq("Map must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			Map<Object, Object> anyMap = new HashMap<>();
			anyMap.put(objectMock, object);
			MapConfigurationPropertySource target = new MapConfigurationPropertySource(anyMap);
			//Act Statement(s)
			Iterator<ConfigurationPropertyName> result = target.iterator();
			List list = new ArrayList<>();
			Iterator<ConfigurationPropertyName> iteratorResult = list.iterator();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(StreamSupport.stream(Spliterators.spliteratorUnknownSize(result, 0), false).toArray(), equalTo(StreamSupport.stream(Spliterators.spliteratorUnknownSize(iteratorResult, 0), false).toArray()));
				_assert.verify(() -> Assert.notNull(anyMap(), eq("Map must not be null")));
			});
		}
	}

	//Sapient generated method id: ${b4af2388-e781-3800-820a-b8ede09bd914}, hash: 909D6EAAE440107605BEA88A034B4305
	@Test()
	void streamTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(anyMap(), eq("Map must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			Map<Object, Object> anyMap = new HashMap<>();
			anyMap.put(objectMock, object);
			MapConfigurationPropertySource target = new MapConfigurationPropertySource(anyMap);
			//Act Statement(s)
			Stream<ConfigurationPropertyName> result = target.stream();
			//Assert statement(s)
			//TODO: Please implement equals method in Stream for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(anyMap(), eq("Map must not be null")));
			});
		}
	}
}
