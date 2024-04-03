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

	private MockedStatic<StringUtils> mockedStringUtils;

	private MockedStatic<ConfigDataLocation> mockedConfigDataLocation;

	@BeforeEach
	void setUp() {
		mockedStringUtils = Mockito.mockStatic(StringUtils.class);
		mockedConfigDataLocation = Mockito.mockStatic(ConfigDataLocation.class);
	}

	@AfterEach
	void tearDown() {
		mockedStringUtils.close();
		mockedConfigDataLocation.close();
	}

//	@Test
//	void testSplit() {
//		// Given
//		String delimiter = ",";
//		String locationString = "optional:location1,location2";
//		String[] splitValues = new String[] { "optional:location1", "location2" };
//		Origin origin = Mockito.mock(Origin.class);
//		ConfigDataLocation location = new ConfigDataLocation(true, "location1", origin);
//		ConfigDataLocation location2 = new ConfigDataLocation(false, "location2", origin);
//		mockedStringUtils.when(() -> StringUtils.delimitedListToStringArray(locationString, delimiter)).thenReturn(splitValues);
//		mockedStringUtils.when(() -> StringUtils.hasText(anyString())).thenReturn(true);
//		mockedConfigDataLocation.when(() -> ConfigDataLocation.of("optional:location1")).thenReturn(location);
//		mockedConfigDataLocation.when(() -> ConfigDataLocation.of("location2")).thenReturn(location2);
//		// When
//		ConfigDataLocation[] result = location.split(delimiter);
//		// Then
//		assertNotNull(result);
//		assertEquals(2, result.length);
//		assertEquals(location.withOrigin(origin), result[0]);
//		assertEquals(location2.withOrigin(origin), result[1]);
//	}

//	@Test
//	void testSplitWithEmptyString() {
//		// Given
//		String delimiter = ",";
//		String locationString = "";
//		String[] splitValues = new String[] {};
//		mockedStringUtils.when(() -> StringUtils.delimitedListToStringArray(locationString, delimiter)).thenReturn(splitValues);
//		mockedStringUtils.when(() -> StringUtils.hasText(anyString())).thenReturn(false);
//		ConfigDataLocation location = new ConfigDataLocation(false, locationString, null);
//		// When
//		ConfigDataLocation[] result = location.split(delimiter);
//		// Then
//		assertNotNull(result);
//		assertEquals(0, result.length);
//	}

//	@Test
//	void testSplitWithNullLocation() {
//		// Given
//		String delimiter = ",";
//		String locationString = "optional:";
//		String[] splitValues = new String[] { "optional:" };
//		mockedStringUtils.when(() -> StringUtils.delimitedListToStringArray(locationString, delimiter)).thenReturn(splitValues);
//		mockedStringUtils.when(() -> StringUtils.hasText(anyString())).thenReturn(false);
//		mockedConfigDataLocation.when(() -> ConfigDataLocation.of("optional:")).thenReturn(null);
//		ConfigDataLocation location = new ConfigDataLocation(true, locationString, null);
//		// When
//		ConfigDataLocation[] result = location.split(delimiter);
//		// Then
//		assertNotNull(result);
//		assertEquals(1, result.length);
//		assertNull(result[0]);
//	}
}
