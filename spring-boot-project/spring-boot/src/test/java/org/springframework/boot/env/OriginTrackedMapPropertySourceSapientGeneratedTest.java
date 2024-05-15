package org.springframework.boot.env;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.springframework.boot.origin.Origin;
import java.util.Map;
import java.util.HashMap;
import org.mockito.MockedStatic;
import org.springframework.boot.origin.OriginTrackedValue;
import org.springframework.util.Assert;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class OriginTrackedMapPropertySourceSapientGeneratedTest {

    //Sapient generated method id: ${getPropertyWhenValueInstanceOfOriginTrackedValue}, hash: 0B79D0A0EA645799B2D646D719DCB528
    @Test()
    void getPropertyWhenValueInstanceOfOriginTrackedValue() {
        /* Branches:
         * (value instanceof OriginTrackedValue originTrackedValue) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(anyMap(), eq("Property source must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            OriginTrackedValue originTrackedValue = OriginTrackedValue.of(object);
            Map<String, Object> stringObjectMap = new HashMap<>();
            stringObjectMap.put("sourceItem1Key1", originTrackedValue);
            OriginTrackedMapPropertySource target = new OriginTrackedMapPropertySource("A", stringObjectMap, false);
            //Act Statement(s)
            Object result = target.getProperty("sourceItem1Key1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                _assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
                _assert.verify(() -> Assert.notNull(anyMap(), eq("Property source must not be null")));
            });
        }
    }

    //Sapient generated method id: ${getPropertyWhenValueNotInstanceOfOriginTrackedValue}, hash: 9548A48FE40FDA023A8CCB881935A968
    @Test()
    void getPropertyWhenValueNotInstanceOfOriginTrackedValue() {
        /* Branches:
         * (value instanceof OriginTrackedValue originTrackedValue) : false
         */
         //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(anyMap(), eq("Property source must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            Map<String, Object> stringObjectMap = new HashMap<>();
            stringObjectMap.put("sourceItem1Key1", object);
            OriginTrackedMapPropertySource target = new OriginTrackedMapPropertySource("A", stringObjectMap, false);
            //Act Statement(s)
            Object result = target.getProperty("sourceItem1Key1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                _assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
                _assert.verify(() -> Assert.notNull(anyMap(), eq("Property source must not be null")));
            });
        }
    }

    //Sapient generated method id: ${getOriginWhenValueInstanceOfOriginTrackedValue}, hash: 75F3B47BF5248AE64D59443647EA452B
    @Test()
    void getOriginWhenValueInstanceOfOriginTrackedValue() {
        /* Branches:
         * (value instanceof OriginTrackedValue originTrackedValue) : true
         */
         //Arrange Statement(s)
        Origin originMock = mock(Origin.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(anyMap(), eq("Property source must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            OriginTrackedValue originTrackedValue = OriginTrackedValue.of(object, originMock);
            Map<String, Object> stringObjectMap = new HashMap<>();
            stringObjectMap.put("sourceItem1Key1", originTrackedValue);
            OriginTrackedMapPropertySource target = new OriginTrackedMapPropertySource("A", stringObjectMap, false);
            //Act Statement(s)
            Origin result = target.getOrigin("sourceItem1Key1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(originMock));
                _assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
                _assert.verify(() -> Assert.notNull(anyMap(), eq("Property source must not be null")));
            });
        }
    }

    //Sapient generated method id: ${getOriginWhenValueNotInstanceOfOriginTrackedValue}, hash: 607436F90606190C70EBDF687462B6F8
    @Test()
    void getOriginWhenValueNotInstanceOfOriginTrackedValue() {
        /* Branches:
         * (value instanceof OriginTrackedValue originTrackedValue) : false
         */
         //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(anyMap(), eq("Property source must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            Map<String, Object> stringObjectMap = new HashMap<>();
            stringObjectMap.put("sourceItem1Key1", object);
            OriginTrackedMapPropertySource target = new OriginTrackedMapPropertySource("A", stringObjectMap, false);
            //Act Statement(s)
            Origin result = target.getOrigin("sourceItem1Key1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                _assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
                _assert.verify(() -> Assert.notNull(anyMap(), eq("Property source must not be null")));
            });
        }
    }
}
