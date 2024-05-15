package org.springframework.boot.context.properties;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.lang.annotation.Annotation;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.ResolvableType;
import org.springframework.core.convert.TypeDescriptor;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertiesCharSequenceToObjectConverterSapientGeneratedTest {

    private final ConversionService conversionServiceMock = mock(ConversionService.class, "conversionService");

    private final ResolvableType resolvableTypeMock = mock(ResolvableType.class);

    private final TypeDescriptor targetTypeMock = mock(TypeDescriptor.class);

    private final TypeDescriptor typeDescriptorMock = mock(TypeDescriptor.class);

    //Sapient generated method id: ${matchesWhenSourceTypeGetTypeEqualsString}, hash: 0DB7FCEC47FC869540F5C450C4799590
    @Test()
    void matchesWhenSourceTypeGetTypeEqualsString() {
        /* Branches:
         * (sourceType.getType() == String.class) : true
         */
        //Arrange Statement(s)
        ConfigurationPropertiesCharSequenceToObjectConverter target = new ConfigurationPropertiesCharSequenceToObjectConverter(conversionServiceMock);
        Annotation[] annotationArray = new Annotation[] {};
        TypeDescriptor typeDescriptor = new TypeDescriptor(resolvableTypeMock, String.class, annotationArray);
        //Act Statement(s)
        boolean result = target.matches(typeDescriptor, typeDescriptorMock);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${matchesWhenTargetTypeEqualsBYTE_ARRAYAndIsStringConversionBetterNotSourceTypeTargetType}, hash: F21E1AE97AEC193FEDD8151D54451A23
    @Test()
    void matchesWhenTargetTypeEqualsBYTE_ARRAYAndIsStringConversionBetterNotSourceTypeTargetType() {
        /* Branches:
         * (sourceType.getType() == String.class) : false
         * (this.disable.get() == Boolean.TRUE) : false
         * (canDirectlyConvertCharSequence) : true
         * (this.conversionService instanceof ApplicationConversionService applicationConversionService) : false  #  inside isStringConversionBetter method
         * (targetType.isArray()) : false  #  inside isStringConversionBetter method
         * (targetType.isCollection()) : true  #  inside isStringConversionBetter method
         * (!targetType.equals(BYTE_ARRAY)) : false  #  inside isStringConversionBetter method
         * (!isStringConversionBetter(sourceType, targetType)) : true
         */
        //Arrange Statement(s)
        ConfigurationPropertiesCharSequenceToObjectConverter target = new ConfigurationPropertiesCharSequenceToObjectConverter(conversionServiceMock);
        Annotation[] annotationArray = new Annotation[] {};
        TypeDescriptor typeDescriptor = new TypeDescriptor(resolvableTypeMock, Object.class, annotationArray);
        doReturn(true).when(conversionServiceMock).canConvert(eq(typeDescriptor), (TypeDescriptor) any());
        TypeDescriptor typeDescriptor2 = TypeDescriptor.valueOf(byte[].class);
        //Act Statement(s)
        boolean result = target.matches(typeDescriptor, typeDescriptor2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(conversionServiceMock).canConvert(eq(typeDescriptor), (TypeDescriptor) any());
        });
    }

    //Sapient generated method id: ${matchesWhenIsStringConversionBetterSourceTypeTargetTypeAndThisConversionServiceCanConvertSTRINGTargetType}, hash: 3D0176A4628DE5C368F195C101DC3076
    @Disabled()
    @Test()
    void matchesWhenIsStringConversionBetterSourceTypeTargetTypeAndThisConversionServiceCanConvertSTRINGTargetType() {
        /* Branches:
         * (sourceType.getType() == String.class) : false
         * (this.disable.get() == Boolean.TRUE) : false
         * (canDirectlyConvertCharSequence) : true
         * (this.conversionService instanceof ApplicationConversionService applicationConversionService) : false  #  inside isStringConversionBetter method
         * (targetType.isArray()) : false  #  inside isStringConversionBetter method
         * (targetType.isCollection()) : true  #  inside isStringConversionBetter method
         * (!targetType.equals(BYTE_ARRAY)) : true  #  inside isStringConversionBetter method
         * (!isStringConversionBetter(sourceType, targetType)) : false
         * (this.conversionService.canConvert(STRING, targetType)) : true
         */
        //Arrange Statement(s)
        doReturn(false).when(targetTypeMock).isArray();
        doReturn(true).when(targetTypeMock).isCollection();
        ConfigurationPropertiesCharSequenceToObjectConverter target = new ConfigurationPropertiesCharSequenceToObjectConverter(conversionServiceMock);
        Annotation[] annotationArray = new Annotation[] {};
        TypeDescriptor typeDescriptor = new TypeDescriptor(resolvableTypeMock, Object.class, annotationArray);
        doReturn(true).when(conversionServiceMock).canConvert(typeDescriptor, targetTypeMock);
        doReturn(true).when(conversionServiceMock).canConvert((TypeDescriptor) any(), eq(targetTypeMock));
        //Act Statement(s)
        boolean result = target.matches(typeDescriptor, targetTypeMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(targetTypeMock).isArray();
            verify(targetTypeMock).isCollection();
            verify(conversionServiceMock).canConvert(typeDescriptor, targetTypeMock);
            verify(conversionServiceMock).canConvert((TypeDescriptor) any(), eq(targetTypeMock));
        });
    }

    //Sapient generated method id: ${matchesWhenTargetTypeNotEqualsBYTE_ARRAYAndIsStringConversionBetterSourceTypeTargetTypeAndThisConversionServiceNotCanCo}, hash: 4A1BABDC59A9A67BF585BE6304420FA8
    @Disabled()
    @Test()
    void matchesWhenTargetTypeNotEqualsBYTE_ARRAYAndIsStringConversionBetterSourceTypeTargetTypeAndThisConversionServiceNotCanCo() {
        /* Branches:
         * (sourceType.getType() == String.class) : false
         * (this.disable.get() == Boolean.TRUE) : false
         * (canDirectlyConvertCharSequence) : true
         * (this.conversionService instanceof ApplicationConversionService applicationConversionService) : false  #  inside isStringConversionBetter method
         * (targetType.isArray()) : false  #  inside isStringConversionBetter method
         * (targetType.isCollection()) : true  #  inside isStringConversionBetter method
         * (!targetType.equals(BYTE_ARRAY)) : true  #  inside isStringConversionBetter method
         * (!isStringConversionBetter(sourceType, targetType)) : false
         * (this.conversionService.canConvert(STRING, targetType)) : false
         */
        //Arrange Statement(s)
        doReturn(false).when(targetTypeMock).isArray();
        doReturn(true).when(targetTypeMock).isCollection();
        ConfigurationPropertiesCharSequenceToObjectConverter target = new ConfigurationPropertiesCharSequenceToObjectConverter(conversionServiceMock);
        Annotation[] annotationArray = new Annotation[] {};
        TypeDescriptor typeDescriptor = new TypeDescriptor(resolvableTypeMock, Object.class, annotationArray);
        doReturn(true).when(conversionServiceMock).canConvert(typeDescriptor, targetTypeMock);
        doReturn(false).when(conversionServiceMock).canConvert((TypeDescriptor) any(), eq(targetTypeMock));
        //Act Statement(s)
        boolean result = target.matches(typeDescriptor, targetTypeMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(targetTypeMock).isArray();
            verify(targetTypeMock).isCollection();
            verify(conversionServiceMock).canConvert(typeDescriptor, targetTypeMock);
            verify(conversionServiceMock).canConvert((TypeDescriptor) any(), eq(targetTypeMock));
        });
    }

    //Sapient generated method id: ${convertTest}, hash: 23A05ACDF830D1941FF8D5221CD59B5C
    @Test()
    void convertTest() {
        //Arrange Statement(s)
        ConfigurationPropertiesCharSequenceToObjectConverter target = new ConfigurationPropertiesCharSequenceToObjectConverter(conversionServiceMock);
        Object object = new Object();
        doReturn(object).when(conversionServiceMock).convert(eq("source"), (TypeDescriptor) any(), eq(typeDescriptorMock));
        Object objectMock = mock(Object.class, "source");
        TypeDescriptor typeDescriptorMock2 = mock(TypeDescriptor.class);
        //Act Statement(s)
        Object result = target.convert(objectMock, typeDescriptorMock2, typeDescriptorMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(object));
            verify(conversionServiceMock).convert(eq("source"), (TypeDescriptor) any(), eq(typeDescriptorMock));
        });
    }
}
