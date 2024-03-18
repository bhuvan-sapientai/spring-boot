package org.springframework.boot.env;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.aot.hint.ReflectionHints;

import java.util.function.Consumer;

import org.springframework.aot.hint.RuntimeHints;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PropertySourceRuntimeHintsSapientGeneratedTest {

	//Sapient generated method id: ${b1fc7be3-9a56-3b28-acf9-0d8d8fa91d7d}, hash: 442FE7E4CE25DDC9B1F99C5419360121
	@Test()
	void registerHintsTest() {
		//Arrange Statement(s)
		RuntimeHints hintsMock = mock(RuntimeHints.class);
		ReflectionHints reflectionHintsMock = mock(ReflectionHints.class);
		doReturn(reflectionHintsMock).when(hintsMock).reflection();
		ReflectionHints reflectionHintsMock2 = mock(ReflectionHints.class);
		doReturn(reflectionHintsMock2).when(reflectionHintsMock).registerTypeIfPresent((ClassLoader) any(), eq("org.yaml.snakeyaml.Yaml"), (Consumer) any());
		PropertySourceRuntimeHints target = new PropertySourceRuntimeHints();
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();

		//Act Statement(s)
		target.registerHints(hintsMock, classLoader);

		//Assert statement(s)
		assertAll("result", () -> {
			verify(hintsMock).reflection();
			verify(reflectionHintsMock).registerTypeIfPresent((ClassLoader) any(), eq("org.yaml.snakeyaml.Yaml"), (Consumer) any());
		});
	}
}
