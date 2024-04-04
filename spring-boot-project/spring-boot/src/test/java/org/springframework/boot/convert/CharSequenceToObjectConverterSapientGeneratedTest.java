/*
 * Copyright 2012-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.convert;

import org.junit.jupiter.api.Disabled;
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

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CharSequenceToObjectConverterSapientGeneratedTest {

	private final ConversionService conversionServiceMock = mock(ConversionService.class, "conversionService");

	private final Field fieldMock = mock(Field.class);

	private final Field fieldMock2 = mock(Field.class);

	private final TypeDescriptor typeDescriptorMock = mock(TypeDescriptor.class);

	//Sapient generated method id: ${86dff209-2e07-3a07-86f3-afe748093c3c}, hash: 339FBCD68CEE42BFEFB4B55AC61F2776
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
		CharSequenceToObjectConverter target = new CharSequenceToObjectConverter(conversionServiceMock);
		TypeDescriptor typeDescriptor = new TypeDescriptor(fieldMock);
		TypeDescriptor typeDescriptor2 = new TypeDescriptor(fieldMock2);

		//Act Statement(s)
		boolean result = target.matches(typeDescriptor, typeDescriptor2);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${eba10f31-3797-3e38-a1a2-d20b1605c651}, hash: F3229A51B7582CFF6B97FE319ABFCC24
	@Test()
	@Disabled
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
		CharSequenceToObjectConverter target = new CharSequenceToObjectConverter(conversionServiceMock);
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

	//Sapient generated method id: ${6207393d-bb36-3110-af5f-81048dea6f9b}, hash: BD37955E47FB592E613FD653426A61C4
	@Test()
	@Disabled
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
		CharSequenceToObjectConverter target = new CharSequenceToObjectConverter(conversionServiceMock);
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

	//Sapient generated method id: ${e69d771b-c54b-37f2-a5b7-a3efe78a0bb5}, hash: 56954DBF2539555F8D14DACA799D70C8
	@Test()
	@Disabled
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
		CharSequenceToObjectConverter target = new CharSequenceToObjectConverter(conversionServiceMock);
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

	//Sapient generated method id: ${bcac3615-eb3e-3c15-88e5-1c9363f33c9d}, hash: 57FFCF4BCB94901AD634BB84EEADFD96
	@Test()
	@Disabled
	void convertTest() {
		//Arrange Statement(s)
		CharSequenceToObjectConverter target = new CharSequenceToObjectConverter(conversionServiceMock);
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
