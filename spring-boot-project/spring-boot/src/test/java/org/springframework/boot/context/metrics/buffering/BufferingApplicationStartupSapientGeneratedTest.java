package org.springframework.boot.context.metrics.buffering;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.time.Clock;
import java.util.function.Predicate;

import org.springframework.core.metrics.StartupStep;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.time.Instant;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BufferingApplicationStartupSapientGeneratedTest {

	//Sapient generated method id: ${1cece066-52ae-3fda-9b18-8c9a43d889bb}
	@Test()
	void startRecordingTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Clock clock = Clock.systemUTC();
		BufferingApplicationStartup target = new BufferingApplicationStartup(0, clock);
		//Act Statement(s)
		target.startRecording();
	}

	//Sapient generated method id: ${afd847a1-cb6d-38f3-acdc-6d34e0a12e24}
	@Disabled()
	@Test()
	void addFilterTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Clock clock = Clock.systemUTC();
		BufferingApplicationStartup target = new BufferingApplicationStartup(0, clock);
		//TODO: Needs initialization with real value
		Predicate predicate = null;
		//Act Statement(s)
		target.addFilter(predicate);
	}

	//Sapient generated method id: ${4c4ffefb-2c2d-34b9-8503-4a8a3903023d}
	@Test()
	void startWhenThisCurrentCompareAndSetCurrentNext() {
		/* Branches:
		 * (step != null) : false  #  inside getLatestActive method
		 * (this.current.compareAndSet(current, next)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Clock clock = Clock.systemUTC();
		BufferingApplicationStartup target = new BufferingApplicationStartup(0, clock);
		//Act Statement(s)
		StartupStep result = target.start("name1");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${53591950-228d-396d-85fa-4b838e47f089}
	@Test()
	void startWhenThisCurrentNotCompareAndSetCurrentNext() {
		/* Branches:
		 * (step != null) : false  #  inside getLatestActive method
		 * (this.current.compareAndSet(current, next)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Clock clock = Clock.systemUTC();
		BufferingApplicationStartup target = new BufferingApplicationStartup(0, clock);
		//Act Statement(s)
		StartupStep result = target.start("name1");
	}

	//Sapient generated method id: ${ecf4868e-c128-31d9-8678-11f99f17d770}
	@Disabled()
	@Test()
	void getBufferedTimelineTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Clock clock = Clock.systemUTC();
		BufferingApplicationStartup target = new BufferingApplicationStartup(0, clock);
		//Act Statement(s)
		StartupTimeline result = target.getBufferedTimeline();
		Instant instant = Instant.ofEpochSecond(1700000000);
		ConcurrentLinkedQueue<StartupTimeline.TimelineEvent> startupTimelineTimelineEventQueue = new ConcurrentLinkedQueue<>();
		ArrayList arrayList = new ArrayList<>(startupTimelineTimelineEventQueue);
		StartupTimeline startupTimeline = new StartupTimeline(instant, arrayList);
		//Assert statement(s)
		//TODO: Please implement equals method in StartupTimeline for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(startupTimeline)));
	}

	//Sapient generated method id: ${fbe41aa6-d048-301d-a7ef-5da40d7b1da8}
	@Disabled()
	@Test()
	void drainBufferedTimelineWhenIteratorNotHasNext() {
		/* Branches:
		 * (iterator.hasNext()) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Clock clock = Clock.systemUTC();
		BufferingApplicationStartup target = new BufferingApplicationStartup(0, clock);
		//Act Statement(s)
		StartupTimeline result = target.drainBufferedTimeline();
		Instant instant = Instant.ofEpochSecond(1700000000);
		List<StartupTimeline.TimelineEvent> startupTimelineTimelineEventList = new ArrayList<>();
		StartupTimeline startupTimeline = new StartupTimeline(instant, startupTimelineTimelineEventList);
		//Assert statement(s)
		//TODO: Please implement equals method in StartupTimeline for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(startupTimeline)));
	}
}
