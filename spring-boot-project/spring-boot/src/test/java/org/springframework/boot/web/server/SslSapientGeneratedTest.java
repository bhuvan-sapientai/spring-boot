package org.springframework.boot.web.server;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SslSapientGeneratedTest {

	//Sapient generated method id: ${9bdc3e29-0c48-3d9b-9829-447b311b9399}
	@Test()
	void isEnabled1WhenSslIsEnabled() {
		/* Branches:
		 * (ssl != null) : true
		 * (ssl.isEnabled()) : true
		 */
		//Arrange Statement(s)
		Ssl ssl = new Ssl();
		ssl.setEnabled(true);
		//Act Statement(s)
		boolean result = Ssl.isEnabled(ssl);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${861bfb28-07a9-3890-ac4c-d0a13ce26ade}
	@Test()
	void isEnabled1WhenSslNotIsEnabled() {
		/* Branches:
		 * (ssl != null) : true
		 * (ssl.isEnabled()) : false
		 */
		//Arrange Statement(s)
		Ssl ssl = new Ssl();
		ssl.setEnabled(false);
		//Act Statement(s)
		boolean result = Ssl.isEnabled(ssl);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${de27aad8-1dc9-36f1-917b-fa532ed9e11d}
	@Disabled()
	@Test()
	void forBundleTest() {
		//Act Statement(s)
		Ssl result = Ssl.forBundle("bundle1");
		Ssl ssl = new Ssl();
		ssl.setBundle("bundle1");
		//Assert statement(s)
		//TODO: Please implement equals method in Ssl for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(ssl)));
	}
}
