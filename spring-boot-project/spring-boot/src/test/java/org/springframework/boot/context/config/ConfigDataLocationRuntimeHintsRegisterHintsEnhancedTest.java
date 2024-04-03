package org.springframework.boot.context.config;

import org.springframework.boot.context.config.ConfigDataLocationRuntimeHints;

import java.util.List;
import java.lang.Class;

import org.springframework.boot.env.*;

import java.lang.ClassLoader;

import org.springframework.aot.hint.support.*;
import org.springframework.boot.context.config.ConfigDataLocationRuntimeHints;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.ResourceHints;
import org.springframework.boot.env.PropertySourceLoader;

import java.lang.*;

import org.springframework.aot.hint.support.FilePatternResourceHintsRegistrar;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.aot.hint.*;
import org.springframework.boot.context.config.*;

import java.util.*;

import org.springframework.core.io.support.*;

import org.apache.commons.logging.LogFactory;

import org.springframework.aot.hint.support.FilePatternResourceHintsRegistrar;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.aot.hint.RuntimeHints;

import org.apache.commons.logging.Log;

import org.springframework.util.ResourceUtils;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.boot.env.PropertySourceLoader;

import java.util.ArrayList;
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

@ExtendWith(MockitoExtension.class)
public class ConfigDataLocationRuntimeHintsRegisterHintsEnhancedTest {

	@Mock
	private RuntimeHints runtimeHints;

	@Mock
	private ClassLoader classLoader;

	@Mock
	private ResourceHints resourceHints;

	@Mock
	private Builder builder;

	private ConfigDataLocationRuntimeHints configDataLocationRuntimeHints;

	@BeforeEach
	public void setUp() {
		configDataLocationRuntimeHints = new ConfigDataLocationRuntimeHints();
	}

	@Test
	public void testRegisterHints() {
		try (MockedStatic<FilePatternResourceHintsRegistrar> mockedStatic = mockStatic(FilePatternResourceHintsRegistrar.class)) {
			List<String> fileNames = Arrays.asList("application", "config");
			List<String> locations = Arrays.asList("classpath:/", "file:./");
			List<String> extensions = Arrays.asList("yml", "properties");
			when(configDataLocationRuntimeHints.getExtensions(classLoader)).thenReturn(extensions);
			when(configDataLocationRuntimeHints.getLocations(classLoader)).thenReturn(locations);
			when(configDataLocationRuntimeHints.getFileNames(classLoader)).thenReturn(fileNames);
			mockedStatic.when(() -> FilePatternResourceHintsRegistrar.forClassPathLocations(locations)).thenReturn(builder);
			when(builder.withFilePrefixes(fileNames)).thenReturn(builder);
			when(builder.withFileExtensions(extensions)).thenReturn(builder);
			when(runtimeHints.resources()).thenReturn(resourceHints);
			configDataLocationRuntimeHints.registerHints(runtimeHints, classLoader);
			verify(builder).withFilePrefixes(fileNames);
			verify(builder).withFileExtensions(extensions);
			verify(builder).registerHints(resourceHints, classLoader);
		}
	}
}
