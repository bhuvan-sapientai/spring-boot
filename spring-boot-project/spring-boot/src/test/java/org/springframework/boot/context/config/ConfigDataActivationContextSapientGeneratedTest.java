package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.cloud.CloudPlatform;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigDataActivationContextSapientGeneratedTest {

	private final Profiles profilesMock = mock(Profiles.class);

	//Sapient generated method id: ${5cd7e44a-e1d9-3443-b4f2-0a8bc6a9be23}
	@Disabled()
	@Test()
	void withProfilesTest() {
		//Arrange Statement(s)
		ConfigDataActivationContext target = new ConfigDataActivationContext(CloudPlatform.NONE, profilesMock);
		Profiles profilesMock2 = mock(Profiles.class);
		//Act Statement(s)
		ConfigDataActivationContext result = target.withProfiles(profilesMock2);
		ConfigDataActivationContext configDataActivationContext = new ConfigDataActivationContext(CloudPlatform.NONE, profilesMock2);
		//Assert statement(s)
		//TODO: Please implement equals method in ConfigDataActivationContext for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(configDataActivationContext)));
	}

	//Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
	@Disabled()
	@Test()
	void toStringTest() {
		/**
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: creator
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigDataActivationContext target = new ConfigDataActivationContext(CloudPlatform.NONE, profilesMock);
		//Act Statement(s)
		String result = target.toString();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("result1")));
	}
}
