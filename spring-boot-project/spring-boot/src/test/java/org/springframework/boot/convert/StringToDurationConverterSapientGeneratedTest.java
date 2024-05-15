package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.Set;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import org.mockito.MockedStatic;
import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.util.ObjectUtils;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class StringToDurationConverterSapientGeneratedTest {

    private final Object objectMock = mock(Object.class, "source");

    private final TypeDescriptor targetTypeMock = mock(TypeDescriptor.class);

    private final TypeDescriptor typeDescriptorMock = mock(TypeDescriptor.class);

    //Sapient generated method id: ${getConvertibleTypesTest}, hash: 33203FCFC880D7C554B4EDF8A832B9B9
    @Test()
    void getConvertibleTypesTest() {
        //Arrange Statement(s)
        StringToDurationConverter target = new StringToDurationConverter();
        //Act Statement(s)
        Set<GenericConverter.ConvertiblePair> result = target.getConvertibleTypes();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(1));
            assertThat(result.iterator().next(), is(instanceOf(GenericConverter.ConvertiblePair.class)));
        });
    }

    //Sapient generated method id: ${convertWhenObjectUtilsIsEmptySource}, hash: 18ABE902A0535D3BD718C741C992D328
    @Test()
    void convertWhenObjectUtilsIsEmptySource() {
        /* Branches:
         * (ObjectUtils.isEmpty(source)) : true
         */
        //Arrange Statement(s)
        TypeDescriptor typeDescriptorMock2 = mock(TypeDescriptor.class);
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class)) {
            Object object = new Object();
            objectUtils.when(() -> ObjectUtils.isEmpty(object)).thenReturn(true);
            StringToDurationConverter target = new StringToDurationConverter();
            //Act Statement(s)
            Object result = target.convert(object, typeDescriptorMock, typeDescriptorMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                objectUtils.verify(() -> ObjectUtils.isEmpty(object), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${convertWhenStyleIsNotNull}, hash: B99A9517E5DD74416E4B51887B545389
    @Disabled()
    @Test()
    void convertWhenStyleIsNotNull() {
        /* Branches:
         * (ObjectUtils.isEmpty(source)) : false
         * (annotation != null) : true  #  inside getStyle method
         * (annotation != null) : true  #  inside getDurationUnit method
         * (style != null) : true  #  inside convert method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DurationFormat durationFormatMock = mock(DurationFormat.class);
        DurationUnit durationUnitMock = mock(DurationUnit.class);
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class)) {
            doReturn(durationFormatMock).when(targetTypeMock).getAnnotation(DurationFormat.class);
            doReturn(DurationStyle.SIMPLE).when(durationFormatMock).value();
            doReturn(durationUnitMock).when(targetTypeMock).getAnnotation(DurationUnit.class);
            doReturn(ChronoUnit.FOREVER).when(durationUnitMock).value();
            objectUtils.when(() -> ObjectUtils.isEmpty(objectMock)).thenReturn(false);
            StringToDurationConverter target = new StringToDurationConverter();
            //Act Statement(s)
            Object result = target.convert(objectMock, typeDescriptorMock, targetTypeMock);
            Duration duration = Duration.ofDays(0L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(duration));
                verify(targetTypeMock).getAnnotation(DurationFormat.class);
                verify(durationFormatMock).value();
                verify(targetTypeMock).getAnnotation(DurationUnit.class);
                verify(durationUnitMock).value();
                objectUtils.verify(() -> ObjectUtils.isEmpty(objectMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${convertWhenAnnotationIsNullAndAnnotationIsNullAndStyleIsNull}, hash: 7C4669C07453400DF9720DC337575D4B
    @Disabled()
    @Test()
    void convertWhenAnnotationIsNullAndAnnotationIsNullAndStyleIsNull() {
        /* Branches:
         * (ObjectUtils.isEmpty(source)) : false
         * (annotation != null) : false  #  inside getStyle method
         * (annotation != null) : false  #  inside getDurationUnit method
         * (style != null) : false  #  inside convert method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DurationStyle> durationStyle = mockStatic(DurationStyle.class, CALLS_REAL_METHODS);
            MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class)) {
            doReturn(null).when(targetTypeMock).getAnnotation(DurationFormat.class);
            doReturn(null).when(targetTypeMock).getAnnotation(DurationUnit.class);
            objectUtils.when(() -> ObjectUtils.isEmpty(objectMock)).thenReturn(false);
            durationStyle.when(() -> DurationStyle.detect("source")).thenReturn(DurationStyle.SIMPLE);
            StringToDurationConverter target = new StringToDurationConverter();
            //Act Statement(s)
            Object result = target.convert(objectMock, typeDescriptorMock, targetTypeMock);
            Duration duration = Duration.ofDays(0L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(duration));
                verify(targetTypeMock, atLeast(1)).getAnnotation(DurationFormat.class);
                verify(targetTypeMock, atLeast(1)).getAnnotation(DurationUnit.class);
                objectUtils.verify(() -> ObjectUtils.isEmpty(objectMock), atLeast(1));
                durationStyle.verify(() -> DurationStyle.detect("source"), atLeast(1));
            });
        }
    }
}
