package org.springframework.boot.web.client;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.util.CollectionUtils;
import org.springframework.util.Assert;
import org.springframework.http.converter.HttpMessageConverter;

import java.time.Duration;
import java.util.function.Function;
import java.nio.charset.Charset;
import java.util.ArrayList;

import org.springframework.beans.BeanUtils;
import org.springframework.boot.ssl.SslBundle;
import org.springframework.web.client.RestTemplate;

import org.mockito.stubbing.Answer;

import org.springframework.web.util.UriTemplateHandler;

import java.util.Collection;

import org.springframework.web.client.ResponseErrorHandler;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import org.springframework.http.client.ClientHttpRequestInterceptor;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class RestTemplateBuilderSapientGeneratedTest {

	private final RestTemplateBuilder restTemplateBuilderMock = mock(RestTemplateBuilder.class);

	private final RestTemplate restTemplateMock = mock(RestTemplate.class);

	//Sapient generated method id: ${97665a55-ae06-32c4-8934-b502a699854c}, hash: D55E94AE7DDDFC3C71111E4EC6158923
	@Test()
	void detectRequestFactoryTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = new RestTemplateBuilder(restTemplateCustomizerArray);
			//Act Statement(s)
			RestTemplateBuilder result = target.detectRequestFactory(false);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${536c0d3e-fcf0-3461-b5f3-210517251c27}, hash: 8210A2B1459B5F0D169BA07A6DC509FC
	@Test()
	void rootUriTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = new RestTemplateBuilder(restTemplateCustomizerArray);
			//Act Statement(s)
			RestTemplateBuilder result = target.rootUri("rootUri1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${bda1e99a-4cd0-3870-a2cc-7e9c9be0890a}, hash: CD004FA0601451C8E96855F50A4C09BE
	@Test()
	void messageConvertersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			HttpMessageConverter<?>[] httpMessageConverterArray = new HttpMessageConverter[] {};
			_assert.when(() -> Assert.notNull(httpMessageConverterArray, "MessageConverters must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = spy(new RestTemplateBuilder(restTemplateCustomizerArray));
			List<HttpMessageConverter<?>> anyList = new ArrayList<>();
			doReturn(restTemplateBuilderMock).when(target).messageConverters(anyList);
			//Act Statement(s)
			RestTemplateBuilder result = target.messageConverters(httpMessageConverterArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(restTemplateBuilderMock));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(httpMessageConverterArray, "MessageConverters must not be null"), atLeast(1));
				verify(target).messageConverters(anyList);
			});
		}
	}

	//Sapient generated method id: ${9793709e-56c4-3b50-b196-c66ac03e06f5}, hash: 604D7461E366FDCAED4D46F617E39EEF
	@Test()
	void messageConverters1Test() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(anyCollection(), eq("MessageConverters must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = new RestTemplateBuilder(restTemplateCustomizerArray);
			Collection<HttpMessageConverter<?>> collection = new ArrayList<>();
			//Act Statement(s)
			RestTemplateBuilder result = target.messageConverters(collection);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("MessageConverters must not be null")));
			});
		}
	}

	//Sapient generated method id: ${725ddcd3-a3e3-3359-ac10-7b3b4b1d4510}, hash: AB1C43C244305E380A1E15EC54E9306C
	@Test()
	void additionalMessageConvertersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			HttpMessageConverter<?>[] httpMessageConverterArray = new HttpMessageConverter[] {};
			_assert.when(() -> Assert.notNull(httpMessageConverterArray, "MessageConverters must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = spy(new RestTemplateBuilder(restTemplateCustomizerArray));
			List<HttpMessageConverter<?>> anyList = new ArrayList<>();
			doReturn(restTemplateBuilderMock).when(target).additionalMessageConverters(anyList);
			//Act Statement(s)
			RestTemplateBuilder result = target.additionalMessageConverters(httpMessageConverterArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(restTemplateBuilderMock));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(httpMessageConverterArray, "MessageConverters must not be null"), atLeast(1));
				verify(target).additionalMessageConverters(anyList);
			});
		}
	}

	//Sapient generated method id: ${03e4e22d-cd1b-3e94-aedb-2ece6f6a65ea}, hash: C0A59D2D38F1B524929313CE7B68037B
	@Test()
	void additionalMessageConverters1WhenAdditionsIsNotNull() {
		/* Branches:
		 * (collection != null) : false  #  inside append method
		 * (additions != null) : true  #  inside append method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(anyCollection(), eq("MessageConverters must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = new RestTemplateBuilder(restTemplateCustomizerArray);
			Collection<HttpMessageConverter<?>> collection = new ArrayList<>();
			//Act Statement(s)
			RestTemplateBuilder result = target.additionalMessageConverters(collection);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("MessageConverters must not be null")));
			});
		}
	}

	//Sapient generated method id: ${30f67ceb-cdc3-3412-8567-395b7ba78bb7}, hash: 1AEE411A32F49AA2155A53D1124B6804
	@Test()
	void defaultMessageConvertersTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type RestTemplate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = new RestTemplateBuilder(restTemplateCustomizerArray);
			//Act Statement(s)
			RestTemplateBuilder result = target.defaultMessageConverters();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${6ffb8980-063d-3f75-9704-8dba1eced1b8}, hash: 5A83321394D756CA4019351553DC52A6
	@Test()
	void interceptorsTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ClientHttpRequestInterceptor[] clientHttpRequestInterceptorArray = new ClientHttpRequestInterceptor[] {};
			_assert.when(() -> Assert.notNull(clientHttpRequestInterceptorArray, "interceptors must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = spy(new RestTemplateBuilder(restTemplateCustomizerArray));
			List<ClientHttpRequestInterceptor> clientHttpRequestInterceptorList = new ArrayList<>();
			doReturn(restTemplateBuilderMock).when(target).interceptors(clientHttpRequestInterceptorList);
			//Act Statement(s)
			RestTemplateBuilder result = target.interceptors(clientHttpRequestInterceptorArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(restTemplateBuilderMock));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(clientHttpRequestInterceptorArray, "interceptors must not be null"), atLeast(1));
				verify(target).interceptors(clientHttpRequestInterceptorList);
			});
		}
	}

	//Sapient generated method id: ${4a80c754-63d4-3350-8313-9ed78fc15436}, hash: 6F2D4F32176CC833CFFC4B22247798DC
	@Test()
	void interceptors1Test() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(anyCollection(), eq("interceptors must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = new RestTemplateBuilder(restTemplateCustomizerArray);
			Collection<ClientHttpRequestInterceptor> collection = new ArrayList<>();
			//Act Statement(s)
			RestTemplateBuilder result = target.interceptors(collection);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("interceptors must not be null")));
			});
		}
	}

	//Sapient generated method id: ${6cd2def6-a07c-3b16-9447-40e2f0f3e11c}, hash: 151DD48D704A0374B2E3DC064924467D
	@Test()
	void additionalInterceptorsTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ClientHttpRequestInterceptor[] clientHttpRequestInterceptorArray = new ClientHttpRequestInterceptor[] {};
			_assert.when(() -> Assert.notNull(clientHttpRequestInterceptorArray, "interceptors must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = spy(new RestTemplateBuilder(restTemplateCustomizerArray));
			List<ClientHttpRequestInterceptor> clientHttpRequestInterceptorList = new ArrayList<>();
			doReturn(restTemplateBuilderMock).when(target).additionalInterceptors(clientHttpRequestInterceptorList);
			//Act Statement(s)
			RestTemplateBuilder result = target.additionalInterceptors(clientHttpRequestInterceptorArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(restTemplateBuilderMock));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(clientHttpRequestInterceptorArray, "interceptors must not be null"), atLeast(1));
				verify(target).additionalInterceptors(clientHttpRequestInterceptorList);
			});
		}
	}

	//Sapient generated method id: ${f68e3234-9470-3a0d-b45d-cb6c7579e14e}, hash: 67A951AB6E8F5A7733A32F58B81A8BF2
	@Test()
	void additionalInterceptors1WhenAdditionsIsNotNull() {
		/* Branches:
		 * (collection != null) : true  #  inside append method
		 * (additions != null) : true  #  inside append method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(anyCollection(), eq("interceptors must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = new RestTemplateBuilder(restTemplateCustomizerArray);
			Collection<ClientHttpRequestInterceptor> collection = new ArrayList<>();
			//Act Statement(s)
			RestTemplateBuilder result = target.additionalInterceptors(collection);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("interceptors must not be null")));
			});
		}
	}

	//Sapient generated method id: ${a6665d08-b322-3e2d-a225-5caa53e4a392}, hash: B2C91181F4AEBE26214471E5AD394ABB
	@Test()
	void requestFactoryTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(ClientHttpRequestFactory.class, "RequestFactoryType must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = spy(new RestTemplateBuilder(restTemplateCustomizerArray));
			doReturn(restTemplateBuilderMock).when(target).requestFactory((Function) any());
			//Act Statement(s)
			RestTemplateBuilder result = target.requestFactory(ClientHttpRequestFactory.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(restTemplateBuilderMock));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(ClientHttpRequestFactory.class, "RequestFactoryType must not be null"), atLeast(1));
				verify(target).requestFactory((Function) any());
			});
		}
	}

	//Sapient generated method id: ${f016c840-acf3-3dbb-818a-1b7c1f3d65fa}, hash: A72C7349F392FDEEF2EE9D0F917AD42E
	@Test()
	void requestFactory1Test() {
		//Arrange Statement(s)
		Supplier supplierMock = mock(Supplier.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(supplierMock, "RequestFactorySupplier must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = spy(new RestTemplateBuilder(restTemplateCustomizerArray));
			doReturn(restTemplateBuilderMock).when(target).requestFactory((Function) any());
			//Act Statement(s)
			RestTemplateBuilder result = target.requestFactory(supplierMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(restTemplateBuilderMock));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(supplierMock, "RequestFactorySupplier must not be null"), atLeast(1));
				verify(target).requestFactory((Function) any());
			});
		}
	}

	//Sapient generated method id: ${dfe6bc53-f2a2-3d84-9a98-5a83f738a87a}, hash: AB4863DB191536818B9FE29BA6D48921
	@Test()
	void requestFactory2Test() {
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(functionMock, "RequestFactoryFunction must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = new RestTemplateBuilder(restTemplateCustomizerArray);
			//Act Statement(s)
			RestTemplateBuilder result = target.requestFactory(functionMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(functionMock, "RequestFactoryFunction must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${7b41717a-6ff9-3871-b52a-f40d44cc917b}, hash: 9C3E2056D0DB9C7673D023D9C7D0C29E
	@Test()
	void uriTemplateHandlerTest() {
		//Arrange Statement(s)
		UriTemplateHandler uriTemplateHandlerMock = mock(UriTemplateHandler.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(uriTemplateHandlerMock, "UriTemplateHandler must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = new RestTemplateBuilder(restTemplateCustomizerArray);
			//Act Statement(s)
			RestTemplateBuilder result = target.uriTemplateHandler(uriTemplateHandlerMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(uriTemplateHandlerMock, "UriTemplateHandler must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${9f510246-8635-3587-8b49-8cb2a7e2f7cd}, hash: 1A05D9BC9B0D0625D289CCBDC305A016
	@Test()
	void errorHandlerTest() {
		//Arrange Statement(s)
		ResponseErrorHandler responseErrorHandlerMock = mock(ResponseErrorHandler.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(responseErrorHandlerMock, "ErrorHandler must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = new RestTemplateBuilder(restTemplateCustomizerArray);
			//Act Statement(s)
			RestTemplateBuilder result = target.errorHandler(responseErrorHandlerMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(responseErrorHandlerMock, "ErrorHandler must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${dfdd7d87-d001-3115-b4e4-455fb1e8c69a}, hash: 2AB9DD927EF80415A0A8B9EFD9CF3BB2
	@Test()
	void basicAuthenticationTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = spy(new RestTemplateBuilder(restTemplateCustomizerArray));
			doReturn(restTemplateBuilderMock).when(target).basicAuthentication("username1", "password1", (Charset) null);
			//Act Statement(s)
			RestTemplateBuilder result = target.basicAuthentication("username1", "password1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(restTemplateBuilderMock));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
				verify(target).basicAuthentication("username1", "password1", (Charset) null);
			});
		}
	}

	//Sapient generated method id: ${b121e66e-13a0-3fe2-81f9-38e8383a81b0}, hash: 0D4991F0367EA597A2EB67F819A89961
	@Test()
	void basicAuthentication1Test() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = new RestTemplateBuilder(restTemplateCustomizerArray);
			Charset charset = Charset.defaultCharset();
			//Act Statement(s)
			RestTemplateBuilder result = target.basicAuthentication("username1", "password1", charset);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3cd6ce00-9472-3b76-a34a-6edbf4cb7bb9}, hash: 4F60325FF413720AA53EC2FE365535A5
	@Test()
	void defaultHeaderWhenValuesIsNotNull() {
		/* Branches:
		 * (map != null) : true  #  inside append method
		 * (values != null) : true  #  inside append method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = new RestTemplateBuilder(restTemplateCustomizerArray);
			String[] stringArray = new String[] {};
			//Act Statement(s)
			RestTemplateBuilder result = target.defaultHeader("A", stringArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${86ee629c-0ba2-3621-be0c-9253221b22d7}, hash: BE8E05C8E4F79903058BADD78D534626
	@Test()
	void setConnectTimeoutTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = new RestTemplateBuilder(restTemplateCustomizerArray);
			Duration duration = Duration.ofDays(0L);
			//Act Statement(s)
			RestTemplateBuilder result = target.setConnectTimeout(duration);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${8aac9f86-b86a-3daa-9783-60dccb2a0dad}, hash: ADC5C22096E30BE6F8F514668477537C
	@Test()
	void setReadTimeoutTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = new RestTemplateBuilder(restTemplateCustomizerArray);
			Duration duration = Duration.ofDays(0L);
			//Act Statement(s)
			RestTemplateBuilder result = target.setReadTimeout(duration);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${da14e059-7686-3060-9a67-dbd1bf5a7566}, hash: D0FDB4DBD4EBE970B876624E6D9AC7B8
	@Test()
	void setBufferRequestBodyTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = new RestTemplateBuilder(restTemplateCustomizerArray);
			//Act Statement(s)
			RestTemplateBuilder result = target.setBufferRequestBody(false);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(target));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${2e6e3208-5476-3757-afba-eebb6e6c5a82}, hash: C2B766F535F9B60434540ECF4F5B3819
	@Test()
	void setSslBundleTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: requestFactorySettings
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SslBundle sslBundleMock = mock(SslBundle.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = new RestTemplateBuilder(restTemplateCustomizerArray);
			//Act Statement(s)
			RestTemplateBuilder result = target.setSslBundle(sslBundleMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${096c8c26-248f-3c0b-a109-b0008208dcb4}, hash: 1CCDD98CD499202953DC0C6E313E55E4
	@Test()
	void customizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateCustomizer[] restTemplateCustomizerArray2 = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray2, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = spy(new RestTemplateBuilder(restTemplateCustomizerArray));
			List<RestTemplateCustomizer> restTemplateCustomizerList = new ArrayList<>();
			doReturn(restTemplateBuilderMock).when(target).customizers(restTemplateCustomizerList);
			//Act Statement(s)
			RestTemplateBuilder result = target.customizers(restTemplateCustomizerArray2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(restTemplateBuilderMock));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray2, "Customizers must not be null"), atLeast(1));
				verify(target).customizers(restTemplateCustomizerList);
			});
		}
	}

	//Sapient generated method id: ${ca87fc2e-658b-3271-a63b-2ef162e0048c}, hash: B82B0795DF483B16BC4E111A906B1B36
	@Test()
	void customizers1Test() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(anyCollection(), eq("Customizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = new RestTemplateBuilder(restTemplateCustomizerArray);
			Collection<RestTemplateCustomizer> collection = new ArrayList<>();
			//Act Statement(s)
			RestTemplateBuilder result = target.customizers(collection);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("Customizers must not be null")));
			});
		}
	}

	//Sapient generated method id: ${01c5b568-1ccf-3f8d-be31-7c6a00d3b86f}, hash: 4F8FD86AB2DD9B10374102FF62CAF9A1
	@Test()
	void additionalCustomizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateCustomizer[] restTemplateCustomizerArray2 = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray2, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = spy(new RestTemplateBuilder(restTemplateCustomizerArray));
			List<RestTemplateCustomizer> restTemplateCustomizerList = new ArrayList<>();
			doReturn(restTemplateBuilderMock).when(target).additionalCustomizers(restTemplateCustomizerList);
			//Act Statement(s)
			RestTemplateBuilder result = target.additionalCustomizers(restTemplateCustomizerArray2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(restTemplateBuilderMock));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray2, "Customizers must not be null"), atLeast(1));
				verify(target).additionalCustomizers(restTemplateCustomizerList);
			});
		}
	}

	//Sapient generated method id: ${79ef9522-bf28-31ca-8c90-7136eeb1b87f}, hash: 21781F5CC984C1F32F74FADD375D1412
	@Test()
	void additionalCustomizers1WhenAdditionsIsNotNull() {
		/* Branches:
		 * (collection != null) : true  #  inside append method
		 * (additions != null) : true  #  inside append method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(anyCollection(), eq("RestTemplateCustomizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = new RestTemplateBuilder(restTemplateCustomizerArray);
			Collection<RestTemplateCustomizer> collection = new ArrayList<>();
			//Act Statement(s)
			RestTemplateBuilder result = target.additionalCustomizers(collection);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("RestTemplateCustomizers must not be null")));
			});
		}
	}

	//Sapient generated method id: ${6840b62e-c3f8-3199-bdf6-98650e87a4e9}, hash: B39D5309BD763FF15750BE038BAC749D
	@Test()
	void additionalCustomizers1WhenCollectionIsNullAndAdditionsIsNotNull() {
		/* Branches:
		 * (collection != null) : false  #  inside append method
		 * (additions != null) : true  #  inside append method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(anyCollection(), eq("RestTemplateCustomizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = new RestTemplateBuilder(restTemplateCustomizerArray);
			Collection<RestTemplateCustomizer> collection = new ArrayList<>();
			//Act Statement(s)
			RestTemplateBuilder result = target.additionalCustomizers(collection);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("RestTemplateCustomizers must not be null")));
			});
		}
	}

	//Sapient generated method id: ${f9c18056-6636-3fad-9f1a-b9c24a6b7c1a}, hash: 557E040A3577E218E918A9448F2D25B7
	@Test()
	void requestCustomizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateRequestCustomizer<?>[] restTemplateRequestCustomizerArray = new RestTemplateRequestCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateRequestCustomizerArray, "RequestCustomizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = spy(new RestTemplateBuilder(restTemplateCustomizerArray));
			List<RestTemplateRequestCustomizer<?>> anyList = new ArrayList<>();
			doReturn(restTemplateBuilderMock).when(target).requestCustomizers(anyList);
			//Act Statement(s)
			RestTemplateBuilder result = target.requestCustomizers(restTemplateRequestCustomizerArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(restTemplateBuilderMock));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(restTemplateRequestCustomizerArray, "RequestCustomizers must not be null"), atLeast(1));
				verify(target).requestCustomizers(anyList);
			});
		}
	}

	//Sapient generated method id: ${7dbd2f92-370d-3e7a-a4ba-8928c9447b3b}, hash: CB3DBA7256666F08CAE359E460CAB0B2
	@Test()
	void requestCustomizers1Test() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(anyCollection(), eq("RequestCustomizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = new RestTemplateBuilder(restTemplateCustomizerArray);
			Collection<RestTemplateRequestCustomizer<?>> collection = new ArrayList<>();
			//Act Statement(s)
			RestTemplateBuilder result = target.requestCustomizers(collection);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("RequestCustomizers must not be null")));
			});
		}
	}

	//Sapient generated method id: ${705dc877-03b3-35af-8852-32982992efdf}, hash: 9B33E5E3894206413BA316EF0BE39B9B
	@Test()
	void additionalRequestCustomizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateRequestCustomizer<?>[] restTemplateRequestCustomizerArray = new RestTemplateRequestCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateRequestCustomizerArray, "RequestCustomizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = spy(new RestTemplateBuilder(restTemplateCustomizerArray));
			List<RestTemplateRequestCustomizer<?>> anyList = new ArrayList<>();
			doReturn(restTemplateBuilderMock).when(target).additionalRequestCustomizers(anyList);
			//Act Statement(s)
			RestTemplateBuilder result = target.additionalRequestCustomizers(restTemplateRequestCustomizerArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(restTemplateBuilderMock));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(restTemplateRequestCustomizerArray, "RequestCustomizers must not be null"), atLeast(1));
				verify(target).additionalRequestCustomizers(anyList);
			});
		}
	}

	//Sapient generated method id: ${fba586cd-a6f8-37a0-8830-1d00daf332f6}, hash: 9DAA6CC4E573B7C32130F2C58E7522F9
	@Test()
	void additionalRequestCustomizers1WhenAdditionsIsNotNull() {
		/* Branches:
		 * (collection != null) : true  #  inside append method
		 * (additions != null) : true  #  inside append method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(anyCollection(), eq("RequestCustomizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = new RestTemplateBuilder(restTemplateCustomizerArray);
			Collection<RestTemplateRequestCustomizer<?>> collection = new ArrayList<>();
			//Act Statement(s)
			RestTemplateBuilder result = target.additionalRequestCustomizers(collection);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("RequestCustomizers must not be null")));
			});
		}
	}

	//Sapient generated method id: ${c319ea97-f8d0-37c4-a5dd-88e142a90c6d}, hash: D3B7D8F4E657C633603C1D0B731C20CE
	@Test()
	void buildTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = spy(new RestTemplateBuilder(restTemplateCustomizerArray));
			doReturn(restTemplateMock).when(target).configure((RestTemplate) any());
			//Act Statement(s)
			RestTemplate result = target.build();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(restTemplateMock));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
				verify(target).configure((RestTemplate) any());
			});
		}
	}

	//Sapient generated method id: ${716d80b9-84b4-3f5a-bb9e-a90cac149ddf}, hash: 6C1875E8A4BC2A3EF5944BA3E5891E5E
	@Test()
	void build1Test() {
		//Arrange Statement(s)
		RestTemplate restTemplateMock2 = mock(RestTemplate.class);
		try (MockedStatic<BeanUtils> beanUtils = mockStatic(BeanUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			beanUtils.when(() -> BeanUtils.instantiateClass(RestTemplate.class)).thenReturn(restTemplateMock);
			RestTemplateBuilder target = spy(new RestTemplateBuilder(restTemplateCustomizerArray));
			doReturn(restTemplateMock2).when(target).configure(restTemplateMock);
			//Act Statement(s)
			RestTemplate result = target.build(RestTemplate.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(restTemplateMock2));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
				beanUtils.verify(() -> BeanUtils.instantiateClass(RestTemplate.class), atLeast(1));
				verify(target).configure(restTemplateMock);
			});
		}
	}

	//Sapient generated method id: ${060e8243-2637-3267-b9b9-aec67cc13ae1}, hash: E6A6013EF6C3D01539A924CAC17643C2
	@Test()
	void configureWhenThisCustomizersIsEmpty() {
		/* Branches:
		 * (requestFactory != null) : true
		 * (this.basicAuthentication == null) : true  #  inside addClientHttpRequestInitializer method
		 * (this.defaultHeaders.isEmpty()) : true  #  inside addClientHttpRequestInitializer method
		 * (this.requestCustomizers.isEmpty()) : true  #  inside addClientHttpRequestInitializer method
		 * (!CollectionUtils.isEmpty(this.messageConverters)) : false
		 * (this.uriTemplateHandler != null) : false
		 * (this.errorHandler != null) : false
		 * (this.rootUri != null) : false
		 * (!CollectionUtils.isEmpty(this.customizers)) : true
		 * (for-each(this.customizers)) : false
		 */
		//Arrange Statement(s)
		ClientHttpRequestFactory clientHttpRequestFactoryMock = mock(ClientHttpRequestFactory.class);
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			collectionUtils.when(() -> CollectionUtils.isEmpty(anySet())).thenReturn(false);
			RestTemplateBuilder target = spy(new RestTemplateBuilder(restTemplateCustomizerArray));
			doReturn(clientHttpRequestFactoryMock).when(target).buildRequestFactory();
			List<ClientHttpRequestInterceptor> clientHttpRequestInterceptorList = new ArrayList<>();
			RestTemplate restTemplate = new RestTemplate();
			restTemplate.setRequestFactory(clientHttpRequestFactoryMock);
			restTemplate.setInterceptors(clientHttpRequestInterceptorList);
			//Act Statement(s)
			RestTemplate result = target.configure(restTemplate);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(restTemplate));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anySet()), atLeast(1));
				verify(target, atLeast(1)).buildRequestFactory();
			});
		}
	}

	//Sapient generated method id: ${e031ada7-9ecb-391d-90a8-650edabb8ee3}, hash: F74847BC0175AC82D96E38750D657C38
	@Test()
	void buildRequestFactoryWhenThisDetectRequestFactory() {
		/* Branches:
		 * (this.requestFactory != null) : false
		 * (this.detectRequestFactory) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			RestTemplateCustomizer[] restTemplateCustomizerArray = new RestTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			RestTemplateBuilder target = new RestTemplateBuilder(restTemplateCustomizerArray);
			//Act Statement(s)
			ClientHttpRequestFactory result = target.buildRequestFactory();
			//Assert statement(s)
			//TODO: Please implement equals method in ClientHttpRequestFactory for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(restTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
			});
		}
	}
}
