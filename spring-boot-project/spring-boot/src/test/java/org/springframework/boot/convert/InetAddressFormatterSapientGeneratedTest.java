package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.net.UnknownHostException;
import java.net.InetAddress;

import org.mockito.MockedStatic;

import java.util.Locale;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class InetAddressFormatterSapientGeneratedTest {

	//Sapient generated method id: ${4be23dda-8ff3-3c4c-9e48-c9e760f75759}, hash: 73B69B9F35E7DA5CBE0CFBDC50886998
	@Test()
	void printTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		InetAddressFormatter target = new InetAddressFormatter();
		InetAddress inetAddress = InetAddress.getLoopbackAddress();
		Locale locale = new Locale("language1");

		//Act Statement(s)
		String result = target.print(inetAddress, locale);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("result1")));
	}

	//Sapient generated method id: ${3a1fa216-77d7-3552-a886-5cb34f671ab0}, hash: F94BB376CA8893338B3814364AA44B68
	@Test()
	void parseTest() throws ParseException, UnknownHostException {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		InetAddressFormatter target = new InetAddressFormatter();
		Locale locale = new Locale("language1");

		//Act Statement(s)
		InetAddress result = target.parse("example.com", locale);
		InetAddress inetAddress = InetAddress.getLoopbackAddress();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(inetAddress)));
	}

	//Sapient generated method id: ${eead3185-0f02-3bfd-950f-cfa6f39f1563}, hash: EBE69EBF1DC141E72DB28781B0F09939
	@Test()
	void parseWhenCaughtUnknownHostExceptionThrowsIllegalStateException() throws ParseException, UnknownHostException {
		/* Branches:
		 * (catch-exception (UnknownHostException)) : true
		 */
		//Arrange Statement(s)
		UnknownHostException unknownHostExceptionMock = mock(UnknownHostException.class);
		try (MockedStatic<InetAddress> inetAddress = mockStatic(InetAddress.class)) {
			inetAddress.when(() -> InetAddress.getByName("example.com")).thenThrow(unknownHostExceptionMock);
			InetAddressFormatter target = new InetAddressFormatter();
			Locale locale = new Locale("language1");
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.parse("example.com", locale);
			});
			UnknownHostException unknownHostException = new UnknownHostException();
			IllegalStateException illegalStateException = new IllegalStateException("Unknown host example.com", unknownHostException);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(unknownHostException.getClass())));
				inetAddress.verify(() -> InetAddress.getByName("example.com"), atLeast(1));
			});
		}
	}
}
