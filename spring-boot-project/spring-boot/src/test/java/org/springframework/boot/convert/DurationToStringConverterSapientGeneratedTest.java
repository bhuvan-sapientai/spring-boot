package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
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

    private final TypeDescriptor sourceTypeMock = mock(TypeDescriptor.class);

    private final TypeDescriptor typeDescriptorMock = mock(TypeDescriptor.class);

    //Sapient generated method id: ${getConvertibleTypesTest}, hash: A3ACF794341C4F5607E0BE62B81B7DC4
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

    //Sapient generated method id: ${convertWhenSourceIsNull}, hash: 2DE4F9293E9FDA63E9D004198AAA7F18
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

    //Sapient generated method id: ${convertWhenStyleIsNotNull}, hash: C92B3FC2ED1968AC643AA038D13E8B8A
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

    //Sapient generated method id: ${convertWhenAnnotationIsNullAndAnnotationIsNullAndStyleIsNull}, hash: AC9495656FE8F3CEFDC6990D2CA88462
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
