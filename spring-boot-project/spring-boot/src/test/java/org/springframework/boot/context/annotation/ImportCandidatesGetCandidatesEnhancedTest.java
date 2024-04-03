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

class ImportCandidatesGetCandidatesEnhancedTest {

	private MockedStatic<Assert> mockedAssert;

	private MockedStatic<UrlResource> mockedUrlResource;

	@BeforeEach
	void setUp() {
		mockedAssert = Mockito.mockStatic(Assert.class);
		mockedUrlResource = Mockito.mockStatic(UrlResource.class);
	}

	@AfterEach
	void tearDown() {
		mockedAssert.close();
		mockedUrlResource.close();
	}

	@Test
	void testGetCandidates() {
		List<String> candidateList = Arrays.asList("candidate1", "candidate2");
		ImportCandidates importCandidates = new ImportCandidates(candidateList);
		assertEquals(candidateList, importCandidates.getCandidates());
	}

	@Test
	void testLoadWithNonNullAnnotationAndClassLoader() throws Exception {
		Class<?> annotation = ImportCandidates.class;
		ClassLoader classLoader = Mockito.mock(ClassLoader.class);
		String location = String.format("META-INF/spring/%s.imports", annotation.getName());
		URL url = new URL("file://dummy");
		Enumeration<URL> urls = Collections.enumeration(Collections.singletonList(url));
		String candidateConfig = "org.example.SomeClass";
		InputStream inputStream = new ByteArrayInputStream(candidateConfig.getBytes(StandardCharsets.UTF_8));
		Mockito.when(classLoader.getResources(eq(location))).thenReturn(urls);
		Mockito.when(url.openStream()).thenReturn(inputStream);
		ImportCandidates result = ImportCandidates.load(annotation, classLoader);
		assertNotNull(result);
		assertEquals(Collections.singletonList(candidateConfig), result.getCandidates());
	}

	@Test
	void testLoadWithNullAnnotation() {
		ClassLoader classLoader = Mockito.mock(ClassLoader.class);
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			ImportCandidates.load(null, classLoader);
		});
		assertNotNull(exception);
	}

	@Test
	void testLoadWithNullClassLoader() {
		Class<?> annotation = ImportCandidates.class;
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			ImportCandidates.load(annotation, null);
		});
		assertNotNull(exception);
	}
}
