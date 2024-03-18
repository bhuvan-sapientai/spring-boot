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

	//Sapient generated method id: ${1de19ac5-975a-386f-a67b-458ca94bff53}, hash: 0C4CADF03F267CE56E083A8E8641A333
	@Disabled()
	@Test()
	void getActiveTest() throws Exception {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type HikariPool
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		HikariDataSourcePoolMetadata target = new HikariDataSourcePoolMetadata(hikariDataSourceMock);
		//Act Statement(s)
		Integer result = target.getActive();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(1)));
	}

	//Sapient generated method id: ${fe8712e1-446f-361c-a9ce-4fe704660b7d}, hash: 76B890C10690F5F2817900A51B249D17
	@Test()
	void getActiveWhenCaughtException() throws Exception {
		/* Branches:
		 * (catch-exception (Exception)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type HikariPool
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		HikariDataSourcePoolMetadata target = new HikariDataSourcePoolMetadata(hikariDataSourceMock);
		//Act Statement(s)
		Integer result = target.getActive();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${c70c8cc8-bc00-34c8-90a3-517037077d97}, hash: 6BEDB6F92A6AB5FA02894D6027DE73B4
	@Disabled()
	@Test()
	void getIdleTest() throws Exception {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type HikariPool
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		HikariDataSourcePoolMetadata target = new HikariDataSourcePoolMetadata(hikariDataSourceMock);
		//Act Statement(s)
		Integer result = target.getIdle();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(1)));
	}

	//Sapient generated method id: ${f2de0a54-1493-351e-98e1-cc68218d5eb7}, hash: 86A87E765E17A9BFDC7AEBD69B8AF14F
	@Test()
	void getIdleWhenCaughtException() throws Exception {
		/* Branches:
		 * (catch-exception (Exception)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type HikariPool
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		HikariDataSourcePoolMetadata target = new HikariDataSourcePoolMetadata(hikariDataSourceMock);
		//Act Statement(s)
		Integer result = target.getIdle();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${1639243d-cf6c-3762-90b6-34d54892d05e}, hash: 0617647B4A1CC1EA3887C4D5FBCA078F
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

	//Sapient generated method id: ${38d383ae-8089-3cd7-9d6c-0cb2fa4f8412}, hash: 16C53A5C020A38A242AFC4C52F274375
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

	//Sapient generated method id: ${ecfcdcbf-bc30-301b-bcc7-588fbbd550ba}, hash: 6AE9A98D9070DBDB289738C127639225
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

	//Sapient generated method id: ${a1328507-633f-3dbd-bbaa-c33a09487d46}, hash: 2BC8FE202A4FDE3DFCA55A7CE9EF3C4D
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
