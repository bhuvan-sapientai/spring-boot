package org.springframework.boot.logging.log4j2;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.ansi.AnsiElement;

import org.mockito.MockedStatic;
import org.apache.logging.log4j.core.config.DefaultConfiguration;

import org.springframework.boot.ansi.AnsiOutput;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ColorConverterSapientGeneratedTest {

	//Sapient generated method id: ${76a638c2-598b-3b1a-810e-69a1769bd521}, hash: 13D949A4F0632854C0C10572B9FBE768
	@Test()
	void newInstanceWhenOptionsLengthLessThan1() {
		/* Branches:
		 * (options.length < 1) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultConfiguration defaultConfiguration = new DefaultConfiguration();
		String[] stringArray = new String[] {};
		//Act Statement(s)
		ColorConverter result = ColorConverter.newInstance(defaultConfiguration, stringArray);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${0ec2cb48-b682-3016-b65f-44f32e5546d6}, hash: A4F20AEF5A603C5E96F0F39671216777
	@Test()
	void newInstanceWhen0IndexOfOptionsIsNull() {
		/* Branches:
		 * (options.length < 1) : false
		 * (options[0] == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultConfiguration defaultConfiguration = new DefaultConfiguration();
		String[] stringArray = new String[] { (String) null };
		//Act Statement(s)
		ColorConverter result = ColorConverter.newInstance(defaultConfiguration, stringArray);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${d512d4e3-97b1-3f16-a0ba-fcfdd8c2ef14}, hash: 068170804726688C11B847C61DBB1E26
	@Test()
	void newInstanceWhenOptionsLengthNotEquals1() {
		/* Branches:
		 * (options.length < 1) : false
		 * (options[0] == null) : false
		 * (options.length != 1) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: parser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultConfiguration defaultConfiguration = new DefaultConfiguration();
		String[] stringArray = new String[] { "pattern", "color" };
		//Act Statement(s)
		ColorConverter result = ColorConverter.newInstance(defaultConfiguration, stringArray);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${6f6d678a-1775-3d4a-9b25-80515f70a893}, hash: FD26F1ED4FB12CD0C734AE0FE0EBBE5D
	@Test()
	void newInstanceWhenOptionsLengthEquals1() {
		/* Branches:
		 * (options.length < 1) : false
		 * (options[0] == null) : false
		 * (options.length != 1) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: parser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultConfiguration defaultConfiguration = new DefaultConfiguration();
		String[] stringArray = new String[] { "pattern" };
		//Act Statement(s)
		ColorConverter result = ColorConverter.newInstance(defaultConfiguration, stringArray);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${0c75cc91-4305-3dbe-847f-446f79ac714e}, hash: 2C5441ECE0C75D288C4DE89C4578EFD5
	@Disabled()
	@Test()
	void handlesThrowableWhenFormatterHandlesThrowable() {
		/* Branches:
		 * (for-each(this.formatters)) : true
		 * (formatter.handlesThrowable()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultConfiguration defaultConfiguration = new DefaultConfiguration();
		String[] stringArray = new String[] {};
		ColorConverter target = ColorConverter.newInstance(defaultConfiguration, stringArray);
		//Act Statement(s)
		boolean result = target.handlesThrowable();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${8531fdde-a241-3c1f-8e48-7e8529d952c6}, hash: 27E18A3500D7E92436D6FE2562B0DDE2
	@Disabled()
	@Test()
	void handlesThrowableWhenFormatterNotHandlesThrowable() {
		/* Branches:
		 * (for-each(this.formatters)) : true
		 * (formatter.handlesThrowable()) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultConfiguration defaultConfiguration = new DefaultConfiguration();
		String[] stringArray = new String[] {};
		ColorConverter target = ColorConverter.newInstance(defaultConfiguration, stringArray);
		//Act Statement(s)
		boolean result = target.handlesThrowable();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${e1ea305b-44ed-3a89-82f1-ef4be055011b}, hash: 9E50FD74B149668DCB86537E9F0E59C0
	@Disabled()
	@Test()
	void appendAnsiStringTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		AnsiElement ansiElementMock = mock(AnsiElement.class);
		try (MockedStatic<AnsiOutput> ansiOutput = mockStatic(AnsiOutput.class)) {
			Object[] objectArray = new Object[] { ansiElementMock, "in1" };
			ansiOutput.when(() -> AnsiOutput.toString(objectArray)).thenReturn("toAppendToItem1");
			DefaultConfiguration defaultConfiguration = new DefaultConfiguration();
			String[] stringArray = new String[] {};
			ColorConverter target = ColorConverter.newInstance(defaultConfiguration, stringArray);
			StringBuilder stringBuilder = new StringBuilder();
			//Act Statement(s)
			target.appendAnsiString(stringBuilder, "in1", ansiElementMock);
			//Assert statement(s)
			assertAll("result", () -> ansiOutput.verify(() -> AnsiOutput.toString(objectArray), atLeast(1)));
		}
	}
}
