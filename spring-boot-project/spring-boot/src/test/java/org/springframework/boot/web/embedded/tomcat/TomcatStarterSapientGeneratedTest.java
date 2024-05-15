package org.springframework.boot.web.embedded.tomcat;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import java.util.Set;
import jakarta.servlet.ServletContext;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class TomcatStarterSapientGeneratedTest {

    private final ServletContextInitializer initializerMock = mock(ServletContextInitializer.class);

    private final ServletContext servletContextMock = mock(ServletContext.class);

    //Sapient generated method id: ${onStartupWhenThisInitializersIsNotEmpty}, hash: BBE58FE7CD6A6EF80EBEB31942BD405F
    @Test()
    void onStartupWhenThisInitializersIsNotEmpty() throws Exception {
        /* Branches:
         * (for-each(this.initializers)) : true
         */
         //Arrange Statement(s)
        doNothing().when(initializerMock).onStartup(servletContextMock);
        ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] { initializerMock };
        TomcatStarter target = new TomcatStarter(servletContextInitializerArray);
        Set<Class<?>> anySet = new HashSet<>();
        
        //Act Statement(s)
        target.onStartup(anySet, servletContextMock);
        
        //Assert statement(s)
        assertAll("result", () -> verify(initializerMock).onStartup(servletContextMock));
    }

    //Sapient generated method id: ${onStartupWhenLoggerIsErrorEnabled}, hash: 323CD6B8080C10C02048835B24C67DC7
    @Test()
    void onStartupWhenLoggerIsErrorEnabled() throws Exception {
        /* Branches:
         * (for-each(this.initializers)) : true
         * (catch-exception (Exception)) : true
         * (logger.isErrorEnabled()) : true
         */
         //Arrange Statement(s)
        RuntimeException runtimeException = new RuntimeException("A");
        doThrow(runtimeException).when(initializerMock).onStartup(servletContextMock);
        ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] { initializerMock };
        TomcatStarter target = new TomcatStarter(servletContextInitializerArray);
        Set<Class<?>> anySet = new HashSet<>();
        //TODO: read method( target.getStartUpException() ) of your function has limited access, please modify to public access and regenerate test
        target.onStartup(anySet, servletContextMock);
        
        //Assert statement(s)
        assertAll("result", () -> verify(initializerMock).onStartup(servletContextMock));
    }
}
