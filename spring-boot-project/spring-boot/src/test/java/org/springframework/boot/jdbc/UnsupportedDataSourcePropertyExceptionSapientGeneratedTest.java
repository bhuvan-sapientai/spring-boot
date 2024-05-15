package org.springframework.boot.jdbc;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.function.Supplier;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UnsupportedDataSourcePropertyExceptionSapientGeneratedTest {

    private final Supplier supplierMock = mock(Supplier.class);

    //Sapient generated method id: ${throwIfWhenTestThrowsUnsupportedDataSourcePropertyException}, hash: C38A29531A1A3394ED064976C945DF62
    @Disabled()
    @Test()
    void throwIfWhenTestThrowsUnsupportedDataSourcePropertyException() {
        /* Branches:
         * (test) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        UnsupportedDataSourcePropertyException unsupportedDataSourcePropertyException = new UnsupportedDataSourcePropertyException("message1");
        //Act Statement(s)
        final UnsupportedDataSourcePropertyException result = assertThrows(UnsupportedDataSourcePropertyException.class, () -> {
            UnsupportedDataSourcePropertyException.throwIf(true, supplierMock);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(unsupportedDataSourcePropertyException.getMessage()));
        });
    }

    //Sapient generated method id: ${throwIfWhenNotTest}, hash: 86BDC5A05F123582EF55918D1B1E3581
    @Test()
    void throwIfWhenNotTest() {
        /* Branches:
         * (test) : false
         */
        //Act Statement(s)
        UnsupportedDataSourcePropertyException.throwIf(false, supplierMock);
    }
}
