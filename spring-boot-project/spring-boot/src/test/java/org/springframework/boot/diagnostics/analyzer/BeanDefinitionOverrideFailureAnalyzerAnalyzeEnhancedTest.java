package org.springframework.boot.diagnostics.analyzer;

import org.springframework.boot.diagnostics.analyzer.BeanDefinitionOverrideFailureAnalyzer;

import java.lang.*;

import org.springframework.beans.factory.support.*;
import org.springframework.beans.factory.support.BeanDefinitionOverrideException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.diagnostics.analyzer.BeanDefinitionOverrideFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.boot.diagnostics.analyzer.*;
import org.springframework.beans.factory.config.*;

import java.lang.Throwable;

import org.springframework.boot.diagnostics.*;

import java.io.StringWriter;

import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.beans.factory.support.BeanDefinitionOverrideException;

import java.io.PrintWriter;

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

public class BeanDefinitionOverrideFailureAnalyzerAnalyzeEnhancedTest {

	private BeanDefinitionOverrideFailureAnalyzer analyzer;

	@BeforeEach
	public void setUp() {
		analyzer = new BeanDefinitionOverrideFailureAnalyzer();
	}

	@Test
	public void testAnalyzeWithResourceDescriptions() {
		BeanDefinitionOverrideException exception = Mockito.mock(BeanDefinitionOverrideException.class);
		BeanDefinition existingDefinition = Mockito.mock(BeanDefinition.class);
		BeanDefinition newDefinition = Mockito.mock(BeanDefinition.class);
		when(exception.getBeanName()).thenReturn("myBean");
		when(exception.getBeanDefinition()).thenReturn(newDefinition);
		when(exception.getExistingDefinition()).thenReturn(existingDefinition);
		when(newDefinition.getResourceDescription()).thenReturn("newResource.xml");
		when(existingDefinition.getResourceDescription()).thenReturn("existingResource.xml");
		FailureAnalysis analysis = analyzer.analyze(exception, exception);
		String expectedDescription = "The bean 'myBean', defined in newResource.xml, could not be registered. A bean with that name has already been defined in existingResource.xml and overriding is disabled.";
		String expectedAction = "Consider renaming one of the beans or enabling overriding by setting spring.main.allow-bean-definition-overriding=true";
		assertEquals(expectedDescription, analysis.getDescription());
		assertEquals(expectedAction, analysis.getAction());
		assertEquals(exception, analysis.getCause());
	}

	@Test
	public void testAnalyzeWithoutResourceDescriptions() {
		BeanDefinitionOverrideException exception = Mockito.mock(BeanDefinitionOverrideException.class);
		BeanDefinition existingDefinition = Mockito.mock(BeanDefinition.class);
		BeanDefinition newDefinition = Mockito.mock(BeanDefinition.class);
		when(exception.getBeanName()).thenReturn("myBean");
		when(exception.getBeanDefinition()).thenReturn(newDefinition);
		when(exception.getExistingDefinition()).thenReturn(existingDefinition);
		when(newDefinition.getResourceDescription()).thenReturn(null);
		when(existingDefinition.getResourceDescription()).thenReturn(null);
		FailureAnalysis analysis = analyzer.analyze(exception, exception);
		String expectedDescription = "The bean 'myBean' could not be registered. A bean with that name has already been defined and overriding is disabled.";
		String expectedAction = "Consider renaming one of the beans or enabling overriding by setting spring.main.allow-bean-definition-overriding=true";
		assertEquals(expectedDescription, analysis.getDescription());
		assertEquals(expectedAction, analysis.getAction());
		assertEquals(exception, analysis.getCause());
	}
}
