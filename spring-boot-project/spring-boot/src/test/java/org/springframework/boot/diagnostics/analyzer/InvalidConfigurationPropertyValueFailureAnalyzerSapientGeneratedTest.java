package org.springframework.boot.diagnostics.analyzer;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.boot.context.properties.source.InvalidConfigurationPropertyValueException;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.core.env.MutablePropertySources;
import java.util.stream.Stream;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class InvalidConfigurationPropertyValueFailureAnalyzerSapientGeneratedTest {

    private final ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class, "environment");

    //Sapient generated method id: ${analyze2WhenDescriptorsIsEmpty}, hash: 776C766CB6C614EA7DF937BDE2E0AB1B
    @Test()
    void analyze2WhenDescriptorsIsEmpty() {
        /* Branches:
         * (this.environment == null) : true  #  inside getPropertySources method
         * (descriptors.isEmpty()) : true
         */
        //Arrange Statement(s)
        InvalidConfigurationPropertyValueFailureAnalyzer target = new InvalidConfigurationPropertyValueFailureAnalyzer((ConfigurableEnvironment) null);
        Throwable throwable = new Throwable();
        Object object = new Object();
        InvalidConfigurationPropertyValueException invalidConfigurationPropertyValueException = new InvalidConfigurationPropertyValueException("name1", object, "reason1");
        //Act Statement(s)
        FailureAnalysis result = target.analyze(throwable, invalidConfigurationPropertyValueException);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${analyze2WhenThisEnvironmentIsNotNullAndDescriptorsIsEmpty}, hash: 1CD25D96E1A87B75F1C4578B7BC4F80B
    @Test()
    void analyze2WhenThisEnvironmentIsNotNullAndDescriptorsIsEmpty() {
        /* Branches:
         * (this.environment == null) : false  #  inside getPropertySources method
         * (descriptors.isEmpty()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InvalidConfigurationPropertyValueFailureAnalyzer target = new InvalidConfigurationPropertyValueFailureAnalyzer(environmentMock);
        MutablePropertySources mutablePropertySourcesMock = mock(MutablePropertySources.class);
        doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
        Stream stream = Stream.empty();
        doReturn(stream).when(mutablePropertySourcesMock).stream();
        Throwable throwable = new Throwable();
        Object object = new Object();
        InvalidConfigurationPropertyValueException invalidConfigurationPropertyValueException = new InvalidConfigurationPropertyValueException("name1", object, "reason1");
        //Act Statement(s)
        FailureAnalysis result = target.analyze(throwable, invalidConfigurationPropertyValueException);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(nullValue()));
            verify(environmentMock).getPropertySources();
            verify(mutablePropertySourcesMock).stream();
        });
    }
}
