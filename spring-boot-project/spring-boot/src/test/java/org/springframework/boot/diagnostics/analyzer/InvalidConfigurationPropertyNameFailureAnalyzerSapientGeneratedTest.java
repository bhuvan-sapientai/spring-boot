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

    //Sapient generated method id: ${analyze2WhenExceptionIsNotNull}, hash: F1A2C54E70FC826726E43CA7B9AC5D50
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
        InvalidConfigurationPropertyNameException invalidConfigurationPropertyNameException = new InvalidConfigurationPropertyNameException("name1", characterList);
        
        //Act Statement(s)
        FailureAnalysis result = target.analyze((Throwable) beanCreationException, invalidConfigurationPropertyNameException);
        
        //Assert statement(s)
        //TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${analyze2WhenTypeNotIsInstanceFailureAndExceptionIsNull}, hash: 5CCA5A0771EDCC4095B3F35DC94B55D5
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
        InvalidConfigurationPropertyNameException invalidConfigurationPropertyNameException = new InvalidConfigurationPropertyNameException("name1", characterList);
        
        //Act Statement(s)
        FailureAnalysis result = target.analyze(throwable, invalidConfigurationPropertyNameException);
        
        //Assert statement(s)
        //TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
