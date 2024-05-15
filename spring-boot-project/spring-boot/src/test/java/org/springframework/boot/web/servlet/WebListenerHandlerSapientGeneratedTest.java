package org.springframework.boot.web.servlet;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanDefinitionStoreException;
import java.util.Map;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.config.BeanDefinition;
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

    //Sapient generated method id: ${doHandleTest}, hash: 264927D23E3658B8C54132C1561488EB
    @Test()
    void doHandleTest() throws BeanDefinitionStoreException {
        //Arrange Statement(s)
        AnnotatedBeanDefinition beanDefinitionMock = mock(AnnotatedBeanDefinition.class);
        doReturn("A", "B").when(beanDefinitionMock).getBeanClassName();
        BeanDefinitionRegistry registryMock = mock(BeanDefinitionRegistry.class);
        doNothing().when(registryMock).registerBeanDefinition(eq("BRegistrar"), (BeanDefinition) any());
        WebListenerHandler target = new WebListenerHandler();
        Map<String, Object> stringObjectMap = new HashMap<>();
        
        //Act Statement(s)
        target.doHandle(stringObjectMap, beanDefinitionMock, registryMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(beanDefinitionMock, times(2)).getBeanClassName();
            verify(registryMock).registerBeanDefinition(eq("BRegistrar"), (BeanDefinition) any());
        });
    }
}
