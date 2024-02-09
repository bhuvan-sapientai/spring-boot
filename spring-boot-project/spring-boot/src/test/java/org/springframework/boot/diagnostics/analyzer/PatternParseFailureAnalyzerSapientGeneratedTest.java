package org.springframework.boot.diagnostics.analyzer;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.web.util.pattern.PatternParseException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PatternParseFailureAnalyzerSapientGeneratedTest {

	//Sapient generated method id: ${61fb4ac6-aef4-3600-ac10-5fdf40761c4c}
	@Disabled()
	@Test()
	void analyze2Test() {
		//Arrange Statement(s)
		PatternParseException causeMock = mock(PatternParseException.class);
		doReturn("A").when(causeMock).toDetailedString();
		PatternParseFailureAnalyzer target = new PatternParseFailureAnalyzer();
		Throwable throwable = new Throwable();
		//Act Statement(s)
		FailureAnalysis result = target.analyze(throwable, causeMock);
		FailureAnalysis failureAnalysis = new FailureAnalysis("Invalid mapping pattern detected:\nA", "Fix this pattern in your application or switch to the legacy parser implementation with 'spring.mvc.pathmatch.matching-strategy=ant_path_matcher'.", causeMock);
		//Assert statement(s)
		//TODO: Please implement equals method in FailureAnalysis for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, equalTo(failureAnalysis));
			verify(causeMock).toDetailedString();
		});
	}
}
