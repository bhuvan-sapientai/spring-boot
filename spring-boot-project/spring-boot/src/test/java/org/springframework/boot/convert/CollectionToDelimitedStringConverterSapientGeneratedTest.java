package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import org.springframework.core.convert.ConversionService;
import org.springframework.core.ResolvableType;

import java.util.Set;
import java.util.Collection;

import org.springframework.core.convert.converter.GenericConverter;

import java.util.ArrayList;

import org.springframework.core.convert.TypeDescriptor;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CollectionToDelimitedStringConverterSapientGeneratedTest {

	private final ConversionService conversionServiceMock = mock(ConversionService.class, "ConversionService");

	private final ResolvableType resolvableTypeMock = mock(ResolvableType.class);

	private final TypeDescriptor sourceTypeMock = mock(TypeDescriptor.class);

	private final TypeDescriptor typeDescriptorMock = mock(TypeDescriptor.class);

	private final TypeDescriptor typeDescriptorMock2 = mock(TypeDescriptor.class);

	//Sapient generated method id: ${a09cc112-2d6f-3df0-a3e4-2475492f0d41}, hash: 1AEC539F62A7A4279FE8F3D08B21FF9F
	@Test()
	void getConvertibleTypesTest() {
		//Arrange Statement(s)
		CollectionToDelimitedStringConverter target = new CollectionToDelimitedStringConverter(conversionServiceMock);

		//Act Statement(s)
		Set<GenericConverter.ConvertiblePair> result = target.getConvertibleTypes();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(1));
			assertThat(result.iterator().next(), is(instanceOf(GenericConverter.ConvertiblePair.class)));
		});
	}

	//Sapient generated method id: ${58388611-1228-3ea1-a1de-af83c276858f}, hash: 0F8DF1038489386B56C98E100FF746E8
	@Test()
	void matchesWhenSourceElementTypeIsNull() {
		/* Branches:
		 * (targetType == null) : false
		 * (sourceElementType == null) : true
		 */
		//Arrange Statement(s)
		doReturn(null).when(sourceTypeMock).getElementTypeDescriptor();
		CollectionToDelimitedStringConverter target = new CollectionToDelimitedStringConverter(conversionServiceMock);

		//Act Statement(s)
		boolean result = target.matches(sourceTypeMock, typeDescriptorMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.TRUE));
			verify(sourceTypeMock).getElementTypeDescriptor();
		});
	}

	//Sapient generated method id: ${0cb86216-1310-3b57-b173-4661336f5708}, hash: 68F1B2D6A125A8AEF5A59A4ABC2DAFD7
	@Test()
	void matchesWhenSourceElementTypeGetTypeIsAssignableFromTargetTypeGetType() {
		/* Branches:
		 * (targetType == null) : false
		 * (sourceElementType == null) : false
		 * (this.conversionService.canConvert(sourceElementType, targetType)) : false
		 * (sourceElementType.getType().isAssignableFrom(targetType.getType())) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		CollectionToDelimitedStringConverter target = new CollectionToDelimitedStringConverter(conversionServiceMock);
		Annotation[] annotationArray = new Annotation[] {};
		TypeDescriptor typeDescriptor = new TypeDescriptor(resolvableTypeMock, Object.class, annotationArray);
		Field fieldMock = mock(Field.class);
		TypeDescriptor typeDescriptor2 = new TypeDescriptor(fieldMock);
		doReturn(false).when(conversionServiceMock).canConvert(typeDescriptor, typeDescriptor2);
		Field fieldMock2 = mock(Field.class);
		TypeDescriptor typeDescriptor3 = new TypeDescriptor(fieldMock2);

		//Act Statement(s)
		boolean result = target.matches(typeDescriptor3, typeDescriptor2);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.TRUE));
			verify(conversionServiceMock).canConvert(typeDescriptor, typeDescriptor2);
		});
	}

	//Sapient generated method id: ${53f3283c-ffc4-34ba-b78b-2e39b2142cd7}, hash: 114BE9034225D24A93F331817ED36CCB
	@Test()
	void matchesWhenSourceElementTypeGetTypeNotIsAssignableFromTargetTypeGetType() {
		/* Branches:
		 * (targetType == null) : false
		 * (sourceElementType == null) : false
		 * (this.conversionService.canConvert(sourceElementType, targetType)) : false
		 * (sourceElementType.getType().isAssignableFrom(targetType.getType())) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Annotation[] annotationArray = new Annotation[] {};
		TypeDescriptor typeDescriptor = new TypeDescriptor(resolvableTypeMock, Object.class, annotationArray);
		doReturn(typeDescriptor).when(sourceTypeMock).getElementTypeDescriptor();
		CollectionToDelimitedStringConverter target = new CollectionToDelimitedStringConverter(conversionServiceMock);
		ResolvableType resolvableTypeMock2 = mock(ResolvableType.class);
		Annotation[] annotationArray2 = new Annotation[] {};
		TypeDescriptor typeDescriptor2 = new TypeDescriptor(resolvableTypeMock2, Object.class, annotationArray2);
		doReturn(false).when(conversionServiceMock).canConvert(typeDescriptor, typeDescriptor2);

		//Act Statement(s)
		boolean result = target.matches(sourceTypeMock, typeDescriptor2);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(sourceTypeMock).getElementTypeDescriptor();
			verify(conversionServiceMock).canConvert(typeDescriptor, typeDescriptor2);
		});
	}

	//Sapient generated method id: ${380b1ace-47e2-39bb-afcc-8fcbdaf257c0}, hash: 28FC1CD1FABB018DD5997EF01755D17D
	@Test()
	void convertWhenSourceIsNull() {
		/* Branches:
		 * (source == null) : true
		 */
		//Arrange Statement(s)
		CollectionToDelimitedStringConverter target = new CollectionToDelimitedStringConverter(conversionServiceMock);
		Object object = null;

		//Act Statement(s)
		Object result = target.convert(object, typeDescriptorMock, typeDescriptorMock2);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${780e54eb-6a66-3424-bfeb-905ab2c785b5}, hash: 708490A457B84635B7986BA0AAB46D81
	@Test()
	void convertWhenSourceIsNotNull() {
		/* Branches:
		 * (source == null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		CollectionToDelimitedStringConverter target = new CollectionToDelimitedStringConverter(conversionServiceMock);
		Collection collection = new ArrayList<>();

		//Act Statement(s)
		Object result = target.convert((Object) collection, typeDescriptorMock, typeDescriptorMock2);

		//Assert statement(s)
		//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
