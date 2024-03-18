package org.springframework.boot.web.servlet.support;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.web.servlet.FilterRegistrationBean;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ErrorPageFilterConfigurationSapientGeneratedTest {

	//Sapient generated method id: ${6a20f687-81b0-3ecc-a9e8-96164dc3e36d}, hash: E1362BCCC9398910CCF1D31D827BF9C3
	@Test()
	void errorPageFilterTest() {
		//Arrange Statement(s)
		ErrorPageFilterConfiguration target = new ErrorPageFilterConfiguration();

		//Act Statement(s)
		ErrorPageFilter result = target.errorPageFilter();

		//Assert statement(s)
		//TODO: Please implement equals method in ErrorPageFilter for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${56f5c141-02c8-30fd-ad49-c46b94a751c2}, hash: B9ACEB392B5C1271B866EBD8AC8C241F
	@Test()
	void errorPageFilterRegistrationTest() {
		//Arrange Statement(s)
		ErrorPageFilter filterMock = mock(ErrorPageFilter.class);
		doReturn(0).when(filterMock).getOrder();
		ErrorPageFilterConfiguration target = new ErrorPageFilterConfiguration();

		//Act Statement(s)
		FilterRegistrationBean<ErrorPageFilter> result = target.errorPageFilterRegistration(filterMock);

		//Assert statement(s)
		//TODO: Please implement equals method in FilterRegistrationBean for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getOrder(), equalTo(0));
			verify(filterMock, atLeast(1)).getOrder();
		});
	}
}
