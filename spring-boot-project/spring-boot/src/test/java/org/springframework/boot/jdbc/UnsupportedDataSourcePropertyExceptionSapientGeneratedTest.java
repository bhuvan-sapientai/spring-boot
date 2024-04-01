package org.springframework.boot.jdbc;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UnsupportedDataSourcePropertyExceptionSapientGeneratedTest {

	//Sapient generated method id: ${2eb65307-0159-3ac7-a896-79cf0425d7aa}, hash: 11DB3C05203745DD10597AD4CDC9E76F
	@Test()
	void throwIfWhenTestThrowsUnsupportedDataSourcePropertyException() {
		/* Branches:
		 * (test) : true
		 */
		//Arrange Statement(s)
		Supplier messageMock = mock(Supplier.class);
		doReturn("return_of_get1").when(messageMock).get();
		UnsupportedDataSourcePropertyException unsupportedDataSourcePropertyException = new UnsupportedDataSourcePropertyException("return_of_get1");
		//Act Statement(s)
		final UnsupportedDataSourcePropertyException result = assertThrows(UnsupportedDataSourcePropertyException.class, () -> {
			UnsupportedDataSourcePropertyException.throwIf(true, messageMock);
		});

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getMessage(), equalTo(unsupportedDataSourcePropertyException.getMessage()));
			verify(messageMock).get();
		});
	}

	//Sapient generated method id: ${174696ff-e78d-304f-9775-1eed884c2e08}, hash: 358383760538A6EF370359717AF135F7
	@Test()
	void throwIfWhenNotTest() {
		/* Branches:
		 * (test) : false
		 */
		//Arrange Statement(s)
		Supplier supplierMock = mock(Supplier.class);

		//Act Statement(s)
		UnsupportedDataSourcePropertyException.throwIf(false, supplierMock);
	}
}
