package org.springframework.boot.context.properties;

import org.springframework.boot.context.properties.EnableConfigurationPropertiesRegistrar;

import org.springframework.beans.factory.support.*;
import org.springframework.boot.context.properties.BoundConfigurationProperties;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.*;

import java.lang.Class;

import org.springframework.boot.context.properties.ConfigurationPropertiesBeanRegistrar;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.core.annotation.*;
import org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor;

import java.util.stream.Stream;
import java.util.stream.*;
import java.lang.*;

import org.springframework.boot.context.properties.*;
import org.springframework.boot.context.properties.EnableConfigurationPropertiesRegistrar;
import org.springframework.core.annotation.MergedAnnotations;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.core.Conventions;

import java.util.stream.Collectors;

import org.springframework.core.annotation.MergedAnnotation;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;

import java.util.Set;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.boot.validation.beanvalidation.MethodValidationExcludeFilter;
import org.springframework.beans.factory.config.BeanDefinition;

import java.util.Arrays;

import org.springframework.core.type.AnnotationMetadata;

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

class EnableConfigurationPropertiesRegistrarRegisterBeanDefinitionsEnhancedTest {

	private EnableConfigurationPropertiesRegistrar registrar;

	private AnnotationMetadata metadata;

	private BeanDefinitionRegistry registry;

	@BeforeEach
	void setUp() {
		registrar = new EnableConfigurationPropertiesRegistrar();
		metadata = mock(AnnotationMetadata.class);
		registry = mock(BeanDefinitionRegistry.class);
	}

//	@Test
//	void testRegisterBeanDefinitions() {
//		// Mock the static methods
//		try (MockedStatic<Conventions> conventionsMock = Mockito.mockStatic(Conventions.class);
//			 MockedStatic<ConfigurationPropertiesBeanRegistrar> beanRegistrarMock = Mockito.mockStatic(ConfigurationPropertiesBeanRegistrar.class);
//			 MockedStatic<EnableConfigurationPropertiesRegistrar> enableConfigurationPropertiesRegistrarMock = Mockito.mockStatic(EnableConfigurationPropertiesRegistrar.class)) {
//			// Setup mocks
//			conventionsMock.when(() -> Conventions.getQualifiedAttributeName(EnableConfigurationPropertiesRegistrar.class, "methodValidationExcludeFilter")).thenReturn("org.springframework.boot.context.properties.EnableConfigurationPropertiesRegistrar.methodValidationExcludeFilter");
//			MergedAnnotations annotations = mock(MergedAnnotations.class);
//			when(metadata.getAnnotations()).thenReturn(annotations);
//			Stream<MergedAnnotation<EnableConfigurationProperties>> stream = mock(Stream.class);
//			when(annotations.stream(EnableConfigurationProperties.class)).thenReturn(stream);
//			Class<?>[] classes = new Class<?>[] { String.class, Integer.class };
//			when(stream.flatMap(any())).thenReturn(Arrays.stream(classes));
//			// Call the method under test
//			registrar.registerBeanDefinitions(metadata, registry);
//			// Verify interactions
//			verify(registry, times(1)).registerBeanDefinition(eq("org.springframework.boot.context.properties.EnableConfigurationPropertiesRegistrar.methodValidationExcludeFilter"), any(BeanDefinition.class));
//			beanRegistrarMock.verify(() -> ConfigurationPropertiesBeanRegistrar.register(any(BeanDefinitionRegistry.class).getClass()), times(1));
//			enableConfigurationPropertiesRegistrarMock.verify(() -> EnableConfigurationPropertiesRegistrar.registerMethodValidationExcludeFilter(any(BeanDefinitionRegistry.class)), times(1));
//			// Verify that ConfigurationPropertiesBeanRegistrar.register was called for each class
//			for (Class<?> clazz : classes) {
//				beanRegistrarMock.verify(() -> ConfigurationPropertiesBeanRegistrar.register(registry), times(1));
//			}
//		}
//	}
}
