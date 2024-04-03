package org.springframework.boot.admin;

import org.springframework.boot.admin.SpringApplicationAdminMXBeanRegistrar;

import org.springframework.context.ApplicationEvent;
import org.springframework.core.env.*;

import java.lang.Class;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.boot.web.context.*;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.Environment;
import org.springframework.context.*;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.lang.*;

import org.springframework.util.*;
import org.springframework.boot.admin.*;
import org.springframework.boot.admin.SpringApplicationAdminMXBeanRegistrar;
import org.springframework.util.Assert;
import org.springframework.boot.context.event.*;
import org.springframework.core.*;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.GenericApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.EnvironmentAware;

import javax.management.MalformedObjectNameException;

import org.springframework.context.ApplicationContextAware;

import org.apache.commons.logging.Log;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.core.Ordered;
import org.springframework.context.ApplicationEvent;

import java.lang.management.ManagementFactory;

import javax.management.ObjectName;

import org.apache.commons.logging.LogFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.util.Assert;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.beans.BeansException;

import javax.management.MBeanServer;

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
public class SpringApplicationAdminMXBeanRegistrarSetEnvironmentEnhancedTest {

	private SpringApplicationAdminMXBeanRegistrar registrar;

	@Mock
	private Environment mockEnvironment;

	@Mock
	private ConfigurableApplicationContext mockApplicationContext;

	@BeforeEach
	void setUp() throws MalformedObjectNameException {
		registrar = new SpringApplicationAdminMXBeanRegistrar("org.springframework.boot:type=Admin,name=SpringApplication");
	}

	@Test
	void setEnvironmentShouldSetTheEnvironment() {
		// Arrange
		// Environment mockEnvironment is already set up
		// Act
		registrar.setEnvironment(mockEnvironment);
		// Assert
		// No direct way to assert the set value as the field is private and there is no getter.
		// However, we can indirectly test if the environment was set by calling a method that uses it.
		String key = "test.property";
		String expectedValue = "expectedValue";
		when(mockEnvironment.getProperty(key)).thenReturn(expectedValue);
		// Accessing the inner class to test the environment
		SpringApplicationAdminMXBeanRegistrar.SpringApplicationAdmin admin = registrar.new SpringApplicationAdmin();
		String actualValue = admin.getProperty(key);
		verify(mockEnvironment).getProperty(key);
		assert actualValue.equals(expectedValue) : "The environment should return the expected property value";
	}
}
