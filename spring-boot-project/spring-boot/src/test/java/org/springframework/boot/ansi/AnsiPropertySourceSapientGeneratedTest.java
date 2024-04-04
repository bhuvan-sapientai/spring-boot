/*
 * Copyright 2012-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.ansi;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

import org.springframework.util.StringUtils;
import org.springframework.util.Assert;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class AnsiPropertySourceSapientGeneratedTest {

	//Sapient generated method id: ${1ac1a73e-6162-34b2-8c16-c0c45f501f65}, hash: 71007F9DE6676D424A3083837706CA7D
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
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.hasText("name1", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((Object) any(), eq("Property source must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.hasLength("AC")).thenReturn(true);
			AnsiPropertySource target = new AnsiPropertySource("name1", false);
			//Act Statement(s)
			Object result = target.getProperty("AC");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.hasText("name1", "Property source name must contain at least one character"), atLeast(1));
				_assert.verify(() -> Assert.notNull((Object) any(), eq("Property source must not be null")));
				stringUtils.verify(() -> StringUtils.hasLength("AC"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4dd830c2-4a67-3051-a2d1-8313eaad7bd6}, hash: 9BA5CA27EE88E7C4CE161D57BC3572D8
	@Test()
	@Disabled
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
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.hasText("name1", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((Object) any(), eq("Property source must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.hasLength("AC")).thenReturn(true);
			ansiOutput.when(() -> AnsiOutput.encode(ansiElementMock)).thenReturn("return_of_encode1");
			AnsiPropertySource target = new AnsiPropertySource("name1", true);
			//Act Statement(s)
			Object result = target.getProperty("AC");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_encode1"));
				_assert.verify(() -> Assert.hasText("name1", "Property source name must contain at least one character"), atLeast(1));
				_assert.verify(() -> Assert.notNull((Object) any(), eq("Property source must not be null")));
				stringUtils.verify(() -> StringUtils.hasLength("AC"), atLeast(1));
				ansiOutput.verify(() -> AnsiOutput.encode(ansiElementMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${2b90e31a-1c0a-3089-a020-8067f14d7f48}, hash: A7CC4AB7B836C987270DC4E0BA2074C2
	@Test()
	@Disabled
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
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.hasText("name1", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((Object) any(), eq("Property source must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.hasLength("AC")).thenReturn(true);
			AnsiPropertySource target = new AnsiPropertySource("name1", false);
			//Act Statement(s)
			Object result = target.getProperty("AC");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.hasText("name1", "Property source name must contain at least one character"), atLeast(1));
				_assert.verify(() -> Assert.notNull((Object) any(), eq("Property source must not be null")));
				stringUtils.verify(() -> StringUtils.hasLength("AC"), atLeast(1));
			});
		}
	}
}
