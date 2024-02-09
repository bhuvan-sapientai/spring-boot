package org.springframework.boot.web.embedded.tomcat;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.diagnostics.FailureAnalysis;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConnectorStartFailureAnalyzerSapientGeneratedTest {

	//Sapient generated method id: ${61fb4ac6-aef4-3600-ac10-5fdf40761c4c}
	@Disabled()
	@Test()
	void analyze2Test() {
		//Arrange Statement(s)
		ConnectorStartFailureAnalyzer target = new ConnectorStartFailureAnalyzer();
		Throwable throwable = new Throwable();
		ConnectorStartFailedException connectorStartFailedException = new ConnectorStartFailedException(2);
		//Act Statement(s)
		FailureAnalysis result = target.analyze(throwable, connectorStartFailedException);
		FailureAnalysis failureAnalysis = new FailureAnalysis("The Tomcat connector configured to listen on port 2 failed to start. The port may already be in use or the connector may be misconfigured.", "Verify the connector's configuration, identify and stop any process that's listening on port 2, or configure this application to listen on another port.", connectorStartFailedException);
		//Assert statement(s)
		//TODO: Please implement equals method in FailureAnalysis for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(failureAnalysis)));
	}
}
