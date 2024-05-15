package org.springframework.boot.origin;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class OriginTrackedValueSapientGeneratedTest {

    private final Origin originMock = mock(Origin.class);

    //Sapient generated method id: ${toStringWhenThisValueIsNull}, hash: C336FF28033C78EE694B427A80BAEE8C
    @Disabled()
    @Test()
    void toStringWhenThisValueIsNull() {
        /* Branches:
         * (this.value != null) : false
         */
        //Arrange Statement(s)
        OriginTrackedValue target = OriginTrackedValue.of((Object) null, originMock);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${ofTest}, hash: 5D48499494715CE759B83FBC690AC9A6
    @Test()
    void ofTest() {
        //Arrange Statement(s)
        OriginTrackedValue originTrackedValueMock = mock(OriginTrackedValue.class);
        try (MockedStatic<OriginTrackedValue> originTrackedValue = mockStatic(OriginTrackedValue.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            originTrackedValue.when(() -> OriginTrackedValue.of(object, (Origin) null)).thenReturn(originTrackedValueMock);
            //Act Statement(s)
            OriginTrackedValue result = OriginTrackedValue.of(object);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(originTrackedValueMock));
                originTrackedValue.verify(() -> OriginTrackedValue.of(object, (Origin) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${of1WhenValueIsNull}, hash: 47FE8A6488851EBB127D9F1F5D93F456
    @Test()
    void of1WhenValueIsNull() {
        /* Branches:
         * (value == null) : true
         */
        //Arrange Statement(s)
        Object object = null;
        //Act Statement(s)
        OriginTrackedValue result = OriginTrackedValue.of(object, originMock);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${of1WhenValueInstanceOfCharSequence}, hash: AA052A7DF73003BB735AD77121E57C30
    @Test()
    void of1WhenValueInstanceOfCharSequence() {
        /* Branches:
         * (value == null) : false
         * (value instanceof CharSequence charSequence) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        OriginTrackedValue result = OriginTrackedValue.of((Object) "value1", originMock);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${of1WhenValueNotInstanceOfCharSequence}, hash: 894839B15C0543849C57629B3ED5296F
    @Test()
    void of1WhenValueNotInstanceOfCharSequence() {
        /* Branches:
         * (value == null) : false
         * (value instanceof CharSequence charSequence) : false
         */
        //Arrange Statement(s)
        Object object = new Object();
        //Act Statement(s)
        OriginTrackedValue result = OriginTrackedValue.of(object, originMock);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
