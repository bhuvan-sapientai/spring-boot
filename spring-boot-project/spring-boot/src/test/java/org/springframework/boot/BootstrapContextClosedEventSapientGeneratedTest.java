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

	//Sapient generated method id: ${3c5d8227-ac65-37ed-b203-77bde07c688b}, hash: 8E80A5171FF32C986676547EAC524715
	@Disabled()
	@Test()
	void getBootstrapContextTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Method java.lang.System::currentTimeMillis has a unrepeatable behavior
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
