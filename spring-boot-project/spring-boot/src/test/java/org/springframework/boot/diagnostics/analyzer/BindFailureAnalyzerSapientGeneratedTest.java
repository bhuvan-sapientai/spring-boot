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
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
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

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class, "buildDescription_configurationPropertyName1");

	private final Object objectMock = mock(Object.class, "buildDescription_object1");

	private final Origin originMock = mock(Origin.class, "buildDescription_origin1");

	//Sapient generated method id: ${4e248675-64ed-372f-92ff-af18e994fbdb}, hash: 5E47596092F8A963093FAD587C9BAA7B
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

	//Sapient generated method id: ${a7a9112d-6f27-36bf-af15-e910de4d4c9d}, hash: 31C901D54ADE9A9D95ED64F4FDF05B57
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
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<MissingParameterNamesFailureAnalyzer> missingParameterNamesFailureAnalyzer = mockStatic(MissingParameterNamesFailureAnalyzer.class)) {
			Throwable throwable = new Throwable();
			Throwable throwable2 = new Throwable("message1", throwable);
			Throwable throwable3 = new Throwable("message1", throwable2);
			Throwable throwable4 = new Throwable("message1", throwable3);
			Throwable throwable5 = new Throwable("message1", throwable4);
			Throwable throwable6 = new Throwable("message1", throwable5);
			Throwable throwable7 = new Throwable("message1", throwable6);
			Throwable throwable8 = new Throwable("message1", throwable7);
			Throwable throwable9 = new Throwable("message1", throwable8);
			Throwable throwable10 = new Throwable("message1", throwable9);
			Throwable throwable11 = new Throwable("message1", throwable10);
			Throwable throwable12 = new Throwable("message1", throwable11);
			Throwable throwable13 = new Throwable("message1", throwable12);
			Throwable throwable14 = new Throwable("message1", throwable13);
			Throwable throwable15 = new Throwable("message1", throwable14);
			Throwable throwable16 = new Throwable("message1", throwable15);
			Throwable throwable17 = new Throwable("message1", throwable16);
			Throwable throwable18 = new Throwable("message1", throwable17);
			Throwable throwable19 = new Throwable("message1", throwable18);
			Throwable throwable20 = new Throwable("message1", throwable19);
			Throwable throwable21 = new Throwable("message1", throwable20);
			Throwable throwable22 = new Throwable("message1", throwable21);
			Throwable throwable23 = new Throwable("message1", throwable22);
			Throwable throwable24 = new Throwable("message1", throwable23);
			Throwable throwable25 = new Throwable("message1", throwable24);
			Throwable throwable26 = new Throwable("message1", throwable25);
			Throwable throwable27 = new Throwable("message1", throwable26);
			Throwable throwable28 = new Throwable("message1", throwable27);
			Throwable throwable29 = new Throwable("message1", throwable28);
			Throwable throwable30 = new Throwable("message1", throwable29);
			Throwable throwable31 = new Throwable("message1", throwable30);
			Throwable throwable32 = new Throwable("message1", throwable31);
			Throwable throwable33 = new Throwable("message1", throwable32);
			Throwable throwable34 = new Throwable("message1", throwable33);
			Throwable throwable35 = new Throwable("message1", throwable34);
			Throwable throwable36 = new Throwable("message1", throwable35);
			Throwable throwable37 = new Throwable("message1", throwable36);
			Throwable throwable38 = new Throwable("message1", throwable37);
			Throwable throwable39 = new Throwable("message1", throwable38);
			Throwable throwable40 = new Throwable("message1", throwable39);
			Throwable throwable41 = new Throwable("message1", throwable40);
			Throwable throwable42 = new Throwable("message1", throwable41);
			Throwable throwable43 = new Throwable("message1", throwable42);
			Throwable throwable44 = new Throwable("message1", throwable43);
			Throwable throwable45 = new Throwable("message1", throwable44);
			Throwable throwable46 = new Throwable("message1", throwable45);
			Throwable throwable47 = new Throwable("message1", throwable46);
			Throwable throwable48 = new Throwable("message1", throwable47);
			Throwable throwable49 = new Throwable("message1", throwable48);
			Throwable throwable50 = new Throwable("message1", throwable49);
			Throwable throwable51 = new Throwable("message1", throwable50);
			Throwable throwable52 = new Throwable("message1", throwable51);
			Throwable throwable53 = new Throwable("message1", throwable52);
			Throwable throwable54 = new Throwable("message1", throwable53);
			Throwable throwable55 = new Throwable("message1", throwable54);
			Throwable throwable56 = new Throwable("message1", throwable55);
			Throwable throwable57 = new Throwable("message1", throwable56);
			Throwable throwable58 = new Throwable("message1", throwable57);
			Throwable throwable59 = new Throwable("message1", throwable58);
			Throwable throwable60 = new Throwable("message1", throwable59);
			Throwable throwable61 = new Throwable("message1", throwable60);
			Throwable throwable62 = new Throwable("message1", throwable61);
			Throwable throwable63 = new Throwable("message1", throwable62);
			Throwable throwable64 = new Throwable("message1", throwable63);
			Throwable throwable65 = new Throwable("message1", throwable64);
			Throwable throwable66 = new Throwable("message1", throwable65);
			Throwable throwable67 = new Throwable("message1", throwable66);
			Throwable throwable68 = new Throwable("message1", throwable67);
			Throwable throwable69 = new Throwable("message1", throwable68);
			Throwable throwable70 = new Throwable("message1", throwable69);
			Throwable throwable71 = new Throwable("message1", throwable70);
			Throwable throwable72 = new Throwable("message1", throwable71);
			Throwable throwable73 = new Throwable("message1", throwable72);
			Throwable throwable74 = new Throwable("message1", throwable73);
			Throwable throwable75 = new Throwable("message1", throwable74);
			Throwable throwable76 = new Throwable("message1", throwable75);
			Throwable throwable77 = new Throwable("message1", throwable76);
			Throwable throwable78 = new Throwable("message1", throwable77);
			Throwable throwable79 = new Throwable("message1", throwable78);
			Throwable throwable80 = new Throwable("message1", throwable79);
			Throwable throwable81 = new Throwable("message1", throwable80);
			Throwable throwable82 = new Throwable("message1", throwable81);
			Throwable throwable83 = new Throwable("message1", throwable82);
			Throwable throwable84 = new Throwable("message1", throwable83);
			Throwable throwable85 = new Throwable("message1", throwable84);
			Throwable throwable86 = new Throwable("message1", throwable85);
			Throwable throwable87 = new Throwable("message1", throwable86);
			Throwable throwable88 = new Throwable("message1", throwable87);
			Throwable throwable89 = new Throwable("message1", throwable88);
			Throwable throwable90 = new Throwable("message1", throwable89);
			Throwable throwable91 = new Throwable("message1", throwable90);
			Throwable throwable92 = new Throwable("message1", throwable91);
			Throwable throwable93 = new Throwable("message1", throwable92);
			Throwable throwable94 = new Throwable("message1", throwable93);
			Throwable throwable95 = new Throwable("message1", throwable94);
			Throwable throwable96 = new Throwable("message1", throwable95);
			Throwable throwable97 = new Throwable("message1", throwable96);
			Throwable throwable98 = new Throwable("message1", throwable97);
			Throwable throwable99 = new Throwable("message1", throwable98);
			Throwable throwable100 = new Throwable("message1", throwable99);
			Throwable throwable101 = new Throwable("message1", throwable100);
			Throwable throwable102 = new Throwable("message1", throwable101);
			doReturn("java.lang.String").when(causeMock).getMessage();
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, objectMock, originMock);
			doReturn(configurationProperty).when(causeMock).getProperty();
			Throwable throwable103 = new Throwable("message1", throwable101);
			doReturn(throwable102, throwable103).when(causeMock).getCause();
			Throwable throwable104 = new Throwable();
			missingParameterNamesFailureAnalyzer.when(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable104)).thenReturn(null);
			stringUtils.when(() -> StringUtils.hasText("str1")).thenReturn(false);
			BindFailureAnalyzer target = new BindFailureAnalyzer();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable104, causeMock);
			//Assert statement(s)
			//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(causeMock, atLeast(2)).getCause();
				verify(causeMock, atLeast(1)).getMessage();
				verify(causeMock, atLeast(1)).getProperty();
				missingParameterNamesFailureAnalyzer.verify(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable104), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasText("str1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c00ef042-a51a-31a9-a8fa-6eb205249c10}, hash: 281F8EDF3B9C0E9DD23DEFDFA5A524AF
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
		BindException causeMock = mock(BindException.class, "exampleValue");
		try (MockedStatic<MissingParameterNamesFailureAnalyzer> missingParameterNamesFailureAnalyzer = mockStatic(MissingParameterNamesFailureAnalyzer.class);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			Throwable throwable = new Throwable();
			Throwable throwable2 = new Throwable("message1", throwable);
			Throwable throwable3 = new Throwable("message1", throwable2);
			Throwable throwable4 = new Throwable("message1", throwable3);
			Throwable throwable5 = new Throwable("message1", throwable4);
			Throwable throwable6 = new Throwable("message1", throwable5);
			Throwable throwable7 = new Throwable("message1", throwable6);
			Throwable throwable8 = new Throwable("message1", throwable7);
			Throwable throwable9 = new Throwable("message1", throwable8);
			Throwable throwable10 = new Throwable("message1", throwable9);
			Throwable throwable11 = new Throwable("message1", throwable10);
			Throwable throwable12 = new Throwable("message1", throwable11);
			Throwable throwable13 = new Throwable("message1", throwable12);
			Throwable throwable14 = new Throwable("message1", throwable13);
			Throwable throwable15 = new Throwable("message1", throwable14);
			Throwable throwable16 = new Throwable("message1", throwable15);
			Throwable throwable17 = new Throwable("message1", throwable16);
			Throwable throwable18 = new Throwable("message1", throwable17);
			Throwable throwable19 = new Throwable("message1", throwable18);
			Throwable throwable20 = new Throwable("message1", throwable19);
			Throwable throwable21 = new Throwable("message1", throwable20);
			Throwable throwable22 = new Throwable("message1", throwable21);
			Throwable throwable23 = new Throwable("message1", throwable22);
			Throwable throwable24 = new Throwable("message1", throwable23);
			Throwable throwable25 = new Throwable("message1", throwable24);
			Throwable throwable26 = new Throwable("message1", throwable25);
			Throwable throwable27 = new Throwable("message1", throwable26);
			Throwable throwable28 = new Throwable("message1", throwable27);
			Throwable throwable29 = new Throwable("message1", throwable28);
			Throwable throwable30 = new Throwable("message1", throwable29);
			Throwable throwable31 = new Throwable("message1", throwable30);
			Throwable throwable32 = new Throwable("message1", throwable31);
			Throwable throwable33 = new Throwable("message1", throwable32);
			Throwable throwable34 = new Throwable("message1", throwable33);
			Throwable throwable35 = new Throwable("message1", throwable34);
			Throwable throwable36 = new Throwable("message1", throwable35);
			Throwable throwable37 = new Throwable("message1", throwable36);
			Throwable throwable38 = new Throwable("message1", throwable37);
			Throwable throwable39 = new Throwable("message1", throwable38);
			Throwable throwable40 = new Throwable("message1", throwable39);
			Throwable throwable41 = new Throwable("message1", throwable40);
			Throwable throwable42 = new Throwable("message1", throwable41);
			Throwable throwable43 = new Throwable("message1", throwable42);
			Throwable throwable44 = new Throwable("message1", throwable43);
			Throwable throwable45 = new Throwable("message1", throwable44);
			Throwable throwable46 = new Throwable("message1", throwable45);
			Throwable throwable47 = new Throwable("message1", throwable46);
			Throwable throwable48 = new Throwable("message1", throwable47);
			Throwable throwable49 = new Throwable("message1", throwable48);
			Throwable throwable50 = new Throwable("message1", throwable49);
			Throwable throwable51 = new Throwable("message1", throwable50);
			Throwable throwable52 = new Throwable("message1", throwable51);
			Throwable throwable53 = new Throwable("message1", throwable52);
			Throwable throwable54 = new Throwable("message1", throwable53);
			Throwable throwable55 = new Throwable("message1", throwable54);
			Throwable throwable56 = new Throwable("message1", throwable55);
			Throwable throwable57 = new Throwable("message1", throwable56);
			Throwable throwable58 = new Throwable("message1", throwable57);
			Throwable throwable59 = new Throwable("message1", throwable58);
			Throwable throwable60 = new Throwable("message1", throwable59);
			Throwable throwable61 = new Throwable("message1", throwable60);
			Throwable throwable62 = new Throwable("message1", throwable61);
			Throwable throwable63 = new Throwable("message1", throwable62);
			Throwable throwable64 = new Throwable("message1", throwable63);
			Throwable throwable65 = new Throwable("message1", throwable64);
			Throwable throwable66 = new Throwable("message1", throwable65);
			Throwable throwable67 = new Throwable("message1", throwable66);
			Throwable throwable68 = new Throwable("message1", throwable67);
			Throwable throwable69 = new Throwable("message1", throwable68);
			Throwable throwable70 = new Throwable("message1", throwable69);
			Throwable throwable71 = new Throwable("message1", throwable70);
			Throwable throwable72 = new Throwable("message1", throwable71);
			Throwable throwable73 = new Throwable("message1", throwable72);
			Throwable throwable74 = new Throwable("message1", throwable73);
			Throwable throwable75 = new Throwable("message1", throwable74);
			Throwable throwable76 = new Throwable("message1", throwable75);
			Throwable throwable77 = new Throwable("message1", throwable76);
			Throwable throwable78 = new Throwable("message1", throwable77);
			Throwable throwable79 = new Throwable("message1", throwable78);
			Throwable throwable80 = new Throwable("message1", throwable79);
			Throwable throwable81 = new Throwable("message1", throwable80);
			Throwable throwable82 = new Throwable("message1", throwable81);
			Throwable throwable83 = new Throwable("message1", throwable82);
			Throwable throwable84 = new Throwable("message1", throwable83);
			Throwable throwable85 = new Throwable("message1", throwable84);
			Throwable throwable86 = new Throwable("message1", throwable85);
			Throwable throwable87 = new Throwable("message1", throwable86);
			Throwable throwable88 = new Throwable("message1", throwable87);
			Throwable throwable89 = new Throwable("message1", throwable88);
			Throwable throwable90 = new Throwable("message1", throwable89);
			Throwable throwable91 = new Throwable("message1", throwable90);
			Throwable throwable92 = new Throwable("message1", throwable91);
			Throwable throwable93 = new Throwable("message1", throwable92);
			Throwable throwable94 = new Throwable("message1", throwable93);
			Throwable throwable95 = new Throwable("message1", throwable94);
			Throwable throwable96 = new Throwable("message1", throwable95);
			Throwable throwable97 = new Throwable("message1", throwable96);
			Throwable throwable98 = new Throwable("message1", throwable97);
			Throwable throwable99 = new Throwable("message1", throwable98);
			Throwable throwable100 = new Throwable("message1", throwable99);
			Throwable throwable101 = new Throwable("message1", throwable100);
			Throwable throwable102 = new Throwable("message1", throwable101);
			doReturn("exampleMessage").when(causeMock).getMessage();
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, objectMock, originMock);
			doReturn(configurationProperty).when(causeMock).getProperty();
			Throwable throwable103 = new Throwable("message1", throwable101);
			doReturn(throwable102, throwable103).when(causeMock).getCause();
			Throwable throwable104 = new Throwable();
			FailureAnalysis failureAnalysis = new FailureAnalysis("description1", "G", throwable104);
			Throwable throwable105 = new Throwable();
			missingParameterNamesFailureAnalyzer.when(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable105)).thenReturn(failureAnalysis);
			stringUtils.when(() -> StringUtils.hasText("")).thenReturn(true);
			StringBuilder stringBuilder = new StringBuilder();
			missingParameterNamesFailureAnalyzer.when(() -> MissingParameterNamesFailureAnalyzer.appendPossibility(stringBuilder)).thenAnswer((Answer<Void>) invocation -> null);
			BindFailureAnalyzer target = new BindFailureAnalyzer();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable105, causeMock);
			//Assert statement(s)
			//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(causeMock, atLeast(2)).getCause();
				verify(causeMock, atLeast(1)).getMessage();
				verify(causeMock, atLeast(1)).getProperty();
				missingParameterNamesFailureAnalyzer.verify(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable105), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasText(""), atLeast(1));
				missingParameterNamesFailureAnalyzer.verify(() -> MissingParameterNamesFailureAnalyzer.appendPossibility(stringBuilder), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${750436f4-39b8-3b36-9690-4106f60e843b}, hash: 5F59C0AE6042FBE4A283C1CCD512C457
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
			Throwable throwable = new Throwable();
			Throwable throwable2 = new Throwable("message1", throwable);
			Throwable throwable3 = new Throwable("message1", throwable2);
			Throwable throwable4 = new Throwable("message1", throwable3);
			Throwable throwable5 = new Throwable("message1", throwable4);
			Throwable throwable6 = new Throwable("message1", throwable5);
			Throwable throwable7 = new Throwable("message1", throwable6);
			Throwable throwable8 = new Throwable("message1", throwable7);
			Throwable throwable9 = new Throwable("message1", throwable8);
			Throwable throwable10 = new Throwable("message1", throwable9);
			Throwable throwable11 = new Throwable("message1", throwable10);
			Throwable throwable12 = new Throwable("message1", throwable11);
			Throwable throwable13 = new Throwable("message1", throwable12);
			Throwable throwable14 = new Throwable("message1", throwable13);
			Throwable throwable15 = new Throwable("message1", throwable14);
			Throwable throwable16 = new Throwable("message1", throwable15);
			Throwable throwable17 = new Throwable("message1", throwable16);
			Throwable throwable18 = new Throwable("message1", throwable17);
			Throwable throwable19 = new Throwable("message1", throwable18);
			Throwable throwable20 = new Throwable("message1", throwable19);
			Throwable throwable21 = new Throwable("message1", throwable20);
			Throwable throwable22 = new Throwable("message1", throwable21);
			Throwable throwable23 = new Throwable("message1", throwable22);
			Throwable throwable24 = new Throwable("message1", throwable23);
			Throwable throwable25 = new Throwable("message1", throwable24);
			Throwable throwable26 = new Throwable("message1", throwable25);
			Throwable throwable27 = new Throwable("message1", throwable26);
			Throwable throwable28 = new Throwable("message1", throwable27);
			Throwable throwable29 = new Throwable("message1", throwable28);
			Throwable throwable30 = new Throwable("message1", throwable29);
			Throwable throwable31 = new Throwable("message1", throwable30);
			Throwable throwable32 = new Throwable("message1", throwable31);
			Throwable throwable33 = new Throwable("message1", throwable32);
			Throwable throwable34 = new Throwable("message1", throwable33);
			Throwable throwable35 = new Throwable("message1", throwable34);
			Throwable throwable36 = new Throwable("message1", throwable35);
			Throwable throwable37 = new Throwable("message1", throwable36);
			Throwable throwable38 = new Throwable("message1", throwable37);
			Throwable throwable39 = new Throwable("message1", throwable38);
			Throwable throwable40 = new Throwable("message1", throwable39);
			Throwable throwable41 = new Throwable("message1", throwable40);
			Throwable throwable42 = new Throwable("message1", throwable41);
			Throwable throwable43 = new Throwable("message1", throwable42);
			Throwable throwable44 = new Throwable("message1", throwable43);
			Throwable throwable45 = new Throwable("message1", throwable44);
			Throwable throwable46 = new Throwable("message1", throwable45);
			Throwable throwable47 = new Throwable("message1", throwable46);
			Throwable throwable48 = new Throwable("message1", throwable47);
			Throwable throwable49 = new Throwable("message1", throwable48);
			Throwable throwable50 = new Throwable("message1", throwable49);
			Throwable throwable51 = new Throwable("message1", throwable50);
			Throwable throwable52 = new Throwable("message1", throwable51);
			Throwable throwable53 = new Throwable("message1", throwable52);
			Throwable throwable54 = new Throwable("message1", throwable53);
			Throwable throwable55 = new Throwable("message1", throwable54);
			Throwable throwable56 = new Throwable("message1", throwable55);
			Throwable throwable57 = new Throwable("message1", throwable56);
			Throwable throwable58 = new Throwable("message1", throwable57);
			Throwable throwable59 = new Throwable("message1", throwable58);
			Throwable throwable60 = new Throwable("message1", throwable59);
			Throwable throwable61 = new Throwable("message1", throwable60);
			Throwable throwable62 = new Throwable("message1", throwable61);
			Throwable throwable63 = new Throwable("message1", throwable62);
			Throwable throwable64 = new Throwable("message1", throwable63);
			Throwable throwable65 = new Throwable("message1", throwable64);
			Throwable throwable66 = new Throwable("message1", throwable65);
			Throwable throwable67 = new Throwable("message1", throwable66);
			Throwable throwable68 = new Throwable("message1", throwable67);
			Throwable throwable69 = new Throwable("message1", throwable68);
			Throwable throwable70 = new Throwable("message1", throwable69);
			Throwable throwable71 = new Throwable("message1", throwable70);
			Throwable throwable72 = new Throwable("message1", throwable71);
			Throwable throwable73 = new Throwable("message1", throwable72);
			Throwable throwable74 = new Throwable("message1", throwable73);
			Throwable throwable75 = new Throwable("message1", throwable74);
			Throwable throwable76 = new Throwable("message1", throwable75);
			Throwable throwable77 = new Throwable("message1", throwable76);
			Throwable throwable78 = new Throwable("message1", throwable77);
			Throwable throwable79 = new Throwable("message1", throwable78);
			Throwable throwable80 = new Throwable("message1", throwable79);
			Throwable throwable81 = new Throwable("message1", throwable80);
			Throwable throwable82 = new Throwable("message1", throwable81);
			Throwable throwable83 = new Throwable("message1", throwable82);
			Throwable throwable84 = new Throwable("message1", throwable83);
			Throwable throwable85 = new Throwable("message1", throwable84);
			Throwable throwable86 = new Throwable("message1", throwable85);
			Throwable throwable87 = new Throwable("message1", throwable86);
			Throwable throwable88 = new Throwable("message1", throwable87);
			Throwable throwable89 = new Throwable("message1", throwable88);
			Throwable throwable90 = new Throwable("message1", throwable89);
			Throwable throwable91 = new Throwable("message1", throwable90);
			Throwable throwable92 = new Throwable("message1", throwable91);
			Throwable throwable93 = new Throwable("message1", throwable92);
			Throwable throwable94 = new Throwable("message1", throwable93);
			Throwable throwable95 = new Throwable("message1", throwable94);
			Throwable throwable96 = new Throwable("message1", throwable95);
			Throwable throwable97 = new Throwable("message1", throwable96);
			Throwable throwable98 = new Throwable("message1", throwable97);
			Throwable throwable99 = new Throwable("message1", throwable98);
			Throwable throwable100 = new Throwable("message1", throwable99);
			Throwable throwable101 = new Throwable("message1", throwable100);
			Throwable throwable102 = new Throwable("message1", throwable101);
			doReturn(throwable102).when(causeMock).getCause();
			doReturn("ADF").when(causeMock).getMessage();
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, objectMock, originMock);
			doReturn(configurationProperty).when(causeMock).getProperty();
			Throwable throwable103 = new Throwable();
			missingParameterNamesFailureAnalyzer.when(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable103)).thenReturn(null);
			stringUtils.when(() -> StringUtils.hasText("B")).thenReturn(true);
			BindFailureAnalyzer target = new BindFailureAnalyzer();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable103, causeMock);
			//Assert statement(s)
			//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(causeMock, atLeast(2)).getCause();
				verify(causeMock, atLeast(1)).getMessage();
				verify(causeMock, atLeast(1)).getProperty();
				missingParameterNamesFailureAnalyzer.verify(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable103), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasText("B"), atLeast(2));
			});
		}
	}

	//Sapient generated method id: ${b84897d9-bdc1-3563-99db-3cd6658f2067}, hash: 2A5EABB2BFEB73B8D19B034008DD63D5
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
			Throwable throwable = new Throwable();
			Throwable throwable2 = new Throwable("message1", throwable);
			Throwable throwable3 = new Throwable("message1", throwable2);
			Throwable throwable4 = new Throwable("message1", throwable3);
			Throwable throwable5 = new Throwable("message1", throwable4);
			Throwable throwable6 = new Throwable("message1", throwable5);
			Throwable throwable7 = new Throwable("message1", throwable6);
			Throwable throwable8 = new Throwable("message1", throwable7);
			Throwable throwable9 = new Throwable("message1", throwable8);
			Throwable throwable10 = new Throwable("message1", throwable9);
			Throwable throwable11 = new Throwable("message1", throwable10);
			Throwable throwable12 = new Throwable("message1", throwable11);
			Throwable throwable13 = new Throwable("message1", throwable12);
			Throwable throwable14 = new Throwable("message1", throwable13);
			Throwable throwable15 = new Throwable("message1", throwable14);
			Throwable throwable16 = new Throwable("message1", throwable15);
			Throwable throwable17 = new Throwable("message1", throwable16);
			Throwable throwable18 = new Throwable("message1", throwable17);
			Throwable throwable19 = new Throwable("message1", throwable18);
			Throwable throwable20 = new Throwable("message1", throwable19);
			Throwable throwable21 = new Throwable("message1", throwable20);
			Throwable throwable22 = new Throwable("message1", throwable21);
			Throwable throwable23 = new Throwable("message1", throwable22);
			Throwable throwable24 = new Throwable("message1", throwable23);
			Throwable throwable25 = new Throwable("message1", throwable24);
			Throwable throwable26 = new Throwable("message1", throwable25);
			Throwable throwable27 = new Throwable("message1", throwable26);
			Throwable throwable28 = new Throwable("message1", throwable27);
			Throwable throwable29 = new Throwable("message1", throwable28);
			Throwable throwable30 = new Throwable("message1", throwable29);
			Throwable throwable31 = new Throwable("message1", throwable30);
			Throwable throwable32 = new Throwable("message1", throwable31);
			Throwable throwable33 = new Throwable("message1", throwable32);
			Throwable throwable34 = new Throwable("message1", throwable33);
			Throwable throwable35 = new Throwable("message1", throwable34);
			Throwable throwable36 = new Throwable("message1", throwable35);
			Throwable throwable37 = new Throwable("message1", throwable36);
			Throwable throwable38 = new Throwable("message1", throwable37);
			Throwable throwable39 = new Throwable("message1", throwable38);
			Throwable throwable40 = new Throwable("message1", throwable39);
			Throwable throwable41 = new Throwable("message1", throwable40);
			Throwable throwable42 = new Throwable("message1", throwable41);
			Throwable throwable43 = new Throwable("message1", throwable42);
			Throwable throwable44 = new Throwable("message1", throwable43);
			Throwable throwable45 = new Throwable("message1", throwable44);
			Throwable throwable46 = new Throwable("message1", throwable45);
			Throwable throwable47 = new Throwable("message1", throwable46);
			Throwable throwable48 = new Throwable("message1", throwable47);
			Throwable throwable49 = new Throwable("message1", throwable48);
			Throwable throwable50 = new Throwable("message1", throwable49);
			Throwable throwable51 = new Throwable("message1", throwable50);
			Throwable throwable52 = new Throwable("message1", throwable51);
			Throwable throwable53 = new Throwable("message1", throwable52);
			Throwable throwable54 = new Throwable("message1", throwable53);
			Throwable throwable55 = new Throwable("message1", throwable54);
			Throwable throwable56 = new Throwable("message1", throwable55);
			Throwable throwable57 = new Throwable("message1", throwable56);
			Throwable throwable58 = new Throwable("message1", throwable57);
			Throwable throwable59 = new Throwable("message1", throwable58);
			Throwable throwable60 = new Throwable("message1", throwable59);
			Throwable throwable61 = new Throwable("message1", throwable60);
			Throwable throwable62 = new Throwable("message1", throwable61);
			Throwable throwable63 = new Throwable("message1", throwable62);
			Throwable throwable64 = new Throwable("message1", throwable63);
			Throwable throwable65 = new Throwable("message1", throwable64);
			Throwable throwable66 = new Throwable("message1", throwable65);
			Throwable throwable67 = new Throwable("message1", throwable66);
			Throwable throwable68 = new Throwable("message1", throwable67);
			Throwable throwable69 = new Throwable("message1", throwable68);
			Throwable throwable70 = new Throwable("message1", throwable69);
			Throwable throwable71 = new Throwable("message1", throwable70);
			Throwable throwable72 = new Throwable("message1", throwable71);
			Throwable throwable73 = new Throwable("message1", throwable72);
			Throwable throwable74 = new Throwable("message1", throwable73);
			Throwable throwable75 = new Throwable("message1", throwable74);
			Throwable throwable76 = new Throwable("message1", throwable75);
			Throwable throwable77 = new Throwable("message1", throwable76);
			Throwable throwable78 = new Throwable("message1", throwable77);
			Throwable throwable79 = new Throwable("message1", throwable78);
			Throwable throwable80 = new Throwable("message1", throwable79);
			Throwable throwable81 = new Throwable("message1", throwable80);
			Throwable throwable82 = new Throwable("message1", throwable81);
			Throwable throwable83 = new Throwable("message1", throwable82);
			Throwable throwable84 = new Throwable("message1", throwable83);
			Throwable throwable85 = new Throwable("message1", throwable84);
			Throwable throwable86 = new Throwable("message1", throwable85);
			Throwable throwable87 = new Throwable("message1", throwable86);
			Throwable throwable88 = new Throwable("message1", throwable87);
			Throwable throwable89 = new Throwable("message1", throwable88);
			Throwable throwable90 = new Throwable("message1", throwable89);
			Throwable throwable91 = new Throwable("message1", throwable90);
			Throwable throwable92 = new Throwable("message1", throwable91);
			Throwable throwable93 = new Throwable("message1", throwable92);
			Throwable throwable94 = new Throwable("message1", throwable93);
			Throwable throwable95 = new Throwable("message1", throwable94);
			Throwable throwable96 = new Throwable("message1", throwable95);
			Throwable throwable97 = new Throwable("message1", throwable96);
			Throwable throwable98 = new Throwable("message1", throwable97);
			Throwable throwable99 = new Throwable("message1", throwable98);
			Throwable throwable100 = new Throwable("message1", throwable99);
			Throwable throwable101 = new Throwable("message1", throwable100);
			Throwable throwable102 = new Throwable("message1", throwable101);
			doReturn(throwable102).when(causeMock).getCause();
			doReturn("").when(causeMock).getMessage();
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, objectMock, originMock);
			doReturn(configurationProperty).when(causeMock).getProperty();
			Throwable throwable103 = new Throwable();
			missingParameterNamesFailureAnalyzer.when(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable103)).thenReturn(null);
			stringUtils.when(() -> StringUtils.hasText("str1")).thenReturn(true).thenReturn(false);
			BindFailureAnalyzer target = new BindFailureAnalyzer();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable103, causeMock);
			//Assert statement(s)
			//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(causeMock, atLeast(2)).getCause();
				verify(causeMock, atLeast(1)).getMessage();
				verify(causeMock, atLeast(1)).getProperty();
				missingParameterNamesFailureAnalyzer.verify(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable103), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasText("str1"), atLeast(2));
			});
		}
	}

	//Sapient generated method id: ${8596ac5a-9baa-3082-a437-2df20500e918}, hash: 8231CB0445F5BA91ECD5EAE579E96289
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
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<MissingParameterNamesFailureAnalyzer> missingParameterNamesFailureAnalyzer = mockStatic(MissingParameterNamesFailureAnalyzer.class)) {
			Throwable throwable = new Throwable("message1");
			Throwable throwable2 = new Throwable("message1", throwable);
			Throwable throwable3 = new Throwable("message1", throwable2);
			Throwable throwable4 = new Throwable("message1", throwable3);
			Throwable throwable5 = new Throwable("message1", throwable4);
			Throwable throwable6 = new Throwable("message1", throwable5);
			Throwable throwable7 = new Throwable("message1", throwable6);
			Throwable throwable8 = new Throwable("message1", throwable7);
			Throwable throwable9 = new Throwable("message1", throwable8);
			Throwable throwable10 = new Throwable("message1", throwable9);
			Throwable throwable11 = new Throwable("message1", throwable10);
			Throwable throwable12 = new Throwable("message1", throwable11);
			Throwable throwable13 = new Throwable("message1", throwable12);
			Throwable throwable14 = new Throwable("message1", throwable13);
			Throwable throwable15 = new Throwable("message1", throwable14);
			Throwable throwable16 = new Throwable("message1", throwable15);
			Throwable throwable17 = new Throwable("message1", throwable16);
			Throwable throwable18 = new Throwable("message1", throwable17);
			Throwable throwable19 = new Throwable("message1", throwable18);
			Throwable throwable20 = new Throwable("message1", throwable19);
			Throwable throwable21 = new Throwable("message1", throwable20);
			Throwable throwable22 = new Throwable("message1", throwable21);
			Throwable throwable23 = new Throwable("message1", throwable22);
			Throwable throwable24 = new Throwable("message1", throwable23);
			Throwable throwable25 = new Throwable("message1", throwable24);
			Throwable throwable26 = new Throwable("message1", throwable25);
			Throwable throwable27 = new Throwable("message1", throwable26);
			Throwable throwable28 = new Throwable("message1", throwable27);
			Throwable throwable29 = new Throwable("message1", throwable28);
			Throwable throwable30 = new Throwable("message1", throwable29);
			Throwable throwable31 = new Throwable("message1", throwable30);
			Throwable throwable32 = new Throwable("message1", throwable31);
			Throwable throwable33 = new Throwable("message1", throwable32);
			Throwable throwable34 = new Throwable("message1", throwable33);
			Throwable throwable35 = new Throwable("message1", throwable34);
			Throwable throwable36 = new Throwable("message1", throwable35);
			Throwable throwable37 = new Throwable("message1", throwable36);
			Throwable throwable38 = new Throwable("message1", throwable37);
			Throwable throwable39 = new Throwable("message1", throwable38);
			Throwable throwable40 = new Throwable("message1", throwable39);
			Throwable throwable41 = new Throwable("message1", throwable40);
			Throwable throwable42 = new Throwable("message1", throwable41);
			Throwable throwable43 = new Throwable("message1", throwable42);
			Throwable throwable44 = new Throwable("message1", throwable43);
			Throwable throwable45 = new Throwable("message1", throwable44);
			Throwable throwable46 = new Throwable("message1", throwable45);
			Throwable throwable47 = new Throwable("message1", throwable46);
			Throwable throwable48 = new Throwable("message1", throwable47);
			Throwable throwable49 = new Throwable("message1", throwable48);
			Throwable throwable50 = new Throwable("message1", throwable49);
			Throwable throwable51 = new Throwable("message1", throwable50);
			Throwable throwable52 = new Throwable("message1", throwable51);
			Throwable throwable53 = new Throwable("message1", throwable52);
			Throwable throwable54 = new Throwable("message1", throwable53);
			Throwable throwable55 = new Throwable("message1", throwable54);
			Throwable throwable56 = new Throwable("message1", throwable55);
			Throwable throwable57 = new Throwable("message1", throwable56);
			Throwable throwable58 = new Throwable("message1", throwable57);
			Throwable throwable59 = new Throwable("message1", throwable58);
			Throwable throwable60 = new Throwable("message1", throwable59);
			Throwable throwable61 = new Throwable("message1", throwable60);
			Throwable throwable62 = new Throwable("message1", throwable61);
			Throwable throwable63 = new Throwable("message1", throwable62);
			Throwable throwable64 = new Throwable("message1", throwable63);
			Throwable throwable65 = new Throwable("message1", throwable64);
			Throwable throwable66 = new Throwable("message1", throwable65);
			Throwable throwable67 = new Throwable("message1", throwable66);
			Throwable throwable68 = new Throwable("message1", throwable67);
			Throwable throwable69 = new Throwable("message1", throwable68);
			Throwable throwable70 = new Throwable("message1", throwable69);
			Throwable throwable71 = new Throwable("message1", throwable70);
			Throwable throwable72 = new Throwable("message1", throwable71);
			Throwable throwable73 = new Throwable("message1", throwable72);
			Throwable throwable74 = new Throwable("message1", throwable73);
			Throwable throwable75 = new Throwable("message1", throwable74);
			Throwable throwable76 = new Throwable("message1", throwable75);
			Throwable throwable77 = new Throwable("message1", throwable76);
			Throwable throwable78 = new Throwable("message1", throwable77);
			Throwable throwable79 = new Throwable("message1", throwable78);
			Throwable throwable80 = new Throwable("message1", throwable79);
			Throwable throwable81 = new Throwable("message1", throwable80);
			Throwable throwable82 = new Throwable("message1", throwable81);
			Throwable throwable83 = new Throwable("message1", throwable82);
			Throwable throwable84 = new Throwable("message1", throwable83);
			Throwable throwable85 = new Throwable("message1", throwable84);
			Throwable throwable86 = new Throwable("message1", throwable85);
			Throwable throwable87 = new Throwable("message1", throwable86);
			Throwable throwable88 = new Throwable("message1", throwable87);
			Throwable throwable89 = new Throwable("message1", throwable88);
			Throwable throwable90 = new Throwable("message1", throwable89);
			Throwable throwable91 = new Throwable("message1", throwable90);
			Throwable throwable92 = new Throwable("message1", throwable91);
			Throwable throwable93 = new Throwable("message1", throwable92);
			Throwable throwable94 = new Throwable("message1", throwable93);
			Throwable throwable95 = new Throwable("message1", throwable94);
			Throwable throwable96 = new Throwable("message1", throwable95);
			Throwable throwable97 = new Throwable("message1", throwable96);
			Throwable throwable98 = new Throwable("message1", throwable97);
			Throwable throwable99 = new Throwable("message1", throwable98);
			Throwable throwable100 = new Throwable("message1", throwable99);
			Throwable throwable101 = new Throwable("message1", throwable100);
			Throwable throwable102 = new Throwable("message1", throwable101);
			doReturn(throwable102).when(causeMock).getCause();
			doReturn("A").when(causeMock).getMessage();
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, objectMock, originMock);
			doReturn(configurationProperty).when(causeMock).getProperty();
			Throwable throwable103 = new Throwable();
			missingParameterNamesFailureAnalyzer.when(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable103)).thenReturn(null);
			stringUtils.when(() -> StringUtils.hasText("message1")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(true);
			BindFailureAnalyzer target = new BindFailureAnalyzer();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable103, causeMock);
			//Assert statement(s)
			//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(causeMock, atLeast(2)).getCause();
				verify(causeMock, atLeast(1)).getMessage();
				verify(causeMock, atLeast(1)).getProperty();
				missingParameterNamesFailureAnalyzer.verify(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable103), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasText("message1"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${d25ad289-9391-39e9-98d9-b2753b973f6c}, hash: 7DB64427F6AC0D6B77778CE5326C6D75
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
			Throwable throwable = new Throwable("message1");
			Throwable throwable2 = new Throwable("message1", throwable);
			Throwable throwable3 = new Throwable("message1", throwable2);
			Throwable throwable4 = new Throwable("message1", throwable3);
			Throwable throwable5 = new Throwable("message1", throwable4);
			Throwable throwable6 = new Throwable("message1", throwable5);
			Throwable throwable7 = new Throwable("message1", throwable6);
			Throwable throwable8 = new Throwable("message1", throwable7);
			Throwable throwable9 = new Throwable("message1", throwable8);
			Throwable throwable10 = new Throwable("message1", throwable9);
			Throwable throwable11 = new Throwable("message1", throwable10);
			Throwable throwable12 = new Throwable("message1", throwable11);
			Throwable throwable13 = new Throwable("message1", throwable12);
			Throwable throwable14 = new Throwable("message1", throwable13);
			Throwable throwable15 = new Throwable("message1", throwable14);
			Throwable throwable16 = new Throwable("message1", throwable15);
			Throwable throwable17 = new Throwable("message1", throwable16);
			Throwable throwable18 = new Throwable("message1", throwable17);
			Throwable throwable19 = new Throwable("message1", throwable18);
			Throwable throwable20 = new Throwable("message1", throwable19);
			Throwable throwable21 = new Throwable("message1", throwable20);
			Throwable throwable22 = new Throwable("message1", throwable21);
			Throwable throwable23 = new Throwable("message1", throwable22);
			Throwable throwable24 = new Throwable("message1", throwable23);
			Throwable throwable25 = new Throwable("message1", throwable24);
			Throwable throwable26 = new Throwable("message1", throwable25);
			Throwable throwable27 = new Throwable("message1", throwable26);
			Throwable throwable28 = new Throwable("message1", throwable27);
			Throwable throwable29 = new Throwable("message1", throwable28);
			Throwable throwable30 = new Throwable("message1", throwable29);
			Throwable throwable31 = new Throwable("message1", throwable30);
			Throwable throwable32 = new Throwable("message1", throwable31);
			Throwable throwable33 = new Throwable("message1", throwable32);
			Throwable throwable34 = new Throwable("message1", throwable33);
			Throwable throwable35 = new Throwable("message1", throwable34);
			Throwable throwable36 = new Throwable("message1", throwable35);
			Throwable throwable37 = new Throwable("message1", throwable36);
			Throwable throwable38 = new Throwable("message1", throwable37);
			Throwable throwable39 = new Throwable("message1", throwable38);
			Throwable throwable40 = new Throwable("message1", throwable39);
			Throwable throwable41 = new Throwable("message1", throwable40);
			Throwable throwable42 = new Throwable("message1", throwable41);
			Throwable throwable43 = new Throwable("message1", throwable42);
			Throwable throwable44 = new Throwable("message1", throwable43);
			Throwable throwable45 = new Throwable("message1", throwable44);
			Throwable throwable46 = new Throwable("message1", throwable45);
			Throwable throwable47 = new Throwable("message1", throwable46);
			Throwable throwable48 = new Throwable("message1", throwable47);
			Throwable throwable49 = new Throwable("message1", throwable48);
			Throwable throwable50 = new Throwable("message1", throwable49);
			Throwable throwable51 = new Throwable("message1", throwable50);
			Throwable throwable52 = new Throwable("message1", throwable51);
			Throwable throwable53 = new Throwable("message1", throwable52);
			Throwable throwable54 = new Throwable("message1", throwable53);
			Throwable throwable55 = new Throwable("message1", throwable54);
			Throwable throwable56 = new Throwable("message1", throwable55);
			Throwable throwable57 = new Throwable("message1", throwable56);
			Throwable throwable58 = new Throwable("message1", throwable57);
			Throwable throwable59 = new Throwable("message1", throwable58);
			Throwable throwable60 = new Throwable("message1", throwable59);
			Throwable throwable61 = new Throwable("message1", throwable60);
			Throwable throwable62 = new Throwable("message1", throwable61);
			Throwable throwable63 = new Throwable("message1", throwable62);
			Throwable throwable64 = new Throwable("message1", throwable63);
			Throwable throwable65 = new Throwable("message1", throwable64);
			Throwable throwable66 = new Throwable("message1", throwable65);
			Throwable throwable67 = new Throwable("message1", throwable66);
			Throwable throwable68 = new Throwable("message1", throwable67);
			Throwable throwable69 = new Throwable("message1", throwable68);
			Throwable throwable70 = new Throwable("message1", throwable69);
			Throwable throwable71 = new Throwable("message1", throwable70);
			Throwable throwable72 = new Throwable("message1", throwable71);
			Throwable throwable73 = new Throwable("message1", throwable72);
			Throwable throwable74 = new Throwable("message1", throwable73);
			Throwable throwable75 = new Throwable("message1", throwable74);
			Throwable throwable76 = new Throwable("message1", throwable75);
			Throwable throwable77 = new Throwable("message1", throwable76);
			Throwable throwable78 = new Throwable("message1", throwable77);
			Throwable throwable79 = new Throwable("message1", throwable78);
			Throwable throwable80 = new Throwable("message1", throwable79);
			Throwable throwable81 = new Throwable("message1", throwable80);
			Throwable throwable82 = new Throwable("message1", throwable81);
			Throwable throwable83 = new Throwable("message1", throwable82);
			Throwable throwable84 = new Throwable("message1", throwable83);
			Throwable throwable85 = new Throwable("message1", throwable84);
			Throwable throwable86 = new Throwable("message1", throwable85);
			Throwable throwable87 = new Throwable("message1", throwable86);
			Throwable throwable88 = new Throwable("message1", throwable87);
			Throwable throwable89 = new Throwable("message1", throwable88);
			Throwable throwable90 = new Throwable("message1", throwable89);
			Throwable throwable91 = new Throwable("message1", throwable90);
			Throwable throwable92 = new Throwable("message1", throwable91);
			Throwable throwable93 = new Throwable("message1", throwable92);
			Throwable throwable94 = new Throwable("message1", throwable93);
			Throwable throwable95 = new Throwable("message1", throwable94);
			Throwable throwable96 = new Throwable("message1", throwable95);
			Throwable throwable97 = new Throwable("message1", throwable96);
			Throwable throwable98 = new Throwable("message1", throwable97);
			Throwable throwable99 = new Throwable("message1", throwable98);
			Throwable throwable100 = new Throwable("message1", throwable99);
			Throwable throwable101 = new Throwable("message1", throwable100);
			Throwable throwable102 = new Throwable("message1", throwable101);
			doReturn(throwable102).when(causeMock).getCause();
			doReturn("").when(causeMock).getMessage();
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, objectMock, originMock);
			doReturn(configurationProperty).when(causeMock).getProperty();
			Throwable throwable103 = new Throwable();
			missingParameterNamesFailureAnalyzer.when(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable103)).thenReturn(null);
			stringUtils.when(() -> StringUtils.hasText("message1")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasText("")).thenReturn(false);
			BindFailureAnalyzer target = new BindFailureAnalyzer();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable103, causeMock);
			//Assert statement(s)
			//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(causeMock, atLeast(2)).getCause();
				verify(causeMock, atLeast(1)).getMessage();
				verify(causeMock, atLeast(1)).getProperty();
				missingParameterNamesFailureAnalyzer.verify(() -> MissingParameterNamesFailureAnalyzer.analyzeForMissingParameters(throwable103), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasText("message1"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasText(""), atLeast(1));
			});
		}
	}
}
