package org.springframework.boot.convert;

import org.springframework.boot.convert.DelimitedStringToCollectionConverter;

import java.lang.*;
import java.util.Set;

import org.springframework.util.*;
import org.springframework.core.convert.ConversionService;
import org.springframework.boot.convert.DelimitedStringToCollectionConverter;
import org.springframework.core.convert.*;
import org.springframework.util.Assert;

import java.lang.Object;

import org.springframework.boot.convert.*;
import org.springframework.core.convert.TypeDescriptor;

import java.util.*;

import org.springframework.core.CollectionFactory;
import org.springframework.util.Assert;

import java.util.Set;

import org.springframework.core.convert.converter.ConditionalGenericConverter;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.util.StringUtils;
import org.springframework.core.convert.ConversionService;

import java.util.Collection;
import java.util.stream.Stream;
import java.util.Collections;
import java.util.Arrays;

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

class DelimitedStringToCollectionConverterConvertEnhancedTest {

	private DelimitedStringToCollectionConverter converter;

	private ConversionService conversionService;

	@BeforeEach
	void setUp() {
		conversionService = Mockito.mock(ConversionService.class);
		converter = new DelimitedStringToCollectionConverter(conversionService);
	}

	@Test
	void convert_WhenSourceIsNull_ShouldReturnNull() {
		Object result = converter.convert(null, null, null);
		assertNull(result);
	}

	@Test
	void convert_WhenSourceIsNotNull_ShouldReturnCollection() {
		String source = "1,2,3";
		TypeDescriptor sourceType = Mockito.mock(TypeDescriptor.class);
		TypeDescriptor targetType = Mockito.mock(TypeDescriptor.class);
		TypeDescriptor elementDescriptor = Mockito.mock(TypeDescriptor.class);
		Mockito.when(targetType.getElementTypeDescriptor()).thenReturn(elementDescriptor);
		Mockito.when(conversionService.convert(any(), eq(sourceType), eq(elementDescriptor))).thenAnswer(invocation -> invocation.getArgument(0));
		Collection<?> result = (Collection<?>) converter.convert(source, sourceType, targetType);
		assertNotNull(result);
		assertEquals(3, result.size());
	}

	@Test
	void convert_WithCustomDelimiter_ShouldSplitAccordingly() {
		String source = "1;2;3";
		TypeDescriptor sourceType = Mockito.mock(TypeDescriptor.class);
		TypeDescriptor targetType = Mockito.mock(TypeDescriptor.class);
		TypeDescriptor elementDescriptor = Mockito.mock(TypeDescriptor.class);
		Delimiter delimiterAnnotation = Mockito.mock(Delimiter.class);
		Mockito.when(targetType.getAnnotation(Delimiter.class)).thenReturn(delimiterAnnotation);
		Mockito.when(delimiterAnnotation.value()).thenReturn(";");
		Mockito.when(targetType.getElementTypeDescriptor()).thenReturn(elementDescriptor);
		Mockito.when(conversionService.convert(any(), eq(sourceType), eq(elementDescriptor))).thenAnswer(invocation -> invocation.getArgument(0));
		Collection<?> result = (Collection<?>) converter.convert(source, sourceType, targetType);
		assertNotNull(result);
		assertEquals(3, result.size());
	}

	@Test
	void convert_WhenConversionServiceThrowsException_ShouldPropagateException() {
		String source = "invalid";
		TypeDescriptor sourceType = Mockito.mock(TypeDescriptor.class);
		TypeDescriptor targetType = Mockito.mock(TypeDescriptor.class);
		TypeDescriptor elementDescriptor = Mockito.mock(TypeDescriptor.class);
		Mockito.when(targetType.getElementTypeDescriptor()).thenReturn(elementDescriptor);
		Mockito.when(conversionService.convert(any(), eq(sourceType), eq(elementDescriptor))).thenThrow(new ConversionFailedException(null, null, null, null));
		assertThrows(ConversionFailedException.class, () -> converter.convert(source, sourceType, targetType));
	}

	@Test
	void convert_WhenAssertNotNullIsCalled_ShouldValidateConversionService() {
		try (MockedStatic<Assert> mocked = Mockito.mockStatic(Assert.class)) {
			mocked.when(() -> Assert.notNull(any(ConversionService.class), any(String.class))).thenAnswer(invocation -> null);
			new DelimitedStringToCollectionConverter(conversionService);
			mocked.verify(() -> Assert.notNull(any(ConversionService.class), any(String.class)));
		}
	}
}
