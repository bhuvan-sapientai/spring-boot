package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.Set;

import org.mockito.MockedStatic;

import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.core.convert.TypeDescriptor;

import java.time.Period;

import org.springframework.util.ObjectUtils;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PeriodToStringConverterSapientGeneratedTest {

	private final TypeDescriptor typeDescriptorMock = mock(TypeDescriptor.class);

	//Sapient generated method id: ${a09cc112-2d6f-3df0-a3e4-2475492f0d41}, hash: 3D04AC8C8739F2491429C17100E79489
	@Test()
	void getConvertibleTypesTest() {
		//Arrange Statement(s)
		PeriodToStringConverter target = new PeriodToStringConverter();
		//Act Statement(s)
		Set<GenericConverter.ConvertiblePair> result = target.getConvertibleTypes();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(1));
			assertThat(result.iterator().next(), is(instanceOf(GenericConverter.ConvertiblePair.class)));
		});
	}

	//Sapient generated method id: ${ae83d63f-8ac1-36ba-ac4d-103ba00fcbf4}, hash: 83A39ABDF380B461612E58F0D27FB663
	@Test()
	void convertWhenObjectUtilsIsEmptySource() {
		/* Branches:
		 * (ObjectUtils.isEmpty(source)) : true
		 */
		//Arrange Statement(s)
		TypeDescriptor typeDescriptorMock2 = mock(TypeDescriptor.class);
		try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class)) {
			Object object = new Object();
			objectUtils.when(() -> ObjectUtils.isEmpty(object)).thenReturn(true);
			PeriodToStringConverter target = new PeriodToStringConverter();
			//Act Statement(s)
			Object result = target.convert(object, typeDescriptorMock, typeDescriptorMock2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				objectUtils.verify(() -> ObjectUtils.isEmpty(object), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${09d82632-f9c3-3cd5-9c0f-21b6c13aef57}, hash: 4E5FE62984BEBCA8AF3FBE24BEDD427B
	@Disabled()
	@Test()
	void convertWhenStyleIsNotNull() {
		/* Branches:
		 * (ObjectUtils.isEmpty(source)) : false
		 * (annotation != null) : true  #  inside getPeriodStyle method
		 * (annotation != null) : true  #  inside getPeriodUnit method
		 * (style != null) : true  #  inside convert method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: annotation - Method: value
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Field fieldMock = mock(Field.class);
		Field fieldMock2 = mock(Field.class);
		try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class)) {
			objectUtils.when(() -> ObjectUtils.isEmpty((Period) any())).thenReturn(false);
			PeriodToStringConverter target = new PeriodToStringConverter();
			Period period = (Period) Period.ofYears(0);
			TypeDescriptor typeDescriptor = new TypeDescriptor(fieldMock);
			TypeDescriptor typeDescriptor2 = new TypeDescriptor(fieldMock2);
			//Act Statement(s)
			Object result = target.convert((Object) period, typeDescriptor, typeDescriptor2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("result1"));
				objectUtils.verify(() -> ObjectUtils.isEmpty((Period) any()));
			});
		}
	}

	//Sapient generated method id: ${d5fe6cef-93d9-323d-84c3-b6bbfb0f2d3f}, hash: 0AE1D9815B3667E0E03346DDB213A43B
	@Test()
	void convertWhenAnnotationIsNullAndAnnotationIsNullAndStyleIsNull() {
		/* Branches:
		 * (ObjectUtils.isEmpty(source)) : false
		 * (annotation != null) : false  #  inside getPeriodStyle method
		 * (annotation != null) : false  #  inside getPeriodUnit method
		 * (style != null) : false  #  inside convert method
		 */
		//Arrange Statement(s)
		TypeDescriptor sourceTypeMock = mock(TypeDescriptor.class);
		doReturn(null).when(sourceTypeMock).getAnnotation(PeriodFormat.class);
		doReturn(null).when(sourceTypeMock).getAnnotation(PeriodUnit.class);
		PeriodToStringConverter target = new PeriodToStringConverter();
		Period period = (Period) Period.ofYears(0);
		//Act Statement(s)
		Object result = target.convert((Object) period, sourceTypeMock, typeDescriptorMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("P0D"));
			verify(sourceTypeMock).getAnnotation(PeriodFormat.class);
			verify(sourceTypeMock).getAnnotation(PeriodUnit.class);
		});
	}
}
