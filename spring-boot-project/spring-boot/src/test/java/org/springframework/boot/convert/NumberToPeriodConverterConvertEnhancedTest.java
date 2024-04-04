package org.springframework.boot.convert;

import org.springframework.boot.convert.NumberToPeriodConverter;

import java.lang.*;
import java.util.Set;

import org.springframework.boot.convert.NumberToPeriodConverter;

import java.lang.Class;

import org.springframework.core.convert.*;

import java.lang.Object;

import org.springframework.boot.convert.*;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.boot.convert.StringToPeriodConverter;

import java.util.*;
import java.util.Set;

import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.Converter;

import java.time.Period;
import java.util.Collections;

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

class NumberToPeriodConverterConvertEnhancedTest {

	private NumberToPeriodConverter converter;

	private MockedStatic<TypeDescriptor> typeDescriptorMockedStatic;

	@BeforeEach
	void setUp() {
		converter = new NumberToPeriodConverter();
		typeDescriptorMockedStatic = Mockito.mockStatic(TypeDescriptor.class);
	}

	@AfterEach
	void tearDown() {
		typeDescriptorMockedStatic.close();
	}

	@Test
	@Disabled
	void testConvertWithNonNullSource() {
		// Arrange
		Integer source = 123;
		TypeDescriptor sourceType = TypeDescriptor.valueOf(Integer.class);
		TypeDescriptor targetType = TypeDescriptor.valueOf(Period.class);
		StringToPeriodConverter delegate = Mockito.mock(StringToPeriodConverter.class);
		Mockito.when(delegate.convert(any(String.class), any(TypeDescriptor.class), any(TypeDescriptor.class))).thenReturn(Period.ofDays(1));
		typeDescriptorMockedStatic.when(() -> TypeDescriptor.valueOf(String.class)).thenReturn(TypeDescriptor.valueOf(String.class));
		// Act
		Object result = converter.convert(source, sourceType, targetType);
		// Assert
		assertNotNull(result);
		assertTrue(result instanceof Period);
		assertEquals(Period.ofDays(1), result);
	}

	@Test
	@Disabled
	void testConvertWithNullSource() {
		// Arrange
		TypeDescriptor sourceType = TypeDescriptor.valueOf(Integer.class);
		TypeDescriptor targetType = TypeDescriptor.valueOf(Period.class);
		StringToPeriodConverter delegate = Mockito.mock(StringToPeriodConverter.class);
		Mockito.when(delegate.convert(null, TypeDescriptor.valueOf(String.class), targetType)).thenReturn(null);
		typeDescriptorMockedStatic.when(() -> TypeDescriptor.valueOf(String.class)).thenReturn(TypeDescriptor.valueOf(String.class));
		// Act
		Object result = converter.convert(null, sourceType, targetType);
		// Assert
		assertNull(result);
	}
}
