package org.springframework.boot.web.embedded.jetty;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import java.util.concurrent.Future;
import java.util.function.Supplier;
import org.springframework.boot.web.server.GracefulShutdownCallback;
import org.mockito.MockedStatic;
import org.eclipse.jetty.server.Connector;
import java.util.concurrent.CompletableFuture;
import org.eclipse.jetty.server.Server;
import org.springframework.util.ReflectionUtils;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class GracefulShutdownSapientGeneratedTest {

    private final Server serverMock = mock(Server.class, "server");

    private final Connector connectorMock = mock(Connector.class);

    private final GracefulShutdownCallback gracefulShutdownCallbackMock = mock(GracefulShutdownCallback.class);

    private final Supplier supplierMock = mock(Supplier.class);

    //Sapient generated method id: ${shutDownGracefullyWhenNotGetResult}, hash: 516BA25DC0F7679AC8989FCE7BC090F8
    @Disabled()
    @Test()
    void shutDownGracefullyWhenNotGetResult() throws NoSuchMethodError, Exception {
        /* Branches:
         * (for-each(this.server.getConnectors())) : true
         * (!jetty10) : false
         * (getResult) : false  #  inside shutdown method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        GracefulShutdown target = new GracefulShutdown(serverMock, supplierMock);
        Connector[] connectorArray = new Connector[] { connectorMock };
        doReturn(connectorArray).when(serverMock).getConnectors();
        CompletableFuture<Void> completableFuture = new CompletableFuture<>();
        doReturn(completableFuture).when(connectorMock).shutdown();
        
        //Act Statement(s)
        target.shutDownGracefully(gracefulShutdownCallbackMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(serverMock).getConnectors();
            verify(connectorMock).shutdown();
        });
    }

    //Sapient generated method id: ${shutDownGracefullyWhenCaughtNoSuchMethodErrorAndNotGetResult}, hash: 9295143C1415ACC00682D7BB8EAB52A2
    @Disabled()
    @Test()
    void shutDownGracefullyWhenCaughtNoSuchMethodErrorAndNotGetResult() throws NoSuchMethodError, Exception {
        /* Branches:
         * (for-each(this.server.getConnectors())) : true
         * (!jetty10) : false
         * (catch-exception (NoSuchMethodError)) : true  #  inside shutdown method
         * (getResult) : false  #  inside shutdown method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Thread.start) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Method methodMock = mock(Method.class);
        Future futureMock = mock(Future.class);
        try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class)) {
            reflectionUtils.when(() -> ReflectionUtils.findMethod(Connector.class, "shutdown")).thenReturn(methodMock);
            reflectionUtils.when(() -> ReflectionUtils.invokeMethod(methodMock, connectorMock)).thenReturn(futureMock);
            CompletableFuture<Void> completableFuture = new CompletableFuture<>();
            doReturn(completableFuture).when(connectorMock).shutdown();
            GracefulShutdown target = new GracefulShutdown(serverMock, supplierMock);
            Connector[] connectorArray = new Connector[] { connectorMock };
            doReturn(connectorArray).when(serverMock).getConnectors();
            //Act Statement(s)
            target.shutDownGracefully(gracefulShutdownCallbackMock);
            //Assert statement(s)
            assertAll("result", () -> {
                reflectionUtils.verify(() -> ReflectionUtils.findMethod(Connector.class, "shutdown"), atLeast(1));
                reflectionUtils.verify(() -> ReflectionUtils.invokeMethod(methodMock, connectorMock), atLeast(1));
                verify(connectorMock).shutdown();
                verify(serverMock).getConnectors();
            });
        }
    }

    //Sapient generated method id: ${shutDownGracefullyWhenGetResult}, hash: 01BCA31264BA69AF095E5396C4A99C4D
    @Disabled()
    @Test()
    void shutDownGracefullyWhenGetResult() throws NoSuchMethodError, Exception {
        /* Branches:
         * (catch-exception (Exception)) : true  #  inside isJetty10 method
         * (for-each(this.server.getConnectors())) : true
         * (!jetty10) : true
         * (getResult) : true  #  inside shutdown method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Future.get) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        GracefulShutdown target = new GracefulShutdown(serverMock, supplierMock);
        Connector[] connectorArray = new Connector[] { connectorMock };
        doReturn(connectorArray).when(serverMock).getConnectors();
        CompletableFuture<Void> completableFuture = new CompletableFuture<>();
        doReturn(completableFuture).when(connectorMock).shutdown();
        
        //Act Statement(s)
        target.shutDownGracefully(gracefulShutdownCallbackMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(serverMock).getConnectors();
            verify(connectorMock).shutdown();
        });
    }

    //Sapient generated method id: ${abortTest}, hash: DB5081D1ED2BAED1AE3E9DAC1D19E27C
    @Test()
    void abortTest() {
        //Arrange Statement(s)
        GracefulShutdown target = new GracefulShutdown(serverMock, supplierMock);
        
        //Act Statement(s)
        target.abort();
    }
}
