package org.springframework.boot.convert;

import org.springframework.boot.convert.IsoOffsetFormatter;

import java.time.*;
import java.time.OffsetDateTime;
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

public class IsoOffsetFormatterPrintEnhancedTest {

	@Test
	public void testPrintWithOffsetDateTime() {
		IsoOffsetFormatter formatter = new IsoOffsetFormatter();
		OffsetDateTime dateTime = OffsetDateTime.of(2023, 4, 1, 12, 0, 0, 0, ZoneOffset.UTC);
		String expected = "2023-04-01T12:00:00Z";
		String actual = formatter.print(dateTime, Locale.getDefault());
		assertEquals(expected, actual, "The formatted date-time should match the expected ISO offset format.");
	}
}
