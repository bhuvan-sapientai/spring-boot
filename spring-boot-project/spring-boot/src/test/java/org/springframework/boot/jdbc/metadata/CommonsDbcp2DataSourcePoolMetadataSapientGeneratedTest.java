package org.springframework.boot.jdbc.metadata;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.commons.dbcp2.BasicDataSource;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CommonsDbcp2DataSourcePoolMetadataSapientGeneratedTest {

    //Sapient generated method id: ${getActiveTest}, hash: BC6AB7CA36BC3D16424417C63EBA62BA
    @Disabled()
    @Test()
    void getActiveTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BasicDataSource basicDataSource = new BasicDataSource();
        CommonsDbcp2DataSourcePoolMetadata target = new CommonsDbcp2DataSourcePoolMetadata(basicDataSource);
        //Act Statement(s)
        Integer result = target.getActive();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${getIdleTest}, hash: B3F9C5473FA6DE8C99E69B99B471DD96
    @Disabled()
    @Test()
    void getIdleTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BasicDataSource basicDataSource = new BasicDataSource();
        CommonsDbcp2DataSourcePoolMetadata target = new CommonsDbcp2DataSourcePoolMetadata(basicDataSource);
        //Act Statement(s)
        Integer result = target.getIdle();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${getMaxTest}, hash: 4AB1E76091CB7BE21B81A62820B0B5A9
    @Test()
    void getMaxTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setMaxTotal(1);
        CommonsDbcp2DataSourcePoolMetadata target = new CommonsDbcp2DataSourcePoolMetadata(basicDataSource);
        //Act Statement(s)
        Integer result = target.getMax();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${getMinTest}, hash: BFA8D2CF9EE4EEA99C1E83EBBA62139F
    @Test()
    void getMinTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setMinIdle(1);
        CommonsDbcp2DataSourcePoolMetadata target = new CommonsDbcp2DataSourcePoolMetadata(basicDataSource);
        //Act Statement(s)
        Integer result = target.getMin();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${getValidationQueryTest}, hash: 2B6C25E84C63FEBA3F723B5500E7FD17
    @Test()
    void getValidationQueryTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setValidationQuery("validationQuery1");
        CommonsDbcp2DataSourcePoolMetadata target = new CommonsDbcp2DataSourcePoolMetadata(basicDataSource);
        //Act Statement(s)
        String result = target.getValidationQuery();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("validationQuery1")));
    }

    //Sapient generated method id: ${getDefaultAutoCommitTest}, hash: 9071E5D37DEC50980A4D9EE8FE325F1D
    @Test()
    void getDefaultAutoCommitTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDefaultAutoCommit(false);
        CommonsDbcp2DataSourcePoolMetadata target = new CommonsDbcp2DataSourcePoolMetadata(basicDataSource);
        //Act Statement(s)
        Boolean result = target.getDefaultAutoCommit();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }
}
