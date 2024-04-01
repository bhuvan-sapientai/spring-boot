package org.springframework.boot.web.servlet.server;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.File;

import org.springframework.boot.system.ApplicationTemp;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SessionStoreDirectorySapientGeneratedTest {

	//Sapient generated method id: ${92ab0f78-a56a-36bd-b7f3-6971d10054f2}, hash: 01F5C4E083223D2AECEEA70924A87D21
	@Test()
	void getValidDirectoryWhenDirIsNull() {
		/* Branches:
		 * (dir == null) : true
		 */
		//Arrange Statement(s)
		SessionStoreDirectory target = new SessionStoreDirectory();

		//Act Statement(s)
		File result = target.getValidDirectory(false);
		ApplicationTemp applicationTemp = new ApplicationTemp();
		File file = applicationTemp.getDir("servlet-sessions");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(file)));
	}
}
