package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.core.convert.TypeDescriptor;
import java.util.Set;
import org.springframework.util.Assert;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DelimitedStringToArrayConverterSapientGeneratedTest {

    private final ConversionService conversionServiceMock = mock(ConversionService.class, "conversionService");

    private final TypeDescriptor targetTypeMock = mock(TypeDescriptor.class);

    private final TypeDescriptor typeDescriptorMock = mock(TypeDescriptor.class);

    private final TypeDescriptor typeDescriptorMock2 = mock(TypeDescriptor.class);

    private final TypeDescriptor typeDescriptorMock3 = mock(TypeDescriptor.class);

    //Sapient generated method id: ${getConvertibleTypesTest}, hash: 199FBE328166DA3BD30A896FCB834253
    @Test()
    void getConvertibleTypesTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(conversionServiceMock, "ConversionService must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DelimitedStringToArrayConverter target = new DelimitedStringToArrayConverter(conversionServiceMock);
            //Act Statement(s)
            Set<GenericConverter.ConvertiblePair> result = target.getConvertibleTypes();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(1));
                assertThat(result.iterator().next(), is(instanceOf(GenericConverter.ConvertiblePair.class)));
                _assert.verify(() -> Assert.notNull(conversionServiceMock, "ConversionService must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${matchesWhenThisConversionServiceCanConvertSourceTypeTargetTypeGetElementTypeDescriptor}, hash: 1E4E84791E5E36729D6505348FE88834
    @Test()
    void matchesWhenThisConversionServiceCanConvertSourceTypeTargetTypeGetElementTypeDescriptor() {
        /* Branches:
         * (targetType.getElementTypeDescriptor() == null) : false
         * (this.conversionService.canConvert(sourceType, targetType.getElementTypeDescriptor())) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(typeDescriptorMock, typeDescriptorMock2).when(targetTypeMock).getElementTypeDescriptor();
            _assert.when(() -> Assert.notNull(conversionServiceMock, "ConversionService must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DelimitedStringToArrayConverter target = new DelimitedStringToArrayConverter(conversionServiceMock);
            doReturn(true).when(conversionServiceMock).canConvert(typeDescriptorMock3, typeDescriptorMock2);
            //Act Statement(s)
            boolean result = target.matches(typeDescriptorMock3, targetTypeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                verify(targetTypeMock, times(2)).getElementTypeDescriptor();
                _assert.verify(() -> Assert.notNull(conversionServiceMock, "ConversionService must not be null"), atLeast(1));
                verify(conversionServiceMock).canConvert(typeDescriptorMock3, typeDescriptorMock2);
            });
        }
    }

    //Sapient generated method id: ${matchesWhenThisConversionServiceNotCanConvertSourceTypeTargetTypeGetElementTypeDescriptor}, hash: 793C3C2585AE1C8D3EA8287377BD728E
    @Test()
    void matchesWhenThisConversionServiceNotCanConvertSourceTypeTargetTypeGetElementTypeDescriptor() {
        /* Branches:
         * (targetType.getElementTypeDescriptor() == null) : false
         * (this.conversionService.canConvert(sourceType, targetType.getElementTypeDescriptor())) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(typeDescriptorMock, typeDescriptorMock2).when(targetTypeMock).getElementTypeDescriptor();
            _assert.when(() -> Assert.notNull(conversionServiceMock, "ConversionService must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DelimitedStringToArrayConverter target = new DelimitedStringToArrayConverter(conversionServiceMock);
            doReturn(false).when(conversionServiceMock).canConvert(typeDescriptorMock3, typeDescriptorMock2);
            //Act Statement(s)
            boolean result = target.matches(typeDescriptorMock3, targetTypeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                verify(targetTypeMock, times(2)).getElementTypeDescriptor();
                _assert.verify(() -> Assert.notNull(conversionServiceMock, "ConversionService must not be null"), atLeast(1));
                verify(conversionServiceMock).canConvert(typeDescriptorMock3, typeDescriptorMock2);
            });
        }
    }

    //Sapient generated method id: ${convertWhenSourceIsNull}, hash: 0587CC588BEBEE9462D4734A8100D8E0
    @Test()
    void convertWhenSourceIsNull() {
        /* Branches:
         * (source == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(conversionServiceMock, "ConversionService must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DelimitedStringToArrayConverter target = new DelimitedStringToArrayConverter(conversionServiceMock);
            Object object = null;
            //Act Statement(s)
            Object result = target.convert(object, typeDescriptorMock, typeDescriptorMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                _assert.verify(() -> Assert.notNull(conversionServiceMock, "ConversionService must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${convertWhenSourceIsNotNull}, hash: 5386749255D5B213093974804544BE2B
    @Disabled()
    @Test()
    void convertWhenSourceIsNotNull() {
        /* Branches:
         * (source == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(conversionServiceMock, "ConversionService must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DelimitedStringToArrayConverter target = new DelimitedStringToArrayConverter(conversionServiceMock);
            //Act Statement(s)
            Object result = target.convert((Object) "source1", typeDescriptorMock, typeDescriptorMock2);
            //Assert statement(s)
            //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(conversionServiceMock, "ConversionService must not be null"), atLeast(1));
            });
        }
    }
}
