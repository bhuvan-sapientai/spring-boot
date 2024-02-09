package org.springframework.boot.web.embedded.tomcat;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.catalina.LifecycleException;

import java.io.IOException;

import org.mockito.stubbing.Answer;

import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

import org.apache.catalina.WebResource;

import org.springframework.util.Assert;

import org.apache.catalina.webresources.JarResource;

import org.springframework.util.ResourceUtils;

import org.apache.catalina.WebResourceRoot;

import java.util.function.Supplier;
import java.net.URL;

import org.mockito.MockedStatic;
import org.apache.catalina.LifecycleState;

import java.net.JarURLConnection;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class NestedJarResourceSetSapientGeneratedTest {

	private final WebResourceRoot webResourceRootMock = mock(WebResourceRoot.class);

	//Sapient generated method id: ${716d21e6-a292-3dc4-ab4d-06a9bb385c4f}
	@Disabled()
	@Test()
	void createArchiveResourceTest() throws IllegalArgumentException {
		//Arrange Statement(s)
		doReturn(LifecycleState.NEW).when(webResourceRootMock).getState();
		NestedJarResourceSet target = new NestedJarResourceSet((URL) null, webResourceRootMock, "/", "/");
		JarEntry jarEntry = new JarEntry("name1");
		Manifest manifest = new Manifest();
		//Act Statement(s)
		WebResource result = target.createArchiveResource(jarEntry, "webAppPath1", manifest);
		JarResource jarResource = new JarResource(target, "webAppPath1", (String) null, jarEntry);
		//Assert statement(s)
		//TODO: Please implement equals method in JarResource for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, equalTo(jarResource));
			verify(webResourceRootMock).getState();
		});
	}

	//Sapient generated method id: ${f5ecafaa-8b62-38a4-9f8b-aee2873744ab}
	@Disabled()
	@Test()
	void initInternalWhenConnectionNotGetUseCaches() throws LifecycleException, IllegalArgumentException, IOException {
		/* Branches:
		 * (!connection.getUseCaches()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class)) {
			doReturn(LifecycleState.NEW).when(webResourceRootMock).getState();
			resourceUtils.when(() -> ResourceUtils.useCachesIfNecessary((JarURLConnection) null)).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			NestedJarResourceSet target = new NestedJarResourceSet((URL) null, webResourceRootMock, "/", "/");
			//Act Statement(s)
			target.initInternal();
			//Assert statement(s)
			assertAll("result", () -> {
				verify(webResourceRootMock).getState();
				resourceUtils.verify(() -> ResourceUtils.useCachesIfNecessary((JarURLConnection) null), atLeast(1));
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${3bed53a2-d81a-3d1a-b5ea-a7ee52853e2e}
	@Disabled()
	@Test()
	void initInternalWhenConnectionGetUseCaches() throws LifecycleException, IllegalArgumentException, IOException {
		/* Branches:
		 * (!connection.getUseCaches()) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class)) {
			doReturn(LifecycleState.NEW).when(webResourceRootMock).getState();
			resourceUtils.when(() -> ResourceUtils.useCachesIfNecessary((JarURLConnection) null)).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			NestedJarResourceSet target = new NestedJarResourceSet((URL) null, webResourceRootMock, "/", "/");
			//Act Statement(s)
			target.initInternal();
			//Assert statement(s)
			assertAll("result", () -> {
				verify(webResourceRootMock).getState();
				resourceUtils.verify(() -> ResourceUtils.useCachesIfNecessary((JarURLConnection) null), atLeast(1));
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${2d9db415-9c00-36bc-a7ae-c61ac35ebe2f}
	@Disabled()
	@Test()
	void initInternalWhenCaughtIOExceptionThrowsIllegalStateException() throws LifecycleException, IOException, IllegalArgumentException {
		/* Branches:
		 * (!connection.getUseCaches()) : true
		 * (catch-exception (IOException)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class)) {
			doReturn(LifecycleState.NEW).when(webResourceRootMock).getState();
			resourceUtils.when(() -> ResourceUtils.useCachesIfNecessary((JarURLConnection) null)).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			NestedJarResourceSet target = new NestedJarResourceSet((URL) null, webResourceRootMock, "/", "/");
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.initInternal();
			});
			IOException iOException = new IOException();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
				verify(webResourceRootMock).getState();
				resourceUtils.verify(() -> ResourceUtils.useCachesIfNecessary((JarURLConnection) null), atLeast(1));
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${67d7a27f-44d0-362c-bb9b-9969eb058255}
	@Disabled()
	@Test()
	void openJarFileWhenThisArchiveIsNull() throws IOException, IllegalArgumentException {
		/* Branches:
		 * (this.archive == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class)) {
			doReturn(LifecycleState.NEW).when(webResourceRootMock).getState();
			resourceUtils.when(() -> ResourceUtils.useCachesIfNecessary((JarURLConnection) null)).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			NestedJarResourceSet target = new NestedJarResourceSet((URL) null, webResourceRootMock, "/", "/");
			//Act Statement(s)
			JarFile result = target.openJarFile();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(webResourceRootMock).getState();
				resourceUtils.verify(() -> ResourceUtils.useCachesIfNecessary((JarURLConnection) null), atLeast(1));
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${359c3787-6371-3fcb-b72e-6abe2ae225b0}
	@Test()
	void closeJarFileTest() throws IllegalArgumentException {
		//Arrange Statement(s)
		doReturn(LifecycleState.NEW).when(webResourceRootMock).getState();
		NestedJarResourceSet target = new NestedJarResourceSet((URL) null, webResourceRootMock, "/", "/");
		//Act Statement(s)
		target.closeJarFile();
		//Assert statement(s)
		assertAll("result", () -> verify(webResourceRootMock).getState());
	}

	//Sapient generated method id: ${ecb224b5-903e-3826-858f-076eac279298}
	@Test()
	void isMultiReleaseWhenAttributesIsNull() throws IllegalArgumentException {
		/* Branches:
		 * (this.multiRelease == null) : true
		 * (this.multiRelease == null) : true
		 * (manifest != null) : false
		 * (attributes != null) : false
		 */
		//Arrange Statement(s)
		doReturn(LifecycleState.NEW).when(webResourceRootMock).getState();
		NestedJarResourceSet target = new NestedJarResourceSet((URL) null, webResourceRootMock, "/", "/");
		//Act Statement(s)
		boolean result = target.isMultiRelease();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(webResourceRootMock).getState();
		});
	}

	//Sapient generated method id: ${99c48c65-4bff-375a-a41c-250b64200600}
	@Test()
	void gcWhenThisArchiveIsNull() throws IllegalArgumentException, IOException {
		/* Branches:
		 * (this.archive != null) : false
		 */
		//Arrange Statement(s)
		doReturn(LifecycleState.NEW).when(webResourceRootMock).getState();
		NestedJarResourceSet target = new NestedJarResourceSet((URL) null, webResourceRootMock, "/", "/");
		//Act Statement(s)
		target.gc();
		//Assert statement(s)
		assertAll("result", () -> verify(webResourceRootMock).getState());
	}
}
