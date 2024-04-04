package org.springframework.boot.convert;

import org.springframework.boot.convert.NumberToDurationConverter;

import java.lang.*;
import java.util.Set;
import java.lang.Class;

import org.springframework.core.convert.*;

import java.lang.Object;

import org.springframework.boot.convert.*;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.boot.convert.NumberToDurationConverter;

import java.util.*;

import org.springframework.boot.convert.StringToDurationConverter;

import java.util.Set;

import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.Converter;

import java.time.Duration;
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
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
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

@ExtendWith(MockitoExtension.class)
class NumberToDurationConverterConvertEnhancedTest {

	private NumberToDurationConverter converter;

	@Mock
	private StringToDurationConverter mockDelegate;

	@BeforeEach
	void setUp() {
		converter = new NumberToDurationConverter();
	}

	@Test
	@Disabled
	void testConvertWithNonNullSource() {
		Object source = 123;
		TypeDescriptor sourceType = TypeDescriptor.valueOf(Integer.class);
		TypeDescriptor targetType = TypeDescriptor.valueOf(Duration.class);
		Duration expectedDuration = Duration.ofSeconds(123);
		try (MockedStatic<TypeDescriptor> typeDescriptorMockedStatic = mockStatic(TypeDescriptor.class)) {
			typeDescriptorMockedStatic.when(() -> TypeDescriptor.valueOf(String.class)).thenReturn(TypeDescriptor.valueOf(String.class));
			when(mockDelegate.convert(anyString(), any(TypeDescriptor.class), eq(targetType))).thenReturn(expectedDuration);
			Object result = converter.convert(source, sourceType, targetType);
			assertEquals(expectedDuration, result);
			verify(mockDelegate).convert(eq("123"), any(TypeDescriptor.class), eq(targetType));
		}
	}

	@Test
	@Disabled
	void testConvertWithNullSource() {
		Object source = null;
		TypeDescriptor sourceType = TypeDescriptor.valueOf(Integer.class);
		TypeDescriptor targetType = TypeDescriptor.valueOf(Duration.class);
		try (MockedStatic<TypeDescriptor> typeDescriptorMockedStatic = mockStatic(TypeDescriptor.class)) {
			typeDescriptorMockedStatic.when(() -> TypeDescriptor.valueOf(String.class)).thenReturn(TypeDescriptor.valueOf(String.class));
			when(mockDelegate.convert(null, TypeDescriptor.valueOf(String.class), targetType)).thenReturn(null);
			Object result = converter.convert(source, sourceType, targetType);
			assertNull(result);
			verify(mockDelegate).convert(null, TypeDescriptor.valueOf(String.class), targetType);
		}
	}
}
