package org.springframework.boot.logging.java;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.logging.LogRecord;
import java.util.logging.Level;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SimpleFormatterSapientGeneratedTest {

	private final LogRecord recordMock = mock(LogRecord.class);

	//Sapient generated method id: ${f6aba6ed-1741-3610-ae6b-01cb65d31d1a}, hash: F6C7586AAD919D121B3F46A477957210
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
		doReturn(0L).when(recordMock).getMillis();
		doReturn(null).when(recordMock).getThrown();
		doReturn("C", "D").when(recordMock).getLoggerName();
		Level level = Level.parse("x1");
		doReturn(level).when(recordMock).getLevel();
		SimpleFormatter target = spy(new SimpleFormatter());
		doReturn("F").when(target).formatMessage(recordMock);

		//Act Statement(s)
		String result = target.format(recordMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("A"));
			verify(recordMock).getMillis();
			verify(recordMock, times(2)).getLoggerName();
			verify(recordMock).getThrown();
			verify(recordMock).getLevel();
			verify(target).formatMessage(recordMock);
		});
	}

	//Sapient generated method id: ${cc0265c6-0b70-3aee-8959-8b18b56df679}, hash: CCED523FAFF2F536B3B361C9750318CA
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
		doReturn(0L).when(recordMock).getMillis();
		Throwable throwable = new Throwable();
		Throwable throwable2 = new Throwable();
		doReturn(throwable, throwable2).when(recordMock).getThrown();
		doReturn("C", "D").when(recordMock).getLoggerName();
		Level level = Level.parse("x1");
		doReturn(level).when(recordMock).getLevel();
		SimpleFormatter target = spy(new SimpleFormatter());
		doReturn("F").when(target).formatMessage(recordMock);

		//Act Statement(s)
		String result = target.format(recordMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("A"));
			verify(recordMock).getMillis();
			verify(recordMock, times(2)).getLoggerName();
			verify(recordMock, times(2)).getThrown();
			verify(recordMock).getLevel();
			verify(target).formatMessage(recordMock);
		});
	}
}
