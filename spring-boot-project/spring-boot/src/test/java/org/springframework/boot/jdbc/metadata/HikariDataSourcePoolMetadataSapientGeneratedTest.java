package org.springframework.boot.jdbc.metadata;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import com.zaxxer.hikari.HikariDataSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class HikariDataSourcePoolMetadataSapientGeneratedTest {

	private final HikariDataSource hikariDataSourceMock = mock(HikariDataSource.class);

	//Sapient generated method id: ${1de19ac5-975a-386f-a67b-458ca94bff53}
	@Disabled()
	@Test()
	void getActiveTest() throws Exception {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		HikariDataSourcePoolMetadata target = new HikariDataSourcePoolMetadata(hikariDataSourceMock);
		//Act Statement(s)
		Integer result = target.getActive();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(1)));
	}

	//Sapient generated method id: ${fe8712e1-446f-361c-a9ce-4fe704660b7d}
	@Test()
	void getActiveWhenCaughtException() throws Exception {
		/* Branches:
		 * (catch-exception (Exception)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		HikariDataSourcePoolMetadata target = new HikariDataSourcePoolMetadata(hikariDataSourceMock);
		//Act Statement(s)
		Integer result = target.getActive();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${c70c8cc8-bc00-34c8-90a3-517037077d97}
	@Disabled()
	@Test()
	void getIdleTest() throws Exception {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		HikariDataSourcePoolMetadata target = new HikariDataSourcePoolMetadata(hikariDataSourceMock);
		//Act Statement(s)
		Integer result = target.getIdle();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(1)));
	}

	//Sapient generated method id: ${f2de0a54-1493-351e-98e1-cc68218d5eb7}
	@Test()
	void getIdleWhenCaughtException() throws Exception {
		/* Branches:
		 * (catch-exception (Exception)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		HikariDataSourcePoolMetadata target = new HikariDataSourcePoolMetadata(hikariDataSourceMock);
		//Act Statement(s)
		Integer result = target.getIdle();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${1639243d-cf6c-3762-90b6-34d54892d05e}
	@Test()
	void getMaxTest() {
		//Arrange Statement(s)
		doReturn(1).when(hikariDataSourceMock).getMaximumPoolSize();
		HikariDataSourcePoolMetadata target = new HikariDataSourcePoolMetadata(hikariDataSourceMock);
		//Act Statement(s)
		Integer result = target.getMax();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(1));
			verify(hikariDataSourceMock).getMaximumPoolSize();
		});
	}

	//Sapient generated method id: ${38d383ae-8089-3cd7-9d6c-0cb2fa4f8412}
	@Test()
	void getMinTest() {
		//Arrange Statement(s)
		doReturn(1).when(hikariDataSourceMock).getMinimumIdle();
		HikariDataSourcePoolMetadata target = new HikariDataSourcePoolMetadata(hikariDataSourceMock);
		//Act Statement(s)
		Integer result = target.getMin();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(1));
			verify(hikariDataSourceMock).getMinimumIdle();
		});
	}

	//Sapient generated method id: ${ecfcdcbf-bc30-301b-bcc7-588fbbd550ba}
	@Test()
	void getValidationQueryTest() {
		//Arrange Statement(s)
		HikariDataSource hikariDataSource = new HikariDataSource();
		hikariDataSource.setConnectionTestQuery("connectionTestQuery1");
		HikariDataSourcePoolMetadata target = new HikariDataSourcePoolMetadata(hikariDataSource);
		//Act Statement(s)
		String result = target.getValidationQuery();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("connectionTestQuery1")));
	}

	//Sapient generated method id: ${a1328507-633f-3dbd-bbaa-c33a09487d46}
	@Test()
	void getDefaultAutoCommitTest() {
		//Arrange Statement(s)
		doReturn(false).when(hikariDataSourceMock).isAutoCommit();
		HikariDataSourcePoolMetadata target = new HikariDataSourcePoolMetadata(hikariDataSourceMock);
		//Act Statement(s)
		Boolean result = target.getDefaultAutoCommit();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(hikariDataSourceMock).isAutoCommit();
		});
	}
}
