package org.springframework.boot.logging;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LoggingInitializationContextSapientGeneratedTest {

	//Sapient generated method id: ${f019944e-8496-33e7-8374-26b000b23952}, hash: 3DAE3438F86D794C19A32766A2E92C2C
	@Test()
	void getEnvironmentTest() {
		//Arrange Statement(s)
		ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
		LoggingInitializationContext target = new LoggingInitializationContext(configurableEnvironmentMock);

		//Act Statement(s)
		Environment result = target.getEnvironment();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(configurableEnvironmentMock)));
	}
}
