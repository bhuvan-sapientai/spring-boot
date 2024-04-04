package org.springframework.boot.diagnostics.analyzer;

import org.springframework.boot.diagnostics.analyzer.BindValidationFailureAnalyzer;

import org.springframework.boot.context.properties.bind.validation.ValidationErrors;

import java.util.List;

import org.springframework.boot.diagnostics.analyzer.*;
import org.springframework.validation.*;
import org.springframework.boot.diagnostics.*;
import org.springframework.boot.context.properties.bind.validation.*;

import java.lang.*;

import org.springframework.boot.origin.Origin;
import org.springframework.boot.diagnostics.analyzer.BindValidationFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.validation.ObjectError;
import org.springframework.validation.FieldError;

import java.lang.Throwable;

import org.springframework.boot.context.properties.bind.validation.BindValidationException;
import org.springframework.validation.BindException;

import java.lang.Object;

import org.springframework.boot.origin.*;

import java.util.*;

import org.springframework.boot.origin.Origin;
import org.springframework.validation.ObjectError;
import org.springframework.boot.context.properties.bind.validation.BindValidationException;
import org.springframework.validation.FieldError;
import org.springframework.boot.diagnostics.FailureAnalysis;

import java.util.List;

import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;

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

class BindValidationFailureAnalyzerAnalyzeEnhancedTest {

	private BindValidationFailureAnalyzer analyzer;

	@BeforeEach
	void setUp() {
		analyzer = new BindValidationFailureAnalyzer();
	}

	@Test
	@Disabled
	void testAnalyzeWithBindValidationException() {
		Throwable rootFailure = Mockito.mock(Throwable.class);
		BindValidationException bindValidationException = Mockito.mock(BindValidationException.class);
		ValidationErrors validationErrors = Mockito.mock(ValidationErrors.class);
		List<ObjectError> errors = new ArrayList<>();
		FieldError fieldError = Mockito.mock(FieldError.class);
		errors.add(fieldError);
		Mockito.when(bindValidationException.getValidationErrors()).thenReturn(validationErrors);
		Mockito.when(validationErrors.getAllErrors()).thenReturn(errors);
		Mockito.when(fieldError.getDefaultMessage()).thenReturn("default message");
		Mockito.when(fieldError.getField()).thenReturn("field");
		Mockito.when(fieldError.getRejectedValue()).thenReturn("rejectedValue");
		try (MockedStatic<Origin> originMockedStatic = Mockito.mockStatic(Origin.class)) {
			originMockedStatic.when(() -> Origin.from(any(FieldError.class))).thenReturn(null);
			Mockito.when(rootFailure.getCause()).thenReturn(bindValidationException);
			FailureAnalysis result = analyzer.analyze(rootFailure);
			String expectedDescription = "Binding to target null failed:\n" + "\n    Reason: default message\n";
			assertEquals(expectedDescription, result.getDescription());
			assertEquals(bindValidationException, result.getCause());
		}
	}

	@Test
	void testAnalyzeWithSpringBindException() {
		Throwable rootFailure = Mockito.mock(Throwable.class);
		BindException springBindException = Mockito.mock(BindException.class);
		List<ObjectError> errors = new ArrayList<>();
		ObjectError objectError = Mockito.mock(ObjectError.class);
		errors.add(objectError);
		Mockito.when(springBindException.getAllErrors()).thenReturn(errors);
		Mockito.when(objectError.getDefaultMessage()).thenReturn("default message");
		Mockito.when(rootFailure.getCause()).thenReturn(springBindException);
		FailureAnalysis result = analyzer.analyze(rootFailure);
		String expectedDescription = "Binding to target null failed:\n" + "\n    Reason: default message\n";
		assertEquals(expectedDescription, result.getDescription());
		assertEquals(springBindException, result.getCause());
	}

	@Test
	void testAnalyzeWithNoBindException() {
		Throwable rootFailure = Mockito.mock(Throwable.class);
		Mockito.when(rootFailure.getCause()).thenReturn(null);
		FailureAnalysis result = analyzer.analyze(rootFailure);
		assertNull(result);
	}
}
