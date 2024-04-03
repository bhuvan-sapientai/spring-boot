package org.springframework.boot.context;

import org.springframework.boot.context.ApplicationPidFileWriter;

import org.springframework.boot.system.ApplicationPid;
import org.springframework.boot.context.*;

import java.lang.Class;
import java.io.File;
import java.lang.*;
import java.lang.IllegalStateException;

import org.springframework.util.*;

import java.io.*;

import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.util.Assert;
import org.springframework.boot.system.*;
import org.springframework.boot.context.event.SpringApplicationEvent;
import org.springframework.boot.context.event.*;

import java.util.Locale;

import org.apache.commons.logging.Log;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.core.Ordered;

import java.util.ArrayList;

import org.springframework.boot.context.event.ApplicationPreparedEvent;

import java.io.IOException;

import org.apache.commons.logging.LogFactory;

import java.util.concurrent.atomic.AtomicBoolean;

import org.springframework.util.Assert;
import org.springframework.boot.context.event.SpringApplicationEvent;
import org.springframework.boot.system.SystemProperties;
import org.springframework.boot.system.ApplicationPid;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.Environment;

import java.util.List;
import java.util.Collections;
import java.io.File;

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
public class ApplicationPidFileWriterOnApplicationEventEnhancedTest {

	@Mock
	private SpringApplicationEvent mockEvent;

	@Mock
	private ApplicationPreparedEvent mockPreparedEvent;

	@Mock
	private ApplicationContext mockApplicationContext;

	@Mock
	private Environment mockEnvironment;

	@Mock
	private File mockFile;

	private ApplicationPidFileWriter applicationPidFileWriter;

	@BeforeEach
	void setUp() {
		applicationPidFileWriter = new ApplicationPidFileWriter(mockFile);
	}

	@Test
	void testOnApplicationEventWithTriggerEventTypeAndCreatedFalse() throws IOException {
		when(mockPreparedEvent.getApplicationContext()).thenReturn(mockApplicationContext);
		when(mockApplicationContext.getEnvironment()).thenReturn(mockEnvironment);
		when(mockEnvironment.getProperty("spring.pid.file")).thenReturn("custom.pid");
		when(mockEvent.getClass()).thenReturn(ApplicationPreparedEvent.class);
		when(mockFile.createNewFile()).thenReturn(true);
		try (MockedStatic<ApplicationPid> applicationPidMockedStatic = mockStatic(ApplicationPid.class)) {
			applicationPidMockedStatic.when(() -> ApplicationPid.write(any(File.class))).thenReturn(null);
			applicationPidFileWriter.onApplicationEvent(mockPreparedEvent);
			applicationPidMockedStatic.verify(() -> ApplicationPid.write(any(File.class)), times(1));
			verify(mockFile, times(1)).deleteOnExit();
		}
	}

	@Test
	void testOnApplicationEventWithTriggerEventTypeAndCreatedTrue() {
		when(mockEvent.getClass()).thenReturn(ApplicationPreparedEvent.class);
		ApplicationPidFileWriter.created.set(true);
		applicationPidFileWriter.onApplicationEvent(mockEvent);
		verifyNoInteractions(mockFile);
	}

	@Test
	void testOnApplicationEventWithDifferentEventType() {
		when(mockEvent.getClass()).thenReturn(SpringApplicationEvent.class);
		applicationPidFileWriter.onApplicationEvent(mockEvent);
		verifyNoInteractions(mockFile);
	}

	@Test
	void testOnApplicationEventWithIOException() throws IOException {
		when(mockPreparedEvent.getApplicationContext()).thenReturn(mockApplicationContext);
		when(mockApplicationContext.getEnvironment()).thenReturn(mockEnvironment);
		when(mockEnvironment.getProperty("spring.pid.file")).thenReturn("custom.pid");
		when(mockEvent.getClass()).thenReturn(ApplicationPreparedEvent.class);
		when(mockFile.createNewFile()).thenReturn(true);
		try (MockedStatic<ApplicationPid> applicationPidMockedStatic = mockStatic(ApplicationPid.class)) {
			applicationPidMockedStatic.when(() -> ApplicationPid.write(any(File.class))).thenThrow(new IOException());
			try (MockedStatic<LogFactory> logFactoryMockedStatic = mockStatic(LogFactory.class)) {
				Log mockLogger = mock(Log.class);
				logFactoryMockedStatic.when(() -> LogFactory.getLog(ApplicationPidFileWriter.class)).thenReturn(mockLogger);
				applicationPidFileWriter.onApplicationEvent(mockPreparedEvent);
				verify(mockLogger, times(1)).warn(anyString(), any(IOException.class));
			}
		}
	}

	@Test
	void testOnApplicationEventWithIOExceptionAndFailOnWriteError() throws IOException {
		when(mockPreparedEvent.getApplicationContext()).thenReturn(mockApplicationContext);
		when(mockApplicationContext.getEnvironment()).thenReturn(mockEnvironment);
		when(mockEnvironment.getProperty("spring.pid.file")).thenReturn("custom.pid");
		when(mockEnvironment.getProperty("spring.pid.fail-on-write-error")).thenReturn("true");
		when(mockEvent.getClass()).thenReturn(ApplicationPreparedEvent.class);
		when(mockFile.createNewFile()).thenReturn(true);
		try (MockedStatic<ApplicationPid> applicationPidMockedStatic = mockStatic(ApplicationPid.class)) {
			applicationPidMockedStatic.when(() -> ApplicationPid.write(any(File.class))).thenThrow(new IOException());
			assertThrows(IllegalStateException.class, () -> applicationPidFileWriter.onApplicationEvent(mockPreparedEvent));
		}
	}
}
