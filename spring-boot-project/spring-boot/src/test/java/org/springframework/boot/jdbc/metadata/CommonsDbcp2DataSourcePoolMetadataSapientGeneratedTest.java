package org.springframework.boot.jdbc.metadata;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.commons.dbcp2.BasicDataSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CommonsDbcp2DataSourcePoolMetadataSapientGeneratedTest {

	//Sapient generated method id: ${1de19ac5-975a-386f-a67b-458ca94bff53}, hash: 749AA04E4B82C3D430E65F70D5B2B12D
	@Disabled()
	@Test()
	void getActiveTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		BasicDataSource basicDataSource = new BasicDataSource();
		CommonsDbcp2DataSourcePoolMetadata target = spy(new CommonsDbcp2DataSourcePoolMetadata(basicDataSource));
		BasicDataSource basicDataSource2 = new BasicDataSource();
		doReturn(basicDataSource2).when(target).getDataSource();
		//Act Statement(s)
		Integer result = target.getActive();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(1));
			verify(target).getDataSource();
		});
	}

	//Sapient generated method id: ${c70c8cc8-bc00-34c8-90a3-517037077d97}, hash: DE1E027A7815E61293017C9B21852316
	@Disabled()
	@Test()
	void getIdleTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		BasicDataSource basicDataSource = new BasicDataSource();
		CommonsDbcp2DataSourcePoolMetadata target = spy(new CommonsDbcp2DataSourcePoolMetadata(basicDataSource));
		BasicDataSource basicDataSource2 = new BasicDataSource();
		doReturn(basicDataSource2).when(target).getDataSource();
		//Act Statement(s)
		Integer result = target.getIdle();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(1));
			verify(target).getDataSource();
		});
	}

	//Sapient generated method id: ${1639243d-cf6c-3762-90b6-34d54892d05e}, hash: 8ED37CE6ACC06C91CECAF546C3552A0E
	@Test()
	void getMaxTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		BasicDataSource basicDataSource = new BasicDataSource();
		CommonsDbcp2DataSourcePoolMetadata target = spy(new CommonsDbcp2DataSourcePoolMetadata(basicDataSource));
		BasicDataSource basicDataSource2 = new BasicDataSource();
		basicDataSource2.setMaxTotal(1);
		doReturn(basicDataSource2).when(target).getDataSource();
		//Act Statement(s)
		Integer result = target.getMax();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(1));
			verify(target).getDataSource();
		});
	}

	//Sapient generated method id: ${38d383ae-8089-3cd7-9d6c-0cb2fa4f8412}, hash: 286619DD275F1018690FA2370471AF9D
	@Test()
	void getMinTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		BasicDataSource basicDataSource = new BasicDataSource();
		CommonsDbcp2DataSourcePoolMetadata target = spy(new CommonsDbcp2DataSourcePoolMetadata(basicDataSource));
		BasicDataSource basicDataSource2 = new BasicDataSource();
		basicDataSource2.setMinIdle(1);
		doReturn(basicDataSource2).when(target).getDataSource();
		//Act Statement(s)
		Integer result = target.getMin();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(1));
			verify(target).getDataSource();
		});
	}

	//Sapient generated method id: ${ecfcdcbf-bc30-301b-bcc7-588fbbd550ba}, hash: CD38694815CA43C7DEE89F8B677A1376
	@Test()
	void getValidationQueryTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setPassword("password");
		basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		CommonsDbcp2DataSourcePoolMetadata target = spy(new CommonsDbcp2DataSourcePoolMetadata(basicDataSource));
		BasicDataSource basicDataSource2 = new BasicDataSource();
		basicDataSource2.setValidationQuery("validationQuery1");
		doReturn(basicDataSource2).when(target).getDataSource();
		//Act Statement(s)
		String result = target.getValidationQuery();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("validationQuery1"));
			verify(target).getDataSource();
		});
	}

	//Sapient generated method id: ${a1328507-633f-3dbd-bbaa-c33a09487d46}, hash: 8958CB567A248C8F5519CF2D7C665D76
	@Test()
	void getDefaultAutoCommitTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		BasicDataSource basicDataSource = new BasicDataSource();
		CommonsDbcp2DataSourcePoolMetadata target = spy(new CommonsDbcp2DataSourcePoolMetadata(basicDataSource));
		BasicDataSource basicDataSource2 = new BasicDataSource();
		basicDataSource2.setDefaultAutoCommit(false);
		doReturn(basicDataSource2).when(target).getDataSource();
		//Act Statement(s)
		Boolean result = target.getDefaultAutoCommit();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(target).getDataSource();
		});
	}
}
