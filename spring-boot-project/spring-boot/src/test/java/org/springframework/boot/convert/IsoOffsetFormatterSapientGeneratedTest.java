package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.time.format.DateTimeFormatter;
import java.time.OffsetDateTime;
import java.util.Locale;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class IsoOffsetFormatterSapientGeneratedTest {

	//Sapient generated method id: ${4be23dda-8ff3-3c4c-9e48-c9e760f75759}, hash: 93C87FA2912A31ED9585DF134D71529B
	@Disabled()
	@Test()
	void printTest() {
		//Arrange Statement(s)
		IsoOffsetFormatter target = new IsoOffsetFormatter();
		OffsetDateTime offsetDateTime = OffsetDateTime.now();
		Locale locale = new Locale("language1");
		//Act Statement(s)
		String result = target.print(offsetDateTime, locale);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("2024-04-01T14:51:12.561462+05:30")));
	}

	//Sapient generated method id: ${3a1fa216-77d7-3552-a886-5cb34f671ab0}, hash: 6E324593E94C5D9E16EEC741954007DB
	@Test()
	void parseTest() throws ParseException {
		//Arrange Statement(s)
		IsoOffsetFormatter target = new IsoOffsetFormatter();
		Locale locale = new Locale("language1");
		//Act Statement(s)
		OffsetDateTime result = target.parse("2022-01-01T10:00:00+05:30", locale);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
		OffsetDateTime offsetDateTime = OffsetDateTime.parse("2022-01-01T10:00:00+05:30", dateTimeFormatter);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(offsetDateTime)));
	}
}
