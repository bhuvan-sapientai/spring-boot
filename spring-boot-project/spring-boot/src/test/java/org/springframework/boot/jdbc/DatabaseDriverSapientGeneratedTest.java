package org.springframework.boot.jdbc;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import org.mockito.stubbing.Answer;

import java.util.Collection;

import org.mockito.MockedStatic;

import java.util.Set;

import org.springframework.util.StringUtils;
import org.springframework.util.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DatabaseDriverSapientGeneratedTest {

	//Sapient generated method id: ${5f7d7b4a-ccfd-3d2d-827b-2227dba0ab6a}
	@Disabled()
	@Test()
	void getIdTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DatabaseDriver target = DatabaseDriver.valueOf("H2");
		//Act Statement(s)
		String result = target.getId();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("g")));
	}

	//Sapient generated method id: ${4be18754-18df-3db5-ac0d-ca6fa11be14c}
	@Disabled()
	@Test()
	void getUrlPrefixesTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DatabaseDriver target = DatabaseDriver.valueOf("H2");
		//Act Statement(s)
		Collection<String> result = target.getUrlPrefixes();
		Set<String> stringResultSet = new HashSet<>(Set.of("g"));
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(stringResultSet.size()));
			assertThat(result, containsInAnyOrder(stringResultSet.toArray()));
		});
	}

	//Sapient generated method id: ${7e9b63e4-4255-3fd1-b6fb-0d79646cb2ec}
	@Test()
	void matchProductNameWhenThisProductNameIsNull() {
		/* Branches:
		 * (this.productName != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DatabaseDriver target = DatabaseDriver.valueOf("H2");
		//Act Statement(s)
		boolean result = target.matchProductName("productName1");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${35b24395-b5e6-33d1-9607-e479e3ee5828}
	@Test()
	void fromJdbcUrlWhenUrlWithoutPrefixStartsWithPrefix() {
		/* Branches:
		 * (StringUtils.hasLength(url)) : true
		 * (for-each(values())) : true
		 * (for-each(driver.getUrlPrefixes())) : true
		 * (driver != UNKNOWN) : true
		 * (urlWithoutPrefix.startsWith(prefix)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.isTrue(false, "URL must start with 'jdbc'")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			DatabaseDriver result = DatabaseDriver.fromJdbcUrl("url1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(DatabaseDriver.UNKNOWN));
				_assert.verify(() -> Assert.isTrue(false, "URL must start with 'jdbc'"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${885e79a5-9a0b-3e11-8d9b-693efae39e86}
	@Test()
	void fromJdbcUrlWhenUrlWithoutPrefixNotStartsWithPrefix() {
		/* Branches:
		 * (StringUtils.hasLength(url)) : true
		 * (for-each(values())) : true
		 * (for-each(driver.getUrlPrefixes())) : true
		 * (driver != UNKNOWN) : true
		 * (urlWithoutPrefix.startsWith(prefix)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.isTrue(false, "URL must start with 'jdbc'")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			DatabaseDriver result = DatabaseDriver.fromJdbcUrl("ABCDE");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(DatabaseDriver.UNKNOWN));
				_assert.verify(() -> Assert.isTrue(false, "URL must start with 'jdbc'"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${e7ab2038-d8c6-33ad-9a17-4eb471bf5976}
	@Test()
	void fromProductNameWhenCandidateMatchProductNameProductName() {
		/* Branches:
		 * (StringUtils.hasLength(productName)) : true
		 * (for-each(values())) : true
		 * (candidate.matchProductName(productName)) : true
		 */
		//Act Statement(s)
		DatabaseDriver result = DatabaseDriver.fromProductName("productName1");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(DatabaseDriver.UNKNOWN)));
	}

	//Sapient generated method id: ${ff364210-883f-3331-9b18-996ffc27e2f4}
	@Test()
	void fromProductNameWhenCandidateNotMatchProductNameProductName() {
		/* Branches:
		 * (StringUtils.hasLength(productName)) : true
		 * (for-each(values())) : true
		 * (candidate.matchProductName(productName)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Act Statement(s)
		DatabaseDriver result = DatabaseDriver.fromProductName("productName1");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(DatabaseDriver.UNKNOWN)));
	}
}
