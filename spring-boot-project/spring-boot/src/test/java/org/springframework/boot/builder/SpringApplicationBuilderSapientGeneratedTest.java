package org.springframework.boot.builder;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.springframework.core.io.ResourceLoader;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.beans.factory.support.BeanNameGenerator;

import org.mockito.MockitoAnnotations;

import org.springframework.util.StringUtils;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.Banner;

import java.util.Map;
import java.util.HashMap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.SpringApplication;

import java.util.Properties;

import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.boot.BootstrapRegistryInitializer;
import org.springframework.core.metrics.ApplicationStartup;

import org.mockito.MockedStatic;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.ArgumentMatchers.anySet;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringApplicationBuilderSapientGeneratedTest {

	private final SpringApplicationBuilder parentMock = mock(SpringApplicationBuilder.class, "parent");

	private AutoCloseable autoCloseableMocks;

	@InjectMocks()
	private SpringApplicationBuilder target;

	@AfterEach()
	public void afterTest() throws Exception {
		if (autoCloseableMocks != null)
			autoCloseableMocks.close();
	}

	//Sapient generated method id: ${d328fd58-07d5-3414-ad48-bd3b21260b98}, hash: 2756D521CCD6A33340DC9966F8217C09
	@Test()
	void createSpringApplicationTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);

		//Act Statement(s)
		SpringApplication result = target.createSpringApplication(resourceLoaderMock, classArray);

		//Assert statement(s)
		//TODO: Please implement equals method in SpringApplication for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${3e66ad8b-20f0-30cd-a806-cc9ed7e5b825}, hash: 5B6DB936F3FDFB84EA8649A9712A723F
	@Test()
	void contextTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);

		//Act Statement(s)
		ConfigurableApplicationContext result = target.context();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${27046cc6-da25-369e-83c3-98e8427b8452}, hash: 08EDD2B3D727A96ADCF804119BE464B8
	@Test()
	void applicationTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);

		//Act Statement(s)
		SpringApplication result = target.application();

		//Assert statement(s)
		//TODO: Please implement equals method in SpringApplication for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${90770b7b-41f1-3d8e-89cc-353fcd6fd8da}, hash: 48CD1D7ADE8A9516BF9545A37003344C
	@Test()
	void runWhenThisRunningGet() {
		/* Branches:
		 * (this.running.get()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		String[] stringArray = new String[] {};

		//Act Statement(s)
		ConfigurableApplicationContext result = target.run(stringArray);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${7cdf3f6c-ac2b-36cf-80a8-bf6ef2fe2d9a}, hash: 836AFD287F52C2EF293CD19DCA666F0E
	@Test()
	void runWhenThisRunningCompareAndSetFalseTrue() {
		/* Branches:
		 * (this.running.get()) : false
		 * (this.parent != null) : true  #  inside configureAsChildIfNecessary method
		 * (!this.configuredAsChild) : true  #  inside configureAsChildIfNecessary method
		 * (!this.registerShutdownHookApplied) : true  #  inside configureAsChildIfNecessary method
		 * (this.running.compareAndSet(false, true)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = spy(new SpringApplicationBuilder(resourceLoaderMock, classArray));
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		String[] stringArray = new String[] {};
		doReturn(configurableApplicationContextMock).when(parentMock).run(stringArray);
		SpringApplication springApplicationMock = mock(SpringApplication.class);
		doReturn(springApplicationMock).when(target).build();
		ConfigurableApplicationContext configurableApplicationContextMock2 = mock(ConfigurableApplicationContext.class);
		doReturn(configurableApplicationContextMock2).when(springApplicationMock).run(stringArray);

		//Act Statement(s)
		ConfigurableApplicationContext result = target.run(stringArray);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(configurableApplicationContextMock2));
			verify(parentMock).run(stringArray);
			verify(target).build();
			verify(springApplicationMock).run(stringArray);
		});
	}

	//Sapient generated method id: ${c319ea97-f8d0-37c4-a5dd-88e142a90c6d}, hash: F926C7CA9FAFCE588D954255949A8315
	@Test()
	void buildTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = spy(new SpringApplicationBuilder(resourceLoaderMock, classArray));
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		SpringApplication springApplicationMock = mock(SpringApplication.class);
		String[] stringArray = new String[] {};
		doReturn(springApplicationMock).when(target).build(stringArray);

		//Act Statement(s)
		SpringApplication result = target.build();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(springApplicationMock));
			verify(target).build(stringArray);
		});
	}

	//Sapient generated method id: ${fcf842d9-5633-3fb9-b39d-f2a546d672d2}, hash: FE14F033372E31D8F85E1897FED6AB35
	@Test()
	void build1WhenThisNotRegisterShutdownHookApplied() {
		/* Branches:
		 * (this.parent != null) : true  #  inside configureAsChildIfNecessary method
		 * (!this.configuredAsChild) : true  #  inside configureAsChildIfNecessary method
		 * (!this.registerShutdownHookApplied) : true  #  inside configureAsChildIfNecessary method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: application
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		String[] stringArray = new String[] {};
		doReturn(configurableApplicationContextMock).when(parentMock).run(stringArray);

		//Act Statement(s)
		SpringApplication result = target.build(stringArray);

		//Assert statement(s)
		//TODO: Please implement equals method in SpringApplication for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(parentMock).run(stringArray);
		});
	}

	//Sapient generated method id: ${9edf64c4-8f43-3202-945d-12a6bc8ff24d}, hash: 187B7F63548B90501F6AC2A667444FA0
	@Test()
	void childTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: application, child
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		Class<?>[] classArray2 = new Class[] {};

		//Act Statement(s)
		SpringApplicationBuilder result = target.child(classArray2);

		//Assert statement(s)
		//TODO: Please implement equals method in SpringApplicationBuilder for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${4b094faa-bfa9-3ee0-bcad-aee062ac3db1}, hash: ED09BB4E78291310A59D31A33ACFF4FF
	@Test()
	void parentWhenThisParentIsNull() {
		/* Branches:
		 * (this.parent == null) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type SpringApplicationBuilder
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		Class<?>[] classArray2 = new Class[] {};

		//Act Statement(s)
		SpringApplicationBuilder result = target.parent(classArray2);

		//Assert statement(s)
		//TODO: Please implement equals method in SpringApplicationBuilder for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${bcbcac76-965c-3188-9424-a575f2351de1}, hash: 56500CD5BF67A119F7CB1DB064A5AE8D
	@Test()
	void parentWhenThisParentIsNotNull() {
		/* Branches:
		 * (this.parent == null) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		SpringApplicationBuilder parentMock2 = mock(SpringApplicationBuilder.class);
		SpringApplicationBuilder springApplicationBuilderMock = mock(SpringApplicationBuilder.class);
		Class<?>[] classArray2 = new Class[] {};
		doReturn(springApplicationBuilderMock).when(parentMock2).sources(classArray2);

		//Act Statement(s)
		SpringApplicationBuilder result = target.parent(classArray2);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(parentMock2));
			verify(parentMock2, atLeast(1)).sources(classArray2);
		});
	}

	//Sapient generated method id: ${142403f8-dccc-39d7-969e-9bc8e0a3ba8d}, hash: AA7010FF5BAA3BF0E59B5CD417DF83FC
	@Test()
	void parent1ThrowsNullPointerException() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		//Act Statement(s)
		final NullPointerException result = assertThrows(NullPointerException.class, () -> {
			target.parent(configurableApplicationContextMock);
		});

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${59703626-cb8e-3907-9d28-4df897f01c4a}, hash: E6569B594DCF6424EE16527621E90BB3
	@Test()
	void siblingWhenThisParentIsNotNull() {
		/* Branches:
		 * (this.context == null) : true  #  inside runAndExtractParent method
		 * (this.parent != null) : true  #  inside runAndExtractParent method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = spy(new SpringApplicationBuilder(resourceLoaderMock, classArray));
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		String[] stringArray = new String[] {};
		doReturn(configurableApplicationContextMock).when(target).run(stringArray);
		Class<?>[] classArray2 = new Class[] {};

		//Act Statement(s)
		SpringApplicationBuilder result = target.sibling(classArray2);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(target).run(stringArray);
		});
	}

	//Sapient generated method id: ${873d5435-00e7-3660-b58e-70c17674124b}, hash: 141AB0893744AA9141C240990C9D7F9E
	@Test()
	void siblingWhenThisParentIsNullThrowsIllegalStateException() {
		/* Branches:
		 * (this.context == null) : true  #  inside runAndExtractParent method
		 * (this.parent != null) : false  #  inside runAndExtractParent method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = spy(new SpringApplicationBuilder(resourceLoaderMock, classArray));
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		String[] stringArray = new String[] {};
		doReturn(configurableApplicationContextMock).when(target).run(stringArray);
		Class<?>[] classArray2 = new Class[] {};
		IllegalStateException illegalStateException = new IllegalStateException("No parent defined yet (please use the other overloaded parent methods to set one)");
		//Act Statement(s)
		final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
			target.sibling(classArray2);
		});

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
			verify(target).run(stringArray);
		});
	}

	//Sapient generated method id: ${cc2dbd10-53d5-34ca-9dd8-bd0762487b5d}, hash: FBEEA40B0326673AF06C75B1F1ACB825
	@Test()
	void sibling1WhenThisParentIsNotNull() {
		/* Branches:
		 * (this.context == null) : true  #  inside runAndExtractParent method
		 * (this.parent != null) : true  #  inside runAndExtractParent method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = spy(new SpringApplicationBuilder(resourceLoaderMock, classArray));
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		String[] stringArray = new String[] {};
		doReturn(configurableApplicationContextMock).when(target).run(stringArray);
		Class<?>[] classArray2 = new Class[] {};

		//Act Statement(s)
		SpringApplicationBuilder result = target.sibling(classArray2, stringArray);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(target).run(stringArray);
		});
	}

	//Sapient generated method id: ${7001c55f-a8f4-3828-b436-8753b2adeddc}, hash: 1DA87FE118117D86A3EF067260C045F8
	@Test()
	void sibling1WhenThisParentIsNullThrowsIllegalStateException() {
		/* Branches:
		 * (this.context == null) : true  #  inside runAndExtractParent method
		 * (this.parent != null) : false  #  inside runAndExtractParent method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = spy(new SpringApplicationBuilder(resourceLoaderMock, classArray));
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		String[] stringArray = new String[] {};
		doReturn(configurableApplicationContextMock).when(target).run(stringArray);
		Class<?>[] classArray2 = new Class[] {};
		IllegalStateException illegalStateException = new IllegalStateException("No parent defined yet (please use the other overloaded parent methods to set one)");
		//Act Statement(s)
		final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
			target.sibling(classArray2, stringArray);
		});

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
			verify(target).run(stringArray);
		});
	}

	//Sapient generated method id: ${309fa848-98d1-37a7-b066-e0fa5fc96ed6}, hash: 88D4BC5A86AD132D03C64B5381ADC0CC
	@Test()
	void contextFactoryTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		ApplicationContextFactory applicationContextFactoryMock = mock(ApplicationContextFactory.class);

		//Act Statement(s)
		SpringApplicationBuilder result = target.contextFactory(applicationContextFactoryMock);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${128875af-f21b-3458-9e98-d6a82c2646a8}, hash: 3C14C12EFD382580B83222E95F6E8065
	@Test()
	void sourcesTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		Class<?>[] classArray2 = new Class[] {};

		//Act Statement(s)
		SpringApplicationBuilder result = target.sources(classArray2);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${ca3e9a33-3093-3a81-ae63-5f3fa481ee84}, hash: 662B6F4210612466438C439D91A055D5
	@Test()
	void webTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);

		//Act Statement(s)
		SpringApplicationBuilder result = target.web(WebApplicationType.NONE);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${30468886-252c-3988-947a-f444694b9920}, hash: 6F9E40583842534D38D00D3ECFFF3418
	@Test()
	void logStartupInfoTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);

		//Act Statement(s)
		SpringApplicationBuilder result = target.logStartupInfo(false);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${ddf1a563-e46d-3a7b-a2a2-0d51e083b3c7}, hash: E9838CEA5920228A543D190F8B912421
	@Test()
	void bannerTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		Banner bannerMock = mock(Banner.class);

		//Act Statement(s)
		SpringApplicationBuilder result = target.banner(bannerMock);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${e7883b3b-ee72-3e33-b2f4-08b42712a4eb}, hash: A3912277205A788FDEE63424D35DC082
	@Test()
	void bannerModeTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);

		//Act Statement(s)
		SpringApplicationBuilder result = target.bannerMode(Banner.Mode.OFF);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${12fcd0c9-9d90-3767-a1c9-84d859b90dc6}, hash: 13EEC7AEE93E2A73D931A0F4CA7819D5
	@Test()
	void headlessTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);

		//Act Statement(s)
		SpringApplicationBuilder result = target.headless(false);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${d5677af8-91e7-39d2-b67e-2d5761466fb2}, hash: 01F2A26CA5FFB7DC471A59C91D8A3DB8
	@Test()
	void registerShutdownHookTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);

		//Act Statement(s)
		SpringApplicationBuilder result = target.registerShutdownHook(false);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${b9f578a4-802c-3759-8f23-6bfd68fd311b}, hash: 30B1A293E7451D63AD5E6BB0C76B88CB
	@Test()
	void mainTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);

		//Act Statement(s)
		SpringApplicationBuilder result = target.main(Object.class);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${b32a1ad1-954e-35fb-9184-c0595a27f53a}, hash: 3F76B44F3A79EA67EFB76EE970DD6739
	@Test()
	void addCommandLinePropertiesTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);

		//Act Statement(s)
		SpringApplicationBuilder result = target.addCommandLineProperties(false);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${7dde1cb1-cb7b-3137-8d4b-acfe0f01b80a}, hash: 1C31C9BD08D46319C3A037CEBD80D6CB
	@Test()
	void setAddConversionServiceTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);

		//Act Statement(s)
		SpringApplicationBuilder result = target.setAddConversionService(false);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${7a567995-faa8-3e43-85fb-47f2d1dbef8c}, hash: E59765A727CEEA5B7E8657F1CCBB2511
	@Test()
	void addBootstrapRegistryInitializerTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: application
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		BootstrapRegistryInitializer bootstrapRegistryInitializerMock = mock(BootstrapRegistryInitializer.class);

		//Act Statement(s)
		SpringApplicationBuilder result = target.addBootstrapRegistryInitializer(bootstrapRegistryInitializerMock);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${8969bb91-8b8b-31fc-b7ab-e3a35dcdd372}, hash: AA691221295C564D06ACE51236546BD3
	@Test()
	void lazyInitializationTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);

		//Act Statement(s)
		SpringApplicationBuilder result = target.lazyInitialization(false);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${5d0cb8c8-9a2c-3cfd-87f9-06967a06b4b3}, hash: C7A50D514E8010F17163FDE76B351381
	@Test()
	void propertiesWhenIndexNotGreaterThan0() {
		/* Branches:
		 * (for-each(properties)) : true  #  inside getMapFromKeyValuePairs method
		 * (for-each(candidates)) : true  #  inside lowestIndexOf method
		 * (candidateIndex > 0) : false  #  inside lowestIndexOf method
		 * (index > 0) : false  #  inside getMapFromKeyValuePairs method
		 * (index > 0) : false  #  inside getMapFromKeyValuePairs method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = spy(new SpringApplicationBuilder(resourceLoaderMock, classArray));
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		SpringApplicationBuilder springApplicationBuilderMock = mock(SpringApplicationBuilder.class);
		Map<String, Object> stringObjectMap = new HashMap<>();
		stringObjectMap.put("=", "");
		doReturn(springApplicationBuilderMock).when(target).properties(eq(stringObjectMap));
		String[] stringArray = new String[] { "=" };

		//Act Statement(s)
		SpringApplicationBuilder result = target.properties(stringArray);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(springApplicationBuilderMock));
			verify(target).properties(eq(stringObjectMap));
		});
	}

	//Sapient generated method id: ${739e3f81-8055-3124-8d63-e40a2871141c}, hash: D0A9D6774FF68E7536C106B3A8487E68
	@Test()
	void propertiesWhenIndexGreaterThan0() {
		/* Branches:
		 * (for-each(properties)) : true  #  inside getMapFromKeyValuePairs method
		 * (for-each(candidates)) : true  #  inside lowestIndexOf method
		 * (candidateIndex > 0) : true  #  inside lowestIndexOf method
		 * (index != -1) : false  #  inside lowestIndexOf method
		 * (index > 0) : true  #  inside getMapFromKeyValuePairs method
		 * (index > 0) : true  #  inside getMapFromKeyValuePairs method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = spy(new SpringApplicationBuilder(resourceLoaderMock, classArray));
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		SpringApplicationBuilder springApplicationBuilderMock = mock(SpringApplicationBuilder.class);
		Map<String, Object> stringObjectMap = new HashMap<>();
		stringObjectMap.put("A", "::");
		doReturn(springApplicationBuilderMock).when(target).properties(eq(stringObjectMap));
		String[] stringArray = new String[] { "A=::" };

		//Act Statement(s)
		SpringApplicationBuilder result = target.properties(stringArray);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(springApplicationBuilderMock));
			verify(target).properties(eq(stringObjectMap));
		});
	}

	//Sapient generated method id: ${d6387c93-c7b5-3e51-95e6-13dd6e77a8a1}, hash: 1633FCBFBB22B097535F064740A1650B
	@Test()
	void properties1WhenCollectionsListPropertiesPropertyNamesIsNotEmpty() {
		/* Branches:
		 * (for-each(Collections.list(properties.propertyNames()))) : true  #  inside getMapFromProperties method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = spy(new SpringApplicationBuilder(resourceLoaderMock, classArray));
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		SpringApplicationBuilder springApplicationBuilderMock = mock(SpringApplicationBuilder.class);
		Object object = new Object();
		Map<String, Object> stringObjectMap = new HashMap<>();
		stringObjectMap.put("defaultPropertiesItem1Key1", object);
		doReturn(springApplicationBuilderMock).when(target).properties(eq(stringObjectMap));
		Properties properties = new Properties();
		properties.put("defaultPropertiesItem1Key1", object);

		//Act Statement(s)
		SpringApplicationBuilder result = target.properties(properties);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(springApplicationBuilderMock));
			verify(target).properties(eq(stringObjectMap));
		});
	}

	//Sapient generated method id: ${259ed713-4f9b-3a80-a509-1b5f1054f79c}, hash: C9272091F23EAB09AEBC9D591157E19F
	@Test()
	void properties2WhenThisParentIsNotNull() {
		/* Branches:
		 * (this.parent != null) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: application
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		SpringApplicationBuilder parentMock2 = mock(SpringApplicationBuilder.class);
		SpringApplicationBuilder springApplicationBuilderMock = mock(SpringApplicationBuilder.class);
		Map<String, Object> stringObjectMap = new HashMap<>();
		doReturn(springApplicationBuilderMock).when(parentMock2).properties(eq(stringObjectMap));
		SpringApplicationBuilder springApplicationBuilderMock2 = mock(SpringApplicationBuilder.class);
		doReturn(springApplicationBuilderMock2).when(parentMock2).environment((ConfigurableEnvironment) null);
		Map<String, Object> stringObjectMap2 = new HashMap<>();

		//Act Statement(s)
		SpringApplicationBuilder result = target.properties(stringObjectMap2);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(target));
			verify(parentMock2, atLeast(1)).properties(eq(stringObjectMap));
			verify(parentMock2, atLeast(1)).environment((ConfigurableEnvironment) null);
		});
	}

	//Sapient generated method id: ${32890405-c521-3186-a0b4-54047b452aa6}, hash: D914AAC45EFDAF9DC3927ED6337FC04C
	@Test()
	void profilesTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: application
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			String[] stringArray = new String[] {};
			stringUtils.when(() -> StringUtils.toStringArray(anySet())).thenReturn(stringArray);
			Class<?>[] classArray = new Class[] {};
			target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			String[] stringArray2 = new String[] {};
			//Act Statement(s)
			SpringApplicationBuilder result = target.profiles(stringArray2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(target));
				stringUtils.verify(() -> StringUtils.toStringArray(anySet()));
			});
		}
	}

	//Sapient generated method id: ${c606a8ab-7b23-3d95-8d15-a30be474618e}, hash: 4FDDBD1757E5B203B793102AD671B14D
	@Test()
	void beanNameGeneratorTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		BeanNameGenerator beanNameGeneratorMock = mock(BeanNameGenerator.class);

		//Act Statement(s)
		SpringApplicationBuilder result = target.beanNameGenerator(beanNameGeneratorMock);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${c7d3a088-abbb-37bc-9c42-d108bb0f1df3}, hash: 275099DEF469F9AB11AE014FDCC0FEEB
	@Test()
	void environmentTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);

		//Act Statement(s)
		SpringApplicationBuilder result = target.environment(configurableEnvironmentMock);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${df4d06ce-099e-3549-8f12-f91fefdfddf4}, hash: FB41789765B74D582FFFA93A8C79B52E
	@Test()
	void environmentPrefixTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);

		//Act Statement(s)
		SpringApplicationBuilder result = target.environmentPrefix("environmentPrefix1");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${9eeeb03c-8805-33f9-81ea-72a50b42c4a0}, hash: 503459E78DE6F599EE3BDEC4279A730A
	@Test()
	void resourceLoaderTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		ResourceLoader resourceLoaderMock2 = mock(ResourceLoader.class);

		//Act Statement(s)
		SpringApplicationBuilder result = target.resourceLoader(resourceLoaderMock2);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${281e1cb8-202f-3703-b3b3-04b784b363dc}, hash: 838AFF67324CF4EA4CE78159068D22E9
	@Test()
	void initializersTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: application
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		ApplicationContextInitializer<?>[] applicationContextInitializerArray = new ApplicationContextInitializer[] {};

		//Act Statement(s)
		SpringApplicationBuilder result = target.initializers(applicationContextInitializerArray);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${26f260f6-b8ec-3918-b30e-0556355e0b8a}, hash: 786F8203867CC1A810364DC17D456046
	@Test()
	void listenersTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: application
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		ApplicationListener<?>[] applicationListenerArray = new ApplicationListener[] {};

		//Act Statement(s)
		SpringApplicationBuilder result = target.listeners(applicationListenerArray);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${1c9d1c4a-61ec-3609-b201-aac1ed30c798}, hash: 5B602202BD0514EB6C39CDDDB142599A
	@Test()
	void applicationStartupTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		ApplicationStartup applicationStartupMock = mock(ApplicationStartup.class);

		//Act Statement(s)
		SpringApplicationBuilder result = target.applicationStartup(applicationStartupMock);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${a20cad7c-f3f6-3a0f-ba7d-5fd32d36ef8f}, hash: 729C700961C0BFEB8E314EC9772E407A
	@Test()
	void allowCircularReferencesTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.SpringApplication
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
		Class<?>[] classArray = new Class[] {};
		target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);

		//Act Statement(s)
		SpringApplicationBuilder result = target.allowCircularReferences(false);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(target)));
	}
}
