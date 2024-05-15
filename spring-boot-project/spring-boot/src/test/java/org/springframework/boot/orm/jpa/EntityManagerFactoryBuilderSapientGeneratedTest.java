package org.springframework.boot.orm.jpa;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.orm.jpa.JpaVendorAdapter;
import java.util.Map;
import org.springframework.orm.jpa.persistenceunit.PersistenceUnitPostProcessor;
import java.util.HashMap;
import java.net.URL;
import javax.sql.DataSource;
import org.springframework.orm.jpa.persistenceunit.PersistenceUnitManager;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class EntityManagerFactoryBuilderSapientGeneratedTest {

    private final JpaVendorAdapter jpaVendorAdapterMock = mock(JpaVendorAdapter.class);

    private final PersistenceUnitManager persistenceUnitManagerMock = mock(PersistenceUnitManager.class);

    private final URL uRLMock = mock(URL.class);

    //Sapient generated method id: ${dataSourceTest}, hash: 9D43DE4BB1A6871C2F640A5E0D364331
    @Test()
    void dataSourceTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Map<String, Object> anyMap = new HashMap<>();
        EntityManagerFactoryBuilder target = new EntityManagerFactoryBuilder(jpaVendorAdapterMock, anyMap, persistenceUnitManagerMock, uRLMock);
        DataSource dataSourceMock = mock(DataSource.class);
        //Act Statement(s)
        EntityManagerFactoryBuilder.Builder result = target.dataSource(dataSourceMock);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${setPersistenceUnitPostProcessorsTest}, hash: B68BB332A190FF74B6BD6CFFF4350183
    @Test()
    void setPersistenceUnitPostProcessorsTest() {
        //Arrange Statement(s)
        Map<String, Object> anyMap = new HashMap<>();
        EntityManagerFactoryBuilder target = new EntityManagerFactoryBuilder(jpaVendorAdapterMock, anyMap, persistenceUnitManagerMock, uRLMock);
        PersistenceUnitPostProcessor[] persistenceUnitPostProcessorArray = new PersistenceUnitPostProcessor[] {};
        //Act Statement(s)
        target.setPersistenceUnitPostProcessors(persistenceUnitPostProcessorArray);
    }
}
