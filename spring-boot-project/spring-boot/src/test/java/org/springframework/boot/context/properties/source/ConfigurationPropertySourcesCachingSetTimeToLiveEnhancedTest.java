package org.springframework.boot.context.properties.source;

import org.springframework.boot.context.properties.source.ConfigurationPropertySourcesCaching;

import java.lang.*;

import org.springframework.boot.context.properties.source.ConfigurationPropertySourcesCaching;
import org.springframework.boot.context.properties.source.*;
import org.springframework.boot.context.properties.source.CachingConfigurationPropertySource;

import java.lang.Iterable;

import org.springframework.boot.context.properties.source.ConfigurationPropertyCaching;

import java.time.*;

import org.springframework.boot.context.properties.source.ConfigurationPropertySource;

import java.time.Duration;
import java.util.function.Consumer;
import java.time.Duration;

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

class ConfigurationPropertySourcesCachingSetTimeToLiveEnhancedTest {

	private ConfigurationPropertySourcesCaching caching;

	private Iterable<ConfigurationPropertySource> sources;

	private ConfigurationPropertySource source1;

	private ConfigurationPropertySource source2;

	private ConfigurationPropertyCaching caching1;

	private ConfigurationPropertyCaching caching2;

	@BeforeEach
	void setUp() {
		source1 = mock(ConfigurationPropertySource.class);
		source2 = mock(ConfigurationPropertySource.class);
		caching1 = mock(ConfigurationPropertyCaching.class);
		caching2 = mock(ConfigurationPropertyCaching.class);
		sources = Arrays.asList(source1, source2);
		caching = new ConfigurationPropertySourcesCaching(sources);
	}

	@Test
	void setTimeToLive_WithValidSources_ShouldSetTimeToLiveForAll() {
		try (MockedStatic<CachingConfigurationPropertySource> mockedStatic = Mockito.mockStatic(CachingConfigurationPropertySource.class)) {
			mockedStatic.when(() -> CachingConfigurationPropertySource.find(source1)).thenReturn(caching1);
			mockedStatic.when(() -> CachingConfigurationPropertySource.find(source2)).thenReturn(caching2);
			Duration ttl = Duration.ofSeconds(60);
			caching.setTimeToLive(ttl);
			verify(caching1).setTimeToLive(ttl);
			verify(caching2).setTimeToLive(ttl);
		}
	}

	@Test
	void setTimeToLive_WithNullSource_ShouldNotSetTimeToLive() {
		ConfigurationPropertySourcesCaching cachingWithNullSource = new ConfigurationPropertySourcesCaching(null);
		Duration ttl = Duration.ofSeconds(60);
		cachingWithNullSource.setTimeToLive(ttl);
		// No interactions with the static method since sources are null
	}

	@Test
	void setTimeToLive_WithEmptySources_ShouldNotSetTimeToLive() {
		ConfigurationPropertySourcesCaching cachingWithEmptySources = new ConfigurationPropertySourcesCaching(Collections.emptyList());
		Duration ttl = Duration.ofSeconds(60);
		cachingWithEmptySources.setTimeToLive(ttl);
		// No interactions with the static method since sources are empty
	}

	@Test
	void setTimeToLive_WithSourceNotHavingCaching_ShouldNotSetTimeToLive() {
		try (MockedStatic<CachingConfigurationPropertySource> mockedStatic = Mockito.mockStatic(CachingConfigurationPropertySource.class)) {
			mockedStatic.when(() -> CachingConfigurationPropertySource.find(source1)).thenReturn(null);
			mockedStatic.when(() -> CachingConfigurationPropertySource.find(source2)).thenReturn(caching2);
			Duration ttl = Duration.ofSeconds(60);
			caching.setTimeToLive(ttl);
			verify(caching2).setTimeToLive(ttl);
			verifyNoMoreInteractions(caching2);
		}
	}
}
