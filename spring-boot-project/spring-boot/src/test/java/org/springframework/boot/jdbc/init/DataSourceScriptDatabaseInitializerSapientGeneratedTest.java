package org.springframework.boot.jdbc.init;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.mockito.stubbing.Answer;
import org.springframework.boot.sql.init.AbstractScriptDatabaseInitializer;
import java.util.Iterator;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.mockito.MockedStatic;
import java.nio.charset.Charset;
import javax.sql.DataSource;
import org.springframework.boot.sql.init.DatabaseInitializationSettings;
import java.util.ArrayList;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DataSourceScriptDatabaseInitializerSapientGeneratedTest {

    private final DataSource dataSourceMock = mock(DataSource.class);

    private final DatabaseInitializationSettings databaseInitializationSettingsMock = mock(DatabaseInitializationSettings.class);

    //Sapient generated method id: ${isEmbeddedDatabaseWhenEmbeddedDatabaseConnectionIsEmbeddedThisDataSource}, hash: 5267915998BFC592F2142AD92EFDB87E
    @Test()
    void isEmbeddedDatabaseWhenEmbeddedDatabaseConnectionIsEmbeddedThisDataSource() throws Exception {
        /* Branches:
         * (EmbeddedDatabaseConnection.isEmbedded(this.dataSource)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<EmbeddedDatabaseConnection> embeddedDatabaseConnection = mockStatic(EmbeddedDatabaseConnection.class, CALLS_REAL_METHODS)) {
            embeddedDatabaseConnection.when(() -> EmbeddedDatabaseConnection.isEmbedded(dataSourceMock)).thenReturn(true);
            DataSourceScriptDatabaseInitializer target = new DataSourceScriptDatabaseInitializer(dataSourceMock, databaseInitializationSettingsMock);
            //Act Statement(s)
            boolean result = target.isEmbeddedDatabase();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                embeddedDatabaseConnection.verify(() -> EmbeddedDatabaseConnection.isEmbedded(dataSourceMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isEmbeddedDatabaseWhenEmbeddedDatabaseConnectionNotIsEmbeddedThisDataSource}, hash: 57C8DD67A1379C9B05DBA5A6437228E5
    @Test()
    void isEmbeddedDatabaseWhenEmbeddedDatabaseConnectionNotIsEmbeddedThisDataSource() throws Exception {
        /* Branches:
         * (EmbeddedDatabaseConnection.isEmbedded(this.dataSource)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<EmbeddedDatabaseConnection> embeddedDatabaseConnection = mockStatic(EmbeddedDatabaseConnection.class, CALLS_REAL_METHODS)) {
            embeddedDatabaseConnection.when(() -> EmbeddedDatabaseConnection.isEmbedded(dataSourceMock)).thenReturn(false);
            DataSourceScriptDatabaseInitializer target = new DataSourceScriptDatabaseInitializer(dataSourceMock, databaseInitializationSettingsMock);
            //Act Statement(s)
            boolean result = target.isEmbeddedDatabase();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                embeddedDatabaseConnection.verify(() -> EmbeddedDatabaseConnection.isEmbedded(dataSourceMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isEmbeddedDatabaseWhenCaughtException}, hash: B1AC9276A2B30D4EA318029400E59512
    @Test()
    void isEmbeddedDatabaseWhenCaughtException() throws Exception {
        /* Branches:
         * (catch-exception (Exception)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<EmbeddedDatabaseConnection> embeddedDatabaseConnection = mockStatic(EmbeddedDatabaseConnection.class, CALLS_REAL_METHODS)) {
            RuntimeException runtimeException = new RuntimeException();
            embeddedDatabaseConnection.when(() -> EmbeddedDatabaseConnection.isEmbedded(dataSourceMock)).thenThrow(runtimeException);
            DataSourceScriptDatabaseInitializer target = new DataSourceScriptDatabaseInitializer(dataSourceMock, databaseInitializationSettingsMock);
            //Act Statement(s)
            boolean result = target.isEmbeddedDatabase();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                embeddedDatabaseConnection.verify(() -> EmbeddedDatabaseConnection.isEmbedded(dataSourceMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${runScripts1WhenScriptsIsNotEmpty}, hash: E0625EED78C36C9023AD8834048A5EC8
    @Test()
    void runScripts1WhenScriptsIsNotEmpty() {
        /* Branches:
         * (scripts.getEncoding() != null) : true
         * (for-each(scripts)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        AbstractScriptDatabaseInitializer.Scripts scriptsMock = mock(AbstractScriptDatabaseInitializer.Scripts.class);
        Resource resourceMock = mock(Resource.class);
        try (MockedStatic<DatabasePopulatorUtils> databasePopulatorUtils = mockStatic(DatabasePopulatorUtils.class)) {
            doReturn(false).when(scriptsMock).isContinueOnError();
            doReturn("return_of_getSeparator1").when(scriptsMock).getSeparator();
            Charset charset = Charset.defaultCharset();
            doReturn(charset).when(scriptsMock).getEncoding();
            List<Resource> resourceList = new ArrayList<>();
            resourceList.add(resourceMock);
            Iterator<Resource> iterator = resourceList.iterator();
            doReturn(iterator).when(scriptsMock).iterator();
            databasePopulatorUtils.when(() -> DatabasePopulatorUtils.execute((DatabasePopulator) any(), eq(dataSourceMock))).thenAnswer((Answer<Void>) invocation -> null);
            DataSourceScriptDatabaseInitializer target = new DataSourceScriptDatabaseInitializer(dataSourceMock, databaseInitializationSettingsMock);
            //Act Statement(s)
            target.runScripts(scriptsMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(scriptsMock).isContinueOnError();
                verify(scriptsMock).getSeparator();
                verify(scriptsMock, times(2)).getEncoding();
                verify(scriptsMock).iterator();
                databasePopulatorUtils.verify(() -> DatabasePopulatorUtils.execute((DatabasePopulator) any(), eq(dataSourceMock)));
            });
        }
    }
}
