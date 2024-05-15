package org.springframework.boot.orm.jpa;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.core.env.Environment;
import java.util.Set;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JpaDependsOnDatabaseInitializationDetectorSapientGeneratedTest {

    private final Environment environmentMock = mock(Environment.class, "environment");

    //Sapient generated method id: ${getDependsOnDatabaseInitializationBeanTypesWhenPostpone}, hash: 05560EB9C81390956F0C1753DE97D5F4
    @Test()
    void getDependsOnDatabaseInitializationBeanTypesWhenPostpone() {
        /* Branches:
         * (postpone) : true
         */
         //Arrange Statement(s)
        JpaDependsOnDatabaseInitializationDetector target = new JpaDependsOnDatabaseInitializationDetector(environmentMock);
        doReturn(true).when(environmentMock).getProperty("spring.jpa.defer-datasource-initialization", boolean.class, false);
        
        //Act Statement(s)
        Set<Class<?>> result = target.getDependsOnDatabaseInitializationBeanTypes();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(0));
            verify(environmentMock).getProperty("spring.jpa.defer-datasource-initialization", boolean.class, false);
        });
    }

    //Sapient generated method id: ${getDependsOnDatabaseInitializationBeanTypesWhenNotPostpone}, hash: 905A8CC03FBAA13DC47B3279C7510EA9
    @Test()
    void getDependsOnDatabaseInitializationBeanTypesWhenNotPostpone() {
        /* Branches:
         * (postpone) : false
         */
         //Arrange Statement(s)
        JpaDependsOnDatabaseInitializationDetector target = new JpaDependsOnDatabaseInitializationDetector(environmentMock);
        doReturn(false).when(environmentMock).getProperty("spring.jpa.defer-datasource-initialization", boolean.class, false);
        
        //Act Statement(s)
        Set<Class<?>> result = target.getDependsOnDatabaseInitializationBeanTypes();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(2));
            assertThat(result.iterator().next(), is(instanceOf(Class.class)));
            verify(environmentMock).getProperty("spring.jpa.defer-datasource-initialization", boolean.class, false);
        });
    }
}
