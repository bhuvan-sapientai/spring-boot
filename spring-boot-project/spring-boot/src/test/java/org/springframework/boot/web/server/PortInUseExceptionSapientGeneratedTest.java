package org.springframework.boot.web.server;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import java.net.BindException;
import org.mockito.MockedStatic;
import java.util.function.IntSupplier;
import java.util.function.Consumer;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PortInUseExceptionSapientGeneratedTest {

    private final Consumer consumerMock = mock(Consumer.class);

    //Sapient generated method id: ${throwIfPortBindingExceptionTest}, hash: 37F48686C2F64A3704567E32C10F82FB
    @Test()
    void throwIfPortBindingExceptionTest() {
        //Arrange Statement(s)
        IntSupplier intSupplierMock = mock(IntSupplier.class);
        try (MockedStatic<PortInUseException> portInUseException = mockStatic(PortInUseException.class, CALLS_REAL_METHODS)) {
            Exception exception = new Exception();
            portInUseException.when(() -> PortInUseException.ifPortBindingException(eq(exception), (Consumer) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            PortInUseException.throwIfPortBindingException(exception, intSupplierMock);
            //Assert statement(s)
            assertAll("result", () -> portInUseException.verify(() -> PortInUseException.ifPortBindingException(eq(exception), (Consumer) any()), atLeast(1)));
        }
    }

    //Sapient generated method id: ${ifPortBindingExceptionTest}, hash: D7F56EE58A9276AB8DED5BD4D4BD8F6C
    @Test()
    void ifPortBindingExceptionTest() {
        //Arrange Statement(s)
        try (MockedStatic<PortInUseException> portInUseException = mockStatic(PortInUseException.class, CALLS_REAL_METHODS)) {
            Exception exception = new Exception();
            portInUseException.when(() -> PortInUseException.ifCausedBy(eq(exception), eq(BindException.class), (Consumer) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            PortInUseException.ifPortBindingException(exception, consumerMock);
            //Assert statement(s)
            assertAll("result", () -> portInUseException.verify(() -> PortInUseException.ifCausedBy(eq(exception), eq(BindException.class), (Consumer) any()), atLeast(1)));
        }
    }

    //Sapient generated method id: ${ifCausedByWhenCandidateIsNull}, hash: 80A428AE1F662D65781ED4D03DFFBF83
    @Test()
    void ifCausedByWhenCandidateIsNull() {
        /* Branches:
         * (candidate != null) : false
         */
        //Arrange Statement(s)
        Exception exception = null;
        //Act Statement(s)
        PortInUseException.ifCausedBy(exception, Exception.class, consumerMock);
    }

    //Sapient generated method id: ${ifCausedByWhenCausedByIsInstanceCandidate}, hash: 9A83BF0D76F7050C55F4646B40E51AC3
    @Test()
    void ifCausedByWhenCausedByIsInstanceCandidate() {
        /* Branches:
         * (candidate != null) : true
         * (causedBy.isInstance(candidate)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Exception exception = new Exception();
        //Act Statement(s)
        PortInUseException.ifCausedBy(exception, Exception.class, consumerMock);
    }
}
