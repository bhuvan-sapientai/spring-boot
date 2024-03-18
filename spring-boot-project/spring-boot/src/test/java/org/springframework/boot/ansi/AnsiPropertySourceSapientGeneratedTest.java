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

	//Sapient generated method id: ${1ac1a73e-6162-34b2-8c16-c0c45f501f65}, hash: 13E19C2FFD1B713BC827DF3C1D0208BC
	@Test()
	void getPropertyWhenElementIsNull() {
		/* Branches:
		 * (StringUtils.hasLength(name)) : true
		 * (for-each(MAPPINGS)) : true
		 * (name.startsWith(prefix)) : true
		 * (element != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.hasText("CE", "Property source name must contain at least one character"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4dd830c2-4a67-3051-a2d1-8313eaad7bd6}, hash: C224D6E2A6DF4BB545D8146148AF1D5E
	@Disabled()
	@Test()
	void getPropertyWhenThisEncode() {
		/* Branches:
		 * (StringUtils.hasLength(name)) : true
		 * (for-each(MAPPINGS)) : true
		 * (name.startsWith(prefix)) : true
		 * (element != null) : true
		 * (this.encode) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		AnsiElement ansiElementMock = mock(AnsiElement.class);
		try (MockedStatic<AnsiOutput> ansiOutput = mockStatic(AnsiOutput.class);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasLength("AnsiPropertySource")).thenReturn(true);
			ansiOutput.when(() -> AnsiOutput.encode(ansiElementMock)).thenReturn("return_of_encode1");
			AnsiPropertySource target = new AnsiPropertySource("AnsiPropertySource", true);
			//Act Statement(s)
			Object result = target.getProperty("AnsiPropertySource");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_encode1"));
				stringUtils.verify(() -> StringUtils.hasLength("AnsiPropertySource"), atLeast(1));
				ansiOutput.verify(() -> AnsiOutput.encode(ansiElementMock), atLeast(1));
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
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
}
