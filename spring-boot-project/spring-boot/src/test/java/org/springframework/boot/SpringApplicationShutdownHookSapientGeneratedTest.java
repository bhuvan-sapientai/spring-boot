package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.Assert;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringApplicationShutdownHookSapientGeneratedTest {

    private final ConfigurableApplicationContext applicationContextMock = mock(ConfigurableApplicationContext.class);

    //Sapient generated method id: ${getHandlersTest}, hash: 3983F8677D67FDE96C22C33886C1F982
    @Test()
    void getHandlersTest() {
        //Arrange Statement(s)
        SpringApplicationShutdownHook target = new SpringApplicationShutdownHook();
        //Act Statement(s)
        SpringApplicationShutdownHandlers result = target.getHandlers();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${enableShutdownHookAdditionTest}, hash: D3CC0DEB795D853BCED1CC6357AC8E3D
    @Test()
    void enableShutdownHookAdditionTest() {
        //Arrange Statement(s)
        SpringApplicationShutdownHook target = new SpringApplicationShutdownHook();
        //Act Statement(s)
        target.enableShutdownHookAddition();
    }

    //Sapient generated method id: ${registerApplicationContextWhenSpringApplicationShutdownHook_thisNotInProgress}, hash: 8EC96A669D1C17DF4A42B190023112D3
    @Test()
    void registerApplicationContextWhenSpringApplicationShutdownHook_thisNotInProgress() {
        /* Branches:
         * (this.shutdownHookAdditionEnabled) : false  #  inside addRuntimeShutdownHookIfNecessary method
         * (!SpringApplicationShutdownHook.this.inProgress) : true  #  inside assertNotInProgress method
         */
        //Arrange Statement(s)
        //ConfigurableApplicationContext contextMock = mock(ConfigurableApplicationContext.class);
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //doNothing().when(contextMock).addApplicationListener((ApplicationListener) any());
        //SpringApplicationShutdownHook target = new SpringApplicationShutdownHook();
        //Act Statement(s)
        //target.registerApplicationContext(contextMock);
        //Assert statement(s)
        //assertAll("result", () -> verify(contextMock).addApplicationListener((ApplicationListener) any()));
    }

    //Sapient generated method id: ${addRuntimeShutdownHookTest}, hash: 55F3338DEC0674513412EBB71968070B
    @Test()
    void addRuntimeShutdownHookTest() {
        //Arrange Statement(s)
        SpringApplicationShutdownHook target = new SpringApplicationShutdownHook();
        //Act Statement(s)
        target.addRuntimeShutdownHook();
    }

    //Sapient generated method id: ${deregisterFailedApplicationContextWhenApplicationContextNotIsActive}, hash: F7A0C0933BFE089F7E4BF6E50E64E142
    @Test()
    void deregisterFailedApplicationContextWhenApplicationContextNotIsActive() {
        /* Branches:
         * (!applicationContext.isActive()) : true
         */
        //Arrange Statement(s)
        doReturn(false).when(applicationContextMock).isActive();
        SpringApplicationShutdownHook target = new SpringApplicationShutdownHook();
        //Act Statement(s)
        target.deregisterFailedApplicationContext(applicationContextMock);
        //Assert statement(s)
        assertAll("result", () -> verify(applicationContextMock).isActive());
    }

    //Sapient generated method id: ${deregisterFailedApplicationContextWhenApplicationContextIsActive}, hash: 567EC8B0297E22E579A6BEE7BFA039FB
    @Test()
    void deregisterFailedApplicationContextWhenApplicationContextIsActive() {
        /* Branches:
         * (!applicationContext.isActive()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(true).when(applicationContextMock).isActive();
            _assert.when(() -> Assert.state(false, "Cannot unregister active application context")).thenAnswer((Answer<Void>) invocation -> null);
            SpringApplicationShutdownHook target = new SpringApplicationShutdownHook();
            //Act Statement(s)
            target.deregisterFailedApplicationContext(applicationContextMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(applicationContextMock).isActive();
                _assert.verify(() -> Assert.state(false, "Cannot unregister active application context"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${runTest}, hash: 12D4C6141BD470D6B8F7918F4BC7E5E9
    @Test()
    void runTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: handlers - Method: getActions
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SpringApplicationShutdownHook target = new SpringApplicationShutdownHook();
        //Act Statement(s)
        target.run();
    }

    //Sapient generated method id: ${isApplicationContextRegisteredTest}, hash: 5227F943B28FBA821FF2788C7E695AD2
    @Test()
    void isApplicationContextRegisteredTest() {
        //Arrange Statement(s)
        SpringApplicationShutdownHook target = new SpringApplicationShutdownHook();
        ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
        //Act Statement(s)
        boolean result = target.isApplicationContextRegistered(configurableApplicationContextMock);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${resetTest}, hash: AB55D7B5AC781384D011C457AE3EC602
    @Test()
    void resetTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: handlers - Method: getActions
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SpringApplicationShutdownHook target = new SpringApplicationShutdownHook();
        //Act Statement(s)
        target.reset();
    }
}
