package org.springframework.boot.json;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers;
import com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer;

import org.springframework.util.ClassUtils;
import org.springframework.aot.hint.TypeHint;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.TypeReference;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import org.springframework.aot.hint.ReflectionHints;

import java.util.function.Consumer;

import com.fasterxml.jackson.databind.ser.std.ClassSerializer;
import com.fasterxml.jackson.databind.ser.std.FileSerializer;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JacksonRuntimeHintsSapientGeneratedTest {

	//Sapient generated method id: ${b35d5d0c-4e5d-305a-95c1-c809fad49f91}, hash: ABE8E87AF906898BACD23DE456E8BE82
	@Test()
	void registerHintsWhenClassUtilsNotIsPresentCom_fasterxml_jackson_databind_ser_BasicSerializerFactoryClassLoader() {
		/* Branches:
		 * (!ClassUtils.isPresent("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", classLoader)) : true
		 */
		//Arrange Statement(s)
		RuntimeHints runtimeHintsMock = mock(RuntimeHints.class);
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			classUtils.when(() -> ClassUtils.isPresent(eq("com.fasterxml.jackson.databind.ser.BasicSerializerFactory"), (ClassLoader) any())).thenReturn(false);
			JacksonRuntimeHints target = new JacksonRuntimeHints();
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			//Act Statement(s)
			target.registerHints(runtimeHintsMock, classLoader);
			//Assert statement(s)
			assertAll("result", () -> classUtils.verify(() -> ClassUtils.isPresent(eq("com.fasterxml.jackson.databind.ser.BasicSerializerFactory"), (ClassLoader) any())));
		}
	}

	//Sapient generated method id: ${22266cd7-504f-3507-8e97-f6964639aed2}, hash: 70AD6C52B10E919E1916F49572EDBBAB
	@Test()
	void registerHintsWhenClassUtilsIsPresentCom_fasterxml_jackson_databind_ser_BasicSerializerFactoryClassLoader() {
		/* Branches:
		 * (!ClassUtils.isPresent("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", classLoader)) : false
		 */
		//Arrange Statement(s)
		RuntimeHints hintsMock = mock(RuntimeHints.class);
		ReflectionHints reflectionHintsMock = mock(ReflectionHints.class);
		ReflectionHints reflectionHintsMock2 = mock(ReflectionHints.class);
		try (MockedStatic<TypeReference> typeReference = mockStatic(TypeReference.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			doReturn(reflectionHintsMock).when(hintsMock).reflection();
			List<TypeReference> typeReferenceList = new ArrayList<>();
			doReturn(reflectionHintsMock2).when(reflectionHintsMock).registerTypes(eq(typeReferenceList), (Consumer) any());
			classUtils.when(() -> ClassUtils.isPresent(eq("com.fasterxml.jackson.databind.ser.BasicSerializerFactory"), (ClassLoader) any())).thenReturn(true);
			Class<StdJdkSerializers.AtomicBooleanSerializer>[] classArray = new Class[] { StdJdkSerializers.AtomicBooleanSerializer.class, StdJdkSerializers.AtomicIntegerSerializer.class, StdJdkSerializers.AtomicLongSerializer.class, FileSerializer.class, ClassSerializer.class, TokenBufferSerializer.class };
			typeReference.when(() -> TypeReference.listOf(classArray)).thenReturn(typeReferenceList);
			JacksonRuntimeHints target = new JacksonRuntimeHints();
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			//Act Statement(s)
			target.registerHints(hintsMock, classLoader);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(hintsMock).reflection();
				verify(reflectionHintsMock).registerTypes(eq(typeReferenceList), (Consumer) any());
				classUtils.verify(() -> ClassUtils.isPresent(eq("com.fasterxml.jackson.databind.ser.BasicSerializerFactory"), (ClassLoader) any()));
				typeReference.verify(() -> TypeReference.listOf(classArray), atLeast(1));
			});
		}
	}
}
