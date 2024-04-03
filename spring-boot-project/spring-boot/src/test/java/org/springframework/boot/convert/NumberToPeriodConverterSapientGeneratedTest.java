package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import org.mockito.MockedStatic;

import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.core.convert.TypeDescriptor;

import java.util.Set;
import java.time.Period;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class NumberToPeriodConverterSapientGeneratedTest {

	private final TypeDescriptor typeDescriptorMock = mock(TypeDescriptor.class);

	private final TypeDescriptor typeDescriptorMock2 = mock(TypeDescriptor.class);

	private final TypeDescriptor typeDescriptorMock3 = mock(TypeDescriptor.class);

	//Sapient generated method id: ${a09cc112-2d6f-3df0-a3e4-2475492f0d41}, hash: 2D1B281DABD49824A9B10FEC1522616E
	@Test()
	void getConvertibleTypesTest() {
		//Arrange Statement(s)
		NumberToPeriodConverter target = new NumberToPeriodConverter();
		//Act Statement(s)
		Set<GenericConverter.ConvertiblePair> result = target.getConvertibleTypes();
		GenericConverter.ConvertiblePair genericConverterConvertiblePair = new GenericConverter.ConvertiblePair(Number.class, Period.class);
		Set<GenericConverter.ConvertiblePair> genericConverterConvertiblePairResultSet = new HashSet<>(Set.of(genericConverterConvertiblePair));
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(genericConverterConvertiblePairResultSet.size()));
			assertThat(result, containsInAnyOrder(genericConverterConvertiblePairResultSet.toArray()));
		});
	}

	//Sapient generated method id: ${780e54eb-6a66-3424-bfeb-905ab2c785b5}, hash: 3806205C3D7483C0D55079B40A4F2B4B
	@Disabled()
	@Test()
	void convertWhenSourceIsNotNull() {
		/* Branches:
		 * (source != null) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Object objectMock = mock(Object.class, "convert_object1");
		try (MockedStatic<TypeDescriptor> typeDescriptor = mockStatic(TypeDescriptor.class)) {
			typeDescriptor.when(() -> TypeDescriptor.valueOf(String.class)).thenReturn(typeDescriptorMock);
			NumberToPeriodConverter target = new NumberToPeriodConverter();
			//Act Statement(s)
			Object result = target.convert(objectMock, typeDescriptorMock2, typeDescriptorMock3);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				typeDescriptor.verify(() -> TypeDescriptor.valueOf(String.class), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${380b1ace-47e2-39bb-afcc-8fcbdaf257c0}, hash: A58611FF40C49AF898265E556F60B2D6
	@Disabled()
	@Test()
	void convertWhenSourceIsNull() {
		/* Branches:
		 * (source != null) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<TypeDescriptor> typeDescriptor = mockStatic(TypeDescriptor.class)) {
			typeDescriptor.when(() -> TypeDescriptor.valueOf(String.class)).thenReturn(typeDescriptorMock);
			NumberToPeriodConverter target = new NumberToPeriodConverter();
			Object object = null;
			//Act Statement(s)
			Object result = target.convert(object, typeDescriptorMock2, typeDescriptorMock3);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				typeDescriptor.verify(() -> TypeDescriptor.valueOf(String.class), atLeast(1));
			});
		}
	}
}
