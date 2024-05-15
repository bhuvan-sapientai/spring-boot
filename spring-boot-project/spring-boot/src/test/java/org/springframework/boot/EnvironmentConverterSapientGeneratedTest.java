package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.springframework.core.env.ConfigurableEnvironment;
import org.mockito.stubbing.Answer;
import org.springframework.util.ClassUtils;
import java.util.Iterator;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;
import org.mockito.MockedStatic;
import java.util.ArrayList;
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
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class EnvironmentConverterSapientGeneratedTest {

    private final ConfigurableConversionService configurableConversionServiceMock = mock(ConfigurableConversionService.class);

    private final ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);

    private final Constructor constructorMock = mock(Constructor.class);

    private final ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class);

    private final MutablePropertySources mutablePropertySourcesMock = mock(MutablePropertySources.class);

    //Sapient generated method id: ${convertEnvironmentIfNecessaryWhenTypeEqualsEnvironmentGetClass}, hash: FACCEFCAC24C1160640B91DD4DE61766
    @Disabled()
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
        //Act Statement(s)
        ConfigurableEnvironment result = target.convertEnvironmentIfNecessary(configurableEnvironmentMock, ConfigurableEnvironment.class);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(configurableEnvironmentMock)));
    }

    //Sapient generated method id: ${convertEnvironmentIfNecessaryWhenNamesIsEmptyAndSourceGetPropertySourcesIsEmpty}, hash: 73C3A2E47E2BEA3E29821A58EFBFA396
    @Disabled()
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
            List<PropertySource<?>> anyList = new ArrayList<>();
            Iterator<PropertySource<?>> iterator = anyList.iterator();
            doReturn(iterator).when(mutablePropertySourcesMock).iterator();
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

    //Sapient generated method id: ${convertEnvironmentIfNecessaryWhenSERVLET_ENVIRONMENT_SOURCE_NAMESNotContainsPropertySourceGetName}, hash: 26F11DE4FF4017332D102DE24A4FCCF3
    @Disabled()
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
            PropertySource propertySource = PropertySource.named("");
            List<PropertySource<?>> anyList = new ArrayList<>();
            anyList.add(propertySource);
            Iterator<PropertySource<?>> iterator = anyList.iterator();
            doReturn(iterator).when(mutablePropertySourcesMock).iterator();
            reflectionUtils.when(() -> ReflectionUtils.makeAccessible(constructorMock)).thenAnswer((Answer<Void>) invocation -> null);
            Object[] objectArray = new Object[] {};
            doReturn(configurableEnvironmentMock).when(constructorMock).newInstance(objectArray);
            classUtils.when(() -> ClassUtils.forName(eq("org.springframework.web.context.ConfigurableWebEnvironment"), (ClassLoader) any())).thenReturn(Object.class);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            EnvironmentConverter target = new EnvironmentConverter(classLoader);
            //Act Statement(s)
            ConfigurableEnvironment result = target.convertEnvironmentIfNecessary(environmentMock, ConfigurableEnvironment.class);
            //Assert statement(s)
            //TODO: Please implement equals method in ApplicationEnvironment for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(environmentMock).getActiveProfiles();
                verify(environmentMock).getConversionService();
                verify(environmentMock).getPropertySources();
                verify(mutablePropertySourcesMock).iterator();
                reflectionUtils.verify(() -> ReflectionUtils.makeAccessible(constructorMock), atLeast(1));
                verify(constructorMock).newInstance(objectArray);
                classUtils.verify(() -> ClassUtils.forName(eq("org.springframework.web.context.ConfigurableWebEnvironment"), (ClassLoader) any()));
            });
        }
    }

    //Sapient generated method id: ${convertEnvironmentIfNecessaryWhenSourceGetPropertySourcesIsNotEmptyAndSERVLET_ENVIRONMENT_SOURCE_NAMESNotContainsProper}, hash: 788D5ACA27264C21D0F56D3860D4B875
    @Disabled()
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
            PropertySource propertySource = PropertySource.named("A");
            List<PropertySource<?>> anyList = new ArrayList<>();
            anyList.add(propertySource);
            Iterator<PropertySource<?>> iterator = anyList.iterator();
            doReturn(iterator).when(mutablePropertySourcesMock).iterator();
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

    //Sapient generated method id: ${convertEnvironmentIfNecessaryWhenSourceGetPropertySourcesIsNotEmptyAndSERVLET_ENVIRONMENT_SOURCE_NAMESNotContainsProper2}, hash: E59BF95B86715F97A3DF6BD12C8A2D27
    @Disabled()
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
            PropertySource propertySource = PropertySource.named("B");
            List<PropertySource<?>> anyList = new ArrayList<>();
            anyList.add(propertySource);
            Iterator<PropertySource<?>> iterator = anyList.iterator();
            doReturn(iterator).when(mutablePropertySourcesMock).iterator();
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
}
