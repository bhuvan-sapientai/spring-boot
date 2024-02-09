package org.springframework.boot.diagnostics;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import org.springframework.util.StringUtils;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LoggingFailureAnalysisReporterSapientGeneratedTest {

	//Sapient generated method id: ${479c9d51-8277-3e9a-a95f-1ea870a26b46}
	@Test()
	void reportWhenStringUtilsHasTextFailureAnalysisGetAction() {
		/* Branches:
		 * (logger.isDebugEnabled()) : true
		 * (logger.isErrorEnabled()) : true
		 * (StringUtils.hasText(failureAnalysis.getAction())) : true  #  inside buildMessage method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("some action")).thenReturn(true);
			LoggingFailureAnalysisReporter target = new LoggingFailureAnalysisReporter();
			Throwable throwable = new Throwable();
			FailureAnalysis failureAnalysis = new FailureAnalysis("some description", "some action", throwable);
			//Act Statement(s)
			target.report(failureAnalysis);
			//Assert statement(s)
			assertAll("result", () -> stringUtils.verify(() -> StringUtils.hasText("some action"), atLeast(1)));
		}
	}
}
