package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.ResourceLoader;

import org.mockito.stubbing.Answer;

import org.springframework.util.ClassUtils;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.util.Assert;
import org.springframework.core.io.Resource;

import org.mockito.MockedStatic;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;

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

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BeanDefinitionLoaderSapientGeneratedTest {

	private final BeanDefinitionRegistry beanDefinitionRegistryMock = mock(BeanDefinitionRegistry.class);

	//Sapient generated method id: ${006bc943-b1d1-3339-b148-d3c8a55b51c1}, hash: 7ABBEFF372649D500FCC2515CE0AA58B
	@Test()
	void setBeanNameGeneratorTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: scanner
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		BeanNameGenerator beanNameGeneratorMock = mock(BeanNameGenerator.class);
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			Object[] objectArray = new Object[] { object };
			_assert.when(() -> Assert.notEmpty(objectArray, "Sources must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
			classUtils.when(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null)).thenReturn(true);
			BeanDefinitionLoader target = new BeanDefinitionLoader(beanDefinitionRegistryMock, objectArray);
			//Act Statement(s)
			target.setBeanNameGenerator(beanNameGeneratorMock);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notEmpty(objectArray, "Sources must not be empty"), atLeast(1));
				classUtils.verify(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${2a4d4666-3ec6-3350-bbd2-d61740db6402}, hash: DD86694209DEEA9FC4EE20B7293010F2
	@Test()
	void setResourceLoaderTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: scanner
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			Object[] objectArray = new Object[] { object };
			_assert.when(() -> Assert.notEmpty(objectArray, "Sources must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
			classUtils.when(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null)).thenReturn(true);
			BeanDefinitionLoader target = new BeanDefinitionLoader(beanDefinitionRegistryMock, objectArray);
			//Act Statement(s)
			target.setResourceLoader(resourceLoaderMock);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notEmpty(objectArray, "Sources must not be empty"), atLeast(1));
				classUtils.verify(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${62e170bc-1441-3662-bd95-fcc548180549}, hash: 6E1B120A02E003F0D66CD0277A4553DA
	@Test()
	void setEnvironmentTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: annotatedReader, scanner
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			Object[] objectArray = new Object[] { object };
			_assert.when(() -> Assert.notEmpty(objectArray, "Sources must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
			classUtils.when(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null)).thenReturn(true);
			BeanDefinitionLoader target = new BeanDefinitionLoader(beanDefinitionRegistryMock, objectArray);
			//Act Statement(s)
			target.setEnvironment(configurableEnvironmentMock);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notEmpty(objectArray, "Sources must not be empty"), atLeast(1));
				classUtils.verify(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${442b156d-d33e-3192-aa24-f1eda1c7042b}, hash: 60E6BA7A5F4607657B88D06521768203
	@Test()
	void loadWhenSourceInstanceOfClass_() {
		/* Branches:
		 * (for-each(this.sources)) : true
		 * (source instanceof Class<?> clazz) : true  #  inside load method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: scanner
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			_assert.when(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object[] objectArray = new Object[] { Object.class };
			_assert.when(() -> Assert.notEmpty(objectArray, "Sources must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
			classUtils.when(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null)).thenReturn(true);
			_assert.when(() -> Assert.notNull(Object.class, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			BeanDefinitionLoader target = new BeanDefinitionLoader(beanDefinitionRegistryMock, objectArray);
			//Act Statement(s)
			target.load();
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notEmpty(objectArray, "Sources must not be empty"), atLeast(1));
				classUtils.verify(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null), atLeast(1));
				_assert.verify(() -> Assert.notNull(Object.class, "Source must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a45347a5-aef5-313b-8ce7-a25e13c3ac9e}, hash: 770E30DEA44809CFC4C36151EC8AFAA5
	@Test()
	void loadWhenSourceInstanceOfResource() {
		/* Branches:
		 * (for-each(this.sources)) : true
		 * (source instanceof Class<?> clazz) : false  #  inside load method
		 * (source instanceof Resource resource) : true  #  inside load method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: scanner
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Resource resourceMock = mock(Resource.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			_assert.when(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object[] objectArray = new Object[] { resourceMock };
			_assert.when(() -> Assert.notEmpty(objectArray, "Sources must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
			classUtils.when(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null)).thenReturn(true);
			_assert.when(() -> Assert.notNull(resourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			BeanDefinitionLoader target = new BeanDefinitionLoader(beanDefinitionRegistryMock, objectArray);
			//Act Statement(s)
			target.load();
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notEmpty(objectArray, "Sources must not be empty"), atLeast(1));
				classUtils.verify(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null), atLeast(1));
				_assert.verify(() -> Assert.notNull(resourceMock, "Source must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4eff4ec8-be18-3ade-b4d5-ac300699a7a1}, hash: 1F2F1F36EB849A37C6321AC3B164071F
	@Test()
	void loadWhenSourceInstanceOfPackage() {
		/* Branches:
		 * (for-each(this.sources)) : true
		 * (source instanceof Class<?> clazz) : false  #  inside load method
		 * (source instanceof Resource resource) : false  #  inside load method
		 * (source instanceof Package pack) : true  #  inside load method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: scanner
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			_assert.when(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Package _package = Package.getPackage("name1");
			Object[] objectArray = new Object[] { _package };
			_assert.when(() -> Assert.notEmpty(objectArray, "Sources must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
			classUtils.when(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null)).thenReturn(true);
			_assert.when(() -> Assert.notNull((Package) any(), eq("Source must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			BeanDefinitionLoader target = new BeanDefinitionLoader(beanDefinitionRegistryMock, objectArray);
			//Act Statement(s)
			target.load();
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notEmpty(objectArray, "Sources must not be empty"), atLeast(1));
				classUtils.verify(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null), atLeast(1));
				_assert.verify(() -> Assert.notNull((Package) any(), eq("Source must not be null")));
			});
		}
	}

	//Sapient generated method id: ${9389f8f9-cb6a-3063-aadc-d094b0e9471a}, hash: D40207FDF3DB70E3108A18E01A533883
	@Test()
	void loadWhenSourceInstanceOfCharSequence() {
		/* Branches:
		 * (for-each(this.sources)) : true
		 * (source instanceof Class<?> clazz) : false  #  inside load method
		 * (source instanceof Resource resource) : false  #  inside load method
		 * (source instanceof Package pack) : false  #  inside load method
		 * (source instanceof CharSequence sequence) : true  #  inside load method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: scanner
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			_assert.when(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object[] objectArray = new Object[] { "load_object1" };
			_assert.when(() -> Assert.notEmpty(objectArray, "Sources must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
			classUtils.when(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null)).thenReturn(true);
			_assert.when(() -> Assert.notNull("load_object1", "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			BeanDefinitionLoader target = new BeanDefinitionLoader(beanDefinitionRegistryMock, objectArray);
			//Act Statement(s)
			target.load();
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notEmpty(objectArray, "Sources must not be empty"), atLeast(1));
				classUtils.verify(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null), atLeast(1));
				_assert.verify(() -> Assert.notNull("load_object1", "Source must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${d6ca9c0e-c8d6-3f33-8e98-43916bf75a6f}, hash: A5CD599EC59DAE69D09C4F9AABE04614
	@Test()
	void loadWhenSourceNotInstanceOfCharSequenceThrowsIllegalArgumentException() {
		/* Branches:
		 * (for-each(this.sources)) : true
		 * (source instanceof Class<?> clazz) : false  #  inside load method
		 * (source instanceof Resource resource) : false  #  inside load method
		 * (source instanceof Package pack) : false  #  inside load method
		 * (source instanceof CharSequence sequence) : false  #  inside load method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: scanner
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			_assert.when(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			Object[] objectArray = new Object[] { object };
			_assert.when(() -> Assert.notEmpty(objectArray, "Sources must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
			classUtils.when(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null)).thenReturn(true);
			BeanDefinitionLoader target = new BeanDefinitionLoader(beanDefinitionRegistryMock, objectArray);
			//Act Statement(s)
			final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
				target.load();
			});
			IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid source type class java.lang.Object");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
				_assert.verify(() -> Assert.notNull(beanDefinitionRegistryMock, "Registry must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notEmpty(objectArray, "Sources must not be empty"), atLeast(1));
				classUtils.verify(() -> ClassUtils.isPresent("groovy.lang.MetaClass", null), atLeast(1));
			});
		}
	}
}
