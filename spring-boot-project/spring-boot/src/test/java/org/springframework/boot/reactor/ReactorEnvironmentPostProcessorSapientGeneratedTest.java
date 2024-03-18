package org.springframework.boot.reactor;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import org.springframework.core.env.ConfigurableEnvironment;

import reactor.tools.agent.ReactorDebugAgent;

import org.springframework.util.ClassUtils;

import org.mockito.MockedStatic;

import org.springframework.boot.system.JavaVersion;
import org.springframework.boot.SpringApplication;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ReactorEnvironmentPostProcessorSapientGeneratedTest {

	private final ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class);

	private final SpringApplication springApplicationMock = mock(SpringApplication.class);

	//Sapient generated method id: ${19f517d0-7306-3e25-9b24-12d25d7ab65b}, hash: AFC692127AE0B521840B674A0BFCA5E4
	@Disabled()
	@Test()
	void postProcessEnvironmentWhenCaughtExceptionThrowsRuntimeException() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {
		/* Branches:
		 * (ClassUtils.isPresent(REACTOR_DEBUGAGENT_CLASS, null)) : true
		 * (agentEnabled != Boolean.FALSE) : true
		 * (catch-exception (Exception)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type Method
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Class> _class = mockStatic(Class.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			doReturn(false).when(environmentMock).getProperty("spring.reactor.debug-agent.enabled", Boolean.class);
			classUtils.when(() -> ClassUtils.isPresent("reactor.tools.agent.ReactorDebugAgent", null)).thenReturn(true);
			_class.when(() -> Class.forName("reactor.tools.agent.ReactorDebugAgent")).thenReturn(ReactorDebugAgent.class);
			ReactorEnvironmentPostProcessor target = new ReactorEnvironmentPostProcessor();
			//Act Statement(s)
			final RuntimeException result = assertThrows(RuntimeException.class, () -> {
				target.postProcessEnvironment(environmentMock, springApplicationMock);
			});
			Exception exception = new Exception();
			RuntimeException runtimeException = new RuntimeException("Failed to init Reactor's debug agent", exception);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(runtimeException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(exception.getClass())));
				verify(environmentMock).getProperty("spring.reactor.debug-agent.enabled", Boolean.class);
				classUtils.verify(() -> ClassUtils.isPresent("reactor.tools.agent.ReactorDebugAgent", null), atLeast(1));
				_class.verify(() -> Class.forName("reactor.tools.agent.ReactorDebugAgent"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${e0471c5c-9b49-32ff-abd3-3adb69458d5f}, hash: E1F48D606A7E8578DD3A593BBCDD8124
	@Test()
	void postProcessEnvironmentWhenEnvironmentGetPropertySpring_threads_virtual_enabledBooleanFalseAndJavaVersionGetJavaVersionN() throws Exception {
		/* Branches:
		 * (ClassUtils.isPresent(REACTOR_DEBUGAGENT_CLASS, null)) : true
		 * (agentEnabled != Boolean.FALSE) : true
		 * (environment.getProperty("spring.threads.virtual.enabled", boolean.class, false)) : true
		 * (JavaVersion.getJavaVersion().isEqualOrNewerThan(JavaVersion.TWENTY_ONE)) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type Method
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
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
		}
	}
}
