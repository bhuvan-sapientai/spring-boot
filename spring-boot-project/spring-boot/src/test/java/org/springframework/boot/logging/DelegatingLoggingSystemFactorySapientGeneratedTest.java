package org.springframework.boot.logging;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DelegatingLoggingSystemFactorySapientGeneratedTest {

	//Sapient generated method id: ${1570d71d-a1ea-36ee-8069-ab2dc5347812}
	@Disabled()
	@Test()
	void getLoggingSystemWhenLoggingSystemIsNotNull() {
		/* Branches:
		 * (this.delegates != null) : true
		 * (delegates != null) : true
		 * (for-each(delegates)) : true
		 * (loggingSystem != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DelegatingLoggingSystemFactory target = new DelegatingLoggingSystemFactory((Function) null);
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//Act Statement(s)
		LoggingSystem result = target.getLoggingSystem(classLoader);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${5a0c1bdd-5216-3466-b309-f89348cbd3a2}
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
		DelegatingLoggingSystemFactory target = new DelegatingLoggingSystemFactory((Function) null);
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//Act Statement(s)
		LoggingSystem result = target.getLoggingSystem(classLoader);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}
}
