package org.springframework.boot.web.servlet;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.aot.BeanFactoryInitializationAotContribution;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ServletComponentRegisteringPostProcessorSapientGeneratedTest {

    private final ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);

    //Sapient generated method id: ${postProcessBeanFactoryWhenIsRunningInEmbeddedWebServerNot}, hash: 9C5937BBA305EED81C704FD9CC4AC314
    @Test()
    void postProcessBeanFactoryWhenIsRunningInEmbeddedWebServerNot() throws BeansException {
        /* Branches:
         * (this.applicationContext instanceof WebApplicationContext webApplicationContext) : false  #  inside isRunningInEmbeddedWebServer method
         * (isRunningInEmbeddedWebServer()) : false
         */
        //Arrange Statement(s)
        Set<String> stringSet = new HashSet<>();
        ServletComponentRegisteringPostProcessor target = new ServletComponentRegisteringPostProcessor(stringSet);
        //Act Statement(s)
        target.postProcessBeanFactory(configurableListableBeanFactoryMock);
    }

    //Sapient generated method id: ${getPackagesToScanTest}, hash: 31D187844010E0418CE9B6634B95AAB7
    @Test()
    void getPackagesToScanTest() {
        //Arrange Statement(s)
        Set<String> stringSet = new HashSet<>();
        ServletComponentRegisteringPostProcessor target = new ServletComponentRegisteringPostProcessor(stringSet);
        //Act Statement(s)
        Set<String> result = target.getPackagesToScan();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${processAheadOfTimeTest}, hash: 187A08BFAEED231153814ABB50AA8E91
    @Test()
    void processAheadOfTimeTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Set<String> stringSet = new HashSet<>();
        ServletComponentRegisteringPostProcessor target = new ServletComponentRegisteringPostProcessor(stringSet);
        //Act Statement(s)
        BeanFactoryInitializationAotContribution result = target.processAheadOfTime(configurableListableBeanFactoryMock);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
