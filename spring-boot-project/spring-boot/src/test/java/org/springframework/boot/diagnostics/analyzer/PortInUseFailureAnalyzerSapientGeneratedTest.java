package org.springframework.boot.diagnostics.analyzer;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.boot.web.server.PortInUseException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PortInUseFailureAnalyzerSapientGeneratedTest {

	//Sapient generated method id: ${61fb4ac6-aef4-3600-ac10-5fdf40761c4c}
	@Disabled()
	@Test()
	void analyze2Test() {
		//Arrange Statement(s)
		PortInUseFailureAnalyzer target = new PortInUseFailureAnalyzer();
		Throwable throwable = new Throwable();
		PortInUseException portInUseException = new PortInUseException(2);
		//Act Statement(s)
		FailureAnalysis result = target.analyze(throwable, portInUseException);
		FailureAnalysis failureAnalysis = new FailureAnalysis("Web server failed to start. Port 2 was already in use.", "Identify and stop the process that's listening on port 2 or configure this application to listen on another port.", portInUseException);
		//Assert statement(s)
		//TODO: Please implement equals method in FailureAnalysis for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(failureAnalysis)));
	}
}
