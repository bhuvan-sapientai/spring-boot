package org.springframework.boot.web.server;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.ssl.NoSuchSslBundleException;
import org.springframework.boot.ssl.SslBundleKey;

import org.mockito.stubbing.Answer;

import org.springframework.boot.ssl.SslOptions;
import org.springframework.util.StringUtils;
import org.springframework.util.Assert;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import org.springframework.boot.ssl.SslBundles;
import org.springframework.boot.ssl.SslBundle;
import org.springframework.boot.ssl.SslStoreBundle;
import org.springframework.boot.ssl.SslManagerBundle;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class WebServerSslBundleSapientGeneratedTest {

	private final SslBundleKey sslBundleKeyMock = mock(SslBundleKey.class);

	private final SslBundle sslBundleMock = mock(SslBundle.class);

	private final SslBundles sslBundlesMock = mock(SslBundles.class);

	private final SslManagerBundle sslManagerBundleMock = mock(SslManagerBundle.class);

	private final SslOptions sslOptionsMock = mock(SslOptions.class);

	//Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}
	@Test()
	void getTest() throws NoSuchSslBundleException {
		//Arrange Statement(s)
		Ssl sslMock = mock(Ssl.class);
		try (MockedStatic<WebServerSslBundle> webServerSslBundle = mockStatic(WebServerSslBundle.class, CALLS_REAL_METHODS)) {
			webServerSslBundle.when(() -> WebServerSslBundle.get(sslMock, (SslBundles) null)).thenReturn(sslBundleMock);
			//Act Statement(s)
			SslBundle result = WebServerSslBundle.get(sslMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(sslBundleMock));
				webServerSslBundle.verify(() -> WebServerSslBundle.get(sslMock, (SslBundles) null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${7e596f66-86dc-3525-a3f8-a69770d24140}
	@Disabled()
	@Test()
	void get1WhenSslBundlesIsNotNull() throws NoSuchSslBundleException {
		/* Branches:
		 * (StringUtils.hasText(bundleName)) : true
		 * (sslBundles != null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<Ssl> ssl = mockStatic(Ssl.class)) {
			doReturn(sslBundleMock).when(sslBundlesMock).getBundle("A");
			Ssl ssl2 = new Ssl();
			ssl2.setKeyPassword("keyPassword1");
			ssl2.setBundle("A");
			ssl.when(() -> Ssl.isEnabled(ssl2)).thenReturn(false);
			_assert.when(() -> Assert.state(false, "SSL is not enabled")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			SslBundle result = WebServerSslBundle.get(ssl2, sslBundlesMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(sslBundleMock));
				verify(sslBundlesMock).getBundle("A");
				ssl.verify(() -> Ssl.isEnabled(ssl2), atLeast(1));
				_assert.verify(() -> Assert.state(false, "SSL is not enabled"), atLeast(1));
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${6223bc5f-08f9-3dcd-a6f7-2a176334023f}
	@Test()
	void get1WhenSslBundlesIsNullThrowsNullPointerException() throws NoSuchSslBundleException {
		/* Branches:
		 * (StringUtils.hasText(bundleName)) : true
		 * (sslBundles != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<Ssl> ssl = mockStatic(Ssl.class)) {
			Ssl ssl2 = new Ssl();
			ssl2.setKeyPassword("keyPassword1");
			ssl2.setBundle("A");
			ssl.when(() -> Ssl.isEnabled(ssl2)).thenReturn(false);
			_assert.when(() -> Assert.state(false, "SSL is not enabled")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			SslBundles sslBundles = null;
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				WebServerSslBundle.get(ssl2, sslBundles);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				ssl.verify(() -> Ssl.isEnabled(ssl2), atLeast(1));
				_assert.verify(() -> Assert.state(false, "SSL is not enabled"), atLeast(1));
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${fe128477-f872-3a66-877b-961ef6af9fbf}
	@Test()
	void get1WhenHasPemTrustStorePropertiesSsl() throws NoSuchSslBundleException {
		/* Branches:
		 * (StringUtils.hasText(bundleName)) : false
		 * (Ssl.isEnabled(ssl)) : true  #  inside hasPemKeyStoreProperties method
		 * (ssl.getCertificate() != null) : true  #  inside hasPemKeyStoreProperties method
		 * (ssl.getCertificatePrivateKey() != null) : true  #  inside hasPemKeyStoreProperties method
		 * (hasPemKeyStoreProperties(ssl)) : true  #  inside createKeyStore method
		 * (Ssl.isEnabled(ssl)) : true  #  inside hasPemTrustStoreProperties method
		 * (ssl.getTrustCertificate() != null) : true  #  inside hasPemTrustStoreProperties method
		 * (hasPemTrustStoreProperties(ssl)) : true  #  inside createTrustStore method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<SslManagerBundle> sslManagerBundle = mockStatic(SslManagerBundle.class);
			 MockedStatic<SslOptions> sslOptions = mockStatic(SslOptions.class);
			 MockedStatic<SslBundleKey> sslBundleKey = mockStatic(SslBundleKey.class);
			 MockedStatic<Ssl> ssl = mockStatic(Ssl.class);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] {};
			Ssl ssl2 = new Ssl();
			ssl2.setKeyStoreType("keyStoreType1");
			ssl2.setTrustCertificatePrivateKey("trustCertificatePrivateKey1");
			ssl2.setEnabledProtocols(stringArray);
			ssl2.setKeyAlias("keyAlias1");
			ssl2.setKeyStorePassword("keyStorePassword1");
			ssl2.setCertificate("certificate1");
			ssl2.setTrustCertificate("trustCertificate1");
			ssl2.setProtocol("protocol1");
			ssl2.setCertificatePrivateKey("certificatePrivateKey1");
			ssl2.setKeyPassword("keyPassword1");
			ssl2.setCiphers(stringArray2);
			ssl2.setTrustStoreType("trustStoreType1");
			ssl2.setBundle("A");
			_assert.when(() -> Assert.state(false, "SSL is not enabled")).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
			ssl.when(() -> Ssl.isEnabled(ssl2)).thenReturn(false).thenReturn(true).thenReturn(true);
			sslBundleKey.when(() -> SslBundleKey.of("keyPassword1", "keyAlias1")).thenReturn(sslBundleKeyMock);
			sslOptions.when(() -> SslOptions.of(stringArray2, stringArray)).thenReturn(sslOptionsMock);
			sslManagerBundle.when(() -> SslManagerBundle.from((SslStoreBundle) any(), eq(sslBundleKeyMock))).thenReturn(sslManagerBundleMock);
			//Act Statement(s)
			SslBundle result = WebServerSslBundle.get(ssl2, sslBundlesMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				ssl.verify(() -> Ssl.isEnabled(ssl2), atLeast(3));
				_assert.verify(() -> Assert.state(false, "SSL is not enabled"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
				sslBundleKey.verify(() -> SslBundleKey.of("keyPassword1", "keyAlias1"), atLeast(1));
				sslOptions.verify(() -> SslOptions.of(stringArray2, stringArray), atLeast(1));
				sslManagerBundle.verify(() -> SslManagerBundle.from((SslStoreBundle) any(), eq(sslBundleKeyMock)));
			});
		}
	}

	//Sapient generated method id: ${2ed4c127-4dbd-3f33-95e4-3be3411ad30e}
	@Test()
	void get1WhenSslGetTrustStoreTypeNotEqualsPKCS11AndHasJksTrustStorePropertiesSsl() throws NoSuchSslBundleException {
		/* Branches:
		 * (StringUtils.hasText(bundleName)) : false
		 * (Ssl.isEnabled(ssl)) : true  #  inside hasPemKeyStoreProperties method
		 * (ssl.getCertificate() != null) : true  #  inside hasPemKeyStoreProperties method
		 * (ssl.getCertificatePrivateKey() != null) : true  #  inside hasPemKeyStoreProperties method
		 * (hasPemKeyStoreProperties(ssl)) : true  #  inside createKeyStore method
		 * (Ssl.isEnabled(ssl)) : true  #  inside hasPemTrustStoreProperties method
		 * (ssl.getTrustCertificate() != null) : false  #  inside hasPemTrustStoreProperties method
		 * (hasPemTrustStoreProperties(ssl)) : false  #  inside createTrustStore method
		 * (Ssl.isEnabled(ssl)) : true  #  inside hasJksTrustStoreProperties method
		 * (ssl.getTrustStore() != null) : false  #  inside hasJksTrustStoreProperties method
		 * (ssl.getTrustStoreType().equals("PKCS11")) : false  #  inside hasJksTrustStoreProperties method
		 * (hasJksTrustStoreProperties(ssl)) : true  #  inside createTrustStore method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<SslManagerBundle> sslManagerBundle = mockStatic(SslManagerBundle.class);
			 MockedStatic<SslOptions> sslOptions = mockStatic(SslOptions.class);
			 MockedStatic<SslBundleKey> sslBundleKey = mockStatic(SslBundleKey.class);
			 MockedStatic<Ssl> ssl = mockStatic(Ssl.class);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] {};
			Ssl ssl2 = new Ssl();
			ssl2.setKeyStoreType("keyStoreType1");
			ssl2.setEnabledProtocols(stringArray);
			ssl2.setKeyAlias("keyAlias1");
			ssl2.setKeyStorePassword("keyStorePassword1");
			ssl2.setCertificate("certificate1");
			ssl2.setTrustCertificate((String) null);
			ssl2.setTrustStorePassword("trustStorePassword1");
			ssl2.setProtocol("protocol1");
			ssl2.setCertificatePrivateKey("certificatePrivateKey1");
			ssl2.setTrustStoreProvider("trustStoreProvider1");
			ssl2.setKeyPassword("keyPassword1");
			ssl2.setTrustStore((String) null);
			ssl2.setCiphers(stringArray2);
			ssl2.setTrustStoreType("PKCS11");
			ssl2.setBundle("A");
			_assert.when(() -> Assert.state(false, "SSL is not enabled")).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
			ssl.when(() -> Ssl.isEnabled(ssl2)).thenReturn(false).thenReturn(true).thenReturn(true).thenReturn(true);
			sslBundleKey.when(() -> SslBundleKey.of("keyPassword1", "keyAlias1")).thenReturn(sslBundleKeyMock);
			sslOptions.when(() -> SslOptions.of(stringArray2, stringArray)).thenReturn(sslOptionsMock);
			sslManagerBundle.when(() -> SslManagerBundle.from((SslStoreBundle) any(), eq(sslBundleKeyMock))).thenReturn(sslManagerBundleMock);
			//Act Statement(s)
			SslBundle result = WebServerSslBundle.get(ssl2, sslBundlesMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				ssl.verify(() -> Ssl.isEnabled(ssl2), atLeast(4));
				_assert.verify(() -> Assert.state(false, "SSL is not enabled"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
				sslBundleKey.verify(() -> SslBundleKey.of("keyPassword1", "keyAlias1"), atLeast(1));
				sslOptions.verify(() -> SslOptions.of(stringArray2, stringArray), atLeast(1));
				sslManagerBundle.verify(() -> SslManagerBundle.from((SslStoreBundle) any(), eq(sslBundleKeyMock)));
			});
		}
	}

	//Sapient generated method id: ${5d779ccc-25b1-3e82-9d48-a515d18661fe}
	@Test()
	void get1WhenSslNotIsEnabledSslAndHasPemTrustStorePropertiesNotSslAndSslNotIsEnabledSslAndHasJksTrustStorePropertiesNotSsl2() throws NoSuchSslBundleException {
		/* Branches:
		 * (StringUtils.hasText(bundleName)) : false
		 * (Ssl.isEnabled(ssl)) : true  #  inside hasPemKeyStoreProperties method
		 * (ssl.getCertificate() != null) : true  #  inside hasPemKeyStoreProperties method
		 * (ssl.getCertificatePrivateKey() != null) : false  #  inside hasPemKeyStoreProperties method
		 * (hasPemKeyStoreProperties(ssl)) : false  #  inside createKeyStore method
		 * (Ssl.isEnabled(ssl)) : true  #  inside hasJksKeyStoreProperties method
		 * (ssl.getKeyStore() != null) : false  #  inside hasJksKeyStoreProperties method
		 * (ssl.getKeyStoreType().equals("PKCS11")) : false  #  inside hasJksKeyStoreProperties method
		 * (hasJksKeyStoreProperties(ssl)) : true  #  inside createKeyStore method
		 * (Ssl.isEnabled(ssl)) : false  #  inside hasPemTrustStoreProperties method
		 * (hasPemTrustStoreProperties(ssl)) : false  #  inside createTrustStore method
		 * (Ssl.isEnabled(ssl)) : false  #  inside hasJksTrustStoreProperties method
		 * (hasJksTrustStoreProperties(ssl)) : false  #  inside createTrustStore method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<SslManagerBundle> sslManagerBundle = mockStatic(SslManagerBundle.class);
			 MockedStatic<SslOptions> sslOptions = mockStatic(SslOptions.class);
			 MockedStatic<SslBundleKey> sslBundleKey = mockStatic(SslBundleKey.class);
			 MockedStatic<Ssl> ssl = mockStatic(Ssl.class);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] {};
			Ssl ssl2 = new Ssl();
			ssl2.setKeyStoreType("PKCS11");
			ssl2.setKeyStoreProvider("keyStoreProvider1");
			ssl2.setEnabledProtocols(stringArray);
			ssl2.setProtocol("protocol1");
			ssl2.setCertificatePrivateKey((String) null);
			ssl2.setKeyStorePassword("keyStorePassword1");
			ssl2.setKeyAlias("keyAlias1");
			ssl2.setKeyPassword("keyPassword1");
			ssl2.setKeyStore((String) null);
			ssl2.setCertificate("certificate1");
			ssl2.setCiphers(stringArray2);
			ssl2.setBundle("A");
			_assert.when(() -> Assert.state(false, "SSL is not enabled")).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
			ssl.when(() -> Ssl.isEnabled(ssl2)).thenReturn(false).thenReturn(true).thenReturn(true).thenReturn(false).thenReturn(false);
			sslBundleKey.when(() -> SslBundleKey.of("keyPassword1", "keyAlias1")).thenReturn(sslBundleKeyMock);
			sslOptions.when(() -> SslOptions.of(stringArray2, stringArray)).thenReturn(sslOptionsMock);
			sslManagerBundle.when(() -> SslManagerBundle.from((SslStoreBundle) any(), eq(sslBundleKeyMock))).thenReturn(sslManagerBundleMock);
			//Act Statement(s)
			SslBundle result = WebServerSslBundle.get(ssl2, sslBundlesMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				ssl.verify(() -> Ssl.isEnabled(ssl2), atLeast(5));
				_assert.verify(() -> Assert.state(false, "SSL is not enabled"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
				sslBundleKey.verify(() -> SslBundleKey.of("keyPassword1", "keyAlias1"), atLeast(1));
				sslOptions.verify(() -> SslOptions.of(stringArray2, stringArray), atLeast(1));
				sslManagerBundle.verify(() -> SslManagerBundle.from((SslStoreBundle) any(), eq(sslBundleKeyMock)));
			});
		}
	}

	//Sapient generated method id: ${3ae7776e-5f5a-39ce-bbd4-11abda4e7b31}
	@Test()
	void get1WhenSslNotIsEnabledSslAndHasPemTrustStorePropertiesNotSslAndSslNotIsEnabledSslAndHasJksTrustStorePropertiesNotSsl3() throws NoSuchSslBundleException {
		/* Branches:
		 * (StringUtils.hasText(bundleName)) : false
		 * (Ssl.isEnabled(ssl)) : true  #  inside hasPemKeyStoreProperties method
		 * (ssl.getCertificate() != null) : true  #  inside hasPemKeyStoreProperties method
		 * (ssl.getCertificatePrivateKey() != null) : false  #  inside hasPemKeyStoreProperties method
		 * (hasPemKeyStoreProperties(ssl)) : false  #  inside createKeyStore method
		 * (Ssl.isEnabled(ssl)) : true  #  inside hasJksKeyStoreProperties method
		 * (ssl.getKeyStore() != null) : false  #  inside hasJksKeyStoreProperties method
		 * (ssl.getKeyStoreType().equals("PKCS11")) : false  #  inside hasJksKeyStoreProperties method
		 * (hasJksKeyStoreProperties(ssl)) : false  #  inside createKeyStore method
		 * (Ssl.isEnabled(ssl)) : false  #  inside hasPemTrustStoreProperties method
		 * (hasPemTrustStoreProperties(ssl)) : false  #  inside createTrustStore method
		 * (Ssl.isEnabled(ssl)) : false  #  inside hasJksTrustStoreProperties method
		 * (hasJksTrustStoreProperties(ssl)) : false  #  inside createTrustStore method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<SslManagerBundle> sslManagerBundle = mockStatic(SslManagerBundle.class);
			 MockedStatic<SslOptions> sslOptions = mockStatic(SslOptions.class);
			 MockedStatic<SslBundleKey> sslBundleKey = mockStatic(SslBundleKey.class);
			 MockedStatic<Ssl> ssl = mockStatic(Ssl.class);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] {};
			Ssl ssl2 = new Ssl();
			ssl2.setKeyStoreType("B");
			ssl2.setEnabledProtocols(stringArray);
			ssl2.setProtocol("protocol1");
			ssl2.setCertificatePrivateKey((String) null);
			ssl2.setKeyStorePassword("keyStorePassword1");
			ssl2.setKeyAlias("keyAlias1");
			ssl2.setKeyPassword("keyPassword1");
			ssl2.setKeyStore((String) null);
			ssl2.setCertificate("certificate1");
			ssl2.setCiphers(stringArray2);
			ssl2.setBundle("A");
			_assert.when(() -> Assert.state(false, "SSL is not enabled")).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
			ssl.when(() -> Ssl.isEnabled(ssl2)).thenReturn(false).thenReturn(true).thenReturn(true).thenReturn(false).thenReturn(false);
			sslBundleKey.when(() -> SslBundleKey.of("keyPassword1", "keyAlias1")).thenReturn(sslBundleKeyMock);
			sslOptions.when(() -> SslOptions.of(stringArray2, stringArray)).thenReturn(sslOptionsMock);
			sslManagerBundle.when(() -> SslManagerBundle.from((SslStoreBundle) any(), eq(sslBundleKeyMock))).thenReturn(sslManagerBundleMock);
			//Act Statement(s)
			SslBundle result = WebServerSslBundle.get(ssl2, sslBundlesMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				ssl.verify(() -> Ssl.isEnabled(ssl2), atLeast(5));
				_assert.verify(() -> Assert.state(false, "SSL is not enabled"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
				sslBundleKey.verify(() -> SslBundleKey.of("keyPassword1", "keyAlias1"), atLeast(1));
				sslOptions.verify(() -> SslOptions.of(stringArray2, stringArray), atLeast(1));
				sslManagerBundle.verify(() -> SslManagerBundle.from((SslStoreBundle) any(), eq(sslBundleKeyMock)));
			});
		}
	}
}
