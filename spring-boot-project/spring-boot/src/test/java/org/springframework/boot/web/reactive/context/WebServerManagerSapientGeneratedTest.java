package org.springframework.boot.web.reactive.context;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.web.server.WebServerException;
import org.springframework.http.server.reactive.HttpHandler;

import org.mockito.stubbing.Answer;

import org.springframework.boot.web.reactive.server.ReactiveWebServerFactory;
import org.springframework.util.Assert;

import java.util.function.Supplier;

import org.springframework.boot.web.server.GracefulShutdownCallback;

import org.mockito.MockedStatic;

import org.springframework.boot.web.server.WebServer;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class WebServerManagerSapientGeneratedTest {

	private final WebServer webServerMock = mock(WebServer.class, "webServer");

	private final ReactiveWebServerApplicationContext applicationContextMock = mock(ReactiveWebServerApplicationContext.class, "applicationContext");

	private final ReactiveWebServerFactory factoryMock = mock(ReactiveWebServerFactory.class);

	//Sapient generated method id: ${a9331398-240e-36aa-9522-b3dc4bcf14ad}
	@Disabled()
	@Test()
	void startTest() throws WebServerException {
		/**
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: handler
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(webServerMock).when(factoryMock).getWebServer((WebServerManager.DelayedInitializationHttpHandler) any());
			_assert.when(() -> Assert.notNull(factoryMock, "Factory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			WebServerManager target = new WebServerManager(applicationContextMock, factoryMock, (Supplier) null, false);
			doNothing().when(webServerMock).start();
			doNothing().when(applicationContextMock).publishEvent((ReactiveWebServerInitializedEvent) any());
			//Act Statement(s)
			target.start();
			//Assert statement(s)
			assertAll("result", () -> {
				verify(factoryMock).getWebServer((WebServerManager.DelayedInitializationHttpHandler) any());
				_assert.verify(() -> Assert.notNull(factoryMock, "Factory must not be null"), atLeast(1));
				verify(webServerMock).start();
				verify(applicationContextMock).publishEvent((ReactiveWebServerInitializedEvent) any());
			});
		}
	}

	//Sapient generated method id: ${9c08dd10-71b8-3aa9-89c5-199d2fd9dc82}
	@Test()
	void shutDownGracefullyTest() {
		//Arrange Statement(s)
		GracefulShutdownCallback gracefulShutdownCallbackMock = mock(GracefulShutdownCallback.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(webServerMock).when(factoryMock).getWebServer((WebServerManager.DelayedInitializationHttpHandler) any());
			_assert.when(() -> Assert.notNull(factoryMock, "Factory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			WebServerManager target = new WebServerManager(applicationContextMock, factoryMock, (Supplier) null, false);
			doNothing().when(webServerMock).shutDownGracefully(gracefulShutdownCallbackMock);
			//Act Statement(s)
			target.shutDownGracefully(gracefulShutdownCallbackMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(factoryMock).getWebServer((WebServerManager.DelayedInitializationHttpHandler) any());
				_assert.verify(() -> Assert.notNull(factoryMock, "Factory must not be null"), atLeast(1));
				verify(webServerMock).shutDownGracefully(gracefulShutdownCallbackMock);
			});
		}
	}

	//Sapient generated method id: ${097b903c-1cba-3dd3-835e-b09bc597ebca}
	@Test()
	void stopTest() throws WebServerException {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(webServerMock).when(factoryMock).getWebServer((WebServerManager.DelayedInitializationHttpHandler) any());
			_assert.when(() -> Assert.notNull(factoryMock, "Factory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			WebServerManager target = new WebServerManager(applicationContextMock, factoryMock, (Supplier) null, false);
			doNothing().when(webServerMock).stop();
			//Act Statement(s)
			target.stop();
			//Assert statement(s)
			assertAll("result", () -> {
				verify(factoryMock).getWebServer((WebServerManager.DelayedInitializationHttpHandler) any());
				_assert.verify(() -> Assert.notNull(factoryMock, "Factory must not be null"), atLeast(1));
				verify(webServerMock).stop();
			});
		}
	}

	//Sapient generated method id: ${18c3d65a-84a8-35bf-acec-396c7c976a5f}
	@Test()
	void getHandlerTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(webServerMock).when(factoryMock).getWebServer((WebServerManager.DelayedInitializationHttpHandler) any());
			_assert.when(() -> Assert.notNull(factoryMock, "Factory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			WebServerManager target = new WebServerManager(applicationContextMock, factoryMock, (Supplier) null, false);
			//Act Statement(s)
			HttpHandler result = target.getHandler();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(factoryMock).getWebServer((WebServerManager.DelayedInitializationHttpHandler) any());
				_assert.verify(() -> Assert.notNull(factoryMock, "Factory must not be null"), atLeast(1));
			});
		}
	}
}
