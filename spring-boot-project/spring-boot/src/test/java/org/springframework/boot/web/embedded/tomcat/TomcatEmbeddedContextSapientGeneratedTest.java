package org.springframework.boot.web.embedded.tomcat;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import org.springframework.util.ClassUtils;

import org.mockito.MockitoAnnotations;
import org.apache.catalina.Container;
import org.apache.catalina.session.ManagerBase;
import org.apache.catalina.Loader;
import org.mockito.MockedStatic;
import org.apache.tomcat.util.compat.JreCompat;
import org.apache.catalina.Manager;
import org.apache.catalina.SessionIdGenerator;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class TomcatEmbeddedContextSapientGeneratedTest {

	private AutoCloseable autoCloseableMocks;

	@InjectMocks()
	private TomcatEmbeddedContext target;

	@AfterEach()
	public void afterTest() throws Exception {
		if (autoCloseableMocks != null)
			autoCloseableMocks.close();
	}

	//Sapient generated method id: ${3f0efe92-d056-30c3-9f3d-29186ed9589c}, hash: 69FEDB59FD2845B1C89B6DD51FC6D884
	@Test()
	void loadOnStartupTest() {
		//Arrange Statement(s)
		target = new TomcatEmbeddedContext();
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		Container[] containerArray = new Container[] {};
		//Act Statement(s)
		boolean result = target.loadOnStartup(containerArray);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${24c1a64d-5d08-387d-978e-1fb3bf79e7c5}, hash: 6460C40302766B6D3E65478F96E8A3AC
	@Test()
	void setManagerWhenManagerInstanceOfManagerBase() {
		/* Branches:
		 * (manager instanceof ManagerBase) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: support - Method: firePropertyChange
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ManagerBase managerMock = mock(ManagerBase.class);
		doNothing().when(managerMock).setSessionIdGenerator((SessionIdGenerator) any());
		target = new TomcatEmbeddedContext();
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		doNothing().when(managerMock).setContext(target);
		//Act Statement(s)
		target.setManager(managerMock);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(managerMock).setSessionIdGenerator((SessionIdGenerator) any());
			verify(managerMock).setContext(target);
		});
	}

	//Sapient generated method id: ${887882fe-5779-30ce-98ea-ba30c65bd5c7}, hash: F0FBEBC3A7F2EA22D60D062064824764
	@Test()
	void setManagerWhenManagerInstanceOfManagerBase2() {
		/* Branches:
		 * (manager instanceof ManagerBase) : true
		 */
		//Arrange Statement(s)
		target = new TomcatEmbeddedContext();
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		Manager manager = null;
		//Act Statement(s)
		target.setManager(manager);
	}

	//Sapient generated method id: ${e323284a-c50f-3f39-b8d6-472c40b68660}, hash: 00BF45D7988C61C730135F921AB7E141
	@Disabled(value = "Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void deferredLoadOnStartupWhenExistingLoaderIsNotNull() {
		/* Branches:
		 * (classLoader != null) : true  #  inside doWithThreadContextClassLoader method
		 * (existingLoader != null) : true  #  inside doWithThreadContextClassLoader method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
		 *  Suggestions:
		 *  This method should be avoided from unit testing. This can be covered during integration testing.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Loader loaderMock = mock(Loader.class);
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader).when(loaderMock).getClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
			classUtils.when(() -> ClassUtils.overrideThreadContextClassLoader((ClassLoader) any())).thenReturn(classLoader2).thenReturn(classLoader3);
			target = new TomcatEmbeddedContext();
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			target.setLoader(loaderMock);
			//Act Statement(s)
			target.deferredLoadOnStartup();
			//Assert statement(s)
			assertAll("result", () -> {
				verify(loaderMock).getClassLoader();
				classUtils.verify(() -> ClassUtils.overrideThreadContextClassLoader((ClassLoader) any()), atLeast(2));
			});
		}
	}

	//Sapient generated method id: ${43c62c36-7729-32bf-8c3f-22421743325e}, hash: 8391B9E7AE873F46B9CD9E96702139BC
	@Disabled(value = "Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void deferredLoadOnStartupWhenClassLoaderIsNullAndExistingLoaderIsNull() {
		/* Branches:
		 * (classLoader != null) : false  #  inside doWithThreadContextClassLoader method
		 * (existingLoader != null) : false  #  inside doWithThreadContextClassLoader method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
		 *  Suggestions:
		 *  This method should be avoided from unit testing. This can be covered during integration testing.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Loader loaderMock = mock(Loader.class);
		doReturn(null).when(loaderMock).getClassLoader();
		target = new TomcatEmbeddedContext();
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		target.setLoader(loaderMock);
		//Act Statement(s)
		target.deferredLoadOnStartup();
		//Assert statement(s)
		assertAll("result", () -> verify(loaderMock).getClassLoader());
	}

	//Sapient generated method id: ${b88cf595-5116-3b1f-a455-1ae6c4b10fdd}, hash: C0085D21329A55F352CFD5A5FC6A9347
	@Test()
	void findMimeMappingsWhenThisMimeMappingsIsNull() {
		/* Branches:
		 * (this.mimeMappings != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		target = new TomcatEmbeddedContext();
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		//Act Statement(s)
		String[] result = target.findMimeMappings();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result.length, equalTo(0)));
	}

	//Sapient generated method id: ${461d8439-2edf-3445-bcfe-ff4f259da4a8}, hash: F5C5CB5936660637B0ED94391225AF1D
	@Test()
	void findMimeMappingWhenThisMimeMappingsIsNull() {
		/* Branches:
		 * (mimeMapping != null) : false
		 * (this.mimeMappings != null) : false
		 */
		//Arrange Statement(s)
		target = new TomcatEmbeddedContext();
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		//Act Statement(s)
		String result = target.findMimeMapping("A");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}
}
