package org.springframework.boot.context.properties.bind.validation;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.springframework.boot.origin.Origin;
import org.mockito.MockedStatic;
import org.springframework.validation.FieldError;
import org.springframework.util.Assert;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class OriginTrackedFieldErrorSapientGeneratedTest {

    //Sapient generated method id: ${ofWhenOriginIsNull}, hash: 52126CB78696A4950CC264C19E55AC17
    @Test()
    void ofWhenOriginIsNull() {
        /* Branches:
         * (fieldError == null) : false
         * (origin == null) : true
         */
         //Arrange Statement(s)
        FieldError fieldErrorMock = mock(FieldError.class);
        Origin origin = null;
        
        //Act Statement(s)
        FieldError result = OriginTrackedFieldError.of(fieldErrorMock, origin);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(fieldErrorMock)));
    }

    //Sapient generated method id: ${ofWhenOriginIsNotNull}, hash: BEDE09F8A61C287154F13E35E6C347C8
    @Test()
    void ofWhenOriginIsNotNull() {
        /* Branches:
         * (fieldError == null) : false
         * (origin == null) : false
         */
         //Arrange Statement(s)
        Origin originMock = mock(Origin.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("A", "Object name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull("B", "Field must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            String[] stringArray = new String[] {};
            Object[] objectArray = new Object[] {};
            FieldError fieldError = new FieldError("A", "B", object, false, stringArray, objectArray, "defaultMessage1");
            //Act Statement(s)
            FieldError result = OriginTrackedFieldError.of(fieldError, originMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull("A", "Object name must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull("B", "Field must not be null"), atLeast(1));
            });
        }
    }
}
