package org.springframework.boot.logging.log4j2;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringProfileArbiterSapientGeneratedTest {

	//Sapient generated method id: ${30ad8154-474d-37fa-9901-98d346342309}
	@Test()
	void newBuilderTest() {

		//Act Statement(s)
		SpringProfileArbiter.Builder result = SpringProfileArbiter.newBuilder();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
