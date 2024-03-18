package org.springframework.boot.system;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.File;

import org.springframework.boot.SpringApplication;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ApplicationHomeSapientGeneratedTest {

	//Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 6833E3C9C0498150AE23ACC4AE8AA8AD
	@Test()
	void toStringTest() {
		//Arrange Statement(s)
		ApplicationHome target = spy(new ApplicationHome(SpringApplication.class));
		File fileMock = mock(File.class, "toString_file1");
		doReturn(fileMock).when(target).getDir();

		//Act Statement(s)
		String result = target.toString();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("toString_file1"));
			verify(target).getDir();
		});
	}
}
