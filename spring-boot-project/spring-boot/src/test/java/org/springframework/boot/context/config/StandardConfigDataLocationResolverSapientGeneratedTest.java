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

	private final ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);

	private final StandardConfigDataReference standardConfigDataReferenceMock = mock(StandardConfigDataReference.class);

	private final StandardConfigDataResource standardConfigDataResourceMock = mock(StandardConfigDataResource.class);

	//Sapient generated method id: ${0bab2f51-0335-3cad-8d28-78925f74e38e}, hash: DFDFDE0BEEF44D9256073287CFBE5031
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

	//Sapient generated method id: ${77a101a8-307f-3910-9b9b-6213390f5109}, hash: D9D6EC25C53118ACA5CC6DDDDEF823C8
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

	//Sapient generated method id: ${c31bb46e-873f-376c-b94d-152b8b67e332}, hash: 9E41940893FB096E06BF9EC28DD49900
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

	//Sapient generated method id: ${e7e271de-04b1-38c3-9e7f-377560d99ba0}, hash: 4968EBF0527BB90FA650916911BBD92B
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

	//Sapient generated method id: ${3aee43c1-3576-3f3e-8a3f-afd58fda701b}, hash: B3889BDC7B6731AD140B10DA6E01E2E2
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

	//Sapient generated method id: ${50d79b94-f418-38e9-8b11-252545120f27}, hash: 673D258A1EE27EB1D9847BF6238EFE8C
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

	//Sapient generated method id: ${aee9b2e5-c7f0-3b31-a3ec-0a0c48aa0372}, hash: 21A6C3A9F56DFA50998409B8AA23FC11
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

	//Sapient generated method id: ${1a1163ea-3f8c-3d0a-a58f-082401de55bf}, hash: A1036AC99DE2DC05724FA60B3B0104C7
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

	//Sapient generated method id: ${df1c16d5-0f9a-3cf0-a165-4488a2b4516e}, hash: 0A0443D142EA41E6C339D7D9628DC427
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: reference - Method: getResourceLocation
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

	//Sapient generated method id: ${3a7bbdb9-ff22-3048-ac02-49f9133bd916}, hash: 3649EB5D4BD3B4F136C956B051AB64AF
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: reference - Method: getResourceLocation
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

	//Sapient generated method id: ${9a12cccc-3de9-3782-8420-fd11b08bca67}, hash: 018F4B40A0CD238228978D3ECE2DE1D8
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: reference - Method: getResourceLocation
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

	//Sapient generated method id: ${7125dca4-3032-36e5-9361-08a17b5d2a72}, hash: EB1BC3C8B449428C3351AD0A87599CBE
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: reference - Method: getResourceLocation
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

	//Sapient generated method id: ${6d92c240-37a1-3bc2-9065-896163fe280b}, hash: AA025DA8EA505473CB033E4FBA9BE12B
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: reference - Method: getResourceLocation
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
			doReturn("return_of_getNonPrefixedValue1").when(configDataLocationMock).getNonPrefixedValue("resource:");
			String[] stringArray3 = new String[] {};
			doReturn(stringArray3).when(loaderMock).getFileExtensions();
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
				verify(configDataLocationMock, atLeast(1)).getNonPrefixedValue("resource:");
				verify(loaderMock, atLeast(1)).getFileExtensions();
			});
		}
	}

	//Sapient generated method id: ${79aaac1c-ec17-3375-9c82-efdcc65d0edf}, hash: 433A344709FEE6AAC1E88523FB038936
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: reference - Method: getResourceLocation
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

	//Sapient generated method id: ${4405c74b-8b75-32f0-9690-2a9e01bf9787}, hash: 45AFC0895A91D3461DC697AC2EC8D8F6
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: reference - Method: getResourceLocation
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

	//Sapient generated method id: ${d5a507f2-e922-378c-a66c-1b408cfdf339}, hash: 1DDBB5E932DEECA5D033CEF8657C7793
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

	//Sapient generated method id: ${e2a343c6-45dc-3a44-8c38-92e5f37fee56}, hash: 5FD490A7658CF03581D1E89A886A3604
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

	//Sapient generated method id: ${0a687fcc-f632-3e29-bb65-081935001900}, hash: DB4AEA01B70B331680323219310EA1C5
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

	//Sapient generated method id: ${f0d86c27-c261-3455-af6d-bda63befa3f3}, hash: 342C8AEF81885DA73A4634C4EFA87318
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

	//Sapient generated method id: ${d2df2e9d-6214-36c1-969d-cf3e96fc3380}, hash: FA3706925A0FF76A6B89A43FFB30E029
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

	//Sapient generated method id: ${fcd51614-9cdb-341a-82b4-f699336bd6c0}, hash: DDCC87D737BBA80ED913EE25A496032F
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: reference - Method: getResourceLocation
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
			doReturn(null).when(profilesMock).iterator();
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

	//Sapient generated method id: ${95f82988-c00b-3ed1-9160-a5ab3561ea13}, hash: B9CF317BC6BE34033BA0A25390AFAA7B
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: reference - Method: getResourceLocation
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
			doReturn(null).when(profilesMock).iterator();
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

	//Sapient generated method id: ${e9faafa8-b0c1-3997-ac76-e55465e36e22}, hash: BD76BBE021AA854D5206EB4DF69399D2
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: reference - Method: getResourceLocation
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
			doReturn(null).when(profilesMock).iterator();
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

	//Sapient generated method id: ${9ef64fea-c920-3f97-8855-bf3ee5d4dbec}, hash: 166599234D7958A48CF743A0239CEDB9
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: reference - Method: getResourceLocation
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
			doReturn(null).when(profilesMock).iterator();
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

	//Sapient generated method id: ${72b2cfa4-fe5b-3b34-bf73-489fee1445bf}, hash: E74B9FB8E52A9BE8165E2616AEB067E1
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: reference - Method: getResourceLocation
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
			doReturn(null).when(profilesMock).iterator();
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
			doReturn("return_of_getNonPrefixedValue1").when(configDataLocationMock).getNonPrefixedValue("resource:");
			String[] stringArray3 = new String[] {};
			doReturn(stringArray3).when(loaderMock).getFileExtensions();
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
				verify(configDataLocationMock, atLeast(1)).getNonPrefixedValue("resource:");
				verify(loaderMock, atLeast(1)).getFileExtensions();
			});
		}
	}

	//Sapient generated method id: ${821b1437-df7b-3e8d-8842-2ca7a2912590}, hash: 23BF0DE46FE2B71D0D543DE529EDCC63
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: reference - Method: getResourceLocation
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
			doReturn(null).when(profilesMock).iterator();
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

	//Sapient generated method id: ${c065a2d2-518c-33a4-86e0-c176910c864b}, hash: 10204E14B22EAA36EAC4F1CC4259B67C
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
		 *  A variable could not be isolated or mocked when calling a method - Variable name: reference - Method: getResourceLocation
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
			doReturn(null).when(profilesMock).iterator();
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
