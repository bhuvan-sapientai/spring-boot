package org.springframework.boot.context.properties;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.ArrayList;

import org.springframework.boot.diagnostics.FailureAnalysis;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class IncompatibleConfigurationFailureAnalyzerSapientGeneratedTest {

	//Sapient generated method id: ${61fb4ac6-aef4-3600-ac10-5fdf40761c4c}
	@Disabled()
	@Test()
	void analyze2Test() {
		//Arrange Statement(s)
		IncompatibleConfigurationException causeMock = mock(IncompatibleConfigurationException.class);
		Collection<String> collection = new ArrayList<>();
		doReturn(collection).when(causeMock).getIncompatibleKeys();
		doReturn("return_of_getMessage1").when(causeMock).getMessage();
		IncompatibleConfigurationFailureAnalyzer target = new IncompatibleConfigurationFailureAnalyzer();
		Throwable throwable = new Throwable();
		//Act Statement(s)
		FailureAnalysis result = target.analyze(throwable, causeMock);
		FailureAnalysis failureAnalysis = new FailureAnalysis("return_of_getMessage1", "Review the docs for  and change the configured values.", causeMock);
		//Assert statement(s)
		//TODO: Please implement equals method in FailureAnalysis for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, equalTo(failureAnalysis));
			verify(causeMock).getIncompatibleKeys();
			verify(causeMock).getMessage();
		});
	}
}
