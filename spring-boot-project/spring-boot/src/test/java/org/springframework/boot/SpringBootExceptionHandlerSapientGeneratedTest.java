package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.lang.reflect.InvocationTargetException;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringBootExceptionHandlerSapientGeneratedTest {

    private final Thread.UncaughtExceptionHandler threadUncaughtExceptionHandlerMock = mock(Thread.UncaughtExceptionHandler.class);

    //Sapient generated method id: ${registerLoggedExceptionTest}, hash: 0BF5B1068A154160064C674D2821FF96
    @Test()
    void registerLoggedExceptionTest() {
        //Arrange Statement(s)
        SpringBootExceptionHandler target = new SpringBootExceptionHandler(threadUncaughtExceptionHandlerMock);
        Throwable throwable = new Throwable();
        //Act Statement(s)
        target.registerLoggedException(throwable);
    }

    //Sapient generated method id: ${registerExitCodeTest}, hash: CC84A454BEF31CB6696B21AEE88FCB6E
    @Test()
    void registerExitCodeTest() {
        //Arrange Statement(s)
        SpringBootExceptionHandler target = new SpringBootExceptionHandler(threadUncaughtExceptionHandlerMock);
        //Act Statement(s)
        target.registerExitCode(0);
    }

    //Sapient generated method id: ${uncaughtExceptionWhenIsPassedToParentNotExAndThisExitCodeEquals0}, hash: B5016393168398CB51C56D59C12FA814
    @Test()
    void uncaughtExceptionWhenIsPassedToParentNotExAndThisExitCodeEquals0() {
        /* Branches:
         * (ex instanceof InvocationTargetException) : true  #  inside isLogConfigurationMessage method
         * (isLogConfigurationMessage(ex)) : false  #  inside isPassedToParent method
         * (this.loggedExceptions.contains(ex)) : false  #  inside isRegistered method
         * (ex instanceof InvocationTargetException) : true  #  inside isRegistered method
         * (!isRegistered(ex)) : false  #  inside isPassedToParent method
         * (isPassedToParent(ex)) : false
         * (this.exitCode != 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SpringBootExceptionHandler target = new SpringBootExceptionHandler(threadUncaughtExceptionHandlerMock);
        Thread thread = new Thread();
        Throwable throwable = new Throwable();
        InvocationTargetException invocationTargetException = new InvocationTargetException(throwable);
        //Act Statement(s)
        target.uncaughtException(thread, invocationTargetException);
    }

    //Sapient generated method id: ${uncaughtExceptionWhenThisParentIsNotNullAndThisExitCodeEquals0}, hash: B9CBB69327F11E4B6BE6F251F1E47D05
    @Test()
    void uncaughtExceptionWhenThisParentIsNotNullAndThisExitCodeEquals0() {
        /* Branches:
         * (ex instanceof InvocationTargetException) : true  #  inside isLogConfigurationMessage method
         * (isLogConfigurationMessage(ex)) : false  #  inside isPassedToParent method
         * (this.loggedExceptions.contains(ex)) : false  #  inside isRegistered method
         * (ex instanceof InvocationTargetException) : true  #  inside isRegistered method
         * (!isRegistered(ex)) : true  #  inside isPassedToParent method
         * (isPassedToParent(ex)) : true
         * (this.parent != null) : true
         * (this.exitCode != 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SpringBootExceptionHandler target = new SpringBootExceptionHandler(threadUncaughtExceptionHandlerMock);
        Thread thread = new Thread();
        Throwable throwable = new Throwable();
        InvocationTargetException invocationTargetException = new InvocationTargetException(throwable);
        //Act Statement(s)
        target.uncaughtException(thread, invocationTargetException);
    }

    //Sapient generated method id: ${uncaughtExceptionWhenIsPassedToParentExAndThisParentIsNullAndThisExitCodeEquals0}, hash: 343F415EBBF0E7DB5B8824936356F2E5
    @Test()
    void uncaughtExceptionWhenIsPassedToParentExAndThisParentIsNullAndThisExitCodeEquals0() {
        /* Branches:
         * (ex instanceof InvocationTargetException) : false  #  inside isLogConfigurationMessage method
         * (message != null) : true  #  inside isLogConfigurationMessage method
         * (for-each(LOG_CONFIGURATION_MESSAGES)) : true  #  inside isLogConfigurationMessage method
         * (message.contains(candidate)) : true  #  inside isLogConfigurationMessage method
         * (isLogConfigurationMessage(ex)) : true  #  inside isPassedToParent method
         * (isPassedToParent(ex)) : true
         * (this.parent != null) : false
         * (this.exitCode != 0) : false
         */
        //Arrange Statement(s)
        SpringBootExceptionHandler target = new SpringBootExceptionHandler((Thread.UncaughtExceptionHandler) null);
        Thread thread = new Thread();
        Throwable throwable = new Throwable("Logback configuration error detected");
        //Act Statement(s)
        target.uncaughtException(thread, throwable);
    }

    //Sapient generated method id: ${uncaughtExceptionWhenExNotInstanceOfInvocationTargetExceptionAndIsRegisteredNotExAndIsPassedToParentExAndThisParentIsNu}, hash: ACAC46D8B917F20D9DACA71F8F97B595
    @Test()
    void uncaughtExceptionWhenExNotInstanceOfInvocationTargetExceptionAndIsRegisteredNotExAndIsPassedToParentExAndThisParentIsNu() {
        /* Branches:
         * (ex instanceof InvocationTargetException) : false  #  inside isLogConfigurationMessage method
         * (message != null) : true  #  inside isLogConfigurationMessage method
         * (for-each(LOG_CONFIGURATION_MESSAGES)) : true  #  inside isLogConfigurationMessage method
         * (message.contains(candidate)) : false  #  inside isLogConfigurationMessage method
         * (isLogConfigurationMessage(ex)) : false  #  inside isPassedToParent method
         * (this.loggedExceptions.contains(ex)) : false  #  inside isRegistered method
         * (ex instanceof InvocationTargetException) : false  #  inside isRegistered method
         * (!isRegistered(ex)) : true  #  inside isPassedToParent method
         * (isPassedToParent(ex)) : true
         * (this.parent != null) : false
         * (this.exitCode != 0) : false
         */
        //Arrange Statement(s)
        SpringBootExceptionHandler target = new SpringBootExceptionHandler((Thread.UncaughtExceptionHandler) null);
        Thread thread = new Thread();
        Throwable throwable = new Throwable("A");
        //Act Statement(s)
        target.uncaughtException(thread, throwable);
    }

    //Sapient generated method id: ${forCurrentThreadTest}, hash: F12F513F7CE3A443058B43B7961308AF
    @Test()
    void forCurrentThreadTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: handler - Method: get
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        SpringBootExceptionHandler result = SpringBootExceptionHandler.forCurrentThread();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
