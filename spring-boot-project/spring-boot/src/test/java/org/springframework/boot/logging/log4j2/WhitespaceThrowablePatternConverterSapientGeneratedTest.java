package org.springframework.boot.logging.log4j2;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.impl.ThrowableFormatOptions;
import org.apache.logging.log4j.core.config.DefaultConfiguration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class WhitespaceThrowablePatternConverterSapientGeneratedTest {

	private final ThrowableFormatOptions optionsMock = mock(ThrowableFormatOptions.class, "options");

	//Sapient generated method id: ${fd4cc674-f619-3357-b237-51fd9a0b1ff9}, hash: 9B1D19CD0FBA0D1D2AB86DD3FA126A86
	@Test()
	void newInstance1Test() {
		//Arrange Statement(s)
		DefaultConfiguration defaultConfiguration = new DefaultConfiguration();
		String[] stringArray = new String[] {};
		//Act Statement(s)
		WhitespaceThrowablePatternConverter result = WhitespaceThrowablePatternConverter.newInstance((Configuration) defaultConfiguration, stringArray);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${30cf2183-950a-3b09-b183-b911552b4c51}, hash: 84B75A9CB71D5C30B0830FA3D84DCF79
	@Disabled()
	@Test()
	void newInstance1Test2() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn("return_of_getSuffix1").when(optionsMock).getSuffix();
		doReturn("return_of_getSeparator1").when(optionsMock).getSeparator();
		DefaultConfiguration defaultConfiguration = new DefaultConfiguration();
		String[] stringArray = new String[] { "option1", "option2" };
		//Act Statement(s)
		WhitespaceThrowablePatternConverter result = WhitespaceThrowablePatternConverter.newInstance((Configuration) defaultConfiguration, stringArray);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(optionsMock, times(2)).getSuffix();
			verify(optionsMock).getSeparator();
		});
	}
}
