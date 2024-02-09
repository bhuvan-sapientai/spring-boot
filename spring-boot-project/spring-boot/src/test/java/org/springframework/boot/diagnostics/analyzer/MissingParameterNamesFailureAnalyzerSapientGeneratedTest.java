package org.springframework.boot.diagnostics.analyzer;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.util.StringUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MissingParameterNamesFailureAnalyzerSapientGeneratedTest {

	//Sapient generated method id: ${06d4468b-fd91-3d5b-b786-d77faddc2642}
	@Test()
	void analyzeTest() {
		//Arrange Statement(s)
		FailureAnalysis failureAnalysisMock = mock(FailureAnalysis.class);
		try (MockedStatic<MissingParameterNamesFailureAnalyzer> missingParameterNamesFailureAnalyzer = mockStatic(MissingParameterNamesFailureAnalyzer.class)) {
			Throwable throwable = new Throwable();
			missingParameterNamesFailureAnalyzer.when(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable)).thenReturn(failureAnalysisMock);
			MissingParameterNamesFailureAnalyzer target = new MissingParameterNamesFailureAnalyzer();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(failureAnalysisMock));
				missingParameterNamesFailureAnalyzer.verify(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${00ebc01c-d62d-3e2c-b0df-90700891537b}
	@Disabled()
	@Test()
	void analyzeForMissingParametersWhenAnalysisIsNotNull() {
		/* Branches:
		 * (cause != null) : true  #  inside analyzeForMissingParameters method
		 * (seen.add(cause)) : true  #  inside analyzeForMissingParameters method
		 * (message != null) : true  #  inside isSpringParametersException method
		 * (message.contains(USE_PARAMETERS_MESSAGE)) : true  #  inside isSpringParametersException method
		 * (elements.length > 0) : true  #  inside isSpringException method
		 * (className != null) : true  #  inside isSpringClass method
		 * (className.startsWith("org.springframework.")) : false  #  inside isSpringClass method
		 * (isSpringClass(elements[0].getClassName())) : false  #  inside isSpringException method
		 * (isSpringException(failure)) : false  #  inside isSpringParametersException method
		 * (isSpringParametersException(cause)) : false  #  inside analyzeForMissingParameters method
		 * (analysis != null) : true  #  inside analyzeForMissingParameters method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Throwable throwable = new Throwable();
		//Act Statement(s)
		FailureAnalysis result = MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${1522c467-ef5e-3a39-a0ea-fd356f6a6122}
	@Disabled()
	@Test()
	void analyzeForMissingParametersWhenStringUtilsHasTextMessage() {
		/* Branches:
		 * (cause != null) : true  #  inside analyzeForMissingParameters method
		 * (seen.add(cause)) : true  #  inside analyzeForMissingParameters method
		 * (message != null) : true  #  inside isSpringParametersException method
		 * (message.contains(USE_PARAMETERS_MESSAGE)) : true  #  inside isSpringParametersException method
		 * (elements.length > 0) : true  #  inside isSpringException method
		 * (className != null) : true  #  inside isSpringClass method
		 * (className.startsWith("org.springframework.")) : true  #  inside isSpringClass method
		 * (isSpringClass(elements[0].getClassName())) : true  #  inside isSpringException method
		 * (isSpringException(failure)) : true  #  inside isSpringParametersException method
		 * (isSpringParametersException(cause)) : true  #  inside analyzeForMissingParameters method
		 * (rootFailure != cause) : true  #  inside getAnalysis method
		 * (StringUtils.hasText(message)) : true  #  inside getExceptionTypeAndMessage method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Throwable throwable = new Throwable();
		//Act Statement(s)
		FailureAnalysis result = MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable);
		FailureAnalysis failureAnalysis = new FailureAnalysis("Ensure that the compiler uses the '-parameters' flag:\n\n    Resulting Failure: java.lang.Throwable: Ensure that the compiler uses the '-parameters' flag", "Ensure that your compiler is configured to use the '-parameters' flag.\nYou may need to update both your build tool settings as well as your IDE.\n(See https://github.com/spring-projects/spring-framework/wiki/Upgrading-to-Spring-Framework-6.x#parameter-name-retention)\n", throwable);
		//Assert statement(s)
		//TODO: Please implement equals method in FailureAnalysis for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(failureAnalysis)));
	}

	//Sapient generated method id: ${fa0505f1-ed1d-3996-b1b1-dcbcbe3767b8}
	@Disabled()
	@Test()
	void analyzeForMissingParametersWhenStringUtilsNotHasTextMessage() {
		/* Branches:
		 * (cause != null) : true  #  inside analyzeForMissingParameters method
		 * (seen.add(cause)) : true  #  inside analyzeForMissingParameters method
		 * (message != null) : true  #  inside isSpringParametersException method
		 * (message.contains(USE_PARAMETERS_MESSAGE)) : true  #  inside isSpringParametersException method
		 * (elements.length > 0) : true  #  inside isSpringException method
		 * (className != null) : true  #  inside isSpringClass method
		 * (className.startsWith("org.springframework.")) : true  #  inside isSpringClass method
		 * (isSpringClass(elements[0].getClassName())) : true  #  inside isSpringException method
		 * (isSpringException(failure)) : true  #  inside isSpringParametersException method
		 * (isSpringParametersException(cause)) : true  #  inside analyzeForMissingParameters method
		 * (rootFailure != cause) : true  #  inside getAnalysis method
		 * (StringUtils.hasText(message)) : false  #  inside getExceptionTypeAndMessage method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("Ensure that the compiler uses the '-parameters' flag")).thenReturn(false);
			Throwable throwable = new Throwable();
			//Act Statement(s)
			FailureAnalysis result = MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable);
			FailureAnalysis failureAnalysis = new FailureAnalysis("Ensure that the compiler uses the '-parameters' flag:\n\n    Resulting Failure: java.lang.Throwable", "Ensure that your compiler is configured to use the '-parameters' flag.\nYou may need to update both your build tool settings as well as your IDE.\n(See https://github.com/spring-projects/spring-framework/wiki/Upgrading-to-Spring-Framework-6.x#parameter-name-retention)\n", throwable);
			//Assert statement(s)
			//TODO: Please implement equals method in FailureAnalysis for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(failureAnalysis));
				stringUtils.verify(() -> StringUtils.hasText("Ensure that the compiler uses the '-parameters' flag"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${646faab8-444e-3ca2-8d40-ef943b86cd26}
	@Disabled()
	@Test()
	void analyzeForMissingParametersWhenCauseGetSuppressedIsNotEmptyAndAnalysisIsNotNull() {
		/* Branches:
		 * (cause != null) : true  #  inside analyzeForMissingParameters method
		 * (seen.add(cause)) : true  #  inside analyzeForMissingParameters method
		 * (message != null) : true  #  inside isSpringParametersException method
		 * (message.contains(USE_PARAMETERS_MESSAGE)) : true  #  inside isSpringParametersException method
		 * (elements.length > 0) : true  #  inside isSpringException method
		 * (className != null) : true  #  inside isSpringClass method
		 * (className.startsWith("org.springframework.")) : false  #  inside isSpringClass method
		 * (isSpringClass(elements[0].getClassName())) : false  #  inside isSpringException method
		 * (isSpringException(failure)) : false  #  inside isSpringParametersException method
		 * (isSpringParametersException(cause)) : false  #  inside analyzeForMissingParameters method
		 * (analysis != null) : false  #  inside analyzeForMissingParameters method
		 * (for-each(cause.getSuppressed())) : true  #  inside analyzeForMissingParameters method
		 * (analysis != null) : true  #  inside analyzeForMissingParameters method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Throwable throwable = new Throwable();
		//Act Statement(s)
		FailureAnalysis result = MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${b078f046-12c6-3313-ad26-59dc444e99db}
	@Test()
	void analyzeForMissingParametersWhenAnalysisIsNull() {
		/* Branches:
		 * (cause != null) : true  #  inside analyzeForMissingParameters method
		 * (seen.add(cause)) : true  #  inside analyzeForMissingParameters method
		 * (message != null) : true  #  inside isSpringParametersException method
		 * (message.contains(USE_PARAMETERS_MESSAGE)) : true  #  inside isSpringParametersException method
		 * (elements.length > 0) : true  #  inside isSpringException method
		 * (className != null) : true  #  inside isSpringClass method
		 * (className.startsWith("org.springframework.")) : false  #  inside isSpringClass method
		 * (isSpringClass(elements[0].getClassName())) : false  #  inside isSpringException method
		 * (isSpringException(failure)) : false  #  inside isSpringParametersException method
		 * (isSpringParametersException(cause)) : false  #  inside analyzeForMissingParameters method
		 * (analysis != null) : false  #  inside analyzeForMissingParameters method
		 * (for-each(cause.getSuppressed())) : true  #  inside analyzeForMissingParameters method
		 * (analysis != null) : false  #  inside analyzeForMissingParameters method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Throwable throwable = new Throwable();
		//Act Statement(s)
		FailureAnalysis result = MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${a4bf000f-ea54-3a9b-800b-a11cbee68fb3}
	@Test()
	void appendPossibilityWhenDescriptionToStringNotEndsWithSystemLineSeparator() {
		/* Branches:
		 * (!description.toString().endsWith(System.lineSeparator())) : true
		 */
		//Arrange Statement(s)
		StringBuilder stringBuilder = new StringBuilder();
		//Act Statement(s)
		MissingParameterNamesFailureAnalyzer.appendPossibility(stringBuilder);
	}
}
