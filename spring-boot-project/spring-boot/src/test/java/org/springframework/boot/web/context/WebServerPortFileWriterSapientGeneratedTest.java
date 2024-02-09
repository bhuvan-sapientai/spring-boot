package org.springframework.boot.web.context;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import org.springframework.context.ApplicationContext;
import org.springframework.core.log.LogMessage;
import org.springframework.util.StringUtils;
import org.springframework.util.Assert;
import org.springframework.boot.system.SystemProperties;

import org.mockito.MockedStatic;

import org.springframework.boot.web.server.WebServer;

import java.io.File;

import org.springframework.util.FileCopyUtils;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class WebServerPortFileWriterSapientGeneratedTest {

	private final WebServerInitializedEvent eventMock = mock(WebServerInitializedEvent.class, "WebServerInitializedEvent");

	private final WebServerApplicationContext webServerApplicationContextMock = mock(WebServerApplicationContext.class);

	private final WebServer webServerMock = mock(WebServer.class);

	//Sapient generated method id: ${cb6408df-be20-3316-a61a-2aea15ca81ac}
	@Test()
	void onApplicationEventWhenParentIsNotNull() throws Exception {
		/* Branches:
		 * (parent != null) : true  #  inside createParentDirectory method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<FileCopyUtils> fileCopyUtils = mockStatic(FileCopyUtils.class);
			 MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class)) {
			doReturn(null).when(eventMock).getApplicationContext();
			doReturn(webServerMock).when(eventMock).getWebServer();
			doReturn(2).when(webServerMock).getPort();
			String[] stringArray = new String[] { "PORTFILE", "portfile" };
			systemProperties.when(() -> SystemProperties.get(stringArray)).thenReturn("return_of_get1");
			byte[] byteArray = new byte[] { (byte) 50 };
			File file = new File("pathname1");
			fileCopyUtils.when(() -> FileCopyUtils.copy(byteArray, file)).thenAnswer((Answer<Void>) invocation -> null);
			File file2 = new File("pathname1");
			WebServerPortFileWriter target = spy(new WebServerPortFileWriter(file2));
			doReturn(file).when(target).getPortFile((WebServerApplicationContext) null);
			//Act Statement(s)
			target.onApplicationEvent(eventMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(eventMock).getApplicationContext();
				verify(eventMock).getWebServer();
				verify(webServerMock).getPort();
				systemProperties.verify(() -> SystemProperties.get(stringArray), atLeast(1));
				fileCopyUtils.verify(() -> FileCopyUtils.copy(byteArray, file), atLeast(1));
				verify(target).getPortFile((WebServerApplicationContext) null);
			});
		}
	}

	//Sapient generated method id: ${3f8e2b63-ec55-30bd-9a25-8574216baedd}
	@Disabled()
	@Test()
	void onApplicationEventWhenCaughtException() throws Exception {
		/* Branches:
		 * (parent != null) : true  #  inside createParentDirectory method
		 * (catch-exception (Exception)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		WebServerApplicationContext webServerApplicationContextMock = mock(WebServerApplicationContext.class, "WebServerApplicationContext");
		LogMessage logMessageMock = mock(LogMessage.class, "LogMessage");
		try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
			 MockedStatic<FileCopyUtils> fileCopyUtils = mockStatic(FileCopyUtils.class);
			 MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class)) {
			doReturn(webServerApplicationContextMock).when(eventMock).getApplicationContext();
			doReturn(webServerMock).when(eventMock).getWebServer();
			doReturn(2).when(webServerMock).getPort();
			String[] stringArray = new String[] { "PORTFILE", "portfile" };
			systemProperties.when(() -> SystemProperties.get(stringArray)).thenReturn("return_of_get1");
			byte[] byteArray = new byte[] { (byte) 50 };
			File file = new File("pathname1");
			fileCopyUtils.when(() -> FileCopyUtils.copy(byteArray, file)).thenAnswer((Answer<Void>) invocation -> null);
			logMessage.when(() -> LogMessage.format(eq("Cannot create port file %s"), (File) any())).thenReturn(logMessageMock);
			File file2 = new File("pathname1");
			WebServerPortFileWriter target = spy(new WebServerPortFileWriter(file2));
			doReturn(file).when(target).getPortFile(webServerApplicationContextMock);
			//Act Statement(s)
			target.onApplicationEvent(eventMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(eventMock).getApplicationContext();
				verify(eventMock).getWebServer();
				verify(webServerMock).getPort();
				systemProperties.verify(() -> SystemProperties.get(stringArray), atLeast(1));
				fileCopyUtils.verify(() -> FileCopyUtils.copy(byteArray, file), atLeast(1));
				logMessage.verify(() -> LogMessage.format(eq("Cannot create port file %s"), (File) any()));
				verify(target).getPortFile(webServerApplicationContextMock);
			});
		}
	}

	//Sapient generated method id: ${36e47618-3624-3777-aba4-1419d40459b3}
	@Test()
	void getPortFileWhenApplicationContextNotInstanceOfWebServerApplicationContextAndStringUtilsNotHasLengthNamespace() {
		/* Branches:
		 * (applicationContext instanceof WebServerApplicationContext webServerApplicationContext) : false  #  inside getServerNamespace method
		 * (!StringUtils.hasLength(namespace)) : true
		 */
		//Arrange Statement(s)
		ApplicationContext applicationContextMock = mock(ApplicationContext.class);
		try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			File file = new File("pathname1");
			_assert.when(() -> Assert.notNull(file, "File must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] { "PORTFILE", "portfile" };
			systemProperties.when(() -> SystemProperties.get(stringArray)).thenReturn("return_of_get1");
			WebServerPortFileWriter target = new WebServerPortFileWriter(file);
			//Act Statement(s)
			File result = target.getPortFile(applicationContextMock);
			File file2 = new File("return_of_get1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(file2));
				_assert.verify(() -> Assert.notNull(file, "File must not be null"), atLeast(1));
				systemProperties.verify(() -> SystemProperties.get(stringArray), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${af218ee2-6ef1-3aa5-90a4-9801a7c14557}
	@Disabled()
	@Test()
	void getPortFileWhenStringUtilsHasLengthExtension() {
		/* Branches:
		 * (applicationContext instanceof WebServerApplicationContext webServerApplicationContext) : true  #  inside getServerNamespace method
		 * (!StringUtils.hasLength(namespace)) : false
		 * (i < name.length()) : true  #  inside isUpperCase method
		 * (Character.isLetter(name.charAt(i))) : true  #  inside isUpperCase method
		 * (!Character.isUpperCase(name.charAt(i))) : true  #  inside isUpperCase method
		 * (isUpperCase(name)) : false
		 * (StringUtils.hasLength(extension)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn("return_of_getServerNamespace1").when(webServerApplicationContextMock).getServerNamespace();
			File file = new File("pathname1");
			_assert.when(() -> Assert.notNull(file, "File must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] { "PORTFILE", "portfile" };
			systemProperties.when(() -> SystemProperties.get(stringArray)).thenReturn("return_of_get1");
			stringUtils.when(() -> StringUtils.hasLength("return_of_getServerNamespace1")).thenReturn(false);
			stringUtils.when(() -> StringUtils.getFilenameExtension("path1")).thenReturn("return_of_getFilenameExtension1");
			stringUtils.when(() -> StringUtils.hasLength("return_of_getFilenameExtension1")).thenReturn(false);
			WebServerPortFileWriter target = new WebServerPortFileWriter(file);
			//Act Statement(s)
			File result = target.getPortFile(webServerApplicationContextMock);
			File file2 = new File("pathname1");
			File file3 = new File(file2, "child1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(file3));
				verify(webServerApplicationContextMock).getServerNamespace();
				_assert.verify(() -> Assert.notNull(file, "File must not be null"), atLeast(1));
				systemProperties.verify(() -> SystemProperties.get(stringArray), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength("return_of_getServerNamespace1"), atLeast(1));
				stringUtils.verify(() -> StringUtils.getFilenameExtension("path1"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength("return_of_getFilenameExtension1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a680ee12-ecec-3145-b423-ea716a78a433}
	@Disabled()
	@Test()
	void getPortFileWhenCharacterIsUpperCaseNameCharAtIAndIsUpperCaseNameAndStringUtilsNotHasLengthExtension() {
		/* Branches:
		 * (applicationContext instanceof WebServerApplicationContext webServerApplicationContext) : true  #  inside getServerNamespace method
		 * (!StringUtils.hasLength(namespace)) : false
		 * (i < name.length()) : true  #  inside isUpperCase method
		 * (Character.isLetter(name.charAt(i))) : true  #  inside isUpperCase method
		 * (!Character.isUpperCase(name.charAt(i))) : false  #  inside isUpperCase method
		 * (isUpperCase(name)) : true
		 * (StringUtils.hasLength(extension)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn("").when(webServerApplicationContextMock).getServerNamespace();
			File file = new File("pathname1");
			_assert.when(() -> Assert.notNull(file, "File must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] { "PORTFILE", "portfile" };
			systemProperties.when(() -> SystemProperties.get(stringArray)).thenReturn("return_of_get1");
			stringUtils.when(() -> StringUtils.getFilenameExtension("")).thenReturn("");
			stringUtils.when(() -> StringUtils.hasLength("")).thenReturn(true).thenReturn(false);
			WebServerPortFileWriter target = new WebServerPortFileWriter(file);
			//Act Statement(s)
			File result = target.getPortFile(webServerApplicationContextMock);
			File file2 = new File("pathname1");
			File file3 = new File(file2, "A-");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(file3));
				verify(webServerApplicationContextMock).getServerNamespace();
				_assert.verify(() -> Assert.notNull(file, "File must not be null"), atLeast(1));
				systemProperties.verify(() -> SystemProperties.get(stringArray), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength(""), atLeast(2));
				stringUtils.verify(() -> StringUtils.getFilenameExtension(""), atLeast(1));
			});
		}
	}
}
