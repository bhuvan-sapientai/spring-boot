package org.springframework.boot.jdbc;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringJdbcDependsOnDatabaseInitializationDetectorSapientGeneratedTest {

	//Sapient generated method id: ${34ee7414-2367-36d0-935f-f0ff558b7431}, hash: 8529033AE037C6DB2540DF426EBAB6F8
	@Test()
	void getDependsOnDatabaseInitializationBeanTypesTest() {
		//Arrange Statement(s)
		SpringJdbcDependsOnDatabaseInitializationDetector target = new SpringJdbcDependsOnDatabaseInitializationDetector();

		//Act Statement(s)
		Set<Class<?>> result = target.getDependsOnDatabaseInitializationBeanTypes();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(3));
			assertThat(result.iterator().next(), is(instanceOf(Class.class)));
		});
	}
}
