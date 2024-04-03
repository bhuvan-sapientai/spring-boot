package org.springframework.boot.context.properties;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertiesCharSequenceToObjectConverterSapientGeneratedTest {

	private final ConversionService conversionServiceMock = mock(ConversionService.class, "ApplicationConversionService");

	private final Field fieldMock = mock(Field.class);

	private final Field fieldMock2 = mock(Field.class);

	private final TypeDescriptor typeDescriptorMock = mock(TypeDescriptor.class);

	//Sapient generated method id: ${86dff209-2e07-3a07-86f3-afe748093c3c}, hash: D154F2856B042D5C0A17516C98CFC4EF
	@Test()
	void matchesWhenThisDisableGetEqualsBooleanTRUE() {
		/* Branches:
		 * (sourceType.getType() == String.class) : false
		 * (this.disable.get() == Boolean.TRUE) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertiesCharSequenceToObjectConverter target = new ConfigurationPropertiesCharSequenceToObjectConverter(conversionServiceMock);
		TypeDescriptor typeDescriptor = new TypeDescriptor(fieldMock);
		TypeDescriptor typeDescriptor2 = new TypeDescriptor(fieldMock2);
		//Act Statement(s)
		boolean result = target.matches(typeDescriptor, typeDescriptor2);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${eba10f31-3797-3e38-a1a2-d20b1605c651}, hash: A05A5D2FE3C42D22BAC8694AF6B728D5
	@Disabled()
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
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertiesCharSequenceToObjectConverter target = new ConfigurationPropertiesCharSequenceToObjectConverter(conversionServiceMock);
		TypeDescriptor typeDescriptor = new TypeDescriptor(fieldMock);
		TypeDescriptor typeDescriptor2 = new TypeDescriptor(fieldMock2);
		doReturn(true).when(conversionServiceMock).canConvert(typeDescriptor, typeDescriptor2);
		//Act Statement(s)
		boolean result = target.matches(typeDescriptor, typeDescriptor2);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(conversionServiceMock).canConvert(typeDescriptor, typeDescriptor2);
		});
	}

	//Sapient generated method id: ${6207393d-bb36-3110-af5f-81048dea6f9b}, hash: AFA0A7F831E136214F56ADCD95F554A6
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
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertiesCharSequenceToObjectConverter target = new ConfigurationPropertiesCharSequenceToObjectConverter(conversionServiceMock);
		TypeDescriptor typeDescriptor = new TypeDescriptor(fieldMock);
		TypeDescriptor typeDescriptor2 = new TypeDescriptor(fieldMock2);
		doReturn(true).when(conversionServiceMock).canConvert(typeDescriptor, typeDescriptor2);
		doReturn(true).when(conversionServiceMock).canConvert(typeDescriptorMock, typeDescriptor2);
		//Act Statement(s)
		boolean result = target.matches(typeDescriptor, typeDescriptor2);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.TRUE));
			verify(conversionServiceMock).canConvert(typeDescriptor, typeDescriptor2);
			verify(conversionServiceMock).canConvert(typeDescriptorMock, typeDescriptor2);
		});
	}

	//Sapient generated method id: ${e69d771b-c54b-37f2-a5b7-a3efe78a0bb5}, hash: AB853253B36AE9A3A4A95ADA73A56B32
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
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertiesCharSequenceToObjectConverter target = new ConfigurationPropertiesCharSequenceToObjectConverter(conversionServiceMock);
		TypeDescriptor typeDescriptor = new TypeDescriptor(fieldMock);
		TypeDescriptor typeDescriptor2 = new TypeDescriptor(fieldMock2);
		doReturn(true).when(conversionServiceMock).canConvert(typeDescriptor, typeDescriptor2);
		doReturn(false).when(conversionServiceMock).canConvert(typeDescriptorMock, typeDescriptor2);
		//Act Statement(s)
		boolean result = target.matches(typeDescriptor, typeDescriptor2);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(conversionServiceMock).canConvert(typeDescriptor, typeDescriptor2);
			verify(conversionServiceMock).canConvert(typeDescriptorMock, typeDescriptor2);
		});
	}

	//Sapient generated method id: ${bcac3615-eb3e-3c15-88e5-1c9363f33c9d}, hash: CE237D2F8F0BD5F788D845A31F7AD5D1
	@Disabled()
	@Test()
	void convertTest() {
		//Arrange Statement(s)
		ConfigurationPropertiesCharSequenceToObjectConverter target = new ConfigurationPropertiesCharSequenceToObjectConverter(conversionServiceMock);
		Object object = new Object();
		TypeDescriptor typeDescriptorMock2 = mock(TypeDescriptor.class);
		doReturn(object).when(conversionServiceMock).convert("convert_object1", typeDescriptorMock, typeDescriptorMock2);
		Object objectMock = mock(Object.class, "convert_object1");
		TypeDescriptor typeDescriptorMock3 = mock(TypeDescriptor.class);
		//Act Statement(s)
		Object result = target.convert(objectMock, typeDescriptorMock3, typeDescriptorMock2);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(object));
			verify(conversionServiceMock).convert("convert_object1", typeDescriptorMock, typeDescriptorMock2);
		});
	}
}
