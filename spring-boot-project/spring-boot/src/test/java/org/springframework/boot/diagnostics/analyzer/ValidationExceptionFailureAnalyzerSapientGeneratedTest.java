package org.springframework.boot.diagnostics.analyzer;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import jakarta.validation.ValidationException;

import org.springframework.boot.diagnostics.FailureAnalysis;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ValidationExceptionFailureAnalyzerSapientGeneratedTest {

	//Sapient generated method id: ${669f0e99-9d4f-32a5-8888-603f9f27dde7}
	@Disabled()
	@Test()
	void analyze2WhenCauseGetMessageStartsWithJAKARTA_MISSING_IMPLEMENTATION_MESSAGE() {
		/* Branches:
		 * (cause.getMessage().startsWith(JAVAX_MISSING_IMPLEMENTATION_MESSAGE)) : false
		 * (cause.getMessage().startsWith(JAKARTA_MISSING_IMPLEMENTATION_MESSAGE)) : true
		 */
		//Arrange Statement(s)
		ValidationExceptionFailureAnalyzer target = new ValidationExceptionFailureAnalyzer();
		Throwable throwable = new Throwable();
		ValidationException validationException = new ValidationException("Unable to create a Configuration, because no Jakarta Bean Validation provider could be foundA");
		//Act Statement(s)
		FailureAnalysis result = target.analyze(throwable, validationException);
		FailureAnalysis failureAnalysis = new FailureAnalysis("The Bean Validation API is on the classpath but no implementation could be found", "Add an implementation, such as Hibernate Validator, to the classpath", validationException);
		//Assert statement(s)
		//TODO: Please implement equals method in FailureAnalysis for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(failureAnalysis)));
	}

	//Sapient generated method id: ${71233937-30ea-339a-a299-40a236bde1b3}
	@Test()
	void analyze2WhenCauseGetMessageNotStartsWithJAKARTA_MISSING_IMPLEMENTATION_MESSAGE() {
		/* Branches:
		 * (cause.getMessage().startsWith(JAVAX_MISSING_IMPLEMENTATION_MESSAGE)) : false
		 * (cause.getMessage().startsWith(JAKARTA_MISSING_IMPLEMENTATION_MESSAGE)) : false
		 */
		//Arrange Statement(s)
		ValidationExceptionFailureAnalyzer target = new ValidationExceptionFailureAnalyzer();
		Throwable throwable = new Throwable();
		ValidationException validationException = new ValidationException("D");
		//Act Statement(s)
		FailureAnalysis result = target.analyze(throwable, validationException);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}
}
