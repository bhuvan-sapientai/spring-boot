package org.springframework.boot.diagnostics.analyzer;

import org.springframework.boot.diagnostics.analyzer.InvalidConfigurationPropertyNameFailureAnalyzer;

import org.springframework.boot.diagnostics.analyzer.InvalidConfigurationPropertyNameFailureAnalyzer;

import java.util.List;

import org.springframework.boot.diagnostics.analyzer.*;

import java.lang.CharSequence;

import org.springframework.boot.diagnostics.*;

import java.lang.*;

import org.springframework.boot.context.properties.source.*;
import org.springframework.beans.factory.*;
import org.springframework.boot.context.properties.source.InvalidConfigurationPropertyNameException;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.beans.factory.BeanCreationException;

import java.lang.Throwable;
import java.util.*;

import org.springframework.beans.factory.BeanCreationException;

import java.util.stream.Collectors;

import org.springframework.boot.context.properties.source.InvalidConfigurationPropertyNameException;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.core.ResolvableType;

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

public class InvalidConfigurationPropertyNameFailureAnalyzerAnalyzeEnhancedTest {

	private InvalidConfigurationPropertyNameFailureAnalyzer analyzer;

	@BeforeEach
	public void setUp() {
		analyzer = new InvalidConfigurationPropertyNameFailureAnalyzer();
	}

	@Test
	public void testAnalyze() {
		String propertyName = "invalid_property_name";
		List<Character> invalidCharacters = Arrays.asList('!', '@', '#');
		String beanName = "testBean";
		InvalidConfigurationPropertyNameException cause = Mockito.mock(InvalidConfigurationPropertyNameException.class);
		BeanCreationException rootFailure = Mockito.mock(BeanCreationException.class);
		Mockito.when(cause.getName()).thenReturn(propertyName);
		Mockito.when(cause.getInvalidCharacters()).thenReturn(invalidCharacters);
		Mockito.when(rootFailure.getBeanName()).thenReturn(beanName);
		Mockito.when(rootFailure.getCause()).thenReturn(cause);
		try (MockedStatic<ResolvableType> resolvableTypeMockedStatic = Mockito.mockStatic(ResolvableType.class)) {
			ResolvableType resolvableType = Mockito.mock(ResolvableType.class);
			resolvableTypeMockedStatic.when(() -> ResolvableType.forClass(AbstractFailureAnalyzer.class, InvalidConfigurationPropertyNameFailureAnalyzer.class)).thenReturn(resolvableType);
			Mockito.when(resolvableType.resolveGeneric()).thenReturn((Class) InvalidConfigurationPropertyNameException.class);
			FailureAnalysis analysis = analyzer.analyze(rootFailure);
			assertNotNull(analysis);
			String expectedDescription = String.format("Configuration property name '%s' is not valid:%n%n    Invalid characters: '!', '@', '#'%n    Bean: %s%n    Reason: Canonical names should be kebab-case ('-' separated), lowercase alpha-numeric characters and must start with a letter", propertyName, beanName);
			String expectedAction = String.format("Modify '%s' so that it conforms to the canonical names requirements.", propertyName);
			assertEquals(expectedDescription, analysis.getDescription());
			assertEquals(expectedAction, analysis.getAction());
			assertEquals(cause, analysis.getCause());
		}
	}
}
