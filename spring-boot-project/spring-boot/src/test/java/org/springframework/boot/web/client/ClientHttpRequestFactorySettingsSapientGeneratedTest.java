package org.springframework.boot.web.client;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import org.springframework.boot.ssl.SslBundle;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ClientHttpRequestFactorySettingsSapientGeneratedTest {

    private final SslBundle sslBundleMock = mock(SslBundle.class);

    //Sapient generated method id: ${withConnectTimeoutTest}, hash: 524856831C1BFDC796FA188E53F22148
    @Test()
    void withConnectTimeoutTest() {
        //Arrange Statement(s)
        Duration duration = Duration.ofDays(0L);
        Duration duration2 = Duration.ofDays(0L);
        ClientHttpRequestFactorySettings target = new ClientHttpRequestFactorySettings(duration, duration2, sslBundleMock);
        Duration duration3 = Duration.ofDays(0L);
        
        //Act Statement(s)
        ClientHttpRequestFactorySettings result = target.withConnectTimeout(duration3);
        ClientHttpRequestFactorySettings clientHttpRequestFactorySettings = new ClientHttpRequestFactorySettings(duration3, duration2, sslBundleMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(clientHttpRequestFactorySettings)));
    }

    //Sapient generated method id: ${withReadTimeoutTest}, hash: 4E72A6DE27FE5E50FC212367A084B7BA
    @Test()
    void withReadTimeoutTest() {
        //Arrange Statement(s)
        Duration duration = Duration.ofDays(0L);
        Duration duration2 = Duration.ofDays(0L);
        ClientHttpRequestFactorySettings target = new ClientHttpRequestFactorySettings(duration, duration2, sslBundleMock);
        Duration duration3 = Duration.ofDays(0L);
        
        //Act Statement(s)
        ClientHttpRequestFactorySettings result = target.withReadTimeout(duration3);
        ClientHttpRequestFactorySettings clientHttpRequestFactorySettings = new ClientHttpRequestFactorySettings(duration, duration3, sslBundleMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(clientHttpRequestFactorySettings)));
    }

    //Sapient generated method id: ${withBufferRequestBodyTest}, hash: A73FE69C89D1555BF1331CA4A6B09333
    @Test()
    void withBufferRequestBodyTest() {
        //Arrange Statement(s)
        Duration duration = Duration.ofDays(0L);
        Duration duration2 = Duration.ofDays(0L);
        ClientHttpRequestFactorySettings target = new ClientHttpRequestFactorySettings(duration, duration2, sslBundleMock);
        
        //Act Statement(s)
        ClientHttpRequestFactorySettings result = target.withBufferRequestBody(false);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${withSslBundleTest}, hash: 9010CFBACA971AAC83BBDFF89162C021
    @Test()
    void withSslBundleTest() {
        //Arrange Statement(s)
        Duration duration = Duration.ofDays(0L);
        Duration duration2 = Duration.ofDays(0L);
        ClientHttpRequestFactorySettings target = new ClientHttpRequestFactorySettings(duration, duration2, sslBundleMock);
        SslBundle sslBundleMock2 = mock(SslBundle.class);
        
        //Act Statement(s)
        ClientHttpRequestFactorySettings result = target.withSslBundle(sslBundleMock2);
        ClientHttpRequestFactorySettings clientHttpRequestFactorySettings = new ClientHttpRequestFactorySettings(duration, duration2, sslBundleMock2);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(clientHttpRequestFactorySettings)));
    }

    //Sapient generated method id: ${bufferRequestBodyTest}, hash: 599634213AC45983ADE3F648B4046E47
    @Test()
    void bufferRequestBodyTest() {
        //Arrange Statement(s)
        Duration duration = Duration.ofDays(0L);
        Duration duration2 = Duration.ofDays(0L);
        ClientHttpRequestFactorySettings target = new ClientHttpRequestFactorySettings(duration, duration2, sslBundleMock);
        
        //Act Statement(s)
        Boolean result = target.bufferRequestBody();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }
}
