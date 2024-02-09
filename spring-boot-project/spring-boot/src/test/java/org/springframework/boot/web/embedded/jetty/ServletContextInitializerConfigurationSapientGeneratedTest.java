package org.springframework.boot.web.embedded.jetty;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import jakarta.servlet.ServletException;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.util.Assert;

import org.eclipse.jetty.ee10.webapp.WebAppContext;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ServletContextInitializerConfigurationSapientGeneratedTest {

	//Sapient generated method id: ${7798c9e2-958c-3e38-abc1-6b273a0c51d7}
	@Test()
	void configureWhenThisInitializersIsNotEmpty() throws Exception, ServletException {
		/* Branches:
		 * (for-each(this.initializers)) : true  #  inside callInitializers method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ServletContextInitializer servletContextInitializerMock = mock(ServletContextInitializer.class, "void");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] { servletContextInitializerMock };
			_assert.when(() -> Assert.notNull(servletContextInitializerArray, "Initializers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ServletContextInitializerConfiguration target = new ServletContextInitializerConfiguration(servletContextInitializerArray);
			WebAppContext webAppContext = new WebAppContext();
			//Act Statement(s)
			target.configure(webAppContext);
			//Assert statement(s)
			assertAll("result", () -> _assert.verify(() -> Assert.notNull(servletContextInitializerArray, "Initializers must not be null"), atLeast(1)));
		}
	}
}
