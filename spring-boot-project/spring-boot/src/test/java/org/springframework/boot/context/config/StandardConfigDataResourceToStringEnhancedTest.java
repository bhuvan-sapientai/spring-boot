package org.springframework.boot.context.config;

import org.springframework.boot.context.config.StandardConfigDataResource;

import org.springframework.boot.context.config.StandardConfigDataReference;
import org.springframework.core.io.Resource;

import java.io.File;

import org.springframework.core.io.FileUrlResource;

import java.lang.*;

import org.springframework.util.*;
import org.springframework.core.io.*;

import java.io.*;

import org.springframework.boot.context.config.StandardConfigDataResource;
import org.springframework.util.Assert;
import org.springframework.core.io.FileSystemResource;

import java.lang.Object;

import org.springframework.boot.context.config.*;
import org.springframework.util.Assert;
import org.springframework.core.io.Resource;
import org.springframework.core.io.FileSystemResource;

import java.io.IOException;

import org.springframework.core.io.FileUrlResource;

import java.io.File;

import org.springframework.core.io.ClassPathResource;

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

class StandardConfigDataResourceToStringEnhancedTest {

	private StandardConfigDataReference reference;

	private Resource resource;

	private StandardConfigDataResource standardConfigDataResource;

	@BeforeEach
	void setUp() {
		reference = mock(StandardConfigDataReference.class);
		resource = mock(Resource.class);
	}

	@Test
	void testToStringWithFileSystemResource() throws IOException {
		resource = mock(FileSystemResource.class);
		File file = new File("test.txt");
		when(resource.getFile()).thenReturn(file);
		standardConfigDataResource = new StandardConfigDataResource(reference, resource);
		assertEquals("file [" + file + "]", standardConfigDataResource.toString());
	}

	@Test
	void testToStringWithFileUrlResource() throws IOException {
		resource = mock(FileUrlResource.class);
		File file = new File("test.txt");
		when(resource.getFile()).thenReturn(file);
		standardConfigDataResource = new StandardConfigDataResource(reference, resource);
		assertEquals("file [" + file + "]", standardConfigDataResource.toString());
	}

	@Test
	void testToStringWithIOException() throws IOException {
		when(resource.getFile()).thenThrow(new IOException());
		standardConfigDataResource = new StandardConfigDataResource(reference, resource);
		assertEquals(resource.toString(), standardConfigDataResource.toString());
	}

	@Test
	void testToStringWithNonFileResource() {
		standardConfigDataResource = new StandardConfigDataResource(reference, resource);
		assertEquals(resource.toString(), standardConfigDataResource.toString());
	}

	@Test
	void testConstructorNotNullAssertions() {
		try (MockedStatic<Assert> mocked = Mockito.mockStatic(Assert.class)) {
			new StandardConfigDataResource(reference, resource);
			mocked.verify(() -> Assert.notNull(reference, "Reference must not be null"));
			mocked.verify(() -> Assert.notNull(resource, "Resource must not be null"));
		}
	}
}
