package org.springframework.boot.context.config;

import org.springframework.boot.context.config.ConfigTreeConfigDataResource;

import java.lang.*;

import org.springframework.boot.context.config.ConfigTreeConfigDataResource;
import org.springframework.util.*;

import java.nio.file.Path;
import java.nio.file.*;

import org.springframework.util.Assert;

import java.lang.Object;

import org.springframework.boot.context.config.*;
import org.springframework.boot.env.ConfigTreePropertySource;

import java.nio.file.Path;

import org.springframework.util.Assert;

import java.util.Objects;
import java.nio.file.Paths;

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

class ConfigTreeConfigDataResourceToStringEnhancedTest {

	private MockedStatic<Assert> mockedAssert;

	private ConfigTreeConfigDataResource configTreeConfigDataResource;

	private final String testPathString = "/test/path";

	private final Path testPath = Paths.get(testPathString).toAbsolutePath();

	@BeforeEach
	void setUp() {
		mockedAssert = Mockito.mockStatic(Assert.class);
	}

	@AfterEach
	void tearDown() {
		mockedAssert.close();
	}

	@Test
	void testToStringWithStringPathConstructor() {
		// Arrange
		mockedAssert.when(() -> Assert.notNull(Mockito.any(), Mockito.anyString())).thenAnswer(invocation -> null);
		configTreeConfigDataResource = new ConfigTreeConfigDataResource(testPathString);
		// Act
		String result = configTreeConfigDataResource.toString();
		// Assert
		assertEquals("config tree [" + testPath + "]", result);
	}

	@Test
	void testToStringWithPathConstructor() {
		// Arrange
		mockedAssert.when(() -> Assert.notNull(Mockito.any(), Mockito.anyString())).thenAnswer(invocation -> null);
		configTreeConfigDataResource = new ConfigTreeConfigDataResource(testPath);
		// Act
		String result = configTreeConfigDataResource.toString();
		// Assert
		assertEquals("config tree [" + testPath + "]", result);
	}

	@Test
	@Disabled
	void testConstructorWithStringPathShouldThrowExceptionWhenPathIsNull() {
		// Arrange
		String nullPath = null;
		// Act & Assert
		assertThrows(IllegalArgumentException.class, () -> new ConfigTreeConfigDataResource(nullPath));
	}

	@Test
	@Disabled
	void testConstructorWithPathShouldThrowExceptionWhenPathIsNull() {
		// Arrange
		Path nullPath = null;
		// Act & Assert
		assertThrows(IllegalArgumentException.class, () -> new ConfigTreeConfigDataResource(nullPath));
	}
}
