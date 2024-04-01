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
class DelimitedStringToCollectionConverterSapientGeneratedTest {

	private final ConversionService conversionServiceMock = mock(ConversionService.class, "conversionService");

	private final TypeDescriptor targetTypeMock = mock(TypeDescriptor.class);

	private final TypeDescriptor typeDescriptorMock = mock(TypeDescriptor.class);

	private final TypeDescriptor typeDescriptorMock2 = mock(TypeDescriptor.class);

	private final TypeDescriptor typeDescriptorMock3 = mock(TypeDescriptor.class);

	//Sapient generated method id: ${a09cc112-2d6f-3df0-a3e4-2475492f0d41}, hash: 0A4453F7A631C8138430391522C0F0F2
	@Test()
	void getConvertibleTypesTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(conversionServiceMock, "ConversionService must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DelimitedStringToCollectionConverter target = new DelimitedStringToCollectionConverter(conversionServiceMock);
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

	//Sapient generated method id: ${8e47bbfc-c50d-3f07-b0a0-e5af97509c4f}, hash: 6A99020FC553B0AB22F41B4AC92B6A79
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
			DelimitedStringToCollectionConverter target = new DelimitedStringToCollectionConverter(conversionServiceMock);
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

	//Sapient generated method id: ${95a3dcd9-339e-3fda-8372-6df2fc1f3033}, hash: BE3294325302130A8CBEFAE703811343
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
			DelimitedStringToCollectionConverter target = new DelimitedStringToCollectionConverter(conversionServiceMock);
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

	//Sapient generated method id: ${380b1ace-47e2-39bb-afcc-8fcbdaf257c0}, hash: 8190CFC2D51842F4B0012A061FAC9E0E
	@Test()
	void convertWhenSourceIsNull() {
		/* Branches:
		 * (source == null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(conversionServiceMock, "ConversionService must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DelimitedStringToCollectionConverter target = new DelimitedStringToCollectionConverter(conversionServiceMock);
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

	//Sapient generated method id: ${780e54eb-6a66-3424-bfeb-905ab2c785b5}, hash: B2EB0A16703EE4A81C2C8F0242CBE3D9
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
			DelimitedStringToCollectionConverter target = new DelimitedStringToCollectionConverter(conversionServiceMock);
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
