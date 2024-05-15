package org.springframework.boot.jdbc.metadata;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.tomcat.jdbc.pool.ConnectionPool;
import org.apache.tomcat.jdbc.pool.DataSource;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class TomcatDataSourcePoolMetadataSapientGeneratedTest {

    private final DataSource dataSourceMock = mock(DataSource.class);

    //Sapient generated method id: ${getActiveWhenPoolIsNotNull}, hash: 66E4FEBE069B34BBA52FBEA1064399B8
    @Test()
    void getActiveWhenPoolIsNotNull() {
        /* Branches:
         * (pool != null) : true
         */
         //Arrange Statement(s)
        ConnectionPool connectionPoolMock = mock(ConnectionPool.class);
        doReturn(connectionPoolMock).when(dataSourceMock).getPool();
        doReturn(1).when(connectionPoolMock).getActive();
        TomcatDataSourcePoolMetadata target = new TomcatDataSourcePoolMetadata(dataSourceMock);
        
        //Act Statement(s)
        Integer result = target.getActive();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(1));
            verify(dataSourceMock).getPool();
            verify(connectionPoolMock).getActive();
        });
    }

    //Sapient generated method id: ${getActiveWhenPoolIsNull}, hash: 4E83EF8406F8D4DC3F716A8EA2AF0821
    @Test()
    void getActiveWhenPoolIsNull() {
        /* Branches:
         * (pool != null) : false
         */
         //Arrange Statement(s)
        doReturn(null).when(dataSourceMock).getPool();
        TomcatDataSourcePoolMetadata target = new TomcatDataSourcePoolMetadata(dataSourceMock);
        
        //Act Statement(s)
        Integer result = target.getActive();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(dataSourceMock).getPool();
        });
    }

    //Sapient generated method id: ${getIdleTest}, hash: 76D04E0B67E98B96986DEC5425B5C471
    @Test()
    void getIdleTest() {
        //Arrange Statement(s)
        doReturn(1).when(dataSourceMock).getNumIdle();
        TomcatDataSourcePoolMetadata target = new TomcatDataSourcePoolMetadata(dataSourceMock);
        
        //Act Statement(s)
        Integer result = target.getIdle();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(1));
            verify(dataSourceMock).getNumIdle();
        });
    }

    //Sapient generated method id: ${getMaxTest}, hash: 20772ADCE98125CC5131C15D53A827A6
    @Test()
    void getMaxTest() {
        //Arrange Statement(s)
        doReturn(1).when(dataSourceMock).getMaxActive();
        TomcatDataSourcePoolMetadata target = new TomcatDataSourcePoolMetadata(dataSourceMock);
        
        //Act Statement(s)
        Integer result = target.getMax();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(1));
            verify(dataSourceMock).getMaxActive();
        });
    }

    //Sapient generated method id: ${getMinTest}, hash: B7AECEDFF89F246E8904096BC3322F94
    @Test()
    void getMinTest() {
        //Arrange Statement(s)
        doReturn(1).when(dataSourceMock).getMinIdle();
        TomcatDataSourcePoolMetadata target = new TomcatDataSourcePoolMetadata(dataSourceMock);
        
        //Act Statement(s)
        Integer result = target.getMin();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(1));
            verify(dataSourceMock).getMinIdle();
        });
    }

    //Sapient generated method id: ${getValidationQueryTest}, hash: F5EA233F76E860C4ED17AEA7DF2AF57C
    @Test()
    void getValidationQueryTest() {
        //Arrange Statement(s)
        doReturn("return_of_getValidationQuery1").when(dataSourceMock).getValidationQuery();
        TomcatDataSourcePoolMetadata target = new TomcatDataSourcePoolMetadata(dataSourceMock);
        
        //Act Statement(s)
        String result = target.getValidationQuery();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_getValidationQuery1"));
            verify(dataSourceMock).getValidationQuery();
        });
    }

    //Sapient generated method id: ${getDefaultAutoCommitTest}, hash: 88BE8385A686EA324FA538CDC3950F67
    @Test()
    void getDefaultAutoCommitTest() {
        //Arrange Statement(s)
        doReturn(false).when(dataSourceMock).isDefaultAutoCommit();
        TomcatDataSourcePoolMetadata target = new TomcatDataSourcePoolMetadata(dataSourceMock);
        
        //Act Statement(s)
        Boolean result = target.getDefaultAutoCommit();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(dataSourceMock).isDefaultAutoCommit();
        });
    }
}
