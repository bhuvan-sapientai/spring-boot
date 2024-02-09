package org.springframework.boot.diagnostics;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.apache.commons.logging.LogFactory;

import org.springframework.core.io.support.SpringFactoriesLoader;

import org.apache.commons.logging.Log;
import org.mockito.MockedStatic;

import java.util.ArrayList;

import org.springframework.context.ConfigurableApplicationContext;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FailureAnalyzersSapientGeneratedTest {

	private final SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class, "springFactoriesLoader");

	private final FailureAnalyzer failureAnalyzerMock = mock(FailureAnalyzer.class);

	//Sapient generated method id: ${27e34d66-e50b-33ac-8764-d148bf1a4ad1}
	@Test()
	void reportExceptionWhenAnalysisIsNullAndAnalysisIsNull() throws Throwable {
		/* Branches:
		 * (for-each(analyzers)) : true  #  inside analyze method
		 * (analysis != null) : false  #  inside analyze method
		 * (analysis == null) : true  #  inside report method
		 */
		//Arrange Statement(s)
		List<FailureAnalyzer> failureAnalyzerList = new ArrayList<>();
		failureAnalyzerList.add(failureAnalyzerMock);
		doReturn(failureAnalyzerList).when(springFactoriesLoaderMock).load(eq(FailureAnalyzer.class), eq((SpringFactoriesLoader.ArgumentResolver) null), (SpringFactoriesLoader.FailureHandler) any());
		Throwable throwable = new Throwable();
		doReturn(null).when(failureAnalyzerMock).analyze(throwable);
		FailureAnalyzers target = new FailureAnalyzers((ConfigurableApplicationContext) null, springFactoriesLoaderMock);
		List<FailureAnalysisReporter> failureAnalysisReporterList = new ArrayList<>();
		doReturn(failureAnalysisReporterList).when(springFactoriesLoaderMock).load(FailureAnalysisReporter.class);
		//Act Statement(s)
		boolean result = target.reportException(throwable);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(springFactoriesLoaderMock).load(eq(FailureAnalyzer.class), eq((SpringFactoriesLoader.ArgumentResolver) null), (SpringFactoriesLoader.FailureHandler) any());
			verify(failureAnalyzerMock).analyze(throwable);
			verify(springFactoriesLoaderMock).load(FailureAnalysisReporter.class);
		});
	}

	//Sapient generated method id: ${d868620b-5075-32d4-b10a-fddede8d657f}
	@Disabled()
	@Test()
	void reportExceptionWhenCaughtThrowableAndAnalysisIsNull() throws Throwable {
		/* Branches:
		 * (for-each(analyzers)) : true  #  inside analyze method
		 * (analysis != null) : true  #  inside analyze method
		 * (catch-exception (Throwable)) : true  #  inside analyze method
		 * (analysis == null) : true  #  inside report method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<SpringFactoriesLoader.FailureHandler> springFactoriesLoaderFailureHandler = mockStatic(SpringFactoriesLoader.FailureHandler.class)) {
			Log log = LogFactory.getLog(FailureAnalyzers.class);
			SpringFactoriesLoader.FailureHandler failureHandler = SpringFactoriesLoader.FailureHandler.logging(log);
			springFactoriesLoaderFailureHandler.when(() -> SpringFactoriesLoader.FailureHandler.logging((Log) any())).thenReturn(failureHandler);
			SpringFactoriesLoader springFactoriesLoader = SpringFactoriesLoader.forDefaultResourceLocation();
			FailureAnalyzers target = new FailureAnalyzers((ConfigurableApplicationContext) null, springFactoriesLoader);
			Throwable throwable = new Throwable();
			//Act Statement(s)
			boolean result = target.reportException(throwable);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				springFactoriesLoaderFailureHandler.verify(() -> SpringFactoriesLoader.FailureHandler.logging((Log) any()));
			});
		}
	}

	//Sapient generated method id: ${f6dfcae9-0d28-30bf-882e-8a54e040eae5}
	@Test()
	void reportExceptionWhenReportersIsNotEmpty() throws Throwable {
		/* Branches:
		 * (for-each(analyzers)) : true  #  inside analyze method
		 * (analysis != null) : true  #  inside analyze method
		 * (analysis == null) : false  #  inside report method
		 * (reporters.isEmpty()) : false  #  inside report method
		 * (for-each(reporters)) : true  #  inside report method
		 */
		//Arrange Statement(s)
		List<FailureAnalyzer> failureAnalyzerList = new ArrayList<>();
		failureAnalyzerList.add(failureAnalyzerMock);
		doReturn(failureAnalyzerList).when(springFactoriesLoaderMock).load(eq(FailureAnalyzer.class), eq((SpringFactoriesLoader.ArgumentResolver) null), (SpringFactoriesLoader.FailureHandler) any());
		FailureAnalysis failureAnalysisMock = mock(FailureAnalysis.class);
		Throwable throwable = new Throwable();
		doReturn(failureAnalysisMock).when(failureAnalyzerMock).analyze(throwable);
		FailureAnalyzers target = new FailureAnalyzers((ConfigurableApplicationContext) null, springFactoriesLoaderMock);
		FailureAnalysisReporter failureAnalysisReporterMock = mock(FailureAnalysisReporter.class);
		List<FailureAnalysisReporter> failureAnalysisReporterList = new ArrayList<>();
		failureAnalysisReporterList.add(failureAnalysisReporterMock);
		doReturn(failureAnalysisReporterList).when(springFactoriesLoaderMock).load(FailureAnalysisReporter.class);
		doNothing().when(failureAnalysisReporterMock).report(failureAnalysisMock);
		//Act Statement(s)
		boolean result = target.reportException(throwable);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.TRUE));
			verify(springFactoriesLoaderMock).load(eq(FailureAnalyzer.class), eq((SpringFactoriesLoader.ArgumentResolver) null), (SpringFactoriesLoader.FailureHandler) any());
			verify(failureAnalyzerMock).analyze(throwable);
			verify(springFactoriesLoaderMock).load(FailureAnalysisReporter.class);
			verify(failureAnalysisReporterMock).report(failureAnalysisMock);
		});
	}
}
