package org.springframework.boot.r2dbc.init;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.springframework.boot.r2dbc.EmbeddedDatabaseConnection;
import org.springframework.boot.sql.init.AbstractScriptDatabaseInitializer;
import java.util.Iterator;
import org.springframework.core.io.Resource;
import org.mockito.MockedStatic;
import java.nio.charset.Charset;
import org.springframework.boot.sql.init.DatabaseInitializationSettings;
import java.util.ArrayList;
import io.r2dbc.spi.ConnectionFactory;
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
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class R2dbcScriptDatabaseInitializerSapientGeneratedTest {

    private final ConnectionFactory connectionFactoryMock = mock(ConnectionFactory.class);

    private final DatabaseInitializationSettings databaseInitializationSettingsMock = mock(DatabaseInitializationSettings.class);

    //Sapient generated method id: ${isEmbeddedDatabaseWhenEmbeddedDatabaseConnectionIsEmbeddedThisConnectionFactory}, hash: 0E8BF52D2D6D1087F2F38D84F38C239B
    @Test()
    void isEmbeddedDatabaseWhenEmbeddedDatabaseConnectionIsEmbeddedThisConnectionFactory() {
        /* Branches:
         * (EmbeddedDatabaseConnection.isEmbedded(this.connectionFactory)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<EmbeddedDatabaseConnection> embeddedDatabaseConnection = mockStatic(EmbeddedDatabaseConnection.class, CALLS_REAL_METHODS)) {
            embeddedDatabaseConnection.when(() -> EmbeddedDatabaseConnection.isEmbedded(connectionFactoryMock)).thenReturn(true);
            R2dbcScriptDatabaseInitializer target = new R2dbcScriptDatabaseInitializer(connectionFactoryMock, databaseInitializationSettingsMock);
            //Act Statement(s)
            boolean result = target.isEmbeddedDatabase();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                embeddedDatabaseConnection.verify(() -> EmbeddedDatabaseConnection.isEmbedded(connectionFactoryMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isEmbeddedDatabaseWhenEmbeddedDatabaseConnectionNotIsEmbeddedThisConnectionFactory}, hash: 508EE2EFB0E9B8DF807DFD390E917F6B
    @Test()
    void isEmbeddedDatabaseWhenEmbeddedDatabaseConnectionNotIsEmbeddedThisConnectionFactory() {
        /* Branches:
         * (EmbeddedDatabaseConnection.isEmbedded(this.connectionFactory)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<EmbeddedDatabaseConnection> embeddedDatabaseConnection = mockStatic(EmbeddedDatabaseConnection.class, CALLS_REAL_METHODS)) {
            embeddedDatabaseConnection.when(() -> EmbeddedDatabaseConnection.isEmbedded(connectionFactoryMock)).thenReturn(false);
            R2dbcScriptDatabaseInitializer target = new R2dbcScriptDatabaseInitializer(connectionFactoryMock, databaseInitializationSettingsMock);
            //Act Statement(s)
            boolean result = target.isEmbeddedDatabase();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                embeddedDatabaseConnection.verify(() -> EmbeddedDatabaseConnection.isEmbedded(connectionFactoryMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${runScripts1WhenScriptsIsNotEmpty}, hash: D9DFC5E7C9BAF689947C6BFF4AF66683
    @Disabled()
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
        doReturn(false).when(scriptsMock).isContinueOnError();
        doReturn("return_of_getSeparator1").when(scriptsMock).getSeparator();
        Charset charset = Charset.defaultCharset();
        doReturn(charset).when(scriptsMock).getEncoding();
        Resource resourceMock = mock(Resource.class);
        List<Resource> resourceList = new ArrayList<>();
        resourceList.add(resourceMock);
        Iterator<Resource> iterator = resourceList.iterator();
        doReturn(iterator).when(scriptsMock).iterator();
        R2dbcScriptDatabaseInitializer target = new R2dbcScriptDatabaseInitializer(connectionFactoryMock, databaseInitializationSettingsMock);
        //Act Statement(s)
        target.runScripts(scriptsMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(scriptsMock).isContinueOnError();
            verify(scriptsMock).getSeparator();
            verify(scriptsMock, times(2)).getEncoding();
            verify(scriptsMock).iterator();
        });
    }
}
