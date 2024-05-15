package org.springframework.boot.logging;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.mockito.stubbing.Answer;
import org.apache.commons.logging.impl.NoOpLog;
import java.util.Iterator;
import org.springframework.util.Assert;
import org.apache.commons.logging.Log;
import java.util.function.Supplier;
import org.mockito.MockedStatic;
import java.util.ArrayList;
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

    private final Supplier supplierMock = mock(Supplier.class);

    //Sapient generated method id: ${isTraceEnabledWhenThisDestinationIsNull}, hash: 42E55E9CF3A06565580D794296D4A4EF
    @Test()
    void isTraceEnabledWhenThisDestinationIsNull() {
        /* Branches:
         * (this.destination == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(supplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DeferredLog target = new DeferredLog(supplierMock, linesMock);
            //Act Statement(s)
            boolean result = target.isTraceEnabled();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                _assert.verify(() -> Assert.notNull(supplierMock, "Destination must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isDebugEnabledWhenThisDestinationIsNull}, hash: 54B5EEBF1EC9F3AAD76F18E0737CE693
    @Test()
    void isDebugEnabledWhenThisDestinationIsNull() {
        /* Branches:
         * (this.destination == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(supplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DeferredLog target = new DeferredLog(supplierMock, linesMock);
            //Act Statement(s)
            boolean result = target.isDebugEnabled();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                _assert.verify(() -> Assert.notNull(supplierMock, "Destination must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isInfoEnabledWhenThisDestinationIsNull}, hash: ECC37057879102D84F23B7615667F4CC
    @Test()
    void isInfoEnabledWhenThisDestinationIsNull() {
        /* Branches:
         * (this.destination == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(supplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DeferredLog target = new DeferredLog(supplierMock, linesMock);
            //Act Statement(s)
            boolean result = target.isInfoEnabled();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                _assert.verify(() -> Assert.notNull(supplierMock, "Destination must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isWarnEnabledWhenThisDestinationIsNull}, hash: BD25B164CD51CAE414B79C597D477E6D
    @Test()
    void isWarnEnabledWhenThisDestinationIsNull() {
        /* Branches:
         * (this.destination == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(supplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DeferredLog target = new DeferredLog(supplierMock, linesMock);
            //Act Statement(s)
            boolean result = target.isWarnEnabled();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                _assert.verify(() -> Assert.notNull(supplierMock, "Destination must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isErrorEnabledWhenThisDestinationIsNull}, hash: A243252F88935A95374B8C661873C3F9
    @Test()
    void isErrorEnabledWhenThisDestinationIsNull() {
        /* Branches:
         * (this.destination == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(supplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DeferredLog target = new DeferredLog(supplierMock, linesMock);
            //Act Statement(s)
            boolean result = target.isErrorEnabled();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                _assert.verify(() -> Assert.notNull(supplierMock, "Destination must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isFatalEnabledWhenThisDestinationIsNull}, hash: 2775D18D9C72E100587F02369086BCEC
    @Test()
    void isFatalEnabledWhenThisDestinationIsNull() {
        /* Branches:
         * (this.destination == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(supplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DeferredLog target = new DeferredLog(supplierMock, linesMock);
            //Act Statement(s)
            boolean result = target.isFatalEnabled();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                _assert.verify(() -> Assert.notNull(supplierMock, "Destination must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${traceWhenThisDestinationIsNull}, hash: 3BA6872BFBCA7A5299270997C05A9D67
    @Test()
    void traceWhenThisDestinationIsNull() {
        /* Branches:
         * (this.destination != null) : false  #  inside log method
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(supplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DeferredLog target = new DeferredLog(supplierMock, linesMock);
            Object object = new Object();
            doNothing().when(linesMock).add(supplierMock, LogLevel.TRACE, object, (Throwable) null);
            //Act Statement(s)
            target.trace(object);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(supplierMock, "Destination must not be null"), atLeast(1));
                verify(linesMock).add(supplierMock, LogLevel.TRACE, object, (Throwable) null);
            });
        }
    }

    //Sapient generated method id: ${trace1WhenThisDestinationIsNull}, hash: F23C002622EA029C4223ABE2ABF9CDAD
    @Test()
    void trace1WhenThisDestinationIsNull() {
        /* Branches:
         * (this.destination != null) : false  #  inside log method
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(supplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DeferredLog target = new DeferredLog(supplierMock, linesMock);
            Object object = new Object();
            Throwable throwable = new Throwable();
            doNothing().when(linesMock).add(supplierMock, LogLevel.TRACE, object, throwable);
            //Act Statement(s)
            target.trace(object, throwable);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(supplierMock, "Destination must not be null"), atLeast(1));
                verify(linesMock).add(supplierMock, LogLevel.TRACE, object, throwable);
            });
        }
    }

    //Sapient generated method id: ${debugWhenThisDestinationIsNull}, hash: 795C88F40AFCF973E04682E941535489
    @Test()
    void debugWhenThisDestinationIsNull() {
        /* Branches:
         * (this.destination != null) : false  #  inside log method
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(supplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DeferredLog target = new DeferredLog(supplierMock, linesMock);
            Object object = new Object();
            doNothing().when(linesMock).add(supplierMock, LogLevel.DEBUG, object, (Throwable) null);
            //Act Statement(s)
            target.debug(object);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(supplierMock, "Destination must not be null"), atLeast(1));
                verify(linesMock).add(supplierMock, LogLevel.DEBUG, object, (Throwable) null);
            });
        }
    }

    //Sapient generated method id: ${debug1WhenThisDestinationIsNull}, hash: 77817BE8B3A623A8B60D6B738F6DD0E7
    @Test()
    void debug1WhenThisDestinationIsNull() {
        /* Branches:
         * (this.destination != null) : false  #  inside log method
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(supplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DeferredLog target = new DeferredLog(supplierMock, linesMock);
            Object object = new Object();
            Throwable throwable = new Throwable();
            doNothing().when(linesMock).add(supplierMock, LogLevel.DEBUG, object, throwable);
            //Act Statement(s)
            target.debug(object, throwable);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(supplierMock, "Destination must not be null"), atLeast(1));
                verify(linesMock).add(supplierMock, LogLevel.DEBUG, object, throwable);
            });
        }
    }

    //Sapient generated method id: ${infoWhenThisDestinationIsNull}, hash: BECCB17907938B84D56E14F201F76033
    @Test()
    void infoWhenThisDestinationIsNull() {
        /* Branches:
         * (this.destination != null) : false  #  inside log method
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(supplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DeferredLog target = new DeferredLog(supplierMock, linesMock);
            Object object = new Object();
            doNothing().when(linesMock).add(supplierMock, LogLevel.INFO, object, (Throwable) null);
            //Act Statement(s)
            target.info(object);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(supplierMock, "Destination must not be null"), atLeast(1));
                verify(linesMock).add(supplierMock, LogLevel.INFO, object, (Throwable) null);
            });
        }
    }

    //Sapient generated method id: ${info1WhenThisDestinationIsNull}, hash: 4CEDDFCD81B84A277EC6C5DE7A730455
    @Test()
    void info1WhenThisDestinationIsNull() {
        /* Branches:
         * (this.destination != null) : false  #  inside log method
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(supplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DeferredLog target = new DeferredLog(supplierMock, linesMock);
            Object object = new Object();
            Throwable throwable = new Throwable();
            doNothing().when(linesMock).add(supplierMock, LogLevel.INFO, object, throwable);
            //Act Statement(s)
            target.info(object, throwable);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(supplierMock, "Destination must not be null"), atLeast(1));
                verify(linesMock).add(supplierMock, LogLevel.INFO, object, throwable);
            });
        }
    }

    //Sapient generated method id: ${warnWhenThisDestinationIsNull}, hash: 952EEE8222541F8CB7BFAB5471CBB981
    @Test()
    void warnWhenThisDestinationIsNull() {
        /* Branches:
         * (this.destination != null) : false  #  inside log method
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(supplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DeferredLog target = new DeferredLog(supplierMock, linesMock);
            Object object = new Object();
            doNothing().when(linesMock).add(supplierMock, LogLevel.WARN, object, (Throwable) null);
            //Act Statement(s)
            target.warn(object);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(supplierMock, "Destination must not be null"), atLeast(1));
                verify(linesMock).add(supplierMock, LogLevel.WARN, object, (Throwable) null);
            });
        }
    }

    //Sapient generated method id: ${warn1WhenThisDestinationIsNull}, hash: 28AEAC84A04FE2449545DB00A3CBA4D9
    @Test()
    void warn1WhenThisDestinationIsNull() {
        /* Branches:
         * (this.destination != null) : false  #  inside log method
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(supplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DeferredLog target = new DeferredLog(supplierMock, linesMock);
            Object object = new Object();
            Throwable throwable = new Throwable();
            doNothing().when(linesMock).add(supplierMock, LogLevel.WARN, object, throwable);
            //Act Statement(s)
            target.warn(object, throwable);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(supplierMock, "Destination must not be null"), atLeast(1));
                verify(linesMock).add(supplierMock, LogLevel.WARN, object, throwable);
            });
        }
    }

    //Sapient generated method id: ${errorWhenThisDestinationIsNull}, hash: 9CC375EB963A1B0E375355CFC50EC79C
    @Test()
    void errorWhenThisDestinationIsNull() {
        /* Branches:
         * (this.destination != null) : false  #  inside log method
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(supplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DeferredLog target = new DeferredLog(supplierMock, linesMock);
            Object object = new Object();
            doNothing().when(linesMock).add(supplierMock, LogLevel.ERROR, object, (Throwable) null);
            //Act Statement(s)
            target.error(object);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(supplierMock, "Destination must not be null"), atLeast(1));
                verify(linesMock).add(supplierMock, LogLevel.ERROR, object, (Throwable) null);
            });
        }
    }

    //Sapient generated method id: ${error1WhenThisDestinationIsNull}, hash: 910F2EEAFA99746BF38F21C2717E765D
    @Test()
    void error1WhenThisDestinationIsNull() {
        /* Branches:
         * (this.destination != null) : false  #  inside log method
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(supplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DeferredLog target = new DeferredLog(supplierMock, linesMock);
            Object object = new Object();
            Throwable throwable = new Throwable();
            doNothing().when(linesMock).add(supplierMock, LogLevel.ERROR, object, throwable);
            //Act Statement(s)
            target.error(object, throwable);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(supplierMock, "Destination must not be null"), atLeast(1));
                verify(linesMock).add(supplierMock, LogLevel.ERROR, object, throwable);
            });
        }
    }

    //Sapient generated method id: ${fatalWhenThisDestinationIsNull}, hash: 47940E3AC5AB6B055826D7889B867A17
    @Test()
    void fatalWhenThisDestinationIsNull() {
        /* Branches:
         * (this.destination != null) : false  #  inside log method
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(supplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DeferredLog target = new DeferredLog(supplierMock, linesMock);
            Object object = new Object();
            doNothing().when(linesMock).add(supplierMock, LogLevel.FATAL, object, (Throwable) null);
            //Act Statement(s)
            target.fatal(object);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(supplierMock, "Destination must not be null"), atLeast(1));
                verify(linesMock).add(supplierMock, LogLevel.FATAL, object, (Throwable) null);
            });
        }
    }

    //Sapient generated method id: ${fatal1WhenThisDestinationIsNull}, hash: 60B35E78434E18E23DBD5233CBD60A06
    @Test()
    void fatal1WhenThisDestinationIsNull() {
        /* Branches:
         * (this.destination != null) : false  #  inside log method
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(supplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DeferredLog target = new DeferredLog(supplierMock, linesMock);
            Object object = new Object();
            Throwable throwable = new Throwable();
            doNothing().when(linesMock).add(supplierMock, LogLevel.FATAL, object, throwable);
            //Act Statement(s)
            target.fatal(object, throwable);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(supplierMock, "Destination must not be null"), atLeast(1));
                verify(linesMock).add(supplierMock, LogLevel.FATAL, object, throwable);
            });
        }
    }

    //Sapient generated method id: ${switchOverTest}, hash: 471E50EB614876FC770DF2330C6E2985
    @Test()
    void switchOverTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(supplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DeferredLog target = new DeferredLog(supplierMock, linesMock);
            //Act Statement(s)
            target.switchOver();
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.notNull(supplierMock, "Destination must not be null"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${switchToTest}, hash: 923AEC25C210AD6AC622BB390B56D9F1
    @Test()
    void switchToTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(supplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DeferredLog target = spy(new DeferredLog(supplierMock, linesMock));
            doNothing().when(target).switchTo((Log) any());
            //Act Statement(s)
            target.switchTo(Object.class);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(supplierMock, "Destination must not be null"), atLeast(1));
                verify(target).switchTo((Log) any());
            });
        }
    }

    //Sapient generated method id: ${switchTo1Test}, hash: 2D3425C733B66B07D5F2CE424397A818
    @Test()
    void switchTo1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(supplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DeferredLog target = spy(new DeferredLog(supplierMock, linesMock));
            NoOpLog noOpLog = new NoOpLog();
            doNothing().when(target).replayTo(noOpLog);
            //Act Statement(s)
            target.switchTo(noOpLog);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(supplierMock, "Destination must not be null"), atLeast(1));
                verify(target).replayTo(noOpLog);
            });
        }
    }

    //Sapient generated method id: ${replayToTest}, hash: 44C446988A9B853EA1F2C465AB8AB08A
    @Test()
    void replayToTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(supplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DeferredLog target = spy(new DeferredLog(supplierMock, linesMock));
            doNothing().when(target).replayTo((Log) any());
            //Act Statement(s)
            target.replayTo(Object.class);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(supplierMock, "Destination must not be null"), atLeast(1));
                verify(target).replayTo((Log) any());
            });
        }
    }

    //Sapient generated method id: ${replayTo1WhenThisLinesIsNotEmpty}, hash: 9163BFE1E7CEF649553749697596B7A4
    @Test()
    void replayTo1WhenThisLinesIsNotEmpty() {
        /* Branches:
         * (for-each(this.lines)) : true
         */
        //Arrange Statement(s)
        DeferredLog.Line lineMock = mock(DeferredLog.Line.class);
        try (MockedStatic<DeferredLog> deferredLog = mockStatic(DeferredLog.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(supplierMock, "Destination must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            NoOpLog noOpLog = new NoOpLog();
            Object object = new Object();
            Throwable throwable = new Throwable();
            deferredLog.when(() -> DeferredLog.logTo(noOpLog, LogLevel.TRACE, object, throwable)).thenAnswer((Answer<Void>) invocation -> null);
            DeferredLog target = new DeferredLog(supplierMock, linesMock);
            List<DeferredLog.Line> deferredLogLineList = new ArrayList<>();
            deferredLogLineList.add(lineMock);
            Iterator<DeferredLog.Line> iterator = deferredLogLineList.iterator();
            doReturn(iterator).when(linesMock).iterator();
            doReturn(LogLevel.TRACE).when(lineMock).getLevel();
            doReturn(object).when(lineMock).getMessage();
            doReturn(throwable).when(lineMock).getThrowable();
            doNothing().when(linesMock).clear();
            //Act Statement(s)
            target.replayTo((Log) noOpLog);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(supplierMock, "Destination must not be null"), atLeast(1));
                deferredLog.verify(() -> DeferredLog.logTo(noOpLog, LogLevel.TRACE, object, throwable), atLeast(1));
                verify(linesMock).iterator();
                verify(lineMock).getLevel();
                verify(lineMock).getMessage();
                verify(lineMock).getThrowable();
                verify(linesMock).clear();
            });
        }
    }

    //Sapient generated method id: ${replayTest}, hash: 31CA43CBCA6B90B19A0118812499D427
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

    //Sapient generated method id: ${replay1WhenSourceInstanceOfDeferredLog}, hash: 25E6EF91C7A7CEEE1D96DE034AA13AB0
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

    //Sapient generated method id: ${logToWhenSwitchLevelCaseDEBUG}, hash: 5CF11B9EE6735A2ECCAE7BB0EBD6C505
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

    //Sapient generated method id: ${logToWhenSwitchLevelCaseERROR}, hash: 6A1CD36139E9AFDBA868A3F535438137
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

    //Sapient generated method id: ${logToWhenSwitchLevelCaseFATAL}, hash: 1ED701BDA1B4D3C4AC1C1109D24F3B33
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

    //Sapient generated method id: ${logToWhenSwitchLevelCaseINFO}, hash: FBBB19F83071DA028D5F20194479789E
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

    //Sapient generated method id: ${logToWhenSwitchLevelCaseTRACE}, hash: CAFF7117AE2E1ADC792C16FAABF7A756
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

    //Sapient generated method id: ${logToWhenSwitchLevelCaseWARN}, hash: CBA15EEDAFB94D4CF7D2599CA0AF8685
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
