package org.springframework.boot.web.embedded.tomcat;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import org.springframework.boot.web.servlet.ServletContextInitializer;

import java.util.Set;

import jakarta.servlet.ServletContext;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class TomcatStarterSapientGeneratedTest {

	//Sapient generated method id: ${230b48f0-0f60-33d2-a5f0-f4c23bd551d4}
	@Test()
	void onStartupWhenThisInitializersIsNotEmpty() throws Exception {
		/* Branches:
		 * (for-each(this.initializers)) : true
		 */
		//Arrange Statement(s)
		ServletContextInitializer initializerMock = mock(ServletContextInitializer.class);
		ServletContext servletContextMock = mock(ServletContext.class);
		doNothing().when(initializerMock).onStartup(servletContextMock);
		ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] { initializerMock };
		TomcatStarter target = new TomcatStarter(servletContextInitializerArray);
		Set<Class<?>> anySet = new HashSet<>();
		//Act Statement(s)
		target.onStartup(anySet, servletContextMock);
		//Assert statement(s)
		assertAll("result", () -> verify(initializerMock).onStartup(servletContextMock));
	}

	//Sapient generated method id: ${d5c58a45-df78-30a2-848f-e6ef69fe0029}
	@Test()
	void onStartupWhenLoggerIsErrorEnabled() throws Exception {
		/* Branches:
		 * (for-each(this.initializers)) : true
		 * (catch-exception (Exception)) : true
		 * (logger.isErrorEnabled()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ServletContextInitializer servletContextInitializerMock = mock(ServletContextInitializer.class, "ServletContextInitializer[] initializers");
		ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] { servletContextInitializerMock };
		TomcatStarter target = new TomcatStarter(servletContextInitializerArray);
		Set<Class<?>> anySet = new HashSet<>();
		ServletContext servletContextMock = mock(ServletContext.class, "ServletContext servletContext");
		//TODO: read method( target.getStartUpException() ) of your function has limited access, please modify to public access and regenerate test
		target.onStartup(anySet, servletContextMock);
	}
}
