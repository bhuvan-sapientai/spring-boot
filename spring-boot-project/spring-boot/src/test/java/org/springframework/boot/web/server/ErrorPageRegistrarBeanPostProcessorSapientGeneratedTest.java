package org.springframework.boot.web.server;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.mockito.stubbing.Answer;
import org.mockito.MockitoAnnotations;
import org.springframework.util.Assert;
import java.util.Map;
import java.util.HashMap;
import org.springframework.beans.factory.ListableBeanFactory;
import org.mockito.MockedStatic;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ErrorPageRegistrarBeanPostProcessorSapientGeneratedTest {

    private final ListableBeanFactory beanFactoryMock = mock(ListableBeanFactory.class, "beanFactory");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private ErrorPageRegistrarBeanPostProcessor target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${setBeanFactoryTest}, hash: 4D0A636037EB26643298BF5A56108FA5
    @Test()
    void setBeanFactoryTest() {
        //Arrange Statement(s)
        ListableBeanFactory listableBeanFactoryMock = mock(ListableBeanFactory.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(ListableBeanFactory.class, listableBeanFactoryMock, "ErrorPageRegistrarBeanPostProcessor can only be used with a ListableBeanFactory")).thenAnswer((Answer<Void>) invocation -> null);
            target = new ErrorPageRegistrarBeanPostProcessor();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.setBeanFactory(listableBeanFactoryMock);
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.isInstanceOf(ListableBeanFactory.class, listableBeanFactoryMock, "ErrorPageRegistrarBeanPostProcessor can only be used with a ListableBeanFactory"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${postProcessBeforeInitializationWhenGetRegistrarsIsEmpty}, hash: FA5CE8AE74C253AB9760D66E4892D0A1
    @Test()
    void postProcessBeforeInitializationWhenGetRegistrarsIsEmpty() throws BeansException {
        /* Branches:
         * (bean instanceof ErrorPageRegistry errorPageRegistry) : true
         * (this.registrars == null) : true  #  inside getRegistrars method
         * (for-each(getRegistrars())) : false  #  inside postProcessBeforeInitialization method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        target = new ErrorPageRegistrarBeanPostProcessor();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Map<String, Object> stringObjectMap = new HashMap<>();
        doReturn(stringObjectMap).when(beanFactoryMock).getBeansOfType(ErrorPageRegistrar.class, false, false);
        ErrorPageRegistry errorPageRegistryMock = mock(ErrorPageRegistry.class);
        //Act Statement(s)
        Object result = target.postProcessBeforeInitialization((Object) errorPageRegistryMock, "beanName1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(errorPageRegistryMock));
            verify(beanFactoryMock).getBeansOfType(ErrorPageRegistrar.class, false, false);
        });
    }

    //Sapient generated method id: ${postProcessAfterInitializationTest}, hash: 5FA455014C34335C2CCC9CD6E1CF1427
    @Test()
    void postProcessAfterInitializationTest() throws BeansException {
        //Arrange Statement(s)
        target = new ErrorPageRegistrarBeanPostProcessor();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Object object = new Object();
        //Act Statement(s)
        Object result = target.postProcessAfterInitialization(object, "beanName1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }
}
