package org.springframework.boot.jdbc;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UnsupportedDataSourcePropertyExceptionSapientGeneratedTest {

	//Sapient generated method id: ${2eb65307-0159-3ac7-a896-79cf0425d7aa}
	@Test()
	void throwIfWhenTestThrowsUnsupportedDataSourcePropertyException() {
		/* Branches:
		 * (test) : true
		 */
		//Arrange Statement(s)
		Supplier supplier = null;
		//Act Statement(s)
		final NullPointerException result = assertThrows(NullPointerException.class, () -> {
			UnsupportedDataSourcePropertyException.throwIf(true, supplier);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${174696ff-e78d-304f-9775-1eed884c2e08}
	@Test()
	void throwIfWhenNotTest() {
		/* Branches:
		 * (test) : false
		 */
		//Arrange Statement(s)
		//TODO: Needs initialization with real value
		Supplier supplier = null;
		//Act Statement(s)
		UnsupportedDataSourcePropertyException.throwIf(false, supplier);
	}
}
