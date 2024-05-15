package org.springframework.boot.context.properties;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.Collection;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class IncompatibleConfigurationExceptionSapientGeneratedTest {

    //Sapient generated method id: ${getIncompatibleKeysTest}, hash: DD1F6159AF4E48B8FCC2EBE333A5292F
    @Test()
    void getIncompatibleKeysTest() {
        //Arrange Statement(s)
        String[] stringArray = new String[] {};
        IncompatibleConfigurationException target = new IncompatibleConfigurationException(stringArray);
        
        //Act Statement(s)
        Collection<String> result = target.getIncompatibleKeys();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }
}
