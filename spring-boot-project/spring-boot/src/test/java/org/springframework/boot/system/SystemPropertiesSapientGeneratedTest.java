package org.springframework.boot.system;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SystemPropertiesSapientGeneratedTest {

	//Sapient generated method id: ${dd135e4a-a12c-3825-95b3-733e561d7afc}, hash: 68B674422B4203C44378B28E709A77A6
	@Test()
	void getWhenOverrideIsNotNull() throws Throwable {
		/* Branches:
		 * (for-each(properties)) : true
		 * (override != null) : true
		 * (override != null) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Method java.lang.System::getProperty has a unrepeatable behavior
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		String[] stringArray = new String[] { "propertiesItem1" };

		//Act Statement(s)
		String result = SystemProperties.get(stringArray);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("result1")));
	}

	//Sapient generated method id: ${e3453ec9-fb8b-3493-b809-d47ee48d6e3d}, hash: 823D29FD9825802459D558C24C8FE9C2
	@Test()
	void getWhenOverrideIsNull() throws Throwable {
		/* Branches:
		 * (for-each(properties)) : true
		 * (override != null) : false
		 * (override != null) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Method java.lang.System::getProperty has a unrepeatable behavior
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		String[] stringArray = new String[] { "A" };

		//Act Statement(s)
		String result = SystemProperties.get(stringArray);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${108cd30a-f2bb-3e2d-8209-49bb77f90c09}, hash: CE19A74C211C86CD643B364BFB774E43
	@Test()
	void getWhenCaughtThrowable() throws Throwable {
		/* Branches:
		 * (for-each(properties)) : true
		 * (override != null) : false
		 * (override != null) : true
		 * (catch-exception (Throwable)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Method java.lang.System::getProperty has a unrepeatable behavior
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
