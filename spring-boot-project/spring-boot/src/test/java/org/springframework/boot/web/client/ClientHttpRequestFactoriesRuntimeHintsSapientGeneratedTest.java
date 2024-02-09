package org.springframework.boot.web.client;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;

import org.mockito.stubbing.Answer;

import java.lang.reflect.Method;

import org.springframework.util.ClassUtils;

import java.lang.reflect.Field;

import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.util.Assert;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import org.springframework.aot.hint.TypeReference;
import org.springframework.aot.hint.ReflectionHints;

import java.util.function.Consumer;

import org.springframework.util.ReflectionUtils;
import org.springframework.aot.hint.ExecutableMode;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ClientHttpRequestFactoriesRuntimeHintsSapientGeneratedTest {

	//Sapient generated method id: ${af656012-d7dc-35bd-a04c-dcfd9c5b2473}
	@Disabled()
	@Test()
	void registerHintsWhenMethodIsNotNull() {
		/* Branches:
		 * (ClassUtils.isPresent("org.springframework.http.client.ClientHttpRequestFactory", classLoader)) : true
		 * (field != null) : true  #  inside findField method
		 * (method != null) : true  #  inside registerMethod method
		 */
		//Arrange Statement(s)
		RuntimeHints hintsMock = mock(RuntimeHints.class);
		ReflectionHints reflectionHintsMock = mock(ReflectionHints.class);
		ReflectionHints reflectionHintsMock2 = mock(ReflectionHints.class);
		ReflectionHints reflectionHintsMock3 = mock(ReflectionHints.class);
		ReflectionHints reflectionHintsMock4 = mock(ReflectionHints.class);
		ReflectionHints reflectionHintsMock5 = mock(ReflectionHints.class);
		ReflectionHints reflectionHintsMock6 = mock(ReflectionHints.class);
		ReflectionHints reflectionHintsMock7 = mock(ReflectionHints.class);
		ReflectionHints reflectionHintsMock8 = mock(ReflectionHints.class);
		ReflectionHints reflectionHintsMock9 = mock(ReflectionHints.class);
		ReflectionHints reflectionHintsMock10 = mock(ReflectionHints.class);
		ReflectionHints reflectionHintsMock11 = mock(ReflectionHints.class);
		ReflectionHints reflectionHintsMock12 = mock(ReflectionHints.class);
		ReflectionHints reflectionHintsMock13 = mock(ReflectionHints.class);
		ReflectionHints reflectionHintsMock14 = mock(ReflectionHints.class);
		try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			doReturn(reflectionHintsMock).when(hintsMock).reflection();
			doReturn(reflectionHintsMock2).when(reflectionHintsMock).registerField((Field) any());
			doReturn(reflectionHintsMock4).when(reflectionHintsMock).registerMethod((Method) null, ExecutableMode.INVOKE);
			doReturn(reflectionHintsMock5).when(reflectionHintsMock).registerTypeIfPresent((ClassLoader) any(), eq("org.apache.hc.client5.http.impl.classic.HttpClients"), (Consumer) any());
			doReturn(reflectionHintsMock8).when(reflectionHintsMock).registerTypeIfPresent((ClassLoader) any(), eq("org.eclipse.jetty.client.HttpClient"), (Consumer) any());
			doReturn(reflectionHintsMock11).when(reflectionHintsMock).registerType(eq(SimpleClientHttpRequestFactory.class), (Consumer) any());
			doReturn(reflectionHintsMock3, reflectionHintsMock6, reflectionHintsMock7, reflectionHintsMock9, reflectionHintsMock10, reflectionHintsMock12, reflectionHintsMock13).when(reflectionHintsMock).registerMethod((Method) any(), eq(ExecutableMode.INVOKE));
			doReturn(reflectionHintsMock14).when(reflectionHintsMock).registerTypeIfPresent((ClassLoader) any(), eq("okhttp3.OkHttpClient"), (Consumer) any());
			classUtils.when(() -> ClassUtils.isPresent(eq("org.springframework.http.client.ClientHttpRequestFactory"), (ClassLoader) any())).thenReturn(true);
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			Class[] classArray = new Class[] { int.class };
			//TODO: Needs to return real value
			reflectionUtils.when(() -> ReflectionUtils.findMethod(HttpComponentsClientHttpRequestFactory.class, "setReadTimeout", classArray)).thenReturn(null);
			Class[] classArray2 = new Class[] { int.class };
			Method method = ReflectionUtils.findMethod(OkHttp3ClientHttpRequestFactory.class, "setConnectTimeout", classArray2);
			reflectionUtils.when(() -> ReflectionUtils.findMethod(OkHttp3ClientHttpRequestFactory.class, "setConnectTimeout", classArray2)).thenReturn(method);
			ClientHttpRequestFactoriesRuntimeHints target = new ClientHttpRequestFactoriesRuntimeHints();
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			//Act Statement(s)
			target.registerHints(hintsMock, classLoader);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(hintsMock, atLeast(1)).reflection();
				verify(reflectionHintsMock, atLeast(1)).registerField((Field) any());
				verify(reflectionHintsMock, atLeast(7)).registerMethod((Method) any(), eq(ExecutableMode.INVOKE));
				verify(reflectionHintsMock, atLeast(1)).registerMethod((Method) null, ExecutableMode.INVOKE);
				verify(reflectionHintsMock, atLeast(1)).registerTypeIfPresent((ClassLoader) any(), eq("org.apache.hc.client5.http.impl.classic.HttpClients"), (Consumer) any());
				verify(reflectionHintsMock, atLeast(1)).registerTypeIfPresent((ClassLoader) any(), eq("org.eclipse.jetty.client.HttpClient"), (Consumer) any());
				verify(reflectionHintsMock, atLeast(1)).registerType(eq(SimpleClientHttpRequestFactory.class), (Consumer) any());
				verify(reflectionHintsMock, atLeast(1)).registerTypeIfPresent((ClassLoader) any(), eq("okhttp3.OkHttpClient"), (Consumer) any());
				classUtils.verify(() -> ClassUtils.isPresent(eq("org.springframework.http.client.ClientHttpRequestFactory"), (ClassLoader) any()), atLeast(1));
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()), atLeast(1));
				reflectionUtils.verify(() -> ReflectionUtils.findMethod(HttpComponentsClientHttpRequestFactory.class, "setReadTimeout", classArray), atLeast(1));
				reflectionUtils.verify(() -> ReflectionUtils.findMethod(OkHttp3ClientHttpRequestFactory.class, "setConnectTimeout", classArray2), atLeast(1));
			});
		}
	}
}
