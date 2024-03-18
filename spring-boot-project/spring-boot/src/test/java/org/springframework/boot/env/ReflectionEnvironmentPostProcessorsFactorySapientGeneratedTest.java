package org.springframework.boot.env;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.logging.DeferredLogFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ReflectionEnvironmentPostProcessorsFactorySapientGeneratedTest {

	//Sapient generated method id: ${13700995-cb06-3995-a07e-88c400f68ae3}, hash: 2EA55611806490AA7DCFD1D16AE58A2C
	@Test()
	void getEnvironmentPostProcessorsWhenThisClassesIsNull() {
		/* Branches:
		 * (this.classes != null) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: instantiator
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		String[] stringArray = new String[] {};
		ReflectionEnvironmentPostProcessorsFactory target = new ReflectionEnvironmentPostProcessorsFactory(classLoader, stringArray);
		DeferredLogFactory deferredLogFactoryMock = mock(DeferredLogFactory.class);
		ConfigurableBootstrapContext configurableBootstrapContextMock = mock(ConfigurableBootstrapContext.class);
		//Act Statement(s)
		List<EnvironmentPostProcessor> result = target.getEnvironmentPostProcessors(deferredLogFactoryMock, configurableBootstrapContextMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result.size(), equalTo(0)));
	}
}
