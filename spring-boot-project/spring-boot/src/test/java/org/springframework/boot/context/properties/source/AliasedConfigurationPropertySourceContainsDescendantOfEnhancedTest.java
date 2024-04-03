package org.springframework.boot.context.properties.source;

import org.springframework.boot.context.properties.source.AliasedConfigurationPropertySource;

import java.util.List;

import org.springframework.boot.context.properties.source.ConfigurationPropertySource;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import java.lang.*;

import org.springframework.boot.context.properties.source.*;
import org.springframework.util.*;

import java.util.Iterator;

import org.springframework.boot.context.properties.source.ConfigurationProperty;
import org.springframework.boot.context.properties.source.ConfigurationPropertyState;
import org.springframework.boot.context.properties.source.ConfigurationPropertyNameAliases;
import org.springframework.util.Assert;
import org.springframework.boot.context.properties.source.AliasedConfigurationPropertySource;

import java.lang.Object;
import java.util.*;

import org.springframework.util.Assert;

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
public class AliasedConfigurationPropertySourceContainsDescendantOfEnhancedTest {

	@Mock
	private ConfigurationPropertySource mockSource;

	@Mock
	private ConfigurationPropertyNameAliases mockAliases;

	@Mock
	private ConfigurationPropertyName mockName;

	@Mock
	private ConfigurationPropertyName mockAlias;

	@Mock
	private ConfigurationProperty mockProperty;

	@Mock
	private Iterator<ConfigurationPropertyName> mockIterator;

	private AliasedConfigurationPropertySource aliasedSource;

	@BeforeEach
	void setUp() {
		aliasedSource = new AliasedConfigurationPropertySource(mockSource, mockAliases);
	}

	@Test
	void testContainsDescendantOfWhenPresentDirectly() {
		when(mockSource.containsDescendantOf(mockName)).thenReturn(ConfigurationPropertyState.PRESENT);
		ConfigurationPropertyState result = aliasedSource.containsDescendantOf(mockName);
		assertEquals(ConfigurationPropertyState.PRESENT, result);
	}

	@Test
	void testContainsDescendantOfWhenPresentViaAlias() {
		when(mockSource.containsDescendantOf(mockName)).thenReturn(ConfigurationPropertyState.ABSENT);
		when(mockAliases.getAliases(mockName)).thenReturn(Arrays.asList(mockAlias));
		when(mockSource.containsDescendantOf(mockAlias)).thenReturn(ConfigurationPropertyState.PRESENT);
		ConfigurationPropertyState result = aliasedSource.containsDescendantOf(mockName);
		assertEquals(ConfigurationPropertyState.PRESENT, result);
	}

	@Test
	void testContainsDescendantOfWhenPresentViaAncestorAlias() {
		when(mockSource.containsDescendantOf(mockName)).thenReturn(ConfigurationPropertyState.ABSENT);
		when(mockAliases.getAliases(mockName)).thenReturn(Arrays.asList());
		when(mockAliases.iterator()).thenReturn(mockIterator);
		when(mockIterator.hasNext()).thenReturn(true, false);
		when(mockIterator.next()).thenReturn(mockAlias);
		when(mockAliases.getAliases(mockAlias)).thenReturn(Arrays.asList(mockName));
		when(mockName.isAncestorOf(mockAlias)).thenReturn(true);
		when(mockSource.getConfigurationProperty(mockAlias)).thenReturn(mockProperty);
		ConfigurationPropertyState result = aliasedSource.containsDescendantOf(mockName);
		assertEquals(ConfigurationPropertyState.PRESENT, result);
	}

	@Test
	void testContainsDescendantOfWhenAbsent() {
		when(mockSource.containsDescendantOf(mockName)).thenReturn(ConfigurationPropertyState.ABSENT);
		when(mockAliases.getAliases(mockName)).thenReturn(Arrays.asList());
		when(mockAliases.iterator()).thenReturn(mockIterator);
		when(mockIterator.hasNext()).thenReturn(false);
		ConfigurationPropertyState result = aliasedSource.containsDescendantOf(mockName);
		assertEquals(ConfigurationPropertyState.ABSENT, result);
	}

	@Test
	void testContainsDescendantOfWhenUnknown() {
		when(mockSource.containsDescendantOf(mockName)).thenReturn(ConfigurationPropertyState.UNKNOWN);
		ConfigurationPropertyState result = aliasedSource.containsDescendantOf(mockName);
		assertEquals(ConfigurationPropertyState.UNKNOWN, result);
	}
}
