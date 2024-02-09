package org.springframework.boot.info;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ProcessInfoSapientGeneratedTest {

	//Sapient generated method id: ${6f4e91f7-4d0d-3d8f-b16f-d94a3ad16872}
	@Test()
	void getCpusTest() {
		//Arrange Statement(s)
		ProcessInfo target = new ProcessInfo();

		//Act Statement(s)
		int result = target.getCpus();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(6)));
	}
}
