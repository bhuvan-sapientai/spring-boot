package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import org.mockito.stubbing.Answer;

import java.lang.reflect.Field;
import java.util.Set;
import java.util.HashSet;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.mockito.MockedStatic;

import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Constructor;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.containsInAnyOrder;
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

	private final TypeDescriptor sourceTypeMock = mock(TypeDescriptor.class);

	private final TypeDescriptor targetTypeMock = mock(TypeDescriptor.class);

	//Sapient generated method id: ${a09cc112-2d6f-3df0-a3e4-2475492f0d41}
	@Test()
	void getConvertibleTypesTest() {
		//Arrange Statement(s)
		DurationToNumberConverter target = new DurationToNumberConverter();
		//Act Statement(s)
		Set<GenericConverter.ConvertiblePair> result = target.getConvertibleTypes();
		GenericConverter.ConvertiblePair genericConverterConvertiblePair = new GenericConverter.ConvertiblePair(Duration.class, Number.class);
		Set<GenericConverter.ConvertiblePair> genericConverterConvertiblePairResultSet = new HashSet<>(Set.of(genericConverterConvertiblePair));
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(genericConverterConvertiblePairResultSet.size()));
			assertThat(result, containsInAnyOrder(genericConverterConvertiblePairResultSet.toArray()));
		});
	}

	//Sapient generated method id: ${380b1ace-47e2-39bb-afcc-8fcbdaf257c0}
	@Test()
	void convertWhenSourceIsNull() throws Exception {
		/* Branches:
		 * (source == null) : true
		 */
		//Arrange Statement(s)
		//DurationToNumberConverter target = new DurationToNumberConverter();
		//Object object = null;
		//TypeDescriptor typeDescriptorMock = mock(TypeDescriptor.class);
		//TypeDescriptor typeDescriptorMock2 = mock(TypeDescriptor.class);
		//Act Statement(s)
		//Object result = target.convert(object, typeDescriptorMock, typeDescriptorMock2);
		//Assert statement(s)
		//assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${56568c04-8c71-30f4-be77-6cf7f80ca7c3}
	@Test()
	void convertWhenAnnotationIsNotNull() throws Exception {
		/* Branches:
		 * (source == null) : false
		 * (annotation != null) : true  #  inside getDurationUnit method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<DurationStyle.Unit> durationStyleUnit = mockStatic(DurationStyle.Unit.class, CALLS_REAL_METHODS)) {
    durationStyleUnit.when(() -> DurationStyle.Unit.fromChronoUnit(ChronoUnit.FOREVER)).thenReturn(DurationStyle.Unit.NANOS);
    DurationToNumberConverter target = new DurationToNumberConverter();
    Duration duration = (Duration) Duration.ofDays(0L);
    TypeDescriptor typeDescriptor = new TypeDescriptor((Field) null);
    TypeDescriptor typeDescriptor2 = new TypeDescriptor((Field) null);
    //Act Statement(s)
    Object result = target.convert((Object) duration, typeDescriptor, typeDescriptor2);
    Class _class = new Class();
    Class[] classArray = new Class[] { String.class };
    Constructor constructor = _class.getConstructor(classArray);
    Object[] objectArray = new Object[] { "2" };
    Object object = constructor.newInstance(objectArray);
    //Assert statement(s)
    //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
    assertAll("result", () -> {
        assertThat(result, equalTo(object));
        durationStyleUnit.verify(() -> DurationStyle.Unit.fromChronoUnit(ChronoUnit.FOREVER), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${802ce6f6-3b94-363b-9ea3-1b9489384e53}
	@Test()
	void convertWhenAnnotationIsNull() throws Exception {
		/* Branches:
		 * (source == null) : false
		 * (annotation != null) : false  #  inside getDurationUnit method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Assert statement(s)
		//Arrange Statement(s)
		//doReturn(null).when(sourceTypeMock).getAnnotation(DurationUnit.class);
		//doReturn(Object.class).when(targetTypeMock).getObjectType();
		//DurationToNumberConverter target = new DurationToNumberConverter();
		//Duration duration = (Duration) Duration.ofDays(0L);
		//Act Statement(s)
		//Object result = target.convert((Object) duration, sourceTypeMock, targetTypeMock);
		//Object object = new Object();
		//TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
        /*assertAll("result", () -> {
    assertThat(result, equalTo(object));
    verify(sourceTypeMock).getAnnotation(DurationUnit.class);
    verify(targetTypeMock).getObjectType();
});*/
	}

	//Sapient generated method id: ${bf4655be-9b11-3161-9595-f7df1c00f2e7}
	@Test()
	void convertWhenCaughtExceptionThrowsIllegalStateException() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		/* Branches:
		 * (source == null) : false
		 * (annotation != null) : true  #  inside getDurationUnit method
		 * (catch-exception (Exception)) : true  #  inside convert method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//DurationUnit durationUnitMock = mock(DurationUnit.class);
        /*try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class);
    MockedStatic<DurationStyle.Unit> durationStyleUnit = mockStatic(DurationStyle.Unit.class, CALLS_REAL_METHODS)) {
    doReturn(durationUnitMock).when(sourceTypeMock).getAnnotation(DurationUnit.class);
    doReturn(ChronoUnit.FOREVER).when(durationUnitMock).value();
    doReturn(Object.class).when(targetTypeMock).getObjectType();
    durationStyleUnit.when(() -> DurationStyle.Unit.fromChronoUnit(ChronoUnit.FOREVER)).thenReturn(DurationStyle.Unit.NANOS);
    Exception exception = new Exception();
    reflectionUtils.when(() -> ReflectionUtils.rethrowRuntimeException(exception)).thenAnswer((Answer<Void>) invocation -> null);
    DurationToNumberConverter target = new DurationToNumberConverter();
    Duration duration = (Duration) Duration.ofDays(0L);
    //Act Statement(s)
    final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
        target.convert((Object) duration, sourceTypeMock, targetTypeMock);
    });
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(notNullValue()));
        assertThat(result.getCause(), is(instanceOf(exception.getClass())));
        verify(sourceTypeMock, atLeast(1)).getAnnotation(DurationUnit.class);
        verify(durationUnitMock, atLeast(1)).value();
        verify(targetTypeMock, atLeast(1)).getObjectType();
        durationStyleUnit.verify(() -> DurationStyle.Unit.fromChronoUnit(ChronoUnit.FOREVER), atLeast(1));
        reflectionUtils.verify(() -> ReflectionUtils.rethrowRuntimeException(exception), atLeast(1));
    });
}*/
	}
}
