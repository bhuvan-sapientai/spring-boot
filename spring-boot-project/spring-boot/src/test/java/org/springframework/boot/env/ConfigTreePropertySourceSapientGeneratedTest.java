package org.springframework.boot.env;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import org.springframework.boot.origin.Origin;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import org.springframework.util.StringUtils;
import org.springframework.util.Assert;

import java.nio.file.Path;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.ArgumentMatchers.anySet;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigTreePropertySourceSapientGeneratedTest {

	private final Path pathMock = mock(Path.class);

	//Sapient generated method id: ${7686aea9-7c79-3229-813a-9395b64f0cd2}, hash: 397459F6BDC7285B55D50ABA959496DA
	@Disabled()
	@Test()
	void getPropertyNamesTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.notNull(pathMock, "Property source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] { "<String[]>" };
			stringUtils.when(() -> StringUtils.toStringArray(anySet())).thenReturn(stringArray);
			ConfigTreePropertySource.Option[] optionArray = new ConfigTreePropertySource.Option[] { ConfigTreePropertySource.Option.ALWAYS_READ };
			ConfigTreePropertySource target = new ConfigTreePropertySource("<value>", pathMock, optionArray);
			//Act Statement(s)
			String[] result = target.getPropertyNames();
			String[] stringResultArray = new String[] { "<String[]>" };
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(stringResultArray));
				_assert.verify(() -> Assert.notNull(pathMock, "Property source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(eq(false), (Supplier) any()), atLeast(2));
				stringUtils.verify(() -> StringUtils.toStringArray(anySet()), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${570d3b67-9995-3bb3-bf51-4b6faacbc071}, hash: 8B394742906F05278A692F3642A1862F
	@Disabled()
	@Test()
	void getProperty1WhenPropertyFileIsNotNull() {
		/* Branches:
		 * (propertyFile != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.notNull(pathMock, "Property source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] { "<String[]>" };
			stringUtils.when(() -> StringUtils.toStringArray(anySet())).thenReturn(stringArray);
			ConfigTreePropertySource.Option[] optionArray = new ConfigTreePropertySource.Option[] { ConfigTreePropertySource.Option.ALWAYS_READ };
			ConfigTreePropertySource target = new ConfigTreePropertySource("<value>", pathMock, optionArray);
			//Act Statement(s)
			ConfigTreePropertySource.Value result = target.getProperty("<value>");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(pathMock, "Property source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(eq(false), (Supplier) any()), atLeast(2));
				stringUtils.verify(() -> StringUtils.toStringArray(anySet()), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c85055bd-5a21-3e38-9f28-fec84f7ee88d}, hash: 9594EB8D50E65EDA567CE41B39034655
	@Disabled()
	@Test()
	void getProperty1WhenPropertyFileIsNull() {
		/* Branches:
		 * (propertyFile != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.notNull(pathMock, "Property source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] { "<String[]>" };
			stringUtils.when(() -> StringUtils.toStringArray(anySet())).thenReturn(stringArray);
			ConfigTreePropertySource.Option[] optionArray = new ConfigTreePropertySource.Option[] { ConfigTreePropertySource.Option.ALWAYS_READ };
			ConfigTreePropertySource target = new ConfigTreePropertySource("<value>", pathMock, optionArray);
			//Act Statement(s)
			ConfigTreePropertySource.Value result = target.getProperty("<value>");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.notNull(pathMock, "Property source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(eq(false), (Supplier) any()), atLeast(2));
				stringUtils.verify(() -> StringUtils.toStringArray(anySet()), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${19eb3dfa-cdc5-32c0-a254-6d4687501421}, hash: D69A11BC65A0BC86DB855760FB6E861A
	@Disabled()
	@Test()
	void getOriginWhenPropertyFileIsNotNull() {
		/* Branches:
		 * (propertyFile != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.notNull(pathMock, "Property source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] { "<String[]>" };
			stringUtils.when(() -> StringUtils.toStringArray(anySet())).thenReturn(stringArray);
			ConfigTreePropertySource.Option[] optionArray = new ConfigTreePropertySource.Option[] { ConfigTreePropertySource.Option.ALWAYS_READ };
			ConfigTreePropertySource target = new ConfigTreePropertySource("<value>", pathMock, optionArray);
			//Act Statement(s)
			Origin result = target.getOrigin("<value>");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(pathMock, "Property source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(eq(false), (Supplier) any()), atLeast(2));
				stringUtils.verify(() -> StringUtils.toStringArray(anySet()), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${aa12ffdc-4028-3d0f-acae-93f2b62cbae9}, hash: CA1884511CC7483D9A69AB29F80F65B8
	@Disabled()
	@Test()
	void getOriginWhenPropertyFileIsNull() {
		/* Branches:
		 * (propertyFile != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.notNull(pathMock, "Property source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] { "<String[]>" };
			stringUtils.when(() -> StringUtils.toStringArray(anySet())).thenReturn(stringArray);
			ConfigTreePropertySource.Option[] optionArray = new ConfigTreePropertySource.Option[] { ConfigTreePropertySource.Option.ALWAYS_READ };
			ConfigTreePropertySource target = new ConfigTreePropertySource("<value>", pathMock, optionArray);
			//Act Statement(s)
			Origin result = target.getOrigin("<value>");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.notNull(pathMock, "Property source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(eq(false), (Supplier) any()), atLeast(2));
				stringUtils.verify(() -> StringUtils.toStringArray(anySet()), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${fb2b491a-ee21-3188-a759-f1fa9ff2e54e}, hash: 83718FF6E0AAEC652FA04EB10C901C3E
	@Disabled()
	@Test()
	void isImmutableWhenThisOptionsNotContainsOptionALWAYS_READ() {
		/* Branches:
		 * (!this.options.contains(Option.ALWAYS_READ)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.notNull(pathMock, "Property source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] { "<String[]>" };
			stringUtils.when(() -> StringUtils.toStringArray(anySet())).thenReturn(stringArray);
			ConfigTreePropertySource.Option[] optionArray = new ConfigTreePropertySource.Option[] { ConfigTreePropertySource.Option.ALWAYS_READ };
			ConfigTreePropertySource target = new ConfigTreePropertySource("<value>", pathMock, optionArray);
			//Act Statement(s)
			boolean result = target.isImmutable();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull(pathMock, "Property source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(eq(false), (Supplier) any()), atLeast(2));
				stringUtils.verify(() -> StringUtils.toStringArray(anySet()), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${069302d2-ff12-320a-ae65-460d83296d11}, hash: F2ED26FF4458E4E8B3A1C0FE7796F2C7
	@Disabled()
	@Test()
	void isImmutableWhenThisOptionsContainsOptionALWAYS_READ() {
		/* Branches:
		 * (!this.options.contains(Option.ALWAYS_READ)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.notNull(pathMock, "Property source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.isTrue(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] { "<String[]>" };
			stringUtils.when(() -> StringUtils.toStringArray(anySet())).thenReturn(stringArray);
			ConfigTreePropertySource.Option[] optionArray = new ConfigTreePropertySource.Option[] { ConfigTreePropertySource.Option.ALWAYS_READ };
			ConfigTreePropertySource target = new ConfigTreePropertySource("<value>", pathMock, optionArray);
			//Act Statement(s)
			boolean result = target.isImmutable();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				_assert.verify(() -> Assert.notNull(pathMock, "Property source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.isTrue(eq(false), (Supplier) any()), atLeast(2));
				stringUtils.verify(() -> StringUtils.toStringArray(anySet()), atLeast(1));
			});
		}
	}
}
