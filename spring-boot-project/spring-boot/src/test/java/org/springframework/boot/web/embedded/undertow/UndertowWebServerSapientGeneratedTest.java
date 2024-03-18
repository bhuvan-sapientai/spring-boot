package org.springframework.boot.web.embedded.undertow;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.web.server.WebServerException;

import java.util.List;

import org.mockito.stubbing.Answer;
import io.undertow.Undertow;

import java.lang.reflect.Field;
import java.net.SocketAddress;

import org.springframework.boot.web.server.PortInUseException;
import org.springframework.util.StringUtils;

import io.undertow.server.HttpHandler;

import org.springframework.boot.web.server.GracefulShutdownCallback;

import org.xnio.channels.BoundChannel;
import org.mockito.MockedStatic;

import java.net.InetSocketAddress;
import java.util.ArrayList;

import org.springframework.boot.web.server.GracefulShutdownResult;

import java.util.function.Consumer;

import org.springframework.util.ReflectionUtils;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.anyList;
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
class UndertowWebServerSapientGeneratedTest {

	private final Undertow.Builder builderMock = mock(Undertow.Builder.class, "builder");

	private final Undertow undertowMock = mock(Undertow.class, "undertow");

	private final Iterable httpHandlerFactoriesMock = mock(Iterable.class, "httpHandlerFactories");

	private final BoundChannel boundChannelMock = mock(BoundChannel.class);

	private final Field fieldMock = mock(Field.class);

	private final HttpHandler httpHandlerMock = mock(HttpHandler.class);

	private final SocketAddress socketAddressMock = mock(SocketAddress.class);

	private final Undertow.Builder undertowBuilderMock = mock(Undertow.Builder.class);

	//Sapient generated method id: ${a9d26b1d-b052-3aa9-8be7-a8e08feee890}, hash: FD83403E3B2D17F44E0D84C938D36F57
	@Test()
	void startWhenThisNotAutoStart() throws Exception {
		/* Branches:
		 * (this.started) : false
		 * (!this.autoStart) : true
		 */
		//Arrange Statement(s)
		UndertowWebServer target = new UndertowWebServer(builderMock, httpHandlerFactoriesMock, false);
		//Act Statement(s)
		target.start();
	}

	//Sapient generated method id: ${72b1fe02-a874-30cd-a7ee-027a65908323}, hash: 24030344C59FB05773D7A6D703E93D07
	@Test()
	void startWhenThisUndertowIsNull() throws Exception {
		/* Branches:
		 * (this.started) : false
		 * (!this.autoStart) : false
		 * (this.undertow == null) : true
		 */
		//Arrange Statement(s)
		UndertowWebServer target = spy(new UndertowWebServer(builderMock, httpHandlerFactoriesMock, true));
		doReturn(httpHandlerMock).when(target).createHttpHandler();
		doReturn(undertowBuilderMock).when(builderMock).setHandler(httpHandlerMock);
		doReturn(undertowMock).when(builderMock).build();
		doNothing().when(undertowMock).start();
		doReturn("return_of_getStartLogMessage1").when(target).getStartLogMessage();
		//Act Statement(s)
		target.start();
		//Assert statement(s)
		assertAll("result", () -> {
			verify(target).createHttpHandler();
			verify(builderMock).setHandler(httpHandlerMock);
			verify(builderMock).build();
			verify(undertowMock).start();
			verify(target).getStartLogMessage();
		});
	}

	//Sapient generated method id: ${5d51c080-e196-328e-bd48-210aefd80a71}, hash: 5CE7EC89389BD5A110BCF5943DA249AA
	@Test()
	void startWhenThisUndertowIsNullAndCaughtExceptionThrowsWebServerException() throws WebServerException {
		/* Branches:
		 * (this.started) : false
		 * (!this.autoStart) : false
		 * (this.undertow == null) : true
		 * (catch-exception (Exception)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<PortInUseException> portInUseException = mockStatic(PortInUseException.class)) {
			RuntimeException runtimeException = new RuntimeException();
			portInUseException.when(() -> PortInUseException.ifPortBindingException(eq(runtimeException), (Consumer) any())).thenAnswer((Answer<Void>) invocation -> null);
			UndertowWebServer target = spy(new UndertowWebServer(builderMock, httpHandlerFactoriesMock, true));
			doReturn(httpHandlerMock).when(target).createHttpHandler();
			doReturn(undertowBuilderMock).when(builderMock).setHandler(httpHandlerMock);
			doReturn(undertowMock).when(builderMock).build();
			doNothing().when(undertowMock).start();
			doThrow(runtimeException).when(target).getStartLogMessage();
			//Act Statement(s)
			final WebServerException result = assertThrows(WebServerException.class, () -> {
				target.start();
			});
			WebServerException webServerException = new WebServerException("Unable to start embedded Undertow", runtimeException);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(webServerException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(runtimeException.getClass())));
				portInUseException.verify(() -> PortInUseException.ifPortBindingException(eq(runtimeException), (Consumer) any()));
				verify(target).createHttpHandler();
				verify(builderMock).setHandler(httpHandlerMock);
				verify(builderMock).build();
				verify(undertowMock).start();
				verify(target).getStartLogMessage();
			});
		}
	}

	//Sapient generated method id: ${bce356d1-3408-3972-88e7-32a4ff978b98}, hash: 00C868B63A9833FDF81FB0AF275849E5
	@Disabled()
	@Test()
	void createHttpHandlerWhenHandlerInstanceOfGracefulShutdownHandler() {
		/* Branches:
		 * (for-each(this.httpHandlerFactories)) : true
		 * (handler instanceof Closeable closeable) : false
		 * (handler instanceof GracefulShutdownHandler shutdownHandler) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowWebServer target = new UndertowWebServer(builderMock, httpHandlerFactoriesMock, false);
		doReturn(null).when(httpHandlerFactoriesMock).iterator();
		//Act Statement(s)
		HttpHandler result = target.createHttpHandler();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(httpHandlerFactoriesMock).iterator();
		});
	}

	//Sapient generated method id: ${dbaf732f-9acf-3bfe-b890-88ca64779005}, hash: C0F4E3499137FC5685BBB06E46785987
	@Test()
	void stopWhenThisNotStarted() throws Exception {
		/* Branches:
		 * (!this.started) : true
		 */
		//Arrange Statement(s)
		UndertowWebServer target = new UndertowWebServer(builderMock, httpHandlerFactoriesMock, false);
		//Act Statement(s)
		target.stop();
	}

	//Sapient generated method id: ${e70a3126-9163-3827-8e70-d76279a7d8c9}, hash: E7428D7CAD8CA68272C569C3A841D977
	@Disabled()
	@Test()
	void getPortWhenPortsNotIsEmpty() throws Exception {
		/* Branches:
		 * (!this.autoStart) : true  #  inside getActualPorts method
		 * (ports.isEmpty()) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type UndertowWebServer.Port
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowWebServer target = new UndertowWebServer(builderMock, httpHandlerFactoriesMock, false);
		//Act Statement(s)
		int result = target.getPort();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(0)));
	}

	//Sapient generated method id: ${9c98df0b-2304-3e20-9ea8-800d4ee08a6c}, hash: A3B80B746A6ACB40CF308408B2D493E0
	@Test()
	void getPortWhenPortsIsEmpty() throws Exception {
		/* Branches:
		 * (!this.autoStart) : false  #  inside getActualPorts method
		 * (for-each(extractChannels())) : false  #  inside getActualPorts method
		 * (ports.isEmpty()) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
			List list = new ArrayList<>();
			reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
			UndertowWebServer target = new UndertowWebServer(builderMock, httpHandlerFactoriesMock, true);
			//Act Statement(s)
			int result = target.getPort();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(-1));
				reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${0ec9f396-f409-3df6-a189-6ae2879db68f}, hash: BF9BE0A7445AE67B1EFD0AE1A66C9094
	@Test()
	void getPortWhenPortsNotIsEmptyThrowsNullPointerException() {
		/* Branches:
		 * (!this.autoStart) : false  #  inside getActualPorts method
		 * (for-each(extractChannels())) : true  #  inside getActualPorts method
		 * (socketAddress instanceof InetSocketAddress inetSocketAddress) : false  #  inside getPortFromChannel method
		 * (ports.isEmpty()) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
			List list = new ArrayList<>();
			list.add(boundChannelMock);
			reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
			doReturn(socketAddressMock).when(boundChannelMock).getLocalAddress();
			UndertowWebServer target = new UndertowWebServer(builderMock, httpHandlerFactoriesMock, true);
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				target.getPort();
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
				verify(boundChannelMock, atLeast(1)).getLocalAddress();
			});
		}
	}

	//Sapient generated method id: ${df46f632-d9c9-3187-b430-87ca9ad69f07}, hash: 617154BAA4B275AD47B89AFA4DBA2D82
	@Test()
	void getPortWhenCaughtExceptionAndPortsIsEmpty() throws Exception {
		/* Branches:
		 * (!this.autoStart) : false  #  inside getActualPorts method
		 * (for-each(extractChannels())) : false  #  inside getActualPorts method
		 * (catch-exception (Exception)) : true  #  inside getActualPorts method
		 * (ports.isEmpty()) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
			RuntimeException runtimeException = new RuntimeException();
			reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenThrow(runtimeException);
			UndertowWebServer target = new UndertowWebServer(builderMock, httpHandlerFactoriesMock, true);
			//Act Statement(s)
			int result = target.getPort();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(-1));
				reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f0b82f10-da3d-3b2a-b5c3-59432f5f408c}, hash: 774B151CCA8D77C6E4E7E6D75BB2E875
	@Test()
	void getPortWhenSslFieldIsNotNullAndPortsNotIsEmpty() throws Exception {
		/* Branches:
		 * (!this.autoStart) : false  #  inside getActualPorts method
		 * (for-each(extractChannels())) : true  #  inside getActualPorts method
		 * (socketAddress instanceof InetSocketAddress inetSocketAddress) : true  #  inside getPortFromChannel method
		 * (sslField != null) : true  #  inside getPortFromChannel method
		 * (ports.isEmpty()) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type UndertowWebServer.Port
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
			List list = new ArrayList<>();
			list.add(boundChannelMock);
			reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
			InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
			doReturn(inetSocketAddress).when(boundChannelMock).getLocalAddress();
			reflectionUtils.when(() -> ReflectionUtils.findField(BoundChannel.class, "ssl")).thenReturn(fieldMock);
			UndertowWebServer target = new UndertowWebServer(builderMock, httpHandlerFactoriesMock, true);
			//Act Statement(s)
			int result = target.getPort();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(0));
				reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
				verify(boundChannelMock, atLeast(1)).getLocalAddress();
				reflectionUtils.verify(() -> ReflectionUtils.findField(BoundChannel.class, "ssl"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c2576459-a768-3070-9d30-014b18d4fb4f}, hash: 114D7056772626C5089BAAFB799639D4
	@Test()
	void getPortWhenSslFieldIsNullAndPortsNotIsEmpty() throws Exception {
		/* Branches:
		 * (!this.autoStart) : false  #  inside getActualPorts method
		 * (for-each(extractChannels())) : true  #  inside getActualPorts method
		 * (socketAddress instanceof InetSocketAddress inetSocketAddress) : true  #  inside getPortFromChannel method
		 * (sslField != null) : false  #  inside getPortFromChannel method
		 * (ports.isEmpty()) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type UndertowWebServer.Port
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
			List list = new ArrayList<>();
			list.add(boundChannelMock);
			reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
			InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
			doReturn(inetSocketAddress).when(boundChannelMock).getLocalAddress();
			reflectionUtils.when(() -> ReflectionUtils.findField(BoundChannel.class, "ssl")).thenReturn(null);
			UndertowWebServer target = new UndertowWebServer(builderMock, httpHandlerFactoriesMock, true);
			//Act Statement(s)
			int result = target.getPort();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(0));
				reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
				verify(boundChannelMock, atLeast(1)).getLocalAddress();
				reflectionUtils.verify(() -> ReflectionUtils.findField(BoundChannel.class, "ssl"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a6f9d49a-b01b-391e-9064-5f43b3583a18}, hash: AB1CB4F93848A8F6E496CD1B3BF746E5
	@Test()
	void getPortWhenCaughtExceptionAndPortsNotIsEmptyThrowsNullPointerException() throws Exception {
		/* Branches:
		 * (!this.autoStart) : false  #  inside getActualPorts method
		 * (for-each(extractChannels())) : true  #  inside getActualPorts method
		 * (socketAddress instanceof InetSocketAddress inetSocketAddress) : false  #  inside getPortFromChannel method
		 * (catch-exception (Exception)) : true  #  inside getActualPorts method
		 * (ports.isEmpty()) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
			List list = new ArrayList<>();
			list.add(boundChannelMock);
			reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
			RuntimeException runtimeException = new RuntimeException();
			doThrow(runtimeException).when(boundChannelMock).getLocalAddress();
			UndertowWebServer target = new UndertowWebServer(builderMock, httpHandlerFactoriesMock, true);
			//Act Statement(s)
			int result = target.getPort();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(-1));
				reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
				verify(boundChannelMock, atLeast(1)).getLocalAddress();
			});
		}
	}

	//Sapient generated method id: ${16c0182e-221b-3b7d-bbe6-bc0789d240a3}, hash: 37EAA5E4F74486CCE91D68ACE8AAEE69
	@Disabled()
	@Test()
	void getPortWhenCaughtExceptionAndPortsNotIsEmpty() throws Exception {
		/* Branches:
		 * (!this.autoStart) : false  #  inside getActualPorts method
		 * (for-each(extractChannels())) : true  #  inside getActualPorts method
		 * (socketAddress instanceof InetSocketAddress inetSocketAddress) : true  #  inside getPortFromChannel method
		 * (sslField != null) : true  #  inside getPortFromChannel method
		 * (catch-exception (Exception)) : true  #  inside getActualPorts method
		 * (ports.isEmpty()) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type UndertowWebServer.Port
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowWebServer target = new UndertowWebServer(builderMock, httpHandlerFactoriesMock, false);
		//Act Statement(s)
		int result = target.getPort();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(0)));
	}

	//Sapient generated method id: ${57d12bb9-c0cb-3775-bb8f-a1541c0d5bab}, hash: B01204C365DBCA6D0A14D22ECDFFD638
	@Test()
	void shutDownGracefullyWhenThisGracefulShutdownIsNull() {
		/* Branches:
		 * (this.gracefulShutdown == null) : true
		 */
		//Arrange Statement(s)
		GracefulShutdownCallback callbackMock = mock(GracefulShutdownCallback.class);
		doNothing().when(callbackMock).shutdownComplete(GracefulShutdownResult.IMMEDIATE);
		UndertowWebServer target = new UndertowWebServer(builderMock, httpHandlerFactoriesMock, false);
		//Act Statement(s)
		target.shutDownGracefully(callbackMock);
		//Assert statement(s)
		assertAll("result", () -> verify(callbackMock).shutdownComplete(GracefulShutdownResult.IMMEDIATE));
	}

	//Sapient generated method id: ${b3b6879f-ffa2-3887-9ce9-3308aad8052d}, hash: 4D0EDBC3BEB3067B80B496B5DFD65FC0
	@Disabled()
	@Test()
	void getStartLogMessageWhenPortsNotIsEmpty() throws Exception {
		/* Branches:
		 * (!this.autoStart) : true  #  inside getActualPorts method
		 * (ports.size() != 1) : false  #  inside getPortsDescription method
		 * (!ports.isEmpty()) : true  #  inside getPortsDescription method
		 */
		//Arrange Statement(s)
		UndertowWebServer target = new UndertowWebServer(builderMock, httpHandlerFactoriesMock, false);
		//Act Statement(s)
		String result = target.getStartLogMessage();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("Undertow started on port null")));
	}

	//Sapient generated method id: ${8ca856c2-28d5-3c47-944e-71bbbc7f42df}, hash: 2CEA25D4FFA150EE75EEA21401E95FE7
	@Test()
	void getStartLogMessageWhenPortsIsEmpty() throws Exception {
		/* Branches:
		 * (!this.autoStart) : false  #  inside getActualPorts method
		 * (for-each(extractChannels())) : false  #  inside getActualPorts method
		 * (ports.size() != 1) : true  #  inside getPortsDescription method
		 * (!ports.isEmpty()) : false  #  inside getPortsDescription method
		 */
		//Arrange Statement(s)
		try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
			List list = new ArrayList<>();
			reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
			UndertowWebServer target = new UndertowWebServer(builderMock, httpHandlerFactoriesMock, true);
			//Act Statement(s)
			String result = target.getStartLogMessage();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("Undertow started on ports unknown"));
				reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${2bacc24c-129e-3ca0-93d1-7c5957a557eb}, hash: 10F1273FFAC76EEE1D191BAA8C9754B6
	@Disabled()
	@Test()
	void getStartLogMessageWhenPortsSizeEquals1AndPortsNotIsEmpty() throws Exception {
		/* Branches:
		 * (!this.autoStart) : false  #  inside getActualPorts method
		 * (for-each(extractChannels())) : true  #  inside getActualPorts method
		 * (socketAddress instanceof InetSocketAddress inetSocketAddress) : false  #  inside getPortFromChannel method
		 * (ports.size() != 1) : false  #  inside getPortsDescription method
		 * (!ports.isEmpty()) : true  #  inside getPortsDescription method
		 */
		//Arrange Statement(s)
		try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
			List list = new ArrayList<>();
			list.add(boundChannelMock);
			reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
			doReturn(socketAddressMock).when(boundChannelMock).getLocalAddress();
			UndertowWebServer target = new UndertowWebServer(builderMock, httpHandlerFactoriesMock, true);
			//Act Statement(s)
			String result = target.getStartLogMessage();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("Undertow started on port "));
				reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
				verify(boundChannelMock, atLeast(1)).getLocalAddress();
			});
		}
	}

	//Sapient generated method id: ${7c2a2a6f-0fb0-3880-ae19-761ef4f22476}, hash: 4925703195E7ADCDC89DE3F086865616
	@Test()
	void getStartLogMessageWhenPortsSizeNotEquals1AndPortsIsEmpty() throws Exception {
		/* Branches:
		 * (!this.autoStart) : false  #  inside getActualPorts method
		 * (for-each(extractChannels())) : false  #  inside getActualPorts method
		 * (catch-exception (Exception)) : true  #  inside getActualPorts method
		 * (ports.size() != 1) : true  #  inside getPortsDescription method
		 * (!ports.isEmpty()) : false  #  inside getPortsDescription method
		 */
		//Arrange Statement(s)
		try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
			RuntimeException runtimeException = new RuntimeException();
			reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenThrow(runtimeException);
			UndertowWebServer target = new UndertowWebServer(builderMock, httpHandlerFactoriesMock, true);
			//Act Statement(s)
			String result = target.getStartLogMessage();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("Undertow started on ports unknown"));
				reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${2a523ab2-7dda-3c54-9f27-610a6b9f8cf2}, hash: 7DFCF812BEE62FAAC77DBDF28560E3FB
	@Disabled()
	@Test()
	void getStartLogMessageWhenSslFieldIsNotNullAndPortsSizeEquals1AndPortsNotIsEmpty() throws Exception {
		/* Branches:
		 * (!this.autoStart) : false  #  inside getActualPorts method
		 * (for-each(extractChannels())) : true  #  inside getActualPorts method
		 * (socketAddress instanceof InetSocketAddress inetSocketAddress) : true  #  inside getPortFromChannel method
		 * (sslField != null) : true  #  inside getPortFromChannel method
		 * (ports.size() != 1) : false  #  inside getPortsDescription method
		 * (!ports.isEmpty()) : true  #  inside getPortsDescription method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
			List list = new ArrayList<>();
			list.add(boundChannelMock);
			reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
			InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
			doReturn(inetSocketAddress).when(boundChannelMock).getLocalAddress();
			reflectionUtils.when(() -> ReflectionUtils.findField(BoundChannel.class, "ssl")).thenReturn(fieldMock);
			UndertowWebServer target = new UndertowWebServer(builderMock, httpHandlerFactoriesMock, true);
			//Act Statement(s)
			String result = target.getStartLogMessage();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("Undertow started on port null"));
				reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
				verify(boundChannelMock, atLeast(1)).getLocalAddress();
				reflectionUtils.verify(() -> ReflectionUtils.findField(BoundChannel.class, "ssl"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${0c47aa81-5ba6-3e1c-97d4-2234f7cb0fe3}, hash: 01A5301F8036C531E554EE6E9D5BB4AD
	@Disabled()
	@Test()
	void getStartLogMessageWhenSslFieldIsNullAndPortsSizeEquals1AndPortsNotIsEmpty() throws Exception {
		/* Branches:
		 * (!this.autoStart) : false  #  inside getActualPorts method
		 * (for-each(extractChannels())) : true  #  inside getActualPorts method
		 * (socketAddress instanceof InetSocketAddress inetSocketAddress) : true  #  inside getPortFromChannel method
		 * (sslField != null) : false  #  inside getPortFromChannel method
		 * (ports.size() != 1) : false  #  inside getPortsDescription method
		 * (!ports.isEmpty()) : true  #  inside getPortsDescription method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
			List list = new ArrayList<>();
			list.add(boundChannelMock);
			reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
			InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
			doReturn(inetSocketAddress).when(boundChannelMock).getLocalAddress();
			reflectionUtils.when(() -> ReflectionUtils.findField(BoundChannel.class, "ssl")).thenReturn(null);
			UndertowWebServer target = new UndertowWebServer(builderMock, httpHandlerFactoriesMock, true);
			//Act Statement(s)
			String result = target.getStartLogMessage();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("Undertow started on port null"));
				reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
				verify(boundChannelMock, atLeast(1)).getLocalAddress();
				reflectionUtils.verify(() -> ReflectionUtils.findField(BoundChannel.class, "ssl"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${952f124b-0543-36ff-9933-df4ad48ff955}, hash: 42155E9EEA4F7660525325E1D4DE13F2
	@Test()
	void getStartLogMessageWhenCaughtExceptionAndPortsSizeEquals1AndPortsNotIsEmpty() throws Exception {
		/* Branches:
		 * (!this.autoStart) : false  #  inside getActualPorts method
		 * (for-each(extractChannels())) : true  #  inside getActualPorts method
		 * (socketAddress instanceof InetSocketAddress inetSocketAddress) : false  #  inside getPortFromChannel method
		 * (catch-exception (Exception)) : true  #  inside getActualPorts method
		 * (ports.size() != 1) : false  #  inside getPortsDescription method
		 * (!ports.isEmpty()) : true  #  inside getPortsDescription method
		 */
		//Arrange Statement(s)
		try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
			List list = new ArrayList<>();
			list.add(boundChannelMock);
			reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
			RuntimeException runtimeException = new RuntimeException();
			doThrow(runtimeException).when(boundChannelMock).getLocalAddress();
			UndertowWebServer target = new UndertowWebServer(builderMock, httpHandlerFactoriesMock, true);
			//Act Statement(s)
			String result = target.getStartLogMessage();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("Undertow started on ports unknown"));
				reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
				verify(boundChannelMock, atLeast(1)).getLocalAddress();
			});
		}
	}

	//Sapient generated method id: ${9308d2b5-dede-3df0-8a7c-8006fcc6bcf3}, hash: 5D02877EF9F9181C6B123ECA8C67F295
	@Test()
	void getStartLogMessageWhenSslFieldIsNotNullAndCaughtExceptionAndPortsSizeEquals1AndPortsNotIsEmpty() throws Exception {
		/* Branches:
		 * (!this.autoStart) : false  #  inside getActualPorts method
		 * (for-each(extractChannels())) : true  #  inside getActualPorts method
		 * (socketAddress instanceof InetSocketAddress inetSocketAddress) : true  #  inside getPortFromChannel method
		 * (sslField != null) : true  #  inside getPortFromChannel method
		 * (catch-exception (Exception)) : true  #  inside getActualPorts method
		 * (ports.size() != 1) : false  #  inside getPortsDescription method
		 * (!ports.isEmpty()) : true  #  inside getPortsDescription method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.collectionToDelimitedString(anyList(), eq(", "))).thenReturn("<String>");
			UndertowWebServer target = new UndertowWebServer(builderMock, httpHandlerFactoriesMock, false);
			//Act Statement(s)
			String result = target.getStartLogMessage();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("Undertow started on port <String>"));
				stringUtils.verify(() -> StringUtils.collectionToDelimitedString(anyList(), eq(", ")));
			});
		}
	}
}
