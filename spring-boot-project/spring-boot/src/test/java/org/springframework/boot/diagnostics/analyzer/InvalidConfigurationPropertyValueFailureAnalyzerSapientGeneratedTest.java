package org.springframework.boot.diagnostics.analyzer;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.env.ConfigurableEnvironment;

import org.mockito.MockedStatic;

import org.springframework.boot.context.properties.source.InvalidConfigurationPropertyValueException;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.util.StringUtils;
import org.springframework.core.env.MutablePropertySources;

import java.util.stream.Stream;

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
class InvalidConfigurationPropertyValueFailureAnalyzerSapientGeneratedTest {

	private final ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class, "environment");

	private final MutablePropertySources mutablePropertySourcesMock = mock(MutablePropertySources.class);

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

	//Sapient generated method id: ${a545797e-74a9-3c2d-854b-008ae8e1e939}, hash: 2000F008AA99F86E26208A540BEDEBA0
	@Disabled()
	@Test()
	void analyze2WhenOthersIsEmptyAndCauseGetReasonIsNull() {
		/* Branches:
		 * (this.environment == null) : false  #  inside getPropertySources method
		 * (descriptors.isEmpty()) : false
		 * (StringUtils.hasText(cause.getReason())) : false  #  inside appendReason method
		 * (!others.isEmpty()) : false  #  inside appendAdditionalProperties method
		 * (cause.getReason() != null) : false  #  inside getAction method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		InvalidConfigurationPropertyValueFailureAnalyzer target = new InvalidConfigurationPropertyValueFailureAnalyzer(environmentMock);
		doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
		Stream stream = Stream.empty();
		doReturn(stream).when(mutablePropertySourcesMock).stream();
		Throwable throwable = new Throwable();
		Object object = new Object();
		InvalidConfigurationPropertyValueException invalidConfigurationPropertyValueException = new InvalidConfigurationPropertyValueException("", object, (String) null);
		//Act Statement(s)
		FailureAnalysis result = target.analyze(throwable, invalidConfigurationPropertyValueException);
		//Assert statement(s)
		//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(environmentMock).getPropertySources();
			verify(mutablePropertySourcesMock).stream();
		});
	}

	//Sapient generated method id: ${0c8423d4-c79e-3578-b96c-f6ffafd8cd98}, hash: 10A77DC75C755F97E9CCEAE8EB6F4702
	@Disabled()
	@Test()
	void analyze2WhenCauseGetReasonIsNotNull() {
		/* Branches:
		 * (this.environment == null) : false  #  inside getPropertySources method
		 * (descriptors.isEmpty()) : false
		 * (StringUtils.hasText(cause.getReason())) : true  #  inside appendReason method
		 * (!others.isEmpty()) : true  #  inside appendAdditionalProperties method
		 * (others.size() > 1) : true  #  inside appendAdditionalProperties method
		 * (for-each(others)) : true  #  inside appendAdditionalProperties method
		 * (cause.getReason() != null) : true  #  inside getAction method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		InvalidConfigurationPropertyValueFailureAnalyzer target = new InvalidConfigurationPropertyValueFailureAnalyzer(environmentMock);
		doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
		Stream stream = Stream.empty();
		doReturn(stream).when(mutablePropertySourcesMock).stream();
		Throwable throwable = new Throwable();
		Object object = new Object();
		InvalidConfigurationPropertyValueException invalidConfigurationPropertyValueException = new InvalidConfigurationPropertyValueException("", object, "A");
		//Act Statement(s)
		FailureAnalysis result = target.analyze(throwable, invalidConfigurationPropertyValueException);
		//Assert statement(s)
		//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(environmentMock).getPropertySources();
			verify(mutablePropertySourcesMock).stream();
		});
	}

	//Sapient generated method id: ${38bb8237-406f-357b-b046-48b3c8a0acc3}, hash: B3EF1543E8D8D1B1B44466AEC7989236
	@Disabled()
	@Test()
	void analyze2WhenOthersSizeNotGreaterThan1AndOthersIsNotEmptyAndCauseGetReasonIsNull() {
		/* Branches:
		 * (this.environment == null) : false  #  inside getPropertySources method
		 * (descriptors.isEmpty()) : false
		 * (StringUtils.hasText(cause.getReason())) : true  #  inside appendReason method
		 * (!others.isEmpty()) : true  #  inside appendAdditionalProperties method
		 * (others.size() > 1) : false  #  inside appendAdditionalProperties method
		 * (for-each(others)) : true  #  inside appendAdditionalProperties method
		 * (cause.getReason() != null) : false  #  inside getAction method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText((String) null)).thenReturn(true);
			InvalidConfigurationPropertyValueFailureAnalyzer target = new InvalidConfigurationPropertyValueFailureAnalyzer(environmentMock);
			doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
			Stream stream = Stream.empty();
			doReturn(stream).when(mutablePropertySourcesMock).stream();
			Throwable throwable = new Throwable();
			Object object = new Object();
			InvalidConfigurationPropertyValueException invalidConfigurationPropertyValueException = new InvalidConfigurationPropertyValueException("C", object, (String) null);
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable, invalidConfigurationPropertyValueException);
			//Assert statement(s)
			//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				stringUtils.verify(() -> StringUtils.hasText((String) null), atLeast(1));
				verify(environmentMock).getPropertySources();
				verify(mutablePropertySourcesMock).stream();
			});
		}
	}
}
