package org.springframework.boot.web.client;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.http.HttpHeaders;

import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

import java.nio.charset.Charset;

import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BasicAuthenticationSapientGeneratedTest {

	//Sapient generated method id: ${698d39a7-d7cc-3b02-bb9a-83d72b2dc320}
	@Test()
	void applyToWhenHeadersNotContainsKeyHttpHeadersAUTHORIZATION() {
		/* Branches:
		 * (!headers.containsKey(HttpHeaders.AUTHORIZATION)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("A", "Username must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull("B", "Password must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Charset charset = Charset.defaultCharset();
			BasicAuthentication target = new BasicAuthentication("A", "B", charset);
			HttpHeaders httpHeaders = new HttpHeaders();
			//Act Statement(s)
			target.applyTo(httpHeaders);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull("A", "Username must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull("B", "Password must not be null"), atLeast(1));
			});
		}
	}
}
