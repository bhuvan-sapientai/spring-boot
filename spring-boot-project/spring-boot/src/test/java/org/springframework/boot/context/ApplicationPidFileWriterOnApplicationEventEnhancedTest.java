package org.springframework.boot.context;

import org.springframework.boot.context.ApplicationPidFileWriter;

import org.springframework.boot.system.ApplicationPid;
import org.springframework.boot.context.*;

import java.lang.Class;
import java.io.File;
import java.lang.*;
import java.lang.IllegalStateException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
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
class ApplicationPidFileWriterOnApplicationEventEnhancedTest {

	@Mock
	private SpringApplicationEvent mockEvent;

	@Mock
	private ApplicationContext mockApplicationContext;

	@Mock
	private Environment mockEnvironment;

	@Mock
	private ApplicationPreparedEvent mockPreparedEvent;

	@Mock
	private ApplicationEnvironmentPreparedEvent mockEnvironmentPreparedEvent;

	@Mock
	private ApplicationReadyEvent mockReadyEvent;

	private ApplicationPidFileWriter writer;

	private File pidFile;

	private MockedStatic<ApplicationPid> applicationPidMockedStatic;

	private MockedStatic<Assert> assertMockedStatic;

	private MockedStatic<SystemProperties> systemPropertiesMockedStatic;

	@BeforeEach
	void setUp() {
		pidFile = new File("test.pid");
		writer = new ApplicationPidFileWriter(pidFile);
		applicationPidMockedStatic = Mockito.mockStatic(ApplicationPid.class);
		assertMockedStatic = Mockito.mockStatic(Assert.class);
		systemPropertiesMockedStatic = Mockito.mockStatic(SystemProperties.class);
	}

	@AfterEach
	void tearDown() {
		applicationPidMockedStatic.close();
		assertMockedStatic.close();
		systemPropertiesMockedStatic.close();
	}

//	@Test
//	void onApplicationEvent_whenTriggerEventTypeAndNotCreated_shouldWritePidFile() throws IOException {
//		when(mockPreparedEvent.getApplicationContext()).thenReturn(mockApplicationContext);
//		when(mockApplicationContext.getEnvironment()).thenReturn(mockEnvironment);
//		when(mockEnvironment.getProperty("spring.pid.file")).thenReturn(null);
//		when(mockEnvironment.getProperty("spring.pid.fail-on-write-error")).thenReturn("false");
//		when(mockPreparedEvent.getClass()).thenReturn(ApplicationPreparedEvent.class);
//		writer.onApplicationEvent(mockPreparedEvent);
//		applicationPidMockedStatic.verify(() -> ApplicationPid.write(pidFile), times(1));
//	}

//	@Test
//	void onApplicationEvent_whenTriggerEventTypeAndNotCreatedAndFailOnWriteError_shouldThrowException() {
//		when(mockPreparedEvent.getApplicationContext()).thenReturn((ConfigurableApplicationContext) mockApplicationContext);
//		when(mockApplicationContext.getEnvironment()).thenReturn(mockEnvironment);
//		when(mockEnvironment.getProperty("spring.pid.file")).thenReturn(null);
//		when(mockEnvironment.getProperty("spring.pid.fail-on-write-error")).thenReturn("true");
//		when(mockPreparedEvent.getClass()).thenReturn(ApplicationPreparedEvent.class);
//		IOException ioException = new IOException("Test IOException");
//		applicationPidMockedStatic.when(() -> ApplicationPid.write(pidFile)).thenThrow(ioException);
//		Exception exception = assertThrows(IllegalStateException.class, () -> writer.onApplicationEvent(mockPreparedEvent));
//		assertEquals("Cannot create pid file test.pid", exception.getMessage());
//	}

//	@Test
//	void onApplicationEvent_whenTriggerEventTypeAndNotCreatedAndOverridePidFile_shouldWriteToOverrideFile() throws IOException {
//		String overrideFilename = "override.pid";
//		File overrideFile = new File(overrideFilename);
//		when(mockPreparedEvent.getApplicationContext()).thenReturn(mockApplicationContext);
//		when(mockApplicationContext.getEnvironment()).thenReturn(mockEnvironment);
//		when(mockEnvironment.getProperty("spring.pid.file")).thenReturn(overrideFilename);
//		when(mockEnvironment.getProperty("spring.pid.fail-on-write-error")).thenReturn("false");
//		when(mockPreparedEvent.getClass()).thenReturn(ApplicationPreparedEvent.class);
//		writer.onApplicationEvent(mockPreparedEvent);
//		applicationPidMockedStatic.verify(() -> ApplicationPid.write(overrideFile), times(1));
//	}

//	@Test
//	void onApplicationEvent_whenNotTriggerEventType_shouldNotWritePidFile() {
//		when(mockEvent.getClass()).thenReturn(SpringApplicationEvent.class);
//		writer.onApplicationEvent(mockEvent);
//		applicationPidMockedStatic.verifyNoInteractions();
//	}
}
