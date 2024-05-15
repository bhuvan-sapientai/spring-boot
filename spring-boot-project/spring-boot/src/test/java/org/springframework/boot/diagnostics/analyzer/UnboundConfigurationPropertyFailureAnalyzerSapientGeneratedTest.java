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
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UnboundConfigurationPropertyFailureAnalyzerSapientGeneratedTest {

    //Sapient generated method id: ${analyze2WhenTypeNotIsInstanceFailureThrowsNullPointerException}, hash: C4442BC4E7065D3A861704EC5DD535ED
    @Test()
    void analyze2WhenTypeNotIsInstanceFailureThrowsNullPointerException() {
        /* Branches:
         * (failure != null) : true  #  inside findCause method
         * (type.isInstance(failure)) : false  #  inside findCause method
         */
        //Arrange Statement(s)
        UnboundConfigurationPropertyFailureAnalyzer target = new UnboundConfigurationPropertyFailureAnalyzer();
        Throwable throwable = new Throwable();
        UnboundConfigurationPropertiesException unboundConfigurationPropertiesExceptionMock = mock(UnboundConfigurationPropertiesException.class);
        //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            target.analyze(throwable, unboundConfigurationPropertiesExceptionMock);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${analyze2WhenPropertyIsNotNull}, hash: 654B9FE0285C6729E38FACA3DCF056BC
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
        //Arrange Statement(s)
        BindException causeMock = mock(BindException.class);
        Bindable<?> bindableMock = mock(Bindable.class, "target1");
        doReturn(bindableMock).when(causeMock).getTarget();
        UnboundConfigurationPropertiesException exceptionMock = mock(UnboundConfigurationPropertiesException.class);
        ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class, "name");
        Object objectMock = mock(Object.class, "value");
        Origin originMock = mock(Origin.class, "origin");
        ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, objectMock, originMock);
        Set<ConfigurationProperty> configurationPropertySet = new HashSet<>();
        configurationPropertySet.add(configurationProperty);
        doReturn(configurationPropertySet).when(exceptionMock).getUnboundProperties();
        doReturn("").when(exceptionMock).getMessage();
        UnboundConfigurationPropertyFailureAnalyzer target = new UnboundConfigurationPropertyFailureAnalyzer();
        //Act Statement(s)
        FailureAnalysis result = target.analyze((Throwable) causeMock, exceptionMock);
        //Assert statement(s)
        //TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(causeMock, atLeast(1)).getTarget();
            verify(exceptionMock).getUnboundProperties();
            verify(exceptionMock).getMessage();
        });
    }
}
