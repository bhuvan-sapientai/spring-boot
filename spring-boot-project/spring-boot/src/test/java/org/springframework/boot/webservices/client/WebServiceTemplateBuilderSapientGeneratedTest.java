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

	private final PropertyMapper.Source propertyMapperSourceMock2 = mock(PropertyMapper.Source.class);

	private final PropertyMapper.Source propertyMapperSourceMock3 = mock(PropertyMapper.Source.class);

	private final PropertyMapper.Source propertyMapperSourceMock4 = mock(PropertyMapper.Source.class);

	private final PropertyMapper.Source propertyMapperSourceMock5 = mock(PropertyMapper.Source.class);

	private final WebServiceTemplateBuilder webServiceTemplateBuilderMock = mock(WebServiceTemplateBuilder.class);

	private final WebServiceTemplate webServiceTemplateMock = mock(WebServiceTemplate.class);

	//Sapient generated method id: ${94517483-5551-3e65-b920-194664905842}
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

	//Sapient generated method id: ${e3b99423-a509-36f5-97a8-72f4a5b95bdd}
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

	//Sapient generated method id: ${67e822c1-7cd9-3813-b82a-238643f79d11}
	@Test()
	void messageSenders1Test() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		WebServiceTemplateCustomizer webServiceTemplateCustomizerMock = mock(WebServiceTemplateCustomizer.class, "void");
		WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray = new WebServiceTemplateCustomizer[] { webServiceTemplateCustomizerMock };
		WebServiceTemplateBuilder target = new WebServiceTemplateBuilder(webServiceTemplateCustomizerArray);
		WebServiceMessageSender webServiceMessageSenderMock = mock(WebServiceMessageSender.class, "void");
		Collection<WebServiceMessageSender> collection = new ArrayList<>();
		collection.add(webServiceMessageSenderMock);
		//Act Statement(s)
		WebServiceTemplateBuilder result = target.messageSenders(collection);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${f07e8ebb-3311-37cd-bc3c-83eecc151d3e}
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

	//Sapient generated method id: ${16629312-e4fe-30d6-b394-f8cb52feaa28}
	@Test()
	void additionalMessageSenders1Test() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		WebServiceTemplateCustomizer webServiceTemplateCustomizerMock = mock(WebServiceTemplateCustomizer.class, "customizers");
		WebServiceTemplateCustomizer[] webServiceTemplateCustomizerArray = new WebServiceTemplateCustomizer[] { webServiceTemplateCustomizerMock };
		WebServiceTemplateBuilder target = new WebServiceTemplateBuilder(webServiceTemplateCustomizerArray);
		WebServiceMessageSender webServiceMessageSenderMock = mock(WebServiceMessageSender.class, "messageSenders");
		Collection<WebServiceMessageSender> collection = new ArrayList<>();
		collection.add(webServiceMessageSenderMock);
		//Act Statement(s)
		WebServiceTemplateBuilder result = target.additionalMessageSenders(collection);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${6ffb8980-063d-3f75-9704-8dba1eced1b8}
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

	//Sapient generated method id: ${4a80c754-63d4-3350-8313-9ed78fc15436}
	@Test()
	void interceptors1Test() {
		/**
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

	//Sapient generated method id: ${6cd2def6-a07c-3b16-9447-40e2f0f3e11c}
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

	//Sapient generated method id: ${92aa2d5d-bcca-30e2-93bf-6617a5667e3c}
	@Test()
	void additionalInterceptors1Test() {
		/**
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

	//Sapient generated method id: ${096c8c26-248f-3c0b-a109-b0008208dcb4}
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

	//Sapient generated method id: ${ca87fc2e-658b-3271-a63b-2ef162e0048c}
	@Test()
	void customizers1Test() {
		/**
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

	//Sapient generated method id: ${01c5b568-1ccf-3f8d-be31-7c6a00d3b86f}
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

	//Sapient generated method id: ${8954ef70-2a16-3ba2-8617-92e997a66918}
	@Test()
	void additionalCustomizers1Test() {
		/**
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

	//Sapient generated method id: ${39e4efad-e355-33de-b39d-12ee91fcfd10}
	@Test()
	void setCheckConnectionForFaultTest() {
		/**
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

	//Sapient generated method id: ${58c3f666-af95-3e51-88ab-a75ab8b56489}
	@Test()
	void setCheckConnectionForErrorTest() {
		/**
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

	//Sapient generated method id: ${ed146324-0a28-35dd-8bf4-b7404e46d227}
	@Test()
	void setWebServiceMessageFactoryTest() {
		//Arrange Statement(s)
		WebServiceMessageFactory webServiceMessageFactoryMock = mock(WebServiceMessageFactory.class);
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

	//Sapient generated method id: ${875c5b35-b630-3521-9709-23b5f0cb3f98}
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

	//Sapient generated method id: ${a99ae3a1-ed9d-3637-9630-bfee83d46337}
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

	//Sapient generated method id: ${a6f3e1f1-3eee-3c7b-ba89-405b1055670c}
	@Test()
	void setFaultMessageResolverTest() {
		/**
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

	//Sapient generated method id: ${2c944972-6e11-3ceb-a99f-f457d515238e}
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

	//Sapient generated method id: ${56921b66-dba5-34bf-8ed7-035ebd0ec428}
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

	//Sapient generated method id: ${465c4786-f89c-33cf-af6d-a671b095865d}
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

	//Sapient generated method id: ${c319ea97-f8d0-37c4-a5dd-88e142a90c6d}
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

	//Sapient generated method id: ${716d80b9-84b4-3f5a-bb9e-a90cac149ddf}
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

	//Sapient generated method id: ${c259ff0b-7d21-33c4-b3b7-23d8655bf067}
	@Disabled()
	@Test()
	void configureWhenCollectionUtilsIsEmptyCustomizersAndCollectionUtilsIsEmptyThisInterceptors() {
		/* Branches:
		 * (this.messageSenders.isOnlyAdditional()) : false  #  inside configureMessageSenders method
		 * (!CollectionUtils.isEmpty(this.messageSenders.getMessageSenders())) : true  #  inside configureMessageSenders method
		 * (!CollectionUtils.isEmpty(customizers)) : false  #  inside applyCustomizers method
		 * (!CollectionUtils.isEmpty(this.interceptors)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class, CALLS_REAL_METHODS);
			 MockedStatic<PropertyMapper> propertyMapper = mockStatic(PropertyMapper.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			WebServiceMessageSender[] webServiceMessageSenderArray = new WebServiceMessageSender[] {};
			WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
			webServiceTemplate.setMessageSenders(webServiceMessageSenderArray);
			_assert.when(() -> Assert.notNull(webServiceTemplate, "WebServiceTemplate must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			propertyMapper.when(() -> PropertyMapper.get()).thenReturn(propertyMapperMock);
			doReturn(propertyMapperMock2).when(propertyMapperMock).alwaysApplyingWhenNonNull();
			doReturn(propertyMapperSourceMock).when(propertyMapperMock2).from((Marshaller) null);
			doNothing().when(propertyMapperSourceMock).to((Consumer) any());
			doReturn(propertyMapperSourceMock2).when(propertyMapperMock2).from((Unmarshaller) null);
			doNothing().when(propertyMapperSourceMock2).to((Consumer) any());
			doReturn(propertyMapperSourceMock3).when(propertyMapperMock2).from((DestinationProvider) null);
			doNothing().when(propertyMapperSourceMock3).to((Consumer) any());
			doReturn(propertyMapperSourceMock4).when(propertyMapperMock2).from((Class) null);
			doNothing().when(propertyMapperSourceMock4).to((Consumer) any());
			doReturn(propertyMapperSourceMock5).when(propertyMapperMock2).from((WebServiceMessageFactory) null);
			doNothing().when(propertyMapperSourceMock5).to((Consumer) any());
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
				verify(propertyMapperSourceMock2, atLeast(1)).to((Consumer) any());
				verify(propertyMapperMock2, atLeast(1)).from((DestinationProvider) null);
				verify(propertyMapperSourceMock3, atLeast(1)).to((Consumer) any());
				verify(propertyMapperMock2, atLeast(1)).from((Class) null);
				verify(propertyMapperSourceMock4, atLeast(1)).to((Consumer) any());
				verify(propertyMapperMock2, atLeast(1)).from((WebServiceMessageFactory) null);
				verify(propertyMapperSourceMock5, atLeast(1)).to((Consumer) any());
				collectionUtils.verify(() -> CollectionUtils.isEmpty((Set) null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${73bf7e07-0a9c-364b-92a6-bda42ca96497}
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
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		WebServiceTemplateCustomizer webServiceTemplateCustomizerMock = mock(WebServiceTemplateCustomizer.class);
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class, CALLS_REAL_METHODS);
			 MockedStatic<PropertyMapper> propertyMapper = mockStatic(PropertyMapper.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			WebServiceMessageSender[] webServiceMessageSenderArray = new WebServiceMessageSender[] {};
			WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
			webServiceTemplate.setMessageSenders(webServiceMessageSenderArray);
			_assert.when(() -> Assert.notNull(webServiceTemplate, "WebServiceTemplate must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			propertyMapper.when(() -> PropertyMapper.get()).thenReturn(propertyMapperMock);
			doReturn(propertyMapperMock2).when(propertyMapperMock).alwaysApplyingWhenNonNull();
			doReturn(propertyMapperSourceMock).when(propertyMapperMock2).from((Marshaller) null);
			doNothing().when(propertyMapperSourceMock).to((Consumer) any());
			doReturn(propertyMapperSourceMock2).when(propertyMapperMock2).from((Unmarshaller) null);
			doNothing().when(propertyMapperSourceMock2).to((Consumer) any());
			doReturn(propertyMapperSourceMock3).when(propertyMapperMock2).from((DestinationProvider) null);
			doNothing().when(propertyMapperSourceMock3).to((Consumer) any());
			doReturn(propertyMapperSourceMock4).when(propertyMapperMock2).from((Class) null);
			doNothing().when(propertyMapperSourceMock4).to((Consumer) any());
			doReturn(propertyMapperSourceMock5).when(propertyMapperMock2).from((WebServiceMessageFactory) null);
			doNothing().when(propertyMapperSourceMock5).to((Consumer) any());
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
				verify(propertyMapperSourceMock2, atLeast(1)).to((Consumer) any());
				verify(propertyMapperMock2, atLeast(1)).from((DestinationProvider) null);
				verify(propertyMapperSourceMock3, atLeast(1)).to((Consumer) any());
				verify(propertyMapperMock2, atLeast(1)).from((Class) null);
				verify(propertyMapperSourceMock4, atLeast(1)).to((Consumer) any());
				verify(propertyMapperMock2, atLeast(1)).from((WebServiceMessageFactory) null);
				verify(propertyMapperSourceMock5, atLeast(1)).to((Consumer) any());
				collectionUtils.verify(() -> CollectionUtils.isEmpty((Set) null), atLeast(1));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anySet()), atLeast(1));
			});
		}
	}
}
