package org.springframework.boot.web.embedded.undertow;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.springframework.boot.web.server.Shutdown;
import org.mockito.stubbing.Answer;
import org.springframework.boot.web.server.AbstractConfigurableWebServerFactory;
import org.springframework.boot.web.server.Ssl;
import org.springframework.boot.web.server.Compression;
import org.springframework.util.Assert;
import java.net.InetAddress;
import java.util.Collection;
import io.undertow.Undertow;
import java.util.function.Supplier;
import org.mockito.MockedStatic;
import org.springframework.boot.web.server.Http2;
import java.io.File;
import java.util.ArrayList;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UndertowWebServerFactoryDelegateSapientGeneratedTest {

    private final AbstractConfigurableWebServerFactory factoryMock = mock(AbstractConfigurableWebServerFactory.class);

    private final Ssl sslMock = mock(Ssl.class);

    private final Supplier supplierMock = mock(Supplier.class);

    //Sapient generated method id: ${setBuilderCustomizersTest}, hash: 4F42A53762BDAFEE78B7871862841470
    @Test()
    void setBuilderCustomizersTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(anyCollection(), eq("Customizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            UndertowWebServerFactoryDelegate target = new UndertowWebServerFactoryDelegate();
            Collection<UndertowBuilderCustomizer> collection = new ArrayList<>();
            //Act Statement(s)
            target.setBuilderCustomizers(collection);
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.notNull(anyCollection(), eq("Customizers must not be null"))));
        }
    }

    //Sapient generated method id: ${addBuilderCustomizersTest}, hash: E156F93594A0895AA171FE21AFE29F67
    @Test()
    void addBuilderCustomizersTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            UndertowBuilderCustomizer[] undertowBuilderCustomizerArray = new UndertowBuilderCustomizer[] {};
            _assert.when(() -> Assert.notNull(undertowBuilderCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            UndertowWebServerFactoryDelegate target = new UndertowWebServerFactoryDelegate();
            //Act Statement(s)
            target.addBuilderCustomizers(undertowBuilderCustomizerArray);
            //Assert statement(s)
            assertAll("result", () -> _assert.verify(() -> Assert.notNull(undertowBuilderCustomizerArray, "Customizers must not be null"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${getBuilderCustomizersTest}, hash: AB1FBED08EEB3CD4D53781B6AB8FF369
    @Test()
    void getBuilderCustomizersTest() {
        //Arrange Statement(s)
        UndertowWebServerFactoryDelegate target = new UndertowWebServerFactoryDelegate();
        //Act Statement(s)
        Collection<UndertowBuilderCustomizer> result = target.getBuilderCustomizers();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${createBuilderWhenThisBuilderCustomizersIsEmpty}, hash: F2E458F847FCF276D8B9D8B35F3F1719
    @Disabled()
    @Test()
    void createBuilderWhenThisBuilderCustomizersIsEmpty() {
        /* Branches:
         * (this.bufferSize != null) : false
         * (this.ioThreads != null) : false
         * (this.workerThreads != null) : false
         * (this.directBuffers != null) : false
         * (http2 != null) : true
         * (Ssl.isEnabled(ssl)) : true
         * (for-each(this.builderCustomizers)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Ssl> ssl = mockStatic(Ssl.class)) {
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            doReturn(inetAddress).when(factoryMock).getAddress();
            doReturn(0).when(factoryMock).getPort();
            Http2 http2 = new Http2();
            http2.setEnabled(false);
            doReturn(http2).when(factoryMock).getHttp2();
            Ssl ssl2 = new Ssl();
            ssl2.setClientAuth(Ssl.ClientAuth.NONE);
            doReturn(ssl2).when(factoryMock).getSsl();
            ssl.when(() -> Ssl.isEnabled(ssl2)).thenReturn(true);
            UndertowWebServerFactoryDelegate target = new UndertowWebServerFactoryDelegate();
            //Act Statement(s)
            Undertow.Builder result = target.createBuilder(factoryMock, supplierMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(factoryMock).getAddress();
                verify(factoryMock, times(2)).getPort();
                verify(factoryMock).getHttp2();
                verify(factoryMock).getSsl();
                ssl.verify(() -> Ssl.isEnabled(ssl2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${createBuilderWhenAddressIsNotNullAndThisBuilderCustomizersIsEmpty}, hash: DCFDBBEC458457F52B707C72E692DD29
    @Test()
    void createBuilderWhenAddressIsNotNullAndThisBuilderCustomizersIsEmpty() {
        /* Branches:
         * (this.bufferSize != null) : false
         * (this.ioThreads != null) : false
         * (this.workerThreads != null) : false
         * (this.directBuffers != null) : false
         * (http2 != null) : true
         * (Ssl.isEnabled(ssl)) : false
         * (address != null) : true
         * (for-each(this.builderCustomizers)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Ssl> ssl = mockStatic(Ssl.class)) {
            InetAddress inetAddress = InetAddress.getLoopbackAddress();
            doReturn(inetAddress).when(factoryMock).getAddress();
            doReturn(0).when(factoryMock).getPort();
            Http2 http2 = new Http2();
            http2.setEnabled(false);
            doReturn(http2).when(factoryMock).getHttp2();
            doReturn(sslMock).when(factoryMock).getSsl();
            ssl.when(() -> Ssl.isEnabled(sslMock)).thenReturn(false);
            UndertowWebServerFactoryDelegate target = new UndertowWebServerFactoryDelegate();
            //Act Statement(s)
            Undertow.Builder result = target.createBuilder(factoryMock, supplierMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(factoryMock).getAddress();
                verify(factoryMock).getPort();
                verify(factoryMock).getHttp2();
                verify(factoryMock).getSsl();
                ssl.verify(() -> Ssl.isEnabled(sslMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${createBuilderWhenAddressIsNullAndThisBuilderCustomizersIsEmpty}, hash: 9B82BD671EC44A1B300F541862590016
    @Test()
    void createBuilderWhenAddressIsNullAndThisBuilderCustomizersIsEmpty() {
        /* Branches:
         * (this.bufferSize != null) : false
         * (this.ioThreads != null) : false
         * (this.workerThreads != null) : false
         * (this.directBuffers != null) : false
         * (http2 != null) : true
         * (Ssl.isEnabled(ssl)) : false
         * (address != null) : false
         * (for-each(this.builderCustomizers)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Ssl> ssl = mockStatic(Ssl.class)) {
            doReturn(null).when(factoryMock).getAddress();
            doReturn(0).when(factoryMock).getPort();
            Http2 http2 = new Http2();
            http2.setEnabled(false);
            doReturn(http2).when(factoryMock).getHttp2();
            doReturn(sslMock).when(factoryMock).getSsl();
            ssl.when(() -> Ssl.isEnabled(sslMock)).thenReturn(false);
            UndertowWebServerFactoryDelegate target = new UndertowWebServerFactoryDelegate();
            //Act Statement(s)
            Undertow.Builder result = target.createBuilder(factoryMock, supplierMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(factoryMock).getAddress();
                verify(factoryMock).getPort();
                verify(factoryMock).getHttp2();
                verify(factoryMock).getSsl();
                ssl.verify(() -> Ssl.isEnabled(sslMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${createHttpHandlerFactoriesWhenIsAccessLogEnabled}, hash: F6F483816D33931F0D7669C631147CA8
    @Test()
    void createHttpHandlerFactoriesWhenIsAccessLogEnabled() {
        /* Branches:
         * (isAccessLogEnabled()) : true
         */
        //Arrange Statement(s)
        AbstractConfigurableWebServerFactory webServerFactoryMock = mock(AbstractConfigurableWebServerFactory.class);
        Compression compressionMock = mock(Compression.class);
        try (MockedStatic<UndertowWebServerFactoryDelegate> undertowWebServerFactoryDelegate = mockStatic(UndertowWebServerFactoryDelegate.class)) {
            doReturn(compressionMock).when(webServerFactoryMock).getCompression();
            doReturn("return_of_getServerHeader1").when(webServerFactoryMock).getServerHeader();
            doReturn(Shutdown.GRACEFUL).when(webServerFactoryMock).getShutdown();
            AccessLogHttpHandlerFactory accessLogHttpHandlerFactory = new AccessLogHttpHandlerFactory((File) null, (String) null, (String) null, (String) null, true);
            List<HttpHandlerFactory> httpHandlerFactoryList = new ArrayList<>();
            httpHandlerFactoryList.add(accessLogHttpHandlerFactory);
            HttpHandlerFactory[] httpHandlerFactoryArray = new HttpHandlerFactory[] {};
            undertowWebServerFactoryDelegate.when(() -> UndertowWebServerFactoryDelegate.createHttpHandlerFactories(compressionMock, false, "return_of_getServerHeader1", Shutdown.GRACEFUL, httpHandlerFactoryArray)).thenReturn(httpHandlerFactoryList);
            UndertowWebServerFactoryDelegate target = spy(new UndertowWebServerFactoryDelegate());
            doReturn(true).when(target).isAccessLogEnabled();
            //Act Statement(s)
            List<HttpHandlerFactory> result = target.createHttpHandlerFactories(webServerFactoryMock, httpHandlerFactoryArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(httpHandlerFactoryList));
                verify(webServerFactoryMock).getCompression();
                verify(webServerFactoryMock).getServerHeader();
                verify(webServerFactoryMock).getShutdown();
                undertowWebServerFactoryDelegate.verify(() -> UndertowWebServerFactoryDelegate.createHttpHandlerFactories(compressionMock, false, "return_of_getServerHeader1", Shutdown.GRACEFUL, httpHandlerFactoryArray), atLeast(1));
                verify(target).isAccessLogEnabled();
            });
        }
    }

    //Sapient generated method id: ${createHttpHandlerFactories1WhenUseForwardHeadersAndStringUtilsHasTextServerHeaderAndShutdownEqualsShutdownGRACEFUL}, hash: 3EF5C6B6E47E10F0E9498D1BCCDF6335
    @Test()
    void createHttpHandlerFactories1WhenUseForwardHeadersAndStringUtilsHasTextServerHeaderAndShutdownEqualsShutdownGRACEFUL() {
        /* Branches:
         * (compression != null) : true
         * (compression.getEnabled()) : true
         * (useForwardHeaders) : true
         * (StringUtils.hasText(serverHeader)) : true
         * (shutdown == Shutdown.GRACEFUL) : true
         */
        //Arrange Statement(s)
        Compression compression = new Compression();
        compression.setEnabled(true);
        HttpHandlerFactory[] httpHandlerFactoryArray = new HttpHandlerFactory[] {};
        //Act Statement(s)
        List<HttpHandlerFactory> result = UndertowWebServerFactoryDelegate.createHttpHandlerFactories(compression, true, "B", Shutdown.GRACEFUL, httpHandlerFactoryArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
