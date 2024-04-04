package org.springframework.boot.ssl;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.util.function.Consumer;

import org.springframework.util.Assert;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DefaultSslBundleRegistrySapientGeneratedTest {

	private final SslBundle sslBundleMock = mock(SslBundle.class);

	private final SslBundle sslBundleMock2 = mock(SslBundle.class);

	//Sapient generated method id: ${e3c410d9-d4bb-32f5-b447-a7a5323d8bef}, hash: 0DEB19217A94625AEE8A8A148CACB515
	@Test()
	void registerBundleWhenPreviousIsNotNull() {
		/* Branches:
		 * (previous == null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.notNull(sslBundleMock, "Bundle must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			DefaultSslBundleRegistry target = new DefaultSslBundleRegistry("<value>", sslBundleMock);
			//Act Statement(s)
			target.registerBundle("<value>", sslBundleMock);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(sslBundleMock, "Bundle must not be null"), atLeast(2));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()), atLeast(1));
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${75f0eac1-f58b-3e5f-af9b-bc028e9caf0b}, hash: 9BBE2A2A43119FDD1E83B5C06D195937
	@Test()
	void updateBundleWhenRegisteredIsNullThrowsNoSuchSslBundleException() {
		/* Branches:
		 * (registered == null) : true  #  inside getRegistered method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("name1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(sslBundleMock, "Bundle must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull("object1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DefaultSslBundleRegistry target = new DefaultSslBundleRegistry("name1", sslBundleMock);
			//Act Statement(s)
			final NoSuchSslBundleException result = assertThrows(NoSuchSslBundleException.class, () -> {
				target.updateBundle((String) null, sslBundleMock2);
			});
			NoSuchSslBundleException noSuchSslBundleException = new NoSuchSslBundleException("object1", "message1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(noSuchSslBundleException.getMessage()));
				_assert.verify(() -> Assert.notNull("name1", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(sslBundleMock, "Bundle must not be null"), atLeast(1));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				_assert.verify(() -> Assert.notNull("object1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c69956e7-1872-3032-b042-cab3ea105759}, hash: 97EFEBB6FA7B31A044E02C898B5EBA33
	@Test()
	void updateBundleWhenRegisteredIsNotNull() {
		/* Branches:
		 * (registered == null) : false  #  inside getRegistered method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("name1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(sslBundleMock, "Bundle must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			DefaultSslBundleRegistry target = new DefaultSslBundleRegistry("name1", sslBundleMock);
			//Act Statement(s)
			target.updateBundle("name1", sslBundleMock2);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull("name1", "Name must not be null"), atLeast(2));
				_assert.verify(() -> Assert.notNull(sslBundleMock, "Bundle must not be null"), atLeast(1));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${508bc93c-92e9-3120-a844-f57ef080812a}, hash: DD3E34477A653FAC4228895B656322EF
	@Test()
	void getBundleWhenRegisteredIsNullThrowsNoSuchSslBundleException() {
		/* Branches:
		 * (registered == null) : true  #  inside getRegistered method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("name1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(sslBundleMock, "Bundle must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull("object1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DefaultSslBundleRegistry target = new DefaultSslBundleRegistry("name1", sslBundleMock);
			//Act Statement(s)
			final NoSuchSslBundleException result = assertThrows(NoSuchSslBundleException.class, () -> {
				target.getBundle((String) null);
			});
			NoSuchSslBundleException noSuchSslBundleException = new NoSuchSslBundleException("object1", "message1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(noSuchSslBundleException.getMessage()));
				_assert.verify(() -> Assert.notNull("name1", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(sslBundleMock, "Bundle must not be null"), atLeast(1));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				_assert.verify(() -> Assert.notNull("object1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${92edb1dd-3acb-3fe1-bcf2-11c66bd1f76f}, hash: 60013B3472840751207AA7A69D43DAC6
	@Test()
	void getBundleWhenRegisteredIsNotNull() {
		/* Branches:
		 * (registered == null) : false  #  inside getRegistered method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type DefaultSslBundleRegistry.RegisteredSslBundle
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SslBundle sslBundleMock = mock(SslBundle.class, "void");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			DefaultSslBundleRegistry target = new DefaultSslBundleRegistry("test", sslBundleMock);
			//Act Statement(s)
			SslBundle result = target.getBundle("test");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4385a955-e318-37fb-99db-5f5c0e5516de}, hash: FEEEFB800C6FD9EA7DA621D9B8620373
	@Test()
	void addBundleUpdateHandlerWhenRegisteredIsNullThrowsNoSuchSslBundleException() throws NoSuchSslBundleException {
		/* Branches:
		 * (registered == null) : true  #  inside getRegistered method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Consumer consumerMock = mock(Consumer.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("name1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(sslBundleMock, "Bundle must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull("object1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DefaultSslBundleRegistry target = new DefaultSslBundleRegistry("name1", sslBundleMock);
			//Act Statement(s)
			final NoSuchSslBundleException result = assertThrows(NoSuchSslBundleException.class, () -> {
				target.addBundleUpdateHandler((String) null, consumerMock);
			});
			NoSuchSslBundleException noSuchSslBundleException = new NoSuchSslBundleException("object1", "message1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(noSuchSslBundleException.getMessage()));
				_assert.verify(() -> Assert.notNull("name1", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(sslBundleMock, "Bundle must not be null"), atLeast(1));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				_assert.verify(() -> Assert.notNull("object1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${ece85af7-a8e4-3292-b758-3a88171a60d4}, hash: 247C7D8EAEA0DD5479B4B999F0089196
	@Test()
	void addBundleUpdateHandlerWhenRegisteredIsNotNull() throws NoSuchSslBundleException {
		/* Branches:
		 * (registered == null) : false  #  inside getRegistered method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type DefaultSslBundleRegistry.RegisteredSslBundle
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Consumer<SslBundle> consumerMock = mock(Consumer.class, "null");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.notNull(sslBundleMock, "Bundle must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			DefaultSslBundleRegistry target = new DefaultSslBundleRegistry("John", sslBundleMock);
			//Act Statement(s)
			target.addBundleUpdateHandler("John", consumerMock);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(sslBundleMock, "Bundle must not be null"), atLeast(1));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()), atLeast(1));
			});
		}
	}
}
