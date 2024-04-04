/*
 * Copyright 2012-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.context.properties.bind;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import org.springframework.aot.hint.RuntimeHints;
import org.springframework.util.Assert;

import org.mockito.MockedStatic;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BindableRuntimeHintsRegistrarSapientGeneratedTest {

	//Sapient generated method id: ${b1fc7be3-9a56-3b28-acf9-0d8d8fa91d7d}, hash: E599107814AC0C1BC1CA38720EA7C8AC
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

	//Sapient generated method id: ${94213cdb-311d-376f-81f8-48586bfd4718}, hash: C34E9819B0EB97AA2B7F4F43D326BCCD
	@Test()
	void registerHints1WhenCompiledWithoutParametersIsEmpty() {
		/* Branches:
		 * (for-each(this.bindables)) : true
		 * (!compiledWithoutParameters.isEmpty()) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Object object = new Object();
		Bindable bindable = Bindable.ofInstance(object);
		Bindable<?>[] bindableArray = new Bindable[] { bindable };
		BindableRuntimeHintsRegistrar target = new BindableRuntimeHintsRegistrar(bindableArray);
		RuntimeHints runtimeHints = new RuntimeHints();

		//Act Statement(s)
		target.registerHints(runtimeHints);
	}

	//Sapient generated method id: ${bc32b462-c0e2-3b0a-8d60-1ededd13d7e9}, hash: 37894DC821DEF530FAF166B7804D4451
	@Test()
	@Disabled
	void forTypesTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Iterable iterableMock = mock(Iterable.class, "void");
		try (MockedStatic<BindableRuntimeHintsRegistrar> bindableRuntimeHintsRegistrar = mockStatic(BindableRuntimeHintsRegistrar.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(iterableMock, "Types must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Class[] classArray = new Class[] {};
			BindableRuntimeHintsRegistrar bindableRuntimeHintsRegistrar2 = BindableRuntimeHintsRegistrar.forTypes(classArray);
			Class[] classArray2 = new Class[] {};
			bindableRuntimeHintsRegistrar.when(() -> BindableRuntimeHintsRegistrar.forTypes(classArray2)).thenReturn(bindableRuntimeHintsRegistrar2);
			//Act Statement(s)
			BindableRuntimeHintsRegistrar result = BindableRuntimeHintsRegistrar.forTypes(iterableMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindableRuntimeHintsRegistrar2));
				_assert.verify(() -> Assert.notNull(iterableMock, "Types must not be null"), atLeast(1));
				bindableRuntimeHintsRegistrar.verify(() -> BindableRuntimeHintsRegistrar.forTypes(classArray2), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${55cc2ab7-c9de-3c22-a6fe-af0d4c42310b}, hash: FEA8E2E0232CD2C76C16AE6C0A10E894
	@Test()
	void forTypes1Test() {
		//Arrange Statement(s)
		Class<?>[] classArray = new Class[] {};

		//Act Statement(s)
		BindableRuntimeHintsRegistrar result = BindableRuntimeHintsRegistrar.forTypes(classArray);

		//Assert statement(s)
		//TODO: Please implement equals method in BindableRuntimeHintsRegistrar for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${9fbf1158-262c-310f-a0b2-fd9cc0ebcdc6}, hash: 65C4B3C2BB6C56B49AEAB29F5ABFA173
	@Test()
	@Disabled
	void forBindablesTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Iterable iterableMock = mock(Iterable.class);
		try (MockedStatic<BindableRuntimeHintsRegistrar> bindableRuntimeHintsRegistrar = mockStatic(BindableRuntimeHintsRegistrar.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(iterableMock, "Bindables must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Class[] classArray = new Class[] {};
			BindableRuntimeHintsRegistrar bindableRuntimeHintsRegistrar2 = BindableRuntimeHintsRegistrar.forTypes(classArray);
			Bindable[] bindableArray = new Bindable[] {};
			bindableRuntimeHintsRegistrar.when(() -> BindableRuntimeHintsRegistrar.forBindables(bindableArray)).thenReturn(bindableRuntimeHintsRegistrar2);
			//Act Statement(s)
			BindableRuntimeHintsRegistrar result = BindableRuntimeHintsRegistrar.forBindables(iterableMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindableRuntimeHintsRegistrar2));
				_assert.verify(() -> Assert.notNull(iterableMock, "Bindables must not be null"), atLeast(1));
				bindableRuntimeHintsRegistrar.verify(() -> BindableRuntimeHintsRegistrar.forBindables(bindableArray), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${81b33437-9e76-3aa7-a922-56dd13cbf50f}, hash: 8C8AC6A13BD81715AA93CB8BF1918443
	@Test()
	void forBindables1Test() {
		//Arrange Statement(s)
		Bindable<?>[] bindableArray = new Bindable[] {};

		//Act Statement(s)
		BindableRuntimeHintsRegistrar result = BindableRuntimeHintsRegistrar.forBindables(bindableArray);

		//Assert statement(s)
		//TODO: Please implement equals method in BindableRuntimeHintsRegistrar for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
