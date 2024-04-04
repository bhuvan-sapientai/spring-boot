package org.springframework.boot.availability;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.context.ApplicationEventPublisher;

import org.mockito.stubbing.Answer;
import org.apache.commons.logging.impl.NoOpLog;

import org.springframework.util.Assert;

import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ApplicationAvailabilityBeanSapientGeneratedTest {

	private final AvailabilityState availabilityStateMock = mock(AvailabilityState.class);

	private final AvailabilityState availabilityStateMock2 = mock(AvailabilityState.class, "getLogMessage_availabilityState1");

	private final AvailabilityChangeEvent<?> eventMock = mock(AvailabilityChangeEvent.class);

	//Sapient generated method id: ${64152be7-31de-3288-8023-c6b41ffd74a5}, hash: F362FEDCF8BC47C6D17AE307BBD9A88B
	@Test()
	void getStateWhenStateIsNotNull() {
		/* Branches:
		 * (state != null) : true
		 */
		//Arrange Statement(s)
		AvailabilityState availabilityStateMock2 = mock(AvailabilityState.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(AvailabilityState.class, "StateType must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(availabilityStateMock, "DefaultState must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			NoOpLog noOpLog = new NoOpLog();
			ApplicationAvailabilityBean target = spy(new ApplicationAvailabilityBean(noOpLog));
			doReturn(availabilityStateMock2).when(target).getState(AvailabilityState.class);
			//Act Statement(s)
			AvailabilityState result = target.getState(AvailabilityState.class, availabilityStateMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(availabilityStateMock2));
				_assert.verify(() -> Assert.notNull(AvailabilityState.class, "StateType must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(availabilityStateMock, "DefaultState must not be null"), atLeast(1));
				verify(target).getState(AvailabilityState.class);
			});
		}
	}

	//Sapient generated method id: ${b1de45f7-b777-337e-bf3c-50193043ca77}, hash: F582D20042CB81D3825A24FBAF79EF72
	@Test()
	void getStateWhenStateIsNull() {
		/* Branches:
		 * (state != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(AvailabilityState.class, "StateType must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(availabilityStateMock, "DefaultState must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			NoOpLog noOpLog = new NoOpLog();
			ApplicationAvailabilityBean target = spy(new ApplicationAvailabilityBean(noOpLog));
			doReturn(null).when(target).getState(AvailabilityState.class);
			//Act Statement(s)
			AvailabilityState result = target.getState(AvailabilityState.class, availabilityStateMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(availabilityStateMock));
				_assert.verify(() -> Assert.notNull(AvailabilityState.class, "StateType must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(availabilityStateMock, "DefaultState must not be null"), atLeast(1));
				verify(target).getState(AvailabilityState.class);
			});
		}
	}

	//Sapient generated method id: ${3fc968d3-e221-3653-8a32-b058d91d7b3b}, hash: E0E8ECF35948B45E0B784C5B3D75AB3E
	@Test()
	void getState1WhenEventIsNull() {
		/* Branches:
		 * (event != null) : false
		 */
		//Arrange Statement(s)
		NoOpLog noOpLog = new NoOpLog();
		ApplicationAvailabilityBean target = new ApplicationAvailabilityBean(noOpLog);

		//Act Statement(s)
		AvailabilityState result = target.getState(AvailabilityState.class);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${0203bd90-a4c2-3d27-9e68-62d74c87d75d}, hash: 3CB27F591768C75072917F841C5AF797
	@Test()
	void getLastChangeEventTest() {
		//Arrange Statement(s)
		NoOpLog noOpLog = new NoOpLog();
		ApplicationAvailabilityBean target = new ApplicationAvailabilityBean(noOpLog);

		//Act Statement(s)
		AvailabilityChangeEvent result = target.getLastChangeEvent(AvailabilityState.class);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${a4325331-e0b5-3fdc-b8e3-15262fba61d0}, hash: 95B6972D5A8A3E560532B628489FF797
	@Test()
	void onApplicationEventWhenSourceInstanceOfApplicationEventPublisher() {
		/* Branches:
		 * (state instanceof Enum) : false  #  inside getStateType method
		 * (this.logger.isDebugEnabled()) : true
		 * (lastChangeEvent != null) : false  #  inside getLogMessage method
		 * (source == null) : false  #  inside getSourceDescription method
		 * (source instanceof ApplicationEventPublisher) : true  #  inside getSourceDescription method
		 */
		doReturn(availabilityStateMock, availabilityStateMock2).when(eventMock).getState();
		ApplicationEventPublisher applicationEventPublisherMock = mock(ApplicationEventPublisher.class);
		doReturn(applicationEventPublisherMock).when(eventMock).getSource();
		NoOpLog noOpLog = new NoOpLog();
		ApplicationAvailabilityBean target = new ApplicationAvailabilityBean(noOpLog);

		//Act Statement(s)
		target.onApplicationEvent(eventMock);

		//Assert statement(s)
		assertAll("result", () -> {
			verify(eventMock, times(2)).getState();
			verify(eventMock).getSource();
		});
	}

	//Sapient generated method id: ${38a7e1b3-288c-3652-b5a2-ff233cb89830}, hash: 42CF00C5F901DE5BBEC97A8562910EB2
	@Test()
	void onApplicationEventWhenSourceInstanceOfThrowable() {
		/* Branches:
		 * (state instanceof Enum) : false  #  inside getStateType method
		 * (this.logger.isDebugEnabled()) : true
		 * (lastChangeEvent != null) : false  #  inside getLogMessage method
		 * (source == null) : false  #  inside getSourceDescription method
		 * (source instanceof ApplicationEventPublisher) : false  #  inside getSourceDescription method
		 * (source instanceof Throwable) : true  #  inside getSourceDescription method
		 */
		doReturn(availabilityStateMock, availabilityStateMock2).when(eventMock).getState();
		Throwable throwableMock = mock(Throwable.class, "getLogMessage_object1");
		doReturn(throwableMock).when(eventMock).getSource();
		NoOpLog noOpLog = new NoOpLog();
		ApplicationAvailabilityBean target = new ApplicationAvailabilityBean(noOpLog);

		//Act Statement(s)
		target.onApplicationEvent(eventMock);

		//Assert statement(s)
		assertAll("result", () -> {
			verify(eventMock, times(2)).getState();
			verify(eventMock).getSource();
		});
	}

	//Sapient generated method id: ${82df71e9-4a6b-385f-9c85-f2c00a6b9775}, hash: FDE2CE4C81DBE196FD0940E4F9DF829A
	@Test()
	void onApplicationEventWhenSourceNotInstanceOfThrowable() {
		/* Branches:
		 * (state instanceof Enum) : false  #  inside getStateType method
		 * (this.logger.isDebugEnabled()) : true
		 * (lastChangeEvent != null) : false  #  inside getLogMessage method
		 * (source == null) : false  #  inside getSourceDescription method
		 * (source instanceof ApplicationEventPublisher) : false  #  inside getSourceDescription method
		 * (source instanceof Throwable) : false  #  inside getSourceDescription method
		 */
		doReturn(availabilityStateMock, availabilityStateMock2).when(eventMock).getState();
		Object object = new Object();
		doReturn(object).when(eventMock).getSource();
		NoOpLog noOpLog = new NoOpLog();
		ApplicationAvailabilityBean target = new ApplicationAvailabilityBean(noOpLog);

		//Act Statement(s)
		target.onApplicationEvent(eventMock);

		//Assert statement(s)
		assertAll("result", () -> {
			verify(eventMock, times(2)).getState();
			verify(eventMock).getSource();
		});
	}
}
