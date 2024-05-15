package org.springframework.boot.jdbc;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.aop.framework.AopProxyUtils;
import org.mockito.MockedStatic;
import javax.sql.DataSource;
import org.springframework.aop.support.AopUtils;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DataSourceUnwrapperSapientGeneratedTest {

    private final DataSource dataSourceMock = mock(DataSource.class);

    private final DataSource wrapperMock = mock(DataSource.class);

    //Sapient generated method id: ${unwrapWhenTargetIsInstanceDataSource}, hash: 666479740CC908CCD49BDAA674440228
    @Test()
    void unwrapWhenTargetIsInstanceDataSource() throws Exception {
        /* Branches:
         * (target.isInstance(dataSource)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        DataSource result = DataSourceUnwrapper.unwrap(dataSourceMock, Object.class, DataSource.class);
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${unwrapWhenUnwrapInterfaceIsAssignableFromTarget}, hash: F15C7F21913473DA437F5A1DAA8E6604
    @Test()
    void unwrapWhenUnwrapInterfaceIsAssignableFromTarget() throws Exception {
        /* Branches:
         * (target.isInstance(dataSource)) : false
         * (target.isInterface()) : true  #  inside safeUnwrap method
         * (wrapper.isWrapperFor(target)) : true  #  inside safeUnwrap method
         * (unwrapped != null) : true
         * (unwrapInterface.isAssignableFrom(target)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        DataSource result = DataSourceUnwrapper.unwrap(dataSourceMock, Object.class, DataSource.class);
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${unwrapWhenAopUtilsNotIsAopProxyDataSource}, hash: 04CFEE260683DDC6D4B26CCFCEF713D9
    @Disabled()
    @Test()
    void unwrapWhenAopUtilsNotIsAopProxyDataSource() throws Exception {
        /* Branches:
         * (target.isInstance(dataSource)) : false
         * (target.isInterface()) : false  #  inside safeUnwrap method
         * (unwrapped != null) : false
         * (DELEGATING_DATA_SOURCE_PRESENT) : true
         * (targetDataSource != null) : false
         * (AopUtils.isAopProxy(dataSource)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<AopUtils> aopUtils = mockStatic(AopUtils.class)) {
            aopUtils.when(() -> AopUtils.isAopProxy(dataSourceMock)).thenReturn(false);
            //Act Statement(s)
            DataSource result = DataSourceUnwrapper.unwrap(dataSourceMock, Object.class, DataSource.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                aopUtils.verify(() -> AopUtils.isAopProxy(dataSourceMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${unwrapWhenDELEGATING_DATA_SOURCE_PRESENTAndTargetDataSourceIsNotNull}, hash: 1EA6E17518B529FEE27C6B6F1A1795A1
    @Test()
    void unwrapWhenDELEGATING_DATA_SOURCE_PRESENTAndTargetDataSourceIsNotNull() throws Exception {
        /* Branches:
         * (target.isInstance(dataSource)) : false
         * (target.isInterface()) : true  #  inside safeUnwrap method
         * (wrapper.isWrapperFor(target)) : true  #  inside safeUnwrap method
         * (unwrapped != null) : true
         * (unwrapInterface.isAssignableFrom(target)) : false
         * (DELEGATING_DATA_SOURCE_PRESENT) : true
         * (targetDataSource != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        DataSource result = DataSourceUnwrapper.unwrap(dataSourceMock, Object.class, DataSource.class);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${unwrapWhenUnwrappedIsNullAndDELEGATING_DATA_SOURCE_PRESENTAndTargetDataSourceIsNotNull}, hash: 177AB59920ED1231CE0A58907A4446BE
    @Disabled()
    @Test()
    void unwrapWhenUnwrappedIsNullAndDELEGATING_DATA_SOURCE_PRESENTAndTargetDataSourceIsNotNull() throws Exception {
        /* Branches:
         * (target.isInstance(dataSource)) : false
         * (target.isInterface()) : true  #  inside safeUnwrap method
         * (wrapper.isWrapperFor(target)) : true  #  inside safeUnwrap method
         * (catch-exception (Exception)) : true  #  inside safeUnwrap method
         * (unwrapped != null) : false
         * (DELEGATING_DATA_SOURCE_PRESENT) : true
         * (targetDataSource != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(true).when(wrapperMock).isWrapperFor(Object.class);
        Object object = new Object();
        doReturn(object).when(wrapperMock).unwrap(Object.class);
        //Act Statement(s)
        DataSource result = DataSourceUnwrapper.unwrap(wrapperMock, Object.class, DataSource.class);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(wrapperMock).isWrapperFor(Object.class);
            verify(wrapperMock).unwrap(Object.class);
        });
    }

    //Sapient generated method id: ${unwrapWhenAopUtilsIsAopProxyDataSourceAndProxyTargetInstanceOfDataSource}, hash: 29F8D9D5220D6B078DEDAE37AD4BCCCC
    @Disabled()
    @Test()
    void unwrapWhenAopUtilsIsAopProxyDataSourceAndProxyTargetInstanceOfDataSource() throws Exception {
        /* Branches:
         * (target.isInstance(dataSource)) : false
         * (target.isInterface()) : true  #  inside safeUnwrap method
         * (wrapper.isWrapperFor(target)) : true  #  inside safeUnwrap method
         * (unwrapped != null) : true
         * (unwrapInterface.isAssignableFrom(target)) : false
         * (DELEGATING_DATA_SOURCE_PRESENT) : true
         * (targetDataSource != null) : false
         * (AopUtils.isAopProxy(dataSource)) : true
         * (proxyTarget instanceof DataSource proxyDataSource) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DataSource dataSourceMock2 = mock(DataSource.class);
        try (MockedStatic<AopProxyUtils> aopProxyUtils = mockStatic(AopProxyUtils.class);
            MockedStatic<AopUtils> aopUtils = mockStatic(AopUtils.class)) {
            aopUtils.when(() -> AopUtils.isAopProxy(dataSourceMock)).thenReturn(true);
            aopProxyUtils.when(() -> AopProxyUtils.getSingletonTarget(dataSourceMock)).thenReturn(dataSourceMock2);
            //Act Statement(s)
            DataSource result = DataSourceUnwrapper.unwrap(dataSourceMock, Object.class, DataSource.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                aopUtils.verify(() -> AopUtils.isAopProxy(dataSourceMock), atLeast(1));
                aopProxyUtils.verify(() -> AopProxyUtils.getSingletonTarget(dataSourceMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${unwrapWhenTargetDataSourceIsNullAndAopUtilsIsAopProxyDataSourceAndProxyTargetInstanceOfDataSource}, hash: 96FD49DA9DBE5DD43E7F1AA5F8CF7A6B
    @Disabled()
    @Test()
    void unwrapWhenTargetDataSourceIsNullAndAopUtilsIsAopProxyDataSourceAndProxyTargetInstanceOfDataSource() throws Exception {
        /* Branches:
         * (target.isInstance(dataSource)) : false
         * (target.isInterface()) : true  #  inside safeUnwrap method
         * (wrapper.isWrapperFor(target)) : true  #  inside safeUnwrap method
         * (catch-exception (Exception)) : true  #  inside safeUnwrap method
         * (unwrapped != null) : false
         * (DELEGATING_DATA_SOURCE_PRESENT) : true
         * (targetDataSource != null) : false
         * (AopUtils.isAopProxy(dataSource)) : true
         * (proxyTarget instanceof DataSource proxyDataSource) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<AopProxyUtils> aopProxyUtils = mockStatic(AopProxyUtils.class);
            MockedStatic<AopUtils> aopUtils = mockStatic(AopUtils.class)) {
            doReturn(true).when(wrapperMock).isWrapperFor(Object.class);
            Object object = new Object();
            doReturn(object).when(wrapperMock).unwrap(Object.class);
            aopUtils.when(() -> AopUtils.isAopProxy(wrapperMock)).thenReturn(true);
            aopProxyUtils.when(() -> AopProxyUtils.getSingletonTarget(wrapperMock)).thenReturn(dataSourceMock);
            //Act Statement(s)
            DataSource result = DataSourceUnwrapper.unwrap(wrapperMock, Object.class, DataSource.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(wrapperMock).isWrapperFor(Object.class);
                verify(wrapperMock).unwrap(Object.class);
                aopUtils.verify(() -> AopUtils.isAopProxy(wrapperMock), atLeast(1));
                aopProxyUtils.verify(() -> AopProxyUtils.getSingletonTarget(wrapperMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${unwrapWhenTargetDataSourceIsNullAndAopUtilsIsAopProxyDataSourceAndProxyTargetNotInstanceOfDataSource}, hash: C1D405CBCFE72F0069C0078EAF118871
    @Disabled()
    @Test()
    void unwrapWhenTargetDataSourceIsNullAndAopUtilsIsAopProxyDataSourceAndProxyTargetNotInstanceOfDataSource() throws Exception {
        /* Branches:
         * (target.isInstance(dataSource)) : false
         * (target.isInterface()) : true  #  inside safeUnwrap method
         * (wrapper.isWrapperFor(target)) : true  #  inside safeUnwrap method
         * (catch-exception (Exception)) : true  #  inside safeUnwrap method
         * (unwrapped != null) : false
         * (DELEGATING_DATA_SOURCE_PRESENT) : true
         * (targetDataSource != null) : false
         * (AopUtils.isAopProxy(dataSource)) : true
         * (proxyTarget instanceof DataSource proxyDataSource) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<AopProxyUtils> aopProxyUtils = mockStatic(AopProxyUtils.class);
            MockedStatic<AopUtils> aopUtils = mockStatic(AopUtils.class)) {
            doReturn(true).when(wrapperMock).isWrapperFor(Object.class);
            Object object = new Object();
            doReturn(object).when(wrapperMock).unwrap(Object.class);
            aopUtils.when(() -> AopUtils.isAopProxy(wrapperMock)).thenReturn(true);
            Object object2 = new Object();
            aopProxyUtils.when(() -> AopProxyUtils.getSingletonTarget(wrapperMock)).thenReturn(object2);
            //Act Statement(s)
            DataSource result = DataSourceUnwrapper.unwrap(wrapperMock, Object.class, DataSource.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                verify(wrapperMock).isWrapperFor(Object.class);
                verify(wrapperMock).unwrap(Object.class);
                aopUtils.verify(() -> AopUtils.isAopProxy(wrapperMock), atLeast(1));
                aopProxyUtils.verify(() -> AopProxyUtils.getSingletonTarget(wrapperMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${unwrap1Test}, hash: 86946C5E1E7C5BD95606824F2E2E84FD
    @Test()
    void unwrap1Test() throws Exception {
        //Arrange Statement(s)
        try (MockedStatic<DataSourceUnwrapper> dataSourceUnwrapper = mockStatic(DataSourceUnwrapper.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            dataSourceUnwrapper.when(() -> DataSourceUnwrapper.unwrap(dataSourceMock, Object.class, Object.class)).thenReturn(object);
            //Act Statement(s)
            Object result = DataSourceUnwrapper.unwrap(dataSourceMock, Object.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                dataSourceUnwrapper.verify(() -> DataSourceUnwrapper.unwrap(dataSourceMock, Object.class, Object.class), atLeast(1));
            });
        }
    }
}
