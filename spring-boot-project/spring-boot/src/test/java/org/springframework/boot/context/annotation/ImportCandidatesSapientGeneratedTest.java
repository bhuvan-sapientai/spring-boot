package org.springframework.boot.context.annotation;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import org.mockito.stubbing.Answer;

import java.util.Iterator;

import org.springframework.util.Assert;

import org.mockito.MockedStatic;

import java.util.Spliterators;
import java.util.ArrayList;
import java.util.stream.StreamSupport;

import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ImportCandidatesSapientGeneratedTest {

	//Sapient generated method id: ${78c09fb6-edcf-3ce7-9932-6ef4ffc152b3}, hash: 9F249448942ACA43C36F394E6202A47A
	@Test()
	void iteratorTest() throws IOException {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(Object.class, "'annotation' must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(anyList(), eq("'candidates' must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			ImportCandidates target = ImportCandidates.load(Object.class, (ClassLoader) null);
			//Act Statement(s)
			Iterator<String> result = target.iterator();
			List<String> stringList = new ArrayList<>();
			Iterator<String> iteratorResult = stringList.iterator();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(StreamSupport.stream(Spliterators.spliteratorUnknownSize(result, 0), false).toArray(), equalTo(StreamSupport.stream(Spliterators.spliteratorUnknownSize(iteratorResult, 0), false).toArray()));
				_assert.verify(() -> Assert.notNull(Object.class, "'annotation' must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(anyList(), eq("'candidates' must not be null")));
			});
		}
	}

	//Sapient generated method id: ${a3c7da29-0bbd-3f39-9f91-a3778d99b52f}, hash: BA2196995F22054A6627BA260299EF22
	@Test()
	void loadWhenCaughtIOExceptionThrowsIllegalArgumentException() throws IOException {
		/* Branches:
		 * (classLoader == null) : true  #  inside decideClassloader method
		 * (catch-exception (IOException)) : true  #  inside findUrlsInClasspath method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(Object.class, "'annotation' must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ClassLoader classLoader = null;
			//Act Statement(s)
			final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
				ImportCandidates.load(Object.class, classLoader);
			});
			IOException iOException = new IOException();
			IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Failed to load configurations from location [META-INF/spring/.imports]", iOException);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
				_assert.verify(() -> Assert.notNull(Object.class, "'annotation' must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c16e6d43-e4d4-3f25-9b3e-719ad3301153}, hash: A03435392657856DF1BEE28F8ACBEC12
	@Test()
	void loadWhenClassLoaderIsNotNullAndUrlsNotHasMoreElements() throws Throwable, IOException {
		/* Branches:
		 * (classLoader == null) : false  #  inside decideClassloader method
		 * (urls.hasMoreElements()) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(String.class, "'annotation' must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(anyList(), eq("'candidates' must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			//Act Statement(s)
			ImportCandidates result = ImportCandidates.load(String.class, classLoader);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(String.class, "'annotation' must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(anyList(), eq("'candidates' must not be null")));
			});
		}
	}

	//Sapient generated method id: ${66276f23-9dba-3ae4-aaf3-495b01d2b949}, hash: 21B635498E08B345DF1A1EA2D0379E1A
	@Test()
	void loadWhenLineIsEmpty() throws Throwable, IOException {
		/* Branches:
		 * (classLoader == null) : true  #  inside decideClassloader method
		 * (urls.hasMoreElements()) : true
		 * ((line = reader.readLine()) != null) : true  #  inside readCandidateConfigurations method
		 * (commentStart == -1) : true  #  inside stripComment method
		 * (line.isEmpty()) : true  #  inside readCandidateConfigurations method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(String.class, "'annotation' must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(anyList(), eq("'candidates' must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			//TODO: Needs initialization with real value
			ClassLoader classLoader = null;
			//Act Statement(s)
			ImportCandidates result = ImportCandidates.load(String.class, classLoader);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(String.class, "'annotation' must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(anyList(), eq("'candidates' must not be null")));
			});
		}
	}

	//Sapient generated method id: ${f3da8e3e-2e95-395b-9655-a8600e04db22}, hash: 4C12321DC2BCF10E83517C79597E6F07
	@Test()
	void loadWhenCommentStartNotEqualsMinus1AndLineNotIsEmpty() throws Throwable, IOException {
		/* Branches:
		 * (classLoader == null) : true  #  inside decideClassloader method
		 * (urls.hasMoreElements()) : true
		 * ((line = reader.readLine()) != null) : true  #  inside readCandidateConfigurations method
		 * (commentStart == -1) : false  #  inside stripComment method
		 * (line.isEmpty()) : false  #  inside readCandidateConfigurations method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(String.class, "'annotation' must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(anyList(), eq("'candidates' must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			//TODO: Needs initialization with real value
			ClassLoader classLoader = null;
			//Act Statement(s)
			ImportCandidates result = ImportCandidates.load(String.class, classLoader);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(String.class, "'annotation' must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(anyList(), eq("'candidates' must not be null")));
			});
		}
	}

	//Sapient generated method id: ${2b216bd1-213c-3ae7-8203-1ee6c92eb640}, hash: 268C1EC975ECE19B3D0D6864AC71EE9B
	@Test()
	void loadWhenDefaultBranchThrowsThrowable() throws IOException {
		/* Branches:
		 * (classLoader == null) : true  #  inside decideClassloader method
		 * (urls.hasMoreElements()) : true
		 * ((line = reader.readLine()) != null) : true  #  inside readCandidateConfigurations method
		 * (commentStart == -1) : true  #  inside stripComment method
		 * (line.isEmpty()) : true  #  inside readCandidateConfigurations method
		 * (branch expression (line 110)) : true  #  inside readCandidateConfigurations method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(String.class, "'annotation' must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//TODO: Needs initialization with real value
			ClassLoader classLoader = null;
			//Act Statement(s)
			final Throwable result = assertThrows(Throwable.class, () -> {
				ImportCandidates.load(String.class, classLoader);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(String.class, "'annotation' must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${48a9e60b-ff61-3e6e-8a7b-c99dc294b5dd}, hash: 06DE1A1CDB064FBE5EB10FB7B4E09390
	@Test()
	void loadWhenLineIsEmptyAndCaughtIOExceptionThrowsIllegalArgumentException() throws IOException {
		/* Branches:
		 * (classLoader == null) : true  #  inside decideClassloader method
		 * (urls.hasMoreElements()) : true
		 * ((line = reader.readLine()) != null) : true  #  inside readCandidateConfigurations method
		 * (commentStart == -1) : true  #  inside stripComment method
		 * (line.isEmpty()) : true  #  inside readCandidateConfigurations method
		 * (catch-exception (IOException)) : true  #  inside readCandidateConfigurations method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(String.class, "'annotation' must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//TODO: Needs initialization with real value
			ClassLoader classLoader = null;
			//Act Statement(s)
			final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
				ImportCandidates.load(String.class, classLoader);
			});
			IOException iOException = new IOException();
			IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unable to load configurations from location [load_object1]", iOException);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
				_assert.verify(() -> Assert.notNull(String.class, "'annotation' must not be null"), atLeast(1));
			});
		}
	}
}
