package org.springframework.boot.context.config;

import org.springframework.boot.context.config.ConfigTreeConfigDataLocationResolver;

import org.springframework.boot.context.config.ConfigTreeConfigDataLocationResolver;

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
public class ConfigTreeConfigDataLocationResolverResolveEnhancedTest {

	@Mock
	private ResourceLoader mockResourceLoader;

	@Mock
	private ConfigDataLocationResolverContext mockContext;

	@Mock
	private ConfigDataLocation mockLocation;

	@Mock
	private Resource mockResource;

	@Mock
	private File mockFile;

	private ConfigTreeConfigDataLocationResolver resolver;

	@BeforeEach
	void setUp() {
		resolver = new ConfigTreeConfigDataLocationResolver(mockResourceLoader);
	}

	@Test
	void resolveWithNonPatternLocation() throws IOException {
		String location = "configtree:valid/location/";
		when(mockLocation.getNonPrefixedValue("configtree:")).thenReturn("valid/location/");
		when(mockResourceLoader.isPattern("valid/location/")).thenReturn(false);
		when(mockResource.getFile()).thenReturn(mockFile);
		when(mockFile.toPath()).thenReturn(mock(Path.class));
		List<ConfigTreeConfigDataResource> result = resolver.resolve(mockContext, mockLocation);
		assertNotNull(result);
		assertEquals(1, result.size());
		verify(mockLocation).getNonPrefixedValue("configtree:");
		verify(mockResourceLoader).isPattern("valid/location/");
	}

	@Test
	void resolveWithPatternLocation() throws IOException {
		String location = "configtree:pattern/*/location/";
		when(mockLocation.getNonPrefixedValue("configtree:")).thenReturn("pattern/*/location/");
		when(mockResourceLoader.isPattern("pattern/*/location/")).thenReturn(true);
		when(mockResourceLoader.getResources("pattern/*/location/", ResourceType.DIRECTORY)).thenReturn(new Resource[] { mockResource });
		when(mockResource.getFile()).thenReturn(mockFile);
		when(mockFile.toPath()).thenReturn(mock(Path.class));
		List<ConfigTreeConfigDataResource> result = resolver.resolve(mockContext, mockLocation);
		assertNotNull(result);
		assertEquals(1, result.size());
		verify(mockLocation).getNonPrefixedValue("configtree:");
		verify(mockResourceLoader).getResources("pattern/*/location/", ResourceType.DIRECTORY);
	}

	@Test
	void resolveWithInvalidLocation() {
		String location = "configtree:invalidlocation";
		when(mockLocation.getNonPrefixedValue("configtree:")).thenReturn("invalidlocation");
		Exception exception = assertThrows(ConfigDataLocationNotFoundException.class, () -> {
			resolver.resolve(mockContext, mockLocation);
		});
		assertNotNull(exception);
		verify(mockLocation).getNonPrefixedValue("configtree:");
	}

	@Test
	void resolveWithIOException() throws IOException {
		String location = "configtree:valid/location/";
		when(mockLocation.getNonPrefixedValue("configtree:")).thenReturn("valid/location/");
		when(mockResourceLoader.isPattern("valid/location/")).thenReturn(true);
		when(mockResourceLoader.getResources("valid/location/", ResourceType.DIRECTORY)).thenThrow(new IOException());
		assertThrows(ConfigDataLocationNotFoundException.class, () -> resolver.resolve(mockContext, mockLocation));
		verify(mockLocation).getNonPrefixedValue("configtree:");
		verify(mockResourceLoader).getResources("valid/location/", ResourceType.DIRECTORY);
	}
}
