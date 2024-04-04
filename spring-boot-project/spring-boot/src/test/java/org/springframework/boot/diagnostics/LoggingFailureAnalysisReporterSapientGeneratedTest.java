package org.springframework.boot.diagnostics;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LoggingFailureAnalysisReporterSapientGeneratedTest {

	//Sapient generated method id: ${479c9d51-8277-3e9a-a95f-1ea870a26b46}, hash: 949C48C022B8DD4E87579D77849BE38A
	@Test()
	void reportWhenStringUtilsHasTextFailureAnalysisGetAction() {
		/* Branches:
		 * (logger.isDebugEnabled()) : true
		 * (logger.isErrorEnabled()) : true
		 * (StringUtils.hasText(failureAnalysis.getAction())) : true  #  inside buildMessage method
		 */
		//Arrange Statement(s)
		LoggingFailureAnalysisReporter target = new LoggingFailureAnalysisReporter();
		Throwable throwable = new Throwable();
		FailureAnalysis failureAnalysis = new FailureAnalysis("A", "B", throwable);

		//Act Statement(s)
		target.report(failureAnalysis);
	}
}
