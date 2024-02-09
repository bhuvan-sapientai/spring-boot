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

	//Sapient generated method id: ${e3bb31ef-1ead-3dee-b01f-6f5ba7465fcc}
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

	//Sapient generated method id: ${7c26bde8-bf2c-314f-8ed3-d48ad5ea891e}
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

	//Sapient generated method id: ${112bbecf-0190-3e60-8da1-80444ba37b7d}
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
