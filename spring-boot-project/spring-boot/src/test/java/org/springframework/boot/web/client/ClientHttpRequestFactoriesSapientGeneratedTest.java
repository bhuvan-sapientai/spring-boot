package org.springframework.boot.web.client;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.http.client.JettyClientHttpRequestFactory;

import org.mockito.stubbing.Answer;

import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.util.Assert;
import org.springframework.http.client.JdkClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ClientHttpRequestFactoriesSapientGeneratedTest {

	private final ClientHttpRequestFactory clientHttpRequestFactoryMock = mock(ClientHttpRequestFactory.class);

	private final ClientHttpRequestFactorySettings clientHttpRequestFactorySettingsMock = mock(ClientHttpRequestFactorySettings.class);

	private final HttpComponentsClientHttpRequestFactory httpComponentsClientHttpRequestFactoryMock = mock(HttpComponentsClientHttpRequestFactory.class);

	private final JettyClientHttpRequestFactory jettyClientHttpRequestFactoryMock = mock(JettyClientHttpRequestFactory.class);

	private final OkHttp3ClientHttpRequestFactory okHttp3ClientHttpRequestFactoryMock = mock(OkHttp3ClientHttpRequestFactory.class);

	private final SimpleClientHttpRequestFactory simpleClientHttpRequestFactoryMock = mock(SimpleClientHttpRequestFactory.class);

	//Sapient generated method id: ${a68b91b7-5fc8-3b1c-b4c4-351bd8093b79}, hash: B75BA2B350A5C926A3748849321CDC7D
	@Test()
	void getWhenAPACHE_HTTP_CLIENT_PRESENT() {
		/* Branches:
		 * (APACHE_HTTP_CLIENT_PRESENT) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClientHttpRequestFactories.HttpComponents> clientHttpRequestFactoriesHttpComponents = mockStatic(ClientHttpRequestFactories.HttpComponents.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(clientHttpRequestFactorySettingsMock, "Settings must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			clientHttpRequestFactoriesHttpComponents.when(() -> ClientHttpRequestFactories.HttpComponents.get(clientHttpRequestFactorySettingsMock)).thenReturn(httpComponentsClientHttpRequestFactoryMock);
			//Act Statement(s)
			ClientHttpRequestFactory result = ClientHttpRequestFactories.get(clientHttpRequestFactorySettingsMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(httpComponentsClientHttpRequestFactoryMock));
				_assert.verify(() -> Assert.notNull(clientHttpRequestFactorySettingsMock, "Settings must not be null"), atLeast(1));
				clientHttpRequestFactoriesHttpComponents.verify(() -> ClientHttpRequestFactories.HttpComponents.get(clientHttpRequestFactorySettingsMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3f573db9-3ba0-3efe-a87a-10095c3b08e5}, hash: 8D713C430603E9B65EDF170807DE2145
	@Disabled()
	@Test()
	void getWhenJETTY_CLIENT_PRESENT() {
		/* Branches:
		 * (APACHE_HTTP_CLIENT_PRESENT) : false
		 * (JETTY_CLIENT_PRESENT) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClientHttpRequestFactories.Jetty> clientHttpRequestFactoriesJetty = mockStatic(ClientHttpRequestFactories.Jetty.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(clientHttpRequestFactorySettingsMock, "Settings must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			clientHttpRequestFactoriesJetty.when(() -> ClientHttpRequestFactories.Jetty.get(clientHttpRequestFactorySettingsMock)).thenReturn(jettyClientHttpRequestFactoryMock);
			//Act Statement(s)
			ClientHttpRequestFactory result = ClientHttpRequestFactories.get(clientHttpRequestFactorySettingsMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(jettyClientHttpRequestFactoryMock));
				_assert.verify(() -> Assert.notNull(clientHttpRequestFactorySettingsMock, "Settings must not be null"), atLeast(1));
				clientHttpRequestFactoriesJetty.verify(() -> ClientHttpRequestFactories.Jetty.get(clientHttpRequestFactorySettingsMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${050cddae-1063-3626-8133-5e136f6c3ce0}, hash: A6C59171164090E0841EDC40A05BE0BC
	@Disabled()
	@Test()
	void getWhenOKHTTP_CLIENT_PRESENT() {
		/* Branches:
		 * (APACHE_HTTP_CLIENT_PRESENT) : false
		 * (JETTY_CLIENT_PRESENT) : false
		 * (OKHTTP_CLIENT_PRESENT) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClientHttpRequestFactories.OkHttp> clientHttpRequestFactoriesOkHttp = mockStatic(ClientHttpRequestFactories.OkHttp.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(clientHttpRequestFactorySettingsMock, "Settings must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			clientHttpRequestFactoriesOkHttp.when(() -> ClientHttpRequestFactories.OkHttp.get(clientHttpRequestFactorySettingsMock)).thenReturn(okHttp3ClientHttpRequestFactoryMock);
			//Act Statement(s)
			ClientHttpRequestFactory result = ClientHttpRequestFactories.get(clientHttpRequestFactorySettingsMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(okHttp3ClientHttpRequestFactoryMock));
				_assert.verify(() -> Assert.notNull(clientHttpRequestFactorySettingsMock, "Settings must not be null"), atLeast(1));
				clientHttpRequestFactoriesOkHttp.verify(() -> ClientHttpRequestFactories.OkHttp.get(clientHttpRequestFactorySettingsMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${bdc67078-792b-3083-9388-f8cabbc87b35}, hash: 24917E6D620E52196139077E2CF6F6A7
	@Disabled()
	@Test()
	void getWhenNotOKHTTP_CLIENT_PRESENT() {
		/* Branches:
		 * (APACHE_HTTP_CLIENT_PRESENT) : false
		 * (JETTY_CLIENT_PRESENT) : false
		 * (OKHTTP_CLIENT_PRESENT) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClientHttpRequestFactories.Simple> clientHttpRequestFactoriesSimple = mockStatic(ClientHttpRequestFactories.Simple.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(clientHttpRequestFactorySettingsMock, "Settings must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			clientHttpRequestFactoriesSimple.when(() -> ClientHttpRequestFactories.Simple.get(clientHttpRequestFactorySettingsMock)).thenReturn(simpleClientHttpRequestFactoryMock);
			//Act Statement(s)
			ClientHttpRequestFactory result = ClientHttpRequestFactories.get(clientHttpRequestFactorySettingsMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(simpleClientHttpRequestFactoryMock));
				_assert.verify(() -> Assert.notNull(clientHttpRequestFactorySettingsMock, "Settings must not be null"), atLeast(1));
				clientHttpRequestFactoriesSimple.verify(() -> ClientHttpRequestFactories.Simple.get(clientHttpRequestFactorySettingsMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${808814c3-22ac-30e7-b42f-05e0304b52d9}, hash: EC4FFBE733FEC093ED6780B9AC33B253
	@Test()
	void get1WhenRequestFactoryTypeEqualsClientHttpRequestFactory() {
		/* Branches:
		 * (requestFactoryType == ClientHttpRequestFactory.class) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClientHttpRequestFactories> clientHttpRequestFactories = mockStatic(ClientHttpRequestFactories.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(clientHttpRequestFactorySettingsMock, "Settings must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			clientHttpRequestFactories.when(() -> ClientHttpRequestFactories.get(clientHttpRequestFactorySettingsMock)).thenReturn(clientHttpRequestFactoryMock);
			//Act Statement(s)
			ClientHttpRequestFactory result = ClientHttpRequestFactories.get(ClientHttpRequestFactory.class, clientHttpRequestFactorySettingsMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(clientHttpRequestFactoryMock));
				_assert.verify(() -> Assert.notNull(clientHttpRequestFactorySettingsMock, "Settings must not be null"), atLeast(1));
				clientHttpRequestFactories.verify(() -> ClientHttpRequestFactories.get(clientHttpRequestFactorySettingsMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${1e81cac3-f2f6-3b18-89e6-358cc6cf21a9}, hash: 5FB8E2901FB5799E0EEA1CA5794E59BE
	@Test()
	void get1WhenRequestFactoryTypeEqualsHttpComponentsClientHttpRequestFactory() {
		/* Branches:
		 * (requestFactoryType == ClientHttpRequestFactory.class) : false
		 * (requestFactoryType == HttpComponentsClientHttpRequestFactory.class) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClientHttpRequestFactories.HttpComponents> clientHttpRequestFactoriesHttpComponents = mockStatic(ClientHttpRequestFactories.HttpComponents.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(clientHttpRequestFactorySettingsMock, "Settings must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			clientHttpRequestFactoriesHttpComponents.when(() -> ClientHttpRequestFactories.HttpComponents.get(clientHttpRequestFactorySettingsMock)).thenReturn(httpComponentsClientHttpRequestFactoryMock);
			//Act Statement(s)
			ClientHttpRequestFactory result = ClientHttpRequestFactories.get(HttpComponentsClientHttpRequestFactory.class, clientHttpRequestFactorySettingsMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(httpComponentsClientHttpRequestFactoryMock));
				_assert.verify(() -> Assert.notNull(clientHttpRequestFactorySettingsMock, "Settings must not be null"), atLeast(1));
				clientHttpRequestFactoriesHttpComponents.verify(() -> ClientHttpRequestFactories.HttpComponents.get(clientHttpRequestFactorySettingsMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${ef87021b-ac45-3ac1-9c8b-b5473dc4cfc6}, hash: 354AA78C50B5370CE213C70ADB001834
	@Test()
	void get1WhenRequestFactoryTypeEqualsJettyClientHttpRequestFactory() {
		/* Branches:
		 * (requestFactoryType == ClientHttpRequestFactory.class) : false
		 * (requestFactoryType == HttpComponentsClientHttpRequestFactory.class) : false
		 * (requestFactoryType == JettyClientHttpRequestFactory.class) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClientHttpRequestFactories.Jetty> clientHttpRequestFactoriesJetty = mockStatic(ClientHttpRequestFactories.Jetty.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(clientHttpRequestFactorySettingsMock, "Settings must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			clientHttpRequestFactoriesJetty.when(() -> ClientHttpRequestFactories.Jetty.get(clientHttpRequestFactorySettingsMock)).thenReturn(jettyClientHttpRequestFactoryMock);
			//Act Statement(s)
			ClientHttpRequestFactory result = ClientHttpRequestFactories.get(JettyClientHttpRequestFactory.class, clientHttpRequestFactorySettingsMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(jettyClientHttpRequestFactoryMock));
				_assert.verify(() -> Assert.notNull(clientHttpRequestFactorySettingsMock, "Settings must not be null"), atLeast(1));
				clientHttpRequestFactoriesJetty.verify(() -> ClientHttpRequestFactories.Jetty.get(clientHttpRequestFactorySettingsMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${7c426a17-9fe8-3a6f-92c3-d25d87da4cb7}, hash: 7BEBF239A83886B55479522EEFED30BB
	@Test()
	void get1WhenRequestFactoryTypeEqualsJdkClientHttpRequestFactory() {
		/* Branches:
		 * (requestFactoryType == ClientHttpRequestFactory.class) : false
		 * (requestFactoryType == HttpComponentsClientHttpRequestFactory.class) : false
		 * (requestFactoryType == JettyClientHttpRequestFactory.class) : false
		 * (requestFactoryType == JdkClientHttpRequestFactory.class) : true
		 */
		//Arrange Statement(s)
		JdkClientHttpRequestFactory jdkClientHttpRequestFactoryMock = mock(JdkClientHttpRequestFactory.class);
		try (MockedStatic<ClientHttpRequestFactories.Jdk> clientHttpRequestFactoriesJdk = mockStatic(ClientHttpRequestFactories.Jdk.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(clientHttpRequestFactorySettingsMock, "Settings must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			clientHttpRequestFactoriesJdk.when(() -> ClientHttpRequestFactories.Jdk.get(clientHttpRequestFactorySettingsMock)).thenReturn(jdkClientHttpRequestFactoryMock);
			//Act Statement(s)
			ClientHttpRequestFactory result = ClientHttpRequestFactories.get(JdkClientHttpRequestFactory.class, clientHttpRequestFactorySettingsMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(jdkClientHttpRequestFactoryMock));
				_assert.verify(() -> Assert.notNull(clientHttpRequestFactorySettingsMock, "Settings must not be null"), atLeast(1));
				clientHttpRequestFactoriesJdk.verify(() -> ClientHttpRequestFactories.Jdk.get(clientHttpRequestFactorySettingsMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${e42c3b2d-efee-3364-96fb-ab96dc225600}, hash: AD1F011886C677970F9D33C00ECD70FF
	@Test()
	void get1WhenRequestFactoryTypeEqualsSimpleClientHttpRequestFactory() {
		/* Branches:
		 * (requestFactoryType == ClientHttpRequestFactory.class) : false
		 * (requestFactoryType == HttpComponentsClientHttpRequestFactory.class) : false
		 * (requestFactoryType == JettyClientHttpRequestFactory.class) : false
		 * (requestFactoryType == JdkClientHttpRequestFactory.class) : false
		 * (requestFactoryType == SimpleClientHttpRequestFactory.class) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClientHttpRequestFactories.Simple> clientHttpRequestFactoriesSimple = mockStatic(ClientHttpRequestFactories.Simple.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(clientHttpRequestFactorySettingsMock, "Settings must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			clientHttpRequestFactoriesSimple.when(() -> ClientHttpRequestFactories.Simple.get(clientHttpRequestFactorySettingsMock)).thenReturn(simpleClientHttpRequestFactoryMock);
			//Act Statement(s)
			ClientHttpRequestFactory result = ClientHttpRequestFactories.get(SimpleClientHttpRequestFactory.class, clientHttpRequestFactorySettingsMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(simpleClientHttpRequestFactoryMock));
				_assert.verify(() -> Assert.notNull(clientHttpRequestFactorySettingsMock, "Settings must not be null"), atLeast(1));
				clientHttpRequestFactoriesSimple.verify(() -> ClientHttpRequestFactories.Simple.get(clientHttpRequestFactorySettingsMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${be782244-bd76-349f-8176-7b33f635f68f}, hash: 1A450762033F64686D0EC2E3BBAF4A9F
	@Test()
	void get1WhenRequestFactoryTypeEqualsOkHttp3ClientHttpRequestFactory() {
		/* Branches:
		 * (requestFactoryType == ClientHttpRequestFactory.class) : false
		 * (requestFactoryType == HttpComponentsClientHttpRequestFactory.class) : false
		 * (requestFactoryType == JettyClientHttpRequestFactory.class) : false
		 * (requestFactoryType == JdkClientHttpRequestFactory.class) : false
		 * (requestFactoryType == SimpleClientHttpRequestFactory.class) : false
		 * (requestFactoryType == OkHttp3ClientHttpRequestFactory.class) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClientHttpRequestFactories.OkHttp> clientHttpRequestFactoriesOkHttp = mockStatic(ClientHttpRequestFactories.OkHttp.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(clientHttpRequestFactorySettingsMock, "Settings must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			clientHttpRequestFactoriesOkHttp.when(() -> ClientHttpRequestFactories.OkHttp.get(clientHttpRequestFactorySettingsMock)).thenReturn(okHttp3ClientHttpRequestFactoryMock);
			//Act Statement(s)
			ClientHttpRequestFactory result = ClientHttpRequestFactories.get(OkHttp3ClientHttpRequestFactory.class, clientHttpRequestFactorySettingsMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(okHttp3ClientHttpRequestFactoryMock));
				_assert.verify(() -> Assert.notNull(clientHttpRequestFactorySettingsMock, "Settings must not be null"), atLeast(1));
				clientHttpRequestFactoriesOkHttp.verify(() -> ClientHttpRequestFactories.OkHttp.get(clientHttpRequestFactorySettingsMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${42102760-fc2b-3f43-8fbd-621c4fa4959b}, hash: C9A97B0E5734D04C8A966E52FFDF2E4B
	@Disabled()
	@Test()
	void get1WhenRequestFactoryTypeNotEqualsOkHttp3ClientHttpRequestFactory() {
		/* Branches:
		 * (requestFactoryType == ClientHttpRequestFactory.class) : false
		 * (requestFactoryType == HttpComponentsClientHttpRequestFactory.class) : false
		 * (requestFactoryType == JettyClientHttpRequestFactory.class) : false
		 * (requestFactoryType == JdkClientHttpRequestFactory.class) : false
		 * (requestFactoryType == SimpleClientHttpRequestFactory.class) : false
		 * (requestFactoryType == OkHttp3ClientHttpRequestFactory.class) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClientHttpRequestFactories.Reflective> clientHttpRequestFactoriesReflective = mockStatic(ClientHttpRequestFactories.Reflective.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(clientHttpRequestFactorySettingsMock, "Settings must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			clientHttpRequestFactoriesReflective.when(() -> ClientHttpRequestFactories.Reflective.get((Supplier) any(), eq(clientHttpRequestFactorySettingsMock))).thenReturn(clientHttpRequestFactoryMock);
			//Act Statement(s)
			ClientHttpRequestFactory result = ClientHttpRequestFactories.get(ClientHttpRequestFactory.class, clientHttpRequestFactorySettingsMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(clientHttpRequestFactoryMock));
				_assert.verify(() -> Assert.notNull(clientHttpRequestFactorySettingsMock, "Settings must not be null"), atLeast(1));
				clientHttpRequestFactoriesReflective.verify(() -> ClientHttpRequestFactories.Reflective.get((Supplier) any(), eq(clientHttpRequestFactorySettingsMock)));
			});
		}
	}

	//Sapient generated method id: ${f91f2aed-7f5a-319b-98be-57aee8abb063}, hash: 02ED3E9254CA49FC7F687B9ADFC79E08
	@Test()
	void get2Test() {
		//Arrange Statement(s)
		Supplier supplierMock = mock(Supplier.class);
		try (MockedStatic<ClientHttpRequestFactories.Reflective> clientHttpRequestFactoriesReflective = mockStatic(ClientHttpRequestFactories.Reflective.class)) {
			clientHttpRequestFactoriesReflective.when(() -> ClientHttpRequestFactories.Reflective.get(supplierMock, clientHttpRequestFactorySettingsMock)).thenReturn(clientHttpRequestFactoryMock);
			//Act Statement(s)
			ClientHttpRequestFactory result = ClientHttpRequestFactories.get(supplierMock, clientHttpRequestFactorySettingsMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(clientHttpRequestFactoryMock));
				clientHttpRequestFactoriesReflective.verify(() -> ClientHttpRequestFactories.Reflective.get(supplierMock, clientHttpRequestFactorySettingsMock), atLeast(1));
			});
		}
	}
}
