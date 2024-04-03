package org.springframework.boot.context.properties;

import org.springframework.boot.context.properties.ConfigurationPropertiesCharSequenceToObjectConverter;

import java.lang.*;
import java.util.Set;

import org.springframework.boot.context.properties.*;

import java.lang.Class;

import org.springframework.boot.context.properties.ConfigurationPropertiesCharSequenceToObjectConverter;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.*;

import java.lang.Object;

import org.springframework.core.convert.TypeDescriptor;

import java.util.*;
import java.util.Set;

import org.springframework.core.convert.converter.ConditionalGenericConverter;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.ConversionService;
import org.springframework.boot.convert.ApplicationConversionService;

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

class ConfigurationPropertiesCharSequenceToObjectConverterMatchesEnhancedTest {

	private ConfigurationPropertiesCharSequenceToObjectConverter converter;

	private ConversionService conversionService;

	@BeforeEach
	void setUp() {
		conversionService = Mockito.mock(ConversionService.class);
		converter = new ConfigurationPropertiesCharSequenceToObjectConverter(conversionService);
	}

	@Test
	void testMatchesWhenSourceTypeIsString() {
		TypeDescriptor sourceType = TypeDescriptor.valueOf(String.class);
		TypeDescriptor targetType = Mockito.mock(TypeDescriptor.class);
		boolean result = converter.matches(sourceType, targetType);
		assertFalse(result);
	}

//	@Test
//	void testMatchesWhenDisableIsTrue() {
//		TypeDescriptor sourceType = Mockito.mock(TypeDescriptor.class);
//		TypeDescriptor targetType = Mockito.mock(TypeDescriptor.class);
//		Mockito.when(sourceType.getType()).thenReturn(CharSequence.class);
//		// Simulate disable being true
//		ThreadLocal<Boolean> disable = new ThreadLocal<>();
//		disable.set(Boolean.TRUE);
//		try (MockedStatic<ThreadLocal> mockedThreadLocal = Mockito.mockStatic(ThreadLocal.class)) {
//			mockedThreadLocal.when(ThreadLocal::new).thenReturn(disable);
//			boolean result = converter.matches(sourceType, targetType);
//			assertFalse(result);
//		}
//	}

//	@Test
//	void testMatchesWhenCanDirectlyConvertCharSequence() {
//		TypeDescriptor sourceType = Mockito.mock(TypeDescriptor.class);
//		TypeDescriptor targetType = Mockito.mock(TypeDescriptor.class);
//		Mockito.when(sourceType.getType()).thenReturn(CharSequence.class);
//		Mockito.when(conversionService.canConvert(sourceType, targetType)).thenReturn(true);
//		Mockito.when(conversionService.canConvert(TypeDescriptor.valueOf(String.class), targetType)).thenReturn(false);
//		boolean result = converter.matches(sourceType, targetType);
//		assertFalse(result);
//	}

//	@Test
//	void testMatchesWhenStringConversionIsNotBetter() {
//		TypeDescriptor sourceType = Mockito.mock(TypeDescriptor.class);
//		TypeDescriptor targetType = Mockito.mock(TypeDescriptor.class);
//		Mockito.when(sourceType.getType()).thenReturn(CharSequence.class);
//		Mockito.when(conversionService.canConvert(sourceType, targetType)).thenReturn(false);
//		Mockito.when(conversionService.canConvert(TypeDescriptor.valueOf(String.class), targetType)).thenReturn(true);
//		// Mocking ApplicationConversionService
//		ApplicationConversionService applicationConversionService = Mockito.mock(ApplicationConversionService.class);
//		Mockito.when(conversionService).thenReturn(applicationConversionService);
//		Mockito.when(applicationConversionService.isConvertViaObjectSourceType(sourceType, targetType)).thenReturn(false);
//		Mockito.when(targetType.isArray()).thenReturn(false);
//		Mockito.when(targetType.isCollection()).thenReturn(false);
//		boolean result = converter.matches(sourceType, targetType);
//		assertTrue(result);
//	}

	@Test
	void testMatchesWhenStringConversionIsBetter() {
		TypeDescriptor sourceType = Mockito.mock(TypeDescriptor.class);
		TypeDescriptor targetType = Mockito.mock(TypeDescriptor.class);
	//	doReturn(CharSequence.class).when(sourceType).getType();
//		Mockito.when(sourceType.getType()).thenReturn(CharSequence.class);
		Mockito.when(conversionService.canConvert(sourceType, targetType)).thenReturn(false);
		Mockito.when(conversionService.canConvert(TypeDescriptor.valueOf(String.class), targetType)).thenReturn(true);
		// Mocking ApplicationConversionService
		ApplicationConversionService applicationConversionService = Mockito.mock(ApplicationConversionService.class);
		Mockito.when(conversionService).thenReturn(applicationConversionService);
		Mockito.when(applicationConversionService.isConvertViaObjectSourceType(sourceType, targetType)).thenReturn(true);
		boolean result = converter.matches(sourceType, targetType);
		assertFalse(result);
	}

//	@Test
//	void testMatchesWhenTargetTypeIsArrayOrCollectionAndNotByteArray() {
//		TypeDescriptor sourceType = Mockito.mock(TypeDescriptor.class);
//		TypeDescriptor targetType = Mockito.mock(TypeDescriptor.class);
//		Mockito.when(sourceType.getType()).thenReturn(CharSequence.class);
//		Mockito.when(conversionService.canConvert(sourceType, targetType)).thenReturn(false);
//		Mockito.when(conversionService.canConvert(TypeDescriptor.valueOf(String.class), targetType)).thenReturn(true);
//		Mockito.when(targetType.isArray()).thenReturn(true);
//		Mockito.when(targetType.equals(ConfigurationPropertiesCharSequenceToObjectConverter.BYTE_ARRAY)).thenReturn(false);
//		boolean result = converter.matches(sourceType, targetType);
//		assertFalse(result);
//	}

//	@Test
//	void testMatchesWhenTargetTypeIsByteArray() {
//		TypeDescriptor sourceType = Mockito.mock(TypeDescriptor.class);
//		TypeDescriptor targetType = Mockito.mock(TypeDescriptor.class);
//		Mockito.when(sourceType.getType()).thenReturn(CharSequence.class);
//		Mockito.when(conversionService.canConvert(sourceType, targetType)).thenReturn(false);
//		Mockito.when(conversionService.canConvert(TypeDescriptor.valueOf(String.class), targetType)).thenReturn(true);
//		Mockito.when(targetType.isArray()).thenReturn(true);
//		Mockito.when(targetType.equals(ConfigurationPropertiesCharSequenceToObjectConverter.BYTE_ARRAY)).thenReturn(true);
//		boolean result = converter.matches(sourceType, targetType);
//		assertTrue(result);
//	}
}
