package org.springframework.boot.web.embedded.jetty;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.boot.web.server.Ssl;

import org.eclipse.jetty.server.Handler;

import org.springframework.boot.web.server.Compression;
import org.springframework.util.StringUtils;
import org.springframework.util.Assert;
import org.springframework.boot.web.server.Http2;

import java.util.ArrayList;

import org.springframework.boot.ssl.SslBundle;
import org.springframework.http.server.reactive.JettyHttpHandlerAdapter;

import org.mockito.stubbing.Answer;

import org.springframework.boot.web.server.Shutdown;

import java.net.InetAddress;
import java.util.Collection;

import org.mockito.MockedStatic;

import org.springframework.boot.web.server.WebServer;

import org.eclipse.jetty.ee10.servlet.ServletContextHandler;
import org.eclipse.jetty.server.Server;

import org.springframework.boot.web.server.WebServerSslBundle;
import org.springframework.boot.ssl.SslBundles;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JettyReactiveWebServerFactorySapientGeneratedTest {

	private final HttpHandler httpHandlerMock = mock(HttpHandler.class);

	private final Server serverMock = mock(Server.class);

	//Sapient generated method id: ${5f66cbb7-c403-3301-8853-6614ed6f702e}, hash: A927E04D24A749722EB6BD66696C4136
	@Test()
	void getWebServerWhenGetPortGreaterThanOrEqualsTo0() {
		/* Branches:
		 * (getPort() >= 0) : true
		 */
		//Arrange Statement(s)
		JettyReactiveWebServerFactory target = spy(new JettyReactiveWebServerFactory(1));
		doReturn(serverMock).when(target).createJettyServer((JettyHttpHandlerAdapter) any());
		//Act Statement(s)
		WebServer result = target.getWebServer(httpHandlerMock);
		//Assert statement(s)
		//TODO: Please implement equals method in JettyWebServer for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(target).createJettyServer((JettyHttpHandlerAdapter) any());
		});
	}

	//Sapient generated method id: ${14758ef4-2182-345e-b8c8-f19fb3b0fe7e}, hash: F50E5C91B6B588BE208E2DB38582A966
	@Test()
	void getWebServerWhenGetPortLessThan0() {
		/* Branches:
		 * (getPort() >= 0) : false
		 */
		//Arrange Statement(s)
		JettyReactiveWebServerFactory target = spy(new JettyReactiveWebServerFactory(-1));
		doReturn(serverMock).when(target).createJettyServer((JettyHttpHandlerAdapter) any());
		//Act Statement(s)
		WebServer result = target.getWebServer(httpHandlerMock);
		//Assert statement(s)
		//TODO: Please implement equals method in JettyWebServer for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(target).createJettyServer((JettyHttpHandlerAdapter) any());
		});
	}

	//Sapient generated method id: ${fb80e7d7-8c60-33da-8458-f1afd8ca6e38}, hash: F60F49722E43C7BBD6EB63A539F72844
	@Test()
	void addServerCustomizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			JettyServerCustomizer[] jettyServerCustomizerArray = new JettyServerCustomizer[] {};
			_assert.when(() -> Assert.notNull(jettyServerCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			JettyReactiveWebServerFactory target = new JettyReactiveWebServerFactory(0);
			//Act Statement(s)
			target.addServerCustomizers(jettyServerCustomizerArray);
			//Assert statement(s)
			assertAll("result", () -> _assert.verify(() -> Assert.notNull(jettyServerCustomizerArray, "Customizers must not be null"), atLeast(1)));
		}
	}

	//Sapient generated method id: ${51b2282d-41b1-37d5-8131-c17098524b4c}, hash: 2E60D40609587CA99DA0C9353340E8B0
	@Test()
	void setServerCustomizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(anyCollection(), eq("Customizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			JettyReactiveWebServerFactory target = new JettyReactiveWebServerFactory(0);
			Collection<JettyServerCustomizer> collection = new ArrayList<>();
			//Act Statement(s)
			target.setServerCustomizers(collection);
			//Assert statement(s)
			assertAll("result", () -> _assert.verify(() -> Assert.notNull(anyCollection(), eq("Customizers must not be null"))));
		}
	}

	//Sapient generated method id: ${38b96686-48ed-33c3-bcb1-99b8a4d89ecd}, hash: 7EAEE934052AD2BA49E9F662CF44CAB1
	@Test()
	void getServerCustomizersTest() {
		//Arrange Statement(s)
		JettyReactiveWebServerFactory target = new JettyReactiveWebServerFactory(0);
		//Act Statement(s)
		Collection<JettyServerCustomizer> result = target.getServerCustomizers();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result.size(), equalTo(0)));
	}

	//Sapient generated method id: ${0eb39326-5478-3097-ab16-d004cf1e1fa6}, hash: 4602E700FF42139D7E83BA119BE7B122
	@Disabled()
	@Test()
	void createJettyServerWhenGetShutdownEqualsShutdownGRACEFUL() {
		/* Branches:
		 * (getHttp2() != null) : true  #  inside createConnector method
		 * (getHttp2().isEnabled()) : true  #  inside createConnector method
		 * (resourceFactory != null) : false  #  inside createConnector method
		 * (getCompression() != null) : true  #  inside addHandlerWrappers method
		 * (getCompression().getEnabled()) : true  #  inside addHandlerWrappers method
		 * (StringUtils.hasText(getServerHeader())) : true  #  inside addHandlerWrappers method
		 * (this.maxConnections > -1) : false
		 * (Ssl.isEnabled(getSsl())) : true
		 * (for-each(getServerCustomizers())) : false
		 * (this.useForwardHeaders) : false
		 * (getShutdown() == Shutdown.GRACEFUL) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: server, servletHolder, contextHandler
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Handler.Wrapper handlerWrapperMock = mock(Handler.Wrapper.class);
		Handler.Wrapper handlerWrapperMock2 = mock(Handler.Wrapper.class);
		SslBundle sslBundleMock = mock(SslBundle.class);
		JettyHttpHandlerAdapter jettyHttpHandlerAdapterMock = mock(JettyHttpHandlerAdapter.class);
		try (MockedStatic<WebServerSslBundle> webServerSslBundle = mockStatic(WebServerSslBundle.class);
			 MockedStatic<Ssl> ssl = mockStatic(Ssl.class);
			 MockedStatic<JettyHandlerWrappers> jettyHandlerWrappers = mockStatic(JettyHandlerWrappers.class)) {
			Compression compression = new Compression();
			compression.setEnabled(true);
			jettyHandlerWrappers.when(() -> JettyHandlerWrappers.createGzipHandlerWrapper(compression)).thenReturn(handlerWrapperMock);
			doNothing().when(handlerWrapperMock).setHandler((ServletContextHandler) any());
			jettyHandlerWrappers.when(() -> JettyHandlerWrappers.createServerHeaderHandlerWrapper("A")).thenReturn(handlerWrapperMock2);
			doNothing().when(handlerWrapperMock2).setHandler(handlerWrapperMock);
			Ssl ssl2 = new Ssl();
			ssl2.setClientAuth(Ssl.ClientAuth.NONE);
			ssl.when(() -> Ssl.isEnabled(ssl2)).thenReturn(true);
			webServerSslBundle.when(() -> WebServerSslBundle.get((Ssl) null, (SslBundles) null)).thenReturn(sslBundleMock);
			JettyReactiveWebServerFactory target = new JettyReactiveWebServerFactory(2);
			InetAddress inetAddress = InetAddress.getLoopbackAddress();
			target.setAddress(inetAddress);
			Http2 http2 = new Http2();
			http2.setEnabled(true);
			target.setHttp2(http2);
			target.setCompression(compression);
			target.setSsl(ssl2);
			target.setServerHeader("A");
			target.setShutdown(Shutdown.GRACEFUL);
			//Act Statement(s)
			Server result = target.createJettyServer(jettyHttpHandlerAdapterMock);
			//Assert statement(s)
			//TODO: Please implement equals method in Server for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				jettyHandlerWrappers.verify(() -> JettyHandlerWrappers.createGzipHandlerWrapper(compression), atLeast(1));
				verify(handlerWrapperMock).setHandler((ServletContextHandler) any());
				jettyHandlerWrappers.verify(() -> JettyHandlerWrappers.createServerHeaderHandlerWrapper("A"), atLeast(1));
				verify(handlerWrapperMock2).setHandler(handlerWrapperMock);
				ssl.verify(() -> Ssl.isEnabled(ssl2), atLeast(1));
				webServerSslBundle.verify(() -> WebServerSslBundle.get((Ssl) null, (SslBundles) null), atLeast(1));
			});
		}
	}
}
