package org.springframework.boot.ssl;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.KeyStore;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManagerFactory;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DefaultSslManagerBundleSapientGeneratedTest {

    private final SslStoreBundle storeBundleMock = mock(SslStoreBundle.class, "storeBundle");

    private final SslBundleKey keyMock = mock(SslBundleKey.class, "key");

    private final KeyStore keyStoreMock = mock(KeyStore.class);

    //Sapient generated method id: ${getKeyManagerFactoryWhenPasswordIsNullAndPasswordIsNotNull}, hash: 5BAC92A4AAA12B1FB13BACCDCE93BCE2
    @Disabled()
    @Test()
    void getKeyManagerFactoryWhenPasswordIsNullAndPasswordIsNotNull() throws Exception {
        /* Branches:
         * (alias != null) : true
         * (password != null) : false
         * (password != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: factory - Method: init
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, keyMock);
        doReturn(keyStoreMock).when(storeBundleMock).getKeyStore();
        doNothing().when(keyMock).assertContainsAlias(keyStoreMock);
        doReturn("return_of_getAlias1").when(keyMock).getAlias();
        doReturn(null).when(keyMock).getPassword();
        doReturn("A").when(storeBundleMock).getKeyStorePassword();
        //Act Statement(s)
        KeyManagerFactory result = target.getKeyManagerFactory();
        //Assert statement(s)
        //TODO: Please implement equals method in AliasKeyManagerFactory for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(storeBundleMock).getKeyStore();
            verify(keyMock).assertContainsAlias(keyStoreMock);
            verify(keyMock).getAlias();
            verify(keyMock).getPassword();
            verify(storeBundleMock).getKeyStorePassword();
        });
    }

    //Sapient generated method id: ${getKeyManagerFactoryWhenPasswordIsNull}, hash: 6ADBC383A4F805D016893E8255B8749F
    @Disabled()
    @Test()
    void getKeyManagerFactoryWhenPasswordIsNull() throws Exception {
        /* Branches:
         * (alias != null) : true
         * (password != null) : false
         * (password != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: factory - Method: init
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, keyMock);
        doReturn(keyStoreMock).when(storeBundleMock).getKeyStore();
        doNothing().when(keyMock).assertContainsAlias(keyStoreMock);
        doReturn("return_of_getAlias1").when(keyMock).getAlias();
        doReturn(null).when(keyMock).getPassword();
        doReturn(null).when(storeBundleMock).getKeyStorePassword();
        //Act Statement(s)
        KeyManagerFactory result = target.getKeyManagerFactory();
        //Assert statement(s)
        //TODO: Please implement equals method in AliasKeyManagerFactory for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(storeBundleMock).getKeyStore();
            verify(keyMock).assertContainsAlias(keyStoreMock);
            verify(keyMock).getAlias();
            verify(keyMock).getPassword();
            verify(storeBundleMock).getKeyStorePassword();
        });
    }

    //Sapient generated method id: ${getKeyManagerFactoryWhenPasswordIsNotNullAndPasswordIsNotNull}, hash: 21B430AB0C239A9DB56398C6897053A7
    @Disabled()
    @Test()
    void getKeyManagerFactoryWhenPasswordIsNotNullAndPasswordIsNotNull() throws Exception {
        /* Branches:
         * (alias != null) : false
         * (password != null) : true
         * (password != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: factory - Method: init
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, keyMock);
        doReturn(keyStoreMock).when(storeBundleMock).getKeyStore();
        doNothing().when(keyMock).assertContainsAlias(keyStoreMock);
        doReturn(null).when(keyMock).getAlias();
        doReturn("A").when(keyMock).getPassword();
        //Act Statement(s)
        KeyManagerFactory result = target.getKeyManagerFactory();
        //Assert statement(s)
        //TODO: Please implement equals method in KeyManagerFactory for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(storeBundleMock).getKeyStore();
            verify(keyMock).assertContainsAlias(keyStoreMock);
            verify(keyMock).getAlias();
            verify(keyMock).getPassword();
        });
    }

    //Sapient generated method id: ${getKeyManagerFactoryWhenCaughtRuntimeExceptionThrowsRuntimeException}, hash: 5114782A5292D4637B0930758E41E606
    @Test()
    void getKeyManagerFactoryWhenCaughtRuntimeExceptionThrowsRuntimeException() throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException {
        /* Branches:
         * (alias != null) : true
         * (password != null) : true
         * (password != null) : true
         * (catch-exception (RuntimeException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: factory - Method: init
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, keyMock);
        doReturn(keyStoreMock).when(storeBundleMock).getKeyStore();
        doNothing().when(keyMock).assertContainsAlias(keyStoreMock);
        doReturn("return_of_getAlias1").when(keyMock).getAlias();
        doReturn("A").when(keyMock).getPassword();
        //Act Statement(s)
        final RuntimeException result = assertThrows(RuntimeException.class, () -> {
            target.getKeyManagerFactory();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(storeBundleMock).getKeyStore();
            verify(keyMock).assertContainsAlias(keyStoreMock);
            verify(keyMock).getAlias();
            verify(keyMock).getPassword();
        });
    }

    //Sapient generated method id: ${getKeyManagerFactoryWhenPasswordIsNotNullAndCaughtExceptionThrowsIllegalStateException}, hash: DEE99C5B93532AB5C7AE6E8BD94FD3AD
    @Disabled()
    @Test()
    void getKeyManagerFactoryWhenPasswordIsNotNullAndCaughtExceptionThrowsIllegalStateException() throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException {
        /* Branches:
         * (alias != null) : true
         * (password != null) : false
         * (password != null) : true
         * (catch-exception (Exception)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: factory - Method: init
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, keyMock);
        doReturn(keyStoreMock).when(storeBundleMock).getKeyStore();
        doNothing().when(keyMock).assertContainsAlias(keyStoreMock);
        doReturn("return_of_getAlias1").when(keyMock).getAlias();
        doReturn(null).when(keyMock).getPassword();
        doReturn("A").when(storeBundleMock).getKeyStorePassword();
        Exception exception = new Exception("B");
        IllegalStateException illegalStateException = new IllegalStateException("Could not load key manager factory: B", exception);
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.getKeyManagerFactory();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
            assertThat(result.getCause(), is(instanceOf(exception.getClass())));
            verify(storeBundleMock).getKeyStore();
            verify(keyMock).assertContainsAlias(keyStoreMock);
            verify(keyMock).getAlias();
            verify(keyMock).getPassword();
            verify(storeBundleMock).getKeyStorePassword();
        });
    }

    //Sapient generated method id: ${getKeyManagerFactoryWhenPasswordIsNullAndCaughtExceptionThrowsIllegalStateException}, hash: 5EF6CC787B120F3CC31F4946269DC89C
    @Disabled()
    @Test()
    void getKeyManagerFactoryWhenPasswordIsNullAndCaughtExceptionThrowsIllegalStateException() throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException {
        /* Branches:
         * (alias != null) : true
         * (password != null) : false
         * (password != null) : false
         * (catch-exception (Exception)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: factory - Method: init
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, keyMock);
        doReturn(keyStoreMock).when(storeBundleMock).getKeyStore();
        doNothing().when(keyMock).assertContainsAlias(keyStoreMock);
        doReturn("return_of_getAlias1").when(keyMock).getAlias();
        doReturn(null).when(keyMock).getPassword();
        doReturn(null).when(storeBundleMock).getKeyStorePassword();
        Exception exception = new Exception("A");
        IllegalStateException illegalStateException = new IllegalStateException("Could not load key manager factory: A", exception);
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.getKeyManagerFactory();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
            assertThat(result.getCause(), is(instanceOf(exception.getClass())));
            verify(storeBundleMock).getKeyStore();
            verify(keyMock).assertContainsAlias(keyStoreMock);
            verify(keyMock).getAlias();
            verify(keyMock).getPassword();
            verify(storeBundleMock).getKeyStorePassword();
        });
    }

    //Sapient generated method id: ${getTrustManagerFactoryTest}, hash: C4508F13076E507DCA1BA90E46999554
    @Disabled()
    @Test()
    void getTrustManagerFactoryTest() throws Exception {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: factory - Method: init
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, keyMock);
        doReturn(keyStoreMock).when(storeBundleMock).getTrustStore();
        //Act Statement(s)
        TrustManagerFactory result = target.getTrustManagerFactory();
        //Assert statement(s)
        //TODO: Please implement equals method in TrustManagerFactory for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(storeBundleMock).getTrustStore();
        });
    }

    //Sapient generated method id: ${getTrustManagerFactoryWhenCaughtExceptionThrowsIllegalStateException}, hash: A1FE6E544B12394E0359EF3A9BCBD8AB
    @Disabled()
    @Test()
    void getTrustManagerFactoryWhenCaughtExceptionThrowsIllegalStateException() throws KeyStoreException {
        /* Branches:
         * (catch-exception (Exception)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: factory - Method: init
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, keyMock);
        doReturn(keyStoreMock).when(storeBundleMock).getTrustStore();
        Exception exception = new Exception("A");
        IllegalStateException illegalStateException = new IllegalStateException("Could not load trust manager factory: A", exception);
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.getTrustManagerFactory();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
            assertThat(result.getCause(), is(instanceOf(exception.getClass())));
            verify(storeBundleMock).getTrustStore();
        });
    }

    //Sapient generated method id: ${getKeyManagerFactoryInstanceTest}, hash: 02C7898BB39E796B669D3F036C94EB47
    @Disabled()
    @Test()
    void getKeyManagerFactoryInstanceTest() throws NoSuchAlgorithmException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, keyMock);
        //Act Statement(s)
        KeyManagerFactory result = target.getKeyManagerFactoryInstance("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getTrustManagerFactoryInstanceTest}, hash: 72B3C4C76623EC1C79D08D95E643D8FD
    @Disabled()
    @Test()
    void getTrustManagerFactoryInstanceTest() throws NoSuchAlgorithmException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DefaultSslManagerBundle target = new DefaultSslManagerBundle(storeBundleMock, keyMock);
        //Act Statement(s)
        TrustManagerFactory result = target.getTrustManagerFactoryInstance("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
