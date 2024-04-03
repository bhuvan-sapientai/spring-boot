package org.springframework.boot.context.properties.source;

import org.springframework.boot.context.properties.source.AliasedIterableConfigurationPropertySource;

import org.springframework.boot.context.properties.source.IterableConfigurationPropertySource;

import java.util.stream.Stream;
import java.util.stream.*;

import org.springframework.boot.context.properties.source.*;
import org.springframework.boot.context.properties.source.AliasedIterableConfigurationPropertySource;
import org.springframework.util.*;
import org.springframework.boot.context.properties.source.ConfigurationPropertyNameAliases;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import java.util.stream.Stream;
import java.util.List;

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

class AliasedIterableConfigurationPropertySourceStreamEnhancedTest {

	private AliasedIterableConfigurationPropertySource aliasedIterableConfigurationPropertySource;

	private IterableConfigurationPropertySource mockSource;

	private ConfigurationPropertyNameAliases mockAliases;

	@BeforeEach
	void setUp() {
		mockSource = mock(IterableConfigurationPropertySource.class);
		mockAliases = mock(ConfigurationPropertyNameAliases.class);
		aliasedIterableConfigurationPropertySource = new AliasedIterableConfigurationPropertySource(mockSource, mockAliases);
	}

	@Test
	void testStream() {
		try (MockedStatic<Assert> mockedAssert = Mockito.mockStatic(Assert.class)) {
			ConfigurationPropertyName name = mock(ConfigurationPropertyName.class);
			Stream<ConfigurationPropertyName> sourceStream = Stream.of(name);
			// Assuming addAliases returns the same stream for simplicity
			Stream<ConfigurationPropertyName> aliasedStream = Stream.of(name);
			when(mockSource.stream()).thenReturn(sourceStream);
//			when(aliasedIterableConfigurationPropertySource.addAliases(name)).thenReturn(aliasedStream);
			Stream<ConfigurationPropertyName> resultStream = aliasedIterableConfigurationPropertySource.stream();
			mockedAssert.verify(() -> Assert.notNull(mockSource, "Source must not be null"));
			mockedAssert.verify(() -> Assert.notNull(mockAliases, "Aliases must not be null"));
			assertEquals(aliasedStream, resultStream);
		}
	}
}
