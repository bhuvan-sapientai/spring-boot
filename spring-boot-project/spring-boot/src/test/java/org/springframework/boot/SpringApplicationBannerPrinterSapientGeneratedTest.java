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

import org.apache.commons.logging.Log;

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

	private final ResourceLoader resourceLoaderMock = mock(ResourceLoader.class, "getResource");

	private final Banner bannerMock = mock(Banner.class);

	private final Environment environmentMock = mock(Environment.class, "test");

	private final Resource resourceMock = mock(Resource.class);

	private final URL uRLMock = mock(URL.class);

	//Sapient generated method id: ${152a7342-a9b7-32fa-a34e-21de0af50ac1}, hash: 2507865B20D9A50B9A5D202FB4457CD1
	@Disabled()
	@Test()
	void printWhenTextBannerIsNotNull() throws IOException, UnsupportedEncodingException {
		/* Branches:
		 * (resource.exists()) : true  #  inside getTextBanner method
		 * (!resource.getURL().toExternalForm().contains("liquibase-core")) : true  #  inside getTextBanner method
		 * (textBanner != null) : true  #  inside getBanner method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: banner - Method: printBanner
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(null).when(environmentMock).getProperty("spring.banner.location", "banner.txt");
		doReturn("spring.banner.location").when(environmentMock).getProperty("spring.banner.charset", "UTF-8");
		SpringApplicationBannerPrinter target = new SpringApplicationBannerPrinter(resourceLoaderMock, bannerMock);
		doReturn(resourceMock).when(resourceLoaderMock).getResource((String) null);
		doReturn(true).when(resourceMock).exists();
		doReturn(uRLMock).when(resourceMock).getURL();
		doReturn("A").when(uRLMock).toExternalForm();
		NoOpLog noOpLog = new NoOpLog();
		//Act Statement(s)
		Banner result = target.print(environmentMock, SpringApplicationBannerPrinter.class, (Log) noOpLog);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(environmentMock).getProperty("spring.banner.location", "banner.txt");
			verify(environmentMock).getProperty("spring.banner.charset", "UTF-8");
			verify(resourceLoaderMock).getResource((String) null);
			verify(resourceMock).exists();
			verify(resourceMock).getURL();
			verify(uRLMock).toExternalForm();
		});
	}

	//Sapient generated method id: ${b938d9f8-cf95-320c-9e05-089c29a73c18}, hash: 0DF7FCCE2886AF51BC862D740B48F33A
	@Disabled()
	@Test()
	void printWhenThisFallbackBannerIsNotNull() throws IOException, UnsupportedEncodingException {
		/* Branches:
		 * (resource.exists()) : true  #  inside getTextBanner method
		 * (!resource.getURL().toExternalForm().contains("liquibase-core")) : true  #  inside getTextBanner method
		 * (textBanner != null) : false  #  inside getBanner method
		 * (this.fallbackBanner != null) : true  #  inside getBanner method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Environment environmentMock = mock(Environment.class);
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

	//Sapient generated method id: ${d4f8fa62-3535-3823-a322-780b47c48320}, hash: EC056E20DB61941DAA83F22130FABCD5
	@Disabled()
	@Test()
	void printWhenResourceGetURLToExternalFormContainsLiquibase_coreAndTextBannerIsNullAndThisFallbackBannerIsNull() throws IOException, UnsupportedEncodingException {
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
		Environment environmentMock = mock(Environment.class);
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

	//Sapient generated method id: ${d176d1d9-df2d-3bb7-abf6-0c523793d634}, hash: AB3341DD595D746C9C46C30F90C37B93
	@Test()
	void printWhenCaughtUnsupportedEncodingException() throws IOException, UnsupportedEncodingException {
		/* Branches:
		 * (resource.exists()) : false  #  inside getTextBanner method
		 * (textBanner != null) : false  #  inside getBanner method
		 * (this.fallbackBanner != null) : true  #  inside getBanner method
		 * (catch-exception (UnsupportedEncodingException)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: baos - Method: toString
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Environment environmentMock = mock(Environment.class);
		doReturn("return_of_getProperty1").when(environmentMock).getProperty("spring.banner.location", "banner.txt");
		doReturn("String").when(environmentMock).getProperty("spring.banner.charset", "UTF-8");
		doNothing().when(bannerMock).printBanner(eq(environmentMock), eq(Object.class), (PrintStream) any());
		SpringApplicationBannerPrinter target = new SpringApplicationBannerPrinter(resourceLoaderMock, bannerMock);
		doReturn(resourceMock).when(resourceLoaderMock).getResource("return_of_getProperty1");
		doReturn(false).when(resourceMock).exists();
		NoOpLog noOpLog = new NoOpLog();
		//Act Statement(s)
		Banner result = target.print(environmentMock, Object.class, (Log) noOpLog);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(environmentMock).getProperty("spring.banner.location", "banner.txt");
			verify(environmentMock).getProperty("spring.banner.charset", "UTF-8");
			verify(bannerMock).printBanner(eq(environmentMock), eq(Object.class), (PrintStream) any());
			verify(resourceLoaderMock).getResource("return_of_getProperty1");
			verify(resourceMock).exists();
		});
	}

	//Sapient generated method id: ${62491a20-f60c-39f0-9db0-13b207f89321}, hash: BFAEFB53B51222F6749335C2971C4824
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
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: baos - Method: toString
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(null).when(environmentMock).getProperty("spring.banner.location", "banner.txt");
		doReturn("spring.banner.location").when(environmentMock).getProperty("spring.banner.charset", "UTF-8");
		NoOpLog loggerMock = mock(NoOpLog.class);
		doNothing().when(loggerMock).info("arg0");
		doNothing().when(bannerMock).printBanner(eq(environmentMock), eq(SpringApplicationBannerPrinter.class), (PrintStream) any());
		SpringApplicationBannerPrinter target = new SpringApplicationBannerPrinter(resourceLoaderMock, bannerMock);
		doReturn(resourceMock).when(resourceLoaderMock).getResource((String) null);
		doReturn(false).when(resourceMock).exists();
		//Act Statement(s)
		Banner result = target.print(environmentMock, SpringApplicationBannerPrinter.class, (Log) loggerMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(environmentMock).getProperty("spring.banner.location", "banner.txt");
			verify(environmentMock).getProperty("spring.banner.charset", "UTF-8");
			verify(loggerMock).info("arg0");
			verify(bannerMock).printBanner(eq(environmentMock), eq(SpringApplicationBannerPrinter.class), (PrintStream) any());
			verify(resourceLoaderMock).getResource((String) null);
			verify(resourceMock).exists();
		});
	}

	//Sapient generated method id: ${dc657feb-1b62-37f7-868c-5cea388a8f3f}, hash: 2349E4875CD75FF4CFF66CA609152A52
	@Disabled()
	@Test()
	void print1WhenTextBannerIsNotNull() throws IOException {
		/* Branches:
		 * (resource.exists()) : true  #  inside getTextBanner method
		 * (!resource.getURL().toExternalForm().contains("liquibase-core")) : true  #  inside getTextBanner method
		 * (textBanner != null) : true  #  inside getBanner method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: banner
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Environment environmentMock = mock(Environment.class);
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

	//Sapient generated method id: ${f837de7a-11b4-3182-8c84-43aa82e6a5db}, hash: 0B1B749CD6D1DFE4D0B86F264335F714
	@Disabled()
	@Test()
	void print1WhenThisFallbackBannerIsNotNull() throws IOException {
		/* Branches:
		 * (resource.exists()) : true  #  inside getTextBanner method
		 * (!resource.getURL().toExternalForm().contains("liquibase-core")) : true  #  inside getTextBanner method
		 * (textBanner != null) : false  #  inside getBanner method
		 * (this.fallbackBanner != null) : true  #  inside getBanner method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Environment environmentMock = mock(Environment.class);
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

	//Sapient generated method id: ${797e2f72-1035-3588-b6cf-30d2595b03b6}, hash: C5916762969238A1A6FE620242746AA6
	@Disabled()
	@Test()
	void print1WhenResourceGetURLToExternalFormContainsLiquibase_coreAndTextBannerIsNullAndThisFallbackBannerIsNull() throws IOException {
		/* Branches:
		 * (resource.exists()) : true  #  inside getTextBanner method
		 * (!resource.getURL().toExternalForm().contains("liquibase-core")) : false  #  inside getTextBanner method
		 * (textBanner != null) : false  #  inside getBanner method
		 * (this.fallbackBanner != null) : false  #  inside getBanner method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: banner
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Environment environmentMock = mock(Environment.class);
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

	//Sapient generated method id: ${8ef5ded1-227a-3226-8231-c87af47c5749}, hash: 98F28C6B5C631E070B8C0AB8DA300EE2
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
		Environment environmentMock = mock(Environment.class);
		doReturn("return_of_getProperty1").when(environmentMock).getProperty("spring.banner.location", "banner.txt");
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		PrintStream printStream = new PrintStream(byteArrayOutputStream);
		doNothing().when(bannerMock).printBanner(environmentMock, Object.class, printStream);
		SpringApplicationBannerPrinter target = new SpringApplicationBannerPrinter(resourceLoaderMock, bannerMock);
		doReturn(resourceMock).when(resourceLoaderMock).getResource("return_of_getProperty1");
		doReturn(false).when(resourceMock).exists();
		//Act Statement(s)
		Banner result = target.print(environmentMock, Object.class, printStream);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(environmentMock).getProperty("spring.banner.location", "banner.txt");
			verify(bannerMock).printBanner(environmentMock, Object.class, printStream);
			verify(resourceLoaderMock).getResource("return_of_getProperty1");
			verify(resourceMock).exists();
		});
	}
}
