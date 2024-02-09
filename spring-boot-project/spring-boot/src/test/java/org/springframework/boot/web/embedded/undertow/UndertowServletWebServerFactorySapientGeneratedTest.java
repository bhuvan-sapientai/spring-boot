package org.springframework.boot.web.embedded.undertow;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;

import io.undertow.servlet.api.MimeMapping;

import org.springframework.boot.web.servlet.ServletContextInitializer;

import org.mockito.MockitoAnnotations;

import org.springframework.util.CollectionUtils;
import org.springframework.util.Assert;

import java.util.HashSet;
import java.util.HashMap;

import io.undertow.Undertow;

import java.nio.charset.Charset;
import java.util.ArrayList;

import org.springframework.boot.web.server.ErrorPage;

import org.mockito.stubbing.Answer;
import io.undertow.servlet.api.ServletInfo;

import org.springframework.boot.web.server.Cookie;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.boot.web.servlet.server.StaticResourceJars;

import io.undertow.servlet.handlers.DefaultServlet;
import io.undertow.servlet.spec.ServletContextImpl;
import io.undertow.servlet.api.DeploymentManager;
import io.undertow.servlet.api.ServletContainer;
import io.undertow.servlet.api.ServletContainerInitializerInfo;
import io.undertow.servlet.spec.SessionCookieConfigImpl;

import java.io.File;

import io.undertow.servlet.api.DeploymentInfo;
import io.undertow.servlet.Servlets;
import io.undertow.servlet.api.Deployment;

import org.springframework.boot.web.servlet.server.SessionStoreDirectory;
import org.springframework.http.HttpStatus;

import java.util.List;

import org.springframework.boot.web.server.MimeMappings;

import java.util.Locale;
import java.util.Map;

import org.springframework.boot.web.servlet.server.DocumentRoot;

import io.undertow.servlet.api.ServletStackTraces;

import org.springframework.boot.web.servlet.server.CookieSameSiteSupplier;

import java.util.Set;
import java.util.Collection;
import java.net.URL;

import org.mockito.MockedStatic;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.atLeast;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UndertowServletWebServerFactorySapientGeneratedTest {

	private final UndertowWebServerFactoryDelegate delegateMock = mock(UndertowWebServerFactoryDelegate.class, "delegate");

	private final DocumentRoot documentRootMock = mock(DocumentRoot.class, "documentRoot");

	private final StaticResourceJars staticResourceJarsMock = mock(StaticResourceJars.class, "staticResourceJars");

	private final Session sessionMock = mock(Session.class, "session");

	private AutoCloseable autoCloseableMocks;

	@InjectMocks()
	private UndertowServletWebServerFactory target;

	@AfterEach()
	public void afterTest() throws Exception {
        /*if (autoCloseableMocks != null)
    autoCloseableMocks.close();*/
	}

	//Sapient generated method id: ${d46d5ffe-ac1b-340c-99c6-f04fbdea6f2c}
	@Test()
	void setBuilderCustomizersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//target = new UndertowServletWebServerFactory("String contextPath", 0);
		//autoCloseableMocks = MockitoAnnotations.openMocks(this);
		//UndertowBuilderCustomizer undertowBuilderCustomizerMock = mock(UndertowBuilderCustomizer.class, "Collection<UndertowBuilderCustomizer> customizers");
		//Collection<UndertowBuilderCustomizer> collection = new ArrayList<>();
		//collection.add(undertowBuilderCustomizerMock);
		//doNothing().when(delegateMock).setBuilderCustomizers(collection);
		//Act Statement(s)
		//target.setBuilderCustomizers(collection);
		//Assert statement(s)
		//assertAll("result", () -> verify(delegateMock).setBuilderCustomizers(collection));
	}

	//Sapient generated method id: ${e106853d-b8ca-3012-b7d5-4abd24417ddf}
	@Test()
	void addBuilderCustomizersTest() {
		/**
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    target = new UndertowServletWebServerFactory("/A", 0);
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    UndertowBuilderCustomizer[] undertowBuilderCustomizerArray = new UndertowBuilderCustomizer[] {};
    //Act Statement(s)
    target.addBuilderCustomizers(undertowBuilderCustomizerArray);
    //Assert statement(s)
    assertAll("result", () -> _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1)));
}*/
	}

	//Sapient generated method id: ${a28334d2-2eb1-3d12-aa0c-d966ca85f0ed}
	@Test()
	void getBuilderCustomizersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//target = new UndertowServletWebServerFactory("<value>", 0);
		//autoCloseableMocks = MockitoAnnotations.openMocks(this);
		//Collection<UndertowBuilderCustomizer> collection = new ArrayList<>();
		//doReturn(collection).when(delegateMock).getBuilderCustomizers();
		//Act Statement(s)
		//Collection<UndertowBuilderCustomizer> result = target.getBuilderCustomizers();
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result, equalTo(collection));
    verify(delegateMock).getBuilderCustomizers();
});*/
	}

	//Sapient generated method id: ${f172b268-8fbf-3170-8e39-d62826f8d5d7}
	@Test()
	void setBufferSizeTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new UndertowServletWebServerFactory("exampleContextPath", 8080);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		doNothing().when(delegateMock).setBufferSize(10);
		//Act Statement(s)
		target.setBufferSize(10);
		//Assert statement(s)
		assertAll("result", () -> verify(delegateMock).setBufferSize(10));
	}

	//Sapient generated method id: ${1b05e662-01f2-30f0-a9c9-4e21b8c27f39}
	@Test()
	void setIoThreadsTest() {
		/**
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//target = new UndertowServletWebServerFactory("/app", 8080);
		//autoCloseableMocks = MockitoAnnotations.openMocks(this);
		//Act Statement(s)
		//target.setIoThreads(5);
	}

	//Sapient generated method id: ${5bcd1937-eee0-349c-9dc7-034620df5d11}
	@Test()
	void setWorkerThreadsTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//target = new UndertowServletWebServerFactory("exampleContextPath", 8080);
		//autoCloseableMocks = MockitoAnnotations.openMocks(this);
		//doNothing().when(delegateMock).setWorkerThreads(5);
		//Act Statement(s)
		//target.setWorkerThreads(5);
		//Assert statement(s)
		//assertAll("result", () -> verify(delegateMock).setWorkerThreads(5));
	}

	//Sapient generated method id: ${1176e3f2-7739-3264-aaab-02aafa3e629a}
	@Test()
	void setUseDirectBuffersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new UndertowServletWebServerFactory("exampleContextPath", 8080);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		doNothing().when(delegateMock).setUseDirectBuffers(true);
		//Act Statement(s)
		target.setUseDirectBuffers(true);
		//Assert statement(s)
		assertAll("result", () -> verify(delegateMock).setUseDirectBuffers(true));
	}

	//Sapient generated method id: ${e13048d4-e7c9-3d52-893e-412cb77a5d99}
	@Test()
	void setAccessLogDirectoryTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//target = new UndertowServletWebServerFactory("<String_value>", 0);
		//autoCloseableMocks = MockitoAnnotations.openMocks(this);
		//File file = new File("pathname1");
		//doNothing().when(delegateMock).setAccessLogDirectory(file);
		//Act Statement(s)
		//target.setAccessLogDirectory(file);
		//Assert statement(s)
		//assertAll("result", () -> verify(delegateMock).setAccessLogDirectory(file));
	}

	//Sapient generated method id: ${698682af-4b28-3b59-b885-c0a0fd94847e}
	@Test()
	void setAccessLogPatternTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//target = new UndertowServletWebServerFactory("<value>", 0);
		//autoCloseableMocks = MockitoAnnotations.openMocks(this);
		//doNothing().when(delegateMock).setAccessLogPattern("<value>");
		//Act Statement(s)
		//target.setAccessLogPattern("<value>");
		//Assert statement(s)
		//assertAll("result", () -> verify(delegateMock).setAccessLogPattern("<value>"));
	}

	//Sapient generated method id: ${200ab679-980b-3717-82f1-c662caa83f8d}
	@Test()
	void setAccessLogPrefixTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new UndertowServletWebServerFactory("validContextPath", 8080);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		doNothing().when(delegateMock).setAccessLogPrefix("validAccessLogPrefix");
		//Act Statement(s)
		target.setAccessLogPrefix("validAccessLogPrefix");
		//Assert statement(s)
		assertAll("result", () -> verify(delegateMock).setAccessLogPrefix("validAccessLogPrefix"));
	}

	//Sapient generated method id: ${76f9937a-5764-30eb-9ad3-3ede3917709b}
	@Test()
	void getAccessLogPrefixTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//target = new UndertowServletWebServerFactory("<value>", 0);
		//autoCloseableMocks = MockitoAnnotations.openMocks(this);
		//doReturn("return_of_getAccessLogPrefix1").when(delegateMock).getAccessLogPrefix();
		//Act Statement(s)
		//String result = target.getAccessLogPrefix();
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result, equalTo("return_of_getAccessLogPrefix1"));
    verify(delegateMock).getAccessLogPrefix();
});*/
	}

	//Sapient generated method id: ${9a002fb7-4a0a-3336-be64-e6ec4e9c09b8}
	@Test()
	void setAccessLogSuffixTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//target = new UndertowServletWebServerFactory("<value>", 0);
		//autoCloseableMocks = MockitoAnnotations.openMocks(this);
		//doNothing().when(delegateMock).setAccessLogSuffix("<value>");
		//Act Statement(s)
		//target.setAccessLogSuffix("<value>");
		//Assert statement(s)
		//assertAll("result", () -> verify(delegateMock).setAccessLogSuffix("<value>"));
	}

	//Sapient generated method id: ${1870ccfc-0c07-3f2a-945d-85d41e58f93c}
	@Test()
	void setAccessLogEnabledTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new UndertowServletWebServerFactory("exampleContextPath", 8080);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		doNothing().when(delegateMock).setAccessLogEnabled(true);
		//Act Statement(s)
		target.setAccessLogEnabled(true);
		//Assert statement(s)
		assertAll("result", () -> verify(delegateMock).setAccessLogEnabled(true));
	}

	//Sapient generated method id: ${b23bdde4-3c33-3b46-a336-bfb7f14eeb4f}
	@Test()
	void isAccessLogEnabledWhenThisDelegateIsAccessLogEnabled() {
		/* Branches:
		 * (this.delegate.isAccessLogEnabled()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//target = new UndertowServletWebServerFactory("<value>", 0);
		//autoCloseableMocks = MockitoAnnotations.openMocks(this);
		//doReturn(true).when(delegateMock).isAccessLogEnabled();
		//Act Statement(s)
		//boolean result = target.isAccessLogEnabled();
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result, equalTo(Boolean.TRUE));
    verify(delegateMock).isAccessLogEnabled();
});*/
	}

	//Sapient generated method id: ${979bdcdb-0d6d-30bc-a5ce-8c8708555136}
	@Test()
	void isAccessLogEnabledWhenThisDelegateNotIsAccessLogEnabled() {
		/* Branches:
		 * (this.delegate.isAccessLogEnabled()) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new UndertowServletWebServerFactory("<value>", 0);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		doReturn(false).when(delegateMock).isAccessLogEnabled();
		//Act Statement(s)
		boolean result = target.isAccessLogEnabled();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(delegateMock).isAccessLogEnabled();
		});
	}

	//Sapient generated method id: ${d79c91a3-f49d-3896-a0bb-b0570f231498}
	@Test()
	void setAccessLogRotateTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//target = new UndertowServletWebServerFactory("exampleContextPath", 8080);
		//autoCloseableMocks = MockitoAnnotations.openMocks(this);
		//doNothing().when(delegateMock).setAccessLogRotate(true);
		//Act Statement(s)
		//target.setAccessLogRotate(true);
		//Assert statement(s)
		//assertAll("result", () -> verify(delegateMock).setAccessLogRotate(true));
	}

	//Sapient generated method id: ${2a3f1d92-865d-325d-8f92-1c8e19f6921b}
	@Test()
	void setUseForwardHeadersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new UndertowServletWebServerFactory("exampleContextPath", 8080);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		doNothing().when(delegateMock).setUseForwardHeaders(true);
		//Act Statement(s)
		target.setUseForwardHeaders(true);
		//Assert statement(s)
		assertAll("result", () -> verify(delegateMock).setUseForwardHeaders(true));
	}

	//Sapient generated method id: ${18adb576-6898-37fd-bbdb-bd911d395a71}
	@Test()
	void isUseForwardHeadersWhenThisDelegateIsUseForwardHeaders() {
		/* Branches:
		 * (this.delegate.isUseForwardHeaders()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//target = new UndertowServletWebServerFactory("<value>", 0);
		//autoCloseableMocks = MockitoAnnotations.openMocks(this);
		//doReturn(true).when(delegateMock).isUseForwardHeaders();
		//Act Statement(s)
		//boolean result = target.isUseForwardHeaders();
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result, equalTo(Boolean.TRUE));
    verify(delegateMock).isUseForwardHeaders();
});*/
	}

	//Sapient generated method id: ${458037a6-20c6-3473-8bda-e7b29f037c1e}
	@Test()
	void isUseForwardHeadersWhenThisDelegateNotIsUseForwardHeaders() {
		/* Branches:
		 * (this.delegate.isUseForwardHeaders()) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//target = new UndertowServletWebServerFactory("<value>", 0);
		//autoCloseableMocks = MockitoAnnotations.openMocks(this);
		//doReturn(false).when(delegateMock).isUseForwardHeaders();
		//Act Statement(s)
		//boolean result = target.isUseForwardHeaders();
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result, equalTo(Boolean.FALSE));
    verify(delegateMock).isUseForwardHeaders();
});*/
	}

	//Sapient generated method id: ${23632c96-3de1-37cc-bcfa-07a2ca0d1461}
	@Test()
	void setDeploymentInfoCustomizersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new UndertowServletWebServerFactory("contextPath", 8080);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizerMock = mock(UndertowDeploymentInfoCustomizer.class, "LinkedHashSet");
		Collection<UndertowDeploymentInfoCustomizer> collection = new ArrayList<>();
		collection.add(undertowDeploymentInfoCustomizerMock);
		//Act Statement(s)
		target.setDeploymentInfoCustomizers(collection);
		//Assert statement(s)
		assertAll("result", () -> assertThat(target.getDeploymentInfoCustomizers().size(), equalTo(0)));
	}

	//Sapient generated method id: ${1d216f09-ec52-36e5-be54-55bca6a33eaa}
	@Test()
	void addDeploymentInfoCustomizersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizerMock = mock(UndertowDeploymentInfoCustomizer.class, "UndertowDeploymentInfoCustomizer[] customizers");
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
    UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray = new UndertowDeploymentInfoCustomizer[] { undertowDeploymentInfoCustomizerMock };
    _assert.when(() -> Assert.notNull(undertowDeploymentInfoCustomizerArray, "UndertowDeploymentInfoCustomizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    target = new UndertowServletWebServerFactory("String contextPath", 0);
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    //Act Statement(s)
    target.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray);
    //Assert statement(s)
    assertAll("result", () -> _assert.verify(() -> Assert.notNull(undertowDeploymentInfoCustomizerArray, "UndertowDeploymentInfoCustomizers must not be null"), atLeast(1)));
}*/
	}

	//Sapient generated method id: ${848ff689-b857-35a7-ba27-ba321e54910b}
	@Test()
	void getDeploymentInfoCustomizersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new UndertowServletWebServerFactory("<value>", 0);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		//Act Statement(s)
		Collection<UndertowDeploymentInfoCustomizer> result = target.getDeploymentInfoCustomizers();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${fa944bc7-69fd-3e8b-b590-1a730f6954a4}
	@Test()
	void getWebServerWhenCaughtIOExceptionThrowsIllegalStateException() throws IOException {
		/* Branches:
		 * (this.resourceLoader != null) : false  #  inside getServletClassLoader method
		 * (isRegisterDefaultServlet()) : true  #  inside createManager method
		 * (for-each(getErrorPages())) : true  #  inside configureErrorPages method
		 * (errorPage.getStatus() != null) : false  #  inside getUndertowErrorPage method
		 * (errorPage.getException() != null) : false  #  inside getUndertowErrorPage method
		 * (docBase != null) : true  #  inside getCanonicalDocumentRoot method
		 * (catch-exception (IOException)) : true  #  inside getCanonicalDocumentRoot method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//ErrorPage errorPageMock = mock(ErrorPage.class);
		//DeploymentInfo deploymentInfoMock = mock(DeploymentInfo.class);
		//DeploymentInfo deploymentInfoMock2 = mock(DeploymentInfo.class);
		//DeploymentInfo deploymentInfoMock3 = mock(DeploymentInfo.class);
		//DeploymentInfo deploymentInfoMock4 = mock(DeploymentInfo.class);
		//DeploymentInfo deploymentInfoMock5 = mock(DeploymentInfo.class);
        /*try (MockedStatic<Servlets> servlets = mockStatic(Servlets.class, CALLS_REAL_METHODS);
    MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    doReturn(null).when(errorPageMock).getStatus();
    doReturn(null).when(errorPageMock).getException();
    doReturn("return_of_getPath1").when(errorPageMock).getPath();
    _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    servlets.when(() -> Servlets.deployment()).thenReturn(deploymentInfoMock);
    doReturn(deploymentInfoMock2).when(deploymentInfoMock).addServletContainerInitializer((ServletContainerInitializerInfo) any());
    ClassLoader classLoader = UndertowServletWebServerFactory.class.getClassLoader();
    DeploymentInfo deploymentInfo = deploymentInfoMock.setClassLoader(classLoader);
    doReturn(deploymentInfo).when(deploymentInfoMock).setClassLoader((ClassLoader) any());
    doReturn(deploymentInfoMock3).when(deploymentInfoMock).setContextPath("/A");
    doReturn(deploymentInfoMock4).when(deploymentInfoMock).setDisplayName("displayName1");
    DeploymentInfo deploymentInfo2 = deploymentInfoMock.setDeploymentName("spring-boot");
    doReturn(deploymentInfo2).when(deploymentInfoMock).setDeploymentName("spring-boot");
    ServletInfo servletInfo = Servlets.servlet("default", DefaultServlet.class);
    DeploymentInfo deploymentInfo3 = deploymentInfoMock.addServlet(servletInfo);
    doReturn(deploymentInfo3).when(deploymentInfoMock).addServlet((ServletInfo) any());
    doReturn(deploymentInfoMock5).when(deploymentInfoMock).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
    DeploymentInfo deploymentInfo4 = deploymentInfoMock.setServletStackTraces(ServletStackTraces.NONE);
    doReturn(deploymentInfo4).when(deploymentInfoMock).setServletStackTraces(ServletStackTraces.NONE);
    target = new UndertowServletWebServerFactory("/A", 0);
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    target.setRegisterDefaultServlet(true);
    target.setDisplayName("displayName1");
    Set<ErrorPage> errorPageSet = new HashSet<>();
    errorPageSet.add(errorPageMock);
    target.setErrorPages(errorPageSet);
    File file = new File("pathname1");
    doReturn(file).when(documentRootMock).getValidDirectory();
    ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
    //Act Statement(s)
    final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
        target.getWebServer(servletContextInitializerArray);
    });
    IOException iOException = new IOException();
    IllegalStateException illegalStateException = new IllegalStateException("Cannot get canonical document root", iOException);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(notNullValue()));
        assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
        verify(errorPageMock, atLeast(1)).getStatus();
        verify(errorPageMock, atLeast(1)).getException();
        verify(errorPageMock, atLeast(1)).getPath();
        _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
        servlets.verify(() -> Servlets.deployment(), atLeast(1));
        verify(deploymentInfoMock, atLeast(1)).addServletContainerInitializer((ServletContainerInitializerInfo) any());
        verify(deploymentInfoMock, atLeast(1)).setClassLoader((ClassLoader) any());
        verify(deploymentInfoMock, atLeast(1)).setContextPath("/A");
        verify(deploymentInfoMock, atLeast(1)).setDisplayName("displayName1");
        verify(deploymentInfoMock, atLeast(1)).setDeploymentName("spring-boot");
        verify(deploymentInfoMock, atLeast(1)).addServlet((ServletInfo) any());
        verify(deploymentInfoMock, atLeast(1)).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
        verify(deploymentInfoMock, atLeast(1)).setServletStackTraces(ServletStackTraces.NONE);
        verify(documentRootMock, atLeast(1)).getValidDirectory();
    });
}*/
	}

	//Sapient generated method id: ${6d279605-c7f3-35c3-942e-c534a6e96540}
	@Test()
	void getWebServerWhenCaughtExceptionThrowsRuntimeException() throws URISyntaxException {
		/* Branches:
		 * (this.resourceLoader != null) : false  #  inside getServletClassLoader method
		 * (isRegisterDefaultServlet()) : true  #  inside createManager method
		 * (for-each(getErrorPages())) : true  #  inside configureErrorPages method
		 * (errorPage.getStatus() != null) : false  #  inside getUndertowErrorPage method
		 * (errorPage.getException() != null) : false  #  inside getUndertowErrorPage method
		 * (docBase != null) : true  #  inside getCanonicalDocumentRoot method
		 * (docBase.isDirectory()) : true  #  inside getDocumentRootResourceManager method
		 * (root != null) : true  #  inside getDocumentRootResourceManager method
		 * (for-each(metaInfResourceUrls)) : true  #  inside getDocumentRootResourceManager method
		 * ("file".equals(url.getProtocol())) : true  #  inside getDocumentRootResourceManager method
		 * (file.isFile()) : true  #  inside getDocumentRootResourceManager method
		 * (catch-exception (Exception)) : true  #  inside getDocumentRootResourceManager method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//ErrorPage errorPageMock = mock(ErrorPage.class);
		//DeploymentInfo deploymentInfoMock = mock(DeploymentInfo.class);
		//DeploymentInfo deploymentInfoMock2 = mock(DeploymentInfo.class);
		//DeploymentInfo deploymentInfoMock3 = mock(DeploymentInfo.class);
		//DeploymentInfo deploymentInfoMock4 = mock(DeploymentInfo.class);
		//DeploymentInfo deploymentInfoMock5 = mock(DeploymentInfo.class);
        /*try (MockedStatic<Servlets> servlets = mockStatic(Servlets.class, CALLS_REAL_METHODS);
    MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    doReturn(null).when(errorPageMock).getStatus();
    doReturn(null).when(errorPageMock).getException();
    doReturn("return_of_getPath1").when(errorPageMock).getPath();
    _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    servlets.when(() -> Servlets.deployment()).thenReturn(deploymentInfoMock);
    doReturn(deploymentInfoMock2).when(deploymentInfoMock).addServletContainerInitializer((ServletContainerInitializerInfo) any());
    ClassLoader classLoader = UndertowServletWebServerFactory.class.getClassLoader();
    DeploymentInfo deploymentInfo = deploymentInfoMock.setClassLoader(classLoader);
    doReturn(deploymentInfo).when(deploymentInfoMock).setClassLoader((ClassLoader) any());
    doReturn(deploymentInfoMock3).when(deploymentInfoMock).setContextPath("/A");
    doReturn(deploymentInfoMock4).when(deploymentInfoMock).setDisplayName("displayName1");
    DeploymentInfo deploymentInfo2 = deploymentInfoMock.setDeploymentName("spring-boot");
    doReturn(deploymentInfo2).when(deploymentInfoMock).setDeploymentName("spring-boot");
    ServletInfo servletInfo = Servlets.servlet("default", DefaultServlet.class);
    DeploymentInfo deploymentInfo3 = deploymentInfoMock.addServlet(servletInfo);
    doReturn(deploymentInfo3).when(deploymentInfoMock).addServlet((ServletInfo) any());
    doReturn(deploymentInfoMock5).when(deploymentInfoMock).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
    DeploymentInfo deploymentInfo4 = deploymentInfoMock.setServletStackTraces(ServletStackTraces.NONE);
    doReturn(deploymentInfo4).when(deploymentInfoMock).setServletStackTraces(ServletStackTraces.NONE);
    target = new UndertowServletWebServerFactory("/A", 0);
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    target.setRegisterDefaultServlet(true);
    target.setDisplayName("displayName1");
    Set<ErrorPage> errorPageSet = new HashSet<>();
    errorPageSet.add(errorPageMock);
    target.setErrorPages(errorPageSet);
    File file = new File("pathname1");
    doReturn(file).when(documentRootMock).getValidDirectory();
    List<URL> uRLList = new ArrayList<>();
    uRLList.add((URL) null);
    doReturn(uRLList).when(staticResourceJarsMock).getUrls();
    ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
    //Act Statement(s)
    final RuntimeException result = assertThrows(RuntimeException.class, () -> {
        target.getWebServer(servletContextInitializerArray);
    });
    Exception exception = new Exception();
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(notNullValue()));
        assertThat(result.getCause(), is(instanceOf(exception.getClass())));
        verify(errorPageMock, atLeast(1)).getStatus();
        verify(errorPageMock, atLeast(1)).getException();
        verify(errorPageMock, atLeast(1)).getPath();
        _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
        servlets.verify(() -> Servlets.deployment(), atLeast(1));
        verify(deploymentInfoMock, atLeast(1)).addServletContainerInitializer((ServletContainerInitializerInfo) any());
        verify(deploymentInfoMock, atLeast(1)).setClassLoader((ClassLoader) any());
        verify(deploymentInfoMock, atLeast(1)).setContextPath("/A");
        verify(deploymentInfoMock, atLeast(1)).setDisplayName("displayName1");
        verify(deploymentInfoMock, atLeast(1)).setDeploymentName("spring-boot");
        verify(deploymentInfoMock, atLeast(1)).addServlet((ServletInfo) any());
        verify(deploymentInfoMock, atLeast(1)).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
        verify(deploymentInfoMock, atLeast(1)).setServletStackTraces(ServletStackTraces.NONE);
        verify(documentRootMock, atLeast(1)).getValidDirectory();
        verify(staticResourceJarsMock, atLeast(1)).getUrls();
    });
}*/
	}

	//Sapient generated method id: ${42bd8656-1eaa-3180-8f17-f27add210f5b}
	@Test()
	void getWebServerWhenGetSessionNotIsPersistentAndManagerGetDeploymentNotInstanceOfDeploymentImpl3ThrowsNullPointerException() {
		/* Branches:
		 * (this.resourceLoader != null) : false  #  inside getServletClassLoader method
		 * (isRegisterDefaultServlet()) : true  #  inside createManager method
		 * (for-each(getErrorPages())) : true  #  inside configureErrorPages method
		 * (errorPage.getStatus() != null) : true  #  inside getUndertowErrorPage method
		 * (docBase != null) : true  #  inside getCanonicalDocumentRoot method
		 * (docBase.isDirectory()) : true  #  inside getDocumentRootResourceManager method
		 * (root != null) : true  #  inside getDocumentRootResourceManager method
		 * (for-each(metaInfResourceUrls)) : true  #  inside getDocumentRootResourceManager method
		 * ("file".equals(url.getProtocol())) : false  #  inside getDocumentRootResourceManager method
		 * (for-each(getMimeMappings())) : false  #  inside configureMimeMappings method
		 * (for-each(getWebListenerClassNames())) : false  #  inside configureWebListeners method
		 * (for-each(this.deploymentInfoCustomizers)) : false  #  inside createManager method
		 * (getSession().isPersistent()) : false  #  inside createManager method
		 * (manager.getDeployment() instanceof DeploymentImpl managerDeployment) : false  #  inside createManager method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ErrorPage errorPageMock = mock(ErrorPage.class);
		MimeMappings mimeMappingsMock = mock(MimeMappings.class);
		DeploymentInfo deploymentInfoMock = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock2 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock3 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock4 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock5 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock6 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock7 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock8 = mock(DeploymentInfo.class);
		ServletContainer servletContainerMock = mock(ServletContainer.class);
		DeploymentManager deploymentManagerMock = mock(DeploymentManager.class);
		try (MockedStatic<Servlets> servlets = mockStatic(Servlets.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(HttpStatus.CONTINUE).when(errorPageMock).getStatus();
			doReturn("return_of_getPath1").when(errorPageMock).getPath();
			doReturn(0).when(errorPageMock).getStatusCode();
			doReturn(null).when(mimeMappingsMock).iterator();
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			servlets.when(() -> Servlets.deployment()).thenReturn(deploymentInfoMock);
			doReturn(deploymentInfoMock2).when(deploymentInfoMock).addServletContainerInitializer((ServletContainerInitializerInfo) any());
			ClassLoader classLoader = UndertowServletWebServerFactory.class.getClassLoader();
			DeploymentInfo deploymentInfo = deploymentInfoMock.setClassLoader(classLoader);
			doReturn(deploymentInfo).when(deploymentInfoMock).setClassLoader((ClassLoader) any());
			doReturn(deploymentInfoMock3).when(deploymentInfoMock).setContextPath("/A");
			doReturn(deploymentInfoMock4).when(deploymentInfoMock).setDisplayName("displayName1");
			DeploymentInfo deploymentInfo2 = deploymentInfoMock.setDeploymentName("spring-boot");
			doReturn(deploymentInfo2).when(deploymentInfoMock).setDeploymentName("spring-boot");
			ServletInfo servletInfo = Servlets.servlet("default", DefaultServlet.class);
			DeploymentInfo deploymentInfo3 = deploymentInfoMock.addServlet(servletInfo);
			doReturn(deploymentInfo3).when(deploymentInfoMock).addServlet((ServletInfo) any());
			doReturn(deploymentInfoMock5).when(deploymentInfoMock).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
			DeploymentInfo deploymentInfo4 = deploymentInfoMock.setServletStackTraces(ServletStackTraces.NONE);
			doReturn(deploymentInfo4).when(deploymentInfoMock).setServletStackTraces(ServletStackTraces.NONE);
			doReturn(deploymentInfoMock6).when(deploymentInfoMock).setResourceManager((CompositeResourceManager) any());
			File file = new File("pathname1");
			doReturn(deploymentInfoMock7).when(deploymentInfoMock).setTempDir(file);
			DeploymentInfo deploymentInfo5 = deploymentInfoMock.setEagerFilterInit(true);
			doReturn(deploymentInfo5).when(deploymentInfoMock).setEagerFilterInit(true);
			doNothing().when(deploymentInfoMock).setPreservePathOnForward(false);
			doReturn(deploymentInfoMock8).when(deploymentInfoMock).addLocaleCharsetMapping("addLocaleMappings_locale1", "addLocaleMappings_charset1");
			servlets.when(() -> Servlets.newContainer()).thenReturn(servletContainerMock);
			doReturn(deploymentManagerMock).when(servletContainerMock).addDeployment(deploymentInfoMock);
			doNothing().when(deploymentManagerMock).deploy();
			doReturn(null).when(deploymentManagerMock).getDeployment();
			target = new UndertowServletWebServerFactory("/A", 2);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setRegisterDefaultServlet(true);
			Locale locale = new Locale("language1");
			Charset charset = Charset.defaultCharset();
			Map<Locale, Charset> localeCharsetMap = new HashMap<>();
			localeCharsetMap.put(locale, charset);
			target.setLocaleCharsetMappings(localeCharsetMap);
			target.setDisplayName("displayName1");
			Set<ErrorPage> errorPageSet = new HashSet<>();
			errorPageSet.add(errorPageMock);
			target.setErrorPages(errorPageSet);
			Session session = new Session();
			session.setPersistent(false);
			target.setSession(session);
			target.setMimeMappings(mimeMappingsMock);
			File file2 = new File("pathname1");
			doReturn(file2).when(documentRootMock).getValidDirectory();
			List<URL> uRLList = new ArrayList<>();
			uRLList.add((URL) null);
			doReturn(uRLList).when(staticResourceJarsMock).getUrls();
			ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				target.getWebServer(servletContextInitializerArray);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(errorPageMock, atLeast(1)).getStatus();
				verify(errorPageMock, atLeast(1)).getPath();
				verify(errorPageMock, atLeast(1)).getStatusCode();
				verify(mimeMappingsMock, atLeast(1)).iterator();
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				servlets.verify(() -> Servlets.deployment(), atLeast(1));
				verify(deploymentInfoMock, atLeast(1)).addServletContainerInitializer((ServletContainerInitializerInfo) any());
				verify(deploymentInfoMock, atLeast(1)).setClassLoader((ClassLoader) any());
				verify(deploymentInfoMock, atLeast(1)).setContextPath("/A");
				verify(deploymentInfoMock, atLeast(1)).setDisplayName("displayName1");
				verify(deploymentInfoMock, atLeast(1)).setDeploymentName("spring-boot");
				verify(deploymentInfoMock, atLeast(1)).addServlet((ServletInfo) any());
				verify(deploymentInfoMock, atLeast(1)).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
				verify(deploymentInfoMock, atLeast(1)).setServletStackTraces(ServletStackTraces.NONE);
				verify(deploymentInfoMock, atLeast(1)).setResourceManager((CompositeResourceManager) any());
				verify(deploymentInfoMock, atLeast(1)).setTempDir(file);
				verify(deploymentInfoMock, atLeast(1)).setEagerFilterInit(true);
				verify(deploymentInfoMock, atLeast(1)).setPreservePathOnForward(false);
				verify(deploymentInfoMock, atLeast(1)).addLocaleCharsetMapping("addLocaleMappings_locale1", "addLocaleMappings_charset1");
				servlets.verify(() -> Servlets.newContainer(), atLeast(1));
				verify(servletContainerMock, atLeast(1)).addDeployment(deploymentInfoMock);
				verify(deploymentManagerMock, atLeast(1)).deploy();
				verify(deploymentManagerMock, times(2)).getDeployment();
				verify(documentRootMock, atLeast(1)).getValidDirectory();
				verify(staticResourceJarsMock, atLeast(1)).getUrls();
			});
		}
	}

	//Sapient generated method id: ${87ba9d83-f55a-310b-a43d-6d6778be6707}
	@Test()
	void getWebServerWhenGetSessionNotIsPersistentAndManagerGetDeploymentNotInstanceOfDeploymentImpl4ThrowsNullPointerException() {
		/* Branches:
		 * (this.resourceLoader != null) : false  #  inside getServletClassLoader method
		 * (isRegisterDefaultServlet()) : true  #  inside createManager method
		 * (for-each(getErrorPages())) : true  #  inside configureErrorPages method
		 * (errorPage.getStatus() != null) : false  #  inside getUndertowErrorPage method
		 * (errorPage.getException() != null) : true  #  inside getUndertowErrorPage method
		 * (docBase != null) : false  #  inside getCanonicalDocumentRoot method
		 * (docBase.isDirectory()) : false  #  inside getDocumentRootResourceManager method
		 * (root != null) : false  #  inside getDocumentRootResourceManager method
		 * (for-each(metaInfResourceUrls)) : false  #  inside getDocumentRootResourceManager method
		 * (for-each(getMimeMappings())) : false  #  inside configureMimeMappings method
		 * (for-each(getWebListenerClassNames())) : false  #  inside configureWebListeners method
		 * (for-each(this.deploymentInfoCustomizers)) : false  #  inside createManager method
		 * (getSession().isPersistent()) : false  #  inside createManager method
		 * (manager.getDeployment() instanceof DeploymentImpl managerDeployment) : false  #  inside createManager method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ErrorPage errorPageMock = mock(ErrorPage.class);
		MimeMappings mimeMappingsMock = mock(MimeMappings.class);
		DeploymentInfo deploymentInfoMock = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock2 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock3 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock4 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock5 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock6 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock7 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock8 = mock(DeploymentInfo.class);
		ServletContainer servletContainerMock = mock(ServletContainer.class);
		DeploymentManager deploymentManagerMock = mock(DeploymentManager.class);
		try (MockedStatic<Servlets> servlets = mockStatic(Servlets.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(null).when(errorPageMock).getStatus();
			doReturn(Throwable.class).when(errorPageMock).getException();
			doReturn("return_of_getPath1").when(errorPageMock).getPath();
			doReturn(null).when(mimeMappingsMock).iterator();
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			servlets.when(() -> Servlets.deployment()).thenReturn(deploymentInfoMock);
			doReturn(deploymentInfoMock2).when(deploymentInfoMock).addServletContainerInitializer((ServletContainerInitializerInfo) any());
			ClassLoader classLoader = UndertowServletWebServerFactory.class.getClassLoader();
			DeploymentInfo deploymentInfo = deploymentInfoMock.setClassLoader(classLoader);
			doReturn(deploymentInfo).when(deploymentInfoMock).setClassLoader((ClassLoader) any());
			doReturn(deploymentInfoMock3).when(deploymentInfoMock).setContextPath("/A");
			doReturn(deploymentInfoMock4).when(deploymentInfoMock).setDisplayName("displayName1");
			DeploymentInfo deploymentInfo2 = deploymentInfoMock.setDeploymentName("spring-boot");
			doReturn(deploymentInfo2).when(deploymentInfoMock).setDeploymentName("spring-boot");
			ServletInfo servletInfo = Servlets.servlet("default", DefaultServlet.class);
			DeploymentInfo deploymentInfo3 = deploymentInfoMock.addServlet(servletInfo);
			doReturn(deploymentInfo3).when(deploymentInfoMock).addServlet((ServletInfo) any());
			doReturn(deploymentInfoMock5).when(deploymentInfoMock).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
			DeploymentInfo deploymentInfo4 = deploymentInfoMock.setServletStackTraces(ServletStackTraces.NONE);
			doReturn(deploymentInfo4).when(deploymentInfoMock).setServletStackTraces(ServletStackTraces.NONE);
			doReturn(deploymentInfoMock6).when(deploymentInfoMock).setResourceManager((CompositeResourceManager) any());
			File file = new File("pathname1");
			doReturn(deploymentInfoMock7).when(deploymentInfoMock).setTempDir(file);
			DeploymentInfo deploymentInfo5 = deploymentInfoMock.setEagerFilterInit(true);
			doReturn(deploymentInfo5).when(deploymentInfoMock).setEagerFilterInit(true);
			doNothing().when(deploymentInfoMock).setPreservePathOnForward(false);
			doReturn(deploymentInfoMock8).when(deploymentInfoMock).addLocaleCharsetMapping("addLocaleMappings_locale1", "addLocaleMappings_charset1");
			servlets.when(() -> Servlets.newContainer()).thenReturn(servletContainerMock);
			doReturn(deploymentManagerMock).when(servletContainerMock).addDeployment(deploymentInfoMock);
			doNothing().when(deploymentManagerMock).deploy();
			doReturn(null).when(deploymentManagerMock).getDeployment();
			target = new UndertowServletWebServerFactory("/A", 2);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setRegisterDefaultServlet(true);
			Locale locale = new Locale("language1");
			Charset charset = Charset.defaultCharset();
			Map<Locale, Charset> localeCharsetMap = new HashMap<>();
			localeCharsetMap.put(locale, charset);
			target.setLocaleCharsetMappings(localeCharsetMap);
			target.setDisplayName("displayName1");
			Set<ErrorPage> errorPageSet = new HashSet<>();
			errorPageSet.add(errorPageMock);
			target.setErrorPages(errorPageSet);
			Session session = new Session();
			session.setPersistent(false);
			target.setSession(session);
			target.setMimeMappings(mimeMappingsMock);
			doReturn(null).when(documentRootMock).getValidDirectory();
			List<URL> uRLList = new ArrayList<>();
			doReturn(uRLList).when(staticResourceJarsMock).getUrls();
			ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				target.getWebServer(servletContextInitializerArray);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(errorPageMock, atLeast(1)).getStatus();
				verify(errorPageMock, times(2)).getException();
				verify(errorPageMock, atLeast(1)).getPath();
				verify(mimeMappingsMock, atLeast(1)).iterator();
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				servlets.verify(() -> Servlets.deployment(), atLeast(1));
				verify(deploymentInfoMock, atLeast(1)).addServletContainerInitializer((ServletContainerInitializerInfo) any());
				verify(deploymentInfoMock, atLeast(1)).setClassLoader((ClassLoader) any());
				verify(deploymentInfoMock, atLeast(1)).setContextPath("/A");
				verify(deploymentInfoMock, atLeast(1)).setDisplayName("displayName1");
				verify(deploymentInfoMock, atLeast(1)).setDeploymentName("spring-boot");
				verify(deploymentInfoMock, atLeast(1)).addServlet((ServletInfo) any());
				verify(deploymentInfoMock, atLeast(1)).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
				verify(deploymentInfoMock, atLeast(1)).setServletStackTraces(ServletStackTraces.NONE);
				verify(deploymentInfoMock, atLeast(1)).setResourceManager((CompositeResourceManager) any());
				verify(deploymentInfoMock, atLeast(1)).setTempDir(file);
				verify(deploymentInfoMock, atLeast(1)).setEagerFilterInit(true);
				verify(deploymentInfoMock, atLeast(1)).setPreservePathOnForward(false);
				verify(deploymentInfoMock, atLeast(1)).addLocaleCharsetMapping("addLocaleMappings_locale1", "addLocaleMappings_charset1");
				servlets.verify(() -> Servlets.newContainer(), atLeast(1));
				verify(servletContainerMock, atLeast(1)).addDeployment(deploymentInfoMock);
				verify(deploymentManagerMock, atLeast(1)).deploy();
				verify(deploymentManagerMock, times(2)).getDeployment();
				verify(documentRootMock, atLeast(1)).getValidDirectory();
				verify(staticResourceJarsMock, atLeast(1)).getUrls();
			});
		}
	}

	//Sapient generated method id: ${d4ebedd5-57b3-3e8d-9f69-ac31519c70f6}
	@Test()
	void getWebServerWhenGetSessionNotIsPersistentAndManagerGetDeploymentNotInstanceOfDeploymentImpl5ThrowsNullPointerException() {
		/* Branches:
		 * (this.resourceLoader != null) : false  #  inside getServletClassLoader method
		 * (isRegisterDefaultServlet()) : true  #  inside createManager method
		 * (for-each(getErrorPages())) : true  #  inside configureErrorPages method
		 * (errorPage.getStatus() != null) : false  #  inside getUndertowErrorPage method
		 * (errorPage.getException() != null) : false  #  inside getUndertowErrorPage method
		 * (docBase != null) : false  #  inside getCanonicalDocumentRoot method
		 * (docBase.isDirectory()) : false  #  inside getDocumentRootResourceManager method
		 * (root != null) : false  #  inside getDocumentRootResourceManager method
		 * (for-each(metaInfResourceUrls)) : false  #  inside getDocumentRootResourceManager method
		 * (for-each(getMimeMappings())) : false  #  inside configureMimeMappings method
		 * (for-each(getWebListenerClassNames())) : false  #  inside configureWebListeners method
		 * (for-each(this.deploymentInfoCustomizers)) : false  #  inside createManager method
		 * (getSession().isPersistent()) : false  #  inside createManager method
		 * (manager.getDeployment() instanceof DeploymentImpl managerDeployment) : false  #  inside createManager method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//ErrorPage errorPageMock = mock(ErrorPage.class);
		//MimeMappings mimeMappingsMock = mock(MimeMappings.class);
		//DeploymentInfo deploymentInfoMock = mock(DeploymentInfo.class);
		//DeploymentInfo deploymentInfoMock2 = mock(DeploymentInfo.class);
		//DeploymentInfo deploymentInfoMock3 = mock(DeploymentInfo.class);
		//DeploymentInfo deploymentInfoMock4 = mock(DeploymentInfo.class);
		//DeploymentInfo deploymentInfoMock5 = mock(DeploymentInfo.class);
		//DeploymentInfo deploymentInfoMock6 = mock(DeploymentInfo.class);
		//DeploymentInfo deploymentInfoMock7 = mock(DeploymentInfo.class);
		//DeploymentInfo deploymentInfoMock8 = mock(DeploymentInfo.class);
		//ServletContainer servletContainerMock = mock(ServletContainer.class);
		//DeploymentManager deploymentManagerMock = mock(DeploymentManager.class);
        /*try (MockedStatic<Servlets> servlets = mockStatic(Servlets.class, CALLS_REAL_METHODS);
    MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    doReturn(null).when(errorPageMock).getStatus();
    doReturn(null).when(errorPageMock).getException();
    doReturn("return_of_getPath1").when(errorPageMock).getPath();
    doReturn(null).when(mimeMappingsMock).iterator();
    _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    servlets.when(() -> Servlets.deployment()).thenReturn(deploymentInfoMock);
    doReturn(deploymentInfoMock2).when(deploymentInfoMock).addServletContainerInitializer((ServletContainerInitializerInfo) any());
    ClassLoader classLoader = UndertowServletWebServerFactory.class.getClassLoader();
    DeploymentInfo deploymentInfo = deploymentInfoMock.setClassLoader(classLoader);
    doReturn(deploymentInfo).when(deploymentInfoMock).setClassLoader((ClassLoader) any());
    doReturn(deploymentInfoMock3).when(deploymentInfoMock).setContextPath("/A");
    doReturn(deploymentInfoMock4).when(deploymentInfoMock).setDisplayName("displayName1");
    DeploymentInfo deploymentInfo2 = deploymentInfoMock.setDeploymentName("spring-boot");
    doReturn(deploymentInfo2).when(deploymentInfoMock).setDeploymentName("spring-boot");
    ServletInfo servletInfo = Servlets.servlet("default", DefaultServlet.class);
    DeploymentInfo deploymentInfo3 = deploymentInfoMock.addServlet(servletInfo);
    doReturn(deploymentInfo3).when(deploymentInfoMock).addServlet((ServletInfo) any());
    doReturn(deploymentInfoMock5).when(deploymentInfoMock).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
    DeploymentInfo deploymentInfo4 = deploymentInfoMock.setServletStackTraces(ServletStackTraces.NONE);
    doReturn(deploymentInfo4).when(deploymentInfoMock).setServletStackTraces(ServletStackTraces.NONE);
    doReturn(deploymentInfoMock6).when(deploymentInfoMock).setResourceManager((CompositeResourceManager) any());
    File file = new File("pathname1");
    doReturn(deploymentInfoMock7).when(deploymentInfoMock).setTempDir(file);
    DeploymentInfo deploymentInfo5 = deploymentInfoMock.setEagerFilterInit(true);
    doReturn(deploymentInfo5).when(deploymentInfoMock).setEagerFilterInit(true);
    doNothing().when(deploymentInfoMock).setPreservePathOnForward(false);
    doReturn(deploymentInfoMock8).when(deploymentInfoMock).addLocaleCharsetMapping("addLocaleMappings_locale1", "addLocaleMappings_charset1");
    servlets.when(() -> Servlets.newContainer()).thenReturn(servletContainerMock);
    doReturn(deploymentManagerMock).when(servletContainerMock).addDeployment(deploymentInfoMock);
    doNothing().when(deploymentManagerMock).deploy();
    doReturn(null).when(deploymentManagerMock).getDeployment();
    target = new UndertowServletWebServerFactory("/A", 2);
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    target.setRegisterDefaultServlet(true);
    Locale locale = new Locale("language1");
    Charset charset = Charset.defaultCharset();
    Map<Locale, Charset> localeCharsetMap = new HashMap<>();
    localeCharsetMap.put(locale, charset);
    target.setLocaleCharsetMappings(localeCharsetMap);
    target.setDisplayName("displayName1");
    Set<ErrorPage> errorPageSet = new HashSet<>();
    errorPageSet.add(errorPageMock);
    target.setErrorPages(errorPageSet);
    Session session = new Session();
    session.setPersistent(false);
    target.setSession(session);
    target.setMimeMappings(mimeMappingsMock);
    doReturn(null).when(documentRootMock).getValidDirectory();
    List<URL> uRLList = new ArrayList<>();
    doReturn(uRLList).when(staticResourceJarsMock).getUrls();
    ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
    //Act Statement(s)
    final NullPointerException result = assertThrows(NullPointerException.class, () -> {
        target.getWebServer(servletContextInitializerArray);
    });
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(notNullValue()));
        verify(errorPageMock, atLeast(1)).getStatus();
        verify(errorPageMock, atLeast(1)).getException();
        verify(errorPageMock, atLeast(1)).getPath();
        verify(mimeMappingsMock, atLeast(1)).iterator();
        _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
        servlets.verify(() -> Servlets.deployment(), atLeast(1));
        verify(deploymentInfoMock, atLeast(1)).addServletContainerInitializer((ServletContainerInitializerInfo) any());
        verify(deploymentInfoMock, atLeast(1)).setClassLoader((ClassLoader) any());
        verify(deploymentInfoMock, atLeast(1)).setContextPath("/A");
        verify(deploymentInfoMock, atLeast(1)).setDisplayName("displayName1");
        verify(deploymentInfoMock, atLeast(1)).setDeploymentName("spring-boot");
        verify(deploymentInfoMock, atLeast(1)).addServlet((ServletInfo) any());
        verify(deploymentInfoMock, atLeast(1)).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
        verify(deploymentInfoMock, atLeast(1)).setServletStackTraces(ServletStackTraces.NONE);
        verify(deploymentInfoMock, atLeast(1)).setResourceManager((CompositeResourceManager) any());
        verify(deploymentInfoMock, atLeast(1)).setTempDir(file);
        verify(deploymentInfoMock, atLeast(1)).setEagerFilterInit(true);
        verify(deploymentInfoMock, atLeast(1)).setPreservePathOnForward(false);
        verify(deploymentInfoMock, atLeast(1)).addLocaleCharsetMapping("addLocaleMappings_locale1", "addLocaleMappings_charset1");
        servlets.verify(() -> Servlets.newContainer(), atLeast(1));
        verify(servletContainerMock, atLeast(1)).addDeployment(deploymentInfoMock);
        verify(deploymentManagerMock, atLeast(1)).deploy();
        verify(deploymentManagerMock, times(2)).getDeployment();
        verify(documentRootMock, atLeast(1)).getValidDirectory();
        verify(staticResourceJarsMock, atLeast(1)).getUrls();
    });
}*/
	}

	//Sapient generated method id: ${3b82ae3a-2399-3975-bfed-fe7ddebf8e81}
	@Test()
	void getWebServerWhenThisDeploymentInfoCustomizersIsEmptyAndGetSessionIsPersistentAndManagerGetDepThrowsNullPointerException() {
		/* Branches:
		 * (this.resourceLoader != null) : false  #  inside getServletClassLoader method
		 * (isRegisterDefaultServlet()) : true  #  inside createManager method
		 * (for-each(getErrorPages())) : true  #  inside configureErrorPages method
		 * (errorPage.getStatus() != null) : true  #  inside getUndertowErrorPage method
		 * (docBase != null) : true  #  inside getCanonicalDocumentRoot method
		 * (docBase.isDirectory()) : true  #  inside getDocumentRootResourceManager method
		 * (root != null) : true  #  inside getDocumentRootResourceManager method
		 * (for-each(metaInfResourceUrls)) : true  #  inside getDocumentRootResourceManager method
		 * ("file".equals(url.getProtocol())) : true  #  inside getDocumentRootResourceManager method
		 * (file.isFile()) : true  #  inside getDocumentRootResourceManager method
		 * (for-each(getMimeMappings())) : true  #  inside configureMimeMappings method
		 * (for-each(getWebListenerClassNames())) : false  #  inside configureWebListeners method
		 * (for-each(this.deploymentInfoCustomizers)) : false  #  inside createManager method
		 * (getSession().isPersistent()) : true  #  inside createManager method
		 * (manager.getDeployment() instanceof DeploymentImpl managerDeployment) : false  #  inside createManager method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ErrorPage errorPageMock = mock(ErrorPage.class);
		MimeMappings mimeMappingsMock = mock(MimeMappings.class);
		DeploymentInfo deploymentInfoMock = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock2 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock3 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock4 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock5 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock6 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock7 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock8 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock9 = mock(DeploymentInfo.class);
		SessionStoreDirectory sessionStoreDirectoryMock = mock(SessionStoreDirectory.class);
		DeploymentInfo deploymentInfoMock10 = mock(DeploymentInfo.class);
		ServletContainer servletContainerMock = mock(ServletContainer.class);
		DeploymentManager deploymentManagerMock = mock(DeploymentManager.class);
		try (MockedStatic<Servlets> servlets = mockStatic(Servlets.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(HttpStatus.CONTINUE).when(errorPageMock).getStatus();
			doReturn("return_of_getPath1").when(errorPageMock).getPath();
			doReturn(0).when(errorPageMock).getStatusCode();
			doReturn(null).when(mimeMappingsMock).iterator();
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			servlets.when(() -> Servlets.deployment()).thenReturn(deploymentInfoMock);
			doReturn(deploymentInfoMock2).when(deploymentInfoMock).addServletContainerInitializer((ServletContainerInitializerInfo) any());
			ClassLoader classLoader = UndertowServletWebServerFactory.class.getClassLoader();
			DeploymentInfo deploymentInfo = deploymentInfoMock.setClassLoader(classLoader);
			doReturn(deploymentInfo).when(deploymentInfoMock).setClassLoader((ClassLoader) any());
			doReturn(deploymentInfoMock3).when(deploymentInfoMock).setContextPath("/A");
			doReturn(deploymentInfoMock4).when(deploymentInfoMock).setDisplayName("displayName1");
			DeploymentInfo deploymentInfo2 = deploymentInfoMock.setDeploymentName("spring-boot");
			doReturn(deploymentInfo2).when(deploymentInfoMock).setDeploymentName("spring-boot");
			ServletInfo servletInfo = Servlets.servlet("default", DefaultServlet.class);
			DeploymentInfo deploymentInfo3 = deploymentInfoMock.addServlet(servletInfo);
			doReturn(deploymentInfo3).when(deploymentInfoMock).addServlet((ServletInfo) any());
			doReturn(deploymentInfoMock5).when(deploymentInfoMock).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
			DeploymentInfo deploymentInfo4 = deploymentInfoMock.setServletStackTraces(ServletStackTraces.NONE);
			doReturn(deploymentInfo4).when(deploymentInfoMock).setServletStackTraces(ServletStackTraces.NONE);
			doReturn(deploymentInfoMock6).when(deploymentInfoMock).setResourceManager((CompositeResourceManager) any());
			File file = new File("pathname1");
			doReturn(deploymentInfoMock7).when(deploymentInfoMock).setTempDir(file);
			DeploymentInfo deploymentInfo5 = deploymentInfoMock.setEagerFilterInit(true);
			doReturn(deploymentInfo5).when(deploymentInfoMock).setEagerFilterInit(true);
			doNothing().when(deploymentInfoMock).setPreservePathOnForward(false);
			doReturn(deploymentInfoMock8).when(deploymentInfoMock).addMimeMapping((MimeMapping) any());
			doReturn(deploymentInfoMock9).when(deploymentInfoMock).setSessionPersistenceManager((FileSessionPersistence) any());
			File file2 = sessionStoreDirectoryMock.getValidDirectory(true);
			doReturn(file2).when(sessionStoreDirectoryMock).getValidDirectory(true);
			doReturn(deploymentInfoMock10).when(deploymentInfoMock).addLocaleCharsetMapping("addLocaleMappings_locale1", "addLocaleMappings_charset1");
			servlets.when(() -> Servlets.newContainer()).thenReturn(servletContainerMock);
			doReturn(deploymentManagerMock).when(servletContainerMock).addDeployment(deploymentInfoMock);
			doNothing().when(deploymentManagerMock).deploy();
			doReturn(null).when(deploymentManagerMock).getDeployment();
			target = new UndertowServletWebServerFactory("/A", 2);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setRegisterDefaultServlet(true);
			Locale locale = new Locale("language1");
			Charset charset = Charset.defaultCharset();
			Map<Locale, Charset> localeCharsetMap = new HashMap<>();
			localeCharsetMap.put(locale, charset);
			target.setLocaleCharsetMappings(localeCharsetMap);
			target.setDisplayName("displayName1");
			Set<ErrorPage> errorPageSet = new HashSet<>();
			errorPageSet.add(errorPageMock);
			target.setErrorPages(errorPageSet);
			target.setSession(sessionMock);
			target.setMimeMappings(mimeMappingsMock);
			File file3 = new File("pathname1");
			doReturn(file3).when(documentRootMock).getValidDirectory();
			List<URL> uRLList = new ArrayList<>();
			uRLList.add((URL) null);
			doReturn(uRLList).when(staticResourceJarsMock).getUrls();
			doReturn(sessionStoreDirectoryMock).when(sessionMock).getSessionStoreDirectory();
			ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				target.getWebServer(servletContextInitializerArray);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(errorPageMock, atLeast(1)).getStatus();
				verify(errorPageMock, atLeast(1)).getPath();
				verify(errorPageMock, atLeast(1)).getStatusCode();
				verify(mimeMappingsMock, atLeast(1)).iterator();
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				servlets.verify(() -> Servlets.deployment(), atLeast(1));
				verify(deploymentInfoMock, atLeast(1)).addServletContainerInitializer((ServletContainerInitializerInfo) any());
				verify(deploymentInfoMock, atLeast(1)).setClassLoader((ClassLoader) any());
				verify(deploymentInfoMock, atLeast(1)).setContextPath("/A");
				verify(deploymentInfoMock, atLeast(1)).setDisplayName("displayName1");
				verify(deploymentInfoMock, atLeast(1)).setDeploymentName("spring-boot");
				verify(deploymentInfoMock, atLeast(1)).addServlet((ServletInfo) any());
				verify(deploymentInfoMock, atLeast(1)).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
				verify(deploymentInfoMock, atLeast(1)).setServletStackTraces(ServletStackTraces.NONE);
				verify(deploymentInfoMock, atLeast(1)).setResourceManager((CompositeResourceManager) any());
				verify(deploymentInfoMock, atLeast(1)).setTempDir(file);
				verify(deploymentInfoMock, atLeast(1)).setEagerFilterInit(true);
				verify(deploymentInfoMock, atLeast(1)).setPreservePathOnForward(false);
				verify(deploymentInfoMock, atLeast(1)).addMimeMapping((MimeMapping) any());
				verify(deploymentInfoMock, atLeast(1)).setSessionPersistenceManager((FileSessionPersistence) any());
				verify(sessionStoreDirectoryMock, atLeast(1)).getValidDirectory(true);
				verify(deploymentInfoMock, atLeast(1)).addLocaleCharsetMapping("addLocaleMappings_locale1", "addLocaleMappings_charset1");
				servlets.verify(() -> Servlets.newContainer(), atLeast(1));
				verify(servletContainerMock, atLeast(1)).addDeployment(deploymentInfoMock);
				verify(deploymentManagerMock, atLeast(1)).deploy();
				verify(deploymentManagerMock, times(2)).getDeployment();
				verify(documentRootMock, atLeast(1)).getValidDirectory();
				verify(staticResourceJarsMock, atLeast(1)).getUrls();
				verify(sessionMock, atLeast(1)).getSessionStoreDirectory();
			});
		}
	}

	//Sapient generated method id: ${e1bf8a55-ccdd-3de2-9a33-1ca498bdf4be}
	@Test()
	void getWebServerWhenGetSessionNotIsPersistentAndManagerGetDeploymentNotInstanceOfDeploymentImpl8ThrowsNullPointerException() {
		/* Branches:
		 * (this.resourceLoader != null) : false  #  inside getServletClassLoader method
		 * (isRegisterDefaultServlet()) : true  #  inside createManager method
		 * (for-each(getErrorPages())) : true  #  inside configureErrorPages method
		 * (errorPage.getStatus() != null) : true  #  inside getUndertowErrorPage method
		 * (docBase != null) : true  #  inside getCanonicalDocumentRoot method
		 * (docBase.isDirectory()) : true  #  inside getDocumentRootResourceManager method
		 * (root != null) : true  #  inside getDocumentRootResourceManager method
		 * (for-each(metaInfResourceUrls)) : true  #  inside getDocumentRootResourceManager method
		 * ("file".equals(url.getProtocol())) : true  #  inside getDocumentRootResourceManager method
		 * (file.isFile()) : false  #  inside getDocumentRootResourceManager method
		 * (for-each(getMimeMappings())) : false  #  inside configureMimeMappings method
		 * (for-each(getWebListenerClassNames())) : false  #  inside configureWebListeners method
		 * (for-each(this.deploymentInfoCustomizers)) : false  #  inside createManager method
		 * (getSession().isPersistent()) : false  #  inside createManager method
		 * (manager.getDeployment() instanceof DeploymentImpl managerDeployment) : false  #  inside createManager method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ErrorPage errorPageMock = mock(ErrorPage.class);
		MimeMappings mimeMappingsMock = mock(MimeMappings.class);
		DeploymentInfo deploymentInfoMock = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock2 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock3 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock4 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock5 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock6 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock7 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock8 = mock(DeploymentInfo.class);
		ServletContainer servletContainerMock = mock(ServletContainer.class);
		DeploymentManager deploymentManagerMock = mock(DeploymentManager.class);
		try (MockedStatic<Servlets> servlets = mockStatic(Servlets.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(HttpStatus.CONTINUE).when(errorPageMock).getStatus();
			doReturn("return_of_getPath1").when(errorPageMock).getPath();
			doReturn(0).when(errorPageMock).getStatusCode();
			doReturn(null).when(mimeMappingsMock).iterator();
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			servlets.when(() -> Servlets.deployment()).thenReturn(deploymentInfoMock);
			doReturn(deploymentInfoMock2).when(deploymentInfoMock).addServletContainerInitializer((ServletContainerInitializerInfo) any());
			ClassLoader classLoader = UndertowServletWebServerFactory.class.getClassLoader();
			DeploymentInfo deploymentInfo = deploymentInfoMock.setClassLoader(classLoader);
			doReturn(deploymentInfo).when(deploymentInfoMock).setClassLoader((ClassLoader) any());
			doReturn(deploymentInfoMock3).when(deploymentInfoMock).setContextPath("/A");
			doReturn(deploymentInfoMock4).when(deploymentInfoMock).setDisplayName("displayName1");
			DeploymentInfo deploymentInfo2 = deploymentInfoMock.setDeploymentName("spring-boot");
			doReturn(deploymentInfo2).when(deploymentInfoMock).setDeploymentName("spring-boot");
			ServletInfo servletInfo = Servlets.servlet("default", DefaultServlet.class);
			DeploymentInfo deploymentInfo3 = deploymentInfoMock.addServlet(servletInfo);
			doReturn(deploymentInfo3).when(deploymentInfoMock).addServlet((ServletInfo) any());
			doReturn(deploymentInfoMock5).when(deploymentInfoMock).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
			DeploymentInfo deploymentInfo4 = deploymentInfoMock.setServletStackTraces(ServletStackTraces.NONE);
			doReturn(deploymentInfo4).when(deploymentInfoMock).setServletStackTraces(ServletStackTraces.NONE);
			doReturn(deploymentInfoMock6).when(deploymentInfoMock).setResourceManager((CompositeResourceManager) any());
			File file = new File("pathname1");
			doReturn(deploymentInfoMock7).when(deploymentInfoMock).setTempDir(file);
			DeploymentInfo deploymentInfo5 = deploymentInfoMock.setEagerFilterInit(true);
			doReturn(deploymentInfo5).when(deploymentInfoMock).setEagerFilterInit(true);
			doNothing().when(deploymentInfoMock).setPreservePathOnForward(false);
			doReturn(deploymentInfoMock8).when(deploymentInfoMock).addLocaleCharsetMapping("addLocaleMappings_locale1", "addLocaleMappings_charset1");
			servlets.when(() -> Servlets.newContainer()).thenReturn(servletContainerMock);
			doReturn(deploymentManagerMock).when(servletContainerMock).addDeployment(deploymentInfoMock);
			doNothing().when(deploymentManagerMock).deploy();
			doReturn(null).when(deploymentManagerMock).getDeployment();
			target = new UndertowServletWebServerFactory("/A", 2);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setRegisterDefaultServlet(true);
			Locale locale = new Locale("language1");
			Charset charset = Charset.defaultCharset();
			Map<Locale, Charset> localeCharsetMap = new HashMap<>();
			localeCharsetMap.put(locale, charset);
			target.setLocaleCharsetMappings(localeCharsetMap);
			target.setDisplayName("displayName1");
			Set<ErrorPage> errorPageSet = new HashSet<>();
			errorPageSet.add(errorPageMock);
			target.setErrorPages(errorPageSet);
			Session session = new Session();
			session.setPersistent(false);
			target.setSession(session);
			target.setMimeMappings(mimeMappingsMock);
			File file2 = new File("pathname1");
			doReturn(file2).when(documentRootMock).getValidDirectory();
			List<URL> uRLList = new ArrayList<>();
			uRLList.add((URL) null);
			doReturn(uRLList).when(staticResourceJarsMock).getUrls();
			ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				target.getWebServer(servletContextInitializerArray);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(errorPageMock, atLeast(1)).getStatus();
				verify(errorPageMock, atLeast(1)).getPath();
				verify(errorPageMock, atLeast(1)).getStatusCode();
				verify(mimeMappingsMock, atLeast(1)).iterator();
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				servlets.verify(() -> Servlets.deployment(), atLeast(1));
				verify(deploymentInfoMock, atLeast(1)).addServletContainerInitializer((ServletContainerInitializerInfo) any());
				verify(deploymentInfoMock, atLeast(1)).setClassLoader((ClassLoader) any());
				verify(deploymentInfoMock, atLeast(1)).setContextPath("/A");
				verify(deploymentInfoMock, atLeast(1)).setDisplayName("displayName1");
				verify(deploymentInfoMock, atLeast(1)).setDeploymentName("spring-boot");
				verify(deploymentInfoMock, atLeast(1)).addServlet((ServletInfo) any());
				verify(deploymentInfoMock, atLeast(1)).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
				verify(deploymentInfoMock, atLeast(1)).setServletStackTraces(ServletStackTraces.NONE);
				verify(deploymentInfoMock, atLeast(1)).setResourceManager((CompositeResourceManager) any());
				verify(deploymentInfoMock, atLeast(1)).setTempDir(file);
				verify(deploymentInfoMock, atLeast(1)).setEagerFilterInit(true);
				verify(deploymentInfoMock, atLeast(1)).setPreservePathOnForward(false);
				verify(deploymentInfoMock, atLeast(1)).addLocaleCharsetMapping("addLocaleMappings_locale1", "addLocaleMappings_charset1");
				servlets.verify(() -> Servlets.newContainer(), atLeast(1));
				verify(servletContainerMock, atLeast(1)).addDeployment(deploymentInfoMock);
				verify(deploymentManagerMock, atLeast(1)).deploy();
				verify(deploymentManagerMock, times(2)).getDeployment();
				verify(documentRootMock, atLeast(1)).getValidDirectory();
				verify(staticResourceJarsMock, atLeast(1)).getUrls();
			});
		}
	}

	//Sapient generated method id: ${3f184de9-950d-3780-b2de-6c922d021477}
	@Test()
	void getWebServerWhenGetSessionIsPersistentAndManagerGetDeploymentNotInstanceOfDeploymentImpl2ThrowsNullPointerException() {
		/* Branches:
		 * (this.resourceLoader != null) : false  #  inside getServletClassLoader method
		 * (isRegisterDefaultServlet()) : true  #  inside createManager method
		 * (for-each(getErrorPages())) : true  #  inside configureErrorPages method
		 * (errorPage.getStatus() != null) : false  #  inside getUndertowErrorPage method
		 * (errorPage.getException() != null) : false  #  inside getUndertowErrorPage method
		 * (docBase != null) : true  #  inside getCanonicalDocumentRoot method
		 * (docBase.isDirectory()) : true  #  inside getDocumentRootResourceManager method
		 * (root != null) : true  #  inside getDocumentRootResourceManager method
		 * (for-each(metaInfResourceUrls)) : true  #  inside getDocumentRootResourceManager method
		 * ("file".equals(url.getProtocol())) : false  #  inside getDocumentRootResourceManager method
		 * (catch-exception (Exception)) : true  #  inside getDocumentRootResourceManager method
		 * (for-each(getMimeMappings())) : true  #  inside configureMimeMappings method
		 * (for-each(getWebListenerClassNames())) : false  #  inside configureWebListeners method
		 * (for-each(this.deploymentInfoCustomizers)) : false  #  inside createManager method
		 * (getSession().isPersistent()) : true  #  inside createManager method
		 * (manager.getDeployment() instanceof DeploymentImpl managerDeployment) : false  #  inside createManager method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ErrorPage errorPageMock = mock(ErrorPage.class);
		MimeMappings mimeMappingsMock = mock(MimeMappings.class);
		DeploymentInfo deploymentInfoMock = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock2 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock3 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock4 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock5 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock6 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock7 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock8 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock9 = mock(DeploymentInfo.class);
		SessionStoreDirectory sessionStoreDirectoryMock = mock(SessionStoreDirectory.class);
		DeploymentInfo deploymentInfoMock10 = mock(DeploymentInfo.class);
		ServletContainer servletContainerMock = mock(ServletContainer.class);
		DeploymentManager deploymentManagerMock = mock(DeploymentManager.class);
		try (MockedStatic<Servlets> servlets = mockStatic(Servlets.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(null).when(errorPageMock).getStatus();
			doReturn(null).when(errorPageMock).getException();
			doReturn("return_of_getPath1").when(errorPageMock).getPath();
			doReturn(null).when(mimeMappingsMock).iterator();
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			servlets.when(() -> Servlets.deployment()).thenReturn(deploymentInfoMock);
			doReturn(deploymentInfoMock2).when(deploymentInfoMock).addServletContainerInitializer((ServletContainerInitializerInfo) any());
			ClassLoader classLoader = UndertowServletWebServerFactory.class.getClassLoader();
			DeploymentInfo deploymentInfo = deploymentInfoMock.setClassLoader(classLoader);
			doReturn(deploymentInfo).when(deploymentInfoMock).setClassLoader((ClassLoader) any());
			doReturn(deploymentInfoMock3).when(deploymentInfoMock).setContextPath("/A");
			doReturn(deploymentInfoMock4).when(deploymentInfoMock).setDisplayName("displayName1");
			DeploymentInfo deploymentInfo2 = deploymentInfoMock.setDeploymentName("spring-boot");
			doReturn(deploymentInfo2).when(deploymentInfoMock).setDeploymentName("spring-boot");
			ServletInfo servletInfo = Servlets.servlet("default", DefaultServlet.class);
			DeploymentInfo deploymentInfo3 = deploymentInfoMock.addServlet(servletInfo);
			doReturn(deploymentInfo3).when(deploymentInfoMock).addServlet((ServletInfo) any());
			doReturn(deploymentInfoMock5).when(deploymentInfoMock).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
			DeploymentInfo deploymentInfo4 = deploymentInfoMock.setServletStackTraces(ServletStackTraces.NONE);
			doReturn(deploymentInfo4).when(deploymentInfoMock).setServletStackTraces(ServletStackTraces.NONE);
			doReturn(deploymentInfoMock6).when(deploymentInfoMock).setResourceManager((CompositeResourceManager) any());
			File file = new File("pathname1");
			doReturn(deploymentInfoMock7).when(deploymentInfoMock).setTempDir(file);
			DeploymentInfo deploymentInfo5 = deploymentInfoMock.setEagerFilterInit(true);
			doReturn(deploymentInfo5).when(deploymentInfoMock).setEagerFilterInit(true);
			doNothing().when(deploymentInfoMock).setPreservePathOnForward(false);
			doReturn(deploymentInfoMock8).when(deploymentInfoMock).addMimeMapping((MimeMapping) any());
			doReturn(deploymentInfoMock9).when(deploymentInfoMock).setSessionPersistenceManager((FileSessionPersistence) any());
			File file2 = sessionStoreDirectoryMock.getValidDirectory(true);
			doReturn(file2).when(sessionStoreDirectoryMock).getValidDirectory(true);
			doReturn(deploymentInfoMock10).when(deploymentInfoMock).addLocaleCharsetMapping("addLocaleMappings_locale1", "addLocaleMappings_charset1");
			servlets.when(() -> Servlets.newContainer()).thenReturn(servletContainerMock);
			doReturn(deploymentManagerMock).when(servletContainerMock).addDeployment(deploymentInfoMock);
			doNothing().when(deploymentManagerMock).deploy();
			doReturn(null).when(deploymentManagerMock).getDeployment();
			target = new UndertowServletWebServerFactory("/A", 2);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setRegisterDefaultServlet(true);
			Locale locale = new Locale("language1");
			Charset charset = Charset.defaultCharset();
			Map<Locale, Charset> localeCharsetMap = new HashMap<>();
			localeCharsetMap.put(locale, charset);
			target.setLocaleCharsetMappings(localeCharsetMap);
			target.setDisplayName("displayName1");
			Set<ErrorPage> errorPageSet = new HashSet<>();
			errorPageSet.add(errorPageMock);
			target.setErrorPages(errorPageSet);
			target.setSession(sessionMock);
			target.setMimeMappings(mimeMappingsMock);
			File file3 = new File("pathname1");
			doReturn(file3).when(documentRootMock).getValidDirectory();
			List<URL> uRLList = new ArrayList<>();
			uRLList.add((URL) null);
			doReturn(uRLList).when(staticResourceJarsMock).getUrls();
			doReturn(sessionStoreDirectoryMock).when(sessionMock).getSessionStoreDirectory();
			ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				target.getWebServer(servletContextInitializerArray);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(errorPageMock, atLeast(1)).getStatus();
				verify(errorPageMock, atLeast(1)).getException();
				verify(errorPageMock, atLeast(1)).getPath();
				verify(mimeMappingsMock, atLeast(1)).iterator();
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				servlets.verify(() -> Servlets.deployment(), atLeast(1));
				verify(deploymentInfoMock, atLeast(1)).addServletContainerInitializer((ServletContainerInitializerInfo) any());
				verify(deploymentInfoMock, atLeast(1)).setClassLoader((ClassLoader) any());
				verify(deploymentInfoMock, atLeast(1)).setContextPath("/A");
				verify(deploymentInfoMock, atLeast(1)).setDisplayName("displayName1");
				verify(deploymentInfoMock, atLeast(1)).setDeploymentName("spring-boot");
				verify(deploymentInfoMock, atLeast(1)).addServlet((ServletInfo) any());
				verify(deploymentInfoMock, atLeast(1)).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
				verify(deploymentInfoMock, atLeast(1)).setServletStackTraces(ServletStackTraces.NONE);
				verify(deploymentInfoMock, atLeast(1)).setResourceManager((CompositeResourceManager) any());
				verify(deploymentInfoMock, atLeast(1)).setTempDir(file);
				verify(deploymentInfoMock, atLeast(1)).setEagerFilterInit(true);
				verify(deploymentInfoMock, atLeast(1)).setPreservePathOnForward(false);
				verify(deploymentInfoMock, atLeast(1)).addMimeMapping((MimeMapping) any());
				verify(deploymentInfoMock, atLeast(1)).setSessionPersistenceManager((FileSessionPersistence) any());
				verify(sessionStoreDirectoryMock, atLeast(1)).getValidDirectory(true);
				verify(deploymentInfoMock, atLeast(1)).addLocaleCharsetMapping("addLocaleMappings_locale1", "addLocaleMappings_charset1");
				servlets.verify(() -> Servlets.newContainer(), atLeast(1));
				verify(servletContainerMock, atLeast(1)).addDeployment(deploymentInfoMock);
				verify(deploymentManagerMock, atLeast(1)).deploy();
				verify(deploymentManagerMock, times(2)).getDeployment();
				verify(documentRootMock, atLeast(1)).getValidDirectory();
				verify(staticResourceJarsMock, atLeast(1)).getUrls();
				verify(sessionMock, atLeast(1)).getSessionStoreDirectory();
			});
		}
	}

	//Sapient generated method id: ${ba7cf296-4907-31d4-bb22-be468319aeba}
	@Test()
	void getWebServerWhenGetSessionNotIsPersistentAndManagerGetDeploymentNotInstanceOfDeploymentImpl14ThrowsNullPointerException() {
		/* Branches:
		 * (this.resourceLoader != null) : false  #  inside getServletClassLoader method
		 * (isRegisterDefaultServlet()) : true  #  inside createManager method
		 * (for-each(getErrorPages())) : true  #  inside configureErrorPages method
		 * (errorPage.getStatus() != null) : false  #  inside getUndertowErrorPage method
		 * (errorPage.getException() != null) : false  #  inside getUndertowErrorPage method
		 * (docBase != null) : true  #  inside getCanonicalDocumentRoot method
		 * (docBase.isDirectory()) : false  #  inside getDocumentRootResourceManager method
		 * (root != null) : true  #  inside getDocumentRootResourceManager method
		 * (for-each(metaInfResourceUrls)) : true  #  inside getDocumentRootResourceManager method
		 * ("file".equals(url.getProtocol())) : false  #  inside getDocumentRootResourceManager method
		 * (catch-exception (Exception)) : true  #  inside getDocumentRootResourceManager method
		 * (for-each(getMimeMappings())) : false  #  inside configureMimeMappings method
		 * (for-each(getWebListenerClassNames())) : false  #  inside configureWebListeners method
		 * (for-each(this.deploymentInfoCustomizers)) : false  #  inside createManager method
		 * (getSession().isPersistent()) : false  #  inside createManager method
		 * (manager.getDeployment() instanceof DeploymentImpl managerDeployment) : false  #  inside createManager method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ErrorPage errorPageMock = mock(ErrorPage.class);
		MimeMappings mimeMappingsMock = mock(MimeMappings.class);
		DeploymentInfo deploymentInfoMock = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock2 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock3 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock4 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock5 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock6 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock7 = mock(DeploymentInfo.class);
		DeploymentInfo deploymentInfoMock8 = mock(DeploymentInfo.class);
		ServletContainer servletContainerMock = mock(ServletContainer.class);
		DeploymentManager deploymentManagerMock = mock(DeploymentManager.class);
		try (MockedStatic<Servlets> servlets = mockStatic(Servlets.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(null).when(errorPageMock).getStatus();
			doReturn(null).when(errorPageMock).getException();
			doReturn("return_of_getPath1").when(errorPageMock).getPath();
			doReturn(null).when(mimeMappingsMock).iterator();
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			servlets.when(() -> Servlets.deployment()).thenReturn(deploymentInfoMock);
			doReturn(deploymentInfoMock2).when(deploymentInfoMock).addServletContainerInitializer((ServletContainerInitializerInfo) any());
			ClassLoader classLoader = UndertowServletWebServerFactory.class.getClassLoader();
			DeploymentInfo deploymentInfo = deploymentInfoMock.setClassLoader(classLoader);
			doReturn(deploymentInfo).when(deploymentInfoMock).setClassLoader((ClassLoader) any());
			doReturn(deploymentInfoMock3).when(deploymentInfoMock).setContextPath("/A");
			doReturn(deploymentInfoMock4).when(deploymentInfoMock).setDisplayName("displayName1");
			DeploymentInfo deploymentInfo2 = deploymentInfoMock.setDeploymentName("spring-boot");
			doReturn(deploymentInfo2).when(deploymentInfoMock).setDeploymentName("spring-boot");
			ServletInfo servletInfo = Servlets.servlet("default", DefaultServlet.class);
			DeploymentInfo deploymentInfo3 = deploymentInfoMock.addServlet(servletInfo);
			doReturn(deploymentInfo3).when(deploymentInfoMock).addServlet((ServletInfo) any());
			doReturn(deploymentInfoMock5).when(deploymentInfoMock).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
			DeploymentInfo deploymentInfo4 = deploymentInfoMock.setServletStackTraces(ServletStackTraces.NONE);
			doReturn(deploymentInfo4).when(deploymentInfoMock).setServletStackTraces(ServletStackTraces.NONE);
			doReturn(deploymentInfoMock6).when(deploymentInfoMock).setResourceManager((CompositeResourceManager) any());
			File file = new File("pathname1");
			doReturn(deploymentInfoMock7).when(deploymentInfoMock).setTempDir(file);
			DeploymentInfo deploymentInfo5 = deploymentInfoMock.setEagerFilterInit(true);
			doReturn(deploymentInfo5).when(deploymentInfoMock).setEagerFilterInit(true);
			doNothing().when(deploymentInfoMock).setPreservePathOnForward(false);
			doReturn(deploymentInfoMock8).when(deploymentInfoMock).addLocaleCharsetMapping("addLocaleMappings_locale1", "addLocaleMappings_charset1");
			servlets.when(() -> Servlets.newContainer()).thenReturn(servletContainerMock);
			doReturn(deploymentManagerMock).when(servletContainerMock).addDeployment(deploymentInfoMock);
			doNothing().when(deploymentManagerMock).deploy();
			doReturn(null).when(deploymentManagerMock).getDeployment();
			target = new UndertowServletWebServerFactory("/A", 2);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setRegisterDefaultServlet(true);
			Locale locale = new Locale("language1");
			Charset charset = Charset.defaultCharset();
			Map<Locale, Charset> localeCharsetMap = new HashMap<>();
			localeCharsetMap.put(locale, charset);
			target.setLocaleCharsetMappings(localeCharsetMap);
			target.setDisplayName("displayName1");
			Set<ErrorPage> errorPageSet = new HashSet<>();
			errorPageSet.add(errorPageMock);
			target.setErrorPages(errorPageSet);
			Session session = new Session();
			session.setPersistent(false);
			target.setSession(session);
			target.setMimeMappings(mimeMappingsMock);
			File file2 = new File("pathname1");
			doReturn(file2).when(documentRootMock).getValidDirectory();
			List<URL> uRLList = new ArrayList<>();
			uRLList.add((URL) null);
			doReturn(uRLList).when(staticResourceJarsMock).getUrls();
			ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				target.getWebServer(servletContextInitializerArray);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(errorPageMock, atLeast(1)).getStatus();
				verify(errorPageMock, atLeast(1)).getException();
				verify(errorPageMock, atLeast(1)).getPath();
				verify(mimeMappingsMock, atLeast(1)).iterator();
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				servlets.verify(() -> Servlets.deployment(), atLeast(1));
				verify(deploymentInfoMock, atLeast(1)).addServletContainerInitializer((ServletContainerInitializerInfo) any());
				verify(deploymentInfoMock, atLeast(1)).setClassLoader((ClassLoader) any());
				verify(deploymentInfoMock, atLeast(1)).setContextPath("/A");
				verify(deploymentInfoMock, atLeast(1)).setDisplayName("displayName1");
				verify(deploymentInfoMock, atLeast(1)).setDeploymentName("spring-boot");
				verify(deploymentInfoMock, atLeast(1)).addServlet((ServletInfo) any());
				verify(deploymentInfoMock, atLeast(1)).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
				verify(deploymentInfoMock, atLeast(1)).setServletStackTraces(ServletStackTraces.NONE);
				verify(deploymentInfoMock, atLeast(1)).setResourceManager((CompositeResourceManager) any());
				verify(deploymentInfoMock, atLeast(1)).setTempDir(file);
				verify(deploymentInfoMock, atLeast(1)).setEagerFilterInit(true);
				verify(deploymentInfoMock, atLeast(1)).setPreservePathOnForward(false);
				verify(deploymentInfoMock, atLeast(1)).addLocaleCharsetMapping("addLocaleMappings_locale1", "addLocaleMappings_charset1");
				servlets.verify(() -> Servlets.newContainer(), atLeast(1));
				verify(servletContainerMock, atLeast(1)).addDeployment(deploymentInfoMock);
				verify(deploymentManagerMock, atLeast(1)).deploy();
				verify(deploymentManagerMock, times(2)).getDeployment();
				verify(documentRootMock, atLeast(1)).getValidDirectory();
				verify(staticResourceJarsMock, atLeast(1)).getUrls();
			});
		}
	}

	//Sapient generated method id: ${eb5add51-5a47-3d3c-a34f-6a93afe39f13}
	@Test()
	void getUndertowWebServerWhenPortGreaterThanOrEqualsTo0() {
		/* Branches:
		 * (sessionSameSite != null) : true  #  inside getCookieHandlerFactory method
		 * (!CollectionUtils.isEmpty(getCookieSameSiteSuppliers())) : true  #  inside getCookieHandlerFactory method
		 * (!suppliers.isEmpty()) : true  #  inside getCookieHandlerFactory method
		 * (cooHandlerFactory != null) : false
		 * (port >= 0) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DeploymentManager managerMock = mock(DeploymentManager.class, "ManagerValue");
		Deployment deploymentMock = mock(Deployment.class);
		ServletContextImpl servletContextImplMock = mock(ServletContextImpl.class);
		SessionCookieConfigImpl sessionCookieConfigImplMock = mock(SessionCookieConfigImpl.class);
		Session sessionMock2 = mock(Session.class);
		CookieSameSiteSupplier cookieSameSiteSupplierMock = mock(CookieSameSiteSupplier.class);
		Undertow.Builder undertowBuilderMock = mock(Undertow.Builder.class, "BuilderValue");
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class);
			 MockedStatic<CookieSameSiteSupplier> cookieSameSiteSupplier = mockStatic(CookieSameSiteSupplier.class)) {
			doReturn(deploymentMock).when(managerMock).getDeployment();
			doReturn(servletContextImplMock).when(deploymentMock).getServletContext();
			doReturn(sessionCookieConfigImplMock).when(servletContextImplMock).getSessionCookieConfig();
			doReturn("return_of_getName1").when(sessionCookieConfigImplMock).getName();
			Session.Cookie sessionCookie = new Session.Cookie();
			sessionCookie.setSameSite(Cookie.SameSite.NONE);
			doReturn(sessionCookie).when(sessionMock2).getCookie();
			cookieSameSiteSupplier.when(() -> CookieSameSiteSupplier.of(Cookie.SameSite.NONE)).thenReturn(cookieSameSiteSupplierMock);
			CookieSameSiteSupplier cookieSameSiteSupplier2 = CookieSameSiteSupplier.ofNone();
			doReturn(cookieSameSiteSupplier2).when(cookieSameSiteSupplierMock).whenHasName("return_of_getName1");
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(false);
			target = new UndertowServletWebServerFactory("ContextPathValue", 8080);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setSession(sessionMock2);
			List<CookieSameSiteSupplier> cookieSameSiteSupplierList = new ArrayList<>();
			target.setCookieSameSiteSuppliers(cookieSameSiteSupplierList);
			List<HttpHandlerFactory> httpHandlerFactoryList = new ArrayList<>();
			DeploymentManagerHttpHandlerFactory deploymentManagerHttpHandlerFactory = new DeploymentManagerHttpHandlerFactory(managerMock);
			HttpHandlerFactory[] httpHandlerFactoryArray = new HttpHandlerFactory[] { deploymentManagerHttpHandlerFactory };
			doReturn(httpHandlerFactoryList).when(delegateMock).createHttpHandlerFactories(target, httpHandlerFactoryArray);
			//Act Statement(s)
			UndertowServletWebServer result = target.getUndertowWebServer(undertowBuilderMock, managerMock, 8080);
			UndertowServletWebServer undertowServletWebServer = new UndertowServletWebServer(undertowBuilderMock, httpHandlerFactoryList, "ContextPathValue", false);
			//Assert statement(s)
			//TODO: Please implement equals method in UndertowServletWebServer for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(undertowServletWebServer));
				verify(managerMock).getDeployment();
				verify(deploymentMock).getServletContext();
				verify(servletContextImplMock).getSessionCookieConfig();
				verify(sessionCookieConfigImplMock).getName();
				verify(sessionMock2).getCookie();
				cookieSameSiteSupplier.verify(() -> CookieSameSiteSupplier.of(Cookie.SameSite.NONE), atLeast(1));
				verify(cookieSameSiteSupplierMock).whenHasName("return_of_getName1");
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()));
				verify(delegateMock).createHttpHandlerFactories(target, httpHandlerFactoryArray);
			});
		}
	}

	//Sapient generated method id: ${9e4e483b-91dd-31fe-aa16-bc44eae39b8b}
	@Test()
	void getUndertowWebServerWhenCooHandlerFactoryIsNullAndPortLessThan0() {
		/* Branches:
		 * (sessionSameSite != null) : true  #  inside getCookieHandlerFactory method
		 * (!CollectionUtils.isEmpty(getCookieSameSiteSuppliers())) : true  #  inside getCookieHandlerFactory method
		 * (!suppliers.isEmpty()) : false  #  inside getCookieHandlerFactory method
		 * (cooHandlerFactory != null) : false
		 * (port >= 0) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DeploymentManager managerMock = mock(DeploymentManager.class);
		Deployment deploymentMock = mock(Deployment.class);
		ServletContextImpl servletContextImplMock = mock(ServletContextImpl.class);
		SessionCookieConfigImpl sessionCookieConfigImplMock = mock(SessionCookieConfigImpl.class);
		Session sessionMock2 = mock(Session.class);
		CookieSameSiteSupplier cookieSameSiteSupplierMock = mock(CookieSameSiteSupplier.class);
		CookieSameSiteSupplier cookieSameSiteSupplierMock2 = mock(CookieSameSiteSupplier.class);
		Undertow.Builder undertowBuilderMock = mock(Undertow.Builder.class);
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class);
			 MockedStatic<CookieSameSiteSupplier> cookieSameSiteSupplier = mockStatic(CookieSameSiteSupplier.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(deploymentMock).when(managerMock).getDeployment();
			doReturn(servletContextImplMock).when(deploymentMock).getServletContext();
			doReturn(sessionCookieConfigImplMock).when(servletContextImplMock).getSessionCookieConfig();
			doReturn("return_of_getName1").when(sessionCookieConfigImplMock).getName();
			Session.Cookie sessionCookie = new Session.Cookie();
			sessionCookie.setSameSite(Cookie.SameSite.NONE);
			doReturn(sessionCookie).when(sessionMock2).getCookie();
			_assert.when(() -> Assert.notNull("contextPath1", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			cookieSameSiteSupplier.when(() -> CookieSameSiteSupplier.of(Cookie.SameSite.NONE)).thenReturn(cookieSameSiteSupplierMock);
			doReturn(cookieSameSiteSupplierMock2).when(cookieSameSiteSupplierMock).whenHasName("return_of_getName1");
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(false);
			target = new UndertowServletWebServerFactory("contextPath1", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setSession(sessionMock2);
			List<CookieSameSiteSupplier> cookieSameSiteSupplierList = new ArrayList<>();
			target.setCookieSameSiteSuppliers(cookieSameSiteSupplierList);
			//Act Statement(s)
			UndertowServletWebServer result = target.getUndertowWebServer(undertowBuilderMock, managerMock, 0);
			List<HttpHandlerFactory> httpHandlerFactoryList = new ArrayList<>();
			UndertowServletWebServer undertowServletWebServer = new UndertowServletWebServer(undertowBuilderMock, httpHandlerFactoryList, "contextPath1", false);
			//Assert statement(s)
			//TODO: Please implement equals method in UndertowServletWebServer for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(undertowServletWebServer));
				verify(managerMock).getDeployment();
				verify(deploymentMock).getServletContext();
				verify(servletContextImplMock).getSessionCookieConfig();
				verify(sessionCookieConfigImplMock).getName();
				verify(sessionMock2).getCookie();
				_assert.verify(() -> Assert.notNull("contextPath1", "ContextPath must not be null"), atLeast(1));
				cookieSameSiteSupplier.verify(() -> CookieSameSiteSupplier.of(Cookie.SameSite.NONE), atLeast(1));
				verify(cookieSameSiteSupplierMock).whenHasName("return_of_getName1");
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()));
			});
		}
	}
}
