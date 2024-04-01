package org.springframework.boot.web.context;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.web.server.WebServer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.StringUtils;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ServerPortInfoApplicationContextInitializerSapientGeneratedTest {

	private final WebServerInitializedEvent eventMock = mock(WebServerInitializedEvent.class);

	private final WebServerApplicationContext webServerApplicationContextMock = mock(WebServerApplicationContext.class);

	private final WebServerApplicationContext webServerApplicationContextMock2 = mock(WebServerApplicationContext.class);

	private final WebServer webServerMock = mock(WebServer.class);

	//Sapient generated method id: ${6900b201-d101-33a9-a69b-7a761e98aa93}, hash: 352DBF13AF7E2B03678A7658B0EEC65B
	@Test()
	void initializeTest() {
		//Arrange Statement(s)
		ServerPortInfoApplicationContextInitializer target = new ServerPortInfoApplicationContextInitializer();
		ConfigurableApplicationContext applicationContextMock = mock(ConfigurableApplicationContext.class);
		doNothing().when(applicationContextMock).addApplicationListener(target);
		//Act Statement(s)
		target.initialize(applicationContextMock);
		//Assert statement(s)
		assertAll("result", () -> verify(applicationContextMock).addApplicationListener(target));
	}

	//Sapient generated method id: ${ef0e0ccd-c7bc-384f-b49c-93f0783119c6}, hash: 8103A513038DE1F257718212C2805B03
	@Test()
	void onApplicationEventWhenContextGetParentIsNotNull() {
		/* Branches:
		 * (StringUtils.hasText(name)) : true  #  inside getName method
		 * (context instanceof ConfigurableApplicationContext configurableContext) : false  #  inside setPortProperty method
		 * (context.getParent() != null) : true  #  inside setPortProperty method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		doReturn("A").when(webServerApplicationContextMock).getServerNamespace();
		doReturn(webServerApplicationContextMock, webServerApplicationContextMock2).when(eventMock).getApplicationContext();
		ApplicationContext applicationContextMock = mock(ApplicationContext.class);
		ApplicationContext applicationContextMock2 = mock(ApplicationContext.class);
		doReturn(applicationContextMock, applicationContextMock2).when(webServerApplicationContextMock2).getParent();
		doReturn(webServerMock).when(eventMock).getWebServer();
		doReturn(0).when(webServerMock).getPort();
		ServerPortInfoApplicationContextInitializer target = new ServerPortInfoApplicationContextInitializer();
		//Act Statement(s)
		target.onApplicationEvent(eventMock);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(eventMock, times(2)).getApplicationContext();
			verify(webServerApplicationContextMock).getServerNamespace();
			verify(webServerApplicationContextMock2, times(2)).getParent();
			verify(eventMock).getWebServer();
			verify(webServerMock).getPort();
		});
	}

	//Sapient generated method id: ${260e5019-da26-3687-a292-ad6dbeba8424}, hash: 1FF32088ACF32651794F5744D2C17A9B
	@Test()
	void onApplicationEventWhenContextNotInstanceOfConfigurableApplicationContextAndContextGetParentIsNull() {
		/* Branches:
		 * (StringUtils.hasText(name)) : false  #  inside getName method
		 * (context instanceof ConfigurableApplicationContext configurableContext) : false  #  inside setPortProperty method
		 * (context.getParent() != null) : false  #  inside setPortProperty method
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			doReturn("A").when(webServerApplicationContextMock).getServerNamespace();
			doReturn(webServerApplicationContextMock, webServerApplicationContextMock2).when(eventMock).getApplicationContext();
			doReturn(null).when(webServerApplicationContextMock2).getParent();
			doReturn(webServerMock).when(eventMock).getWebServer();
			doReturn(0).when(webServerMock).getPort();
			stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
			ServerPortInfoApplicationContextInitializer target = new ServerPortInfoApplicationContextInitializer();
			//Act Statement(s)
			target.onApplicationEvent(eventMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(eventMock, times(2)).getApplicationContext();
				verify(webServerApplicationContextMock).getServerNamespace();
				verify(webServerApplicationContextMock2).getParent();
				verify(eventMock).getWebServer();
				verify(webServerMock).getPort();
				stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
			});
		}
	}
}
