package org.springframework.boot.r2dbc;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.springframework.util.ClassUtils;
import java.util.function.Supplier;
import io.r2dbc.spi.ConnectionFactoryOptions;
import org.mockito.MockedStatic;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.util.Assert;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
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
class EmbeddedDatabaseConnectionSapientGeneratedTest {

    private final ConnectionFactory connectionFactoryMock = mock(ConnectionFactory.class);

    private final ConnectionFactory connectionFactoryMock2 = mock(ConnectionFactory.class);

    private final ConnectionFactoryOptions connectionFactoryOptionsMock = mock(ConnectionFactoryOptions.class);

    //Sapient generated method id: ${getUrlWhenThisUrlIsNull}, hash: EADEE8316126CAAB5A00913C39498EDE
    @Disabled()
    @Test()
    void getUrlWhenThisUrlIsNull() {
        /* Branches:
         * (this.url != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText("C", "DatabaseName must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
            EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");
            //Act Statement(s)
            String result = target.getUrl("C");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                _assert.verify(() -> Assert.hasText("C", "DatabaseName must not be empty"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getWhenClassUtilsIsPresentCandidateGetDriverClassNameClassLoader}, hash: 93C0664BF0C85BFE0F634B68C1FEA663
    @Disabled()
    @Test()
    void getWhenClassUtilsIsPresentCandidateGetDriverClassNameClassLoader() {
        /* Branches:
         * (for-each(EmbeddedDatabaseConnection.values())) : true
         * (candidate != NONE) : true
         * (ClassUtils.isPresent(candidate.getDriverClassName(), classLoader)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            classUtils.when(() -> ClassUtils.isPresent(eq((String) null), (ClassLoader) any())).thenReturn(true);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            //Act Statement(s)
            EmbeddedDatabaseConnection result = EmbeddedDatabaseConnection.get(classLoader);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(EmbeddedDatabaseConnection.NONE));
                classUtils.verify(() -> ClassUtils.isPresent(eq((String) null), (ClassLoader) any()));
            });
        }
    }

    //Sapient generated method id: ${getWhenClassUtilsNotIsPresentCandidateGetDriverClassNameClassLoader}, hash: 0B4706065C88F4262924461F3D2782D3
    @Disabled()
    @Test()
    void getWhenClassUtilsNotIsPresentCandidateGetDriverClassNameClassLoader() {
        /* Branches:
         * (for-each(EmbeddedDatabaseConnection.values())) : true
         * (candidate != NONE) : true
         * (ClassUtils.isPresent(candidate.getDriverClassName(), classLoader)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            classUtils.when(() -> ClassUtils.isPresent(eq((String) null), (ClassLoader) any())).thenReturn(false);
            classUtils.when(() -> ClassUtils.isPresent(eq("io.r2dbc.h2.H2ConnectionFactoryProvider"), (ClassLoader) any())).thenReturn(false);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            //Act Statement(s)
            EmbeddedDatabaseConnection result = EmbeddedDatabaseConnection.get(classLoader);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(EmbeddedDatabaseConnection.NONE));
                classUtils.verify(() -> ClassUtils.isPresent(eq((String) null), (ClassLoader) any()));
                classUtils.verify(() -> ClassUtils.isPresent(eq("io.r2dbc.h2.H2ConnectionFactoryProvider"), (ClassLoader) any()));
            });
        }
    }

    //Sapient generated method id: ${isEmbeddedWhenCandidateEmbeddedTestOptions}, hash: 1F301E1548BB2521BA64ED840C4DBC18
    @Disabled()
    @Test()
    void isEmbeddedWhenCandidateEmbeddedTestOptions() {
        /* Branches:
         * (for-each(values())) : true
         * (candidate.embedded.test(options)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<OptionsCapableConnectionFactory> optionsCapableConnectionFactory = mockStatic(OptionsCapableConnectionFactory.class)) {
            OptionsCapableConnectionFactory optionsCapableConnectionFactory2 = new OptionsCapableConnectionFactory(connectionFactoryOptionsMock, connectionFactoryMock);
            optionsCapableConnectionFactory.when(() -> OptionsCapableConnectionFactory.unwrapFrom(connectionFactoryMock2)).thenReturn(optionsCapableConnectionFactory2);
            _assert.when(() -> Assert.notNull(eq(optionsCapableConnectionFactory2), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            boolean result = EmbeddedDatabaseConnection.isEmbedded(connectionFactoryMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                optionsCapableConnectionFactory.verify(() -> OptionsCapableConnectionFactory.unwrapFrom(connectionFactoryMock2), atLeast(1));
                _assert.verify(() -> Assert.notNull(eq(optionsCapableConnectionFactory2), (Supplier) any()));
            });
        }
    }

    //Sapient generated method id: ${isEmbeddedWhenCandidateEmbeddedNotTestOptions}, hash: 2BA1A43CCD6FDE12BBA0F4631C2E53B7
    @Disabled()
    @Test()
    void isEmbeddedWhenCandidateEmbeddedNotTestOptions() {
        /* Branches:
         * (for-each(values())) : true
         * (candidate.embedded.test(options)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<OptionsCapableConnectionFactory> optionsCapableConnectionFactory = mockStatic(OptionsCapableConnectionFactory.class)) {
            OptionsCapableConnectionFactory optionsCapableConnectionFactory2 = new OptionsCapableConnectionFactory(connectionFactoryOptionsMock, connectionFactoryMock);
            optionsCapableConnectionFactory.when(() -> OptionsCapableConnectionFactory.unwrapFrom(connectionFactoryMock2)).thenReturn(optionsCapableConnectionFactory2);
            _assert.when(() -> Assert.notNull(eq(optionsCapableConnectionFactory2), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            boolean result = EmbeddedDatabaseConnection.isEmbedded(connectionFactoryMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                optionsCapableConnectionFactory.verify(() -> OptionsCapableConnectionFactory.unwrapFrom(connectionFactoryMock2), atLeast(1));
                _assert.verify(() -> Assert.notNull(eq(optionsCapableConnectionFactory2), (Supplier) any()));
            });
        }
    }
}
