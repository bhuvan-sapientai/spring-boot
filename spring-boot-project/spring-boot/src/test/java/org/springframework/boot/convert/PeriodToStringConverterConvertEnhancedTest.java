package org.springframework.boot.convert;

import org.springframework.boot.convert.PeriodToStringConverter;

import org.springframework.boot.convert.PeriodUnit;
import org.springframework.boot.convert.PeriodToStringConverter;
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

class PeriodToStringConverterConvertEnhancedTest {

	private PeriodToStringConverter converter;

	@BeforeEach
	void setUp() {
		converter = new PeriodToStringConverter();
	}

	@Test
	void convert_WhenSourceIsEmpty_ShouldReturnNull() {
		try (MockedStatic<ObjectUtils> mockedUtils = Mockito.mockStatic(ObjectUtils.class)) {
			mockedUtils.when(() -> ObjectUtils.isEmpty(Mockito.any())).thenReturn(true);
			Object result = converter.convert(null, null, null);
			assertNull(result);
		}
	}

	@Test
	void convert_WhenSourceIsNotEmpty_ShouldReturnFormattedString() {
		Period period = Period.of(1, 2, 3);
		TypeDescriptor sourceType = Mockito.mock(TypeDescriptor.class);
		PeriodFormat periodFormat = Mockito.mock(PeriodFormat.class);
		PeriodUnit periodUnit = Mockito.mock(PeriodUnit.class);
		Mockito.when(sourceType.getAnnotation(PeriodFormat.class)).thenReturn(periodFormat);
		Mockito.when(periodFormat.value()).thenReturn(PeriodStyle.ISO8601);
		Mockito.when(sourceType.getAnnotation(PeriodUnit.class)).thenReturn(periodUnit);
		Mockito.when(periodUnit.value()).thenReturn(ChronoUnit.DAYS);
		try (MockedStatic<ObjectUtils> mockedUtils = Mockito.mockStatic(ObjectUtils.class)) {
			mockedUtils.when(() -> ObjectUtils.isEmpty(Mockito.any())).thenReturn(false);
			String result = (String) converter.convert(period, sourceType, null);
			assertEquals("P1Y2M3D", result);
		}
	}

	@Test
	void convert_WhenStyleIsNull_ShouldUseDefaultStyle() {
		Period period = Period.of(1, 2, 3);
		TypeDescriptor sourceType = Mockito.mock(TypeDescriptor.class);
		Mockito.when(sourceType.getAnnotation(PeriodFormat.class)).thenReturn(null);
		Mockito.when(sourceType.getAnnotation(PeriodUnit.class)).thenReturn(null);
		try (MockedStatic<ObjectUtils> mockedUtils = Mockito.mockStatic(ObjectUtils.class)) {
			mockedUtils.when(() -> ObjectUtils.isEmpty(Mockito.any())).thenReturn(false);
			String result = (String) converter.convert(period, sourceType, null);
			assertEquals("P1Y2M3D", result);
		}
	}

	@Test
	void convert_WhenUnitIsNull_ShouldNotAppendUnit() {
		Period period = Period.of(1, 2, 3);
		TypeDescriptor sourceType = Mockito.mock(TypeDescriptor.class);
		PeriodFormat periodFormat = Mockito.mock(PeriodFormat.class);
		Mockito.when(sourceType.getAnnotation(PeriodFormat.class)).thenReturn(periodFormat);
		Mockito.when(periodFormat.value()).thenReturn(PeriodStyle.ISO8601);
		Mockito.when(sourceType.getAnnotation(PeriodUnit.class)).thenReturn(null);
		try (MockedStatic<ObjectUtils> mockedUtils = Mockito.mockStatic(ObjectUtils.class)) {
			mockedUtils.when(() -> ObjectUtils.isEmpty(Mockito.any())).thenReturn(false);
			String result = (String) converter.convert(period, sourceType, null);
			assertEquals("P1Y2M3D", result);
		}
	}
}
