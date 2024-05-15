package org.springframework.boot.jooq;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JooqDependsOnDatabaseInitializationDetectorSapientGeneratedTest {

    //Sapient generated method id: ${getDependsOnDatabaseInitializationBeanTypesTest}, hash: 413A83D0CEF055B68531FDB947926E10
    @Test()
    void getDependsOnDatabaseInitializationBeanTypesTest() {
        //Arrange Statement(s)
        JooqDependsOnDatabaseInitializationDetector target = new JooqDependsOnDatabaseInitializationDetector();
        
        //Act Statement(s)
        Set<Class<?>> result = target.getDependsOnDatabaseInitializationBeanTypes();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(1));
            assertThat(result.iterator().next(), is(instanceOf(Class.class)));
        });
    }
}
