package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import org.springframework.core.convert.ConversionService;

import java.util.Set;

import org.springframework.util.Assert;

import java.util.HashSet;

import org.mockito.MockedStatic;

import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.core.convert.TypeDescriptor;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DelimitedStringToArrayConverterSapientGeneratedTest {

	private final ConversionService conversionServiceMock = mock(ConversionService.class, "conversionService");

	private final TypeDescriptor targetTypeMock = mock(TypeDescriptor.class);

	private final TypeDescriptor typeDescriptorMock = mock(TypeDescriptor.class);

	private final TypeDescriptor typeDescriptorMock2 = mock(TypeDescriptor.class);

	private final TypeDescriptor typeDescriptorMock3 = mock(TypeDescriptor.class);

	//Sapient generated method id: ${a09cc112-2d6f-3df0-a3e4-2475492f0d41}
	@Test()
	void getConvertibleTypesTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(conversionServiceMock, "ConversionService must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DelimitedStringToArrayConverter target = new DelimitedStringToArrayConverter(conversionServiceMock);
			//Act Statement(s)
			Set<GenericConverter.ConvertiblePair> result = target.getConvertibleTypes();
			GenericConverter.ConvertiblePair genericConverterConvertiblePair = new GenericConverter.ConvertiblePair(String.class, Object[].class);
			Set<GenericConverter.ConvertiblePair> genericConverterConvertiblePairResultSet = new HashSet<>(Set.of(genericConverterConvertiblePair));
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(genericConverterConvertiblePairResultSet.size()));
				assertThat(result, containsInAnyOrder(genericConverterConvertiblePairResultSet.toArray()));
				_assert.verify(() -> Assert.notNull(conversionServiceMock, "ConversionService must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${8e47bbfc-c50d-3f07-b0a0-e5af97509c4f}
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

	//Sapient generated method id: ${95a3dcd9-339e-3fda-8372-6df2fc1f3033}
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

	//Sapient generated method id: ${380b1ace-47e2-39bb-afcc-8fcbdaf257c0}
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

	//Sapient generated method id: ${780e54eb-6a66-3424-bfeb-905ab2c785b5}
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
			Object object = new Object();
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(object));
				_assert.verify(() -> Assert.notNull(conversionServiceMock, "ConversionService must not be null"), atLeast(1));
			});
		}
	}
}
