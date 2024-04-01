package org.springframework.boot.jdbc.metadata;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import org.mockito.MockedStatic;

import org.springframework.util.StringUtils;

import oracle.ucp.jdbc.PoolDataSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class OracleUcpDataSourcePoolMetadataSapientGeneratedTest {

	private final PoolDataSource poolDataSourceMock = mock(PoolDataSource.class);

	//Sapient generated method id: ${1de19ac5-975a-386f-a67b-458ca94bff53}, hash: C3B509EB35CC0A22455AD521FD24DC21
	@Test()
	void getActiveTest() throws SQLException {
		//Arrange Statement(s)
		doReturn(1).when(poolDataSourceMock).getBorrowedConnectionsCount();
		OracleUcpDataSourcePoolMetadata target = new OracleUcpDataSourcePoolMetadata(poolDataSourceMock);

		//Act Statement(s)
		Integer result = target.getActive();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(1));
			verify(poolDataSourceMock).getBorrowedConnectionsCount();
		});
	}

	//Sapient generated method id: ${f6b7a488-a172-3802-be9a-bd94dc993093}, hash: BC37283536324D8B82575452A39D1D0A
	@Test()
	void getActiveWhenCaughtSQLException() throws SQLException {
		/* Branches:
		 * (catch-exception (SQLException)) : true
		 */
		//Arrange Statement(s)
		SQLException sQLException = new SQLException();
		doThrow(sQLException).when(poolDataSourceMock).getBorrowedConnectionsCount();
		OracleUcpDataSourcePoolMetadata target = new OracleUcpDataSourcePoolMetadata(poolDataSourceMock);

		//Act Statement(s)
		Integer result = target.getActive();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(nullValue()));
			verify(poolDataSourceMock).getBorrowedConnectionsCount();
		});
	}

	//Sapient generated method id: ${c70c8cc8-bc00-34c8-90a3-517037077d97}, hash: 79FDA2DFD5E2B1C98EC8CAE7DD4F4E73
	@Test()
	void getIdleTest() throws SQLException {
		//Arrange Statement(s)
		doReturn(1).when(poolDataSourceMock).getAvailableConnectionsCount();
		OracleUcpDataSourcePoolMetadata target = new OracleUcpDataSourcePoolMetadata(poolDataSourceMock);

		//Act Statement(s)
		Integer result = target.getIdle();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(1));
			verify(poolDataSourceMock).getAvailableConnectionsCount();
		});
	}

	//Sapient generated method id: ${6bec3366-3f33-385f-8e96-a4a946e1f0af}, hash: 6D7C648177DD92E832DFE0C3D32235F2
	@Test()
	void getIdleWhenCaughtSQLException() throws SQLException {
		/* Branches:
		 * (catch-exception (SQLException)) : true
		 */
		//Arrange Statement(s)
		SQLException sQLException = new SQLException();
		doThrow(sQLException).when(poolDataSourceMock).getAvailableConnectionsCount();
		OracleUcpDataSourcePoolMetadata target = new OracleUcpDataSourcePoolMetadata(poolDataSourceMock);

		//Act Statement(s)
		Integer result = target.getIdle();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(nullValue()));
			verify(poolDataSourceMock).getAvailableConnectionsCount();
		});
	}

	//Sapient generated method id: ${1639243d-cf6c-3762-90b6-34d54892d05e}, hash: FC5270D8366256397CA507DFF31688AC
	@Test()
	void getMaxTest() {
		//Arrange Statement(s)
		doReturn(1).when(poolDataSourceMock).getMaxPoolSize();
		OracleUcpDataSourcePoolMetadata target = new OracleUcpDataSourcePoolMetadata(poolDataSourceMock);

		//Act Statement(s)
		Integer result = target.getMax();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(1));
			verify(poolDataSourceMock).getMaxPoolSize();
		});
	}

	//Sapient generated method id: ${38d383ae-8089-3cd7-9d6c-0cb2fa4f8412}, hash: E4619A27DB0F2489726FE83CA09C9593
	@Test()
	void getMinTest() {
		//Arrange Statement(s)
		doReturn(1).when(poolDataSourceMock).getMinPoolSize();
		OracleUcpDataSourcePoolMetadata target = new OracleUcpDataSourcePoolMetadata(poolDataSourceMock);

		//Act Statement(s)
		Integer result = target.getMin();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(1));
			verify(poolDataSourceMock).getMinPoolSize();
		});
	}

	//Sapient generated method id: ${ecfcdcbf-bc30-301b-bcc7-588fbbd550ba}, hash: 30DAA864837898637067BDF5AB5A5C6F
	@Test()
	void getValidationQueryTest() {
		//Arrange Statement(s)
		doReturn("return_of_getSQLForValidateConnection1").when(poolDataSourceMock).getSQLForValidateConnection();
		OracleUcpDataSourcePoolMetadata target = new OracleUcpDataSourcePoolMetadata(poolDataSourceMock);

		//Act Statement(s)
		String result = target.getValidationQuery();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("return_of_getSQLForValidateConnection1"));
			verify(poolDataSourceMock).getSQLForValidateConnection();
		});
	}

	//Sapient generated method id: ${112c06d6-94f5-3a2b-99ff-d1f3e70a9195}, hash: 71CE5CD75A28A95D8B9B93A879E4D82D
	@Test()
	void getDefaultAutoCommitWhenStringUtilsHasTextAutoCommit() {
		/* Branches:
		 * (StringUtils.hasText(autoCommit)) : true
		 */
		//Arrange Statement(s)
		doReturn("A").when(poolDataSourceMock).getConnectionProperty("autoCommit");
		OracleUcpDataSourcePoolMetadata target = new OracleUcpDataSourcePoolMetadata(poolDataSourceMock);

		//Act Statement(s)
		Boolean result = target.getDefaultAutoCommit();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(poolDataSourceMock).getConnectionProperty("autoCommit");
		});
	}

	//Sapient generated method id: ${519c8419-26b5-338b-a1e1-a08b3e517545}, hash: 627FB9C014EA744CB9F702CEA52A79BF
	@Test()
	void getDefaultAutoCommitWhenStringUtilsNotHasTextAutoCommit() {
		/* Branches:
		 * (StringUtils.hasText(autoCommit)) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			doReturn("A").when(poolDataSourceMock).getConnectionProperty("autoCommit");
			stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
			OracleUcpDataSourcePoolMetadata target = new OracleUcpDataSourcePoolMetadata(poolDataSourceMock);
			//Act Statement(s)
			Boolean result = target.getDefaultAutoCommit();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(poolDataSourceMock).getConnectionProperty("autoCommit");
				stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
			});
		}
	}
}
