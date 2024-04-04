package org.springframework.boot.convert;

import org.springframework.boot.convert.StringToPeriodConverter;

import org.springframework.boot.convert.PeriodUnit;
import org.springframework.boot.convert.PeriodFormat;

import java.lang.Class;
import java.time.Period;

import org.springframework.boot.convert.PeriodStyle;

import java.time.temporal.*;
import java.lang.*;
import java.time.temporal.ChronoUnit;
import java.util.Set;

import org.springframework.util.*;
import org.springframework.util.ObjectUtils;

import java.time.*;

import org.springframework.core.convert.*;

import java.lang.Object;

import org.springframework.boot.convert.StringToPeriodConverter;
import org.springframework.boot.convert.*;
import org.springframework.core.convert.TypeDescriptor;

import java.util.*;
import java.util.Set;

import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.Converter;

import java.time.Period;
import java.util.Collections;

import org.springframework.util.ObjectUtils;

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

class StringToPeriodConverterConvertEnhancedTest {

	private StringToPeriodConverter converter;

	private MockedStatic<ObjectUtils> mockedObjectUtils;

	private MockedStatic<PeriodStyle> mockedPeriodStyle;

	@BeforeEach
	void setUp() {
		converter = new StringToPeriodConverter();
		mockedObjectUtils = Mockito.mockStatic(ObjectUtils.class);
		mockedPeriodStyle = Mockito.mockStatic(PeriodStyle.class);
	}

	@AfterEach
	void tearDown() {
		mockedObjectUtils.close();
		mockedPeriodStyle.close();
	}

	@Test
	@Disabled
	void convert_WhenSourceIsEmpty_ShouldReturnNull() {
		mockedObjectUtils.when(() -> ObjectUtils.isEmpty(any())).thenReturn(true);
		Object result = converter.convert("", null, null);
		assertNull(result);
	}

	@Test
	@Disabled
	void convert_WhenSourceIsNotEmpty_ShouldReturnPeriod() {
		String source = "P2D";
		TypeDescriptor targetType = Mockito.mock(TypeDescriptor.class);
		PeriodStyle style = Mockito.mock(PeriodStyle.class);
		Period expectedPeriod = Period.ofDays(2);
		mockedObjectUtils.when(() -> ObjectUtils.isEmpty(any())).thenReturn(false);
		mockedPeriodStyle.when(() -> PeriodStyle.detect(any())).thenReturn(style);
		Mockito.when(style.parse(source, null)).thenReturn(expectedPeriod);
		Object result = converter.convert(source, targetType, targetType);
		assertEquals(expectedPeriod, result);
	}

	@Test
	@Disabled
	void convert_WithStyleAndUnitAnnotations_ShouldReturnPeriod() {
		String source = "P2D";
		TypeDescriptor targetType = Mockito.mock(TypeDescriptor.class);
		PeriodStyle style = Mockito.mock(PeriodStyle.class);
		PeriodFormat periodFormat = Mockito.mock(PeriodFormat.class);
		PeriodUnit periodUnit = Mockito.mock(PeriodUnit.class);
		Period expectedPeriod = Period.ofDays(2);
		ChronoUnit unit = ChronoUnit.DAYS;
		mockedObjectUtils.when(() -> ObjectUtils.isEmpty(any())).thenReturn(false);
		Mockito.when(targetType.getAnnotation(PeriodFormat.class)).thenReturn(periodFormat);
		Mockito.when(periodFormat.value()).thenReturn(style);
		Mockito.when(targetType.getAnnotation(PeriodUnit.class)).thenReturn(periodUnit);
		Mockito.when(periodUnit.value()).thenReturn(unit);
		Mockito.when(style.parse(source, unit)).thenReturn(expectedPeriod);
		Object result = converter.convert(source, targetType, targetType);
		assertEquals(expectedPeriod, result);
	}
}
