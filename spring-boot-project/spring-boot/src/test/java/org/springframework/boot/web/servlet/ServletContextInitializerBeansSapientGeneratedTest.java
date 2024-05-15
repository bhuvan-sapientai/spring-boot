package org.springframework.boot.web.servlet;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import jakarta.servlet.Servlet;
import org.springframework.util.MultiValueMap;
import java.util.Iterator;
import jakarta.servlet.MultipartConfigElement;
import java.util.Collection;
import jakarta.servlet.ServletRequestListener;
import org.springframework.beans.factory.ListableBeanFactory;
import java.util.ArrayList;
import jakarta.servlet.Filter;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ServletContextInitializerBeansSapientGeneratedTest {

    private final MultiValueMap<Class<?>, ServletContextInitializer> initializersMock = mock(MultiValueMap.class, "initializers");

    private final ListableBeanFactory beanFactoryMock = mock(ListableBeanFactory.class);

    //Sapient generated method id: ${addAdaptableBeansWhenSeenNotContainsTypeBeanAndBeansIsEmptyAndServletListenerRegistrationBeanGetSupportedTypesIsNotEmpt}, hash: 515F8698D973DF29645A3A71ACEE3FDA
    @Disabled()
    @Test()
    void addAdaptableBeansWhenSeenNotContainsTypeBeanAndBeansIsEmptyAndServletListenerRegistrationBeanGetSupportedTypesIsNotEmpt() throws BeansException {
        /* Branches:
         * (for-each(names)) : true  #  inside getOrderedBeansOfType method
         * (!seen.contains(type, name)) : true  #  inside getOrderedBeansOfType method
         * (!ScopedProxyUtils.isScopedTarget(name)) : true  #  inside getOrderedBeansOfType method
         * (!seen.contains(type, bean)) : true  #  inside getOrderedBeansOfType method
         * (beans.isEmpty()) : true  #  inside getMultipartConfig method
         * (for-each(ServletListenerRegistrationBean.getSupportedTypes())) : true
         * (for-each(entries)) : false  #  inside addAsRegistrationBean method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        String[] stringArray = new String[] { "G" };
        doReturn(stringArray).when(beanFactoryMock).getBeanNamesForType(ServletContextInitializer.class, true, false);
        Object object = new Object();
        doReturn(object).when(beanFactoryMock).getBean("G", ServletContextInitializer.class);
        String[] stringArray2 = new String[] { "B" };
        Object object2 = new Object();
        doReturn(object2).when(beanFactoryMock).getBean("B", MultipartConfigElement.class);
        String[] stringArray3 = new String[] { "C" };
        doReturn(stringArray3).when(beanFactoryMock).getBeanNamesForType(Servlet.class, true, false);
        Object object3 = new Object();
        doReturn(object3).when(beanFactoryMock).getBean("C", Servlet.class);
        String[] stringArray4 = new String[] { "D" };
        doReturn(stringArray4).when(beanFactoryMock).getBeanNamesForType(Filter.class, true, false);
        Object object4 = new Object();
        doReturn(object4).when(beanFactoryMock).getBean("D", Filter.class);
        String[] stringArray5 = new String[] { "E" };
        Object object5 = new Object();
        doReturn(object5).when(beanFactoryMock).getBean("E", ServletRequestListener.class);
        String[] stringArray6 = new String[] { "F" };
        doReturn(stringArray2, stringArray6).when(beanFactoryMock).getBeanNamesForType(MultipartConfigElement.class, true, false);
        Object object6 = new Object();
        doReturn(object6).when(beanFactoryMock).getBean("F", MultipartConfigElement.class);
        String[] stringArray7 = new String[] { "A" };
        doReturn(stringArray5, stringArray7).when(beanFactoryMock).getBeanNamesForType(ServletRequestListener.class, true, false);
        Object object7 = new Object();
        doReturn(object7).when(beanFactoryMock).getBean("A", ServletRequestListener.class);
        Class<ServletContextInitializer>[] classArray = new Class[] { ServletContextInitializer.class };
        ServletContextInitializerBeans target = spy(new ServletContextInitializerBeans(beanFactoryMock, classArray));
        Collection collection = new ArrayList<>();
        doReturn(collection).when(initializersMock).values();
        doNothing().when(target).addAsRegistrationBean(eq(beanFactoryMock), eq(Servlet.class), (ServletContextInitializerBeans.RegistrationBeanAdapter) any());
        doNothing().when(target).addAsRegistrationBean(eq(beanFactoryMock), eq(Filter.class), (ServletContextInitializerBeans.RegistrationBeanAdapter) any());
        //Act Statement(s)
        target.addAdaptableBeans(beanFactoryMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(beanFactoryMock).getBeanNamesForType(ServletContextInitializer.class, true, false);
            verify(beanFactoryMock).getBean("G", ServletContextInitializer.class);
            verify(beanFactoryMock, times(2)).getBeanNamesForType(MultipartConfigElement.class, true, false);
            verify(beanFactoryMock).getBean("B", MultipartConfigElement.class);
            verify(beanFactoryMock).getBeanNamesForType(Servlet.class, true, false);
            verify(beanFactoryMock).getBean("C", Servlet.class);
            verify(beanFactoryMock).getBeanNamesForType(Filter.class, true, false);
            verify(beanFactoryMock).getBean("D", Filter.class);
            verify(beanFactoryMock, times(2)).getBeanNamesForType(ServletRequestListener.class, true, false);
            verify(beanFactoryMock).getBean("E", ServletRequestListener.class);
            verify(beanFactoryMock).getBean("F", MultipartConfigElement.class);
            verify(beanFactoryMock).getBean("A", ServletRequestListener.class);
            verify(initializersMock).values();
            verify(target).addAsRegistrationBean(eq(beanFactoryMock), eq(Servlet.class), (ServletContextInitializerBeans.RegistrationBeanAdapter) any());
            verify(target).addAsRegistrationBean(eq(beanFactoryMock), eq(Filter.class), (ServletContextInitializerBeans.RegistrationBeanAdapter) any());
        });
    }

    //Sapient generated method id: ${addAsRegistrationBeanWhenSeenNotContainsTypeBeanAndEntriesIsEmpty}, hash: 6978602B0BE45F872869EFAD09CD0F58
    @Disabled()
    @Test()
    void addAsRegistrationBeanWhenSeenNotContainsTypeBeanAndEntriesIsEmpty() throws BeansException {
        /* Branches:
         * (for-each(names)) : true  #  inside getOrderedBeansOfType method
         * (!seen.contains(type, name)) : true  #  inside getOrderedBeansOfType method
         * (!ScopedProxyUtils.isScopedTarget(name)) : true  #  inside getOrderedBeansOfType method
         * (!seen.contains(type, bean)) : true  #  inside getOrderedBeansOfType method
         * (for-each(entries)) : false  #  inside addAsRegistrationBean method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        String[] stringArray = new String[] { "F" };
        doReturn(stringArray).when(beanFactoryMock).getBeanNamesForType(ServletContextInitializer.class, true, false);
        Object object = new Object();
        doReturn(object).when(beanFactoryMock).getBean("F", ServletContextInitializer.class);
        String[] stringArray2 = new String[] { "A" };
        doReturn(stringArray2).when(beanFactoryMock).getBeanNamesForType(MultipartConfigElement.class, true, false);
        Object object2 = new Object();
        doReturn(object2).when(beanFactoryMock).getBean("A", MultipartConfigElement.class);
        String[] stringArray3 = new String[] { "D" };
        doReturn(stringArray3).when(beanFactoryMock).getBeanNamesForType(Servlet.class, true, false);
        Object object3 = new Object();
        doReturn(object3).when(beanFactoryMock).getBean("D", Servlet.class);
        String[] stringArray4 = new String[] { "E" };
        Object object4 = new Object();
        doReturn(object4).when(beanFactoryMock).getBean("E", Filter.class);
        String[] stringArray5 = new String[] { "B" };
        doReturn(stringArray5).when(beanFactoryMock).getBeanNamesForType(ServletRequestListener.class, true, false);
        Object object5 = new Object();
        doReturn(object5).when(beanFactoryMock).getBean("B", ServletRequestListener.class);
        String[] stringArray6 = new String[] { "C" };
        doReturn(stringArray4, stringArray6).when(beanFactoryMock).getBeanNamesForType(Filter.class, true, false);
        Object object6 = new Object();
        doReturn(object6).when(beanFactoryMock).getBean("C", Filter.class);
        Class<ServletContextInitializer>[] classArray = new Class[] { ServletContextInitializer.class };
        ServletContextInitializerBeans target = new ServletContextInitializerBeans(beanFactoryMock, classArray);
        Collection collection = new ArrayList<>();
        doReturn(collection).when(initializersMock).values();
        //Act Statement(s)
        target.addAsRegistrationBean(beanFactoryMock, Filter.class, null);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(beanFactoryMock).getBeanNamesForType(ServletContextInitializer.class, true, false);
            verify(beanFactoryMock).getBean("F", ServletContextInitializer.class);
            verify(beanFactoryMock).getBeanNamesForType(MultipartConfigElement.class, true, false);
            verify(beanFactoryMock).getBean("A", MultipartConfigElement.class);
            verify(beanFactoryMock).getBeanNamesForType(Servlet.class, true, false);
            verify(beanFactoryMock).getBean("D", Servlet.class);
            verify(beanFactoryMock, times(2)).getBeanNamesForType(Filter.class, true, false);
            verify(beanFactoryMock).getBean("E", Filter.class);
            verify(beanFactoryMock).getBeanNamesForType(ServletRequestListener.class, true, false);
            verify(beanFactoryMock).getBean("B", ServletRequestListener.class);
            verify(beanFactoryMock).getBean("C", Filter.class);
            verify(initializersMock).values();
        });
    }

    //Sapient generated method id: ${iteratorTest}, hash: 687DBD2BD8124FA63F0D260FDFA1EE63
    @Disabled()
    @Test()
    void iteratorTest() throws BeansException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        String[] stringArray = new String[] { "F" };
        doReturn(stringArray).when(beanFactoryMock).getBeanNamesForType(ServletContextInitializer.class, true, false);
        Object object = new Object();
        doReturn(object).when(beanFactoryMock).getBean("F", ServletContextInitializer.class);
        String[] stringArray2 = new String[] { "C" };
        doReturn(stringArray2).when(beanFactoryMock).getBeanNamesForType(MultipartConfigElement.class, true, false);
        Object object2 = new Object();
        doReturn(object2).when(beanFactoryMock).getBean("C", MultipartConfigElement.class);
        String[] stringArray3 = new String[] { "D" };
        doReturn(stringArray3).when(beanFactoryMock).getBeanNamesForType(Servlet.class, true, false);
        Object object3 = new Object();
        doReturn(object3).when(beanFactoryMock).getBean("D", Servlet.class);
        String[] stringArray4 = new String[] { "B" };
        doReturn(stringArray4).when(beanFactoryMock).getBeanNamesForType(Filter.class, true, false);
        Object object4 = new Object();
        doReturn(object4).when(beanFactoryMock).getBean("B", Filter.class);
        String[] stringArray5 = new String[] { "E" };
        doReturn(stringArray5).when(beanFactoryMock).getBeanNamesForType(ServletRequestListener.class, true, false);
        Object object5 = new Object();
        doReturn(object5).when(beanFactoryMock).getBean("E", ServletRequestListener.class);
        Class<ServletContextInitializer>[] classArray = new Class[] { ServletContextInitializer.class };
        ServletContextInitializerBeans target = new ServletContextInitializerBeans(beanFactoryMock, classArray);
        Collection collection = new ArrayList<>();
        doReturn(collection).when(initializersMock).values();
        //Act Statement(s)
        Iterator<ServletContextInitializer> result = target.iterator();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(beanFactoryMock).getBeanNamesForType(ServletContextInitializer.class, true, false);
            verify(beanFactoryMock).getBean("F", ServletContextInitializer.class);
            verify(beanFactoryMock).getBeanNamesForType(MultipartConfigElement.class, true, false);
            verify(beanFactoryMock).getBean("C", MultipartConfigElement.class);
            verify(beanFactoryMock).getBeanNamesForType(Servlet.class, true, false);
            verify(beanFactoryMock).getBean("D", Servlet.class);
            verify(beanFactoryMock).getBeanNamesForType(Filter.class, true, false);
            verify(beanFactoryMock).getBean("B", Filter.class);
            verify(beanFactoryMock).getBeanNamesForType(ServletRequestListener.class, true, false);
            verify(beanFactoryMock).getBean("E", ServletRequestListener.class);
            verify(initializersMock).values();
        });
    }

    //Sapient generated method id: ${sizeTest}, hash: 6A1E4ABA27BC56B3A1B4713B1DFD5F5F
    @Disabled()
    @Test()
    void sizeTest() throws BeansException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        String[] stringArray = new String[] { "F" };
        doReturn(stringArray).when(beanFactoryMock).getBeanNamesForType(ServletContextInitializer.class, true, false);
        Object object = new Object();
        doReturn(object).when(beanFactoryMock).getBean("F", ServletContextInitializer.class);
        String[] stringArray2 = new String[] { "C" };
        doReturn(stringArray2).when(beanFactoryMock).getBeanNamesForType(MultipartConfigElement.class, true, false);
        Object object2 = new Object();
        doReturn(object2).when(beanFactoryMock).getBean("C", MultipartConfigElement.class);
        String[] stringArray3 = new String[] { "D" };
        doReturn(stringArray3).when(beanFactoryMock).getBeanNamesForType(Servlet.class, true, false);
        Object object3 = new Object();
        doReturn(object3).when(beanFactoryMock).getBean("D", Servlet.class);
        String[] stringArray4 = new String[] { "B" };
        doReturn(stringArray4).when(beanFactoryMock).getBeanNamesForType(Filter.class, true, false);
        Object object4 = new Object();
        doReturn(object4).when(beanFactoryMock).getBean("B", Filter.class);
        String[] stringArray5 = new String[] { "E" };
        doReturn(stringArray5).when(beanFactoryMock).getBeanNamesForType(ServletRequestListener.class, true, false);
        Object object5 = new Object();
        doReturn(object5).when(beanFactoryMock).getBean("E", ServletRequestListener.class);
        Class<ServletContextInitializer>[] classArray = new Class[] { ServletContextInitializer.class };
        ServletContextInitializerBeans target = new ServletContextInitializerBeans(beanFactoryMock, classArray);
        Collection collection = new ArrayList<>();
        doReturn(collection).when(initializersMock).values();
        //Act Statement(s)
        int result = target.size();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(beanFactoryMock).getBeanNamesForType(ServletContextInitializer.class, true, false);
            verify(beanFactoryMock).getBean("F", ServletContextInitializer.class);
            verify(beanFactoryMock).getBeanNamesForType(MultipartConfigElement.class, true, false);
            verify(beanFactoryMock).getBean("C", MultipartConfigElement.class);
            verify(beanFactoryMock).getBeanNamesForType(Servlet.class, true, false);
            verify(beanFactoryMock).getBean("D", Servlet.class);
            verify(beanFactoryMock).getBeanNamesForType(Filter.class, true, false);
            verify(beanFactoryMock).getBean("B", Filter.class);
            verify(beanFactoryMock).getBeanNamesForType(ServletRequestListener.class, true, false);
            verify(beanFactoryMock).getBean("E", ServletRequestListener.class);
            verify(initializersMock).values();
        });
    }
}
