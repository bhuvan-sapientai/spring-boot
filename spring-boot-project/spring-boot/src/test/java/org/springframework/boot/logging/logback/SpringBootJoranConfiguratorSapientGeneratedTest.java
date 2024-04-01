package org.springframework.boot.logging.logback;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.springframework.core.env.ConfigurableEnvironment;

import ch.qos.logback.core.model.ModelHandlerFactoryMethod;

import org.springframework.core.env.Environment;

import org.mockito.MockitoAnnotations;

import org.springframework.boot.logging.LoggingInitializationContext;

import ch.qos.logback.core.joran.spi.ElementSelector;
import ch.qos.logback.core.joran.spi.RuleStore;
import ch.qos.logback.core.model.processor.DefaultProcessor;

import java.util.function.Supplier;

import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.Context;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringBootJoranConfiguratorSapientGeneratedTest {

	private final LoggingInitializationContext initializationContextMock = mock(LoggingInitializationContext.class, "initializationContext");

	private final Context contextMock = mock(Context.class, "context");

	private AutoCloseable autoCloseableMocks;

	@InjectMocks()
	private SpringBootJoranConfigurator target;

	@AfterEach()
	public void afterTest() throws Exception {
		if (autoCloseableMocks != null)
			autoCloseableMocks.close();
	}

	//Sapient generated method id: ${9ad2b077-a79e-3299-b1b4-48ec2f137995}, hash: 36333DC654162E9E8E0FE2A978EDE763
	@Test()
	void sanityCheckTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: sc - Method: check
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new SpringBootJoranConfigurator(initializationContextMock);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		Model modelMock = mock(Model.class);
		//Act Statement(s)
		target.sanityCheck(modelMock);
	}

	//Sapient generated method id: ${05eb87e7-a8b5-3faf-80b8-28b0f3b64d25}, hash: 550CFBC5B9A856B235002399D443462C
	@Disabled()
	@Test()
	void addModelHandlerAssociationsTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: m - Method: link
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultProcessor defaultProcessorMock = mock(DefaultProcessor.class);
		doNothing().when(defaultProcessorMock).addHandler(eq(SpringPropertyModel.class), (ModelHandlerFactoryMethod) any());
		doNothing().when(defaultProcessorMock).addHandler(eq(SpringProfileModel.class), (ModelHandlerFactoryMethod) any());
		target = new SpringBootJoranConfigurator(initializationContextMock);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		Environment environmentMock = mock(Environment.class);
		Environment environmentMock2 = mock(Environment.class);
		doReturn(environmentMock, environmentMock2).when(initializationContextMock).getEnvironment();
		//Act Statement(s)
		target.addModelHandlerAssociations(defaultProcessorMock);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(defaultProcessorMock).addHandler(eq(SpringPropertyModel.class), (ModelHandlerFactoryMethod) any());
			verify(defaultProcessorMock).addHandler(eq(SpringProfileModel.class), (ModelHandlerFactoryMethod) any());
			verify(initializationContextMock, times(2)).getEnvironment();
		});
	}

	//Sapient generated method id: ${40df43d3-11d4-3590-8276-4ef84e12b991}, hash: 879009364B836020C0DA97C3EB3DAAE3
	@Test()
	void addElementSelectorAndActionAssociationsTest() {
		//Arrange Statement(s)
		RuleStore rsMock = mock(RuleStore.class);
		doNothing().when(rsMock).addRule((ElementSelector) any(), (Supplier) any());
		doNothing().when(rsMock).addTransparentPathPart("if");
		doNothing().when(rsMock).addTransparentPathPart("then");
		doNothing().when(rsMock).addTransparentPathPart("else");
		doNothing().when(rsMock).addTransparentPathPart("sift");
		doNothing().when(rsMock).addTransparentPathPart("springProfile");
		target = new SpringBootJoranConfigurator(initializationContextMock);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		//Act Statement(s)
		target.addElementSelectorAndActionAssociations(rsMock);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(rsMock, atLeast(36)).addRule((ElementSelector) any(), (Supplier) any());
			verify(rsMock).addTransparentPathPart("if");
			verify(rsMock).addTransparentPathPart("then");
			verify(rsMock).addTransparentPathPart("else");
			verify(rsMock).addTransparentPathPart("sift");
			verify(rsMock).addTransparentPathPart("springProfile");
		});
	}

	//Sapient generated method id: ${ae10f2c7-0d6f-30cb-9d93-6532936370f0}, hash: 284A4E1EF00B2F733A8A1B4C5386E24A
	@Disabled()
	@Test()
	void configureUsingAotGeneratedArtifactsWhenNewPatternRulesGetContextNotLoad() {
		/* Branches:
		 * (!new PatternRules(getContext()).load()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type SpringBootJoranConfigurator.PatternRules
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
		LoggingInitializationContext loggingInitializationContext = new LoggingInitializationContext(configurableEnvironmentMock);
		target = new SpringBootJoranConfigurator(loggingInitializationContext);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		Context contextMock2 = mock(Context.class);
		target.setContext(contextMock2);
		//Act Statement(s)
		boolean result = target.configureUsingAotGeneratedArtifacts();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${b8cdaeb8-64ca-34ec-b83e-3f041c4d9896}, hash: EDF2A7E3F4263B70B16489FBA7ED148B
	@Disabled()
	@Test()
	void configureUsingAotGeneratedArtifactsWhenNewPatternRulesGetContextLoad() {
		/* Branches:
		 * (!new PatternRules(getContext()).load()) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type SpringBootJoranConfigurator.ModelReader, object of type SpringBootJoranConfigurator.PatternRules
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
		LoggingInitializationContext loggingInitializationContext = new LoggingInitializationContext(configurableEnvironmentMock);
		target = spy(new SpringBootJoranConfigurator(loggingInitializationContext));
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		target.setContext(contextMock);
		Model modelMock = mock(Model.class);
		doNothing().when(target).processModel(modelMock);
		doNothing().when(contextMock).putObject("SAFE_JORAN_CONFIGURATION", modelMock);
		//Act Statement(s)
		boolean result = target.configureUsingAotGeneratedArtifacts();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.TRUE));
			verify(target).processModel(modelMock);
			verify(contextMock).putObject("SAFE_JORAN_CONFIGURATION", modelMock);
		});
	}

	//Sapient generated method id: ${7c995638-50cb-3cb6-a134-f90ca810a8ed}, hash: 79EB22F190D24077CA94238863A54400
	@Disabled()
	@Test()
	void processModelWhenIsAotProcessingInProgressNot() {
		/* Branches:
		 * (!NativeDetector.inNativeImage()) : true
		 * (isAotProcessingInProgress()) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new SpringBootJoranConfigurator(initializationContextMock);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		Model modelMock = mock(Model.class);
		//Act Statement(s)
		target.processModel(modelMock);
	}
}
