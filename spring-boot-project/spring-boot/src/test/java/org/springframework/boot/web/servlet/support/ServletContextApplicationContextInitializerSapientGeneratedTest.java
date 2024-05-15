package org.springframework.boot.web.servlet.support;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.web.context.ConfigurableWebApplicationContext;
import jakarta.servlet.ServletContext;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ServletContextApplicationContextInitializerSapientGeneratedTest {

    private final ServletContext servletContextMock = mock(ServletContext.class, "servletContext");

    //Sapient generated method id: ${initializeWhenThisAddApplicationContextAttribute}, hash: A87B456ED491DA4310F30F34F000C11F
    @Test()
    void initializeWhenThisAddApplicationContextAttribute() {
        /* Branches:
         * (this.addApplicationContextAttribute) : true
         */
         //Arrange Statement(s)
        ConfigurableWebApplicationContext applicationContextMock = mock(ConfigurableWebApplicationContext.class);
        doNothing().when(applicationContextMock).setServletContext(servletContextMock);
        ServletContextApplicationContextInitializer target = new ServletContextApplicationContextInitializer(servletContextMock, true);
        doNothing().when(servletContextMock).setAttribute("org.springframework.web.context.WebApplicationContext.ROOT", applicationContextMock);
        
        //Act Statement(s)
        target.initialize(applicationContextMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(applicationContextMock).setServletContext(servletContextMock);
            verify(servletContextMock).setAttribute("org.springframework.web.context.WebApplicationContext.ROOT", applicationContextMock);
        });
    }
}
