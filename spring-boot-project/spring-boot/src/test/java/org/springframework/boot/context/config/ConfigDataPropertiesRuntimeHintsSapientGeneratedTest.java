package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import org.springframework.boot.context.properties.bind.BindableRuntimeHintsRegistrar;
import org.springframework.aot.hint.RuntimeHints;

import org.mockito.MockedStatic;

import org.springframework.aot.hint.ReflectionHints;
import org.springframework.util.ReflectionUtils;
import org.springframework.aot.hint.ExecutableMode;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigDataPropertiesRuntimeHintsSapientGeneratedTest {

	//Sapient generated method id: ${b1fc7be3-9a56-3b28-acf9-0d8d8fa91d7d}, hash: F3F365B1FCCBB454ABFCC4562C09422B
	@Test()
	void registerHintsTest() {
		//Arrange Statement(s)
		RuntimeHints hintsMock = mock(RuntimeHints.class);
		ReflectionHints reflectionHintsMock = mock(ReflectionHints.class);
		ReflectionHints reflectionHintsMock2 = mock(ReflectionHints.class);
		Method methodMock = mock(Method.class);
		BindableRuntimeHintsRegistrar bindableRuntimeHintsRegistrarMock = mock(BindableRuntimeHintsRegistrar.class);
		try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class);
			 MockedStatic<BindableRuntimeHintsRegistrar> bindableRuntimeHintsRegistrar = mockStatic(BindableRuntimeHintsRegistrar.class)) {
			doReturn(reflectionHintsMock).when(hintsMock).reflection();
			doReturn(reflectionHintsMock2).when(reflectionHintsMock).registerMethod(methodMock, ExecutableMode.INVOKE);
			Class[] classArray = new Class[] { ConfigDataProperties.class };
			bindableRuntimeHintsRegistrar.when(() -> BindableRuntimeHintsRegistrar.forTypes(classArray)).thenReturn(bindableRuntimeHintsRegistrarMock);
			doNothing().when(bindableRuntimeHintsRegistrarMock).registerHints(hintsMock);
			Class[] classArray2 = new Class[] { String.class };
			reflectionUtils.when(() -> ReflectionUtils.findMethod(ConfigDataLocation.class, "of", classArray2)).thenReturn(methodMock);
			ConfigDataPropertiesRuntimeHints target = new ConfigDataPropertiesRuntimeHints();
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			//Act Statement(s)
			target.registerHints(hintsMock, classLoader);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(hintsMock).reflection();
				verify(reflectionHintsMock).registerMethod(methodMock, ExecutableMode.INVOKE);
				bindableRuntimeHintsRegistrar.verify(() -> BindableRuntimeHintsRegistrar.forTypes(classArray), atLeast(1));
				verify(bindableRuntimeHintsRegistrarMock).registerHints(hintsMock);
				reflectionUtils.verify(() -> ReflectionUtils.findMethod(ConfigDataLocation.class, "of", classArray2), atLeast(1));
			});
		}
	}
}
