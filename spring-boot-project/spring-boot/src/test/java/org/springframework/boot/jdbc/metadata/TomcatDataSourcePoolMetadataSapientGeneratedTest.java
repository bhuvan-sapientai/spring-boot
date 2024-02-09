package org.springframework.boot.jdbc.metadata;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.tomcat.jdbc.pool.ConnectionPool;
import org.apache.tomcat.jdbc.pool.DataSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class TomcatDataSourcePoolMetadataSapientGeneratedTest {

	private final DataSource dataSourceMock = mock(DataSource.class);

	//Sapient generated method id: ${c4920af0-3a14-3998-8cfb-5852b3ea6bf3}
	@Test()
	void getActiveWhenPoolIsNotNull() {
		/* Branches:
		 * (pool != null) : true
		 */
		//Arrange Statement(s)
		ConnectionPool connectionPoolMock = mock(ConnectionPool.class);
		doReturn(connectionPoolMock).when(dataSourceMock).getPool();
		doReturn(1).when(connectionPoolMock).getActive();
		TomcatDataSourcePoolMetadata target = new TomcatDataSourcePoolMetadata(dataSourceMock);

		//Act Statement(s)
		Integer result = target.getActive();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(1));
			verify(dataSourceMock).getPool();
			verify(connectionPoolMock).getActive();
		});
	}

	//Sapient generated method id: ${c75b2668-a093-325a-8ad9-aa7b2da2bddf}
	@Test()
	void getActiveWhenPoolIsNull() {
		/* Branches:
		 * (pool != null) : false
		 */
		//Arrange Statement(s)
		doReturn(null).when(dataSourceMock).getPool();
		TomcatDataSourcePoolMetadata target = new TomcatDataSourcePoolMetadata(dataSourceMock);

		//Act Statement(s)
		Integer result = target.getActive();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(0));
			verify(dataSourceMock).getPool();
		});
	}

	//Sapient generated method id: ${c70c8cc8-bc00-34c8-90a3-517037077d97}
	@Test()
	void getIdleTest() {
		//Arrange Statement(s)
		doReturn(1).when(dataSourceMock).getNumIdle();
		TomcatDataSourcePoolMetadata target = new TomcatDataSourcePoolMetadata(dataSourceMock);

		//Act Statement(s)
		Integer result = target.getIdle();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(1));
			verify(dataSourceMock).getNumIdle();
		});
	}

	//Sapient generated method id: ${1639243d-cf6c-3762-90b6-34d54892d05e}
	@Test()
	void getMaxTest() {
		//Arrange Statement(s)
		doReturn(1).when(dataSourceMock).getMaxActive();
		TomcatDataSourcePoolMetadata target = new TomcatDataSourcePoolMetadata(dataSourceMock);

		//Act Statement(s)
		Integer result = target.getMax();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(1));
			verify(dataSourceMock).getMaxActive();
		});
	}

	//Sapient generated method id: ${38d383ae-8089-3cd7-9d6c-0cb2fa4f8412}
	@Test()
	void getMinTest() {
		//Arrange Statement(s)
		doReturn(1).when(dataSourceMock).getMinIdle();
		TomcatDataSourcePoolMetadata target = new TomcatDataSourcePoolMetadata(dataSourceMock);

		//Act Statement(s)
		Integer result = target.getMin();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(1));
			verify(dataSourceMock).getMinIdle();
		});
	}

	//Sapient generated method id: ${ecfcdcbf-bc30-301b-bcc7-588fbbd550ba}
	@Test()
	void getValidationQueryTest() {
		//Arrange Statement(s)
		doReturn("return_of_getValidationQuery1").when(dataSourceMock).getValidationQuery();
		TomcatDataSourcePoolMetadata target = new TomcatDataSourcePoolMetadata(dataSourceMock);

		//Act Statement(s)
		String result = target.getValidationQuery();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("return_of_getValidationQuery1"));
			verify(dataSourceMock).getValidationQuery();
		});
	}

	//Sapient generated method id: ${a1328507-633f-3dbd-bbaa-c33a09487d46}
	@Test()
	void getDefaultAutoCommitTest() {
		//Arrange Statement(s)
		doReturn(false).when(dataSourceMock).isDefaultAutoCommit();
		TomcatDataSourcePoolMetadata target = new TomcatDataSourcePoolMetadata(dataSourceMock);

		//Act Statement(s)
		Boolean result = target.getDefaultAutoCommit();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(dataSourceMock).isDefaultAutoCommit();
		});
	}
}
