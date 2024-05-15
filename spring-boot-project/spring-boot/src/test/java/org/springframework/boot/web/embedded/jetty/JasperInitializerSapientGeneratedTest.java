package org.springframework.boot.web.embedded.jetty;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import jakarta.servlet.ServletException;
import org.springframework.util.ClassUtils;
import jakarta.servlet.ServletContainerInitializer;
import org.mockito.MockedStatic;
import org.apache.catalina.webresources.TomcatURLStreamHandlerFactory;
import org.eclipse.jetty.ee10.servlet.ServletContextHandler;
import jakarta.servlet.ServletContext;
import org.eclipse.jetty.ee10.webapp.WebAppContext;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
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

    private final ServletContainerInitializer initializerMock = mock(ServletContainerInitializer.class, "initializer");

    private final ServletContextHandler.ServletScopedContext servletContextHandlerServletScopedContextMock = mock(ServletContextHandler.ServletScopedContext.class);

    private final ServletContextHandler.ServletScopedContext servletContextHandlerServletScopedContextMock2 = mock(ServletContextHandler.ServletScopedContext.class);

    private final ServletContext servletContextMock = mock(ServletContext.class);

    //Sapient generated method id: ${doStartWhenThisInitializerIsNull}, hash: C2CF0E2589EFB0916FA4C2AA09F90F8A
    @Test()
    void doStartWhenThisInitializerIsNull() throws Exception, ClassNotFoundException, Error {
        /* Branches:
         * (this.initializer == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            classUtils.when(() -> ClassUtils.forName("org.eclipse.jetty.apache.jsp.JettyJasperInitializer", null)).thenReturn(Object.class);
            JasperInitializer target = new JasperInitializer(contextMock);
            //Act Statement(s)
            target.doStart();
            //Assert statement(s)
            assertAll("result", () -> classUtils.verify(() -> ClassUtils.forName("org.eclipse.jetty.apache.jsp.JettyJasperInitializer", null), atLeast(1)));
        }
    }

    //Sapient generated method id: ${doStartWhenClassUtilsIsPresentOrg_apache_catalina_webresources_TomcatURLStreamHandlerFactoryGetClassGetClassLoader}, hash: 0E5E08AC49BB24633C45B7B6448CAF60
    @Disabled()
    @Test()
    void doStartWhenClassUtilsIsPresentOrg_apache_catalina_webresources_TomcatURLStreamHandlerFactoryGetClassGetClassLoader() throws Exception, ServletException, ClassNotFoundException, Error {
        /* Branches:
         * (this.initializer == null) : false
         * (ClassUtils.isPresent("org.apache.catalina.webresources.TomcatURLStreamHandlerFactory", getClass().getClassLoader())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class, CALLS_REAL_METHODS)) {
            classUtils.when(() -> ClassUtils.forName("org.eclipse.jetty.apache.jsp.JettyJasperInitializer", null)).thenReturn(Object.class);
            JasperInitializer target = new JasperInitializer(contextMock);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader).when(contextMock).getClassLoader();
            doNothing().when(servletContextHandlerServletScopedContextMock).setExtendedListenerTypes(true);
            doReturn(servletContextMock).when(contextMock).getServletContext();
            doNothing().when(initializerMock).onStartup(null, servletContextMock);
            doReturn(servletContextHandlerServletScopedContextMock, servletContextHandlerServletScopedContextMock2).when(contextMock).getContext();
            doNothing().when(servletContextHandlerServletScopedContextMock2).setExtendedListenerTypes(false);
            //Act Statement(s)
            target.doStart();
            //Assert statement(s)
            assertAll("result", () -> {
                classUtils.verify(() -> ClassUtils.forName("org.eclipse.jetty.apache.jsp.JettyJasperInitializer", null), atLeast(1));
                verify(contextMock, atLeast(1)).getClassLoader();
                verify(contextMock, times(2)).getContext();
                verify(servletContextHandlerServletScopedContextMock, atLeast(1)).setExtendedListenerTypes(true);
                verify(contextMock, atLeast(1)).getServletContext();
                verify(initializerMock, atLeast(1)).onStartup(null, servletContextMock);
                verify(servletContextHandlerServletScopedContextMock2, atLeast(1)).setExtendedListenerTypes(false);
            });
        }
    }

    //Sapient generated method id: ${doStartWhenCaughtError}, hash: 924D76B03CAC90DB52C3959DCE16DCC8
    @Disabled()
    @Test()
    void doStartWhenCaughtError() throws Exception, ServletException, ClassNotFoundException, Error {
        /* Branches:
         * (this.initializer == null) : false
         * (ClassUtils.isPresent("org.apache.catalina.webresources.TomcatURLStreamHandlerFactory", getClass().getClassLoader())) : true
         * (catch-exception (Error)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class, CALLS_REAL_METHODS)) {
            classUtils.when(() -> ClassUtils.forName("org.eclipse.jetty.apache.jsp.JettyJasperInitializer", null)).thenReturn(Object.class);
            JasperInitializer target = new JasperInitializer(contextMock);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader).when(contextMock).getClassLoader();
            doNothing().when(servletContextHandlerServletScopedContextMock).setExtendedListenerTypes(true);
            doReturn(servletContextMock).when(contextMock).getServletContext();
            doNothing().when(initializerMock).onStartup(null, servletContextMock);
            doReturn(servletContextHandlerServletScopedContextMock, servletContextHandlerServletScopedContextMock2).when(contextMock).getContext();
            doNothing().when(servletContextHandlerServletScopedContextMock2).setExtendedListenerTypes(false);
            //Act Statement(s)
            target.doStart();
            //Assert statement(s)
            assertAll("result", () -> {
                classUtils.verify(() -> ClassUtils.forName("org.eclipse.jetty.apache.jsp.JettyJasperInitializer", null), atLeast(1));
                verify(contextMock, atLeast(1)).getClassLoader();
                verify(contextMock, times(2)).getContext();
                verify(servletContextHandlerServletScopedContextMock, atLeast(1)).setExtendedListenerTypes(true);
                verify(contextMock, atLeast(1)).getServletContext();
                verify(initializerMock, atLeast(1)).onStartup(null, servletContextMock);
                verify(servletContextHandlerServletScopedContextMock2, atLeast(1)).setExtendedListenerTypes(false);
            });
        }
    }
}
