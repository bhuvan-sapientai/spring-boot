package org.springframework.boot.context.properties.bind;

import org.springframework.boot.context.properties.bind.ValueObjectBinder;

import org.springframework.boot.context.properties.bind.Bindable;

import java.util.Collection;
import java.util.function.*;

import org.springframework.boot.context.properties.bind.BindConverter;
import org.springframework.boot.context.properties.bind.ValueObjectBinder;

import java.util.function.Supplier;

import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.core.convert.ConversionException;

import java.lang.RuntimeException;

import org.springframework.boot.context.properties.bind.DataObjectPropertyBinder;
import org.springframework.boot.context.properties.source.*;

import java.lang.annotation.*;

import org.springframework.core.CollectionFactory;

import java.lang.Object;

import org.springframework.core.*;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.lang.Class;
import java.util.Map;

import org.springframework.beans.*;
import org.springframework.core.ResolvableType;
import org.springframework.boot.context.properties.bind.*;

import java.lang.*;

import org.springframework.util.*;
import org.springframework.boot.context.properties.bind.BindConstructorProvider;
import org.springframework.beans.BeanUtils;

import java.lang.annotation.Annotation;

import org.springframework.core.convert.*;
import org.springframework.util.Assert;

import java.util.*;

import org.springframework.core.DefaultParameterNameDiscoverer;
import org.springframework.core.ParameterNameDiscoverer;

import java.util.ArrayList;

import org.springframework.beans.BeanUtils;
import org.springframework.util.Assert;

import java.util.function.Consumer;
import java.util.List;

import org.springframework.core.ResolvableType;

import java.util.Collections;
import java.lang.reflect.Modifier;

import org.springframework.core.convert.ConversionException;
import org.springframework.core.CollectionFactory;
import org.springframework.boot.context.properties.bind.Binder.Context;
import org.springframework.core.annotation.MergedAnnotation;

import java.util.Optional;

import org.apache.commons.logging.Log;

import java.lang.reflect.Constructor;

import org.springframework.core.KotlinDetector;

import kotlin.reflect.jvm.ReflectJvmMapping;
import kotlin.reflect.KParameter;

import java.lang.reflect.Method;
import java.lang.annotation.Annotation;

import org.apache.commons.logging.LogFactory;

import java.lang.reflect.Array;

import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.core.log.LogMessage;

import kotlin.reflect.KFunction;

import java.util.Collection;
import java.lang.reflect.Parameter;

import org.springframework.core.annotation.MergedAnnotations;
import org.springframework.core.MethodParameter;

import java.util.Map;

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
class ValueObjectBinderOnUnableToCreateInstanceEnhancedTest {

	@Mock
	private BindConstructorProvider constructorProvider;

	@Mock
	private Bindable<?> bindable;

	@Mock
	private Binder.Context context;

	@Mock
	private RuntimeException exception;

	@Mock
	private Constructor<?> constructor;

	private ValueObjectBinder valueObjectBinder;

	@BeforeEach
	void setUp() {
		valueObjectBinder = new ValueObjectBinder(constructorProvider);
	}

//	@Test
//	void testOnUnableToCreateInstanceWithSuppressedException() {
//		when(bindable.getType()).thenReturn(ResolvableType.forClass(Object.class));
//		when(constructorProvider.getBindConstructor(any(Bindable.class), anyBoolean())).thenReturn(constructor);
//		doThrow(new ConversionException("Test Exception")).when(constructorProvider).getBindConstructor(any(Bindable.class), anyBoolean());
//		valueObjectBinder.onUnableToCreateInstance(bindable, context, exception);
//		verify(exception).addSuppressed(any(ConversionException.class));
//	}
//
//	@Test
//	void testOnUnableToCreateInstanceWithoutSuppressedException() {
//		when(bindable.getType()).thenReturn(ResolvableType.forClass(Object.class));
//		when(constructorProvider.getBindConstructor(any(Bindable.class), anyBoolean())).thenReturn(constructor);
//		valueObjectBinder.onUnableToCreateInstance(bindable, context, exception);
//		verify(exception, never()).addSuppressed(any());
//	}

	@Test
	void testOnUnableToCreateInstanceWithNullConstructor() {
		when(bindable.getType()).thenReturn(ResolvableType.forClass(Object.class));
		when(constructorProvider.getBindConstructor(any(Bindable.class), anyBoolean())).thenReturn(null);
		valueObjectBinder.onUnableToCreateInstance(bindable, context, exception);
		verify(exception, never()).addSuppressed(any());
	}
}
