package org.springframework.boot.context.properties.bind.handler;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.springframework.boot.context.properties.source.ConfigurationProperty;
import org.springframework.util.Assert;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import java.util.function.Function;
import java.util.ArrayList;
import org.springframework.boot.context.properties.source.IterableConfigurationPropertySource;
import org.springframework.boot.context.properties.bind.BindContext;
import org.mockito.stubbing.Answer;
import org.springframework.boot.context.properties.source.ConfigurationPropertySource;
import java.util.Iterator;
import java.util.function.Predicate;
import org.springframework.boot.context.properties.bind.Bindable;
import org.mockito.MockedStatic;
import org.springframework.boot.context.properties.bind.BindHandler;
import org.springframework.boot.context.properties.bind.UnboundConfigurationPropertiesException;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class NoUnboundElementsBindHandlerSapientGeneratedTest {

    private final BindHandler parentMock = mock(BindHandler.class, "parent");

    private final BindContext bindContextMock = mock(BindContext.class);

    private final Bindable<?> bindableMock = mock(Bindable.class);

    private final ConfigurationProperty configurationPropertyMock = mock(ConfigurationProperty.class);

    private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

    private final ConfigurationPropertyName configurationPropertyNameMock2 = mock(ConfigurationPropertyName.class);

    private final ConfigurationPropertyName configurationPropertyNameMock3 = mock(ConfigurationPropertyName.class);

    private final ConfigurationPropertyName configurationPropertyNameMock4 = mock(ConfigurationPropertyName.class);

    private final ConfigurationPropertyName configurationPropertyNameMock5 = mock(ConfigurationPropertyName.class);

    private final BindContext contextMock = mock(BindContext.class);

    private final Function functionMock = mock(Function.class);

    private final IterableConfigurationPropertySource iterableConfigurationPropertySourceMock = mock(IterableConfigurationPropertySource.class);

    private final IterableConfigurationPropertySource iterableConfigurationPropertySourceMock2 = mock(IterableConfigurationPropertySource.class);

    private final IterableConfigurationPropertySource iterableConfigurationPropertySourceMock3 = mock(IterableConfigurationPropertySource.class);

    private final ConfigurationPropertyName nameMock = mock(ConfigurationPropertyName.class);

    //Sapient generated method id: ${onStartTest}, hash: 1AB22CAB2D75834F4DF66284A3B0FDF4
    @Test()
    void onStartTest() {
        //Arrange Statement(s)
        Bindable bindableMock = mock(Bindable.class);
        Bindable<Object> bindableMock2 = mock(Bindable.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, functionMock);
            doReturn(bindableMock).when(parentMock).onStart(configurationPropertyNameMock, bindableMock2, bindContextMock);
            //Act Statement(s)
            Bindable result = target.onStart(configurationPropertyNameMock, bindableMock2, bindContextMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bindableMock));
                _assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
                verify(parentMock).onStart(configurationPropertyNameMock, bindableMock2, bindContextMock);
            });
        }
    }

    //Sapient generated method id: ${onSuccessTest}, hash: B120595FE93357B6C121835B7748AC98
    @Test()
    void onSuccessTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, functionMock);
            Object object = new Object();
            Object object2 = new Object();
            doReturn(object).when(parentMock).onSuccess(configurationPropertyNameMock, bindableMock, bindContextMock, object2);
            //Act Statement(s)
            Object result = target.onSuccess(configurationPropertyNameMock, bindableMock, bindContextMock, object2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                _assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
                verify(parentMock).onSuccess(configurationPropertyNameMock, bindableMock, bindContextMock, object2);
            });
        }
    }

    //Sapient generated method id: ${onFailureWhenErrorInstanceOfUnboundConfigurationPropertiesExceptionThrowsUnboundConfigurationPropertiesException}, hash: B4FF0037AC478020987B4A6802C5DC3E
    @Test()
    void onFailureWhenErrorInstanceOfUnboundConfigurationPropertiesExceptionThrowsUnboundConfigurationPropertiesException() throws Exception {
        /* Branches:
         * (error instanceof UnboundConfigurationPropertiesException) : true
         */
        //Arrange Statement(s)
        UnboundConfigurationPropertiesException unboundConfigurationPropertiesExceptionMock = mock(UnboundConfigurationPropertiesException.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, functionMock);
            //Act Statement(s)
            final UnboundConfigurationPropertiesException result = assertThrows(UnboundConfigurationPropertiesException.class, () -> {
                target.onFailure(configurationPropertyNameMock, bindableMock, bindContextMock, unboundConfigurationPropertiesExceptionMock);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(unboundConfigurationPropertiesExceptionMock));
                _assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${onFailureWhenErrorNotInstanceOfUnboundConfigurationPropertiesException}, hash: B637F1349A2C54FA8BAC118328F49231
    @Test()
    void onFailureWhenErrorNotInstanceOfUnboundConfigurationPropertiesException() throws Exception {
        /* Branches:
         * (error instanceof UnboundConfigurationPropertiesException) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, functionMock);
            Object object = new Object();
            Exception exception = new Exception();
            doReturn(object).when(parentMock).onFailure(configurationPropertyNameMock, bindableMock, bindContextMock, exception);
            //Act Statement(s)
            Object result = target.onFailure(configurationPropertyNameMock, bindableMock, bindContextMock, exception);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                _assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
                verify(parentMock).onFailure(configurationPropertyNameMock, bindableMock, bindContextMock, exception);
            });
        }
    }

    //Sapient generated method id: ${onFinishWhenFilteredIsEmptyAndUnboundIsEmpty}, hash: B03F3ED3CD84FAED924C6D4D4396A35A
    @Disabled()
    @Test()
    void onFinishWhenFilteredIsEmptyAndUnboundIsEmpty() throws Exception {
        /* Branches:
         * (context.getDepth() == 0) : true
         * (for-each(context.getSources())) : true  #  inside checkNoUnboundElements method
         * (source instanceof IterableConfigurationPropertySource) : true  #  inside checkNoUnboundElements method
         * (this.filter.apply(source)) : true  #  inside checkNoUnboundElements method
         * (name.isAncestorOf(candidate)) : false  #  inside isUnbound method
         * (for-each(filtered)) : false  #  inside collectUnbound method
         * (!unbound.isEmpty()) : false  #  inside checkNoUnboundElements method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(false).when(nameMock).isAncestorOf(configurationPropertyNameMock);
            doReturn(0).when(contextMock).getDepth();
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(iterableConfigurationPropertySourceMock));
            doReturn(iterable).when(contextMock).getSources();
            doReturn(iterableConfigurationPropertySourceMock2).when(iterableConfigurationPropertySourceMock).filter((Predicate) any());
            List<ConfigurationPropertyName> configurationPropertyNameList = new ArrayList<>();
            Iterator<ConfigurationPropertyName> iterator = configurationPropertyNameList.iterator();
            doReturn(iterator).when(iterableConfigurationPropertySourceMock2).iterator();
            _assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, functionMock);
            Object object = new Object();
            //Act Statement(s)
            target.onFinish(nameMock, bindableMock, contextMock, object);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(nameMock).isAncestorOf(configurationPropertyNameMock);
                verify(contextMock).getDepth();
                verify(contextMock).getSources();
                verify(iterableConfigurationPropertySourceMock).filter((Predicate) any());
                verify(iterableConfigurationPropertySourceMock2, atLeast(1)).iterator();
                _assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${onFinishWhenUnboundNotIsEmptyThrowsUnboundConfigurationPropertiesException}, hash: 47991629DCDE0ED607F72B2469C05E20
    @Disabled()
    @Test()
    void onFinishWhenUnboundNotIsEmptyThrowsUnboundConfigurationPropertiesException() throws Exception {
        /* Branches:
         * (context.getDepth() == 0) : true
         * (for-each(context.getSources())) : true  #  inside checkNoUnboundElements method
         * (source instanceof IterableConfigurationPropertySource) : true  #  inside checkNoUnboundElements method
         * (this.filter.apply(source)) : true  #  inside checkNoUnboundElements method
         * (name.isAncestorOf(candidate)) : false  #  inside isUnbound method
         * (for-each(filtered)) : true  #  inside collectUnbound method
         * (catch-exception (Exception)) : true  #  inside collectUnbound method
         * (!unbound.isEmpty()) : true  #  inside checkNoUnboundElements method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(false).when(nameMock).isAncestorOf(configurationPropertyNameMock);
            doReturn(false).when(nameMock).isAncestorOf(configurationPropertyNameMock2);
            doReturn(0).when(contextMock).getDepth();
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(iterableConfigurationPropertySourceMock));
            doReturn(iterable).when(contextMock).getSources();
            List<ConfigurationPropertyName> configurationPropertyNameList = new ArrayList<>();
            configurationPropertyNameList.add(configurationPropertyNameMock3);
            Iterator<ConfigurationPropertyName> iterator = configurationPropertyNameList.iterator();
            doReturn(iterator).when(iterableConfigurationPropertySourceMock2).iterator();
            doReturn(iterableConfigurationPropertySourceMock2, iterableConfigurationPropertySourceMock3).when(iterableConfigurationPropertySourceMock).filter((Predicate) any());
            doReturn(configurationPropertyMock).when(iterableConfigurationPropertySourceMock3).getConfigurationProperty(configurationPropertyNameMock3);
            _assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, functionMock);
            Object object = new Object();
            //Act Statement(s)
            final UnboundConfigurationPropertiesException result = assertThrows(UnboundConfigurationPropertiesException.class, () -> {
                target.onFinish(nameMock, bindableMock, contextMock, object);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(nameMock).isAncestorOf(configurationPropertyNameMock);
                verify(nameMock).isAncestorOf(configurationPropertyNameMock2);
                verify(contextMock).getDepth();
                verify(contextMock).getSources();
                verify(iterableConfigurationPropertySourceMock, atLeast(2)).filter((Predicate) any());
                verify(iterableConfigurationPropertySourceMock2, atLeast(1)).iterator();
                verify(iterableConfigurationPropertySourceMock3, atLeast(1)).getConfigurationProperty(configurationPropertyNameMock3);
                _assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${onFinishWhenFilteredIsNotEmptyAndUnboundNotIsEmptyThrowsUnboundConfigurationPropertiesException}, hash: 52DF85C15698A5C69CF9C6DFC6793C22
    @Disabled()
    @Test()
    void onFinishWhenFilteredIsNotEmptyAndUnboundNotIsEmptyThrowsUnboundConfigurationPropertiesException() throws Exception {
        /* Branches:
         * (context.getDepth() == 0) : true
         * (for-each(context.getSources())) : true  #  inside checkNoUnboundElements method
         * (source instanceof IterableConfigurationPropertySource) : true  #  inside checkNoUnboundElements method
         * (this.filter.apply(source)) : true  #  inside checkNoUnboundElements method
         * (name.isAncestorOf(candidate)) : true  #  inside isUnbound method
         * (!this.boundNames.contains(candidate)) : true  #  inside isUnbound method
         * (candidate.isLastElementIndexed()) : true  #  inside isOverriddenCollectionElement method
         * (!isOverriddenCollectionElement(candidate)) : true  #  inside isUnbound method
         * (for-each(filtered)) : true  #  inside collectUnbound method
         * (!unbound.isEmpty()) : true  #  inside checkNoUnboundElements method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(true).when(nameMock).isAncestorOf(configurationPropertyNameMock);
            doReturn(0).when(configurationPropertyNameMock).getNumberOfElements();
            doReturn(true).when(configurationPropertyNameMock).isLastElementIndexed();
            doReturn(configurationPropertyNameMock2).when(configurationPropertyNameMock).chop(-1);
            doReturn(true).when(nameMock).isAncestorOf(configurationPropertyNameMock3);
            doReturn(0).when(configurationPropertyNameMock3).getNumberOfElements();
            doReturn(true).when(configurationPropertyNameMock3).isLastElementIndexed();
            doReturn(configurationPropertyNameMock4).when(configurationPropertyNameMock3).chop(-1);
            doReturn(0).when(contextMock).getDepth();
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(iterableConfigurationPropertySourceMock));
            doReturn(iterable).when(contextMock).getSources();
            List<ConfigurationPropertyName> configurationPropertyNameList = new ArrayList<>();
            configurationPropertyNameList.add(configurationPropertyNameMock5);
            Iterator<ConfigurationPropertyName> iterator = configurationPropertyNameList.iterator();
            doReturn(iterator).when(iterableConfigurationPropertySourceMock2).iterator();
            doReturn(iterableConfigurationPropertySourceMock2, iterableConfigurationPropertySourceMock3).when(iterableConfigurationPropertySourceMock).filter((Predicate) any());
            doReturn(configurationPropertyMock).when(iterableConfigurationPropertySourceMock3).getConfigurationProperty(configurationPropertyNameMock5);
            _assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, functionMock);
            Object object = new Object();
            //Act Statement(s)
            final UnboundConfigurationPropertiesException result = assertThrows(UnboundConfigurationPropertiesException.class, () -> {
                target.onFinish(nameMock, bindableMock, contextMock, object);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(nameMock).isAncestorOf(configurationPropertyNameMock);
                verify(configurationPropertyNameMock).getNumberOfElements();
                verify(configurationPropertyNameMock).isLastElementIndexed();
                verify(configurationPropertyNameMock).chop(-1);
                verify(nameMock).isAncestorOf(configurationPropertyNameMock3);
                verify(configurationPropertyNameMock3).getNumberOfElements();
                verify(configurationPropertyNameMock3).isLastElementIndexed();
                verify(configurationPropertyNameMock3).chop(-1);
                verify(contextMock).getDepth();
                verify(contextMock).getSources();
                verify(iterableConfigurationPropertySourceMock, atLeast(2)).filter((Predicate) any());
                verify(iterableConfigurationPropertySourceMock2, atLeast(1)).iterator();
                verify(iterableConfigurationPropertySourceMock3, atLeast(1)).getConfigurationProperty(configurationPropertyNameMock5);
                _assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${onFinishWhenIsOverriddenCollectionElementNotCandidateAndFilteredIsNotEmptyThrowsUnboundConfigurationPropertiesException}, hash: B8C9A1126BE1EDB6482F509B97EDBEA7
    @Disabled()
    @Test()
    void onFinishWhenIsOverriddenCollectionElementNotCandidateAndFilteredIsNotEmptyThrowsUnboundConfigurationPropertiesException() throws Exception {
        /* Branches:
         * (context.getDepth() == 0) : true
         * (for-each(context.getSources())) : true  #  inside checkNoUnboundElements method
         * (source instanceof IterableConfigurationPropertySource) : true  #  inside checkNoUnboundElements method
         * (this.filter.apply(source)) : true  #  inside checkNoUnboundElements method
         * (name.isAncestorOf(candidate)) : true  #  inside isUnbound method
         * (!this.boundNames.contains(candidate)) : true  #  inside isUnbound method
         * (candidate.isLastElementIndexed()) : true  #  inside isOverriddenCollectionElement method
         * (!isOverriddenCollectionElement(candidate)) : true  #  inside isUnbound method
         * (for-each(filtered)) : true  #  inside collectUnbound method
         * (!unbound.isEmpty()) : true  #  inside checkNoUnboundElements method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(true).when(nameMock).isAncestorOf(configurationPropertyNameMock);
            doReturn(0).when(configurationPropertyNameMock).getNumberOfElements();
            doReturn(true).when(configurationPropertyNameMock).isLastElementIndexed();
            doReturn(configurationPropertyNameMock2).when(configurationPropertyNameMock).chop(-1);
            doReturn(false).when(nameMock).isAncestorOf(configurationPropertyNameMock3);
            doReturn(0).when(contextMock).getDepth();
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(iterableConfigurationPropertySourceMock));
            doReturn(iterable).when(contextMock).getSources();
            List<ConfigurationPropertyName> configurationPropertyNameList = new ArrayList<>();
            configurationPropertyNameList.add(configurationPropertyNameMock4);
            Iterator<ConfigurationPropertyName> iterator = configurationPropertyNameList.iterator();
            doReturn(iterator).when(iterableConfigurationPropertySourceMock2).iterator();
            doReturn(iterableConfigurationPropertySourceMock2, iterableConfigurationPropertySourceMock3).when(iterableConfigurationPropertySourceMock).filter((Predicate) any());
            doReturn(configurationPropertyMock).when(iterableConfigurationPropertySourceMock3).getConfigurationProperty(configurationPropertyNameMock4);
            _assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, functionMock);
            Object object = new Object();
            //Act Statement(s)
            final UnboundConfigurationPropertiesException result = assertThrows(UnboundConfigurationPropertiesException.class, () -> {
                target.onFinish(nameMock, bindableMock, contextMock, object);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(nameMock).isAncestorOf(configurationPropertyNameMock);
                verify(configurationPropertyNameMock).getNumberOfElements();
                verify(configurationPropertyNameMock).isLastElementIndexed();
                verify(configurationPropertyNameMock).chop(-1);
                verify(nameMock).isAncestorOf(configurationPropertyNameMock3);
                verify(contextMock).getDepth();
                verify(contextMock).getSources();
                verify(iterableConfigurationPropertySourceMock, atLeast(2)).filter((Predicate) any());
                verify(iterableConfigurationPropertySourceMock2, atLeast(1)).iterator();
                verify(iterableConfigurationPropertySourceMock3, atLeast(1)).getConfigurationProperty(configurationPropertyNameMock4);
                _assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${onFinishWhenIndexedIsNullAndUnboundNotIsEmpty2ThrowsUnboundConfigurationPropertiesException}, hash: D1C632CA18DD3D5533921847736EB99F
    @Disabled()
    @Test()
    void onFinishWhenIndexedIsNullAndUnboundNotIsEmpty2ThrowsUnboundConfigurationPropertiesException() throws Exception {
        /* Branches:
         * (context.getDepth() == 0) : true
         * (for-each(context.getSources())) : true  #  inside checkNoUnboundElements method
         * (source instanceof IterableConfigurationPropertySource) : true  #  inside checkNoUnboundElements method
         * (this.filter.apply(source)) : true  #  inside checkNoUnboundElements method
         * (name.isAncestorOf(candidate)) : true  #  inside isUnbound method
         * (!this.boundNames.contains(candidate)) : true  #  inside isUnbound method
         * (candidate.isLastElementIndexed()) : true  #  inside isOverriddenCollectionElement method
         * (!isOverriddenCollectionElement(candidate)) : true  #  inside isUnbound method
         * (for-each(filtered)) : true  #  inside collectUnbound method
         * (i < candidate.getNumberOfElements()) : true  #  inside getIndexed method
         * (candidate.isNumericIndex(i)) : false  #  inside getIndexed method
         * (indexed != null) : false  #  inside isOverriddenCollectionElement method
         * (!unbound.isEmpty()) : true  #  inside checkNoUnboundElements method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(true).when(nameMock).isAncestorOf(configurationPropertyNameMock);
            doReturn(0).when(configurationPropertyNameMock).getNumberOfElements();
            doReturn(true).when(configurationPropertyNameMock).isLastElementIndexed();
            doReturn(configurationPropertyNameMock2).when(configurationPropertyNameMock).chop(-1);
            doReturn(true).when(nameMock).isAncestorOf(configurationPropertyNameMock3);
            doReturn(false).when(configurationPropertyNameMock3).isLastElementIndexed();
            doReturn(0, 1, 0).when(configurationPropertyNameMock3).getNumberOfElements();
            doReturn(false).when(configurationPropertyNameMock3).isNumericIndex(0);
            doReturn(0).when(contextMock).getDepth();
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(iterableConfigurationPropertySourceMock));
            doReturn(iterable).when(contextMock).getSources();
            List<ConfigurationPropertyName> configurationPropertyNameList = new ArrayList<>();
            configurationPropertyNameList.add(configurationPropertyNameMock4);
            Iterator<ConfigurationPropertyName> iterator = configurationPropertyNameList.iterator();
            doReturn(iterator).when(iterableConfigurationPropertySourceMock2).iterator();
            doReturn(iterableConfigurationPropertySourceMock2, iterableConfigurationPropertySourceMock3).when(iterableConfigurationPropertySourceMock).filter((Predicate) any());
            doReturn(configurationPropertyMock).when(iterableConfigurationPropertySourceMock3).getConfigurationProperty(configurationPropertyNameMock4);
            _assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, functionMock);
            Object object = new Object();
            //Act Statement(s)
            final UnboundConfigurationPropertiesException result = assertThrows(UnboundConfigurationPropertiesException.class, () -> {
                target.onFinish(nameMock, bindableMock, contextMock, object);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(nameMock).isAncestorOf(configurationPropertyNameMock);
                verify(configurationPropertyNameMock).getNumberOfElements();
                verify(configurationPropertyNameMock).isLastElementIndexed();
                verify(configurationPropertyNameMock).chop(-1);
                verify(nameMock).isAncestorOf(configurationPropertyNameMock3);
                verify(configurationPropertyNameMock3, times(3)).getNumberOfElements();
                verify(configurationPropertyNameMock3).isLastElementIndexed();
                verify(configurationPropertyNameMock3).isNumericIndex(0);
                verify(contextMock).getDepth();
                verify(contextMock).getSources();
                verify(iterableConfigurationPropertySourceMock, atLeast(2)).filter((Predicate) any());
                verify(iterableConfigurationPropertySourceMock2, atLeast(1)).iterator();
                verify(iterableConfigurationPropertySourceMock3, atLeast(1)).getConfigurationProperty(configurationPropertyNameMock4);
                _assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${onFinishWhenCandidateNotIsNumericIndexIAndIndexedIsNullAndIsOverriddenCollectionElementNotCandidateAndFilteredIsEmptyAn}, hash: 547A6924EE0C2B387CC174991C16A8DA
    @Disabled()
    @Test()
    void onFinishWhenCandidateNotIsNumericIndexIAndIndexedIsNullAndIsOverriddenCollectionElementNotCandidateAndFilteredIsEmptyAn() throws Exception {
        /* Branches:
         * (context.getDepth() == 0) : true
         * (for-each(context.getSources())) : true  #  inside checkNoUnboundElements method
         * (source instanceof IterableConfigurationPropertySource) : true  #  inside checkNoUnboundElements method
         * (this.filter.apply(source)) : true  #  inside checkNoUnboundElements method
         * (name.isAncestorOf(candidate)) : true  #  inside isUnbound method
         * (!this.boundNames.contains(candidate)) : true  #  inside isUnbound method
         * (candidate.isLastElementIndexed()) : false  #  inside isOverriddenCollectionElement method
         * (i < candidate.getNumberOfElements()) : true  #  inside getIndexed method
         * (candidate.isNumericIndex(i)) : false  #  inside getIndexed method
         * (indexed != null) : false  #  inside isOverriddenCollectionElement method
         * (!isOverriddenCollectionElement(candidate)) : true  #  inside isUnbound method
         * (for-each(filtered)) : false  #  inside collectUnbound method
         * (!unbound.isEmpty()) : false  #  inside checkNoUnboundElements method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(true).when(nameMock).isAncestorOf(configurationPropertyNameMock);
            doReturn(false).when(configurationPropertyNameMock).isLastElementIndexed();
            doReturn(0, 1, 0).when(configurationPropertyNameMock).getNumberOfElements();
            doReturn(false).when(configurationPropertyNameMock).isNumericIndex(0);
            doReturn(0).when(contextMock).getDepth();
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(iterableConfigurationPropertySourceMock));
            doReturn(iterable).when(contextMock).getSources();
            doReturn(iterableConfigurationPropertySourceMock2).when(iterableConfigurationPropertySourceMock).filter((Predicate) any());
            List<ConfigurationPropertyName> configurationPropertyNameList = new ArrayList<>();
            Iterator<ConfigurationPropertyName> iterator = configurationPropertyNameList.iterator();
            doReturn(iterator).when(iterableConfigurationPropertySourceMock2).iterator();
            _assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, functionMock);
            Object object = new Object();
            //Act Statement(s)
            target.onFinish(nameMock, bindableMock, contextMock, object);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(nameMock).isAncestorOf(configurationPropertyNameMock);
                verify(configurationPropertyNameMock, times(3)).getNumberOfElements();
                verify(configurationPropertyNameMock).isLastElementIndexed();
                verify(configurationPropertyNameMock).isNumericIndex(0);
                verify(contextMock).getDepth();
                verify(contextMock).getSources();
                verify(iterableConfigurationPropertySourceMock).filter((Predicate) any());
                verify(iterableConfigurationPropertySourceMock2, atLeast(1)).iterator();
                _assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${onFinishWhenThisBoundNamesNotContainsConfigurationPropertyNameOfZeroethProThrowsUnboundConfigurationPropertiesException}, hash: C5413A39E1E72AD9ACD976E49FBAF0A6
    @Disabled()
    @Test()
    void onFinishWhenThisBoundNamesNotContainsConfigurationPropertyNameOfZeroethProThrowsUnboundConfigurationPropertiesException() throws Exception {
        /* Branches:
         * (context.getDepth() == 0) : true
         * (for-each(context.getSources())) : true  #  inside checkNoUnboundElements method
         * (source instanceof IterableConfigurationPropertySource) : true  #  inside checkNoUnboundElements method
         * (this.filter.apply(source)) : true  #  inside checkNoUnboundElements method
         * (name.isAncestorOf(candidate)) : true  #  inside isUnbound method
         * (!this.boundNames.contains(candidate)) : true  #  inside isUnbound method
         * (candidate.isLastElementIndexed()) : true  #  inside isOverriddenCollectionElement method
         * (!isOverriddenCollectionElement(candidate)) : true  #  inside isUnbound method
         * (for-each(filtered)) : true  #  inside collectUnbound method
         * (i < candidate.getNumberOfElements()) : true  #  inside getIndexed method
         * (candidate.isNumericIndex(i)) : true  #  inside getIndexed method
         * (indexed != null) : true  #  inside isOverriddenCollectionElement method
         * (this.boundNames.contains(ConfigurationPropertyName.of(zeroethProperty))) : false  #  inside isOverriddenCollectionElement method
         * (!unbound.isEmpty()) : true  #  inside checkNoUnboundElements method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ConfigurationPropertyName configurationPropertyNameMock4 = mock(ConfigurationPropertyName.class, "configurationPropertyName4");
        ConfigurationPropertyName configurationPropertyName2Mock = mock(ConfigurationPropertyName.class);
        try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(true).when(nameMock).isAncestorOf(configurationPropertyNameMock);
            doReturn(0).when(configurationPropertyNameMock).getNumberOfElements();
            doReturn(true).when(configurationPropertyNameMock).isLastElementIndexed();
            doReturn(configurationPropertyNameMock2).when(configurationPropertyNameMock).chop(-1);
            doReturn(true).when(nameMock).isAncestorOf(configurationPropertyNameMock3);
            doReturn(false).when(configurationPropertyNameMock3).isLastElementIndexed();
            doReturn(0, 1).when(configurationPropertyNameMock3).getNumberOfElements();
            doReturn(true).when(configurationPropertyNameMock3).isNumericIndex(0);
            doReturn(configurationPropertyNameMock4).when(configurationPropertyNameMock3).chop(0);
            doReturn("return_of_getElement1").when(configurationPropertyNameMock3).getElement(1, ConfigurationPropertyName.Form.UNIFORM);
            doReturn(0).when(contextMock).getDepth();
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(iterableConfigurationPropertySourceMock));
            doReturn(iterable).when(contextMock).getSources();
            List<ConfigurationPropertyName> configurationPropertyNameList = new ArrayList<>();
            configurationPropertyNameList.add(configurationPropertyName2Mock);
            Iterator<ConfigurationPropertyName> iterator = configurationPropertyNameList.iterator();
            doReturn(iterator).when(iterableConfigurationPropertySourceMock2).iterator();
            doReturn(iterableConfigurationPropertySourceMock2, iterableConfigurationPropertySourceMock3).when(iterableConfigurationPropertySourceMock).filter((Predicate) any());
            doReturn(configurationPropertyMock).when(iterableConfigurationPropertySourceMock3).getConfigurationProperty(configurationPropertyName2Mock);
            _assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            configurationPropertyName.when(() -> ConfigurationPropertyName.of("A[0]")).thenReturn(configurationPropertyNameMock5);
            NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, functionMock);
            Object object = new Object();
            //Act Statement(s)
            final UnboundConfigurationPropertiesException result = assertThrows(UnboundConfigurationPropertiesException.class, () -> {
                target.onFinish(nameMock, bindableMock, contextMock, object);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(nameMock).isAncestorOf(configurationPropertyNameMock);
                verify(configurationPropertyNameMock).getNumberOfElements();
                verify(configurationPropertyNameMock).isLastElementIndexed();
                verify(configurationPropertyNameMock).chop(-1);
                verify(nameMock).isAncestorOf(configurationPropertyNameMock3);
                verify(configurationPropertyNameMock3, times(2)).getNumberOfElements();
                verify(configurationPropertyNameMock3).isLastElementIndexed();
                verify(configurationPropertyNameMock3).isNumericIndex(0);
                verify(configurationPropertyNameMock3).chop(0);
                verify(configurationPropertyNameMock3).getElement(1, ConfigurationPropertyName.Form.UNIFORM);
                verify(contextMock).getDepth();
                verify(contextMock).getSources();
                verify(iterableConfigurationPropertySourceMock, atLeast(2)).filter((Predicate) any());
                verify(iterableConfigurationPropertySourceMock2, atLeast(1)).iterator();
                verify(iterableConfigurationPropertySourceMock3, atLeast(1)).getConfigurationProperty(configurationPropertyName2Mock);
                _assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
                configurationPropertyName.verify(() -> ConfigurationPropertyName.of("A[0]"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${onFinishWhenThisBoundNamesNotContainsConfigurationPropertyNameOfZeroethPropertyAndIsOverriddenCollectionElementNotCandi}, hash: F0198800470966C2E0E1F32F41B11507
    @Disabled()
    @Test()
    void onFinishWhenThisBoundNamesNotContainsConfigurationPropertyNameOfZeroethPropertyAndIsOverriddenCollectionElementNotCandi() throws Exception {
        /* Branches:
         * (context.getDepth() == 0) : true
         * (for-each(context.getSources())) : true  #  inside checkNoUnboundElements method
         * (source instanceof IterableConfigurationPropertySource) : true  #  inside checkNoUnboundElements method
         * (this.filter.apply(source)) : true  #  inside checkNoUnboundElements method
         * (name.isAncestorOf(candidate)) : true  #  inside isUnbound method
         * (!this.boundNames.contains(candidate)) : true  #  inside isUnbound method
         * (candidate.isLastElementIndexed()) : false  #  inside isOverriddenCollectionElement method
         * (i < candidate.getNumberOfElements()) : true  #  inside getIndexed method
         * (candidate.isNumericIndex(i)) : true  #  inside getIndexed method
         * (indexed != null) : true  #  inside isOverriddenCollectionElement method
         * (this.boundNames.contains(ConfigurationPropertyName.of(zeroethProperty))) : false  #  inside isOverriddenCollectionElement method
         * (!isOverriddenCollectionElement(candidate)) : true  #  inside isUnbound method
         * (for-each(filtered)) : false  #  inside collectUnbound method
         * (!unbound.isEmpty()) : false  #  inside checkNoUnboundElements method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ConfigurationPropertyName configurationPropertyNameMock2 = mock(ConfigurationPropertyName.class, "configurationPropertyName2");
        try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(true).when(nameMock).isAncestorOf(configurationPropertyNameMock);
            doReturn(false).when(configurationPropertyNameMock).isLastElementIndexed();
            doReturn(0, 1).when(configurationPropertyNameMock).getNumberOfElements();
            doReturn(true).when(configurationPropertyNameMock).isNumericIndex(0);
            doReturn(configurationPropertyNameMock2).when(configurationPropertyNameMock).chop(0);
            doReturn("return_of_getElement1").when(configurationPropertyNameMock).getElement(1, ConfigurationPropertyName.Form.UNIFORM);
            doReturn(0).when(contextMock).getDepth();
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(iterableConfigurationPropertySourceMock));
            doReturn(iterable).when(contextMock).getSources();
            doReturn(iterableConfigurationPropertySourceMock2).when(iterableConfigurationPropertySourceMock).filter((Predicate) any());
            List<ConfigurationPropertyName> configurationPropertyNameList = new ArrayList<>();
            Iterator<ConfigurationPropertyName> iterator = configurationPropertyNameList.iterator();
            doReturn(iterator).when(iterableConfigurationPropertySourceMock2).iterator();
            _assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            configurationPropertyName.when(() -> ConfigurationPropertyName.of("A[0]")).thenReturn(configurationPropertyNameMock3);
            NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, functionMock);
            Object object = new Object();
            //Act Statement(s)
            target.onFinish(nameMock, bindableMock, contextMock, object);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(nameMock).isAncestorOf(configurationPropertyNameMock);
                verify(configurationPropertyNameMock, times(2)).getNumberOfElements();
                verify(configurationPropertyNameMock).isLastElementIndexed();
                verify(configurationPropertyNameMock).isNumericIndex(0);
                verify(configurationPropertyNameMock).chop(0);
                verify(configurationPropertyNameMock).getElement(1, ConfigurationPropertyName.Form.UNIFORM);
                verify(contextMock).getDepth();
                verify(contextMock).getSources();
                verify(iterableConfigurationPropertySourceMock).filter((Predicate) any());
                verify(iterableConfigurationPropertySourceMock2, atLeast(1)).iterator();
                _assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
                configurationPropertyName.verify(() -> ConfigurationPropertyName.of("A[0]"), atLeast(1));
            });
        }
    }
}
