package org.springframework.boot.cloud;

import org.springframework.boot.cloud.CloudFoundryVcapEnvironmentPostProcessor;

import java.util.Collection;

import org.springframework.core.env.*;

import java.lang.Class;

import org.apache.commons.logging.impl.*;

import java.util.Map;

import org.springframework.util.StringUtils;
import org.springframework.boot.json.JsonParser;

import org.apache.commons.logging.impl.NoOpLog;

import org.springframework.boot.SpringApplication;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.boot.json.JsonParserFactory;

import java.lang.*;

import org.springframework.util.*;
import org.springframework.boot.logging.*;
import org.springframework.boot.json.*;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.boot.cloud.CloudFoundryVcapEnvironmentPostProcessor;
import org.springframework.boot.*;
import org.springframework.boot.cloud.*;

import java.lang.Object;

import org.springframework.boot.logging.DeferredLogFactory;

import java.util.*;

import org.apache.commons.logging.Log;

import org.springframework.boot.SpringApplication;
import org.springframework.core.Ordered;
import org.springframework.boot.context.config.ConfigDataEnvironmentPostProcessor;
import org.springframework.core.env.CommandLinePropertySource;

import java.util.Properties;

import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.util.StringUtils;
import org.springframework.boot.logging.DeferredLogFactory;
import org.springframework.core.env.Environment;

import java.util.Collection;
import java.util.List;

import org.springframework.core.env.MutablePropertySources;

import java.util.Collections;
import java.util.Map;

import org.springframework.boot.json.JsonParser;

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
public class CloudFoundryVcapEnvironmentPostProcessorPostProcessEnvironmentEnhancedTest {

	@Mock
	private DeferredLogFactory logFactory;

	@Mock
	private Log logger;

	@Mock
	private ConfigurableEnvironment environment;

	@Mock
	private SpringApplication application;

	@Mock
	private MutablePropertySources propertySources;

	@Mock
	private JsonParser jsonParser;

	private CloudFoundryVcapEnvironmentPostProcessor processor;

	@BeforeEach
	public void setUp() {
		when(logFactory.getLog(CloudFoundryVcapEnvironmentPostProcessor.class)).thenReturn(logger);
		when(environment.getPropertySources()).thenReturn(propertySources);
		when(environment.getProperty("VCAP_APPLICATION", "{}")).thenReturn("{}");
		when(environment.getProperty("VCAP_SERVICES", "{}")).thenReturn("{}");
		when(JsonParserFactory.getJsonParser()).thenReturn(jsonParser);
		when(jsonParser.parseMap(anyString())).thenReturn(Collections.emptyMap());
		processor = new CloudFoundryVcapEnvironmentPostProcessor(logFactory);
	}

	@Test
	public void testPostProcessEnvironment() {
		when(propertySources.contains(CommandLinePropertySource.COMMAND_LINE_PROPERTY_SOURCE_NAME)).thenReturn(true);
		processor.postProcessEnvironment(environment, application);
		verify(propertySources).addAfter(eq(CommandLinePropertySource.COMMAND_LINE_PROPERTY_SOURCE_NAME), any(PropertiesPropertySource.class));
	}

	@Test
	public void testPostProcessEnvironmentWithoutCommandLinePropertySource() {
		when(propertySources.contains(CommandLinePropertySource.COMMAND_LINE_PROPERTY_SOURCE_NAME)).thenReturn(false);
		processor.postProcessEnvironment(environment, application);
		verify(propertySources).addFirst(any(PropertiesPropertySource.class));
	}

	@Test
	public void testPostProcessEnvironmentWithJsonParseException() {
		when(jsonParser.parseMap(anyString())).thenThrow(new JsonParseException());
		processor.postProcessEnvironment(environment, application);
		verify(logger, times(2)).error(anyString(), any(JsonParseException.class));
	}

	@Test
	public void testPostProcessEnvironmentWithActiveCloudPlatform() {
		try (MockedStatic<CloudPlatform> cloudPlatform = mockStatic(CloudPlatform.class)) {
			cloudPlatform.when(() -> CloudPlatform.CLOUD_FOUNDRY.isActive(environment)).thenReturn(true);
			processor.postProcessEnvironment(environment, application);
			verify(propertySources, atLeastOnce()).addAfter(anyString(), any(PropertiesPropertySource.class));
			verify(propertySources, atLeastOnce()).addFirst(any(PropertiesPropertySource.class));
		}
	}

	@Test
	public void testPostProcessEnvironmentWithInactiveCloudPlatform() {
		try (MockedStatic<CloudPlatform> cloudPlatform = mockStatic(CloudPlatform.class)) {
			cloudPlatform.when(() -> CloudPlatform.CLOUD_FOUNDRY.isActive(environment)).thenReturn(false);
			processor.postProcessEnvironment(environment, application);
			verify(propertySources, never()).addAfter(anyString(), any(PropertiesPropertySource.class));
			verify(propertySources, never()).addFirst(any(PropertiesPropertySource.class));
		}
	}
}
