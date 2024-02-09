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
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BindFailureAnalyzerSapientGeneratedTest {

	private final BindException causeMock = mock(BindException.class);

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class, "buildDescription_configurationPropertyName1");

	private final Object objectMock = mock(Object.class, "buildDescription_object1");

	private final Origin originMock = mock(Origin.class, "buildDescription_origin1");

	//Sapient generated method id: ${4e248675-64ed-372f-92ff-af18e994fbdb}
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

	//Sapient generated method id: ${a7a9112d-6f27-36bf-af15-e910de4d4c9d}
	@Disabled()
	@Test()
	void analyze2WhenValidValuesIsEmptyAndMissingParametersAnalysisIsNull() {
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
			FailureAnalysis failureAnalysis = new FailureAnalysis("A:\n\n    Property: null\n    Value: \"null\"\n    Origin: null\n    Reason: failed to convert getMessage_typeDescriptor1 to getMessage_typeDescriptor2 (caused by java.lang.Throwable)", "Update your application's configuration", causeMock);
			//Assert statement(s)
			//TODO: Please implement equals method in FailureAnalysis for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(failureAnalysis));
				verify(causeMock, times(2)).getCause();
				verify(causeMock).getMessage();
				verify(causeMock).getProperty();
				missingParameterNamesFailureAnalyzer.verify(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable2), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c00ef042-a51a-31a9-a8fa-6eb205249c10}
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
			StringBuilder stringBuilder = new StringBuilder();
			missingParameterNamesFailureAnalyzer.when(() -> MissingParameterNamesFailureAnalyzer.appendPossibility(stringBuilder)).thenAnswer((Answer<Void>) invocation -> null);
			BindFailureAnalyzer target = new BindFailureAnalyzer();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable3, causeMock);
			FailureAnalysis failureAnalysis2 = new FailureAnalysis("A:\n\n    Property: null\n    Value: \"null\"\n    Origin: null\n    Reason: failed to convert getMessage_typeDescriptor1 to getMessage_typeDescriptor2 (caused by java.lang.Throwable: )", "Update your application's configuration. The following values are valid:\n\n    \n\n", causeMock);
			//Assert statement(s)
			//TODO: Please implement equals method in FailureAnalysis for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(failureAnalysis2));
				verify(causeMock, times(2)).getCause();
				verify(causeMock).getMessage();
				verify(causeMock).getProperty();
				missingParameterNamesFailureAnalyzer.verify(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable3), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasText(""), atLeast(1));
				missingParameterNamesFailureAnalyzer.verify(() -> MissingParameterNamesFailureAnalyzer.appendPossibility(stringBuilder), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${750436f4-39b8-3b36-9690-4106f60e843b}
	@Disabled()
	@Test()
	void analyze2WhenConversionFailureIsNullAndValidValuesIsEmptyAndMissingParametersAnalysisIsNull() {
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
			FailureAnalysis failureAnalysis = new FailureAnalysis("A:\n\n    Property: null\n    Value: \"null\"\n    Origin: null\n    Reason: java.lang.Throwable: ", "Update your application's configuration", causeMock);
			//Assert statement(s)
			//TODO: Please implement equals method in FailureAnalysis for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(failureAnalysis));
				verify(causeMock, times(2)).getCause();
				verify(causeMock).getMessage();
				verify(causeMock).getProperty();
				missingParameterNamesFailureAnalyzer.verify(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable2), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasText(""), atLeast(2));
			});
		}
	}

	//Sapient generated method id: ${b84897d9-bdc1-3563-99db-3cd6658f2067}
	@Disabled()
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
			FailureAnalysis failureAnalysis = new FailureAnalysis("A:\n\n    Property: null\n    Value: \"null\"\n    Origin: null\n    Reason: java.lang.Throwable", "Update your application's configuration", causeMock);
			//Assert statement(s)
			//TODO: Please implement equals method in FailureAnalysis for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(failureAnalysis));
				verify(causeMock, times(2)).getCause();
				verify(causeMock).getMessage();
				verify(causeMock).getProperty();
				missingParameterNamesFailureAnalyzer.verify(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable2), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasText(""), atLeast(2));
			});
		}
	}

	//Sapient generated method id: ${8596ac5a-9baa-3082-a437-2df20500e918}
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
			FailureAnalysis failureAnalysis = new FailureAnalysis("A:\n\n    Property: null\n    Value: \"null\"\n    Origin: null\n    Reason: org.springframework.boot.context.properties.bind.BindException: A", "Update your application's configuration", causeMock);
			//Assert statement(s)
			//TODO: Please implement equals method in FailureAnalysis for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(failureAnalysis));
				verify(causeMock, times(2)).getCause();
				verify(causeMock).getMessage();
				verify(causeMock).getProperty();
				missingParameterNamesFailureAnalyzer.verify(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable2), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${d25ad289-9391-39e9-98d9-b2753b973f6c}
	@Disabled()
	@Test()
	void analyze2WhenConversionFailureIsNullAndValidValuesIsEmptyAndMissingParametersAnalysisIsNull4() {
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
			FailureAnalysis failureAnalysis = new FailureAnalysis("A:\n\n    Property: null\n    Value: \"null\"\n    Origin: null\n    Reason: org.springframework.boot.context.properties.bind.BindException", "Update your application's configuration", causeMock);
			//Assert statement(s)
			//TODO: Please implement equals method in FailureAnalysis for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(failureAnalysis));
				verify(causeMock, times(2)).getCause();
				verify(causeMock).getMessage();
				verify(causeMock).getProperty();
				missingParameterNamesFailureAnalyzer.verify(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable2), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasText(""), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
			});
		}
	}
}
