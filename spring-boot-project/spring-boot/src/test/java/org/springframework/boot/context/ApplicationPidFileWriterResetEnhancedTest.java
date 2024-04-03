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

public class ApplicationPidFileWriterResetEnhancedTest {

	private MockedStatic<ApplicationPidFileWriter> applicationPidFileWriterMockedStatic;

	private MockedStatic<SystemProperties> systemPropertiesMockedStatic;

	private MockedStatic<AtomicBoolean> atomicBooleanMockedStatic;

	@BeforeEach
	void setUp() {
		applicationPidFileWriterMockedStatic = Mockito.mockStatic(ApplicationPidFileWriter.class);
		systemPropertiesMockedStatic = Mockito.mockStatic(SystemProperties.class);
		atomicBooleanMockedStatic = Mockito.mockStatic(AtomicBoolean.class);
	}

	@AfterEach
	void tearDown() {
		applicationPidFileWriterMockedStatic.close();
		systemPropertiesMockedStatic.close();
		atomicBooleanMockedStatic.close();
	}

	@Test
	void testReset() {
		// Given
		AtomicBoolean created = new AtomicBoolean(true);
		// When
		applicationPidFileWriterMockedStatic.when(ApplicationPidFileWriter::reset).then(invocation -> {
			created.set(false);
			return null;
		});
		// Invoke the static reset method
		ApplicationPidFileWriter.reset();
		// Then
		assertFalse(created.get());

	}
}
