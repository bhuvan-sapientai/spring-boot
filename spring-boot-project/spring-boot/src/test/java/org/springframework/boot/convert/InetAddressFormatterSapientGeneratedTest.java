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
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class InetAddressFormatterSapientGeneratedTest {

	//Sapient generated method id: ${4be23dda-8ff3-3c4c-9e48-c9e760f75759}, hash: 2913DFDCEDCB51A3F4D22AE2E53D0E44
	@Test()
	void printTest() {
		//Arrange Statement(s)
		InetAddressFormatter target = new InetAddressFormatter();
		InetAddress inetAddress = InetAddress.getLoopbackAddress();
		Locale locale = new Locale("language1");

		//Act Statement(s)
		String result = target.print(inetAddress, locale);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("127.0.0.1")));
	}

	//Sapient generated method id: ${3a1fa216-77d7-3552-a886-5cb34f671ab0}, hash: 864E76651BED141CAD076EE2F1B7B81A
	@Test()
	void parseTest() throws ParseException, UnknownHostException {
		//Arrange Statement(s)
		InetAddressFormatter target = new InetAddressFormatter();
		Locale locale = new Locale("language1");

		//Act Statement(s)
		InetAddress result = target.parse("www.example.com", locale);
		InetAddress inetAddress = InetAddress.getByName("www.example.com");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(inetAddress)));
	}

	//Sapient generated method id: ${eead3185-0f02-3bfd-950f-cfa6f39f1563}, hash: EB079E89C0516EDCEFCB79EC2BEBEFF4
	@Test()
	void parseWhenCaughtUnknownHostExceptionThrowsIllegalStateException() throws ParseException, UnknownHostException {
		/* Branches:
		 * (catch-exception (UnknownHostException)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<InetAddress> inetAddress = mockStatic(InetAddress.class)) {
			UnknownHostException unknownHostException = new UnknownHostException();
			inetAddress.when(() -> InetAddress.getByName("A")).thenThrow(unknownHostException);
			InetAddressFormatter target = new InetAddressFormatter();
			Locale locale = new Locale("language1");
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.parse("A", locale);
			});
			IllegalStateException illegalStateException = new IllegalStateException("Unknown host A", unknownHostException);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(unknownHostException.getClass())));
				inetAddress.verify(() -> InetAddress.getByName("A"), atLeast(1));
			});
		}
	}
}
