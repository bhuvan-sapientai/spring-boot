package org.springframework.boot.logging;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.apache.commons.logging.impl.NoOpLog;
import org.apache.commons.logging.Log;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DeferredLogsSapientGeneratedTest {

	//Sapient generated method id: ${4e39cbf8-f7cd-3ebe-ac14-7acccc741911}, hash: 3FBE4C16E4EFBE82A28FFBFFA850FCA8
	@Test()
	void getLogTest() {
		//Arrange Statement(s)
		DeferredLogs target = spy(new DeferredLogs());
		NoOpLog noOpLog = new NoOpLog();
		doReturn(noOpLog).when(target).getLog((Supplier) any());
		//Act Statement(s)
		Log result = target.getLog(Object.class);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(noOpLog));
			verify(target).getLog((Supplier) any());
		});
	}

	//Sapient generated method id: ${fc307381-380f-3974-8142-bf189786fb5c}, hash: 15F6E9720C577734A0F41BEAE220B76F
	@Test()
	void getLog1Test() {
		//Arrange Statement(s)
		DeferredLogs target = spy(new DeferredLogs());
		NoOpLog noOpLog = new NoOpLog();
		doReturn(noOpLog).when(target).getLog((Supplier) any());
		NoOpLog noOpLog2 = new NoOpLog();
		//Act Statement(s)
		Log result = target.getLog(noOpLog2);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(noOpLog));
			verify(target).getLog((Supplier) any());
		});
	}

	//Sapient generated method id: ${fbf0aa6d-44f0-37e0-b9de-1bd839eaeaba}, hash: BCB783981B4AD82FB91D4FB5A16DE83E
	@Test()
	void getLog2Test() {
		//Arrange Statement(s)
		DeferredLogs target = new DeferredLogs();
		Supplier supplierMock = mock(Supplier.class);
		//Act Statement(s)
		Log result = target.getLog(supplierMock);
		//Assert statement(s)
		//TODO: Please implement equals method in DeferredLog for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${272bcec7-07e5-34f3-9cc3-86d806553584}, hash: 9E4EE7F1E9EF0C3968CE11D9FB3509ED
	@Disabled()
	@Test()
	void switchOverAllWhenThisLoggersIsEmpty() {
		/* Branches:
		 * (for-each(this.lines)) : true
		 * (for-each(this.loggers)) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: line, var2, lines
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<DeferredLog> deferredLog = mockStatic(DeferredLog.class)) {
			deferredLog.when(() -> DeferredLog.logTo((Log) any(), eq(LogLevel.TRACE), (Object) any(), (Throwable) any())).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLogs target = new DeferredLogs();
			//Act Statement(s)
			target.switchOverAll();
			//Assert statement(s)
			assertAll("result", () -> deferredLog.verify(() -> DeferredLog.logTo((Log) any(), eq(LogLevel.TRACE), (Object) any(), (Throwable) any())));
		}
	}
}
