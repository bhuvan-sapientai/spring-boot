package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.util.ClassUtils;
import org.mockito.MockedStatic;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class WebApplicationTypeSapientGeneratedTest {

    //Sapient generated method id: ${deduceFromClasspathWhenClassUtilsNotIsPresentJERSEY_INDICATOR_CLASSNull}, hash: B43C0115B2BB3FD11B8692D3875CA4DB
    @Test()
    void deduceFromClasspathWhenClassUtilsNotIsPresentJERSEY_INDICATOR_CLASSNull() {
        /* Branches:
         * (ClassUtils.isPresent(WEBFLUX_INDICATOR_CLASS, null)) : true
         * (!ClassUtils.isPresent(WEBMVC_INDICATOR_CLASS, null)) : true
         * (!ClassUtils.isPresent(JERSEY_INDICATOR_CLASS, null)) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            classUtils.when(() -> ClassUtils.isPresent("org.springframework.web.reactive.DispatcherHandler", null)).thenReturn(true);
            classUtils.when(() -> ClassUtils.isPresent("org.springframework.web.servlet.DispatcherServlet", null)).thenReturn(false);
            classUtils.when(() -> ClassUtils.isPresent("org.glassfish.jersey.servlet.ServletContainer", null)).thenReturn(false);
            //Act Statement(s)
            WebApplicationType result = WebApplicationType.deduceFromClasspath();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(WebApplicationType.REACTIVE));
                classUtils.verify(() -> ClassUtils.isPresent("org.springframework.web.reactive.DispatcherHandler", null), atLeast(1));
                classUtils.verify(() -> ClassUtils.isPresent("org.springframework.web.servlet.DispatcherServlet", null), atLeast(1));
                classUtils.verify(() -> ClassUtils.isPresent("org.glassfish.jersey.servlet.ServletContainer", null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${deduceFromClasspathWhenClassUtilsIsPresentJERSEY_INDICATOR_CLASSNullAndSERVLET_INDICATOR_CLASSESIsNotEmptyAndClassUtils}, hash: FFF56B30826F69883080D73B35F3916F
    @Test()
    void deduceFromClasspathWhenClassUtilsIsPresentJERSEY_INDICATOR_CLASSNullAndSERVLET_INDICATOR_CLASSESIsNotEmptyAndClassUtils() {
        /* Branches:
         * (ClassUtils.isPresent(WEBFLUX_INDICATOR_CLASS, null)) : true
         * (!ClassUtils.isPresent(WEBMVC_INDICATOR_CLASS, null)) : true
         * (!ClassUtils.isPresent(JERSEY_INDICATOR_CLASS, null)) : false
         * (for-each(SERVLET_INDICATOR_CLASSES)) : true
         * (!ClassUtils.isPresent(className, null)) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            classUtils.when(() -> ClassUtils.isPresent("org.springframework.web.reactive.DispatcherHandler", null)).thenReturn(true);
            classUtils.when(() -> ClassUtils.isPresent("org.springframework.web.servlet.DispatcherServlet", null)).thenReturn(false);
            classUtils.when(() -> ClassUtils.isPresent("org.glassfish.jersey.servlet.ServletContainer", null)).thenReturn(true);
            classUtils.when(() -> ClassUtils.isPresent("jakarta.servlet.Servlet", null)).thenReturn(false);
            //Act Statement(s)
            WebApplicationType result = WebApplicationType.deduceFromClasspath();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(WebApplicationType.NONE));
                classUtils.verify(() -> ClassUtils.isPresent("org.springframework.web.reactive.DispatcherHandler", null), atLeast(1));
                classUtils.verify(() -> ClassUtils.isPresent("org.springframework.web.servlet.DispatcherServlet", null), atLeast(1));
                classUtils.verify(() -> ClassUtils.isPresent("org.glassfish.jersey.servlet.ServletContainer", null), atLeast(1));
                classUtils.verify(() -> ClassUtils.isPresent("jakarta.servlet.Servlet", null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${deduceFromClasspathWhenSERVLET_INDICATOR_CLASSESIsNotEmptyAndClassUtilsIsPresentClassNameNull2}, hash: 197704DC44B761DF04F255E18EC6D985
    @Test()
    void deduceFromClasspathWhenSERVLET_INDICATOR_CLASSESIsNotEmptyAndClassUtilsIsPresentClassNameNull2() {
        /* Branches:
         * (ClassUtils.isPresent(WEBFLUX_INDICATOR_CLASS, null)) : true
         * (!ClassUtils.isPresent(WEBMVC_INDICATOR_CLASS, null)) : true
         * (!ClassUtils.isPresent(JERSEY_INDICATOR_CLASS, null)) : false
         * (for-each(SERVLET_INDICATOR_CLASSES)) : true
         * (!ClassUtils.isPresent(className, null)) : false
         */
         //Arrange Statement(s)
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            classUtils.when(() -> ClassUtils.isPresent("org.springframework.web.reactive.DispatcherHandler", null)).thenReturn(true);
            classUtils.when(() -> ClassUtils.isPresent("org.springframework.web.servlet.DispatcherServlet", null)).thenReturn(false);
            classUtils.when(() -> ClassUtils.isPresent("org.glassfish.jersey.servlet.ServletContainer", null)).thenReturn(true);
            classUtils.when(() -> ClassUtils.isPresent("jakarta.servlet.Servlet", null)).thenReturn(true);
            classUtils.when(() -> ClassUtils.isPresent("org.springframework.web.context.ConfigurableWebApplicationContext", null)).thenReturn(true);
            //Act Statement(s)
            WebApplicationType result = WebApplicationType.deduceFromClasspath();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(WebApplicationType.SERVLET));
                classUtils.verify(() -> ClassUtils.isPresent("org.springframework.web.reactive.DispatcherHandler", null), atLeast(1));
                classUtils.verify(() -> ClassUtils.isPresent("org.springframework.web.servlet.DispatcherServlet", null), atLeast(1));
                classUtils.verify(() -> ClassUtils.isPresent("org.glassfish.jersey.servlet.ServletContainer", null), atLeast(1));
                classUtils.verify(() -> ClassUtils.isPresent("jakarta.servlet.Servlet", null), atLeast(1));
                classUtils.verify(() -> ClassUtils.isPresent("org.springframework.web.context.ConfigurableWebApplicationContext", null), atLeast(1));
            });
        }
    }
}
