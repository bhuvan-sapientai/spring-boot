package org.springframework.boot.jdbc;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.aot.hint.ReflectionHints;

import java.util.function.Consumer;

import org.springframework.aot.hint.RuntimeHints;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DataSourceBuilderRuntimeHintsSapientGeneratedTest {

	//Sapient generated method id: ${2ff6a167-954b-3cdf-a62d-163dc1234597}
	@Test()
	void registerHintsWhenTYPE_NAMESIsNotEmpty() {
		/* Branches:
		 * (for-each(TYPE_NAMES)) : true
		 */
		//Arrange Statement(s)
		RuntimeHints hintsMock = mock(RuntimeHints.class);
		ReflectionHints reflectionHintsMock = mock(ReflectionHints.class);
		ReflectionHints reflectionHintsMock2 = mock(ReflectionHints.class);
		doReturn(reflectionHintsMock2).when(reflectionHintsMock).registerTypeIfPresent((ClassLoader) any(), eq("com.mchange.v2.c3p0.ComboPooledDataSource"), (Consumer) any());
		ReflectionHints reflectionHintsMock3 = mock(ReflectionHints.class);
		ReflectionHints reflectionHintsMock4 = mock(ReflectionHints.class);
		doReturn(reflectionHintsMock4).when(reflectionHintsMock3).registerTypeIfPresent((ClassLoader) any(), eq("org.h2.jdbcx.JdbcDataSource"), (Consumer) any());
		ReflectionHints reflectionHintsMock5 = mock(ReflectionHints.class);
		ReflectionHints reflectionHintsMock6 = mock(ReflectionHints.class);
		doReturn(reflectionHintsMock6).when(reflectionHintsMock5).registerTypeIfPresent((ClassLoader) any(), eq("com.zaxxer.hikari.HikariDataSource"), (Consumer) any());
		ReflectionHints reflectionHintsMock7 = mock(ReflectionHints.class);
		ReflectionHints reflectionHintsMock8 = mock(ReflectionHints.class);
		doReturn(reflectionHintsMock8).when(reflectionHintsMock7).registerTypeIfPresent((ClassLoader) any(), eq("org.apache.commons.dbcp2.BasicDataSource"), (Consumer) any());
		ReflectionHints reflectionHintsMock9 = mock(ReflectionHints.class);
		ReflectionHints reflectionHintsMock10 = mock(ReflectionHints.class);
		doReturn(reflectionHintsMock10).when(reflectionHintsMock9).registerTypeIfPresent((ClassLoader) any(), eq("oracle.jdbc.datasource.OracleDataSource"), (Consumer) any());
		ReflectionHints reflectionHintsMock11 = mock(ReflectionHints.class);
		ReflectionHints reflectionHintsMock12 = mock(ReflectionHints.class);
		doReturn(reflectionHintsMock12).when(reflectionHintsMock11).registerTypeIfPresent((ClassLoader) any(), eq("oracle.ucp.jdbc.PoolDataSource"), (Consumer) any());
		ReflectionHints reflectionHintsMock13 = mock(ReflectionHints.class);
		ReflectionHints reflectionHintsMock14 = mock(ReflectionHints.class);
		doReturn(reflectionHintsMock14).when(reflectionHintsMock13).registerTypeIfPresent((ClassLoader) any(), eq("org.postgresql.ds.PGSimpleDataSource"), (Consumer) any());
		ReflectionHints reflectionHintsMock15 = mock(ReflectionHints.class);
		ReflectionHints reflectionHintsMock16 = mock(ReflectionHints.class);
		doReturn(reflectionHintsMock16).when(reflectionHintsMock15).registerTypeIfPresent((ClassLoader) any(), eq("org.springframework.jdbc.datasource.SimpleDriverDataSource"), (Consumer) any());
		ReflectionHints reflectionHintsMock17 = mock(ReflectionHints.class);
		doReturn(reflectionHintsMock, reflectionHintsMock3, reflectionHintsMock5, reflectionHintsMock7, reflectionHintsMock9, reflectionHintsMock11, reflectionHintsMock13, reflectionHintsMock15, reflectionHintsMock17).when(hintsMock).reflection();
		ReflectionHints reflectionHintsMock18 = mock(ReflectionHints.class);
		doReturn(reflectionHintsMock18).when(reflectionHintsMock17).registerTypeIfPresent((ClassLoader) any(), eq("org.apache.tomcat.jdbc.pool.DataSource"), (Consumer) any());
		DataSourceBuilderRuntimeHints target = new DataSourceBuilderRuntimeHints();
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();

		//Act Statement(s)
		target.registerHints(hintsMock, classLoader);

		//Assert statement(s)
		assertAll("result", () -> {
			verify(hintsMock, times(9)).reflection();
			verify(reflectionHintsMock).registerTypeIfPresent((ClassLoader) any(), eq("com.mchange.v2.c3p0.ComboPooledDataSource"), (Consumer) any());
			verify(reflectionHintsMock3).registerTypeIfPresent((ClassLoader) any(), eq("org.h2.jdbcx.JdbcDataSource"), (Consumer) any());
			verify(reflectionHintsMock5).registerTypeIfPresent((ClassLoader) any(), eq("com.zaxxer.hikari.HikariDataSource"), (Consumer) any());
			verify(reflectionHintsMock7).registerTypeIfPresent((ClassLoader) any(), eq("org.apache.commons.dbcp2.BasicDataSource"), (Consumer) any());
			verify(reflectionHintsMock9).registerTypeIfPresent((ClassLoader) any(), eq("oracle.jdbc.datasource.OracleDataSource"), (Consumer) any());
			verify(reflectionHintsMock11).registerTypeIfPresent((ClassLoader) any(), eq("oracle.ucp.jdbc.PoolDataSource"), (Consumer) any());
			verify(reflectionHintsMock13).registerTypeIfPresent((ClassLoader) any(), eq("org.postgresql.ds.PGSimpleDataSource"), (Consumer) any());
			verify(reflectionHintsMock15).registerTypeIfPresent((ClassLoader) any(), eq("org.springframework.jdbc.datasource.SimpleDriverDataSource"), (Consumer) any());
			verify(reflectionHintsMock17).registerTypeIfPresent((ClassLoader) any(), eq("org.apache.tomcat.jdbc.pool.DataSource"), (Consumer) any());
		});
	}
}
