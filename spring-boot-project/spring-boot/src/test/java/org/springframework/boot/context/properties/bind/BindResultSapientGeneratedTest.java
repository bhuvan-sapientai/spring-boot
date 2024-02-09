package org.springframework.boot.context.properties.bind;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import org.mockito.stubbing.Answer;

import org.springframework.util.Assert;

import java.util.function.Function;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.util.function.Consumer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BindResultSapientGeneratedTest {

	//Sapient generated method id: ${1267dafd-c16d-31ce-8bb5-318ea8097120}
	@Test()
	void getWhenThisValueIsNullThrowsNoSuchElementException() throws NoSuchElementException {
		/* Branches:
		 * (this.value == null) : true
		 */
		//Arrange Statement(s)
		BindResult<Object> target = BindResult.of((Object) null);
		NoSuchElementException noSuchElementException = new NoSuchElementException("No value bound");
		//Act Statement(s)
		final NoSuchElementException result = assertThrows(NoSuchElementException.class, () -> {
			target.get();
		});
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getMessage(), equalTo(noSuchElementException.getMessage()));
		});
	}

	//Sapient generated method id: ${e6dd64e6-9004-34b4-a724-da1da86e3427}
	@Test()
	void isBoundWhenThisValueIsNull() {
		/* Branches:
		 * (this.value != null) : false
		 */
		//Arrange Statement(s)
		BindResult<Object> target = BindResult.of((Object) null);
		//Act Statement(s)
		boolean result = target.isBound();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${dbad2b7e-24c7-3cc9-ac5d-104a2a5dcfda}
	@Test()
	void ifBoundWhenThisValueIsNull() {
		/* Branches:
		 * (this.value != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Consumer) null, "Consumer must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			BindResult<Object> target = BindResult.of((Object) null);
			//TODO: Needs initialization with real value
			Consumer consumer = null;
			//Act Statement(s)
			target.ifBound(consumer);
			//Assert statement(s)
			assertAll("result", () -> _assert.verify(() -> Assert.notNull((Consumer) null, "Consumer must not be null"), atLeast(1)));
		}
	}

	//Sapient generated method id: ${74e4065b-c033-33e8-a3d4-093ee8c47c2e}
	@Disabled()
	@Test()
	void mapWhenThisValueIsNull() {
		/* Branches:
		 * (this.value != null) : false
		 */
		//Arrange Statement(s)
		BindResult<Object> bindResultMock = mock(BindResult.class);
		try (MockedStatic<BindResult> bindResult = mockStatic(BindResult.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Function) null, "Mapper must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			bindResult.when(() -> BindResult.of((Object) null)).thenReturn(bindResultMock);
			BindResult<Object> target = BindResult.of((Object) null);
			//TODO: Needs initialization with real value
			Function function = null;
			//Act Statement(s)
			BindResult result = target.map(function);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindResultMock));
				_assert.verify(() -> Assert.notNull((Function) null, "Mapper must not be null"), atLeast(1));
				bindResult.verify(() -> BindResult.of((Object) null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${1ac61eaa-18a1-3d1f-b7cc-50d7ccf85521}
	@Test()
	void orElseWhenThisValueIsNull() {
		/* Branches:
		 * (this.value != null) : false
		 */
		//Arrange Statement(s)
		BindResult<Object> target = BindResult.of((Object) null);
		Object object = new Object();
		//Act Statement(s)
		Object result = target.orElse(object);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(object)));
	}

	//Sapient generated method id: ${444168c3-4331-390f-aa58-703b32bd8917}
	@Test()
	void orElseGetWhenThisValueIsNull() {
		/* Branches:
		 * (this.value != null) : false
		 */
		//Arrange Statement(s)
		BindResult<Object> target = BindResult.of((Object) null);
		Supplier supplier = null;
		//Act Statement(s)
		final NullPointerException result = assertThrows(NullPointerException.class, () -> {
			target.orElseGet(supplier);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${97d0df98-01f0-33f8-89ee-251d3daf4b64}
	@Test()
	void orElseThrowWhenThisValueIsNullThrowsThrowable() throws Throwable {
		/* Branches:
		 * (this.value == null) : true
		 */
		//Arrange Statement(s)
		BindResult<Object> target = BindResult.of((Object) null);
		Supplier supplier = null;
		//Act Statement(s)
		final Throwable result = assertThrows(Throwable.class, () -> {
			target.orElseThrow(supplier);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${57d57d84-5000-3dae-b8ae-1c38bc642ec8}
	@Test()
	void ofWhenValueIsNull() {
		/* Branches:
		 * (value == null) : true
		 */
		//Arrange Statement(s)
		Object object = null;
		//Act Statement(s)
		BindResult result = BindResult.of(object);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${5ddb9e9b-119c-3723-b99f-1c385f211650}
	@Test()
	void ofWhenValueIsNotNull() {
		/* Branches:
		 * (value == null) : false
		 */
		//Arrange Statement(s)
		Object object = new Object();
		//Act Statement(s)
		BindResult result = BindResult.of(object);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
