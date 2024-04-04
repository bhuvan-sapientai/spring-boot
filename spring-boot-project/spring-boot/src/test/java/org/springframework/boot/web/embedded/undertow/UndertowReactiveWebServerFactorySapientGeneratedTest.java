package org.springframework.boot.web.embedded.undertow;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.http.server.reactive.HttpHandler;

import java.util.Collection;
import java.io.File;

import org.springframework.boot.web.server.WebServer;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UndertowReactiveWebServerFactorySapientGeneratedTest {

	private final HttpHandler httpHandlerMock = mock(HttpHandler.class);

	//Sapient generated method id: ${d46d5ffe-ac1b-340c-99c6-f04fbdea6f2c}, hash: D2D26D2886A3CED788135A02B36614FD
	@Test()
	void setBuilderCustomizersTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
		Collection<UndertowBuilderCustomizer> collection = new ArrayList<>();

		//Act Statement(s)
		target.setBuilderCustomizers(collection);
	}

	//Sapient generated method id: ${e106853d-b8ca-3012-b7d5-4abd24417ddf}, hash: D7D16C5BEC69A98E87CC187EB5CEFF82
	@Test()
	void addBuilderCustomizersTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
		UndertowBuilderCustomizer[] undertowBuilderCustomizerArray = new UndertowBuilderCustomizer[] {};

		//Act Statement(s)
		target.addBuilderCustomizers(undertowBuilderCustomizerArray);
	}

	//Sapient generated method id: ${a28334d2-2eb1-3d12-aa0c-d966ca85f0ed}, hash: 2D761AC2C34DE4E7CEEDE0C8F1B2A1CF
	@Test()
	void getBuilderCustomizersTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);

		//Act Statement(s)
		Collection<UndertowBuilderCustomizer> result = target.getBuilderCustomizers();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result.size(), equalTo(0)));
	}

	//Sapient generated method id: ${f172b268-8fbf-3170-8e39-d62826f8d5d7}, hash: 927F1C25A0477E849A6FCCFE168007FC
	@Test()
	void setBufferSizeTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(8080);

		//Act Statement(s)
		target.setBufferSize(1024);
	}

	//Sapient generated method id: ${1b05e662-01f2-30f0-a9c9-4e21b8c27f39}, hash: F9BAEAEEE6A6D650E90E54B5D25174BA
	@Test()
	void setIoThreadsTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(8080);

		//Act Statement(s)
		target.setIoThreads(4);
	}

	//Sapient generated method id: ${5bcd1937-eee0-349c-9dc7-034620df5d11}, hash: 54196231121C65DD877C612B3A69AE10
	@Test()
	void setWorkerThreadsTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(8080);

		//Act Statement(s)
		target.setWorkerThreads(4);
	}

	//Sapient generated method id: ${1176e3f2-7739-3264-aaab-02aafa3e629a}, hash: 62E7D5D2BF83515F7FD809B18CFB6B7E
	@Test()
	void setUseDirectBuffersTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(8080);

		//Act Statement(s)
		target.setUseDirectBuffers(true);
	}

	//Sapient generated method id: ${2a3f1d92-865d-325d-8f92-1c8e19f6921b}, hash: A58384743B86E95ECF968B3B3161C536
	@Test()
	void setUseForwardHeadersTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(8080);

		//Act Statement(s)
		target.setUseForwardHeaders(true);
	}

	//Sapient generated method id: ${18adb576-6898-37fd-bbdb-bd911d395a71}, hash: AACF271C3EDC62DE22B5EFECB348B941
	@Test()
	void isUseForwardHeadersWhenThisDelegateIsUseForwardHeaders() {
		/* Branches:
		 * (this.delegate.isUseForwardHeaders()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);

		//Act Statement(s)
		boolean result = target.isUseForwardHeaders();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${458037a6-20c6-3473-8bda-e7b29f037c1e}, hash: 630C7BA86CB9C79B939C1E413E04B6E5
	@Test()
	void isUseForwardHeadersWhenThisDelegateNotIsUseForwardHeaders() {
		/* Branches:
		 * (this.delegate.isUseForwardHeaders()) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);

		//Act Statement(s)
		boolean result = target.isUseForwardHeaders();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${e13048d4-e7c9-3d52-893e-412cb77a5d99}, hash: E156A301879C63B687D04353F76345EF
	@Test()
	void setAccessLogDirectoryTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);
		File file = new File("pathname1");

		//Act Statement(s)
		target.setAccessLogDirectory(file);
	}

	//Sapient generated method id: ${698682af-4b28-3b59-b885-c0a0fd94847e}, hash: 3D11040788C0EEE8B059744D569C7B5A
	@Test()
	void setAccessLogPatternTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);

		//Act Statement(s)
		target.setAccessLogPattern("A");
	}

	//Sapient generated method id: ${200ab679-980b-3717-82f1-c662caa83f8d}, hash: 1EDD6DCBEF65AA71CA7E59A86650BAD2
	@Test()
	void setAccessLogPrefixTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);

		//Act Statement(s)
		target.setAccessLogPrefix("<value>");
	}

	//Sapient generated method id: ${9a002fb7-4a0a-3336-be64-e6ec4e9c09b8}, hash: E7C7F9AFB4F5BB4B989551D57A333708
	@Test()
	void setAccessLogSuffixTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);

		//Act Statement(s)
		target.setAccessLogSuffix("<value>");
	}

	//Sapient generated method id: ${b23bdde4-3c33-3b46-a336-bfb7f14eeb4f}, hash: 0013B53EF66B9ACF27ED7DB0D543E4B9
	@Test()
	void isAccessLogEnabledWhenThisDelegateIsAccessLogEnabled() {
		/* Branches:
		 * (this.delegate.isAccessLogEnabled()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);

		//Act Statement(s)
		boolean result = target.isAccessLogEnabled();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${979bdcdb-0d6d-30bc-a5ce-8c8708555136}, hash: ACBD8D082BE90C5FBDA7C9348E4139B5
	@Test()
	void isAccessLogEnabledWhenThisDelegateNotIsAccessLogEnabled() {
		/* Branches:
		 * (this.delegate.isAccessLogEnabled()) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(0);

		//Act Statement(s)
		boolean result = target.isAccessLogEnabled();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${1870ccfc-0c07-3f2a-945d-85d41e58f93c}, hash: C1DF602B555F6A48D696FBC9BF4AC181
	@Test()
	void setAccessLogEnabledTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(8080);

		//Act Statement(s)
		target.setAccessLogEnabled(true);
	}

	//Sapient generated method id: ${d79c91a3-f49d-3896-a0bb-b0570f231498}, hash: 217D5DC60977481339C43B60321D5F68
	@Test()
	void setAccessLogRotateTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(8080);

		//Act Statement(s)
		target.setAccessLogRotate(true);
	}

	//Sapient generated method id: ${5f66cbb7-c403-3301-8853-6614ed6f702e}, hash: CD480A6074D6B48976C28D11914B6FCC
	@Test()
	void getWebServerWhenGetPortGreaterThanOrEqualsTo0() {
		/* Branches:
		 * (getPort() >= 0) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(1);

		//Act Statement(s)
		WebServer result = target.getWebServer(httpHandlerMock);

		//Assert statement(s)
		//TODO: Please implement equals method in UndertowWebServer for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${14758ef4-2182-345e-b8c8-f19fb3b0fe7e}, hash: 6669B05A2FE41E6A701C5EEBFEBABA4B
	@Test()
	void getWebServerWhenGetPortLessThan0() {
		/* Branches:
		 * (getPort() >= 0) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UndertowReactiveWebServerFactory target = new UndertowReactiveWebServerFactory(-1);

		//Act Statement(s)
		WebServer result = target.getWebServer(httpHandlerMock);

		//Assert statement(s)
		//TODO: Please implement equals method in UndertowWebServer for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
