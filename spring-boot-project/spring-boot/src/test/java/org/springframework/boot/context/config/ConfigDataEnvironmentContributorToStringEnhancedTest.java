package org.springframework.boot.context.config;

import org.springframework.boot.context.config.ConfigDataEnvironmentContributor;

import org.springframework.boot.context.properties.bind.Binder;

import java.lang.NullPointerException;

import org.springframework.boot.context.config.ConfigDataEnvironmentContributor;

import java.util.Spliterator;

import org.springframework.core.env.PropertySource;
import org.springframework.boot.context.properties.source.ConfigurationPropertySource;
import org.springframework.boot.context.properties.source.*;

import java.util.Iterator;

import org.springframework.boot.context.config.ConfigData;
import org.springframework.boot.context.config.*;
import org.springframework.core.env.*;

import java.util.List;
import java.util.Map;

import org.springframework.util.CollectionUtils;
import org.springframework.boot.context.properties.bind.*;

import java.lang.StringBuilder;
import java.util.stream.Stream;
import java.util.stream.*;
import java.lang.*;

import org.springframework.util.*;
import org.springframework.boot.context.config.ConfigDataActivationContext;
import org.springframework.boot.context.config.ConfigDataProperties;
import org.springframework.boot.context.config.ConfigDataResource;

import java.lang.Iterable;

import org.springframework.boot.context.config.ConfigDataLocation;

import java.util.*;

import org.springframework.boot.context.properties.bind.PlaceholdersResolver;
import org.springframework.util.CollectionUtils;
import org.springframework.boot.context.properties.source.ConfigurationPropertySource;

import java.util.ArrayList;
import java.util.stream.StreamSupport;

import org.springframework.core.env.PropertySource;

import java.util.LinkedHashMap;

import org.springframework.boot.context.properties.bind.Binder;

import java.util.Iterator;

import org.springframework.core.env.Environment;

import java.util.stream.Stream;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import java.util.NoSuchElementException;

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

class ConfigDataEnvironmentContributorToStringEnhancedTest {

	private ConfigDataEnvironmentContributor contributor;

	@BeforeEach
	void setUp() {
		contributor = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, null, null, false, null, null, null, ConfigData.Options.NONE, Collections.emptyMap());
	}

	@Test
	void testToString() {
		try (MockedStatic<ConfigDataEnvironmentContributor> mockedStatic = Mockito.mockStatic(ConfigDataEnvironmentContributor.class)) {
			mockedStatic.when(() -> ConfigDataEnvironmentContributor.of(anyString())).thenAnswer(invocation -> new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, null, null, false, null, null, null, ConfigData.Options.NONE, Collections.emptyMap()));
			StringBuilder builder = new StringBuilder();
			contributor.buildToString("", builder);
			String result = contributor.toString();
			// Verify that buildToString was called with the correct parameters
			verify(mockedStatic, times(1)).invoke("buildToString", "", builder);
			// Assert that the result of toString is as expected
			assertEquals(builder.toString(), result);
		}
	}
}
