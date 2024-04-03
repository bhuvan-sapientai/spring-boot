package org.springframework.boot.diagnostics.analyzer;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.env.ConfigurableEnvironment;

import java.util.HashSet;

import org.springframework.boot.diagnostics.FailureAnalysis;

import java.util.Set;

import org.springframework.core.env.MutablePropertySources;

import java.util.stream.Stream;

import org.springframework.boot.context.properties.source.MutuallyExclusiveConfigurationPropertiesException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MutuallyExclusiveConfigurationPropertiesFailureAnalyzerSapientGeneratedTest {

	private final ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class, "environment");

	private final MutuallyExclusiveConfigurationPropertiesException causeMock = mock(MutuallyExclusiveConfigurationPropertiesException.class);

	//Sapient generated method id: ${3ae87aff-95b6-3319-9eb1-3e60f26478c5}, hash: 071E4A2F2B2B66DE99B3D9217A218A50
	@Test()
	void analyze2WhenDescriptorsForNameIsEmpty() {
		/* Branches:
		 * (for-each(cause.getConfiguredNames())) : true
		 * (this.environment == null) : true  #  inside getPropertySources method
		 * (descriptorsForName.isEmpty()) : true
		 */
		//Arrange Statement(s)
		Set<String> stringSet = new HashSet<>();
		stringSet.add("return_of_getConfiguredNamesItem1");
		doReturn(stringSet).when(causeMock).getConfiguredNames();
		MutuallyExclusiveConfigurationPropertiesFailureAnalyzer target = new MutuallyExclusiveConfigurationPropertiesFailureAnalyzer((ConfigurableEnvironment) null);
		Throwable throwable = new Throwable();
		//Act Statement(s)
		FailureAnalysis result = target.analyze(throwable, causeMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(nullValue()));
			verify(causeMock).getConfiguredNames();
		});
	}

	//Sapient generated method id: ${73e72d81-eef6-3c3f-9c7b-d18087f94179}, hash: 479085C32B32C198E4E2C2211422AF72
	@Disabled()
	@Test()
	void analyze2WhenInputIsNotEmpty() {
		/* Branches:
		 * (for-each(cause.getConfiguredNames())) : true
		 * (this.environment == null) : false  #  inside getPropertySources method
		 * (descriptorsForName.isEmpty()) : false
		 * (for-each(input)) : true  #  inside sortedStrings method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Set<String> stringSet = new HashSet<>();
		stringSet.add("return_of_getConfiguredNamesItem1");
		doReturn(stringSet).when(causeMock).getConfiguredNames();
		Set<String> stringSet2 = new HashSet<>();
		stringSet2.add("return_of_getMutuallyExclusiveNamesItem1");
		doReturn(stringSet2).when(causeMock).getMutuallyExclusiveNames();
		MutuallyExclusiveConfigurationPropertiesFailureAnalyzer target = new MutuallyExclusiveConfigurationPropertiesFailureAnalyzer(environmentMock);
		MutablePropertySources mutablePropertySourcesMock = mock(MutablePropertySources.class);
		doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
		Stream stream = Stream.empty();
		doReturn(stream).when(mutablePropertySourcesMock).stream();
		Throwable throwable = new Throwable();
		//Act Statement(s)
		FailureAnalysis result = target.analyze(throwable, causeMock);
		//Assert statement(s)
		//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(causeMock, atLeast(1)).getConfiguredNames();
			verify(causeMock, atLeast(1)).getMutuallyExclusiveNames();
			verify(environmentMock).getPropertySources();
			verify(mutablePropertySourcesMock).stream();
		});
	}
}
