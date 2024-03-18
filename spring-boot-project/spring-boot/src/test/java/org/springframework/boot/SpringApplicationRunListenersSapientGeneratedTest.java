package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.core.env.ConfigurableEnvironment;

import org.apache.commons.logging.impl.NoOpLog;

import org.springframework.core.metrics.StartupStep;

import java.time.Duration;

import org.springframework.core.metrics.ApplicationStartup;

import java.util.ArrayList;

import org.springframework.context.ConfigurableApplicationContext;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringApplicationRunListenersSapientGeneratedTest {

	private final ApplicationStartup applicationStartupMock = mock(ApplicationStartup.class, "applicationStartup");

	private final ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);

	private final ConfigurableBootstrapContext configurableBootstrapContextMock = mock(ConfigurableBootstrapContext.class);

	private final SpringApplicationRunListener springApplicationRunListenerMock = mock(SpringApplicationRunListener.class);

	private final StartupStep startupStepMock = mock(StartupStep.class);

	//Sapient generated method id: ${e962f90a-d38c-3d49-8fc2-74ccfa7107b6}, hash: C35557C71E4580560C219B1459F51F17
	@Test()
	void startingWhenStepActionIsNotNull() {
		/* Branches:
		 * (stepAction != null) : true  #  inside doWithListeners method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		NoOpLog noOpLog = new NoOpLog();
		List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
		springApplicationRunListenerList.add(springApplicationRunListenerMock);
		SpringApplicationRunListeners target = new SpringApplicationRunListeners(noOpLog, springApplicationRunListenerList, applicationStartupMock);
		doReturn(startupStepMock).when(applicationStartupMock).start("spring.boot.application.starting");
		doNothing().when(startupStepMock).end();
		//Act Statement(s)
		target.starting(configurableBootstrapContextMock, Object.class);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(applicationStartupMock).start("spring.boot.application.starting");
			verify(startupStepMock).end();
		});
	}

	//Sapient generated method id: ${bfc8b880-ca54-33a8-bda7-2951f0dab77a}, hash: 773EAFCEC695171A7449D202FD0438D3
	@Test()
	void environmentPreparedWhenStepActionIsNull() {
		/* Branches:
		 * (stepAction != null) : false  #  inside doWithListeners method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		NoOpLog noOpLog = new NoOpLog();
		List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
		springApplicationRunListenerList.add(springApplicationRunListenerMock);
		SpringApplicationRunListeners target = new SpringApplicationRunListeners(noOpLog, springApplicationRunListenerList, applicationStartupMock);
		doReturn(startupStepMock).when(applicationStartupMock).start("spring.boot.application.environment-prepared");
		doNothing().when(startupStepMock).end();
		ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
		//Act Statement(s)
		target.environmentPrepared(configurableBootstrapContextMock, configurableEnvironmentMock);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(applicationStartupMock).start("spring.boot.application.environment-prepared");
			verify(startupStepMock).end();
		});
	}

	//Sapient generated method id: ${cdb73b74-cb37-3076-af07-b9fffacc4c1b}, hash: A663CECC01A54E89CA9A8FF5DCE32EA6
	@Test()
	void contextPreparedWhenStepActionIsNull() {
		/* Branches:
		 * (stepAction != null) : false  #  inside doWithListeners method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		NoOpLog noOpLog = new NoOpLog();
		List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
		springApplicationRunListenerList.add(springApplicationRunListenerMock);
		SpringApplicationRunListeners target = new SpringApplicationRunListeners(noOpLog, springApplicationRunListenerList, applicationStartupMock);
		doReturn(startupStepMock).when(applicationStartupMock).start("spring.boot.application.context-prepared");
		doNothing().when(startupStepMock).end();
		//Act Statement(s)
		target.contextPrepared(configurableApplicationContextMock);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(applicationStartupMock).start("spring.boot.application.context-prepared");
			verify(startupStepMock).end();
		});
	}

	//Sapient generated method id: ${e1956764-521c-385c-9fd1-bccbb44321cd}, hash: 288836C1A67E15DFC0C621D4E8583F56
	@Test()
	void contextLoadedWhenStepActionIsNull() {
		/* Branches:
		 * (stepAction != null) : false  #  inside doWithListeners method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		NoOpLog noOpLog = new NoOpLog();
		List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
		springApplicationRunListenerList.add(springApplicationRunListenerMock);
		SpringApplicationRunListeners target = new SpringApplicationRunListeners(noOpLog, springApplicationRunListenerList, applicationStartupMock);
		doReturn(startupStepMock).when(applicationStartupMock).start("spring.boot.application.context-loaded");
		doNothing().when(startupStepMock).end();
		//Act Statement(s)
		target.contextLoaded(configurableApplicationContextMock);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(applicationStartupMock).start("spring.boot.application.context-loaded");
			verify(startupStepMock).end();
		});
	}

	//Sapient generated method id: ${07a7747c-3a60-3c90-8b84-af633d897081}, hash: AB013E46848229DD413E1A8293CFF058
	@Test()
	void startedWhenStepActionIsNull() {
		/* Branches:
		 * (stepAction != null) : false  #  inside doWithListeners method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		NoOpLog noOpLog = new NoOpLog();
		List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
		springApplicationRunListenerList.add(springApplicationRunListenerMock);
		SpringApplicationRunListeners target = new SpringApplicationRunListeners(noOpLog, springApplicationRunListenerList, applicationStartupMock);
		doReturn(startupStepMock).when(applicationStartupMock).start("spring.boot.application.started");
		doNothing().when(startupStepMock).end();
		Duration duration = Duration.ofDays(0L);
		//Act Statement(s)
		target.started(configurableApplicationContextMock, duration);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(applicationStartupMock).start("spring.boot.application.started");
			verify(startupStepMock).end();
		});
	}

	//Sapient generated method id: ${28a72d44-56d4-3e99-9b41-8c566ef8924a}, hash: 960AB4F7B5347935B4B32EB2A7510CFD
	@Test()
	void readyWhenStepActionIsNull() {
		/* Branches:
		 * (stepAction != null) : false  #  inside doWithListeners method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		NoOpLog noOpLog = new NoOpLog();
		List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
		springApplicationRunListenerList.add(springApplicationRunListenerMock);
		SpringApplicationRunListeners target = new SpringApplicationRunListeners(noOpLog, springApplicationRunListenerList, applicationStartupMock);
		doReturn(startupStepMock).when(applicationStartupMock).start("spring.boot.application.ready");
		doNothing().when(startupStepMock).end();
		Duration duration = Duration.ofDays(0L);
		//Act Statement(s)
		target.ready(configurableApplicationContextMock, duration);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(applicationStartupMock).start("spring.boot.application.ready");
			verify(startupStepMock).end();
		});
	}

	//Sapient generated method id: ${7849c599-17f7-3305-98bd-f03b4dcfef71}, hash: 3AB29E29E0951992D32EF88917DB7447
	@Test()
	void failedWhenStepActionIsNotNull() {
		/* Branches:
		 * (stepAction != null) : true  #  inside doWithListeners method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		NoOpLog noOpLog = new NoOpLog();
		List<SpringApplicationRunListener> springApplicationRunListenerList = new ArrayList<>();
		springApplicationRunListenerList.add(springApplicationRunListenerMock);
		SpringApplicationRunListeners target = new SpringApplicationRunListeners(noOpLog, springApplicationRunListenerList, applicationStartupMock);
		doReturn(startupStepMock).when(applicationStartupMock).start("spring.boot.application.failed");
		doNothing().when(startupStepMock).end();
		Throwable throwable = new Throwable();
		//Act Statement(s)
		target.failed(configurableApplicationContextMock, throwable);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(applicationStartupMock).start("spring.boot.application.failed");
			verify(startupStepMock).end();
		});
	}
}
