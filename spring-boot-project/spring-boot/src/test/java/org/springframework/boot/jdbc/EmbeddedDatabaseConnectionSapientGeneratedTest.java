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
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class EmbeddedDatabaseConnectionSapientGeneratedTest {

	//Sapient generated method id: ${05e5e6d4-47b4-3d70-be76-f9318a8307ae}
	@Disabled()
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

	//Sapient generated method id: ${40745e95-772e-3b90-91d0-9da2636ab5fc}
	@Disabled()
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

	//Sapient generated method id: ${4d778f07-3ccd-3efa-9868-f63539a690bd}
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

	//Sapient generated method id: ${41e10844-bf8e-374d-99b6-b5bc7ae7c15e}
	@Disabled()
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

	//Sapient generated method id: ${40c45c3a-fec6-3a99-b311-2c7d2c36de8a}
	@Disabled()
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

	//Sapient generated method id: ${34ec8d8d-a654-31eb-8322-63f7b6cdacf1}
	@Disabled()
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

	//Sapient generated method id: ${9d3248f2-5e38-382b-9c4c-294e39e3844f}
	@Disabled()
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

	//Sapient generated method id: ${e90feaad-dc88-34c7-9c1f-6021679637ed}
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

	//Sapient generated method id: ${a27e199b-5d2c-350c-b819-5474c4b96cfc}
	@Disabled()
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

	//Sapient generated method id: ${5dce59ea-53d0-338c-9e6a-f8f356f5cb34}
	@Disabled()
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

	//Sapient generated method id: ${ee44b167-98b2-39fe-ac73-686758eb41c1}
	@Disabled()
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

	//Sapient generated method id: ${a07c5117-adb9-3d28-9b87-d10e0784f196}
	@Disabled()
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

	//Sapient generated method id: ${c1a69c8d-8d46-3ac6-b492-78e6497120d1}
	@Disabled()
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

	//Sapient generated method id: ${090bdb3c-57ba-359f-928b-da1ca0c55ffb}
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

	//Sapient generated method id: ${090eee74-b8f2-3c68-8048-212a949ae8c7}
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

	//Sapient generated method id: ${a91d5018-62ce-30d1-8d68-e74c8339d3b3}
	@Disabled()
	@Test()
	void isEmbeddedUrlWhenSwitchThisCaseHSQLDBAndDefaultBranch() {
		/* Branches:
		 * (switch(this) = HSQLDB) : true
		 * (branch expression (line 121)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		EmbeddedDatabaseConnection target = EmbeddedDatabaseConnection.valueOf("H2");
		//Act Statement(s)
		boolean result = target.isEmbeddedUrl(":hsqldb:mem:");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${7c2d94e9-7a45-33fa-a22b-b1d842536008}
	@Disabled()
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

	//Sapient generated method id: ${295083ec-36fa-3f00-8be1-08a947db1032}
	@Disabled()
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

	//Sapient generated method id: ${fb3edb3e-3d44-3df0-a279-3cbb9f8f30b0}
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

	//Sapient generated method id: ${b10114fe-f525-3a90-b454-3529f6c17a57}
	@Disabled()
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

	//Sapient generated method id: ${120cfc3f-32a6-330d-a698-0235c4c46ded}
	@Disabled()
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

	//Sapient generated method id: ${f864f376-d08d-347e-98aa-73bedcee3512}
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

	//Sapient generated method id: ${bd1a1e4b-d7b7-300a-84f4-ed6a44dda257}
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

	//Sapient generated method id: ${1e28dc58-c609-38fa-8ed4-f5869e4347d8}
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

	//Sapient generated method id: ${a4a3c638-6bb7-325e-8c04-67dddbc6563d}
	@Disabled()
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
		boolean result = EmbeddedDatabaseConnection.isEmbedded("driverClass1", "url1");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${394eed05-9b95-3909-943d-ca11c53c5cb1}
	@Disabled()
	@Test()
	void isEmbedded1WhenNewJdbcTemplateDataSourceExecuteNewIsEmbedded() throws DataAccessException {
		/* Branches:
		 * (new JdbcTemplate(dataSource).execute(new IsEmbedded())) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: org.springframework.jdbc.core.JdbcTemplate
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//TODO: Needs initialization with real value
		DataSource dataSource = null;
		//Act Statement(s)
		boolean result = EmbeddedDatabaseConnection.isEmbedded(dataSource);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${1b53c9bd-dc9f-3e00-94e1-37348b2ffd2f}
	@Disabled()
	@Test()
	void isEmbedded1WhenNewJdbcTemplateDataSourceNotExecuteNewIsEmbedded() throws DataAccessException {
		/* Branches:
		 * (new JdbcTemplate(dataSource).execute(new IsEmbedded())) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: org.springframework.jdbc.core.JdbcTemplate
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//TODO: Needs initialization with real value
		DataSource dataSource = null;
		//Act Statement(s)
		boolean result = EmbeddedDatabaseConnection.isEmbedded(dataSource);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${1beb15a0-1766-3c4d-979d-6c6fb73de385}
	@Disabled()
	@Test()
	void isEmbedded1WhenCaughtDataAccessException() throws DataAccessException {
		/* Branches:
		 * (catch-exception (DataAccessException)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: org.springframework.jdbc.core.JdbcTemplate
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//TODO: Needs initialization with real value
		DataSource dataSource = null;
		//Act Statement(s)
		boolean result = EmbeddedDatabaseConnection.isEmbedded(dataSource);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${f29e5e97-eab3-3127-9367-acd83d369ac4}
	@Disabled()
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

	//Sapient generated method id: ${a8c9e494-a442-35c1-9c25-f52b908b7bb7}
	@Disabled()
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
