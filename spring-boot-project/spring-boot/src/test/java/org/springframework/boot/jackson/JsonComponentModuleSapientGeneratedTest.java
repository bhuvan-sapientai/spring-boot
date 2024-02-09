package org.springframework.boot.jackson;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JsonComponentModuleSapientGeneratedTest {

	//Sapient generated method id: ${a1e3d830-abee-3fcd-84b8-da92369a5da4}
	@Test()
	void afterPropertiesSetTest() {
		//Arrange Statement(s)
		JsonComponentModule target = spy(new JsonComponentModule());
		doNothing().when(target).registerJsonComponents();

		//Act Statement(s)
		target.afterPropertiesSet();

		//Assert statement(s)
		assertAll("result", () -> verify(target).registerJsonComponents());
	}

	//Sapient generated method id: ${43670d58-4e57-30aa-bdc1-b874da3d377f}
	@Test()
	void registerJsonComponentsWhenBeanFactoryIsNull() {
		/* Branches:
		 * (beanFactory != null) : false
		 */
		//Arrange Statement(s)
		JsonComponentModule target = new JsonComponentModule();

		//Act Statement(s)
		target.registerJsonComponents();
	}
}
