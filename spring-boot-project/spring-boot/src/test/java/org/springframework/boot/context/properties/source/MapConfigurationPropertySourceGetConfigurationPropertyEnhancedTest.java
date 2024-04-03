package org.springframework.boot.context.properties.source;

import org.springframework.boot.context.properties.source.MapConfigurationPropertySource;

import java.util.Map;

import org.springframework.boot.context.properties.source.MapConfigurationPropertySource;
import org.springframework.boot.context.properties.source.SpringIterableConfigurationPropertySource;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import java.lang.*;
import java.util.stream.Stream;
import java.util.stream.*;

import org.springframework.boot.context.properties.source.*;
import org.springframework.util.*;

import java.util.Iterator;

import org.springframework.boot.context.properties.source.ConfigurationProperty;

import java.lang.IllegalArgumentException;

import org.springframework.util.Assert;

import java.lang.Object;
import java.util.*;

import org.springframework.util.Assert;
import org.springframework.core.env.MapPropertySource;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.Collections;
import java.util.Map;
import java.util.LinkedHashMap;

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
public class MapConfigurationPropertySourceGetConfigurationPropertyEnhancedTest {

	@Mock
	private ConfigurationPropertyName mockName;

	@Mock
	private IterableConfigurationPropertySource mockDelegate;

	private MapConfigurationPropertySource mapConfigurationPropertySource;

	@BeforeEach
	void setUp() {
		mapConfigurationPropertySource = new MapConfigurationPropertySource();
	}

	@Test
	void getConfigurationPropertyShouldReturnProperty() {
		ConfigurationProperty expectedProperty = new ConfigurationProperty(mockName, "value", null);
		when(mockDelegate.getConfigurationProperty(mockName)).thenReturn(expectedProperty);
		ConfigurationProperty result = mapConfigurationPropertySource.getConfigurationProperty(mockName);
		assertNotNull(result);
		verify(mockDelegate).getConfigurationProperty(mockName);
	}

	@Test
	void getConfigurationPropertyShouldHandleNullName() {
		try (MockedStatic<Assert> mockedAssert = mockStatic(Assert.class)) {
			mockedAssert.when(() -> Assert.notNull(null, "Name must not be null")).thenThrow(new IllegalArgumentException("Name must not be null"));
			assertThrows(IllegalArgumentException.class, () -> mapConfigurationPropertySource.getConfigurationProperty(null));
			mockedAssert.verify(() -> Assert.notNull(null, "Name must not be null"));
		}
	}
}
