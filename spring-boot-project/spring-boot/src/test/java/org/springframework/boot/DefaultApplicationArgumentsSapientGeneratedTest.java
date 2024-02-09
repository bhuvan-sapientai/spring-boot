package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.util.Set;

import org.springframework.util.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DefaultApplicationArgumentsSapientGeneratedTest {

	//Sapient generated method id: ${d2414361-7062-3586-8b2a-49269806ef5b}
	@Test()
	void getOptionNamesTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			String[] stringArray = new String[] {};
			_assert.when(() -> Assert.notNull(stringArray, "Args must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DefaultApplicationArguments target = new DefaultApplicationArguments(stringArray);
			//Act Statement(s)
			Set<String> result = target.getOptionNames();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				_assert.verify(() -> Assert.notNull(stringArray, "Args must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${87ed1ead-768f-3f72-a33e-c86f6ee508ae}
	@Disabled()
	@Test()
	void containsOptionWhenThisSourceContainsPropertyName() {
		/* Branches:
		 * (this.source.containsProperty(name)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

	//Sapient generated method id: ${febad948-093a-3f10-bb16-065d4e4d531e}
	@Test()
	void containsOptionWhenThisSourceNotContainsPropertyName() {
		/* Branches:
		 * (this.source.containsProperty(name)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		String[] stringArray = new String[] { "<value>" };
		DefaultApplicationArguments target = new DefaultApplicationArguments(stringArray);
		//Act Statement(s)
		boolean result = target.containsOption("<value>");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${91195fc0-2065-3d6d-957a-f5f9c0c8a0ef}
	@Disabled()
	@Test()
	void getOptionValuesWhenValuesIsNotNull() {
		/* Branches:
		 * (values != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			String[] stringArray = new String[] {};
			_assert.when(() -> Assert.notNull(stringArray, "Args must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DefaultApplicationArguments target = new DefaultApplicationArguments(stringArray);
			//Act Statement(s)
			List<String> result = target.getOptionValues("name1");
			List<String> stringResultList = new ArrayList<>();
			stringResultList.add("resultItem1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(stringResultList.size()));
				assertThat(result, containsInRelativeOrder(stringResultList.toArray()));
				_assert.verify(() -> Assert.notNull(stringArray, "Args must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${ba724649-6b5a-376b-ba21-da1c1b7e55fa}
	@Test()
	void getOptionValuesWhenValuesIsNull() {
		/* Branches:
		 * (values != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		String[] stringArray = new String[] { "<value>" };
		DefaultApplicationArguments target = new DefaultApplicationArguments(stringArray);
		//Act Statement(s)
		List<String> result = target.getOptionValues("<value>");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${9e424905-44d0-3904-bc31-280d96840101}
	@Disabled()
	@Test()
	void getNonOptionArgsTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		String[] stringArray = new String[] { "value" };
		DefaultApplicationArguments target = new DefaultApplicationArguments(stringArray);
		//Act Statement(s)
		List<String> result = target.getNonOptionArgs();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result.size(), equalTo(0)));
	}
}
