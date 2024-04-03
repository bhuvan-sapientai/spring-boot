package org.springframework.boot.context.config;

import org.springframework.boot.context.config.DelegatingApplicationContextInitializer;

import org.springframework.core.env.*;
import org.springframework.context.ApplicationContextException;

import java.lang.Class;
import java.util.function.*;

import org.springframework.beans.*;
import org.springframework.boot.context.config.DelegatingApplicationContextInitializer;
import org.springframework.util.ClassUtils;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.util.StringUtils;
import org.springframework.context.*;

import java.lang.ClassLoader;
import java.util.function.Supplier;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.lang.*;

import org.springframework.core.GenericTypeResolver;
import org.springframework.util.*;
import org.springframework.beans.BeanUtils;
import org.springframework.util.Assert;
import org.springframework.boot.context.config.*;
import org.springframework.core.*;
import org.springframework.core.GenericTypeResolver;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.beans.BeanUtils;
import org.springframework.util.Assert;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.util.StringUtils;
import org.springframework.core.Ordered;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ApplicationContextException;
import org.springframework.util.ClassUtils;

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

@ExtendWith(MockitoExtension.class)
public class DelegatingApplicationContextInitializerInitializeEnhancedTest {

	@Mock
	private ConfigurableApplicationContext mockContext;

	@Mock
	private ConfigurableEnvironment mockEnvironment;

	private DelegatingApplicationContextInitializer initializer;

	@BeforeEach
	public void setUp() {
		initializer = new DelegatingApplicationContextInitializer();
		when(mockContext.getEnvironment()).thenReturn(mockEnvironment);
	}

	@Test
	public void testInitializeWithNoInitializerClasses() {
		when(mockEnvironment.getProperty("context.initializer.classes")).thenReturn(null);
		initializer.initialize(mockContext);
		verify(mockContext, times(1)).getEnvironment();
		verifyNoMoreInteractions(mockContext);
	}

	@Test
	public void testInitializeWithInitializerClasses() {
		String initializerClassName = "org.example.TestApplicationContextInitializer";
		when(mockEnvironment.getProperty("context.initializer.classes")).thenReturn(initializerClassName);
		try (MockedStatic<StringUtils> utilsMockedStatic = mockStatic(StringUtils.class)) {
			utilsMockedStatic.when(() -> StringUtils.hasLength(any(String.class))).thenReturn(true);
			utilsMockedStatic.when(() -> StringUtils.tokenizeToStringArray(eq(initializerClassName), eq(","))).thenReturn(new String[] { initializerClassName });
			try (MockedStatic<ClassUtils> classUtilsMockedStatic = mockStatic(ClassUtils.class)) {
				classUtilsMockedStatic.when(() -> ClassUtils.forName(eq(initializerClassName), any(ClassLoader.class))).thenReturn((Class) ApplicationContextInitializer.class);
				try (MockedStatic<BeanUtils> beanUtilsMockedStatic = mockStatic(BeanUtils.class)) {
					ApplicationContextInitializer<?> initializerInstance = mock(ApplicationContextInitializer.class);
					beanUtilsMockedStatic.when(() -> BeanUtils.instantiateClass(any(Class.class))).thenReturn(initializerInstance);
					initializer.initialize(mockContext);
					verify(mockContext, times(1)).getEnvironment();
					verify(initializerInstance, times(1)).initialize(mockContext);
				}
			}
		}
	}
}
