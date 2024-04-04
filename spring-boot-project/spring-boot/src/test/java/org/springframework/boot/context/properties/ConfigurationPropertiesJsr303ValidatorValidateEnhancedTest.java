package org.springframework.boot.context.properties;

import org.springframework.boot.context.properties.ConfigurationPropertiesJsr303Validator;

import java.lang.*;

import org.springframework.boot.context.properties.ConfigurationPropertiesJsr303Validator;
import org.springframework.util.*;
import org.springframework.boot.context.properties.*;

import java.lang.Class;

import org.springframework.validation.Errors;
import org.springframework.context.ApplicationContext;
import org.springframework.util.ClassUtils;
import org.springframework.validation.*;
import org.springframework.context.*;

import java.lang.ClassLoader;
import java.lang.Object;

import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.validation.MessageInterpolatorFactory;
import org.springframework.validation.Validator;
import org.springframework.util.ClassUtils;

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

class ConfigurationPropertiesJsr303ValidatorValidateEnhancedTest {

	private ConfigurationPropertiesJsr303Validator validator;

	@Mock
	private ApplicationContext applicationContext;

	@Mock
	private Errors errors;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
		validator = new ConfigurationPropertiesJsr303Validator(applicationContext);
	}

	@Test
	@Disabled
	void testValidate() {
		Object target = new Object();
		validator.validate(target, errors);
		verify(errors, times(1)).getAllErrors();
	}
}
