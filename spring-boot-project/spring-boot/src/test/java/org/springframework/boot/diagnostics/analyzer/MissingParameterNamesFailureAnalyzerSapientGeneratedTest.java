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

    //Sapient generated method id: ${analyzeTest}, hash: BEF818D4EC17C41486346221E0D12FCD
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

    //Sapient generated method id: ${analyzeForMissingParametersWhenAnalysisIsNotNull}, hash: E0A2895EF28D68A039AA349D419451BE
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

    //Sapient generated method id: ${analyzeForMissingParametersWhenStringUtilsHasTextMessage}, hash: 72DAFB8066BEE3CB3CA608F85E768393
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
        //Assert statement(s)
        //TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${analyzeForMissingParametersWhenStringUtilsNotHasTextMessage}, hash: E3F316A817D99825D811A4A246BF3922
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
            //Assert statement(s)
            //TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                stringUtils.verify(() -> StringUtils.hasText("Ensure that the compiler uses the '-parameters' flag"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${analyzeForMissingParametersWhenCauseGetSuppressedIsNotEmptyAndAnalysisIsNotNull}, hash: 9652336FB0E7FB5AAE4FA47AA508A887
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

    //Sapient generated method id: ${analyzeForMissingParametersWhenAnalysisIsNull}, hash: 54A06725D7F54BB0004F1482D740A6A8
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

    //Sapient generated method id: ${appendPossibilityWhenDescriptionToStringNotEndsWithSystemLineSeparator}, hash: 2F9DEB20DA459CD155981E7E116FD10E
    @Test()
    void appendPossibilityWhenDescriptionToStringNotEndsWithSystemLineSeparator() {
        /* Branches:
         * (!description.toString().endsWith(System.lineSeparator())) : true
         */
        //Arrange Statement(s)
        StringBuilder stringBuilder = new StringBuilder("A");
        //Act Statement(s)
        MissingParameterNamesFailureAnalyzer.appendPossibility(stringBuilder);
    }
}
