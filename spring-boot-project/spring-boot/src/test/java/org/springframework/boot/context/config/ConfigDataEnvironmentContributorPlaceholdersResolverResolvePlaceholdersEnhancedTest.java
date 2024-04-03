package org.springframework.boot.context.config;

import org.springframework.boot.context.config.ConfigDataEnvironmentContributorPlaceholdersResolver;

import java.lang.*;

import org.springframework.util.*;
import org.springframework.boot.context.config.ConfigDataActivationContext;
import org.springframework.boot.context.config.ConfigDataEnvironmentContributor;

import java.lang.Iterable;

import org.springframework.util.PropertyPlaceholderHelper;

import java.lang.Object;

import org.springframework.boot.context.config.ConfigDataEnvironmentContributorPlaceholdersResolver;
import org.springframework.boot.context.config.*;
import org.springframework.boot.origin.Origin;
import org.springframework.util.PropertyPlaceholderHelper;
import org.springframework.util.SystemPropertyUtils;
import org.springframework.boot.context.properties.bind.PlaceholdersResolver;
import org.springframework.boot.context.config.ConfigDataEnvironmentContributor.Kind;
import org.springframework.boot.origin.OriginLookup;
import org.springframework.core.env.PropertySource;

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
class ConfigDataEnvironmentContributorPlaceholdersResolverResolvePlaceholdersEnhancedTest {

	@Mock
	private Iterable<ConfigDataEnvironmentContributor> contributors;

	@Mock
	private ConfigDataActivationContext activationContext;

	@Mock
	private ConfigDataEnvironmentContributor activeContributor;

	private ConfigDataEnvironmentContributorPlaceholdersResolver resolver;

	@BeforeEach
	void setUp() {
		resolver = new ConfigDataEnvironmentContributorPlaceholdersResolver(contributors, activationContext, activeContributor, true);
	}

	@Test
	void testResolvePlaceholdersWithStringValue() {
		String input = "${placeholder}";
		String resolvedValue = "resolvedValue";
		try (MockedStatic<PropertyPlaceholderHelper> helperMockedStatic = Mockito.mockStatic(PropertyPlaceholderHelper.class)) {
			PropertyPlaceholderHelper helper = new PropertyPlaceholderHelper(SystemPropertyUtils.PLACEHOLDER_PREFIX, SystemPropertyUtils.PLACEHOLDER_SUFFIX, SystemPropertyUtils.VALUE_SEPARATOR, true);
			helperMockedStatic.when(() -> PropertyPlaceholderHelper.replacePlaceholders(eq(input), anyString())).thenReturn(resolvedValue);
			Object result = resolver.resolvePlaceholders(input);
			assertEquals(resolvedValue, result);
		}
	}

	@Test
	void testResolvePlaceholdersWithNonStringValue() {
		Integer nonStringValue = 42;
		Object result = resolver.resolvePlaceholders(nonStringValue);
		assertEquals(nonStringValue, result);
	}
}
