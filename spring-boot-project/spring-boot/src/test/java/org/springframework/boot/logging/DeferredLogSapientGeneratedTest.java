package org.springframework.boot.logging;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.apache.commons.logging.impl.NoOpLog;

import org.springframework.util.Assert;

import org.apache.commons.logging.Log;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DeferredLogSapientGeneratedTest {

	private final DeferredLog.Lines linesMock = mock(DeferredLog.Lines.class, "lines");

	private final Supplier<Log> destinationSupplierMock = mock(Supplier.class, "destinationSupplier");

	//Sapient generated method id: ${48f0489a-949e-310e-8b09-c8b13c532153}, hash: 4857C30D3E149C8256CA93116E442E67
	@Test()
	void isTraceEnabledWhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination == null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog(destinationSupplierMock, linesMock);
			//Act Statement(s)
			boolean result = target.isTraceEnabled();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3cc52b7f-9f34-3e02-a7f7-7a38d6075367}, hash: 95D269AB879A5AA93C7EDE092D840DAF
	@Test()
	void isDebugEnabledWhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination == null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog(destinationSupplierMock, linesMock);
			//Act Statement(s)
			boolean result = target.isDebugEnabled();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${49cab170-1f0c-34c8-a368-a47adcfa2c5f}, hash: 66A135726C94C5A676EEE98554D65A58
	@Test()
	void isInfoEnabledWhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination == null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog(destinationSupplierMock, linesMock);
			//Act Statement(s)
			boolean result = target.isInfoEnabled();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3efb66fc-0bad-39b5-8669-963efa7ca3a4}, hash: 75318F60A8ABDE3FAD79924B3C26136D
	@Test()
	void isWarnEnabledWhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination == null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog(destinationSupplierMock, linesMock);
			//Act Statement(s)
			boolean result = target.isWarnEnabled();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${6938bc83-570e-367c-a2ff-35dee70ccfe9}, hash: 3BE3B113675F02AF6DD764937EF59CEF
	@Test()
	void isErrorEnabledWhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination == null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog(destinationSupplierMock, linesMock);
			//Act Statement(s)
			boolean result = target.isErrorEnabled();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${9d99b9f1-18b9-3a91-a847-bd4452bd32bc}, hash: E6A61BCCA949CB548FBE6C48241A43AD
	@Test()
	void isFatalEnabledWhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination == null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog(destinationSupplierMock, linesMock);
			//Act Statement(s)
			boolean result = target.isFatalEnabled();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${dcef42cb-a44b-3106-8a7e-4af01c729a8a}, hash: 05124971340476321916250304A003CF
	@Test()
	void traceWhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination != null) : false  #  inside log method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog(destinationSupplierMock, linesMock);
			Object object = new Object();
			doNothing().when(linesMock).add(destinationSupplierMock, LogLevel.TRACE, object, (Throwable) null);
			//Act Statement(s)
			target.trace(object);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null"), atLeast(1));
				verify(linesMock).add(destinationSupplierMock, LogLevel.TRACE, object, (Throwable) null);
			});
		}
	}

	//Sapient generated method id: ${282d69a0-70db-398c-8845-b9745ff9739d}, hash: B058D7964121C6E71028EAC855DE78E9
	@Test()
	void trace1WhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination != null) : false  #  inside log method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog(destinationSupplierMock, linesMock);
			Object object = new Object();
			Throwable throwable = new Throwable();
			doNothing().when(linesMock).add(destinationSupplierMock, LogLevel.TRACE, object, throwable);
			//Act Statement(s)
			target.trace(object, throwable);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null"), atLeast(1));
				verify(linesMock).add(destinationSupplierMock, LogLevel.TRACE, object, throwable);
			});
		}
	}

	//Sapient generated method id: ${1c9b04e3-0ece-32d7-ad3a-58e314efeff3}, hash: B4F4812FDFC879E2C8B948DCFA7D5B54
	@Test()
	void debugWhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination != null) : false  #  inside log method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog(destinationSupplierMock, linesMock);
			Object object = new Object();
			doNothing().when(linesMock).add(destinationSupplierMock, LogLevel.DEBUG, object, (Throwable) null);
			//Act Statement(s)
			target.debug(object);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null"), atLeast(1));
				verify(linesMock).add(destinationSupplierMock, LogLevel.DEBUG, object, (Throwable) null);
			});
		}
	}

	//Sapient generated method id: ${4666ac22-b9c9-3096-aa98-98351a259480}, hash: EE2818C657A677C1F1044C355185CE9B
	@Test()
	void debug1WhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination != null) : false  #  inside log method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog(destinationSupplierMock, linesMock);
			Object object = new Object();
			Throwable throwable = new Throwable();
			doNothing().when(linesMock).add(destinationSupplierMock, LogLevel.DEBUG, object, throwable);
			//Act Statement(s)
			target.debug(object, throwable);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null"), atLeast(1));
				verify(linesMock).add(destinationSupplierMock, LogLevel.DEBUG, object, throwable);
			});
		}
	}

	//Sapient generated method id: ${f2723dd9-f618-3af8-a49f-6dca7cc9cfbc}, hash: 01AF02DE6A40168FCF9DFFB5B98BF51A
	@Test()
	void infoWhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination != null) : false  #  inside log method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog(destinationSupplierMock, linesMock);
			Object object = new Object();
			doNothing().when(linesMock).add(destinationSupplierMock, LogLevel.INFO, object, (Throwable) null);
			//Act Statement(s)
			target.info(object);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null"), atLeast(1));
				verify(linesMock).add(destinationSupplierMock, LogLevel.INFO, object, (Throwable) null);
			});
		}
	}

	//Sapient generated method id: ${09453ba3-816c-3492-a727-3a0b4afde2b2}, hash: FB5DBFB52E52FD03383E8CE2DEACAAF0
	@Test()
	void info1WhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination != null) : false  #  inside log method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog(destinationSupplierMock, linesMock);
			Object object = new Object();
			Throwable throwable = new Throwable();
			doNothing().when(linesMock).add(destinationSupplierMock, LogLevel.INFO, object, throwable);
			//Act Statement(s)
			target.info(object, throwable);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null"), atLeast(1));
				verify(linesMock).add(destinationSupplierMock, LogLevel.INFO, object, throwable);
			});
		}
	}

	//Sapient generated method id: ${c099205a-fe5f-35fc-8675-fe9bb181cb53}, hash: 5CB809A9B0E4B1882355B52755EB05E0
	@Test()
	void warnWhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination != null) : false  #  inside log method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog(destinationSupplierMock, linesMock);
			Object object = new Object();
			doNothing().when(linesMock).add(destinationSupplierMock, LogLevel.WARN, object, (Throwable) null);
			//Act Statement(s)
			target.warn(object);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null"), atLeast(1));
				verify(linesMock).add(destinationSupplierMock, LogLevel.WARN, object, (Throwable) null);
			});
		}
	}

	//Sapient generated method id: ${517655e9-4270-32f3-baad-442bd4028d8e}, hash: 4CFD5D3B2F61CE98EFCB1647CA20BFD5
	@Test()
	void warn1WhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination != null) : false  #  inside log method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog(destinationSupplierMock, linesMock);
			Object object = new Object();
			Throwable throwable = new Throwable();
			doNothing().when(linesMock).add(destinationSupplierMock, LogLevel.WARN, object, throwable);
			//Act Statement(s)
			target.warn(object, throwable);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null"), atLeast(1));
				verify(linesMock).add(destinationSupplierMock, LogLevel.WARN, object, throwable);
			});
		}
	}

	//Sapient generated method id: ${832f0baf-9378-3a09-ac6b-a16cf4e6fb3b}, hash: 5DDEFC71DE2EAB0F45BBB3D7463E5BDF
	@Test()
	void errorWhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination != null) : false  #  inside log method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog(destinationSupplierMock, linesMock);
			Object object = new Object();
			doNothing().when(linesMock).add(destinationSupplierMock, LogLevel.ERROR, object, (Throwable) null);
			//Act Statement(s)
			target.error(object);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null"), atLeast(1));
				verify(linesMock).add(destinationSupplierMock, LogLevel.ERROR, object, (Throwable) null);
			});
		}
	}

	//Sapient generated method id: ${defc2f3a-18f0-3d24-998d-0e3c4538965c}, hash: BDF27E9EC6E692D1B0BF2395D29E223D
	@Test()
	void error1WhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination != null) : false  #  inside log method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog(destinationSupplierMock, linesMock);
			Object object = new Object();
			Throwable throwable = new Throwable();
			doNothing().when(linesMock).add(destinationSupplierMock, LogLevel.ERROR, object, throwable);
			//Act Statement(s)
			target.error(object, throwable);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null"), atLeast(1));
				verify(linesMock).add(destinationSupplierMock, LogLevel.ERROR, object, throwable);
			});
		}
	}

	//Sapient generated method id: ${b974fa16-b432-3ad9-b41e-dd4de13b22f1}, hash: 31FB1CE1ED8912F9868C414A6E3E8B26
	@Test()
	void fatalWhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination != null) : false  #  inside log method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog(destinationSupplierMock, linesMock);
			Object object = new Object();
			doNothing().when(linesMock).add(destinationSupplierMock, LogLevel.FATAL, object, (Throwable) null);
			//Act Statement(s)
			target.fatal(object);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null"), atLeast(1));
				verify(linesMock).add(destinationSupplierMock, LogLevel.FATAL, object, (Throwable) null);
			});
		}
	}

	//Sapient generated method id: ${bfb373d2-87e6-3d54-9017-2e750ab6db64}, hash: 09902D901201F8F722BDA3C364C3874A
	@Test()
	void fatal1WhenThisDestinationIsNull() {
		/* Branches:
		 * (this.destination != null) : false  #  inside log method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog(destinationSupplierMock, linesMock);
			Object object = new Object();
			Throwable throwable = new Throwable();
			doNothing().when(linesMock).add(destinationSupplierMock, LogLevel.FATAL, object, throwable);
			//Act Statement(s)
			target.fatal(object, throwable);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null"), atLeast(1));
				verify(linesMock).add(destinationSupplierMock, LogLevel.FATAL, object, throwable);
			});
		}
	}

	//Sapient generated method id: ${f689e48a-2c03-3b04-8b95-98069123fd59}, hash: D0C136F75D0BA56595F8462749332923
	@Test()
	void switchOverTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog(destinationSupplierMock, linesMock);
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(destinationSupplierMock).get();
			//Act Statement(s)
			target.switchOver();
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null"), atLeast(1));
				verify(destinationSupplierMock).get();
			});
		}
	}

	//Sapient generated method id: ${7273efa5-83c7-3b4e-b3f9-ab0dededf0a8}, hash: 7260848A656A69D8B7772E6FD6AEF981
	@Test()
	void switchToTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = spy(new DeferredLog(destinationSupplierMock, linesMock));
			doNothing().when(target).switchTo((Log) any());
			//Act Statement(s)
			target.switchTo(Object.class);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null"), atLeast(1));
				verify(target).switchTo((Log) any());
			});
		}
	}

	//Sapient generated method id: ${1df14d76-183e-3f30-a713-efca63a03f88}, hash: 3F79ECD4BA3EDBCF015E0AEF642D6502
	@Test()
	void switchTo1Test() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = spy(new DeferredLog(destinationSupplierMock, linesMock));
			NoOpLog noOpLog = new NoOpLog();
			doNothing().when(target).replayTo(noOpLog);
			//Act Statement(s)
			target.switchTo(noOpLog);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null"), atLeast(1));
				verify(target).replayTo(noOpLog);
			});
		}
	}

	//Sapient generated method id: ${64273f49-1302-3bdc-8a53-6951bf0c8e61}, hash: 5494E8EBE1430C475F18239814789835
	@Test()
	void replayToTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = spy(new DeferredLog(destinationSupplierMock, linesMock));
			doNothing().when(target).replayTo((Log) any());
			//Act Statement(s)
			target.replayTo(Object.class);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null"), atLeast(1));
				verify(target).replayTo((Log) any());
			});
		}
	}

	//Sapient generated method id: ${f6bfcb9a-f1f4-3863-84af-430c97855194}, hash: 84D3104E45290089693673B29603E839
	@Test()
	void replayTo1WhenThisLinesIsNotEmpty() {
		/* Branches:
		 * (for-each(this.lines)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<DeferredLog> deferredLog = mockStatic(DeferredLog.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			NoOpLog noOpLog = new NoOpLog();
			Object object = new Object();
			Throwable throwable = new Throwable();
			deferredLog.when(() -> DeferredLog.logTo(noOpLog, LogLevel.TRACE, object, throwable)).thenAnswer((Answer<Void>) invocation -> null);
			DeferredLog target = new DeferredLog(destinationSupplierMock, linesMock);
			doReturn(null).when(linesMock).iterator();
			doNothing().when(linesMock).clear();
			//Act Statement(s)
			target.replayTo((Log) noOpLog);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(destinationSupplierMock, "Destination must not be null"), atLeast(1));
				deferredLog.verify(() -> DeferredLog.logTo(noOpLog, LogLevel.TRACE, object, throwable), atLeast(1));
				verify(linesMock).iterator();
				verify(linesMock).clear();
			});
		}
	}

	//Sapient generated method id: ${0be9cf48-2425-3f68-a908-c575cbe78dd3}, hash: 31CA43CBCA6B90B19A0118812499D427
	@Test()
	void replayTest() {
		//Arrange Statement(s)
		try (MockedStatic<DeferredLog> deferredLog = mockStatic(DeferredLog.class, CALLS_REAL_METHODS)) {
			NoOpLog noOpLog = new NoOpLog();
			NoOpLog noOpLog2 = new NoOpLog();
			deferredLog.when(() -> DeferredLog.replay(eq(noOpLog2), (Log) any())).thenReturn(noOpLog);
			//Act Statement(s)
			Log result = DeferredLog.replay((Log) noOpLog2, Object.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(noOpLog));
				deferredLog.verify(() -> DeferredLog.replay(eq(noOpLog2), (Log) any()), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${ab52b13f-ea9a-39f2-9f2c-3f51dd101d38}, hash: 25E6EF91C7A7CEEE1D96DE034AA13AB0
	@Test()
	void replay1WhenSourceInstanceOfDeferredLog() {
		/* Branches:
		 * (source instanceof DeferredLog deferredLog) : true
		 */
		//Arrange Statement(s)
		DeferredLog deferredLogMock = mock(DeferredLog.class);
		NoOpLog noOpLog = new NoOpLog();
		doNothing().when(deferredLogMock).replayTo(noOpLog);

		//Act Statement(s)
		Log result = DeferredLog.replay((Log) deferredLogMock, noOpLog);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(noOpLog));
			verify(deferredLogMock).replayTo(noOpLog);
		});
	}

	//Sapient generated method id: ${4f876090-7925-36bd-81b7-a509d83d96f7}, hash: 5CF11B9EE6735A2ECCAE7BB0EBD6C505
	@Test()
	void logToWhenSwitchLevelCaseDEBUG() {
		/* Branches:
		 * (switch(level) = DEBUG) : true
		 */
		//Arrange Statement(s)
		NoOpLog noOpLog = new NoOpLog();
		Object object = new Object();
		Throwable throwable = new Throwable();

		//Act Statement(s)
		DeferredLog.logTo(noOpLog, LogLevel.DEBUG, object, throwable);
	}

	//Sapient generated method id: ${708f838f-0547-3e4c-9bb7-e8bd2d6bea6e}, hash: 6A1CD36139E9AFDBA868A3F535438137
	@Test()
	void logToWhenSwitchLevelCaseERROR() {
		/* Branches:
		 * (switch(level) = ERROR) : true
		 */
		//Arrange Statement(s)
		NoOpLog noOpLog = new NoOpLog();
		Object object = new Object();
		Throwable throwable = new Throwable();

		//Act Statement(s)
		DeferredLog.logTo(noOpLog, LogLevel.ERROR, object, throwable);
	}

	//Sapient generated method id: ${84dad3ff-7b23-35b5-b46d-c0733d1739f0}, hash: 1ED701BDA1B4D3C4AC1C1109D24F3B33
	@Test()
	void logToWhenSwitchLevelCaseFATAL() {
		/* Branches:
		 * (switch(level) = FATAL) : true
		 */
		//Arrange Statement(s)
		NoOpLog noOpLog = new NoOpLog();
		Object object = new Object();
		Throwable throwable = new Throwable();

		//Act Statement(s)
		DeferredLog.logTo(noOpLog, LogLevel.FATAL, object, throwable);
	}

	//Sapient generated method id: ${6617ecb0-4a89-313b-b780-b06cf1280c6b}, hash: FBBB19F83071DA028D5F20194479789E
	@Test()
	void logToWhenSwitchLevelCaseINFO() {
		/* Branches:
		 * (switch(level) = INFO) : true
		 */
		//Arrange Statement(s)
		NoOpLog noOpLog = new NoOpLog();
		Object object = new Object();
		Throwable throwable = new Throwable();

		//Act Statement(s)
		DeferredLog.logTo(noOpLog, LogLevel.INFO, object, throwable);
	}

	//Sapient generated method id: ${facf1a47-d10b-304b-a49a-f794b0dfdac0}, hash: CAFF7117AE2E1ADC792C16FAABF7A756
	@Test()
	void logToWhenSwitchLevelCaseTRACE() {
		/* Branches:
		 * (switch(level) = TRACE) : true
		 */
		//Arrange Statement(s)
		NoOpLog noOpLog = new NoOpLog();
		Object object = new Object();
		Throwable throwable = new Throwable();

		//Act Statement(s)
		DeferredLog.logTo(noOpLog, LogLevel.TRACE, object, throwable);
	}

	//Sapient generated method id: ${dbac2884-a73f-394a-ba84-16e445265c37}, hash: CBA15EEDAFB94D4CF7D2599CA0AF8685
	@Test()
	void logToWhenSwitchLevelCaseWARN() {
		/* Branches:
		 * (switch(level) = WARN) : true
		 */
		//Arrange Statement(s)
		NoOpLog noOpLog = new NoOpLog();
		Object object = new Object();
		Throwable throwable = new Throwable();

		//Act Statement(s)
		DeferredLog.logTo(noOpLog, LogLevel.WARN, object, throwable);
	}
}
