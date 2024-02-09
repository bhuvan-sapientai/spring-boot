package org.springframework.boot.web.embedded.jetty;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.springframework.boot.web.server.Ssl;
import org.springframework.boot.web.servlet.ServletContextInitializer;

import org.eclipse.jetty.server.Handler;
import org.mockito.MockitoAnnotations;

import org.springframework.boot.web.server.Compression;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.util.Assert;

import java.time.Duration;
import java.util.HashMap;
import java.nio.charset.Charset;
import java.util.ArrayList;

import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.ee10.webapp.Configuration;

import org.springframework.boot.ssl.SslBundle;

import org.mockito.stubbing.Answer;

import org.springframework.boot.web.server.Shutdown;
import org.springframework.boot.web.servlet.server.Jsp;

import org.eclipse.jetty.session.DefaultSessionCache;

import java.net.URI;

import org.springframework.boot.web.server.Cookie;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.boot.web.servlet.server.StaticResourceJars;

import java.net.InetAddress;
import java.io.File;

import org.springframework.boot.web.servlet.server.SessionStoreDirectory;
import org.springframework.boot.web.server.WebServerSslBundle;
import org.springframework.boot.ssl.SslBundles;

import org.eclipse.jetty.ee10.webapp.WebAppContext;

import java.util.List;

import org.eclipse.jetty.ee10.servlet.SessionHandler;

import org.springframework.boot.web.server.MimeMappings;

import org.eclipse.jetty.ee10.webapp.WebInfConfiguration;

import java.util.Locale;
import java.util.Map;

import org.springframework.boot.web.servlet.server.DocumentRoot;
import org.springframework.boot.web.server.Http2;

import org.eclipse.jetty.http.HttpCookie;

import org.springframework.util.ClassUtils;
import org.springframework.boot.web.servlet.server.CookieSameSiteSupplier;

import java.util.Set;
import java.util.Collection;
import java.net.URL;

import org.mockito.MockedStatic;

import org.springframework.boot.web.server.WebServer;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.resource.ResourceFactory;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.atLeast;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JettyServletWebServerFactorySapientGeneratedTest {

	private final DocumentRoot documentRootMock = mock(DocumentRoot.class, "documentRoot");

	private final StaticResourceJars staticResourceJarsMock = mock(StaticResourceJars.class, "staticResourceJars");

	private final Session sessionMock = mock(Session.class, "session");

	private AutoCloseable autoCloseableMocks;

	@InjectMocks()
	private JettyServletWebServerFactory target;

	@AfterEach()
	public void afterTest() throws Exception {
		if (autoCloseableMocks != null)
			autoCloseableMocks.close();
	}

	//Sapient generated method id: ${0e320937-c483-315b-81e7-87b93ffc2737}
	@Test()
	void getWebServerWhenGetShutdownEqualsShutdownGRACEFUL() throws Exception {
		/* Branches:
		 * (getHttp2() != null) : true  #  inside createConnector method
		 * (getHttp2().isEnabled()) : true  #  inside createConnector method
		 * (for-each(getMimeMappings())) : true  #  inside createServer method
		 * (getCompression() != null) : true  #  inside addHandlerWrappers method
		 * (getCompression().getEnabled()) : true  #  inside addHandlerWrappers method
		 * (StringUtils.hasText(getServerHeader())) : true  #  inside addHandlerWrappers method
		 * (!CollectionUtils.isEmpty(getCookieSameSiteSuppliers())) : true  #  inside addHandlerWrappers method
		 * (this.maxConnections > -1) : false
		 * (Ssl.isEnabled(getSsl())) : true
		 * (for-each(getServerCustomizers())) : true
		 * (this.useForwardHeaders) : false
		 * (getShutdown() == Shutdown.GRACEFUL) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: server
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//MimeMappings mimeMappingsMock = mock(MimeMappings.class);
		//Handler.Wrapper handlerWrapperMock = mock(Handler.Wrapper.class);
		//Handler.Wrapper handlerWrapperMock2 = mock(Handler.Wrapper.class);
		//SslBundle sslBundleMock = mock(SslBundle.class);
		//JettyServerCustomizer jettyServerCustomizerMock = mock(JettyServerCustomizer.class);
		//JettyWebServer jettyWebServerMock = mock(JettyWebServer.class);
        /*try (MockedStatic<WebServerSslBundle> webServerSslBundle = mockStatic(WebServerSslBundle.class);
    MockedStatic<Ssl> ssl = mockStatic(Ssl.class);
    MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class);
    MockedStatic<JettyHandlerWrappers> jettyHandlerWrappers = mockStatic(JettyHandlerWrappers.class);
    MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    doReturn(null).when(mimeMappingsMock).iterator();
    _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    Compression compression = new Compression();
    compression.setEnabled(true);
    jettyHandlerWrappers.when(() -> JettyHandlerWrappers.createGzipHandlerWrapper(compression)).thenReturn(handlerWrapperMock);
    doNothing().when(handlerWrapperMock).setHandler((JettyEmbeddedWebAppContext) any());
    jettyHandlerWrappers.when(() -> JettyHandlerWrappers.createServerHeaderHandlerWrapper("H")).thenReturn(handlerWrapperMock2);
    doNothing().when(handlerWrapperMock2).setHandler(handlerWrapperMock);
    collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(false);
    Ssl ssl2 = new Ssl();
    ssl2.setClientAuth(Ssl.ClientAuth.NONE);
    ssl.when(() -> Ssl.isEnabled(ssl2)).thenReturn(true);
    webServerSslBundle.when(() -> WebServerSslBundle.get((Ssl) null, (SslBundles) null)).thenReturn(sslBundleMock);
    target = spy(new JettyServletWebServerFactory("/A", 2));
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    InetAddress inetAddress = InetAddress.getLoopbackAddress();
    target.setAddress(inetAddress);
    List<CookieSameSiteSupplier> cookieSameSiteSupplierList = new ArrayList<>();
    target.setCookieSameSiteSuppliers(cookieSameSiteSupplierList);
    Http2 http2 = new Http2();
    http2.setEnabled(true);
    target.setHttp2(http2);
    target.setCompression(compression);
    target.setSsl(ssl2);
    target.setMimeMappings(mimeMappingsMock);
    target.setServerHeader("H");
    target.setShutdown(Shutdown.GRACEFUL);
    ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
    doNothing().when(target).configureWebAppContext((JettyEmbeddedWebAppContext) any(), eq(servletContextInitializerArray));
    Collection<JettyServerCustomizer> collection = new ArrayList<>();
    collection.add(jettyServerCustomizerMock);
    doReturn(collection).when(target).getServerCustomizers();
    doNothing().when(jettyServerCustomizerMock).customize((Server) any());
    doReturn(jettyWebServerMock).when(target).getJettyWebServer((Server) any());
    //Act Statement(s)
    WebServer result = target.getWebServer(servletContextInitializerArray);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, equalTo(jettyWebServerMock));
        verify(mimeMappingsMock).iterator();
        _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
        jettyHandlerWrappers.verify(() -> JettyHandlerWrappers.createGzipHandlerWrapper(compression), atLeast(1));
        verify(handlerWrapperMock).setHandler((JettyEmbeddedWebAppContext) any());
        jettyHandlerWrappers.verify(() -> JettyHandlerWrappers.createServerHeaderHandlerWrapper("H"), atLeast(1));
        verify(handlerWrapperMock2).setHandler(handlerWrapperMock);
        collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()));
        ssl.verify(() -> Ssl.isEnabled(ssl2), atLeast(1));
        webServerSslBundle.verify(() -> WebServerSslBundle.get((Ssl) null, (SslBundles) null), atLeast(1));
        verify(target).configureWebAppContext((JettyEmbeddedWebAppContext) any(), eq(servletContextInitializerArray));
        verify(target).getServerCustomizers();
        verify(jettyServerCustomizerMock).customize((Server) any());
        verify(target).getJettyWebServer((Server) any());
    });
}*/
	}

	//Sapient generated method id: ${a5fd4f81-3fa0-35a7-804a-19e41dbfb474}
	@Test()
	void configureWebAppContextWhenCaughtExceptionThrowsIllegalStateException() throws IOException {
		/* Branches:
		 * (this.resourceLoader != null) : false
		 * (StringUtils.hasLength(contextPath)) : true
		 * (root != null) : true  #  inside configureDocumentRoot method
		 * (docBase.isDirectory()) : true  #  inside configureDocumentRoot method
		 * (root != null) : true  #  inside configureDocumentRoot method
		 * (for-each(getUrlsOfJarsWithMetaInfResources())) : true  #  inside configureDocumentRoot method
		 * ("file".equals(url.getProtocol())) : true  #  inside createResource method
		 * (file.isFile()) : true  #  inside createResource method
		 * (resource != null) : true  #  inside configureDocumentRoot method
		 * (catch-exception (Exception)) : true  #  inside configureDocumentRoot method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//WebAppContext contextMock = mock(WebAppContext.class);
		//ResourceFactory resourceFactoryMock = mock(ResourceFactory.class);
		//Resource resourceMock = mock(Resource.class);
		//Resource resourceMock2 = mock(Resource.class);
		//Resource resourceMock3 = mock(Resource.class);
        /*try (MockedStatic<ResourceFactory> resourceFactory = mockStatic(ResourceFactory.class);
    MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    doNothing().when(contextMock).clearAliasChecks();
    doNothing().when(contextMock).setContextPath("/A");
    doNothing().when(contextMock).setDisplayName("displayName1");
    doReturn(resourceFactoryMock).when(contextMock).getResourceFactory();
    doReturn(resourceMock).when(resourceFactoryMock).newResource((URI) any());
    doReturn(resourceMock2).when(resourceFactoryMock).newResource("jar:configureDocumentRoot_object1!/META-INF/resources/");
    doNothing().when(contextMock).setBaseResource(resourceMock3);
    _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    _assert.when(() -> Assert.notNull(contextMock, "Context must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    resourceFactory.when(() -> ResourceFactory.combine(anyList())).thenReturn(resourceMock3);
    target = new JettyServletWebServerFactory("/A", 0);
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    target.setDisplayName("displayName1");
    File file = new File("pathname1");
    doReturn(file).when(documentRootMock).getValidDirectory();
    List<URL> uRLList = new ArrayList<>();
    uRLList.add((URL) null);
    doReturn(uRLList).when(staticResourceJarsMock).getUrls();
    ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
    //Act Statement(s)
    final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
        target.configureWebAppContext(contextMock, servletContextInitializerArray);
    });
    Exception exception = new Exception();
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(notNullValue()));
        assertThat(result.getCause(), is(instanceOf(exception.getClass())));
        verify(contextMock).clearAliasChecks();
        verify(contextMock).setContextPath("/A");
        verify(contextMock).setDisplayName("displayName1");
        verify(contextMock).getResourceFactory();
        verify(resourceFactoryMock).newResource((URI) any());
        verify(resourceFactoryMock).newResource("jar:configureDocumentRoot_object1!/META-INF/resources/");
        verify(contextMock).setBaseResource(resourceMock3);
        _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
        _assert.verify(() -> Assert.notNull(contextMock, "Context must not be null"), atLeast(1));
        resourceFactory.verify(() -> ResourceFactory.combine(anyList()));
        verify(documentRootMock).getValidDirectory();
        verify(staticResourceJarsMock).getUrls();
    });
}*/
	}

	//Sapient generated method id: ${39b1274f-506b-33ca-be63-af583ed013ba}
	@Test()
	void configureWebAppContextWhenSessionSameSiteIsNullAndSessionTimeoutIsNullAndIsNegativeSessionTimeoutAndGetSessionNotIsPers() throws Exception {
		/* Branches:
		 * (this.resourceLoader != null) : false
		 * (StringUtils.hasLength(contextPath)) : false
		 * (root != null) : false  #  inside configureDocumentRoot method
		 * (docBase.isDirectory()) : false  #  inside configureDocumentRoot method
		 * (root != null) : false  #  inside configureDocumentRoot method
		 * (for-each(getUrlsOfJarsWithMetaInfResources())) : false  #  inside configureDocumentRoot method
		 * (isRegisterDefaultServlet()) : true
		 * (this.jsp != null) : true  #  inside shouldRegisterJspServlet method
		 * (this.jsp.getRegistered()) : true  #  inside shouldRegisterJspServlet method
		 * (ClassUtils.isPresent(this.jsp.getClassName(), getClass().getClassLoader())) : true  #  inside shouldRegisterJspServlet method
		 * (shouldRegisterJspServlet()) : true
		 * (sessionSameSite != null) : false  #  inside configureSession method
		 * (sessionTimeout == null) : true  #  inside isNegative method
		 * (isNegative(sessionTimeout)) : true  #  inside configureSession method
		 * (getSession().isPersistent()) : false  #  inside configureSession method
		 * (temp != null) : false  #  inside getTempDirectory method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//WebAppContext contextMock = mock(WebAppContext.class);
		//ResourceFactory resourceFactoryMock = mock(ResourceFactory.class);
		//Resource resourceMock = mock(Resource.class);
		//Resource resourceMock2 = mock(Resource.class);
		//SessionHandler sessionHandlerMock = mock(SessionHandler.class);
		//Session sessionMock2 = mock(Session.class);
        /*try (MockedStatic<ResourceFactory> resourceFactory = mockStatic(ResourceFactory.class);
    MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
    MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    doNothing().when(contextMock).clearAliasChecks();
    doNothing().when(contextMock).setContextPath("/");
    doNothing().when(contextMock).setDisplayName("displayName1");
    doReturn(resourceFactoryMock).when(contextMock).getResourceFactory();
    doReturn(resourceMock).when(resourceFactoryMock).newJarFileResource((URI) any());
    doNothing().when(contextMock).setBaseResource(resourceMock2);
    doReturn(false).when(contextMock).addBean((JasperInitializer) any(), eq(true));
    doNothing().when(contextMock).addLocaleEncoding("addLocaleMappings_locale1", "addLocaleMappings_charset1");
    Configuration[] configurationArray = new Configuration[] {};
    doNothing().when(contextMock).setConfigurations(configurationArray);
    doNothing().when(contextMock).setThrowUnavailableOnStartupException(true);
    doReturn(sessionHandlerMock).when(contextMock).getSessionHandler();
    doNothing().when(sessionHandlerMock).setMaxInactiveInterval(-1);
    doNothing().when(contextMock).setTempDirectory((File) null);
    Session.Cookie sessionCookie = new Session.Cookie();
    sessionCookie.setSameSite((Cookie.SameSite) null);
    doReturn(sessionCookie).when(sessionMock2).getCookie();
    doReturn(null).when(sessionMock2).getTimeout();
    doReturn(false).when(sessionMock2).isPersistent();
    _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    _assert.when(() -> Assert.notNull(contextMock, "Context must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    stringUtils.when(() -> StringUtils.hasLength("/A")).thenReturn(false);
    resourceFactory.when(() -> ResourceFactory.combine(anyList())).thenReturn(resourceMock2);
    target = spy(new JettyServletWebServerFactory("/A", 2));
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    target.setRegisterDefaultServlet(true);
    Locale locale = new Locale("language1");
    Charset charset = Charset.defaultCharset();
    Map<Locale, Charset> localeCharsetMap = new HashMap<>();
    localeCharsetMap.put(locale, charset);
    target.setLocaleCharsetMappings(localeCharsetMap);
    target.setDisplayName("displayName1");
    target.setSession(sessionMock2);
    Jsp jsp = new Jsp();
    target.setJsp(jsp);
    doReturn(null).when(documentRootMock).getValidDirectory();
    List<URL> uRLList = new ArrayList<>();
    doReturn(uRLList).when(staticResourceJarsMock).getUrls();
    doNothing().when(target).addDefaultServlet(contextMock);
    doNothing().when(target).addJspServlet(contextMock);
    ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] { null, null };
    doReturn(configurationArray).when(target).getWebAppContextConfigurations(contextMock, servletContextInitializerArray);
    doNothing().when(target).postProcessWebAppContext(contextMock);
    ServletContextInitializer[] servletContextInitializerArray2 = new ServletContextInitializer[] {};
    //Act Statement(s)
    target.configureWebAppContext(contextMock, servletContextInitializerArray2);
    //Assert statement(s)
    assertAll("result", () -> {
        verify(contextMock).clearAliasChecks();
        verify(contextMock).setContextPath("/");
        verify(contextMock).setDisplayName("displayName1");
        verify(contextMock).getResourceFactory();
        verify(resourceFactoryMock).newJarFileResource((URI) any());
        verify(contextMock).setBaseResource(resourceMock2);
        verify(contextMock).addBean((JasperInitializer) any(), eq(true));
        verify(contextMock).addLocaleEncoding("addLocaleMappings_locale1", "addLocaleMappings_charset1");
        verify(contextMock).setConfigurations(configurationArray);
        verify(contextMock).setThrowUnavailableOnStartupException(true);
        verify(contextMock).getSessionHandler();
        verify(sessionHandlerMock).setMaxInactiveInterval(-1);
        verify(contextMock).setTempDirectory((File) null);
        verify(sessionMock2).getCookie();
        verify(sessionMock2).getTimeout();
        verify(sessionMock2).isPersistent();
        _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
        _assert.verify(() -> Assert.notNull(contextMock, "Context must not be null"), atLeast(1));
        stringUtils.verify(() -> StringUtils.hasLength("/A"), atLeast(1));
        resourceFactory.verify(() -> ResourceFactory.combine(anyList()));
        verify(documentRootMock).getValidDirectory();
        verify(staticResourceJarsMock).getUrls();
        verify(target).addDefaultServlet(contextMock);
        verify(target).addJspServlet(contextMock);
        verify(target).getWebAppContextConfigurations(contextMock, servletContextInitializerArray);
        verify(target).postProcessWebAppContext(contextMock);
    });
}*/
	}

	//Sapient generated method id: ${cc0a038c-ae96-350a-9436-e99f66e6eace}
	@Test()
	void configureWebAppContextWhenSessionTimeoutIsNullAndIsNegativeSessionTimeoutAndGetSessionNotIsPersistentAndTempIsNull7() throws Exception {
		/* Branches:
		 * (this.resourceLoader != null) : false
		 * (StringUtils.hasLength(contextPath)) : true
		 * (root != null) : false  #  inside configureDocumentRoot method
		 * (docBase.isDirectory()) : false  #  inside configureDocumentRoot method
		 * (root != null) : false  #  inside configureDocumentRoot method
		 * (for-each(getUrlsOfJarsWithMetaInfResources())) : true  #  inside configureDocumentRoot method
		 * ("file".equals(url.getProtocol())) : false  #  inside createResource method
		 * (resource != null) : true  #  inside configureDocumentRoot method
		 * (isRegisterDefaultServlet()) : false
		 * (this.jsp != null) : true  #  inside shouldRegisterJspServlet method
		 * (this.jsp.getRegistered()) : true  #  inside shouldRegisterJspServlet method
		 * (ClassUtils.isPresent(this.jsp.getClassName(), getClass().getClassLoader())) : true  #  inside shouldRegisterJspServlet method
		 * (shouldRegisterJspServlet()) : true
		 * (sessionSameSite != null) : false  #  inside configureSession method
		 * (sessionTimeout == null) : true  #  inside isNegative method
		 * (isNegative(sessionTimeout)) : true  #  inside configureSession method
		 * (getSession().isPersistent()) : false  #  inside configureSession method
		 * (temp != null) : false  #  inside getTempDirectory method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//WebAppContext contextMock = mock(WebAppContext.class);
		//ResourceFactory resourceFactoryMock = mock(ResourceFactory.class);
		//Resource resourceMock = mock(Resource.class);
		//Resource resourceMock2 = mock(Resource.class);
		//SessionHandler sessionHandlerMock = mock(SessionHandler.class);
		//Session sessionMock2 = mock(Session.class);
        /*try (MockedStatic<ResourceFactory> resourceFactory = mockStatic(ResourceFactory.class);
    MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    doNothing().when(contextMock).clearAliasChecks();
    doNothing().when(contextMock).setContextPath("/A");
    doNothing().when(contextMock).setDisplayName("displayName1");
    doReturn(resourceFactoryMock).when(contextMock).getResourceFactory();
    doReturn(resourceMock).when(resourceFactoryMock).newJarFileResource((URI) any());
    doNothing().when(contextMock).setBaseResource(resourceMock2);
    doReturn(false).when(contextMock).addBean((JasperInitializer) any(), eq(true));
    doNothing().when(contextMock).addLocaleEncoding("addLocaleMappings_locale1", "addLocaleMappings_charset1");
    Configuration[] configurationArray = new Configuration[] {};
    doNothing().when(contextMock).setConfigurations(configurationArray);
    doNothing().when(contextMock).setThrowUnavailableOnStartupException(true);
    doReturn(sessionHandlerMock).when(contextMock).getSessionHandler();
    doNothing().when(sessionHandlerMock).setMaxInactiveInterval(-1);
    doNothing().when(contextMock).setTempDirectory((File) null);
    Session.Cookie sessionCookie = new Session.Cookie();
    sessionCookie.setSameSite((Cookie.SameSite) null);
    doReturn(sessionCookie).when(sessionMock2).getCookie();
    doReturn(null).when(sessionMock2).getTimeout();
    doReturn(false).when(sessionMock2).isPersistent();
    _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    _assert.when(() -> Assert.notNull(contextMock, "Context must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    resourceFactory.when(() -> ResourceFactory.combine(anyList())).thenReturn(resourceMock2);
    target = spy(new JettyServletWebServerFactory("/A", 2));
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    target.setRegisterDefaultServlet(false);
    Locale locale = new Locale("language1");
    Charset charset = Charset.defaultCharset();
    Map<Locale, Charset> localeCharsetMap = new HashMap<>();
    localeCharsetMap.put(locale, charset);
    target.setLocaleCharsetMappings(localeCharsetMap);
    target.setDisplayName("displayName1");
    target.setSession(sessionMock2);
    Jsp jsp = new Jsp();
    target.setJsp(jsp);
    doReturn(null).when(documentRootMock).getValidDirectory();
    List<URL> uRLList = new ArrayList<>();
    uRLList.add((URL) null);
    doReturn(uRLList).when(staticResourceJarsMock).getUrls();
    doNothing().when(target).addJspServlet(contextMock);
    ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] { null, null };
    doReturn(configurationArray).when(target).getWebAppContextConfigurations(contextMock, servletContextInitializerArray);
    doNothing().when(target).postProcessWebAppContext(contextMock);
    ServletContextInitializer[] servletContextInitializerArray2 = new ServletContextInitializer[] {};
    //Act Statement(s)
    target.configureWebAppContext(contextMock, servletContextInitializerArray2);
    //Assert statement(s)
    assertAll("result", () -> {
        verify(contextMock).clearAliasChecks();
        verify(contextMock).setContextPath("/A");
        verify(contextMock).setDisplayName("displayName1");
        verify(contextMock).getResourceFactory();
        verify(resourceFactoryMock).newJarFileResource((URI) any());
        verify(contextMock).setBaseResource(resourceMock2);
        verify(contextMock).addBean((JasperInitializer) any(), eq(true));
        verify(contextMock).addLocaleEncoding("addLocaleMappings_locale1", "addLocaleMappings_charset1");
        verify(contextMock).setConfigurations(configurationArray);
        verify(contextMock).setThrowUnavailableOnStartupException(true);
        verify(contextMock).getSessionHandler();
        verify(sessionHandlerMock).setMaxInactiveInterval(-1);
        verify(contextMock).setTempDirectory((File) null);
        verify(sessionMock2).getCookie();
        verify(sessionMock2).getTimeout();
        verify(sessionMock2).isPersistent();
        _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
        _assert.verify(() -> Assert.notNull(contextMock, "Context must not be null"), atLeast(1));
        resourceFactory.verify(() -> ResourceFactory.combine(anyList()));
        verify(documentRootMock).getValidDirectory();
        verify(staticResourceJarsMock).getUrls();
        verify(target).addJspServlet(contextMock);
        verify(target).getWebAppContextConfigurations(contextMock, servletContextInitializerArray);
        verify(target).postProcessWebAppContext(contextMock);
    });
}*/
	}

	//Sapient generated method id: ${5e21962a-99ce-37d8-a783-46eec3096deb}
	@Test()
	void configureWebAppContextWhenTempIsNotNull() throws Exception {
		/* Branches:
		 * (this.resourceLoader != null) : false
		 * (StringUtils.hasLength(contextPath)) : true
		 * (root != null) : true  #  inside configureDocumentRoot method
		 * (docBase.isDirectory()) : true  #  inside configureDocumentRoot method
		 * (root != null) : true  #  inside configureDocumentRoot method
		 * (for-each(getUrlsOfJarsWithMetaInfResources())) : true  #  inside configureDocumentRoot method
		 * ("file".equals(url.getProtocol())) : true  #  inside createResource method
		 * (file.isFile()) : true  #  inside createResource method
		 * (resource != null) : true  #  inside configureDocumentRoot method
		 * (isRegisterDefaultServlet()) : true
		 * (this.jsp != null) : true  #  inside shouldRegisterJspServlet method
		 * (this.jsp.getRegistered()) : true  #  inside shouldRegisterJspServlet method
		 * (ClassUtils.isPresent(this.jsp.getClassName(), getClass().getClassLoader())) : true  #  inside shouldRegisterJspServlet method
		 * (shouldRegisterJspServlet()) : true
		 * (sessionSameSite != null) : true  #  inside configureSession method
		 * (sessionTimeout == null) : false  #  inside isNegative method
		 * (sessionTimeout.isNegative()) : true  #  inside isNegative method
		 * (isNegative(sessionTimeout)) : true  #  inside configureSession method
		 * (getSession().isPersistent()) : true  #  inside configureSession method
		 * (temp != null) : true  #  inside getTempDirectory method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//WebAppContext contextMock = mock(WebAppContext.class);
		//ResourceFactory resourceFactoryMock = mock(ResourceFactory.class);
		//Resource resourceMock = mock(Resource.class);
		//Resource resourceMock2 = mock(Resource.class);
		//Resource resourceMock3 = mock(Resource.class);
		//SessionHandler sessionHandlerMock = mock(SessionHandler.class);
		//SessionStoreDirectory sessionStoreDirectoryMock = mock(SessionStoreDirectory.class);
        /*try (MockedStatic<WebInfConfiguration> webInfConfiguration = mockStatic(WebInfConfiguration.class);
    MockedStatic<ResourceFactory> resourceFactory = mockStatic(ResourceFactory.class);
    MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    doNothing().when(contextMock).clearAliasChecks();
    doNothing().when(contextMock).setContextPath("/B");
    doNothing().when(contextMock).setDisplayName("displayName1");
    doReturn(resourceFactoryMock).when(contextMock).getResourceFactory();
    doReturn(resourceMock).when(resourceFactoryMock).newResource((URI) any());
    doReturn(resourceMock2).when(resourceFactoryMock).newResource("jar:configureDocumentRoot_object2!/META-INF/resources/");
    doNothing().when(contextMock).setBaseResource(resourceMock3);
    doReturn(false).when(contextMock).addBean((JasperInitializer) any(), eq(true));
    doNothing().when(contextMock).addLocaleEncoding("addLocaleMappings_locale1", "addLocaleMappings_charset1");
    Configuration[] configurationArray = new Configuration[] {};
    doNothing().when(contextMock).setConfigurations(configurationArray);
    doNothing().when(contextMock).setThrowUnavailableOnStartupException(true);
    doReturn(sessionHandlerMock).when(contextMock).getSessionHandler();
    doNothing().when(sessionHandlerMock).setSameSite(HttpCookie.SameSite.LAX);
    doNothing().when(sessionHandlerMock).setMaxInactiveInterval(-1);
    doNothing().when(sessionHandlerMock).setSessionCache((DefaultSessionCache) any());
    doNothing().when(contextMock).setTempDirectory((File) any());
    _assert.when(() -> Assert.notNull("/B", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    _assert.when(() -> Assert.notNull(contextMock, "Context must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    resourceFactory.when(() -> ResourceFactory.combine(anyList())).thenReturn(resourceMock3);
    webInfConfiguration.when(() -> WebInfConfiguration.getCanonicalNameForWebAppTmpDir(contextMock)).thenReturn("");
    target = spy(new JettyServletWebServerFactory("/B", 0));
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    target.setRegisterDefaultServlet(true);
    Locale locale = new Locale("language1");
    Charset charset = Charset.defaultCharset();
    Map<Locale, Charset> localeCharsetMap = new HashMap<>();
    localeCharsetMap.put(locale, charset);
    target.setLocaleCharsetMappings(localeCharsetMap);
    target.setDisplayName("displayName1");
    target.setSession(sessionMock);
    Jsp jsp = new Jsp();
    target.setJsp(jsp);
    File file = new File("pathname1");
    doReturn(file).when(documentRootMock).getValidDirectory();
    List<URL> uRLList = new ArrayList<>();
    uRLList.add((URL) null);
    doReturn(uRLList).when(staticResourceJarsMock).getUrls();
    doNothing().when(target).addDefaultServlet(contextMock);
    doNothing().when(target).addJspServlet(contextMock);
    ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] { null, null };
    doReturn(configurationArray).when(target).getWebAppContextConfigurations(contextMock, servletContextInitializerArray);
    doReturn(sessionStoreDirectoryMock).when(sessionMock).getSessionStoreDirectory();
    File file2 = sessionStoreDirectoryMock.getValidDirectory(true);
    doReturn(file2).when(sessionStoreDirectoryMock).getValidDirectory(true);
    doNothing().when(target).postProcessWebAppContext(contextMock);
    ServletContextInitializer[] servletContextInitializerArray2 = new ServletContextInitializer[] {};
    //Act Statement(s)
    target.configureWebAppContext(contextMock, servletContextInitializerArray2);
    //Assert statement(s)
    assertAll("result", () -> {
        verify(contextMock).clearAliasChecks();
        verify(contextMock).setContextPath("/B");
        verify(contextMock).setDisplayName("displayName1");
        verify(contextMock).getResourceFactory();
        verify(resourceFactoryMock).newResource((URI) any());
        verify(resourceFactoryMock).newResource("jar:configureDocumentRoot_object2!/META-INF/resources/");
        verify(contextMock).setBaseResource(resourceMock3);
        verify(contextMock).addBean((JasperInitializer) any(), eq(true));
        verify(contextMock).addLocaleEncoding("addLocaleMappings_locale1", "addLocaleMappings_charset1");
        verify(contextMock).setConfigurations(configurationArray);
        verify(contextMock).setThrowUnavailableOnStartupException(true);
        verify(contextMock).getSessionHandler();
        verify(sessionHandlerMock).setSameSite(HttpCookie.SameSite.LAX);
        verify(sessionHandlerMock).setMaxInactiveInterval(-1);
        verify(sessionHandlerMock).setSessionCache((DefaultSessionCache) any());
        verify(contextMock).setTempDirectory((File) any());
        _assert.verify(() -> Assert.notNull("/B", "ContextPath must not be null"), atLeast(1));
        _assert.verify(() -> Assert.notNull(contextMock, "Context must not be null"), atLeast(1));
        resourceFactory.verify(() -> ResourceFactory.combine(anyList()));
        webInfConfiguration.verify(() -> WebInfConfiguration.getCanonicalNameForWebAppTmpDir(contextMock), atLeast(1));
        verify(documentRootMock).getValidDirectory();
        verify(staticResourceJarsMock).getUrls();
        verify(target).addDefaultServlet(contextMock);
        verify(target).addJspServlet(contextMock);
        verify(target).getWebAppContextConfigurations(contextMock, servletContextInitializerArray);
        verify(sessionMock).getSessionStoreDirectory();
        verify(sessionStoreDirectoryMock).getValidDirectory(true);
        verify(target).postProcessWebAppContext(contextMock);
    });
}*/
	}

	//Sapient generated method id: ${22026881-e740-3149-9542-7e01fddad983}
	@Test()
	void configureWebAppContextWhenIsNegativeNotSessionTimeoutAndGetSessionNotIsPersistentAndTempIsNull() throws Exception {
		/* Branches:
		 * (this.resourceLoader != null) : false
		 * (StringUtils.hasLength(contextPath)) : true
		 * (root != null) : true  #  inside configureDocumentRoot method
		 * (docBase.isDirectory()) : true  #  inside configureDocumentRoot method
		 * (root != null) : true  #  inside configureDocumentRoot method
		 * (for-each(getUrlsOfJarsWithMetaInfResources())) : true  #  inside configureDocumentRoot method
		 * ("file".equals(url.getProtocol())) : true  #  inside createResource method
		 * (file.isFile()) : true  #  inside createResource method
		 * (resource != null) : true  #  inside configureDocumentRoot method
		 * (isRegisterDefaultServlet()) : true
		 * (this.jsp != null) : true  #  inside shouldRegisterJspServlet method
		 * (this.jsp.getRegistered()) : true  #  inside shouldRegisterJspServlet method
		 * (ClassUtils.isPresent(this.jsp.getClassName(), getClass().getClassLoader())) : true  #  inside shouldRegisterJspServlet method
		 * (shouldRegisterJspServlet()) : true
		 * (sessionSameSite != null) : true  #  inside configureSession method
		 * (sessionTimeout == null) : false  #  inside isNegative method
		 * (sessionTimeout.isNegative()) : false  #  inside isNegative method
		 * (isNegative(sessionTimeout)) : false  #  inside configureSession method
		 * (getSession().isPersistent()) : false  #  inside configureSession method
		 * (temp != null) : false  #  inside getTempDirectory method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//WebAppContext contextMock = mock(WebAppContext.class);
		//ResourceFactory resourceFactoryMock = mock(ResourceFactory.class);
		//Resource resourceMock = mock(Resource.class);
		//Resource resourceMock2 = mock(Resource.class);
		//Resource resourceMock3 = mock(Resource.class);
		//SessionHandler sessionHandlerMock = mock(SessionHandler.class);
		//Session sessionMock2 = mock(Session.class);
        /*try (MockedStatic<ResourceFactory> resourceFactory = mockStatic(ResourceFactory.class);
    MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
    doNothing().when(contextMock).clearAliasChecks();
    doNothing().when(contextMock).setContextPath("/B");
    doNothing().when(contextMock).setDisplayName("displayName1");
    doReturn(resourceFactoryMock).when(contextMock).getResourceFactory();
    doReturn(resourceMock).when(resourceFactoryMock).newResource((URI) any());
    doReturn(resourceMock2).when(resourceFactoryMock).newResource("jar:configureDocumentRoot_object1!/META-INF/resources/");
    doNothing().when(contextMock).setBaseResource(resourceMock3);
    doReturn(false).when(contextMock).addBean((JasperInitializer) any(), eq(true));
    doNothing().when(contextMock).addLocaleEncoding("addLocaleMappings_locale1", "addLocaleMappings_charset1");
    Configuration[] configurationArray = new Configuration[] {};
    doNothing().when(contextMock).setConfigurations(configurationArray);
    doNothing().when(contextMock).setThrowUnavailableOnStartupException(true);
    doReturn(sessionHandlerMock).when(contextMock).getSessionHandler();
    doNothing().when(sessionHandlerMock).setSameSite(HttpCookie.SameSite.NONE);
    doNothing().when(sessionHandlerMock).setMaxInactiveInterval(1);
    doNothing().when(contextMock).setTempDirectory((File) null);
    Session.Cookie sessionCookie = new Session.Cookie();
    sessionCookie.setSameSite(Cookie.SameSite.NONE);
    doReturn(sessionCookie).when(sessionMock2).getCookie();
    Duration duration = Duration.ofDays(0L);
    doReturn(duration).when(sessionMock2).getTimeout();
    doReturn(false).when(sessionMock2).isPersistent();
    _assert.when(() -> Assert.notNull("/B", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    _assert.when(() -> Assert.notNull(contextMock, "Context must not be null")).thenAnswer((Answer<Void>) invocation -> null);
    resourceFactory.when(() -> ResourceFactory.combine(anyList())).thenReturn(resourceMock3);
    target = spy(new JettyServletWebServerFactory("/B", 0));
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    target.setRegisterDefaultServlet(true);
    Locale locale = new Locale("language1");
    Charset charset = Charset.defaultCharset();
    Map<Locale, Charset> localeCharsetMap = new HashMap<>();
    localeCharsetMap.put(locale, charset);
    target.setLocaleCharsetMappings(localeCharsetMap);
    target.setDisplayName("displayName1");
    target.setSession(sessionMock2);
    Jsp jsp = new Jsp();
    target.setJsp(jsp);
    File file = new File("pathname1");
    doReturn(file).when(documentRootMock).getValidDirectory();
    List<URL> uRLList = new ArrayList<>();
    uRLList.add((URL) null);
    doReturn(uRLList).when(staticResourceJarsMock).getUrls();
    doNothing().when(target).addDefaultServlet(contextMock);
    doNothing().when(target).addJspServlet(contextMock);
    ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] { null, null };
    doReturn(configurationArray).when(target).getWebAppContextConfigurations(contextMock, servletContextInitializerArray);
    doNothing().when(target).postProcessWebAppContext(contextMock);
    ServletContextInitializer[] servletContextInitializerArray2 = new ServletContextInitializer[] {};
    //Act Statement(s)
    target.configureWebAppContext(contextMock, servletContextInitializerArray2);
    //Assert statement(s)
    assertAll("result", () -> {
        verify(contextMock).clearAliasChecks();
        verify(contextMock).setContextPath("/B");
        verify(contextMock).setDisplayName("displayName1");
        verify(contextMock).getResourceFactory();
        verify(resourceFactoryMock).newResource((URI) any());
        verify(resourceFactoryMock).newResource("jar:configureDocumentRoot_object1!/META-INF/resources/");
        verify(contextMock).setBaseResource(resourceMock3);
        verify(contextMock).addBean((JasperInitializer) any(), eq(true));
        verify(contextMock).addLocaleEncoding("addLocaleMappings_locale1", "addLocaleMappings_charset1");
        verify(contextMock).setConfigurations(configurationArray);
        verify(contextMock).setThrowUnavailableOnStartupException(true);
        verify(contextMock).getSessionHandler();
        verify(sessionHandlerMock).setSameSite(HttpCookie.SameSite.NONE);
        verify(sessionHandlerMock).setMaxInactiveInterval(1);
        verify(contextMock).setTempDirectory((File) null);
        verify(sessionMock2).getCookie();
        verify(sessionMock2).getTimeout();
        verify(sessionMock2).isPersistent();
        _assert.verify(() -> Assert.notNull("/B", "ContextPath must not be null"), atLeast(1));
        _assert.verify(() -> Assert.notNull(contextMock, "Context must not be null"), atLeast(1));
        resourceFactory.verify(() -> ResourceFactory.combine(anyList()));
        verify(documentRootMock).getValidDirectory();
        verify(staticResourceJarsMock).getUrls();
        verify(target).addDefaultServlet(contextMock);
        verify(target).addJspServlet(contextMock);
        verify(target).getWebAppContextConfigurations(contextMock, servletContextInitializerArray);
        verify(target).postProcessWebAppContext(contextMock);
    });
}*/
	}

	//Sapient generated method id: ${0a3fc127-84a1-3c7c-ab9d-17fc75c9be1b}
	@Test()
	void configureWebAppContextWhenSessionTimeoutIsNullAndIsNegativeSessionTimeoutAndGetSessionNotIsPersistentAndTempIsNull12() throws Exception {
		/* Branches:
		 * (this.resourceLoader != null) : false
		 * (StringUtils.hasLength(contextPath)) : true
		 * (root != null) : true  #  inside configureDocumentRoot method
		 * (docBase.isDirectory()) : true  #  inside configureDocumentRoot method
		 * (root != null) : true  #  inside configureDocumentRoot method
		 * (for-each(getUrlsOfJarsWithMetaInfResources())) : true  #  inside configureDocumentRoot method
		 * ("file".equals(url.getProtocol())) : true  #  inside createResource method
		 * (file.isFile()) : false  #  inside createResource method
		 * (file.isDirectory()) : true  #  inside createResource method
		 * (resource != null) : false  #  inside configureDocumentRoot method
		 * (isRegisterDefaultServlet()) : false
		 * (this.jsp != null) : true  #  inside shouldRegisterJspServlet method
		 * (this.jsp.getRegistered()) : true  #  inside shouldRegisterJspServlet method
		 * (ClassUtils.isPresent(this.jsp.getClassName(), getClass().getClassLoader())) : true  #  inside shouldRegisterJspServlet method
		 * (shouldRegisterJspServlet()) : true
		 * (sessionSameSite != null) : false  #  inside configureSession method
		 * (sessionTimeout == null) : true  #  inside isNegative method
		 * (isNegative(sessionTimeout)) : true  #  inside configureSession method
		 * (getSession().isPersistent()) : false  #  inside configureSession method
		 * (temp != null) : false  #  inside getTempDirectory method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		WebAppContext contextMock = mock(WebAppContext.class);
		ResourceFactory resourceFactoryMock = mock(ResourceFactory.class);
		Resource resourceMock = mock(Resource.class);
		Resource resourceMock2 = mock(Resource.class);
		Resource resourceMock3 = mock(Resource.class);
		SessionHandler sessionHandlerMock = mock(SessionHandler.class);
		Session sessionMock2 = mock(Session.class);
		try (MockedStatic<ResourceFactory> resourceFactory = mockStatic(ResourceFactory.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doNothing().when(contextMock).clearAliasChecks();
			doNothing().when(contextMock).setContextPath("/A");
			doNothing().when(contextMock).setDisplayName("displayName1");
			doReturn(resourceFactoryMock).when(contextMock).getResourceFactory();
			doReturn(resourceMock).when(resourceFactoryMock).newResource((URI) any());
			doReturn(resourceMock2).when(resourceFactoryMock).newResource((URL) null);
			doReturn(null).when(resourceMock2).resolve("META-INF/resources/");
			doNothing().when(contextMock).setBaseResource(resourceMock3);
			doReturn(false).when(contextMock).addBean((JasperInitializer) any(), eq(true));
			doNothing().when(contextMock).addLocaleEncoding("addLocaleMappings_locale1", "addLocaleMappings_charset1");
			Configuration[] configurationArray = new Configuration[] {};
			doNothing().when(contextMock).setConfigurations(configurationArray);
			doNothing().when(contextMock).setThrowUnavailableOnStartupException(true);
			doReturn(sessionHandlerMock).when(contextMock).getSessionHandler();
			doNothing().when(sessionHandlerMock).setMaxInactiveInterval(-1);
			doNothing().when(contextMock).setTempDirectory((File) null);
			Session.Cookie sessionCookie = new Session.Cookie();
			sessionCookie.setSameSite((Cookie.SameSite) null);
			doReturn(sessionCookie).when(sessionMock2).getCookie();
			doReturn(null).when(sessionMock2).getTimeout();
			doReturn(false).when(sessionMock2).isPersistent();
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(contextMock, "Context must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			resourceFactory.when(() -> ResourceFactory.combine(anyList())).thenReturn(resourceMock3);
			target = spy(new JettyServletWebServerFactory("/A", 0));
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setRegisterDefaultServlet(false);
			Locale locale = new Locale("language1");
			Charset charset = Charset.defaultCharset();
			Map<Locale, Charset> localeCharsetMap = new HashMap<>();
			localeCharsetMap.put(locale, charset);
			target.setLocaleCharsetMappings(localeCharsetMap);
			target.setDisplayName("displayName1");
			target.setSession(sessionMock2);
			Jsp jsp = new Jsp();
			target.setJsp(jsp);
			File file = new File("pathname1");
			doReturn(file).when(documentRootMock).getValidDirectory();
			List<URL> uRLList = new ArrayList<>();
			uRLList.add((URL) null);
			doReturn(uRLList).when(staticResourceJarsMock).getUrls();
			doNothing().when(target).addJspServlet(contextMock);
			ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] { null, null };
			doReturn(configurationArray).when(target).getWebAppContextConfigurations(contextMock, servletContextInitializerArray);
			doNothing().when(target).postProcessWebAppContext(contextMock);
			ServletContextInitializer[] servletContextInitializerArray2 = new ServletContextInitializer[] {};
			//Act Statement(s)
			target.configureWebAppContext(contextMock, servletContextInitializerArray2);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(contextMock).clearAliasChecks();
				verify(contextMock).setContextPath("/A");
				verify(contextMock).setDisplayName("displayName1");
				verify(contextMock).getResourceFactory();
				verify(resourceFactoryMock).newResource((URI) any());
				verify(resourceFactoryMock).newResource((URL) null);
				verify(resourceMock2).resolve("META-INF/resources/");
				verify(contextMock).setBaseResource(resourceMock3);
				verify(contextMock).addBean((JasperInitializer) any(), eq(true));
				verify(contextMock).addLocaleEncoding("addLocaleMappings_locale1", "addLocaleMappings_charset1");
				verify(contextMock).setConfigurations(configurationArray);
				verify(contextMock).setThrowUnavailableOnStartupException(true);
				verify(contextMock).getSessionHandler();
				verify(sessionHandlerMock).setMaxInactiveInterval(-1);
				verify(contextMock).setTempDirectory((File) null);
				verify(sessionMock2).getCookie();
				verify(sessionMock2).getTimeout();
				verify(sessionMock2).isPersistent();
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(contextMock, "Context must not be null"), atLeast(1));
				resourceFactory.verify(() -> ResourceFactory.combine(anyList()));
				verify(documentRootMock).getValidDirectory();
				verify(staticResourceJarsMock).getUrls();
				verify(target).addJspServlet(contextMock);
				verify(target).getWebAppContextConfigurations(contextMock, servletContextInitializerArray);
				verify(target).postProcessWebAppContext(contextMock);
			});
		}
	}

	//Sapient generated method id: ${2b98d577-8777-3f6d-a5e4-8375c864dc18}
	@Test()
	void addDefaultServletTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new JettyServletWebServerFactory("String", 0);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		WebAppContext webAppContext = new WebAppContext();
		//Act Statement(s)
		target.addDefaultServlet(webAppContext);
	}

	//Sapient generated method id: ${cf9995a7-99a1-3a4b-ac56-fb7f169711a4}
	@Test()
	void addJspServletTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new JettyServletWebServerFactory("String", 0);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		Map<String, String> stringStringMap = new HashMap<>();
		Jsp jsp = new Jsp();
		jsp.setInitParameters(stringStringMap);
		jsp.setClassName("A");
		target.setJsp(jsp);
		WebAppContext webAppContext = new WebAppContext();
		//Act Statement(s)
		target.addJspServlet(webAppContext);
	}

	//Sapient generated method id: ${e2641ce8-56ba-3a51-8f66-b5746824dc92}
	@Test()
	void getWebAppContextConfigurationsTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = spy(new JettyServletWebServerFactory("contextPathValue", 8080));
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		Configuration configurationMock = mock(Configuration.class);
		WebAppContext webAppContext = new WebAppContext();
		ServletContextInitializer servletContextInitializerMock = mock(ServletContextInitializer.class, "initializersValue");
		ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] { servletContextInitializerMock };
		doReturn(configurationMock).when(target).getServletContextInitializerConfiguration(webAppContext, servletContextInitializerArray);
		Collection<Configuration> collection = new ArrayList<>();
		doReturn(collection).when(target).getConfigurations();
		//Act Statement(s)
		Configuration[] result = target.getWebAppContextConfigurations(webAppContext, servletContextInitializerArray);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(target).getServletContextInitializerConfiguration(webAppContext, servletContextInitializerArray);
			verify(target).getConfigurations();
		});
	}

	//Sapient generated method id: ${65dc5db7-48ff-3d12-a696-e2098146225c}
	@Test()
	void getServletContextInitializerConfigurationTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new JettyServletWebServerFactory("String", 0);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		WebAppContext webAppContext = new WebAppContext();
		ServletContextInitializer servletContextInitializerMock = mock(ServletContextInitializer.class, "ServletContextInitializer[]");
		ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] { servletContextInitializerMock };
		//Act Statement(s)
		Configuration result = target.getServletContextInitializerConfiguration(webAppContext, servletContextInitializerArray);
		ServletContextInitializerConfiguration servletContextInitializerConfiguration = new ServletContextInitializerConfiguration(servletContextInitializerArray);
		//Assert statement(s)
		//TODO: Please implement equals method in ServletContextInitializerConfiguration for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(servletContextInitializerConfiguration)));
	}

	//Sapient generated method id: ${be9a5701-d745-3951-a4a6-a815fc1cff22}
	@Test()
	void getJettyWebServerWhenGetPortGreaterThanOrEqualsTo0() {
		/* Branches:
		 * (getPort() >= 0) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new JettyServletWebServerFactory("String contextPath", 1);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		Server server = new Server();
		//Act Statement(s)
		JettyWebServer result = target.getJettyWebServer(server);
		JettyWebServer jettyWebServer = new JettyWebServer(server, false);
		//Assert statement(s)
		//TODO: Please implement equals method in JettyWebServer for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(jettyWebServer)));
	}

	//Sapient generated method id: ${aaae6c69-0fe5-3739-abd6-1520110886e7}
	@Test()
	void getJettyWebServerWhenGetPortLessThan0() {
		/* Branches:
		 * (getPort() >= 0) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new JettyServletWebServerFactory("String contextPath", -1);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		Server server = new Server();
		//Act Statement(s)
		JettyWebServer result = target.getJettyWebServer(server);
		JettyWebServer jettyWebServer = new JettyWebServer(server, false);
		//Assert statement(s)
		//TODO: Please implement equals method in JettyWebServer for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(jettyWebServer)));
	}

	//Sapient generated method id: ${51b2282d-41b1-37d5-8131-c17098524b4c}
	@Test()
	void setServerCustomizersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(anyCollection(), eq("Customizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			target = new JettyServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			Collection<JettyServerCustomizer> collection = new ArrayList<>();
			//Act Statement(s)
			target.setServerCustomizers(collection);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("Customizers must not be null")));
			});
		}
	}

	//Sapient generated method id: ${38b96686-48ed-33c3-bcb1-99b8a4d89ecd}
	@Test()
	void getServerCustomizersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new JettyServletWebServerFactory("<value>", 0);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		//Act Statement(s)
		Collection<JettyServerCustomizer> result = target.getServerCustomizers();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${fb80e7d7-8c60-33da-8458-f1afd8ca6e38}
	@Test()
	void addServerCustomizersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		JettyServerCustomizer jettyServerCustomizerMock = mock(JettyServerCustomizer.class, "JettyServerCustomizer[] customizers");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			JettyServerCustomizer[] jettyServerCustomizerArray = new JettyServerCustomizer[] { jettyServerCustomizerMock };
			_assert.when(() -> Assert.notNull(jettyServerCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new JettyServletWebServerFactory("String contextPath", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			target.addServerCustomizers(jettyServerCustomizerArray);
			//Assert statement(s)
			assertAll("result", () -> _assert.verify(() -> Assert.notNull(jettyServerCustomizerArray, "Customizers must not be null"), atLeast(1)));
		}
	}

	//Sapient generated method id: ${4d6aab08-c060-349c-959c-fc468e27fa57}
	@Test()
	void setConfigurationsTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//target = new JettyServletWebServerFactory("String", 0);
		//autoCloseableMocks = MockitoAnnotations.openMocks(this);
		//Configuration configurationMock = mock(Configuration.class, "ArrayList");
		//Collection<Configuration> collection = new ArrayList<>();
		//collection.add(configurationMock);
		//Act Statement(s)
		//target.setConfigurations(collection);
		//Assert statement(s)
		//assertAll("result", () -> assertThat(target.getConfigurations().size(), equalTo(0)));
	}

	//Sapient generated method id: ${aa5dd863-1758-354e-b3e2-db11ab65ec64}
	@Test()
	void getConfigurationsTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new JettyServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			Collection<Configuration> result = target.getConfigurations();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${e1a3b29b-8d91-36ba-aba4-ee2b4cd388fa}
	@Test()
	void addConfigurationsTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Configuration configurationMock = mock(Configuration.class, "void");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Configuration[] configurationArray = new Configuration[] { configurationMock };
			_assert.when(() -> Assert.notNull(configurationArray, "Configurations must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new JettyServletWebServerFactory("<String value>", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			target.addConfigurations(configurationArray);
			//Assert statement(s)
			assertAll("result", () -> _assert.verify(() -> Assert.notNull(configurationArray, "Configurations must not be null"), atLeast(1)));
		}
	}
}
