package org.springframework.boot.util;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.mockito.stubbing.Answer;

import org.springframework.util.Assert;

import java.util.Collection;

import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.util.function.Consumer;

import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Constructor;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class InstantiatorSapientGeneratedTest {

	private final Instantiator.FailureHandler failureHandlerMock = mock(Instantiator.FailureHandler.class, "failure");

	private final Consumer availableParametersMock = mock(Consumer.class);

	private final Constructor constructorMock = mock(Constructor.class);

	private final Consumer consumerMock = mock(Consumer.class);

	//Sapient generated method id: ${82924032-459c-3122-937e-f03e9b5ac3f9}, hash: A03C24A0CF93EBAEF6C1E62F3E490EA6
	@Test()
	void instantiateTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Consumer availableParametersMock = mock(Consumer.class, "2021-10-01");
		doNothing().when(availableParametersMock).accept((Object) any());
		Instantiator<Object> target = spy(new Instantiator(String.class, availableParametersMock, failureHandlerMock));
		List<Object> objectList = new ArrayList<>();
		Collection<String> collection = new ArrayList<>();
		collection.add("John");
		collection.add("Jane");
		collection.add("Bob");
		doReturn(objectList).when(target).instantiate((ClassLoader) null, collection);
		//Act Statement(s)
		List<Object> result = target.instantiate(collection);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(objectList));
			verify(availableParametersMock).accept((Object) any());
			verify(target).instantiate((ClassLoader) null, collection);
		});
	}

	//Sapient generated method id: ${80c68cc7-92aa-31d8-8a86-6d3765d76d4d}, hash: 8A83D1E4DACF42BD50465345C8625009
	@Disabled()
	@Test()
	void instantiate1WhenArgsIsNotNull() {
		/* Branches:
		 * (for-each(constructors)) : true  #  inside instantiate method
		 * (i < parameterTypes.length) : false  #  inside getArgs method
		 * (args != null) : true  #  inside instantiate method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			doNothing().when(availableParametersMock).accept((Object) any());
			_assert.when(() -> Assert.isAssignable(Object.class, Object.class)).thenAnswer((Answer<Void>) invocation -> null);
			reflectionUtils.when(() -> ReflectionUtils.makeAccessible(constructorMock)).thenAnswer((Answer<Void>) invocation -> null);
			Instantiator<Object> target = new Instantiator(Object.class, availableParametersMock, failureHandlerMock);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			Collection<String> collection = new ArrayList<>();
			collection.add("<value>");
			//Act Statement(s)
			List<Object> result = target.instantiate(classLoader, collection);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				verify(availableParametersMock, atLeast(1)).accept((Object) any());
				_assert.verify(() -> Assert.isAssignable(Object.class, Object.class), atLeast(1));
				reflectionUtils.verify(() -> ReflectionUtils.makeAccessible(constructorMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${9590d6b3-45d0-38a9-85da-3103db50c568}, hash: 73B195B81D7DA2817753F4D03AE5CEA6
	@Disabled()
	@Test()
	void instantiate1WhenParameterIsNullAndArgsIsNull() {
		/* Branches:
		 * (for-each(constructors)) : true  #  inside instantiate method
		 * (i < parameterTypes.length) : true  #  inside getArgs method
		 * (for-each(this.availableParameters.entrySet())) : false  #  inside getAvailableParameter method
		 * (parameter == null) : true  #  inside getArgs method
		 * (args != null) : false  #  inside instantiate method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			doNothing().when(availableParametersMock).accept((Object) any());
			_assert.when(() -> Assert.isAssignable(Object.class, Object.class)).thenAnswer((Answer<Void>) invocation -> null);
			Instantiator<Object> target = new Instantiator(Object.class, availableParametersMock, failureHandlerMock);
			Throwable throwable = new Throwable();
			doNothing().when(failureHandlerMock).handleFailure(Object.class, "arg1", throwable);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			Collection<String> collection = new ArrayList<>();
			collection.add("<value>");
			//Act Statement(s)
			List<Object> result = target.instantiate(classLoader, collection);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				verify(availableParametersMock, atLeast(1)).accept((Object) any());
				_assert.verify(() -> Assert.isAssignable(Object.class, Object.class), atLeast(1));
				verify(failureHandlerMock, atLeast(1)).handleFailure(Object.class, "arg1", throwable);
			});
		}
	}

	//Sapient generated method id: ${c1726a3c-ea37-3412-be59-248ad82f7d1f}, hash: 2409A8CB2EC2992325B1F332631E92AF
	@Disabled()
	@Test()
	void instantiateTypesWhenArgsIsNotNull() {
		/* Branches:
		 * (for-each(constructors)) : true  #  inside instantiate method
		 * (i < parameterTypes.length) : false  #  inside getArgs method
		 * (args != null) : true  #  inside instantiate method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(anyCollection(), eq("Types must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isAssignable(Object.class, Object.class)).thenAnswer((Answer<Void>) invocation -> null);
			reflectionUtils.when(() -> ReflectionUtils.makeAccessible(constructorMock)).thenAnswer((Answer<Void>) invocation -> null);
			Instantiator<Object> target = new Instantiator(Object.class, consumerMock, failureHandlerMock);
			Collection<Class<?>> collection = new ArrayList<>();
			collection.add(Object.class);
			//Act Statement(s)
			List<Object> result = target.instantiateTypes(collection);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("Types must not be null")));
				_assert.verify(() -> Assert.isAssignable(Object.class, Object.class), atLeast(1));
				reflectionUtils.verify(() -> ReflectionUtils.makeAccessible(constructorMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${248ac416-ede7-37a0-8746-14c013ad530b}, hash: 51638B365E53B141F837A9DDB21CBDA7
	@Disabled()
	@Test()
	void instantiateTypesWhenParameterIsNullAndArgsIsNull() {
		/* Branches:
		 * (for-each(constructors)) : true  #  inside instantiate method
		 * (i < parameterTypes.length) : true  #  inside getArgs method
		 * (for-each(this.availableParameters.entrySet())) : false  #  inside getAvailableParameter method
		 * (parameter == null) : true  #  inside getArgs method
		 * (args != null) : false  #  inside instantiate method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(anyCollection(), eq("Types must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isAssignable(Object.class, Object.class)).thenAnswer((Answer<Void>) invocation -> null);
			Instantiator<Object> target = new Instantiator(Object.class, consumerMock, failureHandlerMock);
			Throwable throwable = new Throwable();
			doNothing().when(failureHandlerMock).handleFailure(Object.class, "arg1", throwable);
			Collection<Class<?>> collection = new ArrayList<>();
			collection.add(Object.class);
			//Act Statement(s)
			List<Object> result = target.instantiateTypes(collection);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("Types must not be null")));
				_assert.verify(() -> Assert.isAssignable(Object.class, Object.class), atLeast(1));
				verify(failureHandlerMock).handleFailure(Object.class, "arg1", throwable);
			});
		}
	}
}
