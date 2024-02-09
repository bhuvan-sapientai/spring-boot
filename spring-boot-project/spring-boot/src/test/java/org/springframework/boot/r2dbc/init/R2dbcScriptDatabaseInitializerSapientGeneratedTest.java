package org.springframework.boot.r2dbc.init;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.r2dbc.EmbeddedDatabaseConnection;

import org.mockito.MockedStatic;

import java.nio.charset.Charset;

import org.springframework.boot.sql.init.DatabaseInitializationSettings;
import org.springframework.boot.sql.init.AbstractScriptDatabaseInitializer;

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

	private final ConnectionFactory connectionFactoryMock = mock(ConnectionFactory.class, "<value>");

	//Sapient generated method id: ${ddbe6df9-9428-315b-a3ae-683d2029e938}
	@Test()
	void isEmbeddedDatabaseWhenEmbeddedDatabaseConnectionIsEmbeddedThisConnectionFactory() {
		/* Branches:
		 * (EmbeddedDatabaseConnection.isEmbedded(this.connectionFactory)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<EmbeddedDatabaseConnection> embeddedDatabaseConnection = mockStatic(EmbeddedDatabaseConnection.class, CALLS_REAL_METHODS)) {
			embeddedDatabaseConnection.when(() -> EmbeddedDatabaseConnection.isEmbedded(connectionFactoryMock)).thenReturn(true);
			DatabaseInitializationSettings databaseInitializationSettings = new DatabaseInitializationSettings();
			R2dbcScriptDatabaseInitializer target = new R2dbcScriptDatabaseInitializer(connectionFactoryMock, databaseInitializationSettings);
			//Act Statement(s)
			boolean result = target.isEmbeddedDatabase();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				embeddedDatabaseConnection.verify(() -> EmbeddedDatabaseConnection.isEmbedded(connectionFactoryMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4b1cdd9a-a906-311d-add0-50a8d73c0f7f}
	@Test()
	void isEmbeddedDatabaseWhenEmbeddedDatabaseConnectionNotIsEmbeddedThisConnectionFactory() {
		/* Branches:
		 * (EmbeddedDatabaseConnection.isEmbedded(this.connectionFactory)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<EmbeddedDatabaseConnection> embeddedDatabaseConnection = mockStatic(EmbeddedDatabaseConnection.class, CALLS_REAL_METHODS)) {
			embeddedDatabaseConnection.when(() -> EmbeddedDatabaseConnection.isEmbedded(connectionFactoryMock)).thenReturn(false);
			DatabaseInitializationSettings databaseInitializationSettings = new DatabaseInitializationSettings();
			R2dbcScriptDatabaseInitializer target = new R2dbcScriptDatabaseInitializer(connectionFactoryMock, databaseInitializationSettings);
			//Act Statement(s)
			boolean result = target.isEmbeddedDatabase();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				embeddedDatabaseConnection.verify(() -> EmbeddedDatabaseConnection.isEmbedded(connectionFactoryMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${e671421d-552d-3332-a502-0d59d8dd0620}
	@Disabled()
	@Test()
	void runScripts1WhenScriptsIsNotEmpty() {
		/* Branches:
		 * (scripts.getEncoding() != null) : true
		 * (for-each(scripts)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: populator
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		AbstractScriptDatabaseInitializer.Scripts scriptsMock = mock(AbstractScriptDatabaseInitializer.Scripts.class);
		doReturn(false).when(scriptsMock).isContinueOnError();
		doReturn("return_of_getSeparator1").when(scriptsMock).getSeparator();
		Charset charset = Charset.defaultCharset();
		doReturn(charset).when(scriptsMock).getEncoding();
		doReturn(null).when(scriptsMock).iterator();
		ConnectionFactory connectionFactoryMock = mock(ConnectionFactory.class);
		DatabaseInitializationSettings databaseInitializationSettingsMock = mock(DatabaseInitializationSettings.class);
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
