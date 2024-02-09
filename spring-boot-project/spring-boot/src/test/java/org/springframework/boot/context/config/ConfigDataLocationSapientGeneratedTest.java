package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.origin.Origin;

import org.mockito.MockedStatic;

import org.springframework.util.StringUtils;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigDataLocationSapientGeneratedTest {

	//Sapient generated method id: ${f2d940c9-62dc-3e8b-a830-1f97ff0b33e4}
	@Disabled()
	@Test()
	void hasPrefixWhenThisValueStartsWithPrefix() {
		/* Branches:
		 * (this.value.startsWith(prefix)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("B")).thenReturn(false);
			ConfigDataLocation target = ConfigDataLocation.of("optional:B");
			//Act Statement(s)
			boolean result = target.hasPrefix("C");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				stringUtils.verify(() -> StringUtils.hasText("B"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${16205bc8-9d42-3581-bfc1-87504f4b9755}
	@Disabled()
	@Test()
	void hasPrefixWhenThisValueNotStartsWithPrefix() {
		/* Branches:
		 * (this.value.startsWith(prefix)) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("B")).thenReturn(false);
			ConfigDataLocation target = ConfigDataLocation.of("optional:B");
			//Act Statement(s)
			boolean result = target.hasPrefix("CD");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				stringUtils.verify(() -> StringUtils.hasText("B"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${9f3f08d4-9263-3c33-bbbf-11a63759fbaf}
	@Disabled()
	@Test()
	void getNonPrefixedValueWhenHasPrefixPrefix() {
		/* Branches:
		 * (hasPrefix(prefix)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
			ConfigDataLocation target = spy(ConfigDataLocation.of("optional:A"));
			doReturn(true).when(target).hasPrefix("C");
			//Act Statement(s)
			String result = target.getNonPrefixedValue("C");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("B"));
				stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
				verify(target).hasPrefix("C");
			});
		}
	}

	//Sapient generated method id: ${6ad41ab3-a6db-3b67-ad8b-6ac5bfd4d445}
	@Disabled()
	@Test()
	void getNonPrefixedValueWhenHasPrefixNotPrefix() {
		/* Branches:
		 * (hasPrefix(prefix)) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
			ConfigDataLocation target = spy(ConfigDataLocation.of("optional:A"));
			doReturn(false).when(target).hasPrefix("prefix1");
			//Act Statement(s)
			String result = target.getNonPrefixedValue("prefix1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
				verify(target).hasPrefix("prefix1");
			});
		}
	}

	//Sapient generated method id: ${b3665f3b-da99-3ff9-95f6-d138e45e8276}
	@Disabled()
	@Test()
	void splitTest() {
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
			ConfigDataLocation target = spy(ConfigDataLocation.of("optional:A"));
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(target).split(";");
			//Act Statement(s)
			ConfigDataLocation[] result = target.split();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configDataLocationArray));
				stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
				verify(target).split(";");
			});
		}
	}

	//Sapient generated method id: ${b7032138-42e3-399d-930c-acaaf800d0bd}
	@Disabled()
	@Test()
	void split1WhenILessThanValuesLength() {
		/* Branches:
		 * (i < values.length) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigDataLocation configDataLocationMock = mock(ConfigDataLocation.class);
		ConfigDataLocation configDataLocationMock2 = mock(ConfigDataLocation.class);
		try (MockedStatic<ConfigDataLocation> configDataLocation = mockStatic(ConfigDataLocation.class);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class, CALLS_REAL_METHODS)) {
			stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
			configDataLocation.when(() -> ConfigDataLocation.of("return_of_delimitedListToStringArrayItem1")).thenReturn(configDataLocationMock);
			doReturn(configDataLocationMock2).when(configDataLocationMock).withOrigin((Origin) null);
			ConfigDataLocation target = ConfigDataLocation.of("optional:A");
			//Act Statement(s)
			ConfigDataLocation[] result = target.split("C");
			ConfigDataLocation[] configDataLocationResultArray = new ConfigDataLocation[] { configDataLocationMock2 };
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configDataLocationResultArray));
				stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
				configDataLocation.verify(() -> ConfigDataLocation.of("return_of_delimitedListToStringArrayItem1"), atLeast(1));
				verify(configDataLocationMock, atLeast(1)).withOrigin((Origin) null);
			});
		}
	}

	//Sapient generated method id: ${8f642396-ae67-397c-a99b-b06b224f9d0b}
	@Disabled()
	@Test()
	void toStringWhenThisNotOptional() {
		/* Branches:
		 * (!this.optional) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
			ConfigDataLocation target = ConfigDataLocation.of("optional:A");
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${7b91b463-ee7c-3f82-a547-0671239178a7}
	@Disabled()
	@Test()
	void withOriginTest() {
		//Arrange Statement(s)
		Origin originMock = mock(Origin.class);
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
			ConfigDataLocation target = ConfigDataLocation.of("optional:A");
			//Act Statement(s)
			ConfigDataLocation result = target.withOrigin(originMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f0d32999-3c6a-3e0e-a106-844e15f23426}
	@Test()
	void ofWhenStringUtilsHasTextValue() {
		/* Branches:
		 * (location != null) : true
		 * (location.startsWith(OPTIONAL_PREFIX)) : true
		 * (!optional) : false
		 * (!StringUtils.hasText(value)) : false
		 */
		//Act Statement(s)
		ConfigDataLocation result = ConfigDataLocation.of("optional:A");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${9f53cfc4-0523-31ce-9e32-fe45a1105de8}
	@Test()
	void ofWhenNotOptionalAndStringUtilsNotHasTextValue() {
		/* Branches:
		 * (location != null) : true
		 * (location.startsWith(OPTIONAL_PREFIX)) : false
		 * (!optional) : true
		 * (!StringUtils.hasText(value)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("B")).thenReturn(false);
			//Act Statement(s)
			ConfigDataLocation result = ConfigDataLocation.of("B");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				stringUtils.verify(() -> StringUtils.hasText("B"), atLeast(1));
			});
		}
	}
}
