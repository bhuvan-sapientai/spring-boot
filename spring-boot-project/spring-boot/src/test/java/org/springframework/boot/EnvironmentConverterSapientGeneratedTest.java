package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.env.ConfigurableEnvironment;

import org.mockito.stubbing.Answer;

import org.springframework.util.ClassUtils;
import org.springframework.core.env.MutablePropertySources;

import org.mockito.MockedStatic;

import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Constructor;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class EnvironmentConverterSapientGeneratedTest {

	private final ConfigurableConversionService configurableConversionServiceMock = mock(ConfigurableConversionService.class, "ConfigurableConversionService");

	private final Constructor constructorMock = mock(Constructor.class);

	private final ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class);

	private final MutablePropertySources mutablePropertySourcesMock = mock(MutablePropertySources.class);

	//Sapient generated method id: ${ba2fe56d-459e-3724-81a1-e360b3e313a8}, hash: D613537C5266C1D8F52B13E0145E95F6
	@Test()
	void convertEnvironmentIfNecessaryWhenTypeEqualsEnvironmentGetClass() throws Throwable, Exception {
		/* Branches:
		 * (type.equals(environment.getClass())) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		EnvironmentConverter target = new EnvironmentConverter(classLoader);
		ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);

		//Act Statement(s)
		ConfigurableEnvironment result = target.convertEnvironmentIfNecessary(configurableEnvironmentMock, ConfigurableEnvironment.class);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(configurableEnvironmentMock)));
	}

	//Sapient generated method id: ${8056dcfb-bd9a-35a9-85c2-27f073a5deb9}, hash: DAEDA5DB2869F92B5A073A75AD2A4F3C
	@Test()
	void convertEnvironmentIfNecessaryWhenNamesIsEmptyAndSourceGetPropertySourcesIsEmpty() throws Throwable, Exception {
		/* Branches:
		 * (type.equals(environment.getClass())) : false
		 * (webEnvironmentClass.isAssignableFrom(conversionType)) : false  #  inside isServletEnvironment method
		 * (for-each(propertySources)) : false  #  inside removePropertySources method
		 * (for-each(names)) : false  #  inside removePropertySources method
		 * (for-each(source.getPropertySources())) : false  #  inside copyPropertySources method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class)) {
			String[] stringArray = new String[] {};
			doReturn(stringArray).when(environmentMock).getActiveProfiles();
			doReturn(configurableConversionServiceMock).when(environmentMock).getConversionService();
			doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
			doReturn(null).when(mutablePropertySourcesMock).iterator();
			reflectionUtils.when(() -> ReflectionUtils.makeAccessible(constructorMock)).thenAnswer((Answer<Void>) invocation -> null);
			classUtils.when(() -> ClassUtils.forName(eq("org.springframework.web.context.ConfigurableWebEnvironment"), (ClassLoader) any())).thenReturn(Object.class);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			EnvironmentConverter target = new EnvironmentConverter(classLoader);
			//Act Statement(s)
			ConfigurableEnvironment result = target.convertEnvironmentIfNecessary(environmentMock, ConfigurableEnvironment.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(environmentMock).getActiveProfiles();
				verify(environmentMock).getConversionService();
				verify(environmentMock).getPropertySources();
				verify(mutablePropertySourcesMock).iterator();
				reflectionUtils.verify(() -> ReflectionUtils.makeAccessible(constructorMock), atLeast(1));
				classUtils.verify(() -> ClassUtils.forName(eq("org.springframework.web.context.ConfigurableWebEnvironment"), (ClassLoader) any()));
			});
		}
	}

	//Sapient generated method id: ${3cf1a404-c561-323e-ac8d-dce587b19ca9}, hash: F5B4E4959C9DD573605B647F09CF01AE
	@Test()
	void convertEnvironmentIfNecessaryWhenSERVLET_ENVIRONMENT_SOURCE_NAMESNotContainsPropertySourceGetName() throws Throwable, Exception {
		/* Branches:
		 * (type.equals(environment.getClass())) : false
		 * (catch-exception (Exception)) : true  #  inside createEnvironment method
		 * (webEnvironmentClass.isAssignableFrom(conversionType)) : false  #  inside isServletEnvironment method
		 * (for-each(propertySources)) : false  #  inside removePropertySources method
		 * (for-each(names)) : false  #  inside removePropertySources method
		 * (for-each(source.getPropertySources())) : true  #  inside copyPropertySources method
		 * (!SERVLET_ENVIRONMENT_SOURCE_NAMES.contains(propertySource.getName())) : true  #  inside copyPropertySources method
		 */
		//Arrange Statement(s)
		MutablePropertySources mutablePropertySourcesMock = mock(MutablePropertySources.class, "MutablePropertySources");
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			String[] stringArray = new String[] {};
			doReturn(stringArray).when(environmentMock).getActiveProfiles();
			doReturn(configurableConversionServiceMock).when(environmentMock).getConversionService();
			doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
			doReturn(null).when(mutablePropertySourcesMock).iterator();
			classUtils.when(() -> ClassUtils.forName(eq("org.springframework.web.context.ConfigurableWebEnvironment"), (ClassLoader) any())).thenReturn(Object.class);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			EnvironmentConverter target = new EnvironmentConverter(classLoader);
			//Act Statement(s)
			ConfigurableEnvironment result = target.convertEnvironmentIfNecessary(environmentMock, SpringApplication.class);
			//Assert statement(s)
			//TODO: Please implement equals method in ApplicationEnvironment for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(environmentMock).getActiveProfiles();
				verify(environmentMock).getConversionService();
				verify(environmentMock).getPropertySources();
				verify(mutablePropertySourcesMock).iterator();
				classUtils.verify(() -> ClassUtils.forName(eq("org.springframework.web.context.ConfigurableWebEnvironment"), (ClassLoader) any()));
			});
		}
	}

	//Sapient generated method id: ${95ea7204-3e55-3749-a9ce-582d9cbd6e7a}, hash: E5E1C08D82FD7D32186A7036095983A5
	@Test()
	void convertEnvironmentIfNecessaryWhenSourceGetPropertySourcesIsNotEmptyAndSERVLET_ENVIRONMENT_SOURCE_NAMESNotContainsProper() throws Throwable, Exception {
		/* Branches:
		 * (type.equals(environment.getClass())) : false
		 * (catch-exception (Throwable)) : true  #  inside isServletEnvironment method
		 * (for-each(propertySources)) : true  #  inside removePropertySources method
		 * (for-each(names)) : true  #  inside removePropertySources method
		 * (!isServletEnvironment) : true  #  inside removePropertySources method
		 * (for-each(source.getPropertySources())) : true  #  inside copyPropertySources method
		 * (!SERVLET_ENVIRONMENT_SOURCE_NAMES.contains(propertySource.getName())) : true  #  inside copyPropertySources method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class)) {
			String[] stringArray = new String[] {};
			doReturn(stringArray).when(environmentMock).getActiveProfiles();
			doReturn(configurableConversionServiceMock).when(environmentMock).getConversionService();
			doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
			doReturn(null).when(mutablePropertySourcesMock).iterator();
			reflectionUtils.when(() -> ReflectionUtils.makeAccessible(constructorMock)).thenAnswer((Answer<Void>) invocation -> null);
			classUtils.when(() -> ClassUtils.forName(eq("org.springframework.web.context.ConfigurableWebEnvironment"), (ClassLoader) any())).thenReturn(Object.class);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			EnvironmentConverter target = new EnvironmentConverter(classLoader);
			//Act Statement(s)
			ConfigurableEnvironment result = target.convertEnvironmentIfNecessary(environmentMock, ConfigurableEnvironment.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(environmentMock).getActiveProfiles();
				verify(environmentMock).getConversionService();
				verify(environmentMock).getPropertySources();
				verify(mutablePropertySourcesMock).iterator();
				reflectionUtils.verify(() -> ReflectionUtils.makeAccessible(constructorMock), atLeast(1));
				classUtils.verify(() -> ClassUtils.forName(eq("org.springframework.web.context.ConfigurableWebEnvironment"), (ClassLoader) any()));
			});
		}
	}

	//Sapient generated method id: ${d4707fca-3cd5-37cd-b52a-9a1c774e8015}, hash: 66678B019FF9F930A0EC071FBD6038EF
	@Test()
	void convertEnvironmentIfNecessaryWhenSourceGetPropertySourcesIsNotEmptyAndSERVLET_ENVIRONMENT_SOURCE_NAMESNotContainsProper2() throws Throwable, Exception {
		/* Branches:
		 * (type.equals(environment.getClass())) : false
		 * (webEnvironmentClass.isAssignableFrom(conversionType)) : true  #  inside isServletEnvironment method
		 * (for-each(propertySources)) : true  #  inside removePropertySources method
		 * (for-each(names)) : true  #  inside removePropertySources method
		 * (!isServletEnvironment) : false  #  inside removePropertySources method
		 * (!SERVLET_ENVIRONMENT_SOURCE_NAMES.contains(name)) : true  #  inside removePropertySources method
		 * (for-each(source.getPropertySources())) : true  #  inside copyPropertySources method
		 * (!SERVLET_ENVIRONMENT_SOURCE_NAMES.contains(propertySource.getName())) : true  #  inside copyPropertySources method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class)) {
			String[] stringArray = new String[] {};
			doReturn(stringArray).when(environmentMock).getActiveProfiles();
			doReturn(configurableConversionServiceMock).when(environmentMock).getConversionService();
			doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
			doReturn(null).when(mutablePropertySourcesMock).iterator();
			reflectionUtils.when(() -> ReflectionUtils.makeAccessible(constructorMock)).thenAnswer((Answer<Void>) invocation -> null);
			classUtils.when(() -> ClassUtils.forName(eq("org.springframework.web.context.ConfigurableWebEnvironment"), (ClassLoader) any())).thenReturn(Object.class);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			EnvironmentConverter target = new EnvironmentConverter(classLoader);
			//Act Statement(s)
			ConfigurableEnvironment result = target.convertEnvironmentIfNecessary(environmentMock, Class.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(environmentMock).getActiveProfiles();
				verify(environmentMock).getConversionService();
				verify(environmentMock).getPropertySources();
				verify(mutablePropertySourcesMock).iterator();
				reflectionUtils.verify(() -> ReflectionUtils.makeAccessible(constructorMock), atLeast(1));
				classUtils.verify(() -> ClassUtils.forName(eq("org.springframework.web.context.ConfigurableWebEnvironment"), (ClassLoader) any()));
			});
		}
	}
}
