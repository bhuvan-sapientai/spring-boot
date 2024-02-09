package org.springframework.boot.system;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SystemPropertiesSapientGeneratedTest {

	//Sapient generated method id: ${dd135e4a-a12c-3825-95b3-733e561d7afc}
	@Disabled()
	@Test()
	void getWhenOverrideIsNotNull() throws Throwable {
		/* Branches:
		 * (for-each(properties)) : true
		 * (override != null) : true
		 * (override != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		String[] stringArray = new String[] { "propertiesItem1" };
		//Act Statement(s)
		String result = SystemProperties.get(stringArray);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("result1")));
	}

	//Sapient generated method id: ${e3453ec9-fb8b-3493-b809-d47ee48d6e3d}
	@Test()
	void getWhenOverrideIsNull() throws Throwable {
		/* Branches:
		 * (for-each(properties)) : true
		 * (override != null) : false
		 * (override != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		String[] stringArray = new String[] { "A" };
		//Act Statement(s)
		String result = SystemProperties.get(stringArray);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${108cd30a-f2bb-3e2d-8209-49bb77f90c09}
	@Test()
	void getWhenCaughtThrowable() throws Throwable {
		/* Branches:
		 * (for-each(properties)) : true
		 * (override != null) : false
		 * (override != null) : true
		 * (catch-exception (Throwable)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		String[] stringArray = new String[] { "A" };
		//Act Statement(s)
		String result = SystemProperties.get(stringArray);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}
}
