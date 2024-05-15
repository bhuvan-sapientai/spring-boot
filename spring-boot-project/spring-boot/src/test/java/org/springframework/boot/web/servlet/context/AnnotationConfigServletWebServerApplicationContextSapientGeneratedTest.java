package org.springframework.boot.web.servlet.context;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.core.env.ConfigurableEnvironment;
import org.mockito.stubbing.Answer;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.util.Assert;
import org.springframework.web.context.ServletContextAware;
import org.springframework.context.annotation.ScopeMetadataResolver;
import org.mockito.MockedStatic;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ObjectUtils;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class AnnotationConfigServletWebServerApplicationContextSapientGeneratedTest {

    private final ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);

    private final DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);

    //Sapient generated method id: ${setEnvironmentTest}, hash: 5C9B1E3D305DC95BE1325A9F29265833
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
            AnnotationConfigServletWebServerApplicationContext target = new AnnotationConfigServletWebServerApplicationContext(defaultListableBeanFactoryMock);
            //Act Statement(s)
            target.setEnvironment(configurableEnvironmentMock);
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${setBeanNameGeneratorTest}, hash: BF046F3843A767E428B057AEDFE53B3E
    @Test()
    void setBeanNameGeneratorTest() throws IllegalStateException {
        //Arrange Statement(s)
        BeanNameGenerator beanNameGeneratorMock = mock(BeanNameGenerator.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            AnnotationConfigServletWebServerApplicationContext target = spy(new AnnotationConfigServletWebServerApplicationContext(defaultListableBeanFactoryMock));
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

    //Sapient generated method id: ${setScopeMetadataResolverTest}, hash: 1FE2E1A408E41CBCC65A5CB57463A4D7
    @Test()
    void setScopeMetadataResolverTest() {
        //Arrange Statement(s)
        ScopeMetadataResolver scopeMetadataResolverMock = mock(ScopeMetadataResolver.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            AnnotationConfigServletWebServerApplicationContext target = new AnnotationConfigServletWebServerApplicationContext(defaultListableBeanFactoryMock);
            //Act Statement(s)
            target.setScopeMetadataResolver(scopeMetadataResolverMock);
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${registerTest}, hash: AEB1885040A191F1C31DB80E308D0303
    @Test()
    void registerTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notEmpty(classArray, "At least one annotated class must be specified")).thenAnswer((Answer<Void>) invocation -> null);
            AnnotationConfigServletWebServerApplicationContext target = new AnnotationConfigServletWebServerApplicationContext(defaultListableBeanFactoryMock);
            //Act Statement(s)
            target.register(classArray);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notEmpty(classArray, "At least one annotated class must be specified"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${scanTest}, hash: B399E9A8124482FE516D40D384C2D03D
    @Test()
    void scanTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            String[] stringArray = new String[] {};
            _assert.when(() -> Assert.notEmpty(stringArray, "At least one base package must be specified")).thenAnswer((Answer<Void>) invocation -> null);
            AnnotationConfigServletWebServerApplicationContext target = new AnnotationConfigServletWebServerApplicationContext(defaultListableBeanFactoryMock);
            //Act Statement(s)
            target.scan(stringArray);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notEmpty(stringArray, "At least one base package must be specified"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${prepareRefreshTest}, hash: AC10D0EB6E839D784782CFB19527A67D
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
            AnnotationConfigServletWebServerApplicationContext target = new AnnotationConfigServletWebServerApplicationContext(defaultListableBeanFactoryMock);
            //Act Statement(s)
            target.prepareRefresh();
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${postProcessBeanFactoryWhenThisAnnotatedClassesIsEmpty}, hash: 55E3746624FCD762619866E87990127E
    @Test()
    void postProcessBeanFactoryWhenThisAnnotatedClassesIsEmpty() throws IllegalStateException {
        /* Branches:
         * (this.basePackages != null) : false
         * (!this.annotatedClasses.isEmpty()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: existingScopes - Method: restore
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ConfigurableListableBeanFactory beanFactoryMock = mock(ConfigurableListableBeanFactory.class);
        ConfigurableListableBeanFactory configurableListableBeanFactoryMock2 = mock(ConfigurableListableBeanFactory.class);
        try (MockedStatic<WebApplicationContextUtils> webApplicationContextUtils = mockStatic(WebApplicationContextUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doNothing().when(beanFactoryMock).addBeanPostProcessor((BeanPostProcessor) any());
            doNothing().when(beanFactoryMock).ignoreDependencyInterface(ServletContextAware.class);
            _assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationContextUtils.when(() -> WebApplicationContextUtils.registerWebApplicationScopes(configurableListableBeanFactoryMock)).thenAnswer((Answer<Void>) invocation -> null);
            AnnotationConfigServletWebServerApplicationContext target = spy(new AnnotationConfigServletWebServerApplicationContext(defaultListableBeanFactoryMock));
            doReturn(configurableListableBeanFactoryMock2, configurableListableBeanFactoryMock).when(target).getBeanFactory();
            //Act Statement(s)
            target.postProcessBeanFactory(beanFactoryMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(beanFactoryMock).addBeanPostProcessor((BeanPostProcessor) any());
                verify(beanFactoryMock).ignoreDependencyInterface(ServletContextAware.class);
                _assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
                webApplicationContextUtils.verify(() -> WebApplicationContextUtils.registerWebApplicationScopes(configurableListableBeanFactoryMock), atLeast(1));
                verify(target, times(2)).getBeanFactory();
            });
        }
    }
}
