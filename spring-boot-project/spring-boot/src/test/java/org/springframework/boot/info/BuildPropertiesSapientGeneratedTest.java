package org.springframework.boot.info;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

import java.time.Instant;

import org.springframework.util.Assert;

import java.util.Properties;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BuildPropertiesSapientGeneratedTest {

	//Sapient generated method id: ${67408a90-a9d6-386b-a899-c13cf16cfead}
	@Test()
	void getGroupTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Properties properties = new Properties();
			BuildProperties target = spy(new BuildProperties(properties));
			doReturn("return_of_get1").when(target).get("group");
			//Act Statement(s)
			String result = target.getGroup();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_get1"));
				_assert.verify(() -> Assert.notNull(any(), eq("Entries must not be null")));
				verify(target).get("group");
			});
		}
	}

	//Sapient generated method id: ${69f37694-e006-394e-b70c-306478e35688}
	@Test()
	void getArtifactTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Properties properties = new Properties();
			BuildProperties target = spy(new BuildProperties(properties));
			doReturn("return_of_get1").when(target).get("artifact");
			//Act Statement(s)
			String result = target.getArtifact();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_get1"));
				_assert.verify(() -> Assert.notNull(any(), eq("Entries must not be null")));
				verify(target).get("artifact");
			});
		}
	}

	//Sapient generated method id: ${9cfca8f8-30f9-3fae-a48b-42e512964e9b}
	@Test()
	void getNameTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Properties properties = new Properties();
			BuildProperties target = spy(new BuildProperties(properties));
			doReturn("return_of_get1").when(target).get("name");
			//Act Statement(s)
			String result = target.getName();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_get1"));
				_assert.verify(() -> Assert.notNull(any(), eq("Entries must not be null")));
				verify(target).get("name");
			});
		}
	}

	//Sapient generated method id: ${52011aa4-d0a7-3f87-8d87-e89eb45b8cc8}
	@Test()
	void getVersionTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Properties properties = new Properties();
			BuildProperties target = spy(new BuildProperties(properties));
			doReturn("return_of_get1").when(target).get("version");
			//Act Statement(s)
			String result = target.getVersion();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_get1"));
				_assert.verify(() -> Assert.notNull(any(), eq("Entries must not be null")));
				verify(target).get("version");
			});
		}
	}

	//Sapient generated method id: ${8c95b41e-0035-3f7d-baee-db1c9ab5bebe}
	@Test()
	void getTimeTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Properties properties = new Properties();
			BuildProperties target = spy(new BuildProperties(properties));
			Instant instant = Instant.now();
			doReturn(instant).when(target).getInstant("time");
			//Act Statement(s)
			Instant result = target.getTime();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(instant));
				_assert.verify(() -> Assert.notNull(any(), eq("Entries must not be null")));
				verify(target).getInstant("time");
			});
		}
	}
}
