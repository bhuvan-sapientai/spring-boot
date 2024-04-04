package org.springframework.boot.context.properties.source;

import org.springframework.boot.context.properties.source.SystemEnvironmentPropertyMapper;

import org.springframework.boot.context.properties.source.*;

import java.util.List;

import org.springframework.boot.context.properties.source.SystemEnvironmentPropertyMapper;

import java.util.function.Function;
import java.util.function.*;
import java.util.function.BiPredicate;

import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import java.util.*;
import java.util.Locale;

import org.springframework.boot.context.properties.source.ConfigurationPropertyName.Form;

import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.function.BiPredicate;

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
class SystemEnvironmentPropertyMapperMapEnhancedTest {

	private SystemEnvironmentPropertyMapper mapper;

	@Mock
	private ConfigurationPropertyName configurationPropertyName;

	@BeforeEach
	void setUp() {
		mapper = new SystemEnvironmentPropertyMapper();
	}

	@Test
	@Disabled
	void testMapWithSameNameAndLegacyName() {
		when(configurationPropertyName.getNumberOfElements()).thenReturn(1);
		when(configurationPropertyName.getElement(0, Form.ORIGINAL)).thenReturn("property");
		List<String> result = mapper.map(configurationPropertyName);
		assertEquals(1, result.size());
		assertEquals("property", result.get(0));
	}

	@Test
	@Disabled
	void testMapWithDifferentNameAndLegacyName() {
		when(configurationPropertyName.getNumberOfElements()).thenReturn(2);
		when(configurationPropertyName.getElement(0, Form.ORIGINAL)).thenReturn("property");
		when(configurationPropertyName.getElement(1, Form.ORIGINAL)).thenReturn("name");
		List<String> result = mapper.map(configurationPropertyName);
		assertEquals(2, result.size());
		assertEquals("property_name", result.get(0));
		assertEquals("property_name", result.get(1));
	}

	@Test
	@Disabled
	void testMapWithMultipleElements() {
		when(configurationPropertyName.getNumberOfElements()).thenReturn(3);
		when(configurationPropertyName.getElement(0, Form.ORIGINAL)).thenReturn("my");
		when(configurationPropertyName.getElement(1, Form.ORIGINAL)).thenReturn("property");
		when(configurationPropertyName.getElement(2, Form.ORIGINAL)).thenReturn("name");
		List<String> result = mapper.map(configurationPropertyName);
		assertEquals(2, result.size());
		assertEquals("my_property_name", result.get(0));
		assertEquals("my_property_name", result.get(1));
	}

	@Test
	@Disabled
	void testMapWithAdaptedName() {
		try (MockedStatic<ConfigurationPropertyName> mockedStatic = mockStatic(ConfigurationPropertyName.class)) {
			ConfigurationPropertyName adaptedName = mock(ConfigurationPropertyName.class);
			mockedStatic.when(() -> ConfigurationPropertyName.adapt(anyString(), anyChar(), any(Function.class))).thenReturn(adaptedName);
			when(adaptedName.getNumberOfElements()).thenReturn(1);
			when(adaptedName.getElement(0, Form.ORIGINAL)).thenReturn("adapted");
			List<String> result = mapper.map(adaptedName);
			assertEquals(1, result.size());
			assertEquals("adapted", result.get(0));
		}
	}
}
