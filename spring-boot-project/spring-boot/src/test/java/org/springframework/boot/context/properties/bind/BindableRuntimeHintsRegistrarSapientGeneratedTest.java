package org.springframework.boot.context.properties.bind;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.util.Assert;
import org.mockito.MockedStatic;
import java.util.ArrayList;
import org.springframework.aot.hint.ReflectionHints;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BindableRuntimeHintsRegistrarSapientGeneratedTest {

    private final BindableRuntimeHintsRegistrar bindableRuntimeHintsRegistrarMock = mock(BindableRuntimeHintsRegistrar.class);

    //Sapient generated method id: ${registerHintsTest}, hash: E599107814AC0C1BC1CA38720EA7C8AC
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

    //Sapient generated method id: ${registerHints1WhenCompiledWithoutParametersIsEmpty}, hash: 42A7E3F85C1E6954C28251E7B8F64BC8
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
        //Arrange Statement(s)
        RuntimeHints hintsMock = mock(RuntimeHints.class);
        ReflectionHints reflectionHintsMock = mock(ReflectionHints.class);
        doReturn(reflectionHintsMock).when(hintsMock).reflection();
        Bindable bindableMock = mock(Bindable.class);
        Bindable<?>[] bindableArray = new Bindable[] { bindableMock };
        BindableRuntimeHintsRegistrar target = new BindableRuntimeHintsRegistrar(bindableArray);
        //Act Statement(s)
        target.registerHints(hintsMock);
        //Assert statement(s)
        assertAll("result", () -> verify(hintsMock).reflection());
    }

    //Sapient generated method id: ${forTypesTest}, hash: 6671872E9666FBA054CF7B306697ECE3
    @Test()
    void forTypesTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BindableRuntimeHintsRegistrar> bindableRuntimeHintsRegistrar = mockStatic(BindableRuntimeHintsRegistrar.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull((Iterable) any(), eq("Types must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            Class[] classArray = new Class[] {};
            bindableRuntimeHintsRegistrar.when(() -> BindableRuntimeHintsRegistrar.forTypes(classArray)).thenReturn(bindableRuntimeHintsRegistrarMock);
            Iterable<Class<?>> iterable = new ArrayList<>();
            //Act Statement(s)
            BindableRuntimeHintsRegistrar result = BindableRuntimeHintsRegistrar.forTypes(iterable);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bindableRuntimeHintsRegistrarMock));
                _assert.verify(() -> Assert.notNull((Iterable) any(), eq("Types must not be null")), atLeast(1));
                bindableRuntimeHintsRegistrar.verify(() -> BindableRuntimeHintsRegistrar.forTypes(classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${forTypes1Test}, hash: FEA8E2E0232CD2C76C16AE6C0A10E894
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

    //Sapient generated method id: ${forBindablesTest}, hash: 397BC1A97DA0B9B75023C4098B39E67A
    @Test()
    void forBindablesTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BindableRuntimeHintsRegistrar> bindableRuntimeHintsRegistrar = mockStatic(BindableRuntimeHintsRegistrar.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull((Iterable) any(), eq("Bindables must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            Bindable[] bindableArray = new Bindable[] {};
            bindableRuntimeHintsRegistrar.when(() -> BindableRuntimeHintsRegistrar.forBindables(bindableArray)).thenReturn(bindableRuntimeHintsRegistrarMock);
            Iterable<Bindable<?>> iterable = new ArrayList<>();
            //Act Statement(s)
            BindableRuntimeHintsRegistrar result = BindableRuntimeHintsRegistrar.forBindables(iterable);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bindableRuntimeHintsRegistrarMock));
                _assert.verify(() -> Assert.notNull((Iterable) any(), eq("Bindables must not be null")), atLeast(1));
                bindableRuntimeHintsRegistrar.verify(() -> BindableRuntimeHintsRegistrar.forBindables(bindableArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${forBindables1Test}, hash: 8C8AC6A13BD81715AA93CB8BF1918443
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
