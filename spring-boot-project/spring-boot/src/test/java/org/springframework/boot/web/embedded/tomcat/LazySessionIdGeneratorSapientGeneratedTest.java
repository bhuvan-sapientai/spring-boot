package org.springframework.boot.web.embedded.tomcat;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.apache.catalina.LifecycleException;
import org.apache.tomcat.util.res.StringManager;
import org.apache.catalina.LifecycleState;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LazySessionIdGeneratorSapientGeneratedTest {

	private final StringManager smMock = mock(StringManager.class, "sm");

	private AutoCloseable autoCloseableMocks;

	@InjectMocks()
	private LazySessionIdGenerator target;

	@AfterEach()
	public void afterTest() throws Exception {
		if (autoCloseableMocks != null)
			autoCloseableMocks.close();
	}

	//Sapient generated method id: ${e75fbe70-9e24-30b6-bff3-fe180d37e498}
	@Disabled()
	@Test()
	void startInternalThrowsLifecycleException() throws LifecycleException {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new LazySessionIdGenerator();
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		Object[] objectArray = new Object[] { "STARTING", "argsItem1", LifecycleState.NEW };
		doReturn("return_of_getString1").when(smMock).getString("lifecycleBase.invalidTransition", objectArray);
		LifecycleException lifecycleException = new LifecycleException("return_of_getString1");
		//Act Statement(s)
		final LifecycleException result = assertThrows(LifecycleException.class, () -> {
			target.startInternal();
		});
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getMessage(), equalTo(lifecycleException.getMessage()));
			verify(smMock).getString("lifecycleBase.invalidTransition", objectArray);
		});
	}
}
