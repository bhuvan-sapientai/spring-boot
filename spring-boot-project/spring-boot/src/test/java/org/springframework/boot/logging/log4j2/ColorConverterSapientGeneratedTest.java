package org.springframework.boot.logging.log4j2;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.core.config.Configuration;

import org.springframework.boot.ansi.AnsiElement;

import org.mockito.MockedStatic;
import org.apache.logging.log4j.core.LogEvent;

import org.springframework.boot.ansi.AnsiColor;
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

	private final AnsiElement ansiElementMock = mock(AnsiElement.class);

	//Sapient generated method id: ${76a638c2-598b-3b1a-810e-69a1769bd521}
	@Test()
	void newInstanceWhenOptionsLengthLessThan1() {
		/* Branches:
		 * (options.length < 1) : true
		 */
		//Arrange Statement(s)
		//TODO: Needs initialization with real value
		Configuration configuration = null;
		String[] stringArray = new String[] {};
		//Act Statement(s)
		ColorConverter result = ColorConverter.newInstance(configuration, stringArray);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${0ec2cb48-b682-3016-b65f-44f32e5546d6}
	@Test()
	void newInstanceWhen0IndexOfOptionsIsNull() {
		/* Branches:
		 * (options.length < 1) : false
		 * (options[0] == null) : true
		 */
		//Arrange Statement(s)
		//TODO: Needs initialization with real value
		Configuration configuration = null;
		String[] stringArray = new String[] { (String) null };
		//Act Statement(s)
		ColorConverter result = ColorConverter.newInstance(configuration, stringArray);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${d512d4e3-97b1-3f16-a0ba-fcfdd8c2ef14}
	@Test()
	void newInstanceWhenOptionsLengthNotEquals1() {
		/* Branches:
		 * (options.length < 1) : false
		 * (options[0] == null) : false
		 * (options.length != 1) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//TODO: Needs initialization with real value
		Configuration configuration = null;
		String[] stringArray = new String[] { "optionsItem1", "optionsItem1" };
		//Act Statement(s)
		ColorConverter result = ColorConverter.newInstance(configuration, stringArray);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${6f6d678a-1775-3d4a-9b25-80515f70a893}
	@Test()
	void newInstanceWhenOptionsLengthEquals1() {
		/* Branches:
		 * (options.length < 1) : false
		 * (options[0] == null) : false
		 * (options.length != 1) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//TODO: Needs initialization with real value
		Configuration configuration = null;
		String[] stringArray = new String[] { "optionsItem1" };
		//Act Statement(s)
		ColorConverter result = ColorConverter.newInstance(configuration, stringArray);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${0c75cc91-4305-3dbe-847f-446f79ac714e}
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
		String[] stringArray = new String[] {};
		ColorConverter target = ColorConverter.newInstance((Configuration) null, stringArray);
		//Act Statement(s)
		boolean result = target.handlesThrowable();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${8531fdde-a241-3c1f-8e48-7e8529d952c6}
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
		String[] stringArray = new String[] {};
		ColorConverter target = ColorConverter.newInstance((Configuration) null, stringArray);
		//Act Statement(s)
		boolean result = target.handlesThrowable();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${b4065072-e69f-3627-8f7e-7325ea0516ea}
	@Disabled()
	@Test()
	void formatWhenElementIsNotNull() {
		/* Branches:
		 * (for-each(this.formatters)) : true
		 * (!buf.isEmpty()) : true
		 * (element == null) : true
		 * (element != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<AnsiOutput> ansiOutput = mockStatic(AnsiOutput.class)) {
			Object[] objectArray = new Object[] { ansiElementMock, "" };
			ansiOutput.when(() -> AnsiOutput.toString(objectArray)).thenReturn("toAppendToItem1");
			String[] stringArray = new String[] {};
			ColorConverter target = ColorConverter.newInstance((Configuration) null, stringArray);
			//TODO: Needs initialization with real value
			LogEvent logEvent = null;
			StringBuilder stringBuilder = new StringBuilder();
			//Act Statement(s)
			target.format(logEvent, stringBuilder);
			//Assert statement(s)
			assertAll("result", () -> ansiOutput.verify(() -> AnsiOutput.toString(objectArray), atLeast(1)));
		}
	}

	//Sapient generated method id: ${41d0e88d-9e3f-3c8e-9c92-bafcded84665}
	@Disabled()
	@Test()
	void formatWhenElementIsNull() {
		/* Branches:
		 * (for-each(this.formatters)) : true
		 * (!buf.isEmpty()) : true
		 * (element == null) : true
		 * (element != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<AnsiOutput> ansiOutput = mockStatic(AnsiOutput.class)) {
			Object[] objectArray = new Object[] { AnsiColor.GREEN, "" };
			ansiOutput.when(() -> AnsiOutput.toString(objectArray)).thenReturn("toAppendToItem1");
			String[] stringArray = new String[] {};
			ColorConverter target = ColorConverter.newInstance((Configuration) null, stringArray);
			//TODO: Needs initialization with real value
			LogEvent logEvent = null;
			StringBuilder stringBuilder = new StringBuilder();
			//Act Statement(s)
			target.format(logEvent, stringBuilder);
			//Assert statement(s)
			assertAll("result", () -> ansiOutput.verify(() -> AnsiOutput.toString(objectArray), atLeast(1)));
		}
	}

	//Sapient generated method id: ${e1ea305b-44ed-3a89-82f1-ef4be055011b}
	@Disabled()
	@Test()
	void appendAnsiStringTest() {
		//Arrange Statement(s)
		try (MockedStatic<AnsiOutput> ansiOutput = mockStatic(AnsiOutput.class)) {
			Object[] objectArray = new Object[] { ansiElementMock, "in1" };
			ansiOutput.when(() -> AnsiOutput.toString(objectArray)).thenReturn("toAppendToItem1");
			String[] stringArray = new String[] {};
			ColorConverter target = ColorConverter.newInstance((Configuration) null, stringArray);
			StringBuilder stringBuilder = new StringBuilder();
			//Act Statement(s)
			target.appendAnsiString(stringBuilder, "in1", ansiElementMock);
			//Assert statement(s)
			assertAll("result", () -> ansiOutput.verify(() -> AnsiOutput.toString(objectArray), atLeast(1)));
		}
	}
}
