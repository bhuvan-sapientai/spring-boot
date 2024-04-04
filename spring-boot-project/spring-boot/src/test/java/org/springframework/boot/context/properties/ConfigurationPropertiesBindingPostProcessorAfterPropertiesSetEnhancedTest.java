package org.springframework.boot.context.properties;

import org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor;

import org.springframework.beans.factory.support.*;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.boot.context.properties.bind.BindMethod;

import java.lang.Class;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.context.properties.BindMethodAttribute;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinder;
import org.springframework.context.*;
import org.springframework.boot.context.properties.bind.*;
import org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor;

import java.lang.*;

import org.springframework.boot.context.properties.ConfigurationPropertiesBindException;
import org.springframework.boot.context.properties.ConfigurationPropertiesBean;
import org.springframework.util.*;
import org.springframework.boot.context.properties.*;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.*;
import org.springframework.util.Assert;

import java.lang.Object;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.core.env.PropertySources;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.util.Assert;
import org.springframework.context.ApplicationContextAware;
import org.springframework.boot.context.properties.bind.BindMethod;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.core.PriorityOrdered;
import org.springframework.beans.BeansException;

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
public class ConfigurationPropertiesBindingPostProcessorAfterPropertiesSetEnhancedTest {

	@Mock
	private ApplicationContext applicationContext;

	@Mock
	private AutowireCapableBeanFactory autowireCapableBeanFactory;

	@Mock
	private BeanDefinitionRegistry registry;

	@Mock
	private ConfigurationPropertiesBinder binder;

	private ConfigurationPropertiesBindingPostProcessor processor;

	@BeforeEach
	void setUp() {
		processor = new ConfigurationPropertiesBindingPostProcessor();
		processor.setApplicationContext(applicationContext);
	}

	@Test
	@Disabled
	void afterPropertiesSet() throws Exception {
		// Arrange
		when(applicationContext.getAutowireCapableBeanFactory()).thenReturn(autowireCapableBeanFactory);
		when(autowireCapableBeanFactory).thenReturn((AutowireCapableBeanFactory) registry);
		try (MockedStatic<ConfigurationPropertiesBinder> mockedBinder = mockStatic(ConfigurationPropertiesBinder.class)) {
			mockedBinder.when(() -> ConfigurationPropertiesBinder.get(any(ApplicationContext.class))).thenReturn(binder);
			// Act
			processor.afterPropertiesSet();
			// Assert
			verify(applicationContext).getAutowireCapableBeanFactory();
			verifyNoMoreInteractions(applicationContext);
			mockedBinder.verify(() -> ConfigurationPropertiesBinder.get(applicationContext));
			mockedBinder.verifyNoMoreInteractions();
		}
	}
}
