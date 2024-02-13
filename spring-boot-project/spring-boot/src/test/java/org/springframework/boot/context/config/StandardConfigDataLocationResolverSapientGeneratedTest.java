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
import static org.hamcrest.Matchers.containsInRelativeOrder;
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

	private final PropertySourceLoader loaderMock = mock(PropertySourceLoader.class);

	private final ConfigDataLocation locationMock = mock(ConfigDataLocation.class);

	private final DeferredLogFactory logFactoryMock = mock(DeferredLogFactory.class);

	private final LogMessage logMessageMock = mock(LogMessage.class);

	private final Profiles profilesMock = mock(Profiles.class);

	private final PropertySourceLoader propertySourceLoaderMock = mock(PropertySourceLoader.class);

	private final ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);

	private final Resource resourceMock = mock(Resource.class);

	private final StandardConfigDataReference standardConfigDataReferenceMock = mock(StandardConfigDataReference.class);

	private final StandardConfigDataResource standardConfigDataResourceMock = mock(StandardConfigDataResource.class);

	//Sapient generated method id: ${0bab2f51-0335-3cad-8d28-78925f74e38e}
	@Test()
	void isResolvableTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
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

	//Sapient generated method id: ${77a101a8-307f-3910-9b9b-6213390f5109}
	@Disabled()
	@Test()
	void resolveWhenCaughtRuntimeExceptionThrowsIllegalStateException() throws ConfigDataNotFoundException {
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
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
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

	//Sapient generated method id: ${c31bb46e-873f-376c-b94d-152b8b67e332}
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
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
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

	//Sapient generated method id: ${e7e271de-04b1-38c3-9e7f-377560d99ba0}
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
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
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

	//Sapient generated method id: ${3aee43c1-3576-3f3e-8a3f-afd58fda701b}
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
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
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

	//Sapient generated method id: ${50d79b94-f418-38e9-8b11-252545120f27}
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
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
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

	//Sapient generated method id: ${aee9b2e5-c7f0-3b31-a3ec-0a0c48aa0372}
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
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
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

	//Sapient generated method id: ${1a1163ea-3f8c-3d0a-a58f-082401de55bf}
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
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
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

	//Sapient generated method id: ${df1c16d5-0f9a-3cf0-a165-4488a2b4516e}
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
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
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
			StandardConfigDataReference standardConfigDataReference = new StandardConfigDataReference(configDataLocationMock, (String) null, "root1", "profile1", (String) null, propertySourceLoaderMock);
			StandardConfigDataResource standardConfigDataResource = new StandardConfigDataResource(standardConfigDataReference, resourceMock);
			List<StandardConfigDataResource> standardConfigDataResourceResultList = new ArrayList<>();
			standardConfigDataResourceResultList.add(standardConfigDataResource);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(standardConfigDataResourceResultList.size()));
				assertThat(result, containsInRelativeOrder(standardConfigDataResourceResultList.toArray()));
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

	//Sapient generated method id: ${3a7bbdb9-ff22-3048-ac02-49f9133bd916}
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
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
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
			StandardConfigDataReference standardConfigDataReference = new StandardConfigDataReference(configDataLocationMock, (String) null, "root1", "profile1", (String) null, propertySourceLoaderMock);
			StandardConfigDataResource standardConfigDataResource = new StandardConfigDataResource(standardConfigDataReference, resourceMock);
			List<StandardConfigDataResource> standardConfigDataResourceResultList = new ArrayList<>();
			standardConfigDataResourceResultList.add(standardConfigDataResource);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(standardConfigDataResourceResultList.size()));
				assertThat(result, containsInRelativeOrder(standardConfigDataResourceResultList.toArray()));
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

	//Sapient generated method id: ${9a12cccc-3de9-3782-8420-fd11b08bca67}
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
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
			springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1")).thenReturn(false);
			logMessage.when(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any())).thenReturn(logMessageMock);
			doReturn("return_of_getNonPrefixedValue1").when(configDataLocationMock).getNonPrefixedValue("resource:");
			String[] stringArray3 = new String[] {};
			doReturn(stringArray3).when(loaderMock).getFileExtensions();
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
				verify(configDataLocationMock).getNonPrefixedValue("resource:");
				verify(loaderMock).getFileExtensions();
			});
		}
	}

	//Sapient generated method id: ${7125dca4-3032-36e5-9361-08a17b5d2a72}
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
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
			springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1")).thenReturn(false);
			logMessage.when(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any())).thenReturn(logMessageMock);
			doReturn("return_of_getNonPrefixedValue1").when(configDataLocationMock).getNonPrefixedValue("resource:");
			String[] stringArray3 = new String[] {};
			doReturn(stringArray3).when(loaderMock).getFileExtensions();
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
				verify(configDataLocationMock).getNonPrefixedValue("resource:");
				verify(loaderMock).getFileExtensions();
			});
		}
	}

	//Sapient generated method id: ${6d92c240-37a1-3bc2-9065-896163fe280b}
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
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
			springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1")).thenReturn(false);
			logMessage.when(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any())).thenReturn(logMessageMock);
			doReturn("return_of_getNonPrefixedValue1").when(configDataLocationMock).getNonPrefixedValue("resource:");
			String[] stringArray3 = new String[] {};
			doReturn(stringArray3).when(loaderMock).getFileExtensions();
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			List<StandardConfigDataResource> result = target.resolve(configDataLocationResolverContextMock, locationMock);
			StandardConfigDataReference standardConfigDataReference = new StandardConfigDataReference(configDataLocationMock, (String) null, "root1", "profile1", (String) null, loaderMock);
			StandardConfigDataResource standardConfigDataResource = new StandardConfigDataResource(standardConfigDataReference, resourceMock, true);
			List<StandardConfigDataResource> standardConfigDataResourceResultList = new ArrayList<>();
			standardConfigDataResourceResultList.add(standardConfigDataResource);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(standardConfigDataResourceResultList.size()));
				assertThat(result, containsInRelativeOrder(standardConfigDataResourceResultList.toArray()));
				verify(locationMock).split();
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1"), atLeast(1));
				logMessage.verify(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any()));
				verify(configDataLocationMock).getNonPrefixedValue("resource:");
				verify(loaderMock).getFileExtensions();
			});
		}
	}

	//Sapient generated method id: ${79aaac1c-ec17-3375-9c82-efdcc65d0edf}
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
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
			springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1")).thenReturn(false);
			logMessage.when(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any())).thenReturn(logMessageMock);
			doReturn("return_of_getNonPrefixedValue1").when(configDataLocationMock).getNonPrefixedValue("resource:");
			String[] stringArray3 = new String[] {};
			doReturn(stringArray3).when(loaderMock).getFileExtensions();
			Resource[] resourceArray = new Resource[] {};
			objectUtils.when(() -> ObjectUtils.isEmpty(resourceArray)).thenReturn(false);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			final ConfigDataLocationNotFoundException result = assertThrows(ConfigDataLocationNotFoundException.class, () -> {
				target.resolve(configDataLocationResolverContextMock, locationMock);
			});
			StandardConfigDataReference standardConfigDataReference = new StandardConfigDataReference(configDataLocationMock, (String) null, "root1", "profile1", (String) null, loaderMock);
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
				verify(configDataLocationMock).getNonPrefixedValue("resource:");
				verify(loaderMock).getFileExtensions();
				objectUtils.verify(() -> ObjectUtils.isEmpty(resourceArray), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4405c74b-8b75-32f0-9690-2a9e01bf9787}
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
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
			springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1")).thenReturn(false);
			logMessage.when(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any())).thenReturn(logMessageMock);
			doReturn("return_of_getNonPrefixedValue1").when(configDataLocationMock).getNonPrefixedValue("resource:");
			String[] stringArray3 = new String[] {};
			doReturn(stringArray3).when(loaderMock).getFileExtensions();
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
				verify(configDataLocationMock).getNonPrefixedValue("resource:");
				verify(loaderMock).getFileExtensions();
				objectUtils.verify(() -> ObjectUtils.isEmpty(resourceArray), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${d5a507f2-e922-378c-a66c-1b408cfdf339}
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
			doReturn(null).when(profilesMock).iterator();
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
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

	//Sapient generated method id: ${e2a343c6-45dc-3a44-8c38-92e5f37fee56}
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
			doReturn(null).when(profilesMock).iterator();
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
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

	//Sapient generated method id: ${0a687fcc-f632-3e29-bb65-081935001900}
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
			doReturn(null).when(profilesMock).iterator();
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
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

	//Sapient generated method id: ${f0d86c27-c261-3455-af6d-bda63befa3f3}
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
			doReturn(null).when(profilesMock).iterator();
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
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

	//Sapient generated method id: ${d2df2e9d-6214-36c1-969d-cf3e96fc3380}
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
			doReturn(null).when(profilesMock).iterator();
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
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

	//Sapient generated method id: ${fcd51614-9cdb-341a-82b4-f699336bd6c0}
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
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn(null).when(profilesMock).iterator();
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
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
			StandardConfigDataReference standardConfigDataReference = new StandardConfigDataReference(configDataLocationMock, (String) null, "root1", "profile1", (String) null, propertySourceLoaderMock);
			StandardConfigDataResource standardConfigDataResource = new StandardConfigDataResource(standardConfigDataReference, resourceMock);
			List<StandardConfigDataResource> standardConfigDataResourceResultList = new ArrayList<>();
			standardConfigDataResourceResultList.add(standardConfigDataResource);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(standardConfigDataResourceResultList.size()));
				assertThat(result, containsInRelativeOrder(standardConfigDataResourceResultList.toArray()));
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

	//Sapient generated method id: ${95f82988-c00b-3ed1-9160-a5ab3561ea13}
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
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn(null).when(profilesMock).iterator();
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
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
			StandardConfigDataReference standardConfigDataReference = new StandardConfigDataReference(configDataLocationMock, (String) null, "root1", "profile1", (String) null, propertySourceLoaderMock);
			StandardConfigDataResource standardConfigDataResource = new StandardConfigDataResource(standardConfigDataReference, resourceMock);
			List<StandardConfigDataResource> standardConfigDataResourceResultList = new ArrayList<>();
			standardConfigDataResourceResultList.add(standardConfigDataResource);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(standardConfigDataResourceResultList.size()));
				assertThat(result, containsInRelativeOrder(standardConfigDataResourceResultList.toArray()));
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

	//Sapient generated method id: ${e9faafa8-b0c1-3997-ac76-e55465e36e22}
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
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn(null).when(profilesMock).iterator();
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
			springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1")).thenReturn(false);
			logMessage.when(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any())).thenReturn(logMessageMock);
			doReturn("return_of_getNonPrefixedValue1").when(configDataLocationMock).getNonPrefixedValue("resource:");
			String[] stringArray3 = new String[] {};
			doReturn(stringArray3).when(loaderMock).getFileExtensions();
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
				verify(configDataLocationMock).getNonPrefixedValue("resource:");
				verify(loaderMock).getFileExtensions();
			});
		}
	}

	//Sapient generated method id: ${9ef64fea-c920-3f97-8855-bf3ee5d4dbec}
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
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn(null).when(profilesMock).iterator();
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
			springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1")).thenReturn(false);
			logMessage.when(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any())).thenReturn(logMessageMock);
			doReturn("return_of_getNonPrefixedValue1").when(configDataLocationMock).getNonPrefixedValue("resource:");
			String[] stringArray3 = new String[] {};
			doReturn(stringArray3).when(loaderMock).getFileExtensions();
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
				verify(configDataLocationMock).getNonPrefixedValue("resource:");
				verify(loaderMock).getFileExtensions();
			});
		}
	}

	//Sapient generated method id: ${72b2cfa4-fe5b-3b34-bf73-489fee1445bf}
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
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn(null).when(profilesMock).iterator();
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
			springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1")).thenReturn(false);
			logMessage.when(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any())).thenReturn(logMessageMock);
			doReturn("return_of_getNonPrefixedValue1").when(configDataLocationMock).getNonPrefixedValue("resource:");
			String[] stringArray3 = new String[] {};
			doReturn(stringArray3).when(loaderMock).getFileExtensions();
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			List<StandardConfigDataResource> result = target.resolveProfileSpecific(configDataLocationResolverContextMock, locationMock, profilesMock);
			StandardConfigDataReference standardConfigDataReference = new StandardConfigDataReference(configDataLocationMock, (String) null, "root1", "profile1", (String) null, loaderMock);
			StandardConfigDataResource standardConfigDataResource = new StandardConfigDataResource(standardConfigDataReference, resourceMock, true);
			List<StandardConfigDataResource> standardConfigDataResourceResultList = new ArrayList<>();
			standardConfigDataResourceResultList.add(standardConfigDataResource);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(standardConfigDataResourceResultList.size()));
				assertThat(result, containsInRelativeOrder(standardConfigDataResourceResultList.toArray()));
				verify(locationMock).split();
				verify(profilesMock).iterator();
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1"), atLeast(1));
				logMessage.verify(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any()));
				verify(configDataLocationMock).getNonPrefixedValue("resource:");
				verify(loaderMock).getFileExtensions();
			});
		}
	}

	//Sapient generated method id: ${821b1437-df7b-3e8d-8842-2ca7a2912590}
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
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(null).when(profilesMock).iterator();
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
			springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1")).thenReturn(false);
			logMessage.when(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any())).thenReturn(logMessageMock);
			doReturn("return_of_getNonPrefixedValue1").when(configDataLocationMock).getNonPrefixedValue("resource:");
			String[] stringArray3 = new String[] {};
			doReturn(stringArray3).when(loaderMock).getFileExtensions();
			Resource[] resourceArray = new Resource[] {};
			objectUtils.when(() -> ObjectUtils.isEmpty(resourceArray)).thenReturn(false);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			final ConfigDataLocationNotFoundException result = assertThrows(ConfigDataLocationNotFoundException.class, () -> {
				target.resolveProfileSpecific(configDataLocationResolverContextMock, locationMock, profilesMock);
			});
			StandardConfigDataReference standardConfigDataReference = new StandardConfigDataReference(configDataLocationMock, (String) null, "root1", "profile1", (String) null, loaderMock);
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
				verify(configDataLocationMock).getNonPrefixedValue("resource:");
				verify(loaderMock).getFileExtensions();
				objectUtils.verify(() -> ObjectUtils.isEmpty(resourceArray), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c065a2d2-518c-33a4-86e0-c176910c864b}
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
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			doReturn(null).when(profilesMock).iterator();
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
			springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.endsWithIgnoreCase("str1", "suffix1")).thenReturn(false);
			logMessage.when(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any())).thenReturn(logMessageMock);
			doReturn("return_of_getNonPrefixedValue1").when(configDataLocationMock).getNonPrefixedValue("resource:");
			String[] stringArray3 = new String[] {};
			doReturn(stringArray3).when(loaderMock).getFileExtensions();
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
				verify(configDataLocationMock).getNonPrefixedValue("resource:");
				verify(loaderMock).getFileExtensions();
				objectUtils.verify(() -> ObjectUtils.isEmpty(resourceArray), atLeast(1));
			});
		}
	}
}
