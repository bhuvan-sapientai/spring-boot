package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.context.event.ContextRefreshedEvent;
import static org.mockito.Mockito.mock;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ClearCachesApplicationListenerSapientGeneratedTest {

    private final ContextRefreshedEvent contextRefreshedEventMock = mock(ContextRefreshedEvent.class);

    //Sapient generated method id: ${onApplicationEventWhenClassLoaderIsNotNull}, hash: 395080B24F3E7D0369EFC46C1BA7E3A5
    @Test()
    void onApplicationEventWhenClassLoaderIsNotNull() throws Exception {
        /* Branches:
         * (classLoader == null) : false  #  inside clearClassLoaderCaches method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: classLoader - Method: getClass
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ClearCachesApplicationListener target = new ClearCachesApplicationListener();
        //Act Statement(s)
        target.onApplicationEvent(contextRefreshedEventMock);
    }

    //Sapient generated method id: ${onApplicationEventWhenCaughtException}, hash: B9F483382CB871E9EDD1E1A7ED53E1A9
    @Test()
    void onApplicationEventWhenCaughtException() throws Exception {
        /* Branches:
         * (classLoader == null) : false  #  inside clearClassLoaderCaches method
         * (catch-exception (Exception)) : true  #  inside clearClassLoaderCaches method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: classLoader - Method: getClass
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ClearCachesApplicationListener target = new ClearCachesApplicationListener();
        //Act Statement(s)
        target.onApplicationEvent(contextRefreshedEventMock);
    }
}
