package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringBootExceptionHandlerSapientGeneratedTest {

	//Sapient generated method id: ${4f168c6e-8453-345a-ab13-d076ff1ef3ab}
	@Test()
	void registerLoggedExceptionTest() {
		//Arrange Statement(s)
		SpringBootExceptionHandler target = new SpringBootExceptionHandler((Thread.UncaughtExceptionHandler) null);
		Throwable throwable = new Throwable();
		//Act Statement(s)
		target.registerLoggedException(throwable);
	}

	//Sapient generated method id: ${6f4b4b28-4c05-3426-87e0-6010c54b0d0e}
	@Test()
	void registerExitCodeTest() {
		//Arrange Statement(s)
		SpringBootExceptionHandler target = new SpringBootExceptionHandler((Thread.UncaughtExceptionHandler) null);
		//Act Statement(s)
		target.registerExitCode(0);
	}

	//Sapient generated method id: ${b81a65c8-b54b-3e11-9652-52fc30fde75b}
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
		SpringBootExceptionHandler target = new SpringBootExceptionHandler((Thread.UncaughtExceptionHandler) null);
		Thread thread = new Thread();
		Throwable throwable = new Throwable();
		InvocationTargetException invocationTargetException = new InvocationTargetException(throwable);
		//Act Statement(s)
		target.uncaughtException(thread, invocationTargetException);
	}

	//Sapient generated method id: ${c6245612-a7b9-3acd-800a-357cea3c4237}
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
		SpringBootExceptionHandler target = new SpringBootExceptionHandler((Thread.UncaughtExceptionHandler) null);
		Thread thread = new Thread();
		Throwable throwable = new Throwable();
		InvocationTargetException invocationTargetException = new InvocationTargetException(throwable);
		//Act Statement(s)
		target.uncaughtException(thread, invocationTargetException);
	}

	//Sapient generated method id: ${22aeb6f9-f7d0-36f1-9d00-a753ad3c4ac2}
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

	//Sapient generated method id: ${f1137bbe-ec66-304d-94e3-add3b6d4d607}
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

	//Sapient generated method id: ${dd7b4711-cd13-3035-a9b4-1184deb42a34}
	@Test()
	void forCurrentThreadTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Act Statement(s)
		SpringBootExceptionHandler result = SpringBootExceptionHandler.forCurrentThread();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
