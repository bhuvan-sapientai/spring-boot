package org.springframework.boot.diagnostics.analyzer;

import org.springframework.boot.diagnostics.analyzer.NoUniqueBeanDefinitionFailureAnalyzer;

import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.beans.factory.config.BeanDefinition;

import java.lang.Class;

import org.springframework.boot.diagnostics.analyzer.*;
import org.springframework.boot.diagnostics.analyzer.NoUniqueBeanDefinitionFailureAnalyzer;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.util.StringUtils;
import org.springframework.boot.diagnostics.*;

import java.lang.StringBuilder;
import java.lang.*;

import org.springframework.beans.factory.*;
import org.springframework.util.*;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.boot.diagnostics.analyzer.MissingParameterNamesFailureAnalyzer;
import org.springframework.beans.factory.config.*;

import java.lang.Throwable;

import org.springframework.util.Assert;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;

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
class NoUniqueBeanDefinitionFailureAnalyzerAnalyzeEnhancedTest {

	@Mock
	private ConfigurableBeanFactory beanFactory;

	@Mock
	private NoUniqueBeanDefinitionException noUniqueBeanDefinitionException;

	@Mock
	private BeanDefinition beanDefinition;

	private NoUniqueBeanDefinitionFailureAnalyzer analyzer;

	@BeforeEach
	void setUp() {
		analyzer = new NoUniqueBeanDefinitionFailureAnalyzer(beanFactory);
	}

	@Test
	void analyze_whenDescriptionIsNull_shouldReturnNull() {
		FailureAnalysis result = analyzer.analyze(new Throwable(), noUniqueBeanDefinitionException, null);
		assertNull(result);
	}

	@Test
	@Disabled
	void analyze_whenBeanNamesAreNull_shouldReturnNull() {
		when(noUniqueBeanDefinitionException.getMessage()).thenReturn("expected message but found");
		FailureAnalysis result = analyzer.analyze(new Throwable(), noUniqueBeanDefinitionException, "description");
		assertNull(result);
	}

	@Test
	void analyze_whenValidConditions_shouldReturnFailureAnalysis() {
		when(noUniqueBeanDefinitionException.getMessage()).thenReturn("expected message but found: bean1,bean2");
		when(beanFactory.getMergedBeanDefinition(anyString())).thenReturn(beanDefinition);
		when(beanDefinition.getFactoryMethodName()).thenReturn("factoryMethod");
		try (MockedStatic<StringUtils> utilsMock = mockStatic(StringUtils.class);
			 MockedStatic<MissingParameterNamesFailureAnalyzer> missingParamsMock = mockStatic(MissingParameterNamesFailureAnalyzer.class)) {
			utilsMock.when(() -> StringUtils.commaDelimitedListToStringArray(anyString())).thenReturn(new String[] { "bean1", "bean2" });
			utilsMock.when(() -> StringUtils.hasText(anyString())).thenReturn(true);
			FailureAnalysis result = analyzer.analyze(new Throwable(), noUniqueBeanDefinitionException, "description");
			assertNotNull(result);
			assertTrue(result.getDescription().contains("description required a single bean, but 2 were found:"));
			assertTrue(result.getAction().contains("Consider marking one of the beans as @Primary"));
		}
	}

	@Test
	void analyze_whenBeanDefinitionNotFound_shouldAppendSingletonMessage() {
		when(noUniqueBeanDefinitionException.getMessage()).thenReturn("expected message but found: bean1,bean2");
		when(beanFactory.getMergedBeanDefinition("bean1")).thenThrow(new NoSuchBeanDefinitionException("bean1"));
		when(beanFactory.getMergedBeanDefinition("bean2")).thenReturn(beanDefinition);
		when(beanDefinition.getFactoryMethodName()).thenReturn("factoryMethod");
		try (MockedStatic<StringUtils> utilsMock = mockStatic(StringUtils.class);
			 MockedStatic<MissingParameterNamesFailureAnalyzer> missingParamsMock = mockStatic(MissingParameterNamesFailureAnalyzer.class)) {
			utilsMock.when(() -> StringUtils.commaDelimitedListToStringArray(anyString())).thenReturn(new String[] { "bean1", "bean2" });
			utilsMock.when(() -> StringUtils.hasText(anyString())).thenReturn(true);
			FailureAnalysis result = analyzer.analyze(new Throwable(), noUniqueBeanDefinitionException, "description");
			assertNotNull(result);
			assertTrue(result.getDescription().contains("a programmatically registered singleton"));
		}
	}
}
