package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.core.env.PropertySource;
import org.springframework.util.Assert;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringConfigurationPropertySourcesSapientGeneratedTest {

	//Sapient generated method id: ${4f7f2e04-5085-3c77-9c5c-510e42b3bd0f}, hash: 87D3EF3ED118AFCF7FD2EE4BC6308E08
	@Test()
	void isUsingSourcesWhenThisSourcesEqualsSources() {
		/* Branches:
		 * (this.sources == sources) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Iterable<PropertySource<?>> iterable = new ArrayList<>();
			SpringConfigurationPropertySources target = new SpringConfigurationPropertySources(iterable);
			//Act Statement(s)
			boolean result = target.isUsingSources(iterable);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
			});
		}
	}

	//Sapient generated method id: ${9cb242de-be1f-37eb-b291-8765c225da25}, hash: DE8996BFA47CD588A34740A66678D565
	@Test()
	void isUsingSourcesWhenThisSourcesNotEqualsSources() {
		/* Branches:
		 * (this.sources == sources) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Iterable<PropertySource<?>> iterable = new ArrayList<>();
			SpringConfigurationPropertySources target = new SpringConfigurationPropertySources(iterable);
			Iterable<PropertySource<?>> iterable2 = new ArrayList<>();
			//Act Statement(s)
			boolean result = target.isUsingSources(iterable2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Sources must not be null")));
			});
		}
	}

	//Sapient generated method id: ${78c09fb6-edcf-3ce7-9932-6ef4ffc152b3}, hash: 4C5B1A229BD996DC20B9F2BF98574015
	@Test()
	void iteratorTest() {
		//Arrange Statement(s)
		Iterable<PropertySource<?>> iterable = new ArrayList<>();
		SpringConfigurationPropertySources target = new SpringConfigurationPropertySources(iterable);

		//Act Statement(s)
		Iterator<ConfigurationPropertySource> result = target.iterator();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
