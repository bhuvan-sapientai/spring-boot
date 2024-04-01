package org.springframework.boot.jdbc.init;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import org.springframework.boot.sql.init.AbstractScriptDatabaseInitializer;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;

import org.mockito.MockedStatic;

import java.nio.charset.Charset;

import javax.sql.DataSource;

import org.springframework.boot.sql.init.DatabaseInitializationSettings;
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

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DataSourceScriptDatabaseInitializerSapientGeneratedTest {

	private final DataSource dataSourceMock = mock(DataSource.class);

	//Sapient generated method id: ${3c027848-d9cd-32ab-9abb-d88ea3b8a591}, hash: 57C59441216FFDE3C788DD5F04300519
	@Test()
	void isEmbeddedDatabaseWhenEmbeddedDatabaseConnectionIsEmbeddedThisDataSource() throws Exception {
		/* Branches:
		 * (EmbeddedDatabaseConnection.isEmbedded(this.dataSource)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<EmbeddedDatabaseConnection> embeddedDatabaseConnection = mockStatic(EmbeddedDatabaseConnection.class, CALLS_REAL_METHODS)) {
			embeddedDatabaseConnection.when(() -> EmbeddedDatabaseConnection.isEmbedded(dataSourceMock)).thenReturn(true);
			DatabaseInitializationSettings databaseInitializationSettings = new DatabaseInitializationSettings();
			DataSourceScriptDatabaseInitializer target = new DataSourceScriptDatabaseInitializer(dataSourceMock, databaseInitializationSettings);
			//Act Statement(s)
			boolean result = target.isEmbeddedDatabase();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				embeddedDatabaseConnection.verify(() -> EmbeddedDatabaseConnection.isEmbedded(dataSourceMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${0e43b33e-73b1-3e65-846a-c81f4667ec60}, hash: BC0020804A44580CDE3BCEE0F5C42444
	@Test()
	void isEmbeddedDatabaseWhenEmbeddedDatabaseConnectionNotIsEmbeddedThisDataSource() throws Exception {
		/* Branches:
		 * (EmbeddedDatabaseConnection.isEmbedded(this.dataSource)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<EmbeddedDatabaseConnection> embeddedDatabaseConnection = mockStatic(EmbeddedDatabaseConnection.class, CALLS_REAL_METHODS)) {
			embeddedDatabaseConnection.when(() -> EmbeddedDatabaseConnection.isEmbedded(dataSourceMock)).thenReturn(false);
			DatabaseInitializationSettings databaseInitializationSettings = new DatabaseInitializationSettings();
			DataSourceScriptDatabaseInitializer target = new DataSourceScriptDatabaseInitializer(dataSourceMock, databaseInitializationSettings);
			//Act Statement(s)
			boolean result = target.isEmbeddedDatabase();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				embeddedDatabaseConnection.verify(() -> EmbeddedDatabaseConnection.isEmbedded(dataSourceMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4ef35836-54b6-3d97-83a2-ba35c268f128}, hash: 39343980619DF653B27D87947F59B33F
	@Test()
	void isEmbeddedDatabaseWhenCaughtException() throws Exception {
		/* Branches:
		 * (catch-exception (Exception)) : true
		 */
		//Arrange Statement(s)
		RuntimeException runtimeExceptionMock = mock(RuntimeException.class);
		try (MockedStatic<EmbeddedDatabaseConnection> embeddedDatabaseConnection = mockStatic(EmbeddedDatabaseConnection.class, CALLS_REAL_METHODS)) {
			embeddedDatabaseConnection.when(() -> EmbeddedDatabaseConnection.isEmbedded(dataSourceMock)).thenThrow(runtimeExceptionMock);
			DatabaseInitializationSettings databaseInitializationSettings = new DatabaseInitializationSettings();
			DataSourceScriptDatabaseInitializer target = new DataSourceScriptDatabaseInitializer(dataSourceMock, databaseInitializationSettings);
			//Act Statement(s)
			boolean result = target.isEmbeddedDatabase();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				embeddedDatabaseConnection.verify(() -> EmbeddedDatabaseConnection.isEmbedded(dataSourceMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${e671421d-552d-3332-a502-0d59d8dd0620}, hash: 027BAD9FD7154B9B1BBC46433DF192BB
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
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		AbstractScriptDatabaseInitializer.Scripts scriptsMock = mock(AbstractScriptDatabaseInitializer.Scripts.class);
		DatabaseInitializationSettings databaseInitializationSettingsMock = mock(DatabaseInitializationSettings.class);
		try (MockedStatic<DatabasePopulatorUtils> databasePopulatorUtils = mockStatic(DatabasePopulatorUtils.class)) {
			doReturn(false).when(scriptsMock).isContinueOnError();
			doReturn("return_of_getSeparator1").when(scriptsMock).getSeparator();
			Charset charset = Charset.defaultCharset();
			doReturn(charset).when(scriptsMock).getEncoding();
			doReturn(null).when(scriptsMock).iterator();
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
