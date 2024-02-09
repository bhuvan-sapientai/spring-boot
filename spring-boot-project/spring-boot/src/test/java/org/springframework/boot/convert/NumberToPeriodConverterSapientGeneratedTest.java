package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.core.convert.TypeDescriptor;

import java.util.Set;
import java.time.Period;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class NumberToPeriodConverterSapientGeneratedTest {

	private final TypeDescriptor typeDescriptorMock = mock(TypeDescriptor.class);

	private final TypeDescriptor typeDescriptorMock2 = mock(TypeDescriptor.class);

	//Sapient generated method id: ${a09cc112-2d6f-3df0-a3e4-2475492f0d41}
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

	//Sapient generated method id: ${780e54eb-6a66-3424-bfeb-905ab2c785b5}
	@Disabled()
	@Test()
	void convertWhenSourceIsNotNull() {
		/* Branches:
		 * (source != null) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		NumberToPeriodConverter target = new NumberToPeriodConverter();
		Object objectMock = mock(Object.class, "convert_object1");
		//Act Statement(s)
		Object result = target.convert(objectMock, typeDescriptorMock, typeDescriptorMock2);
		StringToPeriodConverter stringToPeriodConverter = new StringToPeriodConverter();
		TypeDescriptor typeDescriptor = TypeDescriptor.valueOf(String.class);
		Object object = stringToPeriodConverter.convert("convert_object1", typeDescriptor, typeDescriptorMock2);
		//Assert statement(s)
		//TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(object)));
	}

	//Sapient generated method id: ${380b1ace-47e2-39bb-afcc-8fcbdaf257c0}
	@Test()
	void convertWhenSourceIsNull() {
		/* Branches:
		 * (source != null) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		NumberToPeriodConverter target = new NumberToPeriodConverter();
		Object object = null;
		//Act Statement(s)
		Object result = target.convert(object, typeDescriptorMock, typeDescriptorMock2);
		StringToPeriodConverter stringToPeriodConverter = new StringToPeriodConverter();
		TypeDescriptor typeDescriptor = TypeDescriptor.valueOf(String.class);
		Object object2 = stringToPeriodConverter.convert(null, typeDescriptor, typeDescriptorMock2);
		//Assert statement(s)
		//TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(object2)));
	}
}
