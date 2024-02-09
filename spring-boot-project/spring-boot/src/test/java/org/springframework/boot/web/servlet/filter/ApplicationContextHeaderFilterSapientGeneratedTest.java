package org.springframework.boot.web.servlet.filter;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import jakarta.servlet.ServletException;

import java.io.IOException;

import org.springframework.context.ApplicationContext;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.FilterChain;
import jakarta.servlet.http.HttpServletRequest;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ApplicationContextHeaderFilterSapientGeneratedTest {

	private final ApplicationContext applicationContextMock = mock(ApplicationContext.class, "applicationContext");

	//Sapient generated method id: ${5722faad-00bb-3006-971f-ae8d2d1a8d80}
	@Test()
	void doFilterInternalTest() throws ServletException, IOException {
		//Arrange Statement(s)
		HttpServletResponse responseMock = mock(HttpServletResponse.class);
		doNothing().when(responseMock).addHeader("X-Application-Context", "return_of_getId1");
		FilterChain filterChainMock = mock(FilterChain.class);
		HttpServletRequest httpServletRequestMock = mock(HttpServletRequest.class);
		doNothing().when(filterChainMock).doFilter(httpServletRequestMock, responseMock);
		ApplicationContextHeaderFilter target = new ApplicationContextHeaderFilter(applicationContextMock);
		doReturn("return_of_getId1").when(applicationContextMock).getId();

		//Act Statement(s)
		target.doFilterInternal(httpServletRequestMock, responseMock, filterChainMock);

		//Assert statement(s)
		assertAll("result", () -> {
			verify(responseMock).addHeader("X-Application-Context", "return_of_getId1");
			verify(filterChainMock).doFilter(httpServletRequestMock, responseMock);
			verify(applicationContextMock).getId();
		});
	}
}
