package org.springframework.boot.logging;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Function;
import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DelegatingLoggingSystemFactorySapientGeneratedTest {

	private final Function delegatesMock = mock(Function.class, "delegates");

	//Sapient generated method id: ${1570d71d-a1ea-36ee-8069-ab2dc5347812}, hash: 8EFA518AD280BB131F29250F59CDAAB3
	@Test()
	void getLoggingSystemWhenLoggingSystemIsNotNull() {
		/* Branches:
		 * (this.delegates != null) : true
		 * (delegates != null) : true
		 * (for-each(delegates)) : true
		 * (loggingSystem != null) : true
		 */
		//Arrange Statement(s)
		DelegatingLoggingSystemFactory target = new DelegatingLoggingSystemFactory(delegatesMock);
		LoggingSystemFactory loggingSystemFactoryMock = mock(LoggingSystemFactory.class);
		List list = new ArrayList<>();
		list.add(loggingSystemFactoryMock);
		doReturn(list).when(delegatesMock).apply((ClassLoader) any());
		LoggingSystem loggingSystemMock = mock(LoggingSystem.class, "someLoggingSystem");
		doReturn(loggingSystemMock).when(loggingSystemFactoryMock).getLoggingSystem((ClassLoader) any());
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//Act Statement(s)
		LoggingSystem result = target.getLoggingSystem(classLoader);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(loggingSystemMock));
			verify(delegatesMock).apply((ClassLoader) any());
			verify(loggingSystemFactoryMock).getLoggingSystem((ClassLoader) any());
		});
	}

	//Sapient generated method id: ${5a0c1bdd-5216-3466-b309-f89348cbd3a2}, hash: D051E4C49504447317CFF19628937459
	@Test()
	void getLoggingSystemWhenLoggingSystemIsNull() {
		/* Branches:
		 * (this.delegates != null) : true
		 * (delegates != null) : true
		 * (for-each(delegates)) : true
		 * (loggingSystem != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DelegatingLoggingSystemFactory target = new DelegatingLoggingSystemFactory(delegatesMock);
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//Act Statement(s)
		LoggingSystem result = target.getLoggingSystem(classLoader);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}
}
