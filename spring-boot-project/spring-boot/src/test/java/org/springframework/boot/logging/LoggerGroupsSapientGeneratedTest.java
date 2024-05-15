package org.springframework.boot.logging;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LoggerGroupsSapientGeneratedTest {

    //Sapient generated method id: ${putAllTest}, hash: 5E0EF3A37FB2C8C82BC29CE42FA26B05
    @Test()
    void putAllTest() {
        //Arrange Statement(s)
        List<String> stringList = new ArrayList<>();
        Map<String, List<String>> stringListStringMap = new HashMap<>();
        stringListStringMap.put("namesAndMembersItem1Key1", stringList);
        LoggerGroups target = new LoggerGroups(stringListStringMap);
        
        //Act Statement(s)
        target.putAll(stringListStringMap);
    }

    //Sapient generated method id: ${getTest}, hash: 4559A673CEC1D77EBD43FA72DF56B397
    @Test()
    void getTest() {
        //Arrange Statement(s)
        Map<String, List<String>> stringListStringMap = new HashMap<>();
        LoggerGroups target = new LoggerGroups(stringListStringMap);
        
        //Act Statement(s)
        LoggerGroup result = target.get("name1");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${iteratorTest}, hash: 47B774CF5B1FFABA0C41ADD753F5CF76
    @Test()
    void iteratorTest() {
        //Arrange Statement(s)
        List<String> stringList = new ArrayList<>();
        Map<String, List<String>> stringListStringMap = new HashMap<>();
        stringListStringMap.put("namesAndMembersItem1Key1", stringList);
        LoggerGroups target = new LoggerGroups(stringListStringMap);
        
        //Act Statement(s)
        Iterator<LoggerGroup> result = target.iterator();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
