package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.SmartInitializingSingleton;

import java.util.Map;
import java.util.HashMap;

import org.mockito.MockedStatic;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LazyInitializationBeanFactoryPostProcessorSapientGeneratedTest {

	private final AbstractBeanDefinition abstractBeanDefinitionMock = mock(AbstractBeanDefinition.class);

	private final ConfigurableListableBeanFactory beanFactoryMock = mock(ConfigurableListableBeanFactory.class);

	private final LazyInitializationExcludeFilter lazyInitializationExcludeFilterMock = mock(LazyInitializationExcludeFilter.class);

	//Sapient generated method id: ${32e983f9-6662-303e-857c-22d9d1cd08a2}
	@Test()
	void postProcessBeanFactoryWhenLazyInitIsNotNull() throws BeansException, NoSuchBeanDefinitionException {
		/* Branches:
		 * (for-each(beanFactory.getBeanDefinitionNames())) : true
		 * (beanDefinition instanceof AbstractBeanDefinition abstractBeanDefinition) : true
		 * (lazyInit != null) : true  #  inside postProcess method
		 */
		//Arrange Statement(s)
		Map<String, Object> stringObjectMap = new HashMap<>();
		doReturn(stringObjectMap).when(beanFactoryMock).getBeansOfType(LazyInitializationExcludeFilter.class, false, false);
		String[] stringArray = new String[] { "return_of_getBeanDefinitionNamesItem1" };
		doReturn(stringArray).when(beanFactoryMock).getBeanDefinitionNames();
		doReturn(abstractBeanDefinitionMock).when(beanFactoryMock).getBeanDefinition("return_of_getBeanDefinitionNamesItem1");
		doReturn(false).when(abstractBeanDefinitionMock).getLazyInit();
		LazyInitializationBeanFactoryPostProcessor target = new LazyInitializationBeanFactoryPostProcessor();

		//Act Statement(s)
		target.postProcessBeanFactory(beanFactoryMock);

		//Assert statement(s)
		assertAll("result", () -> {
			verify(beanFactoryMock).getBeansOfType(LazyInitializationExcludeFilter.class, false, false);
			verify(beanFactoryMock).getBeanDefinitionNames();
			verify(beanFactoryMock).getBeanDefinition("return_of_getBeanDefinitionNamesItem1");
			verify(abstractBeanDefinitionMock).getLazyInit();
		});
	}

	//Sapient generated method id: ${32f6aefc-8f5f-370b-bbd2-efa12d68795d}
	@Test()
	void postProcessBeanFactoryWhenBeanTypeIsNullAndIsExcludedNotFiltersBeanNameBeanDefinitionBeanType() throws BeansException, NoSuchBeanDefinitionException {
		/* Branches:
		 * (for-each(beanFactory.getBeanDefinitionNames())) : true
		 * (beanDefinition instanceof AbstractBeanDefinition abstractBeanDefinition) : true
		 * (lazyInit != null) : false  #  inside postProcess method
		 * (catch-exception (NoSuchBeanDefinitionException)) : true  #  inside getBeanType method
		 * (beanType != null) : false  #  inside isExcluded method
		 * (!isExcluded(filters, beanName, beanDefinition, beanType)) : true  #  inside postProcess method
		 */
		//Arrange Statement(s)
		Map<String, Object> stringObjectMap = new HashMap<>();
		doReturn(stringObjectMap).when(beanFactoryMock).getBeansOfType(LazyInitializationExcludeFilter.class, false, false);
		String[] stringArray = new String[] { "return_of_getBeanDefinitionNamesItem1" };
		doReturn(stringArray).when(beanFactoryMock).getBeanDefinitionNames();
		doReturn(abstractBeanDefinitionMock).when(beanFactoryMock).getBeanDefinition("return_of_getBeanDefinitionNamesItem1");
		doReturn(null).when(abstractBeanDefinitionMock).getLazyInit();
		doNothing().when(abstractBeanDefinitionMock).setLazyInit(true);
		NoSuchBeanDefinitionException noSuchBeanDefinitionExceptionMock = mock(NoSuchBeanDefinitionException.class);
		doThrow(noSuchBeanDefinitionExceptionMock).when(beanFactoryMock).getType("return_of_getBeanDefinitionNamesItem1", false);
		LazyInitializationBeanFactoryPostProcessor target = new LazyInitializationBeanFactoryPostProcessor();

		//Act Statement(s)
		target.postProcessBeanFactory(beanFactoryMock);

		//Assert statement(s)
		assertAll("result", () -> {
			verify(beanFactoryMock).getBeansOfType(LazyInitializationExcludeFilter.class, false, false);
			verify(beanFactoryMock).getBeanDefinitionNames();
			verify(beanFactoryMock).getBeanDefinition("return_of_getBeanDefinitionNamesItem1");
			verify(abstractBeanDefinitionMock).getLazyInit();
			verify(abstractBeanDefinitionMock).setLazyInit(true);
			verify(beanFactoryMock).getType("return_of_getBeanDefinitionNamesItem1", false);
		});
	}

	//Sapient generated method id: ${b433a47c-ed52-36aa-8320-71f74ffa7770}
	@Test()
	void postProcessBeanFactoryWhenIsExcludedFiltersBeanNameBeanDefinitionBeanType() throws BeansException, NoSuchBeanDefinitionException {
		/* Branches:
		 * (for-each(beanFactory.getBeanDefinitionNames())) : true
		 * (beanDefinition instanceof AbstractBeanDefinition abstractBeanDefinition) : true
		 * (lazyInit != null) : false  #  inside postProcess method
		 * (beanType != null) : true  #  inside isExcluded method
		 * (for-each(filters)) : true  #  inside isExcluded method
		 * (filter.isExcluded(beanName, beanDefinition, beanType)) : true  #  inside isExcluded method
		 * (!isExcluded(filters, beanName, beanDefinition, beanType)) : false  #  inside postProcess method
		 */
		//Arrange Statement(s)
		try (MockedStatic<LazyInitializationExcludeFilter> lazyInitializationExcludeFilter = mockStatic(LazyInitializationExcludeFilter.class)) {
			Map<String, Object> stringObjectMap = new HashMap<>();
			doReturn(stringObjectMap).when(beanFactoryMock).getBeansOfType(LazyInitializationExcludeFilter.class, false, false);
			String[] stringArray = new String[] { "return_of_getBeanDefinitionNamesItem1" };
			doReturn(stringArray).when(beanFactoryMock).getBeanDefinitionNames();
			doReturn(abstractBeanDefinitionMock).when(beanFactoryMock).getBeanDefinition("return_of_getBeanDefinitionNamesItem1");
			doReturn(null).when(abstractBeanDefinitionMock).getLazyInit();
			doReturn(Object.class).when(beanFactoryMock).getType("return_of_getBeanDefinitionNamesItem1", false);
			Class[] classArray = new Class[] { SmartInitializingSingleton.class };
			lazyInitializationExcludeFilter.when(() -> LazyInitializationExcludeFilter.forBeanTypes(classArray)).thenReturn(lazyInitializationExcludeFilterMock);
			doReturn(true).when(lazyInitializationExcludeFilterMock).isExcluded("return_of_getBeanDefinitionNamesItem1", abstractBeanDefinitionMock, Object.class);
			LazyInitializationBeanFactoryPostProcessor target = new LazyInitializationBeanFactoryPostProcessor();
			//Act Statement(s)
			target.postProcessBeanFactory(beanFactoryMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(beanFactoryMock).getBeansOfType(LazyInitializationExcludeFilter.class, false, false);
				verify(beanFactoryMock).getBeanDefinitionNames();
				verify(beanFactoryMock).getBeanDefinition("return_of_getBeanDefinitionNamesItem1");
				verify(abstractBeanDefinitionMock).getLazyInit();
				verify(beanFactoryMock).getType("return_of_getBeanDefinitionNamesItem1", false);
				lazyInitializationExcludeFilter.verify(() -> LazyInitializationExcludeFilter.forBeanTypes(classArray), atLeast(1));
				verify(lazyInitializationExcludeFilterMock).isExcluded("return_of_getBeanDefinitionNamesItem1", abstractBeanDefinitionMock, Object.class);
			});
		}
	}

	//Sapient generated method id: ${24bfceb5-df4e-39e6-bfbb-cfc808aa9287}
	@Test()
	void postProcessBeanFactoryWhenFilterNotIsExcludedBeanNameBeanDefinitionBeanTypeAndIsExcludedNotFiltersBeanNameBeanDefinitio() throws BeansException, NoSuchBeanDefinitionException {
		/* Branches:
		 * (for-each(beanFactory.getBeanDefinitionNames())) : true
		 * (beanDefinition instanceof AbstractBeanDefinition abstractBeanDefinition) : true
		 * (lazyInit != null) : false  #  inside postProcess method
		 * (beanType != null) : true  #  inside isExcluded method
		 * (for-each(filters)) : true  #  inside isExcluded method
		 * (filter.isExcluded(beanName, beanDefinition, beanType)) : false  #  inside isExcluded method
		 * (!isExcluded(filters, beanName, beanDefinition, beanType)) : true  #  inside postProcess method
		 */
		//Arrange Statement(s)
		try (MockedStatic<LazyInitializationExcludeFilter> lazyInitializationExcludeFilter = mockStatic(LazyInitializationExcludeFilter.class)) {
			Map<String, Object> stringObjectMap = new HashMap<>();
			doReturn(stringObjectMap).when(beanFactoryMock).getBeansOfType(LazyInitializationExcludeFilter.class, false, false);
			String[] stringArray = new String[] { "return_of_getBeanDefinitionNamesItem1" };
			doReturn(stringArray).when(beanFactoryMock).getBeanDefinitionNames();
			doReturn(abstractBeanDefinitionMock).when(beanFactoryMock).getBeanDefinition("return_of_getBeanDefinitionNamesItem1");
			doReturn(null).when(abstractBeanDefinitionMock).getLazyInit();
			doNothing().when(abstractBeanDefinitionMock).setLazyInit(true);
			doReturn(Object.class).when(beanFactoryMock).getType("return_of_getBeanDefinitionNamesItem1", false);
			Class[] classArray = new Class[] { SmartInitializingSingleton.class };
			lazyInitializationExcludeFilter.when(() -> LazyInitializationExcludeFilter.forBeanTypes(classArray)).thenReturn(lazyInitializationExcludeFilterMock);
			doReturn(false).when(lazyInitializationExcludeFilterMock).isExcluded("return_of_getBeanDefinitionNamesItem1", abstractBeanDefinitionMock, Object.class);
			LazyInitializationBeanFactoryPostProcessor target = new LazyInitializationBeanFactoryPostProcessor();
			//Act Statement(s)
			target.postProcessBeanFactory(beanFactoryMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(beanFactoryMock).getBeansOfType(LazyInitializationExcludeFilter.class, false, false);
				verify(beanFactoryMock).getBeanDefinitionNames();
				verify(beanFactoryMock).getBeanDefinition("return_of_getBeanDefinitionNamesItem1");
				verify(abstractBeanDefinitionMock).getLazyInit();
				verify(abstractBeanDefinitionMock).setLazyInit(true);
				verify(beanFactoryMock).getType("return_of_getBeanDefinitionNamesItem1", false);
				lazyInitializationExcludeFilter.verify(() -> LazyInitializationExcludeFilter.forBeanTypes(classArray), atLeast(1));
				verify(lazyInitializationExcludeFilterMock).isExcluded("return_of_getBeanDefinitionNamesItem1", abstractBeanDefinitionMock, Object.class);
			});
		}
	}
}
