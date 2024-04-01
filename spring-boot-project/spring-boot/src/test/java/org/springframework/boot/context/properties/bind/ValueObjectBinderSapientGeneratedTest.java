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

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ValueObjectBinderSapientGeneratedTest {

	private final BindConstructorProvider bindConstructorProviderMock = mock(BindConstructorProvider.class);

	private final BindConverter bindConverterMock = mock(BindConverter.class);

	private final Bindable<Object> bindableMock = mock(Bindable.class);

	private final Binder.Context binderContextMock = mock(Binder.Context.class);

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final Binder.Context contextMock = mock(Binder.Context.class);

	private final DataObjectPropertyBinder dataObjectPropertyBinderMock = mock(DataObjectPropertyBinder.class);

	private final DefaultValue defaultValueMock = mock(DefaultValue.class);

	private final ResolvableType resolvableTypeMock = mock(ResolvableType.class);

	private final ResolvableType resolvableTypeMock2 = mock(ResolvableType.class);

	private final Bindable<Object> targetMock = mock(Bindable.class);

	//Sapient generated method id: ${396b0ce3-400d-3549-b5a7-5b74cebdca3d}, hash: FCF152ED780C4C1B6A6767F61FB4F44E
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
		ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("bind_configurationPropertyName1-name1");

		//Act Statement(s)
		Object result = target.bind(configurationPropertyName, bindableMock, binderContextMock, dataObjectPropertyBinderMock);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${a8ebfbf7-690c-3476-ad27-c3f187a7527e}, hash: D044A1BE8A6F62EFA50759881D7B91C2
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
		doReturn(resolvableTypeMock).when(targetMock).getType();
		doReturn(Object.class).when(resolvableTypeMock).resolve();
		doNothing().when(contextMock).pushConstructorBoundTypes(Object.class);
		doNothing().when(contextMock).clearConfigurationProperty();
		doNothing().when(contextMock).popConstructorBoundTypes();
		ValueObjectBinder target = new ValueObjectBinder(bindConstructorProviderMock);
		ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("bind_configurationPropertyName1-name1");

		//Act Statement(s)
		Object result = target.bind(configurationPropertyName, targetMock, contextMock, dataObjectPropertyBinderMock);

		//Assert statement(s)
		//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(targetMock).getType();
			verify(resolvableTypeMock).resolve();
			verify(contextMock).pushConstructorBoundTypes(Object.class);
			verify(contextMock).clearConfigurationProperty();
			verify(contextMock).popConstructorBoundTypes();
		});
	}

	//Sapient generated method id: ${d9ae5de6-dae4-33a2-85b1-27dcf8cc78a4}, hash: A109FF026F7A8F7CAE4EC67CA36A5F49
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
		doReturn(resolvableTypeMock).when(targetMock).getType();
		doReturn(Object.class).when(resolvableTypeMock).resolve();
		doNothing().when(contextMock).pushConstructorBoundTypes(Object.class);
		doNothing().when(contextMock).clearConfigurationProperty();
		doNothing().when(contextMock).popConstructorBoundTypes();
		ValueObjectBinder target = new ValueObjectBinder(bindConstructorProviderMock);
		ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("bind_configurationPropertyName1-name1");

		//Act Statement(s)
		Object result = target.bind(configurationPropertyName, targetMock, contextMock, dataObjectPropertyBinderMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(nullValue()));
			verify(targetMock).getType();
			verify(resolvableTypeMock).resolve();
			verify(contextMock).pushConstructorBoundTypes(Object.class);
			verify(contextMock).clearConfigurationProperty();
			verify(contextMock).popConstructorBoundTypes();
		});
	}

	//Sapient generated method id: ${e7777e7a-937a-3703-905e-a47723d7f6f8}, hash: FD8D5EC69BE886EA590EE7E27CF1D74A
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
		doReturn(resolvableTypeMock).when(targetMock).getType();
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
		ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("bind_configurationPropertyName1-name1");

		//Act Statement(s)
		Object result = target.bind(configurationPropertyName, targetMock, contextMock, dataObjectPropertyBinderMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(nullValue()));
			verify(targetMock).getType();
			verify(resolvableTypeMock).resolve();
			verify(contextMock).pushConstructorBoundTypes(Object.class);
			verify(contextMock).getConverter();
			verify(bindConverterMock).convert(stringArray, resolvableTypeMock2, annotationArray);
			verify(defaultValueMock).value();
			verify(contextMock).clearConfigurationProperty();
			verify(contextMock).popConstructorBoundTypes();
		});
	}

	//Sapient generated method id: ${a5badf6e-60f5-3ad5-b6f5-dbd66cf45559}, hash: C9E4F9445FE9BDF26F382CBF3726313C
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

	//Sapient generated method id: ${2c19e2c5-9a2b-3fc5-b5a6-106a12f8424d}, hash: D9A7EC1ACBC718E7D8CAFD4EC54D79E5
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
		doReturn(resolvableTypeMock).when(targetMock).getType();
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
		ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("bind_configurationPropertyName1-name1");

		//Act Statement(s)
		Object result = target.bind(configurationPropertyName, targetMock, contextMock, dataObjectPropertyBinderMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(nullValue()));
			verify(targetMock).getType();
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

	//Sapient generated method id: ${6ba5b61f-8186-3e9c-a08d-2dcded05eb3b}, hash: 18F9F4B48DEA67C0F41423304570198F
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
		Bindable bindableMock = mock(Bindable.class);
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

	//Sapient generated method id: ${5b77b4cf-8c75-3e57-aa2c-5c1a50861d7d}, hash: 22072BDE93AD05CD40508EFA37B7E2B8
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

	//Sapient generated method id: ${7c70f353-9d72-39e5-b5e0-051ad1348ef8}, hash: AF4415F9EE4EA26E372615926F3B1795
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

	//Sapient generated method id: ${6c65c349-2304-370d-a1a9-f355b25a6323}, hash: 0B98670C7C0EAE002C64B1CD086982CA
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

	//Sapient generated method id: ${f93eab2a-79a6-3949-9e08-7bdccda1deec}, hash: 4F346FB0488D31DC16C87FDE752FC6C4
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

	//Sapient generated method id: ${2cc03739-dbce-300a-bcab-aab6318f1001}, hash: CC2BD8D47AC6850998743B05CA906694
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
		Bindable bindableMock = mock(Bindable.class);
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

	//Sapient generated method id: ${8b91121e-a2be-39c9-a6c5-baf0c8ad6f77}, hash: 8318F2C1E5E70629A6E9DF8C5C23465C
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
		Bindable bindableMock = mock(Bindable.class);
		try (MockedStatic<BeanUtils> beanUtils = mockStatic(BeanUtils.class);
			 MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(Object.class).when(resolvableTypeMock).resolve();
			doNothing().when(contextMock).pushConstructorBoundTypes(Object.class);
			doNothing().when(contextMock).clearConfigurationProperty();
			doNothing().when(contextMock).popConstructorBoundTypes();
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
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
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
				bindable.verify(() -> Bindable.of(resolvableTypeMock2), atLeast(1));
				verify(resolvableTypeMock2).resolve();
				beanUtils.verify(() -> BeanUtils.instantiateClass(Object.class), atLeast(1));
				verify(target).create(bindableMock, contextMock);
			});
		}
	}

	//Sapient generated method id: ${be5b17f5-6362-3d9a-9425-1d56441fb1ef}, hash: DA114D42BEF01BDA9CE120CCA9E2B866
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
		Bindable bindableMock = mock(Bindable.class);
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

	//Sapient generated method id: ${9c267fdf-62c0-3872-adfb-821555fde66f}, hash: C5970E01287ACFF95F44E106DDC94F6E
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

		//Act Statement(s)
		Object result = target.create(bindableMock, binderContextMock);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${85b45b51-d56e-36e8-8017-5dca8e66ede3}, hash: EC537C869A3C205BB7CB3581CAEC2CEF
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

		//Act Statement(s)
		Object result = target.create(bindableMock, binderContextMock);

		//Assert statement(s)
		//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${f7a9c911-158c-3edf-9684-e66e05956f1e}, hash: EF84E9687E02ED81AB39AEF6AFE580D8
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

		//Act Statement(s)
		Object result = target.create(bindableMock, contextMock);

		//Assert statement(s)
		//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(contextMock).getConverter();
			verify(bindConverterMock).convert(stringArray, resolvableTypeMock, annotationArray);
			verify(defaultValueMock).value();
		});
	}

	//Sapient generated method id: ${c048560a-1fee-3839-bdd8-8b17d65e50dc}, hash: BDFC36BADE8662EEAC30D70188AE6D8C
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

		//Act Statement(s)
		Object result = target.create(bindableMock, contextMock);

		//Assert statement(s)
		//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(contextMock).getConverter();
			verify(bindConverterMock).convert(stringArray, resolvableTypeMock, annotationArray);
			verify(defaultValueMock).value();
			verify(bindConverterMock).convert("return_of_valueItem1", resolvableTypeMock, annotationArray);
		});
	}

	//Sapient generated method id: ${0b33c793-dd49-30cd-a55b-68b0ea844f32}, hash: 49849B711BD0C4FB82CC6AA7F95DC7A6
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
		//Act Statement(s)
		final ConversionException result = assertThrows(ConversionException.class, () -> {
			target.create(bindableMock, contextMock);
		});

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(contextMock).getConverter();
			verify(bindConverterMock).convert(stringArray, resolvableTypeMock, annotationArray);
			verify(defaultValueMock).value();
		});
	}

	//Sapient generated method id: ${a8d68e8a-c54c-387f-b53d-4705dc127b65}, hash: 32E53BB2A974578F58FC6366B039192A
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
		Bindable bindableMock = mock(Bindable.class);
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
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
				verify(resolvableTypeMock).resolve();
			});
		}
	}

	//Sapient generated method id: ${83a2bc80-6204-3bc9-88e7-fd39f0e7cb8f}, hash: FF3B66019B20E2D8DD0B625F14D26306
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
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${7e533f9c-924b-3b0e-946a-ec458d6b869d}, hash: 44AB84FB2148F12D3D60EA40296BAEE9
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
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				collectionFactory.verify(() -> CollectionFactory.createCollection(Object.class, 0), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${66572780-b490-3572-9458-648b62524552}, hash: 208AACDC64867D0388D36C22EF30628A
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
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				collectionFactory.verify(() -> CollectionFactory.createMap(Object.class, 0), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${48a99ce1-9780-3a6a-9b76-98876310acd0}, hash: D8082D71C215F9FDC6971BBFFD08C267
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
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${b9f63205-e000-3690-9d21-595389dd5578}, hash: 1F7E8958A71207EB706CD744013979EA
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
		Bindable bindableMock = mock(Bindable.class);
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
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
				verify(resolvableTypeMock).resolve();
			});
		}
	}

	//Sapient generated method id: ${583da591-af2a-3186-b946-4f10ac6bc7ac}, hash: F05D6F628FA88FE7E4221D6BD4126661
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
		Bindable bindableMock = mock(Bindable.class);
		try (MockedStatic<BeanUtils> beanUtils = mockStatic(BeanUtils.class);
			 MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
			doReturn(Object.class).when(resolvableTypeMock).resolve();
			Object object = new Object();
			beanUtils.when(() -> BeanUtils.instantiateClass(Object.class)).thenReturn(object);
			ValueObjectBinder target = new ValueObjectBinder(bindConstructorProviderMock);
			Object object2 = new Object();
			Bindable bindable2 = Bindable.ofInstance(object2);
			//Act Statement(s)
			Object result = target.create(bindable2, binderContextMock);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
				bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
				verify(resolvableTypeMock).resolve();
				beanUtils.verify(() -> BeanUtils.instantiateClass(Object.class), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4e712e0d-eabf-354f-88e4-0fccd79ec1e8}, hash: E1E2A29BEED8DCDE240DC4C1662976F9
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
		Bindable bindableMock = mock(Bindable.class);
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
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
				verify(resolvableTypeMock).resolve();
				beanUtils.verify(() -> BeanUtils.instantiateClass(Object.class), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${b0367e9d-6924-36be-8a48-6a95c051c241}, hash: 74B6F510F70E0E449448ECC235525128
	@Test()
	void onUnableToCreateInstanceTest() throws Exception {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ValueObjectBinder target = new ValueObjectBinder(bindConstructorProviderMock);
		RuntimeException runtimeException = new RuntimeException();

		//Act Statement(s)
		target.onUnableToCreateInstance(bindableMock, binderContextMock, runtimeException);
	}
}
