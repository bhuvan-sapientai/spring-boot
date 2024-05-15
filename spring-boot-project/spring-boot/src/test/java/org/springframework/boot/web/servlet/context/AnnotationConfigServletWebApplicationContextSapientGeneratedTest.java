package org.springframework.boot.web.servlet.context;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.core.env.ConfigurableEnvironment;
import org.mockito.stubbing.Answer;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import jakarta.servlet.ServletContext;
import org.springframework.util.Assert;
import org.springframework.context.annotation.ScopeMetadataResolver;
import java.util.function.Supplier;
import org.mockito.MockedStatic;
import org.springframework.util.ObjectUtils;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.BeanDefinitionCustomizer;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class AnnotationConfigServletWebApplicationContextSapientGeneratedTest {

    private final ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);

    private final DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);

    //Sapient generated method id: ${setEnvironmentTest}, hash: B304D1A303D5FEDC1C5E63D03B7A0754
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
            AnnotationConfigServletWebApplicationContext target = new AnnotationConfigServletWebApplicationContext(defaultListableBeanFactoryMock);
            //Act Statement(s)
            target.setEnvironment(configurableEnvironmentMock);
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${setBeanNameGeneratorTest}, hash: 8150A804ED9486781A308ED7277B32CC
    @Test()
    void setBeanNameGeneratorTest() throws IllegalStateException {
        //Arrange Statement(s)
        BeanNameGenerator beanNameGeneratorMock = mock(BeanNameGenerator.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            AnnotationConfigServletWebApplicationContext target = spy(new AnnotationConfigServletWebApplicationContext(defaultListableBeanFactoryMock));
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

    //Sapient generated method id: ${setScopeMetadataResolverTest}, hash: 2B94F82E2D4E260E9CE6DC8FC8171A50
    @Test()
    void setScopeMetadataResolverTest() {
        //Arrange Statement(s)
        ScopeMetadataResolver scopeMetadataResolverMock = mock(ScopeMetadataResolver.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            AnnotationConfigServletWebApplicationContext target = new AnnotationConfigServletWebApplicationContext(defaultListableBeanFactoryMock);
            //Act Statement(s)
            target.setScopeMetadataResolver(scopeMetadataResolverMock);
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${registerTest}, hash: 56462BCC8DB0338AD8DB9DE8E5FF6703
    @Test()
    void registerTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Class<?>[] classArray = new Class[] {};
            _assert.when(() -> Assert.notEmpty(classArray, "At least one annotated class must be specified")).thenAnswer((Answer<Void>) invocation -> null);
            AnnotationConfigServletWebApplicationContext target = new AnnotationConfigServletWebApplicationContext(defaultListableBeanFactoryMock);
            //Act Statement(s)
            target.register(classArray);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notEmpty(classArray, "At least one annotated class must be specified"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${scanTest}, hash: FC8FF3AE3CCFA13108C1FBD58D16E39B
    @Test()
    void scanTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            String[] stringArray = new String[] {};
            _assert.when(() -> Assert.notEmpty(stringArray, "At least one base package must be specified")).thenAnswer((Answer<Void>) invocation -> null);
            AnnotationConfigServletWebApplicationContext target = new AnnotationConfigServletWebApplicationContext(defaultListableBeanFactoryMock);
            //Act Statement(s)
            target.scan(stringArray);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notEmpty(stringArray, "At least one base package must be specified"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${prepareRefreshTest}, hash: 572BE2EE1236BA8F19598C36E8F6B276
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
            AnnotationConfigServletWebApplicationContext target = new AnnotationConfigServletWebApplicationContext(defaultListableBeanFactoryMock);
            //Act Statement(s)
            target.prepareRefresh();
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${postProcessBeanFactoryWhenThisAnnotatedClassesIsEmpty}, hash: 2C62B4CDC541C3FBFFC089BB4ACF7E20
    @Test()
    void postProcessBeanFactoryWhenThisAnnotatedClassesIsEmpty() {
        /* Branches:
         * (!ObjectUtils.isEmpty(this.basePackages)) : false
         * (!this.annotatedClasses.isEmpty()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<WebApplicationContextUtils> webApplicationContextUtils = mockStatic(WebApplicationContextUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationContextUtils.when(() -> WebApplicationContextUtils.registerWebApplicationScopes(configurableListableBeanFactoryMock, (ServletContext) null)).thenAnswer((Answer<Void>) invocation -> null);
            webApplicationContextUtils.when(() -> WebApplicationContextUtils.registerEnvironmentBeans(configurableListableBeanFactoryMock, (ServletContext) null)).thenAnswer((Answer<Void>) invocation -> null);
            AnnotationConfigServletWebApplicationContext target = new AnnotationConfigServletWebApplicationContext(defaultListableBeanFactoryMock);
            //Act Statement(s)
            target.postProcessBeanFactory(configurableListableBeanFactoryMock);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
                webApplicationContextUtils.verify(() -> WebApplicationContextUtils.registerWebApplicationScopes(configurableListableBeanFactoryMock, (ServletContext) null), atLeast(1));
                webApplicationContextUtils.verify(() -> WebApplicationContextUtils.registerEnvironmentBeans(configurableListableBeanFactoryMock, (ServletContext) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${registerBean5Test}, hash: A30EAA975C6225E8ED52B140F94F7E35
    @Test()
    void registerBean5Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: reader - Method: registerBean
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Supplier supplierMock = mock(Supplier.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            AnnotationConfigServletWebApplicationContext target = new AnnotationConfigServletWebApplicationContext(defaultListableBeanFactoryMock);
            BeanDefinitionCustomizer[] beanDefinitionCustomizerArray = new BeanDefinitionCustomizer[] {};
            //Act Statement(s)
            target.registerBean("beanName1", Object.class, supplierMock, beanDefinitionCustomizerArray);
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1)));
        }
    }
}
