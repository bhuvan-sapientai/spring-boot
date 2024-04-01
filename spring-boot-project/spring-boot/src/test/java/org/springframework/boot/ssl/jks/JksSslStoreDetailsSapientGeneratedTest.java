package org.springframework.boot.ssl.jks;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import org.springframework.util.StringUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JksSslStoreDetailsSapientGeneratedTest {

	//Sapient generated method id: ${a1b42fb0-20f6-38c2-b3bb-ef21fcf5e3ea}, hash: 554AB970C6106DF6CC0F5474A3265C89
	@Test()
	void withPasswordTest() {
		//Arrange Statement(s)
		JksSslStoreDetails target = new JksSslStoreDetails("type1", "provider1", "location1", "password1");

		//Act Statement(s)
		JksSslStoreDetails result = target.withPassword("password1");
		JksSslStoreDetails jksSslStoreDetails = new JksSslStoreDetails("type1", "provider1", "location1", "password1");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(jksSslStoreDetails)));
	}

	//Sapient generated method id: ${3451abb4-1504-3e50-9411-d6aab85bed3d}, hash: B0852125067AD78757E23B84E966AFF6
	@Test()
	void isEmptyWhenIsEmptyNotThisType() {
		/* Branches:
		 * (!StringUtils.hasText(value)) : false  #  inside isEmpty method
		 * (isEmpty(this.type)) : false
		 */
		//Arrange Statement(s)
		JksSslStoreDetails target = new JksSslStoreDetails("A", "provider1", "location1", "password1");

		//Act Statement(s)
		boolean result = target.isEmpty();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${a16a9601-9251-3210-8f91-8730ec48f61c}, hash: 20F645CC2BD847D2757045504F405BCB
	@Test()
	void isEmptyWhenIsEmptyNotThisProvider() {
		/* Branches:
		 * (!StringUtils.hasText(value)) : true  #  inside isEmpty method
		 * (isEmpty(this.type)) : true
		 * (isEmpty(this.provider)) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasText("B")).thenReturn(true);
			JksSslStoreDetails target = new JksSslStoreDetails("A", "B", "location1", "password1");
			//Act Statement(s)
			boolean result = target.isEmpty();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasText("B"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${ee5acc58-5a78-3664-82d8-fe2e17f1f807}, hash: 0D195077B3168D4DA16EFE6908ACA159
	@Test()
	void isEmptyWhenIsEmptyThisLocation() {
		/* Branches:
		 * (!StringUtils.hasText(value)) : true  #  inside isEmpty method
		 * (isEmpty(this.type)) : true
		 * (isEmpty(this.provider)) : true
		 * (isEmpty(this.location)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasText("B")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasText("C")).thenReturn(false);
			JksSslStoreDetails target = new JksSslStoreDetails("A", "B", "C", "password1");
			//Act Statement(s)
			boolean result = target.isEmpty();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasText("B"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasText("C"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${31bfc7f6-9c39-3761-b6d4-bcec31816347}, hash: 1D22B88A247CD7360CB7A87674F12FDB
	@Test()
	void isEmptyWhenIsEmptyNotThisLocation() {
		/* Branches:
		 * (!StringUtils.hasText(value)) : true  #  inside isEmpty method
		 * (isEmpty(this.type)) : true
		 * (isEmpty(this.provider)) : true
		 * (isEmpty(this.location)) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasText("B")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasText("C")).thenReturn(true);
			JksSslStoreDetails target = new JksSslStoreDetails("A", "B", "C", "password1");
			//Act Statement(s)
			boolean result = target.isEmpty();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasText("B"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasText("C"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${e4c9979f-672d-3afe-99fb-63c04f9b549d}, hash: DAC196331C594654061A85514C3EB700
	@Test()
	void forLocationTest() {

		//Act Statement(s)
		JksSslStoreDetails result = JksSslStoreDetails.forLocation("location1");
		JksSslStoreDetails jksSslStoreDetails = new JksSslStoreDetails((String) null, (String) null, "location1", (String) null);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(jksSslStoreDetails)));
	}
}
