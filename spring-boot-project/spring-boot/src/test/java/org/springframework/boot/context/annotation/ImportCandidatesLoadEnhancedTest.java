package org.springframework.boot.context.annotation;

import org.springframework.boot.context.annotation.ImportCandidates;

import org.springframework.core.io.UrlResource;

import java.util.List;
import java.lang.Class;

import org.springframework.boot.context.annotation.ImportCandidates;

import java.lang.ClassLoader;
import java.net.URL;
import java.lang.*;

import org.springframework.util.*;

import java.util.Iterator;
import java.io.InputStream;

import org.springframework.core.io.*;

import java.io.*;
import java.io.BufferedReader;
import java.util.Enumeration;
import java.lang.IllegalArgumentException;
import java.net.*;

import org.springframework.boot.context.annotation.*;

import java.lang.Throwable;

import org.springframework.util.Assert;

import java.util.*;

import org.springframework.util.Assert;

import java.util.Enumeration;
import java.io.InputStreamReader;

import org.springframework.core.io.UrlResource;

import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.util.List;
import java.io.IOException;
import java.util.Collections;
import java.net.URL;

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

class ImportCandidatesLoadEnhancedTest {

	private ClassLoader classLoader;

	private Class<?> annotationClass;

	@BeforeEach
	void setUp() {
		classLoader = mock(ClassLoader.class);
		annotationClass = mock(Class.class);
	}

	@Test
	void load_ShouldLoadCandidatesSuccessfully() throws IOException {
		// Arrange
		String location = "META-INF/spring/org.springframework.boot.context.annotation.ImportCandidates.imports";
		URL url = new URL("file:dummy");
		Enumeration<URL> urls = mock(Enumeration.class);
		when(urls.hasMoreElements()).thenReturn(true, false);
		when(urls.nextElement()).thenReturn(url);
		when(classLoader.getResources(location)).thenReturn(urls);
		InputStream inputStream = mock(InputStream.class);
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
		when(new UrlResource(url).getInputStream()).thenReturn(inputStream);
		when(reader.readLine()).thenReturn("candidate1", "candidate2", null);
		try (MockedStatic<Assert> assertMockedStatic = Mockito.mockStatic(Assert.class);
			 MockedStatic<UrlResource> urlResourceMockedStatic = Mockito.mockStatic(UrlResource.class);
			 MockedStatic<BufferedReader> bufferedReaderMockedStatic = Mockito.mockStatic(BufferedReader.class)) {
			assertMockedStatic.when(() -> Assert.notNull(any(), anyString())).thenAnswer(invocation -> null);
			urlResourceMockedStatic.when(() -> new UrlResource(any(URL.class))).thenReturn(mock(UrlResource.class));
			bufferedReaderMockedStatic.when(() -> new BufferedReader(any(InputStreamReader.class))).thenReturn(reader);
			// Act
			ImportCandidates result = ImportCandidates.load(annotationClass, classLoader);
			// Assert
			assertNotNull(result);
			assertTrue(result.iterator().hasNext());
			assertEquals("candidate1", result.iterator().next());
		}
	}

	@Test
	void load_ShouldThrowExceptionWhenResourcesNotFound() throws IOException {
		// Arrange
		String location = "META-INF/spring/org.springframework.boot.context.annotation.ImportCandidates.imports";
		when(classLoader.getResources(location)).thenThrow(new IOException("Resources not found"));
		try (MockedStatic<Assert> assertMockedStatic = Mockito.mockStatic(Assert.class)) {
			assertMockedStatic.when(() -> Assert.notNull(any(), anyString())).thenAnswer(invocation -> null);
			// Act & Assert
			assertThrows(IllegalArgumentException.class, () -> ImportCandidates.load(annotationClass, classLoader));
		}
	}

	@Test
	void load_ShouldThrowExceptionWhenUnableToLoadConfigurations() throws IOException {
		// Arrange
		String location = "META-INF/spring/org.springframework.boot.context.annotation.ImportCandidates.imports";
		URL url = new URL("file:dummy");
		Enumeration<URL> urls = mock(Enumeration.class);
		when(urls.hasMoreElements()).thenReturn(true, false);
		when(urls.nextElement()).thenReturn(url);
		when(classLoader.getResources(location)).thenReturn(urls);
		InputStream inputStream = mock(InputStream.class);
		when(new UrlResource(url).getInputStream()).thenReturn(inputStream);
		when(inputStream.read()).thenThrow(new IOException("Unable to read"));
		try (MockedStatic<Assert> assertMockedStatic = Mockito.mockStatic(Assert.class);
			 MockedStatic<UrlResource> urlResourceMockedStatic = Mockito.mockStatic(UrlResource.class)) {
			assertMockedStatic.when(() -> Assert.notNull(any(), anyString())).thenAnswer(invocation -> null);
			urlResourceMockedStatic.when(() -> new UrlResource(any(URL.class))).thenReturn(mock(UrlResource.class));
			// Act & Assert
			assertThrows(IllegalArgumentException.class, () -> ImportCandidates.load(annotationClass, classLoader));
		}
	}
}
