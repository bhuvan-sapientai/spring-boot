package org.springframework.boot.context.config;

import org.springframework.boot.context.config.ConfigTreeConfigDataLocationResolver;

import org.springframework.boot.context.config.ConfigTreeConfigDataLocationResolver;

import java.nio.file.Path;
import java.util.List;

import org.springframework.boot.context.config.LocationResourceLoader;

import java.util.function.*;

import org.springframework.boot.context.config.ConfigDataLocationNotFoundException;
import org.springframework.core.io.Resource;

import java.io.File;

import org.springframework.core.io.ResourceLoader;

import java.util.function.Supplier;

import org.springframework.boot.context.config.ConfigTreeConfigDataResource;
import org.springframework.util.*;
import org.springframework.core.io.*;

import java.io.*;

import org.springframework.boot.context.config.ConfigDataLocationResolverContext;
import org.springframework.boot.context.config.ConfigDataLocation;
import org.springframework.util.Assert;
import org.springframework.boot.context.config.*;

import java.util.*;

import org.springframework.core.io.ResourceLoader;
import org.springframework.util.Assert;
import org.springframework.core.io.Resource;

import java.util.ArrayList;

import org.springframework.boot.context.config.LocationResourceLoader.ResourceType;

import java.util.List;
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
public class ConfigTreeConfigDataLocationResolverResolveEnhancedTest {

	private static final String PREFIX = "configtree:";

	@Mock
	private ResourceLoader mockResourceLoader;

	@Mock
	private ConfigDataLocationResolverContext mockContext;

	@Mock
	private ConfigDataLocation mockLocation;

	@Mock
	private LocationResourceLoader mockLocationResourceLoader;

	@Mock
	private Resource mockResource;

	@Mock
	private File mockFile;

	private ConfigTreeConfigDataLocationResolver resolver;

	@BeforeEach
	public void setUp() {
		resolver = new ConfigTreeConfigDataLocationResolver(mockResourceLoader);
	}

	@Test
	public void resolve_whenLocationEndsWithSlashAndIsNotPattern_shouldReturnSingleResource() throws IOException {
		String location = "configtree:testlocation/";
		when(mockLocation.getNonPrefixedValue(PREFIX)).thenReturn(location);
		when(mockLocationResourceLoader.isPattern(location)).thenReturn(false);
		when(mockResource.getFile()).thenReturn(mockFile);
		when(mockFile.toPath()).thenReturn(Path.of(location));
		List<ConfigTreeConfigDataResource> result = resolver.resolve(mockContext, mockLocation);
		assertEquals(1, result.size());
		assertEquals(location, result.get(0).getPath().toString());
	}

	@Test
	public void resolve_whenLocationEndsWithSlashAndIsPattern_shouldReturnMultipleResources() throws IOException {
		String location = "configtree:testlocation/";
		Resource[] resources = new Resource[] { mockResource, mockResource };
		when(mockLocation.getNonPrefixedValue(PREFIX)).thenReturn(location);
		when(mockLocationResourceLoader.isPattern(location)).thenReturn(true);
		when(mockLocationResourceLoader.getResources(location, ResourceType.DIRECTORY)).thenReturn(resources);
		when(mockResource.getFile()).thenReturn(mockFile);
		when(mockFile.toPath()).thenReturn(Path.of(location));
		List<ConfigTreeConfigDataResource> result = resolver.resolve(mockContext, mockLocation);
		assertEquals(2, result.size());
		assertEquals(location, result.get(0).getPath().toString());
		assertEquals(location, result.get(1).getPath().toString());
	}

	@Test
	public void resolve_whenLocationDoesNotEndWithSlash_shouldThrowException() {
		String location = "configtree:testlocation";
		when(mockLocation.getNonPrefixedValue(PREFIX)).thenReturn(location);
		Exception exception = assertThrows(ConfigDataLocationNotFoundException.class, () -> resolver.resolve(mockContext, mockLocation));
		assertTrue(exception.getCause() instanceof IllegalArgumentException);
	}

	@Test
	public void resolve_whenIOExceptionOccurs_shouldThrowConfigDataLocationNotFoundException() throws IOException {
		String location = "configtree:testlocation/";
		when(mockLocation.getNonPrefixedValue(PREFIX)).thenReturn(location);
		when(mockLocationResourceLoader.isPattern(location)).thenReturn(false);
		when(mockResource.getFile()).thenThrow(new IOException());
		assertThrows(ConfigDataLocationNotFoundException.class, () -> resolver.resolve(mockContext, mockLocation));
	}
}
