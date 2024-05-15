package org.springframework.boot.info;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import java.util.Iterator;
import org.springframework.core.env.PropertySource;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.util.Assert;
import org.mockito.MockedStatic;
import java.time.Instant;
import java.util.Properties;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class InfoPropertiesSapientGeneratedTest {

    //Sapient generated method id: ${getTest}, hash: 89F65BE21C8FC6D0844A8B19B438332D
    @Disabled()
    @Test()
    void getTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull((Properties) any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            Properties properties = new Properties();
            InfoProperties target = new InfoProperties(properties);
            //Act Statement(s)
            String result = target.get("key1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                _assert.verify(() -> Assert.notNull((Properties) any(), eq("Entries must not be null")));
            });
        }
    }

    //Sapient generated method id: ${getInstantWhenSIsNotNull}, hash: E7E289505DA7013A89B6DF91864A0D90
    @Disabled()
    @Test()
    void getInstantWhenSIsNotNull() {
        /* Branches:
         * (s != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull((Properties) any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            Properties properties = new Properties();
            InfoProperties target = new InfoProperties(properties);
            //Act Statement(s)
            Instant result = target.getInstant("key1");
            Instant instant = Instant.ofEpochMilli(0L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(instant));
                _assert.verify(() -> Assert.notNull((Properties) any(), eq("Entries must not be null")));
            });
        }
    }

    //Sapient generated method id: ${getInstantWhenSIsNull}, hash: 8B246B7B3CA58C9F7F7EE6A09E812E65
    @Test()
    void getInstantWhenSIsNull() {
        /* Branches:
         * (s != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull((Properties) any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            Properties properties = new Properties();
            InfoProperties target = new InfoProperties(properties);
            //Act Statement(s)
            Instant result = target.getInstant("key1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                _assert.verify(() -> Assert.notNull((Properties) any(), eq("Entries must not be null")));
            });
        }
    }

    //Sapient generated method id: ${getInstantWhenCaughtNumberFormatException}, hash: 98258E51185BFFEA603CFC02C7418966
    @Test()
    void getInstantWhenCaughtNumberFormatException() {
        /* Branches:
         * (s != null) : true
         * (catch-exception (NumberFormatException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull((Properties) any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            Properties properties = new Properties();
            InfoProperties target = new InfoProperties(properties);
            //Act Statement(s)
            Instant result = target.getInstant("key1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                _assert.verify(() -> Assert.notNull((Properties) any(), eq("Entries must not be null")));
            });
        }
    }

    //Sapient generated method id: ${iteratorTest}, hash: 508BB129A4222AFF8949F9A05B82AE2D
    @Test()
    void iteratorTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Properties properties = new Properties();
        InfoProperties target = new InfoProperties(properties);
        //Act Statement(s)
        Iterator<InfoProperties.Entry> result = target.iterator();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${toPropertySourceTest}, hash: 4BA8CC569097A804FA0F03FF7905CE86
    @Test()
    void toPropertySourceTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull((Properties) any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            Properties properties = new Properties();
            InfoProperties target = new InfoProperties(properties);
            //Act Statement(s)
            PropertySource<?> result = target.toPropertySource();
            Properties properties2 = new Properties();
            PropertiesPropertySource propertiesPropertySource = new PropertiesPropertySource("InfoProperties", properties2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(propertiesPropertySource));
                _assert.verify(() -> Assert.notNull((Properties) any(), eq("Entries must not be null")));
            });
        }
    }
}
