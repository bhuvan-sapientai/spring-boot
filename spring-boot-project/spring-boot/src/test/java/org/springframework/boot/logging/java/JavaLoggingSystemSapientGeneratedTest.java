package org.springframework.boot.logging.java;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.boot.logging.LoggerConfiguration;
import org.springframework.util.StringUtils;
import org.springframework.util.Assert;

import java.util.HashSet;

import org.springframework.boot.logging.LogLevel;

import java.util.logging.Level;
import java.util.ArrayList;

import org.mockito.stubbing.Answer;

import org.springframework.boot.logging.AbstractLoggingSystem;
import org.springframework.boot.logging.LoggingInitializationContext;

import java.util.Set;
import java.io.InputStreamReader;

import org.springframework.util.ResourceUtils;

import java.net.URL;

import org.mockito.MockedStatic;

import org.springframework.util.FileCopyUtils;
import org.springframework.boot.logging.LogFile;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JavaLoggingSystemSapientGeneratedTest {

	private final AbstractLoggingSystem.LogLevels<Level> LEVELSMock = mock(AbstractLoggingSystem.LogLevels.class, "LEVELS");

	private final LogFile logFileMock = mock(LogFile.class, "loadConfiguration_logFile1");

	private final LoggingInitializationContext loggingInitializationContextMock = mock(LoggingInitializationContext.class);

	//Sapient generated method id: ${5a1250c3-53ff-343b-84f3-94443200df8f}
	@Test()
	void getStandardConfigLocationsTest() {
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//JavaLoggingSystem target = new JavaLoggingSystem(classLoader);
		//Act Statement(s)
		//String[] result = target.getStandardConfigLocations();
		//String[] stringResultArray = new String[] { "logging.properties" };
		//Assert statement(s)
		//assertAll("result", () -> assertThat(result, equalTo(stringResultArray)));
	}

	//Sapient generated method id: ${ad54bd8f-d876-3b12-8f91-715323a57500}
	@Test()
	void beforeInitializeTest() {
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//JavaLoggingSystem target = new JavaLoggingSystem(classLoader);
		//Act Statement(s)
		//target.beforeInitialize();
	}

	//Sapient generated method id: ${ab30a742-738c-3366-8b58-ac5d3f5bb0c4}
	@Test()
	void loadDefaultsWhenLogFileIsNotNull() throws Exception {
		/* Branches:
		 * (logFile != null) : true
		 */
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//JavaLoggingSystem target = spy(new JavaLoggingSystem(classLoader));
		//LogFile logFileMock = mock(LogFile.class);
		//doNothing().when(target).loadConfiguration("classpath:org/springframework/boot/logging/java/logging-file.properties", logFileMock);
		//Act Statement(s)
		//target.loadDefaults(loggingInitializationContextMock, logFileMock);
		//Assert statement(s)
		//assertAll("result", () -> verify(target).loadConfiguration("classpath:org/springframework/boot/logging/java/logging-file.properties", logFileMock));
	}

	//Sapient generated method id: ${17d58b05-9b3d-387c-8073-47ea91528b78}
	@Test()
	void loadDefaultsWhenLogFileIsNull() throws Exception {
		/* Branches:
		 * (logFile != null) : false
		 */
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//JavaLoggingSystem target = spy(new JavaLoggingSystem(classLoader));
		//doNothing().when(target).loadConfiguration("classpath:org/springframework/boot/logging/java/logging.properties", (LogFile) null);
		//LogFile logFile = null;
		//Act Statement(s)
		//target.loadDefaults(loggingInitializationContextMock, logFile);
		//Assert statement(s)
		//assertAll("result", () -> verify(target).loadConfiguration("classpath:org/springframework/boot/logging/java/logging.properties", (LogFile) null));
	}

	//Sapient generated method id: ${9b5ab968-45d4-3e62-9d6e-78e0871df18a}
	@Test()
	void loadConfigurationTest() throws Exception {
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//JavaLoggingSystem target = spy(new JavaLoggingSystem(classLoader));
		//LogFile logFileMock = mock(LogFile.class);
		//doNothing().when(target).loadConfiguration("location1", logFileMock);
		//Act Statement(s)
		//target.loadConfiguration(loggingInitializationContextMock, "location1", logFileMock);
		//Assert statement(s)
		//assertAll("result", () -> verify(target).loadConfiguration("location1", logFileMock));
	}

	//Sapient generated method id: ${cb081a4a-6d69-3432-8836-0e6fc0ac2c27}
	@Test()
	void loadConfiguration1WhenLogFileIsNotNull() throws Exception {
		/* Branches:
		 * (logFile != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<FileCopyUtils> fileCopyUtils = mockStatic(FileCopyUtils.class);
    MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    _assert.when(() -> Assert.notNull("A", "Location must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    fileCopyUtils.when(() -> FileCopyUtils.copyToString((InputStreamReader) any())).thenReturn(".{LOG_FILE}");
    ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
    JavaLoggingSystem target = new JavaLoggingSystem(classLoader);
    //Act Statement(s)
    target.loadConfiguration("A", logFileMock);
    //Assert statement(s)
    assertAll("result", () -> {
        _assert.verify(() -> Assert.notNull("A", "Location must not be null"), atLeast(1));
        fileCopyUtils.verify(() -> FileCopyUtils.copyToString((InputStreamReader) any()));
    });
}*/
	}

	//Sapient generated method id: ${d8aa49fb-f8d7-35a5-8379-a9af06a492bc}
	@Test()
	void loadConfiguration1WhenCaughtExceptionThrowsIllegalStateException() throws IOException, SecurityException, FileNotFoundException {
		/* Branches:
		 * (logFile != null) : true
		 * (catch-exception (Exception)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<FileCopyUtils> fileCopyUtils = mockStatic(FileCopyUtils.class);
    MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class);
    MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    _assert.when(() -> Assert.notNull("A", "Location must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    URL uRL = ResourceUtils.getURL("A");
    resourceUtils.when(() -> ResourceUtils.getURL("A")).thenReturn(uRL);
    fileCopyUtils.when(() -> FileCopyUtils.copyToString((InputStreamReader) any())).thenReturn(".{LOG_FILE}");
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
        fileCopyUtils.verify(() -> FileCopyUtils.copyToString((InputStreamReader) any()));
    });
}*/
	}

	//Sapient generated method id: ${82f1eac0-2fc3-39e9-ac77-65b21be0daa5}
	@Test()
	void getSupportedLogLevelsTest() {
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//JavaLoggingSystem target = new JavaLoggingSystem(classLoader);
		//Set<LogLevel> logLevelSet = new HashSet<>();
		//doReturn(logLevelSet).when(LEVELSMock).getSupported();
		//Act Statement(s)
		//Set<LogLevel> result = target.getSupportedLogLevels();
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result, equalTo(logLevelSet));
    verify(LEVELSMock).getSupported();
});*/
	}

	//Sapient generated method id: ${d08a78e4-e1f9-3b2f-b8cd-7b13a29ff4f9}
	@Test()
	void setLogLevelWhenROOT_LOGGER_NAMEEqualsLoggerNameAndLoggerIsNotNull() {
		/* Branches:
		 * (loggerName == null) : false
		 * (ROOT_LOGGER_NAME.equals(loggerName)) : true
		 * (logger != null) : true
		 */
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//JavaLoggingSystem target = new JavaLoggingSystem(classLoader);
		//Level level = (Level) Level.parse("name1");
		//doReturn(level).when(LEVELSMock).convertSystemToNative(LogLevel.TRACE);
		//Act Statement(s)
		//target.setLogLevel("ROOT", LogLevel.TRACE);
		//Assert statement(s)
		//assertAll("result", () -> verify(LEVELSMock).convertSystemToNative(LogLevel.TRACE));
	}

	//Sapient generated method id: ${855a9e38-7486-375a-821a-b4bc7d5739af}
	@Test()
	void getLoggerConfigurationsWhenNamesHasMoreElements() {
		/* Branches:
		 * (names.hasMoreElements()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//JavaLoggingSystem target = spy(new JavaLoggingSystem(classLoader));
		//LoggerConfiguration loggerConfigurationMock = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock).when(target).getLoggerConfiguration("");
		//LoggerConfiguration loggerConfigurationMock2 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock2).when(target).getLoggerConfiguration("#com.intellij.psi.impl.file.impl.FileManagerImpl");
		//LoggerConfiguration loggerConfigurationMock3 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock3).when(target).getLoggerConfiguration("#com.intellij.jdkEx.JdkEx");
		//LoggerConfiguration loggerConfigurationMock4 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock4).when(target).getLoggerConfiguration("#com.intellij.util.indexing.roots.builders.IndexableIteratorBuilders");
		//LoggerConfiguration loggerConfigurationMock5 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock5).when(target).getLoggerConfiguration("#com.intellij.internal.statistic.eventLog.events.VarargEventId");
		//LoggerConfiguration loggerConfigurationMock6 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock6).when(target).getLoggerConfiguration("#com.intellij.util.indexing.impl.storage.FileBasedIndexLayoutSettings");
		//LoggerConfiguration loggerConfigurationMock7 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock7).when(target).getLoggerConfiguration("#com.intellij.ide.DataManager");
		//LoggerConfiguration loggerConfigurationMock8 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock8).when(target).getLoggerConfiguration("#com.intellij.openapi.actionSystem.impl.segmentedActionBar.SegmentedActionToolbarComponent");
		//LoggerConfiguration loggerConfigurationMock9 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock9).when(target).getLoggerConfiguration("sun.rmi.transport.misc");
		//LoggerConfiguration loggerConfigurationMock10 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock10).when(target).getLoggerConfiguration("#com.intellij.util.indexing.contentQueue.IndexUpdateRunner");
		//LoggerConfiguration loggerConfigurationMock11 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock11).when(target).getLoggerConfiguration("#org.zmlx.hg4idea.util.HgUtil");
		//LoggerConfiguration loggerConfigurationMock12 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock12).when(target).getLoggerConfiguration("#org.jetbrains.plugins.gradle.service.project.GradleProjectResolverUtil");
		//LoggerConfiguration loggerConfigurationMock13 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock13).when(target).getLoggerConfiguration("io.ktor.client.plugins.defaultTransformers");
		//LoggerConfiguration loggerConfigurationMock14 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock14).when(target).getLoggerConfiguration("#com.intellij.psi.impl.java.stubs.impl.PsiAnnotationStubImpl");
		//LoggerConfiguration loggerConfigurationMock15 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock15).when(target).getLoggerConfiguration("#com.intellij.openapi.projectRoots.impl.JavaSdkImpl");
		//LoggerConfiguration loggerConfigurationMock16 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock16).when(target).getLoggerConfiguration("#com.intellij.psi.impl.file.PsiPackageBase");
		//LoggerConfiguration loggerConfigurationMock17 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock17).when(target).getLoggerConfiguration("#com.intellij.codeInspection.i18n.I18nizeAction");
		//LoggerConfiguration loggerConfigurationMock18 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock18).when(target).getLoggerConfiguration("#com.intellij.psi.impl.source.tree.java.AnnotationParamListElement");
		//LoggerConfiguration loggerConfigurationMock19 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock19).when(target).getLoggerConfiguration("#git4idea.actions.GitPull");
		//LoggerConfiguration loggerConfigurationMock20 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock20).when(target).getLoggerConfiguration("#com.intellij.openapi.vcs.actions.AnnotateToggleAction");
		//LoggerConfiguration loggerConfigurationMock21 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock21).when(target).getLoggerConfiguration("#git4idea.log.GitLogProvider");
		//LoggerConfiguration loggerConfigurationMock22 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock22).when(target).getLoggerConfiguration("sun.awt.X11.focus.XKeyboardFocusManagerPeer");
		//LoggerConfiguration loggerConfigurationMock23 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock23).when(target).getLoggerConfiguration("sun.awt.X11.insets.XWindow");
		//LoggerConfiguration loggerConfigurationMock24 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock24).when(target).getLoggerConfiguration("#com.intellij.workspaceModel.storage.impl.MutableEntityStorageImpl");
		//LoggerConfiguration loggerConfigurationMock25 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock25).when(target).getLoggerConfiguration("#com.intellij.openapi.vfs.impl.local.WatchRootsManager");
		//LoggerConfiguration loggerConfigurationMock26 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock26).when(target).getLoggerConfiguration("#com.intellij.execution.actions.ConfigurationContext");
		//LoggerConfiguration loggerConfigurationMock27 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock27).when(target).getLoggerConfiguration("#com.android.tools.idea.actions.CreateSampleDataDirectory");
		//LoggerConfiguration loggerConfigurationMock28 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock28).when(target).getLoggerConfiguration("#com.intellij.lang.ant.config.impl.AntReference");
		//LoggerConfiguration loggerConfigurationMock29 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock29).when(target).getLoggerConfiguration("#com.intellij.workspaceModel.storage.impl.EntityStorageSerializerImpl");
		//LoggerConfiguration loggerConfigurationMock30 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock30).when(target).getLoggerConfiguration("#com.intellij.refactoring.extractInterface.ExtractInterfaceHandler");
		//LoggerConfiguration loggerConfigurationMock31 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock31).when(target).getLoggerConfiguration("#com.intellij.openapi.wm.impl.PainterHelper");
		//LoggerConfiguration loggerConfigurationMock32 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock32).when(target).getLoggerConfiguration("#com.intellij.codeInsight.daemon.impl.EditorTracker");
		//LoggerConfiguration loggerConfigurationMock33 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock33).when(target).getLoggerConfiguration("#com.intellij.codeInsight.codeVision.ui.CodeVisionView");
		//LoggerConfiguration loggerConfigurationMock34 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock34).when(target).getLoggerConfiguration("#com.intellij.codeInsight.editorActions.TypedHandler");
		//LoggerConfiguration loggerConfigurationMock35 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock35).when(target).getLoggerConfiguration("#org.jetbrains.plugins.gradle.service.task.GradleTaskManager");
		//LoggerConfiguration loggerConfigurationMock36 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock36).when(target).getLoggerConfiguration("#com.intellij.codeInspection.ex.ScopeToolState");
		//LoggerConfiguration loggerConfigurationMock37 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock37).when(target).getLoggerConfiguration("#com.intellij.framework.detection.impl.FrameworkDetectionManager");
		//LoggerConfiguration loggerConfigurationMock38 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock38).when(target).getLoggerConfiguration("#com.intellij.execution.process.KillableProcessHandler");
		//LoggerConfiguration loggerConfigurationMock39 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock39).when(target).getLoggerConfiguration("#com.intellij.openapi.editor.impl.EditorGutterComponentImpl");
		//LoggerConfiguration loggerConfigurationMock40 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock40).when(target).getLoggerConfiguration("com.sun.jna.internal.ReflectionUtils");
		//LoggerConfiguration loggerConfigurationMock41 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock41).when(target).getLoggerConfiguration("#com.intellij.execution.testDiscovery.TestDiscoveryIndex");
		//LoggerConfiguration loggerConfigurationMock42 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock42).when(target).getLoggerConfiguration("#com.intellij.framework.detection.impl.FrameworkDetectorRegistryImpl");
		//LoggerConfiguration loggerConfigurationMock43 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock43).when(target).getLoggerConfiguration("#com.intellij.openapi.actionSystem.impl.PopupMenuPreloader");
		//LoggerConfiguration loggerConfigurationMock44 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock44).when(target).getLoggerConfiguration("A");
		//LoggerConfiguration loggerConfigurationMock45 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock45).when(target).getLoggerConfiguration("#com.intellij.openapi.command.impl.NonUndoableAction");
		//LoggerConfiguration loggerConfigurationMock46 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock46).when(target).getLoggerConfiguration("#com.intellij.util.net.NetUtils");
		//LoggerConfiguration loggerConfigurationMock47 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock47).when(target).getLoggerConfiguration("#com.intellij.refactoring.IntroduceHandlerBase");
		//LoggerConfiguration loggerConfigurationMock48 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock48).when(target).getLoggerConfiguration("#com.intellij.configurationStore.StateStorageBase");
		//LoggerConfiguration loggerConfigurationMock49 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock49).when(target).getLoggerConfiguration("#com.intellij.codeInsight.lookup.impl.LookupTypedHandler");
		//LoggerConfiguration loggerConfigurationMock50 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock50).when(target).getLoggerConfiguration("#com.intellij.psi.impl.source.tree.java.MethodReferenceResolver");
		//LoggerConfiguration loggerConfigurationMock51 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock51).when(target).getLoggerConfiguration("#org.jetbrains.idea.perforce.application.PerforceClientRootsChecker");
		//LoggerConfiguration loggerConfigurationMock52 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock52).when(target).getLoggerConfiguration("io.grpc.internal.DnsNameResolver");
		//LoggerConfiguration loggerConfigurationMock53 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock53).when(target).getLoggerConfiguration("#com.intellij.internal.statistic.DeviceIdManager");
		//LoggerConfiguration loggerConfigurationMock54 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock54).when(target).getLoggerConfiguration("git4idea.GitVcs");
		//LoggerConfiguration loggerConfigurationMock55 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock55).when(target).getLoggerConfiguration("#org.jetbrains.kotlin.idea.vfilefinder.KotlinMetadataFilePackageIndex");
		//LoggerConfiguration loggerConfigurationMock56 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock56).when(target).getLoggerConfiguration("#com.intellij.codeStyle.AbstractConvertLineSeparatorsAction");
		//LoggerConfiguration loggerConfigurationMock57 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock57).when(target).getLoggerConfiguration("#com.intellij.openapi.util.LowMemoryWatcher");
		//LoggerConfiguration loggerConfigurationMock58 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock58).when(target).getLoggerConfiguration("#com.intellij.workspaceModel.ide.impl.WorkspaceModelImpl");
		//LoggerConfiguration loggerConfigurationMock59 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock59).when(target).getLoggerConfiguration("#com.intellij.codeInspection.dataFlow.ConstantValueInspection");
		//LoggerConfiguration loggerConfigurationMock60 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock60).when(target).getLoggerConfiguration("sun.awt.X11.focus.XWindowPeer");
		//LoggerConfiguration loggerConfigurationMock61 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock61).when(target).getLoggerConfiguration("java.awt.Container");
		//LoggerConfiguration loggerConfigurationMock62 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock62).when(target).getLoggerConfiguration("#org.zmlx.hg4idea.util.HgVersion");
		//LoggerConfiguration loggerConfigurationMock63 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock63).when(target).getLoggerConfiguration("#com.intellij.openapi.project.impl.DefaultProjectImpl");
		//LoggerConfiguration loggerConfigurationMock64 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock64).when(target).getLoggerConfiguration("#com.intellij.codeInsight.actions.VcsFacade");
		//LoggerConfiguration loggerConfigurationMock65 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock65).when(target).getLoggerConfiguration("#com.intellij.vcs.log.data.index.VcsLogFullDetailsIndex");
		//LoggerConfiguration loggerConfigurationMock66 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock66).when(target).getLoggerConfiguration("#com.android.tools.idea.res.ProjectSystemPsiElementFinder");
		//LoggerConfiguration loggerConfigurationMock67 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock67).when(target).getLoggerConfiguration("#com.intellij.openapi.fileEditor.impl.IdeDocumentHistoryImpl");
		//LoggerConfiguration loggerConfigurationMock68 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock68).when(target).getLoggerConfiguration("#com.intellij.vcs.log.graph.impl.permanent.PermanentCommitsInfoImpl");
		//LoggerConfiguration loggerConfigurationMock69 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock69).when(target).getLoggerConfiguration("#com.intellij.toolWindow.ToolWindowPane");
		//LoggerConfiguration loggerConfigurationMock70 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock70).when(target).getLoggerConfiguration("sun.awt.X11.enable.XComponentPeer");
		//LoggerConfiguration loggerConfigurationMock71 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock71).when(target).getLoggerConfiguration("#com.intellij.util.EventDispatcher");
		//LoggerConfiguration loggerConfigurationMock72 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock72).when(target).getLoggerConfiguration("#com.intellij.psi.impl.source.xml.XmlAttributeValueImpl");
		//LoggerConfiguration loggerConfigurationMock73 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock73).when(target).getLoggerConfiguration("#com.intellij.openapi.editor.impl.SelectionModelImpl");
		//LoggerConfiguration loggerConfigurationMock74 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock74).when(target).getLoggerConfiguration("#com.intellij.execution.actions.BaseRunConfigurationAction");
		//LoggerConfiguration loggerConfigurationMock75 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock75).when(target).getLoggerConfiguration("#com.intellij.ide.dnd.FileCopyPasteUtil");
		//LoggerConfiguration loggerConfigurationMock76 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock76).when(target).getLoggerConfiguration("java.awt.KeyboardFocusManager");
		//LoggerConfiguration loggerConfigurationMock77 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock77).when(target).getLoggerConfiguration("okhttp3.OkHttpClient");
		//LoggerConfiguration loggerConfigurationMock78 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock78).when(target).getLoggerConfiguration("jdk.internal.httpclient.debug");
		//LoggerConfiguration loggerConfigurationMock79 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock79).when(target).getLoggerConfiguration("#com.intellij.openapi.vfs.newvfs.VfsImplUtil");
		//LoggerConfiguration loggerConfigurationMock80 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock80).when(target).getLoggerConfiguration("#com.intellij.codeInsight.daemon.impl.DaemonListeners");
		//LoggerConfiguration loggerConfigurationMock81 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock81).when(target).getLoggerConfiguration("#com.intellij.indexing.shared.util.zipFs.UncompressedZipFileSystem");
		//LoggerConfiguration loggerConfigurationMock82 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock82).when(target).getLoggerConfiguration("#com.intellij.ui.ScrollingUtil");
		//LoggerConfiguration loggerConfigurationMock83 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock83).when(target).getLoggerConfiguration("#com.intellij.openapi.editor.impl.IntervalTreeImpl");
		//LoggerConfiguration loggerConfigurationMock84 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock84).when(target).getLoggerConfiguration("#git4idea.index.GitStageTracker");
		//LoggerConfiguration loggerConfigurationMock85 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock85).when(target).getLoggerConfiguration("#com.intellij.util.indexing.impl.storage.DefaultIndexStorageLayout");
		//LoggerConfiguration loggerConfigurationMock86 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock86).when(target).getLoggerConfiguration("#com.intellij.psi.search.scope.packageSet.FilePatternPackageSet");
		//LoggerConfiguration loggerConfigurationMock87 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock87).when(target).getLoggerConfiguration("io.opentelemetry.sdk.metrics.internal.view.DefaultAggregation");
		//LoggerConfiguration loggerConfigurationMock88 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock88).when(target).getLoggerConfiguration("#com.intellij.openapi.roots.impl.libraries.RenameLibraryHandler");
		//LoggerConfiguration loggerConfigurationMock89 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock89).when(target).getLoggerConfiguration("#com.intellij.psi.FilePropertyKeyImpl");
		//LoggerConfiguration loggerConfigurationMock90 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock90).when(target).getLoggerConfiguration("#com.intellij.psi.impl.JavaPsiFacadeImpl");
		//LoggerConfiguration loggerConfigurationMock91 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock91).when(target).getLoggerConfiguration("#org.jetbrains.kotlin.idea.gradle.diagnostic.KotlinGradleBuildErrorsChecker");
		//LoggerConfiguration loggerConfigurationMock92 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock92).when(target).getLoggerConfiguration("#com.intellij.diff.util.DiffUtil");
		//LoggerConfiguration loggerConfigurationMock93 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock93).when(target).getLoggerConfiguration("com.sun.xml.bind.v2.runtime.reflect.Utils");
		//LoggerConfiguration loggerConfigurationMock94 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock94).when(target).getLoggerConfiguration("#git4idea.history.GitLogUtil");
		//LoggerConfiguration loggerConfigurationMock95 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock95).when(target).getLoggerConfiguration("#com.intellij.openapi.editor.impl.softwrap.mapping.CachingSoftWrapDataMapper");
		//LoggerConfiguration loggerConfigurationMock96 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock96).when(target).getLoggerConfiguration("com.sun.xml.bind.v2.runtime.reflect.Accessor$FieldReflection");
		//LoggerConfiguration loggerConfigurationMock97 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock97).when(target).getLoggerConfiguration("#com.intellij.externalProcessAuthHelper.ExternalProcessHandlerService");
		//LoggerConfiguration loggerConfigurationMock98 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock98).when(target).getLoggerConfiguration("#com.intellij.execution.RunManager");
		//LoggerConfiguration loggerConfigurationMock99 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock99).when(target).getLoggerConfiguration("org.apache.commons.beanutils.converters.BooleanConverter");
		//LoggerConfiguration loggerConfigurationMock100 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock100).when(target).getLoggerConfiguration("#com.intellij.codeInspection.ex.InspectionToolRegistrar");
		//LoggerConfiguration loggerConfigurationMock101 = mock(LoggerConfiguration.class);
		//doReturn(loggerConfigurationMock101).when(target).getLoggerConfiguration("#com.intellij.compiler.server.impl.BuildProcessClasspathManager");
		//Act Statement(s)
		//List<LoggerConfiguration> result = target.getLoggerConfigurations();
		//List<LoggerConfiguration> loggerConfigurationResultList = new ArrayList<>();
		//loggerConfigurationResultList.add(loggerConfigurationMock);
		//loggerConfigurationResultList.add(loggerConfigurationMock2);
		//loggerConfigurationResultList.add(loggerConfigurationMock3);
		//loggerConfigurationResultList.add(loggerConfigurationMock4);
		//loggerConfigurationResultList.add(loggerConfigurationMock5);
		//loggerConfigurationResultList.add(loggerConfigurationMock6);
		//loggerConfigurationResultList.add(loggerConfigurationMock7);
		//loggerConfigurationResultList.add(loggerConfigurationMock8);
		//loggerConfigurationResultList.add(loggerConfigurationMock9);
		//loggerConfigurationResultList.add(loggerConfigurationMock10);
		//loggerConfigurationResultList.add(loggerConfigurationMock11);
		//loggerConfigurationResultList.add(loggerConfigurationMock12);
		//loggerConfigurationResultList.add(loggerConfigurationMock13);
		//loggerConfigurationResultList.add(loggerConfigurationMock14);
		//loggerConfigurationResultList.add(loggerConfigurationMock15);
		//loggerConfigurationResultList.add(loggerConfigurationMock16);
		//loggerConfigurationResultList.add(loggerConfigurationMock17);
		//loggerConfigurationResultList.add(loggerConfigurationMock18);
		//loggerConfigurationResultList.add(loggerConfigurationMock19);
		//loggerConfigurationResultList.add(loggerConfigurationMock20);
		//loggerConfigurationResultList.add(loggerConfigurationMock21);
		//loggerConfigurationResultList.add(loggerConfigurationMock22);
		//loggerConfigurationResultList.add(loggerConfigurationMock23);
		//loggerConfigurationResultList.add(loggerConfigurationMock24);
		//loggerConfigurationResultList.add(loggerConfigurationMock25);
		//loggerConfigurationResultList.add(loggerConfigurationMock26);
		//loggerConfigurationResultList.add(loggerConfigurationMock27);
		//loggerConfigurationResultList.add(loggerConfigurationMock28);
		//loggerConfigurationResultList.add(loggerConfigurationMock29);
		//loggerConfigurationResultList.add(loggerConfigurationMock30);
		//loggerConfigurationResultList.add(loggerConfigurationMock31);
		//loggerConfigurationResultList.add(loggerConfigurationMock32);
		//loggerConfigurationResultList.add(loggerConfigurationMock33);
		//loggerConfigurationResultList.add(loggerConfigurationMock34);
		//loggerConfigurationResultList.add(loggerConfigurationMock35);
		//loggerConfigurationResultList.add(loggerConfigurationMock36);
		//loggerConfigurationResultList.add(loggerConfigurationMock37);
		//loggerConfigurationResultList.add(loggerConfigurationMock38);
		//loggerConfigurationResultList.add(loggerConfigurationMock39);
		//loggerConfigurationResultList.add(loggerConfigurationMock40);
		//loggerConfigurationResultList.add(loggerConfigurationMock41);
		//loggerConfigurationResultList.add(loggerConfigurationMock42);
		//loggerConfigurationResultList.add(loggerConfigurationMock43);
		//loggerConfigurationResultList.add(loggerConfigurationMock44);
		//loggerConfigurationResultList.add(loggerConfigurationMock45);
		//loggerConfigurationResultList.add(loggerConfigurationMock46);
		//loggerConfigurationResultList.add(loggerConfigurationMock47);
		//loggerConfigurationResultList.add(loggerConfigurationMock48);
		//loggerConfigurationResultList.add(loggerConfigurationMock49);
		//loggerConfigurationResultList.add(loggerConfigurationMock50);
		//loggerConfigurationResultList.add(loggerConfigurationMock51);
		//loggerConfigurationResultList.add(loggerConfigurationMock52);
		//loggerConfigurationResultList.add(loggerConfigurationMock53);
		//loggerConfigurationResultList.add(loggerConfigurationMock54);
		//loggerConfigurationResultList.add(loggerConfigurationMock55);
		//loggerConfigurationResultList.add(loggerConfigurationMock56);
		//loggerConfigurationResultList.add(loggerConfigurationMock57);
		//loggerConfigurationResultList.add(loggerConfigurationMock58);
		//loggerConfigurationResultList.add(loggerConfigurationMock59);
		//loggerConfigurationResultList.add(loggerConfigurationMock60);
		//loggerConfigurationResultList.add(loggerConfigurationMock61);
		//loggerConfigurationResultList.add(loggerConfigurationMock62);
		//loggerConfigurationResultList.add(loggerConfigurationMock63);
		//loggerConfigurationResultList.add(loggerConfigurationMock64);
		//loggerConfigurationResultList.add(loggerConfigurationMock65);
		//loggerConfigurationResultList.add(loggerConfigurationMock66);
		//loggerConfigurationResultList.add(loggerConfigurationMock67);
		//loggerConfigurationResultList.add(loggerConfigurationMock68);
		//loggerConfigurationResultList.add(loggerConfigurationMock69);
		//loggerConfigurationResultList.add(loggerConfigurationMock70);
		//loggerConfigurationResultList.add(loggerConfigurationMock71);
		//loggerConfigurationResultList.add(loggerConfigurationMock72);
		//loggerConfigurationResultList.add(loggerConfigurationMock73);
		//loggerConfigurationResultList.add(loggerConfigurationMock74);
		//loggerConfigurationResultList.add(loggerConfigurationMock75);
		//loggerConfigurationResultList.add(loggerConfigurationMock76);
		//loggerConfigurationResultList.add(loggerConfigurationMock77);
		//loggerConfigurationResultList.add(loggerConfigurationMock78);
		//loggerConfigurationResultList.add(loggerConfigurationMock79);
		//loggerConfigurationResultList.add(loggerConfigurationMock80);
		//loggerConfigurationResultList.add(loggerConfigurationMock81);
		//loggerConfigurationResultList.add(loggerConfigurationMock82);
		//loggerConfigurationResultList.add(loggerConfigurationMock83);
		//loggerConfigurationResultList.add(loggerConfigurationMock84);
		//loggerConfigurationResultList.add(loggerConfigurationMock85);
		//loggerConfigurationResultList.add(loggerConfigurationMock86);
		//loggerConfigurationResultList.add(loggerConfigurationMock87);
		//loggerConfigurationResultList.add(loggerConfigurationMock88);
		//loggerConfigurationResultList.add(loggerConfigurationMock89);
		//loggerConfigurationResultList.add(loggerConfigurationMock90);
		//loggerConfigurationResultList.add(loggerConfigurationMock91);
		//loggerConfigurationResultList.add(loggerConfigurationMock92);
		//loggerConfigurationResultList.add(loggerConfigurationMock93);
		//loggerConfigurationResultList.add(loggerConfigurationMock94);
		//loggerConfigurationResultList.add(loggerConfigurationMock95);
		//loggerConfigurationResultList.add(loggerConfigurationMock96);
		//loggerConfigurationResultList.add(loggerConfigurationMock97);
		//loggerConfigurationResultList.add(loggerConfigurationMock98);
		//loggerConfigurationResultList.add(loggerConfigurationMock99);
		//loggerConfigurationResultList.add(loggerConfigurationMock100);
		//loggerConfigurationResultList.add(loggerConfigurationMock101);
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result.size(), equalTo(loggerConfigurationResultList.size()));
    assertThat(result, containsInRelativeOrder(loggerConfigurationResultList.toArray()));
    verify(target).getLoggerConfiguration("");
    verify(target).getLoggerConfiguration("#com.intellij.psi.impl.file.impl.FileManagerImpl");
    verify(target).getLoggerConfiguration("#com.intellij.jdkEx.JdkEx");
    verify(target).getLoggerConfiguration("#com.intellij.util.indexing.roots.builders.IndexableIteratorBuilders");
    verify(target).getLoggerConfiguration("#com.intellij.internal.statistic.eventLog.events.VarargEventId");
    verify(target).getLoggerConfiguration("#com.intellij.util.indexing.impl.storage.FileBasedIndexLayoutSettings");
    verify(target).getLoggerConfiguration("#com.intellij.ide.DataManager");
    verify(target).getLoggerConfiguration("#com.intellij.openapi.actionSystem.impl.segmentedActionBar.SegmentedActionToolbarComponent");
    verify(target).getLoggerConfiguration("sun.rmi.transport.misc");
    verify(target).getLoggerConfiguration("#com.intellij.util.indexing.contentQueue.IndexUpdateRunner");
    verify(target).getLoggerConfiguration("#org.zmlx.hg4idea.util.HgUtil");
    verify(target).getLoggerConfiguration("#org.jetbrains.plugins.gradle.service.project.GradleProjectResolverUtil");
    verify(target).getLoggerConfiguration("io.ktor.client.plugins.defaultTransformers");
    verify(target).getLoggerConfiguration("#com.intellij.psi.impl.java.stubs.impl.PsiAnnotationStubImpl");
    verify(target).getLoggerConfiguration("#com.intellij.openapi.projectRoots.impl.JavaSdkImpl");
    verify(target).getLoggerConfiguration("#com.intellij.psi.impl.file.PsiPackageBase");
    verify(target).getLoggerConfiguration("#com.intellij.codeInspection.i18n.I18nizeAction");
    verify(target).getLoggerConfiguration("#com.intellij.psi.impl.source.tree.java.AnnotationParamListElement");
    verify(target).getLoggerConfiguration("#git4idea.actions.GitPull");
    verify(target).getLoggerConfiguration("#com.intellij.openapi.vcs.actions.AnnotateToggleAction");
    verify(target).getLoggerConfiguration("#git4idea.log.GitLogProvider");
    verify(target).getLoggerConfiguration("sun.awt.X11.focus.XKeyboardFocusManagerPeer");
    verify(target).getLoggerConfiguration("sun.awt.X11.insets.XWindow");
    verify(target).getLoggerConfiguration("#com.intellij.workspaceModel.storage.impl.MutableEntityStorageImpl");
    verify(target).getLoggerConfiguration("#com.intellij.openapi.vfs.impl.local.WatchRootsManager");
    verify(target).getLoggerConfiguration("#com.intellij.execution.actions.ConfigurationContext");
    verify(target).getLoggerConfiguration("#com.android.tools.idea.actions.CreateSampleDataDirectory");
    verify(target).getLoggerConfiguration("#com.intellij.lang.ant.config.impl.AntReference");
    verify(target).getLoggerConfiguration("#com.intellij.workspaceModel.storage.impl.EntityStorageSerializerImpl");
    verify(target).getLoggerConfiguration("#com.intellij.refactoring.extractInterface.ExtractInterfaceHandler");
    verify(target).getLoggerConfiguration("#com.intellij.openapi.wm.impl.PainterHelper");
    verify(target).getLoggerConfiguration("#com.intellij.codeInsight.daemon.impl.EditorTracker");
    verify(target).getLoggerConfiguration("#com.intellij.codeInsight.codeVision.ui.CodeVisionView");
    verify(target).getLoggerConfiguration("#com.intellij.codeInsight.editorActions.TypedHandler");
    verify(target).getLoggerConfiguration("#org.jetbrains.plugins.gradle.service.task.GradleTaskManager");
    verify(target).getLoggerConfiguration("#com.intellij.codeInspection.ex.ScopeToolState");
    verify(target).getLoggerConfiguration("#com.intellij.framework.detection.impl.FrameworkDetectionManager");
    verify(target).getLoggerConfiguration("#com.intellij.execution.process.KillableProcessHandler");
    verify(target).getLoggerConfiguration("#com.intellij.openapi.editor.impl.EditorGutterComponentImpl");
    verify(target).getLoggerConfiguration("com.sun.jna.internal.ReflectionUtils");
    verify(target).getLoggerConfiguration("#com.intellij.execution.testDiscovery.TestDiscoveryIndex");
    verify(target).getLoggerConfiguration("#com.intellij.framework.detection.impl.FrameworkDetectorRegistryImpl");
    verify(target).getLoggerConfiguration("#com.intellij.openapi.actionSystem.impl.PopupMenuPreloader");
    verify(target).getLoggerConfiguration("A");
    verify(target).getLoggerConfiguration("#com.intellij.openapi.command.impl.NonUndoableAction");
    verify(target).getLoggerConfiguration("#com.intellij.util.net.NetUtils");
    verify(target).getLoggerConfiguration("#com.intellij.refactoring.IntroduceHandlerBase");
    verify(target).getLoggerConfiguration("#com.intellij.configurationStore.StateStorageBase");
    verify(target).getLoggerConfiguration("#com.intellij.codeInsight.lookup.impl.LookupTypedHandler");
    verify(target).getLoggerConfiguration("#com.intellij.psi.impl.source.tree.java.MethodReferenceResolver");
    verify(target).getLoggerConfiguration("#org.jetbrains.idea.perforce.application.PerforceClientRootsChecker");
    verify(target).getLoggerConfiguration("io.grpc.internal.DnsNameResolver");
    verify(target).getLoggerConfiguration("#com.intellij.internal.statistic.DeviceIdManager");
    verify(target).getLoggerConfiguration("git4idea.GitVcs");
    verify(target).getLoggerConfiguration("#org.jetbrains.kotlin.idea.vfilefinder.KotlinMetadataFilePackageIndex");
    verify(target).getLoggerConfiguration("#com.intellij.codeStyle.AbstractConvertLineSeparatorsAction");
    verify(target).getLoggerConfiguration("#com.intellij.openapi.util.LowMemoryWatcher");
    verify(target).getLoggerConfiguration("#com.intellij.workspaceModel.ide.impl.WorkspaceModelImpl");
    verify(target).getLoggerConfiguration("#com.intellij.codeInspection.dataFlow.ConstantValueInspection");
    verify(target).getLoggerConfiguration("sun.awt.X11.focus.XWindowPeer");
    verify(target).getLoggerConfiguration("java.awt.Container");
    verify(target).getLoggerConfiguration("#org.zmlx.hg4idea.util.HgVersion");
    verify(target).getLoggerConfiguration("#com.intellij.openapi.project.impl.DefaultProjectImpl");
    verify(target).getLoggerConfiguration("#com.intellij.codeInsight.actions.VcsFacade");
    verify(target).getLoggerConfiguration("#com.intellij.vcs.log.data.index.VcsLogFullDetailsIndex");
    verify(target).getLoggerConfiguration("#com.android.tools.idea.res.ProjectSystemPsiElementFinder");
    verify(target).getLoggerConfiguration("#com.intellij.openapi.fileEditor.impl.IdeDocumentHistoryImpl");
    verify(target).getLoggerConfiguration("#com.intellij.vcs.log.graph.impl.permanent.PermanentCommitsInfoImpl");
    verify(target).getLoggerConfiguration("#com.intellij.toolWindow.ToolWindowPane");
    verify(target).getLoggerConfiguration("sun.awt.X11.enable.XComponentPeer");
    verify(target).getLoggerConfiguration("#com.intellij.util.EventDispatcher");
    verify(target).getLoggerConfiguration("#com.intellij.psi.impl.source.xml.XmlAttributeValueImpl");
    verify(target).getLoggerConfiguration("#com.intellij.openapi.editor.impl.SelectionModelImpl");
    verify(target).getLoggerConfiguration("#com.intellij.execution.actions.BaseRunConfigurationAction");
    verify(target).getLoggerConfiguration("#com.intellij.ide.dnd.FileCopyPasteUtil");
    verify(target).getLoggerConfiguration("java.awt.KeyboardFocusManager");
    verify(target).getLoggerConfiguration("okhttp3.OkHttpClient");
    verify(target).getLoggerConfiguration("jdk.internal.httpclient.debug");
    verify(target).getLoggerConfiguration("#com.intellij.openapi.vfs.newvfs.VfsImplUtil");
    verify(target).getLoggerConfiguration("#com.intellij.codeInsight.daemon.impl.DaemonListeners");
    verify(target).getLoggerConfiguration("#com.intellij.indexing.shared.util.zipFs.UncompressedZipFileSystem");
    verify(target).getLoggerConfiguration("#com.intellij.ui.ScrollingUtil");
    verify(target).getLoggerConfiguration("#com.intellij.openapi.editor.impl.IntervalTreeImpl");
    verify(target).getLoggerConfiguration("#git4idea.index.GitStageTracker");
    verify(target).getLoggerConfiguration("#com.intellij.util.indexing.impl.storage.DefaultIndexStorageLayout");
    verify(target).getLoggerConfiguration("#com.intellij.psi.search.scope.packageSet.FilePatternPackageSet");
    verify(target).getLoggerConfiguration("io.opentelemetry.sdk.metrics.internal.view.DefaultAggregation");
    verify(target).getLoggerConfiguration("#com.intellij.openapi.roots.impl.libraries.RenameLibraryHandler");
    verify(target).getLoggerConfiguration("#com.intellij.psi.FilePropertyKeyImpl");
    verify(target).getLoggerConfiguration("#com.intellij.psi.impl.JavaPsiFacadeImpl");
    verify(target).getLoggerConfiguration("#org.jetbrains.kotlin.idea.gradle.diagnostic.KotlinGradleBuildErrorsChecker");
    verify(target).getLoggerConfiguration("#com.intellij.diff.util.DiffUtil");
    verify(target).getLoggerConfiguration("com.sun.xml.bind.v2.runtime.reflect.Utils");
    verify(target).getLoggerConfiguration("#git4idea.history.GitLogUtil");
    verify(target).getLoggerConfiguration("#com.intellij.openapi.editor.impl.softwrap.mapping.CachingSoftWrapDataMapper");
    verify(target).getLoggerConfiguration("com.sun.xml.bind.v2.runtime.reflect.Accessor$FieldReflection");
    verify(target).getLoggerConfiguration("#com.intellij.externalProcessAuthHelper.ExternalProcessHandlerService");
    verify(target).getLoggerConfiguration("#com.intellij.execution.RunManager");
    verify(target).getLoggerConfiguration("org.apache.commons.beanutils.converters.BooleanConverter");
    verify(target).getLoggerConfiguration("#com.intellij.codeInspection.ex.InspectionToolRegistrar");
    verify(target).getLoggerConfiguration("#com.intellij.compiler.server.impl.BuildProcessClasspathManager");
});*/
	}

	//Sapient generated method id: ${1d2112b3-8acc-3521-84da-e493ffddac34}
	@Test()
	void getLoggerConfigurationWhenLoggerIsNull() {
		/* Branches:
		 * (logger == null) : true
		 */
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//JavaLoggingSystem target = new JavaLoggingSystem(classLoader);
		//Act Statement(s)
		//LoggerConfiguration result = target.getLoggerConfiguration("A");
		//Assert statement(s)
		//assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${249e51d4-a67c-3f36-ae3a-6d201eac9609}
	@Test()
	void getLoggerConfigurationWhenStringUtilsHasLengthLoggerGetName() {
		/* Branches:
		 * (logger == null) : false
		 * (logger.getLevel() == null) : true  #  inside getEffectiveLevel method
		 * (StringUtils.hasLength(logger.getName())) : true
		 */
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//JavaLoggingSystem target = new JavaLoggingSystem(classLoader);
		//doReturn(LogLevel.TRACE).when(LEVELSMock).convertNativeToSystem((Level) any());
		//Act Statement(s)
		//LoggerConfiguration result = target.getLoggerConfiguration("A");
		//LoggerConfiguration loggerConfiguration = new LoggerConfiguration("name1", LogLevel.TRACE, LogLevel.TRACE);
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result, equalTo(loggerConfiguration));
    verify(LEVELSMock, atLeast(2)).convertNativeToSystem((Level) any());
});*/
	}

	//Sapient generated method id: ${44675f94-23c5-36b0-8d41-9db6cc032a8c}
	@Test()
	void getLoggerConfigurationWhenStringUtilsNotHasLengthLoggerGetName() {
		/* Branches:
		 * (logger == null) : false
		 * (logger.getLevel() == null) : true  #  inside getEffectiveLevel method
		 * (StringUtils.hasLength(logger.getName())) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasLength("B")).thenReturn(false);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			JavaLoggingSystem target = new JavaLoggingSystem(classLoader);
			doReturn(LogLevel.TRACE).when(LEVELSMock).convertNativeToSystem((Level) any());
			//Act Statement(s)
			LoggerConfiguration result = target.getLoggerConfiguration("A");
			LoggerConfiguration loggerConfiguration = new LoggerConfiguration("ROOT", LogLevel.TRACE, LogLevel.TRACE);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(loggerConfiguration));
				stringUtils.verify(() -> StringUtils.hasLength("B"), atLeast(1));
				verify(LEVELSMock, atLeast(2)).convertNativeToSystem((Level) any());
			});
		}
	}

	//Sapient generated method id: ${1fa3a2e1-a02e-3401-a913-93f2f865166f}
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

	//Sapient generated method id: ${90f58dbe-753c-36ac-91d5-9317e7372db1}
	@Test()
	void cleanUpTest() {
		//Arrange Statement(s)
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		JavaLoggingSystem target = new JavaLoggingSystem(classLoader);
		//Act Statement(s)
		target.cleanUp();
	}
}
