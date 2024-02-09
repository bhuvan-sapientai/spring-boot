package org.springframework.boot.web.context;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.boot.WebApplicationType;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MissingWebServerFactoryBeanFailureAnalyzerSapientGeneratedTest {

	//Sapient generated method id: ${61fb4ac6-aef4-3600-ac10-5fdf40761c4c}
	@Disabled()
	@Test()
	void analyze2Test() {
		//Arrange Statement(s)
		MissingWebServerFactoryBeanException causeMock = mock(MissingWebServerFactoryBeanException.class);
		doReturn(Object.class).when(causeMock).getBeanType();
		doReturn(WebApplicationType.NONE).when(causeMock).getWebApplicationType();
		MissingWebServerFactoryBeanFailureAnalyzer target = new MissingWebServerFactoryBeanFailureAnalyzer();
		Throwable throwable = new Throwable();
		//Act Statement(s)
		FailureAnalysis result = target.analyze(throwable, causeMock);
		FailureAnalysis failureAnalysis = new FailureAnalysis("Web application could not be started as there was no java.lang.Object bean defined in the context.", "Check your application's dependencies for a supported none web server.\nCheck the configured web application type.", causeMock);
		//Assert statement(s)
		//TODO: Please implement equals method in FailureAnalysis for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, equalTo(failureAnalysis));
			verify(causeMock).getBeanType();
			verify(causeMock).getWebApplicationType();
		});
	}
}
