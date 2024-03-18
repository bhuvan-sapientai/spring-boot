package org.springframework.boot.web.embedded.jetty;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.eclipse.jetty.util.Index;
import org.eclipse.jetty.ee10.servlet.ServletHandler;
import org.mockito.MockedStatic;
import org.eclipse.jetty.util.security.SecurityUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JettyEmbeddedWebAppContextSapientGeneratedTest {

	//Sapient generated method id: ${bb7e7322-69dc-3699-80f2-fd1325881ca2}, hash: 69CEE7130BA481B80FD8EDFE46159D5F
	@Test()
	void newServletHandlerTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<SecurityUtils> securityUtils = mockStatic(SecurityUtils.class)) {
			Object object = new Object();
			securityUtils.when(() -> SecurityUtils.getSecurityManager()).thenReturn(object);
			JettyEmbeddedWebAppContext target = new JettyEmbeddedWebAppContext();
			//Act Statement(s)
			ServletHandler result = target.newServletHandler();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				securityUtils.verify(() -> SecurityUtils.getSecurityManager(), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${980588bc-b102-3828-a06a-3ba60c107849}, hash: 2CC4297A225EDE943BF342E836E5C744
	@Test()
	void deferredInitializeTest() throws Exception {
		//Act Statement(s)
		//Assert statement(s)
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
		//JettyEmbeddedWebAppContext.JettyEmbeddedServletHandler jettyEmbeddedWebAppContextJettyEmbeddedServletHandlerMock = mock(JettyEmbeddedWebAppContext.JettyEmbeddedServletHandler.class);
		//Object object = new Object();
		//securityUtils.when(() -> SecurityUtils.getSecurityManager()).thenReturn(object);
		//JettyEmbeddedWebAppContext target = spy(new JettyEmbeddedWebAppContext());
		//doReturn(jettyEmbeddedWebAppContextJettyEmbeddedServletHandlerMock).when(target).getServletHandler();
		//target.deferredInitialize();
		//assertAll("result", () -> {    securityUtils.verify(() -> SecurityUtils.getSecurityManager(), atLeast(1));    verify(target).getServletHandler();});
	}
}
