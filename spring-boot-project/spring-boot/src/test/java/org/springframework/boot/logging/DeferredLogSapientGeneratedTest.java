package org.springframework.boot.logging;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import org.springframework.util.Assert;

import org.apache.commons.logging.Log;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DeferredLogSapientGeneratedTest {

	private final DeferredLog.Lines linesMock = mock(DeferredLog.Lines.class, "<value>");

	//Sapient generated method id: ${48f0489a-949e-310e-8b09-c8b13c532153}
	@Test()
	void isTraceEnabledWhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination == null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Supplier) null, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog((Supplier) null, linesMock);
			//Act Statement(s)
			boolean result = target.isTraceEnabled();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull((Supplier) null, "Destination must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3cc52b7f-9f34-3e02-a7f7-7a38d6075367}
	@Test()
	void isDebugEnabledWhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination == null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Supplier) null, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog((Supplier) null, linesMock);
			//Act Statement(s)
			boolean result = target.isDebugEnabled();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull((Supplier) null, "Destination must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${49cab170-1f0c-34c8-a368-a47adcfa2c5f}
	@Test()
	void isInfoEnabledWhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination == null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Supplier) null, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog((Supplier) null, linesMock);
			//Act Statement(s)
			boolean result = target.isInfoEnabled();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull((Supplier) null, "Destination must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3efb66fc-0bad-39b5-8669-963efa7ca3a4}
	@Test()
	void isWarnEnabledWhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination == null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Supplier) null, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog((Supplier) null, linesMock);
			//Act Statement(s)
			boolean result = target.isWarnEnabled();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull((Supplier) null, "Destination must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${6938bc83-570e-367c-a2ff-35dee70ccfe9}
	@Test()
	void isErrorEnabledWhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination == null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Supplier) null, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog((Supplier) null, linesMock);
			//Act Statement(s)
			boolean result = target.isErrorEnabled();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull((Supplier) null, "Destination must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${9d99b9f1-18b9-3a91-a847-bd4452bd32bc}
	@Test()
	void isFatalEnabledWhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination == null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Supplier) null, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog((Supplier) null, linesMock);
			//Act Statement(s)
			boolean result = target.isFatalEnabled();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull((Supplier) null, "Destination must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${dcef42cb-a44b-3106-8a7e-4af01c729a8a}
	@Test()
	void traceWhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination != null) : false  #  inside log method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Supplier) null, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog((Supplier) null, linesMock);
			Object object = new Object();
			doNothing().when(linesMock).add((Supplier) null, LogLevel.TRACE, object, (Throwable) null);
			//Act Statement(s)
			target.trace(object);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull((Supplier) null, "Destination must not be null"), atLeast(1));
				verify(linesMock).add((Supplier) null, LogLevel.TRACE, object, (Throwable) null);
			});
		}
	}

	//Sapient generated method id: ${282d69a0-70db-398c-8845-b9745ff9739d}
	@Test()
	void trace1WhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination != null) : false  #  inside log method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Supplier) null, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog((Supplier) null, linesMock);
			Object object = new Object();
			Throwable throwable = new Throwable();
			doNothing().when(linesMock).add((Supplier) null, LogLevel.TRACE, object, throwable);
			//Act Statement(s)
			target.trace(object, throwable);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull((Supplier) null, "Destination must not be null"), atLeast(1));
				verify(linesMock).add((Supplier) null, LogLevel.TRACE, object, throwable);
			});
		}
	}

	//Sapient generated method id: ${1c9b04e3-0ece-32d7-ad3a-58e314efeff3}
	@Test()
	void debugWhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination != null) : false  #  inside log method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Supplier) null, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog((Supplier) null, linesMock);
			Object object = new Object();
			doNothing().when(linesMock).add((Supplier) null, LogLevel.DEBUG, object, (Throwable) null);
			//Act Statement(s)
			target.debug(object);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull((Supplier) null, "Destination must not be null"), atLeast(1));
				verify(linesMock).add((Supplier) null, LogLevel.DEBUG, object, (Throwable) null);
			});
		}
	}

	//Sapient generated method id: ${4666ac22-b9c9-3096-aa98-98351a259480}
	@Test()
	void debug1WhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination != null) : false  #  inside log method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Supplier) null, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog((Supplier) null, linesMock);
			Object object = new Object();
			Throwable throwable = new Throwable();
			doNothing().when(linesMock).add((Supplier) null, LogLevel.DEBUG, object, throwable);
			//Act Statement(s)
			target.debug(object, throwable);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull((Supplier) null, "Destination must not be null"), atLeast(1));
				verify(linesMock).add((Supplier) null, LogLevel.DEBUG, object, throwable);
			});
		}
	}

	//Sapient generated method id: ${f2723dd9-f618-3af8-a49f-6dca7cc9cfbc}
	@Test()
	void infoWhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination != null) : false  #  inside log method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Supplier) null, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog((Supplier) null, linesMock);
			Object object = new Object();
			doNothing().when(linesMock).add((Supplier) null, LogLevel.INFO, object, (Throwable) null);
			//Act Statement(s)
			target.info(object);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull((Supplier) null, "Destination must not be null"), atLeast(1));
				verify(linesMock).add((Supplier) null, LogLevel.INFO, object, (Throwable) null);
			});
		}
	}

	//Sapient generated method id: ${09453ba3-816c-3492-a727-3a0b4afde2b2}
	@Test()
	void info1WhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination != null) : false  #  inside log method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Supplier) null, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog((Supplier) null, linesMock);
			Object object = new Object();
			Throwable throwable = new Throwable();
			doNothing().when(linesMock).add((Supplier) null, LogLevel.INFO, object, throwable);
			//Act Statement(s)
			target.info(object, throwable);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull((Supplier) null, "Destination must not be null"), atLeast(1));
				verify(linesMock).add((Supplier) null, LogLevel.INFO, object, throwable);
			});
		}
	}

	//Sapient generated method id: ${c099205a-fe5f-35fc-8675-fe9bb181cb53}
	@Test()
	void warnWhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination != null) : false  #  inside log method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Supplier) null, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog((Supplier) null, linesMock);
			Object object = new Object();
			doNothing().when(linesMock).add((Supplier) null, LogLevel.WARN, object, (Throwable) null);
			//Act Statement(s)
			target.warn(object);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull((Supplier) null, "Destination must not be null"), atLeast(1));
				verify(linesMock).add((Supplier) null, LogLevel.WARN, object, (Throwable) null);
			});
		}
	}

	//Sapient generated method id: ${517655e9-4270-32f3-baad-442bd4028d8e}
	@Test()
	void warn1WhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination != null) : false  #  inside log method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Supplier) null, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog((Supplier) null, linesMock);
			Object object = new Object();
			Throwable throwable = new Throwable();
			doNothing().when(linesMock).add((Supplier) null, LogLevel.WARN, object, throwable);
			//Act Statement(s)
			target.warn(object, throwable);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull((Supplier) null, "Destination must not be null"), atLeast(1));
				verify(linesMock).add((Supplier) null, LogLevel.WARN, object, throwable);
			});
		}
	}

	//Sapient generated method id: ${832f0baf-9378-3a09-ac6b-a16cf4e6fb3b}
	@Test()
	void errorWhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination != null) : false  #  inside log method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Supplier) null, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog((Supplier) null, linesMock);
			Object object = new Object();
			doNothing().when(linesMock).add((Supplier) null, LogLevel.ERROR, object, (Throwable) null);
			//Act Statement(s)
			target.error(object);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull((Supplier) null, "Destination must not be null"), atLeast(1));
				verify(linesMock).add((Supplier) null, LogLevel.ERROR, object, (Throwable) null);
			});
		}
	}

	//Sapient generated method id: ${defc2f3a-18f0-3d24-998d-0e3c4538965c}
	@Test()
	void error1WhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination != null) : false  #  inside log method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Supplier) null, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog((Supplier) null, linesMock);
			Object object = new Object();
			Throwable throwable = new Throwable();
			doNothing().when(linesMock).add((Supplier) null, LogLevel.ERROR, object, throwable);
			//Act Statement(s)
			target.error(object, throwable);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull((Supplier) null, "Destination must not be null"), atLeast(1));
				verify(linesMock).add((Supplier) null, LogLevel.ERROR, object, throwable);
			});
		}
	}

	//Sapient generated method id: ${b974fa16-b432-3ad9-b41e-dd4de13b22f1}
	@Test()
	void fatalWhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination != null) : false  #  inside log method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Supplier) null, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog((Supplier) null, linesMock);
			Object object = new Object();
			doNothing().when(linesMock).add((Supplier) null, LogLevel.FATAL, object, (Throwable) null);
			//Act Statement(s)
			target.fatal(object);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull((Supplier) null, "Destination must not be null"), atLeast(1));
				verify(linesMock).add((Supplier) null, LogLevel.FATAL, object, (Throwable) null);
			});
		}
	}

	//Sapient generated method id: ${bfb373d2-87e6-3d54-9017-2e750ab6db64}
	@Test()
	void fatal1WhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination != null) : false  #  inside log method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Supplier) null, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog((Supplier) null, linesMock);
			Object object = new Object();
			Throwable throwable = new Throwable();
			doNothing().when(linesMock).add((Supplier) null, LogLevel.FATAL, object, throwable);
			//Act Statement(s)
			target.fatal(object, throwable);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull((Supplier) null, "Destination must not be null"), atLeast(1));
				verify(linesMock).add((Supplier) null, LogLevel.FATAL, object, throwable);
			});
		}
	}

	//Sapient generated method id: ${f689e48a-2c03-3b04-8b95-98069123fd59}
	@Disabled()
	@Test()
	void switchOverTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Supplier) null, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog((Supplier) null, linesMock);
			//Act Statement(s)
			target.switchOver();
			//Assert statement(s)
			assertAll("result", () -> _assert.verify(() -> Assert.notNull((Supplier) null, "Destination must not be null"), atLeast(1)));
		}
	}

	//Sapient generated method id: ${7273efa5-83c7-3b4e-b3f9-ab0dededf0a8}
	@Test()
	void switchToTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Supplier) null, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = spy(new DeferredLog((Supplier) null, linesMock));
			doNothing().when(target).switchTo((Log) any());
			//Act Statement(s)
			target.switchTo(Object.class);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull((Supplier) null, "Destination must not be null"), atLeast(1));
				verify(target).switchTo((Log) any());
			});
		}
	}

	//Sapient generated method id: ${1df14d76-183e-3f30-a713-efca63a03f88}
	@Test()
	void switchTo1Test() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Supplier) null, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = spy(new DeferredLog((Supplier) null, linesMock));
			doNothing().when(target).replayTo((Log) null);
			//TODO: Needs initialization with real value
			Log log = null;
			//Act Statement(s)
			target.switchTo(log);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull((Supplier) null, "Destination must not be null"), atLeast(1));
				verify(target).replayTo((Log) null);
			});
		}
	}

	//Sapient generated method id: ${64273f49-1302-3bdc-8a53-6951bf0c8e61}
	@Test()
	void replayToTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Supplier) null, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = spy(new DeferredLog((Supplier) null, linesMock));
			doNothing().when(target).replayTo((Log) any());
			//Act Statement(s)
			target.replayTo(Object.class);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull((Supplier) null, "Destination must not be null"), atLeast(1));
				verify(target).replayTo((Log) any());
			});
		}
	}

	//Sapient generated method id: ${f6bfcb9a-f1f4-3863-84af-430c97855194}
	@Disabled()
	@Test()
	void replayTo1WhenThisLinesIsNotEmpty() {
		/* Branches:
		 * (for-each(this.lines)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<DeferredLog> deferredLog = mockStatic(DeferredLog.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Supplier) null, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			Throwable throwable = new Throwable();
			deferredLog.when(() -> DeferredLog.logTo((Log) null, LogLevel.TRACE, object, throwable)).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog((Supplier) null, linesMock);
			doReturn(null).when(linesMock).iterator();
			doNothing().when(linesMock).clear();
			//TODO: Needs initialization with real value
			Log log = null;
			//Act Statement(s)
			target.replayTo(log);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull((Supplier) null, "Destination must not be null"), atLeast(1));
				deferredLog.verify(() -> DeferredLog.logTo((Log) null, LogLevel.TRACE, object, throwable), atLeast(1));
				verify(linesMock).iterator();
				verify(linesMock).clear();
			});
		}
	}

	//Sapient generated method id: ${0be9cf48-2425-3f68-a908-c575cbe78dd3}
	@Test()
	void replayTest() {
		//Arrange Statement(s)
		try (MockedStatic<DeferredLog> deferredLog = mockStatic(DeferredLog.class, CALLS_REAL_METHODS)) {
			//TODO: Needs to return real value
			deferredLog.when(() -> DeferredLog.replay(eq((Log) null), (Log) any())).thenReturn(null);
			Log log = null;
			//Act Statement(s)
			Log result = DeferredLog.replay(log, Object.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				deferredLog.verify(() -> DeferredLog.replay(eq((Log) null), (Log) any()), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${ab52b13f-ea9a-39f2-9f2c-3f51dd101d38}
	@Test()
	void replay1WhenSourceInstanceOfDeferredLog() {
		/* Branches:
		 * (source instanceof DeferredLog deferredLog) : true
		 */
		//Arrange Statement(s)
		DeferredLog deferredLogMock = mock(DeferredLog.class);
		doNothing().when(deferredLogMock).replayTo((Log) null);
		//TODO: Needs initialization with real value
		Log log = null;
		//Act Statement(s)
		Log result = DeferredLog.replay((Log) deferredLogMock, log);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(log));
			verify(deferredLogMock).replayTo((Log) null);
		});
	}

	//Sapient generated method id: ${4f876090-7925-36bd-81b7-a509d83d96f7}
	@Test()
	void logToWhenSwitchLevelCaseDEBUG() {
		/* Branches:
		 * (switch(level) = DEBUG) : true
		 */
		//Arrange Statement(s)
		Log log = null;
		Object object = new Object();
		Throwable throwable = new Throwable();
		//Act Statement(s)
		final NullPointerException result = assertThrows(NullPointerException.class, () -> {
			DeferredLog.logTo(log, LogLevel.DEBUG, object, throwable);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${708f838f-0547-3e4c-9bb7-e8bd2d6bea6e}
	@Test()
	void logToWhenSwitchLevelCaseERROR() {
		/* Branches:
		 * (switch(level) = ERROR) : true
		 */
		//Arrange Statement(s)
		Log log = null;
		Object object = new Object();
		Throwable throwable = new Throwable();
		//Act Statement(s)
		final NullPointerException result = assertThrows(NullPointerException.class, () -> {
			DeferredLog.logTo(log, LogLevel.ERROR, object, throwable);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${84dad3ff-7b23-35b5-b46d-c0733d1739f0}
	@Test()
	void logToWhenSwitchLevelCaseFATAL() {
		/* Branches:
		 * (switch(level) = FATAL) : true
		 */
		//Arrange Statement(s)
		Log log = null;
		Object object = new Object();
		Throwable throwable = new Throwable();
		//Act Statement(s)
		final NullPointerException result = assertThrows(NullPointerException.class, () -> {
			DeferredLog.logTo(log, LogLevel.FATAL, object, throwable);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${6617ecb0-4a89-313b-b780-b06cf1280c6b}
	@Test()
	void logToWhenSwitchLevelCaseINFO() {
		/* Branches:
		 * (switch(level) = INFO) : true
		 */
		//Arrange Statement(s)
		Log log = null;
		Object object = new Object();
		Throwable throwable = new Throwable();
		//Act Statement(s)
		final NullPointerException result = assertThrows(NullPointerException.class, () -> {
			DeferredLog.logTo(log, LogLevel.INFO, object, throwable);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${facf1a47-d10b-304b-a49a-f794b0dfdac0}
	@Test()
	void logToWhenSwitchLevelCaseTRACE() {
		/* Branches:
		 * (switch(level) = TRACE) : true
		 */
		//Arrange Statement(s)
		Log log = null;
		Object object = new Object();
		Throwable throwable = new Throwable();
		//Act Statement(s)
		final NullPointerException result = assertThrows(NullPointerException.class, () -> {
			DeferredLog.logTo(log, LogLevel.TRACE, object, throwable);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${dbac2884-a73f-394a-ba84-16e445265c37}
	@Test()
	void logToWhenSwitchLevelCaseWARN() {
		/* Branches:
		 * (switch(level) = WARN) : true
		 */
		//Arrange Statement(s)
		Log log = null;
		Object object = new Object();
		Throwable throwable = new Throwable();
		//Act Statement(s)
		final NullPointerException result = assertThrows(NullPointerException.class, () -> {
			DeferredLog.logTo(log, LogLevel.WARN, object, throwable);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
