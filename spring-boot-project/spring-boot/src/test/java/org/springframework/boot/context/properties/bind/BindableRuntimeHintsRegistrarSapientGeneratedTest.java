package org.springframework.boot.context.properties.bind;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import org.springframework.aot.hint.RuntimeHints;
import org.springframework.util.Assert;

import org.mockito.MockedStatic;

import org.springframework.aot.hint.ReflectionHints;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BindableRuntimeHintsRegistrarSapientGeneratedTest {

	//Sapient generated method id: ${b1fc7be3-9a56-3b28-acf9-0d8d8fa91d7d}
	@Test()
	void registerHintsTest() {
		//Arrange Statement(s)
		Bindable<?>[] bindableArray = new Bindable[] {};
		BindableRuntimeHintsRegistrar target = spy(new BindableRuntimeHintsRegistrar(bindableArray));
		RuntimeHints runtimeHintsMock = mock(RuntimeHints.class);
		doNothing().when(target).registerHints(runtimeHintsMock);
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//Act Statement(s)
		target.registerHints(runtimeHintsMock, classLoader);
		//Assert statement(s)
		assertAll("result", () -> verify(target).registerHints(runtimeHintsMock));
	}

	//Sapient generated method id: ${94213cdb-311d-376f-81f8-48586bfd4718}
	@Disabled()
	@Test()
	void registerHints1WhenCompiledWithoutParametersIsEmpty() {
		/* Branches:
		 * (for-each(this.bindables)) : true
		 * (!compiledWithoutParameters.isEmpty()) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		ReflectionHints reflectionHints2 = null;
		//Arrange Statement(s)
		RuntimeHints hintsMock = mock(RuntimeHints.class, "ReflectionHintsPlaceholder");
		ReflectionHints reflectionHints = new ReflectionHints();
		doReturn(reflectionHints, reflectionHints2).when(hintsMock).reflection();
		Object object = new Object();
		Bindable bindable = Bindable.ofInstance(object);
		Bindable bindable2 = Bindable.ofInstance(object);
		Bindable<?>[] bindableArray = new Bindable[] { bindable, bindable2 };
		BindableRuntimeHintsRegistrar target = new BindableRuntimeHintsRegistrar(bindableArray);
		//Act Statement(s)
		target.registerHints(hintsMock);
		//Assert statement(s)
		assertAll("result", () -> verify(hintsMock, times(2)).reflection());
	}

	//Sapient generated method id: ${bc32b462-c0e2-3b0a-8d60-1ededd13d7e9}
	@Test()
	void forTypesTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) null, "Types must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Iterable<Class<?>> iterable = null;
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				BindableRuntimeHintsRegistrar.forTypes(iterable);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull((Iterable) null, "Types must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${55cc2ab7-c9de-3c22-a6fe-af0d4c42310b}
	@Disabled()
	@Test()
	void forTypes1Test() {
		//Arrange Statement(s)
		Class<?>[] classArray = new Class[] {};
		//Act Statement(s)
		BindableRuntimeHintsRegistrar result = BindableRuntimeHintsRegistrar.forTypes(classArray);
		BindableRuntimeHintsRegistrar bindableRuntimeHintsRegistrar = new BindableRuntimeHintsRegistrar(classArray);
		//Assert statement(s)
		//TODO: Please implement equals method in BindableRuntimeHintsRegistrar for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(bindableRuntimeHintsRegistrar)));
	}

	//Sapient generated method id: ${9fbf1158-262c-310f-a0b2-fd9cc0ebcdc6}
	@Test()
	void forBindablesTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) null, "Bindables must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Iterable<Bindable<?>> iterable = null;
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				BindableRuntimeHintsRegistrar.forBindables(iterable);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull((Iterable) null, "Bindables must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${81b33437-9e76-3aa7-a922-56dd13cbf50f}
	@Disabled()
	@Test()
	void forBindables1Test() {
		//Arrange Statement(s)
		Bindable<?>[] bindableArray = new Bindable[] {};
		//Act Statement(s)
		BindableRuntimeHintsRegistrar result = BindableRuntimeHintsRegistrar.forBindables(bindableArray);
		BindableRuntimeHintsRegistrar bindableRuntimeHintsRegistrar = new BindableRuntimeHintsRegistrar(bindableArray);
		//Assert statement(s)
		//TODO: Please implement equals method in BindableRuntimeHintsRegistrar for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(bindableRuntimeHintsRegistrar)));
	}
}
