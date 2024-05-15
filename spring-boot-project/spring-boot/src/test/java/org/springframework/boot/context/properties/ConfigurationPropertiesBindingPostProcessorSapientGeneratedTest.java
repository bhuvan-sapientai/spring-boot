package org.springframework.boot.context.properties;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.boot.context.properties.bind.BindResult;
import org.mockito.MockitoAnnotations;
import org.springframework.util.Assert;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.mockito.stubbing.Answer;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.boot.context.properties.bind.Bindable;
import org.mockito.MockedStatic;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.context.properties.bind.BindMethod;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.doThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertiesBindingPostProcessorSapientGeneratedTest {

    private final ApplicationContext applicationContextMock = mock(ApplicationContext.class, "applicationContext");

    private final ConfigurationPropertiesBinder binderMock = mock(ConfigurationPropertiesBinder.class, "binder");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private ConfigurationPropertiesBindingPostProcessor target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${afterPropertiesSetTest}, hash: B7DDF1688A4F95A540FBBAB3F984C62C
    @Disabled()
    @Test()
    void afterPropertiesSetTest() throws Exception, IllegalStateException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ConfigurationPropertiesBinder configurationPropertiesBinderMock = mock(ConfigurationPropertiesBinder.class);
        AutowireCapableBeanFactory autowireCapableBeanFactoryMock = mock(AutowireCapableBeanFactory.class);
        try (MockedStatic<ConfigurationPropertiesBinder> configurationPropertiesBinder = mockStatic(ConfigurationPropertiesBinder.class)) {
            configurationPropertiesBinder.when(() -> ConfigurationPropertiesBinder.get(applicationContextMock)).thenReturn(configurationPropertiesBinderMock);
            target = new ConfigurationPropertiesBindingPostProcessor();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(autowireCapableBeanFactoryMock).when(applicationContextMock).getAutowireCapableBeanFactory();
            //Act Statement(s)
            target.afterPropertiesSet();
            //Assert statement(s)
            assertAll("result", () -> {
                configurationPropertiesBinder.verify(() -> ConfigurationPropertiesBinder.get(applicationContextMock), atLeast(1));
                verify(applicationContextMock).getAutowireCapableBeanFactory();
            });
        }
    }

    //Sapient generated method id: ${getOrderTest}, hash: 0FF2CA204C3148CD9D17C0F5AC257CF8
    @Test()
    void getOrderTest() {
        //Arrange Statement(s)
        target = new ConfigurationPropertiesBindingPostProcessor();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        int result = target.getOrder();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-2147483647)));
    }

    //Sapient generated method id: ${postProcessBeforeInitializationWhenHasBoundValueObjectBeanName}, hash: AB610C46C2C347D0ED742D594592375A
    @Test()
    void postProcessBeforeInitializationWhenHasBoundValueObjectBeanName() throws Exception {
        /* Branches:
         * (BindMethod.VALUE_OBJECT.equals(BindMethodAttribute.get(this.registry, beanName))) : true  #  inside hasBoundValueObject method
         * (!hasBoundValueObject(beanName)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<BindMethodAttribute> bindMethodAttribute = mockStatic(BindMethodAttribute.class)) {
            bindMethodAttribute.when(() -> BindMethodAttribute.get((BeanDefinitionRegistry) null, "beanName1")).thenReturn(BindMethod.VALUE_OBJECT);
            target = new ConfigurationPropertiesBindingPostProcessor();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Object object = new Object();
            //Act Statement(s)
            Object result = target.postProcessBeforeInitialization(object, "beanName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                bindMethodAttribute.verify(() -> BindMethodAttribute.get((BeanDefinitionRegistry) null, "beanName1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${postProcessBeforeInitializationWhenBeanIsNull}, hash: 666C46AF666370A7FC3B00B2B22C9521
    @Disabled()
    @Test()
    void postProcessBeforeInitializationWhenBeanIsNull() throws Exception {
        /* Branches:
         * (BindMethod.VALUE_OBJECT.equals(BindMethodAttribute.get(this.registry, beanName))) : false  #  inside hasBoundValueObject method
         * (!hasBoundValueObject(beanName)) : true
         * (bean == null) : true  #  inside bind method
         */
        //Arrange Statement(s)
        try (MockedStatic<ConfigurationPropertiesBean> configurationPropertiesBean = mockStatic(ConfigurationPropertiesBean.class);
            MockedStatic<BindMethodAttribute> bindMethodAttribute = mockStatic(BindMethodAttribute.class)) {
            bindMethodAttribute.when(() -> BindMethodAttribute.get((BeanDefinitionRegistry) null, "beanName1")).thenReturn(BindMethod.JAVA_BEAN);
            Object object = new Object();
            configurationPropertiesBean.when(() -> ConfigurationPropertiesBean.get((ApplicationContext) null, object, "beanName1")).thenReturn(null);
            target = new ConfigurationPropertiesBindingPostProcessor();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            Object result = target.postProcessBeforeInitialization(object, "beanName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                bindMethodAttribute.verify(() -> BindMethodAttribute.get((BeanDefinitionRegistry) null, "beanName1"), atLeast(1));
                configurationPropertiesBean.verify(() -> ConfigurationPropertiesBean.get((ApplicationContext) null, object, "beanName1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${postProcessBeforeInitializationWhenBeanAsBindTargetGetBindMethodNotEqualsBindMethodVALUE_OBJECT}, hash: 72380FC86BD0B6F59B926AC8A891C335
    @Disabled()
    @Test()
    void postProcessBeforeInitializationWhenBeanAsBindTargetGetBindMethodNotEqualsBindMethodVALUE_OBJECT() throws Exception {
        /* Branches:
         * (BindMethod.VALUE_OBJECT.equals(BindMethodAttribute.get(this.registry, beanName))) : false  #  inside hasBoundValueObject method
         * (!hasBoundValueObject(beanName)) : true
         * (bean == null) : false  #  inside bind method
         * (bean.asBindTarget().getBindMethod() != BindMethod.VALUE_OBJECT) : true  #  inside bind method
         */
        //Arrange Statement(s)
        ConfigurationPropertiesBean configurationPropertiesBeanMock = mock(ConfigurationPropertiesBean.class);
        Bindable<?> bindableMock = mock(Bindable.class);
        BindResult<?> bindResultMock = mock(BindResult.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<ConfigurationPropertiesBean> configurationPropertiesBean = mockStatic(ConfigurationPropertiesBean.class);
            MockedStatic<BindMethodAttribute> bindMethodAttribute = mockStatic(BindMethodAttribute.class)) {
            bindMethodAttribute.when(() -> BindMethodAttribute.get((BeanDefinitionRegistry) null, "beanName1")).thenReturn(BindMethod.JAVA_BEAN);
            Object object = new Object();
            configurationPropertiesBean.when(() -> ConfigurationPropertiesBean.get((ApplicationContext) null, object, "beanName1")).thenReturn(configurationPropertiesBeanMock);
            doReturn(bindableMock).when(configurationPropertiesBeanMock).asBindTarget();
            doReturn(BindMethod.JAVA_BEAN).when(bindableMock).getBindMethod();
            doReturn("C").when(configurationPropertiesBeanMock).getName();
            _assert.when(() -> Assert.state(false, "Cannot bind @ConfigurationProperties for bean 'C'. Ensure that @ConstructorBinding has not been applied to regular bean")).thenAnswer((Answer<Void>) invocation -> null);
            target = new ConfigurationPropertiesBindingPostProcessor();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(bindResultMock).when(binderMock).bind(configurationPropertiesBeanMock);
            //Act Statement(s)
            Object result = target.postProcessBeforeInitialization(object, "beanName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                bindMethodAttribute.verify(() -> BindMethodAttribute.get((BeanDefinitionRegistry) null, "beanName1"), atLeast(1));
                configurationPropertiesBean.verify(() -> ConfigurationPropertiesBean.get((ApplicationContext) null, object, "beanName1"), atLeast(1));
                verify(configurationPropertiesBeanMock).asBindTarget();
                verify(bindableMock).getBindMethod();
                verify(configurationPropertiesBeanMock).getName();
                _assert.verify(() -> Assert.state(false, "Cannot bind @ConfigurationProperties for bean 'C'. Ensure that @ConstructorBinding has not been applied to regular bean"), atLeast(1));
                verify(binderMock).bind(configurationPropertiesBeanMock);
            });
        }
    }

    //Sapient generated method id: ${postProcessBeforeInitializationWhenBeanAsBindTargetGetBindMethodEqualsBindMethodVALUE_OBJECT}, hash: 808F70DDF60032662648E68B5D54AB11
    @Disabled()
    @Test()
    void postProcessBeforeInitializationWhenBeanAsBindTargetGetBindMethodEqualsBindMethodVALUE_OBJECT() throws Exception {
        /* Branches:
         * (BindMethod.VALUE_OBJECT.equals(BindMethodAttribute.get(this.registry, beanName))) : false  #  inside hasBoundValueObject method
         * (!hasBoundValueObject(beanName)) : true
         * (bean == null) : false  #  inside bind method
         * (bean.asBindTarget().getBindMethod() != BindMethod.VALUE_OBJECT) : false  #  inside bind method
         */
        //Arrange Statement(s)
        ConfigurationPropertiesBean configurationPropertiesBeanMock = mock(ConfigurationPropertiesBean.class);
        Bindable<?> bindableMock = mock(Bindable.class);
        BindResult<?> bindResultMock = mock(BindResult.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<ConfigurationPropertiesBean> configurationPropertiesBean = mockStatic(ConfigurationPropertiesBean.class);
            MockedStatic<BindMethodAttribute> bindMethodAttribute = mockStatic(BindMethodAttribute.class)) {
            bindMethodAttribute.when(() -> BindMethodAttribute.get((BeanDefinitionRegistry) null, "beanName1")).thenReturn(BindMethod.JAVA_BEAN);
            Object object = new Object();
            configurationPropertiesBean.when(() -> ConfigurationPropertiesBean.get((ApplicationContext) null, object, "beanName1")).thenReturn(configurationPropertiesBeanMock);
            doReturn(bindableMock).when(configurationPropertiesBeanMock).asBindTarget();
            doReturn(BindMethod.VALUE_OBJECT).when(bindableMock).getBindMethod();
            doReturn("C").when(configurationPropertiesBeanMock).getName();
            _assert.when(() -> Assert.state(false, "Cannot bind @ConfigurationProperties for bean 'C'. Ensure that @ConstructorBinding has not been applied to regular bean")).thenAnswer((Answer<Void>) invocation -> null);
            target = new ConfigurationPropertiesBindingPostProcessor();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(bindResultMock).when(binderMock).bind(configurationPropertiesBeanMock);
            //Act Statement(s)
            Object result = target.postProcessBeforeInitialization(object, "beanName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                bindMethodAttribute.verify(() -> BindMethodAttribute.get((BeanDefinitionRegistry) null, "beanName1"), atLeast(1));
                configurationPropertiesBean.verify(() -> ConfigurationPropertiesBean.get((ApplicationContext) null, object, "beanName1"), atLeast(1));
                verify(configurationPropertiesBeanMock).asBindTarget();
                verify(bindableMock).getBindMethod();
                verify(configurationPropertiesBeanMock).getName();
                _assert.verify(() -> Assert.state(false, "Cannot bind @ConfigurationProperties for bean 'C'. Ensure that @ConstructorBinding has not been applied to regular bean"), atLeast(1));
                verify(binderMock).bind(configurationPropertiesBeanMock);
            });
        }
    }

    //Sapient generated method id: ${postProcessBeforeInitializationWhenCaughtExceptionThrowsConfigurationPropertiesBindException}, hash: 1D337476D78A223A6B0E4FAF90F0FEF2
    @Disabled()
    @Test()
    void postProcessBeforeInitializationWhenCaughtExceptionThrowsConfigurationPropertiesBindException() throws BeansException {
        /* Branches:
         * (BindMethod.VALUE_OBJECT.equals(BindMethodAttribute.get(this.registry, beanName))) : false  #  inside hasBoundValueObject method
         * (!hasBoundValueObject(beanName)) : true
         * (bean == null) : false  #  inside bind method
         * (bean.asBindTarget().getBindMethod() != BindMethod.VALUE_OBJECT) : true  #  inside bind method
         * (catch-exception (Exception)) : true  #  inside bind method
         */
        //Arrange Statement(s)
        ConfigurationPropertiesBean configurationPropertiesBeanMock = mock(ConfigurationPropertiesBean.class);
        Bindable<?> bindableMock = mock(Bindable.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<ConfigurationPropertiesBean> configurationPropertiesBean = mockStatic(ConfigurationPropertiesBean.class);
            MockedStatic<BindMethodAttribute> bindMethodAttribute = mockStatic(BindMethodAttribute.class)) {
            bindMethodAttribute.when(() -> BindMethodAttribute.get((BeanDefinitionRegistry) null, "beanName1")).thenReturn(BindMethod.JAVA_BEAN);
            Object object = new Object();
            configurationPropertiesBean.when(() -> ConfigurationPropertiesBean.get((ApplicationContext) null, object, "beanName1")).thenReturn(configurationPropertiesBeanMock);
            doReturn(bindableMock).when(configurationPropertiesBeanMock).asBindTarget();
            doReturn(BindMethod.JAVA_BEAN).when(bindableMock).getBindMethod();
            doReturn("C").when(configurationPropertiesBeanMock).getName();
            _assert.when(() -> Assert.state(false, "Cannot bind @ConfigurationProperties for bean 'C'. Ensure that @ConstructorBinding has not been applied to regular bean")).thenAnswer((Answer<Void>) invocation -> null);
            target = new ConfigurationPropertiesBindingPostProcessor();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            RuntimeException runtimeException = new RuntimeException();
            doThrow(runtimeException).when(binderMock).bind(configurationPropertiesBeanMock);
            //Act Statement(s)
            final ConfigurationPropertiesBindException result = assertThrows(ConfigurationPropertiesBindException.class, () -> {
                target.postProcessBeforeInitialization(object, "beanName1");
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getCause(), is(instanceOf(runtimeException.getClass())));
                bindMethodAttribute.verify(() -> BindMethodAttribute.get((BeanDefinitionRegistry) null, "beanName1"), atLeast(1));
                configurationPropertiesBean.verify(() -> ConfigurationPropertiesBean.get((ApplicationContext) null, object, "beanName1"), atLeast(1));
                verify(configurationPropertiesBeanMock, atLeast(1)).asBindTarget();
                verify(bindableMock).getBindMethod();
                verify(configurationPropertiesBeanMock, atLeast(1)).getName();
                _assert.verify(() -> Assert.state(false, "Cannot bind @ConfigurationProperties for bean 'C'. Ensure that @ConstructorBinding has not been applied to regular bean"), atLeast(1));
                verify(binderMock).bind(configurationPropertiesBeanMock);
            });
        }
    }

    //Sapient generated method id: ${registerWhenRegistryNotContainsBeanDefinitionBEAN_NAME}, hash: B0FEA2170E53AA2DBBCBB27D862A1F23
    @Test()
    void registerWhenRegistryNotContainsBeanDefinitionBEAN_NAME() throws BeanDefinitionStoreException {
        /* Branches:
         * (!registry.containsBeanDefinition(BEAN_NAME)) : true
         */
        //Arrange Statement(s)
        BeanDefinitionRegistry registryMock = mock(BeanDefinitionRegistry.class);
        try (MockedStatic<ConfigurationPropertiesBinder> configurationPropertiesBinder = mockStatic(ConfigurationPropertiesBinder.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(false).when(registryMock).containsBeanDefinition("org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor");
            doNothing().when(registryMock).registerBeanDefinition(eq("org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor"), (BeanDefinition) any());
            _assert.when(() -> Assert.notNull(registryMock, "Registry must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            configurationPropertiesBinder.when(() -> ConfigurationPropertiesBinder.register(registryMock)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ConfigurationPropertiesBindingPostProcessor.register(registryMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(registryMock).containsBeanDefinition("org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor");
                verify(registryMock).registerBeanDefinition(eq("org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor"), (BeanDefinition) any());
                _assert.verify(() -> Assert.notNull(registryMock, "Registry must not be null"), atLeast(1));
                configurationPropertiesBinder.verify(() -> ConfigurationPropertiesBinder.register(registryMock), atLeast(1));
            });
        }
    }
}
