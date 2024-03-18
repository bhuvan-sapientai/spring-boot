package org.springframework.boot.web.embedded.undertow;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import io.undertow.server.handlers.PathHandler;

import java.util.List;

import io.undertow.Undertow;

import java.lang.reflect.Field;
import java.net.SocketAddress;

import org.springframework.util.StringUtils;

import io.undertow.server.HttpHandler;

import org.springframework.util.Assert;

import org.xnio.channels.BoundChannel;
import io.undertow.server.handlers.GracefulShutdownHandler;
import org.mockito.MockedStatic;

import java.net.InetSocketAddress;
import java.util.ArrayList;

import org.springframework.util.ReflectionUtils;

import io.undertow.Handlers;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UndertowServletWebServerSapientGeneratedTest {

	private final BoundChannel boundChannelMock = mock(BoundChannel.class);

	private final Field fieldMock = mock(Field.class);

	private final Iterable iterableMock = mock(Iterable.class);

	private final SocketAddress socketAddressMock = mock(SocketAddress.class);

	private final Undertow.Builder undertowBuilderMock = mock(Undertow.Builder.class);

	//Sapient generated method id: ${d422d2d5-bcb2-3ad6-8b06-6083e9775f6c}, hash: 1E72BB5873DBC27F020B2F0BD1B47C48
	@Disabled()
	@Test()
	void createHttpHandlerWhenStringUtilsHasLengthThisContextPath() {
		/* Branches:
		 * (for-each(this.httpHandlerFactories)) : true  #  inside createHttpHandler method
		 * (handler instanceof Closeable closeable) : false  #  inside createHttpHandler method
		 * (handler instanceof GracefulShutdownHandler shutdownHandler) : true  #  inside createHttpHandler method
		 * (StringUtils.hasLength(this.contextPath)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		PathHandler pathHandlerMock = mock(PathHandler.class);
		PathHandler pathHandlerMock2 = mock(PathHandler.class);
		GracefulShutdownHandler gracefulShutdownHandlerMock = mock(GracefulShutdownHandler.class);
		try (MockedStatic<Handlers> handlers = mockStatic(Handlers.class)) {
			handlers.when(() -> Handlers.path()).thenReturn(pathHandlerMock);
			doReturn(pathHandlerMock2).when(pathHandlerMock).addPrefixPath("A", gracefulShutdownHandlerMock);
			UndertowServletWebServer target = new UndertowServletWebServer(undertowBuilderMock, iterableMock, "A", false);
			//Act Statement(s)
			HttpHandler result = target.createHttpHandler();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(pathHandlerMock2));
				handlers.verify(() -> Handlers.path(), atLeast(1));
				verify(pathHandlerMock).addPrefixPath("A", gracefulShutdownHandlerMock);
			});
		}
	}

	//Sapient generated method id: ${b3b6879f-ffa2-3887-9ce9-3308aad8052d}, hash: 1C5437F4B42FC042FC183D8D8BA58F2B
	@Disabled()
	@Test()
	void getStartLogMessageWhenPortsNotIsEmpty() {
		/* Branches:
		 * (StringUtils.hasText(this.contextPath)) : true
		 * (!this.autoStart) : true  #  inside getActualPorts method
		 * (ports.size() != 1) : false  #  inside getPortsDescription method
		 * (!ports.isEmpty()) : true  #  inside getPortsDescription method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowServletWebServer target = new UndertowServletWebServer(undertowBuilderMock, iterableMock, "A", false);
		//Act Statement(s)
		String result = target.getStartLogMessage();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("Undertow started on port null with context path 'A'")));
	}

	//Sapient generated method id: ${7c2a2a6f-0fb0-3880-ae19-761ef4f22476}, hash: 4D6AB16C164EB01D5A0A316C394EF6E1
	@Disabled()
	@Test()
	void getStartLogMessageWhenPortsSizeNotEquals1AndPortsIsEmpty() {
		/* Branches:
		 * (StringUtils.hasText(this.contextPath)) : false
		 * (!this.autoStart) : false  #  inside getActualPorts method
		 * (for-each(extractChannels())) : false  #  inside getActualPorts method
		 * (ports.size() != 1) : true  #  inside getPortsDescription method
		 * (!ports.isEmpty()) : false  #  inside getPortsDescription method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
			List list = new ArrayList<>();
			reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
			UndertowServletWebServer target = new UndertowServletWebServer(undertowBuilderMock, iterableMock, "A", true);
			//Act Statement(s)
			String result = target.getStartLogMessage();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("Undertow started on ports unknown with context path '/'"));
				stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
				reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${2bacc24c-129e-3ca0-93d1-7c5957a557eb}, hash: 1DEB71E8D68512CF00A36BD9BBED56F4
	@Disabled()
	@Test()
	void getStartLogMessageWhenPortsSizeEquals1AndPortsNotIsEmpty() {
		/* Branches:
		 * (StringUtils.hasText(this.contextPath)) : true
		 * (!this.autoStart) : false  #  inside getActualPorts method
		 * (for-each(extractChannels())) : true  #  inside getActualPorts method
		 * (socketAddress instanceof InetSocketAddress inetSocketAddress) : false  #  inside getPortFromChannel method
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
			doReturn(socketAddressMock).when(boundChannelMock).getLocalAddress();
			UndertowServletWebServer target = new UndertowServletWebServer(undertowBuilderMock, iterableMock, "A", true);
			//Act Statement(s)
			String result = target.getStartLogMessage();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("Undertow started on port  with context path 'A'"));
				reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
				verify(boundChannelMock, atLeast(1)).getLocalAddress();
			});
		}
	}

	//Sapient generated method id: ${d37fe8f2-8215-35de-b1d4-2a6166f9ea37}, hash: 17105192A70CB4AF25DD54EC4467A126
	@Disabled()
	@Test()
	void getStartLogMessageWhenDefaultBranchAndPortsSizeNotEquals1AndPortsIsEmpty() {
		/* Branches:
		 * (StringUtils.hasText(this.contextPath)) : true
		 * (!this.autoStart) : false  #  inside getActualPorts method
		 * (for-each(extractChannels())) : false  #  inside getActualPorts method
		 * (branch expression (line 213)) : true  #  inside getActualPorts method
		 * (ports.size() != 1) : true  #  inside getPortsDescription method
		 * (!ports.isEmpty()) : false  #  inside getPortsDescription method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
			List list = new ArrayList<>();
			reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
			UndertowServletWebServer target = new UndertowServletWebServer(undertowBuilderMock, iterableMock, "A", true);
			//Act Statement(s)
			String result = target.getStartLogMessage();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("Undertow started on ports unknown with context path 'A'"));
				reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${2a523ab2-7dda-3c54-9f27-610a6b9f8cf2}, hash: 3F80F3CCBE73867960E2620623A5A49B
	@Disabled()
	@Test()
	void getStartLogMessageWhenSslFieldIsNotNullAndPortsSizeEquals1AndPortsNotIsEmpty() {
		/* Branches:
		 * (StringUtils.hasText(this.contextPath)) : true
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
			UndertowServletWebServer target = new UndertowServletWebServer(undertowBuilderMock, iterableMock, "A", true);
			//Act Statement(s)
			String result = target.getStartLogMessage();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("Undertow started on port null with context path 'A'"));
				reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
				verify(boundChannelMock, atLeast(1)).getLocalAddress();
				reflectionUtils.verify(() -> ReflectionUtils.findField(BoundChannel.class, "ssl"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${0c47aa81-5ba6-3e1c-97d4-2234f7cb0fe3}, hash: 93C4AABBA5CEF202233A3B7E4EF36FA6
	@Disabled()
	@Test()
	void getStartLogMessageWhenSslFieldIsNullAndPortsSizeEquals1AndPortsNotIsEmpty() {
		/* Branches:
		 * (StringUtils.hasText(this.contextPath)) : true
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
			UndertowServletWebServer target = new UndertowServletWebServer(undertowBuilderMock, iterableMock, "A", true);
			//Act Statement(s)
			String result = target.getStartLogMessage();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("Undertow started on port null with context path 'A'"));
				reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
				verify(boundChannelMock, atLeast(1)).getLocalAddress();
				reflectionUtils.verify(() -> ReflectionUtils.findField(BoundChannel.class, "ssl"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${bc7566b0-d239-375a-8bca-6321914c718d}, hash: 641FF9E39FC9A7D1F2C79B013D35041D
	@Disabled()
	@Test()
	void getStartLogMessageWhenDefaultBranchAndPortsSizeEquals1AndPortsNotIsEmpty() {
		/* Branches:
		 * (StringUtils.hasText(this.contextPath)) : true
		 * (!this.autoStart) : false  #  inside getActualPorts method
		 * (for-each(extractChannels())) : true  #  inside getActualPorts method
		 * (socketAddress instanceof InetSocketAddress inetSocketAddress) : false  #  inside getPortFromChannel method
		 * (branch expression (line 213)) : true  #  inside getActualPorts method
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
			doReturn(socketAddressMock).when(boundChannelMock).getLocalAddress();
			UndertowServletWebServer target = new UndertowServletWebServer(undertowBuilderMock, iterableMock, "A", true);
			//Act Statement(s)
			String result = target.getStartLogMessage();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("Undertow started on port  with context path 'A'"));
				reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
				verify(boundChannelMock, atLeast(1)).getLocalAddress();
			});
		}
	}

	//Sapient generated method id: ${553fa339-f623-3684-b26a-698c101827f4}, hash: 91CB4BD40857AD3103020247892B5BAC
	@Disabled()
	@Test()
	void getStartLogMessageWhenSslFieldIsNotNullAndDefaultBranchAndPortsSizeEquals1AndPortsNotIsEmpty() {
		/* Branches:
		 * (StringUtils.hasText(this.contextPath)) : true
		 * (!this.autoStart) : false  #  inside getActualPorts method
		 * (for-each(extractChannels())) : true  #  inside getActualPorts method
		 * (socketAddress instanceof InetSocketAddress inetSocketAddress) : true  #  inside getPortFromChannel method
		 * (sslField != null) : true  #  inside getPortFromChannel method
		 * (branch expression (line 213)) : true  #  inside getActualPorts method
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
			UndertowServletWebServer target = new UndertowServletWebServer(undertowBuilderMock, iterableMock, "A", true);
			//Act Statement(s)
			String result = target.getStartLogMessage();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("Undertow started on port null with context path 'A'"));
				reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
				verify(boundChannelMock, atLeast(1)).getLocalAddress();
				reflectionUtils.verify(() -> ReflectionUtils.findField(BoundChannel.class, "ssl"), atLeast(1));
			});
		}
	}
}
