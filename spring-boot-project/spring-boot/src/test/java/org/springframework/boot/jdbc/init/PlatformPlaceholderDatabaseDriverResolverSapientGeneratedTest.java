package org.springframework.boot.jdbc.init;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.jdbc.support.MetaDataAccessException;

import java.util.List;

import org.mockito.stubbing.Answer;

import org.springframework.jdbc.support.JdbcUtils;
import org.springframework.util.StringUtils;
import org.springframework.util.Assert;

import org.mockito.MockedStatic;

import javax.sql.DataSource;

import java.util.ArrayList;

import org.springframework.util.ObjectUtils;
import org.springframework.boot.jdbc.DatabaseDriver;
import org.springframework.jdbc.support.DatabaseMetaDataCallback;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PlatformPlaceholderDatabaseDriverResolverSapientGeneratedTest {

	//Sapient generated method id: ${7c8b9ff9-2594-398f-8fa1-d5ee24c05eb2}
	@Test()
	void withDriverPlatformTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		PlatformPlaceholderDatabaseDriverResolver target = new PlatformPlaceholderDatabaseDriverResolver("placeholderValue");
		//Act Statement(s)
		PlatformPlaceholderDatabaseDriverResolver result = target.withDriverPlatform(DatabaseDriver.H2, "org.h2.Driver");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${518cc5fc-c3b4-312a-add3-1a2c17d63f7e}
	@Test()
	void resolveAllWhenObjectUtilsIsEmptyValues() {
		/* Branches:
		 * (ObjectUtils.isEmpty(values)) : true  #  inside resolveAll method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((DataSource) null, "DataSource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PlatformPlaceholderDatabaseDriverResolver target = new PlatformPlaceholderDatabaseDriverResolver("placeholder1");
			//TODO: Needs initialization with real value
			DataSource dataSource = null;
			String[] stringArray = new String[] {};
			//Act Statement(s)
			List<String> result = target.resolveAll(dataSource, stringArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				_assert.verify(() -> Assert.notNull((DataSource) null, "DataSource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${35df3e6b-7260-32b3-9251-b0aea004ed27}
	@Disabled()
	@Test()
	void resolveAllWhenPlatformIsNull() {
		/* Branches:
		 * (ObjectUtils.isEmpty(values)) : false  #  inside resolveAll method
		 * (for-each(values)) : true  #  inside resolveAll method
		 * (StringUtils.hasLength(value)) : true  #  inside resolveAll method
		 * (value.contains(this.placeholder)) : true  #  inside resolveAll method
		 * (platform != null) : false  #  inside resolveAll method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((DataSource) null, "DataSource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] { "C" };
			objectUtils.when(() -> ObjectUtils.isEmpty(stringArray)).thenReturn(false);
			PlatformPlaceholderDatabaseDriverResolver target = new PlatformPlaceholderDatabaseDriverResolver("C");
			//TODO: Needs initialization with real value
			DataSource dataSource = null;
			//Act Statement(s)
			List<String> result = target.resolveAll(dataSource, stringArray);
			List<String> stringResultList = new ArrayList<>(1);
			stringResultList.add("K");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(stringResultList.size()));
				assertThat(result, containsInRelativeOrder(stringResultList.toArray()));
				_assert.verify(() -> Assert.notNull((DataSource) null, "DataSource must not be null"), atLeast(1));
				objectUtils.verify(() -> ObjectUtils.isEmpty(stringArray), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${261f31cc-b405-3f65-98f4-0ad6403cb161}
	@Test()
	void resolveAll1WhenObjectUtilsIsEmptyValues() {
		/* Branches:
		 * (ObjectUtils.isEmpty(values)) : true  #  inside resolveAll method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("A", "Platform must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PlatformPlaceholderDatabaseDriverResolver target = new PlatformPlaceholderDatabaseDriverResolver("placeholder1");
			String[] stringArray = new String[] {};
			//Act Statement(s)
			List<String> result = target.resolveAll("A", stringArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				_assert.verify(() -> Assert.notNull("A", "Platform must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3a131fb2-d4a4-32c3-948e-4b7b7c089d4c}
	@Disabled()
	@Test()
	void resolveAll1WhenPlatformIsNull() {
		/* Branches:
		 * (ObjectUtils.isEmpty(values)) : false  #  inside resolveAll method
		 * (for-each(values)) : true  #  inside resolveAll method
		 * (StringUtils.hasLength(value)) : true  #  inside resolveAll method
		 * (value.contains(this.placeholder)) : true  #  inside resolveAll method
		 * (platform != null) : false  #  inside resolveAll method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("C", "Platform must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] { "LJ" };
			objectUtils.when(() -> ObjectUtils.isEmpty(stringArray)).thenReturn(false);
			PlatformPlaceholderDatabaseDriverResolver target = new PlatformPlaceholderDatabaseDriverResolver("LJ");
			//Act Statement(s)
			List<String> result = target.resolveAll("C", stringArray);
			List<String> stringResultList = new ArrayList<>(1);
			stringResultList.add("F");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(stringResultList.size()));
				assertThat(result, containsInRelativeOrder(stringResultList.toArray()));
				_assert.verify(() -> Assert.notNull("C", "Platform must not be null"), atLeast(1));
				objectUtils.verify(() -> ObjectUtils.isEmpty(stringArray), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${2e8bef5a-6f89-32ac-857a-5cb73309b76b}
	@Test()
	void getDatabaseDriverTest() throws Exception {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<JdbcUtils> jdbcUtils = mockStatic(JdbcUtils.class)) {
			jdbcUtils.when(() -> JdbcUtils.extractDatabaseMetaData(eq((DataSource) null), (DatabaseMetaDataCallback) any())).thenReturn("A");
			jdbcUtils.when(() -> JdbcUtils.commonDatabaseName("A")).thenReturn("A");
			PlatformPlaceholderDatabaseDriverResolver target = new PlatformPlaceholderDatabaseDriverResolver("placeholderValue");
			//TODO: Needs initialization with real value
			DataSource dataSource = null;
			//Act Statement(s)
			DatabaseDriver result = target.getDatabaseDriver(dataSource);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(DatabaseDriver.UNKNOWN));
				jdbcUtils.verify(() -> JdbcUtils.extractDatabaseMetaData(eq((DataSource) null), (DatabaseMetaDataCallback) any()));
				jdbcUtils.verify(() -> JdbcUtils.commonDatabaseName("A"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${afe0124a-dd92-3f53-9f7a-32fa5ead7403}
	@Disabled()
	@Test()
	void getDatabaseDriverWhenCaughtExceptionThrowsIllegalStateException() throws MetaDataAccessException {
		/* Branches:
		 * (catch-exception (Exception)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<JdbcUtils> jdbcUtils = mockStatic(JdbcUtils.class)) {
			jdbcUtils.when(() -> JdbcUtils.extractDatabaseMetaData(eq((DataSource) null), (DatabaseMetaDataCallback) any())).thenReturn("A");
			jdbcUtils.when(() -> JdbcUtils.commonDatabaseName("A")).thenReturn("A");
			PlatformPlaceholderDatabaseDriverResolver target = new PlatformPlaceholderDatabaseDriverResolver("<value>");
			//TODO: Needs initialization with real value
			DataSource dataSource = null;
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.getDatabaseDriver(dataSource);
			});
			Exception exception = new Exception();
			IllegalStateException illegalStateException = new IllegalStateException("Failed to determine DatabaseDriver", exception);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(exception.getClass())));
				jdbcUtils.verify(() -> JdbcUtils.extractDatabaseMetaData(eq((DataSource) null), (DatabaseMetaDataCallback) any()));
				jdbcUtils.verify(() -> JdbcUtils.commonDatabaseName("A"), atLeast(1));
			});
		}
	}
}
