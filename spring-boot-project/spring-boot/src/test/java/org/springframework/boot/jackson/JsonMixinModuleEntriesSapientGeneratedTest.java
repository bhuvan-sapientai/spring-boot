package org.springframework.boot.jackson;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.util.ClassUtils;
import org.springframework.context.ApplicationContext;

import java.util.function.BiConsumer;
import java.util.Collection;

import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.util.function.Consumer;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JsonMixinModuleEntriesSapientGeneratedTest {

	private final ApplicationContext applicationContextMock = mock(ApplicationContext.class);

	private final JsonMixinModuleEntries jsonMixinModuleEntriesMock = mock(JsonMixinModuleEntries.class);

	//Sapient generated method id: ${2284fc3d-473b-3992-886d-8fe431bd702d}
	@Test()
	void createTest() {
		//Arrange Statement(s)
		Consumer consumer = null;
		//Act Statement(s)
		final NullPointerException result = assertThrows(NullPointerException.class, () -> {
			JsonMixinModuleEntries.create(consumer);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${a44c7f8b-7042-3a69-918e-f3990c993275}
	@Test()
	void scanTest() {
		//Arrange Statement(s)
		try (MockedStatic<JsonMixinModuleEntries> jsonMixinModuleEntries = mockStatic(JsonMixinModuleEntries.class, CALLS_REAL_METHODS)) {
			jsonMixinModuleEntries.when(() -> JsonMixinModuleEntries.create((Consumer) any())).thenReturn(jsonMixinModuleEntriesMock);
			Collection<String> collection = new ArrayList<>();
			//Act Statement(s)
			JsonMixinModuleEntries result = JsonMixinModuleEntries.scan(applicationContextMock, collection);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(jsonMixinModuleEntriesMock));
				jsonMixinModuleEntries.verify(() -> JsonMixinModuleEntries.create((Consumer) any()), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${b8922a88-0240-38a2-be11-3f61ebcb51a5}
	@Disabled()
	@Test()
	void doWithEntryWhenTypeInstanceOfClass_() {
		/* Branches:
		 * (type instanceof Class<?> clazz) : true  #  inside resolveClassNameIfNecessary method
		 */
		//Arrange Statement(s)
		try (MockedStatic<JsonMixinModuleEntries> jsonMixinModuleEntries = mockStatic(JsonMixinModuleEntries.class)) {
			jsonMixinModuleEntries.when(() -> JsonMixinModuleEntries.create((Consumer) any())).thenReturn(jsonMixinModuleEntriesMock);
			Collection<String> collection = new ArrayList<>();
			JsonMixinModuleEntries target = JsonMixinModuleEntries.scan(applicationContextMock, collection);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			BiConsumer biConsumer = null;
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				target.doWithEntry(classLoader, biConsumer);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				jsonMixinModuleEntries.verify(() -> JsonMixinModuleEntries.create((Consumer) any()));
			});
		}
	}

	//Sapient generated method id: ${d514eab9-9404-35cc-8860-6759e9707398}
	@Disabled()
	@Test()
	void doWithEntryWhenTypeNotInstanceOfClass_() {
		/* Branches:
		 * (type instanceof Class<?> clazz) : false  #  inside resolveClassNameIfNecessary method
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<JsonMixinModuleEntries> jsonMixinModuleEntries = mockStatic(JsonMixinModuleEntries.class)) {
			jsonMixinModuleEntries.when(() -> JsonMixinModuleEntries.create((Consumer) any())).thenReturn(jsonMixinModuleEntriesMock);
			classUtils.when(() -> ClassUtils.resolveClassName(eq("java.lang.String"), (ClassLoader) any())).thenReturn(Object.class);
			Collection<String> collection = new ArrayList<>();
			JsonMixinModuleEntries target = JsonMixinModuleEntries.scan(applicationContextMock, collection);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			BiConsumer biConsumer = null;
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				target.doWithEntry(classLoader, biConsumer);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				jsonMixinModuleEntries.verify(() -> JsonMixinModuleEntries.create((Consumer) any()));
				classUtils.verify(() -> ClassUtils.resolveClassName(eq("java.lang.String"), (ClassLoader) any()), atLeast(2));
			});
		}
	}
}
