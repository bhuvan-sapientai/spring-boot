package org.springframework.boot.web.servlet.server;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SessionSapientGeneratedTest {

	//Sapient generated method id: ${15c0eb7a-c62a-393b-99ca-4b9b2cc22cf4}
	@Test()
	void setStoreDirTest() {
		/**
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: sessionStoreDirectory
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Session target = new Session();
		File file = new File("pathname1");
		//Act Statement(s)
		target.setStoreDir(file);
		//Assert statement(s)
		assertAll("result", () -> assertThat(target.getStoreDir(), equalTo(file)));
	}
}
