package org.springframework.boot.web.embedded.tomcat;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.ssl.SslBundleKey;

import org.mockito.stubbing.Answer;

import org.springframework.boot.ssl.SslOptions;

import org.apache.commons.logging.impl.NoOpLog;

import org.springframework.boot.web.server.Ssl;
import org.springframework.util.StringUtils;

import org.apache.coyote.http11.AbstractHttp11JsseProtocol;

import org.springframework.util.Assert;

import java.security.KeyStore;

import org.mockito.MockedStatic;
import org.apache.tomcat.util.net.SSLHostConfig;
import org.apache.catalina.connector.Connector;

import org.springframework.boot.ssl.SslBundle;
import org.springframework.boot.ssl.SslStoreBundle;

import org.apache.coyote.http11.Http11NioProtocol;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SslConnectorCustomizerSapientGeneratedTest {

	private final KeyStore keyStoreMock = mock(KeyStore.class);

	private final KeyStore keyStoreMock2 = mock(KeyStore.class);

	private final KeyStore keyStoreMock3 = mock(KeyStore.class);

	private final KeyStore keyStoreMock4 = mock(KeyStore.class);

	private final AbstractHttp11JsseProtocol protocolMock = mock(AbstractHttp11JsseProtocol.class);

	private final SslBundleKey sslBundleKeyMock = mock(SslBundleKey.class);

	private final SslBundle sslBundleMock = mock(SslBundle.class);

	private final SslOptions sslOptionsMock = mock(SslOptions.class);

	private final SslStoreBundle sslStoreBundleMock = mock(SslStoreBundle.class);

	//Sapient generated method id: ${7f14d933-09d2-3407-a4f9-54bea1b19822}, hash: D70F6E798C04869413706FCB61CAD09C
	@Test()
	void updateTest() throws Exception {
		//Arrange Statement(s)
		NoOpLog noOpLog = new NoOpLog();
		Connector connectorMock = mock(Connector.class);
		SslConnectorCustomizer target = spy(new SslConnectorCustomizer(noOpLog, connectorMock, Ssl.ClientAuth.NONE));
		doNothing().when(target).customize(sslBundleMock);
		//Act Statement(s)
		target.update(sslBundleMock);
		//Assert statement(s)
		assertAll("result", () -> verify(target).customize(sslBundleMock));
	}

	//Sapient generated method id: ${ad461df0-c9de-384e-9f4d-54b6e2437911}, hash: 62B2A66D8B071649547E49D00B268EAD
	@Disabled()
	@Test()
	void customizeWhenOptionsGetEnabledProtocolsIsNotNull() throws Exception {
		/* Branches:
		 * (stores.getKeyStorePassword() != null) : true  #  inside applySslBundle method
		 * (key.getPassword() != null) : true  #  inside applySslBundle method
		 * (key.getAlias() != null) : true  #  inside applySslBundle method
		 * (options.getCiphers() != null) : true  #  inside applySslBundle method
		 * (stores.getKeyStore() != null) : true  #  inside configureSslStoreProvider method
		 * (stores.getTrustStore() != null) : true  #  inside configureSslStoreProvider method
		 * (options.getEnabledProtocols() != null) : true  #  inside configureEnabledProtocols method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: sslHostConfig - Method: addCertificate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(sslBundleKeyMock).when(sslBundleMock).getKey();
			doReturn("return_of_getPassword1").when(sslBundleKeyMock).getPassword();
			doReturn("return_of_getAlias1").when(sslBundleKeyMock).getAlias();
			doReturn(sslStoreBundleMock).when(sslBundleMock).getStores();
			doReturn("return_of_getKeyStorePassword1").when(sslStoreBundleMock).getKeyStorePassword();
			doReturn(keyStoreMock, keyStoreMock2).when(sslStoreBundleMock).getKeyStore();
			doReturn(keyStoreMock3, keyStoreMock4).when(sslStoreBundleMock).getTrustStore();
			doReturn(sslOptionsMock).when(sslBundleMock).getOptions();
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] {};
			doReturn(stringArray, stringArray2).when(sslOptionsMock).getCiphers();
			String[] stringArray3 = new String[] {};
			String[] stringArray4 = new String[] {};
			doReturn(stringArray3, stringArray4).when(sslOptionsMock).getEnabledProtocols();
			doReturn("sslProtocol1").when(sslBundleMock).getProtocol();
			doNothing().when(protocolMock).setSSLEnabled(true);
			doReturn("return_of_getDefaultSSLHostConfigName1").when(protocolMock).getDefaultSSLHostConfigName();
			doNothing().when(protocolMock).addSslHostConfig((SSLHostConfig) any(), eq(true));
			_assert.when(() -> Assert.state(false, "To use SSL, the connector's protocol handler must be an AbstractHttp11JsseProtocol subclass")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isInstanceOf(Http11NioProtocol.class, protocolMock, "SslStoreProvider can only be used with Http11NioProtocol")).thenAnswer((Answer<Void>) invocation -> null);
			NoOpLog noOpLog = new NoOpLog();
			Connector connector = new Connector(protocolMock);
			connector.setScheme("https");
			connector.setSecure(true);
			SslConnectorCustomizer target = new SslConnectorCustomizer(noOpLog, connector, Ssl.ClientAuth.NEED);
			//Act Statement(s)
			target.customize(sslBundleMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(sslBundleMock).getKey();
				verify(sslBundleKeyMock, times(2)).getPassword();
				verify(sslBundleKeyMock, times(2)).getAlias();
				verify(sslBundleMock).getStores();
				verify(sslStoreBundleMock, times(2)).getKeyStorePassword();
				verify(sslStoreBundleMock, times(2)).getKeyStore();
				verify(sslStoreBundleMock, times(2)).getTrustStore();
				verify(sslBundleMock).getOptions();
				verify(sslOptionsMock, times(2)).getCiphers();
				verify(sslOptionsMock, times(2)).getEnabledProtocols();
				verify(sslBundleMock).getProtocol();
				verify(protocolMock).setSSLEnabled(true);
				verify(protocolMock).getDefaultSSLHostConfigName();
				verify(protocolMock).addSslHostConfig((SSLHostConfig) any(), eq(true));
				_assert.verify(() -> Assert.state(false, "To use SSL, the connector's protocol handler must be an AbstractHttp11JsseProtocol subclass"), atLeast(1));
				_assert.verify(() -> Assert.isInstanceOf(Http11NioProtocol.class, protocolMock, "SslStoreProvider can only be used with Http11NioProtocol"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c3a43e40-27d6-3a17-be40-d4fa0eae3537}, hash: E272FACD9D19815EA8F8FACD5EED3015
	@Disabled()
	@Test()
	void customizeWhenCaughtExceptionThrowsIllegalStateException() {
		/* Branches:
		 * (stores.getKeyStorePassword() != null) : true  #  inside applySslBundle method
		 * (key.getPassword() != null) : true  #  inside applySslBundle method
		 * (key.getAlias() != null) : true  #  inside applySslBundle method
		 * (options.getCiphers() != null) : true  #  inside applySslBundle method
		 * (stores.getKeyStore() != null) : true  #  inside configureSslStoreProvider method
		 * (stores.getTrustStore() != null) : true  #  inside configureSslStoreProvider method
		 * (catch-exception (Exception)) : true  #  inside configureSslStoreProvider method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: sslHostConfig - Method: addCertificate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(sslBundleKeyMock).when(sslBundleMock).getKey();
			doReturn("return_of_getPassword1").when(sslBundleKeyMock).getPassword();
			doReturn("return_of_getAlias1").when(sslBundleKeyMock).getAlias();
			doReturn(sslStoreBundleMock).when(sslBundleMock).getStores();
			doReturn("return_of_getKeyStorePassword1").when(sslStoreBundleMock).getKeyStorePassword();
			doReturn(keyStoreMock, keyStoreMock2).when(sslStoreBundleMock).getKeyStore();
			doReturn(keyStoreMock3, keyStoreMock4).when(sslStoreBundleMock).getTrustStore();
			doReturn(sslOptionsMock).when(sslBundleMock).getOptions();
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] {};
			doReturn(stringArray, stringArray2).when(sslOptionsMock).getCiphers();
			doReturn("sslProtocol1").when(sslBundleMock).getProtocol();
			doNothing().when(protocolMock).setSSLEnabled(true);
			doReturn("return_of_getDefaultSSLHostConfigName1").when(protocolMock).getDefaultSSLHostConfigName();
			_assert.when(() -> Assert.state(false, "To use SSL, the connector's protocol handler must be an AbstractHttp11JsseProtocol subclass")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isInstanceOf(Http11NioProtocol.class, protocolMock, "SslStoreProvider can only be used with Http11NioProtocol")).thenAnswer((Answer<Void>) invocation -> null);
			NoOpLog noOpLog = new NoOpLog();
			Connector connector = new Connector(protocolMock);
			SslConnectorCustomizer target = new SslConnectorCustomizer(noOpLog, connector, Ssl.ClientAuth.NEED);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.customize(sslBundleMock);
			});
			Exception exception = new Exception("");
			IllegalStateException illegalStateException = new IllegalStateException("Could not load store: ", exception);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(exception.getClass())));
				verify(sslBundleMock).getKey();
				verify(sslBundleKeyMock, times(2)).getPassword();
				verify(sslBundleKeyMock, times(2)).getAlias();
				verify(sslBundleMock).getStores();
				verify(sslStoreBundleMock, times(2)).getKeyStorePassword();
				verify(sslStoreBundleMock, times(2)).getKeyStore();
				verify(sslStoreBundleMock, times(2)).getTrustStore();
				verify(sslBundleMock).getOptions();
				verify(sslOptionsMock, times(2)).getCiphers();
				verify(sslBundleMock).getProtocol();
				verify(protocolMock).setSSLEnabled(true);
				verify(protocolMock).getDefaultSSLHostConfigName();
				_assert.verify(() -> Assert.state(false, "To use SSL, the connector's protocol handler must be an AbstractHttp11JsseProtocol subclass"), atLeast(1));
				_assert.verify(() -> Assert.isInstanceOf(Http11NioProtocol.class, protocolMock, "SslStoreProvider can only be used with Http11NioProtocol"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${fa2f19fa-aa91-328e-a305-bd1ae03dc4a9}, hash: E984CEB8DC137D9663F29FBC953EFF81
	@Test()
	void customizeWhenStoresGetKeyStoreIsNullAndStoresGetTrustStoreIsNullAndOptionsGetEnabledProtocolsIsNull7() throws Exception {
		/* Branches:
		 * (stores.getKeyStorePassword() != null) : false  #  inside applySslBundle method
		 * (key.getPassword() != null) : true  #  inside applySslBundle method
		 * (key.getAlias() != null) : true  #  inside applySslBundle method
		 * (options.getCiphers() != null) : true  #  inside applySslBundle method
		 * (stores.getKeyStore() != null) : false  #  inside configureSslStoreProvider method
		 * (stores.getTrustStore() != null) : false  #  inside configureSslStoreProvider method
		 * (options.getEnabledProtocols() != null) : false  #  inside configureEnabledProtocols method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			doReturn(sslBundleKeyMock).when(sslBundleMock).getKey();
			doReturn("return_of_getPassword1").when(sslBundleKeyMock).getPassword();
			doReturn("return_of_getAlias1").when(sslBundleKeyMock).getAlias();
			doReturn(sslStoreBundleMock).when(sslBundleMock).getStores();
			doReturn(null).when(sslStoreBundleMock).getKeyStorePassword();
			doReturn(null).when(sslStoreBundleMock).getKeyStore();
			doReturn(null).when(sslStoreBundleMock).getTrustStore();
			doReturn(sslOptionsMock).when(sslBundleMock).getOptions();
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] {};
			doReturn(stringArray, stringArray2).when(sslOptionsMock).getCiphers();
			doReturn(null).when(sslOptionsMock).getEnabledProtocols();
			doReturn("sslProtocol1").when(sslBundleMock).getProtocol();
			doNothing().when(protocolMock).setSSLEnabled(true);
			doReturn("return_of_getDefaultSSLHostConfigName1").when(protocolMock).getDefaultSSLHostConfigName();
			doNothing().when(protocolMock).addSslHostConfig((SSLHostConfig) any(), eq(true));
			_assert.when(() -> Assert.isInstanceOf(Http11NioProtocol.class, protocolMock, "SslStoreProvider can only be used with Http11NioProtocol")).thenAnswer((Answer<Void>) invocation -> null);
			NoOpLog noOpLog = new NoOpLog();
			Connector connector = new Connector(protocolMock);
			connector.setScheme("https");
			connector.setSecure(true);
			SslConnectorCustomizer target = new SslConnectorCustomizer(noOpLog, connector, Ssl.ClientAuth.NEED);
			//Act Statement(s)
			target.customize(sslBundleMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(sslBundleMock, atLeast(1)).getKey();
				verify(sslBundleKeyMock, times(2)).getPassword();
				verify(sslBundleKeyMock, times(2)).getAlias();
				verify(sslBundleMock, atLeast(1)).getStores();
				verify(sslStoreBundleMock, atLeast(1)).getKeyStorePassword();
				verify(sslStoreBundleMock, atLeast(1)).getKeyStore();
				verify(sslStoreBundleMock, atLeast(1)).getTrustStore();
				verify(sslBundleMock, atLeast(1)).getOptions();
				verify(sslOptionsMock, times(2)).getCiphers();
				verify(sslOptionsMock, atLeast(1)).getEnabledProtocols();
				verify(sslBundleMock, atLeast(1)).getProtocol();
				verify(protocolMock, atLeast(1)).setSSLEnabled(true);
				verify(protocolMock, atLeast(1)).getDefaultSSLHostConfigName();
				verify(protocolMock, atLeast(1)).addSslHostConfig((SSLHostConfig) any(), eq(true));
				_assert.verify(() -> Assert.isInstanceOf(Http11NioProtocol.class, protocolMock, "SslStoreProvider can only be used with Http11NioProtocol"), atLeast(1));
			});
		}
	}
}
