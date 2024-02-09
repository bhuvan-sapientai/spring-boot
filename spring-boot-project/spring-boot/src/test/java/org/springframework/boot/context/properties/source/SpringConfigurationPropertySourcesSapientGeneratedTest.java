package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

import java.util.Iterator;

import org.springframework.util.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringConfigurationPropertySourcesSapientGeneratedTest {

	//Sapient generated method id: ${4f7f2e04-5085-3c77-9c5c-510e42b3bd0f}
	@Test()
	void isUsingSourcesWhenThisSourcesEqualsSources() {
		/* Branches:
		 * (this.sources == sources) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) null, "Sources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			SpringConfigurationPropertySources target = new SpringConfigurationPropertySources((Iterable) null);
			//TODO: Needs initialization with real value
			Iterable iterable = null;
			//Act Statement(s)
			boolean result = target.isUsingSources(iterable);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull((Iterable) null, "Sources must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${9cb242de-be1f-37eb-b291-8765c225da25}
	@Disabled()
	@Test()
	void isUsingSourcesWhenThisSourcesNotEqualsSources() {
		/* Branches:
		 * (this.sources == sources) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) null, "Sources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			SpringConfigurationPropertySources target = new SpringConfigurationPropertySources((Iterable) null);
			//TODO: Needs initialization with real value
			Iterable iterable = null;
			//Act Statement(s)
			boolean result = target.isUsingSources(iterable);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				_assert.verify(() -> Assert.notNull((Iterable) null, "Sources must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${78c09fb6-edcf-3ce7-9932-6ef4ffc152b3}
	@Disabled()
	@Test()
	void iteratorTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) null, "Sources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			SpringConfigurationPropertySources target = new SpringConfigurationPropertySources((Iterable) null);
			//Act Statement(s)
			Iterator<ConfigurationPropertySource> result = target.iterator();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull((Iterable) null, "Sources must not be null"), atLeast(1));
			});
		}
	}
}
