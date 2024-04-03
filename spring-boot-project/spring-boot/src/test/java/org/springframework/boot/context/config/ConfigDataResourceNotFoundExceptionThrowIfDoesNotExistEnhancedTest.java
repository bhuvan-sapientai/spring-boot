package org.springframework.boot.context.config;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;

import java.nio.file.Path;
import java.nio.file.*;

import org.springframework.core.io.Resource;

import java.io.File;
import java.lang.*;

import org.springframework.boot.origin.Origin;
import org.springframework.util.*;

import java.io.*;

import org.springframework.core.io.*;
import org.springframework.boot.context.config.ConfigDataResource;

import java.lang.Throwable;

import org.springframework.util.Assert;
import org.springframework.boot.context.config.ConfigDataLocation;
import org.springframework.boot.origin.*;
import org.springframework.boot.context.config.*;
import org.springframework.boot.origin.Origin;

import java.nio.file.Path;

import org.springframework.util.Assert;
import org.springframework.core.io.Resource;

import java.nio.file.Files;
import java.io.File;

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

@ExtendWith(MockitoExtension.class)
public class ConfigDataResourceNotFoundExceptionThrowIfDoesNotExistEnhancedTest {

	@Mock
	private ConfigDataResource mockResource;

	@Mock
	private File mockFile;

	@Test
	public void testThrowIfDoesNotExist_WhenFileExists_ShouldNotThrowException() {
		when(mockFile.exists()).thenReturn(true);
		ConfigDataResourceNotFoundException.throwIfDoesNotExist(mockResource, mockFile);
		verify(mockFile).exists();
	}

	@Test
	public void testThrowIfDoesNotExist_WhenFileDoesNotExist_ShouldThrowException() {
		when(mockFile.exists()).thenReturn(false);
		try (MockedStatic<Assert> mockedAssert = mockStatic(Assert.class)) {
			mockedAssert.when(() -> Assert.notNull(any(), anyString())).thenAnswer(invocation -> null);
			Exception exception = org.junit.jupiter.api.Assertions.assertThrows(ConfigDataResourceNotFoundException.class, () -> ConfigDataResourceNotFoundException.throwIfDoesNotExist(mockResource, mockFile));
			verify(mockFile).exists();
			mockedAssert.verify(() -> Assert.notNull(any(ConfigDataResource.class), eq("Resource must not be null")));
		}
	}
}
