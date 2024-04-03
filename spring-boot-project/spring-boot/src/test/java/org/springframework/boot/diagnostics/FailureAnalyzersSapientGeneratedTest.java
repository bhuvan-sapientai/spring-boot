package org.springframework.boot.diagnostics;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.core.io.support.SpringFactoriesLoader;

import org.apache.commons.logging.impl.NoOpLog;

import org.springframework.core.log.LogMessage;

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

	private final FailureAnalysisReporter failureAnalysisReporterMock = mock(FailureAnalysisReporter.class);

	private final FailureAnalyzer failureAnalyzerMock = mock(FailureAnalyzer.class);

	private final SpringFactoriesLoader.FailureHandler springFactoriesLoaderFailureHandlerMock = mock(SpringFactoriesLoader.FailureHandler.class);

	//Sapient generated method id: ${27e34d66-e50b-33ac-8764-d148bf1a4ad1}, hash: EB63221A7DA015E3AE2BC2F2BE4F3629
	@Disabled()
	@Test()
	void reportExceptionWhenAnalysisIsNullAndAnalysisIsNull() throws Throwable {
		/* Branches:
		 * (for-each(analyzers)) : true  #  inside analyze method
		 * (analysis != null) : false  #  inside analyze method
		 * (analysis == null) : true  #  inside report method
		 */
		//Arrange Statement(s)
		try (MockedStatic<SpringFactoriesLoader.FailureHandler> springFactoriesLoaderFailureHandler = mockStatic(SpringFactoriesLoader.FailureHandler.class)) {
			List<FailureAnalyzer> failureAnalyzerList = new ArrayList<>();
			failureAnalyzerList.add(failureAnalyzerMock);
			doReturn(failureAnalyzerList).when(springFactoriesLoaderMock).load(FailureAnalyzer.class, (SpringFactoriesLoader.ArgumentResolver) null, springFactoriesLoaderFailureHandlerMock);
			Throwable throwable = new Throwable();
			doReturn(null).when(failureAnalyzerMock).analyze(throwable);
			NoOpLog noOpLog = new NoOpLog();
			springFactoriesLoaderFailureHandler.when(() -> SpringFactoriesLoader.FailureHandler.logging(noOpLog)).thenReturn(springFactoriesLoaderFailureHandlerMock);
			FailureAnalyzers target = new FailureAnalyzers((ConfigurableApplicationContext) null, springFactoriesLoaderMock);
			List<FailureAnalysisReporter> failureAnalysisReporterList = new ArrayList<>();
			doReturn(failureAnalysisReporterList).when(springFactoriesLoaderMock).load(FailureAnalysisReporter.class);
			//Act Statement(s)
			boolean result = target.reportException(throwable);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				verify(springFactoriesLoaderMock).load(FailureAnalyzer.class, (SpringFactoriesLoader.ArgumentResolver) null, springFactoriesLoaderFailureHandlerMock);
				verify(failureAnalyzerMock).analyze(throwable);
				springFactoriesLoaderFailureHandler.verify(() -> SpringFactoriesLoader.FailureHandler.logging(noOpLog), atLeast(1));
				verify(springFactoriesLoaderMock).load(FailureAnalysisReporter.class);
			});
		}
	}

	//Sapient generated method id: ${d868620b-5075-32d4-b10a-fddede8d657f}, hash: 8CE8C1A8F116B9ABE00576B6A1B028D8
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
		LogMessage logMessageMock = mock(LogMessage.class);
		try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
			 MockedStatic<SpringFactoriesLoader.FailureHandler> springFactoriesLoaderFailureHandler = mockStatic(SpringFactoriesLoader.FailureHandler.class)) {
			List<FailureAnalyzer> failureAnalyzerList = new ArrayList<>();
			failureAnalyzerList.add(failureAnalyzerMock);
			doReturn(failureAnalyzerList).when(springFactoriesLoaderMock).load(eq(FailureAnalyzer.class), eq((SpringFactoriesLoader.ArgumentResolver) null), (SpringFactoriesLoader.FailureHandler) any());
			Throwable throwable = new Throwable();
			FailureAnalysis failureAnalysis = new FailureAnalysis("description1", "action1", throwable);
			Throwable throwable2 = new Throwable();
			doReturn(failureAnalysis).when(failureAnalyzerMock).analyze(throwable2);
			SpringFactoriesLoader.FailureHandler failureHandler = SpringFactoriesLoader.FailureHandler.throwing();
			NoOpLog noOpLog = new NoOpLog();
			springFactoriesLoaderFailureHandler.when(() -> SpringFactoriesLoader.FailureHandler.logging(noOpLog)).thenReturn(failureHandler);
			logMessage.when(() -> LogMessage.format("FailureAnalyzer %s failed", failureAnalyzerMock)).thenReturn(logMessageMock);
			FailureAnalyzers target = new FailureAnalyzers((ConfigurableApplicationContext) null, springFactoriesLoaderMock);
			List<FailureAnalysisReporter> failureAnalysisReporterList = new ArrayList<>();
			failureAnalysisReporterList.add(failureAnalysisReporterMock);
			doReturn(failureAnalysisReporterList).when(springFactoriesLoaderMock).load(FailureAnalysisReporter.class);
			//Act Statement(s)
			boolean result = target.reportException(throwable2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				verify(springFactoriesLoaderMock).load(eq(FailureAnalyzer.class), eq((SpringFactoriesLoader.ArgumentResolver) null), (SpringFactoriesLoader.FailureHandler) any());
				verify(failureAnalyzerMock).analyze(throwable2);
				springFactoriesLoaderFailureHandler.verify(() -> SpringFactoriesLoader.FailureHandler.logging(noOpLog), atLeast(1));
				logMessage.verify(() -> LogMessage.format("FailureAnalyzer %s failed", failureAnalyzerMock), atLeast(1));
				verify(springFactoriesLoaderMock).load(FailureAnalysisReporter.class);
			});
		}
	}

	//Sapient generated method id: ${f6dfcae9-0d28-30bf-882e-8a54e040eae5}, hash: A3E2EF741BE4D87FC2402009C6B55DC6
	@Disabled()
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
		FailureAnalysis failureAnalysisMock = mock(FailureAnalysis.class);
		try (MockedStatic<SpringFactoriesLoader.FailureHandler> springFactoriesLoaderFailureHandler = mockStatic(SpringFactoriesLoader.FailureHandler.class)) {
			List<FailureAnalyzer> failureAnalyzerList = new ArrayList<>();
			failureAnalyzerList.add(failureAnalyzerMock);
			doReturn(failureAnalyzerList).when(springFactoriesLoaderMock).load(FailureAnalyzer.class, (SpringFactoriesLoader.ArgumentResolver) null, springFactoriesLoaderFailureHandlerMock);
			Throwable throwable = new Throwable();
			doReturn(failureAnalysisMock).when(failureAnalyzerMock).analyze(throwable);
			NoOpLog noOpLog = new NoOpLog();
			springFactoriesLoaderFailureHandler.when(() -> SpringFactoriesLoader.FailureHandler.logging(noOpLog)).thenReturn(springFactoriesLoaderFailureHandlerMock);
			FailureAnalyzers target = new FailureAnalyzers((ConfigurableApplicationContext) null, springFactoriesLoaderMock);
			List<FailureAnalysisReporter> failureAnalysisReporterList = new ArrayList<>();
			failureAnalysisReporterList.add(failureAnalysisReporterMock);
			doReturn(failureAnalysisReporterList).when(springFactoriesLoaderMock).load(FailureAnalysisReporter.class);
			doNothing().when(failureAnalysisReporterMock).report(failureAnalysisMock);
			//Act Statement(s)
			boolean result = target.reportException(throwable);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				verify(springFactoriesLoaderMock).load(FailureAnalyzer.class, (SpringFactoriesLoader.ArgumentResolver) null, springFactoriesLoaderFailureHandlerMock);
				verify(failureAnalyzerMock).analyze(throwable);
				springFactoriesLoaderFailureHandler.verify(() -> SpringFactoriesLoader.FailureHandler.logging(noOpLog), atLeast(1));
				verify(springFactoriesLoaderMock).load(FailureAnalysisReporter.class);
				verify(failureAnalysisReporterMock).report(failureAnalysisMock);
			});
		}
	}
}
