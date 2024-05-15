package org.springframework.boot.web.servlet;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletRegistration;
import org.mockito.stubbing.Answer;
import java.util.Set;
import org.springframework.util.StringUtils;
import jakarta.servlet.ServletContext;
import org.springframework.util.Assert;
import java.util.HashSet;
import java.util.Collection;
import org.mockito.MockedStatic;
import java.util.ArrayList;
import org.springframework.util.ObjectUtils;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ServletRegistrationBeanSapientGeneratedTest {

    private final Servlet servletMock = mock(Servlet.class);

    //Sapient generated method id: ${setServletTest}, hash: C2092B74023421FE3191E4E1C2AA71CA
    @Test()
    void setServletTest() {
        //Arrange Statement(s)
        Servlet servletMock2 = mock(Servlet.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(servletMock, "Servlet must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            String[] stringArray = new String[] {};
            _assert.when(() -> Assert.notNull(stringArray, "UrlMappings must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(servletMock2, "Servlet must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ServletRegistrationBean<Servlet> target = new ServletRegistrationBean<>(servletMock, false, stringArray);
            //Act Statement(s)
            target.setServlet(servletMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(target.getServlet(), is(notNullValue()));
                _assert.verify(() -> Assert.notNull(servletMock, "Servlet must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(stringArray, "UrlMappings must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(servletMock2, "Servlet must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${setUrlMappingsTest}, hash: ADE5665A7838104D6224D22C1F66541A
    @Test()
    void setUrlMappingsTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(servletMock, "Servlet must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            String[] stringArray = new String[] {};
            _assert.when(() -> Assert.notNull(stringArray, "UrlMappings must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(anyCollection(), eq("UrlMappings must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            ServletRegistrationBean<Servlet> target = new ServletRegistrationBean<>(servletMock, false, stringArray);
            Collection<String> collection = new ArrayList<>();
            //Act Statement(s)
            target.setUrlMappings(collection);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(target.getUrlMappings().size(), equalTo(0));
                _assert.verify(() -> Assert.notNull(servletMock, "Servlet must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(stringArray, "UrlMappings must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(anyCollection(), eq("UrlMappings must not be null")));
            });
        }
    }

    //Sapient generated method id: ${getUrlMappingsTest}, hash: 39EAAAE310203377B883DAB7072C0B54
    @Test()
    void getUrlMappingsTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(servletMock, "Servlet must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            String[] stringArray = new String[] {};
            _assert.when(() -> Assert.notNull(stringArray, "UrlMappings must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ServletRegistrationBean<Servlet> target = new ServletRegistrationBean<>(servletMock, false, stringArray);
            //Act Statement(s)
            Collection<String> result = target.getUrlMappings();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                _assert.verify(() -> Assert.notNull(servletMock, "Servlet must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(stringArray, "UrlMappings must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${addUrlMappingsTest}, hash: 0DC06390D183E9215C6D0F2D5240A677
    @Test()
    void addUrlMappingsTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(servletMock, "Servlet must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            String[] stringArray = new String[] {};
            _assert.when(() -> Assert.notNull(stringArray, "UrlMappings must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            String[] stringArray2 = new String[] {};
            _assert.when(() -> Assert.notNull(stringArray2, "UrlMappings must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ServletRegistrationBean<Servlet> target = new ServletRegistrationBean<>(servletMock, false, stringArray);
            //Act Statement(s)
            target.addUrlMappings(stringArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(servletMock, "Servlet must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(stringArray, "UrlMappings must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(stringArray2, "UrlMappings must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getDescriptionTest}, hash: C423EF732D5319E7308C2451407EB3F4
    @Test()
    void getDescriptionTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(servletMock, "Servlet must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            String[] stringArray = new String[] {};
            _assert.when(() -> Assert.notNull(stringArray, "UrlMappings must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ServletRegistrationBean<Servlet> target = spy(new ServletRegistrationBean<>(servletMock, false, stringArray));
            doReturn("A").when(target).getServletName();
            //Act Statement(s)
            String result = target.getDescription();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("servlet A"));
                _assert.verify(() -> Assert.notNull(servletMock, "Servlet must not be null"), atLeast(2));
                _assert.verify(() -> Assert.notNull(stringArray, "UrlMappings must not be null"), atLeast(1));
                verify(target).getServletName();
            });
        }
    }

    //Sapient generated method id: ${addRegistration1Test}, hash: 2D8283989ACC95CB870CB8ED6A8E92F7
    @Test()
    void addRegistration1Test() {
        //Arrange Statement(s)
        ServletContext servletContextMock = mock(ServletContext.class);
        ServletRegistration.Dynamic servletRegistrationDynamicMock = mock(ServletRegistration.Dynamic.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(servletRegistrationDynamicMock).when(servletContextMock).addServlet("return_of_getServletName1", servletMock);
            _assert.when(() -> Assert.notNull(servletMock, "Servlet must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            String[] stringArray = new String[] {};
            _assert.when(() -> Assert.notNull(stringArray, "UrlMappings must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ServletRegistrationBean<Servlet> target = spy(new ServletRegistrationBean<>(servletMock, false, stringArray));
            doReturn("return_of_getServletName1").when(target).getServletName();
            //Act Statement(s)
            ServletRegistration.Dynamic result = target.addRegistration("description1", servletContextMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(servletRegistrationDynamicMock));
                verify(servletContextMock).addServlet("return_of_getServletName1", servletMock);
                _assert.verify(() -> Assert.notNull(servletMock, "Servlet must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(stringArray, "UrlMappings must not be null"), atLeast(1));
                verify(target).getServletName();
            });
        }
    }

    //Sapient generated method id: ${configure1WhenObjectUtilsNotIsEmptyUrlMappingAndThisMultipartConfigIsNull}, hash: 3913A2BE3EE8DB1BB40DCA861F624238
    @Test()
    void configure1WhenObjectUtilsNotIsEmptyUrlMappingAndThisMultipartConfigIsNull() {
        /* Branches:
         * (urlMapping.length == 0) : true
         * (this.alwaysMapUrl) : true
         * (!ObjectUtils.isEmpty(urlMapping)) : true
         * (this.multipartConfig != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ServletRegistration.Dynamic registrationMock = mock(ServletRegistration.Dynamic.class);
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Set<String> stringSet = new HashSet<>();
            String[] stringArray = new String[] { "/*" };
            doReturn(stringSet).when(registrationMock).addMapping(stringArray);
            doNothing().when(registrationMock).setLoadOnStartup(-1);
            _assert.when(() -> Assert.notNull(servletMock, "Servlet must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            String[] stringArray2 = new String[] {};
            _assert.when(() -> Assert.notNull(stringArray2, "UrlMappings must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            String[] stringArray3 = new String[] {};
            stringUtils.when(() -> StringUtils.toStringArray(anySet())).thenReturn(stringArray3);
            ServletRegistrationBean<Servlet> target = new ServletRegistrationBean<>(servletMock, true, stringArray2);
            //Act Statement(s)
            target.configure(registrationMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(registrationMock).addMapping(stringArray);
                verify(registrationMock).setLoadOnStartup(-1);
                _assert.verify(() -> Assert.notNull(servletMock, "Servlet must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(stringArray2, "UrlMappings must not be null"), atLeast(1));
                stringUtils.verify(() -> StringUtils.toStringArray(anySet()));
            });
        }
    }

    //Sapient generated method id: ${getServletNameTest}, hash: F5FBA58593284D3C7CF47AF4A1A600EA
    @Test()
    void getServletNameTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(servletMock, "Servlet must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            String[] stringArray = new String[] {};
            _assert.when(() -> Assert.notNull(stringArray, "UrlMappings must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ServletRegistrationBean<Servlet> target = spy(new ServletRegistrationBean<>(servletMock, false, stringArray));
            doReturn("return_of_getOrDeduceName1").when(target).getOrDeduceName(servletMock);
            //Act Statement(s)
            String result = target.getServletName();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getOrDeduceName1"));
                _assert.verify(() -> Assert.notNull(servletMock, "Servlet must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(stringArray, "UrlMappings must not be null"), atLeast(1));
                verify(target).getOrDeduceName(servletMock);
            });
        }
    }

    //Sapient generated method id: ${toStringTest}, hash: 44C4AE39EB8A75A8C31DCA3D94D5F2F4
    @Test()
    void toStringTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(servletMock, "Servlet must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            String[] stringArray = new String[] {};
            _assert.when(() -> Assert.notNull(stringArray, "UrlMappings must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ServletRegistrationBean<Servlet> target = spy(new ServletRegistrationBean<>(servletMock, false, stringArray));
            doReturn("").when(target).getServletName();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(" urls=[]"));
                _assert.verify(() -> Assert.notNull(servletMock, "Servlet must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(stringArray, "UrlMappings must not be null"), atLeast(1));
                verify(target).getServletName();
            });
        }
    }
}
