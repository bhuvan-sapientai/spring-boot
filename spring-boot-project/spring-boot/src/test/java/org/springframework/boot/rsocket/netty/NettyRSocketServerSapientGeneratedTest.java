package org.springframework.boot.rsocket.netty;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import org.springframework.boot.rsocket.server.RSocketServerException;

import java.time.Duration;

import org.mockito.stubbing.Answer;
import io.rsocket.transport.netty.server.CloseableChannel;
import org.mockito.MockedStatic;

import java.net.InetSocketAddress;

import reactor.core.publisher.Mono;

import org.springframework.util.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class NettyRSocketServerSapientGeneratedTest {

	private final Mono<CloseableChannel> monoMock = mock(Mono.class);

	//Sapient generated method id: ${757f24e5-291b-304b-93da-8e7fd6112e35}
	@Test()
	void addressWhenThisChannelIsNull() {
		/* Branches:
		 * (this.channel != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(monoMock, "starter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Duration duration = Duration.ofDays(0L);
			NettyRSocketServer target = new NettyRSocketServer(monoMock, duration);
			//Act Statement(s)
			InetSocketAddress result = target.address();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.notNull(monoMock, "starter must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${d12e23d8-d6e6-347f-9542-443a4527b54d}
	@Disabled(value = "Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void startWhenTimeoutIsNotNull() throws RSocketServerException {
		/* Branches:
		 * (timeout != null) : true  #  inside block method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Mono<CloseableChannel> mono = Mono.empty();
		Duration duration = Duration.ofDays(0L);
		NettyRSocketServer target = spy(new NettyRSocketServer(mono, duration));
		InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
		doReturn(inetSocketAddress).when(target).address();

		//Act Statement(s)
		target.start();

		//Assert statement(s)
		assertAll("result", () -> verify(target).address());
	}

	//Sapient generated method id: ${49222f79-f2c3-341a-ac1b-c4d886b8c503}
	@Disabled(value = "Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void startWhenTimeoutIsNull() throws RSocketServerException {
		/* Branches:
		 * (timeout != null) : false  #  inside block method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Mono<CloseableChannel> mono = Mono.empty();
		NettyRSocketServer target = spy(new NettyRSocketServer(mono, (Duration) null));
		InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
		doReturn(inetSocketAddress).when(target).address();

		//Act Statement(s)
		target.start();

		//Assert statement(s)
		assertAll("result", () -> verify(target).address());
	}

	//Sapient generated method id: ${499c7491-7fa7-364b-b953-6c03218bb16a}
	@Test()
	void stopWhenThisChannelIsNull() throws RSocketServerException {
		/* Branches:
		 * (this.channel != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(monoMock, "starter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Duration duration = Duration.ofDays(0L);
			NettyRSocketServer target = new NettyRSocketServer(monoMock, duration);
			//Act Statement(s)
			target.stop();
			//Assert statement(s)
			assertAll("result", () -> _assert.verify(() -> Assert.notNull(monoMock, "starter must not be null"), atLeast(1)));
		}
	}
}
