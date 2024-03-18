package org.springframework.boot.ssl.pem;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.security.cert.CertificateException;
import java.util.List;

import org.mockito.stubbing.Answer;

import java.security.cert.CertificateFactory;

import org.mockito.MockedStatic;

import java.security.cert.X509Certificate;

import org.springframework.util.CollectionUtils;
import org.springframework.util.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PemCertificateParserSapientGeneratedTest {

	//Sapient generated method id: ${338a9b6c-713e-3004-8310-8ed2c59d6a79}, hash: 0806A4B2EAF4CAED60F3DB7FCC59E301
	@Test()
	void parseWhenTextIsNull() throws CertificateException {
		/* Branches:
		 * (text == null) : true
		 */
		//Act Statement(s)
		List<X509Certificate> result = PemCertificateParser.parse((String) null);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${dda8f05a-7c6e-385d-a7df-65b719c84f92}, hash: 7A46F225FFA731051630F13E05CFE65C
	@Test()
	void parseWhenCaughtCertificateExceptionThrowsIllegalStateException() throws CertificateException {
		/* Branches:
		 * (text == null) : false
		 * (catch-exception (CertificateException)) : true  #  inside getCertificateFactory method
		 */
		//Arrange Statement(s)
		try (MockedStatic<CertificateFactory> certificateFactory = mockStatic(CertificateFactory.class)) {
			CertificateException certificateException = new CertificateException();
			certificateFactory.when(() -> CertificateFactory.getInstance("X.509")).thenThrow(certificateException);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				PemCertificateParser.parse("text1");
			});
			IllegalStateException illegalStateException = new IllegalStateException("Unable to get X.509 certificate factory", certificateException);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(certificateException.getClass())));
				certificateFactory.verify(() -> CertificateFactory.getInstance("X.509"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${7dbfec7e-54da-3601-866e-eee4a83b8a65}, hash: DB138E538791E4839316F212E015ADE3
	@Test()
	void parseWhenInputStreamAvailableGreaterThan0AndCollectionUtilsIsEmptyCerts() throws CertificateException {
		/* Branches:
		 * (text == null) : false
		 * (matcher.find()) : true  #  inside readCertificates method
		 * (inputStream.available() > 0) : true  #  inside readCertificates method
		 * (!CollectionUtils.isEmpty(certs)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(false, "Missing certificates or unrecognized format")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			List<X509Certificate> result = PemCertificateParser.parse("text1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				_assert.verify(() -> Assert.state(false, "Missing certificates or unrecognized format"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${d0daca89-7f9e-3849-b113-3952438a9b4e}, hash: 0A0F3DAAB09F99C8CF785871AE2CF68A
	@Disabled()
	@Test()
	void parseWhenInputStreamAvailableGreaterThan0AndCaughtCertificateExceptionThrowsIllegalStateException() {
		/* Branches:
		 * (text == null) : false
		 * (matcher.find()) : true  #  inside readCertificates method
		 * (inputStream.available() > 0) : true  #  inside readCertificates method
		 * (catch-exception (CertificateException)) : true  #  inside readCertificates method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		CertificateException certificateException = new CertificateException("A");
		IllegalStateException illegalStateException = new IllegalStateException("Error reading certificate: A", certificateException);
		//Act Statement(s)
		final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
			PemCertificateParser.parse("valid_input_value");
		});
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
			assertThat(result.getCause(), is(instanceOf(certificateException.getClass())));
		});
	}
}
