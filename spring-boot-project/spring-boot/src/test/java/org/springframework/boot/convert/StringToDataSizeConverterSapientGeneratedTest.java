package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.util.unit.DataSize;

import java.util.Set;
import java.util.HashSet;

import org.springframework.util.unit.DataUnit;

import org.mockito.MockedStatic;

import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.util.ObjectUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class StringToDataSizeConverterSapientGeneratedTest {

	private final DataSize dataSizeMock = mock(DataSize.class);

	private final Object objectMock = mock(Object.class, "convert_object1");

	private final TypeDescriptor targetTypeMock = mock(TypeDescriptor.class);

	private final TypeDescriptor typeDescriptorMock = mock(TypeDescriptor.class);

	//Sapient generated method id: ${a09cc112-2d6f-3df0-a3e4-2475492f0d41}
	@Test()
	void getConvertibleTypesTest() {
		//Arrange Statement(s)
		StringToDataSizeConverter target = new StringToDataSizeConverter();

		//Act Statement(s)
		Set<GenericConverter.ConvertiblePair> result = target.getConvertibleTypes();
		GenericConverter.ConvertiblePair genericConverterConvertiblePair = new GenericConverter.ConvertiblePair(String.class, DataSize.class);
		Set<GenericConverter.ConvertiblePair> genericConverterConvertiblePairResultSet = new HashSet<>(Set.of(genericConverterConvertiblePair));

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(genericConverterConvertiblePairResultSet.size()));
			assertThat(result, containsInAnyOrder(genericConverterConvertiblePairResultSet.toArray()));
		});
	}

	//Sapient generated method id: ${ae83d63f-8ac1-36ba-ac4d-103ba00fcbf4}
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
			StringToDataSizeConverter target = new StringToDataSizeConverter();
			//Act Statement(s)
			Object result = target.convert(object, typeDescriptorMock, typeDescriptorMock2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				objectUtils.verify(() -> ObjectUtils.isEmpty(object), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${56568c04-8c71-30f4-be77-6cf7f80ca7c3}
	@Test()
	void convertWhenAnnotationIsNotNull() {
		/* Branches:
		 * (ObjectUtils.isEmpty(source)) : false
		 * (annotation != null) : true  #  inside getDataUnit method
		 */
		//Arrange Statement(s)
		DataSizeUnit dataSizeUnitMock = mock(DataSizeUnit.class);
		try (MockedStatic<DataSize> dataSize = mockStatic(DataSize.class);
			 MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class)) {
			doReturn(dataSizeUnitMock).when(targetTypeMock).getAnnotation(DataSizeUnit.class);
			doReturn(DataUnit.BYTES).when(dataSizeUnitMock).value();
			objectUtils.when(() -> ObjectUtils.isEmpty(objectMock)).thenReturn(false);
			dataSize.when(() -> DataSize.parse("convert_object1", DataUnit.BYTES)).thenReturn(dataSizeMock);
			StringToDataSizeConverter target = new StringToDataSizeConverter();
			//Act Statement(s)
			Object result = target.convert(objectMock, typeDescriptorMock, targetTypeMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(dataSizeMock));
				verify(targetTypeMock).getAnnotation(DataSizeUnit.class);
				verify(dataSizeUnitMock).value();
				objectUtils.verify(() -> ObjectUtils.isEmpty(objectMock), atLeast(1));
				dataSize.verify(() -> DataSize.parse("convert_object1", DataUnit.BYTES), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${802ce6f6-3b94-363b-9ea3-1b9489384e53}
	@Test()
	void convertWhenAnnotationIsNull() {
		/* Branches:
		 * (ObjectUtils.isEmpty(source)) : false
		 * (annotation != null) : false  #  inside getDataUnit method
		 */
		//Arrange Statement(s)
		try (MockedStatic<DataSize> dataSize = mockStatic(DataSize.class);
			 MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class)) {
			doReturn(null).when(targetTypeMock).getAnnotation(DataSizeUnit.class);
			objectUtils.when(() -> ObjectUtils.isEmpty(objectMock)).thenReturn(false);
			dataSize.when(() -> DataSize.parse("convert_object1", (DataUnit) null)).thenReturn(dataSizeMock);
			StringToDataSizeConverter target = new StringToDataSizeConverter();
			//Act Statement(s)
			Object result = target.convert(objectMock, typeDescriptorMock, targetTypeMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(dataSizeMock));
				verify(targetTypeMock).getAnnotation(DataSizeUnit.class);
				objectUtils.verify(() -> ObjectUtils.isEmpty(objectMock), atLeast(1));
				dataSize.verify(() -> DataSize.parse("convert_object1", (DataUnit) null), atLeast(1));
			});
		}
	}
}
