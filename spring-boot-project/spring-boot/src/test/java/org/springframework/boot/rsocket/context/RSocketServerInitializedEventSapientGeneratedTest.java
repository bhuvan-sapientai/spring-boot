package org.springframework.boot.rsocket.context;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.rsocket.server.RSocketServer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class RSocketServerInitializedEventSapientGeneratedTest {

	private final RSocketServer rSocketServerMock = mock(RSocketServer.class);

	//Sapient generated method id: ${dad62bb3-fd95-3604-8db2-2ee8f21df32f}
	@Test()
	void getServerTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		RSocketServerInitializedEvent target = spy(new RSocketServerInitializedEvent(rSocketServerMock));
		RSocketServer rSocketServerMock2 = mock(RSocketServer.class);
		doReturn(rSocketServerMock2).when(target).getSource();
		//Act Statement(s)
		RSocketServer result = target.getServer();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(rSocketServerMock2));
			verify(target).getSource();
		});
	}

	//Sapient generated method id: ${b18e1b7c-5aa2-3b75-96ca-a0f74ce65f85}
	@Test()
	void getSourceTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		RSocketServerInitializedEvent target = new RSocketServerInitializedEvent(rSocketServerMock);
		//Act Statement(s)
		RSocketServer result = target.getSource();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
