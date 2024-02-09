package org.springframework.boot.jackson;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.util.function.BiConsumer;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JsonMixinModuleSapientGeneratedTest {

	//Sapient generated method id: ${0af7a47d-0f31-37d4-b157-b1620a8e23cc}
	@Disabled()
	@Test()
	void registerEntriesTest() {
		//Arrange Statement(s)
		JsonMixinModuleEntries entriesMock = mock(JsonMixinModuleEntries.class);
		doNothing().when(entriesMock).doWithEntry((ClassLoader) any(), (BiConsumer) any());
		JsonMixinModule target = spy(new JsonMixinModule());
		SimpleModule simpleModule = new SimpleModule();
		doReturn(simpleModule).when(target).setMixInAnnotation(Object.class, Object.class);
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//Act Statement(s)
		target.registerEntries(entriesMock, classLoader);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(entriesMock).doWithEntry((ClassLoader) any(), (BiConsumer) any());
			verify(target).setMixInAnnotation(Object.class, Object.class);
		});
	}
}
