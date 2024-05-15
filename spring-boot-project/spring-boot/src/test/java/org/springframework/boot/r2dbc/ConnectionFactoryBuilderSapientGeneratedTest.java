package org.springframework.boot.r2dbc;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.mockito.stubbing.Answer;
import io.r2dbc.spi.ConnectionFactoryOptions;
import org.springframework.util.Assert;
import java.util.function.Supplier;
import org.mockito.MockedStatic;
import java.util.ArrayList;
import java.util.function.Consumer;
import io.r2dbc.spi.ConnectionFactory;
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
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConnectionFactoryBuilderSapientGeneratedTest {

    private final ConnectionFactoryOptions.Builder optionsBuilderMock = mock(ConnectionFactoryOptions.Builder.class, "optionsBuilder");

    private final ConnectionFactoryBuilder connectionFactoryBuilderMock = mock(ConnectionFactoryBuilder.class);

    private final ConnectionFactoryBuilder connectionFactoryBuilderMock2 = mock(ConnectionFactoryBuilder.class);

    private final ConnectionFactoryDecorator connectionFactoryDecoratorMock = mock(ConnectionFactoryDecorator.class);

    private final ConnectionFactory connectionFactoryMock = mock(ConnectionFactory.class);

    private final ConnectionFactoryOptions.Builder connectionFactoryOptionsBuilderMock = mock(ConnectionFactoryOptions.Builder.class);

    private final ConnectionFactoryOptions connectionFactoryOptionsMock = mock(ConnectionFactoryOptions.class);

    private final ConnectionFactoryOptions connectionFactoryOptionsMock2 = mock(ConnectionFactoryOptions.class);

    //Sapient generated method id: ${withUrlTest}, hash: B5581E4269C5327CE75E3F4A2097B805
    @Test()
    void withUrlTest() {
        //Arrange Statement(s)
        try (MockedStatic<ConnectionFactoryBuilder> connectionFactoryBuilder = mockStatic(ConnectionFactoryBuilder.class, CALLS_REAL_METHODS);
            MockedStatic<ConnectionFactoryOptions> connectionFactoryOptions = mockStatic(ConnectionFactoryOptions.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText(eq("url1"), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            connectionFactoryOptions.when(() -> ConnectionFactoryOptions.parse("url1")).thenReturn(connectionFactoryOptionsMock);
            doReturn(connectionFactoryOptionsBuilderMock).when(connectionFactoryOptionsMock).mutate();
            connectionFactoryBuilder.when(() -> ConnectionFactoryBuilder.withOptions(connectionFactoryOptionsBuilderMock)).thenReturn(connectionFactoryBuilderMock);
            //Act Statement(s)
            ConnectionFactoryBuilder result = ConnectionFactoryBuilder.withUrl("url1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(connectionFactoryBuilderMock));
                _assert.verify(() -> Assert.hasText(eq("url1"), (Supplier) any()), atLeast(1));
                connectionFactoryOptions.verify(() -> ConnectionFactoryOptions.parse("url1"), atLeast(1));
                verify(connectionFactoryOptionsMock, atLeast(1)).mutate();
                connectionFactoryBuilder.verify(() -> ConnectionFactoryBuilder.withOptions(connectionFactoryOptionsBuilderMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${withOptionsTest}, hash: D569A17F463A58147544199D7B942822
    @Test()
    void withOptionsTest() {
        //Act Statement(s)
        ConnectionFactoryBuilder result = ConnectionFactoryBuilder.withOptions(connectionFactoryOptionsBuilderMock);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${derivedFromWhenOptionsIsNullThrowsIllegalArgumentException}, hash: C66A11906676A9498A6556C4CC71107B
    @Test()
    void derivedFromWhenOptionsIsNullThrowsIllegalArgumentException() {
        /* Branches:
         * (optionsCapable != null) : true  #  inside extractOptionsIfPossible method
         * (options == null) : true
         */
        //Arrange Statement(s)
        ConnectionFactory connectionFactoryMock2 = mock(ConnectionFactory.class, "connectionFactory");
        try (MockedStatic<OptionsCapableConnectionFactory> optionsCapableConnectionFactory = mockStatic(OptionsCapableConnectionFactory.class)) {
            OptionsCapableConnectionFactory optionsCapableConnectionFactory2 = new OptionsCapableConnectionFactory((ConnectionFactoryOptions) null, connectionFactoryMock);
            optionsCapableConnectionFactory.when(() -> OptionsCapableConnectionFactory.unwrapFrom(connectionFactoryMock2)).thenReturn(optionsCapableConnectionFactory2);
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                ConnectionFactoryBuilder.derivedFrom(connectionFactoryMock2);
            });
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("ConnectionFactoryOptions could not be extracted from connectionFactory");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
                optionsCapableConnectionFactory.verify(() -> OptionsCapableConnectionFactory.unwrapFrom(connectionFactoryMock2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${derivedFromWhenOptionsIsNotNull}, hash: 114D9323BCC471338FAF0066028071FF
    @Test()
    void derivedFromWhenOptionsIsNotNull() {
        /* Branches:
         * (optionsCapable != null) : true  #  inside extractOptionsIfPossible method
         * (options == null) : false
         */
        //Arrange Statement(s)
        ConnectionFactory connectionFactoryMock2 = mock(ConnectionFactory.class);
        try (MockedStatic<ConnectionFactoryBuilder> connectionFactoryBuilder = mockStatic(ConnectionFactoryBuilder.class, CALLS_REAL_METHODS);
            MockedStatic<OptionsCapableConnectionFactory> optionsCapableConnectionFactory = mockStatic(OptionsCapableConnectionFactory.class)) {
            OptionsCapableConnectionFactory optionsCapableConnectionFactory2 = new OptionsCapableConnectionFactory(connectionFactoryOptionsMock, connectionFactoryMock);
            optionsCapableConnectionFactory.when(() -> OptionsCapableConnectionFactory.unwrapFrom(connectionFactoryMock2)).thenReturn(optionsCapableConnectionFactory2);
            doReturn(connectionFactoryOptionsBuilderMock).when(connectionFactoryOptionsMock).mutate();
            connectionFactoryBuilder.when(() -> ConnectionFactoryBuilder.withOptions(connectionFactoryOptionsBuilderMock)).thenReturn(connectionFactoryBuilderMock);
            //Act Statement(s)
            ConnectionFactoryBuilder result = ConnectionFactoryBuilder.derivedFrom(connectionFactoryMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(connectionFactoryBuilderMock));
                optionsCapableConnectionFactory.verify(() -> OptionsCapableConnectionFactory.unwrapFrom(connectionFactoryMock2), atLeast(1));
                verify(connectionFactoryOptionsMock, atLeast(1)).mutate();
                connectionFactoryBuilder.verify(() -> ConnectionFactoryBuilder.withOptions(connectionFactoryOptionsBuilderMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${derivedFromWhenOptionsCapableIsNullAndOptionsIsNullThrowsIllegalArgumentException}, hash: 551366CC0140088890D62CC3AB80EB15
    @Test()
    void derivedFromWhenOptionsCapableIsNullAndOptionsIsNullThrowsIllegalArgumentException() {
        /* Branches:
         * (optionsCapable != null) : false  #  inside extractOptionsIfPossible method
         * (options == null) : true
         */
        //Arrange Statement(s)
        ConnectionFactory connectionFactoryMock = mock(ConnectionFactory.class, "connectionFactory");
        try (MockedStatic<OptionsCapableConnectionFactory> optionsCapableConnectionFactory = mockStatic(OptionsCapableConnectionFactory.class)) {
            optionsCapableConnectionFactory.when(() -> OptionsCapableConnectionFactory.unwrapFrom(connectionFactoryMock)).thenReturn(null);
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                ConnectionFactoryBuilder.derivedFrom(connectionFactoryMock);
            });
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("ConnectionFactoryOptions could not be extracted from connectionFactory");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
                optionsCapableConnectionFactory.verify(() -> OptionsCapableConnectionFactory.unwrapFrom(connectionFactoryMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${configureTest}, hash: 2803486BAFA1F38BF266E56966FC958B
    @Disabled()
    @Test()
    void configureTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Consumer consumerMock = mock(Consumer.class);
        try (MockedStatic<ConnectionFactoryBuilder> connectionFactoryBuilder = mockStatic(ConnectionFactoryBuilder.class);
            MockedStatic<ConnectionFactoryOptions> connectionFactoryOptions = mockStatic(ConnectionFactoryOptions.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText(eq("url1"), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            connectionFactoryOptions.when(() -> ConnectionFactoryOptions.parse("url1")).thenReturn(connectionFactoryOptionsMock);
            doReturn(connectionFactoryOptionsBuilderMock).when(connectionFactoryOptionsMock).mutate();
            connectionFactoryBuilder.when(() -> ConnectionFactoryBuilder.withOptions(connectionFactoryOptionsBuilderMock)).thenReturn(connectionFactoryBuilderMock);
            ConnectionFactoryBuilder target = ConnectionFactoryBuilder.withUrl("url1");
            //Act Statement(s)
            ConnectionFactoryBuilder result = target.configure(consumerMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(target));
                _assert.verify(() -> Assert.hasText(eq("url1"), (Supplier) any()));
                connectionFactoryOptions.verify(() -> ConnectionFactoryOptions.parse("url1"), atLeast(1));
                verify(connectionFactoryOptionsMock).mutate();
                connectionFactoryBuilder.verify(() -> ConnectionFactoryBuilder.withOptions(connectionFactoryOptionsBuilderMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${usernameTest}, hash: 1E3AD2108CF83AEF1A688E899AB09AB9
    @Disabled()
    @Test()
    void usernameTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: options - Method: accept
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConnectionFactoryBuilder> connectionFactoryBuilder = mockStatic(ConnectionFactoryBuilder.class);
            MockedStatic<ConnectionFactoryOptions> connectionFactoryOptions = mockStatic(ConnectionFactoryOptions.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText(eq("url1"), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            connectionFactoryOptions.when(() -> ConnectionFactoryOptions.parse("url1")).thenReturn(connectionFactoryOptionsMock);
            doReturn(connectionFactoryOptionsBuilderMock).when(connectionFactoryOptionsMock).mutate();
            connectionFactoryBuilder.when(() -> ConnectionFactoryBuilder.withOptions(connectionFactoryOptionsBuilderMock)).thenReturn(connectionFactoryBuilderMock);
            ConnectionFactoryBuilder target = ConnectionFactoryBuilder.withUrl("url1");
            //Act Statement(s)
            ConnectionFactoryBuilder result = target.username("username1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(target));
                _assert.verify(() -> Assert.hasText(eq("url1"), (Supplier) any()));
                connectionFactoryOptions.verify(() -> ConnectionFactoryOptions.parse("url1"), atLeast(1));
                verify(connectionFactoryOptionsMock).mutate();
                connectionFactoryBuilder.verify(() -> ConnectionFactoryBuilder.withOptions(connectionFactoryOptionsBuilderMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${passwordTest}, hash: E61225935792ED05FB169F66210D6C4C
    @Disabled()
    @Test()
    void passwordTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: options - Method: accept
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConnectionFactoryBuilder> connectionFactoryBuilder = mockStatic(ConnectionFactoryBuilder.class);
            MockedStatic<ConnectionFactoryOptions> connectionFactoryOptions = mockStatic(ConnectionFactoryOptions.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText(eq("url1"), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            connectionFactoryOptions.when(() -> ConnectionFactoryOptions.parse("url1")).thenReturn(connectionFactoryOptionsMock);
            doReturn(connectionFactoryOptionsBuilderMock).when(connectionFactoryOptionsMock).mutate();
            connectionFactoryBuilder.when(() -> ConnectionFactoryBuilder.withOptions(connectionFactoryOptionsBuilderMock)).thenReturn(connectionFactoryBuilderMock);
            ConnectionFactoryBuilder target = ConnectionFactoryBuilder.withUrl("url1");
            //Act Statement(s)
            ConnectionFactoryBuilder result = target.password("password1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(target));
                _assert.verify(() -> Assert.hasText(eq("url1"), (Supplier) any()));
                connectionFactoryOptions.verify(() -> ConnectionFactoryOptions.parse("url1"), atLeast(1));
                verify(connectionFactoryOptionsMock).mutate();
                connectionFactoryBuilder.verify(() -> ConnectionFactoryBuilder.withOptions(connectionFactoryOptionsBuilderMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${hostnameTest}, hash: 4F34847CBCD7AE4BC3D2326D5789B68A
    @Disabled()
    @Test()
    void hostnameTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: options - Method: accept
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConnectionFactoryBuilder> connectionFactoryBuilder = mockStatic(ConnectionFactoryBuilder.class);
            MockedStatic<ConnectionFactoryOptions> connectionFactoryOptions = mockStatic(ConnectionFactoryOptions.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText(eq("url1"), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            connectionFactoryOptions.when(() -> ConnectionFactoryOptions.parse("url1")).thenReturn(connectionFactoryOptionsMock);
            doReturn(connectionFactoryOptionsBuilderMock).when(connectionFactoryOptionsMock).mutate();
            connectionFactoryBuilder.when(() -> ConnectionFactoryBuilder.withOptions(connectionFactoryOptionsBuilderMock)).thenReturn(connectionFactoryBuilderMock);
            ConnectionFactoryBuilder target = ConnectionFactoryBuilder.withUrl("url1");
            //Act Statement(s)
            ConnectionFactoryBuilder result = target.hostname("host1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(target));
                _assert.verify(() -> Assert.hasText(eq("url1"), (Supplier) any()));
                connectionFactoryOptions.verify(() -> ConnectionFactoryOptions.parse("url1"), atLeast(1));
                verify(connectionFactoryOptionsMock).mutate();
                connectionFactoryBuilder.verify(() -> ConnectionFactoryBuilder.withOptions(connectionFactoryOptionsBuilderMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${portTest}, hash: B07828066B9796FF7B19AC60BA20F4CA
    @Disabled()
    @Test()
    void portTest() {
        //Arrange Statement(s)
        try (MockedStatic<ConnectionFactoryBuilder> connectionFactoryBuilder = mockStatic(ConnectionFactoryBuilder.class);
            MockedStatic<ConnectionFactoryOptions> connectionFactoryOptions = mockStatic(ConnectionFactoryOptions.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText(eq("url1"), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            connectionFactoryOptions.when(() -> ConnectionFactoryOptions.parse("url1")).thenReturn(connectionFactoryOptionsMock);
            doReturn(connectionFactoryOptionsBuilderMock).when(connectionFactoryOptionsMock).mutate();
            connectionFactoryBuilder.when(() -> ConnectionFactoryBuilder.withOptions(connectionFactoryOptionsBuilderMock)).thenReturn(connectionFactoryBuilderMock);
            ConnectionFactoryBuilder target = spy(ConnectionFactoryBuilder.withUrl("url1"));
            doReturn(connectionFactoryBuilderMock2).when(target).configure((Consumer) any());
            //Act Statement(s)
            ConnectionFactoryBuilder result = target.port(0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(connectionFactoryBuilderMock2));
                _assert.verify(() -> Assert.hasText(eq("url1"), (Supplier) any()));
                connectionFactoryOptions.verify(() -> ConnectionFactoryOptions.parse("url1"), atLeast(1));
                verify(connectionFactoryOptionsMock).mutate();
                connectionFactoryBuilder.verify(() -> ConnectionFactoryBuilder.withOptions(connectionFactoryOptionsBuilderMock), atLeast(1));
                verify(target).configure((Consumer) any());
            });
        }
    }

    //Sapient generated method id: ${databaseTest}, hash: 18B117F53E96B4F0D9D2640BD9C50314
    @Disabled()
    @Test()
    void databaseTest() {
        //Arrange Statement(s)
        try (MockedStatic<ConnectionFactoryBuilder> connectionFactoryBuilder = mockStatic(ConnectionFactoryBuilder.class);
            MockedStatic<ConnectionFactoryOptions> connectionFactoryOptions = mockStatic(ConnectionFactoryOptions.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText(eq("url1"), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            connectionFactoryOptions.when(() -> ConnectionFactoryOptions.parse("url1")).thenReturn(connectionFactoryOptionsMock);
            doReturn(connectionFactoryOptionsBuilderMock).when(connectionFactoryOptionsMock).mutate();
            connectionFactoryBuilder.when(() -> ConnectionFactoryBuilder.withOptions(connectionFactoryOptionsBuilderMock)).thenReturn(connectionFactoryBuilderMock);
            ConnectionFactoryBuilder target = spy(ConnectionFactoryBuilder.withUrl("url1"));
            doReturn(connectionFactoryBuilderMock2).when(target).configure((Consumer) any());
            //Act Statement(s)
            ConnectionFactoryBuilder result = target.database("database1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(connectionFactoryBuilderMock2));
                _assert.verify(() -> Assert.hasText(eq("url1"), (Supplier) any()));
                connectionFactoryOptions.verify(() -> ConnectionFactoryOptions.parse("url1"), atLeast(1));
                verify(connectionFactoryOptionsMock).mutate();
                connectionFactoryBuilder.verify(() -> ConnectionFactoryBuilder.withOptions(connectionFactoryOptionsBuilderMock), atLeast(1));
                verify(target).configure((Consumer) any());
            });
        }
    }

    //Sapient generated method id: ${decoratorTest}, hash: 3558064F22B54CF0664559E718206927
    @Disabled()
    @Test()
    void decoratorTest() {
        //Arrange Statement(s)
        try (MockedStatic<ConnectionFactoryBuilder> connectionFactoryBuilder = mockStatic(ConnectionFactoryBuilder.class);
            MockedStatic<ConnectionFactoryOptions> connectionFactoryOptions = mockStatic(ConnectionFactoryOptions.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText(eq("url1"), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            connectionFactoryOptions.when(() -> ConnectionFactoryOptions.parse("url1")).thenReturn(connectionFactoryOptionsMock);
            doReturn(connectionFactoryOptionsBuilderMock).when(connectionFactoryOptionsMock).mutate();
            connectionFactoryBuilder.when(() -> ConnectionFactoryBuilder.withOptions(connectionFactoryOptionsBuilderMock)).thenReturn(connectionFactoryBuilderMock);
            ConnectionFactoryBuilder target = ConnectionFactoryBuilder.withUrl("url1");
            //Act Statement(s)
            ConnectionFactoryBuilder result = target.decorator(connectionFactoryDecoratorMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(target));
                _assert.verify(() -> Assert.hasText(eq("url1"), (Supplier) any()));
                connectionFactoryOptions.verify(() -> ConnectionFactoryOptions.parse("url1"), atLeast(1));
                verify(connectionFactoryOptionsMock).mutate();
                connectionFactoryBuilder.verify(() -> ConnectionFactoryBuilder.withOptions(connectionFactoryOptionsBuilderMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${decoratorsWhenDecoratorsIsNotEmpty}, hash: 20A1FCCF88F4089DC6FCCE5C5609BA92
    @Disabled()
    @Test()
    void decoratorsWhenDecoratorsIsNotEmpty() {
        /* Branches:
         * (for-each(decorators)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConnectionFactoryBuilder> connectionFactoryBuilder = mockStatic(ConnectionFactoryBuilder.class);
            MockedStatic<ConnectionFactoryOptions> connectionFactoryOptions = mockStatic(ConnectionFactoryOptions.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText(eq("url1"), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            connectionFactoryOptions.when(() -> ConnectionFactoryOptions.parse("url1")).thenReturn(connectionFactoryOptionsMock);
            doReturn(connectionFactoryOptionsBuilderMock).when(connectionFactoryOptionsMock).mutate();
            connectionFactoryBuilder.when(() -> ConnectionFactoryBuilder.withOptions(connectionFactoryOptionsBuilderMock)).thenReturn(connectionFactoryBuilderMock);
            ConnectionFactoryBuilder target = ConnectionFactoryBuilder.withUrl("url1");
            Iterable<ConnectionFactoryDecorator> iterable = new ArrayList<>(List.of(connectionFactoryDecoratorMock));
            //Act Statement(s)
            ConnectionFactoryBuilder result = target.decorators(iterable);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(target));
                _assert.verify(() -> Assert.hasText(eq("url1"), (Supplier) any()));
                connectionFactoryOptions.verify(() -> ConnectionFactoryOptions.parse("url1"), atLeast(1));
                verify(connectionFactoryOptionsMock).mutate();
                connectionFactoryBuilder.verify(() -> ConnectionFactoryBuilder.withOptions(connectionFactoryOptionsBuilderMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${buildWhenThisDecoratorsIsNotEmpty}, hash: A9617D1C555026608CAA03386D461448
    @Disabled()
    @Test()
    void buildWhenThisDecoratorsIsNotEmpty() {
        /* Branches:
         * (for-each(this.decorators)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: optionsCapableWrapper - Method: buildAndWrap
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConnectionFactoryBuilder> connectionFactoryBuilder = mockStatic(ConnectionFactoryBuilder.class);
            MockedStatic<ConnectionFactoryOptions> connectionFactoryOptions = mockStatic(ConnectionFactoryOptions.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText(eq("url1"), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            connectionFactoryOptions.when(() -> ConnectionFactoryOptions.parse("url1")).thenReturn(connectionFactoryOptionsMock);
            doReturn(connectionFactoryOptionsBuilderMock).when(connectionFactoryOptionsMock).mutate();
            connectionFactoryBuilder.when(() -> ConnectionFactoryBuilder.withOptions(connectionFactoryOptionsBuilderMock)).thenReturn(connectionFactoryBuilderMock);
            ConnectionFactoryBuilder target = ConnectionFactoryBuilder.withUrl("url1");
            doReturn(connectionFactoryOptionsMock2).when(optionsBuilderMock).build();
            //Act Statement(s)
            ConnectionFactory result = target.build();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.hasText(eq("url1"), (Supplier) any()));
                connectionFactoryOptions.verify(() -> ConnectionFactoryOptions.parse("url1"), atLeast(1));
                verify(connectionFactoryOptionsMock).mutate();
                connectionFactoryBuilder.verify(() -> ConnectionFactoryBuilder.withOptions(connectionFactoryOptionsBuilderMock), atLeast(1));
                verify(optionsBuilderMock).build();
            });
        }
    }

    //Sapient generated method id: ${buildOptionsTest}, hash: 566EED366ABAB9B24D8BB68E71999C3F
    @Disabled()
    @Test()
    void buildOptionsTest() {
        //Arrange Statement(s)
        try (MockedStatic<ConnectionFactoryBuilder> connectionFactoryBuilder = mockStatic(ConnectionFactoryBuilder.class);
            MockedStatic<ConnectionFactoryOptions> connectionFactoryOptions = mockStatic(ConnectionFactoryOptions.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText(eq("url1"), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            connectionFactoryOptions.when(() -> ConnectionFactoryOptions.parse("url1")).thenReturn(connectionFactoryOptionsMock);
            doReturn(connectionFactoryOptionsBuilderMock).when(connectionFactoryOptionsMock).mutate();
            connectionFactoryBuilder.when(() -> ConnectionFactoryBuilder.withOptions(connectionFactoryOptionsBuilderMock)).thenReturn(connectionFactoryBuilderMock);
            ConnectionFactoryBuilder target = ConnectionFactoryBuilder.withUrl("url1");
            doReturn(connectionFactoryOptionsMock2).when(optionsBuilderMock).build();
            //Act Statement(s)
            ConnectionFactoryOptions result = target.buildOptions();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(connectionFactoryOptionsMock2));
                _assert.verify(() -> Assert.hasText(eq("url1"), (Supplier) any()));
                connectionFactoryOptions.verify(() -> ConnectionFactoryOptions.parse("url1"), atLeast(1));
                verify(connectionFactoryOptionsMock).mutate();
                connectionFactoryBuilder.verify(() -> ConnectionFactoryBuilder.withOptions(connectionFactoryOptionsBuilderMock), atLeast(1));
                verify(optionsBuilderMock).build();
            });
        }
    }
}
