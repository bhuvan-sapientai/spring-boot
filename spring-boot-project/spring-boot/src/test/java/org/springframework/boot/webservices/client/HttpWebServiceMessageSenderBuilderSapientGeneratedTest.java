package org.springframework.boot.webservices.client;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import org.mockito.stubbing.Answer;

import java.util.function.Function;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import org.springframework.ws.transport.WebServiceMessageSender;
import org.springframework.util.Assert;
import org.springframework.boot.ssl.SslBundle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class HttpWebServiceMessageSenderBuilderSapientGeneratedTest {

	//Sapient generated method id: ${86ee629c-0ba2-3621-be0c-9253221b22d7}, hash: 389B5D647043D198B291A4018CA47ED5
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

	//Sapient generated method id: ${8aac9f86-b86a-3daa-9783-60dccb2a0dad}, hash: 64763628531D6C242440EACC17F02226
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

	//Sapient generated method id: ${92c78007-018b-30f1-aa98-82434f5ae2de}, hash: A7EF12187E9DC1F2C8881EC49795DC94
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

	//Sapient generated method id: ${a6665d08-b322-3e2d-a225-5caa53e4a392}, hash: 65915571B1DD7A266170FB2B6AE8EB93
	@Test()
	void requestFactoryTest() {
		//Arrange Statement(s)
		Supplier supplierMock = mock(Supplier.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(supplierMock, "RequestFactorySupplier must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			HttpWebServiceMessageSenderBuilder target = new HttpWebServiceMessageSenderBuilder();
			//Act Statement(s)
			HttpWebServiceMessageSenderBuilder result = target.requestFactory(supplierMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(target));
				_assert.verify(() -> Assert.notNull(supplierMock, "RequestFactorySupplier must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f016c840-acf3-3dbb-818a-1b7c1f3d65fa}, hash: D8F635764DCC39BF8678695AE999F611
	@Test()
	void requestFactory1Test() {
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(functionMock, "RequestFactoryFunction must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			HttpWebServiceMessageSenderBuilder target = new HttpWebServiceMessageSenderBuilder();
			//Act Statement(s)
			HttpWebServiceMessageSenderBuilder result = target.requestFactory(functionMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(target));
				_assert.verify(() -> Assert.notNull(functionMock, "RequestFactoryFunction must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${889123d2-ed1f-351f-bc23-d72ecfa958d7}, hash: 2FDDB3A6EDD8F3B0EAAF2D5A0EF9772D
	@Test()
	void buildWhenThisRequestFactoryIsNull() {
		/* Branches:
		 * (this.requestFactory != null) : false  #  inside getRequestFactory method
		 */
		//Arrange Statement(s)
		HttpWebServiceMessageSenderBuilder target = new HttpWebServiceMessageSenderBuilder();

		//Act Statement(s)
		WebServiceMessageSender result = target.build();

		//Assert statement(s)
		//TODO: Please implement equals method in ClientHttpRequestMessageSender for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
