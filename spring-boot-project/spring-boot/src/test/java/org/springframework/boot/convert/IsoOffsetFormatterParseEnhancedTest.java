package org.springframework.boot.convert;

import org.springframework.boot.convert.IsoOffsetFormatter;

import java.time.*;
import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;
import java.util.Locale;

import org.springframework.boot.convert.IsoOffsetFormatter;
import org.springframework.boot.convert.*;

import java.util.*;
import java.util.Locale;
import java.time.OffsetDateTime;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.time.format.DateTimeFormatter;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsInstanceOf.*;
import static org.hamcrest.MatcherAssert.*;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.eq;

import org.hamcrest.Matchers;
import org.hamcrest.core.IsInstanceOf;
import org.hamcrest.MatcherAssert;
import org.mockito.Mockito;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;
import org.mockito.MockitoAnnotations;
import org.mockito.Mock;

import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.net.*;
import java.beans.*;

import javax.net.*;
import javax.annotation.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

public class IsoOffsetFormatterParseEnhancedTest {

	private IsoOffsetFormatter formatter;

	@BeforeEach
	public void setUp() {
		formatter = new IsoOffsetFormatter();
	}

	@Test
	public void testParseValidOffsetDateTime() throws ParseException {
		String validOffsetDateTimeString = "2020-10-25T10:20:30+01:00";
		OffsetDateTime expected = OffsetDateTime.parse(validOffsetDateTimeString);
		OffsetDateTime actual = formatter.parse(validOffsetDateTimeString, Locale.getDefault());
		assertEquals(expected, actual, "The parsed OffsetDateTime should match the expected value.");
	}

	@Test
	public void testParseInvalidOffsetDateTime() {
		String invalidOffsetDateTimeString = "invalid-date-time";
		assertThrows(DateTimeParseException.class, () -> {
			formatter.parse(invalidOffsetDateTimeString, Locale.getDefault());
		}, "Parsing an invalid OffsetDateTime string should throw a DateTimeParseException.");
	}
}
