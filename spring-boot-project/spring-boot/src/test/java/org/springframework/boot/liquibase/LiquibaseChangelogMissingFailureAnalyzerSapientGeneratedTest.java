package org.springframework.boot.liquibase;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import liquibase.exception.ChangeLogParseException;

import org.springframework.boot.diagnostics.FailureAnalysis;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LiquibaseChangelogMissingFailureAnalyzerSapientGeneratedTest {

	//Sapient generated method id: ${116be1a6-9879-3d53-9541-bd42412d9534}
	@Test()
	void analyze2WhenCauseGetMessageEndsWithMESSAGE_SUFFIX() {
		/* Branches:
		 * (cause.getMessage().endsWith(MESSAGE_SUFFIX)) : true
		 */
		//Assert statement(s)
		//Arrange Statement(s)
		//LiquibaseChangelogMissingFailureAnalyzer target = new LiquibaseChangelogMissingFailureAnalyzer();
		//Throwable throwable = new Throwable();
		//Throwable throwable2 = new Throwable();
		//ChangeLogParseException changeLogParseException = new ChangeLogParseException(throwable2);
		//changeLogParseException.setMessage(" does not exist");
		//Act Statement(s)
		//FailureAnalysis result = target.analyze(throwable, changeLogParseException);
		//FailureAnalysis failureAnalysis = new FailureAnalysis("Liquibase failed to start because no changelog could be found at ''.", "Make sure a Liquibase changelog is present at the configured path.", changeLogParseException);
		//TODO: Please implement equals method in FailureAnalysis for verification to succeed or you need to adjust respective assertion statements
		//assertAll("result", () -> assertThat(result, equalTo(failureAnalysis)));
	}

	//Sapient generated method id: ${d025e448-33b9-3421-870d-0413286641d0}
	@Test()
	void analyze2WhenCauseGetMessageNotEndsWithMESSAGE_SUFFIX() {
		/* Branches:
		 * (cause.getMessage().endsWith(MESSAGE_SUFFIX)) : false
		 */
		//Arrange Statement(s)
		//LiquibaseChangelogMissingFailureAnalyzer target = new LiquibaseChangelogMissingFailureAnalyzer();
		//Throwable throwable = new Throwable();
		//Throwable throwable2 = new Throwable();
		//ChangeLogParseException changeLogParseException = new ChangeLogParseException(throwable2);
		//changeLogParseException.setMessage("ABCDEFGHIJKLMNO");
		//Act Statement(s)
		//FailureAnalysis result = target.analyze(throwable, changeLogParseException);
		//Assert statement(s)
		//assertAll("result", () -> assertThat(result, is(nullValue())));
	}
}
