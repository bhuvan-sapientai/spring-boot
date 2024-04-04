package org.springframework.boot.jdbc;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.dao.DataAccessException;

import org.mockito.stubbing.Answer;

import org.springframework.util.ClassUtils;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import org.mockito.MockedStatic;

import javax.sql.DataSource;

import org.springframework.util.Assert;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class EmbeddedDatabaseConnectionSapientGeneratedTest {

	private final DataSource dataSourceMock = mock(DataSource.class);

	//Sapient generated method id: ${05e5e6d4-47b4-3d70-be76-f9318a8307ae}, hash: DBDF73948CA30BB20A73AC9519A71CC2
	@Test()
	void getDriverClassNameWhenDefaultBranchThrowsIncompatibleClassChangeError() {
		/* Branches:
		 * (branch expression (line 87)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");
		//Act Statement(s)
		final IncompatibleClassChangeError result = assertThrows(IncompatibleClassChangeError.class, () -> {
			target.getDriverClassName();
		});

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${40745e95-772e-3b90-91d0-9da2636ab5fc}, hash: E014C7E5D1C71C5DDA66164E0503E7C5
	@Test()
	void getDriverClassNameWhenSwitchThisCaseDERBY() {
		/* Branches:
		 * (switch(this) = DERBY) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");

		//Act Statement(s)
		String result = target.getDriverClassName();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("org.apache.derby.jdbc.EmbeddedDriver")));
	}

	//Sapient generated method id: ${4d778f07-3ccd-3efa-9868-f63539a690bd}, hash: 94D1DB3E80585BC96CD533514AE61964
	@Test()
	void getDriverClassNameWhenSwitchThisCaseH2() {
		/* Branches:
		 * (switch(this) = H2) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");

		//Act Statement(s)
		String result = target.getDriverClassName();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("org.h2.Driver")));
	}

	//Sapient generated method id: ${41e10844-bf8e-374d-99b6-b5bc7ae7c15e}, hash: 394451BDC6E6B311619841A9711D3785
	@Test()
	void getDriverClassNameWhenSwitchThisCaseHSQLDB() {
		/* Branches:
		 * (switch(this) = HSQLDB) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");

		//Act Statement(s)
		String result = target.getDriverClassName();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("org.hsqldb.jdbc.JDBCDriver")));
	}

	//Sapient generated method id: ${40c45c3a-fec6-3a99-b311-2c7d2c36de8a}, hash: 315D93FB80744CE4004800934A812A34
	@Test()
	void getDriverClassNameWhenSwitchThisCaseNONE() {
		/* Branches:
		 * (switch(this) = NONE) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");

		//Act Statement(s)
		String result = target.getDriverClassName();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${34ec8d8d-a654-31eb-8322-63f7b6cdacf1}, hash: FA21F67EE36F51A8EAA69A6104ECD3D3
	@Test()
	void getTypeWhenDefaultBranchThrowsIncompatibleClassChangeError() {
		/* Branches:
		 * (branch expression (line 101)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");
		//Act Statement(s)
		final IncompatibleClassChangeError result = assertThrows(IncompatibleClassChangeError.class, () -> {
			target.getType();
		});

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${9d3248f2-5e38-382b-9c4c-294e39e3844f}, hash: 06F02A0C0622A3136ADF4D936C6971F6
	@Test()
	void getTypeWhenSwitchThisCaseDERBY() {
		/* Branches:
		 * (switch(this) = DERBY) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");

		//Act Statement(s)
		EmbeddedDatabaseType result = target.getType();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(EmbeddedDatabaseType.DERBY)));
	}

	//Sapient generated method id: ${e90feaad-dc88-34c7-9c1f-6021679637ed}, hash: F1A129A227BECAD4B2BF38B949801E43
	@Test()
	void getTypeWhenSwitchThisCaseH2() {
		/* Branches:
		 * (switch(this) = H2) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");

		//Act Statement(s)
		EmbeddedDatabaseType result = target.getType();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(EmbeddedDatabaseType.H2)));
	}

	//Sapient generated method id: ${a27e199b-5d2c-350c-b819-5474c4b96cfc}, hash: 6F5AFB1B7AF7AB14807C31F5BC2787DC
	@Test()
	void getTypeWhenSwitchThisCaseHSQLDB() {
		/* Branches:
		 * (switch(this) = HSQLDB) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");

		//Act Statement(s)
		EmbeddedDatabaseType result = target.getType();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(EmbeddedDatabaseType.HSQL)));
	}

	//Sapient generated method id: ${5dce59ea-53d0-338c-9e6a-f8f356f5cb34}, hash: 944E40B876AAC0FA04DF942AE80F3770
	@Test()
	void getTypeWhenSwitchThisCaseNONE() {
		/* Branches:
		 * (switch(this) = NONE) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");

		//Act Statement(s)
		EmbeddedDatabaseType result = target.getType();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${ee44b167-98b2-39fe-ac73-686758eb41c1}, hash: ACF748AB6B43A5E69E301D25AA26432C
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
			_assert.when(() -> Assert.hasText("I", "DatabaseName must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
			EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");
			//Act Statement(s)
			String result = target.getUrl("I");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.hasText("I", "DatabaseName must not be empty"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a07c5117-adb9-3d28-9b87-d10e0784f196}, hash: 8A48FA036163F45BCF9FFB64C6D04BC8
	@Test()
	void isEmbeddedUrlWhenDefaultBranchThrowsIncompatibleClassChangeError() {
		/* Branches:
		 * (branch expression (line 121)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");
		//Act Statement(s)
		final IncompatibleClassChangeError result = assertThrows(IncompatibleClassChangeError.class, () -> {
			target.isEmbeddedUrl("url1");
		});

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${c1a69c8d-8d46-3ac6-b492-78e6497120d1}, hash: 947953119BF9DB41E69ADC5680F8E144
	@Test()
	void isEmbeddedUrlWhenSwitchThisCaseDERBY() {
		/* Branches:
		 * (switch(this) = DERBY) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");

		//Act Statement(s)
		boolean result = target.isEmbeddedUrl("url1");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${090bdb3c-57ba-359f-928b-da1ca0c55ffb}, hash: 19B9E2FF5CECEBC88FFF433419963496
	@Test()
	void isEmbeddedUrlWhenSwitchThisCaseNONE() {
		/* Branches:
		 * (switch(this) = NONE) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");

		//Act Statement(s)
		boolean result = target.isEmbeddedUrl("url1");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${090eee74-b8f2-3c68-8048-212a949ae8c7}, hash: 8D4E9AD345B1EA4661B3AFD130C7F3ED
	@Test()
	void isEmbeddedUrlWhenDefaultBranch() {
		/* Branches:
		 * (switch(this) = H2) : true
		 * (branch expression (line 121)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");

		//Act Statement(s)
		boolean result = target.isEmbeddedUrl(":h2:mem");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${7813816b-a5c9-3b23-bc19-59d2f757b1c2}, hash: 0E53436115952C6B46B1ABBCC4BA7810
	@Test()
	void isEmbeddedUrlWhenSwitchThisCaseHSQLDBAndDefaultBranch2() {
		/* Branches:
		 * (switch(this) = HSQLDB) : true
		 * (branch expression (line 121)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");

		//Act Statement(s)
		boolean result = target.isEmbeddedUrl("JK");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${7c2d94e9-7a45-33fa-a22b-b1d842536008}, hash: F1D0B61A9244006E78607E5EA5C2C9D9
	@Test()
	void isDriverCompatibleWhenDefaultBranchThrowsIncompatibleClassChangeError() {
		/* Branches:
		 * (driverClass != null) : true
		 * (branch expression (line 87)) : true  #  inside getDriverClassName method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");
		//Act Statement(s)
		final IncompatibleClassChangeError result = assertThrows(IncompatibleClassChangeError.class, () -> {
			target.isDriverCompatible("driverClass1");
		});

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${295083ec-36fa-3f00-8be1-08a947db1032}, hash: F8C5E9FAEB9592027A47C8A1AE0BE857
	@Test()
	void isDriverCompatibleWhenDriverClassEqualsGetDriverClassName() {
		/* Branches:
		 * (driverClass != null) : true
		 * (switch(this) = DERBY) : true  #  inside getDriverClassName method
		 * (driverClass.equals(getDriverClassName())) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");

		//Act Statement(s)
		boolean result = target.isDriverCompatible("org.apache.derby.jdbc.EmbeddedDriver");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${fb3edb3e-3d44-3df0-a279-3cbb9f8f30b0}, hash: 54AD4631C13AA10D5E049C8E04E6E2FA
	@Test()
	void isDriverCompatibleWhenSwitchThisCaseH2AndDriverClassEqualsGetDriverClassName() {
		/* Branches:
		 * (driverClass != null) : true
		 * (switch(this) = H2) : true  #  inside getDriverClassName method
		 * (driverClass.equals(getDriverClassName())) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");

		//Act Statement(s)
		boolean result = target.isDriverCompatible("org.h2.Driver");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${b10114fe-f525-3a90-b454-3529f6c17a57}, hash: A3D23F901DAE1EC319551ABB09A7244C
	@Test()
	void isDriverCompatibleWhenSwitchThisCaseHSQLDBAndDriverClassEqualsGetDriverClassName() {
		/* Branches:
		 * (driverClass != null) : true
		 * (switch(this) = HSQLDB) : true  #  inside getDriverClassName method
		 * (driverClass.equals(getDriverClassName())) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");

		//Act Statement(s)
		boolean result = target.isDriverCompatible("org.hsqldb.jdbc.JDBCDriver");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${120cfc3f-32a6-330d-a698-0235c4c46ded}, hash: AFCA7E0EA47CF776187FE3DF40F25DD8
	@Test()
	void isDriverCompatibleWhenDriverClassEqualsThisAlternativeDriverClass() {
		/* Branches:
		 * (driverClass != null) : true
		 * (switch(this) = NONE) : true  #  inside getDriverClassName method
		 * (driverClass.equals(getDriverClassName())) : false
		 * (driverClass.equals(this.alternativeDriverClass)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("name1");

		//Act Statement(s)
		boolean result = target.isDriverCompatible("driverClass1");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${f864f376-d08d-347e-98aa-73bedcee3512}, hash: 00E4FDD5B38357F5781F97C4B4F5CC3E
	@Test()
	void isDriverCompatibleWhenDriverClassNotEqualsThisAlternativeDriverClass() {
		/* Branches:
		 * (driverClass != null) : true
		 * (switch(this) = NONE) : true  #  inside getDriverClassName method
		 * (driverClass.equals(getDriverClassName())) : false
		 * (driverClass.equals(this.alternativeDriverClass)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");

		//Act Statement(s)
		boolean result = target.isDriverCompatible("I");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${bd1a1e4b-d7b7-300a-84f4-ed6a44dda257}, hash: 7CC4EB7AA78F44A6DAE98939FEB7F9E7
	@Test()
	void isEmbeddedWhenDriverClassIsNull() {
		/* Branches:
		 * (driverClass == null) : true
		 */

		//Act Statement(s)
		boolean result = EmbeddedDatabaseConnection.isEmbedded((String) null, "url1");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${1e28dc58-c609-38fa-8ed4-f5869e4347d8}, hash: 55D0805446C10F40DA282263BD217A5F
	@Test()
	void isEmbeddedWhenConnectionEqualsNONE() {
		/* Branches:
		 * (driverClass == null) : false
		 * (branch expression (line 155)) : false
		 * (connection == NONE) : true
		 */

		//Act Statement(s)
		boolean result = EmbeddedDatabaseConnection.isEmbedded("driverClass1", "url1");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${a4a3c638-6bb7-325e-8c04-67dddbc6563d}, hash: BD59002C4EEF8FDDFE6D5A21E1A02818
	@Test()
	void isEmbeddedWhenConnectionIsEmbeddedUrlUrl() {
		/* Branches:
		 * (driverClass == null) : false
		 * (branch expression (line 155)) : true
		 * (connection == NONE) : false
		 * (url == null) : false
		 * (connection.isEmbeddedUrl(url)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */

		//Act Statement(s)
		boolean result = EmbeddedDatabaseConnection.isEmbedded("", "");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${394eed05-9b95-3909-943d-ca11c53c5cb1}, hash: C831C4DA4786B5C6E5936EF537B9EB06
	@Test()
	void isEmbedded1WhenNewJdbcTemplateDataSourceExecuteNewIsEmbedded() throws DataAccessException {
		/* Branches:
		 * (new JdbcTemplate(dataSource).execute(new IsEmbedded())) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type JdbcTemplate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */

		//Act Statement(s)
		boolean result = EmbeddedDatabaseConnection.isEmbedded(dataSourceMock);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${1b53c9bd-dc9f-3e00-94e1-37348b2ffd2f}, hash: 5B5BB8F8881070CB63631EECA481BEF1
	@Test()
	void isEmbedded1WhenNewJdbcTemplateDataSourceNotExecuteNewIsEmbedded() throws DataAccessException {
		/* Branches:
		 * (new JdbcTemplate(dataSource).execute(new IsEmbedded())) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type JdbcTemplate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */

		//Act Statement(s)
		boolean result = EmbeddedDatabaseConnection.isEmbedded(dataSourceMock);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${1beb15a0-1766-3c4d-979d-6c6fb73de385}, hash: 6CED125F61B0582F5CB93CF395FC7715
	@Test()
	void isEmbedded1WhenCaughtDataAccessException() throws DataAccessException {
		/* Branches:
		 * (catch-exception (DataAccessException)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type JdbcTemplate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */

		//Act Statement(s)
		boolean result = EmbeddedDatabaseConnection.isEmbedded(dataSourceMock);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${f29e5e97-eab3-3127-9367-acd83d369ac4}, hash: 93C0664BF0C85BFE0F634B68C1FEA663
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

	//Sapient generated method id: ${a8c9e494-a442-35c1-9c25-f52b908b7bb7}, hash: 8EB9759B07BAF712463FD5EFE14258CB
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
			classUtils.when(() -> ClassUtils.isPresent(eq("org.h2.Driver"), (ClassLoader) any())).thenReturn(false);
			classUtils.when(() -> ClassUtils.isPresent(eq("org.apache.derby.jdbc.EmbeddedDriver"), (ClassLoader) any())).thenReturn(false);
			classUtils.when(() -> ClassUtils.isPresent(eq("org.hsqldb.jdbc.JDBCDriver"), (ClassLoader) any())).thenReturn(false);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			//Act Statement(s)
			EmbeddedDatabaseConnection result = EmbeddedDatabaseConnection.get(classLoader);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(EmbeddedDatabaseConnection.NONE));
				classUtils.verify(() -> ClassUtils.isPresent(eq((String) null), (ClassLoader) any()));
				classUtils.verify(() -> ClassUtils.isPresent(eq("org.h2.Driver"), (ClassLoader) any()));
				classUtils.verify(() -> ClassUtils.isPresent(eq("org.apache.derby.jdbc.EmbeddedDriver"), (ClassLoader) any()));
				classUtils.verify(() -> ClassUtils.isPresent(eq("org.hsqldb.jdbc.JDBCDriver"), (ClassLoader) any()));
			});
		}
	}
}
