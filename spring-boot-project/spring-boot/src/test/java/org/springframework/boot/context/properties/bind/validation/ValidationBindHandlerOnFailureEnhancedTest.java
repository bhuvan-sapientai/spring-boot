package org.springframework.boot.context.properties.bind.validation;

import org.springframework.boot.context.properties.bind.validation.ValidationBindHandler;

import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.validation.Validator;

import java.lang.Class;
import java.util.function.*;

import org.springframework.core.ResolvableType;
import org.springframework.validation.*;
import org.springframework.boot.context.properties.bind.BindHandler;
import org.springframework.boot.context.properties.bind.*;

import java.util.function.Supplier;

import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.boot.context.properties.bind.validation.*;

import java.lang.*;

import org.springframework.boot.context.properties.source.*;
import org.springframework.boot.context.properties.bind.validation.ValidationBindHandler;
import org.springframework.util.*;

import java.lang.Exception;

import org.springframework.boot.context.properties.source.ConfigurationProperty;
import org.springframework.boot.context.properties.bind.validation.BindValidationException;
import org.springframework.util.Assert;

import java.lang.Object;

import org.springframework.boot.context.properties.bind.BindContext;
import org.springframework.core.*;
import org.springframework.boot.context.properties.source.ConfigurationProperty;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

import org.springframework.validation.BeanPropertyBindingResult;

import java.util.Set;

import org.springframework.boot.context.properties.source.ConfigurationPropertyName.Form;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.AbstractBindHandler;
import org.springframework.util.ObjectUtils;
import org.springframework.boot.context.properties.bind.DataObjectPropertyName;

import java.util.LinkedHashMap;

import org.springframework.boot.context.properties.bind.BindContext;
import org.springframework.validation.AbstractBindingResult;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.beans.NotReadablePropertyException;
import org.springframework.boot.context.properties.bind.BindHandler;
import org.springframework.core.ResolvableType;

import java.util.Map;

import org.springframework.validation.Validator;

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

class ValidationBindHandlerOnFailureEnhancedTest {

	private ValidationBindHandler validationBindHandler;

	private Validator validator;

	private BindContext context;

	private Bindable<?> target;

	private ConfigurationPropertyName name;

	private Exception error;

	@BeforeEach
	void setUp() {
		validator = mock(Validator.class);
		validationBindHandler = new ValidationBindHandler(validator);
		context = mock(BindContext.class);
		target = mock(Bindable.class);
		name = mock(ConfigurationPropertyName.class);
		error = mock(Exception.class);
	}

	@AfterEach
	void tearDown() {
		Mockito.reset(validator, context, target, name, error);
	}

//	@Test
//	void onFailure_withNonNullResult_shouldClearAndValidate() throws Exception {
//		// Arrange
//		Object result = new Object();
//		ResolvableType boxedType = ResolvableType.forClass(Object.class);
//		when(target.getBoxedType()).thenReturn(boxedType);
//		when(boxedType.resolve()).thenReturn(Object.class);
//		when(context.getDepth()).thenReturn(0);
//		when(validationBindHandler.onFailure(name, target, context, error)).thenReturn(result);
//		try (MockedStatic<Assert> assertMockedStatic = Mockito.mockStatic(Assert.class)) {
//			assertMockedStatic.when(() -> Assert.notNull(any(), anyString())).thenReturn(null);
//			// Act
//			Object actualResult = validationBindHandler.onFailure(name, target, context, error);
//			// Assert
//			assertMockedStatic.verify(() -> Assert.notNull(any(), anyString()), times(1));
//			verify(target, times(1)).getBoxedType();
//			verify(context, times(1)).getDepth();
//			verify(validator, times(1)).supports(Object.class);
//			verify(validator, times(1)).validate(any(), any());
//			assert actualResult == result;
//		}
//	}

	@Test
	void onFailure_withNullResult_shouldNotClearOrValidate() throws Exception {
		// Arrange
		when(validationBindHandler.onFailure(name, target, context, error)).thenReturn(null);
		// Act
		Object actualResult = validationBindHandler.onFailure(name, target, context, error);
		// Assert
		verify(target, never()).getBoxedType();
		verify(context, never()).getDepth();
		verify(validator, never()).supports(any());
		verify(validator, never()).validate(any(), any());
		assert actualResult == null;
	}

//	@Test
//	void onFailure_withValidationException_shouldThrow() throws Exception {
//		// Arrange
//		Object result = new Object();
//		ResolvableType boxedType = ResolvableType.forClass(Object.class);
//		when(target.getBoxedType()).thenReturn(boxedType);
//		when(boxedType.resolve()).thenReturn(Object.class);
//		when(context.getDepth()).thenReturn(0);
//		when(validationBindHandler.onFailure(name, target, context, error)).thenReturn(result);
//		BindValidationException exception = mock(BindValidationException.class);
//		validationBindHandler = spy(new ValidationBindHandler(validator));
//		doNothing().when(validationBindHandler).validate(any(), any(), any(), any());
//		doThrow(exception).when(validationBindHandler).validate(name, target, context, result);
//		// Act & Assert
//		Exception thrownException = assertThrows(BindValidationException.class, () -> validationBindHandler.onFailure(name, target, context, error));
//		assert thrownException == exception;
//	}
}
