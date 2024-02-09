package org.springframework.boot.rsocket.context;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.springframework.boot.rsocket.server.RSocketServerException;
import org.springframework.context.ApplicationEventPublisher;

import org.mockito.stubbing.Answer;

import org.springframework.boot.rsocket.server.RSocketServerFactory;

import org.mockito.MockitoAnnotations;
import io.rsocket.SocketAcceptor;

import org.springframework.util.Assert;

import org.mockito.MockedStatic;

import java.net.InetSocketAddress;

import org.springframework.boot.rsocket.server.RSocketServer;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class RSocketServerBootstrapSapientGeneratedTest {

	private final RSocketServer serverMock = mock(RSocketServer.class, "server");

	private final ApplicationEventPublisher eventPublisherMock = mock(ApplicationEventPublisher.class, "eventPublisher");

	private AutoCloseable autoCloseableMocks;

	@InjectMocks()
	private RSocketServerBootstrap target;

	@AfterEach()
	public void afterTest() throws Exception {
		if (autoCloseableMocks != null)
			autoCloseableMocks.close();
	}

	//Sapient generated method id: ${a9331398-240e-36aa-9522-b3dc4bcf14ad}
	@Test()
	void startTest() throws RSocketServerException {
		//Arrange Statement(s)
		RSocketServerFactory serverFactoryMock = mock(RSocketServerFactory.class);
		SocketAcceptor socketAcceptorMock = mock(SocketAcceptor.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(serverMock).when(serverFactoryMock).create(socketAcceptorMock);
			_assert.when(() -> Assert.notNull(serverFactoryMock, "ServerFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new RSocketServerBootstrap(serverFactoryMock, socketAcceptorMock);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			doNothing().when(serverMock).start();
			doNothing().when(eventPublisherMock).publishEvent((RSocketServerInitializedEvent) any());
			//Act Statement(s)
			target.start();
			//Assert statement(s)
			assertAll("result", () -> {
				verify(serverFactoryMock).create(socketAcceptorMock);
				_assert.verify(() -> Assert.notNull(serverFactoryMock, "ServerFactory must not be null"), atLeast(1));
				verify(serverMock).start();
				verify(eventPublisherMock).publishEvent((RSocketServerInitializedEvent) any());
			});
		}
	}

	//Sapient generated method id: ${097b903c-1cba-3dd3-835e-b09bc597ebca}
	@Test()
	void stopTest() throws RSocketServerException {
		//Arrange Statement(s)
		RSocketServerFactory serverFactoryMock = mock(RSocketServerFactory.class);
		SocketAcceptor socketAcceptorMock = mock(SocketAcceptor.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(serverMock).when(serverFactoryMock).create(socketAcceptorMock);
			_assert.when(() -> Assert.notNull(serverFactoryMock, "ServerFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new RSocketServerBootstrap(serverFactoryMock, socketAcceptorMock);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			doNothing().when(serverMock).stop();
			//Act Statement(s)
			target.stop();
			//Assert statement(s)
			assertAll("result", () -> {
				verify(serverFactoryMock).create(socketAcceptorMock);
				_assert.verify(() -> Assert.notNull(serverFactoryMock, "ServerFactory must not be null"), atLeast(1));
				verify(serverMock).stop();
			});
		}
	}

	//Sapient generated method id: ${7f0cfd88-2fd9-3152-a1f2-93676acef8c3}
	@Test()
	void isRunningWhenServerIsNull() {
		/* Branches:
		 * (server != null) : false
		 */
		//Arrange Statement(s)
		RSocketServerFactory serverFactoryMock = mock(RSocketServerFactory.class);
		SocketAcceptor socketAcceptorMock = mock(SocketAcceptor.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(null).when(serverFactoryMock).create(socketAcceptorMock);
			_assert.when(() -> Assert.notNull(serverFactoryMock, "ServerFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new RSocketServerBootstrap(serverFactoryMock, socketAcceptorMock);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			boolean result = target.isRunning();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				verify(serverFactoryMock).create(socketAcceptorMock);
				_assert.verify(() -> Assert.notNull(serverFactoryMock, "ServerFactory must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${5cee3b5d-d202-3e63-86d6-a3f55550b74f}
	@Test()
	void isRunningWhenServerAddressIsNotNull() {
		/* Branches:
		 * (server != null) : true
		 * (server.address() != null) : true
		 */
		//Arrange Statement(s)
		RSocketServerFactory serverFactoryMock = mock(RSocketServerFactory.class);
		SocketAcceptor socketAcceptorMock = mock(SocketAcceptor.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(serverMock).when(serverFactoryMock).create(socketAcceptorMock);
			InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
			doReturn(inetSocketAddress).when(serverMock).address();
			_assert.when(() -> Assert.notNull(serverFactoryMock, "ServerFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new RSocketServerBootstrap(serverFactoryMock, socketAcceptorMock);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			boolean result = target.isRunning();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				verify(serverFactoryMock).create(socketAcceptorMock);
				verify(serverMock).address();
				_assert.verify(() -> Assert.notNull(serverFactoryMock, "ServerFactory must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${e6c80439-1481-359a-bd64-24cd14d47076}
	@Test()
	void isRunningWhenServerAddressIsNull() {
		/* Branches:
		 * (server != null) : true
		 * (server.address() != null) : false
		 */
		//Arrange Statement(s)
		RSocketServerFactory serverFactoryMock = mock(RSocketServerFactory.class);
		SocketAcceptor socketAcceptorMock = mock(SocketAcceptor.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(serverMock).when(serverFactoryMock).create(socketAcceptorMock);
			doReturn(null).when(serverMock).address();
			_assert.when(() -> Assert.notNull(serverFactoryMock, "ServerFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new RSocketServerBootstrap(serverFactoryMock, socketAcceptorMock);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			boolean result = target.isRunning();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				verify(serverFactoryMock).create(socketAcceptorMock);
				verify(serverMock).address();
				_assert.verify(() -> Assert.notNull(serverFactoryMock, "ServerFactory must not be null"), atLeast(1));
			});
		}
	}
}
