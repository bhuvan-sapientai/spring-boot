package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.HashSet;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.core.convert.TypeDescriptor;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DurationToStringConverterSapientGeneratedTest {

	private final TypeDescriptor sourceTypeMock = mock(TypeDescriptor.class);

	private final TypeDescriptor typeDescriptorMock = mock(TypeDescriptor.class);

	//Sapient generated method id: ${a09cc112-2d6f-3df0-a3e4-2475492f0d41}
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

	//Sapient generated method id: ${380b1ace-47e2-39bb-afcc-8fcbdaf257c0}
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

	//Sapient generated method id: ${09d82632-f9c3-3cd5-9c0f-21b6c13aef57}
	@Disabled()
	@Test()
	void convertWhenStyleIsNotNull() {
		/* Branches:
		 * (source == null) : false
		 * (annotation != null) : true  #  inside getDurationStyle method
		 * (annotation != null) : true  #  inside getDurationUnit method
		 * (style != null) : true  #  inside convert method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DurationFormat durationFormatMock = mock(DurationFormat.class);
		doReturn(durationFormatMock).when(sourceTypeMock).getAnnotation(DurationFormat.class);
		doReturn(DurationStyle.SIMPLE).when(durationFormatMock).value();
		DurationUnit durationUnitMock = mock(DurationUnit.class);
		doReturn(durationUnitMock).when(sourceTypeMock).getAnnotation(DurationUnit.class);
		doReturn(ChronoUnit.NANOS).when(durationUnitMock).value();
		DurationToStringConverter target = new DurationToStringConverter();
		Duration duration = (Duration) Duration.ofDays(0L);
		//Act Statement(s)
		Object result = target.convert((Object) duration, sourceTypeMock, typeDescriptorMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("result1"));
			verify(sourceTypeMock).getAnnotation(DurationFormat.class);
			verify(durationFormatMock).value();
			verify(sourceTypeMock).getAnnotation(DurationUnit.class);
			verify(durationUnitMock).value();
		});
	}

	//Sapient generated method id: ${d5fe6cef-93d9-323d-84c3-b6bbfb0f2d3f}
	@Test()
	void convertWhenAnnotationIsNullAndAnnotationIsNullAndStyleIsNull() {
		/* Branches:
		 * (source == null) : false
		 * (annotation != null) : false  #  inside getDurationStyle method
		 * (annotation != null) : false  #  inside getDurationUnit method
		 * (style != null) : false  #  inside convert method
		 */
		//Arrange Statement(s)
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
