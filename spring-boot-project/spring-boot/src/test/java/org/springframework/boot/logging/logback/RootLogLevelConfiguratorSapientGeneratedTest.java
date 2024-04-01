package org.springframework.boot.logging.logback;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import ch.qos.logback.classic.spi.Configurator;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.Logger;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class RootLogLevelConfiguratorSapientGeneratedTest {

	//Sapient generated method id: ${f56d41b4-cf00-3592-bb68-9a89456c3c5f}, hash: B54D65AF5AFF31335464C75E970E4E4F
	@Test()
	void configureTest() {
		//Arrange Statement(s)
		LoggerContext loggerContextMock = mock(LoggerContext.class);
		Logger loggerMock = mock(Logger.class);
		doReturn(loggerMock).when(loggerContextMock).getLogger("ROOT");
		Level level = Level.INFO;
		doNothing().when(loggerMock).setLevel(level);
		RootLogLevelConfigurator target = new RootLogLevelConfigurator();

		//Act Statement(s)
		Configurator.ExecutionStatus result = target.configure(loggerContextMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Configurator.ExecutionStatus.INVOKE_NEXT_IF_ANY));
			verify(loggerContextMock).getLogger("ROOT");
			verify(loggerMock).setLevel(level);
		});
	}
}
