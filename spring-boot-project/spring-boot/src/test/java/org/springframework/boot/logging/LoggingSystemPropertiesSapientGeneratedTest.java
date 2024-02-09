package org.springframework.boot.logging;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.env.ConfigurableEnvironment;

import org.mockito.stubbing.Answer;

import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;
import org.springframework.core.env.MutablePropertySources;

import java.util.function.BiConsumer;

import org.springframework.util.Assert;

import java.util.function.Function;

import org.springframework.core.env.PropertySourcesPropertyResolver;

import org.mockito.MockedStatic;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.core.env.PropertyResolver;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LoggingSystemPropertiesSapientGeneratedTest {

	private final Environment environmentMock = mock(Environment.class);

	private final LogFile logFileMock = mock(LogFile.class);

	private final PropertyResolver resolverMock = mock(PropertyResolver.class);

	//Sapient generated method id: ${52c5a6a5-b6e9-3e13-86f6-b884cf97a50a}
	@Test()
	void getDefaultCharsetTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			LoggingSystemProperties target = new LoggingSystemProperties(environmentMock, (Function) null, (BiConsumer) null);
			//Act Statement(s)
			Charset result = target.getDefaultCharset();
			Charset charset = StandardCharsets.UTF_8;
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(charset));
				_assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3d33b7c8-65b1-3105-b11e-1378b185b2be}
	@Test()
	void applyTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			LoggingSystemProperties target = spy(new LoggingSystemProperties(environmentMock, (Function) null, (BiConsumer) null));
			doNothing().when(target).apply((LogFile) null);
			//Act Statement(s)
			target.apply();
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
				verify(target).apply((LogFile) null);
			});
		}
	}

	//Sapient generated method id: ${7c60e458-d27e-3584-87cc-74bf61a25c34}
	@Test()
	void apply1WhenThisEnvironmentInstanceOfConfigurableEnvironment() {
		/* Branches:
		 * (this.environment instanceof ConfigurableEnvironment configurableEnvironment) : true  #  inside getPropertyResolver method
		 */
		//Arrange Statement(s)
		ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
		MutablePropertySources mutablePropertySourcesMock = mock(MutablePropertySources.class);
		ConfigurableConversionService configurableConversionServiceMock = mock(ConfigurableConversionService.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(mutablePropertySourcesMock).when(configurableEnvironmentMock).getPropertySources();
			doReturn(configurableConversionServiceMock).when(configurableEnvironmentMock).getConversionService();
			_assert.when(() -> Assert.notNull(configurableEnvironmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			LoggingSystemProperties target = spy(new LoggingSystemProperties(configurableEnvironmentMock, (Function) null, (BiConsumer) null));
			doNothing().when(target).apply(eq(logFileMock), (PropertySourcesPropertyResolver) any());
			//Act Statement(s)
			target.apply(logFileMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(configurableEnvironmentMock).getPropertySources();
				verify(configurableEnvironmentMock).getConversionService();
				_assert.verify(() -> Assert.notNull(configurableEnvironmentMock, "Environment must not be null"), atLeast(1));
				verify(target).apply(eq(logFileMock), (PropertySourcesPropertyResolver) any());
			});
		}
	}

	//Sapient generated method id: ${ceb4ba93-e7d7-3376-b130-d162cfb698ff}
	@Test()
	void apply1WhenThisEnvironmentNotInstanceOfConfigurableEnvironment() {
		/* Branches:
		 * (this.environment instanceof ConfigurableEnvironment configurableEnvironment) : false  #  inside getPropertyResolver method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			LoggingSystemProperties target = spy(new LoggingSystemProperties(environmentMock, (Function) null, (BiConsumer) null));
			doNothing().when(target).apply(logFileMock, environmentMock);
			//Act Statement(s)
			target.apply(logFileMock);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
				verify(target).apply(logFileMock, environmentMock);
			});
		}
	}

	//Sapient generated method id: ${926d7a8b-7d4c-3546-a4a0-9d6c657f6fd0}
	@Disabled()
	@Test()
	void apply2WhenLogFileIsNotNull() {
		/* Branches:
		 * (resolver.getProperty("logging.include-application-name", Boolean.class, Boolean.TRUE)) : true  #  inside setApplicationNameSystemProperty method
		 * (StringUtils.hasText(applicationName)) : true  #  inside setApplicationNameSystemProperty method
		 * (property.getApplicationPropertyName() != null) : true  #  inside setSystemProperty method
		 * (value != null) : true  #  inside setSystemProperty method
		 * (value != null) : false  #  inside setSystemProperty method
		 * (logFile != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doNothing().when(logFileMock).applyToSystemProperties();
			doReturn(true).when(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
			doReturn("A").when(resolverMock).getProperty("spring.application.name");
			doReturn("return_of_getProperty1").when(resolverMock).getProperty("arg0");
			_assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			LoggingSystemProperties target = new LoggingSystemProperties(environmentMock, (Function) null, (BiConsumer) null);
			//Act Statement(s)
			target.apply(logFileMock, resolverMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(logFileMock).applyToSystemProperties();
				verify(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
				verify(resolverMock).getProperty("spring.application.name");
				verify(resolverMock, times(10)).getProperty("arg0");
				_assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${d8b6b9f7-2d0c-3586-8483-d5c39f4f4fd6}
	@Test()
	void apply2WhenPropertyGetApplicationPropertyNameIsNullAndValueIsNullAndValueIsNullAndLogFileIsNull() {
		/* Branches:
		 * (resolver.getProperty("logging.include-application-name", Boolean.class, Boolean.TRUE)) : true  #  inside setApplicationNameSystemProperty method
		 * (StringUtils.hasText(applicationName)) : true  #  inside setApplicationNameSystemProperty method
		 * (property.getApplicationPropertyName() != null) : false  #  inside setSystemProperty method
		 * (value != null) : false  #  inside setSystemProperty method
		 * (value != null) : false  #  inside setSystemProperty method
		 * (logFile != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(true).when(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
			doReturn("A").when(resolverMock).getProperty("spring.application.name");
			_assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			LoggingSystemProperties target = new LoggingSystemProperties(environmentMock, (Function) null, (BiConsumer) null);
			LogFile logFile = null;
			//Act Statement(s)
			target.apply(logFile, resolverMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
				verify(resolverMock).getProperty("spring.application.name");
				_assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${991de54a-ab0a-3206-9b6f-468ab7273ba1}
	@Test()
	void setSystemProperty3Test() {
		//Arrange Statement(s)
		PropertyResolver propertyResolverMock = mock(PropertyResolver.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			LoggingSystemProperties target = spy(new LoggingSystemProperties(environmentMock, (Function) null, (BiConsumer) null));
			doNothing().when(target).setSystemProperty(propertyResolverMock, "systemPropertyName1", "propertyName1", (String) null);
			//Act Statement(s)
			target.setSystemProperty(propertyResolverMock, "systemPropertyName1", "propertyName1");
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
				verify(target).setSystemProperty(propertyResolverMock, "systemPropertyName1", "propertyName1", (String) null);
			});
		}
	}

	//Sapient generated method id: ${762de8fd-c6de-3880-b4c4-2107fc7888f3}
	@Test()
	void setSystemProperty4WhenValueIsNotNull() {
		/* Branches:
		 * (value != null) : true
		 * (value != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		PropertyResolver resolverMock = mock(PropertyResolver.class, "<value>");
		doReturn("String").when(resolverMock).getProperty("<value>");
		Environment environmentMock = mock(Environment.class, "<value>");
		LoggingSystemProperties target = new LoggingSystemProperties(environmentMock, (Function) null, (BiConsumer) null);
		//Act Statement(s)
		target.setSystemProperty(resolverMock, "<value>", "<value>", "<value>");
		//Assert statement(s)
		assertAll("result", () -> verify(resolverMock).getProperty("<value>"));
	}

	//Sapient generated method id: ${d6e96e3b-cb8c-3378-86ce-fec4c7fa0211}
	@Test()
	void setSystemProperty4WhenValueIsNull() {
		/* Branches:
		 * (value != null) : false
		 * (value != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(null).when(resolverMock).getProperty("propertyName1");
			_assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			LoggingSystemProperties target = new LoggingSystemProperties(environmentMock, (Function) null, (BiConsumer) null);
			//Act Statement(s)
			target.setSystemProperty(resolverMock, "systemPropertyName1", "propertyName1", "defaultValue1");
			//Assert statement(s)
			assertAll("result", () -> {
				verify(resolverMock).getProperty("propertyName1");
				_assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${5518f6a9-6700-3de3-bdd8-17ff5a09c416}
	@Test()
	void setSystemProperty5Test() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Environment environmentMock = mock(Environment.class, "environment");
		LoggingSystemProperties target = new LoggingSystemProperties(environmentMock, (Function) null, (BiConsumer) null);
		//Act Statement(s)
		target.setSystemProperty("name", "value");
	}
}
