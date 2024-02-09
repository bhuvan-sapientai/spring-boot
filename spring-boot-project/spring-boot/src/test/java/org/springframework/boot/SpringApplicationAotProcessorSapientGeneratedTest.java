package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.context.support.GenericApplicationContext;

import java.lang.reflect.Method;

import org.mockito.MockedStatic;

import org.springframework.context.aot.AbstractAotProcessor;
import org.springframework.util.ReflectionUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringApplicationAotProcessorSapientGeneratedTest {

	//Sapient generated method id: ${2e5860ff-9b97-3d7a-a37a-361ee5355e86}
	@Disabled()
	@Test()
	void prepareApplicationContextTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		AbstractAotProcessor.Settings abstractAotProcessorSettingsMock = mock(AbstractAotProcessor.Settings.class);
		try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class)) {
			Object object = new Object();
			String[] stringArray = new String[] {};
			Object[] objectArray = new Object[] { stringArray };
			reflectionUtils.when(() -> ReflectionUtils.invokeMethod((Method) null, null, objectArray)).thenReturn(object);
			SpringApplicationAotProcessor target = new SpringApplicationAotProcessor(Object.class, abstractAotProcessorSettingsMock, stringArray);
			//Act Statement(s)
			GenericApplicationContext result = target.prepareApplicationContext(Object.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				reflectionUtils.verify(() -> ReflectionUtils.invokeMethod((Method) null, null, objectArray), atLeast(1));
			});
		}
	}
}
