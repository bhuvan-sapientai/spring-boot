package org.springframework.boot.web.embedded.undertow;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.http.server.reactive.HttpHandler;
import java.util.Collection;
import java.io.File;
import org.springframework.boot.web.server.WebServer;
import java.util.ArrayList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UndertowReactiveWebServerFactorySapientGeneratedTest {

    private final HttpHandler httpHandlerMock = mock(HttpHandler.class);

    //Sapient generated method id: ${setBuilderCustomizersTest}, hash: D2D26D2886A3CED788135A02B36614FD
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
        UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
        Collection<UndertowBuilderCustomizer> collection = new ArrayList<>();
        //Act Statement(s)
        target.setBuilderCustomizers(collection);
    }

    //Sapient generated method id: ${addBuilderCustomizersTest}, hash: D7D16C5BEC69A98E87CC187EB5CEFF82
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
        UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
        UndertowBuilderCustomizer[] undertowBuilderCustomizerArray = new UndertowBuilderCustomizer[] {};
        //Act Statement(s)
        target.addBuilderCustomizers(undertowBuilderCustomizerArray);
    }

    //Sapient generated method id: ${getBuilderCustomizersTest}, hash: 2D761AC2C34DE4E7CEEDE0C8F1B2A1CF
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
        UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
        //Act Statement(s)
        Collection<UndertowBuilderCustomizer> result = target.getBuilderCustomizers();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${setBufferSizeTest}, hash: E988E41933C331829B3C3A10593B36ED
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
        UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(8080);
        //Act Statement(s)
        target.setBufferSize(10);
    }

    //Sapient generated method id: ${setIoThreadsTest}, hash: F9BAEAEEE6A6D650E90E54B5D25174BA
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
        UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(8080);
        //Act Statement(s)
        target.setIoThreads(4);
    }

    //Sapient generated method id: ${setWorkerThreadsTest}, hash: EA87ED02DFF891E92EEA4A3964460E58
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
        UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(8080);
        //Act Statement(s)
        target.setWorkerThreads(10);
    }

    //Sapient generated method id: ${setUseDirectBuffersTest}, hash: 62E7D5D2BF83515F7FD809B18CFB6B7E
    @Test()
    void setUseDirectBuffersTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: setUseDirectBuffers
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(8080);
        //Act Statement(s)
        target.setUseDirectBuffers(true);
    }

    //Sapient generated method id: ${setUseForwardHeadersTest}, hash: A58384743B86E95ECF968B3B3161C536
    @Test()
    void setUseForwardHeadersTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: setUseForwardHeaders
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(8080);
        //Act Statement(s)
        target.setUseForwardHeaders(true);
    }

    //Sapient generated method id: ${isUseForwardHeadersWhenThisDelegateIsUseForwardHeaders}, hash: AACF271C3EDC62DE22B5EFECB348B941
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
        UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
        //Act Statement(s)
        boolean result = target.isUseForwardHeaders();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isUseForwardHeadersWhenThisDelegateNotIsUseForwardHeaders}, hash: 630C7BA86CB9C79B939C1E413E04B6E5
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
        UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
        //Act Statement(s)
        boolean result = target.isUseForwardHeaders();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${setAccessLogDirectoryTest}, hash: E156A301879C63B687D04353F76345EF
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
        UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
        File file = new File("pathname1");
        //Act Statement(s)
        target.setAccessLogDirectory(file);
    }

    //Sapient generated method id: ${setAccessLogPatternTest}, hash: 3D11040788C0EEE8B059744D569C7B5A
    @Test()
    void setAccessLogPatternTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
        //Act Statement(s)
        target.setAccessLogPattern("A");
    }

    //Sapient generated method id: ${setAccessLogPrefixTest}, hash: 1EDD6DCBEF65AA71CA7E59A86650BAD2
    @Test()
    void setAccessLogPrefixTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: setAccessLogPrefix
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
        //Act Statement(s)
        target.setAccessLogPrefix("<value>");
    }

    //Sapient generated method id: ${setAccessLogSuffixTest}, hash: E7C7F9AFB4F5BB4B989551D57A333708
    @Test()
    void setAccessLogSuffixTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: setAccessLogSuffix
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
        //Act Statement(s)
        target.setAccessLogSuffix("<value>");
    }

    //Sapient generated method id: ${isAccessLogEnabledWhenThisDelegateIsAccessLogEnabled}, hash: 0013B53EF66B9ACF27ED7DB0D543E4B9
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
        UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
        //Act Statement(s)
        boolean result = target.isAccessLogEnabled();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isAccessLogEnabledWhenThisDelegateNotIsAccessLogEnabled}, hash: ACBD8D082BE90C5FBDA7C9348E4139B5
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
        UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
        //Act Statement(s)
        boolean result = target.isAccessLogEnabled();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${setAccessLogEnabledTest}, hash: C1DF602B555F6A48D696FBC9BF4AC181
    @Test()
    void setAccessLogEnabledTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: setAccessLogEnabled
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(8080);
        //Act Statement(s)
        target.setAccessLogEnabled(true);
    }

    //Sapient generated method id: ${setAccessLogRotateTest}, hash: 217D5DC60977481339C43B60321D5F68
    @Test()
    void setAccessLogRotateTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: setAccessLogRotate
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(8080);
        //Act Statement(s)
        target.setAccessLogRotate(true);
    }

    //Sapient generated method id: ${getWebServerWhenGetPortGreaterThanOrEqualsTo0}, hash: CD480A6074D6B48976C28D11914B6FCC
    @Test()
    void getWebServerWhenGetPortGreaterThanOrEqualsTo0() {
        /* Branches:
         * (getPort() >= 0) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: createBuilder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(1);
        //Act Statement(s)
        WebServer result = target.getWebServer(httpHandlerMock);
        //Assert statement(s)
        //TODO: Please implement equals method in UndertowWebServer for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getWebServerWhenGetPortLessThan0}, hash: 6669B05A2FE41E6A701C5EEBFEBABA4B
    @Test()
    void getWebServerWhenGetPortLessThan0() {
        /* Branches:
         * (getPort() >= 0) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: createBuilder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(-1);
        //Act Statement(s)
        WebServer result = target.getWebServer(httpHandlerMock);
        //Assert statement(s)
        //TODO: Please implement equals method in UndertowWebServer for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
