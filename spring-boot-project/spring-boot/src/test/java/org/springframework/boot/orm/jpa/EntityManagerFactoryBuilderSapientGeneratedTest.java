package org.springframework.boot.orm.jpa;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.persistenceunit.PersistenceUnitManager;

import java.util.Map;

import org.springframework.orm.jpa.persistenceunit.PersistenceUnitPostProcessor;

import java.util.HashMap;
import java.net.URL;

import javax.sql.DataSource;

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

	//Sapient generated method id: ${99a4d48a-f4fc-3572-9fa2-1b8b8f66b4b1}, hash: 992791246D110BD0FF643912791699DB
	@Test()
	void dataSourceTest() {
		//Arrange Statement(s)
		Object object = new Object();
		Map<String, Object> anyMap = new HashMap<>();
		anyMap.put("value", object);
		EntityManagerFactoryBuilder target = new EntityManagerFactoryBuilder(jpaVendorAdapterMock, anyMap, persistenceUnitManagerMock, uRLMock);
		DataSource dataSourceMock = mock(DataSource.class);

		//Act Statement(s)
		EntityManagerFactoryBuilder.Builder result = target.dataSource(dataSourceMock);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${cc9bfe58-3db6-30cb-a39f-9cdd2667cf81}, hash: B68BB332A190FF74B6BD6CFFF4350183
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
