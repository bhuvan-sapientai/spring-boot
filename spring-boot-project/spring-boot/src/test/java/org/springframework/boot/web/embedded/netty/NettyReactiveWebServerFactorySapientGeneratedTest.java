package org.springframework.boot.web.embedded.netty;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.springframework.boot.ssl.NoSuchSslBundleException;

import java.util.List;

import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.boot.web.server.Ssl;

import org.mockito.MockitoAnnotations;

import org.springframework.boot.web.server.Compression;
import org.springframework.util.StringUtils;
import org.springframework.util.Assert;

import java.time.Duration;

import org.springframework.boot.web.server.Http2;

import java.util.ArrayList;
import java.util.function.Consumer;

import org.springframework.boot.ssl.SslBundle;
import org.springframework.http.server.reactive.ReactorHttpHandlerAdapter;

import org.mockito.stubbing.Answer;

import org.springframework.boot.web.server.Shutdown;

import java.util.Collection;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import org.springframework.boot.web.server.WebServer;

import reactor.netty.http.server.HttpServer;

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
class NettyReactiveWebServerFactorySapientGeneratedTest {

	private AutoCloseable autoCloseableMocks;

	@InjectMocks()
	private NettyReactiveWebServerFactory target;

	@AfterEach()
	public void afterTest() throws Exception {
		if (autoCloseableMocks != null)
			autoCloseableMocks.close();
	}

	//Sapient generated method id: ${bed455b5-a7d9-395b-80f9-6dc7ef14f571}, hash: D091D5363658B1A84CE69A5638B94374
	@Disabled()
	@Test()
	void getWebServerWhenGetSslIsEnabledAndThisServerCustomizersIsEmpty() throws NoSuchSslBundleException {
		/* Branches:
		 * (Ssl.isEnabled(getSsl())) : true  #  inside createHttpServer method
		 * (StringUtils.hasText(bundleName)) : true  #  inside customizeSslConfiguration method
		 * (getCompression() != null) : true  #  inside createHttpServer method
		 * (getCompression().getEnabled()) : true  #  inside createHttpServer method
		 * (getHttp2() != null) : true  #  inside listProtocols method
		 * (getHttp2().isEnabled()) : true  #  inside listProtocols method
		 * (getSsl() != null) : true  #  inside listProtocols method
		 * (getSsl().isEnabled()) : true  #  inside listProtocols method
		 * (for-each(this.serverCustomizers)) : false  #  inside applyCustomizers method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.web.embedded.netty.SslServerCustomizer
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SslBundles sslBundlesMock = mock(SslBundles.class);
		HttpServer httpServerMock = mock(HttpServer.class);
		HttpServer httpServerMock2 = mock(HttpServer.class);
		SslBundle sslBundleMock = mock(SslBundle.class);
		HttpServer httpServer2Mock = mock(HttpServer.class);
		ReactorHttpHandlerAdapter reactorHttpHandlerAdapterMock = mock(ReactorHttpHandlerAdapter.class);
		HttpHandler httpHandlerMock = mock(HttpHandler.class);
		try (MockedStatic<WebServerSslBundle> webServerSslBundle = mockStatic(WebServerSslBundle.class);
			 MockedStatic<Ssl> ssl = mockStatic(Ssl.class);
			 MockedStatic<HttpServer> httpServer = mockStatic(HttpServer.class)) {
			doNothing().when(sslBundlesMock).addBundleUpdateHandler(eq("A"), (Consumer) any());
			httpServer.when(() -> HttpServer.create()).thenReturn(httpServerMock);
			doReturn(httpServerMock2).when(httpServerMock).bindAddress((Supplier) any());
			Ssl ssl2 = new Ssl();
			ssl2.setBundle("A");
			ssl2.setClientAuth(Ssl.ClientAuth.NONE);
			ssl2.setEnabled(true);
			ssl.when(() -> Ssl.isEnabled(ssl2)).thenReturn(true);
			webServerSslBundle.when(() -> WebServerSslBundle.get((Ssl) null, (SslBundles) null)).thenReturn(sslBundleMock);
			target = spy(new NettyReactiveWebServerFactory(0));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			Http2 http2 = new Http2();
			http2.setEnabled(true);
			target.setHttp2(http2);
			Compression compression = new Compression();
			compression.setEnabled(true);
			target.setCompression(compression);
			target.setSsl(ssl2);
			target.setShutdown(Shutdown.GRACEFUL);
			target.setSslBundles(sslBundlesMock);
			Duration duration = Duration.ofDays(0L);
			List<NettyRouteProvider> nettyRouteProviderList = new ArrayList<>();
			NettyWebServer nettyWebServer = new NettyWebServer(httpServer2Mock, reactorHttpHandlerAdapterMock, duration, Shutdown.GRACEFUL);
			nettyWebServer.setRouteProviders(nettyRouteProviderList);
			doReturn(nettyWebServer).when(target).createNettyWebServer((HttpServer) any(), (ReactorHttpHandlerAdapter) any(), eq((Duration) null), eq(Shutdown.GRACEFUL));
			//Act Statement(s)
			WebServer result = target.getWebServer(httpHandlerMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(nettyWebServer));
				verify(sslBundlesMock).addBundleUpdateHandler(eq("A"), (Consumer) any());
				httpServer.verify(() -> HttpServer.create(), atLeast(1));
				verify(httpServerMock).bindAddress((Supplier) any());
				ssl.verify(() -> Ssl.isEnabled(ssl2), atLeast(1));
				webServerSslBundle.verify(() -> WebServerSslBundle.get((Ssl) null, (SslBundles) null), atLeast(1));
				verify(target).createNettyWebServer((HttpServer) any(), (ReactorHttpHandlerAdapter) any(), eq((Duration) null), eq(Shutdown.GRACEFUL));
			});
		}
	}

	//Sapient generated method id: ${809f3ba2-d9d0-3ad9-8cc6-b2bee6459512}, hash: DA7F3CB3E9A8E088EF57AF26BB50FF2E
	@Disabled()
	@Test()
	void getWebServerWhenGetSslNotIsEnabledAndThisServerCustomizersIsEmpty() throws NoSuchSslBundleException {
		/* Branches:
		 * (Ssl.isEnabled(getSsl())) : true  #  inside createHttpServer method
		 * (StringUtils.hasText(bundleName)) : true  #  inside customizeSslConfiguration method
		 * (getCompression() != null) : true  #  inside createHttpServer method
		 * (getCompression().getEnabled()) : true  #  inside createHttpServer method
		 * (getHttp2() != null) : true  #  inside listProtocols method
		 * (getHttp2().isEnabled()) : true  #  inside listProtocols method
		 * (getSsl() != null) : true  #  inside listProtocols method
		 * (getSsl().isEnabled()) : false  #  inside listProtocols method
		 * (for-each(this.serverCustomizers)) : false  #  inside applyCustomizers method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.web.embedded.netty.SslServerCustomizer
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SslBundles sslBundlesMock = mock(SslBundles.class);
		HttpServer httpServerMock = mock(HttpServer.class);
		HttpServer httpServerMock2 = mock(HttpServer.class);
		SslBundle sslBundleMock = mock(SslBundle.class);
		HttpServer httpServer2Mock = mock(HttpServer.class);
		ReactorHttpHandlerAdapter reactorHttpHandlerAdapterMock = mock(ReactorHttpHandlerAdapter.class);
		HttpHandler httpHandlerMock = mock(HttpHandler.class);
		try (MockedStatic<WebServerSslBundle> webServerSslBundle = mockStatic(WebServerSslBundle.class);
			 MockedStatic<Ssl> ssl = mockStatic(Ssl.class);
			 MockedStatic<HttpServer> httpServer = mockStatic(HttpServer.class)) {
			doNothing().when(sslBundlesMock).addBundleUpdateHandler(eq("A"), (Consumer) any());
			httpServer.when(() -> HttpServer.create()).thenReturn(httpServerMock);
			doReturn(httpServerMock2).when(httpServerMock).bindAddress((Supplier) any());
			Ssl ssl2 = new Ssl();
			ssl2.setBundle("A");
			ssl2.setClientAuth(Ssl.ClientAuth.NONE);
			ssl2.setEnabled(false);
			ssl.when(() -> Ssl.isEnabled(ssl2)).thenReturn(true);
			webServerSslBundle.when(() -> WebServerSslBundle.get((Ssl) null, (SslBundles) null)).thenReturn(sslBundleMock);
			target = spy(new NettyReactiveWebServerFactory(0));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			Http2 http2 = new Http2();
			http2.setEnabled(true);
			target.setHttp2(http2);
			Compression compression = new Compression();
			compression.setEnabled(true);
			target.setCompression(compression);
			target.setSsl(ssl2);
			target.setShutdown(Shutdown.GRACEFUL);
			target.setSslBundles(sslBundlesMock);
			Duration duration = Duration.ofDays(0L);
			List<NettyRouteProvider> nettyRouteProviderList = new ArrayList<>();
			NettyWebServer nettyWebServer = new NettyWebServer(httpServer2Mock, reactorHttpHandlerAdapterMock, duration, Shutdown.GRACEFUL);
			nettyWebServer.setRouteProviders(nettyRouteProviderList);
			doReturn(nettyWebServer).when(target).createNettyWebServer((HttpServer) any(), (ReactorHttpHandlerAdapter) any(), eq((Duration) null), eq(Shutdown.GRACEFUL));
			//Act Statement(s)
			WebServer result = target.getWebServer(httpHandlerMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(nettyWebServer));
				verify(sslBundlesMock).addBundleUpdateHandler(eq("A"), (Consumer) any());
				httpServer.verify(() -> HttpServer.create(), atLeast(1));
				verify(httpServerMock).bindAddress((Supplier) any());
				ssl.verify(() -> Ssl.isEnabled(ssl2), atLeast(1));
				webServerSslBundle.verify(() -> WebServerSslBundle.get((Ssl) null, (SslBundles) null), atLeast(1));
				verify(target).createNettyWebServer((HttpServer) any(), (ReactorHttpHandlerAdapter) any(), eq((Duration) null), eq(Shutdown.GRACEFUL));
			});
		}
	}

	//Sapient generated method id: ${9f5f46b8-28a4-3adf-baae-873498972510}, hash: AC7BBEF257D545AA8DC4DC0104C3FAF7
	@Test()
	void createNettyWebServerTest() {
		//Arrange Statement(s)
		target = new NettyReactiveWebServerFactory(0);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		HttpServer httpServerMock = mock(HttpServer.class);
		ReactorHttpHandlerAdapter reactorHttpHandlerAdapterMock = mock(ReactorHttpHandlerAdapter.class);
		Duration duration = Duration.ofDays(0L);
		//Act Statement(s)
		NettyWebServer result = target.createNettyWebServer(httpServerMock, reactorHttpHandlerAdapterMock, duration, Shutdown.GRACEFUL);
		//Assert statement(s)
		//TODO: Please implement equals method in NettyWebServer for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${38b96686-48ed-33c3-bcb1-99b8a4d89ecd}, hash: D027F53A91AD6CF42DEA76965010B7ED
	@Test()
	void getServerCustomizersTest() {
		//Arrange Statement(s)
		target = new NettyReactiveWebServerFactory(0);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		//Act Statement(s)
		Collection<NettyServerCustomizer> result = target.getServerCustomizers();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result.size(), equalTo(0)));
	}

	//Sapient generated method id: ${51b2282d-41b1-37d5-8131-c17098524b4c}, hash: 8F93C1CAD9AA1DC662C25C6791F2A8F7
	@Test()
	void setServerCustomizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(anyCollection(), eq("ServerCustomizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			target = new NettyReactiveWebServerFactory(0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			Collection<NettyServerCustomizer> collection = new ArrayList<>();
			//Act Statement(s)
			target.setServerCustomizers(collection);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(target.getServerCustomizers().size(), equalTo(0));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("ServerCustomizers must not be null")));
			});
		}
	}

	//Sapient generated method id: ${fb80e7d7-8c60-33da-8458-f1afd8ca6e38}, hash: 5EF19437DEF6D6021FFDF221F921412D
	@Test()
	void addServerCustomizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			NettyServerCustomizer[] nettyServerCustomizerArray = new NettyServerCustomizer[] {};
			_assert.when(() -> Assert.notNull(nettyServerCustomizerArray, "ServerCustomizer must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new NettyReactiveWebServerFactory(0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			target.addServerCustomizers(nettyServerCustomizerArray);
			//Assert statement(s)
			assertAll("result", () -> _assert.verify(() -> Assert.notNull(nettyServerCustomizerArray, "ServerCustomizer must not be null"), atLeast(1)));
		}
	}

	//Sapient generated method id: ${527c51d8-0f01-30e2-aa6d-26bc023e0f47}, hash: BFB68ACA3408344A04311D24800A8B71
	@Test()
	void addRouteProvidersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			NettyRouteProvider[] nettyRouteProviderArray = new NettyRouteProvider[] {};
			_assert.when(() -> Assert.notNull(nettyRouteProviderArray, "NettyRouteProvider must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new NettyReactiveWebServerFactory(0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			target.addRouteProviders(nettyRouteProviderArray);
			//Assert statement(s)
			assertAll("result", () -> _assert.verify(() -> Assert.notNull(nettyRouteProviderArray, "NettyRouteProvider must not be null"), atLeast(1)));
		}
	}
}
