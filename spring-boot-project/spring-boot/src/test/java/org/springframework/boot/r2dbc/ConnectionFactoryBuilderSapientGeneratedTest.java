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

	//Sapient generated method id: ${ffeb5037-58aa-3d15-85b7-77a1b4911588}, hash: B5581E4269C5327CE75E3F4A2097B805
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

	//Sapient generated method id: ${d64c9949-b81d-3cde-b7f2-d2b60b5c6262}, hash: D569A17F463A58147544199D7B942822
	@Test()
	void withOptionsTest() {
		//Act Statement(s)
		ConnectionFactoryBuilder result = ConnectionFactoryBuilder.withOptions(connectionFactoryOptionsBuilderMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${8d4ba27e-c0df-39d6-a6a2-b297e2c16758}, hash: FDED793A698516C74CECB7073EDF8CA3
	@Test()
	void derivedFromWhenOptionsIsNullThrowsIllegalArgumentException() {
		/* Branches:
		 * (optionsCapable != null) : true  #  inside extractOptionsIfPossible method
		 * (options == null) : true
		 */
		//Arrange Statement(s)
		ConnectionFactory connectionFactoryMock2 = mock(ConnectionFactory.class, "derivedFrom_connectionFactory1");
		try (MockedStatic<OptionsCapableConnectionFactory> optionsCapableConnectionFactory = mockStatic(OptionsCapableConnectionFactory.class)) {
			OptionsCapableConnectionFactory optionsCapableConnectionFactory2 = new OptionsCapableConnectionFactory((ConnectionFactoryOptions) null, connectionFactoryMock);
			optionsCapableConnectionFactory.when(() -> OptionsCapableConnectionFactory.unwrapFrom(connectionFactoryMock2)).thenReturn(optionsCapableConnectionFactory2);
			//Act Statement(s)
			final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
				ConnectionFactoryBuilder.derivedFrom(connectionFactoryMock2);
			});
			IllegalArgumentException illegalArgumentException = new IllegalArgumentException("ConnectionFactoryOptions could not be extracted from derivedFrom_connectionFactory1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
				optionsCapableConnectionFactory.verify(() -> OptionsCapableConnectionFactory.unwrapFrom(connectionFactoryMock2), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3068e138-838e-3d6e-91a9-2c905c8bc31f}, hash: 114D9323BCC471338FAF0066028071FF
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

	//Sapient generated method id: ${fbca97d5-3926-3284-9631-f45681f7a0fa}, hash: 0E2E5AE6D1FD45D6BE0C60E6A50B22BF
	@Test()
	void derivedFromWhenOptionsCapableIsNullAndOptionsIsNullThrowsIllegalArgumentException() {
		/* Branches:
		 * (optionsCapable != null) : false  #  inside extractOptionsIfPossible method
		 * (options == null) : true
		 */
		//Arrange Statement(s)
		ConnectionFactory connectionFactoryMock = mock(ConnectionFactory.class, "derivedFrom_connectionFactory1");
		try (MockedStatic<OptionsCapableConnectionFactory> optionsCapableConnectionFactory = mockStatic(OptionsCapableConnectionFactory.class)) {
			optionsCapableConnectionFactory.when(() -> OptionsCapableConnectionFactory.unwrapFrom(connectionFactoryMock)).thenReturn(null);
			//Act Statement(s)
			final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
				ConnectionFactoryBuilder.derivedFrom(connectionFactoryMock);
			});
			IllegalArgumentException illegalArgumentException = new IllegalArgumentException("ConnectionFactoryOptions could not be extracted from derivedFrom_connectionFactory1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
				optionsCapableConnectionFactory.verify(() -> OptionsCapableConnectionFactory.unwrapFrom(connectionFactoryMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f56d41b4-cf00-3592-bb68-9a89456c3c5f}, hash: 8F9D6CFB99E750DB56393F972F375972
	@Disabled()
	@Test()
	void configureTest() {
		//Arrange Statement(s)
		Consumer optionsMock = mock(Consumer.class, "ConnectionFactoryOptions");
		try (MockedStatic<ConnectionFactoryBuilder> connectionFactoryBuilder = mockStatic(ConnectionFactoryBuilder.class);
			 MockedStatic<ConnectionFactoryOptions> connectionFactoryOptions = mockStatic(ConnectionFactoryOptions.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doNothing().when(optionsMock).accept((ConnectionFactoryOptions.Builder) null);
			_assert.when(() -> Assert.hasText(eq("String"), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			connectionFactoryOptions.when(() -> ConnectionFactoryOptions.parse("String")).thenReturn(connectionFactoryOptionsMock);
			doReturn(connectionFactoryOptionsBuilderMock).when(connectionFactoryOptionsMock).mutate();
			connectionFactoryBuilder.when(() -> ConnectionFactoryBuilder.withOptions(connectionFactoryOptionsBuilderMock)).thenReturn(connectionFactoryBuilderMock);
			ConnectionFactoryBuilder target = ConnectionFactoryBuilder.withUrl("String");
			//Act Statement(s)
			ConnectionFactoryBuilder result = target.configure(optionsMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(target));
				verify(optionsMock).accept((ConnectionFactoryOptions.Builder) null);
				_assert.verify(() -> Assert.hasText(eq("String"), (Supplier) any()));
				connectionFactoryOptions.verify(() -> ConnectionFactoryOptions.parse("String"), atLeast(1));
				verify(connectionFactoryOptionsMock).mutate();
				connectionFactoryBuilder.verify(() -> ConnectionFactoryBuilder.withOptions(connectionFactoryOptionsBuilderMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${d54505ca-3109-3075-a64f-88e8e8cc512e}, hash: 1E3AD2108CF83AEF1A688E899AB09AB9
	@Disabled()
	@Test()
	void usernameTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: options - Method: accept
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

	//Sapient generated method id: ${899b6ea8-9c20-314d-8577-61ec64186c46}, hash: D021077DE6B090C78BEE7D4BC5DC013A
	@Disabled()
	@Test()
	void passwordTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: options - Method: accept
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
			ConnectionFactoryBuilder result = target.password("password_charSequence1");
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

	//Sapient generated method id: ${394a5b4b-a81c-32e5-a50d-fb551a21e859}, hash: B41647B79AA44CECEEE004A4035E752A
	@Disabled()
	@Test()
	void hostnameTest() {
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
			ConnectionFactoryBuilder result = target.hostname("host1");
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

	//Sapient generated method id: ${4b22df10-a8c1-3a60-a0e1-afa6700edc07}, hash: 5C46B1AC36A8AC7EE159A12F90DC33CD
	@Disabled()
	@Test()
	void portTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: options - Method: accept
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
			ConnectionFactoryBuilder result = target.port(0);
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

	//Sapient generated method id: ${86964bde-330e-3613-92e1-338ea5306909}, hash: 18B117F53E96B4F0D9D2640BD9C50314
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

	//Sapient generated method id: ${9c52951b-3694-339a-bc67-eabb104eb353}, hash: 3558064F22B54CF0664559E718206927
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

	//Sapient generated method id: ${c8934ae0-763c-3cf8-be7a-39d7180272be}, hash: 20A1FCCF88F4089DC6FCCE5C5609BA92
	@Disabled()
	@Test()
	void decoratorsWhenDecoratorsIsNotEmpty() {
		/* Branches:
		 * (for-each(decorators)) : true
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

	//Sapient generated method id: ${e6eb5136-02b5-3010-926c-78db404cbce4}, hash: A9617D1C555026608CAA03386D461448
	@Disabled()
	@Test()
	void buildWhenThisDecoratorsIsNotEmpty() {
		/* Branches:
		 * (for-each(this.decorators)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: optionsCapableWrapper
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

	//Sapient generated method id: ${a1ddccdc-aa65-33ec-ba22-32117f1bd32f}, hash: 566EED366ABAB9B24D8BB68E71999C3F
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
