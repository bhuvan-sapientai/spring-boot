package org.springframework.boot.jdbc;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import org.junit.jupiter.api.Disabled;
import org.mockito.stubbing.Answer;
import com.zaxxer.hikari.HikariConfigMXBean;

import java.util.concurrent.ThreadPoolExecutor;

import com.zaxxer.hikari.pool.HikariPool;

import java.lang.reflect.Field;

import org.springframework.core.log.LogMessage;

import com.zaxxer.hikari.HikariDataSource;

import org.springframework.util.Assert;

import com.zaxxer.hikari.HikariPoolMXBean;

import java.time.Duration;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

import org.mockito.MockedStatic;

import javax.sql.DataSource;

import org.springframework.util.ReflectionUtils;

import java.util.concurrent.BlockingQueue;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class HikariCheckpointRestoreLifecycleSapientGeneratedTest {

	private final HikariDataSource dataSourceMock = mock(HikariDataSource.class, "dataSource");

	private final HikariPoolMXBean hikariPoolMXBeanMock = mock(HikariPoolMXBean.class);

	private final HikariPoolMXBean hikariPoolMXBeanMock2 = mock(HikariPoolMXBean.class);

	private final HikariPool hikariPoolMock = mock(HikariPool.class);

	private final HikariPool hikariPoolMock2 = mock(HikariPool.class);

	//Sapient generated method id: ${37213126-06dc-3f40-b12e-0644ed34845b}
	@Test()
	void startWhenThisDataSourceIsRunning() {
		/* Branches:
		 * (this.dataSource == null) : false
		 * (this.dataSource.isRunning()) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<DataSourceUnwrapper> dataSourceUnwrapper = mockStatic(DataSourceUnwrapper.class)) {
			dataSourceUnwrapper.when(() -> DataSourceUnwrapper.unwrap((DataSource) null, HikariConfigMXBean.class, HikariDataSource.class)).thenReturn(dataSourceMock);
			HikariCheckpointRestoreLifecycle target = new HikariCheckpointRestoreLifecycle((DataSource) null);
			doReturn(true).when(dataSourceMock).isRunning();
			//Act Statement(s)
			target.start();
			//Assert statement(s)
			assertAll("result", () -> {
				dataSourceUnwrapper.verify(() -> DataSourceUnwrapper.unwrap((DataSource) null, HikariConfigMXBean.class, HikariDataSource.class), atLeast(1));
				verify(dataSourceMock).isRunning();
			});
		}
	}

	//Sapient generated method id: ${d7571d8d-8c46-3576-9785-d93317492357}
	@Test()
	void startWhenThisDataSourceIsAllowPoolSuspension() {
		/* Branches:
		 * (this.dataSource == null) : false
		 * (this.dataSource.isRunning()) : false
		 * (!this.dataSource.isClosed()) : true
		 * (this.dataSource.isAllowPoolSuspension()) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<DataSourceUnwrapper> dataSourceUnwrapper = mockStatic(DataSourceUnwrapper.class)) {
			dataSourceUnwrapper.when(() -> DataSourceUnwrapper.unwrap((DataSource) null, HikariConfigMXBean.class, HikariDataSource.class)).thenReturn(dataSourceMock);
			HikariCheckpointRestoreLifecycle target = new HikariCheckpointRestoreLifecycle((DataSource) null);
			doReturn(false).when(dataSourceMock).isRunning();
			doReturn(false).when(dataSourceMock).isClosed();
			doReturn(true).when(dataSourceMock).isAllowPoolSuspension();
			doReturn(hikariPoolMXBeanMock).when(dataSourceMock).getHikariPoolMXBean();
			doNothing().when(hikariPoolMXBeanMock).resumePool();
			//Act Statement(s)
			target.start();
			//Assert statement(s)
			assertAll("result", () -> {
				dataSourceUnwrapper.verify(() -> DataSourceUnwrapper.unwrap((DataSource) null, HikariConfigMXBean.class, HikariDataSource.class), atLeast(1));
				verify(dataSourceMock).isRunning();
				verify(dataSourceMock).isClosed();
				verify(dataSourceMock).isAllowPoolSuspension();
				verify(dataSourceMock).getHikariPoolMXBean();
				verify(hikariPoolMXBeanMock).resumePool();
			});
		}
	}

	//Sapient generated method id: ${92056abd-17ad-3646-ac3d-e0cc134a2568}
	@Test()
	void startWhenThisDataSourceIsClosedAndThisDataSourceIsAllowPoolSuspension() {
		/* Branches:
		 * (this.dataSource == null) : false
		 * (this.dataSource.isRunning()) : false
		 * (!this.dataSource.isClosed()) : false
		 * (this.dataSource.isAllowPoolSuspension()) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<DataSourceUnwrapper> dataSourceUnwrapper = mockStatic(DataSourceUnwrapper.class)) {
			dataSourceUnwrapper.when(() -> DataSourceUnwrapper.unwrap((DataSource) null, HikariConfigMXBean.class, HikariDataSource.class)).thenReturn(dataSourceMock);
			_assert.when(() -> Assert.state(false, "DataSource has been closed and cannot be restarted")).thenAnswer((Answer<Void>) invocation -> null);
			HikariCheckpointRestoreLifecycle target = new HikariCheckpointRestoreLifecycle((DataSource) null);
			doReturn(false).when(dataSourceMock).isRunning();
			doReturn(true).when(dataSourceMock).isClosed();
			doReturn(true).when(dataSourceMock).isAllowPoolSuspension();
			doReturn(hikariPoolMXBeanMock).when(dataSourceMock).getHikariPoolMXBean();
			doNothing().when(hikariPoolMXBeanMock).resumePool();
			//Act Statement(s)
			target.start();
			//Assert statement(s)
			assertAll("result", () -> {
				dataSourceUnwrapper.verify(() -> DataSourceUnwrapper.unwrap((DataSource) null, HikariConfigMXBean.class, HikariDataSource.class), atLeast(1));
				_assert.verify(() -> Assert.state(false, "DataSource has been closed and cannot be restarted"), atLeast(1));
				verify(dataSourceMock).isRunning();
				verify(dataSourceMock).isClosed();
				verify(dataSourceMock).isAllowPoolSuspension();
				verify(dataSourceMock).getHikariPoolMXBean();
				verify(hikariPoolMXBeanMock).resumePool();
			});
		}
	}

	//Sapient generated method id: ${c8a23576-7657-3251-a1d9-e52fc679ec27}
	@Test()
	void stopWhenThisDataSourceNotIsRunning() throws ExecutionException, InterruptedException, TimeoutException {
		/* Branches:
		 * (this.dataSource == null) : false
		 * (!this.dataSource.isRunning()) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<DataSourceUnwrapper> dataSourceUnwrapper = mockStatic(DataSourceUnwrapper.class)) {
			dataSourceUnwrapper.when(() -> DataSourceUnwrapper.unwrap((DataSource) null, HikariConfigMXBean.class, HikariDataSource.class)).thenReturn(dataSourceMock);
			HikariCheckpointRestoreLifecycle target = new HikariCheckpointRestoreLifecycle((DataSource) null);
			doReturn(false).when(dataSourceMock).isRunning();
			//Act Statement(s)
			target.stop();
			//Assert statement(s)
			assertAll("result", () -> {
				dataSourceUnwrapper.verify(() -> DataSourceUnwrapper.unwrap((DataSource) null, HikariConfigMXBean.class, HikariDataSource.class), atLeast(1));
				verify(dataSourceMock).isRunning();
			});
		}
	}

	//Sapient generated method id: ${07d9c272-c45e-36fa-9970-7d0a39a6e18d}
	@Disabled(value = "Potential harmful system call (CompletableFuture.get) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void stopWhenDefaultBranch() throws ExecutionException, InterruptedException, TimeoutException {
		/* Branches:
		 * (this.dataSource == null) : false
		 * (!this.dataSource.isRunning()) : false
		 * (this.dataSource.isAllowPoolSuspension()) : true
		 * (this.hasOpenConnections.apply((HikariPool) this.dataSource.getHikariPoolMXBean())) : true  #  inside waitForConnectionsToClose method
		 * (branch expression (line 87)) : false  #  inside lambda$new$0 method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		HikariPool hikariPoolMock3 = mock(HikariPool.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class);
			 MockedStatic<DataSourceUnwrapper> dataSourceUnwrapper = mockStatic(DataSourceUnwrapper.class)) {
			dataSourceUnwrapper.when(() -> DataSourceUnwrapper.unwrap((DataSource) null, HikariConfigMXBean.class, HikariDataSource.class)).thenReturn(dataSourceMock);
			BlockingQueue blockingQueue = new LinkedBlockingQueue<>();
			ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 0, 0L, TimeUnit.NANOSECONDS, blockingQueue);
			reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq(hikariPoolMock))).thenReturn(threadPoolExecutor);
			_assert.when(() -> Assert.notNull(threadPoolExecutor, "CloseConnectionExecutor was null")).thenAnswer((Answer<Void>) invocation -> null);
			BlockingQueue blockingQueue2 = new LinkedBlockingQueue<>();
			ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 0, 0L, TimeUnit.NANOSECONDS, blockingQueue2);
			reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq(hikariPoolMock2))).thenReturn(threadPoolExecutor2);
			_assert.when(() -> Assert.notNull(threadPoolExecutor2, "CloseConnectionExecutor was null")).thenAnswer((Answer<Void>) invocation -> null);
			HikariCheckpointRestoreLifecycle target = new HikariCheckpointRestoreLifecycle((DataSource) null);
			doReturn(true).when(dataSourceMock).isRunning();
			doReturn(true).when(dataSourceMock).isAllowPoolSuspension();
			doNothing().when(hikariPoolMXBeanMock).suspendPool();
			doReturn(-1L).when(dataSourceMock).getConnectionTimeout();
			doNothing().when(hikariPoolMXBeanMock2).softEvictConnections();
			doReturn(hikariPoolMXBeanMock, hikariPoolMXBeanMock2, hikariPoolMock, hikariPoolMock2, hikariPoolMock3).when(dataSourceMock).getHikariPoolMXBean();
			//Act Statement(s)
			target.stop();
			//Assert statement(s)
			assertAll("result", () -> {
				dataSourceUnwrapper.verify(() -> DataSourceUnwrapper.unwrap((DataSource) null, HikariConfigMXBean.class, HikariDataSource.class), atLeast(1));
				reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq(hikariPoolMock)));
				_assert.verify(() -> Assert.notNull(threadPoolExecutor, "CloseConnectionExecutor was null"), atLeast(1));
				reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq(hikariPoolMock2)));
				_assert.verify(() -> Assert.notNull(threadPoolExecutor2, "CloseConnectionExecutor was null"), atLeast(1));
				verify(dataSourceMock).isRunning();
				verify(dataSourceMock).isAllowPoolSuspension();
				verify(dataSourceMock, times(5)).getHikariPoolMXBean();
				verify(hikariPoolMXBeanMock).suspendPool();
				verify(dataSourceMock).getConnectionTimeout();
				verify(hikariPoolMXBeanMock2).softEvictConnections();
			});
		}
	}

	//Sapient generated method id: ${d7e6acad-12b3-3cd6-affe-c0736755d93c}
	@Disabled(value = "Potential harmful system call (Thread.interrupt, CompletableFuture.get) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void stopWhenCaughtInterruptedException() throws InterruptedException, ExecutionException, TimeoutException {
		/* Branches:
		 * (this.dataSource == null) : false
		 * (!this.dataSource.isRunning()) : false
		 * (this.dataSource.isAllowPoolSuspension()) : true
		 * (this.hasOpenConnections.apply((HikariPool) this.dataSource.getHikariPoolMXBean())) : false  #  inside waitForConnectionsToClose method
		 * (catch-exception (InterruptedException)) : true  #  inside closeConnections method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<DataSourceUnwrapper> dataSourceUnwrapper = mockStatic(DataSourceUnwrapper.class)) {
			dataSourceUnwrapper.when(() -> DataSourceUnwrapper.unwrap((DataSource) null, HikariConfigMXBean.class, HikariDataSource.class)).thenReturn(dataSourceMock);
			HikariCheckpointRestoreLifecycle target = new HikariCheckpointRestoreLifecycle((DataSource) null);
			doReturn(true).when(dataSourceMock).isRunning();
			doReturn(true).when(dataSourceMock).isAllowPoolSuspension();
			doNothing().when(hikariPoolMXBeanMock).suspendPool();
			doReturn(-249L).when(dataSourceMock).getConnectionTimeout();
			doNothing().when(hikariPoolMXBeanMock2).softEvictConnections();
			doReturn(hikariPoolMXBeanMock, hikariPoolMXBeanMock2, hikariPoolMock).when(dataSourceMock).getHikariPoolMXBean();
			//Act Statement(s)
			target.stop();
			//Assert statement(s)
			assertAll("result", () -> {
				dataSourceUnwrapper.verify(() -> DataSourceUnwrapper.unwrap((DataSource) null, HikariConfigMXBean.class, HikariDataSource.class), atLeast(1));
				verify(dataSourceMock).isRunning();
				verify(dataSourceMock).isAllowPoolSuspension();
				verify(dataSourceMock, times(3)).getHikariPoolMXBean();
				verify(hikariPoolMXBeanMock).suspendPool();
				verify(dataSourceMock).getConnectionTimeout();
				verify(hikariPoolMXBeanMock2).softEvictConnections();
			});
		}
	}

	//Sapient generated method id: ${fa569c14-59f7-3a28-85b3-d8ee261f180a}
	@Disabled(value = "Potential harmful system call (CompletableFuture.get) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void stopWhenCaughtExecutionExceptionThrowsRuntimeException() throws InterruptedException, ExecutionException, TimeoutException {
		/* Branches:
		 * (this.dataSource == null) : false
		 * (!this.dataSource.isRunning()) : false
		 * (this.dataSource.isAllowPoolSuspension()) : true
		 * (this.hasOpenConnections.apply((HikariPool) this.dataSource.getHikariPoolMXBean())) : false  #  inside waitForConnectionsToClose method
		 * (catch-exception (ExecutionException)) : true  #  inside closeConnections method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<DataSourceUnwrapper> dataSourceUnwrapper = mockStatic(DataSourceUnwrapper.class)) {
			dataSourceUnwrapper.when(() -> DataSourceUnwrapper.unwrap((DataSource) null, HikariConfigMXBean.class, HikariDataSource.class)).thenReturn(dataSourceMock);
			HikariCheckpointRestoreLifecycle target = new HikariCheckpointRestoreLifecycle((DataSource) null);
			doReturn(true).when(dataSourceMock).isRunning();
			doReturn(true).when(dataSourceMock).isAllowPoolSuspension();
			doNothing().when(hikariPoolMXBeanMock).suspendPool();
			doReturn(-249L).when(dataSourceMock).getConnectionTimeout();
			doNothing().when(hikariPoolMXBeanMock2).softEvictConnections();
			doReturn(hikariPoolMXBeanMock, hikariPoolMXBeanMock2, hikariPoolMock).when(dataSourceMock).getHikariPoolMXBean();
			//Act Statement(s)
			final RuntimeException result = assertThrows(RuntimeException.class, () -> {
				target.stop();
			});
			Throwable throwable = new Throwable();
			ExecutionException executionException = new ExecutionException(throwable);
			RuntimeException runtimeException = new RuntimeException("Failed to close Hikari connections", executionException);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(runtimeException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(executionException.getClass())));
				dataSourceUnwrapper.verify(() -> DataSourceUnwrapper.unwrap((DataSource) null, HikariConfigMXBean.class, HikariDataSource.class), atLeast(1));
				verify(dataSourceMock).isRunning();
				verify(dataSourceMock).isAllowPoolSuspension();
				verify(dataSourceMock, times(3)).getHikariPoolMXBean();
				verify(hikariPoolMXBeanMock).suspendPool();
				verify(dataSourceMock).getConnectionTimeout();
				verify(hikariPoolMXBeanMock2).softEvictConnections();
			});
		}
	}

	//Sapient generated method id: ${93a92715-7151-3cd1-9ed3-12b103e46747}
	@Disabled()
	@Test()
	void stopWhenCaughtTimeoutException() throws InterruptedException, ExecutionException, TimeoutException {
		/* Branches:
		 * (this.dataSource == null) : false
		 * (!this.dataSource.isRunning()) : false
		 * (this.dataSource.isAllowPoolSuspension()) : false
		 * (this.hasOpenConnections.apply((HikariPool) this.dataSource.getHikariPoolMXBean())) : false  #  inside waitForConnectionsToClose method
		 * (catch-exception (TimeoutException)) : true  #  inside closeConnections method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		HikariPool hikariPoolMock = mock(HikariPool.class, "HikariPoolMXBean");
		LogMessage logMessageMock = mock(LogMessage.class, "LogMessage");
		try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class);
			 MockedStatic<DataSourceUnwrapper> dataSourceUnwrapper = mockStatic(DataSourceUnwrapper.class)) {
			dataSourceUnwrapper.when(() -> DataSourceUnwrapper.unwrap((DataSource) null, HikariConfigMXBean.class, HikariDataSource.class)).thenReturn(dataSourceMock);
			BlockingQueue blockingQueue = new LinkedBlockingQueue<>();
			ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 0, 0L, TimeUnit.NANOSECONDS, blockingQueue);
			reflectionUtils.when(() -> ReflectionUtils.getField((Field) any(), eq(hikariPoolMock))).thenReturn(threadPoolExecutor);
			_assert.when(() -> Assert.notNull(threadPoolExecutor, "CloseConnectionExecutor was null")).thenAnswer((Answer<Void>) invocation -> null);
			logMessage.when(() -> LogMessage.format(eq("Hikari connections could not be closed within %s"), (Duration) any())).thenReturn(logMessageMock);
			HikariCheckpointRestoreLifecycle target = new HikariCheckpointRestoreLifecycle((DataSource) null);
			doReturn(true).when(dataSourceMock).isRunning();
			doReturn(false).when(dataSourceMock).isAllowPoolSuspension();
			doReturn(1000L).when(dataSourceMock).getConnectionTimeout();
			doNothing().when(hikariPoolMXBeanMock).softEvictConnections();
			doReturn(hikariPoolMXBeanMock, hikariPoolMock, hikariPoolMock2).when(dataSourceMock).getHikariPoolMXBean();
			//Act Statement(s)
			target.stop();
			//Assert statement(s)
			assertAll("result", () -> {
				dataSourceUnwrapper.verify(() -> DataSourceUnwrapper.unwrap((DataSource) null, HikariConfigMXBean.class, HikariDataSource.class), atLeast(1));
				reflectionUtils.verify(() -> ReflectionUtils.getField((Field) any(), eq(hikariPoolMock)));
				_assert.verify(() -> Assert.notNull(threadPoolExecutor, "CloseConnectionExecutor was null"), atLeast(1));
				logMessage.verify(() -> LogMessage.format(eq("Hikari connections could not be closed within %s"), (Duration) any()));
				verify(dataSourceMock).isRunning();
				verify(dataSourceMock).isAllowPoolSuspension();
				verify(dataSourceMock).getConnectionTimeout();
				verify(dataSourceMock, times(3)).getHikariPoolMXBean();
				verify(hikariPoolMXBeanMock).softEvictConnections();
			});
		}
	}

	//Sapient generated method id: ${898fe229-dc2f-3761-8a64-30da1db5cd3a}
	@Test()
	void isRunningWhenThisDataSourceIsRunning() {
		/* Branches:
		 * (this.dataSource != null) : true
		 * (this.dataSource.isRunning()) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<DataSourceUnwrapper> dataSourceUnwrapper = mockStatic(DataSourceUnwrapper.class)) {
			dataSourceUnwrapper.when(() -> DataSourceUnwrapper.unwrap((DataSource) null, HikariConfigMXBean.class, HikariDataSource.class)).thenReturn(dataSourceMock);
			HikariCheckpointRestoreLifecycle target = new HikariCheckpointRestoreLifecycle((DataSource) null);
			doReturn(true).when(dataSourceMock).isRunning();
			//Act Statement(s)
			boolean result = target.isRunning();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				dataSourceUnwrapper.verify(() -> DataSourceUnwrapper.unwrap((DataSource) null, HikariConfigMXBean.class, HikariDataSource.class), atLeast(1));
				verify(dataSourceMock).isRunning();
			});
		}
	}

	//Sapient generated method id: ${5b0c6262-4688-38f3-b5c8-0593a6356b64}
	@Test()
	void isRunningWhenThisDataSourceNotIsRunning() {
		/* Branches:
		 * (this.dataSource != null) : true
		 * (this.dataSource.isRunning()) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<DataSourceUnwrapper> dataSourceUnwrapper = mockStatic(DataSourceUnwrapper.class)) {
			dataSourceUnwrapper.when(() -> DataSourceUnwrapper.unwrap((DataSource) null, HikariConfigMXBean.class, HikariDataSource.class)).thenReturn(dataSourceMock);
			HikariCheckpointRestoreLifecycle target = new HikariCheckpointRestoreLifecycle((DataSource) null);
			doReturn(false).when(dataSourceMock).isRunning();
			//Act Statement(s)
			boolean result = target.isRunning();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				dataSourceUnwrapper.verify(() -> DataSourceUnwrapper.unwrap((DataSource) null, HikariConfigMXBean.class, HikariDataSource.class), atLeast(1));
				verify(dataSourceMock).isRunning();
			});
		}
	}
}
