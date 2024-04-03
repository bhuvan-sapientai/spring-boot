package org.springframework.boot.context;

import org.springframework.boot.context.FileEncodingApplicationListener;

import java.lang.*;

import org.springframework.core.env.*;

import java.lang.IllegalStateException;

import org.springframework.boot.context.*;
import org.springframework.boot.context.FileEncodingApplicationListener;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.*;
import org.springframework.core.env.ConfigurableEnvironment;

import org.apache.commons.logging.LogFactory;

import org.springframework.core.env.ConfigurableEnvironment;

import org.apache.commons.logging.Log;

import org.springframework.core.Ordered;
import org.springframework.context.ApplicationListener;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;

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
public class FileEncodingApplicationListenerOnApplicationEventEnhancedTest {

	@Mock
	private ApplicationEnvironmentPreparedEvent event;

	@Mock
	private ConfigurableEnvironment environment;

	private FileEncodingApplicationListener listener;

	@BeforeEach
	void setUp() {
		listener = new FileEncodingApplicationListener();
		when(event.getEnvironment()).thenReturn(environment);
	}

	@Test
	void onApplicationEvent_WhenDesiredFileEncodingIsNull_ShouldDoNothing() {
		when(environment.getProperty("spring.mandatory-file-encoding")).thenReturn(null);
		listener.onApplicationEvent(event);
		verify(environment).getProperty("spring.mandatory-file-encoding");
		verifyNoMoreInteractions(environment);
	}

	@Test
	void onApplicationEvent_WhenFileEncodingMatches_ShouldDoNothing() {
		when(environment.getProperty("spring.mandatory-file-encoding")).thenReturn("UTF-8");
		try (MockedStatic<System> systemMockedStatic = mockStatic(System.class)) {
			systemMockedStatic.when(() -> System.getProperty("file.encoding")).thenReturn("UTF-8");
			listener.onApplicationEvent(event);
			systemMockedStatic.verify(() -> System.getProperty("file.encoding"));
		}
	}

	@Test
	void onApplicationEvent_WhenFileEncodingDoesNotMatch_ShouldLogErrorAndThrowException() {
		when(environment.getProperty("spring.mandatory-file-encoding")).thenReturn("UTF-8");
		try (MockedStatic<System> systemMockedStatic = mockStatic(System.class);
			 MockedStatic<LogFactory> logFactoryMockedStatic = mockStatic(LogFactory.class)) {
			systemMockedStatic.when(() -> System.getProperty("file.encoding")).thenReturn("ISO-8859-1");
			systemMockedStatic.when(() -> System.getenv("LANG")).thenReturn("some-lang");
			systemMockedStatic.when(() -> System.getenv("LC_ALL")).thenReturn("some-lc-all");
			Log loggerMock = mock(Log.class);
			logFactoryMockedStatic.when(() -> LogFactory.getLog(FileEncodingApplicationListener.class)).thenReturn(loggerMock);
			when(loggerMock.isErrorEnabled()).thenReturn(true);
			IllegalStateException exception = assertThrows(IllegalStateException.class, () -> listener.onApplicationEvent(event));
			assertEquals("The Java Virtual Machine has not been configured to use the desired default character encoding (UTF-8).", exception.getMessage());
			verify(loggerMock).isErrorEnabled();
			verify(loggerMock).error("System property 'file.encoding' is currently 'ISO-8859-1'. It should be 'UTF-8' (as defined in 'spring.mandatoryFileEncoding').");
			verify(loggerMock).error("Environment variable LANG is 'some-lang'. You could use a locale setting that matches encoding='UTF-8'.");
			verify(loggerMock).error("Environment variable LC_ALL is 'some-lc-all'. You could use a locale setting that matches encoding='UTF-8'.");
		}
	}
}
