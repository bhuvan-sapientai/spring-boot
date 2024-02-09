package org.springframework.boot.web.servlet.context;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

import org.springframework.web.context.ConfigurableWebApplicationContext;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;

import org.springframework.util.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class WebApplicationContextServletContextAwareProcessorSapientGeneratedTest {

	private final ConfigurableWebApplicationContext webApplicationContextMock = mock(ConfigurableWebApplicationContext.class, "webApplicationContext");

	//Sapient generated method id: ${04b73006-7eed-35cc-80e2-2c4cef08e624}
	@Test()
	void getServletContextWhenServletContextIsNotNull() {
		/* Branches:
		 * (servletContext != null) : true
		 */
		//Arrange Statement(s)
		ServletContext servletContextMock = mock(ServletContext.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(webApplicationContextMock, "WebApplicationContext must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			WebApplicationContextServletContextAwareProcessor target = new WebApplicationContextServletContextAwareProcessor(webApplicationContextMock);
			doReturn(servletContextMock).when(webApplicationContextMock).getServletContext();
			//Act Statement(s)
			ServletContext result = target.getServletContext();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(servletContextMock));
				_assert.verify(() -> Assert.notNull(webApplicationContextMock, "WebApplicationContext must not be null"), atLeast(1));
				verify(webApplicationContextMock).getServletContext();
			});
		}
	}

	//Sapient generated method id: ${69717a88-6c38-38db-832d-71806c4ae020}
	@Test()
	void getServletContextWhenServletContextIsNull() {
		/* Branches:
		 * (servletContext != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(webApplicationContextMock, "WebApplicationContext must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			WebApplicationContextServletContextAwareProcessor target = new WebApplicationContextServletContextAwareProcessor(webApplicationContextMock);
			doReturn(null).when(webApplicationContextMock).getServletContext();
			//Act Statement(s)
			ServletContext result = target.getServletContext();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.notNull(webApplicationContextMock, "WebApplicationContext must not be null"), atLeast(1));
				verify(webApplicationContextMock).getServletContext();
			});
		}
	}

	//Sapient generated method id: ${1e37458a-77d6-3a1e-89df-4d4080c605f0}
	@Test()
	void getServletConfigWhenServletConfigIsNotNull() {
		/* Branches:
		 * (servletConfig != null) : true
		 */
		//Arrange Statement(s)
		ServletConfig servletConfigMock = mock(ServletConfig.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(webApplicationContextMock, "WebApplicationContext must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			WebApplicationContextServletContextAwareProcessor target = new WebApplicationContextServletContextAwareProcessor(webApplicationContextMock);
			doReturn(servletConfigMock).when(webApplicationContextMock).getServletConfig();
			//Act Statement(s)
			ServletConfig result = target.getServletConfig();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(servletConfigMock));
				_assert.verify(() -> Assert.notNull(webApplicationContextMock, "WebApplicationContext must not be null"), atLeast(1));
				verify(webApplicationContextMock).getServletConfig();
			});
		}
	}

	//Sapient generated method id: ${45fe2c86-2602-35d0-809a-da445bd59959}
	@Test()
	void getServletConfigWhenServletConfigIsNull() {
		/* Branches:
		 * (servletConfig != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(webApplicationContextMock, "WebApplicationContext must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			WebApplicationContextServletContextAwareProcessor target = new WebApplicationContextServletContextAwareProcessor(webApplicationContextMock);
			doReturn(null).when(webApplicationContextMock).getServletConfig();
			//Act Statement(s)
			ServletConfig result = target.getServletConfig();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.notNull(webApplicationContextMock, "WebApplicationContext must not be null"), atLeast(1));
				verify(webApplicationContextMock).getServletConfig();
			});
		}
	}
}
