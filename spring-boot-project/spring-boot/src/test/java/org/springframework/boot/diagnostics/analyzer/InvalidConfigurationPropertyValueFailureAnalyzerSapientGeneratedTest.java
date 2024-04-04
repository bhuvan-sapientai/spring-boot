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

	private final ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class, "null");

	//Sapient generated method id: ${2038f990-6689-3648-a6db-1df0ea26b860}, hash: 776C766CB6C614EA7DF937BDE2E0AB1B
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

	//Sapient generated method id: ${13bcba2b-7d92-3efe-820b-8d6faa31878d}, hash: 2095D3FF1F3ADC28C0F971D32344CFB9
	@Test()
	void analyze2WhenThisEnvironmentIsNotNullAndDescriptorsIsEmpty() {
		/* Branches:
		 * (this.environment == null) : false  #  inside getPropertySources method
		 * (descriptors.isEmpty()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: object of type Stream - Method: filter
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		InvalidConfigurationPropertyValueFailureAnalyzer target = new InvalidConfigurationPropertyValueFailureAnalyzer(environmentMock);
		MutablePropertySources mutablePropertySourcesMock = mock(MutablePropertySources.class, "MutablePropertySources");
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
