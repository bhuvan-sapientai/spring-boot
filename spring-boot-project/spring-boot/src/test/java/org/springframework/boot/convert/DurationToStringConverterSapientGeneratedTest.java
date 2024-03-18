package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.lang.reflect.Field;

import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.core.convert.TypeDescriptor;

import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DurationToStringConverterSapientGeneratedTest {

	private final TypeDescriptor typeDescriptorMock = mock(TypeDescriptor.class);

	//Sapient generated method id: ${a09cc112-2d6f-3df0-a3e4-2475492f0d41}, hash: A3ACF794341C4F5607E0BE62B81B7DC4
	@Test()
	void getConvertibleTypesTest() {
		//Arrange Statement(s)
		DurationToStringConverter target = new DurationToStringConverter();
		//Act Statement(s)
		Set<GenericConverter.ConvertiblePair> result = target.getConvertibleTypes();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(1));
			assertThat(result.iterator().next(), is(instanceOf(GenericConverter.ConvertiblePair.class)));
		});
	}

	//Sapient generated method id: ${380b1ace-47e2-39bb-afcc-8fcbdaf257c0}, hash: 2DE4F9293E9FDA63E9D004198AAA7F18
	@Test()
	void convertWhenSourceIsNull() {
		/* Branches:
		 * (source == null) : true
		 */
		//Arrange Statement(s)
		DurationToStringConverter target = new DurationToStringConverter();
		Object object = null;
		TypeDescriptor typeDescriptorMock2 = mock(TypeDescriptor.class);
		//Act Statement(s)
		Object result = target.convert(object, typeDescriptorMock, typeDescriptorMock2);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${09d82632-f9c3-3cd5-9c0f-21b6c13aef57}, hash: F5BE70AD7B2464ECE4BE523855E7A1AF
	@Disabled()
	@Test()
	void convertWhenStyleIsNotNull() {
		/* Branches:
		 * (source == null) : false
		 * (annotation != null) : true  #  inside getDurationStyle method
		 * (annotation != null) : true  #  inside getDurationUnit method
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
		DurationToStringConverter target = new DurationToStringConverter();
		Duration duration = (Duration) Duration.ofDays(0L);
		Field fieldMock = mock(Field.class);
		TypeDescriptor typeDescriptor = new TypeDescriptor(fieldMock);
		Field fieldMock2 = mock(Field.class);
		TypeDescriptor typeDescriptor2 = new TypeDescriptor(fieldMock2);
		//Act Statement(s)
		Object result = target.convert((Object) duration, typeDescriptor, typeDescriptor2);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("result1")));
	}

	//Sapient generated method id: ${d5fe6cef-93d9-323d-84c3-b6bbfb0f2d3f}, hash: E1AE314897BEAE3C24DC83349615224B
	@Test()
	void convertWhenAnnotationIsNullAndAnnotationIsNullAndStyleIsNull() {
		/* Branches:
		 * (source == null) : false
		 * (annotation != null) : false  #  inside getDurationStyle method
		 * (annotation != null) : false  #  inside getDurationUnit method
		 * (style != null) : false  #  inside convert method
		 */
		//Arrange Statement(s)
		TypeDescriptor sourceTypeMock = mock(TypeDescriptor.class);
		doReturn(null).when(sourceTypeMock).getAnnotation(DurationFormat.class);
		doReturn(null).when(sourceTypeMock).getAnnotation(DurationUnit.class);
		DurationToStringConverter target = new DurationToStringConverter();
		Duration duration = (Duration) Duration.ofDays(0L);
		//Act Statement(s)
		Object result = target.convert((Object) duration, sourceTypeMock, typeDescriptorMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("PT0S"));
			verify(sourceTypeMock).getAnnotation(DurationFormat.class);
			verify(sourceTypeMock).getAnnotation(DurationUnit.class);
		});
	}
}
