package org.springframework.boot.web.servlet.context;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.web.server.WebServerException;
import org.springframework.boot.web.server.WebServer;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class WebServerStartStopLifecycleSapientGeneratedTest {

	private final WebServer webServerMock = mock(WebServer.class, "webServer");

	private final ServletWebServerApplicationContext applicationContextMock = mock(ServletWebServerApplicationContext.class, "applicationContext");

	//Sapient generated method id: ${a9331398-240e-36aa-9522-b3dc4bcf14ad}, hash: A2601A7F4C00935A36AB548964FA4EF5
	@Test()
	void startTest() throws WebServerException {
		//Arrange Statement(s)
		WebServerStartStopLifecycle target = new WebServerStartStopLifecycle(applicationContextMock, webServerMock);
		doNothing().when(webServerMock).start();
		doNothing().when(applicationContextMock).publishEvent((ServletWebServerInitializedEvent) any());

		//Act Statement(s)
		target.start();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(target.isRunning(), equalTo(Boolean.TRUE));
			verify(webServerMock).start();
			verify(applicationContextMock).publishEvent((ServletWebServerInitializedEvent) any());
		});
	}

	//Sapient generated method id: ${097b903c-1cba-3dd3-835e-b09bc597ebca}, hash: 366DB0A905E8EDB66DAE3DC675704AB7
	@Test()
	void stopTest() throws WebServerException {
		//Arrange Statement(s)
		WebServerStartStopLifecycle target = new WebServerStartStopLifecycle(applicationContextMock, webServerMock);
		doNothing().when(webServerMock).stop();

		//Act Statement(s)
		target.stop();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(target.isRunning(), equalTo(Boolean.FALSE));
			verify(webServerMock).stop();
		});
	}

	//Sapient generated method id: ${a13e4cc2-0333-30ea-a37d-5a0469c59d55}, hash: AE11A1B566D7C377EAB70472FA569264
	@Test()
	void getPhaseTest() {
		//Arrange Statement(s)
		WebServerStartStopLifecycle target = new WebServerStartStopLifecycle(applicationContextMock, webServerMock);

		//Act Statement(s)
		int result = target.getPhase();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(2147481599)));
	}
}
