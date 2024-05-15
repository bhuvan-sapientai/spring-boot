package org.springframework.boot.diagnostics.analyzer;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.springframework.boot.origin.Origin;
import org.springframework.boot.context.properties.bind.BindException;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.util.StringUtils;
import org.springframework.boot.context.properties.source.ConfigurationProperty;
import org.mockito.MockedStatic;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.boot.context.properties.bind.UnboundConfigurationPropertiesException;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BindFailureAnalyzerSapientGeneratedTest {

    private final BindException causeMock = mock(BindException.class);

    private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class, "name");

    private final Object objectMock = mock(Object.class, "value");

    private final Origin originMock = mock(Origin.class, "origin");

    //Sapient generated method id: ${analyze2WhenRootCauseInstanceOfUnboundConfigurationPropertiesException}, hash: 5E47596092F8A963093FAD587C9BAA7B
    @Test()
    void analyze2WhenRootCauseInstanceOfUnboundConfigurationPropertiesException() {
        /* Branches:
         * (rootCause instanceof BindValidationException) : false
         * (rootCause instanceof UnboundConfigurationPropertiesException) : true
         */
        //Arrange Statement(s)
        UnboundConfigurationPropertiesException unboundConfigurationPropertiesExceptionMock = mock(UnboundConfigurationPropertiesException.class);
        doReturn(unboundConfigurationPropertiesExceptionMock).when(causeMock).getCause();
        BindFailureAnalyzer target = new BindFailureAnalyzer();
        Throwable throwable = new Throwable();
        //Act Statement(s)
        FailureAnalysis result = target.analyze(throwable, causeMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(nullValue()));
            verify(causeMock).getCause();
        });
    }

    //Sapient generated method id: ${analyze2WhenMissingParametersAnalysisIsNullAndConversionFailureIsNullAndValidValuesIsEmptyAndMissingParametersAnalysisI}, hash: 1A1C5625650AF984A36F5E275CA7EC66
    @Test()
    void analyze2WhenMissingParametersAnalysisIsNullAndConversionFailureIsNullAndValidValuesIsEmptyAndMissingParametersAnalysisI() {
        /* Branches:
         * (rootCause instanceof BindValidationException) : false
         * (rootCause instanceof UnboundConfigurationPropertiesException) : false
         * (property != null) : true  #  inside buildDescription method
         * (rootCause != null) : true  #  inside getRootCause method
         * (rootCause.getCause() != null) : true  #  inside getRootCause method
         * (failure != null) : true  #  inside findCause method
         * (type.isInstance(failure)) : true  #  inside findCause method
         * (conversionFailure != null) : true  #  inside getMessage method
         * (rootCause != null) : true  #  inside getMessage method
         * (StringUtils.hasText(message)) : false  #  inside getExceptionTypeAndMessage method
         * (missingParametersAnalysis != null) : false  #  inside analyzeGenericBindException method
         * (conversionFailure != null) : false  #  inside findValidValues method
         * (!validValues.isEmpty()) : false  #  inside getFailureAnalysis method
         * (missingParametersAnalysis != null) : false  #  inside getFailureAnalysis method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MissingParameterNamesFailureAnalyzer> missingParameterNamesFailureAnalyzer = mockStatic(MissingParameterNamesFailureAnalyzer.class)) {
            Throwable throwable = new Throwable("message1", (Throwable) null);
            doReturn(throwable).when(causeMock).getCause();
            doReturn("A").when(causeMock).getMessage();
            ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, objectMock, originMock);
            doReturn(configurationProperty).when(causeMock).getProperty();
            Throwable throwable2 = new Throwable();
            missingParameterNamesFailureAnalyzer.when(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable2)).thenReturn(null);
            BindFailureAnalyzer target = new BindFailureAnalyzer();
            //Act Statement(s)
            FailureAnalysis result = target.analyze(throwable2, causeMock);
            //Assert statement(s)
            //TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(causeMock, atLeast(2)).getCause();
                verify(causeMock, atLeast(1)).getMessage();
                verify(causeMock, atLeast(1)).getProperty();
                missingParameterNamesFailureAnalyzer.verify(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${analyze2WhenValidValuesNotIsEmptyAndMissingParametersAnalysisIsNotNull}, hash: EDEBAEAF79236320CC4B6FD241FBE8E5
    @Disabled()
    @Test()
    void analyze2WhenValidValuesNotIsEmptyAndMissingParametersAnalysisIsNotNull() {
        /* Branches:
         * (rootCause instanceof BindValidationException) : false
         * (rootCause instanceof UnboundConfigurationPropertiesException) : false
         * (property != null) : true  #  inside buildDescription method
         * (rootCause != null) : true  #  inside getRootCause method
         * (rootCause.getCause() != null) : true  #  inside getRootCause method
         * (failure != null) : true  #  inside findCause method
         * (type.isInstance(failure)) : true  #  inside findCause method
         * (conversionFailure != null) : true  #  inside getMessage method
         * (rootCause != null) : true  #  inside getMessage method
         * (StringUtils.hasText(message)) : true  #  inside getExceptionTypeAndMessage method
         * (missingParametersAnalysis != null) : true  #  inside analyzeGenericBindException method
         * (conversionFailure != null) : true  #  inside findValidValues method
         * (enumConstants != null) : true  #  inside findValidValues method
         * (!validValues.isEmpty()) : true  #  inside getFailureAnalysis method
         * (missingParametersAnalysis != null) : true  #  inside getFailureAnalysis method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MissingParameterNamesFailureAnalyzer> missingParameterNamesFailureAnalyzer = mockStatic(MissingParameterNamesFailureAnalyzer.class);
            MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
            Throwable throwable = new Throwable("message1", (Throwable) null);
            doReturn(throwable).when(causeMock).getCause();
            doReturn("A").when(causeMock).getMessage();
            ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, objectMock, originMock);
            doReturn(configurationProperty).when(causeMock).getProperty();
            Throwable throwable2 = new Throwable();
            FailureAnalysis failureAnalysis = new FailureAnalysis("description1", "", throwable2);
            Throwable throwable3 = new Throwable();
            missingParameterNamesFailureAnalyzer.when(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable3)).thenReturn(failureAnalysis);
            stringUtils.when(() -> StringUtils.hasText("")).thenReturn(true);
            StringBuilder stringBuilder = new StringBuilder("A:\n");
            missingParameterNamesFailureAnalyzer.when(() -> MissingParameterNamesFailureAnalyzer.appendPossibility(stringBuilder)).thenAnswer((Answer<Void>) invocation -> null);
            BindFailureAnalyzer target = new BindFailureAnalyzer();
            //Act Statement(s)
            FailureAnalysis result = target.analyze(throwable3, causeMock);
            //Assert statement(s)
            //TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(causeMock, atLeast(2)).getCause();
                verify(causeMock, atLeast(1)).getMessage();
                verify(causeMock, atLeast(1)).getProperty();
                missingParameterNamesFailureAnalyzer.verify(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable3), atLeast(1));
                stringUtils.verify(() -> StringUtils.hasText(""), atLeast(1));
                missingParameterNamesFailureAnalyzer.verify(() -> MissingParameterNamesFailureAnalyzer.appendPossibility(stringBuilder), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${analyze2WhenConversionFailureIsNullAndValidValuesIsEmptyAndMissingParametersAnalysisIsNull2}, hash: E1AA3BEFD879E75664E267014865D6C9
    @Disabled()
    @Test()
    void analyze2WhenConversionFailureIsNullAndValidValuesIsEmptyAndMissingParametersAnalysisIsNull2() {
        /* Branches:
         * (rootCause instanceof BindValidationException) : false
         * (rootCause instanceof UnboundConfigurationPropertiesException) : false
         * (property != null) : true  #  inside buildDescription method
         * (rootCause != null) : true  #  inside getRootCause method
         * (rootCause.getCause() != null) : true  #  inside getRootCause method
         * (failure != null) : true  #  inside findCause method
         * (type.isInstance(failure)) : true  #  inside findCause method
         * (conversionFailure != null) : false  #  inside getMessage method
         * (rootCause != null) : true  #  inside getMessage method
         * (StringUtils.hasText(rootCause.getMessage())) : true  #  inside getMessage method
         * (StringUtils.hasText(message)) : true  #  inside getExceptionTypeAndMessage method
         * (missingParametersAnalysis != null) : false  #  inside analyzeGenericBindException method
         * (conversionFailure != null) : false  #  inside findValidValues method
         * (!validValues.isEmpty()) : false  #  inside getFailureAnalysis method
         * (missingParametersAnalysis != null) : false  #  inside getFailureAnalysis method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<MissingParameterNamesFailureAnalyzer> missingParameterNamesFailureAnalyzer = mockStatic(MissingParameterNamesFailureAnalyzer.class)) {
            Throwable throwable = new Throwable("message1", (Throwable) null);
            doReturn(throwable).when(causeMock).getCause();
            doReturn("A").when(causeMock).getMessage();
            ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, objectMock, originMock);
            doReturn(configurationProperty).when(causeMock).getProperty();
            Throwable throwable2 = new Throwable();
            missingParameterNamesFailureAnalyzer.when(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable2)).thenReturn(null);
            stringUtils.when(() -> StringUtils.hasText("")).thenReturn(true);
            BindFailureAnalyzer target = new BindFailureAnalyzer();
            //Act Statement(s)
            FailureAnalysis result = target.analyze(throwable2, causeMock);
            //Assert statement(s)
            //TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(causeMock, atLeast(2)).getCause();
                verify(causeMock, atLeast(1)).getMessage();
                verify(causeMock, atLeast(1)).getProperty();
                missingParameterNamesFailureAnalyzer.verify(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable2), atLeast(1));
                stringUtils.verify(() -> StringUtils.hasText(""), atLeast(2));
            });
        }
    }

    //Sapient generated method id: ${analyze2WhenConversionFailureIsNullAndValidValuesIsEmptyAndMissingParametersAnalysisIsNull3}, hash: E0E07EFC750835E2C3467DFF644AE6AC
    @Disabled()
    @Test()
    void analyze2WhenConversionFailureIsNullAndValidValuesIsEmptyAndMissingParametersAnalysisIsNull3() {
        /* Branches:
         * (rootCause instanceof BindValidationException) : false
         * (rootCause instanceof UnboundConfigurationPropertiesException) : false
         * (property != null) : true  #  inside buildDescription method
         * (rootCause != null) : true  #  inside getRootCause method
         * (rootCause.getCause() != null) : true  #  inside getRootCause method
         * (failure != null) : true  #  inside findCause method
         * (type.isInstance(failure)) : true  #  inside findCause method
         * (conversionFailure != null) : false  #  inside getMessage method
         * (rootCause != null) : true  #  inside getMessage method
         * (StringUtils.hasText(rootCause.getMessage())) : true  #  inside getMessage method
         * (StringUtils.hasText(message)) : false  #  inside getExceptionTypeAndMessage method
         * (missingParametersAnalysis != null) : false  #  inside analyzeGenericBindException method
         * (conversionFailure != null) : false  #  inside findValidValues method
         * (!validValues.isEmpty()) : false  #  inside getFailureAnalysis method
         * (missingParametersAnalysis != null) : false  #  inside getFailureAnalysis method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<MissingParameterNamesFailureAnalyzer> missingParameterNamesFailureAnalyzer = mockStatic(MissingParameterNamesFailureAnalyzer.class)) {
            Throwable throwable = new Throwable("message1", (Throwable) null);
            doReturn(throwable).when(causeMock).getCause();
            doReturn("A").when(causeMock).getMessage();
            ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, objectMock, originMock);
            doReturn(configurationProperty).when(causeMock).getProperty();
            Throwable throwable2 = new Throwable();
            missingParameterNamesFailureAnalyzer.when(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable2)).thenReturn(null);
            stringUtils.when(() -> StringUtils.hasText("")).thenReturn(true).thenReturn(false);
            BindFailureAnalyzer target = new BindFailureAnalyzer();
            //Act Statement(s)
            FailureAnalysis result = target.analyze(throwable2, causeMock);
            //Assert statement(s)
            //TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(causeMock, atLeast(2)).getCause();
                verify(causeMock, atLeast(1)).getMessage();
                verify(causeMock, atLeast(1)).getProperty();
                missingParameterNamesFailureAnalyzer.verify(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable2), atLeast(1));
                stringUtils.verify(() -> StringUtils.hasText(""), atLeast(2));
            });
        }
    }

    //Sapient generated method id: ${analyze2WhenConversionFailureIsNullAndValidValuesIsEmptyAndMissingParametersAnalysisIsNull4}, hash: 24AB645561CD8E4B2829CEF7C1FA53DF
    @Test()
    void analyze2WhenConversionFailureIsNullAndValidValuesIsEmptyAndMissingParametersAnalysisIsNull4() {
        /* Branches:
         * (rootCause instanceof BindValidationException) : false
         * (rootCause instanceof UnboundConfigurationPropertiesException) : false
         * (property != null) : true  #  inside buildDescription method
         * (rootCause != null) : true  #  inside getRootCause method
         * (rootCause.getCause() != null) : true  #  inside getRootCause method
         * (failure != null) : true  #  inside findCause method
         * (type.isInstance(failure)) : true  #  inside findCause method
         * (conversionFailure != null) : false  #  inside getMessage method
         * (rootCause != null) : true  #  inside getMessage method
         * (StringUtils.hasText(rootCause.getMessage())) : false  #  inside getMessage method
         * (StringUtils.hasText(message)) : true  #  inside getExceptionTypeAndMessage method
         * (missingParametersAnalysis != null) : false  #  inside analyzeGenericBindException method
         * (conversionFailure != null) : false  #  inside findValidValues method
         * (!validValues.isEmpty()) : false  #  inside getFailureAnalysis method
         * (missingParametersAnalysis != null) : false  #  inside getFailureAnalysis method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MissingParameterNamesFailureAnalyzer> missingParameterNamesFailureAnalyzer = mockStatic(MissingParameterNamesFailureAnalyzer.class)) {
            Throwable throwable = new Throwable("message1", (Throwable) null);
            doReturn(throwable).when(causeMock).getCause();
            doReturn("A").when(causeMock).getMessage();
            ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, objectMock, originMock);
            doReturn(configurationProperty).when(causeMock).getProperty();
            Throwable throwable2 = new Throwable();
            missingParameterNamesFailureAnalyzer.when(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable2)).thenReturn(null);
            BindFailureAnalyzer target = new BindFailureAnalyzer();
            //Act Statement(s)
            FailureAnalysis result = target.analyze(throwable2, causeMock);
            //Assert statement(s)
            //TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(causeMock, atLeast(2)).getCause();
                verify(causeMock, atLeast(1)).getMessage();
                verify(causeMock, atLeast(1)).getProperty();
                missingParameterNamesFailureAnalyzer.verify(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${analyze2WhenConversionFailureIsNullAndValidValuesIsEmptyAndMissingParametersAnalysisIsNull6}, hash: 4C9C45A21841724DC75ACEFD29AFCA55
    @Disabled()
    @Test()
    void analyze2WhenConversionFailureIsNullAndValidValuesIsEmptyAndMissingParametersAnalysisIsNull6() {
        /* Branches:
         * (rootCause instanceof BindValidationException) : false
         * (rootCause instanceof UnboundConfigurationPropertiesException) : false
         * (property != null) : true  #  inside buildDescription method
         * (rootCause != null) : true  #  inside getRootCause method
         * (rootCause.getCause() != null) : true  #  inside getRootCause method
         * (failure != null) : true  #  inside findCause method
         * (type.isInstance(failure)) : false  #  inside findCause method
         * (conversionFailure != null) : false  #  inside getMessage method
         * (rootCause != null) : true  #  inside getMessage method
         * (StringUtils.hasText(rootCause.getMessage())) : false  #  inside getMessage method
         * (StringUtils.hasText(message)) : false  #  inside getExceptionTypeAndMessage method
         * (missingParametersAnalysis != null) : false  #  inside analyzeGenericBindException method
         * (conversionFailure != null) : false  #  inside findValidValues method
         * (!validValues.isEmpty()) : false  #  inside getFailureAnalysis method
         * (missingParametersAnalysis != null) : false  #  inside getFailureAnalysis method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<MissingParameterNamesFailureAnalyzer> missingParameterNamesFailureAnalyzer = mockStatic(MissingParameterNamesFailureAnalyzer.class)) {
            Throwable throwable = new Throwable("message1", (Throwable) null);
            doReturn(throwable).when(causeMock).getCause();
            doReturn("A").when(causeMock).getMessage();
            ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, objectMock, originMock);
            doReturn(configurationProperty).when(causeMock).getProperty();
            Throwable throwable2 = new Throwable();
            missingParameterNamesFailureAnalyzer.when(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable2)).thenReturn(null);
            stringUtils.when(() -> StringUtils.hasText("")).thenReturn(false);
            stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
            BindFailureAnalyzer target = new BindFailureAnalyzer();
            //Act Statement(s)
            FailureAnalysis result = target.analyze(throwable2, causeMock);
            //Assert statement(s)
            //TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(causeMock, atLeast(2)).getCause();
                verify(causeMock, atLeast(1)).getMessage();
                verify(causeMock, atLeast(1)).getProperty();
                missingParameterNamesFailureAnalyzer.verify(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable2), atLeast(1));
                stringUtils.verify(() -> StringUtils.hasText(""), atLeast(1));
                stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
            });
        }
    }
}
