package org.springframework.boot.ansi;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

import org.springframework.util.StringUtils;
import org.springframework.util.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class AnsiPropertySourceSapientGeneratedTest {

	//Sapient generated method id: ${1ac1a73e-6162-34b2-8c16-c0c45f501f65}, hash: 2E22265CA5EE882931DFA2B788013574
	@Test()
	void getPropertyWhenElementIsNull() {
		/* Branches:
		 * (StringUtils.hasLength(name)) : true
		 * (for-each(MAPPINGS)) : true
		 * (name.startsWith(prefix)) : true
		 * (element != null) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: mapping
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.hasText("C", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
			AnsiPropertySource target = new AnsiPropertySource("C", false);
			//Act Statement(s)
			Object result = target.getProperty("AB");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.hasText("C", "Property source name must contain at least one character"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${2b90e31a-1c0a-3089-a020-8067f14d7f48}, hash: 842251768F00225D0DE8065618131C84
	@Disabled()
	@Test()
	void getPropertyWhenThisNotEncode() {
		/* Branches:
		 * (StringUtils.hasLength(name)) : true
		 * (for-each(MAPPINGS)) : true
		 * (name.startsWith(prefix)) : true
		 * (element != null) : true
		 * (this.encode) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: mapping
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.hasText("CE", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
			AnsiPropertySource target = new AnsiPropertySource("CE", false);
			//Act Statement(s)
			Object result = target.getProperty("BA");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.hasText("CE", "Property source name must contain at least one character"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${91059a93-ccfc-390d-9dd2-1ce1edf9e371}, hash: 50E8285C2313CA1BF15E9229B293B19E
	@Disabled()
	@Test()
	void getPropertyWhenElementIsNullAndThisEncode() {
		/* Branches:
		 * (StringUtils.hasLength(name)) : true
		 * (for-each(MAPPINGS)) : true
		 * (name.startsWith(prefix)) : true
		 * (element != null) : false
		 * (this.encode) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: mapping
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		AnsiElement ansiElementMock = mock(AnsiElement.class);
		try (MockedStatic<AnsiOutput> ansiOutput = mockStatic(AnsiOutput.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.hasText("C", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
			ansiOutput.when(() -> AnsiOutput.encode(ansiElementMock)).thenReturn("return_of_encode1");
			AnsiPropertySource target = new AnsiPropertySource("C", true);
			//Act Statement(s)
			Object result = target.getProperty("DB");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_encode1"));
				_assert.verify(() -> Assert.hasText("C", "Property source name must contain at least one character"), atLeast(1));
				ansiOutput.verify(() -> AnsiOutput.encode(ansiElementMock), atLeast(1));
			});
		}
	}
}
