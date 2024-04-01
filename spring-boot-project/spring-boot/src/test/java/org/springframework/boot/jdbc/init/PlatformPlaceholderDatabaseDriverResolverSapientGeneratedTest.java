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

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PlatformPlaceholderDatabaseDriverResolverSapientGeneratedTest {

	private final DataSource dataSourceMock = mock(DataSource.class);

	//Sapient generated method id: ${7c8b9ff9-2594-398f-8fa1-d5ee24c05eb2}, hash: 0617AC6F1C9DEA6BD90FFB058E9BD9A8
	@Test()
	void withDriverPlatformTest() {
		//Arrange Statement(s)
		PlatformPlaceholderDatabaseDriverResolver target = new PlatformPlaceholderDatabaseDriverResolver("placeholder1");
		//Act Statement(s)
		PlatformPlaceholderDatabaseDriverResolver result = target.withDriverPlatform(DatabaseDriver.UNKNOWN, "platform1");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${518cc5fc-c3b4-312a-add3-1a2c17d63f7e}, hash: 9B152322245ACC84CDECFD040346DD94
	@Test()
	void resolveAllWhenObjectUtilsIsEmptyValues() {
		/* Branches:
		 * (ObjectUtils.isEmpty(values)) : true  #  inside resolveAll method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(dataSourceMock, "DataSource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PlatformPlaceholderDatabaseDriverResolver target = new PlatformPlaceholderDatabaseDriverResolver("placeholder1");
			String[] stringArray = new String[] {};
			//Act Statement(s)
			List<String> result = target.resolveAll(dataSourceMock, stringArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				_assert.verify(() -> Assert.notNull(dataSourceMock, "DataSource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${35df3e6b-7260-32b3-9251-b0aea004ed27}, hash: 899877A54A5398107E2EF63F490C0AB7
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
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: platformProvider - Method: get
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(dataSourceMock, "DataSource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] { "" };
			objectUtils.when(() -> ObjectUtils.isEmpty(stringArray)).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasLength("")).thenReturn(true);
			PlatformPlaceholderDatabaseDriverResolver target = new PlatformPlaceholderDatabaseDriverResolver("");
			//Act Statement(s)
			List<String> result = target.resolveAll(dataSourceMock, stringArray);
			List<String> stringResultList = new ArrayList<>(1);
			stringResultList.add("");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(1));
				assertThat(result, containsInRelativeOrder(stringResultList.toArray()));
				_assert.verify(() -> Assert.notNull(dataSourceMock, "DataSource must not be null"), atLeast(1));
				objectUtils.verify(() -> ObjectUtils.isEmpty(stringArray), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength(""), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${261f31cc-b405-3f65-98f4-0ad6403cb161}, hash: 487B27CEF0B962D71A1F87D334949FD5
	@Test()
	void resolveAll1WhenObjectUtilsIsEmptyValues() {
		/* Branches:
		 * (ObjectUtils.isEmpty(values)) : true  #  inside resolveAll method
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

	//Sapient generated method id: ${3a131fb2-d4a4-32c3-948e-4b7b7c089d4c}, hash: ED53CFFCFD96407A1267FDF3EE9E2528
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
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: platformProvider - Method: get
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("C", "Platform must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] { "A" };
			objectUtils.when(() -> ObjectUtils.isEmpty(stringArray)).thenReturn(false);
			PlatformPlaceholderDatabaseDriverResolver target = new PlatformPlaceholderDatabaseDriverResolver("A");
			//Act Statement(s)
			List<String> result = target.resolveAll("C", stringArray);
			List<String> stringResultList = new ArrayList<>(1);
			stringResultList.add("E");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(1));
				assertThat(result, containsInRelativeOrder(stringResultList.toArray()));
				_assert.verify(() -> Assert.notNull("C", "Platform must not be null"), atLeast(1));
				objectUtils.verify(() -> ObjectUtils.isEmpty(stringArray), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${2e8bef5a-6f89-32ac-857a-5cb73309b76b}, hash: 813A638309961DDDFEC245416A9398C6
	@Test()
	void getDatabaseDriverTest() throws Exception {
		//Arrange Statement(s)
		try (MockedStatic<JdbcUtils> jdbcUtils = mockStatic(JdbcUtils.class, CALLS_REAL_METHODS)) {
			jdbcUtils.when(() -> JdbcUtils.extractDatabaseMetaData(eq(dataSourceMock), (DatabaseMetaDataCallback) any())).thenReturn("A");
			PlatformPlaceholderDatabaseDriverResolver target = new PlatformPlaceholderDatabaseDriverResolver("placeholder1");
			//Act Statement(s)
			DatabaseDriver result = target.getDatabaseDriver(dataSourceMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(DatabaseDriver.UNKNOWN));
				jdbcUtils.verify(() -> JdbcUtils.extractDatabaseMetaData(eq(dataSourceMock), (DatabaseMetaDataCallback) any()), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${afe0124a-dd92-3f53-9f7a-32fa5ead7403}, hash: 196188E6F51CF47F5FAAF72213AE3C47
	@Test()
	void getDatabaseDriverWhenCaughtExceptionThrowsIllegalStateException() throws MetaDataAccessException {
		/* Branches:
		 * (catch-exception (Exception)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<DatabaseDriver> databaseDriver = mockStatic(DatabaseDriver.class, CALLS_REAL_METHODS);
			 MockedStatic<JdbcUtils> jdbcUtils = mockStatic(JdbcUtils.class, CALLS_REAL_METHODS)) {
			jdbcUtils.when(() -> JdbcUtils.extractDatabaseMetaData(eq(dataSourceMock), (DatabaseMetaDataCallback) any())).thenReturn("A");
			RuntimeException runtimeException = new RuntimeException();
			databaseDriver.when(() -> DatabaseDriver.fromProductName("A")).thenThrow(runtimeException);
			PlatformPlaceholderDatabaseDriverResolver target = new PlatformPlaceholderDatabaseDriverResolver("placeholder1");
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.getDatabaseDriver(dataSourceMock);
			});
			IllegalStateException illegalStateException = new IllegalStateException("Failed to determine DatabaseDriver", runtimeException);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(runtimeException.getClass())));
				jdbcUtils.verify(() -> JdbcUtils.extractDatabaseMetaData(eq(dataSourceMock), (DatabaseMetaDataCallback) any()), atLeast(1));
				databaseDriver.verify(() -> DatabaseDriver.fromProductName("A"), atLeast(1));
			});
		}
	}
}
