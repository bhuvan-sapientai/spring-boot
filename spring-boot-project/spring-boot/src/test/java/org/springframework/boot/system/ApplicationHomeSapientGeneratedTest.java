package org.springframework.boot.system;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ApplicationHomeSapientGeneratedTest {

	//Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
	@Disabled()
	@Test()
	void toStringTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ApplicationHome target = spy(new ApplicationHome(String.class));
		File file = new File("pathname1");
		doReturn(file).when(target).getDir();
		//Act Statement(s)
		String result = target.toString();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("toString_file1"));
			verify(target).getDir();
		});
	}
}
