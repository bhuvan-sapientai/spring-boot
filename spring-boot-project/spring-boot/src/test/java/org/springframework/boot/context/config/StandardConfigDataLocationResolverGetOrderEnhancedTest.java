package org.springframework.boot.context.config;

import org.springframework.boot.context.config.StandardConfigDataLocationResolver;

import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.boot.context.config.LocationResourceLoader;

import java.util.function.*;

import org.springframework.boot.env.*;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.util.StringUtils;

import java.util.function.Supplier;

import org.apache.commons.logging.impl.NoOpLog;

import org.springframework.boot.env.PropertySourceLoader;

import java.lang.IllegalStateException;
import java.util.Iterator;

import org.springframework.boot.logging.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.boot.context.config.StandardConfigDataResource;
import org.springframework.boot.context.config.ConfigDataLocationResolverContext;
import org.springframework.boot.logging.DeferredLogFactory;
import org.springframework.boot.context.config.*;
import org.springframework.boot.context.config.StandardConfigDataReference;

import java.util.List;
import java.lang.Class;

import org.apache.commons.logging.impl.*;

import org.springframework.boot.context.config.ConfigDataLocationNotFoundException;
import org.springframework.core.io.Resource;
import org.springframework.core.log.*;
import org.springframework.boot.context.properties.bind.*;
import org.springframework.core.io.ResourceLoader;

import java.lang.ClassLoader;

import org.springframework.core.log.LogMessage;
import org.springframework.boot.context.config.StandardConfigDataLocationResolver;

import java.lang.*;

import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.util.*;
import org.springframework.core.io.*;
import org.springframework.util.ObjectUtils;
import org.springframework.boot.context.config.ConfigDataResource;
import org.springframework.boot.context.config.Profiles;
import org.springframework.util.Assert;
import org.springframework.boot.context.config.ConfigDataLocation;
import org.springframework.core.io.support.*;

import java.util.*;
import java.util.LinkedHashSet;

import org.springframework.core.io.ResourceLoader;

import java.util.Set;
import java.util.regex.Matcher;

import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.boot.env.PropertySourceLoader;
import org.springframework.core.Ordered;

import java.util.ArrayList;

import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.regex.Pattern;

import org.apache.commons.logging.Log;

import org.springframework.core.io.Resource;
import org.springframework.boot.context.config.LocationResourceLoader.ResourceType;

import java.util.Deque;

import org.springframework.util.ObjectUtils;
import org.springframework.core.io.ClassPathResource;

import java.util.ArrayDeque;

import org.springframework.core.log.LogMessage;
import org.springframework.boot.logging.DeferredLogFactory;
import org.springframework.core.env.Environment;

import java.util.Collection;
import java.util.Arrays;
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

class StandardConfigDataLocationResolverGetOrderEnhancedTest {

	@Test
	void testGetOrder() {
		// Arrange
		DeferredLogFactory logFactory = mock(DeferredLogFactory.class);
		Binder binder = mock(Binder.class);
		ResourceLoader resourceLoader = mock(ResourceLoader.class);
		StandardConfigDataLocationResolver resolver = new StandardConfigDataLocationResolver(logFactory, binder, resourceLoader);
		// Act
		int order = resolver.getOrder();
		// Assert
		assertEquals(Ordered.LOWEST_PRECEDENCE, order);
	}
}
