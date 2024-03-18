package org.springframework.boot.web.embedded.jetty;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.eclipse.jetty.server.SslConnectionFactory;

import org.springframework.util.Assert;

import java.security.KeyStore;

import org.eclipse.jetty.alpn.server.ALPNServerConnectionFactory;
import org.eclipse.jetty.http2.server.HTTP2ServerConnectionFactory;

import org.springframework.boot.web.server.Http2;

import java.net.InetSocketAddress;

import org.springframework.boot.ssl.SslBundle;
import org.springframework.boot.ssl.SslStoreBundle;
import org.springframework.boot.ssl.SslBundleKey;

import org.mockito.stubbing.Answer;

import org.springframework.util.ClassUtils;
import org.springframework.boot.ssl.SslOptions;

import org.eclipse.jetty.server.HttpConfiguration;

import org.springframework.boot.web.server.Ssl;

import java.util.function.Supplier;

import org.eclipse.jetty.server.HttpConnectionFactory;
import org.eclipse.jetty.server.ConnectionFactory;
import org.mockito.MockedStatic;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.ssl.SslContextFactory;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
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
import static org.mockito.Mockito.doThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SslServerCustomizerSapientGeneratedTest {

	private final SslBundle sslBundleMock = mock(SslBundle.class, "sslBundle");

	private final SslContextFactory.Server factoryMock = mock(SslContextFactory.Server.class);

	private final Http2 http2Mock = mock(Http2.class);

	private final KeyStore keyStoreMock = mock(KeyStore.class);

	private final KeyStore keyStoreMock2 = mock(KeyStore.class);

	private final Server serverMock = mock(Server.class);

	private final SslBundleKey sslBundleKeyMock = mock(SslBundleKey.class);

	private final SslOptions sslOptionsMock = mock(SslOptions.class);

	private final SslStoreBundle sslStoreBundleMock = mock(SslStoreBundle.class);

	//Sapient generated method id: ${82417d83-9c68-3569-950d-e123f9dde7e2}, hash: BB946DA10CACB4A1E8B96B8C93DCCA91
	@Disabled()
	@Test()
	void customizeWhenThisHttp2NotIsEnabled() throws Exception {
		/* Branches:
		 * (this.http2 == null) : false  #  inside createServerConnector method
		 * (!this.http2.isEnabled()) : true  #  inside createServerConnector method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: sslContextFactory
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SslContextFactory.Server sslContextFactoryServer = new SslContextFactory.Server();
		SslConnectionFactory sslConnectionFactory = new SslConnectionFactory(sslContextFactoryServer, "HTTP/1.1");
		HttpConfiguration httpConfiguration = new HttpConfiguration();
		HttpConnectionFactory httpConnectionFactory = new HttpConnectionFactory(httpConfiguration);
		SslServerCustomizer.SslValidatingServerConnector sslServerCustomizerSslValidatingServerConnector = new SslServerCustomizer.SslValidatingServerConnector(sslBundleKeyMock, sslContextFactoryServer, serverMock, sslConnectionFactory, httpConnectionFactory);
		Connector[] connectorArray = new Connector[] { sslServerCustomizerSslValidatingServerConnector };
		doNothing().when(serverMock).setConnectors(connectorArray);
		Http2 http2 = new Http2();
		http2.setEnabled(false);
		InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
		SslServerCustomizer target = spy(new SslServerCustomizer(http2, inetSocketAddress, Ssl.ClientAuth.NONE, sslBundleMock));
		doNothing().when(target).configureSsl((SslContextFactory.Server) any(), eq(Ssl.ClientAuth.NONE));
		doReturn(sslBundleKeyMock).when(sslBundleMock).getKey();
		//Act Statement(s)
		target.customize(serverMock);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(serverMock).setConnectors(connectorArray);
			verify(target).configureSsl((SslContextFactory.Server) any(), eq(Ssl.ClientAuth.NONE));
			verify(sslBundleMock).getKey();
		});
	}

	//Sapient generated method id: ${430679fd-1dd0-3139-afbb-fa661bc8bf0c}, hash: 845D0C3E663B6A75B8F36B95D3071F47
	@Disabled()
	@Test()
	void customizeWhenCaughtIllegalStateExceptionThrowsIllegalStateException() {
		/* Branches:
		 * (this.http2 == null) : false  #  inside createServerConnector method
		 * (!this.http2.isEnabled()) : false  #  inside createServerConnector method
		 * (ClassUtils.isPresent("org.eclipse.jetty.alpn.server.ALPNServerConnectionFactory", null)) : true  #  inside isJettyAlpnPresent method
		 * (ClassUtils.isPresent("org.eclipse.jetty.http2.server.HTTP2ServerConnectionFactory", null)) : true  #  inside isJettyHttp2Present method
		 * (catch-exception (IllegalStateException)) : true  #  inside createAlpnServerConnectionFactory method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: sslContextFactory
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			classUtils.when(() -> ClassUtils.isPresent("org.eclipse.jetty.alpn.server.ALPNServerConnectionFactory", null)).thenReturn(true);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			classUtils.when(() -> ClassUtils.isPresent("org.eclipse.jetty.http2.server.HTTP2ServerConnectionFactory", null)).thenReturn(true);
			Http2 http2 = new Http2();
			http2.setEnabled(true);
			InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
			SslServerCustomizer target = spy(new SslServerCustomizer(http2, inetSocketAddress, Ssl.ClientAuth.NONE, sslBundleMock));
			doNothing().when(target).configureSsl((SslContextFactory.Server) any(), eq(Ssl.ClientAuth.NONE));
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.customize(serverMock);
			});
			IllegalStateException illegalStateException = new IllegalStateException();
			IllegalStateException illegalStateException2 = new IllegalStateException("An 'org.eclipse.jetty:jetty-alpn-*-server' dependency is required for HTTP/2 support.", illegalStateException);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException2.getMessage()));
				assertThat(result.getCause(), is(instanceOf(illegalStateException.getClass())));
				classUtils.verify(() -> ClassUtils.isPresent("org.eclipse.jetty.alpn.server.ALPNServerConnectionFactory", null), atLeast(1));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()), atLeast(2));
				classUtils.verify(() -> ClassUtils.isPresent("org.eclipse.jetty.http2.server.HTTP2ServerConnectionFactory", null), atLeast(1));
				verify(target).configureSsl((SslContextFactory.Server) any(), eq(Ssl.ClientAuth.NONE));
			});
		}
	}

	//Sapient generated method id: ${cafab7d3-50a6-3de0-a596-e5cb61cade46}, hash: D7B52C890648C833BED08CCE1B418A59
	@Disabled()
	@Test()
	void customizeWhenClassUtilsNotIsPresentOrg_eclipse_jetty_http2_server_HTTP2ServerConnectionFactoryNullAndClassUtilsNotIsPre() throws Exception {
		/* Branches:
		 * (this.http2 == null) : false  #  inside createServerConnector method
		 * (!this.http2.isEnabled()) : false  #  inside createServerConnector method
		 * (ClassUtils.isPresent("org.eclipse.jetty.alpn.server.ALPNServerConnectionFactory", null)) : false  #  inside isJettyAlpnPresent method
		 * (ClassUtils.isPresent("org.eclipse.jetty.http2.server.HTTP2ServerConnectionFactory", null)) : false  #  inside isJettyHttp2Present method
		 * (ClassUtils.isPresent("org.conscrypt.Conscrypt", null)) : false  #  inside isConscryptPresent method
		 * (isConscryptPresent()) : false  #  inside createHttp2ServerConnector method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: sslContextFactory
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			SslContextFactory.Server sslContextFactoryServer = new SslContextFactory.Server();
			SslConnectionFactory sslConnectionFactory = new SslConnectionFactory(sslContextFactoryServer, "return_of_getProtocol1");
			String[] stringArray = new String[] {};
			ALPNServerConnectionFactory aLPNServerConnectionFactory = new ALPNServerConnectionFactory(stringArray);
			HttpConfiguration httpConfiguration = new HttpConfiguration();
			HTTP2ServerConnectionFactory hTTP2ServerConnectionFactory = new HTTP2ServerConnectionFactory(httpConfiguration);
			HttpConnectionFactory httpConnectionFactory = new HttpConnectionFactory(httpConfiguration);
			ConnectionFactory[] connectionFactoryArray = new ConnectionFactory[] { sslConnectionFactory, aLPNServerConnectionFactory, hTTP2ServerConnectionFactory, httpConnectionFactory };
			SslServerCustomizer.SslValidatingServerConnector sslServerCustomizerSslValidatingServerConnector = new SslServerCustomizer.SslValidatingServerConnector(sslBundleKeyMock, sslContextFactoryServer, serverMock, connectionFactoryArray);
			Connector[] connectorArray = new Connector[] { sslServerCustomizerSslValidatingServerConnector };
			doNothing().when(serverMock).setConnectors(connectorArray);
			classUtils.when(() -> ClassUtils.isPresent("org.eclipse.jetty.alpn.server.ALPNServerConnectionFactory", null)).thenReturn(false);
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			classUtils.when(() -> ClassUtils.isPresent("org.eclipse.jetty.http2.server.HTTP2ServerConnectionFactory", null)).thenReturn(false);
			classUtils.when(() -> ClassUtils.isPresent("org.conscrypt.Conscrypt", null)).thenReturn(false);
			Http2 http2 = new Http2();
			http2.setEnabled(true);
			InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
			SslServerCustomizer target = spy(new SslServerCustomizer(http2, inetSocketAddress, Ssl.ClientAuth.NONE, sslBundleMock));
			doNothing().when(target).configureSsl((SslContextFactory.Server) any(), eq(Ssl.ClientAuth.NONE));
			doReturn(sslBundleKeyMock).when(sslBundleMock).getKey();
			//Act Statement(s)
			target.customize(serverMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(serverMock).setConnectors(connectorArray);
				classUtils.verify(() -> ClassUtils.isPresent("org.eclipse.jetty.alpn.server.ALPNServerConnectionFactory", null), atLeast(1));
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()), atLeast(2));
				classUtils.verify(() -> ClassUtils.isPresent("org.eclipse.jetty.http2.server.HTTP2ServerConnectionFactory", null), atLeast(1));
				classUtils.verify(() -> ClassUtils.isPresent("org.conscrypt.Conscrypt", null), atLeast(1));
				verify(target).configureSsl((SslContextFactory.Server) any(), eq(Ssl.ClientAuth.NONE));
				verify(sslBundleMock).getKey();
			});
		}
	}

	//Sapient generated method id: ${80d8c8d5-d732-3666-b76e-7d2e7ba39cd3}, hash: D77566B51A64BC965597B29EC0AC2414
	@Disabled()
	@Test()
	void customizeWhenIsConscryptPresent() throws Exception {
		/* Branches:
		 * (this.http2 == null) : false  #  inside createServerConnector method
		 * (!this.http2.isEnabled()) : false  #  inside createServerConnector method
		 * (ClassUtils.isPresent("org.eclipse.jetty.alpn.server.ALPNServerConnectionFactory", null)) : true  #  inside isJettyAlpnPresent method
		 * (ClassUtils.isPresent("org.eclipse.jetty.http2.server.HTTP2ServerConnectionFactory", null)) : true  #  inside isJettyHttp2Present method
		 * (ClassUtils.isPresent("org.conscrypt.Conscrypt", null)) : true  #  inside isConscryptPresent method
		 * (ClassUtils.isPresent("org.eclipse.jetty.alpn.conscrypt.server.ConscryptServerALPNProcessor", null)) : true  #  inside isConscryptPresent method
		 * (isConscryptPresent()) : true  #  inside createHttp2ServerConnector method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: sslContextFactory
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			SslContextFactory.Server sslContextFactoryServer = new SslContextFactory.Server();
			SslConnectionFactory sslConnectionFactory = new SslConnectionFactory(sslContextFactoryServer, "return_of_getProtocol1");
			String[] stringArray = new String[] {};
			ALPNServerConnectionFactory aLPNServerConnectionFactory = new ALPNServerConnectionFactory(stringArray);
			HttpConfiguration httpConfiguration = new HttpConfiguration();
			HTTP2ServerConnectionFactory hTTP2ServerConnectionFactory = new HTTP2ServerConnectionFactory(httpConfiguration);
			HttpConnectionFactory httpConnectionFactory = new HttpConnectionFactory(httpConfiguration);
			ConnectionFactory[] connectionFactoryArray = new ConnectionFactory[] { sslConnectionFactory, aLPNServerConnectionFactory, hTTP2ServerConnectionFactory, httpConnectionFactory };
			SslServerCustomizer.SslValidatingServerConnector sslServerCustomizerSslValidatingServerConnector = new SslServerCustomizer.SslValidatingServerConnector(sslBundleKeyMock, sslContextFactoryServer, serverMock, connectionFactoryArray);
			Connector[] connectorArray = new Connector[] { sslServerCustomizerSslValidatingServerConnector };
			doNothing().when(serverMock).setConnectors(connectorArray);
			classUtils.when(() -> ClassUtils.isPresent("org.eclipse.jetty.alpn.server.ALPNServerConnectionFactory", null)).thenReturn(true);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			classUtils.when(() -> ClassUtils.isPresent("org.eclipse.jetty.http2.server.HTTP2ServerConnectionFactory", null)).thenReturn(true);
			classUtils.when(() -> ClassUtils.isPresent("org.conscrypt.Conscrypt", null)).thenReturn(true);
			classUtils.when(() -> ClassUtils.isPresent("org.eclipse.jetty.alpn.conscrypt.server.ConscryptServerALPNProcessor", null)).thenReturn(true);
			Http2 http2 = new Http2();
			http2.setEnabled(true);
			InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
			SslServerCustomizer target = spy(new SslServerCustomizer(http2, inetSocketAddress, Ssl.ClientAuth.NONE, sslBundleMock));
			doNothing().when(target).configureSsl((SslContextFactory.Server) any(), eq(Ssl.ClientAuth.NONE));
			doReturn(sslBundleKeyMock).when(sslBundleMock).getKey();
			//Act Statement(s)
			target.customize(serverMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(serverMock).setConnectors(connectorArray);
				classUtils.verify(() -> ClassUtils.isPresent("org.eclipse.jetty.alpn.server.ALPNServerConnectionFactory", null), atLeast(1));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()), atLeast(2));
				classUtils.verify(() -> ClassUtils.isPresent("org.eclipse.jetty.http2.server.HTTP2ServerConnectionFactory", null), atLeast(1));
				classUtils.verify(() -> ClassUtils.isPresent("org.conscrypt.Conscrypt", null), atLeast(1));
				classUtils.verify(() -> ClassUtils.isPresent("org.eclipse.jetty.alpn.conscrypt.server.ConscryptServerALPNProcessor", null), atLeast(1));
				verify(target).configureSsl((SslContextFactory.Server) any(), eq(Ssl.ClientAuth.NONE));
				verify(sslBundleMock).getKey();
			});
		}
	}

	//Sapient generated method id: ${772d5f66-e112-3ed5-8d00-772dfd5f36b6}, hash: E375F663E661BF0187036D19B6EAAED6
	@Test()
	void configureSslWhenKeyGetPasswordIsNotNull() throws Exception {
		/* Branches:
		 * (clientAuth == ClientAuth.WANT) : false  #  inside configureSslClientAuth method
		 * (clientAuth == ClientAuth.NEED) : true  #  inside configureSslClientAuth method
		 * (clientAuth == ClientAuth.NEED) : true  #  inside configureSslClientAuth method
		 * (stores.getKeyStorePassword() != null) : true
		 * (options.getCiphers() != null) : true
		 * (options.getEnabledProtocols() != null) : true
		 * (key.getPassword() != null) : true
		 */
		//Arrange Statement(s)
		doNothing().when(factoryMock).setProtocol("return_of_getProtocol1");
		doNothing().when(factoryMock).setWantClientAuth(true);
		doNothing().when(factoryMock).setNeedClientAuth(true);
		doNothing().when(factoryMock).setKeyStorePassword("return_of_getKeyStorePassword1");
		doNothing().when(factoryMock).setCertAlias("return_of_getAlias1");
		String[] stringArray = new String[] {};
		doNothing().when(factoryMock).setIncludeCipherSuites(stringArray);
		String[] stringArray2 = new String[] {};
		doNothing().when(factoryMock).setExcludeCipherSuites(stringArray2);
		String[] stringArray3 = new String[] {};
		doNothing().when(factoryMock).setIncludeProtocols(stringArray3);
		String[] stringArray4 = new String[] {};
		doNothing().when(factoryMock).setExcludeProtocols(stringArray4);
		doNothing().when(factoryMock).setKeyManagerPassword("return_of_getPassword1");
		doNothing().when(factoryMock).setKeyStore(keyStoreMock);
		doNothing().when(factoryMock).setTrustStore(keyStoreMock2);
		InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
		SslServerCustomizer target = new SslServerCustomizer(http2Mock, inetSocketAddress, Ssl.ClientAuth.NONE, sslBundleMock);
		doReturn(sslBundleKeyMock).when(sslBundleMock).getKey();
		doReturn("return_of_getAlias1").when(sslBundleKeyMock).getAlias();
		doReturn("return_of_getPassword1").when(sslBundleKeyMock).getPassword();
		doReturn(sslOptionsMock).when(sslBundleMock).getOptions();
		String[] stringArray5 = new String[] {};
		doReturn(stringArray5, stringArray).when(sslOptionsMock).getCiphers();
		String[] stringArray6 = new String[] {};
		doReturn(stringArray6, stringArray3).when(sslOptionsMock).getEnabledProtocols();
		doReturn(sslStoreBundleMock).when(sslBundleMock).getStores();
		doReturn("return_of_getKeyStorePassword1").when(sslStoreBundleMock).getKeyStorePassword();
		doReturn(keyStoreMock).when(sslStoreBundleMock).getKeyStore();
		doReturn(keyStoreMock2).when(sslStoreBundleMock).getTrustStore();
		doReturn("return_of_getProtocol1").when(sslBundleMock).getProtocol();
		//Act Statement(s)
		target.configureSsl(factoryMock, Ssl.ClientAuth.NEED);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(factoryMock).setProtocol("return_of_getProtocol1");
			verify(factoryMock).setWantClientAuth(true);
			verify(factoryMock).setNeedClientAuth(true);
			verify(factoryMock).setKeyStorePassword("return_of_getKeyStorePassword1");
			verify(factoryMock).setCertAlias("return_of_getAlias1");
			verify(factoryMock).setIncludeCipherSuites(stringArray);
			verify(factoryMock).setExcludeCipherSuites(stringArray2);
			verify(factoryMock).setIncludeProtocols(stringArray3);
			verify(factoryMock).setExcludeProtocols(stringArray4);
			verify(factoryMock).setKeyManagerPassword("return_of_getPassword1");
			verify(factoryMock).setKeyStore(keyStoreMock);
			verify(factoryMock).setTrustStore(keyStoreMock2);
			verify(sslBundleMock).getKey();
			verify(sslBundleKeyMock).getAlias();
			verify(sslBundleKeyMock, times(2)).getPassword();
			verify(sslBundleMock).getOptions();
			verify(sslOptionsMock, times(2)).getCiphers();
			verify(sslOptionsMock, times(2)).getEnabledProtocols();
			verify(sslBundleMock).getStores();
			verify(sslStoreBundleMock, times(2)).getKeyStorePassword();
			verify(sslStoreBundleMock).getKeyStore();
			verify(sslStoreBundleMock).getTrustStore();
			verify(sslBundleMock).getProtocol();
		});
	}

	//Sapient generated method id: ${748661ff-6b39-372a-bdfb-610b43c1f1a9}, hash: 2DD0A741AA304D2474795A3C455E86CD
	@Test()
	void configureSslWhenOptionsGetCiphersIsNullAndOptionsGetEnabledProtocolsIsNullAndKeyGetPasswordIsNull3() throws Exception {
		/* Branches:
		 * (clientAuth == ClientAuth.WANT) : false  #  inside configureSslClientAuth method
		 * (clientAuth == ClientAuth.NEED) : false  #  inside configureSslClientAuth method
		 * (clientAuth == ClientAuth.NEED) : false  #  inside configureSslClientAuth method
		 * (stores.getKeyStorePassword() != null) : false
		 * (options.getCiphers() != null) : false
		 * (options.getEnabledProtocols() != null) : false
		 * (key.getPassword() != null) : false
		 */
		//Arrange Statement(s)
		doNothing().when(factoryMock).setProtocol("return_of_getProtocol1");
		doNothing().when(factoryMock).setWantClientAuth(false);
		doNothing().when(factoryMock).setNeedClientAuth(false);
		doNothing().when(factoryMock).setCertAlias("return_of_getAlias1");
		doNothing().when(factoryMock).setKeyStore(keyStoreMock);
		doNothing().when(factoryMock).setTrustStore(keyStoreMock2);
		InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
		SslServerCustomizer target = new SslServerCustomizer(http2Mock, inetSocketAddress, Ssl.ClientAuth.NONE, sslBundleMock);
		doReturn(sslBundleKeyMock).when(sslBundleMock).getKey();
		doReturn("return_of_getAlias1").when(sslBundleKeyMock).getAlias();
		doReturn(null).when(sslBundleKeyMock).getPassword();
		doReturn(sslOptionsMock).when(sslBundleMock).getOptions();
		doReturn(null).when(sslOptionsMock).getCiphers();
		doReturn(null).when(sslOptionsMock).getEnabledProtocols();
		doReturn(sslStoreBundleMock).when(sslBundleMock).getStores();
		doReturn(null).when(sslStoreBundleMock).getKeyStorePassword();
		doReturn(keyStoreMock).when(sslStoreBundleMock).getKeyStore();
		doReturn(keyStoreMock2).when(sslStoreBundleMock).getTrustStore();
		doReturn("return_of_getProtocol1").when(sslBundleMock).getProtocol();
		//Act Statement(s)
		target.configureSsl(factoryMock, Ssl.ClientAuth.NONE);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(factoryMock).setProtocol("return_of_getProtocol1");
			verify(factoryMock).setWantClientAuth(false);
			verify(factoryMock).setNeedClientAuth(false);
			verify(factoryMock).setCertAlias("return_of_getAlias1");
			verify(factoryMock).setKeyStore(keyStoreMock);
			verify(factoryMock).setTrustStore(keyStoreMock2);
			verify(sslBundleMock).getKey();
			verify(sslBundleKeyMock).getAlias();
			verify(sslBundleKeyMock).getPassword();
			verify(sslBundleMock).getOptions();
			verify(sslOptionsMock).getCiphers();
			verify(sslOptionsMock).getEnabledProtocols();
			verify(sslBundleMock).getStores();
			verify(sslStoreBundleMock).getKeyStorePassword();
			verify(sslStoreBundleMock).getKeyStore();
			verify(sslStoreBundleMock).getTrustStore();
			verify(sslBundleMock).getProtocol();
		});
	}

	//Sapient generated method id: ${fb4659c7-ccc2-36bd-bc25-02a1e0ba2fd1}, hash: 775193A14EC10404CD1AFEC49ECDC4C3
	@Test()
	void configureSslWhenKeyGetPasswordIsNotNullAndCaughtExceptionThrowsIllegalStateException() {
		/* Branches:
		 * (clientAuth == ClientAuth.WANT) : false  #  inside configureSslClientAuth method
		 * (clientAuth == ClientAuth.NEED) : true  #  inside configureSslClientAuth method
		 * (clientAuth == ClientAuth.NEED) : true  #  inside configureSslClientAuth method
		 * (stores.getKeyStorePassword() != null) : true
		 * (options.getCiphers() != null) : true
		 * (options.getEnabledProtocols() != null) : true
		 * (key.getPassword() != null) : true
		 * (catch-exception (Exception)) : true
		 */
		//Arrange Statement(s)
		doNothing().when(factoryMock).setProtocol("return_of_getProtocol1");
		doNothing().when(factoryMock).setWantClientAuth(true);
		doNothing().when(factoryMock).setNeedClientAuth(true);
		doNothing().when(factoryMock).setKeyStorePassword("return_of_getKeyStorePassword1");
		doNothing().when(factoryMock).setCertAlias("return_of_getAlias1");
		String[] stringArray = new String[] {};
		doNothing().when(factoryMock).setIncludeCipherSuites(stringArray);
		String[] stringArray2 = new String[] {};
		doNothing().when(factoryMock).setExcludeCipherSuites(stringArray2);
		String[] stringArray3 = new String[] {};
		doNothing().when(factoryMock).setIncludeProtocols(stringArray3);
		String[] stringArray4 = new String[] {};
		doNothing().when(factoryMock).setExcludeProtocols(stringArray4);
		doNothing().when(factoryMock).setKeyManagerPassword("return_of_getPassword1");
		doNothing().when(factoryMock).setKeyStore(keyStoreMock);
		RuntimeException runtimeException = new RuntimeException("A");
		doThrow(runtimeException).when(factoryMock).setTrustStore(keyStoreMock2);
		InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
		SslServerCustomizer target = new SslServerCustomizer(http2Mock, inetSocketAddress, Ssl.ClientAuth.NONE, sslBundleMock);
		doReturn(sslBundleKeyMock).when(sslBundleMock).getKey();
		doReturn("return_of_getAlias1").when(sslBundleKeyMock).getAlias();
		doReturn("return_of_getPassword1").when(sslBundleKeyMock).getPassword();
		doReturn(sslOptionsMock).when(sslBundleMock).getOptions();
		String[] stringArray5 = new String[] {};
		doReturn(stringArray5, stringArray).when(sslOptionsMock).getCiphers();
		String[] stringArray6 = new String[] {};
		doReturn(stringArray6, stringArray3).when(sslOptionsMock).getEnabledProtocols();
		doReturn(sslStoreBundleMock).when(sslBundleMock).getStores();
		doReturn("return_of_getKeyStorePassword1").when(sslStoreBundleMock).getKeyStorePassword();
		doReturn(keyStoreMock).when(sslStoreBundleMock).getKeyStore();
		doReturn(keyStoreMock2).when(sslStoreBundleMock).getTrustStore();
		doReturn("return_of_getProtocol1").when(sslBundleMock).getProtocol();
		IllegalStateException illegalStateException = new IllegalStateException("Unable to set SSL store: A", runtimeException);
		//Act Statement(s)
		final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
			target.configureSsl(factoryMock, Ssl.ClientAuth.NEED);
		});
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
			assertThat(result.getCause(), is(instanceOf(runtimeException.getClass())));
			verify(factoryMock).setProtocol("return_of_getProtocol1");
			verify(factoryMock).setWantClientAuth(true);
			verify(factoryMock).setNeedClientAuth(true);
			verify(factoryMock).setKeyStorePassword("return_of_getKeyStorePassword1");
			verify(factoryMock).setCertAlias("return_of_getAlias1");
			verify(factoryMock).setIncludeCipherSuites(stringArray);
			verify(factoryMock).setExcludeCipherSuites(stringArray2);
			verify(factoryMock).setIncludeProtocols(stringArray3);
			verify(factoryMock).setExcludeProtocols(stringArray4);
			verify(factoryMock).setKeyManagerPassword("return_of_getPassword1");
			verify(factoryMock).setKeyStore(keyStoreMock);
			verify(factoryMock).setTrustStore(keyStoreMock2);
			verify(sslBundleMock).getKey();
			verify(sslBundleKeyMock).getAlias();
			verify(sslBundleKeyMock, times(2)).getPassword();
			verify(sslBundleMock).getOptions();
			verify(sslOptionsMock, times(2)).getCiphers();
			verify(sslOptionsMock, times(2)).getEnabledProtocols();
			verify(sslBundleMock).getStores();
			verify(sslStoreBundleMock, times(2)).getKeyStorePassword();
			verify(sslStoreBundleMock).getKeyStore();
			verify(sslStoreBundleMock).getTrustStore();
			verify(sslBundleMock).getProtocol();
		});
	}

	//Sapient generated method id: ${ccfd6a45-452a-32d0-8c5c-be99b5019ca9}, hash: 7BB5032EE4D4F207C967B00EB211EB85
	@Test()
	void configureSslWhenOptionsGetEnabledProtocolsIsNullAndKeyGetPasswordIsNullAndCaughtException4ThrowsIllegalStateException() {
		/* Branches:
		 * (clientAuth == ClientAuth.WANT) : false  #  inside configureSslClientAuth method
		 * (clientAuth == ClientAuth.NEED) : false  #  inside configureSslClientAuth method
		 * (clientAuth == ClientAuth.NEED) : false  #  inside configureSslClientAuth method
		 * (stores.getKeyStorePassword() != null) : false
		 * (options.getCiphers() != null) : false
		 * (options.getEnabledProtocols() != null) : false
		 * (key.getPassword() != null) : false
		 * (catch-exception (Exception)) : true
		 */
		//Arrange Statement(s)
		doNothing().when(factoryMock).setProtocol("return_of_getProtocol1");
		doNothing().when(factoryMock).setWantClientAuth(false);
		doNothing().when(factoryMock).setNeedClientAuth(false);
		doNothing().when(factoryMock).setCertAlias("return_of_getAlias1");
		doNothing().when(factoryMock).setKeyStore(keyStoreMock);
		RuntimeException runtimeException = new RuntimeException("A");
		doThrow(runtimeException).when(factoryMock).setTrustStore(keyStoreMock2);
		InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
		SslServerCustomizer target = new SslServerCustomizer(http2Mock, inetSocketAddress, Ssl.ClientAuth.NONE, sslBundleMock);
		doReturn(sslBundleKeyMock).when(sslBundleMock).getKey();
		doReturn("return_of_getAlias1").when(sslBundleKeyMock).getAlias();
		doReturn(null).when(sslBundleKeyMock).getPassword();
		doReturn(sslOptionsMock).when(sslBundleMock).getOptions();
		doReturn(null).when(sslOptionsMock).getCiphers();
		doReturn(null).when(sslOptionsMock).getEnabledProtocols();
		doReturn(sslStoreBundleMock).when(sslBundleMock).getStores();
		doReturn(null).when(sslStoreBundleMock).getKeyStorePassword();
		doReturn(keyStoreMock).when(sslStoreBundleMock).getKeyStore();
		doReturn(keyStoreMock2).when(sslStoreBundleMock).getTrustStore();
		doReturn("return_of_getProtocol1").when(sslBundleMock).getProtocol();
		IllegalStateException illegalStateException = new IllegalStateException("Unable to set SSL store: A", runtimeException);
		//Act Statement(s)
		final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
			target.configureSsl(factoryMock, Ssl.ClientAuth.NONE);
		});
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
			assertThat(result.getCause(), is(instanceOf(runtimeException.getClass())));
			verify(factoryMock).setProtocol("return_of_getProtocol1");
			verify(factoryMock).setWantClientAuth(false);
			verify(factoryMock).setNeedClientAuth(false);
			verify(factoryMock).setCertAlias("return_of_getAlias1");
			verify(factoryMock).setKeyStore(keyStoreMock);
			verify(factoryMock).setTrustStore(keyStoreMock2);
			verify(sslBundleMock).getKey();
			verify(sslBundleKeyMock).getAlias();
			verify(sslBundleKeyMock).getPassword();
			verify(sslBundleMock).getOptions();
			verify(sslOptionsMock).getCiphers();
			verify(sslOptionsMock).getEnabledProtocols();
			verify(sslBundleMock).getStores();
			verify(sslStoreBundleMock).getKeyStorePassword();
			verify(sslStoreBundleMock).getKeyStore();
			verify(sslStoreBundleMock).getTrustStore();
			verify(sslBundleMock).getProtocol();
		});
	}
}
