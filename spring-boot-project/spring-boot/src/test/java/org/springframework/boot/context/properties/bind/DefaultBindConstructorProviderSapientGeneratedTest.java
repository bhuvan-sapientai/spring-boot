package org.springframework.boot.context.properties.bind;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import org.springframework.core.ResolvableType;

import java.lang.reflect.Constructor;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DefaultBindConstructorProviderSapientGeneratedTest {

	private final Bindable<?> bindableMock = mock(Bindable.class);

	private final DefaultBindConstructorProvider.Constructors defaultBindConstructorProviderConstructorsMock = mock(DefaultBindConstructorProvider.Constructors.class);

	private final ResolvableType resolvableTypeMock = mock(ResolvableType.class);

	//Sapient generated method id: ${e8d915a5-39dc-32d4-ac18-b76d08af025d}
	@Disabled()
	@Test()
	void getBindConstructorWhenBindableGetValueGetIsNotNull() {
		/* Branches:
		 * (constructors.getBind() != null) : true
		 * (constructors.isDeducedBindConstructor()) : true
		 * (!constructors.isImmutableType()) : true
		 * (bindable.getValue() != null) : true
		 * (bindable.getValue().get() != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<DefaultBindConstructorProvider.Constructors> defaultBindConstructorProviderConstructors = mockStatic(DefaultBindConstructorProvider.Constructors.class)) {
			doReturn(resolvableTypeMock).when(bindableMock).getType();
			doReturn(Object.class).when(resolvableTypeMock).resolve();
			//TODO: Needs to return real value
			doReturn(null).when(bindableMock).getValue();
			defaultBindConstructorProviderConstructors.when(() -> DefaultBindConstructorProvider.Constructors.getConstructors(Object.class, false)).thenReturn(defaultBindConstructorProviderConstructorsMock);
			//TODO: Needs to return real value
			doReturn(null).when(defaultBindConstructorProviderConstructorsMock).getBind();
			doReturn(true).when(defaultBindConstructorProviderConstructorsMock).isDeducedBindConstructor();
			doReturn(false).when(defaultBindConstructorProviderConstructorsMock).isImmutableType();
			DefaultBindConstructorProvider target = new DefaultBindConstructorProvider();
			//Act Statement(s)
			Constructor<?> result = target.getBindConstructor(bindableMock, false);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(bindableMock).getType();
				verify(resolvableTypeMock).resolve();
				verify(bindableMock, times(2)).getValue();
				defaultBindConstructorProviderConstructors.verify(() -> DefaultBindConstructorProvider.Constructors.getConstructors(Object.class, false), atLeast(1));
				verify(defaultBindConstructorProviderConstructorsMock).getBind();
				verify(defaultBindConstructorProviderConstructorsMock).isDeducedBindConstructor();
				verify(defaultBindConstructorProviderConstructorsMock).isImmutableType();
			});
		}
	}

	//Sapient generated method id: ${48284b12-4c06-33f5-a80d-006947556451}
	@Disabled()
	@Test()
	void getBindConstructorWhenBindableGetValueGetIsNull() {
		/* Branches:
		 * (constructors.getBind() != null) : true
		 * (constructors.isDeducedBindConstructor()) : true
		 * (!constructors.isImmutableType()) : true
		 * (bindable.getValue() != null) : true
		 * (bindable.getValue().get() != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<DefaultBindConstructorProvider.Constructors> defaultBindConstructorProviderConstructors = mockStatic(DefaultBindConstructorProvider.Constructors.class)) {
			doReturn(resolvableTypeMock).when(bindableMock).getType();
			doReturn(Object.class).when(resolvableTypeMock).resolve();
			//TODO: Needs to return real value
			doReturn(null).when(bindableMock).getValue();
			defaultBindConstructorProviderConstructors.when(() -> DefaultBindConstructorProvider.Constructors.getConstructors(Object.class, false)).thenReturn(defaultBindConstructorProviderConstructorsMock);
			//TODO: Needs to return real value
			doReturn(null).when(defaultBindConstructorProviderConstructorsMock).getBind();
			doReturn(true).when(defaultBindConstructorProviderConstructorsMock).isDeducedBindConstructor();
			doReturn(false).when(defaultBindConstructorProviderConstructorsMock).isImmutableType();
			DefaultBindConstructorProvider target = new DefaultBindConstructorProvider();
			//Act Statement(s)
			Constructor<?> result = target.getBindConstructor(bindableMock, false);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(bindableMock).getType();
				verify(resolvableTypeMock).resolve();
				verify(bindableMock, times(2)).getValue();
				defaultBindConstructorProviderConstructors.verify(() -> DefaultBindConstructorProvider.Constructors.getConstructors(Object.class, false), atLeast(1));
				verify(defaultBindConstructorProviderConstructorsMock, times(2)).getBind();
				verify(defaultBindConstructorProviderConstructorsMock).isDeducedBindConstructor();
				verify(defaultBindConstructorProviderConstructorsMock).isImmutableType();
			});
		}
	}

	//Sapient generated method id: ${88d6a42d-24de-31df-bea3-67e1e253d8da}
	@Test()
	void getBindConstructor1Test() {
		//Arrange Statement(s)
		try (MockedStatic<DefaultBindConstructorProvider.Constructors> defaultBindConstructorProviderConstructors = mockStatic(DefaultBindConstructorProvider.Constructors.class)) {
			defaultBindConstructorProviderConstructors.when(() -> DefaultBindConstructorProvider.Constructors.getConstructors(Object.class, false)).thenReturn(defaultBindConstructorProviderConstructorsMock);
			//TODO: Needs to return real value
			doReturn(null).when(defaultBindConstructorProviderConstructorsMock).getBind();
			DefaultBindConstructorProvider target = new DefaultBindConstructorProvider();
			//Act Statement(s)
			Constructor<?> result = target.getBindConstructor(Object.class, false);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				defaultBindConstructorProviderConstructors.verify(() -> DefaultBindConstructorProvider.Constructors.getConstructors(Object.class, false), atLeast(1));
				verify(defaultBindConstructorProviderConstructorsMock).getBind();
			});
		}
	}
}
