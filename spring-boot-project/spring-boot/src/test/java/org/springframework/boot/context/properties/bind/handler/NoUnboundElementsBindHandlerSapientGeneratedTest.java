package org.springframework.boot.context.properties.bind.handler;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.context.properties.bind.BindContext;

import org.mockito.stubbing.Answer;

import org.springframework.boot.context.properties.source.ConfigurationProperty;
import org.springframework.util.Assert;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import java.util.function.Predicate;
import java.util.function.Function;

import org.springframework.boot.context.properties.bind.Bindable;

import org.mockito.MockedStatic;

import org.springframework.boot.context.properties.bind.BindHandler;
import org.springframework.boot.context.properties.source.IterableConfigurationPropertySource;
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

	private final Function filterMock = mock(Function.class, "IterableConfigurationPropertySource");

	private final BindContext bindContextMock = mock(BindContext.class);

	private final Bindable bindableMock = mock(Bindable.class);

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final ConfigurationPropertyName configurationPropertyNameMock2 = mock(ConfigurationPropertyName.class);

	private final ConfigurationPropertyName configurationPropertyNameMock3 = mock(ConfigurationPropertyName.class);

	private final BindContext contextMock = mock(BindContext.class);

	private final Iterable iterableMock = mock(Iterable.class);

	private final ConfigurationPropertyName nameMock = mock(ConfigurationPropertyName.class);

	//Sapient generated method id: ${1b031792-a2be-3eb2-9c2b-1c39b062abb7}, hash: 851A9B9BE83206EB585B2AD7A693EACD
	@Test()
	void onStartTest() {
		//Arrange Statement(s)
		Bindable<Object> bindableMock2 = mock(Bindable.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, filterMock);
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

	//Sapient generated method id: ${d0bdf940-b807-32a4-8689-ec11cffdd36c}, hash: 6C406B43B9FF36A515BD5227DBC6123F
	@Test()
	void onSuccessTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, filterMock);
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

	//Sapient generated method id: ${fe3c2724-cc5c-3473-a788-9673b9ae408a}, hash: BA055EDCE331E436DE9FE1ED5E8346E7
	@Test()
	void onFailureWhenErrorInstanceOfUnboundConfigurationPropertiesExceptionThrowsUnboundConfigurationPropertiesException() throws Exception {
		/* Branches:
		 * (error instanceof UnboundConfigurationPropertiesException) : true
		 */
		//Arrange Statement(s)
		UnboundConfigurationPropertiesException unboundConfigurationPropertiesExceptionMock = mock(UnboundConfigurationPropertiesException.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, filterMock);
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

	//Sapient generated method id: ${3eebbb18-610a-3abf-9354-c3ff07431bf5}, hash: CC1B53F8FE223C7E9D67123166D8CF11
	@Test()
	void onFailureWhenErrorNotInstanceOfUnboundConfigurationPropertiesException() throws Exception {
		/* Branches:
		 * (error instanceof UnboundConfigurationPropertiesException) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, filterMock);
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

	//Sapient generated method id: ${2dceed88-84e4-300e-baab-f0be556459d4}, hash: 3405F6C8811A2494D47BCFAA4333E116
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
			doReturn(iterableMock).when(contextMock).getSources();
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, filterMock);
			Object object = new Object();
			//Act Statement(s)
			target.onFinish(nameMock, bindableMock, contextMock, object);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(nameMock).isAncestorOf(configurationPropertyNameMock);
				verify(contextMock).getDepth();
				verify(contextMock).getSources();
				_assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${698714d5-5d6b-3dde-9e92-fc4f0adb5cb3}, hash: 55B5A66DC0834F7B456197C9AA456A92
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
		IterableConfigurationPropertySource iterableConfigurationPropertySourceMock = mock(IterableConfigurationPropertySource.class);
		IterableConfigurationPropertySource iterableConfigurationPropertySourceMock2 = mock(IterableConfigurationPropertySource.class);
		IterableConfigurationPropertySource iterableConfigurationPropertySourceMock3 = mock(IterableConfigurationPropertySource.class);
		ConfigurationProperty configurationPropertyMock = mock(ConfigurationProperty.class, "ConfigurationProperty");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(0).when(contextMock).getDepth();
			doReturn(iterableMock).when(contextMock).getSources();
			doReturn(null).when(iterableMock).iterator();
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, filterMock);
			doReturn(true).when(filterMock).apply(iterableConfigurationPropertySourceMock);
			doReturn(null).when(iterableConfigurationPropertySourceMock2).iterator();
			doReturn(iterableConfigurationPropertySourceMock2, iterableConfigurationPropertySourceMock3).when(iterableConfigurationPropertySourceMock).filter((Predicate) any());
			doReturn(configurationPropertyMock).when(iterableConfigurationPropertySourceMock3).getConfigurationProperty(configurationPropertyNameMock);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("onFinish_configurationPropertyName1-name1");
			Object object = new Object();
			//Act Statement(s)
			final UnboundConfigurationPropertiesException result = assertThrows(UnboundConfigurationPropertiesException.class, () -> {
				target.onFinish(configurationPropertyName, bindableMock, contextMock, object);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(contextMock).getDepth();
				verify(contextMock).getSources();
				verify(iterableMock).iterator();
				_assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
				verify(filterMock).apply(iterableConfigurationPropertySourceMock);
				verify(iterableConfigurationPropertySourceMock, atLeast(2)).filter((Predicate) any());
				verify(iterableConfigurationPropertySourceMock2).iterator();
				verify(iterableConfigurationPropertySourceMock3).getConfigurationProperty(configurationPropertyNameMock);
			});
		}
	}

	//Sapient generated method id: ${038aa6b3-25c1-383d-816c-b7d5cea3a188}, hash: BEB63849B0E5DBBB62ABE19C8C61AA68
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
		ConfigurationPropertyName configurationPropertyNameMock4 = mock(ConfigurationPropertyName.class);
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
			doReturn(iterableMock).when(contextMock).getSources();
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, filterMock);
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
				_assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a1f701ab-7041-32d7-84ba-317a9511a810}, hash: 2B9288D7EEAD81ACD5DDBC1500BF884E
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
			doReturn(iterableMock).when(contextMock).getSources();
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, filterMock);
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
				_assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${aa226bc7-1dc5-3393-806a-53064e2ce99d}, hash: D29EFFE6F1CFC1DC55AA83CC9AB4132C
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
			doReturn(iterableMock).when(contextMock).getSources();
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, filterMock);
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
				_assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${62176b12-0f52-30d7-90ab-1ee4d6d175a8}, hash: A716EE1906E676945875DB4956E6DAE3
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
			doReturn(iterableMock).when(contextMock).getSources();
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, filterMock);
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
				_assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${1191da43-293e-3c12-bc85-962bb9330879}, hash: D12BD6E430C72A9CFB1293A014BFC017
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
		ConfigurationPropertyName configurationPropertyNameMock4 = mock(ConfigurationPropertyName.class, "getIndexed_configurationPropertyName1");
		ConfigurationPropertyName configurationPropertyNameMock5 = mock(ConfigurationPropertyName.class);
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
			doReturn(iterableMock).when(contextMock).getSources();
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("A[0]")).thenReturn(configurationPropertyNameMock5);
			NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, filterMock);
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
				_assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("A[0]"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${17e6a4a9-b7a6-3e21-a734-76bb0c509b93}, hash: C2FD2CF79107FECCCFCA6074523EBDB7
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
		ConfigurationPropertyName configurationPropertyNameMock2 = mock(ConfigurationPropertyName.class, "getIndexed_configurationPropertyName1");
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(true).when(nameMock).isAncestorOf(configurationPropertyNameMock);
			doReturn(false).when(configurationPropertyNameMock).isLastElementIndexed();
			doReturn(0, 1).when(configurationPropertyNameMock).getNumberOfElements();
			doReturn(true).when(configurationPropertyNameMock).isNumericIndex(0);
			doReturn(configurationPropertyNameMock2).when(configurationPropertyNameMock).chop(0);
			doReturn("return_of_getElement1").when(configurationPropertyNameMock).getElement(1, ConfigurationPropertyName.Form.UNIFORM);
			doReturn(0).when(contextMock).getDepth();
			doReturn(iterableMock).when(contextMock).getSources();
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("A[0]")).thenReturn(configurationPropertyNameMock3);
			NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, filterMock);
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
				_assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("A[0]"), atLeast(1));
			});
		}
	}
}
