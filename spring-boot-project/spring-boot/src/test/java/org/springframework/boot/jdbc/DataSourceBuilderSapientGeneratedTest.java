package org.springframework.boot.jdbc;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;
import org.mockito.stubbing.Answer;
import org.springframework.util.Assert;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.mockito.MockedStatic;
import javax.sql.DataSource;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
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

    private final DataSource dataSourceMock = mock(DataSource.class);

    private final DataSource dataSourceMock2 = mock(DataSource.class);

    private final EmbeddedDatabase embeddedDatabaseMock = mock(EmbeddedDatabase.class);

    //Sapient generated method id: ${createTest}, hash: 1CADB1FB2536D9E8AD1EE5D7ED41D889
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

    //Sapient generated method id: ${create1Test}, hash: 4454699849F56A645BD6D06E2349C9D4
    @Test()
    void create1Test() {
        //Arrange Statement(s)
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        //Act Statement(s)
        DataSourceBuilder<?> result = DataSourceBuilder.create(classLoader);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${derivedFromWhenCaughtSQLExceptionThrowsIllegalStateException}, hash: 263F0DEC372157FDAF56D098D4CE307C
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
        doReturn(dataSourceMock2).when(dataSourceMock).unwrap(DataSource.class);
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

    //Sapient generated method id: ${derivedFromWhenDataSourceNotIsWrapperForDataSource}, hash: 5998447E1F0B04AE73F4AE85CF03C8BF
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
            _assert.when(() -> Assert.notNull(dataSourceMock, "DataSource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            DataSourceBuilder<?> result = DataSourceBuilder.derivedFrom(embeddedDatabaseMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(dataSourceMock, "DataSource must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${derivedFromWhenUnwrappedEqualsDataSource}, hash: 7CA7ED40815B8D979F1949EADABCA1FB
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
            _assert.when(() -> Assert.notNull(dataSourceMock, "DataSource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            DataSourceBuilder<?> result = DataSourceBuilder.derivedFrom(embeddedDatabaseMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(dataSourceMock, "DataSource must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${derivedFromWhenUnwrappedEqualsDataSourceAndCaughtSQLException}, hash: 21F0087DF94E15E746341672A41579EE
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
            _assert.when(() -> Assert.notNull(dataSourceMock, "DataSource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            doReturn(true).when(dataSourceMock).isWrapperFor(DataSource.class);
            doReturn(dataSourceMock).when(dataSourceMock).unwrap(DataSource.class);
            //Act Statement(s)
            DataSourceBuilder<?> result = DataSourceBuilder.derivedFrom(embeddedDatabaseMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(dataSourceMock, "DataSource must not be null"), atLeast(1));
                verify(dataSourceMock, atLeast(1)).isWrapperFor(DataSource.class);
                verify(dataSourceMock, atLeast(1)).unwrap(DataSource.class);
            });
        }
    }

    //Sapient generated method id: ${derivedFromWhenDataSourceIsWrapperForDataSourceAndUnwrappedEqualsDataSource}, hash: B6428D5332728B49771133F4D33609DF
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
            _assert.when(() -> Assert.notNull(dataSourceMock, "DataSource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            DataSourceBuilder<?> result = DataSourceBuilder.derivedFrom(dataSourceMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(dataSourceMock, "DataSource must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${derivedFromWhenUnwrappedNotEqualsDataSource}, hash: EDA3A139C6B506E03A013D8CE89E1E13
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
            _assert.when(() -> Assert.notNull(dataSourceMock, "DataSource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            DataSourceBuilder<?> result = DataSourceBuilder.derivedFrom(dataSourceMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(dataSourceMock, "DataSource must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${findTypeWhenMappingsIsNotNull}, hash: 49D9E800BC1C403984EF64CEED349B7F
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

    //Sapient generated method id: ${findTypeWhenMappingsIsNull}, hash: 86139E295703C9F0BA1AFDE59E7DCB2B
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
