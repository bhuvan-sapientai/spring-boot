/*
 * Copyright 2012-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.context.properties;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import org.springframework.beans.BeansException;

import java.util.LinkedHashMap;

import org.springframework.aop.support.AopUtils;
import org.springframework.util.Assert;
import org.springframework.core.annotation.MergedAnnotations;

import java.util.Map;
import java.util.HashMap;

import org.springframework.context.ConfigurableApplicationContext;

import org.mockito.stubbing.Answer;

import java.lang.reflect.Method;
import java.lang.annotation.Annotation;

import org.springframework.core.ResolvableType;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.context.properties.bind.Bindable;

import java.util.function.Supplier;

import org.springframework.core.annotation.MergedAnnotation;

import org.mockito.MockedStatic;

import org.springframework.validation.annotation.Validated;
import org.springframework.boot.context.properties.bind.BindMethod;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertiesBeanSapientGeneratedTest {

	private final Bindable<?> bindTargetMock = mock(Bindable.class, "bindTarget");

	private final ApplicationContext applicationContextMock = mock(ApplicationContext.class);

	private final Bindable bindableMock = mock(Bindable.class);

	private final Bindable<Object> bindableMock2 = mock(Bindable.class);

	private final Bindable<Object> bindableMock3 = mock(Bindable.class);

	private final Bindable<Object> bindableMock4 = mock(Bindable.class);

	private final ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);

	private final ConfigurationProperties configurationPropertiesMock = mock(ConfigurationProperties.class);

	private final MergedAnnotation<Annotation> mergedAnnotationMock = mock(MergedAnnotation.class);

	private final MergedAnnotation<Annotation> mergedAnnotationMock2 = mock(MergedAnnotation.class);

	private final MergedAnnotation<Annotation> mergedAnnotationMock3 = mock(MergedAnnotation.class);

	private final MergedAnnotation<Annotation> mergedAnnotationMock4 = mock(MergedAnnotation.class);

	private final MergedAnnotation<Annotation> mergedAnnotationMock5 = mock(MergedAnnotation.class);

	private final MergedAnnotation<Annotation> mergedAnnotationMock6 = mock(MergedAnnotation.class);

	private final MergedAnnotation<Annotation> mergedAnnotationMock7 = mock(MergedAnnotation.class);

	private final MergedAnnotation<Annotation> mergedAnnotationMock8 = mock(MergedAnnotation.class);

	private final MergedAnnotations mergedAnnotationsMock = mock(MergedAnnotations.class);

	private final MergedAnnotations mergedAnnotationsMock2 = mock(MergedAnnotations.class);

	private final MergedAnnotations mergedAnnotationsMock3 = mock(MergedAnnotations.class);

	private final MergedAnnotations mergedAnnotationsMock4 = mock(MergedAnnotations.class);

	private final MergedAnnotations mergedAnnotationsMock5 = mock(MergedAnnotations.class);

	private final MergedAnnotations mergedAnnotationsMock6 = mock(MergedAnnotations.class);

	private final Method methodMock = mock(Method.class);

	private final ResolvableType resolvableTypeMock = mock(ResolvableType.class);

	private final Validated validatedMock = mock(Validated.class);

	//Sapient generated method id: ${13368fac-223f-37ba-a843-3c9b25e276be}, hash: 2CF55C807DB179CD06973B1EA03E4EE2
	@Test()
	@Disabled
	void getTypeTest() throws NoSuchElementException {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<MergedAnnotations> mergedAnnotations = mockStatic(MergedAnnotations.class);
			 MockedStatic<AopUtils> aopUtils = mockStatic(AopUtils.class);
			 MockedStatic<MergedAnnotation> mergedAnnotation = mockStatic(MergedAnnotation.class);
			 MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
			resolvableType.when(() -> ResolvableType.forMethodReturnType(methodMock)).thenReturn(resolvableTypeMock);
			mergedAnnotation.when(() -> MergedAnnotation.missing()).thenReturn(mergedAnnotationMock);
			mergedAnnotations.when(() -> MergedAnnotations.from(methodMock, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock);
			doReturn(mergedAnnotationMock2).when(mergedAnnotationsMock).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock2).isPresent();
			doReturn(mergedAnnotationMock3).when(mergedAnnotationsMock2).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock3).isPresent();
			Object object = new Object();
			aopUtils.when(() -> AopUtils.isAopProxy(object)).thenReturn(true);
			aopUtils.when(() -> AopUtils.getTargetClass(object)).thenReturn(Object.class);
			mergedAnnotations.when(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock2).thenReturn(mergedAnnotationsMock3);
			doReturn(mergedAnnotationMock4).when(mergedAnnotationsMock3).get(Annotation.class);
			doReturn(true).when(mergedAnnotationMock4).isPresent();
			doReturn(null).when(mergedAnnotationMock4).synthesize();
			ConfigurationPropertiesBean target = ConfigurationPropertiesBean.get(configurableApplicationContextMock, object, "beanName1");
			//Act Statement(s)
			Class<?> result = target.getType();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Object.class));
				resolvableType.verify(() -> ResolvableType.forMethodReturnType(methodMock), atLeast(1));
				mergedAnnotation.verify(() -> MergedAnnotation.missing(), atLeast(1));
				mergedAnnotations.verify(() -> MergedAnnotations.from(methodMock, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(1));
				verify(mergedAnnotationsMock).get(Annotation.class);
				verify(mergedAnnotationMock2).isPresent();
				mergedAnnotations.verify(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(2));
				verify(mergedAnnotationsMock2).get(Annotation.class);
				verify(mergedAnnotationMock3).isPresent();
				aopUtils.verify(() -> AopUtils.isAopProxy(object), atLeast(1));
				aopUtils.verify(() -> AopUtils.getTargetClass(object), atLeast(1));
				verify(mergedAnnotationsMock3).get(Annotation.class);
				verify(mergedAnnotationMock4).isPresent();
				verify(mergedAnnotationMock4).synthesize();
			});
		}
	}

	//Sapient generated method id: ${43f6554e-3df6-3d8d-8e42-81c52fff7a95}, hash: 8AE097B993F4CA1D4A341F85AAD3102C
	@Test()
	@Disabled
	void getAnnotationTest() throws NoSuchElementException {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<MergedAnnotations> mergedAnnotations = mockStatic(MergedAnnotations.class);
			 MockedStatic<AopUtils> aopUtils = mockStatic(AopUtils.class);
			 MockedStatic<MergedAnnotation> mergedAnnotation = mockStatic(MergedAnnotation.class);
			 MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
			resolvableType.when(() -> ResolvableType.forMethodReturnType(methodMock)).thenReturn(resolvableTypeMock);
			mergedAnnotation.when(() -> MergedAnnotation.missing()).thenReturn(mergedAnnotationMock);
			mergedAnnotations.when(() -> MergedAnnotations.from(methodMock, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock);
			doReturn(mergedAnnotationMock2).when(mergedAnnotationsMock).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock2).isPresent();
			doReturn(mergedAnnotationMock3).when(mergedAnnotationsMock2).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock3).isPresent();
			Object object = new Object();
			aopUtils.when(() -> AopUtils.isAopProxy(object)).thenReturn(true);
			aopUtils.when(() -> AopUtils.getTargetClass(object)).thenReturn(Object.class);
			mergedAnnotations.when(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock2).thenReturn(mergedAnnotationsMock3);
			doReturn(mergedAnnotationMock4).when(mergedAnnotationsMock3).get(Annotation.class);
			doReturn(true).when(mergedAnnotationMock4).isPresent();
			doReturn(null).when(mergedAnnotationMock4).synthesize();
			ConfigurationPropertiesBean target = ConfigurationPropertiesBean.get(configurableApplicationContextMock, object, "beanName1");
			doReturn(configurationPropertiesMock).when(bindTargetMock).getAnnotation(ConfigurationProperties.class);
			//Act Statement(s)
			ConfigurationProperties result = target.getAnnotation();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertiesMock));
				resolvableType.verify(() -> ResolvableType.forMethodReturnType(methodMock), atLeast(1));
				mergedAnnotation.verify(() -> MergedAnnotation.missing(), atLeast(1));
				mergedAnnotations.verify(() -> MergedAnnotations.from(methodMock, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(1));
				verify(mergedAnnotationsMock).get(Annotation.class);
				verify(mergedAnnotationMock2).isPresent();
				mergedAnnotations.verify(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(2));
				verify(mergedAnnotationsMock2).get(Annotation.class);
				verify(mergedAnnotationMock3).isPresent();
				aopUtils.verify(() -> AopUtils.isAopProxy(object), atLeast(1));
				aopUtils.verify(() -> AopUtils.getTargetClass(object), atLeast(1));
				verify(mergedAnnotationsMock3).get(Annotation.class);
				verify(mergedAnnotationMock4).isPresent();
				verify(mergedAnnotationMock4).synthesize();
				verify(bindTargetMock).getAnnotation(ConfigurationProperties.class);
			});
		}
	}

	//Sapient generated method id: ${79719c1b-729d-33eb-96d6-4f4edceef32f}, hash: 2F9C27898F5EB69C498F6AE7899D3B69
	@Test()
	@Disabled
	void asBindTargetTest() throws NoSuchElementException {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<MergedAnnotations> mergedAnnotations = mockStatic(MergedAnnotations.class);
			 MockedStatic<AopUtils> aopUtils = mockStatic(AopUtils.class);
			 MockedStatic<MergedAnnotation> mergedAnnotation = mockStatic(MergedAnnotation.class);
			 MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
			resolvableType.when(() -> ResolvableType.forMethodReturnType(methodMock)).thenReturn(resolvableTypeMock);
			mergedAnnotation.when(() -> MergedAnnotation.missing()).thenReturn(mergedAnnotationMock);
			mergedAnnotations.when(() -> MergedAnnotations.from(methodMock, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock);
			doReturn(mergedAnnotationMock2).when(mergedAnnotationsMock).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock2).isPresent();
			doReturn(mergedAnnotationMock3).when(mergedAnnotationsMock2).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock3).isPresent();
			Object object = new Object();
			aopUtils.when(() -> AopUtils.isAopProxy(object)).thenReturn(true);
			aopUtils.when(() -> AopUtils.getTargetClass(object)).thenReturn(Object.class);
			mergedAnnotations.when(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock2).thenReturn(mergedAnnotationsMock3);
			doReturn(mergedAnnotationMock4).when(mergedAnnotationsMock3).get(Annotation.class);
			doReturn(true).when(mergedAnnotationMock4).isPresent();
			doReturn(null).when(mergedAnnotationMock4).synthesize();
			ConfigurationPropertiesBean target = ConfigurationPropertiesBean.get(configurableApplicationContextMock, object, "beanName1");
			//Act Statement(s)
			Bindable<?> result = target.asBindTarget();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindTargetMock));
				resolvableType.verify(() -> ResolvableType.forMethodReturnType(methodMock), atLeast(1));
				mergedAnnotation.verify(() -> MergedAnnotation.missing(), atLeast(1));
				mergedAnnotations.verify(() -> MergedAnnotations.from(methodMock, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(1));
				verify(mergedAnnotationsMock).get(Annotation.class);
				verify(mergedAnnotationMock2).isPresent();
				mergedAnnotations.verify(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(2));
				verify(mergedAnnotationsMock2).get(Annotation.class);
				verify(mergedAnnotationMock3).isPresent();
				aopUtils.verify(() -> AopUtils.isAopProxy(object), atLeast(1));
				aopUtils.verify(() -> AopUtils.getTargetClass(object), atLeast(1));
				verify(mergedAnnotationsMock3).get(Annotation.class);
				verify(mergedAnnotationMock4).isPresent();
				verify(mergedAnnotationMock4).synthesize();
			});
		}
	}

	//Sapient generated method id: ${70911d7e-d002-324c-a42c-245e3bbae264}, hash: 75427FB35D784CFBCFC317CE49E74F9A
	@Test()
	@Disabled
	void getAllWhenApplicationContextInstanceOfConfigurableApplicationContext() {
		/* Branches:
		 * (applicationContext instanceof ConfigurableApplicationContext configurableContext) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(configurableApplicationContextMock, "ApplicationContext must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			Map<String, ConfigurationPropertiesBean> result = ConfigurationPropertiesBean.getAll((ApplicationContext) configurableApplicationContextMock);
			Map<String, ConfigurationPropertiesBean> stringConfigurationPropertiesBeanResultMap = new HashMap<>();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(stringConfigurationPropertiesBeanResultMap));
				_assert.verify(() -> Assert.notNull(configurableApplicationContextMock, "ApplicationContext must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${5c52fa14-ad74-3141-a69e-7272698e46a4}, hash: BC9C426B593B4C5DD1258E48CD0C4263
	@Test()
	void getAllWhenPropertiesBeanIsNotNull() throws BeansException {
		/* Branches:
		 * (applicationContext instanceof ConfigurableApplicationContext configurableContext) : false
		 * (propertiesBean != null) : true  #  inside lambda$getAll$0 method
		 */
		//Arrange Statement(s)
		ConfigurationPropertiesBean configurationPropertiesBeanMock = mock(ConfigurationPropertiesBean.class);
		try (MockedStatic<ConfigurationPropertiesBean> configurationPropertiesBean = mockStatic(ConfigurationPropertiesBean.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Object object = new Object();
			Map<String, Object> stringObjectMap = new HashMap<>();
			stringObjectMap.put("return_of_getBeansWithAnnotationItem1Key1", object);
			doReturn(stringObjectMap).when(applicationContextMock).getBeansWithAnnotation(ConfigurationProperties.class);
			_assert.when(() -> Assert.notNull(applicationContextMock, "ApplicationContext must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertiesBean.when(() -> ConfigurationPropertiesBean.get(applicationContextMock, object, "return_of_getBeansWithAnnotationItem1Key1")).thenReturn(configurationPropertiesBeanMock);
			//Act Statement(s)
			Map<String, ConfigurationPropertiesBean> result = ConfigurationPropertiesBean.getAll(applicationContextMock);
			Map<String, ConfigurationPropertiesBean> stringConfigurationPropertiesBeanResultMap = new LinkedHashMap<>();
			stringConfigurationPropertiesBeanResultMap.put("return_of_getBeansWithAnnotationItem1Key1", configurationPropertiesBeanMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(stringConfigurationPropertiesBeanResultMap));
				verify(applicationContextMock, atLeast(1)).getBeansWithAnnotation(ConfigurationProperties.class);
				_assert.verify(() -> Assert.notNull(applicationContextMock, "ApplicationContext must not be null"), atLeast(1));
				configurationPropertiesBean.verify(() -> ConfigurationPropertiesBean.get(applicationContextMock, object, "return_of_getBeansWithAnnotationItem1Key1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${12c12dc2-b5d0-3995-bae7-657947ba9469}, hash: 73AD50871DAC1CC0B3119D41454536D0
	@Test()
	void getWhenAnnotationsIsNullAndBindTargetIsNull() {
		/* Branches:
		 * (applicationContext instanceof ConfigurableApplicationContext configurableContext) : false  #  inside findFactoryMethod method
		 * (factoryMethod != null) : false  #  inside createBindTarget method
		 * (factory != null) : false  #  inside findAnnotation method
		 * (!annotation.isPresent()) : false  #  inside findAnnotation method
		 * (!annotation.isPresent()) : false  #  inside findAnnotation method
		 * (annotation.isPresent()) : false  #  inside findAnnotation method
		 * (annotation == null) : true  #  inside findAnnotations method
		 * (annotations != null) : false  #  inside createBindTarget method
		 * (bindTarget == null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<MergedAnnotation> mergedAnnotation = mockStatic(MergedAnnotation.class);
			 MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
			resolvableType.when(() -> ResolvableType.forClass(Object.class)).thenReturn(resolvableTypeMock);
			mergedAnnotation.when(() -> MergedAnnotation.missing()).thenReturn(mergedAnnotationMock);
			doReturn(true, true, false).when(mergedAnnotationMock).isPresent();
			Object object = new Object();
			//Act Statement(s)
			ConfigurationPropertiesBean result = ConfigurationPropertiesBean.get(applicationContextMock, object, "beanName1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				resolvableType.verify(() -> ResolvableType.forClass(Object.class), atLeast(1));
				mergedAnnotation.verify(() -> MergedAnnotation.missing(), atLeast(1));
				verify(mergedAnnotationMock, times(3)).isPresent();
			});
		}
	}

	//Sapient generated method id: ${a5ac177e-1e9f-3f08-848c-87c2786e90b6}, hash: 29B6AC1AB6793B84AE52437FAFE8C053
	@Test()
	@Disabled
	void getWhenAnnotationNotIsPresentAndAnnotationIsNullAndAnnotationsIsNullAndBindTargetIsNull() {
		/* Branches:
		 * (applicationContext instanceof ConfigurableApplicationContext configurableContext) : true  #  inside findFactoryMethod method
		 * (factoryMethod != null) : true  #  inside createBindTarget method
		 * (factory != null) : true  #  inside findAnnotation method
		 * (element != null) : true  #  inside findMergedAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (!annotation.isPresent()) : false  #  inside findAnnotation method
		 * (annotation.isPresent()) : false  #  inside findAnnotation method
		 * (annotation == null) : true  #  inside findAnnotations method
		 * (annotations != null) : false  #  inside createBindTarget method
		 * (bindTarget == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<MergedAnnotation> mergedAnnotation = mockStatic(MergedAnnotation.class);
			 MockedStatic<MergedAnnotations> mergedAnnotations = mockStatic(MergedAnnotations.class);
			 MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
			resolvableType.when(() -> ResolvableType.forMethodReturnType(methodMock)).thenReturn(resolvableTypeMock);
			mergedAnnotations.when(() -> MergedAnnotations.from(methodMock, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock);
			doReturn(mergedAnnotationMock2).when(mergedAnnotationsMock).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock2).isPresent();
			mergedAnnotation.when(() -> MergedAnnotation.missing()).thenReturn(mergedAnnotationMock).thenReturn(mergedAnnotationMock3);
			doReturn(true, false).when(mergedAnnotationMock3).isPresent();
			Object object = new Object();
			//Act Statement(s)
			ConfigurationPropertiesBean result = ConfigurationPropertiesBean.get(configurableApplicationContextMock, object, "beanName1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				resolvableType.verify(() -> ResolvableType.forMethodReturnType(methodMock), atLeast(1));
				mergedAnnotation.verify(() -> MergedAnnotation.missing(), atLeast(2));
				mergedAnnotations.verify(() -> MergedAnnotations.from(methodMock, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(1));
				verify(mergedAnnotationsMock).get(Annotation.class);
				verify(mergedAnnotationMock2).isPresent();
				verify(mergedAnnotationMock3, times(2)).isPresent();
			});
		}
	}

	//Sapient generated method id: ${c217fa2d-dd5c-33e2-bcf9-1e5a49da1865}, hash: 05E20A098182E6B10ADB018ADD050799
	@Test()
	@Disabled
	void getWhenAnnotationIsPresentAndAnnotationIsNotNullAndValidatedIsNullAndAnnotationsIsNullAndBindTargetIsNull() throws NoSuchElementException {
		/* Branches:
		 * (applicationContext instanceof ConfigurableApplicationContext configurableContext) : true  #  inside findFactoryMethod method
		 * (factoryMethod != null) : true  #  inside createBindTarget method
		 * (factory != null) : true  #  inside findAnnotation method
		 * (element != null) : true  #  inside findMergedAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (AopUtils.isAopProxy(instance)) : true  #  inside findAnnotation method
		 * (annotation.isPresent()) : true  #  inside findAnnotation method
		 * (annotation == null) : false  #  inside findAnnotations method
		 * (validated != null) : false  #  inside findAnnotations method
		 * (annotations != null) : false  #  inside createBindTarget method
		 * (bindTarget == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<MergedAnnotations> mergedAnnotations = mockStatic(MergedAnnotations.class);
			 MockedStatic<AopUtils> aopUtils = mockStatic(AopUtils.class);
			 MockedStatic<MergedAnnotation> mergedAnnotation = mockStatic(MergedAnnotation.class);
			 MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
			resolvableType.when(() -> ResolvableType.forMethodReturnType(methodMock)).thenReturn(resolvableTypeMock);
			doReturn(mergedAnnotationMock2).when(mergedAnnotationsMock).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock2).isPresent();
			doReturn(mergedAnnotationMock3).when(mergedAnnotationsMock2).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock3).isPresent();
			Object object = new Object();
			aopUtils.when(() -> AopUtils.isAopProxy(object)).thenReturn(true);
			aopUtils.when(() -> AopUtils.getTargetClass(object)).thenReturn(Object.class);
			doReturn(mergedAnnotationMock4).when(mergedAnnotationsMock3).get(Annotation.class);
			doReturn(true).when(mergedAnnotationMock4).isPresent();
			doReturn(configurationPropertiesMock).when(mergedAnnotationMock4).synthesize();
			mergedAnnotation.when(() -> MergedAnnotation.missing()).thenReturn(mergedAnnotationMock).thenReturn(mergedAnnotationMock5);
			mergedAnnotations.when(() -> MergedAnnotations.from(methodMock, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock).thenReturn(mergedAnnotationsMock4);
			doReturn(mergedAnnotationMock6).when(mergedAnnotationsMock4).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock6).isPresent();
			doReturn(mergedAnnotationMock7).when(mergedAnnotationsMock5).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock7).isPresent();
			mergedAnnotations.when(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock2).thenReturn(mergedAnnotationsMock3).thenReturn(mergedAnnotationsMock5).thenReturn(mergedAnnotationsMock6);
			doReturn(mergedAnnotationMock8).when(mergedAnnotationsMock6).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock8).isPresent();
			//Act Statement(s)
			ConfigurationPropertiesBean result = ConfigurationPropertiesBean.get(configurableApplicationContextMock, object, "beanName1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				resolvableType.verify(() -> ResolvableType.forMethodReturnType(methodMock), atLeast(1));
				mergedAnnotation.verify(() -> MergedAnnotation.missing(), atLeast(2));
				mergedAnnotations.verify(() -> MergedAnnotations.from(methodMock, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(2));
				verify(mergedAnnotationsMock).get(Annotation.class);
				verify(mergedAnnotationMock2).isPresent();
				mergedAnnotations.verify(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(4));
				verify(mergedAnnotationsMock2).get(Annotation.class);
				verify(mergedAnnotationMock3).isPresent();
				aopUtils.verify(() -> AopUtils.isAopProxy(object), atLeast(2));
				aopUtils.verify(() -> AopUtils.getTargetClass(object), atLeast(2));
				verify(mergedAnnotationsMock3).get(Annotation.class);
				verify(mergedAnnotationMock4).isPresent();
				verify(mergedAnnotationMock4).synthesize();
				verify(mergedAnnotationsMock4).get(Annotation.class);
				verify(mergedAnnotationMock6).isPresent();
				verify(mergedAnnotationsMock5).get(Annotation.class);
				verify(mergedAnnotationMock7).isPresent();
				verify(mergedAnnotationsMock6).get(Annotation.class);
				verify(mergedAnnotationMock8).isPresent();
			});
		}
	}

	//Sapient generated method id: ${637d1cad-af51-34ef-a495-f09082b3a8cb}, hash: AC99E1C8EB0D383F3024043083CC6903
	@Test()
	@Disabled
	void getWhenBindTargetIsNotNull() throws NoSuchElementException {
		/* Branches:
		 * (applicationContext instanceof ConfigurableApplicationContext configurableContext) : true  #  inside findFactoryMethod method
		 * (factoryMethod != null) : true  #  inside createBindTarget method
		 * (factory != null) : true  #  inside findAnnotation method
		 * (element != null) : true  #  inside findMergedAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (AopUtils.isAopProxy(instance)) : true  #  inside findAnnotation method
		 * (annotation.isPresent()) : true  #  inside findAnnotation method
		 * (annotation == null) : false  #  inside findAnnotations method
		 * (validated != null) : true  #  inside findAnnotations method
		 * (annotations != null) : true  #  inside createBindTarget method
		 * (bindTarget == null) : false
		 * (bindTarget.getBindMethod() == null) : true
		 * (factoryMethod != null) : true
		 * (bindTarget.getBindMethod() != VALUE_OBJECT_BIND_METHOD) : true
		 * (bindTarget != null) : true  #  inside create method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Bindable<Object> bindableMock5 = mock(Bindable.class);
		try (MockedStatic<BindMethodAttribute> bindMethodAttribute = mockStatic(BindMethodAttribute.class);
			 MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
			 MockedStatic<MergedAnnotations> mergedAnnotations = mockStatic(MergedAnnotations.class);
			 MockedStatic<AopUtils> aopUtils = mockStatic(AopUtils.class);
			 MockedStatic<MergedAnnotation> mergedAnnotation = mockStatic(MergedAnnotation.class);
			 MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
			resolvableType.when(() -> ResolvableType.forMethodReturnType(methodMock)).thenReturn(resolvableTypeMock);
			doReturn(mergedAnnotationMock2).when(mergedAnnotationsMock).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock2).isPresent();
			doReturn(mergedAnnotationMock3).when(mergedAnnotationsMock2).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock3).isPresent();
			Object object = new Object();
			aopUtils.when(() -> AopUtils.isAopProxy(object)).thenReturn(true);
			aopUtils.when(() -> AopUtils.getTargetClass(object)).thenReturn(Object.class);
			doReturn(mergedAnnotationMock4).when(mergedAnnotationsMock3).get(Annotation.class);
			doReturn(true).when(mergedAnnotationMock4).isPresent();
			doReturn(configurationPropertiesMock).when(mergedAnnotationMock4).synthesize();
			mergedAnnotation.when(() -> MergedAnnotation.missing()).thenReturn(mergedAnnotationMock).thenReturn(mergedAnnotationMock5);
			mergedAnnotations.when(() -> MergedAnnotations.from(methodMock, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock).thenReturn(mergedAnnotationsMock4);
			doReturn(mergedAnnotationMock6).when(mergedAnnotationsMock4).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock6).isPresent();
			doReturn(mergedAnnotationMock7).when(mergedAnnotationsMock5).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock7).isPresent();
			mergedAnnotations.when(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock2).thenReturn(mergedAnnotationsMock3).thenReturn(mergedAnnotationsMock5).thenReturn(mergedAnnotationsMock6);
			doReturn(mergedAnnotationMock8).when(mergedAnnotationsMock6).get(Annotation.class);
			doReturn(true).when(mergedAnnotationMock8).isPresent();
			doReturn(validatedMock).when(mergedAnnotationMock8).synthesize();
			bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
			Annotation[] annotationArray = new Annotation[] { configurationPropertiesMock, validatedMock };
			doReturn(bindableMock2).when(bindableMock).withAnnotations(annotationArray);
			doReturn(bindableMock3).when(bindableMock2).withBindMethod(BindMethod.JAVA_BEAN);
			doReturn(null).when(bindableMock3).getBindMethod();
			doReturn(bindableMock4).when(bindableMock3).withBindMethod(BindMethod.JAVA_BEAN);
			doReturn(BindMethod.JAVA_BEAN).when(bindableMock4).getBindMethod();
			doReturn(bindableMock5).when(bindableMock4).withExistingValue(object);
			bindMethodAttribute.when(() -> BindMethodAttribute.get(configurableApplicationContextMock, "beanName1")).thenReturn(BindMethod.JAVA_BEAN);
			//Act Statement(s)
			ConfigurationPropertiesBean result = ConfigurationPropertiesBean.get(configurableApplicationContextMock, object, "beanName1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				resolvableType.verify(() -> ResolvableType.forMethodReturnType(methodMock), atLeast(1));
				mergedAnnotation.verify(() -> MergedAnnotation.missing(), atLeast(2));
				mergedAnnotations.verify(() -> MergedAnnotations.from(methodMock, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(2));
				verify(mergedAnnotationsMock).get(Annotation.class);
				verify(mergedAnnotationMock2).isPresent();
				mergedAnnotations.verify(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(4));
				verify(mergedAnnotationsMock2).get(Annotation.class);
				verify(mergedAnnotationMock3).isPresent();
				aopUtils.verify(() -> AopUtils.isAopProxy(object), atLeast(2));
				aopUtils.verify(() -> AopUtils.getTargetClass(object), atLeast(2));
				verify(mergedAnnotationsMock3).get(Annotation.class);
				verify(mergedAnnotationMock4).isPresent();
				verify(mergedAnnotationMock4).synthesize();
				verify(mergedAnnotationsMock4).get(Annotation.class);
				verify(mergedAnnotationMock6).isPresent();
				verify(mergedAnnotationsMock5).get(Annotation.class);
				verify(mergedAnnotationMock7).isPresent();
				verify(mergedAnnotationsMock6).get(Annotation.class);
				verify(mergedAnnotationMock8).isPresent();
				verify(mergedAnnotationMock8).synthesize();
				bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
				verify(bindableMock).withAnnotations(annotationArray);
				verify(bindableMock2).withBindMethod(BindMethod.JAVA_BEAN);
				verify(bindableMock3).getBindMethod();
				verify(bindableMock3).withBindMethod(BindMethod.JAVA_BEAN);
				verify(bindableMock4).getBindMethod();
				verify(bindableMock4).withExistingValue(object);
				bindMethodAttribute.verify(() -> BindMethodAttribute.get(configurableApplicationContextMock, "beanName1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${887517c9-64c2-3659-842a-c08c0e93f3fc}, hash: 506188679E9D6C87BFD7C606D6BB9562
	@Test()
	@Disabled
	void getWhenFactoryMethodIsNotNullAndBindTargetGetBindMethodNotEqualsVALUE_OBJECT_BIND_METHODAndBindTargetIsNull() throws NoSuchElementException {
		/* Branches:
		 * (applicationContext instanceof ConfigurableApplicationContext configurableContext) : true  #  inside findFactoryMethod method
		 * (factoryMethod != null) : true  #  inside createBindTarget method
		 * (factory != null) : true  #  inside findAnnotation method
		 * (element != null) : true  #  inside findMergedAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (AopUtils.isAopProxy(instance)) : true  #  inside findAnnotation method
		 * (annotation.isPresent()) : true  #  inside findAnnotation method
		 * (annotation == null) : false  #  inside findAnnotations method
		 * (validated != null) : true  #  inside findAnnotations method
		 * (annotations != null) : true  #  inside createBindTarget method
		 * (bindTarget == null) : false
		 * (bindTarget.getBindMethod() == null) : true
		 * (factoryMethod != null) : true
		 * (bindTarget.getBindMethod() != VALUE_OBJECT_BIND_METHOD) : true
		 * (bindTarget != null) : false  #  inside create method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<BindMethodAttribute> bindMethodAttribute = mockStatic(BindMethodAttribute.class);
			 MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
			 MockedStatic<MergedAnnotations> mergedAnnotations = mockStatic(MergedAnnotations.class);
			 MockedStatic<AopUtils> aopUtils = mockStatic(AopUtils.class);
			 MockedStatic<MergedAnnotation> mergedAnnotation = mockStatic(MergedAnnotation.class);
			 MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
			resolvableType.when(() -> ResolvableType.forMethodReturnType(methodMock)).thenReturn(resolvableTypeMock);
			doReturn(mergedAnnotationMock2).when(mergedAnnotationsMock).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock2).isPresent();
			doReturn(mergedAnnotationMock3).when(mergedAnnotationsMock2).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock3).isPresent();
			Object object = new Object();
			aopUtils.when(() -> AopUtils.isAopProxy(object)).thenReturn(true);
			aopUtils.when(() -> AopUtils.getTargetClass(object)).thenReturn(Object.class);
			doReturn(mergedAnnotationMock4).when(mergedAnnotationsMock3).get(Annotation.class);
			doReturn(true).when(mergedAnnotationMock4).isPresent();
			doReturn(configurationPropertiesMock).when(mergedAnnotationMock4).synthesize();
			mergedAnnotation.when(() -> MergedAnnotation.missing()).thenReturn(mergedAnnotationMock).thenReturn(mergedAnnotationMock5);
			mergedAnnotations.when(() -> MergedAnnotations.from(methodMock, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock).thenReturn(mergedAnnotationsMock4);
			doReturn(mergedAnnotationMock6).when(mergedAnnotationsMock4).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock6).isPresent();
			doReturn(mergedAnnotationMock7).when(mergedAnnotationsMock5).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock7).isPresent();
			mergedAnnotations.when(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock2).thenReturn(mergedAnnotationsMock3).thenReturn(mergedAnnotationsMock5).thenReturn(mergedAnnotationsMock6);
			doReturn(mergedAnnotationMock8).when(mergedAnnotationsMock6).get(Annotation.class);
			doReturn(true).when(mergedAnnotationMock8).isPresent();
			doReturn(validatedMock).when(mergedAnnotationMock8).synthesize();
			bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
			Annotation[] annotationArray = new Annotation[] { configurationPropertiesMock, validatedMock };
			doReturn(bindableMock2).when(bindableMock).withAnnotations(annotationArray);
			doReturn(bindableMock3).when(bindableMock2).withBindMethod(BindMethod.JAVA_BEAN);
			doReturn(null).when(bindableMock3).getBindMethod();
			doReturn(bindableMock4).when(bindableMock3).withBindMethod(BindMethod.JAVA_BEAN);
			doReturn(BindMethod.JAVA_BEAN).when(bindableMock4).getBindMethod();
			doReturn(null).when(bindableMock4).withExistingValue(object);
			bindMethodAttribute.when(() -> BindMethodAttribute.get(configurableApplicationContextMock, "beanName1")).thenReturn(BindMethod.JAVA_BEAN);
			//Act Statement(s)
			ConfigurationPropertiesBean result = ConfigurationPropertiesBean.get(configurableApplicationContextMock, object, "beanName1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				resolvableType.verify(() -> ResolvableType.forMethodReturnType(methodMock), atLeast(1));
				mergedAnnotation.verify(() -> MergedAnnotation.missing(), atLeast(2));
				mergedAnnotations.verify(() -> MergedAnnotations.from(methodMock, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(2));
				verify(mergedAnnotationsMock).get(Annotation.class);
				verify(mergedAnnotationMock2).isPresent();
				mergedAnnotations.verify(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(4));
				verify(mergedAnnotationsMock2).get(Annotation.class);
				verify(mergedAnnotationMock3).isPresent();
				aopUtils.verify(() -> AopUtils.isAopProxy(object), atLeast(2));
				aopUtils.verify(() -> AopUtils.getTargetClass(object), atLeast(2));
				verify(mergedAnnotationsMock3).get(Annotation.class);
				verify(mergedAnnotationMock4).isPresent();
				verify(mergedAnnotationMock4).synthesize();
				verify(mergedAnnotationsMock4).get(Annotation.class);
				verify(mergedAnnotationMock6).isPresent();
				verify(mergedAnnotationsMock5).get(Annotation.class);
				verify(mergedAnnotationMock7).isPresent();
				verify(mergedAnnotationsMock6).get(Annotation.class);
				verify(mergedAnnotationMock8).isPresent();
				verify(mergedAnnotationMock8).synthesize();
				bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
				verify(bindableMock).withAnnotations(annotationArray);
				verify(bindableMock2).withBindMethod(BindMethod.JAVA_BEAN);
				verify(bindableMock3).getBindMethod();
				verify(bindableMock3).withBindMethod(BindMethod.JAVA_BEAN);
				verify(bindableMock4).getBindMethod();
				verify(bindableMock4).withExistingValue(object);
				bindMethodAttribute.verify(() -> BindMethodAttribute.get(configurableApplicationContextMock, "beanName1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${d81450c2-9069-330f-81f8-f528c58e5380}, hash: CDF3CBBD3389F641AAF326EF4426E1A9
	@Test()
	void forValueObjectWhenAnnotationIsNullAndAnnotationsIsNullAndBindTargetIsNullThrowsNullPointerException() {
		/* Branches:
		 * (factoryMethod != null) : false  #  inside createBindTarget method
		 * (factory != null) : false  #  inside findAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (element != null) : false  #  inside findMergedAnnotation method
		 * (!annotation.isPresent()) : false  #  inside findAnnotation method
		 * (annotation.isPresent()) : false  #  inside findAnnotation method
		 * (annotation == null) : true  #  inside findAnnotations method
		 * (annotations != null) : false  #  inside createBindTarget method
		 * (bindTarget != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<MergedAnnotation> mergedAnnotation = mockStatic(MergedAnnotation.class);
			 MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
			resolvableType.when(() -> ResolvableType.forClass((Class) null)).thenReturn(resolvableTypeMock);
			doReturn(false).when(mergedAnnotationMock).isPresent();
			mergedAnnotation.when(() -> MergedAnnotation.missing()).thenReturn(mergedAnnotationMock).thenReturn(mergedAnnotationMock2);
			doReturn(true, false).when(mergedAnnotationMock2).isPresent();
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			Class<?> _class = null;
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				ConfigurationPropertiesBean.forValueObject(_class, "beanName1");
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				resolvableType.verify(() -> ResolvableType.forClass((Class) null), atLeast(1));
				mergedAnnotation.verify(() -> MergedAnnotation.missing(), atLeast(2));
				verify(mergedAnnotationMock).isPresent();
				verify(mergedAnnotationMock2, times(2)).isPresent();
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${d439e3bf-5ce0-3e81-a115-af3bff13d275}, hash: 4B65FDC96340AF2841C23D47DCDE0D9E
	@Test()
	@Disabled
	void forValueObjectWhenValidatedIsNullAndAnnotationsIsNullAndBindTargetIsNull5ThrowsNullPointerException() throws NoSuchElementException {
		/* Branches:
		 * (factoryMethod != null) : false  #  inside createBindTarget method
		 * (factory != null) : false  #  inside findAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (element != null) : true  #  inside findMergedAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (AopUtils.isAopProxy(instance)) : true  #  inside findAnnotation method
		 * (annotation.isPresent()) : true  #  inside findAnnotation method
		 * (annotation == null) : false  #  inside findAnnotations method
		 * (validated != null) : false  #  inside findAnnotations method
		 * (annotations != null) : false  #  inside createBindTarget method
		 * (bindTarget != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<MergedAnnotations> mergedAnnotations = mockStatic(MergedAnnotations.class);
			 MockedStatic<AopUtils> aopUtils = mockStatic(AopUtils.class);
			 MockedStatic<MergedAnnotation> mergedAnnotation = mockStatic(MergedAnnotation.class);
			 MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
			resolvableType.when(() -> ResolvableType.forClass(Object.class)).thenReturn(resolvableTypeMock);
			doReturn(false).when(mergedAnnotationMock).isPresent();
			doReturn(mergedAnnotationMock2).when(mergedAnnotationsMock).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock2).isPresent();
			aopUtils.when(() -> AopUtils.isAopProxy((Object) null)).thenReturn(true);
			aopUtils.when(() -> AopUtils.getTargetClass((Object) null)).thenReturn(Object.class);
			doReturn(mergedAnnotationMock3).when(mergedAnnotationsMock2).get(Annotation.class);
			doReturn(true).when(mergedAnnotationMock3).isPresent();
			doReturn(configurationPropertiesMock).when(mergedAnnotationMock3).synthesize();
			mergedAnnotation.when(() -> MergedAnnotation.missing()).thenReturn(mergedAnnotationMock).thenReturn(mergedAnnotationMock4);
			doReturn(false).when(mergedAnnotationMock4).isPresent();
			doReturn(mergedAnnotationMock5).when(mergedAnnotationsMock3).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock5).isPresent();
			mergedAnnotations.when(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock).thenReturn(mergedAnnotationsMock2).thenReturn(mergedAnnotationsMock3).thenReturn(mergedAnnotationsMock4);
			doReturn(mergedAnnotationMock6).when(mergedAnnotationsMock4).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock6).isPresent();
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				ConfigurationPropertiesBean.forValueObject(Object.class, "beanName1");
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				resolvableType.verify(() -> ResolvableType.forClass(Object.class), atLeast(1));
				mergedAnnotation.verify(() -> MergedAnnotation.missing(), atLeast(2));
				verify(mergedAnnotationMock).isPresent();
				mergedAnnotations.verify(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(4));
				verify(mergedAnnotationsMock).get(Annotation.class);
				verify(mergedAnnotationMock2).isPresent();
				aopUtils.verify(() -> AopUtils.isAopProxy((Object) null), atLeast(2));
				aopUtils.verify(() -> AopUtils.getTargetClass((Object) null), atLeast(2));
				verify(mergedAnnotationsMock2).get(Annotation.class);
				verify(mergedAnnotationMock3).isPresent();
				verify(mergedAnnotationMock3).synthesize();
				verify(mergedAnnotationMock4).isPresent();
				verify(mergedAnnotationsMock3).get(Annotation.class);
				verify(mergedAnnotationMock5).isPresent();
				verify(mergedAnnotationsMock4).get(Annotation.class);
				verify(mergedAnnotationMock6).isPresent();
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${df3a9861-4cbd-304c-accd-ffd439c79297}, hash: 66256FFBBCB1FE1633222938F79A2FAD
	@Test()
	@Disabled
	void forValueObjectWhenBindTargetIsNotNull() throws NoSuchElementException {
		/* Branches:
		 * (factoryMethod != null) : false  #  inside createBindTarget method
		 * (factory != null) : false  #  inside findAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (element != null) : true  #  inside findMergedAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (AopUtils.isAopProxy(instance)) : true  #  inside findAnnotation method
		 * (annotation.isPresent()) : true  #  inside findAnnotation method
		 * (annotation == null) : false  #  inside findAnnotations method
		 * (validated != null) : true  #  inside findAnnotations method
		 * (annotations != null) : true  #  inside createBindTarget method
		 * (bindTarget != null) : true
		 * (deduceBindMethod(bindTarget) == VALUE_OBJECT_BIND_METHOD) : true
		 * (bindTarget != null) : true  #  inside create method
		 */
		//Arrange Statement(s)
		Bindable bindableMock3 = mock(Bindable.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ConfigurationPropertiesBean> configurationPropertiesBean = mockStatic(ConfigurationPropertiesBean.class, CALLS_REAL_METHODS);
			 MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
			 MockedStatic<MergedAnnotations> mergedAnnotations = mockStatic(MergedAnnotations.class);
			 MockedStatic<AopUtils> aopUtils = mockStatic(AopUtils.class);
			 MockedStatic<MergedAnnotation> mergedAnnotation = mockStatic(MergedAnnotation.class);
			 MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
			resolvableType.when(() -> ResolvableType.forClass(Object.class)).thenReturn(resolvableTypeMock);
			doReturn(false).when(mergedAnnotationMock).isPresent();
			doReturn(mergedAnnotationMock2).when(mergedAnnotationsMock).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock2).isPresent();
			aopUtils.when(() -> AopUtils.isAopProxy((Object) null)).thenReturn(true);
			aopUtils.when(() -> AopUtils.getTargetClass((Object) null)).thenReturn(Object.class);
			doReturn(mergedAnnotationMock3).when(mergedAnnotationsMock2).get(Annotation.class);
			doReturn(true).when(mergedAnnotationMock3).isPresent();
			doReturn(configurationPropertiesMock).when(mergedAnnotationMock3).synthesize();
			mergedAnnotation.when(() -> MergedAnnotation.missing()).thenReturn(mergedAnnotationMock).thenReturn(mergedAnnotationMock4);
			doReturn(false).when(mergedAnnotationMock4).isPresent();
			doReturn(mergedAnnotationMock5).when(mergedAnnotationsMock3).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock5).isPresent();
			mergedAnnotations.when(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock).thenReturn(mergedAnnotationsMock2).thenReturn(mergedAnnotationsMock3).thenReturn(mergedAnnotationsMock4);
			doReturn(mergedAnnotationMock6).when(mergedAnnotationsMock4).get(Annotation.class);
			doReturn(true).when(mergedAnnotationMock6).isPresent();
			doReturn(validatedMock).when(mergedAnnotationMock6).synthesize();
			bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
			Annotation[] annotationArray = new Annotation[] { configurationPropertiesMock, validatedMock };
			doReturn(bindableMock2).when(bindableMock).withAnnotations(annotationArray);
			doReturn(bindableMock3).when(bindableMock2).withBindMethod(BindMethod.VALUE_OBJECT);
			configurationPropertiesBean.when(() -> ConfigurationPropertiesBean.deduceBindMethod(bindableMock2)).thenReturn(BindMethod.VALUE_OBJECT);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			ConfigurationPropertiesBean result = ConfigurationPropertiesBean.forValueObject(Object.class, "beanName1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				resolvableType.verify(() -> ResolvableType.forClass(Object.class), atLeast(1));
				mergedAnnotation.verify(() -> MergedAnnotation.missing(), atLeast(2));
				verify(mergedAnnotationMock, atLeast(1)).isPresent();
				mergedAnnotations.verify(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(4));
				verify(mergedAnnotationsMock, atLeast(1)).get(Annotation.class);
				verify(mergedAnnotationMock2, atLeast(1)).isPresent();
				aopUtils.verify(() -> AopUtils.isAopProxy((Object) null), atLeast(2));
				aopUtils.verify(() -> AopUtils.getTargetClass((Object) null), atLeast(2));
				verify(mergedAnnotationsMock2, atLeast(1)).get(Annotation.class);
				verify(mergedAnnotationMock3, atLeast(1)).isPresent();
				verify(mergedAnnotationMock3, atLeast(1)).synthesize();
				verify(mergedAnnotationMock4, atLeast(1)).isPresent();
				verify(mergedAnnotationsMock3, atLeast(1)).get(Annotation.class);
				verify(mergedAnnotationMock5, atLeast(1)).isPresent();
				verify(mergedAnnotationsMock4, atLeast(1)).get(Annotation.class);
				verify(mergedAnnotationMock6, atLeast(1)).isPresent();
				verify(mergedAnnotationMock6, atLeast(1)).synthesize();
				bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
				verify(bindableMock, atLeast(1)).withAnnotations(annotationArray);
				verify(bindableMock2, atLeast(1)).withBindMethod(BindMethod.VALUE_OBJECT);
				configurationPropertiesBean.verify(() -> ConfigurationPropertiesBean.deduceBindMethod(bindableMock2), atLeast(1));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a237d700-8cc3-3ae6-a384-c70691414ff2}, hash: B9F67C138A0B3B670E05AE44B3C1A38F
	@Test()
	@Disabled
	void forValueObjectWhenBindTargetIsNull() throws NoSuchElementException {
		/* Branches:
		 * (factoryMethod != null) : false  #  inside createBindTarget method
		 * (factory != null) : false  #  inside findAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (element != null) : true  #  inside findMergedAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (AopUtils.isAopProxy(instance)) : true  #  inside findAnnotation method
		 * (annotation.isPresent()) : true  #  inside findAnnotation method
		 * (annotation == null) : false  #  inside findAnnotations method
		 * (validated != null) : true  #  inside findAnnotations method
		 * (annotations != null) : true  #  inside createBindTarget method
		 * (bindTarget != null) : true
		 * (deduceBindMethod(bindTarget) == VALUE_OBJECT_BIND_METHOD) : true
		 * (bindTarget != null) : false  #  inside create method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ConfigurationPropertiesBean> configurationPropertiesBean = mockStatic(ConfigurationPropertiesBean.class, CALLS_REAL_METHODS);
			 MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
			 MockedStatic<MergedAnnotations> mergedAnnotations = mockStatic(MergedAnnotations.class);
			 MockedStatic<AopUtils> aopUtils = mockStatic(AopUtils.class);
			 MockedStatic<MergedAnnotation> mergedAnnotation = mockStatic(MergedAnnotation.class);
			 MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
			resolvableType.when(() -> ResolvableType.forClass(Object.class)).thenReturn(resolvableTypeMock);
			doReturn(false).when(mergedAnnotationMock).isPresent();
			doReturn(mergedAnnotationMock2).when(mergedAnnotationsMock).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock2).isPresent();
			aopUtils.when(() -> AopUtils.isAopProxy((Object) null)).thenReturn(true);
			aopUtils.when(() -> AopUtils.getTargetClass((Object) null)).thenReturn(Object.class);
			doReturn(mergedAnnotationMock3).when(mergedAnnotationsMock2).get(Annotation.class);
			doReturn(true).when(mergedAnnotationMock3).isPresent();
			doReturn(configurationPropertiesMock).when(mergedAnnotationMock3).synthesize();
			mergedAnnotation.when(() -> MergedAnnotation.missing()).thenReturn(mergedAnnotationMock).thenReturn(mergedAnnotationMock4);
			doReturn(false).when(mergedAnnotationMock4).isPresent();
			doReturn(mergedAnnotationMock5).when(mergedAnnotationsMock3).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock5).isPresent();
			mergedAnnotations.when(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock).thenReturn(mergedAnnotationsMock2).thenReturn(mergedAnnotationsMock3).thenReturn(mergedAnnotationsMock4);
			doReturn(mergedAnnotationMock6).when(mergedAnnotationsMock4).get(Annotation.class);
			doReturn(true).when(mergedAnnotationMock6).isPresent();
			doReturn(validatedMock).when(mergedAnnotationMock6).synthesize();
			bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
			Annotation[] annotationArray = new Annotation[] { configurationPropertiesMock, validatedMock };
			doReturn(bindableMock2).when(bindableMock).withAnnotations(annotationArray);
			doReturn(null).when(bindableMock2).withBindMethod(BindMethod.VALUE_OBJECT);
			configurationPropertiesBean.when(() -> ConfigurationPropertiesBean.deduceBindMethod(bindableMock2)).thenReturn(BindMethod.VALUE_OBJECT);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			ConfigurationPropertiesBean result = ConfigurationPropertiesBean.forValueObject(Object.class, "beanName1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				resolvableType.verify(() -> ResolvableType.forClass(Object.class), atLeast(1));
				mergedAnnotation.verify(() -> MergedAnnotation.missing(), atLeast(2));
				verify(mergedAnnotationMock, atLeast(1)).isPresent();
				mergedAnnotations.verify(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(4));
				verify(mergedAnnotationsMock, atLeast(1)).get(Annotation.class);
				verify(mergedAnnotationMock2, atLeast(1)).isPresent();
				aopUtils.verify(() -> AopUtils.isAopProxy((Object) null), atLeast(2));
				aopUtils.verify(() -> AopUtils.getTargetClass((Object) null), atLeast(2));
				verify(mergedAnnotationsMock2, atLeast(1)).get(Annotation.class);
				verify(mergedAnnotationMock3, atLeast(1)).isPresent();
				verify(mergedAnnotationMock3, atLeast(1)).synthesize();
				verify(mergedAnnotationMock4, atLeast(1)).isPresent();
				verify(mergedAnnotationsMock3, atLeast(1)).get(Annotation.class);
				verify(mergedAnnotationMock5, atLeast(1)).isPresent();
				verify(mergedAnnotationsMock4, atLeast(1)).get(Annotation.class);
				verify(mergedAnnotationMock6, atLeast(1)).isPresent();
				verify(mergedAnnotationMock6, atLeast(1)).synthesize();
				bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
				verify(bindableMock, atLeast(1)).withAnnotations(annotationArray);
				verify(bindableMock2, atLeast(1)).withBindMethod(BindMethod.VALUE_OBJECT);
				configurationPropertiesBean.verify(() -> ConfigurationPropertiesBean.deduceBindMethod(bindableMock2), atLeast(1));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${91beec94-4b36-3fb4-b0bb-7dad6b775c0d}, hash: FD6478B022EA9A753BF343A133F6CC14
	@Test()
	@Disabled
	void deduceBindMethodWhenBindConstructorIsNotNull() {
		/* Branches:
		 * (bindConstructor != null) : true  #  inside deduceBindMethod method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: DEFAULT
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */

		//Act Statement(s)
		BindMethod result = ConfigurationPropertiesBean.deduceBindMethod(Object.class);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(BindMethod.VALUE_OBJECT)));
	}

	//Sapient generated method id: ${f10ba781-66e7-3c18-8fab-d6c748dddcd6}, hash: BB2BCFDDA118B3A6827D174CC0BEAEF9
	@Test()
	void deduceBindMethodWhenBindConstructorIsNull() {
		/* Branches:
		 * (bindConstructor != null) : false  #  inside deduceBindMethod method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: DEFAULT
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */

		//Act Statement(s)
		BindMethod result = ConfigurationPropertiesBean.deduceBindMethod(Object.class);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(BindMethod.JAVA_BEAN)));
	}

	//Sapient generated method id: ${09ff049a-d721-397c-b356-d42e6fb8f3ab}, hash: 21403AE5AADDB8C9D651DD5679966C7C
	@Test()
	@Disabled
	void deduceBindMethod1WhenBindConstructorIsNotNull() {
		/* Branches:
		 * (bindConstructor != null) : true  #  inside deduceBindMethod method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: DEFAULT
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Bindable<Object> bindableMock = mock(Bindable.class);

		//Act Statement(s)
		BindMethod result = ConfigurationPropertiesBean.deduceBindMethod(bindableMock);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(BindMethod.VALUE_OBJECT)));
	}

	//Sapient generated method id: ${a1b381ac-175b-3317-8c0d-5a6003d5f0eb}, hash: D9FD6CC4883C2AF98B6CDD4FAE30C604
	@Test()
	@Disabled
	void deduceBindMethod1WhenBindConstructorIsNull() {
		/* Branches:
		 * (bindConstructor != null) : false  #  inside deduceBindMethod method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: DEFAULT
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Bindable<Object> bindableMock = mock(Bindable.class);

		//Act Statement(s)
		BindMethod result = ConfigurationPropertiesBean.deduceBindMethod(bindableMock);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(BindMethod.JAVA_BEAN)));
	}
}
