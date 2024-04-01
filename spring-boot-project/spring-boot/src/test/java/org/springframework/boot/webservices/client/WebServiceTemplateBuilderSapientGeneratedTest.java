package org.springframework.boot.webservices.client;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.oxm.Unmarshaller;

import java.util.List;

import org.springframework.ws.WebServiceMessageFactory;
import org.springframework.util.CollectionUtils;
import org.springframework.util.Assert;
import org.springframework.oxm.Marshaller;

import java.util.ArrayList;
import java.util.function.Consumer;

import org.springframework.beans.BeanUtils;

import org.mockito.stubbing.Answer;

import org.springframework.boot.context.properties.PropertyMapper;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.util.Set;

import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.transport.WebServiceMessageSender;
import org.springframework.ws.client.support.destination.DestinationProvider;

import java.util.Collection;

import org.mockito.MockedStatic;

import javax.xml.transform.TransformerFactory;

import org.springframework.ws.client.core.FaultMessageResolver;

import static org.mockito.Mockito.doNothing;
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

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class WebServiceTemplateBuilderSapientGeneratedTest {

	private final PropertyMapper propertyMapperMock = mock(PropertyMapper.class);

	private final PropertyMapper propertyMapperMock2 = mock(PropertyMapper.class);

	private final PropertyMapper.Source propertyMapperSourceMock = mock(PropertyMapper.Source.class);

	private final WebServiceMessageFactory webServiceMessageFactoryMock = mock(WebServiceMessageFactory.class);

	private final WebServiceTemplateBuilder webServiceTemplateBuilderMock = mock(WebServiceTemplateBuilder.class);

	private final WebServiceTemplate webServiceTemplateMock = mock(WebServiceTemplate.class);

	//Sapient generated method id: ${94517483-5551-3e65-b920-194664905842}, hash: 9A7B8A885559DA154E475B93354AC4BD
	@Test()
	void detectHttpMessageSenderTest() {
		//Arrange Statement(s)
		WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray = new WebServiceTemplateCustomizer[] {};
		WebServiceTemplateBuilder target = new WebServiceTemplateBuilder(webServiceTemplateCustomizerArray);
		//Act Statement(s)
		WebServiceTemplateBuilder result = target.detectHttpMessageSender(false);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${e3b99423-a509-36f5-97a8-72f4a5b95bdd}, hash: E9B7D0C3BB3E8F3453DC06CA5515E6F6
	@Test()
	void messageSendersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			WebServiceMessageSender[] webServiceMessageSenderArray = new WebServiceMessageSender[] {};
			_assert.when(() -> Assert.notNull(webServiceMessageSenderArray, "MessageSenders must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray = new WebServiceTemplateCustomizer[] {};
			WebServiceTemplateBuilder target = spy(new WebServiceTemplateBuilder(webServiceTemplateCustomizerArray));
			List<WebServiceMessageSender> webServiceMessageSenderList = new ArrayList<>();
			doReturn(webServiceTemplateBuilderMock).when(target).messageSenders(webServiceMessageSenderList);
			//Act Statement(s)
			WebServiceTemplateBuilder result = target.messageSenders(webServiceMessageSenderArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(webServiceTemplateBuilderMock));
				_assert.verify(() -> Assert.notNull(webServiceMessageSenderArray, "MessageSenders must not be null"), atLeast(1));
				verify(target).messageSenders(webServiceMessageSenderList);
			});
		}
	}

	//Sapient generated method id: ${67e822c1-7cd9-3813-b82a-238643f79d11}, hash: C93730A973BC24A3156119B8CB874B93
	@Test()
	void messageSenders1Test() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: messageSenders
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(anyCollection(), eq("MessageSenders must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray = new WebServiceTemplateCustomizer[] {};
			WebServiceTemplateBuilder target = new WebServiceTemplateBuilder(webServiceTemplateCustomizerArray);
			Collection<WebServiceMessageSender> collection = new ArrayList<>();
			//Act Statement(s)
			WebServiceTemplateBuilder result = target.messageSenders(collection);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("MessageSenders must not be null")));
			});
		}
	}

	//Sapient generated method id: ${f07e8ebb-3311-37cd-bc3c-83eecc151d3e}, hash: 4509DFC2E2C95816EE106951695D0495
	@Test()
	void additionalMessageSendersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			WebServiceMessageSender[] webServiceMessageSenderArray = new WebServiceMessageSender[] {};
			_assert.when(() -> Assert.notNull(webServiceMessageSenderArray, "MessageSenders must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray = new WebServiceTemplateCustomizer[] {};
			WebServiceTemplateBuilder target = spy(new WebServiceTemplateBuilder(webServiceTemplateCustomizerArray));
			List<WebServiceMessageSender> webServiceMessageSenderList = new ArrayList<>();
			doReturn(webServiceTemplateBuilderMock).when(target).additionalMessageSenders(webServiceMessageSenderList);
			//Act Statement(s)
			WebServiceTemplateBuilder result = target.additionalMessageSenders(webServiceMessageSenderArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(webServiceTemplateBuilderMock));
				_assert.verify(() -> Assert.notNull(webServiceMessageSenderArray, "MessageSenders must not be null"), atLeast(1));
				verify(target).additionalMessageSenders(webServiceMessageSenderList);
			});
		}
	}

	//Sapient generated method id: ${16629312-e4fe-30d6-b394-f8cb52feaa28}, hash: FBBB9FAEA200793D110D473778B2AB77
	@Test()
	void additionalMessageSenders1Test() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: messageSenders
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(anyCollection(), eq("MessageSenders must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray = new WebServiceTemplateCustomizer[] {};
			WebServiceTemplateBuilder target = new WebServiceTemplateBuilder(webServiceTemplateCustomizerArray);
			Collection<WebServiceMessageSender> collection = new ArrayList<>();
			//Act Statement(s)
			WebServiceTemplateBuilder result = target.additionalMessageSenders(collection);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("MessageSenders must not be null")));
			});
		}
	}

	//Sapient generated method id: ${6ffb8980-063d-3f75-9704-8dba1eced1b8}, hash: 1B72DAE4B098D5ACB98DFEBED02547BE
	@Test()
	void interceptorsTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ClientInterceptor[] clientInterceptorArray = new ClientInterceptor[] {};
			_assert.when(() -> Assert.notNull(clientInterceptorArray, "Interceptors must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray = new WebServiceTemplateCustomizer[] {};
			WebServiceTemplateBuilder target = spy(new WebServiceTemplateBuilder(webServiceTemplateCustomizerArray));
			List<ClientInterceptor> clientInterceptorList = new ArrayList<>();
			doReturn(webServiceTemplateBuilderMock).when(target).interceptors(clientInterceptorList);
			//Act Statement(s)
			WebServiceTemplateBuilder result = target.interceptors(clientInterceptorArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(webServiceTemplateBuilderMock));
				_assert.verify(() -> Assert.notNull(clientInterceptorArray, "Interceptors must not be null"), atLeast(1));
				verify(target).interceptors(clientInterceptorList);
			});
		}
	}

	//Sapient generated method id: ${4a80c754-63d4-3350-8313-9ed78fc15436}, hash: FD853F83DEA6BD21F75DBCA1F8F9C6F1
	@Test()
	void interceptors1Test() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(anyCollection(), eq("Interceptors must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray = new WebServiceTemplateCustomizer[] {};
			WebServiceTemplateBuilder target = new WebServiceTemplateBuilder(webServiceTemplateCustomizerArray);
			Collection<ClientInterceptor> collection = new ArrayList<>();
			//Act Statement(s)
			WebServiceTemplateBuilder result = target.interceptors(collection);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("Interceptors must not be null")));
			});
		}
	}

	//Sapient generated method id: ${6cd2def6-a07c-3b16-9447-40e2f0f3e11c}, hash: 0D43EA3158DE7917422BE260986921B2
	@Test()
	void additionalInterceptorsTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ClientInterceptor[] clientInterceptorArray = new ClientInterceptor[] {};
			_assert.when(() -> Assert.notNull(clientInterceptorArray, "Interceptors must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray = new WebServiceTemplateCustomizer[] {};
			WebServiceTemplateBuilder target = spy(new WebServiceTemplateBuilder(webServiceTemplateCustomizerArray));
			List<ClientInterceptor> clientInterceptorList = new ArrayList<>();
			doReturn(webServiceTemplateBuilderMock).when(target).additionalInterceptors(clientInterceptorList);
			//Act Statement(s)
			WebServiceTemplateBuilder result = target.additionalInterceptors(clientInterceptorArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(webServiceTemplateBuilderMock));
				_assert.verify(() -> Assert.notNull(clientInterceptorArray, "Interceptors must not be null"), atLeast(1));
				verify(target).additionalInterceptors(clientInterceptorList);
			});
		}
	}

	//Sapient generated method id: ${92aa2d5d-bcca-30e2-93bf-6617a5667e3c}, hash: 0F935D31C268743CF7550525DC8E168B
	@Test()
	void additionalInterceptors1Test() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(anyCollection(), eq("Interceptors must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray = new WebServiceTemplateCustomizer[] {};
			WebServiceTemplateBuilder target = new WebServiceTemplateBuilder(webServiceTemplateCustomizerArray);
			Collection<ClientInterceptor> collection = new ArrayList<>();
			//Act Statement(s)
			WebServiceTemplateBuilder result = target.additionalInterceptors(collection);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("Interceptors must not be null")));
			});
		}
	}

	//Sapient generated method id: ${096c8c26-248f-3c0b-a109-b0008208dcb4}, hash: 3393DDDB86D997A9C9D29CCAAFAE3421
	@Test()
	void customizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray = new WebServiceTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(webServiceTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray2 = new WebServiceTemplateCustomizer[] {};
			WebServiceTemplateBuilder target = spy(new WebServiceTemplateBuilder(webServiceTemplateCustomizerArray2));
			List<WebServiceTemplateCustomizer> webServiceTemplateCustomizerList = new ArrayList<>();
			doReturn(webServiceTemplateBuilderMock).when(target).customizers(webServiceTemplateCustomizerList);
			//Act Statement(s)
			WebServiceTemplateBuilder result = target.customizers(webServiceTemplateCustomizerArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(webServiceTemplateBuilderMock));
				_assert.verify(() -> Assert.notNull(webServiceTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
				verify(target).customizers(webServiceTemplateCustomizerList);
			});
		}
	}

	//Sapient generated method id: ${ca87fc2e-658b-3271-a63b-2ef162e0048c}, hash: 400DD5E97CCDF7BD667302FA3AEF0B1D
	@Test()
	void customizers1Test() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(anyCollection(), eq("Customizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray = new WebServiceTemplateCustomizer[] {};
			WebServiceTemplateBuilder target = new WebServiceTemplateBuilder(webServiceTemplateCustomizerArray);
			Collection<WebServiceTemplateCustomizer> collection = new ArrayList<>();
			//Act Statement(s)
			WebServiceTemplateBuilder result = target.customizers(collection);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("Customizers must not be null")));
			});
		}
	}

	//Sapient generated method id: ${01c5b568-1ccf-3f8d-be31-7c6a00d3b86f}, hash: 74AE56DD54864F2E85F867BEF865FFD0
	@Test()
	void additionalCustomizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray = new WebServiceTemplateCustomizer[] {};
			_assert.when(() -> Assert.notNull(webServiceTemplateCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray2 = new WebServiceTemplateCustomizer[] {};
			WebServiceTemplateBuilder target = spy(new WebServiceTemplateBuilder(webServiceTemplateCustomizerArray2));
			List<WebServiceTemplateCustomizer> webServiceTemplateCustomizerList = new ArrayList<>();
			doReturn(webServiceTemplateBuilderMock).when(target).additionalCustomizers(webServiceTemplateCustomizerList);
			//Act Statement(s)
			WebServiceTemplateBuilder result = target.additionalCustomizers(webServiceTemplateCustomizerArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(webServiceTemplateBuilderMock));
				_assert.verify(() -> Assert.notNull(webServiceTemplateCustomizerArray, "Customizers must not be null"), atLeast(1));
				verify(target).additionalCustomizers(webServiceTemplateCustomizerList);
			});
		}
	}

	//Sapient generated method id: ${8954ef70-2a16-3ba2-8617-92e997a66918}, hash: 111B49C59CDF8DE79F63E0A1BFC5C430
	@Test()
	void additionalCustomizers1Test() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(anyCollection(), eq("Customizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray = new WebServiceTemplateCustomizer[] {};
			WebServiceTemplateBuilder target = new WebServiceTemplateBuilder(webServiceTemplateCustomizerArray);
			Collection<WebServiceTemplateCustomizer> collection = new ArrayList<>();
			//Act Statement(s)
			WebServiceTemplateBuilder result = target.additionalCustomizers(collection);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("Customizers must not be null")));
			});
		}
	}

	//Sapient generated method id: ${39e4efad-e355-33de-b39d-12ee91fcfd10}, hash: F511CBF2E5537E329BFEA6EFDABE6566
	@Test()
	void setCheckConnectionForFaultTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray = new WebServiceTemplateCustomizer[] {};
		WebServiceTemplateBuilder target = new WebServiceTemplateBuilder(webServiceTemplateCustomizerArray);
		//Act Statement(s)
		WebServiceTemplateBuilder result = target.setCheckConnectionForFault(false);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${58c3f666-af95-3e51-88ab-a75ab8b56489}, hash: 05FFFE53395515C57184CBE725F55FEB
	@Test()
	void setCheckConnectionForErrorTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray = new WebServiceTemplateCustomizer[] {};
		WebServiceTemplateBuilder target = new WebServiceTemplateBuilder(webServiceTemplateCustomizerArray);
		//Act Statement(s)
		WebServiceTemplateBuilder result = target.setCheckConnectionForError(false);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${ed146324-0a28-35dd-8bf4-b7404e46d227}, hash: A95C0F576A2D037C878305C7F5C14124
	@Test()
	void setWebServiceMessageFactoryTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(webServiceMessageFactoryMock, "MessageFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray = new WebServiceTemplateCustomizer[] {};
			WebServiceTemplateBuilder target = new WebServiceTemplateBuilder(webServiceTemplateCustomizerArray);
			//Act Statement(s)
			WebServiceTemplateBuilder result = target.setWebServiceMessageFactory(webServiceMessageFactoryMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(webServiceMessageFactoryMock, "MessageFactory must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${875c5b35-b630-3521-9709-23b5f0cb3f98}, hash: E8387DA7C4BC530A86E0B68FBFCFF5D3
	@Test()
	void setUnmarshallerTest() {
		//Arrange Statement(s)
		WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray = new WebServiceTemplateCustomizer[] {};
		WebServiceTemplateBuilder target = new WebServiceTemplateBuilder(webServiceTemplateCustomizerArray);
		Unmarshaller unmarshallerMock = mock(Unmarshaller.class);
		//Act Statement(s)
		WebServiceTemplateBuilder result = target.setUnmarshaller(unmarshallerMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${a99ae3a1-ed9d-3637-9630-bfee83d46337}, hash: 9B1BE71626FDA59839EB163B69D13E33
	@Test()
	void setMarshallerTest() {
		//Arrange Statement(s)
		WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray = new WebServiceTemplateCustomizer[] {};
		WebServiceTemplateBuilder target = new WebServiceTemplateBuilder(webServiceTemplateCustomizerArray);
		Marshaller marshallerMock = mock(Marshaller.class);
		//Act Statement(s)
		WebServiceTemplateBuilder result = target.setMarshaller(marshallerMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${a6f3e1f1-3eee-3c7b-ba89-405b1055670c}, hash: 55F52C473615865DD2DE4F5516D305E1
	@Test()
	void setFaultMessageResolverTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray = new WebServiceTemplateCustomizer[] {};
		WebServiceTemplateBuilder target = new WebServiceTemplateBuilder(webServiceTemplateCustomizerArray);
		FaultMessageResolver faultMessageResolverMock = mock(FaultMessageResolver.class);
		//Act Statement(s)
		WebServiceTemplateBuilder result = target.setFaultMessageResolver(faultMessageResolverMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${2c944972-6e11-3ceb-a99f-f457d515238e}, hash: 4A820D1D8C37C9647104CFE04E6E9D02
	@Test()
	void setTransformerFactoryClassTest() {
		//Arrange Statement(s)
		WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray = new WebServiceTemplateCustomizer[] {};
		WebServiceTemplateBuilder target = new WebServiceTemplateBuilder(webServiceTemplateCustomizerArray);
		//Act Statement(s)
		WebServiceTemplateBuilder result = target.setTransformerFactoryClass(TransformerFactory.class);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${56921b66-dba5-34bf-8ed7-035ebd0ec428}, hash: 12121C3BE0972CFAF68C4EDC1A0E798C
	@Test()
	void setDefaultUriTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.hasText("A", "DefaultUri must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
			WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray = new WebServiceTemplateCustomizer[] {};
			WebServiceTemplateBuilder target = spy(new WebServiceTemplateBuilder(webServiceTemplateCustomizerArray));
			doReturn(webServiceTemplateBuilderMock).when(target).setDestinationProvider((DestinationProvider) any());
			//Act Statement(s)
			WebServiceTemplateBuilder result = target.setDefaultUri("A");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(webServiceTemplateBuilderMock));
				_assert.verify(() -> Assert.hasText("A", "DefaultUri must not be empty"), atLeast(1));
				verify(target).setDestinationProvider((DestinationProvider) any());
			});
		}
	}

	//Sapient generated method id: ${465c4786-f89c-33cf-af6d-a671b095865d}, hash: 354F8D67446D59074828470C3D55EC9D
	@Test()
	void setDestinationProviderTest() {
		//Arrange Statement(s)
		DestinationProvider destinationProviderMock = mock(DestinationProvider.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(destinationProviderMock, "DestinationProvider must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray = new WebServiceTemplateCustomizer[] {};
			WebServiceTemplateBuilder target = new WebServiceTemplateBuilder(webServiceTemplateCustomizerArray);
			//Act Statement(s)
			WebServiceTemplateBuilder result = target.setDestinationProvider(destinationProviderMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(destinationProviderMock, "DestinationProvider must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c319ea97-f8d0-37c4-a5dd-88e142a90c6d}, hash: 47E30291C187A77BB2E53602786CE2CB
	@Test()
	void buildTest() {
		//Arrange Statement(s)
		WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray = new WebServiceTemplateCustomizer[] {};
		WebServiceTemplateBuilder target = spy(new WebServiceTemplateBuilder(webServiceTemplateCustomizerArray));
		doReturn(webServiceTemplateMock).when(target).configure((WebServiceTemplate) any());
		//Act Statement(s)
		WebServiceTemplate result = target.build();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(webServiceTemplateMock));
			verify(target).configure((WebServiceTemplate) any());
		});
	}

	//Sapient generated method id: ${716d80b9-84b4-3f5a-bb9e-a90cac149ddf}, hash: 2A7EBC2FCDCECFCAC6695CD6358EE956
	@Test()
	void build1Test() {
		//Arrange Statement(s)
		WebServiceTemplate webServiceTemplateMock2 = mock(WebServiceTemplate.class);
		try (MockedStatic<BeanUtils> beanUtils = mockStatic(BeanUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(WebServiceTemplate.class, "WebServiceTemplateClass must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			beanUtils.when(() -> BeanUtils.instantiateClass(WebServiceTemplate.class)).thenReturn(webServiceTemplateMock);
			WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray = new WebServiceTemplateCustomizer[] {};
			WebServiceTemplateBuilder target = spy(new WebServiceTemplateBuilder(webServiceTemplateCustomizerArray));
			doReturn(webServiceTemplateMock2).when(target).configure(webServiceTemplateMock);
			//Act Statement(s)
			WebServiceTemplate result = target.build(WebServiceTemplate.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(webServiceTemplateMock2));
				_assert.verify(() -> Assert.notNull(WebServiceTemplate.class, "WebServiceTemplateClass must not be null"), atLeast(1));
				beanUtils.verify(() -> BeanUtils.instantiateClass(WebServiceTemplate.class), atLeast(1));
				verify(target).configure(webServiceTemplateMock);
			});
		}
	}

	//Sapient generated method id: ${c259ff0b-7d21-33c4-b3b7-23d8655bf067}, hash: B3E311A7CE1E4F840A77D32EC73C783C
	@Disabled()
	@Test()
	void configureWhenCollectionUtilsIsEmptyCustomizersAndCollectionUtilsIsEmptyThisInterceptors() {
		/* Branches:
		 * (this.messageSenders.isOnlyAdditional()) : false  #  inside configureMessageSenders method
		 * (!CollectionUtils.isEmpty(this.messageSenders.getMessageSenders())) : true  #  inside configureMessageSenders method
		 * (!CollectionUtils.isEmpty(customizers)) : false  #  inside applyCustomizers method
		 * (!CollectionUtils.isEmpty(this.interceptors)) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type PropertyMapper.Source
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class, CALLS_REAL_METHODS);
			 MockedStatic<PropertyMapper> propertyMapper = mockStatic(PropertyMapper.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			WebServiceMessageSender[] webServiceMessageSenderArray = new WebServiceMessageSender[] {};
			WebServiceTemplate webServiceTemplate = new WebServiceTemplate(webServiceMessageFactoryMock);
			webServiceTemplate.setMessageSenders(webServiceMessageSenderArray);
			_assert.when(() -> Assert.notNull(webServiceTemplate, "WebServiceTemplate must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			propertyMapper.when(() -> PropertyMapper.get()).thenReturn(propertyMapperMock);
			doReturn(propertyMapperMock2).when(propertyMapperMock).alwaysApplyingWhenNonNull();
			doReturn(propertyMapperSourceMock).when(propertyMapperMock2).from((Marshaller) null);
			doNothing().when(propertyMapperSourceMock).to((Consumer) any());
			PropertyMapper.Source source = propertyMapperMock2.from((Unmarshaller) null);
			doReturn(source).when(propertyMapperMock2).from((Unmarshaller) null);
			PropertyMapper.Source source2 = propertyMapperMock2.from((DestinationProvider) null);
			doReturn(source2).when(propertyMapperMock2).from((DestinationProvider) null);
			PropertyMapper.Source source3 = propertyMapperMock2.from((Class) null);
			doReturn(source3).when(propertyMapperMock2).from((Class) null);
			PropertyMapper.Source source4 = propertyMapperMock2.from((WebServiceMessageFactory) null);
			doReturn(source4).when(propertyMapperMock2).from((WebServiceMessageFactory) null);
			collectionUtils.when(() -> CollectionUtils.isEmpty((Set) null)).thenReturn(true);
			collectionUtils.when(() -> CollectionUtils.isEmpty(anySet())).thenReturn(false).thenReturn(true);
			WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray = new WebServiceTemplateCustomizer[] {};
			WebServiceTemplateBuilder target = new WebServiceTemplateBuilder(webServiceTemplateCustomizerArray);
			//Act Statement(s)
			WebServiceTemplate result = target.configure(webServiceTemplate);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(webServiceTemplate));
				_assert.verify(() -> Assert.notNull(webServiceTemplate, "WebServiceTemplate must not be null"), atLeast(1));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anySet()), atLeast(2));
				propertyMapper.verify(() -> PropertyMapper.get(), atLeast(1));
				verify(propertyMapperMock, atLeast(1)).alwaysApplyingWhenNonNull();
				verify(propertyMapperMock2, atLeast(1)).from((Marshaller) null);
				verify(propertyMapperSourceMock, atLeast(1)).to((Consumer) any());
				verify(propertyMapperMock2, atLeast(1)).from((Unmarshaller) null);
				verify(propertyMapperMock2, atLeast(1)).from((DestinationProvider) null);
				verify(propertyMapperMock2, atLeast(1)).from((Class) null);
				verify(propertyMapperMock2, atLeast(1)).from((WebServiceMessageFactory) null);
				collectionUtils.verify(() -> CollectionUtils.isEmpty((Set) null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${73bf7e07-0a9c-364b-92a6-bda42ca96497}, hash: ABED35274A828EF56DA0289A719C45DE
	@Disabled()
	@Test()
	void configureWhenCustomizersIsNotEmpty() {
		/* Branches:
		 * (this.messageSenders.isOnlyAdditional()) : true  #  inside configureMessageSenders method
		 * (this.detectHttpMessageSender) : true  #  inside configureMessageSenders method
		 * (!CollectionUtils.isEmpty(customizers)) : false  #  inside applyCustomizers method
		 * (!CollectionUtils.isEmpty(this.interceptors)) : false
		 * (for-each(customizers)) : true  #  inside applyCustomizers method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type PropertyMapper.Source
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		WebServiceTemplateCustomizer webServiceTemplateCustomizerMock = mock(WebServiceTemplateCustomizer.class);
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class, CALLS_REAL_METHODS);
			 MockedStatic<PropertyMapper> propertyMapper = mockStatic(PropertyMapper.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			WebServiceMessageSender[] webServiceMessageSenderArray = new WebServiceMessageSender[] {};
			WebServiceTemplate webServiceTemplate = new WebServiceTemplate(webServiceMessageFactoryMock);
			webServiceTemplate.setMessageSenders(webServiceMessageSenderArray);
			_assert.when(() -> Assert.notNull(webServiceTemplate, "WebServiceTemplate must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			propertyMapper.when(() -> PropertyMapper.get()).thenReturn(propertyMapperMock);
			doReturn(propertyMapperMock2).when(propertyMapperMock).alwaysApplyingWhenNonNull();
			doReturn(propertyMapperSourceMock).when(propertyMapperMock2).from((Marshaller) null);
			doNothing().when(propertyMapperSourceMock).to((Consumer) any());
			PropertyMapper.Source source = propertyMapperMock2.from((Unmarshaller) null);
			doReturn(source).when(propertyMapperMock2).from((Unmarshaller) null);
			PropertyMapper.Source source2 = propertyMapperMock2.from((DestinationProvider) null);
			doReturn(source2).when(propertyMapperMock2).from((DestinationProvider) null);
			PropertyMapper.Source source3 = propertyMapperMock2.from((Class) null);
			doReturn(source3).when(propertyMapperMock2).from((Class) null);
			PropertyMapper.Source source4 = propertyMapperMock2.from((WebServiceMessageFactory) null);
			doReturn(source4).when(propertyMapperMock2).from((WebServiceMessageFactory) null);
			collectionUtils.when(() -> CollectionUtils.isEmpty((Set) null)).thenReturn(true);
			collectionUtils.when(() -> CollectionUtils.isEmpty(anySet())).thenReturn(false);
			WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray = new WebServiceTemplateCustomizer[] { webServiceTemplateCustomizerMock };
			WebServiceTemplateBuilder target = new WebServiceTemplateBuilder(webServiceTemplateCustomizerArray);
			//Act Statement(s)
			WebServiceTemplate result = target.configure(webServiceTemplate);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(webServiceTemplate));
				_assert.verify(() -> Assert.notNull(webServiceTemplate, "WebServiceTemplate must not be null"), atLeast(1));
				propertyMapper.verify(() -> PropertyMapper.get(), atLeast(1));
				verify(propertyMapperMock, atLeast(1)).alwaysApplyingWhenNonNull();
				verify(propertyMapperMock2, atLeast(1)).from((Marshaller) null);
				verify(propertyMapperSourceMock, atLeast(1)).to((Consumer) any());
				verify(propertyMapperMock2, atLeast(1)).from((Unmarshaller) null);
				verify(propertyMapperMock2, atLeast(1)).from((DestinationProvider) null);
				verify(propertyMapperMock2, atLeast(1)).from((Class) null);
				verify(propertyMapperMock2, atLeast(1)).from((WebServiceMessageFactory) null);
				collectionUtils.verify(() -> CollectionUtils.isEmpty((Set) null), atLeast(1));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anySet()), atLeast(1));
			});
		}
	}
}
