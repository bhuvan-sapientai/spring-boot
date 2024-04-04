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
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class GitPropertiesSapientGeneratedTest {

	//Sapient generated method id: ${3ced7b5f-167d-312c-96b3-76baec811836}, hash: 6408A43EBA986C6443252BA03DC54213
	@Test()
	void getBranchTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Properties properties = new Properties();
		GitProperties target = new GitProperties(properties);

		//Act Statement(s)
		String result = target.getBranch();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${d40349a8-8e46-3861-b557-990a3167c8d8}, hash: D8B8AB5DF259284DFEC717CDCB13F0F7
	@Test()
	void getCommitIdTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Properties properties = new Properties();
		GitProperties target = new GitProperties(properties);

		//Act Statement(s)
		String result = target.getCommitId();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${90294ede-b626-3fcd-b1ce-dd4da3e2bd16}, hash: 503D7EC6AFC1ED90108C720466261777
	@Test()
	void getShortCommitIdWhenShortIdIsNotNull() {
		/* Branches:
		 * (shortId != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Properties) any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			Properties properties = new Properties();
			properties.put("commit.id", object);
			GitProperties target = new GitProperties(properties);
			//Act Statement(s)
			String result = target.getShortCommitId();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("result1"));
				_assert.verify(() -> Assert.notNull((Properties) any(), eq("Entries must not be null")));
			});
		}
	}

	//Sapient generated method id: ${a7a0016d-cf0d-326b-864a-d5a198a5de92}, hash: 2444439D09C4B178BEE710F80289A386
	@Test()
	void getShortCommitIdWhenIdIsNull() {
		/* Branches:
		 * (shortId != null) : false
		 * (id == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Properties properties = new Properties();
		GitProperties target = spy(new GitProperties(properties));
		doReturn(null).when(target).getCommitId();

		//Act Statement(s)
		String result = target.getShortCommitId();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(nullValue()));
			verify(target).getCommitId();
		});
	}

	//Sapient generated method id: ${758661cf-f66f-3cf5-9702-20fb32973491}, hash: EA07B715A8B54FAE8FD3C401746C13A2
	@Test()
	void getShortCommitIdWhenIdLengthGreaterThan7() {
		/* Branches:
		 * (shortId != null) : false
		 * (id == null) : false
		 * (id.length() > 7) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Properties properties = new Properties();
		GitProperties target = spy(new GitProperties(properties));
		doReturn("ABCDEFGH").when(target).getCommitId();

		//Act Statement(s)
		String result = target.getShortCommitId();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("ABCDEFG"));
			verify(target).getCommitId();
		});
	}

	//Sapient generated method id: ${f2ddc635-fe32-3b62-bb6f-2c80edeb8e3b}, hash: 606795C01FF110045D30AEA2B36649BC
	@Test()
	void getShortCommitIdWhenIdLengthNotGreaterThan7() {
		/* Branches:
		 * (shortId != null) : false
		 * (id == null) : false
		 * (id.length() > 7) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Properties properties = new Properties();
		GitProperties target = spy(new GitProperties(properties));
		doReturn("A").when(target).getCommitId();

		//Act Statement(s)
		String result = target.getShortCommitId();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("A"));
			verify(target).getCommitId();
		});
	}

	//Sapient generated method id: ${6677782f-962f-3195-9309-01a2fc645238}, hash: A2164BA9D99E1CF937A9D0480D7FABF3
	@Test()
	void getCommitTimeTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Properties properties = new Properties();
		GitProperties target = spy(new GitProperties(properties));
		Instant instant = Instant.ofEpochSecond(1700000000);
		doReturn(instant).when(target).getInstant("commit.time");

		//Act Statement(s)
		Instant result = target.getCommitTime();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(instant));
			verify(target).getInstant("commit.time");
		});
	}
}
