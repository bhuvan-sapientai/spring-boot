package org.springframework.boot.availability;

import org.springframework.boot.availability.ApplicationAvailabilityBean;

import org.springframework.boot.availability.ApplicationAvailabilityBean;

import java.lang.Class;

import org.apache.commons.logging.impl.*;

import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.*;

import org.apache.commons.logging.impl.NoOpLog;

import java.lang.*;

import org.springframework.boot.availability.AvailabilityState;
import org.springframework.util.*;

import java.lang.Throwable;

import org.springframework.util.Assert;

import java.lang.Object;

import org.springframework.boot.availability.*;

import org.apache.commons.logging.LogFactory;

import org.springframework.util.Assert;

import org.apache.commons.logging.Log;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

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

class ApplicationAvailabilityBeanOnApplicationEventEnhancedTest {

	private ApplicationAvailabilityBean applicationAvailabilityBean;

	private Log logger;

	@BeforeEach
	void setUp() {
		logger = mock(Log.class);
		applicationAvailabilityBean = new ApplicationAvailabilityBean(logger);
	}

	@Test
	void testOnApplicationEventWithDebugEnabled() {
		// Given
		AvailabilityChangeEvent<?> event = mock(AvailabilityChangeEvent.class);
		AvailabilityState state = mock(AvailabilityState.class);
		when(event.getState()).thenReturn(state);
		when(logger.isDebugEnabled()).thenReturn(true);
		Class<? extends AvailabilityState> stateType = AvailabilityState.class;
		try (MockedStatic<LogFactory> logFactoryMockedStatic = Mockito.mockStatic(LogFactory.class)) {
			logFactoryMockedStatic.when(() -> LogFactory.getLog(ApplicationAvailabilityBean.class)).thenReturn(logger);
			// When
			applicationAvailabilityBean.onApplicationEvent(event);
			// Then
			verify(logger).isDebugEnabled();
			verify(logger).debug(any());
		}
	}

	@Test
	void testOnApplicationEventWithDebugDisabled() {
		// Given
		AvailabilityChangeEvent<?> event = mock(AvailabilityChangeEvent.class);
		AvailabilityState state = mock(AvailabilityState.class);
		when(event.getState()).thenReturn(state);
		when(logger.isDebugEnabled()).thenReturn(false);
		// When
		applicationAvailabilityBean.onApplicationEvent(event);
		// Then
		verify(logger).isDebugEnabled();
		verify(logger, never()).debug(any());
	}

	@Test
	void testOnApplicationEventWithEnumState() {
		// Given
		AvailabilityChangeEvent<?> event = mock(AvailabilityChangeEvent.class);
		Enum<?> enumState = mock(Enum.class);
		when(event.getState()).thenReturn((AvailabilityState) enumState);
		when(enumState.getDeclaringClass()).thenReturn((Class) enumState.getClass());
		// When
		applicationAvailabilityBean.onApplicationEvent(event);
		// Then
		verify(event).getState();
	}

	@Test
	void testOnApplicationEventWithNonEnumState() {
		// Given
		AvailabilityChangeEvent<?> event = mock(AvailabilityChangeEvent.class);
		AvailabilityState state = mock(AvailabilityState.class);
		when(event.getState()).thenReturn(state);
		// When
		applicationAvailabilityBean.onApplicationEvent(event);
		// Then
		verify(event).getState();
	}
}
