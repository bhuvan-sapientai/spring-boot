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

	//Sapient generated method id: ${6900b201-d101-33a9-a69b-7a761e98aa93}, hash: DC8237559C4CE623797ACD72AE287B7A
	@Test()
	void initializeTest() {
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
