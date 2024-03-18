package org.springframework.boot.web.servlet.support;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import jakarta.servlet.ServletException;

import java.io.IOException;

import jakarta.servlet.ServletResponse;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.FilterChain;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.http.HttpStatus;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ErrorPageFilterSapientGeneratedTest {

	private final ErrorPage errorPageMock = mock(ErrorPage.class);

	private final HttpServletRequest requestMock = mock(HttpServletRequest.class);

	//Sapient generated method id: ${e991d51a-89a1-3fbd-8961-0087bc961914}, hash: 26DD8C5B19443D3F81EE435DE3615F1D
	@Disabled()
	@Test()
	void initTest() throws ServletException {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ErrorPageFilter target = new ErrorPageFilter();
		FilterConfig filterConfigMock = mock(FilterConfig.class);
		//Act Statement(s)
		target.init(filterConfigMock);
	}

	//Sapient generated method id: ${90e3ed96-7a0d-3a94-881f-40cbcbae6dfb}, hash: 46F84F0F79DA6DE5CB10F8198579A3F8
	@Disabled()
	@Test()
	void doFilterTest() throws IOException, ServletException {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ErrorPageFilter target = new ErrorPageFilter();
		ServletRequest servletRequestMock = mock(ServletRequest.class);
		ServletResponse servletResponseMock = mock(ServletResponse.class);
		FilterChain filterChainMock = mock(FilterChain.class);
		//Act Statement(s)
		target.doFilter(servletRequestMock, servletResponseMock, filterChainMock);
	}

	//Sapient generated method id: ${dc470fbb-ec1e-39f9-9683-1a8d8649a2ec}, hash: 1D521EA621495C8AB0D26F3AF10E8B07
	@Test()
	void getDescriptionWhenRequestGetPathInfoIsNotNull() {
		/* Branches:
		 * (request.getPathInfo() != null) : true
		 */
		doReturn("return_of_getPathInfo1", "B").when(requestMock).getPathInfo();
		doReturn("A").when(requestMock).getServletPath();
		ErrorPageFilter target = new ErrorPageFilter();
		//Act Statement(s)
		String result = target.getDescription(requestMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("[AB]"));
			verify(requestMock, times(2)).getPathInfo();
			verify(requestMock).getServletPath();
		});
	}

	//Sapient generated method id: ${483807bb-42f5-3e84-a376-edf059ccd910}, hash: 77131F194777A280986A53E863876A06
	@Test()
	void getDescriptionWhenRequestGetPathInfoIsNull() {
		/* Branches:
		 * (request.getPathInfo() != null) : false
		 */
		//Arrange Statement(s)
		doReturn(null).when(requestMock).getPathInfo();
		doReturn("A").when(requestMock).getServletPath();
		ErrorPageFilter target = new ErrorPageFilter();
		//Act Statement(s)
		String result = target.getDescription(requestMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("[A]"));
			verify(requestMock).getPathInfo();
			verify(requestMock).getServletPath();
		});
	}

	//Sapient generated method id: ${bc4ca4f6-c6c4-3365-8cea-22f961e80f57}, hash: 33D93CA52142059C8EE7D89BB609042A
	@Test()
	void addErrorPagesWhenErrorPageIsGlobal() {
		/* Branches:
		 * (for-each(errorPages)) : true
		 * (errorPage.isGlobal()) : true
		 */
		//Arrange Statement(s)
		doReturn(true).when(errorPageMock).isGlobal();
		doReturn("return_of_getPath1").when(errorPageMock).getPath();
		ErrorPageFilter target = new ErrorPageFilter();
		ErrorPage[] errorPageArray = new ErrorPage[] { errorPageMock };
		//Act Statement(s)
		target.addErrorPages(errorPageArray);
		ErrorPage[] errorPageErrorPageArrayArray = new ErrorPage[] { errorPageMock };
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(errorPageArray, equalTo(errorPageErrorPageArrayArray));
			verify(errorPageMock).isGlobal();
			verify(errorPageMock).getPath();
		});
	}

	//Sapient generated method id: ${688792c2-08fb-32b0-aafc-a5741fee4ba7}, hash: 22484298E623B9670D667DFBFC5CE4B7
	@Test()
	void addErrorPagesWhenErrorPageGetStatusIsNotNull() {
		/* Branches:
		 * (for-each(errorPages)) : true
		 * (errorPage.isGlobal()) : false
		 * (errorPage.getStatus() != null) : true
		 */
		//Arrange Statement(s)
		doReturn(false).when(errorPageMock).isGlobal();
		doReturn(HttpStatus.CONTINUE, HttpStatus.MULTI_STATUS).when(errorPageMock).getStatus();
		doReturn("return_of_getPath1").when(errorPageMock).getPath();
		ErrorPageFilter target = new ErrorPageFilter();
		ErrorPage[] errorPageArray = new ErrorPage[] { errorPageMock };
		//Act Statement(s)
		target.addErrorPages(errorPageArray);
		ErrorPage[] errorPageErrorPageArrayArray = new ErrorPage[] { errorPageMock };
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(errorPageArray, equalTo(errorPageErrorPageArrayArray));
			verify(errorPageMock).isGlobal();
			verify(errorPageMock, times(2)).getStatus();
			verify(errorPageMock).getPath();
		});
	}

	//Sapient generated method id: ${5d7e95f5-11a9-3d63-b60f-dc00faf02109}, hash: D7D9ECC8F705D364409A7341F327373F
	@Test()
	void addErrorPagesWhenErrorPageGetStatusIsNull() {
		/* Branches:
		 * (for-each(errorPages)) : true
		 * (errorPage.isGlobal()) : false
		 * (errorPage.getStatus() != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(false).when(errorPageMock).isGlobal();
		doReturn(null).when(errorPageMock).getStatus();
		doReturn(Throwable.class).when(errorPageMock).getException();
		doReturn("return_of_getPath1").when(errorPageMock).getPath();
		ErrorPageFilter target = new ErrorPageFilter();
		ErrorPage[] errorPageArray = new ErrorPage[] { errorPageMock };
		//Act Statement(s)
		target.addErrorPages(errorPageArray);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(errorPageMock).isGlobal();
			verify(errorPageMock).getStatus();
			verify(errorPageMock).getException();
			verify(errorPageMock).getPath();
		});
	}

	//Sapient generated method id: ${c0bb632e-c120-35d3-9fe3-7fc42c801bce}, hash: 4538D21452517454CAABD8D56C47FE7C
	@Test()
	void getOrderTest() {
		//Arrange Statement(s)
		ErrorPageFilter target = new ErrorPageFilter();
		//Act Statement(s)
		int result = target.getOrder();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(-2147483647)));
	}
}
