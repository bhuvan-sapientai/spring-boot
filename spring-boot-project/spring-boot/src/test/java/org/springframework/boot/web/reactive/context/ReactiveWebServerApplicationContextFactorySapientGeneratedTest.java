package org.springframework.boot.web.reactive.context;

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
class ReactiveWebServerApplicationContextFactorySapientGeneratedTest {

	//Sapient generated method id: ${9596fce6-4563-387a-b697-0c4c57264be0}
	@Test()
	void getEnvironmentTypeWhenWebApplicationTypeNotEqualsWebApplicationTypeREACTIVE() {
		/* Branches:
		 * (webApplicationType != WebApplicationType.REACTIVE) : true
		 */
		//Arrange Statement(s)
		ReactiveWebServerApplicationContextFactory target = new ReactiveWebServerApplicationContextFactory();
		//Act Statement(s)
		Class<? extends ConfigurableEnvironment> result = target.getEnvironmentType(WebApplicationType.NONE);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${41f97dfa-638e-3a84-8f5b-c87b9c2feb4d}
	@Test()
	void getEnvironmentTypeWhenWebApplicationTypeEqualsWebApplicationTypeREACTIVE() {
		/* Branches:
		 * (webApplicationType != WebApplicationType.REACTIVE) : false
		 */
		//Arrange Statement(s)
		ReactiveWebServerApplicationContextFactory target = new ReactiveWebServerApplicationContextFactory();
		//Act Statement(s)
		Class<? extends ConfigurableEnvironment> result = target.getEnvironmentType(WebApplicationType.REACTIVE);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(ApplicationReactiveWebEnvironment.class)));
	}

	//Sapient generated method id: ${803db7ee-ba1c-3ffe-8752-36e0363335a7}
	@Test()
	void createEnvironmentWhenWebApplicationTypeNotEqualsWebApplicationTypeREACTIVE() {
		/* Branches:
		 * (webApplicationType != WebApplicationType.REACTIVE) : true
		 */
		//Arrange Statement(s)
		ReactiveWebServerApplicationContextFactory target = new ReactiveWebServerApplicationContextFactory();
		//Act Statement(s)
		ConfigurableEnvironment result = target.createEnvironment(WebApplicationType.NONE);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${4030f04c-ee9f-310a-b4cb-c6556c16a042}
	@Disabled()
	@Test()
	void createEnvironmentWhenWebApplicationTypeEqualsWebApplicationTypeREACTIVE() {
		/* Branches:
		 * (webApplicationType != WebApplicationType.REACTIVE) : false
		 */
		//Arrange Statement(s)
		ReactiveWebServerApplicationContextFactory target = new ReactiveWebServerApplicationContextFactory();
		//Act Statement(s)
		ConfigurableEnvironment result = target.createEnvironment(WebApplicationType.REACTIVE);
		ApplicationReactiveWebEnvironment applicationReactiveWebEnvironment = new ApplicationReactiveWebEnvironment();
		//Assert statement(s)
		//TODO: Please implement equals method in ApplicationReactiveWebEnvironment for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(applicationReactiveWebEnvironment)));
	}

	//Sapient generated method id: ${5060897b-a874-3278-827e-2474fec58a8c}
	@Test()
	void createWhenWebApplicationTypeNotEqualsWebApplicationTypeREACTIVE() {
		/* Branches:
		 * (webApplicationType != WebApplicationType.REACTIVE) : true
		 */
		//Arrange Statement(s)
		ReactiveWebServerApplicationContextFactory target = new ReactiveWebServerApplicationContextFactory();
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
		 * (webApplicationType != WebApplicationType.REACTIVE) : false
		 * (!AotDetector.useGeneratedArtifacts()) : true  #  inside createContext method
		 */
		//Arrange Statement(s)
		ReactiveWebServerApplicationContextFactory target = new ReactiveWebServerApplicationContextFactory();
		//Act Statement(s)
		ConfigurableApplicationContext result = target.create(WebApplicationType.REACTIVE);
		AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext = new AnnotationConfigReactiveWebServerApplicationContext();
		//Assert statement(s)
		//TODO: Please implement equals method in AnnotationConfigReactiveWebServerApplicationContext for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(annotationConfigReactiveWebServerApplicationContext)));
	}
}
