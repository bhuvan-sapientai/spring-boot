package org.springframework.boot.web.servlet.support;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.web.servlet.ServletRegistrationBean;

import jakarta.servlet.DispatcherType;

import org.springframework.boot.web.servlet.FilterRegistrationBean;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ErrorPageFilterConfigurationSapientGeneratedTest {

	//Sapient generated method id: ${6a20f687-81b0-3ecc-a9e8-96164dc3e36d}
	@Disabled()
	@Test()
	void errorPageFilterTest() {
		//Arrange Statement(s)
		ErrorPageFilterConfiguration target = new ErrorPageFilterConfiguration();
		//Act Statement(s)
		ErrorPageFilter result = target.errorPageFilter();
		ErrorPageFilter errorPageFilter = new ErrorPageFilter();
		//Assert statement(s)
		//TODO: Please implement equals method in ErrorPageFilter for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(errorPageFilter)));
	}

	//Sapient generated method id: ${56f5c141-02c8-30fd-ad49-c46b94a751c2}
	@Disabled()
	@Test()
	void errorPageFilterRegistrationTest() {
		//Arrange Statement(s)
		ErrorPageFilter filterMock = mock(ErrorPageFilter.class);
		doReturn(0).when(filterMock).getOrder();
		ErrorPageFilterConfiguration target = new ErrorPageFilterConfiguration();
		//Act Statement(s)
		FilterRegistrationBean<ErrorPageFilter> result = target.errorPageFilterRegistration(filterMock);
		ServletRegistrationBean[] servletRegistrationBeanArray = new ServletRegistrationBean[] {};
		FilterRegistrationBean<ErrorPageFilter> filterRegistrationBean = new FilterRegistrationBean<>(filterMock, servletRegistrationBeanArray);
		filterRegistrationBean.setDispatcherTypes(DispatcherType.REQUEST);
		filterRegistrationBean.setOrder(0);
		//Assert statement(s)
		//TODO: Please implement equals method in FilterRegistrationBean for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, equalTo(filterRegistrationBean));
			verify(filterMock).getOrder();
		});
	}
}
