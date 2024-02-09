package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

import org.springframework.util.Assert;

import java.util.function.Predicate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertyStateSapientGeneratedTest {

	//Sapient generated method id: ${06fff9e8-aab3-3323-9bf4-83f0394f49b3}
	@Disabled()
	@Test()
	void searchWhenPredicateTestItem() {
		/* Branches:
		 * (for-each(source)) : true
		 * (predicate.test(item)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) null, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((Predicate) null, "Predicate must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//TODO: Needs initialization with real value
			Iterable iterable = null;
			//TODO: Needs initialization with real value
			Predicate predicate = null;
			//Act Statement(s)
			ConfigurationPropertyState result = ConfigurationPropertyState.search(iterable, predicate);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.PRESENT));
				_assert.verify(() -> Assert.notNull((Iterable) null, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull((Predicate) null, "Predicate must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f328f7bb-da87-3b6f-9463-4aa7094b1003}
	@Disabled()
	@Test()
	void searchWhenPredicateNotTestItem() {
		/* Branches:
		 * (for-each(source)) : true
		 * (predicate.test(item)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) null, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((Predicate) null, "Predicate must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//TODO: Needs initialization with real value
			Iterable iterable = null;
			//TODO: Needs initialization with real value
			Predicate predicate = null;
			//Act Statement(s)
			ConfigurationPropertyState result = ConfigurationPropertyState.search(iterable, predicate);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.ABSENT));
				_assert.verify(() -> Assert.notNull((Iterable) null, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull((Predicate) null, "Predicate must not be null"), atLeast(1));
			});
		}
	}
}
