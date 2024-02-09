package org.springframework.boot.web.servlet.context;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.WebApplicationType;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ServletWebServerApplicationContextFactorySapientGeneratedTest {

	//Sapient generated method id: ${d16221f6-bb15-3ca5-bd13-03fe3c352231}
	@Test()
	void getEnvironmentTypeWhenWebApplicationTypeNotEqualsWebApplicationTypeSERVLET() {
		/* Branches:
		 * (webApplicationType != WebApplicationType.SERVLET) : true
		 */
		//Arrange Statement(s)
		ServletWebServerApplicationContextFactory target = new ServletWebServerApplicationContextFactory();
		//Act Statement(s)
		Class<? extends ConfigurableEnvironment> result = target.getEnvironmentType(WebApplicationType.NONE);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${29490cb3-9210-3eff-8f97-46db0d720dd3}
	@Test()
	void getEnvironmentTypeWhenWebApplicationTypeEqualsWebApplicationTypeSERVLET() {
		/* Branches:
		 * (webApplicationType != WebApplicationType.SERVLET) : false
		 */
		//Arrange Statement(s)
		ServletWebServerApplicationContextFactory target = new ServletWebServerApplicationContextFactory();
		//Act Statement(s)
		Class<? extends ConfigurableEnvironment> result = target.getEnvironmentType(WebApplicationType.SERVLET);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(ApplicationServletEnvironment.class)));
	}

	//Sapient generated method id: ${92d4b71f-e8a9-37f2-9242-7c7e5d2b6994}
	@Test()
	void createEnvironmentWhenWebApplicationTypeNotEqualsWebApplicationTypeSERVLET() {
		/* Branches:
		 * (webApplicationType != WebApplicationType.SERVLET) : true
		 */
		//Arrange Statement(s)
		ServletWebServerApplicationContextFactory target = new ServletWebServerApplicationContextFactory();
		//Act Statement(s)
		ConfigurableEnvironment result = target.createEnvironment(WebApplicationType.NONE);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${cad05148-c22e-3fee-b24b-203b63c28a9b}
	@Disabled()
	@Test()
	void createEnvironmentWhenWebApplicationTypeEqualsWebApplicationTypeSERVLET() {
		/* Branches:
		 * (webApplicationType != WebApplicationType.SERVLET) : false
		 */
		//Arrange Statement(s)
		ServletWebServerApplicationContextFactory target = new ServletWebServerApplicationContextFactory();
		//Act Statement(s)
		ConfigurableEnvironment result = target.createEnvironment(WebApplicationType.SERVLET);
		ApplicationServletEnvironment applicationServletEnvironment = new ApplicationServletEnvironment();
		//Assert statement(s)
		//TODO: Please implement equals method in ApplicationServletEnvironment for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(applicationServletEnvironment)));
	}

	//Sapient generated method id: ${753c1c10-04e6-32a5-9fd6-a521de7f1671}
	@Test()
	void createWhenWebApplicationTypeNotEqualsWebApplicationTypeSERVLET() {
		/* Branches:
		 * (webApplicationType != WebApplicationType.SERVLET) : true
		 */
		//Arrange Statement(s)
		ServletWebServerApplicationContextFactory target = new ServletWebServerApplicationContextFactory();
		//Act Statement(s)
		ConfigurableApplicationContext result = target.create(WebApplicationType.NONE);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${04d448bd-0d6b-3748-bb5b-1365c42e01b2}
	@Disabled()
	@Test()
	void createWhenAotDetectorNotUseGeneratedArtifacts() {
		/* Branches:
		 * (webApplicationType != WebApplicationType.SERVLET) : false
		 * (!AotDetector.useGeneratedArtifacts()) : true  #  inside createContext method
		 */
		//Arrange Statement(s)
		ServletWebServerApplicationContextFactory target = new ServletWebServerApplicationContextFactory();
		//Act Statement(s)
		ConfigurableApplicationContext result = target.create(WebApplicationType.SERVLET);
		AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext = new AnnotationConfigServletWebServerApplicationContext();
		//Assert statement(s)
		//TODO: Please implement equals method in AnnotationConfigServletWebServerApplicationContext for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(annotationConfigServletWebServerApplicationContext)));
	}
}
