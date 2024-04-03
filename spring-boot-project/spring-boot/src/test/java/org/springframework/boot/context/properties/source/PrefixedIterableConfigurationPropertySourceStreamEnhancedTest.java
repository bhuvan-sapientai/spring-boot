package org.springframework.boot.context.properties.source;

import org.springframework.boot.context.properties.source.PrefixedIterableConfigurationPropertySource;

import org.springframework.boot.context.properties.source.IterableConfigurationPropertySource;

import java.util.stream.Stream;
import java.util.stream.*;

import org.springframework.boot.context.properties.source.*;
import org.springframework.util.*;
import org.springframework.boot.context.properties.source.PrefixedIterableConfigurationPropertySource;
import org.springframework.util.Assert;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import java.util.stream.Stream;

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

class PrefixedIterableConfigurationPropertySourceStreamEnhancedTest {

	private PrefixedIterableConfigurationPropertySource prefixedSource;

	private IterableConfigurationPropertySource mockSource;

	@BeforeEach
	void setUp() {
		mockSource = Mockito.mock(IterableConfigurationPropertySource.class);
		prefixedSource = new PrefixedIterableConfigurationPropertySource(mockSource, "prefix");
	}

	@Test
	void testStream() {
		try (MockedStatic<ConfigurationPropertyName> mockedStatic = Mockito.mockStatic(ConfigurationPropertyName.class)) {
			mockedStatic.when(() -> ConfigurationPropertyName.of("prefix")).thenReturn(Mockito.mock(ConfigurationPropertyName.class));
			Stream<ConfigurationPropertyName> mockStream = Stream.of(Mockito.mock(ConfigurationPropertyName.class));
			when(mockSource.stream()).thenReturn(mockStream);
			Stream<ConfigurationPropertyName> resultStream = prefixedSource.stream();
			assertNotNull(resultStream);
			resultStream.forEach(name -> assertNotNull(name));
		}
	}
}
