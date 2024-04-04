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

	//Sapient generated method id: ${89959e46-37c3-3767-a195-87d514b13728}, hash: 524856831C1BFDC796FA188E53F22148
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

	//Sapient generated method id: ${e024a173-681d-3599-9bd6-03c034f3c004}, hash: 4E72A6DE27FE5E50FC212367A084B7BA
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

	//Sapient generated method id: ${9bd240d5-d80c-36d5-889f-e8891fb37e9a}, hash: A73FE69C89D1555BF1331CA4A6B09333
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

	//Sapient generated method id: ${a8ca50f9-2860-34d1-b1b6-1dd87d00f294}, hash: 9010CFBACA971AAC83BBDFF89162C021
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

	//Sapient generated method id: ${1300c0de-793f-3360-aeaa-29295ba9842e}, hash: 599634213AC45983ADE3F648B4046E47
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
