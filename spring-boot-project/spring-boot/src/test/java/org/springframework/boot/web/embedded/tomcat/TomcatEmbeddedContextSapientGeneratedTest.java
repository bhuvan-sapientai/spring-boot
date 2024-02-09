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

	//Sapient generated method id: ${3f0efe92-d056-30c3-9f3d-29186ed9589c}
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

	//Sapient generated method id: ${24c1a64d-5d08-387d-978e-1fb3bf79e7c5}
	@Test()
	void setManagerWhenManagerInstanceOfManagerBase() {
		/* Branches:
		 * (manager instanceof ManagerBase) : true
		 */
		//Arrange Statement(s)
		ManagerBase managerMock = mock(ManagerBase.class, "ManagerBase");
		try (MockedStatic<JreCompat> jreCompat = mockStatic(JreCompat.class)) {
			doNothing().when(managerMock).setSessionIdGenerator((LazySessionIdGenerator) any());
			jreCompat.when(() -> JreCompat.isGraalAvailable()).thenReturn(true);
			target = new TomcatEmbeddedContext();
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			target.setManager(managerMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(managerMock).setSessionIdGenerator((LazySessionIdGenerator) any());
				jreCompat.verify(() -> JreCompat.isGraalAvailable(), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${bd6a2762-70df-3cac-9a46-0ae7dfd110f9}
	@Test()
	void setManagerWhenManagerInstanceOfManagerBase3() {
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

	//Sapient generated method id: ${e323284a-c50f-3f39-b8d6-472c40b68660}
	@Disabled(value = "Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void deferredLoadOnStartupWhenExistingLoaderIsNotNull() {
		/* Branches:
		 * (classLoader != null) : true  #  inside doWithThreadContextClassLoader method
		 * (existingLoader != null) : true  #  inside doWithThreadContextClassLoader method
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

	//Sapient generated method id: ${43c62c36-7729-32bf-8c3f-22421743325e}
	@Disabled(value = "Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
	@Test()
	void deferredLoadOnStartupWhenClassLoaderIsNullAndExistingLoaderIsNull() {
		/* Branches:
		 * (classLoader != null) : false  #  inside doWithThreadContextClassLoader method
		 * (existingLoader != null) : false  #  inside doWithThreadContextClassLoader method
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

	//Sapient generated method id: ${b88cf595-5116-3b1f-a455-1ae6c4b10fdd}
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
		String[] stringResultArray = new String[] {};
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(stringResultArray)));
	}

	//Sapient generated method id: ${461d8439-2edf-3445-bcfe-ff4f259da4a8}
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
