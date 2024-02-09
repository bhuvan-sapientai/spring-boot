package org.springframework.boot.web.server;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.http.HttpStatus;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ErrorPageSapientGeneratedTest {

	//Sapient generated method id: ${6c2d0456-7443-32d0-aa98-f2effe3c61ed}
	@Test()
	void getStatusCodeWhenThisStatusIsNotNull() {
		/* Branches:
		 * (this.status != null) : true
		 */
		//Arrange Statement(s)
		ErrorPage target = new ErrorPage(HttpStatus.MULTI_STATUS, "path1");

		//Act Statement(s)
		int result = target.getStatusCode();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(207)));
	}

	//Sapient generated method id: ${259169ba-b5a2-3efc-bcc8-149eec217bac}
	@Test()
	void getStatusCodeWhenThisStatusIsNull() {
		/* Branches:
		 * (this.status != null) : false
		 */
		//Arrange Statement(s)
		ErrorPage target = new ErrorPage((HttpStatus) null, "path1");

		//Act Statement(s)
		int result = target.getStatusCode();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(0)));
	}

	//Sapient generated method id: ${69942206-1f7e-3fa0-8099-7aa19b0ecff7}
	@Test()
	void getExceptionNameWhenThisExceptionIsNull() {
		/* Branches:
		 * (this.exception != null) : false
		 */
		//Arrange Statement(s)
		ErrorPage target = new ErrorPage(HttpStatus.CONTINUE, "path1");

		//Act Statement(s)
		String result = target.getExceptionName();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${6be0f84a-f338-38c8-be38-3fb1b9b3c05b}
	@Test()
	void isGlobalWhenThisStatusIsNotNull() {
		/* Branches:
		 * (this.status == null) : false
		 */
		//Arrange Statement(s)
		ErrorPage target = new ErrorPage(HttpStatus.CONTINUE, "path1");

		//Act Statement(s)
		boolean result = target.isGlobal();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${01361bdb-452d-3e57-bfb3-a4a79789b7ae}
	@Test()
	void isGlobalWhenThisExceptionIsNull() {
		/* Branches:
		 * (this.status == null) : true
		 * (this.exception == null) : true
		 */
		//Arrange Statement(s)
		ErrorPage target = new ErrorPage((HttpStatus) null, "path1");

		//Act Statement(s)
		boolean result = target.isGlobal();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}
}
