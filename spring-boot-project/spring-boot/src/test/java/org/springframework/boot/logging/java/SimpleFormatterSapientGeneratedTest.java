package org.springframework.boot.logging.java;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.logging.LogRecord;
import java.util.logging.Level;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SimpleFormatterSapientGeneratedTest {

	//Sapient generated method id: ${f6aba6ed-1741-3610-ae6b-01cb65d31d1a}, hash: 2C995B98B2CC84C057B0E314751D2083
	@Disabled()
	@Test()
	void formatWhenNameIsNotNull() {
		/* Branches:
		 * (record.getThrown() == null) : true  #  inside getThrowable method
		 * (name != null) : true  #  inside getThreadName method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SimpleFormatter target = spy(new SimpleFormatter());
		Level level = Level.parse("x1");
		LogRecord logRecord = new LogRecord(level, "msg1");
		doReturn("F").when(target).formatMessage(logRecord);
		//Act Statement(s)
		String result = target.format(logRecord);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("A"));
			verify(target).formatMessage(logRecord);
		});
	}

	//Sapient generated method id: ${cc0265c6-0b70-3aee-8959-8b18b56df679}, hash: E23AFEC45FF24788AA052CF3E985FE8F
	@Disabled()
	@Test()
	void formatWhenRecordGetThrownIsNotNullAndNameIsNotNull() {
		/* Branches:
		 * (record.getThrown() == null) : false  #  inside getThrowable method
		 * (name != null) : true  #  inside getThreadName method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SimpleFormatter target = spy(new SimpleFormatter());
		Level level = Level.parse("x1");
		LogRecord logRecord = new LogRecord(level, "msg1");
		doReturn("F").when(target).formatMessage(logRecord);
		//Act Statement(s)
		String result = target.format(logRecord);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("A"));
			verify(target).formatMessage(logRecord);
		});
	}
}
