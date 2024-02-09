package org.springframework.boot.jdbc;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import org.mockito.stubbing.Answer;

import org.springframework.util.Assert;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;

import org.mockito.MockedStatic;

import javax.sql.DataSource;

import org.springframework.beans.BeanUtils;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DataSourceBuilderSapientGeneratedTest {

	private final EmbeddedDatabase embeddedDatabaseMock = mock(EmbeddedDatabase.class);

	//Sapient generated method id: ${335ebe31-75d6-3bfc-bc95-7f09d55b4633}
	@Test()
	void typeTest() {
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//Act Statement(s)
		//DataSourceBuilder result = target.type(DataSource.class);
		//Assert statement(s)
		//assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${d8ad6d8d-2a92-3704-a798-22598ddace07}
	@Test()
	void urlTest() {
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//Act Statement(s)
		//DataSourceBuilder result = target.url("url1");
		//Assert statement(s)
		//assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${a13a2db9-8eea-3872-98b5-e25987c4c593}
	@Test()
	void driverClassNameTest() {
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//Act Statement(s)
		//DataSourceBuilder result = target.driverClassName("driverClassName1");
		//Assert statement(s)
		//assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${d54505ca-3109-3075-a64f-88e8e8cc512e}
	@Test()
	void usernameTest() {
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//Act Statement(s)
		//DataSourceBuilder result = target.username("username1");
		//Assert statement(s)
		//assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${899b6ea8-9c20-314d-8577-61ec64186c46}
	@Test()
	void passwordTest() {
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//Act Statement(s)
		//DataSourceBuilder result = target.password("password1");
		//Assert statement(s)
		//assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${9fae3634-22c4-3025-802c-5b581ce64354}
	@Test()
	void buildWhenThisValuesNotContainsKeyDataSourcePropertyURL() {
	}

	//Sapient generated method id: ${2284fc3d-473b-3992-886d-8fe431bd702d}
	@Test()
	void createTest() {
		//Arrange Statement(s)
		DataSourceBuilder dataSourceBuilderMock = mock(DataSourceBuilder.class);
		try (MockedStatic<DataSourceBuilder> dataSourceBuilder = mockStatic(DataSourceBuilder.class, CALLS_REAL_METHODS)) {
			dataSourceBuilder.when(() -> DataSourceBuilder.create((ClassLoader) null)).thenReturn(dataSourceBuilderMock);
			//Act Statement(s)
			DataSourceBuilder<?> result = DataSourceBuilder.create();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(dataSourceBuilderMock));
				dataSourceBuilder.verify(() -> DataSourceBuilder.create((ClassLoader) null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${b0d142e8-0743-37b5-ba4a-5c4957c16e12}
	@Test()
	void create1Test() {
		//Arrange Statement(s)
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//Act Statement(s)
		DataSourceBuilder<?> result = DataSourceBuilder.create(classLoader);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${43d4f836-fd88-3399-b746-18828d875e24}
	@Disabled()
	@Test()
	void derivedFromWhenCaughtSQLExceptionThrowsIllegalStateException() throws SQLException {
		/* Branches:
		 * (dataSource instanceof EmbeddedDatabase) : true
		 * (catch-exception (SQLException)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		EmbeddedDatabase dataSourceMock = mock(EmbeddedDatabase.class);
		//TODO: Needs to return real value
		doReturn(null).when(dataSourceMock).unwrap(DataSource.class);
		SQLException sQLException = new SQLException();
		IllegalStateException illegalStateException = new IllegalStateException("Unable to unwrap embedded database", sQLException);
		//Act Statement(s)
		final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
			DataSourceBuilder.derivedFrom(dataSourceMock);
		});
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
			assertThat(result.getCause(), is(instanceOf(sQLException.getClass())));
			verify(dataSourceMock).unwrap(DataSource.class);
		});
	}

	//Sapient generated method id: ${c55415b9-768f-3d10-8c8b-1a540bfb7251}
	@Disabled()
	@Test()
	void derivedFromWhenDataSourceNotIsWrapperForDataSource() throws SQLException {
		/* Branches:
		 * (dataSource instanceof EmbeddedDatabase) : true
		 * (dataSource.isWrapperFor(DataSource.class)) : false  #  inside unwrap method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((DataSource) null, "DataSource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			DataSourceBuilder<?> result = DataSourceBuilder.derivedFrom(embeddedDatabaseMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull((DataSource) null, "DataSource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${9fab5e92-e6e0-3aae-b596-abe031f9ace9}
	@Disabled()
	@Test()
	void derivedFromWhenUnwrappedEqualsDataSource() throws SQLException {
		/* Branches:
		 * (dataSource instanceof EmbeddedDatabase) : true
		 * (dataSource.isWrapperFor(DataSource.class)) : true  #  inside unwrap method
		 * (unwrapped == dataSource) : true  #  inside unwrap method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((DataSource) null, "DataSource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			DataSourceBuilder<?> result = DataSourceBuilder.derivedFrom(embeddedDatabaseMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull((DataSource) null, "DataSource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${77121d83-f399-3956-916f-2a07056fafdd}
	@Disabled()
	@Test()
	void derivedFromWhenUnwrappedEqualsDataSourceAndCaughtSQLException() throws SQLException {
		/* Branches:
		 * (dataSource instanceof EmbeddedDatabase) : true
		 * (dataSource.isWrapperFor(DataSource.class)) : true  #  inside unwrap method
		 * (unwrapped == dataSource) : true  #  inside unwrap method
		 * (catch-exception (SQLException)) : true  #  inside unwrap method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((DataSource) null, "DataSource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			DataSourceBuilder<?> result = DataSourceBuilder.derivedFrom(embeddedDatabaseMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull((DataSource) null, "DataSource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${96559438-8315-3d6d-b72c-dc6036187933}
	@Disabled()
	@Test()
	void derivedFromWhenDataSourceIsWrapperForDataSourceAndUnwrappedEqualsDataSource() throws SQLException {
		/* Branches:
		 * (dataSource instanceof EmbeddedDatabase) : false
		 * (catch-exception (SQLException)) : true
		 * (dataSource.isWrapperFor(DataSource.class)) : true  #  inside unwrap method
		 * (unwrapped == dataSource) : true  #  inside unwrap method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((DataSource) null, "DataSource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//TODO: Needs initialization with real value
			DataSource dataSource = null;
			//Act Statement(s)
			DataSourceBuilder<?> result = DataSourceBuilder.derivedFrom(dataSource);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull((DataSource) null, "DataSource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${6968da25-861f-3801-a9fb-74c71fdb7da9}
	@Disabled()
	@Test()
	void derivedFromWhenUnwrappedNotEqualsDataSource() throws SQLException {
		/* Branches:
		 * (dataSource instanceof EmbeddedDatabase) : false
		 * (catch-exception (SQLException)) : true
		 * (dataSource.isWrapperFor(DataSource.class)) : true  #  inside unwrap method
		 * (unwrapped == dataSource) : false  #  inside unwrap method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((DataSource) null, "DataSource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//TODO: Needs initialization with real value
			DataSource dataSource = null;
			//Act Statement(s)
			DataSourceBuilder<?> result = DataSourceBuilder.derivedFrom(dataSource);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull((DataSource) null, "DataSource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f61e772c-1471-3447-9c48-ab49aa5967b0}
	@Disabled()
	@Test()
	void findTypeWhenMappingsIsNotNull() {
		/* Branches:
		 * (mappings != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//Act Statement(s)
		Class result = DataSourceBuilder.findType(classLoader);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(DataSource.class)));
	}

	//Sapient generated method id: ${93b5dce4-3dba-3930-8a22-d9bb8c1a41b4}
	@Test()
	void findTypeWhenMappingsIsNull() {
		/* Branches:
		 * (mappings != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//Act Statement(s)
		Class result = DataSourceBuilder.findType(classLoader);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}
}
