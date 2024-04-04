package org.springframework.boot.ssl.pem;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.security.PrivateKey;

import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PemPrivateKeyParserSapientGeneratedTest {

	//Sapient generated method id: ${3a1fa216-77d7-3552-a886-5cb34f671ab0}, hash: B73C79BF714B187C7281238BEAEBCCE2
	@Test()
	void parseTest() throws Exception {
		//Arrange Statement(s)
		PrivateKey privateKeyMock = mock(PrivateKey.class);
		try (MockedStatic<PemPrivateKeyParser> pemPrivateKeyParser = mockStatic(PemPrivateKeyParser.class, CALLS_REAL_METHODS)) {
			pemPrivateKeyParser.when(() -> PemPrivateKeyParser.parse("text1", (String) null)).thenReturn(privateKeyMock);
			//Act Statement(s)
			PrivateKey result = PemPrivateKeyParser.parse("text1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(privateKeyMock));
				pemPrivateKeyParser.verify(() -> PemPrivateKeyParser.parse("text1", (String) null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a49d431e-c201-3dbb-8fb6-b601fa7b3e67}, hash: 77E7E1B4DBFD29A0D5846F33701555E9
	@Test()
	void parse1WhenTextIsNull() throws Exception {
		/* Branches:
		 * (text == null) : true
		 */

		//Act Statement(s)
		PrivateKey result = PemPrivateKeyParser.parse((String) null, "password1");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${4a6b3772-32d1-36bb-aab7-2dac278a3789}, hash: 3D911C1D9546288AEE6D1B0E30CDEE56
	@Test()
	void parse1WhenPrivateKeyIsNotNull() throws Exception {
		/* Branches:
		 * (text == null) : false
		 * (for-each(PEM_PARSERS)) : true
		 * (privateKey != null) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: pemParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */

		//Act Statement(s)
		PrivateKey result = PemPrivateKeyParser.parse("text1", "password1");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${71a0da21-8bba-3e46-bda6-254edc812031}, hash: 7C10B15DCE6A4FE097C7FA5FCAEC058F
	@Test()
	void parse1WhenPrivateKeyIsNullThrowsIllegalStateException() {
		/* Branches:
		 * (text == null) : false
		 * (for-each(PEM_PARSERS)) : true
		 * (privateKey != null) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: pemParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		IllegalStateException illegalStateException = new IllegalStateException("Missing private key or unrecognized format");
		//Act Statement(s)
		final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
			PemPrivateKeyParser.parse("text1", "password1");
		});

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
		});
	}

	//Sapient generated method id: ${fbb07d47-f496-3e1d-9fa5-8f93eae2714a}, hash: D3D594D5D3EE1442B5DE48D05BEB69C8
	@Test()
	void parse1WhenCaughtExceptionThrowsIllegalStateException() {
		/* Branches:
		 * (text == null) : false
		 * (for-each(PEM_PARSERS)) : true
		 * (privateKey != null) : true
		 * (catch-exception (Exception)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: pemParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Exception exception = new Exception("A");
		IllegalStateException illegalStateException = new IllegalStateException("Error loading private key file: A", exception);
		//Act Statement(s)
		final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
			PemPrivateKeyParser.parse("text1", "password1");
		});

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
			assertThat(result.getCause(), is(instanceOf(exception.getClass())));
		});
	}

	//Sapient generated method id: ${5267e6f4-9987-354f-a396-e4a2c65b1ebc}, hash: FD7F7ECD891269A8CA448DD7A7D698CB
	@Test()
	void parse1WhenPEM_PARSERSIsNotEmptyAndPrivateKeyIsNullAndCaughtExceptionThrowsIllegalStateException() {
		/* Branches:
		 * (text == null) : false
		 * (for-each(PEM_PARSERS)) : true
		 * (privateKey != null) : false
		 * (catch-exception (Exception)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: pemParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Exception exception = new Exception("A");
		IllegalStateException illegalStateException = new IllegalStateException("Error loading private key file: A", exception);
		//Act Statement(s)
		final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
			PemPrivateKeyParser.parse("text1", "password1");
		});

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
			assertThat(result.getCause(), is(instanceOf(exception.getClass())));
		});
	}
}
