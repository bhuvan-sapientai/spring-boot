package org.springframework.boot.web.servlet.context;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.Resource;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class XmlServletWebServerApplicationContextSapientGeneratedTest {

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private XmlServletWebServerApplicationContext target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${setValidatingTest}, hash: 0589BA71A415D92BF5AEA06594621DE3
    @Disabled()
    @Test()
    void setValidatingTest() throws BeanDefinitionStoreException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: reader - Method: loadBeanDefinitions
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        String[] stringArray = new String[] { "resourceNamesItem1" };
        target = new XmlServletWebServerApplicationContext(Object.class, stringArray);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        target.setValidating(false);
    }

    //Sapient generated method id: ${setEnvironmentTest}, hash: 96C2C2839F9D4FF29C9ABBF22350741E
    @Disabled()
    @Test()
    void setEnvironmentTest() throws BeanDefinitionStoreException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: reader - Method: loadBeanDefinitions
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        String[] stringArray = new String[] { "resourceNamesItem1" };
        target = new XmlServletWebServerApplicationContext(Object.class, stringArray);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
        target.setEnvironment(configurableEnvironmentMock);
        ConfigurableEnvironment configurableEnvironmentMock2 = mock(ConfigurableEnvironment.class);
        //Act Statement(s)
        target.setEnvironment(configurableEnvironmentMock2);
    }

    //Sapient generated method id: ${loadTest}, hash: E89AF6C337036A9EEA64DF897C3A4DEA
    @Disabled()
    @Test()
    void loadTest() throws BeanDefinitionStoreException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: reader - Method: loadBeanDefinitions
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        String[] stringArray = new String[] { "resourceNamesItem1" };
        target = new XmlServletWebServerApplicationContext(Object.class, stringArray);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Resource[] resourceArray = new Resource[] {};
        //Act Statement(s)
        target.load(resourceArray);
    }

    //Sapient generated method id: ${load1Test}, hash: B8CF9378B54677B29FEE0A7FB41754B3
    @Disabled()
    @Test()
    void load1Test() throws BeanDefinitionStoreException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: reader - Method: loadBeanDefinitions
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        String[] stringArray = new String[] { "resourceNamesItem1" };
        target = new XmlServletWebServerApplicationContext(Object.class, stringArray);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        String[] stringArray2 = new String[] {};
        //Act Statement(s)
        target.load(stringArray2);
    }

    //Sapient generated method id: ${load2WhenILessThanResourceNamesLength}, hash: 01521806F774CD4DCDB6913AE273153F
    @Disabled()
    @Test()
    void load2WhenILessThanResourceNamesLength() throws BeanDefinitionStoreException {
        /* Branches:
         * (i < resourceNames.length) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: reader - Method: loadBeanDefinitions
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        String[] stringArray = new String[] { "resourceNamesItem1" };
        target = new XmlServletWebServerApplicationContext(Object.class, stringArray);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        target.load(Object.class, stringArray);
    }
}
