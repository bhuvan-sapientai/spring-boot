package org.springframework.boot.web.embedded.undertow;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import io.undertow.servlet.api.SessionPersistenceManager;

import java.util.LinkedHashMap;

import org.mockito.MockitoAnnotations;

import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import io.undertow.servlet.UndertowServletLogger;

import java.io.File;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FileSessionPersistenceSapientGeneratedTest {

	private AutoCloseable autoCloseableMocks;

	@InjectMocks()
	private FileSessionPersistence target;

	@AfterEach()
	public void afterTest() throws Exception {
		if (autoCloseableMocks != null)
			autoCloseableMocks.close();
	}

	//Sapient generated method id: ${486572fd-f6f4-3147-8197-5abdf6a7d1d9}
	@Test()
	void persistSessionsWhenThisDirNotExists() throws Throwable, Exception {
		/* Branches:
		 * (!this.dir.exists()) : true  #  inside getSessionFile method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		File file = new File("pathname1");
		target = new FileSessionPersistence(file);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		SessionPersistenceManager.PersistentSession persistentSessionMock = mock(SessionPersistenceManager.PersistentSession.class);
		Map<String, SessionPersistenceManager.PersistentSession> stringSessionPersistenceManagerPersistentSessionMap = new HashMap<>();
		stringSessionPersistenceManagerPersistentSessionMap.put("sessionDataItem1Key1", persistentSessionMock);
		//Act Statement(s)
		target.persistSessions("A", stringSessionPersistenceManagerPersistentSessionMap);
	}

	//Sapient generated method id: ${54eec334-3740-3ead-862a-dee2dc93c4bb}
	@Disabled()
	@Test()
	void persistSessionsWhenCaughtException() throws Throwable, Exception {
		/* Branches:
		 * (!this.dir.exists()) : true  #  inside getSessionFile method
		 * (catch-exception (Exception)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		File file = new File("pathname1");
		target = new FileSessionPersistence(file);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		UndertowServletLogger ROOT_LOGGERMock = mock(UndertowServletLogger.class);
		Exception exception = new Exception();
		doNothing().when(ROOT_LOGGERMock).failedToPersistSessions(exception);
		SessionPersistenceManager.PersistentSession persistentSessionMock = mock(SessionPersistenceManager.PersistentSession.class);
		Map<String, SessionPersistenceManager.PersistentSession> stringSessionPersistenceManagerPersistentSessionMap = new HashMap<>();
		stringSessionPersistenceManagerPersistentSessionMap.put("sessionDataItem1Key1", persistentSessionMock);
		//Act Statement(s)
		target.persistSessions("A", stringSessionPersistenceManagerPersistentSessionMap);
		//Assert statement(s)
		assertAll("result", () -> verify(ROOT_LOGGERMock).failedToPersistSessions(exception));
	}

	//Sapient generated method id: ${a35e5a6e-113c-391a-85a4-8731459a7abe}
	@Disabled()
	@Test()
	void persistSessionsWhenDefaultBranchThrowsThrowable() throws IOException {
		/* Branches:
		 * (!this.dir.exists()) : true  #  inside getSessionFile method
		 * (branch expression (line 61)) : true  #  inside save method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		File file = new File("pathname1");
		target = new FileSessionPersistence(file);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		SessionPersistenceManager.PersistentSession persistentSessionMock = mock(SessionPersistenceManager.PersistentSession.class);
		Map<String, SessionPersistenceManager.PersistentSession> stringSessionPersistenceManagerPersistentSessionMap = new HashMap<>();
		stringSessionPersistenceManagerPersistentSessionMap.put("sessionDataItem1Key1", persistentSessionMock);
		//Act Statement(s)
		final Throwable result = assertThrows(Throwable.class, () -> {
			target.persistSessions("A", stringSessionPersistenceManagerPersistentSessionMap);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${4d4667be-247c-3d12-ae12-c0f320591b63}
	@Test()
	void persistSessionsWhenDefaultBranch() throws Throwable, Exception {
		/* Branches:
		 * (!this.dir.exists()) : false  #  inside getSessionFile method
		 * (branch expression (line 61)) : true  #  inside save method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		File file = new File("pathname1");
		target = new FileSessionPersistence(file);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		SessionPersistenceManager.PersistentSession persistentSessionMock = mock(SessionPersistenceManager.PersistentSession.class);
		Map<String, SessionPersistenceManager.PersistentSession> stringSessionPersistenceManagerPersistentSessionMap = new HashMap<>();
		stringSessionPersistenceManagerPersistentSessionMap.put("sessionDataItem1Key1", persistentSessionMock);
		//Act Statement(s)
		target.persistSessions("A", stringSessionPersistenceManagerPersistentSessionMap);
	}

	//Sapient generated method id: ${58146738-1a36-3b8c-af43-753804e1fd1d}
	@Test()
	void loadSessionAttributesWhenFileNotExists() throws Throwable, Exception {
		/* Branches:
		 * (!this.dir.exists()) : true  #  inside getSessionFile method
		 * (file.exists()) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		File file = new File("pathname1");
		target = new FileSessionPersistence(file);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//Act Statement(s)
		Map<String, SessionPersistenceManager.PersistentSession> result = target.loadSessionAttributes("A", classLoader);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${fe52e9f2-617f-38f2-beb6-630be66a09a3}
	@Disabled()
	@Test()
	void loadSessionAttributesWhenEntrySessionGetExpirationGetTimeGreaterThanTime() throws Throwable, Exception {
		/* Branches:
		 * (!this.dir.exists()) : true  #  inside getSessionFile method
		 * (file.exists()) : true
		 * (entrySession.getExpiration().getTime() > time) : true  #  inside lambda$load$1 method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		File file = new File("pathname1");
		target = new FileSessionPersistence(file);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//Act Statement(s)
		Map<String, SessionPersistenceManager.PersistentSession> result = target.loadSessionAttributes("A", classLoader);
		Date date = new Date();
		Map map = new HashMap<>();
		SessionPersistenceManager.PersistentSession sessionPersistenceManagerPersistentSession = new SessionPersistenceManager.PersistentSession(date, map);
		Map<String, SessionPersistenceManager.PersistentSession> stringSessionPersistenceManagerPersistentSessionResultMap = new LinkedHashMap<>();
		stringSessionPersistenceManagerPersistentSessionResultMap.put("resultItem1Key1", sessionPersistenceManagerPersistentSession);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(stringSessionPersistenceManagerPersistentSessionResultMap)));
	}

	//Sapient generated method id: ${57707312-80a6-3ffa-970f-2c66b84e0952}
	@Disabled()
	@Test()
	void loadSessionAttributesWhenEntrySessionGetExpirationGetTimeNotGreaterThanTimeAndCaughtException() throws Throwable, Exception {
		/* Branches:
		 * (!this.dir.exists()) : true  #  inside getSessionFile method
		 * (file.exists()) : true
		 * (entrySession.getExpiration().getTime() > time) : false  #  inside lambda$load$1 method
		 * (catch-exception (Exception)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		File file = new File("pathname1");
		target = new FileSessionPersistence(file);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		UndertowServletLogger ROOT_LOGGERMock = mock(UndertowServletLogger.class);
		Exception exception = new Exception();
		doNothing().when(ROOT_LOGGERMock).failedtoLoadPersistentSessions(exception);
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//Act Statement(s)
		Map<String, SessionPersistenceManager.PersistentSession> result = target.loadSessionAttributes("A", classLoader);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(nullValue()));
			verify(ROOT_LOGGERMock).failedtoLoadPersistentSessions(exception);
		});
	}

	//Sapient generated method id: ${fe55238b-7e58-347d-96e0-bece6aa08d7a}
	@Disabled()
	@Test()
	void loadSessionAttributesWhenDefaultBranchThrowsThrowable() throws IOException {
		/* Branches:
		 * (!this.dir.exists()) : true  #  inside getSessionFile method
		 * (file.exists()) : true
		 * (entrySession.getExpiration().getTime() > time) : false  #  inside lambda$load$1 method
		 * (branch expression (line 88)) : true  #  inside load method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		File file = new File("pathname1");
		target = new FileSessionPersistence(file);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//Act Statement(s)
		final Throwable result = assertThrows(Throwable.class, () -> {
			target.loadSessionAttributes("A", classLoader);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${54bd2af0-688e-3a22-81ef-fd95965f6787}
	@Test()
	void clearWhenThisDirNotExists() {
		/* Branches:
		 * (!this.dir.exists()) : true  #  inside getSessionFile method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		File file = new File("pathname1");
		target = new FileSessionPersistence(file);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		//Act Statement(s)
		target.clear("A");
	}
}
