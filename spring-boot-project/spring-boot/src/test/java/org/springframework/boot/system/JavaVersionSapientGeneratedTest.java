package org.springframework.boot.system;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JavaVersionSapientGeneratedTest {

	//Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: EEB32E1A665DB31C547EF81D74994461
	@Disabled()
	@Test()
	void toStringTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		JavaVersion target = JavaVersion.valueOf("TWENTY");
		//Act Statement(s)
		String result = target.toString();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${a6657e51-2f42-3609-9eda-7910859f0fba}, hash: 9DCF7323D38156761863ADA01CC4B847
	@Test()
	void getJavaVersionWhenCandidateAvailable() {
		/* Branches:
		 * (for-each(candidates)) : true
		 * (candidate.available) : true
		 */
		//Act Statement(s)
		JavaVersion result = JavaVersion.getJavaVersion();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(JavaVersion.SEVENTEEN)));
	}

	//Sapient generated method id: ${f0064fce-b796-35e4-ae57-cdbae2f4dc9f}, hash: 1CF39C23EA12E91191FAB61E308A1CB9
	@Test()
	void isEqualOrNewerThanWhenCompareToVersionGreaterThanOrEqualsTo0() {
		/* Branches:
		 * (compareTo(version) >= 0) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		JavaVersion target = JavaVersion.valueOf("EIGHTEEN");
		//Act Statement(s)
		boolean result = target.isEqualOrNewerThan(JavaVersion.SEVENTEEN);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${2a72385e-00c4-3027-8f76-5c70d0692c24}, hash: 8FF54871471E07EAD2A1B7B687EED3C3
	@Disabled()
	@Test()
	void isEqualOrNewerThanWhenCompareToVersionLessThan0() {
		/* Branches:
		 * (compareTo(version) >= 0) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		JavaVersion target = JavaVersion.valueOf("TWENTY");
		//Act Statement(s)
		boolean result = target.isEqualOrNewerThan(JavaVersion.SEVENTEEN);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${b20162b3-09ae-3999-80b6-41632f2198e2}, hash: 103EFD0E6D13826AAAB23DEC36E065BD
	@Disabled()
	@Test()
	void isOlderThanWhenCompareToVersionLessThan0() {
		/* Branches:
		 * (compareTo(version) < 0) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		JavaVersion target = JavaVersion.valueOf("TWENTY");
		//Act Statement(s)
		boolean result = target.isOlderThan(JavaVersion.SEVENTEEN);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${02cd52f6-c85d-30fd-b5ed-6b1accae0623}, hash: 85724E4BA50B252C1C268BE907237299
	@Test()
	void isOlderThanWhenCompareToVersionNotLessThan0() {
		/* Branches:
		 * (compareTo(version) < 0) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		JavaVersion target = JavaVersion.valueOf("EIGHTEEN");
		//Act Statement(s)
		boolean result = target.isOlderThan(JavaVersion.SEVENTEEN);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}
}
