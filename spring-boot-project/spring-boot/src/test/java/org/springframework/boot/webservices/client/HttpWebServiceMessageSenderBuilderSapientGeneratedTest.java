package org.springframework.boot.webservices.client;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import org.springframework.boot.web.client.ClientHttpRequestFactories;
import org.springframework.boot.web.client.ClientHttpRequestFactorySettings;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.ws.transport.WebServiceMessageSender;
import org.springframework.util.Assert;

import java.time.Duration;
import java.util.function.Function;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import org.springframework.ws.transport.http.ClientHttpRequestMessageSender;
import org.springframework.boot.ssl.SslBundle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class HttpWebServiceMessageSenderBuilderSapientGeneratedTest {

	//Sapient generated method id: ${86ee629c-0ba2-3621-be0c-9253221b22d7}
	@Test()
	void setConnectTimeoutTest() {
		//Arrange Statement(s)
		HttpWebServiceMessageSenderBuilder target = new HttpWebServiceMessageSenderBuilder();
		Duration duration = Duration.ofDays(0L);
		//Act Statement(s)
		HttpWebServiceMessageSenderBuilder result = target.setConnectTimeout(duration);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${8aac9f86-b86a-3daa-9783-60dccb2a0dad}
	@Test()
	void setReadTimeoutTest() {
		//Arrange Statement(s)
		HttpWebServiceMessageSenderBuilder target = new HttpWebServiceMessageSenderBuilder();
		Duration duration = Duration.ofDays(0L);
		//Act Statement(s)
		HttpWebServiceMessageSenderBuilder result = target.setReadTimeout(duration);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${92c78007-018b-30f1-aa98-82434f5ae2de}
	@Test()
	void sslBundleTest() {
		//Arrange Statement(s)
		HttpWebServiceMessageSenderBuilder target = new HttpWebServiceMessageSenderBuilder();
		SslBundle sslBundleMock = mock(SslBundle.class);
		//Act Statement(s)
		HttpWebServiceMessageSenderBuilder result = target.sslBundle(sslBundleMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${a6665d08-b322-3e2d-a225-5caa53e4a392}
	@Test()
	void requestFactoryTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Supplier) null, "RequestFactorySupplier must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			HttpWebServiceMessageSenderBuilder target = new HttpWebServiceMessageSenderBuilder();
			//TODO: Needs initialization with real value
			Supplier supplier = null;
			//Act Statement(s)
			HttpWebServiceMessageSenderBuilder result = target.requestFactory(supplier);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(target));
				_assert.verify(() -> Assert.notNull((Supplier) null, "RequestFactorySupplier must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f016c840-acf3-3dbb-818a-1b7c1f3d65fa}
	@Test()
	void requestFactory1Test() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Function) null, "RequestFactoryFunction must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			HttpWebServiceMessageSenderBuilder target = new HttpWebServiceMessageSenderBuilder();
			//TODO: Needs initialization with real value
			Function function = null;
			//Act Statement(s)
			HttpWebServiceMessageSenderBuilder result = target.requestFactory(function);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(target));
				_assert.verify(() -> Assert.notNull((Function) null, "RequestFactoryFunction must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${889123d2-ed1f-351f-bc23-d72ecfa958d7}
	@Disabled()
	@Test()
	void buildWhenThisRequestFactoryIsNull() {
		/* Branches:
		 * (this.requestFactory != null) : false  #  inside getRequestFactory method
		 */
		//Arrange Statement(s)
		HttpWebServiceMessageSenderBuilder target = new HttpWebServiceMessageSenderBuilder();
		//Act Statement(s)
		WebServiceMessageSender result = target.build();
		ClientHttpRequestFactorySettings clientHttpRequestFactorySettings = new ClientHttpRequestFactorySettings((Duration) null, (Duration) null, (SslBundle) null);
		ClientHttpRequestFactory clientHttpRequestFactory = ClientHttpRequestFactories.get(clientHttpRequestFactorySettings);
		ClientHttpRequestMessageSender clientHttpRequestMessageSender = new ClientHttpRequestMessageSender(clientHttpRequestFactory);
		//Assert statement(s)
		//TODO: Please implement equals method in ClientHttpRequestMessageSender for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(clientHttpRequestMessageSender)));
	}
}
