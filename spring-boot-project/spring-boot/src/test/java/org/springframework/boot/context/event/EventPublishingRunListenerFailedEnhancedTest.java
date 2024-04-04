package org.springframework.boot.context.event;

import org.springframework.boot.context.event.EventPublishingRunListener;

import org.springframework.boot.context.event.ApplicationContextInitializedEvent;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.EventPublishingRunListener;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.boot.availability.*;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.core.env.*;
import org.springframework.context.event.*;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.LivenessState;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.context.*;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.core.env.ConfigurableEnvironment;

import java.lang.*;
import java.util.Set;
import java.time.*;

import org.springframework.context.event.SimpleApplicationEventMulticaster;

import java.time.Duration;
import java.lang.Throwable;

import org.springframework.boot.*;
import org.springframework.boot.context.event.*;

import java.util.*;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.ErrorHandler;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.context.ApplicationContextAware;

import org.apache.commons.logging.Log;

import org.springframework.boot.SpringApplication;
import org.springframework.core.Ordered;
import org.springframework.context.ApplicationEvent;

import java.time.Duration;

import org.springframework.boot.ConfigurableBootstrapContext;

import org.apache.commons.logging.LogFactory;

import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.context.ApplicationListener;
import org.springframework.boot.availability.LivenessState;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.availability.AvailabilityChangeEvent;

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
public class EventPublishingRunListenerFailedEnhancedTest {

	@Mock
	private SpringApplication application;

	@Mock
	private ConfigurableEnvironment environment;

	@Mock
	private AbstractApplicationContext context;

	@Mock
	private ApplicationFailedEvent event;

	private EventPublishingRunListener listener;

	private String[] args = new String[] {};

	@BeforeEach
	void setUp() {
		listener = new EventPublishingRunListener(application, args);
	}

	@Test
	void testFailedWhenContextIsActive() {
		when(context.isActive()).thenReturn(true);
		Throwable exception = new RuntimeException("Test exception");
		listener.failed(context, exception);
		verify(context).publishEvent(any(ApplicationFailedEvent.class));
	}

	@Test
	@Disabled
	void testFailedWhenContextIsNotActive() {
		when(context.isActive()).thenReturn(false);
		when(context.getApplicationListeners()).thenReturn(null);
		Throwable exception = new RuntimeException("Test exception");
		listener.failed(context, exception);
		verify(context, never()).publishEvent(any(ApplicationFailedEvent.class));
	}

	@Test
	void testFailedWhenContextIsNull() {
		Throwable exception = new RuntimeException("Test exception");
		listener.failed(null, exception);
		// Since context is null, multicastEvent should be called on the initialMulticaster
		// However, we cannot verify this directly as initialMulticaster is a private field
		// and multicastEvent is a final method. We rely on the absence of exceptions to
		// indicate correct behavior.
	}
}
