package org.springframework.boot.web.servlet;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanDefinitionStoreException;
import java.util.EnumSet;
import jakarta.servlet.DispatcherType;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.util.StringUtils;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import java.util.Map;
import java.util.HashMap;
import org.mockito.MockedStatic;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.config.BeanDefinition;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class WebFilterHandlerSapientGeneratedTest {

    private final BeanDefinitionBuilder beanDefinitionBuilderMock = mock(BeanDefinitionBuilder.class);

    private final BeanDefinitionBuilder beanDefinitionBuilderMock2 = mock(BeanDefinitionBuilder.class);

    private final BeanDefinitionBuilder beanDefinitionBuilderMock3 = mock(BeanDefinitionBuilder.class);

    private final BeanDefinitionBuilder beanDefinitionBuilderMock4 = mock(BeanDefinitionBuilder.class);

    private final BeanDefinitionBuilder beanDefinitionBuilderMock5 = mock(BeanDefinitionBuilder.class);

    private final BeanDefinitionBuilder beanDefinitionBuilderMock6 = mock(BeanDefinitionBuilder.class);

    private final BeanDefinitionBuilder beanDefinitionBuilderMock7 = mock(BeanDefinitionBuilder.class);

    private final AnnotatedBeanDefinition beanDefinitionMock = mock(AnnotatedBeanDefinition.class);

    private final BeanDefinitionBuilder builderMock = mock(BeanDefinitionBuilder.class);

    private final BeanDefinitionRegistry registryMock = mock(BeanDefinitionRegistry.class);

    //Sapient generated method id: ${doHandleWhenStringUtilsHasTextAttributesGetFilterName}, hash: ECF71E0155FB1CD2998BCE388A1954AD
    @Disabled()
    @Test()
    void doHandleWhenStringUtilsHasTextAttributesGetFilterName() throws BeanDefinitionStoreException {
        /* Branches:
         * (dispatcherTypes.length == 0) : true  #  inside extractDispatcherTypes method
         * (StringUtils.hasText((String) attributes.get("filterName"))) : true  #  inside determineName method
         */
        //Arrange Statement(s)
        AnnotatedBeanDefinition annotatedBeanDefinitionMock = mock(AnnotatedBeanDefinition.class);
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<BeanDefinitionBuilder> beanDefinitionBuilder = mockStatic(BeanDefinitionBuilder.class)) {
            doNothing().when(registryMock).registerBeanDefinition(eq(""), (BeanDefinition) any());
            Object object = new Object();
            doReturn(beanDefinitionBuilderMock).when(builderMock).addPropertyValue("asyncSupported", object);
            EnumSet<DispatcherType> dispatcherTypeSet = EnumSet.noneOf(DispatcherType.class);
            BeanDefinitionBuilder beanDefinitionBuilder2 = builderMock.addPropertyValue("dispatcherTypes", dispatcherTypeSet);
            doReturn(beanDefinitionBuilder2).when(builderMock).addPropertyValue("dispatcherTypes", dispatcherTypeSet);
            doReturn(beanDefinitionBuilderMock2).when(builderMock).addPropertyValue("filter", annotatedBeanDefinitionMock);
            Map<String, String> stringStringMap = new HashMap<>();
            doReturn(beanDefinitionBuilderMock3).when(builderMock).addPropertyValue(eq("initParameters"), eq(stringStringMap));
            doReturn(beanDefinitionBuilderMock4).when(builderMock).addPropertyValue("name", "");
            Object object2 = new Object();
            doReturn(beanDefinitionBuilderMock5).when(builderMock).addPropertyValue("servletNames", object2);
            String[] stringArray = new String[] {};
            doReturn(beanDefinitionBuilderMock6).when(builderMock).addPropertyValue("urlPatterns", stringArray);
            AbstractBeanDefinition abstractBeanDefinition = builderMock.getBeanDefinition();
            doReturn(abstractBeanDefinition).when(builderMock).getBeanDefinition();
            beanDefinitionBuilder.when(() -> BeanDefinitionBuilder.rootBeanDefinition(FilterRegistrationBean.class)).thenReturn(builderMock);
            stringUtils.when(() -> StringUtils.hasText("")).thenReturn(true);
            WebFilterHandler target = spy(new WebFilterHandler());
            DispatcherType[] dispatcherTypeArray = new DispatcherType[] {};
            Map<String, Object> stringObjectMap = new HashMap<>();
            stringObjectMap.put("asyncSupported", object);
            stringObjectMap.put("dispatcherTypes", dispatcherTypeArray);
            stringObjectMap.put("servletNames", object2);
            stringObjectMap.put("filterName", "");
            doReturn(stringStringMap).when(target).extractInitParameters(eq(stringObjectMap));
            doReturn(stringArray).when(target).extractUrlPatterns(eq(stringObjectMap));
            //Act Statement(s)
            target.doHandle(stringObjectMap, annotatedBeanDefinitionMock, registryMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(registryMock).registerBeanDefinition(eq(""), (BeanDefinition) any());
                verify(builderMock).addPropertyValue("asyncSupported", object);
                verify(builderMock).addPropertyValue("dispatcherTypes", dispatcherTypeSet);
                verify(builderMock).addPropertyValue("filter", annotatedBeanDefinitionMock);
                verify(builderMock).addPropertyValue(eq("initParameters"), eq(stringStringMap));
                verify(builderMock).addPropertyValue("name", "");
                verify(builderMock).addPropertyValue("servletNames", object2);
                verify(builderMock).addPropertyValue("urlPatterns", stringArray);
                verify(builderMock).getBeanDefinition();
                beanDefinitionBuilder.verify(() -> BeanDefinitionBuilder.rootBeanDefinition(FilterRegistrationBean.class), atLeast(1));
                stringUtils.verify(() -> StringUtils.hasText(""), atLeast(1));
                verify(target).extractInitParameters(eq(stringObjectMap));
                verify(target).extractUrlPatterns(eq(stringObjectMap));
            });
        }
    }

    //Sapient generated method id: ${doHandleWhenDispatcherTypesLengthEquals1AndStringUtilsNotHasTextAttributesGetFilterName}, hash: 9D2DE7AD76975EE8FC9C039147D82931
    @Disabled()
    @Test()
    void doHandleWhenDispatcherTypesLengthEquals1AndStringUtilsNotHasTextAttributesGetFilterName() throws BeanDefinitionStoreException {
        /* Branches:
         * (dispatcherTypes.length == 0) : false  #  inside extractDispatcherTypes method
         * (dispatcherTypes.length == 1) : true  #  inside extractDispatcherTypes method
         * (StringUtils.hasText((String) attributes.get("filterName"))) : false  #  inside determineName method
         */
        //Arrange Statement(s)
        try (MockedStatic<BeanDefinitionBuilder> beanDefinitionBuilder = mockStatic(BeanDefinitionBuilder.class)) {
            doReturn("return_of_getBeanClassName1").when(beanDefinitionMock).getBeanClassName();
            doNothing().when(registryMock).registerBeanDefinition(eq("return_of_getBeanClassName1"), (BeanDefinition) any());
            Object object = new Object();
            doReturn(beanDefinitionBuilderMock).when(builderMock).addPropertyValue("asyncSupported", object);
            EnumSet<DispatcherType> dispatcherTypeSet = EnumSet.noneOf(DispatcherType.class);
            dispatcherTypeSet.add(DispatcherType.FORWARD);
            doReturn(beanDefinitionBuilderMock2).when(builderMock).addPropertyValue("dispatcherTypes", dispatcherTypeSet);
            doReturn(beanDefinitionBuilderMock3).when(builderMock).addPropertyValue("filter", beanDefinitionMock);
            Map<String, String> stringStringMap = new HashMap<>();
            doReturn(beanDefinitionBuilderMock4).when(builderMock).addPropertyValue(eq("initParameters"), eq(stringStringMap));
            doReturn(beanDefinitionBuilderMock5).when(builderMock).addPropertyValue("name", "return_of_getBeanClassName1");
            Object object2 = new Object();
            doReturn(beanDefinitionBuilderMock6).when(builderMock).addPropertyValue("servletNames", object2);
            String[] stringArray = new String[] {};
            doReturn(beanDefinitionBuilderMock7).when(builderMock).addPropertyValue("urlPatterns", stringArray);
            AbstractBeanDefinition abstractBeanDefinition = builderMock.getBeanDefinition();
            doReturn(abstractBeanDefinition).when(builderMock).getBeanDefinition();
            beanDefinitionBuilder.when(() -> BeanDefinitionBuilder.rootBeanDefinition(FilterRegistrationBean.class)).thenReturn(builderMock);
            WebFilterHandler target = spy(new WebFilterHandler());
            DispatcherType[] dispatcherTypeArray = new DispatcherType[] { DispatcherType.FORWARD };
            Map<String, Object> stringObjectMap = new HashMap<>();
            stringObjectMap.put("filterName", "");
            stringObjectMap.put("servletNames", object2);
            stringObjectMap.put("asyncSupported", object);
            stringObjectMap.put("dispatcherTypes", dispatcherTypeArray);
            doReturn(stringStringMap).when(target).extractInitParameters(eq(stringObjectMap));
            doReturn(stringArray).when(target).extractUrlPatterns(eq(stringObjectMap));
            //Act Statement(s)
            target.doHandle(stringObjectMap, beanDefinitionMock, registryMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(beanDefinitionMock).getBeanClassName();
                verify(registryMock).registerBeanDefinition(eq("return_of_getBeanClassName1"), (BeanDefinition) any());
                verify(builderMock).addPropertyValue("asyncSupported", object);
                verify(builderMock).addPropertyValue("dispatcherTypes", dispatcherTypeSet);
                verify(builderMock).addPropertyValue("filter", beanDefinitionMock);
                verify(builderMock).addPropertyValue(eq("initParameters"), eq(stringStringMap));
                verify(builderMock).addPropertyValue("name", "return_of_getBeanClassName1");
                verify(builderMock).addPropertyValue("servletNames", object2);
                verify(builderMock).addPropertyValue("urlPatterns", stringArray);
                verify(builderMock).getBeanDefinition();
                beanDefinitionBuilder.verify(() -> BeanDefinitionBuilder.rootBeanDefinition(FilterRegistrationBean.class), atLeast(1));
                verify(target).extractInitParameters(eq(stringObjectMap));
                verify(target).extractUrlPatterns(eq(stringObjectMap));
            });
        }
    }

    //Sapient generated method id: ${doHandleWhenDispatcherTypesLengthNotEquals1AndStringUtilsNotHasTextAttributesGetFilterName}, hash: D5EF495D8CAD22DF3451CF5B213F8C97
    @Disabled()
    @Test()
    void doHandleWhenDispatcherTypesLengthNotEquals1AndStringUtilsNotHasTextAttributesGetFilterName() throws BeanDefinitionStoreException {
        /* Branches:
         * (dispatcherTypes.length == 0) : false  #  inside extractDispatcherTypes method
         * (dispatcherTypes.length == 1) : false  #  inside extractDispatcherTypes method
         * (StringUtils.hasText((String) attributes.get("filterName"))) : false  #  inside determineName method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<BeanDefinitionBuilder> beanDefinitionBuilder = mockStatic(BeanDefinitionBuilder.class)) {
            doReturn("return_of_getBeanClassName1").when(beanDefinitionMock).getBeanClassName();
            doNothing().when(registryMock).registerBeanDefinition(eq("return_of_getBeanClassName1"), (BeanDefinition) any());
            Object object = new Object();
            doReturn(beanDefinitionBuilderMock).when(builderMock).addPropertyValue("asyncSupported", object);
            EnumSet<DispatcherType> dispatcherTypeSet = EnumSet.noneOf(DispatcherType.class);
            dispatcherTypeSet.add(DispatcherType.FORWARD);
            doReturn(beanDefinitionBuilderMock2).when(builderMock).addPropertyValue("dispatcherTypes", dispatcherTypeSet);
            doReturn(beanDefinitionBuilderMock3).when(builderMock).addPropertyValue("filter", beanDefinitionMock);
            Map<String, String> stringStringMap = new HashMap<>();
            doReturn(beanDefinitionBuilderMock4).when(builderMock).addPropertyValue(eq("initParameters"), eq(stringStringMap));
            doReturn(beanDefinitionBuilderMock5).when(builderMock).addPropertyValue("name", "return_of_getBeanClassName1");
            Object object2 = new Object();
            doReturn(beanDefinitionBuilderMock6).when(builderMock).addPropertyValue("servletNames", object2);
            String[] stringArray = new String[] {};
            doReturn(beanDefinitionBuilderMock7).when(builderMock).addPropertyValue("urlPatterns", stringArray);
            AbstractBeanDefinition abstractBeanDefinition = builderMock.getBeanDefinition();
            doReturn(abstractBeanDefinition).when(builderMock).getBeanDefinition();
            beanDefinitionBuilder.when(() -> BeanDefinitionBuilder.rootBeanDefinition(FilterRegistrationBean.class)).thenReturn(builderMock);
            stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
            WebFilterHandler target = spy(new WebFilterHandler());
            DispatcherType[] dispatcherTypeArray = new DispatcherType[] { DispatcherType.FORWARD, DispatcherType.FORWARD, DispatcherType.FORWARD, DispatcherType.FORWARD };
            Map<String, Object> stringObjectMap = new HashMap<>();
            stringObjectMap.put("dispatcherTypes", dispatcherTypeArray);
            stringObjectMap.put("filterName", "A");
            stringObjectMap.put("asyncSupported", object);
            stringObjectMap.put("servletNames", object2);
            doReturn(stringStringMap).when(target).extractInitParameters(eq(stringObjectMap));
            doReturn(stringArray).when(target).extractUrlPatterns(eq(stringObjectMap));
            //Act Statement(s)
            target.doHandle(stringObjectMap, beanDefinitionMock, registryMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(beanDefinitionMock).getBeanClassName();
                verify(registryMock).registerBeanDefinition(eq("return_of_getBeanClassName1"), (BeanDefinition) any());
                verify(builderMock).addPropertyValue("asyncSupported", object);
                verify(builderMock).addPropertyValue("dispatcherTypes", dispatcherTypeSet);
                verify(builderMock).addPropertyValue("filter", beanDefinitionMock);
                verify(builderMock).addPropertyValue(eq("initParameters"), eq(stringStringMap));
                verify(builderMock).addPropertyValue("name", "return_of_getBeanClassName1");
                verify(builderMock).addPropertyValue("servletNames", object2);
                verify(builderMock).addPropertyValue("urlPatterns", stringArray);
                verify(builderMock).getBeanDefinition();
                beanDefinitionBuilder.verify(() -> BeanDefinitionBuilder.rootBeanDefinition(FilterRegistrationBean.class), atLeast(1));
                stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
                verify(target).extractInitParameters(eq(stringObjectMap));
                verify(target).extractUrlPatterns(eq(stringObjectMap));
            });
        }
    }
}
