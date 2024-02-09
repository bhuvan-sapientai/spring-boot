package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

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

	//Sapient generated method id: ${5fa17d66-1bc8-3295-b50d-fb7e1715d5d1}
	@Test()
	void getHandlersTest() {
		//Arrange Statement(s)
		SpringApplicationShutdownHook target = new SpringApplicationShutdownHook();
		//Act Statement(s)
		SpringApplicationShutdownHandlers result = target.getHandlers();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${a6c5884d-d60e-3ef1-bfb2-dc6ac62558b9}
	@Test()
	void enableShutdownHookAdditionTest() {
		//Arrange Statement(s)
		SpringApplicationShutdownHook target = new SpringApplicationShutdownHook();
		//Act Statement(s)
		target.enableShutdownHookAddition();
	}

	//Sapient generated method id: ${db2f07c3-8dc8-34f9-b7b8-f9aa50cf9de4}
	@Test()
	void registerApplicationContextWhenSpringApplicationShutdownHook_thisNotInProgress() {
		/* Branches:
		 * (this.shutdownHookAdditionEnabled) : false  #  inside addRuntimeShutdownHookIfNecessary method
		 * (!SpringApplicationShutdownHook.this.inProgress) : true  #  inside assertNotInProgress method
		 */
		//Arrange Statement(s)
		//ConfigurableApplicationContext contextMock = mock(ConfigurableApplicationContext.class);
		//TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
		//doNothing().when(contextMock).addApplicationListener((SpringApplicationShutdownHook.ApplicationContextClosedListener) any());
		//SpringApplicationShutdownHook target = new SpringApplicationShutdownHook();
		//Act Statement(s)
		//target.registerApplicationContext(contextMock);
		//Assert statement(s)
		//assertAll("result", () -> verify(contextMock).addApplicationListener((SpringApplicationShutdownHook.ApplicationContextClosedListener) any()));
	}

	//Sapient generated method id: ${11452a61-4ce2-3c85-8d2d-93b618011beb}
	@Test()
	void addRuntimeShutdownHookTest() {
		//Arrange Statement(s)
		SpringApplicationShutdownHook target = new SpringApplicationShutdownHook();
		//Act Statement(s)
		target.addRuntimeShutdownHook();
	}

	//Sapient generated method id: ${3eff6d2e-abe2-3ef1-a0a9-02b273500446}
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

	//Sapient generated method id: ${7153d33d-00c9-32b1-a364-de416ddc387f}
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

	//Sapient generated method id: ${ef8a815d-5b58-3af3-b941-bad6d059cca5}
	@Test()
	void runTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringApplicationShutdownHook target = new SpringApplicationShutdownHook();
		//Act Statement(s)
		target.run();
	}

	//Sapient generated method id: ${e59fbb13-5f47-38e4-b809-06c6ce5ea7aa}
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

	//Sapient generated method id: ${956fb832-abf7-3971-aedb-c516d557eacc}
	@Test()
	void resetTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringApplicationShutdownHook target = new SpringApplicationShutdownHook();
		//Act Statement(s)
		target.reset();
	}
}
