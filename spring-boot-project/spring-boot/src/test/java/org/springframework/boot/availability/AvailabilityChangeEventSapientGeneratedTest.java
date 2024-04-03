package org.springframework.boot.availability;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.context.ApplicationEventPublisher;

import org.mockito.stubbing.Answer;

import org.springframework.core.ResolvableType;
import org.springframework.context.ApplicationContext;
import org.springframework.util.Assert;

import org.mockito.MockedStatic;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class AvailabilityChangeEventSapientGeneratedTest {

	private final AvailabilityState availabilityStateMock = mock(AvailabilityState.class);

	private final ResolvableType resolvableTypeMock = mock(ResolvableType.class);

	//Sapient generated method id: ${ccc44468-b0a5-319f-ae80-41e9abbf402a}, hash: C644ED3D05378BEC0388999964BB8B08
	@Test()
	void getStateTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Method java.lang.System::currentTimeMillis has a unrepeatable behavior
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(availabilityStateMock, "Payload must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			resolvableType.when(() -> ResolvableType.forInstance(availabilityStateMock)).thenReturn(resolvableTypeMock);
			Object object = new Object();
			AvailabilityChangeEvent target = new AvailabilityChangeEvent(object, availabilityStateMock);
			//Act Statement(s)
			AvailabilityState result = target.getState();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(availabilityStateMock));
				_assert.verify(() -> Assert.notNull(availabilityStateMock, "Payload must not be null"), atLeast(1));
				resolvableType.verify(() -> ResolvableType.forInstance(availabilityStateMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${0fdcc628-f655-30f9-a6a4-254974870393}, hash: 9000FDC4231625F8DB9E5E1490B31631
	@Test()
	void getResolvableTypeWhenStateNotInstanceOfEnum() {
		/* Branches:
		 * (state instanceof Enum) : false  #  inside getStateType method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Method java.lang.System::currentTimeMillis has a unrepeatable behavior
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResolvableType resolvableTypeMock2 = mock(ResolvableType.class);
		AvailabilityState availabilityStateMock2 = mock(AvailabilityState.class);
		try (MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(availabilityStateMock, "Payload must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			resolvableType.when(() -> ResolvableType.forInstance(availabilityStateMock)).thenReturn(resolvableTypeMock);
			Class<?>[] classArray = new Class[] { AvailabilityState.class };
			resolvableType.when(() -> ResolvableType.forClassWithGenerics(AvailabilityChangeEvent.class, classArray)).thenReturn(resolvableTypeMock2);
			Object object = new Object();
			AvailabilityChangeEvent target = spy(new AvailabilityChangeEvent(object, availabilityStateMock));
			doReturn(availabilityStateMock2).when(target).getState();
			//Act Statement(s)
			ResolvableType result = target.getResolvableType();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(resolvableTypeMock2));
				_assert.verify(() -> Assert.notNull(availabilityStateMock, "Payload must not be null"), atLeast(1));
				resolvableType.verify(() -> ResolvableType.forInstance(availabilityStateMock), atLeast(1));
				resolvableType.verify(() -> ResolvableType.forClassWithGenerics(AvailabilityChangeEvent.class, classArray), atLeast(1));
				verify(target).getState();
			});
		}
	}

	//Sapient generated method id: ${590cd13f-424c-34cb-95b0-2654fa9768cf}, hash: E508B729381E4779A95698885BF0378E
	@Test()
	void publishTest() {
		//Arrange Statement(s)
		ApplicationContext applicationContextMock = mock(ApplicationContext.class);
		try (MockedStatic<AvailabilityChangeEvent> availabilityChangeEvent = mockStatic(AvailabilityChangeEvent.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(applicationContextMock, "Context must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			availabilityChangeEvent.when(() -> AvailabilityChangeEvent.publish(applicationContextMock, applicationContextMock, availabilityStateMock)).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			AvailabilityChangeEvent.publish(applicationContextMock, availabilityStateMock);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(applicationContextMock, "Context must not be null"), atLeast(1));
				availabilityChangeEvent.verify(() -> AvailabilityChangeEvent.publish(applicationContextMock, applicationContextMock, availabilityStateMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${125fc076-78de-38a4-953e-6a261fd08c0c}, hash: 1740D041D208DD0FEB247FD1F62BA32B
	@Test()
	void publish1Test() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Method java.lang.System::currentTimeMillis has a unrepeatable behavior
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ApplicationEventPublisher publisherMock = mock(ApplicationEventPublisher.class);
		try (MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doNothing().when(publisherMock).publishEvent((AvailabilityChangeEvent) any());
			_assert.when(() -> Assert.notNull(publisherMock, "Publisher must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(availabilityStateMock, "Payload must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			resolvableType.when(() -> ResolvableType.forInstance(availabilityStateMock)).thenReturn(resolvableTypeMock);
			Object object = new Object();
			//Act Statement(s)
			AvailabilityChangeEvent.publish(publisherMock, object, availabilityStateMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(publisherMock).publishEvent((AvailabilityChangeEvent) any());
				_assert.verify(() -> Assert.notNull(publisherMock, "Publisher must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(availabilityStateMock, "Payload must not be null"), atLeast(1));
				resolvableType.verify(() -> ResolvableType.forInstance(availabilityStateMock), atLeast(1));
			});
		}
	}
}
