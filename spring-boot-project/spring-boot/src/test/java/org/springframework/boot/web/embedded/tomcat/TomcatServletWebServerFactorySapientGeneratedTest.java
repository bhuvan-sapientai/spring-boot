package org.springframework.boot.web.embedded.tomcat;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.springframework.boot.ssl.NoSuchSslBundleException;
import org.springframework.boot.web.server.Ssl;

import org.apache.jasper.servlet.JasperInitializer;

import org.springframework.boot.web.servlet.ServletContextInitializer;

import org.mockito.MockitoAnnotations;

import org.springframework.boot.web.server.Compression;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.util.Assert;

import java.util.HashSet;

import org.apache.catalina.startup.Tomcat;

import java.time.Duration;
import java.util.HashMap;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.nio.file.attribute.FileAttribute;

import org.springframework.boot.ssl.SslBundle;

import org.apache.coyote.ProtocolHandler;
import org.mockito.stubbing.Answer;

import org.springframework.boot.web.server.Shutdown;

import org.apache.coyote.AbstractProtocol;

import org.springframework.boot.web.servlet.server.Jsp;

import org.apache.coyote.http2.Http2Protocol;
import org.apache.catalina.Context;

import org.springframework.boot.web.server.Cookie;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.core.NativeDetector;

import org.apache.catalina.core.AprLifecycleListener;

import org.springframework.boot.web.server.WebServerException;

import java.net.InetAddress;
import java.io.File;

import org.apache.catalina.util.SessionConfig;

import org.springframework.boot.web.servlet.server.SessionStoreDirectory;
import org.springframework.boot.web.server.WebServerSslBundle;

import org.apache.catalina.connector.Connector;

import org.springframework.boot.ssl.SslBundles;

import org.apache.catalina.session.StandardManager;

import java.util.List;

import org.springframework.boot.web.server.MimeMappings;

import org.apache.catalina.Host;
import org.apache.catalina.Valve;

import java.util.Locale;

import org.apache.catalina.LifecycleListener;

import java.util.Map;

import org.springframework.boot.web.servlet.server.DocumentRoot;
import org.springframework.boot.web.server.Http2;

import org.apache.tomcat.util.modeler.Registry;

import java.util.function.Consumer;

import org.springframework.boot.util.LambdaSafe;
import org.springframework.util.ClassUtils;
import org.springframework.boot.web.servlet.server.CookieSameSiteSupplier;

import org.apache.tomcat.util.http.CookieProcessor;

import java.nio.file.Files;
import java.util.Set;

import org.apache.tomcat.util.descriptor.web.ErrorPage;

import java.util.Collection;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import org.springframework.boot.web.server.WebServer;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.ArgumentMatchers.anySet;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class TomcatServletWebServerFactorySapientGeneratedTest {

	private final DocumentRoot documentRootMock = mock(DocumentRoot.class, "documentRoot");

	private final Session sessionMock = mock(Session.class, "session");

	private AutoCloseable autoCloseableMocks;

	@InjectMocks()
	private TomcatServletWebServerFactory target;

	@AfterEach()
	public void afterTest() throws Exception {
		if (autoCloseableMocks != null)
			autoCloseableMocks.close();
	}

	//Sapient generated method id: ${c1a72526-942f-3d80-93cc-5a34a80f7448}
	@Test()
	void getWebServerWhenDefaultBranchThrowsWebServerException() throws IOException {
		/* Branches:
		 * (this.disableMBeanRegistry) : true
		 * (this.baseDirectory != null) : false
		 * (branch expression (line 209)) : true  #  inside createTempDir method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Files> files = mockStatic(Files.class);
    MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    FileAttribute[] fileAttributeArray = new FileAttribute[] {};
    //TODO: Needs to return real value
    files.when(() -> Files.createTempDirectory("tomcat.2.", fileAttributeArray)).thenReturn(null);
    target = new TomcatServletWebServerFactory("/A", 2);
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
    //Act Statement(s)
    final WebServerException result = assertThrows(WebServerException.class, () -> {
        target.getWebServer(servletContextInitializerArray);
    });
    IOException iOException = new IOException();
    WebServerException webServerException = new WebServerException("Unable to create tempDir. java.io.tmpdir is set to ", iOException);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(notNullValue()));
        assertThat(result.getMessage(), equalTo(webServerException.getMessage()));
        assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
        _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
        files.verify(() -> Files.createTempDirectory("tomcat.2.", fileAttributeArray), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${9baf4896-50bb-3b94-be5c-dc01956e2a0f}
	@Test()
	void getWebServerWhenThisAdditionalTomcatConnectorsIsEmpty() throws NoSuchMethodError, Exception {
		/* Branches:
		 * (this.disableMBeanRegistry) : true
		 * (this.baseDirectory != null) : false
		 * (for-each(this.serverLifecycleListeners)) : false
		 * (connector.getProtocolHandler().getExecutor() instanceof Executor executor) : false  #  inside registerConnectorExecutor method
		 * (for-each(this.engineValves)) : false  #  inside configureEngine method
		 * (for-each(this.additionalTomcatConnectors)) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: tomcat
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//TomcatWebServer tomcatWebServerMock = mock(TomcatWebServer.class);
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    target = spy(new TomcatServletWebServerFactory("/A", 8));
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    doNothing().when(target).customizeConnector((Connector) any());
    ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
    doNothing().when(target).prepareContext((Host) any(), eq(servletContextInitializerArray));
    doReturn(tomcatWebServerMock).when(target).getTomcatWebServer((Tomcat) any());
    //Act Statement(s)
    WebServer result = target.getWebServer(servletContextInitializerArray);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, equalTo(tomcatWebServerMock));
        _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
        verify(target).customizeConnector((Connector) any());
        verify(target).prepareContext((Host) any(), eq(servletContextInitializerArray));
        verify(target).getTomcatWebServer((Tomcat) any());
    });
}*/
	}

	//Sapient generated method id: ${dce270d4-440c-32bc-bbed-66b6beb1c372}
	@Test()
	void prepareContextWhenDefaultBranchThrowsWebServerException() throws IOException {
		/* Branches:
		 * (documentRoot != null) : false
		 * (documentRoot != null) : false
		 * (branch expression (line 209)) : true  #  inside createTempDir method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//Host hostMock = mock(Host.class);
        /*try (MockedStatic<Files> files = mockStatic(Files.class);
    MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    FileAttribute[] fileAttributeArray = new FileAttribute[] {};
    //TODO: Needs to return real value
    files.when(() -> Files.createTempDirectory("tomcat-docbase.2.", fileAttributeArray)).thenReturn(null);
    target = new TomcatServletWebServerFactory("/A", 2);
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    target.setDisplayName("displayName1");
    doReturn(null).when(documentRootMock).getValidDirectory();
    ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
    //Act Statement(s)
    final WebServerException result = assertThrows(WebServerException.class, () -> {
        target.prepareContext(hostMock, servletContextInitializerArray);
    });
    IOException iOException = new IOException();
    WebServerException webServerException = new WebServerException("Unable to create tempDir. java.io.tmpdir is set to ", iOException);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(notNullValue()));
        assertThat(result.getMessage(), equalTo(webServerException.getMessage()));
        assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
        _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
        files.verify(() -> Files.createTempDirectory("tomcat-docbase.2.", fileAttributeArray), atLeast(1));
        verify(documentRootMock).getValidDirectory();
    });
}*/
	}

	//Sapient generated method id: ${0a29d127-e6a3-311c-b7f3-e7e957c34c86}
	@Test()
	void prepareContextWhenShouldRegisterJspServlet() throws LinkageError, NoSuchMethodError, Exception {
		/* Branches:
		 * (documentRoot != null) : true
		 * (documentRoot != null) : true
		 * (this.resourceLoader != null) : false
		 * (isRegisterDefaultServlet()) : true
		 * (this.jsp != null) : true  #  inside shouldRegisterJspServlet method
		 * (this.jsp.getRegistered()) : true  #  inside shouldRegisterJspServlet method
		 * (ClassUtils.isPresent(this.jsp.getClassName(), getClass().getClassLoader())) : true  #  inside shouldRegisterJspServlet method
		 * (shouldRegisterJspServlet()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: context
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//Host hostMock = mock(Host.class);
        /*try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
    MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
    MockedStatic<AprLifecycleListener> aprLifecycleListener = mockStatic(AprLifecycleListener.class);
    MockedStatic<NativeDetector> nativeDetector = mockStatic(NativeDetector.class);
    MockedStatic<Assert> _assert = mockStatic(Assert.class);
    MockedStatic<MimeMappings> mimeMappings = mockStatic(MimeMappings.class)) {
    doNothing().when(hostMock).addChild((TomcatEmbeddedContext) any());
    MimeMappings mimeMappings3 = MimeMappings.DEFAULT;
    MimeMappings mimeMappings2 = MimeMappings.lazyCopy(mimeMappings3);
    mimeMappings.when(() -> MimeMappings.lazyCopy(mimeMappings3)).thenReturn(mimeMappings2);
    _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    nativeDetector.when(() -> NativeDetector.inNativeImage()).thenReturn(false);
    aprLifecycleListener.when(() -> AprLifecycleListener.isAprAvailable()).thenReturn(false);
    ClassLoader classLoader = ClassUtils.getDefaultClassLoader();
    classUtils.when(() -> ClassUtils.getDefaultClassLoader()).thenReturn(classLoader);
    stringUtils.when(() -> StringUtils.collectionToCommaDelimitedString(anySet())).thenReturn("");
    classUtils.when(() -> ClassUtils.isPresent(eq("org.apache.jasper.servlet.JspServlet"), (ClassLoader) any())).thenReturn(true);
    classUtils.when(() -> ClassUtils.forName("org.apache.jasper.servlet.JasperInitializer", null)).thenReturn(JasperInitializer.class);
    target = spy(new TomcatServletWebServerFactory("/A", 0));
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    target.setRegisterDefaultServlet(true);
    Locale locale = new Locale("language1");
    Charset charset = Charset.defaultCharset();
    Map<Locale, Charset> localeCharsetMap = new HashMap<>();
    localeCharsetMap.put(locale, charset);
    target.setLocaleCharsetMappings(localeCharsetMap);
    target.setDisplayName("displayName1");
    Jsp jsp = new Jsp();
    target.setJsp(jsp);
    ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] { null, null };
    doNothing().when(target).configureContext((TomcatEmbeddedContext) any(), eq(servletContextInitializerArray));
    doNothing().when(target).postProcessContext((TomcatEmbeddedContext) any());
    ServletContextInitializer[] servletContextInitializerArray2 = new ServletContextInitializer[] {};
    //Act Statement(s)
    target.prepareContext(hostMock, servletContextInitializerArray2);
    //Assert statement(s)
    assertAll("result", () -> {
        verify(hostMock).addChild((TomcatEmbeddedContext) any());
        mimeMappings.verify(() -> MimeMappings.lazyCopy(mimeMappings3), atLeast(1));
        _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
        nativeDetector.verify(() -> NativeDetector.inNativeImage(), atLeast(1));
        aprLifecycleListener.verify(() -> AprLifecycleListener.isAprAvailable(), atLeast(1));
        classUtils.verify(() -> ClassUtils.getDefaultClassLoader(), atLeast(1));
        stringUtils.verify(() -> StringUtils.collectionToCommaDelimitedString(anySet()), atLeast(2));
        classUtils.verify(() -> ClassUtils.isPresent(eq("org.apache.jasper.servlet.JspServlet"), (ClassLoader) any()));
        classUtils.verify(() -> ClassUtils.forName("org.apache.jasper.servlet.JasperInitializer", null), atLeast(1));
        verify(target).configureContext((TomcatEmbeddedContext) any(), eq(servletContextInitializerArray));
        verify(target).postProcessContext((TomcatEmbeddedContext) any());
    });
}*/
	}

	//Sapient generated method id: ${8b6c2577-b039-3763-b771-75ef8306480c}
	@Test()
	void prepareContextWhenThisJspGetRegisteredAndClassUtilsIsPresentThisJspGetClassNameGetClassGetClassLoaderAndShouldRegisterJ() throws LinkageError, NoSuchMethodError, Exception {
		/* Branches:
		 * (documentRoot != null) : false
		 * (documentRoot != null) : false
		 * (this.resourceLoader != null) : false
		 * (isRegisterDefaultServlet()) : true
		 * (this.jsp != null) : true  #  inside shouldRegisterJspServlet method
		 * (this.jsp.getRegistered()) : true  #  inside shouldRegisterJspServlet method
		 * (ClassUtils.isPresent(this.jsp.getClassName(), getClass().getClassLoader())) : true  #  inside shouldRegisterJspServlet method
		 * (shouldRegisterJspServlet()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: context
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//Host hostMock = mock(Host.class);
        /*try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
    MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
    MockedStatic<AprLifecycleListener> aprLifecycleListener = mockStatic(AprLifecycleListener.class);
    MockedStatic<NativeDetector> nativeDetector = mockStatic(NativeDetector.class);
    MockedStatic<Assert> _assert = mockStatic(Assert.class);
    MockedStatic<MimeMappings> mimeMappings = mockStatic(MimeMappings.class)) {
    doNothing().when(hostMock).addChild((TomcatEmbeddedContext) any());
    MimeMappings mimeMappings2 = new MimeMappings();
    MimeMappings mimeMappings3 = MimeMappings.DEFAULT;
    mimeMappings.when(() -> MimeMappings.lazyCopy(mimeMappings3)).thenReturn(mimeMappings2);
    _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    nativeDetector.when(() -> NativeDetector.inNativeImage()).thenReturn(false);
    aprLifecycleListener.when(() -> AprLifecycleListener.isAprAvailable()).thenReturn(false);
    ClassLoader classLoader = ClassUtils.getDefaultClassLoader();
    classUtils.when(() -> ClassUtils.getDefaultClassLoader()).thenReturn(classLoader);
    stringUtils.when(() -> StringUtils.collectionToCommaDelimitedString(anySet())).thenReturn("");
    classUtils.when(() -> ClassUtils.isPresent(eq("org.apache.jasper.servlet.JspServlet"), (ClassLoader) any())).thenReturn(true);
    classUtils.when(() -> ClassUtils.forName("org.apache.jasper.servlet.JasperInitializer", null)).thenReturn(Object.class);
    target = spy(new TomcatServletWebServerFactory("/A", 2));
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    target.setRegisterDefaultServlet(true);
    Locale locale = new Locale("language1");
    Charset charset = Charset.defaultCharset();
    Map<Locale, Charset> localeCharsetMap = new HashMap<>();
    localeCharsetMap.put(locale, charset);
    target.setLocaleCharsetMappings(localeCharsetMap);
    target.setDisplayName("displayName1");
    Jsp jsp = new Jsp();
    target.setJsp(jsp);
    doReturn(null).when(documentRootMock).getValidDirectory();
    ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] { null, null };
    doNothing().when(target).configureContext((TomcatEmbeddedContext) any(), eq(servletContextInitializerArray));
    doNothing().when(target).postProcessContext((TomcatEmbeddedContext) any());
    ServletContextInitializer[] servletContextInitializerArray2 = new ServletContextInitializer[] {};
    //Act Statement(s)
    target.prepareContext(hostMock, servletContextInitializerArray2);
    //Assert statement(s)
    assertAll("result", () -> {
        verify(hostMock).addChild((TomcatEmbeddedContext) any());
        mimeMappings.verify(() -> MimeMappings.lazyCopy(mimeMappings3), atLeast(1));
        _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
        nativeDetector.verify(() -> NativeDetector.inNativeImage(), atLeast(1));
        aprLifecycleListener.verify(() -> AprLifecycleListener.isAprAvailable(), atLeast(1));
        classUtils.verify(() -> ClassUtils.getDefaultClassLoader(), atLeast(1));
        stringUtils.verify(() -> StringUtils.collectionToCommaDelimitedString(anySet()), atLeast(2));
        classUtils.verify(() -> ClassUtils.isPresent(eq("org.apache.jasper.servlet.JspServlet"), (ClassLoader) any()));
        classUtils.verify(() -> ClassUtils.forName("org.apache.jasper.servlet.JasperInitializer", null), atLeast(1));
        verify(documentRootMock).getValidDirectory();
        verify(target).configureContext((TomcatEmbeddedContext) any(), eq(servletContextInitializerArray));
        verify(target).postProcessContext((TomcatEmbeddedContext) any());
    });
}*/
	}

	//Sapient generated method id: ${90199fca-a1eb-3548-a10e-d13eefbf1132}
	@Test()
	void prepareContextWhenCaughtException() throws LinkageError, NoSuchMethodError, Exception {
		/* Branches:
		 * (documentRoot != null) : true
		 * (documentRoot != null) : true
		 * (this.resourceLoader != null) : false
		 * (isRegisterDefaultServlet()) : true
		 * (this.jsp != null) : true  #  inside shouldRegisterJspServlet method
		 * (this.jsp.getRegistered()) : true  #  inside shouldRegisterJspServlet method
		 * (ClassUtils.isPresent(this.jsp.getClassName(), getClass().getClassLoader())) : true  #  inside shouldRegisterJspServlet method
		 * (shouldRegisterJspServlet()) : true
		 * (catch-exception (Exception)) : true  #  inside addJasperInitializer method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: context
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//Host hostMock = mock(Host.class, "HostValue");
		//ServletContextInitializer servletContextInitializerMock = mock(ServletContextInitializer.class, "InitializersValue");
		//ServletContextInitializer servletContextInitializerMock2 = mock(ServletContextInitializer.class, "InitializersValue");
        /*try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
    MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
    doNothing().when(hostMock).addChild((TomcatEmbeddedContext) any());
    ClassLoader classLoader = ClassUtils.getDefaultClassLoader();
    classUtils.when(() -> ClassUtils.getDefaultClassLoader()).thenReturn(classLoader);
    stringUtils.when(() -> StringUtils.collectionToCommaDelimitedString((Set) null)).thenReturn("");
    classUtils.when(() -> ClassUtils.isPresent(eq("org.apache.jasper.servlet.JspServlet"), (ClassLoader) any())).thenReturn(true);
    classUtils.when(() -> ClassUtils.forName("org.apache.jasper.servlet.JasperInitializer", null)).thenReturn(Object.class);
    target = spy(new TomcatServletWebServerFactory("ContextPathValue", 8080));
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    target.setRegisterDefaultServlet(true);
    Locale locale = new Locale("language1");
    Charset charset = Charset.defaultCharset();
    Map<Locale, Charset> localeCharsetMap = new HashMap<>();
    localeCharsetMap.put(locale, charset);
    target.setLocaleCharsetMappings(localeCharsetMap);
    target.setDisplayName("displayName1");
    Jsp jsp = new Jsp();
    target.setJsp(jsp);
    ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] { null, null, servletContextInitializerMock };
    doNothing().when(target).configureContext((TomcatEmbeddedContext) any(), eq(servletContextInitializerArray));
    doNothing().when(target).postProcessContext((TomcatEmbeddedContext) any());
    ServletContextInitializer[] servletContextInitializerArray2 = new ServletContextInitializer[] { servletContextInitializerMock2 };
    //Act Statement(s)
    target.prepareContext(hostMock, servletContextInitializerArray2);
    //Assert statement(s)
    assertAll("result", () -> {
        verify(hostMock).addChild((TomcatEmbeddedContext) any());
        classUtils.verify(() -> ClassUtils.getDefaultClassLoader(), atLeast(1));
        stringUtils.verify(() -> StringUtils.collectionToCommaDelimitedString((Set) null), atLeast(2));
        classUtils.verify(() -> ClassUtils.isPresent(eq("org.apache.jasper.servlet.JspServlet"), (ClassLoader) any()));
        classUtils.verify(() -> ClassUtils.forName("org.apache.jasper.servlet.JasperInitializer", null), atLeast(1));
        verify(target).configureContext((TomcatEmbeddedContext) any(), eq(servletContextInitializerArray));
        verify(target).postProcessContext((TomcatEmbeddedContext) any());
    });
}*/
	}

	//Sapient generated method id: ${6fbde551-4bd3-3487-aa97-7a9a3795da75}
	@Test()
	void prepareContextWhenClassUtilsIsPresentThisJspGetClassNameGetClassGetClassLoaderAndShouldRegisterJspServlet5() throws LinkageError, NoSuchMethodError, Exception {
		/* Branches:
		 * (documentRoot != null) : false
		 * (documentRoot != null) : false
		 * (this.resourceLoader != null) : false
		 * (catch-exception (NoSuchMethodError)) : true
		 * (isRegisterDefaultServlet()) : true
		 * (this.jsp != null) : true  #  inside shouldRegisterJspServlet method
		 * (this.jsp.getRegistered()) : true  #  inside shouldRegisterJspServlet method
		 * (ClassUtils.isPresent(this.jsp.getClassName(), getClass().getClassLoader())) : true  #  inside shouldRegisterJspServlet method
		 * (shouldRegisterJspServlet()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: context
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//Host hostMock = mock(Host.class);
        /*try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
    MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
    MockedStatic<AprLifecycleListener> aprLifecycleListener = mockStatic(AprLifecycleListener.class);
    MockedStatic<NativeDetector> nativeDetector = mockStatic(NativeDetector.class);
    MockedStatic<Assert> _assert = mockStatic(Assert.class);
    MockedStatic<MimeMappings> mimeMappings = mockStatic(MimeMappings.class)) {
    doNothing().when(hostMock).addChild((TomcatEmbeddedContext) any());
    MimeMappings mimeMappings2 = new MimeMappings();
    MimeMappings mimeMappings3 = MimeMappings.DEFAULT;
    mimeMappings.when(() -> MimeMappings.lazyCopy(mimeMappings3)).thenReturn(mimeMappings2);
    _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    nativeDetector.when(() -> NativeDetector.inNativeImage()).thenReturn(false);
    aprLifecycleListener.when(() -> AprLifecycleListener.isAprAvailable()).thenReturn(false);
    ClassLoader classLoader = ClassUtils.getDefaultClassLoader();
    classUtils.when(() -> ClassUtils.getDefaultClassLoader()).thenReturn(classLoader);
    stringUtils.when(() -> StringUtils.collectionToCommaDelimitedString(anySet())).thenReturn("");
    classUtils.when(() -> ClassUtils.isPresent(eq("org.apache.jasper.servlet.JspServlet"), (ClassLoader) any())).thenReturn(true);
    classUtils.when(() -> ClassUtils.forName("org.apache.jasper.servlet.JasperInitializer", null)).thenReturn(Object.class);
    target = spy(new TomcatServletWebServerFactory("/A", 2));
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    target.setRegisterDefaultServlet(true);
    Locale locale = new Locale("language1");
    Charset charset = Charset.defaultCharset();
    Map<Locale, Charset> localeCharsetMap = new HashMap<>();
    localeCharsetMap.put(locale, charset);
    target.setLocaleCharsetMappings(localeCharsetMap);
    target.setDisplayName("displayName1");
    Jsp jsp = new Jsp();
    target.setJsp(jsp);
    doReturn(null).when(documentRootMock).getValidDirectory();
    ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] { null, null };
    doNothing().when(target).configureContext((TomcatEmbeddedContext) any(), eq(servletContextInitializerArray));
    doNothing().when(target).postProcessContext((TomcatEmbeddedContext) any());
    ServletContextInitializer[] servletContextInitializerArray2 = new ServletContextInitializer[] {};
    //Act Statement(s)
    target.prepareContext(hostMock, servletContextInitializerArray2);
    //Assert statement(s)
    assertAll("result", () -> {
        verify(hostMock).addChild((TomcatEmbeddedContext) any());
        mimeMappings.verify(() -> MimeMappings.lazyCopy(mimeMappings3), atLeast(1));
        _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
        nativeDetector.verify(() -> NativeDetector.inNativeImage(), atLeast(1));
        aprLifecycleListener.verify(() -> AprLifecycleListener.isAprAvailable(), atLeast(1));
        classUtils.verify(() -> ClassUtils.getDefaultClassLoader(), atLeast(1));
        stringUtils.verify(() -> StringUtils.collectionToCommaDelimitedString(anySet()), atLeast(2));
        classUtils.verify(() -> ClassUtils.isPresent(eq("org.apache.jasper.servlet.JspServlet"), (ClassLoader) any()));
        classUtils.verify(() -> ClassUtils.forName("org.apache.jasper.servlet.JasperInitializer", null), atLeast(1));
        verify(documentRootMock).getValidDirectory();
        verify(target).configureContext((TomcatEmbeddedContext) any(), eq(servletContextInitializerArray));
        verify(target).postProcessContext((TomcatEmbeddedContext) any());
    });
}*/
	}

	//Sapient generated method id: ${5b6d3672-2dbe-375f-b82f-401ccac28e81}
	@Test()
	void customizeConnectorWhenStringUtilsHasTextSslBundleNameAndThisTomcatConnectorCustomizersIsEmpty() throws NoSuchSslBundleException {
		/* Branches:
		 * (StringUtils.hasText(getServerHeader())) : true
		 * (connector.getProtocolHandler() instanceof AbstractProtocol) : true
		 * (getAddress() != null) : true  #  inside customizeProtocol method
		 * (getUriEncoding() != null) : true
		 * (getHttp2() != null) : true
		 * (getHttp2().isEnabled()) : true
		 * (Ssl.isEnabled(getSsl())) : true
		 * (StringUtils.hasText(sslBundleName)) : true  #  inside customizeSsl method
		 * (for-each(this.tomcatConnectorCustomizers)) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: compression
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//Connector connectorMock = mock(Connector.class);
		//AbstractProtocol abstractProtocolMock = mock(AbstractProtocol.class);
		//AbstractProtocol abstractProtocolMock2 = mock(AbstractProtocol.class);
		//ProtocolHandler protocolHandlerMock = mock(ProtocolHandler.class);
		//SslBundles sslBundlesMock = mock(SslBundles.class);
		//LambdaSafe.Callbacks lambdaSafeCallbacksMock = mock(LambdaSafe.Callbacks.class);
		//SslBundle sslBundleMock = mock(SslBundle.class);
		//Compression compressionMock = mock(Compression.class);
        /*try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
    MockedStatic<WebServerSslBundle> webServerSslBundle = mockStatic(WebServerSslBundle.class);
    MockedStatic<Ssl> ssl = mockStatic(Ssl.class);
    MockedStatic<LambdaSafe> lambdaSafe = mockStatic(LambdaSafe.class);
    MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    doNothing().when(connectorMock).setPort(39);
    doReturn(false).when(connectorMock).setProperty("server", "B");
    doNothing().when(abstractProtocolMock2).setAddress((InetAddress) any());
    doReturn(abstractProtocolMock, abstractProtocolMock2, protocolHandlerMock).when(connectorMock).getProtocolHandler();
    doNothing().when(connectorMock).setURIEncoding("UTF-8");
    doNothing().when(connectorMock).addUpgradeProtocol((Http2Protocol) any());
    doNothing().when(sslBundlesMock).addBundleUpdateHandler(eq(""), (Consumer) any());
    _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    stringUtils.when(() -> StringUtils.hasText("B")).thenReturn(true);
    Object[] objectArray = new Object[] {};
    lambdaSafe.when(() -> LambdaSafe.callbacks(eq(TomcatProtocolHandlerCustomizer.class), anySet(), eq(protocolHandlerMock), eq(objectArray))).thenReturn(lambdaSafeCallbacksMock);
    doNothing().when(lambdaSafeCallbacksMock).invoke((Consumer) any());
    Ssl ssl2 = new Ssl();
    ssl2.setBundle("");
    ssl2.setClientAuth(Ssl.ClientAuth.NONE);
    ssl.when(() -> Ssl.isEnabled(ssl2)).thenReturn(true);
    webServerSslBundle.when(() -> WebServerSslBundle.get((Ssl) null, (SslBundles) null)).thenReturn(sslBundleMock);
    stringUtils.when(() -> StringUtils.hasText("")).thenReturn(true);
    target = new TomcatServletWebServerFactory("/A", 39);
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    InetAddress inetAddress = InetAddress.getLoopbackAddress();
    target.setAddress(inetAddress);
    Http2 http2 = new Http2();
    http2.setEnabled(true);
    target.setHttp2(http2);
    target.setCompression(compressionMock);
    target.setSsl(ssl2);
    target.setServerHeader("B");
    target.setSslBundles(sslBundlesMock);
    //Act Statement(s)
    target.customizeConnector(connectorMock);
    //Assert statement(s)
    assertAll("result", () -> {
        verify(connectorMock).setPort(39);
        verify(connectorMock).setProperty("server", "B");
        verify(connectorMock, times(3)).getProtocolHandler();
        verify(abstractProtocolMock2).setAddress((InetAddress) any());
        verify(connectorMock).setURIEncoding("UTF-8");
        verify(connectorMock).addUpgradeProtocol((Http2Protocol) any());
        verify(sslBundlesMock).addBundleUpdateHandler(eq(""), (Consumer) any());
        _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
        stringUtils.verify(() -> StringUtils.hasText("B"), atLeast(1));
        lambdaSafe.verify(() -> LambdaSafe.callbacks(eq(TomcatProtocolHandlerCustomizer.class), anySet(), eq(protocolHandlerMock), eq(objectArray)));
        verify(lambdaSafeCallbacksMock).invoke((Consumer) any());
        ssl.verify(() -> Ssl.isEnabled(ssl2), atLeast(1));
        webServerSslBundle.verify(() -> WebServerSslBundle.get((Ssl) null, (SslBundles) null), atLeast(1));
        stringUtils.verify(() -> StringUtils.hasText(""), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${19863dfd-e52a-39d2-85c9-43f20a4f4127}
	@Test()
	void configureContextWhenSuppliersIsEmptyAndGetWebListenerClassNamesIsEmptyAndThisTomcatContextCustomizersIsEmpty() {
		/* Branches:
		 * (context instanceof TomcatEmbeddedContext embeddedContext) : false
		 * (for-each(this.contextLifecycleListeners)) : false
		 * (for-each(this.contextValves)) : false
		 * (for-each(getErrorPages())) : true
		 * (context instanceof TomcatEmbeddedContext embeddedContext) : false  #  inside setMimeMappings method
		 * (for-each(getMimeMappings())) : true  #  inside setMimeMappings method
		 * (sessionTimeout == null) : true  #  inside isZeroOrLess method
		 * (isZeroOrLess(sessionTimeout)) : true  #  inside getSessionTimeoutInMinutes method
		 * (httpOnly != null) : false  #  inside configureSession method
		 * (getSession().isPersistent()) : false  #  inside configureSession method
		 * (sessionSameSite != null) : false  #  inside configureCookieProcessor method
		 * (!CollectionUtils.isEmpty(getCookieSameSiteSuppliers())) : false  #  inside configureCookieProcessor method
		 * (!suppliers.isEmpty()) : false  #  inside configureCookieProcessor method
		 * (for-each(getWebListenerClassNames())) : false
		 * (for-each(this.tomcatContextCustomizers)) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: org.springframework.boot.web.embedded.tomcat.DisableReferenceClearingContextCustomizer
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//Context contextMock = mock(Context.class);
		//org.springframework.boot.web.server.ErrorPage errorPageMock = mock(org.springframework.boot.web.server.ErrorPage.class);
		//Session sessionMock2 = mock(Session.class);
		//MimeMappings mimeMappingsMock = mock(MimeMappings.class);
        /*try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class);
    MockedStatic<AprLifecycleListener> aprLifecycleListener = mockStatic(AprLifecycleListener.class);
    MockedStatic<NativeDetector> nativeDetector = mockStatic(NativeDetector.class);
    MockedStatic<Assert> _assert = mockStatic(Assert.class);
    MockedStatic<MimeMappings> mimeMappings = mockStatic(MimeMappings.class)) {
    Set<Class<?>> anySet = new HashSet<>();
    doNothing().when(contextMock).addServletContainerInitializer((TomcatStarter) any(), eq(anySet));
    doNothing().when(contextMock).addErrorPage((ErrorPage) any());
    doNothing().when(contextMock).addMimeMapping("extension1", "mimeType1");
    doNothing().when(contextMock).setSessionTimeout(0);
    doNothing().when(contextMock).addLifecycleListener((LifecycleListener) any());
    doReturn("return_of_getPath1").when(errorPageMock).getPath();
    doReturn(0).when(errorPageMock).getStatusCode();
    doReturn("return_of_getExceptionName1").when(errorPageMock).getExceptionName();
    doReturn(null).when(sessionMock2).getTimeout();
    Session.Cookie sessionCookie = new Session.Cookie();
    sessionCookie.setSameSite((Cookie.SameSite) null);
    sessionCookie.setHttpOnly((Boolean) null);
    doReturn(sessionCookie).when(sessionMock2).getCookie();
    doReturn(false).when(sessionMock2).isPersistent();
    doReturn(null).when(mimeMappingsMock).iterator();
    MimeMappings mimeMappings3 = MimeMappings.DEFAULT;
    MimeMappings mimeMappings2 = MimeMappings.lazyCopy(mimeMappings3);
    mimeMappings.when(() -> MimeMappings.lazyCopy(mimeMappings3)).thenReturn(mimeMappings2);
    _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    nativeDetector.when(() -> NativeDetector.inNativeImage()).thenReturn(false);
    aprLifecycleListener.when(() -> AprLifecycleListener.isAprAvailable()).thenReturn(false);
    collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(true);
    target = new TomcatServletWebServerFactory("/A", 0);
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    Set<org.springframework.boot.web.server.ErrorPage> errorPageSet = new HashSet<>();
    errorPageSet.add(errorPageMock);
    target.setErrorPages(errorPageSet);
    target.setSession(sessionMock2);
    List<CookieSameSiteSupplier> cookieSameSiteSupplierList = new ArrayList<>();
    target.setCookieSameSiteSuppliers(cookieSameSiteSupplierList);
    target.setMimeMappings(mimeMappingsMock);
    ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
    //Act Statement(s)
    target.configureContext(contextMock, servletContextInitializerArray);
    //Assert statement(s)
    assertAll("result", () -> {
        verify(contextMock).addServletContainerInitializer((TomcatStarter) any(), eq(anySet));
        verify(contextMock).addErrorPage((ErrorPage) any());
        verify(contextMock).addMimeMapping("extension1", "mimeType1");
        verify(contextMock).setSessionTimeout(0);
        verify(contextMock).addLifecycleListener((LifecycleListener) any());
        verify(errorPageMock).getPath();
        verify(errorPageMock).getStatusCode();
        verify(errorPageMock).getExceptionName();
        verify(sessionMock2).getTimeout();
        verify(sessionMock2, times(2)).getCookie();
        verify(sessionMock2).isPersistent();
        verify(mimeMappingsMock).iterator();
        mimeMappings.verify(() -> MimeMappings.lazyCopy(mimeMappings3), atLeast(1));
        _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
        nativeDetector.verify(() -> NativeDetector.inNativeImage(), atLeast(1));
        aprLifecycleListener.verify(() -> AprLifecycleListener.isAprAvailable(), atLeast(1));
        collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()));
    });
}*/
	}

	//Sapient generated method id: ${9da23027-c7d7-3ad9-a9f5-329cf0a82afd}
	@Test()
	void configureContextWhenSuppliersNotIsEmptyAndGetWebListenerClassNamesIsEmptyAndThisTomcatContextCustomizersIsEmpty() {
		/* Branches:
		 * (context instanceof TomcatEmbeddedContext embeddedContext) : true
		 * (for-each(this.contextLifecycleListeners)) : false
		 * (for-each(this.contextValves)) : false
		 * (for-each(getErrorPages())) : true
		 * (context instanceof TomcatEmbeddedContext embeddedContext) : true  #  inside setMimeMappings method
		 * (sessionTimeout == null) : false  #  inside isZeroOrLess method
		 * (sessionTimeout.isNegative()) : false  #  inside isZeroOrLess method
		 * (sessionTimeout.isZero()) : true  #  inside isZeroOrLess method
		 * (isZeroOrLess(sessionTimeout)) : true  #  inside getSessionTimeoutInMinutes method
		 * (httpOnly != null) : true  #  inside configureSession method
		 * (getSession().isPersistent()) : false  #  inside configureSession method
		 * (sessionSameSite != null) : true  #  inside configureCookieProcessor method
		 * (!CollectionUtils.isEmpty(getCookieSameSiteSuppliers())) : true  #  inside configureCookieProcessor method
		 * (!suppliers.isEmpty()) : true  #  inside configureCookieProcessor method
		 * (for-each(getWebListenerClassNames())) : false
		 * (for-each(this.tomcatContextCustomizers)) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: org.springframework.boot.web.embedded.tomcat.DisableReferenceClearingContextCustomizer
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		TomcatEmbeddedContext embeddedContextMock = mock(TomcatEmbeddedContext.class);
		MimeMappings mimeMappingsMock = mock(MimeMappings.class);
		org.springframework.boot.web.server.ErrorPage errorPageMock = mock(org.springframework.boot.web.server.ErrorPage.class);
		Session sessionMock2 = mock(Session.class);
		CookieSameSiteSupplier cookieSameSiteSupplierMock = mock(CookieSameSiteSupplier.class);
		CookieSameSiteSupplier cookieSameSiteSupplierMock2 = mock(CookieSameSiteSupplier.class);
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class);
			 MockedStatic<SessionConfig> sessionConfig = mockStatic(SessionConfig.class);
			 MockedStatic<CookieSameSiteSupplier> cookieSameSiteSupplier = mockStatic(CookieSameSiteSupplier.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doNothing().when(embeddedContextMock).setStarter((TomcatStarter) any());
			doNothing().when(embeddedContextMock).setFailCtxIfServletStartFails(true);
			Set<Class<?>> anySet = new HashSet<>();
			doNothing().when(embeddedContextMock).addServletContainerInitializer((TomcatStarter) any(), eq(anySet));
			doNothing().when(embeddedContextMock).addErrorPage((ErrorPage) any());
			doNothing().when(embeddedContextMock).setMimeMappings(mimeMappingsMock);
			doNothing().when(embeddedContextMock).setSessionTimeout(0);
			doNothing().when(embeddedContextMock).setUseHttpOnly(false);
			doNothing().when(embeddedContextMock).addLifecycleListener((LifecycleListener) any());
			doNothing().when(embeddedContextMock).setCookieProcessor((CookieProcessor) any());
			doReturn("return_of_getPath1").when(errorPageMock).getPath();
			doReturn(0).when(errorPageMock).getStatusCode();
			doReturn("return_of_getExceptionName1").when(errorPageMock).getExceptionName();
			Duration duration = Duration.ofDays(0L);
			doReturn(duration).when(sessionMock2).getTimeout();
			Session.Cookie sessionCookie = new Session.Cookie();
			sessionCookie.setSameSite(Cookie.SameSite.NONE);
			sessionCookie.setHttpOnly(false);
			doReturn(sessionCookie).when(sessionMock2).getCookie();
			doReturn(false).when(sessionMock2).isPersistent();
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			cookieSameSiteSupplier.when(() -> CookieSameSiteSupplier.of(Cookie.SameSite.NONE)).thenReturn(cookieSameSiteSupplierMock);
			doReturn(cookieSameSiteSupplierMock2).when(cookieSameSiteSupplierMock).whenHasName((Supplier) any());
			sessionConfig.when(() -> SessionConfig.getSessionCookieName(embeddedContextMock)).thenReturn("return_of_getSessionCookieName1");
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(false);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			Set<org.springframework.boot.web.server.ErrorPage> errorPageSet = new HashSet<>();
			errorPageSet.add(errorPageMock);
			target.setErrorPages(errorPageSet);
			target.setSession(sessionMock2);
			List<CookieSameSiteSupplier> cookieSameSiteSupplierList = new ArrayList<>();
			target.setCookieSameSiteSuppliers(cookieSameSiteSupplierList);
			target.setMimeMappings(mimeMappingsMock);
			ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
			//Act Statement(s)
			target.configureContext(embeddedContextMock, servletContextInitializerArray);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(embeddedContextMock).setStarter((TomcatStarter) any());
				verify(embeddedContextMock).setFailCtxIfServletStartFails(true);
				verify(embeddedContextMock).addServletContainerInitializer((TomcatStarter) any(), eq(anySet));
				verify(embeddedContextMock).addErrorPage((ErrorPage) any());
				verify(embeddedContextMock).setMimeMappings(mimeMappingsMock);
				verify(embeddedContextMock).setSessionTimeout(0);
				verify(embeddedContextMock).setUseHttpOnly(false);
				verify(embeddedContextMock).addLifecycleListener((LifecycleListener) any());
				verify(embeddedContextMock).setCookieProcessor((CookieProcessor) any());
				verify(errorPageMock).getPath();
				verify(errorPageMock).getStatusCode();
				verify(errorPageMock).getExceptionName();
				verify(sessionMock2).getTimeout();
				verify(sessionMock2, times(2)).getCookie();
				verify(sessionMock2).isPersistent();
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				cookieSameSiteSupplier.verify(() -> CookieSameSiteSupplier.of(Cookie.SameSite.NONE), atLeast(1));
				verify(cookieSameSiteSupplierMock).whenHasName((Supplier) any());
				sessionConfig.verify(() -> SessionConfig.getSessionCookieName(embeddedContextMock), atLeast(1));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()));
			});
		}
	}

	//Sapient generated method id: ${45969add-fd40-3931-baab-968155eab013}
	@Test()
	void configureContextWhenSuppliersIsEmptyAndGetWebListenerClassNamesIsEmptyAndThisTomcatContextCustomizersIsEmpty5() {
		/* Branches:
		 * (context instanceof TomcatEmbeddedContext embeddedContext) : true
		 * (for-each(this.contextLifecycleListeners)) : false
		 * (for-each(this.contextValves)) : false
		 * (for-each(getErrorPages())) : true
		 * (context instanceof TomcatEmbeddedContext embeddedContext) : true  #  inside setMimeMappings method
		 * (sessionTimeout == null) : false  #  inside isZeroOrLess method
		 * (sessionTimeout.isNegative()) : false  #  inside isZeroOrLess method
		 * (sessionTimeout.isZero()) : false  #  inside isZeroOrLess method
		 * (isZeroOrLess(sessionTimeout)) : false  #  inside getSessionTimeoutInMinutes method
		 * (httpOnly != null) : false  #  inside configureSession method
		 * (getSession().isPersistent()) : false  #  inside configureSession method
		 * (sessionSameSite != null) : false  #  inside configureCookieProcessor method
		 * (!CollectionUtils.isEmpty(getCookieSameSiteSuppliers())) : false  #  inside configureCookieProcessor method
		 * (!suppliers.isEmpty()) : false  #  inside configureCookieProcessor method
		 * (for-each(getWebListenerClassNames())) : false
		 * (for-each(this.tomcatContextCustomizers)) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: org.springframework.boot.web.embedded.tomcat.DisableReferenceClearingContextCustomizer
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		TomcatEmbeddedContext embeddedContextMock = mock(TomcatEmbeddedContext.class);
		MimeMappings mimeMappingsMock = mock(MimeMappings.class);
		org.springframework.boot.web.server.ErrorPage errorPageMock = mock(org.springframework.boot.web.server.ErrorPage.class);
		Session sessionMock2 = mock(Session.class);
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doNothing().when(embeddedContextMock).setStarter((TomcatStarter) any());
			doNothing().when(embeddedContextMock).setFailCtxIfServletStartFails(true);
			Set<Class<?>> anySet = new HashSet<>();
			doNothing().when(embeddedContextMock).addServletContainerInitializer((TomcatStarter) any(), eq(anySet));
			doNothing().when(embeddedContextMock).addErrorPage((ErrorPage) any());
			doNothing().when(embeddedContextMock).setMimeMappings(mimeMappingsMock);
			doNothing().when(embeddedContextMock).setSessionTimeout(21239);
			doNothing().when(embeddedContextMock).addLifecycleListener((LifecycleListener) any());
			doReturn("return_of_getPath1").when(errorPageMock).getPath();
			doReturn(0).when(errorPageMock).getStatusCode();
			doReturn("return_of_getExceptionName1").when(errorPageMock).getExceptionName();
			Duration duration = Duration.ofDays(0L);
			doReturn(duration).when(sessionMock2).getTimeout();
			Session.Cookie sessionCookie = new Session.Cookie();
			sessionCookie.setSameSite((Cookie.SameSite) null);
			sessionCookie.setHttpOnly((Boolean) null);
			doReturn(sessionCookie).when(sessionMock2).getCookie();
			doReturn(false).when(sessionMock2).isPersistent();
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(true);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			Set<org.springframework.boot.web.server.ErrorPage> errorPageSet = new HashSet<>();
			errorPageSet.add(errorPageMock);
			target.setErrorPages(errorPageSet);
			target.setSession(sessionMock2);
			List<CookieSameSiteSupplier> cookieSameSiteSupplierList = new ArrayList<>();
			target.setCookieSameSiteSuppliers(cookieSameSiteSupplierList);
			target.setMimeMappings(mimeMappingsMock);
			ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
			//Act Statement(s)
			target.configureContext(embeddedContextMock, servletContextInitializerArray);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(embeddedContextMock).setStarter((TomcatStarter) any());
				verify(embeddedContextMock).setFailCtxIfServletStartFails(true);
				verify(embeddedContextMock).addServletContainerInitializer((TomcatStarter) any(), eq(anySet));
				verify(embeddedContextMock).addErrorPage((ErrorPage) any());
				verify(embeddedContextMock).setMimeMappings(mimeMappingsMock);
				verify(embeddedContextMock).setSessionTimeout(21239);
				verify(embeddedContextMock).addLifecycleListener((LifecycleListener) any());
				verify(errorPageMock).getPath();
				verify(errorPageMock).getStatusCode();
				verify(errorPageMock).getExceptionName();
				verify(sessionMock2).getTimeout();
				verify(sessionMock2, times(2)).getCookie();
				verify(sessionMock2).isPersistent();
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()));
			});
		}
	}

	//Sapient generated method id: ${82681917-64e7-37aa-8888-decaf2662457}
	@Test()
	void configureContextWhenCollectionUtilsNotIsEmptyGetCookieSameSiteSuppliersAndSuppliersNotIsEmptyAndGetWebListenerClassName() {
		/* Branches:
		 * (context instanceof TomcatEmbeddedContext embeddedContext) : true
		 * (for-each(this.contextLifecycleListeners)) : false
		 * (for-each(this.contextValves)) : false
		 * (for-each(getErrorPages())) : true
		 * (context instanceof TomcatEmbeddedContext embeddedContext) : true  #  inside setMimeMappings method
		 * (sessionTimeout == null) : false  #  inside isZeroOrLess method
		 * (sessionTimeout.isNegative()) : false  #  inside isZeroOrLess method
		 * (sessionTimeout.isZero()) : true  #  inside isZeroOrLess method
		 * (isZeroOrLess(sessionTimeout)) : true  #  inside getSessionTimeoutInMinutes method
		 * (httpOnly != null) : true  #  inside configureSession method
		 * (getSession().isPersistent()) : true  #  inside configureSession method
		 * (manager == null) : true  #  inside configureSession method
		 * (sessionSameSite != null) : false  #  inside configureCookieProcessor method
		 * (!CollectionUtils.isEmpty(getCookieSameSiteSuppliers())) : true  #  inside configureCookieProcessor method
		 * (!suppliers.isEmpty()) : true  #  inside configureCookieProcessor method
		 * (for-each(getWebListenerClassNames())) : false
		 * (for-each(this.tomcatContextCustomizers)) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: org.springframework.boot.web.embedded.tomcat.DisableReferenceClearingContextCustomizer
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		TomcatEmbeddedContext embeddedContextMock = mock(TomcatEmbeddedContext.class);
		MimeMappings mimeMappingsMock = mock(MimeMappings.class);
		org.springframework.boot.web.server.ErrorPage errorPageMock = mock(org.springframework.boot.web.server.ErrorPage.class);
		SessionStoreDirectory sessionStoreDirectoryMock = mock(SessionStoreDirectory.class);
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doNothing().when(embeddedContextMock).setStarter((TomcatStarter) any());
			doNothing().when(embeddedContextMock).setFailCtxIfServletStartFails(true);
			Set<Class<?>> anySet = new HashSet<>();
			doNothing().when(embeddedContextMock).addServletContainerInitializer((TomcatStarter) any(), eq(anySet));
			doNothing().when(embeddedContextMock).addErrorPage((ErrorPage) any());
			doNothing().when(embeddedContextMock).setMimeMappings(mimeMappingsMock);
			doNothing().when(embeddedContextMock).setSessionTimeout(0);
			doNothing().when(embeddedContextMock).setUseHttpOnly(false);
			doReturn(null).when(embeddedContextMock).getManager();
			doNothing().when(embeddedContextMock).setManager((StandardManager) any());
			doNothing().when(embeddedContextMock).setCookieProcessor((CookieProcessor) any());
			doReturn("return_of_getPath1").when(errorPageMock).getPath();
			doReturn(0).when(errorPageMock).getStatusCode();
			doReturn("return_of_getExceptionName1").when(errorPageMock).getExceptionName();
			Session.Cookie cookie = sessionMock.getCookie();
			doReturn(cookie).when(sessionMock).getCookie();
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(false);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			Set<org.springframework.boot.web.server.ErrorPage> errorPageSet = new HashSet<>();
			errorPageSet.add(errorPageMock);
			target.setErrorPages(errorPageSet);
			target.setSession(sessionMock);
			List<CookieSameSiteSupplier> cookieSameSiteSupplierList = new ArrayList<>();
			target.setCookieSameSiteSuppliers(cookieSameSiteSupplierList);
			target.setMimeMappings(mimeMappingsMock);
			doReturn(sessionStoreDirectoryMock).when(sessionMock).getSessionStoreDirectory();
			File file = sessionStoreDirectoryMock.getValidDirectory(true);
			doReturn(file).when(sessionStoreDirectoryMock).getValidDirectory(true);
			ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
			//Act Statement(s)
			target.configureContext(embeddedContextMock, servletContextInitializerArray);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(embeddedContextMock).setStarter((TomcatStarter) any());
				verify(embeddedContextMock).setFailCtxIfServletStartFails(true);
				verify(embeddedContextMock).addServletContainerInitializer((TomcatStarter) any(), eq(anySet));
				verify(embeddedContextMock).addErrorPage((ErrorPage) any());
				verify(embeddedContextMock).setMimeMappings(mimeMappingsMock);
				verify(embeddedContextMock).setSessionTimeout(0);
				verify(embeddedContextMock).setUseHttpOnly(false);
				verify(embeddedContextMock).getManager();
				verify(embeddedContextMock).setManager((StandardManager) any());
				verify(embeddedContextMock).setCookieProcessor((CookieProcessor) any());
				verify(errorPageMock).getPath();
				verify(errorPageMock).getStatusCode();
				verify(errorPageMock).getExceptionName();
				verify(sessionMock).getCookie();
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()));
				verify(sessionMock).getSessionStoreDirectory();
				verify(sessionStoreDirectoryMock).getValidDirectory(true);
			});
		}
	}

	//Sapient generated method id: ${07c018c2-3548-3b89-991f-85e6461c7e49}
	@Test()
	void getTomcatWebServerWhenGetPortGreaterThanOrEqualsTo0() {
		/* Branches:
		 * (getPort() >= 0) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Tomcat tomcatMock = mock(Tomcat.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("/A", 1);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setShutdown(Shutdown.GRACEFUL);
			//Act Statement(s)
			TomcatWebServer result = target.getTomcatWebServer(tomcatMock);
			TomcatWebServer tomcatWebServer = new TomcatWebServer(tomcatMock, false, Shutdown.GRACEFUL);
			//Assert statement(s)
			//TODO: Please implement equals method in TomcatWebServer for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(tomcatWebServer));
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3f703060-a8a3-393a-86b3-2a617ab6466f}
	@Test()
	void getTomcatWebServerWhenGetPortLessThan0() {
		/* Branches:
		 * (getPort() >= 0) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//Tomcat tomcatMock = mock(Tomcat.class);
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    target = new TomcatServletWebServerFactory("/A", -1);
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    target.setShutdown(Shutdown.GRACEFUL);
    //Act Statement(s)
    TomcatWebServer result = target.getTomcatWebServer(tomcatMock);
    TomcatWebServer tomcatWebServer = new TomcatWebServer(tomcatMock, false, Shutdown.GRACEFUL);
    //Assert statement(s)
    //TODO: Please implement equals method in TomcatWebServer for verification to succeed or you need to adjust respective assertion statements
    assertAll("result", () -> {
        assertThat(result, equalTo(tomcatWebServer));
        _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${7181e6a7-21d3-39b9-90e1-b9e56c93cf08}
	@Test()
	void setTldSkipPatternsTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new TomcatServletWebServerFactory("<value>", 0);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		Collection<String> collection = new ArrayList<>();
		collection.add("<value>");
		//Act Statement(s)
		target.setTldSkipPatterns(collection);
		//Assert statement(s)
		assertAll("result", () -> assertThat(target.getTldSkipPatterns().size(), equalTo(0)));
	}

	//Sapient generated method id: ${0a73f729-f6c2-36bd-bebf-fc9620a4f1c4}
	@Test()
	void addTldSkipPatternsTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new TomcatServletWebServerFactory("String contextPath", 0);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		String[] stringArray = new String[] { "String[] patterns" };
		//Act Statement(s)
		target.addTldSkipPatterns(stringArray);
	}

	//Sapient generated method id: ${4d70a7b9-b9fe-3bbd-aff1-983b38a71746}
	@Test()
	void setProtocolTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/B", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.hasLength("A", "Protocol must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("/B", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			target.setProtocol("A");
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull("/B", "ContextPath must not be null"), atLeast(1));
				_assert.verify(() -> Assert.hasLength("A", "Protocol must not be empty"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${5e66cf38-a31f-3628-acbe-623df08a1c5a}
	@Test()
	void setEngineValvesTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new TomcatServletWebServerFactory("contextPath", 0);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		Valve valveMock = mock(Valve.class, "ArrayList");
		Collection<Valve> collection = new ArrayList<>();
		collection.add(valveMock);
		//Act Statement(s)
		target.setEngineValves(collection);
		//Assert statement(s)
		assertAll("result", () -> assertThat(target.getEngineValves().size(), equalTo(0)));
	}

	//Sapient generated method id: ${30071bc8-1461-356d-8d6a-fe6078d7d479}
	@Test()
	void getEngineValvesTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new TomcatServletWebServerFactory("<value>", 0);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		//Act Statement(s)
		Collection<Valve> result = target.getEngineValves();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${42e0e1e1-45ce-39d8-9e1e-add87f3b4a1a}
	@Test()
	void addEngineValvesTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Valve valveMock = mock(Valve.class, "Valve[] engineValves");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Valve[] valveArray = new Valve[] { valveMock };
			_assert.when(() -> Assert.notNull(valveArray, "Valves must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("String contextPath", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			target.addEngineValves(valveArray);
			//Assert statement(s)
			assertAll("result", () -> _assert.verify(() -> Assert.notNull(valveArray, "Valves must not be null"), atLeast(1)));
		}
	}

	//Sapient generated method id: ${0495f86a-ac08-3a57-af45-ddc1b2d064ee}
	@Test()
	void setContextValvesTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new TomcatServletWebServerFactory("contextPath", 0);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		Valve valveMock = mock(Valve.class, "ArrayList");
		Collection<Valve> collection = new ArrayList<>();
		collection.add(valveMock);
		//Act Statement(s)
		target.setContextValves(collection);
		//Assert statement(s)
		assertAll("result", () -> assertThat(target.getContextValves().size(), equalTo(0)));
	}

	//Sapient generated method id: ${18a8990e-3118-3f96-8306-680e71015019}
	@Test()
	void getContextValvesTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new TomcatServletWebServerFactory("<value>", 0);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		//Act Statement(s)
		Collection<Valve> result = target.getContextValves();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${6164b211-d9d8-300b-b8b1-1a4650afeaf2}
	@Test()
	void addContextValvesTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Valve[] valveArray = new Valve[] {};
			_assert.when(() -> Assert.notNull(valveArray, "Valves must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			target.addContextValves(valveArray);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(valveArray, "Valves must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${921e6eaf-6f32-30de-97f5-3a46862bfd91}
	@Test()
	void setContextLifecycleListenersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new TomcatServletWebServerFactory("exampleContextPath", 8080);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		Collection<LifecycleListener> collection = new ArrayList<>();
		//Act Statement(s)
		target.setContextLifecycleListeners(collection);
		//Assert statement(s)
		assertAll("result", () -> assertThat(target.getContextLifecycleListeners().size(), equalTo(0)));
	}

	//Sapient generated method id: ${92c0ae61-fb76-3c2f-b1e1-9c4eba8b0e50}
	@Test()
	void getContextLifecycleListenersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<AprLifecycleListener> aprLifecycleListener = mockStatic(AprLifecycleListener.class);
			 MockedStatic<NativeDetector> nativeDetector = mockStatic(NativeDetector.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<MimeMappings> mimeMappings = mockStatic(MimeMappings.class)) {
			MimeMappings mimeMappings2 = new MimeMappings();
			MimeMappings mimeMappings3 = MimeMappings.DEFAULT;
			mimeMappings.when(() -> MimeMappings.lazyCopy(mimeMappings3)).thenReturn(mimeMappings2);
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			nativeDetector.when(() -> NativeDetector.inNativeImage()).thenReturn(false);
			aprLifecycleListener.when(() -> AprLifecycleListener.isAprAvailable()).thenReturn(false);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			Collection<LifecycleListener> result = target.getContextLifecycleListeners();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				mimeMappings.verify(() -> MimeMappings.lazyCopy(mimeMappings3), atLeast(1));
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				nativeDetector.verify(() -> NativeDetector.inNativeImage(), atLeast(1));
				aprLifecycleListener.verify(() -> AprLifecycleListener.isAprAvailable(), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${9ce813a1-1418-3a65-898c-1e03d7aacfe5}
	@Test()
	void addContextLifecycleListenersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		LifecycleListener lifecycleListenerMock = mock(LifecycleListener.class, "LifecycleListener[] contextLifecycleListeners");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			LifecycleListener[] lifecycleListenerArray = new LifecycleListener[] { lifecycleListenerMock };
			_assert.when(() -> Assert.notNull(lifecycleListenerArray, "ContextLifecycleListeners must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("String contextPath", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			target.addContextLifecycleListeners(lifecycleListenerArray);
			//Assert statement(s)
			assertAll("result", () -> _assert.verify(() -> Assert.notNull(lifecycleListenerArray, "ContextLifecycleListeners must not be null"), atLeast(1)));
		}
	}

	//Sapient generated method id: ${b2cd4d4f-d42b-3388-a4f2-58fb4455cd17}
	@Test()
	void setTomcatContextCustomizersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new TomcatServletWebServerFactory("String", 0);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		TomcatContextCustomizer tomcatContextCustomizerMock = mock(TomcatContextCustomizer.class, "LinkedHashSet");
		Collection<TomcatContextCustomizer> collection = new ArrayList<>();
		collection.add(tomcatContextCustomizerMock);
		//Act Statement(s)
		target.setTomcatContextCustomizers(collection);
		//Assert statement(s)
		assertAll("result", () -> assertThat(target.getTomcatContextCustomizers().size(), equalTo(0)));
	}

	//Sapient generated method id: ${8ad725ee-fdd0-3d07-a671-0aed8550e136}
	@Test()
	void getTomcatContextCustomizersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new TomcatServletWebServerFactory("<value>", 0);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		//Act Statement(s)
		Collection<TomcatContextCustomizer> result = target.getTomcatContextCustomizers();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${cbc8a1a7-d28d-3ed3-ab9c-4ea016ec6658}
	@Test()
	void addContextCustomizersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<AprLifecycleListener> aprLifecycleListener = mockStatic(AprLifecycleListener.class);
			 MockedStatic<NativeDetector> nativeDetector = mockStatic(NativeDetector.class);
			 MockedStatic<MimeMappings> mimeMappings = mockStatic(MimeMappings.class)) {
			MimeMappings mimeMappings2 = new MimeMappings();
			MimeMappings mimeMappings3 = MimeMappings.DEFAULT;
			mimeMappings.when(() -> MimeMappings.lazyCopy(mimeMappings3)).thenReturn(mimeMappings2);
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			nativeDetector.when(() -> NativeDetector.inNativeImage()).thenReturn(false);
			aprLifecycleListener.when(() -> AprLifecycleListener.isAprAvailable()).thenReturn(false);
			TomcatContextCustomizer[] tomcatContextCustomizerArray = new TomcatContextCustomizer[] {};
			_assert.when(() -> Assert.notNull(tomcatContextCustomizerArray, "TomcatContextCustomizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			target.addContextCustomizers(tomcatContextCustomizerArray);
			//Assert statement(s)
			assertAll("result", () -> {
				mimeMappings.verify(() -> MimeMappings.lazyCopy(mimeMappings3), atLeast(1));
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				nativeDetector.verify(() -> NativeDetector.inNativeImage(), atLeast(1));
				aprLifecycleListener.verify(() -> AprLifecycleListener.isAprAvailable(), atLeast(1));
				_assert.verify(() -> Assert.notNull(tomcatContextCustomizerArray, "TomcatContextCustomizers must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f42a71db-573a-397f-85b9-68c14c1b08ad}
	@Test()
	void setTomcatConnectorCustomizersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new TomcatServletWebServerFactory("String", 0);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		TomcatConnectorCustomizer tomcatConnectorCustomizerMock = mock(TomcatConnectorCustomizer.class, "LinkedHashSet");
		Collection<TomcatConnectorCustomizer> collection = new ArrayList<>();
		collection.add(tomcatConnectorCustomizerMock);
		//Act Statement(s)
		target.setTomcatConnectorCustomizers(collection);
		//Assert statement(s)
		assertAll("result", () -> assertThat(target.getTomcatConnectorCustomizers().size(), equalTo(0)));
	}

	//Sapient generated method id: ${e1efcda9-bb1e-37b7-a119-50190c1fc73c}
	@Test()
	void addConnectorCustomizersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			TomcatConnectorCustomizer[] tomcatConnectorCustomizerArray = new TomcatConnectorCustomizer[] {};
			_assert.when(() -> Assert.notNull(tomcatConnectorCustomizerArray, "TomcatConnectorCustomizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("contextPath", 8080);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			target.addConnectorCustomizers(tomcatConnectorCustomizerArray);
			//Assert statement(s)
			assertAll("result", () -> _assert.verify(() -> Assert.notNull(tomcatConnectorCustomizerArray, "TomcatConnectorCustomizers must not be null"), atLeast(1)));
		}
	}

	//Sapient generated method id: ${ece5ea10-055f-3c4c-a2d8-d97b44fb4384}
	@Test()
	void getTomcatConnectorCustomizersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new TomcatServletWebServerFactory("<value>", 0);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		//Act Statement(s)
		Collection<TomcatConnectorCustomizer> result = target.getTomcatConnectorCustomizers();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${3a1a4f82-774e-3e1e-8590-b6957ff65a9c}
	@Test()
	void setTomcatProtocolHandlerCustomizersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new TomcatServletWebServerFactory("String", 0);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		TomcatProtocolHandlerCustomizer<?> tomcatProtocolHandlerCustomizerMock = mock(TomcatProtocolHandlerCustomizer.class, "Collection<TomcatProtocolHandlerCustomizer<?>>");
		Collection<TomcatProtocolHandlerCustomizer<?>> collection = new ArrayList<>();
		collection.add(tomcatProtocolHandlerCustomizerMock);
		//Act Statement(s)
		target.setTomcatProtocolHandlerCustomizers(collection);
		//Assert statement(s)
		assertAll("result", () -> assertThat(target.getTomcatProtocolHandlerCustomizers().size(), equalTo(0)));
	}

	//Sapient generated method id: ${499866e0-8eaa-3a92-b67a-28ca9a0ff5c7}
	@Test()
	void addProtocolHandlerCustomizersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		TomcatProtocolHandlerCustomizer tomcatProtocolHandlerCustomizerMock = mock(TomcatProtocolHandlerCustomizer.class, "TomcatProtocolHandlerCustomizers");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			TomcatProtocolHandlerCustomizer<?>[] tomcatProtocolHandlerCustomizerArray = new TomcatProtocolHandlerCustomizer[] { tomcatProtocolHandlerCustomizerMock };
			_assert.when(() -> Assert.notNull(tomcatProtocolHandlerCustomizerArray, "TomcatProtocolHandlerCustomizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("contextPath", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			target.addProtocolHandlerCustomizers(tomcatProtocolHandlerCustomizerArray);
			//Assert statement(s)
			assertAll("result", () -> _assert.verify(() -> Assert.notNull(tomcatProtocolHandlerCustomizerArray, "TomcatProtocolHandlerCustomizers must not be null"), atLeast(1)));
		}
	}

	//Sapient generated method id: ${a5cc98af-7bbd-34f8-b2b4-20d97f391e93}
	@Test()
	void getTomcatProtocolHandlerCustomizersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<AprLifecycleListener> aprLifecycleListener = mockStatic(AprLifecycleListener.class);
			 MockedStatic<NativeDetector> nativeDetector = mockStatic(NativeDetector.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<MimeMappings> mimeMappings = mockStatic(MimeMappings.class)) {
			MimeMappings mimeMappings2 = new MimeMappings();
			MimeMappings mimeMappings3 = MimeMappings.DEFAULT;
			mimeMappings.when(() -> MimeMappings.lazyCopy(mimeMappings3)).thenReturn(mimeMappings2);
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			nativeDetector.when(() -> NativeDetector.inNativeImage()).thenReturn(false);
			aprLifecycleListener.when(() -> AprLifecycleListener.isAprAvailable()).thenReturn(false);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			Collection<TomcatProtocolHandlerCustomizer<?>> result = target.getTomcatProtocolHandlerCustomizers();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				mimeMappings.verify(() -> MimeMappings.lazyCopy(mimeMappings3), atLeast(1));
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				nativeDetector.verify(() -> NativeDetector.inNativeImage(), atLeast(1));
				aprLifecycleListener.verify(() -> AprLifecycleListener.isAprAvailable(), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${bf0c9144-dac8-32a4-aef9-a001c90769f7}
	@Test()
	void addAdditionalTomcatConnectorsTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Connector connector = new Connector();
			Connector[] connectorArray = new Connector[] { connector };
			_assert.when(() -> Assert.notNull(connectorArray, "Connectors must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("String contextPath", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			target.addAdditionalTomcatConnectors(connectorArray);
			//Assert statement(s)
			assertAll("result", () -> _assert.verify(() -> Assert.notNull(connectorArray, "Connectors must not be null"), atLeast(1)));
		}
	}
}
