package org.springframework.boot.web.servlet.server;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.File;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SessionSapientGeneratedTest {

    //Sapient generated method id: ${setStoreDirTest}, hash: 8AF069AA34AF1A231205A44A78236502
    @Test()
    void setStoreDirTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: sessionStoreDirectory - Method: setDirectory
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Session target = new Session();
        File file = new File("pathname1");
        //Act Statement(s)
        target.setStoreDir(file);
        //Assert statement(s)
        assertAll("result", () -> assertThat(target.getStoreDir(), equalTo(file)));
    }
}
