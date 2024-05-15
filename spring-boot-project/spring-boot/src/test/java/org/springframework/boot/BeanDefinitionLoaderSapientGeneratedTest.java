package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.ResourceLoader;
import org.mockito.stubbing.Answer;
import org.springframework.util.ClassUtils;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.util.Assert;
import org.springframework.core.io.Resource;
import org.mockito.MockedStatic;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BeanDefinitionLoaderSapientGeneratedTest {

    private final BeanDefinitionRegistry beanDefinitionRegistryMock = mock(BeanDefinitionRegistry.class);

    //Sapient generated method id: ${setBeanNameGeneratorTest}, hash: ACAA2097CE425D813A5C66C30826476D
    @Disabled()
    @Test()
    void setBeanNameGeneratorTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BeanNameGenerator beanNameGeneratorMock = mock(BeanNameGenerator.class);
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Object[] objectArray = new Object[] {};
            _assert.when(() -> Assert.notEmpty(objectArray, "Sources must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
            classUtils.when(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null)).thenReturn(true);
            BeanDefinitionLoader target = new BeanDefinitionLoader(beanDefinitionRegistryMock, objectArray);
            //Act Statement(s)
            target.setBeanNameGenerator(beanNameGeneratorMock);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notEmpty(objectArray, "Sources must not be empty"), atLeast(1));
                classUtils.verify(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${setResourceLoaderTest}, hash: 7883360627900958FB69D9E15B5E94AD
    @Disabled()
    @Test()
    void setResourceLoaderTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Object[] objectArray = new Object[] {};
            _assert.when(() -> Assert.notEmpty(objectArray, "Sources must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
            classUtils.when(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null)).thenReturn(true);
            BeanDefinitionLoader target = new BeanDefinitionLoader(beanDefinitionRegistryMock, objectArray);
            //Act Statement(s)
            target.setResourceLoader(resourceLoaderMock);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notEmpty(objectArray, "Sources must not be empty"), atLeast(1));
                classUtils.verify(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${setEnvironmentTest}, hash: 4177987D052D19E75EC97CF727464731
    @Disabled()
    @Test()
    void setEnvironmentTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Object[] objectArray = new Object[] {};
            _assert.when(() -> Assert.notEmpty(objectArray, "Sources must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
            classUtils.when(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null)).thenReturn(true);
            BeanDefinitionLoader target = new BeanDefinitionLoader(beanDefinitionRegistryMock, objectArray);
            //Act Statement(s)
            target.setEnvironment(configurableEnvironmentMock);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notEmpty(objectArray, "Sources must not be empty"), atLeast(1));
                classUtils.verify(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${loadWhenSourceInstanceOfClass_}, hash: 60E6BA7A5F4607657B88D06521768203
    @Disabled()
    @Test()
    void loadWhenSourceInstanceOfClass_() {
        /* Branches:
         * (for-each(this.sources)) : true
         * (source instanceof Class<?> clazz) : true  #  inside load method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            _assert.when(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Object[] objectArray = new Object[] { Object.class };
            _assert.when(() -> Assert.notEmpty(objectArray, "Sources must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
            classUtils.when(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null)).thenReturn(true);
            _assert.when(() -> Assert.notNull(Object.class, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            BeanDefinitionLoader target = new BeanDefinitionLoader(beanDefinitionRegistryMock, objectArray);
            //Act Statement(s)
            target.load();
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notEmpty(objectArray, "Sources must not be empty"), atLeast(1));
                classUtils.verify(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null), atLeast(1));
                _assert.verify(() -> Assert.notNull(Object.class, "Source must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${loadWhenSourceInstanceOfResource}, hash: 770E30DEA44809CFC4C36151EC8AFAA5
    @Disabled()
    @Test()
    void loadWhenSourceInstanceOfResource() {
        /* Branches:
         * (for-each(this.sources)) : true
         * (source instanceof Class<?> clazz) : false  #  inside load method
         * (source instanceof Resource resource) : true  #  inside load method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Resource resourceMock = mock(Resource.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            _assert.when(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Object[] objectArray = new Object[] { resourceMock };
            _assert.when(() -> Assert.notEmpty(objectArray, "Sources must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
            classUtils.when(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null)).thenReturn(true);
            _assert.when(() -> Assert.notNull(resourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            BeanDefinitionLoader target = new BeanDefinitionLoader(beanDefinitionRegistryMock, objectArray);
            //Act Statement(s)
            target.load();
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notEmpty(objectArray, "Sources must not be empty"), atLeast(1));
                classUtils.verify(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null), atLeast(1));
                _assert.verify(() -> Assert.notNull(resourceMock, "Source must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${loadWhenSourceInstanceOfPackage}, hash: 1F2F1F36EB849A37C6321AC3B164071F
    @Disabled()
    @Test()
    void loadWhenSourceInstanceOfPackage() {
        /* Branches:
         * (for-each(this.sources)) : true
         * (source instanceof Class<?> clazz) : false  #  inside load method
         * (source instanceof Resource resource) : false  #  inside load method
         * (source instanceof Package pack) : true  #  inside load method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            _assert.when(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Package _package = Package.getPackage("name1");
            Object[] objectArray = new Object[] { _package };
            _assert.when(() -> Assert.notEmpty(objectArray, "Sources must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
            classUtils.when(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null)).thenReturn(true);
            _assert.when(() -> Assert.notNull((Package) any(), eq("Source must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            BeanDefinitionLoader target = new BeanDefinitionLoader(beanDefinitionRegistryMock, objectArray);
            //Act Statement(s)
            target.load();
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notEmpty(objectArray, "Sources must not be empty"), atLeast(1));
                classUtils.verify(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null), atLeast(1));
                _assert.verify(() -> Assert.notNull((Package) any(), eq("Source must not be null")));
            });
        }
    }

    //Sapient generated method id: ${loadWhenSourceInstanceOfCharSequence}, hash: FE4C0F88E192A523F3418BB7CE523B51
    @Disabled()
    @Test()
    void loadWhenSourceInstanceOfCharSequence() {
        /* Branches:
         * (for-each(this.sources)) : true
         * (source instanceof Class<?> clazz) : false  #  inside load method
         * (source instanceof Resource resource) : false  #  inside load method
         * (source instanceof Package pack) : false  #  inside load method
         * (source instanceof CharSequence sequence) : true  #  inside load method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            _assert.when(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Object[] objectArray = new Object[] { "object1" };
            _assert.when(() -> Assert.notEmpty(objectArray, "Sources must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
            classUtils.when(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null)).thenReturn(true);
            _assert.when(() -> Assert.notNull("object1", "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            BeanDefinitionLoader target = new BeanDefinitionLoader(beanDefinitionRegistryMock, objectArray);
            //Act Statement(s)
            target.load();
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notEmpty(objectArray, "Sources must not be empty"), atLeast(1));
                classUtils.verify(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null), atLeast(1));
                _assert.verify(() -> Assert.notNull("object1", "Source must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${loadWhenSourceNotInstanceOfCharSequenceThrowsIllegalArgumentException}, hash: 1A7BABA455594B506A68830018553F45
    @Disabled()
    @Test()
    void loadWhenSourceNotInstanceOfCharSequenceThrowsIllegalArgumentException() {
        /* Branches:
         * (for-each(this.sources)) : true
         * (source instanceof Class<?> clazz) : false  #  inside load method
         * (source instanceof Resource resource) : false  #  inside load method
         * (source instanceof Package pack) : false  #  inside load method
         * (source instanceof CharSequence sequence) : false  #  inside load method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            _assert.when(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            Object[] objectArray = new Object[] { object };
            _assert.when(() -> Assert.notEmpty(objectArray, "Sources must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
            classUtils.when(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null)).thenReturn(true);
            _assert.when(() -> Assert.notNull(object, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            BeanDefinitionLoader target = new BeanDefinitionLoader(beanDefinitionRegistryMock, objectArray);
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                target.load();
            });
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid source type ");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
                _assert.verify(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notEmpty(objectArray, "Sources must not be empty"), atLeast(1));
                classUtils.verify(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null), atLeast(1));
                _assert.verify(() -> Assert.notNull(object, "Source must not be null"), atLeast(1));
            });
        }
    }
}
