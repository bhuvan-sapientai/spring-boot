package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.Set;
import java.util.HashSet;

import org.mockito.MockedStatic;

import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.util.ObjectUtils;

import java.time.Period;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PeriodToStringConverterSapientGeneratedTest {

	private final Field fieldMock = mock(Field.class);

	private final Field fieldMock2 = mock(Field.class);

	//Sapient generated method id: ${a09cc112-2d6f-3df0-a3e4-2475492f0d41}, hash: A6AE222900CAEDCD819127AC7F2F4BE9
	@Test()
	void getConvertibleTypesTest() {
		//Arrange Statement(s)
		PeriodToStringConverter target = new PeriodToStringConverter();
		//Act Statement(s)
		Set<GenericConverter.ConvertiblePair> result = target.getConvertibleTypes();
		GenericConverter.ConvertiblePair genericConverterConvertiblePair = new GenericConverter.ConvertiblePair(Period.class, String.class);
		Set<GenericConverter.ConvertiblePair> genericConverterConvertiblePairResultSet = new HashSet<>(Set.of(genericConverterConvertiblePair));
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(genericConverterConvertiblePairResultSet.size()));
			assertThat(result, containsInAnyOrder(genericConverterConvertiblePairResultSet.toArray()));
		});
	}

	//Sapient generated method id: ${ae83d63f-8ac1-36ba-ac4d-103ba00fcbf4}, hash: BC2C12A720323A07167ACECF12203C85
	@Test()
	void convertWhenObjectUtilsIsEmptySource() {
		/* Branches:
		 * (ObjectUtils.isEmpty(source)) : true
		 */
		//Arrange Statement(s)
		TypeDescriptor typeDescriptorMock = mock(TypeDescriptor.class);
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

	//Sapient generated method id: ${09d82632-f9c3-3cd5-9c0f-21b6c13aef57}, hash: AE24AF73BED3CA5DE22C766BFDAABF57
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: sourceType - Method: getAnnotation
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
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

	//Sapient generated method id: ${d5fe6cef-93d9-323d-84c3-b6bbfb0f2d3f}, hash: 12269D137043F7C1DAF6925590B7F8A7
	@Disabled()
	@Test()
	void convertWhenAnnotationIsNullAndAnnotationIsNullAndStyleIsNull() {
		/* Branches:
		 * (ObjectUtils.isEmpty(source)) : false
		 * (annotation != null) : false  #  inside getPeriodStyle method
		 * (annotation != null) : false  #  inside getPeriodUnit method
		 * (style != null) : false  #  inside convert method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
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
}
