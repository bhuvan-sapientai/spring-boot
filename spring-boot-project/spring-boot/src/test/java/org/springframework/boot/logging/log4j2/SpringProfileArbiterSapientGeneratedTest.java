package org.springframework.boot.logging.log4j2;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringProfileArbiterSapientGeneratedTest {

    //Sapient generated method id: ${newBuilderTest}, hash: D677895BAB9D4E221EEB95E964617E0B
    @Test()
    void newBuilderTest() {
        
        //Act Statement(s)
        SpringProfileArbiter.Builder result = SpringProfileArbiter.newBuilder();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
