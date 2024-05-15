package org.springframework.boot.context.properties;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanDefinitionStoreException;
import java.util.List;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.boot.context.properties.bind.validation.ValidationBindHandler;
import org.springframework.boot.context.properties.bind.PropertySourcesPlaceholdersResolver;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.core.env.PropertySources;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.context.properties.bind.handler.IgnoreErrorsBindHandler;
import java.util.ArrayList;
import java.util.function.Consumer;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.boot.context.properties.bind.BindConstructorProvider;
import org.springframework.validation.Validator;
import org.springframework.boot.context.properties.bind.handler.NoUnboundElementsBindHandler;
import java.lang.annotation.Annotation;
import org.springframework.boot.context.properties.source.ConfigurationPropertySources;
import org.springframework.context.ApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.convert.ConversionService;
import org.springframework.boot.context.properties.source.ConfigurationPropertySource;
import org.springframework.beans.factory.BeanFactory;
import java.util.stream.Stream;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.source.UnboundElementsSourceFilter;
import java.util.function.Supplier;
import org.mockito.MockedStatic;
import org.springframework.boot.context.properties.bind.BindHandler;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.validation.annotation.Validated;
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
import static org.mockito.Mockito.atLeast;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertiesBinderSapientGeneratedTest {

    private final ApplicationContext applicationContextMock = mock(ApplicationContext.class, "applicationContext");

    private final Annotation annotationMock = mock(Annotation.class);

    private final Bindable<?> bindableMock = mock(Bindable.class);

    private final BoundConfigurationProperties boundConfigurationPropertiesMock = mock(BoundConfigurationProperties.class);

    private final ConfigurationProperties configurationPropertiesMock = mock(ConfigurationProperties.class);

    private final ObjectProvider objectProviderMock = mock(ObjectProvider.class);

    private final ConfigurationPropertiesBean propertiesBeanMock = mock(ConfigurationPropertiesBean.class);

    private final ResolvableType resolvableTypeMock = mock(ResolvableType.class);

    private final Stream streamMock = mock(Stream.class);

    private final Supplier supplierMock = mock(Supplier.class);

    private final Supplier supplierMock2 = mock(Supplier.class);

    private final Validator validatorMock = mock(Validator.class);

    //Sapient generated method id: ${bindWhenThisBinderIsNullAndThisApplicationContextNotInstanceOfConfigurableApplicationContext3}, hash: 44FDC7D729F6A1FF1C7A98D1CA19BCF9
    @Disabled()
    @Test()
    void bindWhenThisBinderIsNullAndThisApplicationContextNotInstanceOfConfigurableApplicationContext3() throws BeansException {
        /* Branches:
         * (this.configurationPropertiesValidator != null) : true  #  inside getValidators method
         * (this.jsr303Present) : true  #  inside getValidators method
         * (target.getAnnotation(Validated.class) != null) : true  #  inside getValidators method
         * (this.jsr303Validator == null) : true  #  inside getJsr303Validator method
         * (target.getValue() != null) : true  #  inside getSelfValidator method
         * (value instanceof Validator validator) : true  #  inside getSelfValidator method
         * (selfValidator != null) : true  #  inside getValidators method
         * (bound != null) : true  #  inside getHandler method
         * (annotation.ignoreInvalidFields()) : true  #  inside getBindHandler method
         * (!annotation.ignoreUnknownFields()) : true  #  inside getBindHandler method
         * (!validators.isEmpty()) : true  #  inside getBindHandler method
         * (for-each(getBindHandlerAdvisors())) : false  #  inside getBindHandler method
         * (this.binder == null) : true  #  inside getBinder method
         * (this.applicationContext instanceof ConfigurableApplicationContext configurableContext) : false  #  inside getPropertyEditorInitializer method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type PropertySourcesDeducer - Method: getPropertySources
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Validator validatorMock2 = mock(Validator.class);
        try (MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
            MockedStatic<BoundConfigurationProperties> boundConfigurationProperties = mockStatic(BoundConfigurationProperties.class);
            MockedStatic<ConfigurationPropertiesJsr303Validator> configurationPropertiesJsr303Validator = mockStatic(ConfigurationPropertiesJsr303Validator.class)) {
            doReturn(bindableMock).when(propertiesBeanMock).asBindTarget();
            doReturn(annotationMock).when(bindableMock).getAnnotation(Validated.class);
            doReturn(supplierMock, supplierMock2).when(bindableMock).getValue();
            doReturn(configurationPropertiesMock).when(propertiesBeanMock).getAnnotation();
            doReturn(true).when(configurationPropertiesMock).ignoreInvalidFields();
            doReturn(false).when(configurationPropertiesMock).ignoreUnknownFields();
            doReturn("return_of_prefix1").when(configurationPropertiesMock).prefix();
            doReturn(true).when(applicationContextMock).containsBean("configurationPropertiesValidator");
            doReturn(validatorMock).when(applicationContextMock).getBean("configurationPropertiesValidator", Validator.class);
            configurationPropertiesJsr303Validator.when(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock)).thenReturn(true);
            boundConfigurationProperties.when(() -> BoundConfigurationProperties.get(applicationContextMock)).thenReturn(boundConfigurationPropertiesMock);
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>();
            configurationPropertySources.when(() -> ConfigurationPropertySources.from((PropertySources) any())).thenReturn(iterable);
            ConfigurationPropertiesBinder target = new ConfigurationPropertiesBinder(applicationContextMock);
            doReturn(objectProviderMock).when(applicationContextMock).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
            doReturn(streamMock).when(objectProviderMock).orderedStream();
            //Act Statement(s)
            BindResult<?> result = target.bind(propertiesBeanMock);
            PropertySourcesDeducer propertySourcesDeducer = new PropertySourcesDeducer(applicationContextMock);
            PropertySources propertySources = propertySourcesDeducer.getPropertySources();
            PropertySourcesPlaceholdersResolver propertySourcesPlaceholdersResolver = new PropertySourcesPlaceholdersResolver(propertySources);
            List<ConversionService> conversionServiceList = new ArrayList<>();
            Binder binder = new Binder(iterable, propertySourcesPlaceholdersResolver, conversionServiceList, (Consumer) null, (BindHandler) null, (BindConstructorProvider) null);
            IgnoreErrorsBindHandler ignoreErrorsBindHandler = new IgnoreErrorsBindHandler((BindHandler) null);
            UnboundElementsSourceFilter unboundElementsSourceFilter = new UnboundElementsSourceFilter();
            NoUnboundElementsBindHandler noUnboundElementsBindHandler = new NoUnboundElementsBindHandler(ignoreErrorsBindHandler, unboundElementsSourceFilter);
            ConfigurationPropertiesJsr303Validator configurationPropertiesJsr303Validator2 = new ConfigurationPropertiesJsr303Validator(applicationContextMock);
            Validator[] validatorArray = new Validator[] { validatorMock, configurationPropertiesJsr303Validator2, validatorMock2 };
            ValidationBindHandler validationBindHandler = new ValidationBindHandler(noUnboundElementsBindHandler, validatorArray);
            BindResult bindResult = binder.bind("return_of_prefix1", bindableMock, validationBindHandler);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bindResult));
                verify(propertiesBeanMock).asBindTarget();
                verify(bindableMock, atLeast(1)).getAnnotation(Validated.class);
                verify(bindableMock, atLeast(2)).getValue();
                verify(propertiesBeanMock).getAnnotation();
                verify(configurationPropertiesMock).ignoreInvalidFields();
                verify(configurationPropertiesMock).ignoreUnknownFields();
                verify(configurationPropertiesMock).prefix();
                verify(applicationContextMock, atLeast(1)).containsBean("configurationPropertiesValidator");
                verify(applicationContextMock, atLeast(1)).getBean("configurationPropertiesValidator", Validator.class);
                configurationPropertiesJsr303Validator.verify(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock), atLeast(1));
                boundConfigurationProperties.verify(() -> BoundConfigurationProperties.get(applicationContextMock), atLeast(1));
                configurationPropertySources.verify(() -> ConfigurationPropertySources.from((PropertySources) any()));
                verify(applicationContextMock, atLeast(1)).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
                verify(objectProviderMock).orderedStream();
            });
        }
    }

    //Sapient generated method id: ${bindWhenThisBinderIsNullAndThisApplicationContextNotInstanceOfConfigurableApplicationContext9}, hash: 905ABA41062CBE49166CEBC0D8A139E6
    @Disabled()
    @Test()
    void bindWhenThisBinderIsNullAndThisApplicationContextNotInstanceOfConfigurableApplicationContext9() throws BeansException {
        /* Branches:
         * (this.configurationPropertiesValidator != null) : true  #  inside getValidators method
         * (this.jsr303Present) : true  #  inside getValidators method
         * (target.getAnnotation(Validated.class) != null) : true  #  inside getValidators method
         * (this.jsr303Validator == null) : true  #  inside getJsr303Validator method
         * (target.getValue() != null) : true  #  inside getSelfValidator method
         * (value instanceof Validator validator) : false  #  inside getSelfValidator method
         * (selfValidator != null) : false  #  inside getValidators method
         * (bound != null) : false  #  inside getHandler method
         * (annotation.ignoreInvalidFields()) : false  #  inside getBindHandler method
         * (!annotation.ignoreUnknownFields()) : false  #  inside getBindHandler method
         * (!validators.isEmpty()) : true  #  inside getBindHandler method
         * (for-each(getBindHandlerAdvisors())) : false  #  inside getBindHandler method
         * (this.binder == null) : true  #  inside getBinder method
         * (this.applicationContext instanceof ConfigurableApplicationContext configurableContext) : false  #  inside getPropertyEditorInitializer method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type PropertySourcesDeducer - Method: getPropertySources
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
            MockedStatic<BoundConfigurationProperties> boundConfigurationProperties = mockStatic(BoundConfigurationProperties.class);
            MockedStatic<ConfigurationPropertiesJsr303Validator> configurationPropertiesJsr303Validator = mockStatic(ConfigurationPropertiesJsr303Validator.class)) {
            doReturn(bindableMock).when(propertiesBeanMock).asBindTarget();
            doReturn(annotationMock).when(bindableMock).getAnnotation(Validated.class);
            doReturn(supplierMock, supplierMock2).when(bindableMock).getValue();
            doReturn(configurationPropertiesMock).when(propertiesBeanMock).getAnnotation();
            doReturn(false).when(configurationPropertiesMock).ignoreInvalidFields();
            doReturn(true).when(configurationPropertiesMock).ignoreUnknownFields();
            doReturn("return_of_prefix1").when(configurationPropertiesMock).prefix();
            doReturn(true).when(applicationContextMock).containsBean("configurationPropertiesValidator");
            doReturn(validatorMock).when(applicationContextMock).getBean("configurationPropertiesValidator", Validator.class);
            configurationPropertiesJsr303Validator.when(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock)).thenReturn(true);
            boundConfigurationProperties.when(() -> BoundConfigurationProperties.get(applicationContextMock)).thenReturn(null);
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>();
            configurationPropertySources.when(() -> ConfigurationPropertySources.from((PropertySources) any())).thenReturn(iterable);
            ConfigurationPropertiesBinder target = new ConfigurationPropertiesBinder(applicationContextMock);
            doReturn(objectProviderMock).when(applicationContextMock).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
            doReturn(streamMock).when(objectProviderMock).orderedStream();
            //Act Statement(s)
            BindResult<?> result = target.bind(propertiesBeanMock);
            PropertySourcesDeducer propertySourcesDeducer = new PropertySourcesDeducer(applicationContextMock);
            PropertySources propertySources = propertySourcesDeducer.getPropertySources();
            PropertySourcesPlaceholdersResolver propertySourcesPlaceholdersResolver = new PropertySourcesPlaceholdersResolver(propertySources);
            List<ConversionService> conversionServiceList = new ArrayList<>();
            Binder binder = new Binder(iterable, propertySourcesPlaceholdersResolver, conversionServiceList, (Consumer) null, (BindHandler) null, (BindConstructorProvider) null);
            ConfigurationPropertiesJsr303Validator configurationPropertiesJsr303Validator2 = new ConfigurationPropertiesJsr303Validator(applicationContextMock);
            Validator[] validatorArray = new Validator[] { validatorMock, configurationPropertiesJsr303Validator2 };
            ValidationBindHandler validationBindHandler = new ValidationBindHandler((BindHandler) null, validatorArray);
            BindResult bindResult = binder.bind("return_of_prefix1", bindableMock, validationBindHandler);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bindResult));
                verify(propertiesBeanMock).asBindTarget();
                verify(bindableMock, atLeast(1)).getAnnotation(Validated.class);
                verify(bindableMock, atLeast(2)).getValue();
                verify(propertiesBeanMock).getAnnotation();
                verify(configurationPropertiesMock).ignoreInvalidFields();
                verify(configurationPropertiesMock).ignoreUnknownFields();
                verify(configurationPropertiesMock).prefix();
                verify(applicationContextMock, atLeast(1)).containsBean("configurationPropertiesValidator");
                verify(applicationContextMock, atLeast(1)).getBean("configurationPropertiesValidator", Validator.class);
                configurationPropertiesJsr303Validator.verify(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock), atLeast(1));
                boundConfigurationProperties.verify(() -> BoundConfigurationProperties.get(applicationContextMock), atLeast(1));
                configurationPropertySources.verify(() -> ConfigurationPropertySources.from((PropertySources) any()));
                verify(applicationContextMock, atLeast(1)).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
                verify(objectProviderMock).orderedStream();
            });
        }
    }

    //Sapient generated method id: ${bindWhenThisBinderIsNullAndThisApplicationContextNotInstanceOfConfigurableApplicationContext10}, hash: 86795F787C400361DCEEE103FC109330
    @Disabled()
    @Test()
    void bindWhenThisBinderIsNullAndThisApplicationContextNotInstanceOfConfigurableApplicationContext10() throws BeansException {
        /* Branches:
         * (this.configurationPropertiesValidator != null) : true  #  inside getValidators method
         * (this.jsr303Present) : true  #  inside getValidators method
         * (target.getAnnotation(Validated.class) != null) : true  #  inside getValidators method
         * (this.jsr303Validator == null) : true  #  inside getJsr303Validator method
         * (target.getValue() != null) : false  #  inside getSelfValidator method
         * (Validator.class.isAssignableFrom(type)) : true  #  inside getSelfValidator method
         * (selfValidator != null) : true  #  inside getValidators method
         * (bound != null) : false  #  inside getHandler method
         * (annotation.ignoreInvalidFields()) : false  #  inside getBindHandler method
         * (!annotation.ignoreUnknownFields()) : false  #  inside getBindHandler method
         * (!validators.isEmpty()) : true  #  inside getBindHandler method
         * (for-each(getBindHandlerAdvisors())) : false  #  inside getBindHandler method
         * (this.binder == null) : true  #  inside getBinder method
         * (this.applicationContext instanceof ConfigurableApplicationContext configurableContext) : false  #  inside getPropertyEditorInitializer method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type PropertySourcesDeducer - Method: getPropertySources
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
            MockedStatic<BoundConfigurationProperties> boundConfigurationProperties = mockStatic(BoundConfigurationProperties.class);
            MockedStatic<ConfigurationPropertiesJsr303Validator> configurationPropertiesJsr303Validator = mockStatic(ConfigurationPropertiesJsr303Validator.class)) {
            doReturn(bindableMock).when(propertiesBeanMock).asBindTarget();
            doReturn(annotationMock).when(bindableMock).getAnnotation(Validated.class);
            doReturn(null).when(bindableMock).getValue();
            doReturn(resolvableTypeMock).when(bindableMock).getType();
            doReturn(Object.class).when(resolvableTypeMock).resolve();
            doReturn(configurationPropertiesMock).when(propertiesBeanMock).getAnnotation();
            doReturn(false).when(configurationPropertiesMock).ignoreInvalidFields();
            doReturn(true).when(configurationPropertiesMock).ignoreUnknownFields();
            doReturn("return_of_prefix1").when(configurationPropertiesMock).prefix();
            doReturn(true).when(applicationContextMock).containsBean("configurationPropertiesValidator");
            doReturn(validatorMock).when(applicationContextMock).getBean("configurationPropertiesValidator", Validator.class);
            configurationPropertiesJsr303Validator.when(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock)).thenReturn(true);
            boundConfigurationProperties.when(() -> BoundConfigurationProperties.get(applicationContextMock)).thenReturn(null);
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>();
            configurationPropertySources.when(() -> ConfigurationPropertySources.from((PropertySources) any())).thenReturn(iterable);
            ConfigurationPropertiesBinder target = new ConfigurationPropertiesBinder(applicationContextMock);
            doReturn(objectProviderMock).when(applicationContextMock).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
            doReturn(streamMock).when(objectProviderMock).orderedStream();
            //Act Statement(s)
            BindResult<?> result = target.bind(propertiesBeanMock);
            PropertySourcesDeducer propertySourcesDeducer = new PropertySourcesDeducer(applicationContextMock);
            PropertySources propertySources = propertySourcesDeducer.getPropertySources();
            PropertySourcesPlaceholdersResolver propertySourcesPlaceholdersResolver = new PropertySourcesPlaceholdersResolver(propertySources);
            List<ConversionService> conversionServiceList = new ArrayList<>();
            Binder binder = new Binder(iterable, propertySourcesPlaceholdersResolver, conversionServiceList, (Consumer) null, (BindHandler) null, (BindConstructorProvider) null);
            ConfigurationPropertiesJsr303Validator configurationPropertiesJsr303Validator2 = new ConfigurationPropertiesJsr303Validator(applicationContextMock);
            ConfigurationPropertiesBinder.SelfValidatingConstructorBoundBindableValidator configurationPropertiesBinderSelfValidatingConstructorBoundBindableValidator = new ConfigurationPropertiesBinder.SelfValidatingConstructorBoundBindableValidator(Object.class);
            Validator[] validatorArray = new Validator[] { validatorMock, configurationPropertiesJsr303Validator2, configurationPropertiesBinderSelfValidatingConstructorBoundBindableValidator };
            ValidationBindHandler validationBindHandler = new ValidationBindHandler((BindHandler) null, validatorArray);
            BindResult bindResult = binder.bind("return_of_prefix1", bindableMock, validationBindHandler);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bindResult));
                verify(propertiesBeanMock).asBindTarget();
                verify(bindableMock, atLeast(1)).getAnnotation(Validated.class);
                verify(bindableMock, atLeast(1)).getValue();
                verify(bindableMock, atLeast(1)).getType();
                verify(resolvableTypeMock).resolve();
                verify(propertiesBeanMock).getAnnotation();
                verify(configurationPropertiesMock).ignoreInvalidFields();
                verify(configurationPropertiesMock).ignoreUnknownFields();
                verify(configurationPropertiesMock).prefix();
                verify(applicationContextMock, atLeast(1)).containsBean("configurationPropertiesValidator");
                verify(applicationContextMock, atLeast(1)).getBean("configurationPropertiesValidator", Validator.class);
                configurationPropertiesJsr303Validator.verify(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock), atLeast(1));
                boundConfigurationProperties.verify(() -> BoundConfigurationProperties.get(applicationContextMock), atLeast(1));
                configurationPropertySources.verify(() -> ConfigurationPropertySources.from((PropertySources) any()));
                verify(applicationContextMock, atLeast(1)).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
                verify(objectProviderMock).orderedStream();
            });
        }
    }

    //Sapient generated method id: ${bindWhenThisBinderIsNullAndThisApplicationContextNotInstanceOfConfigurableApplicationContext11}, hash: 94A428B163BE5C91810C633122C499D0
    @Disabled()
    @Test()
    void bindWhenThisBinderIsNullAndThisApplicationContextNotInstanceOfConfigurableApplicationContext11() throws BeansException {
        /* Branches:
         * (this.configurationPropertiesValidator != null) : true  #  inside getValidators method
         * (this.jsr303Present) : true  #  inside getValidators method
         * (target.getAnnotation(Validated.class) != null) : true  #  inside getValidators method
         * (this.jsr303Validator == null) : true  #  inside getJsr303Validator method
         * (target.getValue() != null) : false  #  inside getSelfValidator method
         * (Validator.class.isAssignableFrom(type)) : false  #  inside getSelfValidator method
         * (selfValidator != null) : false  #  inside getValidators method
         * (bound != null) : false  #  inside getHandler method
         * (annotation.ignoreInvalidFields()) : false  #  inside getBindHandler method
         * (!annotation.ignoreUnknownFields()) : false  #  inside getBindHandler method
         * (!validators.isEmpty()) : true  #  inside getBindHandler method
         * (for-each(getBindHandlerAdvisors())) : false  #  inside getBindHandler method
         * (this.binder == null) : true  #  inside getBinder method
         * (this.applicationContext instanceof ConfigurableApplicationContext configurableContext) : false  #  inside getPropertyEditorInitializer method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type PropertySourcesDeducer - Method: getPropertySources
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
            MockedStatic<BoundConfigurationProperties> boundConfigurationProperties = mockStatic(BoundConfigurationProperties.class);
            MockedStatic<ConfigurationPropertiesJsr303Validator> configurationPropertiesJsr303Validator = mockStatic(ConfigurationPropertiesJsr303Validator.class)) {
            doReturn(bindableMock).when(propertiesBeanMock).asBindTarget();
            doReturn(annotationMock).when(bindableMock).getAnnotation(Validated.class);
            doReturn(null).when(bindableMock).getValue();
            doReturn(resolvableTypeMock).when(bindableMock).getType();
            doReturn(Object.class).when(resolvableTypeMock).resolve();
            doReturn(configurationPropertiesMock).when(propertiesBeanMock).getAnnotation();
            doReturn(false).when(configurationPropertiesMock).ignoreInvalidFields();
            doReturn(true).when(configurationPropertiesMock).ignoreUnknownFields();
            doReturn("return_of_prefix1").when(configurationPropertiesMock).prefix();
            doReturn(true).when(applicationContextMock).containsBean("configurationPropertiesValidator");
            doReturn(validatorMock).when(applicationContextMock).getBean("configurationPropertiesValidator", Validator.class);
            configurationPropertiesJsr303Validator.when(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock)).thenReturn(true);
            boundConfigurationProperties.when(() -> BoundConfigurationProperties.get(applicationContextMock)).thenReturn(null);
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>();
            configurationPropertySources.when(() -> ConfigurationPropertySources.from((PropertySources) any())).thenReturn(iterable);
            ConfigurationPropertiesBinder target = new ConfigurationPropertiesBinder(applicationContextMock);
            doReturn(objectProviderMock).when(applicationContextMock).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
            doReturn(streamMock).when(objectProviderMock).orderedStream();
            //Act Statement(s)
            BindResult<?> result = target.bind(propertiesBeanMock);
            PropertySourcesDeducer propertySourcesDeducer = new PropertySourcesDeducer(applicationContextMock);
            PropertySources propertySources = propertySourcesDeducer.getPropertySources();
            PropertySourcesPlaceholdersResolver propertySourcesPlaceholdersResolver = new PropertySourcesPlaceholdersResolver(propertySources);
            List<ConversionService> conversionServiceList = new ArrayList<>();
            Binder binder = new Binder(iterable, propertySourcesPlaceholdersResolver, conversionServiceList, (Consumer) null, (BindHandler) null, (BindConstructorProvider) null);
            ConfigurationPropertiesJsr303Validator configurationPropertiesJsr303Validator2 = new ConfigurationPropertiesJsr303Validator(applicationContextMock);
            Validator[] validatorArray = new Validator[] { validatorMock, configurationPropertiesJsr303Validator2 };
            ValidationBindHandler validationBindHandler = new ValidationBindHandler((BindHandler) null, validatorArray);
            BindResult bindResult = binder.bind("return_of_prefix1", bindableMock, validationBindHandler);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bindResult));
                verify(propertiesBeanMock).asBindTarget();
                verify(bindableMock, atLeast(1)).getAnnotation(Validated.class);
                verify(bindableMock, atLeast(1)).getValue();
                verify(bindableMock, atLeast(1)).getType();
                verify(resolvableTypeMock).resolve();
                verify(propertiesBeanMock).getAnnotation();
                verify(configurationPropertiesMock).ignoreInvalidFields();
                verify(configurationPropertiesMock).ignoreUnknownFields();
                verify(configurationPropertiesMock).prefix();
                verify(applicationContextMock, atLeast(1)).containsBean("configurationPropertiesValidator");
                verify(applicationContextMock, atLeast(1)).getBean("configurationPropertiesValidator", Validator.class);
                configurationPropertiesJsr303Validator.verify(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock), atLeast(1));
                boundConfigurationProperties.verify(() -> BoundConfigurationProperties.get(applicationContextMock), atLeast(1));
                configurationPropertySources.verify(() -> ConfigurationPropertySources.from((PropertySources) any()));
                verify(applicationContextMock, atLeast(1)).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
                verify(objectProviderMock).orderedStream();
            });
        }
    }

    //Sapient generated method id: ${bindOrCreateWhenThisBinderIsNullAndThisApplicationContextNotInstanceOfConfigurableApplicationContext3}, hash: 2A2D0F0D44125F41FE515FDE4A7E39DC
    @Disabled()
    @Test()
    void bindOrCreateWhenThisBinderIsNullAndThisApplicationContextNotInstanceOfConfigurableApplicationContext3() throws BeansException {
        /* Branches:
         * (this.configurationPropertiesValidator != null) : true  #  inside getValidators method
         * (this.jsr303Present) : true  #  inside getValidators method
         * (target.getAnnotation(Validated.class) != null) : true  #  inside getValidators method
         * (this.jsr303Validator == null) : true  #  inside getJsr303Validator method
         * (target.getValue() != null) : true  #  inside getSelfValidator method
         * (value instanceof Validator validator) : true  #  inside getSelfValidator method
         * (selfValidator != null) : true  #  inside getValidators method
         * (bound != null) : true  #  inside getHandler method
         * (annotation.ignoreInvalidFields()) : true  #  inside getBindHandler method
         * (!annotation.ignoreUnknownFields()) : true  #  inside getBindHandler method
         * (!validators.isEmpty()) : true  #  inside getBindHandler method
         * (for-each(getBindHandlerAdvisors())) : false  #  inside getBindHandler method
         * (this.binder == null) : true  #  inside getBinder method
         * (this.applicationContext instanceof ConfigurableApplicationContext configurableContext) : false  #  inside getPropertyEditorInitializer method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type PropertySourcesDeducer - Method: getPropertySources
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
            MockedStatic<BoundConfigurationProperties> boundConfigurationProperties = mockStatic(BoundConfigurationProperties.class);
            MockedStatic<ConfigurationPropertiesJsr303Validator> configurationPropertiesJsr303Validator = mockStatic(ConfigurationPropertiesJsr303Validator.class)) {
            doReturn(bindableMock).when(propertiesBeanMock).asBindTarget();
            doReturn(annotationMock).when(bindableMock).getAnnotation(Validated.class);
            doReturn(supplierMock, supplierMock2).when(bindableMock).getValue();
            doReturn(configurationPropertiesMock).when(propertiesBeanMock).getAnnotation();
            doReturn(true).when(configurationPropertiesMock).ignoreInvalidFields();
            doReturn(false).when(configurationPropertiesMock).ignoreUnknownFields();
            doReturn("return_of_prefix1").when(configurationPropertiesMock).prefix();
            doReturn(true).when(applicationContextMock).containsBean("configurationPropertiesValidator");
            doReturn(validatorMock).when(applicationContextMock).getBean("configurationPropertiesValidator", Validator.class);
            configurationPropertiesJsr303Validator.when(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock)).thenReturn(true);
            boundConfigurationProperties.when(() -> BoundConfigurationProperties.get(applicationContextMock)).thenReturn(boundConfigurationPropertiesMock);
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>();
            configurationPropertySources.when(() -> ConfigurationPropertySources.from((PropertySources) any())).thenReturn(iterable);
            ConfigurationPropertiesBinder target = new ConfigurationPropertiesBinder(applicationContextMock);
            doReturn(objectProviderMock).when(applicationContextMock).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
            doReturn(streamMock).when(objectProviderMock).orderedStream();
            //Act Statement(s)
            Object result = target.bindOrCreate(propertiesBeanMock);
            //Assert statement(s)
            //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(propertiesBeanMock).asBindTarget();
                verify(bindableMock, atLeast(1)).getAnnotation(Validated.class);
                verify(bindableMock, atLeast(2)).getValue();
                verify(propertiesBeanMock).getAnnotation();
                verify(configurationPropertiesMock).ignoreInvalidFields();
                verify(configurationPropertiesMock).ignoreUnknownFields();
                verify(configurationPropertiesMock).prefix();
                verify(applicationContextMock, atLeast(1)).containsBean("configurationPropertiesValidator");
                verify(applicationContextMock, atLeast(1)).getBean("configurationPropertiesValidator", Validator.class);
                configurationPropertiesJsr303Validator.verify(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock), atLeast(1));
                boundConfigurationProperties.verify(() -> BoundConfigurationProperties.get(applicationContextMock), atLeast(1));
                configurationPropertySources.verify(() -> ConfigurationPropertySources.from((PropertySources) any()));
                verify(applicationContextMock, atLeast(1)).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
                verify(objectProviderMock).orderedStream();
            });
        }
    }

    //Sapient generated method id: ${bindOrCreateWhenThisBinderIsNullAndThisApplicationContextNotInstanceOfConfigurableApplicationContext9}, hash: 9B94726BCD8541409CDFA436B464FA7D
    @Disabled()
    @Test()
    void bindOrCreateWhenThisBinderIsNullAndThisApplicationContextNotInstanceOfConfigurableApplicationContext9() throws BeansException {
        /* Branches:
         * (this.configurationPropertiesValidator != null) : true  #  inside getValidators method
         * (this.jsr303Present) : true  #  inside getValidators method
         * (target.getAnnotation(Validated.class) != null) : true  #  inside getValidators method
         * (this.jsr303Validator == null) : true  #  inside getJsr303Validator method
         * (target.getValue() != null) : true  #  inside getSelfValidator method
         * (value instanceof Validator validator) : false  #  inside getSelfValidator method
         * (selfValidator != null) : false  #  inside getValidators method
         * (bound != null) : false  #  inside getHandler method
         * (annotation.ignoreInvalidFields()) : false  #  inside getBindHandler method
         * (!annotation.ignoreUnknownFields()) : false  #  inside getBindHandler method
         * (!validators.isEmpty()) : true  #  inside getBindHandler method
         * (for-each(getBindHandlerAdvisors())) : false  #  inside getBindHandler method
         * (this.binder == null) : true  #  inside getBinder method
         * (this.applicationContext instanceof ConfigurableApplicationContext configurableContext) : false  #  inside getPropertyEditorInitializer method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type PropertySourcesDeducer - Method: getPropertySources
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
            MockedStatic<BoundConfigurationProperties> boundConfigurationProperties = mockStatic(BoundConfigurationProperties.class);
            MockedStatic<ConfigurationPropertiesJsr303Validator> configurationPropertiesJsr303Validator = mockStatic(ConfigurationPropertiesJsr303Validator.class)) {
            doReturn(bindableMock).when(propertiesBeanMock).asBindTarget();
            doReturn(annotationMock).when(bindableMock).getAnnotation(Validated.class);
            doReturn(supplierMock, supplierMock2).when(bindableMock).getValue();
            doReturn(configurationPropertiesMock).when(propertiesBeanMock).getAnnotation();
            doReturn(false).when(configurationPropertiesMock).ignoreInvalidFields();
            doReturn(true).when(configurationPropertiesMock).ignoreUnknownFields();
            doReturn("return_of_prefix1").when(configurationPropertiesMock).prefix();
            doReturn(true).when(applicationContextMock).containsBean("configurationPropertiesValidator");
            doReturn(validatorMock).when(applicationContextMock).getBean("configurationPropertiesValidator", Validator.class);
            configurationPropertiesJsr303Validator.when(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock)).thenReturn(true);
            boundConfigurationProperties.when(() -> BoundConfigurationProperties.get(applicationContextMock)).thenReturn(null);
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>();
            configurationPropertySources.when(() -> ConfigurationPropertySources.from((PropertySources) any())).thenReturn(iterable);
            ConfigurationPropertiesBinder target = new ConfigurationPropertiesBinder(applicationContextMock);
            doReturn(objectProviderMock).when(applicationContextMock).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
            doReturn(streamMock).when(objectProviderMock).orderedStream();
            //Act Statement(s)
            Object result = target.bindOrCreate(propertiesBeanMock);
            //Assert statement(s)
            //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(propertiesBeanMock).asBindTarget();
                verify(bindableMock, atLeast(1)).getAnnotation(Validated.class);
                verify(bindableMock, atLeast(2)).getValue();
                verify(propertiesBeanMock).getAnnotation();
                verify(configurationPropertiesMock).ignoreInvalidFields();
                verify(configurationPropertiesMock).ignoreUnknownFields();
                verify(configurationPropertiesMock).prefix();
                verify(applicationContextMock, atLeast(1)).containsBean("configurationPropertiesValidator");
                verify(applicationContextMock, atLeast(1)).getBean("configurationPropertiesValidator", Validator.class);
                configurationPropertiesJsr303Validator.verify(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock), atLeast(1));
                boundConfigurationProperties.verify(() -> BoundConfigurationProperties.get(applicationContextMock), atLeast(1));
                configurationPropertySources.verify(() -> ConfigurationPropertySources.from((PropertySources) any()));
                verify(applicationContextMock, atLeast(1)).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
                verify(objectProviderMock).orderedStream();
            });
        }
    }

    //Sapient generated method id: ${bindOrCreateWhenThisBinderIsNullAndThisApplicationContextNotInstanceOfConfigurableApplicationContext10}, hash: 3ED3233AE65DED77DAFD3E42DF5309C0
    @Disabled()
    @Test()
    void bindOrCreateWhenThisBinderIsNullAndThisApplicationContextNotInstanceOfConfigurableApplicationContext10() throws BeansException {
        /* Branches:
         * (this.configurationPropertiesValidator != null) : true  #  inside getValidators method
         * (this.jsr303Present) : true  #  inside getValidators method
         * (target.getAnnotation(Validated.class) != null) : true  #  inside getValidators method
         * (this.jsr303Validator == null) : true  #  inside getJsr303Validator method
         * (target.getValue() != null) : false  #  inside getSelfValidator method
         * (Validator.class.isAssignableFrom(type)) : true  #  inside getSelfValidator method
         * (selfValidator != null) : true  #  inside getValidators method
         * (bound != null) : false  #  inside getHandler method
         * (annotation.ignoreInvalidFields()) : false  #  inside getBindHandler method
         * (!annotation.ignoreUnknownFields()) : false  #  inside getBindHandler method
         * (!validators.isEmpty()) : true  #  inside getBindHandler method
         * (for-each(getBindHandlerAdvisors())) : false  #  inside getBindHandler method
         * (this.binder == null) : true  #  inside getBinder method
         * (this.applicationContext instanceof ConfigurableApplicationContext configurableContext) : false  #  inside getPropertyEditorInitializer method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type PropertySourcesDeducer - Method: getPropertySources
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
            MockedStatic<BoundConfigurationProperties> boundConfigurationProperties = mockStatic(BoundConfigurationProperties.class);
            MockedStatic<ConfigurationPropertiesJsr303Validator> configurationPropertiesJsr303Validator = mockStatic(ConfigurationPropertiesJsr303Validator.class)) {
            doReturn(bindableMock).when(propertiesBeanMock).asBindTarget();
            doReturn(annotationMock).when(bindableMock).getAnnotation(Validated.class);
            doReturn(null).when(bindableMock).getValue();
            doReturn(resolvableTypeMock).when(bindableMock).getType();
            doReturn(Object.class).when(resolvableTypeMock).resolve();
            doReturn(configurationPropertiesMock).when(propertiesBeanMock).getAnnotation();
            doReturn(false).when(configurationPropertiesMock).ignoreInvalidFields();
            doReturn(true).when(configurationPropertiesMock).ignoreUnknownFields();
            doReturn("return_of_prefix1").when(configurationPropertiesMock).prefix();
            doReturn(true).when(applicationContextMock).containsBean("configurationPropertiesValidator");
            doReturn(validatorMock).when(applicationContextMock).getBean("configurationPropertiesValidator", Validator.class);
            configurationPropertiesJsr303Validator.when(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock)).thenReturn(true);
            boundConfigurationProperties.when(() -> BoundConfigurationProperties.get(applicationContextMock)).thenReturn(null);
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>();
            configurationPropertySources.when(() -> ConfigurationPropertySources.from((PropertySources) any())).thenReturn(iterable);
            ConfigurationPropertiesBinder target = new ConfigurationPropertiesBinder(applicationContextMock);
            doReturn(objectProviderMock).when(applicationContextMock).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
            doReturn(streamMock).when(objectProviderMock).orderedStream();
            //Act Statement(s)
            Object result = target.bindOrCreate(propertiesBeanMock);
            //Assert statement(s)
            //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(propertiesBeanMock).asBindTarget();
                verify(bindableMock, atLeast(1)).getAnnotation(Validated.class);
                verify(bindableMock, atLeast(1)).getValue();
                verify(bindableMock, atLeast(1)).getType();
                verify(resolvableTypeMock).resolve();
                verify(propertiesBeanMock).getAnnotation();
                verify(configurationPropertiesMock).ignoreInvalidFields();
                verify(configurationPropertiesMock).ignoreUnknownFields();
                verify(configurationPropertiesMock).prefix();
                verify(applicationContextMock, atLeast(1)).containsBean("configurationPropertiesValidator");
                verify(applicationContextMock, atLeast(1)).getBean("configurationPropertiesValidator", Validator.class);
                configurationPropertiesJsr303Validator.verify(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock), atLeast(1));
                boundConfigurationProperties.verify(() -> BoundConfigurationProperties.get(applicationContextMock), atLeast(1));
                configurationPropertySources.verify(() -> ConfigurationPropertySources.from((PropertySources) any()));
                verify(applicationContextMock, atLeast(1)).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
                verify(objectProviderMock).orderedStream();
            });
        }
    }

    //Sapient generated method id: ${bindOrCreateWhenThisBinderIsNullAndThisApplicationContextNotInstanceOfConfigurableApplicationContext11}, hash: A4073C5EB0028B5E025E98E2B39FB303
    @Disabled()
    @Test()
    void bindOrCreateWhenThisBinderIsNullAndThisApplicationContextNotInstanceOfConfigurableApplicationContext11() throws BeansException {
        /* Branches:
         * (this.configurationPropertiesValidator != null) : true  #  inside getValidators method
         * (this.jsr303Present) : true  #  inside getValidators method
         * (target.getAnnotation(Validated.class) != null) : true  #  inside getValidators method
         * (this.jsr303Validator == null) : true  #  inside getJsr303Validator method
         * (target.getValue() != null) : false  #  inside getSelfValidator method
         * (Validator.class.isAssignableFrom(type)) : false  #  inside getSelfValidator method
         * (selfValidator != null) : false  #  inside getValidators method
         * (bound != null) : false  #  inside getHandler method
         * (annotation.ignoreInvalidFields()) : false  #  inside getBindHandler method
         * (!annotation.ignoreUnknownFields()) : false  #  inside getBindHandler method
         * (!validators.isEmpty()) : true  #  inside getBindHandler method
         * (for-each(getBindHandlerAdvisors())) : false  #  inside getBindHandler method
         * (this.binder == null) : true  #  inside getBinder method
         * (this.applicationContext instanceof ConfigurableApplicationContext configurableContext) : false  #  inside getPropertyEditorInitializer method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type PropertySourcesDeducer - Method: getPropertySources
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
            MockedStatic<BoundConfigurationProperties> boundConfigurationProperties = mockStatic(BoundConfigurationProperties.class);
            MockedStatic<ConfigurationPropertiesJsr303Validator> configurationPropertiesJsr303Validator = mockStatic(ConfigurationPropertiesJsr303Validator.class)) {
            doReturn(bindableMock).when(propertiesBeanMock).asBindTarget();
            doReturn(annotationMock).when(bindableMock).getAnnotation(Validated.class);
            doReturn(null).when(bindableMock).getValue();
            doReturn(resolvableTypeMock).when(bindableMock).getType();
            doReturn(Object.class).when(resolvableTypeMock).resolve();
            doReturn(configurationPropertiesMock).when(propertiesBeanMock).getAnnotation();
            doReturn(false).when(configurationPropertiesMock).ignoreInvalidFields();
            doReturn(true).when(configurationPropertiesMock).ignoreUnknownFields();
            doReturn("return_of_prefix1").when(configurationPropertiesMock).prefix();
            doReturn(true).when(applicationContextMock).containsBean("configurationPropertiesValidator");
            doReturn(validatorMock).when(applicationContextMock).getBean("configurationPropertiesValidator", Validator.class);
            configurationPropertiesJsr303Validator.when(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock)).thenReturn(true);
            boundConfigurationProperties.when(() -> BoundConfigurationProperties.get(applicationContextMock)).thenReturn(null);
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>();
            configurationPropertySources.when(() -> ConfigurationPropertySources.from((PropertySources) any())).thenReturn(iterable);
            ConfigurationPropertiesBinder target = new ConfigurationPropertiesBinder(applicationContextMock);
            doReturn(objectProviderMock).when(applicationContextMock).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
            doReturn(streamMock).when(objectProviderMock).orderedStream();
            //Act Statement(s)
            Object result = target.bindOrCreate(propertiesBeanMock);
            //Assert statement(s)
            //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(propertiesBeanMock).asBindTarget();
                verify(bindableMock, atLeast(1)).getAnnotation(Validated.class);
                verify(bindableMock, atLeast(1)).getValue();
                verify(bindableMock, atLeast(1)).getType();
                verify(resolvableTypeMock).resolve();
                verify(propertiesBeanMock).getAnnotation();
                verify(configurationPropertiesMock).ignoreInvalidFields();
                verify(configurationPropertiesMock).ignoreUnknownFields();
                verify(configurationPropertiesMock).prefix();
                verify(applicationContextMock, atLeast(1)).containsBean("configurationPropertiesValidator");
                verify(applicationContextMock, atLeast(1)).getBean("configurationPropertiesValidator", Validator.class);
                configurationPropertiesJsr303Validator.verify(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock), atLeast(1));
                boundConfigurationProperties.verify(() -> BoundConfigurationProperties.get(applicationContextMock), atLeast(1));
                configurationPropertySources.verify(() -> ConfigurationPropertySources.from((PropertySources) any()));
                verify(applicationContextMock, atLeast(1)).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
                verify(objectProviderMock).orderedStream();
            });
        }
    }

    //Sapient generated method id: ${registerWhenRegistryNotContainsBeanDefinitionBEAN_NAME}, hash: 9F3A2995392EEB89140DA656DBCB7398
    @Test()
    void registerWhenRegistryNotContainsBeanDefinitionBEAN_NAME() throws BeanDefinitionStoreException {
        /* Branches:
         * (!registry.containsBeanDefinition(BEAN_NAME)) : true
         */
        //Arrange Statement(s)
        BeanDefinitionRegistry registryMock = mock(BeanDefinitionRegistry.class);
        doReturn(false).when(registryMock).containsBeanDefinition("org.springframework.boot.context.internalConfigurationPropertiesBinder");
        doNothing().when(registryMock).registerBeanDefinition(eq("org.springframework.boot.context.internalConfigurationPropertiesBinder"), (BeanDefinition) any());
        //Act Statement(s)
        ConfigurationPropertiesBinder.register(registryMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(registryMock).containsBeanDefinition("org.springframework.boot.context.internalConfigurationPropertiesBinder");
            verify(registryMock).registerBeanDefinition(eq("org.springframework.boot.context.internalConfigurationPropertiesBinder"), (BeanDefinition) any());
        });
    }

    //Sapient generated method id: ${getTest}, hash: 70152A5EC2A3B526FA8BFD199513E858
    @Test()
    void getTest() throws BeansException {
        //Arrange Statement(s)
        BeanFactory beanFactoryMock = mock(BeanFactory.class);
        ConfigurationPropertiesBinder configurationPropertiesBinderMock = mock(ConfigurationPropertiesBinder.class);
        doReturn(configurationPropertiesBinderMock).when(beanFactoryMock).getBean("org.springframework.boot.context.internalConfigurationPropertiesBinder", ConfigurationPropertiesBinder.class);
        //Act Statement(s)
        ConfigurationPropertiesBinder result = ConfigurationPropertiesBinder.get(beanFactoryMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(configurationPropertiesBinderMock));
            verify(beanFactoryMock).getBean("org.springframework.boot.context.internalConfigurationPropertiesBinder", ConfigurationPropertiesBinder.class);
        });
    }
}
