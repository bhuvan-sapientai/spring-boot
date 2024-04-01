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
import io.undertow.servlet.api.DeploymentManager;

import org.springframework.util.Assert;

import org.xnio.channels.BoundChannel;
import io.undertow.server.handlers.GracefulShutdownHandler;
import org.mockito.MockedStatic;

import java.net.InetSocketAddress;
import java.util.ArrayList;

import org.springframework.util.ReflectionUtils;

import io.undertow.Handlers;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.doThrow;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UndertowServletWebServerSapientGeneratedTest {

	private final BoundChannel boundChannelMock = mock(BoundChannel.class);

	private final DeploymentManagerHttpHandlerFactory deploymentManagerFactoryMock = mock(DeploymentManagerHttpHandlerFactory.class);

	private final DeploymentManager deploymentManagerMock = mock(DeploymentManager.class);

	private final Undertow.Builder undertowBuilderMock = mock(Undertow.Builder.class);

	//Sapient generated method id: ${d422d2d5-bcb2-3ad6-8b06-6083e9775f6c}, hash: C81DF8CFE79A63454E24AF39FACBD45D
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
		try (MockedStatic<Handlers> handlers = mockStatic(Handlers.class);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasLength("contextPath1")).thenReturn(false);
			handlers.when(() -> Handlers.path()).thenReturn(pathHandlerMock);
			doReturn(pathHandlerMock2).when(pathHandlerMock).addPrefixPath("contextPath1", gracefulShutdownHandlerMock);
			Iterable<HttpHandlerFactory> iterable = new ArrayList<>();
			UndertowServletWebServer target = new UndertowServletWebServer(undertowBuilderMock, iterable, "contextPath1", false);
			//Act Statement(s)
			HttpHandler result = target.createHttpHandler();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(pathHandlerMock2));
				stringUtils.verify(() -> StringUtils.hasLength("contextPath1"), atLeast(1));
				handlers.verify(() -> Handlers.path(), atLeast(1));
				verify(pathHandlerMock).addPrefixPath("contextPath1", gracefulShutdownHandlerMock);
			});
		}
	}

	//Sapient generated method id: ${b3b6879f-ffa2-3887-9ce9-3308aad8052d}, hash: FF0C213D71BFC82C6B96D600C7B9D301
	@Disabled()
	@Test()
	void getStartLogMessageWhenPortsNotIsEmpty() {
		/* Branches:
		 * (StringUtils.hasText(this.contextPath)) : true
		 * (!this.autoStart) : true  #  inside getActualPorts method
		 * (ports.size() != 1) : false  #  inside getPortsDescription method
		 * (!ports.isEmpty()) : true  #  inside getPortsDescription method
		 */
		//Arrange Statement(s)
		doReturn(deploymentManagerMock).when(deploymentManagerFactoryMock).getDeploymentManager();
		Iterable<HttpHandlerFactory> iterable = new ArrayList<>(List.of(deploymentManagerFactoryMock));
		UndertowServletWebServer target = new UndertowServletWebServer(undertowBuilderMock, iterable, "A", false);
		//Act Statement(s)
		String result = target.getStartLogMessage();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("Undertow started on port null with context path 'A'"));
			verify(deploymentManagerFactoryMock).getDeploymentManager();
		});
	}

	//Sapient generated method id: ${7c2a2a6f-0fb0-3880-ae19-761ef4f22476}, hash: DA1365665BFB399C95881F188C4C4EC1
	@Test()
	void getStartLogMessageWhenPortsSizeNotEquals1AndPortsIsEmpty() {
		/* Branches:
		 * (StringUtils.hasText(this.contextPath)) : false
		 * (!this.autoStart) : false  #  inside getActualPorts method
		 * (for-each(extractChannels())) : false  #  inside getActualPorts method
		 * (ports.size() != 1) : true  #  inside getPortsDescription method
		 * (!ports.isEmpty()) : false  #  inside getPortsDescription method
		 */
		//Arrange Statement(s)
		try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			doReturn(deploymentManagerMock).when(deploymentManagerFactoryMock).getDeploymentManager();
			stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
			List list = new ArrayList<>();
			reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
			Iterable<HttpHandlerFactory> iterable = new ArrayList<>(List.of(deploymentManagerFactoryMock));
			UndertowServletWebServer target = new UndertowServletWebServer(undertowBuilderMock, iterable, "A", true);
			//Act Statement(s)
			String result = target.getStartLogMessage();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("Undertow started on ports unknown with context path '/'"));
				verify(deploymentManagerFactoryMock, atLeast(1)).getDeploymentManager();
				stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
				reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${2bacc24c-129e-3ca0-93d1-7c5957a557eb}, hash: 54F6601B51D0ECA92724034EE7CD40FF
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
		 */
		//Arrange Statement(s)
		SocketAddress socketAddressMock = mock(SocketAddress.class);
		try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
			doReturn(deploymentManagerMock).when(deploymentManagerFactoryMock).getDeploymentManager();
			List list = new ArrayList<>();
			list.add(boundChannelMock);
			reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
			doReturn(socketAddressMock).when(boundChannelMock).getLocalAddress();
			Iterable<HttpHandlerFactory> iterable = new ArrayList<>(List.of(deploymentManagerFactoryMock));
			UndertowServletWebServer target = new UndertowServletWebServer(undertowBuilderMock, iterable, "A", true);
			//Act Statement(s)
			String result = target.getStartLogMessage();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("Undertow started on port  with context path 'A'"));
				verify(deploymentManagerFactoryMock, atLeast(1)).getDeploymentManager();
				reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
				verify(boundChannelMock, atLeast(1)).getLocalAddress();
			});
		}
	}

	//Sapient generated method id: ${d37fe8f2-8215-35de-b1d4-2a6166f9ea37}, hash: 83AC60346A008DAB8436627B19857218
	@Test()
	void getStartLogMessageWhenDefaultBranchAndPortsSizeNotEquals1AndPortsIsEmpty() {
		/* Branches:
		 * (StringUtils.hasText(this.contextPath)) : true
		 * (!this.autoStart) : false  #  inside getActualPorts method
		 * (for-each(extractChannels())) : false  #  inside getActualPorts method
		 * (branch expression (line 213)) : true  #  inside getActualPorts method
		 * (ports.size() != 1) : true  #  inside getPortsDescription method
		 * (!ports.isEmpty()) : false  #  inside getPortsDescription method
		 */
		//Arrange Statement(s)
		try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
			doReturn(deploymentManagerMock).when(deploymentManagerFactoryMock).getDeploymentManager();
			RuntimeException runtimeException = new RuntimeException();
			reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenThrow(runtimeException);
			Iterable<HttpHandlerFactory> iterable = new ArrayList<>(List.of(deploymentManagerFactoryMock));
			UndertowServletWebServer target = new UndertowServletWebServer(undertowBuilderMock, iterable, "A", true);
			//Act Statement(s)
			String result = target.getStartLogMessage();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("Undertow started on ports unknown with context path 'A'"));
				verify(deploymentManagerFactoryMock, atLeast(1)).getDeploymentManager();
				reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${2a523ab2-7dda-3c54-9f27-610a6b9f8cf2}, hash: A0CB77F1EACE79B5A33C83CF6BDBDAF4
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
		Field fieldMock = mock(Field.class);
		try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
			doReturn(deploymentManagerMock).when(deploymentManagerFactoryMock).getDeploymentManager();
			List list = new ArrayList<>();
			list.add(boundChannelMock);
			reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
			InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
			doReturn(inetSocketAddress).when(boundChannelMock).getLocalAddress();
			reflectionUtils.when(() -> ReflectionUtils.findField(BoundChannel.class, "ssl")).thenReturn(fieldMock);
			Iterable<HttpHandlerFactory> iterable = new ArrayList<>(List.of(deploymentManagerFactoryMock));
			UndertowServletWebServer target = new UndertowServletWebServer(undertowBuilderMock, iterable, "A", true);
			//Act Statement(s)
			String result = target.getStartLogMessage();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("Undertow started on port null with context path 'A'"));
				verify(deploymentManagerFactoryMock, atLeast(1)).getDeploymentManager();
				reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
				verify(boundChannelMock, atLeast(1)).getLocalAddress();
				reflectionUtils.verify(() -> ReflectionUtils.findField(BoundChannel.class, "ssl"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${0c47aa81-5ba6-3e1c-97d4-2234f7cb0fe3}, hash: FE1A2D4E14B181CC4350877F9BB03A79
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
			doReturn(deploymentManagerMock).when(deploymentManagerFactoryMock).getDeploymentManager();
			List list = new ArrayList<>();
			list.add(boundChannelMock);
			reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
			InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
			doReturn(inetSocketAddress).when(boundChannelMock).getLocalAddress();
			reflectionUtils.when(() -> ReflectionUtils.findField(BoundChannel.class, "ssl")).thenReturn(null);
			Iterable<HttpHandlerFactory> iterable = new ArrayList<>(List.of(deploymentManagerFactoryMock));
			UndertowServletWebServer target = new UndertowServletWebServer(undertowBuilderMock, iterable, "A", true);
			//Act Statement(s)
			String result = target.getStartLogMessage();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("Undertow started on port null with context path 'A'"));
				verify(deploymentManagerFactoryMock, atLeast(1)).getDeploymentManager();
				reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
				verify(boundChannelMock, atLeast(1)).getLocalAddress();
				reflectionUtils.verify(() -> ReflectionUtils.findField(BoundChannel.class, "ssl"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${bc7566b0-d239-375a-8bca-6321914c718d}, hash: 196D63BA81BA32C34E7C36D25CEE7A5E
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
		 */
		//Arrange Statement(s)
		try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS)) {
			doReturn(deploymentManagerMock).when(deploymentManagerFactoryMock).getDeploymentManager();
			List list = new ArrayList<>();
			list.add(boundChannelMock);
			reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null))).thenReturn(list);
			RuntimeException runtimeException = new RuntimeException();
			doThrow(runtimeException).when(boundChannelMock).getLocalAddress();
			Iterable<HttpHandlerFactory> iterable = new ArrayList<>(List.of(deploymentManagerFactoryMock));
			UndertowServletWebServer target = new UndertowServletWebServer(undertowBuilderMock, iterable, "A", true);
			//Act Statement(s)
			String result = target.getStartLogMessage();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("Undertow started on ports unknown with context path 'A'"));
				verify(deploymentManagerFactoryMock, atLeast(1)).getDeploymentManager();
				reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq((Undertow) null)), atLeast(1));
				verify(boundChannelMock, atLeast(1)).getLocalAddress();
			});
		}
	}

	//Sapient generated method id: ${553fa339-f623-3684-b26a-698c101827f4}, hash: 155CC36056ACDEDFF807E7ABF9DD4433
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
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("String")).thenReturn(false);
			stringUtils.when(() -> StringUtils.collectionToDelimitedString(anyList(), eq(", "))).thenReturn("String");
			Iterable<HttpHandlerFactory> iterable = new ArrayList<>();
			UndertowServletWebServer target = new UndertowServletWebServer(undertowBuilderMock, iterable, "String", false);
			//Act Statement(s)
			String result = target.getStartLogMessage();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("Undertow started on port String with context path '/'"));
				stringUtils.verify(() -> StringUtils.hasText("String"), atLeast(1));
				stringUtils.verify(() -> StringUtils.collectionToDelimitedString(anyList(), eq(", ")));
			});
		}
	}
}
