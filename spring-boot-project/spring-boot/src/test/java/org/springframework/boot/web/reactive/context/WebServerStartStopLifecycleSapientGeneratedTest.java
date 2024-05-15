package org.springframework.boot.web.reactive.context;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class WebServerStartStopLifecycleSapientGeneratedTest {

    private final WebServerManager weServerManagerMock = mock(WebServerManager.class, "weServerManager");

    //Sapient generated method id: ${startTest}, hash: 9719F9481A608D125C863D4F27007E44
    @Test()
    void startTest() {
        //Arrange Statement(s)
        WebServerStartStopLifecycle target = new WebServerStartStopLifecycle(weServerManagerMock);
        doNothing().when(weServerManagerMock).start();
        
        //Act Statement(s)
        target.start();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(target.isRunning(), equalTo(Boolean.TRUE));
            verify(weServerManagerMock).start();
        });
    }

    //Sapient generated method id: ${stopTest}, hash: 94929988F45F02FB73F22B7E60CC8B01
    @Test()
    void stopTest() {
        //Arrange Statement(s)
        WebServerStartStopLifecycle target = new WebServerStartStopLifecycle(weServerManagerMock);
        doNothing().when(weServerManagerMock).stop();
        
        //Act Statement(s)
        target.stop();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(target.isRunning(), equalTo(Boolean.FALSE));
            verify(weServerManagerMock).stop();
        });
    }

    //Sapient generated method id: ${getPhaseTest}, hash: 64B95C0118790E027BC1CE05A7E3D820
    @Test()
    void getPhaseTest() {
        //Arrange Statement(s)
        WebServerStartStopLifecycle target = new WebServerStartStopLifecycle(weServerManagerMock);
        
        //Act Statement(s)
        int result = target.getPhase();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(2147481599)));
    }
}
