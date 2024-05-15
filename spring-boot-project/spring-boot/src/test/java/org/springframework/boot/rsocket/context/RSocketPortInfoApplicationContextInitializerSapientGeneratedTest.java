package org.springframework.boot.rsocket.context;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class RSocketPortInfoApplicationContextInitializerSapientGeneratedTest {

    //Sapient generated method id: ${initializeTest}, hash: DC8237559C4CE623797ACD72AE287B7A
    @Test()
    void initializeTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ConfigurableApplicationContext applicationContextMock = mock(ConfigurableApplicationContext.class);
        doNothing().when(applicationContextMock).addApplicationListener((ApplicationListener) any());
        RSocketPortInfoApplicationContextInitializer target = new RSocketPortInfoApplicationContextInitializer();
        //Act Statement(s)
        target.initialize(applicationContextMock);
        //Assert statement(s)
        assertAll("result", () -> verify(applicationContextMock).addApplicationListener((ApplicationListener) any()));
    }
}
