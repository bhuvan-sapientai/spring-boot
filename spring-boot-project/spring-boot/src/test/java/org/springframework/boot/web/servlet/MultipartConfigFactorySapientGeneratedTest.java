package org.springframework.boot.web.servlet;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import jakarta.servlet.MultipartConfigElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MultipartConfigFactorySapientGeneratedTest {

	//Sapient generated method id: ${0cb85a2a-a8bc-3dfb-b101-36cdfdc10d22}, hash: AFBADA1D3FD772DE5DD1C1F159F655C4
	@Test()
	void createMultipartConfigWhenSizeIsNull() {
		/* Branches:
		 * (size != null) : false  #  inside convertToBytes method
		 */
		//Arrange Statement(s)
		MultipartConfigFactory target = new MultipartConfigFactory();
		target.setLocation("location1");

		//Act Statement(s)
		MultipartConfigElement result = target.createMultipartConfig();

		//Assert statement(s)
		//TODO: Please implement equals method in MultipartConfigElement for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
