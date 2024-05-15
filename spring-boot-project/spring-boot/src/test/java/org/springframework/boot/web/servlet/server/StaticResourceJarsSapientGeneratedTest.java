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

    private final URL uRLMock3 = mock(URL.class);

    //Sapient generated method id: ${getUrlsWhenClassLoaderNotInstanceOfURLClassLoader}, hash: AFA0E733A3B4F3F278B35A08D1C829C2
    @Disabled()
    @Test()
    void getUrlsWhenClassLoaderNotInstanceOfURLClassLoader() throws URISyntaxException, IOException {
        /* Branches:
         * (classLoader instanceof URLClassLoader urlClassLoader) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type RuntimeMXBean - Method: getClassPath
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

    //Sapient generated method id: ${getUrlsFromWhenCaughtURISyntaxExceptionThrowsIllegalStateException}, hash: DF1663B604F2EA27F315CA19D53B2B6E
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
        URL urlMock = mock(URL.class, "uRL");
        URI uRI = URI.create("str1");
        doReturn(uRI).when(urlMock).toURI();
        StaticResourceJars target = new StaticResourceJars();
        URL[] uRLArray = new URL[] { urlMock };
        IllegalStateException illegalStateException = new IllegalStateException("Failed to create File from URL 'uRL'");
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

    //Sapient generated method id: ${getUrlsFromWhenIsResourcesJarNotJarURLConnection}, hash: 181B1C77FB10C4EBC8487AD04C0582BD
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
        URL[] uRLArray = new URL[] { uRLMock, uRLMock2, uRLMock3 };
        //Act Statement(s)
        List<URL> result = target.getUrlsFrom(uRLArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getUrlsFromWhenIsResourcesJarJarURLConnection}, hash: 87CFFE13EA6582E1630BBFFE2D94DEB1
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

    //Sapient generated method id: ${getUrlsFromWhenCaughtIOExceptionThrowsIllegalStateException}, hash: 731A0AF9A69D7D38E108CEFF22745A94
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

    //Sapient generated method id: ${getUrlsFromWhenIsResourcesJarNotFile}, hash: 8F616666D31AE307E4CC7924ED784A6F
    @Disabled()
    @Test()
    void getUrlsFromWhenIsResourcesJarNotFile() throws URISyntaxException, IOException {
        /* Branches:
         * (for-each(urls)) : true
         * (!"file".equals(url.getProtocol())) : false  #  inside addUrl method
         * (file != null) : true  #  inside addUrl method
         * (file.isDirectory()) : true  #  inside addUrlFile method
         * (new File(file, "META-INF/resources").isDirectory()) : false  #  inside addUrlFile method
         * (jarFile.getName().endsWith(".jar")) : false  #  inside isResourcesJar method
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
        URL[] uRLArray = new URL[] { uRLMock, uRLMock2, uRLMock3 };
        //Act Statement(s)
        List<URL> result = target.getUrlsFrom(uRLArray);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(1));
            assertThat(result.get(0), is(instanceOf(URL.class)));
        });
    }

    //Sapient generated method id: ${getUrlsFromWhenIsResourcesJarFile}, hash: 385FA11EE32CB83586005351748FAC05
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
        URL[] uRLArray = new URL[] { uRLMock, uRLMock2 };
        //Act Statement(s)
        List<URL> result = target.getUrlsFrom(uRLArray);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(2));
            assertThat(result.get(0), is(instanceOf(URL.class)));
        });
    }

    //Sapient generated method id: ${getUrlsFromWhenCloseJarFileAndIsResourcesJarJarURLConnection}, hash: A526E2D49364DE3700F9DB37B44CD098
    @Test()
    void getUrlsFromWhenCloseJarFileAndIsResourcesJarJarURLConnection() throws URISyntaxException, IOException {
        /* Branches:
         * (for-each(urls)) : true
         * (!"file".equals(url.getProtocol())) : false  #  inside addUrl method
         * (catch-exception (IllegalArgumentException)) : true  #  inside toFile method
         * (file != null) : false  #  inside addUrl method
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
        //StaticResourceJars target = new StaticResourceJars();
        //URL[][] uRLArray3 = new URL[][] { uRLMock };
        //URL[] uRLArray2 = new URL[] { uRLArray3 };
        //URL[] uRLArray = new URL[] { uRLArray2 };
        //Act Statement(s)
        //List<URL> result = target.getUrlsFrom(uRLArray);
        //Assert statement(s)
        //assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }
}
