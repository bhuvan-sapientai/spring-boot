package org.springframework.boot.ssl;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import java.util.function.Supplier;
import org.mockito.MockedStatic;
import java.util.function.Consumer;
import org.springframework.util.Assert;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DefaultSslBundleRegistrySapientGeneratedTest {

    private final Consumer consumerMock = mock(Consumer.class);

    private final SslBundle sslBundleMock = mock(SslBundle.class);

    private final SslBundle sslBundleMock2 = mock(SslBundle.class);

    //Sapient generated method id: ${registerBundleWhenPreviousIsNotNull}, hash: 329CB9EAC87F01852D9E2303ADBBED23
    @Test()
    void registerBundleWhenPreviousIsNotNull() {
        /* Branches:
         * (previous == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("A", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(sslBundleMock, "Bundle must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            DefaultSslBundleRegistry target = new DefaultSslBundleRegistry("A", sslBundleMock);
            //Act Statement(s)
            target.registerBundle("A", sslBundleMock);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull("A", "Name must not be null"), atLeast(2));
                _assert.verify(() -> Assert.notNull(sslBundleMock, "Bundle must not be null"), atLeast(2));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
                _assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
            });
        }
    }

    //Sapient generated method id: ${updateBundleWhenRegisteredIsNullThrowsNoSuchSslBundleException}, hash: 9BBE2A2A43119FDD1E83B5C06D195937
    @Disabled()
    @Test()
    void updateBundleWhenRegisteredIsNullThrowsNoSuchSslBundleException() {
        /* Branches:
         * (registered == null) : true  #  inside getRegistered method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("name1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(sslBundleMock, "Bundle must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull("object1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DefaultSslBundleRegistry target = new DefaultSslBundleRegistry("name1", sslBundleMock);
            //Act Statement(s)
            final NoSuchSslBundleException result = assertThrows(NoSuchSslBundleException.class, () -> {
                target.updateBundle((String) null, sslBundleMock2);
            });
            NoSuchSslBundleException noSuchSslBundleException = new NoSuchSslBundleException("object1", "message1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(noSuchSslBundleException.getMessage()));
                _assert.verify(() -> Assert.notNull("name1", "Name must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(sslBundleMock, "Bundle must not be null"), atLeast(1));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
                _assert.verify(() -> Assert.notNull("object1", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${updateBundleWhenRegisteredIsNotNull}, hash: 97EFEBB6FA7B31A044E02C898B5EBA33
    @Test()
    void updateBundleWhenRegisteredIsNotNull() {
        /* Branches:
         * (registered == null) : false  #  inside getRegistered method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("name1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(sslBundleMock, "Bundle must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            DefaultSslBundleRegistry target = new DefaultSslBundleRegistry("name1", sslBundleMock);
            //Act Statement(s)
            target.updateBundle("name1", sslBundleMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull("name1", "Name must not be null"), atLeast(2));
                _assert.verify(() -> Assert.notNull(sslBundleMock, "Bundle must not be null"), atLeast(1));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
            });
        }
    }

    //Sapient generated method id: ${getBundleWhenRegisteredIsNullThrowsNoSuchSslBundleException}, hash: DD3E34477A653FAC4228895B656322EF
    @Disabled()
    @Test()
    void getBundleWhenRegisteredIsNullThrowsNoSuchSslBundleException() {
        /* Branches:
         * (registered == null) : true  #  inside getRegistered method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("name1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(sslBundleMock, "Bundle must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull("object1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DefaultSslBundleRegistry target = new DefaultSslBundleRegistry("name1", sslBundleMock);
            //Act Statement(s)
            final NoSuchSslBundleException result = assertThrows(NoSuchSslBundleException.class, () -> {
                target.getBundle((String) null);
            });
            NoSuchSslBundleException noSuchSslBundleException = new NoSuchSslBundleException("object1", "message1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(noSuchSslBundleException.getMessage()));
                _assert.verify(() -> Assert.notNull("name1", "Name must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(sslBundleMock, "Bundle must not be null"), atLeast(1));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
                _assert.verify(() -> Assert.notNull("object1", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getBundleWhenRegisteredIsNotNull}, hash: 7AA0BB4D7A1739E8F8A629B4A85A0312
    @Test()
    void getBundleWhenRegisteredIsNotNull() {
        /* Branches:
         * (registered == null) : false  #  inside getRegistered method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("name1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(sslBundleMock, "Bundle must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            DefaultSslBundleRegistry target = new DefaultSslBundleRegistry("name1", sslBundleMock);
            //Act Statement(s)
            SslBundle result = target.getBundle("name1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull("name1", "Name must not be null"), atLeast(2));
                _assert.verify(() -> Assert.notNull(sslBundleMock, "Bundle must not be null"), atLeast(1));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
            });
        }
    }

    //Sapient generated method id: ${addBundleUpdateHandlerWhenRegisteredIsNullThrowsNoSuchSslBundleException}, hash: B7D93BEEE307EA5128D110CF810D7644
    @Disabled()
    @Test()
    void addBundleUpdateHandlerWhenRegisteredIsNullThrowsNoSuchSslBundleException() throws NoSuchSslBundleException {
        /* Branches:
         * (registered == null) : true  #  inside getRegistered method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("name1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(sslBundleMock, "Bundle must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull("object1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            DefaultSslBundleRegistry target = new DefaultSslBundleRegistry("name1", sslBundleMock);
            //Act Statement(s)
            final NoSuchSslBundleException result = assertThrows(NoSuchSslBundleException.class, () -> {
                target.addBundleUpdateHandler((String) null, consumerMock);
            });
            NoSuchSslBundleException noSuchSslBundleException = new NoSuchSslBundleException("object1", "message1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(noSuchSslBundleException.getMessage()));
                _assert.verify(() -> Assert.notNull("name1", "Name must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(sslBundleMock, "Bundle must not be null"), atLeast(1));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
                _assert.verify(() -> Assert.notNull("object1", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${addBundleUpdateHandlerWhenRegisteredIsNotNull}, hash: A7E7801DB1DB3C7C9DC27DBE6836B41D
    @Test()
    void addBundleUpdateHandlerWhenRegisteredIsNotNull() throws NoSuchSslBundleException {
        /* Branches:
         * (registered == null) : false  #  inside getRegistered method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("name1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(sslBundleMock, "Bundle must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            DefaultSslBundleRegistry target = new DefaultSslBundleRegistry("name1", sslBundleMock);
            //Act Statement(s)
            target.addBundleUpdateHandler("name1", consumerMock);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull("name1", "Name must not be null"), atLeast(2));
                _assert.verify(() -> Assert.notNull(sslBundleMock, "Bundle must not be null"), atLeast(1));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
            });
        }
    }
}
