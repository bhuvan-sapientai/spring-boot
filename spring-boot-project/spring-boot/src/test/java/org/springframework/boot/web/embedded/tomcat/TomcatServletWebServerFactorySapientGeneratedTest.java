package org.springframework.boot.web.embedded.tomcat;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.springframework.boot.ssl.NoSuchSslBundleException;
import org.springframework.boot.web.server.Ssl;
import org.springframework.boot.web.servlet.ServletContextInitializer;

import org.apache.coyote.UpgradeProtocol;
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

import org.apache.catalina.Context;

import org.springframework.boot.web.server.Cookie;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.core.NativeDetector;

import org.apache.catalina.core.AprLifecycleListener;

import org.springframework.boot.web.server.WebServerException;

import java.nio.file.Path;
import java.net.InetAddress;

import org.apache.catalina.util.SessionConfig;

import org.springframework.boot.web.server.WebServerSslBundle;

import org.apache.catalina.connector.Connector;

import org.springframework.boot.ssl.SslBundles;

import java.util.List;

import org.springframework.boot.web.server.MimeMappings;

import org.apache.catalina.Host;
import org.apache.catalina.Valve;
import jakarta.servlet.ServletContainerInitializer;

import java.util.Locale;

import org.apache.catalina.LifecycleListener;

import java.util.Map;

import org.springframework.boot.web.server.Http2;

import org.apache.tomcat.util.modeler.Registry;

import java.util.function.Consumer;

import org.apache.catalina.Manager;

import org.springframework.boot.util.LambdaSafe;
import org.springframework.util.ClassUtils;
import org.springframework.boot.web.servlet.server.CookieSameSiteSupplier;

import org.apache.tomcat.util.http.CookieProcessor;

import java.nio.file.Files;
import java.util.Set;

import org.apache.catalina.Container;
import org.apache.tomcat.util.descriptor.web.ErrorPage;

import java.util.Collection;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import org.springframework.boot.web.server.WebServer;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
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
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class TomcatServletWebServerFactorySapientGeneratedTest {

	private AutoCloseable autoCloseableMocks;

	@InjectMocks()
	private TomcatServletWebServerFactory target;

	@AfterEach()
	public void afterTest() throws Exception {
		if (autoCloseableMocks != null)
			autoCloseableMocks.close();
	}

	//Sapient generated method id: ${c1a72526-942f-3d80-93cc-5a34a80f7448}, hash: 575903FAF4DA0D4A9394D94B358AB82D
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
		Path pathMock = mock(Path.class);
		try (MockedStatic<Files> files = mockStatic(Files.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			FileAttribute[] fileAttributeArray = new FileAttribute[] {};
			files.when(() -> Files.createTempDirectory("tomcat.8.", fileAttributeArray)).thenReturn(pathMock);
			target = new TomcatServletWebServerFactory("/A", 8);
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
				files.verify(() -> Files.createTempDirectory("tomcat.8.", fileAttributeArray), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${9baf4896-50bb-3b94-be5c-dc01956e2a0f}, hash: B861B1E99C32AB8574ED246AE26002F6
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
		 *  Following variables could not be isolated/mocked: tomcat, object of type Service
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		TomcatWebServer tomcatWebServerMock = mock(TomcatWebServer.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
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
		}
	}

	//Sapient generated method id: ${dce270d4-440c-32bc-bbed-66b6beb1c372}, hash: 0218ADC5A3C1F645E6B0701E21E3FE98
	@Test()
	void prepareContextWhenDefaultBranchThrowsWebServerException() throws IOException {
		/* Branches:
		 * (documentRoot != null) : false
		 * (documentRoot != null) : false
		 * (branch expression (line 209)) : true  #  inside createTempDir method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: documentRoot - Method: getValidDirectory
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Path pathMock = mock(Path.class);
		Host hostMock = mock(Host.class);
		try (MockedStatic<Files> files = mockStatic(Files.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			FileAttribute[] fileAttributeArray = new FileAttribute[] {};
			files.when(() -> Files.createTempDirectory("tomcat-docbase.2.", fileAttributeArray)).thenReturn(pathMock);
			target = new TomcatServletWebServerFactory("/A", 2);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setDisplayName("displayName1");
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
			});
		}
	}

	//Sapient generated method id: ${0a29d127-e6a3-311c-b7f3-e7e957c34c86}, hash: 0056149A66E70915ACE4F5898B6BAC85
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
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Host hostMock = mock(Host.class);
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doNothing().when(hostMock).addChild((Container) any());
			_assert.when(() -> Assert.notNull("/AB", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			classUtils.when(() -> ClassUtils.forName("org.apache.jasper.servlet.JasperInitializer", null)).thenReturn(Object.class);
			target = spy(new TomcatServletWebServerFactory("/AB", 0));
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
			ServletContextInitializer[] servletContextInitializerArray2 = new ServletContextInitializer[] {};
			//Act Statement(s)
			target.prepareContext(hostMock, servletContextInitializerArray2);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(hostMock, atLeast(1)).addChild((Container) any());
				_assert.verify(() -> Assert.notNull("/AB", "ContextPath must not be null"), atLeast(1));
				classUtils.verify(() -> ClassUtils.forName("org.apache.jasper.servlet.JasperInitializer", null), atLeast(1));
				verify(target, atLeast(1)).configureContext((TomcatEmbeddedContext) any(), eq(servletContextInitializerArray));
			});
		}
	}

	//Sapient generated method id: ${8b6c2577-b039-3763-b771-75ef8306480c}, hash: CCEB7998622E61B5A9C8D892E970E635
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
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Host hostMock = mock(Host.class);
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doNothing().when(hostMock).addChild((Container) any());
			_assert.when(() -> Assert.notNull("/AB", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			classUtils.when(() -> ClassUtils.forName("org.apache.jasper.servlet.JasperInitializer", null)).thenReturn(Object.class);
			target = spy(new TomcatServletWebServerFactory("/AB", 2));
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
			ServletContextInitializer[] servletContextInitializerArray2 = new ServletContextInitializer[] {};
			//Act Statement(s)
			target.prepareContext(hostMock, servletContextInitializerArray2);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(hostMock, atLeast(1)).addChild((Container) any());
				_assert.verify(() -> Assert.notNull("/AB", "ContextPath must not be null"), atLeast(1));
				classUtils.verify(() -> ClassUtils.forName("org.apache.jasper.servlet.JasperInitializer", null), atLeast(1));
				verify(target, atLeast(1)).configureContext((TomcatEmbeddedContext) any(), eq(servletContextInitializerArray));
			});
		}
	}

	//Sapient generated method id: ${90199fca-a1eb-3548-a10e-d13eefbf1132}, hash: C461B5DBCB1F20E94D0AD72F0CF2C660
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
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Host hostMock = mock(Host.class);
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doNothing().when(hostMock).addChild((Container) any());
			_assert.when(() -> Assert.notNull("/AB", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			classUtils.when(() -> ClassUtils.forName("org.apache.jasper.servlet.JasperInitializer", null)).thenReturn(Object.class);
			target = spy(new TomcatServletWebServerFactory("/AB", 0));
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
			ServletContextInitializer[] servletContextInitializerArray2 = new ServletContextInitializer[] {};
			//Act Statement(s)
			target.prepareContext(hostMock, servletContextInitializerArray2);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(hostMock, atLeast(1)).addChild((Container) any());
				_assert.verify(() -> Assert.notNull("/AB", "ContextPath must not be null"), atLeast(1));
				classUtils.verify(() -> ClassUtils.forName("org.apache.jasper.servlet.JasperInitializer", null), atLeast(1));
				verify(target, atLeast(1)).configureContext((TomcatEmbeddedContext) any(), eq(servletContextInitializerArray));
			});
		}
	}

	//Sapient generated method id: ${6fbde551-4bd3-3487-aa97-7a9a3795da75}, hash: EEB7C6BC60C7B6563FB83AF3435BB39D
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
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Host hostMock = mock(Host.class);
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doNothing().when(hostMock).addChild((Container) any());
			_assert.when(() -> Assert.notNull("/AB", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			classUtils.when(() -> ClassUtils.forName("org.apache.jasper.servlet.JasperInitializer", null)).thenReturn(Object.class);
			target = spy(new TomcatServletWebServerFactory("/AB", 2));
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
			ServletContextInitializer[] servletContextInitializerArray2 = new ServletContextInitializer[] {};
			//Act Statement(s)
			target.prepareContext(hostMock, servletContextInitializerArray2);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(hostMock, atLeast(1)).addChild((Container) any());
				_assert.verify(() -> Assert.notNull("/AB", "ContextPath must not be null"), atLeast(1));
				classUtils.verify(() -> ClassUtils.forName("org.apache.jasper.servlet.JasperInitializer", null), atLeast(1));
				verify(target, atLeast(1)).configureContext((TomcatEmbeddedContext) any(), eq(servletContextInitializerArray));
			});
		}
	}

	//Sapient generated method id: ${5b6d3672-2dbe-375f-b82f-401ccac28e81}, hash: 3B03E1E21E415A13907558455505F824
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
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Connector connectorMock = mock(Connector.class);
		AbstractProtocol abstractProtocolMock = mock(AbstractProtocol.class);
		AbstractProtocol abstractProtocolMock2 = mock(AbstractProtocol.class);
		ProtocolHandler protocolHandlerMock = mock(ProtocolHandler.class);
		SslBundles sslBundlesMock = mock(SslBundles.class);
		LambdaSafe.Callbacks lambdaSafeCallbacksMock = mock(LambdaSafe.Callbacks.class);
		SslBundle sslBundleMock = mock(SslBundle.class);
		Compression compressionMock = mock(Compression.class);
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<WebServerSslBundle> webServerSslBundle = mockStatic(WebServerSslBundle.class);
			 MockedStatic<Ssl> ssl = mockStatic(Ssl.class);
			 MockedStatic<LambdaSafe> lambdaSafe = mockStatic(LambdaSafe.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doNothing().when(connectorMock).setPort(15922);
			doReturn(false).when(connectorMock).setProperty("server", "B");
			doNothing().when(abstractProtocolMock2).setAddress((InetAddress) any());
			doReturn(abstractProtocolMock, abstractProtocolMock2, protocolHandlerMock).when(connectorMock).getProtocolHandler();
			doNothing().when(connectorMock).setURIEncoding("UTF-8");
			doNothing().when(connectorMock).addUpgradeProtocol((UpgradeProtocol) any());
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
			target = new TomcatServletWebServerFactory("/A", 15922);
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
				verify(connectorMock).setPort(15922);
				verify(connectorMock).setProperty("server", "B");
				verify(connectorMock, times(3)).getProtocolHandler();
				verify(abstractProtocolMock2).setAddress((InetAddress) any());
				verify(connectorMock).setURIEncoding("UTF-8");
				verify(connectorMock).addUpgradeProtocol((UpgradeProtocol) any());
				verify(sslBundlesMock).addBundleUpdateHandler(eq(""), (Consumer) any());
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasText("B"), atLeast(1));
				lambdaSafe.verify(() -> LambdaSafe.callbacks(eq(TomcatProtocolHandlerCustomizer.class), anySet(), eq(protocolHandlerMock), eq(objectArray)));
				verify(lambdaSafeCallbacksMock).invoke((Consumer) any());
				ssl.verify(() -> Ssl.isEnabled(ssl2), atLeast(1));
				webServerSslBundle.verify(() -> WebServerSslBundle.get((Ssl) null, (SslBundles) null), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasText(""), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${19863dfd-e52a-39d2-85c9-43f20a4f4127}, hash: FE029191866259C7D709E25A50D6D20D
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
		 *  Following variables could not be isolated/mocked: object of type DisableReferenceClearingContextCustomizer
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Context contextMock = mock(Context.class);
		org.springframework.boot.web.server.ErrorPage errorPageMock = mock(org.springframework.boot.web.server.ErrorPage.class);
		Session sessionMock = mock(Session.class);
		MimeMappings mimeMappingsMock = mock(MimeMappings.class);
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Set<Class<?>> anySet = new HashSet<>();
			doNothing().when(contextMock).addServletContainerInitializer((ServletContainerInitializer) any(), eq(anySet));
			doNothing().when(contextMock).addErrorPage((ErrorPage) any());
			doNothing().when(contextMock).addMimeMapping("extension1", "mimeType1");
			doNothing().when(contextMock).setSessionTimeout(0);
			doNothing().when(contextMock).addLifecycleListener((LifecycleListener) any());
			doReturn("return_of_getPath1").when(errorPageMock).getPath();
			doReturn(0).when(errorPageMock).getStatusCode();
			doReturn("return_of_getExceptionName1").when(errorPageMock).getExceptionName();
			doReturn(null).when(sessionMock).getTimeout();
			Session.Cookie sessionCookie = new Session.Cookie();
			sessionCookie.setSameSite((Cookie.SameSite) null);
			sessionCookie.setHttpOnly((Boolean) null);
			doReturn(sessionCookie).when(sessionMock).getCookie();
			doReturn(false).when(sessionMock).isPersistent();
			doReturn(null).when(mimeMappingsMock).iterator();
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(true);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			Set<org.springframework.boot.web.server.ErrorPage> errorPageSet = new HashSet<>();
			errorPageSet.add(errorPageMock);
			target.setErrorPages(errorPageSet);
			target.setSession(sessionMock);
			List<CookieSameSiteSupplier> cookieSameSiteSupplierList = new ArrayList<>();
			target.setCookieSameSiteSuppliers(cookieSameSiteSupplierList);
			target.setMimeMappings(mimeMappingsMock);
			ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
			//Act Statement(s)
			target.configureContext(contextMock, servletContextInitializerArray);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(contextMock).addServletContainerInitializer((ServletContainerInitializer) any(), eq(anySet));
				verify(contextMock).addErrorPage((ErrorPage) any());
				verify(contextMock).addMimeMapping("extension1", "mimeType1");
				verify(contextMock).setSessionTimeout(0);
				verify(contextMock).addLifecycleListener((LifecycleListener) any());
				verify(errorPageMock).getPath();
				verify(errorPageMock).getStatusCode();
				verify(errorPageMock).getExceptionName();
				verify(sessionMock).getTimeout();
				verify(sessionMock, times(2)).getCookie();
				verify(sessionMock).isPersistent();
				verify(mimeMappingsMock).iterator();
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()));
			});
		}
	}

	//Sapient generated method id: ${45969add-fd40-3931-baab-968155eab013}, hash: 8FAB228E1A715C074056EBF0E9F3DE36
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
		 *  Following variables could not be isolated/mocked: object of type DisableReferenceClearingContextCustomizer
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		TomcatEmbeddedContext embeddedContextMock = mock(TomcatEmbeddedContext.class);
		MimeMappings mimeMappingsMock = mock(MimeMappings.class);
		org.springframework.boot.web.server.ErrorPage errorPageMock = mock(org.springframework.boot.web.server.ErrorPage.class);
		Session sessionMock = mock(Session.class);
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doNothing().when(embeddedContextMock).setStarter((TomcatStarter) any());
			doNothing().when(embeddedContextMock).setFailCtxIfServletStartFails(true);
			Set<Class<?>> anySet = new HashSet<>();
			doNothing().when(embeddedContextMock).addServletContainerInitializer((ServletContainerInitializer) any(), eq(anySet));
			doNothing().when(embeddedContextMock).addErrorPage((ErrorPage) any());
			doNothing().when(embeddedContextMock).setMimeMappings(mimeMappingsMock);
			doNothing().when(embeddedContextMock).setSessionTimeout(1143);
			doNothing().when(embeddedContextMock).addLifecycleListener((LifecycleListener) any());
			doReturn("return_of_getPath1").when(errorPageMock).getPath();
			doReturn(0).when(errorPageMock).getStatusCode();
			doReturn("return_of_getExceptionName1").when(errorPageMock).getExceptionName();
			Duration duration = Duration.ofDays(0L);
			doReturn(duration).when(sessionMock).getTimeout();
			Session.Cookie sessionCookie = new Session.Cookie();
			sessionCookie.setSameSite((Cookie.SameSite) null);
			sessionCookie.setHttpOnly((Boolean) null);
			doReturn(sessionCookie).when(sessionMock).getCookie();
			doReturn(false).when(sessionMock).isPersistent();
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(true);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			Set<org.springframework.boot.web.server.ErrorPage> errorPageSet = new HashSet<>();
			errorPageSet.add(errorPageMock);
			target.setErrorPages(errorPageSet);
			target.setSession(sessionMock);
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
				verify(embeddedContextMock).addServletContainerInitializer((ServletContainerInitializer) any(), eq(anySet));
				verify(embeddedContextMock).addErrorPage((ErrorPage) any());
				verify(embeddedContextMock).setMimeMappings(mimeMappingsMock);
				verify(embeddedContextMock).setSessionTimeout(1143);
				verify(embeddedContextMock).addLifecycleListener((LifecycleListener) any());
				verify(errorPageMock).getPath();
				verify(errorPageMock).getStatusCode();
				verify(errorPageMock).getExceptionName();
				verify(sessionMock).getTimeout();
				verify(sessionMock, times(2)).getCookie();
				verify(sessionMock).isPersistent();
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()));
			});
		}
	}

	//Sapient generated method id: ${9da23027-c7d7-3ad9-a9f5-329cf0a82afd}, hash: 275F0AB8F564BCA8D0BD44FFB7BEDD67
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
		 * (getSession().isPersistent()) : true  #  inside configureSession method
		 * (manager == null) : true  #  inside configureSession method
		 * (sessionSameSite != null) : true  #  inside configureCookieProcessor method
		 * (!CollectionUtils.isEmpty(getCookieSameSiteSuppliers())) : true  #  inside configureCookieProcessor method
		 * (!suppliers.isEmpty()) : true  #  inside configureCookieProcessor method
		 * (for-each(getWebListenerClassNames())) : false
		 * (for-each(this.tomcatContextCustomizers)) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type DisableReferenceClearingContextCustomizer
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		TomcatEmbeddedContext embeddedContextMock = mock(TomcatEmbeddedContext.class);
		MimeMappings mimeMappingsMock = mock(MimeMappings.class);
		org.springframework.boot.web.server.ErrorPage errorPageMock = mock(org.springframework.boot.web.server.ErrorPage.class);
		Session sessionMock = mock(Session.class);
		CookieSameSiteSupplier cookieSameSiteSupplierMock = mock(CookieSameSiteSupplier.class);
		CookieSameSiteSupplier cookieSameSiteSupplierMock2 = mock(CookieSameSiteSupplier.class);
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class);
			 MockedStatic<SessionConfig> sessionConfig = mockStatic(SessionConfig.class);
			 MockedStatic<CookieSameSiteSupplier> cookieSameSiteSupplier = mockStatic(CookieSameSiteSupplier.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doNothing().when(embeddedContextMock).setStarter((TomcatStarter) any());
			doNothing().when(embeddedContextMock).setFailCtxIfServletStartFails(true);
			Set<Class<?>> anySet = new HashSet<>();
			doNothing().when(embeddedContextMock).addServletContainerInitializer((ServletContainerInitializer) any(), eq(anySet));
			doNothing().when(embeddedContextMock).addErrorPage((ErrorPage) any());
			doNothing().when(embeddedContextMock).setMimeMappings(mimeMappingsMock);
			doNothing().when(embeddedContextMock).setSessionTimeout(0);
			doNothing().when(embeddedContextMock).setUseHttpOnly(false);
			doReturn(null).when(embeddedContextMock).getManager();
			doNothing().when(embeddedContextMock).setManager((Manager) any());
			doNothing().when(embeddedContextMock).setCookieProcessor((CookieProcessor) any());
			doReturn("return_of_getPath1").when(errorPageMock).getPath();
			doReturn(0).when(errorPageMock).getStatusCode();
			doReturn("return_of_getExceptionName1").when(errorPageMock).getExceptionName();
			Duration duration = Duration.ofDays(0L);
			doReturn(duration).when(sessionMock).getTimeout();
			Session.Cookie sessionCookie = new Session.Cookie();
			sessionCookie.setSameSite(Cookie.SameSite.NONE);
			sessionCookie.setHttpOnly(false);
			doReturn(sessionCookie).when(sessionMock).getCookie();
			doReturn(true).when(sessionMock).isPersistent();
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			cookieSameSiteSupplier.when(() -> CookieSameSiteSupplier.of(Cookie.SameSite.NONE)).thenReturn(cookieSameSiteSupplierMock);
			doReturn(cookieSameSiteSupplierMock2).when(cookieSameSiteSupplierMock).whenHasName((Supplier) any());
			sessionConfig.when(() -> SessionConfig.getSessionCookieName(embeddedContextMock)).thenReturn("return_of_getSessionCookieName1");
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
			ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
			//Act Statement(s)
			target.configureContext(embeddedContextMock, servletContextInitializerArray);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(embeddedContextMock).setStarter((TomcatStarter) any());
				verify(embeddedContextMock).setFailCtxIfServletStartFails(true);
				verify(embeddedContextMock).addServletContainerInitializer((ServletContainerInitializer) any(), eq(anySet));
				verify(embeddedContextMock).addErrorPage((ErrorPage) any());
				verify(embeddedContextMock).setMimeMappings(mimeMappingsMock);
				verify(embeddedContextMock).setSessionTimeout(0);
				verify(embeddedContextMock).setUseHttpOnly(false);
				verify(embeddedContextMock).getManager();
				verify(embeddedContextMock).setManager((Manager) any());
				verify(embeddedContextMock).setCookieProcessor((CookieProcessor) any());
				verify(errorPageMock).getPath();
				verify(errorPageMock).getStatusCode();
				verify(errorPageMock).getExceptionName();
				verify(sessionMock).getTimeout();
				verify(sessionMock, times(2)).getCookie();
				verify(sessionMock).isPersistent();
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				cookieSameSiteSupplier.verify(() -> CookieSameSiteSupplier.of(Cookie.SameSite.NONE), atLeast(1));
				verify(cookieSameSiteSupplierMock).whenHasName((Supplier) any());
				sessionConfig.verify(() -> SessionConfig.getSessionCookieName(embeddedContextMock), atLeast(1));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()));
			});
		}
	}

	//Sapient generated method id: ${07c018c2-3548-3b89-991f-85e6461c7e49}, hash: 0BB461853991AB69F8873ED1DB0D9B07
	@Test()
	void getTomcatWebServerWhenGetPortGreaterThanOrEqualsTo0() {
		/* Branches:
		 * (getPort() >= 0) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.web.embedded.tomcat.TomcatWebServer
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
			//Assert statement(s)
			//TODO: Please implement equals method in TomcatWebServer for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3f703060-a8a3-393a-86b3-2a617ab6466f}, hash: D8AB0FA4AFA14A255B4DDB0CA4BD303B
	@Test()
	void getTomcatWebServerWhenGetPortLessThan0() {
		/* Branches:
		 * (getPort() >= 0) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.web.embedded.tomcat.TomcatWebServer
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Tomcat tomcatMock = mock(Tomcat.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("/A", -1);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setShutdown(Shutdown.GRACEFUL);
			//Act Statement(s)
			TomcatWebServer result = target.getTomcatWebServer(tomcatMock);
			//Assert statement(s)
			//TODO: Please implement equals method in TomcatWebServer for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${7181e6a7-21d3-39b9-90e1-b9e56c93cf08}, hash: B39049E9596C8CA88CF3EEC22F28B211
	@Test()
	void setTldSkipPatternsTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(anyCollection(), eq("Patterns must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			Collection<String> collection = new ArrayList<>();
			//Act Statement(s)
			target.setTldSkipPatterns(collection);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(target.getTldSkipPatterns().size(), equalTo(0));
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("Patterns must not be null")));
			});
		}
	}

	//Sapient generated method id: ${0a73f729-f6c2-36bd-bebf-fc9620a4f1c4}, hash: 9259F21FEFEE6CFAAD87F652BC2A23BA
	@Test()
	void addTldSkipPatternsTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] {};
			_assert.when(() -> Assert.notNull(stringArray, "Patterns must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			target.addTldSkipPatterns(stringArray);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(stringArray, "Patterns must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4d70a7b9-b9fe-3bbd-aff1-983b38a71746}, hash: EF64484A708E6BF481E77BDF593C4333
	@Test()
	void setProtocolTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.hasLength("B", "Protocol must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			target.setProtocol("B");
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				_assert.verify(() -> Assert.hasLength("B", "Protocol must not be empty"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${5e66cf38-a31f-3628-acbe-623df08a1c5a}, hash: 5972A409EC841338069EF60EB178C7A9
	@Test()
	void setEngineValvesTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(anyCollection(), eq("Valves must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			Collection<Valve> collection = new ArrayList<>();
			//Act Statement(s)
			target.setEngineValves(collection);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(target.getEngineValves().size(), equalTo(0));
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("Valves must not be null")));
			});
		}
	}

	//Sapient generated method id: ${30071bc8-1461-356d-8d6a-fe6078d7d479}, hash: BF09052FE49C2B5C27BEC23C123D02EA
	@Test()
	void getEngineValvesTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			Collection<Valve> result = target.getEngineValves();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${42e0e1e1-45ce-39d8-9e1e-add87f3b4a1a}, hash: 39A72F3F5F035840746EEFDA8DE1E7CD
	@Test()
	void addEngineValvesTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Valve[] valveArray = new Valve[] {};
			_assert.when(() -> Assert.notNull(valveArray, "Valves must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			target.addEngineValves(valveArray);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(valveArray, "Valves must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${0495f86a-ac08-3a57-af45-ddc1b2d064ee}, hash: 8D1625B45568C73514BD2E9A9872B64C
	@Test()
	void setContextValvesTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(anyCollection(), eq("Valves must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			Collection<Valve> collection = new ArrayList<>();
			//Act Statement(s)
			target.setContextValves(collection);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(target.getContextValves().size(), equalTo(0));
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("Valves must not be null")));
			});
		}
	}

	//Sapient generated method id: ${18a8990e-3118-3f96-8306-680e71015019}, hash: D56A505B99A9EDAD3684EC03AC947908
	@Test()
	void getContextValvesTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			Collection<Valve> result = target.getContextValves();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${6164b211-d9d8-300b-b8b1-1a4650afeaf2}, hash: 46D600075F2AA69F4D50DECDB21499C9
	@Test()
	void addContextValvesTest() {
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

	//Sapient generated method id: ${921e6eaf-6f32-30de-97f5-3a46862bfd91}, hash: 59673237EBAE9570080A738A7563E3DB
	@Test()
	void setContextLifecycleListenersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(anyCollection(), eq("ContextLifecycleListeners must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			Collection<LifecycleListener> collection = new ArrayList<>();
			//Act Statement(s)
			target.setContextLifecycleListeners(collection);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(target.getContextLifecycleListeners().size(), equalTo(0));
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("ContextLifecycleListeners must not be null")));
			});
		}
	}

	//Sapient generated method id: ${92c0ae61-fb76-3c2f-b1e1-9c4eba8b0e50}, hash: 56F6A022800A70822DCC74DE0FED6FE9
	@Test()
	void getContextLifecycleListenersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			Collection<LifecycleListener> result = target.getContextLifecycleListeners();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${9ce813a1-1418-3a65-898c-1e03d7aacfe5}, hash: 440636C9CCBCE01B64592B40A66917F7
	@Test()
	void addContextLifecycleListenersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			LifecycleListener[] lifecycleListenerArray = new LifecycleListener[] {};
			_assert.when(() -> Assert.notNull(lifecycleListenerArray, "ContextLifecycleListeners must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			target.addContextLifecycleListeners(lifecycleListenerArray);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(lifecycleListenerArray, "ContextLifecycleListeners must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${b2cd4d4f-d42b-3388-a4f2-58fb4455cd17}, hash: 4D01061B329B2ABB4DD2A83955E3D161
	@Test()
	void setTomcatContextCustomizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(anyCollection(), eq("TomcatContextCustomizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			Collection<TomcatContextCustomizer> collection = new ArrayList<>();
			//Act Statement(s)
			target.setTomcatContextCustomizers(collection);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(target.getTomcatContextCustomizers().size(), equalTo(0));
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("TomcatContextCustomizers must not be null")));
			});
		}
	}

	//Sapient generated method id: ${8ad725ee-fdd0-3d07-a671-0aed8550e136}, hash: F757C49A78F49BBE5CBECFF434C32AE1
	@Test()
	void getTomcatContextCustomizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			Collection<TomcatContextCustomizer> result = target.getTomcatContextCustomizers();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${cbc8a1a7-d28d-3ed3-ab9c-4ea016ec6658}, hash: 08EFF0B689F735CED88466B3FB63625F
	@Test()
	void addContextCustomizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			TomcatContextCustomizer[] tomcatContextCustomizerArray = new TomcatContextCustomizer[] {};
			_assert.when(() -> Assert.notNull(tomcatContextCustomizerArray, "TomcatContextCustomizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			target.addContextCustomizers(tomcatContextCustomizerArray);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(tomcatContextCustomizerArray, "TomcatContextCustomizers must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f42a71db-573a-397f-85b9-68c14c1b08ad}, hash: B562D79CE58D8076CDA888CD60B01300
	@Test()
	void setTomcatConnectorCustomizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(anyCollection(), eq("TomcatConnectorCustomizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			Collection<TomcatConnectorCustomizer> collection = new ArrayList<>();
			//Act Statement(s)
			target.setTomcatConnectorCustomizers(collection);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(target.getTomcatConnectorCustomizers().size(), equalTo(0));
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("TomcatConnectorCustomizers must not be null")));
			});
		}
	}

	//Sapient generated method id: ${e1efcda9-bb1e-37b7-a119-50190c1fc73c}, hash: 737A707BB1BF2FD1CA516233E67B922C
	@Test()
	void addConnectorCustomizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			TomcatConnectorCustomizer[] tomcatConnectorCustomizerArray = new TomcatConnectorCustomizer[] {};
			_assert.when(() -> Assert.notNull(tomcatConnectorCustomizerArray, "TomcatConnectorCustomizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			target.addConnectorCustomizers(tomcatConnectorCustomizerArray);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(tomcatConnectorCustomizerArray, "TomcatConnectorCustomizers must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${ece5ea10-055f-3c4c-a2d8-d97b44fb4384}, hash: CFCDFED4062CAC6DAFDC3AEF8924A19D
	@Test()
	void getTomcatConnectorCustomizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			Collection<TomcatConnectorCustomizer> result = target.getTomcatConnectorCustomizers();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3a1a4f82-774e-3e1e-8590-b6957ff65a9c}, hash: 14745FC7A32CB2FC56D41BDF361CC55B
	@Test()
	void setTomcatProtocolHandlerCustomizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(anyCollection(), eq("TomcatProtocolHandlerCustomizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			Collection<TomcatProtocolHandlerCustomizer<?>> collection = new ArrayList<>();
			//Act Statement(s)
			target.setTomcatProtocolHandlerCustomizers(collection);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(target.getTomcatProtocolHandlerCustomizers().size(), equalTo(0));
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("TomcatProtocolHandlerCustomizers must not be null")));
			});
		}
	}

	//Sapient generated method id: ${499866e0-8eaa-3a92-b67a-28ca9a0ff5c7}, hash: 2A46603AB23A78E1A82EA09C90A6632C
	@Test()
	void addProtocolHandlerCustomizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			TomcatProtocolHandlerCustomizer<?>[] tomcatProtocolHandlerCustomizerArray = new TomcatProtocolHandlerCustomizer[] {};
			_assert.when(() -> Assert.notNull(tomcatProtocolHandlerCustomizerArray, "TomcatProtocolHandlerCustomizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			target.addProtocolHandlerCustomizers(tomcatProtocolHandlerCustomizerArray);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(tomcatProtocolHandlerCustomizerArray, "TomcatProtocolHandlerCustomizers must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a5cc98af-7bbd-34f8-b2b4-20d97f391e93}, hash: 9F761F7AFDB17142598DFCE38D4F1C0D
	@Test()
	void getTomcatProtocolHandlerCustomizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			Collection<TomcatProtocolHandlerCustomizer<?>> result = target.getTomcatProtocolHandlerCustomizers();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${bf0c9144-dac8-32a4-aef9-a001c90769f7}, hash: BB64AC3C35D1C597EF32761EED1AFDCB
	@Test()
	void addAdditionalTomcatConnectorsTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Connector[] connectorArray = new Connector[] {};
			_assert.when(() -> Assert.notNull(connectorArray, "Connectors must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new TomcatServletWebServerFactory("/A", 0);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			target.addAdditionalTomcatConnectors(connectorArray);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(connectorArray, "Connectors must not be null"), atLeast(1));
			});
		}
	}
}
