package org.springframework.boot.context.config;

import org.springframework.boot.context.config.ConfigDataLocation;

import java.lang.*;

import org.springframework.boot.origin.Origin;
import org.springframework.util.*;
import org.springframework.util.StringUtils;
import org.springframework.boot.context.config.ConfigDataLocation;

import java.lang.Object;

import org.springframework.boot.origin.*;
import org.springframework.boot.context.config.*;
import org.springframework.boot.origin.Origin;
import org.springframework.util.StringUtils;
import org.springframework.boot.origin.OriginProvider;

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

class ConfigDataLocationSplitEnhancedTest {

	private ConfigDataLocation configDataLocation;

	private MockedStatic<StringUtils> mockedStringUtils;

	private MockedStatic<ConfigDataLocation> mockedConfigDataLocation;

	@BeforeEach
	void setUp() {
		configDataLocation = ConfigDataLocation.of("testLocation");
		mockedStringUtils = Mockito.mockStatic(StringUtils.class);
		mockedConfigDataLocation = Mockito.mockStatic(ConfigDataLocation.class);
	}

	@AfterEach
	void tearDown() {
		mockedStringUtils.close();
		mockedConfigDataLocation.close();
	}

	@Test
	void testSplit() {
		String delimiter = ",";
		String[] mockValues = new String[] { "value1", "value2" };
		Origin mockOrigin = Mockito.mock(Origin.class);
		mockedStringUtils.when(() -> StringUtils.delimitedListToStringArray(anyString(), anyString())).thenReturn(mockValues);
		mockedStringUtils.when(() -> StringUtils.hasText(anyString())).thenReturn(true);
		mockedConfigDataLocation.when(() -> ConfigDataLocation.of(anyString())).thenAnswer(invocation -> new ConfigDataLocation(false, invocation.getArgument(0), null));
		mockedConfigDataLocation.when(() -> configDataLocation.withOrigin(mockOrigin)).thenAnswer(invocation -> new ConfigDataLocation(false, "testLocation", mockOrigin));
		ConfigDataLocation[] result = configDataLocation.split(delimiter);
		assertEquals(mockValues.length, result.length);
		for (int i = 0; i < result.length; i++) {
			assertEquals(mockValues[i], result[i].toString());
			assertEquals(mockOrigin, result[i].getOrigin());
		}
	}

	@Test
	void testSplitWithEmptyResult() {
		String delimiter = ",";
		String[] mockValues = new String[] {};
		mockedStringUtils.when(() -> StringUtils.delimitedListToStringArray(anyString(), anyString())).thenReturn(mockValues);
		ConfigDataLocation[] result = configDataLocation.split(delimiter);
		assertEquals(0, result.length);
	}

	@Test
	void testSplitWithNullValue() {
		String delimiter = ",";
		String[] mockValues = new String[] { null };
		mockedStringUtils.when(() -> StringUtils.delimitedListToStringArray(anyString(), anyString())).thenReturn(mockValues);
		mockedStringUtils.when(() -> StringUtils.hasText(null)).thenReturn(false);
		ConfigDataLocation[] result = configDataLocation.split(delimiter);
		assertNull(result[0]);
	}
}
