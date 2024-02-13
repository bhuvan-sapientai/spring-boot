package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigDataEnvironmentContributorPlaceholdersResolverSapientGeneratedTest {

	private final ConfigDataActivationContext configDataActivationContextMock = mock(ConfigDataActivationContext.class);

	private final ConfigDataEnvironmentContributor configDataEnvironmentContributorMock = mock(ConfigDataEnvironmentContributor.class);

	//Sapient generated method id: ${92f654c1-59d0-3f5f-8724-669bbd7eff5a}
	@Disabled()
	@Test()
	void resolvePlaceholdersWhenValueInstanceOfString() {
		/* Branches:
		 * (value instanceof String string) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: helper
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigDataEnvironmentContributorPlaceholdersResolver target = new ConfigDataEnvironmentContributorPlaceholdersResolver((Iterable) null, configDataActivationContextMock, configDataEnvironmentContributorMock, false);
		//Act Statement(s)
		Object result = target.resolvePlaceholders("value1");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("return_of_replacePlaceholders1")));
	}

	//Sapient generated method id: ${2e755de7-a01c-3580-9542-15932e99692f}
	@Test()
	void resolvePlaceholdersWhenValueNotInstanceOfString() {
		/* Branches:
		 * (value instanceof String string) : false
		 */
		//Arrange Statement(s)
		ConfigDataEnvironmentContributorPlaceholdersResolver target = new ConfigDataEnvironmentContributorPlaceholdersResolver((Iterable) null, configDataActivationContextMock, configDataEnvironmentContributorMock, false);
		Object object = new Object();
		//Act Statement(s)
		Object result = target.resolvePlaceholders(object);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(object)));
	}
}
