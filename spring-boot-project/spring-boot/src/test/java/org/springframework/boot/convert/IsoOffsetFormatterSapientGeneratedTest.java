package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.time.OffsetDateTime;
import java.util.Locale;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class IsoOffsetFormatterSapientGeneratedTest {

	//Sapient generated method id: ${4be23dda-8ff3-3c4c-9e48-c9e760f75759}, hash: 51ECD83F3EA90CC60BE2F9818145A42A
	@Disabled()
	@Test()
	void printTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		IsoOffsetFormatter target = new IsoOffsetFormatter();
		OffsetDateTime offsetDateTime = OffsetDateTime.now();
		Locale locale = new Locale("language1");
		//Act Statement(s)
		String result = target.print(offsetDateTime, locale);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("result1")));
	}

	//Sapient generated method id: ${3a1fa216-77d7-3552-a886-5cb34f671ab0}, hash: 817094AE6BDF61003A938BFDB8C2B782
	@Disabled()
	@Test()
	void parseTest() throws ParseException {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		IsoOffsetFormatter target = new IsoOffsetFormatter();
		Locale locale = new Locale("language1");
		//Act Statement(s)
		OffsetDateTime result = target.parse("2022-01-01T10:00:00+05:30", locale);
		OffsetDateTime offsetDateTime = OffsetDateTime.now();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(offsetDateTime)));
	}
}
