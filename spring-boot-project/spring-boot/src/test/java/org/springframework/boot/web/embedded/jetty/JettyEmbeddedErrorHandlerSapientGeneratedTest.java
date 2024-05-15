package org.springframework.boot.web.embedded.jetty;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JettyEmbeddedErrorHandlerSapientGeneratedTest {

    //Sapient generated method id: ${errorPageForMethodTest}, hash: 1385847D6328211014E198EABDCCE6F7
    @Test()
    void errorPageForMethodTest() {
        //Arrange Statement(s)
        JettyEmbeddedErrorHandler target = new JettyEmbeddedErrorHandler();
        
        //Act Statement(s)
        boolean result = target.errorPageForMethod("method1");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }
}
