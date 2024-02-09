package org.springframework.boot.jdbc.init;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DataSourceScriptDatabaseInitializerDetectorSapientGeneratedTest {

	//Sapient generated method id: ${04b7de1e-6789-3b87-a310-9fe752425589}
	@Test()
	void getDatabaseInitializerBeanTypesTest() {
		//Arrange Statement(s)
		DataSourceScriptDatabaseInitializerDetector target = new DataSourceScriptDatabaseInitializerDetector();

		//Act Statement(s)
		Set<Class<?>> result = target.getDatabaseInitializerBeanTypes();
		Set<Class<?>> anySet = new HashSet<>(Set.of(DataSourceScriptDatabaseInitializer.class));

		//Assert statement(s)
		//TODO: Please implement equals method in Collection for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(anySet.size()));
			assertThat(result, containsInAnyOrder(anySet.toArray()));
		});
	}
}
