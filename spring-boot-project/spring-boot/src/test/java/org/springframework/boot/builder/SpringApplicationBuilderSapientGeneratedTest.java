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
import org.junit.jupiter.api.Disabled;

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

    //Sapient generated method id: ${createSpringApplicationTest}, hash: 2756D521CCD6A33340DC9966F8217C09
    @Test()
    void createSpringApplicationTest() {
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

    //Sapient generated method id: ${contextTest}, hash: 5B6DB936F3FDFB84EA8649A9712A723F
    @Test()
    void contextTest() {
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

    //Sapient generated method id: ${applicationTest}, hash: 08EDD2B3D727A96ADCF804119BE464B8
    @Test()
    void applicationTest() {
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

    //Sapient generated method id: ${runWhenThisNotRegisterShutdownHookAppliedAndThisRunningCompareAndSetFalseTrue}, hash: EAD548BBD85349C50AE7269CC3146E0B
    @Test()
    void runWhenThisNotRegisterShutdownHookAppliedAndThisRunningCompareAndSetFalseTrue() {
        /* Branches:
         * (this.running.get()) : false
         * (this.parent != null) : true  #  inside configureAsChildIfNecessary method
         * (!this.configuredAsChild) : true  #  inside configureAsChildIfNecessary method
         * (!this.registerShutdownHookApplied) : true  #  inside configureAsChildIfNecessary method
         * (this.running.compareAndSet(false, true)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: application - Method: addInitializers
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

    //Sapient generated method id: ${buildTest}, hash: F926C7CA9FAFCE588D954255949A8315
    @Test()
    void buildTest() {
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

    //Sapient generated method id: ${build1WhenThisNotRegisterShutdownHookApplied}, hash: FE14F033372E31D8F85E1897FED6AB35
    @Test()
    void build1WhenThisNotRegisterShutdownHookApplied() {
        /* Branches:
         * (this.parent != null) : true  #  inside configureAsChildIfNecessary method
         * (!this.configuredAsChild) : true  #  inside configureAsChildIfNecessary method
         * (!this.registerShutdownHookApplied) : true  #  inside configureAsChildIfNecessary method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: application - Method: addInitializers
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

    //Sapient generated method id: ${childTest}, hash: 187B7F63548B90501F6AC2A667444FA0
    @Test()
    void childTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: child - Method: sources
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

    //Sapient generated method id: ${parentWhenThisParentIsNull}, hash: ED09BB4E78291310A59D31A33ACFF4FF
    @Test()
    void parentWhenThisParentIsNull() {
        /* Branches:
         * (this.parent == null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type SpringApplicationBuilder - Method: web
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

    //Sapient generated method id: ${parentWhenThisParentIsNotNull}, hash: EA60A7EDEF7FE2A0E28061957AE2C4FF
    @Test()
    void parentWhenThisParentIsNotNull() {
        /* Branches:
         * (this.parent == null) : false
         */
        //Arrange Statement(s)
        ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
        Class<?>[] classArray = new Class[] {};
        target = new SpringApplicationBuilder(resourceLoaderMock, classArray);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        SpringApplicationBuilder springApplicationBuilderMock = mock(SpringApplicationBuilder.class);
        Class<?>[] classArray2 = new Class[] {};
        doReturn(springApplicationBuilderMock).when(parentMock).sources(classArray2);
        //Act Statement(s)
        SpringApplicationBuilder result = target.parent(classArray2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(parentMock));
            verify(parentMock, atLeast(1)).sources(classArray2);
        });
    }

    //Sapient generated method id: ${parent1ThrowsNullPointerException}, hash: AA7010FF5BAA3BF0E59B5CD417DF83FC
    @Disabled()
    @Test()
    void parent1ThrowsNullPointerException() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

    //Sapient generated method id: ${siblingWhenThisParentIsNotNull}, hash: E6569B594DCF6424EE16527621E90BB3
    @Disabled()
    @Test()
    void siblingWhenThisParentIsNotNull() {
        /* Branches:
         * (this.context == null) : true  #  inside runAndExtractParent method
         * (this.parent != null) : true  #  inside runAndExtractParent method
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

    //Sapient generated method id: ${siblingWhenThisParentIsNullThrowsIllegalStateException}, hash: 141AB0893744AA9141C240990C9D7F9E
    @Disabled()
    @Test()
    void siblingWhenThisParentIsNullThrowsIllegalStateException() {
        /* Branches:
         * (this.context == null) : true  #  inside runAndExtractParent method
         * (this.parent != null) : false  #  inside runAndExtractParent method
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

    //Sapient generated method id: ${sibling1WhenThisParentIsNotNull}, hash: FBEEA40B0326673AF06C75B1F1ACB825
    @Disabled()
    @Test()
    void sibling1WhenThisParentIsNotNull() {
        /* Branches:
         * (this.context == null) : true  #  inside runAndExtractParent method
         * (this.parent != null) : true  #  inside runAndExtractParent method
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

    //Sapient generated method id: ${sibling1WhenThisParentIsNullThrowsIllegalStateException}, hash: 1DA87FE118117D86A3EF067260C045F8
    @Disabled()
    @Test()
    void sibling1WhenThisParentIsNullThrowsIllegalStateException() {
        /* Branches:
         * (this.context == null) : true  #  inside runAndExtractParent method
         * (this.parent != null) : false  #  inside runAndExtractParent method
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

    //Sapient generated method id: ${contextFactoryTest}, hash: 88D4BC5A86AD132D03C64B5381ADC0CC
    @Test()
    void contextFactoryTest() {
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

    //Sapient generated method id: ${sourcesTest}, hash: 3C14C12EFD382580B83222E95F6E8065
    @Test()
    void sourcesTest() {
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

    //Sapient generated method id: ${webTest}, hash: 662B6F4210612466438C439D91A055D5
    @Test()
    void webTest() {
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

    //Sapient generated method id: ${logStartupInfoTest}, hash: 6F9E40583842534D38D00D3ECFFF3418
    @Test()
    void logStartupInfoTest() {
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

    //Sapient generated method id: ${bannerTest}, hash: E9838CEA5920228A543D190F8B912421
    @Test()
    void bannerTest() {
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

    //Sapient generated method id: ${bannerModeTest}, hash: A3912277205A788FDEE63424D35DC082
    @Test()
    void bannerModeTest() {
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

    //Sapient generated method id: ${headlessTest}, hash: 13EEC7AEE93E2A73D931A0F4CA7819D5
    @Test()
    void headlessTest() {
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

    //Sapient generated method id: ${registerShutdownHookTest}, hash: 01F2A26CA5FFB7DC471A59C91D8A3DB8
    @Test()
    void registerShutdownHookTest() {
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

    //Sapient generated method id: ${mainTest}, hash: 30B1A293E7451D63AD5E6BB0C76B88CB
    @Test()
    void mainTest() {
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

    //Sapient generated method id: ${addCommandLinePropertiesTest}, hash: 3F76B44F3A79EA67EFB76EE970DD6739
    @Test()
    void addCommandLinePropertiesTest() {
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

    //Sapient generated method id: ${setAddConversionServiceTest}, hash: 1C31C9BD08D46319C3A037CEBD80D6CB
    @Test()
    void setAddConversionServiceTest() {
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

    //Sapient generated method id: ${addBootstrapRegistryInitializerTest}, hash: E59765A727CEEA5B7E8657F1CCBB2511
    @Test()
    void addBootstrapRegistryInitializerTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: application - Method: addBootstrapRegistryInitializer
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

    //Sapient generated method id: ${lazyInitializationTest}, hash: AA691221295C564D06ACE51236546BD3
    @Test()
    void lazyInitializationTest() {
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

    //Sapient generated method id: ${propertiesWhenIndexNotGreaterThan0}, hash: C7A50D514E8010F17163FDE76B351381
    @Test()
    void propertiesWhenIndexNotGreaterThan0() {
        /* Branches:
         * (for-each(properties)) : true  #  inside getMapFromKeyValuePairs method
         * (for-each(candidates)) : true  #  inside lowestIndexOf method
         * (candidateIndex > 0) : false  #  inside lowestIndexOf method
         * (index > 0) : false  #  inside getMapFromKeyValuePairs method
         * (index > 0) : false  #  inside getMapFromKeyValuePairs method
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

    //Sapient generated method id: ${propertiesWhenIndexGreaterThan0}, hash: C329B8AB43C29C387EEBC14A521246D6
    @Test()
    void propertiesWhenIndexGreaterThan0() {
        /* Branches:
         * (for-each(properties)) : true  #  inside getMapFromKeyValuePairs method
         * (for-each(candidates)) : true  #  inside lowestIndexOf method
         * (candidateIndex > 0) : true  #  inside lowestIndexOf method
         * (index != -1) : false  #  inside lowestIndexOf method
         * (index > 0) : true  #  inside getMapFromKeyValuePairs method
         * (index > 0) : true  #  inside getMapFromKeyValuePairs method
         */
        //Arrange Statement(s)
        ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);
        Class<?>[] classArray = new Class[] {};
        target = spy(new SpringApplicationBuilder(resourceLoaderMock, classArray));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        SpringApplicationBuilder springApplicationBuilderMock = mock(SpringApplicationBuilder.class);
        Map<String, Object> stringObjectMap = new HashMap<>();
        stringObjectMap.put("A", "C:");
        doReturn(springApplicationBuilderMock).when(target).properties(eq(stringObjectMap));
        String[] stringArray = new String[] { "A:C:" };
        //Act Statement(s)
        SpringApplicationBuilder result = target.properties(stringArray);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(springApplicationBuilderMock));
            verify(target).properties(eq(stringObjectMap));
        });
    }

    //Sapient generated method id: ${properties1WhenCollectionsListPropertiesPropertyNamesIsNotEmpty}, hash: 1633FCBFBB22B097535F064740A1650B
    @Test()
    void properties1WhenCollectionsListPropertiesPropertyNamesIsNotEmpty() {
        /* Branches:
         * (for-each(Collections.list(properties.propertyNames()))) : true  #  inside getMapFromProperties method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

    //Sapient generated method id: ${properties2WhenThisParentIsNotNull}, hash: 1C743B50F5E1D14E28A7921B4EA8A0BF
    @Test()
    void properties2WhenThisParentIsNotNull() {
        /* Branches:
         * (this.parent != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: application - Method: setDefaultProperties
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
        SpringApplicationBuilder springApplicationBuilderMock = mock(SpringApplicationBuilder.class);
        Map<String, Object> stringObjectMap = new HashMap<>();
        doReturn(springApplicationBuilderMock).when(parentMock).properties(eq(stringObjectMap));
        SpringApplicationBuilder springApplicationBuilderMock2 = mock(SpringApplicationBuilder.class);
        doReturn(springApplicationBuilderMock2).when(parentMock).environment((ConfigurableEnvironment) null);
        Map<String, Object> stringObjectMap2 = new HashMap<>();
        //Act Statement(s)
        SpringApplicationBuilder result = target.properties(stringObjectMap2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(parentMock).properties(eq(stringObjectMap));
            verify(parentMock).environment((ConfigurableEnvironment) null);
        });
    }

    //Sapient generated method id: ${profilesTest}, hash: D914AAC45EFDAF9DC3927ED6337FC04C
    @Disabled()
    @Test()
    void profilesTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: application - Method: setAdditionalProfiles
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

    //Sapient generated method id: ${beanNameGeneratorTest}, hash: 4FDDBD1757E5B203B793102AD671B14D
    @Test()
    void beanNameGeneratorTest() {
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

    //Sapient generated method id: ${environmentTest}, hash: 275099DEF469F9AB11AE014FDCC0FEEB
    @Test()
    void environmentTest() {
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

    //Sapient generated method id: ${environmentPrefixTest}, hash: FB41789765B74D582FFFA93A8C79B52E
    @Test()
    void environmentPrefixTest() {
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

    //Sapient generated method id: ${resourceLoaderTest}, hash: 503459E78DE6F599EE3BDEC4279A730A
    @Test()
    void resourceLoaderTest() {
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

    //Sapient generated method id: ${initializersTest}, hash: 838AFF67324CF4EA4CE78159068D22E9
    @Test()
    void initializersTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: application - Method: addInitializers
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

    //Sapient generated method id: ${listenersTest}, hash: 786F8203867CC1A810364DC17D456046
    @Test()
    void listenersTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: application - Method: addListeners
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

    //Sapient generated method id: ${applicationStartupTest}, hash: 5B602202BD0514EB6C39CDDDB142599A
    @Test()
    void applicationStartupTest() {
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

    //Sapient generated method id: ${allowCircularReferencesTest}, hash: 729C700961C0BFEB8E314EC9772E407A
    @Test()
    void allowCircularReferencesTest() {
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
