package org.springframework.boot.logging.log4j2;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import org.springframework.core.env.Environment;

import org.mockito.MockedStatic;

import org.springframework.util.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringEnvironmentPropertySourceSapientGeneratedTest {

	private final Environment environmentMock = mock(Environment.class, "environment");

	//Sapient generated method id: ${ebf9d063-d15c-33a6-bbb2-427433abed69}
	@Test()
	void getPropertyTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			SpringEnvironmentPropertySource target = new SpringEnvironmentPropertySource(environmentMock);
			doReturn("return_of_getProperty1").when(environmentMock).getProperty("key1");
			//Act Statement(s)
			String result = target.getProperty("key1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_getProperty1"));
				_assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
				verify(environmentMock).getProperty("key1");
			});
		}
	}

	//Sapient generated method id: ${5a23cf8e-7bfb-34f1-b4a9-69f056d700ca}
	@Test()
	void containsPropertyWhenThisEnvironmentContainsPropertyKey() {
		/* Branches:
		 * (this.environment.containsProperty(key)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			SpringEnvironmentPropertySource target = new SpringEnvironmentPropertySource(environmentMock);
			doReturn(true).when(environmentMock).containsProperty("key1");
			//Act Statement(s)
			boolean result = target.containsProperty("key1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
				verify(environmentMock).containsProperty("key1");
			});
		}
	}

	//Sapient generated method id: ${3651f12b-ad92-378b-9faf-e62ddd5dc74c}
	@Test()
	void containsPropertyWhenThisEnvironmentNotContainsPropertyKey() {
		/* Branches:
		 * (this.environment.containsProperty(key)) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			SpringEnvironmentPropertySource target = new SpringEnvironmentPropertySource(environmentMock);
			doReturn(false).when(environmentMock).containsProperty("key1");
			//Act Statement(s)
			boolean result = target.containsProperty("key1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				_assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
				verify(environmentMock).containsProperty("key1");
			});
		}
	}
}
