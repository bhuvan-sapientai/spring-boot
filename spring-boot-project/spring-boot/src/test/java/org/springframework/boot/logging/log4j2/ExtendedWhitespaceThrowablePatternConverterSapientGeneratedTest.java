package org.springframework.boot.logging.log4j2;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.LogEvent;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ExtendedWhitespaceThrowablePatternConverterSapientGeneratedTest {

	//Sapient generated method id: ${37b17e4a-1f01-36f3-af30-9dca1dc8f643}
	@Disabled()
	@Test()
	void formatWhenEventGetThrownIsNotNull() {
		/* Branches:
		 * (event.getThrown() != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		String[] stringArray = new String[] {};
		ExtendedWhitespaceThrowablePatternConverter target = ExtendedWhitespaceThrowablePatternConverter.newInstance((Configuration) null, stringArray);
		//TODO: Needs initialization with real value
		LogEvent logEvent = null;
		StringBuilder stringBuilder = new StringBuilder();
		//Act Statement(s)
		target.format(logEvent, stringBuilder);
	}

	//Sapient generated method id: ${fd4cc674-f619-3357-b237-51fd9a0b1ff9}
	@Test()
	void newInstance1Test() {
		//Arrange Statement(s)
		Configuration configuration = null;
		String[] stringArray = new String[] {};
		//Act Statement(s)
		ExtendedWhitespaceThrowablePatternConverter result = ExtendedWhitespaceThrowablePatternConverter.newInstance(configuration, stringArray);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${30cf2183-950a-3b09-b183-b911552b4c51}
	@Disabled()
	@Test()
	void newInstance1Test2() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//TODO: Needs initialization with real value
		Configuration configuration = null;
		String[] stringArray = new String[] { "A" };
		//Act Statement(s)
		ExtendedWhitespaceThrowablePatternConverter result = ExtendedWhitespaceThrowablePatternConverter.newInstance(configuration, stringArray);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
