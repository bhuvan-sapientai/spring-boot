package org.springframework.boot.reactor;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.env.ConfigurableEnvironment;

import reactor.tools.agent.ReactorDebugAgent;

import org.springframework.util.ClassUtils;

import org.mockito.MockedStatic;

import org.springframework.boot.system.JavaVersion;
import org.springframework.boot.SpringApplication;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ReactorEnvironmentPostProcessorSapientGeneratedTest {

	//Sapient generated method id: ${19f517d0-7306-3e25-9b24-12d25d7ab65b}
	@Test()
	void postProcessEnvironmentWhenCaughtExceptionThrowsRuntimeException() {
		/* Branches:
		 * (ClassUtils.isPresent(REACTOR_DEBUGAGENT_CLASS, null)) : true
		 * (agentEnabled != Boolean.FALSE) : true
		 * (catch-exception (Exception)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class, "true");
        /*try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
    doReturn(false).when(environmentMock).getProperty("spring.reactor.debug-agent.enabled", Boolean.class);
    doReturn(null).when(environmentMock).getProperty("spring.threads.virtual.enabled", ReactorDebugAgent.class, false);
    classUtils.when(() -> ClassUtils.isPresent("reactor.tools.agent.ReactorDebugAgent", null)).thenReturn(true);
    ReactorEnvironmentPostProcessor target = new ReactorEnvironmentPostProcessor();
    Class[] classArray = new Class[] {};
    SpringApplication springApplication = new SpringApplication(classArray);
    //Act Statement(s)
    final NullPointerException result = assertThrows(NullPointerException.class, () -> {
        target.postProcessEnvironment(environmentMock, springApplication);
    });
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(notNullValue()));
        verify(environmentMock).getProperty("spring.reactor.debug-agent.enabled", Boolean.class);
        verify(environmentMock).getProperty("spring.threads.virtual.enabled", ReactorDebugAgent.class, false);
        classUtils.verify(() -> ClassUtils.isPresent("reactor.tools.agent.ReactorDebugAgent", null), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${e0471c5c-9b49-32ff-abd3-3adb69458d5f}
	@Test()
	void postProcessEnvironmentWhenEnvironmentGetPropertySpring_threads_virtual_enabledBooleanFalseAndJavaVersionGetJavaVersionN() throws Exception {
		/* Branches:
		 * (ClassUtils.isPresent(REACTOR_DEBUGAGENT_CLASS, null)) : true
		 * (agentEnabled != Boolean.FALSE) : true
		 * (environment.getProperty("spring.threads.virtual.enabled", boolean.class, false)) : true
		 * (JavaVersion.getJavaVersion().isEqualOrNewerThan(JavaVersion.TWENTY_ONE)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class);
		//SpringApplication springApplicationMock = mock(SpringApplication.class);
        /*try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
    doReturn(false).when(environmentMock).getProperty("spring.reactor.debug-agent.enabled", Boolean.class);
    doReturn(true).when(environmentMock).getProperty("spring.threads.virtual.enabled", boolean.class, false);
    classUtils.when(() -> ClassUtils.isPresent("reactor.tools.agent.ReactorDebugAgent", null)).thenReturn(true);
    ReactorEnvironmentPostProcessor target = new ReactorEnvironmentPostProcessor();
    //Act Statement(s)
    target.postProcessEnvironment(environmentMock, springApplicationMock);
    //Assert statement(s)
    assertAll("result", () -> {
        verify(environmentMock).getProperty("spring.reactor.debug-agent.enabled", Boolean.class);
        verify(environmentMock).getProperty("spring.threads.virtual.enabled", boolean.class, false);
        classUtils.verify(() -> ClassUtils.isPresent("reactor.tools.agent.ReactorDebugAgent", null), atLeast(1));
    });
}*/
	}
}
