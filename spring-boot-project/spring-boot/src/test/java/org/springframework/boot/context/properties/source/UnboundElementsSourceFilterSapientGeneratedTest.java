package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.env.PropertySource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UnboundElementsSourceFilterSapientGeneratedTest {

	private final ConfigurationPropertySource configurationPropertySourceMock = mock(ConfigurationPropertySource.class);

	//Sapient generated method id: ${5f3aefae-6212-3c03-9286-f562997697c1}, hash: 300362C64F9C23AED7ADA1425B9FE962
	@Disabled()
	@Test()
	void applyWhenUnderlyingSourceNotInstanceOfPropertySource() {
		/* Branches:
		 * (underlyingSource instanceof PropertySource) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertySource configurationPropertySourceMock = mock(ConfigurationPropertySource.class, "Object");
		Object object = new Object();
		doReturn(object).when(configurationPropertySourceMock).getUnderlyingSource();
		UnboundElementsSourceFilter target = new UnboundElementsSourceFilter();
		//Act Statement(s)
		Boolean result = target.apply(configurationPropertySourceMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(configurationPropertySourceMock).getUnderlyingSource();
		});
	}

	//Sapient generated method id: ${0000fa7d-6b33-3661-a73a-b594448e0a97}, hash: CAEF1E3C0C166B8DFF6F498DD05F872F
	@Disabled()
	@Test()
	void applyWhenBENIGN_PROPERTY_SOURCE_NAMESNotContainsName() {
		/* Branches:
		 * (underlyingSource instanceof PropertySource) : true
		 * (!BENIGN_PROPERTY_SOURCE_NAMES.contains(name)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		PropertySource propertySource = PropertySource.named("A");
		doReturn(propertySource).when(configurationPropertySourceMock).getUnderlyingSource();
		UnboundElementsSourceFilter target = new UnboundElementsSourceFilter();
		//Act Statement(s)
		Boolean result = target.apply(configurationPropertySourceMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(configurationPropertySourceMock).getUnderlyingSource();
		});
	}

	//Sapient generated method id: ${3fe2d48d-60a8-3b7b-ac26-5152b14a648a}, hash: 0C6BE450DB0162B495C7C08DB7297B53
	@Test()
	void applyWhenBENIGN_PROPERTY_SOURCE_NAMESContainsName() {
		/* Branches:
		 * (underlyingSource instanceof PropertySource) : true
		 * (!BENIGN_PROPERTY_SOURCE_NAMES.contains(name)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		PropertySource propertySource = PropertySource.named("systemProperties");
		doReturn(propertySource).when(configurationPropertySourceMock).getUnderlyingSource();
		UnboundElementsSourceFilter target = new UnboundElementsSourceFilter();
		//Act Statement(s)
		Boolean result = target.apply(configurationPropertySourceMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(configurationPropertySourceMock).getUnderlyingSource();
		});
	}
}
