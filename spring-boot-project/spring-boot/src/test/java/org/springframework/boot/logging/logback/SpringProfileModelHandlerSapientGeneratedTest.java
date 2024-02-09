package org.springframework.boot.logging.logback;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import ch.qos.logback.core.model.processor.ModelHandlerException;
import ch.qos.logback.core.spi.ScanException;

import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;
import org.springframework.core.env.Profiles;

import ch.qos.logback.core.util.OptionHelper;
import org.mockito.MockedStatic;
import ch.qos.logback.core.model.processor.ModelInterpretationContext;
import ch.qos.logback.core.Context;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringProfileModelHandlerSapientGeneratedTest {

	private final Environment environmentMock = mock(Environment.class, "environment");

	private final Context contextMock = mock(Context.class);

	private final ModelInterpretationContext modelInterpretationContextMock = mock(ModelInterpretationContext.class);

	private final SpringProfileModel modelMock = mock(SpringProfileModel.class);

	private final Profiles profilesMock = mock(Profiles.class);

	//Sapient generated method id: ${6ee8a090-61da-3849-bb35-46131c59103f}
	@Test()
	void handleWhenAcceptsProfilesNotInterconProfileModel() throws ModelHandlerException, ScanException {
		/* Branches:
		 * (this.environment == null) : true  #  inside acceptsProfiles method
		 * (!acceptsProfiles(intercon, profileModel)) : true
		 */
		//Arrange Statement(s)
		doNothing().when(modelMock).deepMarkAsSkipped();
		SpringProfileModelHandler target = new SpringProfileModelHandler(contextMock, (Environment) null);
		//Act Statement(s)
		target.handle(modelInterpretationContextMock, modelMock);
		//Assert statement(s)
		assertAll("result", () -> verify(modelMock).deepMarkAsSkipped());
	}

	//Sapient generated method id: ${0183a0ea-3d75-3649-b9c0-4329b3e87493}
	@Disabled()
	@Test()
	void handleWhenProfileNamesLengthEquals0AndAcceptsProfilesNotInterconProfileModel() throws ModelHandlerException, ScanException {
		/* Branches:
		 * (this.environment == null) : false  #  inside acceptsProfiles method
		 * (profileNames.length == 0) : true  #  inside acceptsProfiles method
		 * (!acceptsProfiles(intercon, profileModel)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class, CALLS_REAL_METHODS)) {
			doReturn("A").when(modelMock).getName();
			doNothing().when(modelMock).deepMarkAsSkipped();
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "return_of_commaDelimitedListToStringArrayItem1" };
			stringUtils.when(() -> StringUtils.trimArrayElements(stringArray2)).thenReturn(stringArray);
			SpringProfileModelHandler target = new SpringProfileModelHandler(contextMock, environmentMock);
			//Act Statement(s)
			target.handle(modelInterpretationContextMock, modelMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(modelMock, atLeast(1)).getName();
				verify(modelMock, atLeast(1)).deepMarkAsSkipped();
				stringUtils.verify(() -> StringUtils.trimArrayElements(stringArray2), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${8b001a2a-7be2-3eb4-b6bc-051777f383af}
	@Disabled()
	@Test()
	void handleWhenCaughtScanExceptionThrowsRuntimeException() throws ModelHandlerException, ScanException {
		/* Branches:
		 * (this.environment == null) : false  #  inside acceptsProfiles method
		 * (profileNames.length == 0) : false  #  inside acceptsProfiles method
		 * (i < profileNames.length) : true  #  inside acceptsProfiles method
		 * (catch-exception (ScanException)) : true  #  inside acceptsProfiles method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ScanException scanExceptionMock = mock(ScanException.class);
		try (MockedStatic<OptionHelper> optionHelper = mockStatic(OptionHelper.class)) {
			doReturn("A").when(modelMock).getName();
			optionHelper.when(() -> OptionHelper.substVars("input1", modelInterpretationContextMock, contextMock)).thenThrow(scanExceptionMock);
			SpringProfileModelHandler target = new SpringProfileModelHandler(contextMock, environmentMock);
			//Act Statement(s)
			final RuntimeException result = assertThrows(RuntimeException.class, () -> {
				target.handle(modelInterpretationContextMock, modelMock);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(modelMock).getName();
				optionHelper.verify(() -> OptionHelper.substVars("input1", modelInterpretationContextMock, contextMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${fcffc309-d4d7-32f0-b8ff-f805ceb7c309}
	@Disabled()
	@Test()
	void handleWhenAcceptsProfilesInterconProfileModel() throws ModelHandlerException, ScanException {
		/* Branches:
		 * (this.environment == null) : false  #  inside acceptsProfiles method
		 * (profileNames.length == 0) : false  #  inside acceptsProfiles method
		 * (i < profileNames.length) : true  #  inside acceptsProfiles method
		 * (this.environment.acceptsProfiles(Profiles.of(profileNames))) : true  #  inside acceptsProfiles method
		 * (!acceptsProfiles(intercon, profileModel)) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Profiles> profiles = mockStatic(Profiles.class);
			 MockedStatic<OptionHelper> optionHelper = mockStatic(OptionHelper.class)) {
			doReturn("A").when(modelMock).getName();
			optionHelper.when(() -> OptionHelper.substVars("input1", modelInterpretationContextMock, contextMock)).thenReturn("return_of_trimArrayElementsItem1");
			String[] stringArray = new String[] { "return_of_trimArrayElementsItem1" };
			profiles.when(() -> Profiles.of(stringArray)).thenReturn(profilesMock);
			SpringProfileModelHandler target = new SpringProfileModelHandler(contextMock, environmentMock);
			doReturn(true).when(environmentMock).acceptsProfiles(profilesMock);
			//Act Statement(s)
			target.handle(modelInterpretationContextMock, modelMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(modelMock).getName();
				optionHelper.verify(() -> OptionHelper.substVars("input1", modelInterpretationContextMock, contextMock), atLeast(1));
				profiles.verify(() -> Profiles.of(stringArray), atLeast(1));
				verify(environmentMock).acceptsProfiles(profilesMock);
			});
		}
	}

	//Sapient generated method id: ${4d0a0456-8a2e-3f9b-83d6-a32286dc3644}
	@Disabled()
	@Test()
	void handleWhenThisEnvironmentNotAcceptsProfilesProfilesOfProfileNamesAndAcceptsProfilesNotInterconProfileModel() throws ModelHandlerException, ScanException {
		/* Branches:
		 * (this.environment == null) : false  #  inside acceptsProfiles method
		 * (profileNames.length == 0) : false  #  inside acceptsProfiles method
		 * (i < profileNames.length) : true  #  inside acceptsProfiles method
		 * (this.environment.acceptsProfiles(Profiles.of(profileNames))) : false  #  inside acceptsProfiles method
		 * (!acceptsProfiles(intercon, profileModel)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Profiles> profiles = mockStatic(Profiles.class);
			 MockedStatic<OptionHelper> optionHelper = mockStatic(OptionHelper.class)) {
			doReturn("A").when(modelMock).getName();
			doNothing().when(modelMock).deepMarkAsSkipped();
			optionHelper.when(() -> OptionHelper.substVars("input1", modelInterpretationContextMock, contextMock)).thenReturn("return_of_trimArrayElementsItem1");
			String[] stringArray = new String[] { "return_of_trimArrayElementsItem1" };
			profiles.when(() -> Profiles.of(stringArray)).thenReturn(profilesMock);
			SpringProfileModelHandler target = new SpringProfileModelHandler(contextMock, environmentMock);
			doReturn(false).when(environmentMock).acceptsProfiles(profilesMock);
			//Act Statement(s)
			target.handle(modelInterpretationContextMock, modelMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(modelMock).getName();
				verify(modelMock).deepMarkAsSkipped();
				optionHelper.verify(() -> OptionHelper.substVars("input1", modelInterpretationContextMock, contextMock), atLeast(1));
				profiles.verify(() -> Profiles.of(stringArray), atLeast(1));
				verify(environmentMock).acceptsProfiles(profilesMock);
			});
		}
	}
}
