package org.springframework.boot.diagnostics.analyzer;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.boot.context.properties.source.InvalidConfigurationPropertyNameException;

import java.util.ArrayList;

import org.springframework.boot.diagnostics.FailureAnalysis;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class InvalidConfigurationPropertyNameFailureAnalyzerSapientGeneratedTest {

	//Sapient generated method id: ${823198b3-778e-3602-9dc4-71ad6b9428ea}, hash: 89A7AF15A87449CDB086DC2F3F19EE29
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

		//Assert statement(s)
		//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${203e0dbb-c2ab-38d5-aad7-9d320b830a8f}, hash: 20CBA623DC1F73A1360BA8F3623141AF
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

		//Assert statement(s)
		//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
