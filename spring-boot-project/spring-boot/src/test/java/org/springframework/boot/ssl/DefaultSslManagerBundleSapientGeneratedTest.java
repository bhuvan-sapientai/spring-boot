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
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.doThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DefaultSslManagerBundleSapientGeneratedTest {

	private final SslStoreBundle storeBundleMock = mock(SslStoreBundle.class, "SslStoreBundle.NONE");

	private final SslBundleKey keyMock = mock(SslBundleKey.class, "key");

	private final RuntimeException runtimeExceptionMock = mock(RuntimeException.class);

	//Sapient generated method id: ${b403da3e-1240-318c-b973-27e1e0481967}
	@Disabled()
	@Test()
	void getKeyManagerFactoryWhenPasswordIsNullAndPasswordIsNotNull() throws Exception {
		/* Branches:
		 * (alias != null) : true
		 * (password != null) : false
		 * (password != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, keyMock);
		//TODO: Needs to return real value
		doReturn(null).when(storeBundleMock).getKeyStore();
		doNothing().when(keyMock).assertContainsAlias((KeyStore) null);
		doReturn("return_of_getAlias1").when(keyMock).getAlias();
		doReturn(null).when(keyMock).getPassword();
		doReturn("A").when(storeBundleMock).getKeyStorePassword();
		//Act Statement(s)
		KeyManagerFactory result = target.getKeyManagerFactory();
		KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance("SunX509");
		AliasKeyManagerFactory aliasKeyManagerFactory = new AliasKeyManagerFactory(keyManagerFactory, "return_of_getAlias1", "SunX509");
		//Assert statement(s)
		//TODO: Please implement equals method in AliasKeyManagerFactory for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, equalTo(aliasKeyManagerFactory));
			verify(storeBundleMock).getKeyStore();
			verify(keyMock).assertContainsAlias((KeyStore) null);
			verify(keyMock).getAlias();
			verify(keyMock).getPassword();
			verify(storeBundleMock).getKeyStorePassword();
		});
	}

	//Sapient generated method id: ${50f60702-5471-30c1-abf9-177b9d283d4f}
	@Disabled()
	@Test()
	void getKeyManagerFactoryWhenPasswordIsNull() throws Exception {
		/* Branches:
		 * (alias != null) : true
		 * (password != null) : false
		 * (password != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, keyMock);
		//TODO: Needs to return real value
		doReturn(null).when(storeBundleMock).getKeyStore();
		doNothing().when(keyMock).assertContainsAlias((KeyStore) null);
		doReturn("return_of_getAlias1").when(keyMock).getAlias();
		doReturn(null).when(keyMock).getPassword();
		doReturn(null).when(storeBundleMock).getKeyStorePassword();
		//Act Statement(s)
		KeyManagerFactory result = target.getKeyManagerFactory();
		KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance("SunX509");
		AliasKeyManagerFactory aliasKeyManagerFactory = new AliasKeyManagerFactory(keyManagerFactory, "return_of_getAlias1", "SunX509");
		//Assert statement(s)
		//TODO: Please implement equals method in AliasKeyManagerFactory for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, equalTo(aliasKeyManagerFactory));
			verify(storeBundleMock).getKeyStore();
			verify(keyMock).assertContainsAlias((KeyStore) null);
			verify(keyMock).getAlias();
			verify(keyMock).getPassword();
			verify(storeBundleMock).getKeyStorePassword();
		});
	}

	//Sapient generated method id: ${d5c3e3b1-de73-323b-84a3-8ade7c84ba19}
	@Disabled()
	@Test()
	void getKeyManagerFactoryWhenPasswordIsNotNullAndPasswordIsNotNull() throws Exception {
		/* Branches:
		 * (alias != null) : false
		 * (password != null) : true
		 * (password != null) : true
		 */
		//Arrange Statement(s)
		SslBundleKey sslBundleKey = SslBundleKey.of("password1");
		DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, sslBundleKey);
		//TODO: Needs to return real value
		doReturn(null).when(storeBundleMock).getKeyStore();
		//Act Statement(s)
		KeyManagerFactory result = target.getKeyManagerFactory();
		KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance("SunX509");
		//Assert statement(s)
		//TODO: Please implement equals method in KeyManagerFactory for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, equalTo(keyManagerFactory));
			verify(storeBundleMock).getKeyStore();
		});
	}

	//Sapient generated method id: ${2507d4f7-33d0-350f-86fc-2e87d4bca71c}
	@Test()
	void getKeyManagerFactoryWhenCaughtRuntimeExceptionThrowsRuntimeException() throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException {
		/* Branches:
		 * (alias != null) : true
		 * (password != null) : true
		 * (password != null) : true
		 * (catch-exception (RuntimeException)) : true
		 */
		//Arrange Statement(s)
		DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, keyMock);
		//TODO: Needs to return real value
		doReturn(null).when(storeBundleMock).getKeyStore();
		doNothing().when(keyMock).assertContainsAlias((KeyStore) null);
		doReturn("return_of_getAlias1").when(keyMock).getAlias();
		doThrow(runtimeExceptionMock).when(keyMock).getPassword();
		//Act Statement(s)
		final RuntimeException result = assertThrows(RuntimeException.class, () -> {
			target.getKeyManagerFactory();
		});
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(storeBundleMock).getKeyStore();
			verify(keyMock).assertContainsAlias((KeyStore) null);
			verify(keyMock).getAlias();
			verify(keyMock).getPassword();
		});
	}

	//Sapient generated method id: ${42503780-7fc1-3c2a-b9c0-1aa22e002e62}
	@Test()
	void getKeyManagerFactoryWhenPasswordIsNotNullAndCaughtExceptionThrowsIllegalStateException() throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException {
		/* Branches:
		 * (alias != null) : true
		 * (password != null) : false
		 * (password != null) : true
		 * (catch-exception (Exception)) : true
		 */
		//Arrange Statement(s)
		DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, keyMock);
		//TODO: Needs to return real value
		doReturn(null).when(storeBundleMock).getKeyStore();
		doNothing().when(keyMock).assertContainsAlias((KeyStore) null);
		doReturn("return_of_getAlias1").when(keyMock).getAlias();
		doThrow(runtimeExceptionMock).when(keyMock).getPassword();
		Exception exception = new Exception("String");
		IllegalStateException illegalStateException = new IllegalStateException("Could not load key manager factory: String", exception);
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
			verify(keyMock).assertContainsAlias((KeyStore) null);
			verify(keyMock).getAlias();
			verify(keyMock).getPassword();
		});
	}

	//Sapient generated method id: ${a4fa04a3-3d8f-3a2f-b797-6af854498e3d}
	@Test()
	void getKeyManagerFactoryWhenPasswordIsNullAndCaughtExceptionThrowsIllegalStateException() throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException {
		/* Branches:
		 * (alias != null) : true
		 * (password != null) : false
		 * (password != null) : false
		 * (catch-exception (Exception)) : true
		 */
		//Arrange Statement(s)
		DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, keyMock);
		//TODO: Needs to return real value
		doReturn(null).when(storeBundleMock).getKeyStore();
		doNothing().when(keyMock).assertContainsAlias((KeyStore) null);
		doReturn("return_of_getAlias1").when(keyMock).getAlias();
		doThrow(runtimeExceptionMock).when(keyMock).getPassword();
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
			verify(keyMock).assertContainsAlias((KeyStore) null);
			verify(keyMock).getAlias();
			verify(keyMock).getPassword();
		});
	}

	//Sapient generated method id: ${7a93cdeb-cd67-387f-abb0-c170a677469d}
	@Test()
	void getTrustManagerFactoryTest() throws Exception {
		//Arrange Statement(s)
		SslBundleKey sslBundleKey = SslBundleKey.of("password1");
		DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, sslBundleKey);
		//TODO: Needs to return real value
		doReturn(null).when(storeBundleMock).getTrustStore();
		//Act Statement(s)
		TrustManagerFactory result = target.getTrustManagerFactory();
		TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX");
		//Assert statement(s)
		//TODO: Please implement equals method in TrustManagerFactory for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, equalTo(trustManagerFactory));
			verify(storeBundleMock).getTrustStore();
		});
	}

	//Sapient generated method id: ${61133386-0872-3d39-bf83-6899725a036c}
	@Test()
	void getTrustManagerFactoryWhenCaughtExceptionThrowsIllegalStateException() throws KeyStoreException {
		/* Branches:
		 * (catch-exception (Exception)) : true
		 */
		//Arrange Statement(s)
		SslBundleKey sslBundleKey = SslBundleKey.of("password1");
		DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, sslBundleKey);
		//TODO: Needs to return real value
		doReturn(null).when(storeBundleMock).getTrustStore();
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

	//Sapient generated method id: ${7f36c4a2-eb8e-3ea9-a2db-fa5534af3737}
	@Test()
	void getKeyManagerFactoryInstanceTest() throws NoSuchAlgorithmException {
		//Arrange Statement(s)
		SslBundleKey sslBundleKey = SslBundleKey.of("password1");
		DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, sslBundleKey);
		//Act Statement(s)
		KeyManagerFactory result = target.getKeyManagerFactoryInstance("SunX509");
		KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance("SunX509");
		//Assert statement(s)
		//TODO: Please implement equals method in KeyManagerFactory for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(keyManagerFactory)));
	}

	//Sapient generated method id: ${688d4816-af85-3886-b3be-3776adec2c3c}
	@Test()
	void getTrustManagerFactoryInstanceTest() throws NoSuchAlgorithmException {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SslBundleKey sslBundleKey = SslBundleKey.of("password1");
		DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, sslBundleKey);
		//Act Statement(s)
		TrustManagerFactory result = target.getTrustManagerFactoryInstance("TLS");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}
}
