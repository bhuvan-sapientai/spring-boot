package org.springframework.boot.context.properties.bind;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.convert.ConversionException;
import org.springframework.util.Assert;
import org.springframework.core.CollectionFactory;

import java.util.Map;
import java.util.HashMap;

import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import java.util.ArrayList;

import org.springframework.beans.BeanUtils;

import org.mockito.stubbing.Answer;

import java.lang.annotation.Annotation;

import org.springframework.core.ResolvableType;

import java.util.Collection;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ValueObjectBinderSapientGeneratedTest {

	private final BindConstructorProvider bindConstructorProviderMock = mock(BindConstructorProvider.class);

	private final BindConverter bindConverterMock = mock(BindConverter.class);

	private final Bindable bindableMock = mock(Bindable.class);

	private final Binder.Context binderContextMock = mock(Binder.Context.class);

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final Binder.Context contextMock = mock(Binder.Context.class);

	private final DataObjectPropertyBinder dataObjectPropertyBinderMock = mock(DataObjectPropertyBinder.class);

	private final DefaultValue defaultValueMock = mock(DefaultValue.class);

	private final ResolvableType resolvableTypeMock = mock(ResolvableType.class);

	private final ResolvableType resolvableTypeMock2 = mock(ResolvableType.class);

	//Sapient generated method id: ${396b0ce3-400d-3549-b5a7-5b74cebdca3d}
	@Test()
	void bindWhenValueObjectIsNull() {
		/* Branches:
		 * (valueObject == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ValueObjectBinder target = new ValueObjectBinder(bindConstructorProviderMock);
		Object object = new Object();
		Bindable bindable = Bindable.ofInstance(object);
		//Act Statement(s)
		Object result = target.bind(configurationPropertyNameMock, bindable, binderContextMock, dataObjectPropertyBinderMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${a8ebfbf7-690c-3476-ad27-c3f187a7527e}
	@Disabled()
	@Test()
	void bindWhenBound() {
		/* Branches:
		 * (valueObject == null) : false
		 * (for-each(parameters)) : true
		 * (bound) : false
		 * (arg != null) : true
		 * (arg != null) : true
		 * (bound) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(Object.class).when(resolvableTypeMock).resolve();
		doNothing().when(contextMock).pushConstructorBoundTypes(Object.class);
		doNothing().when(contextMock).clearConfigurationProperty();
		doNothing().when(contextMock).popConstructorBoundTypes();
		ValueObjectBinder target = new ValueObjectBinder(bindConstructorProviderMock);
		Bindable bindable = Bindable.of(resolvableTypeMock);
		//Act Statement(s)
		Object result = target.bind(configurationPropertyNameMock, bindable, contextMock, dataObjectPropertyBinderMock);
		Object object = new Object();
		//Assert statement(s)
		//TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, equalTo(object));
			verify(resolvableTypeMock).resolve();
			verify(contextMock).pushConstructorBoundTypes(Object.class);
			verify(contextMock).clearConfigurationProperty();
			verify(contextMock).popConstructorBoundTypes();
		});
	}

	//Sapient generated method id: ${d9ae5de6-dae4-33a2-85b1-27dcf8cc78a4}
	@Disabled()
	@Test()
	void bindWhenAnnotationNotInstanceOfDefaultValueAndNotBound() {
		/* Branches:
		 * (valueObject == null) : false
		 * (for-each(parameters)) : true
		 * (bound) : false
		 * (arg != null) : false
		 * (arg != null) : false
		 * (for-each(annotations)) : true  #  inside getDefaultValue method
		 * (annotation instanceof DefaultValue defaultValueAnnotation) : false  #  inside getDefaultValue method
		 * (bound) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(Object.class).when(resolvableTypeMock).resolve();
		doNothing().when(contextMock).pushConstructorBoundTypes(Object.class);
		doNothing().when(contextMock).clearConfigurationProperty();
		doNothing().when(contextMock).popConstructorBoundTypes();
		ValueObjectBinder target = new ValueObjectBinder(bindConstructorProviderMock);
		Bindable bindable = Bindable.of(resolvableTypeMock);
		//Act Statement(s)
		Object result = target.bind(configurationPropertyNameMock, bindable, contextMock, dataObjectPropertyBinderMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(nullValue()));
			verify(resolvableTypeMock).resolve();
			verify(contextMock).pushConstructorBoundTypes(Object.class);
			verify(contextMock).clearConfigurationProperty();
			verify(contextMock).popConstructorBoundTypes();
		});
	}

	//Sapient generated method id: ${e7777e7a-937a-3703-905e-a47723d7f6f8}
	@Disabled()
	@Test()
	void bindWhenDefaultValueLengthNotEquals0AndNotBound() {
		/* Branches:
		 * (valueObject == null) : false
		 * (for-each(parameters)) : true
		 * (bound) : false
		 * (arg != null) : false
		 * (arg != null) : false
		 * (for-each(annotations)) : true  #  inside getDefaultValue method
		 * (annotation instanceof DefaultValue defaultValueAnnotation) : true  #  inside getDefaultValue method
		 * (defaultValue.length == 0) : false  #  inside getDefaultValue method
		 * (bound) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(Object.class).when(resolvableTypeMock).resolve();
		doNothing().when(contextMock).pushConstructorBoundTypes(Object.class);
		doReturn(bindConverterMock).when(contextMock).getConverter();
		Object object = new Object();
		String[] stringArray = new String[] { "return_of_valueItem1" };
		Annotation[] annotationArray = new Annotation[] { defaultValueMock };
		doReturn(object).when(bindConverterMock).convert(stringArray, resolvableTypeMock2, annotationArray);
		doReturn(stringArray).when(defaultValueMock).value();
		doNothing().when(contextMock).clearConfigurationProperty();
		doNothing().when(contextMock).popConstructorBoundTypes();
		ValueObjectBinder target = new ValueObjectBinder(bindConstructorProviderMock);
		Bindable bindable = Bindable.of(resolvableTypeMock);
		//Act Statement(s)
		Object result = target.bind(configurationPropertyNameMock, bindable, contextMock, dataObjectPropertyBinderMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(nullValue()));
			verify(resolvableTypeMock).resolve();
			verify(contextMock).pushConstructorBoundTypes(Object.class);
			verify(contextMock).getConverter();
			verify(bindConverterMock).convert(stringArray, resolvableTypeMock2, annotationArray);
			verify(defaultValueMock).value();
			verify(contextMock).clearConfigurationProperty();
			verify(contextMock).popConstructorBoundTypes();
		});
	}

	//Sapient generated method id: ${a5badf6e-60f5-3ad5-b6f5-dbd66cf45559}
	@Disabled()
	@Test()
	void bindWhenDefaultValueLengthNotEquals1ThrowsConversionException() {
		/* Branches:
		 * (valueObject == null) : false
		 * (for-each(parameters)) : true
		 * (bound) : false
		 * (arg != null) : false
		 * (arg != null) : false
		 * (for-each(annotations)) : true  #  inside getDefaultValue method
		 * (annotation instanceof DefaultValue defaultValueAnnotation) : true  #  inside getDefaultValue method
		 * (defaultValue.length == 0) : false  #  inside getDefaultValue method
		 * (catch-exception (ConversionException)) : true  #  inside convertDefaultValue method
		 * (defaultValue.length == 1) : false  #  inside convertDefaultValue method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(Object.class).when(resolvableTypeMock).resolve();
		doNothing().when(contextMock).pushConstructorBoundTypes(Object.class);
		doReturn(bindConverterMock).when(contextMock).getConverter();
		Object object = new Object();
		String[] stringArray = new String[] { "return_of_valueItem1", "return_of_valueItem1" };
		Annotation[] annotationArray = new Annotation[] { defaultValueMock };
		doReturn(object).when(bindConverterMock).convert(stringArray, resolvableTypeMock2, annotationArray);
		doReturn(stringArray).when(defaultValueMock).value();
		ValueObjectBinder target = new ValueObjectBinder(bindConstructorProviderMock);
		Bindable bindable = Bindable.of(resolvableTypeMock);
		//Act Statement(s)
		final ConversionException result = assertThrows(ConversionException.class, () -> {
			target.bind(configurationPropertyNameMock, bindable, contextMock, dataObjectPropertyBinderMock);
		});
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(resolvableTypeMock).resolve();
			verify(contextMock).pushConstructorBoundTypes(Object.class);
			verify(contextMock).getConverter();
			verify(bindConverterMock).convert(stringArray, resolvableTypeMock2, annotationArray);
			verify(defaultValueMock).value();
		});
	}

	//Sapient generated method id: ${2c19e2c5-9a2b-3fc5-b5a6-106a12f8424d}
	@Disabled()
	@Test()
	void bindWhenDefaultValueLengthEquals1AndNotBound() {
		/* Branches:
		 * (valueObject == null) : false
		 * (for-each(parameters)) : true
		 * (bound) : false
		 * (arg != null) : false
		 * (arg != null) : false
		 * (for-each(annotations)) : true  #  inside getDefaultValue method
		 * (annotation instanceof DefaultValue defaultValueAnnotation) : true  #  inside getDefaultValue method
		 * (defaultValue.length == 0) : false  #  inside getDefaultValue method
		 * (catch-exception (ConversionException)) : true  #  inside convertDefaultValue method
		 * (defaultValue.length == 1) : true  #  inside convertDefaultValue method
		 * (bound) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(Object.class).when(resolvableTypeMock).resolve();
		doNothing().when(contextMock).pushConstructorBoundTypes(Object.class);
		doReturn(bindConverterMock).when(contextMock).getConverter();
		Object object = new Object();
		String[] stringArray = new String[] { "return_of_valueItem1" };
		Annotation[] annotationArray = new Annotation[] { defaultValueMock };
		doReturn(object).when(bindConverterMock).convert(stringArray, resolvableTypeMock2, annotationArray);
		doReturn(stringArray).when(defaultValueMock).value();
		Object object2 = new Object();
		doReturn(object2).when(bindConverterMock).convert("return_of_valueItem1", resolvableTypeMock2, annotationArray);
		doNothing().when(contextMock).clearConfigurationProperty();
		doNothing().when(contextMock).popConstructorBoundTypes();
		ValueObjectBinder target = new ValueObjectBinder(bindConstructorProviderMock);
		Bindable bindable = Bindable.of(resolvableTypeMock);
		//Act Statement(s)
		Object result = target.bind(configurationPropertyNameMock, bindable, contextMock, dataObjectPropertyBinderMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(nullValue()));
			verify(resolvableTypeMock).resolve();
			verify(contextMock).pushConstructorBoundTypes(Object.class);
			verify(contextMock).getConverter();
			verify(bindConverterMock).convert(stringArray, resolvableTypeMock2, annotationArray);
			verify(defaultValueMock).value();
			verify(bindConverterMock).convert("return_of_valueItem1", resolvableTypeMock2, annotationArray);
			verify(contextMock).clearConfigurationProperty();
			verify(contextMock).popConstructorBoundTypes();
		});
	}

	//Sapient generated method id: ${6ba5b61f-8186-3e9c-a08d-2dcded05eb3b}
	@Disabled()
	@Test()
	void bindWhenResolvedIsNullAndNotBound() {
		/* Branches:
		 * (valueObject == null) : false
		 * (for-each(parameters)) : true
		 * (bound) : false
		 * (arg != null) : false
		 * (arg != null) : false
		 * (for-each(annotations)) : true  #  inside getDefaultValue method
		 * (annotation instanceof DefaultValue defaultValueAnnotation) : true  #  inside getDefaultValue method
		 * (defaultValue.length == 0) : true  #  inside getDefaultValue method
		 * (resolved == null) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved != null) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (instance != null) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved != null) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (bound) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(Object.class).when(resolvableTypeMock).resolve();
			doNothing().when(contextMock).pushConstructorBoundTypes(Object.class);
			doNothing().when(contextMock).clearConfigurationProperty();
			doNothing().when(contextMock).popConstructorBoundTypes();
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			bindable.when(() -> Bindable.of(resolvableTypeMock2)).thenReturn(bindableMock);
			doReturn(null).when(resolvableTypeMock2).resolve();
			ValueObjectBinder target = spy(new ValueObjectBinder(bindConstructorProviderMock));
			doReturn(null).when(target).create(bindableMock, contextMock);
			Bindable bindable2 = Bindable.of(resolvableTypeMock);
			//Act Statement(s)
			Object result = target.bind(configurationPropertyNameMock, bindable2, contextMock, dataObjectPropertyBinderMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(resolvableTypeMock).resolve();
				verify(contextMock).pushConstructorBoundTypes(Object.class);
				verify(contextMock).clearConfigurationProperty();
				verify(contextMock).popConstructorBoundTypes();
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				bindable.verify(() -> Bindable.of(resolvableTypeMock2), atLeast(1));
				verify(resolvableTypeMock2).resolve();
				verify(target).create(bindableMock, contextMock);
			});
		}
	}

	//Sapient generated method id: ${5b77b4cf-8c75-3e57-aa2c-5c1a50861d7d}
	@Disabled()
	@Test()
	void bindWhenResolvedIsNotNullAndOptionalEqualsResolvedAndNotBound() {
		/* Branches:
		 * (valueObject == null) : false
		 * (for-each(parameters)) : true
		 * (bound) : false
		 * (arg != null) : false
		 * (arg != null) : false
		 * (for-each(annotations)) : true  #  inside getDefaultValue method
		 * (annotation instanceof DefaultValue defaultValueAnnotation) : true  #  inside getDefaultValue method
		 * (defaultValue.length == 0) : true  #  inside getDefaultValue method
		 * (resolved == null) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Optional.class == type) : false  #  inside isEmptyDefaultValueAllowed method
		 * (type.isArray()) : false  #  inside isAggregate method
		 * (Map.class.isAssignableFrom(type)) : false  #  inside isAggregate method
		 * (Collection.class.isAssignableFrom(type)) : true  #  inside isAggregate method
		 * (isAggregate(type)) : true  #  inside isEmptyDefaultValueAllowed method
		 * (isEmptyDefaultValueAllowed(resolved)) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved != null) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Optional.class == resolved) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (bound) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(Object.class).when(resolvableTypeMock).resolve();
			doNothing().when(contextMock).pushConstructorBoundTypes(Object.class);
			doNothing().when(contextMock).clearConfigurationProperty();
			doNothing().when(contextMock).popConstructorBoundTypes();
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			ValueObjectBinder target = new ValueObjectBinder(bindConstructorProviderMock);
			Bindable bindable = Bindable.of(resolvableTypeMock);
			//Act Statement(s)
			Object result = target.bind(configurationPropertyNameMock, bindable, contextMock, dataObjectPropertyBinderMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(resolvableTypeMock).resolve();
				verify(contextMock).pushConstructorBoundTypes(Object.class);
				verify(contextMock).clearConfigurationProperty();
				verify(contextMock).popConstructorBoundTypes();
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${7c70f353-9d72-39e5-b5e0-051ad1348ef8}
	@Disabled()
	@Test()
	void bindWhenCollectionIsAssignableFromResolvedAndNotBound() {
		/* Branches:
		 * (valueObject == null) : false
		 * (for-each(parameters)) : true
		 * (bound) : false
		 * (arg != null) : false
		 * (arg != null) : false
		 * (for-each(annotations)) : true  #  inside getDefaultValue method
		 * (annotation instanceof DefaultValue defaultValueAnnotation) : true  #  inside getDefaultValue method
		 * (defaultValue.length == 0) : true  #  inside getDefaultValue method
		 * (resolved == null) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Optional.class == type) : false  #  inside isEmptyDefaultValueAllowed method
		 * (type.isArray()) : false  #  inside isAggregate method
		 * (Map.class.isAssignableFrom(type)) : false  #  inside isAggregate method
		 * (Collection.class.isAssignableFrom(type)) : true  #  inside isAggregate method
		 * (isAggregate(type)) : true  #  inside isEmptyDefaultValueAllowed method
		 * (isEmptyDefaultValueAllowed(resolved)) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved != null) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Optional.class == resolved) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Collection.class.isAssignableFrom(resolved)) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (bound) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(Object.class).when(resolvableTypeMock).resolve();
			doNothing().when(contextMock).pushConstructorBoundTypes(Object.class);
			doNothing().when(contextMock).clearConfigurationProperty();
			doNothing().when(contextMock).popConstructorBoundTypes();
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			Collection collection = new ArrayList<>();
			collectionFactory.when(() -> CollectionFactory.createCollection(Object.class, 0)).thenReturn(collection);
			ValueObjectBinder target = new ValueObjectBinder(bindConstructorProviderMock);
			Bindable bindable = Bindable.of(resolvableTypeMock);
			//Act Statement(s)
			Object result = target.bind(configurationPropertyNameMock, bindable, contextMock, dataObjectPropertyBinderMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(resolvableTypeMock).resolve();
				verify(contextMock).pushConstructorBoundTypes(Object.class);
				verify(contextMock).clearConfigurationProperty();
				verify(contextMock).popConstructorBoundTypes();
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				collectionFactory.verify(() -> CollectionFactory.createCollection(Object.class, 0), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${6c65c349-2304-370d-a1a9-f355b25a6323}
	@Disabled()
	@Test()
	void bindWhenMapIsAssignableFromResolvedAndNotBound() {
		/* Branches:
		 * (valueObject == null) : false
		 * (for-each(parameters)) : true
		 * (bound) : false
		 * (arg != null) : false
		 * (arg != null) : false
		 * (for-each(annotations)) : true  #  inside getDefaultValue method
		 * (annotation instanceof DefaultValue defaultValueAnnotation) : true  #  inside getDefaultValue method
		 * (defaultValue.length == 0) : true  #  inside getDefaultValue method
		 * (resolved == null) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Optional.class == type) : false  #  inside isEmptyDefaultValueAllowed method
		 * (type.isArray()) : false  #  inside isAggregate method
		 * (Map.class.isAssignableFrom(type)) : false  #  inside isAggregate method
		 * (Collection.class.isAssignableFrom(type)) : true  #  inside isAggregate method
		 * (isAggregate(type)) : true  #  inside isEmptyDefaultValueAllowed method
		 * (isEmptyDefaultValueAllowed(resolved)) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved != null) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Optional.class == resolved) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Collection.class.isAssignableFrom(resolved)) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Map.class.isAssignableFrom(resolved)) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (bound) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(Object.class).when(resolvableTypeMock).resolve();
			doNothing().when(contextMock).pushConstructorBoundTypes(Object.class);
			doNothing().when(contextMock).clearConfigurationProperty();
			doNothing().when(contextMock).popConstructorBoundTypes();
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			Map map = new HashMap<>();
			collectionFactory.when(() -> CollectionFactory.createMap(Object.class, 0)).thenReturn(map);
			ValueObjectBinder target = new ValueObjectBinder(bindConstructorProviderMock);
			Bindable bindable = Bindable.of(resolvableTypeMock);
			//Act Statement(s)
			Object result = target.bind(configurationPropertyNameMock, bindable, contextMock, dataObjectPropertyBinderMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(resolvableTypeMock).resolve();
				verify(contextMock).pushConstructorBoundTypes(Object.class);
				verify(contextMock).clearConfigurationProperty();
				verify(contextMock).popConstructorBoundTypes();
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				collectionFactory.verify(() -> CollectionFactory.createMap(Object.class, 0), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f93eab2a-79a6-3949-9e08-7bdccda1deec}
	@Disabled()
	@Test()
	void bindWhenResolvedIsArrayAndNotBound() {
		/* Branches:
		 * (valueObject == null) : false
		 * (for-each(parameters)) : true
		 * (bound) : false
		 * (arg != null) : false
		 * (arg != null) : false
		 * (for-each(annotations)) : true  #  inside getDefaultValue method
		 * (annotation instanceof DefaultValue defaultValueAnnotation) : true  #  inside getDefaultValue method
		 * (defaultValue.length == 0) : true  #  inside getDefaultValue method
		 * (resolved == null) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Optional.class == type) : false  #  inside isEmptyDefaultValueAllowed method
		 * (type.isArray()) : false  #  inside isAggregate method
		 * (Map.class.isAssignableFrom(type)) : false  #  inside isAggregate method
		 * (Collection.class.isAssignableFrom(type)) : true  #  inside isAggregate method
		 * (isAggregate(type)) : true  #  inside isEmptyDefaultValueAllowed method
		 * (isEmptyDefaultValueAllowed(resolved)) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved != null) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Optional.class == resolved) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Collection.class.isAssignableFrom(resolved)) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Map.class.isAssignableFrom(resolved)) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved.isArray()) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (bound) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(Object.class).when(resolvableTypeMock).resolve();
			doNothing().when(contextMock).pushConstructorBoundTypes(Object.class);
			doNothing().when(contextMock).clearConfigurationProperty();
			doNothing().when(contextMock).popConstructorBoundTypes();
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			ValueObjectBinder target = new ValueObjectBinder(bindConstructorProviderMock);
			Bindable bindable = Bindable.of(resolvableTypeMock);
			//Act Statement(s)
			Object result = target.bind(configurationPropertyNameMock, bindable, contextMock, dataObjectPropertyBinderMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(resolvableTypeMock).resolve();
				verify(contextMock).pushConstructorBoundTypes(Object.class);
				verify(contextMock).clearConfigurationProperty();
				verify(contextMock).popConstructorBoundTypes();
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${2cc03739-dbce-300a-bcab-aab6318f1001}
	@Disabled()
	@Test()
	void bindWhenResolvedNotIsArrayAndInstanceIsNotNullAndNotBound() {
		/* Branches:
		 * (valueObject == null) : false
		 * (for-each(parameters)) : true
		 * (bound) : false
		 * (arg != null) : false
		 * (arg != null) : false
		 * (for-each(annotations)) : true  #  inside getDefaultValue method
		 * (annotation instanceof DefaultValue defaultValueAnnotation) : true  #  inside getDefaultValue method
		 * (defaultValue.length == 0) : true  #  inside getDefaultValue method
		 * (resolved == null) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Optional.class == type) : false  #  inside isEmptyDefaultValueAllowed method
		 * (type.isArray()) : false  #  inside isAggregate method
		 * (Map.class.isAssignableFrom(type)) : false  #  inside isAggregate method
		 * (Collection.class.isAssignableFrom(type)) : true  #  inside isAggregate method
		 * (isAggregate(type)) : true  #  inside isEmptyDefaultValueAllowed method
		 * (isEmptyDefaultValueAllowed(resolved)) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved != null) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Optional.class == resolved) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Collection.class.isAssignableFrom(resolved)) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Map.class.isAssignableFrom(resolved)) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved.isArray()) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (instance != null) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (bound) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(Object.class).when(resolvableTypeMock).resolve();
			doNothing().when(contextMock).pushConstructorBoundTypes(Object.class);
			doNothing().when(contextMock).clearConfigurationProperty();
			doNothing().when(contextMock).popConstructorBoundTypes();
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			bindable.when(() -> Bindable.of(resolvableTypeMock2)).thenReturn(bindableMock);
			doReturn(Object.class).when(resolvableTypeMock2).resolve();
			ValueObjectBinder target = spy(new ValueObjectBinder(bindConstructorProviderMock));
			Object object = new Object();
			doReturn(object).when(target).create(bindableMock, contextMock);
			Bindable bindable2 = Bindable.of(resolvableTypeMock);
			//Act Statement(s)
			Object result = target.bind(configurationPropertyNameMock, bindable2, contextMock, dataObjectPropertyBinderMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(resolvableTypeMock).resolve();
				verify(contextMock).pushConstructorBoundTypes(Object.class);
				verify(contextMock).clearConfigurationProperty();
				verify(contextMock).popConstructorBoundTypes();
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				bindable.verify(() -> Bindable.of(resolvableTypeMock2), atLeast(1));
				verify(resolvableTypeMock2).resolve();
				verify(target).create(bindableMock, contextMock);
			});
		}
	}

	//Sapient generated method id: ${8b91121e-a2be-39c9-a6c5-baf0c8ad6f77}
	@Disabled()
	@Test()
	void bindWhenResolvedNotIsArrayAndInstanceIsNullAndResolvedIsNotNullAndNotBound() {
		/* Branches:
		 * (valueObject == null) : false
		 * (for-each(parameters)) : true
		 * (bound) : false
		 * (arg != null) : false
		 * (arg != null) : false
		 * (for-each(annotations)) : true  #  inside getDefaultValue method
		 * (annotation instanceof DefaultValue defaultValueAnnotation) : true  #  inside getDefaultValue method
		 * (defaultValue.length == 0) : true  #  inside getDefaultValue method
		 * (resolved == null) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Optional.class == type) : false  #  inside isEmptyDefaultValueAllowed method
		 * (type.isArray()) : false  #  inside isAggregate method
		 * (Map.class.isAssignableFrom(type)) : false  #  inside isAggregate method
		 * (Collection.class.isAssignableFrom(type)) : false  #  inside isAggregate method
		 * (isAggregate(type)) : false  #  inside isEmptyDefaultValueAllowed method
		 * (!(type.isPrimitive() || type.isEnum() || type.getName().startsWith("java.lang"))) : true  #  inside isEmptyDefaultValueAllowed method
		 * (type.isPrimitive()) : false  #  inside isEmptyDefaultValueAllowed method
		 * (type.isEnum()) : true  #  inside isEmptyDefaultValueAllowed method
		 * (isEmptyDefaultValueAllowed(resolved)) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved != null) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Optional.class == resolved) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Collection.class.isAssignableFrom(resolved)) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Map.class.isAssignableFrom(resolved)) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved.isArray()) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (instance != null) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved != null) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (bound) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<BeanUtils> beanUtils = mockStatic(BeanUtils.class);
			 MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(Object.class).when(resolvableTypeMock).resolve();
			doNothing().when(contextMock).pushConstructorBoundTypes(Object.class);
			doNothing().when(contextMock).clearConfigurationProperty();
			doNothing().when(contextMock).popConstructorBoundTypes();
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			bindable.when(() -> Bindable.of(resolvableTypeMock2)).thenReturn(bindableMock);
			doReturn(Object.class).when(resolvableTypeMock2).resolve();
			Object object = new Object();
			beanUtils.when(() -> BeanUtils.instantiateClass(Object.class)).thenReturn(object);
			ValueObjectBinder target = spy(new ValueObjectBinder(bindConstructorProviderMock));
			doReturn(null).when(target).create(bindableMock, contextMock);
			Bindable bindable2 = Bindable.of(resolvableTypeMock);
			//Act Statement(s)
			Object result = target.bind(configurationPropertyNameMock, bindable2, contextMock, dataObjectPropertyBinderMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(resolvableTypeMock).resolve();
				verify(contextMock).pushConstructorBoundTypes(Object.class);
				verify(contextMock).clearConfigurationProperty();
				verify(contextMock).popConstructorBoundTypes();
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				bindable.verify(() -> Bindable.of(resolvableTypeMock2), atLeast(1));
				verify(resolvableTypeMock2).resolve();
				beanUtils.verify(() -> BeanUtils.instantiateClass(Object.class), atLeast(1));
				verify(target).create(bindableMock, contextMock);
			});
		}
	}

	//Sapient generated method id: ${be5b17f5-6362-3d9a-9425-1d56441fb1ef}
	@Disabled()
	@Test()
	void bindWhenMapNotIsAssignableFromResolvedAndResolvedNotIsArrayAndInstanceIsNullAndResolvedIsNotNullAndNotBound() {
		/* Branches:
		 * (valueObject == null) : false
		 * (for-each(parameters)) : true
		 * (bound) : false
		 * (arg != null) : false
		 * (arg != null) : false
		 * (for-each(annotations)) : true  #  inside getDefaultValue method
		 * (annotation instanceof DefaultValue defaultValueAnnotation) : true  #  inside getDefaultValue method
		 * (defaultValue.length == 0) : true  #  inside getDefaultValue method
		 * (resolved == null) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Optional.class == type) : false  #  inside isEmptyDefaultValueAllowed method
		 * (type.isArray()) : false  #  inside isAggregate method
		 * (Map.class.isAssignableFrom(type)) : false  #  inside isAggregate method
		 * (Collection.class.isAssignableFrom(type)) : false  #  inside isAggregate method
		 * (isAggregate(type)) : false  #  inside isEmptyDefaultValueAllowed method
		 * (!(type.isPrimitive() || type.isEnum() || type.getName().startsWith("java.lang"))) : true  #  inside isEmptyDefaultValueAllowed method
		 * (type.isPrimitive()) : false  #  inside isEmptyDefaultValueAllowed method
		 * (type.isEnum()) : false  #  inside isEmptyDefaultValueAllowed method
		 * (isEmptyDefaultValueAllowed(resolved)) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved != null) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Optional.class == resolved) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Collection.class.isAssignableFrom(resolved)) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Map.class.isAssignableFrom(resolved)) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved.isArray()) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (instance != null) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved != null) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (bound) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<BeanUtils> beanUtils = mockStatic(BeanUtils.class);
			 MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(Object.class).when(resolvableTypeMock).resolve();
			doNothing().when(contextMock).pushConstructorBoundTypes(Object.class);
			doNothing().when(contextMock).clearConfigurationProperty();
			doNothing().when(contextMock).popConstructorBoundTypes();
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			bindable.when(() -> Bindable.of(resolvableTypeMock2)).thenReturn(bindableMock);
			doReturn(Object.class).when(resolvableTypeMock2).resolve();
			Object object = new Object();
			beanUtils.when(() -> BeanUtils.instantiateClass(Object.class)).thenReturn(object);
			ValueObjectBinder target = spy(new ValueObjectBinder(bindConstructorProviderMock));
			doReturn(null).when(target).create(bindableMock, contextMock);
			Bindable bindable2 = Bindable.of(resolvableTypeMock);
			//Act Statement(s)
			Object result = target.bind(configurationPropertyNameMock, bindable2, contextMock, dataObjectPropertyBinderMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(resolvableTypeMock).resolve();
				verify(contextMock).pushConstructorBoundTypes(Object.class);
				verify(contextMock).clearConfigurationProperty();
				verify(contextMock).popConstructorBoundTypes();
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				bindable.verify(() -> Bindable.of(resolvableTypeMock2), atLeast(1));
				verify(resolvableTypeMock2).resolve();
				beanUtils.verify(() -> BeanUtils.instantiateClass(Object.class), atLeast(1));
				verify(target).create(bindableMock, contextMock);
			});
		}
	}

	//Sapient generated method id: ${9c267fdf-62c0-3872-adfb-821555fde66f}
	@Test()
	void createWhenValueObjectIsNull() {
		/* Branches:
		 * (valueObject == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ValueObjectBinder target = new ValueObjectBinder(bindConstructorProviderMock);
		Object object = new Object();
		Bindable bindable = Bindable.ofInstance(object);
		//Act Statement(s)
		Object result = target.create(bindable, binderContextMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${85b45b51-d56e-36e8-8017-5dca8e66ede3}
	@Disabled()
	@Test()
	void createWhenAnnotationNotInstanceOfDefaultValue() {
		/* Branches:
		 * (valueObject == null) : false
		 * (for-each(parameters)) : true
		 * (for-each(annotations)) : true  #  inside getDefaultValue method
		 * (annotation instanceof DefaultValue defaultValueAnnotation) : false  #  inside getDefaultValue method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ValueObjectBinder target = new ValueObjectBinder(bindConstructorProviderMock);
		Object object = new Object();
		Bindable bindable = Bindable.ofInstance(object);
		//Act Statement(s)
		Object result = target.create(bindable, binderContextMock);
		Object object2 = new Object();
		//Assert statement(s)
		//TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(object2)));
	}

	//Sapient generated method id: ${f7a9c911-158c-3edf-9684-e66e05956f1e}
	@Disabled()
	@Test()
	void createWhenDefaultValueLengthNotEquals0() {
		/* Branches:
		 * (valueObject == null) : false
		 * (for-each(parameters)) : true
		 * (for-each(annotations)) : true  #  inside getDefaultValue method
		 * (annotation instanceof DefaultValue defaultValueAnnotation) : true  #  inside getDefaultValue method
		 * (defaultValue.length == 0) : false  #  inside getDefaultValue method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(bindConverterMock).when(contextMock).getConverter();
		Object object = new Object();
		String[] stringArray = new String[] { "return_of_valueItem1" };
		Annotation[] annotationArray = new Annotation[] { defaultValueMock };
		doReturn(object).when(bindConverterMock).convert(stringArray, resolvableTypeMock, annotationArray);
		doReturn(stringArray).when(defaultValueMock).value();
		ValueObjectBinder target = new ValueObjectBinder(bindConstructorProviderMock);
		Object object2 = new Object();
		Bindable bindable = Bindable.ofInstance(object2);
		//Act Statement(s)
		Object result = target.create(bindable, contextMock);
		Object object3 = new Object();
		//Assert statement(s)
		//TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, equalTo(object3));
			verify(contextMock).getConverter();
			verify(bindConverterMock).convert(stringArray, resolvableTypeMock, annotationArray);
			verify(defaultValueMock).value();
		});
	}

	//Sapient generated method id: ${c048560a-1fee-3839-bdd8-8b17d65e50dc}
	@Disabled()
	@Test()
	void createWhenDefaultValueLengthEquals1() {
		/* Branches:
		 * (valueObject == null) : false
		 * (for-each(parameters)) : true
		 * (for-each(annotations)) : true  #  inside getDefaultValue method
		 * (annotation instanceof DefaultValue defaultValueAnnotation) : true  #  inside getDefaultValue method
		 * (defaultValue.length == 0) : false  #  inside getDefaultValue method
		 * (catch-exception (ConversionException)) : true  #  inside convertDefaultValue method
		 * (defaultValue.length == 1) : true  #  inside convertDefaultValue method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(bindConverterMock).when(contextMock).getConverter();
		Object object = new Object();
		String[] stringArray = new String[] { "return_of_valueItem1" };
		Annotation[] annotationArray = new Annotation[] { defaultValueMock };
		doReturn(object).when(bindConverterMock).convert(stringArray, resolvableTypeMock, annotationArray);
		doReturn(stringArray).when(defaultValueMock).value();
		Object object2 = new Object();
		doReturn(object2).when(bindConverterMock).convert("return_of_valueItem1", resolvableTypeMock, annotationArray);
		ValueObjectBinder target = new ValueObjectBinder(bindConstructorProviderMock);
		Object object3 = new Object();
		Bindable bindable = Bindable.ofInstance(object3);
		//Act Statement(s)
		Object result = target.create(bindable, contextMock);
		Object object4 = new Object();
		//Assert statement(s)
		//TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, equalTo(object4));
			verify(contextMock).getConverter();
			verify(bindConverterMock).convert(stringArray, resolvableTypeMock, annotationArray);
			verify(defaultValueMock).value();
			verify(bindConverterMock).convert("return_of_valueItem1", resolvableTypeMock, annotationArray);
		});
	}

	//Sapient generated method id: ${0b33c793-dd49-30cd-a55b-68b0ea844f32}
	@Disabled()
	@Test()
	void createWhenDefaultValueLengthNotEquals1ThrowsConversionException() {
		/* Branches:
		 * (valueObject == null) : false
		 * (for-each(parameters)) : true
		 * (for-each(annotations)) : true  #  inside getDefaultValue method
		 * (annotation instanceof DefaultValue defaultValueAnnotation) : true  #  inside getDefaultValue method
		 * (defaultValue.length == 0) : false  #  inside getDefaultValue method
		 * (catch-exception (ConversionException)) : true  #  inside convertDefaultValue method
		 * (defaultValue.length == 1) : false  #  inside convertDefaultValue method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(bindConverterMock).when(contextMock).getConverter();
		Object object = new Object();
		String[] stringArray = new String[] { "return_of_valueItem1", "return_of_valueItem1" };
		Annotation[] annotationArray = new Annotation[] { defaultValueMock };
		doReturn(object).when(bindConverterMock).convert(stringArray, resolvableTypeMock, annotationArray);
		doReturn(stringArray).when(defaultValueMock).value();
		ValueObjectBinder target = new ValueObjectBinder(bindConstructorProviderMock);
		Object object2 = new Object();
		Bindable bindable = Bindable.ofInstance(object2);
		//Act Statement(s)
		final ConversionException result = assertThrows(ConversionException.class, () -> {
			target.create(bindable, contextMock);
		});
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(contextMock).getConverter();
			verify(bindConverterMock).convert(stringArray, resolvableTypeMock, annotationArray);
			verify(defaultValueMock).value();
		});
	}

	//Sapient generated method id: ${a8d68e8a-c54c-387f-b53d-4705dc127b65}
	@Disabled()
	@Test()
	void createWhenResolvedIsNull() {
		/* Branches:
		 * (valueObject == null) : false
		 * (for-each(parameters)) : true
		 * (for-each(annotations)) : true  #  inside getDefaultValue method
		 * (annotation instanceof DefaultValue defaultValueAnnotation) : true  #  inside getDefaultValue method
		 * (defaultValue.length == 0) : true  #  inside getDefaultValue method
		 * (resolved == null) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved != null) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (instance != null) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved != null) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
			doReturn(null).when(resolvableTypeMock).resolve();
			ValueObjectBinder target = new ValueObjectBinder(bindConstructorProviderMock);
			Object object = new Object();
			Bindable bindable2 = Bindable.ofInstance(object);
			//Act Statement(s)
			Object result = target.create(bindable2, binderContextMock);
			Object object2 = new Object();
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(object2));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
				verify(resolvableTypeMock).resolve();
			});
		}
	}

	//Sapient generated method id: ${83a2bc80-6204-3bc9-88e7-fd39f0e7cb8f}
	@Disabled()
	@Test()
	void createWhenResolvedIsNotNullAndOptionalEqualsResolved() {
		/* Branches:
		 * (valueObject == null) : false
		 * (for-each(parameters)) : true
		 * (for-each(annotations)) : true  #  inside getDefaultValue method
		 * (annotation instanceof DefaultValue defaultValueAnnotation) : true  #  inside getDefaultValue method
		 * (defaultValue.length == 0) : true  #  inside getDefaultValue method
		 * (resolved == null) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Optional.class == type) : false  #  inside isEmptyDefaultValueAllowed method
		 * (type.isArray()) : false  #  inside isAggregate method
		 * (Map.class.isAssignableFrom(type)) : false  #  inside isAggregate method
		 * (Collection.class.isAssignableFrom(type)) : true  #  inside isAggregate method
		 * (isAggregate(type)) : true  #  inside isEmptyDefaultValueAllowed method
		 * (isEmptyDefaultValueAllowed(resolved)) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved != null) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Optional.class == resolved) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			ValueObjectBinder target = new ValueObjectBinder(bindConstructorProviderMock);
			Object object = new Object();
			Bindable bindable = Bindable.ofInstance(object);
			//Act Statement(s)
			Object result = target.create(bindable, binderContextMock);
			Object object2 = new Object();
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(object2));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${7e533f9c-924b-3b0e-946a-ec458d6b869d}
	@Disabled()
	@Test()
	void createWhenCollectionIsAssignableFromResolved() {
		/* Branches:
		 * (valueObject == null) : false
		 * (for-each(parameters)) : true
		 * (for-each(annotations)) : true  #  inside getDefaultValue method
		 * (annotation instanceof DefaultValue defaultValueAnnotation) : true  #  inside getDefaultValue method
		 * (defaultValue.length == 0) : true  #  inside getDefaultValue method
		 * (resolved == null) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Optional.class == type) : false  #  inside isEmptyDefaultValueAllowed method
		 * (type.isArray()) : false  #  inside isAggregate method
		 * (Map.class.isAssignableFrom(type)) : false  #  inside isAggregate method
		 * (Collection.class.isAssignableFrom(type)) : true  #  inside isAggregate method
		 * (isAggregate(type)) : true  #  inside isEmptyDefaultValueAllowed method
		 * (isEmptyDefaultValueAllowed(resolved)) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved != null) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Optional.class == resolved) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Collection.class.isAssignableFrom(resolved)) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			Collection collection = new ArrayList<>();
			collectionFactory.when(() -> CollectionFactory.createCollection(Object.class, 0)).thenReturn(collection);
			ValueObjectBinder target = new ValueObjectBinder(bindConstructorProviderMock);
			Object object = new Object();
			Bindable bindable = Bindable.ofInstance(object);
			//Act Statement(s)
			Object result = target.create(bindable, binderContextMock);
			Object object2 = new Object();
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(object2));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				collectionFactory.verify(() -> CollectionFactory.createCollection(Object.class, 0), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${66572780-b490-3572-9458-648b62524552}
	@Disabled()
	@Test()
	void createWhenMapIsAssignableFromResolved() {
		/* Branches:
		 * (valueObject == null) : false
		 * (for-each(parameters)) : true
		 * (for-each(annotations)) : true  #  inside getDefaultValue method
		 * (annotation instanceof DefaultValue defaultValueAnnotation) : true  #  inside getDefaultValue method
		 * (defaultValue.length == 0) : true  #  inside getDefaultValue method
		 * (resolved == null) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Optional.class == type) : false  #  inside isEmptyDefaultValueAllowed method
		 * (type.isArray()) : false  #  inside isAggregate method
		 * (Map.class.isAssignableFrom(type)) : false  #  inside isAggregate method
		 * (Collection.class.isAssignableFrom(type)) : true  #  inside isAggregate method
		 * (isAggregate(type)) : true  #  inside isEmptyDefaultValueAllowed method
		 * (isEmptyDefaultValueAllowed(resolved)) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved != null) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Optional.class == resolved) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Collection.class.isAssignableFrom(resolved)) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Map.class.isAssignableFrom(resolved)) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			Map map = new HashMap<>();
			collectionFactory.when(() -> CollectionFactory.createMap(Object.class, 0)).thenReturn(map);
			ValueObjectBinder target = new ValueObjectBinder(bindConstructorProviderMock);
			Object object = new Object();
			Bindable bindable = Bindable.ofInstance(object);
			//Act Statement(s)
			Object result = target.create(bindable, binderContextMock);
			Object object2 = new Object();
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(object2));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				collectionFactory.verify(() -> CollectionFactory.createMap(Object.class, 0), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${48a99ce1-9780-3a6a-9b76-98876310acd0}
	@Disabled()
	@Test()
	void createWhenResolvedIsArray() {
		/* Branches:
		 * (valueObject == null) : false
		 * (for-each(parameters)) : true
		 * (for-each(annotations)) : true  #  inside getDefaultValue method
		 * (annotation instanceof DefaultValue defaultValueAnnotation) : true  #  inside getDefaultValue method
		 * (defaultValue.length == 0) : true  #  inside getDefaultValue method
		 * (resolved == null) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Optional.class == type) : false  #  inside isEmptyDefaultValueAllowed method
		 * (type.isArray()) : false  #  inside isAggregate method
		 * (Map.class.isAssignableFrom(type)) : false  #  inside isAggregate method
		 * (Collection.class.isAssignableFrom(type)) : true  #  inside isAggregate method
		 * (isAggregate(type)) : true  #  inside isEmptyDefaultValueAllowed method
		 * (isEmptyDefaultValueAllowed(resolved)) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved != null) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Optional.class == resolved) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Collection.class.isAssignableFrom(resolved)) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Map.class.isAssignableFrom(resolved)) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved.isArray()) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			ValueObjectBinder target = new ValueObjectBinder(bindConstructorProviderMock);
			Object object = new Object();
			Bindable bindable = Bindable.ofInstance(object);
			//Act Statement(s)
			Object result = target.create(bindable, binderContextMock);
			Object object2 = new Object();
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(object2));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${b9f63205-e000-3690-9d21-595389dd5578}
	@Disabled()
	@Test()
	void createWhenResolvedNotIsArrayAndInstanceIsNotNull() {
		/* Branches:
		 * (valueObject == null) : false
		 * (for-each(parameters)) : true
		 * (for-each(annotations)) : true  #  inside getDefaultValue method
		 * (annotation instanceof DefaultValue defaultValueAnnotation) : true  #  inside getDefaultValue method
		 * (defaultValue.length == 0) : true  #  inside getDefaultValue method
		 * (resolved == null) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Optional.class == type) : false  #  inside isEmptyDefaultValueAllowed method
		 * (type.isArray()) : false  #  inside isAggregate method
		 * (Map.class.isAssignableFrom(type)) : false  #  inside isAggregate method
		 * (Collection.class.isAssignableFrom(type)) : true  #  inside isAggregate method
		 * (isAggregate(type)) : true  #  inside isEmptyDefaultValueAllowed method
		 * (isEmptyDefaultValueAllowed(resolved)) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved != null) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Optional.class == resolved) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Collection.class.isAssignableFrom(resolved)) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Map.class.isAssignableFrom(resolved)) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved.isArray()) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (instance != null) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
			doReturn(Object.class).when(resolvableTypeMock).resolve();
			ValueObjectBinder target = new ValueObjectBinder(bindConstructorProviderMock);
			Object object = new Object();
			Bindable bindable2 = Bindable.ofInstance(object);
			//Act Statement(s)
			Object result = target.create(bindable2, binderContextMock);
			Object object2 = new Object();
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(object2));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
				verify(resolvableTypeMock).resolve();
			});
		}
	}

	//Sapient generated method id: ${583da591-af2a-3186-b946-4f10ac6bc7ac}
	@Disabled()
	@Test()
	void createWhenResolvedNotIsArrayAndInstanceIsNullAndResolvedIsNotNull() {
		/* Branches:
		 * (valueObject == null) : false
		 * (for-each(parameters)) : true
		 * (for-each(annotations)) : true  #  inside getDefaultValue method
		 * (annotation instanceof DefaultValue defaultValueAnnotation) : true  #  inside getDefaultValue method
		 * (defaultValue.length == 0) : true  #  inside getDefaultValue method
		 * (resolved == null) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Optional.class == type) : false  #  inside isEmptyDefaultValueAllowed method
		 * (type.isArray()) : false  #  inside isAggregate method
		 * (Map.class.isAssignableFrom(type)) : false  #  inside isAggregate method
		 * (Collection.class.isAssignableFrom(type)) : false  #  inside isAggregate method
		 * (isAggregate(type)) : false  #  inside isEmptyDefaultValueAllowed method
		 * (!(type.isPrimitive() || type.isEnum() || type.getName().startsWith("java.lang"))) : true  #  inside isEmptyDefaultValueAllowed method
		 * (type.isPrimitive()) : false  #  inside isEmptyDefaultValueAllowed method
		 * (type.isEnum()) : true  #  inside isEmptyDefaultValueAllowed method
		 * (isEmptyDefaultValueAllowed(resolved)) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved != null) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Optional.class == resolved) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Collection.class.isAssignableFrom(resolved)) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Map.class.isAssignableFrom(resolved)) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved.isArray()) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (instance != null) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved != null) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<BeanUtils> beanUtils = mockStatic(BeanUtils.class);
			 MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
			doReturn(Object.class).when(resolvableTypeMock).resolve();
			Object object = new Object();
			beanUtils.when(() -> BeanUtils.instantiateClass(Object.class)).thenReturn(object);
			ValueObjectBinder target = new ValueObjectBinder(bindConstructorProviderMock);
			Object object2 = new Object();
			Bindable bindable2 = Bindable.ofInstance(object2);
			//Act Statement(s)
			Object result = target.create(bindable2, binderContextMock);
			Object object3 = new Object();
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(object3));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
				verify(resolvableTypeMock).resolve();
				beanUtils.verify(() -> BeanUtils.instantiateClass(Object.class), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4e712e0d-eabf-354f-88e4-0fccd79ec1e8}
	@Disabled()
	@Test()
	void createWhenMapNotIsAssignableFromResolvedAndResolvedNotIsArrayAndInstanceIsNullAndResolvedIsNotNull() {
		/* Branches:
		 * (valueObject == null) : false
		 * (for-each(parameters)) : true
		 * (for-each(annotations)) : true  #  inside getDefaultValue method
		 * (annotation instanceof DefaultValue defaultValueAnnotation) : true  #  inside getDefaultValue method
		 * (defaultValue.length == 0) : true  #  inside getDefaultValue method
		 * (resolved == null) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Optional.class == type) : false  #  inside isEmptyDefaultValueAllowed method
		 * (type.isArray()) : false  #  inside isAggregate method
		 * (Map.class.isAssignableFrom(type)) : false  #  inside isAggregate method
		 * (Collection.class.isAssignableFrom(type)) : false  #  inside isAggregate method
		 * (isAggregate(type)) : false  #  inside isEmptyDefaultValueAllowed method
		 * (!(type.isPrimitive() || type.isEnum() || type.getName().startsWith("java.lang"))) : true  #  inside isEmptyDefaultValueAllowed method
		 * (type.isPrimitive()) : false  #  inside isEmptyDefaultValueAllowed method
		 * (type.isEnum()) : false  #  inside isEmptyDefaultValueAllowed method
		 * (isEmptyDefaultValueAllowed(resolved)) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved != null) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Optional.class == resolved) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Collection.class.isAssignableFrom(resolved)) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (Map.class.isAssignableFrom(resolved)) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved.isArray()) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (instance != null) : false  #  inside getNewDefaultValueInstanceIfPossible method
		 * (resolved != null) : true  #  inside getNewDefaultValueInstanceIfPossible method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<BeanUtils> beanUtils = mockStatic(BeanUtils.class);
			 MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
			doReturn(Object.class).when(resolvableTypeMock).resolve();
			Object object = new Object();
			beanUtils.when(() -> BeanUtils.instantiateClass(Object.class)).thenReturn(object);
			ValueObjectBinder target = new ValueObjectBinder(bindConstructorProviderMock);
			Object object2 = new Object();
			Bindable bindable2 = Bindable.ofInstance(object2);
			//Act Statement(s)
			Object result = target.create(bindable2, binderContextMock);
			Object object3 = new Object();
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(object3));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
				verify(resolvableTypeMock).resolve();
				beanUtils.verify(() -> BeanUtils.instantiateClass(Object.class), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${b0367e9d-6924-36be-8a48-6a95c051c241}
	@Test()
	void onUnableToCreateInstanceTest() throws Exception {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ValueObjectBinder target = new ValueObjectBinder(bindConstructorProviderMock);
		Object object = new Object();
		Bindable bindable = Bindable.ofInstance(object);
		RuntimeException runtimeException = new RuntimeException();
		//Act Statement(s)
		target.onUnableToCreateInstance(bindable, binderContextMock, runtimeException);
	}
}
