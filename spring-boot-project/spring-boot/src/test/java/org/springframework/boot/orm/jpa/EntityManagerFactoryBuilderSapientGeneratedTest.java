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

	//Sapient generated method id: ${99a4d48a-f4fc-3572-9fa2-1b8b8f66b4b1}
	@Test()
	void dataSourceTest() {
		//Arrange Statement(s)
		Map<String, Object> anyMap = new HashMap<>();
		EntityManagerFactoryBuilder target = new EntityManagerFactoryBuilder(jpaVendorAdapterMock, anyMap, persistenceUnitManagerMock, (URL) null);
		DataSource dataSource = null;

		//Act Statement(s)
		EntityManagerFactoryBuilder.Builder result = target.dataSource(dataSource);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${cc9bfe58-3db6-30cb-a39f-9cdd2667cf81}
	@Test()
	void setPersistenceUnitPostProcessorsTest() {
		//Arrange Statement(s)
		Map<String, Object> anyMap = new HashMap<>();
		EntityManagerFactoryBuilder target = new EntityManagerFactoryBuilder(jpaVendorAdapterMock, anyMap, persistenceUnitManagerMock, (URL) null);
		PersistenceUnitPostProcessor[] persistenceUnitPostProcessorArray = new PersistenceUnitPostProcessor[] {};

		//Act Statement(s)
		target.setPersistenceUnitPostProcessors(persistenceUnitPostProcessorArray);
	}
}
