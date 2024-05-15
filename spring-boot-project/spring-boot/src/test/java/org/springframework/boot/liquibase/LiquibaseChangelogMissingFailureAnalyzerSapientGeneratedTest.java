package org.springframework.boot.liquibase;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import liquibase.exception.ChangeLogParseException;
import org.springframework.boot.diagnostics.FailureAnalysis;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LiquibaseChangelogMissingFailureAnalyzerSapientGeneratedTest {

    //Sapient generated method id: ${analyze2WhenCauseGetMessageEndsWithMESSAGE_SUFFIX}, hash: 9E96D48D8A0B64718D52EA01226CCD9F
    @Test()
    void analyze2WhenCauseGetMessageEndsWithMESSAGE_SUFFIX() {
        /* Branches:
         * (cause.getMessage().endsWith(MESSAGE_SUFFIX)) : true
         */
         //Arrange Statement(s)
        LiquibaseChangelogMissingFailureAnalyzer target = new LiquibaseChangelogMissingFailureAnalyzer();
        Throwable throwable = new Throwable();
        ChangeLogParseException changeLogParseException = new ChangeLogParseException(" does not exist");
        
        //Act Statement(s)
        FailureAnalysis result = target.analyze(throwable, changeLogParseException);
        
        //Assert statement(s)
        //TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${analyze2WhenCauseGetMessageNotEndsWithMESSAGE_SUFFIX}, hash: C6E5270B40ADF4F8A60B34B114B0D713
    @Test()
    void analyze2WhenCauseGetMessageNotEndsWithMESSAGE_SUFFIX() {
        /* Branches:
         * (cause.getMessage().endsWith(MESSAGE_SUFFIX)) : false
         */
         //Arrange Statement(s)
        LiquibaseChangelogMissingFailureAnalyzer target = new LiquibaseChangelogMissingFailureAnalyzer();
        Throwable throwable = new Throwable();
        ChangeLogParseException changeLogParseException = new ChangeLogParseException("ABCDEFGHIJKLMNO");
        
        //Act Statement(s)
        FailureAnalysis result = target.analyze(throwable, changeLogParseException);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }
}
