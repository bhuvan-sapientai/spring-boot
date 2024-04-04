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
import org.mockito.MockedStatic;
import org.xnio.SslClientAuthMode;

import org.springframework.boot.ssl.SslBundle;

import org.xnio.Options;

import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SslBuilderCustomizerSapientGeneratedTest {

	private final SslBundle sslBundleMock = mock(SslBundle.class, "sslBundle");

	private final Undertow.Builder builderMock = mock(Undertow.Builder.class);

	private final SSLContext sSLContextMock = mock(SSLContext.class);

	private final SslOptions sslOptionsMock = mock(SslOptions.class);

	private final Undertow.Builder undertowBuilderMock = mock(Undertow.Builder.class);

	private final Undertow.Builder undertowBuilderMock2 = mock(Undertow.Builder.class);

	//Sapient generated method id: ${f26132c4-ec90-302a-9165-06d92ddb4548}, hash: 3B1DCC0017640BF815567CC3CE866BB3
	@Test()
	void customizeWhenOptionsGetCiphersIsNotNull() {
		/* Branches:
		 * (this.address == null) : true  #  inside getListenAddress method
		 * (options.getEnabledProtocols() != null) : true
		 * (options.getCiphers() != null) : true
		 */
		//Arrange Statement(s)
		Undertow.Builder undertowBuilderMock3 = mock(Undertow.Builder.class);
		Sequence<String> sequenceMock = mock(Sequence.class);
		Undertow.Builder undertowBuilderMock4 = mock(Undertow.Builder.class);
		Sequence<String> sequenceMock2 = mock(Sequence.class);
		try (MockedStatic<Sequence> sequence = mockStatic(Sequence.class)) {
			doReturn(undertowBuilderMock).when(builderMock).addHttpsListener(0, "0.0.0.0", sSLContextMock);
			Option option = Options.SSL_CLIENT_AUTH_MODE;
			doReturn(undertowBuilderMock2).when(builderMock).setSocketOption(option, SslClientAuthMode.REQUIRED);
			Option option2 = Options.SSL_ENABLED_PROTOCOLS;
			doReturn(undertowBuilderMock3).when(builderMock).setSocketOption(option2, sequenceMock);
			Option option3 = Options.SSL_ENABLED_CIPHER_SUITES;
			doReturn(undertowBuilderMock4).when(builderMock).setSocketOption(option3, sequenceMock2);
			String[] stringArray = new String[] {};
			sequence.when(() -> Sequence.of(stringArray)).thenReturn(sequenceMock);
			String[] stringArray2 = new String[] {};
			sequence.when(() -> Sequence.of(stringArray2)).thenReturn(sequenceMock2);
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
				verify(builderMock).setSocketOption(option2, sequenceMock);
				verify(builderMock).setSocketOption(option3, sequenceMock2);
				sequence.verify(() -> Sequence.of(stringArray), atLeast(1));
				sequence.verify(() -> Sequence.of(stringArray2), atLeast(1));
				verify(sslBundleMock).getOptions();
				verify(sslOptionsMock, times(2)).getEnabledProtocols();
				verify(sslOptionsMock, times(2)).getCiphers();
				verify(sslBundleMock).createSslContext();
			});
		}
	}

	//Sapient generated method id: ${803e875d-1e76-3a14-b9d3-12a32879f704}, hash: 7AB2FEEA386C1AD411DC3DEC66918F1F
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
