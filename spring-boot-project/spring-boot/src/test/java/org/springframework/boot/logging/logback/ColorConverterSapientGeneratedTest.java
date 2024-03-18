package org.springframework.boot.logging.logback;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.ansi.AnsiElement;

import ch.qos.logback.classic.spi.ILoggingEvent;
import org.mockito.MockedStatic;
import ch.qos.logback.classic.Level;

import org.springframework.boot.ansi.AnsiColor;
import org.springframework.boot.ansi.AnsiOutput;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ColorConverterSapientGeneratedTest {

	private final AnsiElement ansiElementMock = mock(AnsiElement.class);

	private final ILoggingEvent eventMock = mock(ILoggingEvent.class);

	private final Level levelMock = mock(Level.class);

	//Sapient generated method id: ${1c133f83-950a-39aa-a42e-462d588bfb25}, hash: A738BAF541737CE28CA9084FA00DA9F5
	@Disabled()
	@Test()
	void transform1WhenElementIsNullAndElementIsNotNull() {
		/* Branches:
		 * (element == null) : true
		 * (element != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<AnsiOutput> ansiOutput = mockStatic(AnsiOutput.class)) {
			doReturn(levelMock).when(eventMock).getLevel();
			doReturn(0).when(levelMock).toInteger();
			Object[] objectArray = new Object[] { ansiElementMock, "in1" };
			ansiOutput.when(() -> AnsiOutput.toString(objectArray)).thenReturn("return_of_toString1");
			ColorConverter target = spy(new ColorConverter());
			doReturn(null).when(target).getFirstOption();
			//Act Statement(s)
			String result = target.transform(eventMock, "in1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_toString1"));
				verify(eventMock).getLevel();
				verify(levelMock).toInteger();
				ansiOutput.verify(() -> AnsiOutput.toString(objectArray), atLeast(1));
				verify(target).getFirstOption();
			});
		}
	}

	//Sapient generated method id: ${ec27a696-844e-3ae0-b73f-bab1ef28538b}, hash: 05DD3ADDD81A01815D521E6FCA69207A
	@Test()
	void transform1WhenElementIsNull() {
		/* Branches:
		 * (element == null) : true
		 * (element != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<AnsiOutput> ansiOutput = mockStatic(AnsiOutput.class)) {
			doReturn(levelMock).when(eventMock).getLevel();
			//TODO: Needs to return real value
			doReturn(null).when(levelMock).toInteger();
			Object[] objectArray = new Object[] { AnsiColor.GREEN, "in1" };
			ansiOutput.when(() -> AnsiOutput.toString(objectArray)).thenReturn("return_of_toString1");
			ColorConverter target = spy(new ColorConverter());
			//TODO: Needs to return real value
			doReturn(null).when(target).getFirstOption();
			//Act Statement(s)
			String result = target.transform(eventMock, "in1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_toString1"));
				verify(eventMock).getLevel();
				verify(levelMock).toInteger();
				ansiOutput.verify(() -> AnsiOutput.toString(objectArray), atLeast(1));
				verify(target).getFirstOption();
			});
		}
	}

	//Sapient generated method id: ${79e63bfe-ae7e-3abf-a785-f91d8a55f2b5}, hash: 595A525717B87B614056AC06DABB5BEC
	@Test()
	void toAnsiStringTest() {
		//Arrange Statement(s)
		try (MockedStatic<AnsiOutput> ansiOutput = mockStatic(AnsiOutput.class)) {
			Object[] objectArray = new Object[] { ansiElementMock, "in1" };
			ansiOutput.when(() -> AnsiOutput.toString(objectArray)).thenReturn("return_of_toString1");
			ColorConverter target = new ColorConverter();
			//Act Statement(s)
			String result = target.toAnsiString("in1", ansiElementMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_toString1"));
				ansiOutput.verify(() -> AnsiOutput.toString(objectArray), atLeast(1));
			});
		}
	}
}
