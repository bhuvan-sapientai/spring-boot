package org.springframework.boot.ssl.pem;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.mockito.stubbing.Answer;

import java.security.PrivateKey;

import org.mockito.MockedStatic;

import java.security.cert.X509Certificate;

import org.springframework.util.function.ThrowingSupplier;
import org.springframework.util.function.SingletonSupplier;
import org.springframework.util.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LoadedPemSslStoreSapientGeneratedTest {

	private final PemSslStoreDetails detailsMock = mock(PemSslStoreDetails.class, "details");

	private final SingletonSupplier singletonSupplierMock = mock(SingletonSupplier.class);

	private final SingletonSupplier singletonSupplierMock2 = mock(SingletonSupplier.class);

	private final ThrowingSupplier throwingSupplierMock = mock(ThrowingSupplier.class);

	private final ThrowingSupplier throwingSupplierMock2 = mock(ThrowingSupplier.class);

	//Sapient generated method id: ${335ebe31-75d6-3bfc-bc95-7f09d55b4633}
	@Disabled()
	@Test()
	void typeTest() {
		//Arrange Statement(s)
		try (MockedStatic<SingletonSupplier> singletonSupplier = mockStatic(SingletonSupplier.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(detailsMock, "Details must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			singletonSupplier.when(() -> SingletonSupplier.of(throwingSupplierMock)).thenReturn(singletonSupplierMock);
			singletonSupplier.when(() -> SingletonSupplier.of(throwingSupplierMock2)).thenReturn(singletonSupplierMock2);
			LoadedPemSslStore target = new LoadedPemSslStore(detailsMock);
			doReturn("return_of_type1").when(detailsMock).type();
			//Act Statement(s)
			String result = target.type();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_type1"));
				_assert.verify(() -> Assert.notNull(detailsMock, "Details must not be null"), atLeast(1));
				singletonSupplier.verify(() -> SingletonSupplier.of(throwingSupplierMock), atLeast(1));
				singletonSupplier.verify(() -> SingletonSupplier.of(throwingSupplierMock2), atLeast(1));
				verify(detailsMock).type();
			});
		}
	}

	//Sapient generated method id: ${ec59c5ac-f1f6-3928-9af9-b8488352f9a0}
	@Disabled()
	@Test()
	void aliasTest() {
		//Arrange Statement(s)
		try (MockedStatic<SingletonSupplier> singletonSupplier = mockStatic(SingletonSupplier.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(detailsMock, "Details must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			singletonSupplier.when(() -> SingletonSupplier.of(throwingSupplierMock)).thenReturn(singletonSupplierMock);
			singletonSupplier.when(() -> SingletonSupplier.of(throwingSupplierMock2)).thenReturn(singletonSupplierMock2);
			LoadedPemSslStore target = new LoadedPemSslStore(detailsMock);
			doReturn("return_of_alias1").when(detailsMock).alias();
			//Act Statement(s)
			String result = target.alias();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_alias1"));
				_assert.verify(() -> Assert.notNull(detailsMock, "Details must not be null"), atLeast(1));
				singletonSupplier.verify(() -> SingletonSupplier.of(throwingSupplierMock), atLeast(1));
				singletonSupplier.verify(() -> SingletonSupplier.of(throwingSupplierMock2), atLeast(1));
				verify(detailsMock).alias();
			});
		}
	}

	//Sapient generated method id: ${899b6ea8-9c20-314d-8577-61ec64186c46}
	@Disabled()
	@Test()
	void passwordTest() {
		//Arrange Statement(s)
		try (MockedStatic<SingletonSupplier> singletonSupplier = mockStatic(SingletonSupplier.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(detailsMock, "Details must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			singletonSupplier.when(() -> SingletonSupplier.of(throwingSupplierMock)).thenReturn(singletonSupplierMock);
			singletonSupplier.when(() -> SingletonSupplier.of(throwingSupplierMock2)).thenReturn(singletonSupplierMock2);
			LoadedPemSslStore target = new LoadedPemSslStore(detailsMock);
			doReturn("return_of_password1").when(detailsMock).password();
			//Act Statement(s)
			String result = target.password();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_password1"));
				_assert.verify(() -> Assert.notNull(detailsMock, "Details must not be null"), atLeast(1));
				singletonSupplier.verify(() -> SingletonSupplier.of(throwingSupplierMock), atLeast(1));
				singletonSupplier.verify(() -> SingletonSupplier.of(throwingSupplierMock2), atLeast(1));
				verify(detailsMock).password();
			});
		}
	}

	//Sapient generated method id: ${1f8e3206-48c7-3ad4-83d5-0eb8d8102104}
	@Disabled()
	@Test()
	void certificatesTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<SingletonSupplier> singletonSupplier = mockStatic(SingletonSupplier.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(detailsMock, "Details must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			singletonSupplier.when(() -> SingletonSupplier.of(throwingSupplierMock)).thenReturn(singletonSupplierMock);
			singletonSupplier.when(() -> SingletonSupplier.of(throwingSupplierMock2)).thenReturn(singletonSupplierMock2);
			LoadedPemSslStore target = new LoadedPemSslStore(detailsMock);
			//Act Statement(s)
			List<X509Certificate> result = target.certificates();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				_assert.verify(() -> Assert.notNull(detailsMock, "Details must not be null"), atLeast(1));
				singletonSupplier.verify(() -> SingletonSupplier.of(throwingSupplierMock), atLeast(1));
				singletonSupplier.verify(() -> SingletonSupplier.of(throwingSupplierMock2), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${77d97ce0-eb65-32c6-8fbb-3f6f90703e8d}
	@Disabled()
	@Test()
	void privateKeyTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<SingletonSupplier> singletonSupplier = mockStatic(SingletonSupplier.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(detailsMock, "Details must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			singletonSupplier.when(() -> SingletonSupplier.of(throwingSupplierMock)).thenReturn(singletonSupplierMock);
			singletonSupplier.when(() -> SingletonSupplier.of(throwingSupplierMock2)).thenReturn(singletonSupplierMock2);
			LoadedPemSslStore target = new LoadedPemSslStore(detailsMock);
			//Act Statement(s)
			PrivateKey result = target.privateKey();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.notNull(detailsMock, "Details must not be null"), atLeast(1));
				singletonSupplier.verify(() -> SingletonSupplier.of(throwingSupplierMock), atLeast(1));
				singletonSupplier.verify(() -> SingletonSupplier.of(throwingSupplierMock2), atLeast(1));
			});
		}
	}
}
