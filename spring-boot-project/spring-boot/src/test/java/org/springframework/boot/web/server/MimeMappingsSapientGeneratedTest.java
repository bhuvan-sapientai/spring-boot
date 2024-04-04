package org.springframework.boot.web.server;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import java.util.Collection;

import org.mockito.MockedStatic;

import java.util.Iterator;

import org.springframework.util.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MimeMappingsSapientGeneratedTest {

	private final MimeMappings mimeMappingsMock = mock(MimeMappings.class);

	//Sapient generated method id: ${ce7dfc7c-d15c-36e4-a6fe-06e5d0f607a5}, hash: 1A426809B65F423D7074E89BF820F16B
	@Test()
	void addWhenPreviousIsNull() {
		/* Branches:
		 * (previous != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(mimeMappingsMock, "Mappings must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull("A", "Extension must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull("B", "MimeType must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			MimeMappings target = new MimeMappings(mimeMappingsMock, true);
			//Act Statement(s)
			String result = target.add("A", "B");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.notNull(mimeMappingsMock, "Mappings must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull("A", "Extension must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull("B", "MimeType must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${8a084572-19c1-3657-b661-bddf31c4aa27}, hash: F28A34C924172E9D74F557DAFBA0FB73
	@Test()
	void removeWhenPreviousIsNull() {
		/* Branches:
		 * (previous != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(mimeMappingsMock, "Mappings must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull("A", "Extension must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			MimeMappings target = new MimeMappings(mimeMappingsMock, true);
			//Act Statement(s)
			String result = target.remove("A");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.notNull(mimeMappingsMock, "Mappings must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull("A", "Extension must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${72f7efec-21b6-30b5-b5d4-333f2d737f26}, hash: E2B555C9A61D59A897179F818AD36C0C
	@Test()
	void getWhenMappingIsNull() {
		/* Branches:
		 * (mapping != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(mimeMappingsMock, "Mappings must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull("A", "Extension must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			MimeMappings target = new MimeMappings(mimeMappingsMock, true);
			//Act Statement(s)
			String result = target.get("A");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.notNull(mimeMappingsMock, "Mappings must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull("A", "Extension must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a88321e2-c443-39ad-bf1b-22930f2ed148}, hash: B55B9FA4147E6DF48CD55FA2752D3D7D
	@Test()
	void getAllTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(mimeMappingsMock, "Mappings must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			MimeMappings target = new MimeMappings(mimeMappingsMock, true);
			//Act Statement(s)
			Collection<MimeMappings.Mapping> result = target.getAll();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				_assert.verify(() -> Assert.notNull(mimeMappingsMock, "Mappings must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${78c09fb6-edcf-3ce7-9932-6ef4ffc152b3}, hash: 529BDAFBB30006298432A22A293EFFA5
	@Test()
	void iteratorTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(mimeMappingsMock, "Mappings must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			MimeMappings target = new MimeMappings(mimeMappingsMock, true);
			//Act Statement(s)
			Iterator<MimeMappings.Mapping> result = target.iterator();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(mimeMappingsMock, "Mappings must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${7e30d504-f47c-3103-aed7-a97aa01fddb7}, hash: E9703FF6DB72A79A22E4F76E195F435B
	@Test()
	void unmodifiableMappingsWhenDefaultBranch() {
		/* Branches:
		 * (branch expression (line 85)) : false  #  inside <init> method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		MimeMappings mimeMappings = new MimeMappings();

		//Act Statement(s)
		MimeMappings result = MimeMappings.unmodifiableMappings(mimeMappings);
		MimeMappings mimeMappings2 = new MimeMappings(mimeMappings, false);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(mimeMappings2)));
	}

	//Sapient generated method id: ${d1d51270-6f25-31cb-8e2b-b5b9179f1980}, hash: 0ED02B459426D3F5095C5931F6275C85
	@Test()
	void lazyCopyTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(mimeMappingsMock, "Mappings must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			MimeMappings result = MimeMappings.lazyCopy(mimeMappingsMock);
			MimeMappings.LazyMimeMappingsCopy mimeMappingsLazyMimeMappingsCopy = new MimeMappings.LazyMimeMappingsCopy(mimeMappingsMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(mimeMappingsLazyMimeMappingsCopy));
				_assert.verify(() -> Assert.notNull(mimeMappingsMock, "Mappings must not be null"), atLeast(1));
			});
		}
	}
}
