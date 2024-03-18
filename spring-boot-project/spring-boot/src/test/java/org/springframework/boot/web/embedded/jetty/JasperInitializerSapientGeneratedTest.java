package org.springframework.boot.web.embedded.jetty;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import jakarta.servlet.ServletException;

import org.springframework.util.ClassUtils;

import org.mockito.MockedStatic;
import org.apache.catalina.webresources.TomcatURLStreamHandlerFactory;
import org.eclipse.jetty.ee10.servlet.ServletContextHandler;
import jakarta.servlet.ServletContext;
import org.eclipse.jetty.ee10.webapp.WebAppContext;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JasperInitializerSapientGeneratedTest {

	private final WebAppContext contextMock = mock(WebAppContext.class, "context");

	//Sapient generated method id: ${224afb8b-0a20-3517-9ee1-9f509b9c5870}, hash: CCC44CFC17BCE8962BC50B9D4035F7D5
	@Test()
	void doStartWhenThisInitializerIsNull() throws Exception, ClassNotFoundException, Error {
		/* Branches:
		 * (this.initializer == null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			classUtils.when(() -> ClassUtils.forName("org.eclipse.jetty.apache.jsp.JettyJasperInitializer", null)).thenReturn(Object.class);
			WebAppContext webAppContext = new WebAppContext();
			JasperInitializer target = new JasperInitializer(webAppContext);
			//Act Statement(s)
			target.doStart();
			//Assert statement(s)
			assertAll("result", () -> classUtils.verify(() -> ClassUtils.forName("org.eclipse.jetty.apache.jsp.JettyJasperInitializer", null), atLeast(1)));
		}
	}

	//Sapient generated method id: ${900a33c3-798a-3566-95c7-ae71a17e071c}, hash: D4C3FD64FE4588CDDE3A366B2125D3FB
	@Disabled()
	@Test()
	void doStartWhenClassUtilsIsPresentOrg_apache_catalina_webresources_TomcatURLStreamHandlerFactoryGetClassGetClassLoader() throws Exception, ServletException, ClassNotFoundException, Error {
		/* Branches:
		 * (this.initializer == null) : false
		 * (ClassUtils.isPresent("org.apache.catalina.webresources.TomcatURLStreamHandlerFactory", getClass().getClassLoader())) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type Thread, initializer
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ServletContextHandler.ServletScopedContext servletContextHandlerServletScopedContextMock = mock(ServletContextHandler.ServletScopedContext.class);
		ServletContext servletContextMock = mock(ServletContext.class);
		ServletContextHandler.ServletScopedContext servletContextHandlerServletScopedContextMock2 = mock(ServletContextHandler.ServletScopedContext.class);
		try (MockedStatic<TomcatURLStreamHandlerFactory> tomcatURLStreamHandlerFactory = mockStatic(TomcatURLStreamHandlerFactory.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			classUtils.when(() -> ClassUtils.forName("org.eclipse.jetty.apache.jsp.JettyJasperInitializer", null)).thenReturn(Object.class);
			classUtils.when(() -> ClassUtils.isPresent(eq("org.apache.catalina.webresources.TomcatURLStreamHandlerFactory"), (ClassLoader) any())).thenReturn(true);
			tomcatURLStreamHandlerFactory.when(() -> TomcatURLStreamHandlerFactory.register()).thenReturn(true);
			JasperInitializer target = new JasperInitializer(contextMock);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader).when(contextMock).getClassLoader();
			doNothing().when(servletContextHandlerServletScopedContextMock).setExtendedListenerTypes(true);
			doReturn(servletContextMock).when(contextMock).getServletContext();
			doReturn(servletContextHandlerServletScopedContextMock, servletContextHandlerServletScopedContextMock2).when(contextMock).getContext();
			doNothing().when(servletContextHandlerServletScopedContextMock2).setExtendedListenerTypes(false);
			//Act Statement(s)
			target.doStart();
			//Assert statement(s)
			assertAll("result", () -> {
				classUtils.verify(() -> ClassUtils.forName("org.eclipse.jetty.apache.jsp.JettyJasperInitializer", null), atLeast(1));
				classUtils.verify(() -> ClassUtils.isPresent(eq("org.apache.catalina.webresources.TomcatURLStreamHandlerFactory"), (ClassLoader) any()));
				tomcatURLStreamHandlerFactory.verify(() -> TomcatURLStreamHandlerFactory.register(), atLeast(1));
				verify(contextMock).getClassLoader();
				verify(contextMock, times(2)).getContext();
				verify(servletContextHandlerServletScopedContextMock).setExtendedListenerTypes(true);
				verify(contextMock).getServletContext();
				verify(servletContextHandlerServletScopedContextMock2).setExtendedListenerTypes(false);
			});
		}
	}

	//Sapient generated method id: ${653dbd2b-9d65-3f24-9f68-fe69ec995709}, hash: 09E9B1749604C83A6CCFBE14084B4485
	@Disabled()
	@Test()
	void doStartWhenCaughtError() throws Exception, ServletException, ClassNotFoundException, Error {
		/* Branches:
		 * (this.initializer == null) : false
		 * (ClassUtils.isPresent("org.apache.catalina.webresources.TomcatURLStreamHandlerFactory", getClass().getClassLoader())) : true
		 * (catch-exception (Error)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: initializer
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			classUtils.when(() -> ClassUtils.forName("org.eclipse.jetty.apache.jsp.JettyJasperInitializer", null)).thenReturn(Object.class);
			classUtils.when(() -> ClassUtils.isPresent(eq("org.apache.catalina.webresources.TomcatURLStreamHandlerFactory"), (ClassLoader) any())).thenReturn(false);
			WebAppContext webAppContext = new WebAppContext();
			JasperInitializer target = new JasperInitializer(webAppContext);
			//Act Statement(s)
			target.doStart();
			//Assert statement(s)
			assertAll("result", () -> {
				classUtils.verify(() -> ClassUtils.forName("org.eclipse.jetty.apache.jsp.JettyJasperInitializer", null), atLeast(1));
				classUtils.verify(() -> ClassUtils.isPresent(eq("org.apache.catalina.webresources.TomcatURLStreamHandlerFactory"), (ClassLoader) any()));
			});
		}
	}
}
