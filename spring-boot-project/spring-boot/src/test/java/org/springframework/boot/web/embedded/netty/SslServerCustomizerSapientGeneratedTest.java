package org.springframework.boot.web.embedded.netty;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.netty.http.Http2SslContextSpec;
import org.springframework.boot.ssl.SslOptions;
import reactor.netty.http.Http11SslContextSpec;
import org.springframework.boot.web.server.Ssl;
import org.mockito.MockitoAnnotations;
import javax.net.ssl.TrustManagerFactory;
import io.netty.handler.ssl.SslContext;
import javax.net.ssl.KeyManagerFactory;
import reactor.netty.tcp.AbstractProtocolSslContextSpec;
import org.mockito.MockedStatic;
import org.springframework.boot.web.server.Http2;
import reactor.netty.tcp.SslProvider;
import java.util.function.Consumer;
import reactor.netty.http.server.HttpServer;
import org.springframework.boot.ssl.SslBundle;
import org.springframework.boot.ssl.SslManagerBundle;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SslServerCustomizerSapientGeneratedTest {

    private final SslProvider sslProviderMock = mock(SslProvider.class, "sslProvider");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private SslServerCustomizer target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${applyTest}, hash: 7C97231DB41F89EA11F2506C7897F088
    @Disabled()
    @Test()
    void applyTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Promise.setSuccess) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HttpServer serverMock = mock(HttpServer.class);
        HttpServer httpServerMock = mock(HttpServer.class);
        SslBundle sslBundleMock = mock(SslBundle.class);
        SslManagerBundle sslManagerBundleMock = mock(SslManagerBundle.class);
        KeyManagerFactory keyManagerFactoryMock = mock(KeyManagerFactory.class);
        SslManagerBundle sslManagerBundleMock2 = mock(SslManagerBundle.class);
        TrustManagerFactory trustManagerFactoryMock = mock(TrustManagerFactory.class);
        SslOptions sslOptionsMock = mock(SslOptions.class);
        Http2SslContextSpec http2SslContextSpecMock = mock(Http2SslContextSpec.class);
        AbstractProtocolSslContextSpec abstractProtocolSslContextSpecMock = mock(AbstractProtocolSslContextSpec.class);
        SslContext sslContextMock = mock(SslContext.class);
        try (MockedStatic<Http2SslContextSpec> http2SslContextSpec = mockStatic(Http2SslContextSpec.class)) {
            doReturn(httpServerMock).when(serverMock).secure((Consumer) any());
            doReturn(keyManagerFactoryMock).when(sslManagerBundleMock).getKeyManagerFactory();
            doReturn(sslManagerBundleMock, sslManagerBundleMock2).when(sslBundleMock).getManagers();
            doReturn(trustManagerFactoryMock).when(sslManagerBundleMock2).getTrustManagerFactory();
            doReturn(sslOptionsMock).when(sslBundleMock).getOptions();
            String[] stringArray = new String[] {};
            doReturn(stringArray).when(sslOptionsMock).getEnabledProtocols();
            String[] stringArray2 = new String[] {};
            doReturn(stringArray2).when(sslOptionsMock).getCiphers();
            http2SslContextSpec.when(() -> Http2SslContextSpec.forServer(keyManagerFactoryMock)).thenReturn(http2SslContextSpecMock);
            doReturn(abstractProtocolSslContextSpecMock).when(http2SslContextSpecMock).configure((Consumer) any());
            Http2 http2 = new Http2();
            http2.setEnabled(true);
            target = new SslServerCustomizer(http2, Ssl.ClientAuth.NEED, sslBundleMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(sslContextMock).when(sslProviderMock).getSslContext();
            //Act Statement(s)
            HttpServer result = target.apply(serverMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(httpServerMock));
                verify(serverMock).secure((Consumer) any());
                verify(sslBundleMock, times(2)).getManagers();
                verify(sslManagerBundleMock).getKeyManagerFactory();
                verify(sslManagerBundleMock2).getTrustManagerFactory();
                verify(sslBundleMock).getOptions();
                verify(sslOptionsMock).getEnabledProtocols();
                verify(sslOptionsMock).getCiphers();
                http2SslContextSpec.verify(() -> Http2SslContextSpec.forServer(keyManagerFactoryMock), atLeast(1));
                verify(http2SslContextSpecMock).configure((Consumer) any());
                verify(sslProviderMock).getSslContext();
            });
        }
    }

    //Sapient generated method id: ${updateSslBundleTest}, hash: D280D4F66F994D80C83EC21A4FDE92DA
    @Disabled()
    @Test()
    void updateSslBundleTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SslBundle sslBundleMock = mock(SslBundle.class);
        SslManagerBundle sslManagerBundleMock = mock(SslManagerBundle.class);
        KeyManagerFactory keyManagerFactoryMock = mock(KeyManagerFactory.class);
        SslManagerBundle sslManagerBundleMock2 = mock(SslManagerBundle.class);
        TrustManagerFactory trustManagerFactoryMock = mock(TrustManagerFactory.class);
        SslOptions sslOptionsMock = mock(SslOptions.class);
        Http2SslContextSpec http2SslContextSpecMock = mock(Http2SslContextSpec.class);
        AbstractProtocolSslContextSpec abstractProtocolSslContextSpecMock = mock(AbstractProtocolSslContextSpec.class);
        AbstractProtocolSslContextSpec<?> abstractProtocolSslContextSpecMock2 = mock(AbstractProtocolSslContextSpec.class);
        SslBundle sslBundleMock2 = mock(SslBundle.class);
        try (MockedStatic<Http2SslContextSpec> http2SslContextSpec = mockStatic(Http2SslContextSpec.class)) {
            doReturn(keyManagerFactoryMock).when(sslManagerBundleMock).getKeyManagerFactory();
            doReturn(sslManagerBundleMock, sslManagerBundleMock2).when(sslBundleMock).getManagers();
            doReturn(trustManagerFactoryMock).when(sslManagerBundleMock2).getTrustManagerFactory();
            doReturn(sslOptionsMock).when(sslBundleMock).getOptions();
            String[] stringArray = new String[] {};
            doReturn(stringArray).when(sslOptionsMock).getEnabledProtocols();
            String[] stringArray2 = new String[] {};
            doReturn(stringArray2).when(sslOptionsMock).getCiphers();
            http2SslContextSpec.when(() -> Http2SslContextSpec.forServer(keyManagerFactoryMock)).thenReturn(http2SslContextSpecMock);
            doReturn(abstractProtocolSslContextSpecMock).when(http2SslContextSpecMock).configure((Consumer) any());
            Http2 http2 = new Http2();
            http2.setEnabled(true);
            target = spy(new SslServerCustomizer(http2, Ssl.ClientAuth.NEED, sslBundleMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(abstractProtocolSslContextSpecMock2).when(target).createSslContextSpec(sslBundleMock2);
            //Act Statement(s)
            target.updateSslBundle(sslBundleMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(sslBundleMock, times(2)).getManagers();
                verify(sslManagerBundleMock).getKeyManagerFactory();
                verify(sslManagerBundleMock2).getTrustManagerFactory();
                verify(sslBundleMock).getOptions();
                verify(sslOptionsMock).getEnabledProtocols();
                verify(sslOptionsMock).getCiphers();
                http2SslContextSpec.verify(() -> Http2SslContextSpec.forServer(keyManagerFactoryMock), atLeast(1));
                verify(http2SslContextSpecMock).configure((Consumer) any());
                verify(target).createSslContextSpec(sslBundleMock2);
            });
        }
    }

    //Sapient generated method id: ${createSslContextSpecTest}, hash: 37D0047654907013F620B0C7B66A479E
    @Disabled()
    @Test()
    void createSslContextSpecTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SslBundle sslBundleMock = mock(SslBundle.class);
        SslManagerBundle sslManagerBundleMock = mock(SslManagerBundle.class);
        KeyManagerFactory keyManagerFactoryMock = mock(KeyManagerFactory.class);
        SslManagerBundle sslManagerBundleMock2 = mock(SslManagerBundle.class);
        TrustManagerFactory trustManagerFactoryMock = mock(TrustManagerFactory.class);
        SslOptions sslOptionsMock = mock(SslOptions.class);
        Http2SslContextSpec http2SslContextSpecMock = mock(Http2SslContextSpec.class);
        AbstractProtocolSslContextSpec abstractProtocolSslContextSpecMock = mock(AbstractProtocolSslContextSpec.class);
        AbstractProtocolSslContextSpec<?> abstractProtocolSslContextSpecMock2 = mock(AbstractProtocolSslContextSpec.class);
        try (MockedStatic<Http2SslContextSpec> http2SslContextSpec = mockStatic(Http2SslContextSpec.class)) {
            doReturn(keyManagerFactoryMock).when(sslManagerBundleMock).getKeyManagerFactory();
            doReturn(sslManagerBundleMock, sslManagerBundleMock2).when(sslBundleMock).getManagers();
            doReturn(trustManagerFactoryMock).when(sslManagerBundleMock2).getTrustManagerFactory();
            doReturn(sslOptionsMock).when(sslBundleMock).getOptions();
            String[] stringArray = new String[] {};
            doReturn(stringArray).when(sslOptionsMock).getEnabledProtocols();
            String[] stringArray2 = new String[] {};
            doReturn(stringArray2).when(sslOptionsMock).getCiphers();
            http2SslContextSpec.when(() -> Http2SslContextSpec.forServer(keyManagerFactoryMock)).thenReturn(http2SslContextSpecMock);
            doReturn(abstractProtocolSslContextSpecMock).when(http2SslContextSpecMock).configure((Consumer) any());
            Http2 http2 = new Http2();
            http2.setEnabled(true);
            target = spy(new SslServerCustomizer(http2, Ssl.ClientAuth.NEED, sslBundleMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(abstractProtocolSslContextSpecMock2).when(target).createSslContextSpec(sslBundleMock);
            //Act Statement(s)
            AbstractProtocolSslContextSpec<?> result = target.createSslContextSpec();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(abstractProtocolSslContextSpecMock2));
                verify(sslBundleMock, times(2)).getManagers();
                verify(sslManagerBundleMock).getKeyManagerFactory();
                verify(sslManagerBundleMock2).getTrustManagerFactory();
                verify(sslBundleMock).getOptions();
                verify(sslOptionsMock).getEnabledProtocols();
                verify(sslOptionsMock).getCiphers();
                http2SslContextSpec.verify(() -> Http2SslContextSpec.forServer(keyManagerFactoryMock), atLeast(1));
                verify(http2SslContextSpecMock).configure((Consumer) any());
                verify(target).createSslContextSpec(sslBundleMock);
            });
        }
    }

    //Sapient generated method id: ${createSslContextSpec1WhenThisHttp2IsNull}, hash: 0907ECDF5B6CF95832DFCA1669DD32A4
    @Disabled()
    @Test()
    void createSslContextSpec1WhenThisHttp2IsNull() {
        /* Branches:
         * (this.http2 != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SslBundle sslBundleMock = mock(SslBundle.class);
        SslManagerBundle sslManagerBundleMock = mock(SslManagerBundle.class);
        KeyManagerFactory keyManagerFactoryMock = mock(KeyManagerFactory.class);
        SslManagerBundle sslManagerBundleMock2 = mock(SslManagerBundle.class);
        TrustManagerFactory trustManagerFactoryMock = mock(TrustManagerFactory.class);
        SslOptions sslOptionsMock = mock(SslOptions.class);
        SslManagerBundle sslManagerBundleMock3 = mock(SslManagerBundle.class);
        KeyManagerFactory keyManagerFactoryMock2 = mock(KeyManagerFactory.class);
        SslManagerBundle sslManagerBundleMock4 = mock(SslManagerBundle.class);
        TrustManagerFactory trustManagerFactoryMock2 = mock(TrustManagerFactory.class);
        SslOptions sslOptionsMock2 = mock(SslOptions.class);
        Http2SslContextSpec http2SslContextSpecMock = mock(Http2SslContextSpec.class);
        AbstractProtocolSslContextSpec abstractProtocolSslContextSpecMock = mock(AbstractProtocolSslContextSpec.class);
        Http11SslContextSpec http11SslContextSpecMock = mock(Http11SslContextSpec.class);
        AbstractProtocolSslContextSpec abstractProtocolSslContextSpecMock2 = mock(AbstractProtocolSslContextSpec.class);
        try (MockedStatic<Http11SslContextSpec> http11SslContextSpec = mockStatic(Http11SslContextSpec.class);
            MockedStatic<Http2SslContextSpec> http2SslContextSpec = mockStatic(Http2SslContextSpec.class)) {
            doReturn(keyManagerFactoryMock).when(sslManagerBundleMock).getKeyManagerFactory();
            doReturn(trustManagerFactoryMock).when(sslManagerBundleMock2).getTrustManagerFactory();
            String[] stringArray = new String[] {};
            doReturn(stringArray).when(sslOptionsMock).getEnabledProtocols();
            String[] stringArray2 = new String[] {};
            doReturn(stringArray2).when(sslOptionsMock).getCiphers();
            doReturn(keyManagerFactoryMock2).when(sslManagerBundleMock3).getKeyManagerFactory();
            doReturn(sslManagerBundleMock, sslManagerBundleMock2, sslManagerBundleMock3, sslManagerBundleMock4).when(sslBundleMock).getManagers();
            doReturn(trustManagerFactoryMock2).when(sslManagerBundleMock4).getTrustManagerFactory();
            doReturn(sslOptionsMock, sslOptionsMock2).when(sslBundleMock).getOptions();
            String[] stringArray3 = new String[] {};
            doReturn(stringArray3).when(sslOptionsMock2).getEnabledProtocols();
            String[] stringArray4 = new String[] {};
            doReturn(stringArray4).when(sslOptionsMock2).getCiphers();
            http2SslContextSpec.when(() -> Http2SslContextSpec.forServer(keyManagerFactoryMock)).thenReturn(http2SslContextSpecMock);
            doReturn(abstractProtocolSslContextSpecMock).when(http2SslContextSpecMock).configure((Consumer) any());
            http11SslContextSpec.when(() -> Http11SslContextSpec.forServer(keyManagerFactoryMock2)).thenReturn(http11SslContextSpecMock);
            doReturn(abstractProtocolSslContextSpecMock2).when(http11SslContextSpecMock).configure((Consumer) any());
            target = new SslServerCustomizer((Http2) null, Ssl.ClientAuth.NEED, sslBundleMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            AbstractProtocolSslContextSpec<?> result = target.createSslContextSpec(sslBundleMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(abstractProtocolSslContextSpecMock2));
                verify(sslBundleMock, times(4)).getManagers();
                verify(sslManagerBundleMock).getKeyManagerFactory();
                verify(sslManagerBundleMock2).getTrustManagerFactory();
                verify(sslBundleMock, times(2)).getOptions();
                verify(sslOptionsMock).getEnabledProtocols();
                verify(sslOptionsMock).getCiphers();
                verify(sslManagerBundleMock3).getKeyManagerFactory();
                verify(sslManagerBundleMock4).getTrustManagerFactory();
                verify(sslOptionsMock2).getEnabledProtocols();
                verify(sslOptionsMock2).getCiphers();
                http2SslContextSpec.verify(() -> Http2SslContextSpec.forServer(keyManagerFactoryMock), atLeast(1));
                verify(http2SslContextSpecMock).configure((Consumer) any());
                http11SslContextSpec.verify(() -> Http11SslContextSpec.forServer(keyManagerFactoryMock2), atLeast(1));
                verify(http11SslContextSpecMock).configure((Consumer) any());
            });
        }
    }

    //Sapient generated method id: ${createSslContextSpec1WhenThisHttp2IsEnabled}, hash: 727B145E7CCF0441C4B4BA3C93FBC3B4
    @Disabled()
    @Test()
    void createSslContextSpec1WhenThisHttp2IsEnabled() {
        /* Branches:
         * (this.http2 != null) : true
         * (this.http2.isEnabled()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SslBundle sslBundleMock = mock(SslBundle.class);
        SslManagerBundle sslManagerBundleMock = mock(SslManagerBundle.class);
        KeyManagerFactory keyManagerFactoryMock = mock(KeyManagerFactory.class);
        SslManagerBundle sslManagerBundleMock2 = mock(SslManagerBundle.class);
        TrustManagerFactory trustManagerFactoryMock = mock(TrustManagerFactory.class);
        SslOptions sslOptionsMock = mock(SslOptions.class);
        SslManagerBundle sslManagerBundleMock3 = mock(SslManagerBundle.class);
        KeyManagerFactory keyManagerFactoryMock2 = mock(KeyManagerFactory.class);
        SslManagerBundle sslManagerBundleMock4 = mock(SslManagerBundle.class);
        TrustManagerFactory trustManagerFactoryMock2 = mock(TrustManagerFactory.class);
        SslOptions sslOptionsMock2 = mock(SslOptions.class);
        Http2SslContextSpec http2SslContextSpecMock = mock(Http2SslContextSpec.class);
        AbstractProtocolSslContextSpec abstractProtocolSslContextSpecMock = mock(AbstractProtocolSslContextSpec.class);
        Http2SslContextSpec http2SslContextSpecMock2 = mock(Http2SslContextSpec.class);
        AbstractProtocolSslContextSpec abstractProtocolSslContextSpecMock2 = mock(AbstractProtocolSslContextSpec.class);
        try (MockedStatic<Http2SslContextSpec> http2SslContextSpec = mockStatic(Http2SslContextSpec.class)) {
            doReturn(keyManagerFactoryMock).when(sslManagerBundleMock).getKeyManagerFactory();
            doReturn(trustManagerFactoryMock).when(sslManagerBundleMock2).getTrustManagerFactory();
            String[] stringArray = new String[] {};
            doReturn(stringArray).when(sslOptionsMock).getEnabledProtocols();
            String[] stringArray2 = new String[] {};
            doReturn(stringArray2).when(sslOptionsMock).getCiphers();
            doReturn(keyManagerFactoryMock2).when(sslManagerBundleMock3).getKeyManagerFactory();
            doReturn(sslManagerBundleMock, sslManagerBundleMock2, sslManagerBundleMock3, sslManagerBundleMock4).when(sslBundleMock).getManagers();
            doReturn(trustManagerFactoryMock2).when(sslManagerBundleMock4).getTrustManagerFactory();
            doReturn(sslOptionsMock, sslOptionsMock2).when(sslBundleMock).getOptions();
            String[] stringArray3 = new String[] {};
            doReturn(stringArray3).when(sslOptionsMock2).getEnabledProtocols();
            String[] stringArray4 = new String[] {};
            doReturn(stringArray4).when(sslOptionsMock2).getCiphers();
            http2SslContextSpec.when(() -> Http2SslContextSpec.forServer(keyManagerFactoryMock)).thenReturn(http2SslContextSpecMock);
            doReturn(abstractProtocolSslContextSpecMock).when(http2SslContextSpecMock).configure((Consumer) any());
            http2SslContextSpec.when(() -> Http2SslContextSpec.forServer(keyManagerFactoryMock2)).thenReturn(http2SslContextSpecMock2);
            doReturn(abstractProtocolSslContextSpecMock2).when(http2SslContextSpecMock2).configure((Consumer) any());
            Http2 http2 = new Http2();
            http2.setEnabled(true);
            target = new SslServerCustomizer(http2, Ssl.ClientAuth.NEED, sslBundleMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            AbstractProtocolSslContextSpec<?> result = target.createSslContextSpec(sslBundleMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(abstractProtocolSslContextSpecMock2));
                verify(sslBundleMock, times(4)).getManagers();
                verify(sslManagerBundleMock).getKeyManagerFactory();
                verify(sslManagerBundleMock2).getTrustManagerFactory();
                verify(sslBundleMock, times(2)).getOptions();
                verify(sslOptionsMock).getEnabledProtocols();
                verify(sslOptionsMock).getCiphers();
                verify(sslManagerBundleMock3).getKeyManagerFactory();
                verify(sslManagerBundleMock4).getTrustManagerFactory();
                verify(sslOptionsMock2).getEnabledProtocols();
                verify(sslOptionsMock2).getCiphers();
                http2SslContextSpec.verify(() -> Http2SslContextSpec.forServer(keyManagerFactoryMock), atLeast(1));
                verify(http2SslContextSpecMock).configure((Consumer) any());
                http2SslContextSpec.verify(() -> Http2SslContextSpec.forServer(keyManagerFactoryMock2), atLeast(1));
                verify(http2SslContextSpecMock2).configure((Consumer) any());
            });
        }
    }
}
