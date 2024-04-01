package org.springframework.boot.web.servlet.server;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;
import java.io.IOException;
import java.util.List;
import java.net.URL;
import java.net.URI;
import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class StaticResourceJarsSapientGeneratedTest {

	private final URL uRLMock = mock(URL.class);

	private final URL uRLMock2 = mock(URL.class);

	//Sapient generated method id: ${118e01f4-1faf-3b15-93b3-0cf387ec1ffd}, hash: AFA0E733A3B4F3F278B35A08D1C829C2
	@Disabled()
	@Test()
	void getUrlsWhenClassLoaderNotInstanceOfURLClassLoader() throws URISyntaxException, IOException {
		/* Branches:
		 * (classLoader instanceof URLClassLoader urlClassLoader) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type RuntimeMXBean
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		StaticResourceJars target = spy(new StaticResourceJars());
		List<URL> uRLList = new ArrayList<>();
		URL[] uRLArray = new URL[] {};
		doReturn(uRLList).when(target).getUrlsFrom(uRLArray);
		//Act Statement(s)
		List<URL> result = target.getUrls();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(uRLList));
			verify(target).getUrlsFrom(uRLArray);
		});
	}

	//Sapient generated method id: ${1e56f988-b0ef-3c38-80f7-3bd2d83140c0}, hash: F7FF2F033DCA937C3EDB60DF74C7A1C0
	@Disabled()
	@Test()
	void getUrlsFromWhenCaughtURISyntaxExceptionThrowsIllegalStateException() throws URISyntaxException {
		/* Branches:
		 * (for-each(urls)) : true
		 * (!"file".equals(url.getProtocol())) : false  #  inside addUrl method
		 * (catch-exception (URISyntaxException)) : true  #  inside toFile method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		URL urlMock = mock(URL.class, "getUrlsFrom_uRL1");
		URI uRI = URI.create("x1");
		doReturn(uRI).when(urlMock).toURI();
		StaticResourceJars target = new StaticResourceJars();
		URL[] uRLArray = new URL[] { urlMock };
		IllegalStateException illegalStateException = new IllegalStateException("Failed to create File from URL 'getUrlsFrom_uRL1'");
		//Act Statement(s)
		final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
			target.getUrlsFrom(uRLArray);
		});
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
			verify(urlMock).toURI();
		});
	}

	//Sapient generated method id: ${3fdb69f1-d197-3fb8-b0c1-f50414769dbf}, hash: 3DF247D3917C30C9BE7812AB6D3D5736
	@Test()
	void getUrlsFromWhenIsResourcesJarNotJarURLConnection() throws IOException, URISyntaxException {
		/* Branches:
		 * (for-each(urls)) : true
		 * (!"file".equals(url.getProtocol())) : true  #  inside addUrl method
		 * (connection instanceof JarURLConnection jarURLConnection) : true  #  inside addUrlConnection method
		 * (!connection.getUseCaches()) : false  #  inside isResourcesJar method
		 * (jarFile.getName().endsWith(".jar")) : false  #  inside isResourcesJar method
		 * (closeJarFile) : false  #  inside isResourcesJar method
		 * (isResourcesJar(jarURLConnection)) : false  #  inside addUrlConnection method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		StaticResourceJars target = new StaticResourceJars();
		URL[] uRLArray = new URL[] { uRLMock, uRLMock2 };
		//Act Statement(s)
		List<URL> result = target.getUrlsFrom(uRLArray);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result.size(), equalTo(0)));
	}

	//Sapient generated method id: ${768bbee9-504e-3a24-b649-9e5dc2a04229}, hash: 87CFFE13EA6582E1630BBFFE2D94DEB1
	@Disabled()
	@Test()
	void getUrlsFromWhenIsResourcesJarJarURLConnection() throws IOException, URISyntaxException {
		/* Branches:
		 * (for-each(urls)) : true
		 * (!"file".equals(url.getProtocol())) : true  #  inside addUrl method
		 * (connection instanceof JarURLConnection jarURLConnection) : true  #  inside addUrlConnection method
		 * (!connection.getUseCaches()) : true  #  inside isResourcesJar method
		 * (jarFile.getName().endsWith(".jar")) : true  #  inside isResourcesJar method
		 * (jarFile.getJarEntry("META-INF/resources") != null) : true  #  inside isResourcesJar method
		 * (closeJarFile) : true  #  inside isResourcesJar method
		 * (isResourcesJar(jarURLConnection)) : true  #  inside addUrlConnection method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		StaticResourceJars target = new StaticResourceJars();
		URL[] uRLArray = new URL[] { uRLMock, uRLMock2 };
		//Act Statement(s)
		List<URL> result = target.getUrlsFrom(uRLArray);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(2));
			assertThat(result.get(0), is(instanceOf(URL.class)));
		});
	}

	//Sapient generated method id: ${2d58f4fd-41df-3a8d-a49b-3516ff8df318}, hash: 731A0AF9A69D7D38E108CEFF22745A94
	@Test()
	void getUrlsFromWhenCaughtIOExceptionThrowsIllegalStateException() throws IOException {
		/* Branches:
		 * (for-each(urls)) : true
		 * (!"file".equals(url.getProtocol())) : true  #  inside addUrl method
		 * (connection instanceof JarURLConnection jarURLConnection) : true  #  inside addUrlConnection method
		 * (!connection.getUseCaches()) : false  #  inside isResourcesJar method
		 * (jarFile.getName().endsWith(".jar")) : false  #  inside isResourcesJar method
		 * (closeJarFile) : false  #  inside isResourcesJar method
		 * (isResourcesJar(jarURLConnection)) : false  #  inside addUrlConnection method
		 * (catch-exception (IOException)) : true  #  inside addUrl method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//StaticResourceJars target = new StaticResourceJars();
		//URL[][] uRLArray3 = new URL[][] { uRLMock };
		//URL[] uRLArray2 = new URL[] { uRLArray3 };
		//URL[] uRLArray = new URL[] { uRLArray2 };
		//IOException iOException = new IOException();
		//Act Statement(s)
        /*final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
    target.getUrlsFrom(uRLArray);
});*/
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result, is(notNullValue()));
    assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
});*/
	}

	//Sapient generated method id: ${29e51881-8a7e-35d7-8827-e81171dfc019}, hash: 7A8B344E4E9AA1BC06A09E2ECFD13E10
	@Test()
	void getUrlsFromWhenNotCloseJarFileAndIsResourcesJarNotJarURLConnection() throws URISyntaxException, IOException {
		/* Branches:
		 * (for-each(urls)) : true
		 * (!"file".equals(url.getProtocol())) : false  #  inside addUrl method
		 * (file != null) : false  #  inside addUrl method
		 * (connection instanceof JarURLConnection jarURLConnection) : true  #  inside addUrlConnection method
		 * (!connection.getUseCaches()) : false  #  inside isResourcesJar method
		 * (jarFile.getName().endsWith(".jar")) : false  #  inside isResourcesJar method
		 * (closeJarFile) : false  #  inside isResourcesJar method
		 * (isResourcesJar(jarURLConnection)) : false  #  inside addUrlConnection method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class java.io.File
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		StaticResourceJars target = new StaticResourceJars();
		URL uRLMock3 = mock(URL.class);
		URL[] uRLArray = new URL[] { uRLMock, uRLMock2, uRLMock3 };
		//Act Statement(s)
		List<URL> result = target.getUrlsFrom(uRLArray);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result.size(), equalTo(0)));
	}

	//Sapient generated method id: ${1b5cc1ba-a9a2-37d6-92ba-ee3d9668c900}, hash: 04229576B4633CB08CC4B2275DC60250
	@Test()
	void getUrlsFromWhenJarFileGetNameNotEndsWith_jarAndNotCloseJarFileAndIsResourcesJarNotJarURLConnection() throws URISyntaxException, IOException {
		/* Branches:
		 * (for-each(urls)) : true
		 * (!"file".equals(url.getProtocol())) : false  #  inside addUrl method
		 * (catch-exception (IllegalArgumentException)) : true  #  inside toFile method
		 * (file != null) : false  #  inside addUrl method
		 * (connection instanceof JarURLConnection jarURLConnection) : true  #  inside addUrlConnection method
		 * (!connection.getUseCaches()) : false  #  inside isResourcesJar method
		 * (jarFile.getName().endsWith(".jar")) : false  #  inside isResourcesJar method
		 * (closeJarFile) : false  #  inside isResourcesJar method
		 * (isResourcesJar(jarURLConnection)) : false  #  inside addUrlConnection method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//StaticResourceJars target = new StaticResourceJars();
		//URL uRLMock = mock(URL.class, "false");
		//URL[][] uRLArray3 = new URL[][] { uRLMock };
		//URL uRLMock2 = mock(URL.class, "true");
		//URL[][][] uRLArray5 = new URL[][][] { uRLMock2 };
		//URL uRLMock3 = mock(URL.class, "false");
		//URL[][][] uRLArray6 = new URL[][][] { uRLMock3 };
		//URL[][] uRLArray4 = new URL[][] { uRLArray5, uRLArray6 };
		//URL uRLMock4 = mock(URL.class);
		//URL[][][] uRLArray8 = new URL[][][] { uRLMock4 };
		//URL[][] uRLArray7 = new URL[][] { uRLArray8 };
		//URL uRLMock5 = mock(URL.class);
		//URL[][][] uRLArray10 = new URL[][][] { uRLMock5 };
		//URL[][] uRLArray9 = new URL[][] { uRLArray10 };
		//URL[] uRLArray2 = new URL[] { uRLArray3, uRLArray4, uRLArray7, uRLArray9 };
		//URL[] uRLArray = new URL[] { uRLArray2 };
		//Act Statement(s)
		//List<URL> result = target.getUrlsFrom(uRLArray);
		//Assert statement(s)
		//assertAll("result", () -> assertThat(result.size(), equalTo(0)));
	}

	//Sapient generated method id: ${0bf0b868-e626-3c78-9477-da4fe5be3d15}, hash: 641BEED1212E77A9BA0F1ED3E0CD7893
	@Disabled()
	@Test()
	void getUrlsFromWhenIsResourcesJarFile() throws URISyntaxException, IOException {
		/* Branches:
		 * (for-each(urls)) : true
		 * (!"file".equals(url.getProtocol())) : false  #  inside addUrl method
		 * (file != null) : true  #  inside addUrl method
		 * (file.isDirectory()) : true  #  inside addUrlFile method
		 * (new File(file, "META-INF/resources").isDirectory()) : false  #  inside addUrlFile method
		 * (jarFile.getName().endsWith(".jar")) : true  #  inside isResourcesJar method
		 * (jarFile.getJarEntry("META-INF/resources") != null) : true  #  inside isResourcesJar method
		 * (closeJarFile) : true  #  inside isResourcesJar method
		 * (isResourcesJar(file)) : true  #  inside addUrlFile method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class java.io.File
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		StaticResourceJars target = new StaticResourceJars();
		URL[] uRLArray = new URL[] { uRLMock };
		//Act Statement(s)
		List<URL> result = target.getUrlsFrom(uRLArray);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(1));
			assertThat(result.get(0), is(instanceOf(URL.class)));
		});
	}

	//Sapient generated method id: ${6e918a8d-396c-3e99-a462-17377cb7dfbc}, hash: 730448AF299879ABDEE4B572D1658CAB
	@Test()
	void getUrlsFromWhenIsResourcesJarNotFile() throws URISyntaxException, IOException {
		/* Branches:
		 * (for-each(urls)) : true
		 * (!"file".equals(url.getProtocol())) : false  #  inside addUrl method
		 * (file != null) : true  #  inside addUrl method
		 * (file.isDirectory()) : true  #  inside addUrlFile method
		 * (new File(file, "META-INF/resources").isDirectory()) : false  #  inside addUrlFile method
		 * (jarFile.getName().endsWith(".jar")) : true  #  inside isResourcesJar method
		 * (jarFile.getJarEntry("META-INF/resources") != null) : false  #  inside isResourcesJar method
		 * (closeJarFile) : true  #  inside isResourcesJar method
		 * (isResourcesJar(file)) : false  #  inside addUrlFile method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class java.io.File
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		StaticResourceJars target = new StaticResourceJars();
		URL[] uRLArray = new URL[] { uRLMock, uRLMock2 };
		//Act Statement(s)
		List<URL> result = target.getUrlsFrom(uRLArray);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result.size(), equalTo(0)));
	}

	//Sapient generated method id: ${8d9ccbe3-94ef-35a9-a39d-53413083602a}, hash: B40F532E55F10FC076D85F1BEC47D11F
	@Disabled()
	@Test()
	void getUrlsFromWhenCloseJarFileAndIsResourcesJarJarURLConnection() throws URISyntaxException, IOException {
		/* Branches:
		 * (for-each(urls)) : true
		 * (!"file".equals(url.getProtocol())) : false  #  inside addUrl method
		 * (file != null) : false  #  inside addUrl method
		 * (connection instanceof JarURLConnection jarURLConnection) : true  #  inside addUrlConnection method
		 * (!connection.getUseCaches()) : true  #  inside isResourcesJar method
		 * (jarFile.getName().endsWith(".jar")) : true  #  inside isResourcesJar method
		 * (jarFile.getJarEntry("META-INF/resources") != null) : true  #  inside isResourcesJar method
		 * (closeJarFile) : true  #  inside isResourcesJar method
		 * (isResourcesJar(jarURLConnection)) : true  #  inside addUrlConnection method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class java.io.File
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		StaticResourceJars target = new StaticResourceJars();
		URL[] uRLArray = new URL[] { uRLMock, uRLMock2 };
		//Act Statement(s)
		List<URL> result = target.getUrlsFrom(uRLArray);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(2));
			assertThat(result.get(0), is(instanceOf(URL.class)));
		});
	}

	//Sapient generated method id: ${4e07e697-2c30-363e-a847-64e52ead09fb}, hash: F230D6ECD733D9C4AA35C140B5429897
	@Test()
	void getUrlsFromWhenCaughtIOExceptionAndIsResourcesJarNotJarURLConnection() throws IOException, URISyntaxException {
		/* Branches:
		 * (for-each(urls)) : true
		 * (!"file".equals(url.getProtocol())) : false  #  inside addUrl method
		 * (file != null) : false  #  inside addUrl method
		 * (connection instanceof JarURLConnection jarURLConnection) : true  #  inside addUrlConnection method
		 * (!connection.getUseCaches()) : true  #  inside isResourcesJar method
		 * (jarFile.getName().endsWith(".jar")) : true  #  inside isResourcesJar method
		 * (jarFile.getJarEntry("META-INF/resources") != null) : true  #  inside isResourcesJar method
		 * (closeJarFile) : true  #  inside isResourcesJar method
		 * (catch-exception (IOException)) : true  #  inside isResourcesJar method
		 * (isResourcesJar(jarURLConnection)) : false  #  inside addUrlConnection method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//StaticResourceJars target = new StaticResourceJars();
		//URL uRLMock = mock(URL.class, "JarFile");
		//URL[][] uRLArray3 = new URL[][] { uRLMock };
		//URL[] uRLArray2 = new URL[] { uRLArray3 };
		//URL[] uRLArray = new URL[] { uRLArray2 };
		//Act Statement(s)
		//List<URL> result = target.getUrlsFrom(uRLArray);
		//Assert statement(s)
		//assertAll("result", () -> assertThat(result.size(), equalTo(0)));
	}
}
