package org.springframework.boot.jdbc;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;

import java.util.Set;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.jdbc.core.JdbcOperations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringJdbcDependsOnDatabaseInitializationDetectorSapientGeneratedTest {

	//Sapient generated method id: ${34ee7414-2367-36d0-935f-f0ff558b7431}
	@Test()
	void getDependsOnDatabaseInitializationBeanTypesTest() {
		//Arrange Statement(s)
		SpringJdbcDependsOnDatabaseInitializationDetector target = new SpringJdbcDependsOnDatabaseInitializationDetector();

		//Act Statement(s)
		Set<Class<?>> result = target.getDependsOnDatabaseInitializationBeanTypes();
		Set<Class<?>> anySet = new HashSet<>(Set.of(JdbcClient.class, JdbcOperations.class, NamedParameterJdbcOperations.class));

		//Assert statement(s)
		//TODO: Please implement equals method in Collection for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(anySet.size()));
			assertThat(result, containsInAnyOrder(anySet.toArray()));
		});
	}
}
