package org.springframework.boot.web.reactive.result.view;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import com.samskivert.mustache.MustacheException;
import java.io.Writer;
import com.samskivert.mustache.Template;
import java.util.Locale;
import org.mockito.MockitoAnnotations;
import org.springframework.core.io.buffer.DataBufferFactory;
import com.samskivert.mustache.Mustache;
import java.util.Map;
import java.util.HashMap;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DataBufferUtils;
import java.nio.charset.Charset;
import org.springframework.core.ReactiveAdapterRegistry;
import reactor.core.publisher.Mono;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.http.MediaType;
import org.springframework.context.ApplicationContext;
import java.io.OutputStream;
import java.io.InputStreamReader;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.core.io.Resource;
import org.mockito.MockedStatic;
import reactor.core.publisher.Flux;
import java.io.ByteArrayOutputStream;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.atLeast;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MustacheViewSapientGeneratedTest {

    private final Mustache.Compiler compilerMock = mock(Mustache.Compiler.class, "compiler");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private MustacheView target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${checkResourceExistsWhenResourceNotExistsAndResolveResourceIsNull}, hash: 1E63E93B1346FD71F843FA8D2145244F
    @Test()
    void checkResourceExistsWhenResourceNotExistsAndResolveResourceIsNull() throws Exception {
        /* Branches:
         * (resource == null) : false  #  inside resolveResource method
         * (!resource.exists()) : true  #  inside resolveResource method
         * (resolveResource() != null) : false
         */
        //Arrange Statement(s)
        ApplicationContext applicationContextMock = mock(ApplicationContext.class);
        Resource resourceMock = mock(Resource.class);
        doReturn(resourceMock).when(applicationContextMock).getResource("url1");
        doReturn(false).when(resourceMock).exists();
        target = new MustacheView();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        target.setApplicationContext(applicationContextMock);
        target.setUrl("url1");
        Locale locale = new Locale("language1");
        //Act Statement(s)
        boolean result = target.checkResourceExists(locale);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(applicationContextMock).getResource("url1");
            verify(resourceMock).exists();
        });
    }

    //Sapient generated method id: ${checkResourceExistsWhenResolveResourceIsNotNull}, hash: DB550B1A0BBE9F22F87A0B8F88643E31
    @Test()
    void checkResourceExistsWhenResolveResourceIsNotNull() throws Exception {
        /* Branches:
         * (resource == null) : false  #  inside resolveResource method
         * (!resource.exists()) : false  #  inside resolveResource method
         * (resolveResource() != null) : true
         */
        //Arrange Statement(s)
        ApplicationContext applicationContextMock = mock(ApplicationContext.class);
        Resource resourceMock = mock(Resource.class);
        doReturn(resourceMock).when(applicationContextMock).getResource("url1");
        doReturn(true).when(resourceMock).exists();
        target = new MustacheView();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        target.setApplicationContext(applicationContextMock);
        target.setUrl("url1");
        Locale locale = new Locale("language1");
        //Act Statement(s)
        boolean result = target.checkResourceExists(locale);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(applicationContextMock).getResource("url1");
            verify(resourceMock).exists();
        });
    }

    //Sapient generated method id: ${renderInternalWhenResourceNotExistsAndResourceIsNull}, hash: F9C57C813717B89560CFF59822C96A1A
    @Test()
    void renderInternalWhenResourceNotExistsAndResourceIsNull() throws Throwable, Exception {
        /* Branches:
         * (resource == null) : false  #  inside resolveResource method
         * (!resource.exists()) : true  #  inside resolveResource method
         * (resource == null) : true
         */
        //Arrange Statement(s)
        ApplicationContext applicationContextMock = mock(ApplicationContext.class);
        Resource resourceMock = mock(Resource.class);
        Mono<Void> monoMock = mock(Mono.class);
        MediaType mediaTypeMock = mock(MediaType.class);
        ServerWebExchange serverWebExchangeMock = mock(ServerWebExchange.class);
        try (MockedStatic<Mono> mono = mockStatic(Mono.class)) {
            doReturn(resourceMock).when(applicationContextMock).getResource("A");
            doReturn(false).when(resourceMock).exists();
            mono.when(() -> Mono.error((IllegalStateException) any())).thenReturn(monoMock);
            target = new MustacheView();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            target.setApplicationContext(applicationContextMock);
            target.setUrl("A");
            Map<String, Object> stringObjectMap = new HashMap<>();
            //Act Statement(s)
            Mono<Void> result = target.renderInternal(stringObjectMap, mediaTypeMock, serverWebExchangeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(monoMock));
                verify(applicationContextMock).getResource("A");
                verify(resourceMock).exists();
                mono.verify(() -> Mono.error((IllegalStateException) any()));
            });
        }
    }

    //Sapient generated method id: ${renderInternalWhenDefaultBranch}, hash: 5EC23F790EE3B4501773C7FA69598CE3
    @Disabled()
    @Test()
    void renderInternalWhenDefaultBranch() throws Throwable, Exception {
        /* Branches:
         * (resource == null) : false  #  inside resolveResource method
         * (!resource.exists()) : false  #  inside resolveResource method
         * (resource == null) : false
         * (this.charset != null) : true  #  inside getReader method
         * (mediaType != null) : true  #  inside getCharset method
         * (branch expression (line 95)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.InputStreamReader
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MediaType mediaTypeMock = mock(MediaType.class);
        ServerWebExchange exchangeMock = mock(ServerWebExchange.class);
        ServerHttpResponse serverHttpResponseMock = mock(ServerHttpResponse.class);
        DataBufferFactory dataBufferFactoryMock = mock(DataBufferFactory.class);
        DataBuffer dataBufferMock = mock(DataBuffer.class);
        ServerHttpResponse serverHttpResponseMock2 = mock(ServerHttpResponse.class);
        Mono<Void> monoMock = mock(Mono.class);
        Flux<DataBuffer> fluxMock = mock(Flux.class);
        ApplicationContext applicationContextMock = mock(ApplicationContext.class);
        Resource resourceMock = mock(Resource.class);
        Template templateMock = mock(Template.class);
        try (MockedStatic<Flux> flux = mockStatic(Flux.class)) {
            Charset charset = Charset.defaultCharset();
            doReturn(charset).when(mediaTypeMock).getCharset();
            doReturn(dataBufferFactoryMock).when(serverHttpResponseMock).bufferFactory();
            doReturn(dataBufferMock).when(dataBufferFactoryMock).allocateBuffer(256);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            doReturn(byteArrayOutputStream).when(dataBufferMock).asOutputStream();
            doReturn(serverHttpResponseMock, serverHttpResponseMock2).when(exchangeMock).getResponse();
            doReturn(monoMock).when(serverHttpResponseMock2).writeWith(fluxMock);
            doReturn(resourceMock).when(applicationContextMock).getResource("url1");
            doReturn(true).when(resourceMock).exists();
            doReturn(null).when(resourceMock).getInputStream();
            flux.when(() -> Flux.just(dataBufferMock)).thenReturn(fluxMock);
            target = new MustacheView();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            target.setCharset("charset1");
            target.setApplicationContext(applicationContextMock);
            target.setUrl("url1");
            doReturn(templateMock).when(compilerMock).compile((InputStreamReader) any());
            Map<String, Object> stringObjectMap = new HashMap<>();
            doNothing().when(templateMock).execute(eq(stringObjectMap), (Writer) any());
            //Act Statement(s)
            Mono<Void> result = target.renderInternal(stringObjectMap, mediaTypeMock, exchangeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(monoMock));
                verify(mediaTypeMock).getCharset();
                verify(exchangeMock, times(2)).getResponse();
                verify(serverHttpResponseMock).bufferFactory();
                verify(dataBufferFactoryMock).allocateBuffer(256);
                verify(dataBufferMock).asOutputStream();
                verify(serverHttpResponseMock2).writeWith(fluxMock);
                verify(applicationContextMock).getResource("url1");
                verify(resourceMock).exists();
                verify(resourceMock).getInputStream();
                flux.verify(() -> Flux.just(dataBufferMock), atLeast(1));
                verify(compilerMock).compile((InputStreamReader) any());
                verify(templateMock).execute(eq(stringObjectMap), (Writer) any());
            });
        }
    }

    //Sapient generated method id: ${renderInternalWhenThisCharsetIsNullAndMediaTypeIsNullAndDefaultBranch}, hash: 44432872D8428ECF5F9E4947E1483204
    @Disabled()
    @Test()
    void renderInternalWhenThisCharsetIsNullAndMediaTypeIsNullAndDefaultBranch() throws Throwable, Exception {
        /* Branches:
         * (resource == null) : false  #  inside resolveResource method
         * (!resource.exists()) : false  #  inside resolveResource method
         * (resource == null) : false
         * (this.charset != null) : false  #  inside getReader method
         * (mediaType != null) : false  #  inside getCharset method
         * (branch expression (line 95)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.OutputStreamWriter
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ServerWebExchange exchangeMock = mock(ServerWebExchange.class);
        ServerHttpResponse serverHttpResponseMock = mock(ServerHttpResponse.class);
        DataBufferFactory dataBufferFactoryMock = mock(DataBufferFactory.class);
        DataBuffer dataBufferMock = mock(DataBuffer.class);
        ServerHttpResponse serverHttpResponseMock2 = mock(ServerHttpResponse.class);
        Mono<Void> monoMock = mock(Mono.class);
        Flux<DataBuffer> fluxMock = mock(Flux.class);
        ApplicationContext applicationContextMock = mock(ApplicationContext.class);
        Resource resourceMock = mock(Resource.class);
        Template templateMock = mock(Template.class);
        try (MockedStatic<Flux> flux = mockStatic(Flux.class)) {
            doReturn(dataBufferFactoryMock).when(serverHttpResponseMock).bufferFactory();
            doReturn(dataBufferMock).when(dataBufferFactoryMock).allocateBuffer(256);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            doReturn(byteArrayOutputStream).when(dataBufferMock).asOutputStream();
            doReturn(serverHttpResponseMock, serverHttpResponseMock2).when(exchangeMock).getResponse();
            doReturn(monoMock).when(serverHttpResponseMock2).writeWith(fluxMock);
            doReturn(resourceMock).when(applicationContextMock).getResource("url1");
            doReturn(true).when(resourceMock).exists();
            doReturn(null).when(resourceMock).getInputStream();
            flux.when(() -> Flux.just(dataBufferMock)).thenReturn(fluxMock);
            target = new MustacheView();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            target.setCharset((String) null);
            target.setApplicationContext(applicationContextMock);
            Charset charset = Charset.defaultCharset();
            target.setDefaultCharset(charset);
            target.setUrl("url1");
            doReturn(templateMock).when(compilerMock).compile((InputStreamReader) any());
            Map<String, Object> stringObjectMap = new HashMap<>();
            doNothing().when(templateMock).execute(eq(stringObjectMap), (Writer) any());
            MediaType mediaType = null;
            //Act Statement(s)
            Mono<Void> result = target.renderInternal(stringObjectMap, mediaType, exchangeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(monoMock));
                verify(exchangeMock, times(2)).getResponse();
                verify(serverHttpResponseMock).bufferFactory();
                verify(dataBufferFactoryMock).allocateBuffer(256);
                verify(dataBufferMock).asOutputStream();
                verify(serverHttpResponseMock2).writeWith(fluxMock);
                verify(applicationContextMock).getResource("url1");
                verify(resourceMock).exists();
                verify(resourceMock).getInputStream();
                flux.verify(() -> Flux.just(dataBufferMock), atLeast(1));
                verify(compilerMock).compile((InputStreamReader) any());
                verify(templateMock).execute(eq(stringObjectMap), (Writer) any());
            });
        }
    }

    //Sapient generated method id: ${renderInternalWhenDefaultBranchAndDefaultBranch}, hash: 414083418CAC0207B65115C42F6436E6
    @Disabled()
    @Test()
    void renderInternalWhenDefaultBranchAndDefaultBranch() throws Throwable, Exception {
        /* Branches:
         * (resource == null) : false  #  inside resolveResource method
         * (!resource.exists()) : false  #  inside resolveResource method
         * (resource == null) : false
         * (this.charset != null) : true  #  inside getReader method
         * (mediaType != null) : true  #  inside getCharset method
         * (branch expression (line 91)) : true
         * (branch expression (line 95)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.InputStreamReader
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MediaType mediaTypeMock = mock(MediaType.class);
        ServerWebExchange exchangeMock = mock(ServerWebExchange.class);
        ServerHttpResponse serverHttpResponseMock = mock(ServerHttpResponse.class);
        DataBufferFactory dataBufferFactoryMock = mock(DataBufferFactory.class);
        DataBuffer dataBufferMock = mock(DataBuffer.class);
        ServerHttpResponse serverHttpResponseMock2 = mock(ServerHttpResponse.class);
        Mono<Void> monoMock = mock(Mono.class);
        Flux<DataBuffer> fluxMock = mock(Flux.class);
        ApplicationContext applicationContextMock = mock(ApplicationContext.class);
        Resource resourceMock = mock(Resource.class);
        Template templateMock = mock(Template.class);
        try (MockedStatic<Flux> flux = mockStatic(Flux.class)) {
            Charset charset = Charset.defaultCharset();
            doReturn(charset).when(mediaTypeMock).getCharset();
            doReturn(dataBufferFactoryMock).when(serverHttpResponseMock).bufferFactory();
            doReturn(dataBufferMock).when(dataBufferFactoryMock).allocateBuffer(256);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            doReturn(byteArrayOutputStream).when(dataBufferMock).asOutputStream();
            doReturn(serverHttpResponseMock, serverHttpResponseMock2).when(exchangeMock).getResponse();
            doReturn(monoMock).when(serverHttpResponseMock2).writeWith(fluxMock);
            doReturn(resourceMock).when(applicationContextMock).getResource("url1");
            doReturn(true).when(resourceMock).exists();
            doReturn(null).when(resourceMock).getInputStream();
            flux.when(() -> Flux.just(dataBufferMock)).thenReturn(fluxMock);
            target = new MustacheView();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            target.setCharset("charset1");
            target.setApplicationContext(applicationContextMock);
            target.setUrl("url1");
            doReturn(templateMock).when(compilerMock).compile((InputStreamReader) any());
            Map<String, Object> stringObjectMap = new HashMap<>();
            doNothing().when(templateMock).execute(eq(stringObjectMap), (Writer) any());
            //Act Statement(s)
            Mono<Void> result = target.renderInternal(stringObjectMap, mediaTypeMock, exchangeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(monoMock));
                verify(mediaTypeMock).getCharset();
                verify(exchangeMock, times(2)).getResponse();
                verify(serverHttpResponseMock).bufferFactory();
                verify(dataBufferFactoryMock).allocateBuffer(256);
                verify(dataBufferMock).asOutputStream();
                verify(serverHttpResponseMock2).writeWith(fluxMock);
                verify(applicationContextMock).getResource("url1");
                verify(resourceMock).exists();
                verify(resourceMock).getInputStream();
                flux.verify(() -> Flux.just(dataBufferMock), atLeast(1));
                verify(compilerMock).compile((InputStreamReader) any());
                verify(templateMock).execute(eq(stringObjectMap), (Writer) any());
            });
        }
    }

    //Sapient generated method id: ${renderInternalWhenCaughtException}, hash: D1102BD07309A6BE69A5B5ACB4E1C464
    @Disabled()
    @Test()
    void renderInternalWhenCaughtException() throws Throwable, Exception {
        /* Branches:
         * (resource == null) : false  #  inside resolveResource method
         * (!resource.exists()) : false  #  inside resolveResource method
         * (resource == null) : false
         * (this.charset != null) : true  #  inside getReader method
         * (mediaType != null) : true  #  inside getCharset method
         * (branch expression (line 95)) : false
         * (catch-exception (Exception)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.InputStreamReader
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MediaType mediaTypeMock = mock(MediaType.class);
        ServerWebExchange exchangeMock = mock(ServerWebExchange.class);
        ServerHttpResponse serverHttpResponseMock = mock(ServerHttpResponse.class);
        DataBufferFactory dataBufferFactoryMock = mock(DataBufferFactory.class);
        DataBuffer dataBufferMock = mock(DataBuffer.class);
        ApplicationContext applicationContextMock = mock(ApplicationContext.class);
        Resource resourceMock = mock(Resource.class);
        Mono<Void> monoMock = mock(Mono.class);
        Template templateMock = mock(Template.class);
        try (MockedStatic<Mono> mono = mockStatic(Mono.class);
            MockedStatic<DataBufferUtils> dataBufferUtils = mockStatic(DataBufferUtils.class)) {
            Charset charset = Charset.defaultCharset();
            doReturn(charset).when(mediaTypeMock).getCharset();
            doReturn(serverHttpResponseMock).when(exchangeMock).getResponse();
            doReturn(dataBufferFactoryMock).when(serverHttpResponseMock).bufferFactory();
            doReturn(dataBufferMock).when(dataBufferFactoryMock).allocateBuffer(256);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            doReturn(byteArrayOutputStream).when(dataBufferMock).asOutputStream();
            doReturn(resourceMock).when(applicationContextMock).getResource("url1");
            doReturn(true).when(resourceMock).exists();
            doReturn(null).when(resourceMock).getInputStream();
            dataBufferUtils.when(() -> DataBufferUtils.release(dataBufferMock)).thenReturn(false);
            Exception exception = new Exception();
            mono.when(() -> Mono.error(exception)).thenReturn(monoMock);
            target = new MustacheView();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            target.setCharset("charset1");
            target.setApplicationContext(applicationContextMock);
            target.setUrl("url1");
            doReturn(templateMock).when(compilerMock).compile((InputStreamReader) any());
            Map<String, Object> stringObjectMap = new HashMap<>();
            doNothing().when(templateMock).execute(eq(stringObjectMap), (Writer) any());
            //Act Statement(s)
            Mono<Void> result = target.renderInternal(stringObjectMap, mediaTypeMock, exchangeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(monoMock));
                verify(mediaTypeMock).getCharset();
                verify(exchangeMock).getResponse();
                verify(serverHttpResponseMock).bufferFactory();
                verify(dataBufferFactoryMock).allocateBuffer(256);
                verify(dataBufferMock).asOutputStream();
                verify(applicationContextMock).getResource("url1");
                verify(resourceMock).exists();
                verify(resourceMock).getInputStream();
                dataBufferUtils.verify(() -> DataBufferUtils.release(dataBufferMock), atLeast(1));
                mono.verify(() -> Mono.error(exception), atLeast(1));
                verify(compilerMock).compile((InputStreamReader) any());
                verify(templateMock).execute(eq(stringObjectMap), (Writer) any());
            });
        }
    }

    //Sapient generated method id: ${renderInternalWhenMediaTypeIsNullAndDefaultBranchAndDefaultBranchThrowsThrowable}, hash: 02468B927D42C51EF310B2945D867BC5
    @Disabled()
    @Test()
    void renderInternalWhenMediaTypeIsNullAndDefaultBranchAndDefaultBranchThrowsThrowable() throws IOException, MustacheException {
        /* Branches:
         * (resource == null) : false  #  inside resolveResource method
         * (!resource.exists()) : false  #  inside resolveResource method
         * (resource == null) : false
         * (this.charset != null) : false  #  inside getReader method
         * (mediaType != null) : false  #  inside getCharset method
         * (branch expression (line 91)) : true
         * (branch expression (line 88)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.OutputStreamWriter
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ServerWebExchange exchangeMock = mock(ServerWebExchange.class);
        ServerHttpResponse serverHttpResponseMock = mock(ServerHttpResponse.class);
        doReturn(serverHttpResponseMock).when(exchangeMock).getResponse();
        DataBufferFactory dataBufferFactoryMock = mock(DataBufferFactory.class);
        doReturn(dataBufferFactoryMock).when(serverHttpResponseMock).bufferFactory();
        DataBuffer dataBufferMock = mock(DataBuffer.class);
        doReturn(dataBufferMock).when(dataBufferFactoryMock).allocateBuffer(256);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        doReturn(byteArrayOutputStream).when(dataBufferMock).asOutputStream();
        ApplicationContext applicationContextMock = mock(ApplicationContext.class);
        Resource resourceMock = mock(Resource.class);
        doReturn(resourceMock).when(applicationContextMock).getResource("url1");
        doReturn(true).when(resourceMock).exists();
        doReturn(null).when(resourceMock).getInputStream();
        target = new MustacheView();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        target.setCharset((String) null);
        target.setApplicationContext(applicationContextMock);
        Charset charset = Charset.defaultCharset();
        target.setDefaultCharset(charset);
        target.setUrl("url1");
        Template templateMock = mock(Template.class);
        doReturn(templateMock).when(compilerMock).compile((InputStreamReader) any());
        Map<String, Object> stringObjectMap = new HashMap<>();
        doNothing().when(templateMock).execute(eq(stringObjectMap), (Writer) any());
        MediaType mediaType = null;
        //Act Statement(s)
        final Throwable result = assertThrows(Throwable.class, () -> {
            target.renderInternal(stringObjectMap, mediaType, exchangeMock);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(exchangeMock).getResponse();
            verify(serverHttpResponseMock).bufferFactory();
            verify(dataBufferFactoryMock).allocateBuffer(256);
            verify(dataBufferMock).asOutputStream();
            verify(applicationContextMock).getResource("url1");
            verify(resourceMock).exists();
            verify(resourceMock).getInputStream();
            verify(compilerMock).compile((InputStreamReader) any());
            verify(templateMock).execute(eq(stringObjectMap), (Writer) any());
        });
    }
}
