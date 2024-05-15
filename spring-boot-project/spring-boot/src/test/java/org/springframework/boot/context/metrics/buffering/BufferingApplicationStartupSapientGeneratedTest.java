package org.springframework.boot.context.metrics.buffering;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.core.metrics.StartupStep;
import java.time.Clock;
import java.time.Instant;
import java.util.function.Predicate;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BufferingApplicationStartupSapientGeneratedTest {

    private final Clock clockMock = mock(Clock.class, "clock");

    //Sapient generated method id: ${startRecordingTest}, hash: 7DD4793AE719D39EEE004EF6C4ECA599
    @Test()
    void startRecordingTest() {
        //Arrange Statement(s)
        Instant instant = Instant.ofEpochSecond(1700000000);
        BufferingApplicationStartup target = new BufferingApplicationStartup(0, clockMock);
        Instant instant2 = Instant.ofEpochSecond(1700000000);
        doReturn(instant, instant2).when(clockMock).instant();
        //Act Statement(s)
        target.startRecording();
        //Assert statement(s)
        assertAll("result", () -> verify(clockMock, times(2)).instant());
    }

    //Sapient generated method id: ${addFilterTest}, hash: 5731DB6F27BC3463002567ABC685DBE1
    @Test()
    void addFilterTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Instant instant = Instant.ofEpochSecond(1700000000);
        doReturn(instant).when(clockMock).instant();
        BufferingApplicationStartup target = new BufferingApplicationStartup(0, clockMock);
        Predicate predicateMock = mock(Predicate.class);
        //Act Statement(s)
        target.addFilter(predicateMock);
        //Assert statement(s)
        assertAll("result", () -> verify(clockMock).instant());
    }

    //Sapient generated method id: ${startWhenThisCurrentCompareAndSetCurrentNext}, hash: ABFD00CD6CE1C1B1E65D6A1980752BD7
    @Test()
    void startWhenThisCurrentCompareAndSetCurrentNext() {
        /* Branches:
         * (step != null) : false  #  inside getLatestActive method
         * (this.current.compareAndSet(current, next)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: current - Method: compareAndSet
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Instant instant = Instant.ofEpochSecond(1700000000);
        BufferingApplicationStartup target = new BufferingApplicationStartup(0, clockMock);
        Instant instant2 = Instant.ofEpochSecond(1700000000);
        doReturn(instant, instant2).when(clockMock).instant();
        //Act Statement(s)
        StartupStep result = target.start("name1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(clockMock, times(2)).instant();
        });
    }

    //Sapient generated method id: ${startWhenThisCurrentNotCompareAndSetCurrentNext}, hash: 8A9B68718A850A610DB246788B5C1402
    @Test()
    void startWhenThisCurrentNotCompareAndSetCurrentNext() {
        /* Branches:
         * (step != null) : false  #  inside getLatestActive method
         * (this.current.compareAndSet(current, next)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: current - Method: compareAndSet
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Instant instant = Instant.ofEpochSecond(1700000000);
        BufferingApplicationStartup target = new BufferingApplicationStartup(0, clockMock);
        Instant instant2 = Instant.ofEpochSecond(1700000000);
        doReturn(instant, instant2).when(clockMock).instant();
        //Act Statement(s)
        StartupStep result = target.start("name1");
        //Assert statement(s)
        assertAll("result", () -> verify(clockMock, times(2)).instant());
    }

    //Sapient generated method id: ${getBufferedTimelineTest}, hash: EA8FCCC1CDA8F5C456791CACC19B36EA
    @Test()
    void getBufferedTimelineTest() {
        //Arrange Statement(s)
        Instant instant = Instant.ofEpochSecond(1700000000);
        doReturn(instant).when(clockMock).instant();
        BufferingApplicationStartup target = new BufferingApplicationStartup(0, clockMock);
        //Act Statement(s)
        StartupTimeline result = target.getBufferedTimeline();
        //Assert statement(s)
        //TODO: Please implement equals method in StartupTimeline for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(clockMock).instant();
        });
    }

    //Sapient generated method id: ${drainBufferedTimelineWhenIteratorNotHasNext}, hash: 20C368AF161DE141749C38D7C350A74B
    @Test()
    void drainBufferedTimelineWhenIteratorNotHasNext() {
        /* Branches:
         * (iterator.hasNext()) : false
         */
        //Arrange Statement(s)
        Instant instant = Instant.ofEpochSecond(1700000000);
        doReturn(instant).when(clockMock).instant();
        BufferingApplicationStartup target = new BufferingApplicationStartup(0, clockMock);
        //Act Statement(s)
        StartupTimeline result = target.drainBufferedTimeline();
        //Assert statement(s)
        //TODO: Please implement equals method in StartupTimeline for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(clockMock).instant();
        });
    }
}
