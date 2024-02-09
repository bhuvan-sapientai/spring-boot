package org.springframework.boot.web.embedded.tomcat;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Enumeration;
import java.net.URL;
import java.util.Collections;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class TomcatEmbeddedWebappClassLoaderSapientGeneratedTest {

	//Sapient generated method id: ${94160d7d-7e80-3293-abe7-a3ed5124c99b}
	@Test()
	void findResourceTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//TomcatEmbeddedWebappClassLoader target = new TomcatEmbeddedWebappClassLoader(classLoader);
		//Act Statement(s)
		//URL result = target.findResource("name1");
		//Assert statement(s)
		//assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${9ff2cec8-2eb1-3c61-a082-b96f8afde96b}
	@Test()
	void findResourcesTest() throws IOException {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Assert statement(s)
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//TomcatEmbeddedWebappClassLoader target = new TomcatEmbeddedWebappClassLoader(classLoader);
		//Act Statement(s)
		//Enumeration<URL> result = target.findResources("name1");
		//Enumeration<URL> enumeration = Collections.emptyEnumeration();
		//TODO: Please implement equals method in Enumeration for verification to succeed or you need to adjust respective assertion statements
		//assertAll("result", () -> assertThat(result, equalTo(enumeration)));
	}

	//Sapient generated method id: ${4623dedc-591d-3dee-a57a-26cfe5a1de6b}
	@Test()
	void loadClass1WhenResolve() throws UnsupportedClassVersionError, Exception {
		/* Branches:
		 * (JreCompat.isGraalAvailable()) : false
		 * (resultClass != null) : false  #  inside findExistingLoadedClass method
		 * (JreCompat.isGraalAvailable()) : false  #  inside findExistingLoadedClass method
		 * (result != null) : true
		 * (result == null) : false
		 * (resolve) : true  #  inside resolveIfNecessary method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		//Object object = new Object();
		//doReturn(object).when(target).getClassLoadingLock("A");
		//doReturn(Object.class).when(target).findLoadedClass("A");
		//doNothing().when(target).resolveClass(Object.class);
		//Act Statement(s)
		//Class<?> result = target.loadClass("A", true);
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result, equalTo(Object.class));
    verify(target).getClassLoadingLock("A");
    verify(target).findLoadedClass("A");
    verify(target).resolveClass(Object.class);
});*/
	}

	//Sapient generated method id: ${89f632bf-4be5-379b-8e5e-60d261790258}
	@Test()
	void loadClass1WhenResultIsNotNullAndNotResolve() throws UnsupportedClassVersionError, Exception {
		/* Branches:
		 * (JreCompat.isGraalAvailable()) : false
		 * (resultClass != null) : false  #  inside findExistingLoadedClass method
		 * (JreCompat.isGraalAvailable()) : false  #  inside findExistingLoadedClass method
		 * (result != null) : false
		 * (this.delegate) : false  #  inside doLoadClass method
		 * (filter(name, true)) : false  #  inside doLoadClass method
		 * (result != null) : true  #  inside doLoadClass method
		 * (result == null) : false
		 * (resolve) : false  #  inside resolveIfNecessary method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		//Object object = new Object();
		//doReturn(object).when(target).getClassLoadingLock((String) null);
		//doReturn(null).when(target).findLoadedClass((String) null);
		//doReturn(Object.class).when(target).findClass((String) null);
		//Act Statement(s)
		//Class<?> result = target.loadClass((String) null, false);
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result, equalTo(Object.class));
    verify(target).getClassLoadingLock((String) null);
    verify(target).findLoadedClass((String) null);
    verify(target).findClass((String) null);
});*/
	}

	//Sapient generated method id: ${d0e1dae7-bc65-3bf5-af91-fa3d7d297ca1}
	@Test()
	void loadClass1WhenResultIsNullThrowsClassNotFoundException() throws ClassNotFoundException {
		/* Branches:
		 * (JreCompat.isGraalAvailable()) : false
		 * (resultClass != null) : false  #  inside findExistingLoadedClass method
		 * (JreCompat.isGraalAvailable()) : false  #  inside findExistingLoadedClass method
		 * (result != null) : false
		 * (this.delegate) : false  #  inside doLoadClass method
		 * (filter(name, true)) : false  #  inside doLoadClass method
		 * (result != null) : false  #  inside doLoadClass method
		 * (this.parent == null) : true  #  inside loadFromParent method
		 * (result == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		//Object object = new Object();
		//doReturn(object).when(target).getClassLoadingLock((String) null);
		//doReturn(null).when(target).findLoadedClass((String) null);
		//doReturn(null).when(target).findClass((String) null);
		//ClassNotFoundException classNotFoundException = new ClassNotFoundException((String) null);
		//Act Statement(s)
        /*final ClassNotFoundException result = assertThrows(ClassNotFoundException.class, () -> {
    target.loadClass((String) null, false);
});*/
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result, is(notNullValue()));
    assertThat(result.getMessage(), equalTo(classNotFoundException.getMessage()));
    verify(target).getClassLoadingLock((String) null);
    verify(target).findLoadedClass((String) null);
    verify(target).findClass((String) null);
});*/
	}

	//Sapient generated method id: ${802b7a69-75ff-3abb-9740-0af499e70762}
	@Test()
	void loadClass1WhenResultIsNullAndResultIsNotNullAndNotResolve() throws UnsupportedClassVersionError, Exception {
		/* Branches:
		 * (JreCompat.isGraalAvailable()) : false
		 * (resultClass != null) : false  #  inside findExistingLoadedClass method
		 * (JreCompat.isGraalAvailable()) : false  #  inside findExistingLoadedClass method
		 * (result != null) : false
		 * (this.delegate) : false  #  inside doLoadClass method
		 * (filter(name, true)) : true  #  inside doLoadClass method
		 * (this.parent == null) : true  #  inside loadFromParent method
		 * (result != null) : false  #  inside doLoadClass method
		 * (result == null) : false
		 * (resolve) : false  #  inside resolveIfNecessary method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		//Object object = new Object();
		//doReturn(object).when(target).getClassLoadingLock("jakarta.security.auth.message.A");
		//doReturn(null).when(target).findLoadedClass("jakarta.security.auth.message.A");
		//doReturn(Object.class).when(target).findClass("jakarta.security.auth.message.A");
		//Act Statement(s)
		//Class<?> result = target.loadClass("jakarta.security.auth.message.A", false);
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result, equalTo(Object.class));
    verify(target).getClassLoadingLock("jakarta.security.auth.message.A");
    verify(target).findLoadedClass("jakarta.security.auth.message.A");
    verify(target).findClass("jakarta.security.auth.message.A");
});*/
	}

	//Sapient generated method id: ${230c1dca-e00c-3e2a-a265-424940f4e625}
	@Test()
	void loadClass1WhenResultIsNotNullAndResultIsNotNullAndNotResolve() throws UnsupportedClassVersionError, Exception {
		/* Branches:
		 * (JreCompat.isGraalAvailable()) : false
		 * (resultClass != null) : false  #  inside findExistingLoadedClass method
		 * (JreCompat.isGraalAvailable()) : false  #  inside findExistingLoadedClass method
		 * (result != null) : false
		 * (this.delegate) : false  #  inside doLoadClass method
		 * (filter(name, true)) : true  #  inside doLoadClass method
		 * (this.parent == null) : false  #  inside loadFromParent method
		 * (result != null) : true  #  inside doLoadClass method
		 * (result == null) : false
		 * (resolve) : false  #  inside resolveIfNecessary method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		//Object object = new Object();
		//doReturn(object).when(target).getClassLoadingLock("jakarta.security.auth.message.A");
		//doReturn(null).when(target).findLoadedClass("jakarta.security.auth.message.A");
		//Act Statement(s)
		//Class<?> result = target.loadClass("jakarta.security.auth.message.A", false);
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result, equalTo(Object.class));
    verify(target).getClassLoadingLock("jakarta.security.auth.message.A");
    verify(target).findLoadedClass("jakarta.security.auth.message.A");
});*/
	}

	//Sapient generated method id: ${94f18861-19d0-3edb-87b1-5c88721c7799}
	@Test()
	void loadClass1WhenThisParentIsNotNullAndResultIsNullAndResultIsNotNullAndNotResolve() throws UnsupportedClassVersionError, Exception {
		/* Branches:
		 * (JreCompat.isGraalAvailable()) : false
		 * (resultClass != null) : false  #  inside findExistingLoadedClass method
		 * (JreCompat.isGraalAvailable()) : false  #  inside findExistingLoadedClass method
		 * (result != null) : false
		 * (this.delegate) : false  #  inside doLoadClass method
		 * (filter(name, true)) : true  #  inside doLoadClass method
		 * (this.parent == null) : false  #  inside loadFromParent method
		 * (result != null) : false  #  inside doLoadClass method
		 * (result == null) : false
		 * (resolve) : false  #  inside resolveIfNecessary method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		//Object object = new Object();
		//doReturn(object).when(target).getClassLoadingLock("org.apache.coyote.ABC");
		//doReturn(null).when(target).findLoadedClass("org.apache.coyote.ABC");
		//doReturn(Object.class).when(target).findClass("org.apache.coyote.ABC");
		//Act Statement(s)
		//Class<?> result = target.loadClass("org.apache.coyote.ABC", false);
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result, equalTo(Object.class));
    verify(target).getClassLoadingLock("org.apache.coyote.ABC");
    verify(target).findLoadedClass("org.apache.coyote.ABC");
    verify(target).findClass("org.apache.coyote.ABC");
});*/
	}

	//Sapient generated method id: ${f418657c-b418-33e2-ab03-53e6f1b7852f}
	@Test()
	void loadClass1WhenThisNotDelegateAndFilterNameTrueAndThisParentIsNotNullAndResultIsNullAndResultIsNotNullAndNotResolve5() throws UnsupportedClassVersionError, Exception {
		/* Branches:
		 * (JreCompat.isGraalAvailable()) : false
		 * (resultClass != null) : false  #  inside findExistingLoadedClass method
		 * (JreCompat.isGraalAvailable()) : false  #  inside findExistingLoadedClass method
		 * (result != null) : false
		 * (this.delegate) : false  #  inside doLoadClass method
		 * (filter(name, true)) : true  #  inside doLoadClass method
		 * (this.parent == null) : false  #  inside loadFromParent method
		 * (result != null) : false  #  inside doLoadClass method
		 * (result == null) : false
		 * (resolve) : false  #  inside resolveIfNecessary method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		//Object object = new Object();
		//doReturn(object).when(target).getClassLoadingLock("javax.websocket.");
		//doReturn(null).when(target).findLoadedClass("javax.websocket.");
		//doReturn(Object.class).when(target).findClass("javax.websocket.");
		//Act Statement(s)
		//Class<?> result = target.loadClass("javax.websocket.", false);
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result, equalTo(Object.class));
    verify(target).getClassLoadingLock("javax.websocket.");
    verify(target).findLoadedClass("javax.websocket.");
    verify(target).findClass("javax.websocket.");
});*/
	}

	//Sapient generated method id: ${70429b5a-e79d-378e-84c0-c8a19d2d97c2}
	@Test()
	void loadClass1WhenThisParentIsNotNullAndResultIsNotNullAndNotResolve() throws UnsupportedClassVersionError, Exception {
		/* Branches:
		 * (JreCompat.isGraalAvailable()) : false
		 * (resultClass != null) : false  #  inside findExistingLoadedClass method
		 * (JreCompat.isGraalAvailable()) : false  #  inside findExistingLoadedClass method
		 * (result != null) : false
		 * (this.delegate) : false  #  inside doLoadClass method
		 * (filter(name, true)) : false  #  inside doLoadClass method
		 * (result != null) : false  #  inside doLoadClass method
		 * (this.parent == null) : false  #  inside loadFromParent method
		 * (result == null) : false
		 * (resolve) : false  #  inside resolveIfNecessary method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		//Object object = new Object();
		//doReturn(object).when(target).getClassLoadingLock("jakarta.");
		//doReturn(null).when(target).findLoadedClass("jakarta.");
		//doReturn(null).when(target).findClass("jakarta.");
		//Act Statement(s)
		//Class<?> result = target.loadClass("jakarta.", false);
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result, equalTo(Object.class));
    verify(target).getClassLoadingLock("jakarta.");
    verify(target).findLoadedClass("jakarta.");
    verify(target).findClass("jakarta.");
});*/
	}

	//Sapient generated method id: ${fcce1c8a-022f-3656-bfc6-4aef27120f64}
	@Test()
	void loadClass1WhenThisNotDelegateAndFilterNotNameTrueAndResultIsNullAndThisParentIsNotNullAndResultIsNotNullAndNotResolve3() throws UnsupportedClassVersionError, Exception {
		/* Branches:
		 * (JreCompat.isGraalAvailable()) : false
		 * (resultClass != null) : false  #  inside findExistingLoadedClass method
		 * (JreCompat.isGraalAvailable()) : false  #  inside findExistingLoadedClass method
		 * (result != null) : false
		 * (this.delegate) : false  #  inside doLoadClass method
		 * (filter(name, true)) : false  #  inside doLoadClass method
		 * (result != null) : false  #  inside doLoadClass method
		 * (this.parent == null) : false  #  inside loadFromParent method
		 * (result == null) : false
		 * (resolve) : false  #  inside resolveIfNecessary method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		//Object object = new Object();
		//doReturn(object).when(target).getClassLoadingLock("jakarta.servlet.jsp.jstl.A");
		//doReturn(null).when(target).findLoadedClass("jakarta.servlet.jsp.jstl.A");
		//doReturn(null).when(target).findClass("jakarta.servlet.jsp.jstl.A");
		//Act Statement(s)
		//Class<?> result = target.loadClass("jakarta.servlet.jsp.jstl.A", false);
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result, equalTo(Object.class));
    verify(target).getClassLoadingLock("jakarta.servlet.jsp.jstl.A");
    verify(target).findLoadedClass("jakarta.servlet.jsp.jstl.A");
    verify(target).findClass("jakarta.servlet.jsp.jstl.A");
});*/
	}

	//Sapient generated method id: ${aa69d2b5-bf61-3f12-9dd6-8e7415dd24f5}
	@Test()
	void loadClass1WhenThisNotDelegateAndFilterNotNameTrueAndResultIsNullAndThisParentIsNotNullAndResultIsNotNullAndNotResolve4() throws UnsupportedClassVersionError, Exception {
		/* Branches:
		 * (JreCompat.isGraalAvailable()) : false
		 * (resultClass != null) : false  #  inside findExistingLoadedClass method
		 * (JreCompat.isGraalAvailable()) : false  #  inside findExistingLoadedClass method
		 * (result != null) : false
		 * (this.delegate) : false  #  inside doLoadClass method
		 * (filter(name, true)) : false  #  inside doLoadClass method
		 * (result != null) : false  #  inside doLoadClass method
		 * (this.parent == null) : false  #  inside loadFromParent method
		 * (result == null) : false
		 * (resolve) : false  #  inside resolveIfNecessary method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		//Object object = new Object();
		//doReturn(object).when(target).getClassLoadingLock("javax");
		//doReturn(null).when(target).findLoadedClass("javax");
		//doReturn(null).when(target).findClass("javax");
		//Act Statement(s)
		//Class<?> result = target.loadClass("javax", false);
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result, equalTo(Object.class));
    verify(target).getClassLoadingLock("javax");
    verify(target).findLoadedClass("javax");
    verify(target).findClass("javax");
});*/
	}

	//Sapient generated method id: ${2a89860f-f209-310e-adc4-381d2666f1d8}
	@Test()
	void loadClass1WhenThisNotDelegateAndFilterNotNameTrueAndResultIsNullAndThisParentIsNotNullAndResultIsNotNullAndNotResolve5() throws UnsupportedClassVersionError, Exception {
		/* Branches:
		 * (JreCompat.isGraalAvailable()) : false
		 * (resultClass != null) : false  #  inside findExistingLoadedClass method
		 * (JreCompat.isGraalAvailable()) : false  #  inside findExistingLoadedClass method
		 * (result != null) : false
		 * (this.delegate) : false  #  inside doLoadClass method
		 * (filter(name, true)) : false  #  inside doLoadClass method
		 * (result != null) : false  #  inside doLoadClass method
		 * (this.parent == null) : false  #  inside loadFromParent method
		 * (result == null) : false
		 * (resolve) : false  #  inside resolveIfNecessary method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		//Object object = new Object();
		//doReturn(object).when(target).getClassLoadingLock("org");
		//doReturn(null).when(target).findLoadedClass("org");
		//doReturn(null).when(target).findClass("org");
		//Act Statement(s)
		//Class<?> result = target.loadClass("org", false);
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result, equalTo(Object.class));
    verify(target).getClassLoadingLock("org");
    verify(target).findLoadedClass("org");
    verify(target).findClass("org");
});*/
	}

	//Sapient generated method id: ${b18e4db4-7853-32fa-8d9f-1422ae22405d}
	@Test()
	void loadClass1WhenThisNotDelegateAndFilterNotNameTrueAndResultIsNullAndThisParentIsNotNullAndResultIsNotNullAndNotResolve6() throws UnsupportedClassVersionError, Exception {
		/* Branches:
		 * (JreCompat.isGraalAvailable()) : false
		 * (resultClass != null) : false  #  inside findExistingLoadedClass method
		 * (JreCompat.isGraalAvailable()) : false  #  inside findExistingLoadedClass method
		 * (result != null) : false
		 * (this.delegate) : false  #  inside doLoadClass method
		 * (filter(name, true)) : false  #  inside doLoadClass method
		 * (result != null) : false  #  inside doLoadClass method
		 * (this.parent == null) : false  #  inside loadFromParent method
		 * (result == null) : false
		 * (resolve) : false  #  inside resolveIfNecessary method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		//Object object = new Object();
		//doReturn(object).when(target).getClassLoadingLock("org.apache.tomcat.jdbc.A");
		//doReturn(null).when(target).findLoadedClass("org.apache.tomcat.jdbc.A");
		//doReturn(null).when(target).findClass("org.apache.tomcat.jdbc.A");
		//Act Statement(s)
		//Class<?> result = target.loadClass("org.apache.tomcat.jdbc.A", false);
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result, equalTo(Object.class));
    verify(target).getClassLoadingLock("org.apache.tomcat.jdbc.A");
    verify(target).findLoadedClass("org.apache.tomcat.jdbc.A");
    verify(target).findClass("org.apache.tomcat.jdbc.A");
});*/
	}

	//Sapient generated method id: ${13eb3729-7f00-3934-84e1-ad11c4559ebc}
	@Test()
	void loadClass1WhenThisNotDelegateAndFilterNotNameTrueAndResultIsNullAndThisParentIsNotNullAndResultIsNotNullAndNotResolve7() throws UnsupportedClassVersionError, Exception {
		/* Branches:
		 * (JreCompat.isGraalAvailable()) : false
		 * (resultClass != null) : false  #  inside findExistingLoadedClass method
		 * (JreCompat.isGraalAvailable()) : false  #  inside findExistingLoadedClass method
		 * (result != null) : false
		 * (this.delegate) : false  #  inside doLoadClass method
		 * (filter(name, true)) : false  #  inside doLoadClass method
		 * (result != null) : false  #  inside doLoadClass method
		 * (this.parent == null) : false  #  inside loadFromParent method
		 * (result == null) : false
		 * (resolve) : false  #  inside resolveIfNecessary method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		//Object object = new Object();
		//doReturn(object).when(target).getClassLoadingLock("jakarta");
		//doReturn(null).when(target).findLoadedClass("jakarta");
		//doReturn(null).when(target).findClass("jakarta");
		//Act Statement(s)
		//Class<?> result = target.loadClass("jakarta", false);
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result, equalTo(Object.class));
    verify(target).getClassLoadingLock("jakarta");
    verify(target).findLoadedClass("jakarta");
    verify(target).findClass("jakarta");
});*/
	}

	//Sapient generated method id: ${8d643cce-c642-39d2-993d-4b517b2dbb69}
	@Test()
	void loadClass1WhenThisNotDelegateAndFilterNotNameTrueAndResultIsNullAndThisParentIsNotNullAndResultIsNotNullAndNotResolve8() throws UnsupportedClassVersionError, Exception {
		/* Branches:
		 * (JreCompat.isGraalAvailable()) : false
		 * (resultClass != null) : false  #  inside findExistingLoadedClass method
		 * (JreCompat.isGraalAvailable()) : false  #  inside findExistingLoadedClass method
		 * (result != null) : false
		 * (this.delegate) : false  #  inside doLoadClass method
		 * (filter(name, true)) : false  #  inside doLoadClass method
		 * (result != null) : false  #  inside doLoadClass method
		 * (this.parent == null) : false  #  inside loadFromParent method
		 * (result == null) : false
		 * (resolve) : false  #  inside resolveIfNecessary method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		//Object object = new Object();
		//doReturn(object).when(target).getClassLoadingLock("jakartaA");
		//doReturn(null).when(target).findLoadedClass("jakartaA");
		//doReturn(null).when(target).findClass("jakartaA");
		//Act Statement(s)
		//Class<?> result = target.loadClass("jakartaA", false);
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result, equalTo(Object.class));
    verify(target).getClassLoadingLock("jakartaA");
    verify(target).findLoadedClass("jakartaA");
    verify(target).findClass("jakartaA");
});*/
	}

	//Sapient generated method id: ${8defdcaf-33e4-3c24-adc5-37f7f0949a2f}
	@Test()
	void loadClass1WhenThisNotDelegateAndFilterNotNameTrueAndResultIsNullAndThisParentIsNotNullAndResultIsNotNullAndNotResolve9() throws UnsupportedClassVersionError, Exception {
		/* Branches:
		 * (JreCompat.isGraalAvailable()) : false
		 * (resultClass != null) : false  #  inside findExistingLoadedClass method
		 * (JreCompat.isGraalAvailable()) : false  #  inside findExistingLoadedClass method
		 * (result != null) : false
		 * (this.delegate) : false  #  inside doLoadClass method
		 * (filter(name, true)) : false  #  inside doLoadClass method
		 * (result != null) : false  #  inside doLoadClass method
		 * (this.parent == null) : false  #  inside loadFromParent method
		 * (result == null) : false
		 * (resolve) : false  #  inside resolveIfNecessary method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		//Object object = new Object();
		//doReturn(object).when(target).getClassLoadingLock("javaxA");
		//doReturn(null).when(target).findLoadedClass("javaxA");
		//doReturn(null).when(target).findClass("javaxA");
		//Act Statement(s)
		//Class<?> result = target.loadClass("javaxA", false);
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result, equalTo(Object.class));
    verify(target).getClassLoadingLock("javaxA");
    verify(target).findLoadedClass("javaxA");
    verify(target).findClass("javaxA");
});*/
	}

	//Sapient generated method id: ${4fe885ea-08b8-3612-b1ca-fbe6a7679370}
	@Test()
	void loadClass1WhenThisNotDelegateAndFilterNotNameTrueAndResultIsNullAndThisParentIsNotNullAndResultIsNotNullAndNotResolve10() throws UnsupportedClassVersionError, Exception {
		/* Branches:
		 * (JreCompat.isGraalAvailable()) : false
		 * (resultClass != null) : false  #  inside findExistingLoadedClass method
		 * (JreCompat.isGraalAvailable()) : false  #  inside findExistingLoadedClass method
		 * (result != null) : false
		 * (this.delegate) : false  #  inside doLoadClass method
		 * (filter(name, true)) : false  #  inside doLoadClass method
		 * (result != null) : false  #  inside doLoadClass method
		 * (this.parent == null) : false  #  inside loadFromParent method
		 * (result == null) : false
		 * (resolve) : false  #  inside resolveIfNecessary method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		//Object object = new Object();
		//doReturn(object).when(target).getClassLoadingLock("orgA");
		//doReturn(null).when(target).findLoadedClass("orgA");
		//doReturn(null).when(target).findClass("orgA");
		//Act Statement(s)
		//Class<?> result = target.loadClass("orgA", false);
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result, equalTo(Object.class));
    verify(target).getClassLoadingLock("orgA");
    verify(target).findLoadedClass("orgA");
    verify(target).findClass("orgA");
});*/
	}

	//Sapient generated method id: ${dabb73d9-3c09-37a0-bc99-17c8b1e30af6}
	@Test()
	void loadClass1WhenThisParentIsNullAndResultIsNullThrowsClassNotFoundException() throws ClassNotFoundException {
		/* Branches:
		 * (JreCompat.isGraalAvailable()) : false
		 * (resultClass != null) : false  #  inside findExistingLoadedClass method
		 * (JreCompat.isGraalAvailable()) : false  #  inside findExistingLoadedClass method
		 * (result != null) : false
		 * (this.delegate) : false  #  inside doLoadClass method
		 * (filter(name, true)) : false  #  inside doLoadClass method
		 * (catch-exception (ClassNotFoundException)) : true  #  inside findClassIgnoringNotFound method
		 * (result != null) : false  #  inside doLoadClass method
		 * (this.parent == null) : true  #  inside loadFromParent method
		 * (result == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		//Object object = new Object();
		//doReturn(object).when(target).getClassLoadingLock((String) null);
		//doReturn(null).when(target).findLoadedClass((String) null);
		//doReturn(Object.class).when(target).findClass((String) null);
		//ClassNotFoundException classNotFoundException = new ClassNotFoundException((String) null);
		//Act Statement(s)
        /*final ClassNotFoundException result = assertThrows(ClassNotFoundException.class, () -> {
    target.loadClass((String) null, false);
});*/
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result, is(notNullValue()));
    assertThat(result.getMessage(), equalTo(classNotFoundException.getMessage()));
    verify(target).getClassLoadingLock((String) null);
    verify(target).findLoadedClass((String) null);
    verify(target).findClass((String) null);
});*/
	}

	//Sapient generated method id: ${fa51a802-4dd3-3466-8123-7bd5a1e2309c}
	@Test()
	void addURLWhenLoggerIsTraceEnabled() {
		/* Branches:
		 * (logger.isTraceEnabled()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		TomcatEmbeddedWebappClassLoader target = new TomcatEmbeddedWebappClassLoader(classLoader);
		//TODO: Needs initialization with real value
		URL uRL = null;
		//Act Statement(s)
		target.addURL(uRL);
	}
}
