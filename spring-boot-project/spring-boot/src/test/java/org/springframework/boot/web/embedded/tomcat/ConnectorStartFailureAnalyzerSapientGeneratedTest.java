package org.springframework.boot.web.embedded.tomcat;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.diagnostics.FailureAnalysis;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConnectorStartFailureAnalyzerSapientGeneratedTest {

	//Sapient generated method id: ${61fb4ac6-aef4-3600-ac10-5fdf40761c4c}, hash: EBCCBD9EEDDF88054EB73E117EB9FF69
	@Test()
	void analyze2Test() {
		//Arrange Statement(s)
		ConnectorStartFailureAnalyzer target = new ConnectorStartFailureAnalyzer();
		Throwable throwable = new Throwable();
		ConnectorStartFailedException connectorStartFailedException = new ConnectorStartFailedException(2);

		//Act Statement(s)
		FailureAnalysis result = target.analyze(throwable, connectorStartFailedException);

		//Assert statement(s)
		//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
