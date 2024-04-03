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
class ImportCandidatesLoadEnhancedTest {

	@Mock
	private ClassLoader classLoader;

	@Mock
	private Enumeration<URL> urls;

	@Mock
	private URL url;

	@Mock
	private InputStream inputStream;

	@Mock
	private BufferedReader bufferedReader;

	@BeforeEach
	void setUp() throws IOException {
		when(classLoader.getResources(anyString())).thenReturn(urls);
		when(urls.hasMoreElements()).thenReturn(true, false);
		when(urls.nextElement()).thenReturn(url);
		when(url.openStream()).thenReturn(inputStream);
		when(new BufferedReader(new InputStreamReader(any(InputStream.class), eq(StandardCharsets.UTF_8)))).thenReturn(bufferedReader);
	}

	@Test
	void load_WithValidInputs_ShouldReturnImportCandidates() throws IOException {
		// Arrange
		Class<?> annotation = ImportCandidates.class;
		String expectedCandidate = "org.example.SomeClass";
		when(bufferedReader.readLine()).thenReturn(expectedCandidate, (String) null);
		try (MockedStatic<Assert> mockedAssert = mockStatic(Assert.class)) {
			mockedAssert.when(() -> Assert.notNull(any(), anyString())).thenAnswer(invocation -> null);
			// Act
			ImportCandidates result = ImportCandidates.load(annotation, classLoader);
			// Assert
			assertNotNull(result);
			assertTrue(result.iterator().hasNext());
			assertEquals(expectedCandidate, result.iterator().next());
		}
	}

	@Test
	void load_WithNullAnnotation_ShouldThrowException() {
		// Arrange
		Class<?> annotation = null;
		try (MockedStatic<Assert> mockedAssert = mockStatic(Assert.class)) {
			mockedAssert.when(() -> Assert.notNull(any(), anyString())).thenThrow(new IllegalArgumentException("'annotation' must not be null"));
			// Act & Assert
			assertThrows(IllegalArgumentException.class, () -> ImportCandidates.load(annotation, classLoader));
		}
	}

	@Test
	void load_WithIOException_ShouldThrowException() throws IOException {
		// Arrange
		Class<?> annotation = ImportCandidates.class;
		when(classLoader.getResources(anyString())).thenThrow(new IOException("Failed to load resources"));
		// Act & Assert
		assertThrows(IllegalArgumentException.class, () -> ImportCandidates.load(annotation, classLoader));
	}

	@Test
	void load_WithEmptyCandidates_ShouldReturnEmptyImportCandidates() throws IOException {
		// Arrange
		Class<?> annotation = ImportCandidates.class;
		when(bufferedReader.readLine()).thenReturn(null);
		try (MockedStatic<Assert> mockedAssert = mockStatic(Assert.class)) {
			mockedAssert.when(() -> Assert.notNull(any(), anyString())).thenAnswer(invocation -> null);
			// Act
			ImportCandidates result = ImportCandidates.load(annotation, classLoader);
			// Assert
			assertNotNull(result);
			assertFalse(result.iterator().hasNext());
		}
	}
}
