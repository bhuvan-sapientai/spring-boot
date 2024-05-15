package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.Set;
import java.time.temporal.ChronoUnit;
import org.mockito.MockedStatic;
import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.core.convert.TypeDescriptor;
import java.time.Period;
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
class StringToPeriodConverterSapientGeneratedTest {

    private final Object objectMock = mock(Object.class, "source");

    private final TypeDescriptor targetTypeMock = mock(TypeDescriptor.class);

    private final TypeDescriptor typeDescriptorMock = mock(TypeDescriptor.class);

    //Sapient generated method id: ${getConvertibleTypesTest}, hash: EB19878C9C48C345DE319C85FF8C3F48
    @Test()
    void getConvertibleTypesTest() {
        //Arrange Statement(s)
        StringToPeriodConverter target = new StringToPeriodConverter();
        //Act Statement(s)
        Set<GenericConverter.ConvertiblePair> result = target.getConvertibleTypes();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(1));
            assertThat(result.iterator().next(), is(instanceOf(GenericConverter.ConvertiblePair.class)));
        });
    }

    //Sapient generated method id: ${convertWhenObjectUtilsIsEmptySource}, hash: 19B64D6ED04FCB988F67D75ED875AC79
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
            StringToPeriodConverter target = new StringToPeriodConverter();
            //Act Statement(s)
            Object result = target.convert(object, typeDescriptorMock, typeDescriptorMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                objectUtils.verify(() -> ObjectUtils.isEmpty(object), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${convertWhenStyleIsNotNull}, hash: 4C1B6F335CE527CF539E1EE87FED072F
    @Disabled()
    @Test()
    void convertWhenStyleIsNotNull() {
        /* Branches:
         * (ObjectUtils.isEmpty(source)) : false
         * (annotation != null) : true  #  inside getStyle method
         * (annotation != null) : true  #  inside getPeriodUnit method
         * (style != null) : true  #  inside convert method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        PeriodFormat periodFormatMock = mock(PeriodFormat.class);
        PeriodUnit periodUnitMock = mock(PeriodUnit.class);
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class)) {
            doReturn(periodFormatMock).when(targetTypeMock).getAnnotation(PeriodFormat.class);
            doReturn(PeriodStyle.SIMPLE).when(periodFormatMock).value();
            doReturn(periodUnitMock).when(targetTypeMock).getAnnotation(PeriodUnit.class);
            doReturn(ChronoUnit.FOREVER).when(periodUnitMock).value();
            objectUtils.when(() -> ObjectUtils.isEmpty(objectMock)).thenReturn(false);
            StringToPeriodConverter target = new StringToPeriodConverter();
            //Act Statement(s)
            Object result = target.convert(objectMock, typeDescriptorMock, targetTypeMock);
            Period period = Period.ofYears(0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(period));
                verify(targetTypeMock).getAnnotation(PeriodFormat.class);
                verify(periodFormatMock).value();
                verify(targetTypeMock).getAnnotation(PeriodUnit.class);
                verify(periodUnitMock).value();
                objectUtils.verify(() -> ObjectUtils.isEmpty(objectMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${convertWhenAnnotationIsNullAndAnnotationIsNullAndStyleIsNull}, hash: D0383212EE0018C6A22603F26A9E9839
    @Disabled()
    @Test()
    void convertWhenAnnotationIsNullAndAnnotationIsNullAndStyleIsNull() {
        /* Branches:
         * (ObjectUtils.isEmpty(source)) : false
         * (annotation != null) : false  #  inside getStyle method
         * (annotation != null) : false  #  inside getPeriodUnit method
         * (style != null) : false  #  inside convert method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<PeriodStyle> periodStyle = mockStatic(PeriodStyle.class, CALLS_REAL_METHODS);
            MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class)) {
            doReturn(null).when(targetTypeMock).getAnnotation(PeriodFormat.class);
            doReturn(null).when(targetTypeMock).getAnnotation(PeriodUnit.class);
            objectUtils.when(() -> ObjectUtils.isEmpty(objectMock)).thenReturn(false);
            periodStyle.when(() -> PeriodStyle.detect("source")).thenReturn(PeriodStyle.SIMPLE);
            StringToPeriodConverter target = new StringToPeriodConverter();
            //Act Statement(s)
            Object result = target.convert(objectMock, typeDescriptorMock, targetTypeMock);
            Period period = Period.ofYears(0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(period));
                verify(targetTypeMock, atLeast(1)).getAnnotation(PeriodFormat.class);
                verify(targetTypeMock, atLeast(1)).getAnnotation(PeriodUnit.class);
                objectUtils.verify(() -> ObjectUtils.isEmpty(objectMock), atLeast(1));
                periodStyle.verify(() -> PeriodStyle.detect("source"), atLeast(1));
            });
        }
    }
}
