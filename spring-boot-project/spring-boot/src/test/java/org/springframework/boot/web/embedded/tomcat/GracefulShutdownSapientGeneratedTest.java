package org.springframework.boot.web.embedded.tomcat;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.web.server.GracefulShutdownCallback;
import static org.mockito.Mockito.mock;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class GracefulShutdownSapientGeneratedTest {

    private final Tomcat tomcatMock = mock(Tomcat.class);

    //Sapient generated method id: ${shutDownGracefullyTest}, hash: 87CCE4FB65149F18F74886BB9C3D819B
    @Disabled()
    @Test()
    void shutDownGracefullyTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        GracefulShutdown target = new GracefulShutdown(tomcatMock);
        GracefulShutdownCallback gracefulShutdownCallbackMock = mock(GracefulShutdownCallback.class);
        
        //Act Statement(s)
        target.shutDownGracefully(gracefulShutdownCallbackMock);
    }

    //Sapient generated method id: ${abortTest}, hash: 9009892F551E74AE52B56EA8574BE9AA
    @Test()
    void abortTest() {
        //Arrange Statement(s)
        GracefulShutdown target = new GracefulShutdown(tomcatMock);
        
        //Act Statement(s)
        target.abort();
    }
}
