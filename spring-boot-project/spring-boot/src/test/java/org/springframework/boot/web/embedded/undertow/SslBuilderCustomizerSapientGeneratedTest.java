package org.springframework.boot.web.embedded.undertow;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.xnio.Option;
import org.springframework.boot.ssl.SslOptions;
import org.springframework.boot.web.server.Ssl;
import java.net.InetAddress;
import org.xnio.Sequence;
import javax.net.ssl.SSLContext;
import io.undertow.Undertow;
import org.xnio.SslClientAuthMode;
import org.springframework.boot.ssl.SslBundle;
import org.xnio.Options;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SslBuilderCustomizerSapientGeneratedTest {

    private final SslBundle sslBundleMock = mock(SslBundle.class, "sslBundle");

    private final Undertow.Builder builderMock = mock(Undertow.Builder.class);

    private final SSLContext sSLContextMock = mock(SSLContext.class);

    private final SslOptions sslOptionsMock = mock(SslOptions.class);

    private final Undertow.Builder undertowBuilderMock = mock(Undertow.Builder.class);

    private final Undertow.Builder undertowBuilderMock2 = mock(Undertow.Builder.class);

    //Sapient generated method id: ${customizeWhenOptionsGetCiphersIsNotNull}, hash: 5FE653372D8F2C8C1E2A760B6C26D9AF
    @Disabled()
    @Test()
    void customizeWhenOptionsGetCiphersIsNotNull() {
        /* Branches:
         * (this.address == null) : true  #  inside getListenAddress method
         * (options.getEnabledProtocols() != null) : true
         * (options.getCiphers() != null) : true
         */
        //Arrange Statement(s)
        doReturn(undertowBuilderMock).when(builderMock).addHttpsListener(0, "0.0.0.0", sSLContextMock);
        Option option = Options.SSL_CLIENT_AUTH_MODE;
        doReturn(undertowBuilderMock2).when(builderMock).setSocketOption(option, SslClientAuthMode.REQUIRED);
        Undertow.Builder undertowBuilderMock3 = mock(Undertow.Builder.class);
        Option option2 = Options.SSL_ENABLED_PROTOCOLS;
        Object[] objectArray = new Object[] {};
        String[] stringArray = new String[] {};
        Sequence sequence = Sequence.of(objectArray);
        sequence.add(stringArray);
        doReturn(undertowBuilderMock3).when(builderMock).setSocketOption(option2, sequence);
        Undertow.Builder undertowBuilderMock4 = mock(Undertow.Builder.class);
        Option option3 = Options.SSL_ENABLED_CIPHER_SUITES;
        Object[] objectArray2 = new Object[] {};
        String[] stringArray2 = new String[] {};
        Sequence sequence2 = Sequence.of(objectArray2);
        sequence2.add(stringArray2);
        doReturn(undertowBuilderMock4).when(builderMock).setSocketOption(option3, sequence2);
        SslBuilderCustomizer target = new SslBuilderCustomizer(0, (InetAddress) null, Ssl.ClientAuth.NEED, sslBundleMock);
        doReturn(sslOptionsMock).when(sslBundleMock).getOptions();
        String[] stringArray3 = new String[] {};
        doReturn(stringArray3, stringArray).when(sslOptionsMock).getEnabledProtocols();
        String[] stringArray4 = new String[] {};
        doReturn(stringArray4, stringArray2).when(sslOptionsMock).getCiphers();
        doReturn(sSLContextMock).when(sslBundleMock).createSslContext();
        //Act Statement(s)
        target.customize(builderMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(builderMock).addHttpsListener(0, "0.0.0.0", sSLContextMock);
            verify(builderMock).setSocketOption(option, SslClientAuthMode.REQUIRED);
            verify(builderMock).setSocketOption(option2, sequence);
            verify(builderMock).setSocketOption(option3, sequence2);
            verify(sslBundleMock).getOptions();
            verify(sslOptionsMock, times(2)).getEnabledProtocols();
            verify(sslOptionsMock, times(2)).getCiphers();
            verify(sslBundleMock).createSslContext();
        });
    }

    //Sapient generated method id: ${customizeWhenThisAddressIsNotNullAndOptionsGetEnabledProtocolsIsNullAndOptionsGetCiphersIsNull}, hash: 7AB2FEEA386C1AD411DC3DEC66918F1F
    @Test()
    void customizeWhenThisAddressIsNotNullAndOptionsGetEnabledProtocolsIsNullAndOptionsGetCiphersIsNull() {
        /* Branches:
         * (this.address == null) : false  #  inside getListenAddress method
         * (options.getEnabledProtocols() != null) : false
         * (options.getCiphers() != null) : false
         */
        //Arrange Statement(s)
        doReturn(undertowBuilderMock).when(builderMock).addHttpsListener(0, "127.0.0.1", sSLContextMock);
        Option option = Options.SSL_CLIENT_AUTH_MODE;
        doReturn(undertowBuilderMock2).when(builderMock).setSocketOption(option, SslClientAuthMode.REQUIRED);
        InetAddress inetAddress = InetAddress.getLoopbackAddress();
        SslBuilderCustomizer target = new SslBuilderCustomizer(0, inetAddress, Ssl.ClientAuth.NEED, sslBundleMock);
        doReturn(sslOptionsMock).when(sslBundleMock).getOptions();
        doReturn(null).when(sslOptionsMock).getEnabledProtocols();
        doReturn(null).when(sslOptionsMock).getCiphers();
        doReturn(sSLContextMock).when(sslBundleMock).createSslContext();
        //Act Statement(s)
        target.customize(builderMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(builderMock).addHttpsListener(0, "127.0.0.1", sSLContextMock);
            verify(builderMock).setSocketOption(option, SslClientAuthMode.REQUIRED);
            verify(sslBundleMock).getOptions();
            verify(sslOptionsMock).getEnabledProtocols();
            verify(sslOptionsMock).getCiphers();
            verify(sslBundleMock).createSslContext();
        });
    }
}
