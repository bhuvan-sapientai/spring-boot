package org.springframework.boot.diagnostics.analyzer;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.boot.context.properties.source.InvalidConfigurationPropertyNameException;

import java.util.ArrayList;

import org.springframework.boot.diagnostics.FailureAnalysis;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class InvalidConfigurationPropertyNameFailureAnalyzerSapientGeneratedTest {

	//Sapient generated method id: ${823198b3-778e-3602-9dc4-71ad6b9428ea}
	@Disabled()
	@Test()
	void analyze2WhenExceptionIsNotNull() {
		/* Branches:
		 * (failure != null) : true  #  inside findCause method
		 * (type.isInstance(failure)) : true  #  inside findCause method
		 * (exception != null) : true  #  inside buildDescription method
		 */
		//Arrange Statement(s)
		InvalidConfigurationPropertyNameFailureAnalyzer target = new InvalidConfigurationPropertyNameFailureAnalyzer();
		BeanCreationException beanCreationException = new BeanCreationException("A", "msg1");
		List<Character> characterList = new ArrayList<>();
		characterList.add('D');
		InvalidConfigurationPropertyNameException invalidConfigurationPropertyNameException = new InvalidConfigurationPropertyNameException("analyze_charSequence1", characterList);
		//Act Statement(s)
		FailureAnalysis result = target.analyze((Throwable) beanCreationException, invalidConfigurationPropertyNameException);
		FailureAnalysis failureAnalysis = new FailureAnalysis("Configuration property name 'analyze_charSequence1' is not valid:\n\n    Invalid characters: 'D'\n    Bean: A\n    Reason: Canonical names should be kebab-case ('-' separated), lowercase alpha-numeric characters and must start with a letter", "Modify 'analyze_charSequence1' so that it conforms to the canonical names requirements.", invalidConfigurationPropertyNameException);
		//Assert statement(s)
		//TODO: Please implement equals method in FailureAnalysis for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(failureAnalysis)));
	}

	//Sapient generated method id: ${203e0dbb-c2ab-38d5-aad7-9d320b830a8f}
	@Disabled()
	@Test()
	void analyze2WhenTypeNotIsInstanceFailureAndExceptionIsNull() {
		/* Branches:
		 * (failure != null) : true  #  inside findCause method
		 * (type.isInstance(failure)) : false  #  inside findCause method
		 * (exception != null) : false  #  inside buildDescription method
		 */
		//Arrange Statement(s)
		InvalidConfigurationPropertyNameFailureAnalyzer target = new InvalidConfigurationPropertyNameFailureAnalyzer();
		Throwable throwable = new Throwable();
		List<Character> characterList = new ArrayList<>();
		characterList.add('A');
		InvalidConfigurationPropertyNameException invalidConfigurationPropertyNameException = new InvalidConfigurationPropertyNameException("analyze_charSequence1", characterList);
		//Act Statement(s)
		FailureAnalysis result = target.analyze(throwable, invalidConfigurationPropertyNameException);
		FailureAnalysis failureAnalysis = new FailureAnalysis("Configuration property name 'analyze_charSequence1' is not valid:\n\n    Invalid characters: 'A'\n    Reason: Canonical names should be kebab-case ('-' separated), lowercase alpha-numeric characters and must start with a letter", "Modify 'analyze_charSequence1' so that it conforms to the canonical names requirements.", invalidConfigurationPropertyNameException);
		//Assert statement(s)
		//TODO: Please implement equals method in FailureAnalysis for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(failureAnalysis)));
	}
}
