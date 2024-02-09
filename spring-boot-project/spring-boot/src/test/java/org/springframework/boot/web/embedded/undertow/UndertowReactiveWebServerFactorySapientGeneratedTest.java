package org.springframework.boot.web.embedded.undertow;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.http.server.reactive.HttpHandler;

import java.util.Collection;

import io.undertow.Undertow;

import java.util.function.Supplier;
import java.io.File;

import org.springframework.boot.web.server.WebServer;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UndertowReactiveWebServerFactorySapientGeneratedTest {

	private final HttpHandler httpHandlerMock = mock(HttpHandler.class);

	//Sapient generated method id: ${d46d5ffe-ac1b-340c-99c6-f04fbdea6f2c}
	@Test()
	void setBuilderCustomizersTest() {
		/**
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
		Collection<UndertowBuilderCustomizer> collection = new ArrayList<>();
		//Act Statement(s)
		target.setBuilderCustomizers(collection);
	}

	//Sapient generated method id: ${e106853d-b8ca-3012-b7d5-4abd24417ddf}
	@Test()
	void addBuilderCustomizersTest() {
		/**
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
		UndertowBuilderCustomizer[] undertowBuilderCustomizerArray = new UndertowBuilderCustomizer[] {};
		//Act Statement(s)
		target.addBuilderCustomizers(undertowBuilderCustomizerArray);
	}

	//Sapient generated method id: ${a28334d2-2eb1-3d12-aa0c-d966ca85f0ed}
	@Test()
	void getBuilderCustomizersTest() {
		/**
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
		//Act Statement(s)
		Collection<UndertowBuilderCustomizer> result = target.getBuilderCustomizers();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result.size(), equalTo(0)));
	}

	//Sapient generated method id: ${f172b268-8fbf-3170-8e39-d62826f8d5d7}
	@Test()
	void setBufferSizeTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
		//Act Statement(s)
		target.setBufferSize(1);
	}

	//Sapient generated method id: ${1b05e662-01f2-30f0-a9c9-4e21b8c27f39}
	@Test()
	void setIoThreadsTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
		//Act Statement(s)
		target.setIoThreads(1);
	}

	//Sapient generated method id: ${5bcd1937-eee0-349c-9dc7-034620df5d11}
	@Test()
	void setWorkerThreadsTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
		//Act Statement(s)
		target.setWorkerThreads(1);
	}

	//Sapient generated method id: ${1176e3f2-7739-3264-aaab-02aafa3e629a}
	@Test()
	void setUseDirectBuffersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
		//Act Statement(s)
		target.setUseDirectBuffers(false);
	}

	//Sapient generated method id: ${2a3f1d92-865d-325d-8f92-1c8e19f6921b}
	@Test()
	void setUseForwardHeadersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
		//Act Statement(s)
		target.setUseForwardHeaders(false);
	}

	//Sapient generated method id: ${18adb576-6898-37fd-bbdb-bd911d395a71}
	@Disabled()
	@Test()
	void isUseForwardHeadersWhenThisDelegateIsUseForwardHeaders() {
		/* Branches:
		 * (this.delegate.isUseForwardHeaders()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
		//Act Statement(s)
		boolean result = target.isUseForwardHeaders();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${458037a6-20c6-3473-8bda-e7b29f037c1e}
	@Test()
	void isUseForwardHeadersWhenThisDelegateNotIsUseForwardHeaders() {
		/* Branches:
		 * (this.delegate.isUseForwardHeaders()) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
		//Act Statement(s)
		boolean result = target.isUseForwardHeaders();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${e13048d4-e7c9-3d52-893e-412cb77a5d99}
	@Test()
	void setAccessLogDirectoryTest() {
		/**
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
		File file = new File("pathname1");
		//Act Statement(s)
		target.setAccessLogDirectory(file);
	}

	//Sapient generated method id: ${698682af-4b28-3b59-b885-c0a0fd94847e}
	@Test()
	void setAccessLogPatternTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
		//Act Statement(s)
		target.setAccessLogPattern("A");
	}

	//Sapient generated method id: ${200ab679-980b-3717-82f1-c662caa83f8d}
	@Test()
	void setAccessLogPrefixTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
		//Act Statement(s)
		target.setAccessLogPrefix("A");
	}

	//Sapient generated method id: ${9a002fb7-4a0a-3336-be64-e6ec4e9c09b8}
	@Test()
	void setAccessLogSuffixTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
		//Act Statement(s)
		target.setAccessLogSuffix("A");
	}

	//Sapient generated method id: ${b23bdde4-3c33-3b46-a336-bfb7f14eeb4f}
	@Disabled()
	@Test()
	void isAccessLogEnabledWhenThisDelegateIsAccessLogEnabled() {
		/* Branches:
		 * (this.delegate.isAccessLogEnabled()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
		//Act Statement(s)
		boolean result = target.isAccessLogEnabled();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${979bdcdb-0d6d-30bc-a5ce-8c8708555136}
	@Test()
	void isAccessLogEnabledWhenThisDelegateNotIsAccessLogEnabled() {
		/* Branches:
		 * (this.delegate.isAccessLogEnabled()) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
		//Act Statement(s)
		boolean result = target.isAccessLogEnabled();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${1870ccfc-0c07-3f2a-945d-85d41e58f93c}
	@Test()
	void setAccessLogEnabledTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
		//Act Statement(s)
		target.setAccessLogEnabled(false);
	}

	//Sapient generated method id: ${d79c91a3-f49d-3896-a0bb-b0570f231498}
	@Test()
	void setAccessLogRotateTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
		//Act Statement(s)
		target.setAccessLogRotate(false);
	}

	//Sapient generated method id: ${5f66cbb7-c403-3301-8853-6614ed6f702e}
	@Disabled()
	@Test()
	void getWebServerWhenGetPortGreaterThanOrEqualsTo0() {
		/* Branches:
		 * (getPort() >= 0) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(1);
		//Act Statement(s)
		WebServer result = target.getWebServer(httpHandlerMock);
		UndertowWebServerFactoryDelegate undertowWebServerFactoryDelegate = new UndertowWebServerFactoryDelegate();
		Undertow.Builder builder = undertowWebServerFactoryDelegate.createBuilder(target, (Supplier) null);
		List<HttpHandlerFactory> httpHandlerFactoryList = new ArrayList<>();
		UndertowWebServer undertowWebServer = new UndertowWebServer(builder, httpHandlerFactoryList, false);
		//Assert statement(s)
		//TODO: Please implement equals method in UndertowWebServer for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(undertowWebServer)));
	}

	//Sapient generated method id: ${14758ef4-2182-345e-b8c8-f19fb3b0fe7e}
	@Disabled()
	@Test()
	void getWebServerWhenGetPortLessThan0() {
		/* Branches:
		 * (getPort() >= 0) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(-1);
		//Act Statement(s)
		WebServer result = target.getWebServer(httpHandlerMock);
		UndertowWebServerFactoryDelegate undertowWebServerFactoryDelegate = new UndertowWebServerFactoryDelegate();
		Undertow.Builder builder = undertowWebServerFactoryDelegate.createBuilder(target, (Supplier) null);
		List<HttpHandlerFactory> httpHandlerFactoryList = new ArrayList<>();
		UndertowWebServer undertowWebServer = new UndertowWebServer(builder, httpHandlerFactoryList, false);
		//Assert statement(s)
		//TODO: Please implement equals method in UndertowWebServer for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(undertowWebServer)));
	}
}
