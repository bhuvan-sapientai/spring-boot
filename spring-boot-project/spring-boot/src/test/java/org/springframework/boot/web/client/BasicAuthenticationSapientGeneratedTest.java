package org.springframework.boot.web.client;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.http.HttpHeaders;

import java.nio.charset.Charset;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BasicAuthenticationSapientGeneratedTest {

	//Sapient generated method id: ${698d39a7-d7cc-3b02-bb9a-83d72b2dc320}, hash: 82FB1AD70A6C0801AC5015864048EDAE
	@Test()
	void applyToWhenHeadersNotContainsKeyHttpHeadersAUTHORIZATION() {
		/* Branches:
		 * (!headers.containsKey(HttpHeaders.AUTHORIZATION)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Charset charset = Charset.defaultCharset();
		BasicAuthentication target = new BasicAuthentication("exampleUsername", "examplePassword", charset);
		HttpHeaders httpHeaders = new HttpHeaders();

		//Act Statement(s)
		target.applyTo(httpHeaders);
	}
}
