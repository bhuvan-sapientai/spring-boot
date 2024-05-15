package org.springframework.boot.web.embedded.undertow;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.net.URISyntaxException;
import io.undertow.servlet.api.SessionPersistenceManager;
import io.undertow.servlet.core.DeploymentImpl;
import io.undertow.servlet.api.MimeMapping;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.mockito.MockitoAnnotations;
import org.springframework.util.CollectionUtils;
import org.springframework.util.Assert;
import org.springframework.boot.web.server.MimeMappings;
import java.util.HashSet;
import java.time.Duration;
import java.util.HashMap;
import io.undertow.Undertow;
import java.nio.charset.Charset;
import java.util.ArrayList;
import io.undertow.server.session.SessionManager;
import org.springframework.boot.web.server.ErrorPage;
import org.mockito.stubbing.Answer;
import io.undertow.servlet.api.ServletInfo;
import org.springframework.boot.web.server.Cookie;
import org.springframework.boot.web.servlet.server.Session;
import java.util.Iterator;
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
import org.springframework.http.HttpStatus;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import io.undertow.servlet.api.ServletStackTraces;
import org.springframework.boot.web.servlet.server.CookieSameSiteSupplier;
import java.util.Set;
import java.util.Collection;
import org.mockito.MockedStatic;
import org.springframework.boot.web.server.WebServer;
import io.undertow.server.handlers.resource.ResourceManager;
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
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.atLeast;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UndertowServletWebServerFactorySapientGeneratedTest {

    private final UndertowWebServerFactoryDelegate delegateMock = mock(UndertowWebServerFactoryDelegate.class, "delegate");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private UndertowServletWebServerFactory target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${setBuilderCustomizersTest}, hash: 7EA2F03DF7293499863544547AD1C7DB
    @Test()
    void setBuilderCustomizersTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: setBuilderCustomizers
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            target = new UndertowServletWebServerFactory("/A", 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Collection<UndertowBuilderCustomizer> collection = new ArrayList<>();
            //Act Statement(s)
            target.setBuilderCustomizers(collection);
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${addBuilderCustomizersTest}, hash: 46479C86A104043F613730F0336E3631
    @Test()
    void addBuilderCustomizersTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: addBuilderCustomizers
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            target = new UndertowServletWebServerFactory("/A", 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            UndertowBuilderCustomizer[] undertowBuilderCustomizerArray = new UndertowBuilderCustomizer[] {};
            //Act Statement(s)
            target.addBuilderCustomizers(undertowBuilderCustomizerArray);
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${getBuilderCustomizersTest}, hash: D1AF35B3E6992500C200F028481D43A5
    @Test()
    void getBuilderCustomizersTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: getBuilderCustomizers
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            target = new UndertowServletWebServerFactory("/A", 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            Collection<UndertowBuilderCustomizer> result = target.getBuilderCustomizers();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${setBufferSizeTest}, hash: F976E264560A40B84A32C442F7AB3406
    @Test()
    void setBufferSizeTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: setBufferSize
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        target = new UndertowServletWebServerFactory("/example", 8080);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        target.setBufferSize(1024);
    }

    //Sapient generated method id: ${setIoThreadsTest}, hash: 549B060232616784DDFEFD11661B2CFE
    @Test()
    void setIoThreadsTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: setIoThreads
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        target = new UndertowServletWebServerFactory("/example", 8080);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        target.setIoThreads(4);
    }

    //Sapient generated method id: ${setWorkerThreadsTest}, hash: F2D423BF1443CD6D35D5D472FCF105CD
    @Test()
    void setWorkerThreadsTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: setWorkerThreads
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        target = new UndertowServletWebServerFactory("/example", 8080);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        target.setWorkerThreads(10);
    }

    //Sapient generated method id: ${setUseDirectBuffersTest}, hash: DFC76FABF7E723AF426926BF695370A7
    @Disabled()
    @Test()
    void setUseDirectBuffersTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        target = new UndertowServletWebServerFactory("example", 8080);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(delegateMock).setUseDirectBuffers(true);
        //Act Statement(s)
        target.setUseDirectBuffers(true);
        //Assert statement(s)
        assertAll("result", () -> verify(delegateMock).setUseDirectBuffers(true));
    }

    //Sapient generated method id: ${setAccessLogDirectoryTest}, hash: F8EC3EF6A8A0441FFA06A2821C570B6D
    @Test()
    void setAccessLogDirectoryTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: setAccessLogDirectory
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            target = new UndertowServletWebServerFactory("/A", 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            File file = new File("pathname1");
            //Act Statement(s)
            target.setAccessLogDirectory(file);
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${setAccessLogPatternTest}, hash: 4743E743C718460B38A2B89DFEA1B0A0
    @Disabled()
    @Test()
    void setAccessLogPatternTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        target = new UndertowServletWebServerFactory("<value>", 0);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(delegateMock).setAccessLogPattern("<value>");
        //Act Statement(s)
        target.setAccessLogPattern("<value>");
        //Assert statement(s)
        assertAll("result", () -> verify(delegateMock).setAccessLogPattern("<value>"));
    }

    //Sapient generated method id: ${setAccessLogPrefixTest}, hash: 34512E592F7FA3C6675BB0093ADEE8FD
    @Disabled()
    @Test()
    void setAccessLogPrefixTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        target = new UndertowServletWebServerFactory("<value>", 0);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(delegateMock).setAccessLogPrefix("<value>");
        //Act Statement(s)
        target.setAccessLogPrefix("<value>");
        //Assert statement(s)
        assertAll("result", () -> verify(delegateMock).setAccessLogPrefix("<value>"));
    }

    //Sapient generated method id: ${getAccessLogPrefixTest}, hash: D750AF2D845114288AEEED4FD8141F27
    @Disabled()
    @Test()
    void getAccessLogPrefixTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: getAccessLogPrefix
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            target = new UndertowServletWebServerFactory("/A", 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            String result = target.getAccessLogPrefix();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getAccessLogPrefix1"));
                _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${setAccessLogSuffixTest}, hash: F2C4E9B818EF506E698A38C9D7721C5C
    @Disabled()
    @Test()
    void setAccessLogSuffixTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        target = new UndertowServletWebServerFactory("<value>", 0);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(delegateMock).setAccessLogSuffix("<value>");
        //Act Statement(s)
        target.setAccessLogSuffix("<value>");
        //Assert statement(s)
        assertAll("result", () -> verify(delegateMock).setAccessLogSuffix("<value>"));
    }

    //Sapient generated method id: ${setAccessLogEnabledTest}, hash: AE5BCDD6E39FB212C71C3FEC4E169182
    @Disabled()
    @Test()
    void setAccessLogEnabledTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        target = new UndertowServletWebServerFactory("<value>", 0);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(delegateMock).setAccessLogEnabled(true);
        //Act Statement(s)
        target.setAccessLogEnabled(true);
        //Assert statement(s)
        assertAll("result", () -> verify(delegateMock).setAccessLogEnabled(true));
    }

    //Sapient generated method id: ${isAccessLogEnabledWhenThisDelegateIsAccessLogEnabled}, hash: 08FE9DE579F88F02285F767AEA570A12
    @Disabled()
    @Test()
    void isAccessLogEnabledWhenThisDelegateIsAccessLogEnabled() {
        /* Branches:
         * (this.delegate.isAccessLogEnabled()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: isAccessLogEnabled
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            target = new UndertowServletWebServerFactory("/A", 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.isAccessLogEnabled();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isAccessLogEnabledWhenThisDelegateNotIsAccessLogEnabled}, hash: 7DD1182FFFB5816F98C7964ABF3216CD
    @Test()
    void isAccessLogEnabledWhenThisDelegateNotIsAccessLogEnabled() {
        /* Branches:
         * (this.delegate.isAccessLogEnabled()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: isAccessLogEnabled
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            target = new UndertowServletWebServerFactory("/A", 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.isAccessLogEnabled();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${setAccessLogRotateTest}, hash: E497B14B35DB7CC4E8045DCB3C5A0CC9
    @Disabled()
    @Test()
    void setAccessLogRotateTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        target = new UndertowServletWebServerFactory("<value>", 0);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(delegateMock).setAccessLogRotate(true);
        //Act Statement(s)
        target.setAccessLogRotate(true);
        //Assert statement(s)
        assertAll("result", () -> verify(delegateMock).setAccessLogRotate(true));
    }

    //Sapient generated method id: ${setUseForwardHeadersTest}, hash: 5566883D0DEDA924D275C99E0C7B011F
    @Disabled()
    @Test()
    void setUseForwardHeadersTest() {
        /*
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

    //Sapient generated method id: ${isUseForwardHeadersWhenThisDelegateIsUseForwardHeaders}, hash: 9C1A87050854F23DCB430BBBD89F1959
    @Disabled()
    @Test()
    void isUseForwardHeadersWhenThisDelegateIsUseForwardHeaders() {
        /* Branches:
         * (this.delegate.isUseForwardHeaders()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: isUseForwardHeaders
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            target = new UndertowServletWebServerFactory("/A", 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.isUseForwardHeaders();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isUseForwardHeadersWhenThisDelegateNotIsUseForwardHeaders}, hash: 5AB86B8B706A615BAC5F3BF12F1BE34F
    @Test()
    void isUseForwardHeadersWhenThisDelegateNotIsUseForwardHeaders() {
        /* Branches:
         * (this.delegate.isUseForwardHeaders()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: isUseForwardHeaders
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            target = new UndertowServletWebServerFactory("/A", 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            boolean result = target.isUseForwardHeaders();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${setDeploymentInfoCustomizersTest}, hash: AEDC303FE822126FC21D14C046757056
    @Test()
    void setDeploymentInfoCustomizersTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(anyCollection(), eq("Customizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            target = new UndertowServletWebServerFactory("/A", 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Collection<UndertowDeploymentInfoCustomizer> collection = new ArrayList<>();
            //Act Statement(s)
            target.setDeploymentInfoCustomizers(collection);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(target.getDeploymentInfoCustomizers().size(), equalTo(0));
                _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(anyCollection(), eq("Customizers must not be null")));
            });
        }
    }

    //Sapient generated method id: ${addDeploymentInfoCustomizersTest}, hash: 8E6A828C264BA9F14FDD64A632BF2B11
    @Test()
    void addDeploymentInfoCustomizersTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray = new UndertowDeploymentInfoCustomizer[] {};
            _assert.when(() -> Assert.notNull(undertowDeploymentInfoCustomizerArray, "UndertowDeploymentInfoCustomizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            target = new UndertowServletWebServerFactory("/A", 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(undertowDeploymentInfoCustomizerArray, "UndertowDeploymentInfoCustomizers must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getDeploymentInfoCustomizersTest}, hash: 463B82236437E5D51113EE766AC8B9ED
    @Test()
    void getDeploymentInfoCustomizersTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            target = new UndertowServletWebServerFactory("/A", 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            Collection<UndertowDeploymentInfoCustomizer> result = target.getDeploymentInfoCustomizers();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getWebServerWhenDocBaseIsNullAndCaughtIOExceptionThrowsIllegalStateException}, hash: 00CAB68DB627209C709C6385E791F64B
    @Disabled()
    @Test()
    void getWebServerWhenDocBaseIsNullAndCaughtIOExceptionThrowsIllegalStateException() throws IOException {
        /* Branches:
         * (this.resourceLoader != null) : false  #  inside getServletClassLoader method
         * (isRegisterDefaultServlet()) : true  #  inside createManager method
         * (for-each(getErrorPages())) : true  #  inside configureErrorPages method
         * (errorPage.getStatus() != null) : false  #  inside getUndertowErrorPage method
         * (errorPage.getException() != null) : false  #  inside getUndertowErrorPage method
         * (docBase != null) : false  #  inside getCanonicalDocumentRoot method
         * (catch-exception (IOException)) : true  #  inside getCanonicalDocumentRoot method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: createBuilder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ErrorPage errorPageMock = mock(ErrorPage.class);
        DeploymentInfo deploymentInfoMock = mock(DeploymentInfo.class);
        DeploymentInfo deploymentInfoMock2 = mock(DeploymentInfo.class);
        DeploymentInfo deploymentInfoMock3 = mock(DeploymentInfo.class);
        DeploymentInfo deploymentInfoMock4 = mock(DeploymentInfo.class);
        DeploymentInfo deploymentInfoMock5 = mock(DeploymentInfo.class);
        try (MockedStatic<Servlets> servlets = mockStatic(Servlets.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(null).when(errorPageMock).getStatus();
            doReturn(null).when(errorPageMock).getException();
            doReturn("return_of_getPath1").when(errorPageMock).getPath();
            _assert.when(() -> Assert.notNull("/AB", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            servlets.when(() -> Servlets.deployment()).thenReturn(deploymentInfoMock);
            doReturn(deploymentInfoMock2).when(deploymentInfoMock).addServletContainerInitializer((ServletContainerInitializerInfo) any());
            ClassLoader classLoader = UndertowServletWebServerFactory.class.getClassLoader();
            DeploymentInfo deploymentInfo = deploymentInfoMock.setClassLoader(classLoader);
            doReturn(deploymentInfo).when(deploymentInfoMock).setClassLoader((ClassLoader) any());
            doReturn(deploymentInfoMock3).when(deploymentInfoMock).setContextPath("/AB");
            doReturn(deploymentInfoMock4).when(deploymentInfoMock).setDisplayName("displayName1");
            DeploymentInfo deploymentInfo2 = deploymentInfoMock.setDeploymentName("spring-boot");
            doReturn(deploymentInfo2).when(deploymentInfoMock).setDeploymentName("spring-boot");
            ServletInfo servletInfo = Servlets.servlet("default", DefaultServlet.class);
            DeploymentInfo deploymentInfo3 = deploymentInfoMock.addServlet(servletInfo);
            doReturn(deploymentInfo3).when(deploymentInfoMock).addServlet((ServletInfo) any());
            doReturn(deploymentInfoMock5).when(deploymentInfoMock).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
            DeploymentInfo deploymentInfo4 = deploymentInfoMock.setServletStackTraces(ServletStackTraces.NONE);
            doReturn(deploymentInfo4).when(deploymentInfoMock).setServletStackTraces(ServletStackTraces.NONE);
            target = new UndertowServletWebServerFactory("/AB", 8);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            target.setRegisterDefaultServlet(true);
            target.setDisplayName("displayName1");
            Set<ErrorPage> errorPageSet = new HashSet<>();
            errorPageSet.add(errorPageMock);
            target.setErrorPages(errorPageSet);
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
                _assert.verify(() -> Assert.notNull("/AB", "ContextPath must not be null"), atLeast(1));
                servlets.verify(() -> Servlets.deployment(), atLeast(1));
                verify(deploymentInfoMock, atLeast(1)).addServletContainerInitializer((ServletContainerInitializerInfo) any());
                verify(deploymentInfoMock, atLeast(1)).setClassLoader((ClassLoader) any());
                verify(deploymentInfoMock, atLeast(1)).setContextPath("/AB");
                verify(deploymentInfoMock, atLeast(1)).setDisplayName("displayName1");
                verify(deploymentInfoMock, atLeast(1)).setDeploymentName("spring-boot");
                verify(deploymentInfoMock, atLeast(1)).addServlet((ServletInfo) any());
                verify(deploymentInfoMock, atLeast(1)).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
                verify(deploymentInfoMock, atLeast(1)).setServletStackTraces(ServletStackTraces.NONE);
            });
        }
    }

    //Sapient generated method id: ${getWebServerWhenCaughtExceptionThrowsRuntimeException}, hash: 90C0D8F8E146F868C0C291B6D14A0F65
    @Disabled()
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
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: createBuilder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ErrorPage errorPageMock = mock(ErrorPage.class);
        DeploymentInfo deploymentInfoMock = mock(DeploymentInfo.class);
        DeploymentInfo deploymentInfoMock2 = mock(DeploymentInfo.class);
        DeploymentInfo deploymentInfoMock3 = mock(DeploymentInfo.class);
        DeploymentInfo deploymentInfoMock4 = mock(DeploymentInfo.class);
        DeploymentInfo deploymentInfoMock5 = mock(DeploymentInfo.class);
        try (MockedStatic<Servlets> servlets = mockStatic(Servlets.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(null).when(errorPageMock).getStatus();
            doReturn(null).when(errorPageMock).getException();
            doReturn("return_of_getPath1").when(errorPageMock).getPath();
            _assert.when(() -> Assert.notNull("/AB", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            servlets.when(() -> Servlets.deployment()).thenReturn(deploymentInfoMock);
            doReturn(deploymentInfoMock2).when(deploymentInfoMock).addServletContainerInitializer((ServletContainerInitializerInfo) any());
            ClassLoader classLoader = UndertowServletWebServerFactory.class.getClassLoader();
            DeploymentInfo deploymentInfo = deploymentInfoMock.setClassLoader(classLoader);
            doReturn(deploymentInfo).when(deploymentInfoMock).setClassLoader((ClassLoader) any());
            doReturn(deploymentInfoMock3).when(deploymentInfoMock).setContextPath("/AB");
            doReturn(deploymentInfoMock4).when(deploymentInfoMock).setDisplayName("displayName1");
            DeploymentInfo deploymentInfo2 = deploymentInfoMock.setDeploymentName("spring-boot");
            doReturn(deploymentInfo2).when(deploymentInfoMock).setDeploymentName("spring-boot");
            ServletInfo servletInfo = Servlets.servlet("default", DefaultServlet.class);
            DeploymentInfo deploymentInfo3 = deploymentInfoMock.addServlet(servletInfo);
            doReturn(deploymentInfo3).when(deploymentInfoMock).addServlet((ServletInfo) any());
            doReturn(deploymentInfoMock5).when(deploymentInfoMock).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
            DeploymentInfo deploymentInfo4 = deploymentInfoMock.setServletStackTraces(ServletStackTraces.NONE);
            doReturn(deploymentInfo4).when(deploymentInfoMock).setServletStackTraces(ServletStackTraces.NONE);
            target = new UndertowServletWebServerFactory("/AB", 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            target.setRegisterDefaultServlet(true);
            target.setDisplayName("displayName1");
            Set<ErrorPage> errorPageSet = new HashSet<>();
            errorPageSet.add(errorPageMock);
            target.setErrorPages(errorPageSet);
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
                _assert.verify(() -> Assert.notNull("/AB", "ContextPath must not be null"), atLeast(1));
                servlets.verify(() -> Servlets.deployment(), atLeast(1));
                verify(deploymentInfoMock, atLeast(1)).addServletContainerInitializer((ServletContainerInitializerInfo) any());
                verify(deploymentInfoMock, atLeast(1)).setClassLoader((ClassLoader) any());
                verify(deploymentInfoMock, atLeast(1)).setContextPath("/AB");
                verify(deploymentInfoMock, atLeast(1)).setDisplayName("displayName1");
                verify(deploymentInfoMock, atLeast(1)).setDeploymentName("spring-boot");
                verify(deploymentInfoMock, atLeast(1)).addServlet((ServletInfo) any());
                verify(deploymentInfoMock, atLeast(1)).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
                verify(deploymentInfoMock, atLeast(1)).setServletStackTraces(ServletStackTraces.NONE);
            });
        }
    }

    //Sapient generated method id: ${getWebServerWhenManagerGetDeploymentNotInstanceOfDeploymentImplAndTimeoutDurationIsNullAndIsZeroOrLessTimeoutDuration3}, hash: F898AA9A53EFE4AC5B4EBC380BDF90E5
    @Disabled()
    @Test()
    void getWebServerWhenManagerGetDeploymentNotInstanceOfDeploymentImplAndTimeoutDurationIsNullAndIsZeroOrLessTimeoutDuration3() throws Exception {
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
         * (timeoutDuration == null) : true  #  inside isZeroOrLess method
         * (isZeroOrLess(timeoutDuration)) : true  #  inside createManager method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: createBuilder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
        Deployment deploymentMock = mock(Deployment.class);
        Deployment deploymentMock2 = mock(Deployment.class);
        SessionManager sessionManagerMock = mock(SessionManager.class);
        UndertowServletWebServer undertowServletWebServerMock = mock(UndertowServletWebServer.class);
        try (MockedStatic<Servlets> servlets = mockStatic(Servlets.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(HttpStatus.CONTINUE).when(errorPageMock).getStatus();
            doReturn("return_of_getPath1").when(errorPageMock).getPath();
            doReturn(0).when(errorPageMock).getStatusCode();
            List<MimeMappings.Mapping> mimeMappingsMappingList = new ArrayList<>();
            Iterator<MimeMappings.Mapping> iterator = mimeMappingsMappingList.iterator();
            doReturn(iterator).when(mimeMappingsMock).iterator();
            _assert.when(() -> Assert.notNull("/AB", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            servlets.when(() -> Servlets.deployment()).thenReturn(deploymentInfoMock);
            doReturn(deploymentInfoMock2).when(deploymentInfoMock).addServletContainerInitializer((ServletContainerInitializerInfo) any());
            ClassLoader classLoader = UndertowServletWebServerFactory.class.getClassLoader();
            DeploymentInfo deploymentInfo = deploymentInfoMock.setClassLoader(classLoader);
            doReturn(deploymentInfo).when(deploymentInfoMock).setClassLoader((ClassLoader) any());
            doReturn(deploymentInfoMock3).when(deploymentInfoMock).setContextPath("/AB");
            doReturn(deploymentInfoMock4).when(deploymentInfoMock).setDisplayName("displayName1");
            DeploymentInfo deploymentInfo2 = deploymentInfoMock.setDeploymentName("spring-boot");
            doReturn(deploymentInfo2).when(deploymentInfoMock).setDeploymentName("spring-boot");
            ServletInfo servletInfo = Servlets.servlet("default", DefaultServlet.class);
            DeploymentInfo deploymentInfo3 = deploymentInfoMock.addServlet(servletInfo);
            doReturn(deploymentInfo3).when(deploymentInfoMock).addServlet((ServletInfo) any());
            doReturn(deploymentInfoMock5).when(deploymentInfoMock).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
            DeploymentInfo deploymentInfo4 = deploymentInfoMock.setServletStackTraces(ServletStackTraces.NONE);
            doReturn(deploymentInfo4).when(deploymentInfoMock).setServletStackTraces(ServletStackTraces.NONE);
            doReturn(deploymentInfoMock6).when(deploymentInfoMock).setResourceManager((ResourceManager) any());
            File file = new File("pathname1");
            doReturn(deploymentInfoMock7).when(deploymentInfoMock).setTempDir(file);
            DeploymentInfo deploymentInfo5 = deploymentInfoMock.setEagerFilterInit(true);
            doReturn(deploymentInfo5).when(deploymentInfoMock).setEagerFilterInit(true);
            doNothing().when(deploymentInfoMock).setPreservePathOnForward(false);
            doReturn(deploymentInfoMock8).when(deploymentInfoMock).addLocaleCharsetMapping("locale", "charset");
            servlets.when(() -> Servlets.newContainer()).thenReturn(servletContainerMock);
            doReturn(deploymentManagerMock).when(servletContainerMock).addDeployment(deploymentInfoMock);
            doNothing().when(deploymentManagerMock).deploy();
            doReturn(deploymentMock, deploymentMock2).when(deploymentManagerMock).getDeployment();
            doReturn(sessionManagerMock).when(deploymentMock2).getSessionManager();
            doNothing().when(sessionManagerMock).setDefaultSessionTimeout(-1);
            target = spy(new UndertowServletWebServerFactory("/AB", 2));
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
            session.setTimeout((Duration) null);
            target.setSession(session);
            target.setMimeMappings(mimeMappingsMock);
            doReturn(undertowServletWebServerMock).when(target).getUndertowWebServer((Undertow.Builder) any(), eq(deploymentManagerMock), eq(2));
            ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
            //Act Statement(s)
            WebServer result = target.getWebServer(servletContextInitializerArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(undertowServletWebServerMock));
                verify(errorPageMock, atLeast(1)).getStatus();
                verify(errorPageMock, atLeast(1)).getPath();
                verify(errorPageMock, atLeast(1)).getStatusCode();
                verify(mimeMappingsMock, atLeast(1)).iterator();
                _assert.verify(() -> Assert.notNull("/AB", "ContextPath must not be null"), atLeast(1));
                servlets.verify(() -> Servlets.deployment(), atLeast(1));
                verify(deploymentInfoMock, atLeast(1)).addServletContainerInitializer((ServletContainerInitializerInfo) any());
                verify(deploymentInfoMock, atLeast(1)).setClassLoader((ClassLoader) any());
                verify(deploymentInfoMock, atLeast(1)).setContextPath("/AB");
                verify(deploymentInfoMock, atLeast(1)).setDisplayName("displayName1");
                verify(deploymentInfoMock, atLeast(1)).setDeploymentName("spring-boot");
                verify(deploymentInfoMock, atLeast(1)).addServlet((ServletInfo) any());
                verify(deploymentInfoMock, atLeast(1)).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
                verify(deploymentInfoMock, atLeast(1)).setServletStackTraces(ServletStackTraces.NONE);
                verify(deploymentInfoMock, atLeast(1)).setResourceManager((ResourceManager) any());
                verify(deploymentInfoMock, atLeast(1)).setTempDir(file);
                verify(deploymentInfoMock, atLeast(1)).setEagerFilterInit(true);
                verify(deploymentInfoMock, atLeast(1)).setPreservePathOnForward(false);
                verify(deploymentInfoMock, atLeast(1)).addLocaleCharsetMapping("locale", "charset");
                servlets.verify(() -> Servlets.newContainer(), atLeast(1));
                verify(servletContainerMock, atLeast(1)).addDeployment(deploymentInfoMock);
                verify(deploymentManagerMock, atLeast(1)).deploy();
                verify(deploymentManagerMock, times(2)).getDeployment();
                verify(deploymentMock2, atLeast(1)).getSessionManager();
                verify(sessionManagerMock, atLeast(1)).setDefaultSessionTimeout(-1);
                verify(target, atLeast(1)).getUndertowWebServer((Undertow.Builder) any(), eq(deploymentManagerMock), eq(2));
            });
        }
    }

    //Sapient generated method id: ${getWebServerWhenManagerGetDeploymentNotInstanceOfDeploymentImplAndTimeoutDurationIsNullAndIsZeroOrLessTimeoutDuration4}, hash: DB92F017FE13AD1FF9F4809FCB55BE69
    @Disabled()
    @Test()
    void getWebServerWhenManagerGetDeploymentNotInstanceOfDeploymentImplAndTimeoutDurationIsNullAndIsZeroOrLessTimeoutDuration4() throws Exception {
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
         * (timeoutDuration == null) : true  #  inside isZeroOrLess method
         * (isZeroOrLess(timeoutDuration)) : true  #  inside createManager method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: createBuilder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
        Deployment deploymentMock = mock(Deployment.class);
        Deployment deploymentMock2 = mock(Deployment.class);
        SessionManager sessionManagerMock = mock(SessionManager.class);
        UndertowServletWebServer undertowServletWebServerMock = mock(UndertowServletWebServer.class);
        try (MockedStatic<Servlets> servlets = mockStatic(Servlets.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(null).when(errorPageMock).getStatus();
            doReturn(Throwable.class).when(errorPageMock).getException();
            doReturn("return_of_getPath1").when(errorPageMock).getPath();
            List<MimeMappings.Mapping> mimeMappingsMappingList = new ArrayList<>();
            Iterator<MimeMappings.Mapping> iterator = mimeMappingsMappingList.iterator();
            doReturn(iterator).when(mimeMappingsMock).iterator();
            _assert.when(() -> Assert.notNull("/AB", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            servlets.when(() -> Servlets.deployment()).thenReturn(deploymentInfoMock);
            doReturn(deploymentInfoMock2).when(deploymentInfoMock).addServletContainerInitializer((ServletContainerInitializerInfo) any());
            ClassLoader classLoader = UndertowServletWebServerFactory.class.getClassLoader();
            DeploymentInfo deploymentInfo = deploymentInfoMock.setClassLoader(classLoader);
            doReturn(deploymentInfo).when(deploymentInfoMock).setClassLoader((ClassLoader) any());
            doReturn(deploymentInfoMock3).when(deploymentInfoMock).setContextPath("/AB");
            doReturn(deploymentInfoMock4).when(deploymentInfoMock).setDisplayName("displayName1");
            DeploymentInfo deploymentInfo2 = deploymentInfoMock.setDeploymentName("spring-boot");
            doReturn(deploymentInfo2).when(deploymentInfoMock).setDeploymentName("spring-boot");
            ServletInfo servletInfo = Servlets.servlet("default", DefaultServlet.class);
            DeploymentInfo deploymentInfo3 = deploymentInfoMock.addServlet(servletInfo);
            doReturn(deploymentInfo3).when(deploymentInfoMock).addServlet((ServletInfo) any());
            doReturn(deploymentInfoMock5).when(deploymentInfoMock).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
            DeploymentInfo deploymentInfo4 = deploymentInfoMock.setServletStackTraces(ServletStackTraces.NONE);
            doReturn(deploymentInfo4).when(deploymentInfoMock).setServletStackTraces(ServletStackTraces.NONE);
            doReturn(deploymentInfoMock6).when(deploymentInfoMock).setResourceManager((ResourceManager) any());
            File file = new File("pathname1");
            doReturn(deploymentInfoMock7).when(deploymentInfoMock).setTempDir(file);
            DeploymentInfo deploymentInfo5 = deploymentInfoMock.setEagerFilterInit(true);
            doReturn(deploymentInfo5).when(deploymentInfoMock).setEagerFilterInit(true);
            doNothing().when(deploymentInfoMock).setPreservePathOnForward(false);
            doReturn(deploymentInfoMock8).when(deploymentInfoMock).addLocaleCharsetMapping("locale", "charset");
            servlets.when(() -> Servlets.newContainer()).thenReturn(servletContainerMock);
            doReturn(deploymentManagerMock).when(servletContainerMock).addDeployment(deploymentInfoMock);
            doNothing().when(deploymentManagerMock).deploy();
            doReturn(deploymentMock, deploymentMock2).when(deploymentManagerMock).getDeployment();
            doReturn(sessionManagerMock).when(deploymentMock2).getSessionManager();
            doNothing().when(sessionManagerMock).setDefaultSessionTimeout(-1);
            target = spy(new UndertowServletWebServerFactory("/AB", 2));
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
            session.setTimeout((Duration) null);
            target.setSession(session);
            target.setMimeMappings(mimeMappingsMock);
            doReturn(undertowServletWebServerMock).when(target).getUndertowWebServer((Undertow.Builder) any(), eq(deploymentManagerMock), eq(2));
            ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
            //Act Statement(s)
            WebServer result = target.getWebServer(servletContextInitializerArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(undertowServletWebServerMock));
                verify(errorPageMock, atLeast(1)).getStatus();
                verify(errorPageMock, times(2)).getException();
                verify(errorPageMock, atLeast(1)).getPath();
                verify(mimeMappingsMock, atLeast(1)).iterator();
                _assert.verify(() -> Assert.notNull("/AB", "ContextPath must not be null"), atLeast(1));
                servlets.verify(() -> Servlets.deployment(), atLeast(1));
                verify(deploymentInfoMock, atLeast(1)).addServletContainerInitializer((ServletContainerInitializerInfo) any());
                verify(deploymentInfoMock, atLeast(1)).setClassLoader((ClassLoader) any());
                verify(deploymentInfoMock, atLeast(1)).setContextPath("/AB");
                verify(deploymentInfoMock, atLeast(1)).setDisplayName("displayName1");
                verify(deploymentInfoMock, atLeast(1)).setDeploymentName("spring-boot");
                verify(deploymentInfoMock, atLeast(1)).addServlet((ServletInfo) any());
                verify(deploymentInfoMock, atLeast(1)).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
                verify(deploymentInfoMock, atLeast(1)).setServletStackTraces(ServletStackTraces.NONE);
                verify(deploymentInfoMock, atLeast(1)).setResourceManager((ResourceManager) any());
                verify(deploymentInfoMock, atLeast(1)).setTempDir(file);
                verify(deploymentInfoMock, atLeast(1)).setEagerFilterInit(true);
                verify(deploymentInfoMock, atLeast(1)).setPreservePathOnForward(false);
                verify(deploymentInfoMock, atLeast(1)).addLocaleCharsetMapping("locale", "charset");
                servlets.verify(() -> Servlets.newContainer(), atLeast(1));
                verify(servletContainerMock, atLeast(1)).addDeployment(deploymentInfoMock);
                verify(deploymentManagerMock, atLeast(1)).deploy();
                verify(deploymentManagerMock, times(2)).getDeployment();
                verify(deploymentMock2, atLeast(1)).getSessionManager();
                verify(sessionManagerMock, atLeast(1)).setDefaultSessionTimeout(-1);
                verify(target, atLeast(1)).getUndertowWebServer((Undertow.Builder) any(), eq(deploymentManagerMock), eq(2));
            });
        }
    }

    //Sapient generated method id: ${getWebServerWhenManagerGetDeploymentNotInstanceOfDeploymentImplAndTimeoutDurationIsNullAndIsZeroOrLessTimeoutDuration5}, hash: 5CE36F0B778ED324792A4152FEBA1B16
    @Disabled()
    @Test()
    void getWebServerWhenManagerGetDeploymentNotInstanceOfDeploymentImplAndTimeoutDurationIsNullAndIsZeroOrLessTimeoutDuration5() throws Exception {
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
         * (timeoutDuration == null) : true  #  inside isZeroOrLess method
         * (isZeroOrLess(timeoutDuration)) : true  #  inside createManager method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: createBuilder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
        Deployment deploymentMock = mock(Deployment.class);
        Deployment deploymentMock2 = mock(Deployment.class);
        SessionManager sessionManagerMock = mock(SessionManager.class);
        UndertowServletWebServer undertowServletWebServerMock = mock(UndertowServletWebServer.class);
        try (MockedStatic<Servlets> servlets = mockStatic(Servlets.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(null).when(errorPageMock).getStatus();
            doReturn(null).when(errorPageMock).getException();
            doReturn("return_of_getPath1").when(errorPageMock).getPath();
            List<MimeMappings.Mapping> mimeMappingsMappingList = new ArrayList<>();
            Iterator<MimeMappings.Mapping> iterator = mimeMappingsMappingList.iterator();
            doReturn(iterator).when(mimeMappingsMock).iterator();
            _assert.when(() -> Assert.notNull("/AB", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            servlets.when(() -> Servlets.deployment()).thenReturn(deploymentInfoMock);
            doReturn(deploymentInfoMock2).when(deploymentInfoMock).addServletContainerInitializer((ServletContainerInitializerInfo) any());
            ClassLoader classLoader = UndertowServletWebServerFactory.class.getClassLoader();
            DeploymentInfo deploymentInfo = deploymentInfoMock.setClassLoader(classLoader);
            doReturn(deploymentInfo).when(deploymentInfoMock).setClassLoader((ClassLoader) any());
            doReturn(deploymentInfoMock3).when(deploymentInfoMock).setContextPath("/AB");
            doReturn(deploymentInfoMock4).when(deploymentInfoMock).setDisplayName("displayName1");
            DeploymentInfo deploymentInfo2 = deploymentInfoMock.setDeploymentName("spring-boot");
            doReturn(deploymentInfo2).when(deploymentInfoMock).setDeploymentName("spring-boot");
            ServletInfo servletInfo = Servlets.servlet("default", DefaultServlet.class);
            DeploymentInfo deploymentInfo3 = deploymentInfoMock.addServlet(servletInfo);
            doReturn(deploymentInfo3).when(deploymentInfoMock).addServlet((ServletInfo) any());
            doReturn(deploymentInfoMock5).when(deploymentInfoMock).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
            DeploymentInfo deploymentInfo4 = deploymentInfoMock.setServletStackTraces(ServletStackTraces.NONE);
            doReturn(deploymentInfo4).when(deploymentInfoMock).setServletStackTraces(ServletStackTraces.NONE);
            doReturn(deploymentInfoMock6).when(deploymentInfoMock).setResourceManager((ResourceManager) any());
            File file = new File("pathname1");
            doReturn(deploymentInfoMock7).when(deploymentInfoMock).setTempDir(file);
            DeploymentInfo deploymentInfo5 = deploymentInfoMock.setEagerFilterInit(true);
            doReturn(deploymentInfo5).when(deploymentInfoMock).setEagerFilterInit(true);
            doNothing().when(deploymentInfoMock).setPreservePathOnForward(false);
            doReturn(deploymentInfoMock8).when(deploymentInfoMock).addLocaleCharsetMapping("locale", "charset");
            servlets.when(() -> Servlets.newContainer()).thenReturn(servletContainerMock);
            doReturn(deploymentManagerMock).when(servletContainerMock).addDeployment(deploymentInfoMock);
            doNothing().when(deploymentManagerMock).deploy();
            doReturn(deploymentMock, deploymentMock2).when(deploymentManagerMock).getDeployment();
            doReturn(sessionManagerMock).when(deploymentMock2).getSessionManager();
            doNothing().when(sessionManagerMock).setDefaultSessionTimeout(-1);
            target = spy(new UndertowServletWebServerFactory("/AB", 2));
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
            session.setTimeout((Duration) null);
            target.setSession(session);
            target.setMimeMappings(mimeMappingsMock);
            doReturn(undertowServletWebServerMock).when(target).getUndertowWebServer((Undertow.Builder) any(), eq(deploymentManagerMock), eq(2));
            ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
            //Act Statement(s)
            WebServer result = target.getWebServer(servletContextInitializerArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(undertowServletWebServerMock));
                verify(errorPageMock, atLeast(1)).getStatus();
                verify(errorPageMock, atLeast(1)).getException();
                verify(errorPageMock, atLeast(1)).getPath();
                verify(mimeMappingsMock, atLeast(1)).iterator();
                _assert.verify(() -> Assert.notNull("/AB", "ContextPath must not be null"), atLeast(1));
                servlets.verify(() -> Servlets.deployment(), atLeast(1));
                verify(deploymentInfoMock, atLeast(1)).addServletContainerInitializer((ServletContainerInitializerInfo) any());
                verify(deploymentInfoMock, atLeast(1)).setClassLoader((ClassLoader) any());
                verify(deploymentInfoMock, atLeast(1)).setContextPath("/AB");
                verify(deploymentInfoMock, atLeast(1)).setDisplayName("displayName1");
                verify(deploymentInfoMock, atLeast(1)).setDeploymentName("spring-boot");
                verify(deploymentInfoMock, atLeast(1)).addServlet((ServletInfo) any());
                verify(deploymentInfoMock, atLeast(1)).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
                verify(deploymentInfoMock, atLeast(1)).setServletStackTraces(ServletStackTraces.NONE);
                verify(deploymentInfoMock, atLeast(1)).setResourceManager((ResourceManager) any());
                verify(deploymentInfoMock, atLeast(1)).setTempDir(file);
                verify(deploymentInfoMock, atLeast(1)).setEagerFilterInit(true);
                verify(deploymentInfoMock, atLeast(1)).setPreservePathOnForward(false);
                verify(deploymentInfoMock, atLeast(1)).addLocaleCharsetMapping("locale", "charset");
                servlets.verify(() -> Servlets.newContainer(), atLeast(1));
                verify(servletContainerMock, atLeast(1)).addDeployment(deploymentInfoMock);
                verify(deploymentManagerMock, atLeast(1)).deploy();
                verify(deploymentManagerMock, times(2)).getDeployment();
                verify(deploymentMock2, atLeast(1)).getSessionManager();
                verify(sessionManagerMock, atLeast(1)).setDefaultSessionTimeout(-1);
                verify(target, atLeast(1)).getUndertowWebServer((Undertow.Builder) any(), eq(deploymentManagerMock), eq(2));
            });
        }
    }

    //Sapient generated method id: ${getWebServerWhenManagerGetDeploymentNotInstanceOfDeploymentImplAndTimeoutDurationIsNullAndIsZeroOrLessTimeoutDuration8}, hash: E45CFF868FCDD06AE10B05EBDC2A4B7A
    @Disabled()
    @Test()
    void getWebServerWhenManagerGetDeploymentNotInstanceOfDeploymentImplAndTimeoutDurationIsNullAndIsZeroOrLessTimeoutDuration8() throws Exception {
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
         * (timeoutDuration == null) : true  #  inside isZeroOrLess method
         * (isZeroOrLess(timeoutDuration)) : true  #  inside createManager method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: createBuilder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
        Deployment deploymentMock = mock(Deployment.class);
        Deployment deploymentMock2 = mock(Deployment.class);
        SessionManager sessionManagerMock = mock(SessionManager.class);
        UndertowServletWebServer undertowServletWebServerMock = mock(UndertowServletWebServer.class);
        try (MockedStatic<Servlets> servlets = mockStatic(Servlets.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(HttpStatus.CONTINUE).when(errorPageMock).getStatus();
            doReturn("return_of_getPath1").when(errorPageMock).getPath();
            doReturn(0).when(errorPageMock).getStatusCode();
            List<MimeMappings.Mapping> mimeMappingsMappingList = new ArrayList<>();
            Iterator<MimeMappings.Mapping> iterator = mimeMappingsMappingList.iterator();
            doReturn(iterator).when(mimeMappingsMock).iterator();
            _assert.when(() -> Assert.notNull("/AB", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            servlets.when(() -> Servlets.deployment()).thenReturn(deploymentInfoMock);
            doReturn(deploymentInfoMock2).when(deploymentInfoMock).addServletContainerInitializer((ServletContainerInitializerInfo) any());
            ClassLoader classLoader = UndertowServletWebServerFactory.class.getClassLoader();
            DeploymentInfo deploymentInfo = deploymentInfoMock.setClassLoader(classLoader);
            doReturn(deploymentInfo).when(deploymentInfoMock).setClassLoader((ClassLoader) any());
            doReturn(deploymentInfoMock3).when(deploymentInfoMock).setContextPath("/AB");
            doReturn(deploymentInfoMock4).when(deploymentInfoMock).setDisplayName("displayName1");
            DeploymentInfo deploymentInfo2 = deploymentInfoMock.setDeploymentName("spring-boot");
            doReturn(deploymentInfo2).when(deploymentInfoMock).setDeploymentName("spring-boot");
            ServletInfo servletInfo = Servlets.servlet("default", DefaultServlet.class);
            DeploymentInfo deploymentInfo3 = deploymentInfoMock.addServlet(servletInfo);
            doReturn(deploymentInfo3).when(deploymentInfoMock).addServlet((ServletInfo) any());
            doReturn(deploymentInfoMock5).when(deploymentInfoMock).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
            DeploymentInfo deploymentInfo4 = deploymentInfoMock.setServletStackTraces(ServletStackTraces.NONE);
            doReturn(deploymentInfo4).when(deploymentInfoMock).setServletStackTraces(ServletStackTraces.NONE);
            doReturn(deploymentInfoMock6).when(deploymentInfoMock).setResourceManager((ResourceManager) any());
            File file = new File("pathname1");
            doReturn(deploymentInfoMock7).when(deploymentInfoMock).setTempDir(file);
            DeploymentInfo deploymentInfo5 = deploymentInfoMock.setEagerFilterInit(true);
            doReturn(deploymentInfo5).when(deploymentInfoMock).setEagerFilterInit(true);
            doNothing().when(deploymentInfoMock).setPreservePathOnForward(false);
            doReturn(deploymentInfoMock8).when(deploymentInfoMock).addLocaleCharsetMapping("locale", "charset");
            servlets.when(() -> Servlets.newContainer()).thenReturn(servletContainerMock);
            doReturn(deploymentManagerMock).when(servletContainerMock).addDeployment(deploymentInfoMock);
            doNothing().when(deploymentManagerMock).deploy();
            doReturn(deploymentMock, deploymentMock2).when(deploymentManagerMock).getDeployment();
            doReturn(sessionManagerMock).when(deploymentMock2).getSessionManager();
            doNothing().when(sessionManagerMock).setDefaultSessionTimeout(-1);
            target = spy(new UndertowServletWebServerFactory("/AB", 2));
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
            session.setTimeout((Duration) null);
            target.setSession(session);
            target.setMimeMappings(mimeMappingsMock);
            doReturn(undertowServletWebServerMock).when(target).getUndertowWebServer((Undertow.Builder) any(), eq(deploymentManagerMock), eq(2));
            ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
            //Act Statement(s)
            WebServer result = target.getWebServer(servletContextInitializerArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(undertowServletWebServerMock));
                verify(errorPageMock, atLeast(1)).getStatus();
                verify(errorPageMock, atLeast(1)).getPath();
                verify(errorPageMock, atLeast(1)).getStatusCode();
                verify(mimeMappingsMock, atLeast(1)).iterator();
                _assert.verify(() -> Assert.notNull("/AB", "ContextPath must not be null"), atLeast(1));
                servlets.verify(() -> Servlets.deployment(), atLeast(1));
                verify(deploymentInfoMock, atLeast(1)).addServletContainerInitializer((ServletContainerInitializerInfo) any());
                verify(deploymentInfoMock, atLeast(1)).setClassLoader((ClassLoader) any());
                verify(deploymentInfoMock, atLeast(1)).setContextPath("/AB");
                verify(deploymentInfoMock, atLeast(1)).setDisplayName("displayName1");
                verify(deploymentInfoMock, atLeast(1)).setDeploymentName("spring-boot");
                verify(deploymentInfoMock, atLeast(1)).addServlet((ServletInfo) any());
                verify(deploymentInfoMock, atLeast(1)).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
                verify(deploymentInfoMock, atLeast(1)).setServletStackTraces(ServletStackTraces.NONE);
                verify(deploymentInfoMock, atLeast(1)).setResourceManager((ResourceManager) any());
                verify(deploymentInfoMock, atLeast(1)).setTempDir(file);
                verify(deploymentInfoMock, atLeast(1)).setEagerFilterInit(true);
                verify(deploymentInfoMock, atLeast(1)).setPreservePathOnForward(false);
                verify(deploymentInfoMock, atLeast(1)).addLocaleCharsetMapping("locale", "charset");
                servlets.verify(() -> Servlets.newContainer(), atLeast(1));
                verify(servletContainerMock, atLeast(1)).addDeployment(deploymentInfoMock);
                verify(deploymentManagerMock, atLeast(1)).deploy();
                verify(deploymentManagerMock, times(2)).getDeployment();
                verify(deploymentMock2, atLeast(1)).getSessionManager();
                verify(sessionManagerMock, atLeast(1)).setDefaultSessionTimeout(-1);
                verify(target, atLeast(1)).getUndertowWebServer((Undertow.Builder) any(), eq(deploymentManagerMock), eq(2));
            });
        }
    }

    //Sapient generated method id: ${getWebServerWhenManagerGetDeploymentNotInstanceOfDeploymentImplAndTimeoutDurationIsNullAndIsZeroOrLessTimeoutDuration15}, hash: 81FF5AA078F72A26A28DCEAC86366510
    @Disabled()
    @Test()
    void getWebServerWhenManagerGetDeploymentNotInstanceOfDeploymentImplAndTimeoutDurationIsNullAndIsZeroOrLessTimeoutDuration15() throws Exception {
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
         * (timeoutDuration == null) : true  #  inside isZeroOrLess method
         * (isZeroOrLess(timeoutDuration)) : true  #  inside createManager method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: createBuilder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
        Deployment deploymentMock = mock(Deployment.class);
        Deployment deploymentMock2 = mock(Deployment.class);
        SessionManager sessionManagerMock = mock(SessionManager.class);
        UndertowServletWebServer undertowServletWebServerMock = mock(UndertowServletWebServer.class);
        try (MockedStatic<Servlets> servlets = mockStatic(Servlets.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(null).when(errorPageMock).getStatus();
            doReturn(null).when(errorPageMock).getException();
            doReturn("return_of_getPath1").when(errorPageMock).getPath();
            List<MimeMappings.Mapping> mimeMappingsMappingList = new ArrayList<>();
            Iterator<MimeMappings.Mapping> iterator = mimeMappingsMappingList.iterator();
            doReturn(iterator).when(mimeMappingsMock).iterator();
            _assert.when(() -> Assert.notNull("/AB", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            servlets.when(() -> Servlets.deployment()).thenReturn(deploymentInfoMock);
            doReturn(deploymentInfoMock2).when(deploymentInfoMock).addServletContainerInitializer((ServletContainerInitializerInfo) any());
            ClassLoader classLoader = UndertowServletWebServerFactory.class.getClassLoader();
            DeploymentInfo deploymentInfo = deploymentInfoMock.setClassLoader(classLoader);
            doReturn(deploymentInfo).when(deploymentInfoMock).setClassLoader((ClassLoader) any());
            doReturn(deploymentInfoMock3).when(deploymentInfoMock).setContextPath("/AB");
            doReturn(deploymentInfoMock4).when(deploymentInfoMock).setDisplayName("displayName1");
            DeploymentInfo deploymentInfo2 = deploymentInfoMock.setDeploymentName("spring-boot");
            doReturn(deploymentInfo2).when(deploymentInfoMock).setDeploymentName("spring-boot");
            ServletInfo servletInfo = Servlets.servlet("default", DefaultServlet.class);
            DeploymentInfo deploymentInfo3 = deploymentInfoMock.addServlet(servletInfo);
            doReturn(deploymentInfo3).when(deploymentInfoMock).addServlet((ServletInfo) any());
            doReturn(deploymentInfoMock5).when(deploymentInfoMock).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
            DeploymentInfo deploymentInfo4 = deploymentInfoMock.setServletStackTraces(ServletStackTraces.NONE);
            doReturn(deploymentInfo4).when(deploymentInfoMock).setServletStackTraces(ServletStackTraces.NONE);
            doReturn(deploymentInfoMock6).when(deploymentInfoMock).setResourceManager((ResourceManager) any());
            File file = new File("pathname1");
            doReturn(deploymentInfoMock7).when(deploymentInfoMock).setTempDir(file);
            DeploymentInfo deploymentInfo5 = deploymentInfoMock.setEagerFilterInit(true);
            doReturn(deploymentInfo5).when(deploymentInfoMock).setEagerFilterInit(true);
            doNothing().when(deploymentInfoMock).setPreservePathOnForward(false);
            doReturn(deploymentInfoMock8).when(deploymentInfoMock).addLocaleCharsetMapping("locale", "charset");
            servlets.when(() -> Servlets.newContainer()).thenReturn(servletContainerMock);
            doReturn(deploymentManagerMock).when(servletContainerMock).addDeployment(deploymentInfoMock);
            doNothing().when(deploymentManagerMock).deploy();
            doReturn(deploymentMock, deploymentMock2).when(deploymentManagerMock).getDeployment();
            doReturn(sessionManagerMock).when(deploymentMock2).getSessionManager();
            doNothing().when(sessionManagerMock).setDefaultSessionTimeout(-1);
            target = spy(new UndertowServletWebServerFactory("/AB", 2));
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
            session.setTimeout((Duration) null);
            target.setSession(session);
            target.setMimeMappings(mimeMappingsMock);
            doReturn(undertowServletWebServerMock).when(target).getUndertowWebServer((Undertow.Builder) any(), eq(deploymentManagerMock), eq(2));
            ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
            //Act Statement(s)
            WebServer result = target.getWebServer(servletContextInitializerArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(undertowServletWebServerMock));
                verify(errorPageMock, atLeast(1)).getStatus();
                verify(errorPageMock, atLeast(1)).getException();
                verify(errorPageMock, atLeast(1)).getPath();
                verify(mimeMappingsMock, atLeast(1)).iterator();
                _assert.verify(() -> Assert.notNull("/AB", "ContextPath must not be null"), atLeast(1));
                servlets.verify(() -> Servlets.deployment(), atLeast(1));
                verify(deploymentInfoMock, atLeast(1)).addServletContainerInitializer((ServletContainerInitializerInfo) any());
                verify(deploymentInfoMock, atLeast(1)).setClassLoader((ClassLoader) any());
                verify(deploymentInfoMock, atLeast(1)).setContextPath("/AB");
                verify(deploymentInfoMock, atLeast(1)).setDisplayName("displayName1");
                verify(deploymentInfoMock, atLeast(1)).setDeploymentName("spring-boot");
                verify(deploymentInfoMock, atLeast(1)).addServlet((ServletInfo) any());
                verify(deploymentInfoMock, atLeast(1)).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
                verify(deploymentInfoMock, atLeast(1)).setServletStackTraces(ServletStackTraces.NONE);
                verify(deploymentInfoMock, atLeast(1)).setResourceManager((ResourceManager) any());
                verify(deploymentInfoMock, atLeast(1)).setTempDir(file);
                verify(deploymentInfoMock, atLeast(1)).setEagerFilterInit(true);
                verify(deploymentInfoMock, atLeast(1)).setPreservePathOnForward(false);
                verify(deploymentInfoMock, atLeast(1)).addLocaleCharsetMapping("locale", "charset");
                servlets.verify(() -> Servlets.newContainer(), atLeast(1));
                verify(servletContainerMock, atLeast(1)).addDeployment(deploymentInfoMock);
                verify(deploymentManagerMock, atLeast(1)).deploy();
                verify(deploymentManagerMock, times(2)).getDeployment();
                verify(deploymentMock2, atLeast(1)).getSessionManager();
                verify(sessionManagerMock, atLeast(1)).setDefaultSessionTimeout(-1);
                verify(target, atLeast(1)).getUndertowWebServer((Undertow.Builder) any(), eq(deploymentManagerMock), eq(2));
            });
        }
    }

    //Sapient generated method id: ${getWebServerWhenTimeoutDurationIsNegativeAndIsZeroOrLessTimeoutDuration}, hash: 197BD19CA09FA8246D302EEB35855579
    @Disabled()
    @Test()
    void getWebServerWhenTimeoutDurationIsNegativeAndIsZeroOrLessTimeoutDuration() throws Exception {
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
         * (manager.getDeployment() instanceof DeploymentImpl managerDeployment) : true  #  inside createManager method
         * (for-each(deploymentInfo.getMimeMappings())) : true  #  inside removeSuperfluousMimeMappings method
         * (timeoutDuration == null) : false  #  inside isZeroOrLess method
         * (timeoutDuration.isZero()) : false  #  inside isZeroOrLess method
         * (timeoutDuration.isNegative()) : true  #  inside isZeroOrLess method
         * (isZeroOrLess(timeoutDuration)) : true  #  inside createManager method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: createBuilder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
        DeploymentInfo deploymentInfoMock10 = mock(DeploymentInfo.class);
        ServletContainer servletContainerMock = mock(ServletContainer.class);
        DeploymentManager deploymentManagerMock = mock(DeploymentManager.class);
        DeploymentImpl deploymentImplMock = mock(DeploymentImpl.class);
        Deployment deploymentMock = mock(Deployment.class);
        SessionManager sessionManagerMock = mock(SessionManager.class);
        UndertowServletWebServer undertowServletWebServerMock = mock(UndertowServletWebServer.class);
        try (MockedStatic<Servlets> servlets = mockStatic(Servlets.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(HttpStatus.CONTINUE).when(errorPageMock).getStatus();
            doReturn("return_of_getPath1").when(errorPageMock).getPath();
            doReturn(0).when(errorPageMock).getStatusCode();
            MimeMappings.Mapping mimeMappingsMapping = new MimeMappings.Mapping("extension1", "mimeType1");
            List<MimeMappings.Mapping> mimeMappingsMappingList = new ArrayList<>();
            mimeMappingsMappingList.add(mimeMappingsMapping);
            Iterator<MimeMappings.Mapping> iterator = mimeMappingsMappingList.iterator();
            doReturn(iterator).when(mimeMappingsMock).iterator();
            _assert.when(() -> Assert.notNull("/AB", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            servlets.when(() -> Servlets.deployment()).thenReturn(deploymentInfoMock);
            doReturn(deploymentInfoMock2).when(deploymentInfoMock).addServletContainerInitializer((ServletContainerInitializerInfo) any());
            ClassLoader classLoader = UndertowServletWebServerFactory.class.getClassLoader();
            DeploymentInfo deploymentInfo = deploymentInfoMock.setClassLoader(classLoader);
            doReturn(deploymentInfo).when(deploymentInfoMock).setClassLoader((ClassLoader) any());
            doReturn(deploymentInfoMock3).when(deploymentInfoMock).setContextPath("/AB");
            doReturn(deploymentInfoMock4).when(deploymentInfoMock).setDisplayName("displayName1");
            DeploymentInfo deploymentInfo2 = deploymentInfoMock.setDeploymentName("spring-boot");
            doReturn(deploymentInfo2).when(deploymentInfoMock).setDeploymentName("spring-boot");
            ServletInfo servletInfo = Servlets.servlet("default", DefaultServlet.class);
            DeploymentInfo deploymentInfo3 = deploymentInfoMock.addServlet(servletInfo);
            doReturn(deploymentInfo3).when(deploymentInfoMock).addServlet((ServletInfo) any());
            doReturn(deploymentInfoMock5).when(deploymentInfoMock).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
            DeploymentInfo deploymentInfo4 = deploymentInfoMock.setServletStackTraces(ServletStackTraces.NONE);
            doReturn(deploymentInfo4).when(deploymentInfoMock).setServletStackTraces(ServletStackTraces.NONE);
            doReturn(deploymentInfoMock6).when(deploymentInfoMock).setResourceManager((ResourceManager) any());
            File file = new File("pathname1");
            doReturn(deploymentInfoMock7).when(deploymentInfoMock).setTempDir(file);
            DeploymentInfo deploymentInfo5 = deploymentInfoMock.setEagerFilterInit(true);
            doReturn(deploymentInfo5).when(deploymentInfoMock).setEagerFilterInit(true);
            doNothing().when(deploymentInfoMock).setPreservePathOnForward(false);
            doReturn(deploymentInfoMock8).when(deploymentInfoMock).addMimeMapping((MimeMapping) any());
            doReturn(deploymentInfoMock9).when(deploymentInfoMock).setSessionPersistenceManager((SessionPersistenceManager) any());
            doReturn(deploymentInfoMock10).when(deploymentInfoMock).addLocaleCharsetMapping("locale", "charset");
            MimeMapping mimeMapping = new MimeMapping("", "mimeType1");
            List<MimeMapping> mimeMappingList = new ArrayList<>();
            mimeMappingList.add(mimeMapping);
            doReturn(mimeMappingList).when(deploymentInfoMock).getMimeMappings();
            servlets.when(() -> Servlets.newContainer()).thenReturn(servletContainerMock);
            doReturn(deploymentManagerMock).when(servletContainerMock).addDeployment(deploymentInfoMock);
            doNothing().when(deploymentManagerMock).deploy();
            Map<String, String> stringStringMap = new HashMap<>();
            stringStringMap.put("", "mimeType1");
            doNothing().when(deploymentImplMock).setMimeExtensionMappings(eq(stringStringMap));
            doReturn(deploymentImplMock, deploymentMock).when(deploymentManagerMock).getDeployment();
            doReturn(sessionManagerMock).when(deploymentMock).getSessionManager();
            doNothing().when(sessionManagerMock).setDefaultSessionTimeout(-1);
            target = spy(new UndertowServletWebServerFactory("/AB", 2));
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
            Duration duration = Duration.ofDays(0L);
            Session session = new Session();
            session.setPersistent(true);
            session.setTimeout(duration);
            target.setSession(session);
            target.setMimeMappings(mimeMappingsMock);
            doReturn(undertowServletWebServerMock).when(target).getUndertowWebServer((Undertow.Builder) any(), eq(deploymentManagerMock), eq(2));
            ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
            //Act Statement(s)
            WebServer result = target.getWebServer(servletContextInitializerArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(undertowServletWebServerMock));
                verify(errorPageMock, atLeast(1)).getStatus();
                verify(errorPageMock, atLeast(1)).getPath();
                verify(errorPageMock, atLeast(1)).getStatusCode();
                verify(mimeMappingsMock, atLeast(1)).iterator();
                _assert.verify(() -> Assert.notNull("/AB", "ContextPath must not be null"), atLeast(1));
                servlets.verify(() -> Servlets.deployment(), atLeast(1));
                verify(deploymentInfoMock, atLeast(1)).addServletContainerInitializer((ServletContainerInitializerInfo) any());
                verify(deploymentInfoMock, atLeast(1)).setClassLoader((ClassLoader) any());
                verify(deploymentInfoMock, atLeast(1)).setContextPath("/AB");
                verify(deploymentInfoMock, atLeast(1)).setDisplayName("displayName1");
                verify(deploymentInfoMock, atLeast(1)).setDeploymentName("spring-boot");
                verify(deploymentInfoMock, atLeast(1)).addServlet((ServletInfo) any());
                verify(deploymentInfoMock, atLeast(1)).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
                verify(deploymentInfoMock, atLeast(1)).setServletStackTraces(ServletStackTraces.NONE);
                verify(deploymentInfoMock, atLeast(1)).setResourceManager((ResourceManager) any());
                verify(deploymentInfoMock, atLeast(1)).setTempDir(file);
                verify(deploymentInfoMock, atLeast(1)).setEagerFilterInit(true);
                verify(deploymentInfoMock, atLeast(1)).setPreservePathOnForward(false);
                verify(deploymentInfoMock, atLeast(1)).addMimeMapping((MimeMapping) any());
                verify(deploymentInfoMock, atLeast(1)).setSessionPersistenceManager((SessionPersistenceManager) any());
                verify(deploymentInfoMock, atLeast(1)).addLocaleCharsetMapping("locale", "charset");
                verify(deploymentInfoMock, atLeast(1)).getMimeMappings();
                servlets.verify(() -> Servlets.newContainer(), atLeast(1));
                verify(servletContainerMock, atLeast(1)).addDeployment(deploymentInfoMock);
                verify(deploymentManagerMock, atLeast(1)).deploy();
                verify(deploymentManagerMock, times(2)).getDeployment();
                verify(deploymentImplMock, atLeast(1)).setMimeExtensionMappings(eq(stringStringMap));
                verify(deploymentMock, atLeast(1)).getSessionManager();
                verify(sessionManagerMock, atLeast(1)).setDefaultSessionTimeout(-1);
                verify(target, atLeast(1)).getUndertowWebServer((Undertow.Builder) any(), eq(deploymentManagerMock), eq(2));
            });
        }
    }

    //Sapient generated method id: ${getWebServerWhenIsZeroOrLessNotTimeoutDuration}, hash: 144F6CB9824501963424ED3BA9B8A7D4
    @Disabled()
    @Test()
    void getWebServerWhenIsZeroOrLessNotTimeoutDuration() throws Exception {
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
         * (manager.getDeployment() instanceof DeploymentImpl managerDeployment) : true  #  inside createManager method
         * (for-each(deploymentInfo.getMimeMappings())) : true  #  inside removeSuperfluousMimeMappings method
         * (timeoutDuration == null) : false  #  inside isZeroOrLess method
         * (timeoutDuration.isZero()) : false  #  inside isZeroOrLess method
         * (timeoutDuration.isNegative()) : false  #  inside isZeroOrLess method
         * (isZeroOrLess(timeoutDuration)) : false  #  inside createManager method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: createBuilder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
        DeploymentInfo deploymentInfoMock10 = mock(DeploymentInfo.class);
        ServletContainer servletContainerMock = mock(ServletContainer.class);
        DeploymentManager deploymentManagerMock = mock(DeploymentManager.class);
        DeploymentImpl deploymentImplMock = mock(DeploymentImpl.class);
        Deployment deploymentMock = mock(Deployment.class);
        SessionManager sessionManagerMock = mock(SessionManager.class);
        UndertowServletWebServer undertowServletWebServerMock = mock(UndertowServletWebServer.class);
        try (MockedStatic<Servlets> servlets = mockStatic(Servlets.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(HttpStatus.CONTINUE).when(errorPageMock).getStatus();
            doReturn("return_of_getPath1").when(errorPageMock).getPath();
            doReturn(0).when(errorPageMock).getStatusCode();
            MimeMappings.Mapping mimeMappingsMapping = new MimeMappings.Mapping("extension1", "mimeType1");
            List<MimeMappings.Mapping> mimeMappingsMappingList = new ArrayList<>();
            mimeMappingsMappingList.add(mimeMappingsMapping);
            Iterator<MimeMappings.Mapping> iterator = mimeMappingsMappingList.iterator();
            doReturn(iterator).when(mimeMappingsMock).iterator();
            _assert.when(() -> Assert.notNull("/AB", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            servlets.when(() -> Servlets.deployment()).thenReturn(deploymentInfoMock);
            doReturn(deploymentInfoMock2).when(deploymentInfoMock).addServletContainerInitializer((ServletContainerInitializerInfo) any());
            ClassLoader classLoader = UndertowServletWebServerFactory.class.getClassLoader();
            DeploymentInfo deploymentInfo = deploymentInfoMock.setClassLoader(classLoader);
            doReturn(deploymentInfo).when(deploymentInfoMock).setClassLoader((ClassLoader) any());
            doReturn(deploymentInfoMock3).when(deploymentInfoMock).setContextPath("/AB");
            doReturn(deploymentInfoMock4).when(deploymentInfoMock).setDisplayName("displayName1");
            DeploymentInfo deploymentInfo2 = deploymentInfoMock.setDeploymentName("spring-boot");
            doReturn(deploymentInfo2).when(deploymentInfoMock).setDeploymentName("spring-boot");
            ServletInfo servletInfo = Servlets.servlet("default", DefaultServlet.class);
            DeploymentInfo deploymentInfo3 = deploymentInfoMock.addServlet(servletInfo);
            doReturn(deploymentInfo3).when(deploymentInfoMock).addServlet((ServletInfo) any());
            doReturn(deploymentInfoMock5).when(deploymentInfoMock).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
            DeploymentInfo deploymentInfo4 = deploymentInfoMock.setServletStackTraces(ServletStackTraces.NONE);
            doReturn(deploymentInfo4).when(deploymentInfoMock).setServletStackTraces(ServletStackTraces.NONE);
            doReturn(deploymentInfoMock6).when(deploymentInfoMock).setResourceManager((ResourceManager) any());
            File file = new File("pathname1");
            doReturn(deploymentInfoMock7).when(deploymentInfoMock).setTempDir(file);
            DeploymentInfo deploymentInfo5 = deploymentInfoMock.setEagerFilterInit(true);
            doReturn(deploymentInfo5).when(deploymentInfoMock).setEagerFilterInit(true);
            doNothing().when(deploymentInfoMock).setPreservePathOnForward(false);
            doReturn(deploymentInfoMock8).when(deploymentInfoMock).addMimeMapping((MimeMapping) any());
            doReturn(deploymentInfoMock9).when(deploymentInfoMock).setSessionPersistenceManager((SessionPersistenceManager) any());
            doReturn(deploymentInfoMock10).when(deploymentInfoMock).addLocaleCharsetMapping("locale", "charset");
            MimeMapping mimeMapping = new MimeMapping("", "mimeType1");
            List<MimeMapping> mimeMappingList = new ArrayList<>();
            mimeMappingList.add(mimeMapping);
            doReturn(mimeMappingList).when(deploymentInfoMock).getMimeMappings();
            servlets.when(() -> Servlets.newContainer()).thenReturn(servletContainerMock);
            doReturn(deploymentManagerMock).when(servletContainerMock).addDeployment(deploymentInfoMock);
            doNothing().when(deploymentManagerMock).deploy();
            Map<String, String> stringStringMap = new HashMap<>();
            stringStringMap.put("", "mimeType1");
            doNothing().when(deploymentImplMock).setMimeExtensionMappings(eq(stringStringMap));
            doReturn(deploymentImplMock, deploymentMock).when(deploymentManagerMock).getDeployment();
            doReturn(sessionManagerMock).when(deploymentMock).getSessionManager();
            doNothing().when(sessionManagerMock).setDefaultSessionTimeout(1);
            target = spy(new UndertowServletWebServerFactory("/AB", 2));
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
            Duration duration = Duration.ofDays(0L);
            Session session = new Session();
            session.setPersistent(true);
            session.setTimeout(duration);
            target.setSession(session);
            target.setMimeMappings(mimeMappingsMock);
            doReturn(undertowServletWebServerMock).when(target).getUndertowWebServer((Undertow.Builder) any(), eq(deploymentManagerMock), eq(2));
            ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
            //Act Statement(s)
            WebServer result = target.getWebServer(servletContextInitializerArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(undertowServletWebServerMock));
                verify(errorPageMock, atLeast(1)).getStatus();
                verify(errorPageMock, atLeast(1)).getPath();
                verify(errorPageMock, atLeast(1)).getStatusCode();
                verify(mimeMappingsMock, atLeast(1)).iterator();
                _assert.verify(() -> Assert.notNull("/AB", "ContextPath must not be null"), atLeast(1));
                servlets.verify(() -> Servlets.deployment(), atLeast(1));
                verify(deploymentInfoMock, atLeast(1)).addServletContainerInitializer((ServletContainerInitializerInfo) any());
                verify(deploymentInfoMock, atLeast(1)).setClassLoader((ClassLoader) any());
                verify(deploymentInfoMock, atLeast(1)).setContextPath("/AB");
                verify(deploymentInfoMock, atLeast(1)).setDisplayName("displayName1");
                verify(deploymentInfoMock, atLeast(1)).setDeploymentName("spring-boot");
                verify(deploymentInfoMock, atLeast(1)).addServlet((ServletInfo) any());
                verify(deploymentInfoMock, atLeast(1)).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
                verify(deploymentInfoMock, atLeast(1)).setServletStackTraces(ServletStackTraces.NONE);
                verify(deploymentInfoMock, atLeast(1)).setResourceManager((ResourceManager) any());
                verify(deploymentInfoMock, atLeast(1)).setTempDir(file);
                verify(deploymentInfoMock, atLeast(1)).setEagerFilterInit(true);
                verify(deploymentInfoMock, atLeast(1)).setPreservePathOnForward(false);
                verify(deploymentInfoMock, atLeast(1)).addMimeMapping((MimeMapping) any());
                verify(deploymentInfoMock, atLeast(1)).setSessionPersistenceManager((SessionPersistenceManager) any());
                verify(deploymentInfoMock, atLeast(1)).addLocaleCharsetMapping("locale", "charset");
                verify(deploymentInfoMock, atLeast(1)).getMimeMappings();
                servlets.verify(() -> Servlets.newContainer(), atLeast(1));
                verify(servletContainerMock, atLeast(1)).addDeployment(deploymentInfoMock);
                verify(deploymentManagerMock, atLeast(1)).deploy();
                verify(deploymentManagerMock, times(2)).getDeployment();
                verify(deploymentImplMock, atLeast(1)).setMimeExtensionMappings(eq(stringStringMap));
                verify(deploymentMock, atLeast(1)).getSessionManager();
                verify(sessionManagerMock, atLeast(1)).setDefaultSessionTimeout(1);
                verify(target, atLeast(1)).getUndertowWebServer((Undertow.Builder) any(), eq(deploymentManagerMock), eq(2));
            });
        }
    }

    //Sapient generated method id: ${getWebServerWhenTimeoutDurationNotIsZeroAndTimeoutDurationIsNegativeAndIsZeroOrLessTimeoutDuration}, hash: C6AEB84A60A06CDAD337A015CDE7C37C
    @Disabled()
    @Test()
    void getWebServerWhenTimeoutDurationNotIsZeroAndTimeoutDurationIsNegativeAndIsZeroOrLessTimeoutDuration() throws Exception {
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
         * (manager.getDeployment() instanceof DeploymentImpl managerDeployment) : true  #  inside createManager method
         * (for-each(deploymentInfo.getMimeMappings())) : true  #  inside removeSuperfluousMimeMappings method
         * (timeoutDuration == null) : false  #  inside isZeroOrLess method
         * (timeoutDuration.isZero()) : false  #  inside isZeroOrLess method
         * (timeoutDuration.isNegative()) : true  #  inside isZeroOrLess method
         * (isZeroOrLess(timeoutDuration)) : true  #  inside createManager method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: createBuilder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
        DeploymentInfo deploymentInfoMock10 = mock(DeploymentInfo.class);
        ServletContainer servletContainerMock = mock(ServletContainer.class);
        DeploymentManager deploymentManagerMock = mock(DeploymentManager.class);
        DeploymentImpl deploymentImplMock = mock(DeploymentImpl.class);
        Deployment deploymentMock = mock(Deployment.class);
        SessionManager sessionManagerMock = mock(SessionManager.class);
        UndertowServletWebServer undertowServletWebServerMock = mock(UndertowServletWebServer.class);
        try (MockedStatic<Servlets> servlets = mockStatic(Servlets.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(null).when(errorPageMock).getStatus();
            doReturn(null).when(errorPageMock).getException();
            doReturn("return_of_getPath1").when(errorPageMock).getPath();
            MimeMappings.Mapping mimeMappingsMapping = new MimeMappings.Mapping("extension1", "mimeType1");
            List<MimeMappings.Mapping> mimeMappingsMappingList = new ArrayList<>();
            mimeMappingsMappingList.add(mimeMappingsMapping);
            Iterator<MimeMappings.Mapping> iterator = mimeMappingsMappingList.iterator();
            doReturn(iterator).when(mimeMappingsMock).iterator();
            _assert.when(() -> Assert.notNull("/AB", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            servlets.when(() -> Servlets.deployment()).thenReturn(deploymentInfoMock);
            doReturn(deploymentInfoMock2).when(deploymentInfoMock).addServletContainerInitializer((ServletContainerInitializerInfo) any());
            ClassLoader classLoader = UndertowServletWebServerFactory.class.getClassLoader();
            DeploymentInfo deploymentInfo = deploymentInfoMock.setClassLoader(classLoader);
            doReturn(deploymentInfo).when(deploymentInfoMock).setClassLoader((ClassLoader) any());
            doReturn(deploymentInfoMock3).when(deploymentInfoMock).setContextPath("/AB");
            doReturn(deploymentInfoMock4).when(deploymentInfoMock).setDisplayName("displayName1");
            DeploymentInfo deploymentInfo2 = deploymentInfoMock.setDeploymentName("spring-boot");
            doReturn(deploymentInfo2).when(deploymentInfoMock).setDeploymentName("spring-boot");
            ServletInfo servletInfo = Servlets.servlet("default", DefaultServlet.class);
            DeploymentInfo deploymentInfo3 = deploymentInfoMock.addServlet(servletInfo);
            doReturn(deploymentInfo3).when(deploymentInfoMock).addServlet((ServletInfo) any());
            doReturn(deploymentInfoMock5).when(deploymentInfoMock).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
            DeploymentInfo deploymentInfo4 = deploymentInfoMock.setServletStackTraces(ServletStackTraces.NONE);
            doReturn(deploymentInfo4).when(deploymentInfoMock).setServletStackTraces(ServletStackTraces.NONE);
            doReturn(deploymentInfoMock6).when(deploymentInfoMock).setResourceManager((ResourceManager) any());
            File file = new File("pathname1");
            doReturn(deploymentInfoMock7).when(deploymentInfoMock).setTempDir(file);
            DeploymentInfo deploymentInfo5 = deploymentInfoMock.setEagerFilterInit(true);
            doReturn(deploymentInfo5).when(deploymentInfoMock).setEagerFilterInit(true);
            doNothing().when(deploymentInfoMock).setPreservePathOnForward(false);
            doReturn(deploymentInfoMock8).when(deploymentInfoMock).addMimeMapping((MimeMapping) any());
            doReturn(deploymentInfoMock9).when(deploymentInfoMock).setSessionPersistenceManager((SessionPersistenceManager) any());
            doReturn(deploymentInfoMock10).when(deploymentInfoMock).addLocaleCharsetMapping("locale", "charset");
            MimeMapping mimeMapping = new MimeMapping("", "mimeType1");
            List<MimeMapping> mimeMappingList = new ArrayList<>();
            mimeMappingList.add(mimeMapping);
            doReturn(mimeMappingList).when(deploymentInfoMock).getMimeMappings();
            servlets.when(() -> Servlets.newContainer()).thenReturn(servletContainerMock);
            doReturn(deploymentManagerMock).when(servletContainerMock).addDeployment(deploymentInfoMock);
            doNothing().when(deploymentManagerMock).deploy();
            Map<String, String> stringStringMap = new HashMap<>();
            stringStringMap.put("", "mimeType1");
            doNothing().when(deploymentImplMock).setMimeExtensionMappings(eq(stringStringMap));
            doReturn(deploymentImplMock, deploymentMock).when(deploymentManagerMock).getDeployment();
            doReturn(sessionManagerMock).when(deploymentMock).getSessionManager();
            doNothing().when(sessionManagerMock).setDefaultSessionTimeout(-1);
            target = spy(new UndertowServletWebServerFactory("/AB", 8));
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
            Duration duration = Duration.ofDays(0L);
            Session session = new Session();
            session.setPersistent(true);
            session.setTimeout(duration);
            target.setSession(session);
            target.setMimeMappings(mimeMappingsMock);
            doReturn(undertowServletWebServerMock).when(target).getUndertowWebServer((Undertow.Builder) any(), eq(deploymentManagerMock), eq(8));
            ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
            //Act Statement(s)
            WebServer result = target.getWebServer(servletContextInitializerArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(undertowServletWebServerMock));
                verify(errorPageMock, atLeast(1)).getStatus();
                verify(errorPageMock, atLeast(1)).getException();
                verify(errorPageMock, atLeast(1)).getPath();
                verify(mimeMappingsMock, atLeast(1)).iterator();
                _assert.verify(() -> Assert.notNull("/AB", "ContextPath must not be null"), atLeast(1));
                servlets.verify(() -> Servlets.deployment(), atLeast(1));
                verify(deploymentInfoMock, atLeast(1)).addServletContainerInitializer((ServletContainerInitializerInfo) any());
                verify(deploymentInfoMock, atLeast(1)).setClassLoader((ClassLoader) any());
                verify(deploymentInfoMock, atLeast(1)).setContextPath("/AB");
                verify(deploymentInfoMock, atLeast(1)).setDisplayName("displayName1");
                verify(deploymentInfoMock, atLeast(1)).setDeploymentName("spring-boot");
                verify(deploymentInfoMock, atLeast(1)).addServlet((ServletInfo) any());
                verify(deploymentInfoMock, atLeast(1)).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
                verify(deploymentInfoMock, atLeast(1)).setServletStackTraces(ServletStackTraces.NONE);
                verify(deploymentInfoMock, atLeast(1)).setResourceManager((ResourceManager) any());
                verify(deploymentInfoMock, atLeast(1)).setTempDir(file);
                verify(deploymentInfoMock, atLeast(1)).setEagerFilterInit(true);
                verify(deploymentInfoMock, atLeast(1)).setPreservePathOnForward(false);
                verify(deploymentInfoMock, atLeast(1)).addMimeMapping((MimeMapping) any());
                verify(deploymentInfoMock, atLeast(1)).setSessionPersistenceManager((SessionPersistenceManager) any());
                verify(deploymentInfoMock, atLeast(1)).addLocaleCharsetMapping("locale", "charset");
                verify(deploymentInfoMock, atLeast(1)).getMimeMappings();
                servlets.verify(() -> Servlets.newContainer(), atLeast(1));
                verify(servletContainerMock, atLeast(1)).addDeployment(deploymentInfoMock);
                verify(deploymentManagerMock, atLeast(1)).deploy();
                verify(deploymentManagerMock, times(2)).getDeployment();
                verify(deploymentImplMock, atLeast(1)).setMimeExtensionMappings(eq(stringStringMap));
                verify(deploymentMock, atLeast(1)).getSessionManager();
                verify(sessionManagerMock, atLeast(1)).setDefaultSessionTimeout(-1);
                verify(target, atLeast(1)).getUndertowWebServer((Undertow.Builder) any(), eq(deploymentManagerMock), eq(8));
            });
        }
    }

    //Sapient generated method id: ${getWebServerWhenTimeoutDurationNotIsNegativeAndIsZeroOrLessNotTimeoutDuration}, hash: 56D7EA9D0AA43AF0C09201555DFB3606
    @Disabled()
    @Test()
    void getWebServerWhenTimeoutDurationNotIsNegativeAndIsZeroOrLessNotTimeoutDuration() throws Exception {
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
         * (manager.getDeployment() instanceof DeploymentImpl managerDeployment) : true  #  inside createManager method
         * (for-each(deploymentInfo.getMimeMappings())) : true  #  inside removeSuperfluousMimeMappings method
         * (timeoutDuration == null) : false  #  inside isZeroOrLess method
         * (timeoutDuration.isZero()) : false  #  inside isZeroOrLess method
         * (timeoutDuration.isNegative()) : false  #  inside isZeroOrLess method
         * (isZeroOrLess(timeoutDuration)) : false  #  inside createManager method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: createBuilder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
        DeploymentInfo deploymentInfoMock10 = mock(DeploymentInfo.class);
        ServletContainer servletContainerMock = mock(ServletContainer.class);
        DeploymentManager deploymentManagerMock = mock(DeploymentManager.class);
        DeploymentImpl deploymentImplMock = mock(DeploymentImpl.class);
        Deployment deploymentMock = mock(Deployment.class);
        SessionManager sessionManagerMock = mock(SessionManager.class);
        UndertowServletWebServer undertowServletWebServerMock = mock(UndertowServletWebServer.class);
        try (MockedStatic<Servlets> servlets = mockStatic(Servlets.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(null).when(errorPageMock).getStatus();
            doReturn(null).when(errorPageMock).getException();
            doReturn("return_of_getPath1").when(errorPageMock).getPath();
            MimeMappings.Mapping mimeMappingsMapping = new MimeMappings.Mapping("extension1", "mimeType1");
            List<MimeMappings.Mapping> mimeMappingsMappingList = new ArrayList<>();
            mimeMappingsMappingList.add(mimeMappingsMapping);
            Iterator<MimeMappings.Mapping> iterator = mimeMappingsMappingList.iterator();
            doReturn(iterator).when(mimeMappingsMock).iterator();
            _assert.when(() -> Assert.notNull("/AB", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            servlets.when(() -> Servlets.deployment()).thenReturn(deploymentInfoMock);
            doReturn(deploymentInfoMock2).when(deploymentInfoMock).addServletContainerInitializer((ServletContainerInitializerInfo) any());
            ClassLoader classLoader = UndertowServletWebServerFactory.class.getClassLoader();
            DeploymentInfo deploymentInfo = deploymentInfoMock.setClassLoader(classLoader);
            doReturn(deploymentInfo).when(deploymentInfoMock).setClassLoader((ClassLoader) any());
            doReturn(deploymentInfoMock3).when(deploymentInfoMock).setContextPath("/AB");
            doReturn(deploymentInfoMock4).when(deploymentInfoMock).setDisplayName("displayName1");
            DeploymentInfo deploymentInfo2 = deploymentInfoMock.setDeploymentName("spring-boot");
            doReturn(deploymentInfo2).when(deploymentInfoMock).setDeploymentName("spring-boot");
            ServletInfo servletInfo = Servlets.servlet("default", DefaultServlet.class);
            DeploymentInfo deploymentInfo3 = deploymentInfoMock.addServlet(servletInfo);
            doReturn(deploymentInfo3).when(deploymentInfoMock).addServlet((ServletInfo) any());
            doReturn(deploymentInfoMock5).when(deploymentInfoMock).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
            DeploymentInfo deploymentInfo4 = deploymentInfoMock.setServletStackTraces(ServletStackTraces.NONE);
            doReturn(deploymentInfo4).when(deploymentInfoMock).setServletStackTraces(ServletStackTraces.NONE);
            doReturn(deploymentInfoMock6).when(deploymentInfoMock).setResourceManager((ResourceManager) any());
            File file = new File("pathname1");
            doReturn(deploymentInfoMock7).when(deploymentInfoMock).setTempDir(file);
            DeploymentInfo deploymentInfo5 = deploymentInfoMock.setEagerFilterInit(true);
            doReturn(deploymentInfo5).when(deploymentInfoMock).setEagerFilterInit(true);
            doNothing().when(deploymentInfoMock).setPreservePathOnForward(false);
            doReturn(deploymentInfoMock8).when(deploymentInfoMock).addMimeMapping((MimeMapping) any());
            doReturn(deploymentInfoMock9).when(deploymentInfoMock).setSessionPersistenceManager((SessionPersistenceManager) any());
            doReturn(deploymentInfoMock10).when(deploymentInfoMock).addLocaleCharsetMapping("locale", "charset");
            MimeMapping mimeMapping = new MimeMapping("", "mimeType1");
            List<MimeMapping> mimeMappingList = new ArrayList<>();
            mimeMappingList.add(mimeMapping);
            doReturn(mimeMappingList).when(deploymentInfoMock).getMimeMappings();
            servlets.when(() -> Servlets.newContainer()).thenReturn(servletContainerMock);
            doReturn(deploymentManagerMock).when(servletContainerMock).addDeployment(deploymentInfoMock);
            doNothing().when(deploymentManagerMock).deploy();
            Map<String, String> stringStringMap = new HashMap<>();
            stringStringMap.put("", "mimeType1");
            doNothing().when(deploymentImplMock).setMimeExtensionMappings(eq(stringStringMap));
            doReturn(deploymentImplMock, deploymentMock).when(deploymentManagerMock).getDeployment();
            doReturn(sessionManagerMock).when(deploymentMock).getSessionManager();
            doNothing().when(sessionManagerMock).setDefaultSessionTimeout(1);
            target = spy(new UndertowServletWebServerFactory("/AB", 8));
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
            Duration duration = Duration.ofDays(0L);
            Session session = new Session();
            session.setPersistent(true);
            session.setTimeout(duration);
            target.setSession(session);
            target.setMimeMappings(mimeMappingsMock);
            doReturn(undertowServletWebServerMock).when(target).getUndertowWebServer((Undertow.Builder) any(), eq(deploymentManagerMock), eq(8));
            ServletContextInitializer[] servletContextInitializerArray = new ServletContextInitializer[] {};
            //Act Statement(s)
            WebServer result = target.getWebServer(servletContextInitializerArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(undertowServletWebServerMock));
                verify(errorPageMock, atLeast(1)).getStatus();
                verify(errorPageMock, atLeast(1)).getException();
                verify(errorPageMock, atLeast(1)).getPath();
                verify(mimeMappingsMock, atLeast(1)).iterator();
                _assert.verify(() -> Assert.notNull("/AB", "ContextPath must not be null"), atLeast(1));
                servlets.verify(() -> Servlets.deployment(), atLeast(1));
                verify(deploymentInfoMock, atLeast(1)).addServletContainerInitializer((ServletContainerInitializerInfo) any());
                verify(deploymentInfoMock, atLeast(1)).setClassLoader((ClassLoader) any());
                verify(deploymentInfoMock, atLeast(1)).setContextPath("/AB");
                verify(deploymentInfoMock, atLeast(1)).setDisplayName("displayName1");
                verify(deploymentInfoMock, atLeast(1)).setDeploymentName("spring-boot");
                verify(deploymentInfoMock, atLeast(1)).addServlet((ServletInfo) any());
                verify(deploymentInfoMock, atLeast(1)).addErrorPage((io.undertow.servlet.api.ErrorPage) any());
                verify(deploymentInfoMock, atLeast(1)).setServletStackTraces(ServletStackTraces.NONE);
                verify(deploymentInfoMock, atLeast(1)).setResourceManager((ResourceManager) any());
                verify(deploymentInfoMock, atLeast(1)).setTempDir(file);
                verify(deploymentInfoMock, atLeast(1)).setEagerFilterInit(true);
                verify(deploymentInfoMock, atLeast(1)).setPreservePathOnForward(false);
                verify(deploymentInfoMock, atLeast(1)).addMimeMapping((MimeMapping) any());
                verify(deploymentInfoMock, atLeast(1)).setSessionPersistenceManager((SessionPersistenceManager) any());
                verify(deploymentInfoMock, atLeast(1)).addLocaleCharsetMapping("locale", "charset");
                verify(deploymentInfoMock, atLeast(1)).getMimeMappings();
                servlets.verify(() -> Servlets.newContainer(), atLeast(1));
                verify(servletContainerMock, atLeast(1)).addDeployment(deploymentInfoMock);
                verify(deploymentManagerMock, atLeast(1)).deploy();
                verify(deploymentManagerMock, times(2)).getDeployment();
                verify(deploymentImplMock, atLeast(1)).setMimeExtensionMappings(eq(stringStringMap));
                verify(deploymentMock, atLeast(1)).getSessionManager();
                verify(sessionManagerMock, atLeast(1)).setDefaultSessionTimeout(1);
                verify(target, atLeast(1)).getUndertowWebServer((Undertow.Builder) any(), eq(deploymentManagerMock), eq(8));
            });
        }
    }

    //Sapient generated method id: ${getUndertowWebServerWhenPortGreaterThanOrEqualsTo0}, hash: F102B80D37DA2C82AF0CB41295DC5212
    @Test()
    void getUndertowWebServerWhenPortGreaterThanOrEqualsTo0() {
        /* Branches:
         * (sessionSameSite != null) : true  #  inside getCookieHandlerFactory method
         * (!CollectionUtils.isEmpty(getCookieSameSiteSuppliers())) : true  #  inside getCookieHandlerFactory method
         * (!suppliers.isEmpty()) : true  #  inside getCookieHandlerFactory method
         * (cooHandlerFactory != null) : false
         * (port >= 0) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: createHttpHandlerFactories
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeploymentManager managerMock = mock(DeploymentManager.class);
        Deployment deploymentMock = mock(Deployment.class);
        ServletContextImpl servletContextImplMock = mock(ServletContextImpl.class);
        SessionCookieConfigImpl sessionCookieConfigImplMock = mock(SessionCookieConfigImpl.class);
        Session sessionMock = mock(Session.class);
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
            doReturn(sessionCookie).when(sessionMock).getCookie();
            _assert.when(() -> Assert.notNull("/A", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            cookieSameSiteSupplier.when(() -> CookieSameSiteSupplier.of(Cookie.SameSite.NONE)).thenReturn(cookieSameSiteSupplierMock);
            doReturn(cookieSameSiteSupplierMock2).when(cookieSameSiteSupplierMock).whenHasName("return_of_getName1");
            collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(false);
            target = new UndertowServletWebServerFactory("/A", 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            target.setSession(sessionMock);
            List<CookieSameSiteSupplier> cookieSameSiteSupplierList = new ArrayList<>();
            target.setCookieSameSiteSuppliers(cookieSameSiteSupplierList);
            //Act Statement(s)
            UndertowServletWebServer result = target.getUndertowWebServer(undertowBuilderMock, managerMock, 1);
            //Assert statement(s)
            //TODO: Please implement equals method in UndertowServletWebServer for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(managerMock).getDeployment();
                verify(deploymentMock).getServletContext();
                verify(servletContextImplMock).getSessionCookieConfig();
                verify(sessionCookieConfigImplMock).getName();
                verify(sessionMock).getCookie();
                _assert.verify(() -> Assert.notNull("/A", "ContextPath must not be null"), atLeast(1));
                cookieSameSiteSupplier.verify(() -> CookieSameSiteSupplier.of(Cookie.SameSite.NONE), atLeast(1));
                verify(cookieSameSiteSupplierMock).whenHasName("return_of_getName1");
                collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()));
            });
        }
    }

    //Sapient generated method id: ${getUndertowWebServerWhenCooHandlerFactoryIsNullAndPortLessThan0}, hash: 3A8A041325A7FBC8E7D1083BB5F4DC7D
    @Disabled()
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
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: createHttpHandlerFactories
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeploymentManager managerMock = mock(DeploymentManager.class);
        Deployment deploymentMock = mock(Deployment.class);
        ServletContextImpl servletContextImplMock = mock(ServletContextImpl.class);
        SessionCookieConfigImpl sessionCookieConfigImplMock = mock(SessionCookieConfigImpl.class);
        Session sessionMock = mock(Session.class);
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
            doReturn(sessionCookie).when(sessionMock).getCookie();
            _assert.when(() -> Assert.notNull("contextPath1", "ContextPath must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            cookieSameSiteSupplier.when(() -> CookieSameSiteSupplier.of(Cookie.SameSite.NONE)).thenReturn(cookieSameSiteSupplierMock);
            doReturn(cookieSameSiteSupplierMock2).when(cookieSameSiteSupplierMock).whenHasName("return_of_getName1");
            collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(false);
            target = new UndertowServletWebServerFactory("contextPath1", 0);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            target.setSession(sessionMock);
            List<CookieSameSiteSupplier> cookieSameSiteSupplierList = new ArrayList<>();
            target.setCookieSameSiteSuppliers(cookieSameSiteSupplierList);
            //Act Statement(s)
            UndertowServletWebServer result = target.getUndertowWebServer(undertowBuilderMock, managerMock, 0);
            //Assert statement(s)
            //TODO: Please implement equals method in UndertowServletWebServer for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(managerMock).getDeployment();
                verify(deploymentMock).getServletContext();
                verify(servletContextImplMock).getSessionCookieConfig();
                verify(sessionCookieConfigImplMock).getName();
                verify(sessionMock).getCookie();
                _assert.verify(() -> Assert.notNull("contextPath1", "ContextPath must not be null"), atLeast(1));
                cookieSameSiteSupplier.verify(() -> CookieSameSiteSupplier.of(Cookie.SameSite.NONE), atLeast(1));
                verify(cookieSameSiteSupplierMock).whenHasName("return_of_getName1");
                collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()));
            });
        }
    }
}
