package org.springframework.boot.web.reactive.context;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.env.ConfigurableEnvironment;

import org.mockito.stubbing.Answer;

import org.springframework.core.io.Resource;

import org.mockito.MockedStatic;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class GenericReactiveWebApplicationContextSapientGeneratedTest {

	private final DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);

	//Sapient generated method id: ${710fd138-f016-39a0-9d47-0163cb889999}
	@Disabled()
	@Test()
	void createEnvironmentTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			GenericReactiveWebApplicationContext target = new GenericReactiveWebApplicationContext(defaultListableBeanFactoryMock);
			//Act Statement(s)
			ConfigurableEnvironment result = target.createEnvironment();
			StandardReactiveWebEnvironment standardReactiveWebEnvironment = new StandardReactiveWebEnvironment();
			//Assert statement(s)
			//TODO: Please implement equals method in StandardReactiveWebEnvironment for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(standardReactiveWebEnvironment));
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${46d033a6-8edb-31ce-997e-289f3c60e900}
	@Test()
	void getResourceByPathTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			GenericReactiveWebApplicationContext target = new GenericReactiveWebApplicationContext(defaultListableBeanFactoryMock);
			//Act Statement(s)
			Resource result = target.getResourceByPath("path1");
			FilteredReactiveWebContextResource filteredReactiveWebContextResource = new FilteredReactiveWebContextResource("path1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(filteredReactiveWebContextResource));
				_assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
			});
		}
	}
}
