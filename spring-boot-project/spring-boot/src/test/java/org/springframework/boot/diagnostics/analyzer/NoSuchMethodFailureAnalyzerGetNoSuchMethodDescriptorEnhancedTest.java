package org.springframework.boot.diagnostics.analyzer;

import org.springframework.boot.diagnostics.analyzer.NoSuchMethodFailureAnalyzer;

import java.util.List;
import java.lang.Class;

import org.springframework.boot.diagnostics.analyzer.*;

import java.lang.NoSuchMethodError;

import org.springframework.util.ClassUtils;
import org.springframework.boot.diagnostics.*;

import java.lang.ClassLoader;
import java.net.URL;

import org.springframework.boot.diagnostics.analyzer.NoSuchMethodFailureAnalyzer;

import java.lang.*;

import org.springframework.util.*;
import org.springframework.boot.diagnostics.FailureAnalysis;

import java.util.Enumeration;
import java.net.*;
import java.lang.Throwable;
import java.util.*;
import java.io.StringWriter;
import java.util.ArrayList;

import org.springframework.boot.diagnostics.FailureAnalysis;

import java.util.List;
import java.util.Collections;

import org.springframework.util.ClassUtils;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;

import java.net.URL;
import java.io.PrintWriter;

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
class NoSuchMethodFailureAnalyzerGetNoSuchMethodDescriptorEnhancedTest {

	@Mock
	private ClassLoader classLoader;

	private NoSuchMethodFailureAnalyzer analyzer;

	@BeforeEach
	void setUp() {
		analyzer = new NoSuchMethodFailureAnalyzer();
	}

	@Test
	void getNoSuchMethodDescriptor_withValidCause_shouldReturnDescriptor() throws Exception {
		String cause = "'someMethod' in class 'com.example.SomeClass'";
		String expectedClassName = "com.example.SomeClass";
		URL mockUrl = new URL("file://dummy");
		Enumeration<URL> resources = new Vector<>(Collections.singletonList(mockUrl)).elements();
		try (MockedStatic<ClassUtils> classUtilsMockedStatic = mockStatic(ClassUtils.class)) {
			classUtilsMockedStatic.when(() -> ClassUtils.getDefaultClassLoader()).thenReturn(classLoader);
			when(classLoader.getResources(anyString())).thenReturn(resources);
			NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor descriptor = analyzer.getNoSuchMethodDescriptor(cause);
			assertNotNull(descriptor);
			assertEquals(expectedClassName, descriptor.getClassName());
			assertEquals(1, descriptor.getCandidateLocations().size());
			assertEquals(mockUrl, descriptor.getCandidateLocations().get(0));
			// Assuming getTypeHierarchy returns a non-null value for the purpose of this test
			assertNotNull(descriptor.getTypeHierarchy());
		}
	}

	@Test
	void getNoSuchMethodDescriptor_withInvalidCause_shouldReturnNull() {
		String cause = "Invalid cause message";
		NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor descriptor = analyzer.getNoSuchMethodDescriptor(cause);
		assertNull(descriptor);
	}

	@Test
	void getNoSuchMethodDescriptor_withNullClassName_shouldReturnNull() {
		String cause = "'someMethod' without class";
		NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor descriptor = analyzer.getNoSuchMethodDescriptor(cause);
		assertNull(descriptor);
	}

	@Test
	void getNoSuchMethodDescriptor_withIOException_shouldReturnNull() throws Exception {
		String cause = "'someMethod' in class 'com.example.SomeClass'";
		try (MockedStatic<ClassUtils> classUtilsMockedStatic = mockStatic(ClassUtils.class)) {
			classUtilsMockedStatic.when(() -> ClassUtils.getDefaultClassLoader()).thenReturn(classLoader);
			when(classLoader.getResources(anyString())).thenThrow(new IOException());
			NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor descriptor = analyzer.getNoSuchMethodDescriptor(cause);
			assertNull(descriptor);
		}
	}
}
