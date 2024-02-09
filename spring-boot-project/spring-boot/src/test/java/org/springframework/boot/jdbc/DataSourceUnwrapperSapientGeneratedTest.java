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
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DataSourceUnwrapperSapientGeneratedTest {

	//Sapient generated method id: ${97fd7bfd-8651-35ec-ab27-7bdc12c95d42}
	@Disabled()
	@Test()
	void unwrapWhenTargetIsInstanceDataSource() throws Exception {
		/* Branches:
		 * (target.isInstance(dataSource)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//TODO: Needs initialization with real value
		DataSource dataSource = null;
		//Act Statement(s)
		DataSource result = DataSourceUnwrapper.unwrap(dataSource, Object.class, DataSource.class);
		Object object = new Object();
		//Assert statement(s)
		//TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(object)));
	}

	//Sapient generated method id: ${74459a33-57d8-3d9a-9f62-1f5f2b5dac04}
	@Disabled()
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
		//Arrange Statement(s)
		//TODO: Needs initialization with real value
		DataSource dataSource = null;
		//Act Statement(s)
		DataSource result = DataSourceUnwrapper.unwrap(dataSource, Object.class, DataSource.class);
		Object object = new Object();
		//Assert statement(s)
		//TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(object)));
	}

	//Sapient generated method id: ${cbf536a1-9c95-359a-be7b-125ac76b4c0e}
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
		//Arrange Statement(s)
		//TODO: Needs initialization with real value
		DataSource dataSource = null;
		//Act Statement(s)
		DataSource result = DataSourceUnwrapper.unwrap(dataSource, Object.class, DataSource.class);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${42efdf47-a713-320a-9bd0-7e6ea6f769bf}
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
		//TODO: Needs initialization with real value
		DataSource dataSource = null;
		//Act Statement(s)
		DataSource result = DataSourceUnwrapper.unwrap(dataSource, Object.class, DataSource.class);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${c642c1c1-2e1a-389b-b944-3f5677f39598}
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
		try (MockedStatic<AopProxyUtils> aopProxyUtils = mockStatic(AopProxyUtils.class);
			 MockedStatic<AopUtils> aopUtils = mockStatic(AopUtils.class)) {
			aopUtils.when(() -> AopUtils.isAopProxy((DataSource) null)).thenReturn(true);
			//TODO: Needs to return real value
			aopProxyUtils.when(() -> AopProxyUtils.getSingletonTarget((DataSource) null)).thenReturn(null);
			//TODO: Needs initialization with real value
			DataSource dataSource = null;
			//Act Statement(s)
			DataSource result = DataSourceUnwrapper.unwrap(dataSource, Object.class, DataSource.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				aopUtils.verify(() -> AopUtils.isAopProxy((DataSource) null), atLeast(1));
				aopProxyUtils.verify(() -> AopProxyUtils.getSingletonTarget((DataSource) null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f5ee9e98-a7d3-3e3a-ab21-4184b1880e8f}
	@Test()
	void unwrapWhenAopUtilsIsAopProxyDataSourceAndProxyTargetNotInstanceOfDataSource() throws Exception {
		/* Branches:
		 * (target.isInstance(dataSource)) : false
		 * (target.isInterface()) : true  #  inside safeUnwrap method
		 * (wrapper.isWrapperFor(target)) : true  #  inside safeUnwrap method
		 * (unwrapped != null) : true
		 * (unwrapInterface.isAssignableFrom(target)) : false
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
			aopUtils.when(() -> AopUtils.isAopProxy((DataSource) null)).thenReturn(true);
			Object object = new Object();
			aopProxyUtils.when(() -> AopProxyUtils.getSingletonTarget((DataSource) null)).thenReturn(object);
			//TODO: Needs initialization with real value
			DataSource dataSource = null;
			//Act Statement(s)
			DataSource result = DataSourceUnwrapper.unwrap(dataSource, Object.class, DataSource.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				aopUtils.verify(() -> AopUtils.isAopProxy((DataSource) null), atLeast(1));
				aopProxyUtils.verify(() -> AopProxyUtils.getSingletonTarget((DataSource) null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${03407398-5b82-3770-ae66-8bb4cecbe499}
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
		try (MockedStatic<AopUtils> aopUtils = mockStatic(AopUtils.class)) {
			aopUtils.when(() -> AopUtils.isAopProxy((DataSource) null)).thenReturn(false);
			//TODO: Needs initialization with real value
			DataSource dataSource = null;
			//Act Statement(s)
			DataSource result = DataSourceUnwrapper.unwrap(dataSource, Object.class, DataSource.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				aopUtils.verify(() -> AopUtils.isAopProxy((DataSource) null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${67729a49-a55b-3a58-b71b-51b8ad15bc1e}
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
		try (MockedStatic<AopUtils> aopUtils = mockStatic(AopUtils.class)) {
			aopUtils.when(() -> AopUtils.isAopProxy((DataSource) null)).thenReturn(false);
			//TODO: Needs initialization with real value
			DataSource dataSource = null;
			//Act Statement(s)
			DataSource result = DataSourceUnwrapper.unwrap(dataSource, Object.class, DataSource.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				aopUtils.verify(() -> AopUtils.isAopProxy((DataSource) null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${870c79a9-de57-3f44-a5ed-23b69d2f47b9}
	@Test()
	void unwrap1Test() throws Exception {
		//Arrange Statement(s)
		try (MockedStatic<DataSourceUnwrapper> dataSourceUnwrapper = mockStatic(DataSourceUnwrapper.class, CALLS_REAL_METHODS)) {
			Object object = new Object();
			dataSourceUnwrapper.when(() -> DataSourceUnwrapper.unwrap((DataSource) null, Object.class, Object.class)).thenReturn(object);
			//TODO: Needs initialization with real value
			DataSource dataSource = null;
			//Act Statement(s)
			Object result = DataSourceUnwrapper.unwrap(dataSource, Object.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(object));
				dataSourceUnwrapper.verify(() -> DataSourceUnwrapper.unwrap((DataSource) null, Object.class, Object.class), atLeast(1));
			});
		}
	}
}
