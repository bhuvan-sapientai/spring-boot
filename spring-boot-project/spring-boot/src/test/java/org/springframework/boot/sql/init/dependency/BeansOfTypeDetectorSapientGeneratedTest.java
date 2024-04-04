package org.springframework.boot.sql.init.dependency;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import org.springframework.beans.factory.ListableBeanFactory;

import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BeansOfTypeDetectorSapientGeneratedTest {

	private final ListableBeanFactory beanFactoryMock = mock(ListableBeanFactory.class);

	//Sapient generated method id: ${0e8cf7a2-2de0-3147-9c6a-db67c6c46469}, hash: EE0C59B75AF372B438F21FC30119A8D2
	@Test()
	void detectWhenThisTypesIsNotEmpty() throws Throwable {
		/* Branches:
		 * (for-each(this.types)) : true
		 */
		//Arrange Statement(s)
		String[] stringArray = new String[] {};
		doReturn(stringArray).when(beanFactoryMock).getBeanNamesForType(Object.class, true, false);
		Set<Class<?>> anySet = new HashSet<>();
		anySet.add(Object.class);
		BeansOfTypeDetector target = new BeansOfTypeDetector(anySet);

		//Act Statement(s)
		Set<String> result = target.detect(beanFactoryMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(0));
			verify(beanFactoryMock).getBeanNamesForType(Object.class, true, false);
		});
	}

	//Sapient generated method id: ${11a9fd5a-66c4-3d0c-bf4b-1595793634ae}, hash: 10231C4F0714207213EB6C76C129C514
	@Test()
	void detectWhenCaughtThrowable() throws Throwable {
		/* Branches:
		 * (for-each(this.types)) : true
		 * (catch-exception (Throwable)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		String[] stringArray = new String[] {};
		doReturn(stringArray).when(beanFactoryMock).getBeanNamesForType(Object.class, true, false);
		Set<Class<?>> anySet = new HashSet<>();
		anySet.add(Object.class);
		BeansOfTypeDetector target = new BeansOfTypeDetector(anySet);

		//Act Statement(s)
		Set<String> result = target.detect(beanFactoryMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(0));
			verify(beanFactoryMock).getBeanNamesForType(Object.class, true, false);
		});
	}
}
