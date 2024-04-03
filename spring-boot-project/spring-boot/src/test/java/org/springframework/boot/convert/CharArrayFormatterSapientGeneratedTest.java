package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.Locale;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CharArrayFormatterSapientGeneratedTest {

	//Sapient generated method id: ${4be23dda-8ff3-3c4c-9e48-c9e760f75759}, hash: 62F08C31808ABC8CCBD52F0B6E6E8FCA
	@Test()
	void printTest() {
		//Arrange Statement(s)
		CharArrayFormatter target = new CharArrayFormatter();
		char[] charArray = new char[] { 'A' };
		Locale locale = new Locale("language1");

		//Act Statement(s)
		String result = target.print(charArray, locale);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("A")));
	}

	//Sapient generated method id: ${3a1fa216-77d7-3552-a886-5cb34f671ab0}, hash: 27879006E2A2896F5C9A8C97F377EE4F
	@Test()
	void parseTest() throws ParseException {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		CharArrayFormatter target = new CharArrayFormatter();
		Locale locale = new Locale("language1");

		//Act Statement(s)
		char[] result = target.parse("Hello World", locale);
		char[] charResultArray = new char[] {};

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(charResultArray)));
	}
}
