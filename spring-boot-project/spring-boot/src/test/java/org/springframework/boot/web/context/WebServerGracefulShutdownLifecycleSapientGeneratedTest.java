package org.springframework.boot.web.context;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.springframework.boot.web.server.GracefulShutdownCallback;
import org.springframework.boot.web.server.WebServer;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class WebServerGracefulShutdownLifecycleSapientGeneratedTest {

    private final WebServer webServerMock = mock(WebServer.class, "webServer");

    //Sapient generated method id: ${startTest}, hash: EF764A4F28D6A45A32C919656D61BBBE
    @Test()
    void startTest() {
        //Arrange Statement(s)
        WebServerGracefulShutdownLifecycle target = new WebServerGracefulShutdownLifecycle(webServerMock);
        
        //Act Statement(s)
        target.start();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(target.isRunning(), equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${stopThrowsUnsupportedOperationException}, hash: CA95EFCFDE82CA1533E0688493EAE74D
    @Test()
    void stopThrowsUnsupportedOperationException() {
        //Arrange Statement(s)
        WebServerGracefulShutdownLifecycle target = new WebServerGracefulShutdownLifecycle(webServerMock);
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Stop must not be invoked directly");
        //Act Statement(s)
        final UnsupportedOperationException result = assertThrows(UnsupportedOperationException.class, () -> {
            target.stop();
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(unsupportedOperationException.getMessage()));
        });
    }

    //Sapient generated method id: ${stop1Test}, hash: A357CC8239B42521C6DA6D46E179848A
    @Disabled()
    @Test()
    void stop1Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        WebServerGracefulShutdownLifecycle target = new WebServerGracefulShutdownLifecycle(webServerMock);
        doNothing().when(webServerMock).shutDownGracefully((GracefulShutdownCallback) any());
        Runnable runnableMock = mock(Runnable.class);
        
        //Act Statement(s)
        target.stop(runnableMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(target.isRunning(), equalTo(Boolean.FALSE));
            verify(webServerMock).shutDownGracefully((GracefulShutdownCallback) any());
        });
    }
}
