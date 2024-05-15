package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringBootVersionSapientGeneratedTest {

    //Sapient generated method id: ${getVersionTest}, hash: B65AA1D5DF9AA4B3CDD0DA79B1E89BDE
    @Test()
    void getVersionTest() {
        
        //Act Statement(s)
        String result = SpringBootVersion.getVersion();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("3.3.0-SNAPSHOT")));
    }
}
