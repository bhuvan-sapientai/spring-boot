package org.springframework.boot.context.properties.bind;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.util.Assert;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import java.util.ArrayList;
import java.util.function.Consumer;

import org.mockito.stubbing.Answer;

import org.springframework.core.env.Environment;
import org.springframework.boot.context.properties.source.ConfigurationPropertySources;
import org.springframework.core.ResolvableType;
import org.springframework.core.convert.ConversionService;
import org.springframework.boot.context.properties.source.ConfigurationPropertySource;

import org.mockito.MockedStatic;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BinderSapientGeneratedTest {

	private final PlaceholdersResolver placeholdersResolverMock = mock(PlaceholdersResolver.class, "placeholdersResolver");

	private final BindConverter bindConverterMock = mock(BindConverter.class);

	private final BindHandler bindHandlerMock = mock(BindHandler.class);

	private final BindHandler bindHandlerMock2 = mock(BindHandler.class);

	private final BindResult<Object> bindResultMock = mock(BindResult.class);

	private final Bindable<Object> bindableMock = mock(Bindable.class);

	private final Bindable<Object> bindableMock2 = mock(Bindable.class);

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final ConfigurationPropertySource configurationPropertySourceMock = mock(ConfigurationPropertySource.class);

	private final Consumer consumerMock = mock(Consumer.class);

	private final ConversionService conversionServiceMock = mock(ConversionService.class);

	private final Environment environmentMock = mock(Environment.class);

	private final BindHandler handlerMock = mock(BindHandler.class);

	private final ConfigurationPropertyName nameMock = mock(ConfigurationPropertyName.class);

	private final ResolvableType resolvableTypeMock = mock(ResolvableType.class);

	private final ResolvableType resolvableTypeMock2 = mock(ResolvableType.class);

	private final ResolvableType resolvableTypeMock3 = mock(ResolvableType.class);

	private final ResolvableType resolvableTypeMock4 = mock(ResolvableType.class);

	//Sapient generated method id: ${8fc74088-730a-3b45-8f04-76935a2d0dbc}, hash: 89826C307AB368B4F234057E887979BA
	@Test()
	void bindTest() throws Exception {
		//Arrange Statement(s)
		BindResult bindResultMock = mock(BindResult.class);
		try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			bindable.when(() -> Bindable.of(Object.class)).thenReturn(bindableMock);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = spy(new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null));
			doReturn(bindResultMock).when(target).bind("name1", bindableMock);
			//Act Statement(s)
			BindResult result = target.bind("name1", Object.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindResultMock));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				bindable.verify(() -> Bindable.of(Object.class), atLeast(1));
				verify(target).bind("name1", bindableMock);
			});
		}
	}

	//Sapient generated method id: ${6f662273-ae8a-3c6c-a7f3-283e3490e7d1}, hash: 355C222A24B5646353048092DA93DB06
	@Test()
	void bind1Test() throws Exception {
		//Arrange Statement(s)
		BindResult bindResultMock = mock(BindResult.class);
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1")).thenReturn(configurationPropertyNameMock);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = spy(new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null));
			doReturn(bindResultMock).when(target).bind(configurationPropertyNameMock, bindableMock, (BindHandler) null);
			//Act Statement(s)
			BindResult result = target.bind("name1", bindableMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindResultMock));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1"), atLeast(1));
				verify(target).bind(configurationPropertyNameMock, bindableMock, (BindHandler) null);
			});
		}
	}

	//Sapient generated method id: ${2afe6f83-6219-354a-a771-c67374f4dd67}, hash: 38BDEB5AA29E1A44B18DDC2039B956D9
	@Test()
	void bind2Test() throws Exception {
		//Arrange Statement(s)
		BindResult bindResultMock = mock(BindResult.class);
		try (MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = spy(new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null));
			doReturn(bindResultMock).when(target).bind(configurationPropertyNameMock, bindableMock, (BindHandler) null);
			//Act Statement(s)
			BindResult result = target.bind(configurationPropertyNameMock, bindableMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindResultMock));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				verify(target).bind(configurationPropertyNameMock, bindableMock, (BindHandler) null);
			});
		}
	}

	//Sapient generated method id: ${c556a157-f158-3ef4-af1d-f109390d9239}, hash: E276F70F6B9DDE11D346CC3B852E9103
	@Test()
	void bind3Test() throws Exception {
		//Arrange Statement(s)
		BindResult bindResultMock = mock(BindResult.class);
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1")).thenReturn(configurationPropertyNameMock);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = spy(new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null));
			doReturn(bindResultMock).when(target).bind(configurationPropertyNameMock, bindableMock, bindHandlerMock2);
			//Act Statement(s)
			BindResult result = target.bind("name1", bindableMock, bindHandlerMock2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindResultMock));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1"), atLeast(1));
				verify(target).bind(configurationPropertyNameMock, bindableMock, bindHandlerMock2);
			});
		}
	}

	//Sapient generated method id: ${00c7d3c1-98ad-39ce-91dc-d7676ba4a3aa}, hash: 9BACD99090883901BC4AD9752F06AC68
	@Disabled()
	@Test()
	void bind4WhenNotCreate() throws Exception {
		/* Branches:
		 * (handler != null) : true  #  inside bind method
		 * (replacementTarget == null) : true  #  inside bind method
		 * (result != null) : false  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 * (create) : false  #  inside handleBindResult method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: context - Method: getConverter
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<BindResult> bindResult = mockStatic(BindResult.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(null).when(handlerMock).onStart(eq(configurationPropertyNameMock), eq(bindableMock), (BindContext) any());
			doNothing().when(handlerMock).onFinish(eq(configurationPropertyNameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bindableMock, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			bindResult.when(() -> BindResult.of(object)).thenReturn(bindResultMock);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
			//Act Statement(s)
			BindResult result = target.bind(configurationPropertyNameMock, bindableMock, handlerMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindResultMock));
				verify(handlerMock).onStart(eq(configurationPropertyNameMock), eq(bindableMock), (BindContext) any());
				verify(handlerMock).onFinish(eq(configurationPropertyNameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bindableMock, "Target must not be null"), atLeast(1));
				bindResult.verify(() -> BindResult.of(object), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${92dcfaa5-c4e4-3ce2-8407-e6ed50b1b633}, hash: 9F63142103D4BE0AEB7BB1D4B213448F
	@Disabled()
	@Test()
	void bind4WhenCaughtException() throws Exception {
		/* Branches:
		 * (handler != null) : true  #  inside bind method
		 * (replacementTarget == null) : true  #  inside bind method
		 * (result != null) : false  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 * (create) : false  #  inside handleBindResult method
		 * (catch-exception (Exception)) : true  #  inside bind method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: context - Method: getConverter
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<BindResult> bindResult = mockStatic(BindResult.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(null).when(handlerMock).onStart(eq(configurationPropertyNameMock), eq(bindableMock), (BindContext) any());
			doNothing().when(handlerMock).onFinish(eq(configurationPropertyNameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
			Object object = new Object();
			Exception exception = new Exception();
			doReturn(object).when(handlerMock).onFailure(eq(configurationPropertyNameMock), eq(bindableMock), (BindContext) any(), eq(exception));
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bindableMock, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object object2 = new Object();
			bindResult.when(() -> BindResult.of(object2)).thenReturn(bindResultMock);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
			//Act Statement(s)
			BindResult result = target.bind(configurationPropertyNameMock, bindableMock, handlerMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindResultMock));
				verify(handlerMock).onStart(eq(configurationPropertyNameMock), eq(bindableMock), (BindContext) any());
				verify(handlerMock).onFinish(eq(configurationPropertyNameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
				verify(handlerMock).onFailure(eq(configurationPropertyNameMock), eq(bindableMock), (BindContext) any(), eq(exception));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bindableMock, "Target must not be null"), atLeast(1));
				bindResult.verify(() -> BindResult.of(object2), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${1592a780-3682-32a0-bcc9-a10075705eaa}, hash: 5EC89AF0A6B289D6025881D7A7369643
	@Disabled()
	@Test()
	void bind4WhenNotCreateAndCaughtException() throws Exception {
		/* Branches:
		 * (handler != null) : false  #  inside bind method
		 * (replacementTarget == null) : false  #  inside bind method
		 * (name.isEmpty()) : true  #  inside findProperty method
		 * (property == null) : true  #  inside bindObject method
		 * (context.depth != 0) : true  #  inside bindObject method
		 * (for-each(sources)) : false  #  inside containsNoDescendantOf method
		 * (containsNoDescendantOf(context.getSources(), name)) : true  #  inside bindObject method
		 * (result != null) : false  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 * (create) : false  #  inside handleBindResult method
		 * (catch-exception (Exception)) : true  #  inside bind method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: context - Method: getSources
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<BindResult> bindResult = mockStatic(BindResult.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(true).when(nameMock).isEmpty();
			doReturn(bindableMock).when(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
			doNothing().when(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
			Object object = new Object();
			Exception exception = new Exception();
			doReturn(object).when(handlerMock).onFailure(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(exception));
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bindableMock2, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object object2 = new Object();
			bindResult.when(() -> BindResult.of(object2)).thenReturn(bindResultMock);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, handlerMock, (BindConstructorProvider) null);
			BindHandler bindHandler = null;
			//Act Statement(s)
			BindResult result = target.bind(nameMock, bindableMock2, bindHandler);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindResultMock));
				verify(nameMock).isEmpty();
				verify(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
				verify(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
				verify(handlerMock).onFailure(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(exception));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bindableMock2, "Target must not be null"), atLeast(1));
				bindResult.verify(() -> BindResult.of(object2), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f3b40840-e078-3aef-b23f-181e56493d8d}, hash: FBE37D12CE9C99771A919E196EC77315
	@Disabled()
	@Test()
	void bind4WhenResultIsNullAndResultIsNullAndNotCreate() throws Exception {
		/* Branches:
		 * (handler != null) : true  #  inside bind method
		 * (replacementTarget == null) : false  #  inside bind method
		 * (name.isEmpty()) : false  #  inside findProperty method
		 * (target.hasBindRestriction(BindRestriction.NO_DIRECT_PROPERTY)) : true  #  inside findProperty method
		 * (property == null) : true  #  inside bindObject method
		 * (context.depth != 0) : true  #  inside bindObject method
		 * (for-each(sources)) : true  #  inside containsNoDescendantOf method
		 * (source.containsDescendantOf(name) != ConfigurationPropertyState.ABSENT) : false  #  inside containsNoDescendantOf method
		 * (containsNoDescendantOf(context.getSources(), name)) : true  #  inside bindObject method
		 * (result != null) : false  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 * (create) : false  #  inside handleBindResult method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: context - Method: getSources
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<BindResult> bindResult = mockStatic(BindResult.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(false).when(nameMock).isEmpty();
			doReturn(bindableMock).when(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
			doReturn(true).when(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
			doNothing().when(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bindableMock2, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			bindResult.when(() -> BindResult.of(object)).thenReturn(bindResultMock);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
			//Act Statement(s)
			BindResult result = target.bind(nameMock, bindableMock2, handlerMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindResultMock));
				verify(nameMock).isEmpty();
				verify(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
				verify(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
				verify(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bindableMock2, "Target must not be null"), atLeast(1));
				bindResult.verify(() -> BindResult.of(object), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c604217b-97ca-30c7-8f05-f0c938bfa7dd}, hash: FBBAC5BB3DE4AF01ED041E9BEDA73F79
	@Disabled()
	@Test()
	void bind4WhenResultIsNotNullAndResultIsNullAndNotCreate() throws Exception {
		/* Branches:
		 * (handler != null) : true  #  inside bind method
		 * (replacementTarget == null) : false  #  inside bind method
		 * (name.isEmpty()) : false  #  inside findProperty method
		 * (target.hasBindRestriction(BindRestriction.NO_DIRECT_PROPERTY)) : true  #  inside findProperty method
		 * (property == null) : true  #  inside bindObject method
		 * (context.depth != 0) : true  #  inside bindObject method
		 * (for-each(sources)) : true  #  inside containsNoDescendantOf method
		 * (source.containsDescendantOf(name) != ConfigurationPropertyState.ABSENT) : true  #  inside containsNoDescendantOf method
		 * (containsNoDescendantOf(context.getSources(), name)) : false  #  inside bindObject method
		 * (Map.class.isAssignableFrom(resolvedType)) : true  #  inside getAggregateBinder method
		 * (aggregateBinder != null) : true  #  inside bindObject method
		 * (result != null) : true  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 * (create) : false  #  inside handleBindResult method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: context - Method: getSources
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<BindResult> bindResult = mockStatic(BindResult.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(false).when(nameMock).isEmpty();
			doReturn(bindableMock).when(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
			doReturn(true).when(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
			doReturn(resolvableTypeMock).when(bindableMock).getType();
			doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
			Object object = new Object();
			Object object2 = new Object();
			doReturn(object).when(handlerMock).onSuccess(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(object2));
			doNothing().when(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bindableMock2, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object object3 = new Object();
			bindResult.when(() -> BindResult.of(object3)).thenReturn(bindResultMock);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
			//Act Statement(s)
			BindResult result = target.bind(nameMock, bindableMock2, handlerMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindResultMock));
				verify(nameMock).isEmpty();
				verify(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
				verify(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
				verify(bindableMock).getType();
				verify(resolvableTypeMock).resolve(Object.class);
				verify(handlerMock).onSuccess(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(object2));
				verify(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bindableMock2, "Target must not be null"), atLeast(1));
				bindResult.verify(() -> BindResult.of(object3), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${9228b6b8-6832-3ddc-b6f9-cec9a46b511f}, hash: A0F1194AF6F3CCD1067FD2E4BE6E4C58
	@Disabled()
	@Test()
	void bind4WhenCollectionIsAssignableFromResolvedTypeAndAggregateBinderIsNotNullAndResultIsNullAndResultIsNullAndNotCreate() throws Exception {
		/* Branches:
		 * (handler != null) : true  #  inside bind method
		 * (replacementTarget == null) : false  #  inside bind method
		 * (name.isEmpty()) : false  #  inside findProperty method
		 * (target.hasBindRestriction(BindRestriction.NO_DIRECT_PROPERTY)) : true  #  inside findProperty method
		 * (property == null) : true  #  inside bindObject method
		 * (context.depth != 0) : true  #  inside bindObject method
		 * (for-each(sources)) : true  #  inside containsNoDescendantOf method
		 * (source.containsDescendantOf(name) != ConfigurationPropertyState.ABSENT) : true  #  inside containsNoDescendantOf method
		 * (containsNoDescendantOf(context.getSources(), name)) : false  #  inside bindObject method
		 * (Map.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (Collection.class.isAssignableFrom(resolvedType)) : true  #  inside getAggregateBinder method
		 * (aggregateBinder != null) : true  #  inside bindObject method
		 * (result != null) : false  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 * (create) : false  #  inside handleBindResult method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: context - Method: getSources
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<BindResult> bindResult = mockStatic(BindResult.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(false).when(nameMock).isEmpty();
			doReturn(bindableMock).when(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
			doReturn(true).when(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
			doReturn(resolvableTypeMock).when(bindableMock).getType();
			doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
			doNothing().when(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bindableMock2, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			bindResult.when(() -> BindResult.of(object)).thenReturn(bindResultMock);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
			//Act Statement(s)
			BindResult result = target.bind(nameMock, bindableMock2, handlerMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindResultMock));
				verify(nameMock).isEmpty();
				verify(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
				verify(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
				verify(bindableMock).getType();
				verify(resolvableTypeMock).resolve(Object.class);
				verify(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bindableMock2, "Target must not be null"), atLeast(1));
				bindResult.verify(() -> BindResult.of(object), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${5ae01ad7-e90c-31e9-a5d0-8306c79d0f1f}, hash: EFE2EF3BC888235A820ED3BB2C13355F
	@Disabled()
	@Test()
	void bind4WhenPropertyIsNotNullAndResultIsNullAndResultIsNullAndNotCreate() throws Exception {
		/* Branches:
		 * (handler != null) : true  #  inside bind method
		 * (replacementTarget == null) : false  #  inside bind method
		 * (name.isEmpty()) : false  #  inside findProperty method
		 * (target.hasBindRestriction(BindRestriction.NO_DIRECT_PROPERTY)) : false  #  inside findProperty method
		 * (for-each(context.getSources())) : true  #  inside findProperty method
		 * (property != null) : true  #  inside findProperty method
		 * (property == null) : false  #  inside bindObject method
		 * (Map.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (Collection.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (target.getType().isArray()) : false  #  inside getAggregateBinder method
		 * (aggregateBinder != null) : false  #  inside bindObject method
		 * (property != null) : true  #  inside bindObject method
		 * (result != null) : false  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 * (create) : false  #  inside handleBindResult method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: context - Method: getSources
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<BindResult> bindResult = mockStatic(BindResult.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(false).when(nameMock).isEmpty();
			doReturn(bindableMock).when(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
			doReturn(false).when(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
			doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
			doReturn(resolvableTypeMock, resolvableTypeMock2).when(bindableMock).getType();
			doReturn(false).when(resolvableTypeMock2).isArray();
			doNothing().when(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bindableMock2, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			bindResult.when(() -> BindResult.of(object)).thenReturn(bindResultMock);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
			Object object2 = new Object();
			Object object3 = new Object();
			doReturn(object2).when(placeholdersResolverMock).resolvePlaceholders(object3);
			//Act Statement(s)
			BindResult result = target.bind(nameMock, bindableMock2, handlerMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindResultMock));
				verify(nameMock).isEmpty();
				verify(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
				verify(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
				verify(bindableMock, times(2)).getType();
				verify(resolvableTypeMock).resolve(Object.class);
				verify(resolvableTypeMock2).isArray();
				verify(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bindableMock2, "Target must not be null"), atLeast(1));
				bindResult.verify(() -> BindResult.of(object), atLeast(1));
				verify(placeholdersResolverMock).resolvePlaceholders(object3);
			});
		}
	}

	//Sapient generated method id: ${6e9f706a-bf35-3cc4-88f5-37cc378db8ed}, hash: 491C23FBA12D609CAEF787648180C8B2
	@Disabled()
	@Test()
	void bind4WhenTargetGetTypeIsArrayAndAggregateBinderIsNotNullAndResultIsNullAndResultIsNullAndNotCreate() throws Exception {
		/* Branches:
		 * (handler != null) : true  #  inside bind method
		 * (replacementTarget == null) : false  #  inside bind method
		 * (name.isEmpty()) : false  #  inside findProperty method
		 * (target.hasBindRestriction(BindRestriction.NO_DIRECT_PROPERTY)) : true  #  inside findProperty method
		 * (property == null) : true  #  inside bindObject method
		 * (context.depth != 0) : true  #  inside bindObject method
		 * (for-each(sources)) : true  #  inside containsNoDescendantOf method
		 * (source.containsDescendantOf(name) != ConfigurationPropertyState.ABSENT) : true  #  inside containsNoDescendantOf method
		 * (containsNoDescendantOf(context.getSources(), name)) : false  #  inside bindObject method
		 * (Map.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (Collection.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (target.getType().isArray()) : true  #  inside getAggregateBinder method
		 * (aggregateBinder != null) : true  #  inside bindObject method
		 * (result != null) : false  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 * (create) : false  #  inside handleBindResult method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: context - Method: getSources
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<BindResult> bindResult = mockStatic(BindResult.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(false).when(nameMock).isEmpty();
			doReturn(bindableMock).when(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
			doReturn(true).when(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
			doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
			doReturn(resolvableTypeMock, resolvableTypeMock2).when(bindableMock).getType();
			doReturn(true).when(resolvableTypeMock2).isArray();
			doNothing().when(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bindableMock2, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			bindResult.when(() -> BindResult.of(object)).thenReturn(bindResultMock);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
			//Act Statement(s)
			BindResult result = target.bind(nameMock, bindableMock2, handlerMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindResultMock));
				verify(nameMock).isEmpty();
				verify(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
				verify(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
				verify(bindableMock, times(2)).getType();
				verify(resolvableTypeMock).resolve(Object.class);
				verify(resolvableTypeMock2).isArray();
				verify(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bindableMock2, "Target must not be null"), atLeast(1));
				bindResult.verify(() -> BindResult.of(object), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${705532ea-89fe-37dd-b9d0-bc8ba659ffe6}, hash: 870381E6F598B716E7909BE063F06B88
	@Disabled()
	@Test()
	void bind4WhenResolvedIsPrimitiveAndIsUnbindableBeanNameTargetContextAndResultIsNullAndResultIsNullAndNotCreate() throws Exception {
		/* Branches:
		 * (handler != null) : false  #  inside bind method
		 * (replacementTarget == null) : false  #  inside bind method
		 * (name.isEmpty()) : true  #  inside findProperty method
		 * (property == null) : true  #  inside bindObject method
		 * (context.depth != 0) : false  #  inside bindObject method
		 * (Map.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (Collection.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (target.getType().isArray()) : false  #  inside getAggregateBinder method
		 * (aggregateBinder != null) : false  #  inside bindObject method
		 * (property != null) : false  #  inside bindObject method
		 * (for-each(context.getSources())) : false  #  inside isUnbindableBean method
		 * (resolved.isPrimitive()) : true  #  inside isUnbindableBean method
		 * (isUnbindableBean(name, target, context)) : true  #  inside bindDataObject method
		 * (result != null) : false  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 * (create) : false  #  inside handleBindResult method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<BindResult> bindResult = mockStatic(BindResult.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(true).when(nameMock).isEmpty();
			Bindable bindable = Bindable.of(resolvableTypeMock);
			doReturn(bindable).when(handlerMock).onStart(eq(nameMock), eq(bindableMock), (BindContext) any());
			doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
			doReturn(false).when(resolvableTypeMock).isArray();
			doNothing().when(handlerMock).onFinish(eq(nameMock), (Bindable) any(), (BindContext) any(), eq((Object) null));
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bindableMock, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			bindResult.when(() -> BindResult.of(object)).thenReturn(bindResultMock);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, handlerMock, (BindConstructorProvider) null);
			BindHandler bindHandler = null;
			//Act Statement(s)
			BindResult result = target.bind(nameMock, bindableMock, bindHandler);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindResultMock));
				verify(nameMock).isEmpty();
				verify(handlerMock).onStart(eq(nameMock), eq(bindableMock), (BindContext) any());
				verify(resolvableTypeMock, times(2)).resolve(Object.class);
				verify(resolvableTypeMock).isArray();
				verify(handlerMock).onFinish(eq(nameMock), (Bindable) any(), (BindContext) any(), eq((Object) null));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bindableMock, "Target must not be null"), atLeast(1));
				bindResult.verify(() -> BindResult.of(object), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${d485e097-9372-3604-a0e0-9dc1fb6ee30c}, hash: 12A15F1685BB88895748CA9D0BACC12E
	@Disabled()
	@Test()
	void bind4WhenResolvedIsPrimitiveAndIsUnbindableBeanNameTargetContextAndResultIsNullAndResultIsNullAndNotCreate3() throws Exception {
		/* Branches:
		 * (handler != null) : true  #  inside bind method
		 * (replacementTarget == null) : false  #  inside bind method
		 * (name.isEmpty()) : false  #  inside findProperty method
		 * (target.hasBindRestriction(BindRestriction.NO_DIRECT_PROPERTY)) : false  #  inside findProperty method
		 * (for-each(context.getSources())) : true  #  inside findProperty method
		 * (property != null) : false  #  inside findProperty method
		 * (property == null) : true  #  inside bindObject method
		 * (context.depth != 0) : false  #  inside bindObject method
		 * (Map.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (Collection.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (target.getType().isArray()) : false  #  inside getAggregateBinder method
		 * (aggregateBinder != null) : false  #  inside bindObject method
		 * (property != null) : false  #  inside bindObject method
		 * (for-each(context.getSources())) : false  #  inside isUnbindableBean method
		 * (resolved.isPrimitive()) : true  #  inside isUnbindableBean method
		 * (isUnbindableBean(name, target, context)) : true  #  inside bindDataObject method
		 * (result != null) : false  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 * (create) : false  #  inside handleBindResult method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: context - Method: getSources
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<BindResult> bindResult = mockStatic(BindResult.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(false).when(nameMock).isEmpty();
			doReturn(bindableMock).when(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
			doReturn(false).when(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
			doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
			doReturn(false).when(resolvableTypeMock2).isArray();
			doReturn(resolvableTypeMock, resolvableTypeMock2, resolvableTypeMock3).when(bindableMock).getType();
			doReturn(Object.class).when(resolvableTypeMock3).resolve(Object.class);
			doNothing().when(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bindableMock2, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			bindResult.when(() -> BindResult.of(object)).thenReturn(bindResultMock);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
			//Act Statement(s)
			BindResult result = target.bind(nameMock, bindableMock2, handlerMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindResultMock));
				verify(nameMock).isEmpty();
				verify(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
				verify(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
				verify(bindableMock, times(3)).getType();
				verify(resolvableTypeMock).resolve(Object.class);
				verify(resolvableTypeMock2).isArray();
				verify(resolvableTypeMock3).resolve(Object.class);
				verify(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bindableMock2, "Target must not be null"), atLeast(1));
				bindResult.verify(() -> BindResult.of(object), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a6acfe4c-ed73-3305-a354-8f7ca5098f98}, hash: 31C3073E4DDABB5A633519D2F6991ED5
	@Disabled()
	@Test()
	void bind4WhenResolvedIsPrimitiveAndIsUnbindableBeanNameTargetContextAndResultIsNullAndResultIsNullAndNotCreate5() throws Exception {
		/* Branches:
		 * (handler != null) : true  #  inside bind method
		 * (replacementTarget == null) : false  #  inside bind method
		 * (name.isEmpty()) : false  #  inside findProperty method
		 * (target.hasBindRestriction(BindRestriction.NO_DIRECT_PROPERTY)) : true  #  inside findProperty method
		 * (property == null) : true  #  inside bindObject method
		 * (context.depth != 0) : true  #  inside bindObject method
		 * (for-each(sources)) : true  #  inside containsNoDescendantOf method
		 * (source.containsDescendantOf(name) != ConfigurationPropertyState.ABSENT) : true  #  inside containsNoDescendantOf method
		 * (containsNoDescendantOf(context.getSources(), name)) : false  #  inside bindObject method
		 * (Map.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (Collection.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (target.getType().isArray()) : false  #  inside getAggregateBinder method
		 * (aggregateBinder != null) : false  #  inside bindObject method
		 * (property != null) : false  #  inside bindObject method
		 * (catch-exception (ConverterNotFoundException)) : true  #  inside bindObject method
		 * (for-each(context.getSources())) : false  #  inside isUnbindableBean method
		 * (resolved.isPrimitive()) : true  #  inside isUnbindableBean method
		 * (isUnbindableBean(name, target, context)) : true  #  inside bindDataObject method
		 * (result != null) : false  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 * (create) : false  #  inside handleBindResult method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: context - Method: getSources
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<BindResult> bindResult = mockStatic(BindResult.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(false).when(nameMock).isEmpty();
			doReturn(bindableMock).when(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
			doReturn(true).when(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
			doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
			doReturn(false).when(resolvableTypeMock2).isArray();
			doReturn(resolvableTypeMock, resolvableTypeMock2, resolvableTypeMock3).when(bindableMock).getType();
			doReturn(Object.class).when(resolvableTypeMock3).resolve(Object.class);
			doNothing().when(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bindableMock2, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			bindResult.when(() -> BindResult.of(object)).thenReturn(bindResultMock);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
			//Act Statement(s)
			BindResult result = target.bind(nameMock, bindableMock2, handlerMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindResultMock));
				verify(nameMock).isEmpty();
				verify(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
				verify(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
				verify(bindableMock, times(3)).getType();
				verify(resolvableTypeMock).resolve(Object.class);
				verify(resolvableTypeMock2).isArray();
				verify(resolvableTypeMock3).resolve(Object.class);
				verify(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bindableMock2, "Target must not be null"), atLeast(1));
				bindResult.verify(() -> BindResult.of(object), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${e445fe0e-b2b2-3b62-a346-e616bfb8d853}, hash: B0D06F3A3710F2B3DC1B66EC0D002BCB
	@Disabled()
	@Test()
	void bind4WhenContextIsBindingDataObjectTypeAndResultIsNullAndResultIsNullAndNotCreate() throws Exception {
		/* Branches:
		 * (handler != null) : true  #  inside bind method
		 * (replacementTarget == null) : false  #  inside bind method
		 * (name.isEmpty()) : false  #  inside findProperty method
		 * (target.hasBindRestriction(BindRestriction.NO_DIRECT_PROPERTY)) : true  #  inside findProperty method
		 * (property == null) : true  #  inside bindObject method
		 * (context.depth != 0) : true  #  inside bindObject method
		 * (for-each(sources)) : true  #  inside containsNoDescendantOf method
		 * (source.containsDescendantOf(name) != ConfigurationPropertyState.ABSENT) : true  #  inside containsNoDescendantOf method
		 * (containsNoDescendantOf(context.getSources(), name)) : false  #  inside bindObject method
		 * (Map.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (Collection.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (target.getType().isArray()) : false  #  inside getAggregateBinder method
		 * (aggregateBinder != null) : false  #  inside bindObject method
		 * (property != null) : false  #  inside bindObject method
		 * (for-each(context.getSources())) : true  #  inside isUnbindableBean method
		 * (source.containsDescendantOf(name) == ConfigurationPropertyState.PRESENT) : true  #  inside isUnbindableBean method
		 * (isUnbindableBean(name, target, context)) : false  #  inside bindDataObject method
		 * (!allowRecursiveBinding) : true  #  inside bindDataObject method
		 * (context.isBindingDataObject(type)) : true  #  inside bindDataObject method
		 * (result != null) : false  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 * (create) : false  #  inside handleBindResult method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: context - Method: getSources
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<BindResult> bindResult = mockStatic(BindResult.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(false).when(nameMock).isEmpty();
			doReturn(bindableMock).when(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
			doReturn(true).when(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
			doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
			doReturn(false).when(resolvableTypeMock2).isArray();
			doReturn(resolvableTypeMock, resolvableTypeMock2, resolvableTypeMock3).when(bindableMock).getType();
			doReturn(Object.class).when(resolvableTypeMock3).resolve(Object.class);
			doReturn(BindMethod.JAVA_BEAN).when(bindableMock).getBindMethod();
			doNothing().when(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bindableMock2, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			bindResult.when(() -> BindResult.of(object)).thenReturn(bindResultMock);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
			//Act Statement(s)
			BindResult result = target.bind(nameMock, bindableMock2, handlerMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindResultMock));
				verify(nameMock).isEmpty();
				verify(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
				verify(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
				verify(bindableMock, times(3)).getType();
				verify(resolvableTypeMock).resolve(Object.class);
				verify(resolvableTypeMock2).isArray();
				verify(resolvableTypeMock3).resolve(Object.class);
				verify(bindableMock).getBindMethod();
				verify(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bindableMock2, "Target must not be null"), atLeast(1));
				bindResult.verify(() -> BindResult.of(object), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${cb42c1f2-2fa1-39c8-a681-a10cc66ab8c6}, hash: 0227A3E8AAE51EEFD8F2B6FAB71EF016
	@Disabled()
	@Test()
	void bind4WhenNON_BEAN_CLASSESNotContainsResolvedAndResolvedGetNameStartsWithJava_AndIsUnbindableBeanNameTargetContextAndRes() throws Exception {
		/* Branches:
		 * (handler != null) : true  #  inside bind method
		 * (replacementTarget == null) : false  #  inside bind method
		 * (name.isEmpty()) : false  #  inside findProperty method
		 * (target.hasBindRestriction(BindRestriction.NO_DIRECT_PROPERTY)) : true  #  inside findProperty method
		 * (property == null) : true  #  inside bindObject method
		 * (context.depth != 0) : true  #  inside bindObject method
		 * (for-each(sources)) : true  #  inside containsNoDescendantOf method
		 * (source.containsDescendantOf(name) != ConfigurationPropertyState.ABSENT) : true  #  inside containsNoDescendantOf method
		 * (containsNoDescendantOf(context.getSources(), name)) : false  #  inside bindObject method
		 * (Map.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (Collection.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (target.getType().isArray()) : false  #  inside getAggregateBinder method
		 * (aggregateBinder != null) : false  #  inside bindObject method
		 * (property != null) : false  #  inside bindObject method
		 * (for-each(context.getSources())) : true  #  inside isUnbindableBean method
		 * (source.containsDescendantOf(name) == ConfigurationPropertyState.PRESENT) : false  #  inside isUnbindableBean method
		 * (resolved.isPrimitive()) : false  #  inside isUnbindableBean method
		 * (NON_BEAN_CLASSES.contains(resolved)) : false  #  inside isUnbindableBean method
		 * (resolved.getName().startsWith("java.")) : true  #  inside isUnbindableBean method
		 * (isUnbindableBean(name, target, context)) : true  #  inside bindDataObject method
		 * (result != null) : false  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 * (create) : false  #  inside handleBindResult method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: context - Method: getSources
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<BindResult> bindResult = mockStatic(BindResult.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(false).when(nameMock).isEmpty();
			doReturn(bindableMock).when(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
			doReturn(true).when(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
			doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
			doReturn(false).when(resolvableTypeMock2).isArray();
			doReturn(resolvableTypeMock, resolvableTypeMock2, resolvableTypeMock3).when(bindableMock).getType();
			doReturn(Object.class).when(resolvableTypeMock3).resolve(Object.class);
			doNothing().when(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bindableMock2, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			bindResult.when(() -> BindResult.of(object)).thenReturn(bindResultMock);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
			//Act Statement(s)
			BindResult result = target.bind(nameMock, bindableMock2, handlerMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindResultMock));
				verify(nameMock).isEmpty();
				verify(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
				verify(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
				verify(bindableMock, times(3)).getType();
				verify(resolvableTypeMock).resolve(Object.class);
				verify(resolvableTypeMock2).isArray();
				verify(resolvableTypeMock3).resolve(Object.class);
				verify(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bindableMock2, "Target must not be null"), atLeast(1));
				bindResult.verify(() -> BindResult.of(object), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${ebfbf07e-b411-3cba-aa96-0baf952ec86e}, hash: BA849508357C3F550BDD6685EE9E4F2D
	@Disabled()
	@Test()
	void bind4WhenIsUnbindableBeanNotNameTargetContextAndNotAllowRecursiveBindingAndContextNotIsBindingDataObjectTypeAndResultIs() throws Exception {
		/* Branches:
		 * (handler != null) : true  #  inside bind method
		 * (replacementTarget == null) : false  #  inside bind method
		 * (name.isEmpty()) : false  #  inside findProperty method
		 * (target.hasBindRestriction(BindRestriction.NO_DIRECT_PROPERTY)) : true  #  inside findProperty method
		 * (property == null) : true  #  inside bindObject method
		 * (context.depth != 0) : true  #  inside bindObject method
		 * (for-each(sources)) : true  #  inside containsNoDescendantOf method
		 * (source.containsDescendantOf(name) != ConfigurationPropertyState.ABSENT) : true  #  inside containsNoDescendantOf method
		 * (containsNoDescendantOf(context.getSources(), name)) : false  #  inside bindObject method
		 * (Map.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (Collection.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (target.getType().isArray()) : false  #  inside getAggregateBinder method
		 * (aggregateBinder != null) : false  #  inside bindObject method
		 * (property != null) : false  #  inside bindObject method
		 * (for-each(context.getSources())) : true  #  inside isUnbindableBean method
		 * (source.containsDescendantOf(name) == ConfigurationPropertyState.PRESENT) : false  #  inside isUnbindableBean method
		 * (resolved.isPrimitive()) : false  #  inside isUnbindableBean method
		 * (NON_BEAN_CLASSES.contains(resolved)) : false  #  inside isUnbindableBean method
		 * (resolved.getName().startsWith("java.")) : false  #  inside isUnbindableBean method
		 * (isUnbindableBean(name, target, context)) : false  #  inside bindDataObject method
		 * (!allowRecursiveBinding) : true  #  inside bindDataObject method
		 * (context.isBindingDataObject(type)) : false  #  inside bindDataObject method
		 * (result != null) : false  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 * (create) : false  #  inside handleBindResult method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: context - Method: getSources
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<BindResult> bindResult = mockStatic(BindResult.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(false).when(nameMock).isEmpty();
			doReturn(bindableMock).when(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
			doReturn(true).when(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
			doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
			doReturn(false).when(resolvableTypeMock2).isArray();
			doReturn(Object.class).when(resolvableTypeMock3).resolve(Object.class);
			doReturn(resolvableTypeMock, resolvableTypeMock2, resolvableTypeMock3, resolvableTypeMock4).when(bindableMock).getType();
			doReturn(Object.class).when(resolvableTypeMock4).resolve(Object.class);
			doReturn(BindMethod.JAVA_BEAN).when(bindableMock).getBindMethod();
			doNothing().when(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bindableMock2, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			bindResult.when(() -> BindResult.of(object)).thenReturn(bindResultMock);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
			//Act Statement(s)
			BindResult result = target.bind(nameMock, bindableMock2, handlerMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindResultMock));
				verify(nameMock).isEmpty();
				verify(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
				verify(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
				verify(bindableMock, times(4)).getType();
				verify(resolvableTypeMock).resolve(Object.class);
				verify(resolvableTypeMock2).isArray();
				verify(resolvableTypeMock3).resolve(Object.class);
				verify(resolvableTypeMock4).resolve(Object.class);
				verify(bindableMock).getBindMethod();
				verify(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bindableMock2, "Target must not be null"), atLeast(1));
				bindResult.verify(() -> BindResult.of(object), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${ba212680-2d06-3afd-8c4f-6fb710b14f74}, hash: 9AE43CB574D713486AC054546F04B3CF
	@Test()
	void bindOrCreateTest() throws Exception {
		//Arrange Statement(s)
		try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			bindable.when(() -> Bindable.of(Object.class)).thenReturn(bindableMock);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = spy(new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null));
			Object object = new Object();
			doReturn(object).when(target).bindOrCreate("name1", bindableMock);
			//Act Statement(s)
			Object result = target.bindOrCreate("name1", Object.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(object));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				bindable.verify(() -> Bindable.of(Object.class), atLeast(1));
				verify(target).bindOrCreate("name1", bindableMock);
			});
		}
	}

	//Sapient generated method id: ${2c3d3ac1-98d8-318c-bfc6-02b619fe64c2}, hash: F748F90D3A8AC51E7947229B278E9B1D
	@Test()
	void bindOrCreate1Test() throws Exception {
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1")).thenReturn(configurationPropertyNameMock);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = spy(new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null));
			Object object = new Object();
			doReturn(object).when(target).bindOrCreate(configurationPropertyNameMock, bindableMock, (BindHandler) null);
			//Act Statement(s)
			Object result = target.bindOrCreate("name1", bindableMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(object));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1"), atLeast(1));
				verify(target).bindOrCreate(configurationPropertyNameMock, bindableMock, (BindHandler) null);
			});
		}
	}

	//Sapient generated method id: ${1f850b48-1f53-314e-b99a-87e9332c1499}, hash: 9193194E8B67C43BFC4F9131DD2FFC01
	@Test()
	void bindOrCreate2Test() throws Exception {
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1")).thenReturn(configurationPropertyNameMock);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = spy(new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null));
			Object object = new Object();
			doReturn(object).when(target).bindOrCreate(configurationPropertyNameMock, bindableMock, bindHandlerMock2);
			//Act Statement(s)
			Object result = target.bindOrCreate("name1", bindableMock, bindHandlerMock2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(object));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1"), atLeast(1));
				verify(target).bindOrCreate(configurationPropertyNameMock, bindableMock, bindHandlerMock2);
			});
		}
	}

	//Sapient generated method id: ${b1b4ea64-3afe-34d2-9fd1-b01380d1cbfc}, hash: FC60C4FCE868E778754FB1B72AD3AA77
	@Disabled()
	@Test()
	void bindOrCreate3WhenResultIsNull() throws Exception {
		/* Branches:
		 * (handler != null) : true  #  inside bind method
		 * (replacementTarget == null) : true  #  inside bind method
		 * (result != null) : false  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 * (create) : true  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: context - Method: getConverter
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(null).when(handlerMock).onStart((ConfigurationPropertyName) any(), (Bindable) any(), (BindContext) any());
			Object object = new Object();
			doReturn(object).when(handlerMock).onCreate((ConfigurationPropertyName) any(), (Bindable) any(), (BindContext) any(), eq((Object) null));
			Object object2 = new Object();
			Exception exception = new Exception();
			doReturn(object2).when(handlerMock).onFailure((ConfigurationPropertyName) any(), (Bindable) any(), (BindContext) any(), eq(exception));
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>();
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("bindOrCreate_configurationPropertyName1-name1");
			Object object3 = new Object();
			Bindable bindable = Bindable.ofInstance(object3);
			//Act Statement(s)
			Object result = target.bindOrCreate(configurationPropertyName, bindable, handlerMock);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(handlerMock, atLeast(1)).onStart((ConfigurationPropertyName) any(), (Bindable) any(), (BindContext) any());
				verify(handlerMock, atLeast(1)).onCreate((ConfigurationPropertyName) any(), (Bindable) any(), (BindContext) any(), eq((Object) null));
				verify(handlerMock, atLeast(1)).onFailure((ConfigurationPropertyName) any(), (Bindable) any(), (BindContext) any(), eq(exception));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)), atLeast(1));
				_assert.verify(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null")), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${313a23e5-2d55-3576-999b-1de8d8899e0a}, hash: 54D806DE290BE31EF0B016112C3A28C2
	@Disabled()
	@Test()
	void bindOrCreate3WhenResultIsNotNull() throws Exception {
		/* Branches:
		 * (handler != null) : true  #  inside bind method
		 * (replacementTarget == null) : true  #  inside bind method
		 * (result != null) : false  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 * (create) : true  #  inside handleBindResult method
		 * (result == null) : false  #  inside handleBindResult method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: context - Method: getConverter
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(null).when(handlerMock).onStart((ConfigurationPropertyName) any(), (Bindable) any(), (BindContext) any());
			Object object = new Object();
			doReturn(object).when(handlerMock).onCreate((ConfigurationPropertyName) any(), (Bindable) any(), (BindContext) any(), eq((Object) null));
			Object object2 = new Object();
			doNothing().when(handlerMock).onFinish((ConfigurationPropertyName) any(), (Bindable) any(), (BindContext) any(), eq(object2));
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>();
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("bindOrCreate_configurationPropertyName1-name1");
			Object object3 = new Object();
			Bindable bindable = Bindable.ofInstance(object3);
			//Act Statement(s)
			Object result = target.bindOrCreate(configurationPropertyName, bindable, handlerMock);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(handlerMock, atLeast(1)).onStart((ConfigurationPropertyName) any(), (Bindable) any(), (BindContext) any());
				verify(handlerMock, atLeast(1)).onCreate((ConfigurationPropertyName) any(), (Bindable) any(), (BindContext) any(), eq((Object) null));
				verify(handlerMock, atLeast(1)).onFinish((ConfigurationPropertyName) any(), (Bindable) any(), (BindContext) any(), eq(object2));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)), atLeast(1));
				_assert.verify(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null")), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${7f64f3d3-0490-34aa-b538-95ecad793d18}, hash: 355FBF3010DED233EEAF2DF429EC4DEA
	@Disabled()
	@Test()
	void bindOrCreate3WhenResultIsNullAndCreateAndResultIsNotNull() throws Exception {
		/* Branches:
		 * (handler != null) : true  #  inside bind method
		 * (replacementTarget == null) : false  #  inside bind method
		 * (name.isEmpty()) : false  #  inside findProperty method
		 * (target.hasBindRestriction(BindRestriction.NO_DIRECT_PROPERTY)) : true  #  inside findProperty method
		 * (property == null) : true  #  inside bindObject method
		 * (context.depth != 0) : true  #  inside bindObject method
		 * (for-each(sources)) : true  #  inside containsNoDescendantOf method
		 * (source.containsDescendantOf(name) != ConfigurationPropertyState.ABSENT) : false  #  inside containsNoDescendantOf method
		 * (containsNoDescendantOf(context.getSources(), name)) : true  #  inside bindObject method
		 * (result != null) : false  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 * (create) : true  #  inside handleBindResult method
		 * (result == null) : false  #  inside handleBindResult method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: context - Method: getSources
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(false).when(nameMock).isEmpty();
			doReturn(bindableMock).when(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
			doReturn(true).when(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
			doReturn(BindMethod.JAVA_BEAN).when(bindableMock).getBindMethod();
			Object object = new Object();
			doReturn(object).when(handlerMock).onCreate(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
			Object object2 = new Object();
			doNothing().when(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(object2));
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bindableMock2, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
			//Act Statement(s)
			Object result = target.bindOrCreate(nameMock, bindableMock2, handlerMock);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(nameMock).isEmpty();
				verify(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
				verify(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
				verify(bindableMock).getBindMethod();
				verify(handlerMock).onCreate(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
				verify(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(object2));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bindableMock2, "Target must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${d17b8421-0e59-3753-9bc8-c127a0a6b7d9}, hash: F345C220F31E81151E336B9E2B613C3F
	@Disabled()
	@Test()
	void bindOrCreate3WhenCreateAndResultIsNull() throws Exception {
		/* Branches:
		 * (handler != null) : true  #  inside bind method
		 * (replacementTarget == null) : false  #  inside bind method
		 * (name.isEmpty()) : false  #  inside findProperty method
		 * (target.hasBindRestriction(BindRestriction.NO_DIRECT_PROPERTY)) : true  #  inside findProperty method
		 * (property == null) : true  #  inside bindObject method
		 * (context.depth != 0) : true  #  inside bindObject method
		 * (for-each(sources)) : true  #  inside containsNoDescendantOf method
		 * (source.containsDescendantOf(name) != ConfigurationPropertyState.ABSENT) : true  #  inside containsNoDescendantOf method
		 * (containsNoDescendantOf(context.getSources(), name)) : false  #  inside bindObject method
		 * (Map.class.isAssignableFrom(resolvedType)) : true  #  inside getAggregateBinder method
		 * (aggregateBinder != null) : true  #  inside bindObject method
		 * (result != null) : true  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 * (create) : true  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: context - Method: getSources
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResolvableType resolvableTypeMock2 = mock(ResolvableType.class, "handleBindResult_resolvableType1");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(false).when(nameMock).isEmpty();
			doReturn(bindableMock).when(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
			doReturn(true).when(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
			doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
			doReturn(BindMethod.JAVA_BEAN).when(bindableMock).getBindMethod();
			doReturn(resolvableTypeMock, resolvableTypeMock2).when(bindableMock).getType();
			Object object = new Object();
			Object object2 = new Object();
			doReturn(object).when(handlerMock).onSuccess(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(object2));
			Object object3 = new Object();
			doReturn(object3).when(handlerMock).onCreate(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
			Object object4 = new Object();
			Exception exception = new Exception();
			doReturn(object4).when(handlerMock).onFailure(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(exception));
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bindableMock2, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
			//Act Statement(s)
			Object result = target.bindOrCreate(nameMock, bindableMock2, handlerMock);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(nameMock).isEmpty();
				verify(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
				verify(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
				verify(bindableMock, times(2)).getType();
				verify(resolvableTypeMock).resolve(Object.class);
				verify(bindableMock, times(2)).getBindMethod();
				verify(handlerMock).onSuccess(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(object2));
				verify(handlerMock).onCreate(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
				verify(handlerMock).onFailure(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(exception));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bindableMock2, "Target must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${cdb14a7f-ee34-31fc-b8a1-27700a878630}, hash: 3FEBCE9A3345274F4D290148392C4BB8
	@Disabled()
	@Test()
	void bindOrCreate3WhenAggregateBinderIsNotNullAndResultIsNullAndResultIsNullAndCreateAndResultIsNotNull() throws Exception {
		/* Branches:
		 * (handler != null) : true  #  inside bind method
		 * (replacementTarget == null) : false  #  inside bind method
		 * (name.isEmpty()) : false  #  inside findProperty method
		 * (target.hasBindRestriction(BindRestriction.NO_DIRECT_PROPERTY)) : true  #  inside findProperty method
		 * (property == null) : true  #  inside bindObject method
		 * (context.depth != 0) : true  #  inside bindObject method
		 * (for-each(sources)) : true  #  inside containsNoDescendantOf method
		 * (source.containsDescendantOf(name) != ConfigurationPropertyState.ABSENT) : true  #  inside containsNoDescendantOf method
		 * (containsNoDescendantOf(context.getSources(), name)) : false  #  inside bindObject method
		 * (Map.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (Collection.class.isAssignableFrom(resolvedType)) : true  #  inside getAggregateBinder method
		 * (aggregateBinder != null) : true  #  inside bindObject method
		 * (result != null) : false  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 * (create) : true  #  inside handleBindResult method
		 * (result == null) : false  #  inside handleBindResult method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: context - Method: getSources
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(false).when(nameMock).isEmpty();
			doReturn(bindableMock).when(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
			doReturn(true).when(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
			doReturn(resolvableTypeMock).when(bindableMock).getType();
			doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
			doReturn(BindMethod.JAVA_BEAN).when(bindableMock).getBindMethod();
			Object object = new Object();
			doReturn(object).when(handlerMock).onCreate(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
			Object object2 = new Object();
			doNothing().when(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(object2));
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bindableMock2, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
			//Act Statement(s)
			Object result = target.bindOrCreate(nameMock, bindableMock2, handlerMock);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(nameMock).isEmpty();
				verify(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
				verify(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
				verify(bindableMock).getType();
				verify(resolvableTypeMock).resolve(Object.class);
				verify(bindableMock).getBindMethod();
				verify(handlerMock).onCreate(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
				verify(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(object2));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bindableMock2, "Target must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${887b3a75-44ab-39fb-b79f-f8a05672efdb}, hash: 76309EFD211F2E87143C722C7DCF7FF2
	@Disabled()
	@Test()
	void bindOrCreate3WhenPropertyIsNotNullAndResultIsNullAndResultIsNullAndCreateAndResultIsNotNull() throws Exception {
		/* Branches:
		 * (handler != null) : true  #  inside bind method
		 * (replacementTarget == null) : false  #  inside bind method
		 * (name.isEmpty()) : false  #  inside findProperty method
		 * (target.hasBindRestriction(BindRestriction.NO_DIRECT_PROPERTY)) : false  #  inside findProperty method
		 * (for-each(context.getSources())) : true  #  inside findProperty method
		 * (property != null) : true  #  inside findProperty method
		 * (property == null) : false  #  inside bindObject method
		 * (Map.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (Collection.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (target.getType().isArray()) : false  #  inside getAggregateBinder method
		 * (aggregateBinder != null) : false  #  inside bindObject method
		 * (property != null) : true  #  inside bindObject method
		 * (result != null) : false  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 * (create) : true  #  inside handleBindResult method
		 * (result == null) : false  #  inside handleBindResult method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: context - Method: getSources
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(false).when(nameMock).isEmpty();
			doReturn(bindableMock).when(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
			doReturn(false).when(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
			doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
			doReturn(resolvableTypeMock, resolvableTypeMock2).when(bindableMock).getType();
			doReturn(false).when(resolvableTypeMock2).isArray();
			doReturn(BindMethod.JAVA_BEAN).when(bindableMock).getBindMethod();
			Object object = new Object();
			doReturn(object).when(handlerMock).onCreate(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
			Object object2 = new Object();
			doNothing().when(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(object2));
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bindableMock2, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
			Object object3 = new Object();
			Object object4 = new Object();
			doReturn(object3).when(placeholdersResolverMock).resolvePlaceholders(object4);
			//Act Statement(s)
			Object result = target.bindOrCreate(nameMock, bindableMock2, handlerMock);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(nameMock).isEmpty();
				verify(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
				verify(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
				verify(bindableMock, times(2)).getType();
				verify(resolvableTypeMock).resolve(Object.class);
				verify(resolvableTypeMock2).isArray();
				verify(bindableMock).getBindMethod();
				verify(handlerMock).onCreate(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
				verify(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(object2));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bindableMock2, "Target must not be null"), atLeast(1));
				verify(placeholdersResolverMock).resolvePlaceholders(object4);
			});
		}
	}

	//Sapient generated method id: ${cb211651-3f5e-3a91-9314-deaa217641f0}, hash: 1D0991675C8960BFB3C8A7349C3E7C2C
	@Disabled()
	@Test()
	void bindOrCreate3WhenTargetGetTypeIsArrayAndAggregateBinderIsNotNullAndResultIsNullAndResultIsNullAndCreateAndResultIsNotNu() throws Exception {
		/* Branches:
		 * (handler != null) : true  #  inside bind method
		 * (replacementTarget == null) : false  #  inside bind method
		 * (name.isEmpty()) : false  #  inside findProperty method
		 * (target.hasBindRestriction(BindRestriction.NO_DIRECT_PROPERTY)) : true  #  inside findProperty method
		 * (property == null) : true  #  inside bindObject method
		 * (context.depth != 0) : true  #  inside bindObject method
		 * (for-each(sources)) : true  #  inside containsNoDescendantOf method
		 * (source.containsDescendantOf(name) != ConfigurationPropertyState.ABSENT) : true  #  inside containsNoDescendantOf method
		 * (containsNoDescendantOf(context.getSources(), name)) : false  #  inside bindObject method
		 * (Map.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (Collection.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (target.getType().isArray()) : true  #  inside getAggregateBinder method
		 * (aggregateBinder != null) : true  #  inside bindObject method
		 * (result != null) : false  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 * (create) : true  #  inside handleBindResult method
		 * (result == null) : false  #  inside handleBindResult method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: context - Method: getSources
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(false).when(nameMock).isEmpty();
			doReturn(bindableMock).when(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
			doReturn(true).when(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
			doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
			doReturn(resolvableTypeMock, resolvableTypeMock2).when(bindableMock).getType();
			doReturn(true).when(resolvableTypeMock2).isArray();
			doReturn(BindMethod.JAVA_BEAN).when(bindableMock).getBindMethod();
			Object object = new Object();
			doReturn(object).when(handlerMock).onCreate(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
			Object object2 = new Object();
			doNothing().when(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(object2));
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bindableMock2, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
			//Act Statement(s)
			Object result = target.bindOrCreate(nameMock, bindableMock2, handlerMock);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(nameMock).isEmpty();
				verify(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
				verify(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
				verify(bindableMock, times(2)).getType();
				verify(resolvableTypeMock).resolve(Object.class);
				verify(resolvableTypeMock2).isArray();
				verify(bindableMock).getBindMethod();
				verify(handlerMock).onCreate(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
				verify(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(object2));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bindableMock2, "Target must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${29339beb-43ed-3866-9910-947241084e77}, hash: 0FFCC098FFDAFC8D40B1965F99EDF35D
	@Disabled()
	@Test()
	void bindOrCreate3WhenResolvedIsPrimitiveAndIsUnbindableBeanNameTargetContextAndResultIsNullAndResultIsNullAndCreateAndResul() throws Exception {
		/* Branches:
		 * (handler != null) : false  #  inside bind method
		 * (replacementTarget == null) : false  #  inside bind method
		 * (name.isEmpty()) : true  #  inside findProperty method
		 * (property == null) : true  #  inside bindObject method
		 * (context.depth != 0) : false  #  inside bindObject method
		 * (Map.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (Collection.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (target.getType().isArray()) : false  #  inside getAggregateBinder method
		 * (aggregateBinder != null) : false  #  inside bindObject method
		 * (property != null) : false  #  inside bindObject method
		 * (for-each(context.getSources())) : false  #  inside isUnbindableBean method
		 * (resolved.isPrimitive()) : true  #  inside isUnbindableBean method
		 * (isUnbindableBean(name, target, context)) : true  #  inside bindDataObject method
		 * (result != null) : false  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 * (create) : true  #  inside handleBindResult method
		 * (result == null) : false  #  inside handleBindResult method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(true).when(nameMock).isEmpty();
			doReturn(bindableMock).when(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
			doReturn(resolvableTypeMock).when(bindableMock).getType();
			doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
			doReturn(false).when(resolvableTypeMock).isArray();
			doReturn(BindMethod.JAVA_BEAN).when(bindableMock).getBindMethod();
			Object object = new Object();
			doReturn(object).when(handlerMock).onCreate(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
			Object object2 = new Object();
			doNothing().when(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(object2));
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bindableMock2, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, handlerMock, (BindConstructorProvider) null);
			BindHandler bindHandler = null;
			//Act Statement(s)
			Object result = target.bindOrCreate(nameMock, bindableMock2, bindHandler);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(nameMock).isEmpty();
				verify(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
				verify(bindableMock, times(3)).getType();
				verify(resolvableTypeMock, times(2)).resolve(Object.class);
				verify(resolvableTypeMock).isArray();
				verify(bindableMock).getBindMethod();
				verify(handlerMock).onCreate(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
				verify(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(object2));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bindableMock2, "Target must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${8c60980e-71fb-335f-a5bd-9a9cafbe94eb}, hash: FCE3183B13C74FFF0C665CD148FCB6BC
	@Disabled()
	@Test()
	void bindOrCreate3WhenInstanceIsNull() throws Exception {
		/* Branches:
		 * (handler != null) : true  #  inside bind method
		 * (replacementTarget == null) : false  #  inside bind method
		 * (name.isEmpty()) : false  #  inside findProperty method
		 * (target.hasBindRestriction(BindRestriction.NO_DIRECT_PROPERTY)) : false  #  inside findProperty method
		 * (for-each(context.getSources())) : true  #  inside findProperty method
		 * (property != null) : true  #  inside findProperty method
		 * (property == null) : false  #  inside bindObject method
		 * (Map.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (Collection.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (target.getType().isArray()) : false  #  inside getAggregateBinder method
		 * (aggregateBinder != null) : false  #  inside bindObject method
		 * (property != null) : true  #  inside bindObject method
		 * (catch-exception (ConverterNotFoundException)) : true  #  inside bindObject method
		 * (for-each(context.getSources())) : true  #  inside isUnbindableBean method
		 * (source.containsDescendantOf(name) == ConfigurationPropertyState.PRESENT) : true  #  inside isUnbindableBean method
		 * (isUnbindableBean(name, target, context)) : false  #  inside bindDataObject method
		 * (!allowRecursiveBinding) : true  #  inside bindDataObject method
		 * (context.isBindingDataObject(type)) : true  #  inside bindDataObject method
		 * (instance != null) : false  #  inside bindObject method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: context - Method: getSources
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(false).when(nameMock).isEmpty();
			doReturn(bindableMock).when(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
			doReturn(false).when(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
			doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
			doReturn(false).when(resolvableTypeMock2).isArray();
			doReturn(resolvableTypeMock, resolvableTypeMock2, resolvableTypeMock3).when(bindableMock).getType();
			doReturn(Object.class).when(resolvableTypeMock3).resolve(Object.class);
			doReturn(BindMethod.JAVA_BEAN).when(bindableMock).getBindMethod();
			Object object = new Object();
			Exception exception = new Exception();
			doReturn(object).when(handlerMock).onFailure(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(exception));
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bindableMock2, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
			Object object2 = new Object();
			Object object3 = new Object();
			doReturn(object2).when(placeholdersResolverMock).resolvePlaceholders(object3);
			//Act Statement(s)
			Object result = target.bindOrCreate(nameMock, bindableMock2, handlerMock);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(nameMock).isEmpty();
				verify(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
				verify(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
				verify(bindableMock, times(3)).getType();
				verify(resolvableTypeMock).resolve(Object.class);
				verify(resolvableTypeMock2).isArray();
				verify(resolvableTypeMock3).resolve(Object.class);
				verify(bindableMock).getBindMethod();
				verify(handlerMock).onFailure(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(exception));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bindableMock2, "Target must not be null"), atLeast(1));
				verify(placeholdersResolverMock).resolvePlaceholders(object3);
			});
		}
	}

	//Sapient generated method id: ${ba7e7e01-5707-3977-8260-ec5fa6b02432}, hash: C81104076EEB241630C13521286C8C7B
	@Disabled()
	@Test()
	void bindOrCreate3WhenIsUnbindableBeanNameTargetContextAndResultIsNullAndResultIsNullAndCreateAndResultIsNotNull4() throws Exception {
		/* Branches:
		 * (handler != null) : true  #  inside bind method
		 * (replacementTarget == null) : false  #  inside bind method
		 * (name.isEmpty()) : false  #  inside findProperty method
		 * (target.hasBindRestriction(BindRestriction.NO_DIRECT_PROPERTY)) : false  #  inside findProperty method
		 * (for-each(context.getSources())) : true  #  inside findProperty method
		 * (property != null) : false  #  inside findProperty method
		 * (property == null) : true  #  inside bindObject method
		 * (context.depth != 0) : false  #  inside bindObject method
		 * (Map.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (Collection.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (target.getType().isArray()) : false  #  inside getAggregateBinder method
		 * (aggregateBinder != null) : false  #  inside bindObject method
		 * (property != null) : false  #  inside bindObject method
		 * (for-each(context.getSources())) : false  #  inside isUnbindableBean method
		 * (resolved.isPrimitive()) : true  #  inside isUnbindableBean method
		 * (isUnbindableBean(name, target, context)) : true  #  inside bindDataObject method
		 * (result != null) : false  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 * (create) : true  #  inside handleBindResult method
		 * (result == null) : false  #  inside handleBindResult method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: context - Method: getSources
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(false).when(nameMock).isEmpty();
			doReturn(bindableMock).when(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
			doReturn(false).when(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
			doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
			doReturn(false).when(resolvableTypeMock2).isArray();
			doReturn(resolvableTypeMock, resolvableTypeMock2, resolvableTypeMock3).when(bindableMock).getType();
			doReturn(Object.class).when(resolvableTypeMock3).resolve(Object.class);
			doReturn(BindMethod.JAVA_BEAN).when(bindableMock).getBindMethod();
			Object object = new Object();
			doReturn(object).when(handlerMock).onCreate(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
			Object object2 = new Object();
			doNothing().when(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(object2));
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bindableMock2, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
			//Act Statement(s)
			Object result = target.bindOrCreate(nameMock, bindableMock2, handlerMock);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(nameMock).isEmpty();
				verify(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
				verify(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
				verify(bindableMock, times(3)).getType();
				verify(resolvableTypeMock).resolve(Object.class);
				verify(resolvableTypeMock2).isArray();
				verify(resolvableTypeMock3).resolve(Object.class);
				verify(bindableMock).getBindMethod();
				verify(handlerMock).onCreate(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
				verify(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(object2));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bindableMock2, "Target must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${b0a44fe5-b4f7-3b29-9046-c495aa8e2e39}, hash: 8E320D3C762C7D429B3B8AB99CA1663C
	@Disabled()
	@Test()
	void bindOrCreate3WhenIsUnbindableBeanNameTargetContextAndResultIsNullAndResultIsNullAndCreateAndResultIsNotNull6() throws Exception {
		/* Branches:
		 * (handler != null) : true  #  inside bind method
		 * (replacementTarget == null) : false  #  inside bind method
		 * (name.isEmpty()) : false  #  inside findProperty method
		 * (target.hasBindRestriction(BindRestriction.NO_DIRECT_PROPERTY)) : true  #  inside findProperty method
		 * (property == null) : true  #  inside bindObject method
		 * (context.depth != 0) : true  #  inside bindObject method
		 * (for-each(sources)) : true  #  inside containsNoDescendantOf method
		 * (source.containsDescendantOf(name) != ConfigurationPropertyState.ABSENT) : true  #  inside containsNoDescendantOf method
		 * (containsNoDescendantOf(context.getSources(), name)) : false  #  inside bindObject method
		 * (Map.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (Collection.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (target.getType().isArray()) : false  #  inside getAggregateBinder method
		 * (aggregateBinder != null) : false  #  inside bindObject method
		 * (property != null) : false  #  inside bindObject method
		 * (catch-exception (ConverterNotFoundException)) : true  #  inside bindObject method
		 * (for-each(context.getSources())) : false  #  inside isUnbindableBean method
		 * (resolved.isPrimitive()) : true  #  inside isUnbindableBean method
		 * (isUnbindableBean(name, target, context)) : true  #  inside bindDataObject method
		 * (result != null) : false  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 * (create) : true  #  inside handleBindResult method
		 * (result == null) : false  #  inside handleBindResult method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: context - Method: getSources
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(false).when(nameMock).isEmpty();
			doReturn(bindableMock).when(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
			doReturn(true).when(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
			doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
			doReturn(false).when(resolvableTypeMock2).isArray();
			doReturn(resolvableTypeMock, resolvableTypeMock2, resolvableTypeMock3).when(bindableMock).getType();
			doReturn(Object.class).when(resolvableTypeMock3).resolve(Object.class);
			doReturn(BindMethod.JAVA_BEAN).when(bindableMock).getBindMethod();
			Object object = new Object();
			doReturn(object).when(handlerMock).onCreate(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
			Object object2 = new Object();
			doNothing().when(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(object2));
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bindableMock2, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
			//Act Statement(s)
			Object result = target.bindOrCreate(nameMock, bindableMock2, handlerMock);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(nameMock).isEmpty();
				verify(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
				verify(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
				verify(bindableMock, times(3)).getType();
				verify(resolvableTypeMock).resolve(Object.class);
				verify(resolvableTypeMock2).isArray();
				verify(resolvableTypeMock3).resolve(Object.class);
				verify(bindableMock).getBindMethod();
				verify(handlerMock).onCreate(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
				verify(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(object2));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bindableMock2, "Target must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${449c3e88-03bd-3651-8a90-9b57b395cd0b}, hash: D2DB621D1684E561D01240D0F026A985
	@Disabled()
	@Test()
	void bindOrCreate3WhenContextIsBindingDataObjectTypeAndResultIsNullAndResultIsNullAndCreateAndResultIsNotNull() throws Exception {
		/* Branches:
		 * (handler != null) : true  #  inside bind method
		 * (replacementTarget == null) : false  #  inside bind method
		 * (name.isEmpty()) : false  #  inside findProperty method
		 * (target.hasBindRestriction(BindRestriction.NO_DIRECT_PROPERTY)) : true  #  inside findProperty method
		 * (property == null) : true  #  inside bindObject method
		 * (context.depth != 0) : true  #  inside bindObject method
		 * (for-each(sources)) : true  #  inside containsNoDescendantOf method
		 * (source.containsDescendantOf(name) != ConfigurationPropertyState.ABSENT) : true  #  inside containsNoDescendantOf method
		 * (containsNoDescendantOf(context.getSources(), name)) : false  #  inside bindObject method
		 * (Map.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (Collection.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (target.getType().isArray()) : false  #  inside getAggregateBinder method
		 * (aggregateBinder != null) : false  #  inside bindObject method
		 * (property != null) : false  #  inside bindObject method
		 * (for-each(context.getSources())) : true  #  inside isUnbindableBean method
		 * (source.containsDescendantOf(name) == ConfigurationPropertyState.PRESENT) : true  #  inside isUnbindableBean method
		 * (isUnbindableBean(name, target, context)) : false  #  inside bindDataObject method
		 * (!allowRecursiveBinding) : true  #  inside bindDataObject method
		 * (context.isBindingDataObject(type)) : true  #  inside bindDataObject method
		 * (result != null) : false  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 * (create) : true  #  inside handleBindResult method
		 * (result == null) : false  #  inside handleBindResult method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: context - Method: getSources
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(false).when(nameMock).isEmpty();
			doReturn(bindableMock).when(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
			doReturn(true).when(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
			doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
			doReturn(false).when(resolvableTypeMock2).isArray();
			doReturn(resolvableTypeMock, resolvableTypeMock2, resolvableTypeMock3).when(bindableMock).getType();
			doReturn(Object.class).when(resolvableTypeMock3).resolve(Object.class);
			doReturn(BindMethod.JAVA_BEAN).when(bindableMock).getBindMethod();
			Object object = new Object();
			doReturn(object).when(handlerMock).onCreate(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
			Object object2 = new Object();
			doNothing().when(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(object2));
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bindableMock2, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
			//Act Statement(s)
			Object result = target.bindOrCreate(nameMock, bindableMock2, handlerMock);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(nameMock).isEmpty();
				verify(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
				verify(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
				verify(bindableMock, times(3)).getType();
				verify(resolvableTypeMock).resolve(Object.class);
				verify(resolvableTypeMock2).isArray();
				verify(resolvableTypeMock3).resolve(Object.class);
				verify(bindableMock, times(2)).getBindMethod();
				verify(handlerMock).onCreate(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
				verify(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(object2));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bindableMock2, "Target must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${9313387c-e5ac-3efc-ad07-c1ea45feac04}, hash: B17E0A0E81D1E70BE11DE039D8759D2F
	@Disabled()
	@Test()
	void bindOrCreate3WhenInstanceIsNotNullAndResultIsNotNullAndResultIsNullAndCreateAndResultIsNotNull() throws Exception {
		/* Branches:
		 * (handler != null) : true  #  inside bind method
		 * (replacementTarget == null) : false  #  inside bind method
		 * (name.isEmpty()) : false  #  inside findProperty method
		 * (target.hasBindRestriction(BindRestriction.NO_DIRECT_PROPERTY)) : false  #  inside findProperty method
		 * (for-each(context.getSources())) : true  #  inside findProperty method
		 * (property != null) : true  #  inside findProperty method
		 * (property == null) : false  #  inside bindObject method
		 * (Map.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (Collection.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (target.getType().isArray()) : false  #  inside getAggregateBinder method
		 * (aggregateBinder != null) : false  #  inside bindObject method
		 * (property != null) : true  #  inside bindObject method
		 * (catch-exception (ConverterNotFoundException)) : true  #  inside bindObject method
		 * (for-each(context.getSources())) : true  #  inside isUnbindableBean method
		 * (source.containsDescendantOf(name) == ConfigurationPropertyState.PRESENT) : true  #  inside isUnbindableBean method
		 * (isUnbindableBean(name, target, context)) : false  #  inside bindDataObject method
		 * (!allowRecursiveBinding) : true  #  inside bindDataObject method
		 * (context.isBindingDataObject(type)) : false  #  inside bindDataObject method
		 * (instance != null) : true  #  inside bindObject method
		 * (result != null) : true  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 * (create) : true  #  inside handleBindResult method
		 * (result == null) : false  #  inside handleBindResult method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: context - Method: getSources
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(false).when(nameMock).isEmpty();
			doReturn(bindableMock).when(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
			doReturn(false).when(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
			doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
			doReturn(false).when(resolvableTypeMock2).isArray();
			doReturn(resolvableTypeMock, resolvableTypeMock2, resolvableTypeMock3).when(bindableMock).getType();
			doReturn(Object.class).when(resolvableTypeMock3).resolve(Object.class);
			doReturn(BindMethod.JAVA_BEAN).when(bindableMock).getBindMethod();
			Object object = new Object();
			doReturn(object).when(handlerMock).onSuccess(eq(nameMock), eq(bindableMock), (BindContext) any(), (Object) any());
			Object object2 = new Object();
			doReturn(object2).when(handlerMock).onCreate(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
			Object object3 = new Object();
			doNothing().when(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(object3));
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bindableMock2, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
			Object object4 = new Object();
			Object object5 = new Object();
			doReturn(object4).when(placeholdersResolverMock).resolvePlaceholders(object5);
			//Act Statement(s)
			Object result = target.bindOrCreate(nameMock, bindableMock2, handlerMock);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(nameMock).isEmpty();
				verify(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
				verify(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
				verify(bindableMock, times(3)).getType();
				verify(resolvableTypeMock).resolve(Object.class);
				verify(resolvableTypeMock2).isArray();
				verify(resolvableTypeMock3).resolve(Object.class);
				verify(bindableMock, times(2)).getBindMethod();
				verify(handlerMock).onSuccess(eq(nameMock), eq(bindableMock), (BindContext) any(), (Object) any());
				verify(handlerMock).onCreate(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
				verify(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(object3));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bindableMock2, "Target must not be null"), atLeast(1));
				verify(placeholdersResolverMock).resolvePlaceholders(object5);
			});
		}
	}

	//Sapient generated method id: ${bed9b3a3-f416-3884-aff9-21444a764d91}, hash: 9E1BA9054EAD03DBFC9A512B4AE28B72
	@Disabled()
	@Test()
	void bindOrCreate3WhenIsUnbindableBeanNameTargetContextAndResultIsNullAndResultIsNullAndCreateAndResultIsNotNull8() throws Exception {
		/* Branches:
		 * (handler != null) : true  #  inside bind method
		 * (replacementTarget == null) : false  #  inside bind method
		 * (name.isEmpty()) : false  #  inside findProperty method
		 * (target.hasBindRestriction(BindRestriction.NO_DIRECT_PROPERTY)) : true  #  inside findProperty method
		 * (property == null) : true  #  inside bindObject method
		 * (context.depth != 0) : true  #  inside bindObject method
		 * (for-each(sources)) : true  #  inside containsNoDescendantOf method
		 * (source.containsDescendantOf(name) != ConfigurationPropertyState.ABSENT) : true  #  inside containsNoDescendantOf method
		 * (containsNoDescendantOf(context.getSources(), name)) : false  #  inside bindObject method
		 * (Map.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (Collection.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (target.getType().isArray()) : false  #  inside getAggregateBinder method
		 * (aggregateBinder != null) : false  #  inside bindObject method
		 * (property != null) : false  #  inside bindObject method
		 * (for-each(context.getSources())) : true  #  inside isUnbindableBean method
		 * (source.containsDescendantOf(name) == ConfigurationPropertyState.PRESENT) : false  #  inside isUnbindableBean method
		 * (resolved.isPrimitive()) : false  #  inside isUnbindableBean method
		 * (NON_BEAN_CLASSES.contains(resolved)) : false  #  inside isUnbindableBean method
		 * (resolved.getName().startsWith("java.")) : true  #  inside isUnbindableBean method
		 * (isUnbindableBean(name, target, context)) : true  #  inside bindDataObject method
		 * (result != null) : false  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 * (create) : true  #  inside handleBindResult method
		 * (result == null) : false  #  inside handleBindResult method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: context - Method: getSources
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(false).when(nameMock).isEmpty();
			doReturn(bindableMock).when(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
			doReturn(true).when(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
			doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
			doReturn(false).when(resolvableTypeMock2).isArray();
			doReturn(resolvableTypeMock, resolvableTypeMock2, resolvableTypeMock3).when(bindableMock).getType();
			doReturn(Object.class).when(resolvableTypeMock3).resolve(Object.class);
			doReturn(BindMethod.JAVA_BEAN).when(bindableMock).getBindMethod();
			Object object = new Object();
			doReturn(object).when(handlerMock).onCreate(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
			Object object2 = new Object();
			doNothing().when(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(object2));
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bindableMock2, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
			//Act Statement(s)
			Object result = target.bindOrCreate(nameMock, bindableMock2, handlerMock);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(nameMock).isEmpty();
				verify(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
				verify(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
				verify(bindableMock, times(3)).getType();
				verify(resolvableTypeMock).resolve(Object.class);
				verify(resolvableTypeMock2).isArray();
				verify(resolvableTypeMock3).resolve(Object.class);
				verify(bindableMock).getBindMethod();
				verify(handlerMock).onCreate(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
				verify(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(object2));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bindableMock2, "Target must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a11bd6af-96f0-3231-b386-de1430cc1613}, hash: 6BA55724C17B7C2778E8CE950DC3EC86
	@Disabled()
	@Test()
	void bindOrCreate3WhenContextNotIsBindingDataObjectTypeAndResultIsNullAndResultIsNullAndCreateAndResultIsNotNull2() throws Exception {
		/* Branches:
		 * (handler != null) : true  #  inside bind method
		 * (replacementTarget == null) : false  #  inside bind method
		 * (name.isEmpty()) : false  #  inside findProperty method
		 * (target.hasBindRestriction(BindRestriction.NO_DIRECT_PROPERTY)) : true  #  inside findProperty method
		 * (property == null) : true  #  inside bindObject method
		 * (context.depth != 0) : true  #  inside bindObject method
		 * (for-each(sources)) : true  #  inside containsNoDescendantOf method
		 * (source.containsDescendantOf(name) != ConfigurationPropertyState.ABSENT) : true  #  inside containsNoDescendantOf method
		 * (containsNoDescendantOf(context.getSources(), name)) : false  #  inside bindObject method
		 * (Map.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (Collection.class.isAssignableFrom(resolvedType)) : false  #  inside getAggregateBinder method
		 * (target.getType().isArray()) : false  #  inside getAggregateBinder method
		 * (aggregateBinder != null) : false  #  inside bindObject method
		 * (property != null) : false  #  inside bindObject method
		 * (for-each(context.getSources())) : true  #  inside isUnbindableBean method
		 * (source.containsDescendantOf(name) == ConfigurationPropertyState.PRESENT) : false  #  inside isUnbindableBean method
		 * (resolved.isPrimitive()) : false  #  inside isUnbindableBean method
		 * (NON_BEAN_CLASSES.contains(resolved)) : false  #  inside isUnbindableBean method
		 * (resolved.getName().startsWith("java.")) : false  #  inside isUnbindableBean method
		 * (isUnbindableBean(name, target, context)) : false  #  inside bindDataObject method
		 * (!allowRecursiveBinding) : true  #  inside bindDataObject method
		 * (context.isBindingDataObject(type)) : false  #  inside bindDataObject method
		 * (result != null) : false  #  inside handleBindResult method
		 * (result == null) : true  #  inside handleBindResult method
		 * (create) : true  #  inside handleBindResult method
		 * (result == null) : false  #  inside handleBindResult method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: context - Method: getSources
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
			doReturn(false).when(nameMock).isEmpty();
			doReturn(bindableMock).when(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
			doReturn(true).when(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
			doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
			doReturn(false).when(resolvableTypeMock2).isArray();
			doReturn(Object.class).when(resolvableTypeMock3).resolve(Object.class);
			doReturn(resolvableTypeMock, resolvableTypeMock2, resolvableTypeMock3, resolvableTypeMock4).when(bindableMock).getType();
			doReturn(Object.class).when(resolvableTypeMock4).resolve(Object.class);
			doReturn(BindMethod.JAVA_BEAN).when(bindableMock).getBindMethod();
			Object object = new Object();
			doReturn(object).when(handlerMock).onCreate(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
			Object object2 = new Object();
			doNothing().when(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(object2));
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bindableMock2, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
			//Act Statement(s)
			Object result = target.bindOrCreate(nameMock, bindableMock2, handlerMock);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(nameMock).isEmpty();
				verify(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
				verify(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
				verify(bindableMock, times(4)).getType();
				verify(resolvableTypeMock).resolve(Object.class);
				verify(resolvableTypeMock2).isArray();
				verify(resolvableTypeMock3).resolve(Object.class);
				verify(resolvableTypeMock4).resolve(Object.class);
				verify(bindableMock, times(2)).getBindMethod();
				verify(handlerMock).onCreate(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
				verify(handlerMock).onFinish(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(object2));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bindableMock2, "Target must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}, hash: 1F46AC662FAB78D24168002FAC0D8251
	@Test()
	void getTest() {
		//Arrange Statement(s)
		Binder binderMock = mock(Binder.class);
		try (MockedStatic<Binder> binder = mockStatic(Binder.class, CALLS_REAL_METHODS)) {
			binder.when(() -> Binder.get(environmentMock, (BindHandler) null)).thenReturn(binderMock);
			//Act Statement(s)
			Binder result = Binder.get(environmentMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(binderMock));
				binder.verify(() -> Binder.get(environmentMock, (BindHandler) null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${d1ebfbe8-e8b0-3b52-94c4-441baa7d1b4d}, hash: BF2C05B0CA807944597B122F740A90EE
	@Disabled()
	@Test()
	void get1WhenDefaultBranch() {
		/* Branches:
		 * (branch expression (line 164)) : false  #  inside <init> method
		 * (branch expression (line 188)) : true  #  inside <init> method
		 * (branch expression (line 192)) : false  #  inside <init> method
		 * (branch expression (line 194)) : false  #  inside <init> method
		 * (branch expression (line 195)) : false  #  inside <init> method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.context.properties.bind.PropertySourcesPlaceholdersResolver
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			configurationPropertySources.when(() -> ConfigurationPropertySources.get(environmentMock)).thenReturn(iterable);
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get((List) null, (Consumer) null)).thenReturn(bindConverterMock);
			//Act Statement(s)
			Binder result = Binder.get(environmentMock, bindHandlerMock);
			//Assert statement(s)
			//TODO: Please implement equals method in Binder for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.get(environmentMock), atLeast(1));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get((List) null, (Consumer) null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${02b9b126-828e-39d1-a952-5e3b331abea1}, hash: 9C90D3C0D52F75A1535B8B1FE925FE7F
	@Disabled()
	@Test()
	void get1WhenDefaultBranchAndDefaultBranch() {
		/* Branches:
		 * (branch expression (line 164)) : false  #  inside <init> method
		 * (branch expression (line 188)) : true  #  inside <init> method
		 * (branch expression (line 192)) : false  #  inside <init> method
		 * (branch expression (line 194)) : false  #  inside <init> method
		 * (branch expression (line 195)) : false  #  inside <init> method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.context.properties.bind.PropertySourcesPlaceholdersResolver
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
			configurationPropertySources.when(() -> ConfigurationPropertySources.get(environmentMock)).thenReturn(iterable);
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
			bindConverter.when(() -> BindConverter.get((List) null, (Consumer) null)).thenReturn(bindConverterMock);
			BindHandler bindHandler = null;
			//Act Statement(s)
			Binder result = Binder.get(environmentMock, bindHandler);
			//Assert statement(s)
			//TODO: Please implement equals method in Binder for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.get(environmentMock), atLeast(1));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
				_assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
				bindConverter.verify(() -> BindConverter.get((List) null, (Consumer) null), atLeast(1));
			});
		}
	}
}
