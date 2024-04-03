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

class SpringApplicationAdminMXBeanRegistrarAfterPropertiesSetEnhancedTest {

	private SpringApplicationAdminMXBeanRegistrar registrar;

	private MBeanServer mBeanServerMock;

	private MockedStatic<ManagementFactory> managementFactoryMockedStatic;

	@BeforeEach
	void setUp() throws Exception {
		mBeanServerMock = mock(MBeanServer.class);
		managementFactoryMockedStatic = Mockito.mockStatic(ManagementFactory.class);
		managementFactoryMockedStatic.when(ManagementFactory::getPlatformMBeanServer).thenReturn(mBeanServerMock);
		registrar = new SpringApplicationAdminMXBeanRegistrar("org.springframework.boot.admin:name=SpringApplicationAdmin");
	}

	@AfterEach
	void tearDown() {
		managementFactoryMockedStatic.close();
	}

//	@Test
//	void afterPropertiesSet_registersMBean() throws Exception {
//		registrar.afterPropertiesSet();
//		verify(mBeanServerMock).registerMBean(any(SpringApplicationAdminMXBeanRegistrar.SpringApplicationAdmin.class), any(ObjectName.class));
//	}
//
//	@Test
//	void afterPropertiesSet_logsDebugMessage() throws Exception {
//		Log loggerMock = mock(Log.class);
//		MockedStatic<LogFactory> logFactoryMockedStatic = Mockito.mockStatic(LogFactory.class);
//		logFactoryMockedStatic.when(() -> LogFactory.getLog(SpringApplicationAdmin.class)).thenReturn(loggerMock);
//		when(loggerMock.isDebugEnabled()).thenReturn(true);
//		registrar.afterPropertiesSet();
//		verify(loggerMock).debug(startsWith("Application Admin MBean registered with name '"));
//		logFactoryMockedStatic.close();
//	}
}
