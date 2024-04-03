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
public class ValidationBindHandlerOnFinishEnhancedTest {

	@Mock
	private Validator validator;

	@Mock
	private BindContext context;

	@Mock
	private Bindable<?> target;

	@Mock
	private ConfigurationPropertyName name;

	@Mock
	private ResolvableType boxedType;

	private ValidationBindHandler validationBindHandler;

//	@BeforeEach
//	public void setUp() {
//		validationBindHandler = new ValidationBindHandler(validator);
//		when(target.getBoxedType()).thenReturn(boxedType);
//		when(boxedType.resolve()).thenReturn(Object.class);
//	}

//	@Test
//	public void testOnFinishWithoutException() throws Exception {
//		Object result = new Object();
//		when(context.getDepth()).thenReturn(1);
//		validationBindHandler.onFinish(name, target, context, result);
//		verify(validator, times(1)).supports(Object.class);
//		verify(validator, times(1)).validate(any(), any(ValidationBindHandler.ValidationResult.class));
//	}

//	@Test
//	public void testOnFinishWithExceptionAtRootDepth() {
//		Object result = new Object();
//		when(context.getDepth()).thenReturn(0);
//		doThrow(new BindValidationException("Validation failed")).when(validator).validate(any(), any(ValidationBindHandler.ValidationResult.class));
//		assertThrows(BindValidationException.class, () -> validationBindHandler.onFinish(name, target, context, result));
//	}
//
//	@Test
//	public void testOnFinishWithExceptionNotAtRootDepth() throws Exception {
//		Object result = new Object();
//		when(context.getDepth()).thenReturn(1);
//		doThrow(new BindValidationException("Validation failed")).when(validator).validate(any(), any(ValidationBindHandler.ValidationResult.class));
//		validationBindHandler.onFinish(name, target, context, result);
//		verify(validator, times(1)).validate(any(), any(ValidationBindHandler.ValidationResult.class));
//	}
}
