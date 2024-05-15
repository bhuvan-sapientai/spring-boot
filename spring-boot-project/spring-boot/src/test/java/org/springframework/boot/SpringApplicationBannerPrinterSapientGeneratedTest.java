package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.env.Environment;
import org.apache.commons.logging.impl.NoOpLog;
import java.io.OutputStream;
import java.io.PrintStream;
import org.springframework.core.io.Resource;
import java.net.URL;
import java.io.ByteArrayOutputStream;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringApplicationBannerPrinterSapientGeneratedTest {

    private final ResourceLoader resourceLoaderMock = mock(ResourceLoader.class, "resourceLoader");

    private final Banner bannerMock = mock(Banner.class);

    private final Environment environmentMock = mock(Environment.class);

    private final Resource resourceMock = mock(Resource.class);

    private final URL uRLMock = mock(URL.class);

    //Sapient generated method id: ${printWhenTextBannerIsNotNull}, hash: 3DDD8D23FA6946788B5F25AF837CDCF5
    @Disabled()
    @Test()
    void printWhenTextBannerIsNotNull() throws IOException, UnsupportedEncodingException {
        /* Branches:
         * (resource.exists()) : true  #  inside getTextBanner method
         * (!resource.getURL().toExternalForm().contains("liquibase-core")) : true  #  inside getTextBanner method
         * (textBanner != null) : true  #  inside getBanner method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn("return_of_getProperty1").when(environmentMock).getProperty("spring.banner.location", "banner.txt");
        doReturn("B").when(environmentMock).getProperty("spring.banner.charset", "UTF-8");
        SpringApplicationBannerPrinter target = new SpringApplicationBannerPrinter(resourceLoaderMock, bannerMock);
        doReturn(resourceMock).when(resourceLoaderMock).getResource("return_of_getProperty1");
        doReturn(true).when(resourceMock).exists();
        doReturn(uRLMock).when(resourceMock).getURL();
        NoOpLog noOpLog = new NoOpLog();
        //Act Statement(s)
        Banner result = target.print(environmentMock, Object.class, noOpLog);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(environmentMock).getProperty("spring.banner.location", "banner.txt");
            verify(environmentMock).getProperty("spring.banner.charset", "UTF-8");
            verify(resourceLoaderMock).getResource("return_of_getProperty1");
            verify(resourceMock).exists();
            verify(resourceMock).getURL();
        });
    }

    //Sapient generated method id: ${printWhenThisFallbackBannerIsNotNull}, hash: B55F01BF6D6C07B32ED572B88856D033
    @Disabled()
    @Test()
    void printWhenThisFallbackBannerIsNotNull() throws IOException, UnsupportedEncodingException {
        /* Branches:
         * (resource.exists()) : true  #  inside getTextBanner method
         * (!resource.getURL().toExternalForm().contains("liquibase-core")) : false  #  inside getTextBanner method
         * (textBanner != null) : false  #  inside getBanner method
         * (this.fallbackBanner != null) : true  #  inside getBanner method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn("return_of_getProperty1").when(environmentMock).getProperty("spring.banner.location", "banner.txt");
        doReturn("A").when(environmentMock).getProperty("spring.banner.charset", "UTF-8");
        doNothing().when(bannerMock).printBanner(eq(environmentMock), eq(Object.class), (PrintStream) any());
        SpringApplicationBannerPrinter target = new SpringApplicationBannerPrinter(resourceLoaderMock, bannerMock);
        doReturn(resourceMock).when(resourceLoaderMock).getResource("return_of_getProperty1");
        doReturn(true).when(resourceMock).exists();
        doReturn(uRLMock).when(resourceMock).getURL();
        NoOpLog noOpLog = new NoOpLog();
        //Act Statement(s)
        Banner result = target.print(environmentMock, Object.class, noOpLog);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(environmentMock).getProperty("spring.banner.location", "banner.txt");
            verify(environmentMock).getProperty("spring.banner.charset", "UTF-8");
            verify(bannerMock).printBanner(eq(environmentMock), eq(Object.class), (PrintStream) any());
            verify(resourceLoaderMock).getResource("return_of_getProperty1");
            verify(resourceMock).exists();
            verify(resourceMock).getURL();
        });
    }

    //Sapient generated method id: ${printWhenTextBannerIsNullAndThisFallbackBannerIsNull}, hash: F90333824B045932D69ADB42CA1CA869
    @Disabled()
    @Test()
    void printWhenTextBannerIsNullAndThisFallbackBannerIsNull() throws IOException, UnsupportedEncodingException {
        /* Branches:
         * (resource.exists()) : true  #  inside getTextBanner method
         * (!resource.getURL().toExternalForm().contains("liquibase-core")) : false  #  inside getTextBanner method
         * (textBanner != null) : false  #  inside getBanner method
         * (this.fallbackBanner != null) : false  #  inside getBanner method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn("return_of_getProperty1").when(environmentMock).getProperty("spring.banner.location", "banner.txt");
        doReturn("A").when(environmentMock).getProperty("spring.banner.charset", "UTF-8");
        SpringApplicationBannerPrinter target = new SpringApplicationBannerPrinter(resourceLoaderMock, (Banner) null);
        doReturn(resourceMock).when(resourceLoaderMock).getResource("return_of_getProperty1");
        doReturn(true).when(resourceMock).exists();
        doReturn(uRLMock).when(resourceMock).getURL();
        NoOpLog noOpLog = new NoOpLog();
        //Act Statement(s)
        Banner result = target.print(environmentMock, Object.class, noOpLog);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(environmentMock).getProperty("spring.banner.location", "banner.txt");
            verify(environmentMock).getProperty("spring.banner.charset", "UTF-8");
            verify(resourceLoaderMock).getResource("return_of_getProperty1");
            verify(resourceMock).exists();
            verify(resourceMock).getURL();
        });
    }

    //Sapient generated method id: ${printWhenThisFallbackBannerIsNullAndCaughtUnsupportedEncodingException}, hash: 4F3AAFD23823A9F997DE03A3C2304236
    @Test()
    void printWhenThisFallbackBannerIsNullAndCaughtUnsupportedEncodingException() throws IOException, UnsupportedEncodingException {
        /* Branches:
         * (resource.exists()) : false  #  inside getTextBanner method
         * (textBanner != null) : false  #  inside getBanner method
         * (this.fallbackBanner != null) : false  #  inside getBanner method
         * (catch-exception (UnsupportedEncodingException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: banner - Method: printBanner
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn("return_of_getProperty1").when(environmentMock).getProperty("spring.banner.location", "banner.txt");
        doReturn("A").when(environmentMock).getProperty("spring.banner.charset", "UTF-8");
        SpringApplicationBannerPrinter target = new SpringApplicationBannerPrinter(resourceLoaderMock, (Banner) null);
        doReturn(resourceMock).when(resourceLoaderMock).getResource("return_of_getProperty1");
        doReturn(false).when(resourceMock).exists();
        NoOpLog noOpLog = new NoOpLog();
        //Act Statement(s)
        Banner result = target.print(environmentMock, Object.class, noOpLog);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(environmentMock).getProperty("spring.banner.location", "banner.txt");
            verify(environmentMock).getProperty("spring.banner.charset", "UTF-8");
            verify(resourceLoaderMock).getResource("return_of_getProperty1");
            verify(resourceMock).exists();
        });
    }

    //Sapient generated method id: ${printWhenTextBannerIsNullAndThisFallbackBannerIsNotNull}, hash: AA4BD54EABB771DF9C49099C47AA24B8
    @Disabled()
    @Test()
    void printWhenTextBannerIsNullAndThisFallbackBannerIsNotNull() throws IOException, UnsupportedEncodingException {
        /* Branches:
         * (resource.exists()) : true  #  inside getTextBanner method
         * (!resource.getURL().toExternalForm().contains("liquibase-core")) : true  #  inside getTextBanner method
         * (catch-exception (IOException)) : true  #  inside getTextBanner method
         * (textBanner != null) : false  #  inside getBanner method
         * (this.fallbackBanner != null) : true  #  inside getBanner method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn("return_of_getProperty1").when(environmentMock).getProperty("spring.banner.location", "banner.txt");
        doReturn("B").when(environmentMock).getProperty("spring.banner.charset", "UTF-8");
        doNothing().when(bannerMock).printBanner(eq(environmentMock), eq(Object.class), (PrintStream) any());
        SpringApplicationBannerPrinter target = new SpringApplicationBannerPrinter(resourceLoaderMock, bannerMock);
        doReturn(resourceMock).when(resourceLoaderMock).getResource("return_of_getProperty1");
        doReturn(true).when(resourceMock).exists();
        doReturn(uRLMock).when(resourceMock).getURL();
        NoOpLog noOpLog = new NoOpLog();
        //Act Statement(s)
        Banner result = target.print(environmentMock, Object.class, noOpLog);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(environmentMock).getProperty("spring.banner.location", "banner.txt");
            verify(environmentMock).getProperty("spring.banner.charset", "UTF-8");
            verify(bannerMock).printBanner(eq(environmentMock), eq(Object.class), (PrintStream) any());
            verify(resourceLoaderMock).getResource("return_of_getProperty1");
            verify(resourceMock).exists();
            verify(resourceMock).getURL();
        });
    }

    //Sapient generated method id: ${print1WhenTextBannerIsNotNull}, hash: 1E0D7060F6B1F0312ADD3C1DBD9A4704
    @Disabled()
    @Test()
    void print1WhenTextBannerIsNotNull() throws IOException {
        /* Branches:
         * (resource.exists()) : true  #  inside getTextBanner method
         * (!resource.getURL().toExternalForm().contains("liquibase-core")) : true  #  inside getTextBanner method
         * (textBanner != null) : true  #  inside getBanner method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn("return_of_getProperty1").when(environmentMock).getProperty("spring.banner.location", "banner.txt");
        SpringApplicationBannerPrinter target = new SpringApplicationBannerPrinter(resourceLoaderMock, bannerMock);
        doReturn(resourceMock).when(resourceLoaderMock).getResource("return_of_getProperty1");
        doReturn(true).when(resourceMock).exists();
        doReturn(uRLMock).when(resourceMock).getURL();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        //Act Statement(s)
        Banner result = target.print(environmentMock, Object.class, printStream);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(environmentMock).getProperty("spring.banner.location", "banner.txt");
            verify(resourceLoaderMock).getResource("return_of_getProperty1");
            verify(resourceMock).exists();
            verify(resourceMock).getURL();
        });
    }

    //Sapient generated method id: ${print1WhenThisFallbackBannerIsNotNull}, hash: 7FDEFBA70571ED35FA9D8F2E889C87D8
    @Disabled()
    @Test()
    void print1WhenThisFallbackBannerIsNotNull() throws IOException {
        /* Branches:
         * (resource.exists()) : true  #  inside getTextBanner method
         * (!resource.getURL().toExternalForm().contains("liquibase-core")) : false  #  inside getTextBanner method
         * (textBanner != null) : false  #  inside getBanner method
         * (this.fallbackBanner != null) : true  #  inside getBanner method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn("return_of_getProperty1").when(environmentMock).getProperty("spring.banner.location", "banner.txt");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        doNothing().when(bannerMock).printBanner(environmentMock, Object.class, printStream);
        SpringApplicationBannerPrinter target = new SpringApplicationBannerPrinter(resourceLoaderMock, bannerMock);
        doReturn(resourceMock).when(resourceLoaderMock).getResource("return_of_getProperty1");
        doReturn(true).when(resourceMock).exists();
        doReturn(uRLMock).when(resourceMock).getURL();
        //Act Statement(s)
        Banner result = target.print(environmentMock, Object.class, printStream);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(environmentMock).getProperty("spring.banner.location", "banner.txt");
            verify(bannerMock).printBanner(environmentMock, Object.class, printStream);
            verify(resourceLoaderMock).getResource("return_of_getProperty1");
            verify(resourceMock).exists();
            verify(resourceMock).getURL();
        });
    }

    //Sapient generated method id: ${print1WhenTextBannerIsNullAndThisFallbackBannerIsNull}, hash: 703BBA2E3B8B5BE8E1EDC1E0B83A7234
    @Disabled()
    @Test()
    void print1WhenTextBannerIsNullAndThisFallbackBannerIsNull() throws IOException {
        /* Branches:
         * (resource.exists()) : true  #  inside getTextBanner method
         * (!resource.getURL().toExternalForm().contains("liquibase-core")) : false  #  inside getTextBanner method
         * (textBanner != null) : false  #  inside getBanner method
         * (this.fallbackBanner != null) : false  #  inside getBanner method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn("return_of_getProperty1").when(environmentMock).getProperty("spring.banner.location", "banner.txt");
        SpringApplicationBannerPrinter target = new SpringApplicationBannerPrinter(resourceLoaderMock, (Banner) null);
        doReturn(resourceMock).when(resourceLoaderMock).getResource("return_of_getProperty1");
        doReturn(true).when(resourceMock).exists();
        doReturn(uRLMock).when(resourceMock).getURL();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        //Act Statement(s)
        Banner result = target.print(environmentMock, Object.class, printStream);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(environmentMock).getProperty("spring.banner.location", "banner.txt");
            verify(resourceLoaderMock).getResource("return_of_getProperty1");
            verify(resourceMock).exists();
            verify(resourceMock).getURL();
        });
    }

    //Sapient generated method id: ${print1WhenTextBannerIsNullAndThisFallbackBannerIsNotNull}, hash: BA184E0A44EAF613A27E4EAFAFAB95A5
    @Disabled()
    @Test()
    void print1WhenTextBannerIsNullAndThisFallbackBannerIsNotNull() throws IOException {
        /* Branches:
         * (resource.exists()) : true  #  inside getTextBanner method
         * (!resource.getURL().toExternalForm().contains("liquibase-core")) : true  #  inside getTextBanner method
         * (catch-exception (IOException)) : true  #  inside getTextBanner method
         * (textBanner != null) : false  #  inside getBanner method
         * (this.fallbackBanner != null) : true  #  inside getBanner method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn("return_of_getProperty1").when(environmentMock).getProperty("spring.banner.location", "banner.txt");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        doNothing().when(bannerMock).printBanner(environmentMock, Object.class, printStream);
        SpringApplicationBannerPrinter target = new SpringApplicationBannerPrinter(resourceLoaderMock, bannerMock);
        doReturn(resourceMock).when(resourceLoaderMock).getResource("return_of_getProperty1");
        doReturn(true).when(resourceMock).exists();
        doReturn(uRLMock).when(resourceMock).getURL();
        //Act Statement(s)
        Banner result = target.print(environmentMock, Object.class, printStream);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(environmentMock).getProperty("spring.banner.location", "banner.txt");
            verify(bannerMock).printBanner(environmentMock, Object.class, printStream);
            verify(resourceLoaderMock).getResource("return_of_getProperty1");
            verify(resourceMock).exists();
            verify(resourceMock).getURL();
        });
    }

    //Sapient generated method id: ${print1WhenCaughtIOExceptionAndTextBannerIsNullAndThisFallbackBannerIsNull}, hash: E163E4E63BB76C52C4EB39AFCB0E3820
    @Disabled()
    @Test()
    void print1WhenCaughtIOExceptionAndTextBannerIsNullAndThisFallbackBannerIsNull() throws IOException {
        /* Branches:
         * (resource.exists()) : true  #  inside getTextBanner method
         * (!resource.getURL().toExternalForm().contains("liquibase-core")) : true  #  inside getTextBanner method
         * (catch-exception (IOException)) : true  #  inside getTextBanner method
         * (textBanner != null) : false  #  inside getBanner method
         * (this.fallbackBanner != null) : false  #  inside getBanner method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn("return_of_getProperty1").when(environmentMock).getProperty("spring.banner.location", "banner.txt");
        SpringApplicationBannerPrinter target = new SpringApplicationBannerPrinter(resourceLoaderMock, (Banner) null);
        doReturn(resourceMock).when(resourceLoaderMock).getResource("return_of_getProperty1");
        doReturn(true).when(resourceMock).exists();
        doReturn(uRLMock).when(resourceMock).getURL();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        //Act Statement(s)
        Banner result = target.print(environmentMock, Object.class, printStream);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(environmentMock).getProperty("spring.banner.location", "banner.txt");
            verify(resourceLoaderMock).getResource("return_of_getProperty1");
            verify(resourceMock).exists();
            verify(resourceMock).getURL();
        });
    }
}
