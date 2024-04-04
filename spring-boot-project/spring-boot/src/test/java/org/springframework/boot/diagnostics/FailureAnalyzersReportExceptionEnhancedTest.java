package org.springframework.boot.diagnostics;

import org.springframework.boot.diagnostics.FailureAnalyzers;

import org.springframework.boot.diagnostics.FailureAnalyzer;

import java.util.List;
import java.lang.Class;

import org.apache.commons.logging.impl.*;

import org.springframework.boot.diagnostics.FailureAnalysisReporter;
import org.springframework.core.log.*;
import org.springframework.boot.diagnostics.*;
import org.springframework.context.*;
import org.springframework.context.ConfigurableApplicationContext;

import org.apache.commons.logging.impl.NoOpLog;

import org.springframework.core.log.LogMessage;

import java.lang.*;

import org.springframework.boot.diagnostics.FailureAnalyzers;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.boot.diagnostics.FailureAnalysis;

import java.lang.Throwable;

import org.springframework.core.io.support.*;

import java.util.*;

import org.springframework.context.ConfigurableApplicationContext;

import org.apache.commons.logging.LogFactory;

import org.springframework.core.log.LogMessage;

import org.apache.commons.logging.Log;

import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.core.io.support.SpringFactoriesLoader.FailureHandler;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.env.Environment;

import java.util.List;

import org.springframework.core.io.support.SpringFactoriesLoader.ArgumentResolver;
import org.springframework.boot.SpringBootExceptionReporter;

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

class FailureAnalyzersReportExceptionEnhancedTest {

	private ConfigurableApplicationContext context;

	private SpringFactoriesLoader springFactoriesLoader;

	private FailureAnalyzers failureAnalyzers;

	private Throwable failure;

	private FailureAnalysis failureAnalysis;

	private FailureAnalyzer failureAnalyzer;

	private FailureAnalysisReporter failureAnalysisReporter;

	@BeforeEach
	void setUp() {
		context = mock(ConfigurableApplicationContext.class);
		springFactoriesLoader = mock(SpringFactoriesLoader.class);
		failureAnalyzers = new FailureAnalyzers(context, springFactoriesLoader);
		failure = mock(Throwable.class);
		failureAnalysis = mock(FailureAnalysis.class);
		failureAnalyzer = mock(FailureAnalyzer.class);
		failureAnalysisReporter = mock(FailureAnalysisReporter.class);
	}

	@Test
	void reportException_whenAnalysisIsNull_shouldReturnFalse() {
		when(springFactoriesLoader.load(FailureAnalyzer.class)).thenReturn(Collections.emptyList());
		when(springFactoriesLoader.load(FailureAnalysisReporter.class)).thenReturn(Collections.emptyList());
		boolean result = failureAnalyzers.reportException(failure);
		assertFalse(result);
	}

	@Test
	void reportException_whenAnalysisIsNotNullAndReportersAreEmpty_shouldReturnFalse() {
		when(springFactoriesLoader.load(FailureAnalyzer.class)).thenReturn(Collections.singletonList(failureAnalyzer));
		when(failureAnalyzer.analyze(failure)).thenReturn(failureAnalysis);
		when(springFactoriesLoader.load(FailureAnalysisReporter.class)).thenReturn(Collections.emptyList());
		boolean result = failureAnalyzers.reportException(failure);
		assertFalse(result);
	}

	@Test
	@Disabled
	void reportException_whenAnalysisIsNotNullAndReportersAreNotEmpty_shouldReturnTrue() {
		when(springFactoriesLoader.load(FailureAnalyzer.class)).thenReturn(Collections.singletonList(failureAnalyzer));
		when(failureAnalyzer.analyze(failure)).thenReturn(failureAnalysis);
		when(springFactoriesLoader.load(FailureAnalysisReporter.class)).thenReturn(Collections.singletonList(failureAnalysisReporter));
		boolean result = failureAnalyzers.reportException(failure);
		assertTrue(result);
		verify(failureAnalysisReporter).report(failureAnalysis);
	}

	@Test
	@Disabled
	void reportException_whenAnalyzerThrowsException_shouldContinueAnalysis() {
		when(springFactoriesLoader.load(FailureAnalyzer.class)).thenReturn(Arrays.asList(failureAnalyzer, failureAnalyzer));
		when(failureAnalyzer.analyze(failure)).thenThrow(new RuntimeException()).thenReturn(failureAnalysis);
		when(springFactoriesLoader.load(FailureAnalysisReporter.class)).thenReturn(Collections.singletonList(failureAnalysisReporter));
		try (MockedStatic<LogMessage> logMessageMockedStatic = Mockito.mockStatic(LogMessage.class)) {
			logMessageMockedStatic.when(() -> LogMessage.format(any(String.class), any(FailureAnalyzer.class))).thenReturn(mock(LogMessage.class));
			boolean result = failureAnalyzers.reportException(failure);
			assertTrue(result);
			verify(failureAnalysisReporter).report(failureAnalysis);
		}
	}
}
