package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.core.convert.TypeDescriptor;

import java.util.Set;

import org.springframework.util.ObjectUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArrayToDelimitedStringConverterSapientGeneratedTest {

	private final ConversionService conversionServiceMock = mock(ConversionService.class);

	private final TypeDescriptor typeDescriptorMock = mock(TypeDescriptor.class);

	private final TypeDescriptor typeDescriptorMock2 = mock(TypeDescriptor.class);

	//Sapient generated method id: ${a09cc112-2d6f-3df0-a3e4-2475492f0d41}, hash: 6FC29954F30B0C1902B07D7B67F989D7
	@Test()
	void getConvertibleTypesTest() {
		//Arrange Statement(s)
		ArrayToDelimitedStringConverter target = new ArrayToDelimitedStringConverter(conversionServiceMock);
		//Act Statement(s)
		Set<GenericConverter.ConvertiblePair> result = target.getConvertibleTypes();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(1));
			assertThat(result.iterator().next(), is(instanceOf(GenericConverter.ConvertiblePair.class)));
		});
	}

	//Sapient generated method id: ${15aa0d9b-6071-321c-8acf-ce06e1cd1599}, hash: 345A985CE2DD7C6077D80214000DDA20
	@Test()
	void matchesWhenThisDelegateMatchesSourceTypeTargetType() {
		/* Branches:
		 * (this.delegate.matches(sourceType, targetType)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ArrayToDelimitedStringConverter target = new ArrayToDelimitedStringConverter(conversionServiceMock);
		//Act Statement(s)
		boolean result = target.matches(typeDescriptorMock, typeDescriptorMock2);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${6c0cec1d-9626-398e-aaca-b9ece7ae28dc}, hash: 0824E25390D17F9B0AD931571D4CE1EE
	@Disabled()
	@Test()
	void matchesWhenThisDelegateNotMatchesSourceTypeTargetType() {
		/* Branches:
		 * (this.delegate.matches(sourceType, targetType)) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ArrayToDelimitedStringConverter target = new ArrayToDelimitedStringConverter(conversionServiceMock);
		//Act Statement(s)
		boolean result = target.matches(typeDescriptorMock, typeDescriptorMock2);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${bcac3615-eb3e-3c15-88e5-1c9363f33c9d}, hash: 6C254CA9514A5622B51A768E5A9B1AF2
	@Test()
	void convertTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class)) {
			Object[] objectArray = new Object[] {};
			Object object = new Object();
			objectUtils.when(() -> ObjectUtils.toObjectArray(object)).thenReturn(objectArray);
			ArrayToDelimitedStringConverter target = new ArrayToDelimitedStringConverter(conversionServiceMock);
			//Act Statement(s)
			Object result = target.convert(object, typeDescriptorMock, typeDescriptorMock2);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				objectUtils.verify(() -> ObjectUtils.toObjectArray(object), atLeast(1));
			});
		}
	}
}
