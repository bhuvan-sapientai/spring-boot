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
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PemPrivateKeyParserSapientGeneratedTest {

	//Sapient generated method id: ${3a1fa216-77d7-3552-a886-5cb34f671ab0}
	@Test()
	void parseTest() throws Exception {
		//Arrange Statement(s)
		try (MockedStatic<PemPrivateKeyParser> pemPrivateKeyParser = mockStatic(PemPrivateKeyParser.class, CALLS_REAL_METHODS)) {
			//TODO: Needs to return real value
			pemPrivateKeyParser.when(() -> PemPrivateKeyParser.parse("text1", (String) null)).thenReturn(null);
			//Act Statement(s)
			PrivateKey result = PemPrivateKeyParser.parse("text1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				pemPrivateKeyParser.verify(() -> PemPrivateKeyParser.parse("text1", (String) null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a49d431e-c201-3dbb-8fb6-b601fa7b3e67}
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

	//Sapient generated method id: ${4a6b3772-32d1-36bb-aab7-2dac278a3789}
	@Disabled()
	@Test()
	void parse1WhenPrivateKeyIsNotNull() throws Exception {
		/* Branches:
		 * (text == null) : false
		 * (for-each(PEM_PARSERS)) : true
		 * (privateKey != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Act Statement(s)
		PrivateKey result = PemPrivateKeyParser.parse("text1", "password1");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${71a0da21-8bba-3e46-bda6-254edc812031}
	@Test()
	void parse1WhenPrivateKeyIsNullThrowsIllegalStateException() {
		/* Branches:
		 * (text == null) : false
		 * (for-each(PEM_PARSERS)) : true
		 * (privateKey != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

	//Sapient generated method id: ${fbb07d47-f496-3e1d-9fa5-8f93eae2714a}
	@Disabled()
	@Test()
	void parse1WhenCaughtExceptionThrowsIllegalStateException() {
		/* Branches:
		 * (text == null) : false
		 * (for-each(PEM_PARSERS)) : true
		 * (privateKey != null) : true
		 * (catch-exception (Exception)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

	//Sapient generated method id: ${5267e6f4-9987-354f-a396-e4a2c65b1ebc}
	@Disabled()
	@Test()
	void parse1WhenPEM_PARSERSIsNotEmptyAndPrivateKeyIsNullAndCaughtExceptionThrowsIllegalStateException() {
		/* Branches:
		 * (text == null) : false
		 * (for-each(PEM_PARSERS)) : true
		 * (privateKey != null) : false
		 * (catch-exception (Exception)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
