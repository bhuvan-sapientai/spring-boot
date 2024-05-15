package org.springframework.boot.ssl.pem;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PemSslStoreBundleSapientGeneratedTest {

    private final PemSslStoreDetails pemSslStoreDetailsMock = mock(PemSslStoreDetails.class);

    private final PemSslStoreDetails pemSslStoreDetailsMock2 = mock(PemSslStoreDetails.class);

    //Sapient generated method id: ${getKeyStorePasswordTest}, hash: 4512C85B3F3D366206A3AE9A4B26F349
    @Test()
    void getKeyStorePasswordTest() {
        //Arrange Statement(s)
        try (MockedStatic<PemSslStore> pemSslStore = mockStatic(PemSslStore.class)) {
            pemSslStore.when(() -> PemSslStore.load(pemSslStoreDetailsMock)).thenReturn(null);
            pemSslStore.when(() -> PemSslStore.load(pemSslStoreDetailsMock2)).thenReturn(null);
            PemSslStoreBundle target = new PemSslStoreBundle(pemSslStoreDetailsMock, pemSslStoreDetailsMock2, "alias1");
            //Act Statement(s)
            String result = target.getKeyStorePassword();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                pemSslStore.verify(() -> PemSslStore.load(pemSslStoreDetailsMock), atLeast(1));
                pemSslStore.verify(() -> PemSslStore.load(pemSslStoreDetailsMock2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${toStringWhenThisTrustStoreIsNull}, hash: 6615E2DD79759B62426B269412AF652B
    @Disabled()
    @Test()
    void toStringWhenThisTrustStoreIsNull() {
        /* Branches:
         * (this.keyStore != null) : false
         * (this.trustStore != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: creator - Method: append
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<PemSslStore> pemSslStore = mockStatic(PemSslStore.class)) {
            pemSslStore.when(() -> PemSslStore.load(pemSslStoreDetailsMock)).thenReturn(null);
            pemSslStore.when(() -> PemSslStore.load(pemSslStoreDetailsMock2)).thenReturn(null);
            PemSslStoreBundle target = new PemSslStoreBundle(pemSslStoreDetailsMock, pemSslStoreDetailsMock2, "alias1");
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                pemSslStore.verify(() -> PemSslStore.load(pemSslStoreDetailsMock), atLeast(1));
                pemSslStore.verify(() -> PemSslStore.load(pemSslStoreDetailsMock2), atLeast(1));
            });
        }
    }
}
