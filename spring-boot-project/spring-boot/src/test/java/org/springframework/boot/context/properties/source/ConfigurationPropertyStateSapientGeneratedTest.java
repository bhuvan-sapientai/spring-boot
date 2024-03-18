package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

import org.springframework.util.Assert;

import java.util.function.Predicate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertyStateSapientGeneratedTest {

	private final Predicate predicateMock = mock(Predicate.class);

	private final Iterable sourceMock = mock(Iterable.class);

	//Sapient generated method id: ${06fff9e8-aab3-3323-9bf4-83f0394f49b3}, hash: 2F8C603BB0CFA9B36DAC4CD3D375B884
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
			doReturn(null).when(sourceMock).iterator();
			Object object = new Object();
			doReturn(true).when(predicateMock).test(object);
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(predicateMock, "Predicate must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			ConfigurationPropertyState result = ConfigurationPropertyState.search(sourceMock, predicateMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.PRESENT));
				verify(sourceMock).iterator();
				verify(predicateMock).test(object);
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(predicateMock, "Predicate must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f328f7bb-da87-3b6f-9463-4aa7094b1003}, hash: EDD0B64C26A05238102052CD6EC82B94
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
			doReturn(null).when(sourceMock).iterator();
			Object object = new Object();
			doReturn(false).when(predicateMock).test(object);
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(predicateMock, "Predicate must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			ConfigurationPropertyState result = ConfigurationPropertyState.search(sourceMock, predicateMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.ABSENT));
				verify(sourceMock).iterator();
				verify(predicateMock).test(object);
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(predicateMock, "Predicate must not be null"), atLeast(1));
			});
		}
	}
}
