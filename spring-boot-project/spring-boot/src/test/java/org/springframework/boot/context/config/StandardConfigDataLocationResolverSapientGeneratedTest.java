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

import org.springframework.boot.context.properties.source.ConfigurationPropertySource;

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

	private final ConfigDataLocation locationMock = mock(ConfigDataLocation.class);

	private final DeferredLogFactory logFactoryMock = mock(DeferredLogFactory.class);

	private final LogMessage logMessageMock = mock(LogMessage.class);

	private final Profiles profilesMock = mock(Profiles.class);

	private final PropertySourceLoader propertySourceLoaderMock = mock(PropertySourceLoader.class);

	private final ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);

	private final Resource resourceMock = mock(Resource.class);

	private final StandardConfigDataReference standardConfigDataReferenceMock = mock(StandardConfigDataReference.class);

	private final StandardConfigDataResource standardConfigDataResourceMock = mock(StandardConfigDataResource.class);

	//Sapient generated method id: ${0bab2f51-0335-3cad-8d28-78925f74e38e}, hash: CE5D548FFFB7759E9C4861E585F6F547
	@Test()
	void isResolvableTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		PropertySourceLoader propertySourceLoaderMock = mock(PropertySourceLoader.class, "List");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
			propertySourceLoaderList.add(propertySourceLoaderMock);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertySource[] configurationPropertySourceArray = new ConfigurationPropertySource[] {};
			Binder binder = new Binder(configurationPropertySourceArray);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binder, resourceLoaderMock);
			//Act Statement(s)
			boolean result = target.isResolvable(configDataLocationResolverContextMock, configDataLocationMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${77a101a8-307f-3910-9b9b-6213390f5109}, hash: 0E28884593DE8D36935C78463C987AFC
	@Test()
	void resolveWhenCaughtRuntimeExceptionThrowsIllegalStateException() throws ConfigDataNotFoundException {
		/* Branches:
		 * (for-each(configDataLocations)) : true  #  inside getReferences method
		 * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
		 * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
		 * (isAbsolute) : true  #  inside getResourceLocation method
		 * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
		 * (resourceLocation.endsWith(File.separator)) : false  #  inside isDirectory method
		 * (isDirectory(resourceLocation)) : false  #  inside getReferences method
		 * (catch-exception (RuntimeException)) : true  #  inside getReferences method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigDataLocation configDataLocationMock = mock(ConfigDataLocation.class, "getReferences_configDataLocation1");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn("A").when(configDataLocationMock).getNonPrefixedValue("resource:");
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] { "B" };
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
			IllegalStateException illegalStateException = new IllegalStateException("Unable to load config data from 'getReferences_configDataLocation1'", runtimeException);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(runtimeException.getClass())));
				verify(locationMock).split();
				verify(configDataLocationMock).getNonPrefixedValue("resource:");
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${1a38531b-c348-3c2a-85b2-c9963605f176}, hash: 40D950E60C670C01C09EB60CE90C136E
	@Disabled()
	@Test()
	void resolveWhenThisConfigNamesIsEmptyAndCaughtRuntimeExceptionThrowsIllegalStateException() throws ConfigDataNotFoundException {
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

	//Sapient generated method id: ${e7e271de-04b1-38c3-9e7f-377560d99ba0}, hash: 4968EBF0527BB90FA650916911BBD92B
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

	//Sapient generated method id: ${3aee43c1-3576-3f3e-8a3f-afd58fda701b}, hash: B3889BDC7B6731AD140B10DA6E01E2E2
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

	//Sapient generated method id: ${50d79b94-f418-38e9-8b11-252545120f27}, hash: 1B1F3C5BB58051217E30C6D1B7526B9A
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
		ConfigDataLocation configDataLocationMock = mock(ConfigDataLocation.class, "getReferences_configDataLocation1");
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn("A").when(configDataLocationMock).getNonPrefixedValue("resource:");
			doReturn(false).when(configDataLocationMock).isOptional();
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] { "B" };
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
			propertySourceLoaderList.add(propertySourceLoaderMock);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
			String[] stringArray3 = new String[] { "return_of_getFileExtensionsItem1" };
			doReturn(stringArray3).when(propertySourceLoaderMock).getFileExtensions();
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.endsWithIgnoreCase("CD", "return_of_getFileExtensionsItem1")).thenReturn(false);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.resolve(configDataLocationResolverContextMock, locationMock);
			});
			RuntimeException runtimeException = new RuntimeException();
			IllegalStateException illegalStateException = new IllegalStateException("Unable to load config data from 'getReferences_configDataLocation1'", runtimeException);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(runtimeException.getClass())));
				verify(locationMock).split();
				verify(configDataLocationMock).getNonPrefixedValue("resource:");
				verify(configDataLocationMock).isOptional();
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
				verify(propertySourceLoaderMock).getFileExtensions();
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("CD", "return_of_getFileExtensionsItem1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${aee9b2e5-c7f0-3b31-a3ec-0a0c48aa0372}, hash: 21A6C3A9F56DFA50998409B8AA23FC11
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

	//Sapient generated method id: ${df1c16d5-0f9a-3cf0-a165-4488a2b4516e}, hash: B74DECA9FEA4A28E39FEE67D2F5E3A24
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
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn("AG").when(configDataLocationMock).getNonPrefixedValue("resource:");
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] { "" };
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
			propertySourceLoaderList.add(propertySourceLoaderMock);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
			String[] stringArray3 = new String[] { "" };
			doReturn(stringArray3).when(propertySourceLoaderMock).getFileExtensions();
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.endsWithIgnoreCase("DF", "")).thenReturn(true);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			List<StandardConfigDataResource> result = target.resolve(configDataLocationResolverContextMock, locationMock);
			StandardConfigDataReference standardConfigDataReference = new StandardConfigDataReference(configDataLocationMock, (String) null, "D", "profile1", (String) null, propertySourceLoaderMock);
			StandardConfigDataResource standardConfigDataResource = new StandardConfigDataResource(standardConfigDataReference, resourceMock);
			List<StandardConfigDataResource> standardConfigDataResourceResultList = new ArrayList<>();
			standardConfigDataResourceResultList.add(standardConfigDataResource);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(standardConfigDataResourceResultList.size()));
				assertThat(result, containsInRelativeOrder(standardConfigDataResourceResultList.toArray()));
				verify(locationMock).split();
				verify(configDataLocationMock, atLeast(1)).getNonPrefixedValue("resource:");
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
				verify(propertySourceLoaderMock, atLeast(1)).getFileExtensions();
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("DF", ""), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3a7bbdb9-ff22-3048-ac02-49f9133bd916}, hash: 6BB0A2F7A6E764756F62AEB0D7CA9ABA
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
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn("AG").when(configDataLocationMock).getNonPrefixedValue("resource:");
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] { "" };
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
			propertySourceLoaderList.add(propertySourceLoaderMock);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
			String[] stringArray3 = new String[] { "" };
			doReturn(stringArray3).when(propertySourceLoaderMock).getFileExtensions();
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.endsWithIgnoreCase("DF", "")).thenReturn(true);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			List<StandardConfigDataResource> result = target.resolve(configDataLocationResolverContextMock, locationMock);
			StandardConfigDataReference standardConfigDataReference = new StandardConfigDataReference(configDataLocationMock, (String) null, "D", "profile1", (String) null, propertySourceLoaderMock);
			StandardConfigDataResource standardConfigDataResource = new StandardConfigDataResource(standardConfigDataReference, resourceMock);
			List<StandardConfigDataResource> standardConfigDataResourceResultList = new ArrayList<>();
			standardConfigDataResourceResultList.add(standardConfigDataResource);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(standardConfigDataResourceResultList.size()));
				assertThat(result, containsInRelativeOrder(standardConfigDataResourceResultList.toArray()));
				verify(locationMock).split();
				verify(configDataLocationMock, atLeast(1)).getNonPrefixedValue("resource:");
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
				verify(propertySourceLoaderMock, atLeast(1)).getFileExtensions();
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("DF", ""), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${8fa15f09-357d-3c9b-b9ac-75a551c80290}, hash: 84B278452CB5AC21807E74D7226479F2
	@Disabled()
	@Test()
	void resolveWhenReferenceIsSkippableAndResolvedIsEmptyAndReferencesIsNotEmptyAndReferenceGetDirectoryIsNull() throws ConfigDataNotFoundException {
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
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn("AG").when(configDataLocationMock).getNonPrefixedValue("resource:");
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] { "" };
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
			propertySourceLoaderList.add(propertySourceLoaderMock);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
			String[] stringArray3 = new String[] { "" };
			doReturn(stringArray3).when(propertySourceLoaderMock).getFileExtensions();
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.endsWithIgnoreCase("DF", "")).thenReturn(true);
			logMessage.when(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any())).thenReturn(logMessageMock);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			List<StandardConfigDataResource> result = target.resolve(configDataLocationResolverContextMock, locationMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				verify(locationMock).split();
				verify(configDataLocationMock).getNonPrefixedValue("resource:");
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
				verify(propertySourceLoaderMock).getFileExtensions();
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("DF", ""), atLeast(1));
				logMessage.verify(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any()));
			});
		}
	}

	//Sapient generated method id: ${815283ee-aa36-375f-bf63-34a40c84c280}, hash: FB99132F58EF19AEDC307C236C15F182
	@Disabled()
	@Test()
	void resolveWhenLocationIsOptional() throws ConfigDataNotFoundException {
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
		 * (for-each(references)) : true  #  inside resolve method
		 * (!this.resourceLoader.isPattern(reference.getResourceLocation())) : false  #  inside resolve method
		 * (for-each(this.resourceLoader.getResources(reference.getResourceLocation(), ResourceType.FILE))) : false  #  inside resolvePattern method
		 * (resolved.isEmpty()) : true  #  inside resolve method
		 * (for-each(references)) : true  #  inside resolveEmptyDirectories method
		 * (reference.getDirectory() != null) : true  #  inside resolveEmptyDirectories method
		 * (!this.resourceLoader.isPattern(reference.getResourceLocation())) : false  #  inside resolveEmptyDirectories method
		 * (!location.isOptional()) : false  #  inside resolvePatternEmptyDirectories method
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

	//Sapient generated method id: ${7125dca4-3032-36e5-9361-08a17b5d2a72}, hash: C8A8C730DCC41566681ADD2F05F8F581
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
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn("AG").when(configDataLocationMock).getNonPrefixedValue("resource:");
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] { "" };
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
			propertySourceLoaderList.add(propertySourceLoaderMock);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
			String[] stringArray3 = new String[] { "" };
			doReturn(stringArray3).when(propertySourceLoaderMock).getFileExtensions();
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.endsWithIgnoreCase("DF", "")).thenReturn(true);
			logMessage.when(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any())).thenReturn(logMessageMock);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			List<StandardConfigDataResource> result = target.resolve(configDataLocationResolverContextMock, locationMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				verify(locationMock).split();
				verify(configDataLocationMock).getNonPrefixedValue("resource:");
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
				verify(propertySourceLoaderMock).getFileExtensions();
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("DF", ""), atLeast(1));
				logMessage.verify(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any()));
			});
		}
	}

	//Sapient generated method id: ${6d92c240-37a1-3bc2-9065-896163fe280b}, hash: D157122CE198E090411CE2B750C903B3
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
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn("AH").when(configDataLocationMock).getNonPrefixedValue("resource:");
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] { "" };
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
			propertySourceLoaderList.add(propertySourceLoaderMock);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
			String[] stringArray3 = new String[] { "" };
			doReturn(stringArray3).when(propertySourceLoaderMock).getFileExtensions();
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.endsWithIgnoreCase("DG", "")).thenReturn(true);
			logMessage.when(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any())).thenReturn(logMessageMock);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			List<StandardConfigDataResource> result = target.resolve(configDataLocationResolverContextMock, locationMock);
			StandardConfigDataReference standardConfigDataReference = new StandardConfigDataReference(configDataLocationMock, (String) null, "D", "profile1", (String) null, propertySourceLoaderMock);
			StandardConfigDataResource standardConfigDataResource = new StandardConfigDataResource(standardConfigDataReference, resourceMock, true);
			List<StandardConfigDataResource> standardConfigDataResourceResultList = new ArrayList<>();
			standardConfigDataResourceResultList.add(standardConfigDataResource);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(standardConfigDataResourceResultList.size()));
				assertThat(result, containsInRelativeOrder(standardConfigDataResourceResultList.toArray()));
				verify(locationMock).split();
				verify(configDataLocationMock, atLeast(1)).getNonPrefixedValue("resource:");
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
				verify(propertySourceLoaderMock, atLeast(1)).getFileExtensions();
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("DG", ""), atLeast(1));
				logMessage.verify(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any()));
			});
		}
	}

	//Sapient generated method id: ${79aaac1c-ec17-3375-9c82-efdcc65d0edf}, hash: C631E2B1F27D06D0D47A1FDDFAE2AED2
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
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn("AG").when(configDataLocationMock).getNonPrefixedValue("resource:");
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] { "" };
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
			propertySourceLoaderList.add(propertySourceLoaderMock);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
			String[] stringArray3 = new String[] { "" };
			doReturn(stringArray3).when(propertySourceLoaderMock).getFileExtensions();
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.endsWithIgnoreCase("DF", "")).thenReturn(true);
			logMessage.when(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any())).thenReturn(logMessageMock);
			Resource[] resourceArray = new Resource[] {};
			objectUtils.when(() -> ObjectUtils.isEmpty(resourceArray)).thenReturn(true);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			final ConfigDataLocationNotFoundException result = assertThrows(ConfigDataLocationNotFoundException.class, () -> {
				target.resolve(configDataLocationResolverContextMock, locationMock);
			});
			StandardConfigDataReference standardConfigDataReference = new StandardConfigDataReference(configDataLocationMock, (String) null, "D", "profile1", (String) null, propertySourceLoaderMock);
			ConfigDataLocation configDataLocation = standardConfigDataReference.getConfigDataLocation();
			ConfigDataLocationNotFoundException configDataLocationNotFoundException = new ConfigDataLocationNotFoundException(configDataLocation, "Config data location 'null' contains no subdirectories", (Throwable) null);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(configDataLocationNotFoundException.getMessage()));
				verify(locationMock).split();
				verify(configDataLocationMock).getNonPrefixedValue("resource:");
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
				verify(propertySourceLoaderMock).getFileExtensions();
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("DF", ""), atLeast(1));
				logMessage.verify(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any()));
				objectUtils.verify(() -> ObjectUtils.isEmpty(resourceArray), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4405c74b-8b75-32f0-9690-2a9e01bf9787}, hash: 8EC557583D9171739C6197101D32EBDA
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
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn("AG").when(configDataLocationMock).getNonPrefixedValue("resource:");
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] { "" };
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
			propertySourceLoaderList.add(propertySourceLoaderMock);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
			String[] stringArray3 = new String[] { "" };
			doReturn(stringArray3).when(propertySourceLoaderMock).getFileExtensions();
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.endsWithIgnoreCase("DF", "")).thenReturn(true);
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
				verify(configDataLocationMock).getNonPrefixedValue("resource:");
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
				verify(propertySourceLoaderMock).getFileExtensions();
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("DF", ""), atLeast(1));
				logMessage.verify(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any()));
				objectUtils.verify(() -> ObjectUtils.isEmpty(resourceArray), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${d5a507f2-e922-378c-a66c-1b408cfdf339}, hash: 1DDBB5E932DEECA5D033CEF8657C7793
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

	//Sapient generated method id: ${0a687fcc-f632-3e29-bb65-081935001900}, hash: 77D81B27F212C7753E38D06AF3F672A7
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
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn("A").when(configDataLocationMock).getNonPrefixedValue("resource:");
			doReturn(false).when(configDataLocationMock).isOptional();
			doReturn(null).when(profilesMock).iterator();
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] { "B" };
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
			propertySourceLoaderList.add(propertySourceLoaderMock);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
			String[] stringArray3 = new String[] { "return_of_getFileExtensionsItem1" };
			doReturn(stringArray3).when(propertySourceLoaderMock).getFileExtensions();
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.endsWithIgnoreCase("CD", "return_of_getFileExtensionsItem1")).thenReturn(false);
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
				verify(configDataLocationMock).getNonPrefixedValue("resource:");
				verify(configDataLocationMock).isOptional();
				verify(profilesMock).iterator();
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
				verify(propertySourceLoaderMock).getFileExtensions();
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("CD", "return_of_getFileExtensionsItem1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f0d86c27-c261-3455-af6d-bda63befa3f3}, hash: 342C8AEF81885DA73A4634C4EFA87318
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

	//Sapient generated method id: ${fcd51614-9cdb-341a-82b4-f699336bd6c0}, hash: 6F0622B766AD20283774AFA36EEB49BE
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
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn("A").when(configDataLocationMock).getNonPrefixedValue("resource:");
			doReturn(null).when(profilesMock).iterator();
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] { "B" };
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
			propertySourceLoaderList.add(propertySourceLoaderMock);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
			String[] stringArray3 = new String[] { "G" };
			doReturn(stringArray3).when(propertySourceLoaderMock).getFileExtensions();
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.endsWithIgnoreCase("EF", "G")).thenReturn(true);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			List<StandardConfigDataResource> result = target.resolveProfileSpecific(configDataLocationResolverContextMock, locationMock, profilesMock);
			StandardConfigDataReference standardConfigDataReference = new StandardConfigDataReference(configDataLocationMock, (String) null, "", "profile1", (String) null, propertySourceLoaderMock);
			StandardConfigDataResource standardConfigDataResource = new StandardConfigDataResource(standardConfigDataReference, resourceMock);
			List<StandardConfigDataResource> standardConfigDataResourceResultList = new ArrayList<>();
			standardConfigDataResourceResultList.add(standardConfigDataResource);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(standardConfigDataResourceResultList.size()));
				assertThat(result, containsInRelativeOrder(standardConfigDataResourceResultList.toArray()));
				verify(locationMock).split();
				verify(configDataLocationMock, atLeast(1)).getNonPrefixedValue("resource:");
				verify(profilesMock).iterator();
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
				verify(propertySourceLoaderMock, atLeast(1)).getFileExtensions();
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("EF", "G"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${95f82988-c00b-3ed1-9160-a5ab3561ea13}, hash: 715EDEB6DAC2FB9D6B27E68454D52F21
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
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn("A").when(configDataLocationMock).getNonPrefixedValue("resource:");
			doReturn(null).when(profilesMock).iterator();
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] { "B" };
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
			propertySourceLoaderList.add(propertySourceLoaderMock);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
			String[] stringArray3 = new String[] { "G" };
			doReturn(stringArray3).when(propertySourceLoaderMock).getFileExtensions();
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.endsWithIgnoreCase("EF", "G")).thenReturn(true);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			List<StandardConfigDataResource> result = target.resolveProfileSpecific(configDataLocationResolverContextMock, locationMock, profilesMock);
			StandardConfigDataReference standardConfigDataReference = new StandardConfigDataReference(configDataLocationMock, (String) null, "", "profile1", (String) null, propertySourceLoaderMock);
			StandardConfigDataResource standardConfigDataResource = new StandardConfigDataResource(standardConfigDataReference, resourceMock);
			List<StandardConfigDataResource> standardConfigDataResourceResultList = new ArrayList<>();
			standardConfigDataResourceResultList.add(standardConfigDataResource);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(standardConfigDataResourceResultList.size()));
				assertThat(result, containsInRelativeOrder(standardConfigDataResourceResultList.toArray()));
				verify(locationMock).split();
				verify(configDataLocationMock, atLeast(1)).getNonPrefixedValue("resource:");
				verify(profilesMock).iterator();
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
				verify(propertySourceLoaderMock, atLeast(1)).getFileExtensions();
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("EF", "G"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${ca8e2e17-115d-323c-b585-43b734e6c3d5}, hash: F5597E09F9578AEF03851AE5D9E6D103
	@Disabled()
	@Test()
	void resolveProfileSpecificWhenReferenceIsSkippableAndResolvedIsEmptyAndReferencesIsNotEmptyAndReferenceGetDirectoryIsNull() {
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
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn("A").when(configDataLocationMock).getNonPrefixedValue("resource:");
			doReturn(null).when(profilesMock).iterator();
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] { "B" };
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
			propertySourceLoaderList.add(propertySourceLoaderMock);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
			String[] stringArray3 = new String[] { "G" };
			doReturn(stringArray3).when(propertySourceLoaderMock).getFileExtensions();
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.endsWithIgnoreCase("EF", "G")).thenReturn(true);
			logMessage.when(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any())).thenReturn(logMessageMock);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			List<StandardConfigDataResource> result = target.resolveProfileSpecific(configDataLocationResolverContextMock, locationMock, profilesMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				verify(locationMock).split();
				verify(configDataLocationMock).getNonPrefixedValue("resource:");
				verify(profilesMock).iterator();
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
				verify(propertySourceLoaderMock).getFileExtensions();
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("EF", "G"), atLeast(1));
				logMessage.verify(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any()));
			});
		}
	}

	//Sapient generated method id: ${923b281b-531f-39fa-8961-6432a1385816}, hash: 8F90014547B3A0DF9AB0EE10FB4A183A
	@Disabled()
	@Test()
	void resolveProfileSpecificWhenLocationIsOptional() {
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
		 * (for-each(references)) : true  #  inside resolve method
		 * (!this.resourceLoader.isPattern(reference.getResourceLocation())) : false  #  inside resolve method
		 * (for-each(this.resourceLoader.getResources(reference.getResourceLocation(), ResourceType.FILE))) : false  #  inside resolvePattern method
		 * (resolved.isEmpty()) : true  #  inside resolve method
		 * (for-each(references)) : true  #  inside resolveEmptyDirectories method
		 * (reference.getDirectory() != null) : true  #  inside resolveEmptyDirectories method
		 * (!this.resourceLoader.isPattern(reference.getResourceLocation())) : false  #  inside resolveEmptyDirectories method
		 * (!location.isOptional()) : false  #  inside resolvePatternEmptyDirectories method
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

	//Sapient generated method id: ${9ef64fea-c920-3f97-8855-bf3ee5d4dbec}, hash: 057BAF0C1514CE15485CFB174713C9F3
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
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn("A").when(configDataLocationMock).getNonPrefixedValue("resource:");
			doReturn(null).when(profilesMock).iterator();
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] { "B" };
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
			propertySourceLoaderList.add(propertySourceLoaderMock);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
			String[] stringArray3 = new String[] { "G" };
			doReturn(stringArray3).when(propertySourceLoaderMock).getFileExtensions();
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.endsWithIgnoreCase("EF", "G")).thenReturn(true);
			logMessage.when(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any())).thenReturn(logMessageMock);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			List<StandardConfigDataResource> result = target.resolveProfileSpecific(configDataLocationResolverContextMock, locationMock, profilesMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				verify(locationMock).split();
				verify(configDataLocationMock).getNonPrefixedValue("resource:");
				verify(profilesMock).iterator();
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
				verify(propertySourceLoaderMock).getFileExtensions();
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("EF", "G"), atLeast(1));
				logMessage.verify(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any()));
			});
		}
	}

	//Sapient generated method id: ${72b2cfa4-fe5b-3b34-bf73-489fee1445bf}, hash: 256CC50A4620B00D97D5A9D90D7F8ED2
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
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn("A").when(configDataLocationMock).getNonPrefixedValue("resource:");
			doReturn(null).when(profilesMock).iterator();
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] { "B" };
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
			propertySourceLoaderList.add(propertySourceLoaderMock);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
			String[] stringArray3 = new String[] { "G" };
			doReturn(stringArray3).when(propertySourceLoaderMock).getFileExtensions();
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.endsWithIgnoreCase("EF", "G")).thenReturn(true);
			logMessage.when(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any())).thenReturn(logMessageMock);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			List<StandardConfigDataResource> result = target.resolveProfileSpecific(configDataLocationResolverContextMock, locationMock, profilesMock);
			StandardConfigDataReference standardConfigDataReference = new StandardConfigDataReference(configDataLocationMock, (String) null, "", "profile1", (String) null, propertySourceLoaderMock);
			StandardConfigDataResource standardConfigDataResource = new StandardConfigDataResource(standardConfigDataReference, resourceMock, true);
			List<StandardConfigDataResource> standardConfigDataResourceResultList = new ArrayList<>();
			standardConfigDataResourceResultList.add(standardConfigDataResource);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(standardConfigDataResourceResultList.size()));
				assertThat(result, containsInRelativeOrder(standardConfigDataResourceResultList.toArray()));
				verify(locationMock).split();
				verify(configDataLocationMock, atLeast(1)).getNonPrefixedValue("resource:");
				verify(profilesMock).iterator();
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
				verify(propertySourceLoaderMock, atLeast(1)).getFileExtensions();
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("EF", "G"), atLeast(1));
				logMessage.verify(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any()));
			});
		}
	}

	//Sapient generated method id: ${821b1437-df7b-3e8d-8842-2ca7a2912590}, hash: E7673571CDE78E9D01688EDE788BAD4A
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
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn("A").when(configDataLocationMock).getNonPrefixedValue("resource:");
			doReturn(null).when(profilesMock).iterator();
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] { "B" };
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
			propertySourceLoaderList.add(propertySourceLoaderMock);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
			String[] stringArray3 = new String[] { "" };
			doReturn(stringArray3).when(propertySourceLoaderMock).getFileExtensions();
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.endsWithIgnoreCase("F", "")).thenReturn(true);
			logMessage.when(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any())).thenReturn(logMessageMock);
			Resource[] resourceArray = new Resource[] {};
			objectUtils.when(() -> ObjectUtils.isEmpty(resourceArray)).thenReturn(true);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			final ConfigDataLocationNotFoundException result = assertThrows(ConfigDataLocationNotFoundException.class, () -> {
				target.resolveProfileSpecific(configDataLocationResolverContextMock, locationMock, profilesMock);
			});
			StandardConfigDataReference standardConfigDataReference = new StandardConfigDataReference(configDataLocationMock, (String) null, "", "profile1", (String) null, propertySourceLoaderMock);
			ConfigDataLocation configDataLocation = standardConfigDataReference.getConfigDataLocation();
			ConfigDataLocationNotFoundException configDataLocationNotFoundException = new ConfigDataLocationNotFoundException(configDataLocation, "Config data location 'null' contains no subdirectories", (Throwable) null);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(configDataLocationNotFoundException.getMessage()));
				verify(locationMock).split();
				verify(configDataLocationMock).getNonPrefixedValue("resource:");
				verify(profilesMock).iterator();
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
				verify(propertySourceLoaderMock).getFileExtensions();
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("F", ""), atLeast(1));
				logMessage.verify(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any()));
				objectUtils.verify(() -> ObjectUtils.isEmpty(resourceArray), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c065a2d2-518c-33a4-86e0-c176910c864b}, hash: 3120A89DB3142BBC331B8A6ACBD14996
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
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn("A").when(configDataLocationMock).getNonPrefixedValue("resource:");
			doReturn(null).when(profilesMock).iterator();
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] { "B" };
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			List<PropertySourceLoader> propertySourceLoaderList = new ArrayList<>();
			propertySourceLoaderList.add(propertySourceLoaderMock);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any())).thenReturn(propertySourceLoaderList);
			String[] stringArray3 = new String[] { "G" };
			doReturn(stringArray3).when(propertySourceLoaderMock).getFileExtensions();
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.endsWithIgnoreCase("EF", "G")).thenReturn(true);
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
				verify(configDataLocationMock).getNonPrefixedValue("resource:");
				verify(profilesMock).iterator();
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.loadFactories(eq(PropertySourceLoader.class), (ClassLoader) any()));
				verify(propertySourceLoaderMock).getFileExtensions();
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				stringUtils.verify(() -> StringUtils.endsWithIgnoreCase("EF", "G"), atLeast(1));
				logMessage.verify(() -> LogMessage.format(eq("Skipping missing resource %s"), (StandardConfigDataReference) any()));
				objectUtils.verify(() -> ObjectUtils.isEmpty(resourceArray), atLeast(1));
			});
		}
	}
}
