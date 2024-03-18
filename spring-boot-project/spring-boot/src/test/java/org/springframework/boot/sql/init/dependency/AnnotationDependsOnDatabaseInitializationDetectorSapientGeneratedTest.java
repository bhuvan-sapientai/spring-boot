package org.springframework.boot.sql.init.dependency;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;

import java.util.HashSet;
import java.lang.annotation.Annotation;
import java.util.Set;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class AnnotationDependsOnDatabaseInitializationDetectorSapientGeneratedTest {

	//Sapient generated method id: ${371149c7-48d2-3388-8b14-0667892d3ed9}, hash: 359B692BAFD6EC81C461CBACE0FEB65F
	@Test()
	void detectWhenBeanFactoryFindAnnotationOnBeanBeanNameDependsOnDatabaseInitializationFalseIsNotNull() throws NoSuchBeanDefinitionException {
		/* Branches:
		 * (for-each(beanFactory.getBeanDefinitionNames())) : true
		 * (beanFactory.findAnnotationOnBean(beanName, DependsOnDatabaseInitialization.class, false) != null) : true
		 */
		//Arrange Statement(s)
		ConfigurableListableBeanFactory beanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		String[] stringArray = new String[] { "return_of_getBeanDefinitionNamesItem1" };
		doReturn(stringArray).when(beanFactoryMock).getBeanDefinitionNames();
		Annotation annotationMock = mock(Annotation.class);
		doReturn(annotationMock).when(beanFactoryMock).findAnnotationOnBean("return_of_getBeanDefinitionNamesItem1", DependsOnDatabaseInitialization.class, false);
		AnnotationDependsOnDatabaseInitializationDetector target = new AnnotationDependsOnDatabaseInitializationDetector();

		//Act Statement(s)
		Set<String> result = target.detect(beanFactoryMock);
		Set<String> stringResultSet = new HashSet<>();
		stringResultSet.add("return_of_getBeanDefinitionNamesItem1");

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(1));
			assertThat(result, containsInAnyOrder(stringResultSet.toArray()));
			verify(beanFactoryMock).getBeanDefinitionNames();
			verify(beanFactoryMock).findAnnotationOnBean("return_of_getBeanDefinitionNamesItem1", DependsOnDatabaseInitialization.class, false);
		});
	}
}
