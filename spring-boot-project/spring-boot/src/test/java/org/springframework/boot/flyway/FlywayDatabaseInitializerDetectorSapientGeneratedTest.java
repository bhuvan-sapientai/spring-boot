package org.springframework.boot.flyway;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import org.flywaydb.core.Flyway;

import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FlywayDatabaseInitializerDetectorSapientGeneratedTest {

	//Sapient generated method id: ${04b7de1e-6789-3b87-a310-9fe752425589}
	@Test()
	void getDatabaseInitializerBeanTypesTest() {
		//Arrange Statement(s)
		FlywayDatabaseInitializerDetector target = new FlywayDatabaseInitializerDetector();

		//Act Statement(s)
		Set<Class<?>> result = target.getDatabaseInitializerBeanTypes();
		Set<Class<?>> anySet = new HashSet<>(Set.of(Flyway.class));

		//Assert statement(s)
		//TODO: Please implement equals method in Collection for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(anySet.size()));
			assertThat(result, containsInAnyOrder(anySet.toArray()));
		});
	}
}
