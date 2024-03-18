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

import org.springframework.aop.scope.ScopedProxyUtils;

import java.util.Collection;

import jakarta.servlet.ServletRequestListener;
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

	//Sapient generated method id: ${d9edcbff-0783-39fd-a93e-eb38531ddf19}, hash: 7B220AD3F66D0F86837299BA713FB7F1
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
		doReturn(object2).when(beanFactoryMock).getBean("A", MultipartConfigElement.class);
		String[] stringArray3 = new String[] { "B" };
		doReturn(stringArray3).when(beanFactoryMock).getBeanNamesForType(Servlet.class, true, false);
		Object object3 = new Object();
		doReturn(object3).when(beanFactoryMock).getBean("B", Servlet.class);
		String[] stringArray4 = new String[] { "C" };
		doReturn(stringArray4).when(beanFactoryMock).getBeanNamesForType(Filter.class, true, false);
		Object object4 = new Object();
		doReturn(object4).when(beanFactoryMock).getBean("C", Filter.class);
		String[] stringArray5 = new String[] { "D" };
		Object object5 = new Object();
		doReturn(object5).when(beanFactoryMock).getBean("D", ServletRequestListener.class);
		String[] stringArray6 = new String[] { "E" };
		doReturn(stringArray2, stringArray6).when(beanFactoryMock).getBeanNamesForType(MultipartConfigElement.class, true, false);
		Object object6 = new Object();
		doReturn(object6).when(beanFactoryMock).getBean("E", MultipartConfigElement.class);
		String[] stringArray7 = new String[] { "F" };
		doReturn(stringArray5, stringArray7).when(beanFactoryMock).getBeanNamesForType(ServletRequestListener.class, true, false);
		Object object7 = new Object();
		doReturn(object7).when(beanFactoryMock).getBean("F", ServletRequestListener.class);
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
			verify(beanFactoryMock).getBean("A", MultipartConfigElement.class);
			verify(beanFactoryMock).getBeanNamesForType(Servlet.class, true, false);
			verify(beanFactoryMock).getBean("B", Servlet.class);
			verify(beanFactoryMock).getBeanNamesForType(Filter.class, true, false);
			verify(beanFactoryMock).getBean("C", Filter.class);
			verify(beanFactoryMock, times(2)).getBeanNamesForType(ServletRequestListener.class, true, false);
			verify(beanFactoryMock).getBean("D", ServletRequestListener.class);
			verify(beanFactoryMock).getBean("E", MultipartConfigElement.class);
			verify(beanFactoryMock).getBean("F", ServletRequestListener.class);
			verify(initializersMock).values();
			verify(target).addAsRegistrationBean(eq(beanFactoryMock), eq(Servlet.class), (ServletContextInitializerBeans.RegistrationBeanAdapter) any());
			verify(target).addAsRegistrationBean(eq(beanFactoryMock), eq(Filter.class), (ServletContextInitializerBeans.RegistrationBeanAdapter) any());
		});
	}

	//Sapient generated method id: ${5e201405-2571-3aec-a322-4766d6691327}, hash: 705A2B8D628026EB94A2E7D424E04934
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
		try (MockedStatic<ServletListenerRegistrationBean> servletListenerRegistrationBean = mockStatic(ServletListenerRegistrationBean.class)) {
			String[] stringArray = new String[] { "E" };
			doReturn(stringArray).when(beanFactoryMock).getBeanNamesForType(ServletContextInitializer.class, true, false);
			Object object = new Object();
			doReturn(object).when(beanFactoryMock).getBean("E", ServletContextInitializer.class);
			String[] stringArray2 = new String[] { "A" };
			doReturn(stringArray2).when(beanFactoryMock).getBeanNamesForType(MultipartConfigElement.class, true, false);
			Object object2 = new Object();
			doReturn(object2).when(beanFactoryMock).getBean("A", MultipartConfigElement.class);
			String[] stringArray3 = new String[] { "C" };
			doReturn(stringArray3).when(beanFactoryMock).getBeanNamesForType(Servlet.class, true, false);
			Object object3 = new Object();
			doReturn(object3).when(beanFactoryMock).getBean("C", Servlet.class);
			String[] stringArray4 = new String[] { "D" };
			Object object4 = new Object();
			doReturn(object4).when(beanFactoryMock).getBean("D", Filter.class);
			String[] stringArray5 = new String[] { "B" };
			doReturn(stringArray4, stringArray5).when(beanFactoryMock).getBeanNamesForType(Filter.class, true, false);
			Object object5 = new Object();
			doReturn(object5).when(beanFactoryMock).getBean("B", Filter.class);
			Set set = new HashSet<>();
			servletListenerRegistrationBean.when(() -> ServletListenerRegistrationBean.getSupportedTypes()).thenReturn(set);
			Class<ServletContextInitializer>[] classArray = new Class[] { ServletContextInitializer.class };
			ServletContextInitializerBeans target = new ServletContextInitializerBeans(beanFactoryMock, classArray);
			Collection collection = new ArrayList<>();
			doReturn(collection).when(initializersMock).values();
			//Act Statement(s)
			target.addAsRegistrationBean(beanFactoryMock, Filter.class, null);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(beanFactoryMock).getBeanNamesForType(ServletContextInitializer.class, true, false);
				verify(beanFactoryMock).getBean("E", ServletContextInitializer.class);
				verify(beanFactoryMock).getBeanNamesForType(MultipartConfigElement.class, true, false);
				verify(beanFactoryMock).getBean("A", MultipartConfigElement.class);
				verify(beanFactoryMock).getBeanNamesForType(Servlet.class, true, false);
				verify(beanFactoryMock).getBean("C", Servlet.class);
				verify(beanFactoryMock, times(2)).getBeanNamesForType(Filter.class, true, false);
				verify(beanFactoryMock).getBean("D", Filter.class);
				verify(beanFactoryMock).getBean("B", Filter.class);
				servletListenerRegistrationBean.verify(() -> ServletListenerRegistrationBean.getSupportedTypes(), atLeast(1));
				verify(initializersMock).values();
			});
		}
	}

	//Sapient generated method id: ${78c09fb6-edcf-3ce7-9932-6ef4ffc152b3}, hash: EEFB5E91CA732D1A7A482C778207B731
	@Disabled()
	@Test()
	void iteratorTest() throws BeansException {
		/*
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
			doReturn(stringArray2).when(beanFactoryMock).getBeanNamesForType(MultipartConfigElement.class, true, false);
			Object object2 = new Object();
			doReturn(object2).when(beanFactoryMock).getBean("A", MultipartConfigElement.class);
			String[] stringArray3 = new String[] { "B" };
			doReturn(stringArray3).when(beanFactoryMock).getBeanNamesForType(Servlet.class, true, false);
			Object object3 = new Object();
			doReturn(object3).when(beanFactoryMock).getBean("B", Servlet.class);
			String[] stringArray4 = new String[] { "C" };
			doReturn(stringArray4).when(beanFactoryMock).getBeanNamesForType(Filter.class, true, false);
			Object object4 = new Object();
			doReturn(object4).when(beanFactoryMock).getBean("C", Filter.class);
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
				verify(beanFactoryMock).getBeanNamesForType(MultipartConfigElement.class, true, false);
				verify(beanFactoryMock).getBean("A", MultipartConfigElement.class);
				verify(beanFactoryMock).getBeanNamesForType(Servlet.class, true, false);
				verify(beanFactoryMock).getBean("B", Servlet.class);
				verify(beanFactoryMock).getBeanNamesForType(Filter.class, true, false);
				verify(beanFactoryMock).getBean("C", Filter.class);
				servletListenerRegistrationBean.verify(() -> ServletListenerRegistrationBean.getSupportedTypes(), atLeast(1));
				verify(initializersMock).values();
			});
		}
	}

	//Sapient generated method id: ${0a253188-e32a-3fb1-a265-54df02efeff0}, hash: 003C9E66159E94E2E53EED0D9A172D6B
	@Disabled()
	@Test()
	void sizeTest() throws BeansException {
		/*
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
			doReturn(stringArray2).when(beanFactoryMock).getBeanNamesForType(MultipartConfigElement.class, true, false);
			Object object2 = new Object();
			doReturn(object2).when(beanFactoryMock).getBean("A", MultipartConfigElement.class);
			String[] stringArray3 = new String[] { "B" };
			doReturn(stringArray3).when(beanFactoryMock).getBeanNamesForType(Servlet.class, true, false);
			Object object3 = new Object();
			doReturn(object3).when(beanFactoryMock).getBean("B", Servlet.class);
			String[] stringArray4 = new String[] { "C" };
			doReturn(stringArray4).when(beanFactoryMock).getBeanNamesForType(Filter.class, true, false);
			Object object4 = new Object();
			doReturn(object4).when(beanFactoryMock).getBean("C", Filter.class);
			Set set = new HashSet<>();
			servletListenerRegistrationBean.when(() -> ServletListenerRegistrationBean.getSupportedTypes()).thenReturn(set);
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
				verify(beanFactoryMock).getBean("D", ServletContextInitializer.class);
				verify(beanFactoryMock).getBeanNamesForType(MultipartConfigElement.class, true, false);
				verify(beanFactoryMock).getBean("A", MultipartConfigElement.class);
				verify(beanFactoryMock).getBeanNamesForType(Servlet.class, true, false);
				verify(beanFactoryMock).getBean("B", Servlet.class);
				verify(beanFactoryMock).getBeanNamesForType(Filter.class, true, false);
				verify(beanFactoryMock).getBean("C", Filter.class);
				servletListenerRegistrationBean.verify(() -> ServletListenerRegistrationBean.getSupportedTypes(), atLeast(1));
				verify(initializersMock).values();
			});
		}
	}
}
