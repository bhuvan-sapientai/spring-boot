package org.springframework.boot.context.properties.source;

import org.springframework.boot.context.properties.source.ConfigurationProperty;

import org.springframework.boot.context.properties.source.ConfigurationPropertySource;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import java.lang.*;

import org.springframework.boot.context.properties.source.*;
import org.springframework.core.style.*;
import org.springframework.boot.origin.Origin;
import org.springframework.util.*;
import org.springframework.core.style.ToStringCreator;
import org.springframework.boot.context.properties.source.ConfigurationProperty;
import org.springframework.util.ObjectUtils;
import org.springframework.util.Assert;

import java.lang.Object;

import org.springframework.boot.origin.*;
import org.springframework.boot.origin.OriginTrackedValue;
import org.springframework.boot.origin.Origin;
import org.springframework.core.style.ToStringCreator;
import org.springframework.util.Assert;
import org.springframework.boot.origin.OriginProvider;
import org.springframework.boot.origin.OriginTrackedValue;
import org.springframework.util.ObjectUtils;

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

public class ConfigurationPropertyToStringEnhancedTest {

	@Test
	@Disabled
	void testToString() {
		// Given
		ConfigurationPropertyName name = Mockito.mock(ConfigurationPropertyName.class);
		Object value = new Object();
		Origin origin = Mockito.mock(Origin.class);
		ConfigurationProperty property = new ConfigurationProperty(name, value, origin);
		// When
		String result = property.toString();
		// Then
		try (MockedStatic<Assert> mockedAssert = Mockito.mockStatic(Assert.class)) {
			mockedAssert.when(() -> Assert.notNull(any(), any(String.class))).thenAnswer(invocation -> null);
			try (MockedStatic<ToStringCreator> mockedToStringCreator = Mockito.mockStatic(ToStringCreator.class)) {
				ToStringCreator mockCreator = Mockito.mock(ToStringCreator.class);
				Mockito.when(mockCreator.append(any(String.class), any())).thenReturn(mockCreator);
				Mockito.when(mockCreator.toString()).thenReturn("MockedToStringResult");
				mockedToStringCreator.when(() -> new ToStringCreator(any(ConfigurationProperty.class))).thenReturn(mockCreator);
				assertEquals("MockedToStringResult", result);
			}
		}
	}
}
