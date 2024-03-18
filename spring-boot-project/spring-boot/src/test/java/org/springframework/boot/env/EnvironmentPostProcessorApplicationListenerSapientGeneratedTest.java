package org.springframework.boot.env;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class EnvironmentPostProcessorApplicationListenerSapientGeneratedTest {

	private final ConfigurableBootstrapContext configurableBootstrapContextMock = mock(ConfigurableBootstrapContext.class);

	private final ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);

	//Sapient generated method id: ${1007f368-7da2-3cb9-b820-1c034659e2c7}, hash: 3D0DAF47BAD612027B910872D1D7493A
	@Test()
	void withTest() {
		//Arrange Statement(s)
		EnvironmentPostProcessorsFactory environmentPostProcessorsFactoryMock = mock(EnvironmentPostProcessorsFactory.class);
		//Act Statement(s)
		EnvironmentPostProcessorApplicationListener result = EnvironmentPostProcessorApplicationListener.with(environmentPostProcessorsFactoryMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${956065db-e40d-33ca-9e56-4e7b89fbe01d}, hash: B92DD4872CE4215E5E704A729C50F0A0
	@Disabled()
	@Test()
	void supportsEventTypeWhenApplicationFailedEventIsAssignableFromEventType() {
		/* Branches:
		 * (ApplicationEnvironmentPreparedEvent.class.isAssignableFrom(eventType)) : false
		 * (ApplicationPreparedEvent.class.isAssignableFrom(eventType)) : false
		 * (ApplicationFailedEvent.class.isAssignableFrom(eventType)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		EnvironmentPostProcessorApplicationListener target = new EnvironmentPostProcessorApplicationListener();
		//Act Statement(s)
		boolean result = target.supportsEventType(ApplicationEvent.class);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${cc726f45-5bc1-38c4-92d1-29d1e5fff5a4}, hash: F35EC5E82D3038836FA5BAF4AD12458F
	@Test()
	void supportsEventTypeWhenApplicationFailedEventNotIsAssignableFromEventType() {
		/* Branches:
		 * (ApplicationEnvironmentPreparedEvent.class.isAssignableFrom(eventType)) : false
		 * (ApplicationPreparedEvent.class.isAssignableFrom(eventType)) : false
		 * (ApplicationFailedEvent.class.isAssignableFrom(eventType)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		EnvironmentPostProcessorApplicationListener target = new EnvironmentPostProcessorApplicationListener();
		//Act Statement(s)
		boolean result = target.supportsEventType(ApplicationEvent.class);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${96de07db-48db-3b65-be48-c6e3ff3edeb2}, hash: E2F4CAD9BE06FF38C87FCEEC093B53F0
	@Test()
	void onApplicationEventWhenEventNotInstanceOfApplicationFailedEvent() {
		/* Branches:
		 * (event instanceof ApplicationEnvironmentPreparedEvent environmentPreparedEvent) : false
		 * (event instanceof ApplicationPreparedEvent) : true
		 * (event instanceof ApplicationFailedEvent) : false
		 */
		//Arrange Statement(s)
		EnvironmentPostProcessorApplicationListener target = new EnvironmentPostProcessorApplicationListener();
		ApplicationPreparedEvent applicationPreparedEventMock = mock(ApplicationPreparedEvent.class);
		//Act Statement(s)
		target.onApplicationEvent(applicationPreparedEventMock);
	}

	//Sapient generated method id: ${727d1b11-625e-3e25-a64c-fa793f19efdb}, hash: 685A4698E412A298C323C54AB5AA0C39
	@Test()
	void onApplicationEventWhenEventInstanceOfApplicationFailedEvent() {
		/* Branches:
		 * (event instanceof ApplicationEnvironmentPreparedEvent environmentPreparedEvent) : false
		 * (event instanceof ApplicationPreparedEvent) : false
		 * (event instanceof ApplicationFailedEvent) : true
		 */
		//Arrange Statement(s)
		EnvironmentPostProcessorApplicationListener target = new EnvironmentPostProcessorApplicationListener();
		ApplicationFailedEvent applicationFailedEventMock = mock(ApplicationFailedEvent.class);
		//Act Statement(s)
		target.onApplicationEvent(applicationFailedEventMock);
	}

	//Sapient generated method id: ${c8555051-4f1e-37bc-b5f3-56508f098a6f}, hash: 1A7768ACDA1FBF3A49EF74F0AA894711
	@Test()
	void onApplicationEventWhenGetEnvironmentPostProcessorsApplicationGetResourceLoaderEventGetBootstrapContextIsNotEmptyAndEven() {
		/* Branches:
		 * (event instanceof ApplicationEnvironmentPreparedEvent environmentPreparedEvent) : true
		 * (for-each(getEnvironmentPostProcessors(application.getResourceLoader(), event.getBootstrapContext()))) : true  #  inside onApplicationEnvironmentPreparedEvent method
		 * (event instanceof ApplicationPreparedEvent) : false
		 * (event instanceof ApplicationFailedEvent) : false
		 */
		//Arrange Statement(s)
		ApplicationEnvironmentPreparedEvent eventMock = mock(ApplicationEnvironmentPreparedEvent.class);
		ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
		doReturn(configurableEnvironmentMock).when(eventMock).getEnvironment();
		Class[] classArray = new Class[] {};
		SpringApplication springApplication = new SpringApplication(classArray);
		springApplication.setResourceLoader(resourceLoaderMock);
		doReturn(springApplication).when(eventMock).getSpringApplication();
		doReturn(configurableBootstrapContextMock).when(eventMock).getBootstrapContext();
		EnvironmentPostProcessorApplicationListener target = spy(new EnvironmentPostProcessorApplicationListener());
		EnvironmentPostProcessor environmentPostProcessorMock = mock(EnvironmentPostProcessor.class);
		List<EnvironmentPostProcessor> environmentPostProcessorList = new ArrayList<>();
		environmentPostProcessorList.add(environmentPostProcessorMock);
		doReturn(environmentPostProcessorList).when(target).getEnvironmentPostProcessors(resourceLoaderMock, configurableBootstrapContextMock);
		doNothing().when(environmentPostProcessorMock).postProcessEnvironment(configurableEnvironmentMock, springApplication);
		//Act Statement(s)
		target.onApplicationEvent(eventMock);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(eventMock).getEnvironment();
			verify(eventMock).getSpringApplication();
			verify(eventMock).getBootstrapContext();
			verify(target).getEnvironmentPostProcessors(resourceLoaderMock, configurableBootstrapContextMock);
			verify(environmentPostProcessorMock).postProcessEnvironment(configurableEnvironmentMock, springApplication);
		});
	}

	//Sapient generated method id: ${2bed7e45-444e-3b9c-981b-1b0e3688453e}, hash: 7CF8FCD1CC11F09C2690E069B6805D52
	@Test()
	void getEnvironmentPostProcessorsWhenResourceLoaderIsNotNull() {
		/* Branches:
		 * (resourceLoader != null) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: postProcessorsFactory
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		doReturn(classLoader).when(resourceLoaderMock).getClassLoader();
		EnvironmentPostProcessorApplicationListener target = new EnvironmentPostProcessorApplicationListener();
		//Act Statement(s)
		List<EnvironmentPostProcessor> result = target.getEnvironmentPostProcessors(resourceLoaderMock, configurableBootstrapContextMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(0));
			verify(resourceLoaderMock).getClassLoader();
		});
	}

	//Sapient generated method id: ${0d5f8f1a-8613-3f29-b661-3f7d36953dac}, hash: 9FABE34923EF47B709A1BE24F7F25676
	@Disabled()
	@Test()
	void getEnvironmentPostProcessorsWhenResourceLoaderIsNull() {
		/* Branches:
		 * (resourceLoader != null) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: postProcessorsFactory
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		EnvironmentPostProcessorApplicationListener target = new EnvironmentPostProcessorApplicationListener();
		ResourceLoader resourceLoader = null;
		//Act Statement(s)
		List<EnvironmentPostProcessor> result = target.getEnvironmentPostProcessors(resourceLoader, configurableBootstrapContextMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result.size(), equalTo(0)));
	}
}
