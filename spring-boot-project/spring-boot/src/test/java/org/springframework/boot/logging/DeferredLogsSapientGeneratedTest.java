package org.springframework.boot.logging;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.apache.commons.logging.Log;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DeferredLogsSapientGeneratedTest {

	//Sapient generated method id: ${4e39cbf8-f7cd-3ebe-ac14-7acccc741911}
	@Test()
	void getLogTest() {
		//Arrange Statement(s)
		DeferredLogs target = spy(new DeferredLogs());
		//TODO: Needs to return real value
		doReturn(null).when(target).getLog((Supplier) any());
		//Act Statement(s)
		Log result = target.getLog(Object.class);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(nullValue()));
			verify(target).getLog((Supplier) any());
		});
	}

	//Sapient generated method id: ${fc307381-380f-3974-8142-bf189786fb5c}
	@Test()
	void getLog1Test() {
		//Arrange Statement(s)
		DeferredLogs target = spy(new DeferredLogs());
		//TODO: Needs to return real value
		doReturn(null).when(target).getLog((Supplier) any());
		//TODO: Needs initialization with real value
		Log log = null;
		//Act Statement(s)
		Log result = target.getLog(log);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(nullValue()));
			verify(target).getLog((Supplier) any());
		});
	}

	//Sapient generated method id: ${fbf0aa6d-44f0-37e0-b9de-1bd839eaeaba}
	@Disabled()
	@Test()
	void getLog2Test() {
		//Arrange Statement(s)
		DeferredLogs target = new DeferredLogs();
		//TODO: Needs initialization with real value
		Supplier supplier = null;
		//Act Statement(s)
		Log result = target.getLog(supplier);
		DeferredLog.Lines deferredLogLines = new DeferredLog.Lines();
		DeferredLog deferredLog = new DeferredLog((Supplier) null, deferredLogLines);
		//Assert statement(s)
		//TODO: Please implement equals method in DeferredLog for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(deferredLog)));
	}

	//Sapient generated method id: ${272bcec7-07e5-34f3-9cc3-86d806553584}
	@Disabled()
	@Test()
	void switchOverAllWhenThisLoggersIsEmpty() {
		/* Branches:
		 * (for-each(this.lines)) : true
		 * (for-each(this.loggers)) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: lines
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<DeferredLog> deferredLog = mockStatic(DeferredLog.class)) {
			Object object = new Object();
			Throwable throwable = new Throwable();
			deferredLog.when(() -> DeferredLog.logTo((Log) null, LogLevel.TRACE, object, throwable)).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLogs target = new DeferredLogs();
			//Act Statement(s)
			target.switchOverAll();
			//Assert statement(s)
			assertAll("result", () -> deferredLog.verify(() -> DeferredLog.logTo((Log) null, LogLevel.TRACE, object, throwable), atLeast(1)));
		}
	}
}
