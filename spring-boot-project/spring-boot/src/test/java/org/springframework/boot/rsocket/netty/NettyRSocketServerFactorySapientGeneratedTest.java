package org.springframework.boot.rsocket.netty;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import io.rsocket.transport.netty.server.TcpServerTransport;
import io.rsocket.transport.netty.server.CloseableChannel;

import org.springframework.boot.web.server.Ssl;

import reactor.netty.tcp.TcpServer;

import org.springframework.util.unit.DataSize;
import org.springframework.boot.context.properties.PropertyMapper;

import io.rsocket.SocketAcceptor;

import org.springframework.util.Assert;
import org.springframework.boot.rsocket.server.RSocketServerCustomizer;

import java.time.Duration;
import java.util.function.Function;
import java.util.Collection;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.util.function.Consumer;

import reactor.core.publisher.Mono;
import io.rsocket.core.RSocketServer;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class NettyRSocketServerFactorySapientGeneratedTest {

	//Sapient generated method id: ${914392cb-5114-3e2a-9155-1bddb71a5db8}
	@Test()
	void setRSocketServerCustomizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(anyCollection(), eq("RSocketServerCustomizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			NettyRSocketServerFactory target = new NettyRSocketServerFactory();
			Collection<RSocketServerCustomizer> collection = new ArrayList<>();
			//Act Statement(s)
			target.setRSocketServerCustomizers(collection);
			//Assert statement(s)
			assertAll("result", () -> _assert.verify(() -> Assert.notNull(anyCollection(), eq("RSocketServerCustomizers must not be null"))));
		}
	}

	//Sapient generated method id: ${8c1c2428-d157-32f2-bc6f-8c9530bee6fe}
	@Test()
	void addRSocketServerCustomizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RSocketServerCustomizer[] rSocketServerCustomizerArray = new RSocketServerCustomizer[] {};
			_assert.when(() -> Assert.notNull(rSocketServerCustomizerArray, "RSocketServerCustomizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			NettyRSocketServerFactory target = new NettyRSocketServerFactory();
			//Act Statement(s)
			target.addRSocketServerCustomizers(rSocketServerCustomizerArray);
			//Assert statement(s)
			assertAll("result", () -> _assert.verify(() -> Assert.notNull(rSocketServerCustomizerArray, "RSocketServerCustomizers must not be null"), atLeast(1)));
		}
	}

	//Sapient generated method id: ${633803c5-cc12-35af-a90b-9dfa32ea9f35}
	@Disabled()
	@Test()
	void createWhenSslNotIsEnabledThisSsl() {
		/* Branches:
		 * (this.transport == RSocketServer.Transport.WEBSOCKET) : false  #  inside createTransport method
		 * (this.resourceFactory != null) : false  #  inside createTcpTransport method
		 * (Ssl.isEnabled(this.ssl)) : false  #  inside createTcpTransport method
		 */
		//Arrange Statement(s)
		TcpServer tcpServerMock = mock(TcpServer.class);
		TcpServer tcpServerMock2 = mock(TcpServer.class);
		TcpServerTransport tcpServerTransportMock = mock(TcpServerTransport.class);
		RSocketServer rSocketServerMock = mock(RSocketServer.class);
		SocketAcceptor socketAcceptorMock = mock(SocketAcceptor.class);
		RSocketServer rSocketServerMock2 = mock(RSocketServer.class);
		Mono<CloseableChannel> monoMock = mock(Mono.class);
		PropertyMapper propertyMapperMock = mock(PropertyMapper.class);
		PropertyMapper propertyMapperMock2 = mock(PropertyMapper.class);
		PropertyMapper.Source propertyMapperSourceMock = mock(PropertyMapper.Source.class);
		PropertyMapper.Source<Integer> propertyMapperSourceMock2 = mock(PropertyMapper.Source.class);
		try (MockedStatic<PropertyMapper> propertyMapper = mockStatic(PropertyMapper.class);
			 MockedStatic<RSocketServer> rSocketServer = mockStatic(RSocketServer.class);
			 MockedStatic<TcpServerTransport> tcpServerTransport = mockStatic(TcpServerTransport.class);
			 MockedStatic<TcpServer> tcpServer = mockStatic(TcpServer.class)) {
			tcpServer.when(() -> TcpServer.create()).thenReturn(tcpServerMock);
			doReturn(tcpServerMock2).when(tcpServerMock).bindAddress((Supplier) any());
			tcpServerTransport.when(() -> TcpServerTransport.create(tcpServerMock2)).thenReturn(tcpServerTransportMock);
			rSocketServer.when(() -> RSocketServer.create(socketAcceptorMock)).thenReturn(rSocketServerMock);
			doReturn(rSocketServerMock2).when(rSocketServerMock).fragment(0);
			doReturn(monoMock).when(rSocketServerMock).bind(tcpServerTransportMock);
			propertyMapper.when(() -> PropertyMapper.get()).thenReturn(propertyMapperMock);
			doReturn(propertyMapperMock2).when(propertyMapperMock).alwaysApplyingWhenNonNull();
			doReturn(propertyMapperSourceMock).when(propertyMapperMock2).from((DataSize) null);
			doReturn(propertyMapperSourceMock2).when(propertyMapperSourceMock).asInt((Function) any());
			doNothing().when(propertyMapperSourceMock2).to((Consumer) any());
			NettyRSocketServerFactory target = new NettyRSocketServerFactory();
			//Act Statement(s)
			NettyRSocketServer result = target.create(socketAcceptorMock);
			NettyRSocketServer nettyRSocketServer = new NettyRSocketServer(monoMock, (Duration) null);
			//Assert statement(s)
			//TODO: Please implement equals method in NettyRSocketServer for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(nettyRSocketServer));
				tcpServer.verify(() -> TcpServer.create(), atLeast(1));
				verify(tcpServerMock).bindAddress((Supplier) any());
				tcpServerTransport.verify(() -> TcpServerTransport.create(tcpServerMock2), atLeast(1));
				rSocketServer.verify(() -> RSocketServer.create(socketAcceptorMock), atLeast(1));
				verify(rSocketServerMock).fragment(0);
				verify(rSocketServerMock).bind(tcpServerTransportMock);
				propertyMapper.verify(() -> PropertyMapper.get(), atLeast(1));
				verify(propertyMapperMock).alwaysApplyingWhenNonNull();
				verify(propertyMapperMock2).from((DataSize) null);
				verify(propertyMapperSourceMock).asInt((Function) any());
				verify(propertyMapperSourceMock2).to((Consumer) any());
			});
		}
	}
}
