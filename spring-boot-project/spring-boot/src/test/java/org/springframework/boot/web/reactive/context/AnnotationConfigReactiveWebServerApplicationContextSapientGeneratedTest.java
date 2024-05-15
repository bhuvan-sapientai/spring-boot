package org.springframework.boot.web.reactive.context;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.core.env.ConfigurableEnvironment;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.util.Assert;
import org.springframework.context.annotation.ScopeMetadataResolver;
import org.mockito.MockedStatic;
import org.springframework.util.ObjectUtils;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class AnnotationConfigReactiveWebServerApplicationContextSapientGeneratedTest {

    private final ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);

    private final DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);

    //Sapient generated method id: ${setEnvironmentTest}, hash: 143761F432ACED3EBA0D4392EDF9091D
    @Test()
    void setEnvironmentTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            AnnotationConfigReactiveWebServerApplicationContext target = new AnnotationConfigReactiveWebServerApplicationContext(defaultListableBeanFactoryMock);
            //Act Statement(s)
            target.setEnvironment(configurableEnvironmentMock);
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${setBeanNameGeneratorTest}, hash: 35E91323BFC138E497D024501D606B53
    @Test()
    void setBeanNameGeneratorTest() throws IllegalStateException {
        //Arrange Statement(s)
        BeanNameGenerator beanNameGeneratorMock = mock(BeanNameGenerator.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            AnnotationConfigReactiveWebServerApplicationContext target = spy(new AnnotationConfigReactiveWebServerApplicationContext(defaultListableBeanFactoryMock));
            doReturn(configurableListableBeanFactoryMock).when(target).getBeanFactory();
            doNothing().when(configurableListableBeanFactoryMock).registerSingleton("org.springframework.context.annotation.internalConfigurationBeanNameGenerator", beanNameGeneratorMock);
            //Act Statement(s)
            target.setBeanNameGenerator(beanNameGeneratorMock);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
                verify(target).getBeanFactory();
                verify(configurableListableBeanFactoryMock).registerSingleton("org.springframework.context.annotation.internalConfigurationBeanNameGenerator", beanNameGeneratorMock);
            });
        }
    }

    //Sapient generated method id: ${setScopeMetadataResolverTest}, hash: E64F6E00F0B68F9077A844DEE3FE294F
    @Test()
    void setScopeMetadataResolverTest() {
        //Arrange Statement(s)
        ScopeMetadataResolver scopeMetadataResolverMock = mock(ScopeMetadataResolver.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            AnnotationConfigReactiveWebServerApplicationContext target = new AnnotationConfigReactiveWebServerApplicationContext(defaultListableBeanFactoryMock);
            //Act Statement(s)
            target.setScopeMetadataResolver(scopeMetadataResolverMock);
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${registerTest}, hash: 9F60FEE1432E59AB665CCCAA6C8DB6B3
    @Test()
    void registerTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notEmpty(classArray, "At least one annotated class must be specified")).thenAnswer((Answer<Void>) invocation -> null);
            AnnotationConfigReactiveWebServerApplicationContext target = new AnnotationConfigReactiveWebServerApplicationContext(defaultListableBeanFactoryMock);
            //Act Statement(s)
            target.register(classArray);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notEmpty(classArray, "At least one annotated class must be specified"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${scanTest}, hash: B421C7C216A9312E6F70FC8BBA19B292
    @Test()
    void scanTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            String[] stringArray = new String[] {};
            _assert.when(() -> Assert.notEmpty(stringArray, "At least one base package must be specified")).thenAnswer((Answer<Void>) invocation -> null);
            AnnotationConfigReactiveWebServerApplicationContext target = new AnnotationConfigReactiveWebServerApplicationContext(defaultListableBeanFactoryMock);
            //Act Statement(s)
            target.scan(stringArray);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notEmpty(stringArray, "At least one base package must be specified"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${prepareRefreshTest}, hash: 0E31F5EFEEB31A611ED963F09991CF10
    @Test()
    void prepareRefreshTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: scanner - Method: clearCache
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            AnnotationConfigReactiveWebServerApplicationContext target = new AnnotationConfigReactiveWebServerApplicationContext(defaultListableBeanFactoryMock);
            //Act Statement(s)
            target.prepareRefresh();
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${postProcessBeanFactoryWhenThisAnnotatedClassesIsEmpty}, hash: 6AE6AB25746D74923E28E084247F414B
    @Test()
    void postProcessBeanFactoryWhenThisAnnotatedClassesIsEmpty() {
        /* Branches:
         * (!ObjectUtils.isEmpty(this.basePackages)) : false
         * (!this.annotatedClasses.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            AnnotationConfigReactiveWebServerApplicationContext target = new AnnotationConfigReactiveWebServerApplicationContext(defaultListableBeanFactoryMock);
            //Act Statement(s)
            target.postProcessBeanFactory(configurableListableBeanFactoryMock);
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1)));
        }
    }
}
