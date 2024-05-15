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

    private final Bindable<Object> targetMock = mock(Bindable.class);

    //Sapient generated method id: ${bindTest}, hash: 89826C307AB368B4F234057E887979BA
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

    //Sapient generated method id: ${bind1Test}, hash: 355C222A24B5646353048092DA93DB06
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

    //Sapient generated method id: ${bind2Test}, hash: 38BDEB5AA29E1A44B18DDC2039B956D9
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

    //Sapient generated method id: ${bind3Test}, hash: E276F70F6B9DDE11D346CC3B852E9103
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

    //Sapient generated method id: ${bind4WhenNotCreate}, hash: 9BACD99090883901BC4AD9752F06AC68
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
         *  A variable could not be isolated/mocked when calling a method - Variable name: context - Method: getConverter
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

    //Sapient generated method id: ${bind4WhenCaughtException}, hash: 9F63142103D4BE0AEB7BB1D4B213448F
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
         *  A variable could not be isolated/mocked when calling a method - Variable name: context - Method: getConverter
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

    //Sapient generated method id: ${bind4WhenNotCreateAndCaughtException}, hash: 5EC89AF0A6B289D6025881D7A7369643
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
         *  A variable could not be isolated/mocked when calling a method - Variable name: context - Method: getSources
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

    //Sapient generated method id: ${bind4WhenResultIsNullAndResultIsNullAndNotCreate}, hash: F2F71BBABAB8D5C7A48256F7EBD588FE
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
         *  A variable could not be isolated/mocked when calling a method - Variable name: context - Method: getSources
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
                verify(bindableMock, atLeast(1)).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
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

    //Sapient generated method id: ${bind4WhenResultIsNotNullAndResultIsNullAndNotCreate}, hash: 1B56FC50A9229F0487208AAB185A3D21
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
         *  A variable could not be isolated/mocked when calling a method - Variable name: context - Method: getSources
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
                verify(bindableMock, atLeast(1)).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
                verify(bindableMock, atLeast(1)).getType();
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

    //Sapient generated method id: ${bind4WhenCollectionIsAssignableFromResolvedTypeAndAggregateBinderIsNotNullAndResultIsNullAndResultIsNullAndNotCreate}, hash: 6831B1B7ACF0851C29FCD5CAB4B9B291
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
         *  A variable could not be isolated/mocked when calling a method - Variable name: context - Method: getSources
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
                verify(bindableMock, atLeast(1)).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
                verify(bindableMock, atLeast(1)).getType();
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

    //Sapient generated method id: ${bind4WhenPropertyIsNotNullAndResultIsNullAndResultIsNullAndNotCreate}, hash: F880A24C2BC44F2B5531AB8A50474C75
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
         *  A variable could not be isolated/mocked when calling a method - Variable name: context - Method: getSources
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
                verify(bindableMock, atLeast(1)).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
                verify(bindableMock, atLeast(2)).getType();
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

    //Sapient generated method id: ${bind4WhenTargetGetTypeIsArrayAndAggregateBinderIsNotNullAndResultIsNullAndResultIsNullAndNotCreate}, hash: 119F7378B37B9C8C40EF7CC4E7BF0E7F
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
         *  A variable could not be isolated/mocked when calling a method - Variable name: context - Method: getSources
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
                verify(bindableMock, atLeast(1)).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
                verify(bindableMock, atLeast(2)).getType();
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

    //Sapient generated method id: ${bind4WhenResolvedIsPrimitiveAndIsUnbindableBeanNameTargetContextAndResultIsNullAndResultIsNullAndNotCreate}, hash: 870381E6F598B716E7909BE063F06B88
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

    //Sapient generated method id: ${bind4WhenInstanceIsNull}, hash: E473402CC4ED38D822977A05D26E9B9C
    @Disabled()
    @Test()
    void bind4WhenInstanceIsNull() throws Exception {
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
         *  A variable could not be isolated/mocked when calling a method - Variable name: context - Method: getSources
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
            doReturn(BindMethod.JAVA_BEAN).when(bindableMock).getBindMethod();
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
            Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
            Object object3 = new Object();
            Object object4 = new Object();
            doReturn(object3).when(placeholdersResolverMock).resolvePlaceholders(object4);
            //Act Statement(s)
            BindResult result = target.bind(nameMock, bindableMock2, handlerMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bindResultMock));
                verify(nameMock).isEmpty();
                verify(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
                verify(bindableMock, atLeast(1)).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
                verify(bindableMock, atLeast(3)).getType();
                verify(resolvableTypeMock).resolve(Object.class);
                verify(resolvableTypeMock2).isArray();
                verify(resolvableTypeMock3).resolve(Object.class);
                verify(bindableMock, atLeast(1)).getBindMethod();
                verify(handlerMock).onFailure(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(exception));
                _assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
                _assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
                bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
                _assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(bindableMock2, "Target must not be null"), atLeast(1));
                bindResult.verify(() -> BindResult.of(object2), atLeast(1));
                verify(placeholdersResolverMock).resolvePlaceholders(object4);
            });
        }
    }

    //Sapient generated method id: ${bind4WhenResolvedIsPrimitiveAndIsUnbindableBeanNameTargetContextAndResultIsNullAndResultIsNullAndNotCreate3}, hash: 51535EBB12CC6D9DB5A2F9636F8A7B50
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
         *  A variable could not be isolated/mocked when calling a method - Variable name: context - Method: getSources
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
                verify(bindableMock, atLeast(1)).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
                verify(bindableMock, atLeast(3)).getType();
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

    //Sapient generated method id: ${bind4WhenResolvedIsPrimitiveAndIsUnbindableBeanNameTargetContextAndResultIsNullAndResultIsNullAndNotCreate5}, hash: 22858B2EFCC4DD8F7B58BE86F536C131
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
         *  A variable could not be isolated/mocked when calling a method - Variable name: context - Method: getSources
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
                verify(bindableMock, atLeast(1)).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
                verify(bindableMock, atLeast(3)).getType();
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

    //Sapient generated method id: ${bind4WhenContextIsBindingDataObjectTypeAndResultIsNullAndResultIsNullAndNotCreate}, hash: 379ACB56FC0E563C81FEAFDE25DAC996
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
         *  A variable could not be isolated/mocked when calling a method - Variable name: context - Method: getSources
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
                verify(bindableMock, atLeast(1)).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
                verify(bindableMock, atLeast(3)).getType();
                verify(resolvableTypeMock).resolve(Object.class);
                verify(resolvableTypeMock2).isArray();
                verify(resolvableTypeMock3).resolve(Object.class);
                verify(bindableMock, atLeast(1)).getBindMethod();
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

    //Sapient generated method id: ${bind4WhenNON_BEAN_CLASSESNotContainsResolvedAndResolvedGetNameStartsWithJava_AndIsUnbindableBeanNameTargetContextAndRes}, hash: BB172B5502BB2FDA337CF97203837BB3
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
         *  A variable could not be isolated/mocked when calling a method - Variable name: context - Method: getSources
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
                verify(bindableMock, atLeast(1)).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
                verify(bindableMock, atLeast(3)).getType();
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

    //Sapient generated method id: ${bind4WhenIsUnbindableBeanNotNameTargetContextAndNotAllowRecursiveBindingAndContextNotIsBindingDataObjectTypeAndResultIs}, hash: 75AE70CEC233370879E984F0495AB231
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
         *  A variable could not be isolated/mocked when calling a method - Variable name: context - Method: getSources
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
                verify(bindableMock, atLeast(1)).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
                verify(bindableMock, atLeast(4)).getType();
                verify(resolvableTypeMock).resolve(Object.class);
                verify(resolvableTypeMock2).isArray();
                verify(resolvableTypeMock3).resolve(Object.class);
                verify(resolvableTypeMock4).resolve(Object.class);
                verify(bindableMock, atLeast(1)).getBindMethod();
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

    //Sapient generated method id: ${bindOrCreateTest}, hash: 9AE43CB574D713486AC054546F04B3CF
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

    //Sapient generated method id: ${bindOrCreate1Test}, hash: F748F90D3A8AC51E7947229B278E9B1D
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

    //Sapient generated method id: ${bindOrCreate2Test}, hash: 9193194E8B67C43BFC4F9131DD2FFC01
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

    //Sapient generated method id: ${bindOrCreate3WhenResultIsNull}, hash: D564F1F9F4FD8C0EDA4317B401AE571B
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
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ResolvableType resolvableTypeMock = mock(ResolvableType.class, "type");
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
            doReturn(BindMethod.JAVA_BEAN).when(targetMock).getBindMethod();
            doReturn(resolvableTypeMock).when(targetMock).getType();
            doReturn(null).when(handlerMock).onStart(eq(configurationPropertyNameMock), eq(targetMock), (BindContext) any());
            Object object = new Object();
            doReturn(object).when(handlerMock).onCreate(eq(configurationPropertyNameMock), eq(targetMock), (BindContext) any(), eq((Object) null));
            Object object2 = new Object();
            Exception exception = new Exception();
            doReturn(object2).when(handlerMock).onFailure(eq(configurationPropertyNameMock), eq(targetMock), (BindContext) any(), eq(exception));
            _assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
            bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
            _assert.when(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(targetMock, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
            Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
            //Act Statement(s)
            Object result = target.bindOrCreate(configurationPropertyNameMock, targetMock, handlerMock);
            //Assert statement(s)
            //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(targetMock, times(2)).getBindMethod();
                verify(targetMock).getType();
                verify(handlerMock).onStart(eq(configurationPropertyNameMock), eq(targetMock), (BindContext) any());
                verify(handlerMock).onCreate(eq(configurationPropertyNameMock), eq(targetMock), (BindContext) any(), eq((Object) null));
                verify(handlerMock).onFailure(eq(configurationPropertyNameMock), eq(targetMock), (BindContext) any(), eq(exception));
                _assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
                _assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
                bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
                _assert.verify(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(targetMock, "Target must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${bindOrCreate3WhenResultIsNotNull}, hash: BDC0783C34A50A94BC79F5EF57F8CB4F
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
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
            doReturn(BindMethod.JAVA_BEAN).when(targetMock).getBindMethod();
            doReturn(null).when(handlerMock).onStart(eq(configurationPropertyNameMock), eq(targetMock), (BindContext) any());
            Object object = new Object();
            doReturn(object).when(handlerMock).onCreate(eq(configurationPropertyNameMock), eq(targetMock), (BindContext) any(), eq((Object) null));
            Object object2 = new Object();
            doNothing().when(handlerMock).onFinish(eq(configurationPropertyNameMock), eq(targetMock), (BindContext) any(), eq(object2));
            _assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements")).thenAnswer((Answer<Void>) invocation -> null);
            bindConverter.when(() -> BindConverter.get(anyList(), eq(consumerMock))).thenReturn(bindConverterMock);
            _assert.when(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(targetMock, "Target must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
            Binder target = new Binder(iterable, placeholdersResolverMock, conversionServiceMock, consumerMock, bindHandlerMock, (BindConstructorProvider) null);
            //Act Statement(s)
            Object result = target.bindOrCreate(configurationPropertyNameMock, targetMock, handlerMock);
            //Assert statement(s)
            //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(targetMock).getBindMethod();
                verify(handlerMock).onStart(eq(configurationPropertyNameMock), eq(targetMock), (BindContext) any());
                verify(handlerMock).onCreate(eq(configurationPropertyNameMock), eq(targetMock), (BindContext) any(), eq((Object) null));
                verify(handlerMock).onFinish(eq(configurationPropertyNameMock), eq(targetMock), (BindContext) any(), eq(object2));
                _assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
                _assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
                bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
                _assert.verify(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(targetMock, "Target must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${bindOrCreate3WhenResultIsNullAndCreateAndResultIsNotNull}, hash: ADF8641C5C8C6895A1CF92BA2FEBD5A9
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
         *  A variable could not be isolated/mocked when calling a method - Variable name: context - Method: getSources
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
                verify(bindableMock, atLeast(1)).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
                verify(bindableMock, atLeast(1)).getBindMethod();
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

    //Sapient generated method id: ${bindOrCreate3WhenCreateAndResultIsNull}, hash: DE7EA60B59BBBC6DF44A13E6E423CCDB
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
         *  A variable could not be isolated/mocked when calling a method - Variable name: context - Method: getSources
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ResolvableType resolvableTypeMock2 = mock(ResolvableType.class, "resolvableType2");
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
                verify(bindableMock, atLeast(1)).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
                verify(bindableMock, atLeast(2)).getType();
                verify(resolvableTypeMock).resolve(Object.class);
                verify(bindableMock, atLeast(2)).getBindMethod();
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

    //Sapient generated method id: ${bindOrCreate3WhenAggregateBinderIsNotNullAndResultIsNullAndResultIsNullAndCreateAndResultIsNotNull}, hash: EA7CC17FBA1425A53EA798C5886CD279
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
         *  A variable could not be isolated/mocked when calling a method - Variable name: context - Method: getSources
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
                verify(bindableMock, atLeast(1)).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
                verify(bindableMock, atLeast(1)).getType();
                verify(resolvableTypeMock).resolve(Object.class);
                verify(bindableMock, atLeast(1)).getBindMethod();
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

    //Sapient generated method id: ${bindOrCreate3WhenPropertyIsNotNullAndResultIsNullAndResultIsNullAndCreateAndResultIsNotNull}, hash: A4E1EC8DC0F2BD436171AED714BECDAF
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
         *  A variable could not be isolated/mocked when calling a method - Variable name: context - Method: getSources
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
                verify(bindableMock, atLeast(1)).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
                verify(bindableMock, atLeast(2)).getType();
                verify(resolvableTypeMock).resolve(Object.class);
                verify(resolvableTypeMock2).isArray();
                verify(bindableMock, atLeast(1)).getBindMethod();
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

    //Sapient generated method id: ${bindOrCreate3WhenTargetGetTypeIsArrayAndAggregateBinderIsNotNullAndResultIsNullAndResultIsNullAndCreateAndResultIsNotNu}, hash: 1FFCCFA6488D6274A39BF66C1845C712
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
         *  A variable could not be isolated/mocked when calling a method - Variable name: context - Method: getSources
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
                verify(bindableMock, atLeast(1)).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
                verify(bindableMock, atLeast(2)).getType();
                verify(resolvableTypeMock).resolve(Object.class);
                verify(resolvableTypeMock2).isArray();
                verify(bindableMock, atLeast(1)).getBindMethod();
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

    //Sapient generated method id: ${bindOrCreate3WhenResolvedIsPrimitiveAndIsUnbindableBeanNameTargetContextAndResultIsNullAndResultIsNullAndCreateAndResul}, hash: FF99CCB56752D4D097AD5DA4751FC7E9
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
                verify(bindableMock, atLeast(3)).getType();
                verify(resolvableTypeMock, times(2)).resolve(Object.class);
                verify(resolvableTypeMock).isArray();
                verify(bindableMock, atLeast(1)).getBindMethod();
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

    //Sapient generated method id: ${bindOrCreate3WhenInstanceIsNull}, hash: D411DE8C1F6D9DB34954183782AA8820
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
         *  A variable could not be isolated/mocked when calling a method - Variable name: context - Method: getSources
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
                verify(bindableMock, atLeast(1)).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
                verify(bindableMock, atLeast(3)).getType();
                verify(resolvableTypeMock).resolve(Object.class);
                verify(resolvableTypeMock2).isArray();
                verify(resolvableTypeMock3).resolve(Object.class);
                verify(bindableMock, atLeast(1)).getBindMethod();
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

    //Sapient generated method id: ${bindOrCreate3WhenIsUnbindableBeanNameTargetContextAndInstanceIsNull}, hash: 7B80A474973B038396E6EA1D39421BDD
    @Disabled()
    @Test()
    void bindOrCreate3WhenIsUnbindableBeanNameTargetContextAndInstanceIsNull() throws Exception {
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
         * (for-each(context.getSources())) : false  #  inside isUnbindableBean method
         * (resolved.isPrimitive()) : false  #  inside isUnbindableBean method
         * (NON_BEAN_CLASSES.contains(resolved)) : false  #  inside isUnbindableBean method
         * (resolved.getName().startsWith("java.")) : true  #  inside isUnbindableBean method
         * (isUnbindableBean(name, target, context)) : true  #  inside bindDataObject method
         * (instance != null) : false  #  inside bindObject method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: context - Method: getSources
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
                verify(bindableMock, atLeast(1)).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
                verify(bindableMock, atLeast(3)).getType();
                verify(resolvableTypeMock).resolve(Object.class);
                verify(resolvableTypeMock2).isArray();
                verify(resolvableTypeMock3).resolve(Object.class);
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

    //Sapient generated method id: ${bindOrCreate3WhenIsUnbindableBeanNameTargetContextAndResultIsNullAndResultIsNullAndCreateAndResultIsNotNull5}, hash: D674861EDF6C36E733445C30A45E5255
    @Disabled()
    @Test()
    void bindOrCreate3WhenIsUnbindableBeanNameTargetContextAndResultIsNullAndResultIsNullAndCreateAndResultIsNotNull5() throws Exception {
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
         *  A variable could not be isolated/mocked when calling a method - Variable name: context - Method: getSources
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
                verify(bindableMock, atLeast(1)).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
                verify(bindableMock, atLeast(3)).getType();
                verify(resolvableTypeMock).resolve(Object.class);
                verify(resolvableTypeMock2).isArray();
                verify(resolvableTypeMock3).resolve(Object.class);
                verify(bindableMock, atLeast(1)).getBindMethod();
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

    //Sapient generated method id: ${bindOrCreate3WhenNotAllowRecursiveBindingAndContextNotIsBindingDataObjectTypeAndInstanceIsNull}, hash: 09CBF2EBA86FBC3128E2624B6E2F6218
    @Disabled()
    @Test()
    void bindOrCreate3WhenNotAllowRecursiveBindingAndContextNotIsBindingDataObjectTypeAndInstanceIsNull() throws Exception {
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
         * (for-each(context.getSources())) : false  #  inside isUnbindableBean method
         * (resolved.isPrimitive()) : false  #  inside isUnbindableBean method
         * (NON_BEAN_CLASSES.contains(resolved)) : false  #  inside isUnbindableBean method
         * (resolved.getName().startsWith("java.")) : false  #  inside isUnbindableBean method
         * (isUnbindableBean(name, target, context)) : false  #  inside bindDataObject method
         * (!allowRecursiveBinding) : true  #  inside bindDataObject method
         * (context.isBindingDataObject(type)) : false  #  inside bindDataObject method
         * (instance != null) : false  #  inside bindObject method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: context - Method: getSources
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
            doReturn(Object.class).when(resolvableTypeMock3).resolve(Object.class);
            doReturn(resolvableTypeMock, resolvableTypeMock2, resolvableTypeMock3, resolvableTypeMock4).when(bindableMock).getType();
            doReturn(Object.class).when(resolvableTypeMock4).resolve(Object.class);
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
                verify(bindableMock, atLeast(1)).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
                verify(bindableMock, atLeast(4)).getType();
                verify(resolvableTypeMock).resolve(Object.class);
                verify(resolvableTypeMock2).isArray();
                verify(resolvableTypeMock3).resolve(Object.class);
                verify(resolvableTypeMock4).resolve(Object.class);
                verify(bindableMock, atLeast(1)).getBindMethod();
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

    //Sapient generated method id: ${bindOrCreate3WhenIsUnbindableBeanNameTargetContextAndResultIsNullAndResultIsNullAndCreateAndResultIsNotNull7}, hash: 3EB394238B5526994B38375294179091
    @Disabled()
    @Test()
    void bindOrCreate3WhenIsUnbindableBeanNameTargetContextAndResultIsNullAndResultIsNullAndCreateAndResultIsNotNull7() throws Exception {
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
         *  A variable could not be isolated/mocked when calling a method - Variable name: context - Method: getSources
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
                verify(bindableMock, atLeast(1)).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
                verify(bindableMock, atLeast(3)).getType();
                verify(resolvableTypeMock).resolve(Object.class);
                verify(resolvableTypeMock2).isArray();
                verify(resolvableTypeMock3).resolve(Object.class);
                verify(bindableMock, atLeast(1)).getBindMethod();
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

    //Sapient generated method id: ${bindOrCreate3WhenContextIsBindingDataObjectTypeAndResultIsNullAndResultIsNullAndCreateAndResultIsNotNull}, hash: 9970D517799DC3CEC85A91D152DBC7B5
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
         *  A variable could not be isolated/mocked when calling a method - Variable name: context - Method: getSources
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
                verify(bindableMock, atLeast(1)).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
                verify(bindableMock, atLeast(3)).getType();
                verify(resolvableTypeMock).resolve(Object.class);
                verify(resolvableTypeMock2).isArray();
                verify(resolvableTypeMock3).resolve(Object.class);
                verify(bindableMock, atLeast(2)).getBindMethod();
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

    //Sapient generated method id: ${bindOrCreate3WhenResultIsNotNullAndResultIsNullAndCreateAndResultIsNull}, hash: 40090AD6044DAF81F1B25A7DAA5E450A
    @Disabled()
    @Test()
    void bindOrCreate3WhenResultIsNotNullAndResultIsNullAndCreateAndResultIsNull() throws Exception {
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
         * (result == null) : true  #  inside handleBindResult method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: context - Method: getSources
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ResolvableType resolvableTypeMock4 = mock(ResolvableType.class, "resolvableType4");
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<BindConverter> bindConverter = mockStatic(BindConverter.class)) {
            doReturn(false).when(nameMock).isEmpty();
            doReturn(bindableMock).when(handlerMock).onStart(eq(nameMock), eq(bindableMock2), (BindContext) any());
            doReturn(false).when(bindableMock).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
            doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
            doReturn(false).when(resolvableTypeMock2).isArray();
            doReturn(Object.class).when(resolvableTypeMock3).resolve(Object.class);
            doReturn(BindMethod.JAVA_BEAN).when(bindableMock).getBindMethod();
            doReturn(resolvableTypeMock, resolvableTypeMock2, resolvableTypeMock3, resolvableTypeMock4).when(bindableMock).getType();
            Object object = new Object();
            doReturn(object).when(handlerMock).onSuccess(eq(nameMock), eq(bindableMock), (BindContext) any(), (Object) any());
            Object object2 = new Object();
            doReturn(object2).when(handlerMock).onCreate(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
            Object object3 = new Object();
            Exception exception = new Exception();
            doReturn(object3).when(handlerMock).onFailure(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(exception));
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
                verify(bindableMock, atLeast(1)).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
                verify(bindableMock, atLeast(4)).getType();
                verify(resolvableTypeMock).resolve(Object.class);
                verify(resolvableTypeMock2).isArray();
                verify(resolvableTypeMock3).resolve(Object.class);
                verify(bindableMock, atLeast(3)).getBindMethod();
                verify(handlerMock).onSuccess(eq(nameMock), eq(bindableMock), (BindContext) any(), (Object) any());
                verify(handlerMock).onCreate(eq(nameMock), eq(bindableMock), (BindContext) any(), eq((Object) null));
                verify(handlerMock).onFailure(eq(nameMock), eq(bindableMock), (BindContext) any(), eq(exception));
                _assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
                _assert.verify(() -> Assert.notNull(configurationPropertySourceMock, "Sources must not contain null elements"), atLeast(1));
                bindConverter.verify(() -> BindConverter.get(anyList(), eq(consumerMock)));
                _assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(bindableMock2, "Target must not be null"), atLeast(1));
                verify(placeholdersResolverMock).resolvePlaceholders(object5);
            });
        }
    }

    //Sapient generated method id: ${bindOrCreate3WhenIsUnbindableBeanNameTargetContextAndResultIsNullAndResultIsNullAndCreateAndResultIsNotNull9}, hash: F1CC9BF5694A3CA7A5AD933B2B955A96
    @Disabled()
    @Test()
    void bindOrCreate3WhenIsUnbindableBeanNameTargetContextAndResultIsNullAndResultIsNullAndCreateAndResultIsNotNull9() throws Exception {
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
         *  A variable could not be isolated/mocked when calling a method - Variable name: context - Method: getSources
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
                verify(bindableMock, atLeast(1)).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
                verify(bindableMock, atLeast(3)).getType();
                verify(resolvableTypeMock).resolve(Object.class);
                verify(resolvableTypeMock2).isArray();
                verify(resolvableTypeMock3).resolve(Object.class);
                verify(bindableMock, atLeast(1)).getBindMethod();
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

    //Sapient generated method id: ${bindOrCreate3WhenContextNotIsBindingDataObjectTypeAndResultIsNullAndResultIsNullAndCreateAndResultIsNotNull2}, hash: CFDD1DB513232F4BB3EAEE7C67364A4D
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
         *  A variable could not be isolated/mocked when calling a method - Variable name: context - Method: getSources
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
                verify(bindableMock, atLeast(1)).hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
                verify(bindableMock, atLeast(4)).getType();
                verify(resolvableTypeMock).resolve(Object.class);
                verify(resolvableTypeMock2).isArray();
                verify(resolvableTypeMock3).resolve(Object.class);
                verify(resolvableTypeMock4).resolve(Object.class);
                verify(bindableMock, atLeast(2)).getBindMethod();
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

    //Sapient generated method id: ${getTest}, hash: 1F46AC662FAB78D24168002FAC0D8251
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

    //Sapient generated method id: ${get1WhenDefaultBranch}, hash: BF2C05B0CA807944597B122F740A90EE
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

    //Sapient generated method id: ${get1WhenDefaultBranchAndDefaultBranch}, hash: 9C90D3C0D52F75A1535B8B1FE925FE7F
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
