package org.springframework.boot.context.config;

import org.springframework.boot.context.config.ConfigDataActivationContext;

import org.springframework.core.style.*;
import org.springframework.boot.context.config.ConfigDataActivationContext;
import org.springframework.core.style.ToStringCreator;
import org.springframework.boot.context.config.Profiles;
import org.springframework.boot.cloud.CloudPlatform;
import org.springframework.boot.cloud.*;
import org.springframework.boot.context.config.*;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.boot.cloud.CloudPlatform;
import org.springframework.core.style.ToStringCreator;
import org.springframework.core.env.Environment;

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

class ConfigDataActivationContextToStringEnhancedTest {

	private ConfigDataActivationContext context;

	private CloudPlatform cloudPlatform;

	private Profiles profiles;

	private Environment environment;

	private Binder binder;

	@BeforeEach
	void setUp() {
		cloudPlatform = Mockito.mock(CloudPlatform.class);
		profiles = Mockito.mock(Profiles.class);
		environment = Mockito.mock(Environment.class);
		binder = Mockito.mock(Binder.class);
	}

	@AfterEach
	void tearDown() {
		Mockito.verifyNoMoreInteractions(cloudPlatform, profiles, environment, binder);
	}

	@Test
	void testToString() {
		// Given
		context = new ConfigDataActivationContext(cloudPlatform, profiles);
		String expectedToString = "ConfigDataActivationContext{cloudPlatform=TEST_CLOUD_PLATFORM, profiles=TEST_PROFILES}";
		try (MockedStatic<ToStringCreator> mockedToStringCreator = Mockito.mockStatic(ToStringCreator.class)) {
			ToStringCreator mockCreator = Mockito.mock(ToStringCreator.class);
			mockedToStringCreator.when(() -> new ToStringCreator(context)).thenReturn(mockCreator);
			when(mockCreator.append("cloudPlatform", cloudPlatform)).thenReturn(mockCreator);
			when(mockCreator.append("profiles", profiles)).thenReturn(mockCreator);
			when(mockCreator.toString()).thenReturn(expectedToString);
			// When
			String actualToString = context.toString();
			// Then
			assertEquals(expectedToString, actualToString);
		}
	}
}
