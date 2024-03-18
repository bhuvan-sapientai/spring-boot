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

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class WebServerManagerSapientGeneratedTest {

	private final WebServer webServerMock = mock(WebServer.class, "webServer");

	private final ReactiveWebServerApplicationContext applicationContextMock = mock(ReactiveWebServerApplicationContext.class, "applicationContext");

	private final ReactiveWebServerFactory factoryMock = mock(ReactiveWebServerFactory.class);

	private final Supplier supplierMock = mock(Supplier.class);

	//Sapient generated method id: ${a9331398-240e-36aa-9522-b3dc4bcf14ad}, hash: 76994BD0F4AAF9EC928F51FA3DB7FBB6
	@Test()
	void startTest() throws WebServerException {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: handler
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(webServerMock).when(factoryMock).getWebServer((HttpHandler) any());
			_assert.when(() -> Assert.notNull(factoryMock, "Factory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			WebServerManager target = new WebServerManager(applicationContextMock, factoryMock, supplierMock, false);
			doNothing().when(webServerMock).start();
			doNothing().when(applicationContextMock).publishEvent((ReactiveWebServerInitializedEvent) any());
			//Act Statement(s)
			target.start();
			//Assert statement(s)
			assertAll("result", () -> {
				verify(factoryMock).getWebServer((HttpHandler) any());
				_assert.verify(() -> Assert.notNull(factoryMock, "Factory must not be null"), atLeast(1));
				verify(webServerMock).start();
				verify(applicationContextMock).publishEvent((ReactiveWebServerInitializedEvent) any());
			});
		}
	}

	//Sapient generated method id: ${9c08dd10-71b8-3aa9-89c5-199d2fd9dc82}, hash: B90B9D779EA39815FDF7A72C7BD0FD88
	@Test()
	void shutDownGracefullyTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.web.reactive.context.WebServerManager$DelayedInitializationHttpHandler
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		GracefulShutdownCallback gracefulShutdownCallbackMock = mock(GracefulShutdownCallback.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(webServerMock).when(factoryMock).getWebServer((HttpHandler) any());
			_assert.when(() -> Assert.notNull(factoryMock, "Factory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			WebServerManager target = new WebServerManager(applicationContextMock, factoryMock, supplierMock, false);
			doNothing().when(webServerMock).shutDownGracefully(gracefulShutdownCallbackMock);
			//Act Statement(s)
			target.shutDownGracefully(gracefulShutdownCallbackMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(factoryMock).getWebServer((HttpHandler) any());
				_assert.verify(() -> Assert.notNull(factoryMock, "Factory must not be null"), atLeast(1));
				verify(webServerMock).shutDownGracefully(gracefulShutdownCallbackMock);
			});
		}
	}

	//Sapient generated method id: ${097b903c-1cba-3dd3-835e-b09bc597ebca}, hash: 20F503227B8A44E1826F24ADCF61F785
	@Test()
	void stopTest() throws WebServerException {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.web.reactive.context.WebServerManager$DelayedInitializationHttpHandler
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(webServerMock).when(factoryMock).getWebServer((HttpHandler) any());
			_assert.when(() -> Assert.notNull(factoryMock, "Factory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			WebServerManager target = new WebServerManager(applicationContextMock, factoryMock, supplierMock, false);
			doNothing().when(webServerMock).stop();
			//Act Statement(s)
			target.stop();
			//Assert statement(s)
			assertAll("result", () -> {
				verify(factoryMock).getWebServer((HttpHandler) any());
				_assert.verify(() -> Assert.notNull(factoryMock, "Factory must not be null"), atLeast(1));
				verify(webServerMock).stop();
			});
		}
	}

	//Sapient generated method id: ${18c3d65a-84a8-35bf-acec-396c7c976a5f}, hash: 735C6091D38423442CDC11664D6D53B1
	@Test()
	void getHandlerTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.web.reactive.context.WebServerManager$DelayedInitializationHttpHandler
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(webServerMock).when(factoryMock).getWebServer((HttpHandler) any());
			_assert.when(() -> Assert.notNull(factoryMock, "Factory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			WebServerManager target = new WebServerManager(applicationContextMock, factoryMock, supplierMock, false);
			//Act Statement(s)
			HttpHandler result = target.getHandler();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(factoryMock).getWebServer((HttpHandler) any());
				_assert.verify(() -> Assert.notNull(factoryMock, "Factory must not be null"), atLeast(1));
			});
		}
	}
}
