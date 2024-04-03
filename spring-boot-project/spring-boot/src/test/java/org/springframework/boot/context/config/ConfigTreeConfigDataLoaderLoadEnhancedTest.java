package org.springframework.boot.context.config;

import org.springframework.boot.context.config.ConfigTreeConfigDataLoader;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.boot.context.config.ConfigTreeConfigDataLoader;
import org.springframework.boot.context.config.ConfigTreeConfigDataResource;
import org.springframework.boot.context.config.ConfigData;

import java.nio.file.Path;
import java.nio.file.*;

import org.springframework.boot.context.config.ConfigDataLoaderContext;
import org.springframework.boot.context.config.*;
import org.springframework.boot.env.ConfigTreePropertySource;

import java.nio.file.Path;

import org.springframework.boot.env.ConfigTreePropertySource.Option;

import java.io.IOException;
import java.util.Collections;

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
public class ConfigTreeConfigDataLoaderLoadEnhancedTest {

	@Mock
	private ConfigDataLoaderContext context;

	@Mock
	private ConfigTreeConfigDataResource resource;

	@Mock
	private Path path;

	private ConfigTreeConfigDataLoader loader;

	@BeforeEach
	public void setUp() {
		loader = new ConfigTreeConfigDataLoader();
	}

	@Test
	public void load_WhenPathExists_ShouldReturnConfigData() throws IOException {
		// Arrange
		when(resource.getPath()).thenReturn(path);
		try (MockedStatic<ConfigDataResourceNotFoundException> exceptions = mockStatic(ConfigDataResourceNotFoundException.class)) {
			exceptions.when(() -> ConfigDataResourceNotFoundException.throwIfDoesNotExist(resource, path)).thenReturn();
			// Act
			ConfigData result = loader.load(context, resource);
			// Assert
			assertNotNull(result);
			List<PropertySource<?>> propertySources = result.getPropertySources();
			assertEquals(1, propertySources.size());
			assertTrue(propertySources.get(0) instanceof ConfigTreePropertySource);
		}
	}

	@Test
	public void load_WhenPathDoesNotExist_ShouldThrowException() {
		// Arrange
		when(resource.getPath()).thenReturn(path);
		try (MockedStatic<ConfigDataResourceNotFoundException> exceptions = mockStatic(ConfigDataResourceNotFoundException.class)) {
			exceptions.when(() -> ConfigDataResourceNotFoundException.throwIfDoesNotExist(resource, path)).thenThrow(new ConfigDataResourceNotFoundException(resource));
			// Act & Assert
			assertThrows(ConfigDataResourceNotFoundException.class, () -> loader.load(context, resource));
		}
	}
}
