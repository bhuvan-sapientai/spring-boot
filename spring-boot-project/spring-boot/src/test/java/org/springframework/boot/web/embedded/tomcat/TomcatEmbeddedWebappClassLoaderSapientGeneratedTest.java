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
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class TomcatEmbeddedWebappClassLoaderSapientGeneratedTest {

    //Sapient generated method id: ${findResourceTest}, hash: DB184BB0F787C486876D77C851225322
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

    //Sapient generated method id: ${findResourcesTest}, hash: 7B3DF86BA94C2D3D04302869EE809DBD
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

    //Sapient generated method id: ${loadClass1WhenResolve}, hash: 6BE4C743276B8070BE122A0767BF382C
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

    //Sapient generated method id: ${loadClass1WhenResultIsNotNullAndNotResolve}, hash: A9D04B48BA8C04F4C184E04829D7AC91
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

    //Sapient generated method id: ${loadClass1WhenResultIsNullThrowsClassNotFoundException}, hash: A613B4F2309D7133914C10DD8A6DE3DC
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

    //Sapient generated method id: ${loadClass1WhenResultIsNullAndResultIsNotNullAndNotResolve}, hash: F0A0D79A75461A790CB95C8CC614BD7E
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

    //Sapient generated method id: ${loadClass1WhenResultIsNotNullAndResultIsNotNullAndNotResolve}, hash: 7417DB43287B3241250B77BD07523E5B
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

    //Sapient generated method id: ${loadClass1WhenThisParentIsNotNullAndResultIsNullAndResultIsNotNullAndNotResolve}, hash: D3595079E23E0F8A8B2F32535782DB4B
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

    //Sapient generated method id: ${loadClass1WhenThisNotDelegateAndFilterNameTrueAndThisParentIsNotNullAndResultIsNullAndResultIsNotNullAndNotResolve5}, hash: E52FB2A3E210FC306CFBC5F78DEFF580
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

    //Sapient generated method id: ${loadClass1WhenThisParentIsNotNullAndResultIsNotNullAndNotResolve}, hash: 0561653E945BFE3198DB073E7E787C41
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

    //Sapient generated method id: ${loadClass1WhenThisNotDelegateAndFilterNotNameTrueAndResultIsNullAndThisParentIsNotNullAndResultIsNotNullAndNotResolve3}, hash: 487C415C254FE0FCEF6060D7A9D9DD42
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

    //Sapient generated method id: ${loadClass1WhenThisNotDelegateAndFilterNotNameTrueAndResultIsNullAndThisParentIsNotNullAndResultIsNotNullAndNotResolve4}, hash: 2D3A9E17F5FDC3F1BAA0D661336BE709
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

    //Sapient generated method id: ${loadClass1WhenThisNotDelegateAndFilterNotNameTrueAndResultIsNullAndThisParentIsNotNullAndResultIsNotNullAndNotResolve5}, hash: 7F382AEC150E8B09068BA2E1188843B9
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

    //Sapient generated method id: ${loadClass1WhenThisNotDelegateAndFilterNotNameTrueAndResultIsNullAndThisParentIsNotNullAndResultIsNotNullAndNotResolve6}, hash: EB36E90C7E197D8BFF2FC5080F9C90DC
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

    //Sapient generated method id: ${loadClass1WhenThisNotDelegateAndFilterNotNameTrueAndResultIsNullAndThisParentIsNotNullAndResultIsNotNullAndNotResolve7}, hash: 216BA1A5097D6A4B8B549905C2346230
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

    //Sapient generated method id: ${loadClass1WhenThisNotDelegateAndFilterNotNameTrueAndResultIsNullAndThisParentIsNotNullAndResultIsNotNullAndNotResolve8}, hash: 21FC34CA3F0AA5652DB45302CAD48E77
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

    //Sapient generated method id: ${loadClass1WhenThisNotDelegateAndFilterNotNameTrueAndResultIsNullAndThisParentIsNotNullAndResultIsNotNullAndNotResolve9}, hash: E6EAECB20189433C7DFE5CF5B3554F76
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

    //Sapient generated method id: ${loadClass1WhenThisNotDelegateAndFilterNotNameTrueAndResultIsNullAndThisParentIsNotNullAndResultIsNotNullAndNotResolve10}, hash: 3E02B44533D44AB27D62D31C9E5DEFBF
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

    //Sapient generated method id: ${loadClass1WhenThisParentIsNullAndResultIsNullThrowsClassNotFoundException}, hash: D2473729C1779B4B72B9E64E73C39BCE
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

    //Sapient generated method id: ${addURLWhenLoggerIsTraceEnabled}, hash: 2128860D3BB0876C4BCCE3EE8D4E9AAD
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
        URL uRLMock = mock(URL.class, "url");
        //Act Statement(s)
        target.addURL(uRLMock);
    }
}
