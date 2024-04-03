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

public class ConfigTreeConfigDataResourceToStringEnhancedTest {

	private MockedStatic<Assert> mockedAssert;

	private ConfigTreeConfigDataResource configTreeConfigDataResource;

	@BeforeEach
	public void setUp() {
		mockedAssert = Mockito.mockStatic(Assert.class);
		mockedAssert.when(() -> Assert.notNull(Mockito.any(), Mockito.anyString())).thenAnswer(invocation -> null);
	}

	@AfterEach
	public void tearDown() {
		mockedAssert.close();
	}

	@Test
	public void testToStringWithStringPath() {
		String pathString = "/path/to/config";
		configTreeConfigDataResource = new ConfigTreeConfigDataResource(pathString);
		String expected = "config tree [" + Paths.get(pathString).toAbsolutePath() + "]";
		assertEquals(expected, configTreeConfigDataResource.toString());
	}

	@Test
	public void testToStringWithPath() {
		Path path = Paths.get("/path/to/config");
		configTreeConfigDataResource = new ConfigTreeConfigDataResource(path);
		String expected = "config tree [" + path.toAbsolutePath() + "]";
		assertEquals(expected, configTreeConfigDataResource.toString());
	}
}
