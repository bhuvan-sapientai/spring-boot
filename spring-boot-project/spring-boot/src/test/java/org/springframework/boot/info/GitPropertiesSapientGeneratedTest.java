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
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class GitPropertiesSapientGeneratedTest {

	//Sapient generated method id: ${3ced7b5f-167d-312c-96b3-76baec811836}
	@Test()
	void getBranchTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			Properties properties = new Properties();
			properties.put("commit.id", object);
			GitProperties target = spy(new GitProperties(properties));
			doReturn("return_of_get1").when(target).get("branch");
			//Act Statement(s)
			String result = target.getBranch();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_get1"));
				_assert.verify(() -> Assert.notNull(any(), eq("Entries must not be null")));
				verify(target).get("branch");
			});
		}
	}

	//Sapient generated method id: ${d40349a8-8e46-3861-b557-990a3167c8d8}
	@Test()
	void getCommitIdTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			Properties properties = new Properties();
			properties.put("commit.id", object);
			GitProperties target = spy(new GitProperties(properties));
			doReturn("return_of_get1").when(target).get("commit.id");
			//Act Statement(s)
			String result = target.getCommitId();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_get1"));
				_assert.verify(() -> Assert.notNull(any(), eq("Entries must not be null")));
				verify(target).get("commit.id");
			});
		}
	}

	//Sapient generated method id: ${90294ede-b626-3fcd-b1ce-dd4da3e2bd16}
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
			_assert.when(() -> Assert.notNull(any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			Properties properties = new Properties();
			properties.put("commit.id", object);
			GitProperties target = spy(new GitProperties(properties));
			doReturn("return_of_get1").when(target).get("commit.id.abbrev");
			//Act Statement(s)
			String result = target.getShortCommitId();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_get1"));
				_assert.verify(() -> Assert.notNull(any(), eq("Entries must not be null")));
				verify(target).get("commit.id.abbrev");
			});
		}
	}

	//Sapient generated method id: ${a7a0016d-cf0d-326b-864a-d5a198a5de92}
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			Properties properties = new Properties();
			properties.put("commit.id", object);
			GitProperties target = spy(new GitProperties(properties));
			doReturn(null).when(target).get("commit.id.abbrev");
			doReturn(null).when(target).getCommitId();
			//Act Statement(s)
			String result = target.getShortCommitId();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.notNull(any(), eq("Entries must not be null")));
				verify(target).get("commit.id.abbrev");
				verify(target).getCommitId();
			});
		}
	}

	//Sapient generated method id: ${758661cf-f66f-3cf5-9702-20fb32973491}
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			Properties properties = new Properties();
			properties.put("commit.id", object);
			GitProperties target = spy(new GitProperties(properties));
			doReturn(null).when(target).get("commit.id.abbrev");
			doReturn("ABCDEFGH").when(target).getCommitId();
			//Act Statement(s)
			String result = target.getShortCommitId();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("ABCDEFG"));
				_assert.verify(() -> Assert.notNull(any(), eq("Entries must not be null")));
				verify(target).get("commit.id.abbrev");
				verify(target).getCommitId();
			});
		}
	}

	//Sapient generated method id: ${f2ddc635-fe32-3b62-bb6f-2c80edeb8e3b}
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			Properties properties = new Properties();
			properties.put("commit.id", object);
			GitProperties target = spy(new GitProperties(properties));
			doReturn(null).when(target).get("commit.id.abbrev");
			doReturn("A").when(target).getCommitId();
			//Act Statement(s)
			String result = target.getShortCommitId();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("A"));
				_assert.verify(() -> Assert.notNull(any(), eq("Entries must not be null")));
				verify(target).get("commit.id.abbrev");
				verify(target).getCommitId();
			});
		}
	}

	//Sapient generated method id: ${6677782f-962f-3195-9309-01a2fc645238}
	@Test()
	void getCommitTimeTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			Properties properties = new Properties();
			properties.put("commit.id", object);
			GitProperties target = spy(new GitProperties(properties));
			Instant instant = Instant.now();
			doReturn(instant).when(target).getInstant("commit.time");
			//Act Statement(s)
			Instant result = target.getCommitTime();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(instant));
				_assert.verify(() -> Assert.notNull(any(), eq("Entries must not be null")));
				verify(target).getInstant("commit.time");
			});
		}
	}
}
