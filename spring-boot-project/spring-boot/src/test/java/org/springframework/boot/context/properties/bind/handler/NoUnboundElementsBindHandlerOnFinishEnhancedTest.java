package org.springframework.boot.context.properties.bind.handler;

import org.springframework.boot.context.properties.bind.handler.NoUnboundElementsBindHandler;

import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.UnboundConfigurationPropertiesException;

import java.util.function.*;

import org.springframework.boot.context.properties.source.ConfigurationPropertySource;
import org.springframework.boot.context.properties.bind.BindHandler;
import org.springframework.boot.context.properties.bind.*;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import java.lang.*;

import org.springframework.boot.context.properties.source.IterableConfigurationPropertySource;

import java.util.function.Predicate;

import org.springframework.boot.context.properties.source.*;
import org.springframework.boot.context.properties.bind.handler.*;
import org.springframework.util.*;

import java.util.Iterator;
import java.lang.Exception;
import java.util.function.Function;

import org.springframework.boot.context.properties.source.ConfigurationProperty;

import java.lang.Iterable;

import org.springframework.boot.context.properties.bind.handler.NoUnboundElementsBindHandler;
import org.springframework.util.Assert;

import java.lang.Object;

import org.springframework.boot.context.properties.bind.BindContext;

import java.util.*;

import org.springframework.boot.context.properties.source.ConfigurationProperty;
import org.springframework.boot.context.properties.bind.BindContext;
import org.springframework.boot.context.properties.source.IterableConfigurationPropertySource;

import java.util.function.Function;

import org.springframework.boot.context.properties.bind.UnboundConfigurationPropertiesException;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import java.util.Set;
import java.util.TreeSet;

import org.springframework.boot.context.properties.source.ConfigurationPropertySource;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.AbstractBindHandler;
import org.springframework.boot.context.properties.bind.BindHandler;

import java.util.HashSet;

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
class NoUnboundElementsBindHandlerOnFinishEnhancedTest {

	@Mock
	private BindHandler parentBindHandler;

	@Mock
	private BindContext bindContext;

	@Mock
	private ConfigurationPropertySource configurationPropertySource;

	@Mock
	private IterableConfigurationPropertySource iterableConfigurationPropertySource;

	@Mock
	private ConfigurationProperty configurationProperty;

	@Mock
	private Function<ConfigurationPropertySource, Boolean> filter;

	private NoUnboundElementsBindHandler noUnboundElementsBindHandler;

	@BeforeEach
	void setUp() {
		noUnboundElementsBindHandler = new NoUnboundElementsBindHandler(parentBindHandler, filter);
	}

	@Test
	@Disabled
	void onFinish_withNoUnboundElements_shouldNotThrowException() throws Exception {
		ConfigurationPropertyName name = ConfigurationPropertyName.of("test");
		when(bindContext.getDepth()).thenReturn(0);
		when(bindContext.getSources()).thenReturn(Collections.singletonList(configurationPropertySource));
		when(filter.apply(configurationPropertySource)).thenReturn(true);
		when(configurationPropertySource instanceof IterableConfigurationPropertySource).thenReturn(true);
		when(((IterableConfigurationPropertySource) configurationPropertySource).iterator()).thenReturn(Collections.emptyIterator());
		noUnboundElementsBindHandler.onFinish(name, null, bindContext, new Object());
		verify(bindContext).getDepth();
		verify(bindContext).getSources();
		verify(filter).apply(configurationPropertySource);
	}

//	@Test
//	void onFinish_withUnboundElements_shouldThrowUnboundConfigurationPropertiesException() {
//		ConfigurationPropertyName name = ConfigurationPropertyName.of("test");
//		when(bindContext.getDepth()).thenReturn(0);
//		when(bindContext.getSources()).thenReturn(Collections.singletonList(configurationPropertySource));
//		when(filter.apply(configurationPropertySource)).thenReturn(true);
//		when(configurationPropertySource instanceof IterableConfigurationPropertySource).thenReturn(true);
//		Set<ConfigurationProperty> unbound = new TreeSet<>();
//		unbound.add(configurationProperty);
//		when(((IterableConfigurationPropertySource) configurationPropertySource).iterator()).thenReturn(unbound.iterator());
//		Exception exception = org.junit.jupiter.api.Assertions.assertThrows(UnboundConfigurationPropertiesException.class, () -> {
//			noUnboundElementsBindHandler.onFinish(name, null, bindContext, new Object());
//		});
//		verify(bindContext).getDepth();
//		verify(bindContext).getSources();
//		verify(filter).apply(configurationPropertySource);
//	}
}
