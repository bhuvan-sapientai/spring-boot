package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.log.LogMessage;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.util.StringUtils;
import org.springframework.util.Assert;
import org.springframework.boot.logging.DeferredLogFactory;
import java.util.ArrayList;
import org.mockito.stubbing.Answer;
import org.apache.commons.logging.impl.NoOpLog;
import java.util.Iterator;
import java.util.function.Supplier;
import org.springframework.core.io.Resource;
import org.springframework.boot.env.PropertySourceLoader;
import org.mockito.MockedStatic;
import org.springframework.util.ObjectUtils;
import org.springframework.core.io.support.SpringFactoriesLoader;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class StandardConfigDataLocationResolverSapientGeneratedTest {

    private final BindResult bindResultMock = mock(BindResult.class);

    private final Binder binderMock = mock(Binder.class);

    private final ConfigDataLocation configDataLocationMock = mock(ConfigDataLocation.class);

    private final ConfigDataLocationResolverContext configDataLocationResolverContextMock = mock(ConfigDataLocationResolverContext.class);

    private final ConfigDataResource configDataResourceMock = mock(ConfigDataResource.class);

    private final ConfigDataLocationResolverContext contextMock = mock(ConfigDataLocationResolverContext.class);

    private final ConfigDataLocation locationMock = mock(ConfigDataLocation.class);

    private final DeferredLogFactory logFactoryMock = mock(DeferredLogFactory.class);

    private final LogMessage logMessageMock = mock(LogMessage.class);

    private final Profiles profilesMock = mock(Profiles.class);

    private final PropertySourceLoader propertySourceLoaderMock = mock(PropertySourceLoader.class);

    private final ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);

    private final StandardConfigDataReference standardConfigDataReferenceMock = mock(StandardConfigDataReference.class);

    private final StandardConfigDataResource standardConfigDataResourceMock = mock(StandardConfigDataResource.class);

    //Sapient generated method id: ${isResolvableTest}, hash: DFDFDE0BEEF44D9256073287CFBE5031
    @Test()
    void isResolvableTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
            String[] stringArray = new String[] { "A" };
            String[] stringArray2 = new String[] { "application" };
            doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
            List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
            //Act Statement(s)
            boolean result = target.isResolvable(configDataLocationResolverContextMock, configDataLocationMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
                verify(binderMock).bind("spring.config.name", String[].class);
                verify(bindResultMock).orElse(stringArray2);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
            });
        }
    }

    //Sapient generated method id: ${resolveWhenIsDirectoryResourceLocationAndThisConfigNamesIsEmptyAndCaughtRuntimeExceptionThrowsIllegalStateException}, hash: 5618054A5FB1AA8969CDB6234955EE87
    @Disabled()
    @Test()
    void resolveWhenIsDirectoryResourceLocationAndThisConfigNamesIsEmptyAndCaughtRuntimeExceptionThrowsIllegalStateException() throws ConfigDataNotFoundException {
        /* Branches:
         * (for-each(configDataLocations)) : true  #  inside getReferences method
         * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
         * (URL_PREFIX.matcher(resourceLocation).matches()) : false  #  inside getResourceLocation method
         * (isAbsolute) : false  #  inside getResourceLocation method
         * (parent instanceof StandardConfigDataResource resource) : true  #  inside getResourceLocation method
         * (resourceLocation.endsWith("/")) : true  #  inside isDirectory method
         * (isDirectory(resourceLocation)) : true  #  inside getReferences method
         * (for-each(this.configNames)) : false  #  inside getReferencesForDirectory method
         * (catch-exception (RuntimeException)) : true  #  inside getReferences method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
            doReturn(standardConfigDataResourceMock).when(contextMock).getParent();
            doReturn(standardConfigDataReferenceMock).when(standardConfigDataResourceMock).getReference();
            doReturn("return_of_getResourceLocation1").when(standardConfigDataReferenceMock).getResourceLocation();
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(locationMock).split();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
            String[] stringArray = new String[] {};
            String[] stringArray2 = new String[] { "application" };
            doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
            List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.resolve(contextMock, locationMock);
            });
            RuntimeException runtimeException = new RuntimeException();
            IllegalStateException illegalStateException = new IllegalStateException("message1", runtimeException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(runtimeException.getClass())));
                verify(contextMock).getParent();
                verify(standardConfigDataResourceMock).getReference();
                verify(standardConfigDataReferenceMock).getResourceLocation();
                verify(locationMock).split();
                verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
                verify(binderMock).bind("spring.config.name", String[].class);
                verify(bindResultMock).orElse(stringArray2);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
            });
        }
    }

    //Sapient generated method id: ${resolveWhenResourceLocationEndsWith_AndIsDirectoryResourceLocationAndThisConfigNamesIsEmptyAThrowsIllegalStateException}, hash: 020D19BEC7F195135C3BAAE7F00B0028
    @Disabled()
    @Test()
    void resolveWhenResourceLocationEndsWith_AndIsDirectoryResourceLocationAndThisConfigNamesIsEmptyAThrowsIllegalStateException() throws ConfigDataNotFoundException {
        /* Branches:
         * (for-each(configDataLocations)) : true  #  inside getReferences method
         * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
         * (URL_PREFIX.matcher(resourceLocation).matches()) : false  #  inside getResourceLocation method
         * (isAbsolute) : false  #  inside getResourceLocation method
         * (parent instanceof StandardConfigDataResource resource) : false  #  inside getResourceLocation method
         * (resourceLocation.endsWith("/")) : true  #  inside isDirectory method
         * (isDirectory(resourceLocation)) : true  #  inside getReferences method
         * (for-each(this.configNames)) : false  #  inside getReferencesForDirectory method
         * (catch-exception (RuntimeException)) : true  #  inside getReferences method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
            doReturn(configDataResourceMock).when(contextMock).getParent();
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(locationMock).split();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
            String[] stringArray = new String[] {};
            String[] stringArray2 = new String[] { "application" };
            doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
            List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.resolve(contextMock, locationMock);
            });
            RuntimeException runtimeException = new RuntimeException();
            IllegalStateException illegalStateException = new IllegalStateException("message1", runtimeException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(runtimeException.getClass())));
                verify(contextMock).getParent();
                verify(locationMock).split();
                verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
                verify(binderMock).bind("spring.config.name", String[].class);
                verify(bindResultMock).orElse(stringArray2);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
            });
        }
    }

    //Sapient generated method id: ${resolveWhenThisPropertySourceLoadersIsEmptyAndCaughtRuntimeExceptionThrowsIllegalStateException}, hash: 9E41940893FB096E06BF9EC28DD49900
    @Disabled()
    @Test()
    void resolveWhenThisPropertySourceLoadersIsEmptyAndCaughtRuntimeExceptionThrowsIllegalStateException() throws ConfigDataNotFoundException {
        /* Branches:
         * (for-each(configDataLocations)) : true  #  inside getReferences method
         * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
         * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
         * (isAbsolute) : true  #  inside getResourceLocation method
         * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
         * (resourceLocation.endsWith(File.separator)) : true  #  inside isDirectory method
         * (isDirectory(resourceLocation)) : true  #  inside getReferences method
         * (for-each(this.configNames)) : true  #  inside getReferencesForDirectory method
         * (for-each(this.propertySourceLoaders)) : false  #  inside getReferencesForConfigName method
         * (catch-exception (RuntimeException)) : true  #  inside getReferences method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(locationMock).split();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
            String[] stringArray = new String[] {};
            String[] stringArray2 = new String[] { "application" };
            doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
            List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.resolve(configDataLocationResolverContextMock, locationMock);
            });
            RuntimeException runtimeException = new RuntimeException();
            IllegalStateException illegalStateException = new IllegalStateException("message1", runtimeException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(runtimeException.getClass())));
                verify(locationMock).split();
                verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
                verify(binderMock).bind("spring.config.name", String[].class);
                verify(bindResultMock).orElse(stringArray2);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
            });
        }
    }

    //Sapient generated method id: ${resolveWhenReferencesIsEmptyAndResolvedIsEmptyAndReferencesIsEmpty}, hash: 4968EBF0527BB90FA650916911BBD92B
    @Disabled()
    @Test()
    void resolveWhenReferencesIsEmptyAndResolvedIsEmptyAndReferencesIsEmpty() throws ConfigDataNotFoundException {
        /* Branches:
         * (for-each(configDataLocations)) : true  #  inside getReferences method
         * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
         * (URL_PREFIX.matcher(resourceLocation).matches()) : false  #  inside getResourceLocation method
         * (isAbsolute) : false  #  inside getResourceLocation method
         * (parent instanceof StandardConfigDataResource resource) : true  #  inside getResourceLocation method
         * (resourceLocation.endsWith("/")) : true  #  inside isDirectory method
         * (isDirectory(resourceLocation)) : true  #  inside getReferences method
         * (for-each(this.configNames)) : false  #  inside getReferencesForDirectory method
         * (for-each(references)) : false  #  inside resolve method
         * (resolved.isEmpty()) : true  #  inside resolve method
         * (for-each(references)) : false  #  inside resolveEmptyDirectories method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
            doReturn(standardConfigDataResourceMock).when(contextMock).getParent();
            doReturn(standardConfigDataReferenceMock).when(standardConfigDataResourceMock).getReference();
            doReturn("return_of_getResourceLocation1").when(standardConfigDataReferenceMock).getResourceLocation();
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(locationMock).split();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
            String[] stringArray = new String[] {};
            String[] stringArray2 = new String[] { "application" };
            doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
            List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
            //Act Statement(s)
            List<StandardConfigDataResource> result = target.resolve(contextMock, locationMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                verify(contextMock).getParent();
                verify(standardConfigDataResourceMock).getReference();
                verify(standardConfigDataReferenceMock).getResourceLocation();
                verify(locationMock).split();
                verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
                verify(binderMock).bind("spring.config.name", String[].class);
                verify(bindResultMock).orElse(stringArray2);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
            });
        }
    }

    //Sapient generated method id: ${resolveWhenThisConfigNamesIsEmptyAndReferencesIsEmptyAndResolvedIsEmptyAndReferencesIsEmpty}, hash: B3889BDC7B6731AD140B10DA6E01E2E2
    @Disabled()
    @Test()
    void resolveWhenThisConfigNamesIsEmptyAndReferencesIsEmptyAndResolvedIsEmptyAndReferencesIsEmpty() throws ConfigDataNotFoundException {
        /* Branches:
         * (for-each(configDataLocations)) : true  #  inside getReferences method
         * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
         * (URL_PREFIX.matcher(resourceLocation).matches()) : false  #  inside getResourceLocation method
         * (isAbsolute) : false  #  inside getResourceLocation method
         * (parent instanceof StandardConfigDataResource resource) : false  #  inside getResourceLocation method
         * (resourceLocation.endsWith("/")) : true  #  inside isDirectory method
         * (isDirectory(resourceLocation)) : true  #  inside getReferences method
         * (for-each(this.configNames)) : false  #  inside getReferencesForDirectory method
         * (for-each(references)) : false  #  inside resolve method
         * (resolved.isEmpty()) : true  #  inside resolve method
         * (for-each(references)) : false  #  inside resolveEmptyDirectories method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
            doReturn(configDataResourceMock).when(contextMock).getParent();
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(locationMock).split();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
            String[] stringArray = new String[] {};
            String[] stringArray2 = new String[] { "application" };
            doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
            List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
            //Act Statement(s)
            List<StandardConfigDataResource> result = target.resolve(contextMock, locationMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                verify(contextMock).getParent();
                verify(locationMock).split();
                verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
                verify(binderMock).bind("spring.config.name", String[].class);
                verify(bindResultMock).orElse(stringArray2);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
            });
        }
    }

    //Sapient generated method id: ${resolveWhenStringUtilsNotEndsWithIgnoreCaseFileFileExtensionAndExtensionIsNullAndConfigDataLThrowsIllegalStateException}, hash: 673D258A1EE27EB1D9847BF6238EFE8C
    @Disabled()
    @Test()
    void resolveWhenStringUtilsNotEndsWithIgnoreCaseFileFileExtensionAndExtensionIsNullAndConfigDataLThrowsIllegalStateException() throws ConfigDataNotFoundException {
        /* Branches:
         * (for-each(configDataLocations)) : true  #  inside getReferences method
         * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
         * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
         * (isAbsolute) : true  #  inside getResourceLocation method
         * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
         * (resourceLocation.endsWith(File.separator)) : false  #  inside isDirectory method
         * (isDirectory(resourceLocation)) : false  #  inside getReferences method
         * (extensionHintLocation) : true  #  inside getReferencesForFile method
         * (for-each(this.propertySourceLoaders)) : true  #  inside getReferencesForFile method
         * (for-each(loader.getFileExtensions())) : true  #  inside getLoadableFileExtension method
         * (StringUtils.endsWithIgnoreCase(file, fileExtension)) : false  #  inside getLoadableFileExtension method
         * (extension != null) : false  #  inside getReferencesForFile method
         * (configDataLocation.isOptional()) : false  #  inside getReferencesForFile method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(locationMock).split();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
            String[] stringArray = new String[] {};
            String[] stringArray2 = new String[] { "application" };
            doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
            List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            stringUtils.when(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1")).thenReturn(false);
            StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.resolve(configDataLocationResolverContextMock, locationMock);
            });
            RuntimeException runtimeException = new RuntimeException();
            IllegalStateException illegalStateException = new IllegalStateException("message1", runtimeException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(runtimeException.getClass())));
                verify(locationMock).split();
                verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
                verify(binderMock).bind("spring.config.name", String[].class);
                verify(bindResultMock).orElse(stringArray2);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
                stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${resolveWhenReferencesNotContainsReferenceAndReferencesIsEmptyAndResolvedIsEmptyAndReferencesIsEmpty}, hash: 21A6C3A9F56DFA50998409B8AA23FC11
    @Disabled()
    @Test()
    void resolveWhenReferencesNotContainsReferenceAndReferencesIsEmptyAndResolvedIsEmptyAndReferencesIsEmpty() throws ConfigDataNotFoundException {
        /* Branches:
         * (for-each(configDataLocations)) : true  #  inside getReferences method
         * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
         * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
         * (isAbsolute) : true  #  inside getResourceLocation method
         * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
         * (resourceLocation.endsWith(File.separator)) : true  #  inside isDirectory method
         * (isDirectory(resourceLocation)) : true  #  inside getReferences method
         * (for-each(this.configNames)) : true  #  inside getReferencesForDirectory method
         * (for-each(this.propertySourceLoaders)) : true  #  inside getReferencesForConfigName method
         * (for-each(propertySourceLoader.getFileExtensions())) : true  #  inside getReferencesForConfigName method
         * (!references.contains(reference)) : true  #  inside getReferencesForConfigName method
         * (for-each(references)) : false  #  inside resolve method
         * (resolved.isEmpty()) : true  #  inside resolve method
         * (for-each(references)) : false  #  inside resolveEmptyDirectories method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(locationMock).split();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
            String[] stringArray = new String[] {};
            String[] stringArray2 = new String[] { "application" };
            doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
            List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
            //Act Statement(s)
            List<StandardConfigDataResource> result = target.resolve(configDataLocationResolverContextMock, locationMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                verify(locationMock).split();
                verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
                verify(binderMock).bind("spring.config.name", String[].class);
                verify(bindResultMock).orElse(stringArray2);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
            });
        }
    }

    //Sapient generated method id: ${resolveWhenStringUtilsEndsWithIgnoreCaseFileFileExtensionAndExtensionIsNullAndConfigDataLocationIsOptionalAndReferences}, hash: A1036AC99DE2DC05724FA60B3B0104C7
    @Disabled()
    @Test()
    void resolveWhenStringUtilsEndsWithIgnoreCaseFileFileExtensionAndExtensionIsNullAndConfigDataLocationIsOptionalAndReferences() throws ConfigDataNotFoundException {
        /* Branches:
         * (for-each(configDataLocations)) : true  #  inside getReferences method
         * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
         * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
         * (isAbsolute) : true  #  inside getResourceLocation method
         * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
         * (resourceLocation.endsWith(File.separator)) : false  #  inside isDirectory method
         * (isDirectory(resourceLocation)) : false  #  inside getReferences method
         * (extensionHintLocation) : true  #  inside getReferencesForFile method
         * (for-each(this.propertySourceLoaders)) : true  #  inside getReferencesForFile method
         * (for-each(loader.getFileExtensions())) : true  #  inside getLoadableFileExtension method
         * (StringUtils.endsWithIgnoreCase(file, fileExtension)) : true  #  inside getLoadableFileExtension method
         * (extension != null) : false  #  inside getReferencesForFile method
         * (configDataLocation.isOptional()) : true  #  inside getReferencesForFile method
         * (for-each(references)) : false  #  inside resolve method
         * (resolved.isEmpty()) : true  #  inside resolve method
         * (for-each(references)) : false  #  inside resolveEmptyDirectories method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(locationMock).split();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
            String[] stringArray = new String[] {};
            String[] stringArray2 = new String[] { "application" };
            doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
            List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            stringUtils.when(() -> StringUtils.endsWithIgnoreCase("str1", (String) null)).thenReturn(false);
            StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
            //Act Statement(s)
            List<StandardConfigDataResource> result = target.resolve(configDataLocationResolverContextMock, locationMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                verify(locationMock).split();
                verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
                verify(binderMock).bind("spring.config.name", String[].class);
                verify(bindResultMock).orElse(stringArray2);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
                stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("str1", (String) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${resolveWhenReferenceNotIsSkippableAndResolvedNotIsEmpty}, hash: 0A0443D142EA41E6C339D7D9628DC427
    @Disabled()
    @Test()
    void resolveWhenReferenceNotIsSkippableAndResolvedNotIsEmpty() throws ConfigDataNotFoundException {
        /* Branches:
         * (for-each(configDataLocations)) : true  #  inside getReferences method
         * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
         * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
         * (isAbsolute) : true  #  inside getResourceLocation method
         * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
         * (resourceLocation.endsWith(File.separator)) : false  #  inside isDirectory method
         * (isDirectory(resourceLocation)) : false  #  inside getReferences method
         * (extensionHintLocation) : true  #  inside getReferencesForFile method
         * (for-each(this.propertySourceLoaders)) : true  #  inside getReferencesForFile method
         * (for-each(loader.getFileExtensions())) : true  #  inside getLoadableFileExtension method
         * (StringUtils.endsWithIgnoreCase(file, fileExtension)) : true  #  inside getLoadableFileExtension method
         * (extension != null) : true  #  inside getReferencesForFile method
         * (!extensionHintLocation) : false  #  inside getReferencesForFile method
         * (for-each(references)) : true  #  inside resolve method
         * (!this.resourceLoader.isPattern(reference.getResourceLocation())) : true  #  inside resolve method
         * (!resource.exists()) : true  #  inside resolveNonPattern method
         * (reference.isSkippable()) : false  #  inside resolveNonPattern method
         * (resolved.isEmpty()) : false  #  inside resolve method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: reference - Method: getResourceLocation
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(locationMock).split();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
            String[] stringArray = new String[] {};
            String[] stringArray2 = new String[] { "application" };
            doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
            List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            stringUtils.when(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1")).thenReturn(false);
            StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
            //Act Statement(s)
            List<StandardConfigDataResource> result = target.resolve(configDataLocationResolverContextMock, locationMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(1));
                assertThat(result.get(0), is(instanceOf(StandardConfigDataResource.class)));
                verify(locationMock).split();
                verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
                verify(binderMock).bind("spring.config.name", String[].class);
                verify(bindResultMock).orElse(stringArray2);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
                stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${resolveWhenResourceNotExistsAndReferenceNotIsSkippableAndResolvedNotIsEmpty}, hash: 3649EB5D4BD3B4F136C956B051AB64AF
    @Disabled()
    @Test()
    void resolveWhenResourceNotExistsAndReferenceNotIsSkippableAndResolvedNotIsEmpty() throws ConfigDataNotFoundException {
        /* Branches:
         * (for-each(configDataLocations)) : true  #  inside getReferences method
         * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
         * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
         * (isAbsolute) : true  #  inside getResourceLocation method
         * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
         * (resourceLocation.endsWith(File.separator)) : false  #  inside isDirectory method
         * (isDirectory(resourceLocation)) : false  #  inside getReferences method
         * (extensionHintLocation) : true  #  inside getReferencesForFile method
         * (for-each(this.propertySourceLoaders)) : true  #  inside getReferencesForFile method
         * (for-each(loader.getFileExtensions())) : true  #  inside getLoadableFileExtension method
         * (StringUtils.endsWithIgnoreCase(file, fileExtension)) : true  #  inside getLoadableFileExtension method
         * (extension != null) : true  #  inside getReferencesForFile method
         * (!extensionHintLocation) : false  #  inside getReferencesForFile method
         * (for-each(references)) : true  #  inside resolve method
         * (!this.resourceLoader.isPattern(reference.getResourceLocation())) : false  #  inside resolve method
         * (for-each(this.resourceLoader.getResources(reference.getResourceLocation(), ResourceType.FILE))) : true  #  inside resolvePattern method
         * (!resource.exists()) : true  #  inside resolvePattern method
         * (reference.isSkippable()) : false  #  inside resolvePattern method
         * (resolved.isEmpty()) : false  #  inside resolve method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: reference - Method: getResourceLocation
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(locationMock).split();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
            String[] stringArray = new String[] {};
            String[] stringArray2 = new String[] { "application" };
            doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
            List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            stringUtils.when(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1")).thenReturn(false);
            StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
            //Act Statement(s)
            List<StandardConfigDataResource> result = target.resolve(configDataLocationResolverContextMock, locationMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(1));
                assertThat(result.get(0), is(instanceOf(StandardConfigDataResource.class)));
                verify(locationMock).split();
                verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
                verify(binderMock).bind("spring.config.name", String[].class);
                verify(bindResultMock).orElse(stringArray2);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
                stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${resolveWhenResolvedIsEmptyAndReferencesIsNotEmptyAndReferenceGetDirectoryIsNull}, hash: EEA24B73167FD76C2391492AB7DA5A76
    @Disabled()
    @Test()
    void resolveWhenResolvedIsEmptyAndReferencesIsNotEmptyAndReferenceGetDirectoryIsNull() throws ConfigDataNotFoundException {
        /* Branches:
         * (for-each(configDataLocations)) : true  #  inside getReferences method
         * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
         * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
         * (isAbsolute) : true  #  inside getResourceLocation method
         * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
         * (resourceLocation.endsWith(File.separator)) : false  #  inside isDirectory method
         * (isDirectory(resourceLocation)) : false  #  inside getReferences method
         * (extensionHintLocation) : true  #  inside getReferencesForFile method
         * (for-each(this.propertySourceLoaders)) : true  #  inside getReferencesForFile method
         * (for-each(loader.getFileExtensions())) : true  #  inside getLoadableFileExtension method
         * (StringUtils.endsWithIgnoreCase(file, fileExtension)) : true  #  inside getLoadableFileExtension method
         * (extension != null) : true  #  inside getReferencesForFile method
         * (!extensionHintLocation) : false  #  inside getReferencesForFile method
         * (for-each(references)) : true  #  inside resolve method
         * (!this.resourceLoader.isPattern(reference.getResourceLocation())) : false  #  inside resolve method
         * (for-each(this.resourceLoader.getResources(reference.getResourceLocation(), ResourceType.FILE))) : true  #  inside resolvePattern method
         * (!resource.exists()) : true  #  inside resolvePattern method
         * (reference.isSkippable()) : true  #  inside resolvePattern method
         * (resolved.isEmpty()) : true  #  inside resolve method
         * (for-each(references)) : true  #  inside resolveEmptyDirectories method
         * (reference.getDirectory() != null) : false  #  inside resolveEmptyDirectories method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: reference - Method: getResourceLocation
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
            MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(locationMock).split();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
            String[] stringArray = new String[] {};
            String[] stringArray2 = new String[] { "application" };
            doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
            List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            stringUtils.when(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1")).thenReturn(false);
            logMessage.when(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any())).thenReturn(logMessageMock);
            StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
            //Act Statement(s)
            List<StandardConfigDataResource> result = target.resolve(configDataLocationResolverContextMock, locationMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                verify(locationMock).split();
                verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
                verify(binderMock).bind("spring.config.name", String[].class);
                verify(bindResultMock).orElse(stringArray2);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
                stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1"), atLeast(1));
                logMessage.verify(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any()));
            });
        }
    }

    //Sapient generated method id: ${resolveWhenResourceNotExists}, hash: D3D92E254BC0F98078AFF34DBA306E96
    @Disabled()
    @Test()
    void resolveWhenResourceNotExists() throws ConfigDataNotFoundException {
        /* Branches:
         * (for-each(configDataLocations)) : true  #  inside getReferences method
         * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
         * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
         * (isAbsolute) : true  #  inside getResourceLocation method
         * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
         * (resourceLocation.endsWith(File.separator)) : false  #  inside isDirectory method
         * (isDirectory(resourceLocation)) : false  #  inside getReferences method
         * (extensionHintLocation) : true  #  inside getReferencesForFile method
         * (for-each(this.propertySourceLoaders)) : true  #  inside getReferencesForFile method
         * (for-each(loader.getFileExtensions())) : true  #  inside getLoadableFileExtension method
         * (StringUtils.endsWithIgnoreCase(file, fileExtension)) : true  #  inside getLoadableFileExtension method
         * (extension != null) : true  #  inside getReferencesForFile method
         * (!extensionHintLocation) : false  #  inside getReferencesForFile method
         * (for-each(references)) : true  #  inside resolve method
         * (!this.resourceLoader.isPattern(reference.getResourceLocation())) : true  #  inside resolve method
         * (!resource.exists()) : true  #  inside resolveNonPattern method
         * (reference.isSkippable()) : true  #  inside resolveNonPattern method
         * (resolved.isEmpty()) : true  #  inside resolve method
         * (for-each(references)) : true  #  inside resolveEmptyDirectories method
         * (reference.getDirectory() != null) : true  #  inside resolveEmptyDirectories method
         * (!this.resourceLoader.isPattern(reference.getResourceLocation())) : true  #  inside resolveEmptyDirectories method
         * (resource instanceof ClassPathResource) : false  #  inside resolveNonPatternEmptyDirectories method
         * (!resource.exists()) : true  #  inside resolveNonPatternEmptyDirectories method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: reference - Method: getResourceLocation
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
            MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(locationMock).split();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
            String[] stringArray = new String[] {};
            String[] stringArray2 = new String[] { "application" };
            doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
            List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            stringUtils.when(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1")).thenReturn(false);
            logMessage.when(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any())).thenReturn(logMessageMock);
            StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
            //Act Statement(s)
            List<StandardConfigDataResource> result = target.resolve(configDataLocationResolverContextMock, locationMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                verify(locationMock).split();
                verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
                verify(binderMock).bind("spring.config.name", String[].class);
                verify(bindResultMock).orElse(stringArray2);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
                stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1"), atLeast(1));
                logMessage.verify(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any()));
            });
        }
    }

    //Sapient generated method id: ${resolveWhenResourceExists}, hash: 19D41F66AA8A6CD76884E2890CD750A6
    @Disabled()
    @Test()
    void resolveWhenResourceExists() throws ConfigDataNotFoundException {
        /* Branches:
         * (for-each(configDataLocations)) : true  #  inside getReferences method
         * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
         * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
         * (isAbsolute) : true  #  inside getResourceLocation method
         * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
         * (resourceLocation.endsWith(File.separator)) : false  #  inside isDirectory method
         * (isDirectory(resourceLocation)) : false  #  inside getReferences method
         * (extensionHintLocation) : true  #  inside getReferencesForFile method
         * (for-each(this.propertySourceLoaders)) : true  #  inside getReferencesForFile method
         * (for-each(loader.getFileExtensions())) : true  #  inside getLoadableFileExtension method
         * (StringUtils.endsWithIgnoreCase(file, fileExtension)) : true  #  inside getLoadableFileExtension method
         * (extension != null) : true  #  inside getReferencesForFile method
         * (!extensionHintLocation) : false  #  inside getReferencesForFile method
         * (for-each(references)) : true  #  inside resolve method
         * (!this.resourceLoader.isPattern(reference.getResourceLocation())) : true  #  inside resolve method
         * (!resource.exists()) : true  #  inside resolveNonPattern method
         * (reference.isSkippable()) : true  #  inside resolveNonPattern method
         * (resolved.isEmpty()) : true  #  inside resolve method
         * (for-each(references)) : true  #  inside resolveEmptyDirectories method
         * (reference.getDirectory() != null) : true  #  inside resolveEmptyDirectories method
         * (!this.resourceLoader.isPattern(reference.getResourceLocation())) : true  #  inside resolveEmptyDirectories method
         * (resource instanceof ClassPathResource) : false  #  inside resolveNonPatternEmptyDirectories method
         * (!resource.exists()) : false  #  inside resolveNonPatternEmptyDirectories method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: reference - Method: getResourceLocation
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
            MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(locationMock).split();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
            String[] stringArray = new String[] {};
            String[] stringArray2 = new String[] { "application" };
            doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
            List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            stringUtils.when(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1")).thenReturn(false);
            logMessage.when(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any())).thenReturn(logMessageMock);
            StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
            //Act Statement(s)
            List<StandardConfigDataResource> result = target.resolve(configDataLocationResolverContextMock, locationMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(1));
                assertThat(result.get(0), is(instanceOf(StandardConfigDataResource.class)));
                verify(locationMock).split();
                verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
                verify(binderMock).bind("spring.config.name", String[].class);
                verify(bindResultMock).orElse(stringArray2);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
                stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1"), atLeast(1));
                logMessage.verify(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any()));
            });
        }
    }

    //Sapient generated method id: ${resolveWhenObjectUtilsIsEmptySubdirectoriesThrowsConfigDataLocationNotFoundException}, hash: 0FAAC638FDD14CFF670ACF01BF7705D2
    @Disabled()
    @Test()
    void resolveWhenObjectUtilsIsEmptySubdirectoriesThrowsConfigDataLocationNotFoundException() throws ConfigDataNotFoundException {
        /* Branches:
         * (for-each(configDataLocations)) : true  #  inside getReferences method
         * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
         * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
         * (isAbsolute) : true  #  inside getResourceLocation method
         * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
         * (resourceLocation.endsWith(File.separator)) : false  #  inside isDirectory method
         * (isDirectory(resourceLocation)) : false  #  inside getReferences method
         * (extensionHintLocation) : true  #  inside getReferencesForFile method
         * (for-each(this.propertySourceLoaders)) : true  #  inside getReferencesForFile method
         * (for-each(loader.getFileExtensions())) : true  #  inside getLoadableFileExtension method
         * (StringUtils.endsWithIgnoreCase(file, fileExtension)) : true  #  inside getLoadableFileExtension method
         * (extension != null) : true  #  inside getReferencesForFile method
         * (!extensionHintLocation) : false  #  inside getReferencesForFile method
         * (for-each(references)) : true  #  inside resolve method
         * (!this.resourceLoader.isPattern(reference.getResourceLocation())) : true  #  inside resolve method
         * (!resource.exists()) : true  #  inside resolveNonPattern method
         * (reference.isSkippable()) : true  #  inside resolveNonPattern method
         * (resolved.isEmpty()) : true  #  inside resolve method
         * (for-each(references)) : true  #  inside resolveEmptyDirectories method
         * (reference.getDirectory() != null) : true  #  inside resolveEmptyDirectories method
         * (!this.resourceLoader.isPattern(reference.getResourceLocation())) : false  #  inside resolveEmptyDirectories method
         * (!location.isOptional()) : true  #  inside resolvePatternEmptyDirectories method
         * (ObjectUtils.isEmpty(subdirectories)) : true  #  inside resolvePatternEmptyDirectories method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: reference - Method: getResourceLocation
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class);
            MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
            MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(locationMock).split();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
            String[] stringArray = new String[] {};
            String[] stringArray2 = new String[] { "application" };
            doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
            List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            stringUtils.when(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1")).thenReturn(false);
            logMessage.when(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any())).thenReturn(logMessageMock);
            Resource[] resourceArray = new Resource[] {};
            objectUtils.when(() -> ObjectUtils.isEmpty(resourceArray)).thenReturn(false);
            StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
            //Act Statement(s)
            final ConfigDataLocationNotFoundException result = assertThrows(ConfigDataLocationNotFoundException.class, () -> {
                target.resolve(configDataLocationResolverContextMock, locationMock);
            });
            StandardConfigDataReference standardConfigDataReference = new StandardConfigDataReference(configDataLocationMock, (String) null, "root1", "profile1", (String) null, propertySourceLoaderMock);
            ConfigDataLocation configDataLocation = standardConfigDataReference.getConfigDataLocation();
            ConfigDataLocationNotFoundException configDataLocationNotFoundException = new ConfigDataLocationNotFoundException(configDataLocation, "message1", (Throwable) null);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(configDataLocationNotFoundException.getMessage()));
                verify(locationMock).split();
                verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
                verify(binderMock).bind("spring.config.name", String[].class);
                verify(bindResultMock).orElse(stringArray2);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
                stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1"), atLeast(1));
                logMessage.verify(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any()));
                objectUtils.verify(() -> ObjectUtils.isEmpty(resourceArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${resolveWhenObjectUtilsNotIsEmptySubdirectories}, hash: 7EB3E93DAAEFA231FD11F625B03596DF
    @Disabled()
    @Test()
    void resolveWhenObjectUtilsNotIsEmptySubdirectories() throws ConfigDataNotFoundException {
        /* Branches:
         * (for-each(configDataLocations)) : true  #  inside getReferences method
         * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
         * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
         * (isAbsolute) : true  #  inside getResourceLocation method
         * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
         * (resourceLocation.endsWith(File.separator)) : false  #  inside isDirectory method
         * (isDirectory(resourceLocation)) : false  #  inside getReferences method
         * (extensionHintLocation) : true  #  inside getReferencesForFile method
         * (for-each(this.propertySourceLoaders)) : true  #  inside getReferencesForFile method
         * (for-each(loader.getFileExtensions())) : true  #  inside getLoadableFileExtension method
         * (StringUtils.endsWithIgnoreCase(file, fileExtension)) : true  #  inside getLoadableFileExtension method
         * (extension != null) : true  #  inside getReferencesForFile method
         * (!extensionHintLocation) : false  #  inside getReferencesForFile method
         * (for-each(references)) : true  #  inside resolve method
         * (!this.resourceLoader.isPattern(reference.getResourceLocation())) : true  #  inside resolve method
         * (!resource.exists()) : true  #  inside resolveNonPattern method
         * (reference.isSkippable()) : true  #  inside resolveNonPattern method
         * (resolved.isEmpty()) : true  #  inside resolve method
         * (for-each(references)) : true  #  inside resolveEmptyDirectories method
         * (reference.getDirectory() != null) : true  #  inside resolveEmptyDirectories method
         * (!this.resourceLoader.isPattern(reference.getResourceLocation())) : false  #  inside resolveEmptyDirectories method
         * (!location.isOptional()) : true  #  inside resolvePatternEmptyDirectories method
         * (ObjectUtils.isEmpty(subdirectories)) : false  #  inside resolvePatternEmptyDirectories method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: reference - Method: getResourceLocation
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class);
            MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
            MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(locationMock).split();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
            String[] stringArray = new String[] {};
            String[] stringArray2 = new String[] { "application" };
            doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
            List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            stringUtils.when(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1")).thenReturn(false);
            logMessage.when(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any())).thenReturn(logMessageMock);
            Resource[] resourceArray = new Resource[] {};
            objectUtils.when(() -> ObjectUtils.isEmpty(resourceArray)).thenReturn(false);
            StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
            //Act Statement(s)
            List<StandardConfigDataResource> result = target.resolve(configDataLocationResolverContextMock, locationMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                verify(locationMock).split();
                verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
                verify(binderMock).bind("spring.config.name", String[].class);
                verify(bindResultMock).orElse(stringArray2);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
                stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1"), atLeast(1));
                logMessage.verify(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any()));
                objectUtils.verify(() -> ObjectUtils.isEmpty(resourceArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${resolveProfileSpecificWhenThisConfigNamesIsEmptyAndReferencesIsEmptyAndResolvedIsEmptyAndReferencesIsEmpty}, hash: 7D7D271F572C4E4EB4EADC5B5C7CDABC
    @Disabled()
    @Test()
    void resolveProfileSpecificWhenThisConfigNamesIsEmptyAndReferencesIsEmptyAndResolvedIsEmptyAndReferencesIsEmpty() {
        /* Branches:
         * (for-each(profiles)) : true  #  inside getProfileSpecificReferences method
         * (for-each(configDataLocations)) : true  #  inside getProfileSpecificReferences method
         * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
         * (URL_PREFIX.matcher(resourceLocation).matches()) : false  #  inside getResourceLocation method
         * (isAbsolute) : false  #  inside getResourceLocation method
         * (parent instanceof StandardConfigDataResource resource) : true  #  inside getResourceLocation method
         * (resourceLocation.endsWith("/")) : true  #  inside isDirectory method
         * (isDirectory(resourceLocation)) : true  #  inside getReferences method
         * (for-each(this.configNames)) : false  #  inside getReferencesForDirectory method
         * (for-each(references)) : false  #  inside resolve method
         * (resolved.isEmpty()) : true  #  inside resolve method
         * (for-each(references)) : false  #  inside resolveEmptyDirectories method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
            doReturn(standardConfigDataResourceMock).when(contextMock).getParent();
            doReturn(standardConfigDataReferenceMock).when(standardConfigDataResourceMock).getReference();
            doReturn("return_of_getResourceLocation1").when(standardConfigDataReferenceMock).getResourceLocation();
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(locationMock).split();
            List<String> stringList = new ArrayList<>();
            Iterator<String> iterator = stringList.iterator();
            doReturn(iterator).when(profilesMock).iterator();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
            String[] stringArray = new String[] {};
            String[] stringArray2 = new String[] { "application" };
            doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
            List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
            //Act Statement(s)
            List<StandardConfigDataResource> result = target.resolveProfileSpecific(contextMock, locationMock, profilesMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                verify(contextMock).getParent();
                verify(standardConfigDataResourceMock).getReference();
                verify(standardConfigDataReferenceMock).getResourceLocation();
                verify(locationMock).split();
                verify(profilesMock).iterator();
                verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
                verify(binderMock).bind("spring.config.name", String[].class);
                verify(bindResultMock).orElse(stringArray2);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
            });
        }
    }

    //Sapient generated method id: ${resolveProfileSpecificWhenIsDirectoryResourceLocationAndThisConfigNamesIsEmptyAndReferencesIsEmptyAndResolvedIsEmptyAnd}, hash: 177694C7D5180BC2738B3E0FAF12902D
    @Disabled()
    @Test()
    void resolveProfileSpecificWhenIsDirectoryResourceLocationAndThisConfigNamesIsEmptyAndReferencesIsEmptyAndResolvedIsEmptyAnd() {
        /* Branches:
         * (for-each(profiles)) : true  #  inside getProfileSpecificReferences method
         * (for-each(configDataLocations)) : true  #  inside getProfileSpecificReferences method
         * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
         * (URL_PREFIX.matcher(resourceLocation).matches()) : false  #  inside getResourceLocation method
         * (isAbsolute) : false  #  inside getResourceLocation method
         * (parent instanceof StandardConfigDataResource resource) : false  #  inside getResourceLocation method
         * (resourceLocation.endsWith("/")) : true  #  inside isDirectory method
         * (isDirectory(resourceLocation)) : true  #  inside getReferences method
         * (for-each(this.configNames)) : false  #  inside getReferencesForDirectory method
         * (for-each(references)) : false  #  inside resolve method
         * (resolved.isEmpty()) : true  #  inside resolve method
         * (for-each(references)) : false  #  inside resolveEmptyDirectories method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
            doReturn(configDataResourceMock).when(contextMock).getParent();
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(locationMock).split();
            List<String> stringList = new ArrayList<>();
            Iterator<String> iterator = stringList.iterator();
            doReturn(iterator).when(profilesMock).iterator();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
            String[] stringArray = new String[] {};
            String[] stringArray2 = new String[] { "application" };
            doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
            List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
            //Act Statement(s)
            List<StandardConfigDataResource> result = target.resolveProfileSpecific(contextMock, locationMock, profilesMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                verify(contextMock).getParent();
                verify(locationMock).split();
                verify(profilesMock).iterator();
                verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
                verify(binderMock).bind("spring.config.name", String[].class);
                verify(bindResultMock).orElse(stringArray2);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
            });
        }
    }

    //Sapient generated method id: ${resolveProfileSpecificWhenStringUtilsNotEndsWithIgnoreCaseFileFileExtensionAndExtensionIsNulThrowsIllegalStateException}, hash: 517BCDC572AC79543D29FAD0DCDB1879
    @Disabled()
    @Test()
    void resolveProfileSpecificWhenStringUtilsNotEndsWithIgnoreCaseFileFileExtensionAndExtensionIsNulThrowsIllegalStateException() {
        /* Branches:
         * (for-each(profiles)) : true  #  inside getProfileSpecificReferences method
         * (for-each(configDataLocations)) : true  #  inside getProfileSpecificReferences method
         * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
         * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
         * (isAbsolute) : true  #  inside getResourceLocation method
         * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
         * (resourceLocation.endsWith(File.separator)) : false  #  inside isDirectory method
         * (isDirectory(resourceLocation)) : false  #  inside getReferences method
         * (extensionHintLocation) : true  #  inside getReferencesForFile method
         * (for-each(this.propertySourceLoaders)) : true  #  inside getReferencesForFile method
         * (for-each(loader.getFileExtensions())) : true  #  inside getLoadableFileExtension method
         * (StringUtils.endsWithIgnoreCase(file, fileExtension)) : false  #  inside getLoadableFileExtension method
         * (extension != null) : false  #  inside getReferencesForFile method
         * (configDataLocation.isOptional()) : false  #  inside getReferencesForFile method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(locationMock).split();
            List<String> stringList = new ArrayList<>();
            Iterator<String> iterator = stringList.iterator();
            doReturn(iterator).when(profilesMock).iterator();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
            String[] stringArray = new String[] {};
            String[] stringArray2 = new String[] { "application" };
            doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
            List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            stringUtils.when(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1")).thenReturn(false);
            StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.resolveProfileSpecific(configDataLocationResolverContextMock, locationMock, profilesMock);
            });
            IllegalStateException illegalStateException = new IllegalStateException("File extension is not known to any PropertySourceLoader. If the location is meant to reference a directory, it must end in '/' or File.separator");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                verify(locationMock).split();
                verify(profilesMock).iterator();
                verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
                verify(binderMock).bind("spring.config.name", String[].class);
                verify(bindResultMock).orElse(stringArray2);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
                stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${resolveProfileSpecificWhenReferencesNotContainsReferenceAndReferencesIsEmptyAndResolvedIsEmptyAndReferencesIsEmpty}, hash: D8309DAF3B004F6AF550147703C094B2
    @Disabled()
    @Test()
    void resolveProfileSpecificWhenReferencesNotContainsReferenceAndReferencesIsEmptyAndResolvedIsEmptyAndReferencesIsEmpty() {
        /* Branches:
         * (for-each(profiles)) : true  #  inside getProfileSpecificReferences method
         * (for-each(configDataLocations)) : true  #  inside getProfileSpecificReferences method
         * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
         * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
         * (isAbsolute) : true  #  inside getResourceLocation method
         * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
         * (resourceLocation.endsWith(File.separator)) : true  #  inside isDirectory method
         * (isDirectory(resourceLocation)) : true  #  inside getReferences method
         * (for-each(this.configNames)) : true  #  inside getReferencesForDirectory method
         * (for-each(this.propertySourceLoaders)) : true  #  inside getReferencesForConfigName method
         * (for-each(propertySourceLoader.getFileExtensions())) : true  #  inside getReferencesForConfigName method
         * (!references.contains(reference)) : true  #  inside getReferencesForConfigName method
         * (for-each(references)) : false  #  inside resolve method
         * (resolved.isEmpty()) : true  #  inside resolve method
         * (for-each(references)) : false  #  inside resolveEmptyDirectories method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(locationMock).split();
            List<String> stringList = new ArrayList<>();
            Iterator<String> iterator = stringList.iterator();
            doReturn(iterator).when(profilesMock).iterator();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
            String[] stringArray = new String[] {};
            String[] stringArray2 = new String[] { "application" };
            doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
            List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
            //Act Statement(s)
            List<StandardConfigDataResource> result = target.resolveProfileSpecific(configDataLocationResolverContextMock, locationMock, profilesMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                verify(locationMock).split();
                verify(profilesMock).iterator();
                verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
                verify(binderMock).bind("spring.config.name", String[].class);
                verify(bindResultMock).orElse(stringArray2);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
            });
        }
    }

    //Sapient generated method id: ${resolveProfileSpecificWhenConfigDataLocationIsOptionalAndReferencesIsEmptyAndResolvedIsEmptyAndReferencesIsEmpty2}, hash: 1E917EA4ABCA9D8E7F8FEFDCF4FBEE9D
    @Disabled()
    @Test()
    void resolveProfileSpecificWhenConfigDataLocationIsOptionalAndReferencesIsEmptyAndResolvedIsEmptyAndReferencesIsEmpty2() {
        /* Branches:
         * (for-each(profiles)) : true  #  inside getProfileSpecificReferences method
         * (for-each(configDataLocations)) : true  #  inside getProfileSpecificReferences method
         * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
         * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
         * (isAbsolute) : true  #  inside getResourceLocation method
         * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
         * (resourceLocation.endsWith(File.separator)) : false  #  inside isDirectory method
         * (isDirectory(resourceLocation)) : false  #  inside getReferences method
         * (extensionHintLocation) : true  #  inside getReferencesForFile method
         * (for-each(this.propertySourceLoaders)) : true  #  inside getReferencesForFile method
         * (for-each(loader.getFileExtensions())) : true  #  inside getLoadableFileExtension method
         * (StringUtils.endsWithIgnoreCase(file, fileExtension)) : true  #  inside getLoadableFileExtension method
         * (extension != null) : false  #  inside getReferencesForFile method
         * (configDataLocation.isOptional()) : true  #  inside getReferencesForFile method
         * (for-each(references)) : false  #  inside resolve method
         * (resolved.isEmpty()) : true  #  inside resolve method
         * (for-each(references)) : false  #  inside resolveEmptyDirectories method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(locationMock).split();
            List<String> stringList = new ArrayList<>();
            Iterator<String> iterator = stringList.iterator();
            doReturn(iterator).when(profilesMock).iterator();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
            String[] stringArray = new String[] {};
            String[] stringArray2 = new String[] { "application" };
            doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
            List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            stringUtils.when(() -> StringUtils.endsWithIgnoreCase("str1", (String) null)).thenReturn(false);
            StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
            //Act Statement(s)
            List<StandardConfigDataResource> result = target.resolveProfileSpecific(configDataLocationResolverContextMock, locationMock, profilesMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                verify(locationMock).split();
                verify(profilesMock).iterator();
                verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
                verify(binderMock).bind("spring.config.name", String[].class);
                verify(bindResultMock).orElse(stringArray2);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
                stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("str1", (String) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${resolveProfileSpecificWhenReferenceNotIsSkippableAndResolvedNotIsEmpty}, hash: D65A2C8868C513B0617377C71AF7AAE1
    @Disabled()
    @Test()
    void resolveProfileSpecificWhenReferenceNotIsSkippableAndResolvedNotIsEmpty() {
        /* Branches:
         * (for-each(profiles)) : true  #  inside getProfileSpecificReferences method
         * (for-each(configDataLocations)) : true  #  inside getProfileSpecificReferences method
         * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
         * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
         * (isAbsolute) : true  #  inside getResourceLocation method
         * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
         * (resourceLocation.endsWith(File.separator)) : false  #  inside isDirectory method
         * (isDirectory(resourceLocation)) : false  #  inside getReferences method
         * (extensionHintLocation) : true  #  inside getReferencesForFile method
         * (for-each(this.propertySourceLoaders)) : true  #  inside getReferencesForFile method
         * (for-each(loader.getFileExtensions())) : true  #  inside getLoadableFileExtension method
         * (StringUtils.endsWithIgnoreCase(file, fileExtension)) : true  #  inside getLoadableFileExtension method
         * (extension != null) : true  #  inside getReferencesForFile method
         * (!extensionHintLocation) : false  #  inside getReferencesForFile method
         * (for-each(references)) : true  #  inside resolve method
         * (!this.resourceLoader.isPattern(reference.getResourceLocation())) : true  #  inside resolve method
         * (!resource.exists()) : true  #  inside resolveNonPattern method
         * (reference.isSkippable()) : false  #  inside resolveNonPattern method
         * (resolved.isEmpty()) : false  #  inside resolve method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: reference - Method: getResourceLocation
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(locationMock).split();
            List<String> stringList = new ArrayList<>();
            Iterator<String> iterator = stringList.iterator();
            doReturn(iterator).when(profilesMock).iterator();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
            String[] stringArray = new String[] {};
            String[] stringArray2 = new String[] { "application" };
            doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
            List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            stringUtils.when(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1")).thenReturn(false);
            StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
            //Act Statement(s)
            List<StandardConfigDataResource> result = target.resolveProfileSpecific(configDataLocationResolverContextMock, locationMock, profilesMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(1));
                assertThat(result.get(0), is(instanceOf(StandardConfigDataResource.class)));
                verify(locationMock).split();
                verify(profilesMock).iterator();
                verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
                verify(binderMock).bind("spring.config.name", String[].class);
                verify(bindResultMock).orElse(stringArray2);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
                stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${resolveProfileSpecificWhenResourceNotExistsAndReferenceNotIsSkippableAndResolvedNotIsEmpty}, hash: D7192F180A3B47A6F906AC9E6D99B9EC
    @Disabled()
    @Test()
    void resolveProfileSpecificWhenResourceNotExistsAndReferenceNotIsSkippableAndResolvedNotIsEmpty() {
        /* Branches:
         * (for-each(profiles)) : true  #  inside getProfileSpecificReferences method
         * (for-each(configDataLocations)) : true  #  inside getProfileSpecificReferences method
         * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
         * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
         * (isAbsolute) : true  #  inside getResourceLocation method
         * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
         * (resourceLocation.endsWith(File.separator)) : false  #  inside isDirectory method
         * (isDirectory(resourceLocation)) : false  #  inside getReferences method
         * (extensionHintLocation) : true  #  inside getReferencesForFile method
         * (for-each(this.propertySourceLoaders)) : true  #  inside getReferencesForFile method
         * (for-each(loader.getFileExtensions())) : true  #  inside getLoadableFileExtension method
         * (StringUtils.endsWithIgnoreCase(file, fileExtension)) : true  #  inside getLoadableFileExtension method
         * (extension != null) : true  #  inside getReferencesForFile method
         * (!extensionHintLocation) : false  #  inside getReferencesForFile method
         * (for-each(references)) : true  #  inside resolve method
         * (!this.resourceLoader.isPattern(reference.getResourceLocation())) : false  #  inside resolve method
         * (for-each(this.resourceLoader.getResources(reference.getResourceLocation(), ResourceType.FILE))) : true  #  inside resolvePattern method
         * (!resource.exists()) : true  #  inside resolvePattern method
         * (reference.isSkippable()) : false  #  inside resolvePattern method
         * (resolved.isEmpty()) : false  #  inside resolve method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: reference - Method: getResourceLocation
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(locationMock).split();
            List<String> stringList = new ArrayList<>();
            Iterator<String> iterator = stringList.iterator();
            doReturn(iterator).when(profilesMock).iterator();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
            String[] stringArray = new String[] {};
            String[] stringArray2 = new String[] { "application" };
            doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
            List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            stringUtils.when(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1")).thenReturn(false);
            StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
            //Act Statement(s)
            List<StandardConfigDataResource> result = target.resolveProfileSpecific(configDataLocationResolverContextMock, locationMock, profilesMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(1));
                assertThat(result.get(0), is(instanceOf(StandardConfigDataResource.class)));
                verify(locationMock).split();
                verify(profilesMock).iterator();
                verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
                verify(binderMock).bind("spring.config.name", String[].class);
                verify(bindResultMock).orElse(stringArray2);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
                stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${resolveProfileSpecificWhenResolvedIsEmptyAndReferencesIsNotEmptyAndReferenceGetDirectoryIsNull}, hash: 9A3A4C6083BCC4A23AFA36B7020E0E04
    @Disabled()
    @Test()
    void resolveProfileSpecificWhenResolvedIsEmptyAndReferencesIsNotEmptyAndReferenceGetDirectoryIsNull() {
        /* Branches:
         * (for-each(profiles)) : true  #  inside getProfileSpecificReferences method
         * (for-each(configDataLocations)) : true  #  inside getProfileSpecificReferences method
         * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
         * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
         * (isAbsolute) : true  #  inside getResourceLocation method
         * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
         * (resourceLocation.endsWith(File.separator)) : false  #  inside isDirectory method
         * (isDirectory(resourceLocation)) : false  #  inside getReferences method
         * (extensionHintLocation) : true  #  inside getReferencesForFile method
         * (for-each(this.propertySourceLoaders)) : true  #  inside getReferencesForFile method
         * (for-each(loader.getFileExtensions())) : true  #  inside getLoadableFileExtension method
         * (StringUtils.endsWithIgnoreCase(file, fileExtension)) : true  #  inside getLoadableFileExtension method
         * (extension != null) : true  #  inside getReferencesForFile method
         * (!extensionHintLocation) : false  #  inside getReferencesForFile method
         * (for-each(references)) : true  #  inside resolve method
         * (!this.resourceLoader.isPattern(reference.getResourceLocation())) : false  #  inside resolve method
         * (for-each(this.resourceLoader.getResources(reference.getResourceLocation(), ResourceType.FILE))) : true  #  inside resolvePattern method
         * (!resource.exists()) : true  #  inside resolvePattern method
         * (reference.isSkippable()) : true  #  inside resolvePattern method
         * (resolved.isEmpty()) : true  #  inside resolve method
         * (for-each(references)) : true  #  inside resolveEmptyDirectories method
         * (reference.getDirectory() != null) : false  #  inside resolveEmptyDirectories method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: reference - Method: getResourceLocation
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
            MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(locationMock).split();
            List<String> stringList = new ArrayList<>();
            Iterator<String> iterator = stringList.iterator();
            doReturn(iterator).when(profilesMock).iterator();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
            String[] stringArray = new String[] {};
            String[] stringArray2 = new String[] { "application" };
            doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
            List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            stringUtils.when(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1")).thenReturn(false);
            logMessage.when(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any())).thenReturn(logMessageMock);
            StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
            //Act Statement(s)
            List<StandardConfigDataResource> result = target.resolveProfileSpecific(configDataLocationResolverContextMock, locationMock, profilesMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                verify(locationMock).split();
                verify(profilesMock).iterator();
                verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
                verify(binderMock).bind("spring.config.name", String[].class);
                verify(bindResultMock).orElse(stringArray2);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
                stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1"), atLeast(1));
                logMessage.verify(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any()));
            });
        }
    }

    //Sapient generated method id: ${resolveProfileSpecificWhenResourceNotExists}, hash: FCBD0BC1AA42735795301278842260A4
    @Disabled()
    @Test()
    void resolveProfileSpecificWhenResourceNotExists() {
        /* Branches:
         * (for-each(profiles)) : true  #  inside getProfileSpecificReferences method
         * (for-each(configDataLocations)) : true  #  inside getProfileSpecificReferences method
         * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
         * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
         * (isAbsolute) : true  #  inside getResourceLocation method
         * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
         * (resourceLocation.endsWith(File.separator)) : false  #  inside isDirectory method
         * (isDirectory(resourceLocation)) : false  #  inside getReferences method
         * (extensionHintLocation) : true  #  inside getReferencesForFile method
         * (for-each(this.propertySourceLoaders)) : true  #  inside getReferencesForFile method
         * (for-each(loader.getFileExtensions())) : true  #  inside getLoadableFileExtension method
         * (StringUtils.endsWithIgnoreCase(file, fileExtension)) : true  #  inside getLoadableFileExtension method
         * (extension != null) : true  #  inside getReferencesForFile method
         * (!extensionHintLocation) : false  #  inside getReferencesForFile method
         * (for-each(references)) : true  #  inside resolve method
         * (!this.resourceLoader.isPattern(reference.getResourceLocation())) : true  #  inside resolve method
         * (!resource.exists()) : true  #  inside resolveNonPattern method
         * (reference.isSkippable()) : true  #  inside resolveNonPattern method
         * (resolved.isEmpty()) : true  #  inside resolve method
         * (for-each(references)) : true  #  inside resolveEmptyDirectories method
         * (reference.getDirectory() != null) : true  #  inside resolveEmptyDirectories method
         * (!this.resourceLoader.isPattern(reference.getResourceLocation())) : true  #  inside resolveEmptyDirectories method
         * (resource instanceof ClassPathResource) : false  #  inside resolveNonPatternEmptyDirectories method
         * (!resource.exists()) : true  #  inside resolveNonPatternEmptyDirectories method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: reference - Method: getResourceLocation
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
            MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(locationMock).split();
            List<String> stringList = new ArrayList<>();
            Iterator<String> iterator = stringList.iterator();
            doReturn(iterator).when(profilesMock).iterator();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
            String[] stringArray = new String[] {};
            String[] stringArray2 = new String[] { "application" };
            doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
            List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            stringUtils.when(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1")).thenReturn(false);
            logMessage.when(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any())).thenReturn(logMessageMock);
            StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
            //Act Statement(s)
            List<StandardConfigDataResource> result = target.resolveProfileSpecific(configDataLocationResolverContextMock, locationMock, profilesMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                verify(locationMock).split();
                verify(profilesMock).iterator();
                verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
                verify(binderMock).bind("spring.config.name", String[].class);
                verify(bindResultMock).orElse(stringArray2);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
                stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1"), atLeast(1));
                logMessage.verify(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any()));
            });
        }
    }

    //Sapient generated method id: ${resolveProfileSpecificWhenResourceExists}, hash: 3B4AC6294C1FF0D0F06C1E888CE28550
    @Disabled()
    @Test()
    void resolveProfileSpecificWhenResourceExists() {
        /* Branches:
         * (for-each(profiles)) : true  #  inside getProfileSpecificReferences method
         * (for-each(configDataLocations)) : true  #  inside getProfileSpecificReferences method
         * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
         * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
         * (isAbsolute) : true  #  inside getResourceLocation method
         * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
         * (resourceLocation.endsWith(File.separator)) : false  #  inside isDirectory method
         * (isDirectory(resourceLocation)) : false  #  inside getReferences method
         * (extensionHintLocation) : true  #  inside getReferencesForFile method
         * (for-each(this.propertySourceLoaders)) : true  #  inside getReferencesForFile method
         * (for-each(loader.getFileExtensions())) : true  #  inside getLoadableFileExtension method
         * (StringUtils.endsWithIgnoreCase(file, fileExtension)) : true  #  inside getLoadableFileExtension method
         * (extension != null) : true  #  inside getReferencesForFile method
         * (!extensionHintLocation) : false  #  inside getReferencesForFile method
         * (for-each(references)) : true  #  inside resolve method
         * (!this.resourceLoader.isPattern(reference.getResourceLocation())) : true  #  inside resolve method
         * (!resource.exists()) : true  #  inside resolveNonPattern method
         * (reference.isSkippable()) : true  #  inside resolveNonPattern method
         * (resolved.isEmpty()) : true  #  inside resolve method
         * (for-each(references)) : true  #  inside resolveEmptyDirectories method
         * (reference.getDirectory() != null) : true  #  inside resolveEmptyDirectories method
         * (!this.resourceLoader.isPattern(reference.getResourceLocation())) : true  #  inside resolveEmptyDirectories method
         * (resource instanceof ClassPathResource) : false  #  inside resolveNonPatternEmptyDirectories method
         * (!resource.exists()) : false  #  inside resolveNonPatternEmptyDirectories method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: reference - Method: getResourceLocation
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
            MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(locationMock).split();
            List<String> stringList = new ArrayList<>();
            Iterator<String> iterator = stringList.iterator();
            doReturn(iterator).when(profilesMock).iterator();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
            String[] stringArray = new String[] {};
            String[] stringArray2 = new String[] { "application" };
            doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
            List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            stringUtils.when(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1")).thenReturn(false);
            logMessage.when(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any())).thenReturn(logMessageMock);
            StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
            //Act Statement(s)
            List<StandardConfigDataResource> result = target.resolveProfileSpecific(configDataLocationResolverContextMock, locationMock, profilesMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(1));
                assertThat(result.get(0), is(instanceOf(StandardConfigDataResource.class)));
                verify(locationMock).split();
                verify(profilesMock).iterator();
                verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
                verify(binderMock).bind("spring.config.name", String[].class);
                verify(bindResultMock).orElse(stringArray2);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
                stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1"), atLeast(1));
                logMessage.verify(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any()));
            });
        }
    }

    //Sapient generated method id: ${resolveProfileSpecificWhenObjectUtilsIsEmptySubdirectoriesThrowsConfigDataLocationNotFoundException}, hash: F11598E68BDEEE477218820F6EAA74EF
    @Disabled()
    @Test()
    void resolveProfileSpecificWhenObjectUtilsIsEmptySubdirectoriesThrowsConfigDataLocationNotFoundException() {
        /* Branches:
         * (for-each(profiles)) : true  #  inside getProfileSpecificReferences method
         * (for-each(configDataLocations)) : true  #  inside getProfileSpecificReferences method
         * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
         * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
         * (isAbsolute) : true  #  inside getResourceLocation method
         * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
         * (resourceLocation.endsWith(File.separator)) : false  #  inside isDirectory method
         * (isDirectory(resourceLocation)) : false  #  inside getReferences method
         * (extensionHintLocation) : true  #  inside getReferencesForFile method
         * (for-each(this.propertySourceLoaders)) : true  #  inside getReferencesForFile method
         * (for-each(loader.getFileExtensions())) : true  #  inside getLoadableFileExtension method
         * (StringUtils.endsWithIgnoreCase(file, fileExtension)) : true  #  inside getLoadableFileExtension method
         * (extension != null) : true  #  inside getReferencesForFile method
         * (!extensionHintLocation) : false  #  inside getReferencesForFile method
         * (for-each(references)) : true  #  inside resolve method
         * (!this.resourceLoader.isPattern(reference.getResourceLocation())) : true  #  inside resolve method
         * (!resource.exists()) : true  #  inside resolveNonPattern method
         * (reference.isSkippable()) : true  #  inside resolveNonPattern method
         * (resolved.isEmpty()) : true  #  inside resolve method
         * (for-each(references)) : true  #  inside resolveEmptyDirectories method
         * (reference.getDirectory() != null) : true  #  inside resolveEmptyDirectories method
         * (!this.resourceLoader.isPattern(reference.getResourceLocation())) : false  #  inside resolveEmptyDirectories method
         * (!location.isOptional()) : true  #  inside resolvePatternEmptyDirectories method
         * (ObjectUtils.isEmpty(subdirectories)) : true  #  inside resolvePatternEmptyDirectories method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: reference - Method: getResourceLocation
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class);
            MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
            MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(locationMock).split();
            List<String> stringList = new ArrayList<>();
            Iterator<String> iterator = stringList.iterator();
            doReturn(iterator).when(profilesMock).iterator();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
            String[] stringArray = new String[] {};
            String[] stringArray2 = new String[] { "application" };
            doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
            List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            stringUtils.when(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1")).thenReturn(false);
            logMessage.when(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any())).thenReturn(logMessageMock);
            Resource[] resourceArray = new Resource[] {};
            objectUtils.when(() -> ObjectUtils.isEmpty(resourceArray)).thenReturn(false);
            StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
            //Act Statement(s)
            final ConfigDataLocationNotFoundException result = assertThrows(ConfigDataLocationNotFoundException.class, () -> {
                target.resolveProfileSpecific(configDataLocationResolverContextMock, locationMock, profilesMock);
            });
            StandardConfigDataReference standardConfigDataReference = new StandardConfigDataReference(configDataLocationMock, (String) null, "root1", "profile1", (String) null, propertySourceLoaderMock);
            ConfigDataLocation configDataLocation = standardConfigDataReference.getConfigDataLocation();
            ConfigDataLocationNotFoundException configDataLocationNotFoundException = new ConfigDataLocationNotFoundException(configDataLocation, "message1", (Throwable) null);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(configDataLocationNotFoundException.getMessage()));
                verify(locationMock).split();
                verify(profilesMock).iterator();
                verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
                verify(binderMock).bind("spring.config.name", String[].class);
                verify(bindResultMock).orElse(stringArray2);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
                stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1"), atLeast(1));
                logMessage.verify(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any()));
                objectUtils.verify(() -> ObjectUtils.isEmpty(resourceArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${resolveProfileSpecificWhenObjectUtilsNotIsEmptySubdirectories}, hash: B773E5ED7FE5D032B4FA56B428582D9A
    @Disabled()
    @Test()
    void resolveProfileSpecificWhenObjectUtilsNotIsEmptySubdirectories() {
        /* Branches:
         * (for-each(profiles)) : true  #  inside getProfileSpecificReferences method
         * (for-each(configDataLocations)) : true  #  inside getProfileSpecificReferences method
         * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
         * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
         * (isAbsolute) : true  #  inside getResourceLocation method
         * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
         * (resourceLocation.endsWith(File.separator)) : false  #  inside isDirectory method
         * (isDirectory(resourceLocation)) : false  #  inside getReferences method
         * (extensionHintLocation) : true  #  inside getReferencesForFile method
         * (for-each(this.propertySourceLoaders)) : true  #  inside getReferencesForFile method
         * (for-each(loader.getFileExtensions())) : true  #  inside getLoadableFileExtension method
         * (StringUtils.endsWithIgnoreCase(file, fileExtension)) : true  #  inside getLoadableFileExtension method
         * (extension != null) : true  #  inside getReferencesForFile method
         * (!extensionHintLocation) : false  #  inside getReferencesForFile method
         * (for-each(references)) : true  #  inside resolve method
         * (!this.resourceLoader.isPattern(reference.getResourceLocation())) : true  #  inside resolve method
         * (!resource.exists()) : true  #  inside resolveNonPattern method
         * (reference.isSkippable()) : true  #  inside resolveNonPattern method
         * (resolved.isEmpty()) : true  #  inside resolve method
         * (for-each(references)) : true  #  inside resolveEmptyDirectories method
         * (reference.getDirectory() != null) : true  #  inside resolveEmptyDirectories method
         * (!this.resourceLoader.isPattern(reference.getResourceLocation())) : false  #  inside resolveEmptyDirectories method
         * (!location.isOptional()) : true  #  inside resolvePatternEmptyDirectories method
         * (ObjectUtils.isEmpty(subdirectories)) : false  #  inside resolvePatternEmptyDirectories method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: reference - Method: getResourceLocation
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class);
            MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
            MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(locationMock).split();
            List<String> stringList = new ArrayList<>();
            Iterator<String> iterator = stringList.iterator();
            doReturn(iterator).when(profilesMock).iterator();
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
            doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
            String[] stringArray = new String[] {};
            String[] stringArray2 = new String[] { "application" };
            doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
            List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
            springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            stringUtils.when(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1")).thenReturn(false);
            logMessage.when(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any())).thenReturn(logMessageMock);
            Resource[] resourceArray = new Resource[] {};
            objectUtils.when(() -> ObjectUtils.isEmpty(resourceArray)).thenReturn(false);
            StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
            //Act Statement(s)
            List<StandardConfigDataResource> result = target.resolveProfileSpecific(configDataLocationResolverContextMock, locationMock, profilesMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                verify(locationMock).split();
                verify(profilesMock).iterator();
                verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
                verify(binderMock).bind("spring.config.name", String[].class);
                verify(bindResultMock).orElse(stringArray2);
                springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
                stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1"), atLeast(1));
                logMessage.verify(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any()));
                objectUtils.verify(() -> ObjectUtils.isEmpty(resourceArray), atLeast(1));
            });
        }
    }
}
