package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.io.ByteArrayInputStream;
import org.springframework.core.log.LogMessage;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.util.Assert;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.io.InputStream;
import org.springframework.core.env.PropertyResolver;
import org.springframework.core.env.ConfigurableEnvironment;
import org.mockito.stubbing.Answer;
import org.springframework.core.env.Environment;
import org.springframework.util.StreamUtils;
import java.io.OutputStream;
import java.io.PrintStream;
import org.springframework.core.io.Resource;
import org.mockito.MockedStatic;
import java.nio.charset.StandardCharsets;
import java.io.ByteArrayOutputStream;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.doThrow;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ResourceBannerSapientGeneratedTest {

    private final Resource resourceMock = mock(Resource.class, "resource");

    private final ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);

    private final Environment environmentMock = mock(Environment.class);

    private final MutablePropertySources mutablePropertySourcesMock = mock(MutablePropertySources.class);

    private final PropertyResolver propertyResolverMock = mock(PropertyResolver.class);

    //Sapient generated method id: ${printBannerWhenGetPropertyResolversEnvironmentSourceClassIsNotEmpty}, hash: 0E629FEA5D5164BF423C6A23983777E6
    @Disabled()
    @Test()
    void printBannerWhenGetPropertyResolversEnvironmentSourceClassIsNotEmpty() throws Exception {
        /* Branches:
         * (for-each(getPropertyResolvers(environment, sourceClass))) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<StreamUtils> streamUtils = mockStatic(StreamUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Charset charset = (Charset) Charset.defaultCharset();
            Charset charset2 = StandardCharsets.UTF_8;
            doReturn(charset).when(environmentMock).getProperty("spring.banner.charset", Charset.class, charset2);
            doReturn(false).when(resourceMock).exists();
            _assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.isTrue(false, "Resource must exist")).thenAnswer((Answer<Void>) invocation -> null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            streamUtils.when(() -> StreamUtils.copyToString(eq(inputStream), (Charset) any())).thenReturn("return_of_copyToString1");
            ResourceBanner target = spy(new ResourceBanner(resourceMock));
            doReturn(null).when(resourceMock).getInputStream();
            List<PropertyResolver> propertyResolverList = new ArrayList<>();
            propertyResolverList.add(propertyResolverMock);
            doReturn(propertyResolverList).when(target).getPropertyResolvers(environmentMock, Object.class);
            doReturn("return_of_resolvePlaceholders1").when(propertyResolverMock).resolvePlaceholders("return_of_copyToString1");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(byteArrayOutputStream2);
            //Act Statement(s)
            target.printBanner(environmentMock, Object.class, printStream);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(environmentMock).getProperty("spring.banner.charset", Charset.class, charset2);
                verify(resourceMock).exists();
                _assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
                _assert.verify(() -> Assert.isTrue(false, "Resource must exist"), atLeast(1));
                streamUtils.verify(() -> StreamUtils.copyToString(eq(inputStream), (Charset) any()));
                verify(resourceMock).getInputStream();
                verify(target).getPropertyResolvers(environmentMock, Object.class);
                verify(propertyResolverMock).resolvePlaceholders("return_of_copyToString1");
            });
        }
    }

    //Sapient generated method id: ${printBannerWhenCaughtException}, hash: A8026E01F85089A8C790B7FDFB6E9476
    @Disabled()
    @Test()
    void printBannerWhenCaughtException() throws Exception {
        /* Branches:
         * (for-each(getPropertyResolvers(environment, sourceClass))) : true
         * (catch-exception (Exception)) : true
         */
        //Arrange Statement(s)
        LogMessage logMessageMock = mock(LogMessage.class);
        try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
            MockedStatic<StreamUtils> streamUtils = mockStatic(StreamUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Charset charset = (Charset) Charset.defaultCharset();
            Charset charset2 = StandardCharsets.UTF_8;
            doReturn(charset).when(environmentMock).getProperty("spring.banner.charset", Charset.class, charset2);
            doReturn(false).when(resourceMock).exists();
            _assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.isTrue(false, "Resource must exist")).thenAnswer((Answer<Void>) invocation -> null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            streamUtils.when(() -> StreamUtils.copyToString(eq(inputStream), (Charset) any())).thenReturn("return_of_copyToString1");
            logMessage.when(() -> LogMessage.format("Banner not printable: %s (%s: '%s')", resourceMock, RuntimeException.class, "message1")).thenReturn(logMessageMock);
            ResourceBanner target = spy(new ResourceBanner(resourceMock));
            doReturn(null).when(resourceMock).getInputStream();
            List<PropertyResolver> propertyResolverList = new ArrayList<>();
            propertyResolverList.add(propertyResolverMock);
            doReturn(propertyResolverList).when(target).getPropertyResolvers(environmentMock, Object.class);
            RuntimeException runtimeException = new RuntimeException("message1");
            doThrow(runtimeException).when(propertyResolverMock).resolvePlaceholders("return_of_copyToString1");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(byteArrayOutputStream2);
            //Act Statement(s)
            target.printBanner(environmentMock, Object.class, printStream);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(environmentMock).getProperty("spring.banner.charset", Charset.class, charset2);
                verify(resourceMock).exists();
                _assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
                _assert.verify(() -> Assert.isTrue(false, "Resource must exist"), atLeast(1));
                streamUtils.verify(() -> StreamUtils.copyToString(eq(inputStream), (Charset) any()));
                logMessage.verify(() -> LogMessage.format("Banner not printable: %s (%s: '%s')", resourceMock, RuntimeException.class, "message1"), atLeast(1));
                verify(resourceMock).getInputStream();
                verify(target).getPropertyResolvers(environmentMock, Object.class);
                verify(propertyResolverMock).resolvePlaceholders("return_of_copyToString1");
            });
        }
    }

    //Sapient generated method id: ${getPropertyResolversWhenNotFormat}, hash: 3611F9049EFD2C80076A30BD7503BF93
    @Test()
    void getPropertyResolversWhenNotFormat() {
        /* Branches:
         * (environment instanceof ConfigurableEnvironment) : true
         * (applicationTitle != null) : true  #  inside getTitleSource method
         * (version == null) : true  #  inside getVersionString method
         * (format) : false  #  inside getVersionString method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: sources - Method: addLast
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(mutablePropertySourcesMock).when(configurableEnvironmentMock).getPropertySources();
            doNothing().when(mutablePropertySourcesMock).forEach((Consumer) any());
            doReturn(false).when(resourceMock).exists();
            _assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.isTrue(false, "Resource must exist")).thenAnswer((Answer<Void>) invocation -> null);
            ResourceBanner target = spy(new ResourceBanner(resourceMock));
            doReturn("return_of_getApplicationTitle1").when(target).getApplicationTitle(Object.class);
            doReturn(null).when(target).getApplicationVersion(Object.class);
            //Act Statement(s)
            List<PropertyResolver> result = target.getPropertyResolvers(configurableEnvironmentMock, Object.class);
            //Assert statement(s)
            //TODO: Please implement equals method in PropertySourcesPropertyResolver for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(1));
                verify(configurableEnvironmentMock).getPropertySources();
                verify(mutablePropertySourcesMock).forEach((Consumer) any());
                verify(resourceMock).exists();
                _assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
                _assert.verify(() -> Assert.isTrue(false, "Resource must exist"), atLeast(1));
                verify(target).getApplicationTitle(Object.class);
                verify(target).getApplicationVersion(Object.class);
            });
        }
    }

    //Sapient generated method id: ${getPropertyResolversWhenVersionIsNotNullAndNotFormat}, hash: 5A0903DAFDD78177936BFF737A7F1910
    @Test()
    void getPropertyResolversWhenVersionIsNotNullAndNotFormat() {
        /* Branches:
         * (environment instanceof ConfigurableEnvironment) : true
         * (applicationTitle != null) : true  #  inside getTitleSource method
         * (version == null) : false  #  inside getVersionString method
         * (format) : false  #  inside getVersionString method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: sources - Method: addLast
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(mutablePropertySourcesMock).when(configurableEnvironmentMock).getPropertySources();
            doNothing().when(mutablePropertySourcesMock).forEach((Consumer) any());
            doReturn(false).when(resourceMock).exists();
            _assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.isTrue(false, "Resource must exist")).thenAnswer((Answer<Void>) invocation -> null);
            ResourceBanner target = spy(new ResourceBanner(resourceMock));
            doReturn("return_of_getApplicationTitle1").when(target).getApplicationTitle(Object.class);
            doReturn("A").when(target).getApplicationVersion(Object.class);
            //Act Statement(s)
            List<PropertyResolver> result = target.getPropertyResolvers(configurableEnvironmentMock, Object.class);
            //Assert statement(s)
            //TODO: Please implement equals method in PropertySourcesPropertyResolver for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(1));
                verify(configurableEnvironmentMock).getPropertySources();
                verify(mutablePropertySourcesMock).forEach((Consumer) any());
                verify(resourceMock).exists();
                _assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
                _assert.verify(() -> Assert.isTrue(false, "Resource must exist"), atLeast(1));
                verify(target).getApplicationTitle(Object.class);
                verify(target).getApplicationVersion(Object.class);
            });
        }
    }

    //Sapient generated method id: ${getPropertyResolversWhenApplicationTitleIsNullAndVersionIsNotNullAndNotFormat}, hash: 1603F18FEB53FBBC4F54FA8D40394881
    @Test()
    void getPropertyResolversWhenApplicationTitleIsNullAndVersionIsNotNullAndNotFormat() {
        /* Branches:
         * (environment instanceof ConfigurableEnvironment) : true
         * (applicationTitle != null) : false  #  inside getTitleSource method
         * (version == null) : false  #  inside getVersionString method
         * (format) : false  #  inside getVersionString method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: sources - Method: addLast
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(mutablePropertySourcesMock).when(configurableEnvironmentMock).getPropertySources();
            doNothing().when(mutablePropertySourcesMock).forEach((Consumer) any());
            doReturn(false).when(resourceMock).exists();
            _assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.isTrue(false, "Resource must exist")).thenAnswer((Answer<Void>) invocation -> null);
            ResourceBanner target = spy(new ResourceBanner(resourceMock));
            doReturn(null).when(target).getApplicationTitle(Object.class);
            doReturn("A").when(target).getApplicationVersion(Object.class);
            //Act Statement(s)
            List<PropertyResolver> result = target.getPropertyResolvers(configurableEnvironmentMock, Object.class);
            //Assert statement(s)
            //TODO: Please implement equals method in PropertySourcesPropertyResolver for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(1));
                verify(configurableEnvironmentMock).getPropertySources();
                verify(mutablePropertySourcesMock).forEach((Consumer) any());
                verify(resourceMock).exists();
                _assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
                _assert.verify(() -> Assert.isTrue(false, "Resource must exist"), atLeast(1));
                verify(target).getApplicationTitle(Object.class);
                verify(target).getApplicationVersion(Object.class);
            });
        }
    }

    //Sapient generated method id: ${getApplicationTitleWhenSourcePackageIsNotNull}, hash: 3A7F9045FB7FD15EEAF1DB4C3556F340
    @Test()
    void getApplicationTitleWhenSourcePackageIsNotNull() {
        /* Branches:
         * (sourceClass != null) : true
         * (sourcePackage != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(false).when(resourceMock).exists();
            _assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.isTrue(false, "Resource must exist")).thenAnswer((Answer<Void>) invocation -> null);
            ResourceBanner target = new ResourceBanner(resourceMock);
            //Act Statement(s)
            String result = target.getApplicationTitle(Object.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                verify(resourceMock).exists();
                _assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
                _assert.verify(() -> Assert.isTrue(false, "Resource must exist"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getApplicationTitleWhenSourceClassIsNullAndSourcePackageIsNull}, hash: 90B3D4DE67CD58E797668AF2EE97F340
    @Test()
    void getApplicationTitleWhenSourceClassIsNullAndSourcePackageIsNull() {
        /* Branches:
         * (sourceClass != null) : false
         * (sourcePackage != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(false).when(resourceMock).exists();
            _assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.isTrue(false, "Resource must exist")).thenAnswer((Answer<Void>) invocation -> null);
            ResourceBanner target = new ResourceBanner(resourceMock);
            Class<?> _class = null;
            //Act Statement(s)
            String result = target.getApplicationTitle(_class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                verify(resourceMock).exists();
                _assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
                _assert.verify(() -> Assert.isTrue(false, "Resource must exist"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getApplicationVersionWhenSourcePackageIsNotNull}, hash: 3B0DD0464D7D5168D81099DC9D140E29
    @Test()
    void getApplicationVersionWhenSourcePackageIsNotNull() {
        /* Branches:
         * (sourceClass != null) : true
         * (sourcePackage != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(false).when(resourceMock).exists();
            _assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.isTrue(false, "Resource must exist")).thenAnswer((Answer<Void>) invocation -> null);
            ResourceBanner target = new ResourceBanner(resourceMock);
            //Act Statement(s)
            String result = target.getApplicationVersion(Object.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                verify(resourceMock).exists();
                _assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
                _assert.verify(() -> Assert.isTrue(false, "Resource must exist"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getApplicationVersionWhenSourceClassIsNullAndSourcePackageIsNull}, hash: CD7BCD978A4786BBC0A7404AC0A54592
    @Test()
    void getApplicationVersionWhenSourceClassIsNullAndSourcePackageIsNull() {
        /* Branches:
         * (sourceClass != null) : false
         * (sourcePackage != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(false).when(resourceMock).exists();
            _assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.isTrue(false, "Resource must exist")).thenAnswer((Answer<Void>) invocation -> null);
            ResourceBanner target = new ResourceBanner(resourceMock);
            Class<?> _class = null;
            //Act Statement(s)
            String result = target.getApplicationVersion(_class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                verify(resourceMock).exists();
                _assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
                _assert.verify(() -> Assert.isTrue(false, "Resource must exist"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getBootVersionTest}, hash: F844FEF089A40F912E97ECEE907AC512
    @Test()
    void getBootVersionTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(false).when(resourceMock).exists();
            _assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.isTrue(false, "Resource must exist")).thenAnswer((Answer<Void>) invocation -> null);
            ResourceBanner target = new ResourceBanner(resourceMock);
            //Act Statement(s)
            String result = target.getBootVersion();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("3.3.0-SNAPSHOT"));
                verify(resourceMock).exists();
                _assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
                _assert.verify(() -> Assert.isTrue(false, "Resource must exist"), atLeast(1));
            });
        }
    }
}
