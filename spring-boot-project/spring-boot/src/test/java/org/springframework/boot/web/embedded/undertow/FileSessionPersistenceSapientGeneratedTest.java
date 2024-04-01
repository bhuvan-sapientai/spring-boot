package org.springframework.boot.web.embedded.undertow;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import io.undertow.servlet.api.SessionPersistenceManager;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.io.File;
import java.util.Date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FileSessionPersistenceSapientGeneratedTest {

	//Sapient generated method id: ${486572fd-f6f4-3147-8197-5abdf6a7d1d9}, hash: C88A029D07828352C8FAA41D9F8A2D21
	@Test()
	void persistSessionsWhenThisDirNotExists() throws Throwable, Exception {
		/* Branches:
		 * (!this.dir.exists()) : true  #  inside getSessionFile method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: stream - Method: writeObject
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		File file = new File("pathname1");
		FileSessionPersistence target = new FileSessionPersistence(file);
		Date date = new Date();
		Map map = new HashMap<>();
		SessionPersistenceManager.PersistentSession sessionPersistenceManagerPersistentSession = new SessionPersistenceManager.PersistentSession(date, map);
		Map<String, SessionPersistenceManager.PersistentSession> stringSessionPersistenceManagerPersistentSessionMap = new HashMap<>();
		stringSessionPersistenceManagerPersistentSessionMap.put("value", sessionPersistenceManagerPersistentSession);
		//Act Statement(s)
		target.persistSessions("<value>", stringSessionPersistenceManagerPersistentSessionMap);
	}

	//Sapient generated method id: ${54eec334-3740-3ead-862a-dee2dc93c4bb}, hash: BF7DF30891FDD2E4720590FD4F88D567
	@Test()
	void persistSessionsWhenCaughtException() throws Throwable, Exception {
		/* Branches:
		 * (!this.dir.exists()) : true  #  inside getSessionFile method
		 * (catch-exception (Exception)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: ROOT_LOGGER
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		File file = new File("pathname1");
		FileSessionPersistence target = new FileSessionPersistence(file);
		Date date = new Date();
		Map map = new HashMap<>();
		SessionPersistenceManager.PersistentSession sessionPersistenceManagerPersistentSession = new SessionPersistenceManager.PersistentSession(date, map);
		Map<String, SessionPersistenceManager.PersistentSession> stringSessionPersistenceManagerPersistentSessionMap = new HashMap<>();
		stringSessionPersistenceManagerPersistentSessionMap.put("value", sessionPersistenceManagerPersistentSession);
		//Act Statement(s)
		target.persistSessions("<value>", stringSessionPersistenceManagerPersistentSessionMap);
	}

	//Sapient generated method id: ${a35e5a6e-113c-391a-85a4-8731459a7abe}, hash: 5B33D22BFD8F7710FF339D3EB0C7A4F9
	@Disabled()
	@Test()
	void persistSessionsWhenDefaultBranchThrowsThrowable() throws IOException {
		/* Branches:
		 * (!this.dir.exists()) : true  #  inside getSessionFile method
		 * (branch expression (line 61)) : true  #  inside save method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: stream - Method: writeObject
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		File file = new File("pathname1");
		FileSessionPersistence target = new FileSessionPersistence(file);
		Date date = new Date();
		Map map = new HashMap<>();
		SessionPersistenceManager.PersistentSession sessionPersistenceManagerPersistentSession = new SessionPersistenceManager.PersistentSession(date, map);
		Map<String, SessionPersistenceManager.PersistentSession> stringSessionPersistenceManagerPersistentSessionMap = new HashMap<>();
		stringSessionPersistenceManagerPersistentSessionMap.put("value", sessionPersistenceManagerPersistentSession);
		//Act Statement(s)
		final Throwable result = assertThrows(Throwable.class, () -> {
			target.persistSessions("<value>", stringSessionPersistenceManagerPersistentSessionMap);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${58146738-1a36-3b8c-af43-753804e1fd1d}, hash: F992ECF1E699F4E95A273EB05A5A26BA
	@Test()
	void loadSessionAttributesWhenFileNotExists() throws Throwable, Exception {
		/* Branches:
		 * (!this.dir.exists()) : true  #  inside getSessionFile method
		 * (file.exists()) : false
		 */
		//Arrange Statement(s)
		File file = new File("pathname1");
		FileSessionPersistence target = new FileSessionPersistence(file);
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//Act Statement(s)
		Map<String, SessionPersistenceManager.PersistentSession> result = target.loadSessionAttributes("A", classLoader);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${fe52e9f2-617f-38f2-beb6-630be66a09a3}, hash: A9CB07BBD47A9666743419A5029AB161
	@Disabled()
	@Test()
	void loadSessionAttributesWhenEntrySessionGetExpirationGetTimeGreaterThanTime() throws Throwable, Exception {
		/* Branches:
		 * (!this.dir.exists()) : true  #  inside getSessionFile method
		 * (file.exists()) : true
		 * (entrySession.getExpiration().getTime() > time) : true  #  inside lambda$load$1 method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: file
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		File file = new File("pathname1");
		FileSessionPersistence target = new FileSessionPersistence(file);
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

	//Sapient generated method id: ${57707312-80a6-3ffa-970f-2c66b84e0952}, hash: 1595F41AAE92609C846135D90BE5F198
	@Test()
	void loadSessionAttributesWhenEntrySessionGetExpirationGetTimeNotGreaterThanTimeAndCaughtException() throws Throwable, Exception {
		/* Branches:
		 * (!this.dir.exists()) : true  #  inside getSessionFile method
		 * (file.exists()) : true
		 * (entrySession.getExpiration().getTime() > time) : false  #  inside lambda$load$1 method
		 * (catch-exception (Exception)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: ROOT_LOGGER
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		File file = new File("pathname1");
		FileSessionPersistence target = new FileSessionPersistence(file);
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//Act Statement(s)
		Map<String, SessionPersistenceManager.PersistentSession> result = target.loadSessionAttributes("testDeployment", classLoader);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${fe55238b-7e58-347d-96e0-bece6aa08d7a}, hash: 1AD258C8B5D3C1EB96B4A4271A085A80
	@Disabled()
	@Test()
	void loadSessionAttributesWhenDefaultBranchThrowsThrowable() throws IOException {
		/* Branches:
		 * (!this.dir.exists()) : true  #  inside getSessionFile method
		 * (file.exists()) : true
		 * (entrySession.getExpiration().getTime() > time) : false  #  inside lambda$load$1 method
		 * (branch expression (line 88)) : true  #  inside load method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: file
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		File file = new File("pathname1");
		FileSessionPersistence target = new FileSessionPersistence(file);
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//Act Statement(s)
		final Throwable result = assertThrows(Throwable.class, () -> {
			target.loadSessionAttributes("A", classLoader);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${54bd2af0-688e-3a22-81ef-fd95965f6787}, hash: DA2411D7D5FECF026572D1CFB1B4170A
	@Test()
	void clearWhenThisDirNotExists() {
		/* Branches:
		 * (!this.dir.exists()) : true  #  inside getSessionFile method
		 */
		//Arrange Statement(s)
		File file = new File("pathname1");
		FileSessionPersistence target = new FileSessionPersistence(file);
		//Act Statement(s)
		target.clear("A");
	}
}
