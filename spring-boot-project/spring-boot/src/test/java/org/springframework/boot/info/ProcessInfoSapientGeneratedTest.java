package org.springframework.boot.info;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ProcessInfoSapientGeneratedTest {

    //Sapient generated method id: ${getCpusTest}, hash: 4A0A3C20AA2E7B2B232D64A79EF37981
    @Test()
    void getCpusTest() {
        //Arrange Statement(s)
        ProcessInfo target = new ProcessInfo();
        
        //Act Statement(s)
        int result = target.getCpus();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(8)));
    }
}
