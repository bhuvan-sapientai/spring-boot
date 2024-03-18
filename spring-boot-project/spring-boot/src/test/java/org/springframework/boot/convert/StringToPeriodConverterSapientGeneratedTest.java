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

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
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
class StringToPeriodConverterSapientGeneratedTest {

	//Sapient generated method id: ${a09cc112-2d6f-3df0-a3e4-2475492f0d41}, hash: EB19878C9C48C345DE319C85FF8C3F48
	@Test()
	void getConvertibleTypesTest() {
		//Arrange Statement(s)
		StringToPeriodConverter target = new StringToPeriodConverter();
		//Act Statement(s)
		Set<GenericConverter.ConvertiblePair> result = target.getConvertibleTypes();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(1));
			assertThat(result.iterator().next(), is(instanceOf(GenericConverter.ConvertiblePair.class)));
		});
	}

	//Sapient generated method id: ${ae83d63f-8ac1-36ba-ac4d-103ba00fcbf4}, hash: 38DCEC5F59CA2543A2CB21E14FC1B56E
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
			StringToPeriodConverter target = new StringToPeriodConverter();
			//Act Statement(s)
			Object result = target.convert(object, typeDescriptorMock, typeDescriptorMock2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				objectUtils.verify(() -> ObjectUtils.isEmpty(object), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${09d82632-f9c3-3cd5-9c0f-21b6c13aef57}, hash: 2E33660F9F8E5854A63681477C2BC5D5
	@Disabled()
	@Test()
	void convertWhenStyleIsNotNull() {
		/* Branches:
		 * (ObjectUtils.isEmpty(source)) : false
		 * (annotation != null) : true  #  inside getStyle method
		 * (annotation != null) : true  #  inside getPeriodUnit method
		 * (style != null) : true  #  inside convert method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: source
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Field fieldMock = mock(Field.class);
		Field fieldMock2 = mock(Field.class);
		try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class)) {
			Object object = new Object();
			objectUtils.when(() -> ObjectUtils.isEmpty(object)).thenReturn(false);
			StringToPeriodConverter target = new StringToPeriodConverter();
			TypeDescriptor typeDescriptor = new TypeDescriptor(fieldMock);
			TypeDescriptor typeDescriptor2 = new TypeDescriptor(fieldMock2);
			//Act Statement(s)
			Object result = target.convert(object, typeDescriptor, typeDescriptor2);
			Period period = Period.ofYears(0);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(period));
				objectUtils.verify(() -> ObjectUtils.isEmpty(object), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${d5fe6cef-93d9-323d-84c3-b6bbfb0f2d3f}, hash: 16B29A9A3ACB7985807B5BC473C95F03
	@Disabled()
	@Test()
	void convertWhenAnnotationIsNullAndAnnotationIsNullAndStyleIsNull() {
		/* Branches:
		 * (ObjectUtils.isEmpty(source)) : false
		 * (annotation != null) : false  #  inside getStyle method
		 * (annotation != null) : false  #  inside getPeriodUnit method
		 * (style != null) : false  #  inside convert method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		TypeDescriptor targetTypeMock = mock(TypeDescriptor.class, "TypeDescriptor");
		Object objectMock = mock(Object.class, "test");
		TypeDescriptor typeDescriptorMock = mock(TypeDescriptor.class, "TypeDescriptor");
		try (MockedStatic<PeriodStyle> periodStyle = mockStatic(PeriodStyle.class, CALLS_REAL_METHODS);
			 MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class)) {
			doReturn(null).when(targetTypeMock).getAnnotation(PeriodFormat.class);
			doReturn(null).when(targetTypeMock).getAnnotation(PeriodUnit.class);
			objectUtils.when(() -> ObjectUtils.isEmpty(objectMock)).thenReturn(false);
			periodStyle.when(() -> PeriodStyle.detect("test")).thenReturn(PeriodStyle.SIMPLE);
			StringToPeriodConverter target = new StringToPeriodConverter();
			//Act Statement(s)
			Object result = target.convert(objectMock, typeDescriptorMock, targetTypeMock);
			Period period = Period.ofYears(0);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(period));
				verify(targetTypeMock, atLeast(1)).getAnnotation(PeriodFormat.class);
				verify(targetTypeMock, atLeast(1)).getAnnotation(PeriodUnit.class);
				objectUtils.verify(() -> ObjectUtils.isEmpty(objectMock), atLeast(1));
				periodStyle.verify(() -> PeriodStyle.detect("test"), atLeast(1));
			});
		}
	}
}
