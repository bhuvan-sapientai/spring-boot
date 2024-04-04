package org.springframework.boot.diagnostics;

import org.springframework.boot.diagnostics.LoggingFailureAnalysisReporter;

import java.lang.*;

import org.springframework.util.*;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.util.StringUtils;
import org.springframework.boot.diagnostics.LoggingFailureAnalysisReporter;

import java.lang.Throwable;

import org.springframework.boot.diagnostics.*;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

import org.springframework.util.StringUtils;

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
public class LoggingFailureAnalysisReporterReportEnhancedTest {

	@Mock
	private FailureAnalysis failureAnalysis;

	private LoggingFailureAnalysisReporter reporter;

	@BeforeEach
	public void setUp() {
		reporter = new LoggingFailureAnalysisReporter();
	}

	@Test
	@Disabled
	public void testReportWithDebugEnabled() {
		try (MockedStatic<LogFactory> logFactoryMockedStatic = mockStatic(LogFactory.class);
			 MockedStatic<StringUtils> stringUtilsMockedStatic = mockStatic(StringUtils.class)) {
			Log mockLogger = mock(Log.class);
			logFactoryMockedStatic.when(() -> LogFactory.getLog(LoggingFailureAnalysisReporter.class)).thenReturn(mockLogger);
			when(mockLogger.isDebugEnabled()).thenReturn(true);
			when(mockLogger.isErrorEnabled()).thenReturn(true);
			when(failureAnalysis.getCause()).thenReturn(new Exception("Test Exception"));
			when(failureAnalysis.getDescription()).thenReturn("Test Description");
			when(failureAnalysis.getAction()).thenReturn("Test Action");
			stringUtilsMockedStatic.when(() -> StringUtils.hasText(anyString())).thenReturn(true);
			reporter.report(failureAnalysis);
			verify(mockLogger).debug(eq("Application failed to start due to an exception"), any(Throwable.class));
			verify(mockLogger).error(contains("APPLICATION FAILED TO START"));
			verify(mockLogger).error(contains("Description:"));
			verify(mockLogger).error(contains("Test Description"));
			verify(mockLogger).error(contains("Action:"));
			verify(mockLogger).error(contains("Test Action"));
		}
	}

	@Test
	@Disabled
	public void testReportWithErrorEnabledAndNoAction() {
		try (MockedStatic<LogFactory> logFactoryMockedStatic = mockStatic(LogFactory.class);
			 MockedStatic<StringUtils> stringUtilsMockedStatic = mockStatic(StringUtils.class)) {
			Log mockLogger = mock(Log.class);
			logFactoryMockedStatic.when(() -> LogFactory.getLog(LoggingFailureAnalysisReporter.class)).thenReturn(mockLogger);
			when(mockLogger.isDebugEnabled()).thenReturn(false);
			when(mockLogger.isErrorEnabled()).thenReturn(true);
			when(failureAnalysis.getDescription()).thenReturn("Test Description");
			when(failureAnalysis.getAction()).thenReturn("");
			stringUtilsMockedStatic.when(() -> StringUtils.hasText(anyString())).thenReturn(false);
			reporter.report(failureAnalysis);
			verify(mockLogger, never()).debug(anyString(), any(Throwable.class));
			verify(mockLogger).error(contains("APPLICATION FAILED TO START"));
			verify(mockLogger).error(contains("Description:"));
			verify(mockLogger).error(contains("Test Description"));
			verify(mockLogger, never()).error(contains("Action:"));
		}
	}
}
