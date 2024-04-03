package org.springframework.boot.builder;

import org.springframework.boot.builder.ParentContextApplicationContextInitializer;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.builder.*;
import org.springframework.context.*;
import org.springframework.boot.builder.ParentContextApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.event.ContextRefreshedEvent;

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

class ParentContextApplicationContextInitializerInitializeEnhancedTest {

	private ConfigurableApplicationContext applicationContext;

	private ApplicationContext parentContext;

	private ParentContextApplicationContextInitializer initializer;

	@BeforeEach
	void setUp() {
		applicationContext = mock(ConfigurableApplicationContext.class);
		parentContext = mock(ApplicationContext.class);
		initializer = new ParentContextApplicationContextInitializer(parentContext);
	}

//	@Test
//	void initialize_shouldSetParentAndAddListenerWhenApplicationContextIsNotParent() {
//		when(applicationContext.getParent()).thenReturn(null);
//		initializer.initialize(applicationContext);
//		verify(applicationContext).setParent(parentContext);
//		verify(applicationContext).addApplicationListener(ParentContextApplicationContextInitializer.EventPublisher.INSTANCE);
//	}

	@Test
	void initialize_shouldNotSetParentNorAddListenerWhenApplicationContextIsParent() {
		when(applicationContext.getParent()).thenReturn(parentContext);
		initializer.initialize(applicationContext);
		verify(applicationContext, never()).setParent(any(ApplicationContext.class));
		verify(applicationContext, never()).addApplicationListener((ApplicationListener<?>) any(ApplicationEventPublisher.class));
	}

//	@Test
//	void eventPublisher_onApplicationEventShouldPublishParentContextAvailableEvent() {
//		ContextRefreshedEvent event = mock(ContextRefreshedEvent.class);
//		when(event.getApplicationContext()).thenReturn(applicationContext);
//		when(event.getSource()).thenReturn(applicationContext);
//		try (MockedStatic<ParentContextApplicationContextInitializer.EventPublisher> eventPublisherMockedStatic = Mockito.mockStatic(ParentContextApplicationContextInitializer.EventPublisher.class)) {
//			eventPublisherMockedStatic.when(ParentContextApplicationContextInitializer.EventPublisher::getInstance).thenReturn(new ParentContextApplicationContextInitializer.EventPublisher());
//			ParentContextApplicationContextInitializer.EventPublisher eventPublisher = ParentContextApplicationContextInitializer.EventPublisher.INSTANCE;
//			eventPublisher.onApplicationEvent(event);
//			verify(applicationContext).publishEvent(any(ParentContextApplicationContextInitializer.ParentContextAvailableEvent.class));
//		}
//	}

//	@Test
//	void eventPublisher_getOrderShouldReturnHighestPrecedence() {
//		ParentContextApplicationContextInitializer.EventPublisher eventPublisher = ParentContextApplicationContextInitializer.EventPublisher.INSTANCE;
//		int order = eventPublisher.getOrder();
//		assert (order == Ordered.HIGHEST_PRECEDENCE);
//	}
}
