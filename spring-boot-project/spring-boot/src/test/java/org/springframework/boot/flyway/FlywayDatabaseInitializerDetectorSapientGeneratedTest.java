package org.springframework.boot.flyway;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FlywayDatabaseInitializerDetectorSapientGeneratedTest {

	//Sapient generated method id: ${04b7de1e-6789-3b87-a310-9fe752425589}, hash: 4845EDB52A27E182A83BE25B418667E1
	@Test()
	void getDatabaseInitializerBeanTypesTest() {
		//Arrange Statement(s)
		FlywayDatabaseInitializerDetector target = new FlywayDatabaseInitializerDetector();

		//Act Statement(s)
		Set<Class<?>> result = target.getDatabaseInitializerBeanTypes();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(1));
			assertThat(result.iterator().next(), is(instanceOf(Class.class)));
		});
	}
}
