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

class FileEncodingApplicationListenerOnApplicationEventEnhancedTest {

	private FileEncodingApplicationListener listener;

	private ApplicationEnvironmentPreparedEvent event;

	private ConfigurableEnvironment environment;

	@BeforeEach
	void setUp() {
		listener = new FileEncodingApplicationListener();
		event = mock(ApplicationEnvironmentPreparedEvent.class);
		environment = mock(ConfigurableEnvironment.class);
		when(event.getEnvironment()).thenReturn(environment);
	}

	@AfterEach
	void tearDown() {
		// Close resources if needed
	}

	@Test
	void onApplicationEvent_WithNoMandatoryFileEncoding_ShouldNotThrowException() {
		when(environment.getProperty("spring.mandatory-file-encoding")).thenReturn(null);
		assertDoesNotThrow(() -> listener.onApplicationEvent(event));
	}

	@Test
	@Disabled
	void onApplicationEvent_WithMatchingFileEncoding_ShouldNotThrowException() {
		when(environment.getProperty("spring.mandatory-file-encoding")).thenReturn("UTF-8");
		try (MockedStatic<System> systemMockedStatic = Mockito.mockStatic(System.class)) {
			systemMockedStatic.when(() -> System.getProperty("file.encoding")).thenReturn("UTF-8");
			assertDoesNotThrow(() -> listener.onApplicationEvent(event));
		}
	}

	@Test
	@Disabled
	void onApplicationEvent_WithMismatchingFileEncoding_ShouldThrowException() {
		when(environment.getProperty("spring.mandatory-file-encoding")).thenReturn("UTF-8");
		try (MockedStatic<System> systemMockedStatic = Mockito.mockStatic(System.class);
			 MockedStatic<LogFactory> logFactoryMockedStatic = Mockito.mockStatic(LogFactory.class)) {
			systemMockedStatic.when(() -> System.getProperty("file.encoding")).thenReturn("ISO-8859-1");
			systemMockedStatic.when(() -> System.getenv("LANG")).thenReturn("some-lang");
			systemMockedStatic.when(() -> System.getenv("LC_ALL")).thenReturn("some-lc-all");
			Log logger = mock(Log.class);
			logFactoryMockedStatic.when(() -> LogFactory.getLog(FileEncodingApplicationListener.class)).thenReturn(logger);
			when(logger.isErrorEnabled()).thenReturn(true);
			IllegalStateException exception = assertThrows(IllegalStateException.class, () -> listener.onApplicationEvent(event));
			assertEquals("The Java Virtual Machine has not been configured to use the desired default character encoding (UTF-8).", exception.getMessage());
		}
	}
}
