package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DefaultApplicationArgumentsSapientGeneratedTest {

	//Sapient generated method id: ${d2414361-7062-3586-8b2a-49269806ef5b}, hash: A2CA7D2E13A4EBA5AADAD4981D0F3E36
	@Test()
	void getOptionNamesTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: source
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		String[] stringArray = new String[] { "valid_value" };
		DefaultApplicationArguments target = new DefaultApplicationArguments(stringArray);
		//Act Statement(s)
		Set<String> result = target.getOptionNames();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result.size(), equalTo(0)));
	}

	//Sapient generated method id: ${87ed1ead-768f-3f72-a33e-c86f6ee508ae}, hash: C855591034E3D26150C24CC0DDEBCE77
	@Disabled()
	@Test()
	void containsOptionWhenThisSourceContainsPropertyName() {
		/* Branches:
		 * (this.source.containsProperty(name)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: source
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		String[] stringArray = new String[] { "arg1", "arg2" };
		DefaultApplicationArguments target = new DefaultApplicationArguments(stringArray);
		//Act Statement(s)
		boolean result = target.containsOption("John");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${febad948-093a-3f10-bb16-065d4e4d531e}, hash: CEE427AB995B110F58AE9EE365214A8B
	@Test()
	void containsOptionWhenThisSourceNotContainsPropertyName() {
		/* Branches:
		 * (this.source.containsProperty(name)) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: source
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		String[] stringArray = new String[] { "arg1", "arg2" };
		DefaultApplicationArguments target = new DefaultApplicationArguments(stringArray);
		//Act Statement(s)
		boolean result = target.containsOption("John");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${91195fc0-2065-3d6d-957a-f5f9c0c8a0ef}, hash: 0FEF4336233EF50E8482E365CBFDB918
	@Disabled()
	@Test()
	void getOptionValuesWhenValuesIsNotNull() {
		/* Branches:
		 * (values != null) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: source
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		String[] stringArray = new String[] { "arg1", "arg2" };
		DefaultApplicationArguments target = new DefaultApplicationArguments(stringArray);
		//Act Statement(s)
		List<String> result = target.getOptionValues("John");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result.size(), equalTo(0)));
	}

	//Sapient generated method id: ${ba724649-6b5a-376b-ba21-da1c1b7e55fa}, hash: ECC8AC1C1D6F472E3AE6BD7A69CC97CB
	@Test()
	void getOptionValuesWhenValuesIsNull() {
		/* Branches:
		 * (values != null) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: source
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		String[] stringArray = new String[] { "arg1", "arg2" };
		DefaultApplicationArguments target = new DefaultApplicationArguments(stringArray);
		//Act Statement(s)
		List<String> result = target.getOptionValues("John");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${9e424905-44d0-3904-bc31-280d96840101}, hash: AAAF499DC2F616D83E58B22F2B97901F
	@Disabled()
	@Test()
	void getNonOptionArgsTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: source
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		String[] stringArray = new String[] { "valid input values" };
		DefaultApplicationArguments target = new DefaultApplicationArguments(stringArray);
		//Act Statement(s)
		List<String> result = target.getNonOptionArgs();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result.size(), equalTo(0)));
	}
}
