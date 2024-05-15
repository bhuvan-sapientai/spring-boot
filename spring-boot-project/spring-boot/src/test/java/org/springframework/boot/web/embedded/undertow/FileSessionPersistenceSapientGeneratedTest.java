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
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FileSessionPersistenceSapientGeneratedTest {

    private final SessionPersistenceManager.PersistentSession persistentSessionMock = mock(SessionPersistenceManager.PersistentSession.class);

    //Sapient generated method id: ${persistSessionsWhenThisDirNotExists}, hash: FCB6F48D50BF8730E749DF5AF9D1BB2F
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
        FileSessionPersistence target = new FileSessionPersistence(file);
        Map<String, SessionPersistenceManager.PersistentSession> stringSessionPersistenceManagerPersistentSessionMap = new HashMap<>();
        stringSessionPersistenceManagerPersistentSessionMap.put("sessionDataItem1Key1", persistentSessionMock);
        //Act Statement(s)
        target.persistSessions("A", stringSessionPersistenceManagerPersistentSessionMap);
    }

    //Sapient generated method id: ${persistSessionsWhenCaughtException}, hash: C7B43D11C7544C34C5BD43E61A185CCD
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
        FileSessionPersistence target = new FileSessionPersistence(file);
        Map<String, SessionPersistenceManager.PersistentSession> stringSessionPersistenceManagerPersistentSessionMap = new HashMap<>();
        stringSessionPersistenceManagerPersistentSessionMap.put("sessionDataItem1Key1", persistentSessionMock);
        //Act Statement(s)
        target.persistSessions("A", stringSessionPersistenceManagerPersistentSessionMap);
    }

    //Sapient generated method id: ${persistSessionsWhenDefaultBranchThrowsThrowable}, hash: 74EFB0D879607A7241D592EC1EF560DD
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
        FileSessionPersistence target = new FileSessionPersistence(file);
        Map<String, SessionPersistenceManager.PersistentSession> stringSessionPersistenceManagerPersistentSessionMap = new HashMap<>();
        stringSessionPersistenceManagerPersistentSessionMap.put("sessionDataItem1Key1", persistentSessionMock);
        //Act Statement(s)
        final Throwable result = assertThrows(Throwable.class, () -> {
            target.persistSessions("A", stringSessionPersistenceManagerPersistentSessionMap);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${loadSessionAttributesWhenFileNotExists}, hash: F992ECF1E699F4E95A273EB05A5A26BA
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

    //Sapient generated method id: ${loadSessionAttributesWhenEntrySessionGetExpirationGetTimeGreaterThanTime}, hash: A9CB07BBD47A9666743419A5029AB161
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

    //Sapient generated method id: ${loadSessionAttributesWhenEntrySessionGetExpirationGetTimeNotGreaterThanTimeAndCaughtException}, hash: 3ABE8672BFAB08E6E6EAE7A8B29DE114
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
        FileSessionPersistence target = new FileSessionPersistence(file);
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        //Act Statement(s)
        Map<String, SessionPersistenceManager.PersistentSession> result = target.loadSessionAttributes("A", classLoader);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${loadSessionAttributesWhenDefaultBranchThrowsThrowable}, hash: 1AD258C8B5D3C1EB96B4A4271A085A80
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
        FileSessionPersistence target = new FileSessionPersistence(file);
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        //Act Statement(s)
        final Throwable result = assertThrows(Throwable.class, () -> {
            target.loadSessionAttributes("A", classLoader);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${clearWhenThisDirNotExists}, hash: DA2411D7D5FECF026572D1CFB1B4170A
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
