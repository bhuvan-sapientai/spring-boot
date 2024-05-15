package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.lang.reflect.InvocationTargetException;
import org.mockito.stubbing.Answer;
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
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DurationToNumberConverterSapientGeneratedTest {

    private final DurationUnit durationUnitMock = mock(DurationUnit.class);

    private final TypeDescriptor sourceTypeMock = mock(TypeDescriptor.class);

    private final TypeDescriptor targetTypeMock = mock(TypeDescriptor.class);

    //Sapient generated method id: ${getConvertibleTypesTest}, hash: 0911DF8D8ECBC7167B6BC21B31360D7B
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

    //Sapient generated method id: ${convertWhenSourceIsNull}, hash: 06E73BD9E23C05E26D513EFD5211BE05
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

    //Sapient generated method id: ${convertWhenAnnotationIsNotNull}, hash: 6B5486AC2F14904224EEB401AB9BEF5B
    @Disabled()
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
        try (MockedStatic<DurationStyle.Unit> durationStyleUnit = mockStatic(DurationStyle.Unit.class, CALLS_REAL_METHODS)) {
            doReturn(durationUnitMock).when(sourceTypeMock).getAnnotation(DurationUnit.class);
            doReturn(ChronoUnit.FOREVER).when(durationUnitMock).value();
            doReturn(Object.class).when(targetTypeMock).getObjectType();
            durationStyleUnit.when(() -> DurationStyle.Unit.fromChronoUnit(ChronoUnit.FOREVER)).thenReturn(DurationStyle.Unit.NANOS);
            DurationToNumberConverter target = new DurationToNumberConverter();
            Duration duration = (Duration) Duration.ofDays(0L);
            //Act Statement(s)
            Object result = target.convert((Object) duration, sourceTypeMock, targetTypeMock);
            //Assert statement(s)
            //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(sourceTypeMock, atLeast(1)).getAnnotation(DurationUnit.class);
                verify(durationUnitMock, atLeast(1)).value();
                verify(targetTypeMock, atLeast(1)).getObjectType();
                durationStyleUnit.verify(() -> DurationStyle.Unit.fromChronoUnit(ChronoUnit.FOREVER), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${convertWhenAnnotationIsNull}, hash: 41006BFD404F2D47226E07764D925F45
    @Disabled()
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
        doReturn(null).when(sourceTypeMock).getAnnotation(DurationUnit.class);
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

    //Sapient generated method id: ${convertWhenCaughtExceptionThrowsIllegalStateException}, hash: 45D1E36EF89194E79A0544B499AB1A27
    @Disabled()
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
        try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class);
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
        }
    }
}
