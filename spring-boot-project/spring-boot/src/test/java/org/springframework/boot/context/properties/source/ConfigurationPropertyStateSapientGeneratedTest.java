package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

import java.util.ArrayList;

import org.springframework.util.Assert;

import java.util.function.Predicate;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertyStateSapientGeneratedTest {

	private final Predicate predicateMock = mock(Predicate.class);

	//Sapient generated method id: ${06fff9e8-aab3-3323-9bf4-83f0394f49b3}, hash: 47A34617616FF6A59A28C2CE437D4F25
	@Test()
	void searchWhenPredicateTestItem() {
		/* Branches:
		 * (for-each(source)) : true
		 * (predicate.test(item)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Object object = new Object();
			doReturn(true).when(predicateMock).test(object);
			_assert.when(() -> Assert.notNull(predicateMock, "Predicate must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Iterable<Object> iterable = new ArrayList<>(List.of(object));
			//Act Statement(s)
			ConfigurationPropertyState result = ConfigurationPropertyState.search(iterable, predicateMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.PRESENT));
				verify(predicateMock, atLeast(1)).test(object);
				_assert.verify(() -> Assert.notNull(predicateMock, "Predicate must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f328f7bb-da87-3b6f-9463-4aa7094b1003}, hash: 2703BD558938A952F3F8352B63B7079A
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
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Source must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(predicateMock, "Predicate must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			Iterable<Object> iterable = new ArrayList<>(List.of(object));
			//Act Statement(s)
			ConfigurationPropertyState result = ConfigurationPropertyState.search(iterable, predicateMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.ABSENT));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Source must not be null")));
				_assert.verify(() -> Assert.notNull(predicateMock, "Predicate must not be null"), atLeast(1));
			});
		}
	}
}
