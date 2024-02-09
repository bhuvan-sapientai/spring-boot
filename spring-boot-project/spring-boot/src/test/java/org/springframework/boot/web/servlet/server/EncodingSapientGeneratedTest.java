package org.springframework.boot.web.servlet.server;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class EncodingSapientGeneratedTest {

	//Sapient generated method id: ${920bc769-91d5-3bc8-9592-ac88e00ca10f}
	@Test()
	void isForceTest() {
		//Arrange Statement(s)
		Encoding target = new Encoding();

		//Act Statement(s)
		boolean result = target.isForce();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${66db2e45-eb96-3ee2-8caf-a0c3a1da7982}
	@Test()
	void setForceTest() {
		//Arrange Statement(s)
		Encoding target = new Encoding();

		//Act Statement(s)
		target.setForce(false);
	}

	//Sapient generated method id: ${3e465f9b-a88a-3790-a7a4-6745a281949a}
	@Test()
	void isForceRequestTest() {
		//Arrange Statement(s)
		Encoding target = new Encoding();

		//Act Statement(s)
		boolean result = target.isForceRequest();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${36de33c8-1ad5-3560-99be-aa139ebae813}
	@Test()
	void setForceRequestTest() {
		//Arrange Statement(s)
		Encoding target = new Encoding();

		//Act Statement(s)
		target.setForceRequest(false);
	}

	//Sapient generated method id: ${35be402c-ff35-34b9-bc1f-f57330b90f5b}
	@Test()
	void isForceResponseTest() {
		//Arrange Statement(s)
		Encoding target = new Encoding();

		//Act Statement(s)
		boolean result = target.isForceResponse();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${8a8045e0-0d6c-3103-b757-be17d1a1cdaa}
	@Test()
	void setForceResponseTest() {
		//Arrange Statement(s)
		Encoding target = new Encoding();

		//Act Statement(s)
		target.setForceResponse(false);
	}

	//Sapient generated method id: ${607644bc-f3d9-312c-91f0-b9df75b03d65}
	@Test()
	void shouldForceWhenTypeNotEqualsTypeREQUEST() {
		/* Branches:
		 * (type != Type.REQUEST) : true
		 * (force == null) : true
		 * (force == null) : true
		 * (type == Type.REQUEST) : false
		 */
		//Arrange Statement(s)
		Encoding target = new Encoding();

		//Act Statement(s)
		boolean result = target.shouldForce(Encoding.Type.RESPONSE);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${078712ae-043e-3113-bd41-e29954301b30}
	@Test()
	void shouldForceWhenTypeEqualsTypeREQUEST() {
		/* Branches:
		 * (type != Type.REQUEST) : false
		 * (force == null) : true
		 * (force == null) : true
		 * (type == Type.REQUEST) : true
		 */
		//Arrange Statement(s)
		Encoding target = new Encoding();

		//Act Statement(s)
		boolean result = target.shouldForce(Encoding.Type.REQUEST);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}
}
