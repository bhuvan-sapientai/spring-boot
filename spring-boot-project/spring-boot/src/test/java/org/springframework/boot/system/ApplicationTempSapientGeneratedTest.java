package org.springframework.boot.system;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.security.NoSuchAlgorithmException;
import java.io.IOException;

import org.mockito.stubbing.Answer;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.util.StringUtils;
import org.springframework.util.Assert;

import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.io.File;
import java.nio.file.attribute.FileAttribute;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.spy;
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
class ApplicationTempSapientGeneratedTest {

	//Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
	@Disabled()
	@Test()
	void toStringTest() throws Exception {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ApplicationTemp target = spy(new ApplicationTemp(Object.class));
		File file = new File("pathname1");
		doReturn(file).when(target).getDir();
		//Act Statement(s)
		String result = target.toString();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("result1"));
			verify(target).getDir();
		});
	}

	//Sapient generated method id: ${aaf5659d-e049-3014-9017-614ee1dda133}
	@Test()
	void getDirWhenCaughtExceptionThrowsIllegalStateException() throws NoSuchAlgorithmException {
		/* Branches:
		 * (this.path == null) : true  #  inside getPath method
		 * (this.path == null) : true  #  inside getPath method
		 * (source != null) : true  #  inside update method
		 * (source instanceof File file) : true  #  inside getUpdateSourceBytes method
		 * (catch-exception (Exception)) : true  #  inside generateHash method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<MessageDigest> messageDigest = mockStatic(MessageDigest.class)) {
			MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-1");
			messageDigest.when(() -> MessageDigest.getInstance("SHA-1")).thenReturn(messageDigest2);
			ApplicationTemp target = new ApplicationTemp(Object.class);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.getDir();
			});
			Exception exception = new Exception();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getCause(), is(instanceOf(exception.getClass())));
				messageDigest.verify(() -> MessageDigest.getInstance("SHA-1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a91bd8d0-de31-30b0-96dd-9a4b52db88fa}
	@Disabled()
	@Test()
	void getDirWhenFileSystemSupportedFileAttributeViewsContainsPosix() throws Exception {
		/* Branches:
		 * (this.path == null) : true  #  inside getPath method
		 * (this.path == null) : true  #  inside getPath method
		 * (source != null) : true  #  inside update method
		 * (source instanceof File file) : true  #  inside getUpdateSourceBytes method
		 * (!Files.exists(path)) : true  #  inside createDirectory method
		 * (!fileSystem.supportedFileAttributeViews().contains("posix")) : false  #  inside getFileAttributes method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(true, "No 'java.io.tmpdir' property set")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			ApplicationTemp target = new ApplicationTemp(Object.class);
			//Act Statement(s)
			File result = target.getDir();
			String[] stringArray = new String[] {};
			Path path = Paths.get("E", stringArray);
			Path path2 = path.resolve("CF227A74CBB3471A6228495F554CA05042C3D3BB");
			File file = path2.toFile();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(file));
				_assert.verify(() -> Assert.state(true, "No 'java.io.tmpdir' property set"), atLeast(1));
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()), atLeast(2));
			});
		}
	}

	//Sapient generated method id: ${365406e5-8915-3934-abba-eb572554d3b2}
	@Disabled()
	@Test()
	void getDirWhenCaughtIOExceptionThrowsIllegalStateException() throws IOException {
		/* Branches:
		 * (this.path == null) : true  #  inside getPath method
		 * (this.path == null) : true  #  inside getPath method
		 * (source != null) : false  #  inside update method
		 * (!Files.exists(path)) : true  #  inside createDirectory method
		 * (!fileSystem.supportedFileAttributeViews().contains("posix")) : true  #  inside getFileAttributes method
		 * (catch-exception (IOException)) : true  #  inside createDirectory method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Files> files = mockStatic(Files.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(true, "No 'java.io.tmpdir' property set")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			FileAttribute[] fileAttributeArray = new FileAttribute[] {};
			//TODO: Needs to return real value
			files.when(() -> Files.createDirectory((Path) any(), eq(fileAttributeArray))).thenReturn(null);
			ApplicationTemp target = new ApplicationTemp(Object.class);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.getDir();
			});
			IOException iOException = new IOException();
			IllegalStateException illegalStateException = new IllegalStateException("Unable to create application temp directory getPath_path1", iOException);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
				_assert.verify(() -> Assert.state(true, "No 'java.io.tmpdir' property set"), atLeast(1));
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()), atLeast(2));
				files.verify(() -> Files.createDirectory((Path) any(), eq(fileAttributeArray)));
			});
		}
	}

	//Sapient generated method id: ${144b838a-c048-3694-b392-f38e695b5df2}
	@Test()
	void getDir1WhenCaughtExceptionThrowsIllegalStateException() throws NoSuchAlgorithmException {
		/* Branches:
		 * (this.path == null) : true  #  inside getPath method
		 * (this.path == null) : true  #  inside getPath method
		 * (source != null) : true  #  inside update method
		 * (source instanceof File file) : true  #  inside getUpdateSourceBytes method
		 * (catch-exception (Exception)) : true  #  inside generateHash method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<MessageDigest> messageDigest = mockStatic(MessageDigest.class)) {
			MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-1");
			messageDigest.when(() -> MessageDigest.getInstance("SHA-1")).thenReturn(messageDigest2);
			ApplicationTemp target = new ApplicationTemp(Object.class);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.getDir("subDir1");
			});
			Exception exception = new Exception();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getCause(), is(instanceOf(exception.getClass())));
				messageDigest.verify(() -> MessageDigest.getInstance("SHA-1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${5adca7e0-07e6-34d2-bbf0-944f11373da7}
	@Disabled()
	@Test()
	void getDir1WhenFileSystemSupportedFileAttributeViewsNotContainsPosix() throws Exception {
		/* Branches:
		 * (this.path == null) : true  #  inside getPath method
		 * (this.path == null) : true  #  inside getPath method
		 * (source != null) : true  #  inside update method
		 * (source instanceof File file) : true  #  inside getUpdateSourceBytes method
		 * (!Files.exists(path)) : true  #  inside createDirectory method
		 * (!fileSystem.supportedFileAttributeViews().contains("posix")) : true  #  inside getFileAttributes method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(true, "No 'java.io.tmpdir' property set")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			ApplicationTemp target = new ApplicationTemp(Object.class);
			//Act Statement(s)
			File result = target.getDir("");
			String[] stringArray = new String[] {};
			Path path = Paths.get("I", stringArray);
			Path path2 = path.resolve("BC83D506D801D15C24FA977D5EB9E3F48202F98E");
			Path path3 = path2.resolve("");
			File file = path3.toFile();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(file));
				_assert.verify(() -> Assert.state(true, "No 'java.io.tmpdir' property set"), atLeast(1));
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()), atLeast(2));
			});
		}
	}

	//Sapient generated method id: ${d4382e51-e37d-3868-b084-f5702797f523}
	@Disabled()
	@Test()
	void getDir1WhenSourceInstanceOfFileAndFilesNotExistsPathAndFileSystemSupportedFileAttributeViewsNotContainsPosix() throws Exception {
		/* Branches:
		 * (this.path == null) : true  #  inside getPath method
		 * (this.path == null) : true  #  inside getPath method
		 * (source != null) : true  #  inside update method
		 * (source instanceof File file) : true  #  inside getUpdateSourceBytes method
		 * (!Files.exists(path)) : true  #  inside createDirectory method
		 * (!fileSystem.supportedFileAttributeViews().contains("posix")) : true  #  inside getFileAttributes method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(true, "No 'java.io.tmpdir' property set")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			ApplicationTemp target = new ApplicationTemp(Object.class);
			//Act Statement(s)
			File result = target.getDir("");
			String[] stringArray = new String[] {};
			Path path = Paths.get("G", stringArray);
			Path path2 = path.resolve("A88CE17D33BCAEDC363F99B4D79F1DCC6CC3E310");
			Path path3 = path2.resolve("");
			File file = path3.toFile();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(file));
				_assert.verify(() -> Assert.state(true, "No 'java.io.tmpdir' property set"), atLeast(1));
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()), atLeast(2));
			});
		}
	}

	//Sapient generated method id: ${c6bb1315-9c72-3012-9a23-b463a8cf9fbc}
	@Disabled()
	@Test()
	void getDir1WhenFileSystemSupportedFileAttributeViewsContainsPosix() throws Exception {
		/* Branches:
		 * (this.path == null) : true  #  inside getPath method
		 * (this.path == null) : true  #  inside getPath method
		 * (source != null) : true  #  inside update method
		 * (source instanceof File file) : true  #  inside getUpdateSourceBytes method
		 * (!Files.exists(path)) : true  #  inside createDirectory method
		 * (!fileSystem.supportedFileAttributeViews().contains("posix")) : false  #  inside getFileAttributes method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(true, "No 'java.io.tmpdir' property set")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			ApplicationTemp target = new ApplicationTemp(Object.class);
			//Act Statement(s)
			File result = target.getDir("I");
			String[] stringArray = new String[] {};
			Path path = Paths.get("G", stringArray);
			Path path2 = path.resolve("A88CE17D33BCAEDC363F99B4D79F1DCC6CC3E310");
			Path path3 = path2.resolve("I");
			File file = path3.toFile();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(file));
				_assert.verify(() -> Assert.state(true, "No 'java.io.tmpdir' property set"), atLeast(1));
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()), atLeast(2));
			});
		}
	}

	//Sapient generated method id: ${56bfa480-c409-32db-96d8-5e8e3d83f1c1}
	@Disabled()
	@Test()
	void getDir1WhenCaughtIOExceptionThrowsIllegalStateException() throws IOException {
		/* Branches:
		 * (this.path == null) : true  #  inside getPath method
		 * (this.path == null) : true  #  inside getPath method
		 * (source != null) : false  #  inside update method
		 * (!Files.exists(path)) : true  #  inside createDirectory method
		 * (!fileSystem.supportedFileAttributeViews().contains("posix")) : true  #  inside getFileAttributes method
		 * (catch-exception (IOException)) : true  #  inside createDirectory method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Files> files = mockStatic(Files.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(true, "No 'java.io.tmpdir' property set")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			FileAttribute[] fileAttributeArray = new FileAttribute[] {};
			//TODO: Needs to return real value
			files.when(() -> Files.createDirectory((Path) any(), eq(fileAttributeArray))).thenReturn(null);
			ApplicationTemp target = new ApplicationTemp(Object.class);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.getDir("subDir1");
			});
			IOException iOException = new IOException();
			IllegalStateException illegalStateException = new IllegalStateException("Unable to create application temp directory getPath_path1", iOException);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
				_assert.verify(() -> Assert.state(true, "No 'java.io.tmpdir' property set"), atLeast(1));
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()), atLeast(2));
				files.verify(() -> Files.createDirectory((Path) any(), eq(fileAttributeArray)));
			});
		}
	}

	//Sapient generated method id: ${c9123d5e-c2b4-3397-9d12-afdcce97011e}
	@Disabled()
	@Test()
	void getDir1WhenFileSystemSupportedFileAttributeViewsNotContainsPosixAndCaughtIOExceptionThrowsIllegalStateException() throws IOException {
		/* Branches:
		 * (this.path == null) : true  #  inside getPath method
		 * (this.path == null) : true  #  inside getPath method
		 * (source != null) : false  #  inside update method
		 * (!Files.exists(path)) : false  #  inside createDirectory method
		 * (!fileSystem.supportedFileAttributeViews().contains("posix")) : true  #  inside getFileAttributes method
		 * (catch-exception (IOException)) : true  #  inside createDirectory method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Files> files = mockStatic(Files.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(true, "No 'java.io.tmpdir' property set")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			FileAttribute[] fileAttributeArray = new FileAttribute[] {};
			//TODO: Needs to return real value
			files.when(() -> Files.createDirectory((Path) any(), eq(fileAttributeArray))).thenReturn(null);
			ApplicationTemp target = new ApplicationTemp(Object.class);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.getDir("B");
			});
			IOException iOException = new IOException();
			IllegalStateException illegalStateException = new IllegalStateException("Unable to create application temp directory getDir_path1", iOException);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
				_assert.verify(() -> Assert.state(true, "No 'java.io.tmpdir' property set"), atLeast(1));
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()), atLeast(2));
				files.verify(() -> Files.createDirectory((Path) any(), eq(fileAttributeArray)));
			});
		}
	}
}
