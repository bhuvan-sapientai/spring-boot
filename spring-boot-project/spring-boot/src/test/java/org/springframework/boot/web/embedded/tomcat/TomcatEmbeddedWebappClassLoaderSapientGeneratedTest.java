package org.springframework.boot.web.embedded.tomcat;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Enumeration;
import java.net.URL;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class TomcatEmbeddedWebappClassLoaderSapientGeneratedTest {

	//Sapient generated method id: ${94160d7d-7e80-3293-abe7-a3ed5124c99b}, hash: DB184BB0F787C486876D77C851225322
	@Test()
	void findResourceTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		TomcatEmbeddedWebappClassLoader target = new TomcatEmbeddedWebappClassLoader(classLoader);
		//Act Statement(s)
		URL result = target.findResource("name1");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${9ff2cec8-2eb1-3c61-a082-b96f8afde96b}, hash: 7B3DF86BA94C2D3D04302869EE809DBD
	@Test()
	void findResourcesTest() throws IOException {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		TomcatEmbeddedWebappClassLoader target = new TomcatEmbeddedWebappClassLoader(classLoader);
		//Act Statement(s)
		Enumeration<URL> result = target.findResources("name1");
		//Assert statement(s)
		//TODO: Please implement equals method in Enumeration for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${4623dedc-591d-3dee-a57a-26cfe5a1de6b}, hash: 6BE4C743276B8070BE122A0767BF382C
	@Disabled()
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
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		TomcatEmbeddedWebappClassLoader target = new TomcatEmbeddedWebappClassLoader(classLoader);
		//Act Statement(s)
		Class<?> result = target.loadClass("A", true);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Object.class)));
	}

	//Sapient generated method id: ${89f632bf-4be5-379b-8e5e-60d261790258}, hash: A9D04B48BA8C04F4C184E04829D7AC91
	@Disabled()
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
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		doReturn(Object.class).when(target).findClass((String) null);
		//Act Statement(s)
		Class<?> result = target.loadClass((String) null, false);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Object.class));
			verify(target).findClass((String) null);
		});
	}

	//Sapient generated method id: ${d0e1dae7-bc65-3bf5-af91-fa3d7d297ca1}, hash: A613B4F2309D7133914C10DD8A6DE3DC
	@Disabled()
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
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		doReturn(null).when(target).findClass((String) null);
		ClassNotFoundException classNotFoundException = new ClassNotFoundException((String) null);
		//Act Statement(s)
		final ClassNotFoundException result = assertThrows(ClassNotFoundException.class, () -> {
			target.loadClass((String) null, false);
		});
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getMessage(), equalTo(classNotFoundException.getMessage()));
			verify(target).findClass((String) null);
		});
	}

	//Sapient generated method id: ${802b7a69-75ff-3abb-9740-0af499e70762}, hash: F0A0D79A75461A790CB95C8CC614BD7E
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
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		doReturn(Object.class).when(target).findClass("jakarta.security.auth.message.A");
		//Act Statement(s)
		Class<?> result = target.loadClass("jakarta.security.auth.message.A", false);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Object.class));
			verify(target).findClass("jakarta.security.auth.message.A");
		});
	}

	//Sapient generated method id: ${230c1dca-e00c-3e2a-a265-424940f4e625}, hash: 7417DB43287B3241250B77BD07523E5B
	@Disabled()
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
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		TomcatEmbeddedWebappClassLoader target = new TomcatEmbeddedWebappClassLoader(classLoader);
		//Act Statement(s)
		Class<?> result = target.loadClass("jakarta.security.auth.message.A", false);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Object.class)));
	}

	//Sapient generated method id: ${94f18861-19d0-3edb-87b1-5c88721c7799}, hash: D3595079E23E0F8A8B2F32535782DB4B
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
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		doReturn(Object.class).when(target).findClass("org.apache.coyote.");
		//Act Statement(s)
		Class<?> result = target.loadClass("org.apache.coyote.", false);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Object.class));
			verify(target).findClass("org.apache.coyote.");
		});
	}

	//Sapient generated method id: ${f418657c-b418-33e2-ab03-53e6f1b7852f}, hash: E52FB2A3E210FC306CFBC5F78DEFF580
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
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		doReturn(Object.class).when(target).findClass("javax.websocket.");
		//Act Statement(s)
		Class<?> result = target.loadClass("javax.websocket.", false);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Object.class));
			verify(target).findClass("javax.websocket.");
		});
	}

	//Sapient generated method id: ${70429b5a-e79d-378e-84c0-c8a19d2d97c2}, hash: 0561653E945BFE3198DB073E7E787C41
	@Disabled()
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
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		doReturn(null).when(target).findClass("jakarta.");
		//Act Statement(s)
		Class<?> result = target.loadClass("jakarta.", false);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Object.class));
			verify(target).findClass("jakarta.");
		});
	}

	//Sapient generated method id: ${fcce1c8a-022f-3656-bfc6-4aef27120f64}, hash: 487C415C254FE0FCEF6060D7A9D9DD42
	@Disabled()
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
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		doReturn(null).when(target).findClass("jakarta.servlet.jsp.jstl.A");
		//Act Statement(s)
		Class<?> result = target.loadClass("jakarta.servlet.jsp.jstl.A", false);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Object.class));
			verify(target).findClass("jakarta.servlet.jsp.jstl.A");
		});
	}

	//Sapient generated method id: ${aa69d2b5-bf61-3f12-9dd6-8e7415dd24f5}, hash: 2D3A9E17F5FDC3F1BAA0D661336BE709
	@Disabled()
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
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		doReturn(null).when(target).findClass("javax");
		//Act Statement(s)
		Class<?> result = target.loadClass("javax", false);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Object.class));
			verify(target).findClass("javax");
		});
	}

	//Sapient generated method id: ${2a89860f-f209-310e-adc4-381d2666f1d8}, hash: 7F382AEC150E8B09068BA2E1188843B9
	@Disabled()
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
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		doReturn(null).when(target).findClass("org");
		//Act Statement(s)
		Class<?> result = target.loadClass("org", false);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Object.class));
			verify(target).findClass("org");
		});
	}

	//Sapient generated method id: ${b18e4db4-7853-32fa-8d9f-1422ae22405d}, hash: EB36E90C7E197D8BFF2FC5080F9C90DC
	@Disabled()
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
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		doReturn(null).when(target).findClass("org.apache.tomcat.jdbc.A");
		//Act Statement(s)
		Class<?> result = target.loadClass("org.apache.tomcat.jdbc.A", false);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Object.class));
			verify(target).findClass("org.apache.tomcat.jdbc.A");
		});
	}

	//Sapient generated method id: ${13eb3729-7f00-3934-84e1-ad11c4559ebc}, hash: 216BA1A5097D6A4B8B549905C2346230
	@Disabled()
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
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		doReturn(null).when(target).findClass("jakarta");
		//Act Statement(s)
		Class<?> result = target.loadClass("jakarta", false);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Object.class));
			verify(target).findClass("jakarta");
		});
	}

	//Sapient generated method id: ${8d643cce-c642-39d2-993d-4b517b2dbb69}, hash: 21FC34CA3F0AA5652DB45302CAD48E77
	@Disabled()
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
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		doReturn(null).when(target).findClass("jakartaA");
		//Act Statement(s)
		Class<?> result = target.loadClass("jakartaA", false);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Object.class));
			verify(target).findClass("jakartaA");
		});
	}

	//Sapient generated method id: ${8defdcaf-33e4-3c24-adc5-37f7f0949a2f}, hash: E6EAECB20189433C7DFE5CF5B3554F76
	@Disabled()
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
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		doReturn(null).when(target).findClass("javaxACB");
		//Act Statement(s)
		Class<?> result = target.loadClass("javaxACB", false);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Object.class));
			verify(target).findClass("javaxACB");
		});
	}

	//Sapient generated method id: ${4fe885ea-08b8-3612-b1ca-fbe6a7679370}, hash: 3E02B44533D44AB27D62D31C9E5DEFBF
	@Disabled()
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
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		doReturn(null).when(target).findClass("orgA");
		//Act Statement(s)
		Class<?> result = target.loadClass("orgA", false);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Object.class));
			verify(target).findClass("orgA");
		});
	}

	//Sapient generated method id: ${dabb73d9-3c09-37a0-bc99-17c8b1e30af6}, hash: D2473729C1779B4B72B9E64E73C39BCE
	@Disabled()
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
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		TomcatEmbeddedWebappClassLoader target = spy(new TomcatEmbeddedWebappClassLoader(classLoader));
		doReturn(Object.class).when(target).findClass((String) null);
		ClassNotFoundException classNotFoundException = new ClassNotFoundException((String) null);
		//Act Statement(s)
		final ClassNotFoundException result = assertThrows(ClassNotFoundException.class, () -> {
			target.loadClass((String) null, false);
		});
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getMessage(), equalTo(classNotFoundException.getMessage()));
			verify(target).findClass((String) null);
		});
	}

	//Sapient generated method id: ${fa51a802-4dd3-3466-8123-7bd5a1e2309c}, hash: 6BB069748C46BDAF4AC7C2AFB576AB1D
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
		URL uRLMock = mock(URL.class, "addURL_uRL1");
		//Act Statement(s)
		target.addURL(uRLMock);
	}
}
