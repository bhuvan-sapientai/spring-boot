package org.springframework.boot.diagnostics.analyzer;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.web.util.pattern.PatternParseException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PatternParseFailureAnalyzerSapientGeneratedTest {

	//Sapient generated method id: ${61fb4ac6-aef4-3600-ac10-5fdf40761c4c}, hash: B694E20C2BDBA652F39E4CEC0FC5B634
	@Test()
	void analyze2Test() {
		//Arrange Statement(s)
		PatternParseException causeMock = mock(PatternParseException.class);
		doReturn("A").when(causeMock).toDetailedString();
		PatternParseFailureAnalyzer target = new PatternParseFailureAnalyzer();
		Throwable throwable = new Throwable();

		//Act Statement(s)
		FailureAnalysis result = target.analyze(throwable, causeMock);

		//Assert statement(s)
		//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(causeMock, atLeast(1)).toDetailedString();
		});
	}
}
