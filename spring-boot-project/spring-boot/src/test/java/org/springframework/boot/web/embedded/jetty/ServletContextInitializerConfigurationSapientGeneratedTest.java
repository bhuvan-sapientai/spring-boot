package org.springframework.boot.web.embedded.jetty;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import jakarta.servlet.ServletException;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.eclipse.jetty.ee10.servlet.ServletContextHandler;
import jakarta.servlet.ServletContext;
import org.springframework.util.Assert;
import org.eclipse.jetty.ee10.webapp.WebAppContext;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ServletContextInitializerConfigurationSapientGeneratedTest {

    //Sapient generated method id: ${configureWhenThisInitializersIsNotEmpty}, hash: 6A1F269AEA3513F60E322D25260D57EB
    @Test()
    void configureWhenThisInitializersIsNotEmpty() throws Exception, ServletException {
        /* Branches:
         * (for-each(this.initializers)) : true  #  inside callInitializers method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        WebAppContext contextMock = mock(WebAppContext.class);
        ServletContextHandler.ServletScopedContext servletContextHandlerServletScopedContextMock = mock(ServletContextHandler.ServletScopedContext.class);
        ServletContext servletContextMock = mock(ServletContext.class);
        ServletContextHandler.ServletScopedContext servletContextHandlerServletScopedContextMock2 = mock(ServletContextHandler.ServletScopedContext.class);
        ServletContextInitializer initializerMock = mock(ServletContextInitializer.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            doReturn(classLoader).when(contextMock).getClassLoader();
            doNothing().when(servletContextHandlerServletScopedContextMock).setExtendedListenerTypes(true);
            doReturn(servletContextMock).when(contextMock).getServletContext();
            doReturn(servletContextHandlerServletScopedContextMock, servletContextHandlerServletScopedContextMock2).when(contextMock).getContext();
            doNothing().when(servletContextHandlerServletScopedContextMock2).setExtendedListenerTypes(false);
            doNothing().when(initializerMock).onStartup(servletContextMock);
            ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] { initializerMock };
            _assert.when(() -> Assert.notNull(servletContextInitializerArray, "Initializers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ServletContextInitializerConfiguration target = new ServletContextInitializerConfiguration(servletContextInitializerArray);
            //Act Statement(s)
            target.configure(contextMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(contextMock).getClassLoader();
                verify(contextMock, times(2)).getContext();
                verify(servletContextHandlerServletScopedContextMock).setExtendedListenerTypes(true);
                verify(contextMock).getServletContext();
                verify(servletContextHandlerServletScopedContextMock2).setExtendedListenerTypes(false);
                verify(initializerMock).onStartup(servletContextMock);
                _assert.verify(() -> Assert.notNull(servletContextInitializerArray, "Initializers must not be null"), atLeast(1));
            });
        }
    }
}
