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
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BuildPropertiesSapientGeneratedTest {

    //Sapient generated method id: ${getGroupTest}, hash: E9A148B4C82180F94D118A05D11EB775
    @Disabled()
    @Test()
    void getGroupTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: ISO_INSTANT - Method: parse
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull((Properties) any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            Properties properties = new Properties();
            properties.put("time", "entriesItem1Value1");
            BuildProperties target = new BuildProperties(properties);
            //Act Statement(s)
            String result = target.getGroup();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                _assert.verify(() -> Assert.notNull((Properties) any(), eq("Entries must not be null")));
            });
        }
    }

    //Sapient generated method id: ${getArtifactTest}, hash: 2D89F99C9B1A6C2FE78062A8646E7419
    @Disabled()
    @Test()
    void getArtifactTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: ISO_INSTANT - Method: parse
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull((Properties) any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            Properties properties = new Properties();
            properties.put("time", "entriesItem1Value1");
            BuildProperties target = new BuildProperties(properties);
            //Act Statement(s)
            String result = target.getArtifact();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                _assert.verify(() -> Assert.notNull((Properties) any(), eq("Entries must not be null")));
            });
        }
    }

    //Sapient generated method id: ${getNameTest}, hash: 7CF8577272CB407CE611FBBB5A2AD307
    @Disabled()
    @Test()
    void getNameTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: ISO_INSTANT - Method: parse
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull((Properties) any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            Properties properties = new Properties();
            properties.put("time", "entriesItem1Value1");
            BuildProperties target = new BuildProperties(properties);
            //Act Statement(s)
            String result = target.getName();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                _assert.verify(() -> Assert.notNull((Properties) any(), eq("Entries must not be null")));
            });
        }
    }

    //Sapient generated method id: ${getVersionTest}, hash: D1421EADDACF9BCDD3F16ED710FF63C0
    @Disabled()
    @Test()
    void getVersionTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: ISO_INSTANT - Method: parse
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull((Properties) any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            Properties properties = new Properties();
            properties.put("time", "entriesItem1Value1");
            BuildProperties target = new BuildProperties(properties);
            //Act Statement(s)
            String result = target.getVersion();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                _assert.verify(() -> Assert.notNull((Properties) any(), eq("Entries must not be null")));
            });
        }
    }

    //Sapient generated method id: ${getTimeTest}, hash: 1AFE60527D07C9B012AAA22623F88119
    @Test()
    void getTimeTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: ISO_INSTANT - Method: parse
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull((Properties) any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            Properties properties = new Properties();
            properties.put("time", "entriesItem1Value1");
            BuildProperties target = spy(new BuildProperties(properties));
            Instant instant = Instant.ofEpochSecond(1700000000);
            doReturn(instant).when(target).getInstant("time");
            //Act Statement(s)
            Instant result = target.getTime();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(instant));
                _assert.verify(() -> Assert.notNull((Properties) any(), eq("Entries must not be null")));
                verify(target).getInstant("time");
            });
        }
    }
}
