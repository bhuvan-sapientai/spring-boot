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

	private final StartupStep startupStepMock = mock(StartupStep.class);

	//Sapient generated method id: ${e962f90a-d38c-3d49-8fc2-74ccfa7107b6}, hash: CA20E49C48DB04A835F772F0BEBC1118
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

	//Sapient generated method id: ${bfc8b880-ca54-33a8-bda7-2951f0dab77a}, hash: 118498144E7E7C2DD97F1551999CC9A2
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

	//Sapient generated method id: ${cdb73b74-cb37-3076-af07-b9fffacc4c1b}, hash: BD470A42DCD533E0797CE8E1F8640831
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

	//Sapient generated method id: ${e1956764-521c-385c-9fd1-bccbb44321cd}, hash: 9D3F7F2ECA3E36C163A714A3458E3466
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

	//Sapient generated method id: ${07a7747c-3a60-3c90-8b84-af633d897081}, hash: 1249D143C4A3161068A36296B73E953A
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

	//Sapient generated method id: ${28a72d44-56d4-3e99-9b41-8c566ef8924a}, hash: E8CDC87E127FBA204F441E12770ED035
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

	//Sapient generated method id: ${7849c599-17f7-3305-98bd-f03b4dcfef71}, hash: 2B0EE835D55BF183FD0FA2CFA015F955
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
