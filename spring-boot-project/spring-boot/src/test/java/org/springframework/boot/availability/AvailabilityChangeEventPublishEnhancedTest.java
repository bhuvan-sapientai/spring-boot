package org.springframework.boot.availability;

import org.springframework.boot.availability.AvailabilityChangeEvent;

import java.lang.Class;

import org.springframework.context.ApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.*;

import java.lang.*;

import org.springframework.boot.availability.AvailabilityState;
import org.springframework.util.*;
import org.springframework.util.Assert;

import java.lang.Object;

import org.springframework.boot.availability.*;
import org.springframework.core.*;
import org.springframework.context.ApplicationContext;
import org.springframework.util.Assert;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.PayloadApplicationEvent;
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

class AvailabilityChangeEventPublishEnhancedTest {

	private ApplicationEventPublisher publisher;

	private Object source;

	private AvailabilityState state;

	@BeforeEach
	void setUp() {
		publisher = Mockito.mock(ApplicationEventPublisher.class);
		source = new Object();
		state = Mockito.mock(AvailabilityState.class);
	}

	@AfterEach
	void tearDown() {
		Mockito.verifyNoMoreInteractions(publisher, state);
	}

	@Test
	void testPublish() {
		try (MockedStatic<Assert> mockedAssert = Mockito.mockStatic(Assert.class)) {
			AvailabilityChangeEvent.publish(publisher, source, state);
			mockedAssert.verify(() -> Assert.notNull(publisher, "Publisher must not be null"));
			verify(publisher, times(1)).publishEvent(any(AvailabilityChangeEvent.class));
		}
	}

	@Test
	void testPublishWithNullPublisher() {
		try (MockedStatic<Assert> mockedAssert = Mockito.mockStatic(Assert.class)) {
			Exception exception = org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> {
				AvailabilityChangeEvent.publish(null, source, state);
			});
			mockedAssert.verify(() -> Assert.notNull(null, "Publisher must not be null"));
			Mockito.verifyNoInteractions(publisher);
		}
	}
}
