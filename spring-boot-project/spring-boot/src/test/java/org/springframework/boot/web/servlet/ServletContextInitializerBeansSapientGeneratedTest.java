package org.springframework.boot.web.servlet;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.beans.BeansException;

import java.util.List;

import org.springframework.util.MultiValueMap;

import java.util.HashSet;

import org.springframework.beans.factory.ListableBeanFactory;

import java.util.ArrayList;
import java.util.stream.StreamSupport;

import jakarta.servlet.Servlet;

import java.util.Iterator;

import jakarta.servlet.MultipartConfigElement;

import java.util.Set;

import jakarta.servlet.ServletContextListener;

import org.springframework.aop.scope.ScopedProxyUtils;

import java.util.Collection;

import org.mockito.MockedStatic;

import java.util.Spliterators;

import jakarta.servlet.Filter;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ServletContextInitializerBeansSapientGeneratedTest {

	private final MultiValueMap<Class<?>, ServletContextInitializer> initializersMock = mock(MultiValueMap.class, "initializers");

	private final ListableBeanFactory beanFactoryMock = mock(ListableBeanFactory.class);

	//Sapient generated method id: ${d9edcbff-0783-39fd-a93e-eb38531ddf19}
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
		String[] stringArray2 = new String[] { "A" };
		Object object2 = new Object();
		doReturn(object2).when(beanFactoryMock).getBean("A", Object.class);
		String[] stringArray3 = new String[] { "B" };
		Object object3 = new Object();
		doReturn(object3).when(beanFactoryMock).getBean("B", Object.class);
		String[] stringArray4 = new String[] { "C" };
		Object object4 = new Object();
		doReturn(object4).when(beanFactoryMock).getBean("C", Object.class);
		String[] stringArray5 = new String[] { "D" };
		Object object5 = new Object();
		doReturn(object5).when(beanFactoryMock).getBean("D", ServletContextListener.class);
		String[] stringArray6 = new String[] { "E" };
		doReturn(stringArray2, stringArray3, stringArray4, stringArray6).when(beanFactoryMock).getBeanNamesForType(Object.class, true, false);
		Object object6 = new Object();
		doReturn(object6).when(beanFactoryMock).getBean("E", Object.class);
		String[] stringArray7 = new String[] { "F" };
		doReturn(stringArray5, stringArray7).when(beanFactoryMock).getBeanNamesForType(ServletContextListener.class, true, false);
		Object object7 = new Object();
		doReturn(object7).when(beanFactoryMock).getBean("F", ServletContextListener.class);
		Class<ServletContextInitializer>[] classArray = new Class[] { ServletContextInitializer.class };
		ServletContextInitializerBeans target = spy(new ServletContextInitializerBeans(beanFactoryMock, classArray));
		Collection collection = new ArrayList<>();
		doReturn(collection).when(initializersMock).values();
		doNothing().when(target).addAsRegistrationBean(eq(beanFactoryMock), eq(Object.class), (ServletContextInitializerBeans.RegistrationBeanAdapter) any());
		//Act Statement(s)
		target.addAdaptableBeans(beanFactoryMock);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(beanFactoryMock).getBeanNamesForType(ServletContextInitializer.class, true, false);
			verify(beanFactoryMock).getBean("G", ServletContextInitializer.class);
			verify(beanFactoryMock, times(4)).getBeanNamesForType(Object.class, true, false);
			verify(beanFactoryMock).getBean("A", Object.class);
			verify(beanFactoryMock).getBean("B", Object.class);
			verify(beanFactoryMock).getBean("C", Object.class);
			verify(beanFactoryMock, times(2)).getBeanNamesForType(ServletContextListener.class, true, false);
			verify(beanFactoryMock).getBean("D", ServletContextListener.class);
			verify(beanFactoryMock).getBean("E", Object.class);
			verify(beanFactoryMock).getBean("F", ServletContextListener.class);
			verify(initializersMock).values();
			verify(target, atLeast(2)).addAsRegistrationBean(eq(beanFactoryMock), eq(Object.class), (ServletContextInitializerBeans.RegistrationBeanAdapter) any());
		});
	}

	//Sapient generated method id: ${5e201405-2571-3aec-a322-4766d6691327}
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
		Object object2 = new Object();
		doReturn(object2).when(beanFactoryMock).getBean("A", Object.class);
		String[] stringArray3 = new String[] { "B" };
		Object object3 = new Object();
		doReturn(object3).when(beanFactoryMock).getBean("B", Object.class);
		String[] stringArray4 = new String[] { "C" };
		Object object4 = new Object();
		doReturn(object4).when(beanFactoryMock).getBean("C", Object.class);
		String[] stringArray5 = new String[] { "D" };
		doReturn(stringArray5).when(beanFactoryMock).getBeanNamesForType(ServletContextListener.class, true, false);
		Object object5 = new Object();
		doReturn(object5).when(beanFactoryMock).getBean("D", ServletContextListener.class);
		String[] stringArray6 = new String[] { "E" };
		doReturn(stringArray2, stringArray3, stringArray4, stringArray6).when(beanFactoryMock).getBeanNamesForType(Object.class, true, false);
		Object object6 = new Object();
		doReturn(object6).when(beanFactoryMock).getBean("E", Object.class);
		Class<ServletContextInitializer>[] classArray = new Class[] { ServletContextInitializer.class };
		ServletContextInitializerBeans target = new ServletContextInitializerBeans(beanFactoryMock, classArray);
		Collection collection = new ArrayList<>();
		doReturn(collection).when(initializersMock).values();
		//Act Statement(s)
		target.addAsRegistrationBean(beanFactoryMock, Object.class, null);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(beanFactoryMock).getBeanNamesForType(ServletContextInitializer.class, true, false);
			verify(beanFactoryMock).getBean("F", ServletContextInitializer.class);
			verify(beanFactoryMock, times(4)).getBeanNamesForType(Object.class, true, false);
			verify(beanFactoryMock).getBean("A", Object.class);
			verify(beanFactoryMock).getBean("B", Object.class);
			verify(beanFactoryMock).getBean("C", Object.class);
			verify(beanFactoryMock).getBeanNamesForType(ServletContextListener.class, true, false);
			verify(beanFactoryMock).getBean("D", ServletContextListener.class);
			verify(beanFactoryMock).getBean("E", Object.class);
			verify(initializersMock).values();
		});
	}

	//Sapient generated method id: ${78c09fb6-edcf-3ce7-9932-6ef4ffc152b3}
	@Disabled()
	@Test()
	void iteratorTest() throws BeansException {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ServletListenerRegistrationBean> servletListenerRegistrationBean = mockStatic(ServletListenerRegistrationBean.class)) {
			String[] stringArray = new String[] { "D" };
			doReturn(stringArray).when(beanFactoryMock).getBeanNamesForType(ServletContextInitializer.class, true, false);
			Object object = new Object();
			doReturn(object).when(beanFactoryMock).getBean("D", ServletContextInitializer.class);
			String[] stringArray2 = new String[] { "A" };
			Object object2 = new Object();
			doReturn(object2).when(beanFactoryMock).getBean("A", Object.class);
			String[] stringArray3 = new String[] { "B" };
			Object object3 = new Object();
			doReturn(object3).when(beanFactoryMock).getBean("B", Object.class);
			String[] stringArray4 = new String[] { "C" };
			doReturn(stringArray2, stringArray3, stringArray4).when(beanFactoryMock).getBeanNamesForType(Object.class, true, false);
			Object object4 = new Object();
			doReturn(object4).when(beanFactoryMock).getBean("C", Object.class);
			Set set = new HashSet<>();
			servletListenerRegistrationBean.when(() -> ServletListenerRegistrationBean.getSupportedTypes()).thenReturn(set);
			Class<ServletContextInitializer>[] classArray = new Class[] { ServletContextInitializer.class };
			ServletContextInitializerBeans target = new ServletContextInitializerBeans(beanFactoryMock, classArray);
			Collection collection = new ArrayList<>();
			doReturn(collection).when(initializersMock).values();
			//Act Statement(s)
			Iterator<ServletContextInitializer> result = target.iterator();
			List<ServletContextInitializer> servletContextInitializerList = new ArrayList<>();
			Iterator<ServletContextInitializer> iteratorResult = servletContextInitializerList.iterator();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(StreamSupport.stream(Spliterators.spliteratorUnknownSize(result, 0), false).toArray(), equalTo(StreamSupport.stream(Spliterators.spliteratorUnknownSize(iteratorResult, 0), false).toArray()));
				verify(beanFactoryMock).getBeanNamesForType(ServletContextInitializer.class, true, false);
				verify(beanFactoryMock).getBean("D", ServletContextInitializer.class);
				verify(beanFactoryMock, times(3)).getBeanNamesForType(Object.class, true, false);
				verify(beanFactoryMock).getBean("A", Object.class);
				verify(beanFactoryMock).getBean("B", Object.class);
				verify(beanFactoryMock).getBean("C", Object.class);
				servletListenerRegistrationBean.verify(() -> ServletListenerRegistrationBean.getSupportedTypes(), atLeast(1));
				verify(initializersMock).values();
			});
		}
	}

	//Sapient generated method id: ${0a253188-e32a-3fb1-a265-54df02efeff0}
	@Disabled()
	@Test()
	void sizeTest() throws BeansException {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		String[] stringArray = new String[] { "" };
		doReturn(stringArray).when(beanFactoryMock).getBeanNamesForType(ServletContextInitializer.class, true, false);
		Object object = new Object();
		doReturn(object).when(beanFactoryMock).getBean("", ServletContextInitializer.class);
		String[] stringArray2 = new String[] { "" };
		Object object2 = new Object();
		String[] stringArray3 = new String[] { "" };
		Object object3 = new Object();
		String[] stringArray4 = new String[] { "" };
		doReturn(stringArray2, stringArray3, stringArray4).when(beanFactoryMock).getBeanNamesForType(Object.class, true, false);
		Object object4 = new Object();
		doReturn(object2, object3, object4).when(beanFactoryMock).getBean("", Object.class);
		String[] stringArray5 = new String[] { "" };
		doReturn(stringArray5).when(beanFactoryMock).getBeanNamesForType(ServletContextListener.class, true, false);
		Object object5 = new Object();
		doReturn(object5).when(beanFactoryMock).getBean("", ServletContextListener.class);
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
			verify(beanFactoryMock).getBean("", ServletContextInitializer.class);
			verify(beanFactoryMock, times(3)).getBeanNamesForType(Object.class, true, false);
			verify(beanFactoryMock, times(3)).getBean("", Object.class);
			verify(beanFactoryMock).getBeanNamesForType(ServletContextListener.class, true, false);
			verify(beanFactoryMock).getBean("", ServletContextListener.class);
			verify(initializersMock).values();
		});
	}
}
