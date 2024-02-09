package org.springframework.boot.origin;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

import org.springframework.util.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SystemEnvironmentOriginSapientGeneratedTest {

	//Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
	@Test()
	void toStringTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("A", "Property name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.hasText("A", "Property name must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
			SystemEnvironmentOrigin target = new SystemEnvironmentOrigin("A");
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("System Environment Property \"A\""));
				_assert.verify(() -> Assert.notNull("A", "Property name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.hasText("A", "Property name must not be empty"), atLeast(1));
			});
		}
	}
}
