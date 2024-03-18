package org.springframework.boot.diagnostics.analyzer;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.boot.web.server.PortInUseException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PortInUseFailureAnalyzerSapientGeneratedTest {

	//Sapient generated method id: ${61fb4ac6-aef4-3600-ac10-5fdf40761c4c}, hash: 70A8127C6487903E72C3837124BE2414
	@Test()
	void analyze2Test() {
		//Arrange Statement(s)
		PortInUseFailureAnalyzer target = new PortInUseFailureAnalyzer();
		Throwable throwable = new Throwable();
		PortInUseException portInUseException = new PortInUseException(2);

		//Act Statement(s)
		FailureAnalysis result = target.analyze(throwable, portInUseException);

		//Assert statement(s)
		//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
