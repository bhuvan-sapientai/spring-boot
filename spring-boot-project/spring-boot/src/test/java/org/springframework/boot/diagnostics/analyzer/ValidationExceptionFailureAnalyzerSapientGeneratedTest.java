package org.springframework.boot.diagnostics.analyzer;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import jakarta.validation.ValidationException;

import org.springframework.boot.diagnostics.FailureAnalysis;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ValidationExceptionFailureAnalyzerSapientGeneratedTest {

	//Sapient generated method id: ${669f0e99-9d4f-32a5-8888-603f9f27dde7}, hash: EF30F40C4D24DB5F85A9E1ACB88B7DFA
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

		//Assert statement(s)
		//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${71233937-30ea-339a-a299-40a236bde1b3}, hash: D8EC1C140072B2CEE8B429558F1C74DF
	@Test()
	void analyze2WhenCauseGetMessageNotStartsWithJAKARTA_MISSING_IMPLEMENTATION_MESSAGE() {
		/* Branches:
		 * (cause.getMessage().startsWith(JAVAX_MISSING_IMPLEMENTATION_MESSAGE)) : false
		 * (cause.getMessage().startsWith(JAKARTA_MISSING_IMPLEMENTATION_MESSAGE)) : false
		 */
		//Arrange Statement(s)
		ValidationExceptionFailureAnalyzer target = new ValidationExceptionFailureAnalyzer();
		Throwable throwable = new Throwable();
		ValidationException validationException = new ValidationException("A");

		//Act Statement(s)
		FailureAnalysis result = target.analyze(throwable, validationException);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}
}
