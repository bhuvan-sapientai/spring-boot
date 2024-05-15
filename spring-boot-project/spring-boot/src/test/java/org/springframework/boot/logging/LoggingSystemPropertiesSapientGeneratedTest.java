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

    private final BiConsumer biConsumerMock = mock(BiConsumer.class);

    private final Environment environmentMock = mock(Environment.class);

    private final Function functionMock = mock(Function.class);

    private final LogFile logFileMock = mock(LogFile.class);

    private final PropertyResolver resolverMock = mock(PropertyResolver.class);

    //Sapient generated method id: ${getDefaultCharsetTest}, hash: EB5A46FB8C15A0E04BB196F3B11D41CC
    @Test()
    void getDefaultCharsetTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            LoggingSystemProperties target = new LoggingSystemProperties(environmentMock, functionMock, biConsumerMock);
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

    //Sapient generated method id: ${applyTest}, hash: 5E51243A70E7C1F10E5F6BCDAB75DFE4
    @Test()
    void applyTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            LoggingSystemProperties target = spy(new LoggingSystemProperties(environmentMock, functionMock, biConsumerMock));
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

    //Sapient generated method id: ${apply1WhenThisEnvironmentInstanceOfConfigurableEnvironment}, hash: E8F8D3993FCB65DFCD620F09576D99D3
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
            LoggingSystemProperties target = spy(new LoggingSystemProperties(configurableEnvironmentMock, functionMock, biConsumerMock));
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

    //Sapient generated method id: ${apply1WhenThisEnvironmentNotInstanceOfConfigurableEnvironment}, hash: 7FD4CA406A08D79D54E91EA9B5EF7C8B
    @Test()
    void apply1WhenThisEnvironmentNotInstanceOfConfigurableEnvironment() {
        /* Branches:
         * (this.environment instanceof ConfigurableEnvironment configurableEnvironment) : false  #  inside getPropertyResolver method
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            LoggingSystemProperties target = spy(new LoggingSystemProperties(environmentMock, functionMock, biConsumerMock));
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

    //Sapient generated method id: ${apply2WhenLogFileIsNotNull}, hash: 5FB367EABF56C0251E992FC1EC616DF2
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
            doReturn("return_of_getProperty1").when(resolverMock).getProperty("key1");
            _assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            LoggingSystemProperties target = new LoggingSystemProperties(environmentMock, functionMock, biConsumerMock);
            //Act Statement(s)
            target.apply(logFileMock, resolverMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(logFileMock).applyToSystemProperties();
                verify(resolverMock).getProperty("logging.include-application-name", Boolean.class, true);
                verify(resolverMock).getProperty("spring.application.name");
                verify(resolverMock, times(10)).getProperty("key1");
                _assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${apply2WhenPropertyGetApplicationPropertyNameIsNullAndValueIsNullAndValueIsNullAndLogFileIsNull}, hash: 8620B8D75C2FDA5D7CF91390C62183E4
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
            LoggingSystemProperties target = new LoggingSystemProperties(environmentMock, functionMock, biConsumerMock);
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

    //Sapient generated method id: ${setSystemProperty3Test}, hash: 011CC5921E7B39A0B024F1A67E6D4883
    @Test()
    void setSystemProperty3Test() {
        //Arrange Statement(s)
        PropertyResolver propertyResolverMock = mock(PropertyResolver.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            LoggingSystemProperties target = spy(new LoggingSystemProperties(environmentMock, functionMock, biConsumerMock));
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

    //Sapient generated method id: ${setSystemProperty4WhenValueIsNotNull}, hash: 9B2409F6EB8D57B493A15148A7C67E53
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
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn("return_of_getProperty1").when(resolverMock).getProperty("propertyName1");
            _assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            LoggingSystemProperties target = new LoggingSystemProperties(environmentMock, functionMock, biConsumerMock);
            //Act Statement(s)
            target.setSystemProperty(resolverMock, "systemPropertyName1", "propertyName1", "defaultValue1");
            //Assert statement(s)
            assertAll("result", () -> {
                verify(resolverMock).getProperty("propertyName1");
                _assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${setSystemProperty4WhenValueIsNull}, hash: 3801D77A8DDE2661929E3DA351F960AC
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
            LoggingSystemProperties target = new LoggingSystemProperties(environmentMock, functionMock, biConsumerMock);
            //Act Statement(s)
            target.setSystemProperty(resolverMock, "systemPropertyName1", "propertyName1", "defaultValue1");
            //Assert statement(s)
            assertAll("result", () -> {
                verify(resolverMock).getProperty("propertyName1");
                _assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${setSystemProperty5Test}, hash: 2D82D1F07F44CC8ED416CC20CF9F1307
    @Test()
    void setSystemProperty5Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            LoggingSystemProperties target = new LoggingSystemProperties(environmentMock, functionMock, biConsumerMock);
            //Act Statement(s)
            target.setSystemProperty("name1", "value1");
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1)));
        }
    }
}
