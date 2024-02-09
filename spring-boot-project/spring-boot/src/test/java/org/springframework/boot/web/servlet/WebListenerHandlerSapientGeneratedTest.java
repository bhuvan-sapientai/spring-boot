package org.springframework.boot.web.servlet;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.support.AbstractBeanDefinition;

import java.util.Map;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class WebListenerHandlerSapientGeneratedTest {

	//Sapient generated method id: ${bd949d79-f054-32f4-ae2e-9cf080e68447}
	@Test()
	void doHandleTest() throws BeanDefinitionStoreException {
		//Arrange Statement(s)
		AnnotatedBeanDefinition beanDefinitionMock = mock(AnnotatedBeanDefinition.class);
		doReturn("A", "B").when(beanDefinitionMock).getBeanClassName();
		BeanDefinitionRegistry registryMock = mock(BeanDefinitionRegistry.class);
		doNothing().when(registryMock).registerBeanDefinition(eq("BRegistrar"), (AbstractBeanDefinition) any());
		WebListenerHandler target = new WebListenerHandler();
		Map<String, Object> stringObjectMap = new HashMap<>();

		//Act Statement(s)
		target.doHandle(stringObjectMap, beanDefinitionMock, registryMock);

		//Assert statement(s)
		assertAll("result", () -> {
			verify(beanDefinitionMock, times(2)).getBeanClassName();
			verify(registryMock).registerBeanDefinition(eq("BRegistrar"), (AbstractBeanDefinition) any());
		});
	}
}
