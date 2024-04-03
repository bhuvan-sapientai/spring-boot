package org.springframework.boot.convert;

import org.springframework.boot.convert.DurationToStringConverter;

import org.springframework.boot.convert.DurationToStringConverter;

import java.lang.Class;

import org.springframework.boot.convert.DurationStyle;

import java.time.temporal.*;
import java.lang.*;

import org.springframework.boot.convert.DurationFormat;

import java.time.temporal.ChronoUnit;
import java.util.Set;

import org.springframework.boot.convert.DurationUnit;

import java.time.*;
import java.time.Duration;

import org.springframework.core.convert.*;

import java.lang.Object;

import org.springframework.boot.convert.*;
import org.springframework.core.convert.TypeDescriptor;

import java.util.*;
import java.util.Set;

import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.Converter;

import java.time.Duration;
import java.util.Collections;
import java.time.temporal.ChronoUnit;

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

class DurationToStringConverterConvertEnhancedTest {

	private DurationToStringConverter converter;

	@BeforeEach
	void setUp() {
		converter = new DurationToStringConverter();
	}

	@Test
	void convert_WhenSourceIsNull_ShouldReturnNull() {
		Object result = converter.convert(null, null, null);
		assertNull(result);
	}

	@Test
	void convert_WhenSourceIsNotNull_ShouldReturnFormattedString() {
		Duration source = Duration.ofHours(1);
		TypeDescriptor sourceType = Mockito.mock(TypeDescriptor.class);
		TypeDescriptor targetType = Mockito.mock(TypeDescriptor.class);
		DurationUnit durationUnitAnnotation = Mockito.mock(DurationUnit.class);
		DurationFormat durationFormatAnnotation = Mockito.mock(DurationFormat.class);
		Mockito.when(sourceType.getAnnotation(DurationUnit.class)).thenReturn(durationUnitAnnotation);
		Mockito.when(sourceType.getAnnotation(DurationFormat.class)).thenReturn(durationFormatAnnotation);
		Mockito.when(durationUnitAnnotation.value()).thenReturn(ChronoUnit.HOURS);
		Mockito.when(durationFormatAnnotation.value()).thenReturn(DurationStyle.SIMPLE);
		try (MockedStatic<DurationStyle> theMock = Mockito.mockStatic(DurationStyle.class)) {
			DurationStyle mockStyle = Mockito.mock(DurationStyle.class);
			theMock.when(() -> DurationStyle.ISO8601.print(source, ChronoUnit.HOURS)).thenReturn("PT1H");
			theMock.when(() -> DurationStyle.SIMPLE.print(source, ChronoUnit.HOURS)).thenReturn("1h");
			String result = (String) converter.convert(source, sourceType, targetType);
			assertEquals("1h", result);
		}
	}

	@Test
	void convert_WhenStyleIsNull_ShouldUseDefaultIso8601Style() {
		Duration source = Duration.ofHours(1);
		TypeDescriptor sourceType = Mockito.mock(TypeDescriptor.class);
		TypeDescriptor targetType = Mockito.mock(TypeDescriptor.class);
		Mockito.when(sourceType.getAnnotation(DurationUnit.class)).thenReturn(null);
		Mockito.when(sourceType.getAnnotation(DurationFormat.class)).thenReturn(null);
		try (MockedStatic<DurationStyle> theMock = Mockito.mockStatic(DurationStyle.class)) {
			theMock.when(() -> DurationStyle.ISO8601.print(source, null)).thenReturn("PT1H");
			String result = (String) converter.convert(source, sourceType, targetType);
			assertEquals("PT1H", result);
		}
	}
}
