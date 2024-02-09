package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.context.ConfigurableApplicationContext;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BootstrapContextClosedEventSapientGeneratedTest {

	//Sapient generated method id: ${3c5d8227-ac65-37ed-b203-77bde07c688b}
	@Disabled()
	@Test()
	void getBootstrapContextTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		BootstrapContext bootstrapContextMock = mock(BootstrapContext.class);
		ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		BootstrapContextClosedEvent target = new BootstrapContextClosedEvent(bootstrapContextMock, configurableApplicationContextMock);
		//Act Statement(s)
		BootstrapContext result = target.getBootstrapContext();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}
}
