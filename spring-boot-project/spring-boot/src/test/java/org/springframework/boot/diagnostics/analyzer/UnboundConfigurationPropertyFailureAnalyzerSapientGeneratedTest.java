package org.springframework.boot.diagnostics.analyzer;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.origin.Origin;
import org.springframework.boot.context.properties.bind.BindException;
import org.springframework.boot.diagnostics.FailureAnalysis;

import java.util.Set;

import org.springframework.boot.context.properties.source.ConfigurationProperty;

import java.util.HashSet;

import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.boot.context.properties.bind.UnboundConfigurationPropertiesException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UnboundConfigurationPropertyFailureAnalyzerSapientGeneratedTest {

	//Sapient generated method id: ${4a365458-5fe0-3a89-afee-917b3977ac44}
	@Test()
	void analyze2WhenTypeNotIsInstanceFailureThrowsNullPointerException() {
		/* Branches:
		 * (failure != null) : true  #  inside findCause method
		 * (type.isInstance(failure)) : false  #  inside findCause method
		 */
		//Arrange Statement(s)
		//UnboundConfigurationPropertyFailureAnalyzer target = new UnboundConfigurationPropertyFailureAnalyzer();
		//Throwable throwable = new Throwable();
		//UnboundConfigurationPropertiesException unboundConfigurationPropertiesExceptionMock = mock(UnboundConfigurationPropertiesException.class);
		//Act Statement(s)
        /*final NullPointerException result = assertThrows(NullPointerException.class, () -> {
    target.analyze(throwable, unboundConfigurationPropertiesExceptionMock);
});*/
		//Assert statement(s)
		//assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${7f6bbcb3-974f-343f-9bb9-8f49d6ecf1d0}
	@Test()
	void analyze2WhenPropertyIsNotNull() {
		/* Branches:
		 * (failure != null) : true  #  inside findCause method
		 * (type.isInstance(failure)) : true  #  inside findCause method
		 * (for-each(exception.getUnboundProperties())) : true  #  inside analyzeUnboundConfigurationPropertiesException method
		 * (property != null) : true  #  inside buildDescription method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Assert statement(s)
		//Arrange Statement(s)
		//BindException causeMock = mock(BindException.class);
		//Bindable<?> bindableMock = mock(Bindable.class, "analyzeUnboundConfigurationPropertiesException_bindable1");
		//doReturn(bindableMock).when(causeMock).getTarget();
		//UnboundConfigurationPropertyFailureAnalyzer target = new UnboundConfigurationPropertyFailureAnalyzer();
		//ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class, "buildDescription_configurationPropertyName1");
		//Object objectMock = mock(Object.class, "buildDescription_object1");
		//Origin originMock = mock(Origin.class, "buildDescription_origin1");
		//ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, objectMock, originMock);
		//Set<ConfigurationProperty> configurationPropertySet = new HashSet<>();
		//configurationPropertySet.add(configurationProperty);
		//UnboundConfigurationPropertiesException unboundConfigurationPropertiesException = new UnboundConfigurationPropertiesException(configurationPropertySet);
		//unboundConfigurationPropertiesException.setMessage("");
		//Act Statement(s)
		//FailureAnalysis result = target.analyze((Throwable) causeMock, unboundConfigurationPropertiesException);
		//FailureAnalysis failureAnalysis = new FailureAnalysis("", "Update your application's configuration", causeMock);
		//TODO: Please implement equals method in FailureAnalysis for verification to succeed or you need to adjust respective assertion statements
        /*assertAll("result", () -> {
    assertThat(result, equalTo(failureAnalysis));
    verify(causeMock).getTarget();
});*/
	}
}
