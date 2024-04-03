package org.springframework.boot.ansi;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

import org.springframework.util.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class Ansi8BitColorSapientGeneratedTest {

	//Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: FB11FF9DCE8573DD2A52F16A2EE9F844
	@Test()
	void toStringTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.isTrue(true, "Code must be between 0 and 255")).thenAnswer((Answer<Void>) invocation -> null);
			Ansi8BitColor target = Ansi8BitColor.foreground(2);
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("38;5;2"));
				_assert.verify(() -> Assert.isTrue(true, "Code must be between 0 and 255"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${69933645-8dd8-313a-a50c-a114360eff48}, hash: 3BCE355386E3F4749AF7F18110D029B3
	@Test()
	void foregroundWhenDefaultBranch() {
		/* Branches:
		 * (branch expression (line 43)) : false  #  inside <init> method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.isTrue(true, "Code must be between 0 and 255")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			Ansi8BitColor result = Ansi8BitColor.foreground(0);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.isTrue(true, "Code must be between 0 and 255"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${fe4c9e13-392e-35f2-b96e-05e93ee537b7}, hash: F5AADAB79F7BCCA9B359C1578EB1408D
	@Test()
	void foregroundWhenDefaultBranch2() {
		/* Branches:
		 * (branch expression (line 43)) : false  #  inside <init> method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.isTrue(false, "Code must be between 0 and 255")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			Ansi8BitColor result = Ansi8BitColor.foreground(256);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.isTrue(false, "Code must be between 0 and 255"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${93ea162c-5229-34ca-a4b4-cbfdbbecbf88}, hash: 98806E71E2E9B8D07A3C3222502D88E6
	@Test()
	void backgroundWhenDefaultBranch() {
		/* Branches:
		 * (branch expression (line 43)) : false  #  inside <init> method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.isTrue(true, "Code must be between 0 and 255")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			Ansi8BitColor result = Ansi8BitColor.background(0);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.isTrue(true, "Code must be between 0 and 255"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${88d25ed3-54f6-3bd2-8e3a-aa29ec1f72c5}, hash: 72D84D3C5A7363F351ADB7A9212F723C
	@Test()
	void backgroundWhenDefaultBranch2() {
		/* Branches:
		 * (branch expression (line 43)) : false  #  inside <init> method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.isTrue(false, "Code must be between 0 and 255")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			Ansi8BitColor result = Ansi8BitColor.background(256);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.isTrue(false, "Code must be between 0 and 255"), atLeast(1));
			});
		}
	}
}
