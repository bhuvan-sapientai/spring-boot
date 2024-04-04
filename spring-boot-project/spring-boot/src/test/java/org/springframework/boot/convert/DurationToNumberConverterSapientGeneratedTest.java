package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import org.mockito.stubbing.Answer;

import java.lang.reflect.Field;
import java.util.Set;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.mockito.MockedStatic;

import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.util.ReflectionUtils;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DurationToNumberConverterSapientGeneratedTest {

	private final Field fieldMock = mock(Field.class);

	private final Field fieldMock2 = mock(Field.class);

	//Sapient generated method id: ${a09cc112-2d6f-3df0-a3e4-2475492f0d41}, hash: 0911DF8D8ECBC7167B6BC21B31360D7B
	@Test()
	void getConvertibleTypesTest() {
		//Arrange Statement(s)
		DurationToNumberConverter target = new DurationToNumberConverter();

		//Act Statement(s)
		Set<GenericConverter.ConvertiblePair> result = target.getConvertibleTypes();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(1));
			assertThat(result.iterator().next(), is(instanceOf(GenericConverter.ConvertiblePair.class)));
		});
	}

	//Sapient generated method id: ${380b1ace-47e2-39bb-afcc-8fcbdaf257c0}, hash: 06E73BD9E23C05E26D513EFD5211BE05
	@Test()
	void convertWhenSourceIsNull() throws Exception {
		/* Branches:
		 * (source == null) : true
		 */
		//Arrange Statement(s)
		DurationToNumberConverter target = new DurationToNumberConverter();
		Object object = null;
		TypeDescriptor typeDescriptorMock = mock(TypeDescriptor.class);
		TypeDescriptor typeDescriptorMock2 = mock(TypeDescriptor.class);

		//Act Statement(s)
		Object result = target.convert(object, typeDescriptorMock, typeDescriptorMock2);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${56568c04-8c71-30f4-be77-6cf7f80ca7c3}, hash: C45E49D507E670CAF9DE20AD7701DEDE
	@Test()
	void convertWhenAnnotationIsNotNull() throws Exception {
		/* Branches:
		 * (source == null) : false
		 * (annotation != null) : true  #  inside getDurationUnit method
		 */
		//Arrange Statement(s)
		try (MockedStatic<DurationStyle.Unit> durationStyleUnit = mockStatic(DurationStyle.Unit.class, CALLS_REAL_METHODS)) {
			durationStyleUnit.when(() -> DurationStyle.Unit.fromChronoUnit((ChronoUnit) null)).thenReturn(DurationStyle.Unit.SECONDS);
			DurationToNumberConverter target = new DurationToNumberConverter();
			Duration duration = (Duration) Duration.ofDays(0L);
			TypeDescriptor typeDescriptor = new TypeDescriptor(fieldMock);
			TypeDescriptor typeDescriptor2 = new TypeDescriptor(fieldMock2);
			//Act Statement(s)
			Object result = target.convert((Object) duration, typeDescriptor, typeDescriptor2);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				durationStyleUnit.verify(() -> DurationStyle.Unit.fromChronoUnit((ChronoUnit) null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${802ce6f6-3b94-363b-9ea3-1b9489384e53}, hash: A49F3B2E3A44BA9464FDAD571AC6C90E
	@Test()
	void convertWhenAnnotationIsNull() throws Exception {
		/* Branches:
		 * (source == null) : false
		 * (annotation != null) : false  #  inside getDurationUnit method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		TypeDescriptor sourceTypeMock = mock(TypeDescriptor.class);
		doReturn(null).when(sourceTypeMock).getAnnotation(DurationUnit.class);
		TypeDescriptor targetTypeMock = mock(TypeDescriptor.class);
		doReturn(Object.class).when(targetTypeMock).getObjectType();
		DurationToNumberConverter target = new DurationToNumberConverter();
		Duration duration = (Duration) Duration.ofDays(0L);

		//Act Statement(s)
		Object result = target.convert((Object) duration, sourceTypeMock, targetTypeMock);

		//Assert statement(s)
		//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(sourceTypeMock).getAnnotation(DurationUnit.class);
			verify(targetTypeMock).getObjectType();
		});
	}

	//Sapient generated method id: ${bf4655be-9b11-3161-9595-f7df1c00f2e7}, hash: CEDB588737C55D44C6717F3A3DB9DF4F
	@Test()
	void convertWhenCaughtExceptionThrowsIllegalStateException() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		/* Branches:
		 * (source == null) : false
		 * (annotation != null) : true  #  inside getDurationUnit method
		 * (catch-exception (Exception)) : true  #  inside convert method
		 */
		//Arrange Statement(s)
		try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class)) {
			Exception exception = new Exception();
			reflectionUtils.when(() -> ReflectionUtils.rethrowRuntimeException(exception)).thenAnswer((Answer<Void>) invocation -> null);
			DurationToNumberConverter target = new DurationToNumberConverter();
			Duration duration = (Duration) Duration.ofDays(0L);
			TypeDescriptor typeDescriptor = new TypeDescriptor(fieldMock);
			TypeDescriptor typeDescriptor2 = new TypeDescriptor(fieldMock2);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.convert((Object) duration, typeDescriptor, typeDescriptor2);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getCause(), is(instanceOf(exception.getClass())));
				reflectionUtils.verify(() -> ReflectionUtils.rethrowRuntimeException(exception), atLeast(1));
			});
		}
	}
}
