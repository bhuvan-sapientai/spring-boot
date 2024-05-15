package org.springframework.boot.r2dbc.init;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class R2dbcScriptDatabaseInitializerDetectorSapientGeneratedTest {

    //Sapient generated method id: ${getDatabaseInitializerBeanTypesTest}, hash: 1746B75724223A61CB863B201FAB3C4E
    @Test()
    void getDatabaseInitializerBeanTypesTest() {
        //Arrange Statement(s)
        R2dbcScriptDatabaseInitializerDetector target = new R2dbcScriptDatabaseInitializerDetector();
        
        //Act Statement(s)
        Set<Class<?>> result = target.getDatabaseInitializerBeanTypes();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(1));
            assertThat(result.iterator().next(), is(instanceOf(Class.class)));
        });
    }
}
