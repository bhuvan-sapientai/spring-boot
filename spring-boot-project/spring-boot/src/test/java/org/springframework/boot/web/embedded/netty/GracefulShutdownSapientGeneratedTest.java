package org.springframework.boot.web.embedded.netty;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.function.Supplier;
import org.springframework.boot.web.server.GracefulShutdownCallback;
import static org.mockito.Mockito.mock;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class GracefulShutdownSapientGeneratedTest {

    private final Supplier supplierMock = mock(Supplier.class);

    //Sapient generated method id: ${shutDownGracefullyWhenServerIsNull}, hash: 146653BCA18C793BB4F81C88BA4B33CA
    @Test()
    void shutDownGracefullyWhenServerIsNull() {
        /* Branches:
         * (server == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        GracefulShutdown target = new GracefulShutdown(supplierMock);
        GracefulShutdownCallback gracefulShutdownCallbackMock = mock(GracefulShutdownCallback.class);
        //Act Statement(s)
        target.shutDownGracefully(gracefulShutdownCallbackMock);
    }

    //Sapient generated method id: ${abortWhenShutdownThreadIsNull}, hash: 975CBD3084A8834BC25E6971AE19E13B
    @Test()
    void abortWhenShutdownThreadIsNull() throws InterruptedException {
        /* Branches:
         * (shutdownThread != null) : false
         */
        //Arrange Statement(s)
        GracefulShutdown target = new GracefulShutdown(supplierMock);
        //Act Statement(s)
        target.abort();
    }
}
