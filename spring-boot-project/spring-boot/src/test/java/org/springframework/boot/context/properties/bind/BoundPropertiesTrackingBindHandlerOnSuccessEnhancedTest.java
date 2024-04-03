package org.springframework.boot.context.properties.bind;

import org.springframework.boot.context.properties.bind.BoundPropertiesTrackingBindHandler;

import org.springframework.boot.context.properties.bind.Bindable;

import java.util.function.*;

import org.springframework.boot.context.properties.bind.BindHandler;
import org.springframework.boot.context.properties.bind.*;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import java.lang.*;

import org.springframework.boot.context.properties.source.*;
import org.springframework.util.*;
import org.springframework.boot.context.properties.bind.BoundPropertiesTrackingBindHandler;

import java.util.function.Consumer;

import org.springframework.boot.context.properties.source.ConfigurationProperty;
import org.springframework.util.Assert;

import java.lang.Object;

import org.springframework.boot.context.properties.bind.BindContext;
import org.springframework.boot.context.properties.source.ConfigurationProperty;
import org.springframework.util.Assert;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import java.util.function.Consumer;

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

class BoundPropertiesTrackingBindHandlerOnSuccessEnhancedTest {

	private BoundPropertiesTrackingBindHandler handler;

	private Consumer<ConfigurationProperty> consumer;

	private ConfigurationPropertyName name;

	private Bindable<?> target;

	private BindContext context;

	private Object result;

	private ConfigurationProperty configurationProperty;

	@BeforeEach
	void setUp() {
		consumer = mock(Consumer.class);
		handler = new BoundPropertiesTrackingBindHandler(consumer);
		name = mock(ConfigurationPropertyName.class);
		target = mock(Bindable.class);
		context = mock(BindContext.class);
		result = new Object();
		configurationProperty = mock(ConfigurationProperty.class);
	}

	@Test
	void onSuccessWhenConfigurationPropertyIsNull() {
		when(context.getConfigurationProperty()).thenReturn(null);
		handler.onSuccess(name, target, context, result);
		verify(consumer, never()).accept(any(ConfigurationProperty.class));
	}

	@Test
	void onSuccessWhenConfigurationPropertyNameDoesNotMatch() {
		when(context.getConfigurationProperty()).thenReturn(configurationProperty);
		when(configurationProperty.getName()).thenReturn(mock(ConfigurationPropertyName.class));
		when(name.equals(any())).thenReturn(false);
		handler.onSuccess(name, target, context, result);
		verify(consumer, never()).accept(any(ConfigurationProperty.class));
	}

	@Test
	void onSuccessWhenConfigurationPropertyNameMatches() {
		when(context.getConfigurationProperty()).thenReturn(configurationProperty);
		when(configurationProperty.getName()).thenReturn(name);
		when(name.equals(any())).thenReturn(true);
		handler.onSuccess(name, target, context, result);
		verify(consumer).accept(configurationProperty);
	}

	@Test
	void onSuccessShouldCallSuperOnSuccess() {
		AbstractBindHandler parentHandler = mock(AbstractBindHandler.class);
		try (MockedStatic<Assert> mocked = Mockito.mockStatic(Assert.class)) {
			mocked.when(() -> Assert.notNull(any(), anyString())).thenReturn(null);
			BoundPropertiesTrackingBindHandler handlerWithParent = new BoundPropertiesTrackingBindHandler(consumer);
			when(context.getConfigurationProperty()).thenReturn(configurationProperty);
			when(configurationProperty.getName()).thenReturn(name);
			when(name.equals(any())).thenReturn(true);
			handlerWithParent.onSuccess(name, target, context, result);
			verify(parentHandler).onSuccess(name, target, context, result);
		}
	}
}
