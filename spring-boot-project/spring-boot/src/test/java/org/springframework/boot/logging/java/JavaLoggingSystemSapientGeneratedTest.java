package org.springframework.boot.logging.java;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.List;

import org.mockito.stubbing.Answer;

import org.springframework.boot.logging.LoggerConfiguration;
import org.springframework.boot.logging.LoggingInitializationContext;

import java.util.Set;

import org.springframework.util.StringUtils;
import org.springframework.util.Assert;

import java.io.Reader;

import org.springframework.boot.logging.LogLevel;
import org.springframework.util.ResourceUtils;

import java.net.URL;

import org.mockito.MockedStatic;

import org.springframework.util.FileCopyUtils;
import org.springframework.boot.logging.LogFile;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JavaLoggingSystemSapientGeneratedTest {

	private final LogFile logFileMock = mock(LogFile.class, "loadConfiguration_logFile1");

	private final LoggingInitializationContext loggingInitializationContextMock = mock(LoggingInitializationContext.class);

	//Sapient generated method id: ${5a1250c3-53ff-343b-84f3-94443200df8f}, hash: B51A6F2D5844A9F82FE10EAA26A18BBF
	@Test()
	void getStandardConfigLocationsTest() {
		//Arrange Statement(s)
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		JavaLoggingSystem target = new JavaLoggingSystem(classLoader);
		//Act Statement(s)
		String[] result = target.getStandardConfigLocations();
		String[] stringResultArray = new String[] { "logging.properties" };
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(stringResultArray)));
	}

	//Sapient generated method id: ${ad54bd8f-d876-3b12-8f91-715323a57500}, hash: 94BE4F95A747A4873B7091122B3FCAEB
	@Test()
	void beforeInitializeTest() {
		//Arrange Statement(s)
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		JavaLoggingSystem target = new JavaLoggingSystem(classLoader);
		//Act Statement(s)
		target.beforeInitialize();
	}

	//Sapient generated method id: ${ab30a742-738c-3366-8b58-ac5d3f5bb0c4}, hash: 194DD7549BD4435D8DC9F61A7F794600
	@Test()
	void loadDefaultsWhenLogFileIsNotNull() throws Exception {
		/* Branches:
		 * (logFile != null) : true
		 */
		//Arrange Statement(s)
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		JavaLoggingSystem target = spy(new JavaLoggingSystem(classLoader));
		LogFile logFileMock = mock(LogFile.class);
		doNothing().when(target).loadConfiguration("classpath:org/springframework/boot/logging/java/logging-file.properties", logFileMock);
		//Act Statement(s)
		target.loadDefaults(loggingInitializationContextMock, logFileMock);
		//Assert statement(s)
		assertAll("result", () -> verify(target).loadConfiguration("classpath:org/springframework/boot/logging/java/logging-file.properties", logFileMock));
	}

	//Sapient generated method id: ${17d58b05-9b3d-387c-8073-47ea91528b78}, hash: 31F6DC6E192657E792BA7476BEF946D5
	@Test()
	void loadDefaultsWhenLogFileIsNull() throws Exception {
		/* Branches:
		 * (logFile != null) : false
		 */
		//Arrange Statement(s)
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		JavaLoggingSystem target = spy(new JavaLoggingSystem(classLoader));
		doNothing().when(target).loadConfiguration("classpath:org/springframework/boot/logging/java/logging.properties", (LogFile) null);
		LogFile logFile = null;
		//Act Statement(s)
		target.loadDefaults(loggingInitializationContextMock, logFile);
		//Assert statement(s)
		assertAll("result", () -> verify(target).loadConfiguration("classpath:org/springframework/boot/logging/java/logging.properties", (LogFile) null));
	}

	//Sapient generated method id: ${9b5ab968-45d4-3e62-9d6e-78e0871df18a}, hash: F3BB99B2D6C1D4068AC83131CCDC7CE9
	@Test()
	void loadConfigurationTest() throws Exception {
		//Arrange Statement(s)
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		JavaLoggingSystem target = spy(new JavaLoggingSystem(classLoader));
		LogFile logFileMock = mock(LogFile.class);
		doNothing().when(target).loadConfiguration("location1", logFileMock);
		//Act Statement(s)
		target.loadConfiguration(loggingInitializationContextMock, "location1", logFileMock);
		//Assert statement(s)
		assertAll("result", () -> verify(target).loadConfiguration("location1", logFileMock));
	}

	//Sapient generated method id: ${cb081a4a-6d69-3432-8836-0e6fc0ac2c27}, hash: F277972E38007ADDD87DE6BCA8441C02
	@Disabled()
	@Test()
	void loadConfiguration1WhenLogFileIsNotNull() throws Exception {
		/* Branches:
		 * (logFile != null) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type LogManager
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<FileCopyUtils> fileCopyUtils = mockStatic(FileCopyUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("A", "Location must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			fileCopyUtils.when(() -> FileCopyUtils.copyToString((Reader) any())).thenReturn(".{LOG_FILE}");
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			JavaLoggingSystem target = new JavaLoggingSystem(classLoader);
			//Act Statement(s)
			target.loadConfiguration("A", logFileMock);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull("A", "Location must not be null"), atLeast(1));
				fileCopyUtils.verify(() -> FileCopyUtils.copyToString((Reader) any()));
			});
		}
	}

	//Sapient generated method id: ${d8aa49fb-f8d7-35a5-8379-a9af06a492bc}, hash: 2EF1B2002BEDFE7157C117DB42907512
	@Disabled()
	@Test()
	void loadConfiguration1WhenCaughtExceptionThrowsIllegalStateException() throws IOException, SecurityException, FileNotFoundException {
		/* Branches:
		 * (logFile != null) : true
		 * (catch-exception (Exception)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type LogManager
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<FileCopyUtils> fileCopyUtils = mockStatic(FileCopyUtils.class);
			 MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("A", "Location must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			URL uRL = ResourceUtils.getURL("A");
			resourceUtils.when(() -> ResourceUtils.getURL("A")).thenReturn(uRL);
			fileCopyUtils.when(() -> FileCopyUtils.copyToString((Reader) any())).thenReturn(".{LOG_FILE}");
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			JavaLoggingSystem target = new JavaLoggingSystem(classLoader);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.loadConfiguration("A", logFileMock);
			});
			Exception exception = new Exception();
			IllegalStateException illegalStateException = new IllegalStateException("Could not initialize Java logging from A", exception);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(exception.getClass())));
				_assert.verify(() -> Assert.notNull("A", "Location must not be null"), atLeast(1));
				resourceUtils.verify(() -> ResourceUtils.getURL("A"), atLeast(1));
				fileCopyUtils.verify(() -> FileCopyUtils.copyToString((Reader) any()));
			});
		}
	}

	//Sapient generated method id: ${82f1eac0-2fc3-39e9-ac77-65b21be0daa5}, hash: 8C562360F4899597044E774DC240FFDD
	@Disabled()
	@Test()
	void getSupportedLogLevelsTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: LEVELS
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		JavaLoggingSystem target = new JavaLoggingSystem(classLoader);
		//Act Statement(s)
		Set<LogLevel> result = target.getSupportedLogLevels();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result.size(), equalTo(0)));
	}

	//Sapient generated method id: ${d08a78e4-e1f9-3b2f-b8cd-7b13a29ff4f9}, hash: 8763E70FA5750FAFCB96C57F3B1E67C7
	@Test()
	void setLogLevelWhenROOT_LOGGER_NAMEEqualsLoggerNameAndLoggerIsNotNull() {
		/* Branches:
		 * (loggerName == null) : false
		 * (ROOT_LOGGER_NAME.equals(loggerName)) : true
		 * (logger != null) : true
		 */
		//Arrange Statement(s)
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		JavaLoggingSystem target = new JavaLoggingSystem(classLoader);
		//Act Statement(s)
		target.setLogLevel("ROOT", LogLevel.OFF);
	}

	//Sapient generated method id: ${855a9e38-7486-375a-821a-b4bc7d5739af}, hash: 7D02113380AB0EF4FE95EDD5771AC896
	@Disabled()
	@Test()
	void getLoggerConfigurationsWhenNamesHasMoreElements() {
		/* Branches:
		 * (names.hasMoreElements()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		JavaLoggingSystem target = spy(new JavaLoggingSystem(classLoader));
		LoggerConfiguration loggerConfigurationMock = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock).when(target).getLoggerConfiguration("");
		LoggerConfiguration loggerConfigurationMock2 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock2).when(target).getLoggerConfiguration("#com.intellij.openapi.actionSystem.impl.segmentedActionBar.SegmentedActionToolbarComponent");
		LoggerConfiguration loggerConfigurationMock3 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock3).when(target).getLoggerConfiguration("#com.intellij.util.indexing.contentQueue.IndexUpdateRunner");
		LoggerConfiguration loggerConfigurationMock4 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock4).when(target).getLoggerConfiguration("#org.zmlx.hg4idea.util.HgUtil");
		LoggerConfiguration loggerConfigurationMock5 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock5).when(target).getLoggerConfiguration("com.intellij.ui.HyperlinkLabel");
		LoggerConfiguration loggerConfigurationMock6 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock6).when(target).getLoggerConfiguration("#com.intellij.psi.impl.java.stubs.impl.PsiAnnotationStubImpl");
		LoggerConfiguration loggerConfigurationMock7 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock7).when(target).getLoggerConfiguration("#com.intellij.codeInspection.i18n.I18nizeAction");
		LoggerConfiguration loggerConfigurationMock8 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock8).when(target).getLoggerConfiguration("#com.intellij.codeInspection.htmlInspections.HtmlUnknownBooleanAttributeInspectionBase");
		LoggerConfiguration loggerConfigurationMock9 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock9).when(target).getLoggerConfiguration("#com.intellij.psi.impl.source.tree.java.AnnotationParamListElement");
		LoggerConfiguration loggerConfigurationMock10 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock10).when(target).getLoggerConfiguration("#git4idea.actions.GitPull");
		LoggerConfiguration loggerConfigurationMock11 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock11).when(target).getLoggerConfiguration("#com.intellij.openapi.vcs.actions.AnnotateToggleAction");
		LoggerConfiguration loggerConfigurationMock12 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock12).when(target).getLoggerConfiguration("org.languagetool.rules.spelling.morfologik.MorfologikSpellerRule");
		LoggerConfiguration loggerConfigurationMock13 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock13).when(target).getLoggerConfiguration("#git4idea.log.GitLogProvider");
		LoggerConfiguration loggerConfigurationMock14 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock14).when(target).getLoggerConfiguration("#com.intellij.openapi.vfs.impl.local.WatchRootsManager");
		LoggerConfiguration loggerConfigurationMock15 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock15).when(target).getLoggerConfiguration("#org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl");
		LoggerConfiguration loggerConfigurationMock16 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock16).when(target).getLoggerConfiguration("#com.intellij.lang.ant.config.impl.AntReference");
		LoggerConfiguration loggerConfigurationMock17 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock17).when(target).getLoggerConfiguration("#com.intellij.refactoring.extractInterface.ExtractInterfaceHandler");
		LoggerConfiguration loggerConfigurationMock18 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock18).when(target).getLoggerConfiguration("#com.intellij.openapi.wm.impl.PainterHelper");
		LoggerConfiguration loggerConfigurationMock19 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock19).when(target).getLoggerConfiguration("#com.intellij.codeInsight.editorActions.TypedHandler");
		LoggerConfiguration loggerConfigurationMock20 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock20).when(target).getLoggerConfiguration("#com.intellij.codeInspection.SurroundWithIfFix");
		LoggerConfiguration loggerConfigurationMock21 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock21).when(target).getLoggerConfiguration("#com.intellij.execution.process.KillableProcessHandler");
		LoggerConfiguration loggerConfigurationMock22 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock22).when(target).getLoggerConfiguration("#com.intellij.openapi.vcs.impl.PartialChangesUtil");
		LoggerConfiguration loggerConfigurationMock23 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock23).when(target).getLoggerConfiguration("#com.intellij.execution.testDiscovery.TestDiscoveryIndex");
		LoggerConfiguration loggerConfigurationMock24 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock24).when(target).getLoggerConfiguration("#org.jetbrains.plugins.terminal.ShellTerminalWidget");
		LoggerConfiguration loggerConfigurationMock25 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock25).when(target).getLoggerConfiguration("#com.intellij.lang.properties.PropertiesUastReferenceContributor");
		LoggerConfiguration loggerConfigurationMock26 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock26).when(target).getLoggerConfiguration("#com.intellij.debugger.ui.breakpoints.ExceptionBreakpoint");
		LoggerConfiguration loggerConfigurationMock27 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock27).when(target).getLoggerConfiguration("#zielu.gittoolbox.blame");
		LoggerConfiguration loggerConfigurationMock28 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock28).when(target).getLoggerConfiguration("#com.intellij.psi.impl.source.xml.XmlDoctypeImpl");
		LoggerConfiguration loggerConfigurationMock29 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock29).when(target).getLoggerConfiguration("#com.intellij.psi.impl.source.tree.java.MethodReferenceResolver");
		LoggerConfiguration loggerConfigurationMock30 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock30).when(target).getLoggerConfiguration("#org.jetbrains.idea.perforce.application.PerforceClientRootsChecker");
		LoggerConfiguration loggerConfigurationMock31 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock31).when(target).getLoggerConfiguration("jetbrains.exodus.gc.GarbageCollector");
		LoggerConfiguration loggerConfigurationMock32 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock32).when(target).getLoggerConfiguration("#com.intellij.codeInsight.daemon.impl.quickfix.DefineParamsDefaultValueAction");
		LoggerConfiguration loggerConfigurationMock33 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock33).when(target).getLoggerConfiguration("#com.intellij.externalProcessAuthHelper.ExternalProcessRest");
		LoggerConfiguration loggerConfigurationMock34 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock34).when(target).getLoggerConfiguration("#com.intellij.openapi.util.LowMemoryWatcher");
		LoggerConfiguration loggerConfigurationMock35 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock35).when(target).getLoggerConfiguration("#com.intellij.codeInspection.dataFlow.ConstantValueInspection");
		LoggerConfiguration loggerConfigurationMock36 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock36).when(target).getLoggerConfiguration("sun.lwawt.macosx.CPlatformView");
		LoggerConfiguration loggerConfigurationMock37 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock37).when(target).getLoggerConfiguration("#org.zmlx.hg4idea.util.HgVersion");
		LoggerConfiguration loggerConfigurationMock38 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock38).when(target).getLoggerConfiguration("#com.intellij.codeInsight.actions.VcsFacade");
		LoggerConfiguration loggerConfigurationMock39 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock39).when(target).getLoggerConfiguration("#com.intellij.openapi.paths.PathReferenceProviderBase");
		LoggerConfiguration loggerConfigurationMock40 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock40).when(target).getLoggerConfiguration("#com.intellij.codeInsight.daemon.impl.analysis.LambdaHighlightingUtil");
		LoggerConfiguration loggerConfigurationMock41 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock41).when(target).getLoggerConfiguration("#com.intellij.toolWindow.ToolWindowPane");
		LoggerConfiguration loggerConfigurationMock42 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock42).when(target).getLoggerConfiguration("#com.intellij.concurrency.JobLauncher");
		LoggerConfiguration loggerConfigurationMock43 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock43).when(target).getLoggerConfiguration("#com.intellij.codeInspection.CommonProblemDescriptorImpl");
		LoggerConfiguration loggerConfigurationMock44 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock44).when(target).getLoggerConfiguration("#com.intellij.openapi.editor.impl.SelectionModelImpl");
		LoggerConfiguration loggerConfigurationMock45 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock45).when(target).getLoggerConfiguration("#com.intellij.execution.actions.BaseRunConfigurationAction");
		LoggerConfiguration loggerConfigurationMock46 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock46).when(target).getLoggerConfiguration("okhttp3.OkHttpClient");
		LoggerConfiguration loggerConfigurationMock47 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock47).when(target).getLoggerConfiguration("jdk.internal.httpclient.debug");
		LoggerConfiguration loggerConfigurationMock48 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock48).when(target).getLoggerConfiguration("#com.intellij.codeInsight.daemon.impl.DaemonListeners");
		LoggerConfiguration loggerConfigurationMock49 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock49).when(target).getLoggerConfiguration("#com.intellij.indexing.shared.util.zipFs.UncompressedZipFileSystem");
		LoggerConfiguration loggerConfigurationMock50 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock50).when(target).getLoggerConfiguration("#com.intellij.openapi.editor.impl.IntervalTreeImpl");
		LoggerConfiguration loggerConfigurationMock51 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock51).when(target).getLoggerConfiguration("#org.intellij.plugins.xpathView.XPathEvalAction");
		LoggerConfiguration loggerConfigurationMock52 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock52).when(target).getLoggerConfiguration("#git4idea.index.GitStageTracker");
		LoggerConfiguration loggerConfigurationMock53 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock53).when(target).getLoggerConfiguration("#com.intellij.psi.search.scope.packageSet.FilePatternPackageSet");
		LoggerConfiguration loggerConfigurationMock54 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock54).when(target).getLoggerConfiguration("#com.intellij.codeInsight.folding.impl.UpdateFoldRegionsOperation");
		LoggerConfiguration loggerConfigurationMock55 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock55).when(target).getLoggerConfiguration("#com.intellij.openapi.roots.impl.libraries.RenameLibraryHandler");
		LoggerConfiguration loggerConfigurationMock56 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock56).when(target).getLoggerConfiguration("#com.intellij.openapi.editor.impl.softwrap.mapping.CachingSoftWrapDataMapper");
		LoggerConfiguration loggerConfigurationMock57 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock57).when(target).getLoggerConfiguration("#com.intellij.psi.controlFlow.ControlFlowAnalyzer");
		LoggerConfiguration loggerConfigurationMock58 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock58).when(target).getLoggerConfiguration("com.sun.xml.bind.v2.runtime.reflect.Accessor$FieldReflection");
		LoggerConfiguration loggerConfigurationMock59 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock59).when(target).getLoggerConfiguration("#com.intellij.externalProcessAuthHelper.ExternalProcessHandlerService");
		LoggerConfiguration loggerConfigurationMock60 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock60).when(target).getLoggerConfiguration("#com.intellij.execution.RunManager");
		LoggerConfiguration loggerConfigurationMock61 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock61).when(target).getLoggerConfiguration("org.apache.commons.beanutils.converters.BooleanConverter");
		LoggerConfiguration loggerConfigurationMock62 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock62).when(target).getLoggerConfiguration("#com.intellij.codeInspection.dataFlow.interpreter.StandardDataFlowInterpreter");
		LoggerConfiguration loggerConfigurationMock63 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock63).when(target).getLoggerConfiguration("#com.intellij.compiler.server.impl.BuildProcessClasspathManager");
		LoggerConfiguration loggerConfigurationMock64 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock64).when(target).getLoggerConfiguration("#com.intellij.openapi.wm.impl.ToolWindowManagerImpl");
		LoggerConfiguration loggerConfigurationMock65 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock65).when(target).getLoggerConfiguration("#com.intellij.psi.GenericsUtil");
		LoggerConfiguration loggerConfigurationMock66 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock66).when(target).getLoggerConfiguration("#com.intellij.openapi.editor.richcopy.view.AbstractSyntaxAwareReader");
		LoggerConfiguration loggerConfigurationMock67 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock67).when(target).getLoggerConfiguration("#com.intellij.openapi.vcs.changes.VcsIgnoreManagerImpl");
		LoggerConfiguration loggerConfigurationMock68 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock68).when(target).getLoggerConfiguration("#com.intellij.psi.impl.migration.PsiMigrationManager");
		LoggerConfiguration loggerConfigurationMock69 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock69).when(target).getLoggerConfiguration("#com.intellij.util.indexing.UnindexedFilesScannerExecutor");
		LoggerConfiguration loggerConfigurationMock70 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock70).when(target).getLoggerConfiguration("org.gradle.tooling.GradleConnector");
		LoggerConfiguration loggerConfigurationMock71 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock71).when(target).getLoggerConfiguration("#com.intellij.framework.detection.impl.DetectedFrameworksData");
		LoggerConfiguration loggerConfigurationMock72 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock72).when(target).getLoggerConfiguration("#com.intellij.codeInspection.dataFlow.java.inst.MethodCallInstruction");
		LoggerConfiguration loggerConfigurationMock73 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock73).when(target).getLoggerConfiguration("#com.theoryinpractice.testng.inspection.DuplicatedDataProviderNamesInspection");
		LoggerConfiguration loggerConfigurationMock74 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock74).when(target).getLoggerConfiguration("#com.intellij.openapi.wm.impl.SideStack");
		LoggerConfiguration loggerConfigurationMock75 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock75).when(target).getLoggerConfiguration("#com.jetbrains.rdserver.daemon.RdServerEditorTracker");
		LoggerConfiguration loggerConfigurationMock76 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock76).when(target).getLoggerConfiguration("#com.intellij.codeInsight.daemon.impl.DefaultHighlightVisitor");
		LoggerConfiguration loggerConfigurationMock77 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock77).when(target).getLoggerConfiguration("#com.intellij.psi.impl.source.tree.SharedImplUtil");
		LoggerConfiguration loggerConfigurationMock78 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock78).when(target).getLoggerConfiguration("#com.intellij.util.indexing.diagnostic.IndexOperationFUS");
		LoggerConfiguration loggerConfigurationMock79 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock79).when(target).getLoggerConfiguration("#com.intellij.psi.formatter.common.InjectedLanguageBlockBuilder");
		LoggerConfiguration loggerConfigurationMock80 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock80).when(target).getLoggerConfiguration("org.eclipse.aether.internal.impl.TrackingFileManager");
		LoggerConfiguration loggerConfigurationMock81 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock81).when(target).getLoggerConfiguration("#org.jetbrains.plugins.groovy.codeInspection.confusing.GrUnusedIncDecInspection");
		LoggerConfiguration loggerConfigurationMock82 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock82).when(target).getLoggerConfiguration("#com.intellij.util.indexing.ProjectChangedFilesScanner");
		LoggerConfiguration loggerConfigurationMock83 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock83).when(target).getLoggerConfiguration("#com.intellij.psi.impl.source.resolve.ClassResolverProcessor");
		LoggerConfiguration loggerConfigurationMock84 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock84).when(target).getLoggerConfiguration("#com.intellij.usages.UsageViewPresentation");
		LoggerConfiguration loggerConfigurationMock85 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock85).when(target).getLoggerConfiguration("#git4idea.rebase.GitSimpleEditorHandler");
		LoggerConfiguration loggerConfigurationMock86 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock86).when(target).getLoggerConfiguration("#zielu.gittoolbox.ui");
		LoggerConfiguration loggerConfigurationMock87 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock87).when(target).getLoggerConfiguration("java.awt.event.InputEvent");
		LoggerConfiguration loggerConfigurationMock88 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock88).when(target).getLoggerConfiguration("#com.intellij.lang.documentation.psi");
		LoggerConfiguration loggerConfigurationMock89 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock89).when(target).getLoggerConfiguration("#com.intellij.util.containers.Enumerator");
		LoggerConfiguration loggerConfigurationMock90 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock90).when(target).getLoggerConfiguration("#com.intellij.vcs.log.impl.VcsLogCachesInvalidator");
		LoggerConfiguration loggerConfigurationMock91 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock91).when(target).getLoggerConfiguration("#com.intellij.util.MethodInvocator");
		LoggerConfiguration loggerConfigurationMock92 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock92).when(target).getLoggerConfiguration("#org.jetbrains.kotlin.idea.script.ScriptTemplatesFromDependenciesProvider");
		LoggerConfiguration loggerConfigurationMock93 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock93).when(target).getLoggerConfiguration("#com.intellij.uiDesigner.binding.FormClassAnnotator");
		LoggerConfiguration loggerConfigurationMock94 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock94).when(target).getLoggerConfiguration("#com.intellij.codeInspection.htmlInspections.HtmlUnknownAttributeInspectionBase");
		LoggerConfiguration loggerConfigurationMock95 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock95).when(target).getLoggerConfiguration("#com.android.tools.idea.run.ui.BaseAction");
		LoggerConfiguration loggerConfigurationMock96 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock96).when(target).getLoggerConfiguration("#com.intellij.ide.impl.DataValidators");
		LoggerConfiguration loggerConfigurationMock97 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock97).when(target).getLoggerConfiguration("#com.intellij.vcs.log.data.index.VcsLogUserIndex");
		LoggerConfiguration loggerConfigurationMock98 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock98).when(target).getLoggerConfiguration("#org.jetbrains.android.AndroidDocumentationProvider");
		LoggerConfiguration loggerConfigurationMock99 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock99).when(target).getLoggerConfiguration("#com.intellij.openapi.projectRoots.impl.UnknownSdkCollector");
		LoggerConfiguration loggerConfigurationMock100 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock100).when(target).getLoggerConfiguration("#com.intellij.openapi.vcs.changes.committed.CommittedChangesCache");
		LoggerConfiguration loggerConfigurationMock101 = mock(LoggerConfiguration.class);
		doReturn(loggerConfigurationMock101).when(target).getLoggerConfiguration("#com.intellij.util.indexing.PerProjectIndexingQueue");
		//Act Statement(s)
		List<LoggerConfiguration> result = target.getLoggerConfigurations();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(101));
			assertThat(result.get(0), is(instanceOf(LoggerConfiguration.class)));
			verify(target).getLoggerConfiguration("");
			verify(target).getLoggerConfiguration("#com.intellij.openapi.actionSystem.impl.segmentedActionBar.SegmentedActionToolbarComponent");
			verify(target).getLoggerConfiguration("#com.intellij.util.indexing.contentQueue.IndexUpdateRunner");
			verify(target).getLoggerConfiguration("#org.zmlx.hg4idea.util.HgUtil");
			verify(target).getLoggerConfiguration("com.intellij.ui.HyperlinkLabel");
			verify(target).getLoggerConfiguration("#com.intellij.psi.impl.java.stubs.impl.PsiAnnotationStubImpl");
			verify(target).getLoggerConfiguration("#com.intellij.codeInspection.i18n.I18nizeAction");
			verify(target).getLoggerConfiguration("#com.intellij.codeInspection.htmlInspections.HtmlUnknownBooleanAttributeInspectionBase");
			verify(target).getLoggerConfiguration("#com.intellij.psi.impl.source.tree.java.AnnotationParamListElement");
			verify(target).getLoggerConfiguration("#git4idea.actions.GitPull");
			verify(target).getLoggerConfiguration("#com.intellij.openapi.vcs.actions.AnnotateToggleAction");
			verify(target).getLoggerConfiguration("org.languagetool.rules.spelling.morfologik.MorfologikSpellerRule");
			verify(target).getLoggerConfiguration("#git4idea.log.GitLogProvider");
			verify(target).getLoggerConfiguration("#com.intellij.openapi.vfs.impl.local.WatchRootsManager");
			verify(target).getLoggerConfiguration("#org.jetbrains.kotlin.psi.stubs.impl.KotlinStubBaseImpl");
			verify(target).getLoggerConfiguration("#com.intellij.lang.ant.config.impl.AntReference");
			verify(target).getLoggerConfiguration("#com.intellij.refactoring.extractInterface.ExtractInterfaceHandler");
			verify(target).getLoggerConfiguration("#com.intellij.openapi.wm.impl.PainterHelper");
			verify(target).getLoggerConfiguration("#com.intellij.codeInsight.editorActions.TypedHandler");
			verify(target).getLoggerConfiguration("#com.intellij.codeInspection.SurroundWithIfFix");
			verify(target).getLoggerConfiguration("#com.intellij.execution.process.KillableProcessHandler");
			verify(target).getLoggerConfiguration("#com.intellij.openapi.vcs.impl.PartialChangesUtil");
			verify(target).getLoggerConfiguration("#com.intellij.execution.testDiscovery.TestDiscoveryIndex");
			verify(target).getLoggerConfiguration("#org.jetbrains.plugins.terminal.ShellTerminalWidget");
			verify(target).getLoggerConfiguration("#com.intellij.lang.properties.PropertiesUastReferenceContributor");
			verify(target).getLoggerConfiguration("#com.intellij.debugger.ui.breakpoints.ExceptionBreakpoint");
			verify(target).getLoggerConfiguration("#zielu.gittoolbox.blame");
			verify(target).getLoggerConfiguration("#com.intellij.psi.impl.source.xml.XmlDoctypeImpl");
			verify(target).getLoggerConfiguration("#com.intellij.psi.impl.source.tree.java.MethodReferenceResolver");
			verify(target).getLoggerConfiguration("#org.jetbrains.idea.perforce.application.PerforceClientRootsChecker");
			verify(target).getLoggerConfiguration("jetbrains.exodus.gc.GarbageCollector");
			verify(target).getLoggerConfiguration("#com.intellij.codeInsight.daemon.impl.quickfix.DefineParamsDefaultValueAction");
			verify(target).getLoggerConfiguration("#com.intellij.externalProcessAuthHelper.ExternalProcessRest");
			verify(target).getLoggerConfiguration("#com.intellij.openapi.util.LowMemoryWatcher");
			verify(target).getLoggerConfiguration("#com.intellij.codeInspection.dataFlow.ConstantValueInspection");
			verify(target).getLoggerConfiguration("sun.lwawt.macosx.CPlatformView");
			verify(target).getLoggerConfiguration("#org.zmlx.hg4idea.util.HgVersion");
			verify(target).getLoggerConfiguration("#com.intellij.codeInsight.actions.VcsFacade");
			verify(target).getLoggerConfiguration("#com.intellij.openapi.paths.PathReferenceProviderBase");
			verify(target).getLoggerConfiguration("#com.intellij.codeInsight.daemon.impl.analysis.LambdaHighlightingUtil");
			verify(target).getLoggerConfiguration("#com.intellij.toolWindow.ToolWindowPane");
			verify(target).getLoggerConfiguration("#com.intellij.concurrency.JobLauncher");
			verify(target).getLoggerConfiguration("#com.intellij.codeInspection.CommonProblemDescriptorImpl");
			verify(target).getLoggerConfiguration("#com.intellij.openapi.editor.impl.SelectionModelImpl");
			verify(target).getLoggerConfiguration("#com.intellij.execution.actions.BaseRunConfigurationAction");
			verify(target).getLoggerConfiguration("okhttp3.OkHttpClient");
			verify(target).getLoggerConfiguration("jdk.internal.httpclient.debug");
			verify(target).getLoggerConfiguration("#com.intellij.codeInsight.daemon.impl.DaemonListeners");
			verify(target).getLoggerConfiguration("#com.intellij.indexing.shared.util.zipFs.UncompressedZipFileSystem");
			verify(target).getLoggerConfiguration("#com.intellij.openapi.editor.impl.IntervalTreeImpl");
			verify(target).getLoggerConfiguration("#org.intellij.plugins.xpathView.XPathEvalAction");
			verify(target).getLoggerConfiguration("#git4idea.index.GitStageTracker");
			verify(target).getLoggerConfiguration("#com.intellij.psi.search.scope.packageSet.FilePatternPackageSet");
			verify(target).getLoggerConfiguration("#com.intellij.codeInsight.folding.impl.UpdateFoldRegionsOperation");
			verify(target).getLoggerConfiguration("#com.intellij.openapi.roots.impl.libraries.RenameLibraryHandler");
			verify(target).getLoggerConfiguration("#com.intellij.openapi.editor.impl.softwrap.mapping.CachingSoftWrapDataMapper");
			verify(target).getLoggerConfiguration("#com.intellij.psi.controlFlow.ControlFlowAnalyzer");
			verify(target).getLoggerConfiguration("com.sun.xml.bind.v2.runtime.reflect.Accessor$FieldReflection");
			verify(target).getLoggerConfiguration("#com.intellij.externalProcessAuthHelper.ExternalProcessHandlerService");
			verify(target).getLoggerConfiguration("#com.intellij.execution.RunManager");
			verify(target).getLoggerConfiguration("org.apache.commons.beanutils.converters.BooleanConverter");
			verify(target).getLoggerConfiguration("#com.intellij.codeInspection.dataFlow.interpreter.StandardDataFlowInterpreter");
			verify(target).getLoggerConfiguration("#com.intellij.compiler.server.impl.BuildProcessClasspathManager");
			verify(target).getLoggerConfiguration("#com.intellij.openapi.wm.impl.ToolWindowManagerImpl");
			verify(target).getLoggerConfiguration("#com.intellij.psi.GenericsUtil");
			verify(target).getLoggerConfiguration("#com.intellij.openapi.editor.richcopy.view.AbstractSyntaxAwareReader");
			verify(target).getLoggerConfiguration("#com.intellij.openapi.vcs.changes.VcsIgnoreManagerImpl");
			verify(target).getLoggerConfiguration("#com.intellij.psi.impl.migration.PsiMigrationManager");
			verify(target).getLoggerConfiguration("#com.intellij.util.indexing.UnindexedFilesScannerExecutor");
			verify(target).getLoggerConfiguration("org.gradle.tooling.GradleConnector");
			verify(target).getLoggerConfiguration("#com.intellij.framework.detection.impl.DetectedFrameworksData");
			verify(target).getLoggerConfiguration("#com.intellij.codeInspection.dataFlow.java.inst.MethodCallInstruction");
			verify(target).getLoggerConfiguration("#com.theoryinpractice.testng.inspection.DuplicatedDataProviderNamesInspection");
			verify(target).getLoggerConfiguration("#com.intellij.openapi.wm.impl.SideStack");
			verify(target).getLoggerConfiguration("#com.jetbrains.rdserver.daemon.RdServerEditorTracker");
			verify(target).getLoggerConfiguration("#com.intellij.codeInsight.daemon.impl.DefaultHighlightVisitor");
			verify(target).getLoggerConfiguration("#com.intellij.psi.impl.source.tree.SharedImplUtil");
			verify(target).getLoggerConfiguration("#com.intellij.util.indexing.diagnostic.IndexOperationFUS");
			verify(target).getLoggerConfiguration("#com.intellij.psi.formatter.common.InjectedLanguageBlockBuilder");
			verify(target).getLoggerConfiguration("org.eclipse.aether.internal.impl.TrackingFileManager");
			verify(target).getLoggerConfiguration("#org.jetbrains.plugins.groovy.codeInspection.confusing.GrUnusedIncDecInspection");
			verify(target).getLoggerConfiguration("#com.intellij.util.indexing.ProjectChangedFilesScanner");
			verify(target).getLoggerConfiguration("#com.intellij.psi.impl.source.resolve.ClassResolverProcessor");
			verify(target).getLoggerConfiguration("#com.intellij.usages.UsageViewPresentation");
			verify(target).getLoggerConfiguration("#git4idea.rebase.GitSimpleEditorHandler");
			verify(target).getLoggerConfiguration("#zielu.gittoolbox.ui");
			verify(target).getLoggerConfiguration("java.awt.event.InputEvent");
			verify(target).getLoggerConfiguration("#com.intellij.lang.documentation.psi");
			verify(target).getLoggerConfiguration("#com.intellij.util.containers.Enumerator");
			verify(target).getLoggerConfiguration("#com.intellij.vcs.log.impl.VcsLogCachesInvalidator");
			verify(target).getLoggerConfiguration("#com.intellij.util.MethodInvocator");
			verify(target).getLoggerConfiguration("#org.jetbrains.kotlin.idea.script.ScriptTemplatesFromDependenciesProvider");
			verify(target).getLoggerConfiguration("#com.intellij.uiDesigner.binding.FormClassAnnotator");
			verify(target).getLoggerConfiguration("#com.intellij.codeInspection.htmlInspections.HtmlUnknownAttributeInspectionBase");
			verify(target).getLoggerConfiguration("#com.android.tools.idea.run.ui.BaseAction");
			verify(target).getLoggerConfiguration("#com.intellij.ide.impl.DataValidators");
			verify(target).getLoggerConfiguration("#com.intellij.vcs.log.data.index.VcsLogUserIndex");
			verify(target).getLoggerConfiguration("#org.jetbrains.android.AndroidDocumentationProvider");
			verify(target).getLoggerConfiguration("#com.intellij.openapi.projectRoots.impl.UnknownSdkCollector");
			verify(target).getLoggerConfiguration("#com.intellij.openapi.vcs.changes.committed.CommittedChangesCache");
			verify(target).getLoggerConfiguration("#com.intellij.util.indexing.PerProjectIndexingQueue");
		});
	}

	//Sapient generated method id: ${1d2112b3-8acc-3521-84da-e493ffddac34}, hash: 86A4349FFCFB3B1DAB3F6B598ADCD5E3
	@Disabled()
	@Test()
	void getLoggerConfigurationWhenLoggerIsNull() {
		/* Branches:
		 * (logger == null) : true
		 */
		//Arrange Statement(s)
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		JavaLoggingSystem target = new JavaLoggingSystem(classLoader);
		//Act Statement(s)
		LoggerConfiguration result = target.getLoggerConfiguration("A");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${249e51d4-a67c-3f36-ae3a-6d201eac9609}, hash: D1F41425840D56B813A42930B29B3CE3
	@Disabled()
	@Test()
	void getLoggerConfigurationWhenStringUtilsHasLengthLoggerGetName() {
		/* Branches:
		 * (logger == null) : false
		 * (logger.getLevel() == null) : true  #  inside getEffectiveLevel method
		 * (StringUtils.hasLength(logger.getName())) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: LEVELS
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		JavaLoggingSystem target = new JavaLoggingSystem(classLoader);
		//Act Statement(s)
		LoggerConfiguration result = target.getLoggerConfiguration("A");
		LoggerConfiguration loggerConfiguration = new LoggerConfiguration("name1", LogLevel.TRACE, LogLevel.TRACE);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(loggerConfiguration)));
	}

	//Sapient generated method id: ${44675f94-23c5-36b0-8d41-9db6cc032a8c}, hash: 93EB415A401CAF1DAA149DCD44A73B97
	@Disabled()
	@Test()
	void getLoggerConfigurationWhenStringUtilsNotHasLengthLoggerGetName() {
		/* Branches:
		 * (logger == null) : false
		 * (logger.getLevel() == null) : true  #  inside getEffectiveLevel method
		 * (StringUtils.hasLength(logger.getName())) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: LEVELS
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasLength("B")).thenReturn(false);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			JavaLoggingSystem target = new JavaLoggingSystem(classLoader);
			//Act Statement(s)
			LoggerConfiguration result = target.getLoggerConfiguration("A");
			LoggerConfiguration loggerConfiguration = new LoggerConfiguration("ROOT", LogLevel.TRACE, LogLevel.TRACE);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(loggerConfiguration));
				stringUtils.verify(() -> StringUtils.hasLength("B"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${1fa3a2e1-a02e-3401-a913-93f2f865166f}, hash: 4CFBBCFE820B3286553E74BE779F49FA
	@Test()
	void getShutdownHandlerTest() {
		//Arrange Statement(s)
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		JavaLoggingSystem target = new JavaLoggingSystem(classLoader);
		//Act Statement(s)
		Runnable result = target.getShutdownHandler();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${90f58dbe-753c-36ac-91d5-9317e7372db1}, hash: AB89E55EA4884014FAC4639176B4C990
	@Test()
	void cleanUpTest() {
		//Arrange Statement(s)
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		JavaLoggingSystem target = new JavaLoggingSystem(classLoader);
		//Act Statement(s)
		target.cleanUp();
	}
}
