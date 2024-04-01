package org.springframework.boot.ssl.pem;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import org.springframework.util.StringUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PemSslStoreDetailsSapientGeneratedTest {

	//Sapient generated method id: ${05f8914c-1f68-3088-af40-5cedff5df8d7}, hash: EC77964ED31DEF6B9488AC3CF860BC25
	@Test()
	void certificateTest() {
		//Arrange Statement(s)
		PemSslStoreDetails target = new PemSslStoreDetails("type1", "alias1", "password1", "certificates1", "privateKey1", "privateKeyPassword1");

		//Act Statement(s)
		String result = target.certificate();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("certificates1")));
	}

	//Sapient generated method id: ${1b6aa1b0-1535-3a15-89c2-7da4256e3e80}, hash: 9823EAE82A71F6484049D661D9184A48
	@Test()
	void withAliasTest() {
		//Arrange Statement(s)
		PemSslStoreDetails target = new PemSslStoreDetails("type1", "alias1", "password1", "certificates1", "privateKey1", "privateKeyPassword1");

		//Act Statement(s)
		PemSslStoreDetails result = target.withAlias("alias1");
		PemSslStoreDetails pemSslStoreDetails = new PemSslStoreDetails("type1", "alias1", "password1", "certificates1", "privateKey1", "privateKeyPassword1");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(pemSslStoreDetails)));
	}

	//Sapient generated method id: ${a1b42fb0-20f6-38c2-b3bb-ef21fcf5e3ea}, hash: E7726A4183AA5B383F4A595FE651DC32
	@Test()
	void withPasswordTest() {
		//Arrange Statement(s)
		PemSslStoreDetails target = new PemSslStoreDetails("type1", "alias1", "password1", "certificates1", "privateKey1", "privateKeyPassword1");

		//Act Statement(s)
		PemSslStoreDetails result = target.withPassword("password1");
		PemSslStoreDetails pemSslStoreDetails = new PemSslStoreDetails("type1", "alias1", "password1", "certificates1", "privateKey1", "privateKeyPassword1");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(pemSslStoreDetails)));
	}

	//Sapient generated method id: ${993af478-da10-3ab2-873b-310d3d305985}, hash: D36560CE89367CF1162FD721FC9C8ABB
	@Test()
	void withPrivateKeyTest() {
		//Arrange Statement(s)
		PemSslStoreDetails target = new PemSslStoreDetails("type1", "alias1", "password1", "certificates1", "privateKey1", "privateKeyPassword1");

		//Act Statement(s)
		PemSslStoreDetails result = target.withPrivateKey("privateKey1");
		PemSslStoreDetails pemSslStoreDetails = new PemSslStoreDetails("type1", "alias1", "password1", "certificates1", "privateKey1", "privateKeyPassword1");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(pemSslStoreDetails)));
	}

	//Sapient generated method id: ${afecec42-6a84-39cb-83f8-ce07d37c9f34}, hash: C3A67C97D0E77A732CC066A58D3B4836
	@Test()
	void withPrivateKeyPasswordTest() {
		//Arrange Statement(s)
		PemSslStoreDetails target = new PemSslStoreDetails("type1", "alias1", "password1", "certificates1", "privateKey1", "privateKeyPassword1");

		//Act Statement(s)
		PemSslStoreDetails result = target.withPrivateKeyPassword("privateKeyPassword1");
		PemSslStoreDetails pemSslStoreDetails = new PemSslStoreDetails("type1", "alias1", "password1", "certificates1", "privateKey1", "privateKeyPassword1");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(pemSslStoreDetails)));
	}

	//Sapient generated method id: ${3451abb4-1504-3e50-9411-d6aab85bed3d}, hash: 2F4684DBBB439BE37931121020690F2D
	@Test()
	void isEmptyWhenIsEmptyNotThisType() {
		/* Branches:
		 * (!StringUtils.hasText(value)) : false  #  inside isEmpty method
		 * (isEmpty(this.type)) : false
		 */
		//Arrange Statement(s)
		PemSslStoreDetails target = new PemSslStoreDetails("A", "alias1", "password1", "certificates1", "privateKey1", "privateKeyPassword1");

		//Act Statement(s)
		boolean result = target.isEmpty();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${e47e7c83-03b4-368f-82b6-80485cf2d442}, hash: 0040B7418A70E560582AB5D1C9EC7ABA
	@Test()
	void isEmptyWhenIsEmptyNotThisCertificates() {
		/* Branches:
		 * (!StringUtils.hasText(value)) : true  #  inside isEmpty method
		 * (isEmpty(this.type)) : true
		 * (isEmpty(this.certificates)) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasText("B")).thenReturn(true);
			PemSslStoreDetails target = new PemSslStoreDetails("A", "alias1", "password1", "B", "privateKey1", "privateKeyPassword1");
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

	//Sapient generated method id: ${9de35f74-57ca-33bf-bb60-fab94365288b}, hash: 255D1F6964F1289B08D0D9C2BAFA42CB
	@Test()
	void isEmptyWhenIsEmptyThisPrivateKey() {
		/* Branches:
		 * (!StringUtils.hasText(value)) : true  #  inside isEmpty method
		 * (isEmpty(this.type)) : true
		 * (isEmpty(this.certificates)) : true
		 * (isEmpty(this.privateKey)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasText("B")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasText("C")).thenReturn(false);
			PemSslStoreDetails target = new PemSslStoreDetails("A", "alias1", "password1", "B", "C", "privateKeyPassword1");
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

	//Sapient generated method id: ${8511cddb-5b3a-3afa-833d-3af818dbd0ad}, hash: 23CF5339B73AEDFD0D82D4C3041EBA71
	@Test()
	void isEmptyWhenIsEmptyNotThisPrivateKey() {
		/* Branches:
		 * (!StringUtils.hasText(value)) : true  #  inside isEmpty method
		 * (isEmpty(this.type)) : true
		 * (isEmpty(this.certificates)) : true
		 * (isEmpty(this.privateKey)) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasText("B")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasText("C")).thenReturn(true);
			PemSslStoreDetails target = new PemSslStoreDetails("A", "alias1", "password1", "B", "C", "privateKeyPassword1");
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

	//Sapient generated method id: ${24773ca6-e1b6-3a90-96e0-7ddaf50aaae4}, hash: 75960D53241E32FD88EBC14F2E9C7B9E
	@Test()
	void forCertificateTest() {
		//Arrange Statement(s)
		PemSslStoreDetails pemSslStoreDetailsMock = mock(PemSslStoreDetails.class);
		try (MockedStatic<PemSslStoreDetails> pemSslStoreDetails = mockStatic(PemSslStoreDetails.class, CALLS_REAL_METHODS)) {
			pemSslStoreDetails.when(() -> PemSslStoreDetails.forCertificates("certificate1")).thenReturn(pemSslStoreDetailsMock);
			//Act Statement(s)
			PemSslStoreDetails result = PemSslStoreDetails.forCertificate("certificate1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(pemSslStoreDetailsMock));
				pemSslStoreDetails.verify(() -> PemSslStoreDetails.forCertificates("certificate1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${e8452bb5-f56b-33e9-b056-2c2b1ffadbbd}, hash: 0C3C142DD5CAFA5075169692B63C1796
	@Test()
	void forCertificatesTest() {

		//Act Statement(s)
		PemSslStoreDetails result = PemSslStoreDetails.forCertificates("certificates1");
		PemSslStoreDetails pemSslStoreDetails = new PemSslStoreDetails((String) null, "certificates1", (String) null);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(pemSslStoreDetails)));
	}
}
