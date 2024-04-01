package org.springframework.boot.web.embedded.undertow;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.MalformedURLException;

import io.undertow.server.handlers.resource.Resource;
import io.undertow.server.handlers.resource.ResourceChangeListener;
import org.mockito.MockedStatic;

import java.io.File;

import org.springframework.util.StringUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JarResourceManagerSapientGeneratedTest {

	private final ResourceChangeListener resourceChangeListenerMock = mock(ResourceChangeListener.class);

	//Sapient generated method id: ${8bab415e-9488-3a8a-b20c-e3f2b0fcab17}, hash: 0E67C92384C1ABE751E6C8EFAD274F76
	@Test()
	void getResourceWhenResourceGetContentLengthLessThan0() throws IOException, MalformedURLException {
		/* Branches:
		 * (path.startsWith("/")) : true
		 * (StringUtils.hasText(path)) : true
		 * (!"/".equals(path)) : true
		 * (resource.getContentLength() < 0) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: resource
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("/example/path")).thenReturn(true);
			File file = new File("pathname1");
			JarResourceManager target = new JarResourceManager(file);
			//Act Statement(s)
			Resource result = target.getResource("/example/path");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				stringUtils.verify(() -> StringUtils.hasText("/example/path"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${29a2ba44-3d63-39df-8d86-bd477081e5dc}, hash: 61DE289AC504A0DEC61D877F43D82381
	@Disabled()
	@Test()
	void getResourceWhen_NotEqualsPathAndResourceGetContentLengthNotLessThan0() throws IOException, MalformedURLException {
		/* Branches:
		 * (path.startsWith("/")) : false
		 * (StringUtils.hasText(path)) : true
		 * (!"/".equals(path)) : true
		 * (resource.getContentLength() < 0) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: resource
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("")).thenReturn(true);
			File file = new File("pathname1");
			JarResourceManager target = new JarResourceManager(file);
			//Act Statement(s)
			Resource result = target.getResource("");
			//Assert statement(s)
			//TODO: Please implement equals method in URLResource for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				stringUtils.verify(() -> StringUtils.hasText(""), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a11289fc-5808-3dc1-9486-cab3203dc79d}, hash: AE8B4BFF3263E823CFD82196100FA56A
	@Test()
	void isResourceChangeListenerSupportedTest() {
		//Arrange Statement(s)
		File file = new File("pathname1");
		JarResourceManager target = new JarResourceManager(file);
		//Act Statement(s)
		boolean result = target.isResourceChangeListenerSupported();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${2636b3f1-a5b4-3b50-a630-de20e5024e81}, hash: 970747AFBBBD1AD3B81C4B5587B99DBF
	@Test()
	void registerResourceChangeListenerThrowsIllegalArgumentException() {
		//Arrange Statement(s)
		File file = new File("pathname1");
		JarResourceManager target = new JarResourceManager(file);
		//Act Statement(s)
		final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
			target.registerResourceChangeListener(resourceChangeListenerMock);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${cd7bd26f-5fe4-38b0-97da-e84ed1fe469a}, hash: 21FFC74A0EA9578DB42E30755C634C4C
	@Test()
	void removeResourceChangeListenerThrowsIllegalArgumentException() {
		//Arrange Statement(s)
		File file = new File("pathname1");
		JarResourceManager target = new JarResourceManager(file);
		//Act Statement(s)
		final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
			target.removeResourceChangeListener(resourceChangeListenerMock);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
