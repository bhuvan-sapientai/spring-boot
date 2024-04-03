package org.springframework.boot.context.config;

import org.springframework.boot.context.config.ConfigDataEnvironmentPostProcessor;

import java.util.Collection;

import org.springframework.core.env.*;

import java.util.List;
import java.lang.Class;

import org.springframework.boot.context.config.ConfigDataEnvironmentPostProcessor;

import org.apache.commons.logging.impl.*;

import org.springframework.boot.context.config.ConfigDataEnvironment;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.core.io.ResourceLoader;

import org.apache.commons.logging.impl.NoOpLog;

import org.springframework.boot.SpringApplication;
import org.springframework.core.env.ConfigurableEnvironment;

import java.lang.*;
import java.util.Set;

import org.springframework.boot.logging.*;
import org.springframework.boot.context.config.ConfigDataEnvironmentUpdateListener;
import org.springframework.core.io.*;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.boot.*;
import org.springframework.boot.logging.DeferredLogFactory;
import org.springframework.boot.context.config.*;

import java.util.*;

import org.springframework.core.io.ResourceLoader;
import org.springframework.boot.DefaultBootstrapContext;

import org.apache.commons.logging.Log;

import org.springframework.boot.SpringApplication;
import org.springframework.core.Ordered;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.boot.logging.DeferredLogFactory;
import org.springframework.core.env.Environment;

import java.util.Collection;
import java.util.function.Supplier;
import java.util.Collections;
import java.util.Arrays;

import org.springframework.core.io.DefaultResourceLoader;

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
public class ConfigDataEnvironmentPostProcessorApplyToEnhancedTest {

	@Mock
	private DeferredLogFactory logFactory;

	@Mock
	private ConfigurableBootstrapContext bootstrapContext;

	@Mock
	private ConfigDataEnvironmentUpdateListener environmentUpdateListener;

	@Mock
	private ConfigurableEnvironment environment;

	@Mock
	private ResourceLoader resourceLoader;

	private ConfigDataEnvironmentPostProcessor postProcessor;

	@BeforeEach
	public void setUp() {
		postProcessor = new ConfigDataEnvironmentPostProcessor(logFactory, bootstrapContext, environmentUpdateListener);
	}

	@Test
	public void testApplyToWithNonNullBootstrapContext() {
		List<String> additionalProfiles = Arrays.asList("dev", "test");
		try (MockedStatic<ConfigDataEnvironmentPostProcessor> mockedStatic = mockStatic(ConfigDataEnvironmentPostProcessor.class)) {
			mockedStatic.when(() -> ConfigDataEnvironmentPostProcessor.applyTo(environment, resourceLoader, bootstrapContext, additionalProfiles, environmentUpdateListener)).thenCallRealMethod();
			ConfigDataEnvironmentPostProcessor.applyTo(environment, resourceLoader, bootstrapContext, additionalProfiles, environmentUpdateListener);
			mockedStatic.verify(() -> ConfigDataEnvironmentPostProcessor.applyTo(environment, resourceLoader, bootstrapContext, additionalProfiles, environmentUpdateListener));
			verify(logFactory).getLog(ConfigDataEnvironmentPostProcessor.class);
			verifyNoMoreInteractions(logFactory);
			verifyNoInteractions(environmentUpdateListener);
		}
	}

	@Test
	public void testApplyToWithNullBootstrapContext() {
		List<String> additionalProfiles = Arrays.asList("dev", "test");
		try (MockedStatic<ConfigDataEnvironmentPostProcessor> mockedStatic = mockStatic(ConfigDataEnvironmentPostProcessor.class)) {
			mockedStatic.when(() -> ConfigDataEnvironmentPostProcessor.applyTo(environment, resourceLoader, null, additionalProfiles, environmentUpdateListener)).thenCallRealMethod();
			ConfigDataEnvironmentPostProcessor.applyTo(environment, resourceLoader, null, additionalProfiles, environmentUpdateListener);
			mockedStatic.verify(() -> ConfigDataEnvironmentPostProcessor.applyTo(environment, resourceLoader, null, additionalProfiles, environmentUpdateListener));
			verify(logFactory).getLog(ConfigDataEnvironmentPostProcessor.class);
			verifyNoMoreInteractions(logFactory);
			verifyNoInteractions(environmentUpdateListener);
		}
	}
}
