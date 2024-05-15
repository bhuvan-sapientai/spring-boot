package org.springframework.boot.web.servlet.view;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.io.Writer;
import com.samskivert.mustache.Template;
import java.io.PrintWriter;
import org.springframework.context.ApplicationContext;
import java.util.Locale;
import org.mockito.MockitoAnnotations;
import jakarta.servlet.http.HttpServletRequest;
import java.io.InputStreamReader;
import com.samskivert.mustache.Mustache;
import java.util.Map;
import java.util.HashMap;
import org.springframework.core.io.Resource;
import jakarta.servlet.http.HttpServletResponse;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
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

    //Sapient generated method id: ${checkResourceWhenResourceExists}, hash: 4C22359F498C5EAC3AB349238FD26B33
    @Test()
    void checkResourceWhenResourceExists() throws Exception, IllegalStateException {
        /* Branches:
         * (resource != null) : true
         * (resource.exists()) : true
         */
        //Arrange Statement(s)
        target = spy(new MustacheView());
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        target.setUrl("url1");
        ApplicationContext applicationContextMock = mock(ApplicationContext.class);
        doReturn(applicationContextMock).when(target).getApplicationContext();
        Resource resourceMock = mock(Resource.class);
        doReturn(resourceMock).when(applicationContextMock).getResource("url1");
        doReturn(true).when(resourceMock).exists();
        Locale locale = new Locale("language1");
        //Act Statement(s)
        boolean result = target.checkResource(locale);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(target).getApplicationContext();
            verify(applicationContextMock).getResource("url1");
            verify(resourceMock).exists();
        });
    }

    //Sapient generated method id: ${checkResourceWhenResourceNotExists}, hash: EBEC125D02ED9AAD298C1302C1840E52
    @Test()
    void checkResourceWhenResourceNotExists() throws Exception, IllegalStateException {
        /* Branches:
         * (resource != null) : true
         * (resource.exists()) : false
         */
        //Arrange Statement(s)
        target = spy(new MustacheView());
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        target.setUrl("url1");
        ApplicationContext applicationContextMock = mock(ApplicationContext.class);
        doReturn(applicationContextMock).when(target).getApplicationContext();
        Resource resourceMock = mock(Resource.class);
        doReturn(resourceMock).when(applicationContextMock).getResource("url1");
        doReturn(false).when(resourceMock).exists();
        Locale locale = new Locale("language1");
        //Act Statement(s)
        boolean result = target.checkResource(locale);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(target).getApplicationContext();
            verify(applicationContextMock).getResource("url1");
            verify(resourceMock).exists();
        });
    }

    //Sapient generated method id: ${renderMergedTemplateModelWhenDefaultBranchThrowsThrowable}, hash: 9C6AB94EC237F77749DD028545D892AF
    @Disabled()
    @Test()
    void renderMergedTemplateModelWhenDefaultBranchThrowsThrowable() throws Exception, IllegalStateException, IOException {
        /* Branches:
         * (this.charset != null) : true  #  inside getReader method
         * (branch expression (line 84)) : true  #  inside createTemplate method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.InputStreamReader
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        target = spy(new MustacheView());
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        target.setCharset("charset1");
        target.setUrl("url1");
        ApplicationContext applicationContextMock = mock(ApplicationContext.class);
        doReturn(applicationContextMock).when(target).getApplicationContext();
        Resource resourceMock = mock(Resource.class);
        doReturn(resourceMock).when(applicationContextMock).getResource("url1");
        doReturn(null).when(resourceMock).getInputStream();
        Template templateMock = mock(Template.class);
        doReturn(templateMock).when(compilerMock).compile((InputStreamReader) any());
        Map<String, Object> stringObjectMap = new HashMap<>();
        HttpServletRequest httpServletRequestMock = mock(HttpServletRequest.class);
        HttpServletResponse httpServletResponseMock = mock(HttpServletResponse.class);
        //Act Statement(s)
        final Throwable result = assertThrows(Throwable.class, () -> {
            target.renderMergedTemplateModel(stringObjectMap, httpServletRequestMock, httpServletResponseMock);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(target).getApplicationContext();
            verify(applicationContextMock).getResource("url1");
            verify(resourceMock).getInputStream();
            verify(compilerMock).compile((InputStreamReader) any());
        });
    }

    //Sapient generated method id: ${renderMergedTemplateModelWhenThisCharsetIsNullAndDefaultBranchThrowsThrowable}, hash: E9DFB21E60131CD21E835B92E3620739
    @Disabled()
    @Test()
    void renderMergedTemplateModelWhenThisCharsetIsNullAndDefaultBranchThrowsThrowable() throws Exception, IllegalStateException, IOException {
        /* Branches:
         * (this.charset != null) : false  #  inside getReader method
         * (branch expression (line 84)) : true  #  inside createTemplate method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: reader - Method: close
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        target = spy(new MustacheView());
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        target.setCharset((String) null);
        target.setUrl("url1");
        ApplicationContext applicationContextMock = mock(ApplicationContext.class);
        doReturn(applicationContextMock).when(target).getApplicationContext();
        Resource resourceMock = mock(Resource.class);
        doReturn(resourceMock).when(applicationContextMock).getResource("url1");
        doReturn(null).when(resourceMock).getInputStream();
        Template templateMock = mock(Template.class);
        doReturn(templateMock).when(compilerMock).compile((InputStreamReader) any());
        Map<String, Object> stringObjectMap = new HashMap<>();
        HttpServletRequest httpServletRequestMock = mock(HttpServletRequest.class);
        HttpServletResponse httpServletResponseMock = mock(HttpServletResponse.class);
        //Act Statement(s)
        final Throwable result = assertThrows(Throwable.class, () -> {
            target.renderMergedTemplateModel(stringObjectMap, httpServletRequestMock, httpServletResponseMock);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(target).getApplicationContext();
            verify(applicationContextMock).getResource("url1");
            verify(resourceMock).getInputStream();
            verify(compilerMock).compile((InputStreamReader) any());
        });
    }

    //Sapient generated method id: ${renderMergedTemplateModelWhenTemplateIsNotNull}, hash: 770698955677658D7F687EE12ED028D0
    @Disabled()
    @Test()
    void renderMergedTemplateModelWhenTemplateIsNotNull() throws Throwable {
        /* Branches:
         * (this.charset != null) : true  #  inside getReader method
         * (branch expression (line 86)) : false  #  inside createTemplate method
         * (template != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.InputStreamReader
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HttpServletResponse responseMock = mock(HttpServletResponse.class);
        Writer writer = Writer.nullWriter();
        PrintWriter printWriter = new PrintWriter(writer);
        doReturn(printWriter).when(responseMock).getWriter();
        target = spy(new MustacheView());
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        target.setCharset("charset1");
        target.setUrl("url1");
        ApplicationContext applicationContextMock = mock(ApplicationContext.class);
        doReturn(applicationContextMock).when(target).getApplicationContext();
        Resource resourceMock = mock(Resource.class);
        doReturn(resourceMock).when(applicationContextMock).getResource("url1");
        doReturn(null).when(resourceMock).getInputStream();
        Template templateMock = mock(Template.class);
        doReturn(templateMock).when(compilerMock).compile((InputStreamReader) any());
        Map<String, Object> stringObjectMap = new HashMap<>();
        doNothing().when(templateMock).execute(eq(stringObjectMap), eq(printWriter));
        HttpServletRequest httpServletRequestMock = mock(HttpServletRequest.class);
        //Act Statement(s)
        target.renderMergedTemplateModel(stringObjectMap, httpServletRequestMock, responseMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(responseMock).getWriter();
            verify(target).getApplicationContext();
            verify(applicationContextMock).getResource("url1");
            verify(resourceMock).getInputStream();
            verify(compilerMock).compile((InputStreamReader) any());
            verify(templateMock, atLeast(1)).execute(eq(stringObjectMap), eq(printWriter));
        });
    }

    //Sapient generated method id: ${renderMergedTemplateModelWhenDefaultBranchAndTemplateIsNull}, hash: 12A7683726F92E8B4AF926BBD60311AA
    @Disabled()
    @Test()
    void renderMergedTemplateModelWhenDefaultBranchAndTemplateIsNull() throws Throwable {
        /* Branches:
         * (this.charset != null) : false  #  inside getReader method
         * (branch expression (line 86)) : false  #  inside createTemplate method
         * (template != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: reader - Method: close
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        target = spy(new MustacheView());
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        target.setCharset((String) null);
        target.setUrl("url1");
        ApplicationContext applicationContextMock = mock(ApplicationContext.class);
        doReturn(applicationContextMock).when(target).getApplicationContext();
        Resource resourceMock = mock(Resource.class);
        doReturn(resourceMock).when(applicationContextMock).getResource("url1");
        doReturn(null).when(resourceMock).getInputStream();
        doReturn(null).when(compilerMock).compile((InputStreamReader) any());
        Map<String, Object> stringObjectMap = new HashMap<>();
        HttpServletRequest httpServletRequestMock = mock(HttpServletRequest.class);
        HttpServletResponse httpServletResponseMock = mock(HttpServletResponse.class);
        //Act Statement(s)
        target.renderMergedTemplateModel(stringObjectMap, httpServletRequestMock, httpServletResponseMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).getApplicationContext();
            verify(applicationContextMock).getResource("url1");
            verify(resourceMock).getInputStream();
            verify(compilerMock).compile((InputStreamReader) any());
        });
    }
}
