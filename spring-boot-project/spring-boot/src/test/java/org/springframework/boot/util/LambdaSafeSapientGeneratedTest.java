package org.springframework.boot.util;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.Collection;
import java.util.ArrayList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LambdaSafeSapientGeneratedTest {

    //Sapient generated method id: ${callbackTest}, hash: 01F329D397CBBEC9749954B634E41182
    @Test()
    void callbackTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Object[] objectArray = new Object[] {};
        
        //Act Statement(s)
        LambdaSafe.Callback<Object, Object> result = LambdaSafe.callback(Object.class, object, object2, objectArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${callbacksTest}, hash: BF1A3732FFF72862FF1F3941F9BBF662
    @Test()
    void callbacksTest() {
        //Arrange Statement(s)
        Collection<Object> collection = new ArrayList<>();
        Object object = new Object();
        Object[] objectArray = new Object[] {};
        
        //Act Statement(s)
        LambdaSafe.Callbacks<Object, Object> result = LambdaSafe.callbacks(Object.class, collection, object, objectArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
