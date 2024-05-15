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
import static org.mockito.ArgumentMatchers.any;
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

    private final CloseableChannel closeableChannelMock = mock(CloseableChannel.class);

    private final Mono<CloseableChannel> monoMock = mock(Mono.class);

    //Sapient generated method id: ${addressWhenThisChannelIsNull}, hash: 6FC6B3837E3025F2AF93CA17504C3536
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

    //Sapient generated method id: ${startWhenTimeoutIsNotNull}, hash: C525E81DCF5AECF9B33F61A21C24ECDA
    @Disabled()
    @Test()
    void startWhenTimeoutIsNotNull() throws RSocketServerException {
        /* Branches:
         * (timeout != null) : true  #  inside block method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(closeableChannelMock).when(monoMock).block((Duration) any());
            _assert.when(() -> Assert.notNull(monoMock, "starter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Duration duration = Duration.ofDays(0L);
            NettyRSocketServer target = spy(new NettyRSocketServer(monoMock, duration));
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            doReturn(inetSocketAddress).when(target).address();
            //Act Statement(s)
            target.start();
            //Assert statement(s)
            assertAll("result", () -> {
                verify(monoMock).block((Duration) any());
                _assert.verify(() -> Assert.notNull(monoMock, "starter must not be null"), atLeast(1));
                verify(target).address();
            });
        }
    }

    //Sapient generated method id: ${startWhenTimeoutIsNull}, hash: C49E3AB0E4E229442E04B1420C380F10
    @Disabled()
    @Test()
    void startWhenTimeoutIsNull() throws RSocketServerException {
        /* Branches:
         * (timeout != null) : false  #  inside block method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(closeableChannelMock).when(monoMock).block();
            _assert.when(() -> Assert.notNull(monoMock, "starter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            NettyRSocketServer target = spy(new NettyRSocketServer(monoMock, (Duration) null));
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            doReturn(inetSocketAddress).when(target).address();
            //Act Statement(s)
            target.start();
            //Assert statement(s)
            assertAll("result", () -> {
                verify(monoMock).block();
                _assert.verify(() -> Assert.notNull(monoMock, "starter must not be null"), atLeast(1));
                verify(target).address();
            });
        }
    }

    //Sapient generated method id: ${stopWhenThisChannelIsNull}, hash: 8B6A2CD873238ABFADF1B6A6FA3C0D63
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
