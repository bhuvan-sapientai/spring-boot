package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.context.event.ContextRefreshedEvent;

import static org.mockito.Mockito.mock;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ClearCachesApplicationListenerSapientGeneratedTest {

	private final ContextRefreshedEvent contextRefreshedEventMock = mock(ContextRefreshedEvent.class);

	//Sapient generated method id: ${814da7ab-4387-3217-a93e-c676136e52ad}
	@Test()
	void onApplicationEventWhenClassLoaderIsNull() throws Exception {
		/* Branches:
		 * (classLoader == null) : true  #  inside clearClassLoaderCaches method
		 */
		//Arrange Statement(s)
		ClearCachesApplicationListener target = new ClearCachesApplicationListener();
		//Act Statement(s)
		target.onApplicationEvent(contextRefreshedEventMock);
	}

	//Sapient generated method id: ${8c66ab1e-a98c-3008-85eb-f845e5d22d6c}
	@Test()
	void onApplicationEventWhenClassLoaderIsNotNull() throws Exception {
		/* Branches:
		 * (classLoader == null) : false  #  inside clearClassLoaderCaches method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ClearCachesApplicationListener target = new ClearCachesApplicationListener();
		//Act Statement(s)
		target.onApplicationEvent(contextRefreshedEventMock);
	}

	//Sapient generated method id: ${3f8e2b63-ec55-30bd-9a25-8574216baedd}
	@Test()
	void onApplicationEventWhenCaughtException() throws Exception {
		/* Branches:
		 * (classLoader == null) : false  #  inside clearClassLoaderCaches method
		 * (catch-exception (Exception)) : true  #  inside clearClassLoaderCaches method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ClearCachesApplicationListener target = new ClearCachesApplicationListener();
		//Act Statement(s)
		target.onApplicationEvent(contextRefreshedEventMock);
	}
}
