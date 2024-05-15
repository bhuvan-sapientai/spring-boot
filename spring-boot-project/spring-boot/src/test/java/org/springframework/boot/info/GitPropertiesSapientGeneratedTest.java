package org.springframework.boot.info;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;
import java.time.Instant;
import org.springframework.util.Assert;
import java.util.Properties;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class GitPropertiesSapientGeneratedTest {

    //Sapient generated method id: ${getBranchTest}, hash: BE94E46E60E7EC499573E693F67871AF
    @Disabled()
    @Test()
    void getBranchTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull((Properties) any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            Object object2 = new Object();
            Object object3 = new Object();
            Properties objectObjectMap = new Properties();
            objectObjectMap.put("build.time", "0");
            objectObjectMap.put("commit.time", "0");
            objectObjectMap.put(object, object2);
            objectObjectMap.put("commit.id", object3);
            GitProperties target = new GitProperties(objectObjectMap);
            //Act Statement(s)
            String result = target.getBranch();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                _assert.verify(() -> Assert.notNull((Properties) any(), eq("Entries must not be null")));
            });
        }
    }

    //Sapient generated method id: ${getCommitIdTest}, hash: 59FA8F780546A698D93403195239AEBC
    @Disabled()
    @Test()
    void getCommitIdTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull((Properties) any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            Object object2 = new Object();
            Object object3 = new Object();
            Properties objectObjectMap = new Properties();
            objectObjectMap.put("build.time", "0");
            objectObjectMap.put("commit.time", "0");
            objectObjectMap.put(object, object2);
            objectObjectMap.put("commit.id", object3);
            GitProperties target = new GitProperties(objectObjectMap);
            //Act Statement(s)
            String result = target.getCommitId();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                _assert.verify(() -> Assert.notNull((Properties) any(), eq("Entries must not be null")));
            });
        }
    }

    //Sapient generated method id: ${getShortCommitIdWhenShortIdIsNotNull}, hash: F8F174987D22EBDAD09FF7DDD366ACB4
    @Disabled()
    @Test()
    void getShortCommitIdWhenShortIdIsNotNull() {
        /* Branches:
         * (shortId != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull((Properties) any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            Object object2 = new Object();
            Object object3 = new Object();
            Properties objectObjectMap = new Properties();
            objectObjectMap.put("build.time", "0");
            objectObjectMap.put("commit.time", "0");
            objectObjectMap.put(object, object2);
            objectObjectMap.put("commit.id", object3);
            GitProperties target = new GitProperties(objectObjectMap);
            //Act Statement(s)
            String result = target.getShortCommitId();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                _assert.verify(() -> Assert.notNull((Properties) any(), eq("Entries must not be null")));
            });
        }
    }

    //Sapient generated method id: ${getShortCommitIdWhenIdIsNull}, hash: 351D15410AA5DECD2FD4ED6376FE7752
    @Test()
    void getShortCommitIdWhenIdIsNull() {
        /* Branches:
         * (shortId != null) : false
         * (id == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull((Properties) any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            Object object2 = new Object();
            Object object3 = new Object();
            Properties objectObjectMap = new Properties();
            objectObjectMap.put("build.time", "0");
            objectObjectMap.put("commit.time", "0");
            objectObjectMap.put(object, object2);
            objectObjectMap.put("commit.id", object3);
            GitProperties target = spy(new GitProperties(objectObjectMap));
            doReturn(null).when(target).getCommitId();
            //Act Statement(s)
            String result = target.getShortCommitId();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                _assert.verify(() -> Assert.notNull((Properties) any(), eq("Entries must not be null")));
                verify(target).getCommitId();
            });
        }
    }

    //Sapient generated method id: ${getShortCommitIdWhenIdLengthGreaterThan7}, hash: 98BA6A57883F074D588F127E87DA9198
    @Test()
    void getShortCommitIdWhenIdLengthGreaterThan7() {
        /* Branches:
         * (shortId != null) : false
         * (id == null) : false
         * (id.length() > 7) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull((Properties) any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            Object object2 = new Object();
            Object object3 = new Object();
            Properties objectObjectMap = new Properties();
            objectObjectMap.put("commit.id", object);
            objectObjectMap.put("commit.time", "0");
            objectObjectMap.put(object2, object3);
            objectObjectMap.put("build.time", "0");
            GitProperties target = spy(new GitProperties(objectObjectMap));
            doReturn("ABCDEFGH").when(target).getCommitId();
            //Act Statement(s)
            String result = target.getShortCommitId();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("ABCDEFG"));
                _assert.verify(() -> Assert.notNull((Properties) any(), eq("Entries must not be null")));
                verify(target).getCommitId();
            });
        }
    }

    //Sapient generated method id: ${getShortCommitIdWhenIdLengthNotGreaterThan7}, hash: 4CC0ED706B25CD97FFC0EA005D981CBF
    @Test()
    void getShortCommitIdWhenIdLengthNotGreaterThan7() {
        /* Branches:
         * (shortId != null) : false
         * (id == null) : false
         * (id.length() > 7) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull((Properties) any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            Object object2 = new Object();
            Object object3 = new Object();
            Properties objectObjectMap = new Properties();
            objectObjectMap.put("build.time", "0");
            objectObjectMap.put("commit.time", "0");
            objectObjectMap.put(object, object2);
            objectObjectMap.put("commit.id", object3);
            GitProperties target = spy(new GitProperties(objectObjectMap));
            doReturn("A").when(target).getCommitId();
            //Act Statement(s)
            String result = target.getShortCommitId();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("A"));
                _assert.verify(() -> Assert.notNull((Properties) any(), eq("Entries must not be null")));
                verify(target).getCommitId();
            });
        }
    }

    //Sapient generated method id: ${getCommitTimeTest}, hash: E053BDEC42AC713AFA86DD6F2C6F0F5D
    @Test()
    void getCommitTimeTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull((Properties) any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            Properties properties = new Properties();
            properties.put("commit.time", "0");
            properties.put("build.time", "0");
            properties.put("commit.id", object);
            GitProperties target = spy(new GitProperties(properties));
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(target).getInstant("commit.time");
            //Act Statement(s)
            Instant result = target.getCommitTime();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(instant));
                _assert.verify(() -> Assert.notNull((Properties) any(), eq("Entries must not be null")));
                verify(target).getInstant("commit.time");
            });
        }
    }
}
