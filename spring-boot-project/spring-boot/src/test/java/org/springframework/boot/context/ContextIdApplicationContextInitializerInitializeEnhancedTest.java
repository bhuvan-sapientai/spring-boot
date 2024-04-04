package org.springframework.boot.context;

import org.springframework.boot.context.ContextIdApplicationContextInitializer;

import org.springframework.boot.context.ContextIdApplicationContextInitializer.ContextId;
import org.springframework.core.env.*;
import org.springframework.boot.context.*;

import java.lang.Class;

import org.springframework.context.ApplicationContext;
import org.springframework.util.StringUtils;
import org.springframework.context.*;
import org.springframework.boot.context.ContextIdApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.lang.*;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.util.*;
import org.springframework.beans.factory.config.*;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.ApplicationContext;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.util.StringUtils;
import org.springframework.core.Ordered;
import org.springframework.context.ApplicationContextInitializer;

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

class ContextIdApplicationContextInitializerInitializeEnhancedTest {

	private ContextIdApplicationContextInitializer initializer;

	private ConfigurableApplicationContext applicationContext;

	private ConfigurableEnvironment environment;

	private ApplicationContext parent;

	private ConfigurableListableBeanFactory beanFactory;

	@BeforeEach
	void setUp() {
		initializer = new ContextIdApplicationContextInitializer();
		applicationContext = mock(ConfigurableApplicationContext.class);
		environment = mock(ConfigurableEnvironment.class);
		parent = mock(ApplicationContext.class);
		beanFactory = mock(ConfigurableListableBeanFactory.class);
		when(applicationContext.getEnvironment()).thenReturn(environment);
		when(applicationContext.getBeanFactory()).thenReturn(beanFactory);
	}

	@Test
	@Disabled
	void testInitializeWithNoParent() {
		when(applicationContext.getParent()).thenReturn(null);
		when(environment.getProperty("spring.application.name")).thenReturn("testApp");
		try (MockedStatic<StringUtils> utils = Mockito.mockStatic(StringUtils.class)) {
			utils.when(() -> StringUtils.hasText(anyString())).thenReturn(true);
			initializer.initialize(applicationContext);
			verify(applicationContext).setId("testApp");
			verify(beanFactory).registerSingleton(ContextId.class.getName(), any(ContextIdApplicationContextInitializer.ContextId.class));
		}
	}

	@Test
	@Disabled
	void testInitializeWithParentAndNoContextIdBean() {
		when(applicationContext.getParent()).thenReturn(parent);
		when(parent.containsBean(ContextId.class.getName())).thenReturn(false);
		when(environment.getProperty("spring.application.name")).thenReturn("testApp");
		try (MockedStatic<StringUtils> utils = Mockito.mockStatic(StringUtils.class)) {
			utils.when(() -> StringUtils.hasText(anyString())).thenReturn(true);
			initializer.initialize(applicationContext);
			verify(applicationContext).setId("testApp");
			verify(beanFactory).registerSingleton(ContextId.class.getName(), any(ContextIdApplicationContextInitializer.ContextId.class));
		}
	}

	@Test
	@Disabled
	void testInitializeWithParentAndContextIdBean() {
		ContextIdApplicationContextInitializer.ContextId parentContextId = new ContextIdApplicationContextInitializer.ContextId("parentApp");
		when(applicationContext.getParent()).thenReturn(parent);
		when(parent.containsBean(ContextId.class.getName())).thenReturn(true);
		when(parent.getBean(ContextId.class)).thenReturn(parentContextId);
		initializer.initialize(applicationContext);
		verify(applicationContext).setId("parentApp-1");
		verify(beanFactory).registerSingleton(ContextId.class.getName(), any(ContextIdApplicationContextInitializer.ContextId.class));
	}
}
