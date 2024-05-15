package org.springframework.boot.web.server;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.mockito.stubbing.Answer;
import org.springframework.boot.util.LambdaSafe;
import org.mockito.MockitoAnnotations;
import org.springframework.util.Assert;
import java.util.Map;
import java.util.HashMap;
import org.springframework.beans.factory.ListableBeanFactory;
import org.mockito.MockedStatic;
import java.util.function.Consumer;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class WebServerFactoryCustomizerBeanPostProcessorSapientGeneratedTest {

    private final ListableBeanFactory beanFactoryMock = mock(ListableBeanFactory.class, "beanFactory");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private WebServerFactoryCustomizerBeanPostProcessor target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${setBeanFactoryTest}, hash: D92246651BD9AC12CA098D1FD2144AB8
    @Test()
    void setBeanFactoryTest() {
        //Arrange Statement(s)
        ListableBeanFactory listableBeanFactoryMock = mock(ListableBeanFactory.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(ListableBeanFactory.class, listableBeanFactoryMock, "WebServerCustomizerBeanPostProcessor can only be used with a ListableBeanFactory")).thenAnswer((Answer<Void>) invocation -> null);
            target = new WebServerFactoryCustomizerBeanPostProcessor();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.setBeanFactory(listableBeanFactoryMock);
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.isInstanceOf(ListableBeanFactory.class, listableBeanFactoryMock, "WebServerCustomizerBeanPostProcessor can only be used with a ListableBeanFactory"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${postProcessBeforeInitializationWhenThisCustomizersIsNull}, hash: D05BC87C46E9C87A23CC2790CF0ECCE6
    @Test()
    void postProcessBeforeInitializationWhenThisCustomizersIsNull() throws BeansException {
        /* Branches:
         * (bean instanceof WebServerFactory webServerFactory) : true
         * (this.customizers == null) : true  #  inside getCustomizers method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        LambdaSafe.Callbacks lambdaSafeCallbacksMock = mock(LambdaSafe.Callbacks.class);
        WebServerFactory webServerFactoryMock = mock(WebServerFactory.class);
        LambdaSafe.Callbacks lambdaSafeCallbacksMock2 = mock(LambdaSafe.Callbacks.class);
        try (MockedStatic<LambdaSafe> lambdaSafe = mockStatic(LambdaSafe.class)) {
            Object[] objectArray = new Object[] {};
            lambdaSafe.when(() -> LambdaSafe.callbacks(eq(WebServerFactoryCustomizer.class), anyCollection(), eq(webServerFactoryMock), eq(objectArray))).thenReturn(lambdaSafeCallbacksMock);
            doReturn(lambdaSafeCallbacksMock2).when(lambdaSafeCallbacksMock).withLogger(WebServerFactoryCustomizerBeanPostProcessor.class);
            doNothing().when(lambdaSafeCallbacksMock2).invoke((Consumer) any());
            target = new WebServerFactoryCustomizerBeanPostProcessor();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Map<String, Object> stringObjectMap = new HashMap<>();
            doReturn(stringObjectMap).when(beanFactoryMock).getBeansOfType(WebServerFactoryCustomizer.class, false, false);
            //Act Statement(s)
            Object result = target.postProcessBeforeInitialization((Object) webServerFactoryMock, "beanName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(webServerFactoryMock));
                lambdaSafe.verify(() -> LambdaSafe.callbacks(eq(WebServerFactoryCustomizer.class), anyCollection(), eq(webServerFactoryMock), eq(objectArray)));
                verify(lambdaSafeCallbacksMock).withLogger(WebServerFactoryCustomizerBeanPostProcessor.class);
                verify(lambdaSafeCallbacksMock2).invoke((Consumer) any());
                verify(beanFactoryMock).getBeansOfType(WebServerFactoryCustomizer.class, false, false);
            });
        }
    }

    //Sapient generated method id: ${postProcessAfterInitializationTest}, hash: 9F5DB12167273F3459D55AD5BE59AA15
    @Test()
    void postProcessAfterInitializationTest() throws BeansException {
        //Arrange Statement(s)
        target = new WebServerFactoryCustomizerBeanPostProcessor();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Object object = new Object();
        //Act Statement(s)
        Object result = target.postProcessAfterInitialization(object, "beanName1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }
}
