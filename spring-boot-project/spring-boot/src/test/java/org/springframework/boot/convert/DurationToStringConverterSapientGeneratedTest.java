package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.time.Duration;
import java.lang.reflect.Field;

import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.core.convert.TypeDescriptor;

import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DurationToStringConverterSapientGeneratedTest {

	private final Field fieldMock = mock(Field.class);

	private final Field fieldMock2 = mock(Field.class);

	//Sapient generated method id: ${a09cc112-2d6f-3df0-a3e4-2475492f0d41}, hash: DF7DCC67FC5FB93B47AD64CD82468984
	@Test()
	void getConvertibleTypesTest() {
		//Arrange Statement(s)
		DurationToStringConverter target = new DurationToStringConverter();
		//Act Statement(s)
		Set<GenericConverter.ConvertiblePair> result = target.getConvertibleTypes();
		GenericConverter.ConvertiblePair genericConverterConvertiblePair = new GenericConverter.ConvertiblePair(Duration.class, String.class);
		Set<GenericConverter.ConvertiblePair> genericConverterConvertiblePairResultSet = new HashSet<>(Set.of(genericConverterConvertiblePair));
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(genericConverterConvertiblePairResultSet.size()));
			assertThat(result, containsInAnyOrder(genericConverterConvertiblePairResultSet.toArray()));
		});
	}

	//Sapient generated method id: ${380b1ace-47e2-39bb-afcc-8fcbdaf257c0}, hash: 0B3A323996C8A49DE94E62DF2610E057
	@Test()
	void convertWhenSourceIsNull() {
		/* Branches:
		 * (source == null) : true
		 */
		//Arrange Statement(s)
		DurationToStringConverter target = new DurationToStringConverter();
		Object object = null;
		TypeDescriptor typeDescriptorMock = mock(TypeDescriptor.class);
		TypeDescriptor typeDescriptorMock2 = mock(TypeDescriptor.class);
		//Act Statement(s)
		Object result = target.convert(object, typeDescriptorMock, typeDescriptorMock2);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${09d82632-f9c3-3cd5-9c0f-21b6c13aef57}, hash: 3484251F5BBA634DFACA7C4438110CF1
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: sourceType - Method: getAnnotation
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DurationToStringConverter target = new DurationToStringConverter();
		Duration duration = (Duration) Duration.ofDays(0L);
		TypeDescriptor typeDescriptor = new TypeDescriptor(fieldMock);
		TypeDescriptor typeDescriptor2 = new TypeDescriptor(fieldMock2);
		//Act Statement(s)
		Object result = target.convert((Object) duration, typeDescriptor, typeDescriptor2);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("result1")));
	}

	//Sapient generated method id: ${d5fe6cef-93d9-323d-84c3-b6bbfb0f2d3f}, hash: 2424476BDB1E262711F9BA27BEABFEF2
	@Disabled()
	@Test()
	void convertWhenAnnotationIsNullAndAnnotationIsNullAndStyleIsNull() {
		/* Branches:
		 * (source == null) : false
		 * (annotation != null) : false  #  inside getDurationStyle method
		 * (annotation != null) : false  #  inside getDurationUnit method
		 * (style != null) : false  #  inside convert method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DurationToStringConverter target = new DurationToStringConverter();
		Duration duration = (Duration) Duration.ofDays(0L);
		TypeDescriptor typeDescriptor = new TypeDescriptor(fieldMock);
		TypeDescriptor typeDescriptor2 = new TypeDescriptor(fieldMock2);
		//Act Statement(s)
		Object result = target.convert((Object) duration, typeDescriptor, typeDescriptor2);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("result1")));
	}
}
