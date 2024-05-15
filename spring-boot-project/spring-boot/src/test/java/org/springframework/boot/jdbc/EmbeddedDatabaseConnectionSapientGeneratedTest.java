package org.springframework.boot.jdbc;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.dao.DataAccessException;
import org.mockito.stubbing.Answer;
import org.springframework.util.ClassUtils;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.mockito.MockedStatic;
import javax.sql.DataSource;
import org.springframework.util.Assert;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class EmbeddedDatabaseConnectionSapientGeneratedTest {

    private final DataSource dataSourceMock = mock(DataSource.class);

    //Sapient generated method id: ${getDriverClassNameWhenDefaultBranchThrowsIncompatibleClassChangeError}, hash: DBDF73948CA30BB20A73AC9519A71CC2
    @Disabled()
    @Test()
    void getDriverClassNameWhenDefaultBranchThrowsIncompatibleClassChangeError() {
        /* Branches:
         * (branch expression (line 87)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");
        //Act Statement(s)
        final IncompatibleClassChangeError result = assertThrows(IncompatibleClassChangeError.class, () -> {
            target.getDriverClassName();
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getDriverClassNameWhenSwitchThisCaseDERBY}, hash: E014C7E5D1C71C5DDA66164E0503E7C5
    @Disabled()
    @Test()
    void getDriverClassNameWhenSwitchThisCaseDERBY() {
        /* Branches:
         * (switch(this) = DERBY) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");
        //Act Statement(s)
        String result = target.getDriverClassName();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("org.apache.derby.jdbc.EmbeddedDriver")));
    }

    //Sapient generated method id: ${getDriverClassNameWhenSwitchThisCaseH2}, hash: 94D1DB3E80585BC96CD533514AE61964
    @Test()
    void getDriverClassNameWhenSwitchThisCaseH2() {
        /* Branches:
         * (switch(this) = H2) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");
        //Act Statement(s)
        String result = target.getDriverClassName();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("org.h2.Driver")));
    }

    //Sapient generated method id: ${getDriverClassNameWhenSwitchThisCaseHSQLDB}, hash: 394451BDC6E6B311619841A9711D3785
    @Disabled()
    @Test()
    void getDriverClassNameWhenSwitchThisCaseHSQLDB() {
        /* Branches:
         * (switch(this) = HSQLDB) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");
        //Act Statement(s)
        String result = target.getDriverClassName();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("org.hsqldb.jdbc.JDBCDriver")));
    }

    //Sapient generated method id: ${getDriverClassNameWhenSwitchThisCaseNONE}, hash: 315D93FB80744CE4004800934A812A34
    @Disabled()
    @Test()
    void getDriverClassNameWhenSwitchThisCaseNONE() {
        /* Branches:
         * (switch(this) = NONE) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");
        //Act Statement(s)
        String result = target.getDriverClassName();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getTypeWhenDefaultBranchThrowsIncompatibleClassChangeError}, hash: FA21F67EE36F51A8EAA69A6104ECD3D3
    @Disabled()
    @Test()
    void getTypeWhenDefaultBranchThrowsIncompatibleClassChangeError() {
        /* Branches:
         * (branch expression (line 101)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");
        //Act Statement(s)
        final IncompatibleClassChangeError result = assertThrows(IncompatibleClassChangeError.class, () -> {
            target.getType();
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getTypeWhenSwitchThisCaseDERBY}, hash: 06F02A0C0622A3136ADF4D936C6971F6
    @Disabled()
    @Test()
    void getTypeWhenSwitchThisCaseDERBY() {
        /* Branches:
         * (switch(this) = DERBY) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");
        //Act Statement(s)
        EmbeddedDatabaseType result = target.getType();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(EmbeddedDatabaseType.DERBY)));
    }

    //Sapient generated method id: ${getTypeWhenSwitchThisCaseH2}, hash: F1A129A227BECAD4B2BF38B949801E43
    @Test()
    void getTypeWhenSwitchThisCaseH2() {
        /* Branches:
         * (switch(this) = H2) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");
        //Act Statement(s)
        EmbeddedDatabaseType result = target.getType();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(EmbeddedDatabaseType.H2)));
    }

    //Sapient generated method id: ${getTypeWhenSwitchThisCaseHSQLDB}, hash: 6F5AFB1B7AF7AB14807C31F5BC2787DC
    @Disabled()
    @Test()
    void getTypeWhenSwitchThisCaseHSQLDB() {
        /* Branches:
         * (switch(this) = HSQLDB) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");
        //Act Statement(s)
        EmbeddedDatabaseType result = target.getType();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(EmbeddedDatabaseType.HSQL)));
    }

    //Sapient generated method id: ${getTypeWhenSwitchThisCaseNONE}, hash: 944E40B876AAC0FA04DF942AE80F3770
    @Disabled()
    @Test()
    void getTypeWhenSwitchThisCaseNONE() {
        /* Branches:
         * (switch(this) = NONE) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");
        //Act Statement(s)
        EmbeddedDatabaseType result = target.getType();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getUrlWhenThisUrlIsNull}, hash: ACF748AB6B43A5E69E301D25AA26432C
    @Disabled()
    @Test()
    void getUrlWhenThisUrlIsNull() {
        /* Branches:
         * (this.url != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText("I", "DatabaseName must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
            EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");
            //Act Statement(s)
            String result = target.getUrl("I");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                _assert.verify(() -> Assert.hasText("I", "DatabaseName must not be empty"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isEmbeddedUrlWhenDefaultBranchThrowsIncompatibleClassChangeError}, hash: 8A48FA036163F45BCF9FFB64C6D04BC8
    @Disabled()
    @Test()
    void isEmbeddedUrlWhenDefaultBranchThrowsIncompatibleClassChangeError() {
        /* Branches:
         * (branch expression (line 121)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");
        //Act Statement(s)
        final IncompatibleClassChangeError result = assertThrows(IncompatibleClassChangeError.class, () -> {
            target.isEmbeddedUrl("url1");
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${isEmbeddedUrlWhenSwitchThisCaseDERBY}, hash: 947953119BF9DB41E69ADC5680F8E144
    @Disabled()
    @Test()
    void isEmbeddedUrlWhenSwitchThisCaseDERBY() {
        /* Branches:
         * (switch(this) = DERBY) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");
        //Act Statement(s)
        boolean result = target.isEmbeddedUrl("url1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isEmbeddedUrlWhenSwitchThisCaseNONE}, hash: 19B9E2FF5CECEBC88FFF433419963496
    @Test()
    void isEmbeddedUrlWhenSwitchThisCaseNONE() {
        /* Branches:
         * (switch(this) = NONE) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");
        //Act Statement(s)
        boolean result = target.isEmbeddedUrl("url1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isEmbeddedUrlWhenDefaultBranch}, hash: 8D4E9AD345B1EA4661B3AFD130C7F3ED
    @Test()
    void isEmbeddedUrlWhenDefaultBranch() {
        /* Branches:
         * (switch(this) = H2) : true
         * (branch expression (line 121)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");
        //Act Statement(s)
        boolean result = target.isEmbeddedUrl(":h2:mem");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isEmbeddedUrlWhenSwitchThisCaseHSQLDBAndDefaultBranch}, hash: 878BC358ECED0FDE074EDD8CDBF47179
    @Disabled()
    @Test()
    void isEmbeddedUrlWhenSwitchThisCaseHSQLDBAndDefaultBranch() {
        /* Branches:
         * (switch(this) = HSQLDB) : true
         * (branch expression (line 121)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");
        //Act Statement(s)
        boolean result = target.isEmbeddedUrl(":hsqldb:mem:");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isDriverCompatibleWhenDefaultBranchThrowsIncompatibleClassChangeError}, hash: F1D0B61A9244006E78607E5EA5C2C9D9
    @Disabled()
    @Test()
    void isDriverCompatibleWhenDefaultBranchThrowsIncompatibleClassChangeError() {
        /* Branches:
         * (driverClass != null) : true
         * (branch expression (line 87)) : true  #  inside getDriverClassName method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");
        //Act Statement(s)
        final IncompatibleClassChangeError result = assertThrows(IncompatibleClassChangeError.class, () -> {
            target.isDriverCompatible("driverClass1");
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${isDriverCompatibleWhenDriverClassEqualsGetDriverClassName}, hash: F8C5E9FAEB9592027A47C8A1AE0BE857
    @Disabled()
    @Test()
    void isDriverCompatibleWhenDriverClassEqualsGetDriverClassName() {
        /* Branches:
         * (driverClass != null) : true
         * (switch(this) = DERBY) : true  #  inside getDriverClassName method
         * (driverClass.equals(getDriverClassName())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");
        //Act Statement(s)
        boolean result = target.isDriverCompatible("org.apache.derby.jdbc.EmbeddedDriver");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isDriverCompatibleWhenSwitchThisCaseH2AndDriverClassEqualsGetDriverClassName}, hash: 54AD4631C13AA10D5E049C8E04E6E2FA
    @Test()
    void isDriverCompatibleWhenSwitchThisCaseH2AndDriverClassEqualsGetDriverClassName() {
        /* Branches:
         * (driverClass != null) : true
         * (switch(this) = H2) : true  #  inside getDriverClassName method
         * (driverClass.equals(getDriverClassName())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");
        //Act Statement(s)
        boolean result = target.isDriverCompatible("org.h2.Driver");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isDriverCompatibleWhenSwitchThisCaseHSQLDBAndDriverClassEqualsGetDriverClassName}, hash: A3D23F901DAE1EC319551ABB09A7244C
    @Disabled()
    @Test()
    void isDriverCompatibleWhenSwitchThisCaseHSQLDBAndDriverClassEqualsGetDriverClassName() {
        /* Branches:
         * (driverClass != null) : true
         * (switch(this) = HSQLDB) : true  #  inside getDriverClassName method
         * (driverClass.equals(getDriverClassName())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");
        //Act Statement(s)
        boolean result = target.isDriverCompatible("org.hsqldb.jdbc.JDBCDriver");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isDriverCompatibleWhenDriverClassEqualsThisAlternativeDriverClass}, hash: AFCA7E0EA47CF776187FE3DF40F25DD8
    @Disabled()
    @Test()
    void isDriverCompatibleWhenDriverClassEqualsThisAlternativeDriverClass() {
        /* Branches:
         * (driverClass != null) : true
         * (switch(this) = NONE) : true  #  inside getDriverClassName method
         * (driverClass.equals(getDriverClassName())) : false
         * (driverClass.equals(this.alternativeDriverClass)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("name1");
        //Act Statement(s)
        boolean result = target.isDriverCompatible("driverClass1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isDriverCompatibleWhenDriverClassNotEqualsThisAlternativeDriverClass}, hash: 00E4FDD5B38357F5781F97C4B4F5CC3E
    @Test()
    void isDriverCompatibleWhenDriverClassNotEqualsThisAlternativeDriverClass() {
        /* Branches:
         * (driverClass != null) : true
         * (switch(this) = NONE) : true  #  inside getDriverClassName method
         * (driverClass.equals(getDriverClassName())) : false
         * (driverClass.equals(this.alternativeDriverClass)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");
        //Act Statement(s)
        boolean result = target.isDriverCompatible("I");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isEmbeddedWhenDriverClassIsNull}, hash: 7CC4EB7AA78F44A6DAE98939FEB7F9E7
    @Test()
    void isEmbeddedWhenDriverClassIsNull() {
        /* Branches:
         * (driverClass == null) : true
         */
        //Act Statement(s)
        boolean result = EmbeddedDatabaseConnection.isEmbedded((String) null, "url1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isEmbeddedWhenConnectionEqualsNONE}, hash: 55D0805446C10F40DA282263BD217A5F
    @Test()
    void isEmbeddedWhenConnectionEqualsNONE() {
        /* Branches:
         * (driverClass == null) : false
         * (branch expression (line 155)) : false
         * (connection == NONE) : true
         */
        //Act Statement(s)
        boolean result = EmbeddedDatabaseConnection.isEmbedded("driverClass1", "url1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isEmbeddedWhenConnectionIsEmbeddedUrlUrl}, hash: BD59002C4EEF8FDDFE6D5A21E1A02818
    @Disabled()
    @Test()
    void isEmbeddedWhenConnectionIsEmbeddedUrlUrl() {
        /* Branches:
         * (driverClass == null) : false
         * (branch expression (line 155)) : true
         * (connection == NONE) : false
         * (url == null) : false
         * (connection.isEmbeddedUrl(url)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = EmbeddedDatabaseConnection.isEmbedded("", "");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isEmbedded1WhenNewJdbcTemplateDataSourceExecuteNewIsEmbedded}, hash: C831C4DA4786B5C6E5936EF537B9EB06
    @Disabled()
    @Test()
    void isEmbedded1WhenNewJdbcTemplateDataSourceExecuteNewIsEmbedded() throws DataAccessException {
        /* Branches:
         * (new JdbcTemplate(dataSource).execute(new IsEmbedded())) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type JdbcTemplate - Method: execute
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = EmbeddedDatabaseConnection.isEmbedded(dataSourceMock);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isEmbedded1WhenNewJdbcTemplateDataSourceNotExecuteNewIsEmbedded}, hash: 5B5BB8F8881070CB63631EECA481BEF1
    @Test()
    void isEmbedded1WhenNewJdbcTemplateDataSourceNotExecuteNewIsEmbedded() throws DataAccessException {
        /* Branches:
         * (new JdbcTemplate(dataSource).execute(new IsEmbedded())) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type JdbcTemplate - Method: execute
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = EmbeddedDatabaseConnection.isEmbedded(dataSourceMock);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isEmbedded1WhenCaughtDataAccessException}, hash: 6CED125F61B0582F5CB93CF395FC7715
    @Test()
    void isEmbedded1WhenCaughtDataAccessException() throws DataAccessException {
        /* Branches:
         * (catch-exception (DataAccessException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type JdbcTemplate - Method: execute
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = EmbeddedDatabaseConnection.isEmbedded(dataSourceMock);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${getWhenClassUtilsIsPresentCandidateGetDriverClassNameClassLoader}, hash: 93C0664BF0C85BFE0F634B68C1FEA663
    @Disabled()
    @Test()
    void getWhenClassUtilsIsPresentCandidateGetDriverClassNameClassLoader() {
        /* Branches:
         * (for-each(EmbeddedDatabaseConnection.values())) : true
         * (candidate != NONE) : true
         * (ClassUtils.isPresent(candidate.getDriverClassName(), classLoader)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            classUtils.when(() -> ClassUtils.isPresent(eq((String) null), (ClassLoader) any())).thenReturn(true);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            //Act Statement(s)
            EmbeddedDatabaseConnection result = EmbeddedDatabaseConnection.get(classLoader);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(EmbeddedDatabaseConnection.NONE));
                classUtils.verify(() -> ClassUtils.isPresent(eq((String) null), (ClassLoader) any()));
            });
        }
    }

    //Sapient generated method id: ${getWhenClassUtilsNotIsPresentCandidateGetDriverClassNameClassLoader}, hash: 8EB9759B07BAF712463FD5EFE14258CB
    @Disabled()
    @Test()
    void getWhenClassUtilsNotIsPresentCandidateGetDriverClassNameClassLoader() {
        /* Branches:
         * (for-each(EmbeddedDatabaseConnection.values())) : true
         * (candidate != NONE) : true
         * (ClassUtils.isPresent(candidate.getDriverClassName(), classLoader)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            classUtils.when(() -> ClassUtils.isPresent(eq((String) null), (ClassLoader) any())).thenReturn(false);
            classUtils.when(() -> ClassUtils.isPresent(eq("org.h2.Driver"), (ClassLoader) any())).thenReturn(false);
            classUtils.when(() -> ClassUtils.isPresent(eq("org.apache.derby.jdbc.EmbeddedDriver"), (ClassLoader) any())).thenReturn(false);
            classUtils.when(() -> ClassUtils.isPresent(eq("org.hsqldb.jdbc.JDBCDriver"), (ClassLoader) any())).thenReturn(false);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            //Act Statement(s)
            EmbeddedDatabaseConnection result = EmbeddedDatabaseConnection.get(classLoader);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(EmbeddedDatabaseConnection.NONE));
                classUtils.verify(() -> ClassUtils.isPresent(eq((String) null), (ClassLoader) any()));
                classUtils.verify(() -> ClassUtils.isPresent(eq("org.h2.Driver"), (ClassLoader) any()));
                classUtils.verify(() -> ClassUtils.isPresent(eq("org.apache.derby.jdbc.EmbeddedDriver"), (ClassLoader) any()));
                classUtils.verify(() -> ClassUtils.isPresent(eq("org.hsqldb.jdbc.JDBCDriver"), (ClassLoader) any()));
            });
        }
    }
}
