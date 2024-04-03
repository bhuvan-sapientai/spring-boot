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
		processor = new CloudFoundryVcapEnvironmentPostProcessor(logFactory);
		when(environment.getPropertySources()).thenReturn(propertySources);
	}

	@Test
	public void testPostProcessEnvironmentWithActiveCloudFoundry() {
		try (MockedStatic<CloudPlatform> cloudPlatform = mockStatic(CloudPlatform.class);
			 MockedStatic<JsonParserFactory> jsonParserFactory = mockStatic(JsonParserFactory.class);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			cloudPlatform.when(() -> CloudPlatform.CLOUD_FOUNDRY.isActive(any(ConfigurableEnvironment.class))).thenReturn(true);
			jsonParserFactory.when(JsonParserFactory::getJsonParser).thenReturn(jsonParser);
			stringUtils.when(() -> StringUtils.hasText(any(String.class))).thenReturn(true);
			Map<String, Object> applicationMap = Collections.singletonMap("someKey", "someValue");
			Map<String, Object> servicesMap = Collections.singletonMap("anotherKey", "anotherValue");
			when(environment.getProperty("VCAP_APPLICATION", "{}")).thenReturn("{\"someKey\":\"someValue\"}");
			when(environment.getProperty("VCAP_SERVICES", "{}")).thenReturn("{\"anotherKey\":\"anotherValue\"}");
			when(jsonParser.parseMap("{\"someKey\":\"someValue\"}")).thenReturn(applicationMap);
			when(jsonParser.parseMap("{\"anotherKey\":\"anotherValue\"}")).thenReturn(servicesMap);
			processor.postProcessEnvironment(environment, application);
			verify(propertySources).addAfter(any(String.class), any(PropertiesPropertySource.class));
			verify(propertySources, never()).addFirst(any(PropertiesPropertySource.class));
		}
	}

	@Test
	public void testPostProcessEnvironmentWithInactiveCloudFoundry() {
		try (MockedStatic<CloudPlatform> cloudPlatform = mockStatic(CloudPlatform.class)) {
			cloudPlatform.when(() -> CloudPlatform.CLOUD_FOUNDRY.isActive(any(ConfigurableEnvironment.class))).thenReturn(false);
			processor.postProcessEnvironment(environment, application);
			verify(propertySources, never()).addAfter(any(String.class), any(PropertiesPropertySource.class));
			verify(propertySources, never()).addFirst(any(PropertiesPropertySource.class));
		}
	}

	@Test
	public void testPostProcessEnvironmentWithJsonParseException() {
		try (MockedStatic<CloudPlatform> cloudPlatform = mockStatic(CloudPlatform.class);
			 MockedStatic<JsonParserFactory> jsonParserFactory = mockStatic(JsonParserFactory.class)) {
			cloudPlatform.when(() -> CloudPlatform.CLOUD_FOUNDRY.isActive(any(ConfigurableEnvironment.class))).thenReturn(true);
			jsonParserFactory.when(JsonParserFactory::getJsonParser).thenReturn(jsonParser);
			when(environment.getProperty("VCAP_APPLICATION", "{}")).thenReturn("{\"invalidJson\"");
			when(environment.getProperty("VCAP_SERVICES", "{}")).thenReturn("{\"invalidJson\"}");
			when(jsonParser.parseMap("{\"invalidJson\"}")).thenThrow(new JsonParseException("Invalid JSON"));
			processor.postProcessEnvironment(environment, application);
			verify(logger, times(2)).error(any(String.class), any(Exception.class));
		}
	}
}
