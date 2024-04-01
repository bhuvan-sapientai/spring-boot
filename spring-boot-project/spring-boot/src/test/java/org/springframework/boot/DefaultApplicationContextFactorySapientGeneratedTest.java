package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.context.ConfigurableApplicationContext;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DefaultApplicationContextFactorySapientGeneratedTest {

	//Sapient generated method id: ${4fb13b9d-54c0-37b3-a7bb-f64781f5267e}, hash: 8C8320AB33F8A4B7A2B65CF9A10EB074
	@Test()
	void getEnvironmentTypeWhenDefaultResultIsNull() {
		/* Branches:
		 * (for-each(SpringFactoriesLoader.loadFactories(ApplicationContextFactory.class, getClass().getClassLoader()))) : false  #  inside getFromSpringFactories method
		 * (defaultResult != null) : false  #  inside getFromSpringFactories method
		 */
		//Arrange Statement(s)
		DefaultApplicationContextFactory target = new DefaultApplicationContextFactory();
		//Act Statement(s)
		Class<? extends ConfigurableEnvironment> result = target.getEnvironmentType(WebApplicationType.NONE);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${5cdb8ff5-ee8f-3eda-9d3e-ab5884f8a7a9}, hash: 8E126FD0E3ADCD09A9A76099007D6C52
	@Test()
	void createEnvironmentWhenDefaultResultIsNull() {
		/* Branches:
		 * (for-each(SpringFactoriesLoader.loadFactories(ApplicationContextFactory.class, getClass().getClassLoader()))) : false  #  inside getFromSpringFactories method
		 * (defaultResult != null) : false  #  inside getFromSpringFactories method
		 */
		//Arrange Statement(s)
		DefaultApplicationContextFactory target = new DefaultApplicationContextFactory();
		//Act Statement(s)
		ConfigurableEnvironment result = target.createEnvironment(WebApplicationType.NONE);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${bbe32026-5a22-3f22-adc4-025cdf60976d}, hash: 7DA8ADA7A0FD4A8D3417F42DC3DEEED7
	@Test()
	void createWhenDefaultResultIsNotNull() throws Exception {
		/* Branches:
		 * (for-each(SpringFactoriesLoader.loadFactories(ApplicationContextFactory.class, getClass().getClassLoader()))) : false  #  inside getFromSpringFactories method
		 * (defaultResult != null) : true  #  inside getFromSpringFactories method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: defaultResult - Method: get
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultApplicationContextFactory target = new DefaultApplicationContextFactory();
		//Act Statement(s)
		ConfigurableApplicationContext result = target.create(WebApplicationType.NONE);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${814a259f-c686-3510-912b-232b6fed8683}, hash: 3DD587FE2E6DF29F275FE1A7674D98DA
	@Disabled()
	@Test()
	void createWhenCaughtExceptionThrowsIllegalStateException() {
		/* Branches:
		 * (for-each(SpringFactoriesLoader.loadFactories(ApplicationContextFactory.class, getClass().getClassLoader()))) : false  #  inside getFromSpringFactories method
		 * (defaultResult != null) : true  #  inside getFromSpringFactories method
		 * (catch-exception (Exception)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: defaultResult - Method: get
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultApplicationContextFactory target = new DefaultApplicationContextFactory();
		Exception exception = new Exception();
		IllegalStateException illegalStateException = new IllegalStateException("Unable create a default ApplicationContext instance, you may need a custom ApplicationContextFactory", exception);
		//Act Statement(s)
		final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
			target.create(WebApplicationType.NONE);
		});
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
			assertThat(result.getCause(), is(instanceOf(exception.getClass())));
		});
	}
}
