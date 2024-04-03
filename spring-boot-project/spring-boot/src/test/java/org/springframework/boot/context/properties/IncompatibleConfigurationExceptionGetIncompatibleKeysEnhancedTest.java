package org.springframework.boot.context.properties;

import org.springframework.boot.context.properties.IncompatibleConfigurationException;

import java.util.List;

import org.springframework.boot.context.properties.*;
import org.springframework.boot.context.properties.IncompatibleConfigurationException;

import java.util.*;
import java.util.Collection;
import java.util.List;
import java.util.Arrays;

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

class IncompatibleConfigurationExceptionGetIncompatibleKeysEnhancedTest {

	@Test
	void testGetIncompatibleKeysWithSingleKey() {
		IncompatibleConfigurationException exception = new IncompatibleConfigurationException("key1");
		Collection<String> incompatibleKeys = exception.getIncompatibleKeys();
		assertEquals(1, incompatibleKeys.size(), "The size of incompatible keys should be 1");
		assertTrue(incompatibleKeys.contains("key1"), "The collection should contain 'key1'");
	}

	@Test
	void testGetIncompatibleKeysWithMultipleKeys() {
		IncompatibleConfigurationException exception = new IncompatibleConfigurationException("key1", "key2", "key3");
		Collection<String> incompatibleKeys = exception.getIncompatibleKeys();
		assertEquals(3, incompatibleKeys.size(), "The size of incompatible keys should be 3");
		assertTrue(incompatibleKeys.containsAll(Arrays.asList("key1", "key2", "key3")), "The collection should contain 'key1', 'key2', 'key3'");
	}

	@Test
	void testGetIncompatibleKeysWithNoKeys() {
		IncompatibleConfigurationException exception = new IncompatibleConfigurationException();
		Collection<String> incompatibleKeys = exception.getIncompatibleKeys();
		assertTrue(incompatibleKeys.isEmpty(), "The collection of incompatible keys should be empty");
	}

	@Test
	void testExceptionMessage() {
		IncompatibleConfigurationException exception = new IncompatibleConfigurationException("key1", "key2");
		String expectedMessage = "The following configuration properties have incompatible values: [key1, key2]";
		assertEquals(expectedMessage, exception.getMessage(), "Exception message should match the expected message");
	}
}
