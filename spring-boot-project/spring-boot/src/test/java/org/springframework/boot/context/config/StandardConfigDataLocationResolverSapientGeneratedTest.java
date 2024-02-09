package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.core.io.ResourceLoader;

import org.mockito.stubbing.Answer;

import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.util.Assert;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import org.springframework.boot.logging.DeferredLogFactory;
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

	private final ConfigDataLocationResolverContext configDataLocationResolverContextMock = mock(ConfigDataLocationResolverContext.class);

	private final ConfigDataResource configDataResourceMock = mock(ConfigDataResource.class);

	private final ConfigDataLocationResolverContext contextMock = mock(ConfigDataLocationResolverContext.class);

	private final ConfigDataLocation locationMock = mock(ConfigDataLocation.class);

	private final DeferredLogFactory logFactoryMock = mock(DeferredLogFactory.class);

	private final Profiles profilesMock = mock(Profiles.class);

	private final ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);

	private final StandardConfigDataReference standardConfigDataReferenceMock = mock(StandardConfigDataReference.class);

	private final StandardConfigDataResource standardConfigDataResourceMock = mock(StandardConfigDataResource.class);

	//Sapient generated method id: ${0bab2f51-0335-3cad-8d28-78925f74e38e}
	@Disabled()
	@Test()
	void isResolvableTest() {
		//Arrange Statement(s)
		ConfigDataLocation configDataLocationMock = mock(ConfigDataLocation.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] { "A" };
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			boolean result = target.isResolvable(configDataLocationResolverContextMock, configDataLocationMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
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
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
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
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
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
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${58dc558c-f00a-3374-8d11-59f79d984ae0}
	@Disabled()
	@Test()
	void resolveWhenConfigDataLocationNotIsOptionalThrowsIllegalStateException() throws ConfigDataNotFoundException {
		/* Branches:
		 * (for-each(configDataLocations)) : true  #  inside getReferences method
		 * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
		 * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
		 * (isAbsolute) : true  #  inside getResourceLocation method
		 * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
		 * (resourceLocation.endsWith(File.separator)) : false  #  inside isDirectory method
		 * (isDirectory(resourceLocation)) : false  #  inside getReferences method
		 * (extensionHintLocation) : true  #  inside getReferencesForFile method
		 * (for-each(this.propertySourceLoaders)) : false  #  inside getReferencesForFile method
		 * (configDataLocation.isOptional()) : false  #  inside getReferencesForFile method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
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
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
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
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
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
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(configDataResourceMock).when(contextMock).getParent();
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
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
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${19ed33cc-54d9-3a96-b086-a77c1dff99f3}
	@Disabled()
	@Test()
	void resolveWhenThisPropertySourceLoadersIsEmptyAndReferencesIsEmptyAndResolvedIsEmptyAndReferencesIsEmpty() throws ConfigDataNotFoundException {
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
		 * (for-each(references)) : false  #  inside resolve method
		 * (resolved.isEmpty()) : true  #  inside resolve method
		 * (for-each(references)) : false  #  inside resolveEmptyDirectories method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
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
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${e510bc32-be77-38f0-a669-867859c38855}
	@Disabled()
	@Test()
	void resolveWhenConfigDataLocationIsOptionalAndReferencesIsEmptyAndResolvedIsEmptyAndReferencesIsEmpty() throws ConfigDataNotFoundException {
		/* Branches:
		 * (for-each(configDataLocations)) : true  #  inside getReferences method
		 * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
		 * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
		 * (isAbsolute) : true  #  inside getResourceLocation method
		 * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
		 * (resourceLocation.endsWith(File.separator)) : false  #  inside isDirectory method
		 * (isDirectory(resourceLocation)) : false  #  inside getReferences method
		 * (extensionHintLocation) : true  #  inside getReferencesForFile method
		 * (for-each(this.propertySourceLoaders)) : false  #  inside getReferencesForFile method
		 * (configDataLocation.isOptional()) : true  #  inside getReferencesForFile method
		 * (for-each(references)) : false  #  inside resolve method
		 * (resolved.isEmpty()) : true  #  inside resolve method
		 * (for-each(references)) : false  #  inside resolveEmptyDirectories method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
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
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${658caf19-ddec-3ea8-8559-1f587a2b595b}
	@Disabled()
	@Test()
	void resolveProfileSpecificWhenConfigDataLocationNotIsOptionalThrowsIllegalStateException() {
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
		 * (for-each(this.propertySourceLoaders)) : false  #  inside getReferencesForFile method
		 * (configDataLocation.isOptional()) : false  #  inside getReferencesForFile method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn(null).when(profilesMock).iterator();
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
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
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
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
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
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
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
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
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
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
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${c13108ae-bfdb-3577-9c62-c0ed2ee45378}
	@Disabled()
	@Test()
	void resolveProfileSpecificWhenThisPropertySourceLoadersIsEmptyAndReferencesIsEmptyAndResolvedIsEmptyAndReferencesIsEmpty() {
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
		 * (for-each(this.propertySourceLoaders)) : false  #  inside getReferencesForConfigName method
		 * (for-each(references)) : false  #  inside resolve method
		 * (resolved.isEmpty()) : true  #  inside resolve method
		 * (for-each(references)) : false  #  inside resolveEmptyDirectories method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn(null).when(profilesMock).iterator();
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
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
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${f8ba7ed4-8401-3bdd-b62b-96effdbf4b09}
	@Disabled()
	@Test()
	void resolveProfileSpecificWhenConfigDataLocationIsOptionalAndReferencesIsEmptyAndResolvedIsEmptyAndReferencesIsEmpty() {
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
		 * (for-each(this.propertySourceLoaders)) : false  #  inside getReferencesForFile method
		 * (configDataLocation.isOptional()) : true  #  inside getReferencesForFile method
		 * (for-each(references)) : false  #  inside resolve method
		 * (resolved.isEmpty()) : true  #  inside resolve method
		 * (for-each(references)) : false  #  inside resolveEmptyDirectories method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn(null).when(profilesMock).iterator();
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
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
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
			});
		}
	}
}
