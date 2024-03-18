package org.springframework.boot.ssl;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.KeyStore;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManagerFactory;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DefaultSslManagerBundleSapientGeneratedTest {

	private final SslStoreBundle storeBundleMock = mock(SslStoreBundle.class, "storeBundle");

	private final SslBundleKey keyMock = mock(SslBundleKey.class, "key");

	private final KeyStore keyStoreMock = mock(KeyStore.class);

	//Sapient generated method id: ${b403da3e-1240-318c-b973-27e1e0481967}, hash: 5BAC92A4AAA12B1FB13BACCDCE93BCE2
	@Disabled()
	@Test()
	void getKeyManagerFactoryWhenPasswordIsNullAndPasswordIsNotNull() throws Exception {
		/* Branches:
		 * (alias != null) : true
		 * (password != null) : false
		 * (password != null) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: factory
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, keyMock);
		doReturn(keyStoreMock).when(storeBundleMock).getKeyStore();
		doNothing().when(keyMock).assertContainsAlias(keyStoreMock);
		doReturn("return_of_getAlias1").when(keyMock).getAlias();
		doReturn(null).when(keyMock).getPassword();
		doReturn("A").when(storeBundleMock).getKeyStorePassword();
		//Act Statement(s)
		KeyManagerFactory result = target.getKeyManagerFactory();
		//Assert statement(s)
		//TODO: Please implement equals method in AliasKeyManagerFactory for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(storeBundleMock).getKeyStore();
			verify(keyMock).assertContainsAlias(keyStoreMock);
			verify(keyMock).getAlias();
			verify(keyMock).getPassword();
			verify(storeBundleMock).getKeyStorePassword();
		});
	}

	//Sapient generated method id: ${50f60702-5471-30c1-abf9-177b9d283d4f}, hash: 6ADBC383A4F805D016893E8255B8749F
	@Disabled()
	@Test()
	void getKeyManagerFactoryWhenPasswordIsNull() throws Exception {
		/* Branches:
		 * (alias != null) : true
		 * (password != null) : false
		 * (password != null) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: factory
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, keyMock);
		doReturn(keyStoreMock).when(storeBundleMock).getKeyStore();
		doNothing().when(keyMock).assertContainsAlias(keyStoreMock);
		doReturn("return_of_getAlias1").when(keyMock).getAlias();
		doReturn(null).when(keyMock).getPassword();
		doReturn(null).when(storeBundleMock).getKeyStorePassword();
		//Act Statement(s)
		KeyManagerFactory result = target.getKeyManagerFactory();
		//Assert statement(s)
		//TODO: Please implement equals method in AliasKeyManagerFactory for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(storeBundleMock).getKeyStore();
			verify(keyMock).assertContainsAlias(keyStoreMock);
			verify(keyMock).getAlias();
			verify(keyMock).getPassword();
			verify(storeBundleMock).getKeyStorePassword();
		});
	}

	//Sapient generated method id: ${d5c3e3b1-de73-323b-84a3-8ade7c84ba19}, hash: 21B430AB0C239A9DB56398C6897053A7
	@Disabled()
	@Test()
	void getKeyManagerFactoryWhenPasswordIsNotNullAndPasswordIsNotNull() throws Exception {
		/* Branches:
		 * (alias != null) : false
		 * (password != null) : true
		 * (password != null) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: factory
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, keyMock);
		doReturn(keyStoreMock).when(storeBundleMock).getKeyStore();
		doNothing().when(keyMock).assertContainsAlias(keyStoreMock);
		doReturn(null).when(keyMock).getAlias();
		doReturn("A").when(keyMock).getPassword();
		//Act Statement(s)
		KeyManagerFactory result = target.getKeyManagerFactory();
		//Assert statement(s)
		//TODO: Please implement equals method in KeyManagerFactory for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(storeBundleMock).getKeyStore();
			verify(keyMock).assertContainsAlias(keyStoreMock);
			verify(keyMock).getAlias();
			verify(keyMock).getPassword();
		});
	}

	//Sapient generated method id: ${2507d4f7-33d0-350f-86fc-2e87d4bca71c}, hash: 5114782A5292D4637B0930758E41E606
	@Test()
	void getKeyManagerFactoryWhenCaughtRuntimeExceptionThrowsRuntimeException() throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException {
		/* Branches:
		 * (alias != null) : true
		 * (password != null) : true
		 * (password != null) : true
		 * (catch-exception (RuntimeException)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: factory
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, keyMock);
		doReturn(keyStoreMock).when(storeBundleMock).getKeyStore();
		doNothing().when(keyMock).assertContainsAlias(keyStoreMock);
		doReturn("return_of_getAlias1").when(keyMock).getAlias();
		doReturn("A").when(keyMock).getPassword();
		//Act Statement(s)
		final RuntimeException result = assertThrows(RuntimeException.class, () -> {
			target.getKeyManagerFactory();
		});
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(storeBundleMock).getKeyStore();
			verify(keyMock).assertContainsAlias(keyStoreMock);
			verify(keyMock).getAlias();
			verify(keyMock).getPassword();
		});
	}

	//Sapient generated method id: ${42503780-7fc1-3c2a-b9c0-1aa22e002e62}, hash: DEE99C5B93532AB5C7AE6E8BD94FD3AD
	@Disabled()
	@Test()
	void getKeyManagerFactoryWhenPasswordIsNotNullAndCaughtExceptionThrowsIllegalStateException() throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException {
		/* Branches:
		 * (alias != null) : true
		 * (password != null) : false
		 * (password != null) : true
		 * (catch-exception (Exception)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: factory
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, keyMock);
		doReturn(keyStoreMock).when(storeBundleMock).getKeyStore();
		doNothing().when(keyMock).assertContainsAlias(keyStoreMock);
		doReturn("return_of_getAlias1").when(keyMock).getAlias();
		doReturn(null).when(keyMock).getPassword();
		doReturn("A").when(storeBundleMock).getKeyStorePassword();
		Exception exception = new Exception("B");
		IllegalStateException illegalStateException = new IllegalStateException("Could not load key manager factory: B", exception);
		//Act Statement(s)
		final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
			target.getKeyManagerFactory();
		});
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
			assertThat(result.getCause(), is(instanceOf(exception.getClass())));
			verify(storeBundleMock).getKeyStore();
			verify(keyMock).assertContainsAlias(keyStoreMock);
			verify(keyMock).getAlias();
			verify(keyMock).getPassword();
			verify(storeBundleMock).getKeyStorePassword();
		});
	}

	//Sapient generated method id: ${a4fa04a3-3d8f-3a2f-b797-6af854498e3d}, hash: 5EF6CC787B120F3CC31F4946269DC89C
	@Disabled()
	@Test()
	void getKeyManagerFactoryWhenPasswordIsNullAndCaughtExceptionThrowsIllegalStateException() throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException {
		/* Branches:
		 * (alias != null) : true
		 * (password != null) : false
		 * (password != null) : false
		 * (catch-exception (Exception)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: factory
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, keyMock);
		doReturn(keyStoreMock).when(storeBundleMock).getKeyStore();
		doNothing().when(keyMock).assertContainsAlias(keyStoreMock);
		doReturn("return_of_getAlias1").when(keyMock).getAlias();
		doReturn(null).when(keyMock).getPassword();
		doReturn(null).when(storeBundleMock).getKeyStorePassword();
		Exception exception = new Exception("A");
		IllegalStateException illegalStateException = new IllegalStateException("Could not load key manager factory: A", exception);
		//Act Statement(s)
		final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
			target.getKeyManagerFactory();
		});
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
			assertThat(result.getCause(), is(instanceOf(exception.getClass())));
			verify(storeBundleMock).getKeyStore();
			verify(keyMock).assertContainsAlias(keyStoreMock);
			verify(keyMock).getAlias();
			verify(keyMock).getPassword();
			verify(storeBundleMock).getKeyStorePassword();
		});
	}

	//Sapient generated method id: ${7a93cdeb-cd67-387f-abb0-c170a677469d}, hash: C4508F13076E507DCA1BA90E46999554
	@Disabled()
	@Test()
	void getTrustManagerFactoryTest() throws Exception {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: factory
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, keyMock);
		doReturn(keyStoreMock).when(storeBundleMock).getTrustStore();
		//Act Statement(s)
		TrustManagerFactory result = target.getTrustManagerFactory();
		//Assert statement(s)
		//TODO: Please implement equals method in TrustManagerFactory for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(storeBundleMock).getTrustStore();
		});
	}

	//Sapient generated method id: ${61133386-0872-3d39-bf83-6899725a036c}, hash: A1FE6E544B12394E0359EF3A9BCBD8AB
	@Disabled()
	@Test()
	void getTrustManagerFactoryWhenCaughtExceptionThrowsIllegalStateException() throws KeyStoreException {
		/* Branches:
		 * (catch-exception (Exception)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: factory
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, keyMock);
		doReturn(keyStoreMock).when(storeBundleMock).getTrustStore();
		Exception exception = new Exception("A");
		IllegalStateException illegalStateException = new IllegalStateException("Could not load trust manager factory: A", exception);
		//Act Statement(s)
		final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
			target.getTrustManagerFactory();
		});
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
			assertThat(result.getCause(), is(instanceOf(exception.getClass())));
			verify(storeBundleMock).getTrustStore();
		});
	}

	//Sapient generated method id: ${7f36c4a2-eb8e-3ea9-a2db-fa5534af3737}, hash: 100013A5AF211AAEE3C6B182D81804D0
	@Disabled()
	@Test()
	void getKeyManagerFactoryInstanceTest() throws NoSuchAlgorithmException {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SslBundleKey sslBundleKey = SslBundleKey.of("password1");
		DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, sslBundleKey);
		//Act Statement(s)
		KeyManagerFactory result = target.getKeyManagerFactoryInstance("<valid_algorithm_value>");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${688d4816-af85-3886-b3be-3776adec2c3c}, hash: E9765E62324F7D43ED9103FF48D8D2A0
	@Disabled()
	@Test()
	void getTrustManagerFactoryInstanceTest() throws NoSuchAlgorithmException {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SslBundleKey sslBundleKey = SslBundleKey.of("password1");
		DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, sslBundleKey);
		//Act Statement(s)
		TrustManagerFactory result = target.getTrustManagerFactoryInstance("RSA");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
