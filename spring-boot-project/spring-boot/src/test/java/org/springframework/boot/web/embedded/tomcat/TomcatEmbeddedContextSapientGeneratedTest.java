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
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
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

    //Sapient generated method id: ${loadOnStartupTest}, hash: 69FEDB59FD2845B1C89B6DD51FC6D884
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

    //Sapient generated method id: ${setManagerWhenManagerInstanceOfManagerBase}, hash: F5A4EDC81E473191E22C98CED9B71CEF
    @Test()
    void setManagerWhenManagerInstanceOfManagerBase() {
        /* Branches:
         * (manager instanceof ManagerBase) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: support - Method: firePropertyChange
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ManagerBase managerMock = mock(ManagerBase.class);
        doNothing().when(managerMock).setSessionIdGenerator((LazySessionIdGenerator) any());
        target = new TomcatEmbeddedContext();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(managerMock).setContext(target);
        //Act Statement(s)
        target.setManager(managerMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(managerMock).setSessionIdGenerator((LazySessionIdGenerator) any());
            verify(managerMock).setContext(target);
        });
    }

    //Sapient generated method id: ${setManagerWhenManagerInstanceOfManagerBase2}, hash: F0FBEBC3A7F2EA22D60D062064824764
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

    //Sapient generated method id: ${deferredLoadOnStartupWhenExistingLoaderIsNotNull}, hash: A8CFDC5E5D8BCE19B9184BB4C805B8DA
    @Disabled()
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

    //Sapient generated method id: ${deferredLoadOnStartupWhenClassLoaderIsNullAndExistingLoaderIsNull}, hash: AB07AEA544A3AA7BECFA92CF76749FB5
    @Disabled()
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

    //Sapient generated method id: ${findMimeMappingsWhenThisMimeMappingsIsNull}, hash: C0085D21329A55F352CFD5A5FC6A9347
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

    //Sapient generated method id: ${findMimeMappingWhenThisMimeMappingsIsNull}, hash: F5C5CB5936660637B0ED94391225AF1D
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
