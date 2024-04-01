package org.springframework.boot.info;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Properties;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BuildPropertiesSapientGeneratedTest {

	//Sapient generated method id: ${67408a90-a9d6-386b-a899-c13cf16cfead}, hash: EBFE8E81F2D1A5D57F5CE9C2672A1B12
	@Test()
	void getGroupTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Properties properties = new Properties();
		BuildProperties target = new BuildProperties(properties);
		//Act Statement(s)
		String result = target.getGroup();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${69f37694-e006-394e-b70c-306478e35688}, hash: 24ADE2052C126D8E4D59EE97E222E737
	@Test()
	void getArtifactTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Properties properties = new Properties();
		BuildProperties target = new BuildProperties(properties);
		//Act Statement(s)
		String result = target.getArtifact();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${9cfca8f8-30f9-3fae-a48b-42e512964e9b}, hash: F2B100B8A2381CDD29EB27173B48D4E5
	@Test()
	void getNameTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Properties properties = new Properties();
		BuildProperties target = new BuildProperties(properties);
		//Act Statement(s)
		String result = target.getName();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${52011aa4-d0a7-3f87-8d87-e89eb45b8cc8}, hash: AADFAD85934C7146A8FA027914882180
	@Test()
	void getVersionTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Properties properties = new Properties();
		BuildProperties target = new BuildProperties(properties);
		//Act Statement(s)
		String result = target.getVersion();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${8c95b41e-0035-3f7d-baee-db1c9ab5bebe}, hash: CCFDB4ADC2E5419820EC00CBB0E4B400
	@Test()
	void getTimeTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Properties properties = new Properties();
		BuildProperties target = spy(new BuildProperties(properties));
		Instant instant = Instant.ofEpochSecond(1700000000);
		doReturn(instant).when(target).getInstant("time");
		//Act Statement(s)
		Instant result = target.getTime();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(instant));
			verify(target).getInstant("time");
		});
	}
}
