package org.springframework.boot.convert;

import org.springframework.boot.convert.StringToFileConverter;

import java.lang.*;
import java.lang.IllegalStateException;

import org.springframework.util.*;
import org.springframework.core.io.*;

import java.io.*;

import org.springframework.boot.convert.StringToFileConverter;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

import java.io.File;

import org.springframework.util.ResourceUtils;
import org.springframework.boot.convert.*;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.ResourceUtils;
import org.springframework.core.io.Resource;
import org.springframework.core.convert.converter.Converter;

import java.io.IOException;
import java.io.File;

import org.springframework.core.io.DefaultResourceLoader;

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
class StringToFileConverterConvertEnhancedTest {

	@Mock
	private ResourceLoader resourceLoader;

	@Mock
	private Resource resource;

	private StringToFileConverter converter;

	@BeforeEach
	void setUp() {
		converter = new StringToFileConverter();
		when(resourceLoader.getResource(anyString())).thenReturn(resource);
	}

	@Test
	void convert_WhenUrlExists_ShouldReturnFile() throws IOException {
		String url = "http://example.com/file.txt";
		File expectedFile = new File("downloaded.txt");
		try (MockedStatic<ResourceUtils> mockedResourceUtils = mockStatic(ResourceUtils.class)) {
			mockedResourceUtils.when(() -> ResourceUtils.isUrl(url)).thenReturn(true);
			when(resource.exists()).thenReturn(true);
			when(resource.getFile()).thenReturn(expectedFile);
			File result = converter.convert(url);
			assertEquals(expectedFile, result);
		}
	}

	@Test
	void convert_WhenUrlDoesNotExist_ShouldReturnFile() {
		String url = "http://example.com/file.txt";
		File expectedFile = new File(url);
		try (MockedStatic<ResourceUtils> mockedResourceUtils = mockStatic(ResourceUtils.class)) {
			mockedResourceUtils.when(() -> ResourceUtils.isUrl(url)).thenReturn(true);
			when(resource.exists()).thenReturn(false);
			File result = converter.convert(url);
			assertEquals(expectedFile, result);
		}
	}

	@Test
	void convert_WhenFileExists_ShouldReturnFile() {
		String filePath = "existing.txt";
		File expectedFile = new File(filePath);
		when(expectedFile.exists()).thenReturn(true);
		File result = converter.convert(filePath);
		assertEquals(expectedFile, result);
	}

	@Test
	void convert_WhenFileDoesNotExistAndResourceExists_ShouldReturnFile() throws IOException {
		String filePath = "nonexisting.txt";
		File expectedFile = new File(filePath);
		when(expectedFile.exists()).thenReturn(false);
		when(resource.exists()).thenReturn(true);
		when(resource.getFile()).thenReturn(expectedFile);
		File result = converter.convert(filePath);
		assertEquals(expectedFile, result);
	}

	@Test
	void convert_WhenFileAndResourceDoNotExist_ShouldReturnFile() {
		String filePath = "nonexisting.txt";
		File expectedFile = new File(filePath);
		when(expectedFile.exists()).thenReturn(false);
		when(resource.exists()).thenReturn(false);
		File result = converter.convert(filePath);
		assertEquals(expectedFile, result);
	}

	@Test
	void convert_WhenResourceThrowsIOException_ShouldThrowIllegalStateException() throws IOException {
		String url = "http://example.com/file.txt";
		IOException ioException = new IOException("File access error");
		try (MockedStatic<ResourceUtils> mockedResourceUtils = mockStatic(ResourceUtils.class)) {
			mockedResourceUtils.when(() -> ResourceUtils.isUrl(url)).thenReturn(true);
			when(resource.exists()).thenReturn(true);
			when(resource.getFile()).thenThrow(ioException);
			IllegalStateException exception = assertThrows(IllegalStateException.class, () -> converter.convert(url));
			assertTrue(exception.getMessage().contains("Could not retrieve file for"));
		}
	}
}
