package org.springframework.boot.web.embedded.tomcat;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.apache.catalina.startup.Tomcat;

import org.springframework.boot.web.server.GracefulShutdownCallback;

import static org.mockito.Mockito.mock;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class GracefulShutdownSapientGeneratedTest {

	private final Tomcat tomcatMock = mock(Tomcat.class);

	//Sapient generated method id: ${9c08dd10-71b8-3aa9-89c5-199d2fd9dc82}
	@Disabled(value = "Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void shutDownGracefullyTest() {
		//Arrange Statement(s)
		GracefulShutdown target = new GracefulShutdown(tomcatMock);
		GracefulShutdownCallback gracefulShutdownCallbackMock = mock(GracefulShutdownCallback.class);

		//Act Statement(s)
		target.shutDownGracefully(gracefulShutdownCallbackMock);
	}

	//Sapient generated method id: ${687d067b-27c5-3d9c-8782-7e251c075bb4}
	@Test()
	void abortTest() {
		//Arrange Statement(s)
		GracefulShutdown target = new GracefulShutdown(tomcatMock);

		//Act Statement(s)
		target.abort();
	}
}
