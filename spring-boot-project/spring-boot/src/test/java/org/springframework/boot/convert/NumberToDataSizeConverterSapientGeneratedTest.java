package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import org.mockito.MockedStatic;

import org.springframework.util.unit.DataSize;
import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.core.convert.TypeDescriptor;

import java.util.Set;

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
class NumberToDataSizeConverterSapientGeneratedTest {

	private final TypeDescriptor typeDescriptorMock = mock(TypeDescriptor.class);

	private final TypeDescriptor typeDescriptorMock2 = mock(TypeDescriptor.class);

	private final TypeDescriptor typeDescriptorMock3 = mock(TypeDescriptor.class);

	//Sapient generated method id: ${a09cc112-2d6f-3df0-a3e4-2475492f0d41}, hash: 3E2E8F3846A9B05B310359A18C22F2C3
	@Test()
	void getConvertibleTypesTest() {
		//Arrange Statement(s)
		NumberToDataSizeConverter target = new NumberToDataSizeConverter();
		//Act Statement(s)
		Set<GenericConverter.ConvertiblePair> result = target.getConvertibleTypes();
		GenericConverter.ConvertiblePair genericConverterConvertiblePair = new GenericConverter.ConvertiblePair(Number.class, DataSize.class);
		Set<GenericConverter.ConvertiblePair> genericConverterConvertiblePairResultSet = new HashSet<>(Set.of(genericConverterConvertiblePair));
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(genericConverterConvertiblePairResultSet.size()));
			assertThat(result, containsInAnyOrder(genericConverterConvertiblePairResultSet.toArray()));
		});
	}

	//Sapient generated method id: ${780e54eb-6a66-3424-bfeb-905ab2c785b5}, hash: 489902608AE784F3435FEB1D04E88CB7
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
			NumberToDataSizeConverter target = new NumberToDataSizeConverter();
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

	//Sapient generated method id: ${380b1ace-47e2-39bb-afcc-8fcbdaf257c0}, hash: 61527CD071C0361A640594BE90459C61
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
			NumberToDataSizeConverter target = new NumberToDataSizeConverter();
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
